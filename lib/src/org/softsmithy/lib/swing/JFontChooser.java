/*
 * JFontChooser.java
 *
 * Created on 30. September 2002, 15:58
 */

package org.softsmithy.lib.swing;

import java.awt.Component;
import java.awt.Font;
import java.awt.GraphicsEnvironment;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
import org.softsmithy.lib.swing.chooser.*;
import org.softsmithy.lib.util.*;





/**
 * http://java.sun.com/docs/books/tutorial/2d/textandfonts/example-1dot2/FontSelection.java
 * @author  puce
 */
public class JFontChooser extends JPanel {
  private ResourceBundle rb = ResourceBundle.getBundle(getClass().getName(), getLocale());
  private FontChooserDialog chooserDialog = null;
  
  public JFontChooser(){
    this(null);
  }
  /** Creates new form JFontChooser */
  public JFontChooser(Font selectedFont) {
    initComponents();
    GraphicsEnvironment ge = GraphicsEnvironment.getLocalGraphicsEnvironment();
    String envfonts[] = ge.getAvailableFontFamilyNames(getLocale());
    Vector fontNames = new Vector();
    for ( int i = 1; i < envfonts.length; i++ ) {
      fontNames.addElement(envfonts[i]);
    }
    fontsBox.setModel(new DefaultComboBoxModel(fontNames));
    Vector sizes = new Vector();
    for (int i=6; i<=16; i++){
      sizes.add(new Integer(i));
    }
    for (int i=18; i<=28; i+=2){
      sizes.add(new Integer(i));
    }
    for (int i=32; i<=96; i+=4){
      sizes.add(new Integer(i));
    }
    sizesBox.setModel(new DefaultComboBoxModel(sizes));
    sizesBox.setRenderer(new NumberListCellRenderer());
    //sizesBox.setSelectedItem(new Integer(12));
    //sizesBox.setEditable(true);
    Vector styles = new Vector();
    for (Iterator i=FontStyle.VALUES.iterator(); i.hasNext();){
      styles.add(new FontStyleItem(((FontStyle)i.next())));
    }
    stylesBox.setModel(new DefaultComboBoxModel(styles));
    selectFont(selectedFont);
  }
  
