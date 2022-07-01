package com.persistence;

import java.sql.Date;

public class Accounts {


    private Integer acc_id;
    private Double balance;
    private Integer type_id;
    private Integer user_id;
    private Date opened;
    private Date closed;


    public Accounts(){

    }



    //all args Constructor- we will use this to retrieve from the DB
    public Accounts(Integer acc_id, Double balance, Integer type_id, Integer user_id, Date opened, Date closed) {
        this.acc_id = acc_id;
        this.balance = balance;
        this.type_id = type_id;
        this.user_id = user_id;
        this.opened = opened;
        this.closed = closed;
    }

//used to create account because id is serial on the db
    //we do not need to specify a closed date when we oen an account
    public Accounts(Double balance, Integer type_id, Integer user_id, Date opened) {
        this.balance = balance;
        this.type_id = type_id;
        this.user_id = user_id;
        this.opened = opened;
    }


    //getters and setters


    public Integer getAcc_id() {
        return acc_id;
    }

    public void setAcc_id(Integer acc_id) {
        this.acc_id = acc_id;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Integer getType_id() {
        return type_id;
    }

    public void setType_id(Integer type_id) {
        this.type_id = type_id;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public Date getOpened() {
        return opened;
    }

    public void setOpened(Date opened) {
        this.opened = opened;
    }

    public Date getClosed() {
        return closed;
    }

    public void setClosed(Date closed) {
        this.closed = closed;
    }
}
