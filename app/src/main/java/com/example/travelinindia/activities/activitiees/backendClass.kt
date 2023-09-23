package com.example.travelinindia.activities.activitiees

import android.util.Log
import com.example.travelinindia.activities.models.AirportDetails
import com.example.travelinindia.activities.models.FareInfo
import com.example.travelinindia.activities.models.FlightScheduleDetails
import com.example.travelinindia.activities.models.StationNameAndCode
import com.example.travelinindia.activities.models.trainInfoModel
import kotlinx.coroutines.Dispatchers

import kotlinx.coroutines.withContext

import okhttp3.MediaType.Companion.toMediaType
import okhttp3.OkHttpClient
import okhttp3.Request
import okhttp3.RequestBody
import okhttp3.Response
import okio.IOException
import org.json.JSONArray
import org.json.JSONObject
import org.xmlpull.v1.XmlPullParser
import org.xmlpull.v1.XmlPullParserFactory
import java.io.StringReader


class backendClass {
    suspend fun getTrainBetweenStation(
        stationFromCode: String,
        stationToCode: String,
        dateOfJourney: String
    ): List<trainInfoModel> {
        val arrayList = ArrayList<trainInfoModel>()
        try {
            withContext(Dispatchers.IO) {
                val client = OkHttpClient()

                val request = Request.Builder()
                    .url("https://irctc1.p.rapidapi.com/api/v3/trainBetweenStations?fromStationCode=$stationFromCode&toStationCode=$stationToCode&dateOfJourney=$dateOfJourney")
                    .get()
                    .addHeader(
                        "X-RapidAPI-Key",
                        "72897d918amsh3842dc9164d30d0p191005jsnd6faad28a903"
                    )
                    .addHeader("X-RapidAPI-Host", "irctc1.p.rapidapi.com")
                    .build()

                val response = client.newCall(request).execute()
                val responseBody = response.body?.string()

                if (response.isSuccessful) {
                    val jsonResponse = JSONObject(responseBody!!)
                    val status = jsonResponse.getBoolean("status")

                    if (status) {
                        val data = jsonResponse.getJSONArray("data")

                        for (i in 0 until data.length()) {
                            val firstObject = data.getJSONObject(i)

                            val trainNo = firstObject.optString("train_number")
                            val trainName = firstObject.optString("train_name")
                            val departureTime = firstObject.optString("from_sta")
                            val arrivalTime = firstObject.optString("to_sta")
                            val totalDuration = firstObject.optString("duration")
                            val runDay = firstObject.optString("run_days")
                            val sourceDes = firstObject.optString("train_src")
                            val trainDes = firstObject.optString("train_dstn")
                            val trainType = firstObject.optString("train_type")
                            val classType = firstObject.optString("class_type")

                            val dataList = trainInfoModel(
                                trainNo,
                                trainName,
                                departureTime,
                                arrivalTime,
                                totalDuration,
                                runDay,
                                sourceDes,
                                trainDes,
                                trainType,
                                classType
                            )

                            arrayList.add(dataList)
                        }
                    }
                }
            }
        } catch (e: Exception) {
            // Handle any exceptions that may occur during the network request
            e.printStackTrace()
        }

        return arrayList
    }

