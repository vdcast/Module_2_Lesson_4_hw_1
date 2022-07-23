package com.example.module_2_lesson_4_hw_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvNewGame.setOnClickListener {
            val toast = Toast.makeText(applicationContext,R.string.new_game,Toast.LENGTH_SHORT)
            toast.show()
        }
        tvContinue.setOnClickListener {
            val toast = Toast.makeText(applicationContext,R.string.continue1,Toast.LENGTH_SHORT)
            toast.show()
        }
        tvOptions.setOnClickListener {
            val toast = Toast.makeText(applicationContext,R.string.options,Toast.LENGTH_SHORT)
            toast.show()
        }
        tvAbout.setOnClickListener {
            val toast = Toast.makeText(applicationContext,R.string.about,Toast.LENGTH_SHORT)
            toast.show()
        }
    }
}