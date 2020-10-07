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
public class QC_V extends QCOperation{

    public QC_V() {
    }
    
    public QC_V(int nqbits, int[] qubits) {
        this.setnWires(nqbits);
        this.setWires(qubits);
    }

    @Override
    public void draw(Graphics g, int timestep, int xdist, int ydist, int leftmargin, int topmargin) {
        
        g.fillOval(timestep*xdist+leftmargin+xdist/4, ydist*this.getWires()[0]+topmargin-ydist/4, xdist/2, ydist/2);        
        g.drawLine(timestep*xdist+leftmargin+ydist/2, ydist*this.getWires()[0]+topmargin, timestep*xdist+leftmargin+ydist/2, ydist*this.getWires()[getnWires()-1]+topmargin);        

        for(int i=1;i<getnWires();i++){
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
    public String emitOctave() {
        return "ERROR!";        
    }

    
    
    


    
    
}
