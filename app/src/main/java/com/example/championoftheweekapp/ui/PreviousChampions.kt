package com.example.championoftheweekapp.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import com.example.championoftheweekapp.R
import kotlinx.android.synthetic.main.activity_previous_champions.*

class PreviousChampions : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_previous_champions)

        all()
        parent_view.setOnClickListener {
            val myIntent = Intent(this, MainActivity::class.java)
            this.startActivity(myIntent)
            overridePendingTransition(0, 0)
            finish()
        }

    }

    fun all() {
        image1()
        image2()
        image3()
        image4()
        image5()
        image6()
        image7()

    }

    fun image1() {
        val zoom_In = AnimationUtils.loadAnimation(this, R.anim.zoom_in)
        val rotate = AnimationUtils.loadAnimation(this, R.anim.rotate)
        week1.startAnimation(zoom_In)
        profile_image.startAnimation(zoom_In)
        profile_image.startAnimation(rotate)

    }

    fun image2() {
        val zoom_In = AnimationUtils.loadAnimation(this, R.anim.zoom_in)
        val rotate = AnimationUtils.loadAnimation(this, R.anim.rotate)
        week2.startAnimation(zoom_In)
        profile_image2.startAnimation(zoom_In)
        profile_image2.startAnimation(rotate)

    }

    fun image3() {
        val zoom_In = AnimationUtils.loadAnimation(this, R.anim.zoom_in)
        val rotate = AnimationUtils.loadAnimation(this, R.anim.rotate)
        week3.startAnimation(zoom_In)
        profile_image3.startAnimation(zoom_In)
        profile_image3.startAnimation(rotate)

    }

    fun image4() {
        val zoom_In = AnimationUtils.loadAnimation(this, R.anim.zoom_in)
        val rotate = AnimationUtils.loadAnimation(this, R.anim.rotate)
        week4.startAnimation(zoom_In)
        profile_image4.startAnimation(zoom_In)
        profile_image4.startAnimation(rotate)

    }

    fun image5() {
        val zoom_In = AnimationUtils.loadAnimation(this, R.anim.zoom_in)
        val rotate = AnimationUtils.loadAnimation(this, R.anim.rotate)
        week5.startAnimation(zoom_In)
        profile_image5.startAnimation(zoom_In)
        profile_image5.startAnimation(rotate)

    }

    fun image6() {
        val zoom_In = AnimationUtils.loadAnimation(this, R.anim.zoom_in)
        val rotate = AnimationUtils.loadAnimation(this, R.anim.rotate)
        week6.startAnimation(zoom_In)
        profile_image6.startAnimation(zoom_In)
        profile_image6.startAnimation(rotate)

    }

    fun image7() {
        val zoom_In = AnimationUtils.loadAnimation(this, R.anim.zoom_in)
        val rotate = AnimationUtils.loadAnimation(this, R.anim.rotate)
        week7.startAnimation(zoom_In)
        profile_image7.startAnimation(zoom_In)
        profile_image7.startAnimation(rotate)

    }

}
