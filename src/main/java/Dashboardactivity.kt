package com.secureaccess

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val textView = TextView(this)
        textView.text = "Welcome to SecureAccess Dashboard!"
        textView.textSize = 24f
        textView.setPadding(24, 24, 24, 24)

        setContentView(textView)
    }
}