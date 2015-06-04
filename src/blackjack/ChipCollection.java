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
        
        for (ChipCount chipCount : chips){
            value += chipCount.getValue();
        }
        
        return value;
    }
    
    /**
     * @return the chips
     */
    public void addChips() {
        int value = 0;
        
        for (ChipCount chipCount : chips){
            value += chipCount.getValue();
        }
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
