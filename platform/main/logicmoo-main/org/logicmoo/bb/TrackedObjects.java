
package org.logicmoo.bb;

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
import java.util.HashMap;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;

/**
 * A bean bowl is a container of objects and corresponding BeanWrappers, which
 * add the concept of "name" and "selected".
 * <p>
 *
 * Each object inside the BeanBowl has a corresponding BeanWrapper. A
 * BeanWrapper has a reference to the object it respresents, but given an object
 * the only way to find the corresponding BeanWrapper is to use
 * getWrapper(Object o)
 * <p>
 *
 * PropertyChangeListeners can register to find out when the selected bean is
 * changed, in which case the property "selectedBean" will change.
 * <p>
 *
 * BeansContextListeners can register to find out when beans are added or
 * removed.
 *
 * @see BeanWrapper
 * @author Henrik Kniberg
 */
public class TrackedObjects implements VetoableChangeListener, PropertyChangeListener, Serializable {
	// ==== Static variables ===================
	// private static Category cat = Category.getInstance(BeanBowl.class);

	// ==== Transient instance variables ===================
	transient private PropertyChangeSupport propSupport = new PropertyChangeSupport(this);
	transient private Set bowlListeners = new HashSet();

	// ===== Serializable instance variables ================
	// Maps beans to their wrappers
	// private Map beansToWrappers = new HashMap();

	// private Map wrappersToBeans = new HashMap();

	// An ordered list of beans
	// private List beanList = new LinkedList();
	private LinkedList wrapperList = new LinkedList();
	private LinkedList beanList = new LinkedList();

	// The currently selected bean
	private Object selected = null;

	// Maps bean wrapper name to bean wrapper
	private Map nameIndex = new Hashtable();

	// ============ Constructors
	// ==================================================

	public TrackedObjects() {
	}

	// ==== Manipulating the collection of beans ==================

	/**
	 * Creates a new object of the given class and adds to this bowl. The given
	 * class must have an empty constructor.
	 *
	 * @throws InstantiationException
	 *             if the given Class represents an abstract class, an
	 *             interface, an array class, a primitive type, or void; or if
	 *             the instantiation fails for some other reason
	 * @throws IllegalAccessException
	 *             if the given class or initializer is not accessible.
	 *
	 * @returns the newly created BeanWrapper
	 */
	public synchronized Object createAndAddBean(Class cl) throws InstantiationException, IllegalAccessException {
		// Create the object
		Object obj = cl.newInstance();

		// Add it
		addBean(obj);

		return obj;
	}

	/**
	 * Adds the given object to the bean bowl, if it does not already exist.
	 *
	 * @returns true if the object was added, i.e. if it didn't already exist.
	 */
	public synchronized boolean addBean(Object obj) {
		return addBean(null, obj);
	}

	public synchronized boolean addBean(String named, Object obj) {
		if (containsBean(obj)) {
			return false;
		} else {
			// Create the bean wrapper, with a unique name
			named = named != null ? named : generateUniqueName(obj);

			BeanWrapper wrapper = new BeanWrapper(named, obj);

			// Add it
			// beansToWrappers.put(obj, wrapper);
			beanList.add(obj);
			wrapperList.add(wrapper);

			// Add myself as listener
			wrapper.addVetoableChangeListener(this);
			wrapper.addPropertyChangeListener(this);

			// Update the name index
			nameIndex.put(wrapper.getName(), wrapper);

			// notify bowlListeners
			notifyAdd(named, obj);

			return true;
		}
	}

	/**
	 * @param named
	 * @param obj
	 */
	public void notifyAdd(final String named, final Object obj) {
		invokeAndWait(new Runnable() {
			@Override
			public void run() {

				Iterator it = getListeners();
				while (it.hasNext()) {
					// @temp
					((BeansContextListener) it.next()).beanAdded(named, obj);
				}
			}
		});
	}

