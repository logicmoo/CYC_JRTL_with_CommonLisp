package org.appdapter.gui.api;

import java.awt.Component;
import java.beans.PropertyVetoException;
import java.util.Map;


import org.appdapter.core.debug.UIAnnotations.UIHidden;

import org.appdapter.api.trigger.Box;
import org.appdapter.api.trigger.Trigger;
import org.appdapter.api.trigger.UserResult;
import org.appdapter.core.convert.Convertable;

/**
 * A wrapper for objects used in the ScreenBox system. It holds an object,
 * a name, and info about whether it is selected or not. The "name" and
 * "selected" properties are bound and constrained, i.e. you can listen to
 * changes using addPropertyChangeListener, and you can also prevent changes in
 * some cases if you use addVetoableChangeListener.
 * 
 * 
 */
@UIHidden
public interface BT<TT extends Trigger<? extends ScreenBox<TT>>> //
		extends GetSetObject, java.io.Serializable, java.util.Map.Entry<String, Object>, Convertable, UserResult, IGetBox, //
		ScreenBox<TT>, DisplayContextProvider, Box<TT> //
//, GetDisplayContext, UIProvider,  //
//Map.Entry

/*<TrigType extends Trigger<? extends POJOBoxImpl<TrigType>>> extends MutableBox<TrigType>*//*extends org.appdapter.gui.api.IGetBox, GetObject, Convertable, *//*, Box<? extends Trigger<? extends Box<BT>>>*/
//extends ScreenBox, java.io.Serializable, GetSetObject, MutableBox {
{

	//public Box asBox();

	public abstract Object getDisplayTarget(DisplayType attachType);

	public abstract DisplayType getDisplayType();

	//	public <T> T[] getObjects(Class<T> type);

	//	public <T> boolean canConvert(Class<T> c);

	//	public <T> T convertTo(Class<T> c);

	//	public String getDebugName();

	//	public String getKey();

	/**
	 * This is used for ScreenComponentImpls to tell their BoxPanelSwitchableView that a
	 * property such as "name" or "selected" is about to change, allowing the
	 * BoxPanelSwitchableView to fire a PropertyVetoException to stop the change if it
	 * likes.
	 * <p>
	 * 
	 * This would happen, for example, if someone is trying to rename a object
	 * to a name that another object within this collection already has.
	 */
	//	public abstract void vetoableChange(PropertyChangeEvent evt) throws PropertyVetoException;

	/**
	 * This is used for ScreenComponentImpls to tell their BoxPanelSwitchableView that a
	 * property such as "name" or "selected" has changed. The BoxPanelSwitchableView
	 * will update its state as necessary.
	 */
	//public abstract void propertyChange(PropertyChangeEvent evt);

	/** 
	 * This returns the decomposed Mixins
	 * @return
	 */
	//public Iterable<Object> getObjects();

	//@Override public List<TrigType> getTriggers();

	// ==== Event listener registration =============

	/**
	 * PropertyChangeListeners will find out when the name or selection state
	 * changes.
	 */
	//	public void addPropertyChangeListener(PropertyChangeListener p);

	/**
	 * PropertyChangeListeners will find out when the name or selection state
	 * changes.
	 */
	//public void removePropertyChangeListener(PropertyChangeListener p);

	/**
	 * VetoableChangeListeners will find out when the name or selection state is
	 * about to change, and can prevent such changes if desired.
	 */
	///public void addVetoableChangeListener(VetoableChangeListener v);

	/**
	 * VetoableChangeListeners will find out when the name or selection state is
	 * about to change, and can prevent such changes if desired.
	 */
	//public void removeVetoableChangeListener(VetoableChangeListener v);

	// ===== Property getters and setters ========================

	/**
	 * Returns the object that this object wrapper represents
	 */
	//abstract public TrigType getValue();

	/**
	 * Returns the Class[]s that this object wrapper represents
	 */
	//abstract public Set<Class> getTypes();

	/**
	 * Returns the name of this object
	 */
	public String generateUniqueName(Map stringToSomething);

	/**
	 * Changes the name of this object. The name should never be null.
	 * 
	 * @throws PropertyVetoException
	 *             if someone refused to allow the name to change
	 */
	public void setUniqueName(String newName, Map stringToSomething) throws PropertyVetoException;

	/**
	 * Gets a BeanInfo object for this object, using the Introspector class
	 */
	//public BeanInfo getBeanInfo() throws IntrospectionException;

	//public Class<? extends Object> getObjectClass();

	public boolean isTypeOf(Class type);

	public boolean representsObject(Object test);

	public boolean isNamed(String... test);

	//public JPanel getPropertiesPanel();

	public Component getComponent(DisplayType attachType);

	//===== Property getters and setters ========================

	/**
	 * Changes the selection state.
	 *
	 * @throws PropertyVetoException if someone refused to allow selection state change
	 */
	//public void setUISelected(boolean newSelected) throws PropertyVetoException;

	/**
	 * True if this value is selected
	 */
	//	public boolean getUISelected();

	/**
	 * Returns the object that this value wrapper represents
	 */
	//public Object getValue();

	/**
	 * Returns the name of this value
	 */
	//public String getShortLabel();

	/**
	 * Changes the name of this value. The name should never be null.
	 *
	 * @throws PropertyVetoException if someone refused to allow the name to change
	 */
	public void setUniqueName(String newName) throws PropertyVetoException;

	/**
	 * Gets a BeanInfo object for this value, using the Introspector class
	 */
	//public BeanInfo getBeanInfo() throws IntrospectionException;

	/**
	 * Returns an Icon for this value, determined using BeanInfo.
	 * If no icon was found a default icon will be returned.
	 */
	//public Icon getIcon();

	/**
	 * Returns the name of this value
	 */
	public String toString();

	//public Object setValue(Object newValue);

	//	public abstract Object getValue();

	public abstract Object getValueOrThis();

	public abstract Object setValue(Object newValue);

	public abstract void addValue(Object newValue);

	public abstract void addTitle(String newValue);

	//public <T> T convertTo(Class<T> type);

}