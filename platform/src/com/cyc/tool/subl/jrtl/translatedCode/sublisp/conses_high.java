/**
 *
 */
/**
 * For LarKC
 */
/**
 *
 */
package com.cyc.tool.subl.jrtl.translatedCode.sublisp;

import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.BinaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLCons;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLNumberFactory;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLNil;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public class conses_high extends SubLTranslatedFile {
    public static class $union$BinaryFunction extends BinaryFunction {
	public $union$BinaryFunction() {
	    super(extractFunctionNamed("UNION"));
	}

	@Override
	public SubLObject processItem(SubLObject arg1, SubLObject arg2) {
	    return union(arg1, arg2, UNPROVIDED, UNPROVIDED);
	}
    }

    private static final SubLObject $list391 = list(((makeSymbol("INLINE-SET-SYMBOL"))), ((makeSymbol("INLINE-GET-SYMBOL"))), ((makeSymbol("INLINE-METHOD"))));

    public static SubLObject _assoc_2(SubLObject item, SubLObject alist) {
	SubLObject rest = SubLNil.NIL;
	SubLObject entry = SubLNil.NIL;
	rest = alist;
	entry = rest.first();
	while (SubLNil.NIL != rest) {
	    if ((SubLNil.NIL != entry) && item.eql(entry.first()))
		return entry;

	    rest = rest.rest();
	    entry = rest.first();
	}
	return SubLNil.NIL;
    }

    public static SubLObject _assoc_3(SubLObject item, SubLObject alist, SubLObject test) {
	SubLObject rest = SubLNil.NIL;
	SubLObject entry = SubLNil.NIL;
	rest = alist;
	entry = rest.first();
	while (SubLNil.NIL != rest) {
	    if (SubLNil.NIL != entry) {
		final SubLObject first2 = entry.first();
		if (NIL != funcall(test, item, first2))
		    return entry;

	    }
	    rest = rest.rest();
	    entry = rest.first();
	}
	return SubLNil.NIL;
    }

    public static SubLObject _assoc_4(SubLObject item, SubLObject alist, SubLObject test, SubLObject key) {
	SubLObject rest = SubLNil.NIL;
	SubLObject entry = SubLNil.NIL;
	rest = alist;
	entry = rest.first();
	while (SubLNil.NIL != rest) {
	    if ((SubLNil.NIL != entry) && (SubLNil.NIL != funcall(test, item, funcall(key, entry.first()))))
		return entry;

	    rest = rest.rest();
	    entry = rest.first();
	}
	return SubLNil.NIL;
    }

    public static SubLObject _cons_length(SubLObject list) {
	assert SubLNil.NIL != listp(list) : list;
	if (SubLNil.NIL == list)
	    return ZERO_INTEGER;

	if (list.rest().isAtom())
	    return ONE_INTEGER;

	if (list instanceof SubLCons)
	    return SubLNumberFactory.makeInteger(((SubLCons) (list)).consLength());

	SubLObject slow;
	SubLObject fast;
	SubLObject length;
	for (slow = SubLNil.NIL, fast = SubLNil.NIL, length = SubLNil.NIL, slow = list.rest(), fast = cddr(list), length = TWO_INTEGER; !fast.eql(slow); slow = slow.rest(), fast = cddr(fast), length = add(TWO_INTEGER, length)) {
	    if (fast.isAtom())
		return length;

	    if (fast.rest().isAtom())
		return add(ONE_INTEGER, length);

	}
	return SubLNil.NIL;
    }

    public static SubLObject _intersection_2(SubLObject list1, SubLObject list2) {
	SubLObject answer = SubLNil.NIL;
	SubLObject cdolist_list_var = list1;
	SubLObject item = SubLNil.NIL;
	item = cdolist_list_var.first();
	while (SubLNil.NIL != cdolist_list_var) {
	    if (SubLNil.NIL != _member_2(item, list2))
		answer = cons(item, answer);

	    cdolist_list_var = cdolist_list_var.rest();
	    item = cdolist_list_var.first();
	}
	return answer;
    }

    public static SubLObject _intersection_3(SubLObject list1, SubLObject list2, SubLObject test) {
	SubLObject answer = SubLNil.NIL;
	SubLObject cdolist_list_var = list1;
	SubLObject item = SubLNil.NIL;
	item = cdolist_list_var.first();
	while (SubLNil.NIL != cdolist_list_var) {
	    if (SubLNil.NIL != _member_3(item, list2, test))
		answer = cons(item, answer);

	    cdolist_list_var = cdolist_list_var.rest();
	    item = cdolist_list_var.first();
	}
	return answer;
    }

    public static SubLObject _intersection_4(SubLObject list1, SubLObject list2, SubLObject test, SubLObject key) {
	SubLObject answer = SubLNil.NIL;
	SubLObject cdolist_list_var = list1;
	SubLObject item = SubLNil.NIL;
	item = cdolist_list_var.first();
	while (SubLNil.NIL != cdolist_list_var) {
	    if (SubLNil.NIL != _member_4(funcall(key, item), list2, test, key))
		answer = cons(item, answer);

	    cdolist_list_var = cdolist_list_var.rest();
	    item = cdolist_list_var.first();
	}
	return answer;
    }

    public static SubLObject _member_2(SubLObject item, SubLObject list) {
	SubLObject rest;
	for (rest = SubLNil.NIL, rest = list; SubLNil.NIL != rest; rest = rest.rest())
	    if (item.eql(rest.first()))
		return rest;

	return SubLNil.NIL;
    }

    public static SubLObject _member_3(SubLObject item, SubLObject list, SubLObject test) {
	SubLObject rest;
	for (rest = SubLNil.NIL, rest = list; SubLNil.NIL != rest; rest = rest.rest())
	    if (SubLNil.NIL != funcall(test, item, rest.first()))
		return rest;

	return SubLNil.NIL;
    }

    public static SubLObject _member_4(SubLObject item, SubLObject list, SubLObject test, SubLObject key) {
	SubLObject rest;
	for (rest = SubLNil.NIL, rest = list; SubLNil.NIL != rest; rest = rest.rest())
	    if (SubLNil.NIL != funcall(test, item, funcall(key, rest.first())))
		return rest;

	return SubLNil.NIL;
    }

    public static SubLObject _member_if_2(SubLObject test, SubLObject list) {
	SubLObject rest;
	for (rest = SubLNil.NIL, rest = list; SubLNil.NIL != rest; rest = rest.rest())
	    if (SubLNil.NIL != funcall(test, rest.first()))
		return rest;

	return SubLNil.NIL;
    }

    public static SubLObject _member_if_3(SubLObject test, SubLObject list, SubLObject key) {
	SubLObject rest;
	for (rest = SubLNil.NIL, rest = list; SubLNil.NIL != rest; rest = rest.rest())
	    if (SubLNil.NIL != funcall(test, funcall(key, rest.first())))
		return rest;

	return SubLNil.NIL;
    }

    public static SubLObject _ncons(SubLObject car, SubLObject cdr, SubLObject cons) {
	if (!car.eql(cons.first()))
	    rplaca(cons, car);

	if (!cdr.eql(cons.rest()))
	    rplacd(cons, cdr);

	return cons;
    }

    public static SubLObject _nintersection_2(SubLObject list1, SubLObject list2) {
	SubLObject answer = SubLNil.NIL;
	SubLObject rest = SubLNil.NIL;
	SubLObject item = SubLNil.NIL;
	rest = list1;
	item = rest.first();
	while ((SubLNil.NIL == answer) && (SubLNil.NIL != rest)) {
	    if (SubLNil.NIL != _member_2(item, list2))
		answer = rest;

	    rest = rest.rest();
	    item = rest.first();
	}
	if (SubLNil.NIL == answer)
	    return SubLNil.NIL;

	SubLObject back = answer;
	SubLObject next = SubLNil.NIL;
	SubLObject item2 = SubLNil.NIL;
	next = answer.rest();
	item2 = next.first();
	while (SubLNil.NIL != next) {
	    if (SubLNil.NIL != _member_2(item2, list2))
		back = next;
	    else
		rplacd(back, next.rest());

	    next = next.rest();
	    item2 = next.first();
	}
	return answer;
    }

    public static SubLObject _nintersection_3(SubLObject list1, SubLObject list2, SubLObject test) {
	SubLObject answer = SubLNil.NIL;
	SubLObject rest = SubLNil.NIL;
	SubLObject item = SubLNil.NIL;
	rest = list1;
	item = rest.first();
	while ((SubLNil.NIL == answer) && (SubLNil.NIL != rest)) {
	    if (SubLNil.NIL != _member_3(item, list2, test))
		answer = rest;

	    rest = rest.rest();
	    item = rest.first();
	}
	if (SubLNil.NIL == answer)
	    return SubLNil.NIL;

	SubLObject back = answer;
	SubLObject next = SubLNil.NIL;
	SubLObject item2 = SubLNil.NIL;
	next = answer.rest();
	item2 = next.first();
	while (SubLNil.NIL != next) {
	    if (SubLNil.NIL != _member_3(item2, list2, test))
		back = next;
	    else
		rplacd(back, next.rest());

	    next = next.rest();
	    item2 = next.first();
	}
	return answer;
    }

    public static SubLObject _nintersection_4(SubLObject list1, SubLObject list2, SubLObject test, SubLObject key) {
	SubLObject answer = SubLNil.NIL;
	SubLObject rest = SubLNil.NIL;
	SubLObject item = SubLNil.NIL;
	rest = list1;
	item = rest.first();
	while ((SubLNil.NIL == answer) && (SubLNil.NIL != rest)) {
	    if (SubLNil.NIL != _member_4(funcall(key, item), list2, test, key))
		answer = rest;

	    rest = rest.rest();
	    item = rest.first();
	}
	if (SubLNil.NIL == answer)
	    return SubLNil.NIL;

	SubLObject back = answer;
	SubLObject next = SubLNil.NIL;
	SubLObject item2 = SubLNil.NIL;
	next = back.rest();
	item2 = next.first();
	while (SubLNil.NIL != next) {
	    if (SubLNil.NIL != _member_4(funcall(key, item2), list2, test, key))
		back = next;
	    else
		rplacd(back, next.rest());

	    next = next.rest();
	    item2 = next.first();
	}
	return answer;
    }

    public static SubLObject _nset_difference_2(SubLObject list1, SubLObject list2) {
	SubLObject answer = SubLNil.NIL;
	SubLObject rest = SubLNil.NIL;
	SubLObject item = SubLNil.NIL;
	rest = list1;
	item = rest.first();
	while ((SubLNil.NIL == answer) && (SubLNil.NIL != rest)) {
	    if (SubLNil.NIL == _member_2(item, list2))
		answer = rest;

	    rest = rest.rest();
	    item = rest.first();
	}
	if (SubLNil.NIL == answer)
	    return SubLNil.NIL;

	SubLObject back = answer;
	SubLObject next = SubLNil.NIL;
	SubLObject item2 = SubLNil.NIL;
	next = back.rest();
	item2 = next.first();
	while (SubLNil.NIL != next) {
	    if (SubLNil.NIL == _member_2(item2, list2))
		back = next;
	    else
		rplacd(back, next.rest());

	    next = next.rest();
	    item2 = next.first();
	}
	return answer;
    }

    public static SubLObject _nset_difference_3(SubLObject list1, SubLObject list2, SubLObject test) {
	SubLObject answer = SubLNil.NIL;
	SubLObject rest = SubLNil.NIL;
	SubLObject item = SubLNil.NIL;
	rest = list1;
	item = rest.first();
	while ((SubLNil.NIL == answer) && (SubLNil.NIL != rest)) {
	    if (SubLNil.NIL == _member_3(item, list2, test))
		answer = rest;

	    rest = rest.rest();
	    item = rest.first();
	}
	if (SubLNil.NIL == answer)
	    return SubLNil.NIL;

	SubLObject back = answer;
	SubLObject next = SubLNil.NIL;
	SubLObject item2 = SubLNil.NIL;
	next = back.rest();
	item2 = next.first();
	while (SubLNil.NIL != next) {
	    if (SubLNil.NIL == _member_3(item2, list2, test))
		back = next;
	    else
		rplacd(back, next.rest());

	    next = next.rest();
	    item2 = next.first();
	}
	return answer;
    }

    public static SubLObject _nset_difference_4(SubLObject list1, SubLObject list2, SubLObject test, SubLObject key) {
	SubLObject answer = SubLNil.NIL;
	SubLObject rest = SubLNil.NIL;
	SubLObject item = SubLNil.NIL;
	rest = list1;
	item = rest.first();
	while ((SubLNil.NIL == answer) && (SubLNil.NIL != rest)) {
	    if (SubLNil.NIL == _member_4(funcall(key, item), list2, test, key))
		answer = rest;

	    rest = rest.rest();
	    item = rest.first();
	}
	if (SubLNil.NIL == answer)
	    return SubLNil.NIL;

	SubLObject back = answer;
	SubLObject next = SubLNil.NIL;
	SubLObject item2 = SubLNil.NIL;
	next = back.rest();
	item2 = next.first();
	while (SubLNil.NIL != next) {
	    if (SubLNil.NIL == _member_4(funcall(key, item2), list2, test, key))
		back = next;
	    else
		rplacd(back, next.rest());

	    next = next.rest();
	    item2 = next.first();
	}
	return answer;
    }

    public static SubLObject _nsublis_2(SubLObject alist, SubLObject tree) {
	SubLObject cdolist_list_var = alist;
	SubLObject entry = SubLNil.NIL;
	entry = cdolist_list_var.first();
	while (SubLNil.NIL != cdolist_list_var) {
	    if ((SubLNil.NIL != entry) && entry.first().eql(tree))
		return entry.rest();

	    cdolist_list_var = cdolist_list_var.rest();
	    entry = cdolist_list_var.first();
	}
	if (tree.isAtom())
	    return tree;

	SubLObject tree_cons = SubLNil.NIL;
	SubLObject tree_car = SubLNil.NIL;
	SubLObject tree_cdr = SubLNil.NIL;
	tree_cons = tree;
	tree_car = tree_cons.first();
	tree_cdr = tree_cons.rest();
	while (SubLNil.NIL != tree_cons) {
	    rplaca(tree_cons, _nsublis_2(alist, tree_car));
	    if (!tree_cdr.isList()) {
		rplacd(tree_cons, _nsublis_2(alist, tree_cdr));
		return tree;
	    }
	    tree_cons = tree_cons.rest();
	    tree_car = tree_cons.first();
	    tree_cdr = tree_cons.rest();
	}
	return tree;
    }

    public static SubLObject _nsublis_3(SubLObject alist, SubLObject tree, SubLObject test) {
	SubLObject cdolist_list_var = alist;
	SubLObject entry = SubLNil.NIL;
	entry = cdolist_list_var.first();
	while (SubLNil.NIL != cdolist_list_var) {
	    if ((SubLNil.NIL != entry) && (SubLNil.NIL != funcall(test, entry.first(), tree)))
		return entry.rest();

	    cdolist_list_var = cdolist_list_var.rest();
	    entry = cdolist_list_var.first();
	}
	if (tree.isAtom())
	    return tree;

	SubLObject tree_cons = SubLNil.NIL;
	SubLObject tree_car = SubLNil.NIL;
	SubLObject tree_cdr = SubLNil.NIL;
	tree_cons = tree;
	tree_car = tree_cons.first();
	tree_cdr = tree_cons.rest();
	while (SubLNil.NIL != tree_cons) {
	    rplaca(tree_cons, _nsublis_3(alist, tree_car, test));
	    if (!tree_cdr.isList()) {
		rplacd(tree_cons, _nsublis_3(alist, tree_cdr, test));
		return tree;
	    }
	    tree_cons = tree_cons.rest();
	    tree_car = tree_cons.first();
	    tree_cdr = tree_cons.rest();
	}
	return tree;
    }

    public static SubLObject _nsublis_4(SubLObject alist, SubLObject tree, SubLObject test, SubLObject key) {
	SubLObject tree_key = funcall(key, tree);
	SubLObject cdolist_list_var = alist;
	SubLObject entry = SubLNil.NIL;
	entry = cdolist_list_var.first();
	while (SubLNil.NIL != cdolist_list_var) {
	    if ((SubLNil.NIL != entry) && (SubLNil.NIL != funcall(test, entry.first(), tree_key)))
		return entry.rest();

	    cdolist_list_var = cdolist_list_var.rest();
	    entry = cdolist_list_var.first();
	}
	if (tree.isAtom())
	    return tree;

	SubLObject tree_cons = SubLNil.NIL;
	SubLObject tree_car = SubLNil.NIL;
	SubLObject tree_cdr = SubLNil.NIL;
	tree_cons = tree;
	tree_car = tree_cons.first();
	tree_cdr = tree_cons.rest();
	while (SubLNil.NIL != tree_cons) {
	    rplaca(tree_cons, _nsublis_4(alist, tree_car, test, key));
	    if (!tree_cdr.isList()) {
		rplacd(tree_cons, _nsublis_4(alist, tree_cdr, test, key));
		return tree;
	    }
	    tree_cons = tree_cons.rest();
	    tree_car = tree_cons.first();
	    tree_cdr = tree_cons.rest();
	}
	return tree;
    }

    public static SubLObject _nsubst_3(SubLObject v_new, SubLObject old, SubLObject tree) {
	if (old.eql(tree))
	    return v_new;

	if (tree.isAtom())
	    return tree;

	SubLObject tree_car = tree.first();
	SubLObject tree_cdr = tree.rest();
	SubLObject new_car = _nsubst_3(v_new, old, tree_car);
	SubLObject new_cdr = _nsubst_3(v_new, old, tree_cdr);
	return _ncons(new_car, new_cdr, tree);
    }

    public static SubLObject _nsubst_4(SubLObject v_new, SubLObject old, SubLObject tree, SubLObject test) {
	if (SubLNil.NIL != funcall(test, old, tree))
	    return v_new;

	if (tree.isAtom())
	    return tree;

	SubLObject tree_car = tree.first();
	SubLObject tree_cdr = tree.rest();
	SubLObject new_car = _nsubst_4(v_new, old, tree_car, test);
	SubLObject new_cdr = _nsubst_4(v_new, old, tree_cdr, test);
	return _ncons(new_car, new_cdr, tree);
    }

    public static SubLObject _nsubst_5(SubLObject v_new, SubLObject old, SubLObject tree, SubLObject test, SubLObject key) {
	if (SubLNil.NIL != funcall(test, old, funcall(key, tree)))
	    return v_new;

	if (tree.isAtom())
	    return tree;

	SubLObject tree_car = tree.first();
	SubLObject tree_cdr = tree.rest();
	SubLObject new_car = _nsubst_5(v_new, old, tree_car, test, key);
	SubLObject new_cdr = _nsubst_5(v_new, old, tree_cdr, test, key);
	return _ncons(new_car, new_cdr, tree);
    }

    public static SubLObject _nsubst_if_3(SubLObject v_new, SubLObject test, SubLObject tree) {
	if (SubLNil.NIL != funcall(test, tree))
	    return v_new;

	if (tree.isAtom())
	    return tree;

	SubLObject tree_car = tree.first();
	SubLObject tree_cdr = tree.rest();
	SubLObject new_car = _nsubst_if_3(v_new, test, tree_car);
	SubLObject new_cdr = _nsubst_if_3(v_new, test, tree_cdr);
	return _ncons(new_car, new_cdr, tree);
    }

    public static SubLObject _nsubst_if_4(SubLObject v_new, SubLObject test, SubLObject tree, SubLObject key) {
	if (SubLNil.NIL != funcall(test, funcall(key, tree)))
	    return v_new;

	if (tree.isAtom())
	    return tree;

	SubLObject tree_car = tree.first();
	SubLObject tree_cdr = tree.rest();
	SubLObject new_car = _nsubst_if_4(v_new, test, tree_car, key);
	SubLObject new_cdr = _nsubst_if_4(v_new, test, tree_cdr, key);
	return _ncons(new_car, new_cdr, tree);
    }

    public static SubLObject _nunion_2(SubLObject list1, SubLObject list2) {
	SubLObject runner = last(list1, UNPROVIDED);
	SubLObject cdolist_list_var = list2;
	SubLObject item = SubLNil.NIL;
	item = cdolist_list_var.first();
	while (SubLNil.NIL != cdolist_list_var) {
	    if (SubLNil.NIL == _member_2(item, list1)) {
		runner = rplacd(runner, cons(item, SubLNil.NIL));
		runner = runner.rest();
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    item = cdolist_list_var.first();
	}
	return list1;
    }

    public static SubLObject _nunion_3(SubLObject list1, SubLObject list2, SubLObject test) {
	SubLObject runner = last(list1, UNPROVIDED);
	SubLObject cdolist_list_var = list2;
	SubLObject item = SubLNil.NIL;
	item = cdolist_list_var.first();
	while (SubLNil.NIL != cdolist_list_var) {
	    if (SubLNil.NIL == _member_3(item, list1, test)) {
		runner = rplacd(runner, cons(item, SubLNil.NIL));
		runner = runner.rest();
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    item = cdolist_list_var.first();
	}
	return list1;
    }

    public static SubLObject _nunion_4(SubLObject list1, SubLObject list2, SubLObject test, SubLObject key) {
	SubLObject runner = last(list1, UNPROVIDED);
	SubLObject cdolist_list_var = list2;
	SubLObject item = SubLNil.NIL;
	item = cdolist_list_var.first();
	while (SubLNil.NIL != cdolist_list_var) {
	    if (SubLNil.NIL == _member_4(funcall(key, item), list1, test, key)) {
		runner = rplacd(runner, cons(item, SubLNil.NIL));
		runner = runner.rest();
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    item = cdolist_list_var.first();
	}
	return list1;
    }

    public static SubLObject _rassoc_2(SubLObject item, SubLObject alist) {
	SubLObject rest = SubLNil.NIL;
	SubLObject entry = SubLNil.NIL;
	rest = alist;
	entry = rest.first();
	while (SubLNil.NIL != rest) {
	    if ((SubLNil.NIL != entry) && item.eql(entry.rest()))
		return entry;

	    rest = rest.rest();
	    entry = rest.first();
	}
	return SubLNil.NIL;
    }

    public static SubLObject _rassoc_3(SubLObject item, SubLObject alist, SubLObject test) {
	SubLObject rest = SubLNil.NIL;
	SubLObject entry = SubLNil.NIL;
	rest = alist;
	entry = rest.first();
	while (SubLNil.NIL != rest) {
	    if ((SubLNil.NIL != entry) && (SubLNil.NIL != funcall(test, item, entry.rest())))
		return entry;

	    rest = rest.rest();
	    entry = rest.first();
	}
	return SubLNil.NIL;
    }

    public static SubLObject _rassoc_4(SubLObject item, SubLObject alist, SubLObject test, SubLObject key) {
	SubLObject rest = SubLNil.NIL;
	SubLObject entry = SubLNil.NIL;
	rest = alist;
	entry = rest.first();
	while (SubLNil.NIL != rest) {
	    if ((SubLNil.NIL != entry) && (SubLNil.NIL != funcall(test, item, funcall(key, entry.rest()))))
		return entry;

	    rest = rest.rest();
	    entry = rest.first();
	}
	return SubLNil.NIL;
    }

    public static SubLObject _recons(SubLObject car, SubLObject cdr, SubLObject cons) {
	if (car.eql(cons.first()) && cdr.eql(cons.rest()))
	    return cons;

	return cons(car, cdr);
    }

    public static SubLObject _set_difference_2(SubLObject list1, SubLObject list2) {
	SubLObject answer = SubLNil.NIL;
	SubLObject cdolist_list_var = list1;
	SubLObject item = SubLNil.NIL;
	item = cdolist_list_var.first();
	while (SubLNil.NIL != cdolist_list_var) {
	    if (SubLNil.NIL == _member_2(item, list2))
		answer = cons(item, answer);

	    cdolist_list_var = cdolist_list_var.rest();
	    item = cdolist_list_var.first();
	}
	return answer;
    }

    public static SubLObject _set_difference_3(SubLObject list1, SubLObject list2, SubLObject test) {
	SubLObject answer = SubLNil.NIL;
	SubLObject cdolist_list_var = list1;
	SubLObject item = SubLNil.NIL;
	item = cdolist_list_var.first();
	while (SubLNil.NIL != cdolist_list_var) {
	    if (SubLNil.NIL == _member_3(item, list2, test))
		answer = cons(item, answer);

	    cdolist_list_var = cdolist_list_var.rest();
	    item = cdolist_list_var.first();
	}
	return answer;
    }

    public static SubLObject _set_difference_4(SubLObject list1, SubLObject list2, SubLObject test, SubLObject key) {
	SubLObject answer = SubLNil.NIL;
	SubLObject cdolist_list_var = list1;
	SubLObject item = SubLNil.NIL;
	item = cdolist_list_var.first();
	while (SubLNil.NIL != cdolist_list_var) {
	    if (SubLNil.NIL == _member_4(funcall(key, item), list2, test, key))
		answer = cons(item, answer);

	    cdolist_list_var = cdolist_list_var.rest();
	    item = cdolist_list_var.first();
	}
	return answer;
    }

    public static SubLObject _sublis_2(SubLObject alist, SubLObject tree) {
	SubLObject cdolist_list_var = alist;
	SubLObject entry = SubLNil.NIL;
	entry = cdolist_list_var.first();
	while (SubLNil.NIL != cdolist_list_var) {
	    if ((SubLNil.NIL != entry) && entry.first().eql(tree))
		return entry.rest();

	    cdolist_list_var = cdolist_list_var.rest();
	    entry = cdolist_list_var.first();
	}
	if (tree.isAtom())
	    return tree;

	if (tree.isCons() && _cons_length(tree).numG($sublis_watermark$.getGlobalValue())) {
	    SubLObject new_tree = copy_list(tree);
	    SubLObject tree_cons = SubLNil.NIL;
	    SubLObject tree_car = SubLNil.NIL;
	    SubLObject tree_cdr = SubLNil.NIL;
	    tree_cons = new_tree;
	    tree_car = tree_cons.first();
	    tree_cdr = tree_cons.rest();
	    while (SubLNil.NIL != tree_cons) {
		rplaca(tree_cons, _sublis_2(alist, tree_car));
		if (!tree_cdr.isList()) {
		    rplacd(tree_cons, _sublis_2(alist, tree_cdr));
		    return new_tree;
		}
		tree_cons = tree_cons.rest();
		tree_car = tree_cons.first();
		tree_cdr = tree_cons.rest();
	    }
	    return new_tree;
	}
	SubLObject tree_car2 = tree.first();
	SubLObject tree_cdr2 = tree.rest();
	SubLObject new_car = _sublis_2(alist, tree_car2);
	SubLObject new_cdr = _sublis_2(alist, tree_cdr2);
	return _recons(new_car, new_cdr, tree);
    }

    public static SubLObject _sublis_3(SubLObject alist, SubLObject tree, SubLObject test) {
	SubLObject cdolist_list_var = alist;
	SubLObject entry = SubLNil.NIL;
	entry = cdolist_list_var.first();
	while (SubLNil.NIL != cdolist_list_var) {
	    if ((SubLNil.NIL != entry) && (SubLNil.NIL != funcall(test, entry.first(), tree)))
		return entry.rest();

	    cdolist_list_var = cdolist_list_var.rest();
	    entry = cdolist_list_var.first();
	}
	if (tree.isAtom())
	    return tree;

	if (tree.isCons() && _cons_length(tree).numG($sublis_watermark$.getGlobalValue())) {
	    SubLObject new_tree = copy_list(tree);
	    SubLObject tree_cons = SubLNil.NIL;
	    SubLObject tree_car = SubLNil.NIL;
	    SubLObject tree_cdr = SubLNil.NIL;
	    tree_cons = new_tree;
	    tree_car = tree_cons.first();
	    tree_cdr = tree_cons.rest();
	    while (SubLNil.NIL != tree_cons) {
		rplaca(tree_cons, _sublis_3(alist, tree_car, test));
		if (!tree_cdr.isList()) {
		    rplacd(tree_cons, _sublis_3(alist, tree_cdr, test));
		    return new_tree;
		}
		tree_cons = tree_cons.rest();
		tree_car = tree_cons.first();
		tree_cdr = tree_cons.rest();
	    }
	    return new_tree;
	}
	SubLObject tree_car2 = tree.first();
	SubLObject tree_cdr2 = tree.rest();
	SubLObject new_car = _sublis_3(alist, tree_car2, test);
	SubLObject new_cdr = _sublis_3(alist, tree_cdr2, test);
	return _recons(new_car, new_cdr, tree);
    }

    public static SubLObject _sublis_4(SubLObject alist, SubLObject tree, SubLObject test, SubLObject key) {
	SubLObject tree_key = funcall(key, tree);
	SubLObject cdolist_list_var = alist;
	SubLObject entry = SubLNil.NIL;
	entry = cdolist_list_var.first();
	while (SubLNil.NIL != cdolist_list_var) {
	    if ((SubLNil.NIL != entry) && (SubLNil.NIL != funcall(test, entry.first(), tree_key)))
		return entry.rest();

	    cdolist_list_var = cdolist_list_var.rest();
	    entry = cdolist_list_var.first();
	}
	if (tree.isAtom())
	    return tree;

	if (tree.isCons() && _cons_length(tree).numG($sublis_watermark$.getGlobalValue())) {
	    SubLObject new_tree = copy_list(tree);
	    SubLObject tree_cons = SubLNil.NIL;
	    SubLObject tree_car = SubLNil.NIL;
	    SubLObject tree_cdr = SubLNil.NIL;
	    tree_cons = new_tree;
	    tree_car = tree_cons.first();
	    tree_cdr = tree_cons.rest();
	    while (SubLNil.NIL != tree_cons) {
		rplaca(tree_cons, _sublis_4(alist, tree_car, test, key));
		if (!tree_cdr.isList()) {
		    rplacd(tree_cons, _sublis_4(alist, tree_cdr, test, key));
		    return new_tree;
		}
		tree_cons = tree_cons.rest();
		tree_car = tree_cons.first();
		tree_cdr = tree_cons.rest();
	    }
	    return new_tree;
	}
	SubLObject tree_car2 = tree.first();
	SubLObject tree_cdr2 = tree.rest();
	SubLObject new_car = _sublis_4(alist, tree_car2, test, key);
	SubLObject new_cdr = _sublis_4(alist, tree_cdr2, test, key);
	return _recons(new_car, new_cdr, tree);
    }

    public static SubLObject _subsetp_2(SubLObject list1, SubLObject list2) {
	SubLObject cdolist_list_var = list1;
	SubLObject item = SubLNil.NIL;
	item = cdolist_list_var.first();
	while (SubLNil.NIL != cdolist_list_var) {
	    if (SubLNil.NIL == _member_2(item, list2))
		return SubLNil.NIL;

	    cdolist_list_var = cdolist_list_var.rest();
	    item = cdolist_list_var.first();
	}
	return T;
    }

    public static SubLObject _subsetp_3(SubLObject list1, SubLObject list2, SubLObject test) {
	SubLObject cdolist_list_var = list1;
	SubLObject item = SubLNil.NIL;
	item = cdolist_list_var.first();
	while (SubLNil.NIL != cdolist_list_var) {
	    if (SubLNil.NIL == _member_3(item, list2, test))
		return SubLNil.NIL;

	    cdolist_list_var = cdolist_list_var.rest();
	    item = cdolist_list_var.first();
	}
	return T;
    }

    public static SubLObject _subsetp_4(SubLObject list1, SubLObject list2, SubLObject test, SubLObject key) {
	SubLObject cdolist_list_var = list1;
	SubLObject item = SubLNil.NIL;
	item = cdolist_list_var.first();
	while (SubLNil.NIL != cdolist_list_var) {
	    if (SubLNil.NIL == _member_4(funcall(key, item), list2, test, key))
		return SubLNil.NIL;

	    cdolist_list_var = cdolist_list_var.rest();
	    item = cdolist_list_var.first();
	}
	return T;
    }

    public static SubLObject _subst_3(SubLObject v_new, SubLObject old, SubLObject tree) {
	if (old.eql(tree))
	    return v_new;

	if (tree.isAtom())
	    return tree;

	SubLObject tree_car = tree.first();
	SubLObject tree_cdr = tree.rest();
	SubLObject new_car = _subst_3(v_new, old, tree_car);
	SubLObject new_cdr = _subst_3(v_new, old, tree_cdr);
	return _recons(new_car, new_cdr, tree);
    }

    public static SubLObject _subst_4(SubLObject v_new, SubLObject old, SubLObject tree, SubLObject test) {
	if (SubLNil.NIL != funcall(test, old, tree))
	    return v_new;

	if (tree.isAtom())
	    return tree;

	SubLObject tree_car = tree.first();
	SubLObject tree_cdr = tree.rest();
	SubLObject new_car = _subst_4(v_new, old, tree_car, test);
	SubLObject new_cdr = _subst_4(v_new, old, tree_cdr, test);
	return _recons(new_car, new_cdr, tree);
    }

    public static SubLObject _subst_5(SubLObject v_new, SubLObject old, SubLObject tree, SubLObject test, SubLObject key) {
	if (SubLNil.NIL != funcall(test, old, funcall(key, tree)))
	    return v_new;

	if (tree.isAtom())
	    return tree;

	SubLObject tree_car = tree.first();
	SubLObject tree_cdr = tree.rest();
	SubLObject new_car = _subst_5(v_new, old, tree_car, test, key);
	SubLObject new_cdr = _subst_5(v_new, old, tree_cdr, test, key);
	return _recons(new_car, new_cdr, tree);
    }

    public static SubLObject _subst_if_3(SubLObject v_new, SubLObject test, SubLObject tree) {
	if (SubLNil.NIL != funcall(test, tree))
	    return v_new;

	if (tree.isAtom())
	    return tree;

	SubLObject tree_car = tree.first();
	SubLObject tree_cdr = tree.rest();
	SubLObject new_car = _subst_if_3(v_new, test, tree_car);
	SubLObject new_cdr = _subst_if_3(v_new, test, tree_cdr);
	return _recons(new_car, new_cdr, tree);
    }

    public static SubLObject _subst_if_4(SubLObject v_new, SubLObject test, SubLObject tree, SubLObject key) {
	if (SubLNil.NIL != funcall(test, funcall(key, tree)))
	    return v_new;

	if (tree.isAtom())
	    return tree;

	SubLObject tree_car = tree.first();
	SubLObject tree_cdr = tree.rest();
	SubLObject new_car = _subst_if_4(v_new, test, tree_car, key);
	SubLObject new_cdr = _subst_if_4(v_new, test, tree_cdr, key);
	return _recons(new_car, new_cdr, tree);
    }

    public static final SubLObject symbol_in_tree_p(final SubLObject symbol, final SubLObject tree) {
	if (NIL == tree) {
	    return ((NIL));
	}
	if (tree.isSymbol()) {
	    return eq(symbol, tree);
	}
	if (tree.isCons()) {
	    return ((makeBoolean((NIL != symbol_in_tree_p(symbol, tree.first())) || (NIL != symbol_in_tree_p(symbol, tree.rest())))));
	}
	return ((NIL));
    }

    public static final SubLObject unquoted_symbol_in_tree_p(final SubLObject symbol, final SubLObject tree) {
	if (NIL == tree) {
	    return ((NIL));
	}
	if (tree.isSymbol()) {
	    return eq(symbol, tree);
	}
	if (!tree.isCons()) {
	    return ((NIL));
	}
	if (NIL == member(tree.first(), (($list391)), ((UNPROVIDED)), ((UNPROVIDED)))) {
	    return ((makeBoolean((NIL != symbol_in_tree_p(symbol, tree.first())) || (NIL != symbol_in_tree_p(symbol, tree.rest())))));
	}
	if ((tree.rest().isCons() && cadr(tree).isCons()) && cddr(tree).isList()) {
	    SubLObject cdolist_list_var = cddr(tree);
	    SubLObject arg = ((NIL));
	    arg = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		if (NIL != unquoted_symbol_in_tree_p(symbol, arg)) {
		    return ((T));
		}
		cdolist_list_var = cdolist_list_var.rest();
		arg = cdolist_list_var.first();
	    }
	    return ((NIL));
	}
	return ((makeBoolean((NIL != symbol_in_tree_p(symbol, tree.first())) || (NIL != symbol_in_tree_p(symbol, tree.rest())))));
    }

    public static SubLObject _tree_equal_2(SubLObject tree1, SubLObject tree2) {
	if (tree1.isAtom() && tree2.isAtom())
	    return eql(tree1, tree2);

	if (tree1.isCons() && tree2.isCons()) {
	    SubLObject rest_tree1;
	    SubLObject rest_tree2;
	    for (rest_tree1 = SubLNil.NIL, rest_tree2 = SubLNil.NIL, rest_tree1 = tree1, rest_tree2 = tree2; ((!rest_tree1.isAtom()) && (!rest_tree2.isAtom())) && (SubLNil.NIL != _tree_equal_2(rest_tree1.first(), rest_tree2.first())); rest_tree1 = rest_tree1.rest(), rest_tree2 = rest_tree2.rest()) {
	    }
	    return makeBoolean((rest_tree1.isAtom() && rest_tree2.isAtom()) && (SubLNil.NIL != _tree_equal_2(rest_tree1, rest_tree2)));
	}
	return SubLNil.NIL;
    }

    public static SubLObject _tree_equal_3(SubLObject tree1, SubLObject tree2, SubLObject test) {
	if (tree1.isAtom() && tree2.isAtom())
	    return funcall(test, tree1, tree2);

	if (tree1.isCons() && tree2.isCons()) {
	    SubLObject rest_tree1;
	    SubLObject rest_tree2;
	    for (rest_tree1 = SubLNil.NIL, rest_tree2 = SubLNil.NIL, rest_tree1 = tree1, rest_tree2 = tree2; ((!rest_tree1.isAtom()) && (!rest_tree2.isAtom()))
		    && (SubLNil.NIL != _tree_equal_3(rest_tree1.first(), rest_tree2.first(), test)); rest_tree1 = rest_tree1.rest(), rest_tree2 = rest_tree2.rest()) {
	    }
	    return makeBoolean((rest_tree1.isAtom() && rest_tree2.isAtom()) && (SubLNil.NIL != _tree_equal_3(rest_tree1, rest_tree2, test)));
	}
	return SubLNil.NIL;
    }

    public static SubLObject _union_2(SubLObject list1, SubLObject list2) {
	SubLObject answer = list1;
	SubLObject cdolist_list_var = list2;
	SubLObject item = SubLNil.NIL;
	item = cdolist_list_var.first();
	while (SubLNil.NIL != cdolist_list_var) {
	    if (SubLNil.NIL == _member_2(item, answer))
		answer = cons(item, answer);

	    cdolist_list_var = cdolist_list_var.rest();
	    item = cdolist_list_var.first();
	}
	return answer;
    }

    public static SubLObject _union_3(SubLObject list1, SubLObject list2, SubLObject test) {
	SubLObject answer = list1;
	SubLObject cdolist_list_var = list2;
	SubLObject item = SubLNil.NIL;
	item = cdolist_list_var.first();
	while (SubLNil.NIL != cdolist_list_var) {
	    if (SubLNil.NIL == _member_3(item, answer, test))
		answer = cons(item, answer);

	    cdolist_list_var = cdolist_list_var.rest();
	    item = cdolist_list_var.first();
	}
	return answer;
    }

    public static SubLObject _union_4(SubLObject list1, SubLObject list2, SubLObject test, SubLObject key) {
	SubLObject answer = list1;
	SubLObject cdolist_list_var = list2;
	SubLObject item = SubLNil.NIL;
	item = cdolist_list_var.first();
	while (SubLNil.NIL != cdolist_list_var) {
	    if (SubLNil.NIL == _member_4(funcall(key, item), answer, test, key))
		answer = cons(item, answer);

	    cdolist_list_var = cdolist_list_var.rest();
	    item = cdolist_list_var.first();
	}
	return answer;
    }

    public static SubLObject acons(SubLObject key, SubLObject datum, SubLObject alist) {
	return cons(cons(key, datum), alist);
    }

    public static SubLObject adjoin(SubLObject item, SubLObject list, SubLObject test, SubLObject key) {
	if (test == UNPROVIDED)
	    test = symbol_function(EQL);

	if (key == UNPROVIDED)
	    key = symbol_function(IDENTITY);

	assert SubLNil.NIL != listp(list) : list;
	assert SubLNil.NIL != function_spec_p(test) : test;
	assert SubLNil.NIL != function_spec_p(key) : key;
	if (SubLNil.NIL == list)
	    return cons(item, SubLNil.NIL);

	if (!key.eql(symbol_function(IDENTITY)))
	    return SubLNil.NIL != _member_4(funcall(key, item), list, test, key) ? list : cons(item, list);

	if (!test.eql(symbol_function(EQL)))
	    return SubLNil.NIL != _member_3(item, list, test) ? list : cons(item, list);

	return SubLNil.NIL != _member_2(item, list) ? list : cons(item, list);
    }

    public static SubLObject assoc(SubLObject item, SubLObject alist, SubLObject test, SubLObject key) {
	if (test == UNPROVIDED)
	    test = symbol_function(EQL);

	if (key == UNPROVIDED)
	    key = symbol_function(IDENTITY);

	assert SubLNil.NIL != listp(alist) : alist;
	assert SubLNil.NIL != function_spec_p(test) : test;
	assert SubLNil.NIL != function_spec_p(key) : key;
	if (SubLNil.NIL == alist)
	    return SubLNil.NIL;

	if (!symbol_function(IDENTITY).eql(key))
	    return _assoc_4(item, alist, test, key);

	if (!symbol_function(EQL).eql(test))
	    return _assoc_3(item, alist, test);

	return _assoc_2(item, alist);
    }

    public static SubLObject assoc_if(SubLObject predicate, SubLObject alist) {
	assert SubLNil.NIL != function_spec_p(predicate) : predicate;
	assert SubLNil.NIL != listp(alist) : alist;
	if (SubLNil.NIL == alist)
	    return SubLNil.NIL;

	SubLObject rest = SubLNil.NIL;
	SubLObject entry = SubLNil.NIL;
	rest = alist;
	entry = rest.first();
	while (SubLNil.NIL != rest) {
	    if ((SubLNil.NIL != entry) && (SubLNil.NIL != funcall(predicate, entry.first())))
		return entry;

	    rest = rest.rest();
	    entry = rest.first();
	}
	return SubLNil.NIL;
    }

    public static SubLObject butlast(SubLObject list, SubLObject n) {
	if (n == UNPROVIDED)
	    n = ONE_INTEGER;

	return ldiff(list, last(list, n));
    }

    public static SubLObject caar(SubLObject list) {
	return list.first().first();
    }

    public static SubLObject cadr(SubLObject list) {
	return list.rest().first();
    }

    public static SubLObject cdar(SubLObject list) {
	return list.first().rest();
    }

    public static SubLObject cddr(SubLObject list) {
	return list.rest().rest();
    }

    public static SubLObject circular_list_p(SubLObject object) {
	return makeBoolean(object.isCons() && (SubLNil.NIL == last(object, UNPROVIDED)));
    }

    public static SubLObject copy_alist(SubLObject list) {
	SubLThread thread = SubLProcess.currentSubLThread();
	if (SubLNil.NIL == list)
	    return list;

	SubLObject length = _cons_length(list);
	if ((SubLNil.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!length.isInteger()))
	    Errors.error($str15$COPY_ALIST_called_on_a_circular_l);

	SubLObject new_list = make_list(length, SubLNil.NIL);
	SubLObject new_rest = SubLNil.NIL;
	SubLObject old_rest = SubLNil.NIL;
	SubLObject old_item = SubLNil.NIL;
	new_rest = new_list;
	old_rest = list;
	old_item = old_rest.first();
	while (old_rest.rest().isCons()) {
	    if (old_item.isCons())
		rplaca(new_rest, copy_list(old_item));
	    else
		rplaca(new_rest, old_item);

	    new_rest = new_rest.rest();
	    old_rest = old_rest.rest();
	    old_item = old_rest.first();
	}
	if (old_item.isCons())
	    rplaca(new_rest, copy_list(old_item));
	else
	    rplaca(new_rest, old_item);

	if (SubLNil.NIL != old_rest.rest())
	    rplacd(new_rest, old_rest.rest());

	return new_list;
    }

    public static SubLObject copy_list(SubLObject list) {
	SubLThread thread = SubLProcess.currentSubLThread();
	if (SubLNil.NIL == list)
	    return SubLNil.NIL;

	SubLObject length = _cons_length(list);
	if ((SubLNil.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!length.isInteger()))
	    Errors.error($str13$COPY_LIST_called_on_a_circular_li);

	SubLObject new_list = make_list(length, SubLNil.NIL);
	SubLObject new_rest = SubLNil.NIL;
	SubLObject old_rest = SubLNil.NIL;
	SubLObject old_item = SubLNil.NIL;
	new_rest = new_list;
	old_rest = list;
	old_item = old_rest.first();
	while (old_rest.rest().isCons()) {
	    rplaca(new_rest, old_item);
	    new_rest = new_rest.rest();
	    old_rest = old_rest.rest();
	    old_item = old_rest.first();
	}
	rplaca(new_rest, old_item);
	if (SubLNil.NIL != old_rest.rest())
	    rplacd(new_rest, old_rest.rest());

	return new_list;
    }

    public static SubLObject copy_tree(SubLObject object) {
	SubLThread thread = SubLProcess.currentSubLThread();
	if (object.isAtom())
	    return object;

	SubLObject length = _cons_length(object);
	if ((SubLNil.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!length.isInteger()))
	    Errors.error($str17$COPY_TREE_called_on_a_circular_li);

	SubLObject new_list = make_list(length, SubLNil.NIL);
	SubLObject new_rest = SubLNil.NIL;
	SubLObject old_rest = SubLNil.NIL;
	SubLObject old_item = SubLNil.NIL;
	new_rest = new_list;
	old_rest = object;
	old_item = old_rest.first();
	while (old_rest.rest().isCons()) {
	    rplaca(new_rest, copy_tree(old_item));
	    new_rest = new_rest.rest();
	    old_rest = old_rest.rest();
	    old_item = old_rest.first();
	}
	rplaca(new_rest, copy_tree(old_item));
	if (SubLNil.NIL != old_rest.rest())
	    rplacd(new_rest, copy_tree(old_rest.rest()));

	return new_list;
    }

    public static SubLObject declare_conses_high_file() {
	declareFunction("_recons", "_RECONS", 3, 0, false);
	declareFunction("_ncons", "_NCONS", 3, 0, false);
	declareFunction("_cons_length", "_CONS-LENGTH", 1, 0, false);
	declareFunction("caar", "CAAR", 1, 0, false);
	declareFunction("cadr", "CADR", 1, 0, false);
	declareFunction("cdar", "CDAR", 1, 0, false);
	declareFunction("cddr", "CDDR", 1, 0, false);
	declareFunction("_tree_equal_2", "_TREE-EQUAL-2", 2, 0, false);
	declareFunction("_tree_equal_3", "_TREE-EQUAL-3", 3, 0, false);
	declareFunction("tree_equal", "TREE-EQUAL", 2, 1, false);
	declareFunction("endp", "ENDP", 1, 0, false);
	declareFunction("list_length", "LIST-LENGTH", 1, 0, false);
	declareFunction("first", "FIRST", 1, 0, false);
	declareFunction("second", "SECOND", 1, 0, false);
	declareFunction("third", "THIRD", 1, 0, false);
	declareFunction("fourth", "FOURTH", 1, 0, false);
	declareFunction("fifth", "FIFTH", 1, 0, false);
	declareFunction("sixth", "SIXTH", 1, 0, false);
	declareFunction("seventh", "SEVENTH", 1, 0, false);
	declareFunction("eighth", "EIGHTH", 1, 0, false);
	declareFunction("ninth", "NINTH", 1, 0, false);
	declareFunction("tenth", "TENTH", 1, 0, false);
	declareFunction("rest", "REST", 1, 0, false);
	declareFunction("nthcdr", "NTHCDR", 2, 0, false);
	declareFunction("copy_list", "COPY-LIST", 1, 0, false);
	declareFunction("copy_alist", "COPY-ALIST", 1, 0, false);
	declareFunction("copy_tree", "COPY-TREE", 1, 0, false);
	declareFunction("revappend", "REVAPPEND", 2, 0, false);
	declareFunction("nreconc", "NRECONC", 2, 0, false);
	declareFunction("ldiff", "LDIFF", 2, 0, false);
	declareFunction("_subst_3", "_SUBST-3", 3, 0, false);
	declareFunction("_subst_4", "_SUBST-4", 4, 0, false);
	declareFunction("_subst_5", "_SUBST-5", 5, 0, false);
	declareFunction("subst", "SUBST", 3, 2, false);
	declareFunction("_subst_if_3", "_SUBST-IF-3", 3, 0, false);
	declareFunction("_subst_if_4", "_SUBST-IF-4", 4, 0, false);
	declareFunction("subst_if", "SUBST-IF", 3, 1, false);
	declareFunction("_nsubst_3", "_NSUBST-3", 3, 0, false);
	declareFunction("_nsubst_4", "_NSUBST-4", 4, 0, false);
	declareFunction("_nsubst_5", "_NSUBST-5", 5, 0, false);
	declareFunction("nsubst", "NSUBST", 3, 2, false);
	declareFunction("_nsubst_if_3", "_NSUBST-IF-3", 3, 0, false);
	declareFunction("_nsubst_if_4", "_NSUBST-IF-4", 4, 0, false);
	declareFunction("nsubst_if", "NSUBST-IF", 3, 1, false);
	declareFunction("_sublis_2", "_SUBLIS-2", 2, 0, false);
	declareFunction("_sublis_3", "_SUBLIS-3", 3, 0, false);
	declareFunction("_sublis_4", "_SUBLIS-4", 4, 0, false);
	declareFunction("sublis", "SUBLIS", 2, 2, false);
	declareFunction("_nsublis_2", "_NSUBLIS-2", 2, 0, false);
	declareFunction("_nsublis_3", "_NSUBLIS-3", 3, 0, false);
	declareFunction("_nsublis_4", "_NSUBLIS-4", 4, 0, false);
	declareFunction("nsublis", "NSUBLIS", 2, 2, false);
	declareFunction("_member_2", "_MEMBER-2", 2, 0, false);
	declareFunction("_member_3", "_MEMBER-3", 3, 0, false);
	declareFunction("_member_4", "_MEMBER-4", 4, 0, false);
	declareFunction("member", "MEMBER", 2, 2, false);
	declareFunction("_member_if_2", "_MEMBER-IF-2", 2, 0, false);
	declareFunction("_member_if_3", "_MEMBER-IF-3", 3, 0, false);
	declareFunction("member_if", "MEMBER-IF", 2, 1, false);
	declareFunction("tailp", "TAILP", 2, 0, false);
	declareFunction("adjoin", "ADJOIN", 2, 2, false);
	declareFunction("_union_2", "_UNION-2", 2, 0, false);
	declareFunction("_union_3", "_UNION-3", 3, 0, false);
	declareFunction("_union_4", "_UNION-4", 4, 0, false);
	declareFunction("union", "UNION", 2, 2, false);
	new conses_high.$union$BinaryFunction();
	declareFunction("_nunion_2", "_NUNION-2", 2, 0, false);
	declareFunction("_nunion_3", "_NUNION-3", 3, 0, false);
	declareFunction("_nunion_4", "_NUNION-4", 4, 0, false);
	declareFunction("nunion", "NUNION", 2, 2, false);
	declareFunction("_intersection_2", "_INTERSECTION-2", 2, 0, false);
	declareFunction("_intersection_3", "_INTERSECTION-3", 3, 0, false);
	declareFunction("_intersection_4", "_INTERSECTION-4", 4, 0, false);
	declareFunction("intersection", "INTERSECTION", 2, 2, false);
	declareFunction("_nintersection_2", "_NINTERSECTION-2", 2, 0, false);
	declareFunction("_nintersection_3", "_NINTERSECTION-3", 3, 0, false);
	declareFunction("_nintersection_4", "_NINTERSECTION-4", 4, 0, false);
	declareFunction("nintersection", "NINTERSECTION", 2, 2, false);
	declareFunction("_set_difference_2", "_SET-DIFFERENCE-2", 2, 0, false);
	declareFunction("_set_difference_3", "_SET-DIFFERENCE-3", 3, 0, false);
	declareFunction("_set_difference_4", "_SET-DIFFERENCE-4", 4, 0, false);
	declareFunction("set_difference", "SET-DIFFERENCE", 2, 2, false);
	declareFunction("_nset_difference_2", "_NSET-DIFFERENCE-2", 2, 0, false);
	declareFunction("_nset_difference_3", "_NSET-DIFFERENCE-3", 3, 0, false);
	declareFunction("_nset_difference_4", "_NSET-DIFFERENCE-4", 4, 0, false);
	declareFunction("nset_difference", "NSET-DIFFERENCE", 2, 2, false);
	declareFunction("set_exclusive_or", "SET-EXCLUSIVE-OR", 2, 2, false);
	declareFunction("nset_exclusive_or", "NSET-EXCLUSIVE-OR", 2, 2, false);
	declareFunction("_subsetp_2", "_SUBSETP-2", 2, 0, false);
	declareFunction("_subsetp_3", "_SUBSETP-3", 3, 0, false);
	declareFunction("_subsetp_4", "_SUBSETP-4", 4, 0, false);
	declareFunction("subsetp", "SUBSETP", 2, 2, false);
	declareFunction("acons", "ACONS", 3, 0, false);
	declareFunction("pairlis", "PAIRLIS", 2, 1, false);
	declareFunction("_assoc_2", "_ASSOC-2", 2, 0, false);
	declareFunction("_assoc_3", "_ASSOC-3", 3, 0, false);
	declareFunction("_assoc_4", "_ASSOC-4", 4, 0, false);
	declareFunction("assoc", "ASSOC", 2, 2, false);
	declareFunction("assoc_if", "ASSOC-IF", 2, 0, false);
	declareFunction("_rassoc_2", "_RASSOC-2", 2, 0, false);
	declareFunction("_rassoc_3", "_RASSOC-3", 3, 0, false);
	declareFunction("_rassoc_4", "_RASSOC-4", 4, 0, false);
	declareFunction("rassoc", "RASSOC", 2, 2, false);
	declareFunction("rassoc_if", "RASSOC-IF", 2, 0, false);
	declareFunction("getf", "GETF", 2, 1, false);
	declareFunction("putf", "PUTF", 3, 0, false);
	declareFunction("remf", "REMF", 2, 0, false);
	declareFunction("last", "LAST", 1, 1, false);
	declareFunction("circular_list_p", "CIRCULAR-LIST-P", 1, 0, false);
	declareFunction("non_circular_list_p", "NON-CIRCULAR-LIST-P", 1, 0, false);
	declareFunction("butlast", "BUTLAST", 1, 1, false);
	declareFunction("nbutlast", "NBUTLAST", 1, 1, false);
	declareFunction("symbol_in_tree_p", "SYMBOL-IN-TREE-P", 2, 0, false);
	declareFunction("unquoted_symbol_in_tree_p", "UNQUOTED-SYMBOL-IN-TREE-P", 2, 0, false);
	return SubLNil.NIL;
    }

    public static SubLObject eighth(SubLObject list) {
	return nth(SEVEN_INTEGER, list);
    }

    public static SubLObject endp(SubLObject object) {
	assert SubLNil.NIL != listp(object) : object;
	return sublisp_null(object);
    }

    public static SubLObject fifth(SubLObject list) {
	return nth(FOUR_INTEGER, list);
    }

    public static SubLObject first(SubLObject list) {
	return list.first();
    }

    public static SubLObject fourth(SubLObject list) {
	return nth(THREE_INTEGER, list);
    }

    public static SubLObject getf(SubLObject plist, SubLObject indicator, SubLObject v_default) {
	if (v_default == UNPROVIDED)
	    v_default = SubLNil.NIL;

	SubLObject next = SubLNil.NIL;
	SubLObject key = SubLNil.NIL;
	next = plist;
	key = next.first();
	while (SubLNil.NIL != next) {
	    if (indicator.eql(key))
		return cadr(next);

	    next = cddr(next);
	    key = next.first();
	}
	return v_default;
    }

    public static SubLObject init_conses_high_file() {
	deflexical("*SUBLIS-WATERMARK*", $int$68);
	return SubLNil.NIL;
    }

    public static SubLObject intersection(SubLObject list1, SubLObject list2, SubLObject test, SubLObject key) {
	if (test == UNPROVIDED)
	    test = symbol_function(EQL);

	if (key == UNPROVIDED)
	    key = symbol_function(IDENTITY);

	assert SubLNil.NIL != listp(list1) : list1;
	assert SubLNil.NIL != listp(list2) : list2;
	assert SubLNil.NIL != function_spec_p(test) : test;
	assert SubLNil.NIL != function_spec_p(key) : key;
	if (SubLNil.NIL == list1)
	    return SubLNil.NIL;

	if (SubLNil.NIL == list2)
	    return SubLNil.NIL;

	if (!symbol_function(IDENTITY).eql(key))
	    return _intersection_4(list1, list2, test, key);

	if (!symbol_function(EQL).eql(test))
	    return _intersection_3(list1, list2, test);

	return _intersection_2(list1, list2);
    }

    public static SubLObject last(SubLObject list, SubLObject n) {
	if (n == UNPROVIDED)
	    n = ONE_INTEGER;

	SubLThread thread = SubLProcess.currentSubLThread();
	assert SubLNil.NIL != listp(list) : list;
	assert SubLNil.NIL != fixnump(n) : n;
	if ((SubLNil.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && n.isNegative())
	    Errors.error($str59$LAST_called_with_negative_index_o, n);

	if (SubLNil.NIL == list)
	    return SubLNil.NIL;

	SubLObject seeker_start = list;
	SubLObject circular_seeker = SubLNil.NIL;
	SubLObject i;
	for (i = SubLNil.NIL, i = ZERO_INTEGER; i.numL(n); i = add(i, ONE_INTEGER)) {
	    if (!seeker_start.isCons())
		return list;

	    seeker_start = seeker_start.rest();
	}
	circular_seeker = seeker_start;
	SubLObject seeker;
	SubLObject back;
	for (seeker = SubLNil.NIL, back = SubLNil.NIL, seeker = seeker_start, back = list; seeker.isCons(); seeker = seeker.rest(), back = back.rest())
	    if (circular_seeker.isCons()) {
		circular_seeker = circular_seeker.rest();
		if (circular_seeker.isCons()) {
		    circular_seeker = circular_seeker.rest();
		    if (circular_seeker.eql(back))
			return SubLNil.NIL;

		}
	    }

	return back;
    }

    public static SubLObject ldiff(SubLObject list, SubLObject sublist) {
	assert SubLNil.NIL != listp(list) : list;
	if (SubLNil.NIL == list)
	    return SubLNil.NIL;

	if (list.eql(sublist))
	    return SubLNil.NIL;

	SubLObject builder;
	SubLObject answer = builder = cons(list.first(), SubLNil.NIL);
	SubLObject temp = SubLNil.NIL;
	for (list = list.rest(); (!list.eql(sublist)) && list.isCons(); list = list.rest()) {
	    temp = cons(list.first(), SubLNil.NIL);
	    builder = rplacd(builder, temp);
	    builder = builder.rest();
	}
	return answer;
    }

    public static SubLObject list_length(SubLObject list) {
	assert SubLNil.NIL != listp(list) : list;
	if (SubLNil.NIL == list)
	    return ZERO_INTEGER;

	if (SubLNil.NIL == list.rest())
	    return ONE_INTEGER;

	SubLObject slow;
	SubLObject fast;
	SubLObject length;
	for (slow = SubLNil.NIL, fast = SubLNil.NIL, length = SubLNil.NIL, slow = list.rest(), fast = cddr(list), length = TWO_INTEGER; !fast.eql(slow); slow = slow.rest(), fast = cddr(fast), length = add(TWO_INTEGER, length)) {
	    if (SubLNil.NIL == fast)
		return length;

	    if (SubLNil.NIL == fast.rest())
		return add(ONE_INTEGER, length);

	}
	return SubLNil.NIL;
    }

    public static SubLObject member(SubLObject item, SubLObject list, SubLObject test, SubLObject key) {
	if (test == UNPROVIDED)
	    test = symbol_function(EQL);

	if (key == UNPROVIDED)
	    key = symbol_function(IDENTITY);

	if (null == list)
	    return SubLNil.NIL;

	assert SubLNil.NIL != listp(list) : list;
	assert SubLNil.NIL != function_spec_p(test) : test;
	assert SubLNil.NIL != function_spec_p(key) : key;
	if (SubLNil.NIL == list)
	    return SubLNil.NIL;

	if (!symbol_function(IDENTITY).eql(key))
	    return _member_4(item, list, test, key);

	if (!symbol_function(EQL).eql(test))
	    return _member_3(item, list, test);

	return _member_2(item, list);
    }

    public static SubLObject member_if(SubLObject test, SubLObject list, SubLObject key) {
	if (key == UNPROVIDED)
	    key = symbol_function(IDENTITY);

	assert SubLNil.NIL != listp(list) : list;
	assert SubLNil.NIL != function_spec_p(test) : test;
	assert SubLNil.NIL != function_spec_p(key) : key;
	if (SubLNil.NIL == list)
	    return SubLNil.NIL;

	if (!symbol_function(IDENTITY).eql(key))
	    return _member_if_3(test, list, key);

	return _member_if_2(test, list);
    }

    public static SubLObject nbutlast(SubLObject list, SubLObject n) {
	if (n == UNPROVIDED)
	    n = ONE_INTEGER;

	SubLThread thread = SubLProcess.currentSubLThread();
	assert SubLNil.NIL != listp(list) : list;
	assert SubLNil.NIL != fixnump(n) : n;
	if ((SubLNil.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && n.isNegative())
	    Errors.error($str61$NBUTLAST_called_with_negative_ind, n);

	if (SubLNil.NIL == list)
	    return SubLNil.NIL;

	SubLObject seeker_start = list;
	SubLObject circular_seeker = SubLNil.NIL;
	SubLObject i;
	for (i = SubLNil.NIL, i = ZERO_INTEGER; i.numL(n); i = add(i, ONE_INTEGER)) {
	    if (!seeker_start.isCons())
		return SubLNil.NIL;

	    seeker_start = seeker_start.rest();
	}
	if (!seeker_start.isCons())
	    return SubLNil.NIL;

	seeker_start = circular_seeker = seeker_start.rest();
	SubLObject seeker;
	SubLObject back;
	for (seeker = SubLNil.NIL, back = SubLNil.NIL, seeker = seeker_start, back = list; seeker.isCons(); seeker = seeker.rest(), back = back.rest())
	    if (circular_seeker.isCons()) {
		circular_seeker = circular_seeker.rest();
		if (circular_seeker.isCons()) {
		    circular_seeker = circular_seeker.rest();
		    if ((SubLNil.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && circular_seeker.eql(back))
			Errors.error($$$NBUTLAST_called_on_circular_list);

		}
	    }

	rplacd(back, SubLNil.NIL);
	return list;
    }

    public static SubLObject nintersection(SubLObject list1, SubLObject list2, SubLObject test, SubLObject key) {
	if (test == UNPROVIDED)
	    test = symbol_function(EQL);

	if (key == UNPROVIDED)
	    key = symbol_function(IDENTITY);

	assert SubLNil.NIL != listp(list1) : list1;
	assert SubLNil.NIL != listp(list2) : list2;
	assert SubLNil.NIL != function_spec_p(test) : test;
	assert SubLNil.NIL != function_spec_p(key) : key;
	if (SubLNil.NIL == list1)
	    return SubLNil.NIL;

	if (SubLNil.NIL == list2)
	    return SubLNil.NIL;

	if (!symbol_function(IDENTITY).eql(key))
	    return _nintersection_4(list1, list2, test, key);

	if (!symbol_function(EQL).eql(test))
	    return _nintersection_3(list1, list2, test);

	return _nintersection_2(list1, list2);
    }

    public static SubLObject ninth(SubLObject list) {
	return nth(EIGHT_INTEGER, list);
    }

    public static SubLObject non_circular_list_p(SubLObject object) {
	return makeBoolean(object.isList() && (SubLNil.NIL == circular_list_p(object)));
    }

    public static SubLObject nreconc(SubLObject list1, SubLObject list2) {
	assert SubLNil.NIL != listp(list1) : list1;
	assert SubLNil.NIL != listp(list2) : list2;
	if (SubLNil.NIL == list2)
	    return nreverse(list1);

	if (SubLNil.NIL == list1)
	    return list2;

	SubLObject next = list1.rest();
	SubLObject temp = SubLNil.NIL;
	list1 = rplacd(list1, list2);
	while (next.isCons()) {
	    temp = next.rest();
	    list1 = rplacd(next, list1);
	    next = temp;
	}
	return list1;
    }

    public static SubLObject nset_difference(SubLObject list1, SubLObject list2, SubLObject test, SubLObject key) {
	if (test == UNPROVIDED)
	    test = symbol_function(EQL);

	if (key == UNPROVIDED)
	    key = symbol_function(IDENTITY);

	assert SubLNil.NIL != listp(list1) : list1;
	assert SubLNil.NIL != listp(list2) : list2;
	assert SubLNil.NIL != function_spec_p(test) : test;
	assert SubLNil.NIL != function_spec_p(key) : key;
	if (SubLNil.NIL == list1)
	    return SubLNil.NIL;

	if (SubLNil.NIL == list2)
	    return list1;

	if (!symbol_function(IDENTITY).eql(key))
	    return _nset_difference_4(list1, list2, test, key);

	if (!symbol_function(EQL).eql(test))
	    return _nset_difference_3(list1, list2, test);

	return _nset_difference_2(list1, list2);
    }

    public static SubLObject nset_exclusive_or(SubLObject list1, SubLObject list2, SubLObject test, SubLObject key) {
	if (test == UNPROVIDED)
	    test = symbol_function(EQL);

	if (key == UNPROVIDED)
	    key = symbol_function(IDENTITY);

	return nconc(set_difference(list1, list2, test, key), set_difference(list2, list1, test, key));
    }

    public static SubLObject nsublis(SubLObject alist, SubLObject tree, SubLObject test, SubLObject key) {
	if (test == UNPROVIDED)
	    test = symbol_function(EQL);

	if (key == UNPROVIDED)
	    key = symbol_function(IDENTITY);

	assert SubLNil.NIL != function_spec_p(test) : test;
	assert SubLNil.NIL != function_spec_p(key) : key;
	if (!symbol_function(IDENTITY).eql(key))
	    return _nsublis_4(alist, tree, test, key);

	if (SubLNil.NIL == alist)
	    return tree;

	if (!symbol_function(EQL).eql(test))
	    return _nsublis_3(alist, tree, test);

	return _nsublis_2(alist, tree);
    }

    public static SubLObject nsubst(SubLObject v_new, SubLObject old, SubLObject tree, SubLObject test, SubLObject key) {
	if (test == UNPROVIDED)
	    test = symbol_function(EQL);

	if (key == UNPROVIDED)
	    key = symbol_function(IDENTITY);

	assert SubLNil.NIL != function_spec_p(test) : test;
	assert SubLNil.NIL != function_spec_p(key) : key;
	if (!symbol_function(IDENTITY).eql(key))
	    return _nsubst_5(v_new, old, tree, test, key);

	if (!symbol_function(EQL).eql(test))
	    return _nsubst_4(v_new, old, tree, test);

	return _nsubst_3(v_new, old, tree);
    }

    public static SubLObject nsubst_if(SubLObject v_new, SubLObject test, SubLObject tree, SubLObject key) {
	if (key == UNPROVIDED)
	    key = symbol_function(IDENTITY);

	assert SubLNil.NIL != function_spec_p(test) : test;
	assert SubLNil.NIL != function_spec_p(key) : key;
	if (!symbol_function(IDENTITY).eql(key))
	    return _nsubst_if_4(v_new, test, tree, key);

	return _nsubst_if_3(v_new, test, tree);
    }

    public static SubLObject nthcdr(SubLObject n, SubLObject list) {
	SubLThread thread = SubLProcess.currentSubLThread();
	assert SubLNil.NIL != fixnump(n) : n;
	assert SubLNil.NIL != listp(list) : list;
	if ((SubLNil.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && n.isNegative())
	    Errors.error($str11$_S_must_be_a_non_negative_integer, n);

	SubLObject i;
	for (i = SubLNil.NIL, i = ZERO_INTEGER; i.numL(n); i = add(i, ONE_INTEGER)) {
	    if (SubLNil.NIL == list)
		return SubLNil.NIL;

	    list = list.rest();
	}
	return list;
    }

    public static SubLObject nunion(SubLObject list1, SubLObject list2, SubLObject test, SubLObject key) {
	if (test == UNPROVIDED)
	    test = symbol_function(EQL);

	if (key == UNPROVIDED)
	    key = symbol_function(IDENTITY);

	assert SubLNil.NIL != listp(list1) : list1;
	assert SubLNil.NIL != listp(list2) : list2;
	assert SubLNil.NIL != function_spec_p(test) : test;
	assert SubLNil.NIL != function_spec_p(key) : key;
	if (SubLNil.NIL == list1)
	    return list2;

	if (SubLNil.NIL == list2)
	    return list1;

	if (!symbol_function(IDENTITY).eql(key))
	    return _nunion_4(list1, list2, test, key);

	if (!symbol_function(EQL).eql(test))
	    return _nunion_3(list1, list2, test);

	return _nunion_2(list1, list2);
    }

    public static SubLObject pairlis(SubLObject keys, SubLObject data, SubLObject alist) {
	if (alist == UNPROVIDED)
	    alist = SubLNil.NIL;

	SubLThread thread = SubLProcess.currentSubLThread();
	assert SubLNil.NIL != listp(keys) : keys;
	assert SubLNil.NIL != listp(data) : data;
	SubLObject rest_keys;
	SubLObject rest_data;
	for (rest_keys = SubLNil.NIL, rest_data = SubLNil.NIL, rest_keys = keys, rest_data = data; (SubLNil.NIL != rest_keys) && (SubLNil.NIL != rest_data); rest_keys = rest_keys.rest(), rest_data = rest_data.rest())
	    alist = acons(rest_keys.first(), rest_data.first(), alist);

	if ((SubLNil.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((SubLNil.NIL != rest_keys) || (SubLNil.NIL != rest_data)))
	    Errors.error($str52$PAIRLIS_was_called_with_lists_of_);

	return alist;
    }

    public static SubLObject putf(SubLObject plist, SubLObject indicator, SubLObject value) {
	SubLObject back = SubLNil.NIL;
	SubLObject next = SubLNil.NIL;
	SubLObject key = SubLNil.NIL;
	back = SubLNil.NIL;
	next = plist;
	key = next.first();
	while (SubLNil.NIL != next) {
	    if (indicator.eql(key)) {
		rplaca(next.rest(), value);
		return plist;
	    }
	    back = next.rest();
	    next = cddr(next);
	    key = next.first();
	}
	if (SubLNil.NIL != back) {
	    rplacd(back, list(indicator, value));
	    return plist;
	}
	return listS(indicator, value, plist);
    }

    public static SubLObject rassoc(SubLObject item, SubLObject alist, SubLObject test, SubLObject key) {
	if (test == UNPROVIDED)
	    test = symbol_function(EQL);

	if (key == UNPROVIDED)
	    key = symbol_function(IDENTITY);

	assert SubLNil.NIL != listp(alist) : alist;
	assert SubLNil.NIL != function_spec_p(test) : test;
	assert SubLNil.NIL != function_spec_p(key) : key;
	if (SubLNil.NIL == alist)
	    return SubLNil.NIL;

	if (!symbol_function(IDENTITY).eql(key))
	    return _rassoc_4(item, alist, test, key);

	if (!symbol_function(EQL).eql(test))
	    return _rassoc_3(item, alist, test);

	return _rassoc_2(item, alist);
    }

    public static SubLObject rassoc_if(SubLObject predicate, SubLObject alist) {
	assert SubLNil.NIL != function_spec_p(predicate) : predicate;
	assert SubLNil.NIL != listp(alist) : alist;
	if (SubLNil.NIL == alist)
	    return SubLNil.NIL;

	SubLObject rest = SubLNil.NIL;
	SubLObject entry = SubLNil.NIL;
	rest = alist;
	entry = rest.first();
	while (SubLNil.NIL != rest) {
	    if ((SubLNil.NIL != entry) && (SubLNil.NIL != funcall(predicate, entry.rest())))
		return entry;

	    rest = rest.rest();
	    entry = rest.first();
	}
	return SubLNil.NIL;
    }

    public static SubLObject remf(SubLObject plist, SubLObject indicator) {
	SubLObject back = SubLNil.NIL;
	SubLObject next = SubLNil.NIL;
	SubLObject key = SubLNil.NIL;
	back = SubLNil.NIL;
	next = plist;
	key = next.first();
	while (SubLNil.NIL != next)
	    if (indicator.eql(key)) {
		if (SubLNil.NIL != back) {
		    rplacd(back, cddr(next));
		    return plist;
		}
		return cddr(next);
	    } else {
		back = next.rest();
		next = cddr(next);
		key = next.first();
	    }

	return plist;
    }

    public static SubLObject rest(SubLObject list) {
	return list.rest();
    }

    public static SubLObject revappend(SubLObject list1, SubLObject list2) {
	assert SubLNil.NIL != listp(list1) : list1;
	assert SubLNil.NIL != listp(list2) : list2;
	if (SubLNil.NIL == list2)
	    return reverse(list1);

	if (SubLNil.NIL == list1)
	    return list2;

	SubLObject answer = list2;
	SubLObject cdolist_list_var = list1;
	SubLObject item = SubLNil.NIL;
	item = cdolist_list_var.first();
	while (SubLNil.NIL != cdolist_list_var) {
	    answer = cons(item, answer);
	    cdolist_list_var = cdolist_list_var.rest();
	    item = cdolist_list_var.first();
	}
	return answer;
    }

    public static SubLObject second(SubLObject list) {
	return cadr(list);
    }

    public static SubLObject set_difference(SubLObject list1, SubLObject list2, SubLObject test, SubLObject key) {
	if (test == UNPROVIDED)
	    test = symbol_function(EQL);

	if (key == UNPROVIDED)
	    key = symbol_function(IDENTITY);

	assert SubLNil.NIL != listp(list1) : list1;
	assert SubLNil.NIL != listp(list2) : list2;
	assert SubLNil.NIL != function_spec_p(test) : test;
	assert SubLNil.NIL != function_spec_p(key) : key;
	if (SubLNil.NIL == list1)
	    return SubLNil.NIL;

	if (SubLNil.NIL == list2)
	    return list1;

	if (!symbol_function(IDENTITY).eql(key))
	    return _set_difference_4(list1, list2, test, key);

	if (!symbol_function(EQL).eql(test))
	    return _set_difference_3(list1, list2, test);

	return _set_difference_2(list1, list2);
    }

    public static SubLObject set_exclusive_or(SubLObject list1, SubLObject list2, SubLObject test, SubLObject key) {
	if (test == UNPROVIDED)
	    test = symbol_function(EQL);

	if (key == UNPROVIDED)
	    key = symbol_function(IDENTITY);

	return append(set_difference(list1, list2, test, key), set_difference(list2, list1, test, key));
    }

    public static SubLObject setup_conses_high_file() {
	SubLSpecialOperatorDeclarations.proclaim($list0);
	SubLSpecialOperatorDeclarations.proclaim($list2);
	SubLSpecialOperatorDeclarations.proclaim($list3);
	SubLSpecialOperatorDeclarations.proclaim($list5);
	SubLSpecialOperatorDeclarations.proclaim($list6);
	SubLSpecialOperatorDeclarations.proclaim($list7);
	SubLSpecialOperatorDeclarations.proclaim($list8);
	SubLSpecialOperatorDeclarations.proclaim($list9);
	SubLSpecialOperatorDeclarations.proclaim($list12);
	SubLSpecialOperatorDeclarations.proclaim($list14);
	SubLSpecialOperatorDeclarations.proclaim($list16);
	SubLSpecialOperatorDeclarations.proclaim($list18);
	SubLSpecialOperatorDeclarations.proclaim($list19);
	SubLSpecialOperatorDeclarations.proclaim($list20);
	SubLSpecialOperatorDeclarations.proclaim($list21);
	SubLSpecialOperatorDeclarations.proclaim($list22);
	SubLSpecialOperatorDeclarations.proclaim($list23);
	SubLSpecialOperatorDeclarations.proclaim($list24);
	SubLSpecialOperatorDeclarations.proclaim($list25);
	SubLSpecialOperatorDeclarations.proclaim($list27);
	SubLSpecialOperatorDeclarations.proclaim($list28);
	SubLSpecialOperatorDeclarations.proclaim($list29);
	SubLSpecialOperatorDeclarations.proclaim($list30);
	SubLSpecialOperatorDeclarations.proclaim($list31);
	SubLSpecialOperatorDeclarations.proclaim($list32);
	SubLSpecialOperatorDeclarations.proclaim($list33);
	SubLSpecialOperatorDeclarations.proclaim($list34);
	SubLSpecialOperatorDeclarations.proclaim($list35);
	SubLSpecialOperatorDeclarations.proclaim($list36);
	SubLSpecialOperatorDeclarations.proclaim($list37);
	SubLSpecialOperatorDeclarations.proclaim($list38);
	SubLSpecialOperatorDeclarations.proclaim($list39);
	SubLSpecialOperatorDeclarations.proclaim($list40);
	SubLSpecialOperatorDeclarations.proclaim($list41);
	SubLSpecialOperatorDeclarations.proclaim($list42);
	SubLSpecialOperatorDeclarations.proclaim($list43);
	SubLSpecialOperatorDeclarations.proclaim($list44);
	SubLSpecialOperatorDeclarations.proclaim($list45);
	SubLSpecialOperatorDeclarations.proclaim($list46);
	SubLSpecialOperatorDeclarations.proclaim($list47);
	SubLSpecialOperatorDeclarations.proclaim($list48);
	SubLSpecialOperatorDeclarations.proclaim($list49);
	SubLSpecialOperatorDeclarations.proclaim($list50);
	SubLSpecialOperatorDeclarations.proclaim($list51);
	SubLSpecialOperatorDeclarations.proclaim($list53);
	SubLSpecialOperatorDeclarations.proclaim($list54);
	SubLSpecialOperatorDeclarations.proclaim($list55);
	SubLSpecialOperatorDeclarations.proclaim($list56);
	SubLSpecialOperatorDeclarations.proclaim($list57);
	SubLSpecialOperatorDeclarations.proclaim($list58);
	SubLSpecialOperatorDeclarations.proclaim($list60);
	return SubLNil.NIL;
    }

    public static SubLObject seventh(SubLObject list) {
	return nth(SIX_INTEGER, list);
    }

    public static SubLObject sixth(SubLObject list) {
	return nth(FIVE_INTEGER, list);
    }

    public static SubLObject sublis(SubLObject alist, SubLObject tree, SubLObject test, SubLObject key) {
	if (test == UNPROVIDED)
	    test = symbol_function(EQL);

	if (key == UNPROVIDED)
	    key = symbol_function(IDENTITY);

	assert SubLNil.NIL != function_spec_p(test) : test;
	assert SubLNil.NIL != function_spec_p(key) : key;
	if (!symbol_function(IDENTITY).eql(key))
	    return _sublis_4(alist, tree, test, key);

	if (SubLNil.NIL == alist)
	    return tree;

	if (!symbol_function(EQL).eql(test))
	    return _sublis_3(alist, tree, test);

	return _sublis_2(alist, tree);
    }

    public static SubLObject subsetp(SubLObject list1, SubLObject list2, SubLObject test, SubLObject key) {
	if (test == UNPROVIDED)
	    test = symbol_function(EQL);

	if (key == UNPROVIDED)
	    key = symbol_function(IDENTITY);

	assert SubLNil.NIL != listp(list1) : list1;
	assert SubLNil.NIL != listp(list2) : list2;
	assert SubLNil.NIL != function_spec_p(test) : test;
	assert SubLNil.NIL != function_spec_p(key) : key;
	if (SubLNil.NIL == list1)
	    return T;

	if (SubLNil.NIL == list2)
	    return SubLNil.NIL;

	if (!symbol_function(IDENTITY).eql(key))
	    return _subsetp_4(list1, list2, test, key);

	if (!symbol_function(EQL).eql(test))
	    return _subsetp_3(list1, list2, test);

	return _subsetp_2(list1, list2);
    }

    public static SubLObject subst(SubLObject v_new, SubLObject old, SubLObject tree, SubLObject test, SubLObject key) {
	if (test == UNPROVIDED)
	    test = symbol_function(EQL);

	if (key == UNPROVIDED)
	    key = symbol_function(IDENTITY);

	assert SubLNil.NIL != function_spec_p(test) : test;
	assert SubLNil.NIL != function_spec_p(key) : key;
	if (!symbol_function(IDENTITY).eql(key))
	    return _subst_5(v_new, old, tree, test, key);

	if (!symbol_function(EQL).eql(test))
	    return _subst_4(v_new, old, tree, test);

	return _subst_3(v_new, old, tree);
    }

    public static SubLObject subst_if(SubLObject v_new, SubLObject test, SubLObject tree, SubLObject key) {
	if (key == UNPROVIDED)
	    key = symbol_function(IDENTITY);

	assert SubLNil.NIL != function_spec_p(test) : test;
	assert SubLNil.NIL != function_spec_p(key) : key;
	if (!symbol_function(IDENTITY).eql(key))
	    return _subst_if_4(v_new, test, tree, key);

	return _subst_if_3(v_new, test, tree);
    }

    public static SubLObject tailp(SubLObject sublist, SubLObject list) {
	assert SubLNil.NIL != listp(list) : list;
	SubLObject rest;
	for (rest = SubLNil.NIL, rest = list; !rest.isAtom(); rest = rest.rest())
	    if (sublist.eql(rest))
		return T;

	return eql(sublist, rest);
    }

    public static SubLObject tenth(SubLObject list) {
	return nth(NINE_INTEGER, list);
    }

    public static SubLObject third(SubLObject list) {
	return nth(TWO_INTEGER, list);
    }

    public static SubLObject tree_equal(SubLObject tree1, SubLObject tree2, SubLObject test) {
	if (test == UNPROVIDED)
	    test = symbol_function(EQL);

	assert SubLNil.NIL != function_spec_p(test) : test;
	if (!symbol_function(EQL).eql(test))
	    return _tree_equal_3(tree1, tree2, test);

	return _tree_equal_2(tree1, tree2);
    }

    public static SubLObject union(SubLObject list1, SubLObject list2, SubLObject test, SubLObject key) {
	if (test == UNPROVIDED)
	    test = symbol_function(EQL);

	if (key == UNPROVIDED)
	    key = symbol_function(IDENTITY);

	assert SubLNil.NIL != listp(list1) : list1;
	assert SubLNil.NIL != listp(list2) : list2;
	assert SubLNil.NIL != function_spec_p(test) : test;
	assert SubLNil.NIL != function_spec_p(key) : key;
	if (SubLNil.NIL == list1)
	    return list2;

	if (SubLNil.NIL == list2)
	    return list1;

	if (!symbol_function(IDENTITY).eql(key))
	    return _union_4(list1, list2, test, key);

	if (!symbol_function(EQL).eql(test))
	    return _union_3(list1, list2, test);

	return _union_2(list1, list2);
    }

    public static final SubLFile me = new conses_high();

    public static final String myName = conses_high.class.getName();

    // deflexical
    // Above this length, sublis will call copy-list and then
    //use an iterative algorithm.  This may be consier but it will be
    //iterative instead of recursive, to avoid a stack overflow.
    public static final SubLSymbol $sublis_watermark$ = makeSymbol("*SUBLIS-WATERMARK*");

    private static final SubLList $list0 = list(makeSymbol("INLINE"), makeSymbol("_RECONS"), makeSymbol("_NCONS"));

    private static final SubLList $list2 = list(makeSymbol("INLINE"), makeSymbol("CAAR"), makeSymbol("CADR"), makeSymbol("CDAR"), makeSymbol("CDDR"));

    private static final SubLList $list3 = list(makeSymbol("NOTINLINE"), makeSymbol("TREE-EQUAL"));

    private static final SubLList $list5 = list(makeSymbol("INLINE"), makeSymbol("ENDP"));

    private static final SubLList $list6 = list(makeSymbol("NOTINLINE"), makeSymbol("LIST-LENGTH"));

    private static final SubLList $list7 = list(makeSymbol("INLINE"), makeSymbol("FIRST"), makeSymbol("SECOND"), makeSymbol("THIRD"), makeSymbol("FOURTH"), makeSymbol("FIFTH"), makeSymbol("SIXTH"), makeSymbol("SEVENTH"), makeSymbol("EIGHTH"), makeSymbol("NINTH"), makeSymbol("TENTH"));

    private static final SubLList $list8 = list(makeSymbol("INLINE"), makeSymbol("REST"));

    private static final SubLList $list9 = list(makeSymbol("NOTINLINE"), makeSymbol("NTHCDR"));

    private static final SubLString $str11$_S_must_be_a_non_negative_integer = makeString("~S must be a non-negative integer");

    private static final SubLList $list12 = list(makeSymbol("NOTINLINE"), makeSymbol("COPY-LIST"));

    private static final SubLString $str13$COPY_LIST_called_on_a_circular_li = makeString("COPY-LIST called on a circular list");

    private static final SubLList $list14 = list(makeSymbol("NOTINLINE"), makeSymbol("COPY-ALIST"));

    private static final SubLString $str15$COPY_ALIST_called_on_a_circular_l = makeString("COPY-ALIST called on a circular list");

    private static final SubLList $list16 = list(makeSymbol("NOTINLINE"), makeSymbol("COPY-TREE"));

    private static final SubLString $str17$COPY_TREE_called_on_a_circular_li = makeString("COPY-TREE called on a circular list");

    private static final SubLList $list18 = list(makeSymbol("NOTINLINE"), makeSymbol("REVAPPEND"));

    private static final SubLList $list19 = list(makeSymbol("NOTINLINE"), makeSymbol("NRECONC"));

    private static final SubLList $list20 = list(makeSymbol("NOTINLINE"), makeSymbol("LDIFF"));

    private static final SubLList $list21 = list(makeSymbol("NOTINLINE"), makeSymbol("SUBST"));

    private static final SubLList $list22 = list(makeSymbol("NOTINLINE"), makeSymbol("SUBST-IF"));

    private static final SubLList $list23 = list(makeSymbol("NOTINLINE"), makeSymbol("NSUBST"));

    private static final SubLList $list24 = list(makeSymbol("NOTINLINE"), makeSymbol("NSUBST-IF"));

    private static final SubLList $list25 = list(makeSymbol("NOTINLINE"), makeSymbol("SUBLIS"));

    private static final SubLInteger $int$68 = makeInteger(68);

    private static final SubLList $list27 = list(makeSymbol("NOTINLINE"), makeSymbol("NSUBLIS"));

    private static final SubLList $list28 = list(makeSymbol("NOTINLINE"), makeSymbol("MEMBER"));

    private static final SubLList $list29 = list(makeSymbol("INLINE"), makeSymbol("_MEMBER-2"), makeSymbol("_MEMBER-3"), makeSymbol("_MEMBER-4"));

    private static final SubLList $list30 = list(makeSymbol("NOTINLINE"), makeSymbol("MEMBER-IF"));

    private static final SubLList $list31 = list(makeSymbol("INLINE"), makeSymbol("_MEMBER-IF-2"), makeSymbol("_MEMBER-IF-3"));

    private static final SubLList $list32 = list(makeSymbol("NOTINLINE"), makeSymbol("TAILP"));

    private static final SubLList $list33 = list(makeSymbol("NOTINLINE"), makeSymbol("ADJOIN"));

    private static final SubLList $list34 = list(makeSymbol("NOTINLINE"), makeSymbol("UNION"));

    private static final SubLList $list35 = list(makeSymbol("INLINE"), makeSymbol("_UNION-2"), makeSymbol("_UNION-3"), makeSymbol("_UNION-4"));

    private static final SubLList $list36 = list(makeSymbol("NOTINLINE"), makeSymbol("NUNION"));

    private static final SubLList $list37 = list(makeSymbol("INLINE"), makeSymbol("_NUNION-2"), makeSymbol("_NUNION-3"), makeSymbol("_NUNION-4"));

    private static final SubLList $list38 = list(makeSymbol("NOTINLINE"), makeSymbol("INTERSECTION"));

    private static final SubLList $list39 = list(makeSymbol("INLINE"), makeSymbol("_INTERSECTION-2"), makeSymbol("_INTERSECTION-3"), makeSymbol("_INTERSECTION-4"));

    private static final SubLList $list40 = list(makeSymbol("NOTINLINE"), makeSymbol("NINTERSECTION"));

    private static final SubLList $list41 = list(makeSymbol("INLINE"), makeSymbol("_NINTERSECTION-2"), makeSymbol("_NINTERSECTION-3"), makeSymbol("_NINTERSECTION-4"));

    private static final SubLList $list42 = list(makeSymbol("NOTINLINE"), makeSymbol("SET-DIFFERENCE"));

    private static final SubLList $list43 = list(makeSymbol("INLINE"), makeSymbol("_SET-DIFFERENCE-2"), makeSymbol("_SET-DIFFERENCE-3"), makeSymbol("_SET-DIFFERENCE-4"));

    private static final SubLList $list44 = list(makeSymbol("NOTINLINE"), makeSymbol("NSET-DIFFERENCE"));

    private static final SubLList $list45 = list(makeSymbol("INLINE"), makeSymbol("_NSET-DIFFERENCE-2"), makeSymbol("_NSET-DIFFERENCE-3"), makeSymbol("_NSET-DIFFERENCE-4"));

    private static final SubLList $list46 = list(makeSymbol("INLINE"), makeSymbol("SET-EXCLUSIVE-OR"));

    private static final SubLList $list47 = list(makeSymbol("INLINE"), makeSymbol("NSET-EXCLUSIVE-OR"));

    private static final SubLList $list48 = list(makeSymbol("NOTINLINE"), makeSymbol("SUBSETP"));

    private static final SubLList $list49 = list(makeSymbol("INLINE"), makeSymbol("_SUBSETP-2"), makeSymbol("_SUBSETP-3"), makeSymbol("_SUBSETP-4"));

    private static final SubLList $list50 = list(makeSymbol("INLINE"), makeSymbol("ACONS"));

    private static final SubLList $list51 = list(makeSymbol("NOTINLINE"), makeSymbol("PAIRLIS"));

    private static final SubLString $str52$PAIRLIS_was_called_with_lists_of_ = makeString("PAIRLIS was called with lists of different lengths");

    private static final SubLList $list53 = list(makeSymbol("NOTINLINE"), makeSymbol("ASSOC"));

    private static final SubLList $list54 = list(makeSymbol("INLINE"), makeSymbol("_ASSOC-2"), makeSymbol("_ASSOC-3"), makeSymbol("_ASSOC-4"));

    private static final SubLList $list55 = list(makeSymbol("NOTINLINE"), makeSymbol("ASSOC-IF"));

    private static final SubLList $list56 = list(makeSymbol("NOTINLINE"), makeSymbol("RASSOC"));

    private static final SubLList $list57 = list(makeSymbol("INLINE"), makeSymbol("_RASSOC-2"), makeSymbol("_RASSOC-3"), makeSymbol("_RASSOC-4"));

    private static final SubLList $list58 = list(makeSymbol("NOTINLINE"), makeSymbol("RASSOC-IF"));

    private static final SubLString $str59$LAST_called_with_negative_index_o = makeString("LAST called with negative index of ~S");

    private static final SubLList $list60 = list(makeSymbol("INLINE"), makeSymbol("BUTLAST"));

    private static final SubLString $str61$NBUTLAST_called_with_negative_ind = makeString("NBUTLAST called with negative index of ~S");

    private static final SubLString $$$NBUTLAST_called_on_circular_list = makeString("NBUTLAST called on circular list");

    static {

    }

    @Override
    public void declareFunctions() {
	declare_conses_high_file();
    }

    @Override
    public void initializeVariables() {
	init_conses_high_file();
    }

    @Override
    public void runTopLevelForms() {
	setup_conses_high_file();
    }
}
