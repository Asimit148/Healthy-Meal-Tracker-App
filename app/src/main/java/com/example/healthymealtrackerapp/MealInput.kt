package com.example.healthymealtrackerapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MealInput : AppCompatActivity() {

    private val descriptionList = arrayListOf<String>()
    private val typeList = arrayListOf<String>()
    private val caloriesList = arrayListOf<Int>()
    private val notesList = arrayListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_meal_input)

        // Link input fields
        val inputMealDescription = findViewById<EditText>(R.id.inputMealDescription)
        val inputMealType = findViewById<EditText>(R.id.inputMealType)
        val inputCalories = findViewById<EditText>(R.id.inputCalories)
        val inputMealNotes = findViewById<EditText>(R.id.inputMealNotes)

        // Link buttons
        val buttonAdd = findViewById<Button>(R.id.buttonAdd)
        val buttonView = findViewById<Button>(R.id.buttonView)
        val buttonClear = findViewById<Button>(R.id.buttonClear)
        val buttonExit = findViewById<Button>(R.id.buttonExit)

        // Add to list
        buttonAdd.setOnClickListener {
            val description = inputMealDescription.text.toString().trim()
            val type = inputMealType.text.toString().trim()
            val caloriesStr = inputCalories.text.toString().trim()
            val notes = inputMealNotes.text.toString().trim()

            if (description.isEmpty() || type.isEmpty() || caloriesStr.isEmpty()) {
                Toast.makeText(this, "Please fill in all required fields", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val calories = caloriesStr.toIntOrNull()
            if (calories == null || calories <= 0) {
                Toast.makeText(this, "Calories must be a positive number", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            descriptionList.add(description)
            typeList.add(type)
            caloriesList.add(calories)
            notesList.add(notes)

            Toast.makeText(this, "Meal added to the list", Toast.LENGTH_SHORT).show()

            inputMealDescription.text.clear()
            inputMealType.text.clear()
            inputCalories.text.clear()
            inputMealNotes.text.clear()
        }

        // View list
        buttonView.setOnClickListener {
            val intent = Intent(this, MealView::class.java)
            intent.putStringArrayListExtra("descriptionList", ArrayList(descriptionList))
            intent.putStringArrayListExtra("typeList", ArrayList(typeList))
            intent.putIntegerArrayListExtra("caloriesList", ArrayList(caloriesList))
            intent.putStringArrayListExtra("notesList", ArrayList(notesList))
            startActivity(intent)
        }

        // Clear inputs
        buttonClear.setOnClickListener {
            inputMealDescription.text.clear()
            inputMealType.text.clear()
            inputCalories.text.clear()
            inputMealNotes.text.clear()
            Toast.makeText(this, "Inputs cleared!", Toast.LENGTH_SHORT).show()
        }

        // Exit app
        buttonExit.setOnClickListener {
            finishAffinity()
        }
    }
}
