package org.zxy.mapbox

fun Map.addControl(control: MapboxControl, position: MapboxControlPosition? = null):Map {
    return this.addControl(control, position?.displayName)
}

enum class MapboxControlPosition(val displayName: String) {
    TOP_LEFT("top-left"),
    TOP_RIGHT("top-right"),
    BOTTOM_LEFT("bottom-left"),
    BOTTOM_RIGHT("bottom-right")
}