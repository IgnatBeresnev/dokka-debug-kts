import org.jetbrains.dokka.gradle.DokkaTask

plugins {
    kotlin("jvm")
    id("org.jetbrains.dokka")
}

repositories {
    mavenLocal()
    maven("https://maven.pkg.jetbrains.space/kotlin/p/dokka/test")
    maven("https://maven.pkg.jetbrains.space/kotlin/p/dokka/dev")
    maven("https://oss.sonatype.org/content/repositories/snapshots")
    mavenCentral()
}

val dokkaVersion: String by project

dependencies {
    implementation(kotlin("stdlib"))
    testImplementation(kotlin("test-junit"))

    // Here's how you can apply Dokka plugins
    // dokkaPlugin("org.jetbrains.dokka:versioning-plugin:$dokkaVersion")
    // dokkaPlugin("org.jetbrains.dokka:kotlin-as-java-plugin:$dokkaVersion")
    // dokkaPlugin("org.jetbrains.dokka:mathjax-plugin:$dokkaVersion")
}

tasks.withType<DokkaTask>().configureEach {
    dokkaSourceSets.configureEach {

//        moduleName.set("Debug project")

//        documentedVisibilities.set(
//            setOf(
//                Visibility.PUBLIC,
//                Visibility.PACKAGE,
//            )
//        )
//
//        perPackageOption {
//            matchingRegex.set("com.example.*")
//            suppress.set(true)
//        }
//
//        sourceLink {
//            localDirectory.set(file("src/main/kotlin"))
//            remoteUrl.set(
//                URL(
//                    "https://github.com/IgnatBeresnev/dokka-debug-kts/tree/master/src/main/kotlin"
//                )
//            )
//            remoteLineSuffix.set("#L")
//        }
    }
}
