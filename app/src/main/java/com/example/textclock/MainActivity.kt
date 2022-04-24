package com.example.textclock

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextClock
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        val txtClock = findViewById<TextClock>(R.id.txtClok)
        val txtView = findViewById<TextView>(R.id.textview)

        val btn = findViewById<Button>(R.id.btn)
        btn?.setOnClickListener {
            txtView?.text = "Time: " + txtClock?.text
        }
    }
}