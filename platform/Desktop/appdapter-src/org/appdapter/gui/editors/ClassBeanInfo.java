package org.appdapter.gui.editors;


/**
 * A BeanInfo for java.lang.Class. This one provides a Customizer
 * GUI class which the same as LargeBeanView, but adds tabs
 * for static methods and constructors as well.
*/
public class ClassBeanInfo extends SimplePOJOInfo {
	public ClassBeanInfo() {
		super(Class.class, LargeObjectView.class);
	}
}