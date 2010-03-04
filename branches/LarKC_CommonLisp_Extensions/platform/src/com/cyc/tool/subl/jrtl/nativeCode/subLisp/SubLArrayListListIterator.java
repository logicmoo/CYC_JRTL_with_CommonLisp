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
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.SubLException;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/**
 * @note this class is mostly copied from AbstractList.java, I needed to do this
 * because the ListIterator class waas defined as private and I needed a public version...
 * @author Tony Brusseau
 */
public final class SubLArrayListListIterator implements SubLListListIterator, ListIterator {
  
  SubLArrayListListIterator() {
  }
  
  SubLArrayListListIterator(SubLList list) {
    this(list, 0, list.size());
  }
  
  SubLArrayListListIterator(SubLList list, int start) {
    this(list, start, list.size());
  }
  
  SubLArrayListListIterator(SubLList list, int start, int end) {
    init(list, start, end);
  }
  
  void setList(SubLList list) {
    if ((list != null) && (!list.isArrayBased())) { 
      Errors.error("Can't create an array iterator for a cons list.");
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
  }
  
  void setEnd(int end) {
    if (list == null) { 
      end = 0;
    } else if ((end > list.size()) || (end == ITERATE_TO_END)) {
      this.end = list.size() + (((list != null) && (!list.isProper())) ? 1 : 0);
    } else {
      this.end = end;
    }
  }
  
  public final boolean isArrayBased() { return true; }
  
  public void reset() {
    cursor = 0;
    lastRet = -1;
    modCount = 0;
    expectedModCount = modCount; // @todo this is wrong -APB
    list = null;
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
  
  public boolean hasNext() {
    return cursor < end;
  }
  
  public void remove() {
    Errors.unimplementedMethod("SubLArrayListListIterator.remove()");
    /*if (lastRet == -1) {
      throw new IllegalStateException();
    }
    checkForComodification();
    
    try {
      list.remove(lastRet);
      if (lastRet < cursor) { cursor--; }
      lastRet = -1;
      expectedModCount = modCount;
    } catch(IndexOutOfBoundsException e) {
      throw new ConcurrentModificationException();
    }*/
  }
  
  public boolean isNextImproperElement() {
    return ((!list.isProper()) && (cursor >= list.size()));
  }
  
  public SubLObject getDottedElement() {
    return list.getDottedElement();
  }
  
  public Object next() {
    checkForComodification();
    try {
      Object next = list.get(cursor);
      lastRet = cursor++;
      return next;
    } catch(IndexOutOfBoundsException e) {
      checkForComodification();
      throw new NoSuchElementException();
    }
  }
  
  public SubLObject nextSubLObject() {
    return (SubLObject)next();
    /*if (isNextImproperElement()) {
      Errors.error("Got unexpected dotted list: " + list);
    }
    checkForComodification();
    try {
      SubLObject next = (SubLObject)list.get(cursor);
      lastRet = cursor++;
      return next;
    } catch(IndexOutOfBoundsException e) {
      checkForComodification();
      throw new NoSuchElementException();
    }*/
  }
  
  /*public SubLObject nextCdr() {
    checkForComodification();
    try {
      SubLObject next = list.nthCdr(cursor);
      lastRet = cursor++;
      return next;
    } catch(IndexOutOfBoundsException e) {
      checkForComodification();
      throw new NoSuchElementException();
    }
  }*/
  
  public boolean hasPrevious() {
    return cursor > start;
  }
  
  public Object previous() {
    checkForComodification();
    try {
      int i = cursor - 1;
      Object previous = list.get(i);
      lastRet = cursor = i;
      return previous;
    } catch(IndexOutOfBoundsException e) {
      checkForComodification();
      throw new NoSuchElementException();
    }
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
    checkForComodification();
    
    try {
      list.set(lastRet, (SubLObject)o);
      expectedModCount = modCount;
    } catch(IndexOutOfBoundsException e) {
      throw new ConcurrentModificationException();
    }
  }
  
  public void add(Object o) {
    Errors.unimplementedMethod("SubLArrayListListIterator.add()");
    /*checkForComodification();
    
    try {
      list = list.add(cursor++, o);
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
    return list.subSeq(cursor, end);
  }
  
  public int itemsRemaining() {
    return list.size() - cursor;
  }
  
  public SubLObject previousSubSeq() {
    if (lastRet < 0 ) {
      return SubLNil.NIL;
    }
    return list.subSeq(lastRet, end);
  }
  
  /**
   * Index of element to be returned by subsequent call to next.
   */
  private int cursor = 0;
  
  private int start = 0;
  
  /**
   * Index of element returned by most recent call to next or
   * previous.  Reset to -1 if this element is deleted by a call
   * to remove.
   */
  private int lastRet = -1;
  
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

