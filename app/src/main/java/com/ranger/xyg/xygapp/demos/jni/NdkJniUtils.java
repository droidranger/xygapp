package com.ranger.xyg.xygapp.demos.jni;

/**
 * Created by xyg on 2017/8/7.
 */

public class NdkJniUtils {

    static {
        System.loadLibrary("xygJni");
    }

    public native String getSampleName();
}
