

package org.appdapter.gui.swing;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;

import javax.swing.Icon;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * A button showing an arrow point right, left, up, or down.
 */
public class ArrowButton extends JButton {
  public static final int RIGHT = 0;
  public static final int LEFT = 1;
  public static final int UP = 2;
  public static final int DOWN = 3;

  private static final int ICON_MARGIN = 10;
  Dimension iconDimension = new Dimension(50, 50);
  int dir;
  Icon inIcon;
  Icon outIcon;

  public static void main(String[] args) {
    JFrame frame = new JFrame("Test");
    frame.getContentPane().setLayout(new FlowLayout());
    frame.getContentPane().add(new ArrowButton(Color.black, Color.blue, UP));
    frame.getContentPane().add(new ArrowButton(Color.black, Color.blue, RIGHT));
    frame.setSize(100, 100);
    frame.show();
  }

  /**
   * Creates an arrow button pointing up
   */
  public ArrowButton() {
    this(Color.black, Color.blue, UP);
  }

  /**
   * Creates an arrow button pointing in the given direction
   */
  public ArrowButton(Color outColor, Color inColor, int direction) {
    inIcon = new ArrowIcon(inColor);
    outIcon = new ArrowIcon(outColor);
    this.dir = direction;
    setIcon(outIcon);
    setPressedIcon(inIcon);
  }

  @Override
public Dimension getPreferredSize() {
    return new Dimension(iconDimension.width + ICON_MARGIN, iconDimension.height + ICON_MARGIN);
  }


 @Override
public boolean isFocusTraversable() {
  return false;
 }

  class ArrowIcon implements Icon {
    int width = 10;
    int height = 10;
    Color color;

    public ArrowIcon(Color color) {
      this.color = color;
    }

    @Override
	public void paintIcon(Component c, Graphics g, int x, int y) {
      g.setColor(color);
      int x1, y1, x2, y2, x3, y3;
      int w1 = 0;
      int w2 = getWidth() - 0;
      int h1 =  0;
      int h2 = getHeight() - 0;
      int midw = (w1 + w2) / 2;
      int midh = (h1 + h2) / 2;

      switch(dir) {
        case UP:
          x1 = w1; y1 = h2;
          x2 = w2; y2 = h2;
          x3 = midw; y3 = h1;
          break;
        case DOWN:
          x1 = w1; y1 = h1;
          x2 = w2; y2 = h1;
          x3 = midw; y3 = h2;
          break;
        case RIGHT:
          x1 = w1; y1 = h1;
          x2 = w2; y2 = midh;
          x3 = w1; y3 = h2;
          break;
        default:
          x1 = w2; y1 = h1;
          x2 = w1; y2 = midh;
          x3 = w2; y3 = h2;
          break;
      }
      int[] xArray = {x1, x2, x3};
      int[] yArray = {y1, y2, y3};
      g.fillPolygon(xArray, yArray, 3);

    }

    @Override
	public int getIconWidth() {
      return iconDimension.width;
    }

    @Override
	public int getIconHeight() {
      return iconDimension.height;
    }
  }
}
