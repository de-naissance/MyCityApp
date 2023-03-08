package com.example.mycity.ui

import androidx.lifecycle.ViewModel
import com.example.mycity.data.MyCityUiState
import com.example.mycity.data.RecommendedPlace
import com.example.mycity.data.Subcategories
import com.example.mycity.data.local.HomeScreenCategories.categories
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.update

class MyCityViewModel: ViewModel() {

    private val _uiState = MutableStateFlow(MyCityUiState())
    val uiState: StateFlow<MyCityUiState> = _uiState


    init {
        initializeUIState()
    }

    /**
     * Инициализация категорий стартовой страницы приложения путем получения из [DataSource]
     */
    private fun initializeUIState() {
        _uiState.value =
            MyCityUiState(
                mainCategories = categories
            )
    }

    /**
     *  Обновляем выбранную категорию
     * */
    fun updateSelectedSubcategories(
        nameSelectedTitle: Int,
        subcategories: List<Subcategories>
    ) {
        _uiState.update {
            it.copy(
                selectedSubcategories = subcategories,
                nameTitle = it.nameTitle.plus(Pair("subcategories", nameSelectedTitle))
            )
        }
    }

    fun updateRecommendedPlace(
        place: RecommendedPlace
    ) {
        _uiState.update {
            it.copy(
                selectedPlace = place,
                nameTitle = it.nameTitle.plus(Pair("recommended_place", place.nameCategories))
            )
        }
    }


    /**
     *  Сбрасываем значение подкатегории
     * */
    fun resetSubcategories() {
        _uiState.update {
            it.copy(
                selectedSubcategories = emptyList(),
                nameTitle = it.nameTitle.plus(Pair("subcategories", null))
            )
        }
    }

    /**
     *  Сбрасываем значение выбранного рекомендованного места
     * */
    fun resetSelectedPlace() {
        _uiState.update {
            it.copy(
                selectedPlace = null,
                nameTitle = it.nameTitle.plus(Pair("recommended_place", null))
            )
        }
    }
}