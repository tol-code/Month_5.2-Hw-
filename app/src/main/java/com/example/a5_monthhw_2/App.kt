package com.example.a5_monthhw_2

import android.app.Application

class App: Application() {

    companion object {
        lateinit var api:CalculatorApi
    }

    override fun onCreate() {
        super.onCreate()

        val retrofit =RetrofitService()
        api = retrofit.getApi()
    }
}