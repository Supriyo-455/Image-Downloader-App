package com.example.imagedownloaderapp.repository

import com.example.imagedownloaderapp.api.RetrofitInstance
import com.example.imagedownloaderapp.model.Image

class ImageRepository {
    suspend fun getImage(): Image {
        return RetrofitInstance.api.getImage()
    }
}