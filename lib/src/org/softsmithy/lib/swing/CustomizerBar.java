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
 * CustomizerBar.java
 *
 * Created on 11. September 2002, 16:47
 */

package org.softsmithy.lib.swing;

import java.awt.*;

/**
 *
 * @author  puce
 */
public interface CustomizerBar {
  void consumeSelection(JCustomizerPane pane, Point point);
  boolean hasSelection();
  void clearSelection();
}
