package com.kewinplewa.androidportfolio

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class FullImageG : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_full_image_g)

        //support actionbar
        val actionbar = supportActionBar
        actionbar!!.setBackgroundDrawable(ColorDrawable(Color.parseColor("#BE2222")))
        actionbar!!.title = "Zdjęcie 7"
        actionbar.setDisplayHomeAsUpEnabled(true)

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}