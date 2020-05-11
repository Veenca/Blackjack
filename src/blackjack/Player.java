/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.io.Serializable;

/**
 *
 * @author Famiglia Luisi
 */
public class Player implements Serializable{
    int coin,card1,card2;

    public void setCards(int[] cards) {
        this.cards = cards;
    }
   
    int cards[];
    String user;
     public Player(int coin, String user) {
        this.coin = coin;
        this.user = user;
    }
    public int getCoin() {
        return coin;
    }

    public int getCard1() {
        return card1;
    }

    public int getCard2() {
        return card2;
    }

    public String getUser() {
        return user;
    }

    public boolean isRegistered() {
        return registered;
    }
    
   boolean registered;

   

    
 

   

    public void setCoin(int coin) {
        this.coin = coin;
    }

    public void setCard1(int card1) {
        this.card1 = card1;
    }

    public void setCard2(int card2) {
        this.card2 = card2;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setRegistered(boolean registered) {
        this.registered = registered;
    }
    


 
}
