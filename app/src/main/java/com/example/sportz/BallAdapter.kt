package com.example.sportz

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class BallAdapter(val ballmovieList: ArrayList<BallMovie>, val listener: Adapter.MyClickListener): RecyclerView.Adapter<BallAdapter.MyViewHolder>() {

    inner class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        val imageView : ImageView = itemView.findViewById(R.id.ballimageView)
        val textView  : TextView =  itemView.findViewById(R.id.balltextView)

        init {
            itemView.setOnClickListener {
                val position = adapterPosition
                listener.onClick(position)
            }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        return MyViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.ball_item,parent,false))
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        val BallMovie = ballmovieList[position]
        holder.textView.text = BallMovie.name                               // names given in Movie
        holder.imageView.setImageResource(BallMovie.image)
    }

    override fun getItemCount(): Int {
        return ballmovieList.size
    }

    interface MyClickListener {
        fun onClick(position: Int)
    }


}