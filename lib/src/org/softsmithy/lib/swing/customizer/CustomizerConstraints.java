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
 * CustomizerConstraints.java
 *
 * Created on 2. September 2002, 16:18
 */

package org.softsmithy.lib.swing.customizer;

import java.awt.*;
//import org.softsmithy.lib.awt.layout.*;

/**
 *
 * @author  puce
 */
public interface CustomizerConstraints{
  
    Rectangle getAbsoluteBounds();
    void setAbsoluteBounds(Rectangle bounds);//, CustomizerLayout cm);
  
}
