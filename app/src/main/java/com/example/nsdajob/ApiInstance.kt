package com.example.nsdajob

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object ApiInstance {
val retrofit =Retrofit.Builder()
    .baseUrl("https://api.escuelajs.co/api/v1/")
    .addConverterFactory(GsonConverterFactory.create())
    .build()

    val api = retrofit.create(ApiService::class.java)

}