package com.jhdroid.example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.CompoundButton
import com.jhdroid.example.databinding.ActivityMainBinding
import timber.log.Timber

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.swCustom.setViewText("안녕하세요 텍스트뷰입니당")
        binding.swCustom.setOnCheckedListener { p0, p1 ->
            Timber.d("checkChanged!! : $p1")
        }

        binding.btnCustom.setViewText("안녕하세요 텍스트뷰2입니당")
        binding.btnCustom.setOnClickListener {
            Timber.d("onClick!!!!!")
        }
    }
}