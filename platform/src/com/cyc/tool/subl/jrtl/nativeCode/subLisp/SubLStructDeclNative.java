//
// For LarKC
//
package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import java.lang.annotation.Annotation;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Hashtable;
import java.util.List;

import org.armedbear.lisp.LispObject;
import org.armedbear.lisp.Primitive;
import org.armedbear.lisp.Symbol;
import org.logicmoo.system.BeanShellCntrl.LispSlot;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.AbstractSubLStruct;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStruct;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbolFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLT;

import scala.reflect.internal.AnnotationInfos.Annotatable;
import sun.reflect.FieldAccessor;

public class SubLStructDeclNative extends SubLStructDecl
{
	@Override
	public LispObject isInstance(SubLObject v_object)
	{
		boolean was = ((v_object.getClass() == structClass));
		return was ? SubLT.T : SubLNil.NIL;
	}

	public LispObject getLispClass()
	{
		return lispClass;
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
		List useFields = new ArrayList();
		boolean annotationRequired = structClass.isAnnotationPresent(LispSlot.class);

		for (int i = 0; i < actualFields.length; i++)
		{
			Field f = actualFields[i];
			if (annotationRequired)
			{
				if (!f.isAnnotationPresent(LispSlot.class))
				{
					continue;
				}
			}
			else
			{
				if (Modifier.isStatic(f.getModifiers()))
				{
					if (!f.isAnnotationPresent(LispSlot.class))
					{
						continue;
					}
				}
			}
			useFields.add(f.getName());
		}
		return makeStructDeclNative(structClass, typeName, null, getterPrefix, setterPre_Prefix, (String[]) useFields.toArray(new String[useFields.size()]), null);
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
		int pingAt = size - 1;
		try
		{
			for (int i = 0; i < size; ++i)
			{
				Field f = structClass.getDeclaredField(this.actualFieldNames[i]);
				if (i == 0 || i == pingAt)
				{
					FieldAccessor before = (FieldAccessor) afa.invoke(f, true);
					if (!(before instanceof SpyFA))
					{
						SpyFA spy = new SpyFA(pingAt, i, before);
						sfa.invoke(f, spy, true);
					}
				}
				fieldDecls[i] = f;
			}
		} catch (Exception e)
		{
			Errors.error("Got invalid struct field declaration.", e);
		}
	}
	//
	//	public static void main(String[] args)
	//	{
	//	}

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
	private Hashtable<SubLSymbol, Field> declaredFieldNameToFieldHash;
	private int pongAt;

	public Field getFieldDecl(int i)
	{
		return fieldDecls[i];
	}

	public void setFieldFromName(Object thiz, SubLSymbol declaredFieldName, SubLObject value)
	{
		Field field = (Field) declaredFieldNameToFieldHash.get(declaredFieldName);
		if (field == null) Errors.error("Can't find field: " + declaredFieldName + " on object: " + this + ".");
		try
		{
			field.set(thiz, value);
		} catch (Exception e)
		{
			Errors.error("Unable to set field on: " + this + " using name " + declaredFieldName + ".", e);
		}
	}

	public SubLObject getFieldFromName(Object thiz, SubLSymbol declaredFieldName)
	{
		Field field = (Field) declaredFieldNameToFieldHash.get(declaredFieldName);
		if (field == null) Errors.error("Can't find field: " + declaredFieldName + " on object: " + this + ".");
		SubLObject value;
		try
		{
			value = (SubLObject) field.get(thiz);
			return value;
		} catch (Exception e)
		{
			return Errors.error("Unable to get field on: " + this + " using name " + declaredFieldName + ".", e);
		}

	}

	public class SpyFA implements FieldAccessor
	{
		final FieldAccessor before;
		private int index;
		private int pingAt;

		public SpyFA(int pingAt, int i, FieldAccessor b)
		{

			this.pingAt = pingAt;
			this.index = i;
			before = b;

		}

		@Override
		public Object get(Object arg0) throws IllegalArgumentException
		{
			return before.get(arg0);
		}

		@Override
		public boolean getBoolean(Object arg0) throws IllegalArgumentException
		{
			return before.getBoolean(arg0);
		}

		@Override
		public byte getByte(Object arg0) throws IllegalArgumentException
		{
			return before.getByte(arg0);
		}

		@Override
		public char getChar(Object arg0) throws IllegalArgumentException
		{
			return before.getChar(arg0);
		}

