package com.binar.synrgyactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d(MainActivity::class.simpleName,"onCreate() Dijalankan")
    }

    override fun onStart() {
        super.onStart()
        Log.d(MainActivity::class.simpleName,"onStart() Dijalankan")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(MainActivity::class.simpleName,"onRestart() Dijalankan")
    }

    override fun onPause() {
        super.onPause()
        Log.d(MainActivity::class.simpleName,"onPause() Dijalankan")
    }

    override fun onStop() {
        super.onStop()
        Log.d(MainActivity::class.simpleName,"onStop() Dijalankan")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(MainActivity::class.simpleName,"onDestroy() Dijalankan")
    }


}