package com.example.helloworld

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    lateinit var tvNumber: TextView
    lateinit var btnPlus: Button
    lateinit var btnMinus: Button

    private val TAG = "MainActivity"
    private var number = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvNumber = findViewById<TextView>(R.id.tvNumber)
        btnPlus = findViewById<Button>(R.id.btnPlus)
        btnMinus = findViewById<Button>(R.id.btnMinus)

        btnPlus.setOnClickListener { addNumber() }
        btnMinus.setOnClickListener { subNumber() }

    }

    private fun addNumber() {
        number++

        tvNumber.text = number.toString()
        tvNumber.setTextColor(Color.BLUE)
    }

    private fun subNumber() {
        number--

        tvNumber.text = number.toString()
        tvNumber.setTextColor(Color.RED)
    }
}
