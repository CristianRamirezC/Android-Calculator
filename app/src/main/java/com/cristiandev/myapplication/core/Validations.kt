package com.cristiandev.myapplication.core

import android.view.View
import android.widget.TextView

interface IResultTextViewValidations{
    fun firstDigitValidation(view: View): Boolean
    fun operationSignValidation(view: View): Boolean
}

class TextViewValidations(): IResultTextViewValidations {
    override fun firstDigitValidation(tvResult: View): Boolean {
        tvResult as TextView
        return (tvResult.text.length == 1 && tvResult.text == "0")
    }

    override fun operationSignValidation(tvResult: View): Boolean {
        tvResult as TextView
        val operationButtons: ArrayList<String> = arrayListOf("/", "x", "-", "+", ",")
        return (tvResult.text.isNotEmpty() && !operationButtons.contains(tvResult.text.last().toString()))
    }
}