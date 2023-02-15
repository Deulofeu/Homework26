package com.example.homework26.data.model

import com.google.gson.annotations.SerializedName

data class BreedResponse (
    @SerializedName("name") val breed: String? = null,
    @SerializedName("id") val breedId: String? = null
)