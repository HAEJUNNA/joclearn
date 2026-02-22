plugins {
    java
    id("org.springframework.boot") version "3.5.7"
    id("io.spring.dependency-management") version "1.1.7"
    id("java-test-fixtures") // 플러그인 아이디로 추가 해줘야함
}

group = "jocture"
version = "0.0.1-SNAPSHOT"
description = "joclearn"

java {
    toolchain {
        languageVersion = JavaLanguageVersion.of(25)
    }
}

configurations {
    compileOnly {
        extendsFrom(configurations.annotationProcessor.get())
    }
}

repositories {
    mavenCentral()
}

dependencies {
    implementation("org.springframework.boot:spring-boot-starter")

    testCompileOnly("org.projectlombok:lombok")
    testAnnotationProcessor("org.projectlombok:lombok")
}

subprojects {
    apply(plugin = "java")
    apply(plugin = "org.springframework.boot")
    apply(plugin = "io.spring.dependency-management")
    apply(plugin = "java-test-fixtures") // Domain/tests : testFixtures를 적용하기 위한 플러그인

    repositories {
        mavenCentral()
    }

    dependencies {
        compileOnly("org.projectlombok:lombok")
        annotationProcessor("org.projectlombok:lombok")
        testImplementation("org.springframework.boot:spring-boot-starter-test")
        testFixturesImplementation("org.springframework.boot:spring-boot-starter-test") //testFixtures에서도 해당 디펜던시를 사용하겠다는 의미
        testRuntimeOnly("org.junit.platform:junit-platform-launcher")
    }

    tasks.withType<Test> {
        useJUnitPlatform()
    }
}

// app-boot 모두의 의존성을 가짐 20-01-layered-architecture 파일 참고
project(":modules:app-boot") {
    dependencies {
        implementation(project(":modules:presentation"))
        implementation(project(":modules:application"))
        implementation(project(":modules:domain"))
        implementation(project(":modules:infra"))
    }
}

project(":modules:presentation") {
    dependencies {
        implementation(project(":modules:application"))
    }
}

project(":modules:application") {
    dependencies {
        implementation(project(":modules:domain"))
        testImplementation(project(":modules:app-boot"))
        testImplementation(testFixtures(project(":modules:infra")))
    }
}

project(":modules:domain") {
    dependencies {
        testImplementation(testFixtures(project(":modules:infra")))
    }
}

project(":modules:infra") {
    dependencies {
        implementation(project(":modules:domain"))
        testFixturesImplementation(project(":modules:domain"))
    }
}
