package com.rest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/simpleinterest")
public class SimpleInterestController {

    @GetMapping
    public ResponseEntity<Double> calculateSimpleInterest(@RequestParam double principal,@RequestParam double rate,@RequestParam int time) {
        double simpleInterest = (principal * rate * time) / 100;
        return ResponseEntity.ok(simpleInterest);
    }
}
