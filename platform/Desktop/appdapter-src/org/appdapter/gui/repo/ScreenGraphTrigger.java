package org.appdapter.gui.repo;

import org.appdapter.api.trigger.Box;
import org.appdapter.trigger.bind.jena.TriggerImpl;

public class ScreenGraphTrigger<MRB extends Box<TriggerImpl<MRB>>> extends TriggerImpl<MRB> /*
* with FullTrigger<GraphBox>
*/{

	final String myDebugName;

	public ScreenGraphTrigger(String myDebugNym) {
		myDebugName = myDebugNym;
	}

	@Override public String getShortLabel() {
		String str = super.getShortLabel();
		if (str != null)
			return str;
		return myDebugName;
	}

	@Override public String toString() {
		return getClass().getName() + "[name=" + myDebugName + "]";
	}

	@Override public void fire(Box targetBox) {
		getLogger().debug(this.toString() + " firing on " + targetBox.toString());

	}
}