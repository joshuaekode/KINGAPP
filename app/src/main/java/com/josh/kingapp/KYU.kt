package com.josh.kingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class KYU : AppCompatActivity() {
    internal val TIME_OUT = 1000L
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kyu)
        Handler().postDelayed({
            startActivity(Intent(this@KYU,kyuhome::class.java))
            finish()
        },TIME_OUT.toLong())

    }
}