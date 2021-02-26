package github.kishor.bookstore.bookstoreapi.controllers;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController(value = "/api")
public class WelcomeController {

    @GetMapping(value = "")
    public ResponseEntity<String> welcomeMessage(){
        return new ResponseEntity<>("Welcome to BookStore API", HttpStatus.OK);
    }
}
