package com.example.myjob.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.myjob.R
import com.example.myjob.model.GoalDetails
import java.text.FieldPosition

class goalAdapter (private val dataList:ArrayList<GoalDetails>):RecyclerView.Adapter<goalAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent:ViewGroup,ViewType:Int):ViewHolder {
        val itemView = LayoutInflater.from(parent.context)
            .inflate(R.layout.activity_list_item,parent,false)
        return ViewHolder(itemView)
    }
    override fun onBindViewHolder(holder: goalAdapter.ViewHolder,position:Int) {
        val currentGoal = dataList[position]
        holder.tvGoalName.text = currentGoal.goalName
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
        return dataList.size
    }

    class ViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){
        val tvGoalName: TextView = itemView.findViewById(R.id.tvEmpName)

    }

}