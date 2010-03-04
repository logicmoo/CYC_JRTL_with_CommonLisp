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

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;

/**
 * @note this class is mostly copied from AbstractList.java, I needed to do this
 * because the ListIterator class waas defined as private and I needed a public version...
 * @author Tony Brusseau
 */
public final class SubLConsListListIterator implements SubLListListIterator, ListIterator {
  
  SubLConsListListIterator() {
  }
  
  SubLConsListListIterator(SubLList list) {
    this(list, 0, list.size());
  }
  
  SubLConsListListIterator(SubLList list, int start) {
    this(list, start, list.size());
  }
  
  SubLConsListListIterator(SubLList list, int start, int end) {
    init(list, start, end);
  }
  
  void setList(SubLList list) {
    if ((list != null) && (list.isArrayBased())) { 
      Errors.error("Can't create a cons iterator for an array list.");
    }
    this.list = list;
  }
  
  void setStart(int start) {
    if (start < 0)  {
      this.cursor = 0;
    } else {
      this.cursor = start;
    }
    this.start = start;
    cursorCdr = list.nthCdr(start);
  }
  
  void setEnd(int end) {
    if (list == null) { 
      end = 0;
    } else {
      this.end = end;
    }
  }
  
  public void reset() {
    cursor = 0;
    lastRet = -1;
    modCount = 0;
    expectedModCount = modCount; // @todo this is wrong -APB
    list = null;
    cursorCdr = null;
    lastRetCdr = SubLNil.NIL;
    end = 0;
  }
  
  public void init(SubLList list) {
    init(list, 0, ITERATE_TO_END);
  }
  
  public void init(SubLList list, int start) {
    init(list, start, ITERATE_TO_END);
  }
  
  public void init(SubLList list, int start, int end) {
    setList(list);
    setStart(start);
    setEnd(end);
  }
  
  
  public final boolean isArrayBased() { return false; }
  
  public boolean hasNext() {
    if ((end != ITERATE_TO_END) && (cursor >= end)) { 
      return false;
    }
    return (cursorCdr != SubLNil.NIL);
  }
  
  public Object next() {
    //checkForComodification();
    if (!cursorCdr.isList()) {
      Errors.error("Got unexpected dotted list item: " + cursorCdr);
    }
    SubLObject next = cursorCdr.first();
    lastRet = cursor++;
    lastRetCdr = cursorCdr;
    cursorCdr = cursorCdr.rest();
    return next;
  }
  
  public SubLObject nextSubLObject() {
    //checkForComodification();
    if (!cursorCdr.isList()) {
      Errors.error("Got unexpected dotted list item: " + cursorCdr);
    }
    SubLObject next = cursorCdr.first();
    lastRet = cursor++;
    lastRetCdr = cursorCdr;
    cursorCdr = cursorCdr.rest();
    return next;
  }
  
  public boolean isNextImproperElement() {
    return !cursorCdr.isList();
  }
  
  public SubLObject getDottedElement() {
    if (cursorCdr.isList()) {
      Errors.error("Attempt to get dotted element from an iterator that isn't at the end of the list.");
    }
    return cursorCdr;
  }
  
  public void remove() {
    Errors.error("Unimplemented.");
    /*if (lastRet == -1) {
      throw new IllegalStateException();
    }
    //checkForComodification();
    try {
      list.remove(lastRet);
      if (lastRet < cursor) { cursor--; }
      lastRet = -1;
      expectedModCount = modCount;
    } catch(IndexOutOfBoundsException e) {
      throw new ConcurrentModificationException();
    }*/
  }
  
  public int itemsRemaining() {
    if (cursorCdr.isCons()) {
      return cursorCdr.size();
    }
    return 0;
  }
  
  public boolean hasPrevious() {
    return cursor > start;
  }
  
  public Object previous() {
    return Errors.error("Can't iterate backwards on a cons list.");
  }
  
  public int nextIndex() {
    return cursor;
  }
  
  public int previousIndex() {
    return cursor-1;
  }
  
  public void set(Object o) {
    if (lastRet == -1) {
      throw new IllegalStateException();
    }
    //checkForComodification();
    lastRetCdr.setFirst((SubLObject)o);
    //expectedModCount = modCount;
  }
  
  public void add(Object o) {
    Errors.error("Unimplemented.");
    //checkForComodification();
    /*try {
      list.add(cursor++, o);
      lastRet = -1;
      expectedModCount = modCount;
    } catch(IndexOutOfBoundsException e) {
      throw new ConcurrentModificationException();
    }*/
  }
  
  void checkForComodification() {
    if (modCount != expectedModCount) {
      throw new ConcurrentModificationException();
    }
  }
  
  
  public SubLObject currentSubSeq() {
    if (end == ITERATE_TO_END) {
      return cursorCdr;
    }
    return list.subSeq(cursor, end);
  }
  
  public SubLObject previousSubSeq() {
    if (end == ITERATE_TO_END) {
      return lastRetCdr;
    }
    if (lastRet < 0 ) {
      return SubLNil.NIL;
    }
    return list.subSeq(lastRet, end);
  }
  
  /**
   * Index of element to be returned by subsequent call to next.
   */
  private int cursor = 0;
  
  private SubLObject cursorCdr = null;
  
  private int start = 0;
  
  /**
   * Index of element returned by most recent call to next or
   * previous.  Reset to -1 if this element is deleted by a call
   * to remove.
   */
  private int lastRet = -1;
  private SubLObject lastRetCdr = SubLNil.NIL;
  
  private int modCount = 0; // list.modCount; @todo remove this and use modCount from actual list -APB
  
  /**
   * The modCount value that the iterator believes that the backing
   * List should have.  If this expectation is violated, the iterator
   * has detected concurrent modification.
   */
  private int expectedModCount = modCount;
  
  private SubLList list = null;
  
  private int end = ITERATE_TO_END;
}

