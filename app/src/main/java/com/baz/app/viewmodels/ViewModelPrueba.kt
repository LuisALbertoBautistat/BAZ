package com.example.pruebatecnica.viewmodels

import android.content.Context
import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.baz.app.datamodel.responses.childs.ListPeliculas
import com.example.pruebatecnica.datamodels.responses.childs.Pelicula
import com.example.pruebatecnica.pruebasmodels.ModelPrueba

class ViewModelPrueba : ViewModel() {
    private var modelPrueba: ModelPrueba? = null
    var  error: MutableLiveData<String> = MutableLiveData<String>()
    var  data: MutableLiveData<ListPeliculas> = MutableLiveData<ListPeliculas>()
    var  detalles: MutableLiveData<Pelicula> = MutableLiveData<Pelicula>()

    fun initInstance(context: Context){
        if(modelPrueba == null)
        modelPrueba = ModelPrueba( context,this)
    }
    fun getPelis(context : Context){
        initInstance(context)
        modelPrueba?.getMovies()
    }
}