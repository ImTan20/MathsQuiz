package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_fifth.*
import kotlinx.android.synthetic.main.activity_fourth.*
import kotlinx.android.synthetic.main.activity_fourth.btn_answer34
import kotlinx.android.synthetic.main.activity_second.*

class FifthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_fifth)
        btn_answer44.setOnClickListener {
            val intent = Intent(this, SixthActivity::class.java)
            startActivity(intent)
        }
        btn_answer41.setOnClickListener {
            val intent = Intent(this, FourthActivity::class.java)
            startActivity(intent)
        }
        btn_answer42.setOnClickListener {
            val intent = Intent(this, FourthActivity::class.java)
            startActivity(intent)
        }
        btn_answer43.setOnClickListener {
            val intent = Intent(this, FourthActivity::class.java)
            startActivity(intent)
        }

    }
}