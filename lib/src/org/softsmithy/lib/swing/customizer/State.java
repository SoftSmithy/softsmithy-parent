package puce.swing.customizer;

import java.awt.Cursor;
import java.awt.event.FocusEvent;
import java.awt.event.MouseEvent;
import puce.swing.JCustomizer;
import puce.swing.JCustomizerPane;


public interface State {

  void mouseMoved(MouseEvent e);
  void mouseDragged(MouseEvent e);

  void applyCursor();

  void focusGained(FocusEvent e);

  void mousePressed(MouseEvent e);

  void mouseClicked(MouseEvent e);

  void focusLost(FocusEvent e);

  JCustomizer getCustomizer();

  void mouseReleased(MouseEvent e);

  void mouseExited(MouseEvent e);

  void configureCustomizer();
  void unconfigureCustomizer();

  void applyBorder();


  void mouseEntered(MouseEvent e);


}