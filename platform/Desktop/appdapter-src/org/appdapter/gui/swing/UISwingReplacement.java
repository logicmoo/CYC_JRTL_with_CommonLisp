package org.appdapter.gui.swing;

import org.appdapter.core.debug.UIAnnotations.HRKRefinement;

import org.appdapter.gui.util.Annotations.UIProvider;

public interface UISwingReplacement extends UIProvider, HRKRefinement {
	public void updateUI();

}