package com.josh.kingapp

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView

class home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)
        val button = findViewById<ImageView>(R.id.jum)
        button.setOnClickListener {
            val i = Intent(this, jumia::class.java)
            startActivity(i)
        }
        val butto = findViewById<ImageView>(R.id.bbc)
        butto.setOnClickListener {
            val i = Intent(this, BBC::class.java)
            startActivity(i)
        }
        val butt = findViewById<ImageView>(R.id.amazon)
        butt.setOnClickListener {
            val i = Intent(this, amazon::class.java)
            startActivity(i)

        }
        val but = findViewById<ImageView>(R.id.kyu)
        but.setOnClickListener {
            val i = Intent(this, KYU::class.java)
            startActivity(i)
        }
    }
}