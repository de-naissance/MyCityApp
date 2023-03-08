package com.example.mycity.data

import androidx.compose.ui.graphics.vector.ImageVector

data class Subcategories(
    /** Уникальный ID для категории */
    val id: Long,
    /** Название категории */
    val nameCategories: Int,
    /** В дальнейшем здесь будет информация о месте */
    val recommendedPlace: RecommendedPlace
)
