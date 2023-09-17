package com.example.travelinindia.activities.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.travelinindia.activities.impClasses.LinkToImage
import com.example.travelinindia.activities.models.PopularDestinationModel
import com.example.travelinindia.databinding.PopularDestinationListLayoutBinding

class PopularDestinationAdapter(
    val list:ArrayList<PopularDestinationModel>
) :RecyclerView.Adapter<PopularDestinationAdapter.ViewHolder>(){
    inner class ViewHolder(val binding: PopularDestinationListLayoutBinding):RecyclerView.ViewHolder(binding.root){
        fun itemBinding(desName:String,desDiscription:String,imageLink:String){
            LinkToImage().loadImg(imageLink,binding.showPopularPlaceImage)
            binding.descriptionOfPopularPlace.text=desDiscription
            binding.titleOfPopularPlaceTv.text=desName
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(binding = PopularDestinationListLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.itemBinding(list[position].destinationName,list[position].destinationDescription,list[position].imageLink)
    }
}