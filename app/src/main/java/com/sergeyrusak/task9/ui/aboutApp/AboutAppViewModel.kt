package com.sergeyrusak.task9.ui.aboutApp

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class AboutAppViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is about app Fragment"
    }
    val text: LiveData<String> = _text
}