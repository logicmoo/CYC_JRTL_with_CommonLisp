package org.appdapter.gui.editors;

import java.util.AbstractCollection;


public class AbstractCollectionBeanInfo extends SimplePOJOInfo {
	public AbstractCollectionBeanInfo() {
		super(AbstractCollection.class, LargeObjectView.class);
	}
}