package com.example.sportz.Bat

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.sportz.PaymentEx
import com.example.sportz.R
import com.example.sportz.RegisterPageEx

class KokoEx : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_koko_ex)

        val explicitButton = findViewById<Button>(R.id.BUYNOW)

        explicitButton.setOnClickListener {
            val explicitIntent = Intent(this, PaymentEx::class.java)
            startActivity(explicitIntent)
        }

    }
}