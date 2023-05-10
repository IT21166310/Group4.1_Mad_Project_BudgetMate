package com.example.myjob.activities

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.myjob.*
import com.example.myjob.databinding.ActivityDashbordMainBinding
import com.example.myjob.view.Expenses.mainActivity_Expenses
import com.example.myjob.view.Goal.main_Activity_goal
import com.example.myjob.view.login.MainActivity
import com.example.myjob.view.newIncome.activity_main_income
import com.google.android.material.floatingactionbutton.FloatingActionButton
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class dashbordMain : AppCompatActivity() {

    private lateinit var binding: ActivityDashbordMainBinding
    private lateinit var logout:FloatingActionButton



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDashbordMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        logout = findViewById(R.id.logout)

        logout.setOnClickListener{
            Firebase.auth.signOut()

            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)

            Toast.makeText(this,"Logout Successfull",Toast.LENGTH_LONG).show()
        }

        binding.goalInterface.setOnClickListener{
            val intent = Intent(this, main_Activity_goal::class.java)
            startActivity(intent)
        }

        binding.BudgetInterface.setOnClickListener{
            val intent = Intent(this, mainActivity_plan::class.java)
            startActivity(intent)
        }

        binding.expensesInterface.setOnClickListener {
            val intent = Intent(this, mainActivity_Expenses::class.java)
            startActivity(intent)
        }

        binding.IncomeInterface.setOnClickListener {
            val intent = Intent(this, activity_main_income::class.java)
            startActivity(intent)
        }












    }
}