

package org.appdapter.gui.swing;

import java.awt.Dimension;

import javax.swing.Icon;
import javax.swing.JButton;

/**
* A button with an image and three possible
* states: ON, OFF, and BLINK.  Blink is used
* to indicate that the state is switching. Useful
* for controller buttons, as they can be used
* both to display the state and to control the state
* of a process.
*
* @see PlayButton
* @see StopButton
*
* @author Henrik
* @version 1.0
*/
abstract public class StateButton extends JButton {
	public static final int ON = 0;
  public static final int OFF = 1;
  public static final int BLINK = 2;

  final static Dimension dim = new Dimension(18, 18);

	Icon on = null;
  Icon off = null;
  Icon blink1 = null;
  Icon blink2 = null;

  Blinker blinker = new Blinker();

	private int state;

  public StateButton() {
  	setOff();
  }

  abstract public void initIcons();

  @Override
synchronized public void setIcon(Icon icon) {
  	if (icon != null)
    	super.setIcon(icon);
  }

  @Override
public void addNotify() {
    super.addNotify();
    if (on == null)
	    initIcons();
    updateIcon();
  }

  public void setOn() {
  	if (state != ON) {
	  	state = ON;
	    blinker.stop();
	    updateIcon();
    }
  }

  public void setOff() {
  	if (state != OFF) {
	  	state = OFF;
	    blinker.stop();
	    updateIcon();
    }
  }

  public void setBlink() {
  	if (state != BLINK) {
	  	state = BLINK;
      if (blinker != null)
      	blinker.stop();
	    blinker = new Blinker();
	    blinker.start();
      //updateIcon();
    }
  }

  synchronized private void updateIcon() {
  	Icon i;
    switch(state) {
    	case ON: i = on; break;
      case BLINK: i = blink1; break;
      default: i = off; break;
    }
    setIcon(i);
  }

	class Blinker extends Thread {
    public Blinker () {
    }

	  @Override
	public void run() {
	    try {
	    	while (true) {
      		setIcon(blink1);
					sleep(250);
          setIcon(blink2);
					sleep(250);
	      }
	    } catch (InterruptedException err) {

	    }
	  }
	}

}
