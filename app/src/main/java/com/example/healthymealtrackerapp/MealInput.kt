package com.example.healthymealtrackerapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MealInput : AppCompatActivity() {

    private val descriptionList = arrayListOf<String>()
    private val typeList = arrayListOf<String>()
    private val caloriesList = arrayListOf<Int>()
    private val notesList = arrayListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_input)

        // Link all input fields
        val inputMealDescription = findViewById<EditText>(R.id.inputMealDescription)
        val inputMealType = findViewById<EditText>(R.id.inputMealType)
        val inputCalories = findViewById<EditText>(R.id.inputCalories)
        val inputNotes = findViewById<EditText>(R.id.inputNotes)

        // Link buttons
        val buttonAdd = findViewById<Button>(R.id.buttonAdd)
        val buttonView = findViewById<Button>(R.id.buttonView)
        val buttonClear = findViewById<Button>(R.id.buttonClear)
        val buttonExit = findViewById<Button>(R.id.buttonExit)

        // Add to list
        buttonAdd.setOnClickListener {
            val description = inputMealDescription.text.toString()
            val type = inputMealType.text.toString()
            val caloriesStr = inputCalories.text.toString()
            val notes = inputNotes.text.toString()

            // Input validation
            if (description.isBlank() || type.isBlank() || caloriesStr.isBlank()) {
                Toast.makeText(this, "Please fill in all required fields", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            val calories = caloriesStr.toIntOrNull()
            if (calories == null || calories <= 0) {
                Toast.makeText(this, "Calories must be a positive number", Toast.LENGTH_SHORT).show()
                return@setOnClickListener
            }

            // Add to lists
            descriptionList.add(description)
            typeList.add(type)
            caloriesList.add(calories)
            notesList.add(notes)

            Toast.makeText(this, "Meal added to the list", Toast.LENGTH_SHORT).show()

            // Clear inputs
            inputMealDescription.text.clear()
            inputMealType.text.clear()
            inputCalories.text.clear()
            inputNotes.text.clear()
        }

        // View list
        buttonView.setOnClickListener {
            val intent = Intent(this, MealViewer::class.java)
            intent.putStringArrayListExtra("descriptionList", descriptionList)
            intent.putStringArrayListExtra("typeList", typeList)
            intent.putIntegerArrayListExtra("caloriesList", ArrayList(caloriesList))
            intent.putStringArrayListExtra("notesList", notesList)
            startActivity(intent)
        }

        // Clear inputs
        buttonClear.setOnClickListener {
            inputMealDescription.text.clear()
            inputMealType.text.clear()
            inputCalories.text.clear()
            inputNotes.text.clear()
            Toast.makeText(this, "Inputs cleared!", Toast.LENGTH_SHORT).show()
        }

        // Exit app
        buttonExit.setOnClickListener {
            finishAffinity()
        }
    }
}
