@file:JsModule("mapbox-gl/dist/mapbox-gl.js")
@file:JsNonModule
package org.zxy.mapbox

external var accessToken: String

external class Map(
    options: MapOptions
)

external interface MapOptions {
    var container: String
    var style: String
}