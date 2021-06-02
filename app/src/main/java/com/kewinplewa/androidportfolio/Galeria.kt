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
            "Meble Kuchenne OPIS",
            R.drawable.img_cover_1)
        )

        galleryModelList.add(GalleryModel(
            "Meble Łazienkowe",
            "Meble Łazienkowe OPIS",
            R.drawable.img_cover_1))

        galleryModelList.add(GalleryModel(
            "Meble Biurowe",
            "Meble Biurowe OPIS",
            R.drawable.img_cover_1))

        // setup the adapter
    galleryAdapter = GalleryAdapter(context, galleryModelList)

        // set adapter to Viewpager
        viewPager.adapter = galleryAdapter

        // set the default padding
        viewPager.setPadding(100, 0, 100, 0)

    }
}