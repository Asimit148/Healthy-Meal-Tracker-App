package com.example.healthymealtrackerapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MealView : AppCompatActivity() {

    private lateinit var buttonShowMeals: Button
    private lateinit var buttonShowAll: Button
    private lateinit var buttonBackToHome: Button
    private lateinit var displayHeader: TextView
    private lateinit var displayAllIMeals: TextView
    private lateinit var displayFilteredMeals: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meal_view)

        // Link UI components
        buttonShowMeals = findViewById(R.id.buttonShowMeals)
        buttonShowAll = findViewById(R.id.buttonShowAll)
        buttonBackToHome = findViewById(R.id.buttonBackToHome)
        displayHeader = findViewById(R.id.displayHeader)
        displayAllIMeals = findViewById(R.id.displayAllIMeals)
        displayFilteredMeals = findViewById(R.id.displayFilteredMeals)

        // Get lists from Intent
        val descriptionList = intent.getStringArrayListExtra("descriptionList")
        val typeList = intent.getStringArrayListExtra("typeList")
        val caloriesList = intent.getIntegerArrayListExtra("caloriesList")
        val notesList = intent.getStringArrayListExtra("notesList")

        // Show all meals
        buttonShowMeals.setOnClickListener {
            if (descriptionList != null && typeList != null && caloriesList != null && notesList != null) {
                val fullList = descriptionList.indices.joinToString("\n") {
                    "${descriptionList[it]} (${typeList[it]}) - ${caloriesList[it]} cal: ${notesList[it]}"
                }
                displayAllIMeals.text = fullList.ifBlank { "No meals added." }
            } else {
                displayAllIMeals.text = "No meals added."
            }
        }

        // Show meals with 300+ calories
        buttonShowAll.setOnClickListener {
            if (descriptionList != null && caloriesList != null) {
                val filtered = descriptionList.indices
                    .filter { caloriesList[it] >= 300 }
                    .joinToString("\n") {
                        "${descriptionList[it]} (Calories: ${caloriesList[it]})"
                    }
                displayFilteredMeals.text = filtered.ifBlank { "No meals with 300+ calories." }
            } else {
                displayFilteredMeals.text = "No meals with 300+ calories."
            }
        }

        // Back to previous screen
        buttonBackToHome.setOnClickListener {
            finish()
        }
    }
}