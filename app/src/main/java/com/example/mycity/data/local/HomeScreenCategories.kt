package com.example.mycity.data.local

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*
import com.example.mycity.R
import com.example.mycity.data.MainCategories
import com.example.mycity.data.local.Attractions.attractions
import com.example.mycity.data.local.Attractions.entertainment
import com.example.mycity.data.local.Attractions.establishments
import com.example.mycity.data.local.Attractions.walkingPlace

/**
 * Статическое хранилище данных [MainCategories] главного экрана.
 * */
object HomeScreenCategories {

    val categories = listOf(
        MainCategories(
            id = 1,
            nameCategories = R.string.attractions,
            icon = Icons.Filled.LocalLibrary,
            subcategories = attractions,
        ),
        MainCategories(
            id = 2,
            nameCategories = R.string.entertainment,
            icon = Icons.Filled.Attractions,
            subcategories = entertainment,
        ),
        MainCategories(
            id = 3,
            nameCategories = R.string.cafes_and_restaurants,
            icon = Icons.Filled.Restaurant,
            subcategories = establishments,
        ),
        MainCategories(
            id = 4,
            nameCategories = R.string.place_for_walking,
            icon = Icons.Filled.Public,
            subcategories = walkingPlace,
        )
    )

}