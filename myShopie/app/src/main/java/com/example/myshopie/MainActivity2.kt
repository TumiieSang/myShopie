package com.example.myshopie

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val btnExit = findViewById<Button>(R.id.button7)
        btnExit.setOnClickListener {
            val intent = Intent(this, Splashscreen::class.java)
            startActivity(intent)
        }
    }
}