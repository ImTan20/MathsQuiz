package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_second.*
import kotlinx.android.synthetic.main.activity_second.btn_answer13
import kotlinx.android.synthetic.main.activity_third.*

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)
        btn_answer21.setOnClickListener {
            val intent = Intent(this, FourthActivity::class.java)
            startActivity(intent)
        }
        btn_answer22.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
        btn_answer23.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }
        btn_answer24.setOnClickListener {
            val intent = Intent(this, SecondActivity::class.java)
            startActivity(intent)
        }

    }
}