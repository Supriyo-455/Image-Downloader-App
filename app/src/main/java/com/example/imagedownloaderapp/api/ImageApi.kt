package com.example.imagedownloaderapp.api

import com.example.imagedownloaderapp.model.Image
import retrofit2.http.GET

interface ImageApi{

    @GET("")
    suspend fun getImage(): Image
}