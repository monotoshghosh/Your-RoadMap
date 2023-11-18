package com.example.pathapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //
        val btn =findViewById<Button>(R.id.button)


        btn.setOnClickListener {
            Toast.makeText(applicationContext,"Going to Next Screen",Toast.LENGTH_SHORT).show()

            intent = Intent(applicationContext,secondActivity::class.java)
            startActivity(intent)
        }
    }
}