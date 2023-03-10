package web.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import web.model.Authors;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Repository
public class AuthorDaoImpl implements AuthorDao{
    @Autowired
    private EntityManager entityManager;

    @Override
    public List<Authors> allAuthors() {

        return entityManager.createQuery("from Authors ").getResultList();
    }
}
