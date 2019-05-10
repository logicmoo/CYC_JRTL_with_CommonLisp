package org.appdapter.gui.api;

import java.awt.Component;
import java.awt.Container;
import java.awt.Dimension;
import java.util.List;

import javax.swing.Icon;
import javax.swing.event.ChangeListener;

public interface BoxPanelSwitchableView {

	public boolean clearChildren();

	public Dimension getPreferredChildSize();

	public int childCount();

	public boolean addTab(String title, Component view);

	public boolean removeTab(String title, Component view);

	public int indexOf(String title, Component view);

	public boolean bringToFront(String title, Component view);

	public boolean sendToBack(String title, Component view);

	public Container getContainer();

	public void insertTab(String title, Icon icon, Component component, String tip, int index);

	public void addChangeListener(ChangeListener cc);

	public int indexOfComponent(Component view);

	public int getSelectedIndex();

	public void addComponent(String name, Component f, DisplayType panel);

	public boolean containsComponent(Component bp);

	public void setSelectedComponent(Component boxP);

	public Dimension getSize(DisplayType frame);

	public List<Component> containsComponentOfClass(Class comp);

	public Object getRootValue();

}