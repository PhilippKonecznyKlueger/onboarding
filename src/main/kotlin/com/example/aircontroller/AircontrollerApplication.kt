package com.example.aircontroller
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.ComponentScan
import org.springframework.web.servlet.config.annotation.EnableWebMvc

@ComponentScan(basePackages = ["com.example.aircontroller"])
@SpringBootApplication

@EnableWebMvc
class AircontrollerApplication

fun main(args: Array<String>) {
	runApplication<AircontrollerApplication>(*args)

}
