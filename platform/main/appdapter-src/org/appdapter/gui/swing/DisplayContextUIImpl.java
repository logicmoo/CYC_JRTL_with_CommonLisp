package org.appdapter.gui.swing;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.image.BufferedImage;
import java.beans.PropertyVetoException;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.concurrent.Callable;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JComponent;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.InternalFrameListener;

import org.appdapter.api.trigger.UserResult;
import org.appdapter.core.convert.NoSuchConversionException;
import org.appdapter.core.log.Debuggable;
import org.appdapter.gui.api.BT;
import org.appdapter.gui.api.BoxPanelSwitchableView;
import org.appdapter.gui.api.BrowserPanelGUI;
import org.appdapter.gui.api.DisplayContext;
import org.appdapter.gui.api.DisplayType;
import org.appdapter.gui.api.IShowObjectMessageAndErrors;
import org.appdapter.gui.api.NamedObjectCollection;
import org.appdapter.gui.api.POJOCollection;
import org.appdapter.gui.api.POJOCollectionListener;
import org.appdapter.gui.box.ScreenBoxImpl;
import org.appdapter.gui.browse.Utility;
import org.appdapter.gui.editors.Icons;
import org.appdapter.gui.editors.RenameDialog;
import org.appdapter.gui.trigger.AbstractTriggerAction;
import org.appdapter.gui.trigger.TriggerMenuFactory;
import org.appdapter.gui.util.PairTable;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A POJOCollectionContext implementation that uses a ObjectNavigator.
 *
 *
 */
public class DisplayContextUIImpl implements BrowserPanelGUI, POJOCollection, DisplayContext {

	public BrowserPanelGUI getLocalTreeAPI() {
		return this;
	}

	/**
	 * Window event adapter class, used to find out when child windows close
	 */
	class Adapter extends WindowAdapter implements InternalFrameListener {
		@Override public void internalFrameActivated(InternalFrameEvent e) {
		}

		@Override public void internalFrameClosed(InternalFrameEvent e) {
		}

		@Override public void internalFrameClosing(InternalFrameEvent e) {
			Object source = e.getSource();
			if (source == classBrowser_Unused) {
				((JInternalFrame) classBrowser_Unused).removeInternalFrameListener(this);
				classBrowser_Unused = null;
			} else if (source instanceof JInternalFrame) {
				JInternalFrame window = (JInternalFrame) source;
				window.removeInternalFrameListener(this);
				Utility.forgetWindow(window);
				window.dispose();
			}
		}

		@Override public void internalFrameDeactivated(InternalFrameEvent e) {
		}

		@Override public void internalFrameDeiconified(InternalFrameEvent e) {
		}

		@Override public void internalFrameIconified(InternalFrameEvent e) {
		}

		@Override public void internalFrameOpened(InternalFrameEvent e) {
		}

		@Override public void windowClosing(WindowEvent e) {
			Object source = e.getSource();
			if (source == classBrowser_Unused) {
				// classBrowser.removeWindowListener(this);
				// classBrowser = null;
			} else if (source instanceof Window) {
				Window window = (Window) source;
				window.removeWindowListener(this);
				Utility.forgetWindow(window);
				window.dispose();
			}
		}
	}

	class AddAction extends AbstractTriggerAction {

		AddAction(Object val, NamedObjectCollection noc) {
			super("Copy %o to %n", Icons.addToCollection);

			super.currentCollection = noc;
			this.setValue(val);
		}

		@Override public void actionPerformed(ActionEvent evt) {
			try {
				Object o = getValue();
				currentCollection.findOrCreateBox(o);
			} catch (Exception e) {
				showError(toString(), e);
			}
		}
	}

	class PropertiesAction extends AbstractTriggerAction {

		PropertiesAction(Object object) {
			super("Properties of %o", Utility.getIcon("properties"));

			this.setValue(object);
		}

		@Override public void actionPerformed(ActionEvent evt) {
			try {
				Object val = getValue();
				showScreenBox(Utility.getPropertiesPanel(val));
			} catch (Throwable err) {
				Utility.showError(null, null, err);
			}
		}
	}

