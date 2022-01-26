package com.virtualprogrammers.spring.ServiceV2

import org.springframework.boot.web.servlet.error.ErrorController
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController


@RestController
class ErrorHandlerController : ErrorController {
    @GetMapping("/error")
    fun customError(): String {
        return "The link you followed may be broken, or the page may have been removed."
    }

    val errorPath: String
        get() = "/error"
}