package com.example.chartdemo

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.chartdemo.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val line = ChartLine(listOf(
            ChartPoint(0f,330f),
            ChartPoint(100f,400f),
            ChartPoint(160f,300f),
            ChartPoint(200f,400f),
            ChartPoint(160f,390f),
            ChartPoint(100f,290f),
            ChartPoint(200f,580f),
            ChartPoint(200f,410f),
            ChartPoint(200f,480f),
            ChartPoint(200f,270f),
        ))
        binding.cust.submitLine(line)
    }
}