/*
 * JXScrollPane.java
 *
 * Created on 31. Juli 2003, 16:29
 */

package org.softsmithy.lib.swing;

import java.awt.*;
import javax.swing.*;

/**
 *
 * @author  puce
 */
public class JXScrollPane extends JScrollPane {
  
  
  public JXScrollPane(){
    super();
  }
  
  public JXScrollPane(Component view){
    super(view);
  }
  
  public JXScrollPane(Component view, int vsbPolicy, int hsbPolicy){
    super(view, vsbPolicy, hsbPolicy);
  }
  
  public JXScrollPane(int vsbPolicy, int hsbPolicy){
    super(vsbPolicy, hsbPolicy);
  }
  
  protected JViewport createViewport() {
    return new JXViewport();
  }
  
  public void setViewport(JViewport viewport) {
    if (! (viewport instanceof JXViewport)){
      throw new IllegalArgumentException("viewport must be an instance of JXViewport!");
    }
    super.setViewport(viewport);
  }
  
  public JXViewport getXViewport(){
    return (JXViewport) getViewport();
  }
  
  
  /** Getter for property viewportViewGlassed.
   * @return Value of property viewportViewGlassed.
   *
   */
  public boolean isViewportViewGlassed() {
    return getXViewport().isViewGlassed();
  }
  
  /** Setter for property viewportViewGlassed.
   * @param viewportViewGlassed New value of property viewportViewGlassed.
   *
   */
  public void setViewportViewGlassed(boolean viewportViewGlassed) {
    boolean oldViewportViewGlassed = isViewportViewGlassed();
    getXViewport().setViewGlassed(viewportViewGlassed);
    firePropertyChange("viewportViewGlassed", oldViewportViewGlassed, viewportViewGlassed);
  }
  
  /** Getter for property viewportViewGlassPane.
   * @return Value of property viewportViewGlassPane.
   *
   */
  public JComponent getViewportViewGlassPane() {
    return getXViewport().getViewGlassPane();
  }
  
  /** Setter for property viewportViewGlassPane.
   * @param viewportViewGlassPane New value of property viewportViewGlassPane.
   *
   */
  public void setViewportViewGlassPane(JComponent viewportViewGlassPane) {
    JComponent oldViewportViewGlassPane = getViewportViewGlassPane();
    getXViewport().setViewGlassPane(viewportViewGlassPane);
    firePropertyChange("viewportViewGlassPane", oldViewportViewGlassPane, viewportViewGlassPane);
  }
  
  public void setViewportView(Component view) {
    setViewportViewComponent(view);
  }
  
  public void setViewportViewComponent(Component view) {
    if (getViewport() == null) {
      setViewport(createViewport());
    }
    getXViewport().setViewComponent(view);
  }
  
}
