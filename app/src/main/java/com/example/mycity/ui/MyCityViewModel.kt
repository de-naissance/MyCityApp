package com.example.mycity.ui

import androidx.lifecycle.ViewModel
import com.example.mycity.R
import com.example.mycity.data.MyCityUiState
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
                nameTitle = R.string.app_name,
                mainCategories = categories
            )
    }

    /**
     *  Обновляем выбранную категорию
     * */
    fun updateSelectedSubcategories(
        nameTitle: Int,
        subcategories: List<Subcategories>
    ) {
        _uiState.update {
            it.copy(
                nameTitle = nameTitle,
                selectedSubcategories = subcategories,

            )
        }
    }


    /**
     *  Сбрасываем значение подкатегории
     * */
    fun resetSubcategories() {
        _uiState.update {
            it.copy(
                nameTitle = R.string.app_name,
                selectedSubcategories = emptyList()
            )
        }
    }

    /**
     *  Сбрасываем значение выбранного рекомендованного места
     * */
    fun resetSelectedPlace() {
        _uiState.update {
            it.copy(
                selectedPlace = false
            )
        }
    }
}