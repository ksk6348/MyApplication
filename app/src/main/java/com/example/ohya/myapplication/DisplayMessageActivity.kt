package com.example.ohya.myapplication

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DisplayMessageActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)

        val intent = getIntent()
        val message = intent.getStringExtra(MainActivity().EXTRA_MESSAGE)
        val textView = findViewById<TextView>(R.id.textView)
        textView.setText(message)
    }
}
