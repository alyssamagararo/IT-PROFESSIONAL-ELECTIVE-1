//Magararo, Alyssa M.
//BSIT-3B
//Exercise #5

package com.example.mainactivity

import android.os.Bundle
import android.widget.Button
import android.widget.ImageSwitcher
import android.widget.ImageView
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity

class Exercise5Activity : AppCompatActivity() {

    // Small drawable images must exist in res/drawable
    private val images = arrayOf(R.drawable.image1, R.drawable.image2)
    private var currentIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_exercise5)

        val imageSwitcher = findViewById<ImageSwitcher>(R.id.imageSwitcher)
        imageSwitcher.setFactory {
            val imageView = ImageView(this)
            imageView.scaleType = ImageView.ScaleType.CENTER_INSIDE
            imageView.layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
            )
            imageView
        }

        // Set initial image
        imageSwitcher.setImageResource(images[currentIndex])

        // Button to switch images
        val btnSwitch = findViewById<Button>(R.id.btnSwitch)
        btnSwitch.setOnClickListener {
            currentIndex = (currentIndex + 1) % images.size
            imageSwitcher.setImageResource(images[currentIndex])
        }
    }
}
