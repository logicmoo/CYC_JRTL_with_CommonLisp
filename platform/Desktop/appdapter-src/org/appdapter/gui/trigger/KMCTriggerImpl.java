package org.appdapter.gui.trigger;

import java.awt.event.ActionEvent;
import java.beans.FeatureDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Member;

import org.appdapter.api.trigger.Box;
import org.appdapter.gui.api.DisplayContext;

abstract public class KMCTriggerImpl extends TriggerForMember implements KMCTrigger {

	public KMCTriggerImpl(String menuName, DisplayContext ctx, Class cls, Object obj, Member fd, boolean isDeclNonStatic0, FeatureDescriptor feature, boolean hasNoSideEffects) {
		super(false, menuName, ctx, cls, obj, fd, isDeclNonStatic0, feature, hasNoSideEffects);
	}

	@Override public boolean equals(Object obj) {
		if (!(obj instanceof TriggerForType))
			return false;
		return getIdentityObject() == ((TriggerForType) obj).getIdentityObject();
	}

	public abstract Object valueOf(Box targetBox, ActionEvent actevt, boolean wantSideEffect, boolean isPaste) throws InvocationTargetException;
}
