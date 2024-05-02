package com.example.sportz

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BatAdapter (val batmovieList: ArrayList<BatMovie>, val listener: Adapter.MyClickListener): RecyclerView.Adapter<BatAdapter.MyViewHolder>(){

    inner class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        val imageView : ImageView = itemView.findViewById(R.id.batimageView)
        val textView  : TextView =  itemView.findViewById(R.id.battextView)

        init {
            itemView.setOnClickListener {
                val position = adapterPosition
                listener.onClick(position)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.cricket_item,parent,false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val BatMovie = batmovieList[position]
        holder.textView.text = BatMovie.name                               // names given in Movie
        holder.imageView.setImageResource(BatMovie.image)
    }

    override fun getItemCount(): Int {
        return batmovieList.size
    }

    interface MyClickListener {
        fun onClick(position: Int)
    }
}