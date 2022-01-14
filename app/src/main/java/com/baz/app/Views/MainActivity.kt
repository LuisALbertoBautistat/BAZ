package com.baz.app.Views

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.lifecycle.ViewModelProvider
import com.baz.app.R
import com.example.pruebatecnica.viewmodels.ViewModelPrueba
import javax.inject.Inject

class MainActivity : AppCompatActivity() {
    lateinit var viewModelPrueba: ViewModelPrueba
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        viewModelPrueba = ViewModelProvider(this).get(ViewModelPrueba::class.java)
        viewModelPrueba.data.observe(this,{
            startActivity(Intent(this,Peliculas::class.java).apply { putExtra("PELICULAS",it) })
            finish()
        })
    }

    override fun onResume() {
        super.onResume()
        viewModelPrueba.getPelis(this)
    }

}