package com.baz.app.adapters

import android.content.ClipData
import android.content.Context
import android.content.Intent
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.baz.app.Detalles
import com.baz.app.R
import com.baz.app.datamodel.responses.childs.ListPeliculas

import com.example.pruebatecnica.datamodels.responses.childs.Pelicula
import com.squareup.picasso.Picasso
import com.example.pruebatecnica.viewmodels.ViewModelPrueba
import java.util.*

class AdapterPeliculas(val items: List<Pelicula>, val context: Context, val listener: (ClipData.Item) -> Unit) : RecyclerView.Adapter<AdapterPeliculas.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.item_card,parent, false)
        return ViewHolder(view)
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val viewModelPrueba = ViewModelPrueba()
        holder.title.text = items[position].original_title
        holder.date.text = items[position].release_date
        Picasso.with(context).load("https://image.tmdb.org/t/p/w500/"+items[position].poster_path).into(holder.poster)
        holder.itemView.setOnClickListener {
            val list = ListPeliculas(1, items,1,1)
            context.startActivity(Intent(context, Detalles::class.java).apply {
                putExtra("PELICULA", items[position])
                putExtra("PELICULAS", list)
            })
        }
    }

    override fun getItemCount(): Int {
        return items.size
    }

    class ViewHolder(view : View) : RecyclerView.ViewHolder(view)
    {
        val title = view.findViewById<TextView>(R.id.tittle)
        val date = view.findViewById<TextView>(R.id.date)
        val poster = view.findViewById<ImageView>(R.id.poster)
    }
}