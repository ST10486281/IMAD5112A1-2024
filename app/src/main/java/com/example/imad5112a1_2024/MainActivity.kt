package com.example.imad5112a1_2024

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)



        val button = findViewById<Button>(R.id.button)


        val textView = findViewById<TextView>(R.id.textView)
        val editTextText = findViewById<EditText>(R.id.editTextText)


        button?.setOnClickListener {

            val numberValue = editTextText.text.toString().toIntOrNull()

            var result: String = ""

            if(numberValue == null){
                result = "Please enter a number."
            } else {
                if(numberValue < 10){
                    result = "Please enter a number higher than 10"
                } else if(10 < numberValue && numberValue <= 15) {
                    result = getString(R.string.from10To15)
                } else if(15 < numberValue && numberValue <= 20) {
                    result = "Joan of Arc – French heroine and martyr (died at 19)"
                } else if(20 < numberValue && numberValue <= 25) {
                    result = "Tupac Shakur – Rapper and activist (died at 25)"
                } else if(25 < numberValue && numberValue <= 30) {
                    result = "Heath Ledger – Actor (died at 28)"
                } else if(30 < numberValue && numberValue <= 35) {
                    result = "Bruce Lee – Martial artist and actor (died at 32)"
                } else if(35 < numberValue && numberValue <= 40) {
                    result = "Amelia Earhart – Aviator and explorer (disappeared at 39)"
                } else if(40 < numberValue && numberValue <= 45) {
                    result = "Chadwick Boseman – Actor (died at 43)"
                } else if(45 < numberValue && numberValue <= 50) {
                    result = "George Orwell – Author of 1984 and Animal Farm (died at 46)"
                } else if(50 < numberValue && numberValue <= 55) {
                    result = "George Michael – Pop legend and former Wham! member (died at 53)"
                } else if(55 < numberValue && numberValue <= 60) {
                    result = "Steve Jobs – Co-founder of Apple (died at 56)"
                } else if(60 < numberValue && numberValue <= 65) {
                    result = "Anthony Bourdain – Renowned chef, author, and travel documentarian (died at 61)"
                } else if(65 < numberValue && numberValue <= 70) {
                    result = "Leonardo da Vinci – Inventor and artist (died at 67)"
                }
            }



            textView.text = result




        }
    }
}