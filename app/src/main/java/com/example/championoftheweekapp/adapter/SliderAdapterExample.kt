package com.example.championoftheweekapp.adapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.bumptech.glide.Glide
import com.example.championoftheweekapp.R
import com.example.championoftheweekapp.model.SlideData
import com.smarteist.autoimageslider.SliderViewAdapter
import kotlinx.android.synthetic.main.slider_layout.view.*


class SliderAdapterExample(context: Context?, sliderDataArrayList: ArrayList<SlideData>) :
    SliderViewAdapter<SliderAdapterExample.SliderAdapterViewHolder>() {
    // list for storing urls of images.
    private val mSliderItems: List<SlideData>

    // We are inflating the slider_layout
    // inside on Create View Holder method.
    override fun onCreateViewHolder(parent: ViewGroup): SliderAdapterViewHolder {
        val inflate: View =
            LayoutInflater.from(parent.context).inflate(R.layout.slider_layout, null)
        return SliderAdapterViewHolder(inflate)
    }

    // Inside on bind view holder we will
    // set data to item of Slider View.
    override fun onBindViewHolder(viewHolder: SliderAdapterViewHolder, position: Int) {
        val sliderItem: SlideData = mSliderItems[position]

        // Glide is use to load image
        // from url in your imageview.
        Glide.with(viewHolder.itemView)
            .load(sliderItem.imgUrl)

            .into(viewHolder.itemView.myimage)
    }

    // this method will return
    // the count of our list.
    override fun getCount(): Int {
        return mSliderItems.size
    }

    class SliderAdapterViewHolder(itemView: View) : ViewHolder(itemView)


//    class SliderAdapterViewHolder(itemView: View) : ViewHolder(itemView) {
//        // Adapter class for initializing
//        // the views of our slider view.
//        lateinit var itemView: View
//        var imageViewBackground: ImageView
//
//        init {
//            imageViewBackground = itemView.findViewById(R.id.myimage)
//            this.itemView = itemView
//        }
//    }

    // Constructor
    init {
        mSliderItems = sliderDataArrayList
    }
}

