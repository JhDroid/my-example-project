package com.jhdroid.example.ui

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.jhdroid.example.data.Message
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch

class SampleViewModel : ViewModel() {

    private val _eventFlow = MutableSharedFlow<Event>()
    val eventFlow = _eventFlow.asSharedFlow()

    fun showToast(msg: String) {
        event(Event.ShowToast(msg))
    }

    fun showDialog(tag: String) {
        event(Event.ShowDialog(tag))
    }

    private fun event(event: Event) {
        viewModelScope.launch {
            _eventFlow.emit(event)
        }
    }

    sealed class Event {
        data class ShowToast(val msg: String, val formatMsg: String? = null) : Event()
        data class ShowDialog(val tag: String): Event()
    }
}