package com.example.travelinindia.activities.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.travelinindia.activities.impClasses.LinkToImage
import com.example.travelinindia.activities.models.AllStateModel
import com.example.travelinindia.activities.models.PopularDestinationModel
import com.example.travelinindia.activities.models.StoriesByTravellerModel
import com.example.travelinindia.databinding.PopularDestinationListLayoutBinding
import com.example.travelinindia.databinding.StoriesByTravellerListLayoutBinding

class StoriesByTravellerAdapter(
    val list:ArrayList<StoriesByTravellerModel>
) :RecyclerView.Adapter<StoriesByTravellerAdapter.ViewHolder>(){
    inner class ViewHolder(val binding: StoriesByTravellerListLayoutBinding):RecyclerView.ViewHolder(binding.root){
        fun itemBinding(name:String,smallDes:String,creatorName:String,postedTime:String,imageLink:String){
            LinkToImage().loadImg(imageLink,binding.showStoriesByTravellerImg)
            binding.titleOfStory.text=name
            binding.descriptionOfTheStory.text=smallDes
            binding.nameOfCreator.text=creatorName
            binding.timePassed.text=postedTime
            binding.storyVideo.visibility= View.GONE
        }
        fun itemBinding2(name:String,smallDes:String,creatorName:String,postedTime:String,videoLink:String){
            LinkToImage().loadImg(videoLink,binding.showStoriesByTravellerImg)
            binding.titleOfStory.text=name
            binding.descriptionOfTheStory.text=smallDes
            binding.nameOfCreator.text=creatorName
            binding.timePassed.text=postedTime
            binding.showStoriesByTravellerImg.visibility= View.GONE
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(binding = StoriesByTravellerListLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        if(list[position].imageLink.isNotEmpty()) {

            holder.itemBinding(
                list[position].titleOfStory,
                list[position].smallDescriptionOfStory,
                list[position].nameOfTheCreator,
                list[position].postedTimeInHour,
                list[position].imageLink
            )
        }else{
            holder.itemBinding2(
                list[position].titleOfStory,
                list[position].smallDescriptionOfStory,
                list[position].nameOfTheCreator,
                list[position].postedTimeInHour,
                list[position].videoLink
            )
        }
    }
}