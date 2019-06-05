//
// For LarKC
//
package com.cyc.tool.subl.jrtl.nativeCode.type.core;

import java.util.List;

import org.armedbear.lisp.Fixnum;
import org.armedbear.lisp.Layout;
import org.armedbear.lisp.LispClass;
import org.armedbear.lisp.LispObject;
import org.armedbear.lisp.SimpleVector;
import org.armedbear.lisp.StructureClass;
import org.armedbear.lisp.Symbol;
import org.jpl7.Term;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrologSync;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrologSync.IPrologifiable;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrologSync.SyncState;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public abstract class AbstractSubLStruct extends LispObject implements SubLStruct, IPrologifiable
{
	@Override
	abstract public void setSlotValue(int index, LispObject value);

	@Override
	abstract public LispObject getSlotValue(int index);

	@Override
	abstract public LispObject SLOT_VALUE(LispObject slotName);

	@Override
	abstract public void setSlotValue(LispObject slotName, LispObject newValue);

	@Override
	abstract public void setLayout(Layout structdecl);

	//public org.jpl7.Term termRef;
	public AbstractSubLStruct()
	{
	}

	@Override
	public SubLObject getField(int slotNum)
	{
		if (slotNum == 0) return getField0();
		if (slotNum == 1) return getField1();
		return getSlotValue(slotNum - 2);
	}

	protected Layout layout;

	@Override
	public SubLStructDecl getStructDecl()
	{
		if (layout != null) return (SubLStructDecl) layout;
		if (true) Errors.unimplementedMethod("Auto-generated method stub:  SubLStruct.getStructDecl");
		return null;
	}

	protected int getSlotIndex(LispObject slotName)
	{
		layout = getStructDecl();
		if (layout.isInvalid())
		{
			// Update instance.
			layout = updateLayout();
		}
		int index = layout.getSlotIndex(slotName);
		if (index >= 0) return index;

		StructureClass structureClass = (StructureClass) layout.getLispClass();
		LispObject effectiveSlots = structureClass.getSlotDefinitions();
		LispObject[] effectiveSlotsArray = effectiveSlots.copyToArray();
		int len = effectiveSlotsArray.length;
		for (int i = 0; i < len; i++)
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

	protected Layout updateLayout()
	{
		return layout;
	}

	@Override
	public LispObject classOf()
	{
		//	if(structureClass!=null) return structureClass;

		Symbol name = (Symbol) typeOf();
		// The proper name of a class is "a symbol that names the class whose
		// name is that symbol".
		if (name != NIL && name != UNBOUND_VALUE)
		{
			// TYPE-OF.9
			//final LispClass c2 = (LispClass) LispClass.findClass(name, false);
			// dmiles sayz that the above line isnt right
			final LispClass c2 = (LispClass) LispClass.findClass(name);
			if (c2 != null) { return c2; }
		}
		if (true)
		{
			final SubLStructDecl structDecl = getStructDecl();
			if (structDecl != null)
			{
				final LispObject lispClass = structDecl.getLispClass();
				if (lispClass != null) return lispClass;
			}
		}
		return super.classOf();
	}

	@Override
	public LispObject typeOf()
	{
		//if(structureClass!=null) return structureClass.getLispClassName();
		return (LispObject) getName();
	}

	public static String STRUCT_TYPE_NAME = "STRUCT";

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

	@Override
	abstract public boolean equalp(SubLObject obj);

	public boolean equalpS(SubLObject obj)
	{
		return super.equalp(obj);
	}

	public boolean equalpA(SubLObject obj)
	{
		if (obj == this) return true;
		if (obj == null) return false;
		if (!obj.isStructure()) return false;

		SubLStruct otherStuct = obj.toStruct();
		SubLStructDecl decl = getStructDecl();
		SubLStructDecl otherDecl = otherStuct.getStructDecl();

		if (decl != null && otherDecl != null)
		{
			if (decl.isInterned || decl != otherDecl) return false;
		}
		else if (!getField0().equalp(otherStuct.getField0()) || !getField1().equalp(otherStuct.getField1())) return false;

		int fieldCount = getFieldCount();
		switch (fieldCount)
		{
			case 19:
				if (!getField20().equalp(otherStuct.getField20())) return false;
			case 18:
				if (!getField19().equalp(otherStuct.getField19())) return false;
			case 17:
				if (!getField18().equalp(otherStuct.getField18())) return false;
			case 16:
				if (!getField17().equalp(otherStuct.getField17())) return false;
			case 15:
				if (!getField16().equalp(otherStuct.getField16())) return false;
			case 14:
				if (!getField15().equalp(otherStuct.getField15())) return false;
			case 13:
				if (!getField14().equalp(otherStuct.getField14())) return false;
			case 12:
				if (!getField13().equalp(otherStuct.getField13())) return false;
			case 11:
				if (!getField12().equalp(otherStuct.getField12())) return false;
			case 10:
				if (!getField11().equalp(otherStuct.getField11())) return false;
			case 9:
				if (!getField10().equalp(otherStuct.getField10())) return false;
			case 8:
				if (!getField9().equalp(otherStuct.getField9())) return false;
			case 7:
				if (!getField8().equalp(otherStuct.getField8())) return false;
			case 6:
				if (!getField7().equalp(otherStuct.getField7())) return false;
			case 5:
				if (!getField6().equalp(otherStuct.getField6())) return false;
			case 4:
				if (!getField5().equalp(otherStuct.getField5())) return false;
			case 3:
				if (!getField4().equalp(otherStuct.getField4())) return false;
			case 2:
				if (!getField3().equalp(otherStuct.getField3())) return false;
			case 1:
				if (!getField2().equalp(otherStuct.getField2())) return false;
				break;
		}
		if (fieldCount >= 20) for (int i = 19; i < fieldCount; ++i)
		{
			int index = i + 1;
			if (!this.getField(index).equalp(otherStuct.getField(index))) return false;
		}
		return true;
	}

	public boolean equalsS(Object obj)
	{
		return super.equals(obj);
	}

	@Override
	abstract public boolean equals(Object obj);

	public boolean equalsA(Object obj)
	{
		if (obj == this) return true;
		if (obj == null) return false;
		if (!(obj instanceof SubLObject)) return false;
		SubLObject sublObj = (SubLObject) obj;
		if (!sublObj.isStructure()) return false;
		SubLStruct other = sublObj.toStruct();
		if (getName() != other.getName()) return false;
		if (getFieldCount() != other.getFieldCount()) return false;
		for (int i = 0, size = getFieldCount(); i < size; ++i)
		{
			int index = i + 2;
			final SubLObject field1 = this.getField(index);
			final SubLObject field2 = other.getField(index);
			if (!field1.equals(field2)) return false;
		}
		return true;
	}

	@Override
	public SubLObject getField(SubLSymbol fieldName)
	{
		int fieldNum = getStructDecl().getFieldNumForSymbolOffsetBy2(fieldName);
		return this.getField(fieldNum);
	}

	@Override
	public int getFieldCount()
	{
		SubLStructDecl decl = getStructDecl();
		if (decl != null) return decl.getFieldCount();
		return layout.getLength();
	}

	@Override
	public SubLSymbol getName()
	{
		return getStructDecl().getStructName();
	}

	@Override
	public SubLSymbol getType()
	{
		return getName();
	}

	@Override
	public SubLFixnum getTypeCode()
	{
		return CommonSymbols.TWO_HUNDRED_FIFTY_FOUR_INTEGER;
	}

	@Override
	public int hashCode(int currentDepth)
	{
		try
		{
			return Sxhash.sxhash(this).intValue();
		} catch (Throwable t)
		{
			t.printStackTrace();
			return super.superHash();
		}
	}

	@Override
	public int id()
	{
		return getStructDecl().getId();
	}

	public void init(int size)
	{
		clear();
	}

	@Override
	public void setField(SubLSymbol fieldName, SubLObject value)
	{
		int fieldNum = getStructDecl().getFieldNumForSymbolOffsetBy2(fieldName);
		this.setField(fieldNum, value);
	}

	@Override
	final public void setField(int fieldNum, SubLObject value)
	{
		setFieldImpl(fieldNum, value);
	}

	abstract public void setFieldImpl(int fieldNum, SubLObject value);

	public int getStructFieldNumForSymbol(SubLSymbol fieldName)
	{
		return getStructDecl().getFieldNumForSymbolOffsetBy2(fieldName);
	}

	/**
	 * @param slotName
	 * @return
	 */
	public int getInstanceSlotIndex(LispObject slotName)
	{

		return getStructFieldNumForSymbol((SubLSymbol) slotName) - 2;
	}

	public abstract class LispSharedSlot extends LispObject
	{
		@Override
		abstract public void setCdr(LispObject rest);
	}

	//@Override
	public LispObject getSharedSlotLocation(LispObject slotName)
	{
		final int iPlus2 = getStructFieldNumForSymbol((SubLSymbol) slotName);
		if (iPlus2 < 0) return null;
		return new LispSharedSlot()
		{
			@Override
			public void setCdr(LispObject obj)
			{
				setField(iPlus2, obj);
			}

			@Override
			public LispObject cdr()
			{
				return (LispObject) getField(iPlus2);
			}
		};
	}

	@Override
	abstract public String printObject();

	@Override
	public SubLStruct toStruct()
	{
		return this;
	}

	@Override
	public String toTypeName()
	{
		return "STRUCT";
	}

	//@Override
	public LispObject getLispClass()
	{
		return classOf();
	}

	//	@Override
	public LispObject setSlotArray(int index, LispObject newValue)
	{
		setField(index + 2, newValue);
		return newValue;
	}

	//@Override
	public LispObject getSlotArrayElement(int index)
	{
		return (LispObject) getField(index + 2);
	}

	public Term toProlog(List s)
	{
		if (termRef == null || termRef instanceof SyncState)
		{
			termRef = PrologSync.toProlog(null, this, s);
		}
		return termRef;

	}

	@Override
	public boolean isAlien()
	{
		return false;
	}

	@Override
	public boolean isAtom()
	{
		return true;
	}

	@Override
	public boolean isStructure()
	{
		return true;
	}

	public boolean structures_bag_p()
	{
		return true;
	}

	@Override
	public boolean canFastHash()
	{
		if (layout != null) return layout.isInterned;
		SubLStructDecl structDecl = getStructDecl();
		return structDecl != null && structDecl.isInterned;
	}

	@Override
	public void clear()
	{
		SubLStructDecl structDecl = getStructDecl();
		for (int size = structDecl.getFieldCount(), i = 0; i < size; ++i)
			this.setField(i, SubLNil.NIL);
	}

	@Override
	public boolean isSymbol()
	{
		return false;
	}

	@Override
	public boolean isVector()
	{
		return false;
	}

	public boolean isTracked()
	{
		if (layout == null) return false;
		SubLStructDecl decl = getStructDecl();
		return (decl.isTracked());
	}

}
