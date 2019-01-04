package org.appdapter.gui.swing;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.LayoutManager;
import java.util.Collection;

import javax.swing.AbstractButton;
import javax.swing.CellEditor;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JDesktopPane;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JSlider;
import javax.swing.JTextField;

import org.appdapter.api.trigger.Box;
import org.appdapter.core.jvm.GetObject;
import org.appdapter.api.trigger.UserResult;
import org.appdapter.core.log.Debuggable;
import org.appdapter.gui.api.BoxPanelSwitchableView;
import org.appdapter.gui.api.DisplayContext;
import org.appdapter.gui.api.FocusOnBox;
import org.appdapter.gui.api.NamedObjectCollection;
import org.appdapter.gui.browse.Utility;

public class ComponentHost extends JJPanel implements DisplayContext, GetObject, FocusOnBox {

	//JLayeredPane desk;
	//JSplitPane split;
	public Component componet;
	public JComponent jcomponet;
	public Object objectValue;

	@Override public void updateUI() {
		if (jcomponet != null) {
			jcomponet.updateUI();
		}
	}

	//OJOApp context;

	public ComponentHost(Component view, Object object) {
		super(false);
		this.componet = view;
		if (view instanceof JComponent) {
			jcomponet = (JComponent) view;
		}
		if (object instanceof JComponent) {
			jcomponet = (JComponent) object;
		}
		objectValue = object;
		//this.context = context;
		initGUI();
	}

	void initGUI() {
		removeAll();
		adjustSize();
		LayoutManager layout = getPreferedComponetLayout(componet);
		setLayout(layout);
		add("West", componet);
		setName(componet.getName());
	}

	public static java.awt.LayoutManager getPreferedComponetLayout(Component c) {
		if (c instanceof JVPanel || c instanceof JTextField || c instanceof JLabel //
				|| c instanceof JSlider || c instanceof JComboBox || //
				c instanceof AbstractButton || c instanceof CellEditor) {
			return new FlowLayout();
		}
		return new BorderLayout();
	}

	private void adjustSize() {
		Container p = getParent();
		if (p != null) {
			setSize(p.getSize());
		}
	}

	@Override public String getName() {
		return componet.getName();
	}

	@Override public void focusOnBox(Box b) {
		Debuggable.notImplemented();

	}

	@Override public Object getValue() {
		return Utility.dref(objectValue, componet);
	}

	public static JPanel asPanel(Component view, Object object) {

		if (view instanceof JPanel) {
			return (JPanel) view;
		}

		if (view instanceof JComponent) {
			return new ComponentHost(view, object);
		}
		if (view instanceof javax.swing.JInternalFrame) {
			JDesktopPane view2 = new JDesktopPane();
			view2.add(view);
			return new ComponentHost(view2, object);
		}

		if (view instanceof javax.swing.JFrame) {
			JDesktopPane view2 = new JDesktopPane();
			view2.add(view);
			return new ComponentHost(view2, object);
		}

		if (object == null) {
			if (view == null) {
				return null;
			}
			object = ((GetObject) view).getValue();
		}
		return Utility.getTreeBoxCollection().findOrCreateBox(object).getPropertiesPanel();
	}

	@Override public BoxPanelSwitchableView getBoxPanelTabPane() {
		return Utility.getBoxPanelTabPane();
	}

	@Override public NamedObjectCollection getLocalBoxedChildren() {
		return Utility.getTreeBoxCollection();
	}

	@Override public Collection getTriggersFromUI(Object object) {
		return Utility.getCurrentPOJOApp().getTriggersFromUI(object);
	}

	@Override public UserResult addObject(String title, Object anyObject, boolean showASAP) throws Exception {
		return Utility.getCurrentPOJOApp().addObject(title, anyObject, showASAP, false);
	}

	@Override public String getTitleOf(Object value) {
		return getLocalBoxedChildren().getTitleOf(value);
	}

	@Override public Class<Box> getClassOfBox() {
		return Box.class;
	}

}
