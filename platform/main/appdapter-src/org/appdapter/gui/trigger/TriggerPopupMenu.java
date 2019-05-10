package org.appdapter.gui.trigger;

import java.awt.event.MouseEvent;
import java.beans.PropertyChangeListener;
import java.util.Collection;
import java.util.List;

import javax.swing.Action;
import javax.swing.JButton;
import javax.swing.JMenuItem;
import javax.swing.JPopupMenu;

import org.appdapter.api.trigger.Trigger;
import org.appdapter.gui.api.DisplayContext;
import org.appdapter.gui.api.NamedObjectCollection;
import org.appdapter.gui.swing.SafeJMenuItem;
//import org.armedbear.lisp.Throw;

/**
 * A Popup menu for a object. The valid actions are
 * fetched using the objects context.
 */
public class TriggerPopupMenu extends JPopupMenu {
	final TriggerMenuController controller;

	public TriggerPopupMenu(DisplayContext context, MouseEvent e, NamedObjectCollection noc) {
		setLabel("TPM");
		controller = new TriggerMenuController(context, e, noc, this);
	}

	/**
	 * Appends a new menu item to the end of the menu which
	 * dispatches the specified <code>Action</code> object.
	 *
	 * @param a the <code>Action</code> to add to the menu
	 * @return the new menu item
	 * @see Action
	 */
	@Override
	public JMenuItem add(Action a) {
		JMenuItem mi = createActionComponent(a);
		mi.setAction(a);
		add(mi);
		try {
		String ttt = "" + a.getValue("tooltip");
		mi.setToolTipText(ttt);
		setToolTipText(ttt);
		} catch(Throwable t){}
		return mi;
	}

	/**
	 * Factory method which creates the <code>JMenuItem</code> for
	 * <code>Actions</code> added to the <code>JPopupMenu</code>.
	 *
	 * @param a the <code>Action</code> for the menu item to be added
	 * @return the new menu item
	 * @see Action
	 *
	 * @since 1.3
	 */
	protected JMenuItem createActionComponent(Action a, Object ctx) {
		JMenuItem mi = new SafeJMenuItem(ctx, true) {
			@Override
			protected PropertyChangeListener createActionPropertyChangeListener(Action a) {
				PropertyChangeListener pcl = createActionChangeListener(this);
				if (pcl == null) {
					pcl = super.createActionPropertyChangeListener(a);
				}
				return pcl;
			}
		};
		mi.setHorizontalTextPosition(JButton.TRAILING);
		mi.setVerticalTextPosition(JButton.CENTER);
		return mi;
	}

	public void addMenuFromObject(Object o) {
		controller.addMenuFromObject(o);

	}

	public void addTriggers(Collection<Trigger> trigs) {
		controller.addTriggers(trigs);
	}

}