package com.example.aircontroller

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController


@RestController
class AirControllerImpl {

    @Autowired
    var theServiceProxy : ServiceProxyInterface? = null

    @GetMapping("/")
    fun index(@RequestParam("name") name: String): String {
        return theServiceProxy!!.sayHello(name)
    }

    @GetMapping("/temp")
    fun index2(@RequestParam("temp") temp: String? = "0"): String {

        var temp1 = theServiceProxy!!.giveTemparture(temp+"")
        return temp1
    }


}