package com.example.sportz

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.sportz.Ball.Ball1
import com.example.sportz.Ball.Ball2
import com.example.sportz.Kit.Kit1
import com.example.sportz.Kit.Kit2

class CricketKitEx : AppCompatActivity(),Adapter.MyClickListener {

    private lateinit var recyclerView: RecyclerView
    private lateinit var movieList: ArrayList<KitMovie>
    private lateinit var adapter: KitAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cricket_kit_ex)

        recyclerView = findViewById(R.id.recyclerView5)

        movieList = ArrayList()
        movieList.add(KitMovie(R.drawable.cball3,"AnNafi White Cricket Rubber Soft Balls for Practice A Grade Handstitched | Senior Official Hand Stitched No Stamp for Indoor and Outdoor Practice Cricket Balls"))
        movieList.add(KitMovie(R.drawable.cball2,"Jaspo IncrediBall Soft T20 Cricket Training Balls - Pack of 6 Indoor/Outdoor Play and Cricket Practice (229 cm Circumference), PVC Material, Colour-Red"))
        movieList.add(KitMovie(R.drawable.cball4,"Rubber Green Tennis Cricket Ball | Pack Of 3 Balls"))
        movieList.add(KitMovie(R.drawable.cball5,"TIMA Leather Cricket Shot Practice Hanging Ball, String Cricket Ball and Knocking Cricket Ball with Rope (Multi-Color) (Pack of 1)"))
        movieList.add(KitMovie(R.drawable.cball6,"FACTO POWER Soft Cricket Solid, Light Weight, Tennis Balls Practice, Recommended for Indoor/Outdoor Street & Beach Cricket (Pack of One) (Color : Green)(Model:Spiro) - Resin, Rubber, Standard"))
        movieList.add(KitMovie(R.drawable.cball7,"TIMA Sports Fun Poly Hard Synthetic Red Cricket Ball (Red Pack of 12)"))
        movieList.add(KitMovie(R.drawable.cball8,"TIMA Synthetic Cricket Ball Poly Hard Cricket Balls - Indoor & Outdoor Training Cricket Ball for Coaching Practice (Blue Pack of 3)"))
        movieList.add(KitMovie(R.drawable.cball9,"Sixit Lite Cricket Tennis Ball - Pack of 6 , Green , Material : Rubber , Standard Size"))
        movieList.add(KitMovie(R.drawable.cball3,"Rubber Green Tennis Cricket Ball | Pack Of 3 Balls"))
        movieList.add(KitMovie(R.drawable.cball5,"TIMA Sports Fun Poly Hard Synthetic Red Cricket Ball (Red Pack of 12)"))

        adapter = KitAdapter(movieList, this@CricketKitEx)

        recyclerView.adapter = adapter
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

    }

    override fun onClick(position: Int) {
        when(position){
            3 -> startActivity(Intent(this, Ball1::class.java))
            2 -> startActivity(Intent(this, Ball2::class.java))
        }

    }
}