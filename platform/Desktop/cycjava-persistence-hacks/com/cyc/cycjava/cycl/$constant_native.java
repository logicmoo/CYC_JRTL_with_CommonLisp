package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;

public final class $constant_native extends SubLStructNative
{
	public SubLObject $suid;
	public SubLObject $name;
	private static final SubLStructDeclNative structDecl;

	public $constant_native()
	{
		this.$suid = (SubLObject) CommonSymbols.NIL;
		this.$name = (SubLObject) CommonSymbols.NIL;
	}

	@Override
	public SubLStructDecl getStructDecl()
	{
		return (SubLStructDecl) $constant_native.structDecl;
	}

	@Override
	public SubLObject getField2()
	{
		return this.$suid;
	}

	@Override
	public SubLObject getField3()
	{
		return this.$name;
	}

	@Override
	public SubLObject setField2(final SubLObject value)
	{
		return this.$suid = value;
	}

	@Override
	public SubLObject setField3(final SubLObject value)
	{
		return this.$name = value;
	}

	static
	{
		structDecl = Structures.makeStructDeclNative((Class) $constant_native.class, constant_handles.$sym39$CONSTANT, constant_handles.$sym40$CONSTANT_P, constant_handles.$list42, constant_handles.$list43, new String[] { "$suid", "$name" }, constant_handles.$list44, constant_handles.$list45, constant_handles.$sym46$PRINT_CONSTANT);
		structDecl.setTrackStructInstance(true, -1);
	}
}