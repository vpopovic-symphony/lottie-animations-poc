package com.symphony.lottieanimationspoc

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.symphony.lottieanimationspoc.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.makeItRainBtn.setOnClickListener {
            binding.animationView.playAnimation()
        }
    }
}