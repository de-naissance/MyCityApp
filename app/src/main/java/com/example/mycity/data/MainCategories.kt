package com.example.mycity.data

import androidx.compose.ui.graphics.vector.ImageVector

data class MainCategories(
    /** Уникальный ID для категории */
    val id: Int,
    /** Название категории */
    val nameCategories: Int,
    /** ImageVector категории*/
    val icon: ImageVector,
    /** Указатель подкатегории */
    val subcategories: List<Subcategories>
)