	class RemoveAction extends AbstractTriggerAction {

		RemoveAction(Object object, NamedObjectCollection noc) {
			super("Remove %o from %n", Utility.getIcon("removeFromCollection"));
			this.setValue(object);

			this.currentCollection = noc;
		}

		@Override public void actionPerformed(ActionEvent evt) {
			NamedObjectCollection col = getCurrentCollection();
			col.removeObject(getValue());
		}
	}

	class RenameAction extends AbstractTriggerAction {

		RenameAction(Object object, NamedObjectCollection noc) {
			super("Change %o label in %n");

			this.setValue(object);
			currentCollection = noc;
		}

		@Override public void actionPerformed(ActionEvent evt) {
			BT wrapper = null;//boxed;
			if (wrapper == null) {
				wrapper = currentCollection.findBoxByObject(getValue());
			}
			if (wrapper != null) {
				RenameDialog dialog = new RenameDialog(DisplayContextUIImpl.this, wrapper);
				dialog.show();
			}
		}
	}

	// ===== Inner classes ==========================
	/**
	 * A rather ugly but workable default icon used in cases where there is no
	 * known icon for the object.
	 */
	public static class UnknownIcon extends ImageIcon implements Icon, java.io.Serializable {
		private String str;
		BufferedImage image;
		private Color foreColor = Color.blue;
		private Color bgColor = Color.white;

		@Override public int getIconHeight() {
			return 16;
		}

		@Override public int getIconWidth() {
			return 16;
		}

		public UnknownIcon() {
			this("@");
		}

		public UnknownIcon(String string) {
			str = string;
		}

		public UnknownIcon(String string, Color fgc) {
			str = string;
			foreColor = fgc;
		}

		@Override public void paintIcon(Component c, Graphics g, int x, int y) {
			g.clearRect(0, 0, 16, 16);
			g.setColor(foreColor);
			g.setFont(new Font("serif", Font.BOLD, 12));
			g.drawString(str, x, y + 12);
		}

		public BufferedImage asImage() {
			if (image == null) {
				image = new BufferedImage(16, 16, BufferedImage.TYPE_INT_ARGB);
				Graphics2D g = image.createGraphics();
				g.setColor(Color.blue);
				g.setFont(new Font("serif", Font.BOLD, 12));
				g.drawString(str, 0, 0 + 12);
			}
			return image;
		}
	}

	class ViewAction extends AbstractTriggerAction {

		ViewAction(Component value) {
			super("View %o", Icons.viewObject);

			this.setValue(value);
		}

		@Override public void actionPerformed(ActionEvent evt) {
			showObjectGUI((Component) getValue());
		}
	}

	// ==== Static variables =================
	private static boolean ALLOW_MULTIPLE_WINDOWS = false;

	// ==== Other public methods =========================

	private static Logger theLogger = LoggerFactory.getLogger(DisplayContextUIImpl.class);

	JInternalFrame classBrowser = null;

	Object classBrowser_Unused = null;

	private NamedObjectCollection localCollection;

	//==== Instance variables ================
	IShowObjectMessageAndErrors globalUI;

	Adapter listener = new Adapter();

	// ==== Action classes ====================================

	// ==== Instance variables ================
	BoxPanelSwitchableView tabsUI;

	/**
	 * Creates a new context linked to the given GUI. All operations will use
	 * either the given GUI or the ObjectNavigator that it represents
	 */
	public DisplayContextUIImpl(BoxPanelSwitchableView gui, IShowObjectMessageAndErrors site, NamedObjectCollection col) {
		Utility.controlApp = this;
		this.tabsUI = gui;
		this.localCollection = col;
		this.globalUI = site;
		if (site == null) {
			throw new NullPointerException("The DisplayContextSite cannot be null");
		}
		if (col == null) {
			throw new NullPointerException("The NamedObjectCollection cannot be null");
		}
		if (gui == null) {
			throw new NullPointerException("The BoxPanelSwitchableView cannot be null");
		}
	}

