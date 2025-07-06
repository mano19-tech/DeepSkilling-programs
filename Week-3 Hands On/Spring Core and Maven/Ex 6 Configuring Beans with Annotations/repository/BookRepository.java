package com.library.repository;

import org.springframework.stereotype.Repository;

@Repository  // Tells Spring to treat this as a DAO bean
public class BookRepository {
    public String getBookName() {
        return "Harry potter by Kitty Kissa";
    }
}
