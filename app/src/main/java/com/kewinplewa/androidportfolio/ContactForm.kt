package com.kewinplewa.androidportfolio

import android.content.Intent
import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_contact_form.*
import java.lang.Exception

class ContactForm : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_contact_form)

        //button click to get input and cal sendMail method
        btnSend.setOnClickListener {

            //get input from EditText fields and save variables
            val email = email.text.toString().trim()
            val message = message.text.toString().trim()

            //method call for mail intent with two inputs as parameters
            sendEmail(email, message)

        }

        //support actionbar
        val actionbar = supportActionBar
        actionbar!!.setBackgroundDrawable(ColorDrawable(Color.parseColor("#BE2222")))
        actionbar!!.title = "Formularz Kontaktowy"
        actionbar.setDisplayHomeAsUpEnabled(true)

    }

    private fun sendEmail(email: String, message: String) {

        val mIntent = Intent(Intent.ACTION_SEND)
        mIntent.data = Uri.parse("mailto:")
        mIntent.type = "text/plain"

        mIntent.putExtra(Intent.EXTRA_EMAIL, arrayOf(email))
        mIntent.putExtra(Intent.EXTRA_TEXT, message)

        try {
            //start mail intent
            startActivity(Intent.createChooser(mIntent, "Proszę wybrać metodę wysłania..."))
        }
        catch (e: Exception) {
            Toast.makeText(this, e.message, Toast.LENGTH_SHORT).show()
        }


    }

    override fun onSupportNavigateUp(): Boolean {
        onBackPressed()
        return true
    }

}