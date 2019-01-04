package org.appdapter.gui.swing;

import static org.appdapter.core.convert.ReflectUtils.*;
import static org.appdapter.core.log.Debuggable.*;
import static org.appdapter.gui.browse.Utility.*;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.beans.BeanInfo;
import java.beans.EventSetDescriptor;
import java.beans.IntrospectionException;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyDescriptor;
import java.beans.PropertyEditor;
import java.beans.PropertyEditorSupport;
import java.lang.reflect.*;
import java.util.Collection;
import java.util.ConcurrentModificationException;
import java.util.NoSuchElementException;

import javax.swing.DefaultCellEditor;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.table.TableCellEditor;
import javax.swing.tree.TreeCellEditor;

import org.appdapter.core.jvm.GetObject;
import org.appdapter.core.convert.ReflectUtils;
import org.appdapter.core.convert.ToFromKeyConverter;
import org.appdapter.core.log.Debuggable;
import org.appdapter.core.name.Ident;
import org.appdapter.gui.api.BT;
import org.appdapter.gui.api.DisplayContext;
import org.appdapter.gui.api.GetSetObject;
import org.appdapter.gui.api.IValidate;
import org.appdapter.gui.api.NamedObjectCollection;
import org.appdapter.gui.browse.SearchableDemo;
import org.appdapter.gui.browse.Utility;
import org.appdapter.gui.editors.GoodPropertyEditorSupport;
import org.appdapter.gui.editors.ObjectChoiceComboPanel;
import org.appdapter.gui.editors.ObjectChoiceModel;
import org.appdapter.gui.editors.StringEditor;
import org.appdapter.gui.editors.ValueEditor;
import org.appdapter.gui.table.CellEditorComponent;
import org.appdapter.gui.table.PropertyEditorToCellEditor;
import org.appdapter.gui.trigger.TriggerMouseAdapter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.hp.hpl.jena.shared.JenaException;

import org.appdapter.gui.util.Annotations.UserInputComponent;

@SuppressWarnings({ "serial" })
public class PropertyValueControl extends JVPanel implements PropertyEditor, PropertyChangeListener, IValidate, GetSetObject, ValueEditor, CellEditorComponent, org.appdapter.core.convert.ToFromKeyConverter<Object, String> {

	Object valueLock = new Object();

	/**
	 * Displays a list of fixed values to choose from.
	 */
	static public class ComboBoxInputComponent_Unused extends JComboBox implements PropertyChangeListener, ActionListener, UserInputComponent, CellEditorComponent {
		PropertyEditor editor;
		private Class type;

		PropertyValueControl pvc;

		@Override public Object getValue() {
			return editor.getValue();
		}

		//final PropertyDescriptor property0;

		public ComboBoxInputComponent_Unused(PropertyEditor editor, Class typ, PropertyValueControl pvc) {
			this.pvc = pvc;
			this.editor = editor;
			this.type = typ;
			populate();
			editor.addPropertyChangeListener(this);
			addActionListener(this);
			setMaximumRowCount(1000);
			TriggerMouseAdapter.installMouseAdapter(this);
		}

		@Override public void actionPerformed(ActionEvent evt) {
			writeValue();
		}

		private void populate() {
			String[] tags = editor.getTags();
			if (tags == null)
				tags = getPVTags(null, editor, type);
			int len = tags.length;
			for (int i = 0; i < len; ++i) {
				addItem(tags[i]);
			}
		}

		@Override public void propertyChange(PropertyChangeEvent evt) {
			readValue();
		}

		private void readValue() {
			String selected = getSelectedItem();
			if (!isEqual(editor.getAsText(), selected)) {
				setSelectedItem(editor.getAsText());
			}
		}

		@Override public String getSelectedItem() {
			return (String) pvc.toKey(getValue());
		}

		private void writeValue() {
			String selected = getSelectedItem();
			if (!isEqual(editor.getAsText(), selected)) {
				try {
					editor.setAsText(selected.toString());
				} catch (Exception err) {
					PropertyValueControl.theLogger.error("An error occurred while setting value of property '" + this + "'", err);
				}
				readValue();
			}
		}

		@Override public TableCellEditor getCellEditor() {
			if (editor != null)
				return new PropertyEditorToCellEditor(editor);
			return new DefaultCellEditor(this);
		}

		@Override public Component getCustomEditor() {
			return this;
		}

		@Override public TreeCellEditor getTreeCellEditor() {
			return (TreeCellEditor) getCellEditor();
		}
	}

	static public class ReadOnlyObjectPanel extends JJPanel implements GetObject {
		JLabel label = null;
		SmallObjectView view = null;
		Object shownObjectValue;
		Class type = null;

		public ReadOnlyObjectPanel(Class typ) {
			this.type = typ;
			setLayout(new BorderLayout());
			TriggerMouseAdapter.installMouseAdapter(this);
		}

