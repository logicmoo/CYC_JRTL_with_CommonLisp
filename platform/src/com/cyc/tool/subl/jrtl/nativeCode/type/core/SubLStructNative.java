//

// For LarKC
//
package com.cyc.tool.subl.jrtl.nativeCode.type.core;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.List;

import org.armedbear.lisp.Layout;
import org.armedbear.lisp.Main;
import org.jpl7.Term;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrologSync;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLNumberFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;

import sun.misc.Unsafe;
import sun.reflect.FieldAccessor;

public abstract class SubLStructNative extends AbstractSubLStruct implements SubLStruct
{


	@Override
	public void setLayout(Layout structdecl)
	{
		if (layout == structdecl) return;
		if (layout == null)
		{
			layout = structdecl;
			if (Main.trackStructs)
			{
				PrologSync.addThis(this);
			}
		}
		else
		{
			Errors.unimplementedMethod("SublStructNative.setLayout(.)");
		}
	}

	protected SubLStructNative()
	{
		layout = getStructDecl();
	}

	protected SubLStructNative(SubLObject initValues)
	{
		layout = getStructDecl();
		if (initValues == null || initValues == SubLNil.NIL || initValues == CommonSymbols.UNPROVIDED) return;
		SubLObject next = SubLNil.NIL;
		SubLStructDeclNative structDecl = (SubLStructDeclNative) getStructDecl();
		for (next = initValues; next != SubLNil.NIL; next = conses_high.cddr(next))
		{
			SubLObject currentField = ConsesLow.car(next);
			SubLObject currentValue = conses_high.cadr(next);
			structDecl.setFieldFromName(currentField.toSymbol(), currentValue);
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

	@Override
	public SubLObject getField(int fieldNum)
	{
		if (fieldNum == 0) return SubLNumberFactory.makeInteger(getFieldCount());
		if (fieldNum == 1) return getName();
		fieldNum -= 2;
		Field field = ((SubLStructDeclNative) getStructDecl()).getFieldDecl(fieldNum);
		try
		{
			return (SubLObject) field.get(this);
		} catch (IllegalAccessException iae)
		{
			return Errors.error("Unable to set table value", iae);
		}
	}

	@Override
	public void setFieldImpl(int fieldNum, SubLObject value)
	{
		if (fieldNum == 0) Errors.unimplementedMethod("SublStructNative.setField(0)");
		if (fieldNum == 1) Errors.unimplementedMethod("SublStructNative.setField(1)");
		fieldNum -= 2;
		Field field = ((SubLStructDeclNative) getStructDecl()).getFieldDecl(fieldNum);
		try
		{
			field.set(this, value);
		} catch (IllegalAccessException iae)
		{
			Errors.error("Unable to set table value", iae);
		}
	}

	@Override
	public SubLObject setField0(SubLObject newVal)
	{
		Errors.unimplementedMethod("SublStructNative.setField0()");
		return SubLNil.NIL;
	}

	@Override
	public SubLObject setField1(SubLObject newVal)
	{
		Errors.unimplementedMethod("SublStructNative.setField1()");
		return SubLNil.NIL;
	}

	@Override
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
	public SubLObject setField2(SubLObject value)
	{

		Field field = ((SubLStructDeclNative) getStructDecl()).getFieldDecl(0);
		try
		{
			field.set(this, value);
		} catch (IllegalAccessException iae)
		{
			Errors.error("Unable to set table value", iae);
		}
		return value;
	}

	@Override
	public void setName(SubLSymbol name)
	{
		getStructDecl().setStructName(name);
	}

}
