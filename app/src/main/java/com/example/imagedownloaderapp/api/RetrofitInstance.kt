package com.example.imagedownloaderapp.api

import com.example.imagedownloaderapp.utils.Constants.Companion.BASE_URL
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory


object RetrofitInstance {
    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val api: ImageApi by lazy {
        retrofit.create(ImageApi::class.java)
    }
}