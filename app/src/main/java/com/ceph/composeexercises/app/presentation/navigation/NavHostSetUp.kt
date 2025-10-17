package com.ceph.composeexercises.app.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.ceph.composeexercises.app.presentation.passcode.PasscodeScreen
import com.ceph.composeexercises.app.presentation.passcode.PasscodeViewModel
import com.ceph.composeexercises.app.presentation.setup.SetUpScreen

@Composable
fun NavHostSetUp(
    viewModel: PasscodeViewModel
) {

    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = NavRoutes.SetUp.route
    ) {
        composable(NavRoutes.SetUp.route) {
            SetUpScreen(
                onNavigateToPasscodeScreen = {
                    navController.navigate(NavRoutes.Passcode.route)
                }
            )
        }
        composable(NavRoutes.Passcode.route) {
            PasscodeScreen(
                onBackClick = {
                    navController.navigateUp()
                },
                viewModel = viewModel
            )

        }
    }

}