	/**
	 * @return
	 */
	public Iterator getListeners() {
		Iterator it;
		synchronized (bowlListeners) {
			it = new HashSet(bowlListeners).iterator();
		}
		return it;
	}

	public void notifyRemoval(final String named, final Object obj) {
		invokeAndWait(new Runnable() {
			@Override
			public void run() {

				Iterator it = getListeners();
				while (it.hasNext()) {
					// @temp
					((BeansContextListener) it.next()).beanRemoved(named, obj);
				}
			}
		});
	}


	/**
	 * Removes the given bean, if it is inside this bowl. If not, nothing
	 * happens.
	 * <p>
	 *
	 * BeanListeners will be notified.
	 * <p>
	 *
	 * If the bean was selected, the current selection will change to null and
	 * property change listeners will be notified.
	 * <p>
	 *
	 */
	public synchronized boolean removeBean(Object obj) {
		if (containsBean(obj)) {
			// Find the wrapper
			BeanWrapper wrapper = getWrapper(obj);

			// Remove it
			// beansToWrappers.remove(obj);
			beanList.remove(obj);
			wrapperList.remove(wrapper);

			String name = wrapper.getName();
			// Update the name index
			nameIndex.remove(name);

			// Deselect it if necessary
			if (selected == obj) {
				try {
					// The bean will fire a PropertyChangeEvent which I will
					// catch, so I don't need to do setSelectedBean(null)
					wrapper.setSelected(false);
				} catch (PropertyVetoException err) {
					Errors.error(
							"In BeanBowl.removeBean(...) I was unable to deselect the removed bean. I'll ignore the problem, i.e. leave it selected and remove it anyway.",
							err);
				}
			}

			// notify bowlListeners
			notifyRemoval(name,obj);
			return true;
		} else {
			return false;
		}
	}

	// ==== Queries ========================

	/**
	 * Returns an iterator over all the beans
	 */
	public Iterator getBeans() {
		return beanList.iterator();
	}

	/**
	 * Returns an iterator over all the bean wrappers. NOTE - this could be a
	 * bit slow! Avoid whenever possible. The code can be optimized for this,
	 * but it isn't right now.
	 */
	public Iterator getWrappers() {
		LinkedList list = new LinkedList();
		Iterator it = getBeans();
		while (it.hasNext()) {
			list.add(getWrapper(it.next()));
		}
		return list.iterator();
	}

	/**
	 * Returns the current number of beans in the bowl
	 */
	public int getBeanCount() {
		return beanList.size();
	}

	/**
	 * Returns the bean at the given index
	 */
	public Object getBeanAt(int index) {
		return beanList.get(index);
	}

	/**
	 * Checks if this bowl contains the given bean
	 */
	public boolean containsBean(Object bean) {
		return beanList.contains(bean);
		// return beansToWrappers.containsKey(bean);
	}

	/**
	 * Checks if this bowl contains the given bean wrapper
	 */
	public boolean containsWrapper(BeanWrapper wrapper) {
		return wrapperList.contains(wrapper);
		// return beansToWrappers.containsValue(bean);
	}

	/**
	 * Returns all beans representing objects that are an instance of the given
	 * class or interface, either directly or indirectly.
	 */
	public Set getBeansOfType(Class type) {
		Set result = new HashSet();
		Iterator it = getBeans();
		while (it.hasNext()) {
			Object obj = it.next();
			if (type.isInstance(obj)) {
				result.add(obj);
			}
		}
		return result;
	}

	/**
	 * Returns the bean with the given name, or null if none.
	 */
	public Object findBean(String name) {
		BeanWrapper wrapper = findWrapper(name);
		if (wrapper == null) {
			return null;
		} else {
			return wrapper.getObject();
		}
	}

	/**
	 * Returns the wrapper with the given name, or null if none.
	 */
	public BeanWrapper findWrapper(String name) {
		return (BeanWrapper) nameIndex.get(name);
	}

