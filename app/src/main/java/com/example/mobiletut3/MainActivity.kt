package com.example.mobiletut3

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

    //Getting the main linear layout which is vertically oriented
    private lateinit var mainLinearLayout: LinearLayout

    //Liner Layouts will be added to this array
    private val linearLayoutArr = mutableListOf<LinearLayout>()

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mainLinearLayout = findViewById(R.id.mainLinear)
        createRows()
        linearLayoutArr[2].setBackgroundColor(Color.parseColor("#9E9E9E"));

    }

    private fun createRows(){
        var i = 0
        while (i < 5) {
            val childLinearLayout = LinearLayout(this)
            childLinearLayout.orientation = LinearLayout.HORIZONTAL
            childLinearLayout.layoutParams = ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT,
            )
            childLinearLayout.layoutParams = LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT,
                1f
            )
            val marginParam = childLinearLayout.layoutParams as ViewGroup.MarginLayoutParams
            marginParam.setMargins(0,20,0,0)
            val testParam = childLinearLayout.layoutParams

            testParam.width = ViewGroup.LayoutParams.MATCH_PARENT
            childLinearLayout.setBackgroundColor(Color.parseColor("#795548"));
            childLinearLayout.layoutParams = testParam
            mainLinearLayout.addView(childLinearLayout)
            linearLayoutArr.add(childLinearLayout)
            i++
        }

    }
}