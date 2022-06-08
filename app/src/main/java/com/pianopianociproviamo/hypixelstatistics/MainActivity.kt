package com.pianopianociproviamo.hypixelstatistics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.pianopianociproviamo.hypixelstatistics.databinding.ActivityMainBinding
import com.pianopianociproviamo.hypixelstatistics.fragments.*

public class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val homeFragment = HomeFragment()
        val statsFragment = StatsFragment()
        val searchFragment = SearchFragment()
        val chatFragment = ChatFragment()
        val profileFragment = ProfileFragment()

        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragment, homeFragment)
        }

    }
}