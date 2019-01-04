package org.appdapter.gui.api;

import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;
import java.beans.PropertyVetoException;
import java.io.File;
import java.io.IOException;
import java.io.NotSerializableException;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;



import org.appdapter.gui.box.ScreenBoxImpl;
import org.appdapter.gui.util.Annotations.UIProvider;

/**
* A container of objects and corresponding Boxes, which
* add the concept of "name" and "selected". <p>
*
* Each object inside the NamedObjectCollection has a corresponding ScreenBox.
* A ScreenBox has a reference to the object it respresents, but given an object
* the only way to find the corresponding ScreenBox is to use
* findOrCreateBox(Object o)  <p>
*
* PropertyChangeListeners can register to find out when the selected
* value is changed, in which case the property "selectedObject" will change. <p>
*
* POJOCollectionListeners can register to find out when objects are added or removed.
*
* @see ScreenBox
* 
*/
public interface NamedObjectCollection //
		extends POJOCollection, UIProvider /*VetoableChangeListener, PropertyChangeListener, Serializable */{
	String getTitleOf(Object value);

	void reload();

	Map<String, BT> getNameToBoxIndex();

	public static String MISSING_COMPONENT = "<null>";

	/**
	 * Listeners will be notifed when the currently object selection is changed.
	 */
	void addPropertyChangeListener(PropertyChangeListener p);

	/**
	 * Returns the box corresponding to the given object, i.e the
	 * Box who's object corresponds to the given one. Returns null if
	 * the ObjectNavigator does not contain the given object.
	 */
	//POJOBox findOrCreateBox(Object object);

	boolean addTitleBoxed(String named, BT screenBoxImpl);

	boolean addValueBoxed(Object named, BT screenBoxImpl);

	/**
	 * Checks if this collection contains the given object
	 */
	boolean containsObject(Object object);

	/**
	 * Creates a new object of the given class and adds to this collection. The
	 * given class must have an empty constructor.
	 * 
	 * @throws InstantiationException
	 *             if the given Class represents an class, an
	 *             interface, an array class, a primitive type, or void; or if
	 *             the instantiation fails for some other reason
	 * @throws IllegalAccessException
	 *             if the given class or initializer is not accessible.
	 * 
	 * @returns the newly created Object
	 */
	Object createAndAddObject(Class cl) throws InstantiationException, IllegalAccessException;

	/**
	 * Returns the box with the given name, or null if none.
	 */
	@SuppressWarnings("rawtypes") BT findBoxByName(String name);

	/**
	 * Returns the box with the given object, or null if none.
	 */
	@SuppressWarnings("rawtypes") BT findBoxByObject(Object find);

	/**
	 * Returns all objects representing objects that are an instance of the
	 * given class or interface, either directly or indirectly.
	 */
	//<T> Collection<POJOBox<? extends T>> findBoxesByType(Class<T> type);

	/**
	 * Returns an iterator over all the object boxes. NOTE - this could be a
	 * bit slow! Avoid whenever possible. The code can be optimized for this,
	 * but it isn't right now.
	 */
	Iterator<BT> getBoxes();

	/**
	 * Returns the current number of objects in the collection
	 */
	//int getBoxesCount();

	/**
	 * Returns the currently selected object, or null if none.
	 */
	//Object getSelectedObject();

	/**
	 * This is used for ScreenBoxImpls to tell their POJOCollection that a
	 * property such as "name" or "selected" has changed. The POJOCollection
	 * will update its state as necessary.
	 */
	void propertyChange(PropertyChangeEvent evt);

	/**
	 * Removes the given object, if it is inside this collection. If not,
	 * nothing happens.
	 * <p>
	 * 
	 * POJOListeners will be notified.
	 * <p>
	 * 
	 * If the object was selected, the current selection will change to null and
	 * property change listeners will be notified.
	 * <p>
	 * 
	 */
	boolean removeObject(Object obj);

	/**
	 * Listeners will be notifed when the currently object selection is changed.
	 */
	void removePropertyChangeListener(PropertyChangeListener p);

	Iterable<BT> getScreenBoxes();

	DisplayContext getDisplayContext();

	/**
	 * This method gets called when a constrained property is changed.
	 *
	 * @param     evt a <code>PropertyChangeEvent</code> object describing the
	 *   	      event source and the property that has changed.
	 * @exception PropertyVetoException if the recipient wishes the property
	 *              change to be rolled back.
	 */
	void vetoableChange(PropertyChangeEvent evt) throws PropertyVetoException;

	void initAfterLoading();

	BT findOrCreateBox(String name, Object value) throws PropertyVetoException;

	void save(File file) throws NotSerializableException, IOException;

	Iterator getObjects();

	public Object findObjectByName(String name);

	public void renameObject(String oldName, String newName) throws PropertyVetoException;

	/**
	 * Adds a POJOCollectionListener to this context. The listener will
	 * find out when objects are added or removed.
	 */
	public void addListener(POJOCollectionListener o, boolean catchup);

	/**
	 * Adds a POJOCollectionListener to this context. The listener will
	 * find out when objects are added or removed.
	 */
	public void removeListener(POJOCollectionListener o);

	//void setSelectedObject(Object object) throws PropertyVetoException;

	String getName();

	BT asWrapped(Object d);

	Set getLiveCollection();

	Map<String, Object> getLiveMap();

	Collection findObjectsByName(String txt, java.lang.reflect.Type mustBe);

}