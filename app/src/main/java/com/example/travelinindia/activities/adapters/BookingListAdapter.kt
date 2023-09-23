package com.example.travelinindia.activities.adapters

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.LayoutManager
import com.example.travelinindia.activities.activitiees.backendClass
import com.example.travelinindia.activities.models.trainInfoModel
import com.example.travelinindia.databinding.BookingSearchLayoutBinding
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch

class BookingListAdapter(
    val list:ArrayList<trainInfoModel>,
    val context: Context
) :RecyclerView.Adapter<BookingListAdapter.ViewHolder>(){
    inner class ViewHolder(val binding:BookingSearchLayoutBinding):RecyclerView.ViewHolder(binding.root){
        fun itemBinding(name:String,trainNo:String,startTime:String,
                        starPlace:String,endTime:String,endPlace:String,
                        totalTime:String){

            binding.nameOfVehicle.text=name
            binding.noOfVehicle.text=trainNo
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
        val trainNo=list[position].trainNo.toString()
        val startTime=list[position].departureTime.toString()
        val starPlace=list[position].sourceDes.toString()
        val endTime=list[position].arrivalTime.toString()
        val endPlace=list[position].trainDes.toString()
        val totalTime=list[position].totalDuration.toString()
        GlobalScope.launch(Dispatchers.Main) {
            val fareArrayList= backendClass().getTrainFare(list[position].sourceDes.toString(),
                list[position].trainDes.toString(),list[position].trainNo.toString())
            Log.e("fareList",fareArrayList.toString())
            if(fareArrayList.isEmpty()){
                Toast.makeText(context,"No Data Element",Toast.LENGTH_SHORT).show()
            }else{
                val adapter=GetFareOfTrainAdapter(ArrayList(fareArrayList),context)
                val layoutManager=LinearLayoutManager(context,LinearLayoutManager.HORIZONTAL,false)
                holder.binding.fareListRv.layoutManager=layoutManager
                holder.binding.fareListRv.adapter=adapter
            }
        }

        holder.itemBinding(name,trainNo,startTime,starPlace,endTime,endPlace,totalTime)
    }


}