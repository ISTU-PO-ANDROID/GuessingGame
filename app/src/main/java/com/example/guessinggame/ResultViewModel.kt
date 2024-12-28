package com.example.guessinggame

import android.util.Log
import androidx.lifecycle.ViewModel

class ResultViewModel(finalResult: String) : ViewModel() {
    val result = finalResult

}