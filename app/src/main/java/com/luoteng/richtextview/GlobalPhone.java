package com.luoteng.richtextview;

import android.app.Application;

/**
 * @author CentMeng csdn@vip.163.com on 15/9/8.
 */
public class GlobalPhone extends Application {

    private static GlobalPhone instance;


    public static GlobalPhone getInstance() {
        if (instance == null) {
            instance = new GlobalPhone();
        }
        return instance;
    }


    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;

    }


    @Override
    public void onLowMemory() {
        super.onLowMemory();
    }


}
