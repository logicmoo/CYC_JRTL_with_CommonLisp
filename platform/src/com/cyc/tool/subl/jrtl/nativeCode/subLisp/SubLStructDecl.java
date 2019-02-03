//
// For LarKC
//
package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import java.util.HashMap;

import org.armedbear.lisp.Layout;
import org.armedbear.lisp.LispClass;
import org.armedbear.lisp.LispObject;
import org.armedbear.lisp.Primitive;
import org.armedbear.lisp.SlotClass;
import org.armedbear.lisp.Symbol;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStruct;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructInterpreted;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLPackage;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbolFactory;

public class SubLStructDecl extends Layout
{
	public SubLStruct newInstance()
	{
		return new SubLStructInterpreted.SubLStructInterpretedImpl(this);
	}
	
	protected SubLStructDecl(SubLSymbol structName, SubLSymbol[] getterNames, SubLSymbol[] setterNames, SubLSymbol[] slotKeywords, SubLSymbol printFunction, SubLSymbol hashFunction, SubLSymbol testFunction, boolean isInterned)
	{
		super(structName, getterNames, setterNames, slotKeywords, printFunction, hashFunction, testFunction, isInterned);
	}

	public SubLStructDecl(LispObject lispClass, LispObject instanceSlots, LispObject sharedSlots)
	{
		super(lispClass, instanceSlots, sharedSlots);
	}

	public SubLStructDecl(SlotClass slotClass, LispObject[] instanceSlotNames, Symbol sharedSlots)
	{
		super(slotClass, instanceSlotNames, sharedSlots);
	}

	public SubLStructDecl(Layout oldLayout)
	{
		super(oldLayout);
	}

	public static SubLStructDecl getStructDecl(SubLSymbol structName)
	{
		final Symbol symbol = structName.toLispObject();
		SubLStructDecl structDecl = SubLStructDecl.structNameToStructDeclMap.get(structName);
		if (structDecl == null)
		{
			LispClass lispClass = LispClass.findClass(symbol);
			if (lispClass == null)
			{
				final String qualifiedName = symbol.getQualifiedName();
				Errors.error("Invalid struct name: " + qualifiedName);
			}
			return (SubLStructDecl) lispClass.getClassLayout();
		}
		return structDecl;
	}

	public static void main(String[] args)
	{
	}

	static
	{
		structNameToStructDeclMap = new HashMap<SubLSymbol, SubLStructDecl>();
		structNameToIDMap = new HashMap<SubLSymbol, Integer>();
		SubLStructDecl.idCounter = 0;
	}

	public static SubLStructDecl makeStructDeclInterpreted(String[] actualFieldNames, SubLSymbol typeName, String getterPrefix, String setterPre_Prefix)
	{
		return makeStructDeclInterpreted(typeName, null, getterPrefix, setterPre_Prefix, actualFieldNames, null);
	}

	public static final class is_instance_of_struct_type extends Primitive
	{
		private SubLStructDecl clazz;

		public is_instance_of_struct_type(Symbol named, SubLStructDecl clazz)
		{
			super(named);
			named.setFunction(this);
			this.clazz = clazz;

		}

		@Override
		public LispObject execute(LispObject arg)
		{
			return clazz.isInstance(arg);
		}
	}

	public static final class is_instance_of_struct_name extends Primitive
	{
		private SubLSymbol clazz;

		public is_instance_of_struct_name(Symbol named, SubLSymbol clazz)
		{
			super(named);
			named.setFunction(this);
			this.clazz = clazz;

		}

		@Override
		public LispObject execute(LispObject arg)
		{
			LispObject typeSpecifier = clazz.toLispObject();
			return arg.typep(typeSpecifier);
		}
	}

	public static SubLStructDecl makeStructDeclInterpreted(SubLSymbol typeName, SubLSymbol predicateName, String getterPrefix, String setterPre_Prefix, String[] actualFieldNames, SubLSymbol printFunction)
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
			new is_instance_of_struct_name(predicateName.toLispObject(), typeName);
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
		//SubLSymbol structName, SubLSymbol[] getterNames, SubLSymbol[] setterNames, SubLSymbol[] slotKeywords, 
		//SubLSymbol printFunction, SubLSymbol hashFunction, SubLSymbol testFunction, boolean isInterned

		return new SubLStructDecl(typeName, getterNamesArray, setterNamesArray, slotKeywordNamesArray, //
				printFunction, null, predicateName, false);
	}

	@Override
	public boolean isTracked()
	{
		return izTracked;
	}

	@Override
	public void setTrackStructInstance(boolean trackStructInstance, int flagAt)
	{
		this.izTracked = trackStructInstance;
	}

}