	@Override public void addListener(POJOCollectionListener objectChoice, boolean catchup) {
		final POJOCollection collection = getLocalBoxedChildren();
		collection.addListener(objectChoice, catchup);
	}

	/**

	 * @param wrapper
	 * @param view
	 * @return
	 */
	private JPanel asPanel(String name, Class c, Component view, Object boxed) {

		if (view instanceof JPanel) {
			return (JPanel) view;
		}

		if (view instanceof JPanel) {
			adjustChldSize(view);
			return new ComponentHost(view, boxed);
			//BoxPanelSwitchableView bsv = Utility.getBoxPanelTabPane();
			//bsv.add(name, view);
			//return view;
		}

		if (view instanceof JComponent) {
			adjustChldSize(view);
			return new ComponentHost(view, boxed);
			//BoxPanelSwitchableView bsv = Utility.getBoxPanelTabPane();
			//bsv.add(name, view);
			//return view;
		}

		return new ComponentHost(view, boxed);
		//Object object = wrapper.getObject();
		// Create an internal frame to hold the GUI
		//ScreenBoxPanel frame = getFrame(name, c, view);

		// Make the size correct

		// Add the frame to the desk and bring it to the front
		//frame.setVisible(true);
		//return frame;
	}

	private Window createFrame(String name, Class c, Component view) {
		JFrame frame = new JFrame();
		frame.setResizable(true);
		try {
			// Get an icon for the object
			Icon icon;
			icon = Utility.getIcon(c);
			//	frame.setIconImage(new ImageIcon(icon));
		} catch (Exception e) {
		}
		// Put the GUI and icon in the frame
		frame.getContentPane().add(view);
		return frame;
	}

	private JInternalFrame createJInternalFrame(String name, Class c, Component view) {
		JInternalFrame frame = new JInternalFrame(name, true, true, true, true);
		frame.setResizable(true);
		try {
			// Get an icon for the object
			Icon icon;
			icon = Utility.getIcon(c);
			frame.setFrameIcon(icon);
		} catch (Exception e) {
		}
		// Put the GUI and icon in the frame
		frame.getContentPane().add(view);
		// Listen to the frame, so we notice if it closes
		frame.addInternalFrameListener(listener);
		BoxPanelSwitchableView bsv = Utility.getBoxPanelTabPane();
		bsv.addComponent(name, frame, DisplayType.FRAME);
		return frame;
	}

	@Override public Object findObjectByName(String name) {
		final POJOCollection collection = getLocalBoxedChildren();
		return collection.findObjectByName(name);
	}

	@Override public Collection findObjectsByType(Class type) {
		final POJOCollection collection = getLocalBoxedChildren();
		return collection.findObjectsByType(type);
	}

	@Override public ScreenBoxImpl findOrCreateBox(Object value) {
		final POJOCollection collection = getLocalBoxedChildren();
		return collection.findOrCreateBox(value);
	}

	@Override public BoxPanelSwitchableView getBoxPanelTabPane() {
		return Utility.theBoxPanelDisplayContext;
	}

	public NamedObjectCollection getCurrentCollection() {
		if (localCollection == null) {
			return Utility.getTreeBoxCollection();
		}
		return localCollection;
	}

	@Override public BrowserPanelGUI getDisplayContext() {
		return this;
	}

	/**
	 * @param m_obj
	 * @return
	 */
	private Component getFrame(String name, Class c, Component view) {
		if (view instanceof JInternalFrame) {
			return view;
		}
		if (view instanceof Frame) {
			return view;
		}
		if (true) {
			return createJInternalFrame(name, c, view);
		}
		return createJInternalFrame(name, c, view);
	}

	//==== Other public methods =========================

	@Override public NamedObjectCollection getLocalBoxedChildren() {
		if (localCollection != null)
			return localCollection;
		return Utility.getTreeBoxCollection();
	}

	@Override public Iterator getObjects() {
		final POJOCollection collection = getLocalBoxedChildren();
		return collection.getObjects();
	}

