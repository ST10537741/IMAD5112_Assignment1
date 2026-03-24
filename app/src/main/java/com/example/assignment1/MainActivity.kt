package com.example.assignment1

import android.content.ContentValues.TAG
import android.content.Intent
import android.nfc.Tag
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        val getStartedButton = findViewById<Button>(R.id.getStartedButton)
        val welcomeTextView = findViewById<TextView>(R.id.welcomeTextView)

        getStartedButton.setOnClickListener {
// Create an intent to move from MainActivity to SocialSpark

            Log.d(TAG, "get started buton pressed")

            val intent = Intent(this, SocialSpark::class.java)
            startActivity(intent)

            Log.i(TAG, "Successfully taken to SocialSpark.kt")

        }
    }
}
