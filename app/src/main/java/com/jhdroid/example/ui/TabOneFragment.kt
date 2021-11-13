package com.jhdroid.example.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.jhdroid.example.databinding.FragmentOneBinding
import timber.log.Timber

class TabOneFragment : Fragment() {

    private lateinit var binding: FragmentOneBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOneBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.swCustom.setViewText("안녕하세요 텍스트뷰입니당")
        binding.swCustom.setOnCheckedListener { p0, p1 ->
            Timber.d("checkChanged!! : $p1")
        }
    }
}