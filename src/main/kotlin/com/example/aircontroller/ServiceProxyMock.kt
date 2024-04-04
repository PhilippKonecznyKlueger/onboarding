package com.example.aircontroller

import org.springframework.context.annotation.Profile
import org.springframework.stereotype.Service

@Service
@Profile("mocked")
class ServiceProxyMock : ServiceProxyInterface {
    override fun giveTemparture(temperature: String): String {
        return "do what you want with $temperature!"
    }

    override fun sayHello(name: String): String {
        return "I don't like to say hello"
    }
}