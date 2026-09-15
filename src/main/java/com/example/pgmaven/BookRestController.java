package com.example.pgmaven;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookRestController {

    // GET POST PUT DELETE
    // GET -> Lecture
    // POST -> Creation (Persistance DB)
    // PUT -> UPGRADE (Persistance DB)
    // DELETE -> Suppression (Persistance DB)
    
    @GetMapping("/book")
    public String get(){
        return "Hello World";
    }

    
}
