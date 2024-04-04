package com.example.aircontroller

import org.apache.http.client.methods.HttpGet
import org.apache.http.impl.client.BasicResponseHandler
import org.apache.http.impl.client.HttpClients
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.springframework.context.annotation.Profile

class AirControllerImplIntegrationTest {

    @Profile("mocked")
    @Test
    fun testTempIntegrated() {
        val httpclient = HttpClients.createDefault()
        val httpGet = HttpGet("http://localhost:8080/temp?temp=27")
        val response1 = httpclient.execute(httpGet)
        val responseString = BasicResponseHandler().handleResponse(response1)
        println(responseString)
        assertEquals("do what you want with 27!",responseString)
    }
}