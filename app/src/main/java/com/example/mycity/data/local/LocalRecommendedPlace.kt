package com.example.mycity.data.local

import com.example.mycity.R
import com.example.mycity.data.RecommendedPlace

object LocalRecommendedPlace {
    val allRecommendedPlace = mutableListOf(
        RecommendedPlace(
            id = 1L,
            nameCategories = R.string.fountain_seven_girls,
            ImagePlace = listOf(R.drawable.fountain_seven_girls,
                R.drawable.monument_to_zagir_ismagilov,
                R.drawable.national_museum_of_the_republic_of_bashkortostan
            ),
            address = R.string.address_fountain_seven_girls,
            coordinate = R.string.coordinate_fountain_seven_girls,
            placeDescription = R.string.fountain_seven_girls_description
        ),
        RecommendedPlace(
            id = 2L,
            nameCategories = R.string.monument_to_zagir_ismagilov,
            ImagePlace = listOf(R.drawable.monument_to_zagir_ismagilov),
            address = R.string.address_monument_to_zagir_ismagilov,
            coordinate = R.string.coordinate_monument_to_zagir_ismagilov,
            placeDescription = R.string.fountain_seven_girls_description
        ),
        RecommendedPlace(
            id = 3L,
            nameCategories = R.string.national_museum_rb,
            ImagePlace = listOf(R.drawable.national_museum_of_the_republic_of_bashkortostan),
            address = R.string.address_national_museum_rb,
            coordinate =  R.string.coordinate_national_museum_rb,
            placeDescription = R.string.fountain_seven_girls_description
        ),
        RecommendedPlace(
            id = 4L,
            nameCategories = R.string.art_museum_M_V_Nesterov,
            ImagePlace = listOf(
                R.drawable.art_museum_m_v_nesterov_1,
                R.drawable.art_museum_m_v_nesterov_2,
                R.drawable.art_museum_m_v_nesterov_3
            ),
            address = R.string.address_art_museum_M_V_Nesterov,
            coordinate = R.string.coordinate_art_museum_M_V_Nesterov,
            placeDescription = R.string.art_museum_M_V_Nesterov_description
        ),
        RecommendedPlace(
            id = 10L,
            nameCategories = R.string.embankment,
            ImagePlace = listOf(
                R.drawable.embankment1,
                R.drawable.embankment2,
                R.drawable.embankment3
            ),
            address = R.string.address_embankment,
            coordinate = R.string.coordinate_embankment,
            placeDescription = R.string.embankment_description
        ),
        RecommendedPlace(
            id = 11L,
            nameCategories = R.string.aksakov_Garden,
            ImagePlace = listOf(R.drawable.aksakov_garden1),
            address = R.string.address_aksakov_Garden,
            coordinate = R.string.coordinate_aksakov_Garden,
            placeDescription = R.string.aksakov_Garden_description
        ),
        RecommendedPlace(
            id = 12L,
            nameCategories = R.string.Salavat_Yulaev_garden,
            ImagePlace = listOf(R.drawable.salavat_yulaev_garden1),
            address = R.string.address_salavat_Yulaev_garden,
            coordinate = R.string.coordinate_salavat_Yulaev_garden,
            placeDescription = R.string.Salavat_Yulaev_garden_description
        ),
        RecommendedPlace(
            id = 13L,
            nameCategories = R.string.Ivan_Yakutov_park,
            ImagePlace = listOf(
                R.drawable.ivan_yakutov_park1,
                R.drawable.ivan_yakutov_park2,
            ),
            address = R.string.address_ivan_Yakutov_park,
            coordinate = R.string.coordinate_ivan_Yakutov_park,
            placeDescription = R.string.Ivan_Yakutov_park_description
        ),

        RecommendedPlace(
            id = 20L,
            nameCategories = R.string.embankment,
            ImagePlace = listOf(
                R.drawable.embankment1,
                R.drawable.embankment2,
                R.drawable.embankment3
            ),
            address = R.string.address_embankment,
            coordinate = R.string.coordinate_embankment,
            placeDescription = R.string.embankment_description
        ),
        RecommendedPlace(
            id = 21L,
            nameCategories = R.string.aksakov_Garden,
            ImagePlace = listOf(R.drawable.aksakov_garden1),
            address = R.string.address_aksakov_Garden,
            coordinate = R.string.coordinate_aksakov_Garden,
            placeDescription = R.string.aksakov_Garden_description
        ),
        RecommendedPlace(
            id = 22L,
            nameCategories = R.string.Salavat_Yulaev_garden,
            ImagePlace = listOf(R.drawable.salavat_yulaev_garden1),
            address = R.string.address_salavat_Yulaev_garden,
            coordinate = R.string.coordinate_salavat_Yulaev_garden,
            placeDescription = R.string.Salavat_Yulaev_garden_description
        ),
        RecommendedPlace(
            id = 23L,
            nameCategories = R.string.Ivan_Yakutov_park,
            ImagePlace = listOf(
                R.drawable.ivan_yakutov_park1,
                R.drawable.ivan_yakutov_park2,
            ),
            address = R.string.address_ivan_Yakutov_park,
            coordinate = R.string.coordinate_ivan_Yakutov_park,
            placeDescription = R.string.Ivan_Yakutov_park_description
        ),

        RecommendedPlace(
            id = 30L,
            nameCategories = R.string.nino_kote,
            ImagePlace = listOf(
                R.drawable.nino_kote,
            ),
            address = R.string.address_ninp_kote,
            coordinate = R.string.coordinate_ninp_kote,
            placeDescription = R.string.ninp_kote_description
        ),
        RecommendedPlace(
            id = 31L,
            nameCategories = R.string.ojahuri,
            ImagePlace = listOf(R.drawable.ojahuri),
            address = R.string.address_ojahuri,
            coordinate = R.string.coordinate_ojahuri,
            placeDescription = R.string.ojahuri_description
        ),
        RecommendedPlace(
            id = 32L,
            nameCategories = R.string.anti_cafe,
            ImagePlace = listOf(R.drawable.anti_cafe),
            address = R.string.address_anti_cafe,
            coordinate = R.string.coordinate_anti_cafe,
            placeDescription = R.string.anti_cafe_description
        ),
        RecommendedPlace(
            id = 33L,
            nameCategories = R.string.fair_prices,
            ImagePlace = listOf(
                R.drawable.fair_prices,
            ),
            address = R.string.address_fair_prices,
            coordinate = R.string.coordinate_fair_prices,
            placeDescription = R.string.fair_prices_description
        ),
    )

    fun isPlace(uid: Long): RecommendedPlace {
        return allRecommendedPlace.first { it.id == uid }
    }
}