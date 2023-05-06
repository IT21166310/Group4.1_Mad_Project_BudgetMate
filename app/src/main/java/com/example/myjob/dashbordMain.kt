package com.example.myjob

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myjob.databinding.ActivityDashbordMainBinding
import com.example.myjob.databinding.ActivityMainBinding

class dashbordMain : AppCompatActivity() {

    private lateinit var binding: ActivityDashbordMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashbordMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.goalInterface.setOnClickListener{
            val intent = Intent(this,AddNewGoal::class.java)
            startActivity(intent)
        }


    }
}