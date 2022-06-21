package com.example.homework4

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.core.view.isVisible


class MainActivity : AppCompatActivity() {
    var i = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1: Button = findViewById(R.id.buttoneone)
        val button2:Button = findViewById(R.id.buttonetwo)
        val textView: TextView = findViewById(R.id.textView)
        val win:TextView = findViewById(R.id.win)


        button1.setOnClickListener {
            i ++
            textView.text=i.toString()
            if (i<50){
                win.isVisible = false
            }else{
                win.isVisible = i>=50
            }

        }

        button2.setOnClickListener {
            if (i > 0){
                i--
            }else{
                i=0
            }
            textView.text=i.toString()
            if (i<50){
                win.isVisible = false
            }else{
                win.isVisible = i>=50
            }


        }


    }
}





