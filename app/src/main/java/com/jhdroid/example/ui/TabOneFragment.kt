package com.jhdroid.example.ui

import android.app.AlertDialog
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.lifecycle.lifecycleScope
import com.jhdroid.example.databinding.FragmentOneBinding
import kotlinx.coroutines.flow.collect
import kotlinx.coroutines.launch
import timber.log.Timber

class TabOneFragment : Fragment() {

    private lateinit var binding: FragmentOneBinding
    private lateinit var viewModel: SampleViewModel // 테스트용이라 초기화 하진 않음 코드만 참고

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentOneBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        lifecycleScope.launch {
            viewModel.eventFlow.collect { event ->
                handleEvent(event)
            }
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.swCustom.setViewText("안녕하세요 텍스트뷰입니당")
        binding.swCustom.setOnCheckedListener { p0, p1 ->
            Timber.d("checkChanged!! : $p1")
        }
    }

    private fun handleEvent(event: SampleViewModel.Event) {
        when (event) {
            is SampleViewModel.Event.ShowToast -> {
                Toast.makeText(requireContext(), event.msg, Toast.LENGTH_SHORT).show()
            }

            is SampleViewModel.Event.ShowDialog -> {
                AlertDialog.Builder(requireContext())
                    .setTitle("")
                    .setMessage("")
                    .show()
            }
        }
    }
}