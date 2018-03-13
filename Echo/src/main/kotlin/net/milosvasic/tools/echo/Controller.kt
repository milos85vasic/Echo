package net.milosvasic.tools.echo

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/echo")
class Controller {
    @GetMapping(value = "/{message}", produces = [(MediaType.APPLICATION_JSON_VALUE)])
    fun get(@PathVariable(name = "message") message: String) = Message(message)

    @PostMapping(value = "/{message}", produces = [(MediaType.APPLICATION_JSON_VALUE)])
    fun post(@PathVariable(name = "message") message: String) = Message(message)
}