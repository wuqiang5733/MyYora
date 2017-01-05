package org.xuxiaoxiao.myyora.fragments;

//import android.app.Fragment;  // 调用这个版本 onAttach 不执行
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.util.Log;

import org.xuxiaoxiao.myyora.infrastructure.YoraApplication;

public abstract class BaseFragment extends Fragment {
    protected YoraApplication application;
    public String tag ;

    @Override
    //  Fragment 的 onCreate 是 public 的
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        tag = getClass().getSimpleName();
        Log.i(tag,"-- onCreate");
        application = (YoraApplication) getActivity().getApplication();
    }
}