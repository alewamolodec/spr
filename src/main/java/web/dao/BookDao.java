package web.dao;

import web.model.Book;
import java.util.List;

public interface BookDao {
    List<Book> allBooks();
}
