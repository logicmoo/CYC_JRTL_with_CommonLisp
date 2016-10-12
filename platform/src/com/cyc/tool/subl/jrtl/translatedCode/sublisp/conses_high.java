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

package com.cyc.tool.subl.jrtl.translatedCode.sublisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class conses_high extends SubLTranslatedFile {

	//// Constructor

	public static class $union$BinaryFunction extends BinaryFunction {
		public $union$BinaryFunction() {
			super(SubLTranslatedFile.extractFunctionNamed("UNION"));
		}

		public SubLObject processItem(SubLObject arg1, SubLObject arg2) {
			return conses_high.union(arg1, arg2, CommonSymbols.UNPROVIDED, CommonSymbols.UNPROVIDED);
		}
	}

	public static SubLFile me = new conses_high();
	public static String myName = "com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high";

	//// Definitions

	/**
	 * Above this length, sublis will call copy-list and then use an iterative
	 * algorithm. This may be consier but it will be iterative instead of
	 * recursive, to avoid a stack overflow.
	 *
	 * @see bug 18429
	 */
	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLSymbol $sublis_watermark$ = null;

	public static SubLSymbol $sym0$LISTP = SubLObjectFactory.makeSymbol("LISTP");

	public static SubLSymbol $sym1$FUNCTION_SPEC_P = SubLObjectFactory.makeSymbol("FUNCTION-SPEC-P");

	public static SubLSymbol $sym2$FIXNUMP = SubLObjectFactory.makeSymbol("FIXNUMP");

	public static SubLString $str3$_S_must_be_a_non_negative_integer = SubLObjectFactory
			.makeString("~S must be a non-negative integer");

	public static SubLString $str4$COPY_LIST_called_on_a_circular_li = SubLObjectFactory
			.makeString("COPY-LIST called on a circular list");

	public static SubLString $str5$COPY_ALIST_called_on_a_circular_l = SubLObjectFactory
			.makeString("COPY-ALIST called on a circular list");

	public static SubLString $str6$COPY_TREE_called_on_a_circular_li = SubLObjectFactory
			.makeString("COPY-TREE called on a circular list");

	public static SubLInteger $int7$68 = SubLObjectFactory.makeInteger(68);

	public static SubLString $str8$PAIRLIS_was_called_with_lists_of_ = SubLObjectFactory
			.makeString("PAIRLIS was called with lists of different lengths");

	public static SubLString $str9$LAST_called_with_negative_index_o = SubLObjectFactory
			.makeString("LAST called with negative index of ~S");

	public static SubLString $str10$LAST_called_on_circular_list = SubLObjectFactory
			.makeString("LAST called on circular list");

	public static SubLString $str11$NBUTLAST_called_with_negative_ind = SubLObjectFactory
			.makeString("NBUTLAST called with negative index of ~S");

	public static SubLString $str12$NBUTLAST_called_on_circular_list = SubLObjectFactory
			.makeString("NBUTLAST called on circular list");

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject _assoc_2(SubLObject item, SubLObject alist) {
		{
			SubLObject rest = CommonSymbols.NIL;
			SubLObject entry = CommonSymbols.NIL;
			for (rest = alist, entry = rest.first(); CommonSymbols.NIL != rest; rest = rest.rest(), entry = rest
					.first())
				if (CommonSymbols.NIL != entry)
					if (item.eql(entry.first()))
						return entry;
			return CommonSymbols.NIL;
		}
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject _assoc_3(SubLObject item, SubLObject alist, SubLObject test) {
		{
			SubLObject rest = CommonSymbols.NIL;
			SubLObject entry = CommonSymbols.NIL;
			for (rest = alist, entry = rest.first(); CommonSymbols.NIL != rest; rest = rest.rest(), entry = rest
					.first())
				if (CommonSymbols.NIL != entry)
					if (CommonSymbols.NIL != Functions.funcall(test, item, entry.first()))
						return entry;
			return CommonSymbols.NIL;
		}
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject _assoc_4(SubLObject item, SubLObject alist, SubLObject test, SubLObject key) {
		{
			SubLObject rest = CommonSymbols.NIL;
			SubLObject entry = CommonSymbols.NIL;
			for (rest = alist, entry = rest.first(); CommonSymbols.NIL != rest; rest = rest.rest(), entry = rest
					.first())
				if (CommonSymbols.NIL != entry)
					if (CommonSymbols.NIL != Functions.funcall(test, item, Functions.funcall(key, entry.first())))
						return entry;
			return CommonSymbols.NIL;
		}
	}

	/**
	 * Return the number of cons cells required to implement LIST, or NIL if
	 * circular
	 */
	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject _cons_length(SubLObject list) {
		SubLTrampolineFile.checkType(list, conses_high.$sym0$LISTP);
		if (CommonSymbols.NIL == list)
			return CommonSymbols.ZERO_INTEGER;
		else if (list.rest().isAtom())
			return CommonSymbols.ONE_INTEGER;
		{
			SubLObject slow = CommonSymbols.NIL;
			SubLObject fast = CommonSymbols.NIL;
			SubLObject length = CommonSymbols.NIL;
			for (slow = list.rest(), fast = conses_high.cddr(
					list), length = CommonSymbols.TWO_INTEGER; fast != slow; slow = slow.rest(), fast = conses_high
							.cddr(fast), length = Numbers.add(CommonSymbols.TWO_INTEGER, length))
				if (fast.isAtom())
					return length;
				else if (fast.rest().isAtom())
					return Numbers.add(CommonSymbols.ONE_INTEGER, length);
			return CommonSymbols.NIL;
		}
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject _intersection_2(SubLObject list1, SubLObject list2) {
		{
			SubLObject answer = CommonSymbols.NIL;
			SubLObject cdolist_list_var = list1;
			SubLObject item = CommonSymbols.NIL;
			for (item = cdolist_list_var
					.first(); CommonSymbols.NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var
							.rest(), item = cdolist_list_var.first())
				if (CommonSymbols.NIL != conses_high._member_2(item, list2))
					answer = ConsesLow.cons(item, answer);
			return answer;
		}
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject _intersection_3(SubLObject list1, SubLObject list2, SubLObject test) {
		{
			SubLObject answer = CommonSymbols.NIL;
			SubLObject cdolist_list_var = list1;
			SubLObject item = CommonSymbols.NIL;
			for (item = cdolist_list_var
					.first(); CommonSymbols.NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var
							.rest(), item = cdolist_list_var.first())
				if (CommonSymbols.NIL != conses_high._member_3(item, list2, test))
					answer = ConsesLow.cons(item, answer);
			return answer;
		}
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject _intersection_4(SubLObject list1, SubLObject list2, SubLObject test, SubLObject key) {
		{
			SubLObject answer = CommonSymbols.NIL;
			SubLObject cdolist_list_var = list1;
			SubLObject item = CommonSymbols.NIL;
			for (item = cdolist_list_var
					.first(); CommonSymbols.NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var
							.rest(), item = cdolist_list_var.first())
				if (CommonSymbols.NIL != conses_high._member_4(Functions.funcall(key, item), list2, test, key))
					answer = ConsesLow.cons(item, answer);
			return answer;
		}
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject _member_2(SubLObject item, SubLObject list) {
		{
			SubLObject rest = CommonSymbols.NIL;
			for (rest = list; CommonSymbols.NIL != rest; rest = rest.rest())
				if (item.eql(rest.first()))
					return rest;
			return CommonSymbols.NIL;
		}
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject _member_3(SubLObject item, SubLObject list, SubLObject test) {
		{
			SubLObject rest = CommonSymbols.NIL;
			for (rest = list; CommonSymbols.NIL != rest; rest = rest.rest())
				if (CommonSymbols.NIL != Functions.funcall(test, item, rest.first()))
					return rest;
			return CommonSymbols.NIL;
		}
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject _member_4(SubLObject item, SubLObject list, SubLObject test, SubLObject key) {
		{
			SubLObject rest = CommonSymbols.NIL;
			for (rest = list; CommonSymbols.NIL != rest; rest = rest.rest())
				if (CommonSymbols.NIL != Functions.funcall(test, item, Functions.funcall(key, rest.first())))
					return rest;
			return CommonSymbols.NIL;
		}
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject _member_if_2(SubLObject test, SubLObject list) {
		{
			SubLObject rest = CommonSymbols.NIL;
			for (rest = list; CommonSymbols.NIL != rest; rest = rest.rest())
				if (CommonSymbols.NIL != Functions.funcall(test, rest.first()))
					return rest;
			return CommonSymbols.NIL;
		}
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject _member_if_3(SubLObject test, SubLObject list, SubLObject key) {
		{
			SubLObject rest = CommonSymbols.NIL;
			for (rest = list; CommonSymbols.NIL != rest; rest = rest.rest())
				if (CommonSymbols.NIL != Functions.funcall(test, Functions.funcall(key, rest.first())))
					return rest;
			return CommonSymbols.NIL;
		}
	}

	/** Return CONS after replacing its CAR and CDR. */
	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject _ncons(SubLObject car, SubLObject cdr, SubLObject cons) {
		if (!car.eql(cons.first()))
			ConsesLow.rplaca(cons, car);
		if (!cdr.eql(cons.rest()))
			ConsesLow.rplacd(cons, cdr);
		return cons;
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject _nintersection_2(SubLObject list1, SubLObject list2) {
		{
			SubLObject answer = CommonSymbols.NIL;
			{
				SubLObject rest = CommonSymbols.NIL;
				SubLObject item = CommonSymbols.NIL;
				for (rest = list1, item = rest.first(); !(CommonSymbols.NIL != answer
						|| CommonSymbols.NIL == rest); rest = rest.rest(), item = rest.first())
					if (CommonSymbols.NIL != conses_high._member_2(item, list2))
						answer = rest;
				if (CommonSymbols.NIL == answer)
					return CommonSymbols.NIL;
			}
			{
				SubLObject back = answer;
				SubLObject next = CommonSymbols.NIL;
				SubLObject item = CommonSymbols.NIL;
				for (next = answer.rest(), item = next.first(); CommonSymbols.NIL != next; next = next
						.rest(), item = next.first())
					if (CommonSymbols.NIL != conses_high._member_2(item, list2))
						back = next;
					else
						ConsesLow.rplacd(back, next.rest());
				return answer;
			}
		}
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject _nintersection_3(SubLObject list1, SubLObject list2, SubLObject test) {
		{
			SubLObject answer = CommonSymbols.NIL;
			{
				SubLObject rest = CommonSymbols.NIL;
				SubLObject item = CommonSymbols.NIL;
				for (rest = list1, item = rest.first(); !(CommonSymbols.NIL != answer
						|| CommonSymbols.NIL == rest); rest = rest.rest(), item = rest.first())
					if (CommonSymbols.NIL != conses_high._member_3(item, list2, test))
						answer = rest;
				if (CommonSymbols.NIL == answer)
					return CommonSymbols.NIL;
			}
			{
				SubLObject back = answer;
				SubLObject next = CommonSymbols.NIL;
				SubLObject item = CommonSymbols.NIL;
				for (next = answer.rest(), item = next.first(); CommonSymbols.NIL != next; next = next
						.rest(), item = next.first())
					if (CommonSymbols.NIL != conses_high._member_3(item, list2, test))
						back = next;
					else
						ConsesLow.rplacd(back, next.rest());
				return answer;
			}
		}
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject _nintersection_4(SubLObject list1, SubLObject list2, SubLObject test, SubLObject key) {
		{
			SubLObject answer = CommonSymbols.NIL;
			{
				SubLObject rest = CommonSymbols.NIL;
				SubLObject item = CommonSymbols.NIL;
				for (rest = list1, item = rest.first(); !(CommonSymbols.NIL != answer
						|| CommonSymbols.NIL == rest); rest = rest.rest(), item = rest.first())
					if (CommonSymbols.NIL != conses_high._member_4(Functions.funcall(key, item), list2, test, key))
						answer = rest;
				if (CommonSymbols.NIL == answer)
					return CommonSymbols.NIL;
			}
			{
				SubLObject back = answer;
				SubLObject next = CommonSymbols.NIL;
				SubLObject item = CommonSymbols.NIL;
				for (next = back.rest(), item = next.first(); CommonSymbols.NIL != next; next = next.rest(), item = next
						.first())
					if (CommonSymbols.NIL != conses_high._member_4(Functions.funcall(key, item), list2, test, key))
						back = next;
					else
						ConsesLow.rplacd(back, next.rest());
				return answer;
			}
		}
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject _nset_difference_2(SubLObject list1, SubLObject list2) {
		{
			SubLObject answer = CommonSymbols.NIL;
			{
				SubLObject rest = CommonSymbols.NIL;
				SubLObject item = CommonSymbols.NIL;
				for (rest = list1, item = rest.first(); !(CommonSymbols.NIL != answer
						|| CommonSymbols.NIL == rest); rest = rest.rest(), item = rest.first())
					if (CommonSymbols.NIL == conses_high._member_2(item, list2))
						answer = rest;
				if (CommonSymbols.NIL == answer)
					return CommonSymbols.NIL;
			}
			{
				SubLObject back = answer;
				SubLObject next = CommonSymbols.NIL;
				SubLObject item = CommonSymbols.NIL;
				for (next = back.rest(), item = next.first(); CommonSymbols.NIL != next; next = next.rest(), item = next
						.first())
					if (CommonSymbols.NIL == conses_high._member_2(item, list2))
						back = next;
					else
						ConsesLow.rplacd(back, next.rest());
				return answer;
			}
		}
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject _nset_difference_3(SubLObject list1, SubLObject list2, SubLObject test) {
		{
			SubLObject answer = CommonSymbols.NIL;
			{
				SubLObject rest = CommonSymbols.NIL;
				SubLObject item = CommonSymbols.NIL;
				for (rest = list1, item = rest.first(); !(CommonSymbols.NIL != answer
						|| CommonSymbols.NIL == rest); rest = rest.rest(), item = rest.first())
					if (CommonSymbols.NIL == conses_high._member_3(item, list2, test))
						answer = rest;
				if (CommonSymbols.NIL == answer)
					return CommonSymbols.NIL;
			}
			{
				SubLObject back = answer;
				SubLObject next = CommonSymbols.NIL;
				SubLObject item = CommonSymbols.NIL;
				for (next = back.rest(), item = next.first(); CommonSymbols.NIL != next; next = next.rest(), item = next
						.first())
					if (CommonSymbols.NIL == conses_high._member_3(item, list2, test))
						back = next;
					else
						ConsesLow.rplacd(back, next.rest());
				return answer;
			}
		}
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject _nset_difference_4(SubLObject list1, SubLObject list2, SubLObject test, SubLObject key) {
		{
			SubLObject answer = CommonSymbols.NIL;
			{
				SubLObject rest = CommonSymbols.NIL;
				SubLObject item = CommonSymbols.NIL;
				for (rest = list1, item = rest.first(); !(CommonSymbols.NIL != answer
						|| CommonSymbols.NIL == rest); rest = rest.rest(), item = rest.first())
					if (CommonSymbols.NIL == conses_high._member_4(Functions.funcall(key, item), list2, test, key))
						answer = rest;
				if (CommonSymbols.NIL == answer)
					return CommonSymbols.NIL;
			}
			{
				SubLObject back = answer;
				SubLObject next = CommonSymbols.NIL;
				SubLObject item = CommonSymbols.NIL;
				for (next = back.rest(), item = next.first(); CommonSymbols.NIL != next; next = next.rest(), item = next
						.first())
					if (CommonSymbols.NIL == conses_high._member_4(Functions.funcall(key, item), list2, test, key))
						back = next;
					else
						ConsesLow.rplacd(back, next.rest());
				return answer;
			}
		}
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject _nsublis_2(SubLObject alist, SubLObject tree) {
		{
			SubLObject cdolist_list_var = alist;
			SubLObject entry = CommonSymbols.NIL;
			for (entry = cdolist_list_var
					.first(); CommonSymbols.NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var
							.rest(), entry = cdolist_list_var.first())
				if (CommonSymbols.NIL != entry)
					if (entry.first().eql(tree))
						return entry.rest();
		}
		if (tree.isAtom())
			return tree;
		else {
			SubLObject tree_cons = CommonSymbols.NIL;
			SubLObject tree_car = CommonSymbols.NIL;
			SubLObject tree_cdr = CommonSymbols.NIL;
			for (tree_cons = tree, tree_car = tree_cons.first(), tree_cdr = tree_cons
					.rest(); CommonSymbols.NIL != tree_cons; tree_cons = tree_cons
							.rest(), tree_car = tree_cons.first(), tree_cdr = tree_cons.rest()) {
				ConsesLow.rplaca(tree_cons, conses_high._nsublis_2(alist, tree_car));
				if (!tree_cdr.isList()) {
					ConsesLow.rplacd(tree_cons, conses_high._nsublis_2(alist, tree_cdr));
					return tree;
				}
			}
			return tree;
		}
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject _nsublis_3(SubLObject alist, SubLObject tree, SubLObject test) {
		{
			SubLObject cdolist_list_var = alist;
			SubLObject entry = CommonSymbols.NIL;
			for (entry = cdolist_list_var
					.first(); CommonSymbols.NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var
							.rest(), entry = cdolist_list_var.first())
				if (CommonSymbols.NIL != entry)
					if (CommonSymbols.NIL != Functions.funcall(test, entry.first(), tree))
						return entry.rest();
		}
		if (tree.isAtom())
			return tree;
		else {
			SubLObject tree_cons = CommonSymbols.NIL;
			SubLObject tree_car = CommonSymbols.NIL;
			SubLObject tree_cdr = CommonSymbols.NIL;
			for (tree_cons = tree, tree_car = tree_cons.first(), tree_cdr = tree_cons
					.rest(); CommonSymbols.NIL != tree_cons; tree_cons = tree_cons
							.rest(), tree_car = tree_cons.first(), tree_cdr = tree_cons.rest()) {
				ConsesLow.rplaca(tree_cons, conses_high._nsublis_3(alist, tree_car, test));
				if (!tree_cdr.isList()) {
					ConsesLow.rplacd(tree_cons, conses_high._nsublis_3(alist, tree_cdr, test));
					return tree;
				}
			}
			return tree;
		}
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject _nsublis_4(SubLObject alist, SubLObject tree, SubLObject test, SubLObject key) {
		{
			SubLObject tree_key = Functions.funcall(key, tree);
			SubLObject cdolist_list_var = alist;
			SubLObject entry = CommonSymbols.NIL;
			for (entry = cdolist_list_var
					.first(); CommonSymbols.NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var
							.rest(), entry = cdolist_list_var.first())
				if (CommonSymbols.NIL != entry)
					if (CommonSymbols.NIL != Functions.funcall(test, entry.first(), tree_key))
						return entry.rest();
		}
		if (tree.isAtom())
			return tree;
		else {
			SubLObject tree_cons = CommonSymbols.NIL;
			SubLObject tree_car = CommonSymbols.NIL;
			SubLObject tree_cdr = CommonSymbols.NIL;
			for (tree_cons = tree, tree_car = tree_cons.first(), tree_cdr = tree_cons
					.rest(); CommonSymbols.NIL != tree_cons; tree_cons = tree_cons
							.rest(), tree_car = tree_cons.first(), tree_cdr = tree_cons.rest()) {
				ConsesLow.rplaca(tree_cons, conses_high._nsublis_4(alist, tree_car, test, key));
				if (!tree_cdr.isList()) {
					ConsesLow.rplacd(tree_cons, conses_high._nsublis_4(alist, tree_cdr, test, key));
					return tree;
				}
			}
			return tree;
		}
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject _nsubst_3(SubLObject v_new, SubLObject old, SubLObject tree) {
		if (old.eql(tree))
			return v_new;
		else if (tree.isAtom())
			return tree;
		else {
			SubLObject tree_car = tree.first();
			SubLObject tree_cdr = tree.rest();
			SubLObject new_car = conses_high._nsubst_3(v_new, old, tree_car);
			SubLObject new_cdr = conses_high._nsubst_3(v_new, old, tree_cdr);
			return conses_high._ncons(new_car, new_cdr, tree);
		}
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject _nsubst_4(SubLObject v_new, SubLObject old, SubLObject tree, SubLObject test) {
		if (CommonSymbols.NIL != Functions.funcall(test, old, tree))
			return v_new;
		else if (tree.isAtom())
			return tree;
		else {
			SubLObject tree_car = tree.first();
			SubLObject tree_cdr = tree.rest();
			SubLObject new_car = conses_high._nsubst_4(v_new, old, tree_car, test);
			SubLObject new_cdr = conses_high._nsubst_4(v_new, old, tree_cdr, test);
			return conses_high._ncons(new_car, new_cdr, tree);
		}
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject _nsubst_5(SubLObject v_new, SubLObject old, SubLObject tree, SubLObject test,
			SubLObject key) {
		if (CommonSymbols.NIL != Functions.funcall(test, old, Functions.funcall(key, tree)))
			return v_new;
		else if (tree.isAtom())
			return tree;
		else {
			SubLObject tree_car = tree.first();
			SubLObject tree_cdr = tree.rest();
			SubLObject new_car = conses_high._nsubst_5(v_new, old, tree_car, test, key);
			SubLObject new_cdr = conses_high._nsubst_5(v_new, old, tree_cdr, test, key);
			return conses_high._ncons(new_car, new_cdr, tree);
		}
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject _nsubst_if_3(SubLObject v_new, SubLObject test, SubLObject tree) {
		if (CommonSymbols.NIL != Functions.funcall(test, tree))
			return v_new;
		else if (tree.isAtom())
			return tree;
		else {
			SubLObject tree_car = tree.first();
			SubLObject tree_cdr = tree.rest();
			SubLObject new_car = conses_high._nsubst_if_3(v_new, test, tree_car);
			SubLObject new_cdr = conses_high._nsubst_if_3(v_new, test, tree_cdr);
			return conses_high._ncons(new_car, new_cdr, tree);
		}
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject _nsubst_if_4(SubLObject v_new, SubLObject test, SubLObject tree, SubLObject key) {
		if (CommonSymbols.NIL != Functions.funcall(test, Functions.funcall(key, tree)))
			return v_new;
		else if (tree.isAtom())
			return tree;
		else {
			SubLObject tree_car = tree.first();
			SubLObject tree_cdr = tree.rest();
			SubLObject new_car = conses_high._nsubst_if_4(v_new, test, tree_car, key);
			SubLObject new_cdr = conses_high._nsubst_if_4(v_new, test, tree_cdr, key);
			return conses_high._ncons(new_car, new_cdr, tree);
		}
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject _nunion_2(SubLObject list1, SubLObject list2) {
		{
			SubLObject runner = conses_high.last(list1, CommonSymbols.UNPROVIDED);
			SubLObject cdolist_list_var = list2;
			SubLObject item = CommonSymbols.NIL;
			for (item = cdolist_list_var
					.first(); CommonSymbols.NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var
							.rest(), item = cdolist_list_var.first())
				if (CommonSymbols.NIL == conses_high._member_2(item, list1)) {
					runner = ConsesLow.rplacd(runner, ConsesLow.cons(item, CommonSymbols.NIL));
					runner = runner.rest();
				}
		}
		return list1;
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject _nunion_3(SubLObject list1, SubLObject list2, SubLObject test) {
		{
			SubLObject runner = conses_high.last(list1, CommonSymbols.UNPROVIDED);
			SubLObject cdolist_list_var = list2;
			SubLObject item = CommonSymbols.NIL;
			for (item = cdolist_list_var
					.first(); CommonSymbols.NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var
							.rest(), item = cdolist_list_var.first())
				if (CommonSymbols.NIL == conses_high._member_3(item, list1, test)) {
					runner = ConsesLow.rplacd(runner, ConsesLow.cons(item, CommonSymbols.NIL));
					runner = runner.rest();
				}
		}
		return list1;
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject _nunion_4(SubLObject list1, SubLObject list2, SubLObject test, SubLObject key) {
		{
			SubLObject runner = conses_high.last(list1, CommonSymbols.UNPROVIDED);
			SubLObject cdolist_list_var = list2;
			SubLObject item = CommonSymbols.NIL;
			for (item = cdolist_list_var
					.first(); CommonSymbols.NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var
							.rest(), item = cdolist_list_var.first())
				if (CommonSymbols.NIL == conses_high._member_4(Functions.funcall(key, item), list1, test, key)) {
					runner = ConsesLow.rplacd(runner, ConsesLow.cons(item, CommonSymbols.NIL));
					runner = runner.rest();
				}
		}
		return list1;
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject _rassoc_2(SubLObject item, SubLObject alist) {
		{
			SubLObject rest = CommonSymbols.NIL;
			SubLObject entry = CommonSymbols.NIL;
			for (rest = alist, entry = rest.first(); CommonSymbols.NIL != rest; rest = rest.rest(), entry = rest
					.first())
				if (CommonSymbols.NIL != entry)
					if (item.eql(entry.rest()))
						return entry;
			return CommonSymbols.NIL;
		}
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject _rassoc_3(SubLObject item, SubLObject alist, SubLObject test) {
		{
			SubLObject rest = CommonSymbols.NIL;
			SubLObject entry = CommonSymbols.NIL;
			for (rest = alist, entry = rest.first(); CommonSymbols.NIL != rest; rest = rest.rest(), entry = rest
					.first())
				if (CommonSymbols.NIL != entry)
					if (CommonSymbols.NIL != Functions.funcall(test, item, entry.rest()))
						return entry;
			return CommonSymbols.NIL;
		}
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject _rassoc_4(SubLObject item, SubLObject alist, SubLObject test, SubLObject key) {
		{
			SubLObject rest = CommonSymbols.NIL;
			SubLObject entry = CommonSymbols.NIL;
			for (rest = alist, entry = rest.first(); CommonSymbols.NIL != rest; rest = rest.rest(), entry = rest
					.first())
				if (CommonSymbols.NIL != entry)
					if (CommonSymbols.NIL != Functions.funcall(test, item, Functions.funcall(key, entry.rest())))
						return entry;
			return CommonSymbols.NIL;
		}
	}

	/** Return CONS if its CAR and CDR are unchanged, else return a new cons. */
	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject _recons(SubLObject car, SubLObject cdr, SubLObject cons) {
		if (car.eql(cons.first()) && cdr.eql(cons.rest()))
			return cons;
		else
			return ConsesLow.cons(car, cdr);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject _set_difference_2(SubLObject list1, SubLObject list2) {
		{
			SubLObject answer = CommonSymbols.NIL;
			SubLObject cdolist_list_var = list1;
			SubLObject item = CommonSymbols.NIL;
			for (item = cdolist_list_var
					.first(); CommonSymbols.NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var
							.rest(), item = cdolist_list_var.first())
				if (CommonSymbols.NIL == conses_high._member_2(item, list2))
					answer = ConsesLow.cons(item, answer);
			return answer;
		}
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject _set_difference_3(SubLObject list1, SubLObject list2, SubLObject test) {
		{
			SubLObject answer = CommonSymbols.NIL;
			SubLObject cdolist_list_var = list1;
			SubLObject item = CommonSymbols.NIL;
			for (item = cdolist_list_var
					.first(); CommonSymbols.NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var
							.rest(), item = cdolist_list_var.first())
				if (CommonSymbols.NIL == conses_high._member_3(item, list2, test))
					answer = ConsesLow.cons(item, answer);
			return answer;
		}
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject _set_difference_4(SubLObject list1, SubLObject list2, SubLObject test, SubLObject key) {
		{
			SubLObject answer = CommonSymbols.NIL;
			SubLObject cdolist_list_var = list1;
			SubLObject item = CommonSymbols.NIL;
			for (item = cdolist_list_var
					.first(); CommonSymbols.NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var
							.rest(), item = cdolist_list_var.first())
				if (CommonSymbols.NIL == conses_high._member_4(Functions.funcall(key, item), list2, test, key))
					answer = ConsesLow.cons(item, answer);
			return answer;
		}
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject _sublis_2(SubLObject alist, SubLObject tree) {
		{
			SubLObject cdolist_list_var = alist;
			SubLObject entry = CommonSymbols.NIL;
			for (entry = cdolist_list_var
					.first(); CommonSymbols.NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var
							.rest(), entry = cdolist_list_var.first())
				if (CommonSymbols.NIL != entry)
					if (entry.first().eql(tree))
						return entry.rest();
		}
		if (tree.isAtom())
			return tree;
		else if (tree.isCons()
				&& conses_high._cons_length(tree).numG(conses_high.$sublis_watermark$.getGlobalValue())) {
			SubLObject new_tree = conses_high.copy_list(tree);
			SubLObject tree_cons = CommonSymbols.NIL;
			SubLObject tree_car = CommonSymbols.NIL;
			SubLObject tree_cdr = CommonSymbols.NIL;
			for (tree_cons = new_tree, tree_car = tree_cons.first(), tree_cdr = tree_cons
					.rest(); CommonSymbols.NIL != tree_cons; tree_cons = tree_cons
							.rest(), tree_car = tree_cons.first(), tree_cdr = tree_cons.rest()) {
				ConsesLow.rplaca(tree_cons, conses_high._sublis_2(alist, tree_car));
				if (!tree_cdr.isList()) {
					ConsesLow.rplacd(tree_cons, conses_high._sublis_2(alist, tree_cdr));
					return new_tree;
				}
			}
			return new_tree;
		} else {
			SubLObject tree_car = tree.first();
			SubLObject tree_cdr = tree.rest();
			SubLObject new_car = conses_high._sublis_2(alist, tree_car);
			SubLObject new_cdr = conses_high._sublis_2(alist, tree_cdr);
			return conses_high._recons(new_car, new_cdr, tree);
		}
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject _sublis_3(SubLObject alist, SubLObject tree, SubLObject test) {
		{
			SubLObject cdolist_list_var = alist;
			SubLObject entry = CommonSymbols.NIL;
			for (entry = cdolist_list_var
					.first(); CommonSymbols.NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var
							.rest(), entry = cdolist_list_var.first())
				if (CommonSymbols.NIL != entry)
					if (CommonSymbols.NIL != Functions.funcall(test, entry.first(), tree))
						return entry.rest();
		}
		if (tree.isAtom())
			return tree;
		else if (tree.isCons()
				&& conses_high._cons_length(tree).numG(conses_high.$sublis_watermark$.getGlobalValue())) {
			SubLObject new_tree = conses_high.copy_list(tree);
			SubLObject tree_cons = CommonSymbols.NIL;
			SubLObject tree_car = CommonSymbols.NIL;
			SubLObject tree_cdr = CommonSymbols.NIL;
			for (tree_cons = new_tree, tree_car = tree_cons.first(), tree_cdr = tree_cons
					.rest(); CommonSymbols.NIL != tree_cons; tree_cons = tree_cons
							.rest(), tree_car = tree_cons.first(), tree_cdr = tree_cons.rest()) {
				ConsesLow.rplaca(tree_cons, conses_high._sublis_3(alist, tree_car, test));
				if (!tree_cdr.isList()) {
					ConsesLow.rplacd(tree_cons, conses_high._sublis_3(alist, tree_cdr, test));
					return new_tree;
				}
			}
			return new_tree;
		} else {
			SubLObject tree_car = tree.first();
			SubLObject tree_cdr = tree.rest();
			SubLObject new_car = conses_high._sublis_3(alist, tree_car, test);
			SubLObject new_cdr = conses_high._sublis_3(alist, tree_cdr, test);
			return conses_high._recons(new_car, new_cdr, tree);
		}
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject _sublis_4(SubLObject alist, SubLObject tree, SubLObject test, SubLObject key) {
		{
			SubLObject tree_key = Functions.funcall(key, tree);
			SubLObject cdolist_list_var = alist;
			SubLObject entry = CommonSymbols.NIL;
			for (entry = cdolist_list_var
					.first(); CommonSymbols.NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var
							.rest(), entry = cdolist_list_var.first())
				if (CommonSymbols.NIL != entry)
					if (CommonSymbols.NIL != Functions.funcall(test, entry.first(), tree_key))
						return entry.rest();
		}
		if (tree.isAtom())
			return tree;
		else if (tree.isCons()
				&& conses_high._cons_length(tree).numG(conses_high.$sublis_watermark$.getGlobalValue())) {
			SubLObject new_tree = conses_high.copy_list(tree);
			SubLObject tree_cons = CommonSymbols.NIL;
			SubLObject tree_car = CommonSymbols.NIL;
			SubLObject tree_cdr = CommonSymbols.NIL;
			for (tree_cons = new_tree, tree_car = tree_cons.first(), tree_cdr = tree_cons
					.rest(); CommonSymbols.NIL != tree_cons; tree_cons = tree_cons
							.rest(), tree_car = tree_cons.first(), tree_cdr = tree_cons.rest()) {
				ConsesLow.rplaca(tree_cons, conses_high._sublis_4(alist, tree_car, test, key));
				if (!tree_cdr.isList()) {
					ConsesLow.rplacd(tree_cons, conses_high._sublis_4(alist, tree_cdr, test, key));
					return new_tree;
				}
			}
			return new_tree;
		} else {
			SubLObject tree_car = tree.first();
			SubLObject tree_cdr = tree.rest();
			SubLObject new_car = conses_high._sublis_4(alist, tree_car, test, key);
			SubLObject new_cdr = conses_high._sublis_4(alist, tree_cdr, test, key);
			return conses_high._recons(new_car, new_cdr, tree);
		}
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject _subsetp_2(SubLObject list1, SubLObject list2) {
		{
			SubLObject cdolist_list_var = list1;
			SubLObject item = CommonSymbols.NIL;
			for (item = cdolist_list_var
					.first(); CommonSymbols.NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var
							.rest(), item = cdolist_list_var.first())
				if (CommonSymbols.NIL == conses_high._member_2(item, list2))
					return CommonSymbols.NIL;
		}
		return CommonSymbols.T;
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject _subsetp_3(SubLObject list1, SubLObject list2, SubLObject test) {
		{
			SubLObject cdolist_list_var = list1;
			SubLObject item = CommonSymbols.NIL;
			for (item = cdolist_list_var
					.first(); CommonSymbols.NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var
							.rest(), item = cdolist_list_var.first())
				if (CommonSymbols.NIL == conses_high._member_3(item, list2, test))
					return CommonSymbols.NIL;
		}
		return CommonSymbols.T;
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject _subsetp_4(SubLObject list1, SubLObject list2, SubLObject test, SubLObject key) {
		{
			SubLObject cdolist_list_var = list1;
			SubLObject item = CommonSymbols.NIL;
			for (item = cdolist_list_var
					.first(); CommonSymbols.NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var
							.rest(), item = cdolist_list_var.first())
				if (CommonSymbols.NIL == conses_high._member_4(Functions.funcall(key, item), list2, test, key))
					return CommonSymbols.NIL;
		}
		return CommonSymbols.T;
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject _subst_3(SubLObject v_new, SubLObject old, SubLObject tree) {
		if (old.eql(tree))
			return v_new;
		else if (tree.isAtom())
			return tree;
		else {
			SubLObject tree_car = tree.first();
			SubLObject tree_cdr = tree.rest();
			SubLObject new_car = conses_high._subst_3(v_new, old, tree_car);
			SubLObject new_cdr = conses_high._subst_3(v_new, old, tree_cdr);
			return conses_high._recons(new_car, new_cdr, tree);
		}
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject _subst_4(SubLObject v_new, SubLObject old, SubLObject tree, SubLObject test) {
		if (CommonSymbols.NIL != Functions.funcall(test, old, tree))
			return v_new;
		else if (tree.isAtom())
			return tree;
		else {
			SubLObject tree_car = tree.first();
			SubLObject tree_cdr = tree.rest();
			SubLObject new_car = conses_high._subst_4(v_new, old, tree_car, test);
			SubLObject new_cdr = conses_high._subst_4(v_new, old, tree_cdr, test);
			return conses_high._recons(new_car, new_cdr, tree);
		}
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject _subst_5(SubLObject v_new, SubLObject old, SubLObject tree, SubLObject test,
			SubLObject key) {
		if (CommonSymbols.NIL != Functions.funcall(test, old, Functions.funcall(key, tree)))
			return v_new;
		else if (tree.isAtom())
			return tree;
		else {
			SubLObject tree_car = tree.first();
			SubLObject tree_cdr = tree.rest();
			SubLObject new_car = conses_high._subst_5(v_new, old, tree_car, test, key);
			SubLObject new_cdr = conses_high._subst_5(v_new, old, tree_cdr, test, key);
			return conses_high._recons(new_car, new_cdr, tree);
		}
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject _subst_if_3(SubLObject v_new, SubLObject test, SubLObject tree) {
		if (CommonSymbols.NIL != Functions.funcall(test, tree))
			return v_new;
		else if (tree.isAtom())
			return tree;
		else {
			SubLObject tree_car = tree.first();
			SubLObject tree_cdr = tree.rest();
			SubLObject new_car = conses_high._subst_if_3(v_new, test, tree_car);
			SubLObject new_cdr = conses_high._subst_if_3(v_new, test, tree_cdr);
			return conses_high._recons(new_car, new_cdr, tree);
		}
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject _subst_if_4(SubLObject v_new, SubLObject test, SubLObject tree, SubLObject key) {
		if (CommonSymbols.NIL != Functions.funcall(test, Functions.funcall(key, tree)))
			return v_new;
		else if (tree.isAtom())
			return tree;
		else {
			SubLObject tree_car = tree.first();
			SubLObject tree_cdr = tree.rest();
			SubLObject new_car = conses_high._subst_if_4(v_new, test, tree_car, key);
			SubLObject new_cdr = conses_high._subst_if_4(v_new, test, tree_cdr, key);
			return conses_high._recons(new_car, new_cdr, tree);
		}
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject _tree_equal_2(SubLObject tree1, SubLObject tree2) {
		if (tree1.isAtom() && tree2.isAtom())
			return Equality.eql(tree1, tree2);
		else if (tree1.isCons() && tree2.isCons()) {
			SubLObject rest_tree1 = CommonSymbols.NIL;
			SubLObject rest_tree2 = CommonSymbols.NIL;
			for (rest_tree1 = tree1, rest_tree2 = tree2; !(rest_tree1.isAtom() || rest_tree2.isAtom()
					|| CommonSymbols.NIL == conses_high._tree_equal_2(rest_tree1.first(),
							rest_tree2.first())); rest_tree1 = rest_tree1.rest(), rest_tree2 = rest_tree2.rest()) {
			}
			return SubLObjectFactory.makeBoolean(rest_tree1.isAtom() && rest_tree2.isAtom()
					&& CommonSymbols.NIL != conses_high._tree_equal_2(rest_tree1, rest_tree2));
		} else
			return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject _tree_equal_3(SubLObject tree1, SubLObject tree2, SubLObject test) {
		if (tree1.isAtom() && tree2.isAtom())
			return Functions.funcall(test, tree1, tree2);
		else if (tree1.isCons() && tree2.isCons()) {
			SubLObject rest_tree1 = CommonSymbols.NIL;
			SubLObject rest_tree2 = CommonSymbols.NIL;
			for (rest_tree1 = tree1, rest_tree2 = tree2; !(rest_tree1.isAtom() || rest_tree2.isAtom()
					|| CommonSymbols.NIL == conses_high._tree_equal_3(rest_tree1.first(), rest_tree2.first(),
							test)); rest_tree1 = rest_tree1.rest(), rest_tree2 = rest_tree2.rest()) {
			}
			return SubLObjectFactory.makeBoolean(rest_tree1.isAtom() && rest_tree2.isAtom()
					&& CommonSymbols.NIL != conses_high._tree_equal_3(rest_tree1, rest_tree2, test));
		} else
			return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject _union_2(SubLObject list1, SubLObject list2) {
		{
			SubLObject answer = list1;
			SubLObject cdolist_list_var = list2;
			SubLObject item = CommonSymbols.NIL;
			for (item = cdolist_list_var
					.first(); CommonSymbols.NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var
							.rest(), item = cdolist_list_var.first())
				if (CommonSymbols.NIL == conses_high._member_2(item, answer))
					answer = ConsesLow.cons(item, answer);
			return answer;
		}
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject _union_3(SubLObject list1, SubLObject list2, SubLObject test) {
		{
			SubLObject answer = list1;
			SubLObject cdolist_list_var = list2;
			SubLObject item = CommonSymbols.NIL;
			for (item = cdolist_list_var
					.first(); CommonSymbols.NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var
							.rest(), item = cdolist_list_var.first())
				if (CommonSymbols.NIL == conses_high._member_3(item, answer, test))
					answer = ConsesLow.cons(item, answer);
			return answer;
		}
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject _union_4(SubLObject list1, SubLObject list2, SubLObject test, SubLObject key) {
		{
			SubLObject answer = list1;
			SubLObject cdolist_list_var = list2;
			SubLObject item = CommonSymbols.NIL;
			for (item = cdolist_list_var
					.first(); CommonSymbols.NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var
							.rest(), item = cdolist_list_var.first())
				if (CommonSymbols.NIL == conses_high._member_4(Functions.funcall(key, item), answer, test, key))
					answer = ConsesLow.cons(item, answer);
			return answer;
		}
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject acons(SubLObject key, SubLObject datum, SubLObject alist) {
		return ConsesLow.cons(ConsesLow.cons(key, datum), alist);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject adjoin(SubLObject item, SubLObject list, SubLObject test, SubLObject key) {
		if (test == CommonSymbols.UNPROVIDED)
			test = Symbols.symbol_function(CommonSymbols.EQL);
		if (key == CommonSymbols.UNPROVIDED)
			key = Symbols.symbol_function(CommonSymbols.IDENTITY);
		SubLTrampolineFile.checkType(list, conses_high.$sym0$LISTP);
		SubLTrampolineFile.checkType(test, conses_high.$sym1$FUNCTION_SPEC_P);
		SubLTrampolineFile.checkType(key, conses_high.$sym1$FUNCTION_SPEC_P);
		if (CommonSymbols.NIL == list)
			return ConsesLow.cons(item, CommonSymbols.NIL);
		if (key != Symbols.symbol_function(CommonSymbols.IDENTITY))
			return CommonSymbols.NIL != conses_high._member_4(Functions.funcall(key, item), list, test, key)
					? (SubLObject) list : ConsesLow.cons(item, list);
		else if (test != Symbols.symbol_function(CommonSymbols.EQL))
			return CommonSymbols.NIL != conses_high._member_3(item, list, test) ? (SubLObject) list
					: ConsesLow.cons(item, list);
		else
			return CommonSymbols.NIL != conses_high._member_2(item, list) ? (SubLObject) list
					: ConsesLow.cons(item, list);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject assoc(SubLObject item, SubLObject alist, SubLObject test, SubLObject key) {
		if (test == CommonSymbols.UNPROVIDED)
			test = Symbols.symbol_function(CommonSymbols.EQL);
		if (key == CommonSymbols.UNPROVIDED)
			key = Symbols.symbol_function(CommonSymbols.IDENTITY);
		SubLTrampolineFile.checkType(alist, conses_high.$sym0$LISTP);
		SubLTrampolineFile.checkType(test, conses_high.$sym1$FUNCTION_SPEC_P);
		SubLTrampolineFile.checkType(key, conses_high.$sym1$FUNCTION_SPEC_P);
		if (CommonSymbols.NIL == alist)
			return CommonSymbols.NIL;
		if (Symbols.symbol_function(CommonSymbols.IDENTITY) != key)
			return conses_high._assoc_4(item, alist, test, key);
		else if (Symbols.symbol_function(CommonSymbols.EQL) != test)
			return conses_high._assoc_3(item, alist, test);
		else
			return conses_high._assoc_2(item, alist);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject assoc_if(SubLObject predicate, SubLObject alist) {
		SubLTrampolineFile.checkType(predicate, conses_high.$sym1$FUNCTION_SPEC_P);
		SubLTrampolineFile.checkType(alist, conses_high.$sym0$LISTP);
		if (CommonSymbols.NIL == alist)
			return CommonSymbols.NIL;
		{
			SubLObject rest = CommonSymbols.NIL;
			SubLObject entry = CommonSymbols.NIL;
			for (rest = alist, entry = rest.first(); CommonSymbols.NIL != rest; rest = rest.rest(), entry = rest
					.first())
				if (CommonSymbols.NIL != entry)
					if (CommonSymbols.NIL != Functions.funcall(predicate, entry.first()))
						return entry;
			return CommonSymbols.NIL;
		}
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 72730)
	public static SubLObject butlast(SubLObject list, SubLObject n) {
		if (n == CommonSymbols.UNPROVIDED)
			n = CommonSymbols.ONE_INTEGER;
		return conses_high.ldiff(list, conses_high.last(list, n));
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject caar(SubLObject list) {
		return list.first().first();
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject cadr(SubLObject list) {
		return list.rest().first();
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject cdar(SubLObject list) {
		return list.first().rest();
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject cddr(SubLObject list) {
		return list.rest().rest();
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject copy_alist(SubLObject list) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			if (CommonSymbols.NIL == list)
				return list;
			{
				SubLObject length = conses_high._cons_length(list);
				if (CommonSymbols.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))
					if (!length.isInteger())
						Errors.error(conses_high.$str5$COPY_ALIST_called_on_a_circular_l);
				{
					SubLObject new_list = ConsesLow.make_list(length, CommonSymbols.NIL);
					SubLObject new_rest = CommonSymbols.NIL;
					SubLObject old_rest = CommonSymbols.NIL;
					SubLObject old_item = CommonSymbols.NIL;
					for (new_rest = new_list, old_rest = list, old_item = old_rest.first(); old_rest.rest()
							.isCons(); new_rest = new_rest.rest(), old_rest = old_rest.rest(), old_item = old_rest
									.first())
						if (old_item.isCons())
							ConsesLow.rplaca(new_rest, conses_high.copy_list(old_item));
						else
							ConsesLow.rplaca(new_rest, old_item);
					if (old_item.isCons())
						ConsesLow.rplaca(new_rest, conses_high.copy_list(old_item));
					else
						ConsesLow.rplaca(new_rest, old_item);
					if (CommonSymbols.NIL != old_rest.rest())
						ConsesLow.rplacd(new_rest, old_rest.rest());
					return new_list;
				}
			}
		}
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject copy_list(SubLObject list) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			if (CommonSymbols.NIL == list)
				return CommonSymbols.NIL;
			{
				SubLObject length = conses_high._cons_length(list);
				if (CommonSymbols.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))
					if (!length.isInteger())
						Errors.error(conses_high.$str4$COPY_LIST_called_on_a_circular_li);
				{
					SubLObject new_list = ConsesLow.make_list(length, CommonSymbols.NIL);
					SubLObject new_rest = CommonSymbols.NIL;
					SubLObject old_rest = CommonSymbols.NIL;
					SubLObject old_item = CommonSymbols.NIL;
					for (new_rest = new_list, old_rest = list, old_item = old_rest.first(); old_rest.rest()
							.isCons(); new_rest = new_rest.rest(), old_rest = old_rest.rest(), old_item = old_rest
									.first())
						ConsesLow.rplaca(new_rest, old_item);
					ConsesLow.rplaca(new_rest, old_item);
					if (CommonSymbols.NIL != old_rest.rest())
						ConsesLow.rplacd(new_rest, old_rest.rest());
					return new_list;
				}
			}
		}
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject copy_tree(SubLObject object) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			if (object.isAtom())
				return object;
			else {
				SubLObject length = conses_high._cons_length(object);
				if (CommonSymbols.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))
					if (!length.isInteger())
						Errors.error(conses_high.$str6$COPY_TREE_called_on_a_circular_li);
				{
					SubLObject new_list = ConsesLow.make_list(length, CommonSymbols.NIL);
					SubLObject new_rest = CommonSymbols.NIL;
					SubLObject old_rest = CommonSymbols.NIL;
					SubLObject old_item = CommonSymbols.NIL;
					for (new_rest = new_list, old_rest = object, old_item = old_rest.first(); old_rest.rest()
							.isCons(); new_rest = new_rest.rest(), old_rest = old_rest.rest(), old_item = old_rest
									.first())
						ConsesLow.rplaca(new_rest, conses_high.copy_tree(old_item));
					ConsesLow.rplaca(new_rest, conses_high.copy_tree(old_item));
					if (CommonSymbols.NIL != old_rest.rest())
						ConsesLow.rplacd(new_rest, conses_high.copy_tree(old_rest.rest()));
					return new_list;
				}
			}
		}
	}

	public static SubLObject declare_conses_high_file() {
		SubLFiles.declareFunction(conses_high.myName, "_recons", "_RECONS", 3, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "_ncons", "_NCONS", 3, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "_cons_length", "_CONS-LENGTH", 1, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "caar", "CAAR", 1, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "cadr", "CADR", 1, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "cdar", "CDAR", 1, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "cddr", "CDDR", 1, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "_tree_equal_2", "_TREE-EQUAL-2", 2, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "_tree_equal_3", "_TREE-EQUAL-3", 3, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "tree_equal", "TREE-EQUAL", 2, 1, false);
		SubLFiles.declareFunction(conses_high.myName, "endp", "ENDP", 1, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "list_length", "LIST-LENGTH", 1, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "first", "FIRST", 1, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "second", "SECOND", 1, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "third", "THIRD", 1, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "fourth", "FOURTH", 1, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "fifth", "FIFTH", 1, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "sixth", "SIXTH", 1, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "seventh", "SEVENTH", 1, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "eighth", "EIGHTH", 1, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "ninth", "NINTH", 1, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "tenth", "TENTH", 1, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "rest", "REST", 1, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "nthcdr", "NTHCDR", 2, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "copy_list", "COPY-LIST", 1, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "copy_alist", "COPY-ALIST", 1, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "copy_tree", "COPY-TREE", 1, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "revappend", "REVAPPEND", 2, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "nreconc", "NRECONC", 2, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "ldiff", "LDIFF", 2, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "_subst_3", "_SUBST-3", 3, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "_subst_4", "_SUBST-4", 4, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "_subst_5", "_SUBST-5", 5, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "subst", "SUBST", 3, 2, false);
		SubLFiles.declareFunction(conses_high.myName, "_subst_if_3", "_SUBST-IF-3", 3, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "_subst_if_4", "_SUBST-IF-4", 4, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "subst_if", "SUBST-IF", 3, 1, false);
		SubLFiles.declareFunction(conses_high.myName, "_nsubst_3", "_NSUBST-3", 3, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "_nsubst_4", "_NSUBST-4", 4, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "_nsubst_5", "_NSUBST-5", 5, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "nsubst", "NSUBST", 3, 2, false);
		SubLFiles.declareFunction(conses_high.myName, "_nsubst_if_3", "_NSUBST-IF-3", 3, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "_nsubst_if_4", "_NSUBST-IF-4", 4, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "nsubst_if", "NSUBST-IF", 3, 1, false);
		SubLFiles.declareFunction(conses_high.myName, "_sublis_2", "_SUBLIS-2", 2, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "_sublis_3", "_SUBLIS-3", 3, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "_sublis_4", "_SUBLIS-4", 4, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "sublis", "SUBLIS", 2, 2, false);
		SubLFiles.declareFunction(conses_high.myName, "_nsublis_2", "_NSUBLIS-2", 2, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "_nsublis_3", "_NSUBLIS-3", 3, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "_nsublis_4", "_NSUBLIS-4", 4, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "nsublis", "NSUBLIS", 2, 2, false);
		SubLFiles.declareFunction(conses_high.myName, "_member_2", "_MEMBER-2", 2, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "_member_3", "_MEMBER-3", 3, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "_member_4", "_MEMBER-4", 4, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "member", "MEMBER", 2, 2, false);
		SubLFiles.declareFunction(conses_high.myName, "_member_if_2", "_MEMBER-IF-2", 2, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "_member_if_3", "_MEMBER-IF-3", 3, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "member_if", "MEMBER-IF", 2, 1, false);
		SubLFiles.declareFunction(conses_high.myName, "tailp", "TAILP", 2, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "adjoin", "ADJOIN", 2, 2, false);
		SubLFiles.declareFunction(conses_high.myName, "_union_2", "_UNION-2", 2, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "_union_3", "_UNION-3", 3, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "_union_4", "_UNION-4", 4, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "union", "UNION", 2, 2, false);
		new $union$BinaryFunction();
		SubLFiles.declareFunction(conses_high.myName, "_nunion_2", "_NUNION-2", 2, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "_nunion_3", "_NUNION-3", 3, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "_nunion_4", "_NUNION-4", 4, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "nunion", "NUNION", 2, 2, false);
		SubLFiles.declareFunction(conses_high.myName, "_intersection_2", "_INTERSECTION-2", 2, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "_intersection_3", "_INTERSECTION-3", 3, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "_intersection_4", "_INTERSECTION-4", 4, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "intersection", "INTERSECTION", 2, 2, false);
		SubLFiles.declareFunction(conses_high.myName, "_nintersection_2", "_NINTERSECTION-2", 2, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "_nintersection_3", "_NINTERSECTION-3", 3, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "_nintersection_4", "_NINTERSECTION-4", 4, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "nintersection", "NINTERSECTION", 2, 2, false);
		SubLFiles.declareFunction(conses_high.myName, "_set_difference_2", "_SET-DIFFERENCE-2", 2, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "_set_difference_3", "_SET-DIFFERENCE-3", 3, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "_set_difference_4", "_SET-DIFFERENCE-4", 4, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "set_difference", "SET-DIFFERENCE", 2, 2, false);
		SubLFiles.declareFunction(conses_high.myName, "_nset_difference_2", "_NSET-DIFFERENCE-2", 2, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "_nset_difference_3", "_NSET-DIFFERENCE-3", 3, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "_nset_difference_4", "_NSET-DIFFERENCE-4", 4, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "nset_difference", "NSET-DIFFERENCE", 2, 2, false);
		SubLFiles.declareFunction(conses_high.myName, "set_exclusive_or", "SET-EXCLUSIVE-OR", 2, 2, false);
		SubLFiles.declareFunction(conses_high.myName, "nset_exclusive_or", "NSET-EXCLUSIVE-OR", 2, 2, false);
		SubLFiles.declareFunction(conses_high.myName, "_subsetp_2", "_SUBSETP-2", 2, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "_subsetp_3", "_SUBSETP-3", 3, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "_subsetp_4", "_SUBSETP-4", 4, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "subsetp", "SUBSETP", 2, 2, false);
		SubLFiles.declareFunction(conses_high.myName, "acons", "ACONS", 3, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "pairlis", "PAIRLIS", 2, 1, false);
		SubLFiles.declareFunction(conses_high.myName, "_assoc_2", "_ASSOC-2", 2, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "_assoc_3", "_ASSOC-3", 3, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "_assoc_4", "_ASSOC-4", 4, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "assoc", "ASSOC", 2, 2, false);
		SubLFiles.declareFunction(conses_high.myName, "assoc_if", "ASSOC-IF", 2, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "_rassoc_2", "_RASSOC-2", 2, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "_rassoc_3", "_RASSOC-3", 3, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "_rassoc_4", "_RASSOC-4", 4, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "rassoc", "RASSOC", 2, 2, false);
		SubLFiles.declareFunction(conses_high.myName, "rassoc_if", "RASSOC-IF", 2, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "getf", "GETF", 2, 1, false);
		SubLFiles.declareFunction(conses_high.myName, "putf", "PUTF", 3, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "remf", "REMF", 2, 0, false);
		SubLFiles.declareFunction(conses_high.myName, "last", "LAST", 1, 1, false);
		SubLFiles.declareFunction(conses_high.myName, "butlast", "BUTLAST", 1, 1, false);
		SubLFiles.declareFunction(conses_high.myName, "nbutlast", "NBUTLAST", 1, 1, false);
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject eighth(SubLObject list) {
		return ConsesLow.nth(CommonSymbols.SEVEN_INTEGER, list);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject endp(SubLObject object) {
		SubLTrampolineFile.checkType(object, conses_high.$sym0$LISTP);
		return Types.sublisp_null(object);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject fifth(SubLObject list) {
		return ConsesLow.nth(CommonSymbols.FOUR_INTEGER, list);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject first(SubLObject list) {
		return list.first();
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject fourth(SubLObject list) {
		return ConsesLow.nth(CommonSymbols.THREE_INTEGER, list);
	}

	/** Return the value for INDICATOR in PLIST, or DEFAULT if not present */
	@SubL(source = "sublisp/conses-high.lisp", position = 69351)
	public static SubLObject getf(SubLObject plist, SubLObject indicator, SubLObject v_default) {
		if (v_default == CommonSymbols.UNPROVIDED)
			v_default = CommonSymbols.NIL;
		{
			SubLObject next = CommonSymbols.NIL;
			SubLObject key = CommonSymbols.NIL;
			for (next = plist, key = next.first(); CommonSymbols.NIL != next; next = conses_high.cddr(next), key = next
					.first())
				if (indicator == key)
					return conses_high.cadr(next);
			return v_default;
		}
	}

	public static SubLObject init_conses_high_file() {
		conses_high.$sublis_watermark$ = SubLFiles.deflexical("*SUBLIS-WATERMARK*", conses_high.$int7$68);
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject intersection(SubLObject list1, SubLObject list2, SubLObject test, SubLObject key) {
		if (test == CommonSymbols.UNPROVIDED)
			test = Symbols.symbol_function(CommonSymbols.EQL);
		if (key == CommonSymbols.UNPROVIDED)
			key = Symbols.symbol_function(CommonSymbols.IDENTITY);
		SubLTrampolineFile.checkType(list1, conses_high.$sym0$LISTP);
		SubLTrampolineFile.checkType(list2, conses_high.$sym0$LISTP);
		SubLTrampolineFile.checkType(test, conses_high.$sym1$FUNCTION_SPEC_P);
		SubLTrampolineFile.checkType(key, conses_high.$sym1$FUNCTION_SPEC_P);
		if (CommonSymbols.NIL == list1)
			return CommonSymbols.NIL;
		else if (CommonSymbols.NIL == list2)
			return CommonSymbols.NIL;
		if (Symbols.symbol_function(CommonSymbols.IDENTITY) != key)
			return conses_high._intersection_4(list1, list2, test, key);
		else if (Symbols.symbol_function(CommonSymbols.EQL) != test)
			return conses_high._intersection_3(list1, list2, test);
		else
			return conses_high._intersection_2(list1, list2);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 70619)
	public static SubLObject last(SubLObject list, SubLObject n) {
		if (n == CommonSymbols.UNPROVIDED)
			n = CommonSymbols.ONE_INTEGER;
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			SubLTrampolineFile.checkType(list, conses_high.$sym0$LISTP);
			SubLTrampolineFile.checkType(n, conses_high.$sym2$FIXNUMP);
			if (CommonSymbols.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))
				if (n.isNegative())
					Errors.error(conses_high.$str9$LAST_called_with_negative_index_o, n);
			if (CommonSymbols.NIL == list)
				return CommonSymbols.NIL;
			else {
				SubLObject seeker_start = list;
				SubLObject circular_seeker = CommonSymbols.NIL;
				SubLObject i = CommonSymbols.NIL;
				for (i = CommonSymbols.ZERO_INTEGER; i.numL(n); i = Numbers.add(i, CommonSymbols.ONE_INTEGER)) {
					if (!seeker_start.isCons())
						return list;
					seeker_start = seeker_start.rest();
				}
				circular_seeker = seeker_start;
				{
					SubLObject seeker = CommonSymbols.NIL;
					SubLObject back = CommonSymbols.NIL;
					for (seeker = seeker_start, back = list; seeker
							.isCons(); seeker = seeker.rest(), back = back.rest())
						if (circular_seeker.isCons()) {
							circular_seeker = circular_seeker.rest();
							if (circular_seeker.isCons()) {
								circular_seeker = circular_seeker.rest();
								if (CommonSymbols.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))
									if (circular_seeker == back)
										Errors.error(conses_high.$str10$LAST_called_on_circular_list);
							}
						}
					return back;
				}
			}
		}
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject ldiff(SubLObject list, SubLObject sublist) {
		SubLTrampolineFile.checkType(list, conses_high.$sym0$LISTP);
		if (CommonSymbols.NIL == list)
			return CommonSymbols.NIL;
		else if (list == sublist)
			return CommonSymbols.NIL;
		{
			SubLObject answer = ConsesLow.cons(list.first(), CommonSymbols.NIL);
			SubLObject builder = answer;
			SubLObject temp = CommonSymbols.NIL;
			list = list.rest();
			for (; !(list == sublist || !list.isCons());) {
				temp = ConsesLow.cons(list.first(), CommonSymbols.NIL);
				builder = ConsesLow.rplacd(builder, temp);
				builder = builder.rest();
				list = list.rest();
			}
			return answer;
		}
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject list_length(SubLObject list) {
		SubLTrampolineFile.checkType(list, conses_high.$sym0$LISTP);
		if (CommonSymbols.NIL == list)
			return CommonSymbols.ZERO_INTEGER;
		else if (CommonSymbols.NIL == list.rest())
			return CommonSymbols.ONE_INTEGER;
		{
			SubLObject slow = CommonSymbols.NIL;
			SubLObject fast = CommonSymbols.NIL;
			SubLObject length = CommonSymbols.NIL;
			for (slow = list.rest(), fast = conses_high.cddr(
					list), length = CommonSymbols.TWO_INTEGER; fast != slow; slow = slow.rest(), fast = conses_high
							.cddr(fast), length = Numbers.add(CommonSymbols.TWO_INTEGER, length))
				if (CommonSymbols.NIL == fast)
					return length;
				else if (CommonSymbols.NIL == fast.rest())
					return Numbers.add(CommonSymbols.ONE_INTEGER, length);
			return CommonSymbols.NIL;
		}
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject member(SubLObject item, SubLObject list, SubLObject test, SubLObject key) {
		if (test == CommonSymbols.UNPROVIDED)
			test = Symbols.symbol_function(CommonSymbols.EQL);
		if (key == CommonSymbols.UNPROVIDED)
			key = Symbols.symbol_function(CommonSymbols.IDENTITY);
		SubLTrampolineFile.checkType(list, conses_high.$sym0$LISTP);
		SubLTrampolineFile.checkType(test, conses_high.$sym1$FUNCTION_SPEC_P);
		SubLTrampolineFile.checkType(key, conses_high.$sym1$FUNCTION_SPEC_P);
		if (CommonSymbols.NIL == list)
			return CommonSymbols.NIL;
		if (Symbols.symbol_function(CommonSymbols.IDENTITY) != key)
			return conses_high._member_4(item, list, test, key);
		else if (Symbols.symbol_function(CommonSymbols.EQL) != test)
			return conses_high._member_3(item, list, test);
		else
			return conses_high._member_2(item, list);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject member_if(SubLObject test, SubLObject list, SubLObject key) {
		if (key == CommonSymbols.UNPROVIDED)
			key = Symbols.symbol_function(CommonSymbols.IDENTITY);
		SubLTrampolineFile.checkType(list, conses_high.$sym0$LISTP);
		SubLTrampolineFile.checkType(test, conses_high.$sym1$FUNCTION_SPEC_P);
		SubLTrampolineFile.checkType(key, conses_high.$sym1$FUNCTION_SPEC_P);
		if (CommonSymbols.NIL == list)
			return CommonSymbols.NIL;
		if (Symbols.symbol_function(CommonSymbols.IDENTITY) != key)
			return conses_high._member_if_3(test, list, key);
		else
			return conses_high._member_if_2(test, list);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 72806)
	public static SubLObject nbutlast(SubLObject list, SubLObject n) {
		if (n == CommonSymbols.UNPROVIDED)
			n = CommonSymbols.ONE_INTEGER;
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			SubLTrampolineFile.checkType(list, conses_high.$sym0$LISTP);
			SubLTrampolineFile.checkType(n, conses_high.$sym2$FIXNUMP);
			if (CommonSymbols.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))
				if (n.isNegative())
					Errors.error(conses_high.$str11$NBUTLAST_called_with_negative_ind, n);
			if (CommonSymbols.NIL == list)
				return CommonSymbols.NIL;
			else {
				SubLObject seeker_start = list;
				SubLObject circular_seeker = CommonSymbols.NIL;
				SubLObject i = CommonSymbols.NIL;
				for (i = CommonSymbols.ZERO_INTEGER; i.numL(n); i = Numbers.add(i, CommonSymbols.ONE_INTEGER)) {
					if (!seeker_start.isCons())
						return CommonSymbols.NIL;
					seeker_start = seeker_start.rest();
				}
				if (!seeker_start.isCons())
					return CommonSymbols.NIL;
				else {
					seeker_start = seeker_start.rest();
					circular_seeker = seeker_start;
					{
						SubLObject seeker = CommonSymbols.NIL;
						SubLObject back = CommonSymbols.NIL;
						for (seeker = seeker_start, back = list; seeker
								.isCons(); seeker = seeker.rest(), back = back.rest())
							if (circular_seeker.isCons()) {
								circular_seeker = circular_seeker.rest();
								if (circular_seeker.isCons()) {
									circular_seeker = circular_seeker.rest();
									if (CommonSymbols.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))
										if (circular_seeker == back)
											Errors.error(conses_high.$str12$NBUTLAST_called_on_circular_list);
								}
							}
						ConsesLow.rplacd(back, CommonSymbols.NIL);
						return list;
					}
				}
			}
		}
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject nintersection(SubLObject list1, SubLObject list2, SubLObject test, SubLObject key) {
		if (test == CommonSymbols.UNPROVIDED)
			test = Symbols.symbol_function(CommonSymbols.EQL);
		if (key == CommonSymbols.UNPROVIDED)
			key = Symbols.symbol_function(CommonSymbols.IDENTITY);
		SubLTrampolineFile.checkType(list1, conses_high.$sym0$LISTP);
		SubLTrampolineFile.checkType(list2, conses_high.$sym0$LISTP);
		SubLTrampolineFile.checkType(test, conses_high.$sym1$FUNCTION_SPEC_P);
		SubLTrampolineFile.checkType(key, conses_high.$sym1$FUNCTION_SPEC_P);
		if (CommonSymbols.NIL == list1)
			return CommonSymbols.NIL;
		else if (CommonSymbols.NIL == list2)
			return CommonSymbols.NIL;
		if (Symbols.symbol_function(CommonSymbols.IDENTITY) != key)
			return conses_high._nintersection_4(list1, list2, test, key);
		else if (Symbols.symbol_function(CommonSymbols.EQL) != test)
			return conses_high._nintersection_3(list1, list2, test);
		else
			return conses_high._nintersection_2(list1, list2);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject ninth(SubLObject list) {
		return ConsesLow.nth(CommonSymbols.EIGHT_INTEGER, list);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject nreconc(SubLObject list1, SubLObject list2) {
		SubLTrampolineFile.checkType(list1, conses_high.$sym0$LISTP);
		SubLTrampolineFile.checkType(list2, conses_high.$sym0$LISTP);
		if (CommonSymbols.NIL == list2)
			return Sequences.nreverse(list1);
		else if (CommonSymbols.NIL == list1)
			return list2;
		{
			SubLObject next = list1.rest();
			SubLObject temp = CommonSymbols.NIL;
			list1 = ConsesLow.rplacd(list1, list2);
			for (; next.isCons();) {
				temp = next.rest();
				list1 = ConsesLow.rplacd(next, list1);
				next = temp;
			}
			return list1;
		}
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject nset_difference(SubLObject list1, SubLObject list2, SubLObject test, SubLObject key) {
		if (test == CommonSymbols.UNPROVIDED)
			test = Symbols.symbol_function(CommonSymbols.EQL);
		if (key == CommonSymbols.UNPROVIDED)
			key = Symbols.symbol_function(CommonSymbols.IDENTITY);
		SubLTrampolineFile.checkType(list1, conses_high.$sym0$LISTP);
		SubLTrampolineFile.checkType(list2, conses_high.$sym0$LISTP);
		SubLTrampolineFile.checkType(test, conses_high.$sym1$FUNCTION_SPEC_P);
		SubLTrampolineFile.checkType(key, conses_high.$sym1$FUNCTION_SPEC_P);
		if (CommonSymbols.NIL == list1)
			return CommonSymbols.NIL;
		else if (CommonSymbols.NIL == list2)
			return list1;
		if (Symbols.symbol_function(CommonSymbols.IDENTITY) != key)
			return conses_high._nset_difference_4(list1, list2, test, key);
		else if (Symbols.symbol_function(CommonSymbols.EQL) != test)
			return conses_high._nset_difference_3(list1, list2, test);
		else
			return conses_high._nset_difference_2(list1, list2);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject nset_exclusive_or(SubLObject list1, SubLObject list2, SubLObject test, SubLObject key) {
		if (test == CommonSymbols.UNPROVIDED)
			test = Symbols.symbol_function(CommonSymbols.EQL);
		if (key == CommonSymbols.UNPROVIDED)
			key = Symbols.symbol_function(CommonSymbols.IDENTITY);
		return ConsesLow.nconc(conses_high.set_difference(list1, list2, test, key),
				conses_high.set_difference(list2, list1, test, key));
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject nsublis(SubLObject alist, SubLObject tree, SubLObject test, SubLObject key) {
		if (test == CommonSymbols.UNPROVIDED)
			test = Symbols.symbol_function(CommonSymbols.EQL);
		if (key == CommonSymbols.UNPROVIDED)
			key = Symbols.symbol_function(CommonSymbols.IDENTITY);
		SubLTrampolineFile.checkType(test, conses_high.$sym1$FUNCTION_SPEC_P);
		SubLTrampolineFile.checkType(key, conses_high.$sym1$FUNCTION_SPEC_P);
		if (Symbols.symbol_function(CommonSymbols.IDENTITY) != key)
			return conses_high._nsublis_4(alist, tree, test, key);
		else if (CommonSymbols.NIL == alist)
			return tree;
		else if (Symbols.symbol_function(CommonSymbols.EQL) != test)
			return conses_high._nsublis_3(alist, tree, test);
		else
			return conses_high._nsublis_2(alist, tree);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject nsubst(SubLObject v_new, SubLObject old, SubLObject tree, SubLObject test,
			SubLObject key) {
		if (test == CommonSymbols.UNPROVIDED)
			test = Symbols.symbol_function(CommonSymbols.EQL);
		if (key == CommonSymbols.UNPROVIDED)
			key = Symbols.symbol_function(CommonSymbols.IDENTITY);
		SubLTrampolineFile.checkType(test, conses_high.$sym1$FUNCTION_SPEC_P);
		SubLTrampolineFile.checkType(key, conses_high.$sym1$FUNCTION_SPEC_P);
		if (Symbols.symbol_function(CommonSymbols.IDENTITY) != key)
			return conses_high._nsubst_5(v_new, old, tree, test, key);
		else if (Symbols.symbol_function(CommonSymbols.EQL) != test)
			return conses_high._nsubst_4(v_new, old, tree, test);
		else
			return conses_high._nsubst_3(v_new, old, tree);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject nsubst_if(SubLObject v_new, SubLObject test, SubLObject tree, SubLObject key) {
		if (key == CommonSymbols.UNPROVIDED)
			key = Symbols.symbol_function(CommonSymbols.IDENTITY);
		SubLTrampolineFile.checkType(test, conses_high.$sym1$FUNCTION_SPEC_P);
		SubLTrampolineFile.checkType(key, conses_high.$sym1$FUNCTION_SPEC_P);
		if (Symbols.symbol_function(CommonSymbols.IDENTITY) != key)
			return conses_high._nsubst_if_4(v_new, test, tree, key);
		else
			return conses_high._nsubst_if_3(v_new, test, tree);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject nthcdr(SubLObject n, SubLObject list) {
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			SubLTrampolineFile.checkType(n, conses_high.$sym2$FIXNUMP);
			SubLTrampolineFile.checkType(list, conses_high.$sym0$LISTP);
			if (CommonSymbols.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))
				if (n.isNegative())
					Errors.error(conses_high.$str3$_S_must_be_a_non_negative_integer, n);
			{
				SubLObject i = CommonSymbols.NIL;
				for (i = CommonSymbols.ZERO_INTEGER; i.numL(n); i = Numbers.add(i, CommonSymbols.ONE_INTEGER))
					list = list.rest();
			}
			return list;
		}
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject nunion(SubLObject list1, SubLObject list2, SubLObject test, SubLObject key) {
		if (test == CommonSymbols.UNPROVIDED)
			test = Symbols.symbol_function(CommonSymbols.EQL);
		if (key == CommonSymbols.UNPROVIDED)
			key = Symbols.symbol_function(CommonSymbols.IDENTITY);
		SubLTrampolineFile.checkType(list1, conses_high.$sym0$LISTP);
		SubLTrampolineFile.checkType(list2, conses_high.$sym0$LISTP);
		SubLTrampolineFile.checkType(test, conses_high.$sym1$FUNCTION_SPEC_P);
		SubLTrampolineFile.checkType(key, conses_high.$sym1$FUNCTION_SPEC_P);
		if (CommonSymbols.NIL == list1)
			return list2;
		else if (CommonSymbols.NIL == list2)
			return list1;
		if (Symbols.symbol_function(CommonSymbols.IDENTITY) != key)
			return conses_high._nunion_4(list1, list2, test, key);
		else if (Symbols.symbol_function(CommonSymbols.EQL) != test)
			return conses_high._nunion_3(list1, list2, test);
		else
			return conses_high._nunion_2(list1, list2);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject pairlis(SubLObject keys, SubLObject data, SubLObject alist) {
		if (alist == CommonSymbols.UNPROVIDED)
			alist = CommonSymbols.NIL;
		{
			SubLThread thread = SubLProcess.currentSubLThread();
			SubLTrampolineFile.checkType(keys, conses_high.$sym0$LISTP);
			SubLTrampolineFile.checkType(data, conses_high.$sym0$LISTP);
			{
				SubLObject rest_keys = CommonSymbols.NIL;
				SubLObject rest_data = CommonSymbols.NIL;
				for (rest_keys = keys, rest_data = data; !(CommonSymbols.NIL == rest_keys
						|| CommonSymbols.NIL == rest_data); rest_keys = rest_keys.rest(), rest_data = rest_data.rest())
					alist = conses_high.acons(rest_keys.first(), rest_data.first(), alist);
				if (CommonSymbols.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread))
					if (!(CommonSymbols.NIL == rest_keys && CommonSymbols.NIL == rest_data))
						Errors.error(conses_high.$str8$PAIRLIS_was_called_with_lists_of_);
				return alist;
			}
		}
	}

	/** Return a plist which has VALUE stored for INDICATOR in PLIST */
	@SubL(source = "sublisp/conses-high.lisp", position = 69735)
	public static SubLObject putf(SubLObject plist, SubLObject indicator, SubLObject value) {
		{
			SubLObject back = CommonSymbols.NIL;
			SubLObject next = CommonSymbols.NIL;
			SubLObject key = CommonSymbols.NIL;
			for (back = CommonSymbols.NIL, next = plist, key = next.first(); CommonSymbols.NIL != next; back = next
					.rest(), next = conses_high.cddr(next), key = next.first())
				if (indicator == key) {
					ConsesLow.rplaca(next.rest(), value);
					return plist;
				}
			if (CommonSymbols.NIL != back) {
				ConsesLow.rplacd(back, ConsesLow.list(indicator, value));
				return plist;
			} else
				return ConsesLow.listS(indicator, value, plist);
		}
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject rassoc(SubLObject item, SubLObject alist, SubLObject test, SubLObject key) {
		if (test == CommonSymbols.UNPROVIDED)
			test = Symbols.symbol_function(CommonSymbols.EQL);
		if (key == CommonSymbols.UNPROVIDED)
			key = Symbols.symbol_function(CommonSymbols.IDENTITY);
		SubLTrampolineFile.checkType(alist, conses_high.$sym0$LISTP);
		SubLTrampolineFile.checkType(test, conses_high.$sym1$FUNCTION_SPEC_P);
		SubLTrampolineFile.checkType(key, conses_high.$sym1$FUNCTION_SPEC_P);
		if (CommonSymbols.NIL == alist)
			return CommonSymbols.NIL;
		if (Symbols.symbol_function(CommonSymbols.IDENTITY) != key)
			return conses_high._rassoc_4(item, alist, test, key);
		else if (Symbols.symbol_function(CommonSymbols.EQL) != test)
			return conses_high._rassoc_3(item, alist, test);
		else
			return conses_high._rassoc_2(item, alist);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject rassoc_if(SubLObject predicate, SubLObject alist) {
		SubLTrampolineFile.checkType(predicate, conses_high.$sym1$FUNCTION_SPEC_P);
		SubLTrampolineFile.checkType(alist, conses_high.$sym0$LISTP);
		if (CommonSymbols.NIL == alist)
			return CommonSymbols.NIL;
		{
			SubLObject rest = CommonSymbols.NIL;
			SubLObject entry = CommonSymbols.NIL;
			for (rest = alist, entry = rest.first(); CommonSymbols.NIL != rest; rest = rest.rest(), entry = rest
					.first())
				if (CommonSymbols.NIL != entry)
					if (CommonSymbols.NIL != Functions.funcall(predicate, entry.rest()))
						return entry;
			return CommonSymbols.NIL;
		}
	}

	/** Return a plist which has no value stored for INDICATOR in PLIST */
	@SubL(source = "sublisp/conses-high.lisp", position = 70203)
	public static SubLObject remf(SubLObject plist, SubLObject indicator) {
		{
			SubLObject back = CommonSymbols.NIL;
			SubLObject next = CommonSymbols.NIL;
			SubLObject key = CommonSymbols.NIL;
			for (back = CommonSymbols.NIL, next = plist, key = next.first(); CommonSymbols.NIL != next; back = next
					.rest(), next = conses_high.cddr(next), key = next.first())
				if (indicator == key)
					if (CommonSymbols.NIL != back) {
						ConsesLow.rplacd(back, conses_high.cddr(next));
						return plist;
					} else
						return conses_high.cddr(next);
			return plist;
		}
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject rest(SubLObject list) {
		return list.rest();
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject revappend(SubLObject list1, SubLObject list2) {
		SubLTrampolineFile.checkType(list1, conses_high.$sym0$LISTP);
		SubLTrampolineFile.checkType(list2, conses_high.$sym0$LISTP);
		if (CommonSymbols.NIL == list2)
			return Sequences.reverse(list1);
		else if (CommonSymbols.NIL == list1)
			return list2;
		{
			SubLObject answer = list2;
			SubLObject cdolist_list_var = list1;
			SubLObject item = CommonSymbols.NIL;
			for (item = cdolist_list_var
					.first(); CommonSymbols.NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var
							.rest(), item = cdolist_list_var.first())
				answer = ConsesLow.cons(item, answer);
			return answer;
		}
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject second(SubLObject list) {
		return conses_high.cadr(list);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject set_difference(SubLObject list1, SubLObject list2, SubLObject test, SubLObject key) {
		if (test == CommonSymbols.UNPROVIDED)
			test = Symbols.symbol_function(CommonSymbols.EQL);
		if (key == CommonSymbols.UNPROVIDED)
			key = Symbols.symbol_function(CommonSymbols.IDENTITY);
		SubLTrampolineFile.checkType(list1, conses_high.$sym0$LISTP);
		SubLTrampolineFile.checkType(list2, conses_high.$sym0$LISTP);
		SubLTrampolineFile.checkType(test, conses_high.$sym1$FUNCTION_SPEC_P);
		SubLTrampolineFile.checkType(key, conses_high.$sym1$FUNCTION_SPEC_P);
		if (CommonSymbols.NIL == list1)
			return CommonSymbols.NIL;
		else if (CommonSymbols.NIL == list2)
			return list1;
		if (Symbols.symbol_function(CommonSymbols.IDENTITY) != key)
			return conses_high._set_difference_4(list1, list2, test, key);
		else if (Symbols.symbol_function(CommonSymbols.EQL) != test)
			return conses_high._set_difference_3(list1, list2, test);
		else
			return conses_high._set_difference_2(list1, list2);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject set_exclusive_or(SubLObject list1, SubLObject list2, SubLObject test, SubLObject key) {
		if (test == CommonSymbols.UNPROVIDED)
			test = Symbols.symbol_function(CommonSymbols.EQL);
		if (key == CommonSymbols.UNPROVIDED)
			key = Symbols.symbol_function(CommonSymbols.IDENTITY);
		return ConsesLow.append(conses_high.set_difference(list1, list2, test, key),
				conses_high.set_difference(list2, list1, test, key));
	}

	//// Internal Constants

	public static SubLObject setup_conses_high_file() {
		// CVS_ID("Id: conses-high.lisp 126640 2008-12-04 13:39:36Z builder ");
		return CommonSymbols.NIL;
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject seventh(SubLObject list) {
		return ConsesLow.nth(CommonSymbols.SIX_INTEGER, list);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject sixth(SubLObject list) {
		return ConsesLow.nth(CommonSymbols.FIVE_INTEGER, list);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject sublis(SubLObject alist, SubLObject tree, SubLObject test, SubLObject key) {
		if (test == CommonSymbols.UNPROVIDED)
			test = Symbols.symbol_function(CommonSymbols.EQL);
		if (key == CommonSymbols.UNPROVIDED)
			key = Symbols.symbol_function(CommonSymbols.IDENTITY);
		SubLTrampolineFile.checkType(test, conses_high.$sym1$FUNCTION_SPEC_P);
		SubLTrampolineFile.checkType(key, conses_high.$sym1$FUNCTION_SPEC_P);
		if (Symbols.symbol_function(CommonSymbols.IDENTITY) != key)
			return conses_high._sublis_4(alist, tree, test, key);
		else if (CommonSymbols.NIL == alist)
			return tree;
		else if (Symbols.symbol_function(CommonSymbols.EQL) != test)
			return conses_high._sublis_3(alist, tree, test);
		else
			return conses_high._sublis_2(alist, tree);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject subsetp(SubLObject list1, SubLObject list2, SubLObject test, SubLObject key) {
		if (test == CommonSymbols.UNPROVIDED)
			test = Symbols.symbol_function(CommonSymbols.EQL);
		if (key == CommonSymbols.UNPROVIDED)
			key = Symbols.symbol_function(CommonSymbols.IDENTITY);
		SubLTrampolineFile.checkType(list1, conses_high.$sym0$LISTP);
		SubLTrampolineFile.checkType(list2, conses_high.$sym0$LISTP);
		SubLTrampolineFile.checkType(test, conses_high.$sym1$FUNCTION_SPEC_P);
		SubLTrampolineFile.checkType(key, conses_high.$sym1$FUNCTION_SPEC_P);
		if (CommonSymbols.NIL == list1)
			return CommonSymbols.T;
		else if (CommonSymbols.NIL == list2)
			return CommonSymbols.NIL;
		if (Symbols.symbol_function(CommonSymbols.IDENTITY) != key)
			return conses_high._subsetp_4(list1, list2, test, key);
		else if (Symbols.symbol_function(CommonSymbols.EQL) != test)
			return conses_high._subsetp_3(list1, list2, test);
		else
			return conses_high._subsetp_2(list1, list2);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject subst(SubLObject v_new, SubLObject old, SubLObject tree, SubLObject test, SubLObject key) {
		if (test == CommonSymbols.UNPROVIDED)
			test = Symbols.symbol_function(CommonSymbols.EQL);
		if (key == CommonSymbols.UNPROVIDED)
			key = Symbols.symbol_function(CommonSymbols.IDENTITY);
		SubLTrampolineFile.checkType(test, conses_high.$sym1$FUNCTION_SPEC_P);
		SubLTrampolineFile.checkType(key, conses_high.$sym1$FUNCTION_SPEC_P);
		if (Symbols.symbol_function(CommonSymbols.IDENTITY) != key)
			return conses_high._subst_5(v_new, old, tree, test, key);
		else if (Symbols.symbol_function(CommonSymbols.EQL) != test)
			return conses_high._subst_4(v_new, old, tree, test);
		else
			return conses_high._subst_3(v_new, old, tree);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject subst_if(SubLObject v_new, SubLObject test, SubLObject tree, SubLObject key) {
		if (key == CommonSymbols.UNPROVIDED)
			key = Symbols.symbol_function(CommonSymbols.IDENTITY);
		SubLTrampolineFile.checkType(test, conses_high.$sym1$FUNCTION_SPEC_P);
		SubLTrampolineFile.checkType(key, conses_high.$sym1$FUNCTION_SPEC_P);
		if (Symbols.symbol_function(CommonSymbols.IDENTITY) != key)
			return conses_high._subst_if_4(v_new, test, tree, key);
		else
			return conses_high._subst_if_3(v_new, test, tree);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject tailp(SubLObject sublist, SubLObject list) {
		SubLTrampolineFile.checkType(list, conses_high.$sym0$LISTP);
		{
			SubLObject rest = CommonSymbols.NIL;
			for (rest = list; !rest.isAtom(); rest = rest.rest())
				if (sublist.eql(rest))
					return CommonSymbols.T;
			return Equality.eql(sublist, rest);
		}
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject tenth(SubLObject list) {
		return ConsesLow.nth(CommonSymbols.NINE_INTEGER, list);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject third(SubLObject list) {
		return ConsesLow.nth(CommonSymbols.TWO_INTEGER, list);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject tree_equal(SubLObject tree1, SubLObject tree2, SubLObject test) {
		if (test == CommonSymbols.UNPROVIDED)
			test = Symbols.symbol_function(CommonSymbols.EQL);
		SubLTrampolineFile.checkType(test, conses_high.$sym1$FUNCTION_SPEC_P);
		if (Symbols.symbol_function(CommonSymbols.EQL) != test)
			return conses_high._tree_equal_3(tree1, tree2, test);
		else
			return conses_high._tree_equal_2(tree1, tree2);
	}

	@SubL(source = "sublisp/conses-high.lisp", position = 1938)
	public static SubLObject union(SubLObject list1, SubLObject list2, SubLObject test, SubLObject key) {
		if (test == CommonSymbols.UNPROVIDED)
			test = Symbols.symbol_function(CommonSymbols.EQL);
		if (key == CommonSymbols.UNPROVIDED)
			key = Symbols.symbol_function(CommonSymbols.IDENTITY);
		SubLTrampolineFile.checkType(list1, conses_high.$sym0$LISTP);
		SubLTrampolineFile.checkType(list2, conses_high.$sym0$LISTP);
		SubLTrampolineFile.checkType(test, conses_high.$sym1$FUNCTION_SPEC_P);
		SubLTrampolineFile.checkType(key, conses_high.$sym1$FUNCTION_SPEC_P);
		if (CommonSymbols.NIL == list1)
			return list2;
		else if (CommonSymbols.NIL == list2)
			return list1;
		if (Symbols.symbol_function(CommonSymbols.IDENTITY) != key)
			return conses_high._union_4(list1, list2, test, key);
		else if (Symbols.symbol_function(CommonSymbols.EQL) != test)
			return conses_high._union_3(list1, list2, test);
		else
			return conses_high._union_2(list1, list2);
	}

	private conses_high() {
	}

	//// Initializers

	public void declareFunctions() {
		conses_high.declare_conses_high_file();
	}

	public void initializeVariables() {
		conses_high.init_conses_high_file();
	}

	public void runTopLevelForms() {
		conses_high.setup_conses_high_file();
	}

}
