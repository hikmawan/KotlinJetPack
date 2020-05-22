package com.ghani.kotlinjetpack.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.ghani.kotlinjetpack.model.DogBreed

class ListViewModel: ViewModel() {

    val dogs = MutableLiveData<List<DogBreed>>()
    val dogsLoadError = MutableLiveData<Boolean>()
    val loading = MutableLiveData<Boolean>()

    fun refresh(){
        val dog1 = DogBreed("1","Bulldog", "10 years", "breed group", "breedFor", "temperament", "")
        val dog2 = DogBreed("2","Pitbull", "12 years", "breed group", "breedFor", "temperament", "")
        val dog3 = DogBreed("3","Chihuwahuwa", "8 years", "breed group", "breedFor", "temperament", "")

        val dogList = arrayListOf<DogBreed>(dog1,dog2,dog3)
        dogs.value = dogList
        dogsLoadError.value = false
        loading.value = false
    }
}