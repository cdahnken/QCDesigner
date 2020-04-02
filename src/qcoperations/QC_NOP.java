/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qcoperations;

import java.awt.Graphics;

/**
 *
 * @author chris
 */
public class QC_NOP extends QCOperation{

    @Override
    public String emit() {
        return "";
    }

    @Override
    public void draw(Graphics g, int timestep, int xdist, int ydist, int leftmargin, int topmargin) {
//        super.draw(g, timestep, xdist, ydist, leftmargin, topmargin); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
