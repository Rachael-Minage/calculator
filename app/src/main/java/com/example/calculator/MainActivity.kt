package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    lateinit var btnAdd : Button
    lateinit var btnSub : Button
    lateinit var btnMulti : Button
    lateinit var btnModulus: Button
    lateinit var etNumberOne: EditText
    lateinit var etNumberTwo: EditText
    lateinit var tvResult: TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdd = findViewById(R.id.btnAdd)
        btnSub = findViewById(R.id.btnSub)
        btnMulti = findViewById(R.id.btnMulti)
        btnModulus = findViewById(R.id.btnModulus)
        etNumberTwo = findViewById(R.id.etNumberTwo)
        etNumberOne = findViewById(R.id.etNumberOne)
        tvResult = findViewById(R.id.tvResult)

        btnAdd.setOnClickListener {
            val numOne = etNumberOne.text.toString()
            val numTwo = etNumberTwo.text.toString()

            if (numOne.isBlank()){
                etNumberOne.error = "Number is required"
                return@setOnClickListener
            }
            if (numTwo.isBlank()){
                etNumberTwo.error = "Number is required"
                return@setOnClickListener
            }
            addition(numOne.toInt(), numTwo.toInt())
        }
        btnSub.setOnClickListener {
            val numOne = etNumberOne.text.toString()
            val numTwo = etNumberTwo.text.toString()
            if (numOne.isBlank()){
                etNumberOne.error = "Number is required"
                return@setOnClickListener
            }
            if (numTwo.isBlank()){
                etNumberTwo.error = "Number is required"
                return@setOnClickListener
            }
            subtraction(numOne.toInt(), numTwo.toInt())

        }
        btnMulti.setOnClickListener {
            val numOne = etNumberOne.text.toString()
            val numTwo = etNumberTwo.text.toString()
            if (numOne.isBlank()){
                etNumberOne.error = "Number is required"
                return@setOnClickListener
            }
            if (numTwo.isBlank()){
                etNumberTwo.error = "Number is required"
                return@setOnClickListener
            }
            multiplication(numOne.toInt(),numTwo.toInt())

    }
        btnModulus.setOnClickListener {
            val numOne = etNumberOne.text.toString()
            val numTwo = etNumberTwo.text.toString()
            if (numOne.isBlank()){
                etNumberOne.error = "Number is required"
                return@setOnClickListener
            }
            if (numTwo.isBlank()){
                etNumberTwo.error = "Number is required"
                return@setOnClickListener
            }
            modulus(numOne.toInt(),numTwo.toInt())
        }

}
    fun addition(numOne: Int, numTwo: Int){
        val add = numOne + numTwo
        tvResult.text = add.toString()

    }
    fun subtraction(numOne: Int,numTwo: Int){
        val subtract = numOne-numTwo
        tvResult.text = subtract.toString()
    }
    fun multiplication(numOne: Int,numTwo: Int){
        val product = numOne*numTwo
        tvResult.text = product.toString()
    }
    fun modulus(numOne: Int,numTwo: Int){
        val remainder= numOne%numTwo
        tvResult.text = remainder.toString()
    }
}