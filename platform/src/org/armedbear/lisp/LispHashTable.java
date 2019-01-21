package org.armedbear.lisp;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;

public interface LispHashTable //extends SubLObject
{

	LispObject getRehashSize();

	LispObject getRehashThreshold();

	int getSize();

	int getCount();

	void clear();

	// gethash key hash-table &optional default => value, present-p
	LispObject gethash(LispObject key);

	// gethash key hash-table &optional default => value, present-p
	LispObject gethash(LispObject key, LispObject defaultValue);

//	LispObject gethash1(LispObject key);

	LispObject puthash(LispObject key, LispObject newValue);

	// remhash key hash-table => generalized-boolean
	LispObject remhash(LispObject key);

	Symbol getTestSymbol();

	LispObject get(LispObject key);

	void put(LispObject key, LispObject value);

	LispObject remove(LispObject key);

	LispObject ENTRIES();

	// Returns a list of (key . value) pairs.
	LispObject getEntries();

	LispObject MAPHASH(LispObject function);

	LispObject getWeakness();


}