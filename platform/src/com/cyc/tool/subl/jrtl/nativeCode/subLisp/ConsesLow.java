/***
 *   Copyright (c) 1995-2009 Cycorp Inc.
 *
 *   Licensed under the Apache License, Version 2.0 (the "License");
 *   you may not use this file except in compliance with the License.
 *   You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 *   Unless required by applicable law or agreed to in writing, software
 *   distributed under the License is distributed on an "AS IS" BASIS,
 *   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *   See the License for the specific language governing permissions and
 *   limitations under the License.
 *
 *  Substantial portions of this code were developed by the Cyc project
 *  and by Cycorp Inc, whose contribution is gratefully acknowledged.
*/

package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTrampolineFile;

//// Internal Imports

//// External Imports

/**
 * <P>
 * ConsesLow is designed to...
 *
 * <P>
 * Copyright (c) 2005 Cycorp, Inc. All rights reserved. <BR>
 * This software is the proprietary information of Cycorp, Inc.
 * <P>
 * Use is subject to license terms.
 *
 * @author goolsbey
 * @date March 13, 2006, 2:11 PM
 * @version $Id: ConsesLow.java 126640 2008-12-04 13:39:36Z builder $
 */

public class ConsesLow extends SubLTrampolineFile {
	//// Constructors

	public static SubLFile me = new ConsesLow();

	public static SubLObject append() {
		return CommonSymbols.NIL;
	}

	//// Public Area

	public static SubLObject append(SubLObject list1) {
		return list1;
	}

	public static SubLObject append(SubLObject list1, SubLObject list2) {
		SubLObject[] args = ((SubLThread) Thread.currentThread()).sublArraySize2;
		args[0] = list1;
		args[1] = list2;
		return ConsesLow.append(args);
	}

	public static SubLObject append(SubLObject list1, SubLObject list2, SubLObject list3) {
		SubLObject[] args = ((SubLThread) Thread.currentThread()).sublArraySize3;
		args[0] = list1;
		args[1] = list2;
		args[2] = list3;
		return ConsesLow.append(args);
	}

	public static SubLObject append(SubLObject list1, SubLObject list2, SubLObject list3, SubLObject list4) {
		SubLObject[] args = ((SubLThread) Thread.currentThread()).sublArraySize4;
		args[0] = list1;
		args[1] = list2;
		args[2] = list3;
		args[3] = list4;
		return ConsesLow.append(args);
	}

	public static SubLObject append(SubLObject[] lists) {
		int listCount = lists.length;
		if (listCount == 0)
			return CommonSymbols.NIL;
		if (listCount == 1)
			return lists[0];
		if (SubLObjectFactory.USE_ARRAY_LISTS)
			return ConsesLow.appendArrayLists(lists);
		else
			return ConsesLow.appendConses(lists);
	}

	private static SubLObject appendArrayLists(SubLObject[] lists) {
		SubLList result = CommonSymbols.NIL;
		SubLListListIterator iter = null;
		Resourcer resourcer = Resourcer.getInstance();
		int lastIndex = lists.length - 1;
		for (int i = 0; i < lastIndex; i++) {
			SubLObject list = lists[i].toList();
			if (list == CommonSymbols.NIL)
				continue;
			try {
				iter = resourcer.acquireSubLListListIterator(list.toList());
				while (iter.hasNext() && !iter.isNextImproperElement()) {
					SubLObject item = iter.nextSubLObject();
					if (result == CommonSymbols.NIL)
						result = SubLObjectFactory.makeList(1, item);
					else
						result.add(item);
				}
				if (iter.isNextImproperElement())
					result.setDottedElement(iter.getDottedElement());
			} finally {
				resourcer.releaseSubLListListIterator(iter);
			}
		}
		SubLObject finalObject = lists[lastIndex];
		return result == CommonSymbols.NIL ? finalObject : result.setDottedElement(finalObject);
	}

	private static SubLObject appendConses(SubLObject[] lists) {
		SubLObject result = CommonSymbols.NIL, cur;
		SubLObject lastLast = null, curList;
		int lastIndex = lists.length - 1;
		for (int i = 0; i < lastIndex; i++) {
			cur = lists[i];
			if (cur != CommonSymbols.NIL) {
				curList = (SubLObject) cur.asConsList().clone();
				if (lastLast == null)
					result = curList;
				else
					lastLast.setRest(curList);
				lastLast = curList.last(1);
			}
		}
		if (result == CommonSymbols.NIL)
			return lists[lastIndex];
		else {
			lastLast.setRest(lists[lastIndex]);
			return result;
		}
	}

	public static SubLObject car(SubLObject cons) {
		return cons.first();
	}

	public static SubLObject cdr(SubLObject cons) {
		return cons.rest();
	}

	public static SubLCons cons(SubLObject car, SubLObject cdr) {
		return SubLObjectFactory.makeCons(car, cdr);
	}

