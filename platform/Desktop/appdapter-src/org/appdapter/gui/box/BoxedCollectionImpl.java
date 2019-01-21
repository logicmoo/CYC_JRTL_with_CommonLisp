package org.appdapter.gui.box;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.beans.PropertyVetoException;
import java.beans.VetoableChangeListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Type;
import java.util.*;

import org.appdapter.api.trigger.Box;
import org.appdapter.core.jvm.SetObject;
import org.appdapter.core.component.KnownComponent;
import org.appdapter.core.convert.Converter.ConverterMethod;
import org.appdapter.core.convert.ReflectUtils;
import org.appdapter.core.log.Debuggable;
import org.appdapter.gui.api.BT;
import org.appdapter.gui.api.BrowserPanelGUI;
import org.appdapter.gui.api.DisplayContext;
import org.appdapter.gui.api.DisplayType;
import org.appdapter.gui.api.GetSetObject;
import org.appdapter.gui.api.NamedObjectCollection;
import org.appdapter.gui.api.POJOCollectionListener;
import org.appdapter.gui.browse.Utility;
import org.appdapter.gui.swing.IsReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * A BoxedCollection is a container of objects and corresponding POJOBoxs,
 * which add the concept of "name" and "selected".
 * <p>
 *
 * Each value inside the BoxedCollection has a corresponding Box. A
 * Box has a reference to the value in memory it represents. Given an
 * value the only way to find the corresponding Box is to use
 * getBox(Object wrapper)
 * <p>
 *
 * PropertyChangeListeners can register to find out when the selected value is
 * changed, in which case the property "selectedBoxed" will change.
 * <p>
 *
 * POJOCollectionListeners can register to find out when objects are
 * added or removed.
 *
 * @see Box
 *
 */
@SuppressWarnings("serial")
public class BoxedCollectionImpl implements NamedObjectCollection,

