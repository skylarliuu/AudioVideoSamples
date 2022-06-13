package com.skylar.av.lame

class NativeLib {

    /**
     * A native method that is implemented by the 'lame' native library,
     * which is packaged with this application.
     */
    external fun stringFromJNI(): String

    companion object {
        // Used to load the 'lame' library on application startup.
        init {
            System.loadLibrary("lame")
        }
    }
}