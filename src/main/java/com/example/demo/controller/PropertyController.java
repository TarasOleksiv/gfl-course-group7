package com.example.demo.controller;

import com.example.demo.service.PropertyService;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PropertyController {

    //@Autowired
    private final PropertyService propertyServiceOne;
    private final PropertyService propertyServiceSecond;

    public PropertyController(@Qualifier("FirstService") PropertyService propertyServiceOne,
                              @Qualifier("SecondService") PropertyService propertyServiceSecond) {
        this.propertyServiceOne = propertyServiceOne;
        this.propertyServiceSecond = propertyServiceSecond;
    }

    //http:localhost:8080/api/property
    @GetMapping("api/property")
    public ResponseEntity<String> getResponseFirst() {
        return ResponseEntity.ok(propertyServiceOne.getPropertyValue());
    }

    //http:localhost:8080/api/property2
    @GetMapping("api/property2")
    public ResponseEntity<String> getResponseSecond() {
        return ResponseEntity.ok(propertyServiceSecond.getPropertyValue());
    }
}
