package org.appdapter.gui.trigger;

import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

import javax.swing.Action;
import javax.swing.JMenu;
import javax.swing.JPopupMenu;

import org.appdapter.api.trigger.Box;
import org.appdapter.api.trigger.BoxContext;
import org.appdapter.core.jvm.GetObject;
import org.appdapter.api.trigger.Trigger;
import org.appdapter.core.convert.Convertable;
import org.appdapter.core.convert.ReflectUtils;
import org.appdapter.gui.api.BT;
import org.appdapter.gui.api.DisplayContext;
import org.appdapter.gui.api.NamedObjectCollection;
import org.appdapter.gui.api.POJOCollectionListener;
import org.appdapter.gui.browse.Utility;
import static org.appdapter.core.convert.ReflectUtils.*;

/**
 * The controller class for a object menu (JMenu or JPopupMenu), showing the list
 * of available actions for some given objects. <p>
 *
 * The list of available actions is fetched from the
 * given POJOCollectionContext. <p>
 *
 * If the object or context is null the menu will be empty.
 *
 *
 */
public class TriggerMenuController implements POJOCollectionListener, Convertable, Box {
	NamedObjectCollection localCollection;
	final DisplayContext context;
	final TriggerMenuFactory triggerFactory;

	Collection objects;

	JPopupMenu popup = null;
	JMenu menu = null;
	public MouseEvent originalMouseEvent;
	private String myLabel = "";
	private List moreTriggers;

	private TriggerMenuController(DisplayContext context0, MouseEvent e, NamedObjectCollection noc) {
		this.originalMouseEvent = e;
		objects = new ArrayList();
		if (context0 == null)
			context0 = Utility.getCurrentContext();
		this.context = context0;
		if (noc == null)
			noc = context0.getLocalBoxedChildren();
		this.localCollection = noc;
		triggerFactory = TriggerMenuFactory.getInstance(context);
	}

	public TriggerMenuController(DisplayContext context0, MouseEvent e, NamedObjectCollection noc, JPopupMenu popup0) {
		this(context0, e, noc);
		this.popup = popup0;
	}

	public TriggerMenuController(DisplayContext context0, MouseEvent e, NamedObjectCollection noc, JMenu menu0) {
		this(context0, e, noc);
		this.menu = menu0;
		if (localCollection != null) {
			localCollection.addListener(this, false);
		}
	}

	void updateMenu() {
		Utility.invokeAndWait(new Runnable() {
			@Override public void run() {
				if (popup != null)
					popup.removeAll();
				if (menu != null)
					menu.removeAll();

				Collection objects0 = objects;
				TriggerMenuController.this.objects = new ArrayList();
				for (Object o : objects0) {
					addMenuFromObject(o);
				}
			}
		});
	}

	public void addMenuFromObject(Object o) {
		if (o == null)
			return;
		if (!objects.contains(o))
			objects.add(o);
		//initLabelText(o);
		if (o instanceof Action) {
			addAction((Action) o);
			return;
		}
		if (o instanceof PopupAdder) {
			if (popup instanceof JPopupMenu) {
				((PopupAdder) o).addLocalContributions((JPopupMenu) popup);
				return;
			} else {
				Utility.warn("Popup adder cannot add to " + popup.getClass() + " = " + popup);
			}

		}

		if (context != null) {
			Collection actions = context.getTriggersFromUI(o);
			Iterator it = actions.iterator();
			while (it.hasNext()) {
				Trigger t = (Trigger) it.next();
				addTrigger(t);
			}
		}
		if (popup != null)
			triggerFactory.addTriggersToPopup(o, popup);
		if (menu != null)
			triggerFactory.addTriggersToPopup(o, menu);

	}

	private Object asBox() {
		return this;
	}

	private void initLabelText(final Object object) {
		final String label = Utility.getUniqueNamePretty(object);
		if (this.myLabel.contains(label)) {
			return;
		}
		this.myLabel = label + " " + this.myLabel;
		final String setLabel = myLabel;
		Utility.invokeLater(new Runnable() {

			@Override public void run() {
				if (menu != null) {
					menu.setText(setLabel);
					menu.setToolTipText(Utility.makeTooltipText(object));
				}
				if (popup != null) {
					popup.setLabel(setLabel);
					popup.setToolTipText(Utility.makeTooltipText(object));
				}
			}
		});
	}

	/*Box asBox() {
		return boxed.asBox();
	}*/

	void addAction(Action a) {
		if (popup != null) {
			triggerFactory.addMenuItem(a, asBox(), popup);
		}
		if (menu != null) {
			triggerFactory.addMenuItem(a, asBox(), menu);
		}
	}

	void addTrigger(Trigger t) {
		if (t instanceof Action) {
			Action action = (Action) t;
			addAction(action);
			return;
		}

		if (popup != null) {
			triggerFactory.addTriggerToPoppup(popup, asBox(), t);
		}
		if (menu != null) {
			triggerFactory.addTriggerToPoppup(menu, asBox(), t);
		}
	}

	/*  void removeAction(Action a) {
	    if (popup != null) {
	      popup.remove(a);
	    } else {
	      menu.remove(a);
	    }
	  }
	*/

	@Override public void pojoAdded(Object obj, BT wrapper, Object senderCollection) {
		if (objects.contains(obj)) {
			updateMenu();
		}
	}

	@Override public void pojoRemoved(Object obj, BT wrapper, Object senderCollection) {
		if (objects.contains(obj)) {
			updateMenu();
		}
	}

	@Override public <T> boolean canConvert(Class<T> c) {
		return ReflectUtils.canConvert(c, getObjects(), this);
	}

	@Override public <T> T convertTo(Class<T> c) {
		return ReflectUtils.convertTo(c, getObjects(), this);
	}

	private Iterable<?> getObjects() {
		return objects;
	}

	@Override public BoxContext getBoxContext() {
		return null;
	}

	@Override public Iterable getObjects(Class type) {
		if (type == null)
			return (Iterable) getObjects();
		HashSet objs = new HashSet();
		if (this.canConvert(type)) {
			Object one = convertTo(type);
			objs.add(one);
		}
		for (Object o : getObjects()) {
			if (type.isInstance(o)) {
				objs.add(o);
			}
		}
		return objs;
	}

	@Override public List getTriggers() {
		return this.moreTriggers;
	}

	@Override public Object getValue() {
		return this;
	}

	public void addTriggers(Collection<Trigger> trigs) {
		if (this.moreTriggers == null)
			moreTriggers = new ArrayList();
		moreTriggers.addAll(trigs);
		for (Object o : trigs) {
			addMenuFromObject(o);
		}
	}

}
