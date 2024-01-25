pluginManagement {
    val kotlin_version: String by settings
    val dokka_version: String by settings

    plugins {
        kotlin("jvm") version kotlin_version
        id("org.jetbrains.dokka") version dokka_version
    }


    repositories {
        mavenLocal()
        maven("https://maven.pkg.jetbrains.space/kotlin/p/dokka/test")
        maven("https://maven.pkg.jetbrains.space/kotlin/p/dokka/dev")
        maven("https://oss.sonatype.org/content/repositories/snapshots")
        gradlePluginPortal()
        mavenCentral()
    }
}
