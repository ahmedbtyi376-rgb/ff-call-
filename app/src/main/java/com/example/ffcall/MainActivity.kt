package com.ffcall.app
import android.app.Activity
import android.os.Bundle
import android.widget.TextView
class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val tv = TextView(this)
        tv.text = "FF Call Ready! 100% Working"
        tv.textSize = 24f
        setContentView(tv)
    }
}
