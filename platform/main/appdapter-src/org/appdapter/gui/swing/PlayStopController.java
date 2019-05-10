
package org.appdapter.gui.swing;

/**
* This class controls a play and stop button
* so that they act consistently.  The PlayStopController
* has four possible states: <BR><BR>
*
* - play = play button on, stop button off  <BR>
* - stop = play button off, stop button on  <BR>
* - willPlay = play button blink, stop button on  <BR>
* - willStop = play button on, stop button blink  <BR>
*
* @see PlayButton
* @see StopButton
*
* @author Henrik
* @version 1.0
*/
public class PlayStopController {
	PlayButton play;
  StopButton stop;

  public PlayStopController(PlayButton play, StopButton stop) {
  	this.play = play;
    this.stop = stop;
    setStop();
  }

  public void setPlay() {
  	play.setOn();
    stop.setOff();
  }

  public void setStop() {
  	stop.setOn();
    play.setOff();
  }

  public void setWillPlay() {
  	play.setBlink();
    stop.setOn();
  }

  public void setWillStop() {
  	stop.setBlink();
    play.setOn();
  }
}