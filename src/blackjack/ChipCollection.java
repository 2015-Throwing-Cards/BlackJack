/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.util.ArrayList;
import java.util.HashMap;

/**
 *
 * @author diegocantu
 */
public class ChipCollection {
    
    {
        chips = new ArrayList<>();
    }
    
    
//<editor-fold defaultstate="collapsed" desc="Properties">
    private ArrayList<ChipCount> chips;
    
    /**
     * @return the value of the chips in the collection
     */
    public int getCollectionValue() {
        int value = 0;
        value = chips.stream().map((chipCount) -> chipCount.getValue()).reduce(value, Integer::sum);
        return value;
    }
    
    /**
     * @param count
     * @param value
     */
    public boolean addChips(int count, int value) {
        for (ChipCount chipCount : chips){
            if (chipCount.getChip().getValue() == value){
                chipCount.add(count);
                return true;
            }
        }
        
        chips.add(new ChipCount(Chip.))
        
        return true;
    }
    
    /**
     * @return the chips
     */
    public ArrayList<ChipCount> getChips() {
        return chips;
    }
    
    /**
     * @param chips the chips to set
     */
    public void setChips(ArrayList<ChipCount> chips) {
        this.chips = chips;
    }
//</editor-fold>
    
}
