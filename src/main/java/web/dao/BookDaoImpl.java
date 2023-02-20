package web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import web.model.Book;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class BookDaoImpl implements BookDao {
    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Book> allBooks() {

        return entityManager.createQuery("from Book ").getResultList();
    }
    }

