plugins {
    kotlin("jvm") version "1.7.20"
    id("org.jetbrains.dokka") version "1.7.20" apply false
}

repositories {
    mavenLocal()
    maven("https://maven.pkg.jetbrains.space/kotlin/p/dokka/dev")
    maven("https://oss.sonatype.org/content/repositories/snapshots")
    maven("https://plugins.gradle.org/m2/")
    mavenCentral()
}

val dokkaVersion: String by project

apply(plugin = "org.jetbrains.dokka")

project.buildDir = File("$projectDir/outputCustomTesting")

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation(kotlin("test-junit"))
}
