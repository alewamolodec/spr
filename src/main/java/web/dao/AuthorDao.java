package web.dao;

import web.model.Authors;

import java.util.List;

public interface AuthorDao {
    List<Authors> allAuthors();
}
