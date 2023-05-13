package com.example.pertemuan07sqlitesharedpreferences

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import androidx.appcompat.app.AppCompatActivity

class SplashActivity : AppCompatActivity() {
    @Suppress("DEPRECATION")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        Handler().postDelayed({
            val pindah = Intent(this, LoginActivity::class.java)
            startActivity(pindah)
            finish()
        }, 2000)//saat aplikasi pertama kli dibuka dia menuju splashcreen
        //dan akan delay selama 2000s kmdn langsung menuju halaman login

        //agar saat program dirun munculnya di splass page, kita hrs menyettingnya di manifest
    }
}