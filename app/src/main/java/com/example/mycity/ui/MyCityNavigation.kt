package com.example.mycity.ui


import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.ui.Modifier
import androidx.navigation.NavArgument
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController

@Composable
fun Navigation(
    myCityViewModel: MyCityViewModel,
    modifier: Modifier = Modifier,
    navController: NavHostController
) {
    val myCityUiState = myCityViewModel.uiState.collectAsState().value

    NavHost(
        navController = navController,
        startDestination = NavRoute.MainScreen.route,
        modifier = modifier
        ) {
        composable(
            route = NavRoute.MainScreen.route
        ) {
            SelectMainCategoriesScreen(
                myCityViewModel = myCityViewModel,
                option = myCityUiState.mainCategories,
                onNextCategoriesClicked = {
                    navController.navigate(NavRoute.Subcategories.route)
                }
            )
        }
        composable(
            route = NavRoute.Subcategories.route,
        ) {
            SelectSubcategoriesScreen(
                option = myCityUiState.selectedSubcategories,
                onNextCategoriesClicked = {
                    navController.navigate(NavRoute.RecommendedPlace.route)
                }
            )
        }
        composable(route = NavRoute.RecommendedPlace.route) {

        }
    }
}

/**
 * 1 Этап навигации:
 * Определяем маршруты с помощью enum класса
 */
/*
enum class MyCityScreen(@StringRes val title: Int) {
    Start(title = R.string.my_city),
    Category(title = R.string.category),
    RecommendedPlace(title = R.string.recommended_place)
}
*/

