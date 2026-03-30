package com.example.assignment1

import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import android.widget.TextView
import android.widget.EditText
import android.content.ContentValues.TAG
import com.airbnb.lottie.LottieAnimationView
import android.view.View

class SocialSpark : AppCompatActivity() {

    lateinit var lottieFullScreen: LottieAnimationView // Full screen animation

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.spark_social) // points to the spark_social XML

        val socialSparkEditText = findViewById<EditText>(R.id.socialSparkEditText)
        val confirmButton = findViewById<Button>(R.id.confirmButton)
        val resetButton = findViewById<Button>(R.id.resetButton)
        val socialSparkTextView = findViewById<TextView>(R.id.socialSparkTextView)
        lottieFullScreen = findViewById(R.id.lottieFullScreen)


        // create button press event for when statement

        confirmButton.setOnClickListener {

            Log.d(TAG, "confirm that the confirm button has been pressed")


            val timeOfDay = socialSparkEditText.text.toString()  // declaring val timeOfDay to EditText
            when (timeOfDay) {
                "Morning" -> socialSparkTextView.text = ("send a 'good morning' text to a family member.")
                "Mid-morning" -> socialSparkTextView.text = ("Reach out to a colleague with a quick 'Thank you.'")
                "Afternoon" -> socialSparkTextView.text = ("Share a funny meme or interesting link with a friend.")
                "Afternoon Snack-Time" -> socialSparkTextView.text = ("Send a quick 'thinking of you' message.")
                "Dinner" -> socialSparkTextView.text = ("Call a friend or relative for a quick 5-minute catch-up.")
                "After Dinner" -> socialSparkTextView.text = ("Leave a thoughtful comment on a friend's post.")
                else -> socialSparkTextView.text = ("Please enter a valid time of day. " + " ie. 'Dinner' or Afternoon.' " +
                        "Capitalise first letter of each word.")  // if the user does not input a valid time of day this message will be displayed

            }
            Log.i(TAG, "the appropriate message is printed in the TextView")

            // Show full-screen animation

            lottieFullScreen.visibility = View.VISIBLE

            // Allows the animation to play

            lottieFullScreen.playAnimation()

            // Hides the animation after it's finished playing

            lottieFullScreen.postDelayed({
                lottieFullScreen.visibility = View.GONE
            }, 2000)


        }
        resetButton.setOnClickListener {
            // make resetButton erase all results

            Log.d(TAG, "confirm that reset button has been pressed")


            socialSparkEditText.text.clear()
            socialSparkTextView.text = "Your social spark suggestion will appear here."

            Log.i(TAG, "confirm that all fields have been erased")

        }
    }
}
