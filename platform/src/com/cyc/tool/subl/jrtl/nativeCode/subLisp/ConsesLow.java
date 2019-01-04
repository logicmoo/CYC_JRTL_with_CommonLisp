//
// For LarKC
//
package com.cyc.tool.subl.jrtl.nativeCode.subLisp;

import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTrampolineFile;

public class ConsesLow extends SubLTrampolineFile {
	private static SubLObject appendArrayLists(SubLObject[] lists) {
		SubLList result = SubLNil.NIL;
		SubLListListIterator iter = null;
		Resourcer resourcer = Resourcer.getInstance();
		int lastIndex = lists.length - 1;
		for (int i = 0; i < lastIndex; ++i) {
			SubLObject list = lists[i].toList();
			if (list != SubLNil.NIL)
				try {
					iter = resourcer.acquireSubLListListIterator(list.toList());
					while (iter.hasNext() && !iter.isNextImproperElement()) {
						SubLObject item = iter.nextSubLObject();
						if (result == SubLNil.NIL)
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
		return result == SubLNil.NIL ? finalObject : result.setDottedElement(finalObject);
	}

	private static SubLObject appendConses(SubLObject[] lists) {
		SubLObject result = CommonSymbols.NIL, cur;
		SubLObject lastLast = null, curList;
		int lastIndex = lists.length - 1;
		for (int i = 0; i < lastIndex; i++) {
			cur = lists[i];
			if (cur != CommonSymbols.NIL) {
				if (!cur.isList()) {
					curList = (SubLObject) cur.clone();
					if (lastLast == null) {
						result = curList;
					} else {
						lastLast.setRest(curList);
					}
					System.err.println("Making improper list: " + lastLast);
					continue;
					//lastLast = curList.last(0);
				}
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
	public static SubLObject append() {
		return SubLNil.NIL;
	}

	public static SubLObject append(SubLObject list1) {
		return list1;
	}

	public static SubLObject append(SubLObject list1, SubLObject list2) {
		SubLObject[] args = SubLProcess.currentSubLThread().sublArraySize2;
		args[0] = list1;
		args[1] = list2;
		return append(args);
	}

	public static SubLObject append(SubLObject list1, SubLObject list2, SubLObject list3) {
		SubLObject[] args = SubLProcess.currentSubLThread().sublArraySize3;
		args[0] = list1;
		args[1] = list2;
		args[2] = list3;
		return append(args);
	}

	public static SubLObject append(SubLObject list1, SubLObject list2, SubLObject list3, SubLObject list4) {
		SubLObject[] args = SubLProcess.currentSubLThread().sublArraySize4;
		args[0] = list1;
		args[1] = list2;
		args[2] = list3;
		args[3] = list4;
		return append(args);
	}

	public static SubLObject append(SubLObject[] lists) {
		int listCount = lists.length;
		if (listCount == 0)
			return SubLNil.NIL;
		if (listCount == 1)
			return lists[0];
		return appendConses(lists);
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
		return SubLNil.NIL;
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
		return SubLObjectFactory.makeList(size.intValue(), SubLNil.NIL);
	}

	public static SubLList make_list(SubLObject size, SubLObject initialElement) {
		return SubLObjectFactory.makeList(size.intValue(),
				initialElement == CommonSymbols.UNPROVIDED ? SubLNil.NIL : initialElement);
	}

	public static SubLObject nconc() {
		return SubLNil.NIL;
	}

	public static SubLObject nconc(SubLObject list1) {
		return list1;
	}

	public static SubLObject nconc(SubLObject list1, SubLObject list2) {
		SubLObject[] args = SubLProcess.currentSubLThread().sublArraySize2;
		args[0] = list1;
		args[1] = list2;
		return nconc(args);
	}

	public static SubLObject nconc(SubLObject list1, SubLObject list2, SubLObject list3) {
		SubLObject[] args = SubLProcess.currentSubLThread().sublArraySize3;
		args[0] = list1;
		args[1] = list2;
		args[2] = list3;
		return nconc(args);
	}

	public static SubLObject nconc(SubLObject list1, SubLObject list2, SubLObject list3, SubLObject list4) {
		SubLObject[] args = SubLProcess.currentSubLThread().sublArraySize4;
		args[0] = list1;
		args[1] = list2;
		args[2] = list3;
		args[3] = list4;
		return nconc(args);
	}

	public static SubLObject nconc(SubLObject[] lists) {
		int listCount = lists.length;
		if (listCount == 0)
			return SubLNil.NIL;
		if (listCount == 1)
			return lists[0];
		SubLObject cur = SubLNil.NIL;
		SubLObject result = SubLNil.NIL;
		SubLObject lastLast = SubLNil.NIL;
		int consListSize = listCount - 1;
		for (int i = 0; i < listCount; ++i) {
			cur = lists[i];
			if (i < consListSize && cur != SubLNil.NIL)
				cur = cur.asConsList();
			if (result == SubLNil.NIL)
				result = cur;
			else
				lastLast.setRest(cur);
			if (i < consListSize && cur != SubLNil.NIL)
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

	public static SubLObject set_nth(SubLObject n, SubLObject list, SubLObject value) {
		SubLObject nthCons = list;
		int i = n.intValue() - 1;
		while (i-- >= 0)
			nthCons = nthCons.rest();
		nthCons.setFirst(value);
		return nthCons;
	}

	public static SubLFile me;
	static {
		me = new ConsesLow();
	}

	@Override
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

	@Override
	public void initializeVariables() {
	}

	@Override
	public void runTopLevelForms() {
	}
}
