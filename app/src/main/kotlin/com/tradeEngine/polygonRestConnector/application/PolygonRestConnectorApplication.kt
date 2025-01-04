package com.tradeEngine.polygonRestConnector.application

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
open class PolygonRestConnectorApplication

fun main(args: Array<String>) {
    runApplication<PolygonRestConnectorApplication>(*args)
}
