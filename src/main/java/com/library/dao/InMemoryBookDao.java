package com.library.dao;

import com.library.model.Book;
import com.library.dao.exceptions.BookNotFoundException;
import com.library.dao.exceptions.DuplicateBookException;
import org.springframework.stereotype.Repository;
import java.util.*;

@Repository 
public class InMemoryBookDao implements BookDao {
    private final Map<Integer, Book> books = new HashMap<>();

    @Override
    public void addBook(Book book) throws DuplicateBookException {
        if (books.containsKey(book.getId())) {
            throw new DuplicateBookException("Book ID " + book.getId() + " exists");
        }
        books.put(book.getId(), book);
    }

    @Override
    public List<Book> getAllBooks() {
        return new ArrayList<>(books.values());
    }

    @Override
    public void updateBook(Book book) throws BookNotFoundException {
        if (!books.containsKey(book.getId())) {
            throw new BookNotFoundException("Book ID " + book.getId() + " not found");
        }
        books.put(book.getId(), book);
    }

    @Override
    public void deleteBook(int id) throws BookNotFoundException {
        if (!books.containsKey(id)) {
            throw new BookNotFoundException("Book ID " + id + " not found");
        }
        books.remove(id);
    }

    @Override
    public List<Book> searchByTitle(String title) {
        return books.values().stream()
            .filter(book -> book.getTitle().equalsIgnoreCase(title))
            .toList();
    }

    @Override
    public Book getBookById(int id) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getBookById'");
    }
}