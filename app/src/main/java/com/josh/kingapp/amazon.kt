package com.josh.kingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class amazon : AppCompatActivity() {
    internal val TIME_OUT = 1000L
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_amazon)
        Handler().postDelayed({
            startActivity(Intent(this@amazon,amazonhome::class.java))
            finish()
        },TIME_OUT.toLong())
    }
}