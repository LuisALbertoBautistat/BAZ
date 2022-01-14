package com.baz.app.Views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.baz.app.Detalles
import com.baz.app.adapters.AdapterPeliculas
import com.baz.app.databinding.ActivityPeliculasBinding
import com.baz.app.datamodel.responses.childs.ListPeliculas
import com.example.pruebatecnica.viewmodels.ViewModelPrueba
import com.google.android.flexbox.*
import java.io.Serializable

class Peliculas : AppCompatActivity() {
    lateinit var viewModelPrueba: ViewModelPrueba
    private lateinit var binding: ActivityPeliculasBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityPeliculasBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModelPrueba = ViewModelProvider(this).get(ViewModelPrueba::class.java)
        val extras = intent.extras?.get("PELICULAS")
        val items : ListPeliculas = extras as ListPeliculas

        binding.recycler.adapter = AdapterPeliculas(items.results, this){
        }

        binding.recycler.layoutManager = FlexboxLayoutManager(this).apply {
            FlexDirection.ROW
            JustifyContent.FLEX_START
            FlexWrap.WRAP
            AlignItems.FLEX_START
        }
        binding.recycler.setHasFixedSize(true)
    }
}