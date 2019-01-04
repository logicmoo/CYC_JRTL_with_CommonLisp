
package com.netbreeze.bbowl.gui;

import com.netbreeze.bbowl.*;
import javax.swing.*;
import javax.swing.event.*;

import org.armedbear.lisp.Lisp;
import org.logicmoo.bb.BeanBowl;
import org.logicmoo.bb.BeanWrapper;
import org.logicmoo.bb.BeansContext;
import org.logicmoo.bb.BeansContextListener;

import com.netbreeze.util.*;
import com.netbreeze.swing.*;
import java.util.*;
import java.awt.*;
import java.awt.event.*;
import java.beans.*;

/**
 * A BeansContext implementation that uses a BeanBowlGUI.
 *
 * @author Henrik Kniberg
 */
public class BeanBowlContext implements BeansContext {
	// ==== Static variables =================
	private static boolean ALLOW_MULTIPLE_WINDOWS = false;

	// ==== Instance variables ================
	BeanBowlGUI gui;
	PairTable beanFrames = new PairTable();
	PairTable beanGUIs = new PairTable();
	JInternalFrame classBrowser = null;
	Adapter listener = new Adapter();

	// ==== Constructors ===================

	/**
	 * Creates a new context linked to the given GUI. All operations will use
	 * either the given GUI or the bean bowl that it represents
	 */
	public BeanBowlContext(BeanBowlGUI gui) {
		this.gui = gui;
		if (gui == null) {
			throw new NullPointerException("The bean bowl GUI cannot be null for a BeanBowlContext");
		}
	}

	// ==== Property getters and setters ==================

	public BeanBowl getBowl() {
		return gui.getBowl();
	}

	// ==== Implementation of BeansContext interface ============

	public Collection getBeansOfType(Class c) {
		return getBowl().getBeansOfType(c);
	}

	public boolean containsBean(Object o) {
		return getBowl().containsBean(o);
	}

	public void addListener(BeansContextListener l) {
		getBowl().addListener(l);
	}

	public void removeListener(BeansContextListener l) {
		getBowl().removeListener(l);
	}

	public Object findBean(String name) {
		return getBowl().findBean(name);
	}

	public String getBeanName(Object o) {
		if (o == null)
			return "bean is null";
		BeanWrapper wrapper = getBowl().getWrapper(o);
		if (wrapper == null) {
			try {
				return "" + o;
			} catch (Throwable t) {
				return Lisp.getDotName(o.getClass()) + "@" + System.identityHashCode(o);
			}
		} else {
			try {
				return wrapper.getName();
			} catch (Throwable t) {
				return "Wrapped " + Lisp.getDotName(o.getClass()) + "@" + System.identityHashCode(o);
			}
		}
	}

	/**
	 * Adds a new bean, if it wasn't already there
	 *
	 * @returns true if the bean was added, false if the bean was already there
	 */
	public boolean addBean(Object bean) {
		return getBowl().addBean(bean);
	}

	@Override
	public boolean addObject(String named, Object bean) {
		return getBowl().addBean(named, bean);
	}

	/**
	 * Removes a bean, if it is there
	 *
	 * @returns true if the bean was removed, false if that bean wasn't in this
	 *          context
	 */
	public boolean removeBean(Object bean) {
		return getBowl().removeBean(bean);
	}

	/**
	 * Returns all actions that can be carried out on the given bean
	 */
	public Collection getActions(Object bean) {
		Collection actions = new LinkedList();
		if (getBowl().containsBean(bean)) {
			actions.add(new RenameAction(bean));
			actions.add(new RemoveAction(bean));
		} else {
			actions.add(new AddAction(bean));
		}
		if (bean instanceof Component) {
			actions.add(new ViewAction(bean));
		}
		actions.add(new PropertiesAction(bean));
		return actions;
	}

