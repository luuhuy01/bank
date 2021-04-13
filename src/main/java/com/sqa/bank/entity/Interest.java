package com.sqa.bank.entity;

import javax.persistence.*;

@Entity
public class Interest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    @Column(name = "number_month")
    private int numberMonth;
    @Column(name = "ratio")
    private float ratio;

    @OneToOne(mappedBy = "interest", fetch = FetchType.LAZY)
    private BookSaving bookSaving;

    public Interest() {
    }

    public Interest(int id, int numberMonth, float ratio) {
        this.id = id;
        this.numberMonth = numberMonth;
        this.ratio = ratio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getNumberMonth() {
        return numberMonth;
    }

    public void setNumberMonth(int numberMonth) {
        this.numberMonth = numberMonth;
    }

    public float getRatio() {
        return ratio;
    }

    public void setRatio(float ratio) {
        this.ratio = ratio;
    }

}
