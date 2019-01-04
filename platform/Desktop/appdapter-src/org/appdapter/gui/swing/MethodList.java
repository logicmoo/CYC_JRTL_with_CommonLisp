package org.appdapter.gui.swing;

import java.awt.Component;
import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.MethodDescriptor;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;

import javax.swing.AbstractListModel;
import javax.swing.DefaultListCellRenderer;
import javax.swing.JList;
import javax.swing.ListCellRenderer;

import org.appdapter.core.convert.ReflectUtils;
import org.appdapter.core.log.Debuggable;
import org.appdapter.gui.browse.Utility;

/**
 * A GUI component that shows all the static methods for a given class,
 * and provides ways of executing these methods.
 *
 *
 */
public class MethodList extends JJList {

	class MethodComparator implements Comparator {
		@Override public int compare(Object first, Object second) {
			Method a = (Method) first;
			Method b = (Method) second;
			String nameA = a.getName();
			String nameB = b.getName();
			return nameA.compareToIgnoreCase(nameB);
		}

		@Override public boolean equals(Object o) {
			return (o instanceof MethodComparator);
		}
	}

	boolean showStatic = true;
	boolean showNonStatic = true;
	boolean showNonPublic = true;
	private Object object;
	private Class objectClass;
	private ModelFromMethods model;
	protected boolean basicBeanInfo;

	protected void reload() {
		this.model = new ModelFromMethods();
		setModel(model);
	}

	public MethodList(Object object, boolean isClass) {
		this(object, isClass ? (Class) object : null, isClass, !isClass);
	}

	public MethodList(Object object, Class objCl, boolean showStatics, boolean showNonStatics) {
		this.object = object;
		this.showStatic = showStatics;
		this.showNonStatic = showNonStatics;
		if (objCl == null)
			objCl = object.getClass();
		this.objectClass = objCl;
		if (object instanceof Class) {
			objectClass = (Class) object;
			object = null;
		}
		reload();
	}

	@Override
	public ListCellRenderer getCellRenderer() {
		ListCellRenderer lcr = super.getCellRenderer();
		if (true) {
			return new DefaultListCellRenderer() {

				@Override public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
					DefaultListCellRenderer readOnly = (DefaultListCellRenderer) super.getListCellRendererComponent(list, value, index, isSelected, cellHasFocus);
					//readOnly.setName("" + value);
					readOnly.setDropTarget(null);
					readOnly.setToolTipText("" + model.getMethodAt(index));
					return readOnly;
				}
			};
		}
		return lcr;
	}

	class ModelFromMethods extends AbstractListModel {
		final List methods = new LinkedList();

		public ModelFromMethods() {
			fromGetMethods();
			if (showNonPublic)
				fromGetDeclaredMethods();
			fromBasicBeanInfo();
			if (!basicBeanInfo) {
				fromExtBeanInfo();
			}
			Collections.sort(methods, new MethodComparator());
		}

		private void fromBasicBeanInfo() {
			BeanInfo info;
			try {
				info = Introspector.getBeanInfo(getObjectClass());
				MethodDescriptor[] descriptors;
				descriptors = info.getMethodDescriptors();
				for (int i = 0; i < descriptors.length; ++i) {
					MethodDescriptor descriptor = descriptors[i];
					Method method = descriptor.getMethod();
					addMethod(method);
				}
			} catch (IntrospectionException e) {
				Debuggable.UnhandledException(e);
			}
		}

		private void fromExtBeanInfo() {
			try {
				BeanInfo info = Utility.getBeanInfo(getObjectClass(), object);

				MethodDescriptor[] descriptors;
				descriptors = info.getMethodDescriptors();
				for (int i = 0; i < descriptors.length; ++i) {
					MethodDescriptor descriptor = descriptors[i];
					Method method = descriptor.getMethod();
					addMethod(method);
				}
			} catch (IntrospectionException e) {
				Debuggable.UnhandledException(e);
			}
		}

		private void addMethod(Method method) {
			boolean isPublic = Modifier.isPublic(method.getModifiers());
			if (!isPublic && !showNonPublic)
				return;
			boolean isStatic = ReflectUtils.isStatic(method);
			if (!showStatic && isStatic)
				return;
			if (!showNonStatic && !isStatic)
				return;
			if (methods.contains(method))
				return;
			methods.add(method);
		}

		private void fromGetMethods() {
			Method[] methodsArray = objectClass.getMethods();

			for (int i = 0; i < methodsArray.length; ++i) {
				Method method = methodsArray[i];
				addMethod(method);
			}

		}

		private void fromGetDeclaredMethods() {
			Method[] methodsArray = objectClass.getDeclaredMethods();

			for (int i = 0; i < methodsArray.length; ++i) {
				Method method = methodsArray[i];
				addMethod(method);
			}

		}

		@Override public Object getElementAt(int index) {
			try {
				return getMethodAt(index).getName();
			} catch (Exception err) {
				return null;
			}
		}

		public Method getMethodAt(int index) {
			try {
				if(index<0) return null;
				return (Method) methods.get(index);
			} catch (Exception err) {
				return null;
			}
		}

		@Override public int getSize() {
			return methods.size();
		}
	}

	public Class getObjectClass() {
		return this.objectClass;
	}

	public Method getSelectedMethod() {
		return model.getMethodAt(getSelectedIndex());
	}

}
