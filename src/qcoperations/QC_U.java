/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qcoperations;

import java.awt.Color;
import java.awt.Graphics;

/**
 *
 * @author chris
 */
public class QC_U extends QCOperation{

    public QC_U() {
    }
    
    public QC_U(int nqbits, int[] qubits) {
        this.setnWires(nqbits);
        this.setWires(qubits);
    }

    @Override
    public void draw(Graphics g, int timestep, int xdist, int ydist, int leftmargin, int topmargin) {
        
        
        for(int i=0;i<getnWires();i++){
            g.fillRect(timestep*xdist+leftmargin+xdist/8, ydist*this.getWires()[i]+topmargin-3*ydist/8, 3*xdist/4, 3*ydist/4);
            Color c=g.getColor();
            g.setColor(Color.black);
            g.drawString("U",timestep*xdist+leftmargin+xdist/4, ydist*this.getWires()[i]+topmargin+3*ydist/16);
            g.setColor(c);
        }
//        g.fillRect(timestep*xdist+leftmargin+xdist/8, ydist*this.getWires()[this.getnWires()-1]+topmargin-3*ydist/8, 3*xdist/4, 3*ydist/4);
//        Color c=g.getColor();
//        g.setColor(Color.black);
//        g.drawString("H",timestep*xdist+leftmargin+xdist/4, ydist*this.getWires()[this.getnWires()-1]+topmargin+3*ydist/16);
//        g.setColor(c);

        
    }

    @Override
    public String emit() {
        return "ERROR!";        
    }

    
    
    


    
    
}
