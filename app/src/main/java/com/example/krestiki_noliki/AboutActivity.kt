package com.example.krestiki_noliki

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class AboutActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)
    }

    fun goBackToMainMenu(view: android.view.View) {
        finish() // Закрыть текущую активность и вернуться в предыдущую
    }
}