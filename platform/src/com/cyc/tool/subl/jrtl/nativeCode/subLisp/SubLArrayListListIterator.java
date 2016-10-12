/*
 * SubLListIterator.java
 *
 * Created on January 15, 2006, 12:36 AM
 *
 * To change this template, choose Tools | Options and locate the template under
 * the Source Creation and Management node. Right-click the template and choose
 * Open. You can then make changes to the template in the Source Editor.
 */

package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;

/**
 * @note this class is mostly copied from AbstractList.java, I needed to do this
 *       because the ListIterator class waas defined as private and I needed a
 *       public version...
 * @author Tony Brusseau
 */
public class SubLArrayListListIterator implements SubLListListIterator, ListIterator {

	/**
	 * Index of element to be returned by subsequent call to next.
	 */
	private int cursor = 0;

	private int start = 0;

	/**
	 * Index of element returned by most recent call to next or previous. Reset
	 * to -1 if this element is deleted by a call to remove.
	 */
	private int lastRet = -1;

	private int modCount = 0; // list.modCount; @todo remove this and use
								// modCount from actual list -APB

	/**
	 * The modCount value that the iterator believes that the backing List
	 * should have. If this expectation is violated, the iterator has detected
	 * concurrent modification.
	 */
	private int expectedModCount = this.modCount;

	private SubLList list = null;

	private int end = SubLListListIterator.ITERATE_TO_END;

	SubLArrayListListIterator() {
	}

	SubLArrayListListIterator(SubLList list) {
		this(list, 0, list.size());
	}

	SubLArrayListListIterator(SubLList list, int start) {
		this(list, start, list.size());
	}

	SubLArrayListListIterator(SubLList list, int start, int end) {
		this.init(list, start, end);
	}

	public void add(Object o) {
		Errors.unimplementedMethod("SubLArrayListListIterator.add()");
		/*
		 * checkForComodification();
		 *
		 * try { list = list.add(cursor++, o); lastRet = -1; expectedModCount =
		 * modCount; } catch(IndexOutOfBoundsException e) { throw new
		 * ConcurrentModificationException(); }
		 */
	}

	void checkForComodification() {
		if (this.modCount != this.expectedModCount)
			throw new ConcurrentModificationException();
	}

	public SubLObject currentSubSeq() {
		return this.list.subSeq(this.cursor, this.end);
	}

	public SubLObject getDottedElement() {
		return this.list.getDottedElement();
	}

	public boolean hasNext() {
		return this.cursor < this.end;
	}

	public boolean hasPrevious() {
		return this.cursor > this.start;
	}

	public void init(SubLList list) {
		this.init(list, 0, SubLListListIterator.ITERATE_TO_END);
	}

	/*
	 * public SubLObject nextCdr() { checkForComodification(); try { SubLObject
	 * next = list.nthCdr(cursor); lastRet = cursor++; return next; }
	 * catch(IndexOutOfBoundsException e) { checkForComodification(); throw new
	 * NoSuchElementException(); } }
	 */

	public void init(SubLList list, int start) {
		this.init(list, start, SubLListListIterator.ITERATE_TO_END);
	}

	public void init(SubLList list, int start, int end) {
		this.setList(list);
		this.setStart(start);
		this.setEnd(end);
	}

	public boolean isArrayBased() {
		return true;
	}

	public boolean isNextImproperElement() {
		return !this.list.isProper() && this.cursor >= this.list.size();
	}

	public int itemsRemaining() {
		return this.list.size() - this.cursor;
	}

	public Object next() {
		this.checkForComodification();
		try {
			Object next = this.list.get(this.cursor);
			this.lastRet = this.cursor++;
			return next;
		} catch (IndexOutOfBoundsException e) {
			this.checkForComodification();
			throw new NoSuchElementException();
		}
	}

	public int nextIndex() {
		return this.cursor;
	}

	public SubLObject nextSubLObject() {
		return (SubLObject) this.next();
		/*
		 * if (isNextImproperElement()) {
		 * Errors.error("Got unexpected dotted list: " + list); }
		 * checkForComodification(); try { SubLObject next =
		 * (SubLObject)list.get(cursor); lastRet = cursor++; return next; }
		 * catch(IndexOutOfBoundsException e) { checkForComodification(); throw
		 * new NoSuchElementException(); }
		 */
	}

	public Object previous() {
		this.checkForComodification();
		try {
			int i = this.cursor - 1;
			Object previous = this.list.get(i);
			this.lastRet = this.cursor = i;
			return previous;
		} catch (IndexOutOfBoundsException e) {
			this.checkForComodification();
			throw new NoSuchElementException();
		}
	}

	public int previousIndex() {
		return this.cursor - 1;
	}

	public SubLObject previousSubSeq() {
		if (this.lastRet < 0)
			return SubLNil.NIL;
		return this.list.subSeq(this.lastRet, this.end);
	}

	public void remove() {
		Errors.unimplementedMethod("SubLArrayListListIterator.remove()");
		/*
		 * if (lastRet == -1) { throw new IllegalStateException(); }
		 * checkForComodification();
		 *
		 * try { list.remove(lastRet); if (lastRet < cursor) { cursor--; }
		 * lastRet = -1; expectedModCount = modCount; }
		 * catch(IndexOutOfBoundsException e) { throw new
		 * ConcurrentModificationException(); }
		 */
	}

	public void reset() {
		this.cursor = 0;
		this.lastRet = -1;
		this.modCount = 0;
		this.expectedModCount = this.modCount; // @todo this is wrong -APB
		this.list = null;
		this.end = 0;
	}

	public void set(Object o) {
		if (this.lastRet == -1)
			throw new IllegalStateException();
		this.checkForComodification();

		try {
			this.list.set(this.lastRet, (SubLObject) o);
			this.expectedModCount = this.modCount;
		} catch (IndexOutOfBoundsException e) {
			throw new ConcurrentModificationException();
		}
	}

	void setEnd(int end) {
		if (this.list == null)
			end = 0;
		else if (end > this.list.size() || end == SubLListListIterator.ITERATE_TO_END)
			this.end = this.list.size() + (this.list != null && !this.list.isProper() ? 1 : 0);
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
			this.cursor = 0;
		else
			this.cursor = start;
		this.start = start;
	}
}
