package com.example.fitnesstracker

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.example.fitnesstracker.R

// AddFoodActivity.kt
class AddCalorieActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_calorie)

        findViewById<Button>(R.id.btnSaveCalorieEntry).setOnClickListener {
            val foodName = findViewById<EditText>(R.id.editTextFoodName).text.toString()
            val calories = findViewById<EditText>(R.id.editTextCalories).text.toString()

            // Handle the input data (e.g., save to database)
            // For example, you can create an Intent to pass the data back to the main activity
            val resultIntent = Intent()
            resultIntent.putExtra("foodName", foodName)
            resultIntent.putExtra("calories", calories)
            setResult(Activity.RESULT_OK, resultIntent)
            finish() // Finish this activity and return to the main activity
        }
    }
}
