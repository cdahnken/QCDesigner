/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qcdesigner;

import QCAlgorithm.QCAlgorithm;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JTextArea;
import qcoperations.QCOperation;
import qcoperations.QC_CNOT;
import qcoperations.QC_H;
import qcoperations.QC_M;
import qcoperations.QC_NOP;
import qcoperations.QC_NOT;
import qcoperations.QC_R;
import qcoperations.QC_S;
import qcoperations.QC_SWAP;
import qcoperations.QC_T;
import qcoperations.QC_U;
import qcoperations.QC_V;

/**
 *
 * @author chris
 */
public class QCDesignerPanel extends javax.swing.JPanel {

    /**
     * @return the outputTextArea
     */
    public JTextArea getOutputTextArea() {
        return outputTextArea;
    }

    /**
     * @param outputTextArea the outputTextArea to set
     */
    public void setOutputTextArea(JTextArea outputTextArea) {
        this.outputTextArea = outputTextArea;
    }

    /**
     * @return the TheAlgorithm
     */
    public QCAlgorithm getTheAlgorithm() {
        return TheAlgorithm;
    }
    public void setTheAlgorithm(QCAlgorithm a) {
        TheAlgorithm=a;
        this.repaint();
    }

    /**
     * @return the helpTextArea
     */
    public JTextArea getHelpTextArea() {
        return helpTextArea;
    }

    /**
     * @param helpTextArea the helpTextArea to set
     */
    public void setHelpTextArea(JTextArea helpTextArea) {
        this.helpTextArea = helpTextArea;
    }

