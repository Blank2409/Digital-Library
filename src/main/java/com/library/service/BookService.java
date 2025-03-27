package com.library.service;

import com.library.dao.BookDao;
import com.library.dao.exceptions.BookNotFoundException;
import com.library.dao.exceptions.DuplicateBookException;
import com.library.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class BookService {
    private final BookDao bookDao;

    @Autowired
    public BookService(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    public void addBook(Book book) throws DuplicateBookException {
        bookDao.addBook(book);
    }

    public Book getBookById(int id) {
        return bookDao.getBookById(id);
    }

    public List<Book> getAllBooks() {
        return bookDao.getAllBooks();
    }

    public void updateBook(Book book) throws BookNotFoundException {
        bookDao.updateBook(book);
    }

    public void deleteBook(int id) throws BookNotFoundException {
        bookDao.deleteBook(id);
    }

    public List<Book> searchByTitle(String title) {
        return bookDao.searchByTitle(title);
    }
}