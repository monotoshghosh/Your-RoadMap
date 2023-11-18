package com.example.pathapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class android : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_android)
        //
        val lm=findViewById<TextView>(R.id.textView9)

        lm.setOnClickListener {
            intent=Intent(Intent.ACTION_VIEW)
            intent.data= Uri.parse("https://developer.android.com/reference/org/w3c/dom/Document")
            startActivity(intent)
        }
    }
}