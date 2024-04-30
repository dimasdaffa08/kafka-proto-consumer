plugins {
    java
    id("org.springframework.boot") version "3.2.5"
    id("io.spring.dependency-management") version "1.1.4"
    id("com.google.protobuf") version "0.9.3"
}

group = "com.dev.dmd"
version = "0.0.1-SNAPSHOT"

java {
    sourceCompatibility = JavaVersion.VERSION_17
}

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

repositories {
    mavenCentral()
    maven {
        url = uri("https://packages.confluent.io/maven/")
    }
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter-web")
    implementation("org.springframework.kafka:spring-kafka:3.1.2")
    implementation("org.apache.kafka:kafka-streams:3.4.1")
    implementation("com.google.protobuf:protobuf-java:3.23.2")
    implementation("com.googlecode.protobuf-java-format:protobuf-java-format:1.4")
    implementation("jakarta.validation:jakarta.validation-api:3.0.2")
    implementation("io.confluent:kafka-protobuf-serializer:7.6.0")

    compileOnly("io.soabase.record-builder:record-builder-core:34")

    annotationProcessor("org.projectlombok:lombok")
    annotationProcessor("io.soabase.record-builder:record-builder-processor:34")

    testImplementation("org.springframework.boot:spring-boot-starter-test")
}

tasks.withType<Test> {
    useJUnitPlatform()
}

protobuf {
    protoc {
        artifact = "com.google.protobuf:protoc:3.23.2"
    }
}
