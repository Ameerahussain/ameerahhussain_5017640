package com.library.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;


@Repository
public class BookRepository {

    public List<String> getBooks() {
        return Arrays.asList("Book 1", "Book 2", "Book 3");
    }
}
