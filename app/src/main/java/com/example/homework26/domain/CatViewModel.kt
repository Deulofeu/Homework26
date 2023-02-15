package com.example.homework26.domain

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.homework26.data.CatRepositoryImpl
import com.example.homework26.data.model.BreedResponse
import com.example.homework26.data.model.CatResponse
import kotlinx.coroutines.launch

class CatViewModel: ViewModel() {

    private  val repository = CatRepositoryImpl()
    val _catLiveData = MutableLiveData<List<CatResponse>>()
    val catLiveData: LiveData<List<CatResponse>> get() = _catLiveData

    fun getCatImage() {
        viewModelScope.launch {
            val picture = repository.getCatImage()
            _catLiveData.value = picture
        }
    }
}