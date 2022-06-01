package com.cristiandev.myapplication.view

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ScrollView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.cristiandev.myapplication.R
import com.cristiandev.myapplication.databinding.ActivityMainBinding
import com.cristiandev.myapplication.model.*


class MainActivity : AppCompatActivity() {

    lateinit var binding:ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setViewOnClickListeners()
    }

    private fun setViewOnClickListeners() {
        ButtonNumber0().setViewOnClickListener(binding.btn0, binding.tvResult)
        ButtonNumber1().setViewOnClickListener(binding.btn1, binding.tvResult)
        ButtonNumber2().setViewOnClickListener(binding.btn2, binding.tvResult)
        ButtonNumber3().setViewOnClickListener(binding.btn3, binding.tvResult)
        ButtonNumber4().setViewOnClickListener(binding.btn4, binding.tvResult)
        ButtonNumber5().setViewOnClickListener(binding.btn5, binding.tvResult)
        ButtonNumber6().setViewOnClickListener(binding.btn6, binding.tvResult)
        ButtonNumber7().setViewOnClickListener(binding.btn7, binding.tvResult)
        ButtonNumber8().setViewOnClickListener(binding.btn8, binding.tvResult)
        ButtonNumber9().setViewOnClickListener(binding.btn9, binding.tvResult)
        ButtonAc().setViewOnClickListener(binding.btnAc, binding.tvResult)
        ButtonDelete().setViewOnClickListener(binding.btnDelete, binding.tvResult)
        ButtonComma().setViewOnClickListener(binding.btnComma, binding.tvResult)
        ButtonAdd().setViewOnClickListener(binding.btnAdd, binding.tvResult)
        ButtonSubtract().setViewOnClickListener(binding.btnSubtract, binding.tvResult)
        ButtonMultiply().setViewOnClickListener(binding.btnMultiply, binding.tvResult)
        ButtonDivide().setViewOnClickListener(binding.btnDivide, binding.tvResult)
        ButtonEqualsTo().setViewOnClickListener(binding.btnEqualsTo, binding.tvResult)
        setScrollViewConfig(binding.svResult)
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
