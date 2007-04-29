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
public class CustomizerPropertyTableSample extends javax.swing.JFrame {
    
    /** Creates new form SimpleSingleCustomizerSample */
    public CustomizerPropertyTableSample() {
        initComponents();
        // create a CustomizerLayout
        InfiniteTableLayout itl = new InfiniteTableLayout(10, 10, customizerPane);
        // set the layout
        customizerPane.setCustomizerLayout(itl);
        // create a JCustomizer that wraps a component and listens to mouse events
        JCustomizer simpleCustomizer = new JCustomizer(new JLabel("A Simple Component"));
        // add it to the JCustomizerPane
        customizerPane.addCustomizer(simpleCustomizer, new AbsoluteTableConstraints(50, 50, 150, 50, simpleCustomizer, itl));
        customizerPane.getSelectionManager().addCustomizerSelectionListener(customizerPropertyTable);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        jSplitPane1 = new javax.swing.JSplitPane();
        jScrollPane1 = new javax.swing.JScrollPane();
        customizerPropertyTable = new org.softsmithy.lib.swing.JCustomizerPropertyTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        customizerPane = new org.softsmithy.lib.swing.JCustomizerPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("A Customizer Property Table Sample");
        jSplitPane1.setDividerLocation(304);
        jSplitPane1.setResizeWeight(1.0);
        jScrollPane1.setViewportView(customizerPropertyTable);

        jSplitPane1.setRightComponent(jScrollPane1);

        jScrollPane2.setViewportView(customizerPane);

        jSplitPane1.setLeftComponent(jScrollPane2);

        getContentPane().add(jSplitPane1, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CustomizerPropertyTableSample().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.softsmithy.lib.swing.JCustomizerPane customizerPane;
    private org.softsmithy.lib.swing.JCustomizerPropertyTable customizerPropertyTable;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JSplitPane jSplitPane1;
    // End of variables declaration//GEN-END:variables
    
}