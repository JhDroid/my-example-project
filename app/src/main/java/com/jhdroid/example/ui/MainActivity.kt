package com.jhdroid.example.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jhdroid.example.databinding.ActivityMainBinding
import timber.log.Timber
import com.google.android.material.tabs.TabLayout

import android.R
import android.R.id

import android.R.id.tabs
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayout.OnTabSelectedListener
import com.jhdroid.example.databinding.MotionScaleBinding


class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
//    private val binding by lazy { MotionScaleBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        supportFragmentManager
            .beginTransaction()
            .replace(binding.flFragmentContainer.id, MainFragment())
            .commit()
    }
}