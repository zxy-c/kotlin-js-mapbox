@file:JsModule("mapbox-gl/dist/mapbox-gl.js")
@file:JsNonModule

package org.zxy.mapbox

external var accessToken: String

external class Map(
    options: MapOptions
) {
    fun addControl(control: MapboxControl, position: String? = definedExternally):Map
}

external interface MapOptions {
    /**
     * HtmlElement or string
     */
    var container: dynamic
    var style: String
    var center: Array<Double>
    var zoom:Int
}