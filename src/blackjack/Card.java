package blackjack;

import java.awt.Image;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Jared
 */
public class Card {
    private Image face;
//    private Image back;
    

    //one of the 4 valid suits for this card.

    private Suit suit;
    //the number of this card, where Ace:1, Jack-King: 11-13
    private int ordinal;
    private int value;

    //aSuit is the suit of the card
    //aNumber is the number of the card
    public Card(Suit aSuit, int ordinal, int value) {
        this.suit = aSuit;
        this.ordinal = ordinal;
        this.value = value;
    }

    public Card(Suit suit, int ordinal, int value, Image face) {
        this.suit = suit;
//        if (ordinal >= 1 && ordinal <= 13) {
//
//        } else {
//            System.err.println(ordinal + "is not a valid Card number");
//            System.exit(1);
//        }
        this.ordinal = ordinal;
        this.value = value;
        this.face = face;
    }

    public int getNumber() {
        //return the number of the card
        return getMyNumber();
    }

    public String toString() {

        String numStr = "Error";

        switch (this.getMyNumber()) {

            case 2:
                numStr = "Two";
                break;

            case 3:
                numStr = "Three";
                break;

            case 4:
                numStr = "Four";
                break;

            case 5:
                numStr = "Five";
                break;

            case 6:
                numStr = "Six";
                break;

            case 7:
                numStr = "Seven";
                break;

            case 8:
                numStr = "Eight";
                break;

            case 9:
                numStr = "Nine";
                break;

            case 10:
                numStr = "Ten";
                break;

            case 11:
                numStr = "Jack";
                break;

            case 12:
                numStr = "Queen";
                break;

            case 13:
                numStr = "King";
                break;

            case 14:
                numStr = "Ace";
                break;

        }

        return numStr + "of" + getMySuit().toString();

    }

    /**
     * @return the face
     */
    public Image getFace() {
        return face;
    }

    /**
     * @param face the face to set
     */
    public void setFace(Image face) {
        this.face = face;
    }

    /**
     * @return the suit
     */
    public Suit getMySuit() {
        return getSuit();
    }

    /**
     * @param mySuit the suit to set
     */
    public void setMySuit(Suit mySuit) {
        this.setSuit(mySuit);
    }

    /**
     * @return the ordinal
     */
    public int getMyNumber() {
        return getOrdinal();
    }

    /**
     * @param myNumber the ordinal to set
     */
    public void setMyNumber(int myNumber) {
        this.setOrdinal(myNumber);
    }

    /**
     * @return the suit
     */
    public Suit getSuit() {
        return suit;
    }

    /**
     * @param suit the suit to set
     */
    public void setSuit(Suit suit) {
        this.suit = suit;
    }

    /**
     * @return the ordinal
     */
    public int getOrdinal() {
        return ordinal;
    }

    /**
     * @param ordinal the ordinal to set
     */
    public void setOrdinal(int ordinal) {
        this.ordinal = ordinal;
    }

    /**
     * @return the value
     */
    public int getValue() {
        return value;
    }

    /**
     * @param value the value to set
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * @return the value
     */
    public int getWidth() {
        if (face != null){
            return this.face.getWidth(null);
        } else {
            return 0;
        }
    }

}