	public static SubLList list() {
		return CommonSymbols.NIL;
	}

	public static SubLList list(SubLObject object1) {
		return SubLObjectFactory.makeList(1, object1);
	}

	public static SubLList list(SubLObject object1, SubLObject object2) {
		return SubLObjectFactory.makeList(1, object2).push(object1);
	}

	public static SubLList list(SubLObject object1, SubLObject object2, SubLObject object3) {
		return SubLObjectFactory.makeList(1, object3).push(object2).push(object1);
	}

	public static SubLList list(SubLObject object1, SubLObject object2, SubLObject object3, SubLObject object4) {
		return SubLObjectFactory.makeList(1, object4).push(object3).push(object2).push(object1);
	}

	public static SubLList list(SubLObject object1, SubLObject object2, SubLObject object3, SubLObject object4,
			SubLObject object5) {
		return SubLObjectFactory.makeList(1, object5).push(object4).push(object3).push(object2).push(object1);
	}

	public static SubLList list(SubLObject object1, SubLObject object2, SubLObject object3, SubLObject object4,
			SubLObject object5, SubLObject object6) {
		return SubLObjectFactory.makeList(1, object6).push(object5).push(object4).push(object3).push(object2)
				.push(object1);
	}

	public static SubLList list(SubLObject object1, SubLObject object2, SubLObject object3, SubLObject object4,
			SubLObject object5, SubLObject object6, SubLObject object7) {
		return SubLObjectFactory.makeList(1, object7).push(object6).push(object5).push(object4).push(object3)
				.push(object2).push(object1);
	}

	public static SubLList list(SubLObject object1, SubLObject object2, SubLObject object3, SubLObject object4,
			SubLObject object5, SubLObject object6, SubLObject object7, SubLObject object8) {
		return SubLObjectFactory.makeList(1, object8).push(object7).push(object6).push(object5).push(object4)
				.push(object3).push(object2).push(object1);
	}

	public static SubLList list(SubLObject[] objects) {
		return SubLObjectFactory.makeList(objects);
	}

	public static SubLObject listS(SubLObject finalCdr) {
		return SubLObjectFactory.makeListS(finalCdr);
	}

	public static SubLList listS(SubLObject arg1, SubLObject finalCdr) {
		return SubLObjectFactory.makeListS(arg1, finalCdr);
	}

	public static SubLList listS(SubLObject arg1, SubLObject arg2, SubLObject finalCdr) {
		return SubLObjectFactory.makeListS(arg1, arg2, finalCdr);
	}

	public static SubLList listS(SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject finalCdr) {
		return SubLObjectFactory.makeListS(arg1, arg2, arg3, finalCdr);
	}

	public static SubLList listS(SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4,
			SubLObject finalCdr) {
		return SubLObjectFactory.makeListS(arg1, arg2, arg3, arg4, finalCdr);
	}

	public static SubLList listS(SubLObject arg1, SubLObject arg2, SubLObject arg3, SubLObject arg4, SubLObject arg5,
			SubLObject finalCdr) {
		return SubLObjectFactory.makeListS(arg1, arg2, arg3, arg4, arg5, finalCdr);
	}

	public static SubLList listS(SubLObject arg, SubLObject[] objects) {
		return SubLObjectFactory.makeListS(arg, objects);
	}

	public static SubLList make_list(SubLObject size) {
		return SubLObjectFactory.makeList(size.intValue(), CommonSymbols.NIL);
	}

	public static SubLList make_list(SubLObject size, SubLObject initialElement) {
		return SubLObjectFactory.makeList(size.intValue(),
				initialElement == CommonSymbols.UNPROVIDED ? CommonSymbols.NIL : initialElement);
	}

	public static SubLObject nconc() {
		return CommonSymbols.NIL;
	}

	public static SubLObject nconc(SubLObject list1) {
		return list1;
	}

	public static SubLObject nconc(SubLObject list1, SubLObject list2) {
		SubLObject[] args = ((SubLThread) Thread.currentThread()).sublArraySize2;
		args[0] = list1;
		args[1] = list2;
		return ConsesLow.nconc(args);
	}

	public static SubLObject nconc(SubLObject list1, SubLObject list2, SubLObject list3) {
		SubLObject[] args = ((SubLThread) Thread.currentThread()).sublArraySize3;
		args[0] = list1;
		args[1] = list2;
		args[2] = list3;
		return ConsesLow.nconc(args);
	}

	public static SubLObject nconc(SubLObject list1, SubLObject list2, SubLObject list3, SubLObject list4) {
		SubLObject[] args = ((SubLThread) Thread.currentThread()).sublArraySize4;
		args[0] = list1;
		args[1] = list2;
		args[2] = list3;
		args[3] = list4;
		return ConsesLow.nconc(args);
	}

