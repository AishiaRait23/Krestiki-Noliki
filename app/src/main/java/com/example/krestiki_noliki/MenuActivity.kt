package com.example.krestiki_noliki

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class MenuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)
    }

    fun startGame(view: android.view.View) {
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
    }

    fun startAboutActivity(view: android.view.View) {
        val intent = Intent(this, AboutActivity::class.java)
        startActivity(intent)
    }
}