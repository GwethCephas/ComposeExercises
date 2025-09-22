package com.ceph.composeexercises.app.presentation.passcode

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class PasscodeViewModel: ViewModel() {

    private val _enteredPin = MutableStateFlow("")
    val enteredPin = _enteredPin.asStateFlow()

    fun onNumberClick(number: String) {
        if (_enteredPin.value.length < 4) {
            _enteredPin.value += number

        }
    }

    fun onBackspaceClick() {
        if (_enteredPin.value.isNotEmpty()) {
            _enteredPin.value = _enteredPin.value.dropLast(1)
        }
    }
}