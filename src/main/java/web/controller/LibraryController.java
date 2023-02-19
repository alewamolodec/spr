package web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import web.model.Authors;
import web.service.AuthorService;
import web.service.AuthorServiceImpl;

import java.util.List;

@RestController
public class LibraryController {
    private AuthorService authorService = new AuthorServiceImpl();

    @RequestMapping(value = {"/authors"})
    public List<Authors> getAll(){
        return authorService.allAuthors();
    }


}
