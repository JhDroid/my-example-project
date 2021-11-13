package com.jhdroid.example.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.jhdroid.example.databinding.FragmentTwoBinding
import timber.log.Timber

class TabTwoFragment : Fragment() {

    private lateinit var binding: FragmentTwoBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentTwoBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnCustom.setViewText("안녕하세요 텍스트뷰2입니당")
        binding.btnCustom.setOnClickListener {
            Timber.d("onClick!!!!!")
        }
    }
}