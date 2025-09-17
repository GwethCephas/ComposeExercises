package com.ceph.composeexercises.app.presentation.navigation

sealed class NavRoutes(val route: String) {
    data object SetUp : NavRoutes("SetUp")
    data object Passcode : NavRoutes("Passcode")
}