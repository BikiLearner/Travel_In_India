package com.example.travelinindia.activities.models

data class FlightScheduleDetails(
    val TotalFlightTime: String? = null,
    val TotalMiles: String? = null,
    val TotalTripTime: String? = null,
    val FLSDepartureDateTime: String? = null,
    val FLSDepartureTimeOffset: String? = null,
    val FLSDepartureCode: String? = null,
    val FLSDepartureName: String? = null,
    val FLSArrivalDateTime: String? = null,
    val FLSArrivalTimeOffset: String? = null,
    val FLSArrivalCode: String? = null,
    val FLSArrivalName: String? = null,
    val FLSFlightType: String? = null,
    val FLSFlightLegs: String? = null,
    val FLSFlightDays: String? = null,
    val FLSDayIndicator: String? = null,
)
