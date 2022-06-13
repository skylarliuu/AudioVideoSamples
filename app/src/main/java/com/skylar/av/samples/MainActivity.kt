package com.skylar.av.samples

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.skylar.av.fdkaac.FDKAACEncodeActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onFDKAACEncode(view: View) {
        startActivity(Intent(this, FDKAACEncodeActivity::class.java))
    }
}