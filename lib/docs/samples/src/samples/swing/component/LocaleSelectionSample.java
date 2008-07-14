/*
 * LocaleSelectionSample.java
 *
 * Created on 11. August 2007, 18:48
 */

package samples.swing.component;

import java.util.Locale;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JComponent;
import javax.swing.SwingUtilities;
import org.softsmithy.lib.swing.LocaleCellRenderer;
import org.softsmithy.lib.swing.XDefaultListCellRenderer;
import org.softsmithy.lib.util.LocaleLocalizer;
import org.softsmithy.lib.util.Localizables;


/**
 *
 * @author  puce
 */
public class LocaleSelectionSample extends javax.swing.JFrame {
    
    private Locale currentLocale = Locale.ENGLISH;
    private final Locale[] supportedLocales;
    private final LocaleLocalizer localeDisplay = LocaleLocalizer.NAME;
    
    /** Creates new form LocaleSelectionSample */
    public LocaleSelectionSample() {
        initComponents();
        
        supportedLocales = Locale.getAvailableLocales();
        
        localeBox.setRenderer(new XDefaultListCellRenderer(new LocaleCellRenderer(localeDisplay)));
        
        updateLocale();
        updateModel();
        
        setSize(350, 250);
    }
    
    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">//GEN-BEGIN:initComponents
    private void initComponents() {
        localeBox = new javax.swing.JComboBox();

        getContentPane().setLayout(new java.awt.GridBagLayout());

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        localeBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                localeBoxActionPerformed(evt);
            }
        });

        getContentPane().add(localeBox, new java.awt.GridBagConstraints());

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void localeBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_localeBoxActionPerformed
        currentLocale = (Locale) localeBox.getSelectedItem();
        updateLocale();
        updateModel();
    }//GEN-LAST:event_localeBoxActionPerformed
    
    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LocaleSelectionSample().setVisible(true);
            }
        });
    }
    
    private void updateLocale() {
        //Locale.setDefault(currentLocale);
        JComponent.setDefaultLocale(currentLocale);
        SwingUtilities.updateComponentTreeUI(this);
    }
    
    private void updateModel() {
        Localizables.sort(localeDisplay, currentLocale, supportedLocales);
        ComboBoxModel model = new DefaultComboBoxModel(supportedLocales);
        model.setSelectedItem(currentLocale);
        localeBox.setModel(model);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox localeBox;
    // End of variables declaration//GEN-END:variables
    
}
