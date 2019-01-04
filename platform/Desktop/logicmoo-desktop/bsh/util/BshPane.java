// <applet code='Calculator' width='400' height='450'></applet>
package bsh.util;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JDesktopPane;
import javax.swing.JPanel;

import org.armedbear.lisp.java.swing.REPLConsole;

import bsh.Interpreter;

/**
 * Run bsh as an applet for demo purposes.
 */
public class BshPane extends JConsole {
	public BshPane() {
		JPanel stage = new JPanel(new BorderLayout());
		JPanel taskBar = new JPanel(new FlowLayout(FlowLayout.LEFT, 1, 1));
		JConsole console = new JConsole();
		add(console);
		Interpreter interpreter = new Interpreter( console );
		interpreter.run();
	}

	public static void main( String args[] ) {
		BshPane console = new BshPane();
		final Frame f = new Frame("Bsh Console");
		f.add(console, "Center");
		f.pack();
		f.show();
		f.addWindowListener( new WindowAdapter() {
			public void windowClosing( WindowEvent e ) {
				f.dispose();
			}
		} );
		Container d;
		//d.disposeOnClose(f);
		//f.setDefaultCloseOperation(f.EXIT_ON_CLOSE);
		//f.setDefaultCloseOperation(f.HIDE_ON_CLOSE);
		f.pack();
		f.setSize(800, 400);
		//REPLConsole.centerWindow(f);
		f.setVisible(true);

	}
}
