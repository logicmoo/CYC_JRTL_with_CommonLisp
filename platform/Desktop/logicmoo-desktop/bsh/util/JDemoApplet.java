// <applet code='Calculator' width='400' height='450'></applet>
package bsh.util;

import java.awt.BorderLayout;

import javax.swing.JApplet;
import javax.swing.JFrame;
import javax.swing.SwingUtilities;

import org.armedbear.lisp.ReaderInputStream;
import org.logicmoo.system.SystemCurrent;

import bsh.EvalError;
import bsh.Interpreter;
import bsh.TargetError;

/**
 * Run bsh as an applet for demo purposes.
 */
public class JDemoApplet extends JApplet {

	boolean initedApplet = false;
	static boolean initedStaticApplet = false;
	static Interpreter interp = null;
	@Override
	public void init() {
		if(initedApplet) return;
		initedApplet = true;
		String type = getInterpType();
		if (type != null && type.equals("desktop"))
			// start the desktop
			try {
				if(interp==null)interp = new Interpreter();
				setInterpReader(interp);
				interp.eval("desktop()");
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
			if(interp==null)interp = new Interpreter(console);
			setInterpReader(interp);
			this.show();
			new Thread(interp).start();
		}
	}

	/**
	 * @return
	 */
	private String getInterpType() {
		if(true)return null;
		String debug = getParameter("debug");
		if (debug != null && debug.equals("true"))
			Interpreter.DEBUG = true;

		String type = getParameter("type");
		return type;
	}

	/**
	 * @param i
	 */
	static void setInterpReader(Interpreter i) {
		SystemCurrent.setErr(i.getErr());
		SystemCurrent.setOut(i.getOut());
		SystemCurrent.setIn(new ReaderInputStream(i.getIn()));
		i.setShowResults(true);
	}

	public JDemoApplet() {
		//initStatic();
		init();
	}
	public static void main(String[] args) {
		new JDemoApplet();
	}

	public static void initStatic() {
		if(initedStaticApplet) return;
		initedStaticApplet = true;
		Runnable r = new Runnable() {
			@Override
			public void run() {
				try {
					Interpreter.DEBUG = true;
					Interpreter.TRACE = true;
					if(interp==null) interp = new Interpreter();
					setInterpReader(interp);
					Object o = interp.eval("desktop()");
				} catch (EvalError e) {
					e.printStackTrace();
				}
			}


		};
		SwingUtilities.invokeLater(r);
	}
}
