package com.example.counterapp

import android.os.Bundle
import android.view.LayoutInflater
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import com.example.counterapp.databinding.ActivityMainBinding
import com.example.counterapp.ui.theme.CounterAppTheme

class MainActivity : ComponentActivity() {
    var counter = 0
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        installSplashScreen()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.result.setOnClickListener {
            binding.defaultCount.text = (""+increaseCounter())
        }
        binding.resetButton.setOnClickListener {
            binding.defaultCount.text = (""+reset())
        }
        }

 private fun increaseCounter(): Int{
     counter++
     return counter
}

    private fun reset():Int {
        counter = 0
        return counter
    }
}