	@Override public String getTitleOf(Object object) {
		return getCurrentCollection().getTitleOf(object);
	}

	/**
	 * Returns all actions that can be carried out on the given object
	 */
	@Override public Collection getTriggersFromUI(Object object) {

		Object val = object;

		List actions = new LinkedList();
		if (object == null)
			return actions;

		//NamedObjectCollection currentCollection = getCurrentCollection();
		//addCollectionActions(object, actions, currentCollection);

		NamedObjectCollection clipboardCollection = Utility.getClipboard();
		addCollectionActions(object, actions, clipboardCollection);

		if (object instanceof Component) {
			actions.add(new ViewAction((Component) object));
		}
		actions.add(new PropertiesAction(object));

		TriggerMenuFactory.addTriggersForInstance(getDisplayContext(), object.getClass(), actions, object);

		return actions;
	}

	private void addCollectionActions(Object object, List actions, final NamedObjectCollection col) {
		object = Utility.dref(object);
		if (col != null) {
			if (col.containsObject(object)) {
				actions.add(new RenameAction(object, col));
				actions.add(new RemoveAction(object, col));
			} else {
				actions.add(new AddAction(object, col));
			}
			if (false)
				actions.add(new AbstractTriggerAction("Global", "Show " + col.getName()) {

					@Override public void actionPerformed(ActionEvent e) {
						try {
							getDisplayContext().showScreenBox(new LargeObjectChooser(null, col));
						} catch (Exception e1) {
							Debuggable.reThrowable(e1);
						}

					}
				});
		}
	}

	private JPanel objectToPanel(String title, Object object, boolean attachToUIAsap) {

		if (object instanceof JPanel) {
			JPanel pnl = (JPanel) object;
			if (title != null) {
				if (pnl.getName() == null) {
					pnl.setName(title);
				}
			}
			return pnl;
		}

		if (object == null) {
			return null;
		}
		object = Utility.dref(object);
		try {
			return getCurrentCollection().findOrCreateBox(title, object).getPropertiesPanel();
		} catch (PropertyVetoException e) {
			throw Debuggable.reThrowable(e);
		}
	}

	public void reload() {
		Debuggable.notImplemented();
	}

	@Override public void renameObject(String oldName, String newName) throws PropertyVetoException {
		final POJOCollection collection = getLocalBoxedChildren();
		collection.renameObject(oldName, newName);
	}

	/**
	 * @param view
	 * @return
	 */
	private void adjustChldSize(Component view) {
		BoxPanelSwitchableView bsv = Utility.getBoxPanelTabPane();
		Dimension deskSize = bsv.getSize(DisplayType.FRAME);
		Dimension preferred = view.getPreferredSize();
		Dimension deskMinsize = new Dimension(Math.max(100, deskSize.width), Math.max(100, deskSize.height));

		Dimension size = new Dimension(Math.min(preferred.width, deskSize.width), Math.min(preferred.height, deskSize.height));
		Dimension minsize = new Dimension(Math.max(100, size.width), Math.max(100, size.height));

		view.setSize(minsize);
	}

	//===== Event adapter classes ==================================

	@Override public UserResult showError(String msg, Throwable e) {
		return Utility.showError(null, msg, e);
	}

	@Override public UserResult showMessage(String msg, Class extraInfo) {
		return Utility.browserPanel.showMessage(msg, extraInfo);
	}

	/**
	 * For objects that happen to be Components, this method
	 * can be used to cause the value to be drawn as a component.
	 */
	public void showObjectGUI(Component value) {
		try {
			showObjectGUI(null, null, value, true);
		} catch (Throwable e) {
			throw Debuggable.reThrowable(e);
		}
	}

	private void bringToFront(Component existing) {
		existing.setVisible(true);
		existing.show();
		if (existing instanceof Frame) {
			Frame frame = (Frame) existing;
			frame.toFront();
			return;
		}
		if (existing instanceof JInternalFrame) {
			JInternalFrame frame = (JInternalFrame) existing;
			frame.toFront();
			return;
		}
		if (existing instanceof JPanel) {
			JPanel frame = (JPanel) existing;
			BoxPanelSwitchableView bpsv = Utility.getBoxPanelTabPane();
			if (bpsv.containsComponent(frame)) {
				bpsv.setSelectedComponent(frame);
				return;
			}
			bpsv.addComponent(frame.getName(), frame, DisplayType.PANEL);
			return;
		}
		Debuggable.notImplemented();
	}

