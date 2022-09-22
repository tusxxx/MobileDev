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

        binding.btLog.setOnClickListener {
            Log.v("From EditText", binding.etText.text.toString())
        }

        binding.btTimber.setOnClickListener {
            Timber.v(binding.etText.text.toString())
        }
    }
}