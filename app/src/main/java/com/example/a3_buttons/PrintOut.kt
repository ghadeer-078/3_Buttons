package com.example.a3_buttons

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class PrintOut : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_print_out)

        val tvMain = findViewById<TextView>(R.id.printView)

        val extra = intent.extras?.getString("value")

        tvMain.text = extra

    }


}