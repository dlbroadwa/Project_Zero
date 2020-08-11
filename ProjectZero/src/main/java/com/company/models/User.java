package com.company.models;

import java.math.BigDecimal;

public class User {

    private int user_id;
    private String username;
    private String password;
    private int store_id;
    private BigDecimal user_cash;
    private int card_number;
    private String billing_address;

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
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

    public int getStore_id() {
        return store_id;
    }

    public void setStore_id(int store_id) {
        this.store_id = store_id;
    }

    public BigDecimal getUser_cash() {
        return user_cash;
    }

    public void setUser_cash(BigDecimal user_cash) {
        this.user_cash = user_cash;
    }

    public int getCard_number() {
        return card_number;
    }

    public void setCard_number(int card_number) {
        this.card_number = card_number;
    }

    public String getBilling_address() {
        return billing_address;
    }

    public void setBilling_address(String billing_address) {
        this.billing_address = billing_address;
    }

}
