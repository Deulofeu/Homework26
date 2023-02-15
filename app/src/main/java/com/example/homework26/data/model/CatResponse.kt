package com.example.homework26.data.model

import com.google.gson.annotations.SerializedName

data class CatResponse(
    @SerializedName("url") val imageUrl: String? = null
)