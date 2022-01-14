package com.example.pruebatecnica.datamodels.responses.childs

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Country(
    @SerializedName("iso_3166_1") @Expose val iso_3166_1: String,
    @SerializedName("name") @Expose val name: String
): Serializable