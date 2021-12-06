package com.example.fri2hw

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class winner: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_winner)

        val number = intent.getStringExtra("Number")
        findViewById<TextView>(R.id.Number).text = "$number"

    }
}

