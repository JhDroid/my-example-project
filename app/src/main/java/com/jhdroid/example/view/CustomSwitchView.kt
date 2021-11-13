package com.jhdroid.example.view

import android.content.Context
import android.util.AttributeSet
import android.view.LayoutInflater
import android.view.View
import android.widget.CompoundButton
import android.widget.LinearLayout
import com.jhdroid.example.databinding.ViewCustomSwitchBinding
import timber.log.Timber

class CustomSwitchView @JvmOverloads constructor(
    context: Context,
    attrs: AttributeSet? = null,
    defStyled: Int = 0
) : LinearLayout(context, attrs, defStyled), View.OnClickListener {

//    private var binding: ViewCustomSwitchBinding
    private val binding by lazy {  ViewCustomSwitchBinding.inflate(LayoutInflater.from(context)) }

    init {
//        binding = ViewCustomSwitchBinding.inflate(LayoutInflater.from(context))
        addView(binding.root)
        binding.llViewContainer.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        binding.swSetSwitch.isChecked = !binding.swSetSwitch.isChecked
    }

    fun setViewText(text: String) {
        binding.tvViewText.text = text
    }

    fun setOnCheckedListener(onCheckedChangeListener: CompoundButton.OnCheckedChangeListener) {
        binding.swSetSwitch.setOnCheckedChangeListener(onCheckedChangeListener)
    }
}