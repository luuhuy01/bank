package com.sqa.bank.entity;


import javax.persistence.*;
import java.util.Date;
import com.sqa.bank.entity.*;

@Entity
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "username")
    private String username;
    @Column(name = "password")
    private String password;
    @Column(name = "date_create")
    private Date dateCreate;
    @Column(name = "number_account")
    private int numberAccount;

    @ManyToOne
    @JoinColumn(name = "customer_id")
    private Customer customer;
    @ManyToOne
    @JoinColumn(name = "book_saving_id")
    private BookSaving bookSaving;

    public Account() {
    }

    public Account(int id, String username, String password, Date dateCreate, int numberAccount, Customer customer, BookSaving bookSaving) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.dateCreate = dateCreate;
        this.numberAccount = numberAccount;
        this.customer = customer;
        this.bookSaving = bookSaving;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getDateCreate() {
        return dateCreate;
    }

    public void setDateCreate(Date dateCreate) {
        this.dateCreate = dateCreate;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public void setNumberAccount(int numberAccount) {
        this.numberAccount = numberAccount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public BookSaving getBookSaving() {
        return bookSaving;
    }

    public void setBookSaving(BookSaving bookSaving) {
        this.bookSaving = bookSaving;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", dateCreate=" + dateCreate +
                ", numberAccount=" + numberAccount +
                ", customer=" + customer +
                ", bookSaving=" + bookSaving +
                '}';
    }
}
