/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package framework.parser;

/**
 *
 * @author Spencer
 */
public class Range {  
    
    private static final int INFINITY = 1000000000;
    private final int c1;
    private final int c2;
    private final int r1;
    private final int r2;
        
    public Range() {
        this.c1 = 0;
        this.c2 = INFINITY;
        this.r1 = 0;
        this.r2 = INFINITY;
    }
        
    public Range(String corner1, String corner2) { //input ex: Range(A4, C12);

        if (getColumnPosition(corner1) < getColumnPosition(corner2)) {
            this.c1 = getColumnPosition(corner1);
            this.c2 = getColumnPosition(corner2);
        } else {
            this.c1 = getColumnPosition(corner2);
            this.c2 = getColumnPosition(corner1);
        }

        if (getRowPosition(corner1) < getRowPosition(corner2)) {
            this.r1 = getRowPosition(corner1);
            this.r2 = getRowPosition(corner2);
        } else {
            this.r1 = getRowPosition(corner2);
            this.r2 = getRowPosition(corner1);
        }
    }

    private int getRowPosition(String corner) {
        String pos = corner.replaceAll("[^A-Za-z]+", "");
        return alphabetToInteger(pos);
    }

    private int alphabetToInteger(String pos) {
        int newVal = 0;

        for (int i = 0; i < pos.length(); i++) {
            int multiplier = i+1;
            int charVal = pos.charAt(i) - 'a';
            newVal += (multiplier * charVal);
        }

        return newVal;
    }

    private int getColumnPosition(String corner) {
        String pos = corner.replaceAll("[^0-9.]", "");
        return Integer.parseInt(pos);
    }
}