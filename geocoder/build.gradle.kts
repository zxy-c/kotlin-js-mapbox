plugins {
    id("org.jetbrains.kotlin.js")
    `maven-publish`
}

group = "org.zxy"
version = "4.7.0"

repositories {
    mavenLocal()
    mavenCentral()
}

kotlin {
    js {
        browser {
            webpackTask {
                cssSupport.enabled = true
            }

            runTask {
                cssSupport.enabled = true
            }

            testTask {
                useKarma {
                    useChromeHeadless()
                    webpackConfig.cssSupport.enabled = true
                }
            }
        }
        binaries.executable()
    }
}

dependencies {
    implementation(kotlin("stdlib-js"))
    implementation(npm("@mapbox/mapbox-gl-geocoder",version as String))
    implementation(project(":kotlin-js-mapbox-core"))
}

publishing {
    repositories {
        mavenLocal()
    }
    publications {
        create<MavenPublication>("maven") {
            artifactId = "kotlin-js-mapbox-geocoder"

            from(components["kotlin"])
        }
    }
}