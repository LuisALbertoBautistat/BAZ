package com.example.pruebatecnica.pruebasmodels

import android.content.Context
import android.util.Log
import com.android.volley.Request
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.baz.app.datamodel.responses.childs.ListPeliculas
import com.example.pruebatecnica.datamodels.responses.childs.Pelicula
import com.example.pruebatecnica.viewmodels.ViewModelPrueba
import com.google.gson.Gson
import java.lang.Exception

class ModelPrueba(private val context: Context, private val viewModelPrueba: ViewModelPrueba) {

    fun getMovies() {
        val queue = Volley.newRequestQueue(context)
        val url = "https://api.themoviedb.org/3/movie/popular?api_key=09825224185a5cb218a789f169bb1b9e"
        // Request a string response from the provided URL.
        val stringRequest = StringRequest(
            Request.Method.GET, url,
            { response ->
                try{
                    val res = Gson().fromJson(response, ListPeliculas::class.java)
                    viewModelPrueba.data.value = res
                }catch (e: Exception){
                    viewModelPrueba.error.value = "Ha ocurrido un error al procesar los datos"
                }
            },
            {
                viewModelPrueba.error.value = "Ha ocurrido un error"
            })
        // Add the request touestQueue. the Req
        queue.add(stringRequest)
    }

}