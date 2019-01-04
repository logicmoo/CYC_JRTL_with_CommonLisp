package org.appdapter.gui.editors;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.FlowLayout;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyEditorSupport;
import java.lang.reflect.Method;
import java.util.*;

import javax.swing.ComboBoxEditor;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JTextField;
import javax.swing.ListCellRenderer;
import javax.swing.SwingConstants;
import javax.swing.event.ListDataEvent;
import javax.swing.event.ListDataListener;

import org.appdapter.core.jvm.GetObject;
import org.appdapter.bind.rdf.jena.model.JenaModelUtils;
import org.appdapter.core.convert.NoSuchConversionException;
import org.appdapter.core.convert.ReflectUtils;
import org.appdapter.core.convert.ToFromKeyConverter;
import org.appdapter.core.log.Debuggable;
import org.appdapter.gui.api.NamedObjectCollection;
import org.appdapter.gui.browse.SearchableDemo;
import org.appdapter.gui.browse.Utility;
import org.appdapter.gui.swing.JJPanel;
import org.appdapter.gui.swing.SmallObjectView;
import org.appdapter.gui.trigger.TriggerPopupMenu;

/**
 * A GUI widget that lets you choose among a set of objects
 * of a certain type.
 *
 */
public class RDFObjectChoiceComboPanel extends JJPanel implements MouseListener, ToFromKeyConverter<Object, String>, ListDataListener, GetObject {

	public static final Object NULLOBJECT = "<null>";

	PropertyEditorSupport editorSupport = new PropertyEditorSupport();

	final NamedObjectCollection context;
	PropertyChangeSupport propSupport = new PropertyChangeSupport(this);

	String rdfRestriction;
	JComboBox combo;
	final RDFObjectChoiceModel model;
	ToFromKeyConverter<Object, String> converter;

	public boolean useStringProxies;
	public boolean useSmallObjectViewInLists;
	public boolean isStringChooser;

	private Class jenatype;

	public RDFObjectChoiceComboPanel(Class jt, String rdfRestriction, String title, Object value) {
		this(jt, null, rdfRestriction, title, value, Utility.getToFromStringConverter(jt));
	}

	public RDFObjectChoiceComboPanel(Class jt, NamedObjectCollection context0, String rdfRestriction, String title, Object value, ToFromKeyConverter conv) {
		super(false);
		this.converter = conv;
		this.rdfRestriction = rdfRestriction;
		if (context0 == null)
			context0 = Utility.getTreeBoxCollection();
		this.context = context0;
		jenatype = jt;
		if (jt == null) {
			Utility.bug("type of value unknown: " + value);
			jenatype = Object.class;
			useStringProxies = false;
		} else {
			this.isStringChooser = jenatype == String.class;
			useStringProxies = Utility.isToStringType(jenatype) && !isStringChooser;
		}
		useSmallObjectViewInLists = !useStringProxies && !isStringChooser;
		model = new RDFObjectChoiceModel(jenatype, context, rdfRestriction, title, this, this, propSupport);
		model.setSelectedItem(value);
		model.addListDataListener(this);
		initGUI();

		if (context != null)
			context.addListener(model, true);

		combo.setSelectedItem(value);
	}

	@Override public void addPropertyChangeListener(PropertyChangeListener p) {
		checkTransient();
		propSupport.addPropertyChangeListener(p);
	}

	private void checkTransient() {
		if (propSupport == null)
			propSupport = new PropertyChangeSupport(this);
	}

	@Override public void removePropertyChangeListener(PropertyChangeListener p) {
		checkTransient();
		propSupport.removePropertyChangeListener(p);
	}

	public void setSelection(Object object) {
		model.setSelectedItem(object);
		Object whatWasSelectedObj = model.getSelectedBean();

		if (whatWasSelectedObj != object) {
			Utility.bug("SetSelection broken  on this " + this);
		}
	}

