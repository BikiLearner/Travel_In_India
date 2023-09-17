package com.example.travelinindia.activities.activitiees

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import com.example.travelinindia.R
import com.example.travelinindia.activities.MainActivity

class SplashScreen : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        val window= window
        window.statusBarColor=getColor(R.color.charcoal)
        val loginDone=false
        if(loginDone){
            Handler(Looper.getMainLooper()).postDelayed({
                val intent= Intent(this@SplashScreen, MainActivity::class.java)
                startActivity(intent);
                finish()
            }, 1000)
        }else {
            Handler(Looper.getMainLooper()).postDelayed({
                val intent = Intent(this@SplashScreen, LoginPange::class.java)
                startActivity(intent);
                finish()
            }, 1000)
        }
    }
}