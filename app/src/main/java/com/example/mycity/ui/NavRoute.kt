package com.example.mycity.ui

import androidx.annotation.StringRes
import com.example.mycity.R

sealed class NavRoute(val route: String) {
    object MainScreen: NavRoute("main_screen")
    object Subcategories: NavRoute("subcategories")
    object RecommendedPlace: NavRoute("recommended_place")
}
