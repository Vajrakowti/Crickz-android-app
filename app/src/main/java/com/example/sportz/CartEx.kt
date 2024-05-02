package com.example.sportz

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class CartEx : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cart_ex)

        val gohomee = findViewById<Button>(R.id.gohome)

        gohomee.setOnClickListener {
            val explicitIntent = Intent(this,MainActivity::class.java)
            startActivity(explicitIntent)
        }

    }
}