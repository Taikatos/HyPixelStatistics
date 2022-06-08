package com.pianopianociproviamo.hypixelstatistics


import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.ImageButton

public class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val btn_back_ar_f = findViewById<ImageButton>(R.id.btn_back_ar)
        btn_back_ar_f.setOnClickListener(){
            finish()
        }

    }
}