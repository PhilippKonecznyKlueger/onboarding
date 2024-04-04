package com.example.aircontroller

import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*
import org.springframework.context.annotation.Profile

@Profile("default")
class ServiceProxyTest {

    @Test
    fun giveTemparture() {
        assertEquals("The temperature is 12!", ServiceProxy().giveTemparture("12"))
    }

    @Test
    fun sayHello() {
        assertEquals("Hello, karl!", ServiceProxy().sayHello("karl"))
    }
}