	@Override public UserResult showScreenBox(String title, Object object) {
		return showScreenBoxAsResult(title, object, null);
	}

	@Override public UserResult showScreenBox(Object object) {

		return showScreenBox(null, object);
	}

	/**
	 * Opens up a GUI to show the details of the given object
	 */
	public UserResult showScreenBoxAsResult(final String title, final Object anyObject, final Class typeWhenNull) {
		return Utility.invokeAfterLoader(new Callable<UserResult>() {
			@Override public UserResult call() throws Exception {
				return showScreenBoxAsResult0(title, anyObject, typeWhenNull);
			}

			@Override public String toString() {
				return "showScreenBoxAsResult0(title=" + title + ", anyObject=" + anyObject + ", typeWhenNull=" + typeWhenNull + ")";
			}
		});
	}

	private UserResult showScreenBoxAsResult0(String title, Object anyObject, Class typeWhenNull) {

		if (anyObject == null) {
			return Utility.browserPanel.showMessage("(" + typeWhenNull + ")null", typeWhenNull);
		}
		Object guiFor = Utility.dref(anyObject);

		if (guiFor instanceof String) {
			return Utility.browserPanel.showMessage((String) guiFor, String.class);
		}

		Utility.recordCreated(guiFor);

		if (anyObject instanceof Window) {
			Window win = (Window) anyObject;
			Utility.centerWindow(win);
			win.setVisible(true);
			return Utility.asUserResult(anyObject);
		}

		JPanel pnl;
		if (anyObject instanceof Component) {
			Component comp = (Component) anyObject;
			pnl = ComponentHost.asPanel(comp, guiFor);
		} else {

			Object object = guiFor;
			// if the object can be made to a string and come back as a non string of the same value.. only show this in the message area
			Class objClass = object.getClass();
			if (Utility.isToStringType(objClass)) {
				String str = Utility.makeToString(object);
				if (title == null)
					title = str;
				Object roundTrip = null;
				try {
					roundTrip = Utility.fromString(str, objClass);
				} catch (NoSuchConversionException e) {
				}
				if (roundTrip != null) {
					if ((roundTrip.getClass() == objClass)) {
						//
						Utility.browserPanel.showMessage(str, objClass);
						return UserResult.SUCCESS;
					}
				}
				// this did not round trip maybe something more interesting like a JenaResource
			}
			pnl = objectToPanel(title, guiFor, true);
		}

		showObjectGUI(pnl.getName(), guiFor, pnl, true);
		return Utility.asUserResult(pnl);

	}

	/**
	 * Opens up a GUI to show the details of the given value
	 */
	@Override public UserResult addObject(String label, Object value, boolean showASAP) throws Exception {

		if (value instanceof Component) {
			showObjectGUI(label, null, (Component) value, showASAP);
			return Utility.asUserResult(value);
		}
		final NamedObjectCollection collection = getLocalBoxedChildren();
		BT wrapper = collection.findOrCreateBox(label, value);
		value = wrapper.getValueOrThis();
		if (label == null)
			label = wrapper.getShortLabel();
		JPanel view = wrapper.getPropertiesPanel();
		showObjectGUI(label, value, view, showASAP);
		return Utility.asUserResult(view);
	}

	public BoxPanelSwitchableView getTabUI() {
		return Utility.theBoxPanelDisplayContext;
	}

	/**
	 * For objects that happen to be Components, this method can be used to
	 * cause the object to be drawn as a component.
	 * @return
	 * @throws IntrospectionException
	 */
	private void showObjectGUI(String name, Object guiFor, Component component, boolean showASAP) {
		showObjectGUI(name, guiFor, component, showASAP, Utility.objectWindows);
	}

