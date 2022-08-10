/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication4;

/**
 *
 * @author rudra
 */

import java.util.ArrayList;
import java.util.Arrays;

public class User extends Player {
  
    private int cash;
    private int bet;
    private String name;
    
    public User() {
        this.bet = 0;
        this.cash = 0;
    }
    
    public int getCash() {
        return cash;
    }
    
    public int getBet() {
        return bet;
    }
    
    public String getName() {
        return name;
    }
    
    public void setCash(int money) {
        cash = money - bet;
    }
    
    public void setBet(int money) {
        bet = money;
    }
    
    public void setName(String username) {
        name = username;
    }
        
    public void win() {
        cash = cash + 2 * bet;
    }
    
    public void push() {
        cash = cash + bet;
    }
    
    public void blackJack() {
        cash = cash + 3 * bet;
    }
    
}

