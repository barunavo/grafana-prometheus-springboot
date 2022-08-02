package jp.ahaoretama.springbootprometheusgrafanasample.controller;


import java.net.URI;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.prometheus.client.spring.web.PrometheusTimeMethod;
import io.vavr.collection.Map;


@RestController
public class HelloController {

    @GetMapping("/")
    @PrometheusTimeMethod(name = "hello_controller_say_hello_duration_seconds", help = "Some helpful information ")
    public String sayHello() {
        return "hello from Barunavo";
    }

    @GetMapping(value = "/grafana")
    public ResponseEntity<Void> redirect()
    {
        return ResponseEntity.status(HttpStatus.FOUND).location(URI.create("http://localhost:3000")).build();
    }
}
