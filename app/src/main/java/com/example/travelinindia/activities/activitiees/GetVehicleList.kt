package com.example.travelinindia.activities.activitiees

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.view.View

import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager

import com.example.travelinindia.activities.adapters.BookingListAdapter
import com.example.travelinindia.databinding.ActivityGetVehicleViewBinding

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope

import kotlinx.coroutines.launch


class GetVehicleList : AppCompatActivity() {
    private var binding:ActivityGetVehicleViewBinding?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityGetVehicleViewBinding.inflate(layoutInflater)
        setContentView(binding!!.root)
        val intent= intent
        val stationNameFrom = intent.getStringExtra("StationNameFrom") ?: ""
        val stationNameTo = intent.getStringExtra("StationNameTo") ?: ""
        val getDate=intent.getStringExtra("date")?: ""
        setSupportActionBar(binding!!.getVehicleToolBar)
        supportActionBar!!.title="Train List"
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        if(stationNameFrom.isNotEmpty() && stationNameTo.isNotEmpty() && getDate.isNotEmpty()){
            bookingSearchListAdapterWorking(stationNameFrom.trim(),stationNameTo.trim(),getDate.trim())
        }



    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            onBackPressed()
            return true
        }
        return false
    }

    private fun bookingSearchListAdapterWorking(fromCode: String, toCode: String, date: String) {
            GlobalScope.launch(Dispatchers.Main) {
                try {
                    // Fetch train data using the suspend function getTrainBetweenStation
                    val arrayList = backendClass().getTrainBetweenStation(fromCode, toCode, date)
                    if (arrayList.isEmpty()) {
                        Toast.makeText(this@GetVehicleList, "No Element", Toast.LENGTH_LONG).show()
                    } else {
                        binding!!.progressBar.visibility=View.GONE
                        // Show the retrieved data in a Toast (for debugging)
                        Toast.makeText(this@GetVehicleList, arrayList.toString(), Toast.LENGTH_LONG)
                            .show()

                        // Set up the RecyclerView and adapter to display the data
                        val adapter = BookingListAdapter(ArrayList(arrayList),this@GetVehicleList)
                        val layoutManager = LinearLayoutManager(this@GetVehicleList)
                        binding!!.bookingSearchRv.layoutManager = layoutManager
                        binding!!.bookingSearchRv.adapter = adapter
                    }
                } catch (e: Exception) {
                    Toast.makeText(
                        this@GetVehicleList,
                        "An error occurred: ${e.message}",
                        Toast.LENGTH_LONG
                    ).show()
                }
            }
    }
}