package com.pianopianociproviamo.hypixelstatistics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

public class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btn_back_al_f = findViewById<ImageButton>(R.id.btn_back_al)
        btn_back_al_f.setOnClickListener(){
            finish()
        }

        val btn_login_c = findViewById<ImageButton>(R.id.btn_login_confirm)
        btn_login_c.setOnClickListener(){
            Intent(this, MainActivity::class.java).also{
                startActivity(it)
                finish()
            }
        }
    }
}


