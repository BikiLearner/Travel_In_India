package com.example.travelinindia.activities.adapters

import android.graphics.BitmapFactory
import android.os.Looper
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.example.travelinindia.activities.impClasses.LinkToImage
import com.example.travelinindia.activities.models.AllStateModel
import com.example.travelinindia.databinding.AllStatesListLayoutBinding
import java.util.concurrent.Executors

class AllStatesAndUnionAdapter(
   val list: ArrayList<AllStateModel>
) :RecyclerView.Adapter<AllStatesAndUnionAdapter.ViewHolder>(){
    inner class ViewHolder(val binding: AllStatesListLayoutBinding):RecyclerView.ViewHolder(binding.root){
        fun itemBinding(name:String,links:String ){
            LinkToImage().loadImg(links,binding.stateImage)
            binding.stateName.text=name

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(binding = AllStatesListLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
        return list.size;
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val name=list[position].StateName
        val link=list[position].imageLink
        holder.itemBinding(name,link)
    }
}