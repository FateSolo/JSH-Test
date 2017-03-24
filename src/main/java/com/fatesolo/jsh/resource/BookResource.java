package com.fatesolo.jsh.resource;

import com.fatesolo.jsh.entity.Book;
import com.fatesolo.jsh.entity.Result;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/book")
@Consumes(MediaType.APPLICATION_XML)
@Produces(MediaType.APPLICATION_XML)
public class BookResource {

    @GET
    @Path("/{id}")
    public Book getBookById(@PathParam("id") int id) {
        Book book = new Book();
        book.setId(id);
        book.setName("Book " + id);
        book.setAuthor("Author " + id);
        return book;
    }

    @GET
    @Path("/")
    public List<Book> getBooks() {
        List<Book> books = new ArrayList<>();
        books.add(getBookById(1));
        books.add(getBookById(2));
        books.add(getBookById(3));

        return books;
    }

    @POST
    @Path("/")
    public Result addBook(Book book) {
        return Result.success(book.getName());
    }

}
