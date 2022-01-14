import org.jetbrains.dokka.gradle.DokkaTask
import java.net.URL

plugins {
    kotlin("jvm") version "1.6.10"
    id("org.jetbrains.dokka") version "1.6.20.5-SNAPSHOT" // branch with br in signatures + val/var
}

repositories {
    mavenLocal()
    maven("https://maven.pkg.jetbrains.space/kotlin/p/dokka/dev")
    maven("https://oss.sonatype.org/content/repositories/snapshots")
    mavenCentral()
}

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation(kotlin("test-junit"))

    // Will apply the plugin to all dokka tasks
    dokkaPlugin("org.jetbrains.dokka:kotlin-as-java-plugin:1.6.20.5-SNAPSHOT")
}

tasks.withType<DokkaTask>().configureEach {
    dokkaSourceSets {
        named("main") {
            moduleName.set("Dokka Debug KTS")
            sourceLink {
                localDirectory.set(file("src/main/kotlin"))
                remoteUrl.set(
                    URL(
                        "https://github.com/IgnatBeresnev/dokka-debug-kts/tree/master/src/main/kotlin"
                    )
                )
                remoteLineSuffix.set("#L")
            }
        }
    }
}