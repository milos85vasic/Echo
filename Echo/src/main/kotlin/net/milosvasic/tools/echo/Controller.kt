package net.milosvasic.tools.echo

import org.springframework.http.MediaType
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping("/echo")
class Controller {
    @GetMapping(value = "/{message}", produces = [(MediaType.APPLICATION_JSON_VALUE)])
    fun getEcho(@PathVariable(name = "message") message: String) = Message(message)

    @PostMapping(value = "/{message}", produces = [(MediaType.APPLICATION_JSON_VALUE)])
    @PutMapping(value = "/{message}", produces = [(MediaType.APPLICATION_JSON_VALUE)])
    @DeleteMapping(value = "/{message}", produces = [(MediaType.APPLICATION_JSON_VALUE)])
    fun echo(@PathVariable(name = "message") message: String) = Message(message)
}