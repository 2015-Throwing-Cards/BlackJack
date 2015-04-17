/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.awt.Graphics;
import java.awt.Point;
import java.util.ArrayList;

/**
 *
 * @author diegocantu
 */
public class Hand {
    
    {
        cards = new ArrayList<>();
    }

    public Hand(Point position){
        this.position = position;
    }
    
    public void paint(Graphics graphics){
        for(int i = 0; i < cards.size(); i++){
            graphics.drawImage(cards.get(i).getFace(), position.x + (i * cards.get(i).getWidth()), position.y, null);
        }
    }
    
    
    
//<editor-fold defaultstate="collapsed" desc="Properties">
    //add card, remove card, count all cards, empty hand
    private ArrayList<Card> cards;
    private final Point position;
    
    /**
     * @return the cards
     */
    public ArrayList<Card> getCards() {
        return cards;
    }
    
    /**
     * @param cards the cards to set
     */
    public void setCards(ArrayList<Card> cards) {
        this.cards = cards;
    }
    
    /**
     * @param card the card to add
     */
    public void addCards(Card card) {
        this.cards.add(card);
    }
    
    /**
     * @param card the card to add
     */
    public void removeCards(Card card) {
        this.cards.remove(card);
    }
    
    public void clear(){
        cards.clear();
    }
    
    
    public int getTotalValue() {
        int total = 0;
        
        for (Card card : cards) {
            total += card.getValue();
        }
        
        return total;
    }
//</editor-fold>
}
