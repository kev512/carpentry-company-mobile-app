package com.kewinplewa.androidportfolio

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.viewpager.widget.PagerAdapter
import kotlinx.android.synthetic.main.card_item.view.*

class GalleryAdapter(private val context: Context?, private val galleryModelArrayList: ArrayList<GalleryModel>) : PagerAdapter() {
    override fun isViewFromObject(view: View, `object`: Any): Boolean {
        return view == `object`
    }

    override fun getCount(): Int {
        return galleryModelArrayList.size // returns list of items
    }

    override fun instantiateItem(container: ViewGroup, position: Int): Any {

        // inflate layout card_item.xml
        val view = LayoutInflater.from(context).inflate(R.layout.card_item, container, false)

        // get data
        val model = galleryModelArrayList[position]
        val title = model.title
        val description = model.description
        val image = model.image

        // set data to ui views
        view.bannerIv.setImageResource(image)
        view.titleTv.text = title
        view.descriptionTv.text = description

        // HANDLE ITEM/CARD CLICK
        view.setOnClickListener {
            Toast.makeText(context, "CLICKED!!!", Toast.LENGTH_SHORT).show()
        }

        // add view to container
        container.addView(view, position)

        return view
    }

    override fun destroyItem(container: ViewGroup, position: Int, `object`: Any) {
        container.removeView(`object` as View)
    }

}