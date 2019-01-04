package org.appdapter.gui.editors;


public class ThrowableBeanInfo extends SimplePOJOInfo {
	public ThrowableBeanInfo() {
		super(Throwable.class, LargeObjectView.class);
	}
}