    //private int nQubits=10;
    public int xDist=30;
    public int yDist=30;
    public int leftMargin=60;
    public int rightMargin=20;
    public int topMargin=60;
//    public int nTimeSteps=1;
    private Color focuscolor=new Color(0.5f, 0.5f, 0.0f, 0.7f);
//    Color forecolor=Color.BLACK;
//    Color backcolor=Color.WHITE;
    int focusx=0;
    int focusy=0;
    int focusx_old=-1;
    int focusy_old=-1;
    boolean focuson=true;
    int nMarkings=0;
    boolean marking=false;
    private int nTimeSteps=1000;
    private QCAlgorithm TheAlgorithm = QCAlgorithm.make_testalgorithm1(10); 
    int[] marked=new int[TheAlgorithm.getnQubits()];
    private JTextArea outputTextArea;
    private JTextArea helpTextArea;
    
    
    /**
     * Creates new form QCDesignerPanel
     */
    public QCDesignerPanel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setBackground(new java.awt.Color(0, 0, 0));
        setForeground(new java.awt.Color(51, 255, 255));
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
        });
        addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                formKeyTyped(evt);
            }
            public void keyPressed(java.awt.event.KeyEvent evt) {
                formKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                formKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 654, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 576, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        focusx=(evt.getX()-leftMargin)/xDist;
        focusy=(evt.getY()-topMargin+yDist/2)/yDist;
        if(focusx<0) focusx=0;
        if(focusy<0) focusy=0;
        System.out.println(focusx+" "+focusy);
//        if(focusx==focusx_old){
//            marked[nMarkings]=focusy;
//            System.out.println("Markings: "+nMarkings );
//            nMarkings++;
//            for(int i=0;i<nMarkings;i++)
//                System.out.println("\t"+marked[i] );
//        }else{
//            nMarkings=1;
//            marked[nMarkings-1]=focusy;
//        }
        markRoutine();
        repaint();
    }//GEN-LAST:event_formMouseClicked

    private void formKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyTyped
        // TODO add your handling code here:
        //System.out.println("Key "+evt.getKeyCode());
    }//GEN-LAST:event_formKeyTyped

    private void formKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyPressed
        // TODO add your handling code here:
        if(evt.getKeyCode()==17){
            System.out.println("ctrldown");
            marking=true;
        } else if(evt.getKeyCode()==27){
            nMarkings=0;
            repaint();
        }else if(evt.getKeyCode()==32){ 
           // Mark
           markRoutine();
        } else if(evt.getKeyCode()==37){
            focusx--;
            if(focusx<0) focusx=0;
        } else if(evt.getKeyCode()==38){
            focusy--;
            if(focusy<0) focusy=0;
        } else if(evt.getKeyCode()==39){ 
            focusx++;
        } else if(evt.getKeyCode()==40){
            focusy++;
        }else if(evt.getKeyCode()==112){ // F9
            helpTextArea.setText(
                    "SWITCHOLOGY:\n"
                    +"Phase gates:\n"
                    +"    one wire marked: phase gate\n"
                    +"    two wires marked: conditional phase gate\n"
                    +"0 - Phase gate e^( pi i)\n"
                    +"1 - Phase gate e^(pi i/2)\n"
                    +"2 - Phase gate e^(pi i/4)\n"
                    +"3 - Phase gate e^(pi i/8)\n"
                    +"4 - Phase gate e^(pi i/16)\n"
                    +"5 - Phase gate e^(pi i/32)\n"
                    +"6 - Phase gate e^(pi i/64)\n"
                    +"7 - Phase gate e^(pi i/128)\n"
                    +"8 - Phase gate e^(pi i/256)\n"
                    +"9 - Phase gate e^(pi i/512)\n"
                    +"s - S gate (pi/4)\n"
                    +"t - T gate (pi/8)\n"
                    +"p - P gate (pi/2^n)\n"
                    +"    [not implemented yet]\n"
                    +"Other gates:\n"
                    +"h - add Hadamard gate\n"
                    +"u - add unitary multi-bit gate\n"
                    +"v - add conditional unitary multi-bit gate\n"
                    +"w - two wires markes: SWAP gate\n"
                    +"    three wires markes: Fredkin gate\n"
                    +"x - one wire marked: NOT gate \n"
                    +"    two wires marked: CNOT gate \n"
                    +"    three wires marked: Tofoli gate \n"
                    +"Editing:\n"
                    +"d - replace current gate with NOP\n"
                    +"D - remove current slice\n"
                    +"a - add wire at bottom\n"
                    +"A - remove last\n"
                    +"b - add slice left\n"
                    +"B - add slice right\n"
            );
        }else if(evt.getKeyCode()==116){ // F5 add slice left
            int n=focusx;
            if(n<0) n=0;
            TheAlgorithm.getTheOperations().insertElementAt(new QC_NOP(), n);
        }else if(evt.getKeyCode()==117){ // F6 add slice right
            int n=focusx+1;
            if(n>=TheAlgorithm.getTheOperations().size()) n=TheAlgorithm.getTheOperations().size();            
            TheAlgorithm.getTheOperations().insertElementAt(new QC_NOP(), n);
        }else if(evt.getKeyCode()==118){ // F7 remove qbit
            setnQubits(getnQubits()-1);
//            outputTextArea.setText("F7 action not implemented yet\n");
        }else if(evt.getKeyCode()==119){ // F8 add qubit
            setnQubits(getnQubits()+1);
//            outputTextArea.setText("F8 action not implemented yet\n");
        }else if(evt.getKeyCode()==120){ // F9
            outputTextArea.setText("F9 action not implemented yet\n");
        }else if(evt.getKeyChar()=='0'){
            TheAlgorithm.getTheOperations().set(focusx, new QC_R(nMarkings, marked.clone(),0));
        }else if(evt.getKeyChar()=='1'){
            TheAlgorithm.getTheOperations().set(focusx, new QC_R(nMarkings, marked.clone(),1));
        }else if(evt.getKeyChar()=='2'){
            TheAlgorithm.getTheOperations().set(focusx, new QC_R(nMarkings, marked.clone(),2));
        }else if(evt.getKeyChar()=='3'){
            TheAlgorithm.getTheOperations().set(focusx, new QC_R(nMarkings, marked.clone(),3));
        }else if(evt.getKeyChar()=='4'){
            TheAlgorithm.getTheOperations().set(focusx, new QC_R(nMarkings, marked.clone(),4));
        }else if(evt.getKeyChar()=='5'){
            TheAlgorithm.getTheOperations().set(focusx, new QC_R(nMarkings, marked.clone(),5));
        }else if(evt.getKeyChar()=='6'){
            TheAlgorithm.getTheOperations().set(focusx, new QC_R(nMarkings, marked.clone(),6));
        }else if(evt.getKeyChar()=='7'){
            TheAlgorithm.getTheOperations().set(focusx, new QC_R(nMarkings, marked.clone(),7));
        }else if(evt.getKeyChar()=='8'){
            TheAlgorithm.getTheOperations().set(focusx, new QC_R(nMarkings, marked.clone(),8));
        }else if(evt.getKeyChar()=='9'){
            TheAlgorithm.getTheOperations().set(focusx, new QC_R(nMarkings, marked.clone(),9));
        } else if(evt.getKeyChar()=='a'){
            setnQubits(getnQubits()+1);
        } else if(evt.getKeyChar()=='A'){
            int t_n=getnQubits()-1;
            if(t_n>0) setnQubits(t_n);
        } else if(evt.getKeyChar()=='b'){ // F5 add slice left
            int n=focusx;
            if(n<0) n=0;
            TheAlgorithm.getTheOperations().insertElementAt(new QC_NOP(), n);
        }else if(evt.getKeyChar()=='B'){ // F6 add slice right
            int n=focusx+1;
            if(n>=TheAlgorithm.getTheOperations().size()) n=TheAlgorithm.getTheOperations().size();            
            TheAlgorithm.getTheOperations().insertElementAt(new QC_NOP(), n);
        }else if(evt.getKeyChar()=='c'){
            TheAlgorithm.getTheOperations().set(focusx, new QC_CNOT(nMarkings, marked.clone()));
        } else if(evt.getKeyChar()=='d'){
            TheAlgorithm.getTheOperations().set(focusx, new QC_NOP());
        }else if(evt.getKeyChar()=='D'){
            TheAlgorithm.getTheOperations().remove(focusx);
            TheAlgorithm.getTheOperations().add(new QC_NOP());
        }else if(evt.getKeyChar()=='e'){
            String s=TheAlgorithm.getTheOperations().elementAt(0).emitOctave();
            for(int i=1;i<TheAlgorithm.getNOperations();i++){
                System.out.println(""+TheAlgorithm.getTheOperations().elementAt(i).getClass().getName());
                System.out.println(""+QC_NOP.class.getName());
                if(!TheAlgorithm.getTheOperations().elementAt(i).getClass().getName().equalsIgnoreCase(QC_NOP.class.getName())){
                    s=TheAlgorithm.getTheOperations().elementAt(i).emitOctave()+" ... \n *"+s;
                }
            }
            if(s.length()>1)
                s=s.substring(0,s.length());
            outputTextArea.setText(s);
        }else if(evt.getKeyChar()=='h'){
            TheAlgorithm.getTheOperations().set(focusx, new QC_H(nMarkings, marked.clone()));
        }else if(evt.getKeyChar()=='m'){
            TheAlgorithm.getTheOperations().set(focusx, new QC_M(nMarkings, marked.clone()));
        }else if(evt.getKeyChar()=='s'){
            TheAlgorithm.getTheOperations().set(focusx, new QC_S(nMarkings, marked.clone()));
        }else if(evt.getKeyChar()=='t'){
            TheAlgorithm.getTheOperations().set(focusx, new QC_T(nMarkings, marked.clone()));
        }else if(evt.getKeyChar()=='u'){
            TheAlgorithm.getTheOperations().set(focusx, new QC_U(nMarkings, marked.clone()));
        }else if(evt.getKeyChar()=='v'){
            TheAlgorithm.getTheOperations().set(focusx, new QC_V(nMarkings, marked.clone()));
        }else if(evt.getKeyChar()=='w'){
            if(nMarkings==2){
                TheAlgorithm.getTheOperations().set(focusx, new QC_SWAP(2, marked.clone()));
            }else if(nMarkings==3){
                TheAlgorithm.getTheOperations().set(focusx, new QC_SWAP(3, marked.clone()));
//                outputTextArea.setText("Fredkin gate not yet implemented\n");
            }else{
                outputTextArea.setText("SWAP gate can act on either two or three qubits\n");            
            }
        }else if(evt.getKeyChar()=='x'){
                TheAlgorithm.getTheOperations().set(focusx, new QC_CNOT(nMarkings, marked.clone()));
//                TheAlgorithm.getTheOperations().set(focusx, new QC_CNOT(2, marked.clone()));            
//                TheAlgorithm.getTheOperations().set(focusx, new QC_CNOT(3, marked.clone()));            
        }
        repaint();
        System.out.println("Key "+evt.getKeyChar()+" "+evt.getKeyCode());
    }//GEN-LAST:event_formKeyPressed

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        // TODO add your handling code here:
        System.out.println("Mouse pressed "+this.hasFocus());
        this.grabFocus();
        
    }//GEN-LAST:event_formMousePressed

    private void formKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_formKeyReleased
        // TODO add your handling code here:
        System.out.println("releasing marking");
        marking=false;
    }//GEN-LAST:event_formKeyReleased

    void markRoutine(){
        if(focusx==focusx_old){
            marked[nMarkings]=focusy;
            System.out.println("Markings: "+nMarkings );
            nMarkings++;
            for(int i=0;i<nMarkings;i++)
                System.out.println("\t"+marked[i] );
        }else{
            nMarkings=1;
            marked[nMarkings-1]=focusy;
        }
        focusx_old=focusx;
        focusy_old=focusy;

    }
    
    @Override
    public void paint(Graphics g) {
        int w=this.getWidth();
        int h=this.getHeight();
//        int ntimesteps=getWidth()/xDist;
        super.paint(g); //To change body of generated methods, choose Tools | Templates.

        if(focuson){
            g.setColor(focuscolor);
//            g.fillRect(0, focusy*yDist+yDist/2, w, yDist);
            g.fillRect(0, focusy*yDist-yDist/2+topMargin, w, yDist);
            g.fillRect(focusx*xDist+leftMargin, 0, xDist, getHeight());
            g.setColor(getForeground());
        }
        if(nMarkings>=0){
            for(int i=0;i<nMarkings; i++){
                g.drawRect(focusx*xDist+leftMargin, marked[i]*yDist+topMargin-yDist/2, xDist, yDist);
                g.drawString(""+i,focusx*xDist+leftMargin+1, marked[i]*yDist+topMargin+yDist/2-1);                
            }
        }
        for(int i=0; i<nTimeSteps;i++){
            g.drawString(""+i, i*xDist+leftMargin+xDist/3, topMargin/2);
        }
        for(int i=0; i<TheAlgorithm.getnQubits();i++){
            g.drawString(""+i, leftMargin/2,i*yDist+topMargin+yDist/3);
        }
        for(int i=0; i<getnQubits();i++){
            g.drawLine(leftMargin, yDist*i+topMargin, this.getWidth()-rightMargin, yDist*i+topMargin);
        }
        for(int i=0;i<TheAlgorithm.getNOperations();i++){
            QCOperation t=TheAlgorithm.getTheOperations().elementAt(i);
            t.draw(g,i,xDist,yDist,leftMargin,topMargin);
        }
//        int t=this.getWidth()/xDist;
//        for(int i=0; i<t;i++){
//            g.drawLine(leftMargin, yDist*i+topMargin, this.getWidth()-rightMargin, yDist*i+topMargin);
//        }
    }

    
    /**
     * @return the nQubits
     */
    public int getnQubits() {
        return TheAlgorithm.getnQubits();
    }

    /**
     * @param nQubits the nQubits to set
     */
    public void setnQubits(int nQubits) {
//        this.nQubits = nQubits;
        TheAlgorithm.setnQubits(nQubits);
        marked=new int[nQubits];
        this.setSize(xDist*nTimeSteps, yDist*nQubits);
        
    }

    int getScreenFromGridX(int i){
        return i*xDist+leftMargin;
    }
    int getScreenFromGridY(int i){
        return i*xDist+leftMargin;
    }

    /**
     * @return the nTimeSteps
     */
    public int getnTimeSteps() {
        return nTimeSteps;
    }

    /**
     * @param nTimeSteps the nTimeSteps to set
     */
    public void setnTimeSteps(int nTimeSteps) {
        this.nTimeSteps = nTimeSteps;
    }

    /**
     * @return the focuscolor
     */
    public Color getFocuscolor() {
        return focuscolor;
    }

    /**
     * @param focuscolor the focuscolor to set
     */
    public void setFocuscolor(Color focuscolor) {
        this.focuscolor = focuscolor;
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
