package com.example.travelinindia.activities.activitiees

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.travelinindia.R
import com.example.travelinindia.activities.ForConstant
import com.example.travelinindia.activities.adapters.PopularDestinationAdapter
import com.example.travelinindia.activities.impClasses.LinkToImage
import com.example.travelinindia.activities.models.PopularDestinationModel
import com.example.travelinindia.databinding.ActivityAboutDestinationBinding

class AboutDestinationActivity : AppCompatActivity() {
    private var binding:ActivityAboutDestinationBinding?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityAboutDestinationBinding.inflate(layoutInflater)
        setContentView(binding!!.root)
        val window=window
        window.statusBarColor= getColor(R.color.white)
        setSupportActionBar(binding!!.aboutSectionToolbar)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        val list=GetTheDataToSetInApp().getPopulardestinationLink()
        val intent=intent
        val name =intent.getStringExtra(ForConstant.getaboutContentName)
        val des=intent.getStringExtra(ForConstant.getaboutContentDescription)
        val url=intent.getStringExtra(ForConstant.getaboutContentUrl)
        val stno=intent.getIntExtra(ForConstant.getaboutContentStart,0)
        val endno=intent.getIntExtra(ForConstant.getaboutContentEnd,0)
        binding!!.nameOfThePlace.text=name
        binding!!.descriptionOfThePlaces.text=des
        binding!!.exploreTv.text="Explore $name and its best places to visit"
        LinkToImage().loadImg(url!!,binding!!.aboutSectionImageView)
        if(endno!=0) {
            setAllPopularView(ArrayList(list.subList(stno, endno)))
        }else{
            binding!!.attractionTv.text="Explore More"
            setAllPopularView(ArrayList(list))
        }
        allBookingButton()
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            onBackPressed()
            return true
        }
        return false
    }
    private fun setAllPopularView(list:  ArrayList<PopularDestinationModel>){

        val adapter= PopularDestinationAdapter(this@AboutDestinationActivity,list)

        val layoutManager = LinearLayoutManager(this@AboutDestinationActivity,
            LinearLayoutManager.HORIZONTAL,false)

        binding!!.popularDesRv.layoutManager = layoutManager
        binding!!.popularDesRv.adapter = adapter
    }
    private fun allBookingButton() {
        val intent= Intent(this@AboutDestinationActivity,BookingActivity::class.java)
        binding!!.flightBookingButton.setOnClickListener {
            Toast.makeText(this@AboutDestinationActivity,"Not Yet Implemented", Toast.LENGTH_SHORT).show()
//            intent.putExtra(ForConstant.bookingKeyName, "Flights")
//            startActivity(intent)

        }
        binding!!.trainBookingButton.setOnClickListener {
            intent.putExtra(ForConstant.bookingKeyName, "Train")
            startActivity(intent)
        }
        binding!!.busBookingButton.setOnClickListener {
            Toast.makeText(this@AboutDestinationActivity,"Not Yet Implemented", Toast.LENGTH_SHORT).show()
//            intent.putExtra(ForConstant.bookingKeyName, "Bus")
//            startActivity(intent)
        }
        binding!!.cabBookingButton.setOnClickListener {
            Toast.makeText(this@AboutDestinationActivity,"Not Yet Implemented", Toast.LENGTH_SHORT).show()
//            intent.putExtra(ForConstant.bookingKeyName, "Cab")
//            startActivity(intent)
        }

    }
}