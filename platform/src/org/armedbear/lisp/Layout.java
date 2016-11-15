/*
 * Layout.java
 *
 * Copyright (C) 2003-2006 Peter Graves
 * $Id: Layout.java 12513 2010-03-02 22:35:36Z ehuelsmann $
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
 *
 * As a special exception, the copyright holders of this library give you
 * permission to link this library with independent modules to produce an
 * executable, regardless of the license terms of these independent
 * modules, and to copy and distribute the resulting executable under
 * terms of your choice, provided that you also meet, for each linked
 * independent module, the terms and conditions of the license of that
 * module.  An independent module is a module which is not derived from
 * or based on this library.  If you modify this library, you may extend
 * this exception to your version of the library, but you are not
 * obligated to do so.  If you do not wish to do so, delete this
 * exception statement from your version.
 */

package com.cyc.tool.subl.jrtl.nativeCode.commonLisp;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;

public class Layout extends AbstractLispObject {
	// ### make-layout
	private static Primitive MAKE_LAYOUT = new JavaPrimitive("make-layout", Lisp.PACKAGE_SYS, true,
			"class instance-slots class-slots") {

		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third)

		{
			return new Layout(Lisp.checkClass(first), Lisp.checkList(second), Lisp.checkList(third));
		}

	};
	// ### layout-class
	private static Primitive LAYOUT_CLASS = new JavaPrimitive("layout-class", Lisp.PACKAGE_SYS, true, "layout") {

		public SubLObject execute(SubLObject arg) {
			return Lisp.checkLayout(arg).getLispClass();
		}
	};

	// ### layout-length
	private static Primitive LAYOUT_LENGTH = new JavaPrimitive("layout-length", Lisp.PACKAGE_SYS, true, "layout") {

		public SubLObject execute(SubLObject arg) {
			return LispObjectFactory.makeInteger(Lisp.checkLayout(arg).slotNames.length);
		}
	};
	// ### layout-slot-index layout slot-name => index
	private static Primitive LAYOUT_SLOT_INDEX = new JavaPrimitive("layout-slot-index", Lisp.PACKAGE_SYS, true) {

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			SubLObject slotNames[] = Lisp.checkLayout(first).slotNames;
			for (int i = slotNames.length; i-- > 0;)
				if (slotNames[i] == second)
					return LispObjectFactory.makeInteger(i);
			return Lisp.NIL;
		}
	};

	// ### layout-slot-location layout slot-name => location
	private static Primitive LAYOUT_SLOT_LOCATION = new JavaPrimitive("layout-slot-location", Lisp.PACKAGE_SYS, true,
			"layout slot-name") {

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			Layout layOutFirst = Lisp.checkLayout(first);
			SubLObject slotNames[] = layOutFirst.slotNames;
			int limit = slotNames.length;
			for (int i = 0; i < limit; i++)
				if (slotNames[i] == second)
					return LispObjectFactory.makeInteger(i);
			// Reaching here, it's not an instance slot.
			SubLObject rest = layOutFirst.sharedSlots;
			while (rest != Lisp.NIL) {
				SubLObject location = rest.first();
				if (location.first() == second)
					return location;
				rest = rest.rest();
			}
			return Lisp.NIL;
		}
	};

	// ### %make-instances-obsolete class => class
	private static Primitive _MAKE_INSTANCES_OBSOLETE = new JavaPrimitive("%make-instances-obsolete", Lisp.PACKAGE_SYS,
			true, "class") {

		public SubLObject execute(SubLObject arg) {
			LispClass lispClass = Lisp.checkClass(arg);
			Layout oldLayout = lispClass.getClassLayout();
			if (oldLayout == null) {
				oldLayout = null;
				System.err.println("CANT %make-instances-obsolete " + lispClass);
				return arg;
			}
			Layout newLayout = new Layout(oldLayout);
			lispClass.setClassLayout(newLayout);
			oldLayout.invalidate();
			return arg;
		}
	};

	private LispClass lispClass;

	public EqHashTable slotTable;

	SubLObject[] slotNames;

	SubLObject sharedSlots;

	private boolean invalid;

	// Copy constructor.
	Layout(Layout oldLayout) {
		this.lispClass = oldLayout.getLispClass();
		this.slotNames = oldLayout.slotNames;
		this.sharedSlots = oldLayout.sharedSlots;
		this.slotTable = this.initializeSlotTable(this.slotNames);
	}

	public Layout(LispClass lispClass, SubLObject instanceSlots, SubLObject sharedSlots) {
		this.lispClass = lispClass;
		Debug.assertTrue(instanceSlots.isList());
		int length = instanceSlots.cl_length();
		this.slotNames = LispObjectFactory.makeLispObjectArray(length);
		int i = 0;

		while (instanceSlots != Lisp.NIL) {
			this.slotNames[i++] = instanceSlots.first();
			instanceSlots = instanceSlots.rest();
		}

		Debug.assertTrue(i == length);
		this.sharedSlots = sharedSlots;
		this.slotTable = this.initializeSlotTable(this.slotNames);
	}

	public Layout(LispClass lispClass, SubLObject[] instanceSlotNames, SubLObject sharedSlots) {
		this.lispClass = lispClass;
		this.slotNames = instanceSlotNames;
		this.sharedSlots = sharedSlots;
		this.slotTable = this.initializeSlotTable(this.slotNames);
	}

	// Generates a list of slot definitions for the slot names in this layout.
	protected SubLObject generateSlotDefinitions() {
		SubLObject list = Lisp.NIL;
		for (int i = this.slotNames.length; i-- > 0;)
			list = list.push(new SlotDefinitionObject(this.slotNames[i], Lisp.NIL));

		return list;
	}

	public int getLength() {
		return this.slotNames.length;
	}

	public LispClass getLispClass() {
		return this.lispClass;
	}

	public SubLObject getParts() {
		SubLObject result = Lisp.NIL;
		result = result.push(LispObjectFactory.makeCons("class", this.getLispClass()));
		for (int i = 0; i < this.slotNames.length; i++)
			result = result.push(LispObjectFactory.makeCons("slot " + i, this.slotNames[i]));
		result = result.push(LispObjectFactory.makeCons("shared slots", this.sharedSlots));
		return result.nreverse();
	}

	public SubLObject getSharedSlotLocation(SubLObject slotName)

	{
		SubLObject rest = this.sharedSlots;
		while (rest != Lisp.NIL) {
			SubLObject location = rest.first();
			if (location.first() == slotName)
				return location;
			rest = rest.rest();
		}
		return null;
	}

	public SubLObject getSharedSlots() {
		return this.sharedSlots;
	}

	public int getSlotIndex(SubLObject slotName) {
		SubLObject index = this.slotTable.getHT(slotName);
		if (index != null)
			return ((Fixnum) index).value;
		return -1;
	}

	public SubLObject[] getSlotNames() {
		return this.slotNames;
	}

	private EqHashTable initializeSlotTable(SubLObject[] slotNames) {
		EqHashTable ht = new EqHashTable(slotNames.length, Lisp.NIL, Lisp.NIL);
		for (int i = slotNames.length; i-- > 0;)
			ht.putVoid(slotNames[i], LispObjectFactory.makeInteger(i));
		return ht;
	}

	public void invalidate() {
		this.invalid = true;
	}

	public boolean isInvalid() {
		return this.invalid;
	}

	public String writeToString() {
		return this.unreadableString(LispSymbols.LAYOUT);
	}
}
