package com.example.mobiletut3

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.view.ViewGroup
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val mainLiner: LinearLayout = findViewById(R.id.mainLinear)
        mainLiner.setBackgroundColor(Color.parseColor("#FF000000"));

        var i = 0
        while (i < 5) {
            val test = LinearLayout(this)
            test.orientation = LinearLayout.HORIZONTAL
            test.layoutParams = ViewGroup.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT,
            )
            test.layoutParams = LinearLayout.LayoutParams(
                ViewGroup.LayoutParams.WRAP_CONTENT,
                ViewGroup.LayoutParams.WRAP_CONTENT,
                1f
            )
            val marginParam = test.layoutParams as ViewGroup.MarginLayoutParams
            marginParam.setMargins(0,20,0,0)
            val testParam = test.layoutParams

            testParam.width = ViewGroup.LayoutParams.MATCH_PARENT
            testParam.height = 250
            test.setBackgroundColor(Color.parseColor("#FF03DAC5"));
            test.layoutParams = testParam
            mainLiner.addView(test)
            i++
        }
    }
}