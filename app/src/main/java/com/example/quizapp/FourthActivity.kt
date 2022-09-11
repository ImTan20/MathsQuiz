package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_fourth.*
import kotlinx.android.synthetic.main.activity_second.*
import kotlinx.android.synthetic.main.activity_third.*
import kotlinx.android.synthetic.main.activity_third.btn_answer21

class FourthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fourth)
        btn_answer34.setOnClickListener {
            val intent = Intent(this, FifthActivity::class.java)
            startActivity(intent)
        }
        btn_answer31.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }
        btn_answer32.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }
        btn_answer33.setOnClickListener {
            val intent = Intent(this, ThirdActivity::class.java)
            startActivity(intent)
        }

    }
}