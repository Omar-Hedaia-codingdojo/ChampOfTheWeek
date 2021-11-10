package com.example.championoftheweekapp.ui

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

import com.example.championoftheweekapp.adapter.SliderAdapterExample
import kotlinx.android.synthetic.main.activity_gallery_image.*


import com.smarteist.autoimageslider.SliderView

import com.example.championoftheweekapp.model.SlideData

import java.util.ArrayList
import com.example.championoftheweekapp.media.ChampionMedia
import com.example.championoftheweekapp.R
import me.grantland.widget.AutofitHelper

class GalleryImage : AppCompatActivity() {
    @SuppressLint("Recycle")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_gallery_image)

        ChampionMedia.id = R.raw.halloffame
        ChampionMedia.startPlaying(this)

        val url1 = "https://kevooo.000webhostapp.com/slide_1.png"
        val url2 = "https://kevooo.000webhostapp.com/slide_2.png"
        val url3 = "https://kevooo.000webhostapp.com/slide_3.png"
        val url4 = "https://kevooo.000webhostapp.com/slide_4.png"
        val url5 = "https://kevooo.000webhostapp.com/slide_5.png"
        val url6 = "https://kevooo.000webhostapp.com/slide_6.png"
        val url7 = "https://kevooo.000webhostapp.com/slide_6.png"


        // we are creating array list for storing our image urls.
        // we are creating array list for storing our image urls.
        val sliderDataArrayList: ArrayList<SlideData> = ArrayList<SlideData>()
        // initializing the slider view.

        // initializing the slider view.
        val sliderView = findViewById<SliderView>(R.id.slider)

        // adding the urls inside array list

        // adding the urls inside array list
        sliderDataArrayList.add(SlideData(url1))
        sliderDataArrayList.add(SlideData(url2))
        sliderDataArrayList.add(SlideData(url3))
        sliderDataArrayList.add(SlideData(url4))
        sliderDataArrayList.add(SlideData(url5))
        sliderDataArrayList.add(SlideData(url6))
        sliderDataArrayList.add(SlideData(url7))


        // passing this array list inside our adapter class.

        // passing this array list inside our adapter class.
        val adapter = SliderAdapterExample(this, sliderDataArrayList)

        // below method is used to set auto cycle direction in left to
        // right direction you can change according to requirement.

        // below method is used to set auto cycle direction in left to
        // right direction you can change according to requirement.
        sliderView.autoCycleDirection = SliderView.LAYOUT_DIRECTION_LTR

        // below method is used to
        // setadapter to sliderview.

        // below method is used to
        // setadapter to sliderview.
        sliderView.setSliderAdapter(adapter)

        // below method is use to set
        // scroll time in seconds.

        // below method is use to set
        // scroll time in seconds.
        sliderView.scrollTimeInSec = 3

        // to set it scrollable automatically
        // we use below method.

        // to set it scrollable automatically
        // we use below method.
        sliderView.isAutoCycle = true

        // to start autocycle below method is used.

        // to start autocycle below method is used.
        sliderView.startAutoCycle()

//        AutofitHelper.create(next_activity);
        next_activity.setOnClickListener {
            val myIntent = Intent(this, PreviousChampions::class.java)
            this.startActivity(myIntent)
            overridePendingTransition(0, 0)
            finish()
        }
    }


}