package blackjack;


import blackjack.Olde_Deck;
import environment.ApplicationStarter;
import images.ResourceTools;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Jared
 */
public class GameRunner {

//    private void loadDeck() {
//        if (deck == null){
//            deck = new ArrayList<>();
//        }
//    }
    
//    private ArrayList<Card> deck;
    
    
    public static void main(String[] args){
        
        ApplicationStarter.run("Black Jack", new CardEnvironment());

        
        
//        Scanner sc = new Scanner(System.in);
//        Olde_Deck theDeck = new Olde_Deck(1, true);
//        Player me = new Player("Player 1");
//        Player dealer = new Player("Dealer");
//        
//        me.addCard((theDeck.dealNextCard()));
//        dealer.addCard(theDeck.dealNextCard());
//        me.addCard((theDeck.dealNextCard()));
//        dealer.addCard(theDeck.dealNextCard());
//        
//        System.out.println("Cards are dealt\n");
//        me.printHand(true);
//        dealer.printHand(false);
//        System.out.println("\n");
//        
//        boolean meDone = false;
//        boolean dealerDone = false;
//        String ans;
//        
//        while (!meDone || !dealerDone){
//            
//            
//            if (!meDone){
//                System.out.print("Hit or Stay? (Enter H or S): ");
//                ans = sc.next();
//                System.out.println();
//                
//                
//                if (ans.compareToIgnoreCase("H") == 0){
//                    
//                    
//                meDone = !me.addCard(theDeck.dealNextCard());
//                dealer.printHand(true);
//                
//                }else{
//                    meDone = true;
//                    
//                }
//                
//            }
//            
//            if (!dealerDone){
//                if (dealer.getHandSum() < 17){
//                    System.out.println("The dealer hits\n");
//                    dealerDone = !dealer.addCard(theDeck.dealNextCard());
//                    dealer.printHand(false);
//                    
//                }else{
//                    System.out.println("The dealer stays\n");
//                    dealerDone = true;
//                    
//                }
//            }
//        }
        
        
    }
    
}
