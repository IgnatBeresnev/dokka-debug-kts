import org.jetbrains.dokka.gradle.DokkaTask
import org.jetbrains.dokka.DokkaConfiguration.Visibility
import java.net.URL

plugins {
    kotlin("jvm") version "1.6.21"
    id("org.jetbrains.dokka")
}

repositories {
    mavenLocal()
    maven("https://maven.pkg.jetbrains.space/kotlin/p/dokka/dev")
    maven("https://oss.sonatype.org/content/repositories/snapshots")
    maven("https://plugins.gradle.org/m2/")
    mavenCentral()
}

val dokkaVersion: String by project

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation(kotlin("test-junit"))

    dokkaPlugin("org.jetbrains.dokka:versioning-plugin:$dokkaVersion")
}

tasks.withType<DokkaTask>().configureEach {
    dokkaSourceSets {
        named("main") {
            moduleName.set("Dokka Debug KTS")
            sourceLink {
                documentedVisibilities.set(
                    listOf(
                        Visibility.PUBLIC,
                        Visibility.PROTECTED
                    )
                )
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
