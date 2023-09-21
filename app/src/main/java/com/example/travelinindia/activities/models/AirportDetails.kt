package com.example.travelinindia.activities.models

import org.simpleframework.xml.Element
import org.simpleframework.xml.Root

@Root(name = "Airport")
data class AirportDetails(
    @field:Element(name = "IATACode")
    var IATACode: String? = null,

    @field:Element(name = "Country")
    var Country: String? = null,

    @field:Element(name = "State")
    var State: String? = null,

    @field:Element(name = "Name")
    var Name: String? = null
)

