/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import audio.AudioPlayer;
import environment.Environment;
import images.ResourceTools;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

/**
 *
 * @author diegocantu
 */
class CardEnvironment extends Environment {
        private Deck deck;
//        Image card;
        private Hand playerHand, dealerHand; 
        

    @Override
    public void initializeEnvironment() {
        deck = new Deck();
        
        playerHand = new Hand(new Point(200, 500));
        dealerHand = new Hand(new Point(200, 200));
        
        setBackground(ResourceTools.loadImageFromResource("resources/BlackJackTable.jpg"));
        
//        card = cards.getSubimage(0, 0, 100, 100);
//        deck = new ArrayList<>();
//        deck.add(new Card(Suit.Clubs, 1, cards.getSubimage(0, 0, 178, 260)));
//        deck.add(new Card(Suit.Clubs, 2, cards.getSubimage(179, 0, 178, 260)));
//        deck.add(new Card(Suit.Clubs, 3, cards.getSubimage(358, 0, 178, 260)));
//        deck.add(new Card(Suit.Clubs, 4, cards.getSubimage(537, 0, 178, 260)));
//        deck.add(new Card(Suit.Clubs, 5, cards.getSubimage(716, 0, 178, 260)));
//        deck.add(new Card(Suit.Clubs, 6, cards.getSubimage(895, 0, 178, 260)));
//        deck.add(new Card(Suit.Clubs, 7, cards.getSubimage(1074, 0, 178, 260)));
//        deck.add(new Card(Suit.Clubs, 8, cards.getSubimage(1253, 0, 178, 260)));
//        deck.add(new Card(Suit.Clubs, 9, cards.getSubimage(1432, 0, 178, 260)));
//        deck.add(new Card(Suit.Clubs, 10, cards.getSubimage(1611, 0, 178, 260)));
//        deck.add(new Card(Suit.Clubs, 11, cards.getSubimage(1790, 0, 178, 260)));
//        deck.add(new Card(Suit.Clubs, 12, cards.getSubimage(1969, 0, 178, 260)));
//        deck.add(new Card(Suit.Clubs, 13, cards.getSubimage(2148, 0, 175, 260)));
//        
//        deck.add(new Card(Suit.Diamonds, 1, cards.getSubimage(0, 260, 178, 260)));
//        deck.add(new Card(Suit.Diamonds, 2, cards.getSubimage(179,260, 178, 260)));
//        deck.add(new Card(Suit.Diamonds, 3, cards.getSubimage(358, 260, 178, 260)));
//        deck.add(new Card(Suit.Diamonds, 4, cards.getSubimage(537, 260, 178, 260)));
//        deck.add(new Card(Suit.Diamonds, 5, cards.getSubimage(716, 260, 178, 260)));
//        deck.add(new Card(Suit.Diamonds, 6, cards.getSubimage(895, 260, 178, 260)));
//        deck.add(new Card(Suit.Diamonds, 7, cards.getSubimage(1074, 260, 178, 260)));
//        deck.add(new Card(Suit.Diamonds, 8, cards.getSubimage(1253, 260, 178, 260)));
//        deck.add(new Card(Suit.Diamonds, 9, cards.getSubimage(1432, 260, 178, 260)));
//        deck.add(new Card(Suit.Diamonds, 10, cards.getSubimage(1611, 260, 178, 260)));
//        deck.add(new Card(Suit.Diamonds, 11, cards.getSubimage(1790, 260, 178, 260)));
//        deck.add(new Card(Suit.Diamonds, 12, cards.getSubimage(1969, 260, 178, 260)));
//        deck.add(new Card(Suit.Diamonds, 13, cards.getSubimage(2148, 260, 175, 260)));
//       
//        
//        
//        deck.add(new Card(Suit.Hearts, 1, cards.getSubimage(0, 520, 178, 260)));
//        deck.add(new Card(Suit.Hearts, 2, cards.getSubimage(179,520, 178, 260)));
//        deck.add(new Card(Suit.Hearts, 3, cards.getSubimage(358, 520, 178, 260)));
//        deck.add(new Card(Suit.Hearts, 4, cards.getSubimage(537, 520, 178, 260)));
//        deck.add(new Card(Suit.Hearts, 5, cards.getSubimage(716, 520, 178, 260)));
//        deck.add(new Card(Suit.Hearts, 6, cards.getSubimage(895, 520, 178, 260)));
//        deck.add(new Card(Suit.Hearts, 7, cards.getSubimage(1074, 520, 178, 260)));
//        deck.add(new Card(Suit.Hearts, 8, cards.getSubimage(1253, 520, 178, 260)));
//        deck.add(new Card(Suit.Hearts, 9, cards.getSubimage(1432, 520, 178, 260)));
//        deck.add(new Card(Suit.Hearts, 10, cards.getSubimage(1611, 520, 178, 260)));
//        deck.add(new Card(Suit.Hearts, 11, cards.getSubimage(1790, 520, 178, 260)));
//        deck.add(new Card(Suit.Hearts, 12, cards.getSubimage(1969, 520, 178, 260)));
//        deck.add(new Card(Suit.Hearts, 13, cards.getSubimage(2148, 520, 175, 260)));
//        
//        
//        deck.add(new Card(Suit.Spades, 1, cards.getSubimage(0, 780, 178, 260)));
//        deck.add(new Card(Suit.Spades, 2, cards.getSubimage(179,780, 178, 260)));
//        deck.add(new Card(Suit.Spades, 3, cards.getSubimage(358, 780, 178, 260)));
//        deck.add(new Card(Suit.Spades, 4, cards.getSubimage(537, 780, 178, 260)));
//        deck.add(new Card(Suit.Spades, 5, cards.getSubimage(716, 780, 178, 260)));
//        deck.add(new Card(Suit.Spades, 6, cards.getSubimage(895, 780, 178, 260)));
//        deck.add(new Card(Suit.Spades, 7, cards.getSubimage(1074, 780, 178, 260)));
//        deck.add(new Card(Suit.Spades, 8, cards.getSubimage(1253, 780, 178, 260)));
//        deck.add(new Card(Suit.Spades, 9, cards.getSubimage(1432, 780, 178, 260)));
//        deck.add(new Card(Suit.Spades, 10, cards.getSubimage(1611, 780, 178, 260)));
//        deck.add(new Card(Suit.Spades, 11, cards.getSubimage(1790, 780, 178, 260)));
//        deck.add(new Card(Suit.Spades, 12, cards.getSubimage(1969, 780, 178, 260)));
//        deck.add(new Card(Suit.Spades, 13, cards.getSubimage(2148, 780, 175, 260)));

    }

