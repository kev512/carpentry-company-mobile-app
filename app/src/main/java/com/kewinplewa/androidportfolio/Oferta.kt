package com.kewinplewa.androidportfolio

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.github.barteksc.pdfviewer.PDFView
import kotlinx.android.synthetic.main.fragment_oferta.*


class Oferta : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_oferta, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        btn_ofertaPDF.setOnClickListener {

            val fieldIntent = Intent(this@Oferta.context, ViewPdfActivity::class.java)

            fieldIntent.putExtra("ViewType", "assets")
            startActivity(fieldIntent)
        }

    }
}