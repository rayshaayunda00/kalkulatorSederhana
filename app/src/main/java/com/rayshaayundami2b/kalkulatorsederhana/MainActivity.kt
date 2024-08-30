package com.rayshaayundami2b.kalkulatorsederhana

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {

    private lateinit var number1: EditText
    private lateinit var number2: EditText
    private lateinit var btn_add: Button
    private lateinit var btn_sub: Button
    private lateinit var btn_mul: Button
    private lateinit var btn_div: Button
    private lateinit var answer: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main);

        number1 = findViewById(R.id.number1)
        number2 = findViewById(R.id.number2)
        btn_add= findViewById(R.id.btn_add)
        btn_sub= findViewById(R.id.btn_sub)
        btn_mul= findViewById(R.id.btn_mul)
        btn_div= findViewById(R.id.btn_div)
        answer= findViewById(R.id.answer)

        }
    }
