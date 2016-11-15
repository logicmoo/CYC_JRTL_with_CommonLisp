/*
 * ItemListener.java
 *
 * Copyright (C) 2003-2005 Peter Graves
 * $Id: ItemListener.java 11297 2008-08-31 13:26:45Z ehuelsmann $
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
 */

package com.cyc.tool.subl.jrtl.nativeCode.commonLisp.java.awt;

import java.awt.Checkbox;
import java.awt.CheckboxMenuItem;
import java.awt.Choice;
import java.awt.ItemSelectable;
import java.awt.List;
import java.awt.event.ItemEvent;

import javax.swing.AbstractButton;
import javax.swing.ButtonModel;
import javax.swing.DefaultButtonModel;
import javax.swing.JComboBox;

import com.cyc.tool.subl.jrtl.nativeCode.commonLisp.JHandler;

public class ItemListener implements java.awt.event.ItemListener {
	public static synchronized void addTo(AbstractButton abstractbutton) {
		ItemListener itemlistener = new ItemListener();
		itemlistener.handle = abstractbutton;
		abstractbutton.addItemListener(itemlistener);
	}

	public static synchronized void addTo(ButtonModel buttonmodel) {
		ItemListener itemlistener = new ItemListener();
		itemlistener.handle = buttonmodel;
		buttonmodel.addItemListener(itemlistener);
	}

	public static synchronized void addTo(Checkbox checkbox) {
		ItemListener itemlistener = new ItemListener();
		itemlistener.handle = checkbox;
		checkbox.addItemListener(itemlistener);
	}

	public static synchronized void addTo(CheckboxMenuItem checkboxmenuitem) {
		ItemListener itemlistener = new ItemListener();
		itemlistener.handle = checkboxmenuitem;
		checkboxmenuitem.addItemListener(itemlistener);
	}

	public static synchronized void addTo(Choice choice) {
		ItemListener itemlistener = new ItemListener();
		itemlistener.handle = choice;
		choice.addItemListener(itemlistener);
	}

	public static synchronized void addTo(DefaultButtonModel defaultbuttonmodel) {
		ItemListener itemlistener = new ItemListener();
		itemlistener.handle = defaultbuttonmodel;
		defaultbuttonmodel.addItemListener(itemlistener);
	}

	// Swing

	public static synchronized void addTo(ItemSelectable itemselectable) {
		ItemListener itemlistener = new ItemListener();
		itemlistener.handle = itemselectable;
		itemselectable.addItemListener(itemlistener);
	}

	public static synchronized void addTo(JComboBox jcombobox) {
		ItemListener itemlistener = new ItemListener();
		itemlistener.handle = jcombobox;
		jcombobox.addItemListener(itemlistener);
	}

	public static synchronized void addTo(List list) {
		ItemListener itemlistener = new ItemListener();
		itemlistener.handle = list;
		list.addItemListener(itemlistener);
	}

	private Object handle;

	public void itemStateChanged(ItemEvent itemevent) {
		String as[] = { itemevent.paramString(), itemevent.getItem().toString() };
		int ai[] = { itemevent.getStateChange() != ItemEvent.SELECTED ? 0 : 1 };
		JHandler.callLisp("ITEMSTATECHANGED", this.handle, as, ai);
	}
}
