/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blackjack;

import java.util.ArrayList;

/**
 *
 * @author diegocantu
 */
public class ChipCollection {
    
    {
        chips = new ArrayList<>();
    }
    
    
    private ArrayList<ChipCount> chips;

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
    
}
