package org.zxy.mapbox.geocoder

import kotlinx.browser.document
import org.w3c.dom.HTMLLinkElement

fun buildStyles(){
    val link = document.createElement("link") as HTMLLinkElement
    link.href = "https://api.mapbox.com/mapbox-gl-js/plugins/mapbox-gl-geocoder/v4.5.1/mapbox-gl-geocoder.css"
    link.rel = "stylesheet"
    document.head?.append(link)
}