package com.elpablo.mimoto

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Dashboard
import androidx.compose.material.icons.filled.Message
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.SportsMotorsports
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.vector.ImageVector
import com.elpablo.mimoto.core.component.R

@Composable
fun BottomNavBar() {

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