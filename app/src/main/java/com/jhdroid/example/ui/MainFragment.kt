package com.jhdroid.example.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.google.android.material.tabs.TabLayout
import com.jhdroid.example.databinding.FragmentMainBinding
import com.jhdroid.example.databinding.FragmentOneBinding

class MainFragment : Fragment() {

    private lateinit var binding: FragmentMainBinding

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tlTabBar.apply {
            addTab(newTab().setText("탭1번"))
            addTab(newTab().setText("탭2번"))

            setOnTabSelectedListener(object : TabLayout.OnTabSelectedListener {
                override fun onTabSelected(tab: TabLayout.Tab) {
                    val selected = if (tab.position == 0) TabOneFragment() else TabTwoFragment()

                    childFragmentManager
                        .beginTransaction()
                        .replace(binding.flFragmentContainer.id, selected)
                        .commit()
                }

                override fun onTabUnselected(tab: TabLayout.Tab) {}
                override fun onTabReselected(tab: TabLayout.Tab) {}
            })
        }
    }
}