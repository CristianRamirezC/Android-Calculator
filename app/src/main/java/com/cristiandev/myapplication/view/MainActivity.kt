package com.cristiandev.myapplication.view

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ScrollView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.cristiandev.myapplication.R
import com.cristiandev.myapplication.model.*


class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setViewOnClickListeners()
    }

    private fun setViewOnClickListeners() {
        var btn0: Button = findViewById(R.id.btn0)
        var btn1: Button = findViewById(R.id.btn1)
        var btn2: Button = findViewById(R.id.btn2)
        var btn3: Button = findViewById(R.id.btn3)
        var btn4: Button = findViewById(R.id.btn4)
        var btn5: Button = findViewById(R.id.btn5)
        var btn6: Button = findViewById(R.id.btn6)
        var btn7: Button = findViewById(R.id.btn7)
        var btn8: Button = findViewById(R.id.btn8)
        var btn9: Button = findViewById(R.id.btn9)
        var btnAc: Button = findViewById(R.id.btnAc)
        var btnDivide: Button = findViewById(R.id.btnDivide)
        var btnMultiply: Button = findViewById(R.id.btnMultiply)
        var btnSubtract: Button = findViewById(R.id.btnSubtract)
        var btnAdd: Button = findViewById(R.id.btnAdd)
        var btnEqualsTo: Button = findViewById(R.id.btnEqualsTo)
        var btnComma: Button = findViewById(R.id.btnComma)
        var btnDelete: ImageButton = findViewById(R.id.btnDelete)
        var tvResult: TextView = findViewById(R.id.tvResult)
        var svResult: ScrollView = findViewById(R.id.svResult)
        ButtonNumber0().setViewOnClickListener(btn0, tvResult)
        ButtonNumber1().setViewOnClickListener(btn1, tvResult)
        ButtonNumber2().setViewOnClickListener(btn2, tvResult)
        ButtonNumber3().setViewOnClickListener(btn3, tvResult)
        ButtonNumber4().setViewOnClickListener(btn4, tvResult)
        ButtonNumber5().setViewOnClickListener(btn5, tvResult)
        ButtonNumber6().setViewOnClickListener(btn6, tvResult)
        ButtonNumber7().setViewOnClickListener(btn7, tvResult)
        ButtonNumber8().setViewOnClickListener(btn8, tvResult)
        ButtonNumber9().setViewOnClickListener(btn9, tvResult)
        ButtonAc().setViewOnClickListener(btnAc, tvResult)
        ButtonDelete().setViewOnClickListener(btnDelete, tvResult)
        ButtonComma().setViewOnClickListener(btnComma, tvResult)
        ButtonAdd().setViewOnClickListener(btnAdd, tvResult)
        ButtonSubtract().setViewOnClickListener(btnSubtract, tvResult)
        ButtonMultiply().setViewOnClickListener(btnMultiply, tvResult)
        ButtonDivide().setViewOnClickListener(btnDivide, tvResult)
        ButtonEqualsTo().setViewOnClickListener(btnEqualsTo, tvResult)
        setScrollViewConfig(svResult)
    }


    private fun setScrollViewConfig(svResult: View) {
        svResult as ScrollView
        svResult.post { svResult.fullScroll(View.FOCUS_DOWN) }
    }
}

/*
class  ResultTextView{
    fun setResultTextView(view: View, tvResult: TextView) {
        var result: String = tvResult.text.toString()
        var btnPressed: String = view.tag.toString()
        if (result == "0") {
            result = ""
        }
        when(btnPressed) {
            "btn0"-> tvResult.setText(result + "0")
            "btn1"-> tvResult.setText(result + "1")
            "btn2"-> tvResult.setText(result + "2")
            "btn3"-> tvResult.setText(result + "3")
            "btn4"-> tvResult.setText(result + "4")
            "btn5"-> tvResult.setText(result + "5")
            "btn6"-> tvResult.setText(result + "6")
            "btn7"-> tvResult.setText(result + "7")
            "btn8"-> tvResult.setText(result + "8")
            "btn9"-> tvResult.setText(result + "9")
            "btnAc"-> tvResult.setText("0")
            "btnDelete" -> deleteButton()
            "btnEqualsTo" -> equalsToButton()
            else -> pressOperationButtons(view)
        }
    }
}*/
