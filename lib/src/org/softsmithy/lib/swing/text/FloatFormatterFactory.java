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

package org.softsmithy.lib.swing.text;

/**
 *
 * @author  puce
 */
public class FloatFormatterFactory extends RealNumberFormatterFactory {
  
  
  /** Creates a new instance of WholeNumberFormatterFactory */
  public FloatFormatterFactory(FloatFormatter formatter) {
    super(formatter);
  }
  
  
  public FloatFormatter getFloatFormatter(){
    return (FloatFormatter) getRealNumberFormatter();
  }
  

}
