package org.zxy.mapbox

import kotlinx.browser.document
import org.w3c.dom.HTMLLinkElement

fun buildStyles(){
    val link = document.createElement("link") as HTMLLinkElement
    link.href = "https://api.mapbox.com/mapbox-gl-js/v2.1.1/mapbox-gl.css"
    link.rel = "stylesheet"
    document.head?.append(link)
}