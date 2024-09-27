package com.example.nsdajob

import android.icu.text.CaseMap.Title
import android.media.Image

data class Product(
    val images:List<String>,
    val title:String,
    val price:Double
)
