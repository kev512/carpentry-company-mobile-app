package com.kewinplewa.androidportfolio

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_kontakt.*
import kotlinx.android.synthetic.main.fragment_oferta.*

class Kontakt : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_kontakt, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_tocontact.setOnClickListener {

            val fieldIntent = Intent(this@Kontakt.context, ContactForm::class.java)
            startActivity(fieldIntent)
        }

    }
}