package org.appdapter.gui.editors;

import static org.appdapter.gui.browse.Utility.isEqual;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyEditor;
import java.beans.PropertyEditorSupport;
import java.lang.reflect.Method;

import javax.swing.ComboBoxEditor;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultCellEditor;
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
import javax.swing.table.TableCellEditor;
import javax.swing.tree.TreeCellEditor;


import org.appdapter.core.jvm.GetObject;
import org.appdapter.core.convert.NoSuchConversionException;
import org.appdapter.core.convert.ReflectUtils;
import org.appdapter.core.convert.ToFromKeyConverter;
import org.appdapter.core.log.Debuggable;
import org.appdapter.gui.api.BT;
import org.appdapter.gui.api.NamedObjectCollection;
import org.appdapter.gui.browse.SearchableDemo;
import org.appdapter.gui.browse.Utility;
import org.appdapter.gui.swing.JJPanel;
import org.appdapter.gui.swing.PropertyValueControl;
import org.appdapter.gui.swing.PropertyValueControl.ReadOnlyObjectPanel;
import org.appdapter.gui.swing.SmallObjectView;
import org.appdapter.gui.table.CellEditorComponent;
import org.appdapter.gui.table.PropertyEditorToCellEditor;
import org.appdapter.gui.trigger.TriggerMouseAdapter;
import org.appdapter.gui.util.Annotations.UserInputComponent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A GUI widget that lets you choose among a set of objects
 * of a certain type.
 * This makes a small (text box size UI component for any Object)
 * 
 * We have this set to private since this is an inner-helper to select when to use a ObjectChoiceComboPanel
 * 
 * @author Administrator
 *
 */
