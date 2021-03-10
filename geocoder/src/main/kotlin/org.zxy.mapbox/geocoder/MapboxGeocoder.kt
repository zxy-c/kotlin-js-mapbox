
package org.zxy.mapbox.geocoder

import org.zxy.mapbox.MapboxControl
import org.zxy.mapbox.MapboxModule

@JsModule("@mapbox/mapbox-gl-geocoder")
@JsNonModule
external class MapboxGeocoder(
    options: MapboxGeocoderOptions
) : MapboxControl {
    fun on(type: String, event: EventHandler):MapboxGeocoder
}

external interface MapboxGeocoderOptions {
    var accessToken: String
    var mapboxgl: MapboxModule
}