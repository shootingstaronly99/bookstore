package com.bookstoreuz.bookstore.entity;

import javax.persistence.*;
import java.io.Serializable;
@Entity
@Table(name = "staff_type")
public class StaffType implements Serializable {
@Id
@GeneratedValue(strategy = GenerationType.SEQUENCE)
   private Long id;
@Column
private String types;
public StaffType(){}

   public Long getId() {
      return id;
   }

   public void setId(Long id) {
      this.id = id;
   }

   public String getTypes() {
      return types;
   }

   public void setTypes(String types) {
      this.types = types;
   }
}
