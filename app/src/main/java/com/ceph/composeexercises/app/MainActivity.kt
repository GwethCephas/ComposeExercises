package com.ceph.composeexercises.app

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.navigation.compose.rememberNavController
import com.ceph.composeexercises.app.presentation.navigation.NavHostSetUp
import com.ceph.composeexercises.app.ui.theme.ComposeExercisesTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeExercisesTheme {
                val navController = rememberNavController()
                NavHostSetUp(navController)

            }
        }
    }
}