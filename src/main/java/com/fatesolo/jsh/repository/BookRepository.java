package com.fatesolo.jsh.repository;

import com.fatesolo.jsh.entity.Book;
import org.springframework.data.repository.RepositoryDefinition;

import java.util.List;

@RepositoryDefinition(domainClass = Book.class, idClass = Integer.class)
public interface BookRepository {

    Book findById(int id);

    List<Book> findAll();

    void save(Book book);

}
