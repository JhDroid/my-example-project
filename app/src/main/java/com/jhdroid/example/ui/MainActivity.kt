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


class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        supportFragmentManager
            .beginTransaction()
            .replace(binding.flFragmentContainer.id, MainFragment())
            .commit()

//        binding.tlTabBar.apply {
//            addTab(newTab().setText("탭1번"))
//            addTab(newTab().setText("탭2번"))
//
//            setOnTabSelectedListener(object : OnTabSelectedListener {
//                override fun onTabSelected(tab: TabLayout.Tab) {
//                    val selected = if (tab.position == 0) TabOneFragment() else TabTwoFragment()
//
//                    supportFragmentManager
//                        .beginTransaction()
//                        .replace(binding.flFragmentContainer.id, selected)
//                        .commit()
//                }
//
//                override fun onTabUnselected(tab: TabLayout.Tab) {}
//                override fun onTabReselected(tab: TabLayout.Tab) {}
//            })
//        }
    }
}