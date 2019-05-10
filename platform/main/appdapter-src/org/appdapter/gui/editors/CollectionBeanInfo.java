package org.appdapter.gui.editors;

import java.util.Collection;


public class CollectionBeanInfo extends SimplePOJOInfo {
	public CollectionBeanInfo() {
		super(Collection.class, LargeObjectView.class);
	}
}