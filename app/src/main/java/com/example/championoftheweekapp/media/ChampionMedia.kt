package com.example.championoftheweekapp.media

import android.content.Context
import android.media.MediaPlayer

object ChampionMedia {
    var id = 0
    lateinit var mediaPlayer:MediaPlayer
    var currentPosition = 0
    fun startPlaying(context:Context)
    {
        mediaPlayer = MediaPlayer.create(context, id)
        mediaPlayer.seekTo(currentPosition)
        mediaPlayer.start()

    }
    fun pausePlaying(){
        currentPosition = mediaPlayer.currentPosition
        mediaPlayer.stop()
    }
    fun stopAndReleasePlayer()
    {
        mediaPlayer.stop()
        mediaPlayer.release()
    }

}