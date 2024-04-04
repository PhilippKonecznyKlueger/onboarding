package com.example.aircontroller

import io.mockk.every
import io.mockk.mockkConstructor
import io.mockk.unmockkAll
import org.apache.http.client.methods.HttpGet
import org.apache.http.impl.client.BasicResponseHandler
import org.apache.http.impl.client.HttpClients
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.TestInstance
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc
import org.springframework.boot.test.context.SpringBootTest
import org.springframework.http.MediaType
import org.springframework.security.test.context.support.WithMockUser
import org.springframework.test.context.ActiveProfiles
import org.springframework.test.web.servlet.MockMvc
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
@AutoConfigureMockMvc
@ActiveProfiles("mocked")
@TestInstance(TestInstance.Lifecycle.PER_CLASS)
class AirControllerImplTest{

    @Autowired
    lateinit var mockMvc: MockMvc

    @WithMockUser("spring")
    @Test
    fun testTemp() {
        val result = mockMvc.perform(
            MockMvcRequestBuilders.get(
                "/temp"
            ).queryParam("temp", "12")
        ).andReturn()

        val pingResult = result.response.contentAsString
        assertEquals("do what you want with 12", pingResult)
    }


}