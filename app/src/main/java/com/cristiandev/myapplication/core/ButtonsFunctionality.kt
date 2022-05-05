package com.cristiandev.myapplication.core

import android.view.View
import android.widget.Button
import android.widget.ImageButton
import android.widget.ScrollView
import android.widget.TextView
import com.cristiandev.myapplication.R

interface IButtonFunction {
    fun actionButton(): Unit
}

class ActionButton0(private var view: View, private var tvResult: TextView) : IButtonFunction {
    private var result: String = tvResult.text.toString()
    override fun actionButton() {
        tvResult.setText(result + "0")
    }
}

class ActionButton1(private var view: View, private var tvResult: TextView) : IButtonFunction {
    private var result: String = tvResult.text.toString()
    override fun actionButton() {
        tvResult.setText(result + "1")
    }
}

class ActionButton2(private var view: View, private var tvResult: TextView) : IButtonFunction {
    private var result: String = tvResult.text.toString()
    override fun actionButton() {
        tvResult.setText(result + "2")
    }
}

class ActionButton3(private var view: View, private var tvResult: TextView) : IButtonFunction {
    private var result: String = tvResult.text.toString()
    override fun actionButton() {
        tvResult.setText(result + "2")
    }
}

class ActionButton4(private var view: View, private var tvResult: TextView) : IButtonFunction {
    private var result: String = tvResult.text.toString()
    override fun actionButton() {
        tvResult.setText(result + "4")
    }
}

class ActionButton5(private var view: View, private var tvResult: TextView) : IButtonFunction {
    private var result: String = tvResult.text.toString()
    override fun actionButton() {
        tvResult.setText(result + "5")
    }
}

class ActionButton6(private var view: View, private var tvResult: TextView) : IButtonFunction {
    private var result: String = tvResult.text.toString()
    override fun actionButton() {
        tvResult.setText(result + "6")
    }
}

class ActionButton7(private var view: View, private var tvResult: TextView) : IButtonFunction {
    private var result: String = tvResult.text.toString()
    override fun actionButton() {
        tvResult.setText(result + "7")
    }
}

class ActionButton8(private var view: View, private var tvResult: TextView) : IButtonFunction {
    private var result: String = tvResult.text.toString()
    override fun actionButton() {
        tvResult.setText(result + "8")
    }
}

class ActionButton9(private var view: View, private var tvResult: TextView) : IButtonFunction {
    private var result: String = tvResult.text.toString()
    override fun actionButton() {
        tvResult.setText(result + "9")
    }
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
        tvResult.setText("DELETE")
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

/*private fun deleteButton() {
    var tvResult: TextView = findViewById(R.id.tvResult)
    var result: String = tvResult.text.toString()
    if (result.length == 1)  {
        tvResult.setText("0")
    } else {
        tvResult.text = result.dropLast(1)
    }
}

private fun pressOperationButtons(view: View) {
    var tvResult: TextView = findViewById(R.id.tvResult)
    var result: String = tvResult.text.toString()
    var btnPressed: String = view.tag.toString()
    val operationButtons: ArrayList<String> = arrayListOf("/", "x", "-", "+", ",")
    if (result.length >=1 &&  !operationButtons.contains(result.last().toString())){
        when(btnPressed) {
            "btnDivide" -> tvResult.setText(result + "/")
            "btnMultiply" -> tvResult.setText(result + "x")
            "btnSubtract" -> tvResult.setText(result + "-")
            "btnAdd" -> tvResult.setText(result + "+")
            "btnComma" -> tvResult.setText(result + ",")
        }
    }
}

private fun equalsToButton() {
    var tvResult: TextView = findViewById(R.id.tvResult)
    tvResult.setText("Resultado")
}

private fun pressButton(view: View) {
    setResultTextView(view)
}*/
