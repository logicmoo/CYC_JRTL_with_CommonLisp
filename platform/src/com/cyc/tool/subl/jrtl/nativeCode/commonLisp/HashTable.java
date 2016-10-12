package com.cyc.tool.subl.jrtl.nativeCode.commonLisp;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public interface HashTable {

	void clear();

	SubLObject ENTRIES();

	int getCount();

	SubLObject gethash(SubLObject key);

	SubLObject gethash(SubLObject key, SubLObject defaultValue);

	SubLObject gethash1(SubLObject key);

	SubLObject getHT(SubLObject first);

	SubLObject getRehashSize();

	SubLObject getRehashThreshold();

	int getSize();

	SubLSymbol getTest();

	SubLObject MAPHASH(SubLObject first);

	SubLObject puthash(SubLObject key, SubLObject value);

	void putVoid(SubLObject k, SubLObject v);

	abstract void rehash();

	SubLObject remhash(SubLObject key);

	SubLObject removeHT(SubLObject first);
	// void putHT(SubLObject first, SubLObject second);

}
