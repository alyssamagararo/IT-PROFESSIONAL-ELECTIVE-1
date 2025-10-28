//Magararo, Alyssa M.
//BSIT-3B
//Exercise #6

package com.example.mainactivity

import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class Exercise6Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise6)

        val btnAction1 = findViewById<Button>(R.id.btnAction1)
        val btnAction2 = findViewById<Button>(R.id.btnAction2)
        val imgExample = findViewById<ImageView>(R.id.imgExample)

        btnAction1.setOnClickListener {
            Toast.makeText(this, "Button 1 clicked", Toast.LENGTH_SHORT).show()
        }

        btnAction2.setOnClickListener {
            Toast.makeText(this, "Button 2 clicked", Toast.LENGTH_SHORT).show()
        }

        // Optional: Set image programmatically
        imgExample.setImageResource(R.drawable.image1)
    }
}
