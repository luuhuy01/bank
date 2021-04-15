package com.sqa.bank.repository.DTO;

import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

// lớp DTO để truyền dữ liệu, khác với lớp entity thực hiện với cơ sở dữ liệu

@EnableJpaRepositories
public class InfoCustomerSendMoneyDTO{

    private int bookSavingId;
    private int numberAccount;
    private String nameCustomer;
    private Date dateSend;
    private Date dateWithdraw;
    private float amountSend;
    private int numberMonth;
    private float ratio;
    private float interest;

    public InfoCustomerSendMoneyDTO() {
    }

    public InfoCustomerSendMoneyDTO(int bookSavingId, int numberAccount, String nameCustomer, Date dateSend, Date dateWithdraw, float amountSend, int numberMonth, float ratio, float interest) {
        this.bookSavingId = bookSavingId;
        this.numberAccount = numberAccount;
        this.nameCustomer = nameCustomer;
        this.dateSend = dateSend;
        this.dateWithdraw = dateWithdraw;
        this.amountSend = amountSend;
        this.numberMonth = numberMonth;
        this.ratio = ratio;
        this.interest = interest;
    }

    public int getBookSavingId() {
        return bookSavingId;
    }

    public int getNumberAccount() {
        return numberAccount;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public Date getDateSend() {
        return dateSend;
    }

    public Date getDateWithdraw() {
        return dateWithdraw;
    }

    public float getAmountSend() {
        return amountSend;
    }

    public float getRatio() {
        return ratio;
    }

    public float getInterest() {
        return interest;
    }

    public int getNumberMonth() {
        return numberMonth;
    }
}
