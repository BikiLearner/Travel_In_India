package com.example.travelinindia.activities.models

data class StoriesByTravellerModel(
    val titleOfStory: String,
    val smallDescriptionOfStory: String,
    val nameOfTheCreator: String,
    val postedTimeInHour: String,
    val videoLink: String,
    val imageLink: String
) {
    constructor(
        titleOfStory: String,
        smallDescriptionOfStory: String,
        nameOfTheCreator: String,
        postedTimeInHour: String,
        videoLink: String
    ) : this(titleOfStory, smallDescriptionOfStory, nameOfTheCreator, postedTimeInHour, videoLink, "")

    // Use named parameters for the second constructor
}




