import org.jetbrains.kotlin.gradle.plugin.mpp.KotlinNativeTarget

plugins {
    kotlin("multiplatform") version "2.1.20" // kotlin_version
    kotlin("plugin.serialization") version "2.1.20" // kotlin_version
    id("com.android.library") version "8.9.1"
}

group = "rai.blink"
version = "0.0.1"

val kotlin_version = "2.1.20"
val coroutines_version = "1.9.0"
val serialization_version = "1.7.3"
val ktor_version = "3.0.3"

kotlin {
    explicitApi()

    jvm()
    iosX64()
    iosArm64()
    iosSimulatorArm64()
    js {
        browser()
        nodejs()
    }
    androidTarget()

    sourceSets {
        commonMain {
            dependencies {
                implementation("org.jetbrains.kotlinx:kotlinx-coroutines-core:$coroutines_version")
                implementation("org.jetbrains.kotlinx:kotlinx-serialization-core:$serialization_version")

                api("io.ktor:ktor-client-core:$ktor_version")
                api("io.ktor:ktor-client-serialization:$ktor_version")
                api("io.ktor:ktor-client-content-negotiation:$ktor_version")
                api("io.ktor:ktor-serialization-kotlinx-json:$ktor_version")

                implementation("org.jetbrains.kotlinx:kotlinx-datetime:0.4.1")
            }
        }

        commonTest {
            dependencies {
                implementation(kotlin("test"))
                implementation("io.ktor:ktor-client-mock:$ktor_version")
            }
        }

        jvmMain {
            dependencies {
                implementation(kotlin("stdlib-jdk7"))
                implementation("io.ktor:ktor-client-cio-jvm:$ktor_version")
            }
        }

        jvmTest {
            dependencies {
                implementation(kotlin("test-junit"))
            }
        }

        iosMain {
            dependencies {
                api("io.ktor:ktor-client-ios:$ktor_version")
            }
        }

        jsMain {
            dependencies {
                api("io.ktor:ktor-client-js:$ktor_version")
            }
        }

        androidMain {
            dependencies {
                implementation("io.ktor:ktor-client-okhttp:$ktor_version")
            }
        }

        all {
            languageSettings.apply {
                optIn("kotlin.Experimental")
            }
        }
    }
}

android {
    namespace = "rai.blink"
    compileSdk = 35

    defaultConfig {
        aarMetadata {
            minCompileSdk = 26
        }
    }
}

tasks {
    register("iosTest") {
        val device = project.findProperty("device")?.toString() ?: "iPhone 8"
        dependsOn("linkDebugTestIosX64")
        group = JavaBasePlugin.VERIFICATION_GROUP
        description = "Execute unit tests on ${device} simulator"
        doLast {
            val binary = kotlin.targets.getByName<KotlinNativeTarget>("iosX64").binaries.getTest("DEBUG")
            exec {
                commandLine("xcrun", "simctl", "spawn", device, binary.outputFile)
            }
        }
    }
    register("test1") {
        dependsOn("allTests")
    }
}
