
package org.softsmithy.lib.swing.text;

import java.util.*;
import javax.swing.*;
import javax.swing.*;

/**
 *
 * @author  puce
 */
public class WholeNumberFormatterFactory extends AbstractXNumberFormatterFactory {
  
  /** Holds value of property locale. */
  private Locale locale;
  
  /** Creates a new instance of WholeNumberFormatterFactory */
  public WholeNumberFormatterFactory(WholeNumberFormatter formatter) {
    this(formatter, Locale.getDefault());
  }
  
  public WholeNumberFormatterFactory(WholeNumberFormatter formatter, Locale locale) {
    super(formatter);
    setLocale(locale);
  }
  
  public WholeNumberFormatter getWholeNumberFormatter(){
    return (WholeNumberFormatter) getAbstractXNumberFormatter();
  }
  
  /** Getter for property locale.
   * @return Value of property locale.
   *
   */
  public Locale getLocale() {
    return this.locale;
  }
  
  /** Setter for property locale.
   * @param locale New value of property locale.
   *
   */
  public void setLocale(Locale locale) {
    this.locale = locale;
    getWholeNumberFormatter().setLocale(locale);
  }
  
  
}
