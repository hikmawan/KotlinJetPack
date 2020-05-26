package com.ghani.kotlinjetpack.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ghani.kotlinjetpack.model.DogBreed

class DetailViewModel:ViewModel() {

    val dogLiveData = MutableLiveData<DogBreed>()

    fun fetch(){
        val dog1 = DogBreed("1","Bulldog", "10 years", "breed group", "breedFor", "temperament", "")
        dogLiveData.value = dog1
    }
}