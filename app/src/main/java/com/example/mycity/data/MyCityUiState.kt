package com.example.mycity.data

/**
 * Класс данных, представляющий текущее состояние пользовательского интерфейса
 * */
data class MyCityUiState(
    /** Отображает текущее название страницы */
    val nameTitle: Int = 0,
    /**  */
    val mainCategories: List<MainCategories> = emptyList(),

    val selectedSubcategories: List<Subcategories> = emptyList(),
    /** Тут будет структура рекомендованного места*/
    val selectedPlace: Boolean = false,

    )
