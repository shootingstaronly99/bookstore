package com.bookstoreuz.bookstore.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "staff")
public class Staff implements Serializable {
@Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;
    @Column(length = 30,unique = true)
    private  String fName;
    @Column(length = 30)
    private String lName;
    private LocalDate dateOfBrith;
   @Column(nullable = false)
    private String pass_code;
    private int phone;
    @ManyToOne
    private StaffType staffType;

    public Staff(Long id, String fName, String lName,
                 LocalDate dateOfBrith, String pass_code,
                 int phone, StaffType staffType) {
        this.id = id;
        this.fName = fName;
        this.lName = lName;
        this.dateOfBrith = dateOfBrith;
        this.pass_code = pass_code;
        this.phone = phone;
        this.staffType = staffType;
    }

    public Staff(){}

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        this.fName = fName;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public LocalDate getDateOfBrith() {
        return dateOfBrith;
    }

    public void setDateOfBrith(LocalDate dateOfBrith) {
        this.dateOfBrith = dateOfBrith;
    }

    public String getPass_code() {
        return pass_code;
    }

    public void setPass_code(String pass_code) {
        this.pass_code = pass_code;
    }

    public int getPhone() {
        return phone;
    }

    public void setPhone(int phone) {
        this.phone = phone;
    }

    public StaffType getStaffType() {
        return staffType;
    }

    public void setStaffType(StaffType staffType) {
        this.staffType = staffType;
    }
}
