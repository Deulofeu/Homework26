package com.example.homework26.domain

import com.example.homework26.data.model.BreedResponse
import com.example.homework26.data.model.CatResponse

interface CatRepository {

    suspend fun getCatImage(): List<CatResponse>
    suspend fun getBreeds(): List<BreedResponse>
}