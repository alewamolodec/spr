package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import web.dao.BookDao;
import web.model.Book;

import java.beans.Transient;
import java.util.List;

@Service
@EnableTransactionManagement
public class BookServiceImpl implements BookService {
    private BookDao bookDao;
    @Autowired
    public void setAuthorDao(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    @Transactional
    public List<Book> allBooks() {
        return bookDao.allBooks();
    }
}
