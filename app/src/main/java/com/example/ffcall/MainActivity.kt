package com.example.ffcall
import android.app.Activity
import android.os.Bundle
import android.widget.TextView
import android.view.Gravity
class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val textView = TextView(this)
        textView.text = "FF Call Ready! 100% Working"
        textView.textSize = 24f
        textView.gravity = Gravity.CENTER
        setContentView(textView)
    }
}
