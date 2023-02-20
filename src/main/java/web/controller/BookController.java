package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import web.service.BookService;

@Controller
@RequestMapping(value = "/books")
public class BookController {
    @Autowired
    private BookService bookService;

    /**
     * Model - прочитай об этом классе, если вкратце он нужен для передачи объектов и их значений в jsp/html страницы.
     * Синтаксис почти всегда такой
     */
    @GetMapping()
    public String getAll(Model model){
        model.addAttribute("booksList", bookService.allBooks());
        return "books";
    }
}
