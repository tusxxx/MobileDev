package com.pi.mobiledev

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pi.mobiledev.databinding.ActivityLab3Binding

class Lab3Activity : AppCompatActivity() {
    private lateinit var binding: ActivityLab3Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLab3Binding.inflate(layoutInflater)
        setContentView(binding.root)

        with(binding) {
            btBlackText.setOnClickListener {
                et.setTextColor(Color.BLACK)
            }
            btWhiteText.setOnClickListener {
                et.setTextColor(Color.WHITE)
            }
            btBigSize.setOnClickListener {
                et.textSize = 24F
            }
            btLowSize.setOnClickListener {
                et.textSize = 8F
            }
            btWhiteBackground.setOnClickListener {
                et.setBackgroundColor(Color.WHITE)
            }
            btYellowBackground.setOnClickListener {
                et.setBackgroundColor(Color.YELLOW)
            }
        }
    }
}