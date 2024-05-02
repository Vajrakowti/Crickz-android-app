package com.example.sportz

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class Payment2Ex : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment2_ex)

        val payynow = findViewById<Button>(R.id.paynow2)

        payynow.setOnClickListener{
            Toast.makeText(this,"Payment Successfull", Toast.LENGTH_SHORT).show()
        }

        val order = findViewById<Button>(R.id.cashon2)

        order.setOnClickListener{
            Toast.makeText(this,"Order Successfull", Toast.LENGTH_SHORT).show()
        }

    }
}