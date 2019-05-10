package org.appdapter.gui.api;

public interface AddTabFrames {

	@Override public boolean equals(Object obj);

	enum SetTabTo {
		ADD, REMOVE,
	}

	public void setTabs(BoxPanelSwitchableView tabs, DisplayContext context, Object object, Class objClass, SetTabTo cmds);
}
