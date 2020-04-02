/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qcoperations;

import java.awt.Graphics;
import java.io.Serializable;

/**
 *
 * @author chris
 */
public class QCOperation implements Serializable{
    private int timeStep=0;
    private int nWires=1;
    private int[] Wires = new int[nWires];
    private int nControls=0;
    private int[] Controls=new int[nControls];
    private String Symbol="U";
    private boolean transposed=false;

    public QCOperation() {
        
    }

    public QCOperation(int nqbits, int[] qubits) {
//        nWires=nqbits;
//        Wires=qubits;
    }
    
    
    public void draw(Graphics g,int timestep, int xdist, int ydist, int leftmargin, int topmargin){
    
    }
    
    public String emit(){
        return "0";
    }
    
    /**
     * @return the timeStep
     */
    public int getTimeStep() {
        return timeStep;
    }

    /**
     * @param timeStep the timeStep to set
     */
    public void setTimeStep(int timeStep) {
        this.timeStep = timeStep;
    }

    /**
     * @return the nWires
     */
    public int getnWires() {
        return nWires;
    }

    /**
     * @param nWires the nWires to set
     */
    public void setnWires(int nWires) {
        this.nWires = nWires;
    }

    /**
     * @return the Wires
     */
    public int[] getWires() {
        return Wires;
    }

    /**
     * @param Wires the Wires to set
     */
    public void setWires(int[] Wires) {
        this.Wires = Wires;
    }

    /**
     * @return the nControls
     */
    public int getnControls() {
        return nControls;
    }

    /**
     * @param nControls the nControls to set
     */
    public void setnControls(int nControls) {
        this.nControls = nControls;
    }

    /**
     * @return the Controls
     */
    public int[] getControls() {
        return Controls;
    }

    /**
     * @param Controls the Controls to set
     */
    public void setControls(int[] Controls) {
        this.Controls = Controls;
    }

    /**
     * @return the Symbol
     */
    public String getSymbol() {
        return Symbol;
    }

    /**
     * @param Symbol the Symbol to set
     */
    public void setSymbol(String Symbol) {
        this.Symbol = Symbol;
    }         

    /**
     * @return the transposed
     */
    public boolean isTransposed() {
        return transposed;
    }

    /**
     * @param transposed the transposed to set
     */
    public void setTransposed(boolean transposed) {
        this.transposed = transposed;
    }
}
