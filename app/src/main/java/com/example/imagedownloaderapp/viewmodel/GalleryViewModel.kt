package com.example.imagedownloaderapp.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.imagedownloaderapp.model.Image
import com.example.imagedownloaderapp.repository.ImageRepository
import kotlinx.coroutines.launch

class GalleryViewModel(private val repository: ImageRepository): ViewModel() {

    val myResponse: MutableLiveData<Image> = MutableLiveData()

    fun getImage(){
        viewModelScope.launch {
            val response: Image = repository.getImage()
            myResponse.value = response
        }
    }
}