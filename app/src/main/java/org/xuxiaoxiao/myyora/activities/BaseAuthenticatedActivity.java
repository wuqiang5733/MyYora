package org.xuxiaoxiao.myyora.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by WuQiang on 2017/1/5.
 */

public abstract class BaseAuthenticatedActivity extends BaseActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (!application.getAuth().getUser().isLoggedIn()){
            startActivity(new Intent(this,LoginActivity.class));
            finish();
            return;
        }
        onYoraCreate(savedInstanceState);
    }
    protected abstract void onYoraCreate(Bundle savedInstanceState);
}
