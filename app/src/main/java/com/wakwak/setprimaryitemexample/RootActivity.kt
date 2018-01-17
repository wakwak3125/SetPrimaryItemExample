package com.wakwak.setprimaryitemexample

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Button
import com.wakwak.setprimaryitemexample.java.JavaMainActivity
import com.wakwak.setprimaryitemexample.kotlin.KtMainActivity

class RootActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val javaButton = findViewById<Button>(R.id.button_open_java)
        val kotlinButton = findViewById<Button>(R.id.button_open_kotlin)

        javaButton.setOnClickListener { JavaMainActivity.start(this) }
        kotlinButton.setOnClickListener { KtMainActivity.start(this) }
    }
}
