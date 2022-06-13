package com.skylar.av.fdkaac;

public class FDKAACEncoder {

    // Used to load the 'fdkaac' library on application startup.
    static {
        System.loadLibrary("fdkaac");
    }

    /**
     * A native method that is implemented by the 'fdkaac' native library,
     * which is packaged with this application.
     */
    public native String stringFromJNI();
}