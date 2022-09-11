package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_fifth.*
import kotlinx.android.synthetic.main.activity_fifth.btn_answer44
import kotlinx.android.synthetic.main.activity_second.*
import kotlinx.android.synthetic.main.activity_sixth.*

class SixthActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sixth)
        btn_answer52.setOnClickListener {
            val intent = Intent(this, SeventhActivity::class.java)
            startActivity(intent)
        }
        btn_answer51.setOnClickListener {
            val intent = Intent(this, FifthActivity::class.java)
            startActivity(intent)
        }
        btn_answer53.setOnClickListener {
            val intent = Intent(this, FifthActivity::class.java)
            startActivity(intent)
        }
        btn_answer54.setOnClickListener {
            val intent = Intent(this, FifthActivity::class.java)
            startActivity(intent)
        }

    }
}