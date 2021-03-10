package org.zxy.mapbox.geocoder

fun MapboxGeocoder.on(type: EventType, eventHandler: EventHandler): MapboxGeocoder {
    return this.on(type.name, eventHandler)
}

@Suppress("EnumEntryName")
enum class EventType {
    clear,
    loading,
    results,
    result,
    error
}

external interface Event

typealias EventHandler = (event: Event) -> Unit

external interface ResultEvent : Event {
    val result: Result
}