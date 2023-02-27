package com.slava_110.androidpractice

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlin.system.exitProcess

class MainActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun exitApp(view: View) {
        exitProcess(0)
    }
}