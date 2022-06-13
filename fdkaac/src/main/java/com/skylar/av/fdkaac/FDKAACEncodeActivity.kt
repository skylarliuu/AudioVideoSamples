package com.skylar.av.fdkaac

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class FDKAACEncodeActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fdkaac_encode)

        findViewById<TextView>(R.id.text).text = FDKAACEncoder().stringFromJNI()
    }
}