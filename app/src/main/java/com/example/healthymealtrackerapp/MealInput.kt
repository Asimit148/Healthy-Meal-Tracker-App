package com.example.healthymealtrackerapp

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MealInput : AppCompatActivity() {

    // Updated list names to match the input fields more clearly
    private val dayList = arrayListOf<String>()          // Stores day or item name
    private val categoryList = arrayListOf<String>()     // Stores category (e.g. clothing)
    private val quantityList = arrayListOf<Int>()        // Stores quantities (e.g. 2)
    private val commentList = arrayListOf<String>()      // Stores comments (e.g. "For cold weather")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_input)

        // Link UI elements to Kotlin variables using exact XML IDs
        val inputDay = findViewById<EditText>(R.id.inputDay)
        val inputMorning = findViewById<EditText>(R.id.inputMorning)
        val inputAfternoon = findViewById<EditText>(R.id.inputAfternoon)
        val inputActivityNotes = findViewById<EditText>(R.id.inputActivityNotes)

        val buttonAdd = findViewById<Button>(R.id.buttonAdd)
        val buttonView = findViewById<Button>(R.id.buttonView)
        val buttonExit = findViewById<Button>(R.id.buttonExit)
        val buttonClear = findViewById<Button>(R.id.buttonClear)

        // Add to list button
        buttonAdd.setOnClickListener {
            val day = inputDay.text.toString()
            val category = inputMorning.text.toString()
            val quantityStr = inputAfternoon.text.toString()
            val comment = inputActivityNotes.text.toString()

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
            dayList.add(day)
            categoryList.add(category)
            quantityList.add(quantity)
            commentList.add(comment)

            Toast.makeText(this, "Item added to the list", Toast.LENGTH_SHORT).show()

            // Clear input fields
            inputDay.text.clear()
            inputMorning.text.clear()
            inputAfternoon.text.clear()
            inputActivityNotes.text.clear()
        }

        // View list button
        buttonView.setOnClickListener {
            val intent = Intent(this, ActivityDisplay::class.java)
            intent.putStringArrayListExtra("dayList", dayList)
            intent.putStringArrayListExtra("categoryList", categoryList)
            intent.putIntegerArrayListExtra("quantityList", quantityList)
            intent.putStringArrayListExtra("commentList", commentList)
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
