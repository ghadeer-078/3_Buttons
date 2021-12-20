package com.example.a3_buttons

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlin.random.Random


class MainActivity : AppCompatActivity() {

    lateinit var nameText: EditText
    lateinit var phoneText: EditText
    lateinit var locationText : EditText
    lateinit var alertBtn: Button
    lateinit var viewBtn: Button
    lateinit var printBtn: Button
    lateinit var tvMain : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        connectView()

        val list = listOf(
            nameText.text.toString(),
            locationText.text.toString(),
            phoneText.text.toString()
        )

        alertBtn.setOnClickListener {
            Toast.makeText(applicationContext,list[Random.nextInt(0,3)],Toast.LENGTH_SHORT).show()
        }

        viewBtn.setOnClickListener {
            tvMain.text = list[Random.nextInt(0,3)]
        }

        printBtn.setOnClickListener {
            val intent = Intent(this, PrintOut::class.java)
            intent.putExtra("value",list[Random.nextInt(0,3)])
            startActivity(intent)
        }


    }


    private fun connectView(){
        nameText = findViewById(R.id.nameText)
        locationText = findViewById(R.id.locationText)
        phoneText = findViewById(R.id.mobileText)
        tvMain = findViewById(R.id.viewHolder)
        alertBtn = findViewById(R.id.alertBtn)
        viewBtn = findViewById(R.id.viewBtn)
        printBtn = findViewById(R.id.printBtn)
    }

}