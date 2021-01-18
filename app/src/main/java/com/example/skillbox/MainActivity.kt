package com.example.skillbox

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val a: Button = findViewById(R.id.Knopka1small)
        a.setOnClickListener{
            Log.e("event","BUTTON 1 WAS PUSHED")
        }
        val b: Button = findViewById(R.id.Knopka2small)
        b.setOnClickListener {
            Log.e("event","Button 2 WAS PUSHED")
        }
        val c: Button = findViewById(R.id.Knopka3Big)

        c.setOnClickListener {
            Log.e("event","BUTTON 3 WAS PUSHED")
        }



    }
}