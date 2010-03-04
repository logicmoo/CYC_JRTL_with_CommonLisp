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

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLArrayList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.exception.SubLException;
import java.util.ConcurrentModificationException;
import java.util.ListIterator;
import java.util.NoSuchElementException;

/**
 * @author Tony Brusseau
 */
public interface SubLListListIterator extends ListIterator {
  
  public SubLObject nextSubLObject();
  
  /** this method may throw an exception if the iterator isn't at the end of the list */
  public SubLObject getDottedElement();
  
  /** this method will throw an exception if the iterator isn't at the end of the list */
  public boolean isNextImproperElement();
  
  public int itemsRemaining();
  
  public void reset(); 
  
  public void init(SubLList list);
  
  public void init(SubLList list, int start);
  
  public void init(SubLList list, int start, int end);
  
  public boolean isArrayBased();
  
  /* this may or may not share structure with the list being iterated over */
  public SubLObject currentSubSeq();
  
  /* this may or may not share structure with the list being iterated over */
  public SubLObject previousSubSeq();
  
  public static final int ITERATE_TO_END = -1;
  
}

