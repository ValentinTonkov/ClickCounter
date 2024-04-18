package com.example.clickcounter

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {

    var numberOfClicks: Int = 0


    fun increment(){
        numberOfClicks++
    }
}