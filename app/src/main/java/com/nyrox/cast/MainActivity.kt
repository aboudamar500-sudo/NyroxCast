package com.nyrox.cast

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val layout = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER
            setPadding(32, 32, 32, 32)
            setBackgroundColor(Color.WHITE)
        }
        val title = TextView(this).apply {
            text = "Nyrox Cast"
            textSize = 32f
            setTextColor(Color.BLACK)
            gravity = Gravity.CENTER
        }
        val subtitle = TextView(this).apply {
            text = "تحكم بالتلفاز واعرض محتواك بسهولة"
            textSize = 18f
            setTextColor(Color.DKGRAY)
            gravity = Gravity.CENTER
            setPadding(0, 24, 0, 0)
        }
        layout.addView(title)
        layout.addView(subtitle)
        setContentView(layout)
    }
}
