package com.example.homework26.data

import com.example.homework26.data.model.BreedResponse
import com.example.homework26.data.model.CatResponse
import com.example.homework26.domain.CatRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class CatRepositoryImpl : CatRepository {

    private val retrofit = Retrofit.Builder()
        .baseUrl("https://api.thecatapi.com/v1/")
        .addConverterFactory(GsonConverterFactory.create())
        .build()
    private val service = retrofit.create(CatService::class.java)
    override suspend fun getCatImage(): List<CatResponse> {
        return withContext(Dispatchers.IO) {
            service.getCatImage().execute().body() ?: throw Exception()
        }
    }

    override suspend fun getBreeds(): List<BreedResponse> {
        return withContext(Dispatchers.IO) {
            service.getBreeds().execute().body() ?: throw Exception()
        }
    }
}