		public synchronized void updateReadonlyPanel(Object newValue) {
			if (shownObjectValue == newValue) {
				return;
			}
			shownObjectValue = newValue;
			if (newValue != null) {
				type = newValue.getClass();
			}
			removeAll();
			if (newValue == null) {
				Class type2 = type;
				if (label == null)
					label = new JLabel("(" + type2.getName() + ")null");
				view = null;
				add(label);
			} else {
				label = null;
				view = new SmallObjectView(null, null, newValue);
				add(view);
			}
			invalidate();
		}
	}

	/**
	 * This makes a small (text box size UI component for any Object)
	 * 
	 * We have this set to private since this is an inner-helper to select when to use a ObjectChoiceComboPanel
	 * 
	 * @author Administrator
	 * 
	 */
	static public class ObjectReferenceEditor extends GoodPropertyEditorSupport implements PropertyChangeListener {

		ObjectChoiceComboPanel choice = null;
		boolean editable;
		ReadOnlyObjectPanel objectPanel = null;
		//NamedObjectCollection fromCollection = null;
		final PropertyValueControl provalctrl;
		Class type = null;
		final Container validator;

		public ObjectReferenceEditor(Class type, boolean editable, PropertyValueControl pvc, Container validater) {
			if (editable) {
				if (type == String.class) {
					Utility.bug("This is not good as a non read-only string editor!");
				}
			}

			provalctrl = pvc;
			this.type = type;
			this.editable = editable;
			validator = validater;
			String[] tags = getTags();
			if (tags.length < 2) {
				//	Debuggable.warn("TAGS=", tags);
			}
		}

		@Override public String[] getTags() {
			String[] tags = super.getTags();
			/*if (editor != null) {
				tags = editor.getTags();
			}*/
			if (tags == null) {
				tags = getPVTags(provalctrl.getNamedObjectCollection(), provalctrl.currentEditor, type);
			}
			return tags;
		}

		@Override public Component getCustomEditor() {
			if (editable) {
				if (choice == null) {
					NamedObjectCollection fromCollection = provalctrl.getNamedObjectCollection();
					Object initialValue = getBoundValue();
					choice = new ObjectChoiceComboPanel(fromCollection, type, provalctrl.title, initialValue, provalctrl);
					choice.addPropertyChangeListener(this);
				}
				return choice;
			} else {
				if (objectPanel == null) {
					objectPanel = new ReadOnlyObjectPanel(type);
				}
				Object initialValue = getBoundValue();
				updateReadonlyPanel(initialValue);
				return objectPanel;
			}
		}

		private void updateReadonlyPanel(Object newValue) {
			objectPanel.updateReadonlyPanel(newValue);

		}

		/*	public Object getObject() {
				return getBoundValue();
			}
		 */
		@Override public void propertyChange(PropertyChangeEvent evt) {
			Object object = evt.getNewValue();
			Object oldValue = evt.getOldValue();
			String propname = evt.getPropertyName();
			// BeanWrapper object = (BeanWrapper) val;
			try {
				if (object == null) {
					provalctrl.setObject(null);
				} else {
					provalctrl.setObject(object);
				}
			} catch (Exception err) {
				PropertyValueControl.theLogger.error("An error occurred", err);
			}
		}

