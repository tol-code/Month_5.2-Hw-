package com.example.a5_monthhw_2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.a5_monthhw_2.databinding.ActivityMainBinding
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        makeRequest()
    }

    private fun makeRequest() {
        binding.btnCalculate.setOnClickListener {
            val name = binding.etMe.text.toString()
            val secondName = binding.etYou.text.toString()
            App.api.getPercentage(name, secondName)
                .enqueue(
                    object : Callback<CalculateModel> {
                        override fun onResponse(
                            call: Call<CalculateModel>,
                            response: Response<CalculateModel>
                        ) {
                            if (response.isSuccessful) {
                                val number = response.body()?.result
                                val intent = Intent(this@MainActivity, SecondActivity::class.java)
                                intent.putExtra("result", number)
                                intent.putExtra("name", name)
                                intent.putExtra("message", secondName)
                                startActivity(intent)
                                Log.d("ololo", "result:$number")
                            } else {
                                Log.d("ololo", "result:$response")
                            }
                        }

                        override fun onFailure(call: Call<CalculateModel>, t: Throwable) {
                            Log.d("ololo", "result:${t.localizedMessage}")

                        }
                    }
                )
        }
    }
}