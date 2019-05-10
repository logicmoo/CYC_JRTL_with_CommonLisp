

package org.appdapter.gui.swing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Polygon;

import javax.swing.ImageIcon;

/**
* A StatusButton that looks like the "play" button
* on a stereo (with a green triangle).
*
* @author Henrik
* @version 1.0
*
* @see StopButton
* @see StatusButton
*/
public class PlayButton extends StateButton {
	private final static Color ON_COLOR = Color.green;
  private final static Color OFF_COLOR = Color.black;
  private final static Color BLINK_COLOR = Color.yellow;

  public static Polygon triangle = null;

  public PlayButton() {
  	if (triangle == null) {
	  	triangle = new Polygon();
	    triangle.addPoint(0, 0);
	    triangle.addPoint(0, dim.height);
	    triangle.addPoint(dim.width, dim.height / 2);
		}
  }

  @Override
public void initIcons() {
	  Graphics g;

    Image im;
    im = createImage(dim.width, dim.height);
		on = new ImageIcon(im);
	  g = im.getGraphics();
	  createFilledTriangle(g, ON_COLOR);

    im = createImage(dim.width, dim.height);
	  off = new ImageIcon(im);
	  g = im.getGraphics();
	  createFilledTriangle(g, OFF_COLOR);

    im = createImage(dim.width, dim.height);
	  blink1 = new ImageIcon(im);
	  g = im.getGraphics();
	  createFilledTriangle(g, BLINK_COLOR);

    im = createImage(dim.width, dim.height);
    blink2 = new ImageIcon(im);
	  g = im.getGraphics();
	  createFilledTriangle(g, getBackground());
  }

	private void createTriangle(Graphics g) {
  	g.setColor(Color.black);
		g.drawPolygon(triangle);
  }

  private void createFilledTriangle(Graphics g, Color color) {
  	g.setColor(getBackground());
    g.fillRect(0, 0, dim.width, dim.height);
    g.setColor(color);
		g.fillPolygon(triangle);
    createTriangle(g);
  }

  /*
  public static void main(String[] args) {
    PlayButton b = new PlayButton();
    Frame f = new Frame("Test");
    f.setSize(100, 100);
    f.add(b);
    f.show();
    try {
    	Thread.sleep(2000);
      b.setBlink();
      Thread.sleep(4000);
      b.setOn();
      Thread.sleep(2000);
      b.setBlink();
    } catch (Exception err) {
    }
  } */
}