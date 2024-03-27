package com.example.fitnesstracker

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

// MainActivity.kt
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        findViewById<Button>(R.id.btnAddCalorie).setOnClickListener {
            // Create intent to navigate to AddFoodActivity
            val intent = Intent(this, AddCalorieActivity::class.java)
            startActivity(intent)
        }

        // Initialize RecyclerView and other components
    }
}
