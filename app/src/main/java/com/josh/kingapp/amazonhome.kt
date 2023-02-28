package com.josh.kingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class amazonhome : AppCompatActivity() {
    private val wview:WebView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_amazonhome)
        title = "AMAZON"
        val wview = findViewById<WebView>(R.id.webamzon)
        wview.webViewClient= WebViewClient()
        val webSettings = wview.settings
        wview.settings.javaScriptEnabled
        wview.settings.allowContentAccess=true
        wview.settings.useWideViewPort=true
        wview.settings.domStorageEnabled=true
        wview.loadUrl("https://www.amazon.com")

    }

    override fun onBackPressed() {
        if (wview!!.canGoBack()){
            wview.goBack()
            //this method specifies the Webview has a back history item.
        }else{
            super.onBackPressed()
        }
    }
}