    @Override
    public void timerTaskHandler() {
    
    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_N){
            dealerHand.clear();
            playerHand.clear();
            
            playerHand.addCards(deck.next(true));
            dealerHand.addCards(deck.next(true));
            playerHand.addCards(deck.next(true));
        } else if (e.getKeyCode() == KeyEvent.VK_H){
            playerHand.addCards(deck.next(true));
        } else if (e.getKeyCode() == KeyEvent.VK_D){
            dealerHand.addCards(deck.next(true));
        } else if (e.getKeyCode() == KeyEvent.VK_S){
            dealerHand.clear();
            playerHand.clear();
            
            deck.loadDeck();
            deck.shuffle();
            AudioPlayer.play("/resources/Shuffle.m4a");
        }
    }

    @Override
    public void keyReleasedHandler(KeyEvent e) {
    
    }

    @Override
    public void environmentMouseClicked(MouseEvent e) {
    
    }

    @Override
    public void paintEnvironment(Graphics graphics) {
        if (dealerHand != null){
            dealerHand.paint(graphics);
        }
        
        if (playerHand != null){
            playerHand.paint(graphics);
        }
        
        
//        if (card != null){
//            graphics.drawImage(card, 100, 20, this);
//        }
//        
//        int x = 0;
//        int y = 0;
//        for (Card card : deck){
//            graphics.drawImage(card.getFace().getScaledInstance(60, 90, y), x, y, this);
//            x += 12;
//            y += 12;
//        }
    }
    
}