	/**
	 * Opens up a GUI to show the details of the given bean
	 */
	public void showBeanDetails(Object bean) throws Exception {
		JInternalFrame existing = (JInternalFrame) beanFrames.findBrother(bean);

		if (existing == null || ALLOW_MULTIPLE_WINDOWS) {

			// Get a wrapper for the bean, or create a temporary wrapper if
			// necessary
			BeanWrapper wrapper = getBowl().getWrapper(bean);
			if (wrapper == null) {
				wrapper = new BeanWrapper(bean);
			}

			// Get the bean info and descriptor
			BeanInfo beanInfo = wrapper.getBeanInfo();

			// Create the GUI for the bean
			Component view;
			Class customizerClass = findCustomizerClass(bean.getClass());
			if (customizerClass != null) {
				Customizer customizer = (Customizer) customizerClass.newInstance();
				customizer.setObject(bean);
				view = (Component) customizer;
			} else {
				view = new LargeBeanView(this, bean);
			}

			// Get an icon for the bean
			Icon icon = wrapper.getIcon();

			// Create an internal frame to hold the GUI
			JInternalFrame frame = new JInternalFrame(getBeanName(bean), true, true, true, true);
			frame.setResizable(true);

			// Put the GUI and icon in the frame
			frame.setFrameIcon(icon);
			frame.getContentPane().add(view);

			// Make the size correct
			JDesktopPane desk = gui.getDesk();
			Dimension preferred = frame.getPreferredSize();
			Dimension deskSize = desk.getSize();
			Dimension size = new Dimension(Math.min(preferred.width, deskSize.width),
					Math.min(preferred.height, deskSize.height));
			frame.setSize(size);

			// If necessary, add this to the list of bean frames
			// to allow reuse of this window if the same bean is to be viewed
			// again
			if (!ALLOW_MULTIPLE_WINDOWS) {
				beanFrames.add(bean, frame);
			}

			// Listen to the frame, so we notice if it closes
			frame.addInternalFrameListener(listener);

			// Add the frame to the desk and bring it to the front
			desk.add(frame);
			frame.toFront();
			frame.show();

		} else {

			// There was an existing GUI. Just bring it to the front
			existing.show();
			existing.toFront();
		}
	}

	// ==== Other public methods =========================

	public BeanBowlGUI getGUI() {
		return gui;
	}

	/**
	 * For beans that happen to be Components, this method can be used to cause
	 * the bean to be drawn as a component.
	 */
	public void showBeanGUI(Component bean) {
		Window existing = (Window) beanGUIs.findBrother(bean);

		if (existing == null || ALLOW_MULTIPLE_WINDOWS) {

			if (bean instanceof JInternalFrame) {
				JInternalFrame f = (JInternalFrame) bean;
				if (!ALLOW_MULTIPLE_WINDOWS)
					beanGUIs.add(bean, f);
				f.addInternalFrameListener(listener);
				gui.getDesk().add(f);
				f.toFront();
				f.show();

			} else if (bean instanceof JComponent) {
				JInternalFrame f = new JInternalFrame(bean.getName(), true, true, true, true);
				f.setFrameIcon(new BeanWrapper(bean).getIcon());
				f.getContentPane().add((JComponent) bean);
				if (!ALLOW_MULTIPLE_WINDOWS)
					beanGUIs.add(bean, f);
				f.addInternalFrameListener(listener);
				f.pack();
				gui.getDesk().add(f);
				f.toFront();
				f.show();

			} else if (bean instanceof Window) {
				Window window = (Window) bean;
				if (!ALLOW_MULTIPLE_WINDOWS)
					beanGUIs.add(bean, window);
				window.addWindowListener(listener);
				window.setSize(window.getPreferredSize());
				com.netbreeze.util.Utility.centerWindow(window);
				window.show();

			} else {
				JInternalFrame f = new JInternalFrame(bean.getName(), true, true, true, true);
				f.getContentPane().add((Component) bean);
				f.setSize(f.getPreferredSize());
				if (!ALLOW_MULTIPLE_WINDOWS)
					beanGUIs.add(bean, f);
				f.addInternalFrameListener(listener);
				f.pack();
				// f.setSize(f.getPreferredSize());
				// com.netbreeze.util.Utility.centerWindow(f);
				// f.show();
				gui.getDesk().add(f);
				f.toFront();
				f.show();
			}
		} else {
			existing.show();
			existing.toFront();
		}
	}

