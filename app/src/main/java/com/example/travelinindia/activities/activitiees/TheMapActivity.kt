package com.example.travelinindia.activities.activitiees

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.MotionEvent
import android.widget.ImageView
import android.widget.Toast
import com.example.travelinindia.R
import com.example.travelinindia.activities.ForConstant
import com.example.travelinindia.activities.impClasses.LinkToImage

class TheMapActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_the_map)

        val imageView=findViewById<ImageView>(R.id.imageView)
        val list=GetTheDataToSetInApp().dataForEveryState()
        imageView.setOnTouchListener { v, event ->
            when (event.action) {
                MotionEvent.ACTION_DOWN -> {
                    val x = event.x
                    val y = event.y
                    //Bihar
                    if(x<712&& x>630 && y<1020 && y>990){
                        val intent=Intent(this@TheMapActivity,AboutDestinationActivity::class.java)
                        intent.putExtra(ForConstant.getaboutContentName,list[1].StateName)
                        intent.putExtra(ForConstant.getaboutContentDescription,list[1].description)
                        intent.putExtra(ForConstant.getaboutContentUrl,list[1].imageLink)
                        intent.putExtra(ForConstant.getaboutContentStart,list[1].startno)
                        intent.putExtra(ForConstant.getaboutContentEnd,list[1].endNo)
                        startActivity(intent)
                    }
                    if(x<480 && x>340 && y<1761 && y>1500){
                        val intent=Intent(this@TheMapActivity,AboutDestinationActivity::class.java)
                        intent.putExtra(ForConstant.getaboutContentName,list[6].StateName)
                        intent.putExtra(ForConstant.getaboutContentDescription,list[6].description)
                        intent.putExtra(ForConstant.getaboutContentUrl,list[6].imageLink)
                        intent.putExtra(ForConstant.getaboutContentStart,list[6].startno)
                        intent.putExtra(ForConstant.getaboutContentEnd,list[6].endNo)
                        startActivity(intent)
                    }
                    if(x<580 && x>365 && y<1015 && y>880){
                        val intent=Intent(this@TheMapActivity,AboutDestinationActivity::class.java)
                        intent.putExtra(ForConstant.getaboutContentName,list[12].StateName)
                        intent.putExtra(ForConstant.getaboutContentDescription,list[12].description)
                        intent.putExtra(ForConstant.getaboutContentUrl,list[12].imageLink)
                        intent.putExtra(ForConstant.getaboutContentStart,list[12].startno)
                        intent.putExtra(ForConstant.getaboutContentEnd,list[12].endNo)
                        startActivity(intent)
                    }
                    //west bengal
                    if(x<801 && x>702 && y<1110 && y>1090){
                        val intent=Intent(this@TheMapActivity,AboutDestinationActivity::class.java)
                        intent.putExtra(ForConstant.getaboutContentName,list[0].StateName)
                        intent.putExtra(ForConstant.getaboutContentDescription,list[0].description)
                        intent.putExtra(ForConstant.getaboutContentUrl,list[0].imageLink)
                        intent.putExtra(ForConstant.getaboutContentStart,list[0].startno)
                        intent.putExtra(ForConstant.getaboutContentEnd,list[0].endNo)
                        startActivity(intent)
                    }
                    //rajastan
                    if(x<352 && x>105 && y<1064 && y>862){
                        val intent=Intent(this@TheMapActivity,AboutDestinationActivity::class.java)
                        intent.putExtra(ForConstant.getaboutContentName,list[13].StateName)
                        intent.putExtra(ForConstant.getaboutContentDescription,list[13].description)
                        intent.putExtra(ForConstant.getaboutContentUrl,list[13].imageLink)
                        intent.putExtra(ForConstant.getaboutContentStart,list[13].startno)
                        intent.putExtra(ForConstant.getaboutContentEnd,list[13].endNo)
                        startActivity(intent)
                    }
                    Toast.makeText(this@TheMapActivity,"x = $x and y=$y",Toast.LENGTH_SHORT).show()
                    true
                }
                else -> false
            }
        }

    }
}