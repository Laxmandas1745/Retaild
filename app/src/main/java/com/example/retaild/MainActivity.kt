package com.example.retaild

import android.support.v7.app.AppCompatActivity
import android.os.Bundle

//THIS SCREEN WILL BE SPLASH SCREEN, IF THERE's NO CONNECTION, IT WILL START THE NoConnection.kt , IF ITS ONLINE and used without login, IT WILL
//START SlideScreen, AFTER Slidesceen, it will start Login Activty., if its already logined, it will start MainScreen.

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
}
