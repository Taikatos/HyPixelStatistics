package com.pianopianociproviamo.hypixelstatistics

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
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
        }.commit()

        val btn_navigation = findViewById<BottomNavigationView>(R.id.bottom_navigation)

        btn_navigation.selectedItemId=R.id.ic_home

        btn_navigation.setOnItemSelectedListener {
            var fragment:Fragment?=null
            when (it.itemId) {
                R.id.ic_home -> fragment = HomeFragment()
                R.id.ic_stats -> fragment = StatsFragment()
                R.id.ic_search -> fragment = SearchFragment()
                R.id.ic_chat -> fragment = ChatFragment()
                R.id.ic_profile -> fragment = ProfileFragment()
            }
            fragment?.let { supportFragmentManager.beginTransaction().apply {
                replace(R.id.flFragment, fragment)
            }.commit() }
            true
        }

    }
}