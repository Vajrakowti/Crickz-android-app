package com.example.sportz

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SearchView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import java.util.Locale

class CategoriesEx : AppCompatActivity(),Adapter.MyClickListener {

    private lateinit var recyclerView: RecyclerView
    private lateinit var movieList: ArrayList<Movie>
    private lateinit var adapter: Adapter

    private lateinit var searchView: SearchView
    private lateinit var searchList: ArrayList<Movie>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_categories_ex)

        recyclerView = findViewById(R.id.recyclerView)
        searchView = findViewById(R.id.search)

        movieList = ArrayList()
        movieList.add(Movie(R.drawable.kit,"CRICKET KIT"))
        movieList.add(Movie(R.drawable.cbat,"CRICKET BAT"))
        movieList.add(Movie(R.drawable.ball3,"CRICKET BALL"))
        movieList.add(Movie(R.drawable.wicket,"WICKETS"))
        movieList.add(Movie(R.drawable.gloves,"GLOVES"))
        movieList.add(Movie(R.drawable.pads,"PADS"))
        movieList.add(Movie(R.drawable.helment,"HELMET"))
        movieList.add(Movie(R.drawable.bail,"BAILS"))
        movieList.add(Movie(R.drawable.chest,"CHEST GUARD"))
        movieList.add(Movie(R.drawable.shoes,"SHOES"))
        movieList.add(Movie(R.drawable.jersey,"JERSEY"))



        adapter = Adapter(movieList, this@CategoriesEx)

        recyclerView.adapter = adapter
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)




    }

    override fun onClick(position: Int) {
        when(position){
            1 -> startActivity(Intent(this,CricketBatEx::class.java))        //kit
            0 -> startActivity(Intent(this,CricketBallEx::class.java))       //bat
            2 -> startActivity(Intent(this,CricketKitEx::class.java))        //ball


        }
    }
}