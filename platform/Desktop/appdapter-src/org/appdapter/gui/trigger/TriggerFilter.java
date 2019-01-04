package org.appdapter.gui.trigger;

import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

import org.appdapter.core.log.Debuggable;

public class TriggerFilter implements Cloneable {

	@Override public String toString() {
		return Debuggable.toInfoStringF(this);
	}

	boolean addInstance;
	boolean addStatic;
	boolean addSuperClass;
	boolean addPanelClasses = UtilityMenuOptions.addPanelClasses;
	boolean addPrivate;
	boolean addProtected;
	boolean addPackage;
	boolean addPublic = true;
	boolean addFields = true;
	boolean addMethods = true;
	boolean addEvents = false;
	boolean addGlobalStatics = UtilityMenuOptions.addGlobalStatics || UtilityMenuOptions.allTriggersAreGlobal;
	boolean addNonMembers = addGlobalStatics;
	
	public TriggerFilter clone() {
		try {
			return (TriggerFilter) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			return this;
		}
	}

	TriggerFilter(boolean addIt) {
		this.addInstance = addIt;
		this.addStatic = addIt;
		this.addSuperClass = addIt;
		//this.addPanelClasses = addIt;
		this.addAllAccessLevels(addIt);
	}

	void addAllAccessLevels(boolean addIt) {
		this.addPrivate = addIt;
		this.addProtected = addIt;
		this.addPackage = addIt;
	}

	public boolean accepts(java.lang.reflect.Member method) {
		int mods = method.getModifiers();
		if (Modifier.isStatic(mods)) {
			if (!addStatic)
				return false;
		} else {
			if (!addInstance)
				return false;
		}

		if (method instanceof Field) {
			if (!addFields)
				return false;
		} else if (method instanceof Method) {
			if (!addMethods)
				return false;
		} else if (!addNonMembers)
			return false;

		if (Modifier.isProtected(mods)) {
			if (!addProtected)
				return false;
		} else if (Modifier.isPrivate(mods)) {
			if (!addPrivate)
				return false;
		} else if (Modifier.isPublic(mods)) {
			if (!addPublic)
				return false;
		} else {
			if (!addPackage)
				return false;
		}
		return true;
	}
}