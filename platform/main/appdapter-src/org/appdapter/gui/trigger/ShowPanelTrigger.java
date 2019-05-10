package org.appdapter.gui.trigger;

import java.awt.event.ActionEvent;
import java.awt.event.MouseEvent;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import javax.swing.AbstractButton;

import org.appdapter.core.debug.UIAnnotations.UISalient;
import org.appdapter.api.trigger.Box;
import org.appdapter.api.trigger.Trigger;
import org.appdapter.trigger.bind.jena.TriggerImpl;
import org.appdapter.core.convert.ReflectUtils;
import org.appdapter.core.log.Debuggable;
import org.appdapter.gui.api.DisplayContext;
import org.appdapter.gui.api.UIAware;
import org.appdapter.gui.browse.Utility;
import org.appdapter.gui.swing.SafeJMenuItem;

public class ShowPanelTrigger<BT extends Box<TriggerImpl<BT>>> extends TriggerForInstance<BT> implements TriggerForClass {

	@Override public boolean isFavorited() {
		return true;
	}

	@Override
	public boolean isSideEffectSafe() {
		return false;
	}

	final Class panelClass;

	public ShowPanelTrigger(DisplayContext ctx, Class cls, Object obj, Class fd) {
		arg0Clazz = cls;
		_object = obj;
		panelClass = fd;
		displayContext = ctx;
		setDescription("Open a panel that is an instance of " + panelClass);
		setShortLabel(getMenuName());
	}

	@Override
	public String makeMenuPath() {
		return "* Panels|Show " + Utility.spaceCase(Utility.getShortClassName(panelClass));
	}

	@Override public String getDescription() {
		return "Open a panel that is an instance of " + getIdentityObject() + " for " + _object;
	}

	@Override public Class getReturnType() {
		return panelClass;
	}

	@Override
	public Object valueOf(Object targetBox, ActionEvent actevt, boolean wantSideEffect, boolean isPaste) {
		if (!wantSideEffect)
			return null;
		Object value = getValueOr(targetBox);
		try {
			Constructor cons = panelClass.getDeclaredConstructor();
			Object cust = Utility.newInstance(panelClass);
			Class classToTry = value == null ? null : value.getClass();

			for (String s : new String[] { "focusOnBox", "setObject", "setValue", "setBean" }) {
				Method m = ReflectUtils.getDeclaredMethod(panelClass, s, classToTry);
				if (m != null) {
					try {
						Class mustBe = m.getParameterTypes()[0];
						Object t = Utility.recastCC(value, mustBe);
						value = Utility.dref(value);
						m.invoke(cust, t);
						//@TODO cust.addPropertyChangeListener(listener)
						getDisplayContext().addObject(null, cust, true);
						return cust;
					} catch (Exception e) {
						getLogger().error("Skipping method " + m, e);
					}
				}
			}
			getLogger().error("No way to set object in panel " + panelClass);
			return null;
		} catch (Exception e) {
			getLogger().error("Not making panel of " + panelClass, e);
			return null;
		}
	}

	@Override public Object getIdentityObject() {
		return panelClass;
	}

	@Override public boolean equals(Object obj) {
		if (!(obj instanceof TriggerForType))
			return false;
		return getIdentityObject() == ((TriggerForType) obj).getIdentityObject();
	}

	@Override public void applySalience(UISalient isSalient) {
		// TODO Auto-generated method stub
	}

	@Override public void onMouseEvent(MouseEvent event) {
		// TODO Auto-generated method stub		
	}

	@Override public AbstractButton makeMenuItem(String menuName, final Object b) {
		final ShowPanelTrigger trig = this;

		AbstractButton jmi = null;
		if (menuName == null)
			menuName = getMenuName();
		jmi = new SafeJMenuItem(b, true, menuName);
		if (this instanceof UIAware) {
			jmi = (AbstractButton) ((UIAware) this).visitComponent(jmi);
		}
		jmi.addActionListener(trig);
		return jmi;
	}

	@Override void setMenuInfo() {
	}

	@Override public Class getDeclaringClass() {
		return arg0Clazz;
	}

	@Override public boolean appliesTarget(Class cls, Object example) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override public Trigger createTrigger(String menuFmt, DisplayContext ctx, Object poj) {
		// TODO Auto-generated method stub
		return new ShowPanelTrigger(ctx, arg0Clazz, _object, panelClass);
	}
}