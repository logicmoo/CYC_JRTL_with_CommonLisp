package org.appdapter.gui.test;

import java.awt.Button;
import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;

import org.appdapter.core.name.FreeIdent;
import org.appdapter.core.name.Ident;

/**
* A general test-value with some typical properties and events.
*/
public class TestObject {
	private String name = "Unnamed";
	private Ident myIdent = new FreeIdent("http://foo/bar#baz");
	private int value = 0;
	private Integer value2 = new Integer(10);
	private Button button = null;
	private PropertyChangeSupport propSupport = new PropertyChangeSupport(this);

	private static int staticValue = 12;

	public TestObject() {
	}

	public static void setStaticValue(int i) {
		staticValue = i;
	}

	public static int getStaticValue() {
		return staticValue;
	}

	public void addPropertyChangeListener(PropertyChangeListener p) {
		propSupport.addPropertyChangeListener(p);
	}

	public void removePropertyChangeListener(PropertyChangeListener p) {
		propSupport.removePropertyChangeListener(p);
	}

	public void setUniqueName(String name) {
		this.name = name;
		propSupport.firePropertyChange("name", null, name);
	}

	public String getUniqueName() {
		return name;
	}

	public void setValue(int value) {
		this.value = value;
		propSupport.firePropertyChange("value", null, new Integer(value));
	}

	public int getValue() {
		return value;
	}

	public void bzz(Integer value2) {
		this.value2 = value2;
		propSupport.firePropertyChange("value2", null, value2);
	}

	public Integer getValue2() {
		return value2;
	}

	public void setButton(Button button) {
		this.button = button;
		propSupport.firePropertyChange("button", null, button);
	}

	public Button getButton() {
		return button;
	}

	public String toString() {
		return name + " (" + hashCode() + ")";
	}

	/**
	 * @return the myIdent
	 */
	private Ident getIdent() {
		return myIdent;
	}

	/**
	 * @param myIdent the myIdent to set
	 */
	private void setIdent(Ident myIdent) {
		this.myIdent = myIdent;
	}
}
