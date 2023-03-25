package com.elpablo.mimoto.feature.auth

import androidx.compose.foundation.clipScrollableContainer
import androidx.compose.foundation.gestures.Orientation
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Checkbox
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.elpablo.mimoto.core.component.MiTopAppBar

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AuthScreen(
    navController: NavController,
    modifier: Modifier,
    viewModel: AuthViewModel = hiltViewModel()
) {

    val viewState by viewModel.viewState.collectAsState(AuthViewState())

    val textScrollState = rememberScrollState()

    Scaffold(
        modifier = modifier.fillMaxSize(),
        topBar = { MiTopAppBar(titleRes = R.string.text_title_topappbar, modifier = Modifier) }
    ) { innerPadding ->
        Column(
            modifier = Modifier
                .padding(innerPadding)
                .padding(16.dp)
        ) {
            Text(
                modifier = Modifier
                    .verticalScroll(textScrollState)
                    .clipScrollableContainer(Orientation.Vertical),
                text = stringResource(id = R.string.text_body),
                style = MaterialTheme.typography.bodyLarge
            )
            Spacer(modifier = Modifier.weight(1f))
            Row(
                modifier = Modifier.padding(vertical = 16.dp),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Checkbox(
                    checked = viewState.isCheck,
                    onCheckedChange = { viewModel.onEvent(AuthEvent.CheckBoxClick) }
                )
                Text(
                    text = stringResource(id = R.string.text_checkbox)
                )
            }
            Button(
                onClick = { viewModel.onEvent(AuthEvent.ButtonClick) },
                modifier = Modifier
                    .fillMaxWidth(),
                enabled = viewState.isCheck,
                contentPadding = ButtonDefaults.ContentPadding
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.google_logo),
                    contentDescription = "SignIn with Google",
                    tint = Color.Unspecified
                )
                Spacer(modifier = Modifier.size(ButtonDefaults.IconSpacing))
                Text(text = stringResource(id = R.string.text_button))
            }
            Spacer(modifier = Modifier.size(32.dp))
        }
    }
}