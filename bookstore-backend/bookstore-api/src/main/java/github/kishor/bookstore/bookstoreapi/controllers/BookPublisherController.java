package github.kishor.bookstore.bookstoreapi.controllers;

import github.kishor.bookstore.bookstoredomain.model.BookPublisher;
import github.kishor.bookstore.bookstoreservice.publisher.PublisherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookPublisherController {

    @Autowired
    PublisherService publisherService;

    @GetMapping(value = "/publishers", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity welcomePublishers(){
        return new ResponseEntity("Welcome to Publishers Service", HttpStatus.OK);
    }

    @GetMapping(value = "/publisher", produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity fetchAllPublishers(){
        List<BookPublisher> allPublishers = publisherService.listAllPublishers();

        return new ResponseEntity(allPublishers, HttpStatus.OK);
    }

    @PostMapping(value = "/publisher", consumes = {MediaType.APPLICATION_JSON_VALUE}, produces = {MediaType.APPLICATION_JSON_VALUE})
    public ResponseEntity createNewPublisher(@RequestBody BookPublisher publisher){
        BookPublisher createdPublisher = publisherService.createNewPublisher(publisher);

        return new ResponseEntity(createdPublisher, HttpStatus.CREATED);
    }
}
