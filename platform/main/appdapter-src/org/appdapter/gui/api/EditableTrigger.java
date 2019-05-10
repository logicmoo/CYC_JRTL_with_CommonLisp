package org.appdapter.gui.api;

import java.util.concurrent.Callable;

import org.appdapter.api.trigger.MenuName;
import org.appdapter.api.trigger.MutableTrigger;
import org.appdapter.core.component.KnownComponent;
import org.appdapter.core.component.MutableKnownComponent;
import org.appdapter.gui.trigger.TriggerForClass;

public interface EditableTrigger extends MutableTrigger, KnownComponent, MenuName, TriggerForClass, Callable {

}
