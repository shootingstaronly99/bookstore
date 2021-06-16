package com.bookstoreuz.bookstore.entity;

import javax.persistence.*;

@Entity
@Table(name="field")
public class Field {
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
@Column
    private String name;

    public Field() {
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
}
