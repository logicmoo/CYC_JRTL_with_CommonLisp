package org.armedbear.lisp;

interface WLispHashTable_HIDE extends LispHashTable
{

	LispObject getRehashSize();

	LispObject getRehashThreshold();

	/** How many hash buckets exist in the underlying data structure.  */
	int getSize();

	/** Number of entries stored in the hash buckets. */
	int getCount();

	void clear();

	// gethash key hash-table &optional default => value, present-p
	LispObject gethash(LispObject key);

	// gethash key hash-table &optional default => value, present-p
	LispObject gethash(LispObject key, LispObject defaultValue);

	LispObject gethash1(LispObject key);

	LispObject puthash(LispObject key, LispObject newValue);

	// remhash key hash-table => generalized-boolean
	LispObject remhash(LispObject key);

	Symbol getTestSymbol();

	LispObject getWeakness();

	LispObject get(LispObject key);

	void put(LispObject key, LispObject value);

	LispObject remove(LispObject key);

	LispObject ENTRIES();

	/** @returns A list of (key . value) pairs. */
	LispObject getEntries();

	LispObject MAPHASH(LispObject function);

}