package jp.ahaoretama.springbootprometheusgrafanasample.controller;

import io.prometheus.client.spring.web.PrometheusTimeMethod;
import io.vavr.collection.Map;

import java.net.URI;

import javax.servlet.http.HttpServletResponse;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
 
import javax.print.DocFlavor;
import java.net.URI;
import java.util.Map;

@RestController
public class HelloController {

    @GetMapping("/")
    @PrometheusTimeMethod(name = "hello_controller_say_hello_duration_seconds", help = "Some helpful information ")
    public String sayHello() {
        return "hello from Barunavo";
    }

    @RequestMapping("/grafana")
    public String redirect(@RequestParam String redirectUrl, HttpServletResponse response) 
{
    return "redirect:" + redirectUrl;

    @PostMapping(value = "/redirect")
    public ResponseEntity<Void> redirect2(@RequestParam Map<String,String> input)
    {
 
        System.out.println(input);
 
        return ResponseEntity.status(HttpStatus.FOUND).location(URI.create("https://fullstackdeveloper.guru")).build();
    }
}

}
