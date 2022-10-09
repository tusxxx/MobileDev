package com.pi.mobiledev

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.pi.mobiledev.databinding.ActivityLab1Binding

private const val EMPTY_STRING = ""

class Lab1Activity : AppCompatActivity() {
    private lateinit var binding: ActivityLab1Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLab1Binding.inflate(layoutInflater)
        setContentView(binding.root)

        setListener()
    }

    private fun setListener() {
        binding.button.setOnClickListener {
            addNumbersInTextViews()
        }
    }

    private fun addNumbersInTextViews() {
        val currentNumber =
            binding.h1.text.toString().toIntOrNull()
                ?: binding.h2.text.toString().toIntOrNull()
                ?: binding.h3.text.toString().toIntOrNull()
        val valueToSet = currentNumber?.plus(1)

        when {
            binding.h1.text.isNotBlank() -> {
                binding.h2.text = valueToSet.toString()
                binding.v2.text = valueToSet.toString()
                binding.c2.text = valueToSet.toString()
                binding.h1.text = EMPTY_STRING
                binding.v1.text = EMPTY_STRING
                binding.c1.text = EMPTY_STRING
            }
            binding.h2.text.isNotBlank() -> {
                binding.h3.text = valueToSet.toString()
                binding.v3.text = valueToSet.toString()
                binding.c3.text = valueToSet.toString()
                binding.h2.text = EMPTY_STRING
                binding.v2.text = EMPTY_STRING
                binding.c2.text = EMPTY_STRING
            }
            binding.h3.text.isNotBlank() -> {
                binding.h1.text = valueToSet.toString()
                binding.v1.text = valueToSet.toString()
                binding.c1.text = valueToSet.toString()
                binding.h3.text = EMPTY_STRING
                binding.v3.text = EMPTY_STRING
                binding.c3.text = EMPTY_STRING
            }
        }
    }
}