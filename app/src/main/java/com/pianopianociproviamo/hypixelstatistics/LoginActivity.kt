package com.pianopianociproviamo.hypixelstatistics

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.TextUtils
import android.view.inputmethod.InputMethodManager
import android.widget.*
import androidx.constraintlayout.widget.ConstraintLayout

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

        /* Controllo focus */

        val img_back_ground_focus = findViewById<ImageView>(R.id.bg_login_al)
        img_back_ground_focus.setOnClickListener {
            if (text_mail.hasFocus() || text_password.hasFocus())
            {
                text_mail.clearFocus()
                text_password.clearFocus()
                val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                imm.hideSoftInputFromWindow(text_mail!!.getWindowToken(), 0)
            }
        }

        /* Controllo inserimento campi */
        val btn_login_c = findViewById<ImageButton>(R.id.btn_login_confirm)
        btn_login_c.setOnClickListener {

            if( (TextUtils.isEmpty(text_mail.text.toString())) && (TextUtils.isEmpty(text_password.text.toString())) ) {
                Toast.makeText(this, "I campi MAIL e PASSWORD non possono essere vuoti", Toast.LENGTH_SHORT).show()
            }

            else {
                val Intent = Intent(this, MainActivity::class.java)
                startActivity(Intent)
            }
        }

    }


}


