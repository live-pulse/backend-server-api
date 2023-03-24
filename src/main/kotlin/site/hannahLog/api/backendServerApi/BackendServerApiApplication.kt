package site.hannahLog.api.backendServerApi

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class BackendServerApiApplication

fun main(args: Array<String>) {
    runApplication<BackendServerApiApplication>(*args)
}

@RestController
class PingController {

    @GetMapping("/ping")
    fun pingPong(): String = "pong!"

}
