/*
 * StandardObject.java
 *
 * Copyright (C) 2003-2006 Peter Graves
 * $Id$
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

package org.armedbear.lisp;

import java.io.IOException;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrologSync;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStruct;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructInterpreted;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class StandardObject extends SubLStructInterpreted implements SubLStruct
{

	public static LispObject allocateInstance(LispObject arg)
	{
		if (arg == StandardClass.FUNCALLABLE_STANDARD_CLASS)
		{
			return new FuncallableStandardClass();
		}
		else if (arg == StandardClass.STANDARD_CLASS)
		{
			return new StandardClass();
		}
		else if (arg instanceof StandardClass)
		{
			StandardClass cls = (StandardClass) arg;
			Layout layout = cls.getClassLayout();
			if (layout == null)
			{
				program_error("No layout for class " + cls.princToString() + ".");
			}
			return new StandardObject(cls, layout.getLength());
		}
		else if (arg.typep(StandardClass.STANDARD_CLASS) != NIL)
		{
			LispObject l = Symbol.CLASS_LAYOUT.execute(arg);
			if (!(l instanceof Layout))
			{
				program_error("Invalid standard class layout for class " + arg.princToString() + ".");
			}
			return new StandardObject((Layout) l);
		}
		else
		{
			return type_error(arg, Symbol.STANDARD_CLASS);
		}
	}

	@Override
	public boolean equalp(SubLObject obj)
	{
		if (obj instanceof LispObject) { return equalp((LispObject) obj); }
		return super.equalpS(obj);
	}

	@Override
	public boolean equals(Object obj)
	{
		return super.equalsS(obj);
	}

	//protected Layout layout;
	// protected SubLObject[] slots;
	@Override
	public void init(int length)
	{
		if (slots == null || slots.length != length)
		{
			slots = new LispObject[length];
		}
		for (int i = slots.length; i-- > 0;)
			slots[i] = UNBOUND_VALUE;
	}

	protected StandardObject()
	{
		layout = new SubLStructDecl(StandardClass.STANDARD_OBJECT, NIL, NIL);
	}

	protected StandardObject(Layout layout)
	{
		this(layout, layout.getLength());
	}

	protected StandardObject(LispClass cls, int length)
	{
		this(cls == null ? null : cls.getClassLayout(), length);
	}

	protected StandardObject(LispClass cls)
	{
		this(cls == null ? null : cls.getClassLayout());
	}

	protected StandardObject(Layout layout, int length)
	{
		setLayout(this.layout = layout);
		init(length);
	}

	@Override
	public LispObject getParts()
	{
		LispObject parts = NIL;
		if (layout != null)
		{
			if (layout.isInvalid())
			{
				// Update instance.
				layout = updateLayout();
			}
		}
		parts = parts.push(new Cons("LAYOUT", layout));
		if (layout != null)
		{
			LispObject[] slotNames = layout.getSlotNames();
			if (slotNames != null)
			{
				for (int i = 0; i < slotNames.length; i++)
				{
					parts = parts.push(new Cons(slotNames[i], slots[i]));
				}
			}
		}
		return parts.nreverse();
	}

	@Override
	public SubLSymbol getName()
	{
		return (SubLSymbol) helperGetClassName();
	}

	@Override
	public final LispObject getLispClass()
	{
		return classOf();
	}

	private LispObject helperGetClassName()
	{
		final LispObject c1 = classOf();
		if (c1 instanceof LispClass)
			return ((LispClass) c1).getLispClassName();
		else
			return LispThread.currentThread().execute(Symbol.CLASS_NAME, c1);
	}

	private LispObject helperGetCPL()
	{
		final LispObject c1 = classOf();
		if (c1 instanceof LispClass)
			return ((LispClass) c1).getCPL();
		else
			return LispThread.currentThread().execute(Symbol.CLASS_PRECEDENCE_LIST, c1);
	}

	@Override
	public LispObject typeOf()
	{
		// "For objects of metaclass STRUCTURE-CLASS or STANDARD-CLASS, and for
		// conditions, TYPE-OF returns the proper name of the class returned by
		// CLASS-OF if it has a proper name, and otherwise returns the class
		// itself."
		final LispObject c1 = classOf();
		LispObject name;
		if (c1 instanceof LispClass)
			name = ((LispClass) c1).getLispClassName();
		else
			name = LispThread.currentThread().execute(Symbol.CLASS_NAME, c1);

		// The proper name of a class is "a symbol that names the class whose
		// name is that symbol".
		if (name != NIL && name != UNBOUND_VALUE)
		{
			// TYPE-OF.9
			final LispObject c2 = LispClass.findClass(name, false);
			if (c2 == c1) return name;
		}
		return c1;
	}

	@Override
	public LispObject classOf()
	{
		if (layout == null) return null;
		return layout.getLispClass();
	}

	@Override
	public LispObject typep(LispObject type)
	{
		if (type == Symbol.STANDARD_OBJECT) return T;
		if (type == StandardClass.STANDARD_OBJECT) return T;
		LispObject cls = layout != null ? classOf() : null;
		if (cls != null)
		{
			if (type == cls) return T;
			if (type == helperGetClassName()) return T;
			LispObject cpl = helperGetCPL();
			while (cpl != NIL)
			{
				if (type == cpl.car()) return T;

				LispObject otherName;
				LispObject otherClass = cpl.car();
				if (otherClass instanceof LispClass)
				{
					if (type == ((LispClass) otherClass).getLispClassName()) return T;
				}
				else if (type == LispThread.currentThread().execute(Symbol.CLASS_NAME, otherClass)) return T;

				cpl = cpl.cdr();
			}
		}
		return super.typep(type);
	}

	@Override
	public String printObjectImpl()
	{
		final LispThread thread = LispThread.currentThread();
		int maxLevel = Integer.MAX_VALUE;
		LispObject printLevel = Symbol.PRINT_LEVEL.symbolValue(thread);
		if (printLevel instanceof Fixnum) maxLevel = ((Fixnum) printLevel).value;
		LispObject currentPrintLevel = _CURRENT_PRINT_LEVEL_.symbolValue(thread);
		int currentLevel = Fixnum.getValue(currentPrintLevel);
		if (currentLevel >= maxLevel) return "#";
		return unreadableString(typeOf().printObject());
	}

	public Layout updateLayout()
	{
		Debug.assertTrue(layout != null);
		if (layout.isInvalid())
		{
			// Update instance.
			layout = updateLayoutSync();
		}
		Debug.assertTrue(layout != null);
		return layout;
	}

	@Override
	final public void setLayout(Layout structdecl)
	{
		if (layout == null)
		{
			layout = structdecl;			
		}
		else if (structdecl != layout)
		{
			layout = structdecl;
			updateLayoutSync();
		}
		if(isTracked()) {
			PrologSync.addThis(this);
		}
	}

	public synchronized Layout updateLayoutSync()
	{
		Layout oldLayout = layout;
		LispObject cls = oldLayout.getLispClass();
		final Layout newLayout;

		if (cls instanceof LispClass)
			newLayout = ((LispClass) cls).getClassLayout();
		else
			newLayout = (Layout) Symbol.CLASS_LAYOUT.execute(cls);

		Debug.assertTrue(!newLayout.isInvalid());
		final StandardObject newInstance = new StandardObject(newLayout);
		Debug.assertTrue(newInstance.layout == newLayout);
		LispObject added = NIL;
		LispObject discarded = NIL;
		LispObject plist = NIL;
		// Old local slots.
		LispObject[] oldSlotNames = oldLayout.getSlotNames();
		for (int i = 0; i < oldSlotNames.length; i++)
		{
			LispObject slotName = oldSlotNames[i];
			int j = newLayout.getSlotIndex(slotName);
			if (j >= 0)
				newInstance.slots[j] = slots[i];
			else
			{
				discarded = discarded.push(slotName);
				if (slots[i] != UNBOUND_VALUE)
				{
					plist = plist.push(slotName);
					plist = plist.push((LispObject) slots[i]);
				}
			}
		}
		// Old shared slots.
		LispObject rest = oldLayout.getSharedSlots(); // A list.
		if (rest != null)
		{
			while (rest != NIL)
			{
				LispObject location = rest.car();
				LispObject slotName = location.car();
				int i = newLayout.getSlotIndex(slotName);
				if (i >= 0) newInstance.slots[i] = location.cdr();
				rest = rest.cdr();
			}
		}
		// Go through all the new local slots to compute the added slots.
		LispObject[] newSlotNames = newLayout.getSlotNames();
		for (int i = 0; i < newSlotNames.length; i++)
		{
			LispObject slotName = newSlotNames[i];
			int j = oldLayout.getSlotIndex(slotName);
			if (j >= 0) continue;
			LispObject location = oldLayout.getSharedSlotLocation(slotName);
			if (location != null) continue;
			// Not found.
			added = added.push(slotName);
		}
		// Swap slots.
		SubLObject[] tempSlots = slots;
		slots = newInstance.slots;
		newInstance.slots = tempSlots;
		// Swap layouts.
		Layout tempLayout = layout;
		layout = newInstance.layout;
		newInstance.layout = tempLayout;
		Debug.assertTrue(!layout.isInvalid());
		// Call UPDATE-INSTANCE-FOR-REDEFINED-CLASS.
		Symbol.UPDATE_INSTANCE_FOR_REDEFINED_CLASS.execute(this, added, discarded, plist);
		return newLayout;
	}

	// Only handles instance slots (not shared slots).
	public LispObject getInstanceSlotValue(LispObject slotName)

	{
		int index = updateLayout().getSlotIndex(slotName);
		if (index < 0)
		{
			// Not found.
			final LispThread thread = LispThread.currentThread();
			// If the operation is slot-value, only the primary value [of
			// slot-missing] will be used by the caller, and all other values
			// will be ignored.
			LispObject value = thread.execute(Symbol.SLOT_MISSING, this.getLispClass(), this, slotName, Symbol.SLOT_VALUE);
			thread._values = null;
			return value;
		}
		return (LispObject) slots[index];
	}

	// Only handles instance slots (not shared slots).
	public void setInstanceSlotValue(LispObject slotName, LispObject newValue)

	{
		int index = updateLayout().getSlotIndex(slotName);
		if (index < 0)
		{
			// Not found.
			final LispThread thread = LispThread.currentThread();
			// If the operation is setf or slot-makunbound, any values
			// [returned by slot-missing] will be ignored by the caller.
			thread.execute(Symbol.SLOT_MISSING, this.getLispClass(), this, slotName, Symbol.SETF, newValue);
			thread._values = null;
		}
		reallySetSlot(index, newValue);
	}/*
	  *
	  * final public StandardObject checkStandardObject(LispObject first) {
	  * if (first instanceof StandardObject) return (StandardObject) first;
	  * return (StandardObject) type_error(first, Symbol.STANDARD_OBJECT); }
	  */

	private static final Primitive SWAP_SLOTS = new pf_swap_slots();

	@DocString(name = "swap-slots", args = "instance-1 instance-2", returns = "nil")
	private static final class pf_swap_slots extends Primitive
	{
		pf_swap_slots()
		{
			super("swap-slots", PACKAGE_SYS, true, "instance-1 instance-2");
		}

		@Override
		public LispObject execute(LispObject first, LispObject second)
		{
			final StandardObject obj1 = checkStandardObject(first);
			final StandardObject obj2 = checkStandardObject(second);
			SubLObject[] temp = obj1.slots;
			obj1.slots = obj2.slots;
			obj2.slots = temp;
			return NIL;
		}
	};

	private static final Primitive STD_INSTANCE_LAYOUT = new pf_std_instance_layout();

	@DocString(name = "std-instance-layout")
	private static final class pf_std_instance_layout extends Primitive
	{
		pf_std_instance_layout()
		{
			super("std-instance-layout", PACKAGE_SYS, true);
		}

		@Override
		public LispObject execute(LispObject arg)
		{
			final StandardObject instance = checkStandardObject(arg);
			Layout layout = instance.layout;
			if (layout.isInvalid())
			{
				// Update instance.
				layout = instance.updateLayout();
			}
			return layout;
		}
	};

	private static final Primitive _SET_STD_INSTANCE_LAYOUT = new pf__set_std_instance_layout();

	@DocString(name = "%set-std-instance-layout")
	private static final class pf__set_std_instance_layout extends Primitive
	{
		pf__set_std_instance_layout()
		{
			super("%set-std-instance-layout", PACKAGE_SYS, true);
		}

		@Override
		public LispObject execute(LispObject first, LispObject second)
		{
			checkStandardObject(first).layout = checkLayout(second);
			return second;
		}
	};

	private static final Primitive STD_INSTANCE_CLASS = new pf_std_instance_class();

	@DocString(name = "std-instance-class")
	private static final class pf_std_instance_class extends Primitive
	{
		pf_std_instance_class()
		{
			super("std-instance-class", PACKAGE_SYS, true);
		}

		@Override
		public LispObject execute(LispObject arg)
		{
			return checkStandardObject(arg).classOf();
		}
	};

	private static final Primitive STANDARD_INSTANCE_ACCESS = new pf_standard_instance_access();

	@DocString(name = "standard-instance-access", args = "instance location", returns = "value")
	private static final class pf_standard_instance_access extends Primitive
	{
		pf_standard_instance_access()
		{
			super("standard-instance-access", PACKAGE_SYS, true, "instance location");
		}

		@Override
		public LispObject execute(LispObject first, LispObject second)
		{
			final StandardObject instance = checkStandardObject(first);
			if (instance.layout.isInvalid())
			{
				// Update instance.
				instance.updateLayout();
			}
			final int index;
			if (second instanceof Fixnum)
			{
				index = ((Fixnum) second).value;
			}
			else
			{
				return type_error(second, Symbol.INTEGER);
			}

			LispObject value;
			try
			{
				value = (LispObject) instance.slots[index];
			} catch (ArrayIndexOutOfBoundsException e)
			{
				if (instance.slots.length > 0)
					return type_error(second, list(Symbol.INTEGER, Fixnum.ZERO, Fixnum.getInstance(instance.slots.length - 1)));
				else
					return program_error("The object " + instance.princToString() + " has no slots.");

			}
			// We let UNBOUND_VALUE escape here, since invoking
			// standard-instance-access on an unbound slot has undefined
			// consequences (AMOP pg. 239), and we use this behavior to
			// implement slot-boundp-using-class.
			return value;
		}
	};

	private static final Primitive _SET_STANDARD_INSTANCE_ACCESS = new pf__set_standard_instance_access();

	@DocString(name = "%set-standard-instance-access", args = "instance location new-value", returns = "new-value")
	private static final class pf__set_standard_instance_access extends Primitive
	{
		pf__set_standard_instance_access()
		{
			super("%set-standard-instance-access", PACKAGE_SYS, true);
		}

		@Override
		public LispObject execute(LispObject first, LispObject second, LispObject third)
		{
			final StandardObject instance = checkStandardObject(first);
			if (instance.layout.isInvalid())
			{
				// Update instance.
				instance.updateLayout();
			}
			final int index;
			if (second instanceof Fixnum)
			{
				index = ((Fixnum) second).value;
			}
			else
			{
				return type_error(second, Symbol.INTEGER);
			}
			instance.setSlotValue(index, third);
			return third;
		}
	};

	private static final Primitive STD_SLOT_BOUNDP = new pf_std_slot_boundp();

	@DocString(name = "std-slot-boundp")
	private static final class pf_std_slot_boundp extends Primitive
	{
		pf_std_slot_boundp()
		{
			super(Symbol.STD_SLOT_BOUNDP, "instance slot-name");
		}

		@Override
		public LispObject execute(LispObject first, LispObject second)
		{
			final StandardObject instance = checkStandardObject(first);
			Layout layout = instance.layout;
			if (layout.isInvalid())
			{
				// Update instance.
				layout = instance.updateLayout();
			}
			final LispObject index = layout.slotTable.get(second);
			if (index != null)
			{
				// Found instance slot.
				return instance.slots[((Fixnum) index).value] != UNBOUND_VALUE ? T : NIL;
			}
			// Check for shared slot.
			final LispObject location = layout.getSharedSlotLocation(second);
			if (location != null) return location.cdr() != UNBOUND_VALUE ? T : NIL;
			// Not found.
			final LispThread thread = LispThread.currentThread();
			LispObject value = thread.execute(Symbol.SLOT_MISSING, instance.getLispClass(), instance, second, Symbol.SLOT_BOUNDP);
			// "If SLOT-MISSING is invoked and returns a value, a boolean
			// equivalent to its primary value is returned by SLOT-BOUNDP."
			thread._values = null;
			return value != NIL ? T : NIL;
		}
	};

	@Override
	public LispObject SLOT_VALUE(LispObject slotName)
	{
		if (layout.isInvalid())
		{
			// Update instance.
			layout = updateLayout();
		}
		LispObject value;
		final LispObject index = layout.slotTable.get(slotName);
		if (index != null)
		{
			// Found instance slot.
			value = (LispObject) slots[((Fixnum) index).value];
		}
		else
		{
			// Check for shared slot.
			LispObject location = layout.getSharedSlotLocation(slotName);
			if (location == null) return Symbol.SLOT_MISSING.execute(getLispClass(), this, slotName, Symbol.SLOT_VALUE);
			value = location.cdr();
		}
		if (value == UNBOUND_VALUE)
		{
			value = Symbol.SLOT_UNBOUND.execute(getLispClass(), this, slotName);
			LispThread.currentThread()._values = null;
		}
		return value;
	}

	private static final Primitive STD_SLOT_VALUE = new pf_std_slot_value();

	@DocString(name = "std-slot-value")
	private static final class pf_std_slot_value extends Primitive
	{
		pf_std_slot_value()
		{
			super(Symbol.STD_SLOT_VALUE, "instance slot-name");
		}

		@Override
		public LispObject execute(LispObject first, LispObject second)
		{
			return first.SLOT_VALUE(second);
		}
	};

	@Override
	final public void setFieldImpl(int fieldNum, SubLObject value)
	{
		if (fieldNum == 0 || fieldNum == 1) Errors.error("Can't set special slots on structs.");
		final int slotNum = fieldNum - 2;
		reallySetSlot(slotNum, (LispObject) value);
	}

	@Override
	public void setSlotValue(LispObject slotName, LispObject newValue)
	{

		if (layout.isInvalid())
		{
			// Update instance.
			layout = updateLayout();
		}
		final LispObject index = layout.slotTable.get(slotName);
		if (index != null)
		{
			// Found instance slot.
			reallySetSlot(((Fixnum) index).value, newValue);
			return;
		}
		// Check for shared slot.
		LispObject location = layout.getSharedSlotLocation(slotName);
		if (location != null)
		{
			location.setCdr(newValue);
			return;
		}
		LispObject[] args = new LispObject[5];
		args[0] = getLispClass();
		args[1] = this;
		args[2] = slotName;
		args[3] = Symbol.SETF;
		args[4] = newValue;
		Symbol.SLOT_MISSING.execute(args);
	}

	private static final Primitive SET_STD_SLOT_VALUE = new pf_set_std_slot_value();

	@DocString(name = "set-std-slot-value")
	private static final class pf_set_std_slot_value extends Primitive
	{
		pf_set_std_slot_value()
		{
			super(Symbol.SET_STD_SLOT_VALUE, "instance slot-name new-value");
		}

		@Override
		public LispObject execute(LispObject first, LispObject second, LispObject third)
		{
			first.setSlotValue(second, third);
			return third;
		}
	};

	public static final Primitive _STD_ALLOCATE_INSTANCE = new pf__std_allocate_instance();

	@DocString(name = "%std-allocate-instance", args = "class", returns = "instance")
	private static final class pf__std_allocate_instance extends Primitive
	{
		pf__std_allocate_instance()
		{
			super("%std-allocate-instance", PACKAGE_SYS, true, "class");
		}

		@Override
		public LispObject execute(LispObject arg)
		{
			return allocateInstance(arg);
		}
	}

	@Override
	public int hashCode(int currentDepth)
	{
		return superHash();
	}

}
