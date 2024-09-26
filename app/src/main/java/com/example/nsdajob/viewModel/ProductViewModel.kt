package com.example.nsdajob.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.nsdajob.ApiInstance.api
import com.example.nsdajob.ApiService

import com.example.nsdajob.Product
import kotlinx.coroutines.launch

class ProductViewModel: ViewModel() {
    private val _product = MutableLiveData<List<Product>>()
    val product: LiveData<List<Product>> get() = _product

    init {
        viewModelScope.launch{
            fetchProducts()
        }
    }

    private suspend fun fetchProducts() {
        try {
            val response = api.getProducts()
            _product.value = response

        }catch (e:Exception){

        }
    }

}
