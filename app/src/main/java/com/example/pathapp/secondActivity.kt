package com.example.pathapp

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.cardview.widget.CardView

class secondActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        //
        val andr=findViewById<CardView>(R.id.cardView)
        val ml=findViewById<CardView>(R.id.cardView2)
        val web=findViewById<CardView>(R.id.cardView3)
        val blockchain=findViewById<CardView>(R.id.cardView4)
        val btn=findViewById<Button>(R.id.button3)

        andr.setOnClickListener {
            intent=Intent(applicationContext,android::class.java)
            startActivity(intent)
        }
        web.setOnClickListener {
            intent=Intent(applicationContext,webAct::class.java)
            startActivity(intent)
        }

        ml.setOnClickListener {
            intent=Intent(applicationContext,mlAct::class.java)
            startActivity(intent)
        }

        blockchain.setOnClickListener {
            intent=Intent(applicationContext,blchain::class.java)
            startActivity(intent)
        }

        btn.setOnClickListener {
            Toast.makeText(applicationContext,"It's a Demo Number",Toast.LENGTH_SHORT).show()
            intent=Intent(Intent.ACTION_DIAL)
            intent.data= Uri.parse("tel:1234567891")
            startActivity(intent)
        }


    }
}