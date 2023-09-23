package com.example.travelinindia.activities.models

data class AllStateModel(
    val StateName:String,
    val description:String,
    val imageLink:String,
    val destinationListInState:ArrayList<PopularDestinationModel>,
    val startno:Int,
    val endNo:Int,
)