	public void showError(String msg, Throwable error) {
		try {
			if (error == null) {
				new ErrorDialog(msg, error).show();
			} else {
				showBeanDetails(error); // @temp
			}
		} catch (Throwable err) {
			new ErrorDialog("A new error occurred while trying to display the original error '" + error + "'!", err)
					.show();
		}
	}

	private Class findCustomizerClass(Class c) throws IntrospectionException {
		BeanInfo beanInfo = Introspector.getBeanInfo(c);
		Class customizerClass = null;
		BeanDescriptor descriptor = beanInfo.getBeanDescriptor();
		if (descriptor != null) {
			customizerClass = descriptor.getCustomizerClass();
		}
		if (customizerClass == null) {
			if (c == Object.class) {
				return null;
			} else {
				return findCustomizerClass(c.getSuperclass());
			}
		} else {
			return customizerClass;
		}
	}

	// ==== Action classes ====================================

	class RenameAction extends AbstractAction {
		Object bean;

		RenameAction(Object bean) {
			super("Change name");
			this.bean = bean;
		}

		public void actionPerformed(ActionEvent evt) {
			BeanWrapper wrapper = getBowl().getWrapper(bean);
			if (wrapper != null) {
				RenameDialog dialog = new RenameDialog(BeanBowlContext.this, wrapper);
				dialog.show();
			}
		}
	}

	class RemoveAction extends AbstractAction {
		Object bean;

		RemoveAction(Object bean) {
			super("Remove from bowl", Icons.removeFromBowl);
			this.bean = bean;
		}

		public void actionPerformed(ActionEvent evt) {
			removeBean(bean);
		}
	}

	class ViewAction extends AbstractAction {
		Object bean;

		ViewAction(Object bean) {
			super("View", Icons.viewBean);
			this.bean = bean;
		}

		public void actionPerformed(ActionEvent evt) {
			showBeanGUI((Component) bean);
		}
	}

	class AddAction extends AbstractAction {
		Object bean;

		AddAction(Object bean) {
			super("Add to bowl", Icons.addToBowl);
			this.bean = bean;
		}

		public void actionPerformed(ActionEvent evt) {
			addBean(bean);
		}
	}

	class PropertiesAction extends AbstractAction {
		Object bean;

		PropertiesAction(Object bean) {
			super("Properties", Icons.properties);
			this.bean = bean;
		}

		public void actionPerformed(ActionEvent evt) {
			try {
				showBeanDetails(bean);
			} catch (Throwable err) {
				showError(null, err);
			}
		}
	}

	// ===== Event adapter classes ==================================

	/**
	 * Window event adapter class, used to find out when child windows close
	 */
	class Adapter extends WindowAdapter implements InternalFrameListener {
		public void windowClosing(WindowEvent e) {
			Object source = e.getSource();
			if (source == classBrowser) {
				// classBrowser.removeWindowListener(this);
				// classBrowser = null;
			} else if (source instanceof Window) {
				Window window = (Window) source;
				window.removeWindowListener(this);
				beanFrames.remove(window);
				beanGUIs.remove(window);
				window.dispose();
			}
		}

		public void internalFrameActivated(InternalFrameEvent e) {
		}

		public void internalFrameClosed(InternalFrameEvent e) {
		}

		public void internalFrameClosing(InternalFrameEvent e) {
			Object source = e.getSource();
			if (source == classBrowser) {
				classBrowser.removeInternalFrameListener(this);
				classBrowser = null;
			} else if (source instanceof JInternalFrame) {
				JInternalFrame window = (JInternalFrame) source;
				window.removeInternalFrameListener(this);
				beanFrames.remove(window);
				beanGUIs.remove(window);
				window.dispose();
			}
		}

		public void internalFrameDeactivated(InternalFrameEvent e) {
		}

		public void internalFrameDeiconified(InternalFrameEvent e) {
		}

		public void internalFrameIconified(InternalFrameEvent e) {
		}

		public void internalFrameOpened(InternalFrameEvent e) {
		}
	}
}
