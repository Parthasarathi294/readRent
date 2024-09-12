package com.crio.rentRead.exchanges;


import java.util.Set;

import com.crio.rentRead.dto.Book;

import lombok.AllArgsConstructor;
import lombok.Data;


@Data
@AllArgsConstructor
public class RentBookResponse {

    private int id;

    private String firstName;

    private String lastName;

    private String role;

    private Set<Book> rentedBooks;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public Set<Book> getRentedBooks() {
        return rentedBooks;
    }

    public void setRentedBooks(Set<Book> rentedBooks) {
        this.rentedBooks = rentedBooks;
    }
}
