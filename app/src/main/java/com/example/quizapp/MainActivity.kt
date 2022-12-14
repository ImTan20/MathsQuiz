package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //click start button to go to quiz
        startButton.setOnClickListener {
            if (inputName.text.toString().isEmpty()) {
                Toast.makeText(this, "Enter your name", Toast.LENGTH_LONG).show()
            } else {
                val intent = Intent(this, SecondActivity::class.java)
                startActivity(intent)
            }
        }
    }
}