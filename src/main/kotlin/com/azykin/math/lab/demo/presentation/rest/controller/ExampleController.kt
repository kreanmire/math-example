package com.azykin.math.lab.demo.presentation.rest.controller

import lombok.RequiredArgsConstructor
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping(value = ["examples"])
@RequiredArgsConstructor
class ExampleController {

    @GetMapping
    fun getExample() : String {

        return "Test"
    }

}