/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

/**
 *
 * @author diegocantu
 */
public class ChipCount {

//<editor-fold defaultstate="collapsed" desc="Constructors">
    public ChipCount(Chip chip, int count){
        this.chip = chip;
        this.count = count;
    }
//</editor-fold>
    
//<editor-fold defaultstate="collapsed" desc="Properties">
    private Chip chip;
    private int count;
    
    /**
     * @return the total value of the chips
     */
    public int getValue() {
        return chip.getValue() * count;
    }

    /**
     * @return the formatted total value of the chips
     */
    public String getFormattedValue() {
        return String.format("$ %d.00", getValue());
    }
    
    /**
     * @return the chip
     */
    public Chip getChip() {
        return chip;
    }
    
    /**
     * @param chip the chip to set
     */
    public void setChip(Chip chip) {
        this.chip = chip;
    }
    
    /**
     * @return the count
     */
    public int getCount() {
        return count;
    }
    
    /**
     * @param count the count to set
     */
    public void setCount(int count) {
        this.count = count;
    }

    /**
     * @param count the count to set
     */
    public void add(int count) {
        this.count += count;
    }
//</editor-fold>
}