	private void showObjectGUI(String name, Object guiFor, Component component, boolean showASAP, PairTable objectWindows) {

		if (guiFor == null)
			guiFor = Utility.drefO(component);

		Component existing = (Component) objectWindows.findBrother(guiFor);
		if (existing == null) {
			existing = (Component) objectWindows.findBrother(component);
		}

		if (existing != null) {
			if (component == existing) {
				// all is good
				bringToFront(existing);
				return;
			} else {
				// now we have two UIs :(
			}
		}

		if (component == null && guiFor instanceof Component) {
			showObjectGUI(name, null, (Component) guiFor, showASAP);
			return;
		}

		if (component == null) {
			component = Utility.getPropertiesPanel(guiFor);
			showObjectGUI(name, guiFor, component, showASAP);
			return;
		}

		BoxPanelSwitchableView boxPanelDisplayContext = getBoxPanelTabPane();

		boolean maYAdd = true;
		if (SwingUtilities.getRootPane(component) == SwingUtilities.getRootPane(Utility.browserPanel)) {
			bringToFront(component);
			maYAdd = false;
			return;
		}

		if (component instanceof JInternalFrame) {
			JInternalFrame f = (JInternalFrame) component;
			if (!DisplayContextUIImpl.ALLOW_MULTIPLE_WINDOWS) {
				objectWindows.add(guiFor, f);
			}
			f.addInternalFrameListener(listener);
			if (maYAdd)
				boxPanelDisplayContext.addComponent(f.getTitle(), f, DisplayType.FRAME);
			if (showASAP) {
				f.toFront();
				f.show();
			}
		} else if (component instanceof JPanel) {
			if (maYAdd) {
				JPanel f = ComponentHost.asPanel(component, guiFor);

				boxPanelDisplayContext.addComponent(name, f, DisplayType.PANEL);
				if (showASAP) {
					boxPanelDisplayContext.setSelectedComponent(f);
				}
				return;
			}
		} else if (component instanceof JComponent) {
			JInternalFrame f = new JInternalFrame(name, true, true, true, true);
			//Object value = Utility.dref(object);
			f.setFrameIcon(Utility.getIcon(guiFor.getClass()));
			f.getContentPane().add(component);
			if (!DisplayContextUIImpl.ALLOW_MULTIPLE_WINDOWS) {
				objectWindows.add(guiFor, f);
			}
			f.addInternalFrameListener(listener);
			f.pack();
			boxPanelDisplayContext.addComponent(f.getTitle(), f, DisplayType.FRAME);
			if (showASAP) {
				f.toFront();
				f.show();
			}

		} else if (component instanceof Window) {
			Window window = (Window) component;
			if (!DisplayContextUIImpl.ALLOW_MULTIPLE_WINDOWS) {
				objectWindows.add(guiFor, window);
			}
			window.addWindowListener(listener);
			window.setSize(window.getPreferredSize());
			org.appdapter.gui.browse.Utility.centerWindow(window);
			if (showASAP) {
				window.show();
			}

		} else {
			JInternalFrame f = new JInternalFrame(name, true, true, true, true);
			f.getContentPane().add(component);
			f.setSize(f.getPreferredSize());
			if (!DisplayContextUIImpl.ALLOW_MULTIPLE_WINDOWS) {
				objectWindows.add(guiFor, f);
			}
			f.addInternalFrameListener(listener);
			f.pack();
			// f.setSize(f.getPreferredSize());
			// Utility.centerWindow(f);
			// f.show();
			boxPanelDisplayContext.addComponent(f.getTitle(), f, DisplayType.FRAME);
			if (showASAP) {
				f.toFront();
				f.show();
			}
		}

	}

	@Override public UserResult addObject(String title, Object anyObject, boolean showASAP, boolean expandChildren) {
		return Utility.browserPanel.addObject(title, anyObject, showASAP, expandChildren);
	}

	@Override public Collection getLiveCollection() {
		final POJOCollection collection = getLocalBoxedChildren();
		return collection.getLiveCollection();
	}

}