		@Override public void setValue(Object newValue) {
			Object oldValue = getShownValue();
			if (!isEqual(oldValue, newValue)) {
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
						objectPanel.setPreferredSize(MAX_TEXTWIDTH);
					}
					updateShownValue(newValue);
				}
			}
		}

		@Override public boolean supportsCustomEditor() {
			return true;
		}

		@Override public Object getValue() {
			return getShownValue();
		}

		public Object getBoundValue() {
			Object val = getValueSomeType();
			if (val == null)
				return null;
			if (ReflectUtils.nonPrimitiveTypeFor(type).isInstance(val))
				return val;
			NamedObjectCollection fromCollection = provalctrl.getNamedObjectCollection();
			BT bval = fromCollection.findBoxByObject(val);
			val = bval.convertTo(type);
			return val;
		}

		public Object getValueSomeType() {
			Object val1 = null;
			try {
				val1 = this.getPropertyValueControl().getBoundValue();
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

		public Object getShownValue() {
			return super.getValue();
		}

		public void updateShownValue(Object value) {
			super.setValue(value);
		}

		PropertyValueControl getPropertyValueControl() {
			return provalctrl;
		}

	}

	/**
	 * This makes a small (text box size UI component for any Object)
	 * 
	 * We have this set to private since this is an inner-helper to select when to use a ObjectChoiceComboPanel
	 * 
	 * @author Administrator
	 * 
	 */
	public static class RDFObjectReferenceEditor extends GoodPropertyEditorSupport implements PropertyChangeListener {

		ObjectChoiceComboPanel choice = null;
		boolean editable;
		ReadOnlyObjectPanel objectPanel = null;
		//NamedObjectCollection fromCollection = null;
		final PropertyValueControl provalctrl;
		Class type = null;
		final Container validator;

		public RDFObjectReferenceEditor(Class type, String rdfRestriction, boolean editable, PropertyValueControl pvc, Container validater) {
			if (editable) {
				if (type == String.class) {
					Utility.bug("This is not good as a non read-only string editor!");
				}
			}

			provalctrl = pvc;
			this.type = type;
			this.editable = editable;
			validator = validater;
			String[] tags = getTags();
			if (tags.length < 2) {
				//	Debuggable.warn("TAGS=", tags);
			}
		}

		@Override public String[] getTags() {
			String[] tags = super.getTags();
			/*if (editor != null) {
				tags = editor.getTags();
			}*/
			if (tags == null) {
				tags = getPVTags(provalctrl.getNamedObjectCollection(), provalctrl.currentEditor, type);
			}
			return tags;
		}

		@Override public Component getCustomEditor() {
			if (editable) {
				if (choice == null) {
					NamedObjectCollection fromCollection = provalctrl.getNamedObjectCollection();
					Object initialValue = getBoundValue();
					choice = new ObjectChoiceComboPanel(fromCollection, type, provalctrl.title, initialValue, provalctrl);
					choice.addPropertyChangeListener(this);
				}
				return choice;
			} else {
				if (objectPanel == null) {
					objectPanel = new ReadOnlyObjectPanel(type);
				}
				Object initialValue = getBoundValue();
				updateReadonlyPanel(initialValue);
				return objectPanel;
			}
		}

		private void updateReadonlyPanel(Object newValue) {
			objectPanel.updateReadonlyPanel(newValue);

		}

		/*	public Object getObject() {
				return getBoundValue();
			}
		 */
		@Override public void propertyChange(PropertyChangeEvent evt) {
			Object object = evt.getNewValue();
			Object oldValue = evt.getOldValue();
			String propname = evt.getPropertyName();
			// BeanWrapper object = (BeanWrapper) val;
			try {
				if (object == null) {
					provalctrl.setObject(null);
				} else {
					provalctrl.setObject(object);
				}
			} catch (Exception err) {
				PropertyValueControl.theLogger.error("An error occurred", err);
			}
		}

		@Override public void setValue(Object newValue) {
			Object oldValue = getShownValue();
			if (!isEqual(oldValue, newValue)) {
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
						objectPanel.setPreferredSize(MAX_TEXTWIDTH);
					}
					updateShownValue(newValue);
				}
			}
		}

		@Override public boolean supportsCustomEditor() {
			return true;
		}

		@Override public Object getValue() {
			return getShownValue();
		}

		public Object getBoundValue() {
			Object val = getValueSomeType();
			if (val == null)
				return null;
			if (ReflectUtils.nonPrimitiveTypeFor(type).isInstance(val))
				return val;
			NamedObjectCollection fromCollection = provalctrl.getNamedObjectCollection();
			BT bval = fromCollection.findBoxByObject(val);
			val = bval.convertTo(type);
			return val;
		}

		public Object getValueSomeType() {
			Object val1 = null;
			try {
				val1 = this.getPropertyValueControl().getBoundValue();
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

		public Object getShownValue() {
			return super.getValue();
		}

		public void updateShownValue(Object value) {
			super.setValue(value);
		}

		PropertyValueControl getPropertyValueControl() {
			return provalctrl;
		}

	}

	static public class TextBasedInputComponent extends JTextField implements PropertyChangeListener, ActionListener, FocusListener, UserInputComponent, CellEditorComponent {
		PropertyEditor editor;

		@Override public Object getValue() {
			return editor.getValue();
		}

		public TextBasedInputComponent(PropertyEditor editor, Class type, JComponent comp, Object initalValue) {
			this.setPreferredSize(MAX_TEXTWIDTH);
			this.editor = editor;
			editor.addPropertyChangeListener(this);
			addActionListener(this);
			addFocusListener(this);
			ObjectChoiceModel ocm = Utility.getObjectChoiceModel(type, comp, null, initalValue);
			SearchableDemo.createAutoCompleteForText(this, ocm);
			ocm.setSelectedItem(initalValue);
			TriggerMouseAdapter.installMouseAdapter(this);
		}

		@Override public void actionPerformed(ActionEvent evt) {
			writeValue();
		}

		@Override public void focusGained(FocusEvent e) {
		}

		@Override public void focusLost(FocusEvent e) {
			writeValue();
		}

		@Override public void propertyChange(PropertyChangeEvent evt) {
			readValue();
		}

		private void readValue() {
			if (!isEqual(getText(), editor.getAsText())) {
				setText(editor.getAsText());
			}
		}

		private void writeValue() {
			if (!isEqual(getText(), editor.getAsText())) {
				try {
					editor.setAsText(getText());
				} catch (Exception err) {
					PropertyValueControl.theLogger.error("An error occurred", err);
				}
				readValue();
			}
		}

		@Override public TableCellEditor getCellEditor() {
			if (editor != null)
				return new PropertyEditorToCellEditor(editor);
			return new DefaultCellEditor(this);
		}

		@Override public Component getCustomEditor() {
			return this;
		}

		@Override public TreeCellEditor getTreeCellEditor() {
			return (TreeCellEditor) getCellEditor();
		}
	}

	public static final Dimension MAX_TEXTWIDTH = new Dimension(600, 24);

	static public class TextBasedViewComponent extends JLabel implements PropertyChangeListener, CellEditorComponent, IsReference {
		PropertyEditor editor;
		String title;

		@Override public Object getValue() {
			return editor.getValue();
		}

		public TextBasedViewComponent(PropertyEditor editor, PropertyValueControl pvc) {
			this.setPreferredSize(MAX_TEXTWIDTH);
			this.editor = editor;
			this.title = pvc.title;
			editor.addPropertyChangeListener(this);
			TriggerMouseAdapter.installMouseAdapter(this);
			readValue();
		}

		String getEditorAsText() {
			try {
				Object isNull = editor.getValue();
				if (isNull == null) {
					return null;
				}
				return editor.getAsText();
			} catch (Exception e) {
				//e.printStackTrace();
				//return e.getMessage();
				return null;
			}
		}

		@Override public String getText() {
			try {
				return super.getText();
			} catch (Exception e) {
				return e.getMessage();
			}
		}

		@Override public void propertyChange(PropertyChangeEvent evt) {
			readValue();
		}

		private void readValue() {
			String et = getEditorAsText();
			if (!isEqual(getText(), et)) {
				setText(et);
			}
		}

		JTextField readOnly = null;

		JTextField getReadOnlyTextField() {
			if (readOnly == null) {
				readOnly = new JTextField(getText());
				readOnly.setPreferredSize(MAX_TEXTWIDTH);
				readOnly.setEditable(false);
				readOnly.setName(title);
				readOnly.setDropTarget(null);
			}
			return readOnly;
		}

		@Override public TableCellEditor getCellEditor() {
			if (editor != null)
				return new PropertyEditorToCellEditor(editor);
			return new DefaultCellEditor(getReadOnlyTextField());
		}

		@Override public Component getCustomEditor() {
			return this;
		}

		@Override public TreeCellEditor getTreeCellEditor() {
			return (TreeCellEditor) getCellEditor();
		}
	}

	static Logger theLogger = LoggerFactory.getLogger(PropertyValueControl.class);

	private static Object getDefaultValue(Class type) {
		if (type == null || !type.isPrimitive()) {
			return null;
		} else {
			if (type == Boolean.TYPE) {
				return new Boolean(false);
			} else if (type == Integer.TYPE) {
				return new Integer(0);
			} else if (type == Short.TYPE) {
				return new Short((short) 0);
			} else if (type == Long.TYPE) {
				return new Long(0);
			} else if (type == Short.TYPE) {
				return new Short((short) 0);
			} else if (type == Double.TYPE) {
				return new Double(0);
			} else if (type == Character.TYPE) {
				return new Character((char) 0);
			} else if (type == Byte.TYPE) {
				return new Byte((byte) 0);
			} else {
				PropertyValueControl.theLogger.error("Strange, I don't recognize the primitive type " + type + ", so I can't determine the default value. I will use null.");
				return null;
			}
		}
	}

	public ToFromKeyConverter getToFromConv() {
		if (converter == null && type != null && type != Object.class) {
			converter = Utility.getToFromStringConverter(type);
		}
		if (converter == null)
			return Utility.FROM_STRING_NOT_SPECIALIZED;
		return converter;
	}

	public Class getReturnType() {
		Class pt = type;
		if (pt != null)
			return pt;
		if (field != null) {
			pt = field.getType();
			if (pt != null)
				return pt;
		}
		if (property != null) {
			pt = property.getPropertyType();
			if (pt != null)
				return pt;
			Method rm = property.getReadMethod();
			if (rm != null) {
				pt = rm.getReturnType();
				if (pt != void.class)
					return pt;
			} else {
				rm = property.getWriteMethod();
				if (rm != null) {
					Class[] pts = rm.getParameterTypes();
					if (pts.length > 0) {
						pt = pts[0];
						if (pt != null)
							return pt;
					}
				}
			}
		} else {

		}
		return pt;
	}

	private static PropertyDescriptor getPropertyDescriptor(Object object, String propName) throws IntrospectionException {
		BeanInfo info = getBeanInfo(object.getClass(), object);
		PropertyDescriptor[] array = info.getPropertyDescriptors();
		int len = array.length;
		for (int i = 0; i < len; ++i) {
			PropertyDescriptor pd = array[i];
			if (pd.getName().equals(propName)) {
				return pd;
			}
		}
		throw new IntrospectionException("No such property: " + propName);
	}

	DisplayContext context = getCurrentContext();
	public PropertyEditor currentEditor = null;

	boolean editable = true;

	PropertyDescriptor property = null;
	Field field = null;
	CellEditorComponent cellEditor;
	boolean showLabel = false;

	Object source = null;

	Class type = null;
	public ToFromKeyConverter converter;

	Object value = null;

	private String title;
	boolean isStatic;
	private boolean isBoundToThis;

	public PropertyValueControl() {
		this((String) null, (Object) null, true);
	}

	public PropertyValueControl(String title, boolean editable) {
		this(title, (Object) null, editable);
	}

	public PropertyValueControl(String title, Class type, boolean editable) {
		this(getCurrentContext(), title, type, editable);
	}

	/**
	 * Creates an unbound PropertyValueControl of the given type. It will be initialized to a default value, for non-primitive this is null and for primitives it is 0, false, or whatever.
	 */
	public PropertyValueControl(DisplayContext context, String title, Class type, boolean editable) {
		this(context, title, type, editable, null);
	}

	public PropertyValueControl(DisplayContext context, String title, Class type, boolean editable, ToFromKeyConverter conv) {
		converter = conv;
		this.title = title;
		if (context != null) {
			this.context = context;
		}
		this.type = type;
		this.editable = editable;
		value = getDefaultValue(type);
		recreateGUI();
	}

	public PropertyValueControl(DisplayContext context, String title, Object source, PropertyDescriptor property) {
		this.title = title;
		this.property = property;
		this.source = source;
		if (context != null) {
			this.context = context;
		}
		bind(source, property);
	}

	public PropertyValueControl(DisplayContext context, String title, Object source, Field property) {
		this.title = title;
		this.field = property;
		this.source = source;
		if (context != null) {
			this.context = context;
		}
		bind(source, property);
	}

	public PropertyValueControl(DisplayContext context, String title, Object source, String propertyName) throws IntrospectionException {
		this(context, title, source, getPropertyDescriptor(source, propertyName));
	}

	public PropertyValueControl(String title, Object value, boolean editable) {
		this.title = title;
		if (value != null) {
			type = value.getClass();
		}
		this.value = value;
		this.editable = editable;
		recreateGUI();
	}

	public PropertyValueControl(String title, Object source, PropertyDescriptor property) {
		this((DisplayContext) null, title, source, property);
	}

	public PropertyValueControl(String title, Object source, String propertyName) throws IntrospectionException {
		this(title, source, getPropertyDescriptor(source, propertyName));
	}

	public void bind(Object source, PropertyDescriptor property) {
		synchronized (valueLock) {
			bind0(source, property);
		}
	}

	private void bind0(Object source, PropertyDescriptor property) {
		this.property = property;
		this.source = source;
		Method readMethod = property.getReadMethod();
		type = property.getPropertyType();
		editable = property.getWriteMethod() != null;
		String fieldname = property.getName();
		if (readMethod != null) {
			isStatic = ReflectUtils.isStatic(readMethod);
		} else {
			try {
				for (Field f : ReflectUtils.findFields(source, source.getClass(), source.getClass(), true, type, true, fieldname)) {
					field = f;
					break;
				}
			} catch (Throwable ex) {
				printStackTrace(ex);
			}
		}
		readBoundValue();
		recreateGUI();
	}

	public void bind(Object source, Field property) {
		synchronized (valueLock) {
			bind0(source, property);
		}
	}

	private void bind0(Object source, Field property) {
		this.field = property;
		this.source = source;
		type = property.getType();
		editable = !Modifier.isFinal(property.getModifiers());
		isStatic = ReflectUtils.isStatic(property);
		readBoundValue();
		recreateGUI();
	}

	/**
	 * Returns the current type of the value in this PropertyValueControl. If there is a fixed type that will be returned instead. If the there is no value set and no fixed type, null will be returned.
	 */
	public Class getCurrentType() {
		if (value != null)
			return value.getClass();
		if (type != null)
			return type;
		if (false) {
			if (field != null)
				return field.getType();
			if (property != null)
				return property.getPropertyType();
		}
		return null;
	}

	/**
	 * Locate a value editor for a given target type.
	 * 
	 * @param type
	 *            The Class object for the type to be edited
	 * @return An editor object for the given target class. The result is null if no suitable editor can be found.
	 */

	private PropertyEditor getEditor(Class type, boolean editable) {
		PropertyEditor editor = findEditor(type, false, true, true, ReflectUtils.typeNot(getClass()));
		if (editor instanceof PropertyValueControl) {
			if (editor instanceof StringEditor && type != String.class) {
				bug("");
			}
			editor = null;
		}
		if (editor == null) {
			return new ObjectReferenceEditor(type, editable, this, this);
		} else {
			return editor;
		}
	}

	private Component getEditorComponent(PropertyEditor editor, boolean editable) {
		Component comp = getEditorComponentNoCell(editor, getCurrentType(), editable);
		MAX_TEXTWIDTH.height = 30;//comp.getHeight();
		comp.setSize(MAX_TEXTWIDTH);
		return comp;
	}

	private Component getEditorComponentNoCell(PropertyEditor editor, Class type, boolean editable) {
		CellEditorComponent comp = null;
		if (editor.supportsCustomEditor()) {
			if (editable || ReflectUtils.isTypeMutable(type)) {
				comp = new PropertyEditorToCellEditor(editor);

			} else {
				// if this is, for example, an uneditable Integer,
				// we only want to show a simple label.
				comp = new TextBasedViewComponent(editor, this);
			}
		} else {
			if (editable) {
				if (editor.getTags() != null) {
					comp = new ObjectChoiceComboPanel(editor, type, editable, (PropertyValueControl) this, (Container) this);
				} else {
					try {
						value = this.getBoundValue();
					} catch (Throwable e) {
						printStackTrace(e);
					}
					comp = new TextBasedInputComponent(editor, type, this, value);
				}
			} else {
				comp = new TextBasedViewComponent(editor, this);
			}
		}
		Component compC = comp.getCustomEditor();
		compC.setPreferredSize(MAX_TEXTWIDTH);
		return compC;
	}

	/**
	 * Returns the type of this PropertyValueControl, if there is a fixed type. For example if this is String then this PropertyValueControl can only be used to create and view Strings.
	 */
	public Class getFixedType() {
		return type;
	}

	@Override public Object getValue() {
		return value;
	}

	public boolean isBound() {
		return source != null || isStatic || this.isBoundToThis;
	}

	public boolean isEditable() {
		return editable;
	}

	/**
	 * Start listening to the source object
	 */
	private void listenToSource() {
		try {
			if (source != null) {
				BeanInfo info = getBeanInfo(source.getClass(), source);
				EventSetDescriptor[] events = info.getEventSetDescriptors();
				for (int i = 0; i < events.length; ++i) {
					EventSetDescriptor event = events[i];
					Class listenerType = event.getListenerType();
					Object listenerObj = this;
					if (listenerType.isInstance(listenerObj)) {
						Method method = event.getAddListenerMethod();
						method.invoke(source, new Object[] { listenerObj });
					}
				}
			}
		} catch (Exception err) {
			PropertyValueControl.theLogger.error("An error occurred", err);
		}
	}

	@Override public void propertyChange(PropertyChangeEvent evt) {
		if (isBound() && evt.getSource() == source) {
			// the source object's property changed...
			readBoundValue();
		} else if (evt.getSource() == currentEditor) {
			// the editor's value changed
			readEditorValue();
		}
	}

	@Override public String toString() {
		return Debuggable.toInfoStringF(this);
	}

	@Override public String getName() {
		if (title != null)
			return title.toString();
		return super.getName();
	}

	public Object getBoundValue() throws Throwable {
		if (field != null) {
			return getFieldValue(source, field);
		}
		if (property == null)
			return value;
		boolean was = Debuggable.isNotShowingExceptions();
		Debuggable.setDoNotShowExceptions(true);
		try {
			Method readMethod = property.getReadMethod();
			return getBoundValue2(source, readMethod);
		} finally {
			Debuggable.setDoNotShowExceptions(was);
		}
	}

	public Object getBoundValue2(Object obj, Method readMethod) throws Throwable {
		Object obj0 = obj;
		Throwable realCause;
		try {
			if (readMethod == null) {
				if (property != null) {
					String pn = property.getName();
					if (pn == null)
						pn = property.getDisplayName();
					if (pn != null) {
						try {
							Collection<Field> fields = ReflectUtils.findFields(obj, obj.getClass(), obj.getClass(), false, null, false, pn);
							if (fields != null && fields.size() > 0)
								return ReflectUtils.getFieldValue(obj, fields.iterator().next());
							fields = ReflectUtils.findFields(obj, null, obj.getClass(), true, null, true, pn);
							if (fields != null && fields.size() > 0)
								return ReflectUtils.getFieldValue(obj, fields.iterator().next());
						} catch (NoSuchFieldException nsfe) {
							//
						}
					}
				}
				return value;
			}
			if (readMethod == null) {
				throw new Exception("readMethod = null for object " + obj + " and property '" + property.getName() + "'!!!");
			}
			return ReflectUtils.invoke(source, readMethod);
		} catch (InvocationTargetException err) {
			realCause = err.getCause();
		} catch (Throwable err) {
			realCause = err;
			Throwable rc = realCause.getCause();
			while (rc != null && rc != realCause) {
				realCause = rc;
				rc = realCause.getCause();
			}
		}
		throw realCause;
	}

	private void readBoundValue() {
		if (isBound()) {
			Throwable realCause;
			Object obj = source;
			Object boundValue;
			try {
				boundValue = getBoundValue();
				setObject(boundValue);
				return;
			} catch (Throwable err) {
				realCause = err;
				Debuggable.maybeDebug(new Runnable() {
					@Override public void run() {
						try {
							Object boundValue = getBoundValue();
							setObject(boundValue);
							return;
						} catch (Throwable err2) {

						}
					}
				});
			}
			try {
				setObject(value);
			} catch (Exception err2) {
				PropertyValueControl.theLogger.error("An error occurred setting null", err2);
			}
			if (isPropertyTypicalException(realCause))
				return;
			PropertyValueControl.theLogger.warn("An error occurred", realCause);

		} else {
			PropertyValueControl.theLogger.warn("PropertyValueControl warning: ValueView.readBoundValue should only be called if value is bound!");
		}

	}

	private boolean isPropertyTypicalException(Throwable realCause) {
		while (realCause != null) {
			if (realCause instanceof java.awt.IllegalComponentStateException) {
				return true;
			}
			if (realCause instanceof JenaException) {
				return true;
			}
			if (realCause instanceof IndexOutOfBoundsException) {
				return true;
			}
			if (realCause instanceof ConcurrentModificationException) {
				return true;
			}
			if (realCause instanceof UnsupportedOperationException) {
				return true;
			}
			if (realCause instanceof IllegalStateException) {
				return true;
			}
			if (realCause instanceof NullPointerException) {
				return true;
			}
			if (realCause instanceof NoSuchElementException) {
				return true;
			}
			Throwable mayberealCause = realCause.getCause();
			if (mayberealCause != realCause) {
				realCause = mayberealCause;
				continue;
			}
		}
		return false;
	}

	private void readEditorValue() {
		if (currentEditor != null && currentEditor != this) {
			if (!isEqual(value, currentEditor.getValue())) {
				try {
					setObject(currentEditor.getValue());
				} catch (Exception err) {
					PropertyValueControl.theLogger.error("An error occurred", err);
				}
			}
		}
	}

	private synchronized void recreateGUI() {
		synchronized (valueLock) {
			recreateGUI0();
		}
	}

	private synchronized void recreateGUI0() {
		if (currentEditor != null) {
			currentEditor.removePropertyChangeListener(this);
		}
		removeAll();
		setLayout(new BorderLayout());

		stopListeningToSource();

		currentEditor = null;
		Component comp = null;

		if (type == null) {
			// untyped, so I can assume it is unbound
			if (value == null) {
				// I have no idea what the type should be
				currentEditor = getEditor(String.class, editable);
				currentEditor.setValue(null);
				comp = getEditorComponent(currentEditor, editable);
			} else {
				// AHA, I have a value, that means I can check the current type!
				Class currentType = value.getClass();
				currentEditor = getEditor(currentType, editable);
				currentEditor.setValue(value);
				comp = getEditorComponent(currentEditor, editable);
			}
		} else {
			//
			if (editable && type == Ident.class) {
				// The type is fixed
				Utility.addObjectToValues(value);
				currentEditor = getEditor(type, editable);
				//currentEditor.setValue(value);
				comp = getEditorComponent(currentEditor, editable);
				if (isBound()) {
					// It is bound, so I have to listen for changes
					readBoundValue();
					listenToSource();
				}
				writeEditorValue();
			} else {
				// The type is fixed
				currentEditor = getEditor(type, editable);
				// currentEditor.setValue(value);
				comp = getEditorComponent(currentEditor, editable);
				if (isBound()) {
					// It is bound, so I have to listen for changes
					readBoundValue();
					listenToSource();
				}
				writeEditorValue();
			}

		}
		if (comp != null) {
			if (showLabel && property != null) {
				add("West", new JLabel(property.getDisplayName() + ": "));
			}
			comp.setPreferredSize(MAX_TEXTWIDTH);
			TriggerMouseAdapter.installMouseAdapter(comp);
			add("Center", comp);
		}
		if (currentEditor != null) {
			currentEditor.addPropertyChangeListener(this);
		}
	}

	/**
	 * Sets the value in this PropertyValueControl to the default for the variable type. For example if the type is String the value will be null, if the type is int the value will be 0, etc.
	 */
	public void resetValue() throws Exception {
		Class currentType = getCurrentType();
		Object defaultValue = getDefaultValue(currentType);
		setObject(defaultValue);
	}

	public void setEditable(boolean editable) {
		if (editable != this.editable) {
			if (isBound() && editable == true) {
				if (property.getWriteMethod() != null) {
					this.editable = true;
					recreateGUI();
				}
			} else {
				this.editable = editable;
				recreateGUI();
			}
		}
	}

	public void setFixedType(Class newType) {
		Class oldType = type;
		if (oldType != newType) {
			type = newType;
			if (newType != null) {
				if (value != null && value.getClass() != newType) {
					try {
						setObject(null);
					} catch (Exception err) {
						PropertyValueControl.theLogger.error("An error occurred", err);
					}
				}
			}
		}
	}

	@Override public void setObject(Object newValue) throws InvocationTargetException {
		try {
			setValue(newValue);
		} catch (RuntimeException e) {
			throw e;
		} catch (Error e) {
			throw e;
		} catch (Exception e) {
			throw new RuntimeException(e);
		} catch (Throwable e) {
			throw new RuntimeException(e);
		}
	}

	@Override synchronized public void setValue(Object newValue) {
		Object oldValue = value;

		if (type != null && newValue != null) {
			Class test = type;
			if (test.isPrimitive()) {
				test = ReflectUtils.nonPrimitiveTypeFor(test);
			}
			if (!test.isInstance(newValue)) {
				Utility.bug("not instance of " + type + " " + newValue);
				return;
			}
		}
		if (!isEqual(newValue, oldValue)) {
			Class oldType = getCurrentType();
			value = newValue;
			//Utility.addObjectToValues(value);
			Class newType = getCurrentType();

			// @warning !!!! the code below was commented out
			// because I was having trouble with int.class vs Integer.class
			// (and stuff like that). This may cause trouble...

			// make sure type is correct, if restriction is set.
			/*
			 * if (newValue != null || type != null) {// &&
			 * !(type.isAssignableFrom(newValue.getClass()))) { throw new
			 * IllegalArgumentException("object must be of type " + type + " - "
			 * + newValue + " is invalid."); }
			 */

			if (newType == oldType || oldType == null) {
				// if this is bound, update the object's property value.
				if (isBound()) {
					try {
						writeBoundValue();
					} catch (Exception err) {
						readBoundValue();
					}
				}
				writeEditorValue();
			} else {
				recreateGUI();
			}
		}
	}

	public void showLabel(boolean b) {
		if (showLabel == b)
			return;
		showLabel = b;
		recreateGUI();
	}

	/**
	 * Stop listening to the source object
	 */
	private void stopListeningToSource() {
		try {
			if (source != null) {
				BeanInfo info = getBeanInfo(source.getClass(), source);
				EventSetDescriptor[] events = info.getEventSetDescriptors();
				Object listenerObj = this;
				for (int i = 0; i < events.length; ++i) {
					EventSetDescriptor event = events[i];
					Class listenerType = event.getListenerType();
					if (listenerType.isInstance(listenerObj)) {
						Method method = event.getRemoveListenerMethod();
						method.invoke(source, new Object[] { this });
					}
				}
			}
		} catch (Exception err) {
			PropertyValueControl.theLogger.error("An error occurred", err);
		}
	}

	public void unbind() {
		field = null;
		property = null;
		source = null;
	}

	private void writeBoundValue() throws Exception {
		if (editable) {
			if (isBound()) {
				Object value = Utility.recastCC(this.value, type);
				Object obj = source;
				if (property != null) {
					property.getWriteMethod().invoke(obj, new Object[] { value });
				}
				if (field != null) {
					field.set(obj, value);
				}
			} else {
				PropertyValueControl.theLogger.warn("PropertyValueControl warning: ValueView.writeBoundValue should only be called if value is bound!");
			}
		}
	}

	private void writeEditorValue() {
		if (currentEditor != null && currentEditor != this) {
			Object cev = currentEditor.getValue();
			if (!isEqual(value, cev)) {
				currentEditor.setValue(value);
			}
		}
	}

	NamedObjectCollection fromCollection;

	public PropertyValueControl getPropertyValueControl() {
		return this;
	}

	static public String[] getPVTags(NamedObjectCollection fromCollection, PropertyEditor currentEditor, Class type) {
		java.util.HashSet<String> choices = new java.util.HashSet<String>();
		//NamedObjectCollection fromCollection = getNamedObjectCollection();
		if (currentEditor != null && !(currentEditor instanceof ObjectReferenceEditor)) {
			String[] tags = currentEditor.getTags();
			if (tags != null) {
				for (String t : tags) {
					choices.add(t);
				}
			}
		}
		Iterable objectList = fromCollection.findObjectsByType(type);
		for (Object o : objectList) {
			choices.add(fromCollection.getTitleOf(o));
		}
		return choices.toArray(new String[choices.size()]);
	}

	public NamedObjectCollection getNamedObjectCollection() {
		if (fromCollection != null)
			return fromCollection;
		return getTreeBoxCollection();
	}

	public PropertyEditor getPropertyEditor() {
		if (currentEditor == null || currentEditor == this) {
			currentEditor = getEditor(type, editable);
		}
		if (currentEditor == this) {
			bug("This is not for calling getPropertyEditor");
			return null;
		}
		return currentEditor;
	}

	public CellEditorComponent getGetCellEditor() {
		if (cellEditor == null) {
			cellEditor = new PropertyEditorToCellEditor(getPropertyEditor());
		}
		return cellEditor;
	}

	@Override public TableCellEditor getCellEditor() {
		return getGetCellEditor().getCellEditor();
	}

	@Override public TreeCellEditor getTreeCellEditor() {
		return getGetCellEditor().getTreeCellEditor();
	}

	@Override public Component getCustomEditor() {
		return getGetCellEditor().getCustomEditor();
	}

	@Override public Object fromKey(String title, Class type) {
		return getToFromConv().fromKey(title, type);
	}

	@Override public String toKey(Object object) {
		return (String) getToFromConv().toKey(object);
	}

	@Override public boolean isPaintable() {
		return getPropertyEditor().isPaintable();
	}

	@Override public void paintValue(Graphics gfx, Rectangle box) {
		getPropertyEditor().paintValue(gfx, box);
	}

	@Override public String getJavaInitializationString() {
		return getPropertyEditor().getJavaInitializationString();
	}

	@Override public String getAsText() {
		return getPropertyEditor().getAsText();
	}

	@Override public void setAsText(String text) throws IllegalArgumentException {
		getPropertyEditor().setAsText(text);
	}

	@Override public String[] getTags() {
		return getPropertyEditor().getTags();
	}

	@Override public boolean supportsCustomEditor() {
		if (true)
			return true;
		return getPropertyEditor().supportsCustomEditor();
	}
}
