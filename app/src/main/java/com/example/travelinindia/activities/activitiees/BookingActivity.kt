package com.example.travelinindia.activities.activitiees

import AirportAutoCompleteAdapter
import StationAutoCompleteAdapter
import android.app.DatePickerDialog
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener
import com.example.travelinindia.activities.ForConstant
import com.example.travelinindia.activities.models.AirportDetails
import com.example.travelinindia.activities.models.BookingSearchListModel
import com.example.travelinindia.databinding.ActivityBookingBinding
import com.google.android.material.textfield.TextInputEditText
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext


class BookingActivity : AppCompatActivity() {
    private var binding:ActivityBookingBinding?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityBookingBinding.inflate(layoutInflater)
        setContentView(binding!!.root)
        val intent = intent
        setSupportActionBar(binding!!.bookingCustomToolBar)
        val bookingName=intent.getStringExtra(ForConstant.bookingKeyName)
        supportActionBar!!.title=bookingName
        supportActionBar!!.setDisplayHomeAsUpEnabled(true);
        binding!!.getDateBooking.setOnClickListener {
            showDatePickerDialog(binding!!.getDateBooking)
        }
        var flightList=ArrayList<AirportDetails>()
        if (bookingName.equals("Train")) {
            trainListMenu()
        }else if(bookingName.equals("Flights")){
            GlobalScope.launch {
                backendClass().getFlightSedule()
//                val airportList = backendClass().getListOfAirport()
                withContext(Dispatchers.IO){
//                    flightBookingMenu(airportList)
                }

                // Pass the 'airportList' to another function for processing
            }


        }
        binding!!.bookingSearchButton.setOnClickListener {
            if(bookingName.equals("Flights")){
                val fromCode=getStationCode(binding!!.fromStationCode.text.toString())
                val toCode=getStationCode(binding!!.toStationCode.text.toString())
                val date=binding!!.getDateBooking.text.toString()
            }else if(bookingName.equals("Train")){
                val fromCode=getStationCode(binding!!.fromStationCode.text.toString())
                val toCode=getStationCode(binding!!.toStationCode.text.toString())
                val date=binding!!.getDateBooking.text.toString()
                if(fromCode.isNotEmpty()&& toCode.isNotEmpty() && date.isNotEmpty()){
                    val intent=Intent(this@BookingActivity,GetVehicleList::class.java)
                    intent.putExtra("StationNameFrom",fromCode.toString())
                    intent.putExtra("StationNameTo",toCode.toString())
                    intent.putExtra("date",date.toString())
                    startActivity(intent)
                }
            }
        }
    }
    private fun getStationCode(inputString:String):String{
        var textAfterComma=""
        val parts = inputString.split(",")
        if (parts.size >= 2) {
            textAfterComma = parts[1]
            println(textAfterComma) // This will print "DL"
        }
        return if(textAfterComma.isEmpty()){
            ""
        }else{
            textAfterComma
        }
    }
    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            onBackPressed()
            return true
        }
        return false
    }
    private fun flightBookingMenu(airportDetailList:ArrayList<AirportDetails>){
        Log.e("AirportList", airportDetailList.toString())

        binding!!.fromStationCode.addTextChangedListener { userData->
            val adapter = AirportAutoCompleteAdapter(this@BookingActivity,airportDetailList)
            binding!!.fromStationCode.setAdapter(adapter)

        }
        binding!!.toStationCode.addTextChangedListener { userData->
            val adapter = AirportAutoCompleteAdapter(this@BookingActivity,airportDetailList)
            binding!!.toStationCode.setAdapter(adapter)
        }
        binding!!.getDateBooking.setOnClickListener {
            showDatePickerDialog(binding!!.getDateBooking)
        }
//
////
//        binding!!.swapTheStation.setOnClickListener {
//            if(binding!!.fromStationCode.text.toString().isNotEmpty() && binding!!.toStationCode.text.toString().isNotEmpty()){
//                val swap=binding!!.fromStationCode.text.toString()
//                binding!!.fromStationCode.setText(binding!!.toStationCode.text.toString())
//                binding!!.toStationCode.setText(swap)
//            }
//        }
    }
    private fun trainListMenu(){
        binding!!.fromStationCode.addTextChangedListener { userData->
            GlobalScope.launch(Dispatchers.IO) {
                val data = backendClass().stationData(userData.toString())
                withContext(Dispatchers.Main) {
                    val adapter = StationAutoCompleteAdapter(this@BookingActivity,data.distinct())
                    binding!!.fromStationCode.setAdapter(adapter)
                }
            }
        }
        binding!!.toStationCode.addTextChangedListener { userData->
            GlobalScope.launch(Dispatchers.IO) {
                val data = backendClass().stationData(userData.toString())
                withContext(Dispatchers.Main) {
                    val adapter = StationAutoCompleteAdapter(this@BookingActivity,data.distinct())
                    binding!!.toStationCode.setAdapter(adapter)
                }
            }
        }
        binding!!.getDateBooking.setOnClickListener {
            showDatePickerDialog(binding!!.getDateBooking)
        }


        binding!!.swapTheStation.setOnClickListener {
            if(binding!!.fromStationCode.text.toString().isNotEmpty() && binding!!.toStationCode.text.toString().isNotEmpty()){
                val swap=binding!!.fromStationCode.text.toString()
                binding!!.fromStationCode.setText(binding!!.toStationCode.text.toString())
                binding!!.toStationCode.setText(swap)
            }
        }

    }


    private fun showDatePickerDialog(dateBooking: TextInputEditText) {
        // Parse the desired date ("2023-09-12") to obtain year, month, and day
        val desiredYear = 2023
        val desiredMonth = 8 // Months are 0-based (January is 0, so September is 8)
        val desiredDay = 12

        val datePicker = DatePickerDialog(
            this,
            DatePickerDialog.OnDateSetListener { view, year, month, dayOfMonth ->
                val selectedDate = "$year-${month + 1}-${dayOfMonth}" // Adjust month + 1 because months are 0-based
                dateBooking.setText(selectedDate)
            },
            desiredYear,
            desiredMonth,
            desiredDay
        )

         datePicker.datePicker.minDate = System.currentTimeMillis() - 1000

        datePicker.show()
    }

}