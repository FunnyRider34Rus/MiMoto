package com.elpablo.mimoto

import android.R
import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopAppBar(
    @StringRes titleRes: Int,
    navigationIcon: ImageVector,
    actionIcon: ImageVector,
    modifier: Modifier,
    onNavigationClick: () -> Unit = {},
    onActionClick: () -> Unit = {}
) {
    CenterAlignedTopAppBar(
        title = { Text(text = stringResource(id = titleRes)) },
        modifier = modifier,
        navigationIcon = {
            IconButton(onClick = onNavigationClick) {
                Icon(
                    imageVector = navigationIcon,
                    contentDescription = null
                )
            }
        },
        actions = {
            IconButton(onClick = onActionClick) {
                Icon(
                    imageVector = actionIcon,
                    contentDescription = null
                )
            }
        }
    )
}

@Preview
@Composable
fun TopAppBarPreview() {
    TopAppBar(
        titleRes = R.string.untitled,
        navigationIcon = Icons.Default.Search,
        actionIcon = Icons.Default.Menu,
        modifier = Modifier
    )
}
