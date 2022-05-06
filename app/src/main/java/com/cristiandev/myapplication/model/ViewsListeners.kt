package com.cristiandev.myapplication.model

import android.view.View
import android.widget.TextView
import com.cristiandev.myapplication.core.*


interface ISetOnClickListener {
    fun setViewOnClickListener(view: View, textView: TextView)
}

class ButtonNumber0() : ISetOnClickListener {
    override fun setViewOnClickListener(view: View, textView: TextView) {
        view.setOnClickListener { ActionButton0(view, textView).actionButton() }
    }
}

class ButtonNumber1() : ISetOnClickListener {
    override fun setViewOnClickListener(view: View, textView: TextView) {
        view.setOnClickListener { ActionButton1(view, textView).actionButton() }
    }
}

class ButtonNumber2() : ISetOnClickListener {
    override fun setViewOnClickListener(view: View, textView: TextView) {
        view.setOnClickListener { ActionButton2(view, textView).actionButton() }
    }
}

class ButtonNumber3() : ISetOnClickListener {
    override fun setViewOnClickListener(view: View, textView: TextView) {
        view.setOnClickListener { ActionButton3(view, textView).actionButton() }
    }
}

class ButtonNumber4() : ISetOnClickListener {
    override fun setViewOnClickListener(view: View, textView: TextView) {
        view.setOnClickListener { ActionButton4(view, textView).actionButton() }
    }
}

class ButtonNumber5() : ISetOnClickListener {
    override fun setViewOnClickListener(view: View, textView: TextView) {
        view.setOnClickListener { ActionButton5(view, textView).actionButton() }
    }
}

class ButtonNumber6() : ISetOnClickListener {
    override fun setViewOnClickListener(view: View, textView: TextView) {
        view.setOnClickListener { ActionButton6(view, textView).actionButton() }
    }
}

class ButtonNumber7() : ISetOnClickListener {
    override fun setViewOnClickListener(view: View, textView: TextView) {
        view.setOnClickListener { ActionButton7(view, textView).actionButton() }
    }
}

class ButtonNumber8() : ISetOnClickListener {
    override fun setViewOnClickListener(view: View, textView: TextView) {
        view.setOnClickListener { ActionButton8(view, textView).actionButton() }
    }
}

class ButtonNumber9() : ISetOnClickListener {
    override fun setViewOnClickListener(view: View, textView: TextView) {
        view.setOnClickListener { ActionButton9(view, textView).actionButton() }
    }
}

class ButtonAc() : ISetOnClickListener {
    override fun setViewOnClickListener(view: View, textView: TextView) {
        view.setOnClickListener { ActionButtonAc(view, textView).actionButton() }
    }
}

class ButtonDelete() : ISetOnClickListener {
    override fun setViewOnClickListener(view: View, textView: TextView) {
        view.setOnClickListener { ActionButtonDelete(view, textView).actionButton() }

    }
}

class ButtonComma() : ISetOnClickListener {
    override fun setViewOnClickListener(view: View, textView: TextView) {
        view.setOnClickListener { ActionButtonComma(view, textView).actionButton() }
    }
}

class ButtonAdd() : ISetOnClickListener {
    override fun setViewOnClickListener(view: View, textView: TextView) {
        view.setOnClickListener { ActionButtonAdd(view, textView).actionButton() }
    }
}

class ButtonSubtract() : ISetOnClickListener {
    override fun setViewOnClickListener(view: View, textView: TextView) {
        view.setOnClickListener { ActionButtonSubtract(view, textView).actionButton() }
    }
}

class ButtonMultiply() : ISetOnClickListener {
    override fun setViewOnClickListener(view: View, textView: TextView) {
        view.setOnClickListener { ActionButtonMultiply(view, textView).actionButton() }
    }
}

class ButtonDivide() : ISetOnClickListener {
    override fun setViewOnClickListener(view: View, textView: TextView) {
        view.setOnClickListener { ActionButtonDivide(view, textView).actionButton() }
    }
}

class ButtonEqualsTo() : ISetOnClickListener {
    override fun setViewOnClickListener(view: View, textView: TextView) {
        view.setOnClickListener { ActionButtonEqualsTo(view, textView).actionButton() }
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
}*/
