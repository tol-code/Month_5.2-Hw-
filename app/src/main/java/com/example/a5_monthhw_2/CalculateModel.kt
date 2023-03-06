package com.example.a5_monthhw_2

import com.google.gson.annotations.SerializedName

data class CalculateModel(

    @SerializedName("fname")
    val firstName:String,

    @SerializedName("sname")
    val SecondName:String,
    val percentage:String,
    val result:String
)
