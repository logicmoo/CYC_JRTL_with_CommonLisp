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

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;

/**
 * @note this class is mostly copied from AbstractList.java, I needed to do this
 *       because the ListIterator class waas defined as private and I needed a
 *       public version...
 * @author Tony Brusseau
 */
public class SubLConsListListIterator implements SubLListListIterator, ListIterator {

	/**
	 * Index of element to be returned by subsequent call to next.
	 */
	private int cursor = 0;

	private SubLObject cursorCdr = null;

	private int start = 0;

	/**
	 * Index of element returned by most recent call to next or previous. Reset
	 * to -1 if this element is deleted by a call to remove.
	 */
	private int lastRet = -1;

	private SubLObject lastRetCdr = SubLNil.NIL;

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

	SubLConsListListIterator() {
	}

	SubLConsListListIterator(SubLList list) {
		this(list, 0, list.size());
	}

	SubLConsListListIterator(SubLList list, int start) {
		this(list, start, list.size());
	}

	SubLConsListListIterator(SubLList list, int start, int end) {
		this.init(list, start, end);
	}

	public void add(Object o) {
		Errors.error("Unimplemented.");
		// checkForComodification();
		/*
		 * try { list.add(cursor++, o); lastRet = -1; expectedModCount =
		 * modCount; } catch(IndexOutOfBoundsException e) { throw new
		 * ConcurrentModificationException(); }
		 */
	}

	void checkForComodification() {
		if (this.modCount != this.expectedModCount)
			throw new ConcurrentModificationException();
	}

	public SubLObject currentSubSeq() {
		if (this.end == SubLListListIterator.ITERATE_TO_END)
			return this.cursorCdr;
		return this.list.subSeq(this.cursor, this.end);
	}

	public SubLObject getDottedElement() {
		if (this.cursorCdr.isList())
			Errors.error("Attempt to get dotted element from an iterator that isn't at the end of the list.");
		return this.cursorCdr;
	}

	public boolean hasNext() {
		if (this.end != SubLListListIterator.ITERATE_TO_END && this.cursor >= this.end)
			return false;
		return this.cursorCdr != SubLNil.NIL;
	}

	public boolean hasPrevious() {
		return this.cursor > this.start;
	}

	public void init(SubLList list) {
		this.init(list, 0, SubLListListIterator.ITERATE_TO_END);
	}

	public void init(SubLList list, int start) {
		this.init(list, start, SubLListListIterator.ITERATE_TO_END);
	}

	public void init(SubLList list, int start, int end) {
		this.setList(list);
		this.setStart(start);
		this.setEnd(end);
	}

	public boolean isArrayBased() {
		return false;
	}

	public boolean isNextImproperElement() {
		return !this.cursorCdr.isList();
	}

	public int itemsRemaining() {
		if (this.cursorCdr.isCons())
			return this.cursorCdr.size();
		return 0;
	}

	public Object next() {
		// checkForComodification();
		if (!this.cursorCdr.isList())
			Errors.error("Got unexpected dotted list item: " + this.cursorCdr);
		SubLObject next = this.cursorCdr.first();
		this.lastRet = this.cursor++;
		this.lastRetCdr = this.cursorCdr;
		this.cursorCdr = this.cursorCdr.rest();
		return next;
	}

	public int nextIndex() {
		return this.cursor;
	}

	public SubLObject nextSubLObject() {
		// checkForComodification();
		if (!this.cursorCdr.isList())
			Errors.error("Got unexpected dotted list item: " + this.cursorCdr);
		SubLObject next = this.cursorCdr.first();
		this.lastRet = this.cursor++;
		this.lastRetCdr = this.cursorCdr;
		this.cursorCdr = this.cursorCdr.rest();
		return next;
	}

	public Object previous() {
		return Errors.error("Can't iterate backwards on a cons list.");
	}

	public int previousIndex() {
		return this.cursor - 1;
	}

	public SubLObject previousSubSeq() {
		if (this.end == SubLListListIterator.ITERATE_TO_END)
			return this.lastRetCdr;
		if (this.lastRet < 0)
			return SubLNil.NIL;
		return this.list.subSeq(this.lastRet, this.end);
	}

	public void remove() {
		Errors.error("Unimplemented.");
		/*
		 * if (lastRet == -1) { throw new IllegalStateException(); }
		 * //checkForComodification(); try { list.remove(lastRet); if (lastRet <
		 * cursor) { cursor--; } lastRet = -1; expectedModCount = modCount; }
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
		this.cursorCdr = null;
		this.lastRetCdr = SubLNil.NIL;
		this.end = 0;
	}

	public void set(Object o) {
		if (this.lastRet == -1)
			throw new IllegalStateException();
		// checkForComodification();
		this.lastRetCdr.setFirst((SubLObject) o);
		// expectedModCount = modCount;
	}

	void setEnd(int end) {
		if (this.list == null)
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
			this.cursor = 0;
		else
			this.cursor = start;
		this.start = start;
		this.cursorCdr = this.list.nthCdr(start);
	}
}
