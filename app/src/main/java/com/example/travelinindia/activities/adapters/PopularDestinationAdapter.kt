package com.example.travelinindia.activities.adapters

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.travelinindia.activities.ForConstant
import com.example.travelinindia.activities.activitiees.AboutDestinationActivity
import com.example.travelinindia.activities.impClasses.LinkToImage
import com.example.travelinindia.activities.models.PopularDestinationModel
import com.example.travelinindia.databinding.PopularDestinationListLayoutBinding

class PopularDestinationAdapter(
    val context: Context,
    val list:ArrayList<PopularDestinationModel>
) :RecyclerView.Adapter<PopularDestinationAdapter.ViewHolder>(){
    inner class ViewHolder(val binding: PopularDestinationListLayoutBinding):RecyclerView.ViewHolder(binding.root){
        fun itemBinding(desName:String,desDiscription:String,imageLink:String){
            LinkToImage().loadImg(imageLink,binding.showPopularPlaceImage)

            binding.descriptionOfPopularPlace.text="${desDiscription.take(30)}..."
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
        holder.binding.root.setOnClickListener {
            val intent=Intent(context,AboutDestinationActivity::class.java)
            intent.putExtra(ForConstant.getaboutContentName,list[position].destinationName)
            intent.putExtra(ForConstant.getaboutContentDescription,list[position].destinationDescription)
            intent.putExtra(ForConstant.getaboutContentUrl,list[position].imageLink)
            intent.putExtra(ForConstant.getaboutContentStart,0)
            intent.putExtra(ForConstant.getaboutContentEnd,0)
            context.startActivity(intent)
        }
    }
}