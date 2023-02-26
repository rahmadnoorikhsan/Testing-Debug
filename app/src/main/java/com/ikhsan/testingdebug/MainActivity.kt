package com.ikhsan.testingdebug

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class MainActivity : AppCompatActivity(), View.OnClickListener {
    private lateinit var btnValue: Button
    private lateinit var tvText: TextView

    private var names = ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnValue = findViewById(R.id.btn_set_value)
        tvText = findViewById(R.id.tv_text)
        btnValue.setOnClickListener(this)

        names.add("Rahmad")
        names.add("Noor")
        names.add("Ikhsan")
    }

    override fun onClick(v: View?) {
        if (v?.id == R.id.btn_set_value) {
            Log.d("MainActivity", names.toString())
                val name = StringBuilder()
                for (i in 0..2) {
                    name.append(names[i]).append("\n")
                }
                tvText.text = name.toString()
        }
    }
}