package org.appdapter.gui.swing;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.Customizer;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyEditor;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.text.JTextComponent;

import org.appdapter.core.convert.ReflectUtils;
import org.appdapter.gui.api.BT;
import org.appdapter.gui.api.POJOCollectionListener;
import org.appdapter.gui.browse.SearchableDemo;
import org.appdapter.gui.browse.Utility;
import org.appdapter.gui.demo.DemoBrowser;
import org.appdapter.gui.util.ClassFinder;
import org.appdapter.gui.util.PromiscuousClassUtilsA;

import com.jidesoft.swing.AutoCompletion;
import com.jidesoft.swing.ComboBoxSearchable;

public class ClassChooserPanel extends JPanel implements ActionListener, DocumentListener, POJOCollectionListener, PropertyChangeListener {

	final static Class[] CLASS0 = new Class[0];
	final static PropertyChangeSupport grovelerPCL = new PropertyChangeSupport(CLASS0);

	static Object classesSavedLock = new Object();
	static HashSet<Class> classesSaved = new HashSet<Class>();
	static Thread classGroveler;
	static Class[] knownClasses = new Class[0];
	static {
		synchronized (classesSavedLock) {

			classesSaved.add(String.class);
			classesSaved.add(Boolean.class);
			classesSaved.add(Integer.class);
			classesSaved.add(HashMap.class);
			classesSaved.add(List.class);
			classesSaved.add(Float.class);
			knownClasses = classesSaved.toArray(CLASS0);
		}
	}

	private static void addChooser(JPanel pnl, String pn, Class... superClasses) {
		ClassChooserPanel list;
		list = new ClassChooserPanel();
		list.setAncestors(superClasses);
		list.addPackageName(pn);
		pnl.add(list);
	}

	public static void addGrovelerPropertyChangeListener(PropertyChangeListener listener) {
		synchronized (getObjectLock()) {
			if (listener == null) {
				return;
			}
			grovelerPCL.addPropertyChangeListener(listener);
		}
	}

	public static void addGrovelerPropertyChangeListener(String propertyName, PropertyChangeListener listener) {
		synchronized (getObjectLock()) {
			if (listener == null) {
				return;
			}
			grovelerPCL.addPropertyChangeListener(propertyName, listener);
		}
	}

	static boolean classAdd0(Class clz) {

		synchronized (classesSavedLock) {
			if (!classesSaved.add(clz))
				return false;
		}
		fireMoreNewClasses();
		return true;
	}

	static void fireMoreNewClasses() {
		synchronized (classesSavedLock) {
			knownClasses = null;
			getKnownClasses();
		}
		grovelerPCL.firePropertyChange("classes", null, knownClasses);
	}

	static void startClassGroveler() {

		if (classGroveler == null) {
			classGroveler = new Thread("Class groveler") {
				@Override
				public void run() {

					int lastSize = 0;
					try {
						ClassFinder.getClassNames("");
					} catch (Exception e1) {
					}
					while (true) {
						try {
							Thread.sleep(30000);
							ArrayList<Class> al = PromiscuousClassUtilsA.getInstalledClasses();
							int size = al.size();
							if (size == lastSize)
								continue;
							synchronized (classesSavedLock) {
								classesSaved.addAll(al);
							}
							lastSize = size;
							fireMoreNewClasses();
						} catch (Throwable e) {
							e.printStackTrace();
							continue;
						}

					}
				}
			};
			classGroveler.start();
		}

	}

	static public void classAdded(Class clz) {
		if (clz == null)
			return;
		if (!classAdd0(clz))
			return;
		for (Class c : clz.getInterfaces()) {
			classAdd0(c);
		}
		classAdded(clz.getSuperclass());

	}

	static Object getObjectLock() {
		return grovelerPCL;
	}

	public static void main(String[] args) {
		try {
			JFrame frame = new JFrame("Test") {
				@Override
				public java.awt.Dimension getPreferredSize() {
					return new Dimension(400, 400);
				};
			};
			JPanel pnl = new JPanel();

			addChooser(pnl, "", PropertyEditor.class);
			addChooser(pnl, "", Customizer.class);
			addChooser(pnl, "", Customizer.class, Component.class);

			frame.getContentPane().add(pnl);
			frame.pack();
			frame.show();
		} catch (Throwable err) {
			err.printStackTrace();
		}
	}

	public static void removeGrovelerPropertyChangeListener(PropertyChangeListener listener) {
		synchronized (getObjectLock()) {
			if (listener == null || grovelerPCL == null) {
				return;
			}
			grovelerPCL.removePropertyChangeListener(listener);
		}
	}

	public static void removeGrovelerPropertyChangeListener(String propertyName, PropertyChangeListener listener) {
		synchronized (getObjectLock()) {
			if (listener == null || grovelerPCL == null) {
				return;
			}
			grovelerPCL.removePropertyChangeListener(propertyName, listener);
		}
	}

	Class[] ansestors = new Class[] { Object.class };

	AutoCompletion autoCompletion;

	JButton classBrowserButton;

	HashSet<String> classesShownHere = new HashSet<String>();

	JComboBox classField;

	List<String> packageNames = new ArrayList<String>();

	ComboBoxSearchable searchable;

	Class selectedClass = String.class;
	private AutoCompletion autocomplete;

