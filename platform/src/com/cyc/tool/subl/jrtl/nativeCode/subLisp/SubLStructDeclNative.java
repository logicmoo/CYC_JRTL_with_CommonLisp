//
// For LarKC
//
package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import java.lang.reflect.Field;
import java.util.Hashtable;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public class SubLStructDeclNative extends SubLStructDecl
{
	public SubLStructDeclNative(Class structClass, SubLSymbol structName, SubLSymbol testFunction, SubLSymbol[] slotNames, 
			SubLSymbol[] slotKeywordNames, String[] actualFieldNames, SubLSymbol[] getterNames, SubLSymbol[] setterNames, 
			SubLSymbol printFunction, SubLSymbol hashFunction, boolean isInterned)
	{
		super(structName, getterNames, setterNames, slotKeywordNames, printFunction, hashFunction, testFunction, isInterned);
		declaredFieldNameToFieldHash = new Hashtable();
		this.actualFieldNames = actualFieldNames;
		int size = actualFieldNames.length;
		fieldDecls = new Field[size];
		try
		{
			for (int i = 0; i < size; ++i)
				fieldDecls[i] = structClass.getDeclaredField(this.actualFieldNames[i]);
		} catch (Exception e)
		{
			Errors.error("Got invalid struct field declaration.", e);
		}
	}

	public static void main(String[] args)
	{
	}

	private Field[] fieldDecls;
	private Class structClass;
	private String[] actualFieldNames;
	private Hashtable declaredFieldNameToFieldHash;

	public Field getFieldDecl(int i)
	{
		return fieldDecls[i];
	}

	public void setFieldFromName(SubLSymbol declaredFieldName, SubLObject value)
	{
		Field field = (Field) declaredFieldNameToFieldHash.get(declaredFieldName);
		if (field == null) Errors.error("Can't find field: " + declaredFieldName + " on object: " + this + ".");
		try
		{
			field.set(this, value);
		} catch (Exception e)
		{
			Errors.error("Unable to set field on: " + this + ".", e);
		}
	}
}
