package com.example.mycity.ui

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.material3.windowsizeclass.WindowWidthSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.example.mycity.R
import com.example.mycity.ui.theme.MyCityTheme
import com.example.mycity.utils.ReplyContentType
import com.example.mycity.utils.ReplyNavigationType


/**
 * Составной, который отображает верхнюю панель и отображает кнопку "Назад",
 * если возможна обратная навигация.
 */

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyCityBar(
    currentScreen: Int, // Сюда, возможно, я буду передавать из ViewModel название топ бара
    canNavigationBack: Boolean, // Можем ли вернуться назад
    navigateUp: () -> Unit,
    modifier: Modifier = Modifier
) {
    TopAppBar(
        title = { Text(
            text = stringResource(id = currentScreen),
            style = MaterialTheme.typography.displayMedium
        ) },
        modifier = modifier,
        colors = TopAppBarDefaults.smallTopAppBarColors(
            containerColor = MaterialTheme.colorScheme.outlineVariant
        ),
        navigationIcon = {
            if (canNavigationBack) {
                IconButton(
                    onClick = navigateUp,
                    colors = IconButtonDefaults.filledIconButtonColors(
                        containerColor = MaterialTheme.colorScheme.outlineVariant,
                        contentColor = MaterialTheme.colorScheme.onSurface
                    ),
                    modifier = modifier

                ) {
                    Icon(
                        imageVector = Icons.Filled.ArrowBack, // Как сделать закруглённые
                        contentDescription = stringResource(id = R.string.back_button),

                    )
                }
            }
        }
    )
}


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyCityApp(
    myCityViewModel: MyCityViewModel,
    modifier: Modifier = Modifier,
    navController: NavHostController = rememberNavController(),
    windowSize: WindowSizeClass
) {

    val uiState = myCityViewModel.uiState.collectAsState().value
    val backStackEntry by navController.currentBackStackEntryAsState()
    val currentScreen = backStackEntry?.destination?.route ?: "main_screen"

    // Эта часть для динамического размера
    val navigationType: ReplyNavigationType
    val contentType: ReplyContentType
    Scaffold(
        topBar = {
            MyCityBar(
                currentScreen = uiState.nameTitle[currentScreen]!!,
                canNavigationBack = navController.previousBackStackEntry != null,
                navigateUp = {
                    navController.navigateUp()
                }
            )
        },
        content = { innerPadding ->
            Navigation(
                myCityViewModel = myCityViewModel,
                modifier = modifier.padding(innerPadding),
                navController = navController
            )
        }
    )

}

@Preview(showBackground = true)
@Composable
fun TopBarPreview() {
    MyCityTheme(darkTheme = false) {
        MyCityBar(
            R.string.attractions,
            canNavigationBack = true,
            navigateUp = { }
        )
    }
}