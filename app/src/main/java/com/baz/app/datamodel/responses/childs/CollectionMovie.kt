package com.example.pruebatecnica.datamodels.responses.childs

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class CollectionMovie(
    @SerializedName ("id") @Expose val id: Int,
    @SerializedName("name") @Expose val name: String,
    @SerializedName("poster_path") @Expose val poster_path: String,
    @SerializedName("backdrop_path") @Expose val backdrop_path: String
):Serializable