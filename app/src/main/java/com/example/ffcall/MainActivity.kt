package com.example.ffcall

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        val button = Button(this)
        button.text = "FF Call Now"
        button.textSize = 24f
        button.setOnClickListener {
            Toast.makeText(this, "FF Call Started!", Toast.LENGTH_SHORT).show()
        }
        
        setContentView(button)
    }
}
