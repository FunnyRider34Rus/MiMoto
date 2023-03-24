package com.elpablo.mimoto.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.elpablo.mimoto.BottomNavBar
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

@OptIn(ExperimentalMaterial3Api::class)
@Composable
private fun MiApp() {
    Scaffold(
        bottomBar = { BottomNavBar() }
    ) { innerPadding ->
        Navigation(
            navController = rememberNavController(),
            modifier = Modifier.padding(innerPadding),
            startDestination = Screen.AUTHENTICATION.route
        )
    }
}