package com.example.a5_monthhw_2

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query



interface CalculatorApi {


    @GET("getPercentage")
    fun getPercentage(
        @Query ("sname") secondName:String,
        @Query("fname") firtsName:String,
        @Header("X-RapidAPI-Key") apikey: String = "fe00c3496emshe27fe97b6ec2eacp13cae4jsnbda8a81bc997"
    ) :Call<CalculateModel>
}