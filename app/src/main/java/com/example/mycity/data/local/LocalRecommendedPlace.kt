package com.example.mycity.data.local

import com.example.mycity.R
import com.example.mycity.data.RecommendedPlace

object LocalRecommendedPlace {
    val allRecommendedPlace = mutableListOf(
        RecommendedPlace(
            id = 1,
            ImagePlace = R.drawable.fountain_seven_girls,
            placeDescription = R.string.fountain_seven_girls_description
        ),
        RecommendedPlace(
            id = 2,
            ImagePlace = R.drawable.monument_to_zagir_ismagilov,
            placeDescription = R.string.fountain_seven_girls_description
        ),
        RecommendedPlace(
            id = 3,
            ImagePlace = R.drawable.national_museum_of_the_republic_of_bashkortostan,
            placeDescription = R.string.fountain_seven_girls_description
        ),
    )
}