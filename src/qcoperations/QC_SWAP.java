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
public class QC_SWAP extends QCOperation{

    public QC_SWAP() {
    }
    
    public QC_SWAP(int nqbits, int[] qubits) {
        this.setnWires(nqbits);
        this.setWires(qubits);
    }

    @Override
    public void draw(Graphics g, int timestep, int xdist, int ydist, int leftmargin, int topmargin) {
        int xoff=timestep*xdist;
        for(int i=0;i<getnWires()-2;i++){
            g.fillOval(timestep*xdist+leftmargin+xdist/4, ydist*this.getWires()[i]+topmargin-ydist/4, xdist/2, ydist/2);        
            g.drawLine(timestep*xdist+leftmargin+ydist/2, ydist*this.getWires()[i]+topmargin, timestep*xdist+leftmargin+ydist/2, ydist*this.getWires()[getnWires()-1]+topmargin);        
        }

        int n0=this.getWires()[getnWires()-1];
        int n1=this.getWires()[getnWires()-2];
        g.drawLine(xoff+leftmargin+3*xdist/4, ydist*n0+topmargin-ydist/4, 
                   xoff+leftmargin+xdist/4, ydist*n0+topmargin+ydist/4);        
        g.drawLine(xoff+leftmargin+xdist/4, ydist*n0+topmargin-ydist/4, 
                   xoff+leftmargin+3*xdist/4, ydist*n0+topmargin+ydist/4);        
        g.drawLine(xoff+leftmargin+3*xdist/4, ydist*n1+topmargin-ydist/4, 
                   xoff+leftmargin+xdist/4, ydist*n1+topmargin+ydist/4);        
        g.drawLine(xoff+leftmargin+xdist/4, ydist*n1+topmargin-ydist/4, 
                   xoff+leftmargin+3*xdist/4, ydist*n1+topmargin+ydist/4);        
        g.drawLine(xoff+leftmargin+xdist/2, ydist*n0+topmargin, 
                   xoff+leftmargin+xdist/2, ydist*n1+topmargin);        
    }

    @Override
    public String emitOctave() {
        String s="";
        int n1=getWires()[getnWires()-1]+1;
        int n2=getWires()[getnWires()-2]+1;
        String cnot12 = "((c{"+n1+"}+c{"+n1+"}')*c{"+n2+"}'*c{"+n2+"}+c{"+n2+"}*c{"+n2+"}')";
        String cnot21 = "((c{"+n2+"}+c{"+n2+"}')*c{"+n1+"}'*c{"+n1+"}+c{"+n1+"}*c{"+n1+"}')";
        if(getnWires()==1){
            s="ERROR";
        }else if(getnWires()==2){
            s="("+cnot12+"*"+cnot21+"*"+cnot12+")";
        }else if(getnWires()==3){
            int n3=getWires()[getnWires()-3]+1;
            s="(("+cnot12+"*"+cnot21+"*"+cnot12+")*c{"+n3+"}'*c{"+n3+"}+c{"+n3+"}*c{"+n3+"}')";
        }else{
            s="ERROR";        
        }
        
        return s;
    }

    
    
    


    
    
}