	public static class SynthComboBoxEditor implements ComboBoxEditor {
		protected JTextField editor;
		private Object oldValue;
		RDFObjectChoiceModel model;

		public SynthComboBoxEditor(RDFObjectChoiceModel model) {
			this.model = model;
			String initialValue = model.objectToString(model.getSelectedItem());
			editor = new JTextField(initialValue, 9);
			editor.setName("ComboBox.textField");
		}

		@Override public Component getEditorComponent() {
			SearchableDemo.createAutoCompleteForText(editor, model);
			return editor;
		}

		/** 
		* Sets the item that should be edited. 
		*
		* @param anObject the displayed value of the editor
		*/
		@Override public void setItem(Object anObject) {
			String text = model.objectToString(anObject);
			// workaround for 4530952
			if (!text.equals(editor.getText())) {
				editor.setText(text);
			}
		}

		@Override public Object getItem() {
			String title;
			Object newValue = title = editor.getText();

			if (oldValue != null && !(oldValue instanceof String)) {
				// The original value is not a string. Should return the value in it's
				// original type.
				if (newValue.equals(oldValue.toString())) {
					return oldValue;
				} else {
					// Must take the value from the editor and get the value and cast it to the new type.
					Class cls = oldValue.getClass();
					try {
						if (true)
							return model.stringToObject(title);
						Method method = cls.getMethod("valueOf", new Class[] { String.class });
						newValue = method.invoke(oldValue, new Object[] { editor.getText() });
					} catch (Exception ex) {
						// Fail silently and return the newValue (a String object)
					}
				}
			}
			return newValue;
		}

		@Override public void selectAll() {
			editor.selectAll();
			editor.requestFocus();
		}

		@Override public void addActionListener(ActionListener l) {
			editor.addActionListener(l);
		}

		@Override public void removeActionListener(ActionListener l) {
			editor.removeActionListener(l);
		}
	}

	private void initGUI() {

		combo = new JComboBox(model) {
			@Override public void setSelectedItem(Object anObject) {
				if (ReflectUtils.eq(selectedItemReminder, anObject, false)) {
					return;
				}
				selectedItemReminder = ReflectUtils.asObjectKey(selectedItemReminder, false);
				super.setSelectedItem(anObject);
			}

			/**
			 * Returns the editor used to paint and edit the selected item in the 
			 * <code>JComboBox</code> field.
			 *  
			 * @return the <code>ComboBoxEditor</code> that displays the selected item
			 */
			@Override public ComboBoxEditor getEditor() {
				ComboBoxEditor editor = super.getEditor();
				if (editor != null)
					return editor;
				SynthComboBoxEditor cbo = new SynthComboBoxEditor(model);
				return cbo;
			}

		};
		//combo.setEditable(false);
		SearchableDemo.installSearchable(combo);
		combo.setRenderer(new ObjectComboPrettyRender());
		setLayout(new BorderLayout());
		add("Center", combo);
		combo.addMouseListener(this);
		combo.setEditable(isStringChooser || useStringProxies);
	}

	@Override public void mouseClicked(MouseEvent e) {
		if (e.isPopupTrigger()) {
			showMenu(e.getX() + 5, e.getY() + 5, e);
		}
	}

	@Override public void mousePressed(MouseEvent e) {
		if (e.isPopupTrigger()) {
			showMenu(e.getX() + 5, e.getY() + 5, e);
		}
	}

	@Override public void mouseReleased(MouseEvent e) {
		if (e.isPopupTrigger()) {
			showMenu(e.getX() + 5, e.getY() + 5, e);
		}
	}

	@Override public void mouseEntered(MouseEvent e) {
		//@temp
		//label.setForeground(Color.blue);
	}

	@Override public void mouseExited(MouseEvent e) {
		//label.setForeground(Color.black);
	}

	public Object getSelection() {
		return model.getSelectedItem();
	}

