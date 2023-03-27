package com.example.duastelas

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class tela2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_tela2)

        val btnVoltar = findViewById(R.id.btnVoltar3) as Button
        btnVoltar.setOnClickListener{
            this.finish()
        }

        val btnNext = findViewById(R.id.btnGoTo3) as Button
        btnNext.setOnClickListener{
            val intent = Intent (this, tela3::class.java)
            startActivity(intent)
        }
    }
}