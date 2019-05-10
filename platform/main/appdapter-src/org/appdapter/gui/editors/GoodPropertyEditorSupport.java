package org.appdapter.gui.editors;

import java.awt.Component;
import java.beans.PropertyEditorSupport;

import org.appdapter.core.log.Debuggable;

abstract public class GoodPropertyEditorSupport extends PropertyEditorSupport {
	@Override public String toString() {
		return "Editor: " + Debuggable.toInfoStringF(this);
	}

	@Override public boolean supportsCustomEditor() {
		return true;
	}

	abstract @Override public Component getCustomEditor();

}
