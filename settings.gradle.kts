rootProject.name = "kotlin-js-mapbox"
include("core")
findProject(":core")?.name = "kotlin-js-mapbox-core"
include("geocoder")
findProject(":geocoder")?.name = "kotlin-js-mapbox-geocoder"
