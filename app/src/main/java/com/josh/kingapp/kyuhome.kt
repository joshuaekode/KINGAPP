package com.josh.kingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient

class kyuhome : AppCompatActivity() {
    private val wview: WebView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kyuhome)
        title = "KYABOMGO STUDENTS PORTAL"
        val wview = findViewById<WebView>(R.id.webkyu)
        wview.webViewClient= WebViewClient()
        //webviewClient is the object responsible for most the actions inside
        val webSettings = wview.settings
        wview.settings.javaScriptEnabled
        wview.settings.allowContentAccess=true
        wview.settings.useWideViewPort=true
        wview.settings.domStorageEnabled=true
        wview.settings.javaScriptCanOpenWindowsAutomatically=true
        wview.loadUrl("https://myportal.kyu.ac.ug")

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