	private void showMenu(int x, int y, MouseEvent e) {
		Object object = model.getSelectedBean();
		if (object != null) {
			TriggerPopupMenu menu = new TriggerPopupMenu(null, e, null);
			menu.addMenuFromObject(object);
			add(menu);
			menu.show(this, x, y);
			e.consume();
		}
	}

	public String objectToString(Object object) {
		if (object == null || object == NULLOBJECT)
			return NULLOBJECT.toString();
		if (object instanceof String)
			return (String) object;
		try {
			if (converter != null) {
				Object key = converter.toKey(object);
				if (key instanceof String)
					return (String) key;

			}
		} catch (Throwable t) {
			t.printStackTrace();
		}
		return Utility.getUniqueNameForKey(object, context);
	}

	public Object stringToObject(String title) {
		if (title == null || title.equals(NULLOBJECT.toString()))
			return null;
		Object obj = stringToObjectImpl(title);
		if (obj == null || (rdfRestriction != null &&  !RDFObjectChoiceModel.isInstance(rdfRestriction, obj))) {
			obj = stringToObjectImpl(title);
			Utility.bug("stringToObjectImpl producing inccorect " + rdfRestriction + ": " + obj);
		}
		return obj;
	}

	public Object stringToObjectImpl(String title) {
		if (title == null || title.equals(NULLOBJECT.toString()))
			return null;
		if (jenatype == String.class)
			return title;

		if (converter != null) {
			Object obj = converter.fromKey(title, jenatype);
			if (obj != null) {
				return obj;
			}
		}
		Object obj = context.findObjectByName(title);
		if (obj != null)
			return obj;
		if (Utility.isToStringType(jenatype)) {
			try {
				return Utility.fromString(title, jenatype);
			} catch (NoSuchConversionException e) {
				Debuggable.printStackTrace(e);
			}
		}
		Utility.bug("cant find " + jenatype + " object for: " + title);
		return null;
	}

	Map<String, Object> s2o = new HashMap();
	Map<Object, String> o2s = new HashMap();

	class ObjectComboPrettyRender extends JLabel implements ListCellRenderer {

		public ObjectComboPrettyRender() {
			setOpaque(true);
			setHorizontalAlignment(CENTER);
			setVerticalAlignment(CENTER);
		}

		/*
		* This method finds the image and text corresponding
		* to the selected value and returns the label, set up
		* to display the text and image.
		*/
		@Override public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
			JComponent view = this;
			if (value != null && value == NULLOBJECT) {
				value = null;
			}
			if (value != null && useSmallObjectViewInLists) {
				String title = null;

				view = new SmallObjectView(null, context, value, title, true, true, true, true) {
					@Override public boolean isRemovable(Object value) {
						return false;
					}
				};
			} else {
				//Set the icon and text.  If icon was null, say so.
				ImageIcon icon = null;// images[selectedIndex];
				String title = Utility.getUniqueNamePretty(value);
				if (icon != null) {
					setIcon(icon);
				} else {
					//setUhOhText(pet + " (no image available)", list.getFont());
				}
				this.setLayout(new FlowLayout(FlowLayout.LEFT));
				setHorizontalAlignment(SwingConstants.LEFT);
				setText(title);
				setFont(list.getFont());
			}

			if (isSelected) {
				view.setBackground(list.getSelectionBackground());
				view.setForeground(list.getSelectionForeground());
			} else {
				view.setBackground(list.getBackground());
				view.setForeground(list.getForeground());
			}
			return view;
		}

	}

	@Override public Object getValue() {
		if (model == null)
			return model;
		return model.getSelectedBean();
	}

	@Override public Object fromKey(String title, Class type) {
		return stringToObject(title);
	}

	@Override public String toKey(Object object) {
		return objectToString(object);
	}

	@Override public void intervalAdded(ListDataEvent e) {
		// TODO Auto-generated method stub

	}

	@Override public void intervalRemoved(ListDataEvent e) {
		// TODO Auto-generated method stub

	}

	@Override public void contentsChanged(ListDataEvent e) {
		// TODO Auto-generated method stub

	}

}