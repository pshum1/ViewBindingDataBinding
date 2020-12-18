package com.example.viewanddatabinding

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.viewanddatabinding.databinding.ActivityDataBindingBinding
import com.example.viewanddatabinding.models.User

class DataBindingActivity : AppCompatActivity() {

    private lateinit var binding: ActivityDataBindingBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_data_binding)

        binding = DataBindingUtil.setContentView(this, R.layout.activity_data_binding)

        binding.buttonPress.setOnClickListener {
            var user = User("Pierre", "p@gmail.com")
            binding.userInfo = user
        }


    }
}