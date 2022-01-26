package com.virtualprogrammers.spring.ServiceV2

import org.apache.catalina.Server
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class ServiceV2Application

fun main(args: Array<String>) {
	runApplication<ServiceV2Application>(*args)
}
