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

class CricketBatEx : AppCompatActivity(),Adapter.MyClickListener  {

    private lateinit var recyclerView: RecyclerView
    private lateinit var movieList: ArrayList<BatMovie>
    private lateinit var adapter: BatAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cricket_bat_ex)

        recyclerView = findViewById(R.id.recyclerView2)

        movieList = ArrayList()
        movieList.add(BatMovie(R.drawable.cbat2,"Cricket Bat Full Size Popular Willow SG Cricket Bat with Bat Cover Play for Tennis Ball | Rubber Ball | Plastic Ball (Blue)"))
        movieList.add(BatMovie(R.drawable.bat2,"TOSKA Cricket Bat Full Size Popular Willow Kookaburra Cricket Bat for Tennis Ball, Rubber Ball | Plastic Ball (Men|Women) (Black)"))
        movieList.add(BatMovie(R.drawable.cbat3,"Boldfit Turf Bat Cricket for Adults Plastic Tennis Cricket Bat for Mens Heavy Plastic Cricket Bats with Grip for Gully Cricket, Tournament Match Standard Full Size Tennis Ball Bat for Cricket - Black"))
        movieList.add(BatMovie(R.drawable.cbat5,"Classic Bat Popular Willow Hard Pressed Shaped For Superb Stroke SG Cricket Bat (Red)"))
        movieList.add(BatMovie(R.drawable.cbat6,"Cricket Bat Full Size Popular Willow SS Cricket Bat with Bat Cover Play for Tennis Ball/Rubber Ball/Plastic Ball (Green)"))
        movieList.add(BatMovie(R.drawable.cbat7,"Cricket Bat Full Size Popular Willow SG Cricket Bat with Bat Cover Play for Tennis Ball | Rubber Ball | Plastic Ball (Black & White)"))
        movieList.add(BatMovie(R.drawable.cbat2,"STEFFER Kashmir Willow Cricket Bat Hard/Tennis Ball Bat Short Handle with for Men and Women (Style 1)"))
        movieList.add(BatMovie(R.drawable.bat1,"STEFFER Kashmir Willow Cricket Bat Hard/Tennis Ball Bat Short Handle with for Men and Women (Style 1)"))
        movieList.add(BatMovie(R.drawable.cbat3,"AENOX Special Grand Edition Bat Master Kashmir Willow Cricket Bat Suitable for Soft Tennis Ball Extra Sturdy Grip | Ready to Play | Extra Protective Fishing Tape | Red|| (6)"))
        movieList.add(BatMovie(R.drawable.cbat6,"GM Six6 F2 909 English Willow Cricket Bat Short Handle Mens"))

        adapter = BatAdapter(movieList, this@CricketBatEx)

        recyclerView.adapter = adapter
        recyclerView.setHasFixedSize(true)
        recyclerView.layoutManager = LinearLayoutManager(this)

    }

    override fun onClick(position: Int) {
        when(position){
            0 -> startActivity(Intent(this,MrfEx::class.java))
            1 -> startActivity(Intent(this,KokoEx::class.java))
        }
    }
}