package com.example.localizationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    lateinit var greetingView : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        greetingView = findViewById(R.id.greetingView)

        val button : Button = findViewById(R.id.button)

        button.setOnClickListener{
            changeGreeting()
        }

    }

    fun changeGreeting() {
        greetingView.text = getString(R.string.new_greeting)
    }
}