  public void selectFont(Font font){
    if (font == null){
      font = getFont();
    }
    setSelectedFont(font);
    fontsBox.setSelectedItem(font.getFamily(getLocale()));
    sizesBox.setSelectedItem(new Integer(font.getSize()));
    stylesBox.setSelectedItem(new FontStyleItem(FontStyle.getFontStyle(font.getStyle())));
  }
  /** This method is called from within the constructor to
   * initialize the form.
   * WARNING: Do NOT modify this code. The content of this method is
   * always regenerated by the Form Editor.
   */
  private void initComponents() {//GEN-BEGIN:initComponents
    java.awt.GridBagConstraints gridBagConstraints;

    fontsLabel = new javax.swing.JLabel();
    sizesLabel = new javax.swing.JLabel();
    stylesLabel = new javax.swing.JLabel();
    fontsBox = new javax.swing.JComboBox();
    sizesBox = new javax.swing.JComboBox();
    stylesBox = new javax.swing.JComboBox();
    previewPane = new javax.swing.JPanel();
    previewLabel = new javax.swing.JLabel();

    setLayout(new java.awt.GridBagLayout());

    fontsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    fontsLabel.setLabelFor(fontsBox);
    fontsLabel.setText(rb.getString("fonts"));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    gridBagConstraints.weightx = 1.0;
    add(fontsLabel, gridBagConstraints);

    sizesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    sizesLabel.setLabelFor(sizesBox);
    sizesLabel.setText(rb.getString("sizes"));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    add(sizesLabel, gridBagConstraints);

    stylesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    stylesLabel.setLabelFor(stylesBox);
    stylesLabel.setText(rb.getString("styles"));
    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 0;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    add(stylesLabel, gridBagConstraints);

    fontsBox.setMaximumRowCount(9);
    fontsBox.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(java.awt.event.ItemEvent evt) {
        fontsBoxItemStateChanged(evt);
      }
    });

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    add(fontsBox, gridBagConstraints);

    sizesBox.setMaximumRowCount(9);
    sizesBox.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(java.awt.event.ItemEvent evt) {
        sizesBoxItemStateChanged(evt);
      }
    });

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 1;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    add(sizesBox, gridBagConstraints);

    stylesBox.addItemListener(new java.awt.event.ItemListener() {
      public void itemStateChanged(java.awt.event.ItemEvent evt) {
        stylesBoxItemStateChanged(evt);
      }
    });

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 2;
    gridBagConstraints.gridy = 1;
    gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
    add(stylesBox, gridBagConstraints);

    previewPane.setLayout(new java.awt.BorderLayout());

    previewPane.setBorder(new javax.swing.border.TitledBorder(rb.getString("preview")));
    previewLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
    previewLabel.setText(rb.getString("previewText"));
    previewPane.add(previewLabel, java.awt.BorderLayout.CENTER);

    gridBagConstraints = new java.awt.GridBagConstraints();
    gridBagConstraints.gridx = 0;
    gridBagConstraints.gridy = 2;
    gridBagConstraints.gridwidth = 3;
    gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
    gridBagConstraints.weightx = 1.0;
    gridBagConstraints.weighty = 1.0;
    add(previewPane, gridBagConstraints);

  }//GEN-END:initComponents
  
  private void stylesBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_stylesBoxItemStateChanged
    if (evt.getStateChange() == ItemEvent.SELECTED) {
      setSelectedFont(selectedFont.deriveFont(((FontStyleItem) evt.getItem()).getFontStyle().getStyle()));
    }
  }//GEN-LAST:event_stylesBoxItemStateChanged
  
  private void sizesBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_sizesBoxItemStateChanged
    if (evt.getStateChange() == ItemEvent.SELECTED) {
      setSelectedFont(selectedFont.deriveFont(((Integer) evt.getItem()).floatValue()));
    }
  }//GEN-LAST:event_sizesBoxItemStateChanged
  
  private void fontsBoxItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_fontsBoxItemStateChanged
    if (evt.getStateChange() == ItemEvent.SELECTED) {
      setSelectedFont(new Font((String) evt.getItem(), selectedFont.getStyle(), selectedFont.getSize()));
    }
  }//GEN-LAST:event_fontsBoxItemStateChanged
  
  /** Getter for property font.
   * @return Value of property font.
   *
   */
  public Font getSelectedFont() {
    return this.selectedFont;
  }
  
  /** Setter for property selectedFont.
   * @param selectedFont New value of property selectedFont.
   *
   */
  private void setSelectedFont(Font selectedFont) {
    this.selectedFont = selectedFont;
    previewLabel.setFont(selectedFont);
  }
  
  public Option showDialog(Component parent) {
    if (chooserDialog == null){
      chooserDialog = new FontChooserDialog(parent);
    }
    return chooserDialog.showUp();
  }
  
  
  // Variables declaration - do not modify//GEN-BEGIN:variables
  private javax.swing.JLabel stylesLabel;
  private javax.swing.JComboBox fontsBox;
  private javax.swing.JComboBox sizesBox;
  private javax.swing.JPanel previewPane;
  private javax.swing.JLabel fontsLabel;
  private javax.swing.JLabel previewLabel;
  private javax.swing.JComboBox stylesBox;
  private javax.swing.JLabel sizesLabel;
  // End of variables declaration//GEN-END:variables
  
  /** Holds value of property selectedFont. */
  private Font selectedFont;
  
  //  private class FontPreviewPanel extends JPanel {
  //
  ////    private Font thisFont;
  //    private String previewText;
  //
  //    public FontPreviewPanel(ResourceBundle rb){
  ////      thisFont = new Font("Arial", Font.PLAIN, 10);
  //      previewText = rb.getString("previewText");
  //    }
  //
  //    // Resets thisFont to the currently selected fontname, size and style attributes.
  ////    public void changeFont(String f, int st, String si){
  ////      Integer newSize = new Integer(si);
  ////      int size = newSize.intValue();
  ////      thisFont = new Font(f, st, size);
  ////      repaint();
  ////    }
  //
  //    public void paintComponent(Graphics g) {
  //      super.paintComponent( g );
  //      Graphics2D g2 = (Graphics2D) g;
  //      int w = getWidth();
  //      int h = getHeight();
  //
  //      g2.setColor(Color.darkGray);
  //      g2.setFont(thisFont);
  //      FontMetrics metrics = g2.getFontMetrics();
  //      int width = metrics.stringWidth( previewText );
  //      int height = metrics.getHeight();
  //      g2.drawString( previewText, w/2-width/2, h/2-height/2 );
  //    }
  //  }
  public abstract static class FontStyle extends TypesafeEnum{
    private FontStyle(String name){
      super(name);
    }
    public abstract int getStyle();
    
    public String toString(ResourceBundle rb){
      return rb.getString("fontStyle."+toString());
    }
    
    public static final FontStyle PLAIN = new FontStyle("plain"){
      public int getStyle(){
        return Font.PLAIN;
      }
    };
    
    public static final FontStyle ITALIC = new FontStyle("italic"){
      public int getStyle(){
        return Font.ITALIC;
      }
    };
    
    public static final FontStyle BOLD = new FontStyle("bold"){
      public int getStyle(){
        return Font.BOLD;
      }
    };
    
    public static final FontStyle BOLD_AND_ITALIC = new FontStyle("boldAndItalic"){
      public int getStyle(){
        return Font.BOLD | Font.ITALIC;
      }
    };
    private static final FontStyle[] PRIVATE_VALUES = {PLAIN, BOLD, ITALIC, BOLD_AND_ITALIC};
    public static final List VALUES = Collections.unmodifiableList(Arrays.asList(PRIVATE_VALUES));
    private static final Map fontStyles = new HashMap();
    static{
      for (int i=0; i<PRIVATE_VALUES.length; i++){
        fontStyles.put(new Integer(PRIVATE_VALUES[i].getStyle()), PRIVATE_VALUES[i]);
      }
    }
    
    public static FontStyle getFontStyle(int fontStyle){
      return (FontStyle) fontStyles.get(new Integer(fontStyle));
    }
  }
  
  private class FontStyleItem{
    
    /** Holds value of property fontStyle. */
    private FontStyle fontStyle;
    
    public FontStyleItem(FontStyle fontStyle){
      this.fontStyle = fontStyle;
    }
    
    /** Getter for property fontStyle.
     * @return Value of property fontStyle.
     *
     */
    public FontStyle getFontStyle() {
      return this.fontStyle;
    }
    
    /** Returns a string representation of the object. In general, the
     * <code>toString</code> method returns a string that
     * "textually represents" this object. The result should
     * be a concise but informative representation that is easy for a
     * person to read.
     * It is recommended that all subclasses override this method.
     * <p>
     * The <code>toString</code> method for class <code>Object</code>
     * returns a string consisting of the name of the class of which the
     * object is an instance, the at-sign character `<code>@</code>', and
     * the unsigned hexadecimal representation of the hash code of the
     * object. In other words, this method returns a string equal to the
     * value of:
     * <blockquote>
     * <pre>
     * getClass().getName() + '@' + Integer.toHexString(hashCode())
     * </pre></blockquote>
     *
     * @return  a string representation of the object.
     *
     */
    public String toString() {
      return fontStyle.toString(rb);
    }
    
  }
  
  public class FontChooserDialog extends JChooser{
    
    private Option option = Option.CANCEL;
    private Font initialFont;
    
    public FontChooserDialog(Component parent){
      super(parent, rb.getString("title"), true, JFontChooser.this);
      try{
        JButton okButton = XActions.createButton(XActions.createXAction("ok", this, rb), IconType.NO_ICON, true);
        JButton cancelButton = XActions.createButton(XActions.createXAction("cancel", this, rb), IconType.NO_ICON, true);
        JButton resetButton = XActions.createButton(XActions.createXAction("reset", this, rb), IconType.NO_ICON, true);
        setButtons(new JButton[]{okButton, cancelButton, resetButton}, okButton);
      } catch(NoSuchMethodException e){
        e.printStackTrace();
      }
    }
    public void ok(ActionEvent e){
      hide();
      option = Option.APPROVE;
    }
    
    public void cancel(ActionEvent e){
      hide();
      option = Option.CANCEL;
    }
    
    public void reset(ActionEvent e){
      selectFont(initialFont);
    }
    
    public Option showUp(){
      initialFont = JFontChooser.this.getFont();
      super.show();
      return option;
    }
  }
}
