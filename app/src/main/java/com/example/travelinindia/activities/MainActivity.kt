package com.example.travelinindia.activities

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.net.ConnectivityManager
import android.net.NetworkCapabilities

import android.os.Bundle
import android.util.Log
import android.view.View
import android.webkit.WebChromeClient
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.travelinindia.activities.activitiees.BookingActivity
import com.example.travelinindia.activities.activitiees.GetTheDataToSetInApp
import com.example.travelinindia.activities.activitiees.LoginPange
import com.example.travelinindia.activities.activitiees.SearchActivity
import com.example.travelinindia.activities.activitiees.TheMapActivity
import com.example.travelinindia.activities.activitiees.UserProfile
import com.example.travelinindia.activities.activitiees.WebHandelingActivity
import com.example.travelinindia.activities.activitiees.backendClass

import com.example.travelinindia.activities.adapters.AllStatesAndUnionAdapter
import com.example.travelinindia.activities.adapters.PopularDestinationAdapter
import com.example.travelinindia.activities.adapters.StoriesByTravellerAdapter
import com.example.travelinindia.activities.models.AllStateModel
import com.example.travelinindia.activities.models.PopularDestinationModel
import com.example.travelinindia.activities.models.StoriesByTravellerModel
import com.example.travelinindia.databinding.ActivityMainBinding
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.launch
import okhttp3.OkHttpClient
import okhttp3.Request



class MainActivity : AppCompatActivity() {
    private var binding:ActivityMainBinding?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding!!.root)
        setAllStateValue()
        setAllPopularView()
        setStoriesByTraveller()
        val window=window
        window.statusBarColor=Color.parseColor("#F4ECEC")
        setSupportActionBar(binding!!.customStatusBarHome)
        supportActionBar!!.title = "My India"
            if (!checkForInternet(this@MainActivity)) {
                binding!!.noInternetConnection.visibility = View.VISIBLE
                binding!!.homeScrollView.visibility = View.GONE
            } else {
                binding!!.noInternetConnection.visibility = View.GONE
                binding!!.homeScrollView.visibility = View.VISIBLE
            }


        binding!!.webView.settings.javaScriptEnabled = true

        val videoId = "aPpFi0fZVAU" // Replace with your YouTube video ID
        val iframe = "<iframe width=\"100%\" height=\"100%\" src=\"https://www.youtube.com/embed/$videoId?autoplay=1\" frameborder=\"0\" allowfullscreen></iframe>"
        binding!!.webView.loadData(iframe,"text/html","utf-8")
        binding!!.webView.webChromeClient= WebChromeClient()

//        irctcGetData()

        binding!!.profileImage.setOnClickListener {
            val auth = Firebase.auth
            if(auth.currentUser!=null) {
                startActivity(Intent(this@MainActivity,UserProfile::class.java))
            }else{
                val intent= Intent(this@MainActivity,LoginPange::class.java)
                startActivity(intent)
            }

        }
        binding!!.searchButton.setOnClickListener {
            val intent= Intent(this@MainActivity,SearchActivity::class.java)
            startActivity(intent)
        }
        allBookingButton()
        binding!!.mapButton.setOnClickListener {
            val intent= Intent(this,TheMapActivity::class.java)
//            intent.putExtra(ForConstant.getUrl,"https://www.google.com/maps/search/hotels+near+me/@22.5285939,88.3803938,13z/data=!3m1!4b1?entry=ttu")
            startActivity(intent)
        }
    }

    private fun allBookingButton() {
        val intent= Intent(this@MainActivity,BookingActivity::class.java)
        binding!!.flightBookingButton.setOnClickListener {
            Toast.makeText(this@MainActivity,"Not Yet Implemented",Toast.LENGTH_SHORT).show()
//            intent.putExtra(ForConstant.bookingKeyName, "Flights")
//            startActivity(intent)

        }
        binding!!.trainBookingButton.setOnClickListener {
            intent.putExtra(ForConstant.bookingKeyName, "Train")
            startActivity(intent)
        }
        binding!!.busBookingButton.setOnClickListener {
            Toast.makeText(this@MainActivity,"Not Yet Implemented",Toast.LENGTH_SHORT).show()
//            intent.putExtra(ForConstant.bookingKeyName, "Bus")
//            startActivity(intent)
        }
        binding!!.cabBookingButton.setOnClickListener {
            Toast.makeText(this@MainActivity,"Not Yet Implemented",Toast.LENGTH_SHORT).show()
//            intent.putExtra(ForConstant.bookingKeyName, "Cab")
//            startActivity(intent)
        }

    }

    //private fun playVideo(url: String){
