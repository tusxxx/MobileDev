package com.pi.mobiledev

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.pi.mobiledev.databinding.ActivityLab1Binding

class Lab1Activity : AppCompatActivity() {
    private lateinit var binding: ActivityLab1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLab1Binding.inflate(layoutInflater)
        setContentView(binding.root)
        setListener()
    }

    private fun setListener() {
        binding.btOk.setOnClickListener {
            Toast.makeText(this, "Кнопка ОК!", Toast.LENGTH_SHORT).show()
        }
    }
}