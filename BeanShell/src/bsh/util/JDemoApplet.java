// <applet code='Calculator' width='400' height='450'></applet>
package bsh.util;

import java.awt.BorderLayout;

import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import bsh.EvalError;
import bsh.Interpreter;
import bsh.TargetError;

/**
 * Run bsh as an applet for demo purposes.
 */
public class JDemoApplet extends JApplet {
	public void init() {
		String debug = getParameter("debug");
		if (debug != null && debug.equals("true"))
			Interpreter.DEBUG = true;

		String type = getParameter("type");
		if (type != null && type.equals("desktop"))
			// start the desktop
			try {
			new Interpreter().eval("desktop()");
			} catch (TargetError te) {
			te.printStackTrace();
			System.out.println(te.getTarget());
			te.getTarget().printStackTrace();
			} catch (EvalError evalError) {
			System.out.println(evalError);
			evalError.printStackTrace();
			}
		else {
			getContentPane().setLayout(new BorderLayout());
			JConsole console = new JConsole();
			getContentPane().add("Center", console);
			Interpreter interpreter = new Interpreter(console);
			new Thread(interpreter).start();
		}
	}

	public static void main(String[] args) {
		initStatic();
	}

	public static void initStatic() {
		Runnable r = new Runnable() {
			public void run() {
				try {
					//Interpreter.DEBUG = true;
					new Interpreter().eval("desktop()");
				} catch (EvalError e) {
					e.printStackTrace();
				}
			}
		};
		SwingUtilities.invokeLater(r);
	}
}
