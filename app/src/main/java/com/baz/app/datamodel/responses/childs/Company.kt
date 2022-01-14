package com.example.pruebatecnica.datamodels.responses.childs

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName
import java.io.Serializable

data class Company(
    @SerializedName("id") @Expose val id: Int,
    @SerializedName("logo_path") @Expose val logo_path: String,
    @SerializedName("name") @Expose val name: String,
    @SerializedName("origin_country") @Expose val origin_country: String
) :Serializable
