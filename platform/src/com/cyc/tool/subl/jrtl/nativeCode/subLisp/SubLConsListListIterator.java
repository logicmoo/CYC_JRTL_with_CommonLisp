//
// For LarKC
//
package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;

public class SubLConsListListIterator implements SubLListListIterator, ListIterator {
	SubLConsListListIterator() {
		cursor = 0;
		cursorCdr = null;
		start = 0;
		lastRet = -1;
		lastRetCdr = SubLNil.NIL;
		modCount = 0;
		expectedModCount = modCount;
		list = null;
		end = -1;
	}

	SubLConsListListIterator(SubLList list) {
		this(list, 0, list.size());
	}

	SubLConsListListIterator(SubLList list, int start) {
		this(list, start, list.size());
	}

	SubLConsListListIterator(SubLList list, int start, int end) {
		cursor = 0;
		cursorCdr = null;
		this.start = 0;
		lastRet = -1;
		lastRetCdr = SubLNil.NIL;
		modCount = 0;
		expectedModCount = modCount;
		this.list = null;
		this.end = -1;
		this.init(list, start, end);
	}

	private int cursor;
	private SubLObject cursorCdr;
	private int start;
	private int lastRet;
	private SubLObject lastRetCdr;
	private int modCount;
	private int expectedModCount;
	private SubLList list;
	private int end;

	@Override
	public void add(Object o) {
		Errors.error("Unimplemented.");
	}

	@Override
	public SubLObject currentSubSeq() {
		if (end == -1)
			return cursorCdr;
		return list.subSeq(cursor, end);
	}

	@Override
	public SubLObject getDottedElement() {
		if (cursorCdr.isList())
			Errors.error("Attempt to get dotted element from an iterator that isn't at the end of the list.");
		return cursorCdr;
	}

	@Override
	public boolean hasNext() {
		return (end == -1 || cursor < end) && cursorCdr != SubLNil.NIL;
	}

	@Override
	public boolean hasPrevious() {
		return cursor > start;
	}

	@Override
	public void init(SubLList list) {
		this.init(list, 0, -1);
	}

	@Override
	public void init(SubLList list, int start) {
		this.init(list, start, -1);
	}

	@Override
	public void init(SubLList list, int start, int end) {
		setList(list);
		setStart(start);
		setEnd(end);
	}

	@Override
	public boolean isArrayBased() {
		return false;
	}

	@Override
	public boolean isNextImproperElement() {
		return !cursorCdr.isList();
	}

	@Override
	public int itemsRemaining() {
		if (cursorCdr.isCons())
			return cursorCdr.size();
		return 0;
	}

	@Override
	public Object next() {
		if (!cursorCdr.isList())
			Errors.error("Got unexpected dotted list item: " + cursorCdr);
		SubLObject next = cursorCdr.first();
		lastRet = cursor++;
		lastRetCdr = cursorCdr;
		cursorCdr = cursorCdr.rest();
		return next;
	}

	@Override
	public int nextIndex() {
		return cursor;
	}

	@Override
	public SubLObject nextSubLObject() {
		if (!cursorCdr.isList())
			Errors.error("Got unexpected dotted list item: " + cursorCdr);
		SubLObject next = cursorCdr.first();
		lastRet = cursor++;
		lastRetCdr = cursorCdr;
		cursorCdr = cursorCdr.rest();
		return next;
	}

	@Override
	public Object previous() {
		return Errors.error("Can't iterate backwards on a cons list.");
	}

	@Override
	public int previousIndex() {
		return cursor - 1;
	}

	@Override
	public SubLObject previousSubSeq() {
		if (end == -1)
			return lastRetCdr;
		if (lastRet < 0)
			return SubLNil.NIL;
		return list.subSeq(lastRet, end);
	}

	@Override
	public void remove() {
		Errors.error("Unimplemented.");
	}

	@Override
	public void reset() {
		cursor = 0;
		lastRet = -1;
		modCount = 0;
		expectedModCount = modCount;
		list = null;
		cursorCdr = null;
		lastRetCdr = SubLNil.NIL;
		end = 0;
	}

	@Override
	public void set(Object o) {
		if (lastRet == -1)
			throw new IllegalStateException();
		lastRetCdr.setFirst((SubLObject) o);
	}

	void checkForComodification() {
		if (modCount != expectedModCount)
			throw new ConcurrentModificationException();
	}

	void setEnd(int end) {
		if (list == null)
			end = 0;
		else
			this.end = end;
	}

	void setList(SubLList list) {
		if (list != null && list.isArrayBased())
			Errors.error("Can't create a cons iterator for an array list.");
		this.list = list;
	}

	void setStart(int start) {
		if (start < 0)
			cursor = 0;
		else
			cursor = start;
		this.start = start;
		cursorCdr = list.nthCdr(start);
	}
}