	public ClassChooserPanel() {
		super(true);
		Utility.registerEditors();
		Utility.setBeanInfoSearchPath();
		initGUI();
		Utility.uiObjects.addListener(ClassChooserPanel.this, true);
		addGrovelerPropertyChangeListener("classes", this);
		startClassGroveler();
	}

	@Override public void actionPerformed(ActionEvent evt) {
		Object evtsrc = evt.getSource();
		classBrowserButton.setEnabled(true);
		if (evtsrc == classField) {
			String className = (String) classField.getSelectedItem();
			if (className == null) {
				selectedClass = null;
			} else {
				try {
					selectedClass = PromiscuousClassUtilsA.forName(className);
				} catch (Throwable e) {
				}
			}
			classBrowserButton.setEnabled(selectedClass != null);
		} else {
			if (evtsrc == classBrowserButton) {
				openClassBrowser();
			}
		}
	}

	public void addPackageName(String pn) {
		packageNames.add(pn);
		updatedClassFilter();
	}

	private void adjustSize() {
		Container p = getParent();
		if (p != null) {
			setSize(p.getSize());
		}
	}

	@Override public void changedUpdate(DocumentEvent e) {
		classFieldChanged();
	}

	private void classFieldChanged() {
		try {
			final JTextComponent tc = (JTextComponent) classField.getEditor().getEditorComponent();
			selectedClass = PromiscuousClassUtilsA.forName(tc.getText());
		} catch (Exception err) {
			selectedClass = null;
		}
		classBrowserButton.setEnabled(selectedClass != null || true);
	}

	static Class[] getKnownClasses() {
		synchronized (classesSavedLock) {
			if (knownClasses == null) {
				knownClasses = classesSaved.toArray(CLASS0);
			}
			return knownClasses;
		}
	}

	public Object getValue() {
		return selectedClass;
	}

	private void installSearchable() {
		if (autoCompletion == null) {
			this.autocomplete = SearchableDemo.installSearchable(classField);
			this.searchable = (ComboBoxSearchable) this.autocomplete.getSearchable();
		}
	}

	void initGUI() {
		removeAll();

		classBrowserButton = new JButton("Examine...");
		classBrowserButton.setToolTipText("Opens a new window that lets you examine classes and create new object instances");
		classBrowserButton.addActionListener(this);
		classBrowserButton.setEnabled(false);
		//classBrowserButton.setActionCommand(COMMAND_CREATE_BEAN);

		DefaultComboBoxModel dcm = new SortedComboBoxModel();

		classField = new JComboBox(dcm);

		classField.setSize(400, (int) classField.getSize().getHeight());
		classField.addActionListener(this);
		classField.setEnabled(true);

		final JTextComponent tc = (JTextComponent) classField.getEditor().getEditorComponent();
		tc.getDocument().addDocumentListener(this);

		setBorder(new TitledBorder("Class browser"));
		setLayout(new BorderLayout());
		add("North", new JLabel("Full class name:"));
		add("Center", classField);
		add("East", classBrowserButton);
		adjustSize();
		updatedClassFilter();
		installSearchable();
	}

	@Override public void insertUpdate(DocumentEvent e) {
		classFieldChanged();
	}

	protected boolean meetsFilter(Class c) {
		if (!ReflectUtils.implementsAllClasses(c, ansestors))
			return false;
		//String pn = c.getPackage().getName();
		//if (pn.)
		return true;
	}

	private synchronized void openClassBrowser() {
		if (selectedClass != null) {
			try {
				DemoBrowser.showObject(null, selectedClass, true, false);
			} catch (Throwable err) {
				Utility.showError(null, null, err);
			}
		}
	}

	@Override public void pojoAdded(Object obj, BT box, Object senderCollection) {
		synchronized (classesSavedLock) {
			if (obj instanceof Class) {
				classAdded((Class) obj);
			} else {
				if (obj != null)
					classAdded(obj.getClass());
			}
		}
		//invalidate();
	}

	@Override public void pojoRemoved(Object obj, BT box, Object senderCollection) {
		// TODO Auto-generated method stub

	}

	@Override public void propertyChange(PropertyChangeEvent evt) {
		/*  JIDESOFT
		 */
		installSearchable();
		if (!evt.getPropertyName().equals("classes"))
			return;
		updatedClassFilter();

	}

	@Override public void removeUpdate(DocumentEvent e) {
		classFieldChanged();
	}

	public void setAncestors(Class... cls) {
		ansestors = cls;
		clearList();
		updatedClassFilter();
	}

	private void clearList() {
		Utility.invokeAndWait(new Runnable() {

			@Override public void run() {
				try {
					classField.setEnabled(false);
					synchronized (classesShownHere) {
						classesShownHere.clear();
						classField.removeAll();
					}
				} finally {
					classField.setEnabled(true);
				}
			}
		});
	}

	CantankerousJob cj = new CantankerousJob("updatedClassFilter", this, false) {
		@Override public void run() {
				updatedClassFilter0();
		}
	};

	private void updatedClassFilter() {
		cj.attempt();
	}

	private void updatedClassFilter0() {
		final Class[] copy = getKnownClasses();
		Utility.invokeLater(new Runnable() {

			@Override public void run() {
				try {
					classField.setEnabled(false);
					synchronized (classesShownHere) {
						for (Class c : copy) {
							if (meetsFilter(c)) {
								String cn = c.getName();
								if (classesShownHere.add(cn)) {
									classField.addItem(cn);
								}
							}

						}
					}
				} finally {
					classField.setEnabled(true);
				}
			}
		});

	}

}