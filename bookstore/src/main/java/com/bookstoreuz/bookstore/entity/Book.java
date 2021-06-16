package com.bookstoreuz.bookstore.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "book")
public class Book implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE)
private Long id;
private String name;
private String author;
private int value;
private String isbn;
private String language;
private LocalDate printYear;
private int price;
@ManyToOne
private BookType bookType;
@ManyToOne
private Field field;


    public Book(Long id, String name, String author,
                int value, String isbn, String language,
                LocalDate printYear, int price, BookType bookType, Field field) {
        this.id = id;
        this.name = name;
        this.author = author;
        this.value = value;
        this.isbn = isbn;
        this.language = language;
        this.printYear = printYear;
        this.price = price;
        this.bookType = bookType;
        this.field = field;
    }

    public Book() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public LocalDate getPrintYear() {
        return printYear;
    }

    public void setPrintYear(LocalDate printYear) {
        this.printYear = printYear;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public BookType getBookType() {
        return bookType;
    }

    public void setBookType(BookType bookType) {
        this.bookType = bookType;
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }
}
