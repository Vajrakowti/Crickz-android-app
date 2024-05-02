package com.example.sportz.Kit

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.sportz.Payment2Ex
import com.example.sportz.PaymentEx
import com.example.sportz.R

class Kit1 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_kit1)


        val explicitButton = findViewById<Button>(R.id.BUYNOW2)

        explicitButton.setOnClickListener {
            val explicitIntent = Intent(this, Payment2Ex::class.java)
            startActivity(explicitIntent)
        }

    }
}