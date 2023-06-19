package com.example.nbp_api;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NbpRestController {
    private final NbpService nbpService;

    public NbpRestController(NbpService nbpService) {
        this.nbpService = nbpService;
    }

    @GetMapping("/{currency}")
    ResponseEntity<String> averageExchangeRate(@PathVariable String currency, @RequestParam(required = false) int days){
        
    }
}
