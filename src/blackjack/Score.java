/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Point;

/**
 *
 * @author diegocantu
 */
public class Score {

    public void draw(Graphics graphics) {
        graphics.setColor(Color.WHITE);
//        graphics.drawString("Score: " + getValue(), getPosition().x, getPosition().y);
        graphics.setFont(getFont());
        graphics.drawString("Money: ", 50, 50);
    }

    private int value = 0;
    private Point position;
    private Font font = new Font("Calibri", Font.ROMAN_BASELINE, 40);

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
     * @return the position
     */
    public Point getPosition() {
        return position;
    }

    /**
     * @param position the position to set
     */
    public void setPosition(Point position) {
        this.position = position;
    }

    /**
     * @return the font
     */
    public Font getFont() {
        return font;
    }

    /**
     * @param font the font to set
     */
    public void setFont(Font font) {
        this.font = font;
    }

}