    suspend fun stationData(searchData: String): List<StationNameAndCode> =
        withContext(Dispatchers.IO) {
            val client = OkHttpClient()

            val mediaType = "application/json; charset=utf-8".toMediaType()
            val requestBody = RequestBody.create(
                mediaType, """
        {
            "search": "$searchData"
        }
    """.trimIndent()
            )

            val request = Request.Builder()
                .url("https://rstations.p.rapidapi.com/")
                .post(requestBody)
                .addHeader("Content-Type", "application/json")
                .addHeader("X-RapidAPI-Key", "b1044adf0bmsh60bb07c9c735a9ep1ba787jsn45077450af4c")
                .addHeader("X-RapidAPI-Host", "rstations.p.rapidapi.com")
                .build()

            try {
                val response: Response = client.newCall(request).execute()

                if (response.isSuccessful) {
                    val responseBody = response.body?.string()

                    responseBody?.let {
                        // Process the response data here
                        val data = JSONArray(it)
                        val stationInfoList = mutableListOf<StationNameAndCode>()

                        for (i in 0 until data.length()) {
                            val stationArray = data.getJSONArray(i)
                            if (stationArray.length() >= 2) {
                                val stationCode = stationArray.getString(0)
                                val stationName = stationArray.getString(1)

                                stationInfoList.add(StationNameAndCode(stationCode, stationName))
                            }
                        }

                        return@withContext stationInfoList
                    } ?: run {
                        println("Response body is null")
                    }
                } else {
                    println("Error: ${response.code} - ${response.message}")
                }
            } catch (e: IOException) {
                println("Network error: ${e.message}")
            }

            return@withContext emptyList() // Return an empty list in case of an error
        }
    suspend fun getTrainFare(
        stationFromCode: String,
        stationToCode: String,
        trainNo: String
    ): List<FareInfo> {
        val arrayList = ArrayList<FareInfo>()
        try {
            withContext(Dispatchers.IO) {
                val client = OkHttpClient()

                val request = Request.Builder()
                    .url("https://irctc1.p.rapidapi.com/api/v2/getFare?trainNo=$trainNo&fromStationCode=$stationFromCode&toStationCode=$stationToCode")
                    .get()
                    .addHeader("X-RapidAPI-Key", "72897d918amsh3842dc9164d30d0p191005jsnd6faad28a903")
                    .addHeader("X-RapidAPI-Host", "irctc1.p.rapidapi.com")
                    .build()

                val response = client.newCall(request).execute()
                val responseBody = response.body?.string()

                if (response.isSuccessful) {
                    val jsonResponse = JSONObject(responseBody!!)
                    val status = jsonResponse.getBoolean("status")

                    if (status) {
                        val data = jsonResponse.getJSONObject("data")
                        val generalArray = data.getJSONArray("general")
                        for (i in 0 until generalArray.length()) {
                            val generalObject = generalArray.getJSONObject(i)
                            val classType = generalObject.getString("classType")
                            val fare = generalObject.getDouble("fare")
                            val fareDataSet=FareInfo(classType.toString(),fare.toString())
                            arrayList.add(fareDataSet)
                            // Create a trainInfoModel instance and add it to the arrayList
                        }
                    }
                }
            }
        } catch (e: Exception) {
            // Handle any exceptions that may occur during the network request
            e.printStackTrace()
        }

        return arrayList
    }


