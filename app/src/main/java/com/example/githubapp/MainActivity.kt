package com.example.githubapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import com.example.githubapp.databinding.ActivityMainBinding
import com.example.toasterlibrary.getDistance
import com.example.toasterlibrary.toaster

class MainActivity : AppCompatActivity() {
    private val TAG = "MainActivity"
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        Log.d(TAG, "onCreate: $TAG")

        binding.btn.setOnClickListener {
            toaster(this, "Salomlar")
        }
        binding.btn2.setOnClickListener {
            val distance = getDistance(10.0, 15.0, 90.0, 60.0)
            toaster(this, distance)
        }
    }
}