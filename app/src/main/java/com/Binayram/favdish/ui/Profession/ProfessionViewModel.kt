package com.Binayram.favdish.ui.Profession

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class ProfessionViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "This is profession Fragment"
    }
    val text: LiveData<String> = _text
}