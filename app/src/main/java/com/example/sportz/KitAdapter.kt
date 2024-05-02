package com.example.sportz

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class KitAdapter(val kitmovieList: ArrayList<KitMovie>, val listener: Adapter.MyClickListener): RecyclerView.Adapter<KitAdapter.MyViewHolder>() {

    inner class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

        val imageView : ImageView = itemView.findViewById(R.id.kitimageView)
        val textView  : TextView =  itemView.findViewById(R.id.kittextView)

        init {
            itemView.setOnClickListener {
                val position = adapterPosition
                listener.onClick(position)
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.kit_item,parent,false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val KitMovie = kitmovieList[position]
        holder.textView.text = KitMovie.name                               // names given in Movie
        holder.imageView.setImageResource(KitMovie.image)
    }

    override fun getItemCount(): Int {
        return kitmovieList.size
    }

    interface MyClickListener {
        fun onClick(position: Int)
    }
}