package com.example.travelinindia.activities.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.travelinindia.activities.models.trainInfoModel
import com.example.travelinindia.databinding.BookingSearchLayoutBinding

class BookingListAdapter(
    val list:ArrayList<trainInfoModel>
) :RecyclerView.Adapter<BookingListAdapter.ViewHolder>(){
    inner class ViewHolder(val binding:BookingSearchLayoutBinding):RecyclerView.ViewHolder(binding.root){
        fun itemBinding(name:String,startTime:String,
                        starPlace:String,endTime:String,endPlace:String,
                        totalTime:String){

            binding.nameOfVehicle.text=name
            binding.startingTravelTime.text=startTime
            binding.startingTravelPlace.text=starPlace
            binding.endingTravelTime.text=endTime
            binding.endingTravelPlace.text=endPlace
            binding.totalTimeTakenTravel.text=totalTime


        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(binding = BookingSearchLayoutBinding.inflate(LayoutInflater.from(parent.context),parent,false))
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val name=list[position].trainName.toString()
        val startTime=list[position].departureTime.toString()
        val starPlace=list[position].sourceDes.toString()
        val endTime=list[position].arrivalTime.toString()
        val endPlace=list[position].trainDes.toString()
        val totalTime=list[position].totalDuration.toString()
        holder.itemBinding(name,startTime,starPlace,endTime,endPlace,totalTime)
    }


}