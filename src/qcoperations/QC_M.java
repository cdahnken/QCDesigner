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
public class QC_M extends QCOperation{

    public QC_M() {
    }
    
    public QC_M(int nqbits, int[] qubits) {
        this.setnWires(nqbits);
        this.setWires(qubits);
    }

    @Override
    public void draw(Graphics g, int timestep, int xdist, int ydist, int leftmargin, int topmargin) {
        Color c = g.getColor();
        g.fillRect(timestep*xdist+leftmargin, ydist*this.getWires()[0]+topmargin-ydist/2, xdist, ydist);
        g.setColor(Color.black);
        g.drawRect(timestep*xdist+leftmargin+xdist/8+1, ydist*this.getWires()[0]+topmargin-ydist/2+ydist/8+1, 6*xdist/8, 6*ydist/8);
        
        g.drawLine(timestep*xdist+leftmargin+xdist/2, ydist*this.getWires()[0]+topmargin+ydist/4, timestep*xdist+leftmargin+7*xdist/8, ydist*this.getWires()[0]+topmargin-2*ydist/8);
        g.drawArc(timestep*xdist+leftmargin+xdist/8+1, ydist*this.getWires()[0]+topmargin-ydist/3+ydist/8+1, 6*xdist/8, 6*ydist/8, 0,180);
        g.setColor(c);
//        g.drawOval(timestep*xdist+leftmargin+xdist/4, ydist*this.getWires()[0]+topmargin-ydist/4, xdist/2, ydist/2);
//        g.drawLine(timestep*xdist+leftmargin+xdist/2, ydist*this.getWires()[0]+topmargin-ydist/4, timestep*xdist+leftmargin+xdist/2, ydist*this.getWires()[0]+topmargin+ydist/4);        
    }

    @Override
    public String emitOctave() {
        int n0=getWires()[0]+1;
        return "(c{"+n0+"}+c{"+n0+")')";
    }

    
    
    


    
    
}
