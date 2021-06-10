package com.kewinplewa.androidportfolio

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.KeyEvent
import android.view.MotionEvent
import android.view.View
import android.webkit.WebView
import android.webkit.WebViewClient

class GoogleMaps : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_google_maps)

        //support actionbar
        val actionbar = supportActionBar
        actionbar!!.setBackgroundDrawable(ColorDrawable(Color.parseColor("#BE2222")))
        actionbar!!.title = "Nasza Lokalizacja"
        actionbar.setDisplayHomeAsUpEnabled(true)


        val mWebView = findViewById<View>(R.id.WebView) as WebView
        mWebView.loadUrl("https://www.google.com/maps/place/51°09'05.5\"N+17°07'10.4\"E/@51.1515278,17.1190084,19z/data=!3m1!4b1!4m6!3m5!1s0x0:0x0!7e2!8m2!3d51.1515143!4d17.1195498")

        val webSettings = mWebView.settings
        webSettings.javaScriptEnabled = true
        mWebView.webViewClient = WebViewClient()

        mWebView.canGoBack()



    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}