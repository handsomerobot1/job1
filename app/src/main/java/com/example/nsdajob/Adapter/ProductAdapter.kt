package com.example.nsdajob.Adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.nsdajob.Product
import com.example.nsdajob.R

class ProductAdapter(private val products:List<Product>):RecyclerView.Adapter<ProductAdapter.ProductViewHolder>() {
    inner class ProductViewHolder(itemView:View):RecyclerView.ViewHolder(itemView) {
        val productImg = itemView.findViewById<ImageView>(R.id.imageView)
        val productId = itemView.findViewById<TextView>(R.id.productid)
        val productName = itemView.findViewById<TextView>(R.id.nameTxt)
        val productPrice = itemView.findViewById<TextView>(R.id.priceTxt)
        val productdescription =  itemView.findViewById<TextView>(R.id.product_dstn)
        fun bind(product:Product){
            productId.text= product.id.toString()
            productName.text = product.title
            productPrice.text = "$${product.price}"
            productdescription.text =product.description


            Glide.with(itemView).load(product.images[0])
                .into(productImg)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ProductViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.product_list,parent,false)
        return ProductViewHolder(view)
    }

    override fun getItemCount(): Int {
       return products.size
    }

    override fun onBindViewHolder(holder: ProductViewHolder, position: Int) {
        val product = products[position]
        holder.bind(product)
    }
}