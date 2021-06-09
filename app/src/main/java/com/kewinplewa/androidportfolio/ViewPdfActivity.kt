package com.kewinplewa.androidportfolio

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_view_pdf.*

class ViewPdfActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_view_pdf)

        //support actionbar
        val actionbar = supportActionBar
        actionbar!!.setBackgroundDrawable(ColorDrawable(Color.parseColor("#BE2222")))
        actionbar!!.title = "Nasza Oferta PDF"
        actionbar.setDisplayHomeAsUpEnabled(true)

        if (intent != null) {

            val viewType = intent.getStringExtra("ViewType")

            if(!TextUtils.isEmpty(viewType) || viewType != null) {

               if (viewType.equals("assets")) {
                   pdf_view.fromAsset("pdf_oferta.pdf")
                       .password(null)
                       .defaultPage(0)
                       .enableSwipe(true)
                       .enableDoubletap(true)
                       .onTap{false}
                       .load()
               }

            }

        }
    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}