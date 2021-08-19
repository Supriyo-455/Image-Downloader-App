package com.example.imagedownloaderapp.model

import com.google.gson.annotations.SerializedName


data class Image(
    @SerializedName("url_s")
    var image_url: String,
    @SerializedName("title")
    var title: String,
//    @SerializedName("height_s")
//    var height: Int,
//    @SerializedName("width_s")
//    var width: Int
)