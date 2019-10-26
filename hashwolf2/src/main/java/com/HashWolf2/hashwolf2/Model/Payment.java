package com.HashWolf2.hashwolf2.Model;


import org.springframework.data.annotation.Id;

import javax.persistence.*;

@javax.persistence.Entity
@Access(value=AccessType.FIELD)
public class Payment {

    @javax.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "paymentID")
    private int paymentID;

    @Column(name = "paymentName")
    private String paymentName;

    @Column(name = "paymentDes")
    private String paymentDes;

    @ManyToOne
    private Group paymentGroup;

    public Payment(int paymentID, String paymentName, Group group) {
        this.paymentID = paymentID;
        this.paymentName = paymentName;
        this.paymentGroup = group;
    }



    public int getPaymentID() {
        return paymentID;
    }

    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }

    public String getPaymentName() {
        return paymentName;
    }

    public void setPaymentName(String paymentName) {
        this.paymentName = paymentName;
    }

    public String getPaymentDes() {
        return paymentDes;
    }

    public void setPaymentDes(String paymentDes) {
        this.paymentDes = paymentDes;
    }

    public Group getGroupID() {
        return paymentGroup;
    }

    public void setGroupID(Group group) {
        this.paymentGroup = group;
    }


}
