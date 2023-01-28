package com.example.dz_2_5.ui.fragments

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.dz_2_5.data.models.DotaModel
import com.example.dz_2_5.data.repositories.DotaRepository

class DotaViewModel: ViewModel() {

    private var dotaList = mutableListOf<DotaModel>()

    private val _dotaLiveData = MutableLiveData<List<DotaModel>>()
    val dotaLiveData : LiveData<List<DotaModel>> = _dotaLiveData

    fun getDotaPersons(icon: String, name: String){
        dotaList.add(DotaModel(icon = icon, name = name))
        _dotaLiveData.value = dotaList.toList()
    }
}