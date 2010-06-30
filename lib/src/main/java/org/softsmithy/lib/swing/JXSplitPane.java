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
 * JXSplitPane.java
 *
 * Created on 6. Mai 2003, 09:05
 */

package org.softsmithy.lib.swing;

import java.awt.*;
import javax.swing.*;
import org.softsmithy.lib.swing.style.*;


/**
 *
 * @author  puce
 */
public class JXSplitPane extends JSplitPane implements Styleable{
  
  /** Holds value of property noneStyle. */
  private final Style noneStyle = new NoneStyle(this);
  
  /** Holds value of property parentStyle. */
  private final Style parentStyle = new ParentStyle(this);
  
  /** Holds value of property style. */
  private Style style = noneStyle;
  
  private boolean inited = false;
  
  public JXSplitPane(){
    inited = true;
  }
  
  public JXSplitPane(int newOrientation){
    super(newOrientation);
    inited = true;
  }
  
  public JXSplitPane(int newOrientation, boolean newContinuousLayout){
    super(newOrientation, newContinuousLayout);
    inited = true;
  }
  
  public JXSplitPane(int newOrientation, boolean newContinuousLayout, Component newLeftComponent, Component newRightComponent){
    super(newOrientation, newContinuousLayout, newLeftComponent, newRightComponent);
    inited = true;
  }
  
  public JXSplitPane(int newOrientation, Component newLeftComponent, Component newRightComponent){
    super(newOrientation, newLeftComponent, newRightComponent);
    inited = true;
  }
  
  
  /** Getter for property style.
   * @return Value of property style.
   *
   */
  public Style getStyle() {
    return this.style;
  }
  
    /** Setter for property style.
   * @param style New value of property style.
   *
   */
  public void setStyle(Style style) {
    Style oldStyle = this.style;
    this.style = Styles.mutateStyle(this, style);
    Styles.applyStyle(this, oldStyle, this.style);
    firePropertyChange("style", oldStyle, this.style);
  }
  
  /** Getter for property noneStyle.
   * @return Value of property noneStyle.
   *
   */
  public Style getNoneStyle() {
    return this.noneStyle;
  }
  
  /** Getter for property parentStyle.
   * @return Value of property parentStyle.
   *
   */
  public Style getParentStyle() {
    return this.parentStyle;
  }
  
  /** Gets the background color of this component.
   * @return this component's background color; if this component does
   * 		not have a background color,
   * 		the background color of its parent is returned
   * @see #setBackground
   * @since JDK1.0
   *
   */
  @Override
  public Color getBackground() {
    return Styles.getBackground(this, inited);
    //return (fComponent != null) ? fComponent.getBackground() : super.getBackground();
  }
  
  /** Sets the background color of this component.
   *
   * @param bg the desired background <code>Color</code>
   * @see java.awt.Component#getBackground
   *
   * @beaninfo
   *    preferred: true
   *        bound: true
   *    attribute: visualUpdate true
   *  description: The background color of the component.
   *
   */
  @Override
  public void setBackground(Color bg) {
    Styles.setBackground(this, bg, inited);
  }
  
  public void setDefaultBackground(Color bg){
    super.setBackground(bg);
  }
  
  /** Gets the foreground color of this component.
   * @return this component's foreground color; if this component does
   * not have a foreground color, the foreground color of its parent
   * is returned
   * @see #setForeground
   * @since JDK1.0
   * @beaninfo
   *       bound: true
   *
   */
  @Override
  public Color getForeground() {
    return Styles.getForeground(this, inited);
    //return (fComponent != null) ? fComponent.getForeground() : super.getForeground();
  }
  
  
  /** Sets the foreground color of this component.
   *
   * @param fg  the desired foreground <code>Color</code>
   * @see java.awt.Component#getForeground
   *
   * @beaninfo
   *    preferred: true
   *        bound: true
   *    attribute: visualUpdate true
   *  description: The foreground color of the component.
   *
   */
  @Override
  public void setForeground(Color fg) {
    Styles.setForeground(this, fg, inited);
  }
  
  public void setDefaultForeground(Color fg){
    super.setForeground(fg); // to update listeners etc.
  }
  
  /** Gets the font of this component.
   * @return this component's font; if a font has not been set
   * for this component, the font of its parent is returned
   * @see #setFont
   * @since JDK1.0
   *
   */
  @Override
  public Font getFont() {
    return Styles.getFont(this, inited);
    //return (fComponent != null) ? fComponent.getFont() : super.getFont();
  }
  
  /** Sets the font for this component.
   *
   * @param the desired <code>Font</code> for this component
   * @see java.awt.Component#getFont
   *
   * @beaninfo
   *    preferred: true
   *        bound: true
   *    attribute: visualUpdate true
   *  description: The font for the component.
   *
   */
  @Override
  public void setFont(Font font) {
    Styles.setFont(this, font, inited);
  }
  
  public void setDefaultFont(Font font){
    super.setFont(font);
  }
  
  /** Returns true if this component is completely opaque.
   * <p>
   * An opaque component paints every pixel within its
   * rectangular bounds. A non-opaque component paints only a subset of
   * its pixels or none at all, allowing the pixels underneath it to
   * "show through".  Therefore, a component that does not fully paint
   * its pixels provides a degree of transparency.
   * <p>
   * Subclasses that guarantee to always completely paint their contents
   * should override this method and return true.
   *
   * @return true if this component is completely opaque
   * @see #setOpaque
   *
   */
  @Override
  public boolean isOpaque() {
    return Styles.isOpaque(this, inited);
    //return (fComponent != null) ? fComponent.isOpaque() : super.isOpaque();
  }
  
  /** If true the component paints every pixel within its bounds.
   * Otherwise, the component may not paint some or all of its
   * pixels, allowing the underlying pixels to show through.
   * <p>
   * The default value of this property is false for <code>JComponent</code>.
   * However, the default value for this property on most standard
   * <code>JComponent</code> subclasses (such as <code>JButton</code> and
   * <code>JTree</code>) is look-and-feel dependent.
   *
   * @param isOpaque  true if this component should be opaque
   * @see #isOpaque
   * @beaninfo
   *        bound: true
   *       expert: true
   *  description: The component's opacity
   *
   */
  @Override
  public void setOpaque(boolean isOpaque) {
    Styles.setOpaque(this, isOpaque, inited);
  }
  
  
  
  public void setDefaultOpaque(boolean isOpaque){
    super.setOpaque(isOpaque);
  }
  
  public Color getDefaultBackground() {
    return super.getBackground();
  }  
  
  public Font getDefaultFont() {
    return super.getFont();
  }  
  
  public Color getDefaultForeground() {
    return super.getForeground();
  }
  
  public boolean isDefaultOpaque() {
    return super.isOpaque();
  }
  
}