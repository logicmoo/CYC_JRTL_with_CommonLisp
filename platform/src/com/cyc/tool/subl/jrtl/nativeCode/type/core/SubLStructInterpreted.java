//
// For LarKC
//
package com.cyc.tool.subl.jrtl.nativeCode.type.core;

import java.util.Arrays;

import org.armedbear.lisp.Fixnum;
import org.armedbear.lisp.Layout;
import org.armedbear.lisp.LispClass;
import org.armedbear.lisp.LispError;
import org.armedbear.lisp.LispObject;
import org.armedbear.lisp.LispThread;
import org.armedbear.lisp.Main;
import org.armedbear.lisp.StructureObject;
import org.armedbear.lisp.Symbol;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrologSync;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLNumberFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;

abstract public class SubLStructInterpreted extends AbstractSubLStruct implements SubLStruct
{

	@Override
	public void setName(SubLSymbol type)
	{
		typeID = SubLStructDecl.getTypeID(type);
		Layout structdecl = SubLStructDecl.getStructDecl(type);
		setLayout(structdecl);
	}

	protected SubLStructInterpreted()
	{
	}

	abstract public int hashCode(int currentDepth);

	/*final*/ protected SubLObject[] slots;
	//private SubLStructDecl structDecl;

	protected int typeID = -1;

	@Override
	public int id()
	{
		if (typeID < 0) Errors.unimplementedMethod("Auto-generated method stub:  SubLStruct.getStructDecl");
		return typeID;
	}

	@Override
	public void clear()
	{
		final int pingAt = slots.length - 1;
		Object was = slots[pingAt];
		final SubLNil theNil = SubLNil.NIL;
		Arrays.fill(slots, theNil);
		PrologSync.wasSetField(this, pingAt, pingAt, was, theNil);
	}
	

	protected void reallySetSlot(int index, LispObject newValue) throws ArrayIndexOutOfBoundsException
	{
		final int pingAt = slots.length - 1;
		if (index == 0 || index == pingAt)
		{
			Object was = getSlotValue(index);
			slots[index] = newValue;
			PrologSync.wasSetField(this, index, pingAt, was, newValue);
			return;
		}
		slots[index] = newValue;
	}

	@Override
	public int getFieldCount()
	{
		if (slots == null) return -1;
		return slots.length;
	}

	@Override
	public SubLObject setField0(SubLObject newVal)
	{
		return Errors.error("Can't set field 0 on structs (special).");
	}

	@Override
	public SubLObject setField1(SubLObject newVal)
	{
		return Errors.error("Can't set field 1 on structs (special).");
	}

	//
	//	//@Override
	//	public Layout updateLayout() {
	//
	//		//return super.updateLayout();
	//	}

	//	public String printObjectImpl() {
	//		try {
	//			return print_high.princ_to_string(this).getStringValue();
	//		} catch (Throwable e) {
	//			if(false)return "#<" + toTypeName() + " " + getName() + " @ " + System.identityHashCode(this) + ">";
	//			return "#<" + typeOf() + " " + getName() + " @ " + System.identityHashCode(this) + ">";
	//		}
	//	}

	//@Override
	public SubLObject[] getSlots()
	{
		return (SubLObject[]) slots;
	}

	//@Override
	public void setSlots(LispObject[] tempSlots)
	{
		slots = tempSlots;
	}

	public LispObject getSlotValue_0()
	{
		try
		{
			return (LispObject) slots[0];
		} catch (ArrayIndexOutOfBoundsException e)
		{
			return badIndex(0);
		}
	}

	public LispObject getSlotValue_1()
	{
		try
		{
			return (LispObject) slots[1];
		} catch (ArrayIndexOutOfBoundsException e)
		{
			return (LispObject) badIndex(1);
		}
	}

	public LispObject getSlotValue_2()
	{
		try
		{
			return (LispObject) slots[2];
		} catch (ArrayIndexOutOfBoundsException e)
		{
			return badIndex(2);
		}
	}

	public LispObject getSlotValue_3()
	{
		try
		{
			return (LispObject) slots[3];
		} catch (ArrayIndexOutOfBoundsException e)
		{
			return badIndex(3);
		}
	}

	public LispObject getSlotValue(int index)
	{
		try
		{
			return (LispObject) slots[index];
		} catch (ArrayIndexOutOfBoundsException e)
		{
			return badIndex(index);
		}
	}

	public int getFixnumSlotValue(int index)
	{
		try
		{
			return Fixnum.getValue((LispObject) slots[index]);
		} catch (ArrayIndexOutOfBoundsException e)
		{
			badIndex(index);
			// Not reached.
			return 0;
		}
	}

	public boolean getSlotValueAsBoolean(int index)
	{
		try
		{
			return slots[index] != NIL ? true : false;
		} catch (ArrayIndexOutOfBoundsException e)
		{
			badIndex(index);
			// Not reached.
			return false;
		}
	}

	final public void setSlotValue(int index, LispObject value)
	{
		try
		{
			reallySetSlot(index, value);
		} catch (ArrayIndexOutOfBoundsException e)
		{
			badIndex(index);
		}
	}

	protected LispObject badIndex(int n)
	{
		StringBuilder sb = new StringBuilder("Invalid slot index ");
		sb.append(Fixnum.getInstance(n).princToString());
		sb.append(" for ");
		sb.append(princToString());
		return error(new LispError(sb.toString()));
	}

	public static class SubLStructInterpretedImpl extends StructureObject
	{
		@Override
		public SubLSymbol getName()
		{
			return slotsStart[1].toSymbol();
		}

		protected SubLObject[] slotsStart = new SubLObject[2];

		public SubLStructInterpretedImpl(int size)
		{
			init(size);
			slotsStart[0] = SubLNumberFactory.makeInteger(size);
		}

		@Override
		public void init(int size)
		{
			if (this.slots == null || this.slots.length != size) this.slots = new SubLObject[size];
			super.init(size);
		}

		public SubLStructInterpretedImpl(Layout layout)
		{
			this(layout.getLength());
			setLayout(layout);
			if (Main.trackStructs)
			{
				PrologSync.addThis(this);
			}
		}

		@Override
		public boolean equalp(SubLObject obj)
		{
			return super.equalpA(obj);
		}

		@Override
		public boolean equals(Object obj)
		{
			return super.equalsA(obj);
		}

		public String printObjectImpl()
		{
			try
			{
				return print_high.princ_to_string(this).getStringValue();
			} catch (Exception e)
			{
				return "#<" + toTypeName() + " " + getName() + " @ " + System.identityHashCode(this) + ">";
			}
		}

		@Override
		public int hashCode(int currentDepth)
		{
			return Sxhash.sxhash(this).intValue();
		}

		@Override
		final public void setName(SubLSymbol type)
		{
			slotsStart[1] = type;
			typeID = SubLStructDecl.getTypeID(type);
			Layout structdecl = SubLStructDecl.getStructDecl(type);
			setLayout(structdecl);
		}

		public void setStructDecl(SubLStructDecl structDecl)
		{
			slotsStart[1] = structDecl.getStructName();
			this.layout = structDecl;
			this.typeID = structDecl.getId();
		}

		@Override
		public SubLObject getField(int slotNum)
		{
			if (slotNum < 2) return slotsStart[slotNum];
			return slots[slotNum - 2];
		}

	}

}
