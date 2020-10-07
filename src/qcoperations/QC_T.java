/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qcoperations;

import java.awt.Color;
import java.awt.Graphics;
import qcdesigner.ViewManager;

/**
 *
 * @author chris
 */
public class QC_T extends QCOperation{

    public QC_T() {
    }
    
    public QC_T(int nqbits, int[] qubits) {
        this.setnWires(nqbits);
        this.setWires(qubits);
    }

    @Override
    public void draw(Graphics g, int timestep, int xdist, int ydist, int leftmargin, int topmargin) {
        for(int i=0;i<getnWires()-1;i++){
            g.fillOval(timestep*xdist+leftmargin+xdist/4, ydist*this.getWires()[i]+topmargin-ydist/4, xdist/2, ydist/2);        
            g.drawLine(timestep*xdist+leftmargin+ydist/2, ydist*this.getWires()[i]+topmargin, timestep*xdist+leftmargin+ydist/2, ydist*this.getWires()[getnWires()-1]+topmargin);        
        }
        g.setColor(ViewManager.getTheInstance().getBackground());        
        g.fillRect(timestep*xdist+leftmargin+xdist/8, ydist*this.getWires()[this.getnWires()-1]+topmargin-3*ydist/8, 3*xdist/4, 3*ydist/4);
        g.setColor(ViewManager.getTheInstance().getForeground());
        g.drawRect(timestep*xdist+leftmargin+xdist/8, ydist*this.getWires()[this.getnWires()-1]+topmargin-3*ydist/8, 3*xdist/4, 3*ydist/4);
        g.drawString("T",timestep*xdist+leftmargin+xdist/4+2, ydist*this.getWires()[this.getnWires()-1]+topmargin+3*ydist/16);

    }

    @Override
    public String emitOctave() {
        if(getnWires()==1){
            int n0=getWires()[0]+1;
            return "(c{"+n0+"}*c{"+n0+"}'+exp(1.0i*pi/4.0)*c{"+n0+"}'*c{"+n0+"})";
        }else if(getnWires()==2){
            int n0=getWires()[0]+1;
            int n1=getWires()[1]+1;
            return "((c{"+n1+"}*c{"+n1+"}'+exp(1.0i*pi/4.0)*c{"+n1+"}'*c{"+n1+"})*c{"+n0+"}'*c{"+n0+"}+c{"+n0+"}*c{"+n0+"}')";
        }
        return "(ERROR! T only with 1 and 2  qubits)";
    }

    
    
    


    
    
}
