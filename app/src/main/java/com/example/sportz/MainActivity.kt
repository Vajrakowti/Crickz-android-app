package com.example.sportz

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {


    private lateinit var tv : TextView
    private lateinit var bottomNav : BottomNavigationView

    private lateinit var recyclerView: RecyclerView
    private lateinit var movieList: ArrayList<BrandMovie>
    private lateinit var adapter: BrandAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        recyclerView = findViewById(R.id.recyclerView3)

        movieList = ArrayList()
        movieList.add(BrandMovie(R.drawable.koko2))
        movieList.add(BrandMovie(R.drawable.grey))
        movieList.add(BrandMovie(R.drawable.spartan))
        movieList.add(BrandMovie(R.drawable.puma2))
        movieList.add(BrandMovie(R.drawable.nike))
        movieList.add(BrandMovie(R.drawable.dsc))
        movieList.add(BrandMovie(R.drawable.ceat))
        movieList.add(BrandMovie(R.drawable.mrf))

        adapter = BrandAdapter(movieList)

        recyclerView.adapter = adapter
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)


        // Bottom Navigation

        bottomNav = findViewById(R.id.bottomNav)

        bottomNav.setOnItemSelectedListener {
            when(it.itemId){
                R.id.menu_home -> {
                    finish()
                    true
                }
                R.id.menu_explore -> {
                    startActivity(Intent(applicationContext, CategoriesEx::class.java))
                    finish()
                    true
                }
                R.id.menu_cart -> {
                    startActivity(Intent(applicationContext, CartEx::class.java))
                    finish()
                    true
                }
                else -> true
            }
        }
    }
}