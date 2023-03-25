package com.elpablo.mimoto.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.elpablo.mimoto.core.navigation.Screen
import com.elpablo.mimoto.feature.auth.AuthScreen

@Composable
fun Navigation(navController: NavHostController, modifier: Modifier, startDestination: String) {
    NavHost(
        navController = navController,
        startDestination = startDestination,
        route = Screen.NAVGRAPH.route
    ) {
        composable(route = Screen.AUTHENTICATION.route) {
            AuthScreen(navController = navController, modifier = modifier)
        }
    }
}

