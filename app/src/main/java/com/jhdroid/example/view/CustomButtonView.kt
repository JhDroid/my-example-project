package com.jhdroid.example.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.CompoundButton
import android.widget.LinearLayout
import com.jhdroid.example.databinding.ViewCustomButtonBinding
import com.jhdroid.example.databinding.ViewCustomSwitchBinding

class CustomButtonView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyled: Int = 0
) : LinearLayout(context, attrs, defStyled) {

    private val binding by lazy {  ViewCustomButtonBinding.inflate(LayoutInflater.from(context)) }

    init {
        addView(binding.root)
    }

    override fun setOnClickListener(listener: OnClickListener?) {
        binding.llViewContainer.setOnClickListener(listener)
    }

    fun setViewText(text: String) {
        binding.tvViewText.text = text
    }
}