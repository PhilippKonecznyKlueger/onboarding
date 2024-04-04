import org.jetbrains.kotlin.gradle.tasks.KotlinCompile

plugins {
	id("org.springframework.boot") version "3.2.4"
	id("io.spring.dependency-management") version "1.1.4"
	kotlin("jvm") version "1.9.23"
	kotlin("plugin.spring") version "1.9.23"
	id("org.openapi.generator") version "7.4.0"
}

group = "com.example"
version = "0.0.1-SNAPSHOT"

java {
	sourceCompatibility = JavaVersion.VERSION_17
}

repositories {
	mavenCentral()
}






dependencies {
	implementation("org.springframework.boot:spring-boot-starter-data-jdbc")
	implementation("org.springframework.boot:spring-boot-starter-web")
	implementation("com.fasterxml.jackson.module:jackson-module-kotlin")
	implementation("org.jetbrains.kotlin:kotlin-reflect")
	runtimeOnly("com.h2database:h2")
	testImplementation("org.springframework.boot:spring-boot-starter-test")
	testImplementation("org.springframework.security:spring-security-test")
	implementation("org.apache.httpcomponents:httpclient:4.+")
	testImplementation("io.mockk:mockk:1.13.+")
	implementation ("org.springframework.boot:spring-boot-starter-web:3.2.4")
	implementation("org.apache.logging.log4j:log4j-core")
	implementation("org.apache.logging.log4j:log4j-api")
	implementation( "org.springframework.plugin:spring-plugin-core:3.0.0")
	implementation("org.springdoc:springdoc-openapi-ui:1.6.6")
	implementation("org.apache.tomcat:tomcat-servlet-api:9.0.37")
	implementation("org.springdoc:springdoc-openapi-starter-webmvc-ui:2.0.2")
	implementation ("org.springdoc:springdoc-openapi-webflux-ui:1.6.14")


}

tasks.withType<KotlinCompile> {
	kotlinOptions {
		freeCompilerArgs += "-Xjsr305=strict"
		jvmTarget = "17"
	}
}

tasks.withType<Test> {
	useJUnitPlatform()
}
