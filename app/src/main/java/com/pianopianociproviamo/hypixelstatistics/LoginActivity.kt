package com.pianopianociproviamo.hypixelstatistics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.ImageButton
import android.widget.TextView

/*
    *   companion object {
    *
    *       var instance: MainActivity? = null
    +   }
    *   init {
    *       instance = this
    *   }
    *
 * */

public class LoginActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        val btn_back_al_f = findViewById<ImageButton>(R.id.btn_back_al)
        btn_back_al_f.setOnClickListener(){
            finish()
        }

        var text_mail = findViewById<EditText>(R.id.form_login_al_mail)
        var text_password = findViewById<EditText>(R.id.form_login_al_pw)



        val btn_login_c = findViewById<ImageButton>(R.id.btn_login_confirm)
        btn_login_c.setOnClickListener(){
            Intent(this, MainActivity::class.java).also{
                startActivity(it)
                finish()
            }
        }

        /*
        val btn_login_c = findViewById<Image>(R.id.btn_login_confirm)
        btn_login_c.setOnClickListener {

            if( (TextUtils.isEmpty(text_mail.text.toString())) && (TextUtils.isEmpty(text_password.text.toString())) ) {
                Toast.makeText(this, "I campi MAIL e PASSWORD non possono essere vuoti")
            }

            else {
                    Intent(this, MainActivity::class.java)
                    startActivity(it)
                    finish()
            }
        }
        * */

    }
}


