/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package QCAlgorithm;

import java.io.Serializable;
import java.util.Vector;
import qcoperations.*;
/**
 *
 * @author chris
 */
public class QCAlgorithm implements Serializable {
    private Vector<QCOperation> TheOperations = new Vector<QCOperation>();
    private int nQubits=10;
    public QCAlgorithm() {
    }
    
    
    
    public static  QCAlgorithm make_testalgorithm1(int nqubits) {
        
        QCAlgorithm testalg = new QCAlgorithm();
        testalg.setnQubits(nqubits);
        for(int i=0;i<100;i++){
            int[] t= new int[1];
            t[0]=i%10;
            testalg.TheOperations.add(new QC_NOP());
        }
        return testalg;
    };
    
    public int getNOperations(){
        return TheOperations.size();
    }

    /**
     * @return the TheOperations
     */
    public Vector<QCOperation> getTheOperations() {
        return TheOperations;
    }

    /**
     * @param TheOperations the TheOperations to set
     */
    public void setTheOperations(Vector<QCOperation> TheOperations) {
        this.TheOperations = TheOperations;
    }

    /**
     * @return the nQubits
     */
    public int getnQubits() {
        return nQubits;
    }

    /**
     * @param nQubits the nQubits to set
     */
    public void setnQubits(int nQubits) {
        this.nQubits = nQubits;
    }
}
