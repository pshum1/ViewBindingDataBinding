package com.example.viewanddatabinding

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.viewanddatabinding.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    lateinit var activityMainBinding: ActivityMainBinding

    //VIEW BINDING
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        activityMainBinding = ActivityMainBinding.inflate(layoutInflater)
        val view = activityMainBinding.root
        setContentView(view)

        activityMainBinding.button.setOnClickListener {
            activityMainBinding.tvAfterButton.text = "Button Pressed"
        }

        activityMainBinding.buttonChangeActivity.setOnClickListener {
            startActivity(Intent(this, DataBindingActivity::class.java))
        }
    }
}