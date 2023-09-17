package com.example.travelinindia.activities.activitiees

import StationAutoCompleteAdapter
import android.app.DatePickerDialog
import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.core.widget.addTextChangedListener
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
        supportActionBar!!.title=intent.getStringExtra("MESSAGE_KEY")
        supportActionBar!!.setDisplayHomeAsUpEnabled(true);
//        searchFilterBooking()
        binding!!.getDateBooking.setOnClickListener {
            showDatePickerDialog(binding!!.getDateBooking)
        }
        trainListMenu()


        binding!!.bookingSearchButton.setOnClickListener {
            val fromCode=getStationCode(binding!!.fromStationCode.text.toString())
            val toCode=getStationCode(binding!!.toStationCode.text.toString())
            Log.e("StationCode",fromCode)
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
    private fun trainListMenu(){
        binding!!.fromStationCode.addTextChangedListener { userData->
            GlobalScope.launch(Dispatchers.IO) {
                val data = backendClass().stationData(userData.toString())
                withContext(Dispatchers.Main) {
                    // Update UI components here
                    val adapter = StationAutoCompleteAdapter(this@BookingActivity,data.distinct())
                    binding!!.fromStationCode.setAdapter(adapter)
                }
            }
        }
        binding!!.toStationCode.addTextChangedListener { userData->
            GlobalScope.launch(Dispatchers.IO) {
                val data = backendClass().stationData(userData.toString())
                withContext(Dispatchers.Main) {
                    // Update UI components here
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
                // Called when the user selects a date
                val selectedDate = "$year-${month + 1}-${dayOfMonth}" // Adjust month + 1 because months are 0-based
                dateBooking.setText(selectedDate)
            },
            desiredYear,
            desiredMonth,
            desiredDay
        )

        // Optionally, set date limits (e.g., minimum and maximum dates)
         datePicker.datePicker.minDate = System.currentTimeMillis() - 1000
        // datePicker.datePicker.maxDate = System.currentTimeMillis() + 1000

        datePicker.show()
    }
    private fun searchFilterBooking(){
        val dataSets = listOf(
            BookingSearchListModel(
                nameOfVehicle = "Flight to India",
                startTime = "08:00 AM",
                startPlace = "New York",
                endTime = "10:30 PM",
                endPlace = "Mumbai",
                totalTime = "14 hours 30 minutes",
                costOfJourneyEstimated = "$800"
            ),
            BookingSearchListModel(
                nameOfVehicle = "Flight to India",
                startTime = "07:30 AM",
                startPlace = "London",
                endTime = "09:45 PM",
                endPlace = "Delhi",
                totalTime = "12 hours 15 minutes",
                costOfJourneyEstimated = "$900"
            ),
            BookingSearchListModel(
                nameOfVehicle = "Flight to India",
                startTime = "10:15 AM",
                startPlace = "Los Angeles",
                endTime = "11:55 PM",
                endPlace = "Chennai",
                totalTime = "14 hours 40 minutes",
                costOfJourneyEstimated = "$950"
            ),    BookingSearchListModel(
                nameOfVehicle = "Flight to India",
                startTime = "08:00 AM",
                startPlace = "New York",
                endTime = "10:30 PM",
                endPlace = "Mumbai",
                totalTime = "14 hours 30 minutes",
                costOfJourneyEstimated = "$800"
            ),
            BookingSearchListModel(
                nameOfVehicle = "Flight to India",
                startTime = "07:30 AM",
                startPlace = "London",
                endTime = "09:45 PM",
                endPlace = "Delhi",
                totalTime = "12 hours 15 minutes",
                costOfJourneyEstimated = "$900"
            ),
            BookingSearchListModel(
                nameOfVehicle = "Flight to India",
                startTime = "10:15 AM",
                startPlace = "Los Angeles",
                endTime = "11:55 PM",
                endPlace = "Chennai",
                totalTime = "14 hours 40 minutes",
                costOfJourneyEstimated = "$950"
            ),
            BookingSearchListModel(
                nameOfVehicle = "Flight to India",
                startTime = "09:45 AM",
                startPlace = "Sydney",
                endTime = "11:15 PM",
                endPlace = "Kolkata",
                totalTime = "13 hours 30 minutes",
                costOfJourneyEstimated = "$850"
            ),
            BookingSearchListModel(
                nameOfVehicle = "Flight to India",
                startTime = "08:30 AM",
                startPlace = "Toronto",
                endTime = "10:00 PM",
                endPlace = "Bengaluru",
                totalTime = "13 hours 30 minutes",
                costOfJourneyEstimated = "$820"
            ),
            BookingSearchListModel(
                nameOfVehicle = "Flight to India",
                startTime = "06:45 AM",
                startPlace = "Paris",
                endTime = "08:30 PM",
                endPlace = "Hyderabad",
                totalTime = "12 hours 45 minutes",
                costOfJourneyEstimated = "$920"
            ),
            BookingSearchListModel(
                nameOfVehicle = "Flight to India",
                startTime = "10:30 AM",
                startPlace = "San Francisco",
                endTime = "12:45 AM",
                endPlace = "Bangkok",
                totalTime = "16 hours 15 minutes",
                costOfJourneyEstimated = "$1000"
            ),
            BookingSearchListModel(
                nameOfVehicle = "Flight to India",
                startTime = "08:15 AM",
                startPlace = "Dubai",
                endTime = "10:45 PM",
                endPlace = "Jaipur",
                totalTime = "11 hours 30 minutes",
                costOfJourneyEstimated = "$780"
            ),
            BookingSearchListModel(
                nameOfVehicle = "Flight to India",
                startTime = "09:00 AM",
                startPlace = "Singapore",
                endTime = "11:30 PM",
                endPlace = "Ahmedabad",
                totalTime = "11 hours 30 minutes",
                costOfJourneyEstimated = "$790"
            ),
            BookingSearchListModel(
                nameOfVehicle = "Flight to India",
                startTime = "07:00 AM",
                startPlace = "Hong Kong",
                endTime = "09:15 PM",
                endPlace = "Pune",
                totalTime = "12 hours 15 minutes",
                costOfJourneyEstimated = "$850"
            )
        )

    }
//    private fun bookingSearchListAdapterWorking(fromCode: String, toCode: String, date: String) {
//        // You should call this function from a coroutine scope
//        GlobalScope.launch(Dispatchers.Main) {
//            try {
//                // Fetch train data using the suspend function getTrainBetweenStation
//                val arrayList = backendClass().getTrainBetweenStation(fromCode, toCode, date)
//
//                if (arrayList.isEmpty()) {
//                    Toast.makeText(this@BookingActivity, "No Element", Toast.LENGTH_LONG).show()
//                } else {
//                    // Show the retrieved data in a Toast (for debugging)
//                    Toast.makeText(this@BookingActivity, arrayList.toString(), Toast.LENGTH_LONG).show()
//
//                    // Set up the RecyclerView and adapter to display the data
//                    val adapter = BookingListAdapter(ArrayList(arrayList))
//                    val layoutManager = LinearLayoutManager(this@BookingActivity)
//                    binding!!.bookingSearchRv.layoutManager = layoutManager
//                    binding!!.bookingSearchRv.adapter = adapter
//                }
//            } catch (e: Exception) {
//                // Handle any exceptions that may occur during the network request
//                Toast.makeText(this@BookingActivity, "An error occurred: ${e.message}", Toast.LENGTH_LONG).show()
//            }
//        }
//    }

}