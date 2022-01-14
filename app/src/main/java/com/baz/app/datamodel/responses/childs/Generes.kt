package com.example.pruebatecnica.datamodels.responses.childs

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Generes(
    @SerializedName("id") @Expose val id: Int,
    @SerializedName("name") @Expose val name: String
):Serializable