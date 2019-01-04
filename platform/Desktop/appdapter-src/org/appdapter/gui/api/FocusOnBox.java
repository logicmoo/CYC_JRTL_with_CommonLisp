package org.appdapter.gui.api;

import java.util.Collection;

import org.appdapter.api.trigger.Box;

public interface FocusOnBox<T extends Box> {
	public void focusOnBox(T b);

	 Class<?> getClassOfBox();
}
