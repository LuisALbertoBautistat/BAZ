package com.baz.app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.baz.app.adapters.AdapterPeliculas
import com.baz.app.databinding.ActivityDetallesBinding
import com.baz.app.datamodel.responses.childs.ListPeliculas
import com.example.pruebatecnica.datamodels.responses.childs.Pelicula
import com.google.android.flexbox.*
import com.google.gson.Gson
import com.squareup.picasso.Picasso

class Detalles : AppCompatActivity() {
    lateinit var binding: ActivityDetallesBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetallesBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val extras = intent.extras?.get("PELICULA") as Pelicula
        val items = intent.extras?.get("PELICULAS") as ListPeliculas

        binding.descripcion.text =  extras.overview
        binding.tittle.text = extras.original_title
        Picasso.with(this).load("https://image.tmdb.org/t/p/w500/"+ extras.poster_path).into(binding.poster)

        binding.recyclerPelis.adapter = AdapterPeliculas(items.results, this){
        }

        binding.recyclerPelis.layoutManager = FlexboxLayoutManager(this).apply {
            FlexDirection.ROW
            JustifyContent.FLEX_START
            FlexWrap.WRAP
            AlignItems.FLEX_START
        }
        binding.recyclerPelis.setHasFixedSize(true)
    }
}