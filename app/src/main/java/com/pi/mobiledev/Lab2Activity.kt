package com.pi.mobiledev

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.pi.mobiledev.databinding.ActivityLab2Binding
import timber.log.Timber

class Lab2Activity : AppCompatActivity() {
    private lateinit var binding: ActivityLab2Binding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLab2Binding.inflate(layoutInflater)
        setContentView(binding.root)

        setSaveButtonOnClickListener()
    }

    private fun setSaveButtonOnClickListener() {
        binding.btThirdTask.setOnClickListener {
            saveText()
        }
    }

    private fun saveText() {
        if (binding.cbThirdTask.isChecked) {
            binding.tvThirdTask.text = binding.etThirdTask.text
            if (binding.pbThirdTask.progress == binding.pbThirdTask.max) {
                binding.pbThirdTask.progress = 0
            } else {
                binding.pbThirdTask.progress += 10
            }
        }
    }
}