//
//    val videoUrl = "file:///C:/Users/DELL/Downloads/Untitled%20video%20-%20Made%20with%20Clipchamp.mp4" // Replace with your video URL
//    binding!!.videoView.setVideoPath(videoUrl)
//   binding!!.videoView.start()
//}
    private fun setAllStateValue(){
        val list=GetTheDataToSetInApp().dataForEveryState()
        var adapter = AllStatesAndUnionAdapter(ArrayList(list.subList(0,4)),this@MainActivity)
        var layoutManager = GridLayoutManager(this, 4)
        binding!!.allStateRv.layoutManager = layoutManager
        binding!!.allStateRv.adapter = adapter
        var isMoreOn=false
        binding!!.showMoreStateTv.setOnClickListener {
           if (!isMoreOn){
               adapter = AllStatesAndUnionAdapter(list,this@MainActivity)
               layoutManager = GridLayoutManager(this, 4)

               binding!!.allStateRv.layoutManager = layoutManager
               binding!!.allStateRv.adapter = adapter
               isMoreOn=true
           }else{
               adapter = AllStatesAndUnionAdapter(ArrayList(list.subList(0,4)),this@MainActivity)
               layoutManager = GridLayoutManager(this, 4)

               binding!!.allStateRv.layoutManager = layoutManager
               binding!!.allStateRv.adapter = adapter
               isMoreOn=false
           }
        }

        binding!!.mapButton.setOnClickListener {
            val intent=Intent(this@MainActivity,WebHandelingActivity::class.java)
            intent.putExtra(ForConstant.getUrl,"https://www.google.com/maps")
            startActivity(intent)
        }

    }
    private fun setAllPopularView(){
        val list=GetTheDataToSetInApp().getPopulardestinationLink()

        val adapter=PopularDestinationAdapter(this@MainActivity,list)

        val layoutManager = LinearLayoutManager(this@MainActivity,LinearLayoutManager.HORIZONTAL,false)

        binding!!.popularDesRv.layoutManager = layoutManager
        binding!!.popularDesRv.adapter = adapter
    }
    private fun setStoriesByTraveller(){
        val list=ArrayList<StoriesByTravellerModel>()
        val data1=StoriesByTravellerModel("Just In","In Kolkata","Biki","9H ago","https://www.bengaltourism.in/religious-pilgrimage/dak.jpg")
        list.add(data1)
        val data2=StoriesByTravellerModel("Just In","In Kolkata","Biki","9H ago","","https://travellersworldwide.com/wp-content/uploads/2023/02/Shutterstock_269556380.jpg.webp")
        list.add(data2)
        val data3=StoriesByTravellerModel("Just In","In Kolkata","Biki","9H ago","https://www.bengaltourism.in/religious-pilgrimage/dak.jpg")
        list.add(data3)
        val data4=StoriesByTravellerModel("Just In","In Kolkata","Biki","9H ago","","https://encrypted-tbn1.gstatic.com/images?q=tbn:ANd9GcR_MQ1blopp4ngS3_lmE5miAiM0oVy76PhiqJ9eyg5-GPK0ygUu")
        list.add(data4)
        val data5=StoriesByTravellerModel("Just In","In Kolkata","Biki","9H ago","","https://www.bengaltourism.in/religious-pilgrimage/dak.jpg")
        list.add(data5)
        val data6=StoriesByTravellerModel("Just In","In Kolkata","Biki","9H ago","https://www.bengaltourism.in/religious-pilgrimage/dak.jpg")
        list.add(data6)
        val adapter = StoriesByTravellerAdapter(list)
        binding!!.storiesByTravellerRv.adapter = adapter
    }
    private fun checkForInternet(context: Context): Boolean {


        val connectivityManager =
            context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

        val network = connectivityManager.activeNetwork ?: return false

        // Representation of the capabilities of an active network.
        val activeNetwork = connectivityManager.getNetworkCapabilities(network) ?: return false

        return when {
            // Indicates this network uses a Wi-Fi transport,
            // or WiFi has network connectivity
            activeNetwork.hasTransport(NetworkCapabilities.TRANSPORT_WIFI) -> true

            // Indicates this network uses a Cellular transport. or
            // Cellular has network connectivity
            activeNetwork.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR) -> true

            // else return false
            else -> false
        }
    }
}