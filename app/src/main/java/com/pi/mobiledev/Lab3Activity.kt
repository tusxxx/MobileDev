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
    }
}