package org.appdapter.gui.trigger;

import org.appdapter.api.trigger.Box;
import org.appdapter.api.trigger.MutableTrigger;
import org.appdapter.core.component.KnownComponent;

public interface KMCTrigger<BoxType extends Box<? extends MutableTrigger<BoxType>>> extends MutableTrigger<BoxType>, KnownComponent, TriggerForType {

	public @Override void fire(Box targetBox);

}
