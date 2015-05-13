/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import images.ResourceTools;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

/**
 *
 * @author diegocantu
 */
public class Chips {

    private ArrayList<Chip> chips;

    {
        chips = new ArrayList<>();
        loadChips();
    }

    public void restart() {
        chips.clear();
        loadChips();
    }

    private void loadChips() {
        BufferedImage chipSprites = (BufferedImage) ResourceTools.loadImageFromResource("resources/Blackjackchips.png");
    
        chips.add(new Chip(chipSprites.getSubimage(100, 10, 200, 185), new Point(100, 100), 1));
        chips.add(new Chip(chipSprites.getSubimage(300, 10, 200, 185), new Point(150, 150), 5));
        chips.add(new Chip(chipSprites.getSubimage(500, 10, 200, 185), new Point(200, 200), 10));
        chips.add(new Chip(chipSprites.getSubimage(0, 200, 200, 185), new Point(250, 250), 25));
         chips.add(new Chip(chipSprites.getSubimage(200, 200, 200, 185), new Point(300, 300), 50));
        chips.add(new Chip(chipSprites.getSubimage(400, 200, 200, 185), new Point(350, 350), 100));
         chips.add(new Chip(chipSprites.getSubimage(600, 200, 200, 185), new Point(400, 400), 500));
        chips.add(new Chip(chipSprites.getSubimage(100, 400, 200, 185), new Point(450, 450), 1000));
    
    }

    void draw(Graphics graphics) {
        for (int i = 0; i < chips.size(); i++){
            chips.get(i).paint(graphics);
        }
    }

}
