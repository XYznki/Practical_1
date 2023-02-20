package com.example.practical1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState) //parent class
        //Load UI to the memory
        //R = resources class
        setContentView(R.layout.activity_main)

        //Declare UI Variable
        //val for value
        //var for variable
        //if you want to change the value of the variable, then use var, vise versa

        val textViewName : TextView = findViewById(R.id.textViewName)
        val textViewQR : TextView = findViewById(R.id.textViewName)
        val buttonShow : Button = findViewById(R.id.buttonShow)
        val buttonHide : Button = findViewById(R.id.buttonHide)


        //declare Event Handler
        buttonShow.setOnClickListener()
        {
            textViewName.visibility
        }

        buttonHide.setOnClickListener()
        {

        }
    }
}