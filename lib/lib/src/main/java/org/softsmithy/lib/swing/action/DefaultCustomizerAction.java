/*
 *         COMMON DEVELOPMENT AND DISTRIBUTION LICENSE (CDDL) Notice
 *
 * The contents of this file are subject to the COMMON DEVELOPMENT AND DISTRIBUTION LICENSE (CDDL)
 * Version 1.0 (the "License"); you may not use this file except in
 * compliance with the License. A copy of the License is available at
 * http://www.opensource.org/licenses/cddl1.txt
 *
 * The Original Code is SoftSmithy Utility Library. The Initial Developer of the
 * Original Code is Florian Brunner (Sourceforge.net user: puce). All Rights Reserved.
 *
 * Contributor(s): .
 */

/*
 * DefaultCustomizerAction.java
 *
 * Created on 23. Juni 2004, 18:47
 */

package org.softsmithy.lib.swing.action;

import java.util.*;

/**
 *
 * @author  puce
 */
public class DefaultCustomizerAction extends DefaultXAction implements CustomizerAction{
  
  /**
   * Holds value of property neededCustomizableProperties.
   */
  private Set neededCustomizableProperties;
  
  /** Creates a new instance of DefaultCustomizerAction */
  public DefaultCustomizerAction() {
    this(Collections.EMPTY_SET);
  }
  
  public DefaultCustomizerAction(Set neededCustomizableProperties) {
    setNeededCustomizableProperties(neededCustomizableProperties);
  }
  
  /**
   * Getter for property neededCustomizableProperties.
   * @return Value of property neededCustomizableProperties.
   */
  public Set getNeededCustomizableProperties() {
    return this.neededCustomizableProperties;
  }
  
  /**
   * Setter for property neededCustomizableProperties.
   * @param neededCustomizableProperties New value of property neededCustomizableProperties.
   */
  public void setNeededCustomizableProperties(Set neededCustomizableProperties) {
    this.neededCustomizableProperties = neededCustomizableProperties;
  }
  
}