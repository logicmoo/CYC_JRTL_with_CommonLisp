package org.appdapter.gui.trigger;

import org.appdapter.api.trigger.Trigger;
import org.appdapter.gui.api.DisplayContext;

public interface TriggerForClass extends TriggerForType {

	boolean appliesTarget(Class cls, Object example);

	Trigger createTrigger(String menuFmt, DisplayContext ctx, Object poj);

	boolean isFavorited();

	boolean isSideEffectSafe();

}
