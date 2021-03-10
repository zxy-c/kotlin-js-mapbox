plugins {
    id("org.jetbrains.kotlin.js")
    `maven-publish`
}

group = "org.zxy"
version = "2.1.1"
repositories {
    mavenLocal()
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib-js"))
    implementation(npm("mapbox-gl",version as String))
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

publishing {
    repositories {
        mavenLocal()
    }
    publications {
        create<MavenPublication>("maven") {
            artifactId = "kotlin-js-mapbox"

            from(components["kotlin"])
        }
    }
}