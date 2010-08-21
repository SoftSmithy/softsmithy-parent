package samples.swing.number;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Locale;
import org.softsmithy.lib.swing.text.DoubleFormatter;
import org.softsmithy.lib.swing.text.DoubleFormatterFactory;
import org.softsmithy.lib.swing.text.FloatFormatter;
import org.softsmithy.lib.swing.text.FloatFormatterFactory;
import org.softsmithy.lib.swing.text.RealNumberFormatter;
import org.softsmithy.lib.swing.text.RealNumberFormatterFactory;
/*
 * NumberFieldsSample.java
 *
 * Created on 7. Oktober 2006, 17:53
 */

/**
 *
 * @author  puce
 */
public class NumberFieldsSample extends javax.swing.JFrame {
    
    /** Creates new form NumberFieldsSample */
    public NumberFieldsSample() {
        initComponents();
        jRealNumberField1.setRealNumberFormatterFactory(new RealNumberFormatterFactory(new RealNumberFormatter(NumberFormat.getCurrencyInstance())));
        jFloatField1.setFloatFormatterFactory(new FloatFormatterFactory(new FloatFormatter(NumberFormat.getPercentInstance())));
        DecimalFormat format = new DecimalFormat("#,##0.00000");
        jDoubleField1.setDoubleFormatterFactory(new DoubleFormatterFactory(new DoubleFormatter(format)));
        setSize(400, 300);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jWholeNumberField1 = new org.softsmithy.lib.swing.JWholeNumberField();
        jByteField1 = new org.softsmithy.lib.swing.JByteField();
        jShortField1 = new org.softsmithy.lib.swing.JShortField();
        jIntegerField1 = new org.softsmithy.lib.swing.JIntegerField();
        jLongField1 = new org.softsmithy.lib.swing.JLongField();
        jRealNumberField1 = new org.softsmithy.lib.swing.JRealNumberField();
        jFloatField1 = new org.softsmithy.lib.swing.JFloatField();
        jDoubleField1 = new org.softsmithy.lib.swing.JDoubleField();
        jLocalizedRealNumberField1 = new org.softsmithy.lib.swing.JLocalizedRealNumberField();
        jLocalizedFloatField1 = new org.softsmithy.lib.swing.JLocalizedFloatField();
        jLocalizedDoubleField1 = new org.softsmithy.lib.swing.JLocalizedDoubleField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Number Fields Sample");
        getContentPane().setLayout(new java.awt.GridBagLayout());

        jLabel1.setLabelFor(jWholeNumberField1);
        jLabel1.setText("Whole Number (BigInteger): ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        getContentPane().add(jLabel1, gridBagConstraints);

        jLabel2.setLabelFor(jByteField1);
        jLabel2.setText("Byte: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        getContentPane().add(jLabel2, gridBagConstraints);

        jLabel3.setLabelFor(jShortField1);
        jLabel3.setText("Short: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        getContentPane().add(jLabel3, gridBagConstraints);

        jLabel4.setLabelFor(jIntegerField1);
        jLabel4.setText("Integer: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        getContentPane().add(jLabel4, gridBagConstraints);

        jLabel5.setLabelFor(jLongField1);
        jLabel5.setText("Long: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        getContentPane().add(jLabel5, gridBagConstraints);

        jLabel6.setLabelFor(jRealNumberField1);
        jLabel6.setText("Real Number (BigDecimal): ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 5;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        getContentPane().add(jLabel6, gridBagConstraints);

        jLabel7.setLabelFor(jFloatField1);
        jLabel7.setText("Float: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        getContentPane().add(jLabel7, gridBagConstraints);

        jLabel8.setLabelFor(jDoubleField1);
        jLabel8.setText("Double: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 7;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        getContentPane().add(jLabel8, gridBagConstraints);

        jLabel9.setLabelFor(jLocalizedRealNumberField1);
        jLabel9.setText("Localized Real Number (BigDecimal): ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 8;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        getContentPane().add(jLabel9, gridBagConstraints);

        jLabel10.setLabelFor(jLocalizedFloatField1);
        jLabel10.setText("Localized Float: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 9;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        getContentPane().add(jLabel10, gridBagConstraints);

        jLabel11.setLabelFor(jLocalizedDoubleField1);
        jLabel11.setText("Localized Double: ");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        getContentPane().add(jLabel11, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weightx = 1.0;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jWholeNumberField1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 1;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jByteField1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jShortField1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jIntegerField1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jLongField1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 5;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jRealNumberField1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jFloatField1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 7;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jDoubleField1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 8;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jLocalizedRealNumberField1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 9;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jLocalizedFloatField1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.weighty = 1.0;
        getContentPane().add(jLocalizedDoubleField1, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // Locale.setDefault(Locale.US); // throws java.security.AccessControlException when executed via Java WebStart
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NumberFieldsSample().setVisible(true);
            }
        });
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private org.softsmithy.lib.swing.JByteField jByteField1;
    private org.softsmithy.lib.swing.JDoubleField jDoubleField1;
    private org.softsmithy.lib.swing.JFloatField jFloatField1;
    private org.softsmithy.lib.swing.JIntegerField jIntegerField1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private org.softsmithy.lib.swing.JLocalizedDoubleField jLocalizedDoubleField1;
    private org.softsmithy.lib.swing.JLocalizedFloatField jLocalizedFloatField1;
    private org.softsmithy.lib.swing.JLocalizedRealNumberField jLocalizedRealNumberField1;
    private org.softsmithy.lib.swing.JLongField jLongField1;
    private org.softsmithy.lib.swing.JRealNumberField jRealNumberField1;
    private org.softsmithy.lib.swing.JShortField jShortField1;
    private org.softsmithy.lib.swing.JWholeNumberField jWholeNumberField1;
    // End of variables declaration//GEN-END:variables
    
}
