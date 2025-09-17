package com.ceph.composeexercises.app.presentation.passcode

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow

class PasscodeViewModel: ViewModel() {

    private val _pinCodeState = MutableStateFlow<Int>(0)
    val pinCodeState = _pinCodeState.asStateFlow()
}