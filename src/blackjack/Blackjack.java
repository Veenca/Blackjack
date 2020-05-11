/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;


import java.io.IOException;

/**
 *
 * @author Famiglia Luisi
 */
public class Blackjack {
static Finestra Finestra;

 static Player user;
 static BET BET;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        user=new Player(500,"Giancarlo");
        BET =  new BET();
       BET.setSize(400,200);
       BET.setLocation(100,100);
       BET.setVisible(true);
       
  
       
    }
    
}
