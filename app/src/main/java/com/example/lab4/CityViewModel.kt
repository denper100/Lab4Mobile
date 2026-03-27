package com.example.lab4

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class CityViewModel : ViewModel() {


    private val _selectedCategoryId = MutableStateFlow(1)
    val selectedCategoryId: StateFlow<Int> = _selectedCategoryId


    private val _selectedPlaceId = MutableStateFlow(1)
    val selectedPlaceId: StateFlow<Int> = _selectedPlaceId


    fun selectCategory(categoryId: Int) {
        _selectedCategoryId.value = categoryId
    }


    fun selectPlace(placeId: Int) {
        _selectedPlaceId.value = placeId
    }
}