package com.example.championoftheweekapp.ui

import android.animation.ObjectAnimator
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.championoftheweekapp.media.ChampionMedia
import com.example.championoftheweekapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)



        ObjectAnimator.ofFloat(binding.nominationsHeader, "translationX", 160f).apply {
            duration = 2000
            start()
        }
        ObjectAnimator.ofFloat(binding.secondLayout, "translationX", 100f).apply {
            duration = 4000
            start()
        }
        ObjectAnimator.ofFloat(binding.thirdLayout, "translationX", 100f).apply {
            duration = 6000
            start()
        }

        Handler().postDelayed(Runnable {
            val intent  = Intent(this, ChampionActivity::class.java)
            startActivity(intent)
            overridePendingTransition(0, 0)
            finish()

        },20000)



    }

}