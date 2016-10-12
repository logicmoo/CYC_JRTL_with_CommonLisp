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

import java.util.ListIterator;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;

/**
 * @author Tony Brusseau
 */
public interface SubLListListIterator extends ListIterator {

	public static int ITERATE_TO_END = -1;

	/* this may or may not share structure with the list being iterated over */
	public SubLObject currentSubSeq();

	/**
	 * this method may throw an exception if the iterator isn't at the end of
	 * the list
	 */
	public SubLObject getDottedElement();

	public void init(SubLList list);

	public void init(SubLList list, int start);

	public void init(SubLList list, int start, int end);

	public boolean isArrayBased();

	/**
	 * this method will throw an exception if the iterator isn't at the end of
	 * the list
	 */
	public boolean isNextImproperElement();

	public int itemsRemaining();

	public SubLObject nextSubLObject();

	/* this may or may not share structure with the list being iterated over */
	public SubLObject previousSubSeq();

	public void reset();

}
