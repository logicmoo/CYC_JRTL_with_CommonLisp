package org.appdapter.gui.editors;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.beans.Customizer;
import java.beans.PropertyChangeListener;
import java.beans.PropertyEditor;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.Map;

import javax.swing.JLabel;
import javax.swing.JTabbedPane;

import org.appdapter.api.trigger.Box;
import org.appdapter.core.jvm.SetObject;
import org.appdapter.core.convert.ReflectUtils;
import org.appdapter.core.log.Debuggable;
import org.appdapter.gui.api.AddTabFrames;
import org.appdapter.gui.api.AddTabFrames.SetTabTo;
import org.appdapter.gui.api.BoxPanelSwitchableView;
import org.appdapter.gui.api.DisplayContext;
import org.appdapter.gui.api.GetSetObject;
import org.appdapter.gui.browse.Utility;
import org.appdapter.gui.swing.JTabbedPaneWithCloseIcons;
import org.appdapter.gui.swing.ObjectTabsForTabbedView;
import org.appdapter.gui.swing.ObjectView;
import org.appdapter.gui.trigger.TriggerMouseAdapter;
import org.slf4j.LoggerFactory;

import com.jidesoft.swing.JideTabbedPane;

/**
 * A panel containing a complete GUI for a object, including properties, methods, etc.
 * <p>
 *
 *
 */
