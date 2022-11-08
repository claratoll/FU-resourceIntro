package com.example.resourscesintro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity() {

    lateinit var greetingView : TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        greetingView = findViewById(R.id.textView)

        val button = findViewById<Button>(R.id.button)

        button.setOnClickListener{
            handleButtonPress()
        }
    }


    fun handleButtonPress(){
        greetingView.text = getString(R.string.surprise)
    }
}