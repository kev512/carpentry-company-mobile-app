package com.kewinplewa.androidportfolio

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class FullImageF : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_full_image_f)

        //support actionbar
        val actionbar = supportActionBar
        actionbar!!.setBackgroundDrawable(ColorDrawable(Color.parseColor("#BE2222")))
        actionbar!!.title = "Zdjęcie 6"
        actionbar.setDisplayHomeAsUpEnabled(true)

    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}