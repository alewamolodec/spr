package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import web.model.Authors;
import web.service.AuthorService;
import web.service.AuthorServiceImpl;

import java.util.List;

@Controller
@RequestMapping(value = "/authors") //Контекст для всего класа лучше выделять тут, а на методах писать только доп урлы aad, get и т.д.
public class LibraryController {
    @Autowired
    private AuthorService authorService;

    /**
     * Model - прочитай об этом классе, если вкратце он нужен для передачи объектов и их значений в jsp/html страницы.
     * Синтаксис почти всегда такой
     */
    @GetMapping()
    public String getAll(Model model){
        model.addAttribute("authorsList", authorService.allAuthors());
        return "authors";
    }

}
