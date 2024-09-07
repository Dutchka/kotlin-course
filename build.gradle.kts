plugins {
    kotlin("jvm") version "2.0.10"
}

group = "com.violetta"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(kotlin("test"))
}

tasks.test {
    useJUnitPlatform()
}