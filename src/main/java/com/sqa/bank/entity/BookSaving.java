package com.sqa.bank.entity;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
@Table(name = "booksaving")
public class BookSaving {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "type")
    private String type;
    @Column(name = "date_send")
    private Date dateSend;
    @Column(name = "amount_send")
    private float amountSend;
    @Column(name = "number_month")
    private int numberMonth;
    @Column(name = "date_with_draw")
    private Date dateWithDraw;

    @OneToMany(mappedBy = "bookSaving" , fetch = FetchType.LAZY)
    private List<Account> accountList;

    @OneToOne
    @JoinColumn(name = "interest_id")
    private Interest interest;

    public BookSaving() {
    }

    public BookSaving(int id, String type, Date dateSend, float amountSend, int numberMonth, Date dateWithDraw, Interest interest) {
        this.id = id;
        this.type = type;
        this.dateSend = dateSend;
        this.amountSend = amountSend;
        this.numberMonth = numberMonth;
        this.dateWithDraw = dateWithDraw;
        this.interest = interest;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Date getDateSend() {
        return dateSend;
    }

    public void setDateSend(Date dateSend) {
        this.dateSend = dateSend;
    }

    public float getAmountSend() {
        return amountSend;
    }

    public void setAmountSend(float amountSend) {
        this.amountSend = amountSend;
    }

    public int getNumberMonth() {
        return numberMonth;
    }

    public void setNumberMonth(int numberMonth) {
        this.numberMonth = numberMonth;
    }

    public Date getDateWithDraw() {
        return dateWithDraw;
    }

    public void setDateWithDraw(Date dateWithDraw) {
        this.dateWithDraw = dateWithDraw;
    }

    public Interest getInterest() {
        return interest;
    }

    public void setInterest(Interest interest) {
        this.interest = interest;
    }
}
