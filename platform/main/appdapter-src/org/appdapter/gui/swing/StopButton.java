

package org.appdapter.gui.swing;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;

import javax.swing.ImageIcon;
/**
* A StatusButton that looks like the "stop" button
* on a stereo (with a black square).
*
* @author Henrik
* @version 1.0
*
* @see PlayButton
* @see StatusButton
*/
public class StopButton extends StateButton {
	private final static Color ON_COLOR = Color.red;
  private final static Color OFF_COLOR = Color.black;
  private final static Color BLINK_COLOR = Color.yellow;

  public StopButton() {
  }

  @Override
public void initIcons() {
	  Graphics g;

    Image im;

    im = createImage(dim.width, dim.height);
		on = new ImageIcon(im);
	  g = im.getGraphics();
	  createFilledRect(g, ON_COLOR);

	  im = createImage(dim.width, dim.height);
    off = new ImageIcon(im);
	  g = im.getGraphics();
	  createFilledRect(g, OFF_COLOR);

    im = createImage(dim.width, dim.height);
	  blink1 = new ImageIcon(im);
	  g = im.getGraphics();
	  createFilledRect(g, BLINK_COLOR);

    im = createImage(dim.width, dim.height);
    blink2 = new ImageIcon(im);
    g = im.getGraphics();
	  createFilledRect(g, getBackground());
  }

	private void createRect(Graphics g) {
  	g.setColor(Color.black);
		g.drawRect(0, 0, dim.width - 1, dim.height - 1);
  }

  private void createFilledRect(Graphics g, Color color) {
    g.setColor(color);
    g.fillRect(0, 0, dim.width - 1, dim.height - 1);
    createRect(g);
  }


  /*public static void main(String[] args) {
    StopButton b = new StopButton();
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