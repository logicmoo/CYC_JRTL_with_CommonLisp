package org.appdapter.gui.trigger;

import javax.swing.AbstractButton;

public interface ButtonFactory {

	AbstractButton makeMenuItem(String maybeLabel, Object b);

}
