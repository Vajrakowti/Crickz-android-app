package com.example.sportz

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class Adapter (val movieList: ArrayList<Movie>, val listener: MyClickListener):RecyclerView.Adapter<Adapter.MyViewHolder>() {

    inner class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        val imageView : ImageView = itemView.findViewById(R.id.imageView)
        val textView  : TextView =  itemView.findViewById(R.id.textView)

        init {
          itemView.setOnClickListener {
               val position = adapterPosition
             listener.onClick(position)
           }
       }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item,parent,false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val movie = movieList[position]
        holder.textView.text = movie.name                               // names given in Movie
        holder.imageView.setImageResource(movie.image)
    }

    override fun getItemCount(): Int {

        return movieList.size
    }

    interface MyClickListener {
        fun onClick(position: Int)
    }

}