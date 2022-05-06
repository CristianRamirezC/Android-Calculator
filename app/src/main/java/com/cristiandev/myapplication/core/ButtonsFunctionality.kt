package com.cristiandev.myapplication.core

import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ScrollView
import android.widget.TextView
import com.cristiandev.myapplication.R
import com.cristiandev.myapplication.core.TextViewValidations

interface IButtonFunction {
    fun actionButton(): Unit
}

class ActionButton0(private var view: View, private var tvResult: TextView) : IButtonFunction {
    private var result: String = tvResult.text.toString()
    override fun actionButton() {
        if (TextViewValidations().firstDigitValidation(tvResult)) {
            tvResult.setText("0")
        } else {
            tvResult.setText(result + "0")
        }
    }
}

class ActionButton1(private var view: View, private var tvResult: TextView) : IButtonFunction {
    private var result: String = tvResult.text.toString()
    override fun actionButton() {
        if (TextViewValidations().firstDigitValidation(tvResult)) {
            tvResult.setText("1")
        } else {
            tvResult.setText(result + "1")

        }
    }
}

class ActionButton2(private var view: View, private var tvResult: TextView) : IButtonFunction {
    private var result: String = tvResult.text.toString()
    override fun actionButton() {
        if (TextViewValidations().firstDigitValidation(tvResult)) {
            tvResult.setText("2")
        } else {
            tvResult.setText(result + "2")

        }    }
}

class ActionButton3(private var view: View, private var tvResult: TextView) : IButtonFunction {
    private var result: String = tvResult.text.toString()
    override fun actionButton() {
        if (TextViewValidations().firstDigitValidation(tvResult)) {
            tvResult.setText("3")
        } else {
            tvResult.setText(result + "3")

        }    }
}

class ActionButton4(private var view: View, private var tvResult: TextView) : IButtonFunction {
    private var result: String = tvResult.text.toString()
    override fun actionButton() {
        if (TextViewValidations().firstDigitValidation(tvResult)) {
            tvResult.setText("4")
        } else {
            tvResult.setText(result + "4")

        }    }
}

class ActionButton5(private var view: View, private var tvResult: TextView) : IButtonFunction {
    private var result: String = tvResult.text.toString()
    override fun actionButton() {
        if (TextViewValidations().firstDigitValidation(tvResult)) {
            tvResult.setText("5")
        } else {
            tvResult.setText(result + "5")

        }    }
}

class ActionButton6(private var view: View, private var tvResult: TextView) : IButtonFunction {
    private var result: String = tvResult.text.toString()
    override fun actionButton() {
        if (TextViewValidations().firstDigitValidation(tvResult)) {
            tvResult.setText("6")
        } else {
            tvResult.setText(result + "6")

        }    }
}

class ActionButton7(private var view: View, private var tvResult: TextView) : IButtonFunction {
    private var result: String = tvResult.text.toString()
    override fun actionButton() {
        if (TextViewValidations().firstDigitValidation(tvResult)) {
            tvResult.setText("7")
        } else {
            tvResult.setText(result + "7")

        }    }
}

class ActionButton8(private var view: View, private var tvResult: TextView) : IButtonFunction {
    private var result: String = tvResult.text.toString()
    override fun actionButton() {
        if (TextViewValidations().firstDigitValidation(tvResult)) {
            tvResult.setText("8")
        } else {
            tvResult.setText(result + "8")

        }    }
}

class ActionButton9(private var view: View, private var tvResult: TextView) : IButtonFunction {
    private var result: String = tvResult.text.toString()
    override fun actionButton() {
        if (TextViewValidations().firstDigitValidation(tvResult)) {
            tvResult.setText("9")
        } else {
            tvResult.setText(result + "9")

        }    }
}

class ActionButtonAc(private var view: View, private var tvResult: TextView) : IButtonFunction {
    private var result: String = tvResult.text.toString()
    override fun actionButton() {
        tvResult.setText("0")
    }
}

class ActionButtonDelete(private var view: View, private var tvResult: TextView) : IButtonFunction {
    private var result: String = tvResult.text.toString()
    override fun actionButton() {
        if (result.length == 1) {
            tvResult.setText("0")
        } else {
            tvResult.setText(result.dropLast(1))
        }
    }
}

class ActionButtonComma(private var view: View, private var tvResult: TextView) : IButtonFunction {
    private var result: String = tvResult.text.toString()
    override fun actionButton() {
        tvResult.setText(result + ",")
    }
}

class ActionButtonAdd(private var view: View, private var tvResult: TextView) : IButtonFunction {
    private var result: String = tvResult.text.toString()
    override fun actionButton() {
        tvResult.setText(result + "+")
    }
}

class ActionButtonSubtract(private var view: View, private var tvResult: TextView) :
    IButtonFunction {
    private var result: String = tvResult.text.toString()
    override fun actionButton() {
        tvResult.setText(result + "-")
    }
}

class ActionButtonMultiply(private var view: View, private var tvResult: TextView) :
    IButtonFunction {
    private var result: String = tvResult.text.toString()
    override fun actionButton() {
        tvResult.setText(result + "*")
    }
}

class ActionButtonDivide(private var view: View, private var tvResult: TextView) : IButtonFunction {
    private var result: String = tvResult.text.toString()
    override fun actionButton() {
        tvResult.setText(result + "/")
    }
}

class ActionButtonEqualsTo(private var view: View, private var tvResult: TextView) :
    IButtonFunction {
    private var result: String = tvResult.text.toString()
    override fun actionButton() {
        tvResult.setText("RESULT")
    }
}