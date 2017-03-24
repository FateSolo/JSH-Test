package com.fatesolo.jsh.service;

import com.fatesolo.jsh.repository.BookRepository;
import com.fatesolo.jsh.entity.Book;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Service
@Transactional(rollbackFor = Exception.class)
public class BookService {

    @Resource
    private BookRepository repository;

    public Book getBookById(int id) {
        return repository.findById(id);
    }

    public List<Book> getBooks() {
        return repository.findAll();
    }

    public boolean addBook(Book book) {
        repository.save(book);

        return book.getId() != 0;
    }

}
