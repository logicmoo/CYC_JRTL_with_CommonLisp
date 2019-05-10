package org.appdapter.gui.swing;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.lang.reflect.Constructor;
import java.util.Hashtable;
import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.border.EtchedBorder;

import org.appdapter.api.trigger.Box;
import org.appdapter.gui.api.DisplayContext;
import org.appdapter.gui.browse.Utility;

/**
 * A GUI component that shows all the constructors provided by a given class
 */
public class ConstructorsListPanel<BoxType extends Box> extends ScreenBoxPanel<BoxType> implements ActionListener {
	//==== Instance variables ==========================

	public static Class EDITTYPE = Class.class;
	//Class cls;
	DisplayContext context;

	//Maps Button -> Constructor
	Hashtable buttons = new Hashtable();

	//Maps Button -> parameters panels
	Hashtable panels = new Hashtable();

	//==== Constructors =============================
	public ConstructorsListPanel() {
		this(null);
	}

	public ConstructorsListPanel(DisplayContext context, Class cls) {
		this.context = context;
		if (cls != null)
			reloadObjectGUI(cls);
	}

	public ConstructorsListPanel(Class cls) {
		this(Utility.getCurrentContext(), cls);
	}

	//==== Event handlers =============================

	@Override public void actionPerformed(ActionEvent evt) {
		Constructor c = (Constructor) buttons.get(evt.getSource());
		if (c != null) {
			MethodParametersPanel p;
			p = (MethodParametersPanel) panels.get(evt.getSource());
			try {
				executeConstructor(c, p.getValues());
			} catch (Throwable err) {
				Utility.showError(context, null, err);
			}
		}
	}

	//==== Private methods =======================

	/**
	 * Executes the given constructor with the given parameters
	 */
	private void executeConstructor(Constructor constructor, Object[] params) throws Exception {
		if (constructor != null) {
			Object newObject = constructor.newInstance(params);
			Utility.addSubResult(this, null, null, newObject, constructor.getDeclaringClass());
		}
	}

	/**
	 * Creates the GUI
	 */
	@Override
	protected void completeSubClassGUI() {
		setLayout(new VerticalLayout(VerticalLayout.LEFT, true));

		Class cls = (Class) this.objectValue;
		Constructor[] array = cls.getDeclaredConstructors();
		for (int i = 0; i < array.length; ++i) {
			Constructor c = array[i];

			JButton button = new JButton("Create");
			button.addActionListener(this);

			JPanel pbutton = new JPanel();
			pbutton.setLayout(new FlowLayout(FlowLayout.RIGHT));
			pbutton.add(button);

			MethodParametersPanel pparams;
			pparams = new MethodParametersPanel(context, c);

			JPanel pmain = new JPanel();
			pmain.setLayout(new BorderLayout());
			pmain.add("Center", pparams);
			pmain.add("West", pbutton);

			EtchedBorder border = new EtchedBorder(EtchedBorder.LOWERED);
			pmain.setBorder(border);

			buttons.put(button, c);
			panels.put(button, pparams);
			add(pmain);
		}
	}

	@Override protected boolean reloadObjectGUI(Object obj) {
		this.objectValue = Utility.recastCC(obj, Class.class);
		completeSubClassGUI();
		return true;
	}

	@Override protected void initSubclassGUI() throws Throwable {

	}

	@Override public Class<Class> getClassOfBox() {
		return Class.class;
	}

}
