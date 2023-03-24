package com.elpablo.mimoto.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.elpablo.mimoto.navigation.Navigation
import com.elpablo.mimoto.navigation.Screen
import com.elpablo.mimoto.ui.theme.MiMotoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MiMotoTheme {
                MiApp()
            }
        }
    }
}

@Composable
private fun MiApp() {
    Navigation(
        navController = rememberNavController(),
        modifier = Modifier,
        startDestination = Screen.AUTHENTICATION.route
    )
}