package com.example.nsdajob

import android.icu.text.CaseMap.Title
import android.media.Image
import android.media.MediaDescription

data class Product(
    val images:List<String>,
    val title: String,
    val price:Double,
    val description:String,
    val id:Int
)
