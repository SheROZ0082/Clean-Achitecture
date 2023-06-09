// Top-level build file where you can add configuration options common to all sub-projects/modules.
plugins {
    id (Plugins.AGP.application) version Versions.AGP apply false
    id (Plugins.AGP.library) version Versions.AGP apply false
    id (Plugins.Kotlin.android) version Versions.android apply false
    id (Plugins.DaggerHilt.hilt) version Versions.hilt apply false
    id("org.jetbrains.kotlin.jvm") version "1.7.20" apply false
}