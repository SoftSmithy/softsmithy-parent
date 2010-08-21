/*
 *                  Sun Public License Notice
 *
 * The contents of this file are subject to the Sun Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. A copy of the License is available at
 * http://www.sun.com/
 *
 * The Original Code is SoftSmithy Utility Library. The Initial Developer of the
 * Original Code is Florian Brunner (Sourceforge.net user: puce). All Rights Reserved.
 *
 * Contributor(s): .
 */

/*
 * SimpleSingleCustomizerSample.java
 *
 * Created on 29. Juni 2006, 20:29
 */

package samples.swing.customizer;

import javax.swing.JLabel;
import org.softsmithy.lib.awt.layout.AbsoluteTableConstraints;
import org.softsmithy.lib.awt.layout.InfiniteTableLayout;
import org.softsmithy.lib.swing.JCustomizer;
import org.softsmithy.lib.swing.JCustomizerPane;

/**
 *
 * @author  florian.brunner
 */
public class SimpleSingleCustomizerSample extends javax.swing.JFrame {
    
    /** Creates new form SimpleSingleCustomizerSample */
    public SimpleSingleCustomizerSample() {
        initComponents();
         // create a pane that supports customizers and "snap-to-grid" feature
        JCustomizerPane pane = new JCustomizerPane();
        // create a CustomizerLayout
        InfiniteTableLayout itl = new InfiniteTableLayout(50, 50, pane);
        // set the layout
        pane.setCustomizerLayout(itl);
        // create a JCustomizer that wraps a component and listens to mouse events
        JCustomizer simpleCustomizer = new JCustomizer(new JLabel("A Simple Component"));
        // add it to the JCustomizerPane
        pane.addCustomizer(simpleCustomizer, new AbsoluteTableConstraints(50, 50, 150, 50, simpleCustomizer, itl));
        getContentPane().add(pane);
        setSize(500,  300);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("A Simple Single Customizer Sample");

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SimpleSingleCustomizerSample().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
    
}
