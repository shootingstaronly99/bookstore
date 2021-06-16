package com.bookstoreuz.bookstore.entity;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "payment")
public class Payment implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
@Column
    private int byCash;
@Column
    private int byCard;
public Payment(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getByCash() {
        return byCash;
    }

    public void setByCash(int byCash) {
        this.byCash = byCash;
    }

    public int getByCard() {
        return byCard;
    }

    public void setByCard(int byCard) {
        this.byCard = byCard;
    }
}
