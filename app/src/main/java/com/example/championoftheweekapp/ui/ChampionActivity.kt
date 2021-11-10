package com.example.championoftheweekapp.ui

import android.animation.ObjectAnimator
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.championoftheweekapp.databinding.ActivityChampionBinding
import android.R
import com.example.championoftheweekapp.R as localR
import android.graphics.Color
import android.os.Handler
import android.view.View
import com.bumptech.glide.Glide
import com.example.championoftheweekapp.media.ChampionMedia

import com.plattysoft.leonids.ParticleSystem
import kotlinx.android.synthetic.main.activity_champion.*
import nl.dionsegijn.konfetti.models.Shape
import nl.dionsegijn.konfetti.models.Size


class ChampionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityChampionBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Glide.with(this).asGif().load(localR.drawable.team).into(ivTeam)

        ObjectAnimator.ofFloat(binding.championImageView, "translationY", -600f).apply {
            duration = 2000
            start()
        }

        ObjectAnimator.ofFloat(binding.championTv, "translationY", -400f).apply {
            duration = 2000
            start()
        }

        fireWorks(binding.championImageView)
        fireWorks(binding.championImageView)
        fireWorks(binding.championImageView)
        fireWorks(binding.championImageView)


        Handler().postDelayed(Runnable {
                                       binding.konfitty.build()
                                           .addColors(Color.YELLOW, Color.GREEN, Color.MAGENTA)
                                           .setDirection(0.0, 359.0)
                                           .setSpeed(1f, 5f)
                                           .setFadeOutEnabled(true)
                                           .setTimeToLive(2000L)
                                           .addShapes(Shape.Square, Shape.Circle)
                                           .addSizes(Size(12))
                                           .setPosition(-50f, binding.konfitty.width + 50f, -50f, -50f)
                                           .streamFor(300, 5000L)

        },5000)



    }

    fun fireWorks(view : View){

        ParticleSystem(this, 50, R.drawable.star_big_on, 2500)
            .setSpeedRange(0.2f, 0.25f).setFadeOut(350)
            .setScaleRange(0f, 1f)
            .setStartTime(0)
            .oneShot(view, 50)
    }

    override fun onResume() {
        super.onResume()
    }

    override fun onDestroy() {
        super.onDestroy()
        ChampionMedia.stopAndReleasePlayer()
    }
}