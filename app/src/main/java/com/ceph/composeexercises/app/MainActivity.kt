package com.ceph.composeexercises.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import com.ceph.composeexercises.app.presentation.navigation.NavHostSetUp
import com.ceph.composeexercises.app.presentation.passcode.PasscodeViewModel
import com.ceph.composeexercises.app.ui.theme.ComposeExercisesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeExercisesTheme {

                val viewModel by viewModels<PasscodeViewModel>()

                NavHostSetUp(
                    viewModel = viewModel
                )

            }
        }
    }
}