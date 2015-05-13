/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import environment.Actor;
import environment.Velocity;
import java.awt.Image;
import java.awt.Point;

/**
 *
 * @author diegocantu
 */
public class Chip extends Actor {
    
    private int value;

    public Chip(Image image, Point position, int value){
        super(image, position, new Velocity(0, 0));
        this.value = value;
    }
    
}
