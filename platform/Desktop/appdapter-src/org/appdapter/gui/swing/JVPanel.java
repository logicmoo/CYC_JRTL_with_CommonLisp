package org.appdapter.gui.swing;

import org.appdapter.gui.api.GetSetObject;

abstract public class JVPanel extends JJPanel implements GetSetObject {
	@Override
	abstract public Object getValue();
	/*
		abstract public <E extends T> E getTValue();
		
		@Override public Object getValue() {
			Debuggable.notImplemented();
			return getTValue();
		}

		@Override abstract public void setObject(Object obj) throws InvocationTargetException;
			abstract public void setObject(Object obj) throws Exception;
	*/

}
