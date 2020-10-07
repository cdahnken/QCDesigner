/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package qcdesigner;

import java.awt.Color;
import java.util.Vector;
import javax.swing.JComponent;

/**
 *
 * @author chris
 */
public class ViewManager {
    static ViewManager theInstance=null;
    
    public static ViewManager getTheInstance(){
       if(theInstance==null){
           theInstance=new ViewManager();
       } 
       return theInstance;
    }
    /**
     * @return the background
     */
    public Color getBackground() {
        return background;
    }

    /**
     * @param background the background to set
     */
    public void setBackground(Color background) {
        this.background = background;
    }

    /**
     * @return the foreground
     */
    public Color getForeground() {
        return foreground;
    }

    /**
     * @param foreGround the foreground to set
     */
    public void setForeground(Color foreGround) {
        this.foreground = foreGround;
    }

    /**
     * @return the highlight
     */
    public Color getHighlight() {
        return highlight;
    }

    /**
     * @param highlight the highlight to set
     */
    public void setHighlight(Color highlight) {
        this.highlight = highlight;
    }
    Vector<JComponent> theComponents;
    private Color background;
    private Color foreground;
    private Color highlight;
    private ViewManager() {
        this.theComponents = new Vector<>();
        foreground=Color.BLACK;
        background=Color.WHITE;
        highlight=new Color(0.5f, 0.5f, 0.0f, 0.7f);
    }
    
    public void register(JComponent c){
    theComponents.add(c);
    }
    
    public void update(){
        for(int i=0;i<theComponents.size();i++){
            theComponents.get(i).setForeground(foreground);
            theComponents.get(i).setBackground(background);
            if(theComponents.get(i).getClass()==QCDesignerPanel.class){
                ((QCDesignerPanel) theComponents.get(i)).setFocuscolor(highlight);            
            }
        }
    }
}
