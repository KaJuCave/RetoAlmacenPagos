package com.julianacano.springretoback;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Helloword {
    @GetMapping(value= "/")
    public String getMethodName() {
        return "Hola Mundo Accenture";
    }


}