    suspend fun getListOfAirport():ArrayList<AirportDetails>{

         return withContext(Dispatchers.IO) {
            try {
                val client = OkHttpClient()

                val request = Request.Builder()
                    .url("https://timetable-lookup.p.rapidapi.com/airports/")
                    .get()
                    .addHeader("X-RapidAPI-Key", "b1044adf0bmsh60bb07c9c735a9ep1ba787jsn45077450af4c")
                    .addHeader("X-RapidAPI-Host", "timetable-lookup.p.rapidapi.com")
                    .build()

                val response = client.newCall(request).execute()
                if (response.isSuccessful) {
                    val responseBody = response.body?.string()
                    Log.e("responce",parseXmlString(responseBody.toString()).toString())
                    return@withContext parseXmlString(responseBody.toString())
                } else {
                    // Handle non-successful response, e.g., log an error or return null
                    println("HTTP error: ${response.code}")

                }
            } catch (e: IOException) {
                // Handle network error, e.g., log an error or return null
                println("Network error: ${e.message}")

            }
             return@withContext ArrayList<AirportDetails>()
        }
    }
    suspend fun getFlightSedule(){
        val fromCode="BOS"
        val toCode="DEL"
        val date="20230927"
        withContext(Dispatchers.IO){
            try {
                val client = OkHttpClient()

                val request = Request.Builder()
                    .url("https://timetable-lookup.p.rapidapi.com/TimeTable/$fromCode/$toCode/$date/")
                    .get()
                    .addHeader("X-RapidAPI-Key", "b1044adf0bmsh60bb07c9c735a9ep1ba787jsn45077450af4c")
                    .addHeader("X-RapidAPI-Host", "timetable-lookup.p.rapidapi.com")
                    .build()

                val response = client.newCall(request).execute()
                if (response.isSuccessful) {
                    val responseBody = response.body?.string()
                    Log.e("responce", parseXmlString1(responseBody.toString()).toString())


                } else {
                    println("HTTP error: ${response.code}")

                }
            } catch (e: IOException) {
                println("Network error: ${e.message}")

            }
        }
    }
    fun parseXmlString(xmlString: String):ArrayList<AirportDetails> {
        try {
            val arrayList=ArrayList<AirportDetails>()
            val factory = XmlPullParserFactory.newInstance()
            val parser = factory.newPullParser()
            parser.setInput(StringReader(xmlString))

            var eventType = parser.eventType
            var airportDetails: AirportDetails? = null

            while (eventType != XmlPullParser.END_DOCUMENT) {
                when (eventType) {
                    XmlPullParser.START_TAG -> {
                        var tagName = parser.name
                        if (tagName == "Airport") {
                          val data= AirportDetails(parser.getAttributeValue(null, "IATACode"),
                                parser.getAttributeValue(null, "Country"),
                                parser.getAttributeValue(null, "State"),
                                parser.getAttributeValue(null, "Name"))

                            arrayList.add(data)                        }
                    }

                }
                eventType = parser.next()
            }
            Log.e("XmlParse", "Start tag: ${arrayList.size}")
            return arrayList

        } catch (e: Exception) {
            Log.e("XmlParse", "Parsing error: ${e.message}")
        }
        return ArrayList()
    }
    fun parseXmlString1(xmlString: String):ArrayList<FlightScheduleDetails> {
        try {
            val arrayList=ArrayList<FlightScheduleDetails>()
            val factory = XmlPullParserFactory.newInstance()
            val parser = factory.newPullParser()
            parser.setInput(StringReader(xmlString))

            var eventType = parser.eventType

            while (eventType != XmlPullParser.END_DOCUMENT) {
                when (eventType) {
                    XmlPullParser.START_TAG -> {
                        var tagName = parser.name
                        if (tagName == "FlightLegDetails") {
                            val data= FlightScheduleDetails(parser.getAttributeValue(null, "TotalFlightTime"),
                                parser.getAttributeValue(null, "TotalMiles"),
                                parser.getAttributeValue(null, "TotalTripTime"),
                                parser.getAttributeValue(null, "FLSDepartureDateTime"),
                                parser.getAttributeValue(null, "FLSDepartureTimeOffset"),
                                parser.getAttributeValue(null, "FLSDepartureCode"),
                                parser.getAttributeValue(null, "FLSDepartureName"),
                                parser.getAttributeValue(null, "FLSArrivalDateTime"),
                                parser.getAttributeValue(null, "FLSArrivalTimeOffset"),
                                parser.getAttributeValue(null, "FLSArrivalCode"),
                                parser.getAttributeValue(null, "FLSArrivalName"),
                                parser.getAttributeValue(null, "FLSFlightType"),
                                parser.getAttributeValue(null, "FLSFlightLegs"),
                                parser.getAttributeValue(null, "FLSFlightDays"),
                                parser.getAttributeValue(null, "FLSDayIndicator"),
                            )
                            Log.e("See data",data.toString())
                            arrayList.add(data)                        }
                    }

                }
                eventType = parser.next()
            }
            Log.e("XmlParse", "Start tag: ${arrayList.size}")
            return arrayList

        } catch (e: Exception) {
            Log.e("XmlParse", "Parsing error: ${e.message}")
        }
        return ArrayList()
    }

}