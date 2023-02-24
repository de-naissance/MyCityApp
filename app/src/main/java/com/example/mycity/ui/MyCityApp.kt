package com.example.mycity.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.mycity.R
import com.example.mycity.utils.ReplyContentType
import com.example.mycity.utils.ReplyNavigationType


/**
 * Составной, который отображает верхнюю панель и отображает кнопку "Назад",
 * если возможна обратная навигация.
 */

@Composable
fun MyCityBar(
    currentScreen: Int, // Сюда, возможно, я буду передавать из ViewModel название топ бара
    canNavigationBack: Boolean, // Можем ли вернуться назад
    navigateUp: () -> Unit,
    modifier: Modifier = Modifier
) {
    TopAppBar(
        title = { Text(text = stringResource(id = currentScreen)) },
        modifier = modifier,
        navigationIcon = {
            if (canNavigationBack) {
                IconButton(onClick = navigateUp) {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack, // Как сделать закруглённые
                        contentDescription = stringResource(id = R.string.back_button)
                    )
                }
            }
        }
    )
}


@Composable
fun MyCityApp(
    myCityViewModel: MyCityViewModel,
    modifier: Modifier = Modifier,
    windowSize: WindowSizeClass
) {

    val uiState = myCityViewModel.uiState.collectAsState().value
    // Эта часть для динамического размера
    val navigationType: ReplyNavigationType
    val contentType: ReplyContentType
    Scaffold(
        topBar = {
            MyCityBar(
                currentScreen = uiState.nameTitle,
                canNavigationBack = navController.previousBackStackEntry != null,
                navigateUp = { navController.navigateUp() }
            )
        },
        content = { innerPadding ->
            Navigation(
                myCityViewModel = myCityViewModel,
                modifier = modifier.padding(innerPadding)
            )
        }
    )

}
