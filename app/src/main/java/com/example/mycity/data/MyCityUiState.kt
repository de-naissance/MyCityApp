package com.example.mycity.data

import com.example.mycity.R

/**
 * Класс данных, представляющий текущее состояние пользовательского интерфейса
 * */
data class MyCityUiState(
    /** Отображает текущее название страницы */
    var nameTitle: Map<String, Int?> = mapOf(
        Pair("main_screen", R.string.app_name),
        Pair("subcategories", null),
        Pair("recommended_place", null)
    ),
    /**  */
    val mainCategories: List<MainCategories> = emptyList(),

    val selectedSubcategories: List<Subcategories> = emptyList(),
    /** Тут будет структура рекомендованного места*/
    val selectedPlace: RecommendedPlace? = null,

    )
