package com.library.controller;

import com.library.model.Book;
import com.library.service.BookService;
import com.library.dao.exceptions.DuplicateBookException;
import jakarta.validation.Valid;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
@RequestMapping("/books")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public String listBooks(Model model) {
        model.addAttribute("books", bookService.getAllBooks());
        return "books/list";
    }

    @GetMapping("/add")
    public String showAddForm(Model model) {
        model.addAttribute("book", new Book());
        return "books/add";
    }

    @PostMapping("/add")
    public String addBook(
        @Valid @ModelAttribute("book") Book book,
        BindingResult bindingResult,
        RedirectAttributes ra
    ) {
        // Form validation
        if (bindingResult.hasErrors()) {
            return "books/add";
        }

        // Business validation
        try {
            bookService.addBook(book);
            ra.addFlashAttribute("success", "Book added!");
        } catch (DuplicateBookException e) {
            bindingResult.rejectValue("id", "duplicate.id", e.getMessage());
            return "books/add";
        }
        
        return "redirect:/books";
    }
}