VetoableChangeListener, PropertyChangeListener, Serializable, Set {

	public class ScreenBoxImplMade extends ScreenBoxImpl implements BT {

		ScreenBoxImplMade(NamedObjectCollection noc, String title, Object value) {
			notWrapper = false;
			setNameValue(noc, title, value);
		}

	}

	@ConverterMethod//
	public Map asMap() {
		return getLiveMap();
	}

	public class BoxMap extends AbstractMap<String, Object> {

		@Override public boolean containsKey(Object key) {
			String name = toStringKey(key);
			return findBoxByName(name) != null;
		}

		private String toStringKey(Object key) {
			return "" + key;
		}

		@Override public boolean containsValue(Object value) {
			return contains(value);
		}

		@Override public Object get(Object key) {
			String name = toStringKey(key);
			return findObjectByName(name);
		}

		@Override public Object put(String key, Object value) {
			String name = toStringKey(key);
			Object old = findObjectByName(name);
			removeObject(old);
			try {
				findOrCreateBox(name, value);
			} catch (PropertyVetoException e) {
				Debuggable.printStackTrace(e);
			}
			return old;
		}

		@Override public Set<String> keySet() {
			synchronized (nameIndex) {
				return nameIndex.keySet();
			}
		}

		@Override public Collection<Object> values() {
			synchronized (objectsToWrappers) {
				return objectsToWrappers.keySet();
			}
		}

		@Override public Set<java.util.Map.Entry<String, Object>> entrySet() {
			synchronized (boxList) {
				return new HashSet(boxList);
			}
		}

		@Override public int size() {
			return nameIndex.size();
		}

		@Override public boolean isEmpty() {
			// TODO Auto-generated method stub
			return size() == 0;
		}

		@Override public Object remove(Object key) {
			String name = toStringKey(key);
			Object old = findObjectByName(name);
			removeObject(old);
			return old;
		}

		@Override public void clear() {
			BoxedCollectionImpl.this.removeAll(new ArrayList(objectsToWrappers.keySet()));
		}

	}

	// ==== Static variables ===================
	private static Logger theLogger = LoggerFactory.getLogger(BoxedCollectionImpl.class);

	static public NamedObjectCollection load(File source) throws IOException, ClassNotFoundException {

		FileInputStream fileIn = new FileInputStream(source);
		ObjectInputStream objectIn = new ObjectInputStream(fileIn);
		NamedObjectCollection b = (NamedObjectCollection) objectIn.readObject();
		fileIn.close();

		b.initAfterLoading();
		return b;
	}

	// private Map boxsToBoxedCollection = new HashMap();
	protected Class filter = Object.class;
	// An ordered list of objects
	//private List objectsToWrappers.keySet() = new LinkedList();
	protected List boxList = new LinkedList<BT>();
	//private LinkedList objectsToWrappers.keySet() = new LinkedList();

	// ============ Constructors
	// ==================================================

	transient private Set colListeners = new HashSet();

	private DisplayContext displayContext;

	//Maps value wrapper name to value wrapper
	public Map<String, BT> nameIndex = new Hashtable<String, BT>();

	//private LinkedList<Object> objectsToWrappers.keySet() = new LinkedList<Object>();

	// ===== Serializable instance variables ================
	// Maps objects to their boxes
	private Map<Object, BT> objectsToWrappers = new HashMap();

	transient public Object syncObject = boxList;

	// ==== Queries ========================

	// ==== Transient instance variables ===================
	transient private PropertyChangeSupport propSupport = new PropertyChangeSupport(this);

	// The currently selected value
	private Object selected = null;

	String toStringText;

	public BoxedCollectionImpl() {
	}

	public BoxedCollectionImpl(String named, DisplayContext displayedAt) {
		toStringText = named;
		this.displayContext = displayedAt;
	}

	static <T> boolean addIfNew(List<T> objects2, T valueSetAs2) {
		if (valueSetAs2 != null) {
			if (!objects2.contains(valueSetAs2)) {
				objects2.add(valueSetAs2);
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean addValueBoxed(Object val, BT wrapper) {
		boolean notify = addNameValueBoxed(null, val, wrapper);
		return notify;
	}

	@Override
	public boolean addTitleBoxed(String title, BT wrapper) {
		boolean notify = addNameValueBoxed(title, null, wrapper);
		return notify;
	}

	public boolean addNameValueBoxed(String title, Object val, BT wrapper) {

		boolean notify = false;
		if (val == wrapper) {
			val = null;
		}
		if (val == null) {
			val = wrapper.getValueOrThis();
		}
		if (val == wrapper) {
			val = null;
		}
		synchronized (syncObject) {

			if (val != null) {
				BT prev = findBoxByObject(val);
				if (prev != null && prev != wrapper) {
					Utility.bug("Already existing item: " + title, prev, "when wanting to add ", val, "wrapper=", wrapper);
				}
				if (prev == null) {
					notify = true;
				}
				if (objectsToWrappers != null) {
					synchronized (objectsToWrappers) {
						objectsToWrappers.put(val, wrapper);
					}
				}
			}

			if (title == null) {
				title = getTitleOf(wrapper);
			}
			if (title != null) {
				BT prev = findBoxByName(title);
				if (prev != null && prev != wrapper) {
					//Utility.bug("Already existing name: " + title, prev, "when wanting to add ", val, "wrapper=", wrapper);
				}
				if (nameIndex != null) {
					synchronized (nameIndex) {
						nameIndex.put(title, wrapper);
					}
				}
			}

			if (addIfNew(boxList, wrapper)) {
				// Add myself as listener
				/*	wrapper.addVetoableChangeListener(this);
					wrapper.addPropertyChangeListener(this);*/
				notify = true;
			}

		}
		if (notify)
			notifyCollectionListeners(val, wrapper, false);
		return notify;
	}

	/**
	 * Listeners will find out when objects are added or removed
	 */
	@Override
	public void addListener(POJOCollectionListener l, boolean catchup) {
		synchronized (syncObject) {
			colListeners.add(l);
		}
		if (catchup) {
			Iterator it = getBoxes();
			while (it.hasNext()) {
				BT b = (BT) it.next();
				l.pojoAdded(b.getValue(), b, this);
			}
		}
	}

	/*
		public BT addObjectMaybe(Object value) throws PropertyVetoException {
			return addObjectMaybe(null, value);
		}

		public BT addObjectMaybe(String label, Object value) throws PropertyVetoException {
			synchronized (syncObject) {
				BT wrapper = findBoxByObject(value);
				if (wrapper == null) {
					wrapper = findBoxByName(label);
				}

				// Create the value wrapper, with a unique name
				String title = label;
				if (title == null) {
					title = generateUniqueName(value);
				}
				if (wrapper == null)
					wrapper = (BT) new ScreenBoxImpl(this, title, value);
				return wrapper;
			}

		}
	*/
	/**
	 * Listeners will be notifed when the currently value selection
	 * is changed.
	 */
	@Override
	public void addPropertyChangeListener(PropertyChangeListener p) {
		synchronized (syncObject) {
			propSupport.addPropertyChangeListener(p);
		}
	}

	/**
	 * Checks if this namedObjects contains the given value
	 */
	@Override public boolean containsObject(Object value) {
		return findBoxByObject(value) != null;
	}

	@Override public String getName() {
		return toStringText;
	}

	// ==== Event listener registration ======================

	/**
	 * Checks if this namedObjects contains the given value wrapper
	 */
	private boolean containsWrapper(BT wrapper) {
		synchronized (syncObject) {
			return boxList.contains(wrapper);
		}
		//    return objectsToWrappers.containsValue(value);
	}

	/**
	 * Creates a new value of the given class and adds to this namedObjects.
	 * The given class must have an empty constructor.
	 *
	 * @throws InstantiationException if the given Class represents an abstract class, an interface, an array class, a primitive type, or void; or if the instantiation fails for some other reason
	 * @throws IllegalAccessException if the given class or initializer is not accessible.
	 *
	 * @returns the newly created ScreenBox
	 */
	@Override
	public synchronized Object createAndAddObject(Class cl) throws InstantiationException, IllegalAccessException {
		//Create the value
		Object value = cl.newInstance();

		//Add it
		findOrCreateBox(value);
		return value;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override public BT findBoxByName(String name) {
		if (name == null)
			return null;
		synchronized (syncObject) {
			if (nameIndex != null) {
				synchronized (nameIndex) {
					BT boxl = nameIndex.get(name);
					if (boxl instanceof BT)
						return (BT) boxl;
				}
			}
		}
		for (BT wrapper : getScreenBoxes()) {
			if (wrapper.isNamed(name)) {
				synchronized (syncObject) {
					if (nameIndex != null) {
						nameIndex.put(name, wrapper);
					}
				}
			}
		}
		return null;
	}

	/**
	 * Returns the wrapper corresponding to the given value, i.e
	 * the ScreenBox who's value corresponds to the given one.
	 * Returns null if the BoxedCollection does not contain the given value.
	 */
	@Override
	public BT findBoxByObject(Object value) {

		if (value == null)
			return null;

		BT utilityBT = Utility.asBTNoCreate(value);
		if (utilityBT != null) {
			return utilityBT;
		}

		//value = Utility.dref(value, value);

		if (value instanceof String) {
			return findBoxByName((String) value);
		}
		synchronized (syncObject) {
			synchronized (objectsToWrappers) {
				BT w = objectsToWrappers.get(ReflectUtils.asObjectKey(value, false));
				if (w != null)
					return w;
			}
		}
		for (BT wrapper : getScreenBoxes()) {
			if (wrapper.representsObject(value))
				return wrapper;
		}
		return null;
	}

	// ======== Utility methods ==================================

	/**
	 * Returns the value with the given name, or null if none.
	 */
	@Override
	public Object findObjectByName(String name) {
		BT wrapper = findBoxByName(name);
		if (wrapper == null) {
			return null;
		} else {
			return wrapper.getValue();
		}
	}

	/**
	 * Returns all objects representing objects that are an instance of the given class
	 * or interface, either directly or indirectly.
	 */
	@Override
	public Collection findObjectsByType(Class type) {
		if (type == null)
			return getLiveCollection();
		Set result = new HashSet();
		Iterator it = getObjects();
		while (it.hasNext()) {
			Object value = it.next();
			if (type.isInstance(value)) {
				result.add(value);
			}
		}
		if (result.size() == 0) {

		}
		for (BT value : getScreenBoxes()) {
			if (value.isTypeOf(type) || value.canConvert(type)) {
				result.add(value.convertTo(type));
			}
		}
		if (Debuggable.isRelease())
			return result;
		if (result.size() > 0)
			return result;
		for (BT value : getScreenBoxes()) {
			if (value.isTypeOf(type) || value.canConvert(type)) {
				result.add(value.convertTo(type));
			}
		}
		return result;
	}

	@Override public ScreenBoxImpl findOrCreateBox(Object value) {
		try {
			return (ScreenBoxImpl) findOrCreateBox(null, value);
		} catch (PropertyVetoException e) {
			throw Debuggable.reThrowable(e);
		}
	}

	/**
	 * Adds the given value to the BoxedCollection, if it does not already exist.
	 *
	 * @returns true if the value was added, i.e. if it didn't already exist.
	 */
	@Override
	public BT findOrCreateBox(String title, Object value) throws PropertyVetoException {
		BT wrapper = Utility.asBTNoCreate(value);
		if (wrapper != null) {
			///value = wrapper.getValueOrThis();
			if (title != null && title.length() > 0) {
				wrapper.addTitle(title);
			}
			return wrapper;
		}
		boolean notify = false;
		synchronized (syncObject) {
			synchronized (nameIndex) {
				synchronized (boxList) {
					synchronized (objectsToWrappers) {
						if (wrapper == null && value != null) {
							wrapper = findBoxByObject(value);
						}
						if (wrapper == null && title != null) {
							wrapper = findBoxByName(title);
						}
						if (title == null) {
							if (wrapper != null) {
								title = wrapper.getShortLabel();
								labelCheck(title);
							}
							if (title == null) {
								title = Utility.generateUniqueName_sug(value, title, getNameToBoxIndex(), false, true);
								labelCheck(title);
							}
						}
						if (wrapper == null) {
							wrapper = (BT) makeWrapper(title, value);
							nameIndex.put(title, wrapper);
							wrapper.addValue(value);
						}
					}
					notify = addNameValueBoxed(title, value, wrapper);

					return wrapper;
				}
			}
		}

	}

	public static void labelCheck(String shortLabel) {
		if (shortLabel != null && shortLabel.contains("JenaResourceItem[")) {
			Utility.bug("Short label =" + shortLabel);
		}
	}

	/**
	 * Generates a default name for the given value, while will be something
	 * like "Button1", "Button2", etc.
	 */
	public String generateUniqueName(Object value) {
		synchronized (syncObject) {
			return Utility.generateUniqueName(value, getNameToBoxIndex());
		}
	}

	/**
	 * Returns an iterator over all the value wrappers.
	 * NOTE - this could be a bit slow! Avoid whenever possible.
	 * The code can be optimized for this, but it isn't right now.
	 */
	@Override public Iterator<BT> getBoxes() {
		//LinkedList boxList = getBoxListFrom(DisplayType.TOSTRING);
		LinkedList list = new LinkedList();
		synchronized (syncObject) {
			synchronized (boxList) {
				list.addAll(boxList);
			}
			if (true)
				return list.iterator();
			else {
				Iterator it = getObjects();
				while (it.hasNext()) {
					list.add(findOrCreateBox(it.next()));
				}
				return list.iterator();
			}
		}
	}

	/**
	 * {@inheritDoc}
	 */
	public int getBoxesCount() {
		synchronized (syncObject) {
			synchronized (boxList) {
				return boxList.size();
			}
		}
	}

	@Override
	public DisplayContext getDisplayContext() {
		if (displayContext != null)
			return displayContext;
		return Utility.getDisplayContext();
	}

	//==== Manipulating the collection of objects ==================

	private BT getEventBox(PropertyChangeEvent evt) {
		BT wrapper = (BT) evt.getSource();
		return wrapper;
	}

	@Override public Map<String, BT> getNameToBoxIndex() {
		synchronized (syncObject) {
			synchronized (nameIndex) {
				return nameIndex;
			}
		}
	}

	//==== Queries ========================

	/**
	 * Returns the current number of objects in the namedObjects
	 */
	private int getObjectCount() {
		synchronized (syncObject) {
			synchronized (objectsToWrappers) {
				return objectsToWrappers.size();
			}
		}
	}

	/**
	 * Returns an iterator over all the objects
	 */
	@Override
	public Iterator getObjects() {
		synchronized (syncObject) {
			synchronized (objectsToWrappers) {
				return new ArrayList(objectsToWrappers.keySet()).iterator();
			}
		}
	}

	@Override
	public Iterable<BT> getScreenBoxes() {
		synchronized (syncObject) {
			return (Iterable<BT>) ReflectUtils.copyOf(boxList);
		}
	}

	public Iterable<BT> getScreenBoxes(DisplayType attachType) {
		synchronized (syncObject) {
			return (Iterable<BT>) ReflectUtils.copyOf(boxList).iterator();
		}
	}

	/**
	 * Returns the currently selected value,
	 * or null if none.
	 */
	public Object getSelectedObject() {
		return selected;
	}

	private String getTitleOf(Box wrapper) {
		if (wrapper == null)
			return MISSING_COMPONENT;
		if (wrapper instanceof BT)
			return ((BT) wrapper).generateUniqueName(getNameToBoxIndex());
		String lbl = ((KnownComponent) wrapper).getShortLabel();
		if (lbl != null)
			return lbl;
		return Utility.generateUniqueName(wrapper.getValue(), this.nameIndex);
	}

	@Override
	public String getTitleOf(Object value) {
		if (value == null)
			return "<null>";
		synchronized (syncObject) {

			if (value instanceof Box) {
				return getTitleOf((Box) value);
			}
			if (value instanceof String) {
				return getTitleOf(findBoxByName("" + value));
			}
			BT wrapper = findBoxByObject(value);
			if (wrapper == null)
				return MISSING_COMPONENT;
			return getTitleOf(wrapper);
		}
	}

	@Override public BT asWrapped(Object d) {
		if (d == null || d instanceof BT) {
			return (BT) d;
		}
		return findOrCreateBox(d);
	}

	//===== Manipulating the selected value ===============

	//==== Event listener registration ======================

	/**
	 * Tells the namedObjects that it has just been loaded from a file
	 * and needs to initialize itself. For example update
	 * transient instance variables that were "lost" during the
	 * serialization, and add itself as listener to all the objects.
	 */
	@Override
	public void initAfterLoading() {
		synchronized (syncObject) {
			if (colListeners == null) {
				colListeners = new HashSet();
			}

			if (propSupport == null) {
				propSupport = new PropertyChangeSupport(this);
			}
			/*
			Iterator it = getBoxes();
			while (it.hasNext()) {
				BT b = (BT) it.next();
				b.addVetoableChangeListener(this);
				b.addPropertyChangeListener(this);
			}*/
		}
	}

	protected ScreenBoxImpl makeWrapper(String title, Object value) throws PropertyVetoException {
		ScreenBoxImpl wrapper = new ScreenBoxImplMade(this, title, value);
		/**
		 * Creates a new ScreenBox for the given value
		 * and assigns it a default name.
		 */

		return wrapper;
	}

	//===== Property notifications (i.e. others notifying me) =========

	/**
	 * This is used for Boxes to tell their NamedObjectCollection that a property
	 * such as "name" or "selected" has changed. The NamedObjectCollection will update
	 * its state as necessary.
	 */
	@Override
	public synchronized void propertyChange(PropertyChangeEvent evt) {
		synchronized (syncObject) {
			propertyChange0(evt);
		}
	}

	private void propertyChange0(PropertyChangeEvent evt) {
		if (evt.getPropertyName().equals("name")) {
			//Name has changed - so update the name index
			BT value = (BT) (evt.getSource());
			if (containsObject(value.getValue())) {
				String newName = (String) evt.getNewValue();
				String oldName = (String) evt.getOldValue();
				if (oldName != null) {
					nameIndex.remove(oldName);
				}
				nameIndex.put(newName, value);
			}

		} else if (evt.getPropertyName().equals("selected")) {
			//Selection has changed. Call notifySelected or notifyDeselected
			//to update my internal state
			Boolean newValue = (Boolean) evt.getNewValue();
			BT wrapper = (BT) evt.getSource();
			Object value = wrapper.getValue();
			if (containsObject(value)) {
				if (newValue.equals(new Boolean(true))) {
					try {
						//setSelectedObject(value);
					} catch (Exception err) {
						theLogger.warn("The NamedObjectCollection was notified that a value has been selected, and when trying to update the internal state a PropertyVetoException occurred", err);
					}
				} else if (newValue.equals(new Boolean(false))) {
					try {
						//	setSelectedObject(null);
					} catch (Exception err) {
						theLogger.warn("The NamedObjectCollection was notified that a value has been deselected, and when trying to update the internal state a PropertyVetoException occurred", err);
					}
				}
			}
		}
	}

	//====== Save and load operations ================================

	@Override public void reload() {
		Debuggable.notImplemented();

	}

	/**
	 * {@inheritDoc}
	 */
	@Override public void removeListener(POJOCollectionListener l) {
		synchronized (syncObject) {
			colListeners.remove(l);
		}
	}

	//======== Utility methods ==================================

	/**
	 * Removes the given value, if it is inside this namedObjects.
	 * If not, nothing happens. <p>
	 *
	 * objectsToWrappers.keySet()eners will be notified. <p>
	 *
	 * If the value was selected, the current selection
	 * will change to null and property change listeners
	 * will be notified. <p>
	 *
	 */
	@Override
	public synchronized boolean removeObject(Object value) {

		//Find the wrapper

		BT wrapper;
		synchronized (syncObject) {
			wrapper = findBoxByObject(value);
			if (wrapper == null)
				return false;
		}
		//notify namedObjectsListeners
		notifyCollectionListeners(value, wrapper, true);

		synchronized (syncObject) {
			synchronized (nameIndex) {
				synchronized (boxList) {
					synchronized (objectsToWrappers) {
						return removeObject0(value, wrapper);
					}
				}
			}
		}
	}

	private boolean removeObject0(Object value, BT wrapper) {

		Object realObj = wrapper.getValue();
		if (realObj != null && realObj != value) {
			theLogger.warn("This wrapper is for a differnt value " + wrapper + " not " + value);
			value = realObj;
		}

		String title = wrapper.getShortLabel();

		//Deselect it if necessary
		if (selected == value) {
			try {
				//The value will fire a PropertyChangeEvent which I will
				//catch, so I don't need to do setSelectedObject(null)
				//wrapper.setUISelected(false);
			} catch (Exception err) {
				theLogger.warn("In NamedObjectCollection.removeObject(...) I was unable to deselect the removed value. I'll ignore the problem, i.e. leave it selected and remove it anyway.", err);
			}
		}

		boolean worked = true;
		if (containsObject(value)) {
			worked = false;
		}

		//Remove it
		//objectsToWrappers.remove(value);
		for (Object o : wrapper.getObjects(null)) {
			synchronized (objectsToWrappers) {
				objectsToWrappers.keySet().remove(o);
			}
			;
		}

		boxList.remove(wrapper);
		objectsToWrappers.remove(value);

		//Update the name index
		nameIndex.remove(title);
		String key = wrapper.getShortLabel();
		nameIndex.remove(key);

		if (containsObject(value)) {
			return false;
		}
		return true;

	}

	private void notifyCollectionListeners(final Object value, final BT wrapper, final boolean isRemoval) {
		final Iterator it = ReflectUtils.copyOf(colListeners).iterator();
		while (it.hasNext()) {
			final POJOCollectionListener listener = ((POJOCollectionListener) it.next());
			Utility.invokeAfterLoader(new Runnable() {
				@Override public void run() {

					try {
						if (isRemoval) {
							listener.pojoRemoved(value, wrapper, this);
						} else {
							listener.pojoAdded(value, wrapper, this);
						}
					} catch (Throwable uncaught) {

					}
				}

			});
		}
	}

	/**
	 * Listeners will be notifed when the currently value selection
	 * is changed.
	 */
	@Override
	public void removePropertyChangeListener(PropertyChangeListener p) {
		synchronized (syncObject) {
			propSupport.removePropertyChangeListener(p);
		}
	}

	@Override public void renameObject(String oldName, String newName) throws PropertyVetoException {
		BT wrapper = findOrCreateBox(newName, findObjectByName(oldName));
		wrapper.setUniqueName(newName);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override public void save(File destination) throws IOException {
		theLogger.debug("Saving collection to " + destination);
		synchronized (syncObject) {
			FileOutputStream fileOut = new FileOutputStream(destination);
			ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
			objectOut.writeObject(this);
			fileOut.close();
		}
		theLogger.debug("Successfully saved!");
	}

	/**
	 * {@inheritDoc}
	 */
	public synchronized void setSelectedComponent(Object value) throws PropertyVetoException {
		synchronized (syncObject) {
			value = Utility.dref(value);
			if (selected != value && containsObject(value)) {

				// Deselect the old wrapper (if any)
				Object oldSelected = selected;
				BT oldBox = findOrCreateBox(oldSelected);

				// Update my "selected" instance variable
				selected = value;

				// Fire a property change
				propSupport.firePropertyChange("selected", oldSelected, selected);

			}
		}
	}

	/**
	 * Makes the given value the currently selected one.
	 * The previously selected value (if any) will be deselected,
	 * and a property change event will be fired.
	 *
	 * @throws PropertyVetoException if someone refused to let the selected value change

	public synchronized void setSelectedObject(Object value) throws PropertyVetoException {
		if (selected != value && containsObject(value)) {
			synchronized (syncObject) {
				//Deselect the old wrapper (if any)
				Object oldSelected = selected;
				BT oldWrapper = findOrCreateBox(oldSelected);
				if (oldWrapper != null) {
					oldWrapper.setUISelected(false);
				}

				//Update my "selected" instance variable
				selected = value;

				//Make sure the corresponding wrapper knows its selected
				findOrCreateBox(selected).setUISelected(true);

				//Fire a property change
				propSupport.firePropertyChange("selected", oldSelected, selected);
			}
		}
	}*/
	@Override public String toString() {
		return toStringText;
	}

	/**
	 * This is used for Boxes to tell their NamedObjectCollection that a property
	 * such as "name" or "selected" is about to change, allowing
	 * the NamedObjectCollection to fire a PropertyVetoException to stop the change if it likes. <p>
	 *
	 * This would happen, for example, if someone is trying to rename a value to a
	 * name that another value within this namedObjects already has.
	 */
	@Override
	public void vetoableChange(PropertyChangeEvent evt) throws PropertyVetoException {
		if (evt.getPropertyName().equals("name")) {
			//The name of a wrapper has changed. Make sure there are no name collisions
			BT wrapper = (BT) (evt.getSource());
			Object value = wrapper.getValue();
			if (containsObject(value)) {
				String name = (String) evt.getNewValue();
				BT otherWrapper = findBoxByName(name);
				if (otherWrapper != null && otherWrapper != wrapper) {
					throw new PropertyVetoException("Another value already has the name '" + name + "'", evt);
				}
			}
		}
	}

	public BrowserPanelGUI getCurrentContext() {
		return Utility.getCurrentContext();
	}

	@Override public Set getLiveCollection() {
		return this;
	}

	@Override public int size() {
		return getObjectCount();
	}

	@Override public boolean isEmpty() {
		return size() == 0;
	}

	@Override public boolean contains(Object o) {
		return objectsToWrappers.keySet().contains(ReflectUtils.asObjectKey(o, false));
	}

	@Override public Iterator iterator() {
		return objectsToWrappers.keySet().iterator();
	}

	@Override public Object[] toArray() {
		return objectsToWrappers.keySet().toArray();
	}

	@Override public Object[] toArray(Object[] a) {
		return objectsToWrappers.keySet().toArray(a);
	}

	@Override public boolean add(Object e) {
		boolean was = contains(e);
		findOrCreateBox(e);
		return !was;
	}

	@Override public boolean remove(Object o) {
		boolean was = contains(o);
		removeObject(o);
		return was;
	}

	@Override public boolean containsAll(Collection c) {
		for (Object o : c) {
			if (!contains(c))
				return false;
		}
		return true;
	}

	@Override public boolean addAll(Collection c) {
		boolean changed = false;
		for (Object o : c) {
			if (add(o))
				changed = true;
		}
		return changed;
	}

	@Override public boolean retainAll(Collection c) {
		boolean changed = false;
		for (Object o : toArray()) {
			if (!c.contains(o)) {
				remove(o);
				changed = true;
			}
		}
		return changed;
	}

	@Override public boolean removeAll(Collection c) {
		boolean changed = false;
		for (Object o : c) {
			if (remove(o))
				changed = true;
		}
		return changed;
	}

	@Override public void clear() {
		for (Object o : toArray()) {
			remove(o);
		}
	}

	BoxMap boxMap = new BoxMap();

	@Override
	public Map<String, Object> getLiveMap() {
		return boxMap;
	}

	@Override public Collection findObjectsByName(String txt, Type mustBe) {
		ArrayList<Object> objects = new ArrayList<Object>();
		for (BT wrapper2 : getScreenBoxes()) {
			if (wrapper2.isNamed(txt)) {
				for (Object o : wrapper2.getObjects(null)) {
					if (ReflectUtils.isInstance(mustBe, o))
						objects.add(o);
				}
			}
		}
		return objects;
	}
}