@SuppressWarnings("serial")
final public class LargeObjectView<BoxType extends Box>

		extends ObjectView<BoxType> implements Customizer, GetSetObject, ObjectPanelHost {
	static public abstract class TabPanelMaker implements AddTabFrames {

		@Override public int hashCode() {
			return getClass().hashCode();
		}

		@Override public boolean equals(Object o) {
			return getClass().hashCode() == o.getClass().hashCode();
		}

	}

	public static Type[] EDITTYPE = new Type[] { Object.class };

	protected DisplayContext context;
	protected DnDTabbedPane tabs;
	//protected Object objectValue;
	BoxPanelSwitchableView objTabs;

	///protected abstract void initSubClassGUI() throws Throwable;

	public LargeObjectView() {
		this(Utility.getDisplayContext());
	}

	public LargeObjectView(DisplayContext context) {
		super(false);
		this.context = context;
		initGUISetupNewObjectClass();
	}

	@Override public String getName() {
		return Utility.getUniqueNameForKey(getValue());
	}

	final protected void objectValueChanged() {
		tabs.removeAll();
		Object bean = getValue();
		Class objClass = Utility.getClassNullOk(bean);
		if (bean != null) {
			addTabFrames(bean, objClass);
		} else {
			add(new JLabel("ERROR object is null!? " + bean));
		}

		for (Component c : tabs.getComponents()) {
			try {
				String warn = ("instanceof " + c.getClass().getName() + " for (" + objClass.getName() + ")" + bean);
				if (c instanceof SetObject) {
					SetObject gso = (SetObject) c;
					try {
						gso.setObject(bean);
						continue;
					} catch (Throwable e) {
						Utility.error("Did not SetObject.this.setObject " + warn, e);
					}
				}
				if (c instanceof PropertyEditor) {
					PropertyEditor gso = (PropertyEditor) c;
					try {
						gso.setValue(bean);
						continue;
					} catch (Throwable e) {
						Utility.error("Did not PropertyEditor.this.setValue " + warn, e);
					}
					continue;
				}
				if (c instanceof Customizer) {
					Customizer gso = (Customizer) c;
					try {
						gso.setObject(bean);
						continue;
					} catch (Throwable e) {
						Utility.error("Did not Customizer.this.setObject " + warn, e);
					}
					continue;
				}
				if (c instanceof Map.Entry) {
					Map.Entry gso = (Map.Entry) c;
					try {
						gso.setValue(bean);
						continue;
					} catch (Throwable e) {
						Utility.error("Did not Map.Entry.this.setValue (Customizer) " + warn, e);
					}
					continue;
				}

			} catch (Throwable e) {
				e.printStackTrace();
				continue;
			}

		}
	}

	private void addTabFrames(Object bean, Class objClass) {
		for (AddTabFrames atf : Utility.getTabFrameAdders()) {
			atf.setTabs(objTabs, context, bean, objClass, SetTabTo.ADD);
		}
	}

	public boolean addTab(String title, Component view) {
		tabs.add(title, view);
		return true;
	}

	/**
	 * Return the live object in which we think we are updating
	 *
	 * This can be 'this' object
	 *
	 */
	@Override public Object getValue() {
		Object o = objectValue;
		if (o == this || o == null) {
			//	Debuggable.warn("LargeObjectView value=" + o);
		}
		return o;
	}

	boolean initedGuiOnce = false;

	private TriggerMouseAdapter mouseAdapter;

	@Override
	public final boolean initGUI() {
		synchronized (valueLock) {
			if (initedGuiOnce == true)
				return false;
			if (objectValue == null)
				return false;
			initedGuiOnce = true;
			try {
				objectValueChanged();
			} catch (Throwable e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				initedGuiOnce = false;
			}
			return initedGuiOnce;
		}
	}

	public void initGUISetupNewObjectClass() {
		removeAll();
		setLayout(new BorderLayout());
		if (this.mouseAdapter == null) {
			this.mouseAdapter = TriggerMouseAdapter.installMouseAdapter(this);
		} else {
			if (tabs != null) {
				tabs.removeMouseListener(mouseAdapter);
			}
		}
		if (tabs != null) {
			tabs.disable();
			tabs.setVisible(false);
		}
		tabs = new JTabbedPaneWithCloseIcons(JTabbedPane.BOTTOM);
		add("Center", tabs);
		//mouseAdapter.addToComponent(tabs, false);
		objTabs = new ObjectTabsForTabbedView(tabs, false, this);
		initedGuiOnce = false;
	}

	@Override public Dimension getPreferredSize() {
		/*
		 * Dimension dim = super.getPreferredSize(); int w,h; w =
		 * Math.min(dim.width + 30, 350); h = Math.min(dim.height + 30, 500);
		 */
		return Utility.getConstrainedDimension(getMinimumSize(), super.getPreferredSize(), getMaximumSize());
	}

	@Override public Dimension getMinimumSize() {
		return new Dimension(400, 350);
	}

	@Override public Dimension getMaximumSize() {
		return new Dimension(800, 600); // Toolkit.getDefaultToolkit().getScreenSize();
	}

	/**
	 * Delegates directly to setObject(...). This method is needed to conform to the Customizer interface.
	 */
	public void setBean(Object obj) {
		setObject(obj);
	}

	/**
	 * This method is needed to conform to the Customizer interface. It doesn't do anything yet.
	 */
	@Override public void addPropertyChangeListener(PropertyChangeListener listener) {
	}

	/**
	 * This method is needed to conform to the Customizer interface. It doesn't do anything yet.
	 */
	@Override public void removePropertyChangeListener(PropertyChangeListener listener) {
	}

	/**
	 * Called whenever the pojo is switched. Caused the GUI to update to render the new pojObject instead.
	 */
	@Override public void objectValueChanged(Object oldValue, Object newValue) {
		newValue = Utility.dref(newValue);
		super.firePropertyChange("value", oldValue, newValue);
		reallySetValue(newValue);
	}

	@Override public void focusOnBox(Box b) {
		setObject(b);
		LoggerFactory.getLogger(getClass().getName()).info("Focusing on box: " + b);
	}

	@Override protected void reallySetValue(Object bean) {
		bean = Utility.dref(bean);
		if (objectValue == bean)
			return;
		objectValue = bean;
		objectValueChanged();
	}

	@Override public void setObject(Object bean) {
		Utility.checkSource(bean);
		bean = Utility.dref(bean);
		if (objectValue != bean) {
			objectValueChanged(objectValue, bean);
		}
	}
}