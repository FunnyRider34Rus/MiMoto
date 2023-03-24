package com.elpablo.mimoto

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost

@Composable
fun Navigation(navController: NavHostController, modifier: Modifier, startDestination: String) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        route = Screen.NAVGRAPH.route
    ) {

    }
}

sealed class Screen(val route: String) {
    object NAVGRAPH : Screen(route = "root_nav_graph")
    object AUTHENTICATION : Screen(route = "auth_screen")
    object DASHBOARDLIST : Screen(route = "dashboard_list")
    object DASHBOARDDETAIL : Screen(route = "dashboard_detail")
    object CHAT : Screen(route = "chat")
    object RIDE : Screen(route = "ride")
    object PROFILE : Screen(route = "profile")
}