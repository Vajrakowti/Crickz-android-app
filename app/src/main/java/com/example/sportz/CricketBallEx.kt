package com.example.sportz

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sportz.Bat.KokoEx
import com.example.sportz.Bat.MrfEx
import com.example.sportz.Kit.Kit1
import com.example.sportz.Kit.Kit2

class CricketBallEx : AppCompatActivity(),Adapter.MyClickListener {

    private lateinit var recyclerView: RecyclerView
    private lateinit var movieList: ArrayList<BallMovie>
    private lateinit var adapter: BallAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cricket_ball_ex)

        recyclerView = findViewById(R.id.recyclerView4)

        movieList = ArrayList()
        movieList.add(BallMovie(R.drawable.ckit,"CW Championship Cricket Kit for Men Full Size Cricket Kit Set English Willow Cricket Kit Full Cricket Kit Bag Full Set Cricket Kit Full Size Adult Set Senior Kit- Red Black White"))
        movieList.add(BallMovie(R.drawable.ckit2,"SG Multicolor Economy Cricket Set Size- 6 with Helmet"))
        movieList.add(BallMovie(R.drawable.ckit3,"DSC Belter Kashmir Willow Cricket Kit with Helmet, Size-Mens, Left Hand"))
        movieList.add(BallMovie(R.drawable.ckit4,"SG Full Cricket Kit for (Senior) + Legguard + Batting Gloves + Kitbag + Thigh Guard + Arm Guard + Abdo Guard A Complete Economy Cricket kit for Batsmen with Wooden Wicket Stumps"))
        movieList.add(BallMovie(R.drawable.ckit5,"Klapp Fighter Cricket Kit Set with Kashmir Willow Cricket Bat (6, Multicolour)"))
        movieList.add(BallMovie(R.drawable.ckit6,"CW Bullet Green Right Hand Cricket Kit Complete Cricket Set with Kashmir Willow Bat & Leather Ball Junior - Youth & Boys Backpack Kit Complete Kit (Size 6 for 12-13 Yr)"))
        movieList.add(BallMovie(R.drawable.ckit7,"CW Player Choice Cricket Kit Without Bat Cricket Duffle Backpack Bag Kashmir Willow Cricket Kit for Boys Cricket Full Kit for Men Full Size Cricket Bat Cricket Kits All Age"))
        movieList.add(BallMovie(R.drawable.ckit8,"CW Trainer Red Blue Wooden Cricket kit for All Age Groups Kashmir Willow Cricket Bat Size 3-6 Cricket Glove Kit for Boys - Senior Men Full Size Left & Right Hand Kit (3 for 5-7 Yr, Right Blue)"))
        movieList.add(BallMovie(R.drawable.ckit9,"Whitedot Falcon Kashmir Willow Cricket Combo Kit Set, Suitable for Boys/Small, Left Hand"))
        movieList.add(BallMovie(R.drawable.ckit10,"Klapp Personal Complete Cricket Kit Combo with Spotlight Cricket Ball (BOY)"))

        adapter = BallAdapter(movieList, this@CricketBallEx)

        recyclerView.adapter = adapter
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

    }

    override fun onClick(position: Int) {
        when(position){
            0 -> startActivity(Intent(this, Kit1::class.java))
            1 -> startActivity(Intent(this, Kit2::class.java))
        }

    }
}