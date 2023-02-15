package com.example.homework26.data

import com.example.homework26.data.model.BreedResponse
import com.example.homework26.data.model.CatResponse
import retrofit2.Call
import retrofit2.http.GET

interface CatService {

    @GET("images/search")
    fun getCatImage(): Call<List<CatResponse>>

    @GET("breeds")
    fun getBreeds(): Call<List<BreedResponse>>
}