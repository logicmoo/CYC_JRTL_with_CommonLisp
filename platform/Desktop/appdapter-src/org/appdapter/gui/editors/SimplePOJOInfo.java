package org.appdapter.gui.editors;

import java.awt.Image;
import java.beans.BeanDescriptor;
import java.beans.BeanInfo;
import java.beans.Customizer;
import java.beans.EventSetDescriptor;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.MethodDescriptor;
import java.beans.PropertyDescriptor;
import java.beans.SimpleBeanInfo;
import java.lang.reflect.Field;
import java.util.ArrayList;

import org.appdapter.core.log.Debuggable;
import org.appdapter.gui.browse.PropertyDescriptorForField;
import org.appdapter.gui.browse.Utility;

public class SimplePOJOInfo extends SimpleBeanInfo {

	final public BeanDescriptor getBeanDescriptor() {
		if (normalBeanInfo != null) {
			BeanDescriptor bd = normalBeanInfo.getBeanDescriptor();
			if (bd != null)
				return bd;
		}
		return new BeanDescriptor(beanClass, customizers.get(0));
	}

	ArrayList<Class> customizers = new ArrayList<Class>();

	Class beanClass;
	BeanInfo normalBeanInfo;

	PropertyDescriptor[] pdcache;
	MethodDescriptor[] mdcache;

	Object targetObject;

	final static PropertyDescriptor[] NO_PROPS = new PropertyDescriptor[0];

	@Override public PropertyDescriptor[] getPropertyDescriptors() {
		if (pdcache == null) {
			if (normalBeanInfo == null)
				return NO_PROPS;
			PropertyDescriptor[] before = normalBeanInfo.getPropertyDescriptors();
			try {
				pdcache = Utility.getProperties(this.targetObject, beanClass, before).toArray(NO_PROPS);
				return pdcache;
			} catch (IntrospectionException e) {
				Debuggable.printStackTrace(e);
				return before;
			}
		}
		return pdcache;
	}

	@Override public MethodDescriptor[] getMethodDescriptors() {
		if (mdcache == null) {
			if (normalBeanInfo == null)
				return new MethodDescriptor[0];
			mdcache = normalBeanInfo.getMethodDescriptors();
		}
		return mdcache;
	}

	@Override public Image getIcon(int iconKind) {
		if (normalBeanInfo == null)
			return super.getIcon(iconKind);
		return normalBeanInfo.getIcon(iconKind);
	}

	/**
	 * This is a utility method to help in loading icon images.
	 * It takes the name of a resource file associated with the
	 * current object's class file and loads an image object
	 * from that file.  Typically images will be GIFs.
	 * <p>
	 * @param resourceName  A pathname relative to the directory
	 *		holding the class file of the current class.  For example,
	 *		"wombat.gif".
	 * @return  an image object.  May be null if the load failed.
	 */
	public java.awt.Image loadImage(final String resourceName) {
		java.awt.Image img = Utility.loadImage(getClass(), resourceName);
		if (img != null)
			return img;
		return null;
	}

	@Override public EventSetDescriptor[] getEventSetDescriptors() {
		if (normalBeanInfo == null)
			return new EventSetDescriptor[0];
		return normalBeanInfo.getEventSetDescriptors();
	}

	@Override public int getDefaultPropertyIndex() {
		if (normalBeanInfo == null)
			return super.getDefaultPropertyIndex();
		return normalBeanInfo.getDefaultPropertyIndex();
	}

	@Override public int getDefaultEventIndex() {
		if (normalBeanInfo == null)
			return super.getDefaultEventIndex();
		return normalBeanInfo.getDefaultEventIndex();
	}

	public SimplePOJOInfo(Class cls, Class<? extends Customizer> customizer, BeanInfo orig, Object target) {
		this(cls, customizer);
		targetObject = target;
		normalBeanInfo = orig;
	}

	public SimplePOJOInfo(Class cls, Class<? extends Customizer> customizer) {
		super();
		beanClass = cls;
		if (customizer != null)
			customizers.add(customizer);
	}

	static int inGNInfo = 0;

	BeanInfo getNormalBeanInfo() {
		if (normalBeanInfo == null)
			try {
				normalBeanInfo = Introspector.getBeanInfo(beanClass);
			} catch (Throwable e) {
				throw BrokenBeanInfo(e);
			}
		return normalBeanInfo;
	}

	final public BeanInfo[] getAdditionalBeanInfo() {
		if (true)
			return null;
		if (inGNInfo > 0)
			return null;
		inGNInfo++;
		try {
			if (useNormalBeanInfo())
				normalBeanInfo.getAdditionalBeanInfo();
			return new BeanInfo[] { getNormalBeanInfo() };
		} finally {
			inGNInfo--;
		}
	}

	private boolean useNormalBeanInfo() {
		return false;
	}

	private PropertyDescriptor[] fieldsToProperties(ArrayList<Field> fields, Object poj) {
		int len = fields.size();
		ArrayList<PropertyDescriptor> pds = new ArrayList<PropertyDescriptor>();
		for (Field f : fields) {
			try {
				pds.add(PropertyDescriptorForField.findOrCreate(f).makePD(poj));
			} catch (Throwable e) {
				throw BrokenBeanInfo(e);
			}
		}
		return pds.toArray(new PropertyDescriptor[len]);
	}

	static RuntimeException BrokenBeanInfo(Throwable e) {
		if (e instanceof Error) {
			e.printStackTrace();
			throw (Error) e;
		}
		if (e instanceof RuntimeException)
			return (RuntimeException) e;
		return new RuntimeException(e);
	}

	private PropertyDescriptor[] properties;

}
