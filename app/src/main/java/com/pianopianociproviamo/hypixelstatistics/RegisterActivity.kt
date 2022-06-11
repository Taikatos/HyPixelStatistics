package com.pianopianociproviamo.hypixelstatistics


import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.media.Image
import android.text.TextUtils
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import android.widget.ImageButton
import android.widget.ImageView
import android.widget.Toast

public class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val btn_back_la =  findViewById<ImageButton>(R.id.btn_back_ar)
        val text_game_name = findViewById<EditText>(R.id.form_register_ar_gameName)
        val text_first_mail = findViewById<EditText>(R.id.form_register_ar_mail)
        val text_conf_mail = findViewById<EditText>(R.id.form_register_ar_mail_c)
        val text_first_pw = findViewById<EditText>(R.id.form_register_ar_pw)
        val text_conf_pw = findViewById<EditText>(R.id.form_register_ar_pw_c)

        val img_back_ground_focus = findViewById<ImageView>(R.id.bg_register_ar)
        img_back_ground_focus.setOnClickListener {
            if ( text_game_name.hasFocus() ||text_first_mail.hasFocus() || text_conf_mail.hasFocus() || text_first_pw.hasFocus() || text_conf_pw.hasFocus())
            {
                text_first_mail.clearFocus()
                text_first_pw.clearFocus()
                val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
                imm.hideSoftInputFromWindow(text_first_mail!!.getWindowToken(), 0)
            }
        }

        val btn_reg_c = findViewById<ImageButton>(R.id.btn_register_c)
        btn_reg_c.setOnClickListener{
            if ( TextUtils.isEmpty(text_first_mail.text.toString()) && TextUtils.isEmpty(text_conf_mail.text.toString()) && TextUtils.isEmpty(text_first_pw.text.toString()) && TextUtils.isEmpty(text_conf_pw.text.toString()))
            {
                Toast.makeText(this, "I campi GAME NAME / MAIL / PASSWORD non possono essere vuoti", Toast.LENGTH_SHORT).show()
            }
            else if ((TextUtils.equals(text_first_mail.text.toString() ,text_conf_mail.text.toString()) && (TextUtils.equals(text_first_pw.text.toString() ,text_conf_pw.text.toString()))))
            {
                val Intent = Intent(this, MainActivity::class.java)
                startActivity(Intent)
            }else{ Toast.makeText(this, "Campi mancati o differnti", Toast.LENGTH_SHORT).show() }
        }

        btn_back_la.setOnClickListener{
            val intent = Intent ( this, LauncherActivity::class.java)
            startActivity(intent)
        }

    }
}
