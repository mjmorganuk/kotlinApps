package com.mm.apps

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() , View.OnClickListener  {

    lateinit var btnAdd : Button
    lateinit var btnSub : Button
    lateinit var btnMul : Button
    lateinit var btnDiv : Button
    lateinit var etA : EditText
    lateinit var etB : EditText
    lateinit var tvResult : TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnAdd = findViewById(R.id.btn_add)
        btnSub = findViewById(R.id.btn_sub)
        btnMul = findViewById(R.id.btn_mul)
        btnDiv = findViewById(R.id.btn_div)

        etA = findViewById(R.id.et_a)
        etB = findViewById(R.id.et_b)

        tvResult = findViewById(R.id.tv_result)

        btnAdd.setOnClickListener(this)
        btnSub.setOnClickListener(this)
        btnMul.setOnClickListener(this)
        btnDiv.setOnClickListener(this)
    }

    override fun onClick(v: View?) {

        val a = etA.text.toString().toDouble()
        val b = etB.text.toString().toDouble()

        var result = 0.0

        when (v?.id ){
            R.id.btn_add ->{
                result = a+b
            }
            R.id.btn_sub ->{
                result = a-b
            }
            R.id.btn_mul ->{
                result = a*b
            }
            R.id.btn_div ->{
                result = a/b
            }

        }

        tvResult.text = "Result is $result"
    }
}































