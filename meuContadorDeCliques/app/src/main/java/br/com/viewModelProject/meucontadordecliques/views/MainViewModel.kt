package br.com.viewModelProject.meucontadordecliques.views

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    val _contador = MutableLiveData<Int>(0)
    var contador = _contador

    fun incrementaContador(){
        _contador.value = _contador.value?.plus(1)
    }
}