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
 * CustomizerEvent.java
 *
 * Created on 30. August 2002, 15:42
 */

package org.softsmithy.lib.swing.event;

import java.util.*;

/**
 *
 * @author  puce
 */
public class CustomizerEvent extends EventObject {
  
  /** Holds value of property dx. */
  private int dx;
  
  /** Holds value of property dy. */
  private int dy;
  
  /** Holds value of property dwidth. */
  private int dwidth;
  
  /** Holds value of property dheight. */
  private int dheight;
  
  /** Creates a new instance of CustomizerEvent */
  public CustomizerEvent(Object source, int dx, int dy, int dwidth, int dheight) {
    super(source);
    this.dx = dx;
    this.dy = dy;
    this.dwidth = dwidth;
    this.dheight = dheight;
  }
  
  /** Getter for property dx.
   * @return Value of property dx.
   *
   */
  public int getDx() {
    return this.dx;
  }
  
  /** Getter for property dy.
   * @return Value of property dy.
   *
   */
  public int getDy() {
    return this.dy;
  }
  
  /** Getter for property dwidth.
   * @return Value of property dwidth.
   *
   */
  public int getDwidth() {
    return this.dwidth;
  }
  
  /** Getter for property dheight.
   * @return Value of property dheight.
   *
   */
  public int getDheight() {
    return this.dheight;
  }
  
  //      public JCustomizer getCustomizer() {
  //        return (source instanceof JCustomizer) ? (JCustomizer)source : null;
  //    }
}