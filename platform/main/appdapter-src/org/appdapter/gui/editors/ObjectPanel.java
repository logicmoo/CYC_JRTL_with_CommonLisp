package org.appdapter.gui.editors;

import org.appdapter.gui.api.BoxPanelSwitchableView;

public interface ObjectPanel {
	public Class<?> getClassOfBox();

	public void setTabHost(BoxPanelSwitchableView objectTabsForTabbedView);
}
