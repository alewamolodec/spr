package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import web.dao.AuthorDao;
import web.model.Authors;

import java.util.List;

@Service
@EnableTransactionManagement
public class AuthorServiceImpl implements AuthorService{
     private AuthorDao authorDao;
    @Autowired
    public void setAuthorDao(AuthorDao authorDao) {
        this.authorDao = authorDao;
    }
    @Override
    @Transactional
    public List<Authors> allAuthors() {
        return authorDao.allAuthors();
    }
}
