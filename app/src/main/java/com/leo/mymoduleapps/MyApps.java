package com.leo.mymoduleapps;

import android.util.Log;

import com.leo.basemodule.ApplicationImpl;
import com.leo.basemodule.BaseApplication;

public class MyApps implements ApplicationImpl {
    @Override
    public void onCreate(BaseApplication application) {
        Log.i("log_debug", "MyApps");
//        initRouter(this);
    }

//    private void initRouter(MyApps myApplication) {
//        if (BuildConfig.DEBUG) {
//            ARouter.openLog();     // 打印日志
//            ARouter.openDebug();   // 开启调试模式(如果在InstantRun模式下运行，必须开启调试模式！线上版本需要关闭,否则有安全风险)
//        }
//        ARouter.init(myApplication);
//    }
}