package com.ceph.composeexercises.app.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.ceph.composeexercises.app.presentation.passcode.PasscodeScreen
import com.ceph.composeexercises.app.presentation.setup.SetUpScreen

@Composable
fun NavHostSetUp(
    navController: NavHostController,
) {

    NavHost(
        navController = navController,
        startDestination = NavRoutes.SetUp.route
    ) {
        composable(NavRoutes.SetUp.route) {
            SetUpScreen(navController)
        }
        composable(NavRoutes.Passcode.route) {
            PasscodeScreen()

        }
    }

}