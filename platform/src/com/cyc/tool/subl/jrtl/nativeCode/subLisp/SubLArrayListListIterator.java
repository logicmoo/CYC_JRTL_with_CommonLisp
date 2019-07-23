/* For LarKC */
package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;

public class SubLArrayListListIterator implements SubLListListIterator, ListIterator {
	SubLArrayListListIterator() {
		cursor = 0;
		start = 0;
		lastRet = -1;
		modCount = 0;
		expectedModCount = modCount;
		list = null;
		end = -1;
	}

	SubLArrayListListIterator(SubLList list) {
		this(list, 0, list.size());
	}

	SubLArrayListListIterator(SubLList list, int start) {
		this(list, start, list.size());
	}

	SubLArrayListListIterator(SubLList list, int start, int end) {
		cursor = 0;
		this.start = 0;
		lastRet = -1;
		modCount = 0;
		expectedModCount = modCount;
		this.list = null;
		this.end = -1;
		this.init(list, start, end);
	}

	private int cursor;
	private int start;
	private int lastRet;
	private int modCount;
	private int expectedModCount;
	private SubLList list;
	private int end;

	@Override
	public void add(Object o) {
		Errors.unimplementedMethod("SubLArrayListListIterator.add()");
	}

	@Override
	public SubLObject currentSubSeq() {
		return list.subSeq(cursor, end);
	}

	@Override
	public SubLObject getDottedElement() {
		return list.getDottedElement();
	}

	@Override
	public boolean hasNext() {
		return cursor < end;
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
		return true;
	}

	@Override
	public boolean isNextImproperElement() {
		return !list.isProper() && cursor >= list.size();
	}

	@Override
	public int itemsRemaining() {
		return list.size() - cursor;
	}

	@Override
	public Object next() {
		checkForComodification();
		try {
			Object next = list.get(cursor);
			lastRet = cursor++;
			return next;
		} catch (IndexOutOfBoundsException e) {
			checkForComodification();
			throw new NoSuchElementException();
		}
	}

	@Override
	public int nextIndex() {
		return cursor;
	}

	@Override
	public SubLObject nextSubLObject() {
		return (SubLObject) next();
	}

	@Override
	public Object previous() {
		checkForComodification();
		try {
			int i = cursor - 1;
			Object previous = list.get(i);
			int n = i;
			cursor = n;
			lastRet = n;
			return previous;
		} catch (IndexOutOfBoundsException e) {
			checkForComodification();
			throw new NoSuchElementException();
		}
	}

	@Override
	public int previousIndex() {
		return cursor - 1;
	}

	@Override
	public SubLObject previousSubSeq() {
		if (lastRet < 0)
			return SubLNil.NIL;
		return list.subSeq(lastRet, end);
	}

	@Override
	public void remove() {
		Errors.unimplementedMethod("SubLArrayListListIterator.remove()");
	}

	@Override
	public void reset() {
		cursor = 0;
		lastRet = -1;
		modCount = 0;
		expectedModCount = modCount;
		list = null;
		end = 0;
	}

	@Override
	public void set(Object o) {
		if (lastRet == -1)
			throw new IllegalStateException();
		checkForComodification();
		try {
			list.set(lastRet, (SubLObject) o);
			expectedModCount = modCount;
		} catch (IndexOutOfBoundsException e) {
			throw new ConcurrentModificationException();
		}
	}

	void checkForComodification() {
		if (modCount != expectedModCount)
			throw new ConcurrentModificationException();
	}

	void setEnd(int end) {
		if (list == null)
			end = 0;
		else if (end > list.size() || end == -1)
			this.end = list.size() + (list != null && !list.isProper() ? 1 : 0);
		else
			this.end = end;
	}

	void setList(SubLList list) {
		if (list != null && !list.isArrayBased())
			Errors.error("Can't create an array iterator for a cons list.");
		this.list = list;
	}

	void setStart(int start) {
		if (start < 0)
			cursor = 0;
		else
			cursor = start;
		this.start = start;
	}
}
