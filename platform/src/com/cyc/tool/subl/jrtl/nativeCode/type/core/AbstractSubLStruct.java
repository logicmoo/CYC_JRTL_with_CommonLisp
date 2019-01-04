//
// For LarKC
//
package com.cyc.tool.subl.jrtl.nativeCode.type.core;

import java.util.List;

import org.armedbear.lisp.Condition;
import org.armedbear.lisp.Fixnum;
import org.armedbear.lisp.GenericFunction;
import org.armedbear.lisp.LispObject;
import org.armedbear.lisp.Stream;
import org.jpl7.Term;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrologSync;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFixnum;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;

public abstract class AbstractSubLStruct extends LispObject implements SubLStruct {
	//public org.jpl7.Term termRef;
	public AbstractSubLStruct() {
		Object thiz = this;
		if(thiz instanceof Condition) return;
		if(thiz instanceof Stream) return;
		if(thiz instanceof GenericFunction) return;

	  if(false) PrologSync.addThis(this);
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

    abstract public boolean equalp(SubLObject obj) ;
    public boolean equalpS(SubLObject obj) {
    	return super.equalp(obj);
    }
    public boolean equalpA(SubLObject obj) {
		if (obj == this)
			return true;
		if (obj == null)
			return false;
		if (!obj.isStructure())
			return false;

		SubLStruct otherStuct = obj.toStruct();
		SubLStructDecl decl = getStructDecl();
		SubLStructDecl otherDecl = otherStuct.getStructDecl();

		if (decl != null && otherDecl != null) {
			if (decl.isInterned || decl != otherDecl)
				return false;
		} else if (!getField0().equalp(otherStuct.getField0()) || !getField1().equalp(otherStuct.getField1()))
			return false;

		int fieldCount = getFieldCount();
		switch (fieldCount) {
		case 19:
			if (!getField20().equalp(otherStuct.getField20()))
				return false;
		case 18:
			if (!getField19().equalp(otherStuct.getField19()))
				return false;
		case 17:
			if (!getField18().equalp(otherStuct.getField18()))
				return false;
		case 16:
			if (!getField17().equalp(otherStuct.getField17()))
				return false;
		case 15:
			if (!getField16().equalp(otherStuct.getField16()))
				return false;
		case 14:
			if (!getField15().equalp(otherStuct.getField15()))
				return false;
		case 13:
			if (!getField14().equalp(otherStuct.getField14()))
				return false;
		case 12:
			if (!getField13().equalp(otherStuct.getField13()))
				return false;
		case 11:
			if (!getField12().equalp(otherStuct.getField12()))
				return false;
		case 10:
			if (!getField11().equalp(otherStuct.getField11()))
				return false;
		case 9:
			if (!getField10().equalp(otherStuct.getField10()))
				return false;
		case 8:
			if (!getField9().equalp(otherStuct.getField9()))
				return false;
		case 7:
			if (!getField8().equalp(otherStuct.getField8()))
				return false;
		case 6:
			if (!getField7().equalp(otherStuct.getField7()))
				return false;
		case 5:
			if (!getField6().equalp(otherStuct.getField6()))
				return false;
		case 4:
			if (!getField5().equalp(otherStuct.getField5()))
				return false;
		case 3:
			if (!getField4().equalp(otherStuct.getField4()))
				return false;
		case 2:
			if (!getField3().equalp(otherStuct.getField3()))
				return false;
		case 1:
			if (!getField2().equalp(otherStuct.getField2()))
				return false;
			break;
		}
		if (fieldCount >= 20)
			for (int i = 19; i < fieldCount; ++i) {
				int index = i + 1;
				if (!this.getField(index).equalp(otherStuct.getField(index)))
					return false;
			}
		return true;
	}

    public boolean equalsS(Object obj) {
    	return super.equals(obj);
    }
	@Override
    abstract public boolean equals(Object obj);
	public boolean equalsA(Object obj) {
		if (obj == this)
			return true;
		if (obj == null)
			return false;
		if (!(obj instanceof SubLObject))
			return false;
		SubLObject sublObj = (SubLObject) obj;
		if (!sublObj.isStructure())
			return false;
		SubLStruct other = sublObj.toStruct();
		if (getName() != other.getName())
			return false;
		if (getFieldCount() != other.getFieldCount())
			return false;
		for (int i = 0, size = getFieldCount(); i < size; ++i) {
			int index = i + 2;
			if (!this.getField(index).equals(other.getField(index)))
				return false;
		}
		return true;
	}

	@Override
	public SubLObject getField(SubLSymbol fieldName) {
		int fieldNum = getStructDecl().getFieldNumForSymbol(fieldName);
		return this.getField(fieldNum);
	}

	@Override
	public int getFieldCount() {
		SubLStructDecl decl = getStructDecl();
		if (decl == null)
			return 0;
		return decl.getFieldCount();
	}

	@Override
	public SubLSymbol getName() {
		return getStructDecl().getStructName();
	}

	@Override
	public SubLSymbol getType() {
		return getName();
	}

	@Override
	public SubLFixnum getTypeCode() {
		return CommonSymbols.TWO_HUNDRED_FIFTY_FOUR_INTEGER;
	}

	@Override
	public int hashCode(int currentDepth) {
		try {
		return Sxhash.sxhash(this).intValue();
		} catch(Throwable t) {
			t.printStackTrace();
			return super.superHash();
		}
	}

	@Override
	public int id() {
		return getStructDecl().getId();
	}

	public void init(int size) {
	}

	@Override
	public void setField(SubLSymbol fieldName, SubLObject value) {
		int fieldNum = getStructDecl().getFieldNumForSymbol(fieldName);
		this.setField(fieldNum, value);
	}


	public int getStructFieldNumForSymbol(SubLSymbol fieldName) {
		return getStructDecl().getFieldNumForSymbol(fieldName);
	}
	/**
	 * @param slotName
	 * @return
	 */
	public int getInstanceSlotIndex(LispObject slotName) {

		return getStructFieldNumForSymbol((SubLSymbol) slotName)-2;
	}

	public abstract class LispSharedSlot extends LispObject {
		@Override
		abstract public void setCdr(LispObject rest);
	}

	//@Override
	public LispObject getSharedSlotLocation(LispObject slotName) {
		final int iPlus2 = getStructFieldNumForSymbol((SubLSymbol) slotName);
		if (iPlus2 < 0)
			return null;
		return new LispSharedSlot() {
			@Override
			public void setCdr(LispObject obj) {
				setField(iPlus2, obj);
			}

			@Override
			public LispObject cdr() {
				return (LispObject) getField(iPlus2);
			}
		};
	}

	@Override
	abstract public String printObjectImpl();

	@Override
	public SubLStruct toStruct() {
		return this;
	}

	@Override
	public String toTypeName() {
		return "STRUCT";
	}


	//@Override
	public LispObject getLispClass() {
		return classOf();
	}



//	@Override
	public LispObject setSlotArray(int index, LispObject newValue) {
		setField(index+2, newValue);
		return newValue;
	}

	//@Override
	public LispObject getSlotArrayElement(int index) {
		return (LispObject) getField(index+2);
	}

	public Term toProlog(List s)
	{
		return PrologSync.toProlog(getType().getName(), this,s);
	}


	@Override
	public boolean isAlien() {
		return false;
	}

	@Override
	public boolean isAtom() {
		return true;
	}

	@Override
	public boolean isStructure() {
		return true;
	}
	

}
