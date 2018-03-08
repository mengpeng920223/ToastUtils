package com.mengpeng.toastutils;

import android.app.Application;
import android.content.Context;

/**
 * 作者：MengPeng
 * 时间：2018/3/8 - 下午3:24
 * 说明：
 */
public class MyApplication extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();

        context = this;

        ToastUtils.getInstance().initToast(this);

    }

    public static Context getContext() {
        return context;
    }
}
