package web.dao;

import org.springframework.stereotype.Repository;
import web.model.Authors;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class AuthorDaoImpl implements AuthorDao{
    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Authors> allAuthors() {

        return entityManager.createQuery("from Authors ").getResultList();
    }
}
