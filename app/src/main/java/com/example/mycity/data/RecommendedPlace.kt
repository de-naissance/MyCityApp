package com.example.mycity.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class RecommendedPlace(
    /** Уникальный ID для категории */
    val id: Long,
    /** Название категории */
    val nameCategories: Int,
    /** Изображение рекомендованного места */
    @DrawableRes val ImagePlace: List<Int>,
    /** Адрес локации */
    @StringRes val address: Int,
    /** Координата места */
    @StringRes val coordinate: Int,
    /** Описание рекомендованного места */
    @StringRes val placeDescription: Int,
)
