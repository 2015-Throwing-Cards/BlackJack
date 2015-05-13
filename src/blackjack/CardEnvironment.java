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
 
    private Score score;
    private Chips myChips;
    
    @Override
    public void initializeEnvironment() {
        score = new Score();
        score.setPosition(new Point(100, 100));
        
        myChips = new Chips();

        deck = new Deck();
        

        playerHand = new Hand(new Point(400, 400));
        dealerHand = new Hand(new Point(400, 100));

        setBackground(ResourceTools.loadImageFromResource("resources/BlackJackTable.jpg"));

    }

    @Override
    public void timerTaskHandler() {

    }

    @Override
    public void keyPressedHandler(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_N) {
            dealerHand.clear();
            playerHand.clear();

            playerHand.addCards(deck.next(true));
            dealerHand.addCards(deck.next(true));
            playerHand.addCards(deck.next(true));
        } else if (e.getKeyCode() == KeyEvent.VK_H) {
            playerHand.addCards(deck.next(true));
        } else if (e.getKeyCode() == KeyEvent.VK_D) {
            dealerHand.addCards(deck.next(true));
        } else if (e.getKeyCode() == KeyEvent.VK_S) {
            dealerHand.clear();
            playerHand.clear();

            deck.loadDeck();
            deck.shuffle();
            AudioPlayer.play("/resources/cardshuffle.wav");
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
        if (dealerHand != null) {
            dealerHand.paint(graphics);
        }

        if (playerHand != null) {
            playerHand.paint(graphics);
        }
        

        if (score != null) {
             score.draw(graphics);
        }
        
        if (myChips != null) {
            myChips.draw(graphics);
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
