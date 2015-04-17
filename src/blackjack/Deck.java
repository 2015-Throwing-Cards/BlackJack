/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import images.ResourceTools;
import java.awt.image.BufferedImage;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author diegocantu
 */
public class Deck {
    private ArrayList<Card> cards;
    
//    public Deck(){
//        
//    }
//    
    public void shuffle(){
        Collections.shuffle(cards);
    }
    
    public Card next(boolean remove){
        Card nextCard = cards.get(0);
        if (remove){
            cards.remove(0);
        }
        return nextCard;
    }
    
    public int count(){
        return cards.size();
    }
    
    public void restart(){
        cards.clear();
        loadDeck();
    }
    
    public void loadDeck(){
        BufferedImage cardSprites = (BufferedImage) ResourceTools.loadImageFromResource("resources/Cards.jpg");
        
        cards.add(new Card(Suit.Clubs, 1, cardSprites.getSubimage(0, 0, 178, 260)));
        cards.add(new Card(Suit.Clubs, 2, cardSprites.getSubimage(179, 0, 178, 260)));
        cards.add(new Card(Suit.Clubs, 3, cardSprites.getSubimage(358, 0, 178, 260)));
        cards.add(new Card(Suit.Clubs, 4, cardSprites.getSubimage(537, 0, 178, 260)));
        cards.add(new Card(Suit.Clubs, 5, cardSprites.getSubimage(716, 0, 178, 260)));
        cards.add(new Card(Suit.Clubs, 6, cardSprites.getSubimage(895, 0, 178, 260)));
        cards.add(new Card(Suit.Clubs, 7, cardSprites.getSubimage(1074, 0, 178, 260)));
        cards.add(new Card(Suit.Clubs, 8, cardSprites.getSubimage(1253, 0, 178, 260)));
        cards.add(new Card(Suit.Clubs, 9, cardSprites.getSubimage(1432, 0, 178, 260)));
        cards.add(new Card(Suit.Clubs, 10, cardSprites.getSubimage(1611, 0, 178, 260)));
        cards.add(new Card(Suit.Clubs, 11, cardSprites.getSubimage(1790, 0, 178, 260)));
        cards.add(new Card(Suit.Clubs, 12, cardSprites.getSubimage(1969, 0, 178, 260)));
        cards.add(new Card(Suit.Clubs, 13, cardSprites.getSubimage(2148, 0, 175, 260)));
        
        cards.add(new Card(Suit.Diamonds, 1, cardSprites.getSubimage(0, 260, 178, 260)));
        cards.add(new Card(Suit.Diamonds, 2, cardSprites.getSubimage(179,260, 178, 260)));
        cards.add(new Card(Suit.Diamonds, 3, cardSprites.getSubimage(358, 260, 178, 260)));
        cards.add(new Card(Suit.Diamonds, 4, cardSprites.getSubimage(537, 260, 178, 260)));
        cards.add(new Card(Suit.Diamonds, 5, cardSprites.getSubimage(716, 260, 178, 260)));
        cards.add(new Card(Suit.Diamonds, 6, cardSprites.getSubimage(895, 260, 178, 260)));
        cards.add(new Card(Suit.Diamonds, 7, cardSprites.getSubimage(1074, 260, 178, 260)));
        cards.add(new Card(Suit.Diamonds, 8, cardSprites.getSubimage(1253, 260, 178, 260)));
        cards.add(new Card(Suit.Diamonds, 9, cardSprites.getSubimage(1432, 260, 178, 260)));
        cards.add(new Card(Suit.Diamonds, 10, cardSprites.getSubimage(1611, 260, 178, 260)));
        cards.add(new Card(Suit.Diamonds, 11, cardSprites.getSubimage(1790, 260, 178, 260)));
        cards.add(new Card(Suit.Diamonds, 12, cardSprites.getSubimage(1969, 260, 178, 260)));
        cards.add(new Card(Suit.Diamonds, 13, cardSprites.getSubimage(2148, 260, 175, 260)));
       
        
        
        cards.add(new Card(Suit.Hearts, 1, cardSprites.getSubimage(0, 520, 178, 260)));
        cards.add(new Card(Suit.Hearts, 2, cardSprites.getSubimage(179,520, 178, 260)));
        cards.add(new Card(Suit.Hearts, 3, cardSprites.getSubimage(358, 520, 178, 260)));
        cards.add(new Card(Suit.Hearts, 4, cardSprites.getSubimage(537, 520, 178, 260)));
        cards.add(new Card(Suit.Hearts, 5, cardSprites.getSubimage(716, 520, 178, 260)));
        cards.add(new Card(Suit.Hearts, 6, cardSprites.getSubimage(895, 520, 178, 260)));
        cards.add(new Card(Suit.Hearts, 7, cardSprites.getSubimage(1074, 520, 178, 260)));
        cards.add(new Card(Suit.Hearts, 8, cardSprites.getSubimage(1253, 520, 178, 260)));
        cards.add(new Card(Suit.Hearts, 9, cardSprites.getSubimage(1432, 520, 178, 260)));
        cards.add(new Card(Suit.Hearts, 10, cardSprites.getSubimage(1611, 520, 178, 260)));
        cards.add(new Card(Suit.Hearts, 11, cardSprites.getSubimage(1790, 520, 178, 260)));
        cards.add(new Card(Suit.Hearts, 12, cardSprites.getSubimage(1969, 520, 178, 260)));
        cards.add(new Card(Suit.Hearts, 13, cardSprites.getSubimage(2148, 520, 175, 260)));
        
        
        cards.add(new Card(Suit.Spades, 1, cardSprites.getSubimage(0, 780, 178, 260)));
        cards.add(new Card(Suit.Spades, 2, cardSprites.getSubimage(179,780, 178, 260)));
        cards.add(new Card(Suit.Spades, 3, cardSprites.getSubimage(358, 780, 178, 260)));
        cards.add(new Card(Suit.Spades, 4, cardSprites.getSubimage(537, 780, 178, 260)));
        cards.add(new Card(Suit.Spades, 5, cardSprites.getSubimage(716, 780, 178, 260)));
        cards.add(new Card(Suit.Spades, 6, cardSprites.getSubimage(895, 780, 178, 260)));
        cards.add(new Card(Suit.Spades, 7, cardSprites.getSubimage(1074, 780, 178, 260)));
        cards.add(new Card(Suit.Spades, 8, cardSprites.getSubimage(1253, 780, 178, 260)));
        cards.add(new Card(Suit.Spades, 9, cardSprites.getSubimage(1432, 780, 178, 260)));
        cards.add(new Card(Suit.Spades, 10, cardSprites.getSubimage(1611, 780, 178, 260)));
        cards.add(new Card(Suit.Spades, 11, cardSprites.getSubimage(1790, 780, 178, 260)));
        cards.add(new Card(Suit.Spades, 12, cardSprites.getSubimage(1969, 780, 178, 260)));
        cards.add(new Card(Suit.Spades, 13, cardSprites.getSubimage(2148, 780, 175, 260)));
        
    }
    
}
