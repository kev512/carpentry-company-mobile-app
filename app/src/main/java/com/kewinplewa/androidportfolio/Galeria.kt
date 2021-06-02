package com.kewinplewa.androidportfolio

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.fragment_galeria.*

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

        loadCards()


    }

    private fun loadCards() {

        // init the list
        galleryModelList = ArrayList()

        // add items to list
        galleryModelList.add(
            GalleryModel(
            "Meble Kuchenne",
            "Wykonane na wymiar w pełni dostosowane do potrzeb klienta",
            R.drawable.img_cover_1)
        )

        galleryModelList.add(GalleryModel(
            "Łazienki",
            "Nowoczesne i stylowe, idealnie dopasowane nawet do najmniejszej przestrzeni",
            R.drawable.img_cover_2))

        galleryModelList.add(GalleryModel(
            "Garderoby",
            "Pojemne i funkcjonalne - dokładnie dopasowane do architektury wnętrza",
            R.drawable.img_cover_3))

        galleryModelList.add(GalleryModel(
            "Apteki",
            "Kompletne wyposażenie aptek - głębokie szuflady, regały apteczne, lady systemowe",
            R.drawable.img_cover_4))

        // setup the adapter
    galleryAdapter = GalleryAdapter(context, galleryModelList)

        // set adapter to Viewpager
        viewPager.adapter = galleryAdapter

        // set the default padding
        viewPager.setPadding(100, 0, 100, 0)

    }
}