package com.library.dao;

import com.library.model.Book;
import com.library.dao.exceptions.BookNotFoundException;
import com.library.dao.exceptions.DuplicateBookException;
import java.util.List;

public interface BookDao {
    void addBook(Book book) throws DuplicateBookException;
    Book getBookById(int id);
    List<Book> getAllBooks();
    void updateBook(Book book) throws BookNotFoundException;
    void deleteBook(int id) throws BookNotFoundException;
    List<Book> searchByTitle(String title);
}