		@Override
		public double getDouble(Object arg0) throws IllegalArgumentException
		{
			return before.getDouble(arg0);
		}

		@Override
		public float getFloat(Object arg0) throws IllegalArgumentException
		{

			return before.getFloat(arg0);
		}

		@Override
		public int getInt(Object arg0) throws IllegalArgumentException
		{
			return before.getInt(arg0);
		}

		@Override
		public long getLong(Object arg0) throws IllegalArgumentException
		{
			return before.getLong(arg0);
		}

		@Override
		public short getShort(Object arg0) throws IllegalArgumentException
		{
			return before.getShort(arg0);
		}

		@Override
		public void set(Object arg0, Object arg1) throws IllegalArgumentException, IllegalAccessException
		{
			if (pingAt == index || index == 0)
			{
				Object waz = before.get(arg0);
				before.set(arg0, arg1);
				PrologSync.wasSetField((AbstractSubLStruct) arg0, index, pingAt, waz, arg1);
				return;
			}
			before.set(arg0, arg1);
		}

		@Override
		public void setBoolean(Object arg0, boolean arg1) throws IllegalArgumentException, IllegalAccessException
		{
			before.setBoolean(arg0, arg1);

		}

		@Override
		public void setByte(Object arg0, byte arg1) throws IllegalArgumentException, IllegalAccessException
		{
			before.setByte(arg0, arg1);

		}

		@Override
		public void setChar(Object arg0, char arg1) throws IllegalArgumentException, IllegalAccessException
		{
			before.setChar(arg0, arg1);

		}

		@Override
		public void setDouble(Object arg0, double arg1) throws IllegalArgumentException, IllegalAccessException
		{
			before.setDouble(arg0, arg1);

		}

		@Override
		public void setFloat(Object arg0, float arg1) throws IllegalArgumentException, IllegalAccessException
		{
			before.setFloat(arg0, arg1);

		}

		@Override
		public void setInt(Object arg0, int arg1) throws IllegalArgumentException, IllegalAccessException
		{
			before.setInt(arg0, arg1);

		}

		@Override
		public void setLong(Object arg0, long arg1) throws IllegalArgumentException, IllegalAccessException
		{
			before.setLong(arg0, arg1);

		}

		@Override
		public void setShort(Object arg0, short arg1) throws IllegalArgumentException, IllegalAccessException
		{
			before.setShort(arg0, arg1);

		}

	}

	// public static Unsafe unsafe = Unsafe.getUnsafe();
	static Method afa;
	static Method sfa;
	static
	{
		try
		{
			afa = Field.class.getDeclaredMethod("acquireFieldAccessor", boolean.class);
			afa.setAccessible(true);
			sfa = Field.class.getDeclaredMethod("setFieldAccessor", FieldAccessor.class, boolean.class);
			sfa.setAccessible(true);
		} catch (Throwable e)
		{
			throw new RuntimeException(e);
		}

	}

	@Override
	public void setTrackStructInstance(boolean track, int pingAt)
	{
		this.izTracked = track;
		if (izTracked)
		{
			listenToAllFields(fieldDecls, pingAt);
		}
	}

	private void listenToAllFields(Field[] fields, int pingAt)
	{
		try
		{
			if (pingAt == -1)
			{
				pingAt = fields.length - 1;
			}

			if (pingAt < 0) { return; }
			this.pongAt = pingAt;
			Field f = fields[pingAt];

			FieldAccessor before;
			before = (FieldAccessor) afa.invoke(f, true);
			if (before instanceof SpyFA) return;
			for (int i = 0; i < fields.length; i++)
			{
				f = fields[i];

				before = (FieldAccessor) afa.invoke(f, true);
				if (!(before instanceof SpyFA))
				{
					SpyFA spy = new SpyFA(pingAt, i, before);
					sfa.invoke(f, spy, true);
				}
			}

		} catch (Throwable e)
		{
			throw new RuntimeException(e);
		}
	}

	void listenToField(Field[] fields, int pingAt)
	{
		try
		{
			if (pingAt == -1)
			{
				pingAt = fields.length - 1;
			}

			if (pingAt < 0) { return; }
			Field f = fields[pingAt];
			FieldAccessor before = (FieldAccessor) afa.invoke(f, true);
			if (!(before instanceof SpyFA))
			{
				SpyFA spy = new SpyFA(pingAt, pingAt, before);
				sfa.invoke(f, spy, true);
			}

		} catch (Throwable e)
		{
			throw new RuntimeException(e);
		}
	}
}