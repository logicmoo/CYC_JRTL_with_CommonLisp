/*
 * StructureObject.java
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

import java.util.List;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrologSync;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStruct;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructInterpreted;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class StructureObject extends SubLStructInterpreted implements SubLStruct
{
	

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

	/*final*/ protected SlotClass structureClass;

	protected StructureObject()
	{

	}

	protected void setStructureClass(Symbol symbol)
	{

		SlotClass structureClass = (SlotClass) LispClass.findClass(symbol/*, true*/); // Might return null.
		setName(symbol);
		if (structureClass == null)
		{
			System.err.println("Oh noes, structure object got a null class:" + symbol + ", symbol name:" + symbol);
			System.err.println("No mitens sitten: " + BuiltInClass.SYSTEM_STREAM);
			System.err.println("joopa joo:" + Symbol.SYSTEM_STREAM);
		}
		else
		{
			this.structureClass = structureClass;
		}

	}

	@Override
	protected LispObject badIndex(int n)
	{
		StringBuilder sb = new StringBuilder("Invalid slot index ");
		sb.append(Fixnum.getInstance(n).princToString());
		sb.append(" for ");
		sb.append(princToString());
		return error(new LispError(sb.toString()));
	}

	@Override
	public int getFieldCount()
	{
		return slots.length;
	}

	@Override
	public SubLObject getField0()
	{
		return Fixnum.getInstance(getFieldCount());
	}

	@Override
	public SubLObject getField1()
	{
		return getName();
	}

	//
	// public StructureObject(Symbol symbol11)
	//  {
	//	 this(symbol11,-2);
	//  }

	public StructureObject(Symbol symbol, LispObject... slots)
	{
		this.slots = slots.clone();
		setStructureClass(symbol);
	}
	//  public StructureObject(Symbol symbol, LispObject obj0)
	//  {
	//		 this(symbol,-2,obj0);
	//  }
	//
	//  public StructureObject(Symbol symbol, LispObject obj0, LispObject obj1)
	//
	//  {
	//	  setStructureClass(symbol);
	//	  this.slots = new LispObject[] { obj0, obj1};
	//  }
	//
	//  public StructureObject(Symbol symbol, LispObject obj0, LispObject obj1,
	//                         LispObject obj2)
	//
	//  {
	//	setStructureClass(symbol);
	//	this.slots = new LispObject[] { obj0, obj1, obj2 };
	//  }
	//
	//  public StructureObject(Symbol symbol, LispObject obj0, LispObject obj1,
	//                         LispObject obj2, LispObject obj3)
	//
	//  {
	//	  this(symbol, -2, obj0, obj1, obj2, obj3);
	//  }
	//
	//  public StructureObject(Symbol symbol, LispObject obj0, LispObject obj1,
	//                         LispObject obj2, LispObject obj3, LispObject obj4)
	//
	//  {
	//	  this(symbol, -2, obj0, obj1, obj2, obj3, obj4);
	//  }
	//
	//  public StructureObject(Symbol symbol, LispObject obj0, LispObject obj1,
	//                         LispObject obj2, LispObject obj3, LispObject obj4,
	//                         LispObject obj5)
	//  {
	//	  this(symbol, -2, obj0, obj1, obj2, obj3, obj4, obj5);
	//	  }

	public StructureObject(StructureObject obj)
	{
		slots = obj.slots.clone();
		this.setStructureClass((StructureClass) obj.classOf());
	}

	@Override
	public LispObject typeOf()
	{
		if (structureClass == null) return super.typeOf();
		return structureClass.getLispClassName();
	}

	private LispObject thisTypeOf()
	{
		return typeOf();
	}

	@Override
	public LispObject classOf()
	{
		if (structureClass == null) return super.classOf();
		return structureClass;
	}

	@Override
	protected int getSlotIndex(LispObject slotName)
	{
		LispObject effectiveSlots = structureClass.getSlotDefinitions();
		LispObject[] effectiveSlotsArray = effectiveSlots.copyToArray();
		for (int i = 0; i < slots.length; i++)
		{
			SimpleVector slotDefinition = (SimpleVector) effectiveSlotsArray[i];
			LispObject candidateSlotName = slotDefinition.AREF(1);
			if (slotName == candidateSlotName) { return i; }
		}

		if (slotName.isInteger())
		{
			Errors.warn("WORKARROUND using slotnum" + this);
			return slotName.intValue();
		}
		return -1;
	}

	@Override
	public LispObject SLOT_VALUE(LispObject slotName)
	{
		LispObject value;
		final int index = getSlotIndex(slotName);
		if (index >= 0)
		{
			value = (LispObject) slots[index];
		}
		else
		{
			value = UNBOUND_VALUE;
			value = Symbol.SLOT_UNBOUND.execute(classOf(), this, slotName);
			LispThread.currentThread()._values = null;
		}
		return value;
	}

	/**
	 * @param slotName
	 * @return
	 */
	@Override
	final public int getInstanceSlotIndex(LispObject slotName)
	{

		return getSlotIndex(slotName);
	}

	//	public LispObject getSharedSlotLocation(LispObject slotName) {
	//		return getLayout().getSharedSlotLocation(slotName);
	//	}

	@Override
	public void setSlotValue(LispObject slotName, LispObject newValue)
	{
		final int index = getSlotIndex(slotName);
		if (index >= 0)
		{
			reallySetSlot(index, newValue);
		}
		else
		{
			LispObject[] args = new LispObject[5];
			args[0] = classOf();
			args[1] = this;
			args[2] = slotName;
			args[3] = Symbol.SETF;
			args[4] = newValue;
			Symbol.SLOT_MISSING.execute(args);
		}
	}

	@Override
	public LispObject getParts()
	{
		LispObject result = NIL;
		result = result.push(new Cons("class", classOf()));
		LispObject effectiveSlots = structureClass.getSlotDefinitions();
		LispObject[] effectiveSlotsArray = effectiveSlots.copyToArray();
		if (effectiveSlotsArray.length == 0)
		{
			effectiveSlotsArray = layout.slotNames;
		}
		Debug.assertTrue(effectiveSlotsArray.length == slots.length);
		for (int i = 0; i < slots.length; i++)
		{
			LispObject slotName = intoSlotName(effectiveSlotsArray, i);
			result = result.push(new Cons(slotName, slots[i]));
		}
		return result.nreverse();
	}

	static LispObject intoSlotName(LispObject[] effectiveSlotsArray, int i)
	{
		if (effectiveSlotsArray == null) return new SimpleString("SLOT_" + i);
		if (effectiveSlotsArray.length < i) return new SimpleString("SLOT_" + i + "_OF_" + effectiveSlotsArray.length);
		LispObject effectiveSlot = effectiveSlotsArray[i];
		if (effectiveSlot instanceof SimpleVector)
		{
			SimpleVector slotDefinition = (SimpleVector) effectiveSlotsArray[i];
			LispObject slotName = slotDefinition.AREF(1);
			return slotName;
		}
		return effectiveSlot;
	}

	@Override
	public LispObject typep(LispObject type)
	{
		if (type instanceof StructureClass) { return memq(type, ((LispClass) classOf()).getCPL()) ? T : NIL; }
		if (type == thisTypeOf()) return T;
		if (type == Symbol.STRUCTURE_OBJECT) return T;
		if (type == BuiltInClass.STRUCTURE_OBJECT) return T;
		if (type instanceof Symbol)
		{
			LispClass c = LispClass.findClass((Symbol) type);
			if (c != null) return memq(c, ((LispClass) classOf()).getCPL()) ? T : NIL;
		}
		return super.typep(type);
	}

	@Override
	public boolean equalp(LispObject obj)
	{
		if (this == obj) return true;
		if (obj instanceof StructureObject)
		{
			StructureObject o = (StructureObject) obj;
			if (classOf() != o.classOf()) return false;
			for (int i = 0; i < slots.length; i++)
			{
				if (!slots[i].equalp(o.slots[i])) return false;
			}
			return true;
		}
		return false;
	}

	@Override
	public final int psxhash()
	{
		return psxhash(4);
	}

	@Override
	public final int psxhash(int depth)
	{
		int result = mix(classOf().sxhash(), 7814971);
		if (depth > 0)
		{
			int limit = slots.length;
			if (limit > 4) limit = 4;
			for (int i = 0; i < limit; i++)
				result = mix(((LispObject) slots[i]).psxhash(depth - 1), result);
		}
		return result & 0x7fffffff;
	}
