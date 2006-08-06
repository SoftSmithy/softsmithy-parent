/*
 *                  Sun Public License Notice
 *
 * The contents of this file are subject to the Sun Public License
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. A copy of the License is available at
 * http://www.sun.com/
 *
 * The Original Code is Examples of SoftSmithy Utility Library. The Initial Developer of the
 * Original Code is Florian Brunner (Sourceforge.net user: puce). All Rights Reserved.
 *
 * Contributor(s): .
 */

/*
 * Example1.java
 *
 * Created on 9. M�rz 2003, 18:23
 */

package examples.swing.customizer;

import java.awt.Color;
import java.awt.geom.*;
import java.io.*;
import java.util.*;
import javax.imageio.*;
import javax.swing.*;
import org.softsmithy.lib.awt.*;
import org.softsmithy.lib.awt.layout.*;
import org.softsmithy.lib.swing.*;




/**
 *
 * @author  puce
 */
public class MultiExamplePane2 extends JPanel {
  
  /** Creates new form Example1 */
  public MultiExamplePane2() {
    // create a pane that supports customizers and "snap-to-grid" feature
    initComponents();
    // create a CustomizerLayout (here: InfiniteTableLayout); use the default grid size
    InfiniteTableLayout itl = new InfiniteTableLayout(pane);
    // set the layout
    pane.setCustomizerLayout(itl);
    
    //create and configure a customizer for a simple component
    JCustomizer simpleCustomizer = new JCustomizer(new JLabel("A Simple Component"));
    simpleCustomizer.setCustomizableProperties(new LinkedHashSet(Arrays.asList(new String[] {"x", "y", "width", "height"}))); // to allow SelectionManager to listen for these properties
    pane.addCustomizer(simpleCustomizer, new AbsoluteTableConstraints(0, 0, 140, 20, simpleCustomizer, itl));
    
    //create and configure an editable customizer for a label
    JLabelCustomizer labelCustomizer = new JLabelCustomizer("A Label Customizer - double click to edit!");
    labelCustomizer.setCustomizableProperties(new LinkedHashSet(Arrays.asList(new String[] {"x", "y", "width", "height"}))); // to allow SelectionManager to listen for these properties
    pane.addCustomizer(labelCustomizer, new AbsoluteTableConstraints(50, 50, 270, 20, labelCustomizer, itl));
    
    //create and configure a customizer for a shape
    JShapeCustomizer starCustomizer = new JShapeCustomizer(new Star(0, 0, 100, 100));
    //starCustomizer.setFilled(true);
    //starCustomizer.setOpaque(false);
    starCustomizer.setForeground(Color.YELLOW);
    starCustomizer.setCustomizableProperties(new LinkedHashSet(Arrays.asList(new String[] {"x", "y", "width", "height"}))); // to allow SelectionManager to listen for these properties
    pane.addCustomizer(starCustomizer, new AbsoluteTableConstraints(200, 100, 100, 100, starCustomizer, itl));
    
    JShapeCustomizer ellipseCustomizer = new JShapeCustomizer(new Ellipse2D.Float(0, 0, 100, 100));
    ellipseCustomizer.setFilled(true);
    ellipseCustomizer.setOpaque(false);
    ellipseCustomizer.setForeground(Color.BLUE);
    ellipseCustomizer.setCustomizableProperties(new LinkedHashSet(Arrays.asList(new String[] {"x", "y", "width", "height"}))); // to allow SelectionManager to listen for these properties
    pane.addCustomizer(ellipseCustomizer, new AbsoluteTableConstraints(0, 150, 100, 100, ellipseCustomizer, itl));
    
    try{
      JImageCustomizer logoCustomizer = new JImageCustomizer();
      logoCustomizer.setSize(197, 167);
      logoCustomizer.setImage(ImageIO.read(new File("logo.jpg"))); //getImage(new URL(getDocumentBaseDir() + "logo.jpg")));
      logoCustomizer.setCustomizableProperties(new LinkedHashSet(Arrays.asList(new String[] {"x", "y", "width", "height"}))); // to allow SelectionManager to listen for these properties
      pane.addCustomizer(logoCustomizer, new AbsoluteTableConstraints(350, 250, 197, 167, logoCustomizer, itl));
    } catch(Exception ex){
      ex.printStackTrace();
    }
    validate();
  }
  
  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
  private void initComponents() {//GEN-BEGIN:initComponents
    pane = new org.softsmithy.lib.swing.JCustomizerPane();

    setLayout(new java.awt.BorderLayout());

    add(pane, java.awt.BorderLayout.CENTER);

  }//GEN-END:initComponents
  
  
  
  
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private org.softsmithy.lib.swing.JCustomizerPane pane;
  // End of variables declaration//GEN-END:variables
  
}
