package com.example.travelinindia.activities.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.travelinindia.activities.ForConstant
import com.example.travelinindia.activities.activitiees.WebHandelingActivity
import com.example.travelinindia.activities.models.FareInfo
import com.example.travelinindia.databinding.ShowTrainFareListBinding

class GetFareOfTrainAdapter (
 val list:ArrayList<FareInfo>,
    val context: Context
):RecyclerView.Adapter<GetFareOfTrainAdapter.ViewHolder>(){
    inner class ViewHolder(val binding: ShowTrainFareListBinding):RecyclerView.ViewHolder(binding.root){
        fun itemBinding(classType:String,fare:String){
            binding.classType.text=classType
            binding.fareOfParticularClass.text=fare
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(binding = ShowTrainFareListBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemBinding(list[position].classType,list[position].fare)
        holder.binding.root.setOnClickListener {
            val intent= Intent(context,WebHandelingActivity::class.java)
            intent.putExtra(ForConstant.getUrl,"https://rzp.io/i/VKz8EvQ")
            context.startActivity(intent)
        }
    }
}