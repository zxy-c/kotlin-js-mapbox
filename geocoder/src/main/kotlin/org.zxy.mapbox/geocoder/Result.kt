package org.zxy.mapbox.geocoder

external interface Result {
    val center: Array<Double>
    val id: String
    val place_name: String
    val text: String
}