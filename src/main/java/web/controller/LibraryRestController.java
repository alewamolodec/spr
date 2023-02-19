package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import web.model.Authors;
import web.service.AuthorService;

import java.util.List;

@RestController
@RequestMapping(value = "/authors/rest")
public class LibraryRestController {

    @Autowired
    private AuthorService authorService;

    @GetMapping()
    public List<Authors> getAll(){
        return authorService.allAuthors();
    }

}
