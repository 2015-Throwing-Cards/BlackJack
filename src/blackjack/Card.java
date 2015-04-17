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

    private Suit mySuit;
    //the number of this card, where Ace:1, Jack-King: 11-13
    private int myNumber;

    //aSuit is the suit of the card
    //aNumber is the number of the card
    public Card(Suit aSuit, int aNumber) {
        this.mySuit = aSuit;
//        if (aNumber >= 1 && aNumber <= 13) {
//
//        } else {
//            System.err.println(aNumber + "is not a valid Card number");
//            System.exit(1);
//        }
        this.myNumber = aNumber;

    }

    public Card(Suit aSuit, int aNumber, Image face) {
        this.mySuit = aSuit;
        if (aNumber >= 1 && aNumber <= 13) {

        } else {
            System.err.println(aNumber + "is not a valid Card number");
            System.exit(1);
        }
        this.myNumber = aNumber;
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
     * @return the mySuit
     */
    public Suit getMySuit() {
        return mySuit;
    }

    /**
     * @param mySuit the mySuit to set
     */
    public void setMySuit(Suit mySuit) {
        this.mySuit = mySuit;
    }

    /**
     * @return the myNumber
     */
    public int getMyNumber() {
        return myNumber;
    }

    /**
     * @param myNumber the myNumber to set
     */
    public void setMyNumber(int myNumber) {
        this.myNumber = myNumber;
    }

}
