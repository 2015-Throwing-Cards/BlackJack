/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import environment.Actor;
import environment.Velocity;
import images.ResourceTools;
import java.awt.Image;
import java.awt.Point;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

/**
 *
 * @author diegocantu
 */
public class Chip extends Actor {
    
//<editor-fold defaultstate="collapsed" desc="ChipType">
    public static enum ChipType {
        CHIP_TYPE_1(1), CHIP_TYPE_5(5), CHIP_TYPE_10(10), CHIP_TYPE_25(25),
        CHIP_TYPE_50(50), CHIP_TYPE_100(100), CHIP_TYPE_500(500), CHIP_TYPE_1000(1000);
        
        private ChipType(int value){
            this.value = value;
        }
        
        private final int value;
        private int getValue(){
            return value;
        }
    }
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Constructors, Factory Methods">
    public static final ArrayList<Chip> chips = getChips();
    private static BufferedImage chipSprites = (BufferedImage) ResourceTools.loadImageFromResource("resources/Blackjackchips.png");
    
    public static final ArrayList<Chip> getChips(){
        ArrayList<Chip> newChips = new ArrayList<>();
        
        for (ChipType type : Chip.ChipType.values()){
            newChips.add(Chip.getChip(type));
        }
        return newChips;
    }
    
    public static Chip getChip(int value) {
        for (ChipType type : ChipType.values()){
            if (type.getValue() == value){
                return getChip(type);
            }
            
        }
        return null;
    }
    
    public static Chip getChip(ChipType type) {
        if (chipSprites == null){
            chipSprites = (BufferedImage) ResourceTools.loadImageFromResource("resources/Blackjackchips.png");
        }

        switch (type){
            case CHIP_TYPE_5:
                return new Chip(chipSprites.getSubimage(300, 10, 200, 185), new Point(150, 150), type.getValue());
                
            case CHIP_TYPE_10:
                return new Chip(chipSprites.getSubimage(500, 10, 200, 185), new Point(200, 200), type.getValue());
                
            case CHIP_TYPE_25:
                return new Chip(chipSprites.getSubimage(0, 200, 200, 185), new Point(250, 250), type.getValue());
                
            case CHIP_TYPE_50:
                return new Chip(chipSprites.getSubimage(200, 200, 200, 185), new Point(300, 300), type.getValue());
                
            case CHIP_TYPE_100:
                return new Chip(chipSprites.getSubimage(400, 200, 200, 185), new Point(350, 350), type.getValue());
                
            case CHIP_TYPE_500:
                return new Chip(chipSprites.getSubimage(600, 200, 200, 185), new Point(400, 400), type.getValue());
                
            case CHIP_TYPE_1000:
                return new Chip(chipSprites.getSubimage(100, 400, 200, 185), new Point(450, 450), type.getValue());
                
            default:
            case CHIP_TYPE_1:
                return new Chip(chipSprites.getSubimage(100, 10, 200, 185), new Point(100, 100), type.getValue());
        }
    }
    
    public Chip(Image image, Point position, int value) {
        super(image, position, new Velocity(0, 0));
        this.value = value;
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Methods">
    /**
     * @return the a copy of the current chip
     */
    @Override
    public Chip clone() {
        return new Chip(getImage(), getPosition(), getValue());
    }
//</editor-fold>

//<editor-fold defaultstate="collapsed" desc="Properties">
    private int value;
    
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
//</editor-fold>
    
}
