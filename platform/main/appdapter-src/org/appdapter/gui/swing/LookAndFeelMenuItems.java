package org.appdapter.gui.swing;

import java.awt.event.ActionEvent;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.HashMap;
import java.util.Set;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.LookAndFeel;
import javax.swing.UIManager;
import org.appdapter.core.log.Debuggable;
import org.appdapter.gui.browse.Utility;
import org.appdapter.gui.demo.DemoBrowser;
import com.jidesoft.plaf.LookAndFeelFactory;

public class LookAndFeelMenuItems extends SafeJMenu {

	private Thread findMoreLaf;
	public static boolean scanMoreClasses = false;

	public LookAndFeelMenuItems(String title) {
		super(true, title, (Object) null);
		boolean isOSGi = Utility.isOSGi();
		try {
			initGUI(isOSGi);
		} catch (Throwable t) {
			Debuggable.trace("" + t);
		}
	}

	private void initGUI(boolean isOSGi) {

		final LookAndFeelMenuItems menu = this;
		for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
			createLnfAction(info.getName(), info.getClassName());
		}
		createLnfAction("Metal", "javax.swing.plaf.metal.MetalLookAndFeel");
		createLnfAction("Metal Ocean", "Metal Ocean");
		createLnfAction("System", UIManager.getSystemLookAndFeelClassName());
		createLnfAction("CrossPlatform", UIManager.getCrossPlatformLookAndFeelClassName());
		createLnfAction("NULL", "NULL");
		add(new AbstractAction("Install JIDE Lafs") {
			@Override public void actionPerformed(ActionEvent e) {
				LookAndFeelFactory.installJideExtension();
				LookAndFeelFactory.installDefaultLookAndFeelAndExtension();
				installLAFClassItems(LookAndFeelFactory.class);
			}
		});

		createLnfAction("NimbusLookAndFeel", "com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		createLnfAction("GTKLookAndFeel", "com.sun.java.swing.plaf.gtk.GTKLookAndFeel");
		createLnfAction("MotifLookAndFeel", "com.sun.java.swing.plaf.motif.MotifLookAndFeel");

		this.findMoreLaf = new Thread() {
			@Override public void run() {
				addReflectiveLAndF();
			}
		};

		findMoreLaf.start();
	}

	private void installLAFClassItems(Class lafc) {
		if (lafc != null) {
			for (Field fld : lafc.getDeclaredFields()) {
				if (!Modifier.isStatic(fld.getModifiers()))
					continue;
				if (fld.getName().contains("_LNF") && fld.getType() == String.class) {
					try {
						String cn = (String) fld.get(null);
						if (!cn.contains("."))
							continue;
						createLnfAction(fld.getName().replace("_LNF", "") + " (" + cn + ")", cn);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					continue;
				}
				if (fld.getName().contains("EXTENSION_STYLE") && fld.getType() == int.class) {
					try {
						add(setStyleActionSetter(fld.getName().replace("EXTENSION_STYLE_", ""), fld.getInt(null)));
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
					continue;
				}
			}
		}
	}

	HashMap menuNames = new HashMap();

	public void createLnfAction(String name, String cls) {
		name = name.replace("LookAndFeel", "");
		if (menuNames.containsKey(name))
			return;
		if (menuNames.containsValue(cls))
			return;
		menuNames.put(name, cls);
		this.add(createLnfActionSetter(name, cls, false));
	}

	void addReflectiveLAndF() {

		try {
			if (!scanMoreClasses)
				return;
			Set<Class<? extends LookAndFeel>> lafs = org.appdapter.gui.util.ClassFinder.getClasses(LookAndFeel.class);
			if (lafs != null) {
				for (Class c : lafs) {
					if (Modifier.isAbstract(c.getModifiers()))
						continue;
					createLnfAction(c.getSimpleName() + " (" + c + ")", c);
				}
			}
		} catch (Exception e1) {
			Debuggable.UnhandledException(e1);
		}

	}

	private static Action createLnfActionSetter(String title, final String className, final boolean installJIDE) {
		return new AbstractAction(title) {
			@Override public void actionPerformed(ActionEvent e) {
				DemoBrowser.setLookAndFeel(className);
			}
		};
	}

	private void createLnfAction(String title, final Class clazz) {
		createLnfAction(title, clazz.getName());
	}

	private static Action setStyleActionSetter(String title, final int style) {
		return new AbstractAction(title) {
			@Override public void actionPerformed(ActionEvent e) {
				try {
					LookAndFeelFactory.installJideExtension();
					LookAndFeelFactory.installJideExtension(style);
					DemoBrowser.updateComponentTreeUI(true);
				} catch (Throwable e1) {
					Debuggable.UnhandledException(e1);
				}
			}
		};
	}

}
