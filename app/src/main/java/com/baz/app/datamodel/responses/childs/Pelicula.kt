package com.example.pruebatecnica.datamodels.responses.childs

import com.example.pruebatecnica.datamodels.responses.childs.*
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Pelicula(
    @SerializedName("adult") @Expose val adult: Boolean,
    @SerializedName ("backdrop_path") @Expose val backdrop_path: String,
    @SerializedName("genre_ids") @Expose val genres: ArrayList<Long>,
    @SerializedName("id") @Expose val id: Long,
    @SerializedName("original_language") @Expose val original_languaje: String,
    @SerializedName("original_title") @Expose val original_title: String,
    @SerializedName("overview") @Expose val overview: String,
    @SerializedName("popularity") @Expose val popularity: Float,
    @SerializedName("poster_path") @Expose val poster_path: String,
    @SerializedName("release_date") @Expose val release_date: String,
    @SerializedName("title") @Expose val title: String,
    @SerializedName("video") @Expose val video: Boolean,
    @SerializedName("vote_average") @Expose val vote_average: Float,
    @SerializedName("vote_count") @Expose val vote_count: Long
):Serializable
