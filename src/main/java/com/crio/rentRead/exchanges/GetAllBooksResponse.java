package com.crio.rentRead.exchanges;


import java.util.List;

import com.crio.rentRead.dto.Book;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public class GetAllBooksResponse {

    private List<Book> books;



    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }
}
