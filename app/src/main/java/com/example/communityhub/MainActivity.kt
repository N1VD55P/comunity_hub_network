package com.example.communityhub

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val actionButton: Button = findViewById(R.id.action_button)
        actionButton.setOnClickListener {
            Toast.makeText(this, "Welcome to the Community!", Toast.LENGTH_SHORT).show()
        }
    }
}
