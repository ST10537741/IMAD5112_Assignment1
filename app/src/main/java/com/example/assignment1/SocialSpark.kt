package com.example.assignment1

import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.widget.EditText
class SocialSpark : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.spark_social) // points to the spark_social XML

        val socialSParkEditText = findViewById<EditText>(R.id.socialSparkEditText)
        val confirmButton = findViewById<Button>(R.id.confirmButton)
        val resetButton = findViewById<Button>(R.id.resetButton)
        val socialSparkTextView = findViewById<TextView>(R.id.socialSparkTextView)

        



    }
}