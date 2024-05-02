package com.example.sportz

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BrandAdapter (val brandmovieList: ArrayList<BrandMovie>): RecyclerView.Adapter<BrandAdapter.MyViewHolder>() {

    inner class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        val imageView : ImageView = itemView.findViewById(R.id.brandimageView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.brand_item,parent,false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val BrandMovie = brandmovieList[position]
        holder.imageView.setImageResource(BrandMovie.image)
    }

    override fun getItemCount(): Int {
        return brandmovieList.size
    }

}