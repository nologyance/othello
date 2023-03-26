import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "3.0.5"
	id("io.spring.dependency-management") version "1.1.0"
	kotlin("jvm") version "1.7.22"
	kotlin("kapt") version "1.7.22"
	kotlin("plugin.spring") version "1.7.22"
	id("org.seasar.doma.codegen") version "1.4.1"
	id("org.domaframework.doma.compile") version "2.0.0"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"
java.sourceCompatibility = JavaVersion.VERSION_17

repositories {
	mavenCentral()
}

dependencies {
	implementation("org.springframework.boot:spring-boot-starter-actuator")
	implementation("org.springframework.boot:spring-boot-starter-security")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	val domaVersion : String by project
	implementation("org.seasar.doma.boot:doma-spring-boot-starter:1.7.0")
	kapt("org.seasar.doma:doma-processor:$domaVersion")
	annotationProcessor("org.seasar.doma:doma-processor:${domaVersion}")
	implementation("org.seasar.doma:doma-core:${domaVersion}")
	implementation("org.seasar.doma:doma-slf4j:${domaVersion}")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	developmentOnly("org.springframework.boot:spring-boot-devtools")
	runtimeOnly("org.postgresql:postgresql")
	testImplementation("org.junit.jupiter:junit-jupiter-api:5.9.2")
	testRuntimeOnly("org.junit.jupiter:junit-jupiter-engine:5.9.2")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("org.springframework.security:spring-security-test")
}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs = listOf("-Xjsr305=strict")
		jvmTarget = "17"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}

tasks {
	jar {
		duplicatesStrategy = DuplicatesStrategy.INCLUDE
	}
}