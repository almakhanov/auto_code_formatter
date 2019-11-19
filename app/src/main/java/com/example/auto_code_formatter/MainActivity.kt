package com.example.auto_code_formatter

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
         super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)

        var a=A("1",2)
    }
}


data class A(val b: String,
             val a: Int)