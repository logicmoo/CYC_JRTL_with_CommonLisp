package com.cyc.cycjava.cycl;

import java.lang.reflect.Field;

import org.armedbear.lisp.BuiltInClass;
import org.armedbear.lisp.LispObject;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.AbstractSubLStruct;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStruct;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLNumberFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLT;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;

public final class assertion_content_holder
{
	public static SubLStruct makeNewInstance()
	{
		return structDecl.newInstance();
	}

	public static SubLObject isInstance(SubLObject v_object)
	{
		SubLObject was = structDecl.isInstance(v_object);
		return was;
	}

	static final SubLStructDecl structDecl;
	static
	{

		if (true) structDecl = SubLStructDecl.makeStructDeclInterpreted(new String[] { "$formula_data", "$mt", "$flags", "$arguments", "$plist" }, assertions_low.$sym0$ASSERTION_CONTENT, "AS-CONTENT", "_CSETF-");
		//		else
		//			structDecl = SubLStructDeclNative.makeStructDeclNative($assertion_content_native1.class, 
		//					 assertions_low.$sym0$ASSERTION_CONTENT, "AS-CONTENT", "_CSETF-");
		//	}
		//
		//	static public final class $assertion_content_native1 extends SubLStructNative implements SubLStruct
		//	{
		//		public SubLObject $formula_data;
		//		public SubLObject $mt;
		//		public SubLObject $flags;
		//		public SubLObject $arguments;
		//		public SubLObject $plist;
		//
		//		public $assertion_content_native1()
		//		{
		//			$formula_data = NIL;
		//			$mt = NIL;
		//			$flags = NIL;
		//			$arguments = NIL;
		//			$plist = NIL;
		//			layout = assertion_content_holder.structDecl;
		//		}
		//
		//		@Override
		//		public SubLStructDecl getStructDecl()
		//		{
		//			return structDecl;
		//		}
		//
		//		@Override
		//		public SubLObject getField2()
		//		{
		//			return $formula_data;
		//		}
		//
		//		@Override
		//		public SubLObject getField3()
		//		{
		//			return $mt;
		//		}
		//
		//		@Override
		//		public SubLObject getField4()
		//		{
		//			return $flags;
		//		}
		//
		//		@Override
		//		public SubLObject getField5()
		//		{
		//			return $arguments;
		//		}
		//
		//		@Override
		//		public SubLObject getField6()
		//		{
		//			return $plist;
		//		}
		//
		//		@Override
		//		public SubLObject setField2(final SubLObject value)
		//		{
		//			return $formula_data = value;
		//		}
		//
		//		@Override
		//		public SubLObject setField3(final SubLObject value)
		//		{
		//			return $mt = value;
		//		}
		//
		//		@Override
		//		public SubLObject setField4(final SubLObject value)
		//		{
		//			return $flags = value;
		//		}
		//
		//		@Override
		//		public SubLObject setField5(final SubLObject value)
		//		{
		//			return $arguments = value;
		//		}
		//
		//		@Override
		//		public SubLObject setField6(final SubLObject value)
		//		{
		//			return $plist = value;
		//		}
		//
		//		@Override
		//		public String toString()
		//		{
		//			try
		//			{
		//				return print_high.princ_to_string(this).getStringValue();
		//			} catch (Exception e)
		//			{
		//				return "#<" + toTypeName() + " " + getName() + " @ " + System.identityHashCode(this) + ">";
		//			}
		//		}
	}
}