package com.cyc.tool.subl.jrtl.nativeCode.commonLisp;

import java.math.BigInteger;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;

public interface HashTable {

  abstract void rehash();

	SubLObject gethash(SubLObject key);

	SubLObject gethash1(SubLObject key);

	int getCount();

	SubLObject gethash(SubLObject key, SubLObject defaultValue);

	
	void putVoid(SubLObject k, SubLObject v);
	
	SubLSymbol getTest();

	SubLObject getHT(SubLObject first);
	SubLObject removeHT(SubLObject first);
	//void putHT(SubLObject first, SubLObject second);

	SubLObject puthash(SubLObject key, SubLObject value);

	void clear();

	SubLObject remhash(SubLObject key);

	SubLObject ENTRIES();

	int getSize();

	SubLObject getRehashSize();

	SubLObject getRehashThreshold();

	SubLObject MAPHASH(SubLObject first);

}
