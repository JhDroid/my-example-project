package com.jhdroid.example.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jhdroid.example.databinding.ActivityMainBinding
import timber.log.Timber
import com.google.android.material.tabs.TabLayout

import android.R
import android.R.id

import android.R.id.tabs
import android.view.animation.ScaleAnimation
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener
import com.jhdroid.example.databinding.MotionScaleBinding
import android.view.animation.Animation





class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
//    private val binding by lazy { MotionScaleBinding.inflate(layoutInflater) }
    private var isScale = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.viewScale.setOnClickListener {
            setAnimation()
        }

        supportFragmentManager
            .beginTransaction()
            .replace(binding.flFragmentContainer.id, MainFragment())
            .commit()
    }

    private fun setAnimation() {
        val anim = if (isScale) {
            ScaleAnimation(
                8f,    // fromX (float)
                0f, // toX
                1f,  // fromY
                1f // toY
            )
        } else {
            ScaleAnimation(
                2f,    // fromX (float)
                8f, // toX
                1f,  // fromY
                1f // toY
            )
        }

        anim.duration = 1000
        anim.fillAfter = true
        binding.viewScale.startAnimation(anim)

        isScale = !isScale
    }
}