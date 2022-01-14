package com.example.pruebatecnica.datamodels.responses.childs

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Languaje(
    @SerializedName("english_name") @Expose val english_name: String,
    @SerializedName("iso_639_1") @Expose val iso_639_1: String,
    @SerializedName("name") @Expose val name: String
): Serializable
