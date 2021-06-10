package com.kewinplewa.androidportfolio

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.cardview.widget.CardView
import kotlinx.android.synthetic.main.fragment_galeria.*
import kotlinx.android.synthetic.main.fragment_kontakt.*
import kotlinx.android.synthetic.main.fragment_oferta.*

class Galeria : Fragment() {

    private lateinit var galleryModelList: ArrayList<GalleryModel>
    private lateinit var galleryAdapter: GalleryAdapter


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_galeria, container, false)

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        imgA.setOnClickListener {

            val fieldIntent = Intent(this@Galeria.context, FullImageA::class.java)
            startActivity(fieldIntent)
        }

        imgB.setOnClickListener {

            val fieldIntent = Intent(this@Galeria.context, FullImageB::class.java)
            startActivity(fieldIntent)
        }

        imgC.setOnClickListener {

            val fieldIntent = Intent(this@Galeria.context, FullImageC::class.java)
            startActivity(fieldIntent)
        }

        imgD.setOnClickListener {

            val fieldIntent = Intent(this@Galeria.context, FullImageD::class.java)
            startActivity(fieldIntent)
        }

        imgE.setOnClickListener {

            val fieldIntent = Intent(this@Galeria.context, FullImageE::class.java)
            startActivity(fieldIntent)
        }

        imgF.setOnClickListener {

            val fieldIntent = Intent(this@Galeria.context, FullImageF::class.java)
            startActivity(fieldIntent)
        }

        imgG.setOnClickListener {

            val fieldIntent = Intent(this@Galeria.context, FullImageG::class.java)
            startActivity(fieldIntent)
        }

        imgH.setOnClickListener {

            val fieldIntent = Intent(this@Galeria.context, FullImageH::class.java)
            startActivity(fieldIntent)
        }

    }



}