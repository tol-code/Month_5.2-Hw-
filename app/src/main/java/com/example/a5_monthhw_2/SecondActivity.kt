package com.example.a5_monthhw_2

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.example.a5_monthhw_2.databinding.ActivitySecondBinding

class SecondActivity : AppCompatActivity() {


    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val name = intent.getStringExtra("name")
        val message = intent.getStringExtra("message")
        val number = intent.getStringExtra("result")
        Log.d("ololo","second result:$number")
        binding.me2.text= name
        binding.etYou2.text=message
        binding.youScore.text= number


    }
    }