package com.pi.mobiledev

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pi.mobiledev.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btLab1.setOnClickListener {
            startActivity(Intent(this, Lab1Activity::class.java))
        }

        binding.btLab2.setOnClickListener {
            startActivity(Intent(this, Lab2Activity::class.java))
        }

        binding.btLab3.setOnClickListener {
            startActivity(Intent(this, Lab3Activity::class.java))
        }
    }
}