	public static SubLObject nconc(SubLObject[] lists) {
		int listCount = lists.length;
		if (listCount == 0)
			return CommonSymbols.NIL;
		if (listCount == 1)
			return lists[0];
		SubLObject cur = CommonSymbols.NIL, result = CommonSymbols.NIL, lastLast = CommonSymbols.NIL;
		int consListSize = listCount - 1;
		for (int i = 0; i < listCount; i++) {
			cur = lists[i];
			if (i < consListSize && cur != CommonSymbols.NIL)
				cur = cur.asConsList();
			if (result == CommonSymbols.NIL)
				result = cur;
			else
				lastLast.setRest(cur);
			if (i < consListSize && cur != CommonSymbols.NIL)
				lastLast = cur.last(1);
		}
		return result;
	}

	public static SubLObject nth(SubLObject n, SubLObject list) {
		return list.get(n.intValue());
	}

	public static SubLObject rplaca(SubLObject cons, SubLObject newcar) {
		return cons.setFirst(newcar);
	}

	public static SubLObject rplacd(SubLObject cons, SubLObject newcdr) {
		return cons.setRest(newcdr);
	}

	//// PrivateArea

	public static SubLObject set_nth(SubLObject n, SubLObject list, SubLObject value) {
		SubLObject nthCons = list;
		for (int i = n.intValue() - 1; i-- >= 0;)
			nthCons = nthCons.rest();
		nthCons.setFirst(value);
		return nthCons;
	}

	/** Creates a new instance of ConsesLow. */

	public ConsesLow() {
	}

	/*
	 * public static SubLObject last(SubLObject list, SubLObject n) { if ((n ==
	 * UNPROVIDED)) { n = ONE_INTEGER; } if ((NIL ==
	 * Errors.$ignore_mustsP$.getDynamicValue())) { if ((NIL !=
	 * Numbers.minusp(n))) {
	 * Errors.error($str10$LAST_called_with_negative_index_o, n); } } if ((NIL
	 * != Types.sublisp_null(list))) { return NIL; } else { { SubLObject
	 * seeker_start = list; SubLObject circular_seeker = NIL; SubLObject i =
	 * NIL; for (i = ZERO_INTEGER; (NIL != Numbers.numL(i, n)); i =
	 * Numbers.add(i, ONE_INTEGER)) { if ((NIL == Types.consp(seeker_start))) {
	 * return list; } seeker_start = ConsesLow.cdr(seeker_start); }
	 * circular_seeker = seeker_start; { SubLObject seeker = NIL; SubLObject
	 * back = NIL; for (seeker = seeker_start, back = list; (NIL !=
	 * Types.consp(seeker)); seeker = ConsesLow.cdr(seeker), back =
	 * ConsesLow.cdr(back)) { if ((NIL != Types.consp(circular_seeker))) {
	 * circular_seeker = ConsesLow.cdr(circular_seeker); if ((NIL !=
	 * Types.consp(circular_seeker))) { circular_seeker =
	 * ConsesLow.cdr(circular_seeker); if ((NIL ==
	 * Errors.$ignore_mustsP$.getDynamicValue())) { if ((circular_seeker ==
	 * back)) { Errors.error($str11$LAST_called_on_circular_list); } } } } }
	 * return back; } } } }
	 */

	//// Initializers

	public void declareFunctions() {
		SubLFiles.declareFunction(ConsesLow.me, "cons", "CONS", 2, 0, false);

		SubLFiles.declareFunction(ConsesLow.me, "car", "CAR", 1, 0, false);
		SubLFiles.declareFunction(ConsesLow.me, "cdr", "CDR", 1, 0, false);

		SubLFiles.declareFunction(ConsesLow.me, "rplaca", "RPLACA", 2, 0, false);
		SubLFiles.declareFunction(ConsesLow.me, "rplacd", "RPLACD", 2, 0, false);

		SubLFiles.declareFunction(ConsesLow.me, "list", "LIST", 0, 0, true);
		SubLFiles.declareFunction(ConsesLow.me, "listS", "LIST*", 1, 0, true);
		SubLFiles.declareFunction(ConsesLow.me, "make_list", "MAKE-LIST", 1, 1, false);

		SubLFiles.declareFunction(ConsesLow.me, "nth", "NTH", 2, 0, false);
		SubLFiles.declareFunction(ConsesLow.me, "set_nth", "SET-NTH", 3, 0, false);

		SubLFiles.declareFunction(ConsesLow.me, "append", "APPEND", 0, 0, true);
		SubLFiles.declareFunction(ConsesLow.me, "nconc", "NCONC", 0, 0, true);
	}

	public void initializeVariables() {
	}

	public void runTopLevelForms() {
	}

	//// Protected Area

	//// Private Area

	//// Internal Rep

	//// Main

}
