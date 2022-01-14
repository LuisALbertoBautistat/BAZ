package com.baz.app.datamodel.responses.childs

import com.example.pruebatecnica.datamodels.responses.childs.Pelicula
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable
import javax.inject.Inject

data class ListPeliculas @Inject constructor(
    @SerializedName("page") @Expose val page: Int,
    @SerializedName("results") @Expose val results: List<Pelicula>,
    @SerializedName("total_pages") @Expose val total_pages: Int,
    @SerializedName("total_results") @Expose val total_results: Int
    ):Serializable
