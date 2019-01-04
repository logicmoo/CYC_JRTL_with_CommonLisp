package org.appdapter.gui.trigger;

import java.awt.event.ActionEvent;

import javax.swing.Action;

import org.appdapter.api.trigger.Box;
import org.appdapter.api.trigger.Trigger;
import org.appdapter.trigger.bind.jena.TriggerImpl;
import org.appdapter.core.log.Debuggable;

public class TriggerForAction extends TriggerImpl implements Trigger {

	Action action;

	public TriggerForAction(Action act) {
		action = act;
	}

	@Override public String toString() {
		return action.toString();
	}

	@Override public String getShortLabel() {
		return "" + action.getValue(Action.NAME);
	}

	@Override public String getDescription() {
		return "" + Debuggable.toInfoStringF(action);
	}

	@Override public void fire(Box targetBox) {
		action.actionPerformed(new ActionEvent(targetBox, -1, (String) action.getValue(Action.ACTION_COMMAND_KEY)));
	}
}
