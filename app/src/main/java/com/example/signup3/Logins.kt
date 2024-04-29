package com.example.signup3

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import com.example.signup3.databinding.ActivityLogin2Binding

class Logins : AppCompatActivity() {

    private lateinit var binding : ActivityLogin2Binding

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLogin2Binding.inflate(layoutInflater)

        val view = binding.root
        setContentView(view)
    }
}
