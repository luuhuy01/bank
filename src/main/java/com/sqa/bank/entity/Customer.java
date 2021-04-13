package com.sqa.bank.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "Customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "name")
    private String name;
    @Column(name = "birthday")
    private Date birthday;
    @Column(name= "phone")
    private String phone;
    @Column(name = "email")
    private String email;
    @Column(name = "permanent_address")
    private String permanentAddress;
    @Column(name = "home_town")
    private String homeTown;
    @OneToMany(mappedBy = "customer", fetch = FetchType.LAZY)
    private List<Account> accountList;

    public Customer() {
    }

    public Customer(int id, String name, Date birthday, String phone, String email, String permanentAddress, String homeTown) {
        this.id = id;
        this.name = name;
        this.birthday = birthday;
        this.phone = phone;
        this.email = email;
        this.permanentAddress = permanentAddress;
        this.homeTown = homeTown;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPermanentAddress() {
        return permanentAddress;
    }

    public void setPermanentAddress(String permanentAddress) {
        this.permanentAddress = permanentAddress;
    }

    public String getHomeTown() {
        return homeTown;
    }

    public void setHomeTown(String homeTown) {
        this.homeTown = homeTown;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", birthday=" + birthday +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                ", permanentAddress='" + permanentAddress + '\'' +
                ", homeTown='" + homeTown + '\'' +
                ", accountList=" + accountList +
                '}';
    }
}
