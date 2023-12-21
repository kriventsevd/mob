package com.example.count

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private var counter: Int=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button:Button= findViewById(R.id.button)
        val textView: TextView =findViewById(R.id.textView)
        button.setOnClickListener {
            textView.text = "привет"
        }
        val buttonCount: Button =findViewById(R.id.button_count)
        buttonCount.setOnClickListener {
            textView.text = "я нажал кнопку ${++counter} раз"
        }
    }
}