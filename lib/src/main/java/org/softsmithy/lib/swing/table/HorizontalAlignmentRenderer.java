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
 * HorizontalAlignmentCellRenderer.java
 *
 * Created on 7. Oktober 2002, 22:32
 */
package org.softsmithy.lib.swing.table;

import java.util.*;
import javax.swing.table.*;
import org.softsmithy.lib.swing.*;

/**
 *
 * @author  puce
 */
public class HorizontalAlignmentRenderer extends DefaultTableCellRenderer {

    /** Holds value of property locale. */
    private Locale locale;

    /** Creates a new instance of HorizontalAlignmentCellRenderer */
    public HorizontalAlignmentRenderer(Locale locale) {
        this.locale = locale;
    }

    /** Sets the <code>String</code> object for the cell being rendered to
     * <code>value</code>.
     *
     * @param value  the string value for this cell; if value is
     * 		<code>null</code> it sets the text value to an empty string
     * @see JLabel#setText
     *
     *
     */
    @Override
    protected void setValue(Object value) {
        super.setValue(((HorizontalAlignment) value).getDisplayString(getLocale()));
    }

    /** Getter for property locale.
     * @return Value of property locale.
     *
     */
    @Override
    public Locale getLocale() {
        return this.locale;
    }

    /** Setter for property locale.
     * @param locale New value of property locale.
     *
     */
    @Override
    public void setLocale(Locale locale) {
        this.locale = locale;
    }
}