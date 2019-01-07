//
// For LarKC
//
package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import java.lang.reflect.Field;
import java.util.Hashtable;

import org.armedbear.lisp.LispObject;
import org.armedbear.lisp.Primitive;
import org.armedbear.lisp.Symbol;

import com.cyc.cycjava.cycl.assertion_content_holder;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStruct;
import com.cyc.tool.subl.jrtl.nativeCode.type.operator.FixedArityFunctor;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbolFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLT;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class SubLStructDeclNative extends SubLStructDecl
{
	public LispObject isInstance(SubLObject v_object)
	{
		boolean was = ((v_object.getClass() == structClass));
		return was ? SubLT.T : SubLNil.NIL;
	}

	public static final class is_instance_of_foriegn_class extends Primitive
	{
		private Class clazz;

		public is_instance_of_foriegn_class(Symbol named, Class clazz)
		{
			super(named);
			named.setFunction(this);
			this.clazz = clazz;

		}

		@Override
		public LispObject execute(LispObject arg)
		{
			return clazz.isInstance(arg) ? SubLT.T : SubLNil.NIL;
		}
	}

	//	public static SubLObject is_instance_p(final SubLObject v_object)
	//	{
	//		return assertion_content_holder.isInstance(v_object);
	//	}

	public static SubLStructDeclNative makeStructDeclNative(Class structClass, SubLSymbol typeName, String getterPrefix, String setterPre_Prefix)
	{
		Field[] actualFields = structClass.getDeclaredFields();
		String[] actualFieldNames = new String[actualFields.length];
		for (int i = 0; i < actualFieldNames.length; i++)
		{
			actualFieldNames[i] = actualFields[i].getName();
		}
		return makeStructDeclNative(structClass, typeName, null, getterPrefix, setterPre_Prefix, actualFieldNames, null);
	}

	public static SubLStructDeclNative makeStructDeclNative(Class structClass, SubLSymbol typeName, SubLSymbol predicateName, String getterPrefix, String setterPre_Prefix, String[] actualFieldNames, SubLSymbol printFunction)
	{
		if (getterPrefix == null) getterPrefix = typeName.getName();
		String getter = getterPrefix + "-";
		SubLPackage intoPackage = typeName.getPackage();
		String setter = setterPre_Prefix + getter;

		if (printFunction == null || printFunction == SubLNil.NIL)
		{
			printFunction = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
		}
		if (predicateName == null || predicateName == SubLNil.NIL)
		{
			predicateName = SubLObjectFactory.makeSymbol(typeName.getName() + "-P", intoPackage);
			new is_instance_of_foriegn_class(predicateName.toLispObject(), structClass);
		}

		SubLSymbol[] slotNamesArray = new SubLSymbol[actualFieldNames.length];
		SubLSymbol[] slotKeywordNamesArray = new SubLSymbol[actualFieldNames.length];
		SubLSymbol[] getterNamesArray = new SubLSymbol[actualFieldNames.length];
		SubLSymbol[] setterNamesArray = new SubLSymbol[actualFieldNames.length];
		for (int i = 0; i < actualFieldNames.length; i++)
		{
			String fn = actualFieldNames[i];
			if (fn.startsWith("$"))
			{
				fn = fn.substring(1);
			}
			else if (fn.startsWith("_"))
			{
				fn = fn.substring(1);
			}
			fn = fn.replaceAll("_", "-").toUpperCase();
			slotKeywordNamesArray[i] = SubLSymbolFactory.makeKeyword(fn);
			slotNamesArray[i] = SubLSymbolFactory.makeSymbol(fn, intoPackage);
			getterNamesArray[i] = SubLSymbolFactory.makeSymbol(getter + fn, intoPackage);
			setterNamesArray[i] = SubLSymbolFactory.makeSymbol(setter + fn, intoPackage);
		}

		return new SubLStructDeclNative(structClass, typeName, predicateName, slotNamesArray, slotKeywordNamesArray, actualFieldNames, getterNamesArray, setterNamesArray, printFunction, null, false);
	}

	public SubLStructDeclNative(Class structClass, SubLSymbol structName, SubLSymbol testFunction, SubLSymbol[] slotNames, SubLSymbol[] slotKeywordNames, String[] actualFieldNames, SubLSymbol[] getterNames, SubLSymbol[] setterNames, SubLSymbol printFunction, SubLSymbol hashFunction, boolean isInterned)
	{
		super(structName, getterNames, setterNames, slotKeywordNames, printFunction, hashFunction, testFunction, isInterned);
		declaredFieldNameToFieldHash = new Hashtable();
		this.structClass = structClass;
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

	@Override
	public SubLStruct newInstance()
	{
		try
		{
			return getStructClass().newInstance();
		} catch (InstantiationException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return super.newInstance();
	}

	public Class<SubLStruct> getStructClass()
	{
		return structClass;
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
