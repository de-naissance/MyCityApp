package com.example.mycity.data.local

import com.example.mycity.R
import com.example.mycity.data.Subcategories

object Attractions {

    val attractions = listOf(
        Subcategories(
            id = 1L,
            nameCategories = R.string.fountain_seven_girls,
            recommendedPlace = LocalRecommendedPlace.isPlace(1L)
        ),
        Subcategories(
            id = 2L,
            nameCategories = R.string.monument_to_zagir_ismagilov,
            recommendedPlace = LocalRecommendedPlace.isPlace(2L)
        ),
        Subcategories(
            id = 3L,
            nameCategories = R.string.national_museum_rb,
            recommendedPlace = LocalRecommendedPlace.isPlace(3L)
        ),
        Subcategories(
            id = 4L,
            nameCategories = R.string.art_museum_M_V_Nesterov,
            recommendedPlace = LocalRecommendedPlace.isPlace(4L)
        )
    )

    val walkingPlace = listOf(
        Subcategories(
            id = 10L,
            nameCategories = R.string.embankment,
            recommendedPlace = LocalRecommendedPlace.isPlace(10L)
        ),
        Subcategories(
            id = 11L,
            nameCategories = R.string.aksakov_Garden,
            recommendedPlace = LocalRecommendedPlace.isPlace(11L)
        ),
        Subcategories(
            id = 12L,
            nameCategories = R.string.Salavat_Yulaev_garden,
            recommendedPlace = LocalRecommendedPlace.isPlace(12L)
        ),
        Subcategories(
            id = 4L,
            nameCategories = R.string.Ivan_Yakutov_park,
            recommendedPlace = LocalRecommendedPlace.isPlace(13L)
        )
    )

    val entertainment = listOf(
        Subcategories(
            id = 20L,
            nameCategories = R.string.embankment,
            recommendedPlace = LocalRecommendedPlace.isPlace(20L)
        ),
        Subcategories(
            id = 21L,
            nameCategories = R.string.aksakov_Garden,
            recommendedPlace = LocalRecommendedPlace.isPlace(21L)
        ),
        Subcategories(
            id = 22L,
            nameCategories = R.string.Salavat_Yulaev_garden,
            recommendedPlace = LocalRecommendedPlace.isPlace(22L)
        ),
        Subcategories(
            id = 23L,
            nameCategories = R.string.Ivan_Yakutov_park,
            recommendedPlace = LocalRecommendedPlace.isPlace(23L)
        )
    )

    val establishments = listOf(
        Subcategories(
            id = 30L,
            nameCategories = R.string.nino_kote,
            recommendedPlace = LocalRecommendedPlace.isPlace(30L)
        ),
        Subcategories(
            id = 31L,
            nameCategories = R.string.ojahuri,
            recommendedPlace = LocalRecommendedPlace.isPlace(31L)
        ),
        Subcategories(
            id = 32L,
            nameCategories = R.string.anti_cafe,
            recommendedPlace = LocalRecommendedPlace.isPlace(32L)
        ),
        Subcategories(
            id = 33L,
            nameCategories = R.string.fair_prices,
            recommendedPlace = LocalRecommendedPlace.isPlace(33L)
        )
    )
}