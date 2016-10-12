/*
 * StandardObject.java
 *
 * Copyright (C) 2003-2006 Peter Graves
 * $Id: StandardObject.java 12513 2010-03-02 22:35:36Z ehuelsmann $
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

public class StandardObject extends AbstractLispObject {
	// ### swap-slots instance-1 instance-2 => nil
	private static Primitive SWAP_SLOTS = new JavaPrimitive("swap-slots", Lisp.PACKAGE_SYS, true,
			"instance-1 instance-2") {

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			StandardObject obj1 = StandardObject.checkStandardObject(first);
			StandardObject obj2 = StandardObject.checkStandardObject(second);
			SubLObject[] temp = obj1.slots;
			obj1.slots = obj2.slots;
			obj2.slots = temp;
			return Lisp.NIL;
		}
	};
	// ### std-instance-layout
	private static Primitive STD_INSTANCE_LAYOUT = new JavaPrimitive("std-instance-layout", Lisp.PACKAGE_SYS, true) {

		public SubLObject execute(SubLObject arg) {
			StandardObject instance = StandardObject.checkStandardObject(arg);
			Layout layout = instance.layout;
			if (layout.isInvalid())
				// Update instance.
				layout = instance.updateLayout();
			return layout;
		}
	};

	// ### %set-std-instance-layout
	private static Primitive _SET_STD_INSTANCE_LAYOUT = new JavaPrimitive("%set-std-instance-layout", Lisp.PACKAGE_SYS,
			true) {

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			StandardObject.checkStandardObject(first).layout = Lisp.checkLayout(second);
			return second;
		}
	};

	// ### std-instance-class
	private static Primitive STD_INSTANCE_CLASS = new JavaPrimitive("std-instance-class", Lisp.PACKAGE_SYS, true) {

		public SubLObject execute(SubLObject arg) {
			return StandardObject.checkStandardObject(arg).layout.getLispClass();
		}
	};

	// ### standard-instance-access instance location => value
	private static Primitive STANDARD_INSTANCE_ACCESS = new JavaPrimitive("standard-instance-access", Lisp.PACKAGE_SYS,
			true, "instance location") {

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			StandardObject instance = StandardObject.checkStandardObject(first);
			int index;
			if (second instanceof Fixnum)
				index = ((Fixnum) second).value;
			else
				return Lisp.type_error(second, Lisp.list(LispSymbols.INTEGER, Fixnum.ZERO,
						LispObjectFactory.makeInteger(instance.slots.length)));
			SubLObject value;
			try {
				value = instance.slots[index];
			} catch (ArrayIndexOutOfBoundsException e) {
				return Lisp.type_error(second, Lisp.list(LispSymbols.INTEGER, Fixnum.ZERO,
						LispObjectFactory.makeInteger(instance.slots.length)));
			}
			if (value == Lisp.UNBOUND_VALUE) {
				SubLObject slotName = instance.layout.getSlotNames()[index];
				value = LispSymbols.SLOT_UNBOUND.execute(instance.getLispClass(), instance, slotName);
				LispThread.currentThread()._values = null;
			}
			return value;
		}
	};

	// ### %set-standard-instance-access instance location new-value =>
	// new-value
	private static Primitive _SET_STANDARD_INSTANCE_ACCESS = new JavaPrimitive("%set-standard-instance-access",
			Lisp.PACKAGE_SYS, true) {

		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third)

		{
			StandardObject.checkStandardObject(first).slots[second.intValue()] = third; // FIXME
			return third;
		}
	};

	// ### std-slot-boundp
	private static Primitive STD_SLOT_BOUNDP = new JavaPrimitive(LispSymbols.STD_SLOT_BOUNDP, "instance slot-name") {

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			StandardObject instance = StandardObject.checkStandardObject(first);
			Layout layout = instance.layout;
			if (layout.isInvalid())
				// Update instance.
				layout = instance.updateLayout();
			SubLObject index = layout.slotTable.getHT(second);
			if (index != null)
				// Found instance slot.
				return instance.slots[((Fixnum) index).value] != Lisp.UNBOUND_VALUE ? Lisp.T : Lisp.NIL;
			// Check for shared slot.
			SubLObject location = layout.getSharedSlotLocation(second);
			if (location != null)
				return location.rest() != Lisp.UNBOUND_VALUE ? Lisp.T : Lisp.NIL;
			// Not found.
			LispThread thread = LispThread.currentThread();
			SubLObject value = thread.execute(LispSymbols.SLOT_MISSING, instance.getLispClass(), instance, second,
					LispSymbols.SLOT_BOUNDP);
			// "If SLOT-MISSING is invoked and returns a value, a boolean
			// equivalent to its primary value is returned by SLOT-BOUNDP."
			thread._values = null;
			return value != Lisp.NIL ? Lisp.T : Lisp.NIL;
		}
	};

	// ### std-slot-value
	private static Primitive STD_SLOT_VALUE = new JavaPrimitive(LispSymbols.STD_SLOT_VALUE, "instance slot-name") {

		public SubLObject execute(SubLObject first, SubLObject second)

		{
			return first.SLOT_VALUE(second);
		}
	};

	// ### set-std-slot-value
	private static Primitive SET_STD_SLOT_VALUE = new JavaPrimitive(LispSymbols.SET_STD_SLOT_VALUE,
			"instance slot-name new-value") {

		public SubLObject execute(SubLObject first, SubLObject second, SubLObject third)

		{
			first.setSlotValue(second, third);
			return third;
		}
	};

	public static StandardObject checkStandardObject(SubLObject first) {
		if (first instanceof StandardObject)
			return (StandardObject) first;
		return (StandardObject) Lisp.type_error(first, LispSymbols.STANDARD_OBJECT);
	}

	protected Layout layout;

	protected SubLObject[] slots;

	protected StandardObject() {
		this.layout = new Layout(StandardClass.STANDARD_OBJECT, Lisp.NIL, Lisp.NIL);
	}

	protected StandardObject(Layout layout, int length) {
		this.layout = layout;
		this.slots = LispObjectFactory.makeLispObjectArray(length);
		for (int i = this.slots.length; i-- > 0;)
			this.slots[i] = Lisp.UNBOUND_VALUE;
	}

	protected StandardObject(LispClass cls) {
		this.layout = cls == null ? null : cls.getClassLayout();
		this.slots = new SubLObject[this.layout == null ? 0 : this.layout.getLength()];
		for (int i = this.slots.length; i-- > 0;)
			this.slots[i] = Lisp.UNBOUND_VALUE;
	}

	protected StandardObject(LispClass cls, int length) {
		this.layout = cls == null ? null : cls.getClassLayout();
		this.slots = LispObjectFactory.makeLispObjectArray(length);
		for (int i = this.slots.length; i-- > 0;)
			this.slots[i] = Lisp.UNBOUND_VALUE;
	}

	public SubLObject classOf() {
		return this.layout.getLispClass();
	}

	// Only handles instance slots (not shared slots).
	public SubLObject getInstanceSlotValue(SubLObject slotName)

	{
		Debug.assertTrue(this.layout != null);
		if (this.layout.isInvalid())
			// Update instance.
			this.layout = this.updateLayout();
		Debug.assertTrue(this.layout != null);
		int index = this.layout.getSlotIndex(slotName);
		// ### FIXME: should call SLOT-MISSING (clhs)
		if (index < 0)
			return Lisp.error(new LispError("Missing slot " + slotName.writeToString()));
		return this.slots[index];
	}

	public LispClass getLispClass() {
		return this.layout.getLispClass();
	}

	public SubLObject getParts() {
		SubLObject parts = Lisp.NIL;
		if (this.layout != null)
			if (this.layout.isInvalid())
				// Update instance.
				this.layout = this.updateLayout();
		parts = parts.push(LispObjectFactory.makeCons("LAYOUT", this.layout));
		if (this.layout != null) {
			SubLObject[] slotNames = this.layout.getSlotNames();
			if (slotNames != null)
				for (int i = 0; i < slotNames.length; i++)
					parts = parts.push(LispObjectFactory.makeCons(slotNames[i], this.slots[i]));
		}
		return parts.nreverse();
	}

	// Only handles instance slots (not shared slots).
	public void setInstanceSlotValue(SubLObject slotName, SubLObject newValue)

	{
		Debug.assertTrue(this.layout != null);
		if (this.layout.isInvalid())
			// Update instance.
			this.layout = this.updateLayout();
		Debug.assertTrue(this.layout != null);
		int index = this.layout.getSlotIndex(slotName);
		// ### FIXME: should call SLOT-MISSING (clhs)
		if (index < 0)
			Lisp.error(new LispError("Missing slot " + slotName.writeToString()));
		this.slots[index] = newValue;
	}

	public void setSlotValue(SubLObject slotName, SubLObject newValue)

	{
		if (this.layout.isInvalid())
			// Update instance.
			this.layout = this.updateLayout();
		SubLObject index = this.layout.slotTable.getHT(slotName);
		if (index != null) {
			// Found instance slot.
			this.slots[((Fixnum) index).value] = newValue;
			return;
		}
		// Check for shared slot.
		SubLObject location = this.layout.getSharedSlotLocation(slotName);
		if (location != null) {
			location.setCdr(newValue);
			return;
		}
		SubLObject[] args = LispObjectFactory.makeLispObjectArray(5);
		args[0] = this.getLispClass();
		args[1] = this;
		args[2] = slotName;
		args[3] = LispSymbols.SETF;
		args[4] = newValue;
		LispSymbols.SLOT_MISSING.execute(args);
	}

	public SubLObject SLOT_VALUE(SubLObject slotName) {
		if (this.layout.isInvalid())
			// Update instance.
			this.layout = this.updateLayout();
		SubLObject value;
		SubLObject index = this.layout.slotTable.getHT(slotName);
		if (index != null)
			// Found instance slot.
			value = this.slots[((Fixnum) index).value];
		else {
			// Check for shared slot.
			SubLObject location = this.layout.getSharedSlotLocation(slotName);
			if (location == null)
				return LispSymbols.SLOT_MISSING.execute(this.getLispClass(), this, slotName, LispSymbols.SLOT_VALUE);
			value = location.rest();
		}
		if (value == Lisp.UNBOUND_VALUE) {
			value = LispSymbols.SLOT_UNBOUND.execute(this.getLispClass(), this, slotName);
			LispThread.currentThread()._values = null;
		}
		return value;
	}

	public SubLObject typeOf() {
		// "For objects of metaclass STRUCTURE-CLASS or STANDARD-CLASS, and for
		// conditions, TYPE-OF returns the proper name of the class returned by
		// CLASS-OF if it has a proper name, and otherwise returns the class
		// itself."
		LispClass c1 = this.layout.getLispClass();
		// The proper name of a class is "a symbol that names the class whose
		// name is that symbol".
		SubLObject name = c1.getLispClassName();
		if (name != Lisp.NIL && name != Lisp.UNBOUND_VALUE) {
			// TYPE-OF.9
			SubLObject c2 = LispClass.findClass(Lisp.checkSymbol(name));
			if (c2 == c1)
				return name;
		}
		return c1;
	}

	public SubLObject typep(SubLObject type) {
		if (type == LispSymbols.STANDARD_OBJECT)
			return Lisp.T;
		if (type == StandardClass.STANDARD_OBJECT)
			return Lisp.T;
		LispClass cls = this.layout != null ? this.layout.getLispClass() : null;
		if (cls != null) {
			if (type == cls)
				return Lisp.T;
			if (type == cls.getLispClassName())
				return Lisp.T;
			SubLObject cpl = cls.getCPL();
			while (cpl != Lisp.NIL) {
				if (type == cpl.first())
					return Lisp.T;
				if (type == ((LispClass) cpl.first()).getLispClassName())
					return Lisp.T;
				cpl = cpl.rest();
			}
		}
		return super.typep(type);
	}

	Layout updateLayout() {
		Debug.assertTrue(this.layout.isInvalid());
		Layout oldLayout = this.layout;
		LispClass cls = oldLayout.getLispClass();
		Layout newLayout = cls.getClassLayout();
		Debug.assertTrue(!newLayout.isInvalid());
		StandardObject newInstance = new StandardObject(cls);
		Debug.assertTrue(newInstance.layout == newLayout);
		SubLObject added = Lisp.NIL;
		SubLObject discarded = Lisp.NIL;
		SubLObject plist = Lisp.NIL;
		// Old local slots.
		SubLObject[] oldSlotNames = oldLayout.getSlotNames();
		for (int i = 0; i < oldSlotNames.length; i++) {
			SubLObject slotName = oldSlotNames[i];
			int j = newLayout.getSlotIndex(slotName);
			if (j >= 0)
				newInstance.slots[j] = this.slots[i];
			else {
				discarded = discarded.push(slotName);
				if (this.slots[i] != Lisp.UNBOUND_VALUE) {
					plist = plist.push(slotName);
					plist = plist.push(this.slots[i]);
				}
			}
		}
		// Old shared slots.
		SubLObject rest = oldLayout.getSharedSlots(); // A list.
		if (rest != null)
			while (rest != Lisp.NIL) {
				SubLObject location = rest.first();
				SubLObject slotName = location.first();
				int i = newLayout.getSlotIndex(slotName);
				if (i >= 0)
					newInstance.slots[i] = location.rest();
				rest = rest.rest();
			}
		// Go through all the new local slots to compute the added slots.
		SubLObject[] newSlotNames = newLayout.getSlotNames();
		for (int i = 0; i < newSlotNames.length; i++) {
			SubLObject slotName = newSlotNames[i];
			int j = oldLayout.getSlotIndex(slotName);
			if (j >= 0)
				continue;
			SubLObject location = oldLayout.getSharedSlotLocation(slotName);
			if (location != null)
				continue;
			// Not found.
			added = added.push(slotName);
		}
		// Swap slots.
		SubLObject[] tempSlots = this.slots;
		this.slots = newInstance.slots;
		newInstance.slots = tempSlots;
		// Swap layouts.
		Layout tempLayout = this.layout;
		this.layout = newInstance.layout;
		newInstance.layout = tempLayout;
		Debug.assertTrue(!this.layout.isInvalid());
		// Call UPDATE-INSTANCE-FOR-REDEFINED-CLASS.
		LispSymbols.UPDATE_INSTANCE_FOR_REDEFINED_CLASS.execute(this, added, discarded, plist);
		return newLayout;
	}

	public String writeToString() {
		LispThread thread = LispThread.currentThread();
		int maxLevel = Integer.MAX_VALUE;
		SubLObject printLevel = LispSymbols.PRINT_LEVEL.symbolValue(thread);
		if (printLevel instanceof Fixnum)
			maxLevel = ((Fixnum) printLevel).value;
		SubLObject currentPrintLevel = Lisp._CURRENT_PRINT_LEVEL_.symbolValue(thread);
		int currentLevel = currentPrintLevel.intValue();
		if (currentLevel >= maxLevel)
			return "#";
		if (this.typep(LispSymbols.CONDITION) != Lisp.NIL) {
			StringOutputStream stream = new StringOutputStream();
			LispSymbols.PRINT_OBJECT.execute(this, stream);
			return stream.getOutputString().getString();
		}
		return this.unreadableString(this.typeOf().writeToString());
	}
}
