package com.fatesolo.jsh.resource;

import com.fatesolo.jsh.entity.Book;
import com.fatesolo.jsh.entity.Result;
import com.fatesolo.jsh.service.BookService;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;
import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.List;

@Controller
@Path("/book")
@Consumes({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
@Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON})
public class BookResource {

    @Resource
    private BookService service;

    @GET
    @Path("/{id}")
    public Book getBookById(@PathParam("id") int id) {
        return service.getBookById(id);
    }

    @GET
    @Path("/")
    public List<Book> getBooks() {
        return service.getBooks();
    }

    @POST
    @Path("/")
    public Result addBook(Book book) {
        return service.addBook(book) ? Result.success() : Result.failure();
    }

}
