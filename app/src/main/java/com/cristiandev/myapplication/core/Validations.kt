package com.cristiandev.myapplication.core

import android.view.View
import android.widget.TextView

interface IResultTextViewValidations{
    fun firstDigitValidation(view: View): Boolean
    fun operationSignValidation(view: View): Boolean
    fun deleteButtonValidation (view: View): Boolean
}

class TextViewValidations(): IResultTextViewValidations {
    override fun firstDigitValidation(tvResult: View): Boolean {
        tvResult as TextView
        return (tvResult.text.length == 1 && tvResult.text == "0")
    }

    override fun operationSignValidation(tvResult: View): Boolean {
        tvResult as TextView
        val operationButtons: ArrayList<String> = arrayListOf("/", "*", "-", "+", ",")
        return ((tvResult.text.length == 1 && tvResult.text.last() == '0') ||
                operationButtons.contains(tvResult.text.toString().last().toString()))
    }

    override fun deleteButtonValidation(tvResult: View): Boolean {
        tvResult as TextView
        return (tvResult.text.toString().length == 1)
    }
}