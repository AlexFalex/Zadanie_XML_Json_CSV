plugins {
    id("java")
}

group = "ru.netology"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.10.0"))
    testImplementation("org.junit.jupiter:junit-jupiter")
    implementation("com.opencsv", "opencsv", "5.1")
    implementation("com.googlecode.json-simple", "json-simple", "1.1.1")
    implementation("com.google.code.gson", "gson", "2.8.2")
}

tasks.test {
    useJUnitPlatform()
}