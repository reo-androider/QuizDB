import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
    kotlin("jvm") version "1.5.10"
    application
}

group = "me.reoru"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

val exposedVersion: String by project
val psql: String by project
val h2: String by project
val slf4f: String by project
val kotlinVersion: String by project
val logBack: String by project
dependencies {
    testImplementation("org.jetbrains.kotlin:kotlin-test:1.5.31")
    implementation("org.jetbrains.exposed:exposed-core:$exposedVersion")
    implementation("org.jetbrains.exposed:exposed-dao:$exposedVersion")
    implementation("org.jetbrains.exposed:exposed-jdbc:$exposedVersion")
    implementation("org.postgresql:postgresql:$psql")
    implementation("com.h2database:h2:$h2")
    implementation("org.slf4j:slf4j-simple:$slf4f")
    implementation("io.ktor:ktor-server-netty:$kotlinVersion")
    implementation("io.ktor:ktor-server-core:$kotlinVersion")
    implementation("io.ktor:ktor-client-core:$kotlinVersion")
    implementation("io.ktor:ktor-client-core-jvm:$kotlinVersion")
    implementation("io.ktor:ktor-client-apache:$kotlinVersion")
    testImplementation("io.ktor:ktor-server-tests:$kotlinVersion")
}

tasks.test {
    useJUnit()
}

tasks.withType<KotlinCompile>() {
    kotlinOptions.jvmTarget = "1.8"
}

application {
    mainClass.set("MainKt")
}