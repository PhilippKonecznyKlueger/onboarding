package com.example.aircontroller

import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Service

@Service
@Profile("prod")
class ServiceProxy : ServiceProxyInterface {
    override fun giveTemparture(temperature: String): String {
        return "The temperature is $temperature!"
    }

    override fun sayHello(name: String): String {
        return "Hello, $name!"
    }
}