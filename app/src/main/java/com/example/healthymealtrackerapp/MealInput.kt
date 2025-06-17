package com.example.healthymealtrackerapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MealInput : AppCompatActivity() {

    // Updated list names to match the input fields more clearly
    private val DescriptionList = arrayListOf<String>() // Stores description of the meal
    private val TypeList = arrayListOf<String>() // Stores category the meal falls into
    private val CaloriesList = arrayListOf<Int>() // Stores calories of the meal
    private val NotesList = arrayListOf<String>() // Stores notes.

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_input)

        // Link UI elements to Kotlin variables using exact XML IDs
       val inputMealDescripton= findViewById<EditText>(R.id.inputMealDescription)
        // Add to list button
        buttonAdd.setOnClickListener {
            val Description = inputMealDiscription.text.toString()
            val Type = inputMealType.text.toString()
            val Calories = inputCalories.text.toString()
            val Notes = inputNotesList.text.toString()

            // Validate input
            if (day.isBlank() || category.isBlank() || quantityStr.isBlank()) {
                Toast.makeText(this, "Please fill in all fields", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val quantity = quantityStr.toIntOrNull()
            if (quantity == null || quantity <= 0) {
                Toast.makeText(this, "Quantity must be a positive number", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // Add values to lists
            descriptionList.add(description)
            typeList.add(type)
            categoryList.add(category)
            notesList.add(notes)

            Toast.makeText(this, "Meal added to the list", Toast.LENGTH_SHORT).show()

            // Clear input fields
            inputMealDiscription.text.clear()
            inputMealType.text.clear()
            inputCalories.text.clear()
            inputActivityNotes.text.clear()
        }

        // View list button
        buttonView.setOnClickListener {
            val intent = Intent(this, ActivityDisplay::class.java)
            intent.putStringArrayListExtra("descriptionList", descriptionList)
            intent.putStringArrayListExtra("typeList", typeList)
            intent.putStringArrayListExtra("categoryList", categoryList)
            intent.putStringArrayListExtra("notesList", notesList)
            startActivity(intent)
        }

        // Clear input fields
        buttonClear.setOnClickListener {
            inputDay.text.clear()
            inputMorning.text.clear()
            inputAfternoon.text.clear()
            inputActivityNotes.text.clear()
            Toast.makeText(this, "Inputs cleared!", Toast.LENGTH_SHORT).show()
        }

        // Exit app
        buttonExit.setOnClickListener {
            finishAffinity() // Close the app completely
        }
    }
}
