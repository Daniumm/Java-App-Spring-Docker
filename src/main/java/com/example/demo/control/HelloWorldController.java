package com.example.demo.control;

import com.example.demo.model.Persona;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
@RequestMapping("/v1/hello-world")

public class


HelloWorldController {
    @GetMapping("/say-hello")
    public ResponseEntity<Map<String,String>> sayHello(){
        Map<String,String> response= new HashMap<>();
        response.put("message","Hello World :P");
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @GetMapping("/persona")
    public ResponseEntity<Persona> sayPersona(){
        Persona p1 = new Persona();
        p1.setName("Daniel");
        p1.setAge(21);
        Persona response = p1;
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    @PostMapping("/save")
    public ResponseEntity<Persona> savePersona(@RequestBody Persona p){
        p.getName();
        p.getAge();
        return new ResponseEntity<>(p, HttpStatus.OK);
    }
}
