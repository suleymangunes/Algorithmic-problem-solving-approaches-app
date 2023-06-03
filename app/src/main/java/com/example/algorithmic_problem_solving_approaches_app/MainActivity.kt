package com.example.algorithmic_problem_solving_approaches_app

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {

    lateinit var btnReverseString: Button

    var algorithmNameKey = "algorithmName"
    var algorithmQuestionKey = "algorithmQuestion"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnReverseString = findViewById(R.id.btnReverseString)

        btnReverseString.setOnClickListener(){
            var intent = Intent(this, QuestionPage::class.java)
            var algorithmName = btnReverseString.text.toString()
            var algorithmQuestion = "How do you find the reverse of a string?"
            intent.putExtra(algorithmNameKey, algorithmName)
            intent.putExtra(algorithmQuestionKey, algorithmQuestion)
            startActivity(intent)
        }
    }
}