public class ObjectChoiceComboPanel extends JJPanel implements PropertyEditor, PropertyChangeListener, ActionListener, //
		UserInputComponent, CellEditorComponent, //
		ToFromKeyConverter<Object, String>, ListDataListener, GetObject {

	// got this workaround from the following bug: 
	//	      http://bugs.sun.com/bugdatabase/view_bug.do?bug_id=4618607 
	public class ComboBoxWithNamingModel extends JComboBox {
		public ComboBoxWithNamingModel(ComboBoxModel aModel) {
			super(aModel);
		}

		@Override public ListCellRenderer getRenderer() {
			ListCellRenderer editor = super.getRenderer();
			if (editor instanceof ObjectComboPrettyRender)
				return editor;
			ListCellRenderer cbo = new ObjectComboPrettyRender();
			return cbo;
		}

		private boolean layingOut = false;

		public void doLayout() {
			try {
				layingOut = true;
				super.doLayout();
			} finally {
				layingOut = false;
			}
		}

		public Dimension getSize() {
			Dimension dim = super.getSize();
			if (!layingOut)
				dim.width = Math.max(dim.width, getPreferredSize().width);
			return dim;
		}

		/**
		 * Returns the editor used to paint and edit the selected item in the 
		 * <code>JComboBox</code> field.
		 *  
		 * @return the <code>ComboBoxEditor</code> that displays the selected item
		 */
		@Override public ComboBoxEditor getEditor() {
			ComboBoxEditor editor = super.getEditor();
			if (editor instanceof SynthComboBoxEditor)
				return editor;
			SynthComboBoxEditor cbo = new SynthComboBoxEditor(model);
			return cbo;
		}

		@Override public void setSelectedItem(Object anObject) {
			if (ReflectUtils.eq(selectedItemReminder, anObject, false)) {
				return;
			}
			selectedItemReminder = ReflectUtils.asObjectKey(selectedItemReminder, false);
			model.setSelectedItem(anObject);
			ComboBoxEditor cbe = getEditor();
			invalidate();
		}

		public void setSelectedIndex(int anIndex) {
			int size = model.getSize();

			if (anIndex == -1) {
				setSelectedItem(null);
			} else if (anIndex < -1 || anIndex >= size) {
				//return null;
				//throw new IllegalArgumentException("setSelectedIndex: " + anIndex + " out of bounds");
			} else {

				setSelectedItem(model.getElementAt(anIndex));
			}
		}
	}

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
			if (value == null) {
				setText("<null>");
				return this;
			}
			if (value != null && !isStringChooser && !useStringProxies && value instanceof String) {
				value = stringToObject((String) value);
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
				String title = Utility.getUniqueNameForKey(value);
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

	public static class SynthComboBoxEditor implements ComboBoxEditor {
		protected JTextField editor;
		ObjectChoiceModel model;
		private Object oldValue;

		public SynthComboBoxEditor(ObjectChoiceModel model) {
			this.model = model;
			String initialValue = model.objectToString(model.getSelectedItem());
			editor = new JTextField(initialValue, 9);
			editor.setName("ComboBox.textField");
			SearchableDemo.createAutoCompleteForText(editor, model);
		}

		@Override public void addActionListener(ActionListener l) {
			editor.addActionListener(l);
		}

		@Override public Component getEditorComponent() {
			SearchableDemo.createAutoCompleteForText(editor, model);
			Object newValue = editor.getText();
			//editor.setText(get);
			return editor;
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

		@Override public void removeActionListener(ActionListener l) {
			editor.removeActionListener(l);
		}

		@Override public void selectAll() {
			editor.selectAll();
			editor.requestFocus();
		}

		/** 
		* Sets the item that should be edited. 
		*
		* @param anObject the displayed value of the editor
		*/
		@Override public void setItem(Object anObject) {
			String text = model.objectToString(anObject);
			// workaround for 4530952
			String et = editor.getText();
			if (text == null) {
				if (et == null)
					return;
				editor.setText(text);
				return;
			}
			if (!text.equals(et)) {
				editor.setText(text);
			}
		}
	}

	static Logger theLogger = LoggerFactory.getLogger(ObjectChoiceComboPanel.class);
	public static final Object NULLOBJECT = "<null>";
	final ObjectChoiceComboPanel choice = this;
	JComboBox combo;
	NamedObjectCollection context;
	ToFromKeyConverter<Object, String> converter;
	private PropertyEditor editor = this;
	PropertyChangeSupport propSupport = new PropertyChangeSupport(this);
	PropertyEditorSupport editorSupport = new PropertyEditorSupport();
	boolean editable;
	boolean isStringChooser;
	boolean useSmallObjectViewInLists;
	boolean useStringProxies;
	ObjectChoiceModel model;
	ReadOnlyObjectPanel objectPanel = null;
	PropertyValueControl provalctrl;
	Class type = null;
	Container validator;

	public ObjectChoiceComboPanel(PropertyEditor editoR, Class type, boolean editable, PropertyValueControl pvc, Container validater) {
		this(null, type, null, null, pvc);
		if (editable) {
			if (type == String.class) {
				Utility.bug("This is not good as a non read-only string editor!");
			}
		}
		this.editor = editoR;
		provalctrl = pvc;
		this.type = type;
		this.editable = editable;
		validator = validater;
		String[] tags = getTags();
		if (tags.length < 2) {
			//	Debuggable.warn("TAGS=", tags);
		}
		populate();
		editor.addPropertyChangeListener(this);
		combo.addActionListener(this);
		combo.setMaximumRowCount(1000);
		TriggerMouseAdapter.installMouseAdapter(this);
	}

	public ObjectChoiceComboPanel(Class type, String title, Object value) {
		this(null, type, title, value, Utility.getToFromStringConverter(type));
	}

	public ObjectChoiceComboPanel(NamedObjectCollection context0, Class type0, String title, Object value, ToFromKeyConverter conv) {
		super(false);
		this.converter = conv;
		this.type = type0;
		if (context0 == null)
			context0 = Utility.getTreeBoxCollection();
		this.context = context0;
		if (type == null) {
			Utility.bug("type of value unknown: " + value);
			type = Object.class;
			useStringProxies = false;
		} else {
			this.isStringChooser = type == String.class;
			useStringProxies = Utility.isToStringType(type) && !isStringChooser;
		}
		useSmallObjectViewInLists = !useStringProxies && !isStringChooser;
		model = new ObjectChoiceModel(context, type, title, this, this, propSupport, value);
		//model.setSelectedItem(value);
		model.addListDataListener(this);
		combo = new ComboBoxWithNamingModel(model);
		//combo.setEditable(false);
		combo.setRenderer(new ObjectComboPrettyRender());
		combo.setEditor(new SynthComboBoxEditor(model));
		setLayout(new BorderLayout());
		add("Center", combo);
		//combo.addMouseListener(this);
		combo.setEditable(false);
		model.lockSelection = true;
		try {
			SearchableDemo.installSearchable(combo);
		} finally {
			model.lockSelection = false;
		}
		combo.setEditable(isStringChooser || useStringProxies);
		if (context != null)
			context.addListener(model, false);

		combo.setSelectedItem(value);
	}

	@Override public void actionPerformed(ActionEvent evt) {
		writeValue();
	}

	@Override public void addPropertyChangeListener(PropertyChangeListener p) {
		checkTransient();
		propSupport.addPropertyChangeListener(p);
	}

	private void checkTransient() {
		if (propSupport == null)
			propSupport = new PropertyChangeSupport(this);
	}

	@Override public void contentsChanged(ListDataEvent e) {
		// TODO Auto-generated method stub

	}

	@Override public Object fromKey(String title, Class type) {
		return stringToObject(title);
	}

	@Override public String getAsText() {
		return model.getObjectName(model.getSelectedItem());
	}

	public Object getBoundValue() {
		Object val = getValueSomeType();
		if (val == null)
			return null;
		if (ReflectUtils.nonPrimitiveTypeFor(type).isInstance(val))
			return val;
		NamedObjectCollection fromCollection = getNamedObjectCollection();
		BT bval = fromCollection.findBoxByObject(val);
		val = bval.convertTo(type);
		return val;
	}

	public TableCellEditor getCellEditor() {
		PropertyEditor editor = null;
		if (editor != null)
			return new PropertyEditorToCellEditor(editor);
		return new DefaultCellEditor(combo);
	}

	@Override public Component getCustomEditor() {
		if (editable) {
			return this;
		} else {
			if (objectPanel == null) {
				objectPanel = new ReadOnlyObjectPanel(type);
			}
			Object initialValue = getBoundValue();
			updateReadonlyPanel(initialValue);
			return objectPanel;
		}
	}

	@Override public String getJavaInitializationString() {
		return "???";
	}

	public NamedObjectCollection getNamedObjectCollection() {
		return context;
	}

	public String getSelectedItem() {
		return (String) model.getSelectedItem();
	}

	public Object getSelection() {
		return model.getSelectedItem();
	}

	public Object getShownValue() {
		return model.getSelectedItem();
	}

	@Override public String[] getTags() {
		String[] tags = model.getTags();
		return tags;
	}

	public TreeCellEditor getTreeCellEditor() {
		return (TreeCellEditor) getCellEditor();
	}

	@Override public Object getValue() {
		if (model == null)
			return getShownValue();
		return model.getSelectedItem();
	}

	public Object getValueSomeType() {
		Object val1 = null;
		try {
			val1 = this.getBoundValue();
		} catch (Throwable e) {
			//Debuggable.printStackTrace(e);
		}
		if (val1 != null)
			return val1;
		Object val2 = getShownValue();
		if (val1 == null && val2 == null)
			return null;
		if (val2 == null) {
			return val1;
		}
		return val2;
	}

	@Override public void intervalAdded(ListDataEvent e) {
		// TODO Auto-generated method stub

	}

	@Override public void intervalRemoved(ListDataEvent e) {
		// TODO Auto-generated method stub

	}

	@Override public boolean isPaintable() {
		return false;
	}

	/*
		@Override public void mouseClicked(MouseEvent e) {
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

		@Override public void mousePressed(MouseEvent e) {
			if (e.isPopupTrigger()) {
				showMenu(e.getX() + 5, e.getY() + 5, e);
			}
		}

		@Override public void mouseReleased(MouseEvent e) {
			if (e.isPopupTrigger()) {
				showMenu(e.getX() + 5, e.getY() + 5, e);
			}
		}*/

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

	@Override public void paintValue(Graphics gfx, Rectangle box) {
		// TODO Auto-generated method stub

	}

	private void populate() {
		String[] tags = editor.getTags();
		int len = tags.length;
		for (int i = 0; i < len; ++i) {
			combo.addItem(tags[i]);
		}
	}

	/*	public Object getObject() {
			return getBoundValue();
		}
	 */
	public void propertyChange(PropertyChangeEvent evt) {
		Object object = evt.getNewValue();
		Object oldValue = evt.getOldValue();
		String propname = evt.getPropertyName();
		readValue();

		// BeanWrapper object = (BeanWrapper) val;
		try {
			if (object == null) {
				provalctrl.setObject(null);
			} else {
				provalctrl.setObject(object);
			}
		} catch (Exception err) {
			theLogger.error("An error occurred", err);
		}
	}

	private void readValue() {
		String selected = getSelectedItem();
		if (!isEqual(editor.getAsText(), selected)) {
			setSelectedItem(editor.getAsText());
		}
	}

	public void setSelectedItem(String asText) {
		setSelection(asText);
	}

	@Override public void removePropertyChangeListener(PropertyChangeListener p) {
		checkTransient();
		propSupport.removePropertyChangeListener(p);
	}

	@Override public void setAsText(String text) throws IllegalArgumentException {
		model.setSelectedItem(text);
	}

	public void setSelection(Object object) {
		model.setSelectedItem(object);
		Object whatWasSelectedObj = model.getSelectedItem();

		if (whatWasSelectedObj != object) {
			Utility.bug("SetSelection broken  on this " + this);
		}
	}

	@Override public void setValue(Object newValue) {
		Object oldValue = getShownValue();
		if (!Utility.isEqual(oldValue, newValue)) {
			if (editable) {
				if (choice != null) {
					choice.setSelection(newValue);
					updateShownValue(newValue);
					return;
				} else {
					Debuggable.warn(" choice == null ");
				}
			} else {
				if (objectPanel == null) {
					objectPanel = new ReadOnlyObjectPanel(type);
					objectPanel.setLayout(new BorderLayout());
					//	objectPanel.setPreferredSize(MAX_TEXTWIDTH);
				}
				updateShownValue(newValue);
			}
		}
	}/*

	 private void showMenu(int x, int y, MouseEvent e) {
	 Object object = model.getSelectedItem();
	 if (object != null) {
	 	TriggerPopupMenu menu = new TriggerPopupMenu(null, e, null);
	 	menu.addMenuFromObject(object);
	 	add(menu);
	 	menu.show(this, x, y);
	 	e.consume();
	 }
	 }
	 */

	public Object stringToObject(String title) {
		if (title == null || title.equals(NULLOBJECT.toString()))
			return null;
		Object obj = stringToObjectImpl(title);
		if (obj == null || (type != null && !type.isInstance(obj))) {
			Utility.bug("stringToObjectImpl producing inccorect " + type + ": " + obj);
			obj = stringToObjectImpl(title);
		}
		return obj;
	}

	public Object stringToObjectImpl(String title) {
		if (title == null || title.equals(NULLOBJECT.toString()))
			return null;
		try {
			Object obj = model.getObject(title);
			if (obj != null) {
				return obj;
			}
		} catch (Throwable t) {

		}
		if (type == String.class)
			return title;
		try {
			if (converter != null) {
				Object obj = converter.fromKey(title, type);
				if (obj != null) {
					return obj;
				}
			}
		} catch (Throwable t) {

		}
		Object obj = context.findObjectByName(title);
		if (obj != null)
			return obj;
		if (Utility.isToStringType(type)) {
			try {
				return Utility.fromString(title, type);
			} catch (NoSuchConversionException e) {
				Debuggable.printStackTrace(e);
			}
		}
		Utility.bug("cant find " + type + " object for: " + title);
		return null;
	}

	@Override public boolean supportsCustomEditor() {
		return true;
	}

	@Override public String toKey(Object object) {
		return objectToString(object);
	}

	private void updateReadonlyPanel(Object newValue) {
		objectPanel.updateReadonlyPanel(newValue);
	}

	public void updateShownValue(Object value) {
		model.setSelectedItem(value);
	}

	private void writeValue() {
		String selected = getSelectedItem();
		if (!isEqual(editor.getAsText(), selected)) {
			try {
				editor.setAsText(selected.toString());
			} catch (Exception err) {
				theLogger.error("An error occurred while setting value of property '" + this + "'", err);
			}
			readValue();
		}
	}

}