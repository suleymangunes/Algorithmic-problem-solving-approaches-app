package com.example.algorithmic_problem_solving_approaches_app

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView

class QuestionPage : AppCompatActivity() {

    lateinit var txtQuestionTitle: TextView
    lateinit var btnBack: ImageButton
    lateinit var txtQuestionDescription: TextView
    lateinit var txtInput: EditText
    lateinit var btnEnter: Button
    lateinit var txtResult: TextView

    var algorithmNameKey = "algorithmName"
    var algorithmQuestionKey = "algorithmQuestion"
    var reverseString = "Reverse String"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_question_page)

        txtQuestionTitle = findViewById(R.id.txtQuestionTitle)
        btnBack = findViewById(R.id.btnBack)
        txtQuestionDescription = findViewById(R.id.txtQuestionDescription)
        txtInput = findViewById(R.id.txtInput)
        btnEnter = findViewById(R.id.btnEnter)
        txtResult = findViewById(R.id.txtResult)

        var algorithmName = intent.getStringExtra(algorithmNameKey)
        var algorithmQuestion = intent.getStringExtra(algorithmQuestionKey)

        if (algorithmName != null){
            txtQuestionTitle.setText(algorithmName)
        }
        if (algorithmQuestion != null){
            txtQuestionDescription.setText(algorithmQuestion)
        }

        btnBack.setOnClickListener(){
            finish()
        }

        btnEnter.setOnClickListener(){
            var inputText = txtInput.text.toString()
            if(algorithmName == reverseString){
                reverseStringFunction(inputText)
            }
        }
    }

    fun reverseStringFunction(input:String){
        var reversedInput = ""
        var inputLength = input.length -1
        for (i in 0..inputLength){
            reversedInput += input[inputLength]
            inputLength --
        }
        setResult(reversedInput)
    }

    fun setResult(result:String){
        txtResult.setText(result)
    }
}