package com.bookstoreuz.bookstore.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDateTime;
@Entity
@Table(name = "orders")
public class Orders implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(nullable = false)
    private LocalDateTime dateTime;
  @ManyToOne
    private Staff staff;
  @ManyToOne
  private Payment  totalPrice;
@ManyToOne
private Book boook;

    public Orders(Long id, LocalDateTime dateTime,
                  Staff staff, Payment totalPrice, Book boook) {
        this.id = id;
        this.dateTime = dateTime;
        this.staff = staff;
        this.totalPrice = totalPrice;
        this.boook = boook;
    }

    public Orders() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public LocalDateTime getDateTime() {
        return dateTime;
    }

    public void setDateTime(LocalDateTime dateTime) {
        this.dateTime = dateTime;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff staff) {
        this.staff = staff;
    }

    public Payment getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(Payment totalPrice) {
        this.totalPrice = totalPrice;
    }

    public Book getBoook() {
        return boook;
    }

    public void setBoook(Book boook) {
        this.boook = boook;
    }
}
