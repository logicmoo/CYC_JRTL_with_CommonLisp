//
// For LarKC
//
package com.cyc.tool.subl.jrtl.nativeCode.type.core;

import org.armedbear.lisp.Layout;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public interface SubLStruct extends SubLObject {
	void clear();

	boolean isInitialized();
	
	boolean isDontTrack();
	
	@Override
	SubLObject getField(int p0);

	SubLObject getField(SubLSymbol p0);

	int getFieldCount();

	SubLSymbol getName();

	SubLStructDecl getStructDecl();

	int id();

	@Override
	void setField(int p0, SubLObject p1);

	void setField(SubLSymbol p0, SubLObject p1);

	void setName(SubLSymbol p0);

	void setLayout(Layout structdecl);
}
