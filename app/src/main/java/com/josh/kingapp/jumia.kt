package com.josh.kingapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler

class jumia : AppCompatActivity() {
    internal val TIME_OUT = 1000L
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_jumia)
        Handler().postDelayed({
            startActivity(Intent(this@jumia,jumiahome::class.java))
            finish()
        },TIME_OUT.toLong())
    }
}