	/**
	 * Returns the wrapper corresponding to the given object, i.e the
	 * BeanWrapper who's object corresponds to the given one. Returns null if
	 * the bean bowl does not contain the given object.
	 */
	public BeanWrapper getWrapper(Object object) {
		if (object == null)
			return null;

		int i = beanList.indexOf(object);
		if (i == -1) {
			return null;
		}

		BeanWrapper wrapper = (BeanWrapper) wrapperList.get(i);
		return wrapper;
	}

	// ===== Manipulating the selected bean ===============

	/**
	 * Returns the currently selected bean, or null if none.
	 */
	public Object getSelectedBean() {
		return selected;
	}

	// ==== Event listener registration ======================

	/**
	 * Listeners will be notifed when the currently bean selection is changed.
	 */
	public void addPropertyChangeListener(PropertyChangeListener p) {
		propSupport.addPropertyChangeListener(p);
	}

	/**
	 * Listeners will be notifed when the currently bean selection is changed.
	 */
	public void removePropertyChangeListener(PropertyChangeListener p) {
		propSupport.removePropertyChangeListener(p);
	}

	/**
	 * Listeners will find out when beans are added or removed
	 */
	public void addListener(final BeansContextListener l) {
		synchronized (bowlListeners) {

			bowlListeners.add(l);
		}
		invokeAndWait(new Runnable() {
			@Override
			public void run() {
				sendAllToListener(l);
			}
		});
	}

	static void invokeAndWait(Runnable runnable) {
		runnable.run();

		//org.appdapter.gui.browse.Utility.invokeAndWait(runnable);
	}

	// notify bowlListener newcomer
	private void sendAllToListener(BeansContextListener l) {
		// Update the name index
		Map<String, Object> map = new HashMap<String, Object>();
		for (Object e : nameIndex.entrySet()) {
			Map.Entry es = (Map.Entry) e;
			map.put((String) es.getKey(), es.getValue());
		}
		for (Object e : map.entrySet()) {
			Map.Entry es = (Map.Entry) e;
			String named = (String) es.getKey();
			Object obj = es.getValue();
			if (obj instanceof BeanWrapper) {
				obj = ((BeanWrapper) obj).getObject();
			}
			l.beanAdded(named, obj);
		}

	}

	/**
	 * Listeners will find out when beans are added or removed
	 */
	public void removeListener(BeansContextListener l) {
		synchronized (bowlListeners) {
			bowlListeners.remove(l);
		}
	}

	// ===== Property notifications (i.e. others notifying me) =========

	/**
	 * This is used for BeanWrappers to tell their BeanBowl that a property such
	 * as "name" or "selected" has changed. The BeanBowl will update its state
	 * as necessary.
	 */
	@Override
	public synchronized void propertyChange(PropertyChangeEvent evt) {
		if (evt.getPropertyName().equals("name")) {
			// Name has changed - so update the name index
			BeanWrapper bean = (BeanWrapper) (evt.getSource());
			if (containsBean(bean.getObject())) {
				String newName = (String) evt.getNewValue();
				String oldName = (String) evt.getOldValue();
				if (oldName != null) {
					nameIndex.remove(oldName);
				}
				nameIndex.put(newName, bean);
			}

		} else if (evt.getPropertyName().equals("selected")) {
			// Selection has changed. Call notifySelected or notifyDeselected
			// to update my internal state
			Boolean newValue = (Boolean) evt.getNewValue();
			BeanWrapper wrapper = (BeanWrapper) evt.getSource();
			Object object = wrapper.getObject();
			if (containsBean(object)) {
				if (newValue.equals(new Boolean(true))) {
					try {
						setSelectedBean(object);
					} catch (PropertyVetoException err) {
						Errors.error(
								"The BeanBowl was notified that a bean has been selected, and when trying to update the internal state a PropertyVetoException occurred",
								err);
					}
				} else if (newValue.equals(new Boolean(false))) {
					try {
						setSelectedBean(null);
					} catch (PropertyVetoException err) {
						Errors.error(
								"The BeanBowl was notified that a bean has been deselected, and when trying to update the internal state a PropertyVetoException occurred",
								err);
					}
				}
			}
		}
	}

