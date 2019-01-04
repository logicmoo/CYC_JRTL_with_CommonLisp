/*
 *  Copyright 2011 by The Appdapter Project (www.appdapter.org).
 *
 *  Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *       http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 */

package org.appdapter.gui.browse;

import java.util.WeakHashMap;

import javax.swing.JPanel;

import org.appdapter.api.trigger.Box;
import org.appdapter.core.jvm.ObjectKey;
import org.appdapter.core.component.KnownComponent;
import org.appdapter.gui.api.BoxPanelSwitchableView;
import org.appdapter.gui.api.DisplayContext;
import org.appdapter.gui.api.DisplayType;
import org.appdapter.gui.api.ScreenBox;
import org.appdapter.gui.api.ScreenBox.Kind;

/**
 * @author Stu B. <www.texpedient.com>
 */
public class BrowseTabFuncs {

	static WeakHashMap<String, Box> boxKeyToImpl = new WeakHashMap<String, Box>();

	protected static boolean isBoxTabKnown_maybe(DisplayContext dc, KnownComponent nonPanel) {
		BoxPanelSwitchableView tabbedPane = dc.getBoxPanelTabPane();
		String key = ObjectKey.factory.getKeyName(tabbedPane, nonPanel);
		return boxKeyToImpl.containsKey(key);
	}

	protected static boolean isBoxTabKnown(DisplayContext dc, String label) {
		BoxPanelSwitchableView tabbedPane = dc.getBoxPanelTabPane();
		String key = ObjectKey.factory.getKeyName(tabbedPane, label);
		return boxKeyToImpl.containsKey(key);
	}

	protected static boolean isBoxTabKnown_maybe_not(DisplayContext dc, JPanel bp) {
		BoxPanelSwitchableView tabbedPane = dc.getBoxPanelTabPane();
		if (tabbedPane.containsComponent(bp)) {
			Utility.warn("gettign subcomponent!" + bp);
			return true;
		}
		return false;
	}

	protected static void setSelectedBoxTab(DisplayContext dc, JPanel boxP) {
		BoxPanelSwitchableView tabbedPane = dc.getBoxPanelTabPane();
		tabbedPane.setSelectedComponent(boxP);
	}

	protected static void addBoxTab(DisplayContext dc, Box box, JPanel boxP, String label) {
		BoxPanelSwitchableView tabbedPane = dc.getBoxPanelTabPane();
		tabbedPane.addComponent(label, boxP, DisplayType.PANEL);
		String key = ObjectKey.factory.getKeyName(tabbedPane, label);
		boxKeyToImpl.put(key, box);
		if (!tabbedPane.containsComponent(boxP)) {
			tabbedPane.addComponent(label, boxP, DisplayType.PANEL);
			if (!tabbedPane.containsComponent(boxP)) {
				throw new RuntimeException("Cant add " + boxP + " to " + dc);
			}
		}
	}

	/**
	 * It's OK to call this repeatedly for the same boxI.
	 *
	 * @param dc
	 * @param boxI
	 *            - We rely on this boxI to "find" the right panel, and return
	 *            the same panel if it's been opened before.
	 *
	 *       But! we can only have one panel of each kind per box
	 * @param kind
	 */
	public static void openBoxPanelAndFocus(DisplayContext dc, ScreenBox boxI, Kind kind) {

		if (Utility.selectedDisplaySontext == null) {
			Utility.selectedDisplaySontext = dc;
		}
		JPanel panel = boxI.findOrCreateBoxPanel(kind);
		panel.invalidate();
		String tabLabel = kind.toString() + "-" + boxI.getShortLabel();
		if (!isBoxTabKnown(dc, tabLabel)) {
			addBoxTab(dc, boxI, panel, tabLabel);
		}
		if (!isBoxTabKnown(dc, tabLabel)) {
			// this is here for tracing purposes
			addBoxTab(dc, boxI, panel, tabLabel);
		}
		setSelectedBoxTab(dc, panel);
		focusOnPanelBox(panel, boxI);
	}

	public static void focusOnPanelBox(JPanel boxP, Box boxI) {
		boxP.show(true);
	}

}
