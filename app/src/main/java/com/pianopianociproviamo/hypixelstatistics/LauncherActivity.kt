package com.pianopianociproviamo.hypixelstatistics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ImageButton

public class LauncherActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launcher)

        val btnLogin_a1 = findViewById<ImageButton>(R.id.btn_login)
        btnLogin_a1.setOnClickListener(){
            Intent(this, LoginActivity::class.java).also{
                startActivity(it)
            }
        }

        val btnRegister_a1 = findViewById<ImageButton>(R.id.btn_register)
        btnRegister_a1.setOnClickListener(){
            Intent(this, RegisterActivity::class.java).also{
                startActivity(it)
            }
        }

    }
}