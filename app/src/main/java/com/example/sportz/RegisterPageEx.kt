package com.example.sportz

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class RegisterPageEx : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register_page_ex)

        val explicitButton2 = findViewById<Button>(R.id.register)

        explicitButton2.setOnClickListener {
            val explicitIntent = Intent(this,LoginPageEx::class.java)
            startActivity(explicitIntent)
            Toast.makeText(this,"Registered", Toast.LENGTH_SHORT).show()
        }
    }
}