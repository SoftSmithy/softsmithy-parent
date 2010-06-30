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

import javax.swing.*;

/**
 *
 * @author  puce
 */
public class AbstractXNumberFormatterFactory extends JFormattedTextField.AbstractFormatterFactory {
  
  private final AbstractXNumberFormatter formatter;
  
  /** Creates a new instance of WholeNumberFormatterFactory */
  public AbstractXNumberFormatterFactory(AbstractXNumberFormatter formatter) {
     this.formatter = formatter;
  }
  
  public JFormattedTextField.AbstractFormatter getFormatter(JFormattedTextField tf) {
    return getAbstractXNumberFormatter();
  }
  
  public AbstractXNumberFormatter getAbstractXNumberFormatter(){
    return formatter;
  }
  

}