package com.example.mycity.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class RecommendedPlace(
    /** Уникальный ID для категории */
    val id: Int,
    /** Изображение рекомендованного места */
    @DrawableRes val ImagePlace: Int,
    /** Описание рекомендованного места */
    @StringRes val placeDescription: Int,
)
