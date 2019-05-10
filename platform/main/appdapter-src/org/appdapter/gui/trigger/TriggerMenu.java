package org.appdapter.gui.trigger;

import java.awt.event.MouseEvent;
import java.util.Collection;

import org.appdapter.gui.api.DisplayContext;
import org.appdapter.gui.api.NamedObjectCollection;
import org.appdapter.gui.swing.SafeJMenu;

/**
 * A menu showing the available triggers for a boxed Pojo.
 * The valid menu actions are fetched from the boxed Pojo context
 *
 * 
 */
public class TriggerMenu extends SafeJMenu {
	TriggerMenuController controller;

	public TriggerMenu(String title, MouseEvent e, DisplayContext context, NamedObjectCollection noc, Object... objects) {
		super(true, title, null);
		controller = new TriggerMenuController(context, e, noc, this);
		super.userObject = controller;
		for (Object o : objects) {
			controller.addMenuFromObject(o);
		}
	}
}