//
//	@Override
//	public String printObjectImpl()
//	{
//		List set = printingObjectR.get();
//		int index = set.indexOf(this);
//		if (index >= 0) { return "#=(" + index + "#|" + easyToString() + "|#)=#"; }
//		try
//		{
//			set.add(this);
//			return printObjectImpl();
//		} finally
//		{
//			set.remove(this);
//		}
//
//	}

	public String printObjectImpl()
	{
		try
		{
			if (insideToString > 0) { return easyToString(); }
			final LispThread thread = LispThread.currentThread();
			// FIXME
			if (typep(Symbol.RESTART) != NIL)
			{
				Symbol PRINT_RESTART = PACKAGE_SYS.intern("PRINT-RESTART");
				LispObject fun = PRINT_RESTART.getSymbolFunction();
				StringOutputStream stream = new StringOutputStream();
				thread.execute(fun, this, stream);
				return stream.getBufferString().getStringValue();
			}

			String o = printObjectInner(thread);
			if (o == null) { return easyToString(); }
			return o;

		} catch (Throwable e)
		{
			e.printStackTrace();
			return easyToString();
		}

	}

	@Override
	protected String easyToString()
	{
		// TODO Auto-generated method stub
		try
		{
			return unreadableString(thisTypeOf().printObject());
		} catch (Throwable t)
		{
			t.printStackTrace();
			return super.easyToString();
		}
	}

	public String printObjectInner(LispThread thread)
	{
		try
		{
			if (_PRINT_STRUCTURE_.symbolValue(thread) == NIL) return unreadableString(thisTypeOf().printObject());

			int maxLevel = Integer.MAX_VALUE;
			LispObject printLevel = Symbol.PRINT_LEVEL.symbolValue(thread);
			if (printLevel instanceof Fixnum) maxLevel = ((Fixnum) printLevel).value;
			LispObject currentPrintLevel = _CURRENT_PRINT_LEVEL_.symbolValue(thread);
			int currentLevel = Fixnum.getValue(currentPrintLevel);
			if (currentLevel >= maxLevel && slots.length > 0) return "#";

			if (currentLevel >= 9 && slots.length > 0) return "#";

			StringBuilder sb = new StringBuilder("#S(");
			sb.append(thisTypeOf().printObject());
			if (currentLevel < maxLevel)
			{
				LispObject effectiveSlots = ((SlotClass) classOf()).getSlotDefinitions();
				LispObject[] effectiveSlotsArray = effectiveSlots.copyToArray();
				Debug.assertTrue(effectiveSlotsArray.length == slots.length);
				final LispObject printLength = Symbol.PRINT_LENGTH.symbolValue(thread);
				int limit;
				if (printLength instanceof Fixnum)
					limit = Math.min(slots.length, ((Fixnum) printLength).value);
				else
					limit = slots.length;
				if (insideToString > 0 && insideToString < 5) limit = slots.length;
				final boolean printCircle = (Symbol.PRINT_CIRCLE.symbolValue(thread) != NIL);
				for (int i = 0; i < limit; i++)
				{
					sb.append(' ');
					SimpleVector slotDefinition = (SimpleVector) effectiveSlotsArray[i];
					// FIXME AREF(1)
					LispObject slotName = slotDefinition.AREF(1);
					Debug.assertTrue(slotName instanceof Symbol);
					sb.append(':');
					sb.append(((Symbol) slotName).name.getStringValue());
					sb.append(' ');
					if (printCircle)
					{
						StringOutputStream stream = new StringOutputStream();
						thread.execute(Symbol.OUTPUT_OBJECT.getSymbolFunction(), (LispObject) slots[i], stream);
						sb.append(stream.getBufferString().getStringValue());
					}
					else
						sb.append(slots[i].printObject());
				}
				if (limit < slots.length) sb.append(" ...");
			}
			sb.append(')');
			return sb.toString();
		} catch (StackOverflowError e)
		{
			if (true) return easyToString();
			error(new StorageCondition("Stack overflow."));
			return null; // Not reached.
		}
	}

	public String printObjectInnerWorKed(LispThread thread)
	{
		try
		{
			if (_PRINT_STRUCTURE_.symbolValue(thread) == NIL) return unreadableString(thisTypeOf().printObject());

			int maxLevel = Integer.MAX_VALUE;
			LispObject printLevel = Symbol.PRINT_LEVEL.symbolValue(thread);
			if (printLevel instanceof Fixnum) maxLevel = ((Fixnum) printLevel).value;
			LispObject currentPrintLevel = _CURRENT_PRINT_LEVEL_.symbolValue(thread);
			int currentLevel = Fixnum.getValue(currentPrintLevel);
			if (currentLevel >= maxLevel && slots.length > 0) return "#";
			StringBuilder sb = new StringBuilder("#S(");
			sb.append(thisTypeOf().printObject());
			if (currentLevel < maxLevel)
			{
				LispObject effectiveSlots = ((SlotClass) classOf()).getSlotDefinitions();
				LispObject[] effectiveSlotsArray = effectiveSlots.copyToArray();
				Debug.assertTrue(effectiveSlotsArray.length == slots.length);
				final LispObject printLength = Symbol.PRINT_LENGTH.symbolValue(thread);
				int limit;
				if (printLength instanceof Fixnum)
					limit = Math.min(slots.length, ((Fixnum) printLength).value);
				else
					limit = slots.length;
				if (insideToString > 0 && insideToString < 5) limit = slots.length;
				final boolean printCircle = (Symbol.PRINT_CIRCLE.symbolValue(thread) != NIL);
				for (int i = 0; i < limit; i++)
				{
					sb.append(' ');
					SimpleVector slotDefinition = (SimpleVector) effectiveSlotsArray[i];
					// FIXME AREF(1)
					LispObject slotName = slotDefinition.AREF(1);
					Debug.assertTrue(slotName instanceof Symbol);
					sb.append(':');
					sb.append(((Symbol) slotName).name.getStringValue());
					sb.append(' ');
					if (printCircle)
					{
						StringOutputStream stream = new StringOutputStream();
						thread.execute(Symbol.OUTPUT_OBJECT.getSymbolFunction(), (LispObject) slots[i], stream);
						sb.append(stream.getBufferString().getStringValue());
					}
					else
						sb.append(slots[i].printObject());
				}
				if (limit < slots.length) sb.append(" ...");
			}
			sb.append(')');
			return sb.toString();
		} catch (StackOverflowError e)
		{
			if (true) return easyToString();
			error(new StorageCondition("Stack overflow."));
			return null; // Not reached.
		}
	}

	private static final Primitive STRUCTURE_OBJECT_P = new pf_structure_object_p();

	@DocString(name = "structure-object-p", args = "object", returns = "generalized-boolean")
	private static final class pf_structure_object_p extends Primitive
	{
		pf_structure_object_p()
		{
			super("structure-object-p", PACKAGE_SYS, true, "object");
		}

		@Override
		public LispObject execute(LispObject arg)
		{
			return arg instanceof StructureObject ? T : NIL;
		}
	};

	private static final Primitive STRUCTURE_LENGTH = new pf_structure_length();

	@DocString(name = "structure-length", args = "instance", returns = "length")
	private static final class pf_structure_length extends Primitive
	{
		pf_structure_length()
		{
			super("structure-length", PACKAGE_SYS, true, "instance");
		}

		@Override
		public LispObject execute(LispObject arg)
		{
			if (arg instanceof StructureObject) return Fixnum.getInstance(((StructureObject) arg).slots.length);
			return type_error(arg, Symbol.STRUCTURE_OBJECT);
		}
	};

	private static final Primitive STRUCTURE_REF = new pf_structure_ref();

	@DocString(name = "structure-ref", args = "instance index", returns = "value")
	private static final class pf_structure_ref extends Primitive
	{
		pf_structure_ref()
		{
			super("structure-ref", PACKAGE_SYS, true);
		}

		@Override
		public LispObject execute(LispObject first, LispObject second)
		{
			if (first instanceof StructureObject) try
			{
				return (LispObject) ((StructureObject) first).slots[Fixnum.getValue(second)];
			} catch (ArrayIndexOutOfBoundsException e)
			{
				// Shouldn't happen.
				return error(new LispError("Internal error."));
			}
			return type_error(first, Symbol.STRUCTURE_OBJECT);
		}
	};

	private static final Primitive STRUCTURE_SET = new pf_structure_set();

	@DocString(name = "structure-set", args = "instance index new-value", returns = "new-value")
	private static final class pf_structure_set extends Primitive
	{
		pf_structure_set()
		{
			super("structure-set", PACKAGE_SYS, true);
		}

		@Override
		public LispObject execute(LispObject first, LispObject second, LispObject third)
		{
			if (first instanceof StructureObject) try
			{
				((StructureObject) first).reallySetSlot(second.intValue(), third);
				return third;
			} catch (ArrayIndexOutOfBoundsException e)
			{
				// Shouldn't happen.
				return error(new LispError("Internal error."));
			}
			return type_error(first, Symbol.STRUCTURE_OBJECT);
		}
	};

	private static final Primitive MAKE_STRUCTURE = new pf_make_structure();

	@DocString(name = "make-structure")
	private static final class pf_make_structure extends Primitive
	{
		pf_make_structure()
		{
			super("make-structure", PACKAGE_SYS, true);
		}

		@Override
		public LispObject execute(LispObject first, LispObject second)
		{
			return new StructureObject(checkSymbol(first), second);
		}

		@Override
		public LispObject execute(LispObject first, LispObject second, LispObject third)

		{
			return new StructureObject(checkSymbol(first), second, third);
		}

		@Override
		public LispObject execute(LispObject first, LispObject second, LispObject third, LispObject fourth)

		{
			return new StructureObject(checkSymbol(first), second, third, fourth);
		}

		@Override
		public LispObject execute(LispObject first, LispObject second, LispObject third, LispObject fourth, LispObject fifth)
		{
			return new StructureObject(checkSymbol(first), second, third, fourth, fifth);
		}

		@Override
		public LispObject execute(LispObject first, LispObject second, LispObject third, LispObject fourth, LispObject fifth, LispObject sixth)
		{
			return new StructureObject(checkSymbol(first), second, third, fourth, fifth, sixth);
		}

		@Override
		public LispObject execute(LispObject first, LispObject second, LispObject third, LispObject fourth, LispObject fifth, LispObject sixth, LispObject seventh)
		{
			return new StructureObject(checkSymbol(first), second, third, fourth, fifth, sixth, seventh);
		}
	};

	private static final Primitive _MAKE_STRUCTURE = new pf__make_structure();

	@DocString(name = "%make-structure", args = "name slot-values", returns = "object")
	private static final class pf__make_structure extends Primitive
	{
		pf__make_structure()
		{
			super("%make-structure", PACKAGE_SYS, true);
		}

		@Override
		public LispObject execute(LispObject first, LispObject second)
		{
			return new StructureObject(checkSymbol(first), second.copyToArray());
		}
	};

	private static final Primitive COPY_STRUCTURE = new pf_copy_structure();

	@DocString(name = "copy-structure", args = "structure", returns = "copy")
	private static final class pf_copy_structure extends Primitive
	{
		pf_copy_structure()
		{
			super(Symbol.COPY_STRUCTURE, "structure");
		}

		@Override
		public LispObject execute(LispObject arg)
		{
			if (arg instanceof StructureObject) return new StructureObject((StructureObject) arg);
			return type_error(arg, Symbol.STRUCTURE_OBJECT);
		}
	}
	//
	//	@Override
	//	public void clear()
	//	{
	//		// TODO Auto-generated method stub
	//		if (true)
	//			Errors.unimplementedMethod("Auto-generated method stub:  SubLStruct.clear");
	//
	//	}
	//
	//	@Override
	//	public SubLStructDecl getStructDecl()
	//	{
	//		// TODO Auto-generated method stub
	//		if (true)
	//			Errors.unimplementedMethod("Auto-generated method stub:  SubLStruct.getStructDecl");
	//		return null;
	//	}
	//
	//	@Override
	//	public void setName(SubLSymbol p0)
	//	{
	//		// TODO Auto-generated method stub
	//		if (true)
	//			Errors.unimplementedMethod("Auto-generated method stub:  SubLStruct.setName");
	//
	//	}

	@Override
	public int hashCode(int p0)
	{
		return super.superHash();
	}

	@Override
	public SubLObject getField(int fieldNum)
	{
		return getSlotValue(fieldNum - 2);
	}

	@Override
	public void setFieldImpl(int fieldNum, SubLObject value)
	{
		final int slotNum = fieldNum - 2;
		setSlotValue(slotNum, maybeUnbound(value));
	}

	private LispObject maybeUnbound(SubLObject value)
	{
		if (value == null) return UNBOUND_VALUE;
		return (LispObject) value;
	}

	//@Override
	@Override
	public LispObject getSharedSlotLocation(LispObject slotName)
	{
		// TODO Auto-generated method stub
		if (true) Errors.unimplementedMethod("Auto-generated method stub:  AbstractSubLStruct.getSharedSlotLocation");
		return null;
	}

	//	@Override
	@Override
	public Layout updateLayout()
	{
		// TODO Auto-generated method stub
		if (true) Errors.unimplementedMethod("Auto-generated method stub:  StandardObject.updateLayout");
		return null;
	}

	@Override
	public SubLSymbol getName()
	{
		LispObject lo = classOf();
		if (lo == null) return null;
		lo = ((LispClass) lo).getLispClassName();
		return (SubLSymbol) lo;
	}

	//	@Override
	@Override
	public SubLObject[] getSlots()
	{
		return slots;
	}

	//
	//@Override
	@Override
	public void setSlots(LispObject[] tempSlots)
	{
		slots = tempSlots;
	}

	protected void setStructureClass(StructureClass structureClass)
	{
		this.structureClass = structureClass;
	}

	@Override
	public void setLayout(Layout structdecl)
	{
		if (structdecl != layout)
		{
			layout = structdecl;
			LispObject lispClass = layout.getLispClass();
			if (lispClass instanceof StructureClass)
			{
				setStructureClass((StructureClass) lispClass);
			}
			//updateLayoutSync();
			SubLSymbol sym = layout.getStructName();
			if (sym != null) setName(sym);			
		}
		if(isTracked()) {
			PrologSync.addThis(this);
		}
	}

}
