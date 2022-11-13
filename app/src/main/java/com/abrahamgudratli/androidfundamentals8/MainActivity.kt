package com.abrahamgudratli.androidfundamentals8

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setFragment(FragmentHome())

        bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId) {
                R.id.miHome -> setFragment(FragmentHome())
                R.id.miMessage -> setFragment(FragmentMessage())
                R.id.miProfile -> setFragment(FragmentProfile())
            }
            true
        }

    }

    private fun setFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction().apply {
            replace(R.id.flFragmentContainer, fragment)
            commit()
        }
    }
}