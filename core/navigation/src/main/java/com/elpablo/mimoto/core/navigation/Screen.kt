package com.elpablo.mimoto.core.navigation

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Dashboard
import androidx.compose.material.icons.filled.Message
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.SportsMotorsports
import androidx.compose.ui.graphics.vector.ImageVector
import om.elpablo.mimoto.core.navigation.R

sealed class Screen(val route: String) {
    object NAVGRAPH : Screen(route = "root_nav_graph")
    object AUTHENTICATION : Screen(route = "auth_screen")
    object DASHBOARDLIST : Screen(route = "dashboard_list")
    object DASHBOARDDETAIL : Screen(route = "dashboard_detail")
    object CHAT : Screen(route = "chat")
    object RIDE : Screen(route = "ride")
    object PROFILE : Screen(route = "profile")
}

sealed class BottomBarItems(
    val route: String,
    @StringRes val lable: Int,
    val icon: ImageVector
) {
    object Dashboard : BottomBarItems(
        route = Screen.DASHBOARDLIST.route,
        lable = R.string.bottomnavbar_lable_dashboard,
        icon = Icons.Default.Dashboard
    )

    object Chat : BottomBarItems(
        route = Screen.CHAT.route,
        lable = R.string.bottomnavbar_lable_chat,
        icon = Icons.Default.Message
    )

    object Ride : BottomBarItems(
        route = Screen.RIDE.route,
        lable = R.string.bottomnavbar_lable_ride,
        icon = Icons.Default.SportsMotorsports
    )

    object Profile : BottomBarItems(
        route = Screen.PROFILE.route,
        lable = R.string.bottomnavbar_lable_profile,
        icon = Icons.Default.Person
    )
}