	/**
	 * Makes the given bean the currently selected one. The previously selected
	 * bean (if any) will be deselected, and a property change event will be
	 * fired.
	 *
	 * @throws PropertyVetoException
	 *             if someone refused to let the selected bean change
	 */
	public synchronized void setSelectedBean(Object object) throws PropertyVetoException {
		if (selected != object && containsBean(object)) {

			// Deselect the old wrapper (if any)
			Object oldSelected = selected;
			BeanWrapper oldWrapper = getWrapper(oldSelected);
			if (oldWrapper != null) {
				oldWrapper.setSelected(false);
			}

			// Update my "selected" instance variable
			selected = object;

			// Make sure the corresponding wrapper knows its selected
			getWrapper(selected).setSelected(true);

			// Fire a property change
			propSupport.firePropertyChange("selected", oldSelected, selected);

		}
	}

	/**
	 * This is used for BeanWrappers to tell their BeanBowl that a property such
	 * as "name" or "selected" is about to change, allowing the BeanBowl to fire
	 * a PropertyVetoException to stop the change if it likes.
	 * <p>
	 *
	 * This would happen, for example, if someone is trying to rename a bean to
	 * a name that another bean within this bowl already has.
	 */
	@Override
	public void vetoableChange(PropertyChangeEvent evt) throws PropertyVetoException {
		if (evt.getPropertyName().equals("name")) {
			// The name of a wrapper has changed. Make sure there are no name
			// collisions
			BeanWrapper wrapper = (BeanWrapper) (evt.getSource());
			Object object = wrapper.getObject();
			if (containsBean(object)) {
				String name = (String) evt.getNewValue();
				BeanWrapper otherWrapper = findWrapper(name);
				if (otherWrapper != null && otherWrapper != wrapper) {
					throw new PropertyVetoException("Another bean already has the name '" + name + "'", evt);
				}
			}
		}
	}

	// ====== Save and load operations ================================

	public void save(File destination) throws IOException {
		Errors.showMessageOnErrorStream("Saving bowl to " + destination);
		FileOutputStream fileOut = new FileOutputStream(destination);
		ObjectOutputStream objectOut = new ObjectOutputStream(fileOut);
		objectOut.writeObject(this);
		fileOut.close();
		Errors.showMessageOnErrorStream("Successfully saved!");
	}

	static public TrackedObjects load(File source) throws IOException, ClassNotFoundException {
		FileInputStream fileIn = new FileInputStream(source);
		ObjectInputStream objectIn = new ObjectInputStream(fileIn);
		TrackedObjects b = (TrackedObjects) objectIn.readObject();
		fileIn.close();

		b.initAfterLoading();
		return b;
	}

	/**
	 * Tells the bowl that it has just been loaded from a file and needs to
	 * initialize itself. For example update transient instance variables that
	 * were "lost" during the serialization, and add itself as listener to all
	 * the beans.
	 */
	void initAfterLoading() {
		if (bowlListeners == null) {
			bowlListeners = new HashSet();
		}

		if (propSupport == null) {
			propSupport = new PropertyChangeSupport(this);
		}

		Iterator it = getWrappers();
		while (it.hasNext()) {
			BeanWrapper b = (BeanWrapper) it.next();
			b.addVetoableChangeListener(this);
			b.addPropertyChangeListener(this);
		}
	}

	// ======== Utility methods ==================================

	/**
	 * Generates a default name for the given bean, while will be something like
	 * "Button1", "Button2", etc.
	 */
	public String generateUniqueName(Object object) {
		String className = Lisp.getDotName(object.getClass());
		return className + generateUniqueName(className, object);
	}

	public int generateUniqueName(String className, Object object) {
		int counter = 1;
		boolean done = false;
		String name = "???";
		while (findBean(className + counter) != null) {
			++counter;
		}
		return counter;
	}
}