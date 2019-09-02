//

// For LarKC
//
package com.cyc.tool.subl.jrtl.nativeCode.type.core;

import java.lang.reflect.Field;

import org.armedbear.lisp.Layout;
import org.armedbear.lisp.LispObject;
import org.armedbear.lisp.LispThread;
import org.armedbear.lisp.Symbol;
import org.logicmoo.system.BeanShellCntrl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.InvalidSubLExpressionException;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLNumberFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;

public abstract class SubLStructNative extends AbstractSubLStruct implements SubLStruct {

    /* (non-Javadoc)
     * @see com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject#eval(com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLEnvironment)
     */
    @Override
    final public SubLObject eval(SubLEnvironment p0) throws InvalidSubLExpressionException {
	// TODO Auto-generated method stub
	return this;
    }

    abstract public SubLStructDecl getStructDecl();

    public LispObject getSlotValue(int index) {
	return (LispObject) getField(index + 2);
    }

    public LispObject SLOT_VALUE(LispObject slotName) {
	LispObject value;
	if (slotName instanceof SubLSymbol) {
	    value = (LispObject) ((SubLStructDeclNative) getStructDecl()).getFieldFromName(this, (SubLSymbol) slotName);
	    return value;
	}
	final int index = getSlotIndex(slotName);
	if (index >= 0) {
	    // Found instance slot.
	    value = getSlotValue(index);
	} else {
	    // Check for shared slot.
	    LispObject location = layout.getSharedSlotLocation(slotName);
	    if (location == null)
		return Symbol.SLOT_MISSING.execute(getLispClass(), this, slotName, Symbol.SLOT_VALUE);
	    value = location.cdr();
	}
	if (value == UNBOUND_VALUE) {
	    value = Symbol.SLOT_UNBOUND.execute(getLispClass(), this, slotName);
	    LispThread.currentThread()._values = null;
	}
	return value;
    }

    public void setSlotValue(LispObject slotName, LispObject newValue) {
	if (slotName instanceof SubLSymbol) {
	    ((SubLStructDeclNative) getStructDecl()).setFieldFromName(this, (SubLSymbol) slotName, newValue);
	    return;
	}
	final int index = getSlotIndex(slotName);
	if (index >= 0) {
	    // Found instance slot.
	    setSlotValue(index, newValue);
	    return;
	}
	// Check for shared slot.
	LispObject location = layout.getSharedSlotLocation(slotName);
	if (location != null) {
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

    public void setSlotValue(int index, LispObject newValue) {
	setField(index + 2, newValue);
    }

    public void setLayout(Layout structdecl) {
	if (layout == structdecl)
	    return;
	if (layout == null) {
	    layout = structdecl;
	} else {
	    Errors.unimplementedMethod("SublStructNative.setLayout(.)");
	}
    }

    protected SubLStructNative() {
	layout = getStructDecl();
	if (isTracked()) {
	    BeanShellCntrl.addThis(this);
	}
    }

    protected SubLStructNative(SubLObject initValues) {
	layout = getStructDecl();
	if (initValues == null || initValues == SubLNil.NIL || initValues == CommonSymbols.UNPROVIDED)
	    return;
	SubLObject next = SubLNil.NIL;
	SubLStructDeclNative structDecl = (SubLStructDeclNative) getStructDecl();
	for (next = initValues; next != SubLNil.NIL; next = conses_high.cddr(next)) {
	    SubLObject currentField = ConsesLow.car(next);
	    SubLObject currentValue = conses_high.cadr(next);
	    structDecl.setFieldFromName(this, currentField.toSymbol(), currentValue);
	}
    }

    public boolean equalp(SubLObject obj) {
	return super.equalpA(obj);
    }

    public boolean lispEquals(Object obj) {
	return super.equalsA(obj);
    }

    /*
     * (non-Javadoc)
     * 
     * @see com.cyc.tool.subl.jrtl.nativeCode.type.core.AbstractSubLStruct#isReady()
     */
    @Override
    public boolean isInitialized() {

	int fieldCount = getFieldCount();
	if (fieldCount < 0)
	    return false;
	if (fieldCount == 0) {
	    return true;
	}
	if (fieldCount == 1) {
	    SubLObject slot = getField(2);
	    if (slot == null)
		return false;
	    return slot != NIL;
	}
	int hasNonNilSlot = 0;
	int fcp2 = fieldCount + 2;
	for (int i = 0; i < fcp2; i++) {
	    SubLObject slot = getField(i);
	    if (slot == null)
		return false;
	    if (slot != NIL)
		hasNonNilSlot++;
	}
	if (hasNonNilSlot > 0 && (fieldCount - 2 < hasNonNilSlot))
	    return true;
	return false;
    }

    public SubLObject getField(int fieldNum) {
	if (fieldNum == 0)
	    return SubLNumberFactory.makeInteger(getFieldCount());
	if (fieldNum == 1)
	    return getName();
	fieldNum -= 2;
	Field field = ((SubLStructDeclNative) getStructDecl()).getFieldDecl(fieldNum);
	try {
	    return (SubLObject) field.get(this);
	} catch (IllegalAccessException iae) {
	    return Errors.error("Unable to set table value", iae);
	}
    }

    public void setFieldImpl(int fieldNum, SubLObject value) {
	if (fieldNum == 0)
	    Errors.unimplementedMethod("SublStructNative.setField(0)");
	if (fieldNum == 1)
	    Errors.unimplementedMethod("SublStructNative.setField(1)");
	fieldNum -= 2;
	Field field = ((SubLStructDeclNative) getStructDecl()).getFieldDecl(fieldNum);
	try {
	    field.set(this, value);
	} catch (IllegalAccessException iae) {
	    Errors.error("Unable to set table value", iae);
	}
    }

    public SubLObject setField0(SubLObject newVal) {
	Errors.unimplementedMethod("SublStructNative.setField0()");
	return SubLNil.NIL;
    }

    public SubLObject setField1(SubLObject newVal) {
	Errors.unimplementedMethod("SublStructNative.setField1()");
	return SubLNil.NIL;
    }

    public String printObjectImpl() {
	try {
	    return print_high.princ_to_string(this).getStringValue();
	} catch (Exception e) {
	    checkUnreadableOk();
	    return "#<" + toTypeName() + " " + getName() + " @ " + System.identityHashCode(this) + ">";
	}
    }

    public SubLObject setField2(SubLObject value) {

	Field field = ((SubLStructDeclNative) getStructDecl()).getFieldDecl(0);
	try {
	    field.set(this, value);
	} catch (IllegalAccessException iae) {
	    Errors.error("Unable to set table value", iae);
	}
	return value;
    }

    public void setName(SubLSymbol name) {
	getStructDecl().setStructName(name);
    }

}
