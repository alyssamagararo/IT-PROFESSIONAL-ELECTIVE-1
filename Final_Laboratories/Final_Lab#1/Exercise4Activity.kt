//Magararo, Alyssa M.
//BSIT-3B
//Exercise #4

package com.example.mainactivity

import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.ToggleButton
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Exercise4Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise4)

        val toggleButton = findViewById<ToggleButton>(R.id.toggleButton)
        val submitButton = findViewById<Button>(R.id.btnStandard) // using standard button as submit
        val imageButton = findViewById<ImageButton>(R.id.imgButton)

        // ToggleButton initial state can be OFF or ON
        toggleButton.isChecked = false

        // Submit button behavior
        submitButton.setOnClickListener {
            if (toggleButton.isChecked) {
                Toast.makeText(this, "Toggle is ON", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "Toggle is OFF", Toast.LENGTH_SHORT).show()
            }
        }

        // Optional: ImageButton click just shows a toast
        imageButton.setOnClickListener {
            Toast.makeText(this, "Image Button clicked", Toast.LENGTH_SHORT).show()
        }
    }
}
