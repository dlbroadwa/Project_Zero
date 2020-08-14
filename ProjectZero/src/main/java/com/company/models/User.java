package com.company.models;

import java.math.BigDecimal;
import java.util.Objects;

public class User {

    private int user_id;
    private String username= null;
    private String password = "";
    private int store_id = 0;
    private BigDecimal user_cash;
    private String card_number = null;
    private String billing_address= null;

    public User(){

    }

    public User(int store_id,int user_id){
        this.store_id= store_id;
        this.user_id = user_id;
    }

    public User(int store_id, int userId, String username, String password){
        this(store_id, userId);
        this.username= username;
        this.password = password;
    }

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

    public String  getCard_number() {
        return card_number;
    }

    public void setCard_number(String card_number) {
        this.card_number = card_number;
    }

    public String getBilling_address() {
        return billing_address;
    }

    public void setBilling_address(String billing_address) {
        this.billing_address = billing_address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return user_id == user.user_id &&
                store_id == user.store_id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(user_id, username, password, store_id, user_cash, card_number, billing_address);
    }

    @Override
    public String toString() {
        return "User{" +
                "user_id=" + user_id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", store_id=" + store_id +
                ", user_cash=" + user_cash +
                ", card_number=" + card_number +
                ", billing_address='" + billing_address + '\'' +
                '}';
    }
}
