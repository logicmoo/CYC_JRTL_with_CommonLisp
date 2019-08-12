/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      WORD-TREE
 * source file: /cyc/top/cycl/word-tree.lisp
 * created:     2019/07/03 17:38:54
 */
public final class word_tree extends word_tree_base_file {
    // defparameter
    // a mapping from categories to types of word trees
    /**
     * a mapping from categories to types of word trees
     */
    @LispMethod(comment = "a mapping from categories to types of word trees\ndefparameter")
    public static final SubLSymbol $category_to_word$ = makeSymbol("*CATEGORY-TO-WORD*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $plural_personal_pronouns$ = makeSymbol("*PLURAL-PERSONAL-PRONOUNS*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $plural_possessive_pronouns$ = makeSymbol("*PLURAL-POSSESSIVE-PRONOUNS*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $singular_personal_pronouns$ = makeSymbol("*SINGULAR-PERSONAL-PRONOUNS*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $singular_possessive_pronouns$ = makeSymbol("*SINGULAR-POSSESSIVE-PRONOUNS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $to_be_forms$ = makeSymbol("*TO-BE-FORMS*");

    public static final SubLFile me = new word_tree();


 public static final String myName = "com.cyc.cycjava.cycl.word_tree";

    public static SubLObject adjectival_word_tree_get_complements_method(final SubLObject self) {
	final SubLObject modifieds = methods.funcall_instance_method_with_0_args(self, GET_MODIFIEDS);
	final SubLObject obl_obj = methods.funcall_instance_method_with_0_args(self, GET_OBLIQUE_OBJECT);
	return append(modifieds, NIL != obl_obj ? list(obl_obj) : NIL);
    }

    public static final SubLObject adjectival_word_tree_get_complements_method_alt(SubLObject self) {
	{
	    SubLObject modifieds = methods.funcall_instance_method_with_0_args(self, GET_MODIFIEDS);
	    SubLObject obl_obj = methods.funcall_instance_method_with_0_args(self, GET_OBLIQUE_OBJECT);
	    return append(modifieds, NIL != obl_obj ? ((SubLObject) (list(obl_obj))) : NIL);
	}
    }

    public static SubLObject adjectival_word_tree_get_keyword_renamings_method(final SubLObject self, SubLObject keywords) {
	if (keywords == UNPROVIDED) {
	    keywords = $list629;
	}
	SubLObject conjuncts = NIL;
	final SubLObject modified = methods.funcall_instance_method_with_0_args(self, GET_MODIFIEDS).first();
	final SubLObject obl_obj = methods.funcall_instance_method_with_0_args(self, GET_OBLIQUE_OBJECT);
	final SubLObject obl_obj_head = (NIL != obl_obj) ? methods.funcall_instance_method_with_0_args(obl_obj, GET_HEAD) : NIL;
	if (NIL != modified) {
	    if (NIL != subl_promotions.memberP($NOUN, keywords, EQL, UNPROVIDED)) {
		conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($NOUN, modified), conjuncts);
	    }
	    if (NIL != subl_promotions.memberP($ACTION, keywords, EQL, UNPROVIDED)) {
		conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($ACTION, modified), conjuncts);
	    }
	    if (NIL != subl_promotions.memberP($REPLACE, keywords, EQL, UNPROVIDED)) {
		conjuncts = cons(list(cons($REPLACE, NIL)), conjuncts);
	    }
	}
	if ((NIL != obl_obj_head) && (NIL != subl_promotions.memberP($OBLIQUE_OBJECT, keywords, EQL, UNPROVIDED))) {
	    conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($PREP_OBJECT, obl_obj_head), conjuncts);
	}
	return cyclifier_interface.disjunctive_keyword_renamings(conjuncts, NIL);
    }

    public static final SubLObject adjectival_word_tree_get_keyword_renamings_method_alt(SubLObject self, SubLObject keywords) {
	if (keywords == UNPROVIDED) {
	    keywords = $list_alt629;
	}
	{
	    SubLObject conjuncts = NIL;
	    SubLObject modified = methods.funcall_instance_method_with_0_args(self, GET_MODIFIEDS).first();
	    SubLObject obl_obj = methods.funcall_instance_method_with_0_args(self, GET_OBLIQUE_OBJECT);
	    SubLObject obl_obj_head = (NIL != obl_obj) ? ((SubLObject) (methods.funcall_instance_method_with_0_args(obl_obj, GET_HEAD))) : NIL;
	    if (NIL != modified) {
		if (NIL != subl_promotions.memberP($NOUN, keywords, EQL, UNPROVIDED)) {
		    conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($NOUN, modified), conjuncts);
		}
		if (NIL != subl_promotions.memberP($ACTION, keywords, EQL, UNPROVIDED)) {
		    conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($ACTION, modified), conjuncts);
		}
		if (NIL != subl_promotions.memberP($REPLACE, keywords, EQL, UNPROVIDED)) {
		    conjuncts = cons(list(cons($REPLACE, NIL)), conjuncts);
		}
	    }
	    if (NIL != obl_obj_head) {
		if (NIL != subl_promotions.memberP($OBLIQUE_OBJECT, keywords, EQL, UNPROVIDED)) {
		    conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($PREP_OBJECT, obl_obj_head), conjuncts);
		}
	    }
	    return cyclifier_interface.disjunctive_keyword_renamings(conjuncts, NIL);
	}
    }

    /**
     *
     *
     * @return listp; a list of phrases modified by this adjective
     */
    @LispMethod(comment = "@return listp; a list of phrases modified by this adjective")
    public static SubLObject adjectival_word_tree_get_modifieds_method(final SubLObject self) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject catch_var_for_adjectival_word_tree_method = NIL;
	final SubLObject mother = parse_tree.get_parse_tree_mother(self);
	try {
	    thread.throwStack.push($sym636$OUTER_CATCH_FOR_ADJECTIVAL_WORD_TREE_METHOD);
	    try {
		final SubLObject head = methods.funcall_instance_method_with_0_args(mother, GET_HEAD_DAUGHTER);
		SubLObject complement = (NIL != parse_tree.nominal_tree_p(head)) ? head : NIL;
		if ((NIL == complement) && (NIL != parse_tree.nominal_tree_p(methods.funcall_instance_method_with_1_args(mother, GET_SISTER, ONE_INTEGER)))) {
		    complement = methods.funcall_instance_method_with_1_args(mother, GET_SISTER, ONE_INTEGER);
		}
		if (((NIL == complement) && (NIL != mother)) && (NIL != aux_verb_tree_p(methods.funcall_instance_method_with_1_args(mother, GET_SISTER, MINUS_ONE_INTEGER)))) {
		    final SubLObject subject = methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(mother, GET_SISTER, MINUS_ONE_INTEGER), GET_SUBJECT);
		    final SubLObject head_$12 = (NIL != subject) ? methods.funcall_instance_method_with_0_args(subject, GET_HEAD) : NIL;
		    if (NIL != head_$12) {
			complement = head_$12;
		    }
		}
		if (NIL == complement) {
		    final SubLObject grandmother = (NIL != mother) ? methods.funcall_instance_method_with_0_args(mother, GET_MOTHER) : NIL;
		    final SubLObject modified = (NIL != grandmother) ? methods.funcall_instance_method_with_1_args(grandmother, FIND_FIRST, NOMINAL_TREE_P) : NIL;
		    final SubLObject mod_head = (NIL != modified) ? methods.funcall_instance_method_with_0_args(modified, GET_HEAD) : NIL;
		    if (NIL != mod_head) {
			complement = mod_head;
		    }
		}
		sublisp_throw($sym636$OUTER_CATCH_FOR_ADJECTIVAL_WORD_TREE_METHOD, NIL != complement ? list(complement) : NIL);
	    } finally {
		final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    parse_tree.set_parse_tree_mother(self, mother);
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
		}
	    }
	} catch (final Throwable ccatch_env_var) {
	    catch_var_for_adjectival_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym636$OUTER_CATCH_FOR_ADJECTIVAL_WORD_TREE_METHOD);
	} finally {
	    thread.throwStack.pop();
	}
	return catch_var_for_adjectival_word_tree_method;
    }

    /**
     *
     *
     * @return listp; a list of phrases modified by this adjective
     */
    @LispMethod(comment = "@return listp; a list of phrases modified by this adjective")
    public static final SubLObject adjectival_word_tree_get_modifieds_method_alt(SubLObject self) {
	{
	    SubLObject catch_var_for_adjectival_word_tree_method = NIL;
	    SubLObject mother = parse_tree.get_parse_tree_mother(self);
	    try {
		try {
		    {
			SubLObject head = methods.funcall_instance_method_with_0_args(mother, GET_HEAD_DAUGHTER);
			SubLObject complement = (NIL != parse_tree.nominal_tree_p(head)) ? ((SubLObject) (head)) : NIL;
			if (NIL == complement) {
			    if (NIL != parse_tree.nominal_tree_p(methods.funcall_instance_method_with_1_args(mother, GET_SISTER, ONE_INTEGER))) {
				complement = methods.funcall_instance_method_with_1_args(mother, GET_SISTER, ONE_INTEGER);
			    }
			}
			if (NIL == complement) {
			    if ((NIL != mother) && (NIL != com.cyc.cycjava.cycl.word_tree.aux_verb_tree_p(methods.funcall_instance_method_with_1_args(mother, GET_SISTER, MINUS_ONE_INTEGER)))) {
				{
				    SubLObject subject = methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(mother, GET_SISTER, MINUS_ONE_INTEGER), GET_SUBJECT);
				    SubLObject head_12 = (NIL != subject) ? ((SubLObject) (methods.funcall_instance_method_with_0_args(subject, GET_HEAD))) : NIL;
				    if (NIL != head_12) {
					complement = head_12;
				    }
				}
			    }
			}
			if (NIL == complement) {
			    {
				SubLObject grandmother = (NIL != mother) ? ((SubLObject) (methods.funcall_instance_method_with_0_args(mother, GET_MOTHER))) : NIL;
				SubLObject modified = (NIL != grandmother) ? ((SubLObject) (methods.funcall_instance_method_with_1_args(grandmother, FIND_FIRST, NOMINAL_TREE_P))) : NIL;
				SubLObject mod_head = (NIL != modified) ? ((SubLObject) (methods.funcall_instance_method_with_0_args(modified, GET_HEAD))) : NIL;
				if (NIL != mod_head) {
				    complement = mod_head;
				}
			    }
			}
			sublisp_throw($sym636$OUTER_CATCH_FOR_ADJECTIVAL_WORD_TREE_METHOD, NIL != complement ? ((SubLObject) (list(complement))) : NIL);
		    }
		} finally {
		    {
			SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
			try {
			    bind($is_thread_performing_cleanupP$, T);
			    parse_tree.set_parse_tree_mother(self, mother);
			} finally {
			    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
			}
		    }
		}
	    } catch (Throwable ccatch_env_var) {
		catch_var_for_adjectival_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym636$OUTER_CATCH_FOR_ADJECTIVAL_WORD_TREE_METHOD);
	    }
	    return catch_var_for_adjectival_word_tree_method;
	}
    }

    /**
     *
     *
     * @return verbal-tree-p; the verbal complement of this adjective
     */
    @LispMethod(comment = "@return verbal-tree-p; the verbal complement of this adjective")
    public static SubLObject adjectival_word_tree_get_verbal_complement_method(final SubLObject self) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject catch_var_for_adjectival_word_tree_method = NIL;
	final SubLObject mother = parse_tree.get_parse_tree_mother(self);
	try {
	    thread.throwStack.push($sym640$OUTER_CATCH_FOR_ADJECTIVAL_WORD_TREE_METHOD);
	    try {
		sublisp_throw($sym640$OUTER_CATCH_FOR_ADJECTIVAL_WORD_TREE_METHOD, methods.funcall_instance_method_with_1_args(mother, FIND_FIRST, SBAR_TREE_P));
	    } finally {
		final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    parse_tree.set_parse_tree_mother(self, mother);
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
		}
	    }
	} catch (final Throwable ccatch_env_var) {
	    catch_var_for_adjectival_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym640$OUTER_CATCH_FOR_ADJECTIVAL_WORD_TREE_METHOD);
	} finally {
	    thread.throwStack.pop();
	}
	return catch_var_for_adjectival_word_tree_method;
    }

    /**
     *
     *
     * @return verbal-tree-p; the verbal complement of this adjective
     */
    @LispMethod(comment = "@return verbal-tree-p; the verbal complement of this adjective")
    public static final SubLObject adjectival_word_tree_get_verbal_complement_method_alt(SubLObject self) {
	{
	    SubLObject catch_var_for_adjectival_word_tree_method = NIL;
	    SubLObject mother = parse_tree.get_parse_tree_mother(self);
	    try {
		try {
		    sublisp_throw($sym640$OUTER_CATCH_FOR_ADJECTIVAL_WORD_TREE_METHOD, methods.funcall_instance_method_with_1_args(mother, FIND_FIRST, SBAR_TREE_P));
		} finally {
		    {
			SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
			try {
			    bind($is_thread_performing_cleanupP$, T);
			    parse_tree.set_parse_tree_mother(self, mother);
			} finally {
			    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
			}
		    }
		}
	    } catch (Throwable ccatch_env_var) {
		catch_var_for_adjectival_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym640$OUTER_CATCH_FOR_ADJECTIVAL_WORD_TREE_METHOD);
	    }
	    return catch_var_for_adjectival_word_tree_method;
	}
    }

    public static SubLObject adjectival_word_tree_p(final SubLObject adjectival_word_tree) {
	return classes.subloop_instanceof_class(adjectival_word_tree, ADJECTIVAL_WORD_TREE);
    }

    public static final SubLObject adjectival_word_tree_p_alt(SubLObject adjectival_word_tree) {
	return classes.subloop_instanceof_class(adjectival_word_tree, ADJECTIVAL_WORD_TREE);
    }

    public static SubLObject adverbial_word_tree_get_keyword_renamings_method(final SubLObject self, SubLObject keywords) {
	if (keywords == UNPROVIDED) {
	    keywords = $list648;
	}
	SubLObject conjuncts = NIL;
	final SubLObject modified = methods.funcall_instance_method_with_0_args(self, GET_MODIFIEDS).first();
	final SubLObject subject = (NIL != cyclifier_interface.verbal_word_p(modified)) ? methods.funcall_instance_method_with_0_args(modified, GET_SUBJECT) : NIL;
	final SubLObject v_object = (NIL != cyclifier_interface.verbal_word_p(modified)) ? methods.funcall_instance_method_with_0_args(modified, GET_OBJECTS).first() : NIL;
	if ((NIL != modified) && (NIL != member($ACTION, keywords, EQL, UNPROVIDED))) {
	    conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($ACTION, modified), conjuncts);
	}
	if ((NIL != subject) && (NIL != member($SUBJECT, keywords, EQL, UNPROVIDED))) {
	    conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($SUBJECT, subject), conjuncts);
	}
	if ((NIL != v_object) && (NIL != member($OBJECT, keywords, EQL, UNPROVIDED))) {
	    conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($OBJECT, v_object), conjuncts);
	}
	return cyclifier_interface.disjunctive_keyword_renamings(conjuncts, NIL);
    }

    public static final SubLObject adverbial_word_tree_get_keyword_renamings_method_alt(SubLObject self, SubLObject keywords) {
	if (keywords == UNPROVIDED) {
	    keywords = $list_alt648;
	}
	{
	    SubLObject conjuncts = NIL;
	    SubLObject modified = methods.funcall_instance_method_with_0_args(self, GET_MODIFIEDS).first();
	    SubLObject subject = (NIL != cyclifier_interface.verbal_word_p(modified)) ? ((SubLObject) (methods.funcall_instance_method_with_0_args(modified, GET_SUBJECT))) : NIL;
	    SubLObject v_object = (NIL != cyclifier_interface.verbal_word_p(modified)) ? ((SubLObject) (methods.funcall_instance_method_with_0_args(modified, GET_OBJECTS).first())) : NIL;
	    if ((NIL != modified) && (NIL != member($ACTION, keywords, EQL, UNPROVIDED))) {
		conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($ACTION, modified), conjuncts);
	    }
	    if ((NIL != subject) && (NIL != member($SUBJECT, keywords, EQL, UNPROVIDED))) {
		conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($SUBJECT, subject), conjuncts);
	    }
	    if ((NIL != v_object) && (NIL != member($OBJECT, keywords, EQL, UNPROVIDED))) {
		conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($OBJECT, v_object), conjuncts);
	    }
	    return cyclifier_interface.disjunctive_keyword_renamings(conjuncts, NIL);
	}
    }

    /**
     *
     *
     * @return listp; a list of phrases modified by this adverb
     */
    @LispMethod(comment = "@return listp; a list of phrases modified by this adverb")
    public static SubLObject adverbial_word_tree_get_modifieds_method(final SubLObject self) {
	final SubLObject sister = methods.funcall_instance_method_with_1_args(self, GET_SISTER, ONE_INTEGER);
	if ((((NIL != adjectival_word_tree_p(sister)) || (NIL != adverbial_word_tree_p(sister))) || (NIL != prepositional_or_particle_word_tree_p(sister))) || (NIL != parse_tree.numerical_tree_p(sister))) {
	    return list(sister);
	}
	SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, GET_ANCESTORS);
	SubLObject ancestor = NIL;
	ancestor = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    if (NIL != parse_tree.verbal_phrase_tree_p(ancestor)) {
		return methods.funcall_instance_method_with_0_args(ancestor, GET_SEMANTIC_HEADS);
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    ancestor = cdolist_list_var.first();
	}
	return NIL;
    }

    /**
     *
     *
     * @return listp; a list of phrases modified by this adverb
     */
    @LispMethod(comment = "@return listp; a list of phrases modified by this adverb")
    public static final SubLObject adverbial_word_tree_get_modifieds_method_alt(SubLObject self) {
	{
	    SubLObject sister = methods.funcall_instance_method_with_1_args(self, GET_SISTER, ONE_INTEGER);
	    if ((((NIL != com.cyc.cycjava.cycl.word_tree.adjectival_word_tree_p(sister)) || (NIL != com.cyc.cycjava.cycl.word_tree.adverbial_word_tree_p(sister))) || (NIL != com.cyc.cycjava.cycl.word_tree.prepositional_or_particle_word_tree_p(sister)))
		    || (NIL != parse_tree.numerical_tree_p(sister))) {
		return list(sister);
	    }
	    {
		SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, GET_ANCESTORS);
		SubLObject ancestor = NIL;
		for (ancestor = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), ancestor = cdolist_list_var.first()) {
		    if (NIL != parse_tree.verbal_phrase_tree_p(ancestor)) {
			return methods.funcall_instance_method_with_0_args(ancestor, GET_SEMANTIC_HEADS);
		    }
		}
	    }
	}
	return NIL;
    }

    public static SubLObject adverbial_word_tree_p(final SubLObject adverbial_word_tree) {
	return classes.subloop_instanceof_class(adverbial_word_tree, ADVERBIAL_WORD_TREE);
    }

    public static final SubLObject adverbial_word_tree_p_alt(SubLObject adverbial_word_tree) {
	return classes.subloop_instanceof_class(adverbial_word_tree, ADVERBIAL_WORD_TREE);
    }

    /**
     *
     *
     * @return boolean; t if this np contains an appositive, nil otherwise
     * @unknown ... John Doe, the mayor of Littleville, ...
     */
    @LispMethod(comment = "@return boolean; t if this np contains an appositive, nil otherwise\r\n@unknown ... John Doe, the mayor of Littleville, ...")
    public static SubLObject appositive_np_p(final SubLObject tree) {
	return makeBoolean(((((((NIL != parse_tree.np_tree_p(tree)) && methods.funcall_instance_method_with_0_args(tree, DAUGHTER_COUNT).numG(TWO_INTEGER)) && methods.funcall_instance_method_with_0_args(tree, DAUGHTER_COUNT).numL(FIVE_INTEGER))
		&& (NIL != parse_tree.np_tree_p(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ZERO_INTEGER)))) && (methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ONE_INTEGER), GET_CATEGORY) == $kw302$_))
		&& (NIL != parse_tree.np_tree_p(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, TWO_INTEGER))))
		&& (methods.funcall_instance_method_with_0_args(tree, DAUGHTER_COUNT).numE(THREE_INTEGER)
			|| (methods.funcall_instance_method_with_0_args(tree, DAUGHTER_COUNT).numE(FOUR_INTEGER) && (methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, THREE_INTEGER), GET_CATEGORY) == $kw302$_))));
    }

    /**
     *
     *
     * @return boolean; t if this np contains an appositive, nil otherwise
     * @unknown ... John Doe, the mayor of Littleville, ...
     */
    @LispMethod(comment = "@return boolean; t if this np contains an appositive, nil otherwise\r\n@unknown ... John Doe, the mayor of Littleville, ...")
    public static final SubLObject appositive_np_p_alt(SubLObject tree) {
	return makeBoolean(((((((NIL != parse_tree.np_tree_p(tree)) && methods.funcall_instance_method_with_0_args(tree, DAUGHTER_COUNT).numG(TWO_INTEGER)) && methods.funcall_instance_method_with_0_args(tree, DAUGHTER_COUNT).numL(FIVE_INTEGER))
		&& (NIL != parse_tree.np_tree_p(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ZERO_INTEGER)))) && (methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ONE_INTEGER), GET_CATEGORY) == $kw302$_))
		&& (NIL != parse_tree.np_tree_p(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, TWO_INTEGER))))
		&& (methods.funcall_instance_method_with_0_args(tree, DAUGHTER_COUNT).numE(THREE_INTEGER)
			|| (methods.funcall_instance_method_with_0_args(tree, DAUGHTER_COUNT).numE(FOUR_INTEGER) && (methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, THREE_INTEGER), GET_CATEGORY) == $kw302$_))));
    }

    public static SubLObject aux_verb_tree_copula_p_method(final SubLObject self) {
	return makeBoolean(NIL == methods.funcall_instance_method_with_0_args(self, GET_VERBAL_COMPLEMENT));
    }

    public static final SubLObject aux_verb_tree_copula_p_method_alt(SubLObject self) {
	return makeBoolean(NIL == methods.funcall_instance_method_with_0_args(self, GET_VERBAL_COMPLEMENT));
    }

    /**
     *
     *
     * @return adverbial-word-tree-p; the adverbial complement of this aux verb
     */
    @LispMethod(comment = "@return adverbial-word-tree-p; the adverbial complement of this aux verb")
    public static SubLObject aux_verb_tree_get_adverbial_complement_method(final SubLObject self) {
	return NIL;
    }

    /**
     *
     *
     * @return adverbial-word-tree-p; the adverbial complement of this aux verb
     */
    @LispMethod(comment = "@return adverbial-word-tree-p; the adverbial complement of this aux verb")
    public static final SubLObject aux_verb_tree_get_adverbial_complement_method_alt(SubLObject self) {
	return NIL;
    }

    public static SubLObject aux_verb_tree_get_complements_method(final SubLObject self) {
	SubLObject complements = NIL;
	final SubLObject subject = methods.funcall_instance_method_with_0_args(self, GET_SEMANTIC_SUBJECT);
	final SubLObject v_object = methods.funcall_instance_method_with_0_args(self, GET_SEMANTIC_DIRECT_OBJECT);
	final SubLObject verbal_complement = methods.funcall_instance_method_with_0_args(self, GET_VERBAL_COMPLEMENT);
	final SubLObject prep_complement = methods.funcall_instance_method_with_0_args(self, GET_PREPOSITIONAL_COMPLEMENT);
	final SubLObject adj_complement = methods.funcall_instance_method_with_0_args(self, GET_ADJECTIVAL_COMPLEMENT);
	final SubLObject adv_complement = methods.funcall_instance_method_with_0_args(self, GET_ADVERBIAL_COMPLEMENT);
	SubLObject cdolist_list_var = list(adv_complement, adj_complement, prep_complement, verbal_complement, v_object, subject);
	SubLObject complement = NIL;
	complement = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    if (NIL != complement) {
		complements = cons(complement, complements);
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    complement = cdolist_list_var.first();
	}
	return complements;
    }

    public static final SubLObject aux_verb_tree_get_complements_method_alt(SubLObject self) {
	{
	    SubLObject complements = NIL;
	    SubLObject subject = methods.funcall_instance_method_with_0_args(self, GET_SEMANTIC_SUBJECT);
	    SubLObject v_object = methods.funcall_instance_method_with_0_args(self, GET_SEMANTIC_DIRECT_OBJECT);
	    SubLObject verbal_complement = methods.funcall_instance_method_with_0_args(self, GET_VERBAL_COMPLEMENT);
	    SubLObject prep_complement = methods.funcall_instance_method_with_0_args(self, GET_PREPOSITIONAL_COMPLEMENT);
	    SubLObject adj_complement = methods.funcall_instance_method_with_0_args(self, GET_ADJECTIVAL_COMPLEMENT);
	    SubLObject adv_complement = methods.funcall_instance_method_with_0_args(self, GET_ADVERBIAL_COMPLEMENT);
	    SubLObject cdolist_list_var = list(adv_complement, adj_complement, prep_complement, verbal_complement, v_object, subject);
	    SubLObject complement = NIL;
	    for (complement = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), complement = cdolist_list_var.first()) {
		if (NIL != complement) {
		    complements = cons(complement, complements);
		}
	    }
	    return complements;
	}
    }

    /**
     *
     *
     * @return listp; the list of objects of this aux verb, which is the list of objects
    of its main verb
     */
    @LispMethod(comment = "@return listp; the list of objects of this aux verb, which is the list of objects\r\nof its main verb")
    public static SubLObject aux_verb_tree_get_direct_object_method(final SubLObject self) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject catch_var_for_aux_verb_tree_method = NIL;
	final SubLObject idx = parse_tree.get_parse_tree_idx(self);
	final SubLObject mother = parse_tree.get_parse_tree_mother(self);
	try {
	    thread.throwStack.push($sym603$OUTER_CATCH_FOR_AUX_VERB_TREE_METHOD);
	    try {
		sublisp_throw($sym603$OUTER_CATCH_FOR_AUX_VERB_TREE_METHOD, NIL != methods.funcall_instance_method_with_0_args(self, INVERTED_P) ? second(methods.funcall_instance_method_with_2_args(mother, FIND, NOMINAL_TREE_P, number_utilities.f_1X(idx)))
			: methods.funcall_instance_method_with_2_args(mother, FIND_FIRST, NOMINAL_TREE_P, number_utilities.f_1X(idx)));
	    } finally {
		final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    parse_tree.set_parse_tree_idx(self, idx);
		    parse_tree.set_parse_tree_mother(self, mother);
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
		}
	    }
	} catch (final Throwable ccatch_env_var) {
	    catch_var_for_aux_verb_tree_method = Errors.handleThrowable(ccatch_env_var, $sym603$OUTER_CATCH_FOR_AUX_VERB_TREE_METHOD);
	} finally {
	    thread.throwStack.pop();
	}
	return catch_var_for_aux_verb_tree_method;
    }

    /**
     *
     *
     * @return listp; the list of objects of this aux verb, which is the list of objects
    of its main verb
     */
    @LispMethod(comment = "@return listp; the list of objects of this aux verb, which is the list of objects\r\nof its main verb")
    public static final SubLObject aux_verb_tree_get_direct_object_method_alt(SubLObject self) {
	{
	    SubLObject catch_var_for_aux_verb_tree_method = NIL;
	    SubLObject idx = parse_tree.get_parse_tree_idx(self);
	    SubLObject mother = parse_tree.get_parse_tree_mother(self);
	    try {
		try {
		    sublisp_throw($sym603$OUTER_CATCH_FOR_AUX_VERB_TREE_METHOD, NIL != methods.funcall_instance_method_with_0_args(self, INVERTED_P) ? ((SubLObject) (second(methods.funcall_instance_method_with_2_args(mother, FIND, NOMINAL_TREE_P, number_utilities.f_1X(idx)))))
			    : methods.funcall_instance_method_with_2_args(mother, FIND_FIRST, NOMINAL_TREE_P, number_utilities.f_1X(idx)));
		} finally {
		    {
			SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
			try {
			    bind($is_thread_performing_cleanupP$, T);
			    parse_tree.set_parse_tree_idx(self, idx);
			    parse_tree.set_parse_tree_mother(self, mother);
			} finally {
			    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
			}
		    }
		}
	    } catch (Throwable ccatch_env_var) {
		catch_var_for_aux_verb_tree_method = Errors.handleThrowable(ccatch_env_var, $sym603$OUTER_CATCH_FOR_AUX_VERB_TREE_METHOD);
	    }
	    return catch_var_for_aux_verb_tree_method;
	}
    }

    /**
     *
     *
     * @return listp; the list of objects of this aux verb, which is the list of objects
    of its main verb
     */
    @LispMethod(comment = "@return listp; the list of objects of this aux verb, which is the list of objects\r\nof its main verb")
    public static SubLObject aux_verb_tree_get_indirect_object_method(final SubLObject self) {
	final SubLObject verbal_complement = methods.funcall_instance_method_with_0_args(self, GET_VERBAL_COMPLEMENT);
	final SubLObject main_verb = (NIL != verbal_complement) ? methods.funcall_instance_method_with_0_args(verbal_complement, GET_HEAD) : NIL;
	return NIL != main_verb ? methods.funcall_instance_method_with_0_args(main_verb, GET_INDIRECT_OBJECT) : NIL;
    }

    /**
     *
     *
     * @return listp; the list of objects of this aux verb, which is the list of objects
    of its main verb
     */
    @LispMethod(comment = "@return listp; the list of objects of this aux verb, which is the list of objects\r\nof its main verb")
    public static final SubLObject aux_verb_tree_get_indirect_object_method_alt(SubLObject self) {
	{
	    SubLObject verbal_complement = methods.funcall_instance_method_with_0_args(self, GET_VERBAL_COMPLEMENT);
	    SubLObject main_verb = (NIL != verbal_complement) ? ((SubLObject) (methods.funcall_instance_method_with_0_args(verbal_complement, GET_HEAD))) : NIL;
	    return NIL != main_verb ? ((SubLObject) (methods.funcall_instance_method_with_0_args(main_verb, GET_INDIRECT_OBJECT))) : NIL;
	}
    }

    public static SubLObject aux_verb_tree_get_keyword_renamings_method(final SubLObject self, SubLObject keywords) {
	if (keywords == UNPROVIDED) {
	    keywords = $list576;
	}
	SubLObject conjuncts = NIL;
	SubLObject disjuncts = NIL;
	final SubLObject subject = methods.funcall_instance_method_with_0_args(self, GET_SEMANTIC_SUBJECT);
	final SubLObject direct_object = methods.funcall_instance_method_with_0_args(self, GET_SEMANTIC_DIRECT_OBJECT);
	final SubLObject complement = methods.funcall_instance_method_with_0_args(self, GET_SEMANTIC_COMPLEMENTS).first();
	if ((NIL != subject) && (NIL != member($SUBJECT, keywords, EQL, UNPROVIDED))) {
	    conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($SUBJECT, subject), conjuncts);
	}
	if ((NIL != direct_object) && (NIL != member($OBJECT, keywords, EQL, UNPROVIDED))) {
	    conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($OBJECT, direct_object), conjuncts);
	}
	if ((((NIL != complement) && ((NIL == subject) || (!complement.eql(subject)))) && (!complement.eql(direct_object))) && (NIL != member($COMPLEMENT, keywords, EQL, UNPROVIDED))) {
	    SubLObject comp_cycls = methods.funcall_instance_method_with_0_args(complement, CYCLIFY_INT);
	    if (NIL == comp_cycls) {
		comp_cycls = cons(NIL, comp_cycls);
	    }
	    SubLObject cdolist_list_var = comp_cycls;
	    SubLObject comp_cycl = NIL;
	    comp_cycl = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		comp_cycl = simplifier.lift_conjuncts(comp_cycl);
		disjuncts = cons(cons($COMPLEMENT, comp_cycl), disjuncts);
		cdolist_list_var = cdolist_list_var.rest();
		comp_cycl = cdolist_list_var.first();
	    }
	}
	return cyclifier_interface.disjunctive_keyword_renamings(conjuncts, disjuncts);
    }

    public static final SubLObject aux_verb_tree_get_keyword_renamings_method_alt(SubLObject self, SubLObject keywords) {
	if (keywords == UNPROVIDED) {
	    keywords = $list_alt576;
	}
	{
	    SubLObject conjuncts = NIL;
	    SubLObject disjuncts = NIL;
	    SubLObject subject = methods.funcall_instance_method_with_0_args(self, GET_SEMANTIC_SUBJECT);
	    SubLObject direct_object = methods.funcall_instance_method_with_0_args(self, GET_SEMANTIC_DIRECT_OBJECT);
	    SubLObject complement = methods.funcall_instance_method_with_0_args(self, GET_SEMANTIC_COMPLEMENTS).first();
	    if ((NIL != subject) && (NIL != member($SUBJECT, keywords, EQL, UNPROVIDED))) {
		conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($SUBJECT, subject), conjuncts);
	    }
	    if ((NIL != direct_object) && (NIL != member($OBJECT, keywords, EQL, UNPROVIDED))) {
		conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($OBJECT, direct_object), conjuncts);
	    }
	    if ((((NIL != complement) && ((NIL == subject) || (complement != subject))) && (complement != direct_object)) && (NIL != member($COMPLEMENT, keywords, EQL, UNPROVIDED))) {
		{
		    SubLObject comp_cycls = methods.funcall_instance_method_with_0_args(complement, CYCLIFY_INT);
		    if (NIL == comp_cycls) {
			comp_cycls = cons(NIL, comp_cycls);
		    }
		    {
			SubLObject cdolist_list_var = comp_cycls;
			SubLObject comp_cycl = NIL;
			for (comp_cycl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), comp_cycl = cdolist_list_var.first()) {
			    comp_cycl = simplifier.lift_conjuncts(comp_cycl);
			    disjuncts = cons(cons($COMPLEMENT, comp_cycl), disjuncts);
			}
		    }
		}
	    }
	    return cyclifier_interface.disjunctive_keyword_renamings(conjuncts, disjuncts);
	}
    }

    /**
     *
     *
     * @return prepositional-or-particle-tree-p; the prepositional complement of this aux verb
     */
    @LispMethod(comment = "@return prepositional-or-particle-tree-p; the prepositional complement of this aux verb")
    public static SubLObject aux_verb_tree_get_prepositional_complement_method(final SubLObject self) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject catch_var_for_aux_verb_tree_method = NIL;
	final SubLObject mother = parse_tree.get_parse_tree_mother(self);
	try {
	    thread.throwStack.push($sym595$OUTER_CATCH_FOR_AUX_VERB_TREE_METHOD);
	    try {
		final SubLObject pp = methods.funcall_instance_method_with_1_args(mother, FIND_FIRST, PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE_P);
		sublisp_throw($sym595$OUTER_CATCH_FOR_AUX_VERB_TREE_METHOD, NIL != pp ? pp : NIL);
	    } finally {
		final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    parse_tree.set_parse_tree_mother(self, mother);
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
		}
	    }
	} catch (final Throwable ccatch_env_var) {
	    catch_var_for_aux_verb_tree_method = Errors.handleThrowable(ccatch_env_var, $sym595$OUTER_CATCH_FOR_AUX_VERB_TREE_METHOD);
	} finally {
	    thread.throwStack.pop();
	}
	return catch_var_for_aux_verb_tree_method;
    }

    /**
     *
     *
     * @return prepositional-or-particle-tree-p; the prepositional complement of this aux verb
     */
    @LispMethod(comment = "@return prepositional-or-particle-tree-p; the prepositional complement of this aux verb")
    public static final SubLObject aux_verb_tree_get_prepositional_complement_method_alt(SubLObject self) {
	{
	    SubLObject catch_var_for_aux_verb_tree_method = NIL;
	    SubLObject mother = parse_tree.get_parse_tree_mother(self);
	    try {
		try {
		    {
			SubLObject pp = methods.funcall_instance_method_with_1_args(mother, FIND_FIRST, PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE_P);
			sublisp_throw($sym595$OUTER_CATCH_FOR_AUX_VERB_TREE_METHOD, NIL != pp ? ((SubLObject) (pp)) : NIL);
		    }
		} finally {
		    {
			SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
			try {
			    bind($is_thread_performing_cleanupP$, T);
			    parse_tree.set_parse_tree_mother(self, mother);
			} finally {
			    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
			}
		    }
		}
	    } catch (Throwable ccatch_env_var) {
		catch_var_for_aux_verb_tree_method = Errors.handleThrowable(ccatch_env_var, $sym595$OUTER_CATCH_FOR_AUX_VERB_TREE_METHOD);
	    }
	    return catch_var_for_aux_verb_tree_method;
	}
    }

    public static SubLObject aux_verb_tree_get_semantic_complements_method(final SubLObject self) {
	if (NIL != methods.funcall_instance_method_with_0_args(self, COPULA_P)) {
	    return methods.funcall_instance_method_with_0_args(self, GET_COMPLEMENTS);
	}
	final SubLObject complement = methods.funcall_instance_method_with_0_args(self, GET_VERBAL_COMPLEMENT);
	return NIL != complement ? list(complement) : NIL;
    }

    public static final SubLObject aux_verb_tree_get_semantic_complements_method_alt(SubLObject self) {
	if (NIL != methods.funcall_instance_method_with_0_args(self, COPULA_P)) {
	    return methods.funcall_instance_method_with_0_args(self, GET_COMPLEMENTS);
	} else {
	    {
		SubLObject complement = methods.funcall_instance_method_with_0_args(self, GET_VERBAL_COMPLEMENT);
		return NIL != complement ? ((SubLObject) (list(complement))) : NIL;
	    }
	}
    }

    public static SubLObject aux_verb_tree_get_semantic_heads_method(final SubLObject self) {
	final SubLObject main_verb = methods.funcall_instance_method_with_0_args(self, GET_VERBAL_COMPLEMENT);
	return NIL != main_verb ? methods.funcall_instance_method_with_0_args(main_verb, GET_SEMANTIC_HEADS) : list(self);
    }

    public static final SubLObject aux_verb_tree_get_semantic_heads_method_alt(SubLObject self) {
	{
	    SubLObject main_verb = methods.funcall_instance_method_with_0_args(self, GET_VERBAL_COMPLEMENT);
	    return NIL != main_verb ? ((SubLObject) (methods.funcall_instance_method_with_0_args(main_verb, GET_SEMANTIC_HEADS))) : list(self);
	}
    }

    /**
     *
     *
     * @return phrase-tree-p; the semantic subject of this aux tree
     */
    @LispMethod(comment = "@return phrase-tree-p; the semantic subject of this aux tree")
    public static SubLObject aux_verb_tree_get_semantic_subject_method(final SubLObject self) {
	final SubLObject sister = methods.funcall_instance_method_with_1_args(self, GET_SISTER, ONE_INTEGER);
	if ((NIL != sister) && (NIL != parse_tree.nominal_tree_p(sister))) {
	    return methods.funcall_instance_method_with_0_args(self, GET_SUBJECT);
	}
	return NIL;
    }

    /**
     *
     *
     * @return phrase-tree-p; the semantic subject of this aux tree
     */
    @LispMethod(comment = "@return phrase-tree-p; the semantic subject of this aux tree")
    public static final SubLObject aux_verb_tree_get_semantic_subject_method_alt(SubLObject self) {
	{
	    SubLObject sister = methods.funcall_instance_method_with_1_args(self, GET_SISTER, ONE_INTEGER);
	    if ((NIL != sister) && (NIL != parse_tree.nominal_tree_p(sister))) {
		return methods.funcall_instance_method_with_0_args(self, GET_SUBJECT);
	    }
	}
	return NIL;
    }

    /**
     *
     *
     * @return phrase-tree-p; the subject of this verb
     */
    @LispMethod(comment = "@return phrase-tree-p; the subject of this verb")
    public static SubLObject aux_verb_tree_get_subject_method(final SubLObject self) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject catch_var_for_aux_verb_tree_method = NIL;
	final SubLObject idx = parse_tree.get_parse_tree_idx(self);
	final SubLObject mother = parse_tree.get_parse_tree_mother(self);
	try {
	    thread.throwStack.push($sym600$OUTER_CATCH_FOR_AUX_VERB_TREE_METHOD);
	    try {
		SubLObject subject = NIL;
		if (NIL != methods.funcall_instance_method_with_0_args(self, INVERTED_P)) {
		    subject = methods.funcall_instance_method_with_2_args(mother, FIND_FIRST, NOMINAL_TREE_P, number_utilities.f_1X(idx));
		} else {
		    subject = methods.funcall_instance_method_with_2_args(mother, FIND_LAST, NOMINAL_TREE_P, number_utilities.f_1_(idx));
		}
		sublisp_throw($sym600$OUTER_CATCH_FOR_AUX_VERB_TREE_METHOD, NIL != subject ? subject : methods.funcall_instance_method_with_0_args(mother, GET_SUBJECT));
	    } finally {
		final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    parse_tree.set_parse_tree_idx(self, idx);
		    parse_tree.set_parse_tree_mother(self, mother);
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
		}
	    }
	} catch (final Throwable ccatch_env_var) {
	    catch_var_for_aux_verb_tree_method = Errors.handleThrowable(ccatch_env_var, $sym600$OUTER_CATCH_FOR_AUX_VERB_TREE_METHOD);
	} finally {
	    thread.throwStack.pop();
	}
	return catch_var_for_aux_verb_tree_method;
    }

    /**
     *
     *
     * @return phrase-tree-p; the subject of this verb
     */
    @LispMethod(comment = "@return phrase-tree-p; the subject of this verb")
    public static final SubLObject aux_verb_tree_get_subject_method_alt(SubLObject self) {
	{
	    SubLObject catch_var_for_aux_verb_tree_method = NIL;
	    SubLObject idx = parse_tree.get_parse_tree_idx(self);
	    SubLObject mother = parse_tree.get_parse_tree_mother(self);
	    try {
		try {
		    {
			SubLObject subject = NIL;
			if (NIL != methods.funcall_instance_method_with_0_args(self, INVERTED_P)) {
			    subject = methods.funcall_instance_method_with_2_args(mother, FIND_FIRST, NOMINAL_TREE_P, number_utilities.f_1X(idx));
			} else {
			    subject = methods.funcall_instance_method_with_2_args(mother, FIND_LAST, NOMINAL_TREE_P, number_utilities.f_1_(idx));
			}
			sublisp_throw($sym600$OUTER_CATCH_FOR_AUX_VERB_TREE_METHOD, NIL != subject ? ((SubLObject) (subject)) : methods.funcall_instance_method_with_0_args(mother, GET_SUBJECT));
		    }
		} finally {
		    {
			SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
			try {
			    bind($is_thread_performing_cleanupP$, T);
			    parse_tree.set_parse_tree_idx(self, idx);
			    parse_tree.set_parse_tree_mother(self, mother);
			} finally {
			    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
			}
		    }
		}
	    } catch (Throwable ccatch_env_var) {
		catch_var_for_aux_verb_tree_method = Errors.handleThrowable(ccatch_env_var, $sym600$OUTER_CATCH_FOR_AUX_VERB_TREE_METHOD);
	    }
	    return catch_var_for_aux_verb_tree_method;
	}
    }

    public static SubLObject aux_verb_tree_get_tense_method(final SubLObject self) {
	return NIL != member(word_tree_get_string_method(self), $list588, EQUALP, UNPROVIDED) ? $PRESENT : NIL != member(word_tree_get_string_method(self), $list589, EQUALP, UNPROVIDED) ? $PAST : NIL != member(word_tree_get_string_method(self), $list590, EQUALP, UNPROVIDED) ? $INFINITIVE : NIL;
    }

    public static final SubLObject aux_verb_tree_get_tense_method_alt(SubLObject self) {
	return NIL != member(com.cyc.cycjava.cycl.word_tree.word_tree_get_string_method(self), $list_alt588, EQUALP, UNPROVIDED) ? ((SubLObject) ($PRESENT))
		: NIL != member(com.cyc.cycjava.cycl.word_tree.word_tree_get_string_method(self), $list_alt589, EQUALP, UNPROVIDED) ? ((SubLObject) ($PAST))
			: NIL != member(com.cyc.cycjava.cycl.word_tree.word_tree_get_string_method(self), $list_alt590, EQUALP, UNPROVIDED) ? ((SubLObject) ($INFINITIVE)) : NIL;
    }

    /**
     *
     *
     * @return booleanp; t if this verb is inverted, nil otherwise
     */
    @LispMethod(comment = "@return booleanp; t if this verb is inverted, nil otherwise")
    public static SubLObject aux_verb_tree_inverted_p_method(final SubLObject self) {
	final SubLObject matrix = methods.funcall_instance_method_with_0_args(self, GET_MATRIX_CLAUSE);
	return makeBoolean((NIL != matrix) && (((NIL != parse_tree.question_tree_p(matrix)) && (NIL == parse_tree.verbal_phrase_tree_p(methods.funcall_instance_method_with_1_args(matrix, GET_DAUGHTER, ZERO_INTEGER)))) || (NIL != parse_tree.sinv_tree_p(matrix))));
    }

    /**
     *
     *
     * @return booleanp; t if this verb is inverted, nil otherwise
     */
    @LispMethod(comment = "@return booleanp; t if this verb is inverted, nil otherwise")
    public static final SubLObject aux_verb_tree_inverted_p_method_alt(SubLObject self) {
	{
	    SubLObject matrix = methods.funcall_instance_method_with_0_args(self, GET_MATRIX_CLAUSE);
	    return makeBoolean((NIL != matrix) && (((NIL != parse_tree.question_tree_p(matrix)) && (NIL == parse_tree.verbal_phrase_tree_p(methods.funcall_instance_method_with_1_args(matrix, GET_DAUGHTER, ZERO_INTEGER)))) || (NIL != parse_tree.sinv_tree_p(matrix))));
	}
    }

    public static SubLObject aux_verb_tree_p(final SubLObject aux_verb_tree) {
	return classes.subloop_instanceof_class(aux_verb_tree, AUX_VERB_TREE);
    }

    public static final SubLObject aux_verb_tree_p_alt(SubLObject aux_verb_tree) {
	return classes.subloop_instanceof_class(aux_verb_tree, AUX_VERB_TREE);
    }

    /**
     *
     *
     * @return booleanp; t if this verb is the head of a passive construction, nil otherwise
     */
    @LispMethod(comment = "@return booleanp; t if this verb is the head of a passive construction, nil otherwise")
    public static SubLObject aux_verb_tree_passive_p_method(final SubLObject self) {
	final SubLObject main = methods.funcall_instance_method_with_0_args(self, GET_VERBAL_COMPLEMENT);
	return NIL != main ? methods.funcall_instance_method_with_0_args(main, PASSIVE_P) : NIL;
    }

    /**
     *
     *
     * @return booleanp; t if this verb is the head of a passive construction, nil otherwise
     */
    @LispMethod(comment = "@return booleanp; t if this verb is the head of a passive construction, nil otherwise")
    public static final SubLObject aux_verb_tree_passive_p_method_alt(SubLObject self) {
	{
	    SubLObject main = methods.funcall_instance_method_with_0_args(self, GET_VERBAL_COMPLEMENT);
	    return NIL != main ? ((SubLObject) (methods.funcall_instance_method_with_0_args(main, PASSIVE_P))) : NIL;
	}
    }

    public static SubLObject cardinal_word_tree_p(final SubLObject cardinal_word_tree) {
	return classes.subloop_instanceof_class(cardinal_word_tree, CARDINAL_WORD_TREE);
    }

    public static final SubLObject cardinal_word_tree_p_alt(SubLObject cardinal_word_tree) {
	return classes.subloop_instanceof_class(cardinal_word_tree, CARDINAL_WORD_TREE);
    }

    /**
     *
     *
     * @return boolean; t if OBJECT is a Charniak parse-expression, nil otherwise
     */
    @LispMethod(comment = "@return boolean; t if OBJECT is a Charniak parse-expression, nil otherwise")
    public static SubLObject charniak_expression_p(final SubLObject v_object) {
	return makeBoolean((v_object.isCons() && v_object.first().isKeyword()) && v_object.rest().isList());
    }

    /**
     *
     *
     * @return boolean; t if OBJECT is a Charniak parse-expression, nil otherwise
     */
    @LispMethod(comment = "@return boolean; t if OBJECT is a Charniak parse-expression, nil otherwise")
    public static final SubLObject charniak_expression_p_alt(SubLObject v_object) {
	return makeBoolean((v_object.isCons() && v_object.first().isKeyword()) && v_object.rest().isList());
    }

    /**
     *
     *
     * @return parse-expression; the topmost parse-expression of CHARNIAK-PARSER-PARSE
     */
    @LispMethod(comment = "@return parse-expression; the topmost parse-expression of CHARNIAK-PARSER-PARSE")
    public static SubLObject charniak_expression_parse_expression(final SubLObject charniak_parser_parse) {
	return second(charniak_parser_parse);
    }

    /**
     *
     *
     * @return parse-expression; the topmost parse-expression of CHARNIAK-PARSER-PARSE
     */
    @LispMethod(comment = "@return parse-expression; the topmost parse-expression of CHARNIAK-PARSER-PARSE")
    public static final SubLObject charniak_expression_parse_expression_alt(SubLObject charniak_parser_parse) {
	return second(charniak_parser_parse);
    }

    public static SubLObject coordinate_phrase_tree_coordinate_phrase_p_method(final SubLObject self) {
	return T;
    }

    public static final SubLObject coordinate_phrase_tree_coordinate_phrase_p_method_alt(SubLObject self) {
	return T;
    }

    public static SubLObject coordinate_phrase_tree_p(final SubLObject coordinate_phrase_tree) {
	return classes.subloop_instanceof_class(coordinate_phrase_tree, COORDINATE_PHRASE_TREE);
    }

    public static final SubLObject coordinate_phrase_tree_p_alt(SubLObject coordinate_phrase_tree) {
	return classes.subloop_instanceof_class(coordinate_phrase_tree, COORDINATE_PHRASE_TREE);
    }

    /**
     *
     *
     * @return list; a list of the conjuncts of this conjunction
     */
    @LispMethod(comment = "@return list; a list of the conjuncts of this conjunction")
    public static SubLObject coordinate_word_tree_get_complements_method(final SubLObject self) {
	return list(methods.funcall_instance_method_with_1_args(self, GET_SISTER, MINUS_ONE_INTEGER), methods.funcall_instance_method_with_1_args(self, GET_SISTER, ONE_INTEGER));
    }

    public static SubLObject coordinate_word_tree_p(final SubLObject coordinate_word_tree) {
	return classes.subloop_instanceof_class(coordinate_word_tree, COORDINATE_WORD_TREE);
    }

    public static final SubLObject coordinate_word_tree_p_alt(SubLObject coordinate_word_tree) {
	return classes.subloop_instanceof_class(coordinate_word_tree, COORDINATE_WORD_TREE);
    }

    public static SubLObject declare_word_tree_file() {
	declareFunction("get_word_tree_abs_idx", "GET-WORD-TREE-ABS-IDX", 1, 0, false);
	declareFunction("set_word_tree_abs_idx", "SET-WORD-TREE-ABS-IDX", 2, 0, false);
	declareFunction("get_word_tree_refs", "GET-WORD-TREE-REFS", 1, 0, false);
	declareFunction("set_word_tree_refs", "SET-WORD-TREE-REFS", 2, 0, false);
	declareFunction("get_word_tree_lexes", "GET-WORD-TREE-LEXES", 1, 0, false);
	declareFunction("set_word_tree_lexes", "SET-WORD-TREE-LEXES", 2, 0, false);
	declareFunction("word_tree_modified_dependent_meaning_p_method", "WORD-TREE-MODIFIED-DEPENDENT-MEANING-P-METHOD", 1, 0, false);
	declareFunction("word_tree_pp_comp_filter_lexes_method", "WORD-TREE-PP-COMP-FILTER-LEXES-METHOD", 1, 0, false);
	declareFunction("word_tree_frame_filter_lexes_method", "WORD-TREE-FRAME-FILTER-LEXES-METHOD", 1, 0, false);
	declareFunction("word_tree_pos_filter_lexes_method", "WORD-TREE-POS-FILTER-LEXES-METHOD", 1, 0, false);
	declareFunction("word_tree_tree_keyword_eq_classes_method", "WORD-TREE-TREE-KEYWORD-EQ-CLASSES-METHOD", 1, 0, false);
	declareFunction("word_tree_cyclify_nucleus_method", "WORD-TREE-CYCLIFY-NUCLEUS-METHOD", 1, 1, false);
	declareFunction("word_tree_cyclify_int_method", "WORD-TREE-CYCLIFY-INT-METHOD", 1, 0, false);
	declareFunction("word_tree_get_keyword_renamings_method", "WORD-TREE-GET-KEYWORD-RENAMINGS-METHOD", 1, 1, false);
	declareFunction("word_tree_partition_semantic_complements_method", "WORD-TREE-PARTITION-SEMANTIC-COMPLEMENTS-METHOD", 1, 0, false);
	declareFunction("word_tree_get_semantic_complements_method", "WORD-TREE-GET-SEMANTIC-COMPLEMENTS-METHOD", 1, 0, false);
	declareFunction("word_tree_get_oblique_object_method", "WORD-TREE-GET-OBLIQUE-OBJECT-METHOD", 1, 0, false);
	declareFunction("word_tree_get_pp_complement_method", "WORD-TREE-GET-PP-COMPLEMENT-METHOD", 1, 0, false);
	declareFunction("subloop_reserved_initialize_word_tree_class", "SUBLOOP-RESERVED-INITIALIZE-WORD-TREE-CLASS", 1, 0, false);
	declareFunction("subloop_reserved_initialize_word_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-WORD-TREE-INSTANCE", 1, 0, false);
	declareFunction("word_tree_p", "WORD-TREE-P", 1, 0, false);
	declareFunction("new_word_tree", "NEW-WORD-TREE", 4, 2, false);
	declareFunction("word_tree_get_string_method", "WORD-TREE-GET-STRING-METHOD", 1, 0, false);
	declareFunction("word_tree_get_abs_index_method", "WORD-TREE-GET-ABS-INDEX-METHOD", 1, 0, false);
	declareFunction("word_tree_get_lexes_method", "WORD-TREE-GET-LEXES-METHOD", 1, 0, false);
	declareFunction("word_tree_get_ranked_lexes_method", "WORD-TREE-GET-RANKED-LEXES-METHOD", 1, 0, false);
	declareFunction("word_tree_get_refs_method", "WORD-TREE-GET-REFS-METHOD", 1, 0, false);
	declareFunction("word_tree_set_refs_method", "WORD-TREE-SET-REFS-METHOD", 2, 0, false);
	declareFunction("word_tree_yield_method", "WORD-TREE-YIELD-METHOD", 1, 0, false);
	declareFunction("word_tree_get_parse_expression_method", "WORD-TREE-GET-PARSE-EXPRESSION-METHOD", 1, 0, false);
	declareFunction("word_tree_get_heads_method", "WORD-TREE-GET-HEADS-METHOD", 1, 0, false);
	declareFunction("word_tree_get_head_method", "WORD-TREE-GET-HEAD-METHOD", 1, 0, false);
	declareFunction("word_tree_get_semantic_heads_method", "WORD-TREE-GET-SEMANTIC-HEADS-METHOD", 1, 0, false);
	declareFunction("word_tree_lexify_int_method", "WORD-TREE-LEXIFY-INT-METHOD", 2, 0, false);
	declareFunction("word_tree_get_pps_method", "WORD-TREE-GET-PPS-METHOD", 1, 0, false);
	declareFunction("word_tree_get_complements_method", "WORD-TREE-GET-COMPLEMENTS-METHOD", 1, 0, false);
	declareFunction("word_tree_get_modifiers_method", "WORD-TREE-GET-MODIFIERS-METHOD", 1, 0, false);
	declareFunction("word_tree_get_modifieds_method", "WORD-TREE-GET-MODIFIEDS-METHOD", 1, 0, false);
	declareFunction("word_tree_temporal_tree_p_method", "WORD-TREE-TEMPORAL-TREE-P-METHOD", 1, 0, false);
	declareFunction("word_tree_relative_pronoun_p_method", "WORD-TREE-RELATIVE-PRONOUN-P-METHOD", 1, 0, false);
	declareFunction("word_tree_retokenize_method", "WORD-TREE-RETOKENIZE-METHOD", 2, 0, false);
	declareFunction("word_tree_logical_form_int_method", "WORD-TREE-LOGICAL-FORM-INT-METHOD", 1, 0, false);
	declareFunction("subloop_reserved_initialize_function_word_tree_class", "SUBLOOP-RESERVED-INITIALIZE-FUNCTION-WORD-TREE-CLASS", 1, 0, false);
	declareFunction("subloop_reserved_initialize_function_word_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-FUNCTION-WORD-TREE-INSTANCE", 1, 0, false);
	declareFunction("function_word_tree_p", "FUNCTION-WORD-TREE-P", 1, 0, false);
	declareFunction("subloop_reserved_initialize_modifier_word_tree_class", "SUBLOOP-RESERVED-INITIALIZE-MODIFIER-WORD-TREE-CLASS", 1, 0, false);
	declareFunction("subloop_reserved_initialize_modifier_word_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-MODIFIER-WORD-TREE-INSTANCE", 1, 0, false);
	declareFunction("modifier_word_tree_p", "MODIFIER-WORD-TREE-P", 1, 0, false);
	declareFunction("subloop_reserved_initialize_coordinate_word_tree_class", "SUBLOOP-RESERVED-INITIALIZE-COORDINATE-WORD-TREE-CLASS", 1, 0, false);
	declareFunction("subloop_reserved_initialize_coordinate_word_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-COORDINATE-WORD-TREE-INSTANCE", 1, 0, false);
	declareFunction("coordinate_word_tree_p", "COORDINATE-WORD-TREE-P", 1, 0, false);
	declareFunction("coordinate_word_tree_get_complements_method", "COORDINATE-WORD-TREE-GET-COMPLEMENTS-METHOD", 1, 0, false);
	declareFunction("phrase_tree_coordinate_phrase_p_method", "PHRASE-TREE-COORDINATE-PHRASE-P-METHOD", 1, 0, false);
	declareFunction("subloop_reserved_initialize_coordinate_phrase_tree_class", "SUBLOOP-RESERVED-INITIALIZE-COORDINATE-PHRASE-TREE-CLASS", 1, 0, false);
	declareFunction("subloop_reserved_initialize_coordinate_phrase_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-COORDINATE-PHRASE-TREE-INSTANCE", 1, 0, false);
	declareFunction("coordinate_phrase_tree_p", "COORDINATE-PHRASE-TREE-P", 1, 0, false);
	declareFunction("coordinate_phrase_tree_coordinate_phrase_p_method", "COORDINATE-PHRASE-TREE-COORDINATE-PHRASE-P-METHOD", 1, 0, false);
	declareFunction("subloop_reserved_initialize_unlike_coordinate_phrase_tree_class", "SUBLOOP-RESERVED-INITIALIZE-UNLIKE-COORDINATE-PHRASE-TREE-CLASS", 1, 0, false);
	declareFunction("subloop_reserved_initialize_unlike_coordinate_phrase_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-UNLIKE-COORDINATE-PHRASE-TREE-INSTANCE", 1, 0, false);
	declareFunction("unlike_coordinate_phrase_tree_p", "UNLIKE-COORDINATE-PHRASE-TREE-P", 1, 0, false);
	declareFunction("unlike_coordinate_phrase_tree_coordinate_phrase_p_method", "UNLIKE-COORDINATE-PHRASE-TREE-COORDINATE-PHRASE-P-METHOD", 1, 0, false);
	declareFunction("nominal_word_tree_get_keyword_renamings_method", "NOMINAL-WORD-TREE-GET-KEYWORD-RENAMINGS-METHOD", 1, 1, false);
	declareFunction("nominal_word_tree_cyclify_nucleus_method", "NOMINAL-WORD-TREE-CYCLIFY-NUCLEUS-METHOD", 1, 1, false);
	declareFunction("nominal_word_tree_cyclify_int_method", "NOMINAL-WORD-TREE-CYCLIFY-INT-METHOD", 1, 0, false);
	declareFunction("nominal_word_tree_definite_description_p_method", "NOMINAL-WORD-TREE-DEFINITE-DESCRIPTION-P-METHOD", 1, 0, false);
	declareFunction("nominal_word_tree_relational_noun_p_method", "NOMINAL-WORD-TREE-RELATIONAL-NOUN-P-METHOD", 1, 0, false);
	declareFunction("nominal_word_tree_get_quantifier_method", "NOMINAL-WORD-TREE-GET-QUANTIFIER-METHOD", 1, 0, false);
	declareFunction("subloop_reserved_initialize_nominal_word_tree_class", "SUBLOOP-RESERVED-INITIALIZE-NOMINAL-WORD-TREE-CLASS", 1, 0, false);
	declareFunction("subloop_reserved_initialize_nominal_word_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-NOMINAL-WORD-TREE-INSTANCE", 1, 0, false);
	declareFunction("nominal_word_tree_p", "NOMINAL-WORD-TREE-P", 1, 0, false);
	declareFunction("nominal_word_tree_get_number_method", "NOMINAL-WORD-TREE-GET-NUMBER-METHOD", 1, 0, false);
	declareFunction("nominal_word_tree_get_complements_method", "NOMINAL-WORD-TREE-GET-COMPLEMENTS-METHOD", 1, 0, false);
	declareFunction("nominal_word_tree_get_determiner_method", "NOMINAL-WORD-TREE-GET-DETERMINER-METHOD", 1, 0, false);
	declareFunction("nominal_word_tree_get_overt_quantifier_method", "NOMINAL-WORD-TREE-GET-OVERT-QUANTIFIER-METHOD", 1, 0, false);
	declareFunction("word_tree_get_existential_null_determiner_method", "WORD-TREE-GET-EXISTENTIAL-NULL-DETERMINER-METHOD", 1, 0, false);
	declareFunction("get_null_determiner", "GET-NULL-DETERMINER", 3, 1, false);
	declareFunction("nominal_word_tree_get_possessor_method", "NOMINAL-WORD-TREE-GET-POSSESSOR-METHOD", 1, 0, false);
	declareFunction("nominal_word_tree_get_specifier_method", "NOMINAL-WORD-TREE-GET-SPECIFIER-METHOD", 1, 0, false);
	declareFunction("nominal_word_tree_get_antecedent_method", "NOMINAL-WORD-TREE-GET-ANTECEDENT-METHOD", 1, 0, false);
	declareFunction("nominal_word_tree_get_gender_method", "NOMINAL-WORD-TREE-GET-GENDER-METHOD", 1, 0, false);
	declareFunction("nominal_word_tree_get_person_method", "NOMINAL-WORD-TREE-GET-PERSON-METHOD", 1, 0, false);
	declareFunction("nominal_word_tree_singular_p_method", "NOMINAL-WORD-TREE-SINGULAR-P-METHOD", 1, 0, false);
	declareFunction("nominal_word_tree_plural_p_method", "NOMINAL-WORD-TREE-PLURAL-P-METHOD", 1, 0, false);
	declareFunction("non_of_prepositional_tree_p", "NON-OF-PREPOSITIONAL-TREE-P", 1, 0, false);
	declareFunction("nominal_word_tree_get_modifieds_method", "NOMINAL-WORD-TREE-GET-MODIFIEDS-METHOD", 1, 0, false);
	declareFunction("appositive_np_p", "APPOSITIVE-NP-P", 1, 0, false);
	declareFunction("subloop_reserved_initialize_nn_tree_class", "SUBLOOP-RESERVED-INITIALIZE-NN-TREE-CLASS", 1, 0, false);
	declareFunction("subloop_reserved_initialize_nn_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-NN-TREE-INSTANCE", 1, 0, false);
	declareFunction("nn_tree_p", "NN-TREE-P", 1, 0, false);
	declareFunction("nn_tree_get_number_method", "NN-TREE-GET-NUMBER-METHOD", 1, 0, false);
	declareFunction("name_word_tree_get_quantifier_method", "NAME-WORD-TREE-GET-QUANTIFIER-METHOD", 1, 0, false);
	declareFunction("subloop_reserved_initialize_name_word_tree_class", "SUBLOOP-RESERVED-INITIALIZE-NAME-WORD-TREE-CLASS", 1, 0, false);
	declareFunction("subloop_reserved_initialize_name_word_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-NAME-WORD-TREE-INSTANCE", 1, 0, false);
	declareFunction("name_word_tree_p", "NAME-WORD-TREE-P", 1, 0, false);
	declareFunction("subloop_reserved_initialize_dollar_word_tree_class", "SUBLOOP-RESERVED-INITIALIZE-DOLLAR-WORD-TREE-CLASS", 1, 0, false);
	declareFunction("subloop_reserved_initialize_dollar_word_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-DOLLAR-WORD-TREE-INSTANCE", 1, 0, false);
	declareFunction("dollar_word_tree_p", "DOLLAR-WORD-TREE-P", 1, 0, false);
	declareFunction("dollar_word_tree_get_overt_quantifier_method", "DOLLAR-WORD-TREE-GET-OVERT-QUANTIFIER-METHOD", 1, 0, false);
	declareFunction("subloop_reserved_initialize_nnp_tree_class", "SUBLOOP-RESERVED-INITIALIZE-NNP-TREE-CLASS", 1, 0, false);
	declareFunction("subloop_reserved_initialize_nnp_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-NNP-TREE-INSTANCE", 1, 0, false);
	declareFunction("nnp_tree_p", "NNP-TREE-P", 1, 0, false);
	declareFunction("nnp_tree_get_number_method", "NNP-TREE-GET-NUMBER-METHOD", 1, 0, false);
	declareFunction("subloop_reserved_initialize_nns_tree_class", "SUBLOOP-RESERVED-INITIALIZE-NNS-TREE-CLASS", 1, 0, false);
	declareFunction("subloop_reserved_initialize_nns_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-NNS-TREE-INSTANCE", 1, 0, false);
	declareFunction("nns_tree_p", "NNS-TREE-P", 1, 0, false);
	declareFunction("nns_tree_get_number_method", "NNS-TREE-GET-NUMBER-METHOD", 1, 0, false);
	declareFunction("subloop_reserved_initialize_nnps_tree_class", "SUBLOOP-RESERVED-INITIALIZE-NNPS-TREE-CLASS", 1, 0, false);
	declareFunction("subloop_reserved_initialize_nnps_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-NNPS-TREE-INSTANCE", 1, 0, false);
	declareFunction("nnps_tree_p", "NNPS-TREE-P", 1, 0, false);
	declareFunction("nnps_tree_get_number_method", "NNPS-TREE-GET-NUMBER-METHOD", 1, 0, false);
	declareFunction("subloop_reserved_initialize_prp_tree_class", "SUBLOOP-RESERVED-INITIALIZE-PRP-TREE-CLASS", 1, 0, false);
	declareFunction("subloop_reserved_initialize_prp_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-PRP-TREE-INSTANCE", 1, 0, false);
	declareFunction("prp_tree_p", "PRP-TREE-P", 1, 0, false);
	declareFunction("prp_tree_get_number_method", "PRP-TREE-GET-NUMBER-METHOD", 1, 0, false);
	declareFunction("prp_tree_get_person_method", "PRP-TREE-GET-PERSON-METHOD", 1, 0, false);
	declareFunction("prp_tree_get_gender_method", "PRP-TREE-GET-GENDER-METHOD", 1, 0, false);
	declareFunction("subloop_reserved_initialize_wp_tree_class", "SUBLOOP-RESERVED-INITIALIZE-WP-TREE-CLASS", 1, 0, false);
	declareFunction("subloop_reserved_initialize_wp_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-WP-TREE-INSTANCE", 1, 0, false);
	declareFunction("wp_tree_p", "WP-TREE-P", 1, 0, false);
	declareFunction("wp_tree_get_refs_method", "WP-TREE-GET-REFS-METHOD", 1, 0, false);
	declareFunction("wp_tree_get_antecedent_method", "WP-TREE-GET-ANTECEDENT-METHOD", 1, 0, false);
	declareFunction("wp_tree_get_quantifier_method", "WP-TREE-GET-QUANTIFIER-METHOD", 1, 0, false);
	declareFunction("wp_tree_get_number_method", "WP-TREE-GET-NUMBER-METHOD", 1, 0, false);
	declareFunction("wp_tree_get_gender_method", "WP-TREE-GET-GENDER-METHOD", 1, 0, false);
	declareFunction("relative_clause_p", "RELATIVE-CLAUSE-P", 1, 0, false);
	declareFunction("verbal_word_tree_particle_filter_lexes_method", "VERBAL-WORD-TREE-PARTICLE-FILTER-LEXES-METHOD", 1, 0, false);
	declareFunction("verbal_word_tree_partition_semantic_complements_method", "VERBAL-WORD-TREE-PARTITION-SEMANTIC-COMPLEMENTS-METHOD", 1, 0, false);
	declareFunction("verbal_word_tree_get_keyword_renamings_method", "VERBAL-WORD-TREE-GET-KEYWORD-RENAMINGS-METHOD", 1, 1, false);
	declareFunction("verbal_word_tree_get_controller_method", "VERBAL-WORD-TREE-GET-CONTROLLER-METHOD", 1, 0, false);
	declareFunction("verbal_word_tree_get_control_verb_method", "VERBAL-WORD-TREE-GET-CONTROL-VERB-METHOD", 1, 0, false);
	declareFunction("verbal_word_tree_object_controller_p_method", "VERBAL-WORD-TREE-OBJECT-CONTROLLER-P-METHOD", 1, 0, false);
	declareFunction("verbal_word_tree_subject_controller_p_method", "VERBAL-WORD-TREE-SUBJECT-CONTROLLER-P-METHOD", 1, 0, false);
	declareFunction("verbal_word_tree_control_verb_p_method", "VERBAL-WORD-TREE-CONTROL-VERB-P-METHOD", 1, 0, false);
	declareFunction("verbal_word_tree_get_matrix_clause_method", "VERBAL-WORD-TREE-GET-MATRIX-CLAUSE-METHOD", 1, 0, false);
	declareFunction("subloop_reserved_initialize_verbal_word_tree_class", "SUBLOOP-RESERVED-INITIALIZE-VERBAL-WORD-TREE-CLASS", 1, 0, false);
	declareFunction("subloop_reserved_initialize_verbal_word_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-VERBAL-WORD-TREE-INSTANCE", 1, 0, false);
	declareFunction("verbal_word_tree_p", "VERBAL-WORD-TREE-P", 1, 0, false);
	declareFunction("verbal_word_tree_get_predicate_method", "VERBAL-WORD-TREE-GET-PREDICATE-METHOD", 1, 0, false);
	declareFunction("verbal_word_tree_get_number_method", "VERBAL-WORD-TREE-GET-NUMBER-METHOD", 1, 0, false);
	declareFunction("verbal_word_tree_get_person_method", "VERBAL-WORD-TREE-GET-PERSON-METHOD", 1, 0, false);
	declareFunction("verbal_word_tree_get_tense_method", "VERBAL-WORD-TREE-GET-TENSE-METHOD", 1, 0, false);
	declareFunction("verbal_word_tree_get_subject_method", "VERBAL-WORD-TREE-GET-SUBJECT-METHOD", 1, 0, false);
	declareFunction("verbal_word_tree_get_objects_method", "VERBAL-WORD-TREE-GET-OBJECTS-METHOD", 1, 0, false);
	declareFunction("verbal_word_tree_get_moved_nps_method", "VERBAL-WORD-TREE-GET-MOVED-NPS-METHOD", 1, 0, false);
	declareFunction("verbal_word_tree_get_moved_objects_method", "VERBAL-WORD-TREE-GET-MOVED-OBJECTS-METHOD", 1, 0, false);
	declareFunction("verbal_word_tree_get_direct_object_method", "VERBAL-WORD-TREE-GET-DIRECT-OBJECT-METHOD", 1, 0, false);
	declareFunction("verbal_word_tree_get_indirect_object_method", "VERBAL-WORD-TREE-GET-INDIRECT-OBJECT-METHOD", 1, 0, false);
	declareFunction("verbal_word_tree_get_semantic_direct_object_method", "VERBAL-WORD-TREE-GET-SEMANTIC-DIRECT-OBJECT-METHOD", 1, 0, false);
	declareFunction("verbal_word_tree_get_semantic_indirect_object_method", "VERBAL-WORD-TREE-GET-SEMANTIC-INDIRECT-OBJECT-METHOD", 1, 0, false);
	declareFunction("verbal_word_tree_get_verbal_complement_method", "VERBAL-WORD-TREE-GET-VERBAL-COMPLEMENT-METHOD", 1, 0, false);
	declareFunction("verbal_word_tree_get_adjectival_complement_method", "VERBAL-WORD-TREE-GET-ADJECTIVAL-COMPLEMENT-METHOD", 1, 0, false);
	declareFunction("verbal_word_tree_get_complements_method", "VERBAL-WORD-TREE-GET-COMPLEMENTS-METHOD", 1, 0, false);
	declareFunction("verbal_word_tree_get_particle_method", "VERBAL-WORD-TREE-GET-PARTICLE-METHOD", 1, 0, false);
	declareFunction("verbal_word_tree_get_infinitive_marker_method", "VERBAL-WORD-TREE-GET-INFINITIVE-MARKER-METHOD", 1, 0, false);
	declareFunction("verbal_word_tree_dummy_to_p_method", "VERBAL-WORD-TREE-DUMMY-TO-P-METHOD", 1, 0, false);
	declareFunction("verbal_word_tree_get_semantic_subject_method", "VERBAL-WORD-TREE-GET-SEMANTIC-SUBJECT-METHOD", 1, 0, false);
	declareFunction("verbal_word_tree_get_semantic_objects_method", "VERBAL-WORD-TREE-GET-SEMANTIC-OBJECTS-METHOD", 1, 0, false);
	declareFunction("verbal_word_tree_get_ancestor_objects_method", "VERBAL-WORD-TREE-GET-ANCESTOR-OBJECTS-METHOD", 1, 0, false);
	declareFunction("verbal_word_tree_inverted_p_method", "VERBAL-WORD-TREE-INVERTED-P-METHOD", 1, 0, false);
	declareFunction("verbal_word_tree_finite_p_method", "VERBAL-WORD-TREE-FINITE-P-METHOD", 1, 0, false);
	declareFunction("verbal_word_tree_passive_p_method", "VERBAL-WORD-TREE-PASSIVE-P-METHOD", 1, 0, false);
	declareFunction("verbal_word_tree_infinitive_p_method", "VERBAL-WORD-TREE-INFINITIVE-P-METHOD", 1, 0, false);
	declareFunction("verbal_word_tree_base_p_method", "VERBAL-WORD-TREE-BASE-P-METHOD", 1, 0, false);
	declareFunction("subloop_reserved_initialize_vbz_tree_class", "SUBLOOP-RESERVED-INITIALIZE-VBZ-TREE-CLASS", 1, 0, false);
	declareFunction("subloop_reserved_initialize_vbz_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-VBZ-TREE-INSTANCE", 1, 0, false);
	declareFunction("vbz_tree_p", "VBZ-TREE-P", 1, 0, false);
	declareFunction("vbz_tree_get_tense_method", "VBZ-TREE-GET-TENSE-METHOD", 1, 0, false);
	declareFunction("subloop_reserved_initialize_vbn_tree_class", "SUBLOOP-RESERVED-INITIALIZE-VBN-TREE-CLASS", 1, 0, false);
	declareFunction("subloop_reserved_initialize_vbn_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-VBN-TREE-INSTANCE", 1, 0, false);
	declareFunction("vbn_tree_p", "VBN-TREE-P", 1, 0, false);
	declareFunction("vbn_tree_get_aux_verb_method", "VBN-TREE-GET-AUX-VERB-METHOD", 1, 0, false);
	declareFunction("vbn_tree_get_semantic_subject_method", "VBN-TREE-GET-SEMANTIC-SUBJECT-METHOD", 1, 0, false);
	declareFunction("vbn_tree_get_semantic_direct_object_method", "VBN-TREE-GET-SEMANTIC-DIRECT-OBJECT-METHOD", 1, 0, false);
	declareFunction("vbn_tree_get_semantic_indirect_object_method", "VBN-TREE-GET-SEMANTIC-INDIRECT-OBJECT-METHOD", 1, 0, false);
	declareFunction("vbn_tree_passive_p_method", "VBN-TREE-PASSIVE-P-METHOD", 1, 0, false);
	declareFunction("subloop_reserved_initialize_vbd_tree_class", "SUBLOOP-RESERVED-INITIALIZE-VBD-TREE-CLASS", 1, 0, false);
	declareFunction("subloop_reserved_initialize_vbd_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-VBD-TREE-INSTANCE", 1, 0, false);
	declareFunction("vbd_tree_p", "VBD-TREE-P", 1, 0, false);
	declareFunction("vbd_tree_get_tense_method", "VBD-TREE-GET-TENSE-METHOD", 1, 0, false);
	declareFunction("subloop_reserved_initialize_vbp_tree_class", "SUBLOOP-RESERVED-INITIALIZE-VBP-TREE-CLASS", 1, 0, false);
	declareFunction("subloop_reserved_initialize_vbp_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-VBP-TREE-INSTANCE", 1, 0, false);
	declareFunction("vbp_tree_p", "VBP-TREE-P", 1, 0, false);
	declareFunction("vbp_tree_get_tense_method", "VBP-TREE-GET-TENSE-METHOD", 1, 0, false);
	declareFunction("subloop_reserved_initialize_vb_tree_class", "SUBLOOP-RESERVED-INITIALIZE-VB-TREE-CLASS", 1, 0, false);
	declareFunction("subloop_reserved_initialize_vb_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-VB-TREE-INSTANCE", 1, 0, false);
	declareFunction("vb_tree_p", "VB-TREE-P", 1, 0, false);
	declareFunction("vb_tree_get_tense_method", "VB-TREE-GET-TENSE-METHOD", 1, 0, false);
	declareFunction("subloop_reserved_initialize_vbg_tree_class", "SUBLOOP-RESERVED-INITIALIZE-VBG-TREE-CLASS", 1, 0, false);
	declareFunction("subloop_reserved_initialize_vbg_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-VBG-TREE-INSTANCE", 1, 0, false);
	declareFunction("vbg_tree_p", "VBG-TREE-P", 1, 0, false);
	declareFunction("vbg_tree_get_aux_verb_method", "VBG-TREE-GET-AUX-VERB-METHOD", 1, 0, false);
	declareFunction("vbg_tree_get_modifieds_method", "VBG-TREE-GET-MODIFIEDS-METHOD", 1, 0, false);
	declareFunction("aux_verb_tree_copula_p_method", "AUX-VERB-TREE-COPULA-P-METHOD", 1, 0, false);
	declareFunction("aux_verb_tree_get_keyword_renamings_method", "AUX-VERB-TREE-GET-KEYWORD-RENAMINGS-METHOD", 1, 1, false);
	declareFunction("aux_verb_tree_get_semantic_complements_method", "AUX-VERB-TREE-GET-SEMANTIC-COMPLEMENTS-METHOD", 1, 0, false);
	declareFunction("aux_verb_tree_get_complements_method", "AUX-VERB-TREE-GET-COMPLEMENTS-METHOD", 1, 0, false);
	declareFunction("aux_verb_tree_get_semantic_heads_method", "AUX-VERB-TREE-GET-SEMANTIC-HEADS-METHOD", 1, 0, false);
	declareFunction("aux_verb_tree_get_tense_method", "AUX-VERB-TREE-GET-TENSE-METHOD", 1, 0, false);
	declareFunction("subloop_reserved_initialize_aux_verb_tree_class", "SUBLOOP-RESERVED-INITIALIZE-AUX-VERB-TREE-CLASS", 1, 0, false);
	declareFunction("subloop_reserved_initialize_aux_verb_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-AUX-VERB-TREE-INSTANCE", 1, 0, false);
	declareFunction("aux_verb_tree_p", "AUX-VERB-TREE-P", 1, 0, false);
	declareFunction("aux_verb_tree_get_prepositional_complement_method", "AUX-VERB-TREE-GET-PREPOSITIONAL-COMPLEMENT-METHOD", 1, 0, false);
	declareFunction("aux_verb_tree_get_adverbial_complement_method", "AUX-VERB-TREE-GET-ADVERBIAL-COMPLEMENT-METHOD", 1, 0, false);
	declareFunction("aux_verb_tree_get_subject_method", "AUX-VERB-TREE-GET-SUBJECT-METHOD", 1, 0, false);
	declareFunction("aux_verb_tree_get_direct_object_method", "AUX-VERB-TREE-GET-DIRECT-OBJECT-METHOD", 1, 0, false);
	declareFunction("aux_verb_tree_get_indirect_object_method", "AUX-VERB-TREE-GET-INDIRECT-OBJECT-METHOD", 1, 0, false);
	declareFunction("aux_verb_tree_get_semantic_subject_method", "AUX-VERB-TREE-GET-SEMANTIC-SUBJECT-METHOD", 1, 0, false);
	declareFunction("aux_verb_tree_inverted_p_method", "AUX-VERB-TREE-INVERTED-P-METHOD", 1, 0, false);
	declareFunction("aux_verb_tree_passive_p_method", "AUX-VERB-TREE-PASSIVE-P-METHOD", 1, 0, false);
	declareFunction("subloop_reserved_initialize_modal_verb_tree_class", "SUBLOOP-RESERVED-INITIALIZE-MODAL-VERB-TREE-CLASS", 1, 0, false);
	declareFunction("subloop_reserved_initialize_modal_verb_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-MODAL-VERB-TREE-INSTANCE", 1, 0, false);
	declareFunction("modal_verb_tree_p", "MODAL-VERB-TREE-P", 1, 0, false);
	declareFunction("modal_verb_tree_get_tense_method", "MODAL-VERB-TREE-GET-TENSE-METHOD", 1, 0, false);
	declareFunction("modal_verb_tree_get_objects_method", "MODAL-VERB-TREE-GET-OBJECTS-METHOD", 1, 0, false);
	declareFunction("adjectival_word_tree_get_keyword_renamings_method", "ADJECTIVAL-WORD-TREE-GET-KEYWORD-RENAMINGS-METHOD", 1, 1, false);
	declareFunction("adjectival_word_tree_get_complements_method", "ADJECTIVAL-WORD-TREE-GET-COMPLEMENTS-METHOD", 1, 0, false);
	declareFunction("subloop_reserved_initialize_adjectival_word_tree_class", "SUBLOOP-RESERVED-INITIALIZE-ADJECTIVAL-WORD-TREE-CLASS", 1, 0, false);
	declareFunction("subloop_reserved_initialize_adjectival_word_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-ADJECTIVAL-WORD-TREE-INSTANCE", 1, 0, false);
	declareFunction("adjectival_word_tree_p", "ADJECTIVAL-WORD-TREE-P", 1, 0, false);
	declareFunction("adjectival_word_tree_get_modifieds_method", "ADJECTIVAL-WORD-TREE-GET-MODIFIEDS-METHOD", 1, 0, false);
	declareFunction("adjectival_word_tree_get_verbal_complement_method", "ADJECTIVAL-WORD-TREE-GET-VERBAL-COMPLEMENT-METHOD", 1, 0, false);
	declareFunction("adverbial_word_tree_get_keyword_renamings_method", "ADVERBIAL-WORD-TREE-GET-KEYWORD-RENAMINGS-METHOD", 1, 1, false);
	declareFunction("subloop_reserved_initialize_adverbial_word_tree_class", "SUBLOOP-RESERVED-INITIALIZE-ADVERBIAL-WORD-TREE-CLASS", 1, 0, false);
	declareFunction("subloop_reserved_initialize_adverbial_word_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-ADVERBIAL-WORD-TREE-INSTANCE", 1, 0, false);
	declareFunction("adverbial_word_tree_p", "ADVERBIAL-WORD-TREE-P", 1, 0, false);
	declareFunction("adverbial_word_tree_get_modifieds_method", "ADVERBIAL-WORD-TREE-GET-MODIFIEDS-METHOD", 1, 0, false);
	declareFunction("subloop_reserved_initialize_wrb_word_tree_class", "SUBLOOP-RESERVED-INITIALIZE-WRB-WORD-TREE-CLASS", 1, 0, false);
	declareFunction("subloop_reserved_initialize_wrb_word_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-WRB-WORD-TREE-INSTANCE", 1, 0, false);
	declareFunction("wrb_word_tree_p", "WRB-WORD-TREE-P", 1, 0, false);
	declareFunction("prepositional_or_particle_word_tree_get_keyword_renamings_method", "PREPOSITIONAL-OR-PARTICLE-WORD-TREE-GET-KEYWORD-RENAMINGS-METHOD", 1, 1, false);
	declareFunction("subloop_reserved_initialize_prepositional_or_particle_word_tree_class", "SUBLOOP-RESERVED-INITIALIZE-PREPOSITIONAL-OR-PARTICLE-WORD-TREE-CLASS", 1, 0, false);
	declareFunction("subloop_reserved_initialize_prepositional_or_particle_word_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-PREPOSITIONAL-OR-PARTICLE-WORD-TREE-INSTANCE", 1, 0, false);
	declareFunction("prepositional_or_particle_word_tree_p", "PREPOSITIONAL-OR-PARTICLE-WORD-TREE-P", 1, 0, false);
	declareFunction("prepositional_or_particle_word_tree_get_oblique_object_method", "PREPOSITIONAL-OR-PARTICLE-WORD-TREE-GET-OBLIQUE-OBJECT-METHOD", 1, 0, false);
	declareFunction("prepositional_or_particle_word_tree_get_verbal_complement_method", "PREPOSITIONAL-OR-PARTICLE-WORD-TREE-GET-VERBAL-COMPLEMENT-METHOD", 1, 0, false);
	declareFunction("prepositional_or_particle_word_tree_get_complements_method", "PREPOSITIONAL-OR-PARTICLE-WORD-TREE-GET-COMPLEMENTS-METHOD", 1, 0, false);
	declareFunction("prepositional_or_particle_word_tree_get_modifieds_method", "PREPOSITIONAL-OR-PARTICLE-WORD-TREE-GET-MODIFIEDS-METHOD", 1, 0, false);
	declareFunction("prepositional_or_particle_word_tree_get_refs_method", "PREPOSITIONAL-OR-PARTICLE-WORD-TREE-GET-REFS-METHOD", 1, 0, false);
	declareFunction("prepositional_or_particle_word_tree_get_antecedent_method", "PREPOSITIONAL-OR-PARTICLE-WORD-TREE-GET-ANTECEDENT-METHOD", 1, 0, false);
	declareFunction("subloop_reserved_initialize_prepositional_word_tree_class", "SUBLOOP-RESERVED-INITIALIZE-PREPOSITIONAL-WORD-TREE-CLASS", 1, 0, false);
	declareFunction("subloop_reserved_initialize_prepositional_word_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-PREPOSITIONAL-WORD-TREE-INSTANCE", 1, 0, false);
	declareFunction("prepositional_word_tree_p", "PREPOSITIONAL-WORD-TREE-P", 1, 0, false);
	declareFunction("subloop_reserved_initialize_particle_word_tree_class", "SUBLOOP-RESERVED-INITIALIZE-PARTICLE-WORD-TREE-CLASS", 1, 0, false);
	declareFunction("subloop_reserved_initialize_particle_word_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-PARTICLE-WORD-TREE-INSTANCE", 1, 0, false);
	declareFunction("particle_word_tree_p", "PARTICLE-WORD-TREE-P", 1, 0, false);
	declareFunction("subloop_reserved_initialize_specifier_word_tree_class", "SUBLOOP-RESERVED-INITIALIZE-SPECIFIER-WORD-TREE-CLASS", 1, 0, false);
	declareFunction("subloop_reserved_initialize_specifier_word_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-SPECIFIER-WORD-TREE-INSTANCE", 1, 0, false);
	declareFunction("specifier_word_tree_p", "SPECIFIER-WORD-TREE-P", 1, 0, false);
	declareFunction("specifier_word_tree_get_specified_method", "SPECIFIER-WORD-TREE-GET-SPECIFIED-METHOD", 1, 0, false);
	declareFunction("quantifier_word_tree_get_keyword_renamings_method", "QUANTIFIER-WORD-TREE-GET-KEYWORD-RENAMINGS-METHOD", 1, 1, false);
	declareFunction("subloop_reserved_initialize_quantifier_word_tree_class", "SUBLOOP-RESERVED-INITIALIZE-QUANTIFIER-WORD-TREE-CLASS", 1, 0, false);
	declareFunction("subloop_reserved_initialize_quantifier_word_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-QUANTIFIER-WORD-TREE-INSTANCE", 1, 0, false);
	declareFunction("quantifier_word_tree_p", "QUANTIFIER-WORD-TREE-P", 1, 0, false);
	declareFunction("quantifier_word_tree_get_quantified_method", "QUANTIFIER-WORD-TREE-GET-QUANTIFIED-METHOD", 1, 0, false);
	declareFunction("quantifier_word_tree_get_specified_method", "QUANTIFIER-WORD-TREE-GET-SPECIFIED-METHOD", 1, 0, false);
	declareFunction("subloop_reserved_initialize_determiner_word_tree_class", "SUBLOOP-RESERVED-INITIALIZE-DETERMINER-WORD-TREE-CLASS", 1, 0, false);
	declareFunction("subloop_reserved_initialize_determiner_word_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-DETERMINER-WORD-TREE-INSTANCE", 1, 0, false);
	declareFunction("determiner_word_tree_p", "DETERMINER-WORD-TREE-P", 1, 0, false);
	declareFunction("subloop_reserved_initialize_prpX_tree_class", "SUBLOOP-RESERVED-INITIALIZE-PRP$-TREE-CLASS", 1, 0, false);
	declareFunction("subloop_reserved_initialize_prpX_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-PRP$-TREE-INSTANCE", 1, 0, false);
	declareFunction("prpX_tree_p", "PRP$-TREE-P", 1, 0, false);
	declareFunction("prpX_tree_get_number_method", "PRP$-TREE-GET-NUMBER-METHOD", 1, 0, false);
	declareFunction("prpX_tree_get_person_method", "PRP$-TREE-GET-PERSON-METHOD", 1, 0, false);
	declareFunction("prpX_tree_get_gender_method", "PRP$-TREE-GET-GENDER-METHOD", 1, 0, false);
	declareFunction("subloop_reserved_initialize_wdt_word_tree_class", "SUBLOOP-RESERVED-INITIALIZE-WDT-WORD-TREE-CLASS", 1, 0, false);
	declareFunction("subloop_reserved_initialize_wdt_word_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-WDT-WORD-TREE-INSTANCE", 1, 0, false);
	declareFunction("wdt_word_tree_p", "WDT-WORD-TREE-P", 1, 0, false);
	declareFunction("wdt_word_tree_get_refs_method", "WDT-WORD-TREE-GET-REFS-METHOD", 1, 0, false);
	declareFunction("wdt_word_tree_get_antecedent_method", "WDT-WORD-TREE-GET-ANTECEDENT-METHOD", 1, 0, false);
	declareFunction("possessive_word_tree_get_keyword_renamings_method", "POSSESSIVE-WORD-TREE-GET-KEYWORD-RENAMINGS-METHOD", 1, 1, false);
	declareFunction("subloop_reserved_initialize_possessive_word_tree_class", "SUBLOOP-RESERVED-INITIALIZE-POSSESSIVE-WORD-TREE-CLASS", 1, 0, false);
	declareFunction("subloop_reserved_initialize_possessive_word_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-POSSESSIVE-WORD-TREE-INSTANCE", 1, 0, false);
	declareFunction("possessive_word_tree_p", "POSSESSIVE-WORD-TREE-P", 1, 0, false);
	declareFunction("possessive_word_tree_get_possessor_method", "POSSESSIVE-WORD-TREE-GET-POSSESSOR-METHOD", 1, 0, false);
	declareFunction("possessive_word_tree_get_possessed_method", "POSSESSIVE-WORD-TREE-GET-POSSESSED-METHOD", 1, 0, false);
	declareFunction("possessive_word_tree_get_complements_method", "POSSESSIVE-WORD-TREE-GET-COMPLEMENTS-METHOD", 1, 0, false);
	declareFunction("possessive_word_tree_get_modifieds_method", "POSSESSIVE-WORD-TREE-GET-MODIFIEDS-METHOD", 1, 0, false);
	declareFunction("subloop_reserved_initialize_cardinal_word_tree_class", "SUBLOOP-RESERVED-INITIALIZE-CARDINAL-WORD-TREE-CLASS", 1, 0, false);
	declareFunction("subloop_reserved_initialize_cardinal_word_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-CARDINAL-WORD-TREE-INSTANCE", 1, 0, false);
	declareFunction("cardinal_word_tree_p", "CARDINAL-WORD-TREE-P", 1, 0, false);
	declareFunction("subloop_reserved_initialize_existential_word_tree_class", "SUBLOOP-RESERVED-INITIALIZE-EXISTENTIAL-WORD-TREE-CLASS", 1, 0, false);
	declareFunction("subloop_reserved_initialize_existential_word_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-EXISTENTIAL-WORD-TREE-INSTANCE", 1, 0, false);
	declareFunction("existential_word_tree_p", "EXISTENTIAL-WORD-TREE-P", 1, 0, false);
	declareFunction("subloop_reserved_initialize_punctuation_word_tree_class", "SUBLOOP-RESERVED-INITIALIZE-PUNCTUATION-WORD-TREE-CLASS", 1, 0, false);
	declareFunction("subloop_reserved_initialize_punctuation_word_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-PUNCTUATION-WORD-TREE-INSTANCE", 1, 0, false);
	declareFunction("punctuation_word_tree_p", "PUNCTUATION-WORD-TREE-P", 1, 0, false);
	declareFunction("temporal_tree_p", "TEMPORAL-TREE-P", 1, 0, false);
	declareFunction("word_for_category", "WORD-FOR-CATEGORY", 1, 0, false);
	declareFunction("parse_expression_to_word_tree", "PARSE-EXPRESSION-TO-WORD-TREE", 1, 3, false);
	declareFunction("get_multi_noun_tree_daughters", "GET-MULTI-NOUN-TREE-DAUGHTERS", 1, 0, false);
	declareFunction("set_multi_noun_tree_daughters", "SET-MULTI-NOUN-TREE-DAUGHTERS", 2, 0, false);
	declareFunction("subloop_reserved_initialize_multi_noun_tree_class", "SUBLOOP-RESERVED-INITIALIZE-MULTI-NOUN-TREE-CLASS", 1, 0, false);
	declareFunction("subloop_reserved_initialize_multi_noun_tree_instance", "SUBLOOP-RESERVED-INITIALIZE-MULTI-NOUN-TREE-INSTANCE", 1, 0, false);
	declareFunction("multi_noun_tree_p", "MULTI-NOUN-TREE-P", 1, 0, false);
	declareFunction("new_multi_noun_tree", "NEW-MULTI-NOUN-TREE", 1, 0, false);
	declareFunction("parse_expression_category", "PARSE-EXPRESSION-CATEGORY", 1, 0, false);
	declareFunction("phrase_expression_daughters", "PHRASE-EXPRESSION-DAUGHTERS", 1, 0, false);
	declareFunction("phrase_expression_p", "PHRASE-EXPRESSION-P", 1, 0, false);
	declareFunction("word_expression_p", "WORD-EXPRESSION-P", 1, 0, false);
	declareFunction("word_expression_string", "WORD-EXPRESSION-STRING", 1, 0, false);
	declareFunction("charniak_expression_p", "CHARNIAK-EXPRESSION-P", 1, 0, false);
	declareFunction("charniak_expression_parse_expression", "CHARNIAK-EXPRESSION-PARSE-EXPRESSION", 1, 0, false);
	declareFunction("parse_tree_covers_method", "PARSE-TREE-COVERS-METHOD", 2, 0, false);
	declareFunction("parse_tree_covers_minimally_method", "PARSE-TREE-COVERS-MINIMALLY-METHOD", 2, 0, false);
	declareFunction("parse_tree_get_minimally_covering_subtrees_method", "PARSE-TREE-GET-MINIMALLY-COVERING-SUBTREES-METHOD", 2, 0, false);
	return NIL;
    }

    public static SubLObject determiner_word_tree_p(final SubLObject determiner_word_tree) {
	return classes.subloop_instanceof_class(determiner_word_tree, DETERMINER_WORD_TREE);
    }

    public static final SubLObject determiner_word_tree_p_alt(SubLObject determiner_word_tree) {
	return classes.subloop_instanceof_class(determiner_word_tree, DETERMINER_WORD_TREE);
    }

    /**
     *
     *
     * @return word-tree-p; the visible quantifier of this noun of nil if there is none
     */
    @LispMethod(comment = "@return word-tree-p; the visible quantifier of this noun of nil if there is none")
    public static SubLObject dollar_word_tree_get_overt_quantifier_method(final SubLObject self) {
	final SubLObject quant = methods.funcall_instance_method_with_1_args(self, GET_SISTER, ONE_INTEGER);
	if (NIL != cardinal_word_tree_p(quant)) {
	    return quant;
	}
	return NIL;
    }

    /**
     *
     *
     * @return word-tree-p; the visible quantifier of this noun of nil if there is none
     */
    @LispMethod(comment = "@return word-tree-p; the visible quantifier of this noun of nil if there is none")
    public static final SubLObject dollar_word_tree_get_overt_quantifier_method_alt(SubLObject self) {
	{
	    SubLObject quant = methods.funcall_instance_method_with_1_args(self, GET_SISTER, ONE_INTEGER);
	    if (NIL != com.cyc.cycjava.cycl.word_tree.cardinal_word_tree_p(quant)) {
		return quant;
	    }
	}
	return NIL;
    }

    public static SubLObject dollar_word_tree_p(final SubLObject dollar_word_tree) {
	return classes.subloop_instanceof_class(dollar_word_tree, DOLLAR_WORD_TREE);
    }

    public static final SubLObject dollar_word_tree_p_alt(SubLObject dollar_word_tree) {
	return classes.subloop_instanceof_class(dollar_word_tree, DOLLAR_WORD_TREE);
    }

    public static SubLObject existential_word_tree_p(final SubLObject existential_word_tree) {
	return classes.subloop_instanceof_class(existential_word_tree, EXISTENTIAL_WORD_TREE);
    }

    public static final SubLObject existential_word_tree_p_alt(SubLObject existential_word_tree) {
	return classes.subloop_instanceof_class(existential_word_tree, EXISTENTIAL_WORD_TREE);
    }

    public static SubLObject function_word_tree_p(final SubLObject function_word_tree) {
	return classes.subloop_instanceof_class(function_word_tree, FUNCTION_WORD_TREE);
    }

    public static final SubLObject function_word_tree_p_alt(SubLObject function_word_tree) {
	return classes.subloop_instanceof_class(function_word_tree, FUNCTION_WORD_TREE);
    }

    public static SubLObject get_multi_noun_tree_daughters(final SubLObject multi_noun_tree) {
	return classes.subloop_get_access_protected_instance_slot(multi_noun_tree, TEN_INTEGER, DAUGHTERS);
    }

    public static final SubLObject get_multi_noun_tree_daughters_alt(SubLObject multi_noun_tree) {
	return classes.subloop_get_access_protected_instance_slot(multi_noun_tree, TEN_INTEGER, DAUGHTERS);
    }

    public static SubLObject get_null_determiner(final SubLObject quantifier, final SubLObject connective, final SubLObject v_word_tree, SubLObject v_context) {
	if (v_context == UNPROVIDED) {
	    v_context = NIL;
	}
	final SubLObject lex = object.new_class_instance(LEX_ENTRY);
	SubLObject word = NIL;
	methods.funcall_instance_method_with_2_args(lex, SET, $STRING, $str263$);
	methods.funcall_instance_method_with_2_args(lex, SET, $CYC_POS, $$Determiner);
	methods.funcall_instance_method_with_2_args(lex, SET, $SEMTRANS, list(quantifier, $NOUN, bq_cons(connective, $list266)));
	methods.funcall_instance_method_with_2_args(lex, SET, $FRAME, $$DeterminerFrame);
	word = new_word_tree($str263$, $DT, methods.funcall_instance_method_with_0_args(v_word_tree, GET_MOTHER), ZERO_INTEGER, cyclifier.new_even_lex_entry_distribution(list(lex)), v_context);
	set_word_tree_abs_idx(word, methods.funcall_instance_method_with_0_args(v_word_tree, GET_ABS_INDEX));
	return word;
    }

    public static final SubLObject get_null_determiner_alt(SubLObject quantifier, SubLObject connective, SubLObject v_word_tree, SubLObject v_context) {
	if (v_context == UNPROVIDED) {
	    v_context = NIL;
	}
	{
	    SubLObject lex = object.new_class_instance(LEX_ENTRY);
	    SubLObject word = NIL;
	    methods.funcall_instance_method_with_2_args(lex, SET, $STRING, $str_alt263$);
	    methods.funcall_instance_method_with_2_args(lex, SET, $CYC_POS, $$Determiner);
	    methods.funcall_instance_method_with_2_args(lex, SET, $SEMTRANS, list(quantifier, $NOUN, bq_cons(connective, $list_alt266)));
	    methods.funcall_instance_method_with_2_args(lex, SET, $FRAME, $$DeterminerFrame);
	    word = com.cyc.cycjava.cycl.word_tree.new_word_tree($str_alt263$, $DT, methods.funcall_instance_method_with_0_args(v_word_tree, GET_MOTHER), ZERO_INTEGER, cyclifier.new_even_lex_entry_distribution(list(lex)), v_context);
	    com.cyc.cycjava.cycl.word_tree.set_word_tree_abs_idx(word, methods.funcall_instance_method_with_0_args(v_word_tree, GET_ABS_INDEX));
	    return word;
	}
    }

    // Definitions
    public static SubLObject get_word_tree_abs_idx(final SubLObject v_word_tree) {
	return classes.subloop_get_access_protected_instance_slot(v_word_tree, NINE_INTEGER, ABS_IDX);
    }

    // Definitions
    public static final SubLObject get_word_tree_abs_idx_alt(SubLObject v_word_tree) {
	return classes.subloop_get_access_protected_instance_slot(v_word_tree, NINE_INTEGER, ABS_IDX);
    }

    public static SubLObject get_word_tree_lexes(final SubLObject v_word_tree) {
	return classes.subloop_get_access_protected_instance_slot(v_word_tree, SEVEN_INTEGER, LEXES);
    }

    public static final SubLObject get_word_tree_lexes_alt(SubLObject v_word_tree) {
	return classes.subloop_get_access_protected_instance_slot(v_word_tree, SEVEN_INTEGER, LEXES);
    }

    public static SubLObject get_word_tree_refs(final SubLObject v_word_tree) {
	return classes.subloop_get_access_protected_instance_slot(v_word_tree, EIGHT_INTEGER, REFS);
    }

    public static final SubLObject get_word_tree_refs_alt(SubLObject v_word_tree) {
	return classes.subloop_get_access_protected_instance_slot(v_word_tree, EIGHT_INTEGER, REFS);
    }

    public static SubLObject init_word_tree_file() {
	defconstant("*SINGULAR-PERSONAL-PRONOUNS*", $list342);
	defconstant("*PLURAL-PERSONAL-PRONOUNS*", $list343);
	deflexical("*TO-BE-FORMS*", $list541);
	defconstant("*SINGULAR-POSSESSIVE-PRONOUNS*", $list722);
	defconstant("*PLURAL-POSSESSIVE-PRONOUNS*", $list723);
	defparameter("*CATEGORY-TO-WORD*", $list777);
	return NIL;
    }

    /**
     *
     *
     * @return listp; the list of objects of this modal
     */
    @LispMethod(comment = "@return listp; the list of objects of this modal")
    public static SubLObject modal_verb_tree_get_objects_method(final SubLObject self) {
	return NIL;
    }

    /**
     *
     *
     * @return listp; the list of objects of this modal
     */
    @LispMethod(comment = "@return listp; the list of objects of this modal")
    public static final SubLObject modal_verb_tree_get_objects_method_alt(SubLObject self) {
	return NIL;
    }

    /**
     *
     *
     * @return keywordp; the tense of this modal; either :PRESENT, :PAST, :FUTURE,
    or :INFINITIVE
     * @unknown 'could' can be :PRESENT or :PAST; maybe return a disjunctive list of tenses?
     */
    @LispMethod(comment = "@return keywordp; the tense of this modal; either :PRESENT, :PAST, :FUTURE,\r\nor :INFINITIVE\r\n@unknown \'could\' can be :PRESENT or :PAST; maybe return a disjunctive list of tenses?")
    public static SubLObject modal_verb_tree_get_tense_method(final SubLObject self) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject catch_var_for_modal_verb_tree_method = NIL;
	final SubLObject string = parse_tree.get_parse_tree_string(self);
	try {
	    thread.throwStack.push($sym618$OUTER_CATCH_FOR_MODAL_VERB_TREE_METHOD);
	    try {
		sublisp_throw($sym618$OUTER_CATCH_FOR_MODAL_VERB_TREE_METHOD, string.equalp($$$will) ? $FUTURE : $PRESENT);
	    } finally {
		final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    parse_tree.set_parse_tree_string(self, string);
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
		}
	    }
	} catch (final Throwable ccatch_env_var) {
	    catch_var_for_modal_verb_tree_method = Errors.handleThrowable(ccatch_env_var, $sym618$OUTER_CATCH_FOR_MODAL_VERB_TREE_METHOD);
	} finally {
	    thread.throwStack.pop();
	}
	return catch_var_for_modal_verb_tree_method;
    }

    /**
     *
     *
     * @return keywordp; the tense of this modal; either :PRESENT, :PAST, :FUTURE,
    or :INFINITIVE
     * @unknown 'could' can be :PRESENT or :PAST; maybe return a disjunctive list of tenses?
     */
    @LispMethod(comment = "@return keywordp; the tense of this modal; either :PRESENT, :PAST, :FUTURE,\r\nor :INFINITIVE\r\n@unknown \'could\' can be :PRESENT or :PAST; maybe return a disjunctive list of tenses?")
    public static final SubLObject modal_verb_tree_get_tense_method_alt(SubLObject self) {
	{
	    SubLObject catch_var_for_modal_verb_tree_method = NIL;
	    SubLObject string = parse_tree.get_parse_tree_string(self);
	    try {
		try {
		    sublisp_throw($sym618$OUTER_CATCH_FOR_MODAL_VERB_TREE_METHOD, string.equalp($$$will) ? ((SubLObject) ($FUTURE)) : $PRESENT);
		} finally {
		    {
			SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
			try {
			    bind($is_thread_performing_cleanupP$, T);
			    parse_tree.set_parse_tree_string(self, string);
			} finally {
			    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
			}
		    }
		}
	    } catch (Throwable ccatch_env_var) {
		catch_var_for_modal_verb_tree_method = Errors.handleThrowable(ccatch_env_var, $sym618$OUTER_CATCH_FOR_MODAL_VERB_TREE_METHOD);
	    }
	    return catch_var_for_modal_verb_tree_method;
	}
    }

    public static SubLObject modal_verb_tree_p(final SubLObject modal_verb_tree) {
	return classes.subloop_instanceof_class(modal_verb_tree, MODAL_VERB_TREE);
    }

    public static final SubLObject modal_verb_tree_p_alt(SubLObject modal_verb_tree) {
	return classes.subloop_instanceof_class(modal_verb_tree, MODAL_VERB_TREE);
    }

    public static SubLObject modifier_word_tree_p(final SubLObject modifier_word_tree) {
	return classes.subloop_instanceof_class(modifier_word_tree, MODIFIER_WORD_TREE);
    }

    public static final SubLObject modifier_word_tree_p_alt(SubLObject modifier_word_tree) {
	return classes.subloop_instanceof_class(modifier_word_tree, MODIFIER_WORD_TREE);
    }

    public static SubLObject multi_noun_tree_p(final SubLObject multi_noun_tree) {
	return classes.subloop_instanceof_class(multi_noun_tree, MULTI_NOUN_TREE);
    }

    public static final SubLObject multi_noun_tree_p_alt(SubLObject multi_noun_tree) {
	return classes.subloop_instanceof_class(multi_noun_tree, MULTI_NOUN_TREE);
    }

    public static SubLObject name_word_tree_get_quantifier_method(final SubLObject self) {
	final SubLObject quantifier = methods.funcall_instance_method_with_0_args(self, GET_OVERT_QUANTIFIER);
	return (NIL == quantifier) && (NIL != methods.funcall_instance_method_with_0_args(self, PLURAL_P)) ? methods.funcall_instance_method_with_0_args(self, GET_EXISTENTIAL_NULL_DETERMINER) : quantifier;
    }

    public static final SubLObject name_word_tree_get_quantifier_method_alt(SubLObject self) {
	{
	    SubLObject quantifier = methods.funcall_instance_method_with_0_args(self, GET_OVERT_QUANTIFIER);
	    return (NIL == quantifier) && (NIL != methods.funcall_instance_method_with_0_args(self, PLURAL_P)) ? ((SubLObject) (methods.funcall_instance_method_with_0_args(self, GET_EXISTENTIAL_NULL_DETERMINER))) : quantifier;
	}
    }

    public static SubLObject name_word_tree_p(final SubLObject name_word_tree) {
	return classes.subloop_instanceof_class(name_word_tree, NAME_WORD_TREE);
    }

    public static final SubLObject name_word_tree_p_alt(SubLObject name_word_tree) {
	return classes.subloop_instanceof_class(name_word_tree, NAME_WORD_TREE);
    }

    /**
     *
     *
     * @param WORDS
     * 		listp; a list of word-tree-p
     * @return multi-noun-tree-p; a single word tree from WORDS
     */
    @LispMethod(comment = "@param WORDS\r\n\t\tlistp; a list of word-tree-p\r\n@return multi-noun-tree-p; a single word tree from WORDS")
    public static SubLObject new_multi_noun_tree(final SubLObject words) {
	final SubLObject self = object.new_class_instance(MULTI_NOUN_TREE);
	SubLObject strings = NIL;
	parse_tree.set_parse_tree_category(self, methods.funcall_instance_method_with_0_args(words.first(), GET_CATEGORY));
	parse_tree.set_parse_tree_mother(self, methods.funcall_instance_method_with_0_args(words.first(), GET_MOTHER));
	set_word_tree_refs(self, methods.funcall_instance_method_with_0_args(words.first(), GET_REFS));
	SubLObject cdolist_list_var = words;
	SubLObject word = NIL;
	word = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    strings = cons(methods.funcall_instance_method_with_0_args(word, GET_STRING), strings);
	    cdolist_list_var = cdolist_list_var.rest();
	    word = cdolist_list_var.first();
	}
	parse_tree.set_parse_tree_string(self, string_utilities.bunge(nreverse(strings), UNPROVIDED));
	set_multi_noun_tree_daughters(self, apply(VECTOR, words));
	return self;
    }

    /**
     *
     *
     * @param WORDS
     * 		listp; a list of word-tree-p
     * @return multi-noun-tree-p; a single word tree from WORDS
     */
    @LispMethod(comment = "@param WORDS\r\n\t\tlistp; a list of word-tree-p\r\n@return multi-noun-tree-p; a single word tree from WORDS")
    public static final SubLObject new_multi_noun_tree_alt(SubLObject words) {
	{
	    SubLObject self = object.new_class_instance(MULTI_NOUN_TREE);
	    SubLObject strings = NIL;
	    parse_tree.set_parse_tree_category(self, methods.funcall_instance_method_with_0_args(words.first(), GET_CATEGORY));
	    parse_tree.set_parse_tree_mother(self, methods.funcall_instance_method_with_0_args(words.first(), GET_MOTHER));
	    com.cyc.cycjava.cycl.word_tree.set_word_tree_refs(self, methods.funcall_instance_method_with_0_args(words.first(), GET_REFS));
	    {
		SubLObject cdolist_list_var = words;
		SubLObject word = NIL;
		for (word = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), word = cdolist_list_var.first()) {
		    strings = cons(methods.funcall_instance_method_with_0_args(word, GET_STRING), strings);
		}
	    }
	    parse_tree.set_parse_tree_string(self, string_utilities.bunge(nreverse(strings), UNPROVIDED));
	    com.cyc.cycjava.cycl.word_tree.set_multi_noun_tree_daughters(self, apply(VECTOR, words));
	    return self;
	}
    }

    /**
     *
     *
     * @return word-tree-p; a new word tree from the specified parameters
     */
    @LispMethod(comment = "@return word-tree-p; a new word tree from the specified parameters")
    public static SubLObject new_word_tree(final SubLObject string, final SubLObject category, final SubLObject mother, final SubLObject idx, SubLObject lexes, SubLObject v_context) {
	if (lexes == UNPROVIDED) {
	    lexes = NIL;
	}
	if (v_context == UNPROVIDED) {
	    v_context = object.new_class_instance(PARSE_TREE_CONTEXT);
	}
	final SubLObject self = object.new_class_instance(word_for_category(category));
	parse_tree.set_parse_tree_string(self, string);
	parse_tree.set_parse_tree_category(self, category);
	parse_tree.set_parse_tree_mother(self, mother);
	parse_tree.set_parse_tree_idx(self, idx);
	set_word_tree_lexes(self, lexes);
	parse_tree.set_parse_tree_context(self, v_context);
	set_word_tree_refs(self, list(methods.funcall_instance_method_with_1_args(v_context, NEW_VARIABLE, string)));
	return self;
    }

    /**
     *
     *
     * @return word-tree-p; a new word tree from the specified parameters
     */
    @LispMethod(comment = "@return word-tree-p; a new word tree from the specified parameters")
    public static final SubLObject new_word_tree_alt(SubLObject string, SubLObject category, SubLObject mother, SubLObject idx, SubLObject lexes, SubLObject v_context) {
	if (lexes == UNPROVIDED) {
	    lexes = NIL;
	}
	if (v_context == UNPROVIDED) {
	    v_context = object.new_class_instance(PARSE_TREE_CONTEXT);
	}
	{
	    SubLObject self = object.new_class_instance(com.cyc.cycjava.cycl.word_tree.word_for_category(category));
	    parse_tree.set_parse_tree_string(self, string);
	    parse_tree.set_parse_tree_category(self, category);
	    parse_tree.set_parse_tree_mother(self, mother);
	    parse_tree.set_parse_tree_idx(self, idx);
	    com.cyc.cycjava.cycl.word_tree.set_word_tree_lexes(self, lexes);
	    parse_tree.set_parse_tree_context(self, v_context);
	    com.cyc.cycjava.cycl.word_tree.set_word_tree_refs(self, list(methods.funcall_instance_method_with_1_args(v_context, NEW_VARIABLE, string)));
	    return self;
	}
    }

    /**
     *
     *
     * @return listp; the list of all numbers of this noun
     */
    @LispMethod(comment = "@return listp; the list of all numbers of this noun")
    public static SubLObject nn_tree_get_number_method(final SubLObject self) {
	return $list308;
    }

    /**
     *
     *
     * @return listp; the list of all numbers of this noun
     */
    @LispMethod(comment = "@return listp; the list of all numbers of this noun")
    public static final SubLObject nn_tree_get_number_method_alt(SubLObject self) {
	return $list_alt308;
    }

    public static SubLObject nn_tree_p(final SubLObject nn_tree) {
	return classes.subloop_instanceof_class(nn_tree, NN_TREE);
    }

    public static final SubLObject nn_tree_p_alt(SubLObject nn_tree) {
	return classes.subloop_instanceof_class(nn_tree, NN_TREE);
    }

    /**
     *
     *
     * @return listp; the list of all numbers of this noun
     */
    @LispMethod(comment = "@return listp; the list of all numbers of this noun")
    public static SubLObject nnp_tree_get_number_method(final SubLObject self) {
	return $list308;
    }

    /**
     *
     *
     * @return listp; the list of all numbers of this noun
     */
    @LispMethod(comment = "@return listp; the list of all numbers of this noun")
    public static final SubLObject nnp_tree_get_number_method_alt(SubLObject self) {
	return $list_alt308;
    }

    public static SubLObject nnp_tree_p(final SubLObject nnp_tree) {
	return classes.subloop_instanceof_class(nnp_tree, NNP_TREE);
    }

    public static final SubLObject nnp_tree_p_alt(SubLObject nnp_tree) {
	return classes.subloop_instanceof_class(nnp_tree, NNP_TREE);
    }

    /**
     *
     *
     * @return listp; the list of all numbers of this noun
     */
    @LispMethod(comment = "@return listp; the list of all numbers of this noun")
    public static SubLObject nnps_tree_get_number_method(final SubLObject self) {
	return $list331;
    }

    /**
     *
     *
     * @return listp; the list of all numbers of this noun
     */
    @LispMethod(comment = "@return listp; the list of all numbers of this noun")
    public static final SubLObject nnps_tree_get_number_method_alt(SubLObject self) {
	return $list_alt331;
    }

    public static SubLObject nnps_tree_p(final SubLObject nnps_tree) {
	return classes.subloop_instanceof_class(nnps_tree, NNPS_TREE);
    }

    public static final SubLObject nnps_tree_p_alt(SubLObject nnps_tree) {
	return classes.subloop_instanceof_class(nnps_tree, NNPS_TREE);
    }

    /**
     *
     *
     * @return listp; the list of all numbers of this noun
     */
    @LispMethod(comment = "@return listp; the list of all numbers of this noun")
    public static SubLObject nns_tree_get_number_method(final SubLObject self) {
	return $list331;
    }

    /**
     *
     *
     * @return listp; the list of all numbers of this noun
     */
    @LispMethod(comment = "@return listp; the list of all numbers of this noun")
    public static final SubLObject nns_tree_get_number_method_alt(SubLObject self) {
	return $list_alt331;
    }

    public static SubLObject nns_tree_p(final SubLObject nns_tree) {
	return classes.subloop_instanceof_class(nns_tree, NNS_TREE);
    }

    public static final SubLObject nns_tree_p_alt(SubLObject nns_tree) {
	return classes.subloop_instanceof_class(nns_tree, NNS_TREE);
    }

    public static SubLObject nominal_word_tree_cyclify_int_method(final SubLObject self) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	if ((NIL != cyclifier_interface.$allow_duplicate_cyclificationsP$.getDynamicValue(thread)) || (NIL == member(self, cyclifier_interface.$cyclification_complete$.getDynamicValue(thread), EQ, UNPROVIDED))) {
	    cyclifier_interface.$cyclification_complete$.setDynamicValue(cons(self, cyclifier_interface.$cyclification_complete$.getDynamicValue(thread)), thread);
	    final SubLObject quantifier = methods.funcall_instance_method_with_0_args(self, GET_QUANTIFIER);
	    SubLObject result = NIL;
	    result = (NIL != quantifier) ? methods.funcall_instance_method_with_0_args(quantifier, CYCLIFY_INT) : methods.funcall_instance_method_with_0_args(self, CYCLIFY_NUCLEUS);
	    return result;
	}
	return NIL;
    }

    public static final SubLObject nominal_word_tree_cyclify_int_method_alt(SubLObject self) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (!((NIL == cyclifier_interface.$allow_duplicate_cyclificationsP$.getDynamicValue(thread)) && (NIL != member(self, cyclifier_interface.$cyclification_complete$.getDynamicValue(thread), EQ, UNPROVIDED)))) {
		cyclifier_interface.$cyclification_complete$.setDynamicValue(cons(self, cyclifier_interface.$cyclification_complete$.getDynamicValue(thread)), thread);
		{
		    SubLObject quantifier = methods.funcall_instance_method_with_0_args(self, GET_QUANTIFIER);
		    SubLObject result = NIL;
		    result = (NIL != quantifier) ? ((SubLObject) (methods.funcall_instance_method_with_0_args(quantifier, CYCLIFY_INT))) : methods.funcall_instance_method_with_0_args(self, CYCLIFY_NUCLEUS);
		    return result;
		}
	    }
	    return NIL;
	}
    }

    public static SubLObject nominal_word_tree_cyclify_nucleus_method(final SubLObject self, SubLObject renamings_disj) {
	if (renamings_disj == UNPROVIDED) {
	    renamings_disj = NIL;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject cycls = NIL;
	SubLObject independent_mods = NIL;
	SubLObject dependent_mods = NIL;
	SubLObject comp_mod_cycls = NIL;
	thread.resetMultipleValues();
	final SubLObject independent_mods_$6 = cyclifier_interface.partition_modifiers(methods.funcall_instance_method_with_0_args(self, GET_MODIFIERS));
	final SubLObject dependent_mods_$7 = thread.secondMultipleValue();
	thread.resetMultipleValues();
	independent_mods = independent_mods_$6;
	dependent_mods = dependent_mods_$7;
	if (NIL == subl_promotions.memberP(self, cyclifier_interface.$cyclification_in_progress$.getDynamicValue(thread), EQ, UNPROVIDED)) {
	    final SubLObject _prev_bind_0 = cyclifier_interface.$cyclification_in_progress$.currentBinding(thread);
	    try {
		cyclifier_interface.$cyclification_in_progress$.bind(cons(self, cyclifier_interface.$cyclification_in_progress$.getDynamicValue(thread)), thread);
		if (NIL == renamings_disj) {
		    renamings_disj = methods.funcall_instance_method_with_1_args(self, GET_KEYWORD_RENAMINGS, cyclifier.required_keywords(methods.funcall_instance_method_with_0_args(self, GET_RANKED_LEXES)));
		}
		SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, GET_SEMANTIC_COMPLEMENTS);
		SubLObject complement = NIL;
		complement = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
		    final SubLObject comp_cycl = methods.funcall_instance_method_with_0_args(complement, CYCLIFY_INT);
		    if (NIL != comp_cycl) {
			comp_mod_cycls = cons(comp_cycl, comp_mod_cycls);
		    }
		    cdolist_list_var = cdolist_list_var.rest();
		    complement = cdolist_list_var.first();
		}
		cdolist_list_var = independent_mods;
		SubLObject modifier = NIL;
		modifier = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
		    final SubLObject mod_cycl = methods.funcall_instance_method_with_0_args(modifier, CYCLIFY_INT);
		    if (NIL != mod_cycl) {
			comp_mod_cycls = cons(mod_cycl, comp_mod_cycls);
		    }
		    cdolist_list_var = cdolist_list_var.rest();
		    modifier = cdolist_list_var.first();
		}
		cdolist_list_var = renamings_disj;
		SubLObject renamings_conj = NIL;
		renamings_conj = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
		    SubLObject cycls_conj = NIL;
		    SubLObject cdolist_list_var_$8 = methods.funcall_instance_method_with_0_args(self, GET_RANKED_LEXES);
		    SubLObject rle = NIL;
		    rle = cdolist_list_var_$8.first();
		    while (NIL != cdolist_list_var_$8) {
			SubLObject cycls_disj = NIL;
			final SubLObject v_term = methods.funcall_instance_method_with_1_args(cyclifier.rle_lex(rle), GET, $TERM);
			SubLObject cdolist_list_var_$9 = renamings_conj;
			SubLObject renaming = NIL;
			renaming = cdolist_list_var_$9.first();
			while (NIL != cdolist_list_var_$9) {
			    SubLObject my_cycls_with_mods = list(list(cyclifier_interface.apply_lex_renaming(self, rle, renaming)));
			    SubLObject cdolist_list_var_$10 = dependent_mods;
			    SubLObject mod = NIL;
			    mod = cdolist_list_var_$10.first();
			    while (NIL != cdolist_list_var_$10) {
				my_cycls_with_mods = cons(methods.funcall_instance_method_with_1_args(mod, CYCLIFY_NUCLEUS, cyclifier_interface.update_keyword_renamings(methods.funcall_instance_method_with_0_args(mod, GET_KEYWORD_RENAMINGS), $REPLACE, v_term)), my_cycls_with_mods);
				cdolist_list_var_$10 = cdolist_list_var_$10.rest();
				mod = cdolist_list_var_$10.first();
			    }
			    cycls_disj = append(Mapping.mapcar(INSTANTIATE_SCOPE, list_utilities.cross_products(my_cycls_with_mods)), cycls_disj);
			    cdolist_list_var_$9 = cdolist_list_var_$9.rest();
			    renaming = cdolist_list_var_$9.first();
			}
			if (NIL != cycls_disj) {
			    cycls_conj = append(cycls_disj, cycls_conj);
			}
			cdolist_list_var_$8 = cdolist_list_var_$8.rest();
			rle = cdolist_list_var_$8.first();
		    }
		    cycls = append(cycls, Mapping.mapcar(INSTANTIATE_SCOPE, list_utilities.cross_products(cons(cycls_conj, comp_mod_cycls))));
		    cdolist_list_var = cdolist_list_var.rest();
		    renamings_conj = cdolist_list_var.first();
		}
	    } finally {
		cyclifier_interface.$cyclification_in_progress$.rebind(_prev_bind_0, thread);
	    }
	}
	return cycls;
    }

    public static final SubLObject nominal_word_tree_cyclify_nucleus_method_alt(SubLObject self, SubLObject renamings_disj) {
	if (renamings_disj == UNPROVIDED) {
	    renamings_disj = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject cycls = NIL;
		SubLObject independent_mods = NIL;
		SubLObject dependent_mods = NIL;
		SubLObject comp_mod_cycls = NIL;
		thread.resetMultipleValues();
		{
		    SubLObject independent_mods_6 = cyclifier_interface.partition_modifiers(methods.funcall_instance_method_with_0_args(self, GET_MODIFIERS));
		    SubLObject dependent_mods_7 = thread.secondMultipleValue();
		    thread.resetMultipleValues();
		    independent_mods = independent_mods_6;
		    dependent_mods = dependent_mods_7;
		}
		if (NIL == subl_promotions.memberP(self, cyclifier_interface.$cyclification_in_progress$.getDynamicValue(thread), EQ, UNPROVIDED)) {
		    {
			SubLObject _prev_bind_0 = cyclifier_interface.$cyclification_in_progress$.currentBinding(thread);
			try {
			    cyclifier_interface.$cyclification_in_progress$.bind(cons(self, cyclifier_interface.$cyclification_in_progress$.getDynamicValue(thread)), thread);
			    if (NIL == renamings_disj) {
				renamings_disj = methods.funcall_instance_method_with_1_args(self, GET_KEYWORD_RENAMINGS, cyclifier.required_keywords(methods.funcall_instance_method_with_0_args(self, GET_RANKED_LEXES)));
			    }
			    {
				SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, GET_SEMANTIC_COMPLEMENTS);
				SubLObject complement = NIL;
				for (complement = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), complement = cdolist_list_var.first()) {
				    {
					SubLObject comp_cycl = methods.funcall_instance_method_with_0_args(complement, CYCLIFY_INT);
					if (NIL != comp_cycl) {
					    comp_mod_cycls = cons(comp_cycl, comp_mod_cycls);
					}
				    }
				}
			    }
			    {
				SubLObject cdolist_list_var = independent_mods;
				SubLObject modifier = NIL;
				for (modifier = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), modifier = cdolist_list_var.first()) {
				    {
					SubLObject mod_cycl = methods.funcall_instance_method_with_0_args(modifier, CYCLIFY_INT);
					if (NIL != mod_cycl) {
					    comp_mod_cycls = cons(mod_cycl, comp_mod_cycls);
					}
				    }
				}
			    }
			    {
				SubLObject cdolist_list_var = renamings_disj;
				SubLObject renamings_conj = NIL;
				for (renamings_conj = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), renamings_conj = cdolist_list_var.first()) {
				    {
					SubLObject cycls_conj = NIL;
					SubLObject cdolist_list_var_8 = methods.funcall_instance_method_with_0_args(self, GET_RANKED_LEXES);
					SubLObject rle = NIL;
					for (rle = cdolist_list_var_8.first(); NIL != cdolist_list_var_8; cdolist_list_var_8 = cdolist_list_var_8.rest(), rle = cdolist_list_var_8.first()) {
					    {
						SubLObject cycls_disj = NIL;
						SubLObject v_term = methods.funcall_instance_method_with_1_args(cyclifier.rle_lex(rle), GET, $TERM);
						SubLObject cdolist_list_var_9 = renamings_conj;
						SubLObject renaming = NIL;
						for (renaming = cdolist_list_var_9.first(); NIL != cdolist_list_var_9; cdolist_list_var_9 = cdolist_list_var_9.rest(), renaming = cdolist_list_var_9.first()) {
						    {
							SubLObject my_cycls_with_mods = list(list(cyclifier_interface.apply_lex_renaming(self, rle, renaming)));
							SubLObject cdolist_list_var_10 = dependent_mods;
							SubLObject mod = NIL;
							for (mod = cdolist_list_var_10.first(); NIL != cdolist_list_var_10; cdolist_list_var_10 = cdolist_list_var_10.rest(), mod = cdolist_list_var_10.first()) {
							    my_cycls_with_mods = cons(methods.funcall_instance_method_with_1_args(mod, CYCLIFY_NUCLEUS, cyclifier_interface.update_keyword_renamings(methods.funcall_instance_method_with_0_args(mod, GET_KEYWORD_RENAMINGS), $REPLACE, v_term)),
								    my_cycls_with_mods);
							}
							cycls_disj = append(Mapping.mapcar(INSTANTIATE_SCOPE, list_utilities.cross_products(my_cycls_with_mods)), cycls_disj);
						    }
						}
						if (NIL != cycls_disj) {
						    cycls_conj = append(cycls_disj, cycls_conj);
						}
					    }
					}
					cycls = append(cycls, Mapping.mapcar(INSTANTIATE_SCOPE, list_utilities.cross_products(cons(cycls_conj, comp_mod_cycls))));
				    }
				}
			    }
			} finally {
			    cyclifier_interface.$cyclification_in_progress$.rebind(_prev_bind_0, thread);
			}
		    }
		}
		return cycls;
	    }
	}
    }

    public static SubLObject nominal_word_tree_definite_description_p_method(final SubLObject self) {
	final SubLObject det = methods.funcall_instance_method_with_0_args(self, GET_DETERMINER);
	if ((NIL != det) && methods.funcall_instance_method_with_0_args(det, GET_STRING).equalp($$$the)) {
	    return T;
	}
	final SubLObject head = methods.funcall_instance_method_with_0_args(self, GET_HEAD);
	if (((NIL != head) && (NIL != cyclifier_interface.name_word_p(head))) && (NIL != methods.funcall_instance_method_with_0_args(head, SINGULAR_P))) {
	    return T;
	}
	final SubLObject pos = methods.funcall_instance_method_with_0_args(self, GET_POSSESSOR);
	if (NIL != pos) {
	    return T;
	}
	return NIL;
    }

    public static final SubLObject nominal_word_tree_definite_description_p_method_alt(SubLObject self) {
	{
	    SubLObject det = methods.funcall_instance_method_with_0_args(self, GET_DETERMINER);
	    if ((NIL != det) && methods.funcall_instance_method_with_0_args(det, GET_STRING).equalp($$$the)) {
		return T;
	    }
	    {
		SubLObject head = methods.funcall_instance_method_with_0_args(self, GET_HEAD);
		if (((NIL != head) && (NIL != cyclifier_interface.name_word_p(head))) && (NIL != methods.funcall_instance_method_with_0_args(head, SINGULAR_P))) {
		    return T;
		}
	    }
	    {
		SubLObject pos = methods.funcall_instance_method_with_0_args(self, GET_POSSESSOR);
		if (NIL != pos) {
		    return T;
		}
	    }
	}
	return NIL;
    }

    /**
     *
     *
     * @return parse-tree-p; the tree that serves as an antecedent to this noun
     */
    @LispMethod(comment = "@return parse-tree-p; the tree that serves as an antecedent to this noun")
    public static SubLObject nominal_word_tree_get_antecedent_method(final SubLObject self) {
	return NIL;
    }

    /**
     *
     *
     * @return parse-tree-p; the tree that serves as an antecedent to this noun
     */
    @LispMethod(comment = "@return parse-tree-p; the tree that serves as an antecedent to this noun")
    public static final SubLObject nominal_word_tree_get_antecedent_method_alt(SubLObject self) {
	return NIL;
    }

    /**
     *
     *
     * @return listp; the complements of this noun
     */
    @LispMethod(comment = "@return listp; the complements of this noun")
    public static SubLObject nominal_word_tree_get_complements_method(final SubLObject self) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject catch_var_for_nominal_word_tree_method = NIL;
	final SubLObject mother = parse_tree.get_parse_tree_mother(self);
	try {
	    thread.throwStack.push($sym242$OUTER_CATCH_FOR_NOMINAL_WORD_TREE_METHOD);
	    try {
		if (NIL != methods.funcall_instance_method_with_0_args(self, RELATIONAL_NOUN_P)) {
		    SubLObject complement = NIL;
		    complement = methods.funcall_instance_method_with_0_args(self, GET_POSSESSOR);
		    if ((NIL == complement) && (NIL != mother)) {
			final SubLObject sister = methods.funcall_instance_method_with_1_args(mother, GET_SISTER, ONE_INTEGER);
			final SubLObject sister_head = (NIL != sister) ? methods.funcall_instance_method_with_0_args(sister, GET_HEAD) : NIL;
			if (((NIL != parse_tree.prepositional_or_particle_phrase_tree_p(sister)) && (NIL != sister_head)) && methods.funcall_instance_method_with_0_args(sister_head, GET_STRING).equalp($$$of)) {
			    complement = methods.funcall_instance_method_with_0_args(sister, GET_OBLIQUE_OBJECT);
			}
		    }
		    sublisp_throw($sym242$OUTER_CATCH_FOR_NOMINAL_WORD_TREE_METHOD, NIL != complement ? list(complement) : NIL);
		}
	    } finally {
		final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    parse_tree.set_parse_tree_mother(self, mother);
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
		}
	    }
	} catch (final Throwable ccatch_env_var) {
	    catch_var_for_nominal_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym242$OUTER_CATCH_FOR_NOMINAL_WORD_TREE_METHOD);
	} finally {
	    thread.throwStack.pop();
	}
	return catch_var_for_nominal_word_tree_method;
    }

    /**
     *
     *
     * @return listp; the complements of this noun
     */
    @LispMethod(comment = "@return listp; the complements of this noun")
    public static final SubLObject nominal_word_tree_get_complements_method_alt(SubLObject self) {
	{
	    SubLObject catch_var_for_nominal_word_tree_method = NIL;
	    SubLObject mother = parse_tree.get_parse_tree_mother(self);
	    try {
		try {
		    if (NIL != methods.funcall_instance_method_with_0_args(self, RELATIONAL_NOUN_P)) {
			{
			    SubLObject complement = NIL;
			    complement = methods.funcall_instance_method_with_0_args(self, GET_POSSESSOR);
			    if (NIL == complement) {
				if (NIL != mother) {
				    {
					SubLObject sister = methods.funcall_instance_method_with_1_args(mother, GET_SISTER, ONE_INTEGER);
					SubLObject sister_head = (NIL != sister) ? ((SubLObject) (methods.funcall_instance_method_with_0_args(sister, GET_HEAD))) : NIL;
					if (((NIL != parse_tree.prepositional_or_particle_phrase_tree_p(sister)) && (NIL != sister_head)) && methods.funcall_instance_method_with_0_args(sister_head, GET_STRING).equalp($$$of)) {
					    complement = methods.funcall_instance_method_with_0_args(sister, GET_OBLIQUE_OBJECT);
					}
				    }
				}
			    }
			    sublisp_throw($sym242$OUTER_CATCH_FOR_NOMINAL_WORD_TREE_METHOD, NIL != complement ? ((SubLObject) (list(complement))) : NIL);
			}
		    }
		} finally {
		    {
			SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
			try {
			    bind($is_thread_performing_cleanupP$, T);
			    parse_tree.set_parse_tree_mother(self, mother);
			} finally {
			    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
			}
		    }
		}
	    } catch (Throwable ccatch_env_var) {
		catch_var_for_nominal_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym242$OUTER_CATCH_FOR_NOMINAL_WORD_TREE_METHOD);
	    }
	    return catch_var_for_nominal_word_tree_method;
	}
    }

    /**
     *
     *
     * @return word-tree-p; the determiner of this noun or nil if there is none
     */
    @LispMethod(comment = "@return word-tree-p; the determiner of this noun or nil if there is none")
    public static SubLObject nominal_word_tree_get_determiner_method(final SubLObject self) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject catch_var_for_nominal_word_tree_method = NIL;
	final SubLObject idx = parse_tree.get_parse_tree_idx(self);
	final SubLObject mother = parse_tree.get_parse_tree_mother(self);
	try {
	    thread.throwStack.push($sym245$OUTER_CATCH_FOR_NOMINAL_WORD_TREE_METHOD);
	    try {
		SubLObject det = methods.funcall_instance_method_with_2_args(mother, FIND_LAST, DETERMINER_WORD_TREE_P, number_utilities.f_1_(idx));
		if (NIL != det) {
		    sublisp_throw($sym245$OUTER_CATCH_FOR_NOMINAL_WORD_TREE_METHOD, det);
		}
		det = methods.funcall_instance_method_with_1_args(mother, FIND_LAST, WHADJP_TREE_P);
		if (NIL != det) {
		    det = methods.funcall_instance_method_with_1_args(det, FIND_FIRST, DETERMINER_WORD_TREE_P);
		}
		sublisp_throw($sym245$OUTER_CATCH_FOR_NOMINAL_WORD_TREE_METHOD, det);
	    } finally {
		final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    parse_tree.set_parse_tree_idx(self, idx);
		    parse_tree.set_parse_tree_mother(self, mother);
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
		}
	    }
	} catch (final Throwable ccatch_env_var) {
	    catch_var_for_nominal_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym245$OUTER_CATCH_FOR_NOMINAL_WORD_TREE_METHOD);
	} finally {
	    thread.throwStack.pop();
	}
	return catch_var_for_nominal_word_tree_method;
    }

    /**
     *
     *
     * @return word-tree-p; the determiner of this noun or nil if there is none
     */
    @LispMethod(comment = "@return word-tree-p; the determiner of this noun or nil if there is none")
    public static final SubLObject nominal_word_tree_get_determiner_method_alt(SubLObject self) {
	{
	    SubLObject catch_var_for_nominal_word_tree_method = NIL;
	    SubLObject idx = parse_tree.get_parse_tree_idx(self);
	    SubLObject mother = parse_tree.get_parse_tree_mother(self);
	    try {
		try {
		    {
			SubLObject det = methods.funcall_instance_method_with_2_args(mother, FIND_LAST, DETERMINER_WORD_TREE_P, number_utilities.f_1_(idx));
			if (NIL != det) {
			    sublisp_throw($sym245$OUTER_CATCH_FOR_NOMINAL_WORD_TREE_METHOD, det);
			}
			det = methods.funcall_instance_method_with_1_args(mother, FIND_LAST, WHADJP_TREE_P);
			if (NIL != det) {
			    det = methods.funcall_instance_method_with_1_args(det, FIND_FIRST, DETERMINER_WORD_TREE_P);
			}
			sublisp_throw($sym245$OUTER_CATCH_FOR_NOMINAL_WORD_TREE_METHOD, det);
		    }
		} finally {
		    {
			SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
			try {
			    bind($is_thread_performing_cleanupP$, T);
			    parse_tree.set_parse_tree_idx(self, idx);
			    parse_tree.set_parse_tree_mother(self, mother);
			} finally {
			    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
			}
		    }
		}
	    } catch (Throwable ccatch_env_var) {
		catch_var_for_nominal_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym245$OUTER_CATCH_FOR_NOMINAL_WORD_TREE_METHOD);
	    }
	    return catch_var_for_nominal_word_tree_method;
	}
    }

    /**
     *
     *
     * @return listp; a list of genders of this noun with possible gender values
    :FEMININE, :MASCULINE and :NEUTER
     */
    @LispMethod(comment = "@return listp; a list of genders of this noun with possible gender values\r\n:FEMININE, :MASCULINE and :NEUTER")
    public static SubLObject nominal_word_tree_get_gender_method(final SubLObject self) {
	SubLObject genders = NIL;
	SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, GET_LEXES);
	SubLObject lex = NIL;
	lex = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    genders = append(methods.funcall_instance_method_with_1_args(lex, GET, $GENDER), genders);
	    cdolist_list_var = cdolist_list_var.rest();
	    lex = cdolist_list_var.first();
	}
	return remove_duplicates(genders, EQL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return listp; a list of genders of this noun with possible gender values
    :FEMININE, :MASCULINE and :NEUTER
     */
    @LispMethod(comment = "@return listp; a list of genders of this noun with possible gender values\r\n:FEMININE, :MASCULINE and :NEUTER")
    public static final SubLObject nominal_word_tree_get_gender_method_alt(SubLObject self) {
	{
	    SubLObject genders = NIL;
	    SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, GET_LEXES);
	    SubLObject lex = NIL;
	    for (lex = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), lex = cdolist_list_var.first()) {
		genders = append(methods.funcall_instance_method_with_1_args(lex, GET, $GENDER), genders);
	    }
	    return remove_duplicates(genders, EQL, UNPROVIDED, UNPROVIDED, UNPROVIDED);
	}
    }

    public static SubLObject nominal_word_tree_get_keyword_renamings_method(final SubLObject self, SubLObject keywords) {
	if (keywords == UNPROVIDED) {
	    keywords = $list204;
	}
	SubLObject conjuncts = NIL;
	SubLObject disjuncts = NIL;
	final SubLObject complement = methods.funcall_instance_method_with_0_args(self, GET_SEMANTIC_COMPLEMENTS).first();
	final SubLObject quantifier0 = methods.funcall_instance_method_with_0_args(self, GET_OVERT_QUANTIFIER);
	final SubLObject quantifier2 = (NIL != quantifier0) ? methods.funcall_instance_method_with_0_args(quantifier0, GET_HEAD) : NIL;
	final SubLObject modified = methods.funcall_instance_method_with_0_args(self, GET_MODIFIEDS).first();
	if (NIL != subl_promotions.memberP($NOUN, keywords, EQL, UNPROVIDED)) {
	    conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($NOUN, self), conjuncts);
	}
	if ((NIL != complement) && (NIL != member($OBLIQUE_OBJECT, keywords, EQL, UNPROVIDED))) {
	    conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($PREP_OBJECT, complement), conjuncts);
	}
	if ((NIL != complement) && (NIL != member($POSSESSOR, keywords, EQL, UNPROVIDED))) {
	    conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($POSSESSOR, complement), conjuncts);
	}
	if ((NIL != modified) && (NIL != member($MODIFIED, keywords, EQL, UNPROVIDED))) {
	    conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($MODIFIED, modified), conjuncts);
	}
	if (((NIL != quantifier2) && methods.funcall_instance_method_with_0_args(quantifier2, GET_CATEGORY).eql($CD)) && (NIL != member($NUMBER, keywords, EQL, UNPROVIDED))) {
	    conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($NUMBER, quantifier2), conjuncts);
	}
	if ((NIL != complement) && (NIL != member($POSS_COL, keywords, EQL, UNPROVIDED))) {
	    final SubLObject head = methods.funcall_instance_method_with_0_args(complement, GET_HEAD);
	    SubLObject cycl = NIL;
	    SubLObject col = NIL;
	    if (NIL != head) {
		SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(head, GET_LEXES);
		SubLObject lex = NIL;
		lex = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
		    cycl = methods.funcall_instance_method_with_1_args(lex, GET, $SEMTRANS);
		    col = parse_tree.main_collection(cycl, $NOUN);
		    disjuncts = cons(cons($POSS_COL, col), disjuncts);
		    cdolist_list_var = cdolist_list_var.rest();
		    lex = cdolist_list_var.first();
		}
		if (NIL == disjuncts) {
		    disjuncts = cons(cons($POSS_COL, $$Thing), disjuncts);
		}
	    }
	}
	return cyclifier_interface.disjunctive_keyword_renamings(conjuncts, disjuncts);
    }

    public static final SubLObject nominal_word_tree_get_keyword_renamings_method_alt(SubLObject self, SubLObject keywords) {
	if (keywords == UNPROVIDED) {
	    keywords = $list_alt204;
	}
	{
	    SubLObject conjuncts = NIL;
	    SubLObject disjuncts = NIL;
	    SubLObject complement = methods.funcall_instance_method_with_0_args(self, GET_SEMANTIC_COMPLEMENTS).first();
	    SubLObject quantifier0 = methods.funcall_instance_method_with_0_args(self, GET_OVERT_QUANTIFIER);
	    SubLObject quantifier = (NIL != quantifier0) ? ((SubLObject) (methods.funcall_instance_method_with_0_args(quantifier0, GET_HEAD))) : NIL;
	    SubLObject modified = methods.funcall_instance_method_with_0_args(self, GET_MODIFIEDS).first();
	    if (NIL != subl_promotions.memberP($NOUN, keywords, EQL, UNPROVIDED)) {
		conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($NOUN, self), conjuncts);
	    }
	    if ((NIL != complement) && (NIL != member($OBLIQUE_OBJECT, keywords, EQL, UNPROVIDED))) {
		conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($PREP_OBJECT, complement), conjuncts);
	    }
	    if ((NIL != complement) && (NIL != member($POSSESSOR, keywords, EQL, UNPROVIDED))) {
		conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($POSSESSOR, complement), conjuncts);
	    }
	    if ((NIL != modified) && (NIL != member($MODIFIED, keywords, EQL, UNPROVIDED))) {
		conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($MODIFIED, modified), conjuncts);
	    }
	    if (((NIL != quantifier) && methods.funcall_instance_method_with_0_args(quantifier, GET_CATEGORY).eql($CD)) && (NIL != member($NUMBER, keywords, EQL, UNPROVIDED))) {
		conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($NUMBER, quantifier), conjuncts);
	    }
	    if ((NIL != complement) && (NIL != member($POSS_COL, keywords, EQL, UNPROVIDED))) {
		{
		    SubLObject head = methods.funcall_instance_method_with_0_args(complement, GET_HEAD);
		    SubLObject cycl = NIL;
		    SubLObject col = NIL;
		    if (NIL != head) {
			{
			    SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(head, GET_LEXES);
			    SubLObject lex = NIL;
			    for (lex = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), lex = cdolist_list_var.first()) {
				cycl = methods.funcall_instance_method_with_1_args(lex, GET, $SEMTRANS);
				col = parse_tree.main_collection(cycl, $NOUN);
				disjuncts = cons(cons($POSS_COL, col), disjuncts);
			    }
			}
			if (NIL == disjuncts) {
			    disjuncts = cons(cons($POSS_COL, $$Thing), disjuncts);
			}
		    }
		}
	    }
	    return cyclifier_interface.disjunctive_keyword_renamings(conjuncts, disjuncts);
	}
    }

    /**
     *
     *
     * @return listp; the list of trees this nominal word tree modifies
     */
    @LispMethod(comment = "@return listp; the list of trees this nominal word tree modifies")
    public static SubLObject nominal_word_tree_get_modifieds_method(final SubLObject self) {
	SubLObject modifieds = NIL;
	final SubLObject ancestors = methods.funcall_instance_method_with_0_args(self, GET_ANCESTORS);
	SubLObject successP = NIL;
	if (NIL == successP) {
	    SubLObject csome_list_var = ancestors;
	    SubLObject ancestor = NIL;
	    ancestor = csome_list_var.first();
	    while ((NIL == successP) && (NIL != csome_list_var)) {
		if ((((NIL != appositive_np_p(ancestor)) && methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(ancestor, GET_DAUGHTER, TWO_INTEGER), GET_HEAD).eql(self))
			&& (NIL != methods.funcall_instance_method_with_1_args(ancestor, GET_DAUGHTER, ZERO_INTEGER))) && (NIL != methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(ancestor, GET_DAUGHTER, ZERO_INTEGER), GET_HEAD))) {
		    modifieds = cons(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(ancestor, GET_DAUGHTER, ZERO_INTEGER), GET_HEAD), modifieds);
		    successP = T;
		}
		csome_list_var = csome_list_var.rest();
		ancestor = csome_list_var.first();
	    }
	}
	successP = NIL;
	if (NIL == successP) {
	    SubLObject csome_list_var = ancestors;
	    SubLObject ancestor = NIL;
	    ancestor = csome_list_var.first();
	    while ((NIL == successP) && (NIL != csome_list_var)) {
		if (((((NIL != parse_tree.verbal_tree_p(ancestor)) && (NIL != methods.funcall_instance_method_with_0_args(ancestor, COPULA_P))) && (NIL != methods.funcall_instance_method_with_0_args(ancestor, GET_OBJECTS)))
			&& self.eql(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(ancestor, GET_OBJECTS).first(), GET_HEAD))) && (NIL != methods.funcall_instance_method_with_0_args(ancestor, GET_SUBJECT))) {
		    modifieds = cons(methods.funcall_instance_method_with_0_args(ancestor, GET_SUBJECT), modifieds);
		    successP = T;
		}
		csome_list_var = csome_list_var.rest();
		ancestor = csome_list_var.first();
	    }
	}
	if (NIL != parse_tree.nominal_tree_p(methods.funcall_instance_method_with_1_args(self, GET_SISTER, ONE_INTEGER))) {
	    modifieds = cons(methods.funcall_instance_method_with_1_args(self, GET_SISTER, ONE_INTEGER), modifieds);
	}
	if (NIL != word_tree_temporal_tree_p_method(self)) {
	    successP = NIL;
	    if (NIL == successP) {
		SubLObject csome_list_var = ancestors;
		SubLObject ancestor = NIL;
		ancestor = csome_list_var.first();
		while ((NIL == successP) && (NIL != csome_list_var)) {
		    if (NIL != parse_tree.verbal_tree_p(ancestor)) {
			SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(ancestor, GET_HEADS);
			SubLObject head = NIL;
			head = cdolist_list_var.first();
			while (NIL != cdolist_list_var) {
			    modifieds = cons(head, modifieds);
			    cdolist_list_var = cdolist_list_var.rest();
			    head = cdolist_list_var.first();
			}
			successP = T;
		    }
		    csome_list_var = csome_list_var.rest();
		    ancestor = csome_list_var.first();
		}
	    }
	}
	return modifieds;
    }

    /**
     *
     *
     * @return listp; the list of trees this nominal word tree modifies
     */
    @LispMethod(comment = "@return listp; the list of trees this nominal word tree modifies")
    public static final SubLObject nominal_word_tree_get_modifieds_method_alt(SubLObject self) {
	{
	    SubLObject modifieds = NIL;
	    SubLObject ancestors = methods.funcall_instance_method_with_0_args(self, GET_ANCESTORS);
	    SubLObject successP = NIL;
	    if (NIL == successP) {
		{
		    SubLObject csome_list_var = ancestors;
		    SubLObject ancestor = NIL;
		    for (ancestor = csome_list_var.first(); !((NIL != successP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest(), ancestor = csome_list_var.first()) {
			if ((((NIL != com.cyc.cycjava.cycl.word_tree.appositive_np_p(ancestor)) && (methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(ancestor, GET_DAUGHTER, TWO_INTEGER), GET_HEAD) == self))
				&& (NIL != methods.funcall_instance_method_with_1_args(ancestor, GET_DAUGHTER, ZERO_INTEGER))) && (NIL != methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(ancestor, GET_DAUGHTER, ZERO_INTEGER), GET_HEAD))) {
			    modifieds = cons(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(ancestor, GET_DAUGHTER, ZERO_INTEGER), GET_HEAD), modifieds);
			    successP = T;
			}
		    }
		}
	    }
	    successP = NIL;
	    if (NIL == successP) {
		{
		    SubLObject csome_list_var = ancestors;
		    SubLObject ancestor = NIL;
		    for (ancestor = csome_list_var.first(); !((NIL != successP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest(), ancestor = csome_list_var.first()) {
			if (((((NIL != parse_tree.verbal_tree_p(ancestor)) && (NIL != methods.funcall_instance_method_with_0_args(ancestor, COPULA_P))) && (NIL != methods.funcall_instance_method_with_0_args(ancestor, GET_OBJECTS)))
				&& (self == methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(ancestor, GET_OBJECTS).first(), GET_HEAD))) && (NIL != methods.funcall_instance_method_with_0_args(ancestor, GET_SUBJECT))) {
			    modifieds = cons(methods.funcall_instance_method_with_0_args(ancestor, GET_SUBJECT), modifieds);
			    successP = T;
			}
		    }
		}
	    }
	    if (NIL != parse_tree.nominal_tree_p(methods.funcall_instance_method_with_1_args(self, GET_SISTER, ONE_INTEGER))) {
		modifieds = cons(methods.funcall_instance_method_with_1_args(self, GET_SISTER, ONE_INTEGER), modifieds);
	    }
	    if (NIL != com.cyc.cycjava.cycl.word_tree.word_tree_temporal_tree_p_method(self)) {
		successP = NIL;
		if (NIL == successP) {
		    {
			SubLObject csome_list_var = ancestors;
			SubLObject ancestor = NIL;
			for (ancestor = csome_list_var.first(); !((NIL != successP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest(), ancestor = csome_list_var.first()) {
			    if (NIL != parse_tree.verbal_tree_p(ancestor)) {
				{
				    SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(ancestor, GET_HEADS);
				    SubLObject head = NIL;
				    for (head = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), head = cdolist_list_var.first()) {
					modifieds = cons(head, modifieds);
				    }
				}
				successP = T;
			    }
			}
		    }
		}
	    }
	    return modifieds;
	}
    }

    /**
     *
     *
     * @return listp; a list of numbers of this noun with possible number values
    :SINGULAR and :PLURAL
     * @unknown this should be overridden by the subclassses
     */
    @LispMethod(comment = "@return listp; a list of numbers of this noun with possible number values\r\n:SINGULAR and :PLURAL\r\n@unknown this should be overridden by the subclassses")
    public static SubLObject nominal_word_tree_get_number_method(final SubLObject self) {
	return NIL;
    }

    /**
     *
     *
     * @return listp; a list of numbers of this noun with possible number values
    :SINGULAR and :PLURAL
     * @unknown this should be overridden by the subclassses
     */
    @LispMethod(comment = "@return listp; a list of numbers of this noun with possible number values\r\n:SINGULAR and :PLURAL\r\n@unknown this should be overridden by the subclassses")
    public static final SubLObject nominal_word_tree_get_number_method_alt(SubLObject self) {
	return NIL;
    }

    /**
     *
     *
     * @return word-tree-p; the visible quantifier of this noun of nil if there is none
     */
    @LispMethod(comment = "@return word-tree-p; the visible quantifier of this noun of nil if there is none")
    public static SubLObject nominal_word_tree_get_overt_quantifier_method(final SubLObject self) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject catch_var_for_nominal_word_tree_method = NIL;
	final SubLObject idx = parse_tree.get_parse_tree_idx(self);
	final SubLObject mother = parse_tree.get_parse_tree_mother(self);
	try {
	    thread.throwStack.push($sym252$OUTER_CATCH_FOR_NOMINAL_WORD_TREE_METHOD);
	    try {
		final SubLObject quant = methods.funcall_instance_method_with_2_args(mother, FIND_LAST, QUANTIFIER_TREE_P, number_utilities.f_1_(idx));
		if (NIL != quant) {
		    sublisp_throw($sym252$OUTER_CATCH_FOR_NOMINAL_WORD_TREE_METHOD, quant);
		}
		sublisp_throw($sym252$OUTER_CATCH_FOR_NOMINAL_WORD_TREE_METHOD, methods.funcall_instance_method_with_0_args(self, GET_DETERMINER));
	    } finally {
		final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    parse_tree.set_parse_tree_idx(self, idx);
		    parse_tree.set_parse_tree_mother(self, mother);
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
		}
	    }
	} catch (final Throwable ccatch_env_var) {
	    catch_var_for_nominal_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym252$OUTER_CATCH_FOR_NOMINAL_WORD_TREE_METHOD);
	} finally {
	    thread.throwStack.pop();
	}
	return catch_var_for_nominal_word_tree_method;
    }

    /**
     *
     *
     * @return word-tree-p; the visible quantifier of this noun of nil if there is none
     */
    @LispMethod(comment = "@return word-tree-p; the visible quantifier of this noun of nil if there is none")
    public static final SubLObject nominal_word_tree_get_overt_quantifier_method_alt(SubLObject self) {
	{
	    SubLObject catch_var_for_nominal_word_tree_method = NIL;
	    SubLObject idx = parse_tree.get_parse_tree_idx(self);
	    SubLObject mother = parse_tree.get_parse_tree_mother(self);
	    try {
		try {
		    {
			SubLObject quant = methods.funcall_instance_method_with_2_args(mother, FIND_LAST, QUANTIFIER_TREE_P, number_utilities.f_1_(idx));
			if (NIL != quant) {
			    sublisp_throw($sym252$OUTER_CATCH_FOR_NOMINAL_WORD_TREE_METHOD, quant);
			}
			sublisp_throw($sym252$OUTER_CATCH_FOR_NOMINAL_WORD_TREE_METHOD, methods.funcall_instance_method_with_0_args(self, GET_DETERMINER));
		    }
		} finally {
		    {
			SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
			try {
			    bind($is_thread_performing_cleanupP$, T);
			    parse_tree.set_parse_tree_idx(self, idx);
			    parse_tree.set_parse_tree_mother(self, mother);
			} finally {
			    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
			}
		    }
		}
	    } catch (Throwable ccatch_env_var) {
		catch_var_for_nominal_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym252$OUTER_CATCH_FOR_NOMINAL_WORD_TREE_METHOD);
	    }
	    return catch_var_for_nominal_word_tree_method;
	}
    }

    /**
     *
     *
     * @return numberp; the person of this noun; 1, 2, or 3
     */
    @LispMethod(comment = "@return numberp; the person of this noun; 1, 2, or 3")
    public static SubLObject nominal_word_tree_get_person_method(final SubLObject self) {
	return THREE_INTEGER;
    }

    /**
     *
     *
     * @return numberp; the person of this noun; 1, 2, or 3
     */
    @LispMethod(comment = "@return numberp; the person of this noun; 1, 2, or 3")
    public static final SubLObject nominal_word_tree_get_person_method_alt(SubLObject self) {
	return THREE_INTEGER;
    }

    /**
     *
     *
     * @return phrase-tree-p; the possessor phrase of this noun
     */
    @LispMethod(comment = "@return phrase-tree-p; the possessor phrase of this noun")
    public static SubLObject nominal_word_tree_get_possessor_method(final SubLObject self) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject catch_var_for_nominal_word_tree_method = NIL;
	final SubLObject idx = parse_tree.get_parse_tree_idx(self);
	final SubLObject mother = parse_tree.get_parse_tree_mother(self);
	try {
	    thread.throwStack.push($sym270$OUTER_CATCH_FOR_NOMINAL_WORD_TREE_METHOD);
	    try {
		final SubLObject np = methods.funcall_instance_method_with_2_args(mother, FIND_LAST, NOMINAL_PHRASE_TREE_P, idx);
		sublisp_throw($sym270$OUTER_CATCH_FOR_NOMINAL_WORD_TREE_METHOD, (NIL != np) && (NIL != methods.funcall_instance_method_with_0_args(np, POSSESSIVE_P)) ? np : methods.funcall_instance_method_with_2_args(mother, FIND_LAST, $sym273$PRP__TREE_P, idx));
	    } finally {
		final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    parse_tree.set_parse_tree_idx(self, idx);
		    parse_tree.set_parse_tree_mother(self, mother);
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
		}
	    }
	} catch (final Throwable ccatch_env_var) {
	    catch_var_for_nominal_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym270$OUTER_CATCH_FOR_NOMINAL_WORD_TREE_METHOD);
	} finally {
	    thread.throwStack.pop();
	}
	return catch_var_for_nominal_word_tree_method;
    }

    /**
     *
     *
     * @return phrase-tree-p; the possessor phrase of this noun
     */
    @LispMethod(comment = "@return phrase-tree-p; the possessor phrase of this noun")
    public static final SubLObject nominal_word_tree_get_possessor_method_alt(SubLObject self) {
	{
	    SubLObject catch_var_for_nominal_word_tree_method = NIL;
	    SubLObject idx = parse_tree.get_parse_tree_idx(self);
	    SubLObject mother = parse_tree.get_parse_tree_mother(self);
	    try {
		try {
		    {
			SubLObject np = methods.funcall_instance_method_with_2_args(mother, FIND_LAST, NOMINAL_PHRASE_TREE_P, idx);
			sublisp_throw($sym270$OUTER_CATCH_FOR_NOMINAL_WORD_TREE_METHOD, (NIL != np) && (NIL != methods.funcall_instance_method_with_0_args(np, POSSESSIVE_P)) ? ((SubLObject) (np)) : methods.funcall_instance_method_with_2_args(mother, FIND_LAST, $sym273$PRP__TREE_P, idx));
		    }
		} finally {
		    {
			SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
			try {
			    bind($is_thread_performing_cleanupP$, T);
			    parse_tree.set_parse_tree_idx(self, idx);
			    parse_tree.set_parse_tree_mother(self, mother);
			} finally {
			    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
			}
		    }
		}
	    } catch (Throwable ccatch_env_var) {
		catch_var_for_nominal_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym270$OUTER_CATCH_FOR_NOMINAL_WORD_TREE_METHOD);
	    }
	    return catch_var_for_nominal_word_tree_method;
	}
    }

    public static SubLObject nominal_word_tree_get_quantifier_method(final SubLObject self) {
	final SubLObject quantifier = methods.funcall_instance_method_with_0_args(self, GET_OVERT_QUANTIFIER);
	if (NIL != quantifier) {
	    return methods.funcall_instance_method_with_0_args(quantifier, GET_STRING).equalp($$$the) ? NIL : quantifier;
	}
	if ((NIL == methods.funcall_instance_method_with_0_args(self, GET_POSSESSOR)) && (NIL != methods.funcall_instance_method_with_0_args(self, SINGULAR_P))) {
	    return methods.funcall_instance_method_with_0_args(self, GET_EXISTENTIAL_NULL_DETERMINER);
	}
	if ((NIL == methods.funcall_instance_method_with_0_args(self, GET_POSSESSOR)) && (NIL != methods.funcall_instance_method_with_0_args(self, PLURAL_P))) {
	    return methods.funcall_instance_method_with_0_args(self, GET_EXISTENTIAL_NULL_DETERMINER);
	}
	if (NIL == methods.funcall_instance_method_with_0_args(self, GET_POSSESSOR)) {
	    return NIL;
	}
	return NIL;
    }

    public static final SubLObject nominal_word_tree_get_quantifier_method_alt(SubLObject self) {
	{
	    SubLObject quantifier = methods.funcall_instance_method_with_0_args(self, GET_OVERT_QUANTIFIER);
	    if (NIL != quantifier) {
		return !methods.funcall_instance_method_with_0_args(quantifier, GET_STRING).equalp($$$the) ? ((SubLObject) (quantifier)) : NIL;
	    } else {
		if ((NIL == methods.funcall_instance_method_with_0_args(self, GET_POSSESSOR)) && (NIL != methods.funcall_instance_method_with_0_args(self, SINGULAR_P))) {
		    return methods.funcall_instance_method_with_0_args(self, GET_EXISTENTIAL_NULL_DETERMINER);
		} else {
		    if ((NIL == methods.funcall_instance_method_with_0_args(self, GET_POSSESSOR)) && (NIL != methods.funcall_instance_method_with_0_args(self, PLURAL_P))) {
			return methods.funcall_instance_method_with_0_args(self, GET_EXISTENTIAL_NULL_DETERMINER);
		    } else {
			if (NIL == methods.funcall_instance_method_with_0_args(self, GET_POSSESSOR)) {
			    return NIL;
			}
		    }
		}
	    }
	}
	return NIL;
    }

    /**
     *
     *
     * @return phrase-tree-p; the specifier phrase of this noun
     */
    @LispMethod(comment = "@return phrase-tree-p; the specifier phrase of this noun")
    public static SubLObject nominal_word_tree_get_specifier_method(final SubLObject self) {
	SubLObject specifier = methods.funcall_instance_method_with_0_args(self, GET_DETERMINER);
	if (NIL == specifier) {
	    specifier = methods.funcall_instance_method_with_0_args(self, GET_QUANTIFIER);
	}
	if (NIL == specifier) {
	    specifier = methods.funcall_instance_method_with_0_args(self, GET_POSSESSOR);
	}
	return specifier;
    }

    /**
     *
     *
     * @return phrase-tree-p; the specifier phrase of this noun
     */
    @LispMethod(comment = "@return phrase-tree-p; the specifier phrase of this noun")
    public static final SubLObject nominal_word_tree_get_specifier_method_alt(SubLObject self) {
	{
	    SubLObject specifier = methods.funcall_instance_method_with_0_args(self, GET_DETERMINER);
	    if (NIL == specifier) {
		specifier = methods.funcall_instance_method_with_0_args(self, GET_QUANTIFIER);
	    }
	    if (NIL == specifier) {
		specifier = methods.funcall_instance_method_with_0_args(self, GET_POSSESSOR);
	    }
	    return specifier;
	}
    }

    public static SubLObject nominal_word_tree_p(final SubLObject nominal_word_tree) {
	return classes.subloop_instanceof_class(nominal_word_tree, NOMINAL_WORD_TREE);
    }

    public static final SubLObject nominal_word_tree_p_alt(SubLObject nominal_word_tree) {
	return classes.subloop_instanceof_class(nominal_word_tree, NOMINAL_WORD_TREE);
    }

    /**
     *
     *
     * @return boolenanp; t if this tree is plural, nil otherwise
     */
    @LispMethod(comment = "@return boolenanp; t if this tree is plural, nil otherwise")
    public static SubLObject nominal_word_tree_plural_p_method(final SubLObject self) {
	return list_utilities.sublisp_boolean(member($PLURAL, methods.funcall_instance_method_with_0_args(self, GET_NUMBER), EQL, UNPROVIDED));
    }

    /**
     *
     *
     * @return boolenanp; t if this tree is plural, nil otherwise
     */
    @LispMethod(comment = "@return boolenanp; t if this tree is plural, nil otherwise")
    public static final SubLObject nominal_word_tree_plural_p_method_alt(SubLObject self) {
	return list_utilities.sublisp_boolean(member($PLURAL, methods.funcall_instance_method_with_0_args(self, GET_NUMBER), EQL, UNPROVIDED));
    }

    public static SubLObject nominal_word_tree_relational_noun_p_method(final SubLObject self) {
	SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, GET_RANKED_LEXES);
	SubLObject rle = NIL;
	rle = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    final SubLObject denot = cyclifier.rename_variables(methods.funcall_instance_method_with_1_args(cyclifier.rle_lex(rle), GET, $SEMTRANS), cyclifier.frame_renaming(methods.funcall_instance_method_with_1_args(cyclifier.rle_lex(rle), GET, $FRAME)));
	    final SubLObject keywords = cyclifier.formula_keywords(denot);
	    SubLObject cdolist_list_var_$11 = $list69;
	    SubLObject keyword = NIL;
	    keyword = cdolist_list_var_$11.first();
	    while (NIL != cdolist_list_var_$11) {
		if (NIL != subl_promotions.memberP(keyword, keywords, EQ, UNPROVIDED)) {
		    return T;
		}
		cdolist_list_var_$11 = cdolist_list_var_$11.rest();
		keyword = cdolist_list_var_$11.first();
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    rle = cdolist_list_var.first();
	}
	return NIL;
    }

    public static final SubLObject nominal_word_tree_relational_noun_p_method_alt(SubLObject self) {
	{
	    SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, GET_RANKED_LEXES);
	    SubLObject rle = NIL;
	    for (rle = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), rle = cdolist_list_var.first()) {
		{
		    SubLObject denot = cyclifier.rename_variables(methods.funcall_instance_method_with_1_args(cyclifier.rle_lex(rle), GET, $SEMTRANS), cyclifier.frame_renaming(methods.funcall_instance_method_with_1_args(cyclifier.rle_lex(rle), GET, $FRAME)));
		    SubLObject keywords = cyclifier.formula_keywords(denot);
		    SubLObject cdolist_list_var_11 = $list_alt69;
		    SubLObject keyword = NIL;
		    for (keyword = cdolist_list_var_11.first(); NIL != cdolist_list_var_11; cdolist_list_var_11 = cdolist_list_var_11.rest(), keyword = cdolist_list_var_11.first()) {
			if (NIL != subl_promotions.memberP(keyword, keywords, EQ, UNPROVIDED)) {
			    return T;
			}
		    }
		}
	    }
	}
	return NIL;
    }

    /**
     *
     *
     * @return booleanp; t if this is singular, nil otherwise
     */
    @LispMethod(comment = "@return booleanp; t if this is singular, nil otherwise")
    public static SubLObject nominal_word_tree_singular_p_method(final SubLObject self) {
	return list_utilities.sublisp_boolean(member($SINGULAR, methods.funcall_instance_method_with_0_args(self, GET_NUMBER), EQL, UNPROVIDED));
    }

    /**
     *
     *
     * @return booleanp; t if this is singular, nil otherwise
     */
    @LispMethod(comment = "@return booleanp; t if this is singular, nil otherwise")
    public static final SubLObject nominal_word_tree_singular_p_method_alt(SubLObject self) {
	return list_utilities.sublisp_boolean(member($SINGULAR, methods.funcall_instance_method_with_0_args(self, GET_NUMBER), EQL, UNPROVIDED));
    }

    public static SubLObject non_of_prepositional_tree_p(final SubLObject tree) {
	return makeBoolean((NIL != parse_tree.prepositional_tree_p(tree)) && (!methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(tree, GET_HEAD), GET_STRING).equalp($$$of)));
    }

    public static final SubLObject non_of_prepositional_tree_p_alt(SubLObject tree) {
	return makeBoolean((NIL != parse_tree.prepositional_tree_p(tree)) && (!methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(tree, GET_HEAD), GET_STRING).equalp($$$of)));
    }

    /**
     *
     *
     * @return keywordp; the category of PARSE-EXPRESSION
     */
    @LispMethod(comment = "@return keywordp; the category of PARSE-EXPRESSION")
    public static SubLObject parse_expression_category(final SubLObject parse_expression) {
	return parse_expression.first();
    }

    /**
     *
     *
     * @return keywordp; the category of PARSE-EXPRESSION
     */
    @LispMethod(comment = "@return keywordp; the category of PARSE-EXPRESSION")
    public static final SubLObject parse_expression_category_alt(SubLObject parse_expression) {
	return parse_expression.first();
    }

    /**
     *
     *
     * @param WORD-EXPRESSION
    word-expression-p;
     * 		
     * @return word-tree-p; a word tree correspondingto WORD-EXPRESSION
     */
    @LispMethod(comment = "@param WORD-EXPRESSION\nword-expression-p;\r\n\t\t\r\n@return word-tree-p; a word tree correspondingto WORD-EXPRESSION")
    public static SubLObject parse_expression_to_word_tree(final SubLObject word_expression, SubLObject mother, SubLObject index, SubLObject v_context) {
	if (mother == UNPROVIDED) {
	    mother = NIL;
	}
	if (index == UNPROVIDED) {
	    index = NIL;
	}
	if (v_context == UNPROVIDED) {
	    v_context = object.new_class_instance(PARSE_TREE_CONTEXT);
	}
	return new_word_tree(word_expression_string(word_expression), parse_expression_category(word_expression), mother, index, NIL, v_context);
    }

    /**
     *
     *
     * @param WORD-EXPRESSION
    word-expression-p;
     * 		
     * @return word-tree-p; a word tree correspondingto WORD-EXPRESSION
     */
    @LispMethod(comment = "@param WORD-EXPRESSION\nword-expression-p;\r\n\t\t\r\n@return word-tree-p; a word tree correspondingto WORD-EXPRESSION")
    public static final SubLObject parse_expression_to_word_tree_alt(SubLObject word_expression, SubLObject mother, SubLObject index, SubLObject v_context) {
	if (mother == UNPROVIDED) {
	    mother = NIL;
	}
	if (index == UNPROVIDED) {
	    index = NIL;
	}
	if (v_context == UNPROVIDED) {
	    v_context = object.new_class_instance(PARSE_TREE_CONTEXT);
	}
	return com.cyc.cycjava.cycl.word_tree.new_word_tree(com.cyc.cycjava.cycl.word_tree.word_expression_string(word_expression), com.cyc.cycjava.cycl.word_tree.parse_expression_category(word_expression), mother, index, NIL, v_context);
    }

    /**
     *
     *
     * @param LIST-OF-STRINGS
     * 		listp; a list of strings
     * @return booleanp; T is the yield of the tree contains every string
    in LIST-OF-STRINGS, NIL otherwise.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param LIST-OF-STRINGS\r\n\t\tlistp; a list of strings\r\n@return booleanp; T is the yield of the tree contains every string\r\nin LIST-OF-STRINGS, NIL otherwise.\r\n@unknown bertolo")
    public static SubLObject parse_tree_covers_method(final SubLObject self, final SubLObject list_of_strings) {
	final SubLObject yield = methods.funcall_instance_method_with_0_args(self, YIELD);
	SubLObject tree_words = NIL;
	SubLObject fail = NIL;
	SubLObject cdolist_list_var = yield;
	SubLObject tree = NIL;
	tree = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    tree_words = cons(methods.funcall_instance_method_with_0_args(tree, GET_STRING), tree_words);
	    cdolist_list_var = cdolist_list_var.rest();
	    tree = cdolist_list_var.first();
	}
	if (NIL == fail) {
	    SubLObject csome_list_var = list_of_strings;
	    SubLObject v_term = NIL;
	    v_term = csome_list_var.first();
	    while ((NIL == fail) && (NIL != csome_list_var)) {
		SubLObject match = NIL;
		if (NIL == match) {
		    SubLObject csome_list_var_$14 = tree_words;
		    SubLObject word = NIL;
		    word = csome_list_var_$14.first();
		    while ((NIL == match) && (NIL != csome_list_var_$14)) {
			if (v_term.equalp(word)) {
			    match = T;
			}
			csome_list_var_$14 = csome_list_var_$14.rest();
			word = csome_list_var_$14.first();
		    }
		}
		if (NIL == match) {
		    fail = T;
		}
		csome_list_var = csome_list_var.rest();
		v_term = csome_list_var.first();
	    }
	}
	return makeBoolean(NIL == fail);
    }

    /**
     *
     *
     * @param LIST-OF-STRINGS
     * 		listp; a list of strings
     * @return booleanp; T is the yield of the tree contains every string
    in LIST-OF-STRINGS, NIL otherwise.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param LIST-OF-STRINGS\r\n\t\tlistp; a list of strings\r\n@return booleanp; T is the yield of the tree contains every string\r\nin LIST-OF-STRINGS, NIL otherwise.\r\n@unknown bertolo")
    public static final SubLObject parse_tree_covers_method_alt(SubLObject self, SubLObject list_of_strings) {
	{
	    SubLObject yield = methods.funcall_instance_method_with_0_args(self, YIELD);
	    SubLObject tree_words = NIL;
	    SubLObject fail = NIL;
	    SubLObject cdolist_list_var = yield;
	    SubLObject tree = NIL;
	    for (tree = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), tree = cdolist_list_var.first()) {
		tree_words = cons(methods.funcall_instance_method_with_0_args(tree, GET_STRING), tree_words);
	    }
	    if (NIL == fail) {
		{
		    SubLObject csome_list_var = list_of_strings;
		    SubLObject v_term = NIL;
		    for (v_term = csome_list_var.first(); !((NIL != fail) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest(), v_term = csome_list_var.first()) {
			{
			    SubLObject match = NIL;
			    if (NIL == match) {
				{
				    SubLObject csome_list_var_14 = tree_words;
				    SubLObject word = NIL;
				    for (word = csome_list_var_14.first(); !((NIL != match) || (NIL == csome_list_var_14)); csome_list_var_14 = csome_list_var_14.rest(), word = csome_list_var_14.first()) {
					if (v_term.equalp(word)) {
					    match = T;
					}
				    }
				}
			    }
			    if (NIL == match) {
				fail = T;
			    }
			}
		    }
		}
	    }
	    return makeBoolean(NIL == fail);
	}
    }

    /**
     *
     *
     * @param LIST-OF-STRINGS
     * 		listp; a list of strings
     * @return booleanp; T all the subtrees of this tree that cover the
    strings in LIST-OF-STRINGS.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param LIST-OF-STRINGS\r\n\t\tlistp; a list of strings\r\n@return booleanp; T all the subtrees of this tree that cover the\r\nstrings in LIST-OF-STRINGS.\r\n@unknown bertolo")
    public static SubLObject parse_tree_covers_minimally_method(final SubLObject self, final SubLObject list_of_strings) {
	if (NIL == methods.funcall_instance_method_with_1_args(self, COVERS, list_of_strings)) {
	    return NIL;
	}
	SubLObject fail = NIL;
	if (NIL != parse_tree.phrase_tree_p(self)) {
	    final SubLObject vector_var = parse_tree.get_phrase_tree_daughters(self);
	    final SubLObject backwardP_var = NIL;
	    final SubLObject length = length(vector_var);
	    SubLObject current;
	    final SubLObject datum = current = (NIL != backwardP_var) ? list(subtract(length, ONE_INTEGER), MINUS_ONE_INTEGER, MINUS_ONE_INTEGER) : list(ZERO_INTEGER, length, ONE_INTEGER);
	    SubLObject start = NIL;
	    SubLObject end = NIL;
	    SubLObject delta = NIL;
	    destructuring_bind_must_consp(current, datum, $list789);
	    start = current.first();
	    current = current.rest();
	    destructuring_bind_must_consp(current, datum, $list789);
	    end = current.first();
	    current = current.rest();
	    destructuring_bind_must_consp(current, datum, $list789);
	    delta = current.first();
	    current = current.rest();
	    if (NIL == current) {
		if (NIL == fail) {
		    SubLObject end_var;
		    SubLObject element_num;
		    SubLObject daughter;
		    for (end_var = end, element_num = NIL, element_num = start; (NIL == fail) && (NIL == subl_macros.do_numbers_endtest(element_num, delta, end_var)); element_num = add(element_num, delta)) {
			daughter = aref(vector_var, element_num);
			if (NIL != methods.funcall_instance_method_with_1_args(daughter, COVERS, list_of_strings)) {
			    fail = T;
			}
		    }
		}
	    } else {
		cdestructuring_bind_error(datum, $list789);
	    }
	}
	return makeBoolean(NIL == fail);
    }

    /**
     *
     *
     * @param LIST-OF-STRINGS
     * 		listp; a list of strings
     * @return booleanp; T all the subtrees of this tree that cover the
    strings in LIST-OF-STRINGS.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param LIST-OF-STRINGS\r\n\t\tlistp; a list of strings\r\n@return booleanp; T all the subtrees of this tree that cover the\r\nstrings in LIST-OF-STRINGS.\r\n@unknown bertolo")
    public static final SubLObject parse_tree_covers_minimally_method_alt(SubLObject self, SubLObject list_of_strings) {
	if (NIL == methods.funcall_instance_method_with_1_args(self, COVERS, list_of_strings)) {
	    return NIL;
	}
	{
	    SubLObject fail = NIL;
	    if (NIL != parse_tree.phrase_tree_p(self)) {
		{
		    SubLObject vector_var = parse_tree.get_phrase_tree_daughters(self);
		    SubLObject backwardP_var = NIL;
		    SubLObject length = length(vector_var);
		    SubLObject datum = (NIL != backwardP_var) ? ((SubLObject) (list(subtract(length, ONE_INTEGER), MINUS_ONE_INTEGER, MINUS_ONE_INTEGER))) : list(ZERO_INTEGER, length, ONE_INTEGER);
		    SubLObject current = datum;
		    SubLObject start = NIL;
		    SubLObject end = NIL;
		    SubLObject delta = NIL;
		    destructuring_bind_must_consp(current, datum, $list_alt789);
		    start = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt789);
		    end = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt789);
		    delta = current.first();
		    current = current.rest();
		    if (NIL == current) {
			if (NIL == fail) {
			    {
				SubLObject end_var = end;
				SubLObject element_num = NIL;
				for (element_num = start; !((NIL != fail) || (NIL != subl_macros.do_numbers_endtest(element_num, delta, end_var))); element_num = add(element_num, delta)) {
				    {
					SubLObject daughter = aref(vector_var, element_num);
					if (NIL != methods.funcall_instance_method_with_1_args(daughter, COVERS, list_of_strings)) {
					    fail = T;
					}
				    }
				}
			    }
			}
		    } else {
			cdestructuring_bind_error(datum, $list_alt789);
		    }
		}
	    }
	    return makeBoolean(NIL == fail);
	}
    }

    /**
     *
     *
     * @param LIST-OF-STRINGS
     * 		listp; a list of strings
     * @return listp; a list of all the minimal subtrees of this tree that cover the
    strings in LIST-OF-STRINGS.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param LIST-OF-STRINGS\r\n\t\tlistp; a list of strings\r\n@return listp; a list of all the minimal subtrees of this tree that cover the\r\nstrings in LIST-OF-STRINGS.\r\n@unknown bertolo")
    public static SubLObject parse_tree_get_minimally_covering_subtrees_method(final SubLObject self, final SubLObject list_of_strings) {
	SubLObject minimal = NIL;
	final SubLObject queue = queues.create_queue(UNPROVIDED);
	queues.enqueue(self, queue);
	while (NIL == queues.queue_empty_p(queue)) {
	    final SubLObject subtree = queues.dequeue(queue);
	    if (NIL != methods.funcall_instance_method_with_1_args(subtree, COVERS_MINIMALLY, list_of_strings)) {
		minimal = cons(subtree, minimal);
	    } else {
		if ((NIL == methods.funcall_instance_method_with_1_args(subtree, COVERS, list_of_strings)) || (NIL == parse_tree.phrase_tree_p(subtree))) {
		    continue;
		}
		final SubLObject vector_var = parse_tree.get_phrase_tree_daughters(subtree);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject element_num;
		SubLObject daughter;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    daughter = aref(vector_var, element_num);
		    queues.enqueue(daughter, queue);
		}
	    }
	}
	return minimal;
    }

    /**
     *
     *
     * @param LIST-OF-STRINGS
     * 		listp; a list of strings
     * @return listp; a list of all the minimal subtrees of this tree that cover the
    strings in LIST-OF-STRINGS.
     * @unknown bertolo
     */
    @LispMethod(comment = "@param LIST-OF-STRINGS\r\n\t\tlistp; a list of strings\r\n@return listp; a list of all the minimal subtrees of this tree that cover the\r\nstrings in LIST-OF-STRINGS.\r\n@unknown bertolo")
    public static final SubLObject parse_tree_get_minimally_covering_subtrees_method_alt(SubLObject self, SubLObject list_of_strings) {
	{
	    SubLObject minimal = NIL;
	    SubLObject queue = queues.create_queue();
	    queues.enqueue(self, queue);
	    while (NIL == queues.queue_empty_p(queue)) {
		{
		    SubLObject subtree = queues.dequeue(queue);
		    if (NIL != methods.funcall_instance_method_with_1_args(subtree, COVERS_MINIMALLY, list_of_strings)) {
			minimal = cons(subtree, minimal);
		    } else {
			if ((NIL != methods.funcall_instance_method_with_1_args(subtree, COVERS, list_of_strings)) && (NIL != parse_tree.phrase_tree_p(subtree))) {
			    {
				SubLObject vector_var = parse_tree.get_phrase_tree_daughters(subtree);
				SubLObject backwardP_var = NIL;
				SubLObject length = length(vector_var);
				SubLObject v_iteration = NIL;
				for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
				    {
					SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
					SubLObject daughter = aref(vector_var, element_num);
					queues.enqueue(daughter, queue);
				    }
				}
			    }
			}
		    }
		}
	    }
	    return minimal;
	}
    }

    public static SubLObject particle_word_tree_p(final SubLObject particle_word_tree) {
	return classes.subloop_instanceof_class(particle_word_tree, PARTICLE_WORD_TREE);
    }

    public static final SubLObject particle_word_tree_p_alt(SubLObject particle_word_tree) {
	return classes.subloop_instanceof_class(particle_word_tree, PARTICLE_WORD_TREE);
    }

    /**
     *
     *
     * @return listp; the list of parse-expression daughters of PARSE-EXPRESSION
     */
    @LispMethod(comment = "@return listp; the list of parse-expression daughters of PARSE-EXPRESSION")
    public static SubLObject phrase_expression_daughters(final SubLObject phrase_expression) {
	return phrase_expression.rest();
    }

    /**
     *
     *
     * @return listp; the list of parse-expression daughters of PARSE-EXPRESSION
     */
    @LispMethod(comment = "@return listp; the list of parse-expression daughters of PARSE-EXPRESSION")
    public static final SubLObject phrase_expression_daughters_alt(SubLObject phrase_expression) {
	return phrase_expression.rest();
    }

    /**
     *
     *
     * @return boolean; t if PARSE-EXPRESSION is a phrase expression, nil otherwise
     */
    @LispMethod(comment = "@return boolean; t if PARSE-EXPRESSION is a phrase expression, nil otherwise")
    public static SubLObject phrase_expression_p(final SubLObject parse_expression) {
	return listp(second(parse_expression));
    }

    /**
     *
     *
     * @return boolean; t if PARSE-EXPRESSION is a phrase expression, nil otherwise
     */
    @LispMethod(comment = "@return boolean; t if PARSE-EXPRESSION is a phrase expression, nil otherwise")
    public static final SubLObject phrase_expression_p_alt(SubLObject parse_expression) {
	return listp(second(parse_expression));
    }

    /**
     *
     *
     * @return booleanp; t if this phrase is a coordination, nil otherwise
     */
    @LispMethod(comment = "@return booleanp; t if this phrase is a coordination, nil otherwise")
    public static SubLObject phrase_tree_coordinate_phrase_p_method(final SubLObject self) {
	return list_utilities.sublisp_boolean(methods.funcall_instance_method_with_0_args(self, GET_CONJUNCTION));
    }

    /**
     *
     *
     * @return booleanp; t if this phrase is a coordination, nil otherwise
     */
    @LispMethod(comment = "@return booleanp; t if this phrase is a coordination, nil otherwise")
    public static final SubLObject phrase_tree_coordinate_phrase_p_method_alt(SubLObject self) {
	return list_utilities.sublisp_boolean(methods.funcall_instance_method_with_0_args(self, GET_CONJUNCTION));
    }

    /**
     *
     *
     * @return listp; a list of all complements of this tree, in surface order
     */
    @LispMethod(comment = "@return listp; a list of all complements of this tree, in surface order")
    public static SubLObject possessive_word_tree_get_complements_method(final SubLObject self) {
	SubLObject complements = NIL;
	final SubLObject possessor = methods.funcall_instance_method_with_0_args(self, GET_POSSESSOR);
	final SubLObject possessed = methods.funcall_instance_method_with_0_args(self, GET_POSSESSED);
	if (NIL != possessed) {
	    complements = cons(possessed, complements);
	}
	if (NIL != possessor) {
	    complements = cons(possessor, complements);
	}
	return complements;
    }

    /**
     *
     *
     * @return listp; a list of all complements of this tree, in surface order
     */
    @LispMethod(comment = "@return listp; a list of all complements of this tree, in surface order")
    public static final SubLObject possessive_word_tree_get_complements_method_alt(SubLObject self) {
	{
	    SubLObject complements = NIL;
	    SubLObject possessor = methods.funcall_instance_method_with_0_args(self, GET_POSSESSOR);
	    SubLObject possessed = methods.funcall_instance_method_with_0_args(self, GET_POSSESSED);
	    if (NIL != possessed) {
		complements = cons(possessed, complements);
	    }
	    if (NIL != possessor) {
		complements = cons(possessor, complements);
	    }
	    return complements;
	}
    }

    public static SubLObject possessive_word_tree_get_keyword_renamings_method(final SubLObject self, SubLObject keywords) {
	if (keywords == UNPROVIDED) {
	    keywords = $list750;
	}
	SubLObject conjuncts = NIL;
	final SubLObject possessor = methods.funcall_instance_method_with_0_args(self, GET_POSSESSOR);
	final SubLObject possessed = methods.funcall_instance_method_with_0_args(self, GET_POSSESSED);
	if ((NIL != possessor) && (NIL != member($POSSESSOR, keywords, EQL, UNPROVIDED))) {
	    conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($POSSESSOR, possessor), conjuncts);
	}
	if ((NIL != possessed) && (NIL != member($POSSESSED, keywords, EQL, UNPROVIDED))) {
	    conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($POSSESSED, possessed), conjuncts);
	}
	return cyclifier_interface.disjunctive_keyword_renamings(conjuncts, NIL);
    }

    public static final SubLObject possessive_word_tree_get_keyword_renamings_method_alt(SubLObject self, SubLObject keywords) {
	if (keywords == UNPROVIDED) {
	    keywords = $list_alt750;
	}
	{
	    SubLObject conjuncts = NIL;
	    SubLObject possessor = methods.funcall_instance_method_with_0_args(self, GET_POSSESSOR);
	    SubLObject possessed = methods.funcall_instance_method_with_0_args(self, GET_POSSESSED);
	    if ((NIL != possessor) && (NIL != member($POSSESSOR, keywords, EQL, UNPROVIDED))) {
		conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($POSSESSOR, possessor), conjuncts);
	    }
	    if ((NIL != possessed) && (NIL != member($POSSESSED, keywords, EQL, UNPROVIDED))) {
		conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($POSSESSED, possessed), conjuncts);
	    }
	    return cyclifier_interface.disjunctive_keyword_renamings(conjuncts, NIL);
	}
    }

    /**
     *
     *
     * @return listp; the constituents this possessive marker modifies
     */
    @LispMethod(comment = "@return listp; the constituents this possessive marker modifies")
    public static SubLObject possessive_word_tree_get_modifieds_method(final SubLObject self) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject catch_var_for_possessive_word_tree_method = NIL;
	final SubLObject mother = parse_tree.get_parse_tree_mother(self);
	try {
	    thread.throwStack.push($sym764$OUTER_CATCH_FOR_POSSESSIVE_WORD_TREE_METHOD);
	    try {
		if (NIL != mother) {
		    final SubLObject candidate = methods.funcall_instance_method_with_0_args(self, GET_POSSESSED);
		    if ((NIL != candidate) && (NIL == subl_promotions.memberP(mother, methods.funcall_instance_method_with_0_args(candidate, GET_COMPLEMENTS), EQ, UNPROVIDED))) {
			sublisp_throw($sym764$OUTER_CATCH_FOR_POSSESSIVE_WORD_TREE_METHOD, list(candidate));
		    }
		}
	    } finally {
		final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    parse_tree.set_parse_tree_mother(self, mother);
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
		}
	    }
	} catch (final Throwable ccatch_env_var) {
	    catch_var_for_possessive_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym764$OUTER_CATCH_FOR_POSSESSIVE_WORD_TREE_METHOD);
	} finally {
	    thread.throwStack.pop();
	}
	return catch_var_for_possessive_word_tree_method;
    }

    /**
     *
     *
     * @return listp; the constituents this possessive marker modifies
     */
    @LispMethod(comment = "@return listp; the constituents this possessive marker modifies")
    public static final SubLObject possessive_word_tree_get_modifieds_method_alt(SubLObject self) {
	{
	    SubLObject catch_var_for_possessive_word_tree_method = NIL;
	    SubLObject mother = parse_tree.get_parse_tree_mother(self);
	    try {
		try {
		    if (NIL != mother) {
			{
			    SubLObject candidate = methods.funcall_instance_method_with_0_args(self, GET_POSSESSED);
			    if (NIL != candidate) {
				if (NIL == subl_promotions.memberP(mother, methods.funcall_instance_method_with_0_args(candidate, GET_COMPLEMENTS), EQ, UNPROVIDED)) {
				    sublisp_throw($sym764$OUTER_CATCH_FOR_POSSESSIVE_WORD_TREE_METHOD, list(candidate));
				}
			    }
			}
		    }
		} finally {
		    {
			SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
			try {
			    bind($is_thread_performing_cleanupP$, T);
			    parse_tree.set_parse_tree_mother(self, mother);
			} finally {
			    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
			}
		    }
		}
	    } catch (Throwable ccatch_env_var) {
		catch_var_for_possessive_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym764$OUTER_CATCH_FOR_POSSESSIVE_WORD_TREE_METHOD);
	    }
	    return catch_var_for_possessive_word_tree_method;
	}
    }

    /**
     *
     *
     * @return nominal-word-tree-p; the word that is the possessed in this possessive relation
     */
    @LispMethod(comment = "@return nominal-word-tree-p; the word that is the possessed in this possessive relation")
    public static SubLObject possessive_word_tree_get_possessed_method(final SubLObject self) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject catch_var_for_possessive_word_tree_method = NIL;
	final SubLObject mother = parse_tree.get_parse_tree_mother(self);
	try {
	    thread.throwStack.push($sym759$OUTER_CATCH_FOR_POSSESSIVE_WORD_TREE_METHOD);
	    try {
		final SubLObject grandmother = (NIL != mother) ? methods.funcall_instance_method_with_0_args(mother, GET_MOTHER) : NIL;
		final SubLObject grandmother_head = (NIL != parse_tree.nominal_phrase_tree_p(grandmother)) ? methods.funcall_instance_method_with_0_args(grandmother, GET_HEAD) : NIL;
		sublisp_throw($sym759$OUTER_CATCH_FOR_POSSESSIVE_WORD_TREE_METHOD, NIL != grandmother_head ? grandmother_head : NIL);
	    } finally {
		final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    parse_tree.set_parse_tree_mother(self, mother);
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
		}
	    }
	} catch (final Throwable ccatch_env_var) {
	    catch_var_for_possessive_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym759$OUTER_CATCH_FOR_POSSESSIVE_WORD_TREE_METHOD);
	} finally {
	    thread.throwStack.pop();
	}
	return catch_var_for_possessive_word_tree_method;
    }

    /**
     *
     *
     * @return nominal-word-tree-p; the word that is the possessed in this possessive relation
     */
    @LispMethod(comment = "@return nominal-word-tree-p; the word that is the possessed in this possessive relation")
    public static final SubLObject possessive_word_tree_get_possessed_method_alt(SubLObject self) {
	{
	    SubLObject catch_var_for_possessive_word_tree_method = NIL;
	    SubLObject mother = parse_tree.get_parse_tree_mother(self);
	    try {
		try {
		    {
			SubLObject grandmother = (NIL != mother) ? ((SubLObject) (methods.funcall_instance_method_with_0_args(mother, GET_MOTHER))) : NIL;
			SubLObject grandmother_head = (NIL != parse_tree.nominal_phrase_tree_p(grandmother)) ? ((SubLObject) (methods.funcall_instance_method_with_0_args(grandmother, GET_HEAD))) : NIL;
			sublisp_throw($sym759$OUTER_CATCH_FOR_POSSESSIVE_WORD_TREE_METHOD, NIL != grandmother_head ? ((SubLObject) (grandmother_head)) : NIL);
		    }
		} finally {
		    {
			SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
			try {
			    bind($is_thread_performing_cleanupP$, T);
			    parse_tree.set_parse_tree_mother(self, mother);
			} finally {
			    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
			}
		    }
		}
	    } catch (Throwable ccatch_env_var) {
		catch_var_for_possessive_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym759$OUTER_CATCH_FOR_POSSESSIVE_WORD_TREE_METHOD);
	    }
	    return catch_var_for_possessive_word_tree_method;
	}
    }

    /**
     *
     *
     * @return nominal-word-tree-p; the word that is the possessor in this possessive relation
     */
    @LispMethod(comment = "@return nominal-word-tree-p; the word that is the possessor in this possessive relation")
    public static SubLObject possessive_word_tree_get_possessor_method(final SubLObject self) {
	final SubLObject possessor = methods.funcall_instance_method_with_1_args(self, GET_SISTER, MINUS_ONE_INTEGER);
	return NIL != possessor ? possessor : NIL;
    }

    /**
     *
     *
     * @return nominal-word-tree-p; the word that is the possessor in this possessive relation
     */
    @LispMethod(comment = "@return nominal-word-tree-p; the word that is the possessor in this possessive relation")
    public static final SubLObject possessive_word_tree_get_possessor_method_alt(SubLObject self) {
	{
	    SubLObject possessor = methods.funcall_instance_method_with_1_args(self, GET_SISTER, MINUS_ONE_INTEGER);
	    return NIL != possessor ? ((SubLObject) (possessor)) : NIL;
	}
    }

    public static SubLObject possessive_word_tree_p(final SubLObject possessive_word_tree) {
	return classes.subloop_instanceof_class(possessive_word_tree, POSSESSIVE_WORD_TREE);
    }

    public static final SubLObject possessive_word_tree_p_alt(SubLObject possessive_word_tree) {
	return classes.subloop_instanceof_class(possessive_word_tree, POSSESSIVE_WORD_TREE);
    }

    /**
     *
     *
     * @return parse-tree-p; the tree that serves as an antecedent to this wh word
     */
    @LispMethod(comment = "@return parse-tree-p; the tree that serves as an antecedent to this wh word")
    public static SubLObject prepositional_or_particle_word_tree_get_antecedent_method(final SubLObject self) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject catch_var_for_prepositional_or_particle_word_tree_method = NIL;
	final SubLObject mother = parse_tree.get_parse_tree_mother(self);
	final SubLObject string = parse_tree.get_parse_tree_string(self);
	try {
	    thread.throwStack.push($sym683$OUTER_CATCH_FOR_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_METHOD);
	    try {
		if (string.equalp($$$that)) {
		    final SubLObject grandmother = (NIL != mother) ? methods.funcall_instance_method_with_0_args(mother, GET_MOTHER) : NIL;
		    if (NIL != parse_tree.np_tree_p(grandmother)) {
			sublisp_throw($sym683$OUTER_CATCH_FOR_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_METHOD, methods.funcall_instance_method_with_0_args(grandmother, GET_HEAD));
		    }
		}
	    } finally {
		final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    parse_tree.set_parse_tree_mother(self, mother);
		    parse_tree.set_parse_tree_string(self, string);
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
		}
	    }
	} catch (final Throwable ccatch_env_var) {
	    catch_var_for_prepositional_or_particle_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym683$OUTER_CATCH_FOR_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_METHOD);
	} finally {
	    thread.throwStack.pop();
	}
	return catch_var_for_prepositional_or_particle_word_tree_method;
    }

    /**
     *
     *
     * @return parse-tree-p; the tree that serves as an antecedent to this wh word
     */
    @LispMethod(comment = "@return parse-tree-p; the tree that serves as an antecedent to this wh word")
    public static final SubLObject prepositional_or_particle_word_tree_get_antecedent_method_alt(SubLObject self) {
	{
	    SubLObject catch_var_for_prepositional_or_particle_word_tree_method = NIL;
	    SubLObject mother = parse_tree.get_parse_tree_mother(self);
	    SubLObject string = parse_tree.get_parse_tree_string(self);
	    try {
		try {
		    if (string.equalp($$$that)) {
			{
			    SubLObject grandmother = (NIL != mother) ? ((SubLObject) (methods.funcall_instance_method_with_0_args(mother, GET_MOTHER))) : NIL;
			    if (NIL != parse_tree.np_tree_p(grandmother)) {
				sublisp_throw($sym683$OUTER_CATCH_FOR_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_METHOD, methods.funcall_instance_method_with_0_args(grandmother, GET_HEAD));
			    }
			}
		    }
		} finally {
		    {
			SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
			try {
			    bind($is_thread_performing_cleanupP$, T);
			    parse_tree.set_parse_tree_mother(self, mother);
			    parse_tree.set_parse_tree_string(self, string);
			} finally {
			    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
			}
		    }
		}
	    } catch (Throwable ccatch_env_var) {
		catch_var_for_prepositional_or_particle_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym683$OUTER_CATCH_FOR_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_METHOD);
	    }
	    return catch_var_for_prepositional_or_particle_word_tree_method;
	}
    }

    /**
     *
     *
     * @return nominal-tree-p; the complements of this preposition
     */
    @LispMethod(comment = "@return nominal-tree-p; the complements of this preposition")
    public static SubLObject prepositional_or_particle_word_tree_get_complements_method(final SubLObject self) {
	final SubLObject modifieds = methods.funcall_instance_method_with_0_args(self, GET_MODIFIEDS);
	final SubLObject sister = methods.funcall_instance_method_with_1_args(self, GET_SISTER, ONE_INTEGER);
	if ((NIL != sister) && ((NIL != parse_tree.nominal_tree_p(sister)) || (NIL != parse_tree.sentential_tree_p(sister)))) {
	    return append(modifieds, list(sister));
	}
	SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, GET_ANCESTORS);
	SubLObject ancestor = NIL;
	ancestor = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    if (((NIL != parse_tree.sbar_tree_p(ancestor)) || (NIL != parse_tree.sbarq_tree_p(ancestor))) && (NIL != parse_tree.whnp_tree_p(methods.funcall_instance_method_with_1_args(ancestor, GET_DAUGHTER, ZERO_INTEGER)))) {
		return append(modifieds, list(methods.funcall_instance_method_with_1_args(ancestor, GET_DAUGHTER, ZERO_INTEGER)));
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    ancestor = cdolist_list_var.first();
	}
	return NIL;
    }

    /**
     *
     *
     * @return nominal-tree-p; the complements of this preposition
     */
    @LispMethod(comment = "@return nominal-tree-p; the complements of this preposition")
    public static final SubLObject prepositional_or_particle_word_tree_get_complements_method_alt(SubLObject self) {
	{
	    SubLObject modifieds = methods.funcall_instance_method_with_0_args(self, GET_MODIFIEDS);
	    SubLObject sister = methods.funcall_instance_method_with_1_args(self, GET_SISTER, ONE_INTEGER);
	    if ((NIL != sister) && ((NIL != parse_tree.nominal_tree_p(sister)) || (NIL != parse_tree.sentential_tree_p(sister)))) {
		return append(modifieds, list(sister));
	    }
	    {
		SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, GET_ANCESTORS);
		SubLObject ancestor = NIL;
		for (ancestor = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), ancestor = cdolist_list_var.first()) {
		    if (((NIL != parse_tree.sbar_tree_p(ancestor)) || (NIL != parse_tree.sbarq_tree_p(ancestor))) && (NIL != parse_tree.whnp_tree_p(methods.funcall_instance_method_with_1_args(ancestor, GET_DAUGHTER, ZERO_INTEGER)))) {
			return append(modifieds, list(methods.funcall_instance_method_with_1_args(ancestor, GET_DAUGHTER, ZERO_INTEGER)));
		    }
		}
	    }
	}
	return NIL;
    }

    public static SubLObject prepositional_or_particle_word_tree_get_keyword_renamings_method(final SubLObject self, SubLObject keywords) {
	if (keywords == UNPROVIDED) {
	    keywords = $list663;
	}
	if (!methods.funcall_instance_method_with_0_args(self, GET_STRING).equalp($$$that)) {
	    SubLObject conjuncts = NIL;
	    final SubLObject modified = methods.funcall_instance_method_with_0_args(self, GET_MODIFIEDS).first();
	    final SubLObject complement = methods.funcall_instance_method_with_0_args(self, GET_OBLIQUE_OBJECT);
	    final SubLObject clause = methods.funcall_instance_method_with_0_args(self, GET_VERBAL_COMPLEMENT);
	    if (((NIL != modified) && (NIL != member($NOUN, keywords, EQL, UNPROVIDED))) && (NIL != cyclifier_interface.nominal_word_p(modified))) {
		conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($NOUN, modified), conjuncts);
	    }
	    if (((NIL != modified) && (NIL != member($ACTION, keywords, EQL, UNPROVIDED))) && (NIL != cyclifier_interface.verbal_word_p(modified))) {
		conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($ACTION, modified), conjuncts);
	    }
	    if ((NIL != complement) && (NIL != member($OBJECT, keywords, EQL, UNPROVIDED))) {
		conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($OBJECT, complement), conjuncts);
	    }
	    if ((NIL != clause) && (NIL != member($CLAUSE, keywords, EQL, UNPROVIDED))) {
		conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($CLAUSE, clause), conjuncts);
	    }
	    return cyclifier_interface.disjunctive_keyword_renamings(conjuncts, NIL);
	}
	return NIL;
    }

    public static final SubLObject prepositional_or_particle_word_tree_get_keyword_renamings_method_alt(SubLObject self, SubLObject keywords) {
	if (keywords == UNPROVIDED) {
	    keywords = $list_alt663;
	}
	if (!methods.funcall_instance_method_with_0_args(self, GET_STRING).equalp($$$that)) {
	    {
		SubLObject conjuncts = NIL;
		SubLObject modified = methods.funcall_instance_method_with_0_args(self, GET_MODIFIEDS).first();
		SubLObject complement = methods.funcall_instance_method_with_0_args(self, GET_OBLIQUE_OBJECT);
		SubLObject clause = methods.funcall_instance_method_with_0_args(self, GET_VERBAL_COMPLEMENT);
		if (((NIL != modified) && (NIL != member($NOUN, keywords, EQL, UNPROVIDED))) && (NIL != cyclifier_interface.nominal_word_p(modified))) {
		    conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($NOUN, modified), conjuncts);
		}
		if (((NIL != modified) && (NIL != member($ACTION, keywords, EQL, UNPROVIDED))) && (NIL != cyclifier_interface.verbal_word_p(modified))) {
		    conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($ACTION, modified), conjuncts);
		}
		if ((NIL != complement) && (NIL != member($OBJECT, keywords, EQL, UNPROVIDED))) {
		    conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($OBJECT, complement), conjuncts);
		}
		if ((NIL != clause) && (NIL != member($CLAUSE, keywords, EQL, UNPROVIDED))) {
		    conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($CLAUSE, clause), conjuncts);
		}
		return cyclifier_interface.disjunctive_keyword_renamings(conjuncts, NIL);
	    }
	}
	return NIL;
    }

    /**
     *
     *
     * @return listp; a list of trees this preposition modifies
     */
    @LispMethod(comment = "@return listp; a list of trees this preposition modifies")
    public static SubLObject prepositional_or_particle_word_tree_get_modifieds_method(final SubLObject self) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject catch_var_for_prepositional_or_particle_word_tree_method = NIL;
	final SubLObject mother = parse_tree.get_parse_tree_mother(self);
	try {
	    thread.throwStack.push($sym676$OUTER_CATCH_FOR_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_METHOD);
	    try {
		SubLObject complements = NIL;
		SubLObject candidates = NIL;
		final SubLObject grandmother = methods.funcall_instance_method_with_0_args(mother, GET_MOTHER);
		final SubLObject grandmother_head = (NIL != grandmother) ? methods.funcall_instance_method_with_0_args(grandmother, GET_HEAD) : NIL;
		final SubLObject sister = methods.funcall_instance_method_with_1_args(mother, GET_SISTER, ONE_INTEGER);
		if ((((NIL != parse_tree.whpp_tree_p(mother)) && (NIL != parse_tree.question_tree_p(grandmother))) && (NIL != sister)) && (NIL != parse_tree.sq_tree_p(sister))) {
		    final SubLObject last_phrase = methods.funcall_instance_method_with_1_args(sister, FIND_LAST, PHRASE_TREE_P);
		    if (NIL != last_phrase) {
			candidates = methods.funcall_instance_method_with_0_args(last_phrase, GET_HEADS);
		    }
		} else if (NIL != grandmother_head) {
		    candidates = (((NIL != aux_verb_tree_p(grandmother_head)) && (NIL != methods.funcall_instance_method_with_0_args(grandmother_head, GET_SUBJECT)))
			    && (NIL != methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(grandmother_head, GET_SUBJECT), GET_HEAD)))
				    ? list(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(grandmother_head, GET_SUBJECT), GET_HEAD))
				    : NIL != adjectival_word_tree_p(grandmother_head) ? NIL : grandmother_head.eql(self) ? NIL : list(grandmother_head);
		}

		SubLObject cdolist_list_var = candidates;
		SubLObject candidate = NIL;
		candidate = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
		    SubLObject cdolist_list_var_$13 = methods.funcall_instance_method_with_0_args(candidate, GET_COMPLEMENTS);
		    SubLObject complement = NIL;
		    complement = cdolist_list_var_$13.first();
		    while (NIL != cdolist_list_var_$13) {
			if (complement.eql(methods.funcall_instance_method_with_0_args(self, GET_OBLIQUE_OBJECT))) {
			    complements = cons(candidate, complements);
			}
			cdolist_list_var_$13 = cdolist_list_var_$13.rest();
			complement = cdolist_list_var_$13.first();
		    }
		    cdolist_list_var = cdolist_list_var.rest();
		    candidate = cdolist_list_var.first();
		}
		sublisp_throw($sym676$OUTER_CATCH_FOR_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_METHOD, set_difference(candidates, complements, UNPROVIDED, UNPROVIDED));
	    } finally {
		final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    parse_tree.set_parse_tree_mother(self, mother);
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
		}
	    }
	} catch (final Throwable ccatch_env_var) {
	    catch_var_for_prepositional_or_particle_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym676$OUTER_CATCH_FOR_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_METHOD);
	} finally {
	    thread.throwStack.pop();
	}
	return catch_var_for_prepositional_or_particle_word_tree_method;
    }

    /**
     *
     *
     * @return listp; a list of trees this preposition modifies
     */
    @LispMethod(comment = "@return listp; a list of trees this preposition modifies")
    public static final SubLObject prepositional_or_particle_word_tree_get_modifieds_method_alt(SubLObject self) {
	{
	    SubLObject catch_var_for_prepositional_or_particle_word_tree_method = NIL;
	    SubLObject mother = parse_tree.get_parse_tree_mother(self);
	    try {
		try {
		    {
			SubLObject complements = NIL;
			SubLObject candidates = NIL;
			SubLObject grandmother = methods.funcall_instance_method_with_0_args(mother, GET_MOTHER);
			SubLObject grandmother_head = (NIL != grandmother) ? ((SubLObject) (methods.funcall_instance_method_with_0_args(grandmother, GET_HEAD))) : NIL;
			SubLObject sister = methods.funcall_instance_method_with_1_args(mother, GET_SISTER, ONE_INTEGER);
			if ((((NIL != parse_tree.whpp_tree_p(mother)) && (NIL != parse_tree.question_tree_p(grandmother))) && (NIL != sister)) && (NIL != parse_tree.sq_tree_p(sister))) {
			    {
				SubLObject last_phrase = methods.funcall_instance_method_with_1_args(sister, FIND_LAST, PHRASE_TREE_P);
				if (NIL != last_phrase) {
				    candidates = methods.funcall_instance_method_with_0_args(last_phrase, GET_HEADS);
				}
			    }
			} else {
			    if (NIL != grandmother_head) {
				candidates = (((NIL != com.cyc.cycjava.cycl.word_tree.aux_verb_tree_p(grandmother_head)) && (NIL != methods.funcall_instance_method_with_0_args(grandmother_head, GET_SUBJECT)))
					&& (NIL != methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(grandmother_head, GET_SUBJECT), GET_HEAD)))
						? ((SubLObject) (list(methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(grandmother_head, GET_SUBJECT), GET_HEAD))))
						: NIL != com.cyc.cycjava.cycl.word_tree.adjectival_word_tree_p(grandmother_head) ? ((SubLObject) (NIL)) : grandmother_head == self ? ((SubLObject) (NIL)) : list(grandmother_head);
			    }
			}
			{
			    SubLObject cdolist_list_var = candidates;
			    SubLObject candidate = NIL;
			    for (candidate = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), candidate = cdolist_list_var.first()) {
				{
				    SubLObject cdolist_list_var_13 = methods.funcall_instance_method_with_0_args(candidate, GET_COMPLEMENTS);
				    SubLObject complement = NIL;
				    for (complement = cdolist_list_var_13.first(); NIL != cdolist_list_var_13; cdolist_list_var_13 = cdolist_list_var_13.rest(), complement = cdolist_list_var_13.first()) {
					if (complement == methods.funcall_instance_method_with_0_args(self, GET_OBLIQUE_OBJECT)) {
					    complements = cons(candidate, complements);
					}
				    }
				}
			    }
			}
			sublisp_throw($sym676$OUTER_CATCH_FOR_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_METHOD, set_difference(candidates, complements, UNPROVIDED, UNPROVIDED));
		    }
		} finally {
		    {
			SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
			try {
			    bind($is_thread_performing_cleanupP$, T);
			    parse_tree.set_parse_tree_mother(self, mother);
			} finally {
			    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
			}
		    }
		}
	    } catch (Throwable ccatch_env_var) {
		catch_var_for_prepositional_or_particle_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym676$OUTER_CATCH_FOR_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_METHOD);
	    }
	    return catch_var_for_prepositional_or_particle_word_tree_method;
	}
    }

    /**
     *
     *
     * @return nominal-tree-p; the singleton lists of complements of this preposition
     */
    @LispMethod(comment = "@return nominal-tree-p; the singleton lists of complements of this preposition")
    public static SubLObject prepositional_or_particle_word_tree_get_oblique_object_method(final SubLObject self) {
	final SubLObject sister = methods.funcall_instance_method_with_1_args(self, GET_SISTER, ONE_INTEGER);
	if ((NIL != sister) && ((NIL != parse_tree.nominal_tree_p(sister)) || (NIL != parse_tree.sentential_tree_p(sister)))) {
	    return sister;
	}
	SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, GET_ANCESTORS);
	SubLObject ancestor = NIL;
	ancestor = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    if (((NIL != parse_tree.sbar_tree_p(ancestor)) || (NIL != parse_tree.sbarq_tree_p(ancestor))) && (NIL != parse_tree.whnp_tree_p(methods.funcall_instance_method_with_1_args(ancestor, GET_DAUGHTER, ZERO_INTEGER)))) {
		return methods.funcall_instance_method_with_1_args(ancestor, GET_DAUGHTER, ZERO_INTEGER);
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    ancestor = cdolist_list_var.first();
	}
	return NIL;
    }

    /**
     *
     *
     * @return nominal-tree-p; the singleton lists of complements of this preposition
     */
    @LispMethod(comment = "@return nominal-tree-p; the singleton lists of complements of this preposition")
    public static final SubLObject prepositional_or_particle_word_tree_get_oblique_object_method_alt(SubLObject self) {
	{
	    SubLObject sister = methods.funcall_instance_method_with_1_args(self, GET_SISTER, ONE_INTEGER);
	    if ((NIL != sister) && ((NIL != parse_tree.nominal_tree_p(sister)) || (NIL != parse_tree.sentential_tree_p(sister)))) {
		return sister;
	    }
	    {
		SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, GET_ANCESTORS);
		SubLObject ancestor = NIL;
		for (ancestor = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), ancestor = cdolist_list_var.first()) {
		    if (((NIL != parse_tree.sbar_tree_p(ancestor)) || (NIL != parse_tree.sbarq_tree_p(ancestor))) && (NIL != parse_tree.whnp_tree_p(methods.funcall_instance_method_with_1_args(ancestor, GET_DAUGHTER, ZERO_INTEGER)))) {
			return methods.funcall_instance_method_with_1_args(ancestor, GET_DAUGHTER, ZERO_INTEGER);
		    }
		}
	    }
	}
	return NIL;
    }

    /**
     *
     *
     * @return listp; the unique referents of this word
     */
    @LispMethod(comment = "@return listp; the unique referents of this word")
    public static SubLObject prepositional_or_particle_word_tree_get_refs_method(final SubLObject self) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject catch_var_for_prepositional_or_particle_word_tree_method = NIL;
	final SubLObject string = parse_tree.get_parse_tree_string(self);
	try {
	    thread.throwStack.push($sym680$OUTER_CATCH_FOR_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_METHOD);
	    try {
		SubLObject comp_refs = NIL;
		if (string.equalp($$$of)) {
		    SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(self, GET_OBLIQUE_OBJECT), GET_REFS);
		    SubLObject ref = NIL;
		    ref = cdolist_list_var.first();
		    while (NIL != cdolist_list_var) {
			comp_refs = cons(ref, comp_refs);
			cdolist_list_var = cdolist_list_var.rest();
			ref = cdolist_list_var.first();
		    }
		    set_word_tree_refs(self, comp_refs);
		}
		sublisp_throw($sym680$OUTER_CATCH_FOR_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_METHOD, get_word_tree_refs(self));
	    } finally {
		final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    parse_tree.set_parse_tree_string(self, string);
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
		}
	    }
	} catch (final Throwable ccatch_env_var) {
	    catch_var_for_prepositional_or_particle_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym680$OUTER_CATCH_FOR_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_METHOD);
	} finally {
	    thread.throwStack.pop();
	}
	return catch_var_for_prepositional_or_particle_word_tree_method;
    }

    /**
     *
     *
     * @return listp; the unique referents of this word
     */
    @LispMethod(comment = "@return listp; the unique referents of this word")
    public static final SubLObject prepositional_or_particle_word_tree_get_refs_method_alt(SubLObject self) {
	{
	    SubLObject catch_var_for_prepositional_or_particle_word_tree_method = NIL;
	    SubLObject string = parse_tree.get_parse_tree_string(self);
	    try {
		try {
		    {
			SubLObject comp_refs = NIL;
			if (string.equalp($$$of)) {
			    {
				SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_0_args(self, GET_OBLIQUE_OBJECT), GET_REFS);
				SubLObject ref = NIL;
				for (ref = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), ref = cdolist_list_var.first()) {
				    comp_refs = cons(ref, comp_refs);
				}
			    }
			    com.cyc.cycjava.cycl.word_tree.set_word_tree_refs(self, comp_refs);
			}
			sublisp_throw($sym680$OUTER_CATCH_FOR_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_METHOD, com.cyc.cycjava.cycl.word_tree.get_word_tree_refs(self));
		    }
		} finally {
		    {
			SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
			try {
			    bind($is_thread_performing_cleanupP$, T);
			    parse_tree.set_parse_tree_string(self, string);
			} finally {
			    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
			}
		    }
		}
	    } catch (Throwable ccatch_env_var) {
		catch_var_for_prepositional_or_particle_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym680$OUTER_CATCH_FOR_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_METHOD);
	    }
	    return catch_var_for_prepositional_or_particle_word_tree_method;
	}
    }

    /**
     *
     *
     * @return verbal-tree-p; the verbal complement of this preposition or particle
     */
    @LispMethod(comment = "@return verbal-tree-p; the verbal complement of this preposition or particle")
    public static SubLObject prepositional_or_particle_word_tree_get_verbal_complement_method(final SubLObject self) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject catch_var_for_prepositional_or_particle_word_tree_method = NIL;
	final SubLObject idx = parse_tree.get_parse_tree_idx(self);
	final SubLObject mother = parse_tree.get_parse_tree_mother(self);
	try {
	    thread.throwStack.push($sym670$OUTER_CATCH_FOR_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_METHOD);
	    try {
		sublisp_throw($sym670$OUTER_CATCH_FOR_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_METHOD, methods.funcall_instance_method_with_2_args(mother, FIND_FIRST, VERBAL_TREE_P, number_utilities.f_1X(idx)));
	    } finally {
		final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    parse_tree.set_parse_tree_idx(self, idx);
		    parse_tree.set_parse_tree_mother(self, mother);
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
		}
	    }
	} catch (final Throwable ccatch_env_var) {
	    catch_var_for_prepositional_or_particle_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym670$OUTER_CATCH_FOR_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_METHOD);
	} finally {
	    thread.throwStack.pop();
	}
	return catch_var_for_prepositional_or_particle_word_tree_method;
    }

    /**
     *
     *
     * @return verbal-tree-p; the verbal complement of this preposition or particle
     */
    @LispMethod(comment = "@return verbal-tree-p; the verbal complement of this preposition or particle")
    public static final SubLObject prepositional_or_particle_word_tree_get_verbal_complement_method_alt(SubLObject self) {
	{
	    SubLObject catch_var_for_prepositional_or_particle_word_tree_method = NIL;
	    SubLObject idx = parse_tree.get_parse_tree_idx(self);
	    SubLObject mother = parse_tree.get_parse_tree_mother(self);
	    try {
		try {
		    sublisp_throw($sym670$OUTER_CATCH_FOR_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_METHOD, methods.funcall_instance_method_with_2_args(mother, FIND_FIRST, VERBAL_TREE_P, number_utilities.f_1X(idx)));
		} finally {
		    {
			SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
			try {
			    bind($is_thread_performing_cleanupP$, T);
			    parse_tree.set_parse_tree_idx(self, idx);
			    parse_tree.set_parse_tree_mother(self, mother);
			} finally {
			    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
			}
		    }
		}
	    } catch (Throwable ccatch_env_var) {
		catch_var_for_prepositional_or_particle_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym670$OUTER_CATCH_FOR_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_METHOD);
	    }
	    return catch_var_for_prepositional_or_particle_word_tree_method;
	}
    }

    public static SubLObject prepositional_or_particle_word_tree_p(final SubLObject prepositional_or_particle_word_tree) {
	return classes.subloop_instanceof_class(prepositional_or_particle_word_tree, PREPOSITIONAL_OR_PARTICLE_WORD_TREE);
    }

    public static final SubLObject prepositional_or_particle_word_tree_p_alt(SubLObject prepositional_or_particle_word_tree) {
	return classes.subloop_instanceof_class(prepositional_or_particle_word_tree, PREPOSITIONAL_OR_PARTICLE_WORD_TREE);
    }

    public static SubLObject prepositional_word_tree_p(final SubLObject prepositional_word_tree) {
	return classes.subloop_instanceof_class(prepositional_word_tree, PREPOSITIONAL_WORD_TREE);
    }

    public static final SubLObject prepositional_word_tree_p_alt(SubLObject prepositional_word_tree) {
	return classes.subloop_instanceof_class(prepositional_word_tree, PREPOSITIONAL_WORD_TREE);
    }

    /**
     *
     *
     * @return listp; a list of genders of this pronoun with possible gender values
    :FEMININE, :MASCULINE and :NEUTER
     */
    @LispMethod(comment = "@return listp; a list of genders of this pronoun with possible gender values\r\n:FEMININE, :MASCULINE and :NEUTER")
    public static SubLObject prp_tree_get_gender_method(final SubLObject self) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject catch_var_for_prp_tree_method = NIL;
	final SubLObject string = parse_tree.get_parse_tree_string(self);
	try {
	    thread.throwStack.push($sym356$OUTER_CATCH_FOR_PRP_TREE_METHOD);
	    try {
		sublisp_throw($sym356$OUTER_CATCH_FOR_PRP_TREE_METHOD, assoc(string, $list357, EQUALP, UNPROVIDED).rest());
	    } finally {
		final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    parse_tree.set_parse_tree_string(self, string);
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
		}
	    }
	} catch (final Throwable ccatch_env_var) {
	    catch_var_for_prp_tree_method = Errors.handleThrowable(ccatch_env_var, $sym356$OUTER_CATCH_FOR_PRP_TREE_METHOD);
	} finally {
	    thread.throwStack.pop();
	}
	return catch_var_for_prp_tree_method;
    }

    /**
     *
     *
     * @return listp; a list of genders of this pronoun with possible gender values
    :FEMININE, :MASCULINE and :NEUTER
     */
    @LispMethod(comment = "@return listp; a list of genders of this pronoun with possible gender values\r\n:FEMININE, :MASCULINE and :NEUTER")
    public static final SubLObject prp_tree_get_gender_method_alt(SubLObject self) {
	{
	    SubLObject catch_var_for_prp_tree_method = NIL;
	    SubLObject string = parse_tree.get_parse_tree_string(self);
	    try {
		try {
		    sublisp_throw($sym356$OUTER_CATCH_FOR_PRP_TREE_METHOD, assoc(string, $list_alt357, EQUALP, UNPROVIDED).rest());
		} finally {
		    {
			SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
			try {
			    bind($is_thread_performing_cleanupP$, T);
			    parse_tree.set_parse_tree_string(self, string);
			} finally {
			    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
			}
		    }
		}
	    } catch (Throwable ccatch_env_var) {
		catch_var_for_prp_tree_method = Errors.handleThrowable(ccatch_env_var, $sym356$OUTER_CATCH_FOR_PRP_TREE_METHOD);
	    }
	    return catch_var_for_prp_tree_method;
	}
    }

    /**
     *
     *
     * @return listp; a list of numbers of this pronoun with possible number values
    :SINGULAR and :PLURAL
     */
    @LispMethod(comment = "@return listp; a list of numbers of this pronoun with possible number values\r\n:SINGULAR and :PLURAL")
    public static SubLObject prp_tree_get_number_method(final SubLObject self) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject catch_var_for_prp_tree_method = NIL;
	final SubLObject string = parse_tree.get_parse_tree_string(self);
	try {
	    thread.throwStack.push($sym345$OUTER_CATCH_FOR_PRP_TREE_METHOD);
	    try {
		SubLObject numbers = NIL;
		if (NIL != subl_promotions.memberP(string, $singular_personal_pronouns$.getGlobalValue(), EQUALP, UNPROVIDED)) {
		    numbers = cons($SINGULAR, numbers);
		}
		if (NIL != subl_promotions.memberP(string, $plural_personal_pronouns$.getGlobalValue(), EQUALP, UNPROVIDED)) {
		    numbers = cons($PLURAL, numbers);
		}
		sublisp_throw($sym345$OUTER_CATCH_FOR_PRP_TREE_METHOD, numbers);
	    } finally {
		final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    parse_tree.set_parse_tree_string(self, string);
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
		}
	    }
	} catch (final Throwable ccatch_env_var) {
	    catch_var_for_prp_tree_method = Errors.handleThrowable(ccatch_env_var, $sym345$OUTER_CATCH_FOR_PRP_TREE_METHOD);
	} finally {
	    thread.throwStack.pop();
	}
	return catch_var_for_prp_tree_method;
    }

    /**
     *
     *
     * @return listp; a list of numbers of this pronoun with possible number values
    :SINGULAR and :PLURAL
     */
    @LispMethod(comment = "@return listp; a list of numbers of this pronoun with possible number values\r\n:SINGULAR and :PLURAL")
    public static final SubLObject prp_tree_get_number_method_alt(SubLObject self) {
	{
	    SubLObject catch_var_for_prp_tree_method = NIL;
	    SubLObject string = parse_tree.get_parse_tree_string(self);
	    try {
		try {
		    {
			SubLObject numbers = NIL;
			if (NIL != subl_promotions.memberP(string, $singular_personal_pronouns$.getGlobalValue(), EQUALP, UNPROVIDED)) {
			    numbers = cons($SINGULAR, numbers);
			}
			if (NIL != subl_promotions.memberP(string, $plural_personal_pronouns$.getGlobalValue(), EQUALP, UNPROVIDED)) {
			    numbers = cons($PLURAL, numbers);
			}
			sublisp_throw($sym345$OUTER_CATCH_FOR_PRP_TREE_METHOD, numbers);
		    }
		} finally {
		    {
			SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
			try {
			    bind($is_thread_performing_cleanupP$, T);
			    parse_tree.set_parse_tree_string(self, string);
			} finally {
			    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
			}
		    }
		}
	    } catch (Throwable ccatch_env_var) {
		catch_var_for_prp_tree_method = Errors.handleThrowable(ccatch_env_var, $sym345$OUTER_CATCH_FOR_PRP_TREE_METHOD);
	    }
	    return catch_var_for_prp_tree_method;
	}
    }

    /**
     *
     *
     * @return keywordp; the person of this pronoun
     */
    @LispMethod(comment = "@return keywordp; the person of this pronoun")
    public static SubLObject prp_tree_get_person_method(final SubLObject self) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject catch_var_for_prp_tree_method = NIL;
	final SubLObject string = parse_tree.get_parse_tree_string(self);
	try {
	    thread.throwStack.push($sym348$OUTER_CATCH_FOR_PRP_TREE_METHOD);
	    try {
		sublisp_throw($sym348$OUTER_CATCH_FOR_PRP_TREE_METHOD, string.equalp($$$I) ? ONE_INTEGER : string.equalp($$$me) ? ONE_INTEGER : string.equalp($$$you) ? TWO_INTEGER : string.equalp($$$we) ? ONE_INTEGER : string.equalp($$$us) ? ONE_INTEGER : THREE_INTEGER);
	    } finally {
		final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    parse_tree.set_parse_tree_string(self, string);
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
		}
	    }
	} catch (final Throwable ccatch_env_var) {
	    catch_var_for_prp_tree_method = Errors.handleThrowable(ccatch_env_var, $sym348$OUTER_CATCH_FOR_PRP_TREE_METHOD);
	} finally {
	    thread.throwStack.pop();
	}
	return catch_var_for_prp_tree_method;
    }

    /**
     *
     *
     * @return keywordp; the person of this pronoun
     */
    @LispMethod(comment = "@return keywordp; the person of this pronoun")
    public static final SubLObject prp_tree_get_person_method_alt(SubLObject self) {
	{
	    SubLObject catch_var_for_prp_tree_method = NIL;
	    SubLObject string = parse_tree.get_parse_tree_string(self);
	    try {
		try {
		    sublisp_throw($sym348$OUTER_CATCH_FOR_PRP_TREE_METHOD, string.equalp($$$I) ? ((SubLObject) (ONE_INTEGER))
			    : string.equalp($$$me) ? ((SubLObject) (ONE_INTEGER)) : string.equalp($$$you) ? ((SubLObject) (TWO_INTEGER)) : string.equalp($$$we) ? ((SubLObject) (ONE_INTEGER)) : string.equalp($$$us) ? ((SubLObject) (ONE_INTEGER)) : THREE_INTEGER);
		} finally {
		    {
			SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
			try {
			    bind($is_thread_performing_cleanupP$, T);
			    parse_tree.set_parse_tree_string(self, string);
			} finally {
			    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
			}
		    }
		}
	    } catch (Throwable ccatch_env_var) {
		catch_var_for_prp_tree_method = Errors.handleThrowable(ccatch_env_var, $sym348$OUTER_CATCH_FOR_PRP_TREE_METHOD);
	    }
	    return catch_var_for_prp_tree_method;
	}
    }

    public static SubLObject prp_tree_p(final SubLObject prp_tree) {
	return classes.subloop_instanceof_class(prp_tree, PRP_TREE);
    }

    public static final SubLObject prp_tree_p_alt(SubLObject prp_tree) {
	return classes.subloop_instanceof_class(prp_tree, PRP_TREE);
    }

    /**
     *
     *
     * @return listp; a list of genders of this pronoun with possible gender values
    :FEMININE, :MASCULINE and :NEUTER
     */
    @LispMethod(comment = "@return listp; a list of genders of this pronoun with possible gender values\r\n:FEMININE, :MASCULINE and :NEUTER")
    public static SubLObject prpX_tree_get_gender_method(final SubLObject self) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject catch_var_for_prpX_tree_method = NIL;
	final SubLObject string = parse_tree.get_parse_tree_string(self);
	try {
	    thread.throwStack.push($sym734$OUTER_CATCH_FOR_PRP__TREE_METHOD);
	    try {
		sublisp_throw($sym734$OUTER_CATCH_FOR_PRP__TREE_METHOD, assoc(string, $list735, EQUALP, UNPROVIDED).rest());
	    } finally {
		final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    parse_tree.set_parse_tree_string(self, string);
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
		}
	    }
	} catch (final Throwable ccatch_env_var) {
	    catch_var_for_prpX_tree_method = Errors.handleThrowable(ccatch_env_var, $sym734$OUTER_CATCH_FOR_PRP__TREE_METHOD);
	} finally {
	    thread.throwStack.pop();
	}
	return catch_var_for_prpX_tree_method;
    }

    /**
     *
     *
     * @return listp; a list of genders of this pronoun with possible gender values
    :FEMININE, :MASCULINE and :NEUTER
     */
    @LispMethod(comment = "@return listp; a list of genders of this pronoun with possible gender values\r\n:FEMININE, :MASCULINE and :NEUTER")
    public static final SubLObject prpX_tree_get_gender_method_alt(SubLObject self) {
	{
	    SubLObject catch_var_for_prpX_tree_method = NIL;
	    SubLObject string = parse_tree.get_parse_tree_string(self);
	    try {
		try {
		    sublisp_throw($sym734$OUTER_CATCH_FOR_PRP__TREE_METHOD, assoc(string, $list_alt735, EQUALP, UNPROVIDED).rest());
		} finally {
		    {
			SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
			try {
			    bind($is_thread_performing_cleanupP$, T);
			    parse_tree.set_parse_tree_string(self, string);
			} finally {
			    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
			}
		    }
		}
	    } catch (Throwable ccatch_env_var) {
		catch_var_for_prpX_tree_method = Errors.handleThrowable(ccatch_env_var, $sym734$OUTER_CATCH_FOR_PRP__TREE_METHOD);
	    }
	    return catch_var_for_prpX_tree_method;
	}
    }

    /**
     *
     *
     * @return listp; a list of numbers of this possessive pronoun with possible number values
    :SINGULAR and :PLURAL
     */
    @LispMethod(comment = "@return listp; a list of numbers of this possessive pronoun with possible number values\r\n:SINGULAR and :PLURAL")
    public static SubLObject prpX_tree_get_number_method(final SubLObject self) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject catch_var_for_prpX_tree_method = NIL;
	final SubLObject string = parse_tree.get_parse_tree_string(self);
	try {
	    thread.throwStack.push($sym725$OUTER_CATCH_FOR_PRP__TREE_METHOD);
	    try {
		SubLObject numbers = NIL;
		if (NIL != subl_promotions.memberP(string, $singular_possessive_pronouns$.getGlobalValue(), EQUALP, UNPROVIDED)) {
		    numbers = cons($SINGULAR, numbers);
		}
		if (NIL != subl_promotions.memberP(string, $plural_possessive_pronouns$.getGlobalValue(), EQUALP, UNPROVIDED)) {
		    numbers = cons($PLURAL, numbers);
		}
		sublisp_throw($sym725$OUTER_CATCH_FOR_PRP__TREE_METHOD, numbers);
	    } finally {
		final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    parse_tree.set_parse_tree_string(self, string);
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
		}
	    }
	} catch (final Throwable ccatch_env_var) {
	    catch_var_for_prpX_tree_method = Errors.handleThrowable(ccatch_env_var, $sym725$OUTER_CATCH_FOR_PRP__TREE_METHOD);
	} finally {
	    thread.throwStack.pop();
	}
	return catch_var_for_prpX_tree_method;
    }

    /**
     *
     *
     * @return listp; a list of numbers of this possessive pronoun with possible number values
    :SINGULAR and :PLURAL
     */
    @LispMethod(comment = "@return listp; a list of numbers of this possessive pronoun with possible number values\r\n:SINGULAR and :PLURAL")
    public static final SubLObject prpX_tree_get_number_method_alt(SubLObject self) {
	{
	    SubLObject catch_var_for_prpX_tree_method = NIL;
	    SubLObject string = parse_tree.get_parse_tree_string(self);
	    try {
		try {
		    {
			SubLObject numbers = NIL;
			if (NIL != subl_promotions.memberP(string, $singular_possessive_pronouns$.getGlobalValue(), EQUALP, UNPROVIDED)) {
			    numbers = cons($SINGULAR, numbers);
			}
			if (NIL != subl_promotions.memberP(string, $plural_possessive_pronouns$.getGlobalValue(), EQUALP, UNPROVIDED)) {
			    numbers = cons($PLURAL, numbers);
			}
			sublisp_throw($sym725$OUTER_CATCH_FOR_PRP__TREE_METHOD, numbers);
		    }
		} finally {
		    {
			SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
			try {
			    bind($is_thread_performing_cleanupP$, T);
			    parse_tree.set_parse_tree_string(self, string);
			} finally {
			    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
			}
		    }
		}
	    } catch (Throwable ccatch_env_var) {
		catch_var_for_prpX_tree_method = Errors.handleThrowable(ccatch_env_var, $sym725$OUTER_CATCH_FOR_PRP__TREE_METHOD);
	    }
	    return catch_var_for_prpX_tree_method;
	}
    }

    /**
     *
     *
     * @return numberp; the person of this noun; 1, 2, or 3
     */
    @LispMethod(comment = "@return numberp; the person of this noun; 1, 2, or 3")
    public static SubLObject prpX_tree_get_person_method(final SubLObject self) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject catch_var_for_prpX_tree_method = NIL;
	final SubLObject string = parse_tree.get_parse_tree_string(self);
	try {
	    thread.throwStack.push($sym728$OUTER_CATCH_FOR_PRP__TREE_METHOD);
	    try {
		sublisp_throw($sym728$OUTER_CATCH_FOR_PRP__TREE_METHOD, string.equalp($$$my) ? ONE_INTEGER : string.equalp($$$your) ? TWO_INTEGER : string.equalp($$$our) ? ONE_INTEGER : THREE_INTEGER);
	    } finally {
		final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    parse_tree.set_parse_tree_string(self, string);
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
		}
	    }
	} catch (final Throwable ccatch_env_var) {
	    catch_var_for_prpX_tree_method = Errors.handleThrowable(ccatch_env_var, $sym728$OUTER_CATCH_FOR_PRP__TREE_METHOD);
	} finally {
	    thread.throwStack.pop();
	}
	return catch_var_for_prpX_tree_method;
    }

    /**
     *
     *
     * @return numberp; the person of this noun; 1, 2, or 3
     */
    @LispMethod(comment = "@return numberp; the person of this noun; 1, 2, or 3")
    public static final SubLObject prpX_tree_get_person_method_alt(SubLObject self) {
	{
	    SubLObject catch_var_for_prpX_tree_method = NIL;
	    SubLObject string = parse_tree.get_parse_tree_string(self);
	    try {
		try {
		    sublisp_throw($sym728$OUTER_CATCH_FOR_PRP__TREE_METHOD, string.equalp($$$my) ? ((SubLObject) (ONE_INTEGER)) : string.equalp($$$your) ? ((SubLObject) (TWO_INTEGER)) : string.equalp($$$our) ? ((SubLObject) (ONE_INTEGER)) : THREE_INTEGER);
		} finally {
		    {
			SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
			try {
			    bind($is_thread_performing_cleanupP$, T);
			    parse_tree.set_parse_tree_string(self, string);
			} finally {
			    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
			}
		    }
		}
	    } catch (Throwable ccatch_env_var) {
		catch_var_for_prpX_tree_method = Errors.handleThrowable(ccatch_env_var, $sym728$OUTER_CATCH_FOR_PRP__TREE_METHOD);
	    }
	    return catch_var_for_prpX_tree_method;
	}
    }

    public static SubLObject prpX_tree_p(final SubLObject prpX_tree) {
	return classes.subloop_instanceof_class(prpX_tree, $sym719$PRP__TREE);
    }

    public static final SubLObject prpX_tree_p_alt(SubLObject prpX_tree) {
	return classes.subloop_instanceof_class(prpX_tree, $sym719$PRP__TREE);
    }

    public static SubLObject punctuation_word_tree_p(final SubLObject punctuation_word_tree) {
	return classes.subloop_instanceof_class(punctuation_word_tree, PUNCTUATION_WORD_TREE);
    }

    public static final SubLObject punctuation_word_tree_p_alt(SubLObject punctuation_word_tree) {
	return classes.subloop_instanceof_class(punctuation_word_tree, PUNCTUATION_WORD_TREE);
    }

    public static SubLObject quantifier_word_tree_get_keyword_renamings_method(final SubLObject self, SubLObject keywords) {
	if (keywords == UNPROVIDED) {
	    keywords = $list706;
	}
	SubLObject conjuncts = NIL;
	final SubLObject disjuncts = NIL;
	if (NIL != subl_promotions.memberP($NOUN, keywords, EQL, UNPROVIDED)) {
	    conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($NOUN, self), conjuncts);
	}
	return cyclifier_interface.disjunctive_keyword_renamings(conjuncts, disjuncts);
    }

    public static final SubLObject quantifier_word_tree_get_keyword_renamings_method_alt(SubLObject self, SubLObject keywords) {
	if (keywords == UNPROVIDED) {
	    keywords = $list_alt706;
	}
	{
	    SubLObject conjuncts = NIL;
	    SubLObject disjuncts = NIL;
	    if (NIL != subl_promotions.memberP($NOUN, keywords, EQL, UNPROVIDED)) {
		conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($NOUN, self), conjuncts);
	    }
	    return cyclifier_interface.disjunctive_keyword_renamings(conjuncts, disjuncts);
	}
    }

    /**
     *
     *
     * @return word-tree; the word that restricts the variable that this determiner quantifies
     */
    @LispMethod(comment = "@return word-tree; the word that restricts the variable that this determiner quantifies")
    public static SubLObject quantifier_word_tree_get_quantified_method(final SubLObject self) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject catch_var_for_quantifier_word_tree_method = NIL;
	final SubLObject mother = parse_tree.get_parse_tree_mother(self);
	try {
	    thread.throwStack.push($sym712$OUTER_CATCH_FOR_QUANTIFIER_WORD_TREE_METHOD);
	    try {
		if (NIL != parse_tree.nominal_phrase_tree_p(mother)) {
		    sublisp_throw($sym712$OUTER_CATCH_FOR_QUANTIFIER_WORD_TREE_METHOD, methods.funcall_instance_method_with_0_args(mother, GET_HEAD));
		} else if (NIL != parse_tree.whadjp_tree_p(mother)) {
		    final SubLObject grandmother = methods.funcall_instance_method_with_0_args(mother, GET_MOTHER);
		    if (NIL != grandmother) {
			sublisp_throw($sym712$OUTER_CATCH_FOR_QUANTIFIER_WORD_TREE_METHOD, methods.funcall_instance_method_with_0_args(grandmother, GET_HEAD));
		    }
		}

	    } finally {
		final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    parse_tree.set_parse_tree_mother(self, mother);
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
		}
	    }
	} catch (final Throwable ccatch_env_var) {
	    catch_var_for_quantifier_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym712$OUTER_CATCH_FOR_QUANTIFIER_WORD_TREE_METHOD);
	} finally {
	    thread.throwStack.pop();
	}
	return catch_var_for_quantifier_word_tree_method;
    }

    /**
     *
     *
     * @return word-tree; the word that restricts the variable that this determiner quantifies
     */
    @LispMethod(comment = "@return word-tree; the word that restricts the variable that this determiner quantifies")
    public static final SubLObject quantifier_word_tree_get_quantified_method_alt(SubLObject self) {
	{
	    SubLObject catch_var_for_quantifier_word_tree_method = NIL;
	    SubLObject mother = parse_tree.get_parse_tree_mother(self);
	    try {
		try {
		    if (NIL != parse_tree.nominal_phrase_tree_p(mother)) {
			sublisp_throw($sym712$OUTER_CATCH_FOR_QUANTIFIER_WORD_TREE_METHOD, methods.funcall_instance_method_with_0_args(mother, GET_HEAD));
		    } else {
			if (NIL != parse_tree.whadjp_tree_p(mother)) {
			    {
				SubLObject grandmother = methods.funcall_instance_method_with_0_args(mother, GET_MOTHER);
				if (NIL != grandmother) {
				    sublisp_throw($sym712$OUTER_CATCH_FOR_QUANTIFIER_WORD_TREE_METHOD, methods.funcall_instance_method_with_0_args(grandmother, GET_HEAD));
				}
			    }
			}
		    }
		} finally {
		    {
			SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
			try {
			    bind($is_thread_performing_cleanupP$, T);
			    parse_tree.set_parse_tree_mother(self, mother);
			} finally {
			    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
			}
		    }
		}
	    } catch (Throwable ccatch_env_var) {
		catch_var_for_quantifier_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym712$OUTER_CATCH_FOR_QUANTIFIER_WORD_TREE_METHOD);
	    }
	    return catch_var_for_quantifier_word_tree_method;
	}
    }

    /**
     *
     *
     * @return word-tree; the word that this specifier specifies
     */
    @LispMethod(comment = "@return word-tree; the word that this specifier specifies")
    public static SubLObject quantifier_word_tree_get_specified_method(final SubLObject self) {
	return methods.funcall_instance_method_with_0_args(self, GET_QUANTIFIED);
    }

    /**
     *
     *
     * @return word-tree; the word that this specifier specifies
     */
    @LispMethod(comment = "@return word-tree; the word that this specifier specifies")
    public static final SubLObject quantifier_word_tree_get_specified_method_alt(SubLObject self) {
	return methods.funcall_instance_method_with_0_args(self, GET_QUANTIFIED);
    }

    public static SubLObject quantifier_word_tree_p(final SubLObject quantifier_word_tree) {
	return classes.subloop_instanceof_class(quantifier_word_tree, QUANTIFIER_WORD_TREE);
    }

    public static final SubLObject quantifier_word_tree_p_alt(SubLObject quantifier_word_tree) {
	return classes.subloop_instanceof_class(quantifier_word_tree, QUANTIFIER_WORD_TREE);
    }

    /**
     *
     *
     * @return boolean; t if this phrase is a modifying relative clause, nil otherwise
     * @unknown ... John Doe, who doesn't like Mary, ...
     */
    @LispMethod(comment = "@return boolean; t if this phrase is a modifying relative clause, nil otherwise\r\n@unknown ... John Doe, who doesn\'t like Mary, ...")
    public static SubLObject relative_clause_p(final SubLObject tree) {
	return makeBoolean((((NIL != parse_tree.sbar_tree_p(tree)) && methods.funcall_instance_method_with_0_args(tree, DAUGHTER_COUNT).numE(TWO_INTEGER))
		&& ((NIL != parse_tree.whnp_tree_p(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ZERO_INTEGER))) || methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ZERO_INTEGER), GET_STRING).equalp($$$that)))
		&& (NIL != parse_tree.s_tree_p(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ONE_INTEGER))));
    }

    /**
     *
     *
     * @return boolean; t if this phrase is a modifying relative clause, nil otherwise
     * @unknown ... John Doe, who doesn't like Mary, ...
     */
    @LispMethod(comment = "@return boolean; t if this phrase is a modifying relative clause, nil otherwise\r\n@unknown ... John Doe, who doesn\'t like Mary, ...")
    public static final SubLObject relative_clause_p_alt(SubLObject tree) {
	return makeBoolean((((NIL != parse_tree.sbar_tree_p(tree)) && methods.funcall_instance_method_with_0_args(tree, DAUGHTER_COUNT).numE(TWO_INTEGER))
		&& ((NIL != parse_tree.whnp_tree_p(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ZERO_INTEGER))) || methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ZERO_INTEGER), GET_STRING).equalp($$$that)))
		&& (NIL != parse_tree.s_tree_p(methods.funcall_instance_method_with_1_args(tree, GET_DAUGHTER, ONE_INTEGER))));
    }

    public static SubLObject set_multi_noun_tree_daughters(final SubLObject multi_noun_tree, final SubLObject value) {
	return classes.subloop_set_access_protected_instance_slot(multi_noun_tree, value, TEN_INTEGER, DAUGHTERS);
    }

    public static final SubLObject set_multi_noun_tree_daughters_alt(SubLObject multi_noun_tree, SubLObject value) {
	return classes.subloop_set_access_protected_instance_slot(multi_noun_tree, value, TEN_INTEGER, DAUGHTERS);
    }

    public static SubLObject set_word_tree_abs_idx(final SubLObject v_word_tree, final SubLObject value) {
	return classes.subloop_set_access_protected_instance_slot(v_word_tree, value, NINE_INTEGER, ABS_IDX);
    }

    public static final SubLObject set_word_tree_abs_idx_alt(SubLObject v_word_tree, SubLObject value) {
	return classes.subloop_set_access_protected_instance_slot(v_word_tree, value, NINE_INTEGER, ABS_IDX);
    }

    public static SubLObject set_word_tree_lexes(final SubLObject v_word_tree, final SubLObject value) {
	return classes.subloop_set_access_protected_instance_slot(v_word_tree, value, SEVEN_INTEGER, LEXES);
    }

    public static final SubLObject set_word_tree_lexes_alt(SubLObject v_word_tree, SubLObject value) {
	return classes.subloop_set_access_protected_instance_slot(v_word_tree, value, SEVEN_INTEGER, LEXES);
    }

    public static SubLObject set_word_tree_refs(final SubLObject v_word_tree, final SubLObject value) {
	return classes.subloop_set_access_protected_instance_slot(v_word_tree, value, EIGHT_INTEGER, REFS);
    }

    public static final SubLObject set_word_tree_refs_alt(SubLObject v_word_tree, SubLObject value) {
	return classes.subloop_set_access_protected_instance_slot(v_word_tree, value, EIGHT_INTEGER, REFS);
    }

    public static SubLObject setup_word_tree_file() {
	classes.subloop_new_class(WORD_TREE, PARSE_TREE, $list2, NIL, $list3);
	classes.class_set_implements_slot_listeners(WORD_TREE, NIL);
	methods.methods_incorporate_instance_method(MODIFIED_DEPENDENT_MEANING_P, WORD_TREE, $list8, NIL, $list9);
	methods.subloop_register_instance_method(WORD_TREE, MODIFIED_DEPENDENT_MEANING_P, WORD_TREE_MODIFIED_DEPENDENT_MEANING_P_METHOD);
	methods.methods_incorporate_instance_method(PP_COMP_FILTER_LEXES, WORD_TREE, $list8, NIL, $list16);
	methods.subloop_register_instance_method(WORD_TREE, PP_COMP_FILTER_LEXES, WORD_TREE_PP_COMP_FILTER_LEXES_METHOD);
	methods.methods_incorporate_instance_method(FRAME_FILTER_LEXES, WORD_TREE, $list8, NIL, $list27);
	methods.subloop_register_instance_method(WORD_TREE, FRAME_FILTER_LEXES, WORD_TREE_FRAME_FILTER_LEXES_METHOD);
	methods.methods_incorporate_instance_method(POS_FILTER_LEXES, WORD_TREE, $list8, NIL, $list33);
	methods.subloop_register_instance_method(WORD_TREE, POS_FILTER_LEXES, WORD_TREE_POS_FILTER_LEXES_METHOD);
	methods.methods_incorporate_instance_method(TREE_KEYWORD_EQ_CLASSES, WORD_TREE, $list8, NIL, $list40);
	methods.subloop_register_instance_method(WORD_TREE, TREE_KEYWORD_EQ_CLASSES, WORD_TREE_TREE_KEYWORD_EQ_CLASSES_METHOD);
	methods.methods_incorporate_instance_method(CYCLIFY_NUCLEUS, WORD_TREE, $list8, $list45, $list46);
	methods.subloop_register_instance_method(WORD_TREE, CYCLIFY_NUCLEUS, WORD_TREE_CYCLIFY_NUCLEUS_METHOD);
	methods.methods_incorporate_instance_method(CYCLIFY_INT, WORD_TREE, $list8, NIL, $list52);
	methods.subloop_register_instance_method(WORD_TREE, CYCLIFY_INT, WORD_TREE_CYCLIFY_INT_METHOD);
	methods.methods_incorporate_instance_method(GET_KEYWORD_RENAMINGS, WORD_TREE, $list8, $list54, $list55);
	methods.subloop_register_instance_method(WORD_TREE, GET_KEYWORD_RENAMINGS, WORD_TREE_GET_KEYWORD_RENAMINGS_METHOD);
	methods.methods_incorporate_instance_method(PARTITION_SEMANTIC_COMPLEMENTS, WORD_TREE, $list8, NIL, $list57);
	methods.subloop_register_instance_method(WORD_TREE, PARTITION_SEMANTIC_COMPLEMENTS, WORD_TREE_PARTITION_SEMANTIC_COMPLEMENTS_METHOD);
	methods.methods_incorporate_instance_method(GET_SEMANTIC_COMPLEMENTS, WORD_TREE, $list60, NIL, $list61);
	methods.subloop_register_instance_method(WORD_TREE, GET_SEMANTIC_COMPLEMENTS, WORD_TREE_GET_SEMANTIC_COMPLEMENTS_METHOD);
	methods.methods_incorporate_instance_method(GET_OBLIQUE_OBJECT, WORD_TREE, $list60, NIL, $list65);
	methods.subloop_register_instance_method(WORD_TREE, GET_OBLIQUE_OBJECT, WORD_TREE_GET_OBLIQUE_OBJECT_METHOD);
	methods.methods_incorporate_instance_method(GET_PP_COMPLEMENT, WORD_TREE, $list60, NIL, $list67);
	methods.subloop_register_instance_method(WORD_TREE, GET_PP_COMPLEMENT, WORD_TREE_GET_PP_COMPLEMENT_METHOD);
	classes.subloop_note_class_initialization_function(WORD_TREE, SUBLOOP_RESERVED_INITIALIZE_WORD_TREE_CLASS);
	classes.subloop_note_instance_initialization_function(WORD_TREE, SUBLOOP_RESERVED_INITIALIZE_WORD_TREE_INSTANCE);
	subloop_reserved_initialize_word_tree_class(WORD_TREE);
	methods.methods_incorporate_instance_method(GET_STRING, WORD_TREE, $list60, NIL, $list87);
	methods.subloop_register_instance_method(WORD_TREE, GET_STRING, WORD_TREE_GET_STRING_METHOD);
	methods.methods_incorporate_instance_method(GET_ABS_INDEX, WORD_TREE, $list60, NIL, $list91);
	methods.subloop_register_instance_method(WORD_TREE, GET_ABS_INDEX, WORD_TREE_GET_ABS_INDEX_METHOD);
	methods.methods_incorporate_instance_method(GET_LEXES, WORD_TREE, $list60, NIL, $list95);
	methods.subloop_register_instance_method(WORD_TREE, GET_LEXES, WORD_TREE_GET_LEXES_METHOD);
	methods.methods_incorporate_instance_method(GET_RANKED_LEXES, WORD_TREE, $list60, NIL, $list97);
	methods.subloop_register_instance_method(WORD_TREE, GET_RANKED_LEXES, WORD_TREE_GET_RANKED_LEXES_METHOD);
	methods.methods_incorporate_instance_method(GET_REFS, WORD_TREE, $list101, NIL, $list102);
	methods.subloop_register_instance_method(WORD_TREE, GET_REFS, WORD_TREE_GET_REFS_METHOD);
	methods.methods_incorporate_instance_method(SET_REFS, WORD_TREE, $list60, $list105, $list106);
	methods.subloop_register_instance_method(WORD_TREE, SET_REFS, WORD_TREE_SET_REFS_METHOD);
	methods.methods_incorporate_instance_method(YIELD, WORD_TREE, $list60, NIL, $list110);
	methods.subloop_register_instance_method(WORD_TREE, YIELD, WORD_TREE_YIELD_METHOD);
	methods.methods_incorporate_instance_method(GET_PARSE_EXPRESSION, WORD_TREE, $list60, NIL, $list113);
	methods.subloop_register_instance_method(WORD_TREE, GET_PARSE_EXPRESSION, WORD_TREE_GET_PARSE_EXPRESSION_METHOD);
	methods.methods_incorporate_instance_method(GET_HEADS, WORD_TREE, $list60, NIL, $list116);
	methods.subloop_register_instance_method(WORD_TREE, GET_HEADS, WORD_TREE_GET_HEADS_METHOD);
	methods.methods_incorporate_instance_method(GET_HEAD, WORD_TREE, $list60, NIL, $list118);
	methods.subloop_register_instance_method(WORD_TREE, GET_HEAD, WORD_TREE_GET_HEAD_METHOD);
	methods.methods_incorporate_instance_method(GET_SEMANTIC_HEADS, WORD_TREE, $list60, NIL, $list121);
	methods.subloop_register_instance_method(WORD_TREE, GET_SEMANTIC_HEADS, WORD_TREE_GET_SEMANTIC_HEADS_METHOD);
	methods.methods_incorporate_instance_method(LEXIFY_INT, WORD_TREE, $list124, $list125, $list126);
	methods.subloop_register_instance_method(WORD_TREE, LEXIFY_INT, WORD_TREE_LEXIFY_INT_METHOD);
	methods.methods_incorporate_instance_method(GET_PPS, WORD_TREE, $list60, NIL, $list133);
	methods.subloop_register_instance_method(WORD_TREE, GET_PPS, WORD_TREE_GET_PPS_METHOD);
	methods.methods_incorporate_instance_method(GET_COMPLEMENTS, WORD_TREE, $list60, NIL, $list141);
	methods.subloop_register_instance_method(WORD_TREE, GET_COMPLEMENTS, WORD_TREE_GET_COMPLEMENTS_METHOD);
	methods.methods_incorporate_instance_method(GET_MODIFIERS, WORD_TREE, $list60, NIL, $list143);
	methods.subloop_register_instance_method(WORD_TREE, GET_MODIFIERS, WORD_TREE_GET_MODIFIERS_METHOD);
	methods.methods_incorporate_instance_method(GET_MODIFIEDS, WORD_TREE, $list60, NIL, $list147);
	methods.subloop_register_instance_method(WORD_TREE, GET_MODIFIEDS, WORD_TREE_GET_MODIFIEDS_METHOD);
	methods.methods_incorporate_instance_method(TEMPORAL_TREE_P, WORD_TREE, $list60, NIL, $list150);
	methods.subloop_register_instance_method(WORD_TREE, TEMPORAL_TREE_P, WORD_TREE_TEMPORAL_TREE_P_METHOD);
	methods.methods_incorporate_instance_method(RELATIVE_PRONOUN_P, WORD_TREE, $list60, NIL, $list157);
	methods.subloop_register_instance_method(WORD_TREE, RELATIVE_PRONOUN_P, WORD_TREE_RELATIVE_PRONOUN_P_METHOD);
	methods.methods_incorporate_instance_method(RETOKENIZE, WORD_TREE, $list8, $list125, $list163);
	methods.subloop_register_instance_method(WORD_TREE, RETOKENIZE, WORD_TREE_RETOKENIZE_METHOD);
	methods.methods_incorporate_instance_method(LOGICAL_FORM_INT, WORD_TREE, $list8, NIL, $list166);
	methods.subloop_register_instance_method(WORD_TREE, LOGICAL_FORM_INT, WORD_TREE_LOGICAL_FORM_INT_METHOD);
	classes.subloop_new_class(FUNCTION_WORD_TREE, WORD_TREE, NIL, NIL, NIL);
	classes.class_set_implements_slot_listeners(FUNCTION_WORD_TREE, NIL);
	classes.subloop_note_class_initialization_function(FUNCTION_WORD_TREE, SUBLOOP_RESERVED_INITIALIZE_FUNCTION_WORD_TREE_CLASS);
	classes.subloop_note_instance_initialization_function(FUNCTION_WORD_TREE, SUBLOOP_RESERVED_INITIALIZE_FUNCTION_WORD_TREE_INSTANCE);
	subloop_reserved_initialize_function_word_tree_class(FUNCTION_WORD_TREE);
	classes.subloop_new_class(MODIFIER_WORD_TREE, WORD_TREE, NIL, NIL, $list172);
	classes.class_set_implements_slot_listeners(MODIFIER_WORD_TREE, NIL);
	classes.subloop_note_class_initialization_function(MODIFIER_WORD_TREE, SUBLOOP_RESERVED_INITIALIZE_MODIFIER_WORD_TREE_CLASS);
	classes.subloop_note_instance_initialization_function(MODIFIER_WORD_TREE, SUBLOOP_RESERVED_INITIALIZE_MODIFIER_WORD_TREE_INSTANCE);
	subloop_reserved_initialize_modifier_word_tree_class(MODIFIER_WORD_TREE);
	classes.subloop_new_class(COORDINATE_WORD_TREE, FUNCTION_WORD_TREE, NIL, NIL, $list176);
	classes.class_set_implements_slot_listeners(COORDINATE_WORD_TREE, NIL);
	classes.subloop_note_class_initialization_function(COORDINATE_WORD_TREE, SUBLOOP_RESERVED_INITIALIZE_COORDINATE_WORD_TREE_CLASS);
	classes.subloop_note_instance_initialization_function(COORDINATE_WORD_TREE, SUBLOOP_RESERVED_INITIALIZE_COORDINATE_WORD_TREE_INSTANCE);
	subloop_reserved_initialize_coordinate_word_tree_class(COORDINATE_WORD_TREE);
	methods.methods_incorporate_instance_method(GET_COMPLEMENTS, COORDINATE_WORD_TREE, $list60, NIL, $list179);
	methods.subloop_register_instance_method(COORDINATE_WORD_TREE, GET_COMPLEMENTS, COORDINATE_WORD_TREE_GET_COMPLEMENTS_METHOD);
	methods.methods_incorporate_instance_method(COORDINATE_PHRASE_P, PHRASE_TREE, $list60, NIL, $list184);
	methods.subloop_register_instance_method(PHRASE_TREE, COORDINATE_PHRASE_P, PHRASE_TREE_COORDINATE_PHRASE_P_METHOD);
	classes.subloop_new_class(COORDINATE_PHRASE_TREE, NOMINAL_PHRASE_TREE, NIL, NIL, $list189);
	classes.class_set_implements_slot_listeners(COORDINATE_PHRASE_TREE, NIL);
	classes.subloop_note_class_initialization_function(COORDINATE_PHRASE_TREE, SUBLOOP_RESERVED_INITIALIZE_COORDINATE_PHRASE_TREE_CLASS);
	classes.subloop_note_instance_initialization_function(COORDINATE_PHRASE_TREE, SUBLOOP_RESERVED_INITIALIZE_COORDINATE_PHRASE_TREE_INSTANCE);
	subloop_reserved_initialize_coordinate_phrase_tree_class(COORDINATE_PHRASE_TREE);
	methods.methods_incorporate_instance_method(COORDINATE_PHRASE_P, COORDINATE_PHRASE_TREE, $list60, NIL, $list193);
	methods.subloop_register_instance_method(COORDINATE_PHRASE_TREE, COORDINATE_PHRASE_P, COORDINATE_PHRASE_TREE_COORDINATE_PHRASE_P_METHOD);
	classes.subloop_new_class(UNLIKE_COORDINATE_PHRASE_TREE, NOMINAL_PHRASE_TREE, NIL, NIL, $list189);
	classes.class_set_implements_slot_listeners(UNLIKE_COORDINATE_PHRASE_TREE, NIL);
	classes.subloop_note_class_initialization_function(UNLIKE_COORDINATE_PHRASE_TREE, SUBLOOP_RESERVED_INITIALIZE_UNLIKE_COORDINATE_PHRASE_TREE_CLASS);
	classes.subloop_note_instance_initialization_function(UNLIKE_COORDINATE_PHRASE_TREE, $sym197$SUBLOOP_RESERVED_INITIALIZE_UNLIKE_COORDINATE_PHRASE_TREE_INSTANC);
	subloop_reserved_initialize_unlike_coordinate_phrase_tree_class(UNLIKE_COORDINATE_PHRASE_TREE);
	methods.methods_incorporate_instance_method(COORDINATE_PHRASE_P, UNLIKE_COORDINATE_PHRASE_TREE, $list60, NIL, $list193);
	methods.subloop_register_instance_method(UNLIKE_COORDINATE_PHRASE_TREE, COORDINATE_PHRASE_P, UNLIKE_COORDINATE_PHRASE_TREE_COORDINATE_PHRASE_P_METHOD);
	classes.subloop_new_class(NOMINAL_WORD_TREE, WORD_TREE, $list200, NIL, $list201);
	classes.class_set_implements_slot_listeners(NOMINAL_WORD_TREE, NIL);
	methods.methods_incorporate_instance_method(GET_KEYWORD_RENAMINGS, NOMINAL_WORD_TREE, $list8, $list202, $list203);
	methods.subloop_register_instance_method(NOMINAL_WORD_TREE, GET_KEYWORD_RENAMINGS, NOMINAL_WORD_TREE_GET_KEYWORD_RENAMINGS_METHOD);
	methods.methods_incorporate_instance_method(CYCLIFY_NUCLEUS, NOMINAL_WORD_TREE, $list8, $list215, $list216);
	methods.subloop_register_instance_method(NOMINAL_WORD_TREE, CYCLIFY_NUCLEUS, NOMINAL_WORD_TREE_CYCLIFY_NUCLEUS_METHOD);
	methods.methods_incorporate_instance_method(CYCLIFY_INT, NOMINAL_WORD_TREE, $list8, NIL, $list219);
	methods.subloop_register_instance_method(NOMINAL_WORD_TREE, CYCLIFY_INT, NOMINAL_WORD_TREE_CYCLIFY_INT_METHOD);
	methods.methods_incorporate_instance_method(DEFINITE_DESCRIPTION_P, NOMINAL_WORD_TREE, $list60, NIL, $list223);
	methods.subloop_register_instance_method(NOMINAL_WORD_TREE, DEFINITE_DESCRIPTION_P, NOMINAL_WORD_TREE_DEFINITE_DESCRIPTION_P_METHOD);
	methods.methods_incorporate_instance_method(RELATIONAL_NOUN_P, NOMINAL_WORD_TREE, $list60, NIL, $list230);
	methods.subloop_register_instance_method(NOMINAL_WORD_TREE, RELATIONAL_NOUN_P, NOMINAL_WORD_TREE_RELATIONAL_NOUN_P_METHOD);
	methods.methods_incorporate_instance_method(GET_QUANTIFIER, NOMINAL_WORD_TREE, $list60, NIL, $list232);
	methods.subloop_register_instance_method(NOMINAL_WORD_TREE, GET_QUANTIFIER, NOMINAL_WORD_TREE_GET_QUANTIFIER_METHOD);
	classes.subloop_note_class_initialization_function(NOMINAL_WORD_TREE, SUBLOOP_RESERVED_INITIALIZE_NOMINAL_WORD_TREE_CLASS);
	classes.subloop_note_instance_initialization_function(NOMINAL_WORD_TREE, SUBLOOP_RESERVED_INITIALIZE_NOMINAL_WORD_TREE_INSTANCE);
	subloop_reserved_initialize_nominal_word_tree_class(NOMINAL_WORD_TREE);
	methods.methods_incorporate_instance_method(GET_NUMBER, NOMINAL_WORD_TREE, $list60, NIL, $list239);
	methods.subloop_register_instance_method(NOMINAL_WORD_TREE, GET_NUMBER, NOMINAL_WORD_TREE_GET_NUMBER_METHOD);
	methods.methods_incorporate_instance_method(GET_COMPLEMENTS, NOMINAL_WORD_TREE, $list60, NIL, $list241);
	methods.subloop_register_instance_method(NOMINAL_WORD_TREE, GET_COMPLEMENTS, NOMINAL_WORD_TREE_GET_COMPLEMENTS_METHOD);
	methods.methods_incorporate_instance_method(GET_DETERMINER, NOMINAL_WORD_TREE, $list60, NIL, $list244);
	methods.subloop_register_instance_method(NOMINAL_WORD_TREE, GET_DETERMINER, NOMINAL_WORD_TREE_GET_DETERMINER_METHOD);
	methods.methods_incorporate_instance_method(GET_OVERT_QUANTIFIER, NOMINAL_WORD_TREE, $list8, NIL, $list251);
	methods.subloop_register_instance_method(NOMINAL_WORD_TREE, GET_OVERT_QUANTIFIER, NOMINAL_WORD_TREE_GET_OVERT_QUANTIFIER_METHOD);
	methods.methods_incorporate_instance_method(GET_EXISTENTIAL_NULL_DETERMINER, WORD_TREE, $list8, NIL, $list255);
	methods.subloop_register_instance_method(WORD_TREE, GET_EXISTENTIAL_NULL_DETERMINER, WORD_TREE_GET_EXISTENTIAL_NULL_DETERMINER_METHOD);
	methods.methods_incorporate_instance_method(GET_POSSESSOR, NOMINAL_WORD_TREE, $list60, NIL, $list269);
	methods.subloop_register_instance_method(NOMINAL_WORD_TREE, GET_POSSESSOR, NOMINAL_WORD_TREE_GET_POSSESSOR_METHOD);
	methods.methods_incorporate_instance_method(GET_SPECIFIER, NOMINAL_WORD_TREE, $list60, NIL, $list276);
	methods.subloop_register_instance_method(NOMINAL_WORD_TREE, GET_SPECIFIER, NOMINAL_WORD_TREE_GET_SPECIFIER_METHOD);
	methods.methods_incorporate_instance_method(GET_ANTECEDENT, NOMINAL_WORD_TREE, $list60, NIL, $list279);
	methods.subloop_register_instance_method(NOMINAL_WORD_TREE, GET_ANTECEDENT, NOMINAL_WORD_TREE_GET_ANTECEDENT_METHOD);
	methods.methods_incorporate_instance_method(GET_GENDER, NOMINAL_WORD_TREE, $list60, NIL, $list282);
	methods.subloop_register_instance_method(NOMINAL_WORD_TREE, GET_GENDER, NOMINAL_WORD_TREE_GET_GENDER_METHOD);
	methods.methods_incorporate_instance_method(GET_PERSON, NOMINAL_WORD_TREE, $list60, NIL, $list286);
	methods.subloop_register_instance_method(NOMINAL_WORD_TREE, GET_PERSON, NOMINAL_WORD_TREE_GET_PERSON_METHOD);
	methods.methods_incorporate_instance_method(SINGULAR_P, NOMINAL_WORD_TREE, $list60, NIL, $list288);
	methods.subloop_register_instance_method(NOMINAL_WORD_TREE, SINGULAR_P, NOMINAL_WORD_TREE_SINGULAR_P_METHOD);
	methods.methods_incorporate_instance_method(PLURAL_P, NOMINAL_WORD_TREE, $list60, NIL, $list291);
	methods.subloop_register_instance_method(NOMINAL_WORD_TREE, PLURAL_P, NOMINAL_WORD_TREE_PLURAL_P_METHOD);
	methods.methods_incorporate_instance_method(GET_MODIFIEDS, NOMINAL_WORD_TREE, $list60, NIL, $list294);
	methods.subloop_register_instance_method(NOMINAL_WORD_TREE, GET_MODIFIEDS, NOMINAL_WORD_TREE_GET_MODIFIEDS_METHOD);
	classes.subloop_new_class(NN_TREE, NOMINAL_WORD_TREE, NIL, NIL, $list304);
	classes.class_set_implements_slot_listeners(NN_TREE, NIL);
	classes.subloop_note_class_initialization_function(NN_TREE, SUBLOOP_RESERVED_INITIALIZE_NN_TREE_CLASS);
	classes.subloop_note_instance_initialization_function(NN_TREE, SUBLOOP_RESERVED_INITIALIZE_NN_TREE_INSTANCE);
	subloop_reserved_initialize_nn_tree_class(NN_TREE);
	methods.methods_incorporate_instance_method(GET_NUMBER, NN_TREE, $list60, NIL, $list307);
	methods.subloop_register_instance_method(NN_TREE, GET_NUMBER, NN_TREE_GET_NUMBER_METHOD);
	classes.subloop_new_class(NAME_WORD_TREE, NOMINAL_WORD_TREE, $list311, NIL, $list312);
	classes.class_set_implements_slot_listeners(NAME_WORD_TREE, NIL);
	methods.methods_incorporate_instance_method(GET_QUANTIFIER, NAME_WORD_TREE, $list60, NIL, $list313);
	methods.subloop_register_instance_method(NAME_WORD_TREE, GET_QUANTIFIER, NAME_WORD_TREE_GET_QUANTIFIER_METHOD);
	classes.subloop_note_class_initialization_function(NAME_WORD_TREE, SUBLOOP_RESERVED_INITIALIZE_NAME_WORD_TREE_CLASS);
	classes.subloop_note_instance_initialization_function(NAME_WORD_TREE, SUBLOOP_RESERVED_INITIALIZE_NAME_WORD_TREE_INSTANCE);
	subloop_reserved_initialize_name_word_tree_class(NAME_WORD_TREE);
	classes.subloop_new_class(DOLLAR_WORD_TREE, NOMINAL_WORD_TREE, NIL, NIL, $list318);
	classes.class_set_implements_slot_listeners(DOLLAR_WORD_TREE, NIL);
	classes.subloop_note_class_initialization_function(DOLLAR_WORD_TREE, SUBLOOP_RESERVED_INITIALIZE_DOLLAR_WORD_TREE_CLASS);
	classes.subloop_note_instance_initialization_function(DOLLAR_WORD_TREE, SUBLOOP_RESERVED_INITIALIZE_DOLLAR_WORD_TREE_INSTANCE);
	subloop_reserved_initialize_dollar_word_tree_class(DOLLAR_WORD_TREE);
	methods.methods_incorporate_instance_method(GET_OVERT_QUANTIFIER, DOLLAR_WORD_TREE, $list8, NIL, $list321);
	methods.subloop_register_instance_method(DOLLAR_WORD_TREE, GET_OVERT_QUANTIFIER, DOLLAR_WORD_TREE_GET_OVERT_QUANTIFIER_METHOD);
	classes.subloop_new_class(NNP_TREE, NAME_WORD_TREE, NIL, NIL, $list304);
	classes.class_set_implements_slot_listeners(NNP_TREE, NIL);
	classes.subloop_note_class_initialization_function(NNP_TREE, SUBLOOP_RESERVED_INITIALIZE_NNP_TREE_CLASS);
	classes.subloop_note_instance_initialization_function(NNP_TREE, SUBLOOP_RESERVED_INITIALIZE_NNP_TREE_INSTANCE);
	subloop_reserved_initialize_nnp_tree_class(NNP_TREE);
	methods.methods_incorporate_instance_method(GET_NUMBER, NNP_TREE, $list60, NIL, $list307);
	methods.subloop_register_instance_method(NNP_TREE, GET_NUMBER, NNP_TREE_GET_NUMBER_METHOD);
	classes.subloop_new_class(NNS_TREE, NOMINAL_WORD_TREE, NIL, NIL, $list304);
	classes.class_set_implements_slot_listeners(NNS_TREE, NIL);
	classes.subloop_note_class_initialization_function(NNS_TREE, SUBLOOP_RESERVED_INITIALIZE_NNS_TREE_CLASS);
	classes.subloop_note_instance_initialization_function(NNS_TREE, SUBLOOP_RESERVED_INITIALIZE_NNS_TREE_INSTANCE);
	subloop_reserved_initialize_nns_tree_class(NNS_TREE);
	methods.methods_incorporate_instance_method(GET_NUMBER, NNS_TREE, $list60, NIL, $list330);
	methods.subloop_register_instance_method(NNS_TREE, GET_NUMBER, NNS_TREE_GET_NUMBER_METHOD);
	classes.subloop_new_class(NNPS_TREE, NAME_WORD_TREE, NIL, NIL, $list304);
	classes.class_set_implements_slot_listeners(NNPS_TREE, NIL);
	classes.subloop_note_class_initialization_function(NNPS_TREE, SUBLOOP_RESERVED_INITIALIZE_NNPS_TREE_CLASS);
	classes.subloop_note_instance_initialization_function(NNPS_TREE, SUBLOOP_RESERVED_INITIALIZE_NNPS_TREE_INSTANCE);
	subloop_reserved_initialize_nnps_tree_class(NNPS_TREE);
	methods.methods_incorporate_instance_method(GET_NUMBER, NNPS_TREE, $list60, NIL, $list330);
	methods.subloop_register_instance_method(NNPS_TREE, GET_NUMBER, NNPS_TREE_GET_NUMBER_METHOD);
	classes.subloop_new_class(PRP_TREE, NOMINAL_WORD_TREE, $list338, NIL, $list339);
	classes.class_set_implements_slot_listeners(PRP_TREE, NIL);
	classes.subloop_note_class_initialization_function(PRP_TREE, SUBLOOP_RESERVED_INITIALIZE_PRP_TREE_CLASS);
	classes.subloop_note_instance_initialization_function(PRP_TREE, SUBLOOP_RESERVED_INITIALIZE_PRP_TREE_INSTANCE);
	subloop_reserved_initialize_prp_tree_class(PRP_TREE);
	methods.methods_incorporate_instance_method(GET_NUMBER, PRP_TREE, $list60, NIL, $list344);
	methods.subloop_register_instance_method(PRP_TREE, GET_NUMBER, PRP_TREE_GET_NUMBER_METHOD);
	methods.methods_incorporate_instance_method(GET_PERSON, PRP_TREE, $list60, NIL, $list347);
	methods.subloop_register_instance_method(PRP_TREE, GET_PERSON, PRP_TREE_GET_PERSON_METHOD);
	methods.methods_incorporate_instance_method(GET_GENDER, PRP_TREE, $list60, NIL, $list355);
	methods.subloop_register_instance_method(PRP_TREE, GET_GENDER, PRP_TREE_GET_GENDER_METHOD);
	classes.subloop_new_class(WP_TREE, NOMINAL_WORD_TREE, $list360, NIL, $list361);
	classes.class_set_implements_slot_listeners(WP_TREE, NIL);
	classes.subloop_note_class_initialization_function(WP_TREE, SUBLOOP_RESERVED_INITIALIZE_WP_TREE_CLASS);
	classes.subloop_note_instance_initialization_function(WP_TREE, SUBLOOP_RESERVED_INITIALIZE_WP_TREE_INSTANCE);
	subloop_reserved_initialize_wp_tree_class(WP_TREE);
	methods.methods_incorporate_instance_method(GET_REFS, WP_TREE, $list60, NIL, $list364);
	methods.subloop_register_instance_method(WP_TREE, GET_REFS, WP_TREE_GET_REFS_METHOD);
	methods.methods_incorporate_instance_method(GET_ANTECEDENT, WP_TREE, $list60, NIL, $list367);
	methods.subloop_register_instance_method(WP_TREE, GET_ANTECEDENT, WP_TREE_GET_ANTECEDENT_METHOD);
	methods.methods_incorporate_instance_method(GET_QUANTIFIER, WP_TREE, $list60, NIL, $list370);
	methods.subloop_register_instance_method(WP_TREE, GET_QUANTIFIER, WP_TREE_GET_QUANTIFIER_METHOD);
	methods.methods_incorporate_instance_method(GET_NUMBER, WP_TREE, $list60, NIL, $list373);
	methods.subloop_register_instance_method(WP_TREE, GET_NUMBER, WP_TREE_GET_NUMBER_METHOD);
	methods.methods_incorporate_instance_method(GET_GENDER, WP_TREE, $list60, NIL, $list375);
	methods.subloop_register_instance_method(WP_TREE, GET_GENDER, WP_TREE_GET_GENDER_METHOD);
	classes.subloop_new_class(VERBAL_WORD_TREE, WORD_TREE, $list380, NIL, $list381);
	classes.class_set_implements_slot_listeners(VERBAL_WORD_TREE, NIL);
	methods.methods_incorporate_instance_method(PARTICLE_FILTER_LEXES, VERBAL_WORD_TREE, $list8, NIL, $list382);
	methods.subloop_register_instance_method(VERBAL_WORD_TREE, PARTICLE_FILTER_LEXES, VERBAL_WORD_TREE_PARTICLE_FILTER_LEXES_METHOD);
	methods.methods_incorporate_instance_method(PARTITION_SEMANTIC_COMPLEMENTS, VERBAL_WORD_TREE, $list8, NIL, $list388);
	methods.subloop_register_instance_method(VERBAL_WORD_TREE, PARTITION_SEMANTIC_COMPLEMENTS, VERBAL_WORD_TREE_PARTITION_SEMANTIC_COMPLEMENTS_METHOD);
	methods.methods_incorporate_instance_method(GET_KEYWORD_RENAMINGS, VERBAL_WORD_TREE, $list8, $list391, $list392);
	methods.subloop_register_instance_method(VERBAL_WORD_TREE, GET_KEYWORD_RENAMINGS, VERBAL_WORD_TREE_GET_KEYWORD_RENAMINGS_METHOD);
	methods.methods_incorporate_instance_method(GET_CONTROLLER, VERBAL_WORD_TREE, $list8, NIL, $list405);
	methods.subloop_register_instance_method(VERBAL_WORD_TREE, GET_CONTROLLER, VERBAL_WORD_TREE_GET_CONTROLLER_METHOD);
	methods.methods_incorporate_instance_method(GET_CONTROL_VERB, VERBAL_WORD_TREE, $list8, NIL, $list411);
	methods.subloop_register_instance_method(VERBAL_WORD_TREE, GET_CONTROL_VERB, VERBAL_WORD_TREE_GET_CONTROL_VERB_METHOD);
	methods.methods_incorporate_instance_method(OBJECT_CONTROLLER_P, VERBAL_WORD_TREE, $list8, NIL, $list415);
	methods.subloop_register_instance_method(VERBAL_WORD_TREE, OBJECT_CONTROLLER_P, VERBAL_WORD_TREE_OBJECT_CONTROLLER_P_METHOD);
	methods.methods_incorporate_instance_method(SUBJECT_CONTROLLER_P, VERBAL_WORD_TREE, $list8, NIL, $list418);
	methods.subloop_register_instance_method(VERBAL_WORD_TREE, SUBJECT_CONTROLLER_P, VERBAL_WORD_TREE_SUBJECT_CONTROLLER_P_METHOD);
	methods.methods_incorporate_instance_method(CONTROL_VERB_P, VERBAL_WORD_TREE, $list8, NIL, $list421);
	methods.subloop_register_instance_method(VERBAL_WORD_TREE, CONTROL_VERB_P, VERBAL_WORD_TREE_CONTROL_VERB_P_METHOD);
	methods.methods_incorporate_instance_method(GET_MATRIX_CLAUSE, VERBAL_WORD_TREE, $list8, NIL, $list423);
	methods.subloop_register_instance_method(VERBAL_WORD_TREE, GET_MATRIX_CLAUSE, VERBAL_WORD_TREE_GET_MATRIX_CLAUSE_METHOD);
	classes.subloop_note_class_initialization_function(VERBAL_WORD_TREE, SUBLOOP_RESERVED_INITIALIZE_VERBAL_WORD_TREE_CLASS);
	classes.subloop_note_instance_initialization_function(VERBAL_WORD_TREE, SUBLOOP_RESERVED_INITIALIZE_VERBAL_WORD_TREE_INSTANCE);
	subloop_reserved_initialize_verbal_word_tree_class(VERBAL_WORD_TREE);
	methods.methods_incorporate_instance_method(GET_PREDICATE, VERBAL_WORD_TREE, $list60, NIL, $list428);
	methods.subloop_register_instance_method(VERBAL_WORD_TREE, GET_PREDICATE, VERBAL_WORD_TREE_GET_PREDICATE_METHOD);
	methods.methods_incorporate_instance_method(GET_NUMBER, VERBAL_WORD_TREE, $list60, NIL, $list431);
	methods.subloop_register_instance_method(VERBAL_WORD_TREE, GET_NUMBER, VERBAL_WORD_TREE_GET_NUMBER_METHOD);
	methods.methods_incorporate_instance_method(GET_PERSON, VERBAL_WORD_TREE, $list60, NIL, $list434);
	methods.subloop_register_instance_method(VERBAL_WORD_TREE, GET_PERSON, VERBAL_WORD_TREE_GET_PERSON_METHOD);
	methods.methods_incorporate_instance_method(GET_TENSE, VERBAL_WORD_TREE, $list60, NIL, $list437);
	methods.subloop_register_instance_method(VERBAL_WORD_TREE, GET_TENSE, VERBAL_WORD_TREE_GET_TENSE_METHOD);
	methods.methods_incorporate_instance_method(GET_SUBJECT, VERBAL_WORD_TREE, $list60, NIL, $list439);
	methods.subloop_register_instance_method(VERBAL_WORD_TREE, GET_SUBJECT, VERBAL_WORD_TREE_GET_SUBJECT_METHOD);
	methods.methods_incorporate_instance_method(GET_OBJECTS, VERBAL_WORD_TREE, $list60, NIL, $list443);
	methods.subloop_register_instance_method(VERBAL_WORD_TREE, GET_OBJECTS, VERBAL_WORD_TREE_GET_OBJECTS_METHOD);
	methods.methods_incorporate_instance_method(GET_MOVED_NPS, VERBAL_WORD_TREE, $list8, NIL, $list450);
	methods.subloop_register_instance_method(VERBAL_WORD_TREE, GET_MOVED_NPS, VERBAL_WORD_TREE_GET_MOVED_NPS_METHOD);
	methods.methods_incorporate_instance_method(GET_MOVED_OBJECTS, VERBAL_WORD_TREE, $list8, NIL, $list454);
	methods.subloop_register_instance_method(VERBAL_WORD_TREE, GET_MOVED_OBJECTS, VERBAL_WORD_TREE_GET_MOVED_OBJECTS_METHOD);
	methods.methods_incorporate_instance_method(GET_DIRECT_OBJECT, VERBAL_WORD_TREE, $list60, NIL, $list456);
	methods.subloop_register_instance_method(VERBAL_WORD_TREE, GET_DIRECT_OBJECT, VERBAL_WORD_TREE_GET_DIRECT_OBJECT_METHOD);
	methods.methods_incorporate_instance_method(GET_INDIRECT_OBJECT, VERBAL_WORD_TREE, $list60, NIL, $list459);
	methods.subloop_register_instance_method(VERBAL_WORD_TREE, GET_INDIRECT_OBJECT, VERBAL_WORD_TREE_GET_INDIRECT_OBJECT_METHOD);
	methods.methods_incorporate_instance_method(GET_SEMANTIC_DIRECT_OBJECT, VERBAL_WORD_TREE, $list60, NIL, $list462);
	methods.subloop_register_instance_method(VERBAL_WORD_TREE, GET_SEMANTIC_DIRECT_OBJECT, VERBAL_WORD_TREE_GET_SEMANTIC_DIRECT_OBJECT_METHOD);
	methods.methods_incorporate_instance_method(GET_SEMANTIC_INDIRECT_OBJECT, VERBAL_WORD_TREE, $list60, NIL, $list464);
	methods.subloop_register_instance_method(VERBAL_WORD_TREE, GET_SEMANTIC_INDIRECT_OBJECT, VERBAL_WORD_TREE_GET_SEMANTIC_INDIRECT_OBJECT_METHOD);
	methods.methods_incorporate_instance_method(GET_VERBAL_COMPLEMENT, VERBAL_WORD_TREE, $list60, NIL, $list466);
	methods.subloop_register_instance_method(VERBAL_WORD_TREE, GET_VERBAL_COMPLEMENT, VERBAL_WORD_TREE_GET_VERBAL_COMPLEMENT_METHOD);
	methods.methods_incorporate_instance_method(GET_ADJECTIVAL_COMPLEMENT, VERBAL_WORD_TREE, $list60, NIL, $list471);
	methods.subloop_register_instance_method(VERBAL_WORD_TREE, GET_ADJECTIVAL_COMPLEMENT, VERBAL_WORD_TREE_GET_ADJECTIVAL_COMPLEMENT_METHOD);
	methods.methods_incorporate_instance_method(GET_COMPLEMENTS, VERBAL_WORD_TREE, $list60, NIL, $list475);
	methods.subloop_register_instance_method(VERBAL_WORD_TREE, GET_COMPLEMENTS, VERBAL_WORD_TREE_GET_COMPLEMENTS_METHOD);
	methods.methods_incorporate_instance_method(GET_PARTICLE, VERBAL_WORD_TREE, $list60, NIL, $list478);
	methods.subloop_register_instance_method(VERBAL_WORD_TREE, GET_PARTICLE, VERBAL_WORD_TREE_GET_PARTICLE_METHOD);
	methods.methods_incorporate_instance_method(GET_INFINITIVE_MARKER, VERBAL_WORD_TREE, $list60, NIL, $list483);
	methods.subloop_register_instance_method(VERBAL_WORD_TREE, GET_INFINITIVE_MARKER, VERBAL_WORD_TREE_GET_INFINITIVE_MARKER_METHOD);
	methods.methods_incorporate_instance_method(DUMMY_TO_P, VERBAL_WORD_TREE, $list60, NIL, $list487);
	methods.subloop_register_instance_method(VERBAL_WORD_TREE, DUMMY_TO_P, VERBAL_WORD_TREE_DUMMY_TO_P_METHOD);
	methods.methods_incorporate_instance_method(GET_SEMANTIC_SUBJECT, VERBAL_WORD_TREE, $list60, NIL, $list490);
	methods.subloop_register_instance_method(VERBAL_WORD_TREE, GET_SEMANTIC_SUBJECT, VERBAL_WORD_TREE_GET_SEMANTIC_SUBJECT_METHOD);
	methods.methods_incorporate_instance_method(GET_SEMANTIC_OBJECTS, VERBAL_WORD_TREE, $list60, NIL, $list492);
	methods.subloop_register_instance_method(VERBAL_WORD_TREE, GET_SEMANTIC_OBJECTS, VERBAL_WORD_TREE_GET_SEMANTIC_OBJECTS_METHOD);
	methods.methods_incorporate_instance_method(GET_ANCESTOR_OBJECTS, VERBAL_WORD_TREE, $list8, NIL, $list495);
	methods.subloop_register_instance_method(VERBAL_WORD_TREE, GET_ANCESTOR_OBJECTS, VERBAL_WORD_TREE_GET_ANCESTOR_OBJECTS_METHOD);
	methods.methods_incorporate_instance_method(INVERTED_P, VERBAL_WORD_TREE, $list8, NIL, $list499);
	methods.subloop_register_instance_method(VERBAL_WORD_TREE, INVERTED_P, VERBAL_WORD_TREE_INVERTED_P_METHOD);
	methods.methods_incorporate_instance_method(FINITE_P, VERBAL_WORD_TREE, $list8, NIL, $list501);
	methods.subloop_register_instance_method(VERBAL_WORD_TREE, FINITE_P, VERBAL_WORD_TREE_FINITE_P_METHOD);
	methods.methods_incorporate_instance_method(PASSIVE_P, VERBAL_WORD_TREE, $list8, NIL, $list504);
	methods.subloop_register_instance_method(VERBAL_WORD_TREE, PASSIVE_P, VERBAL_WORD_TREE_PASSIVE_P_METHOD);
	methods.methods_incorporate_instance_method(INFINITIVE_P, VERBAL_WORD_TREE, $list8, NIL, $list507);
	methods.subloop_register_instance_method(VERBAL_WORD_TREE, INFINITIVE_P, VERBAL_WORD_TREE_INFINITIVE_P_METHOD);
	methods.methods_incorporate_instance_method(BASE_P, VERBAL_WORD_TREE, $list8, NIL, $list510);
	methods.subloop_register_instance_method(VERBAL_WORD_TREE, BASE_P, VERBAL_WORD_TREE_BASE_P_METHOD);
	classes.subloop_new_class(VBZ_TREE, VERBAL_WORD_TREE, $list516, NIL, $list517);
	classes.class_set_implements_slot_listeners(VBZ_TREE, NIL);
	classes.subloop_note_class_initialization_function(VBZ_TREE, SUBLOOP_RESERVED_INITIALIZE_VBZ_TREE_CLASS);
	classes.subloop_note_instance_initialization_function(VBZ_TREE, SUBLOOP_RESERVED_INITIALIZE_VBZ_TREE_INSTANCE);
	subloop_reserved_initialize_vbz_tree_class(VBZ_TREE);
	methods.methods_incorporate_instance_method(GET_TENSE, VBZ_TREE, $list60, NIL, $list520);
	methods.subloop_register_instance_method(VBZ_TREE, GET_TENSE, VBZ_TREE_GET_TENSE_METHOD);
	classes.subloop_new_class(VBN_TREE, VERBAL_WORD_TREE, NIL, NIL, $list524);
	classes.class_set_implements_slot_listeners(VBN_TREE, NIL);
	classes.subloop_note_class_initialization_function(VBN_TREE, SUBLOOP_RESERVED_INITIALIZE_VBN_TREE_CLASS);
	classes.subloop_note_instance_initialization_function(VBN_TREE, SUBLOOP_RESERVED_INITIALIZE_VBN_TREE_INSTANCE);
	subloop_reserved_initialize_vbn_tree_class(VBN_TREE);
	methods.methods_incorporate_instance_method(GET_AUX_VERB, VBN_TREE, $list8, NIL, $list528);
	methods.subloop_register_instance_method(VBN_TREE, GET_AUX_VERB, VBN_TREE_GET_AUX_VERB_METHOD);
	methods.methods_incorporate_instance_method(GET_SEMANTIC_SUBJECT, VBN_TREE, $list60, NIL, $list532);
	methods.subloop_register_instance_method(VBN_TREE, GET_SEMANTIC_SUBJECT, VBN_TREE_GET_SEMANTIC_SUBJECT_METHOD);
	methods.methods_incorporate_instance_method(GET_SEMANTIC_DIRECT_OBJECT, VBN_TREE, $list60, NIL, $list536);
	methods.subloop_register_instance_method(VBN_TREE, GET_SEMANTIC_DIRECT_OBJECT, VBN_TREE_GET_SEMANTIC_DIRECT_OBJECT_METHOD);
	methods.methods_incorporate_instance_method(GET_SEMANTIC_INDIRECT_OBJECT, VBN_TREE, $list60, NIL, $list539);
	methods.subloop_register_instance_method(VBN_TREE, GET_SEMANTIC_INDIRECT_OBJECT, VBN_TREE_GET_SEMANTIC_INDIRECT_OBJECT_METHOD);
	methods.methods_incorporate_instance_method(PASSIVE_P, VBN_TREE, $list8, NIL, $list542);
	methods.subloop_register_instance_method(VBN_TREE, PASSIVE_P, VBN_TREE_PASSIVE_P_METHOD);
	classes.subloop_new_class(VBD_TREE, VERBAL_WORD_TREE, $list516, NIL, $list517);
	classes.class_set_implements_slot_listeners(VBD_TREE, NIL);
	classes.subloop_note_class_initialization_function(VBD_TREE, SUBLOOP_RESERVED_INITIALIZE_VBD_TREE_CLASS);
	classes.subloop_note_instance_initialization_function(VBD_TREE, SUBLOOP_RESERVED_INITIALIZE_VBD_TREE_INSTANCE);
	subloop_reserved_initialize_vbd_tree_class(VBD_TREE);
	methods.methods_incorporate_instance_method(GET_TENSE, VBD_TREE, $list60, NIL, $list547);
	methods.subloop_register_instance_method(VBD_TREE, GET_TENSE, VBD_TREE_GET_TENSE_METHOD);
	classes.subloop_new_class(VBP_TREE, VERBAL_WORD_TREE, $list516, NIL, $list517);
	classes.class_set_implements_slot_listeners(VBP_TREE, NIL);
	classes.subloop_note_class_initialization_function(VBP_TREE, SUBLOOP_RESERVED_INITIALIZE_VBP_TREE_CLASS);
	classes.subloop_note_instance_initialization_function(VBP_TREE, SUBLOOP_RESERVED_INITIALIZE_VBP_TREE_INSTANCE);
	subloop_reserved_initialize_vbp_tree_class(VBP_TREE);
	methods.methods_incorporate_instance_method(GET_TENSE, VBP_TREE, $list60, NIL, $list520);
	methods.subloop_register_instance_method(VBP_TREE, GET_TENSE, VBP_TREE_GET_TENSE_METHOD);
	classes.subloop_new_class(VB_TREE, VERBAL_WORD_TREE, NIL, NIL, $list517);
	classes.class_set_implements_slot_listeners(VB_TREE, NIL);
	classes.subloop_note_class_initialization_function(VB_TREE, SUBLOOP_RESERVED_INITIALIZE_VB_TREE_CLASS);
	classes.subloop_note_instance_initialization_function(VB_TREE, SUBLOOP_RESERVED_INITIALIZE_VB_TREE_INSTANCE);
	subloop_reserved_initialize_vb_tree_class(VB_TREE);
	methods.methods_incorporate_instance_method(GET_TENSE, VB_TREE, $list60, NIL, $list557);
	methods.subloop_register_instance_method(VB_TREE, GET_TENSE, VB_TREE_GET_TENSE_METHOD);
	classes.subloop_new_class(VBG_TREE, VERBAL_WORD_TREE, NIL, NIL, $list561);
	classes.class_set_implements_slot_listeners(VBG_TREE, NIL);
	classes.subloop_note_class_initialization_function(VBG_TREE, SUBLOOP_RESERVED_INITIALIZE_VBG_TREE_CLASS);
	classes.subloop_note_instance_initialization_function(VBG_TREE, SUBLOOP_RESERVED_INITIALIZE_VBG_TREE_INSTANCE);
	subloop_reserved_initialize_vbg_tree_class(VBG_TREE);
	methods.methods_incorporate_instance_method(GET_AUX_VERB, VBG_TREE, $list8, NIL, $list528);
	methods.subloop_register_instance_method(VBG_TREE, GET_AUX_VERB, VBG_TREE_GET_AUX_VERB_METHOD);
	methods.methods_incorporate_instance_method(GET_MODIFIEDS, VBG_TREE, $list60, NIL, $list566);
	methods.subloop_register_instance_method(VBG_TREE, GET_MODIFIEDS, VBG_TREE_GET_MODIFIEDS_METHOD);
	classes.subloop_new_class(AUX_VERB_TREE, VERBAL_WORD_TREE, $list570, NIL, $list571);
	classes.class_set_implements_slot_listeners(AUX_VERB_TREE, NIL);
	methods.methods_incorporate_instance_method(COPULA_P, AUX_VERB_TREE, $list60, NIL, $list572);
	methods.subloop_register_instance_method(AUX_VERB_TREE, COPULA_P, AUX_VERB_TREE_COPULA_P_METHOD);
	methods.methods_incorporate_instance_method(GET_KEYWORD_RENAMINGS, AUX_VERB_TREE, $list8, $list574, $list575);
	methods.subloop_register_instance_method(AUX_VERB_TREE, GET_KEYWORD_RENAMINGS, AUX_VERB_TREE_GET_KEYWORD_RENAMINGS_METHOD);
	methods.methods_incorporate_instance_method(GET_SEMANTIC_COMPLEMENTS, AUX_VERB_TREE, $list8, NIL, $list579);
	methods.subloop_register_instance_method(AUX_VERB_TREE, GET_SEMANTIC_COMPLEMENTS, AUX_VERB_TREE_GET_SEMANTIC_COMPLEMENTS_METHOD);
	methods.methods_incorporate_instance_method(GET_COMPLEMENTS, AUX_VERB_TREE, $list8, NIL, $list581);
	methods.subloop_register_instance_method(AUX_VERB_TREE, GET_COMPLEMENTS, AUX_VERB_TREE_GET_COMPLEMENTS_METHOD);
	methods.methods_incorporate_instance_method(GET_SEMANTIC_HEADS, AUX_VERB_TREE, $list60, NIL, $list585);
	methods.subloop_register_instance_method(AUX_VERB_TREE, GET_SEMANTIC_HEADS, AUX_VERB_TREE_GET_SEMANTIC_HEADS_METHOD);
	methods.methods_incorporate_instance_method(GET_TENSE, AUX_VERB_TREE, $list60, NIL, $list587);
	methods.subloop_register_instance_method(AUX_VERB_TREE, GET_TENSE, AUX_VERB_TREE_GET_TENSE_METHOD);
	classes.subloop_note_class_initialization_function(AUX_VERB_TREE, SUBLOOP_RESERVED_INITIALIZE_AUX_VERB_TREE_CLASS);
	classes.subloop_note_instance_initialization_function(AUX_VERB_TREE, SUBLOOP_RESERVED_INITIALIZE_AUX_VERB_TREE_INSTANCE);
	subloop_reserved_initialize_aux_verb_tree_class(AUX_VERB_TREE);
	methods.methods_incorporate_instance_method(GET_PREPOSITIONAL_COMPLEMENT, AUX_VERB_TREE, $list8, NIL, $list594);
	methods.subloop_register_instance_method(AUX_VERB_TREE, GET_PREPOSITIONAL_COMPLEMENT, AUX_VERB_TREE_GET_PREPOSITIONAL_COMPLEMENT_METHOD);
	methods.methods_incorporate_instance_method(GET_ADVERBIAL_COMPLEMENT, AUX_VERB_TREE, $list8, NIL, $list597);
	methods.subloop_register_instance_method(AUX_VERB_TREE, GET_ADVERBIAL_COMPLEMENT, AUX_VERB_TREE_GET_ADVERBIAL_COMPLEMENT_METHOD);
	methods.methods_incorporate_instance_method(GET_SUBJECT, AUX_VERB_TREE, $list60, NIL, $list599);
	methods.subloop_register_instance_method(AUX_VERB_TREE, GET_SUBJECT, AUX_VERB_TREE_GET_SUBJECT_METHOD);
	methods.methods_incorporate_instance_method(GET_DIRECT_OBJECT, AUX_VERB_TREE, $list60, NIL, $list602);
	methods.subloop_register_instance_method(AUX_VERB_TREE, GET_DIRECT_OBJECT, AUX_VERB_TREE_GET_DIRECT_OBJECT_METHOD);
	methods.methods_incorporate_instance_method(GET_INDIRECT_OBJECT, AUX_VERB_TREE, $list60, NIL, $list605);
	methods.subloop_register_instance_method(AUX_VERB_TREE, GET_INDIRECT_OBJECT, AUX_VERB_TREE_GET_INDIRECT_OBJECT_METHOD);
	methods.methods_incorporate_instance_method(GET_SEMANTIC_SUBJECT, AUX_VERB_TREE, $list60, NIL, $list607);
	methods.subloop_register_instance_method(AUX_VERB_TREE, GET_SEMANTIC_SUBJECT, AUX_VERB_TREE_GET_SEMANTIC_SUBJECT_METHOD);
	methods.methods_incorporate_instance_method(INVERTED_P, AUX_VERB_TREE, $list8, NIL, $list609);
	methods.subloop_register_instance_method(AUX_VERB_TREE, INVERTED_P, AUX_VERB_TREE_INVERTED_P_METHOD);
	methods.methods_incorporate_instance_method(PASSIVE_P, AUX_VERB_TREE, $list8, NIL, $list611);
	methods.subloop_register_instance_method(AUX_VERB_TREE, PASSIVE_P, AUX_VERB_TREE_PASSIVE_P_METHOD);
	classes.subloop_new_class(MODAL_VERB_TREE, AUX_VERB_TREE, $list516, NIL, $list614);
	classes.class_set_implements_slot_listeners(MODAL_VERB_TREE, NIL);
	classes.subloop_note_class_initialization_function(MODAL_VERB_TREE, SUBLOOP_RESERVED_INITIALIZE_MODAL_VERB_TREE_CLASS);
	classes.subloop_note_instance_initialization_function(MODAL_VERB_TREE, SUBLOOP_RESERVED_INITIALIZE_MODAL_VERB_TREE_INSTANCE);
	subloop_reserved_initialize_modal_verb_tree_class(MODAL_VERB_TREE);
	methods.methods_incorporate_instance_method(GET_TENSE, MODAL_VERB_TREE, $list60, NIL, $list617);
	methods.subloop_register_instance_method(MODAL_VERB_TREE, GET_TENSE, MODAL_VERB_TREE_GET_TENSE_METHOD);
	methods.methods_incorporate_instance_method(GET_OBJECTS, MODAL_VERB_TREE, $list60, NIL, $list622);
	methods.subloop_register_instance_method(MODAL_VERB_TREE, GET_OBJECTS, MODAL_VERB_TREE_GET_OBJECTS_METHOD);
	classes.subloop_new_class(ADJECTIVAL_WORD_TREE, MODIFIER_WORD_TREE, $list625, NIL, $list626);
	classes.class_set_implements_slot_listeners(ADJECTIVAL_WORD_TREE, NIL);
	methods.methods_incorporate_instance_method(GET_KEYWORD_RENAMINGS, ADJECTIVAL_WORD_TREE, $list8, $list627, $list628);
	methods.subloop_register_instance_method(ADJECTIVAL_WORD_TREE, GET_KEYWORD_RENAMINGS, ADJECTIVAL_WORD_TREE_GET_KEYWORD_RENAMINGS_METHOD);
	methods.methods_incorporate_instance_method(GET_COMPLEMENTS, ADJECTIVAL_WORD_TREE, $list60, NIL, $list631);
	methods.subloop_register_instance_method(ADJECTIVAL_WORD_TREE, GET_COMPLEMENTS, ADJECTIVAL_WORD_TREE_GET_COMPLEMENTS_METHOD);
	classes.subloop_note_class_initialization_function(ADJECTIVAL_WORD_TREE, SUBLOOP_RESERVED_INITIALIZE_ADJECTIVAL_WORD_TREE_CLASS);
	classes.subloop_note_instance_initialization_function(ADJECTIVAL_WORD_TREE, SUBLOOP_RESERVED_INITIALIZE_ADJECTIVAL_WORD_TREE_INSTANCE);
	subloop_reserved_initialize_adjectival_word_tree_class(ADJECTIVAL_WORD_TREE);
	methods.methods_incorporate_instance_method(GET_MODIFIEDS, ADJECTIVAL_WORD_TREE, $list60, NIL, $list635);
	methods.subloop_register_instance_method(ADJECTIVAL_WORD_TREE, GET_MODIFIEDS, ADJECTIVAL_WORD_TREE_GET_MODIFIEDS_METHOD);
	methods.methods_incorporate_instance_method(GET_VERBAL_COMPLEMENT, ADJECTIVAL_WORD_TREE, $list60, NIL, $list639);
	methods.subloop_register_instance_method(ADJECTIVAL_WORD_TREE, GET_VERBAL_COMPLEMENT, ADJECTIVAL_WORD_TREE_GET_VERBAL_COMPLEMENT_METHOD);
	classes.subloop_new_class(ADVERBIAL_WORD_TREE, MODIFIER_WORD_TREE, $list644, NIL, $list645);
	classes.class_set_implements_slot_listeners(ADVERBIAL_WORD_TREE, NIL);
	methods.methods_incorporate_instance_method(GET_KEYWORD_RENAMINGS, ADVERBIAL_WORD_TREE, $list8, $list646, $list647);
	methods.subloop_register_instance_method(ADVERBIAL_WORD_TREE, GET_KEYWORD_RENAMINGS, ADVERBIAL_WORD_TREE_GET_KEYWORD_RENAMINGS_METHOD);
	classes.subloop_note_class_initialization_function(ADVERBIAL_WORD_TREE, SUBLOOP_RESERVED_INITIALIZE_ADVERBIAL_WORD_TREE_CLASS);
	classes.subloop_note_instance_initialization_function(ADVERBIAL_WORD_TREE, SUBLOOP_RESERVED_INITIALIZE_ADVERBIAL_WORD_TREE_INSTANCE);
	subloop_reserved_initialize_adverbial_word_tree_class(ADVERBIAL_WORD_TREE);
	methods.methods_incorporate_instance_method(GET_MODIFIEDS, ADVERBIAL_WORD_TREE, $list60, NIL, $list652);
	methods.subloop_register_instance_method(ADVERBIAL_WORD_TREE, GET_MODIFIEDS, ADVERBIAL_WORD_TREE_GET_MODIFIEDS_METHOD);
	classes.subloop_new_class(WRB_WORD_TREE, ADVERBIAL_WORD_TREE, $list655, NIL, NIL);
	classes.class_set_implements_slot_listeners(WRB_WORD_TREE, NIL);
	classes.subloop_note_class_initialization_function(WRB_WORD_TREE, SUBLOOP_RESERVED_INITIALIZE_WRB_WORD_TREE_CLASS);
	classes.subloop_note_instance_initialization_function(WRB_WORD_TREE, SUBLOOP_RESERVED_INITIALIZE_WRB_WORD_TREE_INSTANCE);
	subloop_reserved_initialize_wrb_word_tree_class(WRB_WORD_TREE);
	classes.subloop_new_class(PREPOSITIONAL_OR_PARTICLE_WORD_TREE, FUNCTION_WORD_TREE, $list659, NIL, $list660);
	classes.class_set_implements_slot_listeners(PREPOSITIONAL_OR_PARTICLE_WORD_TREE, NIL);
	methods.methods_incorporate_instance_method(GET_KEYWORD_RENAMINGS, PREPOSITIONAL_OR_PARTICLE_WORD_TREE, $list8, $list661, $list662);
	methods.subloop_register_instance_method(PREPOSITIONAL_OR_PARTICLE_WORD_TREE, GET_KEYWORD_RENAMINGS, PREPOSITIONAL_OR_PARTICLE_WORD_TREE_GET_KEYWORD_RENAMINGS_METHOD);
	classes.subloop_note_class_initialization_function(PREPOSITIONAL_OR_PARTICLE_WORD_TREE, $sym665$SUBLOOP_RESERVED_INITIALIZE_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_C);
	classes.subloop_note_instance_initialization_function(PREPOSITIONAL_OR_PARTICLE_WORD_TREE, $sym666$SUBLOOP_RESERVED_INITIALIZE_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_I);
	subloop_reserved_initialize_prepositional_or_particle_word_tree_class(PREPOSITIONAL_OR_PARTICLE_WORD_TREE);
	methods.methods_incorporate_instance_method(GET_OBLIQUE_OBJECT, PREPOSITIONAL_OR_PARTICLE_WORD_TREE, $list60, NIL, $list667);
	methods.subloop_register_instance_method(PREPOSITIONAL_OR_PARTICLE_WORD_TREE, GET_OBLIQUE_OBJECT, PREPOSITIONAL_OR_PARTICLE_WORD_TREE_GET_OBLIQUE_OBJECT_METHOD);
	methods.methods_incorporate_instance_method(GET_VERBAL_COMPLEMENT, PREPOSITIONAL_OR_PARTICLE_WORD_TREE, $list60, NIL, $list669);
	methods.subloop_register_instance_method(PREPOSITIONAL_OR_PARTICLE_WORD_TREE, GET_VERBAL_COMPLEMENT, PREPOSITIONAL_OR_PARTICLE_WORD_TREE_GET_VERBAL_COMPLEMENT_METHOD);
	methods.methods_incorporate_instance_method(GET_COMPLEMENTS, PREPOSITIONAL_OR_PARTICLE_WORD_TREE, $list60, NIL, $list673);
	methods.subloop_register_instance_method(PREPOSITIONAL_OR_PARTICLE_WORD_TREE, GET_COMPLEMENTS, PREPOSITIONAL_OR_PARTICLE_WORD_TREE_GET_COMPLEMENTS_METHOD);
	methods.methods_incorporate_instance_method(GET_MODIFIEDS, PREPOSITIONAL_OR_PARTICLE_WORD_TREE, $list60, NIL, $list675);
	methods.subloop_register_instance_method(PREPOSITIONAL_OR_PARTICLE_WORD_TREE, GET_MODIFIEDS, PREPOSITIONAL_OR_PARTICLE_WORD_TREE_GET_MODIFIEDS_METHOD);
	methods.methods_incorporate_instance_method(GET_REFS, PREPOSITIONAL_OR_PARTICLE_WORD_TREE, $list60, NIL, $list679);
	methods.subloop_register_instance_method(PREPOSITIONAL_OR_PARTICLE_WORD_TREE, GET_REFS, PREPOSITIONAL_OR_PARTICLE_WORD_TREE_GET_REFS_METHOD);
	methods.methods_incorporate_instance_method(GET_ANTECEDENT, PREPOSITIONAL_OR_PARTICLE_WORD_TREE, $list60, NIL, $list682);
	methods.subloop_register_instance_method(PREPOSITIONAL_OR_PARTICLE_WORD_TREE, GET_ANTECEDENT, PREPOSITIONAL_OR_PARTICLE_WORD_TREE_GET_ANTECEDENT_METHOD);
	classes.subloop_new_class(PREPOSITIONAL_WORD_TREE, PREPOSITIONAL_OR_PARTICLE_WORD_TREE, $list686, NIL, NIL);
	classes.class_set_implements_slot_listeners(PREPOSITIONAL_WORD_TREE, NIL);
	classes.subloop_note_class_initialization_function(PREPOSITIONAL_WORD_TREE, SUBLOOP_RESERVED_INITIALIZE_PREPOSITIONAL_WORD_TREE_CLASS);
	classes.subloop_note_instance_initialization_function(PREPOSITIONAL_WORD_TREE, SUBLOOP_RESERVED_INITIALIZE_PREPOSITIONAL_WORD_TREE_INSTANCE);
	subloop_reserved_initialize_prepositional_word_tree_class(PREPOSITIONAL_WORD_TREE);
	classes.subloop_new_class(PARTICLE_WORD_TREE, PREPOSITIONAL_OR_PARTICLE_WORD_TREE, $list690, NIL, NIL);
	classes.class_set_implements_slot_listeners(PARTICLE_WORD_TREE, NIL);
	classes.subloop_note_class_initialization_function(PARTICLE_WORD_TREE, SUBLOOP_RESERVED_INITIALIZE_PARTICLE_WORD_TREE_CLASS);
	classes.subloop_note_instance_initialization_function(PARTICLE_WORD_TREE, SUBLOOP_RESERVED_INITIALIZE_PARTICLE_WORD_TREE_INSTANCE);
	subloop_reserved_initialize_particle_word_tree_class(PARTICLE_WORD_TREE);
	classes.subloop_new_class(SPECIFIER_WORD_TREE, WORD_TREE, NIL, NIL, $list694);
	classes.class_set_implements_slot_listeners(SPECIFIER_WORD_TREE, NIL);
	classes.subloop_note_class_initialization_function(SPECIFIER_WORD_TREE, SUBLOOP_RESERVED_INITIALIZE_SPECIFIER_WORD_TREE_CLASS);
	classes.subloop_note_instance_initialization_function(SPECIFIER_WORD_TREE, SUBLOOP_RESERVED_INITIALIZE_SPECIFIER_WORD_TREE_INSTANCE);
	subloop_reserved_initialize_specifier_word_tree_class(SPECIFIER_WORD_TREE);
	methods.methods_incorporate_instance_method(GET_SPECIFIED, SPECIFIER_WORD_TREE, $list60, NIL, $list698);
	methods.subloop_register_instance_method(SPECIFIER_WORD_TREE, GET_SPECIFIED, SPECIFIER_WORD_TREE_GET_SPECIFIED_METHOD);
	classes.subloop_new_class(QUANTIFIER_WORD_TREE, SPECIFIER_WORD_TREE, $list702, NIL, $list703);
	classes.class_set_implements_slot_listeners(QUANTIFIER_WORD_TREE, NIL);
	methods.methods_incorporate_instance_method(GET_KEYWORD_RENAMINGS, QUANTIFIER_WORD_TREE, $list8, $list704, $list705);
	methods.subloop_register_instance_method(QUANTIFIER_WORD_TREE, GET_KEYWORD_RENAMINGS, QUANTIFIER_WORD_TREE_GET_KEYWORD_RENAMINGS_METHOD);
	classes.subloop_note_class_initialization_function(QUANTIFIER_WORD_TREE, SUBLOOP_RESERVED_INITIALIZE_QUANTIFIER_WORD_TREE_CLASS);
	classes.subloop_note_instance_initialization_function(QUANTIFIER_WORD_TREE, SUBLOOP_RESERVED_INITIALIZE_QUANTIFIER_WORD_TREE_INSTANCE);
	subloop_reserved_initialize_quantifier_word_tree_class(QUANTIFIER_WORD_TREE);
	methods.methods_incorporate_instance_method(GET_QUANTIFIED, QUANTIFIER_WORD_TREE, $list60, NIL, $list711);
	methods.subloop_register_instance_method(QUANTIFIER_WORD_TREE, GET_QUANTIFIED, QUANTIFIER_WORD_TREE_GET_QUANTIFIED_METHOD);
	methods.methods_incorporate_instance_method(GET_SPECIFIED, QUANTIFIER_WORD_TREE, $list60, NIL, $list714);
	methods.subloop_register_instance_method(QUANTIFIER_WORD_TREE, GET_SPECIFIED, QUANTIFIER_WORD_TREE_GET_SPECIFIED_METHOD);
	classes.subloop_new_class(DETERMINER_WORD_TREE, QUANTIFIER_WORD_TREE, NIL, NIL, NIL);
	classes.class_set_implements_slot_listeners(DETERMINER_WORD_TREE, NIL);
	classes.subloop_note_class_initialization_function(DETERMINER_WORD_TREE, SUBLOOP_RESERVED_INITIALIZE_DETERMINER_WORD_TREE_CLASS);
	classes.subloop_note_instance_initialization_function(DETERMINER_WORD_TREE, SUBLOOP_RESERVED_INITIALIZE_DETERMINER_WORD_TREE_INSTANCE);
	subloop_reserved_initialize_determiner_word_tree_class(DETERMINER_WORD_TREE);
	classes.subloop_new_class($sym719$PRP__TREE, SPECIFIER_WORD_TREE, $list338, NIL, $list339);
	classes.class_set_implements_slot_listeners($sym719$PRP__TREE, NIL);
	classes.subloop_note_class_initialization_function($sym719$PRP__TREE, $sym720$SUBLOOP_RESERVED_INITIALIZE_PRP__TREE_CLASS);
	classes.subloop_note_instance_initialization_function($sym719$PRP__TREE, $sym721$SUBLOOP_RESERVED_INITIALIZE_PRP__TREE_INSTANCE);
	subloop_reserved_initialize_prpX_tree_class($sym719$PRP__TREE);
	methods.methods_incorporate_instance_method(GET_NUMBER, $sym719$PRP__TREE, $list60, NIL, $list724);
	methods.subloop_register_instance_method($sym719$PRP__TREE, GET_NUMBER, $sym726$PRP__TREE_GET_NUMBER_METHOD);
	methods.methods_incorporate_instance_method(GET_PERSON, $sym719$PRP__TREE, $list60, NIL, $list727);
	methods.subloop_register_instance_method($sym719$PRP__TREE, GET_PERSON, $sym732$PRP__TREE_GET_PERSON_METHOD);
	methods.methods_incorporate_instance_method(GET_GENDER, $sym719$PRP__TREE, $list60, NIL, $list733);
	methods.subloop_register_instance_method($sym719$PRP__TREE, GET_GENDER, $sym736$PRP__TREE_GET_GENDER_METHOD);
	classes.subloop_new_class(WDT_WORD_TREE, DETERMINER_WORD_TREE, $list655, NIL, $list738);
	classes.class_set_implements_slot_listeners(WDT_WORD_TREE, NIL);
	classes.subloop_note_class_initialization_function(WDT_WORD_TREE, SUBLOOP_RESERVED_INITIALIZE_WDT_WORD_TREE_CLASS);
	classes.subloop_note_instance_initialization_function(WDT_WORD_TREE, SUBLOOP_RESERVED_INITIALIZE_WDT_WORD_TREE_INSTANCE);
	subloop_reserved_initialize_wdt_word_tree_class(WDT_WORD_TREE);
	methods.methods_incorporate_instance_method(GET_REFS, WDT_WORD_TREE, $list60, NIL, $list364);
	methods.subloop_register_instance_method(WDT_WORD_TREE, GET_REFS, WDT_WORD_TREE_GET_REFS_METHOD);
	methods.methods_incorporate_instance_method(GET_ANTECEDENT, WDT_WORD_TREE, $list60, NIL, $list367);
	methods.subloop_register_instance_method(WDT_WORD_TREE, GET_ANTECEDENT, WDT_WORD_TREE_GET_ANTECEDENT_METHOD);
	classes.subloop_new_class(POSSESSIVE_WORD_TREE, FUNCTION_WORD_TREE, $list746, NIL, $list747);
	classes.class_set_implements_slot_listeners(POSSESSIVE_WORD_TREE, NIL);
	methods.methods_incorporate_instance_method(GET_KEYWORD_RENAMINGS, POSSESSIVE_WORD_TREE, $list8, $list748, $list749);
	methods.subloop_register_instance_method(POSSESSIVE_WORD_TREE, GET_KEYWORD_RENAMINGS, POSSESSIVE_WORD_TREE_GET_KEYWORD_RENAMINGS_METHOD);
	classes.subloop_note_class_initialization_function(POSSESSIVE_WORD_TREE, SUBLOOP_RESERVED_INITIALIZE_POSSESSIVE_WORD_TREE_CLASS);
	classes.subloop_note_instance_initialization_function(POSSESSIVE_WORD_TREE, SUBLOOP_RESERVED_INITIALIZE_POSSESSIVE_WORD_TREE_INSTANCE);
	subloop_reserved_initialize_possessive_word_tree_class(POSSESSIVE_WORD_TREE);
	methods.methods_incorporate_instance_method(GET_POSSESSOR, POSSESSIVE_WORD_TREE, $list60, NIL, $list756);
	methods.subloop_register_instance_method(POSSESSIVE_WORD_TREE, GET_POSSESSOR, POSSESSIVE_WORD_TREE_GET_POSSESSOR_METHOD);
	methods.methods_incorporate_instance_method(GET_POSSESSED, POSSESSIVE_WORD_TREE, $list60, NIL, $list758);
	methods.subloop_register_instance_method(POSSESSIVE_WORD_TREE, GET_POSSESSED, POSSESSIVE_WORD_TREE_GET_POSSESSED_METHOD);
	methods.methods_incorporate_instance_method(GET_COMPLEMENTS, POSSESSIVE_WORD_TREE, $list60, NIL, $list761);
	methods.subloop_register_instance_method(POSSESSIVE_WORD_TREE, GET_COMPLEMENTS, POSSESSIVE_WORD_TREE_GET_COMPLEMENTS_METHOD);
	methods.methods_incorporate_instance_method(GET_MODIFIEDS, POSSESSIVE_WORD_TREE, $list60, NIL, $list763);
	methods.subloop_register_instance_method(POSSESSIVE_WORD_TREE, GET_MODIFIEDS, POSSESSIVE_WORD_TREE_GET_MODIFIEDS_METHOD);
	classes.subloop_new_class(CARDINAL_WORD_TREE, QUANTIFIER_WORD_TREE, $list767, NIL, NIL);
	classes.class_set_implements_slot_listeners(CARDINAL_WORD_TREE, NIL);
	classes.subloop_note_class_initialization_function(CARDINAL_WORD_TREE, SUBLOOP_RESERVED_INITIALIZE_CARDINAL_WORD_TREE_CLASS);
	classes.subloop_note_instance_initialization_function(CARDINAL_WORD_TREE, SUBLOOP_RESERVED_INITIALIZE_CARDINAL_WORD_TREE_INSTANCE);
	subloop_reserved_initialize_cardinal_word_tree_class(CARDINAL_WORD_TREE);
	classes.subloop_new_class(EXISTENTIAL_WORD_TREE, FUNCTION_WORD_TREE, NIL, NIL, NIL);
	classes.class_set_implements_slot_listeners(EXISTENTIAL_WORD_TREE, NIL);
	classes.subloop_note_class_initialization_function(EXISTENTIAL_WORD_TREE, SUBLOOP_RESERVED_INITIALIZE_EXISTENTIAL_WORD_TREE_CLASS);
	classes.subloop_note_instance_initialization_function(EXISTENTIAL_WORD_TREE, SUBLOOP_RESERVED_INITIALIZE_EXISTENTIAL_WORD_TREE_INSTANCE);
	subloop_reserved_initialize_existential_word_tree_class(EXISTENTIAL_WORD_TREE);
	classes.subloop_new_class(PUNCTUATION_WORD_TREE, WORD_TREE, $list774, NIL, NIL);
	classes.class_set_implements_slot_listeners(PUNCTUATION_WORD_TREE, NIL);
	classes.subloop_note_class_initialization_function(PUNCTUATION_WORD_TREE, SUBLOOP_RESERVED_INITIALIZE_PUNCTUATION_WORD_TREE_CLASS);
	classes.subloop_note_instance_initialization_function(PUNCTUATION_WORD_TREE, SUBLOOP_RESERVED_INITIALIZE_PUNCTUATION_WORD_TREE_INSTANCE);
	subloop_reserved_initialize_punctuation_word_tree_class(PUNCTUATION_WORD_TREE);
	classes.subloop_new_class(MULTI_NOUN_TREE, NOMINAL_WORD_TREE, NIL, NIL, $list779);
	classes.class_set_implements_slot_listeners(MULTI_NOUN_TREE, NIL);
	classes.subloop_note_class_initialization_function(MULTI_NOUN_TREE, SUBLOOP_RESERVED_INITIALIZE_MULTI_NOUN_TREE_CLASS);
	classes.subloop_note_instance_initialization_function(MULTI_NOUN_TREE, SUBLOOP_RESERVED_INITIALIZE_MULTI_NOUN_TREE_INSTANCE);
	subloop_reserved_initialize_multi_noun_tree_class(MULTI_NOUN_TREE);
	methods.methods_incorporate_instance_method(COVERS, PARSE_TREE, $list60, $list784, $list785);
	methods.subloop_register_instance_method(PARSE_TREE, COVERS, PARSE_TREE_COVERS_METHOD);
	methods.methods_incorporate_instance_method(COVERS_MINIMALLY, PARSE_TREE, $list8, $list784, $list788);
	methods.subloop_register_instance_method(PARSE_TREE, COVERS_MINIMALLY, PARSE_TREE_COVERS_MINIMALLY_METHOD);
	methods.methods_incorporate_instance_method(GET_MINIMALLY_COVERING_SUBTREES, PARSE_TREE, $list60, $list784, $list792);
	methods.subloop_register_instance_method(PARSE_TREE, GET_MINIMALLY_COVERING_SUBTREES, PARSE_TREE_GET_MINIMALLY_COVERING_SUBTREES_METHOD);
	return NIL;
    }

    /**
     *
     *
     * @return parse-tree-p; the tree that this specifier specifies
     */
    @LispMethod(comment = "@return parse-tree-p; the tree that this specifier specifies")
    public static SubLObject specifier_word_tree_get_specified_method(final SubLObject self) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject catch_var_for_specifier_word_tree_method = NIL;
	final SubLObject mother = parse_tree.get_parse_tree_mother(self);
	try {
	    thread.throwStack.push($sym699$OUTER_CATCH_FOR_SPECIFIER_WORD_TREE_METHOD);
	    try {
		sublisp_throw($sym699$OUTER_CATCH_FOR_SPECIFIER_WORD_TREE_METHOD, methods.funcall_instance_method_with_0_args(mother, GET_HEAD));
	    } finally {
		final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    parse_tree.set_parse_tree_mother(self, mother);
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
		}
	    }
	} catch (final Throwable ccatch_env_var) {
	    catch_var_for_specifier_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym699$OUTER_CATCH_FOR_SPECIFIER_WORD_TREE_METHOD);
	} finally {
	    thread.throwStack.pop();
	}
	return catch_var_for_specifier_word_tree_method;
    }

    /**
     *
     *
     * @return parse-tree-p; the tree that this specifier specifies
     */
    @LispMethod(comment = "@return parse-tree-p; the tree that this specifier specifies")
    public static final SubLObject specifier_word_tree_get_specified_method_alt(SubLObject self) {
	{
	    SubLObject catch_var_for_specifier_word_tree_method = NIL;
	    SubLObject mother = parse_tree.get_parse_tree_mother(self);
	    try {
		try {
		    sublisp_throw($sym699$OUTER_CATCH_FOR_SPECIFIER_WORD_TREE_METHOD, methods.funcall_instance_method_with_0_args(mother, GET_HEAD));
		} finally {
		    {
			SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
			try {
			    bind($is_thread_performing_cleanupP$, T);
			    parse_tree.set_parse_tree_mother(self, mother);
			} finally {
			    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
			}
		    }
		}
	    } catch (Throwable ccatch_env_var) {
		catch_var_for_specifier_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym699$OUTER_CATCH_FOR_SPECIFIER_WORD_TREE_METHOD);
	    }
	    return catch_var_for_specifier_word_tree_method;
	}
    }

    public static SubLObject specifier_word_tree_p(final SubLObject specifier_word_tree) {
	return classes.subloop_instanceof_class(specifier_word_tree, SPECIFIER_WORD_TREE);
    }

    public static final SubLObject specifier_word_tree_p_alt(SubLObject specifier_word_tree) {
	return classes.subloop_instanceof_class(specifier_word_tree, SPECIFIER_WORD_TREE);
    }

    public static SubLObject subloop_reserved_initialize_adjectival_word_tree_class(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_adjectival_word_tree_class_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_adjectival_word_tree_instance(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_adjectival_word_tree_instance_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_adverbial_word_tree_class(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_adverbial_word_tree_class_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_adverbial_word_tree_instance(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_adverbial_word_tree_instance_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_aux_verb_tree_class(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_aux_verb_tree_class_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_aux_verb_tree_instance(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_aux_verb_tree_instance_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_cardinal_word_tree_class(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cardinal_word_tree_class_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_cardinal_word_tree_instance(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_cardinal_word_tree_instance_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_coordinate_phrase_tree_class(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_coordinate_phrase_tree_class_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_coordinate_phrase_tree_instance(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, PHRASE_TREE, DAUGHTERS, NIL);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_coordinate_phrase_tree_instance_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, PHRASE_TREE, DAUGHTERS, NIL);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_coordinate_word_tree_class(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_coordinate_word_tree_class_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_coordinate_word_tree_instance(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_coordinate_word_tree_instance_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_determiner_word_tree_class(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_determiner_word_tree_class_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_determiner_word_tree_instance(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_determiner_word_tree_instance_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_dollar_word_tree_class(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_dollar_word_tree_class_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_dollar_word_tree_instance(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_dollar_word_tree_instance_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_existential_word_tree_class(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_existential_word_tree_class_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_existential_word_tree_instance(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_existential_word_tree_instance_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_function_word_tree_class(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_function_word_tree_class_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_function_word_tree_instance(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_function_word_tree_instance_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_modal_verb_tree_class(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_modal_verb_tree_class_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_modal_verb_tree_instance(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_modal_verb_tree_instance_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_modifier_word_tree_class(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_modifier_word_tree_class_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_modifier_word_tree_instance(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_modifier_word_tree_instance_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_multi_noun_tree_class(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_multi_noun_tree_class_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_multi_noun_tree_instance(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	classes.subloop_initialize_slot(new_instance, MULTI_NOUN_TREE, DAUGHTERS, NIL);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_multi_noun_tree_instance_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	classes.subloop_initialize_slot(new_instance, MULTI_NOUN_TREE, DAUGHTERS, NIL);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_name_word_tree_class(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_name_word_tree_class_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_name_word_tree_instance(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_name_word_tree_instance_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_nn_tree_class(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_nn_tree_class_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_nn_tree_instance(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_nn_tree_instance_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_nnp_tree_class(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_nnp_tree_class_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_nnp_tree_instance(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_nnp_tree_instance_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_nnps_tree_class(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_nnps_tree_class_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_nnps_tree_instance(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_nnps_tree_instance_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_nns_tree_class(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_nns_tree_class_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_nns_tree_instance(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_nns_tree_instance_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_nominal_word_tree_class(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_nominal_word_tree_class_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_nominal_word_tree_instance(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_nominal_word_tree_instance_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_particle_word_tree_class(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_particle_word_tree_class_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_particle_word_tree_instance(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_particle_word_tree_instance_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_possessive_word_tree_class(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_possessive_word_tree_class_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_possessive_word_tree_instance(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_possessive_word_tree_instance_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_prepositional_or_particle_word_tree_class(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_prepositional_or_particle_word_tree_class_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_prepositional_or_particle_word_tree_instance(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_prepositional_or_particle_word_tree_instance_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_prepositional_word_tree_class(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_prepositional_word_tree_class_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_prepositional_word_tree_instance(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_prepositional_word_tree_instance_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_prp_tree_class(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_prp_tree_class_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_prp_tree_instance(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_prp_tree_instance_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_prpX_tree_class(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_prpX_tree_class_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_prpX_tree_instance(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_prpX_tree_instance_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_punctuation_word_tree_class(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_punctuation_word_tree_class_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_punctuation_word_tree_instance(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_punctuation_word_tree_instance_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_quantifier_word_tree_class(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_quantifier_word_tree_class_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_quantifier_word_tree_instance(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_quantifier_word_tree_instance_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_specifier_word_tree_class(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_specifier_word_tree_class_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_specifier_word_tree_instance(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_specifier_word_tree_instance_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_unlike_coordinate_phrase_tree_class(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_unlike_coordinate_phrase_tree_class_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_unlike_coordinate_phrase_tree_instance(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, PHRASE_TREE, DAUGHTERS, NIL);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_unlike_coordinate_phrase_tree_instance_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, PHRASE_TREE, DAUGHTERS, NIL);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_vb_tree_class(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_vb_tree_class_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_vb_tree_instance(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_vb_tree_instance_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_vbd_tree_class(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_vbd_tree_class_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_vbd_tree_instance(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_vbd_tree_instance_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_vbg_tree_class(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_vbg_tree_class_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_vbg_tree_instance(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_vbg_tree_instance_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_vbn_tree_class(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_vbn_tree_class_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_vbn_tree_instance(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_vbn_tree_instance_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_vbp_tree_class(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_vbp_tree_class_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_vbp_tree_instance(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_vbp_tree_instance_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_vbz_tree_class(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_vbz_tree_class_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_vbz_tree_instance(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_vbz_tree_instance_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_verbal_word_tree_class(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_verbal_word_tree_class_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_verbal_word_tree_instance(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_verbal_word_tree_instance_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_wdt_word_tree_class(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_wdt_word_tree_class_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_wdt_word_tree_instance(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_wdt_word_tree_instance_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_word_tree_class(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_word_tree_class_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_word_tree_instance(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_word_tree_instance_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_wp_tree_class(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_wp_tree_class_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_wp_tree_instance(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_wp_tree_instance_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_wrb_word_tree_class(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_wrb_word_tree_class_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
	return NIL;
    }

    public static SubLObject subloop_reserved_initialize_wrb_word_tree_instance(final SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_wrb_word_tree_instance_alt(SubLObject new_instance) {
	classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
	classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, STRING, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CATEGORY, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MOTHER, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, IDX, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, MODIFIERS, NIL);
	classes.subloop_initialize_slot(new_instance, PARSE_TREE, CONTEXT, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, LEXES, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, REFS, NIL);
	classes.subloop_initialize_slot(new_instance, WORD_TREE, ABS_IDX, NIL);
	return NIL;
    }

    /**
     *
     *
     * @return booleanp; t if TREE is temporal, nil otherwise
     */
    @LispMethod(comment = "@return booleanp; t if TREE is temporal, nil otherwise")
    public static SubLObject temporal_tree_p(final SubLObject tree) {
	return makeBoolean((NIL != parse_tree.parse_tree_p(tree)) && (NIL != methods.funcall_instance_method_with_0_args(tree, TEMPORAL_TREE_P)));
    }

    /**
     *
     *
     * @return booleanp; t if TREE is temporal, nil otherwise
     */
    @LispMethod(comment = "@return booleanp; t if TREE is temporal, nil otherwise")
    public static final SubLObject temporal_tree_p_alt(SubLObject tree) {
	return makeBoolean((NIL != parse_tree.parse_tree_p(tree)) && (NIL != methods.funcall_instance_method_with_0_args(tree, TEMPORAL_TREE_P)));
    }

    public static SubLObject unlike_coordinate_phrase_tree_coordinate_phrase_p_method(final SubLObject self) {
	return T;
    }

    public static final SubLObject unlike_coordinate_phrase_tree_coordinate_phrase_p_method_alt(SubLObject self) {
	return T;
    }

    public static SubLObject unlike_coordinate_phrase_tree_p(final SubLObject unlike_coordinate_phrase_tree) {
	return classes.subloop_instanceof_class(unlike_coordinate_phrase_tree, UNLIKE_COORDINATE_PHRASE_TREE);
    }

    public static final SubLObject unlike_coordinate_phrase_tree_p_alt(SubLObject unlike_coordinate_phrase_tree) {
	return classes.subloop_instanceof_class(unlike_coordinate_phrase_tree, UNLIKE_COORDINATE_PHRASE_TREE);
    }

    /**
     *
     *
     * @return keywordp; the tense of this verb; either :PRESENT, :PAST, :FUTURE,
    or :INFINITIVE
     */
    @LispMethod(comment = "@return keywordp; the tense of this verb; either :PRESENT, :PAST, :FUTURE,\r\nor :INFINITIVE")
    public static SubLObject vb_tree_get_tense_method(final SubLObject self) {
	return $INFINITIVE;
    }

    /**
     *
     *
     * @return keywordp; the tense of this verb; either :PRESENT, :PAST, :FUTURE,
    or :INFINITIVE
     */
    @LispMethod(comment = "@return keywordp; the tense of this verb; either :PRESENT, :PAST, :FUTURE,\r\nor :INFINITIVE")
    public static final SubLObject vb_tree_get_tense_method_alt(SubLObject self) {
	return $INFINITIVE;
    }

    public static SubLObject vb_tree_p(final SubLObject vb_tree) {
	return classes.subloop_instanceof_class(vb_tree, VB_TREE);
    }

    public static final SubLObject vb_tree_p_alt(SubLObject vb_tree) {
	return classes.subloop_instanceof_class(vb_tree, VB_TREE);
    }

    /**
     *
     *
     * @return keywordp; the tense of this verb; either :PRESENT, :PAST, :FUTURE,
    or :INFINITIVE
     */
    @LispMethod(comment = "@return keywordp; the tense of this verb; either :PRESENT, :PAST, :FUTURE,\r\nor :INFINITIVE")
    public static SubLObject vbd_tree_get_tense_method(final SubLObject self) {
	return $PAST;
    }

    /**
     *
     *
     * @return keywordp; the tense of this verb; either :PRESENT, :PAST, :FUTURE,
    or :INFINITIVE
     */
    @LispMethod(comment = "@return keywordp; the tense of this verb; either :PRESENT, :PAST, :FUTURE,\r\nor :INFINITIVE")
    public static final SubLObject vbd_tree_get_tense_method_alt(SubLObject self) {
	return $PAST;
    }

    public static SubLObject vbd_tree_p(final SubLObject vbd_tree) {
	return classes.subloop_instanceof_class(vbd_tree, VBD_TREE);
    }

    public static final SubLObject vbd_tree_p_alt(SubLObject vbd_tree) {
	return classes.subloop_instanceof_class(vbd_tree, VBD_TREE);
    }

    /**
     *
     *
     * @return aux-verb-tree-p; the aux verb of this participle form
     */
    @LispMethod(comment = "@return aux-verb-tree-p; the aux verb of this participle form")
    public static SubLObject vbg_tree_get_aux_verb_method(final SubLObject self) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject catch_var_for_vbg_tree_method = NIL;
	final SubLObject mother = parse_tree.get_parse_tree_mother(self);
	try {
	    thread.throwStack.push($sym564$OUTER_CATCH_FOR_VBG_TREE_METHOD);
	    try {
		final SubLObject grandmother = methods.funcall_instance_method_with_0_args(mother, GET_MOTHER);
		sublisp_throw($sym564$OUTER_CATCH_FOR_VBG_TREE_METHOD, NIL != grandmother ? methods.funcall_instance_method_with_1_args(grandmother, FIND_FIRST, AUX_VERB_TREE_P) : NIL);
	    } finally {
		final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    parse_tree.set_parse_tree_mother(self, mother);
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
		}
	    }
	} catch (final Throwable ccatch_env_var) {
	    catch_var_for_vbg_tree_method = Errors.handleThrowable(ccatch_env_var, $sym564$OUTER_CATCH_FOR_VBG_TREE_METHOD);
	} finally {
	    thread.throwStack.pop();
	}
	return catch_var_for_vbg_tree_method;
    }

    /**
     *
     *
     * @return aux-verb-tree-p; the aux verb of this participle form
     */
    @LispMethod(comment = "@return aux-verb-tree-p; the aux verb of this participle form")
    public static final SubLObject vbg_tree_get_aux_verb_method_alt(SubLObject self) {
	{
	    SubLObject catch_var_for_vbg_tree_method = NIL;
	    SubLObject mother = parse_tree.get_parse_tree_mother(self);
	    try {
		try {
		    {
			SubLObject grandmother = methods.funcall_instance_method_with_0_args(mother, GET_MOTHER);
			sublisp_throw($sym564$OUTER_CATCH_FOR_VBG_TREE_METHOD, NIL != grandmother ? ((SubLObject) (methods.funcall_instance_method_with_1_args(grandmother, FIND_FIRST, AUX_VERB_TREE_P))) : NIL);
		    }
		} finally {
		    {
			SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
			try {
			    bind($is_thread_performing_cleanupP$, T);
			    parse_tree.set_parse_tree_mother(self, mother);
			} finally {
			    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
			}
		    }
		}
	    } catch (Throwable ccatch_env_var) {
		catch_var_for_vbg_tree_method = Errors.handleThrowable(ccatch_env_var, $sym564$OUTER_CATCH_FOR_VBG_TREE_METHOD);
	    }
	    return catch_var_for_vbg_tree_method;
	}
    }

    /**
     *
     *
     * @return listp; a list of constituents this verb modifies
     */
    @LispMethod(comment = "@return listp; a list of constituents this verb modifies")
    public static SubLObject vbg_tree_get_modifieds_method(final SubLObject self) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject catch_var_for_vbg_tree_method = NIL;
	final SubLObject mother = parse_tree.get_parse_tree_mother(self);
	try {
	    thread.throwStack.push($sym567$OUTER_CATCH_FOR_VBG_TREE_METHOD);
	    try {
		if (NIL == methods.funcall_instance_method_with_0_args(self, GET_AUX_VERB)) {
		    final SubLObject grandmother = methods.funcall_instance_method_with_0_args(mother, GET_MOTHER);
		    final SubLObject grandmas_head = ((NIL != grandmother) && (NIL != parse_tree.nominal_phrase_tree_p(grandmother))) ? methods.funcall_instance_method_with_0_args(grandmother, GET_HEAD) : NIL;
		    sublisp_throw($sym567$OUTER_CATCH_FOR_VBG_TREE_METHOD, NIL != grandmas_head ? list(grandmas_head) : NIL);
		}
	    } finally {
		final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    parse_tree.set_parse_tree_mother(self, mother);
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
		}
	    }
	} catch (final Throwable ccatch_env_var) {
	    catch_var_for_vbg_tree_method = Errors.handleThrowable(ccatch_env_var, $sym567$OUTER_CATCH_FOR_VBG_TREE_METHOD);
	} finally {
	    thread.throwStack.pop();
	}
	return catch_var_for_vbg_tree_method;
    }

    /**
     *
     *
     * @return listp; a list of constituents this verb modifies
     */
    @LispMethod(comment = "@return listp; a list of constituents this verb modifies")
    public static final SubLObject vbg_tree_get_modifieds_method_alt(SubLObject self) {
	{
	    SubLObject catch_var_for_vbg_tree_method = NIL;
	    SubLObject mother = parse_tree.get_parse_tree_mother(self);
	    try {
		try {
		    if (NIL == methods.funcall_instance_method_with_0_args(self, GET_AUX_VERB)) {
			{
			    SubLObject grandmother = methods.funcall_instance_method_with_0_args(mother, GET_MOTHER);
			    SubLObject grandmas_head = ((NIL != grandmother) && (NIL != parse_tree.nominal_phrase_tree_p(grandmother))) ? ((SubLObject) (methods.funcall_instance_method_with_0_args(grandmother, GET_HEAD))) : NIL;
			    sublisp_throw($sym567$OUTER_CATCH_FOR_VBG_TREE_METHOD, NIL != grandmas_head ? ((SubLObject) (list(grandmas_head))) : NIL);
			}
		    }
		} finally {
		    {
			SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
			try {
			    bind($is_thread_performing_cleanupP$, T);
			    parse_tree.set_parse_tree_mother(self, mother);
			} finally {
			    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
			}
		    }
		}
	    } catch (Throwable ccatch_env_var) {
		catch_var_for_vbg_tree_method = Errors.handleThrowable(ccatch_env_var, $sym567$OUTER_CATCH_FOR_VBG_TREE_METHOD);
	    }
	    return catch_var_for_vbg_tree_method;
	}
    }

    public static SubLObject vbg_tree_p(final SubLObject vbg_tree) {
	return classes.subloop_instanceof_class(vbg_tree, VBG_TREE);
    }

    public static final SubLObject vbg_tree_p_alt(SubLObject vbg_tree) {
	return classes.subloop_instanceof_class(vbg_tree, VBG_TREE);
    }

    /**
     *
     *
     * @return aux-verb-tree-p; the aux verb of this participle form
     */
    @LispMethod(comment = "@return aux-verb-tree-p; the aux verb of this participle form")
    public static SubLObject vbn_tree_get_aux_verb_method(final SubLObject self) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject catch_var_for_vbn_tree_method = NIL;
	final SubLObject mother = parse_tree.get_parse_tree_mother(self);
	try {
	    thread.throwStack.push($sym529$OUTER_CATCH_FOR_VBN_TREE_METHOD);
	    try {
		final SubLObject grandmother = methods.funcall_instance_method_with_0_args(mother, GET_MOTHER);
		sublisp_throw($sym529$OUTER_CATCH_FOR_VBN_TREE_METHOD, NIL != grandmother ? methods.funcall_instance_method_with_1_args(grandmother, FIND_FIRST, AUX_VERB_TREE_P) : NIL);
	    } finally {
		final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    parse_tree.set_parse_tree_mother(self, mother);
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
		}
	    }
	} catch (final Throwable ccatch_env_var) {
	    catch_var_for_vbn_tree_method = Errors.handleThrowable(ccatch_env_var, $sym529$OUTER_CATCH_FOR_VBN_TREE_METHOD);
	} finally {
	    thread.throwStack.pop();
	}
	return catch_var_for_vbn_tree_method;
    }

    /**
     *
     *
     * @return aux-verb-tree-p; the aux verb of this participle form
     */
    @LispMethod(comment = "@return aux-verb-tree-p; the aux verb of this participle form")
    public static final SubLObject vbn_tree_get_aux_verb_method_alt(SubLObject self) {
	{
	    SubLObject catch_var_for_vbn_tree_method = NIL;
	    SubLObject mother = parse_tree.get_parse_tree_mother(self);
	    try {
		try {
		    {
			SubLObject grandmother = methods.funcall_instance_method_with_0_args(mother, GET_MOTHER);
			sublisp_throw($sym529$OUTER_CATCH_FOR_VBN_TREE_METHOD, NIL != grandmother ? ((SubLObject) (methods.funcall_instance_method_with_1_args(grandmother, FIND_FIRST, AUX_VERB_TREE_P))) : NIL);
		    }
		} finally {
		    {
			SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
			try {
			    bind($is_thread_performing_cleanupP$, T);
			    parse_tree.set_parse_tree_mother(self, mother);
			} finally {
			    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
			}
		    }
		}
	    } catch (Throwable ccatch_env_var) {
		catch_var_for_vbn_tree_method = Errors.handleThrowable(ccatch_env_var, $sym529$OUTER_CATCH_FOR_VBN_TREE_METHOD);
	    }
	    return catch_var_for_vbn_tree_method;
	}
    }

    /**
     *
     *
     * @return phrase-tree-p; the semantic direct object of this verb
     */
    @LispMethod(comment = "@return phrase-tree-p; the semantic direct object of this verb")
    public static SubLObject vbn_tree_get_semantic_direct_object_method(final SubLObject self) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject catch_var_for_vbn_tree_method = NIL;
	final SubLObject idx = parse_tree.get_parse_tree_idx(self);
	final SubLObject mother = parse_tree.get_parse_tree_mother(self);
	try {
	    thread.throwStack.push($sym537$OUTER_CATCH_FOR_VBN_TREE_METHOD);
	    try {
		if (NIL != methods.funcall_instance_method_with_0_args(self, PASSIVE_P)) {
		    final SubLObject locals = methods.funcall_instance_method_with_2_args(mother, FIND, NOMINAL_TREE_P, number_utilities.f_1X(idx));
		    final SubLObject n = length(locals);
		    if (n.numE(ONE_INTEGER)) {
			sublisp_throw($sym537$OUTER_CATCH_FOR_VBN_TREE_METHOD, locals.first());
		    } else if (n.numE(ZERO_INTEGER)) {
			sublisp_throw($sym537$OUTER_CATCH_FOR_VBN_TREE_METHOD, methods.funcall_instance_method_with_0_args(self, GET_SUBJECT));
		    }

		} else {
		    sublisp_throw($sym537$OUTER_CATCH_FOR_VBN_TREE_METHOD, methods.funcall_instance_method_with_0_args(self, GET_DIRECT_OBJECT));
		}
	    } finally {
		final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    parse_tree.set_parse_tree_idx(self, idx);
		    parse_tree.set_parse_tree_mother(self, mother);
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
		}
	    }
	} catch (final Throwable ccatch_env_var) {
	    catch_var_for_vbn_tree_method = Errors.handleThrowable(ccatch_env_var, $sym537$OUTER_CATCH_FOR_VBN_TREE_METHOD);
	} finally {
	    thread.throwStack.pop();
	}
	return catch_var_for_vbn_tree_method;
    }

    /**
     *
     *
     * @return phrase-tree-p; the semantic direct object of this verb
     */
    @LispMethod(comment = "@return phrase-tree-p; the semantic direct object of this verb")
    public static final SubLObject vbn_tree_get_semantic_direct_object_method_alt(SubLObject self) {
	{
	    SubLObject catch_var_for_vbn_tree_method = NIL;
	    SubLObject idx = parse_tree.get_parse_tree_idx(self);
	    SubLObject mother = parse_tree.get_parse_tree_mother(self);
	    try {
		try {
		    if (NIL != methods.funcall_instance_method_with_0_args(self, PASSIVE_P)) {
			{
			    SubLObject locals = methods.funcall_instance_method_with_2_args(mother, FIND, NOMINAL_TREE_P, number_utilities.f_1X(idx));
			    SubLObject n = length(locals);
			    if (n.numE(ONE_INTEGER)) {
				sublisp_throw($sym537$OUTER_CATCH_FOR_VBN_TREE_METHOD, locals.first());
			    } else {
				if (n.numE(ZERO_INTEGER)) {
				    sublisp_throw($sym537$OUTER_CATCH_FOR_VBN_TREE_METHOD, methods.funcall_instance_method_with_0_args(self, GET_SUBJECT));
				}
			    }
			}
		    } else {
			sublisp_throw($sym537$OUTER_CATCH_FOR_VBN_TREE_METHOD, methods.funcall_instance_method_with_0_args(self, GET_DIRECT_OBJECT));
		    }
		} finally {
		    {
			SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
			try {
			    bind($is_thread_performing_cleanupP$, T);
			    parse_tree.set_parse_tree_idx(self, idx);
			    parse_tree.set_parse_tree_mother(self, mother);
			} finally {
			    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
			}
		    }
		}
	    } catch (Throwable ccatch_env_var) {
		catch_var_for_vbn_tree_method = Errors.handleThrowable(ccatch_env_var, $sym537$OUTER_CATCH_FOR_VBN_TREE_METHOD);
	    }
	    return catch_var_for_vbn_tree_method;
	}
    }

    /**
     *
     *
     * @return phrase-tree-p; the semantic indirect object of this verb
     */
    @LispMethod(comment = "@return phrase-tree-p; the semantic indirect object of this verb")
    public static SubLObject vbn_tree_get_semantic_indirect_object_method(final SubLObject self) {
	if (NIL != methods.funcall_instance_method_with_0_args(self, PASSIVE_P)) {
	    final SubLObject oblique_object = methods.funcall_instance_method_with_0_args(self, GET_OBLIQUE_OBJECT);
	    return NIL != oblique_object ? oblique_object : methods.funcall_instance_method_with_0_args(self, GET_SUBJECT);
	}
	return methods.funcall_instance_method_with_0_args(self, GET_INDIRECT_OBJECT);
    }

    /**
     *
     *
     * @return phrase-tree-p; the semantic indirect object of this verb
     */
    @LispMethod(comment = "@return phrase-tree-p; the semantic indirect object of this verb")
    public static final SubLObject vbn_tree_get_semantic_indirect_object_method_alt(SubLObject self) {
	if (NIL != methods.funcall_instance_method_with_0_args(self, PASSIVE_P)) {
	    {
		SubLObject oblique_object = methods.funcall_instance_method_with_0_args(self, GET_OBLIQUE_OBJECT);
		return NIL != oblique_object ? ((SubLObject) (oblique_object)) : methods.funcall_instance_method_with_0_args(self, GET_SUBJECT);
	    }
	} else {
	    return methods.funcall_instance_method_with_0_args(self, GET_INDIRECT_OBJECT);
	}
    }

    /**
     *
     *
     * @return phrase-tree-p; the semantic subject of this verbal tree
     */
    @LispMethod(comment = "@return phrase-tree-p; the semantic subject of this verbal tree")
    public static SubLObject vbn_tree_get_semantic_subject_method(final SubLObject self) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject catch_var_for_vbn_tree_method = NIL;
	final SubLObject mother = parse_tree.get_parse_tree_mother(self);
	try {
	    thread.throwStack.push($sym533$OUTER_CATCH_FOR_VBN_TREE_METHOD);
	    try {
		if (NIL != methods.funcall_instance_method_with_0_args(self, PASSIVE_P)) {
		    final SubLObject pps = (NIL != mother) ? methods.funcall_instance_method_with_1_args(mother, FIND, PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE_P) : NIL;
		    SubLObject pphead = NIL;
		    SubLObject preposition = NIL;
		    SubLObject cdolist_list_var = pps;
		    SubLObject pp = NIL;
		    pp = cdolist_list_var.first();
		    while (NIL != cdolist_list_var) {
			pphead = methods.funcall_instance_method_with_0_args(pp, GET_HEAD);
			preposition = (NIL != pphead) ? methods.funcall_instance_method_with_0_args(pphead, GET_STRING) : NIL;
			if (preposition.equal($$$by)) {
			    sublisp_throw($sym533$OUTER_CATCH_FOR_VBN_TREE_METHOD, methods.funcall_instance_method_with_0_args(pp, GET_OBLIQUE_OBJECT));
			}
			cdolist_list_var = cdolist_list_var.rest();
			pp = cdolist_list_var.first();
		    }
		} else {
		    sublisp_throw($sym533$OUTER_CATCH_FOR_VBN_TREE_METHOD, methods.funcall_instance_method_with_0_args(self, GET_SUBJECT));
		}
	    } finally {
		final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    parse_tree.set_parse_tree_mother(self, mother);
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
		}
	    }
	} catch (final Throwable ccatch_env_var) {
	    catch_var_for_vbn_tree_method = Errors.handleThrowable(ccatch_env_var, $sym533$OUTER_CATCH_FOR_VBN_TREE_METHOD);
	} finally {
	    thread.throwStack.pop();
	}
	return catch_var_for_vbn_tree_method;
    }

    /**
     *
     *
     * @return phrase-tree-p; the semantic subject of this verbal tree
     */
    @LispMethod(comment = "@return phrase-tree-p; the semantic subject of this verbal tree")
    public static final SubLObject vbn_tree_get_semantic_subject_method_alt(SubLObject self) {
	{
	    SubLObject catch_var_for_vbn_tree_method = NIL;
	    SubLObject mother = parse_tree.get_parse_tree_mother(self);
	    try {
		try {
		    if (NIL != methods.funcall_instance_method_with_0_args(self, PASSIVE_P)) {
			{
			    SubLObject pps = (NIL != mother) ? ((SubLObject) (methods.funcall_instance_method_with_1_args(mother, FIND, PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE_P))) : NIL;
			    SubLObject pphead = NIL;
			    SubLObject preposition = NIL;
			    SubLObject cdolist_list_var = pps;
			    SubLObject pp = NIL;
			    for (pp = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), pp = cdolist_list_var.first()) {
				pphead = methods.funcall_instance_method_with_0_args(pp, GET_HEAD);
				preposition = (NIL != pphead) ? ((SubLObject) (methods.funcall_instance_method_with_0_args(pphead, GET_STRING))) : NIL;
				if (preposition.equal($$$by)) {
				    sublisp_throw($sym533$OUTER_CATCH_FOR_VBN_TREE_METHOD, methods.funcall_instance_method_with_0_args(pp, GET_OBLIQUE_OBJECT));
				}
			    }
			}
		    } else {
			sublisp_throw($sym533$OUTER_CATCH_FOR_VBN_TREE_METHOD, methods.funcall_instance_method_with_0_args(self, GET_SUBJECT));
		    }
		} finally {
		    {
			SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
			try {
			    bind($is_thread_performing_cleanupP$, T);
			    parse_tree.set_parse_tree_mother(self, mother);
			} finally {
			    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
			}
		    }
		}
	    } catch (Throwable ccatch_env_var) {
		catch_var_for_vbn_tree_method = Errors.handleThrowable(ccatch_env_var, $sym533$OUTER_CATCH_FOR_VBN_TREE_METHOD);
	    }
	    return catch_var_for_vbn_tree_method;
	}
    }

    public static SubLObject vbn_tree_p(final SubLObject vbn_tree) {
	return classes.subloop_instanceof_class(vbn_tree, VBN_TREE);
    }

    public static final SubLObject vbn_tree_p_alt(SubLObject vbn_tree) {
	return classes.subloop_instanceof_class(vbn_tree, VBN_TREE);
    }

    /**
     *
     *
     * @return booleanp; t if this verb is the head of a passive construction, nil otherwise
     */
    @LispMethod(comment = "@return booleanp; t if this verb is the head of a passive construction, nil otherwise")
    public static SubLObject vbn_tree_passive_p_method(final SubLObject self) {
	final SubLObject aux = methods.funcall_instance_method_with_0_args(self, GET_AUX_VERB);
	return makeBoolean((NIL != aux) && (NIL != member(methods.funcall_instance_method_with_0_args(aux, GET_STRING), $to_be_forms$.getGlobalValue(), EQUALP, UNPROVIDED)));
    }

    /**
     *
     *
     * @return booleanp; t if this verb is the head of a passive construction, nil otherwise
     */
    @LispMethod(comment = "@return booleanp; t if this verb is the head of a passive construction, nil otherwise")
    public static final SubLObject vbn_tree_passive_p_method_alt(SubLObject self) {
	{
	    SubLObject aux = methods.funcall_instance_method_with_0_args(self, GET_AUX_VERB);
	    return makeBoolean((NIL != aux) && (NIL != member(methods.funcall_instance_method_with_0_args(aux, GET_STRING), $to_be_forms$.getGlobalValue(), EQUALP, UNPROVIDED)));
	}
    }

    /**
     *
     *
     * @return keywordp; the tense of this verb; either :PRESENT, :PAST, :FUTURE,
    or :INFINITIVE
     */
    @LispMethod(comment = "@return keywordp; the tense of this verb; either :PRESENT, :PAST, :FUTURE,\r\nor :INFINITIVE")
    public static SubLObject vbp_tree_get_tense_method(final SubLObject self) {
	return $PRESENT;
    }

    /**
     *
     *
     * @return keywordp; the tense of this verb; either :PRESENT, :PAST, :FUTURE,
    or :INFINITIVE
     */
    @LispMethod(comment = "@return keywordp; the tense of this verb; either :PRESENT, :PAST, :FUTURE,\r\nor :INFINITIVE")
    public static final SubLObject vbp_tree_get_tense_method_alt(SubLObject self) {
	return $PRESENT;
    }

    public static SubLObject vbp_tree_p(final SubLObject vbp_tree) {
	return classes.subloop_instanceof_class(vbp_tree, VBP_TREE);
    }

    public static final SubLObject vbp_tree_p_alt(SubLObject vbp_tree) {
	return classes.subloop_instanceof_class(vbp_tree, VBP_TREE);
    }

    /**
     *
     *
     * @return keywordp; the tense of this verb; either :PRESENT, :PAST, :FUTURE,
    or :INFINITIVE
     */
    @LispMethod(comment = "@return keywordp; the tense of this verb; either :PRESENT, :PAST, :FUTURE,\r\nor :INFINITIVE")
    public static SubLObject vbz_tree_get_tense_method(final SubLObject self) {
	return $PRESENT;
    }

    /**
     *
     *
     * @return keywordp; the tense of this verb; either :PRESENT, :PAST, :FUTURE,
    or :INFINITIVE
     */
    @LispMethod(comment = "@return keywordp; the tense of this verb; either :PRESENT, :PAST, :FUTURE,\r\nor :INFINITIVE")
    public static final SubLObject vbz_tree_get_tense_method_alt(SubLObject self) {
	return $PRESENT;
    }

    public static SubLObject vbz_tree_p(final SubLObject vbz_tree) {
	return classes.subloop_instanceof_class(vbz_tree, VBZ_TREE);
    }

    public static final SubLObject vbz_tree_p_alt(SubLObject vbz_tree) {
	return classes.subloop_instanceof_class(vbz_tree, VBZ_TREE);
    }

    /**
     *
     *
     * @return booleanp; t if this verb is in its base form, nil otherwise
     */
    @LispMethod(comment = "@return booleanp; t if this verb is in its base form, nil otherwise")
    public static SubLObject verbal_word_tree_base_p_method(final SubLObject self) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject catch_var_for_verbal_word_tree_method = NIL;
	final SubLObject mother = parse_tree.get_parse_tree_mother(self);
	try {
	    thread.throwStack.push($sym511$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD);
	    try {
		final SubLObject grandmother = methods.funcall_instance_method_with_0_args(mother, GET_MOTHER);
		sublisp_throw($sym511$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, makeBoolean((NIL != methods.funcall_instance_method_with_0_args(self, INFINITIVE_P)) || ((NIL != grandmother)
			&& ((NIL != methods.funcall_instance_method_with_1_args(grandmother, FIND_FIRST, MODAL_VERB_TREE_P)) || methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(grandmother, GET_DAUGHTER, ZERO_INTEGER), GET_STRING).equalp($$$did)))));
	    } finally {
		final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    parse_tree.set_parse_tree_mother(self, mother);
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
		}
	    }
	} catch (final Throwable ccatch_env_var) {
	    catch_var_for_verbal_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym511$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD);
	} finally {
	    thread.throwStack.pop();
	}
	return catch_var_for_verbal_word_tree_method;
    }

    /**
     *
     *
     * @return booleanp; t if this verb is in its base form, nil otherwise
     */
    @LispMethod(comment = "@return booleanp; t if this verb is in its base form, nil otherwise")
    public static final SubLObject verbal_word_tree_base_p_method_alt(SubLObject self) {
	{
	    SubLObject catch_var_for_verbal_word_tree_method = NIL;
	    SubLObject mother = parse_tree.get_parse_tree_mother(self);
	    try {
		try {
		    {
			SubLObject grandmother = methods.funcall_instance_method_with_0_args(mother, GET_MOTHER);
			sublisp_throw($sym511$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, makeBoolean((NIL != methods.funcall_instance_method_with_0_args(self, INFINITIVE_P)) || ((NIL != grandmother)
				&& ((NIL != methods.funcall_instance_method_with_1_args(grandmother, FIND_FIRST, MODAL_VERB_TREE_P)) || methods.funcall_instance_method_with_0_args(methods.funcall_instance_method_with_1_args(grandmother, GET_DAUGHTER, ZERO_INTEGER), GET_STRING).equalp($$$did)))));
		    }
		} finally {
		    {
			SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
			try {
			    bind($is_thread_performing_cleanupP$, T);
			    parse_tree.set_parse_tree_mother(self, mother);
			} finally {
			    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
			}
		    }
		}
	    } catch (Throwable ccatch_env_var) {
		catch_var_for_verbal_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym511$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD);
	    }
	    return catch_var_for_verbal_word_tree_method;
	}
    }

    public static SubLObject verbal_word_tree_control_verb_p_method(final SubLObject self) {
	return makeBoolean((NIL != methods.funcall_instance_method_with_0_args(self, SUBJECT_CONTROLLER_P)) || (NIL != methods.funcall_instance_method_with_0_args(self, OBJECT_CONTROLLER_P)));
    }

    public static final SubLObject verbal_word_tree_control_verb_p_method_alt(SubLObject self) {
	return makeBoolean((NIL != methods.funcall_instance_method_with_0_args(self, SUBJECT_CONTROLLER_P)) || (NIL != methods.funcall_instance_method_with_0_args(self, OBJECT_CONTROLLER_P)));
    }

    /**
     *
     *
     * @return boolean; t if this verb is a dummy 'to', nil otherwise
     */
    @LispMethod(comment = "@return boolean; t if this verb is a dummy \'to\', nil otherwise")
    public static SubLObject verbal_word_tree_dummy_to_p_method(final SubLObject self) {
	return eql(methods.funcall_instance_method_with_0_args(self, GET_STRING), $$$to);
    }

    /**
     *
     *
     * @return boolean; t if this verb is a dummy 'to', nil otherwise
     */
    @LispMethod(comment = "@return boolean; t if this verb is a dummy \'to\', nil otherwise")
    public static final SubLObject verbal_word_tree_dummy_to_p_method_alt(SubLObject self) {
	return eql(methods.funcall_instance_method_with_0_args(self, GET_STRING), $$$to);
    }

    /**
     *
     *
     * @return booleanp; t if this word is finite, nil otherwise
     */
    @LispMethod(comment = "@return booleanp; t if this word is finite, nil otherwise")
    public static SubLObject verbal_word_tree_finite_p_method(final SubLObject self) {
	return parse_tree.finite_verbal_word_tree_p(self);
    }

    /**
     *
     *
     * @return booleanp; t if this word is finite, nil otherwise
     */
    @LispMethod(comment = "@return booleanp; t if this word is finite, nil otherwise")
    public static final SubLObject verbal_word_tree_finite_p_method_alt(SubLObject self) {
	return parse_tree.finite_verbal_word_tree_p(self);
    }

    /**
     *
     *
     * @return adjp-tree-p; the adjectival complement of this verb
     */
    @LispMethod(comment = "@return adjp-tree-p; the adjectival complement of this verb")
    public static SubLObject verbal_word_tree_get_adjectival_complement_method(final SubLObject self) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject catch_var_for_verbal_word_tree_method = NIL;
	final SubLObject idx = parse_tree.get_parse_tree_idx(self);
	final SubLObject mother = parse_tree.get_parse_tree_mother(self);
	try {
	    thread.throwStack.push($sym472$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD);
	    try {
		sublisp_throw($sym472$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, methods.funcall_instance_method_with_2_args(mother, FIND_FIRST, ADJP_TREE_P, number_utilities.f_1X(idx)));
	    } finally {
		final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    parse_tree.set_parse_tree_idx(self, idx);
		    parse_tree.set_parse_tree_mother(self, mother);
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
		}
	    }
	} catch (final Throwable ccatch_env_var) {
	    catch_var_for_verbal_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym472$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD);
	} finally {
	    thread.throwStack.pop();
	}
	return catch_var_for_verbal_word_tree_method;
    }

    /**
     *
     *
     * @return adjp-tree-p; the adjectival complement of this verb
     */
    @LispMethod(comment = "@return adjp-tree-p; the adjectival complement of this verb")
    public static final SubLObject verbal_word_tree_get_adjectival_complement_method_alt(SubLObject self) {
	{
	    SubLObject catch_var_for_verbal_word_tree_method = NIL;
	    SubLObject idx = parse_tree.get_parse_tree_idx(self);
	    SubLObject mother = parse_tree.get_parse_tree_mother(self);
	    try {
		try {
		    sublisp_throw($sym472$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, methods.funcall_instance_method_with_2_args(mother, FIND_FIRST, ADJP_TREE_P, number_utilities.f_1X(idx)));
		} finally {
		    {
			SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
			try {
			    bind($is_thread_performing_cleanupP$, T);
			    parse_tree.set_parse_tree_idx(self, idx);
			    parse_tree.set_parse_tree_mother(self, mother);
			} finally {
			    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
			}
		    }
		}
	    } catch (Throwable ccatch_env_var) {
		catch_var_for_verbal_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym472$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD);
	    }
	    return catch_var_for_verbal_word_tree_method;
	}
    }

    /**
     *
     *
     * @return listp; the local syntactic objects of this tree and its ancestors
     */
    @LispMethod(comment = "@return listp; the local syntactic objects of this tree and its ancestors")
    public static SubLObject verbal_word_tree_get_ancestor_objects_method(final SubLObject self) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject catch_var_for_verbal_word_tree_method = NIL;
	final SubLObject mother = parse_tree.get_parse_tree_mother(self);
	try {
	    thread.throwStack.push($sym496$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD);
	    try {
		sublisp_throw($sym496$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, methods.funcall_instance_method_with_0_args(mother, GET_ANCESTOR_OBJECTS));
	    } finally {
		final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    parse_tree.set_parse_tree_mother(self, mother);
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
		}
	    }
	} catch (final Throwable ccatch_env_var) {
	    catch_var_for_verbal_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym496$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD);
	} finally {
	    thread.throwStack.pop();
	}
	return catch_var_for_verbal_word_tree_method;
    }

    /**
     *
     *
     * @return listp; the local syntactic objects of this tree and its ancestors
     */
    @LispMethod(comment = "@return listp; the local syntactic objects of this tree and its ancestors")
    public static final SubLObject verbal_word_tree_get_ancestor_objects_method_alt(SubLObject self) {
	{
	    SubLObject catch_var_for_verbal_word_tree_method = NIL;
	    SubLObject mother = parse_tree.get_parse_tree_mother(self);
	    try {
		try {
		    sublisp_throw($sym496$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, methods.funcall_instance_method_with_0_args(mother, GET_ANCESTOR_OBJECTS));
		} finally {
		    {
			SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
			try {
			    bind($is_thread_performing_cleanupP$, T);
			    parse_tree.set_parse_tree_mother(self, mother);
			} finally {
			    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
			}
		    }
		}
	    } catch (Throwable ccatch_env_var) {
		catch_var_for_verbal_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym496$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD);
	    }
	    return catch_var_for_verbal_word_tree_method;
	}
    }

    /**
     *
     *
     * @return listp; a list of all complements of this verb
     */
    @LispMethod(comment = "@return listp; a list of all complements of this verb")
    public static SubLObject verbal_word_tree_get_complements_method(final SubLObject self) {
	final SubLObject subject = methods.funcall_instance_method_with_0_args(self, GET_SEMANTIC_SUBJECT);
	final SubLObject verbal_complement = methods.funcall_instance_method_with_0_args(self, GET_VERBAL_COMPLEMENT);
	final SubLObject complements = append(NIL != subject ? list(subject) : NIL, methods.funcall_instance_method_with_0_args(self, GET_SEMANTIC_OBJECTS), NIL != verbal_complement ? list(verbal_complement) : NIL);
	return complements;
    }

    /**
     *
     *
     * @return listp; a list of all complements of this verb
     */
    @LispMethod(comment = "@return listp; a list of all complements of this verb")
    public static final SubLObject verbal_word_tree_get_complements_method_alt(SubLObject self) {
	{
	    SubLObject subject = methods.funcall_instance_method_with_0_args(self, GET_SEMANTIC_SUBJECT);
	    SubLObject verbal_complement = methods.funcall_instance_method_with_0_args(self, GET_VERBAL_COMPLEMENT);
	    SubLObject complements = append(NIL != subject ? ((SubLObject) (list(subject))) : NIL, methods.funcall_instance_method_with_0_args(self, GET_SEMANTIC_OBJECTS), NIL != verbal_complement ? ((SubLObject) (list(verbal_complement))) : NIL);
	    return complements;
	}
    }

    public static SubLObject verbal_word_tree_get_control_verb_method(final SubLObject self) {
	final SubLObject matrix = methods.funcall_instance_method_with_0_args(self, GET_MATRIX_CLAUSE);
	final SubLObject matrix_head = (NIL != matrix) ? methods.funcall_instance_method_with_0_args(matrix, GET_HEAD) : NIL;
	if ((NIL != matrix_head) && (NIL != methods.funcall_instance_method_with_0_args(matrix_head, CONTROL_VERB_P))) {
	    return matrix_head;
	}
	return NIL;
    }

    public static final SubLObject verbal_word_tree_get_control_verb_method_alt(SubLObject self) {
	{
	    SubLObject matrix = methods.funcall_instance_method_with_0_args(self, GET_MATRIX_CLAUSE);
	    SubLObject matrix_head = (NIL != matrix) ? ((SubLObject) (methods.funcall_instance_method_with_0_args(matrix, GET_HEAD))) : NIL;
	    if ((NIL != matrix_head) && (NIL != methods.funcall_instance_method_with_0_args(matrix_head, CONTROL_VERB_P))) {
		return matrix_head;
	    }
	}
	return NIL;
    }

    public static SubLObject verbal_word_tree_get_controller_method(final SubLObject self) {
	final SubLObject control_verb = methods.funcall_instance_method_with_0_args(self, GET_CONTROL_VERB);
	if (NIL == control_verb) {
	    return NIL;
	}
	if (NIL != methods.funcall_instance_method_with_0_args(control_verb, SUBJECT_CONTROLLER_P)) {
	    return methods.funcall_instance_method_with_0_args(control_verb, GET_SEMANTIC_SUBJECT);
	}
	if (NIL != methods.funcall_instance_method_with_0_args(control_verb, OBJECT_CONTROLLER_P)) {
	    return methods.funcall_instance_method_with_0_args(control_verb, GET_DIRECT_OBJECT);
	}
	return NIL;
    }

    public static final SubLObject verbal_word_tree_get_controller_method_alt(SubLObject self) {
	{
	    SubLObject control_verb = methods.funcall_instance_method_with_0_args(self, GET_CONTROL_VERB);
	    if (NIL == control_verb) {
		return NIL;
	    } else {
		if (NIL != methods.funcall_instance_method_with_0_args(control_verb, SUBJECT_CONTROLLER_P)) {
		    return methods.funcall_instance_method_with_0_args(control_verb, GET_SEMANTIC_SUBJECT);
		} else {
		    if (NIL != methods.funcall_instance_method_with_0_args(control_verb, OBJECT_CONTROLLER_P)) {
			return methods.funcall_instance_method_with_0_args(control_verb, GET_DIRECT_OBJECT);
		    }
		}
	    }
	}
	return NIL;
    }

    /**
     *
     *
     * @return phrase-tree-p; the direct object of this verb
     */
    @LispMethod(comment = "@return phrase-tree-p; the direct object of this verb")
    public static SubLObject verbal_word_tree_get_direct_object_method(final SubLObject self) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject catch_var_for_verbal_word_tree_method = NIL;
	final SubLObject idx = parse_tree.get_parse_tree_idx(self);
	final SubLObject mother = parse_tree.get_parse_tree_mother(self);
	try {
	    thread.throwStack.push($sym457$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD);
	    try {
		final SubLObject moved = methods.funcall_instance_method_with_0_args(self, GET_MOVED_OBJECTS);
		final SubLObject locals = methods.funcall_instance_method_with_2_args(mother, FIND, NOMINAL_TREE_P, number_utilities.f_1X(idx));
		final SubLObject n = length(locals);
		if (n.numE(TWO_INTEGER)) {
		    if (NIL != methods.funcall_instance_method_with_0_args(second(locals), TEMPORAL_TREE_P)) {
			sublisp_throw($sym457$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, locals.first());
		    } else {
			sublisp_throw($sym457$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, second(locals));
		    }
		} else if (n.numE(ONE_INTEGER) && (NIL == moved)) {
		    sublisp_throw($sym457$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, locals.first());
		} else if (((!n.numL(TWO_INTEGER)) || (NIL == moved)) || (NIL != sublisp_throw($sym457$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, moved.first()))) {
		}

	    } finally {
		final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    parse_tree.set_parse_tree_idx(self, idx);
		    parse_tree.set_parse_tree_mother(self, mother);
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
		}
	    }
	} catch (final Throwable ccatch_env_var) {
	    catch_var_for_verbal_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym457$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD);
	} finally {
	    thread.throwStack.pop();
	}
	return catch_var_for_verbal_word_tree_method;
    }

    /**
     *
     *
     * @return phrase-tree-p; the direct object of this verb
     */
    @LispMethod(comment = "@return phrase-tree-p; the direct object of this verb")
    public static final SubLObject verbal_word_tree_get_direct_object_method_alt(SubLObject self) {
	{
	    SubLObject catch_var_for_verbal_word_tree_method = NIL;
	    SubLObject idx = parse_tree.get_parse_tree_idx(self);
	    SubLObject mother = parse_tree.get_parse_tree_mother(self);
	    try {
		try {
		    {
			SubLObject moved = methods.funcall_instance_method_with_0_args(self, GET_MOVED_OBJECTS);
			SubLObject locals = methods.funcall_instance_method_with_2_args(mother, FIND, NOMINAL_TREE_P, number_utilities.f_1X(idx));
			SubLObject n = length(locals);
			if (n.numE(TWO_INTEGER)) {
			    if (NIL != methods.funcall_instance_method_with_0_args(second(locals), TEMPORAL_TREE_P)) {
				sublisp_throw($sym457$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, locals.first());
			    } else {
				sublisp_throw($sym457$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, second(locals));
			    }
			} else {
			    if (n.numE(ONE_INTEGER) && (NIL == moved)) {
				sublisp_throw($sym457$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, locals.first());
			    } else {
				if ((n.numL(TWO_INTEGER) && (NIL != moved)) && (NIL != sublisp_throw($sym457$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, moved.first()))) {
				}
			    }
			}
		    }
		} finally {
		    {
			SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
			try {
			    bind($is_thread_performing_cleanupP$, T);
			    parse_tree.set_parse_tree_idx(self, idx);
			    parse_tree.set_parse_tree_mother(self, mother);
			} finally {
			    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
			}
		    }
		}
	    } catch (Throwable ccatch_env_var) {
		catch_var_for_verbal_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym457$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD);
	    }
	    return catch_var_for_verbal_word_tree_method;
	}
    }

    /**
     *
     *
     * @return phrase-tree-p; the indirect object of this verb, including oblique objects
    embedded within a PP
     */
    @LispMethod(comment = "@return phrase-tree-p; the indirect object of this verb, including oblique objects\r\nembedded within a PP")
    public static SubLObject verbal_word_tree_get_indirect_object_method(final SubLObject self) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject catch_var_for_verbal_word_tree_method = NIL;
	final SubLObject idx = parse_tree.get_parse_tree_idx(self);
	final SubLObject mother = parse_tree.get_parse_tree_mother(self);
	try {
	    thread.throwStack.push($sym460$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD);
	    try {
		final SubLObject oblique_object = methods.funcall_instance_method_with_0_args(self, GET_OBLIQUE_OBJECT);
		if (NIL != oblique_object) {
		    sublisp_throw($sym460$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, oblique_object);
		}
		final SubLObject moved = methods.funcall_instance_method_with_0_args(self, GET_MOVED_OBJECTS);
		final SubLObject locals = methods.funcall_instance_method_with_2_args(mother, FIND, NOMINAL_TREE_P, number_utilities.f_1X(idx));
		final SubLObject n = length(locals);
		if (n.numE(TWO_INTEGER) && (NIL == methods.funcall_instance_method_with_0_args(second(locals), TEMPORAL_TREE_P))) {
		    sublisp_throw($sym460$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, locals.first());
		} else if (((!n.numE(ONE_INTEGER)) || (NIL == moved)) || (NIL != sublisp_throw($sym460$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, moved.first()))) {
		}

	    } finally {
		final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    parse_tree.set_parse_tree_idx(self, idx);
		    parse_tree.set_parse_tree_mother(self, mother);
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
		}
	    }
	} catch (final Throwable ccatch_env_var) {
	    catch_var_for_verbal_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym460$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD);
	} finally {
	    thread.throwStack.pop();
	}
	return catch_var_for_verbal_word_tree_method;
    }

    /**
     *
     *
     * @return phrase-tree-p; the indirect object of this verb, including oblique objects
    embedded within a PP
     */
    @LispMethod(comment = "@return phrase-tree-p; the indirect object of this verb, including oblique objects\r\nembedded within a PP")
    public static final SubLObject verbal_word_tree_get_indirect_object_method_alt(SubLObject self) {
	{
	    SubLObject catch_var_for_verbal_word_tree_method = NIL;
	    SubLObject idx = parse_tree.get_parse_tree_idx(self);
	    SubLObject mother = parse_tree.get_parse_tree_mother(self);
	    try {
		try {
		    {
			SubLObject oblique_object = methods.funcall_instance_method_with_0_args(self, GET_OBLIQUE_OBJECT);
			if (NIL != oblique_object) {
			    sublisp_throw($sym460$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, oblique_object);
			}
			{
			    SubLObject moved = methods.funcall_instance_method_with_0_args(self, GET_MOVED_OBJECTS);
			    SubLObject locals = methods.funcall_instance_method_with_2_args(mother, FIND, NOMINAL_TREE_P, number_utilities.f_1X(idx));
			    SubLObject n = length(locals);
			    if (n.numE(TWO_INTEGER) && (NIL == methods.funcall_instance_method_with_0_args(second(locals), TEMPORAL_TREE_P))) {
				sublisp_throw($sym460$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, locals.first());
			    } else {
				if ((n.numE(ONE_INTEGER) && (NIL != moved)) && (NIL != sublisp_throw($sym460$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, moved.first()))) {
				}
			    }
			}
		    }
		} finally {
		    {
			SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
			try {
			    bind($is_thread_performing_cleanupP$, T);
			    parse_tree.set_parse_tree_idx(self, idx);
			    parse_tree.set_parse_tree_mother(self, mother);
			} finally {
			    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
			}
		    }
		}
	    } catch (Throwable ccatch_env_var) {
		catch_var_for_verbal_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym460$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD);
	    }
	    return catch_var_for_verbal_word_tree_method;
	}
    }

    /**
     *
     *
     * @return word-tree-p; this verb's infinitive marker
     */
    @LispMethod(comment = "@return word-tree-p; this verb\'s infinitive marker")
    public static SubLObject verbal_word_tree_get_infinitive_marker_method(final SubLObject self) {
	final SubLObject vp = methods.funcall_instance_method_with_0_args(self, GET_MOTHER);
	final SubLObject candidate = methods.funcall_instance_method_with_1_args(vp, GET_SISTER, MINUS_ONE_INTEGER);
	if ((NIL != candidate) && (methods.funcall_instance_method_with_0_args(candidate, GET_CATEGORY) == $TO)) {
	    return candidate;
	}
	return NIL;
    }

    /**
     *
     *
     * @return word-tree-p; this verb's infinitive marker
     */
    @LispMethod(comment = "@return word-tree-p; this verb\'s infinitive marker")
    public static final SubLObject verbal_word_tree_get_infinitive_marker_method_alt(SubLObject self) {
	{
	    SubLObject vp = methods.funcall_instance_method_with_0_args(self, GET_MOTHER);
	    SubLObject candidate = methods.funcall_instance_method_with_1_args(vp, GET_SISTER, MINUS_ONE_INTEGER);
	    if ((NIL != candidate) && (methods.funcall_instance_method_with_0_args(candidate, GET_CATEGORY) == $TO)) {
		return candidate;
	    }
	}
	return NIL;
    }

    public static SubLObject verbal_word_tree_get_keyword_renamings_method(final SubLObject self, SubLObject keywords) {
	if (keywords == UNPROVIDED) {
	    keywords = $list393;
	}
	SubLObject conjuncts = NIL;
	SubLObject disjuncts = NIL;
	SubLObject subject = methods.funcall_instance_method_with_0_args(self, GET_SEMANTIC_SUBJECT);
	final SubLObject direct_object = methods.funcall_instance_method_with_0_args(self, GET_SEMANTIC_DIRECT_OBJECT);
	final SubLObject indirect_object = methods.funcall_instance_method_with_0_args(self, GET_SEMANTIC_INDIRECT_OBJECT);
	final SubLObject oblique_object = methods.funcall_instance_method_with_0_args(self, GET_OBLIQUE_OBJECT);
	final SubLObject cl_complement = methods.funcall_instance_method_with_0_args(self, GET_VERBAL_COMPLEMENT);
	final SubLObject modified = methods.funcall_instance_method_with_0_args(self, GET_MODIFIEDS).first();
	if ((NIL != subl_promotions.memberP(methods.funcall_instance_method_with_0_args(self, GET_CATEGORY), $list397, EQL, UNPROVIDED)) && (NIL == subject)) {
	    subject = methods.funcall_instance_method_with_0_args(self, GET_MODIFIEDS).first();
	}
	if (NIL != subl_promotions.memberP($ACTION, keywords, EQL, UNPROVIDED)) {
	    conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($ACTION, self), conjuncts);
	}
	if ((NIL != subject) && (NIL != member($SUBJECT, keywords, EQL, UNPROVIDED))) {
	    conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($SUBJECT, subject), conjuncts);
	}
	if ((NIL != direct_object) && (NIL != member($OBJECT, keywords, EQL, UNPROVIDED))) {
	    conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($OBJECT, direct_object), conjuncts);
	}
	if ((NIL != indirect_object) && (NIL != member($OBLIQUE_OBJECT, keywords, EQL, UNPROVIDED))) {
	    conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($OBLIQUE_OBJECT, indirect_object), conjuncts);
	}
	if ((NIL != oblique_object) && (NIL != member($OBLIQUE_OBJECT, keywords, EQL, UNPROVIDED))) {
	    conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($PREP_OBJECT, oblique_object), conjuncts);
	}
	if ((NIL != modified) && (NIL != member($NOUN, keywords, EQL, UNPROVIDED))) {
	    conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($NOUN, modified), conjuncts);
	}
	if ((NIL != cl_complement) && (NIL != member($CLAUSE, keywords, EQL, UNPROVIDED))) {
	    SubLObject cdolist_list_var;
	    final SubLObject cl_cycls = cdolist_list_var = methods.funcall_instance_method_with_0_args(cl_complement, CYCLIFY_INT);
	    SubLObject cl_cycl = NIL;
	    cl_cycl = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		cl_cycl = simplifier.lift_conjuncts(cl_cycl);
		disjuncts = cons(cons($CLAUSE, cl_cycl), disjuncts);
		cdolist_list_var = cdolist_list_var.rest();
		cl_cycl = cdolist_list_var.first();
	    }
	}
	if ((NIL != cl_complement) && (NIL != member($INF_COMP, keywords, EQL, UNPROVIDED))) {
	    conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($INF_COMP, cl_complement), conjuncts);
	}
	return cyclifier_interface.disjunctive_keyword_renamings(conjuncts, disjuncts);
    }

    public static final SubLObject verbal_word_tree_get_keyword_renamings_method_alt(SubLObject self, SubLObject keywords) {
	if (keywords == UNPROVIDED) {
	    keywords = $list_alt393;
	}
	{
	    SubLObject conjuncts = NIL;
	    SubLObject disjuncts = NIL;
	    SubLObject subject = methods.funcall_instance_method_with_0_args(self, GET_SEMANTIC_SUBJECT);
	    SubLObject direct_object = methods.funcall_instance_method_with_0_args(self, GET_SEMANTIC_DIRECT_OBJECT);
	    SubLObject indirect_object = methods.funcall_instance_method_with_0_args(self, GET_SEMANTIC_INDIRECT_OBJECT);
	    SubLObject oblique_object = methods.funcall_instance_method_with_0_args(self, GET_OBLIQUE_OBJECT);
	    SubLObject cl_complement = methods.funcall_instance_method_with_0_args(self, GET_VERBAL_COMPLEMENT);
	    SubLObject modified = methods.funcall_instance_method_with_0_args(self, GET_MODIFIEDS).first();
	    if ((NIL != subl_promotions.memberP(methods.funcall_instance_method_with_0_args(self, GET_CATEGORY), $list_alt397, EQL, UNPROVIDED)) && (NIL == subject)) {
		subject = methods.funcall_instance_method_with_0_args(self, GET_MODIFIEDS).first();
	    }
	    if (NIL != subl_promotions.memberP($ACTION, keywords, EQL, UNPROVIDED)) {
		conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($ACTION, self), conjuncts);
	    }
	    if ((NIL != subject) && (NIL != member($SUBJECT, keywords, EQL, UNPROVIDED))) {
		conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($SUBJECT, subject), conjuncts);
	    }
	    if ((NIL != direct_object) && (NIL != member($OBJECT, keywords, EQL, UNPROVIDED))) {
		conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($OBJECT, direct_object), conjuncts);
	    }
	    if ((NIL != indirect_object) && (NIL != member($OBLIQUE_OBJECT, keywords, EQL, UNPROVIDED))) {
		conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($OBLIQUE_OBJECT, indirect_object), conjuncts);
	    }
	    if ((NIL != oblique_object) && (NIL != member($OBLIQUE_OBJECT, keywords, EQL, UNPROVIDED))) {
		conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($PREP_OBJECT, oblique_object), conjuncts);
	    }
	    if ((NIL != modified) && (NIL != member($NOUN, keywords, EQL, UNPROVIDED))) {
		conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($NOUN, modified), conjuncts);
	    }
	    if ((NIL != cl_complement) && (NIL != member($CLAUSE, keywords, EQL, UNPROVIDED))) {
		{
		    SubLObject cl_cycls = methods.funcall_instance_method_with_0_args(cl_complement, CYCLIFY_INT);
		    SubLObject cdolist_list_var = cl_cycls;
		    SubLObject cl_cycl = NIL;
		    for (cl_cycl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), cl_cycl = cdolist_list_var.first()) {
			cl_cycl = simplifier.lift_conjuncts(cl_cycl);
			disjuncts = cons(cons($CLAUSE, cl_cycl), disjuncts);
		    }
		}
	    }
	    if ((NIL != cl_complement) && (NIL != member($INF_COMP, keywords, EQL, UNPROVIDED))) {
		conjuncts = cons(cyclifier_interface.coordinate_keyword_renaming($INF_COMP, cl_complement), conjuncts);
	    }
	    return cyclifier_interface.disjunctive_keyword_renamings(conjuncts, disjuncts);
	}
    }

    public static SubLObject verbal_word_tree_get_matrix_clause_method(final SubLObject self) {
	SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, GET_ANCESTORS);
	SubLObject ancestor = NIL;
	ancestor = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    if ((NIL != parse_tree.sentential_tree_p(ancestor)) && (!methods.funcall_instance_method_with_0_args(ancestor, GET_HEAD).eql(self))) {
		return ancestor;
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    ancestor = cdolist_list_var.first();
	}
	return NIL;
    }

    public static final SubLObject verbal_word_tree_get_matrix_clause_method_alt(SubLObject self) {
	{
	    SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, GET_ANCESTORS);
	    SubLObject ancestor = NIL;
	    for (ancestor = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), ancestor = cdolist_list_var.first()) {
		if ((NIL != parse_tree.sentential_tree_p(ancestor)) && (methods.funcall_instance_method_with_0_args(ancestor, GET_HEAD) != self)) {
		    return ancestor;
		}
	    }
	    return NIL;
	}
    }

    /**
     *
     *
     * @return listp; the list of all non-local nps of this verb
     */
    @LispMethod(comment = "@return listp; the list of all non-local nps of this verb")
    public static SubLObject verbal_word_tree_get_moved_nps_method(final SubLObject self) {
	SubLObject moved = NIL;
	if (NIL == moved) {
	    SubLObject csome_list_var = methods.funcall_instance_method_with_0_args(self, GET_ANCESTORS).rest();
	    SubLObject ancestor = NIL;
	    ancestor = csome_list_var.first();
	    while ((NIL == moved) && (NIL != csome_list_var)) {
		if (NIL != parse_tree.verbal_tree_p(ancestor)) {
		    moved = methods.funcall_instance_method_with_1_args(ancestor, FIND, WHNP_TREE_P);
		}
		csome_list_var = csome_list_var.rest();
		ancestor = csome_list_var.first();
	    }
	}
	return moved;
    }

    /**
     *
     *
     * @return listp; the list of all non-local nps of this verb
     */
    @LispMethod(comment = "@return listp; the list of all non-local nps of this verb")
    public static final SubLObject verbal_word_tree_get_moved_nps_method_alt(SubLObject self) {
	{
	    SubLObject moved = NIL;
	    if (NIL == moved) {
		{
		    SubLObject csome_list_var = methods.funcall_instance_method_with_0_args(self, GET_ANCESTORS).rest();
		    SubLObject ancestor = NIL;
		    for (ancestor = csome_list_var.first(); !((NIL != moved) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest(), ancestor = csome_list_var.first()) {
			if (NIL != parse_tree.verbal_tree_p(ancestor)) {
			    moved = methods.funcall_instance_method_with_1_args(ancestor, FIND, WHNP_TREE_P);
			}
		    }
		}
	    }
	    return moved;
	}
    }

    /**
     *
     *
     * @return listp; the list of all non-local ('moved') objects of this verb
     */
    @LispMethod(comment = "@return listp; the list of all non-local (\'moved\') objects of this verb")
    public static SubLObject verbal_word_tree_get_moved_objects_method(final SubLObject self) {
	return delete(methods.funcall_instance_method_with_0_args(self, GET_SUBJECT), methods.funcall_instance_method_with_0_args(self, GET_MOVED_NPS), EQ, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return listp; the list of all non-local ('moved') objects of this verb
     */
    @LispMethod(comment = "@return listp; the list of all non-local (\'moved\') objects of this verb")
    public static final SubLObject verbal_word_tree_get_moved_objects_method_alt(SubLObject self) {
	return delete(methods.funcall_instance_method_with_0_args(self, GET_SUBJECT), methods.funcall_instance_method_with_0_args(self, GET_MOVED_NPS), EQ, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return listp; a list of numbers of this verb with possible number values
    :SINGULAR and :PLURAL
     */
    @LispMethod(comment = "@return listp; a list of numbers of this verb with possible number values\r\n:SINGULAR and :PLURAL")
    public static SubLObject verbal_word_tree_get_number_method(final SubLObject self) {
	if (NIL != methods.funcall_instance_method_with_0_args(self, FINITE_P)) {
	    final SubLObject subject = methods.funcall_instance_method_with_0_args(self, GET_SUBJECT);
	    return NIL != subject ? methods.funcall_instance_method_with_0_args(subject, GET_NUMBER) : NIL;
	}
	return NIL;
    }

    /**
     *
     *
     * @return listp; a list of numbers of this verb with possible number values
    :SINGULAR and :PLURAL
     */
    @LispMethod(comment = "@return listp; a list of numbers of this verb with possible number values\r\n:SINGULAR and :PLURAL")
    public static final SubLObject verbal_word_tree_get_number_method_alt(SubLObject self) {
	if (NIL != methods.funcall_instance_method_with_0_args(self, FINITE_P)) {
	    {
		SubLObject subject = methods.funcall_instance_method_with_0_args(self, GET_SUBJECT);
		return NIL != subject ? ((SubLObject) (methods.funcall_instance_method_with_0_args(subject, GET_NUMBER))) : NIL;
	    }
	}
	return NIL;
    }

    /**
     *
     *
     * @return listp; a list of all objects of this verb
     */
    @LispMethod(comment = "@return listp; a list of all objects of this verb")
    public static SubLObject verbal_word_tree_get_objects_method(final SubLObject self) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject catch_var_for_verbal_word_tree_method = NIL;
	final SubLObject mother = parse_tree.get_parse_tree_mother(self);
	try {
	    thread.throwStack.push($sym444$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD);
	    try {
		final SubLObject direct_object = methods.funcall_instance_method_with_0_args(self, GET_DIRECT_OBJECT);
		final SubLObject indirect_object = methods.funcall_instance_method_with_0_args(self, GET_INDIRECT_OBJECT);
		SubLObject objects = NIL;
		if (NIL != indirect_object) {
		    objects = cons(indirect_object, objects);
		}
		if (NIL != direct_object) {
		    objects = cons(direct_object, objects);
		}
		if (NIL != mother) {
		    SubLObject cdolist_list_var = methods.funcall_instance_method_with_1_args(mother, FIND, PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE_P);
		    SubLObject pp = NIL;
		    pp = cdolist_list_var.first();
		    while (NIL != cdolist_list_var) {
			if (NIL != methods.funcall_instance_method_with_0_args(pp, STRANDED_P)) {
			    objects = delete(methods.funcall_instance_method_with_0_args(pp, GET_OBLIQUE_OBJECT), objects, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
			}
			cdolist_list_var = cdolist_list_var.rest();
			pp = cdolist_list_var.first();
		    }
		}
		sublisp_throw($sym444$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, objects);
	    } finally {
		final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    parse_tree.set_parse_tree_mother(self, mother);
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
		}
	    }
	} catch (final Throwable ccatch_env_var) {
	    catch_var_for_verbal_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym444$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD);
	} finally {
	    thread.throwStack.pop();
	}
	return catch_var_for_verbal_word_tree_method;
    }

    /**
     *
     *
     * @return listp; a list of all objects of this verb
     */
    @LispMethod(comment = "@return listp; a list of all objects of this verb")
    public static final SubLObject verbal_word_tree_get_objects_method_alt(SubLObject self) {
	{
	    SubLObject catch_var_for_verbal_word_tree_method = NIL;
	    SubLObject mother = parse_tree.get_parse_tree_mother(self);
	    try {
		try {
		    {
			SubLObject direct_object = methods.funcall_instance_method_with_0_args(self, GET_DIRECT_OBJECT);
			SubLObject indirect_object = methods.funcall_instance_method_with_0_args(self, GET_INDIRECT_OBJECT);
			SubLObject objects = NIL;
			if (NIL != indirect_object) {
			    objects = cons(indirect_object, objects);
			}
			if (NIL != direct_object) {
			    objects = cons(direct_object, objects);
			}
			if (NIL != mother) {
			    {
				SubLObject cdolist_list_var = methods.funcall_instance_method_with_1_args(mother, FIND, PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE_P);
				SubLObject pp = NIL;
				for (pp = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), pp = cdolist_list_var.first()) {
				    if (NIL != methods.funcall_instance_method_with_0_args(pp, STRANDED_P)) {
					objects = delete(methods.funcall_instance_method_with_0_args(pp, GET_OBLIQUE_OBJECT), objects, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
				    }
				}
			    }
			}
			sublisp_throw($sym444$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, objects);
		    }
		} finally {
		    {
			SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
			try {
			    bind($is_thread_performing_cleanupP$, T);
			    parse_tree.set_parse_tree_mother(self, mother);
			} finally {
			    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
			}
		    }
		}
	    } catch (Throwable ccatch_env_var) {
		catch_var_for_verbal_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym444$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD);
	    }
	    return catch_var_for_verbal_word_tree_method;
	}
    }

    /**
     *
     *
     * @return word-tree-p; this verb's particle phrase, or nil if there is none
     */
    @LispMethod(comment = "@return word-tree-p; this verb\'s particle phrase, or nil if there is none")
    public static SubLObject verbal_word_tree_get_particle_method(final SubLObject self) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject catch_var_for_verbal_word_tree_method = NIL;
	final SubLObject idx = parse_tree.get_parse_tree_idx(self);
	final SubLObject mother = parse_tree.get_parse_tree_mother(self);
	try {
	    thread.throwStack.push($sym479$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD);
	    try {
		final SubLObject particle_phrase = methods.funcall_instance_method_with_2_args(mother, FIND_FIRST, PRT_TREE_P, number_utilities.f_1X(idx));
		sublisp_throw($sym479$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, NIL != particle_phrase ? particle_phrase : NIL);
	    } finally {
		final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    parse_tree.set_parse_tree_idx(self, idx);
		    parse_tree.set_parse_tree_mother(self, mother);
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
		}
	    }
	} catch (final Throwable ccatch_env_var) {
	    catch_var_for_verbal_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym479$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD);
	} finally {
	    thread.throwStack.pop();
	}
	return catch_var_for_verbal_word_tree_method;
    }

    /**
     *
     *
     * @return word-tree-p; this verb's particle phrase, or nil if there is none
     */
    @LispMethod(comment = "@return word-tree-p; this verb\'s particle phrase, or nil if there is none")
    public static final SubLObject verbal_word_tree_get_particle_method_alt(SubLObject self) {
	{
	    SubLObject catch_var_for_verbal_word_tree_method = NIL;
	    SubLObject idx = parse_tree.get_parse_tree_idx(self);
	    SubLObject mother = parse_tree.get_parse_tree_mother(self);
	    try {
		try {
		    {
			SubLObject particle_phrase = methods.funcall_instance_method_with_2_args(mother, FIND_FIRST, PRT_TREE_P, number_utilities.f_1X(idx));
			sublisp_throw($sym479$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, NIL != particle_phrase ? ((SubLObject) (particle_phrase)) : NIL);
		    }
		} finally {
		    {
			SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
			try {
			    bind($is_thread_performing_cleanupP$, T);
			    parse_tree.set_parse_tree_idx(self, idx);
			    parse_tree.set_parse_tree_mother(self, mother);
			} finally {
			    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
			}
		    }
		}
	    } catch (Throwable ccatch_env_var) {
		catch_var_for_verbal_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym479$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD);
	    }
	    return catch_var_for_verbal_word_tree_method;
	}
    }

    /**
     *
     *
     * @return numberp; the person of this verb; 1, 2, or 3
     */
    @LispMethod(comment = "@return numberp; the person of this verb; 1, 2, or 3")
    public static SubLObject verbal_word_tree_get_person_method(final SubLObject self) {
	if (NIL != methods.funcall_instance_method_with_0_args(self, FINITE_P)) {
	    final SubLObject subject = methods.funcall_instance_method_with_0_args(self, GET_SUBJECT);
	    return NIL != subject ? methods.funcall_instance_method_with_0_args(subject, GET_PERSON) : NIL;
	}
	return NIL;
    }

    /**
     *
     *
     * @return numberp; the person of this verb; 1, 2, or 3
     */
    @LispMethod(comment = "@return numberp; the person of this verb; 1, 2, or 3")
    public static final SubLObject verbal_word_tree_get_person_method_alt(SubLObject self) {
	if (NIL != methods.funcall_instance_method_with_0_args(self, FINITE_P)) {
	    {
		SubLObject subject = methods.funcall_instance_method_with_0_args(self, GET_SUBJECT);
		return NIL != subject ? ((SubLObject) (methods.funcall_instance_method_with_0_args(subject, GET_PERSON))) : NIL;
	    }
	}
	return NIL;
    }

    /**
     *
     *
     * @return word-tree-p; the predicate of this sentence
     */
    @LispMethod(comment = "@return word-tree-p; the predicate of this sentence")
    public static SubLObject verbal_word_tree_get_predicate_method(final SubLObject self) {
	return methods.funcall_instance_method_with_0_args(self, GET_SEMANTIC_HEAD);
    }

    /**
     *
     *
     * @return word-tree-p; the predicate of this sentence
     */
    @LispMethod(comment = "@return word-tree-p; the predicate of this sentence")
    public static final SubLObject verbal_word_tree_get_predicate_method_alt(SubLObject self) {
	return methods.funcall_instance_method_with_0_args(self, GET_SEMANTIC_HEAD);
    }

    /**
     *
     *
     * @return phrase-tree-p; the semantic direct object of this verb
     */
    @LispMethod(comment = "@return phrase-tree-p; the semantic direct object of this verb")
    public static SubLObject verbal_word_tree_get_semantic_direct_object_method(final SubLObject self) {
	return methods.funcall_instance_method_with_0_args(self, GET_DIRECT_OBJECT);
    }

    /**
     *
     *
     * @return phrase-tree-p; the semantic direct object of this verb
     */
    @LispMethod(comment = "@return phrase-tree-p; the semantic direct object of this verb")
    public static final SubLObject verbal_word_tree_get_semantic_direct_object_method_alt(SubLObject self) {
	return methods.funcall_instance_method_with_0_args(self, GET_DIRECT_OBJECT);
    }

    /**
     *
     *
     * @return phrase-tree-p; the semantic indirect object of this verb
     */
    @LispMethod(comment = "@return phrase-tree-p; the semantic indirect object of this verb")
    public static SubLObject verbal_word_tree_get_semantic_indirect_object_method(final SubLObject self) {
	return methods.funcall_instance_method_with_0_args(self, GET_INDIRECT_OBJECT);
    }

    /**
     *
     *
     * @return phrase-tree-p; the semantic indirect object of this verb
     */
    @LispMethod(comment = "@return phrase-tree-p; the semantic indirect object of this verb")
    public static final SubLObject verbal_word_tree_get_semantic_indirect_object_method_alt(SubLObject self) {
	return methods.funcall_instance_method_with_0_args(self, GET_INDIRECT_OBJECT);
    }

    /**
     *
     *
     * @return listp; a list of the semantic subject of this verbal tree
     */
    @LispMethod(comment = "@return listp; a list of the semantic subject of this verbal tree")
    public static SubLObject verbal_word_tree_get_semantic_objects_method(final SubLObject self) {
	final SubLObject direct_object = methods.funcall_instance_method_with_0_args(self, GET_SEMANTIC_DIRECT_OBJECT);
	final SubLObject indirect_object = methods.funcall_instance_method_with_0_args(self, GET_SEMANTIC_INDIRECT_OBJECT);
	SubLObject semantic_objects = NIL;
	if (NIL != indirect_object) {
	    semantic_objects = cons(indirect_object, semantic_objects);
	}
	if (NIL != direct_object) {
	    semantic_objects = cons(direct_object, semantic_objects);
	}
	return semantic_objects;
    }

    /**
     *
     *
     * @return listp; a list of the semantic subject of this verbal tree
     */
    @LispMethod(comment = "@return listp; a list of the semantic subject of this verbal tree")
    public static final SubLObject verbal_word_tree_get_semantic_objects_method_alt(SubLObject self) {
	{
	    SubLObject direct_object = methods.funcall_instance_method_with_0_args(self, GET_SEMANTIC_DIRECT_OBJECT);
	    SubLObject indirect_object = methods.funcall_instance_method_with_0_args(self, GET_SEMANTIC_INDIRECT_OBJECT);
	    SubLObject semantic_objects = NIL;
	    if (NIL != indirect_object) {
		semantic_objects = cons(indirect_object, semantic_objects);
	    }
	    if (NIL != direct_object) {
		semantic_objects = cons(direct_object, semantic_objects);
	    }
	    return semantic_objects;
	}
    }

    /**
     *
     *
     * @return phrase-tree-p; the semantic subject of this verbal tree
     */
    @LispMethod(comment = "@return phrase-tree-p; the semantic subject of this verbal tree")
    public static SubLObject verbal_word_tree_get_semantic_subject_method(final SubLObject self) {
	return methods.funcall_instance_method_with_0_args(self, GET_SUBJECT);
    }

    /**
     *
     *
     * @return phrase-tree-p; the semantic subject of this verbal tree
     */
    @LispMethod(comment = "@return phrase-tree-p; the semantic subject of this verbal tree")
    public static final SubLObject verbal_word_tree_get_semantic_subject_method_alt(SubLObject self) {
	return methods.funcall_instance_method_with_0_args(self, GET_SUBJECT);
    }

    /**
     *
     *
     * @return phrase-tree-p; the subject of this verb
     */
    @LispMethod(comment = "@return phrase-tree-p; the subject of this verb")
    public static SubLObject verbal_word_tree_get_subject_method(final SubLObject self) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject catch_var_for_verbal_word_tree_method = NIL;
	final SubLObject idx = parse_tree.get_parse_tree_idx(self);
	final SubLObject mother = parse_tree.get_parse_tree_mother(self);
	try {
	    thread.throwStack.push($sym440$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD);
	    try {
		final SubLObject subject = methods.funcall_instance_method_with_2_args(mother, FIND_LAST, NOMINAL_TREE_P, number_utilities.f_1_(idx));
		if (NIL != subject) {
		    sublisp_throw($sym440$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, subject);
		}
		final SubLObject controller = methods.funcall_instance_method_with_0_args(self, GET_CONTROLLER);
		if (NIL != controller) {
		    sublisp_throw($sym440$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, controller);
		}
		if (NIL != parse_tree.verbal_tree_p(mother)) {
		    sublisp_throw($sym440$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, methods.funcall_instance_method_with_0_args(mother, GET_SUBJECT));
		}
	    } finally {
		final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    parse_tree.set_parse_tree_idx(self, idx);
		    parse_tree.set_parse_tree_mother(self, mother);
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
		}
	    }
	} catch (final Throwable ccatch_env_var) {
	    catch_var_for_verbal_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym440$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD);
	} finally {
	    thread.throwStack.pop();
	}
	return catch_var_for_verbal_word_tree_method;
    }

    /**
     *
     *
     * @return phrase-tree-p; the subject of this verb
     */
    @LispMethod(comment = "@return phrase-tree-p; the subject of this verb")
    public static final SubLObject verbal_word_tree_get_subject_method_alt(SubLObject self) {
	{
	    SubLObject catch_var_for_verbal_word_tree_method = NIL;
	    SubLObject idx = parse_tree.get_parse_tree_idx(self);
	    SubLObject mother = parse_tree.get_parse_tree_mother(self);
	    try {
		try {
		    {
			SubLObject subject = methods.funcall_instance_method_with_2_args(mother, FIND_LAST, NOMINAL_TREE_P, number_utilities.f_1_(idx));
			if (NIL != subject) {
			    sublisp_throw($sym440$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, subject);
			}
			{
			    SubLObject controller = methods.funcall_instance_method_with_0_args(self, GET_CONTROLLER);
			    if (NIL != controller) {
				sublisp_throw($sym440$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, controller);
			    }
			}
			if (NIL != parse_tree.verbal_tree_p(mother)) {
			    sublisp_throw($sym440$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, methods.funcall_instance_method_with_0_args(mother, GET_SUBJECT));
			}
		    }
		} finally {
		    {
			SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
			try {
			    bind($is_thread_performing_cleanupP$, T);
			    parse_tree.set_parse_tree_idx(self, idx);
			    parse_tree.set_parse_tree_mother(self, mother);
			} finally {
			    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
			}
		    }
		}
	    } catch (Throwable ccatch_env_var) {
		catch_var_for_verbal_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym440$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD);
	    }
	    return catch_var_for_verbal_word_tree_method;
	}
    }

    /**
     *
     *
     * @return keywordp; the tense of this vp; either :PRESENT, :PAST, :FUTURE,
    or :INFINITIVE
     */
    @LispMethod(comment = "@return keywordp; the tense of this vp; either :PRESENT, :PAST, :FUTURE,\r\nor :INFINITIVE")
    public static SubLObject verbal_word_tree_get_tense_method(final SubLObject self) {
	return NIL;
    }

    /**
     *
     *
     * @return keywordp; the tense of this vp; either :PRESENT, :PAST, :FUTURE,
    or :INFINITIVE
     */
    @LispMethod(comment = "@return keywordp; the tense of this vp; either :PRESENT, :PAST, :FUTURE,\r\nor :INFINITIVE")
    public static final SubLObject verbal_word_tree_get_tense_method_alt(SubLObject self) {
	return NIL;
    }

    /**
     *
     *
     * @return listp; a list of all verbal complements of this verb
     */
    @LispMethod(comment = "@return listp; a list of all verbal complements of this verb")
    public static SubLObject verbal_word_tree_get_verbal_complement_method(final SubLObject self) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject catch_var_for_verbal_word_tree_method = NIL;
	final SubLObject idx = parse_tree.get_parse_tree_idx(self);
	final SubLObject mother = parse_tree.get_parse_tree_mother(self);
	try {
	    thread.throwStack.push($sym467$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD);
	    try {
		sublisp_throw($sym467$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, methods.funcall_instance_method_with_2_args(mother, FIND_FIRST, VERBAL_PHRASE_TREE_P, number_utilities.f_1X(idx)));
	    } finally {
		final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    parse_tree.set_parse_tree_idx(self, idx);
		    parse_tree.set_parse_tree_mother(self, mother);
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
		}
	    }
	} catch (final Throwable ccatch_env_var) {
	    catch_var_for_verbal_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym467$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD);
	} finally {
	    thread.throwStack.pop();
	}
	return catch_var_for_verbal_word_tree_method;
    }

    /**
     *
     *
     * @return listp; a list of all verbal complements of this verb
     */
    @LispMethod(comment = "@return listp; a list of all verbal complements of this verb")
    public static final SubLObject verbal_word_tree_get_verbal_complement_method_alt(SubLObject self) {
	{
	    SubLObject catch_var_for_verbal_word_tree_method = NIL;
	    SubLObject idx = parse_tree.get_parse_tree_idx(self);
	    SubLObject mother = parse_tree.get_parse_tree_mother(self);
	    try {
		try {
		    sublisp_throw($sym467$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, methods.funcall_instance_method_with_2_args(mother, FIND_FIRST, VERBAL_PHRASE_TREE_P, number_utilities.f_1X(idx)));
		} finally {
		    {
			SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
			try {
			    bind($is_thread_performing_cleanupP$, T);
			    parse_tree.set_parse_tree_idx(self, idx);
			    parse_tree.set_parse_tree_mother(self, mother);
			} finally {
			    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
			}
		    }
		}
	    } catch (Throwable ccatch_env_var) {
		catch_var_for_verbal_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym467$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD);
	    }
	    return catch_var_for_verbal_word_tree_method;
	}
    }

    /**
     *
     *
     * @return boolenap; t if this verb is in the infinitive form, nil otherwise
     */
    @LispMethod(comment = "@return boolenap; t if this verb is in the infinitive form, nil otherwise")
    public static SubLObject verbal_word_tree_infinitive_p_method(final SubLObject self) {
	return list_utilities.sublisp_boolean(methods.funcall_instance_method_with_0_args(self, GET_INFINITIVE_MARKER));
    }

    /**
     *
     *
     * @return boolenap; t if this verb is in the infinitive form, nil otherwise
     */
    @LispMethod(comment = "@return boolenap; t if this verb is in the infinitive form, nil otherwise")
    public static final SubLObject verbal_word_tree_infinitive_p_method_alt(SubLObject self) {
	return list_utilities.sublisp_boolean(methods.funcall_instance_method_with_0_args(self, GET_INFINITIVE_MARKER));
    }

    /**
     *
     *
     * @return booleanp; t if this verb is inverted, nil otherwise
     */
    @LispMethod(comment = "@return booleanp; t if this verb is inverted, nil otherwise")
    public static SubLObject verbal_word_tree_inverted_p_method(final SubLObject self) {
	return NIL;
    }

    /**
     *
     *
     * @return booleanp; t if this verb is inverted, nil otherwise
     */
    @LispMethod(comment = "@return booleanp; t if this verb is inverted, nil otherwise")
    public static final SubLObject verbal_word_tree_inverted_p_method_alt(SubLObject self) {
	return NIL;
    }

    public static SubLObject verbal_word_tree_object_controller_p_method(final SubLObject self) {
	SubLObject result = NIL;
	SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, GET_LEXES);
	SubLObject lex = NIL;
	lex = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    result = member(methods.funcall_instance_method_with_1_args(lex, GET, $FRAME), $list416, UNPROVIDED, UNPROVIDED);
	    if (NIL != result) {
		return list_utilities.sublisp_boolean(result);
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    lex = cdolist_list_var.first();
	}
	return NIL;
    }

    public static final SubLObject verbal_word_tree_object_controller_p_method_alt(SubLObject self) {
	{
	    SubLObject result = NIL;
	    SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, GET_LEXES);
	    SubLObject lex = NIL;
	    for (lex = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), lex = cdolist_list_var.first()) {
		result = member(methods.funcall_instance_method_with_1_args(lex, GET, $FRAME), $list_alt416, UNPROVIDED, UNPROVIDED);
		if (NIL != result) {
		    return list_utilities.sublisp_boolean(result);
		}
	    }
	}
	return NIL;
    }

    public static SubLObject verbal_word_tree_p(final SubLObject verbal_word_tree) {
	return classes.subloop_instanceof_class(verbal_word_tree, VERBAL_WORD_TREE);
    }

    public static final SubLObject verbal_word_tree_p_alt(SubLObject verbal_word_tree) {
	return classes.subloop_instanceof_class(verbal_word_tree, VERBAL_WORD_TREE);
    }

    public static SubLObject verbal_word_tree_particle_filter_lexes_method(final SubLObject self) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject catch_var_for_verbal_word_tree_method = NIL;
	SubLObject lexes = get_word_tree_lexes(self);
	try {
	    thread.throwStack.push($sym383$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD);
	    try {
		SubLObject filtered = NIL;
		final SubLObject sentence_particle = methods.funcall_instance_method_with_0_args(self, GET_PARTICLE);
		final SubLObject sentence_particle_head = (NIL != sentence_particle) ? methods.funcall_instance_method_with_0_args(sentence_particle, GET_HEAD) : NIL;
		SubLObject frame = NIL;
		SubLObject cdolist_list_var = lexes;
		SubLObject rle = NIL;
		rle = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
		    frame = methods.funcall_instance_method_with_1_args(cyclifier.rle_lex(rle), GET, $FRAME);
		    if ((NIL != cycl_utilities.formula_arg2(frame, UNPROVIDED)) && (NIL != isa.isaP(frame, $$ParticleFrameType, $$EverythingPSC, UNPROVIDED))) {
			if (NIL != sentence_particle_head) {
			    final SubLObject required_particle_string = lexicon_accessors.get_strings_of_type(cycl_utilities.formula_arg2(frame, UNPROVIDED), $$VerbParticle, UNPROVIDED, UNPROVIDED, UNPROVIDED).first();
			    if (required_particle_string.equalp(methods.funcall_instance_method_with_0_args(sentence_particle_head, GET_STRING))) {
				cyclifier.rle_set_confidence(rle, ONE_INTEGER);
				filtered = cons(rle, filtered);
			    }
			}
		    } else if (NIL == sentence_particle_head) {
			filtered = cons(rle, filtered);
		    }

		    cdolist_list_var = cdolist_list_var.rest();
		    rle = cdolist_list_var.first();
		}
		lexes = filtered;
		sublisp_throw($sym383$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, lexes);
	    } finally {
		final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    set_word_tree_lexes(self, lexes);
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
		}
	    }
	} catch (final Throwable ccatch_env_var) {
	    catch_var_for_verbal_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym383$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD);
	} finally {
	    thread.throwStack.pop();
	}
	return catch_var_for_verbal_word_tree_method;
    }

    public static final SubLObject verbal_word_tree_particle_filter_lexes_method_alt(SubLObject self) {
	{
	    SubLObject catch_var_for_verbal_word_tree_method = NIL;
	    SubLObject lexes = com.cyc.cycjava.cycl.word_tree.get_word_tree_lexes(self);
	    try {
		try {
		    {
			SubLObject filtered = NIL;
			SubLObject sentence_particle = methods.funcall_instance_method_with_0_args(self, GET_PARTICLE);
			SubLObject sentence_particle_head = (NIL != sentence_particle) ? ((SubLObject) (methods.funcall_instance_method_with_0_args(sentence_particle, GET_HEAD))) : NIL;
			SubLObject frame = NIL;
			SubLObject cdolist_list_var = lexes;
			SubLObject rle = NIL;
			for (rle = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), rle = cdolist_list_var.first()) {
			    frame = methods.funcall_instance_method_with_1_args(cyclifier.rle_lex(rle), GET, $FRAME);
			    if ((NIL != cycl_utilities.formula_arg2(frame, UNPROVIDED)) && (NIL != isa.isaP(frame, $$ParticleFrameType, $$EverythingPSC, UNPROVIDED))) {
				if (NIL != sentence_particle_head) {
				    {
					SubLObject required_particle_string = lexicon_accessors.get_strings_of_type(cycl_utilities.formula_arg2(frame, UNPROVIDED), $$VerbParticle, UNPROVIDED, UNPROVIDED, UNPROVIDED).first();
					if (required_particle_string.equalp(methods.funcall_instance_method_with_0_args(sentence_particle_head, GET_STRING))) {
					    cyclifier.rle_set_confidence(rle, ONE_INTEGER);
					    filtered = cons(rle, filtered);
					}
				    }
				}
			    } else {
				if (NIL == sentence_particle_head) {
				    filtered = cons(rle, filtered);
				}
			    }
			}
			lexes = filtered;
			sublisp_throw($sym383$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD, lexes);
		    }
		} finally {
		    {
			SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
			try {
			    bind($is_thread_performing_cleanupP$, T);
			    com.cyc.cycjava.cycl.word_tree.set_word_tree_lexes(self, lexes);
			} finally {
			    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
			}
		    }
		}
	    } catch (Throwable ccatch_env_var) {
		catch_var_for_verbal_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym383$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD);
	    }
	    return catch_var_for_verbal_word_tree_method;
	}
    }

    public static SubLObject verbal_word_tree_partition_semantic_complements_method(final SubLObject self) {
	final SubLObject subject = methods.funcall_instance_method_with_0_args(self, GET_SEMANTIC_SUBJECT);
	SubLObject non_distributing = methods.funcall_instance_method_with_0_args(self, GET_SEMANTIC_COMPLEMENTS);
	if (NIL != subject) {
	    non_distributing = cyclifier_interface.delete_cyclifiable(subject, non_distributing);
	}
	return values(non_distributing, NIL != subject ? list(subject) : NIL);
    }

    public static final SubLObject verbal_word_tree_partition_semantic_complements_method_alt(SubLObject self) {
	{
	    SubLObject subject = methods.funcall_instance_method_with_0_args(self, GET_SEMANTIC_SUBJECT);
	    SubLObject non_distributing = methods.funcall_instance_method_with_0_args(self, GET_SEMANTIC_COMPLEMENTS);
	    if (NIL != subject) {
		non_distributing = cyclifier_interface.delete_cyclifiable(subject, non_distributing);
	    }
	    return values(non_distributing, NIL != subject ? ((SubLObject) (list(subject))) : NIL);
	}
    }

    /**
     *
     *
     * @return booleanp; t if this verb is the head of a passive construction, nil otherwise
     */
    @LispMethod(comment = "@return booleanp; t if this verb is the head of a passive construction, nil otherwise")
    public static SubLObject verbal_word_tree_passive_p_method(final SubLObject self) {
	return NIL;
    }

    /**
     *
     *
     * @return booleanp; t if this verb is the head of a passive construction, nil otherwise
     */
    @LispMethod(comment = "@return booleanp; t if this verb is the head of a passive construction, nil otherwise")
    public static final SubLObject verbal_word_tree_passive_p_method_alt(SubLObject self) {
	return NIL;
    }

    public static SubLObject verbal_word_tree_subject_controller_p_method(final SubLObject self) {
	SubLObject result = NIL;
	SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, GET_LEXES);
	SubLObject lex = NIL;
	lex = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    result = member(methods.funcall_instance_method_with_1_args(lex, GET, $FRAME), $list419, UNPROVIDED, UNPROVIDED);
	    if (NIL != result) {
		return list_utilities.sublisp_boolean(result);
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    lex = cdolist_list_var.first();
	}
	return NIL;
    }

    public static final SubLObject verbal_word_tree_subject_controller_p_method_alt(SubLObject self) {
	{
	    SubLObject result = NIL;
	    SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, GET_LEXES);
	    SubLObject lex = NIL;
	    for (lex = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), lex = cdolist_list_var.first()) {
		result = member(methods.funcall_instance_method_with_1_args(lex, GET, $FRAME), $list_alt419, UNPROVIDED, UNPROVIDED);
		if (NIL != result) {
		    return list_utilities.sublisp_boolean(result);
		}
	    }
	}
	return NIL;
    }

    /**
     *
     *
     * @return parse-tree-p; the tree that serves as an antecedent to this wh word
     */
    @LispMethod(comment = "@return parse-tree-p; the tree that serves as an antecedent to this wh word")
    public static SubLObject wdt_word_tree_get_antecedent_method(final SubLObject self) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject catch_var_for_wdt_word_tree_method = NIL;
	final SubLObject mother = parse_tree.get_parse_tree_mother(self);
	try {
	    thread.throwStack.push($sym743$OUTER_CATCH_FOR_WDT_WORD_TREE_METHOD);
	    try {
		final SubLObject grandmother = (NIL != mother) ? methods.funcall_instance_method_with_0_args(mother, GET_MOTHER) : NIL;
		final SubLObject great_grandmother = (NIL != grandmother) ? methods.funcall_instance_method_with_0_args(grandmother, GET_MOTHER) : NIL;
		if ((NIL != parse_tree.np_tree_p(great_grandmother)) && (NIL != parse_tree.np_tree_p(methods.funcall_instance_method_with_1_args(great_grandmother, GET_DAUGHTER, ZERO_INTEGER)))) {
		    sublisp_throw($sym743$OUTER_CATCH_FOR_WDT_WORD_TREE_METHOD, methods.funcall_instance_method_with_1_args(great_grandmother, GET_DAUGHTER, ZERO_INTEGER));
		}
	    } finally {
		final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    parse_tree.set_parse_tree_mother(self, mother);
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
		}
	    }
	} catch (final Throwable ccatch_env_var) {
	    catch_var_for_wdt_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym743$OUTER_CATCH_FOR_WDT_WORD_TREE_METHOD);
	} finally {
	    thread.throwStack.pop();
	}
	return catch_var_for_wdt_word_tree_method;
    }

    /**
     *
     *
     * @return parse-tree-p; the tree that serves as an antecedent to this wh word
     */
    @LispMethod(comment = "@return parse-tree-p; the tree that serves as an antecedent to this wh word")
    public static final SubLObject wdt_word_tree_get_antecedent_method_alt(SubLObject self) {
	{
	    SubLObject catch_var_for_wdt_word_tree_method = NIL;
	    SubLObject mother = parse_tree.get_parse_tree_mother(self);
	    try {
		try {
		    {
			SubLObject grandmother = (NIL != mother) ? ((SubLObject) (methods.funcall_instance_method_with_0_args(mother, GET_MOTHER))) : NIL;
			SubLObject great_grandmother = (NIL != grandmother) ? ((SubLObject) (methods.funcall_instance_method_with_0_args(grandmother, GET_MOTHER))) : NIL;
			if ((NIL != parse_tree.np_tree_p(great_grandmother)) && (NIL != parse_tree.np_tree_p(methods.funcall_instance_method_with_1_args(great_grandmother, GET_DAUGHTER, ZERO_INTEGER)))) {
			    sublisp_throw($sym743$OUTER_CATCH_FOR_WDT_WORD_TREE_METHOD, methods.funcall_instance_method_with_1_args(great_grandmother, GET_DAUGHTER, ZERO_INTEGER));
			}
		    }
		} finally {
		    {
			SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
			try {
			    bind($is_thread_performing_cleanupP$, T);
			    parse_tree.set_parse_tree_mother(self, mother);
			} finally {
			    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
			}
		    }
		}
	    } catch (Throwable ccatch_env_var) {
		catch_var_for_wdt_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym743$OUTER_CATCH_FOR_WDT_WORD_TREE_METHOD);
	    }
	    return catch_var_for_wdt_word_tree_method;
	}
    }

    /**
     *
     *
     * @return listp; the unique referents of this phrase
     */
    @LispMethod(comment = "@return listp; the unique referents of this phrase")
    public static SubLObject wdt_word_tree_get_refs_method(final SubLObject self) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject catch_var_for_wdt_word_tree_method = NIL;
	final SubLObject refs = get_word_tree_refs(self);
	try {
	    thread.throwStack.push($sym741$OUTER_CATCH_FOR_WDT_WORD_TREE_METHOD);
	    try {
		final SubLObject antecedent = methods.funcall_instance_method_with_0_args(self, GET_ANTECEDENT);
		sublisp_throw($sym741$OUTER_CATCH_FOR_WDT_WORD_TREE_METHOD, NIL != antecedent ? methods.funcall_instance_method_with_0_args(antecedent, GET_REFS) : refs);
	    } finally {
		final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    set_word_tree_refs(self, refs);
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
		}
	    }
	} catch (final Throwable ccatch_env_var) {
	    catch_var_for_wdt_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym741$OUTER_CATCH_FOR_WDT_WORD_TREE_METHOD);
	} finally {
	    thread.throwStack.pop();
	}
	return catch_var_for_wdt_word_tree_method;
    }

    /**
     *
     *
     * @return listp; the unique referents of this phrase
     */
    @LispMethod(comment = "@return listp; the unique referents of this phrase")
    public static final SubLObject wdt_word_tree_get_refs_method_alt(SubLObject self) {
	{
	    SubLObject catch_var_for_wdt_word_tree_method = NIL;
	    SubLObject refs = com.cyc.cycjava.cycl.word_tree.get_word_tree_refs(self);
	    try {
		try {
		    {
			SubLObject antecedent = methods.funcall_instance_method_with_0_args(self, GET_ANTECEDENT);
			sublisp_throw($sym741$OUTER_CATCH_FOR_WDT_WORD_TREE_METHOD, NIL != antecedent ? ((SubLObject) (methods.funcall_instance_method_with_0_args(antecedent, GET_REFS))) : refs);
		    }
		} finally {
		    {
			SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
			try {
			    bind($is_thread_performing_cleanupP$, T);
			    com.cyc.cycjava.cycl.word_tree.set_word_tree_refs(self, refs);
			} finally {
			    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
			}
		    }
		}
	    } catch (Throwable ccatch_env_var) {
		catch_var_for_wdt_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym741$OUTER_CATCH_FOR_WDT_WORD_TREE_METHOD);
	    }
	    return catch_var_for_wdt_word_tree_method;
	}
    }

    public static SubLObject wdt_word_tree_p(final SubLObject wdt_word_tree) {
	return classes.subloop_instanceof_class(wdt_word_tree, WDT_WORD_TREE);
    }

    public static final SubLObject wdt_word_tree_p_alt(SubLObject wdt_word_tree) {
	return classes.subloop_instanceof_class(wdt_word_tree, WDT_WORD_TREE);
    }

    /**
     *
     *
     * @return boolean; t if PARSE-EXPRESSION is a word expression, nil otherwise
     */
    @LispMethod(comment = "@return boolean; t if PARSE-EXPRESSION is a word expression, nil otherwise")
    public static SubLObject word_expression_p(final SubLObject parse_expression) {
	return stringp(second(parse_expression));
    }

    /**
     *
     *
     * @return boolean; t if PARSE-EXPRESSION is a word expression, nil otherwise
     */
    @LispMethod(comment = "@return boolean; t if PARSE-EXPRESSION is a word expression, nil otherwise")
    public static final SubLObject word_expression_p_alt(SubLObject parse_expression) {
	return stringp(second(parse_expression));
    }

    /**
     *
     *
     * @return stringp; the string of WORD-EXPRESSION
     */
    @LispMethod(comment = "@return stringp; the string of WORD-EXPRESSION")
    public static SubLObject word_expression_string(final SubLObject word_expression) {
	return second(word_expression);
    }

    /**
     *
     *
     * @return stringp; the string of WORD-EXPRESSION
     */
    @LispMethod(comment = "@return stringp; the string of WORD-EXPRESSION")
    public static final SubLObject word_expression_string_alt(SubLObject word_expression) {
	return second(word_expression);
    }

    /**
     *
     *
     * @param CATEGORY
     * 		keywordp; a Penn tagset pos category
     * @return symbolp; the subtype of word-tree that CATEGORY corresponds to
     */
    @LispMethod(comment = "@param CATEGORY\r\n\t\tkeywordp; a Penn tagset pos category\r\n@return symbolp; the subtype of word-tree that CATEGORY corresponds to")
    public static SubLObject word_for_category(final SubLObject category) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject word = assoc(category, $category_to_word$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED).rest();
	if (NIL == word) {
	    word = WORD_TREE;
	}
	return word;
    }

    /**
     *
     *
     * @param CATEGORY
     * 		keywordp; a Penn tagset pos category
     * @return symbolp; the subtype of word-tree that CATEGORY corresponds to
     */
    @LispMethod(comment = "@param CATEGORY\r\n\t\tkeywordp; a Penn tagset pos category\r\n@return symbolp; the subtype of word-tree that CATEGORY corresponds to")
    public static final SubLObject word_for_category_alt(SubLObject category) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject word = assoc(category, $category_to_word$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED).rest();
		if (NIL == word) {
		    word = WORD_TREE;
		}
		return word;
	    }
	}
    }

    public static SubLObject word_tree_cyclify_int_method(final SubLObject self) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	if ((NIL != cyclifier_interface.$allow_duplicate_cyclificationsP$.getDynamicValue(thread)) || (NIL == member(self, cyclifier_interface.$cyclification_complete$.getDynamicValue(thread), EQ, UNPROVIDED))) {
	    cyclifier_interface.$cyclification_complete$.setDynamicValue(cons(self, cyclifier_interface.$cyclification_complete$.getDynamicValue(thread)), thread);
	    return methods.funcall_instance_method_with_0_args(self, CYCLIFY_NUCLEUS);
	}
	return NIL;
    }

    public static final SubLObject word_tree_cyclify_int_method_alt(SubLObject self) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (!((NIL == cyclifier_interface.$allow_duplicate_cyclificationsP$.getDynamicValue(thread)) && (NIL != member(self, cyclifier_interface.$cyclification_complete$.getDynamicValue(thread), EQ, UNPROVIDED)))) {
		cyclifier_interface.$cyclification_complete$.setDynamicValue(cons(self, cyclifier_interface.$cyclification_complete$.getDynamicValue(thread)), thread);
		return methods.funcall_instance_method_with_0_args(self, CYCLIFY_NUCLEUS);
	    }
	    return NIL;
	}
    }

    public static SubLObject word_tree_cyclify_nucleus_method(final SubLObject self, SubLObject renamings) {
	if (renamings == UNPROVIDED) {
	    renamings = NIL;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject ndistr_comp_cycls = NIL;
	SubLObject distr_comp_cycls = NIL;
	SubLObject mod_cycls = NIL;
	SubLObject cycls = NIL;
	if (NIL == subl_promotions.memberP(self, cyclifier_interface.$cyclification_in_progress$.getDynamicValue(thread), EQ, UNPROVIDED)) {
	    final SubLObject _prev_bind_0 = cyclifier_interface.$cyclification_in_progress$.currentBinding(thread);
	    try {
		cyclifier_interface.$cyclification_in_progress$.bind(cons(self, cyclifier_interface.$cyclification_in_progress$.getDynamicValue(thread)), thread);
		if (NIL == renamings) {
		    renamings = methods.funcall_instance_method_with_1_args(self, GET_KEYWORD_RENAMINGS, cyclifier.required_keywords(methods.funcall_instance_method_with_0_args(self, GET_RANKED_LEXES)));
		}
		renamings = cyclifier_interface.group_disjunctive_renamings(renamings);
		thread.resetMultipleValues();
		final SubLObject non_distributing = methods.funcall_instance_method_with_0_args(self, PARTITION_SEMANTIC_COMPLEMENTS);
		final SubLObject distributing = thread.secondMultipleValue();
		thread.resetMultipleValues();
		SubLObject cdolist_list_var = non_distributing;
		SubLObject complement = NIL;
		complement = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
		    final SubLObject comp_cycl = methods.funcall_instance_method_with_0_args(complement, CYCLIFY_INT);
		    if (NIL != comp_cycl) {
			ndistr_comp_cycls = cons(comp_cycl, ndistr_comp_cycls);
		    }
		    cdolist_list_var = cdolist_list_var.rest();
		    complement = cdolist_list_var.first();
		}
		cdolist_list_var = distributing;
		complement = NIL;
		complement = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
		    final SubLObject comp_cycl = methods.funcall_instance_method_with_0_args(complement, CYCLIFY_INT);
		    if (NIL != comp_cycl) {
			distr_comp_cycls = cons(comp_cycl, distr_comp_cycls);
		    }
		    cdolist_list_var = cdolist_list_var.rest();
		    complement = cdolist_list_var.first();
		}
		cdolist_list_var = methods.funcall_instance_method_with_0_args(self, GET_MODIFIERS);
		SubLObject modifier = NIL;
		modifier = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
		    final SubLObject mod_cycl = methods.funcall_instance_method_with_0_args(modifier, CYCLIFY_INT);
		    if (NIL != mod_cycl) {
			mod_cycls = cons(mod_cycl, mod_cycls);
		    }
		    cdolist_list_var = cdolist_list_var.rest();
		    modifier = cdolist_list_var.first();
		}
		cdolist_list_var = renamings;
		SubLObject conjunction = NIL;
		conjunction = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
		    SubLObject cdolist_list_var_$1 = methods.funcall_instance_method_with_0_args(self, GET_RANKED_LEXES);
		    SubLObject rle = NIL;
		    rle = cdolist_list_var_$1.first();
		    while (NIL != cdolist_list_var_$1) {
			SubLObject my_cycls0 = NIL;
			SubLObject cdolist_list_var_$2 = conjunction;
			SubLObject grouping = NIL;
			grouping = cdolist_list_var_$2.first();
			while (NIL != cdolist_list_var_$2) {
			    SubLObject this_and_mods = NIL;
			    SubLObject cdolist_list_var_$3 = grouping;
			    SubLObject renaming = NIL;
			    renaming = cdolist_list_var_$3.first();
			    while (NIL != cdolist_list_var_$3) {
				this_and_mods = cons(Mapping.mapcar(INSTANTIATE_SCOPE, list_utilities.cross_products(cons(list(cyclifier_interface.apply_lex_renaming(self, rle, renaming)), mod_cycls))), this_and_mods);
				cdolist_list_var_$3 = cdolist_list_var_$3.rest();
				renaming = cdolist_list_var_$3.first();
			    }
			    my_cycls0 = cons(Mapping.mapcar(INSTANTIATE_SCOPE, list_utilities.cross_products(cons(Mapping.mapcar(INSTANTIATE_SCOPE, list_utilities.indexed_products(this_and_mods)), ndistr_comp_cycls))), my_cycls0);
			    cdolist_list_var_$2 = cdolist_list_var_$2.rest();
			    grouping = cdolist_list_var_$2.first();
			}
			cycls = append(cycls, Mapping.mapcar(INSTANTIATE_SCOPE, list_utilities.indexed_products(my_cycls0)));
			cdolist_list_var_$1 = cdolist_list_var_$1.rest();
			rle = cdolist_list_var_$1.first();
		    }
		    cdolist_list_var = cdolist_list_var.rest();
		    conjunction = cdolist_list_var.first();
		}
	    } finally {
		cyclifier_interface.$cyclification_in_progress$.rebind(_prev_bind_0, thread);
	    }
	}
	return Mapping.mapcar(INSTANTIATE_SCOPE, list_utilities.cross_products(cons(cycls, distr_comp_cycls)));
    }

    public static final SubLObject word_tree_cyclify_nucleus_method_alt(SubLObject self, SubLObject renamings) {
	if (renamings == UNPROVIDED) {
	    renamings = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject ndistr_comp_cycls = NIL;
		SubLObject distr_comp_cycls = NIL;
		SubLObject mod_cycls = NIL;
		SubLObject cycls = NIL;
		if (NIL == subl_promotions.memberP(self, cyclifier_interface.$cyclification_in_progress$.getDynamicValue(thread), EQ, UNPROVIDED)) {
		    {
			SubLObject _prev_bind_0 = cyclifier_interface.$cyclification_in_progress$.currentBinding(thread);
			try {
			    cyclifier_interface.$cyclification_in_progress$.bind(cons(self, cyclifier_interface.$cyclification_in_progress$.getDynamicValue(thread)), thread);
			    if (NIL == renamings) {
				renamings = methods.funcall_instance_method_with_1_args(self, GET_KEYWORD_RENAMINGS, cyclifier.required_keywords(methods.funcall_instance_method_with_0_args(self, GET_RANKED_LEXES)));
			    }
			    renamings = cyclifier_interface.group_disjunctive_renamings(renamings);
			    thread.resetMultipleValues();
			    {
				SubLObject non_distributing = methods.funcall_instance_method_with_0_args(self, PARTITION_SEMANTIC_COMPLEMENTS);
				SubLObject distributing = thread.secondMultipleValue();
				thread.resetMultipleValues();
				{
				    SubLObject cdolist_list_var = non_distributing;
				    SubLObject complement = NIL;
				    for (complement = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), complement = cdolist_list_var.first()) {
					{
					    SubLObject comp_cycl = methods.funcall_instance_method_with_0_args(complement, CYCLIFY_INT);
					    if (NIL != comp_cycl) {
						ndistr_comp_cycls = cons(comp_cycl, ndistr_comp_cycls);
					    }
					}
				    }
				}
				{
				    SubLObject cdolist_list_var = distributing;
				    SubLObject complement = NIL;
				    for (complement = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), complement = cdolist_list_var.first()) {
					{
					    SubLObject comp_cycl = methods.funcall_instance_method_with_0_args(complement, CYCLIFY_INT);
					    if (NIL != comp_cycl) {
						distr_comp_cycls = cons(comp_cycl, distr_comp_cycls);
					    }
					}
				    }
				}
				{
				    SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, GET_MODIFIERS);
				    SubLObject modifier = NIL;
				    for (modifier = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), modifier = cdolist_list_var.first()) {
					{
					    SubLObject mod_cycl = methods.funcall_instance_method_with_0_args(modifier, CYCLIFY_INT);
					    if (NIL != mod_cycl) {
						mod_cycls = cons(mod_cycl, mod_cycls);
					    }
					}
				    }
				}
				{
				    SubLObject cdolist_list_var = renamings;
				    SubLObject conjunction = NIL;
				    for (conjunction = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), conjunction = cdolist_list_var.first()) {
					{
					    SubLObject cdolist_list_var_1 = methods.funcall_instance_method_with_0_args(self, GET_RANKED_LEXES);
					    SubLObject rle = NIL;
					    for (rle = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest(), rle = cdolist_list_var_1.first()) {
						{
						    SubLObject my_cycls0 = NIL;
						    SubLObject cdolist_list_var_2 = conjunction;
						    SubLObject grouping = NIL;
						    for (grouping = cdolist_list_var_2.first(); NIL != cdolist_list_var_2; cdolist_list_var_2 = cdolist_list_var_2.rest(), grouping = cdolist_list_var_2.first()) {
							{
							    SubLObject this_and_mods = NIL;
							    SubLObject cdolist_list_var_3 = grouping;
							    SubLObject renaming = NIL;
							    for (renaming = cdolist_list_var_3.first(); NIL != cdolist_list_var_3; cdolist_list_var_3 = cdolist_list_var_3.rest(), renaming = cdolist_list_var_3.first()) {
								this_and_mods = cons(Mapping.mapcar(INSTANTIATE_SCOPE, list_utilities.cross_products(cons(list(cyclifier_interface.apply_lex_renaming(self, rle, renaming)), mod_cycls))), this_and_mods);
							    }
							    my_cycls0 = cons(Mapping.mapcar(INSTANTIATE_SCOPE, list_utilities.cross_products(cons(Mapping.mapcar(INSTANTIATE_SCOPE, list_utilities.indexed_products(this_and_mods)), ndistr_comp_cycls))), my_cycls0);
							}
						    }
						    cycls = append(cycls, Mapping.mapcar(INSTANTIATE_SCOPE, list_utilities.indexed_products(my_cycls0)));
						}
					    }
					}
				    }
				}
			    }
			} finally {
			    cyclifier_interface.$cyclification_in_progress$.rebind(_prev_bind_0, thread);
			}
		    }
		}
		return Mapping.mapcar(INSTANTIATE_SCOPE, list_utilities.cross_products(cons(cycls, distr_comp_cycls)));
	    }
	}
    }

    public static SubLObject word_tree_frame_filter_lexes_method(final SubLObject self) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject catch_var_for_word_tree_method = NIL;
	SubLObject lexes = get_word_tree_lexes(self);
	try {
	    thread.throwStack.push($sym28$OUTER_CATCH_FOR_WORD_TREE_METHOD);
	    try {
		SubLObject filtered = NIL;
		final SubLObject tree_keywords = methods.funcall_instance_method_with_0_args(self, TREE_KEYWORD_EQ_CLASSES);
		SubLObject lex_scores = NIL;
		SubLObject max_score = $int$_5;
		SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, GET_RANKED_LEXES);
		SubLObject rle = NIL;
		rle = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
		    final SubLObject lex_score = cyclifier_interface.lex_entry_score(cyclifier.rle_lex(rle), tree_keywords);
		    cyclifier.rle_set_confidence(rle, lex_score);
		    lex_scores = cons(rle, lex_scores);
		    if (lex_score.numG(max_score)) {
			max_score = lex_score;
		    }
		    cdolist_list_var = cdolist_list_var.rest();
		    rle = cdolist_list_var.first();
		}
		cdolist_list_var = lex_scores;
		rle = NIL;
		rle = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
		    if (cyclifier.rle_confidence(rle).numE(max_score)) {
			filtered = cons(rle, filtered);
		    }
		    cdolist_list_var = cdolist_list_var.rest();
		    rle = cdolist_list_var.first();
		}
		lexes = filtered;
		sublisp_throw($sym28$OUTER_CATCH_FOR_WORD_TREE_METHOD, lexes);
	    } finally {
		final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    set_word_tree_lexes(self, lexes);
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
		}
	    }
	} catch (final Throwable ccatch_env_var) {
	    catch_var_for_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym28$OUTER_CATCH_FOR_WORD_TREE_METHOD);
	} finally {
	    thread.throwStack.pop();
	}
	return catch_var_for_word_tree_method;
    }

    public static final SubLObject word_tree_frame_filter_lexes_method_alt(SubLObject self) {
	{
	    SubLObject catch_var_for_word_tree_method = NIL;
	    SubLObject lexes = com.cyc.cycjava.cycl.word_tree.get_word_tree_lexes(self);
	    try {
		try {
		    {
			SubLObject filtered = NIL;
			SubLObject tree_keywords = methods.funcall_instance_method_with_0_args(self, TREE_KEYWORD_EQ_CLASSES);
			SubLObject lex_scores = NIL;
			SubLObject max_score = $int$_5;
			{
			    SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, GET_RANKED_LEXES);
			    SubLObject rle = NIL;
			    for (rle = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), rle = cdolist_list_var.first()) {
				{
				    SubLObject lex_score = cyclifier_interface.lex_entry_score(cyclifier.rle_lex(rle), tree_keywords);
				    cyclifier.rle_set_confidence(rle, lex_score);
				    lex_scores = cons(rle, lex_scores);
				    if (lex_score.numG(max_score)) {
					max_score = lex_score;
				    }
				}
			    }
			}
			{
			    SubLObject cdolist_list_var = lex_scores;
			    SubLObject rle = NIL;
			    for (rle = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), rle = cdolist_list_var.first()) {
				if (cyclifier.rle_confidence(rle).numE(max_score)) {
				    filtered = cons(rle, filtered);
				}
			    }
			}
			lexes = filtered;
			sublisp_throw($sym28$OUTER_CATCH_FOR_WORD_TREE_METHOD, lexes);
		    }
		} finally {
		    {
			SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
			try {
			    bind($is_thread_performing_cleanupP$, T);
			    com.cyc.cycjava.cycl.word_tree.set_word_tree_lexes(self, lexes);
			} finally {
			    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
			}
		    }
		}
	    } catch (Throwable ccatch_env_var) {
		catch_var_for_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym28$OUTER_CATCH_FOR_WORD_TREE_METHOD);
	    }
	    return catch_var_for_word_tree_method;
	}
    }

    /**
     *
     *
     * @return non-negative-integer-p; the absolute index of this word
     */
    @LispMethod(comment = "@return non-negative-integer-p; the absolute index of this word")
    public static SubLObject word_tree_get_abs_index_method(final SubLObject self) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject catch_var_for_word_tree_method = NIL;
	final SubLObject abs_idx = get_word_tree_abs_idx(self);
	try {
	    thread.throwStack.push($sym92$OUTER_CATCH_FOR_WORD_TREE_METHOD);
	    try {
		sublisp_throw($sym92$OUTER_CATCH_FOR_WORD_TREE_METHOD, abs_idx);
	    } finally {
		final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    set_word_tree_abs_idx(self, abs_idx);
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
		}
	    }
	} catch (final Throwable ccatch_env_var) {
	    catch_var_for_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym92$OUTER_CATCH_FOR_WORD_TREE_METHOD);
	} finally {
	    thread.throwStack.pop();
	}
	return catch_var_for_word_tree_method;
    }

    /**
     *
     *
     * @return non-negative-integer-p; the absolute index of this word
     */
    @LispMethod(comment = "@return non-negative-integer-p; the absolute index of this word")
    public static final SubLObject word_tree_get_abs_index_method_alt(SubLObject self) {
	{
	    SubLObject catch_var_for_word_tree_method = NIL;
	    SubLObject abs_idx = com.cyc.cycjava.cycl.word_tree.get_word_tree_abs_idx(self);
	    try {
		try {
		    sublisp_throw($sym92$OUTER_CATCH_FOR_WORD_TREE_METHOD, abs_idx);
		} finally {
		    {
			SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
			try {
			    bind($is_thread_performing_cleanupP$, T);
			    com.cyc.cycjava.cycl.word_tree.set_word_tree_abs_idx(self, abs_idx);
			} finally {
			    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
			}
		    }
		}
	    } catch (Throwable ccatch_env_var) {
		catch_var_for_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym92$OUTER_CATCH_FOR_WORD_TREE_METHOD);
	    }
	    return catch_var_for_word_tree_method;
	}
    }

    /**
     *
     *
     * @return listp; a list of complements of this word
     */
    @LispMethod(comment = "@return listp; a list of complements of this word")
    public static SubLObject word_tree_get_complements_method(final SubLObject self) {
	return NIL;
    }

    /**
     *
     *
     * @return listp; a list of complements of this word
     */
    @LispMethod(comment = "@return listp; a list of complements of this word")
    public static final SubLObject word_tree_get_complements_method_alt(SubLObject self) {
	return NIL;
    }

    /**
     *
     *
     * @return determiner-word-tree-p; an empty (null) determiner for this word
     */
    @LispMethod(comment = "@return determiner-word-tree-p; an empty (null) determiner for this word")
    public static SubLObject word_tree_get_existential_null_determiner_method(final SubLObject self) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject catch_var_for_word_tree_method = NIL;
	final SubLObject v_context = parse_tree.get_parse_tree_context(self);
	try {
	    thread.throwStack.push($sym256$OUTER_CATCH_FOR_WORD_TREE_METHOD);
	    try {
		sublisp_throw($sym256$OUTER_CATCH_FOR_WORD_TREE_METHOD, get_null_determiner($$thereExists, $$and, self, v_context));
	    } finally {
		final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    parse_tree.set_parse_tree_context(self, v_context);
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
		}
	    }
	} catch (final Throwable ccatch_env_var) {
	    catch_var_for_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym256$OUTER_CATCH_FOR_WORD_TREE_METHOD);
	} finally {
	    thread.throwStack.pop();
	}
	return catch_var_for_word_tree_method;
    }

    /**
     *
     *
     * @return determiner-word-tree-p; an empty (null) determiner for this word
     */
    @LispMethod(comment = "@return determiner-word-tree-p; an empty (null) determiner for this word")
    public static final SubLObject word_tree_get_existential_null_determiner_method_alt(SubLObject self) {
	{
	    SubLObject catch_var_for_word_tree_method = NIL;
	    SubLObject v_context = parse_tree.get_parse_tree_context(self);
	    try {
		try {
		    sublisp_throw($sym256$OUTER_CATCH_FOR_WORD_TREE_METHOD, com.cyc.cycjava.cycl.word_tree.get_null_determiner($$thereExists, $$and, self, v_context));
		} finally {
		    {
			SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
			try {
			    bind($is_thread_performing_cleanupP$, T);
			    parse_tree.set_parse_tree_context(self, v_context);
			} finally {
			    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
			}
		    }
		}
	    } catch (Throwable ccatch_env_var) {
		catch_var_for_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym256$OUTER_CATCH_FOR_WORD_TREE_METHOD);
	    }
	    return catch_var_for_word_tree_method;
	}
    }

    /**
     *
     *
     * @return word-tree-p; the head of this word
     */
    @LispMethod(comment = "@return word-tree-p; the head of this word")
    public static SubLObject word_tree_get_head_method(final SubLObject self) {
	return self;
    }

    /**
     *
     *
     * @return word-tree-p; the head of this word
     */
    @LispMethod(comment = "@return word-tree-p; the head of this word")
    public static final SubLObject word_tree_get_head_method_alt(SubLObject self) {
	return self;
    }

    /**
     *
     *
     * @return listp; a list containing the head of this word
     */
    @LispMethod(comment = "@return listp; a list containing the head of this word")
    public static SubLObject word_tree_get_heads_method(final SubLObject self) {
	return list(self);
    }

    /**
     *
     *
     * @return listp; a list containing the head of this word
     */
    @LispMethod(comment = "@return listp; a list containing the head of this word")
    public static final SubLObject word_tree_get_heads_method_alt(SubLObject self) {
	return list(self);
    }

    public static SubLObject word_tree_get_keyword_renamings_method(final SubLObject self, SubLObject keywords) {
	if (keywords == UNPROVIDED) {
	    keywords = NIL;
	}
	return NIL;
    }

    public static final SubLObject word_tree_get_keyword_renamings_method_alt(SubLObject self, SubLObject keywords) {
	if (keywords == UNPROVIDED) {
	    keywords = NIL;
	}
	return NIL;
    }

    /**
     *
     *
     * @return listp; the list of lexical entries of this word
     */
    @LispMethod(comment = "@return listp; the list of lexical entries of this word")
    public static SubLObject word_tree_get_lexes_method(final SubLObject self) {
	return Mapping.mapcar(CAR, methods.funcall_instance_method_with_0_args(self, GET_RANKED_LEXES));
    }

    /**
     *
     *
     * @return listp; the list of lexical entries of this word
     */
    @LispMethod(comment = "@return listp; the list of lexical entries of this word")
    public static final SubLObject word_tree_get_lexes_method_alt(SubLObject self) {
	return Mapping.mapcar(CAR, methods.funcall_instance_method_with_0_args(self, GET_RANKED_LEXES));
    }

    /**
     *
     *
     * @return listp; a list of phrases that this word modifies
     */
    @LispMethod(comment = "@return listp; a list of phrases that this word modifies")
    public static SubLObject word_tree_get_modifieds_method(final SubLObject self) {
	return NIL;
    }

    /**
     *
     *
     * @return listp; a list of phrases that this word modifies
     */
    @LispMethod(comment = "@return listp; a list of phrases that this word modifies")
    public static final SubLObject word_tree_get_modifieds_method_alt(SubLObject self) {
	return NIL;
    }

    /**
     *
     *
     * @return listp; a list of all modifiers of this word
     */
    @LispMethod(comment = "@return listp; a list of all modifiers of this word")
    public static SubLObject word_tree_get_modifiers_method(final SubLObject self) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject catch_var_for_word_tree_method = NIL;
	final SubLObject modifiers = parse_tree.get_parse_tree_modifiers(self);
	try {
	    thread.throwStack.push($sym144$OUTER_CATCH_FOR_WORD_TREE_METHOD);
	    try {
		sublisp_throw($sym144$OUTER_CATCH_FOR_WORD_TREE_METHOD, modifiers);
	    } finally {
		final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    parse_tree.set_parse_tree_modifiers(self, modifiers);
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
		}
	    }
	} catch (final Throwable ccatch_env_var) {
	    catch_var_for_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym144$OUTER_CATCH_FOR_WORD_TREE_METHOD);
	} finally {
	    thread.throwStack.pop();
	}
	return catch_var_for_word_tree_method;
    }

    /**
     *
     *
     * @return listp; a list of all modifiers of this word
     */
    @LispMethod(comment = "@return listp; a list of all modifiers of this word")
    public static final SubLObject word_tree_get_modifiers_method_alt(SubLObject self) {
	{
	    SubLObject catch_var_for_word_tree_method = NIL;
	    SubLObject modifiers = parse_tree.get_parse_tree_modifiers(self);
	    try {
		try {
		    sublisp_throw($sym144$OUTER_CATCH_FOR_WORD_TREE_METHOD, modifiers);
		} finally {
		    {
			SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
			try {
			    bind($is_thread_performing_cleanupP$, T);
			    parse_tree.set_parse_tree_modifiers(self, modifiers);
			} finally {
			    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
			}
		    }
		}
	    } catch (Throwable ccatch_env_var) {
		catch_var_for_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym144$OUTER_CATCH_FOR_WORD_TREE_METHOD);
	    }
	    return catch_var_for_word_tree_method;
	}
    }

    public static SubLObject word_tree_get_oblique_object_method(final SubLObject self) {
	final SubLObject pp = methods.funcall_instance_method_with_0_args(self, GET_PP_COMPLEMENT);
	final SubLObject obl_obj = (NIL != pp) ? methods.funcall_instance_method_with_0_args(pp, GET_OBLIQUE_OBJECT) : NIL;
	return obl_obj;
    }

    public static final SubLObject word_tree_get_oblique_object_method_alt(SubLObject self) {
	{
	    SubLObject pp = methods.funcall_instance_method_with_0_args(self, GET_PP_COMPLEMENT);
	    SubLObject obl_obj = (NIL != pp) ? ((SubLObject) (methods.funcall_instance_method_with_0_args(pp, GET_OBLIQUE_OBJECT))) : NIL;
	    return obl_obj;
	}
    }

    /**
     *
     *
     * @return listp; the parse expression of this word tree
     * @unknown bertolo
     */
    @LispMethod(comment = "@return listp; the parse expression of this word tree\r\n@unknown bertolo")
    public static SubLObject word_tree_get_parse_expression_method(final SubLObject self) {
	return list(methods.funcall_instance_method_with_0_args(self, GET_CATEGORY), methods.funcall_instance_method_with_0_args(self, GET_STRING));
    }

    /**
     *
     *
     * @return listp; the parse expression of this word tree
     * @unknown bertolo
     */
    @LispMethod(comment = "@return listp; the parse expression of this word tree\r\n@unknown bertolo")
    public static final SubLObject word_tree_get_parse_expression_method_alt(SubLObject self) {
	return list(methods.funcall_instance_method_with_0_args(self, GET_CATEGORY), methods.funcall_instance_method_with_0_args(self, GET_STRING));
    }

    public static SubLObject word_tree_get_pp_complement_method(final SubLObject self) {
	SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, GET_PPS);
	SubLObject pp = NIL;
	pp = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    final SubLObject pp_head = (NIL != pp) ? methods.funcall_instance_method_with_0_args(pp, GET_HEAD) : NIL;
	    final SubLObject pp_head_string = (NIL != pp_head) ? methods.funcall_instance_method_with_0_args(pp_head, GET_STRING) : NIL;
	    if (NIL != pp_head_string) {
		SubLObject cdolist_list_var_$4 = methods.funcall_instance_method_with_0_args(self, GET_RANKED_LEXES);
		SubLObject rle = NIL;
		rle = cdolist_list_var_$4.first();
		while (NIL != cdolist_list_var_$4) {
		    final SubLObject cycl = methods.funcall_instance_method_with_1_args(cyclifier.rle_lex(rle), GET, $SEMTRANS);
		    final SubLObject keywords = cyclifier.formula_keywords(cycl);
		    final SubLObject frame = methods.funcall_instance_method_with_1_args(cyclifier.rle_lex(rle), GET, $FRAME);
		    if (((NIL != subl_promotions.memberP($OBLIQUE_OBJECT, keywords, EQL, UNPROVIDED)) && (NIL != cycl_utilities.formula_arg2(frame, UNPROVIDED))) && (NIL != isa.isaP(frame, $$PPCompFrame, $$EverythingPSC, UNPROVIDED))) {
			final SubLObject preposition = cycl_utilities.formula_arg2(frame, UNPROVIDED);
			final SubLObject prep_string = lexicon_accessors.get_strings_of_type(preposition, $$Preposition, UNPROVIDED, UNPROVIDED, UNPROVIDED).first();
			if (prep_string.equalp(pp_head_string)) {
			    return pp;
			}
		    } else if ((NIL != intersection($list69, keywords, EQL, UNPROVIDED)) && $$$of.equalp(pp_head_string)) {
			return pp;
		    }

		    cdolist_list_var_$4 = cdolist_list_var_$4.rest();
		    rle = cdolist_list_var_$4.first();
		}
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    pp = cdolist_list_var.first();
	}
	return NIL;
    }

    public static final SubLObject word_tree_get_pp_complement_method_alt(SubLObject self) {
	{
	    SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, GET_PPS);
	    SubLObject pp = NIL;
	    for (pp = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), pp = cdolist_list_var.first()) {
		{
		    SubLObject pp_head = (NIL != pp) ? ((SubLObject) (methods.funcall_instance_method_with_0_args(pp, GET_HEAD))) : NIL;
		    SubLObject pp_head_string = (NIL != pp_head) ? ((SubLObject) (methods.funcall_instance_method_with_0_args(pp_head, GET_STRING))) : NIL;
		    if (NIL != pp_head_string) {
			{
			    SubLObject cdolist_list_var_4 = methods.funcall_instance_method_with_0_args(self, GET_RANKED_LEXES);
			    SubLObject rle = NIL;
			    for (rle = cdolist_list_var_4.first(); NIL != cdolist_list_var_4; cdolist_list_var_4 = cdolist_list_var_4.rest(), rle = cdolist_list_var_4.first()) {
				{
				    SubLObject cycl = methods.funcall_instance_method_with_1_args(cyclifier.rle_lex(rle), GET, $SEMTRANS);
				    SubLObject keywords = cyclifier.formula_keywords(cycl);
				    SubLObject frame = methods.funcall_instance_method_with_1_args(cyclifier.rle_lex(rle), GET, $FRAME);
				    if (((NIL != subl_promotions.memberP($OBLIQUE_OBJECT, keywords, EQL, UNPROVIDED)) && (NIL != cycl_utilities.formula_arg2(frame, UNPROVIDED))) && (NIL != isa.isaP(frame, $$PPCompFrame, $$EverythingPSC, UNPROVIDED))) {
					{
					    SubLObject preposition = cycl_utilities.formula_arg2(frame, UNPROVIDED);
					    SubLObject prep_string = lexicon_accessors.get_strings_of_type(preposition, $$Preposition, UNPROVIDED, UNPROVIDED, UNPROVIDED).first();
					    if (prep_string.equalp(pp_head_string)) {
						return pp;
					    }
					}
				    } else {
					if ((NIL != intersection($list_alt69, keywords, EQL, UNPROVIDED)) && $$$of.equalp(pp_head_string)) {
					    return pp;
					}
				    }
				}
			    }
			}
		    }
		}
	    }
	}
	return NIL;
    }

    /**
     *
     *
     * @return listp; pps related to this word, either as an adjunct
    or as a complement
     */
    @LispMethod(comment = "@return listp; pps related to this word, either as an adjunct\r\nor as a complement")
    public static SubLObject word_tree_get_pps_method(final SubLObject self) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject catch_var_for_word_tree_method = NIL;
	final SubLObject idx = parse_tree.get_parse_tree_idx(self);
	final SubLObject mother = parse_tree.get_parse_tree_mother(self);
	try {
	    thread.throwStack.push($sym134$OUTER_CATCH_FOR_WORD_TREE_METHOD);
	    try {
		SubLObject pps = methods.funcall_instance_method_with_2_args(mother, FIND, PREPOSITIONAL_TREE_P, number_utilities.f_1X(idx));
		if (NIL != pps) {
		    sublisp_throw($sym134$OUTER_CATCH_FOR_WORD_TREE_METHOD, pps);
		}
		SubLObject tree;
		for (tree = mother, pps = methods.funcall_instance_method_with_1_args(tree, FIND, WHPP_TREE_P); (NIL == pps)
			&& (NIL == methods.funcall_instance_method_with_0_args(tree, ROOT_P)); tree = methods.funcall_instance_method_with_0_args(tree, GET_MOTHER), pps = methods.funcall_instance_method_with_1_args(tree, FIND, WHPP_TREE_P)) {
		}
		if (NIL != pps) {
		    sublisp_throw($sym134$OUTER_CATCH_FOR_WORD_TREE_METHOD, pps);
		}
	    } finally {
		final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    parse_tree.set_parse_tree_idx(self, idx);
		    parse_tree.set_parse_tree_mother(self, mother);
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
		}
	    }
	} catch (final Throwable ccatch_env_var) {
	    catch_var_for_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym134$OUTER_CATCH_FOR_WORD_TREE_METHOD);
	} finally {
	    thread.throwStack.pop();
	}
	return catch_var_for_word_tree_method;
    }

    /**
     *
     *
     * @return listp; pps related to this word, either as an adjunct
    or as a complement
     */
    @LispMethod(comment = "@return listp; pps related to this word, either as an adjunct\r\nor as a complement")
    public static final SubLObject word_tree_get_pps_method_alt(SubLObject self) {
	{
	    SubLObject catch_var_for_word_tree_method = NIL;
	    SubLObject idx = parse_tree.get_parse_tree_idx(self);
	    SubLObject mother = parse_tree.get_parse_tree_mother(self);
	    try {
		try {
		    {
			SubLObject pps = methods.funcall_instance_method_with_2_args(mother, FIND, PREPOSITIONAL_TREE_P, number_utilities.f_1X(idx));
			if (NIL != pps) {
			    sublisp_throw($sym134$OUTER_CATCH_FOR_WORD_TREE_METHOD, pps);
			}
			{
			    SubLObject tree = mother;
			    pps = methods.funcall_instance_method_with_1_args(tree, FIND, WHPP_TREE_P);
			    while (!((NIL != pps) || (NIL != methods.funcall_instance_method_with_0_args(tree, ROOT_P)))) {
				tree = methods.funcall_instance_method_with_0_args(tree, GET_MOTHER);
				pps = methods.funcall_instance_method_with_1_args(tree, FIND, WHPP_TREE_P);
			    }
			    if (NIL != pps) {
				sublisp_throw($sym134$OUTER_CATCH_FOR_WORD_TREE_METHOD, pps);
			    }
			}
		    }
		} finally {
		    {
			SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
			try {
			    bind($is_thread_performing_cleanupP$, T);
			    parse_tree.set_parse_tree_idx(self, idx);
			    parse_tree.set_parse_tree_mother(self, mother);
			} finally {
			    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
			}
		    }
		}
	    } catch (Throwable ccatch_env_var) {
		catch_var_for_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym134$OUTER_CATCH_FOR_WORD_TREE_METHOD);
	    }
	    return catch_var_for_word_tree_method;
	}
    }

    /**
     *
     *
     * @return listp; the list of ranked lexical entries of this word
     */
    @LispMethod(comment = "@return listp; the list of ranked lexical entries of this word")
    public static SubLObject word_tree_get_ranked_lexes_method(final SubLObject self) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject catch_var_for_word_tree_method = NIL;
	final SubLObject lexes = get_word_tree_lexes(self);
	try {
	    thread.throwStack.push($sym98$OUTER_CATCH_FOR_WORD_TREE_METHOD);
	    try {
		sublisp_throw($sym98$OUTER_CATCH_FOR_WORD_TREE_METHOD, lexes);
	    } finally {
		final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    set_word_tree_lexes(self, lexes);
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
		}
	    }
	} catch (final Throwable ccatch_env_var) {
	    catch_var_for_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym98$OUTER_CATCH_FOR_WORD_TREE_METHOD);
	} finally {
	    thread.throwStack.pop();
	}
	return catch_var_for_word_tree_method;
    }

    /**
     *
     *
     * @return listp; the list of ranked lexical entries of this word
     */
    @LispMethod(comment = "@return listp; the list of ranked lexical entries of this word")
    public static final SubLObject word_tree_get_ranked_lexes_method_alt(SubLObject self) {
	{
	    SubLObject catch_var_for_word_tree_method = NIL;
	    SubLObject lexes = com.cyc.cycjava.cycl.word_tree.get_word_tree_lexes(self);
	    try {
		try {
		    sublisp_throw($sym98$OUTER_CATCH_FOR_WORD_TREE_METHOD, lexes);
		} finally {
		    {
			SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
			try {
			    bind($is_thread_performing_cleanupP$, T);
			    com.cyc.cycjava.cycl.word_tree.set_word_tree_lexes(self, lexes);
			} finally {
			    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
			}
		    }
		}
	    } catch (Throwable ccatch_env_var) {
		catch_var_for_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym98$OUTER_CATCH_FOR_WORD_TREE_METHOD);
	    }
	    return catch_var_for_word_tree_method;
	}
    }

    /**
     *
     *
     * @return listp; the unique referent of this word
     */
    @LispMethod(comment = "@return listp; the unique referent of this word")
    public static SubLObject word_tree_get_refs_method(final SubLObject self) {
	final SubLObject refs = get_word_tree_refs(self);
	return refs;
    }

    /**
     *
     *
     * @return listp; the unique referent of this word
     */
    @LispMethod(comment = "@return listp; the unique referent of this word")
    public static final SubLObject word_tree_get_refs_method_alt(SubLObject self) {
	{
	    SubLObject refs = com.cyc.cycjava.cycl.word_tree.get_word_tree_refs(self);
	    return refs;
	}
    }

    public static SubLObject word_tree_get_semantic_complements_method(final SubLObject self) {
	return methods.funcall_instance_method_with_0_args(self, GET_COMPLEMENTS);
    }

    public static final SubLObject word_tree_get_semantic_complements_method_alt(SubLObject self) {
	return methods.funcall_instance_method_with_0_args(self, GET_COMPLEMENTS);
    }

    /**
     *
     *
     * @return listp; a list containing the semantic head of this word
     */
    @LispMethod(comment = "@return listp; a list containing the semantic head of this word")
    public static SubLObject word_tree_get_semantic_heads_method(final SubLObject self) {
	return list(self);
    }

    /**
     *
     *
     * @return listp; a list containing the semantic head of this word
     */
    @LispMethod(comment = "@return listp; a list containing the semantic head of this word")
    public static final SubLObject word_tree_get_semantic_heads_method_alt(SubLObject self) {
	return list(self);
    }

    /**
     *
     *
     * @return stringp; the string of this word-tree
     */
    @LispMethod(comment = "@return stringp; the string of this word-tree")
    public static SubLObject word_tree_get_string_method(final SubLObject self) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject catch_var_for_word_tree_method = NIL;
	final SubLObject string = parse_tree.get_parse_tree_string(self);
	try {
	    thread.throwStack.push($sym88$OUTER_CATCH_FOR_WORD_TREE_METHOD);
	    try {
		sublisp_throw($sym88$OUTER_CATCH_FOR_WORD_TREE_METHOD, string);
	    } finally {
		final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    parse_tree.set_parse_tree_string(self, string);
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
		}
	    }
	} catch (final Throwable ccatch_env_var) {
	    catch_var_for_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym88$OUTER_CATCH_FOR_WORD_TREE_METHOD);
	} finally {
	    thread.throwStack.pop();
	}
	return catch_var_for_word_tree_method;
    }

    /**
     *
     *
     * @return stringp; the string of this word-tree
     */
    @LispMethod(comment = "@return stringp; the string of this word-tree")
    public static final SubLObject word_tree_get_string_method_alt(SubLObject self) {
	{
	    SubLObject catch_var_for_word_tree_method = NIL;
	    SubLObject string = parse_tree.get_parse_tree_string(self);
	    try {
		try {
		    sublisp_throw($sym88$OUTER_CATCH_FOR_WORD_TREE_METHOD, string);
		} finally {
		    {
			SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
			try {
			    bind($is_thread_performing_cleanupP$, T);
			    parse_tree.set_parse_tree_string(self, string);
			} finally {
			    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
			}
		    }
		}
	    } catch (Throwable ccatch_env_var) {
		catch_var_for_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym88$OUTER_CATCH_FOR_WORD_TREE_METHOD);
	    }
	    return catch_var_for_word_tree_method;
	}
    }

    /**
     *
     *
     * @return parse-tree-p; a version of this word-tree with lexical entries
     */
    @LispMethod(comment = "@return parse-tree-p; a version of this word-tree with lexical entries")
    public static SubLObject word_tree_lexify_int_method(final SubLObject self, final SubLObject lexicon) {
	instances.set_slot(self, LEXES, cyclifier.new_even_lex_entry_distribution(methods.funcall_instance_method_with_1_args(lexicon, GET, instances.get_slot(self, STRING))));
	methods.funcall_instance_method_with_0_args(self, POS_FILTER_LEXES);
	if (NIL != semtrans_lexicon.semtrans_lexicon_p(lexicon)) {
	    methods.funcall_instance_method_with_0_args(self, PP_COMP_FILTER_LEXES);
	    if (NIL != verbal_word_tree_p(self)) {
		methods.funcall_instance_method_with_0_args(self, PARTICLE_FILTER_LEXES);
	    }
	    methods.funcall_instance_method_with_0_args(self, FRAME_FILTER_LEXES);
	    instances.set_slot(self, LEXES, remove_duplicates(instances.get_slot(self, LEXES), RLE_SEM_EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED));
	    if (((NIL == instances.get_slot(self, LEXES)) && (NIL == term_lexicon.term_lexicon_p(lexicon))) && (NIL == methods.funcall_instance_method_with_0_args(lexicon, $sym129$FABRICATION_FORBIDDEN_))) {
		final SubLObject fabricated_lexes = methods.funcall_instance_method_with_3_args(lexicon, FABRICATE, instances.get_slot(self, STRING), Mapping.mapcar(CAR, methods.funcall_instance_method_with_0_args(self, GET_KEYWORD_RENAMINGS).first().first()), instances.get_slot(self, CATEGORY));
		if (NIL != fabricated_lexes) {
		    instances.set_slot(self, LEXES, Mapping.mapcar(NEW_RANKED_LEX_ENTRY, fabricated_lexes));
		}
	    }
	}
	return instances.get_slot(self, LEXES);
    }

    /**
     *
     *
     * @return parse-tree-p; a version of this word-tree with lexical entries
     */
    @LispMethod(comment = "@return parse-tree-p; a version of this word-tree with lexical entries")
    public static final SubLObject word_tree_lexify_int_method_alt(SubLObject self, SubLObject lexicon) {
	instances.set_slot(self, LEXES, cyclifier.new_even_lex_entry_distribution(methods.funcall_instance_method_with_1_args(lexicon, GET, instances.get_slot(self, STRING))));
	methods.funcall_instance_method_with_0_args(self, POS_FILTER_LEXES);
	if (NIL != semtrans_lexicon.semtrans_lexicon_p(lexicon)) {
	    methods.funcall_instance_method_with_0_args(self, PP_COMP_FILTER_LEXES);
	    if (NIL != com.cyc.cycjava.cycl.word_tree.verbal_word_tree_p(self)) {
		methods.funcall_instance_method_with_0_args(self, PARTICLE_FILTER_LEXES);
	    }
	    methods.funcall_instance_method_with_0_args(self, FRAME_FILTER_LEXES);
	    instances.set_slot(self, LEXES, remove_duplicates(instances.get_slot(self, LEXES), RLE_SEM_EQUAL, UNPROVIDED, UNPROVIDED, UNPROVIDED));
	    if (!(((NIL != instances.get_slot(self, LEXES)) || (NIL != term_lexicon.term_lexicon_p(lexicon))) || (NIL != methods.funcall_instance_method_with_0_args(lexicon, $sym129$FABRICATION_FORBIDDEN_)))) {
		{
		    SubLObject fabricated_lexes = methods.funcall_instance_method_with_3_args(lexicon, FABRICATE, instances.get_slot(self, STRING), Mapping.mapcar(CAR, methods.funcall_instance_method_with_0_args(self, GET_KEYWORD_RENAMINGS).first().first()), instances.get_slot(self, CATEGORY));
		    if (NIL != fabricated_lexes) {
			instances.set_slot(self, LEXES, Mapping.mapcar(NEW_RANKED_LEX_ENTRY, fabricated_lexes));
		    }
		}
	    }
	}
	return instances.get_slot(self, LEXES);
    }

    /**
     *
     *
     * @return listp; the logical form of this word
     */
    @LispMethod(comment = "@return listp; the logical form of this word")
    public static SubLObject word_tree_logical_form_int_method(final SubLObject self) {
	return NIL;
    }

    /**
     *
     *
     * @return listp; the logical form of this word
     */
    @LispMethod(comment = "@return listp; the logical form of this word")
    public static final SubLObject word_tree_logical_form_int_method_alt(SubLObject self) {
	return NIL;
    }

    public static SubLObject word_tree_modified_dependent_meaning_p_method(final SubLObject self) {
	SubLObject semtrans = NIL;
	SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, GET_RANKED_LEXES);
	SubLObject rle = NIL;
	rle = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    semtrans = methods.funcall_instance_method_with_1_args(cyclifier.rle_lex(rle), GET, $SEMTRANS);
	    if (NIL != subl_promotions.memberP($REPLACE, cyclifier.formula_keywords(semtrans), UNPROVIDED, UNPROVIDED)) {
		return T;
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    rle = cdolist_list_var.first();
	}
	return NIL;
    }

    public static final SubLObject word_tree_modified_dependent_meaning_p_method_alt(SubLObject self) {
	{
	    SubLObject semtrans = NIL;
	    SubLObject cdolist_list_var = methods.funcall_instance_method_with_0_args(self, GET_RANKED_LEXES);
	    SubLObject rle = NIL;
	    for (rle = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), rle = cdolist_list_var.first()) {
		semtrans = methods.funcall_instance_method_with_1_args(cyclifier.rle_lex(rle), GET, $SEMTRANS);
		if (NIL != subl_promotions.memberP($REPLACE, cyclifier.formula_keywords(semtrans), UNPROVIDED, UNPROVIDED)) {
		    return T;
		}
	    }
	    return NIL;
	}
    }

    public static SubLObject word_tree_p(final SubLObject v_word_tree) {
	return classes.subloop_instanceof_class(v_word_tree, WORD_TREE);
    }

    public static final SubLObject word_tree_p_alt(SubLObject v_word_tree) {
	return classes.subloop_instanceof_class(v_word_tree, WORD_TREE);
    }

    public static SubLObject word_tree_partition_semantic_complements_method(final SubLObject self) {
	return values(methods.funcall_instance_method_with_0_args(self, GET_SEMANTIC_COMPLEMENTS), NIL);
    }

    public static final SubLObject word_tree_partition_semantic_complements_method_alt(SubLObject self) {
	return values(methods.funcall_instance_method_with_0_args(self, GET_SEMANTIC_COMPLEMENTS), NIL);
    }

    public static SubLObject word_tree_pos_filter_lexes_method(final SubLObject self) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject catch_var_for_word_tree_method = NIL;
	SubLObject lexes = get_word_tree_lexes(self);
	try {
	    thread.throwStack.push($sym34$OUTER_CATCH_FOR_WORD_TREE_METHOD);
	    try {
		SubLObject filtered = NIL;
		SubLObject cdolist_list_var = lexes;
		SubLObject rle = NIL;
		rle = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
		    if (NIL != member(methods.funcall_instance_method_with_0_args(self, GET_CATEGORY), methods.funcall_instance_method_with_1_args(cyclifier.rle_lex(rle), GET, $PENN_TAGS), UNPROVIDED, UNPROVIDED)) {
			cyclifier.rle_set_confidence(rle, ONE_INTEGER);
			filtered = cons(rle, filtered);
		    } else if (NIL != member(methods.funcall_instance_method_with_0_args(self, GET_CATEGORY), methods.funcall_instance_method_with_1_args(cyclifier.rle_lex(rle), GET, $BACKOFF_PENN_TAGS), UNPROVIDED, UNPROVIDED)) {
			cyclifier.rle_set_confidence(rle, $float$0_75);
			filtered = cons(rle, filtered);
		    }

		    cdolist_list_var = cdolist_list_var.rest();
		    rle = cdolist_list_var.first();
		}
		lexes = filtered;
		sublisp_throw($sym34$OUTER_CATCH_FOR_WORD_TREE_METHOD, lexes);
	    } finally {
		final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    set_word_tree_lexes(self, lexes);
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
		}
	    }
	} catch (final Throwable ccatch_env_var) {
	    catch_var_for_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym34$OUTER_CATCH_FOR_WORD_TREE_METHOD);
	} finally {
	    thread.throwStack.pop();
	}
	return catch_var_for_word_tree_method;
    }

    public static final SubLObject word_tree_pos_filter_lexes_method_alt(SubLObject self) {
	{
	    SubLObject catch_var_for_word_tree_method = NIL;
	    SubLObject lexes = com.cyc.cycjava.cycl.word_tree.get_word_tree_lexes(self);
	    try {
		try {
		    {
			SubLObject filtered = NIL;
			SubLObject cdolist_list_var = lexes;
			SubLObject rle = NIL;
			for (rle = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), rle = cdolist_list_var.first()) {
			    if (NIL != member(methods.funcall_instance_method_with_0_args(self, GET_CATEGORY), methods.funcall_instance_method_with_1_args(cyclifier.rle_lex(rle), GET, $PENN_TAGS), UNPROVIDED, UNPROVIDED)) {
				cyclifier.rle_set_confidence(rle, ONE_INTEGER);
				filtered = cons(rle, filtered);
			    } else {
				if (NIL != member(methods.funcall_instance_method_with_0_args(self, GET_CATEGORY), methods.funcall_instance_method_with_1_args(cyclifier.rle_lex(rle), GET, $BACKOFF_PENN_TAGS), UNPROVIDED, UNPROVIDED)) {
				    cyclifier.rle_set_confidence(rle, $float$0_75);
				    filtered = cons(rle, filtered);
				}
			    }
			}
			lexes = filtered;
			sublisp_throw($sym34$OUTER_CATCH_FOR_WORD_TREE_METHOD, lexes);
		    }
		} finally {
		    {
			SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
			try {
			    bind($is_thread_performing_cleanupP$, T);
			    com.cyc.cycjava.cycl.word_tree.set_word_tree_lexes(self, lexes);
			} finally {
			    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
			}
		    }
		}
	    } catch (Throwable ccatch_env_var) {
		catch_var_for_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym34$OUTER_CATCH_FOR_WORD_TREE_METHOD);
	    }
	    return catch_var_for_word_tree_method;
	}
    }

    public static SubLObject word_tree_pp_comp_filter_lexes_method(final SubLObject self) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject catch_var_for_word_tree_method = NIL;
	SubLObject lexes = get_word_tree_lexes(self);
	try {
	    thread.throwStack.push($sym17$OUTER_CATCH_FOR_WORD_TREE_METHOD);
	    try {
		SubLObject filtered = NIL;
		final SubLObject pp = methods.funcall_instance_method_with_0_args(self, GET_PP_COMPLEMENT);
		final SubLObject pp_head = (NIL != pp) ? methods.funcall_instance_method_with_0_args(pp, GET_HEAD) : NIL;
		SubLObject frame = NIL;
		if (NIL != pp_head) {
		    SubLObject cdolist_list_var = lexes;
		    SubLObject rle = NIL;
		    rle = cdolist_list_var.first();
		    while (NIL != cdolist_list_var) {
			frame = methods.funcall_instance_method_with_1_args(cyclifier.rle_lex(rle), GET, $FRAME);
			if ((NIL != cycl_utilities.formula_arg2(frame, UNPROVIDED)) && (NIL != isa.isaP(frame, $$PPCompFrame, $$EverythingPSC, UNPROVIDED))) {
			    final SubLObject preposition = cycl_utilities.formula_arg2(frame, UNPROVIDED);
			    final SubLObject prep_string = lexicon_accessors.get_strings_of_type(preposition, $$Preposition, UNPROVIDED, UNPROVIDED, UNPROVIDED).first();
			    if (prep_string.equalp(methods.funcall_instance_method_with_0_args(pp_head, GET_STRING))) {
				cyclifier.rle_set_confidence(rle, ONE_INTEGER);
				filtered = cons(rle, filtered);
			    }
			} else {
			    filtered = cons(rle, filtered);
			}
			cdolist_list_var = cdolist_list_var.rest();
			rle = cdolist_list_var.first();
		    }
		    lexes = filtered;
		}
		sublisp_throw($sym17$OUTER_CATCH_FOR_WORD_TREE_METHOD, lexes);
	    } finally {
		final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    set_word_tree_lexes(self, lexes);
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
		}
	    }
	} catch (final Throwable ccatch_env_var) {
	    catch_var_for_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym17$OUTER_CATCH_FOR_WORD_TREE_METHOD);
	} finally {
	    thread.throwStack.pop();
	}
	return catch_var_for_word_tree_method;
    }

    public static final SubLObject word_tree_pp_comp_filter_lexes_method_alt(SubLObject self) {
	{
	    SubLObject catch_var_for_word_tree_method = NIL;
	    SubLObject lexes = com.cyc.cycjava.cycl.word_tree.get_word_tree_lexes(self);
	    try {
		try {
		    {
			SubLObject filtered = NIL;
			SubLObject pp = methods.funcall_instance_method_with_0_args(self, GET_PP_COMPLEMENT);
			SubLObject pp_head = (NIL != pp) ? ((SubLObject) (methods.funcall_instance_method_with_0_args(pp, GET_HEAD))) : NIL;
			SubLObject frame = NIL;
			if (NIL != pp_head) {
			    {
				SubLObject cdolist_list_var = lexes;
				SubLObject rle = NIL;
				for (rle = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), rle = cdolist_list_var.first()) {
				    frame = methods.funcall_instance_method_with_1_args(cyclifier.rle_lex(rle), GET, $FRAME);
				    if ((NIL != cycl_utilities.formula_arg2(frame, UNPROVIDED)) && (NIL != isa.isaP(frame, $$PPCompFrame, $$EverythingPSC, UNPROVIDED))) {
					{
					    SubLObject preposition = cycl_utilities.formula_arg2(frame, UNPROVIDED);
					    SubLObject prep_string = lexicon_accessors.get_strings_of_type(preposition, $$Preposition, UNPROVIDED, UNPROVIDED, UNPROVIDED).first();
					    if (prep_string.equalp(methods.funcall_instance_method_with_0_args(pp_head, GET_STRING))) {
						cyclifier.rle_set_confidence(rle, ONE_INTEGER);
						filtered = cons(rle, filtered);
					    }
					}
				    } else {
					filtered = cons(rle, filtered);
				    }
				}
			    }
			    lexes = filtered;
			}
			sublisp_throw($sym17$OUTER_CATCH_FOR_WORD_TREE_METHOD, lexes);
		    }
		} finally {
		    {
			SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
			try {
			    bind($is_thread_performing_cleanupP$, T);
			    com.cyc.cycjava.cycl.word_tree.set_word_tree_lexes(self, lexes);
			} finally {
			    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
			}
		    }
		}
	    } catch (Throwable ccatch_env_var) {
		catch_var_for_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym17$OUTER_CATCH_FOR_WORD_TREE_METHOD);
	    }
	    return catch_var_for_word_tree_method;
	}
    }

    /**
     *
     *
     * @return boolean; t if this word is a relative pronoun, nil otherwise
     */
    @LispMethod(comment = "@return boolean; t if this word is a relative pronoun, nil otherwise")
    public static SubLObject word_tree_relative_pronoun_p_method(final SubLObject self) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject catch_var_for_word_tree_method = NIL;
	final SubLObject mother = parse_tree.get_parse_tree_mother(self);
	try {
	    thread.throwStack.push($sym158$OUTER_CATCH_FOR_WORD_TREE_METHOD);
	    try {
		if ((NIL == wdt_word_tree_p(self)) && (NIL == wp_tree_p(self))) {
		    sublisp_throw($sym158$OUTER_CATCH_FOR_WORD_TREE_METHOD, NIL);
		}
		final SubLObject grandmother = (NIL != mother) ? methods.funcall_instance_method_with_0_args(mother, GET_MOTHER) : NIL;
		final SubLObject first_word = (NIL != grandmother) ? methods.funcall_instance_method_with_1_args(grandmother, GET_DESCENDANT, $list160) : NIL;
		sublisp_throw($sym158$OUTER_CATCH_FOR_WORD_TREE_METHOD, makeBoolean(self.eql(first_word) && (NIL != relative_clause_p(grandmother))));
	    } finally {
		final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    parse_tree.set_parse_tree_mother(self, mother);
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
		}
	    }
	} catch (final Throwable ccatch_env_var) {
	    catch_var_for_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym158$OUTER_CATCH_FOR_WORD_TREE_METHOD);
	} finally {
	    thread.throwStack.pop();
	}
	return catch_var_for_word_tree_method;
    }

    /**
     *
     *
     * @return boolean; t if this word is a relative pronoun, nil otherwise
     */
    @LispMethod(comment = "@return boolean; t if this word is a relative pronoun, nil otherwise")
    public static final SubLObject word_tree_relative_pronoun_p_method_alt(SubLObject self) {
	{
	    SubLObject catch_var_for_word_tree_method = NIL;
	    SubLObject mother = parse_tree.get_parse_tree_mother(self);
	    try {
		try {
		    if (!((NIL != com.cyc.cycjava.cycl.word_tree.wdt_word_tree_p(self)) || (NIL != com.cyc.cycjava.cycl.word_tree.wp_tree_p(self)))) {
			sublisp_throw($sym158$OUTER_CATCH_FOR_WORD_TREE_METHOD, NIL);
		    }
		    {
			SubLObject grandmother = (NIL != mother) ? ((SubLObject) (methods.funcall_instance_method_with_0_args(mother, GET_MOTHER))) : NIL;
			SubLObject first_word = (NIL != grandmother) ? ((SubLObject) (methods.funcall_instance_method_with_1_args(grandmother, GET_DESCENDANT, $list_alt160))) : NIL;
			sublisp_throw($sym158$OUTER_CATCH_FOR_WORD_TREE_METHOD, makeBoolean((self == first_word) && (NIL != com.cyc.cycjava.cycl.word_tree.relative_clause_p(grandmother))));
		    }
		} finally {
		    {
			SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
			try {
			    bind($is_thread_performing_cleanupP$, T);
			    parse_tree.set_parse_tree_mother(self, mother);
			} finally {
			    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
			}
		    }
		}
	    } catch (Throwable ccatch_env_var) {
		catch_var_for_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym158$OUTER_CATCH_FOR_WORD_TREE_METHOD);
	    }
	    return catch_var_for_word_tree_method;
	}
    }

    public static SubLObject word_tree_retokenize_method(final SubLObject self, final SubLObject lexicon) {
	return self;
    }

    public static final SubLObject word_tree_retokenize_method_alt(SubLObject self, SubLObject lexicon) {
	return self;
    }

    /**
     *
     *
     * @param REFS
     * 		listp; a list of referents
     * @return word-tree; this word tree with its referents updated to REFERENTS
     */
    @LispMethod(comment = "@param REFS\r\n\t\tlistp; a list of referents\r\n@return word-tree; this word tree with its referents updated to REFERENTS")
    public static SubLObject word_tree_set_refs_method(final SubLObject self, final SubLObject referents) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject catch_var_for_word_tree_method = NIL;
	final SubLObject refs = get_word_tree_refs(self);
	try {
	    thread.throwStack.push($sym107$OUTER_CATCH_FOR_WORD_TREE_METHOD);
	    try {
		instances.set_slot(self, REFS, referents);
		sublisp_throw($sym107$OUTER_CATCH_FOR_WORD_TREE_METHOD, self);
	    } finally {
		final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    set_word_tree_refs(self, refs);
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
		}
	    }
	} catch (final Throwable ccatch_env_var) {
	    catch_var_for_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym107$OUTER_CATCH_FOR_WORD_TREE_METHOD);
	} finally {
	    thread.throwStack.pop();
	}
	return catch_var_for_word_tree_method;
    }

    /**
     *
     *
     * @param REFS
     * 		listp; a list of referents
     * @return word-tree; this word tree with its referents updated to REFERENTS
     */
    @LispMethod(comment = "@param REFS\r\n\t\tlistp; a list of referents\r\n@return word-tree; this word tree with its referents updated to REFERENTS")
    public static final SubLObject word_tree_set_refs_method_alt(SubLObject self, SubLObject referents) {
	{
	    SubLObject catch_var_for_word_tree_method = NIL;
	    SubLObject refs = com.cyc.cycjava.cycl.word_tree.get_word_tree_refs(self);
	    try {
		try {
		    instances.set_slot(self, REFS, referents);
		    sublisp_throw($sym107$OUTER_CATCH_FOR_WORD_TREE_METHOD, self);
		} finally {
		    {
			SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
			try {
			    bind($is_thread_performing_cleanupP$, T);
			    com.cyc.cycjava.cycl.word_tree.set_word_tree_refs(self, refs);
			} finally {
			    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
			}
		    }
		}
	    } catch (Throwable ccatch_env_var) {
		catch_var_for_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym107$OUTER_CATCH_FOR_WORD_TREE_METHOD);
	    }
	    return catch_var_for_word_tree_method;
	}
    }

    /**
     *
     *
     * @return booleanp; t if this tree is temporal, nil otherwise
     */
    @LispMethod(comment = "@return booleanp; t if this tree is temporal, nil otherwise")
    public static SubLObject word_tree_temporal_tree_p_method(final SubLObject self) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject catch_var_for_word_tree_method = NIL;
	final SubLObject lexes = get_word_tree_lexes(self);
	final SubLObject string = parse_tree.get_parse_tree_string(self);
	try {
	    thread.throwStack.push($sym151$OUTER_CATCH_FOR_WORD_TREE_METHOD);
	    try {
		final SubLObject tokens = string_utilities.split_string(string, UNPROVIDED);
		if (length(tokens).numL(TWO_INTEGER)) {
		    SubLObject cdolist_list_var;
		    final SubLObject lexes_$5 = cdolist_list_var = methods.funcall_instance_method_with_1_args(term_lexicon.get_term_lexicon(), GET, methods.funcall_instance_method_with_0_args(self, GET_STRING));
		    SubLObject lex = NIL;
		    lex = cdolist_list_var.first();
		    while (NIL != cdolist_list_var) {
			final SubLObject denot = methods.funcall_instance_method_with_1_args(lex, GET, $DENOT);
			if ((NIL != term.el_fort_p(denot)) && (NIL != at_utilities.more_specific_p(denot, $$Date, UNPROVIDED))) {
			    sublisp_throw($sym151$OUTER_CATCH_FOR_WORD_TREE_METHOD, T);
			}
			cdolist_list_var = cdolist_list_var.rest();
			lex = cdolist_list_var.first();
		    }
		} else {
		    final SubLObject v_parse_tree = methods.funcall_instance_method_with_1_args(parser.get_stanford_parser(), PARSE, string);
		    final SubLObject head = (NIL != v_parse_tree) ? methods.funcall_instance_method_with_0_args(v_parse_tree, GET_HEAD) : NIL;
		    if (NIL != head) {
			sublisp_throw($sym151$OUTER_CATCH_FOR_WORD_TREE_METHOD, methods.funcall_instance_method_with_0_args(head, TEMPORAL_TREE_P));
		    }
		}
	    } finally {
		final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    set_word_tree_lexes(self, lexes);
		    parse_tree.set_parse_tree_string(self, string);
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
		}
	    }
	} catch (final Throwable ccatch_env_var) {
	    catch_var_for_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym151$OUTER_CATCH_FOR_WORD_TREE_METHOD);
	} finally {
	    thread.throwStack.pop();
	}
	return catch_var_for_word_tree_method;
    }

    /**
     *
     *
     * @return booleanp; t if this tree is temporal, nil otherwise
     */
    @LispMethod(comment = "@return booleanp; t if this tree is temporal, nil otherwise")
    public static final SubLObject word_tree_temporal_tree_p_method_alt(SubLObject self) {
	{
	    SubLObject catch_var_for_word_tree_method = NIL;
	    SubLObject lexes = com.cyc.cycjava.cycl.word_tree.get_word_tree_lexes(self);
	    SubLObject string = parse_tree.get_parse_tree_string(self);
	    try {
		try {
		    {
			SubLObject tokens = string_utilities.split_string(string, UNPROVIDED);
			if (length(tokens).numL(TWO_INTEGER)) {
			    {
				SubLObject lexes_5 = methods.funcall_instance_method_with_1_args(term_lexicon.get_term_lexicon(), GET, methods.funcall_instance_method_with_0_args(self, GET_STRING));
				SubLObject cdolist_list_var = lexes_5;
				SubLObject lex = NIL;
				for (lex = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), lex = cdolist_list_var.first()) {
				    if (NIL != at_utilities.more_specific_p(methods.funcall_instance_method_with_1_args(lex, GET, $DENOT), $$Date, UNPROVIDED)) {
					sublisp_throw($sym151$OUTER_CATCH_FOR_WORD_TREE_METHOD, T);
				    }
				}
			    }
			} else {
			    {
				SubLObject v_parse_tree = methods.funcall_instance_method_with_1_args(parser.get_stanford_parser(), PARSE, string);
				SubLObject head = (NIL != v_parse_tree) ? ((SubLObject) (methods.funcall_instance_method_with_0_args(v_parse_tree, GET_HEAD))) : NIL;
				if (NIL != head) {
				    sublisp_throw($sym151$OUTER_CATCH_FOR_WORD_TREE_METHOD, methods.funcall_instance_method_with_0_args(head, TEMPORAL_TREE_P));
				}
			    }
			}
		    }
		} finally {
		    {
			SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
			try {
			    bind($is_thread_performing_cleanupP$, T);
			    com.cyc.cycjava.cycl.word_tree.set_word_tree_lexes(self, lexes);
			    parse_tree.set_parse_tree_string(self, string);
			} finally {
			    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
			}
		    }
		}
	    } catch (Throwable ccatch_env_var) {
		catch_var_for_word_tree_method = Errors.handleThrowable(ccatch_env_var, $sym151$OUTER_CATCH_FOR_WORD_TREE_METHOD);
	    }
	    return catch_var_for_word_tree_method;
	}
    }

    public static SubLObject word_tree_tree_keyword_eq_classes_method(final SubLObject self) {
	return cyclifier_interface.keyword_eq_classes(Mapping.mapcar(CAR, methods.funcall_instance_method_with_0_args(self, GET_KEYWORD_RENAMINGS).first().first()));
    }

    public static final SubLObject word_tree_tree_keyword_eq_classes_method_alt(SubLObject self) {
	return cyclifier_interface.keyword_eq_classes(Mapping.mapcar(CAR, methods.funcall_instance_method_with_0_args(self, GET_KEYWORD_RENAMINGS).first().first()));
    }

    /**
     *
     *
     * @return listp; the yield of this word tree
     */
    @LispMethod(comment = "@return listp; the yield of this word tree")
    public static SubLObject word_tree_yield_method(final SubLObject self) {
	return list(self);
    }

    /**
     *
     *
     * @return listp; the yield of this word tree
     */
    @LispMethod(comment = "@return listp; the yield of this word tree")
    public static final SubLObject word_tree_yield_method_alt(SubLObject self) {
	return list(self);
    }

    /**
     *
     *
     * @return parse-tree-p; the tree that serves as an antecedent to this wh word
     */
    @LispMethod(comment = "@return parse-tree-p; the tree that serves as an antecedent to this wh word")
    public static SubLObject wp_tree_get_antecedent_method(final SubLObject self) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject catch_var_for_wp_tree_method = NIL;
	final SubLObject mother = parse_tree.get_parse_tree_mother(self);
	try {
	    thread.throwStack.push($sym368$OUTER_CATCH_FOR_WP_TREE_METHOD);
	    try {
		final SubLObject grandmother = (NIL != mother) ? methods.funcall_instance_method_with_0_args(mother, GET_MOTHER) : NIL;
		final SubLObject great_grandmother = (NIL != grandmother) ? methods.funcall_instance_method_with_0_args(grandmother, GET_MOTHER) : NIL;
		if ((NIL != parse_tree.np_tree_p(great_grandmother)) && (NIL != parse_tree.np_tree_p(methods.funcall_instance_method_with_1_args(great_grandmother, GET_DAUGHTER, ZERO_INTEGER)))) {
		    sublisp_throw($sym368$OUTER_CATCH_FOR_WP_TREE_METHOD, methods.funcall_instance_method_with_1_args(great_grandmother, GET_DAUGHTER, ZERO_INTEGER));
		}
	    } finally {
		final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    parse_tree.set_parse_tree_mother(self, mother);
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
		}
	    }
	} catch (final Throwable ccatch_env_var) {
	    catch_var_for_wp_tree_method = Errors.handleThrowable(ccatch_env_var, $sym368$OUTER_CATCH_FOR_WP_TREE_METHOD);
	} finally {
	    thread.throwStack.pop();
	}
	return catch_var_for_wp_tree_method;
    }

    /**
     *
     *
     * @return parse-tree-p; the tree that serves as an antecedent to this wh word
     */
    @LispMethod(comment = "@return parse-tree-p; the tree that serves as an antecedent to this wh word")
    public static final SubLObject wp_tree_get_antecedent_method_alt(SubLObject self) {
	{
	    SubLObject catch_var_for_wp_tree_method = NIL;
	    SubLObject mother = parse_tree.get_parse_tree_mother(self);
	    try {
		try {
		    {
			SubLObject grandmother = (NIL != mother) ? ((SubLObject) (methods.funcall_instance_method_with_0_args(mother, GET_MOTHER))) : NIL;
			SubLObject great_grandmother = (NIL != grandmother) ? ((SubLObject) (methods.funcall_instance_method_with_0_args(grandmother, GET_MOTHER))) : NIL;
			if ((NIL != parse_tree.np_tree_p(great_grandmother)) && (NIL != parse_tree.np_tree_p(methods.funcall_instance_method_with_1_args(great_grandmother, GET_DAUGHTER, ZERO_INTEGER)))) {
			    sublisp_throw($sym368$OUTER_CATCH_FOR_WP_TREE_METHOD, methods.funcall_instance_method_with_1_args(great_grandmother, GET_DAUGHTER, ZERO_INTEGER));
			}
		    }
		} finally {
		    {
			SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
			try {
			    bind($is_thread_performing_cleanupP$, T);
			    parse_tree.set_parse_tree_mother(self, mother);
			} finally {
			    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
			}
		    }
		}
	    } catch (Throwable ccatch_env_var) {
		catch_var_for_wp_tree_method = Errors.handleThrowable(ccatch_env_var, $sym368$OUTER_CATCH_FOR_WP_TREE_METHOD);
	    }
	    return catch_var_for_wp_tree_method;
	}
    }

    /**
     *
     *
     * @return listp; a list of genders of this pronoun with possible gender values
    :FEMININE, :MASCULINE and :NEUTER
     */
    @LispMethod(comment = "@return listp; a list of genders of this pronoun with possible gender values\r\n:FEMININE, :MASCULINE and :NEUTER")
    public static SubLObject wp_tree_get_gender_method(final SubLObject self) {
	return $list376;
    }

    /**
     *
     *
     * @return listp; a list of genders of this pronoun with possible gender values
    :FEMININE, :MASCULINE and :NEUTER
     */
    @LispMethod(comment = "@return listp; a list of genders of this pronoun with possible gender values\r\n:FEMININE, :MASCULINE and :NEUTER")
    public static final SubLObject wp_tree_get_gender_method_alt(SubLObject self) {
	return $list_alt376;
    }

    /**
     *
     *
     * @return listp; a list of numbers of this wp with possible number values
    :SINGULAR and :PLURAL
     */
    @LispMethod(comment = "@return listp; a list of numbers of this wp with possible number values\r\n:SINGULAR and :PLURAL")
    public static SubLObject wp_tree_get_number_method(final SubLObject self) {
	return $list308;
    }

    /**
     *
     *
     * @return listp; a list of numbers of this wp with possible number values
    :SINGULAR and :PLURAL
     */
    @LispMethod(comment = "@return listp; a list of numbers of this wp with possible number values\r\n:SINGULAR and :PLURAL")
    public static final SubLObject wp_tree_get_number_method_alt(SubLObject self) {
	return $list_alt308;
    }

    /**
     *
     *
     * @return word-tree-p; the quantifier of this name, or nil if there is none
     */
    @LispMethod(comment = "@return word-tree-p; the quantifier of this name, or nil if there is none")
    public static SubLObject wp_tree_get_quantifier_method(final SubLObject self) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject catch_var_for_wp_tree_method = NIL;
	final SubLObject idx = parse_tree.get_parse_tree_idx(self);
	final SubLObject mother = parse_tree.get_parse_tree_mother(self);
	try {
	    thread.throwStack.push($sym371$OUTER_CATCH_FOR_WP_TREE_METHOD);
	    try {
		sublisp_throw($sym371$OUTER_CATCH_FOR_WP_TREE_METHOD, methods.funcall_instance_method_with_2_args(mother, FIND_LAST, QUANTIFIER_TREE_P, number_utilities.f_1_(idx)));
	    } finally {
		final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    parse_tree.set_parse_tree_idx(self, idx);
		    parse_tree.set_parse_tree_mother(self, mother);
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
		}
	    }
	} catch (final Throwable ccatch_env_var) {
	    catch_var_for_wp_tree_method = Errors.handleThrowable(ccatch_env_var, $sym371$OUTER_CATCH_FOR_WP_TREE_METHOD);
	} finally {
	    thread.throwStack.pop();
	}
	return catch_var_for_wp_tree_method;
    }

    /**
     *
     *
     * @return word-tree-p; the quantifier of this name, or nil if there is none
     */
    @LispMethod(comment = "@return word-tree-p; the quantifier of this name, or nil if there is none")
    public static final SubLObject wp_tree_get_quantifier_method_alt(SubLObject self) {
	{
	    SubLObject catch_var_for_wp_tree_method = NIL;
	    SubLObject idx = parse_tree.get_parse_tree_idx(self);
	    SubLObject mother = parse_tree.get_parse_tree_mother(self);
	    try {
		try {
		    sublisp_throw($sym371$OUTER_CATCH_FOR_WP_TREE_METHOD, methods.funcall_instance_method_with_2_args(mother, FIND_LAST, QUANTIFIER_TREE_P, number_utilities.f_1_(idx)));
		} finally {
		    {
			SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
			try {
			    bind($is_thread_performing_cleanupP$, T);
			    parse_tree.set_parse_tree_idx(self, idx);
			    parse_tree.set_parse_tree_mother(self, mother);
			} finally {
			    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
			}
		    }
		}
	    } catch (Throwable ccatch_env_var) {
		catch_var_for_wp_tree_method = Errors.handleThrowable(ccatch_env_var, $sym371$OUTER_CATCH_FOR_WP_TREE_METHOD);
	    }
	    return catch_var_for_wp_tree_method;
	}
    }

    /**
     *
     *
     * @return listp; the unique referents of this phrase
     */
    @LispMethod(comment = "@return listp; the unique referents of this phrase")
    public static SubLObject wp_tree_get_refs_method(final SubLObject self) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject catch_var_for_wp_tree_method = NIL;
	final SubLObject refs = get_word_tree_refs(self);
	try {
	    thread.throwStack.push($sym365$OUTER_CATCH_FOR_WP_TREE_METHOD);
	    try {
		final SubLObject antecedent = methods.funcall_instance_method_with_0_args(self, GET_ANTECEDENT);
		sublisp_throw($sym365$OUTER_CATCH_FOR_WP_TREE_METHOD, NIL != antecedent ? methods.funcall_instance_method_with_0_args(antecedent, GET_REFS) : refs);
	    } finally {
		final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    set_word_tree_refs(self, refs);
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
		}
	    }
	} catch (final Throwable ccatch_env_var) {
	    catch_var_for_wp_tree_method = Errors.handleThrowable(ccatch_env_var, $sym365$OUTER_CATCH_FOR_WP_TREE_METHOD);
	} finally {
	    thread.throwStack.pop();
	}
	return catch_var_for_wp_tree_method;
    }

    /**
     *
     *
     * @return listp; the unique referents of this phrase
     */
    @LispMethod(comment = "@return listp; the unique referents of this phrase")
    public static final SubLObject wp_tree_get_refs_method_alt(SubLObject self) {
	{
	    SubLObject catch_var_for_wp_tree_method = NIL;
	    SubLObject refs = com.cyc.cycjava.cycl.word_tree.get_word_tree_refs(self);
	    try {
		try {
		    {
			SubLObject antecedent = methods.funcall_instance_method_with_0_args(self, GET_ANTECEDENT);
			sublisp_throw($sym365$OUTER_CATCH_FOR_WP_TREE_METHOD, NIL != antecedent ? ((SubLObject) (methods.funcall_instance_method_with_0_args(antecedent, GET_REFS))) : refs);
		    }
		} finally {
		    {
			SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
			try {
			    bind($is_thread_performing_cleanupP$, T);
			    com.cyc.cycjava.cycl.word_tree.set_word_tree_refs(self, refs);
			} finally {
			    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
			}
		    }
		}
	    } catch (Throwable ccatch_env_var) {
		catch_var_for_wp_tree_method = Errors.handleThrowable(ccatch_env_var, $sym365$OUTER_CATCH_FOR_WP_TREE_METHOD);
	    }
	    return catch_var_for_wp_tree_method;
	}
    }

    public static SubLObject wp_tree_p(final SubLObject wp_tree) {
	return classes.subloop_instanceof_class(wp_tree, WP_TREE);
    }

    public static final SubLObject wp_tree_p_alt(SubLObject wp_tree) {
	return classes.subloop_instanceof_class(wp_tree, WP_TREE);
    }

    public static SubLObject wrb_word_tree_p(final SubLObject wrb_word_tree) {
	return classes.subloop_instanceof_class(wrb_word_tree, WRB_WORD_TREE);
    }

    public static final SubLObject wrb_word_tree_p_alt(SubLObject wrb_word_tree) {
	return classes.subloop_instanceof_class(wrb_word_tree, WRB_WORD_TREE);
    }

    @Override
    public void declareFunctions() {
	declare_word_tree_file();
    }

    @Override
    public void initializeVariables() {
	init_word_tree_file();
    }

    @Override
    public void runTopLevelForms() {
	setup_word_tree_file();
    }

    private static final SubLString $$$by = makeString("by");

    private static final SubLString $$$did = makeString("did");

    private static final SubLString $$$I = makeString("I");

    private static final SubLString $$$me = makeString("me");

    private static final SubLString $$$my = makeString("my");

    private static final SubLString $$$of = makeString("of");

    private static final SubLString $$$our = makeString("our");

    private static final SubLString $$$that = makeString("that");

    private static final SubLString $$$the = makeString("the");

    private static final SubLString $$$to = makeString("to");

    private static final SubLString $$$us = makeString("us");

    private static final SubLString $$$we = makeString("we");

    private static final SubLString $$$will = makeString("will");

    private static final SubLString $$$you = makeString("you");

    private static final SubLString $$$your = makeString("your");

    private static final SubLSymbol $BACKOFF_PENN_TAGS = makeKeyword("BACKOFF-PENN-TAGS");

    private static final SubLFloat $float$0_75 = makeDouble(0.75);

    private static final SubLInteger $int$_5 = makeInteger(-5);

    private static final SubLSymbol $kw302$_ = makeKeyword(",");

    private static final SubLString $str_alt263$ = makeString("");

    private static final SubLString $str263$ = makeString("");

    private static final SubLSymbol $sym107$OUTER_CATCH_FOR_WORD_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-WORD-TREE-METHOD");

    private static final SubLSymbol $sym129$FABRICATION_FORBIDDEN_ = makeSymbol("FABRICATION-FORBIDDEN?");

    private static final SubLSymbol $sym134$OUTER_CATCH_FOR_WORD_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-WORD-TREE-METHOD");

    private static final SubLSymbol $sym144$OUTER_CATCH_FOR_WORD_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-WORD-TREE-METHOD");

    private static final SubLSymbol $sym151$OUTER_CATCH_FOR_WORD_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-WORD-TREE-METHOD");

    private static final SubLSymbol $sym158$OUTER_CATCH_FOR_WORD_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-WORD-TREE-METHOD");

    private static final SubLSymbol $sym17$OUTER_CATCH_FOR_WORD_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-WORD-TREE-METHOD");

    private static final SubLSymbol $sym197$SUBLOOP_RESERVED_INITIALIZE_UNLIKE_COORDINATE_PHRASE_TREE_INSTANC = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-UNLIKE-COORDINATE-PHRASE-TREE-INSTANCE");

    private static final SubLSymbol $sym242$OUTER_CATCH_FOR_NOMINAL_WORD_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-NOMINAL-WORD-TREE-METHOD");

    private static final SubLSymbol $sym245$OUTER_CATCH_FOR_NOMINAL_WORD_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-NOMINAL-WORD-TREE-METHOD");

    private static final SubLSymbol $sym252$OUTER_CATCH_FOR_NOMINAL_WORD_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-NOMINAL-WORD-TREE-METHOD");

    private static final SubLSymbol $sym256$OUTER_CATCH_FOR_WORD_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-WORD-TREE-METHOD");

    private static final SubLSymbol $sym270$OUTER_CATCH_FOR_NOMINAL_WORD_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-NOMINAL-WORD-TREE-METHOD");

    private static final SubLSymbol $sym273$PRP__TREE_P = makeSymbol("PRP$-TREE-P");

    private static final SubLSymbol $sym28$OUTER_CATCH_FOR_WORD_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-WORD-TREE-METHOD");

    private static final SubLSymbol $sym34$OUTER_CATCH_FOR_WORD_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-WORD-TREE-METHOD");

    private static final SubLSymbol $sym345$OUTER_CATCH_FOR_PRP_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-PRP-TREE-METHOD");

    private static final SubLSymbol $sym348$OUTER_CATCH_FOR_PRP_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-PRP-TREE-METHOD");

    private static final SubLSymbol $sym356$OUTER_CATCH_FOR_PRP_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-PRP-TREE-METHOD");

    private static final SubLSymbol $sym365$OUTER_CATCH_FOR_WP_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-WP-TREE-METHOD");

    private static final SubLSymbol $sym368$OUTER_CATCH_FOR_WP_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-WP-TREE-METHOD");

    private static final SubLSymbol $sym371$OUTER_CATCH_FOR_WP_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-WP-TREE-METHOD");

    private static final SubLSymbol $sym383$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-VERBAL-WORD-TREE-METHOD");

    private static final SubLSymbol $sym440$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-VERBAL-WORD-TREE-METHOD");

    private static final SubLSymbol $sym444$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-VERBAL-WORD-TREE-METHOD");

    private static final SubLSymbol $sym457$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-VERBAL-WORD-TREE-METHOD");

    private static final SubLSymbol $sym460$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-VERBAL-WORD-TREE-METHOD");

    private static final SubLSymbol $sym467$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-VERBAL-WORD-TREE-METHOD");

    private static final SubLSymbol $sym472$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-VERBAL-WORD-TREE-METHOD");

    private static final SubLSymbol $sym479$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-VERBAL-WORD-TREE-METHOD");

    private static final SubLSymbol $sym496$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-VERBAL-WORD-TREE-METHOD");

    private static final SubLSymbol $sym511$OUTER_CATCH_FOR_VERBAL_WORD_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-VERBAL-WORD-TREE-METHOD");

    private static final SubLSymbol $sym529$OUTER_CATCH_FOR_VBN_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-VBN-TREE-METHOD");

    private static final SubLSymbol $sym533$OUTER_CATCH_FOR_VBN_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-VBN-TREE-METHOD");

    private static final SubLSymbol $sym537$OUTER_CATCH_FOR_VBN_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-VBN-TREE-METHOD");

    private static final SubLSymbol $sym564$OUTER_CATCH_FOR_VBG_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-VBG-TREE-METHOD");

    private static final SubLSymbol $sym567$OUTER_CATCH_FOR_VBG_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-VBG-TREE-METHOD");

    private static final SubLSymbol $sym595$OUTER_CATCH_FOR_AUX_VERB_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-AUX-VERB-TREE-METHOD");

    private static final SubLSymbol $sym600$OUTER_CATCH_FOR_AUX_VERB_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-AUX-VERB-TREE-METHOD");

    private static final SubLSymbol $sym603$OUTER_CATCH_FOR_AUX_VERB_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-AUX-VERB-TREE-METHOD");

    private static final SubLSymbol $sym618$OUTER_CATCH_FOR_MODAL_VERB_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-MODAL-VERB-TREE-METHOD");

    private static final SubLSymbol $sym636$OUTER_CATCH_FOR_ADJECTIVAL_WORD_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ADJECTIVAL-WORD-TREE-METHOD");

    private static final SubLSymbol $sym640$OUTER_CATCH_FOR_ADJECTIVAL_WORD_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-ADJECTIVAL-WORD-TREE-METHOD");

    private static final SubLSymbol $sym665$SUBLOOP_RESERVED_INITIALIZE_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_C = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PREPOSITIONAL-OR-PARTICLE-WORD-TREE-CLASS");

    private static final SubLSymbol $sym666$SUBLOOP_RESERVED_INITIALIZE_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_I = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PREPOSITIONAL-OR-PARTICLE-WORD-TREE-INSTANCE");

    private static final SubLSymbol $sym670$OUTER_CATCH_FOR_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-PREPOSITIONAL-OR-PARTICLE-WORD-TREE-METHOD");

    private static final SubLSymbol $sym676$OUTER_CATCH_FOR_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-PREPOSITIONAL-OR-PARTICLE-WORD-TREE-METHOD");

    private static final SubLSymbol $sym680$OUTER_CATCH_FOR_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-PREPOSITIONAL-OR-PARTICLE-WORD-TREE-METHOD");

    private static final SubLSymbol $sym683$OUTER_CATCH_FOR_PREPOSITIONAL_OR_PARTICLE_WORD_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-PREPOSITIONAL-OR-PARTICLE-WORD-TREE-METHOD");

    private static final SubLSymbol $sym699$OUTER_CATCH_FOR_SPECIFIER_WORD_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-SPECIFIER-WORD-TREE-METHOD");

    private static final SubLSymbol $sym712$OUTER_CATCH_FOR_QUANTIFIER_WORD_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-QUANTIFIER-WORD-TREE-METHOD");

    private static final SubLSymbol $sym719$PRP__TREE = makeSymbol("PRP$-TREE");

    private static final SubLSymbol $sym720$SUBLOOP_RESERVED_INITIALIZE_PRP__TREE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PRP$-TREE-CLASS");

    private static final SubLSymbol $sym721$SUBLOOP_RESERVED_INITIALIZE_PRP__TREE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PRP$-TREE-INSTANCE");

    private static final SubLSymbol $sym725$OUTER_CATCH_FOR_PRP__TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-PRP$-TREE-METHOD");

    private static final SubLSymbol $sym726$PRP__TREE_GET_NUMBER_METHOD = makeSymbol("PRP$-TREE-GET-NUMBER-METHOD");

    private static final SubLSymbol $sym728$OUTER_CATCH_FOR_PRP__TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-PRP$-TREE-METHOD");

    private static final SubLSymbol $sym732$PRP__TREE_GET_PERSON_METHOD = makeSymbol("PRP$-TREE-GET-PERSON-METHOD");

    private static final SubLSymbol $sym734$OUTER_CATCH_FOR_PRP__TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-PRP$-TREE-METHOD");

    private static final SubLSymbol $sym736$PRP__TREE_GET_GENDER_METHOD = makeSymbol("PRP$-TREE-GET-GENDER-METHOD");

    private static final SubLSymbol $sym741$OUTER_CATCH_FOR_WDT_WORD_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-WDT-WORD-TREE-METHOD");

    private static final SubLSymbol $sym743$OUTER_CATCH_FOR_WDT_WORD_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-WDT-WORD-TREE-METHOD");

    private static final SubLSymbol $sym759$OUTER_CATCH_FOR_POSSESSIVE_WORD_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-POSSESSIVE-WORD-TREE-METHOD");

    private static final SubLSymbol $sym764$OUTER_CATCH_FOR_POSSESSIVE_WORD_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-POSSESSIVE-WORD-TREE-METHOD");

    private static final SubLSymbol $sym88$OUTER_CATCH_FOR_WORD_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-WORD-TREE-METHOD");

    private static final SubLSymbol $sym92$OUTER_CATCH_FOR_WORD_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-WORD-TREE-METHOD");

    private static final SubLSymbol $sym98$OUTER_CATCH_FOR_WORD_TREE_METHOD = makeUninternedSymbol("OUTER-CATCH-FOR-WORD-TREE-METHOD");

    private static final SubLSymbol ABS_IDX = makeSymbol("ABS-IDX");

    private static final SubLSymbol ADJECTIVAL_WORD_TREE = makeSymbol("ADJECTIVAL-WORD-TREE");

    private static final SubLSymbol ADJECTIVAL_WORD_TREE_GET_COMPLEMENTS_METHOD = makeSymbol("ADJECTIVAL-WORD-TREE-GET-COMPLEMENTS-METHOD");

    private static final SubLSymbol ADJECTIVAL_WORD_TREE_GET_KEYWORD_RENAMINGS_METHOD = makeSymbol("ADJECTIVAL-WORD-TREE-GET-KEYWORD-RENAMINGS-METHOD");

    private static final SubLSymbol ADJECTIVAL_WORD_TREE_GET_MODIFIEDS_METHOD = makeSymbol("ADJECTIVAL-WORD-TREE-GET-MODIFIEDS-METHOD");

    private static final SubLSymbol ADJECTIVAL_WORD_TREE_GET_VERBAL_COMPLEMENT_METHOD = makeSymbol("ADJECTIVAL-WORD-TREE-GET-VERBAL-COMPLEMENT-METHOD");

    private static final SubLSymbol ADJP_TREE_P = makeSymbol("ADJP-TREE-P");

    private static final SubLSymbol ADVERBIAL_WORD_TREE = makeSymbol("ADVERBIAL-WORD-TREE");

    private static final SubLSymbol ADVERBIAL_WORD_TREE_GET_KEYWORD_RENAMINGS_METHOD = makeSymbol("ADVERBIAL-WORD-TREE-GET-KEYWORD-RENAMINGS-METHOD");

    private static final SubLSymbol ADVERBIAL_WORD_TREE_GET_MODIFIEDS_METHOD = makeSymbol("ADVERBIAL-WORD-TREE-GET-MODIFIEDS-METHOD");

    private static final SubLSymbol AUX_VERB_TREE = makeSymbol("AUX-VERB-TREE");

    private static final SubLSymbol AUX_VERB_TREE_COPULA_P_METHOD = makeSymbol("AUX-VERB-TREE-COPULA-P-METHOD");

    private static final SubLSymbol AUX_VERB_TREE_GET_ADVERBIAL_COMPLEMENT_METHOD = makeSymbol("AUX-VERB-TREE-GET-ADVERBIAL-COMPLEMENT-METHOD");

    private static final SubLSymbol AUX_VERB_TREE_GET_COMPLEMENTS_METHOD = makeSymbol("AUX-VERB-TREE-GET-COMPLEMENTS-METHOD");

    private static final SubLSymbol AUX_VERB_TREE_GET_DIRECT_OBJECT_METHOD = makeSymbol("AUX-VERB-TREE-GET-DIRECT-OBJECT-METHOD");

    private static final SubLSymbol AUX_VERB_TREE_GET_INDIRECT_OBJECT_METHOD = makeSymbol("AUX-VERB-TREE-GET-INDIRECT-OBJECT-METHOD");

    private static final SubLSymbol AUX_VERB_TREE_GET_KEYWORD_RENAMINGS_METHOD = makeSymbol("AUX-VERB-TREE-GET-KEYWORD-RENAMINGS-METHOD");

    private static final SubLSymbol AUX_VERB_TREE_GET_PREPOSITIONAL_COMPLEMENT_METHOD = makeSymbol("AUX-VERB-TREE-GET-PREPOSITIONAL-COMPLEMENT-METHOD");

    private static final SubLSymbol AUX_VERB_TREE_GET_SEMANTIC_COMPLEMENTS_METHOD = makeSymbol("AUX-VERB-TREE-GET-SEMANTIC-COMPLEMENTS-METHOD");

    private static final SubLSymbol AUX_VERB_TREE_GET_SEMANTIC_HEADS_METHOD = makeSymbol("AUX-VERB-TREE-GET-SEMANTIC-HEADS-METHOD");

    private static final SubLSymbol AUX_VERB_TREE_GET_SEMANTIC_SUBJECT_METHOD = makeSymbol("AUX-VERB-TREE-GET-SEMANTIC-SUBJECT-METHOD");

    private static final SubLSymbol AUX_VERB_TREE_GET_SUBJECT_METHOD = makeSymbol("AUX-VERB-TREE-GET-SUBJECT-METHOD");

    private static final SubLSymbol AUX_VERB_TREE_GET_TENSE_METHOD = makeSymbol("AUX-VERB-TREE-GET-TENSE-METHOD");

    private static final SubLSymbol AUX_VERB_TREE_INVERTED_P_METHOD = makeSymbol("AUX-VERB-TREE-INVERTED-P-METHOD");

    private static final SubLSymbol AUX_VERB_TREE_PASSIVE_P_METHOD = makeSymbol("AUX-VERB-TREE-PASSIVE-P-METHOD");

    private static final SubLSymbol BASE_P = makeSymbol("BASE-P");

    private static final SubLSymbol CARDINAL_WORD_TREE = makeSymbol("CARDINAL-WORD-TREE");

    private static final SubLSymbol COORDINATE_PHRASE_TREE = makeSymbol("COORDINATE-PHRASE-TREE");

    private static final SubLSymbol COORDINATE_PHRASE_TREE_COORDINATE_PHRASE_P_METHOD = makeSymbol("COORDINATE-PHRASE-TREE-COORDINATE-PHRASE-P-METHOD");

    private static final SubLSymbol COORDINATE_WORD_TREE = makeSymbol("COORDINATE-WORD-TREE");

    private static final SubLSymbol COORDINATE_WORD_TREE_GET_COMPLEMENTS_METHOD = makeSymbol("COORDINATE-WORD-TREE-GET-COMPLEMENTS-METHOD");

    private static final SubLSymbol COVERS = makeSymbol("COVERS");

    private static final SubLSymbol COVERS_MINIMALLY = makeSymbol("COVERS-MINIMALLY");

    private static final SubLSymbol DETERMINER_WORD_TREE = makeSymbol("DETERMINER-WORD-TREE");

    private static final SubLSymbol DETERMINER_WORD_TREE_P = makeSymbol("DETERMINER-WORD-TREE-P");

    private static final SubLSymbol DOLLAR_WORD_TREE = makeSymbol("DOLLAR-WORD-TREE");

    private static final SubLSymbol DOLLAR_WORD_TREE_GET_OVERT_QUANTIFIER_METHOD = makeSymbol("DOLLAR-WORD-TREE-GET-OVERT-QUANTIFIER-METHOD");

    private static final SubLSymbol DUMMY_TO_P = makeSymbol("DUMMY-TO-P");

    private static final SubLSymbol EXISTENTIAL_WORD_TREE = makeSymbol("EXISTENTIAL-WORD-TREE");

    private static final SubLSymbol FINITE_P = makeSymbol("FINITE-P");

    private static final SubLSymbol FUNCTION_WORD_TREE = makeSymbol("FUNCTION-WORD-TREE");

    private static final SubLSymbol GET_ABS_INDEX = makeSymbol("GET-ABS-INDEX");

    private static final SubLSymbol GET_ADVERBIAL_COMPLEMENT = makeSymbol("GET-ADVERBIAL-COMPLEMENT");

    private static final SubLSymbol GET_INFINITIVE_MARKER = makeSymbol("GET-INFINITIVE-MARKER");

    private static final SubLSymbol GET_MINIMALLY_COVERING_SUBTREES = makeSymbol("GET-MINIMALLY-COVERING-SUBTREES");

    private static final SubLSymbol GET_MOVED_NPS = makeSymbol("GET-MOVED-NPS");

    private static final SubLSymbol GET_MOVED_OBJECTS = makeSymbol("GET-MOVED-OBJECTS");

    private static final SubLSymbol GET_PARSE_EXPRESSION = makeSymbol("GET-PARSE-EXPRESSION");

    private static final SubLSymbol GET_PREPOSITIONAL_COMPLEMENT = makeSymbol("GET-PREPOSITIONAL-COMPLEMENT");

    private static final SubLSymbol GET_SPECIFIED = makeSymbol("GET-SPECIFIED");

    private static final SubLSymbol INFINITIVE_P = makeSymbol("INFINITIVE-P");

    private static final SubLSymbol MODAL_VERB_TREE = makeSymbol("MODAL-VERB-TREE");

    private static final SubLSymbol MODAL_VERB_TREE_GET_OBJECTS_METHOD = makeSymbol("MODAL-VERB-TREE-GET-OBJECTS-METHOD");

    private static final SubLSymbol MODAL_VERB_TREE_GET_TENSE_METHOD = makeSymbol("MODAL-VERB-TREE-GET-TENSE-METHOD");

    private static final SubLSymbol MODAL_VERB_TREE_P = makeSymbol("MODAL-VERB-TREE-P");

    private static final SubLSymbol MODIFIED_DEPENDENT_MEANING_P = makeSymbol("MODIFIED-DEPENDENT-MEANING-P");

    private static final SubLSymbol MODIFIER_WORD_TREE = makeSymbol("MODIFIER-WORD-TREE");

    private static final SubLSymbol MULTI_NOUN_TREE = makeSymbol("MULTI-NOUN-TREE");

    private static final SubLSymbol NAME_WORD_TREE = makeSymbol("NAME-WORD-TREE");

    private static final SubLSymbol NAME_WORD_TREE_GET_QUANTIFIER_METHOD = makeSymbol("NAME-WORD-TREE-GET-QUANTIFIER-METHOD");

    private static final SubLSymbol NEW_RANKED_LEX_ENTRY = makeSymbol("NEW-RANKED-LEX-ENTRY");

    private static final SubLSymbol NN_TREE = makeSymbol("NN-TREE");

    private static final SubLSymbol NN_TREE_GET_NUMBER_METHOD = makeSymbol("NN-TREE-GET-NUMBER-METHOD");

    private static final SubLSymbol NNP_TREE = makeSymbol("NNP-TREE");

    private static final SubLSymbol NNP_TREE_GET_NUMBER_METHOD = makeSymbol("NNP-TREE-GET-NUMBER-METHOD");

    private static final SubLSymbol NNPS_TREE = makeSymbol("NNPS-TREE");

    private static final SubLSymbol NNPS_TREE_GET_NUMBER_METHOD = makeSymbol("NNPS-TREE-GET-NUMBER-METHOD");

    private static final SubLSymbol NNS_TREE = makeSymbol("NNS-TREE");

    private static final SubLSymbol NNS_TREE_GET_NUMBER_METHOD = makeSymbol("NNS-TREE-GET-NUMBER-METHOD");

    private static final SubLSymbol NOMINAL_PHRASE_TREE = makeSymbol("NOMINAL-PHRASE-TREE");

    private static final SubLSymbol NOMINAL_WORD_TREE = makeSymbol("NOMINAL-WORD-TREE");

    private static final SubLSymbol NOMINAL_WORD_TREE_CYCLIFY_INT_METHOD = makeSymbol("NOMINAL-WORD-TREE-CYCLIFY-INT-METHOD");

    private static final SubLSymbol NOMINAL_WORD_TREE_CYCLIFY_NUCLEUS_METHOD = makeSymbol("NOMINAL-WORD-TREE-CYCLIFY-NUCLEUS-METHOD");

    private static final SubLSymbol NOMINAL_WORD_TREE_DEFINITE_DESCRIPTION_P_METHOD = makeSymbol("NOMINAL-WORD-TREE-DEFINITE-DESCRIPTION-P-METHOD");

    private static final SubLSymbol NOMINAL_WORD_TREE_GET_ANTECEDENT_METHOD = makeSymbol("NOMINAL-WORD-TREE-GET-ANTECEDENT-METHOD");

    private static final SubLSymbol NOMINAL_WORD_TREE_GET_COMPLEMENTS_METHOD = makeSymbol("NOMINAL-WORD-TREE-GET-COMPLEMENTS-METHOD");

    private static final SubLSymbol NOMINAL_WORD_TREE_GET_DETERMINER_METHOD = makeSymbol("NOMINAL-WORD-TREE-GET-DETERMINER-METHOD");

    private static final SubLSymbol NOMINAL_WORD_TREE_GET_GENDER_METHOD = makeSymbol("NOMINAL-WORD-TREE-GET-GENDER-METHOD");

    private static final SubLSymbol NOMINAL_WORD_TREE_GET_KEYWORD_RENAMINGS_METHOD = makeSymbol("NOMINAL-WORD-TREE-GET-KEYWORD-RENAMINGS-METHOD");

    private static final SubLSymbol NOMINAL_WORD_TREE_GET_MODIFIEDS_METHOD = makeSymbol("NOMINAL-WORD-TREE-GET-MODIFIEDS-METHOD");

    private static final SubLSymbol NOMINAL_WORD_TREE_GET_NUMBER_METHOD = makeSymbol("NOMINAL-WORD-TREE-GET-NUMBER-METHOD");

    private static final SubLSymbol NOMINAL_WORD_TREE_GET_OVERT_QUANTIFIER_METHOD = makeSymbol("NOMINAL-WORD-TREE-GET-OVERT-QUANTIFIER-METHOD");

    private static final SubLSymbol NOMINAL_WORD_TREE_GET_PERSON_METHOD = makeSymbol("NOMINAL-WORD-TREE-GET-PERSON-METHOD");

    private static final SubLSymbol NOMINAL_WORD_TREE_GET_POSSESSOR_METHOD = makeSymbol("NOMINAL-WORD-TREE-GET-POSSESSOR-METHOD");

    private static final SubLSymbol NOMINAL_WORD_TREE_GET_QUANTIFIER_METHOD = makeSymbol("NOMINAL-WORD-TREE-GET-QUANTIFIER-METHOD");

    private static final SubLSymbol NOMINAL_WORD_TREE_GET_SPECIFIER_METHOD = makeSymbol("NOMINAL-WORD-TREE-GET-SPECIFIER-METHOD");

    private static final SubLSymbol NOMINAL_WORD_TREE_PLURAL_P_METHOD = makeSymbol("NOMINAL-WORD-TREE-PLURAL-P-METHOD");

    private static final SubLSymbol NOMINAL_WORD_TREE_RELATIONAL_NOUN_P_METHOD = makeSymbol("NOMINAL-WORD-TREE-RELATIONAL-NOUN-P-METHOD");

    private static final SubLSymbol NOMINAL_WORD_TREE_SINGULAR_P_METHOD = makeSymbol("NOMINAL-WORD-TREE-SINGULAR-P-METHOD");

    private static final SubLSymbol PARSE_TREE_COVERS_METHOD = makeSymbol("PARSE-TREE-COVERS-METHOD");

    private static final SubLSymbol PARSE_TREE_COVERS_MINIMALLY_METHOD = makeSymbol("PARSE-TREE-COVERS-MINIMALLY-METHOD");

    private static final SubLSymbol PARSE_TREE_GET_MINIMALLY_COVERING_SUBTREES_METHOD = makeSymbol("PARSE-TREE-GET-MINIMALLY-COVERING-SUBTREES-METHOD");

    private static final SubLSymbol PARTICLE_WORD_TREE = makeSymbol("PARTICLE-WORD-TREE");

    private static final SubLSymbol PHRASE_TREE = makeSymbol("PHRASE-TREE");

    private static final SubLSymbol PHRASE_TREE_COORDINATE_PHRASE_P_METHOD = makeSymbol("PHRASE-TREE-COORDINATE-PHRASE-P-METHOD");

    private static final SubLSymbol POSSESSIVE_P = makeSymbol("POSSESSIVE-P");

    private static final SubLSymbol POSSESSIVE_WORD_TREE = makeSymbol("POSSESSIVE-WORD-TREE");

    private static final SubLSymbol POSSESSIVE_WORD_TREE_GET_COMPLEMENTS_METHOD = makeSymbol("POSSESSIVE-WORD-TREE-GET-COMPLEMENTS-METHOD");

    private static final SubLSymbol POSSESSIVE_WORD_TREE_GET_KEYWORD_RENAMINGS_METHOD = makeSymbol("POSSESSIVE-WORD-TREE-GET-KEYWORD-RENAMINGS-METHOD");

    private static final SubLSymbol POSSESSIVE_WORD_TREE_GET_MODIFIEDS_METHOD = makeSymbol("POSSESSIVE-WORD-TREE-GET-MODIFIEDS-METHOD");

    private static final SubLSymbol POSSESSIVE_WORD_TREE_GET_POSSESSED_METHOD = makeSymbol("POSSESSIVE-WORD-TREE-GET-POSSESSED-METHOD");

    private static final SubLSymbol POSSESSIVE_WORD_TREE_GET_POSSESSOR_METHOD = makeSymbol("POSSESSIVE-WORD-TREE-GET-POSSESSOR-METHOD");

    private static final SubLSymbol PREPOSITIONAL_OR_PARTICLE_PHRASE_TREE_P = makeSymbol("PREPOSITIONAL-OR-PARTICLE-PHRASE-TREE-P");

    private static final SubLSymbol PREPOSITIONAL_OR_PARTICLE_WORD_TREE = makeSymbol("PREPOSITIONAL-OR-PARTICLE-WORD-TREE");

    private static final SubLSymbol PREPOSITIONAL_OR_PARTICLE_WORD_TREE_GET_ANTECEDENT_METHOD = makeSymbol("PREPOSITIONAL-OR-PARTICLE-WORD-TREE-GET-ANTECEDENT-METHOD");

    private static final SubLSymbol PREPOSITIONAL_OR_PARTICLE_WORD_TREE_GET_COMPLEMENTS_METHOD = makeSymbol("PREPOSITIONAL-OR-PARTICLE-WORD-TREE-GET-COMPLEMENTS-METHOD");

    private static final SubLSymbol PREPOSITIONAL_OR_PARTICLE_WORD_TREE_GET_KEYWORD_RENAMINGS_METHOD = makeSymbol("PREPOSITIONAL-OR-PARTICLE-WORD-TREE-GET-KEYWORD-RENAMINGS-METHOD");

    private static final SubLSymbol PREPOSITIONAL_OR_PARTICLE_WORD_TREE_GET_MODIFIEDS_METHOD = makeSymbol("PREPOSITIONAL-OR-PARTICLE-WORD-TREE-GET-MODIFIEDS-METHOD");

    private static final SubLSymbol PREPOSITIONAL_OR_PARTICLE_WORD_TREE_GET_OBLIQUE_OBJECT_METHOD = makeSymbol("PREPOSITIONAL-OR-PARTICLE-WORD-TREE-GET-OBLIQUE-OBJECT-METHOD");

    private static final SubLSymbol PREPOSITIONAL_OR_PARTICLE_WORD_TREE_GET_REFS_METHOD = makeSymbol("PREPOSITIONAL-OR-PARTICLE-WORD-TREE-GET-REFS-METHOD");

    private static final SubLSymbol PREPOSITIONAL_OR_PARTICLE_WORD_TREE_GET_VERBAL_COMPLEMENT_METHOD = makeSymbol("PREPOSITIONAL-OR-PARTICLE-WORD-TREE-GET-VERBAL-COMPLEMENT-METHOD");

    private static final SubLSymbol PREPOSITIONAL_TREE_P = makeSymbol("PREPOSITIONAL-TREE-P");

    private static final SubLSymbol PREPOSITIONAL_WORD_TREE = makeSymbol("PREPOSITIONAL-WORD-TREE");

    private static final SubLSymbol PRP_TREE = makeSymbol("PRP-TREE");

    private static final SubLSymbol PRP_TREE_GET_GENDER_METHOD = makeSymbol("PRP-TREE-GET-GENDER-METHOD");

    private static final SubLSymbol PRP_TREE_GET_NUMBER_METHOD = makeSymbol("PRP-TREE-GET-NUMBER-METHOD");

    private static final SubLSymbol PRP_TREE_GET_PERSON_METHOD = makeSymbol("PRP-TREE-GET-PERSON-METHOD");

    private static final SubLSymbol PRT_TREE_P = makeSymbol("PRT-TREE-P");

    private static final SubLSymbol QUANTIFIER_TREE_P = makeSymbol("QUANTIFIER-TREE-P");

    private static final SubLSymbol QUANTIFIER_WORD_TREE = makeSymbol("QUANTIFIER-WORD-TREE");

    private static final SubLSymbol QUANTIFIER_WORD_TREE_GET_KEYWORD_RENAMINGS_METHOD = makeSymbol("QUANTIFIER-WORD-TREE-GET-KEYWORD-RENAMINGS-METHOD");

    private static final SubLSymbol QUANTIFIER_WORD_TREE_GET_QUANTIFIED_METHOD = makeSymbol("QUANTIFIER-WORD-TREE-GET-QUANTIFIED-METHOD");

    private static final SubLSymbol QUANTIFIER_WORD_TREE_GET_SPECIFIED_METHOD = makeSymbol("QUANTIFIER-WORD-TREE-GET-SPECIFIED-METHOD");

    private static final SubLSymbol RELATIVE_PRONOUN_P = makeSymbol("RELATIVE-PRONOUN-P");

    private static final SubLSymbol RETOKENIZE = makeSymbol("RETOKENIZE");

    private static final SubLSymbol RLE_SEM_EQUAL = makeSymbol("RLE-SEM-EQUAL");

    private static final SubLSymbol SBAR_TREE_P = makeSymbol("SBAR-TREE-P");

    private static final SubLSymbol SET_REFS = makeSymbol("SET-REFS");

    private static final SubLSymbol SPECIFIER_WORD_TREE = makeSymbol("SPECIFIER-WORD-TREE");

    private static final SubLSymbol SPECIFIER_WORD_TREE_GET_SPECIFIED_METHOD = makeSymbol("SPECIFIER-WORD-TREE-GET-SPECIFIED-METHOD");

    private static final SubLSymbol STRANDED_P = makeSymbol("STRANDED-P");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_ADJECTIVAL_WORD_TREE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ADJECTIVAL-WORD-TREE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_ADJECTIVAL_WORD_TREE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ADJECTIVAL-WORD-TREE-INSTANCE");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_ADVERBIAL_WORD_TREE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ADVERBIAL-WORD-TREE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_ADVERBIAL_WORD_TREE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-ADVERBIAL-WORD-TREE-INSTANCE");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_AUX_VERB_TREE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-AUX-VERB-TREE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_AUX_VERB_TREE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-AUX-VERB-TREE-INSTANCE");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CARDINAL_WORD_TREE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CARDINAL-WORD-TREE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_CARDINAL_WORD_TREE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-CARDINAL-WORD-TREE-INSTANCE");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_COORDINATE_PHRASE_TREE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-COORDINATE-PHRASE-TREE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_COORDINATE_PHRASE_TREE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-COORDINATE-PHRASE-TREE-INSTANCE");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_COORDINATE_WORD_TREE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-COORDINATE-WORD-TREE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_COORDINATE_WORD_TREE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-COORDINATE-WORD-TREE-INSTANCE");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_DETERMINER_WORD_TREE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-DETERMINER-WORD-TREE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_DETERMINER_WORD_TREE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-DETERMINER-WORD-TREE-INSTANCE");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_DOLLAR_WORD_TREE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-DOLLAR-WORD-TREE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_DOLLAR_WORD_TREE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-DOLLAR-WORD-TREE-INSTANCE");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_EXISTENTIAL_WORD_TREE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-EXISTENTIAL-WORD-TREE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_EXISTENTIAL_WORD_TREE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-EXISTENTIAL-WORD-TREE-INSTANCE");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_FUNCTION_WORD_TREE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-FUNCTION-WORD-TREE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_FUNCTION_WORD_TREE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-FUNCTION-WORD-TREE-INSTANCE");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_MODAL_VERB_TREE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-MODAL-VERB-TREE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_MODAL_VERB_TREE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-MODAL-VERB-TREE-INSTANCE");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_MODIFIER_WORD_TREE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-MODIFIER-WORD-TREE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_MODIFIER_WORD_TREE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-MODIFIER-WORD-TREE-INSTANCE");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_MULTI_NOUN_TREE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-MULTI-NOUN-TREE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_MULTI_NOUN_TREE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-MULTI-NOUN-TREE-INSTANCE");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_NAME_WORD_TREE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-NAME-WORD-TREE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_NAME_WORD_TREE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-NAME-WORD-TREE-INSTANCE");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_NN_TREE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-NN-TREE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_NN_TREE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-NN-TREE-INSTANCE");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_NNP_TREE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-NNP-TREE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_NNP_TREE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-NNP-TREE-INSTANCE");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_NNPS_TREE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-NNPS-TREE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_NNPS_TREE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-NNPS-TREE-INSTANCE");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_NNS_TREE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-NNS-TREE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_NNS_TREE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-NNS-TREE-INSTANCE");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_NOMINAL_WORD_TREE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-NOMINAL-WORD-TREE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_NOMINAL_WORD_TREE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-NOMINAL-WORD-TREE-INSTANCE");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_PARTICLE_WORD_TREE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PARTICLE-WORD-TREE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_PARTICLE_WORD_TREE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PARTICLE-WORD-TREE-INSTANCE");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_POSSESSIVE_WORD_TREE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-POSSESSIVE-WORD-TREE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_POSSESSIVE_WORD_TREE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-POSSESSIVE-WORD-TREE-INSTANCE");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_PREPOSITIONAL_WORD_TREE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PREPOSITIONAL-WORD-TREE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_PREPOSITIONAL_WORD_TREE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PREPOSITIONAL-WORD-TREE-INSTANCE");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_PRP_TREE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PRP-TREE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_PRP_TREE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PRP-TREE-INSTANCE");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_PUNCTUATION_WORD_TREE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PUNCTUATION-WORD-TREE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_PUNCTUATION_WORD_TREE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-PUNCTUATION-WORD-TREE-INSTANCE");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_QUANTIFIER_WORD_TREE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-QUANTIFIER-WORD-TREE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_QUANTIFIER_WORD_TREE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-QUANTIFIER-WORD-TREE-INSTANCE");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SPECIFIER_WORD_TREE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SPECIFIER-WORD-TREE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_SPECIFIER_WORD_TREE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-SPECIFIER-WORD-TREE-INSTANCE");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_UNLIKE_COORDINATE_PHRASE_TREE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-UNLIKE-COORDINATE-PHRASE-TREE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_VB_TREE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-VB-TREE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_VB_TREE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-VB-TREE-INSTANCE");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_VBD_TREE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-VBD-TREE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_VBD_TREE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-VBD-TREE-INSTANCE");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_VBG_TREE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-VBG-TREE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_VBG_TREE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-VBG-TREE-INSTANCE");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_VBN_TREE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-VBN-TREE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_VBN_TREE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-VBN-TREE-INSTANCE");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_VBP_TREE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-VBP-TREE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_VBP_TREE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-VBP-TREE-INSTANCE");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_VBZ_TREE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-VBZ-TREE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_VBZ_TREE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-VBZ-TREE-INSTANCE");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_VERBAL_WORD_TREE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-VERBAL-WORD-TREE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_VERBAL_WORD_TREE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-VERBAL-WORD-TREE-INSTANCE");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_WDT_WORD_TREE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-WDT-WORD-TREE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_WDT_WORD_TREE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-WDT-WORD-TREE-INSTANCE");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_WORD_TREE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-WORD-TREE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_WORD_TREE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-WORD-TREE-INSTANCE");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_WP_TREE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-WP-TREE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_WP_TREE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-WP-TREE-INSTANCE");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_WRB_WORD_TREE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-WRB-WORD-TREE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_WRB_WORD_TREE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-WRB-WORD-TREE-INSTANCE");

    private static final SubLSymbol UNLIKE_COORDINATE_PHRASE_TREE = makeSymbol("UNLIKE-COORDINATE-PHRASE-TREE");

    private static final SubLSymbol UNLIKE_COORDINATE_PHRASE_TREE_COORDINATE_PHRASE_P_METHOD = makeSymbol("UNLIKE-COORDINATE-PHRASE-TREE-COORDINATE-PHRASE-P-METHOD");

    private static final SubLSymbol VB_TREE = makeSymbol("VB-TREE");

    private static final SubLSymbol VB_TREE_GET_TENSE_METHOD = makeSymbol("VB-TREE-GET-TENSE-METHOD");

    private static final SubLSymbol VBD_TREE = makeSymbol("VBD-TREE");

    private static final SubLSymbol VBD_TREE_GET_TENSE_METHOD = makeSymbol("VBD-TREE-GET-TENSE-METHOD");

    private static final SubLSymbol VBG_TREE = makeSymbol("VBG-TREE");

    private static final SubLSymbol VBG_TREE_GET_AUX_VERB_METHOD = makeSymbol("VBG-TREE-GET-AUX-VERB-METHOD");

    private static final SubLSymbol VBG_TREE_GET_MODIFIEDS_METHOD = makeSymbol("VBG-TREE-GET-MODIFIEDS-METHOD");

    private static final SubLSymbol VBN_TREE = makeSymbol("VBN-TREE");

    private static final SubLSymbol VBN_TREE_GET_AUX_VERB_METHOD = makeSymbol("VBN-TREE-GET-AUX-VERB-METHOD");

    private static final SubLSymbol VBN_TREE_GET_SEMANTIC_DIRECT_OBJECT_METHOD = makeSymbol("VBN-TREE-GET-SEMANTIC-DIRECT-OBJECT-METHOD");

    private static final SubLSymbol VBN_TREE_GET_SEMANTIC_INDIRECT_OBJECT_METHOD = makeSymbol("VBN-TREE-GET-SEMANTIC-INDIRECT-OBJECT-METHOD");

    private static final SubLSymbol VBN_TREE_GET_SEMANTIC_SUBJECT_METHOD = makeSymbol("VBN-TREE-GET-SEMANTIC-SUBJECT-METHOD");

    private static final SubLSymbol VBN_TREE_PASSIVE_P_METHOD = makeSymbol("VBN-TREE-PASSIVE-P-METHOD");

    private static final SubLSymbol VBP_TREE = makeSymbol("VBP-TREE");

    private static final SubLSymbol VBP_TREE_GET_TENSE_METHOD = makeSymbol("VBP-TREE-GET-TENSE-METHOD");

    private static final SubLSymbol VBZ_TREE = makeSymbol("VBZ-TREE");

    private static final SubLSymbol VBZ_TREE_GET_TENSE_METHOD = makeSymbol("VBZ-TREE-GET-TENSE-METHOD");

    private static final SubLSymbol VERBAL_WORD_TREE = makeSymbol("VERBAL-WORD-TREE");

    private static final SubLSymbol VERBAL_WORD_TREE_BASE_P_METHOD = makeSymbol("VERBAL-WORD-TREE-BASE-P-METHOD");

    private static final SubLSymbol VERBAL_WORD_TREE_CONTROL_VERB_P_METHOD = makeSymbol("VERBAL-WORD-TREE-CONTROL-VERB-P-METHOD");

    private static final SubLSymbol VERBAL_WORD_TREE_DUMMY_TO_P_METHOD = makeSymbol("VERBAL-WORD-TREE-DUMMY-TO-P-METHOD");

    private static final SubLSymbol VERBAL_WORD_TREE_FINITE_P_METHOD = makeSymbol("VERBAL-WORD-TREE-FINITE-P-METHOD");

    private static final SubLSymbol VERBAL_WORD_TREE_GET_ADJECTIVAL_COMPLEMENT_METHOD = makeSymbol("VERBAL-WORD-TREE-GET-ADJECTIVAL-COMPLEMENT-METHOD");

    private static final SubLSymbol VERBAL_WORD_TREE_GET_ANCESTOR_OBJECTS_METHOD = makeSymbol("VERBAL-WORD-TREE-GET-ANCESTOR-OBJECTS-METHOD");

    private static final SubLSymbol VERBAL_WORD_TREE_GET_COMPLEMENTS_METHOD = makeSymbol("VERBAL-WORD-TREE-GET-COMPLEMENTS-METHOD");

    private static final SubLSymbol VERBAL_WORD_TREE_GET_CONTROL_VERB_METHOD = makeSymbol("VERBAL-WORD-TREE-GET-CONTROL-VERB-METHOD");

    private static final SubLSymbol VERBAL_WORD_TREE_GET_CONTROLLER_METHOD = makeSymbol("VERBAL-WORD-TREE-GET-CONTROLLER-METHOD");

    private static final SubLSymbol VERBAL_WORD_TREE_GET_DIRECT_OBJECT_METHOD = makeSymbol("VERBAL-WORD-TREE-GET-DIRECT-OBJECT-METHOD");

    private static final SubLSymbol VERBAL_WORD_TREE_GET_INDIRECT_OBJECT_METHOD = makeSymbol("VERBAL-WORD-TREE-GET-INDIRECT-OBJECT-METHOD");

    private static final SubLSymbol VERBAL_WORD_TREE_GET_INFINITIVE_MARKER_METHOD = makeSymbol("VERBAL-WORD-TREE-GET-INFINITIVE-MARKER-METHOD");

    private static final SubLSymbol VERBAL_WORD_TREE_GET_KEYWORD_RENAMINGS_METHOD = makeSymbol("VERBAL-WORD-TREE-GET-KEYWORD-RENAMINGS-METHOD");

    private static final SubLSymbol VERBAL_WORD_TREE_GET_MATRIX_CLAUSE_METHOD = makeSymbol("VERBAL-WORD-TREE-GET-MATRIX-CLAUSE-METHOD");

    private static final SubLSymbol VERBAL_WORD_TREE_GET_MOVED_NPS_METHOD = makeSymbol("VERBAL-WORD-TREE-GET-MOVED-NPS-METHOD");

    private static final SubLSymbol VERBAL_WORD_TREE_GET_MOVED_OBJECTS_METHOD = makeSymbol("VERBAL-WORD-TREE-GET-MOVED-OBJECTS-METHOD");

    private static final SubLSymbol VERBAL_WORD_TREE_GET_NUMBER_METHOD = makeSymbol("VERBAL-WORD-TREE-GET-NUMBER-METHOD");

    private static final SubLSymbol VERBAL_WORD_TREE_GET_OBJECTS_METHOD = makeSymbol("VERBAL-WORD-TREE-GET-OBJECTS-METHOD");

    private static final SubLSymbol VERBAL_WORD_TREE_GET_PARTICLE_METHOD = makeSymbol("VERBAL-WORD-TREE-GET-PARTICLE-METHOD");

    private static final SubLSymbol VERBAL_WORD_TREE_GET_PERSON_METHOD = makeSymbol("VERBAL-WORD-TREE-GET-PERSON-METHOD");

    private static final SubLSymbol VERBAL_WORD_TREE_GET_PREDICATE_METHOD = makeSymbol("VERBAL-WORD-TREE-GET-PREDICATE-METHOD");

    private static final SubLSymbol VERBAL_WORD_TREE_GET_SEMANTIC_DIRECT_OBJECT_METHOD = makeSymbol("VERBAL-WORD-TREE-GET-SEMANTIC-DIRECT-OBJECT-METHOD");

    private static final SubLSymbol VERBAL_WORD_TREE_GET_SEMANTIC_INDIRECT_OBJECT_METHOD = makeSymbol("VERBAL-WORD-TREE-GET-SEMANTIC-INDIRECT-OBJECT-METHOD");

    private static final SubLSymbol VERBAL_WORD_TREE_GET_SEMANTIC_OBJECTS_METHOD = makeSymbol("VERBAL-WORD-TREE-GET-SEMANTIC-OBJECTS-METHOD");

    private static final SubLSymbol VERBAL_WORD_TREE_GET_SEMANTIC_SUBJECT_METHOD = makeSymbol("VERBAL-WORD-TREE-GET-SEMANTIC-SUBJECT-METHOD");

    private static final SubLSymbol VERBAL_WORD_TREE_GET_SUBJECT_METHOD = makeSymbol("VERBAL-WORD-TREE-GET-SUBJECT-METHOD");

    private static final SubLSymbol VERBAL_WORD_TREE_GET_TENSE_METHOD = makeSymbol("VERBAL-WORD-TREE-GET-TENSE-METHOD");

    private static final SubLSymbol VERBAL_WORD_TREE_GET_VERBAL_COMPLEMENT_METHOD = makeSymbol("VERBAL-WORD-TREE-GET-VERBAL-COMPLEMENT-METHOD");

    private static final SubLSymbol VERBAL_WORD_TREE_INFINITIVE_P_METHOD = makeSymbol("VERBAL-WORD-TREE-INFINITIVE-P-METHOD");

    private static final SubLSymbol VERBAL_WORD_TREE_INVERTED_P_METHOD = makeSymbol("VERBAL-WORD-TREE-INVERTED-P-METHOD");

    private static final SubLSymbol VERBAL_WORD_TREE_OBJECT_CONTROLLER_P_METHOD = makeSymbol("VERBAL-WORD-TREE-OBJECT-CONTROLLER-P-METHOD");

    private static final SubLSymbol VERBAL_WORD_TREE_PARTICLE_FILTER_LEXES_METHOD = makeSymbol("VERBAL-WORD-TREE-PARTICLE-FILTER-LEXES-METHOD");

    private static final SubLSymbol VERBAL_WORD_TREE_PARTITION_SEMANTIC_COMPLEMENTS_METHOD = makeSymbol("VERBAL-WORD-TREE-PARTITION-SEMANTIC-COMPLEMENTS-METHOD");

    private static final SubLSymbol VERBAL_WORD_TREE_PASSIVE_P_METHOD = makeSymbol("VERBAL-WORD-TREE-PASSIVE-P-METHOD");

    private static final SubLSymbol VERBAL_WORD_TREE_SUBJECT_CONTROLLER_P_METHOD = makeSymbol("VERBAL-WORD-TREE-SUBJECT-CONTROLLER-P-METHOD");

    private static final SubLSymbol WDT_WORD_TREE = makeSymbol("WDT-WORD-TREE");

    private static final SubLSymbol WDT_WORD_TREE_GET_ANTECEDENT_METHOD = makeSymbol("WDT-WORD-TREE-GET-ANTECEDENT-METHOD");

    private static final SubLSymbol WDT_WORD_TREE_GET_REFS_METHOD = makeSymbol("WDT-WORD-TREE-GET-REFS-METHOD");

    private static final SubLSymbol WHADJP_TREE_P = makeSymbol("WHADJP-TREE-P");

    private static final SubLSymbol WHNP_TREE_P = makeSymbol("WHNP-TREE-P");

    private static final SubLSymbol WHPP_TREE_P = makeSymbol("WHPP-TREE-P");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    private static final SubLSymbol WORD_TREE = makeSymbol("WORD-TREE");

    private static final SubLSymbol WORD_TREE_CYCLIFY_INT_METHOD = makeSymbol("WORD-TREE-CYCLIFY-INT-METHOD");

    private static final SubLSymbol WORD_TREE_CYCLIFY_NUCLEUS_METHOD = makeSymbol("WORD-TREE-CYCLIFY-NUCLEUS-METHOD");

    private static final SubLSymbol WORD_TREE_FRAME_FILTER_LEXES_METHOD = makeSymbol("WORD-TREE-FRAME-FILTER-LEXES-METHOD");

    private static final SubLSymbol WORD_TREE_GET_ABS_INDEX_METHOD = makeSymbol("WORD-TREE-GET-ABS-INDEX-METHOD");

    private static final SubLSymbol WORD_TREE_GET_COMPLEMENTS_METHOD = makeSymbol("WORD-TREE-GET-COMPLEMENTS-METHOD");

    private static final SubLSymbol WORD_TREE_GET_EXISTENTIAL_NULL_DETERMINER_METHOD = makeSymbol("WORD-TREE-GET-EXISTENTIAL-NULL-DETERMINER-METHOD");

    private static final SubLSymbol WORD_TREE_GET_HEAD_METHOD = makeSymbol("WORD-TREE-GET-HEAD-METHOD");

    private static final SubLSymbol WORD_TREE_GET_HEADS_METHOD = makeSymbol("WORD-TREE-GET-HEADS-METHOD");

    private static final SubLSymbol WORD_TREE_GET_KEYWORD_RENAMINGS_METHOD = makeSymbol("WORD-TREE-GET-KEYWORD-RENAMINGS-METHOD");

    private static final SubLSymbol WORD_TREE_GET_LEXES_METHOD = makeSymbol("WORD-TREE-GET-LEXES-METHOD");

    private static final SubLSymbol WORD_TREE_GET_MODIFIEDS_METHOD = makeSymbol("WORD-TREE-GET-MODIFIEDS-METHOD");

    private static final SubLSymbol WORD_TREE_GET_MODIFIERS_METHOD = makeSymbol("WORD-TREE-GET-MODIFIERS-METHOD");

    private static final SubLSymbol WORD_TREE_GET_OBLIQUE_OBJECT_METHOD = makeSymbol("WORD-TREE-GET-OBLIQUE-OBJECT-METHOD");

    private static final SubLSymbol WORD_TREE_GET_PARSE_EXPRESSION_METHOD = makeSymbol("WORD-TREE-GET-PARSE-EXPRESSION-METHOD");

    private static final SubLSymbol WORD_TREE_GET_PP_COMPLEMENT_METHOD = makeSymbol("WORD-TREE-GET-PP-COMPLEMENT-METHOD");

    private static final SubLSymbol WORD_TREE_GET_PPS_METHOD = makeSymbol("WORD-TREE-GET-PPS-METHOD");

    private static final SubLSymbol WORD_TREE_GET_RANKED_LEXES_METHOD = makeSymbol("WORD-TREE-GET-RANKED-LEXES-METHOD");

    private static final SubLSymbol WORD_TREE_GET_REFS_METHOD = makeSymbol("WORD-TREE-GET-REFS-METHOD");

    private static final SubLSymbol WORD_TREE_GET_SEMANTIC_COMPLEMENTS_METHOD = makeSymbol("WORD-TREE-GET-SEMANTIC-COMPLEMENTS-METHOD");

    private static final SubLSymbol WORD_TREE_GET_SEMANTIC_HEADS_METHOD = makeSymbol("WORD-TREE-GET-SEMANTIC-HEADS-METHOD");

    private static final SubLSymbol WORD_TREE_GET_STRING_METHOD = makeSymbol("WORD-TREE-GET-STRING-METHOD");

    private static final SubLSymbol WORD_TREE_LEXIFY_INT_METHOD = makeSymbol("WORD-TREE-LEXIFY-INT-METHOD");

    private static final SubLSymbol WORD_TREE_LOGICAL_FORM_INT_METHOD = makeSymbol("WORD-TREE-LOGICAL-FORM-INT-METHOD");

    private static final SubLSymbol WORD_TREE_MODIFIED_DEPENDENT_MEANING_P_METHOD = makeSymbol("WORD-TREE-MODIFIED-DEPENDENT-MEANING-P-METHOD");

    private static final SubLSymbol WORD_TREE_PARTITION_SEMANTIC_COMPLEMENTS_METHOD = makeSymbol("WORD-TREE-PARTITION-SEMANTIC-COMPLEMENTS-METHOD");

    private static final SubLSymbol WORD_TREE_POS_FILTER_LEXES_METHOD = makeSymbol("WORD-TREE-POS-FILTER-LEXES-METHOD");

    private static final SubLSymbol WORD_TREE_PP_COMP_FILTER_LEXES_METHOD = makeSymbol("WORD-TREE-PP-COMP-FILTER-LEXES-METHOD");

    private static final SubLSymbol WORD_TREE_RELATIVE_PRONOUN_P_METHOD = makeSymbol("WORD-TREE-RELATIVE-PRONOUN-P-METHOD");

    private static final SubLSymbol WORD_TREE_RETOKENIZE_METHOD = makeSymbol("WORD-TREE-RETOKENIZE-METHOD");

    private static final SubLSymbol WORD_TREE_SET_REFS_METHOD = makeSymbol("WORD-TREE-SET-REFS-METHOD");

    private static final SubLSymbol WORD_TREE_TEMPORAL_TREE_P_METHOD = makeSymbol("WORD-TREE-TEMPORAL-TREE-P-METHOD");

    private static final SubLSymbol WORD_TREE_TREE_KEYWORD_EQ_CLASSES_METHOD = makeSymbol("WORD-TREE-TREE-KEYWORD-EQ-CLASSES-METHOD");

    private static final SubLSymbol WORD_TREE_YIELD_METHOD = makeSymbol("WORD-TREE-YIELD-METHOD");

    private static final SubLSymbol WP_TREE = makeSymbol("WP-TREE");

    private static final SubLSymbol WP_TREE_GET_ANTECEDENT_METHOD = makeSymbol("WP-TREE-GET-ANTECEDENT-METHOD");

    private static final SubLSymbol WP_TREE_GET_GENDER_METHOD = makeSymbol("WP-TREE-GET-GENDER-METHOD");

    private static final SubLSymbol WP_TREE_GET_NUMBER_METHOD = makeSymbol("WP-TREE-GET-NUMBER-METHOD");

    private static final SubLSymbol WP_TREE_GET_QUANTIFIER_METHOD = makeSymbol("WP-TREE-GET-QUANTIFIER-METHOD");

    private static final SubLSymbol WP_TREE_GET_REFS_METHOD = makeSymbol("WP-TREE-GET-REFS-METHOD");

    private static final SubLSymbol WRB_WORD_TREE = makeSymbol("WRB-WORD-TREE");

    protected static final SubLList $list102 = list(makeString("@return listp; the unique referent of this word"), list(RET, makeSymbol("REFS")));

    protected static final SubLList $list105 = list(makeSymbol("REFERENTS"));

    protected static final SubLList $list106 = list(makeString("@param REFS listp; a list of referents\n   @return word-tree; this word tree with its referents updated to REFERENTS"),
	    list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("REFS")), makeSymbol("REFERENTS")), list(RET, makeSymbol("SELF")));

    protected static final SubLList $list110 = list(makeString("@return listp; the yield of this word tree"), list(RET, list(makeSymbol("LIST"), makeSymbol("SELF"))));

    protected static final SubLList $list113 = list(makeString("@return listp; the parse expression of this word tree\n   @owner bertolo"),
	    list(RET, list(makeSymbol("LIST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-CATEGORY"))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-STRING"))))));

    protected static final SubLList $list116 = list(makeString("@return listp; a list containing the head of this word"), list(RET, list(makeSymbol("LIST"), makeSymbol("SELF"))));

    protected static final SubLList $list118 = list(makeString("@return word-tree-p; the head of this word"), list(RET, makeSymbol("SELF")));

    protected static final SubLList $list121 = list(makeString("@return listp; a list containing the semantic head of this word"), list(RET, list(makeSymbol("LIST"), makeSymbol("SELF"))));

    protected static final SubLList $list124 = list(makeKeyword("NO-MEMBER-VARIABLES"), makeKeyword("PROTECTED"));

    protected static final SubLList $list125 = list(makeSymbol("LEXICON"));

    protected static final SubLList $list126 = list(makeString("@return parse-tree-p; a version of this word-tree with lexical entries"),
	    list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("LEXES")),
		    list(makeSymbol("NEW-EVEN-LEX-ENTRY-DISTRIBUTION"), list(makeSymbol("FIM"), makeSymbol("LEXICON"), list(QUOTE, makeSymbol("GET")), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("STRING")))))),
	    list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("POS-FILTER-LEXES"))),
	    list(makeSymbol("PWHEN"), list(makeSymbol("SEMTRANS-LEXICON-P"), makeSymbol("LEXICON")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PP-COMP-FILTER-LEXES"))),
		    list(makeSymbol("PWHEN"), list(makeSymbol("VERBAL-WORD-TREE-P"), makeSymbol("SELF")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PARTICLE-FILTER-LEXES")))),
		    list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("FRAME-FILTER-LEXES"))),
		    list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("LEXES")),
			    list(makeSymbol("REMOVE-DUPLICATES"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("LEXES"))), list(QUOTE, makeSymbol("RLE-SEM-EQUAL")))),
		    list(makeSymbol("PUNLESS"),
			    list(makeSymbol("COR"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("LEXES"))), list(makeSymbol("TERM-LEXICON-P"), makeSymbol("LEXICON")),
				    list(makeSymbol("FIM"), makeSymbol("LEXICON"), list(QUOTE, makeSymbol("FABRICATION-FORBIDDEN?")))),
			    list(makeSymbol("CLET"),
				    list(list(makeSymbol("FABRICATED-LEXES"),
					    list(makeSymbol("FIM"), makeSymbol("LEXICON"), list(QUOTE, makeSymbol("FABRICATE")), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("STRING"))),
						    list(makeSymbol("MAPCAR"), list(QUOTE, makeSymbol("CAR")), list(makeSymbol("FIRST"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-KEYWORD-RENAMINGS")))))),
						    list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CATEGORY")))))),
				    list(makeSymbol("PWHEN"), makeSymbol("FABRICATED-LEXES"),
					    list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("LEXES")), list(makeSymbol("MAPCAR"), list(QUOTE, makeSymbol("NEW-RANKED-LEX-ENTRY")), makeSymbol("FABRICATED-LEXES"))))))),
	    list(RET, list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("LEXES")))));

    protected static final SubLList $list133 = list(makeString("@return listp; pps related to this word, either as an adjunct\n   or as a complement"),
	    list(makeSymbol("CLET"), list(list(makeSymbol("PPS"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("FIND")), list(QUOTE, makeSymbol("PREPOSITIONAL-TREE-P")), list(makeSymbol("1+"), makeSymbol("IDX"))))),
		    list(makeSymbol("PWHEN"), makeSymbol("PPS"), list(RET, makeSymbol("PPS"))),
		    list(makeSymbol("CLET"), list(list(makeSymbol("TREE"), makeSymbol("MOTHER"))), list(makeSymbol("CSETQ"), makeSymbol("PPS"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(QUOTE, makeSymbol("FIND")), list(QUOTE, makeSymbol("WHPP-TREE-P")))),
			    list(makeSymbol("UNTIL"), list(makeSymbol("COR"), makeSymbol("PPS"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(QUOTE, makeSymbol("ROOT-P")))),
				    list(makeSymbol("CSETQ"), makeSymbol("TREE"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(QUOTE, makeSymbol("GET-MOTHER")))),
				    list(makeSymbol("CSETQ"), makeSymbol("PPS"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(QUOTE, makeSymbol("FIND")), list(QUOTE, makeSymbol("WHPP-TREE-P"))))),
			    list(makeSymbol("PWHEN"), makeSymbol("PPS"), list(RET, makeSymbol("PPS"))))));

    protected static final SubLList $list141 = list(makeString("@return listp; a list of complements of this word"), list(RET, NIL));

    protected static final SubLList $list143 = list(makeString("@return listp; a list of all modifiers of this word"), list(RET, makeSymbol("MODIFIERS")));

    protected static final SubLList $list147 = list(makeString("@return listp; a list of phrases that this word modifies"), list(RET, NIL));

    protected static final SubLList $list150 = list(makeString("@return booleanp; t if this tree is temporal, nil otherwise"),
	    list(makeSymbol("CLET"), list(list(makeSymbol("TOKENS"), list(makeSymbol("SPLIT-STRING"), makeSymbol("STRING")))),
		    list(makeSymbol("PIF"), list(makeSymbol("<"), list(makeSymbol("LENGTH"), makeSymbol("TOKENS")), TWO_INTEGER),
			    list(makeSymbol("CLET"), list(list(makeSymbol("LEXES"), list(makeSymbol("FIM"), list(makeSymbol("GET-TERM-LEXICON")), list(QUOTE, makeSymbol("GET")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-STRING")))))),
				    list(makeSymbol("CDOLIST"), list(makeSymbol("LEX"), makeSymbol("LEXES")),
					    list(makeSymbol("CLET"), list(list(makeSymbol("DENOT"), list(makeSymbol("FIM"), makeSymbol("LEX"), list(QUOTE, makeSymbol("GET")), makeKeyword("DENOT")))),
						    list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("EL-FORT-P"), makeSymbol("DENOT")), list(makeSymbol("MORE-SPECIFIC-P"), makeSymbol("DENOT"), reader_make_constant_shell("Date"))), list(RET, T))))),
			    list(makeSymbol("CLET"),
				    list(list(makeSymbol("PARSE-TREE"), list(makeSymbol("FIM"), list(makeSymbol("GET-STANFORD-PARSER")), list(QUOTE, makeSymbol("PARSE")), makeSymbol("STRING"))),
					    list(makeSymbol("HEAD"), list(makeSymbol("FWHEN"), makeSymbol("PARSE-TREE"), list(makeSymbol("FIM"), makeSymbol("PARSE-TREE"), list(QUOTE, makeSymbol("GET-HEAD")))))),
				    list(makeSymbol("PWHEN"), makeSymbol("HEAD"), list(RET, list(makeSymbol("FIM"), makeSymbol("HEAD"), list(QUOTE, makeSymbol("TEMPORAL-TREE-P")))))))));

    protected static final SubLList $list157 = list(makeString("@return boolean; t if this word is a relative pronoun, nil otherwise"),
	    list(makeSymbol("PUNLESS"), list(makeSymbol("COR"), list(makeSymbol("WDT-WORD-TREE-P"), makeSymbol("SELF")), list(makeSymbol("WP-TREE-P"), makeSymbol("SELF"))), list(RET, NIL)),
	    list(makeSymbol("CLET"),
		    list(list(makeSymbol("GRANDMOTHER"), list(makeSymbol("FWHEN"), makeSymbol("MOTHER"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("GET-MOTHER"))))),
			    list(makeSymbol("FIRST-WORD"), list(makeSymbol("FWHEN"), makeSymbol("GRANDMOTHER"), list(makeSymbol("FIM"), makeSymbol("GRANDMOTHER"), list(QUOTE, makeSymbol("GET-DESCENDANT")), list(QUOTE, list(ZERO_INTEGER, ZERO_INTEGER)))))),
		    list(RET, list(makeSymbol("CAND"), list(EQ, makeSymbol("SELF"), makeSymbol("FIRST-WORD")), list(makeSymbol("RELATIVE-CLAUSE-P"), makeSymbol("GRANDMOTHER"))))));

    protected static final SubLList $list16 = list(list(makeSymbol("CLET"),
	    list(list(makeSymbol("FILTERED"), NIL), list(makeSymbol("PP"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-PP-COMPLEMENT")))),
		    list(makeSymbol("PP-HEAD"), list(makeSymbol("FWHEN"), makeSymbol("PP"), list(makeSymbol("FIM"), makeSymbol("PP"), list(QUOTE, makeSymbol("GET-HEAD"))))), makeSymbol("FRAME")),
	    list(makeSymbol("PWHEN"), makeSymbol("PP-HEAD"),
		    list(makeSymbol("CDOLIST"), list(makeSymbol("RLE"), makeSymbol("LEXES")), list(makeSymbol("CSETQ"), makeSymbol("FRAME"), list(makeSymbol("FIM"), list(makeSymbol("RLE-LEX"), makeSymbol("RLE")), list(QUOTE, makeSymbol("GET")), makeKeyword("FRAME"))),
			    list(makeSymbol("PIF"), list(makeSymbol("CAND"), list(makeSymbol("FORMULA-ARG2"), makeSymbol("FRAME")), list(makeSymbol("ISA?"), makeSymbol("FRAME"), reader_make_constant_shell("PPCompFrame"), reader_make_constant_shell("EverythingPSC"))), list(makeSymbol("CLET"),
				    list(list(makeSymbol("PREPOSITION"), list(makeSymbol("FORMULA-ARG2"), makeSymbol("FRAME"))), list(makeSymbol("PREP-STRING"), list(makeSymbol("FIRST"), list(makeSymbol("GET-STRINGS-OF-TYPE"), makeSymbol("PREPOSITION"), reader_make_constant_shell("Preposition"))))),
				    list(makeSymbol("PWHEN"), list(EQUALP, makeSymbol("PREP-STRING"), list(makeSymbol("FIM"), makeSymbol("PP-HEAD"), list(QUOTE, makeSymbol("GET-STRING")))), list(makeSymbol("RLE-SET-CONFIDENCE"), makeSymbol("RLE"), ONE_INTEGER),
					    list(makeSymbol("CPUSH"), makeSymbol("RLE"), makeSymbol("FILTERED")))),
				    list(makeSymbol("CPUSH"), makeSymbol("RLE"), makeSymbol("FILTERED")))),
		    list(makeSymbol("CSETQ"), makeSymbol("LEXES"), makeSymbol("FILTERED"))),
	    list(RET, makeSymbol("LEXES"))));

    protected static final SubLList $list160 = list(ZERO_INTEGER, ZERO_INTEGER);

    protected static final SubLList $list163 = list(list(makeSymbol("IGNORE"), makeSymbol("LEXICON")), list(RET, makeSymbol("SELF")));

    protected static final SubLList $list166 = list(makeString("@return listp; the logical form of this word"), list(RET, NIL));

    protected static final SubLList $list172 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LOGICAL-FORM-INT"), NIL, makeKeyword("PROTECTED")));

    protected static final SubLList $list176 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-COMPLEMENTS"), NIL, makeKeyword("PUBLIC")));

    protected static final SubLList $list179 = list(makeString("@return list; a list of the conjuncts of this conjunction"),
	    list(RET, list(makeSymbol("LIST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SISTER")), MINUS_ONE_INTEGER), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SISTER")), ONE_INTEGER))));

    protected static final SubLList $list184 = list(makeString("@return booleanp; t if this phrase is a coordination, nil otherwise"), list(RET, list(makeSymbol("BOOLEAN"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-CONJUNCTION"))))));

    protected static final SubLList $list189 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COORDINATE-PHRASE-P"), NIL, makeKeyword("PUBLIC")));

    protected static final SubLList $list193 = list(list(RET, T));

    protected static final SubLList $list2 = list(makeSymbol("CYCLIFIABLE-WORD"));

    protected static final SubLList $list200 = list(makeSymbol("NOMINAL-TREE"), makeSymbol("NOMINAL-WORD"));

    protected static final SubLList $list201 = list(new SubLObject[] { list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-NUMBER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-COMPLEMENTS"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MODIFIEDS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DETERMINER"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-QUANTIFIER"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-POSSESSOR"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SPECIFIER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ANTECEDENT"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RELATIONAL-NOUN-P"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEFINITE-DESCRIPTION-P"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-GENDER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PERSON"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SINGULAR-P"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PLURAL-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CYCLIFY-INT"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CYCLIFY-NUCLEUS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KEYWORD-RENAMINGS"), list(makeSymbol("&OPTIONAL"), makeSymbol("KEYWORDS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LOGICAL-FORM-INT"), NIL, makeKeyword("PROTECTED")) });

    protected static final SubLList $list202 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("KEYWORDS"), list(QUOTE, list($NOUN, makeKeyword("POSSESSOR"), makeKeyword("OBLIQUE-OBJECT"), makeKeyword("MODIFIED"), makeKeyword("POSS-COL"), makeKeyword("NUMBER")))));

    protected static final SubLList $list203 = list(list(new SubLObject[] { makeSymbol("CLET"),
	    list(list(makeSymbol("CONJUNCTS"), NIL), list(makeSymbol("DISJUNCTS"), NIL), list(makeSymbol("COMPLEMENT"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SEMANTIC-COMPLEMENTS"))))),
		    list(makeSymbol("QUANTIFIER0"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-OVERT-QUANTIFIER")))),
		    list(makeSymbol("QUANTIFIER"), list(makeSymbol("FWHEN"), makeSymbol("QUANTIFIER0"), list(makeSymbol("FIM"), makeSymbol("QUANTIFIER0"), list(QUOTE, makeSymbol("GET-HEAD"))))),
		    list(makeSymbol("MODIFIED"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-MODIFIEDS")))))),
	    list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER?"), $NOUN, makeSymbol("KEYWORDS"), list(QUOTE, EQL)), list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), $NOUN, makeSymbol("SELF")), makeSymbol("CONJUNCTS"))),
	    list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("COMPLEMENT"), list(makeSymbol("MEMBER"), makeKeyword("OBLIQUE-OBJECT"), makeSymbol("KEYWORDS"), list(QUOTE, EQL))),
		    list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("PREP-OBJECT"), makeSymbol("COMPLEMENT")), makeSymbol("CONJUNCTS"))),
	    list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("COMPLEMENT"), list(makeSymbol("MEMBER"), makeKeyword("POSSESSOR"), makeSymbol("KEYWORDS"), list(QUOTE, EQL))),
		    list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("POSSESSOR"), makeSymbol("COMPLEMENT")), makeSymbol("CONJUNCTS"))),
	    list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("MODIFIED"), list(makeSymbol("MEMBER"), makeKeyword("MODIFIED"), makeSymbol("KEYWORDS"), list(QUOTE, EQL))),
		    list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("MODIFIED"), makeSymbol("MODIFIED")), makeSymbol("CONJUNCTS"))),
	    list(makeSymbol("PWHEN"),
		    list(makeSymbol("CAND"), makeSymbol("QUANTIFIER"), list(EQL, list(makeSymbol("FIM"), makeSymbol("QUANTIFIER"), list(QUOTE, makeSymbol("GET-CATEGORY"))), makeKeyword("CD")),
			    list(makeSymbol("MEMBER"), makeKeyword("NUMBER"), makeSymbol("KEYWORDS"), list(QUOTE, EQL))),
		    list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("NUMBER"), makeSymbol("QUANTIFIER")), makeSymbol("CONJUNCTS"))),
	    list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("COMPLEMENT"), list(makeSymbol("MEMBER"), makeKeyword("POSS-COL"), makeSymbol("KEYWORDS"), list(QUOTE, EQL))),
		    list(makeSymbol("CLET"), list(list(makeSymbol("HEAD"), list(makeSymbol("FIM"), makeSymbol("COMPLEMENT"), list(QUOTE, makeSymbol("GET-HEAD")))), makeSymbol("CYCL"), makeSymbol("COL")),
			    list(makeSymbol("PWHEN"), makeSymbol("HEAD"),
				    list(makeSymbol("CDOLIST"), list(makeSymbol("LEX"), list(makeSymbol("FIM"), makeSymbol("HEAD"), list(QUOTE, makeSymbol("GET-LEXES")))),
					    list(makeSymbol("CSETQ"), makeSymbol("CYCL"), list(makeSymbol("FIM"), makeSymbol("LEX"), list(QUOTE, makeSymbol("GET")), makeKeyword("SEMTRANS"))),
					    list(makeSymbol("CSETQ"), makeSymbol("COL"), list(makeSymbol("MAIN-COLLECTION"), makeSymbol("CYCL"), $NOUN)), list(makeSymbol("CPUSH"), list(makeSymbol("CONS"), makeKeyword("POSS-COL"), makeSymbol("COL")), makeSymbol("DISJUNCTS"))),
				    list(makeSymbol("PUNLESS"), makeSymbol("DISJUNCTS"), list(makeSymbol("CPUSH"), list(makeSymbol("CONS"), makeKeyword("POSS-COL"), reader_make_constant_shell("Thing")), makeSymbol("DISJUNCTS")))))),
	    list(RET, list(makeSymbol("DISJUNCTIVE-KEYWORD-RENAMINGS"), makeSymbol("CONJUNCTS"), makeSymbol("DISJUNCTS"))) }));

    protected static final SubLList $list204 = list($NOUN, makeKeyword("POSSESSOR"), makeKeyword("OBLIQUE-OBJECT"), makeKeyword("MODIFIED"), makeKeyword("POSS-COL"), makeKeyword("NUMBER"));

    protected static final SubLList $list215 = list(makeSymbol("&OPTIONAL"), makeSymbol("RENAMINGS-DISJ"));

    protected static final SubLList $list216 = list(
	    list(makeSymbol("CLET"), list(list(makeSymbol("CYCLS"), NIL), makeSymbol("INDEPENDENT-MODS"), makeSymbol("DEPENDENT-MODS"), list(makeSymbol("COMP-MOD-CYCLS"), NIL)),
		    list(makeSymbol("CMULTIPLE-VALUE-SETQ"), list(makeSymbol("INDEPENDENT-MODS"), makeSymbol(
			    "DEPENDENT-MODS")), list(makeSymbol("PARTITION-MODIFIERS"),
				    list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-MODIFIERS"))))),
		    list(makeSymbol("WITHOUT-RECURSIVE-CYCLIFICATION"),
			    list(makeSymbol("PUNLESS"), makeSymbol("RENAMINGS-DISJ"),
				    list(makeSymbol("CSETQ"), makeSymbol("RENAMINGS-DISJ"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-KEYWORD-RENAMINGS")),
					    list(makeSymbol("REQUIRED-KEYWORDS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-RANKED-LEXES"))))))),
			    list(makeSymbol("CDOLIST"), list(makeSymbol("COMPLEMENT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SEMANTIC-COMPLEMENTS")))),
				    list(makeSymbol("CLET"), list(
					    list(makeSymbol("COMP-CYCL"), list(makeSymbol("FIM"), makeSymbol("COMPLEMENT"), list(QUOTE, makeSymbol("CYCLIFY-INT"))))),
					    list(makeSymbol("PWHEN"), makeSymbol("COMP-CYCL"), list(makeSymbol("CPUSH"), makeSymbol("COMP-CYCL"), makeSymbol("COMP-MOD-CYCLS"))))),
			    list(makeSymbol("CDOLIST"), list(makeSymbol("MODIFIER"), makeSymbol("INDEPENDENT-MODS")),
				    list(makeSymbol("CLET"), list(list(makeSymbol("MOD-CYCL"), list(makeSymbol("FIM"), makeSymbol("MODIFIER"), list(QUOTE, makeSymbol("CYCLIFY-INT"))))),
					    list(makeSymbol("PWHEN"), makeSymbol("MOD-CYCL"), list(makeSymbol("CPUSH"), makeSymbol("MOD-CYCL"), makeSymbol("COMP-MOD-CYCLS"))))),
			    list(makeSymbol("CDOLIST"), list(makeSymbol("RENAMINGS-CONJ"), makeSymbol("RENAMINGS-DISJ")), list(
				    makeSymbol("CLET"), list(list(makeSymbol("CYCLS-CONJ"),
					    NIL)),
				    list(makeSymbol("CDOLIST"), list(makeSymbol("RLE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-RANKED-LEXES")))),
					    list(makeSymbol("CLET"), list(list(makeSymbol("CYCLS-DISJ"), NIL), list(makeSymbol("TERM"), list(makeSymbol("FIM"), list(makeSymbol("RLE-LEX"), makeSymbol("RLE")), list(QUOTE, makeSymbol("GET")), $TERM))),
						    list(makeSymbol("CDOLIST"), list(makeSymbol("RENAMING"), makeSymbol("RENAMINGS-CONJ")),
							    list(makeSymbol("CLET"), list(list(makeSymbol("MY-CYCLS-WITH-MODS"), list(makeSymbol("LIST"), list(makeSymbol("LIST"), list(makeSymbol("APPLY-LEX-RENAMING"), makeSymbol("SELF"), makeSymbol("RLE"), makeSymbol("RENAMING")))))),
								    list(makeSymbol("CDOLIST"), list(makeSymbol("MOD"), makeSymbol("DEPENDENT-MODS")),
									    list(makeSymbol("CPUSH"),
										    list(makeSymbol("FIM"), makeSymbol("MOD"), list(QUOTE, makeSymbol("CYCLIFY-NUCLEUS")),
											    list(makeSymbol("UPDATE-KEYWORD-RENAMINGS"), list(makeSymbol("FIM"), makeSymbol("MOD"), list(QUOTE, makeSymbol("GET-KEYWORD-RENAMINGS"))), makeKeyword("REPLACE"), makeSymbol("TERM"))),
										    makeSymbol("MY-CYCLS-WITH-MODS"))),
								    list(makeSymbol("CSETQ"), makeSymbol("CYCLS-DISJ"),
									    list(makeSymbol("APPEND"), list(makeSymbol("MAPCAR"), list(QUOTE, makeSymbol("INSTANTIATE-SCOPE")), list(makeSymbol("CROSS-PRODUCTS"), makeSymbol("MY-CYCLS-WITH-MODS"))), makeSymbol("CYCLS-DISJ"))))),
						    list(makeSymbol("PWHEN"), makeSymbol("CYCLS-DISJ"), list(makeSymbol("CSETQ"), makeSymbol("CYCLS-CONJ"), list(makeSymbol("APPEND"), makeSymbol("CYCLS-DISJ"), makeSymbol("CYCLS-CONJ")))))),
				    list(makeSymbol("CSETQ"), makeSymbol("CYCLS"),
					    list(makeSymbol("APPEND"), makeSymbol("CYCLS"),
						    list(makeSymbol("MAPCAR"), list(QUOTE, makeSymbol("INSTANTIATE-SCOPE")), list(makeSymbol("CROSS-PRODUCTS"), list(makeSymbol("CONS"), makeSymbol("CYCLS-CONJ"), makeSymbol("COMP-MOD-CYCLS"))))))))),
		    list(RET, makeSymbol("CYCLS"))));

    protected static final SubLList $list219 = list(list(makeSymbol("WITHOUT-DUPLICATE-CYCLIFICATION"),
	    list(makeSymbol("CLET"), list(list(makeSymbol("QUANTIFIER"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-QUANTIFIER")))), makeSymbol("RESULT")),
		    list(makeSymbol("CSETQ"), makeSymbol("RESULT"),
			    list(makeSymbol("FIF"), makeSymbol("QUANTIFIER"), list(makeSymbol("FIM"), makeSymbol("QUANTIFIER"), list(QUOTE, makeSymbol("CYCLIFY-INT"))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CYCLIFY-NUCLEUS"))))),
		    list(RET, makeSymbol("RESULT")))));

    protected static final SubLList $list223 = list(
	    list(makeSymbol("CLET"), list(list(makeSymbol("DET"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-DETERMINER"))))),
		    list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("DET"), list(EQUALP, list(makeSymbol("FIM"), makeSymbol("DET"), list(QUOTE, makeSymbol("GET-STRING"))), makeString("the"))), list(RET, T))),
	    list(makeSymbol("CLET"), list(list(makeSymbol("HEAD"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-HEAD"))))),
		    list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("HEAD"), list(makeSymbol("NAME-WORD-P"), makeSymbol("HEAD")), list(makeSymbol("FIM"), makeSymbol("HEAD"), list(QUOTE, makeSymbol("SINGULAR-P")))), list(RET, T))),
	    list(makeSymbol("CLET"), list(list(makeSymbol("POS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-POSSESSOR"))))), list(makeSymbol("PWHEN"), makeSymbol("POS"), list(RET, T))));

    protected static final SubLList $list230 = list(list(makeSymbol("CDOLIST"), list(makeSymbol("RLE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-RANKED-LEXES")))), list(
	    makeSymbol("CLET"), list(
		    list(makeSymbol("DENOT"),
			    list(makeSymbol("RENAME-VARIABLES"), list(makeSymbol("FIM"), list(makeSymbol("RLE-LEX"), makeSymbol("RLE")), list(QUOTE, makeSymbol("GET")), makeKeyword("SEMTRANS")),
				    list(makeSymbol("FRAME-RENAMING"), list(makeSymbol("FIM"), list(makeSymbol("RLE-LEX"), makeSymbol("RLE")), list(QUOTE, makeSymbol("GET")), makeKeyword("FRAME"))))),
		    list(makeSymbol("KEYWORDS"), list(makeSymbol("FORMULA-KEYWORDS"), makeSymbol("DENOT")))),
	    list(makeSymbol("CDOLIST"), list(makeSymbol("KEYWORD"), list(QUOTE, list(makeKeyword("POSSESSOR"), makeKeyword("POSS-COL")))),
		    list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER?"), makeSymbol("KEYWORD"), makeSymbol("KEYWORDS"), list(QUOTE, EQ)), list(RET, T))))));

    protected static final SubLList $list232 = list(list(makeSymbol("CLET"), list(list(makeSymbol("QUANTIFIER"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-OVERT-QUANTIFIER"))))),
	    list(makeSymbol("PCOND"),
		    list(makeSymbol("QUANTIFIER"), list(RET, list(makeSymbol("FWHEN"), list(makeSymbol("CNOT"), list(EQUALP, list(makeSymbol("FIM"), makeSymbol("QUANTIFIER"), list(QUOTE, makeSymbol("GET-STRING"))), makeString("the"))), makeSymbol("QUANTIFIER")))),
		    list(list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-POSSESSOR")))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("SINGULAR-P")))),
			    list(RET, list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-EXISTENTIAL-NULL-DETERMINER"))))),
		    list(list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-POSSESSOR")))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PLURAL-P")))),
			    list(RET, list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-EXISTENTIAL-NULL-DETERMINER"))))),
		    list(list(makeSymbol("CNOT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-POSSESSOR")))), list(RET, NIL)))));

    protected static final SubLList $list239 = list(makeString("@return listp; a list of numbers of this noun with possible number values\n   :SINGULAR and :PLURAL\n   @note this should be overridden by the subclassses"), list(RET, NIL));

    protected static final SubLList $list241 = list(makeString("@return listp; the complements of this noun"), list(makeSymbol("PWHEN"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("RELATIONAL-NOUN-P"))), list(makeSymbol("CLET"), list(makeSymbol("COMPLEMENT")),
	    list(makeSymbol("CSETQ"), makeSymbol("COMPLEMENT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-POSSESSOR")))),
	    list(makeSymbol("PUNLESS"), makeSymbol("COMPLEMENT"), list(makeSymbol("PWHEN"), makeSymbol("MOTHER"), list(makeSymbol("CLET"),
		    list(list(makeSymbol("SISTER"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("GET-SISTER")), ONE_INTEGER)),
			    list(makeSymbol("SISTER-HEAD"), list(makeSymbol("FWHEN"), makeSymbol("SISTER"), list(makeSymbol("FIM"), makeSymbol("SISTER"), list(QUOTE, makeSymbol("GET-HEAD")))))),
		    list(makeSymbol("PWHEN"),
			    list(makeSymbol("CAND"), list(makeSymbol("PREPOSITIONAL-OR-PARTICLE-PHRASE-TREE-P"), makeSymbol("SISTER")), makeSymbol("SISTER-HEAD"), list(EQUALP, list(makeSymbol("FIM"), makeSymbol("SISTER-HEAD"), list(QUOTE, makeSymbol("GET-STRING"))), makeString("of"))),
			    list(makeSymbol("CSETQ"), makeSymbol("COMPLEMENT"), list(makeSymbol("FIM"), makeSymbol("SISTER"), list(QUOTE, makeSymbol("GET-OBLIQUE-OBJECT")))))))),
	    list(RET, list(makeSymbol("FWHEN"), makeSymbol("COMPLEMENT"), list(makeSymbol("LIST"), makeSymbol("COMPLEMENT")))))));

    protected static final SubLList $list244 = list(makeString("@return word-tree-p; the determiner of this noun or nil if there is none"),
	    list(makeSymbol("CLET"), list(list(makeSymbol("DET"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("FIND-LAST")), list(QUOTE, makeSymbol("DETERMINER-WORD-TREE-P")), list(makeSymbol("1-"), makeSymbol("IDX"))))),
		    list(makeSymbol("PWHEN"), makeSymbol("DET"), list(RET, makeSymbol("DET"))),
		    list(makeSymbol("CSETQ"), makeSymbol("DET"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("FIND-LAST")), list(QUOTE, makeSymbol("WHADJP-TREE-P")))),
		    list(makeSymbol("PWHEN"), makeSymbol("DET"), list(makeSymbol("CSETQ"), makeSymbol("DET"), list(makeSymbol("FIM"), makeSymbol("DET"), list(QUOTE, makeSymbol("FIND-FIRST")), list(QUOTE, makeSymbol("DETERMINER-WORD-TREE-P"))))),
		    list(RET, makeSymbol("DET"))));

    protected static final SubLList $list251 = list(makeString("@return word-tree-p; the visible quantifier of this noun of nil if there is none"),
	    list(makeSymbol("CLET"), list(list(makeSymbol("QUANT"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("FIND-LAST")), list(QUOTE, makeSymbol("QUANTIFIER-TREE-P")), list(makeSymbol("1-"), makeSymbol("IDX"))))),
		    list(makeSymbol("PWHEN"), makeSymbol("QUANT"), list(RET, makeSymbol("QUANT"))), list(RET, list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-DETERMINER"))))));

    protected static final SubLList $list255 = list(makeString("@return determiner-word-tree-p; an empty (null) determiner for this word"),
	    list(RET, list(makeSymbol("GET-NULL-DETERMINER"), reader_make_constant_shell("thereExists"), reader_make_constant_shell("and"), makeSymbol("SELF"), makeSymbol("CONTEXT"))));

    protected static final SubLList $list266 = list(makeKeyword("RESTR"), makeKeyword("SCOPE"));

    protected static final SubLList $list269 = list(makeString("@return phrase-tree-p; the possessor phrase of this noun"),
	    list(makeSymbol("CLET"), list(list(makeSymbol("NP"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("FIND-LAST")), list(QUOTE, makeSymbol("NOMINAL-PHRASE-TREE-P")), makeSymbol("IDX")))),
		    list(RET, list(makeSymbol("FIF"), list(makeSymbol("CAND"), makeSymbol("NP"), list(makeSymbol("FIM"), makeSymbol("NP"), list(QUOTE, makeSymbol("POSSESSIVE-P")))), makeSymbol("NP"),
			    list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("FIND-LAST")), list(QUOTE, makeSymbol("PRP$-TREE-P")), makeSymbol("IDX"))))));

    protected static final SubLList $list27 = list(list(makeSymbol("CLET"),
	    list(list(makeSymbol("FILTERED"), NIL), list(makeSymbol("TREE-KEYWORDS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("TREE-KEYWORD-EQ-CLASSES")))), list(makeSymbol("LEX-SCORES"), NIL), list(makeSymbol("MAX-SCORE"), makeInteger(-5))),
	    list(makeSymbol("CDOLIST"), list(makeSymbol("RLE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-RANKED-LEXES")))),
		    list(makeSymbol("CLET"), list(list(makeSymbol("LEX-SCORE"), list(makeSymbol("LEX-ENTRY-SCORE"), list(makeSymbol("RLE-LEX"), makeSymbol("RLE")), makeSymbol("TREE-KEYWORDS")))), list(makeSymbol("RLE-SET-CONFIDENCE"), makeSymbol("RLE"), makeSymbol("LEX-SCORE")),
			    list(makeSymbol("CPUSH"), makeSymbol("RLE"), makeSymbol("LEX-SCORES")), list(makeSymbol("PWHEN"), list(makeSymbol(">"), makeSymbol("LEX-SCORE"), makeSymbol("MAX-SCORE")), list(makeSymbol("CSETQ"), makeSymbol("MAX-SCORE"), makeSymbol("LEX-SCORE"))))),
	    list(makeSymbol("CDOLIST"), list(makeSymbol("RLE"), makeSymbol("LEX-SCORES")), list(makeSymbol("PWHEN"), list(makeSymbol("="), list(makeSymbol("RLE-CONFIDENCE"), makeSymbol("RLE")), makeSymbol("MAX-SCORE")), list(makeSymbol("CPUSH"), makeSymbol("RLE"), makeSymbol("FILTERED")))),
	    list(makeSymbol("CSETQ"), makeSymbol("LEXES"), makeSymbol("FILTERED")), list(RET, makeSymbol("LEXES"))));

    protected static final SubLList $list276 = list(makeString("@return phrase-tree-p; the specifier phrase of this noun"),
	    list(makeSymbol("CLET"), list(list(makeSymbol("SPECIFIER"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-DETERMINER"))))),
		    list(makeSymbol("PUNLESS"), makeSymbol("SPECIFIER"), list(makeSymbol("CSETQ"), makeSymbol("SPECIFIER"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-QUANTIFIER"))))),
		    list(makeSymbol("PUNLESS"), makeSymbol("SPECIFIER"), list(makeSymbol("CSETQ"), makeSymbol("SPECIFIER"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-POSSESSOR"))))), list(RET, makeSymbol("SPECIFIER"))));

    protected static final SubLList $list279 = list(makeString("@return parse-tree-p; the tree that serves as an antecedent to this noun"), list(RET, NIL));

    protected static final SubLList $list282 = list(makeString("@return listp; a list of genders of this noun with possible gender values \n   :FEMININE, :MASCULINE and :NEUTER"),
	    list(makeSymbol("CLET"), list(list(makeSymbol("GENDERS"), NIL)),
		    list(makeSymbol("CDOLIST"), list(makeSymbol("LEX"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-LEXES")))),
			    list(makeSymbol("CSETQ"), makeSymbol("GENDERS"), list(makeSymbol("APPEND"), list(makeSymbol("FIM"), makeSymbol("LEX"), list(QUOTE, makeSymbol("GET")), makeKeyword("GENDER")), makeSymbol("GENDERS")))),
		    list(RET, list(makeSymbol("REMOVE-DUPLICATES"), makeSymbol("GENDERS"), list(QUOTE, EQL)))));

    protected static final SubLList $list286 = list(makeString("@return numberp; the person of this noun; 1, 2, or 3"), list(RET, THREE_INTEGER));

    protected static final SubLList $list288 = list(makeString("@return booleanp; t if this is singular, nil otherwise"),
	    list(RET, list(makeSymbol("BOOLEAN"), list(makeSymbol("MEMBER"), makeKeyword("SINGULAR"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-NUMBER"))), list(QUOTE, EQL)))));

    protected static final SubLList $list291 = list(makeString("@return boolenanp; t if this tree is plural, nil otherwise"),
	    list(RET, list(makeSymbol("BOOLEAN"), list(makeSymbol("MEMBER"), makeKeyword("PLURAL"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-NUMBER"))), list(QUOTE, EQL)))));

    protected static final SubLList $list294 = list(makeString("@return listp; the list of trees this nominal word tree modifies"),
	    list(makeSymbol("CLET"), list(list(makeSymbol("MODIFIEDS"), NIL), list(makeSymbol("ANCESTORS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-ANCESTORS")))), list(makeSymbol("SUCCESS?"), NIL)),
		    list(makeSymbol("CSOME"), list(makeSymbol("ANCESTOR"), makeSymbol("ANCESTORS"), makeSymbol("SUCCESS?")),
			    list(makeSymbol("PWHEN"),
				    list(makeSymbol("CAND"), list(makeSymbol("APPOSITIVE-NP-P"), makeSymbol("ANCESTOR")),
					    list(EQ, list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("ANCESTOR"), list(QUOTE, makeSymbol("GET-DAUGHTER")), TWO_INTEGER), list(QUOTE, makeSymbol("GET-HEAD"))), makeSymbol("SELF")),
					    list(makeSymbol("FIM"), makeSymbol("ANCESTOR"), list(QUOTE, makeSymbol("GET-DAUGHTER")), ZERO_INTEGER),
					    list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("ANCESTOR"), list(QUOTE, makeSymbol("GET-DAUGHTER")), ZERO_INTEGER), list(QUOTE, makeSymbol("GET-HEAD")))),
				    list(makeSymbol("CPUSH"), list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("ANCESTOR"), list(QUOTE, makeSymbol("GET-DAUGHTER")), ZERO_INTEGER), list(QUOTE, makeSymbol("GET-HEAD"))), makeSymbol("MODIFIEDS")),
				    list(makeSymbol("CSETQ"), makeSymbol("SUCCESS?"), T))),
		    list(makeSymbol("CSETQ"), makeSymbol("SUCCESS?"), NIL),
		    list(makeSymbol("CSOME"), list(makeSymbol("ANCESTOR"), makeSymbol("ANCESTORS"), makeSymbol("SUCCESS?")),
			    list(makeSymbol("PWHEN"),
				    list(makeSymbol("CAND"), list(makeSymbol("VERBAL-TREE-P"), makeSymbol("ANCESTOR")), list(makeSymbol("FIM"), makeSymbol("ANCESTOR"), list(QUOTE, makeSymbol("COPULA-P"))),
					    list(makeSymbol("FIM"), makeSymbol("ANCESTOR"), list(QUOTE, makeSymbol("GET-OBJECTS"))),
					    list(EQ, makeSymbol("SELF"), list(makeSymbol("FIM"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("ANCESTOR"), list(QUOTE, makeSymbol("GET-OBJECTS")))), list(QUOTE, makeSymbol("GET-HEAD")))),
					    list(makeSymbol("FIM"), makeSymbol("ANCESTOR"), list(QUOTE, makeSymbol("GET-SUBJECT")))),
				    list(makeSymbol("CPUSH"), list(makeSymbol("FIM"), makeSymbol("ANCESTOR"), list(QUOTE, makeSymbol("GET-SUBJECT"))), makeSymbol("MODIFIEDS")), list(makeSymbol("CSETQ"), makeSymbol("SUCCESS?"), T))),
		    list(makeSymbol("PWHEN"), list(makeSymbol("NOMINAL-TREE-P"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SISTER")), ONE_INTEGER)),
			    list(makeSymbol("CPUSH"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SISTER")), ONE_INTEGER), makeSymbol("MODIFIEDS"))),
		    list(makeSymbol("PWHEN"), list(makeSymbol("TEMPORAL-TREE-P"), makeSymbol("SELF")), list(makeSymbol("CSETQ"), makeSymbol("SUCCESS?"), NIL),
			    list(makeSymbol("CSOME"), list(makeSymbol("ANCESTOR"), makeSymbol("ANCESTORS"), makeSymbol("SUCCESS?")),
				    list(makeSymbol("PWHEN"), list(makeSymbol("VERBAL-TREE-P"), makeSymbol("ANCESTOR")),
					    list(makeSymbol("CDOLIST"), list(makeSymbol("HEAD"), list(makeSymbol("FIM"), makeSymbol("ANCESTOR"), list(QUOTE, makeSymbol("GET-HEADS")))), list(makeSymbol("CPUSH"), makeSymbol("HEAD"), makeSymbol("MODIFIEDS"))),
					    list(makeSymbol("CSETQ"), makeSymbol("SUCCESS?"), T)))),
		    list(RET, makeSymbol("MODIFIEDS"))));

    protected static final SubLList $list3 = list(new SubLObject[] { list(makeSymbol("LEXES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("REFS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")),
	    list(makeSymbol("ABS-IDX"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-STRING"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ABS-INDEX"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-LEXES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-RANKED-LEXES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-REFS"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-REFS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("YIELD"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PARSE-EXPRESSION"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-HEADS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-HEAD"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SEMANTIC-HEADS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PP-COMPLEMENT"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-OBLIQUE-OBJECT"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-COMPLEMENTS"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SEMANTIC-COMPLEMENTS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PARTITION-SEMANTIC-COMPLEMENTS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MODIFIERS"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MODIFIEDS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEMPORAL-TREE-P"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RELATIVE-PRONOUN-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PPS"), NIL, makeKeyword("PROTECTED")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LOGICAL-FORM-INT"), NIL, makeKeyword("PROTECTED")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KEYWORD-RENAMINGS"), list(makeSymbol("&OPTIONAL"), makeSymbol("KEYWORDS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CYCLIFY-INT"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CYCLIFY-NUCLEUS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LEXIFY-INT"), list(makeSymbol("LEXICON")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TREE-KEYWORD-EQ-CLASSES"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("POS-FILTER-LEXES"), NIL, makeKeyword("PROTECTED"), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FRAME-FILTER-LEXES"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PP-COMP-FILTER-LEXES"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("MODIFIED-DEPENDENT-MEANING-P"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RETOKENIZE"), list(makeSymbol("LEXICON")), makeKeyword("PROTECTED")) });

    protected static final SubLList $list304 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-NUMBER"), NIL, makeKeyword("PUBLIC")));

    protected static final SubLList $list307 = list(makeString("@return listp; the list of all numbers of this noun"), list(RET, list(QUOTE, list(makeKeyword("SINGULAR")))));

    protected static final SubLList $list308 = list(makeKeyword("SINGULAR"));

    protected static final SubLList $list311 = list(makeSymbol("NAME-WORD"));

    protected static final SubLList $list312 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-QUANTIFIER"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")));

    protected static final SubLList $list313 = list(list(makeSymbol("CLET"), list(list(makeSymbol("QUANTIFIER"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-OVERT-QUANTIFIER"))))),
	    list(RET, list(makeSymbol("FIF"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), makeSymbol("QUANTIFIER")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PLURAL-P")))),
		    list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-EXISTENTIAL-NULL-DETERMINER"))), makeSymbol("QUANTIFIER")))));

    protected static final SubLList $list318 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-OVERT-QUANTIFIER"), NIL, makeKeyword("PROTECTED")));

    protected static final SubLList $list321 = list(makeString("@return word-tree-p; the visible quantifier of this noun of nil if there is none"), list(makeSymbol("CLET"),
	    list(list(makeSymbol("QUANT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SISTER")), ONE_INTEGER))), list(makeSymbol("PWHEN"), list(makeSymbol("CARDINAL-WORD-TREE-P"), makeSymbol("QUANT")), list(RET, makeSymbol("QUANT")))));

    protected static final SubLList $list33 = list(list(makeSymbol("CLET"), list(list(makeSymbol("FILTERED"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("RLE"), makeSymbol("LEXES")), list(makeSymbol("PCOND"),
	    list(list(makeSymbol("MEMBER"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-CATEGORY"))), list(makeSymbol("FIM"), list(makeSymbol("RLE-LEX"), makeSymbol("RLE")), list(QUOTE, makeSymbol("GET")), makeKeyword("PENN-TAGS"))),
		    list(makeSymbol("RLE-SET-CONFIDENCE"), makeSymbol("RLE"), ONE_INTEGER), list(makeSymbol("CPUSH"), makeSymbol("RLE"), makeSymbol("FILTERED"))),
	    list(list(makeSymbol("MEMBER"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-CATEGORY"))), list(makeSymbol("FIM"), list(makeSymbol("RLE-LEX"), makeSymbol("RLE")), list(QUOTE, makeSymbol("GET")), makeKeyword("BACKOFF-PENN-TAGS"))),
		    list(makeSymbol("RLE-SET-CONFIDENCE"), makeSymbol("RLE"), makeDouble(0.75)), list(makeSymbol("CPUSH"), makeSymbol("RLE"), makeSymbol("FILTERED"))))),
	    list(makeSymbol("CSETQ"), makeSymbol("LEXES"), makeSymbol("FILTERED")), list(RET, makeSymbol("LEXES"))));

    protected static final SubLList $list330 = list(makeString("@return listp; the list of all numbers of this noun"), list(RET, list(QUOTE, list(makeKeyword("PLURAL")))));

    protected static final SubLList $list331 = list(makeKeyword("PLURAL"));

    protected static final SubLList $list338 = list(makeSymbol("PRONOUN-TREE"));

    protected static final SubLList $list339 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-NUMBER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PERSON"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-GENDER"), NIL, makeKeyword("PUBLIC")));

    protected static final SubLList $list342 = list(makeString("I"), makeString("you"), makeString("he"), makeString("she"), makeString("it"), makeString("me"), makeString("him"), makeString("her"));

    protected static final SubLList $list343 = list(makeString("we"), makeString("you"), makeString("they"), makeString("us"), makeString("them"));

    protected static final SubLList $list344 = list(makeString("@return listp; a list of numbers of this pronoun with possible number values\n   :SINGULAR and :PLURAL"),
	    list(makeSymbol("CLET"), list(list(makeSymbol("NUMBERS"), NIL)),
		    list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER?"), makeSymbol("STRING"), makeSymbol("*SINGULAR-PERSONAL-PRONOUNS*"), list(QUOTE, EQUALP)), list(makeSymbol("CPUSH"), makeKeyword("SINGULAR"), makeSymbol("NUMBERS"))),
		    list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER?"), makeSymbol("STRING"), makeSymbol("*PLURAL-PERSONAL-PRONOUNS*"), list(QUOTE, EQUALP)), list(makeSymbol("CPUSH"), makeKeyword("PLURAL"), makeSymbol("NUMBERS"))), list(RET, makeSymbol("NUMBERS"))));

    protected static final SubLList $list347 = list(makeString("@return keywordp; the person of this pronoun"),
	    list(RET, list(makeSymbol("FCOND"), list(list(EQUALP, makeSymbol("STRING"), makeString("I")), ONE_INTEGER), list(list(EQUALP, makeSymbol("STRING"), makeString("me")), ONE_INTEGER), list(list(EQUALP, makeSymbol("STRING"), makeString("you")), TWO_INTEGER),
		    list(list(EQUALP, makeSymbol("STRING"), makeString("we")), ONE_INTEGER), list(list(EQUALP, makeSymbol("STRING"), makeString("us")), ONE_INTEGER), list(T, THREE_INTEGER))));

    protected static final SubLList $list355 = list(makeString("@return listp; a list of genders of this pronoun with possible gender values \n   :FEMININE, :MASCULINE and :NEUTER"),
	    list(RET,
		    list(makeSymbol("CDR"),
			    list(makeSymbol("ASSOC"), makeSymbol("STRING"),
				    list(QUOTE,
					    list(new SubLObject[] { list(makeString("I"), makeKeyword("MASCULINE"), makeKeyword("FEMININE")), list(makeString("me"), makeKeyword("MASCULINE"), makeKeyword("FEMININE")), list(makeString("you"), makeKeyword("MASCULINE"), makeKeyword("FEMININE")),
						    list(makeString("he"), makeKeyword("MASCULINE")), list(makeString("him"), makeKeyword("MASCULINE")), list(makeString("she"), makeKeyword("FEMININE")), list(makeString("her"), makeKeyword("FEMININE")), list(makeString("it"), makeKeyword("NEUTER")),
						    list(makeString("we"), makeKeyword("MASCULINE"), makeKeyword("FEMININE")), list(makeString("us"), makeKeyword("MASCULINE"), makeKeyword("FEMININE")),
						    list(makeString("they"), makeKeyword("MASCULINE"), makeKeyword("FEMININE"), makeKeyword("NEUTER")), list(makeString("them"), makeKeyword("MASCULINE"), makeKeyword("FEMININE"), makeKeyword("NEUTER")) })),
				    list(QUOTE, EQUALP)))));

    protected static final SubLList $list357 = list(new SubLObject[] { list(makeString("I"), makeKeyword("MASCULINE"), makeKeyword("FEMININE")), list(makeString("me"), makeKeyword("MASCULINE"), makeKeyword("FEMININE")), list(makeString("you"), makeKeyword("MASCULINE"), makeKeyword("FEMININE")),
	    list(makeString("he"), makeKeyword("MASCULINE")), list(makeString("him"), makeKeyword("MASCULINE")), list(makeString("she"), makeKeyword("FEMININE")), list(makeString("her"), makeKeyword("FEMININE")), list(makeString("it"), makeKeyword("NEUTER")),
	    list(makeString("we"), makeKeyword("MASCULINE"), makeKeyword("FEMININE")), list(makeString("us"), makeKeyword("MASCULINE"), makeKeyword("FEMININE")), list(makeString("they"), makeKeyword("MASCULINE"), makeKeyword("FEMININE"), makeKeyword("NEUTER")),
	    list(makeString("them"), makeKeyword("MASCULINE"), makeKeyword("FEMININE"), makeKeyword("NEUTER")) });

    protected static final SubLList $list360 = list(makeSymbol("WH-TREE"), makeSymbol("QUANTIFIER-TREE"));

    protected static final SubLList $list361 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-REFS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ANTECEDENT"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-QUANTIFIER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-NUMBER"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-GENDER"), NIL, makeKeyword("PUBLIC")));

    protected static final SubLList $list364 = list(makeString("@return listp; the unique referents of this phrase"), list(makeSymbol("CLET"), list(list(makeSymbol("ANTECEDENT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-ANTECEDENT"))))),
	    list(RET, list(makeSymbol("FIF"), makeSymbol("ANTECEDENT"), list(makeSymbol("FIM"), makeSymbol("ANTECEDENT"), list(QUOTE, makeSymbol("GET-REFS"))), makeSymbol("REFS")))));

    protected static final SubLList $list367 = list(makeString("@return parse-tree-p; the tree that serves as an antecedent to this wh word"),
	    list(makeSymbol("CLET"),
		    list(list(makeSymbol("GRANDMOTHER"), list(makeSymbol("FWHEN"), makeSymbol("MOTHER"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("GET-MOTHER"))))),
			    list(makeSymbol("GREAT-GRANDMOTHER"), list(makeSymbol("FWHEN"), makeSymbol("GRANDMOTHER"), list(makeSymbol("FIM"), makeSymbol("GRANDMOTHER"), list(QUOTE, makeSymbol("GET-MOTHER")))))),
		    list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("NP-TREE-P"), makeSymbol("GREAT-GRANDMOTHER")), list(makeSymbol("NP-TREE-P"), list(makeSymbol("FIM"), makeSymbol("GREAT-GRANDMOTHER"), list(QUOTE, makeSymbol("GET-DAUGHTER")), ZERO_INTEGER))),
			    list(RET, list(makeSymbol("FIM"), makeSymbol("GREAT-GRANDMOTHER"), list(QUOTE, makeSymbol("GET-DAUGHTER")), ZERO_INTEGER)))));

    protected static final SubLList $list370 = list(makeString("@return word-tree-p; the quantifier of this name, or nil if there is none"),
	    list(RET, list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("FIND-LAST")), list(QUOTE, makeSymbol("QUANTIFIER-TREE-P")), list(makeSymbol("1-"), makeSymbol("IDX")))));

    protected static final SubLList $list373 = list(makeString("@return listp; a list of numbers of this wp with possible number values\n   :SINGULAR and :PLURAL"), list(RET, list(QUOTE, list(makeKeyword("SINGULAR")))));

    protected static final SubLList $list375 = list(makeString("@return listp; a list of genders of this pronoun with possible gender values \n   :FEMININE, :MASCULINE and :NEUTER"),
	    list(RET, list(QUOTE, list(makeKeyword("MASCULINE"), makeKeyword("FEMININE"), makeKeyword("NEUTER")))));

    protected static final SubLList $list376 = list(makeKeyword("MASCULINE"), makeKeyword("FEMININE"), makeKeyword("NEUTER"));

    protected static final SubLList $list380 = list(makeSymbol("VERBAL-TREE"), makeSymbol("VERBAL-WORD"));

    protected static final SubLList $list381 = list(new SubLObject[] { list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PREDICATE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-NUMBER"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PERSON"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TENSE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SUBJECT"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-OBJECTS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DIRECT-OBJECT"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-INDIRECT-OBJECT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SEMANTIC-DIRECT-OBJECT"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SEMANTIC-INDIRECT-OBJECT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SEMANTIC-OBJECTS"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-VERBAL-COMPLEMENT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ADJECTIVAL-COMPLEMENT"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-COMPLEMENTS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MATRIX-CLAUSE"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PARTICLE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-INFINITIVE-MARKER"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DUMMY-TO-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FINITE-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PASSIVE-P"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INFINITIVE-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("BASE-P"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CONTROL-VERB-P"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SUBJECT-CONTROLLER-P"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("OBJECT-CONTROLLER-P"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CONTROL-VERB-P"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONTROL-VERB"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONTROLLER"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ANCESTOR-OBJECTS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MOVED-NPS"), NIL, makeKeyword("PROTECTED")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MOVED-OBJECTS"), NIL, makeKeyword("PROTECTED")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KEYWORD-RENAMINGS"), list(makeSymbol("&OPTIONAL"), makeSymbol("KEYWORDS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PARTITION-SEMANTIC-COMPLEMENTS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PARTICLE-FILTER-LEXES"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INVERTED-P"), NIL, makeKeyword("PROTECTED")) });

    protected static final SubLList $list382 = list(list(makeSymbol("CLET"),
	    list(list(makeSymbol("FILTERED"), NIL), list(makeSymbol("SENTENCE-PARTICLE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-PARTICLE")))),
		    list(makeSymbol("SENTENCE-PARTICLE-HEAD"), list(makeSymbol("FWHEN"), makeSymbol("SENTENCE-PARTICLE"), list(makeSymbol("FIM"), makeSymbol("SENTENCE-PARTICLE"), list(QUOTE, makeSymbol("GET-HEAD"))))), makeSymbol("FRAME")),
	    list(makeSymbol("CDOLIST"), list(makeSymbol("RLE"), makeSymbol("LEXES")), list(makeSymbol("CSETQ"), makeSymbol("FRAME"), list(makeSymbol("FIM"), list(makeSymbol("RLE-LEX"), makeSymbol("RLE")), list(QUOTE, makeSymbol("GET")), makeKeyword("FRAME"))),
		    list(makeSymbol("PIF"), list(makeSymbol("CAND"), list(makeSymbol("FORMULA-ARG2"), makeSymbol("FRAME")), list(makeSymbol("ISA?"), makeSymbol("FRAME"), reader_make_constant_shell("ParticleFrameType"), reader_make_constant_shell("EverythingPSC"))),
			    list(makeSymbol("PWHEN"), makeSymbol("SENTENCE-PARTICLE-HEAD"),
				    list(makeSymbol("CLET"), list(list(makeSymbol("REQUIRED-PARTICLE-STRING"), list(makeSymbol("FIRST"), list(makeSymbol("GET-STRINGS-OF-TYPE"), list(makeSymbol("FORMULA-ARG2"), makeSymbol("FRAME")), reader_make_constant_shell("VerbParticle"))))),
					    list(makeSymbol("PWHEN"), list(EQUALP, makeSymbol("REQUIRED-PARTICLE-STRING"), list(makeSymbol("FIM"), makeSymbol("SENTENCE-PARTICLE-HEAD"), list(QUOTE, makeSymbol("GET-STRING")))),
						    list(makeSymbol("RLE-SET-CONFIDENCE"), makeSymbol("RLE"), ONE_INTEGER), list(makeSymbol("CPUSH"), makeSymbol("RLE"), makeSymbol("FILTERED"))))),
			    list(makeSymbol("PUNLESS"), makeSymbol("SENTENCE-PARTICLE-HEAD"), list(makeSymbol("CPUSH"), makeSymbol("RLE"), makeSymbol("FILTERED"))))),
	    list(makeSymbol("CSETQ"), makeSymbol("LEXES"), makeSymbol("FILTERED")), list(RET, makeSymbol("LEXES"))));

    protected static final SubLList $list388 = list(list(makeSymbol("CLET"),
	    list(list(makeSymbol("SUBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SEMANTIC-SUBJECT")))),
		    list(makeSymbol("NON-DISTRIBUTING"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SEMANTIC-COMPLEMENTS"))))),
	    list(makeSymbol("PWHEN"), makeSymbol("SUBJECT"), list(makeSymbol("CSETQ"), makeSymbol("NON-DISTRIBUTING"), list(makeSymbol("DELETE-CYCLIFIABLE"), makeSymbol("SUBJECT"), makeSymbol("NON-DISTRIBUTING")))),
	    list(RET, list(makeSymbol("VALUES"), makeSymbol("NON-DISTRIBUTING"), list(makeSymbol("FWHEN"), makeSymbol("SUBJECT"), list(makeSymbol("LIST"), makeSymbol("SUBJECT")))))));

    protected static final SubLList $list391 = list(makeSymbol("&OPTIONAL"),
	    list(makeSymbol("KEYWORDS"), list(QUOTE, list(makeKeyword("ACTION"), makeKeyword("SUBJECT"), makeKeyword("OBJECT"), makeKeyword("OBLIQUE-OBJECT"), makeKeyword("CLAUSE"), makeKeyword("INF-COMP"), $NOUN))));

    protected static final SubLList $list392 = list(list(new SubLObject[] { makeSymbol("CLET"), list(list(makeSymbol("CONJUNCTS"), NIL), list(makeSymbol("DISJUNCTS"), NIL),
	    list(makeSymbol("SUBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SEMANTIC-SUBJECT")))), list(makeSymbol("DIRECT-OBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SEMANTIC-DIRECT-OBJECT")))),
	    list(makeSymbol("INDIRECT-OBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SEMANTIC-INDIRECT-OBJECT")))),
	    list(makeSymbol("OBLIQUE-OBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-OBLIQUE-OBJECT")))), list(makeSymbol("CL-COMPLEMENT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-VERBAL-COMPLEMENT")))),
	    list(makeSymbol("MODIFIED"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-MODIFIEDS")))))),
	    list(makeSymbol("PWHEN"),
		    list(makeSymbol("CAND"), list(makeSymbol("MEMBER?"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-CATEGORY"))), list(QUOTE, list(makeKeyword("VBN"), makeKeyword("VBG"))), list(QUOTE, EQL)),
			    list(makeSymbol("CNOT"), makeSymbol("SUBJECT"))),
		    list(makeSymbol("CSETQ"), makeSymbol("SUBJECT"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-MODIFIEDS")))))),
	    list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER?"), makeKeyword("ACTION"), makeSymbol("KEYWORDS"), list(QUOTE, EQL)), list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("ACTION"), makeSymbol("SELF")), makeSymbol("CONJUNCTS"))),
	    list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("SUBJECT"), list(makeSymbol("MEMBER"), makeKeyword("SUBJECT"), makeSymbol("KEYWORDS"), list(QUOTE, EQL))),
		    list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("SUBJECT"), makeSymbol("SUBJECT")), makeSymbol("CONJUNCTS"))),
	    list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("DIRECT-OBJECT"), list(makeSymbol("MEMBER"), makeKeyword("OBJECT"), makeSymbol("KEYWORDS"), list(QUOTE, EQL))),
		    list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("OBJECT"), makeSymbol("DIRECT-OBJECT")), makeSymbol("CONJUNCTS"))),
	    list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("INDIRECT-OBJECT"), list(makeSymbol("MEMBER"), makeKeyword("OBLIQUE-OBJECT"), makeSymbol("KEYWORDS"), list(QUOTE, EQL))),
		    list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("OBLIQUE-OBJECT"), makeSymbol("INDIRECT-OBJECT")), makeSymbol("CONJUNCTS"))),
	    list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("OBLIQUE-OBJECT"), list(makeSymbol("MEMBER"), makeKeyword("OBLIQUE-OBJECT"), makeSymbol("KEYWORDS"), list(QUOTE, EQL))),
		    list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("PREP-OBJECT"), makeSymbol("OBLIQUE-OBJECT")), makeSymbol("CONJUNCTS"))),
	    list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("MODIFIED"), list(makeSymbol("MEMBER"), $NOUN, makeSymbol("KEYWORDS"), list(QUOTE, EQL))),
		    list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), $NOUN, makeSymbol("MODIFIED")), makeSymbol("CONJUNCTS"))),
	    list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("CL-COMPLEMENT"), list(makeSymbol("MEMBER"), makeKeyword("CLAUSE"), makeSymbol("KEYWORDS"), list(QUOTE, EQL))),
		    list(makeSymbol("CLET"), list(list(makeSymbol("CL-CYCLS"), list(makeSymbol("FIM"), makeSymbol("CL-COMPLEMENT"), list(QUOTE, makeSymbol("CYCLIFY-INT"))))),
			    list(makeSymbol("CDOLIST"), list(makeSymbol("CL-CYCL"), makeSymbol("CL-CYCLS")), list(makeSymbol("CSETQ"), makeSymbol("CL-CYCL"), list(makeSymbol("LIFT-CONJUNCTS"), makeSymbol("CL-CYCL"))),
				    list(makeSymbol("CPUSH"), list(makeSymbol("CONS"), makeKeyword("CLAUSE"), makeSymbol("CL-CYCL")), makeSymbol("DISJUNCTS"))))),
	    list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("CL-COMPLEMENT"), list(makeSymbol("MEMBER"), makeKeyword("INF-COMP"), makeSymbol("KEYWORDS"), list(QUOTE, EQL))),
		    list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("INF-COMP"), makeSymbol("CL-COMPLEMENT")), makeSymbol("CONJUNCTS"))),
	    list(RET, list(makeSymbol("DISJUNCTIVE-KEYWORD-RENAMINGS"), makeSymbol("CONJUNCTS"), makeSymbol("DISJUNCTS"))) }));

    protected static final SubLList $list393 = list(makeKeyword("ACTION"), makeKeyword("SUBJECT"), makeKeyword("OBJECT"), makeKeyword("OBLIQUE-OBJECT"), makeKeyword("CLAUSE"), makeKeyword("INF-COMP"), $NOUN);

    protected static final SubLList $list397 = list(makeKeyword("VBN"), makeKeyword("VBG"));

    protected static final SubLList $list40 = list(list(RET,
	    list(makeSymbol("KEYWORD-EQ-CLASSES"), list(makeSymbol("MAPCAR"), list(QUOTE, makeSymbol("CAR")), list(makeSymbol("FIRST"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-KEYWORD-RENAMINGS")))))))));

    protected static final SubLList $list405 = list(list(makeSymbol("CLET"), list(list(makeSymbol("CONTROL-VERB"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-CONTROL-VERB"))))),
	    list(makeSymbol("PCOND"), list(list(makeSymbol("NULL"), makeSymbol("CONTROL-VERB")), list(RET, NIL)),
		    list(list(makeSymbol("FIM"), makeSymbol("CONTROL-VERB"), list(QUOTE, makeSymbol("SUBJECT-CONTROLLER-P"))), list(RET, list(makeSymbol("FIM"), makeSymbol("CONTROL-VERB"), list(QUOTE, makeSymbol("GET-SEMANTIC-SUBJECT"))))),
		    list(list(makeSymbol("FIM"), makeSymbol("CONTROL-VERB"), list(QUOTE, makeSymbol("OBJECT-CONTROLLER-P"))), list(RET, list(makeSymbol("FIM"), makeSymbol("CONTROL-VERB"), list(QUOTE, makeSymbol("GET-DIRECT-OBJECT"))))))));

    protected static final SubLList $list411 = list(list(makeSymbol("CLET"),
	    list(list(makeSymbol("MATRIX"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-MATRIX-CLAUSE")))),
		    list(makeSymbol("MATRIX-HEAD"), list(makeSymbol("FWHEN"), makeSymbol("MATRIX"), list(makeSymbol("FIM"), makeSymbol("MATRIX"), list(QUOTE, makeSymbol("GET-HEAD")))))),
	    list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("MATRIX-HEAD"), list(makeSymbol("FIM"), makeSymbol("MATRIX-HEAD"), list(QUOTE, makeSymbol("CONTROL-VERB-P")))), list(RET, makeSymbol("MATRIX-HEAD")))));

    protected static final SubLList $list415 = list(list(makeSymbol("CLET"), list(makeSymbol("RESULT")),
	    list(makeSymbol("CDOLIST"), list(makeSymbol("LEX"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-LEXES")))),
		    list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("MEMBER"), list(makeSymbol("FIM"), makeSymbol("LEX"), list(QUOTE, makeSymbol("GET")), makeKeyword("FRAME")), list(QUOTE, list(reader_make_constant_shell("ObjectControlFrame"))))),
		    list(makeSymbol("PWHEN"), makeSymbol("RESULT"), list(RET, list(makeSymbol("BOOLEAN"), makeSymbol("RESULT")))))));

    protected static final SubLList $list416 = list(reader_make_constant_shell("ObjectControlFrame"));

    protected static final SubLList $list418 = list(list(makeSymbol("CLET"), list(makeSymbol("RESULT")),
	    list(makeSymbol("CDOLIST"), list(makeSymbol("LEX"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-LEXES")))),
		    list(makeSymbol("CSETQ"), makeSymbol("RESULT"),
			    list(makeSymbol("MEMBER"), list(makeSymbol("FIM"), makeSymbol("LEX"), list(QUOTE, makeSymbol("GET")), makeKeyword("FRAME")),
				    list(QUOTE, list(reader_make_constant_shell("IntransitiveSubjectControlFrame"), reader_make_constant_shell("TransitiveSubjectControlFrame"))))),
		    list(makeSymbol("PWHEN"), makeSymbol("RESULT"), list(RET, list(makeSymbol("BOOLEAN"), makeSymbol("RESULT")))))));

    protected static final SubLList $list419 = list(reader_make_constant_shell("IntransitiveSubjectControlFrame"), reader_make_constant_shell("TransitiveSubjectControlFrame"));

    protected static final SubLList $list421 = list(
	    list(RET, list(makeSymbol("COR"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("SUBJECT-CONTROLLER-P"))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("OBJECT-CONTROLLER-P"))))));

    protected static final SubLList $list423 = list(list(makeSymbol("CDOLIST"), list(makeSymbol("ANCESTOR"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-ANCESTORS")))),
	    list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("SENTENTIAL-TREE-P"), makeSymbol("ANCESTOR")), list(makeSymbol("CNOT"), list(EQ, list(makeSymbol("FIM"), makeSymbol("ANCESTOR"), list(QUOTE, makeSymbol("GET-HEAD"))), makeSymbol("SELF")))),
		    list(RET, makeSymbol("ANCESTOR")))),
	    list(RET, NIL));

    protected static final SubLList $list428 = list(makeString("@return word-tree-p; the predicate of this sentence"), list(RET, list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SEMANTIC-HEAD")))));

    protected static final SubLList $list431 = list(makeString("@return listp; a list of numbers of this verb with possible number values\n   :SINGULAR and :PLURAL"),
	    list(makeSymbol("PWHEN"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("FINITE-P"))), list(makeSymbol("CLET"), list(list(makeSymbol("SUBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SUBJECT"))))),
		    list(RET, list(makeSymbol("FWHEN"), makeSymbol("SUBJECT"), list(makeSymbol("FIM"), makeSymbol("SUBJECT"), list(QUOTE, makeSymbol("GET-NUMBER"))))))));

    protected static final SubLList $list434 = list(makeString("@return numberp; the person of this verb; 1, 2, or 3"),
	    list(makeSymbol("PWHEN"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("FINITE-P"))), list(makeSymbol("CLET"), list(list(makeSymbol("SUBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SUBJECT"))))),
		    list(RET, list(makeSymbol("FWHEN"), makeSymbol("SUBJECT"), list(makeSymbol("FIM"), makeSymbol("SUBJECT"), list(QUOTE, makeSymbol("GET-PERSON"))))))));

    protected static final SubLList $list437 = list(makeString("@return keywordp; the tense of this vp; either :PRESENT, :PAST, :FUTURE,\n   or :INFINITIVE"), list(RET, NIL));

    protected static final SubLList $list439 = list(makeString("@return phrase-tree-p; the subject of this verb"),
	    list(makeSymbol("CLET"), list(list(makeSymbol("SUBJECT"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("FIND-LAST")), list(QUOTE, makeSymbol("NOMINAL-TREE-P")), list(makeSymbol("1-"), makeSymbol("IDX"))))),
		    list(makeSymbol("PWHEN"), makeSymbol("SUBJECT"), list(RET, makeSymbol("SUBJECT")))),
	    list(makeSymbol("CLET"), list(list(makeSymbol("CONTROLLER"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-CONTROLLER"))))), list(makeSymbol("PWHEN"), makeSymbol("CONTROLLER"), list(RET, makeSymbol("CONTROLLER")))),
	    list(makeSymbol("PWHEN"), list(makeSymbol("VERBAL-TREE-P"), makeSymbol("MOTHER")), list(RET, list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("GET-SUBJECT"))))));

    protected static final SubLList $list443 = list(makeString("@return listp; a list of all objects of this verb"),
	    list(makeSymbol("CLET"),
		    list(list(makeSymbol("DIRECT-OBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-DIRECT-OBJECT")))),
			    list(makeSymbol("INDIRECT-OBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-INDIRECT-OBJECT")))), list(makeSymbol("OBJECTS"), NIL)),
		    list(makeSymbol("PWHEN"), makeSymbol("INDIRECT-OBJECT"), list(makeSymbol("CPUSH"), makeSymbol("INDIRECT-OBJECT"), makeSymbol("OBJECTS"))), list(makeSymbol("PWHEN"), makeSymbol("DIRECT-OBJECT"), list(makeSymbol("CPUSH"), makeSymbol("DIRECT-OBJECT"), makeSymbol("OBJECTS"))),
		    list(makeSymbol("PWHEN"), makeSymbol("MOTHER"),
			    list(makeSymbol("CDOLIST"), list(makeSymbol("PP"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("FIND")), list(QUOTE, makeSymbol("PREPOSITIONAL-OR-PARTICLE-PHRASE-TREE-P")))),
				    list(makeSymbol("PWHEN"), list(makeSymbol("FIM"), makeSymbol("PP"), list(QUOTE, makeSymbol("STRANDED-P"))),
					    list(makeSymbol("CSETQ"), makeSymbol("OBJECTS"), list(makeSymbol("DELETE"), list(makeSymbol("FIM"), makeSymbol("PP"), list(QUOTE, makeSymbol("GET-OBLIQUE-OBJECT"))), makeSymbol("OBJECTS")))))),
		    list(RET, makeSymbol("OBJECTS"))));

    protected static final SubLList $list45 = list(makeSymbol("&OPTIONAL"), makeSymbol("RENAMINGS"));

    protected static final SubLList $list450 = list(makeString("@return listp; the list of all non-local nps of this verb"),
	    list(makeSymbol("CLET"), list(makeSymbol("MOVED")),
		    list(makeSymbol("CSOME"), list(makeSymbol("ANCESTOR"), list(makeSymbol("CDR"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-ANCESTORS")))), makeSymbol("MOVED")), list(makeSymbol("PWHEN"),
			    list(makeSymbol("VERBAL-TREE-P"), makeSymbol("ANCESTOR")), list(makeSymbol("CSETQ"), makeSymbol("MOVED"), list(makeSymbol("FIM"), makeSymbol("ANCESTOR"), list(QUOTE, makeSymbol("FIND")), list(QUOTE, makeSymbol("WHNP-TREE-P")))))),
		    list(RET, makeSymbol("MOVED"))));

    protected static final SubLList $list454 = list(makeString("@return listp; the list of all non-local ('moved') objects of this verb"),
	    list(RET, list(makeSymbol("DELETE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SUBJECT"))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-MOVED-NPS"))), list(QUOTE, EQ))));

    protected static final SubLList $list456 = list(makeString("@return phrase-tree-p; the direct object of this verb"),
	    list(makeSymbol("CLET"),
		    list(list(makeSymbol("MOVED"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-MOVED-OBJECTS")))),
			    list(makeSymbol("LOCALS"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("FIND")), list(QUOTE, makeSymbol("NOMINAL-TREE-P")), list(makeSymbol("1+"), makeSymbol("IDX")))),
			    list(makeSymbol("N"), list(makeSymbol("LENGTH"), makeSymbol("LOCALS")))),
		    list(makeSymbol("PCOND"),
			    list(list(makeSymbol("="), makeSymbol("N"), TWO_INTEGER),
				    list(makeSymbol("PIF"), list(makeSymbol("FIM"), list(makeSymbol("SECOND"), makeSymbol("LOCALS")), list(QUOTE, makeSymbol("TEMPORAL-TREE-P"))), list(RET, list(makeSymbol("FIRST"), makeSymbol("LOCALS"))),
					    list(RET, list(makeSymbol("SECOND"), makeSymbol("LOCALS"))))),
			    list(list(makeSymbol("CAND"), list(makeSymbol("="), makeSymbol("N"), ONE_INTEGER), list(makeSymbol("CNOT"), makeSymbol("MOVED"))), list(RET, list(makeSymbol("FIRST"), makeSymbol("LOCALS")))),
			    list(list(makeSymbol("CAND"), list(makeSymbol("<"), makeSymbol("N"), TWO_INTEGER), makeSymbol("MOVED"), list(RET, list(makeSymbol("FIRST"), makeSymbol("MOVED"))))))));

    protected static final SubLList $list459 = list(makeString("@return phrase-tree-p; the indirect object of this verb, including oblique objects\n   embedded within a PP"),
	    list(makeSymbol("CLET"), list(list(makeSymbol("OBLIQUE-OBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-OBLIQUE-OBJECT"))))), list(makeSymbol("PWHEN"), makeSymbol("OBLIQUE-OBJECT"), list(RET, makeSymbol("OBLIQUE-OBJECT")))),
	    list(makeSymbol("CLET"),
		    list(list(makeSymbol("MOVED"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-MOVED-OBJECTS")))),
			    list(makeSymbol("LOCALS"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("FIND")), list(QUOTE, makeSymbol("NOMINAL-TREE-P")), list(makeSymbol("1+"), makeSymbol("IDX")))),
			    list(makeSymbol("N"), list(makeSymbol("LENGTH"), makeSymbol("LOCALS")))),
		    list(makeSymbol("PCOND"), list(list(makeSymbol("CAND"), list(makeSymbol("="), makeSymbol("N"), TWO_INTEGER), list(makeSymbol("CNOT"), list(makeSymbol("FIM"), list(makeSymbol("SECOND"), makeSymbol("LOCALS")), list(QUOTE, makeSymbol("TEMPORAL-TREE-P"))))),
			    list(RET, list(makeSymbol("FIRST"), makeSymbol("LOCALS")))), list(list(makeSymbol("CAND"), list(makeSymbol("="), makeSymbol("N"), ONE_INTEGER), makeSymbol("MOVED"), list(RET, list(makeSymbol("FIRST"), makeSymbol("MOVED"))))))));

    protected static final SubLList $list46 = list(list(makeSymbol("CLET"), list(list(makeSymbol("NDISTR-COMP-CYCLS"), NIL), list(makeSymbol("DISTR-COMP-CYCLS"), NIL), list(makeSymbol("MOD-CYCLS"), NIL), list(makeSymbol("CYCLS"), NIL)),
	    list(makeSymbol("WITHOUT-RECURSIVE-CYCLIFICATION"),
		    list(makeSymbol("PUNLESS"), makeSymbol("RENAMINGS"),
			    list(makeSymbol("CSETQ"), makeSymbol("RENAMINGS"),
				    list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-KEYWORD-RENAMINGS")), list(makeSymbol("REQUIRED-KEYWORDS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-RANKED-LEXES"))))))),
		    list(makeSymbol("CSETQ"), makeSymbol("RENAMINGS"), list(makeSymbol("GROUP-DISJUNCTIVE-RENAMINGS"), makeSymbol("RENAMINGS"))),
		    list(makeSymbol("CMULTIPLE-VALUE-BIND"), list(makeSymbol("NON-DISTRIBUTING"), makeSymbol("DISTRIBUTING")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PARTITION-SEMANTIC-COMPLEMENTS"))),
			    list(makeSymbol("CDOLIST"), list(makeSymbol("COMPLEMENT"), makeSymbol("NON-DISTRIBUTING")),
				    list(makeSymbol("CLET"), list(list(makeSymbol("COMP-CYCL"), list(makeSymbol("FIM"), makeSymbol("COMPLEMENT"), list(QUOTE, makeSymbol("CYCLIFY-INT"))))),
					    list(makeSymbol("PWHEN"), makeSymbol("COMP-CYCL"), list(makeSymbol("CPUSH"), makeSymbol("COMP-CYCL"), makeSymbol("NDISTR-COMP-CYCLS"))))),
			    list(makeSymbol("CDOLIST"), list(makeSymbol("COMPLEMENT"), makeSymbol("DISTRIBUTING")),
				    list(makeSymbol("CLET"), list(list(makeSymbol("COMP-CYCL"), list(makeSymbol("FIM"), makeSymbol("COMPLEMENT"), list(QUOTE, makeSymbol("CYCLIFY-INT"))))),
					    list(makeSymbol("PWHEN"), makeSymbol("COMP-CYCL"), list(makeSymbol("CPUSH"), makeSymbol("COMP-CYCL"), makeSymbol("DISTR-COMP-CYCLS"))))),
			    list(makeSymbol("CDOLIST"), list(makeSymbol("MODIFIER"), list(makeSymbol("FIM"), makeSymbol("SELF"),
				    list(QUOTE, makeSymbol("GET-MODIFIERS")))), list(
					    makeSymbol("CLET"), list(list(makeSymbol("MOD-CYCL"),
						    list(makeSymbol("FIM"), makeSymbol("MODIFIER"), list(QUOTE, makeSymbol("CYCLIFY-INT"))))),
					    list(makeSymbol("PWHEN"), makeSymbol("MOD-CYCL"), list(makeSymbol("CPUSH"), makeSymbol("MOD-CYCL"), makeSymbol("MOD-CYCLS"))))),
			    list(makeSymbol("CDOLIST"), list(makeSymbol("CONJUNCTION"), makeSymbol("RENAMINGS")), list(makeSymbol("CDOLIST"), list(makeSymbol("RLE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-RANKED-LEXES")))), list(makeSymbol("CLET"),
				    list(list(makeSymbol("MY-CYCLS0"), NIL)),
				    list(makeSymbol("CDOLIST"), list(makeSymbol("GROUPING"), makeSymbol("CONJUNCTION")), list(makeSymbol("CLET"), list(list(makeSymbol("THIS-AND-MODS"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("RENAMING"), makeSymbol("GROUPING")), list(makeSymbol("CPUSH"),
					    list(makeSymbol("MAPCAR"), list(QUOTE, makeSymbol("INSTANTIATE-SCOPE")),
						    list(makeSymbol("CROSS-PRODUCTS"), list(makeSymbol("CONS"), list(makeSymbol("LIST"), list(makeSymbol("APPLY-LEX-RENAMING"), makeSymbol("SELF"), makeSymbol("RLE"), makeSymbol("RENAMING"))), makeSymbol("MOD-CYCLS")))),
					    makeSymbol("THIS-AND-MODS"))),
					    list(makeSymbol("CPUSH"),
						    list(makeSymbol("MAPCAR"), list(QUOTE, makeSymbol("INSTANTIATE-SCOPE")),
							    list(makeSymbol("CROSS-PRODUCTS"),
								    list(makeSymbol("CONS"), list(makeSymbol("MAPCAR"), list(QUOTE, makeSymbol("INSTANTIATE-SCOPE")), list(makeSymbol("INDEXED-PRODUCTS"), makeSymbol("THIS-AND-MODS"))), makeSymbol("NDISTR-COMP-CYCLS")))),
						    makeSymbol("MY-CYCLS0")))),
				    list(makeSymbol("CSETQ"), makeSymbol("CYCLS"), list(makeSymbol("APPEND"), makeSymbol("CYCLS"), list(makeSymbol("MAPCAR"), list(QUOTE, makeSymbol("INSTANTIATE-SCOPE")), list(makeSymbol("INDEXED-PRODUCTS"), makeSymbol("MY-CYCLS0")))))))))),
	    list(RET, list(makeSymbol("MAPCAR"), list(QUOTE, makeSymbol("INSTANTIATE-SCOPE")), list(makeSymbol("CROSS-PRODUCTS"), list(makeSymbol("CONS"), makeSymbol("CYCLS"), makeSymbol("DISTR-COMP-CYCLS")))))));

    protected static final SubLList $list462 = list(makeString("@return phrase-tree-p; the semantic direct object of this verb"), list(RET, list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-DIRECT-OBJECT")))));

    protected static final SubLList $list464 = list(makeString("@return phrase-tree-p; the semantic indirect object of this verb"), list(RET, list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-INDIRECT-OBJECT")))));

    protected static final SubLList $list466 = list(makeString("@return listp; a list of all verbal complements of this verb"),
	    list(RET, list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("FIND-FIRST")), list(QUOTE, makeSymbol("VERBAL-PHRASE-TREE-P")), list(makeSymbol("1+"), makeSymbol("IDX")))));

    protected static final SubLList $list471 = list(makeString("@return adjp-tree-p; the adjectival complement of this verb"),
	    list(RET, list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("FIND-FIRST")), list(QUOTE, makeSymbol("ADJP-TREE-P")), list(makeSymbol("1+"), makeSymbol("IDX")))));

    protected static final SubLList $list475 = list(makeString("@return listp; a list of all complements of this verb"),
	    list(makeSymbol("CLET"),
		    list(list(makeSymbol("SUBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SEMANTIC-SUBJECT")))),
			    list(makeSymbol("VERBAL-COMPLEMENT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-VERBAL-COMPLEMENT")))),
			    list(makeSymbol("COMPLEMENTS"), list(makeSymbol("APPEND"), list(makeSymbol("FWHEN"), makeSymbol("SUBJECT"), list(makeSymbol("LIST"), makeSymbol("SUBJECT"))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SEMANTIC-OBJECTS"))),
				    list(makeSymbol("FWHEN"), makeSymbol("VERBAL-COMPLEMENT"), list(makeSymbol("LIST"), makeSymbol("VERBAL-COMPLEMENT")))))),
		    list(RET, makeSymbol("COMPLEMENTS"))));

    protected static final SubLList $list478 = list(makeString("@return word-tree-p; this verb's particle phrase, or nil if there is none"),
	    list(makeSymbol("CLET"), list(list(makeSymbol("PARTICLE-PHRASE"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("FIND-FIRST")), list(QUOTE, makeSymbol("PRT-TREE-P")), list(makeSymbol("1+"), makeSymbol("IDX"))))),
		    list(RET, list(makeSymbol("FWHEN"), makeSymbol("PARTICLE-PHRASE"), makeSymbol("PARTICLE-PHRASE")))));

    protected static final SubLList $list483 = list(makeString("@return word-tree-p; this verb's infinitive marker"),
	    list(makeSymbol("CLET"),
		    list(list(makeSymbol("VP"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-MOTHER")))), list(makeSymbol("CANDIDATE"), list(makeSymbol("FIM"), makeSymbol("VP"), list(QUOTE, makeSymbol("GET-SISTER")), MINUS_ONE_INTEGER))),
		    list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("CANDIDATE"), list(EQ, list(makeSymbol("FIM"), makeSymbol("CANDIDATE"), list(QUOTE, makeSymbol("GET-CATEGORY"))), makeKeyword("TO"))), list(RET, makeSymbol("CANDIDATE")))));

    protected static final SubLList $list487 = list(makeString("@return boolean; t if this verb is a dummy 'to', nil otherwise"), list(RET, list(EQL, list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-STRING"))), makeString("to"))));

    protected static final SubLList $list490 = list(makeString("@return phrase-tree-p; the semantic subject of this verbal tree"), list(RET, list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SUBJECT")))));

    protected static final SubLList $list492 = list(makeString("@return listp; a list of the semantic subject of this verbal tree"),
	    list(makeSymbol("CLET"),
		    list(list(makeSymbol("DIRECT-OBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SEMANTIC-DIRECT-OBJECT")))),
			    list(makeSymbol("INDIRECT-OBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SEMANTIC-INDIRECT-OBJECT")))), list(makeSymbol("SEMANTIC-OBJECTS"), NIL)),
		    list(makeSymbol("PWHEN"), makeSymbol("INDIRECT-OBJECT"), list(makeSymbol("CPUSH"), makeSymbol("INDIRECT-OBJECT"), makeSymbol("SEMANTIC-OBJECTS"))),
		    list(makeSymbol("PWHEN"), makeSymbol("DIRECT-OBJECT"), list(makeSymbol("CPUSH"), makeSymbol("DIRECT-OBJECT"), makeSymbol("SEMANTIC-OBJECTS"))), list(RET, makeSymbol("SEMANTIC-OBJECTS"))));

    protected static final SubLList $list495 = list(makeString("@return listp; the local syntactic objects of this tree and its ancestors"), list(RET, list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("GET-ANCESTOR-OBJECTS")))));

    protected static final SubLList $list499 = list(makeString("@return booleanp; t if this verb is inverted, nil otherwise"), list(RET, NIL));

    protected static final SubLList $list501 = list(makeString("@return booleanp; t if this word is finite, nil otherwise"), list(RET, list(makeSymbol("FINITE-VERBAL-WORD-TREE-P"), makeSymbol("SELF"))));

    protected static final SubLList $list504 = list(makeString("@return booleanp; t if this verb is the head of a passive construction, nil otherwise"), list(RET, NIL));

    protected static final SubLList $list507 = list(makeString("@return boolenap; t if this verb is in the infinitive form, nil otherwise"),
	    list(RET, list(makeSymbol("BOOLEAN"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-INFINITIVE-MARKER"))))));

    protected static final SubLList $list510 = list(makeString("@return booleanp; t if this verb is in its base form, nil otherwise"),
	    list(makeSymbol("CLET"), list(list(makeSymbol("GRANDMOTHER"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("GET-MOTHER"))))),
		    list(RET,
			    list(makeSymbol("COR"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("INFINITIVE-P"))),
				    list(makeSymbol("CAND"), makeSymbol("GRANDMOTHER"), list(makeSymbol("COR"), list(makeSymbol("FIM"), makeSymbol("GRANDMOTHER"), list(QUOTE, makeSymbol("FIND-FIRST")), list(QUOTE, makeSymbol("MODAL-VERB-TREE-P"))),
					    list(EQUALP, list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("GRANDMOTHER"), list(QUOTE, makeSymbol("GET-DAUGHTER")), ZERO_INTEGER), list(QUOTE, makeSymbol("GET-STRING"))), makeString("did"))))))));

    protected static final SubLList $list516 = list(makeSymbol("FINITE-VERBAL-WORD-TREE"));

    protected static final SubLList $list517 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TENSE"), NIL, makeKeyword("PUBLIC")));

    protected static final SubLList $list52 = list(list(makeSymbol("WITHOUT-DUPLICATE-CYCLIFICATION"), list(RET, list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CYCLIFY-NUCLEUS"))))));

    protected static final SubLList $list520 = list(makeString("@return keywordp; the tense of this verb; either :PRESENT, :PAST, :FUTURE,\n   or :INFINITIVE"), list(RET, makeKeyword("PRESENT")));

    protected static final SubLList $list524 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-AUX-VERB"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SEMANTIC-SUBJECT"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SEMANTIC-DIRECT-OBJECT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SEMANTIC-INDIRECT-OBJECT"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PASSIVE-P"), NIL, makeKeyword("PROTECTED")));

    protected static final SubLList $list528 = list(makeString("@return aux-verb-tree-p; the aux verb of this participle form"), list(makeSymbol("CLET"), list(list(makeSymbol("GRANDMOTHER"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("GET-MOTHER"))))),
	    list(RET, list(makeSymbol("FWHEN"), makeSymbol("GRANDMOTHER"), list(makeSymbol("FIM"), makeSymbol("GRANDMOTHER"), list(QUOTE, makeSymbol("FIND-FIRST")), list(QUOTE, makeSymbol("AUX-VERB-TREE-P")))))));

    protected static final SubLList $list532 = list(makeString("@return phrase-tree-p; the semantic subject of this verbal tree"),
	    list(makeSymbol("PIF"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PASSIVE-P"))),
		    list(makeSymbol("CLET"),
			    list(list(makeSymbol("PPS"), list(makeSymbol("FWHEN"), makeSymbol("MOTHER"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("FIND")), list(QUOTE, makeSymbol("PREPOSITIONAL-OR-PARTICLE-PHRASE-TREE-P"))))),
				    makeSymbol("PPHEAD"), makeSymbol("PREPOSITION")),
			    list(makeSymbol("CDOLIST"), list(makeSymbol("PP"), makeSymbol("PPS")), list(makeSymbol("CSETQ"), makeSymbol("PPHEAD"), list(makeSymbol("FIM"), makeSymbol("PP"), list(QUOTE, makeSymbol("GET-HEAD")))),
				    list(makeSymbol("CSETQ"), makeSymbol("PREPOSITION"), list(makeSymbol("FWHEN"), makeSymbol("PPHEAD"), list(makeSymbol("FIM"), makeSymbol("PPHEAD"), list(QUOTE, makeSymbol("GET-STRING"))))),
				    list(makeSymbol("PWHEN"), list(EQUAL, makeSymbol("PREPOSITION"), makeString("by")), list(RET, list(makeSymbol("FIM"), makeSymbol("PP"), list(QUOTE, makeSymbol("GET-OBLIQUE-OBJECT"))))))),
		    list(RET, list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SUBJECT"))))));

    protected static final SubLList $list536 = list(makeString("@return phrase-tree-p; the semantic direct object of this verb"),
	    list(makeSymbol("PIF"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PASSIVE-P"))),
		    list(makeSymbol("CLET"),
			    list(list(makeSymbol("LOCALS"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("FIND")), list(QUOTE, makeSymbol("NOMINAL-TREE-P")), list(makeSymbol("1+"), makeSymbol("IDX")))),
				    list(makeSymbol("N"), list(makeSymbol("LENGTH"), makeSymbol("LOCALS")))),
			    list(makeSymbol("PCOND"), list(list(makeSymbol("="), makeSymbol("N"), ONE_INTEGER), list(RET, list(makeSymbol("FIRST"), makeSymbol("LOCALS")))),
				    list(list(makeSymbol("="), makeSymbol("N"), ZERO_INTEGER), list(RET, list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SUBJECT"))))))),
		    list(RET, list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-DIRECT-OBJECT"))))));

    protected static final SubLList $list539 = list(makeString("@return phrase-tree-p; the semantic indirect object of this verb"),
	    list(makeSymbol("PIF"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PASSIVE-P"))),
		    list(makeSymbol("CLET"), list(list(makeSymbol("OBLIQUE-OBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-OBLIQUE-OBJECT"))))),
			    list(RET, list(makeSymbol("FIF"), makeSymbol("OBLIQUE-OBJECT"), makeSymbol("OBLIQUE-OBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SUBJECT")))))),
		    list(RET, list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-INDIRECT-OBJECT"))))));

    protected static final SubLList $list54 = list(makeSymbol("&OPTIONAL"), makeSymbol("KEYWORDS"));

    protected static final SubLList $list541 = list(makeString("am"), makeString("are"), makeString("is"), makeString("was"), makeString("were"), makeString("been"), makeString("had"), makeString("be"));

    protected static final SubLList $list542 = list(makeString("@return booleanp; t if this verb is the head of a passive construction, nil otherwise"),
	    list(makeSymbol("CLET"), list(list(makeSymbol("AUX"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-AUX-VERB"))))),
		    list(RET, list(makeSymbol("CAND"), makeSymbol("AUX"), list(makeSymbol("MEMBER"), list(makeSymbol("FIM"), makeSymbol("AUX"), list(QUOTE, makeSymbol("GET-STRING"))), makeSymbol("*TO-BE-FORMS*"), list(QUOTE, EQUALP))))));

    protected static final SubLList $list547 = list(makeString("@return keywordp; the tense of this verb; either :PRESENT, :PAST, :FUTURE,\n   or :INFINITIVE"), list(RET, $PAST));

    protected static final SubLList $list55 = list(list(makeSymbol("IGNORE"), makeSymbol("KEYWORDS")), list(RET, NIL));

    protected static final SubLList $list557 = list(makeString("@return keywordp; the tense of this verb; either :PRESENT, :PAST, :FUTURE,\n   or :INFINITIVE"), list(RET, makeKeyword("INFINITIVE")));

    protected static final SubLList $list561 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-AUX-VERB"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MODIFIEDS"), NIL, makeKeyword("PUBLIC")));

    protected static final SubLList $list566 = list(makeString("@return listp; a list of constituents this verb modifies"),
	    list(makeSymbol("PUNLESS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-AUX-VERB"))),
		    list(makeSymbol("CLET"),
			    list(list(makeSymbol("GRANDMOTHER"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("GET-MOTHER")))),
				    list(makeSymbol("GRANDMAS-HEAD"),
					    list(makeSymbol("FWHEN"), list(makeSymbol("CAND"), makeSymbol("GRANDMOTHER"), list(makeSymbol("NOMINAL-PHRASE-TREE-P"), makeSymbol("GRANDMOTHER"))), list(makeSymbol("FIM"), makeSymbol("GRANDMOTHER"), list(QUOTE, makeSymbol("GET-HEAD")))))),
			    list(RET, list(makeSymbol("FWHEN"), makeSymbol("GRANDMAS-HEAD"), list(makeSymbol("LIST"), makeSymbol("GRANDMAS-HEAD")))))));

    protected static final SubLList $list57 = list(list(RET, list(makeSymbol("VALUES"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SEMANTIC-COMPLEMENTS"))), NIL)));

    protected static final SubLList $list570 = list(makeSymbol("FINITE-VERBAL-WORD-TREE"), makeSymbol("AUX-VERB-WORD"));

    protected static final SubLList $list571 = list(new SubLObject[] { list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TENSE"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SEMANTIC-HEADS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SUBJECT"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DIRECT-OBJECT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-INDIRECT-OBJECT"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SEMANTIC-SUBJECT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-COMPLEMENTS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SEMANTIC-COMPLEMENTS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KEYWORD-RENAMINGS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COPULA-P"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PREPOSITIONAL-COMPLEMENT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ADVERBIAL-COMPLEMENT"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INVERTED-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PASSIVE-P"), NIL, makeKeyword("PUBLIC")) });

    protected static final SubLList $list572 = list(list(RET, list(makeSymbol("CNOT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-VERBAL-COMPLEMENT"))))));

    protected static final SubLList $list574 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("KEYWORDS"), list(QUOTE, list(makeKeyword("SUBJECT"), makeKeyword("OBJECT"), makeKeyword("COMPLEMENT")))));

    protected static final SubLList $list575 = list(
	    list(makeSymbol("CLET"),
		    list(list(makeSymbol("CONJUNCTS"), NIL), list(makeSymbol("DISJUNCTS"), NIL), list(makeSymbol("SUBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SEMANTIC-SUBJECT")))),
			    list(makeSymbol("DIRECT-OBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SEMANTIC-DIRECT-OBJECT")))),
			    list(makeSymbol("COMPLEMENT"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SEMANTIC-COMPLEMENTS")))))),
		    list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("SUBJECT"), list(makeSymbol("MEMBER"), makeKeyword("SUBJECT"), makeSymbol("KEYWORDS"), list(QUOTE, EQL))),
			    list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("SUBJECT"), makeSymbol("SUBJECT")), makeSymbol("CONJUNCTS"))),
		    list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("DIRECT-OBJECT"), list(makeSymbol("MEMBER"), makeKeyword("OBJECT"), makeSymbol("KEYWORDS"), list(QUOTE, EQL))),
			    list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("OBJECT"), makeSymbol("DIRECT-OBJECT")), makeSymbol("CONJUNCTS"))),
		    list(makeSymbol("PWHEN"),
			    list(makeSymbol("CAND"), makeSymbol("COMPLEMENT"),
				    list(makeSymbol("CAND"), list(makeSymbol("COR"), list(makeSymbol("CNOT"), makeSymbol("SUBJECT")), list(makeSymbol("CNOT"), list(EQ, makeSymbol("COMPLEMENT"), makeSymbol("SUBJECT")))),
					    list(makeSymbol("CNOT"), list(EQ, makeSymbol("COMPLEMENT"), makeSymbol("DIRECT-OBJECT")))),
				    list(makeSymbol("MEMBER"), makeKeyword("COMPLEMENT"), makeSymbol("KEYWORDS"), list(QUOTE, EQL))),
			    list(makeSymbol("CLET"), list(list(makeSymbol("COMP-CYCLS"), list(makeSymbol("FIM"), makeSymbol("COMPLEMENT"), list(QUOTE, makeSymbol("CYCLIFY-INT"))))),
				    list(makeSymbol("PUNLESS"), makeSymbol("COMP-CYCLS"), list(makeSymbol("CPUSH"), NIL, makeSymbol("COMP-CYCLS"))),
				    list(makeSymbol("CDOLIST"), list(makeSymbol("COMP-CYCL"), makeSymbol("COMP-CYCLS")), list(makeSymbol("CSETQ"), makeSymbol("COMP-CYCL"), list(makeSymbol("LIFT-CONJUNCTS"), makeSymbol("COMP-CYCL"))),
					    list(makeSymbol("CPUSH"), list(makeSymbol("CONS"), makeKeyword("COMPLEMENT"), makeSymbol("COMP-CYCL")), makeSymbol("DISJUNCTS"))))),
		    list(RET, list(makeSymbol("DISJUNCTIVE-KEYWORD-RENAMINGS"), makeSymbol("CONJUNCTS"), makeSymbol("DISJUNCTS")))));

    protected static final SubLList $list576 = list(makeKeyword("SUBJECT"), makeKeyword("OBJECT"), makeKeyword("COMPLEMENT"));

    protected static final SubLList $list579 = list(
	    list(makeSymbol("PIF"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("COPULA-P"))), list(RET, list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-COMPLEMENTS")))), list(makeSymbol("CLET"),
		    list(list(makeSymbol("COMPLEMENT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-VERBAL-COMPLEMENT"))))), list(RET, list(makeSymbol("FWHEN"), makeSymbol("COMPLEMENT"), list(makeSymbol("LIST"), makeSymbol("COMPLEMENT")))))));

    protected static final SubLList $list581 = list(list(makeSymbol("CLET"),
	    list(list(makeSymbol("COMPLEMENTS"), NIL), list(makeSymbol("SUBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SEMANTIC-SUBJECT")))),
		    list(makeSymbol("OBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SEMANTIC-DIRECT-OBJECT")))),
		    list(makeSymbol("VERBAL-COMPLEMENT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-VERBAL-COMPLEMENT")))),
		    list(makeSymbol("PREP-COMPLEMENT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-PREPOSITIONAL-COMPLEMENT")))),
		    list(makeSymbol("ADJ-COMPLEMENT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-ADJECTIVAL-COMPLEMENT")))),
		    list(makeSymbol("ADV-COMPLEMENT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-ADVERBIAL-COMPLEMENT"))))),
	    list(makeSymbol("CDOLIST"), list(makeSymbol("COMPLEMENT"), list(makeSymbol("LIST"), makeSymbol("ADV-COMPLEMENT"), makeSymbol("ADJ-COMPLEMENT"), makeSymbol("PREP-COMPLEMENT"), makeSymbol("VERBAL-COMPLEMENT"), makeSymbol("OBJECT"), makeSymbol("SUBJECT"))),
		    list(makeSymbol("PWHEN"), makeSymbol("COMPLEMENT"), list(makeSymbol("CPUSH"), makeSymbol("COMPLEMENT"), makeSymbol("COMPLEMENTS")))),
	    list(RET, makeSymbol("COMPLEMENTS"))));

    protected static final SubLList $list585 = list(list(makeSymbol("CLET"), list(list(makeSymbol("MAIN-VERB"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-VERBAL-COMPLEMENT"))))),
	    list(RET, list(makeSymbol("FIF"), makeSymbol("MAIN-VERB"), list(makeSymbol("FIM"), makeSymbol("MAIN-VERB"), list(QUOTE, makeSymbol("GET-SEMANTIC-HEADS"))), list(makeSymbol("LIST"), makeSymbol("SELF"))))));

    protected static final SubLList $list587 = list(list(RET, list(makeSymbol("FCOND"),
	    list(list(makeSymbol("MEMBER"), list(makeSymbol("GET-STRING"), makeSymbol("SELF")), list(QUOTE, list(makeString("is"), makeString("am"), makeString("are"), makeString("have"), makeString("has"), makeString("do"), makeString("does"))), list(QUOTE, EQUALP)),
		    makeKeyword("PRESENT")),
	    list(list(makeSymbol("MEMBER"), list(makeSymbol("GET-STRING"), makeSymbol("SELF")), list(QUOTE, list(makeString("was"), makeString("were"), makeString("had"), makeString("did"))), list(QUOTE, EQUALP)), $PAST),
	    list(list(makeSymbol("MEMBER"), list(makeSymbol("GET-STRING"), makeSymbol("SELF")), list(QUOTE, list(makeString("be"), makeString("do"), makeString("have"))), list(QUOTE, EQUALP)), makeKeyword("INFINITIVE")))));

    protected static final SubLList $list588 = list(makeString("is"), makeString("am"), makeString("are"), makeString("have"), makeString("has"), makeString("do"), makeString("does"));

    protected static final SubLList $list589 = list(makeString("was"), makeString("were"), makeString("had"), makeString("did"));

    protected static final SubLList $list590 = list(makeString("be"), makeString("do"), makeString("have"));

    protected static final SubLList $list594 = list(makeString("@return prepositional-or-particle-tree-p; the prepositional complement of this aux verb"),
	    list(makeSymbol("CLET"), list(list(makeSymbol("PP"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("FIND-FIRST")), list(QUOTE, makeSymbol("PREPOSITIONAL-OR-PARTICLE-PHRASE-TREE-P"))))),
		    list(RET, list(makeSymbol("FWHEN"), makeSymbol("PP"), makeSymbol("PP")))));

    protected static final SubLList $list597 = list(makeString("@return adverbial-word-tree-p; the adverbial complement of this aux verb"), list(RET, NIL));

    protected static final SubLList $list599 = list(makeString("@return phrase-tree-p; the subject of this verb"),
	    list(makeSymbol("CLET"), list(makeSymbol("SUBJECT")),
		    list(makeSymbol("PIF"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("INVERTED-P"))),
			    list(makeSymbol("CSETQ"), makeSymbol("SUBJECT"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("FIND-FIRST")), list(QUOTE, makeSymbol("NOMINAL-TREE-P")), list(makeSymbol("1+"), makeSymbol("IDX")))),
			    list(makeSymbol("CSETQ"), makeSymbol("SUBJECT"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("FIND-LAST")), list(QUOTE, makeSymbol("NOMINAL-TREE-P")), list(makeSymbol("1-"), makeSymbol("IDX"))))),
		    list(RET, list(makeSymbol("FIF"), makeSymbol("SUBJECT"), makeSymbol("SUBJECT"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("GET-SUBJECT")))))));

    protected static final SubLList $list60 = list(makeKeyword("PUBLIC"));

    protected static final SubLList $list602 = list(makeString("@return listp; the list of objects of this aux verb, which is the list of objects\n   of its main verb"),
	    list(RET,
		    list(makeSymbol("FIF"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("INVERTED-P"))),
			    list(makeSymbol("SECOND"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("FIND")), list(QUOTE, makeSymbol("NOMINAL-TREE-P")), list(makeSymbol("1+"), makeSymbol("IDX")))),
			    list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("FIND-FIRST")), list(QUOTE, makeSymbol("NOMINAL-TREE-P")), list(makeSymbol("1+"), makeSymbol("IDX"))))));

    protected static final SubLList $list605 = list(makeString("@return listp; the list of objects of this aux verb, which is the list of objects\n   of its main verb"),
	    list(makeSymbol("CLET"),
		    list(list(makeSymbol("VERBAL-COMPLEMENT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-VERBAL-COMPLEMENT")))),
			    list(makeSymbol("MAIN-VERB"), list(makeSymbol("FWHEN"), makeSymbol("VERBAL-COMPLEMENT"), list(makeSymbol("FIM"), makeSymbol("VERBAL-COMPLEMENT"), list(QUOTE, makeSymbol("GET-HEAD")))))),
		    list(RET, list(makeSymbol("FWHEN"), makeSymbol("MAIN-VERB"), list(makeSymbol("FIM"), makeSymbol("MAIN-VERB"), list(QUOTE, makeSymbol("GET-INDIRECT-OBJECT")))))));

    protected static final SubLList $list607 = list(makeString("@return phrase-tree-p; the semantic subject of this aux tree"), list(makeSymbol("CLET"), list(list(makeSymbol("SISTER"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SISTER")), ONE_INTEGER))),
	    list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("SISTER"), list(makeSymbol("NOMINAL-TREE-P"), makeSymbol("SISTER"))), list(RET, list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SUBJECT")))))));

    protected static final SubLList $list609 = list(makeString("@return booleanp; t if this verb is inverted, nil otherwise"),
	    list(makeSymbol("CLET"), list(list(makeSymbol("MATRIX"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-MATRIX-CLAUSE"))))),
		    list(RET, list(makeSymbol("CAND"), makeSymbol("MATRIX"), list(makeSymbol("COR"),
			    list(makeSymbol("CAND"), list(makeSymbol("QUESTION-TREE-P"), makeSymbol("MATRIX")), list(makeSymbol("CNOT"), list(makeSymbol("VERBAL-PHRASE-TREE-P"), list(makeSymbol("FIM"), makeSymbol("MATRIX"), list(QUOTE, makeSymbol("GET-DAUGHTER")), ZERO_INTEGER)))),
			    list(makeSymbol("SINV-TREE-P"), makeSymbol("MATRIX")))))));

    protected static final SubLList $list61 = list(list(RET, list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-COMPLEMENTS")))));

    protected static final SubLList $list611 = list(makeString("@return booleanp; t if this verb is the head of a passive construction, nil otherwise"),
	    list(makeSymbol("CLET"), list(list(makeSymbol("MAIN"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-VERBAL-COMPLEMENT"))))),
		    list(RET, list(makeSymbol("FWHEN"), makeSymbol("MAIN"), list(makeSymbol("FIM"), makeSymbol("MAIN"), list(QUOTE, makeSymbol("PASSIVE-P")))))));

    protected static final SubLList $list614 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TENSE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-OBJECTS"), NIL, makeKeyword("PUBLIC")));

    protected static final SubLList $list617 = list(makeString("@return keywordp; the tense of this modal; either :PRESENT, :PAST, :FUTURE,\n   or :INFINITIVE\n   @hack \'could\' can be :PRESENT or :PAST; maybe return a disjunctive list of tenses?"),
	    list(RET, list(makeSymbol("FIF"), list(EQUALP, makeSymbol("STRING"), makeString("will")), makeKeyword("FUTURE"), makeKeyword("PRESENT"))));

    protected static final SubLList $list622 = list(makeString("@return listp; the list of objects of this modal"), list(RET, NIL));

    protected static final SubLList $list625 = list(makeSymbol("ADJECTIVAL-TREE"), makeSymbol("ADJECTIVAL-WORD"));

    protected static final SubLList $list626 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MODIFIEDS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-VERBAL-COMPLEMENT"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-COMPLEMENTS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KEYWORD-RENAMINGS"), list(makeSymbol("&OPTIONAL"), makeSymbol("KEYWORDS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")));

    protected static final SubLList $list627 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("KEYWORDS"), list(QUOTE, list($NOUN, makeKeyword("ACTION"), makeKeyword("REPLACE"), makeKeyword("OBLIQUE-OBJECT")))));

    protected static final SubLList $list628 = list(list(makeSymbol("CLET"),
	    list(list(makeSymbol("CONJUNCTS"), NIL), list(makeSymbol("MODIFIED"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-MODIFIEDS"))))),
		    list(makeSymbol("OBL-OBJ"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-OBLIQUE-OBJECT")))),
		    list(makeSymbol("OBL-OBJ-HEAD"), list(makeSymbol("FWHEN"), makeSymbol("OBL-OBJ"), list(makeSymbol("FIM"), makeSymbol("OBL-OBJ"), list(QUOTE, makeSymbol("GET-HEAD")))))),
	    list(makeSymbol("PWHEN"), makeSymbol("MODIFIED"),
		    list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER?"), $NOUN, makeSymbol("KEYWORDS"), list(QUOTE, EQL)), list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), $NOUN, makeSymbol("MODIFIED")), makeSymbol("CONJUNCTS"))),
		    list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER?"), makeKeyword("ACTION"), makeSymbol("KEYWORDS"), list(QUOTE, EQL)),
			    list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("ACTION"), makeSymbol("MODIFIED")), makeSymbol("CONJUNCTS"))),
		    list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER?"), makeKeyword("REPLACE"), makeSymbol("KEYWORDS"), list(QUOTE, EQL)), list(makeSymbol("CPUSH"), list(makeSymbol("LIST"), list(makeSymbol("CONS"), makeKeyword("REPLACE"), NIL)), makeSymbol("CONJUNCTS")))),
	    list(makeSymbol("PWHEN"), makeSymbol("OBL-OBJ-HEAD"), list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER?"), makeKeyword("OBLIQUE-OBJECT"), makeSymbol("KEYWORDS"), list(QUOTE, EQL)),
		    list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("PREP-OBJECT"), makeSymbol("OBL-OBJ-HEAD")), makeSymbol("CONJUNCTS")))),
	    list(RET, list(makeSymbol("DISJUNCTIVE-KEYWORD-RENAMINGS"), makeSymbol("CONJUNCTS"), NIL))));

    protected static final SubLList $list629 = list($NOUN, makeKeyword("ACTION"), makeKeyword("REPLACE"), makeKeyword("OBLIQUE-OBJECT"));

    protected static final SubLList $list631 = list(list(makeSymbol("CLET"),
	    list(list(makeSymbol("MODIFIEDS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-MODIFIEDS")))), list(makeSymbol("OBL-OBJ"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-OBLIQUE-OBJECT"))))),
	    list(RET, list(makeSymbol("APPEND"), makeSymbol("MODIFIEDS"), list(makeSymbol("FWHEN"), makeSymbol("OBL-OBJ"), list(makeSymbol("LIST"), makeSymbol("OBL-OBJ")))))));

    protected static final SubLList $list635 = list(makeString("@return listp; a list of phrases modified by this adjective"),
	    list(makeSymbol("CLET"),
		    list(list(makeSymbol("HEAD"), list(makeSymbol("FIM"), makeSymbol("MOTHER"),
			    list(QUOTE, makeSymbol("GET-HEAD-DAUGHTER")))), list(makeSymbol("COMPLEMENT"),
				    list(makeSymbol("FWHEN"), list(makeSymbol("NOMINAL-TREE-P"), makeSymbol("HEAD")), makeSymbol("HEAD")))),
		    list(makeSymbol("PUNLESS"), makeSymbol("COMPLEMENT"),
			    list(makeSymbol("PWHEN"), list(makeSymbol("NOMINAL-TREE-P"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("GET-SISTER")), ONE_INTEGER)),
				    list(makeSymbol("CSETQ"), makeSymbol("COMPLEMENT"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("GET-SISTER")), ONE_INTEGER)))),
		    list(makeSymbol("PUNLESS"), makeSymbol("COMPLEMENT"),
			    list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("MOTHER"), list(makeSymbol("AUX-VERB-TREE-P"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("GET-SISTER")), MINUS_ONE_INTEGER))),
				    list(makeSymbol("CLET"),
					    list(list(makeSymbol("SUBJECT"), list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("GET-SISTER")), MINUS_ONE_INTEGER), list(QUOTE, makeSymbol("GET-SUBJECT")))),
						    list(makeSymbol("HEAD"), list(makeSymbol("FWHEN"), makeSymbol("SUBJECT"), list(makeSymbol("FIM"), makeSymbol("SUBJECT"), list(QUOTE, makeSymbol("GET-HEAD")))))),
					    list(makeSymbol("PWHEN"), makeSymbol("HEAD"), list(makeSymbol("CSETQ"), makeSymbol("COMPLEMENT"), makeSymbol("HEAD")))))),
		    list(makeSymbol("PUNLESS"), makeSymbol("COMPLEMENT"),
			    list(makeSymbol("CLET"),
				    list(list(makeSymbol("GRANDMOTHER"), list(makeSymbol("FWHEN"), makeSymbol("MOTHER"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("GET-MOTHER"))))),
					    list(makeSymbol("MODIFIED"), list(makeSymbol("FWHEN"), makeSymbol("GRANDMOTHER"), list(makeSymbol("FIM"), makeSymbol("GRANDMOTHER"), list(QUOTE, makeSymbol("FIND-FIRST")), list(QUOTE, makeSymbol("NOMINAL-TREE-P"))))),
					    list(makeSymbol("MOD-HEAD"), list(makeSymbol("FWHEN"), makeSymbol("MODIFIED"), list(makeSymbol("FIM"), makeSymbol("MODIFIED"), list(QUOTE, makeSymbol("GET-HEAD")))))),
				    list(makeSymbol("PWHEN"), makeSymbol("MOD-HEAD"), list(makeSymbol("CSETQ"), makeSymbol("COMPLEMENT"), makeSymbol("MOD-HEAD"))))),
		    list(RET, list(makeSymbol("FWHEN"), makeSymbol("COMPLEMENT"), list(makeSymbol("LIST"), makeSymbol("COMPLEMENT"))))));

    protected static final SubLList $list639 = list(makeString("@return verbal-tree-p; the verbal complement of this adjective"),
	    list(RET, list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("FIND-FIRST")), list(QUOTE, makeSymbol("SBAR-TREE-P")))));

    protected static final SubLList $list644 = list(makeSymbol("ADVERBIAL-TREE"), makeSymbol("ADVERBIAL-WORD"));

    protected static final SubLList $list645 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MODIFIEDS"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KEYWORD-RENAMINGS"), list(makeSymbol("&OPTIONAL"), makeSymbol("KEYWORDS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")));

    protected static final SubLList $list646 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("KEYWORDS"), list(QUOTE, list(makeKeyword("ACTION"), makeKeyword("SUBJECT"), makeKeyword("OBJECT")))));

    protected static final SubLList $list647 = list(list(makeSymbol("CLET"),
	    list(list(makeSymbol("CONJUNCTS"), NIL), list(makeSymbol("MODIFIED"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-MODIFIEDS"))))),
		    list(makeSymbol("SUBJECT"), list(makeSymbol("FWHEN"), list(makeSymbol("VERBAL-WORD-P"), makeSymbol("MODIFIED")), list(makeSymbol("FIM"), makeSymbol("MODIFIED"), list(QUOTE, makeSymbol("GET-SUBJECT"))))),
		    list(makeSymbol("OBJECT"), list(makeSymbol("FWHEN"), list(makeSymbol("VERBAL-WORD-P"), makeSymbol("MODIFIED")), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("MODIFIED"), list(QUOTE, makeSymbol("GET-OBJECTS"))))))),
	    list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("MODIFIED"), list(makeSymbol("MEMBER"), makeKeyword("ACTION"), makeSymbol("KEYWORDS"), list(QUOTE, EQL))),
		    list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("ACTION"), makeSymbol("MODIFIED")), makeSymbol("CONJUNCTS"))),
	    list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("SUBJECT"), list(makeSymbol("MEMBER"), makeKeyword("SUBJECT"), makeSymbol("KEYWORDS"), list(QUOTE, EQL))),
		    list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("SUBJECT"), makeSymbol("SUBJECT")), makeSymbol("CONJUNCTS"))),
	    list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("OBJECT"), list(makeSymbol("MEMBER"), makeKeyword("OBJECT"), makeSymbol("KEYWORDS"), list(QUOTE, EQL))),
		    list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("OBJECT"), makeSymbol("OBJECT")), makeSymbol("CONJUNCTS"))),
	    list(RET, list(makeSymbol("DISJUNCTIVE-KEYWORD-RENAMINGS"), makeSymbol("CONJUNCTS"), NIL))));

    protected static final SubLList $list648 = list(makeKeyword("ACTION"), makeKeyword("SUBJECT"), makeKeyword("OBJECT"));

    protected static final SubLList $list65 = list(list(makeSymbol("CLET"), list(list(makeSymbol("PP"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-PP-COMPLEMENT")))),
	    list(makeSymbol("OBL-OBJ"), list(makeSymbol("FWHEN"), makeSymbol("PP"), list(makeSymbol("FIM"), makeSymbol("PP"), list(QUOTE, makeSymbol("GET-OBLIQUE-OBJECT")))))), list(RET, makeSymbol("OBL-OBJ"))));

    protected static final SubLList $list652 = list(makeString("@return listp; a list of phrases modified by this adverb"),
	    list(makeSymbol("CLET"), list(list(makeSymbol("SISTER"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SISTER")), ONE_INTEGER))),
		    list(makeSymbol("PWHEN"),
			    list(makeSymbol("COR"), list(makeSymbol("ADJECTIVAL-WORD-TREE-P"), makeSymbol("SISTER")), list(makeSymbol("ADVERBIAL-WORD-TREE-P"), makeSymbol("SISTER")), list(makeSymbol("PREPOSITIONAL-OR-PARTICLE-WORD-TREE-P"), makeSymbol("SISTER")),
				    list(makeSymbol("NUMERICAL-TREE-P"), makeSymbol("SISTER"))),
			    list(RET, list(makeSymbol("LIST"), makeSymbol("SISTER"))))),
	    list(makeSymbol("CDOLIST"), list(makeSymbol("ANCESTOR"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-ANCESTORS")))),
		    list(makeSymbol("PWHEN"), list(makeSymbol("VERBAL-PHRASE-TREE-P"), makeSymbol("ANCESTOR")), list(RET, list(makeSymbol("FIM"), makeSymbol("ANCESTOR"), list(QUOTE, makeSymbol("GET-SEMANTIC-HEADS")))))));

    protected static final SubLList $list655 = list(makeSymbol("WH-TREE"));

    protected static final SubLList $list659 = list(makeSymbol("PREPOSITIONAL-OR-PARTICLE-WORD"));

    protected static final SubLList $list660 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-OBLIQUE-OBJECT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-VERBAL-COMPLEMENT"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-COMPLEMENTS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MODIFIEDS"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-REFS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ANTECEDENT"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KEYWORD-RENAMINGS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LOGICAL-FORM-INT"), NIL, makeKeyword("PROTECTED")));

    protected static final SubLList $list661 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("KEYWORDS"), list(QUOTE, list($NOUN, makeKeyword("ACTION"), makeKeyword("OBJECT"), makeKeyword("CLAUSE")))));

    protected static final SubLList $list662 = list(list(makeSymbol("PUNLESS"), list(EQUALP, list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-STRING"))), makeString("that")),
	    list(makeSymbol("CLET"), list(list(makeSymbol("CONJUNCTS"), NIL), list(makeSymbol("MODIFIED"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-MODIFIEDS"))))),
		    list(makeSymbol("COMPLEMENT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-OBLIQUE-OBJECT")))), list(makeSymbol("CLAUSE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-VERBAL-COMPLEMENT"))))),
		    list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("MODIFIED"), list(makeSymbol("MEMBER"), $NOUN, makeSymbol("KEYWORDS"), list(QUOTE, EQL)), list(makeSymbol("NOMINAL-WORD-P"), makeSymbol("MODIFIED"))),
			    list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), $NOUN, makeSymbol("MODIFIED")), makeSymbol("CONJUNCTS"))),
		    list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("MODIFIED"), list(makeSymbol("MEMBER"), makeKeyword("ACTION"), makeSymbol("KEYWORDS"), list(QUOTE, EQL)), list(makeSymbol("VERBAL-WORD-P"), makeSymbol("MODIFIED"))),
			    list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("ACTION"), makeSymbol("MODIFIED")), makeSymbol("CONJUNCTS"))),
		    list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("COMPLEMENT"), list(makeSymbol("MEMBER"), makeKeyword("OBJECT"), makeSymbol("KEYWORDS"), list(QUOTE, EQL))),
			    list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("OBJECT"), makeSymbol("COMPLEMENT")), makeSymbol("CONJUNCTS"))),
		    list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("CLAUSE"), list(makeSymbol("MEMBER"), makeKeyword("CLAUSE"), makeSymbol("KEYWORDS"), list(QUOTE, EQL))),
			    list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("CLAUSE"), makeSymbol("CLAUSE")), makeSymbol("CONJUNCTS"))),
		    list(RET, list(makeSymbol("DISJUNCTIVE-KEYWORD-RENAMINGS"), makeSymbol("CONJUNCTS"), NIL)))));

    protected static final SubLList $list663 = list($NOUN, makeKeyword("ACTION"), makeKeyword("OBJECT"), makeKeyword("CLAUSE"));

    protected static final SubLList $list667 = list(makeString("@return nominal-tree-p; the singleton lists of complements of this preposition"),
	    list(makeSymbol("CLET"), list(list(makeSymbol("SISTER"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SISTER")), ONE_INTEGER))),
		    list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("SISTER"), list(makeSymbol("COR"), list(makeSymbol("NOMINAL-TREE-P"), makeSymbol("SISTER")), list(makeSymbol("SENTENTIAL-TREE-P"), makeSymbol("SISTER")))), list(RET, makeSymbol("SISTER")))),
	    list(makeSymbol("CDOLIST"), list(makeSymbol("ANCESTOR"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-ANCESTORS")))),
		    list(makeSymbol("PWHEN"),
			    list(makeSymbol("CAND"), list(makeSymbol("COR"), list(makeSymbol("SBAR-TREE-P"), makeSymbol("ANCESTOR")), list(makeSymbol("SBARQ-TREE-P"), makeSymbol("ANCESTOR"))),
				    list(makeSymbol("WHNP-TREE-P"), list(makeSymbol("FIM"), makeSymbol("ANCESTOR"), list(QUOTE, makeSymbol("GET-DAUGHTER")), ZERO_INTEGER))),
			    list(RET, list(makeSymbol("FIM"), makeSymbol("ANCESTOR"), list(QUOTE, makeSymbol("GET-DAUGHTER")), ZERO_INTEGER)))));

    protected static final SubLList $list669 = list(makeString("@return verbal-tree-p; the verbal complement of this preposition or particle"),
	    list(RET, list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("FIND-FIRST")), list(QUOTE, makeSymbol("VERBAL-TREE-P")), list(makeSymbol("1+"), makeSymbol("IDX")))));

    protected static final SubLList $list67 = list(list(makeSymbol("CDOLIST"), list(makeSymbol("PP"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-PPS")))), list(makeSymbol("CLET"),
	    list(list(makeSymbol("PP-HEAD"), list(makeSymbol("FWHEN"), makeSymbol("PP"), list(makeSymbol("FIM"), makeSymbol("PP"), list(QUOTE, makeSymbol("GET-HEAD"))))),
		    list(makeSymbol("PP-HEAD-STRING"), list(makeSymbol("FWHEN"), makeSymbol("PP-HEAD"), list(makeSymbol("FIM"), makeSymbol("PP-HEAD"), list(QUOTE, makeSymbol("GET-STRING")))))),
	    list(makeSymbol("PWHEN"), makeSymbol("PP-HEAD-STRING"), list(makeSymbol("CDOLIST"), list(makeSymbol("RLE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-RANKED-LEXES")))), list(makeSymbol("CLET"),
		    list(list(makeSymbol("CYCL"), list(makeSymbol("FIM"), list(makeSymbol("RLE-LEX"), makeSymbol("RLE")), list(QUOTE, makeSymbol("GET")), makeKeyword("SEMTRANS"))), list(makeSymbol("KEYWORDS"), list(makeSymbol("FORMULA-KEYWORDS"), makeSymbol("CYCL"))),
			    list(makeSymbol("FRAME"), list(makeSymbol("FIM"), list(makeSymbol("RLE-LEX"), makeSymbol("RLE")), list(QUOTE, makeSymbol("GET")), makeKeyword("FRAME")))),
		    list(makeSymbol("PCOND"), list(
			    list(makeSymbol("CAND"), list(makeSymbol("MEMBER?"), makeKeyword("OBLIQUE-OBJECT"), makeSymbol("KEYWORDS"), list(QUOTE, EQL)), list(makeSymbol("FORMULA-ARG2"), makeSymbol("FRAME")),
				    list(makeSymbol("ISA?"), makeSymbol("FRAME"), reader_make_constant_shell("PPCompFrame"), reader_make_constant_shell("EverythingPSC"))),
			    list(makeSymbol("CLET"),
				    list(list(makeSymbol("PREPOSITION"), list(makeSymbol("FORMULA-ARG2"), makeSymbol("FRAME"))), list(makeSymbol("PREP-STRING"), list(makeSymbol("FIRST"), list(makeSymbol("GET-STRINGS-OF-TYPE"), makeSymbol("PREPOSITION"), reader_make_constant_shell("Preposition"))))),
				    list(makeSymbol("PWHEN"), list(EQUALP, makeSymbol("PREP-STRING"), makeSymbol("PP-HEAD-STRING")), list(RET, makeSymbol("PP"))))),
			    list(list(makeSymbol("CAND"), list(makeSymbol("INTERSECTION"), list(QUOTE, list(makeKeyword("POSSESSOR"), makeKeyword("POSS-COL"))), makeSymbol("KEYWORDS"), list(QUOTE, EQL)), list(EQUALP, makeString("of"), makeSymbol("PP-HEAD-STRING"))),
				    list(RET, makeSymbol("PP"))))))))));

    protected static final SubLList $list673 = list(makeString("@return nominal-tree-p; the complements of this preposition"),
	    list(makeSymbol("CLET"),
		    list(list(makeSymbol("MODIFIEDS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-MODIFIEDS")))), list(makeSymbol("SISTER"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SISTER")), ONE_INTEGER))),
		    list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("SISTER"), list(makeSymbol("COR"), list(makeSymbol("NOMINAL-TREE-P"), makeSymbol("SISTER")), list(makeSymbol("SENTENTIAL-TREE-P"), makeSymbol("SISTER")))),
			    list(RET, list(makeSymbol("APPEND"), makeSymbol("MODIFIEDS"), list(makeSymbol("LIST"), makeSymbol("SISTER"))))),
		    list(makeSymbol("CDOLIST"), list(makeSymbol("ANCESTOR"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-ANCESTORS")))),
			    list(makeSymbol("PWHEN"),
				    list(makeSymbol("CAND"), list(makeSymbol("COR"), list(makeSymbol("SBAR-TREE-P"), makeSymbol("ANCESTOR")), list(makeSymbol("SBARQ-TREE-P"), makeSymbol("ANCESTOR"))),
					    list(makeSymbol("WHNP-TREE-P"), list(makeSymbol("FIM"), makeSymbol("ANCESTOR"), list(QUOTE, makeSymbol("GET-DAUGHTER")), ZERO_INTEGER))),
				    list(RET, list(makeSymbol("APPEND"), makeSymbol("MODIFIEDS"), list(makeSymbol("LIST"), list(makeSymbol("FIM"), makeSymbol("ANCESTOR"), list(QUOTE, makeSymbol("GET-DAUGHTER")), ZERO_INTEGER))))))));

    protected static final SubLList $list675 = list(makeString("@return listp; a list of trees this preposition modifies"),
	    list(makeSymbol("CLET"),
		    list(list(makeSymbol("COMPLEMENTS"), NIL), list(makeSymbol("CANDIDATES"), NIL), list(makeSymbol("GRANDMOTHER"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("GET-MOTHER")))),
			    list(makeSymbol("GRANDMOTHER-HEAD"), list(makeSymbol("FWHEN"), makeSymbol("GRANDMOTHER"),
				    list(makeSymbol("FIM"), makeSymbol("GRANDMOTHER"), list(QUOTE, makeSymbol("GET-HEAD"))))),
			    list(makeSymbol("SISTER"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("GET-SISTER")), ONE_INTEGER))),
		    list(makeSymbol("PIF"), list(makeSymbol("CAND"), list(makeSymbol("WHPP-TREE-P"), makeSymbol("MOTHER")), list(makeSymbol("QUESTION-TREE-P"), makeSymbol("GRANDMOTHER")), makeSymbol("SISTER"), list(makeSymbol("SQ-TREE-P"), makeSymbol("SISTER"))),
			    list(makeSymbol("CLET"), list(list(makeSymbol("LAST-PHRASE"), list(makeSymbol("FIM"), makeSymbol("SISTER"), list(QUOTE, makeSymbol("FIND-LAST")), list(QUOTE, makeSymbol("PHRASE-TREE-P"))))),
				    list(makeSymbol("PWHEN"), makeSymbol("LAST-PHRASE"), list(makeSymbol("CSETQ"), makeSymbol("CANDIDATES"), list(makeSymbol("FIM"), makeSymbol("LAST-PHRASE"), list(QUOTE, makeSymbol("GET-HEADS")))))),
			    list(makeSymbol("PWHEN"), makeSymbol("GRANDMOTHER-HEAD"),
				    list(makeSymbol("CSETQ"), makeSymbol("CANDIDATES"),
					    list(makeSymbol("FCOND"),
						    list(list(makeSymbol("CAND"), list(makeSymbol("AUX-VERB-TREE-P"), makeSymbol("GRANDMOTHER-HEAD")), list(makeSymbol("FIM"), makeSymbol("GRANDMOTHER-HEAD"), list(QUOTE, makeSymbol("GET-SUBJECT"))),
							    list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("GRANDMOTHER-HEAD"), list(QUOTE, makeSymbol("GET-SUBJECT"))), list(QUOTE, makeSymbol("GET-HEAD")))),
							    list(makeSymbol("LIST"), list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("GRANDMOTHER-HEAD"), list(QUOTE, makeSymbol("GET-SUBJECT"))), list(QUOTE, makeSymbol("GET-HEAD"))))),
						    list(list(makeSymbol("ADJECTIVAL-WORD-TREE-P"), makeSymbol("GRANDMOTHER-HEAD")), NIL), list(list(EQ, makeSymbol("GRANDMOTHER-HEAD"), makeSymbol("SELF")), NIL), list(T, list(makeSymbol("LIST"), makeSymbol("GRANDMOTHER-HEAD"))))))),
		    list(makeSymbol("CDOLIST"), list(makeSymbol("CANDIDATE"), makeSymbol("CANDIDATES")),
			    list(makeSymbol("CDOLIST"), list(makeSymbol("COMPLEMENT"), list(makeSymbol("FIM"), makeSymbol("CANDIDATE"), list(QUOTE, makeSymbol("GET-COMPLEMENTS")))),
				    list(makeSymbol("PWHEN"), list(EQ, makeSymbol("COMPLEMENT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-OBLIQUE-OBJECT")))), list(makeSymbol("CPUSH"), makeSymbol("CANDIDATE"), makeSymbol("COMPLEMENTS"))))),
		    list(RET, list(makeSymbol("SET-DIFFERENCE"), makeSymbol("CANDIDATES"), makeSymbol("COMPLEMENTS")))));

    protected static final SubLList $list679 = list(makeString("@return listp; the unique referents of this word"), list(makeSymbol("CLET"), list(list(makeSymbol("COMP-REFS"), NIL)),
	    list(makeSymbol("PWHEN"), list(EQUALP, makeSymbol("STRING"), makeString("of")), list(makeSymbol("CDOLIST"),
		    list(makeSymbol("REF"), list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-OBLIQUE-OBJECT"))), list(QUOTE, makeSymbol("GET-REFS")))), list(makeSymbol("CPUSH"), makeSymbol("REF"), makeSymbol("COMP-REFS"))),
		    list(makeSymbol("SET-WORD-TREE-REFS"), makeSymbol("SELF"), makeSymbol("COMP-REFS")))),
	    list(RET, list(makeSymbol("GET-WORD-TREE-REFS"), makeSymbol("SELF"))));

    protected static final SubLList $list682 = list(makeString("@return parse-tree-p; the tree that serves as an antecedent to this wh word"),
	    list(makeSymbol("PWHEN"), list(EQUALP, makeSymbol("STRING"), makeString("that")),
		    list(makeSymbol("CLET"), list(list(makeSymbol("GRANDMOTHER"), list(makeSymbol("FWHEN"), makeSymbol("MOTHER"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("GET-MOTHER")))))),
			    list(makeSymbol("PWHEN"), list(makeSymbol("NP-TREE-P"), makeSymbol("GRANDMOTHER")), list(RET, list(makeSymbol("FIM"), makeSymbol("GRANDMOTHER"), list(QUOTE, makeSymbol("GET-HEAD"))))))));

    protected static final SubLList $list686 = list(makeSymbol("PREPOSITIONAL-TREE"));

    protected static final SubLList $list69 = list(makeKeyword("POSSESSOR"), makeKeyword("POSS-COL"));

    protected static final SubLList $list690 = list(makeSymbol("PARTICLE-TREE"));

    protected static final SubLList $list694 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SPECIFIED"), NIL, makeKeyword("PUBLIC")));

    protected static final SubLList $list698 = list(makeString("@return parse-tree-p; the tree that this specifier specifies"), list(RET, list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("GET-HEAD")))));

    protected static final SubLList $list702 = list(makeSymbol("QUANTIFIER-TREE"), makeSymbol("QUANTIFIER-WORD"));

    protected static final SubLList $list703 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-QUANTIFIED"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SPECIFIED"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KEYWORD-RENAMINGS"), list(makeSymbol("&OPTIONAL"), makeSymbol("KEYWORDS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")));

    protected static final SubLList $list704 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("KEYWORDS"), list(QUOTE, list($NOUN, makeKeyword("RESTR"), makeKeyword("SCOPE")))));

    protected static final SubLList $list705 = list(list(makeSymbol("CLET"), list(list(makeSymbol("CONJUNCTS"), NIL), list(makeSymbol("DISJUNCTS"), NIL)),
	    list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER?"), $NOUN, makeSymbol("KEYWORDS"), list(QUOTE, EQL)), list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), $NOUN, makeSymbol("SELF")), makeSymbol("CONJUNCTS"))),
	    list(RET, list(makeSymbol("DISJUNCTIVE-KEYWORD-RENAMINGS"), makeSymbol("CONJUNCTS"), makeSymbol("DISJUNCTS")))));

    protected static final SubLList $list706 = list($NOUN, makeKeyword("RESTR"), makeKeyword("SCOPE"));

    protected static final SubLList $list711 = list(makeString("@return word-tree; the word that restricts the variable that this determiner quantifies"),
	    list(makeSymbol("PCOND"), list(list(makeSymbol("NOMINAL-PHRASE-TREE-P"), makeSymbol("MOTHER")), list(RET, list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("GET-HEAD"))))),
		    list(list(makeSymbol("WHADJP-TREE-P"), makeSymbol("MOTHER")), list(makeSymbol("CLET"), list(list(makeSymbol("GRANDMOTHER"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("GET-MOTHER"))))),
			    list(makeSymbol("PWHEN"), makeSymbol("GRANDMOTHER"), list(RET, list(makeSymbol("FIM"), makeSymbol("GRANDMOTHER"), list(QUOTE, makeSymbol("GET-HEAD")))))))));

    protected static final SubLList $list714 = list(makeString("@return word-tree; the word that this specifier specifies"), list(RET, list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-QUANTIFIED")))));

    protected static final SubLList $list722 = list(makeString("my"), makeString("your"), makeString("his"), makeString("her"), makeString("its"));

    protected static final SubLList $list723 = list(makeString("our"), makeString("your"), makeString("their"));

    protected static final SubLList $list724 = list(makeString("@return listp; a list of numbers of this possessive pronoun with possible number values\n   :SINGULAR and :PLURAL"),
	    list(makeSymbol("CLET"), list(list(makeSymbol("NUMBERS"), NIL)),
		    list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER?"), makeSymbol("STRING"), makeSymbol("*SINGULAR-POSSESSIVE-PRONOUNS*"), list(QUOTE, EQUALP)), list(makeSymbol("CPUSH"), makeKeyword("SINGULAR"), makeSymbol("NUMBERS"))),
		    list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER?"), makeSymbol("STRING"), makeSymbol("*PLURAL-POSSESSIVE-PRONOUNS*"), list(QUOTE, EQUALP)), list(makeSymbol("CPUSH"), makeKeyword("PLURAL"), makeSymbol("NUMBERS"))), list(RET, makeSymbol("NUMBERS"))));

    protected static final SubLList $list727 = list(makeString("@return numberp; the person of this noun; 1, 2, or 3"), list(RET,
	    list(makeSymbol("FCOND"), list(list(EQUALP, makeSymbol("STRING"), makeString("my")), ONE_INTEGER), list(list(EQUALP, makeSymbol("STRING"), makeString("your")), TWO_INTEGER), list(list(EQUALP, makeSymbol("STRING"), makeString("our")), ONE_INTEGER), list(T, THREE_INTEGER))));

    protected static final SubLList $list733 = list(makeString("@return listp; a list of genders of this pronoun with possible gender values \n   :FEMININE, :MASCULINE and :NEUTER"),
	    list(RET, list(makeSymbol("CDR"), list(makeSymbol("ASSOC"), makeSymbol("STRING"), list(QUOTE,
		    list(list(makeString("my"), makeKeyword("MASCULINE"), makeKeyword("FEMININE")), list(makeString("your"), makeKeyword("MASCULINE"), makeKeyword("FEMININE"), makeKeyword("NEUTER")), list(makeString("his"), makeKeyword("MASCULINE")), list(makeString("her"), makeKeyword("FEMININE")),
			    list(makeString("its"), makeKeyword("NEUTER")), list(makeString("our"), makeKeyword("MASCULINE"), makeKeyword("FEMININE"), makeKeyword("NEUTER")), list(makeString("their"), makeKeyword("MASCULINE"), makeKeyword("FEMININE"), makeKeyword("NEUTER")))),
		    list(QUOTE, EQUALP)))));

    protected static final SubLList $list735 = list(list(makeString("my"), makeKeyword("MASCULINE"), makeKeyword("FEMININE")), list(makeString("your"), makeKeyword("MASCULINE"), makeKeyword("FEMININE"), makeKeyword("NEUTER")), list(makeString("his"), makeKeyword("MASCULINE")),
	    list(makeString("her"), makeKeyword("FEMININE")), list(makeString("its"), makeKeyword("NEUTER")), list(makeString("our"), makeKeyword("MASCULINE"), makeKeyword("FEMININE"), makeKeyword("NEUTER")),
	    list(makeString("their"), makeKeyword("MASCULINE"), makeKeyword("FEMININE"), makeKeyword("NEUTER")));

    protected static final SubLList $list738 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-REFS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ANTECEDENT"), NIL, makeKeyword("PUBLIC")));

    protected static final SubLList $list746 = list(makeSymbol("POSSESSIVE-WORD"));

    protected static final SubLList $list747 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-POSSESSOR"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-POSSESSED"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-COMPLEMENTS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MODIFIEDS"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KEYWORD-RENAMINGS"), list(makeSymbol("&OPTIONAL"), makeSymbol("KEYWORDS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LOGICAL-FORM-INT"), NIL, makeKeyword("PROTECTED")));

    protected static final SubLList $list748 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("KEYWORDS"), list(QUOTE, list(makeKeyword("POSSESSOR"), makeKeyword("POSSESSED")))));

    protected static final SubLList $list749 = list(list(makeSymbol("CLET"),
	    list(list(makeSymbol("CONJUNCTS"), NIL), list(makeSymbol("POSSESSOR"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-POSSESSOR")))),
		    list(makeSymbol("POSSESSED"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-POSSESSED"))))),
	    list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("POSSESSOR"), list(makeSymbol("MEMBER"), makeKeyword("POSSESSOR"), makeSymbol("KEYWORDS"), list(QUOTE, EQL))),
		    list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("POSSESSOR"), makeSymbol("POSSESSOR")), makeSymbol("CONJUNCTS"))),
	    list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("POSSESSED"), list(makeSymbol("MEMBER"), makeKeyword("POSSESSED"), makeSymbol("KEYWORDS"), list(QUOTE, EQL))),
		    list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("POSSESSED"), makeSymbol("POSSESSED")), makeSymbol("CONJUNCTS"))),
	    list(RET, list(makeSymbol("DISJUNCTIVE-KEYWORD-RENAMINGS"), makeSymbol("CONJUNCTS"), NIL))));

    protected static final SubLList $list750 = list(makeKeyword("POSSESSOR"), makeKeyword("POSSESSED"));

    protected static final SubLList $list756 = list(makeString("@return nominal-word-tree-p; the word that is the possessor in this possessive relation"),
	    list(makeSymbol("CLET"), list(list(makeSymbol("POSSESSOR"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SISTER")), MINUS_ONE_INTEGER))), list(RET, list(makeSymbol("FWHEN"), makeSymbol("POSSESSOR"), makeSymbol("POSSESSOR")))));

    protected static final SubLList $list758 = list(makeString("@return nominal-word-tree-p; the word that is the possessed in this possessive relation"),
	    list(makeSymbol("CLET"),
		    list(list(makeSymbol("GRANDMOTHER"), list(makeSymbol("FWHEN"), makeSymbol("MOTHER"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("GET-MOTHER"))))),
			    list(makeSymbol("GRANDMOTHER-HEAD"), list(makeSymbol("FWHEN"), list(makeSymbol("NOMINAL-PHRASE-TREE-P"), makeSymbol("GRANDMOTHER")), list(makeSymbol("FIM"), makeSymbol("GRANDMOTHER"), list(QUOTE, makeSymbol("GET-HEAD")))))),
		    list(RET, list(makeSymbol("FWHEN"), makeSymbol("GRANDMOTHER-HEAD"), makeSymbol("GRANDMOTHER-HEAD")))));

    protected static final SubLList $list761 = list(makeString("@return listp; a list of all complements of this tree, in surface order"),
	    list(makeSymbol("CLET"),
		    list(list(makeSymbol("COMPLEMENTS"), NIL), list(makeSymbol("POSSESSOR"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-POSSESSOR")))),
			    list(makeSymbol("POSSESSED"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-POSSESSED"))))),
		    list(makeSymbol("PWHEN"), makeSymbol("POSSESSED"), list(makeSymbol("CPUSH"), makeSymbol("POSSESSED"), makeSymbol("COMPLEMENTS"))), list(makeSymbol("PWHEN"), makeSymbol("POSSESSOR"), list(makeSymbol("CPUSH"), makeSymbol("POSSESSOR"), makeSymbol("COMPLEMENTS"))),
		    list(RET, makeSymbol("COMPLEMENTS"))));

    protected static final SubLList $list763 = list(makeString("@return listp; the constituents this possessive marker modifies"),
	    list(makeSymbol("PWHEN"), makeSymbol("MOTHER"),
		    list(makeSymbol("CLET"), list(list(makeSymbol("CANDIDATE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-POSSESSED"))))), list(makeSymbol("PWHEN"), makeSymbol("CANDIDATE"), list(makeSymbol("PUNLESS"),
			    list(makeSymbol("MEMBER?"), makeSymbol("MOTHER"), list(makeSymbol("FIM"), makeSymbol("CANDIDATE"), list(QUOTE, makeSymbol("GET-COMPLEMENTS"))), list(QUOTE, EQ)), list(RET, list(makeSymbol("LIST"), makeSymbol("CANDIDATE"))))))));

    protected static final SubLList $list767 = list(makeSymbol("NUMERICAL-TREE"));

    protected static final SubLList $list774 = list(makeSymbol("PUNCTUATION-WORD"));

    protected static final SubLList $list777 = list(new SubLObject[] { cons(makeKeyword("NN"), makeSymbol("NN-TREE")), cons(makeKeyword("NNS"), makeSymbol("NNS-TREE")), cons(makeKeyword("NNP"), makeSymbol("NNP-TREE")), cons($NNPS, makeSymbol("NNPS-TREE")),
	    cons(makeKeyword("NPS"), makeSymbol("NNPS-TREE")), cons(makeKeyword("NP"), makeSymbol("NAME-WORD-TREE")), cons(makeKeyword("NPLIST"), makeSymbol("NOMINAL-WORD-TREE")), cons(makeKeyword("WP"), makeSymbol("WP-TREE")), cons(makeKeyword("PP"), makeSymbol("NOMINAL-WORD-TREE")),
	    cons(makeKeyword("PRP"), makeSymbol("PRP-TREE")), cons(makeKeyword("FW"), makeSymbol("NOMINAL-WORD-TREE")), cons(makeKeyword("VBZ"), makeSymbol("VBZ-TREE")), cons(makeKeyword("VBN"), makeSymbol("VBN-TREE")), cons(makeKeyword("VBD"), makeSymbol("VBD-TREE")),
	    cons(makeKeyword("VBP"), makeSymbol("VBP-TREE")), cons(makeKeyword("VB"), makeSymbol("VB-TREE")), cons(makeKeyword("VBG"), makeSymbol("VBG-TREE")), cons(makeKeyword("AUX"), makeSymbol("AUX-VERB-TREE")), cons($AUXZ, makeSymbol("AUX-VERB-TREE")),
	    cons($AUXD, makeSymbol("AUX-VERB-TREE")), cons($AUXG, makeSymbol("AUX-VERB-TREE")), cons(makeKeyword("MD"), makeSymbol("MODAL-VERB-TREE")), cons(makeKeyword("IN"), makeSymbol("PREPOSITIONAL-WORD-TREE")),
	    cons(makeKeyword("TO"), makeSymbol("PREPOSITIONAL-WORD-TREE")), cons(makeKeyword("CC"), makeSymbol("COORDINATE-WORD-TREE")), cons(makeKeyword("JJ"), makeSymbol("ADJECTIVAL-WORD-TREE")), cons(makeKeyword("JJR"), makeSymbol("ADJECTIVAL-WORD-TREE")),
	    cons(makeKeyword("JJS"), makeSymbol("ADJECTIVAL-WORD-TREE")), cons(makeKeyword("RB"), makeSymbol("ADVERBIAL-WORD-TREE")), cons(makeKeyword("WRB"), makeSymbol("WRB-WORD-TREE")), cons(makeKeyword("RBR"), makeSymbol("ADVERBIAL-WORD-TREE")),
	    cons(makeKeyword("RBS"), makeSymbol("ADVERBIAL-WORD-TREE")), cons(makeKeyword("DT"), makeSymbol("DETERMINER-WORD-TREE")), cons(makeKeyword("WDT"), makeSymbol("WDT-WORD-TREE")), cons(makeKeyword("PRP$"), makeSymbol("PRP$-TREE")),
	    cons(makeKeyword("PDT"), makeSymbol("DETERMINER-WORD-TREE")), cons(makeKeyword("PP$"), makeSymbol("DETERMINER-WORD-TREE")), cons(makeKeyword("RP"), makeSymbol("PARTICLE-WORD-TREE")), cons(makeKeyword("POS"), makeSymbol("POSSESSIVE-WORD-TREE")),
	    cons(makeKeyword("CD"), makeSymbol("CARDINAL-WORD-TREE")), cons(makeKeyword("EX"), makeSymbol("EXISTENTIAL-WORD-TREE")), cons(makeKeyword("$"), makeSymbol("DOLLAR-WORD-TREE")), cons(makeKeyword("."), makeSymbol("PUNCTUATION-WORD-TREE")),
	    cons(makeKeyword(","), makeSymbol("PUNCTUATION-WORD-TREE")), cons(makeKeyword(":"), makeSymbol("PUNCTUATION-WORD-TREE")), cons(makeKeyword("''"), makeSymbol("PUNCTUATION-WORD-TREE")), cons(makeKeyword("``"), makeSymbol("PUNCTUATION-WORD-TREE")),
	    cons(makeKeyword("'"), makeSymbol("PUNCTUATION-WORD-TREE")), cons(makeKeyword("`"), makeSymbol("PUNCTUATION-WORD-TREE")), cons(makeKeyword("("), makeSymbol("PUNCTUATION-WORD-TREE")), cons(makeKeyword(")"), makeSymbol("PUNCTUATION-WORD-TREE")),
	    cons(makeKeyword("-LRB-"), makeSymbol("PUNCTUATION-WORD-TREE")), cons(makeKeyword("-RRB-"), makeSymbol("PUNCTUATION-WORD-TREE")), cons(makeKeyword("LS"), makeSymbol("PUNCTUATION-WORD-TREE")) });

    protected static final SubLList $list779 = list(list(makeSymbol("DAUGHTERS"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")));

    protected static final SubLList $list784 = list(makeSymbol("LIST-OF-STRINGS"));

    protected static final SubLList $list785 = list(makeString("@param LIST-OF-STRINGS listp; a list of strings\n   @return booleanp; T is the yield of the tree contains every string\n   in LIST-OF-STRINGS, NIL otherwise.\n   @owner bertolo"),
	    list(makeSymbol("CLET"), list(list(makeSymbol("YIELD"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("YIELD")))), list(makeSymbol("TREE-WORDS"), NIL), list(makeSymbol("FAIL"), NIL)),
		    list(makeSymbol("CDOLIST"), list(makeSymbol("TREE"), makeSymbol("YIELD")), list(makeSymbol("CPUSH"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(QUOTE, makeSymbol("GET-STRING"))), makeSymbol("TREE-WORDS"))),
		    list(makeSymbol("CSOME"), list(makeSymbol("TERM"), makeSymbol("LIST-OF-STRINGS"), makeSymbol("FAIL")),
			    list(makeSymbol("CLET"), list(makeSymbol("MATCH")),
				    list(makeSymbol("CSOME"), list(makeSymbol("WORD"), makeSymbol("TREE-WORDS"), makeSymbol("MATCH")), list(makeSymbol("PWHEN"), list(EQUALP, makeSymbol("TERM"), makeSymbol("WORD")), list(makeSymbol("CSETQ"), makeSymbol("MATCH"), T))),
				    list(makeSymbol("PUNLESS"), makeSymbol("MATCH"), list(makeSymbol("CSETQ"), makeSymbol("FAIL"), T)))),
		    list(RET, list(makeSymbol("CNOT"), makeSymbol("FAIL")))));

    protected static final SubLList $list788 = list(makeString("@param LIST-OF-STRINGS listp; a list of strings\n   @return booleanp; T all the subtrees of this tree that cover the\n   strings in LIST-OF-STRINGS.\n   @owner bertolo"),
	    list(makeSymbol("PUNLESS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("COVERS")), makeSymbol("LIST-OF-STRINGS")), list(RET, NIL)),
	    list(makeSymbol("CLET"), list(makeSymbol("FAIL")),
		    list(makeSymbol("PWHEN"), list(makeSymbol("PHRASE-TREE-P"), makeSymbol("SELF")),
			    list(makeSymbol("DO-VECTOR"), list(makeSymbol("DAUGHTER"), list(makeSymbol("GET-PHRASE-TREE-DAUGHTERS"), makeSymbol("SELF")), makeKeyword("ELEMENT-NUM"), NIL, $DONE, makeSymbol("FAIL")),
				    list(makeSymbol("PWHEN"), list(makeSymbol("FIM"), makeSymbol("DAUGHTER"), list(QUOTE, makeSymbol("COVERS")), makeSymbol("LIST-OF-STRINGS")), list(makeSymbol("CSETQ"), makeSymbol("FAIL"), T)))),
		    list(RET, list(makeSymbol("CNOT"), makeSymbol("FAIL")))));

    protected static final SubLList $list789 = list(makeUninternedSymbol("START"), makeUninternedSymbol("END"), makeUninternedSymbol("DELTA"));

    protected static final SubLList $list792 = list(makeString("@param LIST-OF-STRINGS listp; a list of strings\n   @return listp; a list of all the minimal subtrees of this tree that cover the\n   strings in LIST-OF-STRINGS.\n   @owner bertolo"),
	    list(makeSymbol("CLET"), list(list(makeSymbol("MINIMAL"), NIL), list(makeSymbol("QUEUE"), list(makeSymbol("CREATE-QUEUE")))), list(makeSymbol("ENQUEUE"), makeSymbol("SELF"), makeSymbol("QUEUE")),
		    list(makeSymbol("UNTIL"), list(makeSymbol("QUEUE-EMPTY-P"), makeSymbol("QUEUE")),
			    list(makeSymbol("CLET"), list(list(makeSymbol("SUBTREE"), list(makeSymbol("DEQUEUE"), makeSymbol("QUEUE")))),
				    list(makeSymbol("PIF"), list(makeSymbol("FIM"), makeSymbol("SUBTREE"), list(QUOTE, makeSymbol("COVERS-MINIMALLY")), makeSymbol("LIST-OF-STRINGS")), list(makeSymbol("CPUSH"), makeSymbol("SUBTREE"), makeSymbol("MINIMAL")),
					    list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("FIM"), makeSymbol("SUBTREE"), list(QUOTE, makeSymbol("COVERS")), makeSymbol("LIST-OF-STRINGS")), list(makeSymbol("PHRASE-TREE-P"), makeSymbol("SUBTREE"))),
						    list(makeSymbol("DO-VECTOR"), list(makeSymbol("DAUGHTER"), list(makeSymbol("GET-PHRASE-TREE-DAUGHTERS"), makeSymbol("SUBTREE"))), list(makeSymbol("ENQUEUE"), makeSymbol("DAUGHTER"), makeSymbol("QUEUE"))))))),
		    list(RET, makeSymbol("MINIMAL"))));

    protected static final SubLList $list8 = list(makeKeyword("PROTECTED"));

    protected static final SubLList $list87 = list(makeString("@return stringp; the string of this word-tree"), list(RET, makeSymbol("STRING")));

    protected static final SubLList $list9 = list(list(makeSymbol("CLET"), list(makeSymbol("SEMTRANS")),
	    list(makeSymbol("CDOLIST"), list(makeSymbol("RLE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-RANKED-LEXES")))),
		    list(makeSymbol("CSETQ"), makeSymbol("SEMTRANS"), list(makeSymbol("FIM"), list(makeSymbol("RLE-LEX"), makeSymbol("RLE")), list(QUOTE, makeSymbol("GET")), makeKeyword("SEMTRANS"))),
		    list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER?"), makeKeyword("REPLACE"), list(makeSymbol("FORMULA-KEYWORDS"), makeSymbol("SEMTRANS"))), list(RET, T))),
	    list(RET, NIL)));

    protected static final SubLList $list91 = list(makeString("@return non-negative-integer-p; the absolute index of this word"), list(RET, makeSymbol("ABS-IDX")));

    protected static final SubLList $list95 = list(makeString("@return listp; the list of lexical entries of this word"),
	    list(RET, list(makeSymbol("MAPCAR"), list(QUOTE, makeSymbol("CAR")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-RANKED-LEXES"))))));

    protected static final SubLList $list97 = list(makeString("@return listp; the list of ranked lexical entries of this word"), list(RET, makeSymbol("LEXES")));

}

abstract class word_tree_base_file extends SubLTranslatedFile implements V12 {
    protected static final SubLList $list_alt101 = list(makeKeyword("READ-ONLY"), makeKeyword("PUBLIC"));

    protected static final SubLList $list_alt102 = list(makeString("@return listp; the unique referent of this word"), list(RET, makeSymbol("REFS")));

    protected static final SubLList $list_alt105 = list(makeSymbol("REFERENTS"));

    protected static final SubLList $list_alt106 = list(makeString("@param REFS listp; a list of referents\n   @return word-tree; this word tree with its referents updated to REFERENTS"),
	    list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("REFS")), makeSymbol("REFERENTS")), list(RET, makeSymbol("SELF")));

    protected static final SubLList $list_alt110 = list(makeString("@return listp; the yield of this word tree"), list(RET, list(makeSymbol("LIST"), makeSymbol("SELF"))));

    protected static final SubLList $list_alt113 = list(makeString("@return listp; the parse expression of this word tree\n   @owner bertolo"),
	    list(RET, list(makeSymbol("LIST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-CATEGORY"))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-STRING"))))));

    protected static final SubLList $list_alt116 = list(makeString("@return listp; a list containing the head of this word"), list(RET, list(makeSymbol("LIST"), makeSymbol("SELF"))));

    protected static final SubLList $list_alt118 = list(makeString("@return word-tree-p; the head of this word"), list(RET, makeSymbol("SELF")));

    protected static final SubLList $list_alt121 = list(makeString("@return listp; a list containing the semantic head of this word"), list(RET, list(makeSymbol("LIST"), makeSymbol("SELF"))));

    protected static final SubLList $list_alt124 = list(makeKeyword("NO-MEMBER-VARIABLES"), makeKeyword("PROTECTED"));

    protected static final SubLList $list_alt125 = list(makeSymbol("LEXICON"));

    protected static final SubLList $list_alt126 = list(makeString("@return parse-tree-p; a version of this word-tree with lexical entries"),
	    list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("LEXES")),
		    list(makeSymbol("NEW-EVEN-LEX-ENTRY-DISTRIBUTION"), list(makeSymbol("FIM"), makeSymbol("LEXICON"), list(QUOTE, makeSymbol("GET")), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("STRING")))))),
	    list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("POS-FILTER-LEXES"))),
	    list(makeSymbol("PWHEN"), list(makeSymbol("SEMTRANS-LEXICON-P"), makeSymbol("LEXICON")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PP-COMP-FILTER-LEXES"))),
		    list(makeSymbol("PWHEN"), list(makeSymbol("VERBAL-WORD-TREE-P"), makeSymbol("SELF")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PARTICLE-FILTER-LEXES")))),
		    list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("FRAME-FILTER-LEXES"))),
		    list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("LEXES")),
			    list(makeSymbol("REMOVE-DUPLICATES"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("LEXES"))), list(QUOTE, makeSymbol("RLE-SEM-EQUAL")))),
		    list(makeSymbol("PUNLESS"),
			    list(makeSymbol("COR"), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("LEXES"))), list(makeSymbol("TERM-LEXICON-P"), makeSymbol("LEXICON")),
				    list(makeSymbol("FIM"), makeSymbol("LEXICON"), list(QUOTE, makeSymbol("FABRICATION-FORBIDDEN?")))),
			    list(makeSymbol("CLET"),
				    list(list(makeSymbol("FABRICATED-LEXES"),
					    list(makeSymbol("FIM"), makeSymbol("LEXICON"), list(QUOTE, makeSymbol("FABRICATE")), list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("STRING"))),
						    list(makeSymbol("MAPCAR"), list(QUOTE, makeSymbol("CAR")), list(makeSymbol("FIRST"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-KEYWORD-RENAMINGS")))))),
						    list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CATEGORY")))))),
				    list(makeSymbol("PWHEN"), makeSymbol("FABRICATED-LEXES"),
					    list(makeSymbol("SET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("LEXES")), list(makeSymbol("MAPCAR"), list(QUOTE, makeSymbol("NEW-RANKED-LEX-ENTRY")), makeSymbol("FABRICATED-LEXES"))))))),
	    list(RET, list(makeSymbol("GET-SLOT"), makeSymbol("SELF"), list(QUOTE, makeSymbol("LEXES")))));

    protected static final SubLList $list_alt133 = list(makeString("@return listp; pps related to this word, either as an adjunct\n   or as a complement"),
	    list(makeSymbol("CLET"), list(list(makeSymbol("PPS"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("FIND")), list(QUOTE, makeSymbol("PREPOSITIONAL-TREE-P")), list(makeSymbol("1+"), makeSymbol("IDX"))))),
		    list(makeSymbol("PWHEN"), makeSymbol("PPS"), list(RET, makeSymbol("PPS"))),
		    list(makeSymbol("CLET"), list(list(makeSymbol("TREE"), makeSymbol("MOTHER"))), list(makeSymbol("CSETQ"), makeSymbol("PPS"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(QUOTE, makeSymbol("FIND")), list(QUOTE, makeSymbol("WHPP-TREE-P")))),
			    list(makeSymbol("UNTIL"), list(makeSymbol("COR"), makeSymbol("PPS"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(QUOTE, makeSymbol("ROOT-P")))),
				    list(makeSymbol("CSETQ"), makeSymbol("TREE"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(QUOTE, makeSymbol("GET-MOTHER")))),
				    list(makeSymbol("CSETQ"), makeSymbol("PPS"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(QUOTE, makeSymbol("FIND")), list(QUOTE, makeSymbol("WHPP-TREE-P"))))),
			    list(makeSymbol("PWHEN"), makeSymbol("PPS"), list(RET, makeSymbol("PPS"))))));

    protected static final SubLList $list_alt141 = list(makeString("@return listp; a list of complements of this word"), list(RET, NIL));

    protected static final SubLList $list_alt143 = list(makeString("@return listp; a list of all modifiers of this word"), list(RET, makeSymbol("MODIFIERS")));

    protected static final SubLList $list_alt147 = list(makeString("@return listp; a list of phrases that this word modifies"), list(RET, NIL));

    protected static final SubLList $list_alt150 = list(makeString("@return booleanp; t if this tree is temporal, nil otherwise"),
	    list(makeSymbol("CLET"), list(list(makeSymbol("TOKENS"), list(makeSymbol("SPLIT-STRING"), makeSymbol("STRING")))),
		    list(makeSymbol("PIF"), list(makeSymbol("<"), list(makeSymbol("LENGTH"), makeSymbol("TOKENS")), TWO_INTEGER),
			    list(makeSymbol("CLET"), list(list(makeSymbol("LEXES"), list(makeSymbol("FIM"), list(makeSymbol("GET-TERM-LEXICON")), list(QUOTE, makeSymbol("GET")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-STRING")))))),
				    list(makeSymbol("CDOLIST"), list(makeSymbol("LEX"), makeSymbol("LEXES")),
					    list(makeSymbol("PWHEN"), list(makeSymbol("MORE-SPECIFIC-P"), list(makeSymbol("FIM"), makeSymbol("LEX"), list(QUOTE, makeSymbol("GET")), makeKeyword("DENOT")), reader_make_constant_shell("Date")), list(RET, T)))),
			    list(makeSymbol("CLET"),
				    list(list(makeSymbol("PARSE-TREE"), list(makeSymbol("FIM"), list(makeSymbol("GET-STANFORD-PARSER")), list(QUOTE, makeSymbol("PARSE")), makeSymbol("STRING"))),
					    list(makeSymbol("HEAD"), list(makeSymbol("FWHEN"), makeSymbol("PARSE-TREE"), list(makeSymbol("FIM"), makeSymbol("PARSE-TREE"), list(QUOTE, makeSymbol("GET-HEAD")))))),
				    list(makeSymbol("PWHEN"), makeSymbol("HEAD"), list(RET, list(makeSymbol("FIM"), makeSymbol("HEAD"), list(QUOTE, makeSymbol("TEMPORAL-TREE-P")))))))));

    protected static final SubLList $list_alt157 = list(makeString("@return boolean; t if this word is a relative pronoun, nil otherwise"),
	    list(makeSymbol("PUNLESS"), list(makeSymbol("COR"), list(makeSymbol("WDT-WORD-TREE-P"), makeSymbol("SELF")), list(makeSymbol("WP-TREE-P"), makeSymbol("SELF"))), list(RET, NIL)),
	    list(makeSymbol("CLET"),
		    list(list(makeSymbol("GRANDMOTHER"), list(makeSymbol("FWHEN"), makeSymbol("MOTHER"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("GET-MOTHER"))))),
			    list(makeSymbol("FIRST-WORD"), list(makeSymbol("FWHEN"), makeSymbol("GRANDMOTHER"), list(makeSymbol("FIM"), makeSymbol("GRANDMOTHER"), list(QUOTE, makeSymbol("GET-DESCENDANT")), list(QUOTE, list(ZERO_INTEGER, ZERO_INTEGER)))))),
		    list(RET, list(makeSymbol("CAND"), list(EQ, makeSymbol("SELF"), makeSymbol("FIRST-WORD")), list(makeSymbol("RELATIVE-CLAUSE-P"), makeSymbol("GRANDMOTHER"))))));

    protected static final SubLList $list_alt16 = list(list(makeSymbol("CLET"),
	    list(list(makeSymbol("FILTERED"), NIL), list(makeSymbol("PP"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-PP-COMPLEMENT")))),
		    list(makeSymbol("PP-HEAD"), list(makeSymbol("FWHEN"), makeSymbol("PP"), list(makeSymbol("FIM"), makeSymbol("PP"), list(QUOTE, makeSymbol("GET-HEAD"))))), makeSymbol("FRAME")),
	    list(makeSymbol("PWHEN"), makeSymbol("PP-HEAD"),
		    list(makeSymbol("CDOLIST"), list(makeSymbol("RLE"), makeSymbol("LEXES")), list(makeSymbol("CSETQ"), makeSymbol("FRAME"), list(makeSymbol("FIM"), list(makeSymbol("RLE-LEX"), makeSymbol("RLE")), list(QUOTE, makeSymbol("GET")), makeKeyword("FRAME"))),
			    list(makeSymbol("PIF"), list(makeSymbol("CAND"), list(makeSymbol("FORMULA-ARG2"), makeSymbol("FRAME")), list(makeSymbol("ISA?"), makeSymbol("FRAME"), reader_make_constant_shell("PPCompFrame"), reader_make_constant_shell("EverythingPSC"))), list(makeSymbol("CLET"),
				    list(list(makeSymbol("PREPOSITION"), list(makeSymbol("FORMULA-ARG2"), makeSymbol("FRAME"))), list(makeSymbol("PREP-STRING"), list(makeSymbol("FIRST"), list(makeSymbol("GET-STRINGS-OF-TYPE"), makeSymbol("PREPOSITION"), reader_make_constant_shell("Preposition"))))),
				    list(makeSymbol("PWHEN"), list(EQUALP, makeSymbol("PREP-STRING"), list(makeSymbol("FIM"), makeSymbol("PP-HEAD"), list(QUOTE, makeSymbol("GET-STRING")))), list(makeSymbol("RLE-SET-CONFIDENCE"), makeSymbol("RLE"), ONE_INTEGER),
					    list(makeSymbol("CPUSH"), makeSymbol("RLE"), makeSymbol("FILTERED")))),
				    list(makeSymbol("CPUSH"), makeSymbol("RLE"), makeSymbol("FILTERED")))),
		    list(makeSymbol("CSETQ"), makeSymbol("LEXES"), makeSymbol("FILTERED"))),
	    list(RET, makeSymbol("LEXES"))));

    protected static final SubLList $list_alt160 = list(ZERO_INTEGER, ZERO_INTEGER);

    protected static final SubLList $list_alt163 = list(list(makeSymbol("IGNORE"), makeSymbol("LEXICON")), list(RET, makeSymbol("SELF")));

    protected static final SubLList $list_alt166 = list(makeString("@return listp; the logical form of this word"), list(RET, NIL));

    protected static final SubLList $list_alt172 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LOGICAL-FORM-INT"), NIL, makeKeyword("PROTECTED")));

    protected static final SubLList $list_alt176 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-COMPLEMENTS"), NIL, makeKeyword("PUBLIC")));

    protected static final SubLList $list_alt179 = list(makeString("@return list; a list of the conjuncts of this conjunction"),
	    list(RET, list(makeSymbol("LIST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SISTER")), MINUS_ONE_INTEGER), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SISTER")), ONE_INTEGER))));

    protected static final SubLList $list_alt184 = list(makeString("@return booleanp; t if this phrase is a coordination, nil otherwise"), list(RET, list(makeSymbol("BOOLEAN"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-CONJUNCTION"))))));

    protected static final SubLList $list_alt189 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COORDINATE-PHRASE-P"), NIL, makeKeyword("PUBLIC")));

    protected static final SubLList $list_alt193 = list(list(RET, T));

    protected static final SubLList $list_alt2 = list(makeSymbol("CYCLIFIABLE-WORD"));

    protected static final SubLList $list_alt200 = list(makeSymbol("NOMINAL-TREE"), makeSymbol("NOMINAL-WORD"));

    protected static final SubLList $list_alt201 = list(new SubLObject[] { list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-NUMBER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-COMPLEMENTS"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MODIFIEDS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DETERMINER"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-QUANTIFIER"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-POSSESSOR"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SPECIFIER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ANTECEDENT"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RELATIONAL-NOUN-P"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DEFINITE-DESCRIPTION-P"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-GENDER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PERSON"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SINGULAR-P"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PLURAL-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CYCLIFY-INT"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CYCLIFY-NUCLEUS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KEYWORD-RENAMINGS"), list(makeSymbol("&OPTIONAL"), makeSymbol("KEYWORDS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LOGICAL-FORM-INT"), NIL, makeKeyword("PROTECTED")) });

    protected static final SubLList $list_alt202 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("KEYWORDS"), list(QUOTE, list($NOUN, makeKeyword("POSSESSOR"), makeKeyword("OBLIQUE-OBJECT"), makeKeyword("MODIFIED"), makeKeyword("POSS-COL"), makeKeyword("NUMBER")))));

    protected static final SubLList $list_alt203 = list(list(new SubLObject[] { makeSymbol("CLET"),
	    list(list(makeSymbol("CONJUNCTS"), NIL), list(makeSymbol("DISJUNCTS"), NIL), list(makeSymbol("COMPLEMENT"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SEMANTIC-COMPLEMENTS"))))),
		    list(makeSymbol("QUANTIFIER0"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-OVERT-QUANTIFIER")))),
		    list(makeSymbol("QUANTIFIER"), list(makeSymbol("FWHEN"), makeSymbol("QUANTIFIER0"), list(makeSymbol("FIM"), makeSymbol("QUANTIFIER0"), list(QUOTE, makeSymbol("GET-HEAD"))))),
		    list(makeSymbol("MODIFIED"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-MODIFIEDS")))))),
	    list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER?"), $NOUN, makeSymbol("KEYWORDS"), list(QUOTE, EQL)), list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), $NOUN, makeSymbol("SELF")), makeSymbol("CONJUNCTS"))),
	    list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("COMPLEMENT"), list(makeSymbol("MEMBER"), makeKeyword("OBLIQUE-OBJECT"), makeSymbol("KEYWORDS"), list(QUOTE, EQL))),
		    list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("PREP-OBJECT"), makeSymbol("COMPLEMENT")), makeSymbol("CONJUNCTS"))),
	    list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("COMPLEMENT"), list(makeSymbol("MEMBER"), makeKeyword("POSSESSOR"), makeSymbol("KEYWORDS"), list(QUOTE, EQL))),
		    list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("POSSESSOR"), makeSymbol("COMPLEMENT")), makeSymbol("CONJUNCTS"))),
	    list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("MODIFIED"), list(makeSymbol("MEMBER"), makeKeyword("MODIFIED"), makeSymbol("KEYWORDS"), list(QUOTE, EQL))),
		    list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("MODIFIED"), makeSymbol("MODIFIED")), makeSymbol("CONJUNCTS"))),
	    list(makeSymbol("PWHEN"),
		    list(makeSymbol("CAND"), makeSymbol("QUANTIFIER"), list(EQL, list(makeSymbol("FIM"), makeSymbol("QUANTIFIER"), list(QUOTE, makeSymbol("GET-CATEGORY"))), makeKeyword("CD")),
			    list(makeSymbol("MEMBER"), makeKeyword("NUMBER"), makeSymbol("KEYWORDS"), list(QUOTE, EQL))),
		    list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("NUMBER"), makeSymbol("QUANTIFIER")), makeSymbol("CONJUNCTS"))),
	    list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("COMPLEMENT"), list(makeSymbol("MEMBER"), makeKeyword("POSS-COL"), makeSymbol("KEYWORDS"), list(QUOTE, EQL))),
		    list(makeSymbol("CLET"), list(list(makeSymbol("HEAD"), list(makeSymbol("FIM"), makeSymbol("COMPLEMENT"), list(QUOTE, makeSymbol("GET-HEAD")))), makeSymbol("CYCL"), makeSymbol("COL")),
			    list(makeSymbol("PWHEN"), makeSymbol("HEAD"),
				    list(makeSymbol("CDOLIST"), list(makeSymbol("LEX"), list(makeSymbol("FIM"), makeSymbol("HEAD"), list(QUOTE, makeSymbol("GET-LEXES")))),
					    list(makeSymbol("CSETQ"), makeSymbol("CYCL"), list(makeSymbol("FIM"), makeSymbol("LEX"), list(QUOTE, makeSymbol("GET")), makeKeyword("SEMTRANS"))),
					    list(makeSymbol("CSETQ"), makeSymbol("COL"), list(makeSymbol("MAIN-COLLECTION"), makeSymbol("CYCL"), $NOUN)), list(makeSymbol("CPUSH"), list(makeSymbol("CONS"), makeKeyword("POSS-COL"), makeSymbol("COL")), makeSymbol("DISJUNCTS"))),
				    list(makeSymbol("PUNLESS"), makeSymbol("DISJUNCTS"), list(makeSymbol("CPUSH"), list(makeSymbol("CONS"), makeKeyword("POSS-COL"), reader_make_constant_shell("Thing")), makeSymbol("DISJUNCTS")))))),
	    list(RET, list(makeSymbol("DISJUNCTIVE-KEYWORD-RENAMINGS"), makeSymbol("CONJUNCTS"), makeSymbol("DISJUNCTS"))) }));

    protected static final SubLList $list_alt204 = list($NOUN, makeKeyword("POSSESSOR"), makeKeyword("OBLIQUE-OBJECT"), makeKeyword("MODIFIED"), makeKeyword("POSS-COL"), makeKeyword("NUMBER"));

    protected static final SubLList $list_alt215 = list(makeSymbol("&OPTIONAL"), makeSymbol("RENAMINGS-DISJ"));

    protected static final SubLList $list_alt216 = list(
	    list(makeSymbol("CLET"), list(list(makeSymbol("CYCLS"), NIL), makeSymbol("INDEPENDENT-MODS"), makeSymbol("DEPENDENT-MODS"), list(makeSymbol("COMP-MOD-CYCLS"), NIL)),
		    list(makeSymbol("CMULTIPLE-VALUE-SETQ"), list(makeSymbol("INDEPENDENT-MODS"), makeSymbol(
			    "DEPENDENT-MODS")), list(makeSymbol("PARTITION-MODIFIERS"),
				    list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-MODIFIERS"))))),
		    list(makeSymbol("WITHOUT-RECURSIVE-CYCLIFICATION"),
			    list(makeSymbol("PUNLESS"), makeSymbol("RENAMINGS-DISJ"),
				    list(makeSymbol("CSETQ"), makeSymbol("RENAMINGS-DISJ"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-KEYWORD-RENAMINGS")),
					    list(makeSymbol("REQUIRED-KEYWORDS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-RANKED-LEXES"))))))),
			    list(makeSymbol("CDOLIST"), list(makeSymbol("COMPLEMENT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SEMANTIC-COMPLEMENTS")))),
				    list(makeSymbol("CLET"), list(
					    list(makeSymbol("COMP-CYCL"), list(makeSymbol("FIM"), makeSymbol("COMPLEMENT"), list(QUOTE, makeSymbol("CYCLIFY-INT"))))),
					    list(makeSymbol("PWHEN"), makeSymbol("COMP-CYCL"), list(makeSymbol("CPUSH"), makeSymbol("COMP-CYCL"), makeSymbol("COMP-MOD-CYCLS"))))),
			    list(makeSymbol("CDOLIST"), list(makeSymbol("MODIFIER"), makeSymbol("INDEPENDENT-MODS")),
				    list(makeSymbol("CLET"), list(list(makeSymbol("MOD-CYCL"), list(makeSymbol("FIM"), makeSymbol("MODIFIER"), list(QUOTE, makeSymbol("CYCLIFY-INT"))))),
					    list(makeSymbol("PWHEN"), makeSymbol("MOD-CYCL"), list(makeSymbol("CPUSH"), makeSymbol("MOD-CYCL"), makeSymbol("COMP-MOD-CYCLS"))))),
			    list(makeSymbol("CDOLIST"), list(makeSymbol("RENAMINGS-CONJ"), makeSymbol("RENAMINGS-DISJ")), list(
				    makeSymbol("CLET"), list(list(makeSymbol("CYCLS-CONJ"),
					    NIL)),
				    list(makeSymbol("CDOLIST"), list(makeSymbol("RLE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-RANKED-LEXES")))),
					    list(makeSymbol("CLET"), list(list(makeSymbol("CYCLS-DISJ"), NIL), list(makeSymbol("TERM"), list(makeSymbol("FIM"), list(makeSymbol("RLE-LEX"), makeSymbol("RLE")), list(QUOTE, makeSymbol("GET")), $TERM))),
						    list(makeSymbol("CDOLIST"), list(makeSymbol("RENAMING"), makeSymbol("RENAMINGS-CONJ")),
							    list(makeSymbol("CLET"), list(list(makeSymbol("MY-CYCLS-WITH-MODS"), list(makeSymbol("LIST"), list(makeSymbol("LIST"), list(makeSymbol("APPLY-LEX-RENAMING"), makeSymbol("SELF"), makeSymbol("RLE"), makeSymbol("RENAMING")))))),
								    list(makeSymbol("CDOLIST"), list(makeSymbol("MOD"), makeSymbol("DEPENDENT-MODS")),
									    list(makeSymbol("CPUSH"),
										    list(makeSymbol("FIM"), makeSymbol("MOD"), list(QUOTE, makeSymbol("CYCLIFY-NUCLEUS")),
											    list(makeSymbol("UPDATE-KEYWORD-RENAMINGS"), list(makeSymbol("FIM"), makeSymbol("MOD"), list(QUOTE, makeSymbol("GET-KEYWORD-RENAMINGS"))), makeKeyword("REPLACE"), makeSymbol("TERM"))),
										    makeSymbol("MY-CYCLS-WITH-MODS"))),
								    list(makeSymbol("CSETQ"), makeSymbol("CYCLS-DISJ"),
									    list(makeSymbol("APPEND"), list(makeSymbol("MAPCAR"), list(QUOTE, makeSymbol("INSTANTIATE-SCOPE")), list(makeSymbol("CROSS-PRODUCTS"), makeSymbol("MY-CYCLS-WITH-MODS"))), makeSymbol("CYCLS-DISJ"))))),
						    list(makeSymbol("PWHEN"), makeSymbol("CYCLS-DISJ"), list(makeSymbol("CSETQ"), makeSymbol("CYCLS-CONJ"), list(makeSymbol("APPEND"), makeSymbol("CYCLS-DISJ"), makeSymbol("CYCLS-CONJ")))))),
				    list(makeSymbol("CSETQ"), makeSymbol("CYCLS"),
					    list(makeSymbol("APPEND"), makeSymbol("CYCLS"),
						    list(makeSymbol("MAPCAR"), list(QUOTE, makeSymbol("INSTANTIATE-SCOPE")), list(makeSymbol("CROSS-PRODUCTS"), list(makeSymbol("CONS"), makeSymbol("CYCLS-CONJ"), makeSymbol("COMP-MOD-CYCLS"))))))))),
		    list(RET, makeSymbol("CYCLS"))));

    protected static final SubLList $list_alt219 = list(list(makeSymbol("WITHOUT-DUPLICATE-CYCLIFICATION"),
	    list(makeSymbol("CLET"), list(list(makeSymbol("QUANTIFIER"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-QUANTIFIER")))), makeSymbol("RESULT")),
		    list(makeSymbol("CSETQ"), makeSymbol("RESULT"),
			    list(makeSymbol("FIF"), makeSymbol("QUANTIFIER"), list(makeSymbol("FIM"), makeSymbol("QUANTIFIER"), list(QUOTE, makeSymbol("CYCLIFY-INT"))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CYCLIFY-NUCLEUS"))))),
		    list(RET, makeSymbol("RESULT")))));

    protected static final SubLList $list_alt223 = list(
	    list(makeSymbol("CLET"), list(list(makeSymbol("DET"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-DETERMINER"))))),
		    list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("DET"), list(EQUALP, list(makeSymbol("FIM"), makeSymbol("DET"), list(QUOTE, makeSymbol("GET-STRING"))), makeString("the"))), list(RET, T))),
	    list(makeSymbol("CLET"), list(list(makeSymbol("HEAD"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-HEAD"))))),
		    list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("HEAD"), list(makeSymbol("NAME-WORD-P"), makeSymbol("HEAD")), list(makeSymbol("FIM"), makeSymbol("HEAD"), list(QUOTE, makeSymbol("SINGULAR-P")))), list(RET, T))),
	    list(makeSymbol("CLET"), list(list(makeSymbol("POS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-POSSESSOR"))))), list(makeSymbol("PWHEN"), makeSymbol("POS"), list(RET, T))));

    protected static final SubLList $list_alt230 = list(list(makeSymbol("CDOLIST"), list(makeSymbol("RLE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-RANKED-LEXES")))), list(
	    makeSymbol("CLET"), list(
		    list(makeSymbol("DENOT"),
			    list(makeSymbol("RENAME-VARIABLES"), list(makeSymbol("FIM"), list(makeSymbol("RLE-LEX"), makeSymbol("RLE")), list(QUOTE, makeSymbol("GET")), makeKeyword("SEMTRANS")),
				    list(makeSymbol("FRAME-RENAMING"), list(makeSymbol("FIM"), list(makeSymbol("RLE-LEX"), makeSymbol("RLE")), list(QUOTE, makeSymbol("GET")), makeKeyword("FRAME"))))),
		    list(makeSymbol("KEYWORDS"), list(makeSymbol("FORMULA-KEYWORDS"), makeSymbol("DENOT")))),
	    list(makeSymbol("CDOLIST"), list(makeSymbol("KEYWORD"), list(QUOTE, list(makeKeyword("POSSESSOR"), makeKeyword("POSS-COL")))),
		    list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER?"), makeSymbol("KEYWORD"), makeSymbol("KEYWORDS"), list(QUOTE, EQ)), list(RET, T))))));

    protected static final SubLList $list_alt232 = list(list(makeSymbol("CLET"), list(list(makeSymbol("QUANTIFIER"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-OVERT-QUANTIFIER"))))),
	    list(makeSymbol("PCOND"),
		    list(makeSymbol("QUANTIFIER"), list(RET, list(makeSymbol("FWHEN"), list(makeSymbol("CNOT"), list(EQUALP, list(makeSymbol("FIM"), makeSymbol("QUANTIFIER"), list(QUOTE, makeSymbol("GET-STRING"))), makeString("the"))), makeSymbol("QUANTIFIER")))),
		    list(list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-POSSESSOR")))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("SINGULAR-P")))),
			    list(RET, list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-EXISTENTIAL-NULL-DETERMINER"))))),
		    list(list(makeSymbol("CAND"), list(makeSymbol("CNOT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-POSSESSOR")))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PLURAL-P")))),
			    list(RET, list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-EXISTENTIAL-NULL-DETERMINER"))))),
		    list(list(makeSymbol("CNOT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-POSSESSOR")))), list(RET, NIL)))));

    protected static final SubLList $list_alt239 = list(makeString("@return listp; a list of numbers of this noun with possible number values\n   :SINGULAR and :PLURAL\n   @note this should be overridden by the subclassses"), list(RET, NIL));

    protected static final SubLList $list_alt241 = list(makeString("@return listp; the complements of this noun"), list(makeSymbol("PWHEN"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("RELATIONAL-NOUN-P"))), list(makeSymbol("CLET"),
	    list(makeSymbol("COMPLEMENT")), list(makeSymbol("CSETQ"), makeSymbol("COMPLEMENT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-POSSESSOR")))),
	    list(makeSymbol("PUNLESS"), makeSymbol("COMPLEMENT"), list(makeSymbol("PWHEN"), makeSymbol("MOTHER"), list(makeSymbol("CLET"),
		    list(list(makeSymbol("SISTER"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("GET-SISTER")), ONE_INTEGER)),
			    list(makeSymbol("SISTER-HEAD"), list(makeSymbol("FWHEN"), makeSymbol("SISTER"), list(makeSymbol("FIM"), makeSymbol("SISTER"), list(QUOTE, makeSymbol("GET-HEAD")))))),
		    list(makeSymbol("PWHEN"),
			    list(makeSymbol("CAND"), list(makeSymbol("PREPOSITIONAL-OR-PARTICLE-PHRASE-TREE-P"), makeSymbol("SISTER")), makeSymbol("SISTER-HEAD"), list(EQUALP, list(makeSymbol("FIM"), makeSymbol("SISTER-HEAD"), list(QUOTE, makeSymbol("GET-STRING"))), makeString("of"))),
			    list(makeSymbol("CSETQ"), makeSymbol("COMPLEMENT"), list(makeSymbol("FIM"), makeSymbol("SISTER"), list(QUOTE, makeSymbol("GET-OBLIQUE-OBJECT")))))))),
	    list(RET, list(makeSymbol("FWHEN"), makeSymbol("COMPLEMENT"), list(makeSymbol("LIST"), makeSymbol("COMPLEMENT")))))));

    protected static final SubLList $list_alt244 = list(makeString("@return word-tree-p; the determiner of this noun or nil if there is none"),
	    list(makeSymbol("CLET"), list(list(makeSymbol("DET"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("FIND-LAST")), list(QUOTE, makeSymbol("DETERMINER-WORD-TREE-P")), list(makeSymbol("1-"), makeSymbol("IDX"))))),
		    list(makeSymbol("PWHEN"), makeSymbol("DET"), list(RET, makeSymbol("DET"))),
		    list(makeSymbol("CSETQ"), makeSymbol("DET"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("FIND-LAST")), list(QUOTE, makeSymbol("WHADJP-TREE-P")))),
		    list(makeSymbol("PWHEN"), makeSymbol("DET"), list(makeSymbol("CSETQ"), makeSymbol("DET"), list(makeSymbol("FIM"), makeSymbol("DET"), list(QUOTE, makeSymbol("FIND-FIRST")), list(QUOTE, makeSymbol("DETERMINER-WORD-TREE-P"))))),
		    list(RET, makeSymbol("DET"))));

    protected static final SubLList $list_alt251 = list(makeString("@return word-tree-p; the visible quantifier of this noun of nil if there is none"),
	    list(makeSymbol("CLET"), list(list(makeSymbol("QUANT"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("FIND-LAST")), list(QUOTE, makeSymbol("QUANTIFIER-TREE-P")), list(makeSymbol("1-"), makeSymbol("IDX"))))),
		    list(makeSymbol("PWHEN"), makeSymbol("QUANT"), list(RET, makeSymbol("QUANT"))), list(RET, list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-DETERMINER"))))));

    protected static final SubLList $list_alt255 = list(makeString("@return determiner-word-tree-p; an empty (null) determiner for this word"),
	    list(RET, list(makeSymbol("GET-NULL-DETERMINER"), reader_make_constant_shell("thereExists"), reader_make_constant_shell("and"), makeSymbol("SELF"), makeSymbol("CONTEXT"))));

    protected static final SubLList $list_alt266 = list(makeKeyword("RESTR"), makeKeyword("SCOPE"));

    protected static final SubLList $list_alt269 = list(makeString("@return phrase-tree-p; the possessor phrase of this noun"),
	    list(makeSymbol("CLET"), list(list(makeSymbol("NP"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("FIND-LAST")), list(QUOTE, makeSymbol("NOMINAL-PHRASE-TREE-P")), makeSymbol("IDX")))),
		    list(RET, list(makeSymbol("FIF"), list(makeSymbol("CAND"), makeSymbol("NP"), list(makeSymbol("FIM"), makeSymbol("NP"), list(QUOTE, makeSymbol("POSSESSIVE-P")))), makeSymbol("NP"),
			    list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("FIND-LAST")), list(QUOTE, makeSymbol("PRP$-TREE-P")), makeSymbol("IDX"))))));

    protected static final SubLList $list_alt27 = list(list(makeSymbol("CLET"),
	    list(list(makeSymbol("FILTERED"), NIL), list(makeSymbol("TREE-KEYWORDS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("TREE-KEYWORD-EQ-CLASSES")))), list(makeSymbol("LEX-SCORES"), NIL), list(makeSymbol("MAX-SCORE"), makeInteger(-5))),
	    list(makeSymbol("CDOLIST"), list(makeSymbol("RLE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-RANKED-LEXES")))),
		    list(makeSymbol("CLET"), list(list(makeSymbol("LEX-SCORE"), list(makeSymbol("LEX-ENTRY-SCORE"), list(makeSymbol("RLE-LEX"), makeSymbol("RLE")), makeSymbol("TREE-KEYWORDS")))), list(makeSymbol("RLE-SET-CONFIDENCE"), makeSymbol("RLE"), makeSymbol("LEX-SCORE")),
			    list(makeSymbol("CPUSH"), makeSymbol("RLE"), makeSymbol("LEX-SCORES")), list(makeSymbol("PWHEN"), list(makeSymbol(">"), makeSymbol("LEX-SCORE"), makeSymbol("MAX-SCORE")), list(makeSymbol("CSETQ"), makeSymbol("MAX-SCORE"), makeSymbol("LEX-SCORE"))))),
	    list(makeSymbol("CDOLIST"), list(makeSymbol("RLE"), makeSymbol("LEX-SCORES")), list(makeSymbol("PWHEN"), list(makeSymbol("="), list(makeSymbol("RLE-CONFIDENCE"), makeSymbol("RLE")), makeSymbol("MAX-SCORE")), list(makeSymbol("CPUSH"), makeSymbol("RLE"), makeSymbol("FILTERED")))),
	    list(makeSymbol("CSETQ"), makeSymbol("LEXES"), makeSymbol("FILTERED")), list(RET, makeSymbol("LEXES"))));

    protected static final SubLList $list_alt276 = list(makeString("@return phrase-tree-p; the specifier phrase of this noun"),
	    list(makeSymbol("CLET"), list(list(makeSymbol("SPECIFIER"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-DETERMINER"))))),
		    list(makeSymbol("PUNLESS"), makeSymbol("SPECIFIER"), list(makeSymbol("CSETQ"), makeSymbol("SPECIFIER"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-QUANTIFIER"))))),
		    list(makeSymbol("PUNLESS"), makeSymbol("SPECIFIER"), list(makeSymbol("CSETQ"), makeSymbol("SPECIFIER"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-POSSESSOR"))))), list(RET, makeSymbol("SPECIFIER"))));

    protected static final SubLList $list_alt279 = list(makeString("@return parse-tree-p; the tree that serves as an antecedent to this noun"), list(RET, NIL));

    protected static final SubLList $list_alt282 = list(makeString("@return listp; a list of genders of this noun with possible gender values \n   :FEMININE, :MASCULINE and :NEUTER"),
	    list(makeSymbol("CLET"), list(list(makeSymbol("GENDERS"), NIL)),
		    list(makeSymbol("CDOLIST"), list(makeSymbol("LEX"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-LEXES")))),
			    list(makeSymbol("CSETQ"), makeSymbol("GENDERS"), list(makeSymbol("APPEND"), list(makeSymbol("FIM"), makeSymbol("LEX"), list(QUOTE, makeSymbol("GET")), makeKeyword("GENDER")), makeSymbol("GENDERS")))),
		    list(RET, list(makeSymbol("REMOVE-DUPLICATES"), makeSymbol("GENDERS"), list(QUOTE, EQL)))));

    protected static final SubLList $list_alt286 = list(makeString("@return numberp; the person of this noun; 1, 2, or 3"), list(RET, THREE_INTEGER));

    protected static final SubLList $list_alt288 = list(makeString("@return booleanp; t if this is singular, nil otherwise"),
	    list(RET, list(makeSymbol("BOOLEAN"), list(makeSymbol("MEMBER"), makeKeyword("SINGULAR"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-NUMBER"))), list(QUOTE, EQL)))));

    protected static final SubLList $list_alt291 = list(makeString("@return boolenanp; t if this tree is plural, nil otherwise"),
	    list(RET, list(makeSymbol("BOOLEAN"), list(makeSymbol("MEMBER"), makeKeyword("PLURAL"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-NUMBER"))), list(QUOTE, EQL)))));

    protected static final SubLList $list_alt294 = list(makeString("@return listp; the list of trees this nominal word tree modifies"),
	    list(makeSymbol("CLET"), list(list(makeSymbol("MODIFIEDS"), NIL), list(makeSymbol("ANCESTORS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-ANCESTORS")))), list(makeSymbol("SUCCESS?"), NIL)),
		    list(makeSymbol("CSOME"), list(makeSymbol("ANCESTOR"), makeSymbol("ANCESTORS"), makeSymbol("SUCCESS?")),
			    list(makeSymbol("PWHEN"),
				    list(makeSymbol("CAND"), list(makeSymbol("APPOSITIVE-NP-P"), makeSymbol("ANCESTOR")),
					    list(EQ, list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("ANCESTOR"), list(QUOTE, makeSymbol("GET-DAUGHTER")), TWO_INTEGER), list(QUOTE, makeSymbol("GET-HEAD"))), makeSymbol("SELF")),
					    list(makeSymbol("FIM"), makeSymbol("ANCESTOR"), list(QUOTE, makeSymbol("GET-DAUGHTER")), ZERO_INTEGER),
					    list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("ANCESTOR"), list(QUOTE, makeSymbol("GET-DAUGHTER")), ZERO_INTEGER), list(QUOTE, makeSymbol("GET-HEAD")))),
				    list(makeSymbol("CPUSH"), list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("ANCESTOR"), list(QUOTE, makeSymbol("GET-DAUGHTER")), ZERO_INTEGER), list(QUOTE, makeSymbol("GET-HEAD"))), makeSymbol("MODIFIEDS")),
				    list(makeSymbol("CSETQ"), makeSymbol("SUCCESS?"), T))),
		    list(makeSymbol("CSETQ"), makeSymbol("SUCCESS?"), NIL),
		    list(makeSymbol("CSOME"), list(makeSymbol("ANCESTOR"), makeSymbol("ANCESTORS"), makeSymbol("SUCCESS?")),
			    list(makeSymbol("PWHEN"),
				    list(makeSymbol("CAND"), list(makeSymbol("VERBAL-TREE-P"), makeSymbol("ANCESTOR")), list(makeSymbol("FIM"), makeSymbol("ANCESTOR"), list(QUOTE, makeSymbol("COPULA-P"))),
					    list(makeSymbol("FIM"), makeSymbol("ANCESTOR"), list(QUOTE, makeSymbol("GET-OBJECTS"))),
					    list(EQ, makeSymbol("SELF"), list(makeSymbol("FIM"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("ANCESTOR"), list(QUOTE, makeSymbol("GET-OBJECTS")))), list(QUOTE, makeSymbol("GET-HEAD")))),
					    list(makeSymbol("FIM"), makeSymbol("ANCESTOR"), list(QUOTE, makeSymbol("GET-SUBJECT")))),
				    list(makeSymbol("CPUSH"), list(makeSymbol("FIM"), makeSymbol("ANCESTOR"), list(QUOTE, makeSymbol("GET-SUBJECT"))), makeSymbol("MODIFIEDS")), list(makeSymbol("CSETQ"), makeSymbol("SUCCESS?"), T))),
		    list(makeSymbol("PWHEN"), list(makeSymbol("NOMINAL-TREE-P"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SISTER")), ONE_INTEGER)),
			    list(makeSymbol("CPUSH"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SISTER")), ONE_INTEGER), makeSymbol("MODIFIEDS"))),
		    list(makeSymbol("PWHEN"), list(makeSymbol("TEMPORAL-TREE-P"), makeSymbol("SELF")), list(makeSymbol("CSETQ"), makeSymbol("SUCCESS?"), NIL),
			    list(makeSymbol("CSOME"), list(makeSymbol("ANCESTOR"), makeSymbol("ANCESTORS"), makeSymbol("SUCCESS?")),
				    list(makeSymbol("PWHEN"), list(makeSymbol("VERBAL-TREE-P"), makeSymbol("ANCESTOR")),
					    list(makeSymbol("CDOLIST"), list(makeSymbol("HEAD"), list(makeSymbol("FIM"), makeSymbol("ANCESTOR"), list(QUOTE, makeSymbol("GET-HEADS")))), list(makeSymbol("CPUSH"), makeSymbol("HEAD"), makeSymbol("MODIFIEDS"))),
					    list(makeSymbol("CSETQ"), makeSymbol("SUCCESS?"), T)))),
		    list(RET, makeSymbol("MODIFIEDS"))));

    protected static final SubLList $list_alt3 = list(new SubLObject[] { list(makeSymbol("LEXES"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("REFS"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")),
	    list(makeSymbol("ABS-IDX"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-STRING"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ABS-INDEX"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-LEXES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-RANKED-LEXES"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-REFS"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SET-REFS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("YIELD"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PARSE-EXPRESSION"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-HEADS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-HEAD"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SEMANTIC-HEADS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PP-COMPLEMENT"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-OBLIQUE-OBJECT"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-COMPLEMENTS"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SEMANTIC-COMPLEMENTS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PARTITION-SEMANTIC-COMPLEMENTS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MODIFIERS"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MODIFIEDS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEMPORAL-TREE-P"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RELATIVE-PRONOUN-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PPS"), NIL, makeKeyword("PROTECTED")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LOGICAL-FORM-INT"), NIL, makeKeyword("PROTECTED")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KEYWORD-RENAMINGS"), list(makeSymbol("&OPTIONAL"), makeSymbol("KEYWORDS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CYCLIFY-INT"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CYCLIFY-NUCLEUS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LEXIFY-INT"), list(makeSymbol("LEXICON")), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TREE-KEYWORD-EQ-CLASSES"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("POS-FILTER-LEXES"), NIL, makeKeyword("PROTECTED"), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FRAME-FILTER-LEXES"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PP-COMP-FILTER-LEXES"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("MODIFIED-DEPENDENT-MEANING-P"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("RETOKENIZE"), list(makeSymbol("LEXICON")), makeKeyword("PROTECTED")) });

    protected static final SubLList $list_alt304 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-NUMBER"), NIL, makeKeyword("PUBLIC")));

    protected static final SubLList $list_alt307 = list(makeString("@return listp; the list of all numbers of this noun"), list(RET, list(QUOTE, list(makeKeyword("SINGULAR")))));

    protected static final SubLList $list_alt308 = list(makeKeyword("SINGULAR"));

    protected static final SubLList $list_alt311 = list(makeSymbol("NAME-WORD"));

    protected static final SubLList $list_alt312 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-QUANTIFIER"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")));

    protected static final SubLList $list_alt313 = list(list(makeSymbol("CLET"), list(list(makeSymbol("QUANTIFIER"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-OVERT-QUANTIFIER"))))),
	    list(RET, list(makeSymbol("FIF"), list(makeSymbol("CAND"), list(makeSymbol("CNOT"), makeSymbol("QUANTIFIER")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PLURAL-P")))),
		    list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-EXISTENTIAL-NULL-DETERMINER"))), makeSymbol("QUANTIFIER")))));

    protected static final SubLList $list_alt318 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-OVERT-QUANTIFIER"), NIL, makeKeyword("PROTECTED")));

    protected static final SubLList $list_alt321 = list(makeString("@return word-tree-p; the visible quantifier of this noun of nil if there is none"), list(makeSymbol("CLET"),
	    list(list(makeSymbol("QUANT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SISTER")), ONE_INTEGER))), list(makeSymbol("PWHEN"), list(makeSymbol("CARDINAL-WORD-TREE-P"), makeSymbol("QUANT")), list(RET, makeSymbol("QUANT")))));

    protected static final SubLList $list_alt33 = list(list(makeSymbol("CLET"), list(list(makeSymbol("FILTERED"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("RLE"), makeSymbol("LEXES")), list(makeSymbol("PCOND"),
	    list(list(makeSymbol("MEMBER"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-CATEGORY"))), list(makeSymbol("FIM"), list(makeSymbol("RLE-LEX"), makeSymbol("RLE")), list(QUOTE, makeSymbol("GET")), makeKeyword("PENN-TAGS"))),
		    list(makeSymbol("RLE-SET-CONFIDENCE"), makeSymbol("RLE"), ONE_INTEGER), list(makeSymbol("CPUSH"), makeSymbol("RLE"), makeSymbol("FILTERED"))),
	    list(list(makeSymbol("MEMBER"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-CATEGORY"))), list(makeSymbol("FIM"), list(makeSymbol("RLE-LEX"), makeSymbol("RLE")), list(QUOTE, makeSymbol("GET")), makeKeyword("BACKOFF-PENN-TAGS"))),
		    list(makeSymbol("RLE-SET-CONFIDENCE"), makeSymbol("RLE"), makeDouble(0.75)), list(makeSymbol("CPUSH"), makeSymbol("RLE"), makeSymbol("FILTERED"))))),
	    list(makeSymbol("CSETQ"), makeSymbol("LEXES"), makeSymbol("FILTERED")), list(RET, makeSymbol("LEXES"))));

    protected static final SubLList $list_alt330 = list(makeString("@return listp; the list of all numbers of this noun"), list(RET, list(QUOTE, list(makeKeyword("PLURAL")))));

    protected static final SubLList $list_alt331 = list(makeKeyword("PLURAL"));

    protected static final SubLList $list_alt338 = list(makeSymbol("PRONOUN-TREE"));

    protected static final SubLList $list_alt339 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-NUMBER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PERSON"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-GENDER"), NIL, makeKeyword("PUBLIC")));

    protected static final SubLList $list_alt342 = list(makeString("I"), makeString("you"), makeString("he"), makeString("she"), makeString("it"), makeString("me"), makeString("him"), makeString("her"));

    protected static final SubLList $list_alt343 = list(makeString("we"), makeString("you"), makeString("they"), makeString("us"), makeString("them"));

    protected static final SubLList $list_alt344 = list(makeString("@return listp; a list of numbers of this pronoun with possible number values\n   :SINGULAR and :PLURAL"),
	    list(makeSymbol("CLET"), list(list(makeSymbol("NUMBERS"), NIL)),
		    list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER?"), makeSymbol("STRING"), makeSymbol("*SINGULAR-PERSONAL-PRONOUNS*"), list(QUOTE, EQUALP)), list(makeSymbol("CPUSH"), makeKeyword("SINGULAR"), makeSymbol("NUMBERS"))),
		    list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER?"), makeSymbol("STRING"), makeSymbol("*PLURAL-PERSONAL-PRONOUNS*"), list(QUOTE, EQUALP)), list(makeSymbol("CPUSH"), makeKeyword("PLURAL"), makeSymbol("NUMBERS"))), list(RET, makeSymbol("NUMBERS"))));

    protected static final SubLList $list_alt347 = list(makeString("@return keywordp; the person of this pronoun"),
	    list(RET, list(makeSymbol("FCOND"), list(list(EQUALP, makeSymbol("STRING"), makeString("I")), ONE_INTEGER), list(list(EQUALP, makeSymbol("STRING"), makeString("me")), ONE_INTEGER), list(list(EQUALP, makeSymbol("STRING"), makeString("you")), TWO_INTEGER),
		    list(list(EQUALP, makeSymbol("STRING"), makeString("we")), ONE_INTEGER), list(list(EQUALP, makeSymbol("STRING"), makeString("us")), ONE_INTEGER), list(T, THREE_INTEGER))));

    protected static final SubLList $list_alt355 = list(makeString("@return listp; a list of genders of this pronoun with possible gender values \n   :FEMININE, :MASCULINE and :NEUTER"),
	    list(RET,
		    list(makeSymbol("CDR"),
			    list(makeSymbol("ASSOC"), makeSymbol("STRING"),
				    list(QUOTE,
					    list(new SubLObject[] { list(makeString("I"), makeKeyword("MASCULINE"), makeKeyword("FEMININE")), list(makeString("me"), makeKeyword("MASCULINE"), makeKeyword("FEMININE")), list(makeString("you"), makeKeyword("MASCULINE"), makeKeyword("FEMININE")),
						    list(makeString("he"), makeKeyword("MASCULINE")), list(makeString("him"), makeKeyword("MASCULINE")), list(makeString("she"), makeKeyword("FEMININE")), list(makeString("her"), makeKeyword("FEMININE")), list(makeString("it"), makeKeyword("NEUTER")),
						    list(makeString("we"), makeKeyword("MASCULINE"), makeKeyword("FEMININE")), list(makeString("us"), makeKeyword("MASCULINE"), makeKeyword("FEMININE")),
						    list(makeString("they"), makeKeyword("MASCULINE"), makeKeyword("FEMININE"), makeKeyword("NEUTER")), list(makeString("them"), makeKeyword("MASCULINE"), makeKeyword("FEMININE"), makeKeyword("NEUTER")) })),
				    list(QUOTE, EQUALP)))));

    protected static final SubLList $list_alt357 = list(new SubLObject[] { list(makeString("I"), makeKeyword("MASCULINE"), makeKeyword("FEMININE")), list(makeString("me"), makeKeyword("MASCULINE"), makeKeyword("FEMININE")), list(makeString("you"), makeKeyword("MASCULINE"), makeKeyword("FEMININE")),
	    list(makeString("he"), makeKeyword("MASCULINE")), list(makeString("him"), makeKeyword("MASCULINE")), list(makeString("she"), makeKeyword("FEMININE")), list(makeString("her"), makeKeyword("FEMININE")), list(makeString("it"), makeKeyword("NEUTER")),
	    list(makeString("we"), makeKeyword("MASCULINE"), makeKeyword("FEMININE")), list(makeString("us"), makeKeyword("MASCULINE"), makeKeyword("FEMININE")), list(makeString("they"), makeKeyword("MASCULINE"), makeKeyword("FEMININE"), makeKeyword("NEUTER")),
	    list(makeString("them"), makeKeyword("MASCULINE"), makeKeyword("FEMININE"), makeKeyword("NEUTER")) });

    protected static final SubLList $list_alt360 = list(makeSymbol("WH-TREE"), makeSymbol("QUANTIFIER-TREE"));

    protected static final SubLList $list_alt361 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-REFS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ANTECEDENT"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-QUANTIFIER"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-NUMBER"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-GENDER"), NIL, makeKeyword("PUBLIC")));

    protected static final SubLList $list_alt364 = list(makeString("@return listp; the unique referents of this phrase"), list(makeSymbol("CLET"), list(list(makeSymbol("ANTECEDENT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-ANTECEDENT"))))),
	    list(RET, list(makeSymbol("FIF"), makeSymbol("ANTECEDENT"), list(makeSymbol("FIM"), makeSymbol("ANTECEDENT"), list(QUOTE, makeSymbol("GET-REFS"))), makeSymbol("REFS")))));

    protected static final SubLList $list_alt367 = list(makeString("@return parse-tree-p; the tree that serves as an antecedent to this wh word"),
	    list(makeSymbol("CLET"),
		    list(list(makeSymbol("GRANDMOTHER"), list(makeSymbol("FWHEN"), makeSymbol("MOTHER"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("GET-MOTHER"))))),
			    list(makeSymbol("GREAT-GRANDMOTHER"), list(makeSymbol("FWHEN"), makeSymbol("GRANDMOTHER"), list(makeSymbol("FIM"), makeSymbol("GRANDMOTHER"), list(QUOTE, makeSymbol("GET-MOTHER")))))),
		    list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("NP-TREE-P"), makeSymbol("GREAT-GRANDMOTHER")), list(makeSymbol("NP-TREE-P"), list(makeSymbol("FIM"), makeSymbol("GREAT-GRANDMOTHER"), list(QUOTE, makeSymbol("GET-DAUGHTER")), ZERO_INTEGER))),
			    list(RET, list(makeSymbol("FIM"), makeSymbol("GREAT-GRANDMOTHER"), list(QUOTE, makeSymbol("GET-DAUGHTER")), ZERO_INTEGER)))));

    protected static final SubLList $list_alt370 = list(makeString("@return word-tree-p; the quantifier of this name, or nil if there is none"),
	    list(RET, list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("FIND-LAST")), list(QUOTE, makeSymbol("QUANTIFIER-TREE-P")), list(makeSymbol("1-"), makeSymbol("IDX")))));

    protected static final SubLList $list_alt373 = list(makeString("@return listp; a list of numbers of this wp with possible number values\n   :SINGULAR and :PLURAL"), list(RET, list(QUOTE, list(makeKeyword("SINGULAR")))));

    protected static final SubLList $list_alt375 = list(makeString("@return listp; a list of genders of this pronoun with possible gender values \n   :FEMININE, :MASCULINE and :NEUTER"),
	    list(RET, list(QUOTE, list(makeKeyword("MASCULINE"), makeKeyword("FEMININE"), makeKeyword("NEUTER")))));

    protected static final SubLList $list_alt376 = list(makeKeyword("MASCULINE"), makeKeyword("FEMININE"), makeKeyword("NEUTER"));

    protected static final SubLList $list_alt380 = list(makeSymbol("VERBAL-TREE"), makeSymbol("VERBAL-WORD"));

    protected static final SubLList $list_alt381 = list(new SubLObject[] { list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PREDICATE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-NUMBER"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PERSON"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TENSE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SUBJECT"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-OBJECTS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DIRECT-OBJECT"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-INDIRECT-OBJECT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SEMANTIC-DIRECT-OBJECT"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SEMANTIC-INDIRECT-OBJECT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SEMANTIC-OBJECTS"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-VERBAL-COMPLEMENT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ADJECTIVAL-COMPLEMENT"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-COMPLEMENTS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MATRIX-CLAUSE"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PARTICLE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-INFINITIVE-MARKER"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("DUMMY-TO-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("FINITE-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PASSIVE-P"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INFINITIVE-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("BASE-P"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CONTROL-VERB-P"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SUBJECT-CONTROLLER-P"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("OBJECT-CONTROLLER-P"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CONTROL-VERB-P"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONTROL-VERB"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-CONTROLLER"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ANCESTOR-OBJECTS"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MOVED-NPS"), NIL, makeKeyword("PROTECTED")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MOVED-OBJECTS"), NIL, makeKeyword("PROTECTED")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KEYWORD-RENAMINGS"), list(makeSymbol("&OPTIONAL"), makeSymbol("KEYWORDS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PARTITION-SEMANTIC-COMPLEMENTS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PARTICLE-FILTER-LEXES"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INVERTED-P"), NIL, makeKeyword("PROTECTED")) });

    protected static final SubLList $list_alt382 = list(list(makeSymbol("CLET"),
	    list(list(makeSymbol("FILTERED"), NIL), list(makeSymbol("SENTENCE-PARTICLE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-PARTICLE")))),
		    list(makeSymbol("SENTENCE-PARTICLE-HEAD"), list(makeSymbol("FWHEN"), makeSymbol("SENTENCE-PARTICLE"), list(makeSymbol("FIM"), makeSymbol("SENTENCE-PARTICLE"), list(QUOTE, makeSymbol("GET-HEAD"))))), makeSymbol("FRAME")),
	    list(makeSymbol("CDOLIST"), list(makeSymbol("RLE"), makeSymbol("LEXES")), list(makeSymbol("CSETQ"), makeSymbol("FRAME"), list(makeSymbol("FIM"), list(makeSymbol("RLE-LEX"), makeSymbol("RLE")), list(QUOTE, makeSymbol("GET")), makeKeyword("FRAME"))),
		    list(makeSymbol("PIF"), list(makeSymbol("CAND"), list(makeSymbol("FORMULA-ARG2"), makeSymbol("FRAME")), list(makeSymbol("ISA?"), makeSymbol("FRAME"), reader_make_constant_shell("ParticleFrameType"), reader_make_constant_shell("EverythingPSC"))),
			    list(makeSymbol("PWHEN"), makeSymbol("SENTENCE-PARTICLE-HEAD"),
				    list(makeSymbol("CLET"), list(list(makeSymbol("REQUIRED-PARTICLE-STRING"), list(makeSymbol("FIRST"), list(makeSymbol("GET-STRINGS-OF-TYPE"), list(makeSymbol("FORMULA-ARG2"), makeSymbol("FRAME")), reader_make_constant_shell("VerbParticle"))))),
					    list(makeSymbol("PWHEN"), list(EQUALP, makeSymbol("REQUIRED-PARTICLE-STRING"), list(makeSymbol("FIM"), makeSymbol("SENTENCE-PARTICLE-HEAD"), list(QUOTE, makeSymbol("GET-STRING")))),
						    list(makeSymbol("RLE-SET-CONFIDENCE"), makeSymbol("RLE"), ONE_INTEGER), list(makeSymbol("CPUSH"), makeSymbol("RLE"), makeSymbol("FILTERED"))))),
			    list(makeSymbol("PUNLESS"), makeSymbol("SENTENCE-PARTICLE-HEAD"), list(makeSymbol("CPUSH"), makeSymbol("RLE"), makeSymbol("FILTERED"))))),
	    list(makeSymbol("CSETQ"), makeSymbol("LEXES"), makeSymbol("FILTERED")), list(RET, makeSymbol("LEXES"))));

    protected static final SubLList $list_alt388 = list(list(makeSymbol("CLET"),
	    list(list(makeSymbol("SUBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SEMANTIC-SUBJECT")))),
		    list(makeSymbol("NON-DISTRIBUTING"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SEMANTIC-COMPLEMENTS"))))),
	    list(makeSymbol("PWHEN"), makeSymbol("SUBJECT"), list(makeSymbol("CSETQ"), makeSymbol("NON-DISTRIBUTING"), list(makeSymbol("DELETE-CYCLIFIABLE"), makeSymbol("SUBJECT"), makeSymbol("NON-DISTRIBUTING")))),
	    list(RET, list(makeSymbol("VALUES"), makeSymbol("NON-DISTRIBUTING"), list(makeSymbol("FWHEN"), makeSymbol("SUBJECT"), list(makeSymbol("LIST"), makeSymbol("SUBJECT")))))));

    protected static final SubLList $list_alt391 = list(makeSymbol("&OPTIONAL"),
	    list(makeSymbol("KEYWORDS"), list(QUOTE, list(makeKeyword("ACTION"), makeKeyword("SUBJECT"), makeKeyword("OBJECT"), makeKeyword("OBLIQUE-OBJECT"), makeKeyword("CLAUSE"), makeKeyword("INF-COMP"), $NOUN))));

    protected static final SubLList $list_alt392 = list(list(new SubLObject[] { makeSymbol("CLET"), list(list(makeSymbol("CONJUNCTS"), NIL), list(makeSymbol("DISJUNCTS"), NIL),
	    list(makeSymbol("SUBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SEMANTIC-SUBJECT")))), list(makeSymbol("DIRECT-OBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SEMANTIC-DIRECT-OBJECT")))),
	    list(makeSymbol("INDIRECT-OBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SEMANTIC-INDIRECT-OBJECT")))),
	    list(makeSymbol("OBLIQUE-OBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-OBLIQUE-OBJECT")))), list(makeSymbol("CL-COMPLEMENT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-VERBAL-COMPLEMENT")))),
	    list(makeSymbol("MODIFIED"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-MODIFIEDS")))))),
	    list(makeSymbol("PWHEN"),
		    list(makeSymbol("CAND"), list(makeSymbol("MEMBER?"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-CATEGORY"))), list(QUOTE, list(makeKeyword("VBN"), makeKeyword("VBG"))), list(QUOTE, EQL)),
			    list(makeSymbol("CNOT"), makeSymbol("SUBJECT"))),
		    list(makeSymbol("CSETQ"), makeSymbol("SUBJECT"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-MODIFIEDS")))))),
	    list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER?"), makeKeyword("ACTION"), makeSymbol("KEYWORDS"), list(QUOTE, EQL)), list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("ACTION"), makeSymbol("SELF")), makeSymbol("CONJUNCTS"))),
	    list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("SUBJECT"), list(makeSymbol("MEMBER"), makeKeyword("SUBJECT"), makeSymbol("KEYWORDS"), list(QUOTE, EQL))),
		    list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("SUBJECT"), makeSymbol("SUBJECT")), makeSymbol("CONJUNCTS"))),
	    list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("DIRECT-OBJECT"), list(makeSymbol("MEMBER"), makeKeyword("OBJECT"), makeSymbol("KEYWORDS"), list(QUOTE, EQL))),
		    list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("OBJECT"), makeSymbol("DIRECT-OBJECT")), makeSymbol("CONJUNCTS"))),
	    list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("INDIRECT-OBJECT"), list(makeSymbol("MEMBER"), makeKeyword("OBLIQUE-OBJECT"), makeSymbol("KEYWORDS"), list(QUOTE, EQL))),
		    list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("OBLIQUE-OBJECT"), makeSymbol("INDIRECT-OBJECT")), makeSymbol("CONJUNCTS"))),
	    list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("OBLIQUE-OBJECT"), list(makeSymbol("MEMBER"), makeKeyword("OBLIQUE-OBJECT"), makeSymbol("KEYWORDS"), list(QUOTE, EQL))),
		    list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("PREP-OBJECT"), makeSymbol("OBLIQUE-OBJECT")), makeSymbol("CONJUNCTS"))),
	    list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("MODIFIED"), list(makeSymbol("MEMBER"), $NOUN, makeSymbol("KEYWORDS"), list(QUOTE, EQL))),
		    list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), $NOUN, makeSymbol("MODIFIED")), makeSymbol("CONJUNCTS"))),
	    list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("CL-COMPLEMENT"), list(makeSymbol("MEMBER"), makeKeyword("CLAUSE"), makeSymbol("KEYWORDS"), list(QUOTE, EQL))),
		    list(makeSymbol("CLET"), list(list(makeSymbol("CL-CYCLS"), list(makeSymbol("FIM"), makeSymbol("CL-COMPLEMENT"), list(QUOTE, makeSymbol("CYCLIFY-INT"))))),
			    list(makeSymbol("CDOLIST"), list(makeSymbol("CL-CYCL"), makeSymbol("CL-CYCLS")), list(makeSymbol("CSETQ"), makeSymbol("CL-CYCL"), list(makeSymbol("LIFT-CONJUNCTS"), makeSymbol("CL-CYCL"))),
				    list(makeSymbol("CPUSH"), list(makeSymbol("CONS"), makeKeyword("CLAUSE"), makeSymbol("CL-CYCL")), makeSymbol("DISJUNCTS"))))),
	    list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("CL-COMPLEMENT"), list(makeSymbol("MEMBER"), makeKeyword("INF-COMP"), makeSymbol("KEYWORDS"), list(QUOTE, EQL))),
		    list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("INF-COMP"), makeSymbol("CL-COMPLEMENT")), makeSymbol("CONJUNCTS"))),
	    list(RET, list(makeSymbol("DISJUNCTIVE-KEYWORD-RENAMINGS"), makeSymbol("CONJUNCTS"), makeSymbol("DISJUNCTS"))) }));

    protected static final SubLList $list_alt393 = list(makeKeyword("ACTION"), makeKeyword("SUBJECT"), makeKeyword("OBJECT"), makeKeyword("OBLIQUE-OBJECT"), makeKeyword("CLAUSE"), makeKeyword("INF-COMP"), $NOUN);

    protected static final SubLList $list_alt397 = list(makeKeyword("VBN"), makeKeyword("VBG"));

    protected static final SubLList $list_alt40 = list(list(RET,
	    list(makeSymbol("KEYWORD-EQ-CLASSES"), list(makeSymbol("MAPCAR"), list(QUOTE, makeSymbol("CAR")), list(makeSymbol("FIRST"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-KEYWORD-RENAMINGS")))))))));

    protected static final SubLList $list_alt405 = list(list(makeSymbol("CLET"), list(list(makeSymbol("CONTROL-VERB"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-CONTROL-VERB"))))),
	    list(makeSymbol("PCOND"), list(list(makeSymbol("NULL"), makeSymbol("CONTROL-VERB")), list(RET, NIL)),
		    list(list(makeSymbol("FIM"), makeSymbol("CONTROL-VERB"), list(QUOTE, makeSymbol("SUBJECT-CONTROLLER-P"))), list(RET, list(makeSymbol("FIM"), makeSymbol("CONTROL-VERB"), list(QUOTE, makeSymbol("GET-SEMANTIC-SUBJECT"))))),
		    list(list(makeSymbol("FIM"), makeSymbol("CONTROL-VERB"), list(QUOTE, makeSymbol("OBJECT-CONTROLLER-P"))), list(RET, list(makeSymbol("FIM"), makeSymbol("CONTROL-VERB"), list(QUOTE, makeSymbol("GET-DIRECT-OBJECT"))))))));

    protected static final SubLList $list_alt411 = list(list(makeSymbol("CLET"),
	    list(list(makeSymbol("MATRIX"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-MATRIX-CLAUSE")))),
		    list(makeSymbol("MATRIX-HEAD"), list(makeSymbol("FWHEN"), makeSymbol("MATRIX"), list(makeSymbol("FIM"), makeSymbol("MATRIX"), list(QUOTE, makeSymbol("GET-HEAD")))))),
	    list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("MATRIX-HEAD"), list(makeSymbol("FIM"), makeSymbol("MATRIX-HEAD"), list(QUOTE, makeSymbol("CONTROL-VERB-P")))), list(RET, makeSymbol("MATRIX-HEAD")))));

    protected static final SubLList $list_alt415 = list(list(makeSymbol("CLET"), list(makeSymbol("RESULT")),
	    list(makeSymbol("CDOLIST"), list(makeSymbol("LEX"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-LEXES")))),
		    list(makeSymbol("CSETQ"), makeSymbol("RESULT"), list(makeSymbol("MEMBER"), list(makeSymbol("FIM"), makeSymbol("LEX"), list(QUOTE, makeSymbol("GET")), makeKeyword("FRAME")), list(QUOTE, list(reader_make_constant_shell("ObjectControlFrame"))))),
		    list(makeSymbol("PWHEN"), makeSymbol("RESULT"), list(RET, list(makeSymbol("BOOLEAN"), makeSymbol("RESULT")))))));

    protected static final SubLList $list_alt416 = list(reader_make_constant_shell("ObjectControlFrame"));

    protected static final SubLList $list_alt418 = list(list(makeSymbol("CLET"), list(makeSymbol("RESULT")),
	    list(makeSymbol("CDOLIST"), list(makeSymbol("LEX"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-LEXES")))),
		    list(makeSymbol("CSETQ"), makeSymbol("RESULT"),
			    list(makeSymbol("MEMBER"), list(makeSymbol("FIM"), makeSymbol("LEX"), list(QUOTE, makeSymbol("GET")), makeKeyword("FRAME")),
				    list(QUOTE, list(reader_make_constant_shell("IntransitiveSubjectControlFrame"), reader_make_constant_shell("TransitiveSubjectControlFrame"))))),
		    list(makeSymbol("PWHEN"), makeSymbol("RESULT"), list(RET, list(makeSymbol("BOOLEAN"), makeSymbol("RESULT")))))));

    protected static final SubLList $list_alt419 = list(reader_make_constant_shell("IntransitiveSubjectControlFrame"), reader_make_constant_shell("TransitiveSubjectControlFrame"));

    protected static final SubLList $list_alt421 = list(
	    list(RET, list(makeSymbol("COR"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("SUBJECT-CONTROLLER-P"))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("OBJECT-CONTROLLER-P"))))));

    protected static final SubLList $list_alt423 = list(list(makeSymbol("CDOLIST"), list(makeSymbol("ANCESTOR"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-ANCESTORS")))),
	    list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("SENTENTIAL-TREE-P"), makeSymbol("ANCESTOR")), list(makeSymbol("CNOT"), list(EQ, list(makeSymbol("FIM"), makeSymbol("ANCESTOR"), list(QUOTE, makeSymbol("GET-HEAD"))), makeSymbol("SELF")))),
		    list(RET, makeSymbol("ANCESTOR")))),
	    list(RET, NIL));

    protected static final SubLList $list_alt428 = list(makeString("@return word-tree-p; the predicate of this sentence"), list(RET, list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SEMANTIC-HEAD")))));

    protected static final SubLList $list_alt431 = list(makeString("@return listp; a list of numbers of this verb with possible number values\n   :SINGULAR and :PLURAL"),
	    list(makeSymbol("PWHEN"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("FINITE-P"))), list(makeSymbol("CLET"), list(list(makeSymbol("SUBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SUBJECT"))))),
		    list(RET, list(makeSymbol("FWHEN"), makeSymbol("SUBJECT"), list(makeSymbol("FIM"), makeSymbol("SUBJECT"), list(QUOTE, makeSymbol("GET-NUMBER"))))))));

    protected static final SubLList $list_alt434 = list(makeString("@return numberp; the person of this verb; 1, 2, or 3"),
	    list(makeSymbol("PWHEN"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("FINITE-P"))), list(makeSymbol("CLET"), list(list(makeSymbol("SUBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SUBJECT"))))),
		    list(RET, list(makeSymbol("FWHEN"), makeSymbol("SUBJECT"), list(makeSymbol("FIM"), makeSymbol("SUBJECT"), list(QUOTE, makeSymbol("GET-PERSON"))))))));

    protected static final SubLList $list_alt437 = list(makeString("@return keywordp; the tense of this vp; either :PRESENT, :PAST, :FUTURE,\n   or :INFINITIVE"), list(RET, NIL));

    protected static final SubLList $list_alt439 = list(makeString("@return phrase-tree-p; the subject of this verb"),
	    list(makeSymbol("CLET"), list(list(makeSymbol("SUBJECT"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("FIND-LAST")), list(QUOTE, makeSymbol("NOMINAL-TREE-P")), list(makeSymbol("1-"), makeSymbol("IDX"))))),
		    list(makeSymbol("PWHEN"), makeSymbol("SUBJECT"), list(RET, makeSymbol("SUBJECT")))),
	    list(makeSymbol("CLET"), list(list(makeSymbol("CONTROLLER"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-CONTROLLER"))))), list(makeSymbol("PWHEN"), makeSymbol("CONTROLLER"), list(RET, makeSymbol("CONTROLLER")))),
	    list(makeSymbol("PWHEN"), list(makeSymbol("VERBAL-TREE-P"), makeSymbol("MOTHER")), list(RET, list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("GET-SUBJECT"))))));

    protected static final SubLList $list_alt443 = list(makeString("@return listp; a list of all objects of this verb"),
	    list(makeSymbol("CLET"),
		    list(list(makeSymbol("DIRECT-OBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-DIRECT-OBJECT")))),
			    list(makeSymbol("INDIRECT-OBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-INDIRECT-OBJECT")))), list(makeSymbol("OBJECTS"), NIL)),
		    list(makeSymbol("PWHEN"), makeSymbol("INDIRECT-OBJECT"), list(makeSymbol("CPUSH"), makeSymbol("INDIRECT-OBJECT"), makeSymbol("OBJECTS"))), list(makeSymbol("PWHEN"), makeSymbol("DIRECT-OBJECT"), list(makeSymbol("CPUSH"), makeSymbol("DIRECT-OBJECT"), makeSymbol("OBJECTS"))),
		    list(makeSymbol("PWHEN"), makeSymbol("MOTHER"),
			    list(makeSymbol("CDOLIST"), list(makeSymbol("PP"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("FIND")), list(QUOTE, makeSymbol("PREPOSITIONAL-OR-PARTICLE-PHRASE-TREE-P")))),
				    list(makeSymbol("PWHEN"), list(makeSymbol("FIM"), makeSymbol("PP"), list(QUOTE, makeSymbol("STRANDED-P"))),
					    list(makeSymbol("CSETQ"), makeSymbol("OBJECTS"), list(makeSymbol("DELETE"), list(makeSymbol("FIM"), makeSymbol("PP"), list(QUOTE, makeSymbol("GET-OBLIQUE-OBJECT"))), makeSymbol("OBJECTS")))))),
		    list(RET, makeSymbol("OBJECTS"))));

    protected static final SubLList $list_alt45 = list(makeSymbol("&OPTIONAL"), makeSymbol("RENAMINGS"));

    protected static final SubLList $list_alt450 = list(makeString("@return listp; the list of all non-local nps of this verb"),
	    list(makeSymbol("CLET"), list(makeSymbol("MOVED")),
		    list(makeSymbol("CSOME"), list(makeSymbol("ANCESTOR"), list(makeSymbol("CDR"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-ANCESTORS")))), makeSymbol("MOVED")), list(makeSymbol("PWHEN"),
			    list(makeSymbol("VERBAL-TREE-P"), makeSymbol("ANCESTOR")), list(makeSymbol("CSETQ"), makeSymbol("MOVED"), list(makeSymbol("FIM"), makeSymbol("ANCESTOR"), list(QUOTE, makeSymbol("FIND")), list(QUOTE, makeSymbol("WHNP-TREE-P")))))),
		    list(RET, makeSymbol("MOVED"))));

    protected static final SubLList $list_alt454 = list(makeString("@return listp; the list of all non-local ('moved') objects of this verb"),
	    list(RET, list(makeSymbol("DELETE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SUBJECT"))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-MOVED-NPS"))), list(QUOTE, EQ))));

    protected static final SubLList $list_alt456 = list(makeString("@return phrase-tree-p; the direct object of this verb"),
	    list(makeSymbol("CLET"),
		    list(list(makeSymbol("MOVED"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-MOVED-OBJECTS")))),
			    list(makeSymbol("LOCALS"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("FIND")), list(QUOTE, makeSymbol("NOMINAL-TREE-P")), list(makeSymbol("1+"), makeSymbol("IDX")))),
			    list(makeSymbol("N"), list(makeSymbol("LENGTH"), makeSymbol("LOCALS")))),
		    list(makeSymbol("PCOND"),
			    list(list(makeSymbol("="), makeSymbol("N"), TWO_INTEGER),
				    list(makeSymbol("PIF"), list(makeSymbol("FIM"), list(makeSymbol("SECOND"), makeSymbol("LOCALS")), list(QUOTE, makeSymbol("TEMPORAL-TREE-P"))), list(RET, list(makeSymbol("FIRST"), makeSymbol("LOCALS"))),
					    list(RET, list(makeSymbol("SECOND"), makeSymbol("LOCALS"))))),
			    list(list(makeSymbol("CAND"), list(makeSymbol("="), makeSymbol("N"), ONE_INTEGER), list(makeSymbol("CNOT"), makeSymbol("MOVED"))), list(RET, list(makeSymbol("FIRST"), makeSymbol("LOCALS")))),
			    list(list(makeSymbol("CAND"), list(makeSymbol("<"), makeSymbol("N"), TWO_INTEGER), makeSymbol("MOVED"), list(RET, list(makeSymbol("FIRST"), makeSymbol("MOVED"))))))));

    protected static final SubLList $list_alt459 = list(makeString("@return phrase-tree-p; the indirect object of this verb, including oblique objects\n   embedded within a PP"),
	    list(makeSymbol("CLET"), list(list(makeSymbol("OBLIQUE-OBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-OBLIQUE-OBJECT"))))), list(makeSymbol("PWHEN"), makeSymbol("OBLIQUE-OBJECT"), list(RET, makeSymbol("OBLIQUE-OBJECT")))),
	    list(makeSymbol("CLET"),
		    list(list(makeSymbol("MOVED"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-MOVED-OBJECTS")))),
			    list(makeSymbol("LOCALS"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("FIND")), list(QUOTE, makeSymbol("NOMINAL-TREE-P")), list(makeSymbol("1+"), makeSymbol("IDX")))),
			    list(makeSymbol("N"), list(makeSymbol("LENGTH"), makeSymbol("LOCALS")))),
		    list(makeSymbol("PCOND"), list(list(makeSymbol("CAND"), list(makeSymbol("="), makeSymbol("N"), TWO_INTEGER), list(makeSymbol("CNOT"), list(makeSymbol("FIM"), list(makeSymbol("SECOND"), makeSymbol("LOCALS")), list(QUOTE, makeSymbol("TEMPORAL-TREE-P"))))),
			    list(RET, list(makeSymbol("FIRST"), makeSymbol("LOCALS")))), list(list(makeSymbol("CAND"), list(makeSymbol("="), makeSymbol("N"), ONE_INTEGER), makeSymbol("MOVED"), list(RET, list(makeSymbol("FIRST"), makeSymbol("MOVED"))))))));

    protected static final SubLList $list_alt46 = list(list(makeSymbol("CLET"), list(list(makeSymbol("NDISTR-COMP-CYCLS"), NIL), list(makeSymbol("DISTR-COMP-CYCLS"), NIL), list(makeSymbol("MOD-CYCLS"), NIL), list(makeSymbol("CYCLS"), NIL)),
	    list(makeSymbol("WITHOUT-RECURSIVE-CYCLIFICATION"),
		    list(makeSymbol("PUNLESS"), makeSymbol("RENAMINGS"),
			    list(makeSymbol("CSETQ"), makeSymbol("RENAMINGS"),
				    list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-KEYWORD-RENAMINGS")), list(makeSymbol("REQUIRED-KEYWORDS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-RANKED-LEXES"))))))),
		    list(makeSymbol("CSETQ"), makeSymbol("RENAMINGS"), list(makeSymbol("GROUP-DISJUNCTIVE-RENAMINGS"), makeSymbol("RENAMINGS"))),
		    list(makeSymbol("CMULTIPLE-VALUE-BIND"), list(makeSymbol("NON-DISTRIBUTING"), makeSymbol("DISTRIBUTING")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PARTITION-SEMANTIC-COMPLEMENTS"))),
			    list(makeSymbol("CDOLIST"), list(makeSymbol("COMPLEMENT"), makeSymbol("NON-DISTRIBUTING")),
				    list(makeSymbol("CLET"), list(list(makeSymbol("COMP-CYCL"), list(makeSymbol("FIM"), makeSymbol("COMPLEMENT"), list(QUOTE, makeSymbol("CYCLIFY-INT"))))),
					    list(makeSymbol("PWHEN"), makeSymbol("COMP-CYCL"), list(makeSymbol("CPUSH"), makeSymbol("COMP-CYCL"), makeSymbol("NDISTR-COMP-CYCLS"))))),
			    list(makeSymbol("CDOLIST"), list(makeSymbol("COMPLEMENT"), makeSymbol("DISTRIBUTING")),
				    list(makeSymbol("CLET"), list(list(makeSymbol("COMP-CYCL"), list(makeSymbol("FIM"), makeSymbol("COMPLEMENT"), list(QUOTE, makeSymbol("CYCLIFY-INT"))))),
					    list(makeSymbol("PWHEN"), makeSymbol("COMP-CYCL"), list(makeSymbol("CPUSH"), makeSymbol("COMP-CYCL"), makeSymbol("DISTR-COMP-CYCLS"))))),
			    list(makeSymbol("CDOLIST"), list(makeSymbol("MODIFIER"), list(makeSymbol("FIM"), makeSymbol("SELF"),
				    list(QUOTE, makeSymbol("GET-MODIFIERS")))), list(
					    makeSymbol("CLET"), list(list(makeSymbol("MOD-CYCL"),
						    list(makeSymbol("FIM"), makeSymbol("MODIFIER"), list(QUOTE, makeSymbol("CYCLIFY-INT"))))),
					    list(makeSymbol("PWHEN"), makeSymbol("MOD-CYCL"), list(makeSymbol("CPUSH"), makeSymbol("MOD-CYCL"), makeSymbol("MOD-CYCLS"))))),
			    list(makeSymbol("CDOLIST"), list(makeSymbol("CONJUNCTION"), makeSymbol("RENAMINGS")), list(makeSymbol("CDOLIST"), list(makeSymbol("RLE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-RANKED-LEXES")))), list(makeSymbol("CLET"),
				    list(list(makeSymbol("MY-CYCLS0"), NIL)),
				    list(makeSymbol("CDOLIST"), list(makeSymbol("GROUPING"), makeSymbol("CONJUNCTION")), list(makeSymbol("CLET"), list(list(makeSymbol("THIS-AND-MODS"), NIL)), list(makeSymbol("CDOLIST"), list(makeSymbol("RENAMING"), makeSymbol("GROUPING")), list(makeSymbol("CPUSH"),
					    list(makeSymbol("MAPCAR"), list(QUOTE, makeSymbol("INSTANTIATE-SCOPE")),
						    list(makeSymbol("CROSS-PRODUCTS"), list(makeSymbol("CONS"), list(makeSymbol("LIST"), list(makeSymbol("APPLY-LEX-RENAMING"), makeSymbol("SELF"), makeSymbol("RLE"), makeSymbol("RENAMING"))), makeSymbol("MOD-CYCLS")))),
					    makeSymbol("THIS-AND-MODS"))),
					    list(makeSymbol("CPUSH"),
						    list(makeSymbol("MAPCAR"), list(QUOTE, makeSymbol("INSTANTIATE-SCOPE")),
							    list(makeSymbol("CROSS-PRODUCTS"),
								    list(makeSymbol("CONS"), list(makeSymbol("MAPCAR"), list(QUOTE, makeSymbol("INSTANTIATE-SCOPE")), list(makeSymbol("INDEXED-PRODUCTS"), makeSymbol("THIS-AND-MODS"))), makeSymbol("NDISTR-COMP-CYCLS")))),
						    makeSymbol("MY-CYCLS0")))),
				    list(makeSymbol("CSETQ"), makeSymbol("CYCLS"), list(makeSymbol("APPEND"), makeSymbol("CYCLS"), list(makeSymbol("MAPCAR"), list(QUOTE, makeSymbol("INSTANTIATE-SCOPE")), list(makeSymbol("INDEXED-PRODUCTS"), makeSymbol("MY-CYCLS0")))))))))),
	    list(RET, list(makeSymbol("MAPCAR"), list(QUOTE, makeSymbol("INSTANTIATE-SCOPE")), list(makeSymbol("CROSS-PRODUCTS"), list(makeSymbol("CONS"), makeSymbol("CYCLS"), makeSymbol("DISTR-COMP-CYCLS")))))));

    protected static final SubLList $list_alt462 = list(makeString("@return phrase-tree-p; the semantic direct object of this verb"), list(RET, list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-DIRECT-OBJECT")))));

    protected static final SubLList $list_alt464 = list(makeString("@return phrase-tree-p; the semantic indirect object of this verb"), list(RET, list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-INDIRECT-OBJECT")))));

    protected static final SubLList $list_alt466 = list(makeString("@return listp; a list of all verbal complements of this verb"),
	    list(RET, list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("FIND-FIRST")), list(QUOTE, makeSymbol("VERBAL-PHRASE-TREE-P")), list(makeSymbol("1+"), makeSymbol("IDX")))));

    protected static final SubLList $list_alt471 = list(makeString("@return adjp-tree-p; the adjectival complement of this verb"),
	    list(RET, list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("FIND-FIRST")), list(QUOTE, makeSymbol("ADJP-TREE-P")), list(makeSymbol("1+"), makeSymbol("IDX")))));

    protected static final SubLList $list_alt475 = list(makeString("@return listp; a list of all complements of this verb"),
	    list(makeSymbol("CLET"),
		    list(list(makeSymbol("SUBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SEMANTIC-SUBJECT")))),
			    list(makeSymbol("VERBAL-COMPLEMENT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-VERBAL-COMPLEMENT")))),
			    list(makeSymbol("COMPLEMENTS"), list(makeSymbol("APPEND"), list(makeSymbol("FWHEN"), makeSymbol("SUBJECT"), list(makeSymbol("LIST"), makeSymbol("SUBJECT"))), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SEMANTIC-OBJECTS"))),
				    list(makeSymbol("FWHEN"), makeSymbol("VERBAL-COMPLEMENT"), list(makeSymbol("LIST"), makeSymbol("VERBAL-COMPLEMENT")))))),
		    list(RET, makeSymbol("COMPLEMENTS"))));

    protected static final SubLList $list_alt478 = list(makeString("@return word-tree-p; this verb's particle phrase, or nil if there is none"),
	    list(makeSymbol("CLET"), list(list(makeSymbol("PARTICLE-PHRASE"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("FIND-FIRST")), list(QUOTE, makeSymbol("PRT-TREE-P")), list(makeSymbol("1+"), makeSymbol("IDX"))))),
		    list(RET, list(makeSymbol("FWHEN"), makeSymbol("PARTICLE-PHRASE"), makeSymbol("PARTICLE-PHRASE")))));

    protected static final SubLList $list_alt483 = list(makeString("@return word-tree-p; this verb's infinitive marker"),
	    list(makeSymbol("CLET"),
		    list(list(makeSymbol("VP"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-MOTHER")))), list(makeSymbol("CANDIDATE"), list(makeSymbol("FIM"), makeSymbol("VP"), list(QUOTE, makeSymbol("GET-SISTER")), MINUS_ONE_INTEGER))),
		    list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("CANDIDATE"), list(EQ, list(makeSymbol("FIM"), makeSymbol("CANDIDATE"), list(QUOTE, makeSymbol("GET-CATEGORY"))), makeKeyword("TO"))), list(RET, makeSymbol("CANDIDATE")))));

    protected static final SubLList $list_alt487 = list(makeString("@return boolean; t if this verb is a dummy 'to', nil otherwise"), list(RET, list(EQL, list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-STRING"))), makeString("to"))));

    protected static final SubLList $list_alt490 = list(makeString("@return phrase-tree-p; the semantic subject of this verbal tree"), list(RET, list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SUBJECT")))));

    protected static final SubLList $list_alt492 = list(makeString("@return listp; a list of the semantic subject of this verbal tree"),
	    list(makeSymbol("CLET"),
		    list(list(makeSymbol("DIRECT-OBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SEMANTIC-DIRECT-OBJECT")))),
			    list(makeSymbol("INDIRECT-OBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SEMANTIC-INDIRECT-OBJECT")))), list(makeSymbol("SEMANTIC-OBJECTS"), NIL)),
		    list(makeSymbol("PWHEN"), makeSymbol("INDIRECT-OBJECT"), list(makeSymbol("CPUSH"), makeSymbol("INDIRECT-OBJECT"), makeSymbol("SEMANTIC-OBJECTS"))),
		    list(makeSymbol("PWHEN"), makeSymbol("DIRECT-OBJECT"), list(makeSymbol("CPUSH"), makeSymbol("DIRECT-OBJECT"), makeSymbol("SEMANTIC-OBJECTS"))), list(RET, makeSymbol("SEMANTIC-OBJECTS"))));

    protected static final SubLList $list_alt495 = list(makeString("@return listp; the local syntactic objects of this tree and its ancestors"), list(RET, list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("GET-ANCESTOR-OBJECTS")))));

    protected static final SubLList $list_alt499 = list(makeString("@return booleanp; t if this verb is inverted, nil otherwise"), list(RET, NIL));

    protected static final SubLList $list_alt501 = list(makeString("@return booleanp; t if this word is finite, nil otherwise"), list(RET, list(makeSymbol("FINITE-VERBAL-WORD-TREE-P"), makeSymbol("SELF"))));

    protected static final SubLList $list_alt504 = list(makeString("@return booleanp; t if this verb is the head of a passive construction, nil otherwise"), list(RET, NIL));

    protected static final SubLList $list_alt507 = list(makeString("@return boolenap; t if this verb is in the infinitive form, nil otherwise"),
	    list(RET, list(makeSymbol("BOOLEAN"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-INFINITIVE-MARKER"))))));

    protected static final SubLList $list_alt510 = list(makeString("@return booleanp; t if this verb is in its base form, nil otherwise"),
	    list(makeSymbol("CLET"), list(list(makeSymbol("GRANDMOTHER"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("GET-MOTHER"))))),
		    list(RET,
			    list(makeSymbol("COR"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("INFINITIVE-P"))),
				    list(makeSymbol("CAND"), makeSymbol("GRANDMOTHER"), list(makeSymbol("COR"), list(makeSymbol("FIM"), makeSymbol("GRANDMOTHER"), list(QUOTE, makeSymbol("FIND-FIRST")), list(QUOTE, makeSymbol("MODAL-VERB-TREE-P"))),
					    list(EQUALP, list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("GRANDMOTHER"), list(QUOTE, makeSymbol("GET-DAUGHTER")), ZERO_INTEGER), list(QUOTE, makeSymbol("GET-STRING"))), makeString("did"))))))));

    protected static final SubLList $list_alt516 = list(makeSymbol("FINITE-VERBAL-WORD-TREE"));

    protected static final SubLList $list_alt517 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TENSE"), NIL, makeKeyword("PUBLIC")));

    protected static final SubLList $list_alt52 = list(list(makeSymbol("WITHOUT-DUPLICATE-CYCLIFICATION"), list(RET, list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("CYCLIFY-NUCLEUS"))))));

    protected static final SubLList $list_alt520 = list(makeString("@return keywordp; the tense of this verb; either :PRESENT, :PAST, :FUTURE,\n   or :INFINITIVE"), list(RET, makeKeyword("PRESENT")));

    protected static final SubLList $list_alt524 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-AUX-VERB"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SEMANTIC-SUBJECT"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SEMANTIC-DIRECT-OBJECT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SEMANTIC-INDIRECT-OBJECT"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PASSIVE-P"), NIL, makeKeyword("PROTECTED")));

    protected static final SubLList $list_alt528 = list(makeString("@return aux-verb-tree-p; the aux verb of this participle form"), list(makeSymbol("CLET"), list(list(makeSymbol("GRANDMOTHER"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("GET-MOTHER"))))),
	    list(RET, list(makeSymbol("FWHEN"), makeSymbol("GRANDMOTHER"), list(makeSymbol("FIM"), makeSymbol("GRANDMOTHER"), list(QUOTE, makeSymbol("FIND-FIRST")), list(QUOTE, makeSymbol("AUX-VERB-TREE-P")))))));

    protected static final SubLList $list_alt532 = list(makeString("@return phrase-tree-p; the semantic subject of this verbal tree"),
	    list(makeSymbol("PIF"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PASSIVE-P"))),
		    list(makeSymbol("CLET"),
			    list(list(makeSymbol("PPS"), list(makeSymbol("FWHEN"), makeSymbol("MOTHER"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("FIND")), list(QUOTE, makeSymbol("PREPOSITIONAL-OR-PARTICLE-PHRASE-TREE-P"))))),
				    makeSymbol("PPHEAD"), makeSymbol("PREPOSITION")),
			    list(makeSymbol("CDOLIST"), list(makeSymbol("PP"), makeSymbol("PPS")), list(makeSymbol("CSETQ"), makeSymbol("PPHEAD"), list(makeSymbol("FIM"), makeSymbol("PP"), list(QUOTE, makeSymbol("GET-HEAD")))),
				    list(makeSymbol("CSETQ"), makeSymbol("PREPOSITION"), list(makeSymbol("FWHEN"), makeSymbol("PPHEAD"), list(makeSymbol("FIM"), makeSymbol("PPHEAD"), list(QUOTE, makeSymbol("GET-STRING"))))),
				    list(makeSymbol("PWHEN"), list(EQUAL, makeSymbol("PREPOSITION"), makeString("by")), list(RET, list(makeSymbol("FIM"), makeSymbol("PP"), list(QUOTE, makeSymbol("GET-OBLIQUE-OBJECT"))))))),
		    list(RET, list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SUBJECT"))))));

    protected static final SubLList $list_alt536 = list(makeString("@return phrase-tree-p; the semantic direct object of this verb"),
	    list(makeSymbol("PIF"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PASSIVE-P"))),
		    list(makeSymbol("CLET"),
			    list(list(makeSymbol("LOCALS"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("FIND")), list(QUOTE, makeSymbol("NOMINAL-TREE-P")), list(makeSymbol("1+"), makeSymbol("IDX")))),
				    list(makeSymbol("N"), list(makeSymbol("LENGTH"), makeSymbol("LOCALS")))),
			    list(makeSymbol("PCOND"), list(list(makeSymbol("="), makeSymbol("N"), ONE_INTEGER), list(RET, list(makeSymbol("FIRST"), makeSymbol("LOCALS")))),
				    list(list(makeSymbol("="), makeSymbol("N"), ZERO_INTEGER), list(RET, list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SUBJECT"))))))),
		    list(RET, list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-DIRECT-OBJECT"))))));

    protected static final SubLList $list_alt539 = list(makeString("@return phrase-tree-p; the semantic indirect object of this verb"),
	    list(makeSymbol("PIF"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("PASSIVE-P"))),
		    list(makeSymbol("CLET"), list(list(makeSymbol("OBLIQUE-OBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-OBLIQUE-OBJECT"))))),
			    list(RET, list(makeSymbol("FIF"), makeSymbol("OBLIQUE-OBJECT"), makeSymbol("OBLIQUE-OBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SUBJECT")))))),
		    list(RET, list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-INDIRECT-OBJECT"))))));

    protected static final SubLList $list_alt54 = list(makeSymbol("&OPTIONAL"), makeSymbol("KEYWORDS"));

    protected static final SubLList $list_alt541 = list(makeString("am"), makeString("are"), makeString("is"), makeString("was"), makeString("were"), makeString("been"), makeString("had"), makeString("be"));

    protected static final SubLList $list_alt542 = list(makeString("@return booleanp; t if this verb is the head of a passive construction, nil otherwise"),
	    list(makeSymbol("CLET"), list(list(makeSymbol("AUX"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-AUX-VERB"))))),
		    list(RET, list(makeSymbol("CAND"), makeSymbol("AUX"), list(makeSymbol("MEMBER"), list(makeSymbol("FIM"), makeSymbol("AUX"), list(QUOTE, makeSymbol("GET-STRING"))), makeSymbol("*TO-BE-FORMS*"), list(QUOTE, EQUALP))))));

    protected static final SubLList $list_alt547 = list(makeString("@return keywordp; the tense of this verb; either :PRESENT, :PAST, :FUTURE,\n   or :INFINITIVE"), list(RET, $PAST));

    protected static final SubLList $list_alt55 = list(list(makeSymbol("IGNORE"), makeSymbol("KEYWORDS")), list(RET, NIL));

    protected static final SubLList $list_alt557 = list(makeString("@return keywordp; the tense of this verb; either :PRESENT, :PAST, :FUTURE,\n   or :INFINITIVE"), list(RET, makeKeyword("INFINITIVE")));

    protected static final SubLList $list_alt561 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-AUX-VERB"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MODIFIEDS"), NIL, makeKeyword("PUBLIC")));

    protected static final SubLList $list_alt566 = list(makeString("@return listp; a list of constituents this verb modifies"),
	    list(makeSymbol("PUNLESS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-AUX-VERB"))),
		    list(makeSymbol("CLET"),
			    list(list(makeSymbol("GRANDMOTHER"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("GET-MOTHER")))),
				    list(makeSymbol("GRANDMAS-HEAD"),
					    list(makeSymbol("FWHEN"), list(makeSymbol("CAND"), makeSymbol("GRANDMOTHER"), list(makeSymbol("NOMINAL-PHRASE-TREE-P"), makeSymbol("GRANDMOTHER"))), list(makeSymbol("FIM"), makeSymbol("GRANDMOTHER"), list(QUOTE, makeSymbol("GET-HEAD")))))),
			    list(RET, list(makeSymbol("FWHEN"), makeSymbol("GRANDMAS-HEAD"), list(makeSymbol("LIST"), makeSymbol("GRANDMAS-HEAD")))))));

    protected static final SubLList $list_alt57 = list(list(RET, list(makeSymbol("VALUES"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SEMANTIC-COMPLEMENTS"))), NIL)));

    protected static final SubLList $list_alt570 = list(makeSymbol("FINITE-VERBAL-WORD-TREE"), makeSymbol("AUX-VERB-WORD"));

    protected static final SubLList $list_alt571 = list(new SubLObject[] { list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TENSE"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SEMANTIC-HEADS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SUBJECT"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-DIRECT-OBJECT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-INDIRECT-OBJECT"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SEMANTIC-SUBJECT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-COMPLEMENTS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SEMANTIC-COMPLEMENTS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KEYWORD-RENAMINGS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("COPULA-P"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-PREPOSITIONAL-COMPLEMENT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ADVERBIAL-COMPLEMENT"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("INVERTED-P"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("PASSIVE-P"), NIL, makeKeyword("PUBLIC")) });

    protected static final SubLList $list_alt572 = list(list(RET, list(makeSymbol("CNOT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-VERBAL-COMPLEMENT"))))));

    protected static final SubLList $list_alt574 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("KEYWORDS"), list(QUOTE, list(makeKeyword("SUBJECT"), makeKeyword("OBJECT"), makeKeyword("COMPLEMENT")))));

    protected static final SubLList $list_alt575 = list(
	    list(makeSymbol("CLET"),
		    list(list(makeSymbol("CONJUNCTS"), NIL), list(makeSymbol("DISJUNCTS"), NIL), list(makeSymbol("SUBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SEMANTIC-SUBJECT")))),
			    list(makeSymbol("DIRECT-OBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SEMANTIC-DIRECT-OBJECT")))),
			    list(makeSymbol("COMPLEMENT"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SEMANTIC-COMPLEMENTS")))))),
		    list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("SUBJECT"), list(makeSymbol("MEMBER"), makeKeyword("SUBJECT"), makeSymbol("KEYWORDS"), list(QUOTE, EQL))),
			    list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("SUBJECT"), makeSymbol("SUBJECT")), makeSymbol("CONJUNCTS"))),
		    list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("DIRECT-OBJECT"), list(makeSymbol("MEMBER"), makeKeyword("OBJECT"), makeSymbol("KEYWORDS"), list(QUOTE, EQL))),
			    list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("OBJECT"), makeSymbol("DIRECT-OBJECT")), makeSymbol("CONJUNCTS"))),
		    list(makeSymbol("PWHEN"),
			    list(makeSymbol("CAND"), makeSymbol("COMPLEMENT"),
				    list(makeSymbol("CAND"), list(makeSymbol("COR"), list(makeSymbol("CNOT"), makeSymbol("SUBJECT")), list(makeSymbol("CNOT"), list(EQ, makeSymbol("COMPLEMENT"), makeSymbol("SUBJECT")))),
					    list(makeSymbol("CNOT"), list(EQ, makeSymbol("COMPLEMENT"), makeSymbol("DIRECT-OBJECT")))),
				    list(makeSymbol("MEMBER"), makeKeyword("COMPLEMENT"), makeSymbol("KEYWORDS"), list(QUOTE, EQL))),
			    list(makeSymbol("CLET"), list(list(makeSymbol("COMP-CYCLS"), list(makeSymbol("FIM"), makeSymbol("COMPLEMENT"), list(QUOTE, makeSymbol("CYCLIFY-INT"))))),
				    list(makeSymbol("PUNLESS"), makeSymbol("COMP-CYCLS"), list(makeSymbol("CPUSH"), NIL, makeSymbol("COMP-CYCLS"))),
				    list(makeSymbol("CDOLIST"), list(makeSymbol("COMP-CYCL"), makeSymbol("COMP-CYCLS")), list(makeSymbol("CSETQ"), makeSymbol("COMP-CYCL"), list(makeSymbol("LIFT-CONJUNCTS"), makeSymbol("COMP-CYCL"))),
					    list(makeSymbol("CPUSH"), list(makeSymbol("CONS"), makeKeyword("COMPLEMENT"), makeSymbol("COMP-CYCL")), makeSymbol("DISJUNCTS"))))),
		    list(RET, list(makeSymbol("DISJUNCTIVE-KEYWORD-RENAMINGS"), makeSymbol("CONJUNCTS"), makeSymbol("DISJUNCTS")))));

    protected static final SubLList $list_alt576 = list(makeKeyword("SUBJECT"), makeKeyword("OBJECT"), makeKeyword("COMPLEMENT"));

    protected static final SubLList $list_alt579 = list(
	    list(makeSymbol("PIF"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("COPULA-P"))), list(RET, list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-COMPLEMENTS")))), list(makeSymbol("CLET"),
		    list(list(makeSymbol("COMPLEMENT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-VERBAL-COMPLEMENT"))))), list(RET, list(makeSymbol("FWHEN"), makeSymbol("COMPLEMENT"), list(makeSymbol("LIST"), makeSymbol("COMPLEMENT")))))));

    protected static final SubLList $list_alt581 = list(list(makeSymbol("CLET"),
	    list(list(makeSymbol("COMPLEMENTS"), NIL), list(makeSymbol("SUBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SEMANTIC-SUBJECT")))),
		    list(makeSymbol("OBJECT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SEMANTIC-DIRECT-OBJECT")))),
		    list(makeSymbol("VERBAL-COMPLEMENT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-VERBAL-COMPLEMENT")))),
		    list(makeSymbol("PREP-COMPLEMENT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-PREPOSITIONAL-COMPLEMENT")))),
		    list(makeSymbol("ADJ-COMPLEMENT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-ADJECTIVAL-COMPLEMENT")))),
		    list(makeSymbol("ADV-COMPLEMENT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-ADVERBIAL-COMPLEMENT"))))),
	    list(makeSymbol("CDOLIST"), list(makeSymbol("COMPLEMENT"), list(makeSymbol("LIST"), makeSymbol("ADV-COMPLEMENT"), makeSymbol("ADJ-COMPLEMENT"), makeSymbol("PREP-COMPLEMENT"), makeSymbol("VERBAL-COMPLEMENT"), makeSymbol("OBJECT"), makeSymbol("SUBJECT"))),
		    list(makeSymbol("PWHEN"), makeSymbol("COMPLEMENT"), list(makeSymbol("CPUSH"), makeSymbol("COMPLEMENT"), makeSymbol("COMPLEMENTS")))),
	    list(RET, makeSymbol("COMPLEMENTS"))));

    protected static final SubLList $list_alt585 = list(list(makeSymbol("CLET"), list(list(makeSymbol("MAIN-VERB"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-VERBAL-COMPLEMENT"))))),
	    list(RET, list(makeSymbol("FIF"), makeSymbol("MAIN-VERB"), list(makeSymbol("FIM"), makeSymbol("MAIN-VERB"), list(QUOTE, makeSymbol("GET-SEMANTIC-HEADS"))), list(makeSymbol("LIST"), makeSymbol("SELF"))))));

    protected static final SubLList $list_alt587 = list(list(RET, list(makeSymbol("FCOND"),
	    list(list(makeSymbol("MEMBER"), list(makeSymbol("GET-STRING"), makeSymbol("SELF")), list(QUOTE, list(makeString("is"), makeString("am"), makeString("are"), makeString("have"), makeString("has"), makeString("do"), makeString("does"))), list(QUOTE, EQUALP)),
		    makeKeyword("PRESENT")),
	    list(list(makeSymbol("MEMBER"), list(makeSymbol("GET-STRING"), makeSymbol("SELF")), list(QUOTE, list(makeString("was"), makeString("were"), makeString("had"), makeString("did"))), list(QUOTE, EQUALP)), $PAST),
	    list(list(makeSymbol("MEMBER"), list(makeSymbol("GET-STRING"), makeSymbol("SELF")), list(QUOTE, list(makeString("be"), makeString("do"), makeString("have"))), list(QUOTE, EQUALP)), makeKeyword("INFINITIVE")))));

    protected static final SubLList $list_alt588 = list(makeString("is"), makeString("am"), makeString("are"), makeString("have"), makeString("has"), makeString("do"), makeString("does"));

    protected static final SubLList $list_alt589 = list(makeString("was"), makeString("were"), makeString("had"), makeString("did"));

    protected static final SubLList $list_alt590 = list(makeString("be"), makeString("do"), makeString("have"));

    protected static final SubLList $list_alt594 = list(makeString("@return prepositional-or-particle-tree-p; the prepositional complement of this aux verb"),
	    list(makeSymbol("CLET"), list(list(makeSymbol("PP"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("FIND-FIRST")), list(QUOTE, makeSymbol("PREPOSITIONAL-OR-PARTICLE-PHRASE-TREE-P"))))),
		    list(RET, list(makeSymbol("FWHEN"), makeSymbol("PP"), makeSymbol("PP")))));

    protected static final SubLList $list_alt597 = list(makeString("@return adverbial-word-tree-p; the adverbial complement of this aux verb"), list(RET, NIL));

    protected static final SubLList $list_alt599 = list(makeString("@return phrase-tree-p; the subject of this verb"),
	    list(makeSymbol("CLET"), list(makeSymbol("SUBJECT")),
		    list(makeSymbol("PIF"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("INVERTED-P"))),
			    list(makeSymbol("CSETQ"), makeSymbol("SUBJECT"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("FIND-FIRST")), list(QUOTE, makeSymbol("NOMINAL-TREE-P")), list(makeSymbol("1+"), makeSymbol("IDX")))),
			    list(makeSymbol("CSETQ"), makeSymbol("SUBJECT"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("FIND-LAST")), list(QUOTE, makeSymbol("NOMINAL-TREE-P")), list(makeSymbol("1-"), makeSymbol("IDX"))))),
		    list(RET, list(makeSymbol("FIF"), makeSymbol("SUBJECT"), makeSymbol("SUBJECT"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("GET-SUBJECT")))))));

    protected static final SubLList $list_alt60 = list(makeKeyword("PUBLIC"));

    protected static final SubLList $list_alt602 = list(makeString("@return listp; the list of objects of this aux verb, which is the list of objects\n   of its main verb"),
	    list(RET,
		    list(makeSymbol("FIF"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("INVERTED-P"))),
			    list(makeSymbol("SECOND"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("FIND")), list(QUOTE, makeSymbol("NOMINAL-TREE-P")), list(makeSymbol("1+"), makeSymbol("IDX")))),
			    list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("FIND-FIRST")), list(QUOTE, makeSymbol("NOMINAL-TREE-P")), list(makeSymbol("1+"), makeSymbol("IDX"))))));

    protected static final SubLList $list_alt605 = list(makeString("@return listp; the list of objects of this aux verb, which is the list of objects\n   of its main verb"),
	    list(makeSymbol("CLET"),
		    list(list(makeSymbol("VERBAL-COMPLEMENT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-VERBAL-COMPLEMENT")))),
			    list(makeSymbol("MAIN-VERB"), list(makeSymbol("FWHEN"), makeSymbol("VERBAL-COMPLEMENT"), list(makeSymbol("FIM"), makeSymbol("VERBAL-COMPLEMENT"), list(QUOTE, makeSymbol("GET-HEAD")))))),
		    list(RET, list(makeSymbol("FWHEN"), makeSymbol("MAIN-VERB"), list(makeSymbol("FIM"), makeSymbol("MAIN-VERB"), list(QUOTE, makeSymbol("GET-INDIRECT-OBJECT")))))));

    protected static final SubLList $list_alt607 = list(makeString("@return phrase-tree-p; the semantic subject of this aux tree"),
	    list(makeSymbol("CLET"), list(list(makeSymbol("SISTER"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SISTER")), ONE_INTEGER))),
		    list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("SISTER"), list(makeSymbol("NOMINAL-TREE-P"), makeSymbol("SISTER"))), list(RET, list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SUBJECT")))))));

    protected static final SubLList $list_alt609 = list(makeString("@return booleanp; t if this verb is inverted, nil otherwise"),
	    list(makeSymbol("CLET"), list(list(makeSymbol("MATRIX"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-MATRIX-CLAUSE"))))),
		    list(RET, list(makeSymbol("CAND"), makeSymbol("MATRIX"), list(makeSymbol("COR"),
			    list(makeSymbol("CAND"), list(makeSymbol("QUESTION-TREE-P"), makeSymbol("MATRIX")), list(makeSymbol("CNOT"), list(makeSymbol("VERBAL-PHRASE-TREE-P"), list(makeSymbol("FIM"), makeSymbol("MATRIX"), list(QUOTE, makeSymbol("GET-DAUGHTER")), ZERO_INTEGER)))),
			    list(makeSymbol("SINV-TREE-P"), makeSymbol("MATRIX")))))));

    protected static final SubLList $list_alt61 = list(list(RET, list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-COMPLEMENTS")))));

    protected static final SubLList $list_alt611 = list(makeString("@return booleanp; t if this verb is the head of a passive construction, nil otherwise"),
	    list(makeSymbol("CLET"), list(list(makeSymbol("MAIN"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-VERBAL-COMPLEMENT"))))),
		    list(RET, list(makeSymbol("FWHEN"), makeSymbol("MAIN"), list(makeSymbol("FIM"), makeSymbol("MAIN"), list(QUOTE, makeSymbol("PASSIVE-P")))))));

    protected static final SubLList $list_alt614 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-TENSE"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-OBJECTS"), NIL, makeKeyword("PUBLIC")));

    protected static final SubLList $list_alt617 = list(makeString("@return keywordp; the tense of this modal; either :PRESENT, :PAST, :FUTURE,\n   or :INFINITIVE\n   @hack \'could\' can be :PRESENT or :PAST; maybe return a disjunctive list of tenses?"),
	    list(RET, list(makeSymbol("FIF"), list(EQUALP, makeSymbol("STRING"), makeString("will")), makeKeyword("FUTURE"), makeKeyword("PRESENT"))));

    protected static final SubLList $list_alt622 = list(makeString("@return listp; the list of objects of this modal"), list(RET, NIL));

    protected static final SubLList $list_alt625 = list(makeSymbol("ADJECTIVAL-TREE"), makeSymbol("ADJECTIVAL-WORD"));

    protected static final SubLList $list_alt626 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MODIFIEDS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-VERBAL-COMPLEMENT"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-COMPLEMENTS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KEYWORD-RENAMINGS"), list(makeSymbol("&OPTIONAL"), makeSymbol("KEYWORDS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")));

    protected static final SubLList $list_alt627 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("KEYWORDS"), list(QUOTE, list($NOUN, makeKeyword("ACTION"), makeKeyword("REPLACE"), makeKeyword("OBLIQUE-OBJECT")))));

    protected static final SubLList $list_alt628 = list(list(makeSymbol("CLET"),
	    list(list(makeSymbol("CONJUNCTS"), NIL), list(makeSymbol("MODIFIED"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-MODIFIEDS"))))),
		    list(makeSymbol("OBL-OBJ"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-OBLIQUE-OBJECT")))),
		    list(makeSymbol("OBL-OBJ-HEAD"), list(makeSymbol("FWHEN"), makeSymbol("OBL-OBJ"), list(makeSymbol("FIM"), makeSymbol("OBL-OBJ"), list(QUOTE, makeSymbol("GET-HEAD")))))),
	    list(makeSymbol("PWHEN"), makeSymbol("MODIFIED"),
		    list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER?"), $NOUN, makeSymbol("KEYWORDS"), list(QUOTE, EQL)), list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), $NOUN, makeSymbol("MODIFIED")), makeSymbol("CONJUNCTS"))),
		    list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER?"), makeKeyword("ACTION"), makeSymbol("KEYWORDS"), list(QUOTE, EQL)),
			    list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("ACTION"), makeSymbol("MODIFIED")), makeSymbol("CONJUNCTS"))),
		    list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER?"), makeKeyword("REPLACE"), makeSymbol("KEYWORDS"), list(QUOTE, EQL)), list(makeSymbol("CPUSH"), list(makeSymbol("LIST"), list(makeSymbol("CONS"), makeKeyword("REPLACE"), NIL)), makeSymbol("CONJUNCTS")))),
	    list(makeSymbol("PWHEN"), makeSymbol("OBL-OBJ-HEAD"), list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER?"), makeKeyword("OBLIQUE-OBJECT"), makeSymbol("KEYWORDS"), list(QUOTE, EQL)),
		    list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("PREP-OBJECT"), makeSymbol("OBL-OBJ-HEAD")), makeSymbol("CONJUNCTS")))),
	    list(RET, list(makeSymbol("DISJUNCTIVE-KEYWORD-RENAMINGS"), makeSymbol("CONJUNCTS"), NIL))));

    protected static final SubLList $list_alt629 = list($NOUN, makeKeyword("ACTION"), makeKeyword("REPLACE"), makeKeyword("OBLIQUE-OBJECT"));

    protected static final SubLList $list_alt631 = list(list(makeSymbol("CLET"),
	    list(list(makeSymbol("MODIFIEDS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-MODIFIEDS")))), list(makeSymbol("OBL-OBJ"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-OBLIQUE-OBJECT"))))),
	    list(RET, list(makeSymbol("APPEND"), makeSymbol("MODIFIEDS"), list(makeSymbol("FWHEN"), makeSymbol("OBL-OBJ"), list(makeSymbol("LIST"), makeSymbol("OBL-OBJ")))))));

    protected static final SubLList $list_alt635 = list(makeString("@return listp; a list of phrases modified by this adjective"),
	    list(makeSymbol("CLET"),
		    list(list(makeSymbol("HEAD"), list(makeSymbol("FIM"), makeSymbol("MOTHER"),
			    list(QUOTE, makeSymbol("GET-HEAD-DAUGHTER")))), list(makeSymbol("COMPLEMENT"),
				    list(makeSymbol("FWHEN"), list(makeSymbol("NOMINAL-TREE-P"), makeSymbol("HEAD")), makeSymbol("HEAD")))),
		    list(makeSymbol("PUNLESS"), makeSymbol("COMPLEMENT"),
			    list(makeSymbol("PWHEN"), list(makeSymbol("NOMINAL-TREE-P"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("GET-SISTER")), ONE_INTEGER)),
				    list(makeSymbol("CSETQ"), makeSymbol("COMPLEMENT"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("GET-SISTER")), ONE_INTEGER)))),
		    list(makeSymbol("PUNLESS"), makeSymbol("COMPLEMENT"),
			    list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("MOTHER"), list(makeSymbol("AUX-VERB-TREE-P"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("GET-SISTER")), MINUS_ONE_INTEGER))),
				    list(makeSymbol("CLET"),
					    list(list(makeSymbol("SUBJECT"), list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("GET-SISTER")), MINUS_ONE_INTEGER), list(QUOTE, makeSymbol("GET-SUBJECT")))),
						    list(makeSymbol("HEAD"), list(makeSymbol("FWHEN"), makeSymbol("SUBJECT"), list(makeSymbol("FIM"), makeSymbol("SUBJECT"), list(QUOTE, makeSymbol("GET-HEAD")))))),
					    list(makeSymbol("PWHEN"), makeSymbol("HEAD"), list(makeSymbol("CSETQ"), makeSymbol("COMPLEMENT"), makeSymbol("HEAD")))))),
		    list(makeSymbol("PUNLESS"), makeSymbol("COMPLEMENT"),
			    list(makeSymbol("CLET"),
				    list(list(makeSymbol("GRANDMOTHER"), list(makeSymbol("FWHEN"), makeSymbol("MOTHER"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("GET-MOTHER"))))),
					    list(makeSymbol("MODIFIED"), list(makeSymbol("FWHEN"), makeSymbol("GRANDMOTHER"), list(makeSymbol("FIM"), makeSymbol("GRANDMOTHER"), list(QUOTE, makeSymbol("FIND-FIRST")), list(QUOTE, makeSymbol("NOMINAL-TREE-P"))))),
					    list(makeSymbol("MOD-HEAD"), list(makeSymbol("FWHEN"), makeSymbol("MODIFIED"), list(makeSymbol("FIM"), makeSymbol("MODIFIED"), list(QUOTE, makeSymbol("GET-HEAD")))))),
				    list(makeSymbol("PWHEN"), makeSymbol("MOD-HEAD"), list(makeSymbol("CSETQ"), makeSymbol("COMPLEMENT"), makeSymbol("MOD-HEAD"))))),
		    list(RET, list(makeSymbol("FWHEN"), makeSymbol("COMPLEMENT"), list(makeSymbol("LIST"), makeSymbol("COMPLEMENT"))))));

    protected static final SubLList $list_alt639 = list(makeString("@return verbal-tree-p; the verbal complement of this adjective"),
	    list(RET, list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("FIND-FIRST")), list(QUOTE, makeSymbol("SBAR-TREE-P")))));

    protected static final SubLList $list_alt644 = list(makeSymbol("ADVERBIAL-TREE"), makeSymbol("ADVERBIAL-WORD"));

    protected static final SubLList $list_alt645 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MODIFIEDS"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KEYWORD-RENAMINGS"), list(makeSymbol("&OPTIONAL"), makeSymbol("KEYWORDS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")));

    protected static final SubLList $list_alt646 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("KEYWORDS"), list(QUOTE, list(makeKeyword("ACTION"), makeKeyword("SUBJECT"), makeKeyword("OBJECT")))));

    protected static final SubLList $list_alt647 = list(list(makeSymbol("CLET"),
	    list(list(makeSymbol("CONJUNCTS"), NIL), list(makeSymbol("MODIFIED"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-MODIFIEDS"))))),
		    list(makeSymbol("SUBJECT"), list(makeSymbol("FWHEN"), list(makeSymbol("VERBAL-WORD-P"), makeSymbol("MODIFIED")), list(makeSymbol("FIM"), makeSymbol("MODIFIED"), list(QUOTE, makeSymbol("GET-SUBJECT"))))),
		    list(makeSymbol("OBJECT"), list(makeSymbol("FWHEN"), list(makeSymbol("VERBAL-WORD-P"), makeSymbol("MODIFIED")), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("MODIFIED"), list(QUOTE, makeSymbol("GET-OBJECTS"))))))),
	    list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("MODIFIED"), list(makeSymbol("MEMBER"), makeKeyword("ACTION"), makeSymbol("KEYWORDS"), list(QUOTE, EQL))),
		    list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("ACTION"), makeSymbol("MODIFIED")), makeSymbol("CONJUNCTS"))),
	    list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("SUBJECT"), list(makeSymbol("MEMBER"), makeKeyword("SUBJECT"), makeSymbol("KEYWORDS"), list(QUOTE, EQL))),
		    list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("SUBJECT"), makeSymbol("SUBJECT")), makeSymbol("CONJUNCTS"))),
	    list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("OBJECT"), list(makeSymbol("MEMBER"), makeKeyword("OBJECT"), makeSymbol("KEYWORDS"), list(QUOTE, EQL))),
		    list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("OBJECT"), makeSymbol("OBJECT")), makeSymbol("CONJUNCTS"))),
	    list(RET, list(makeSymbol("DISJUNCTIVE-KEYWORD-RENAMINGS"), makeSymbol("CONJUNCTS"), NIL))));

    protected static final SubLList $list_alt648 = list(makeKeyword("ACTION"), makeKeyword("SUBJECT"), makeKeyword("OBJECT"));

    protected static final SubLList $list_alt65 = list(list(makeSymbol("CLET"), list(list(makeSymbol("PP"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-PP-COMPLEMENT")))),
	    list(makeSymbol("OBL-OBJ"), list(makeSymbol("FWHEN"), makeSymbol("PP"), list(makeSymbol("FIM"), makeSymbol("PP"), list(QUOTE, makeSymbol("GET-OBLIQUE-OBJECT")))))), list(RET, makeSymbol("OBL-OBJ"))));

    protected static final SubLList $list_alt652 = list(makeString("@return listp; a list of phrases modified by this adverb"),
	    list(makeSymbol("CLET"), list(list(makeSymbol("SISTER"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SISTER")), ONE_INTEGER))),
		    list(makeSymbol("PWHEN"),
			    list(makeSymbol("COR"), list(makeSymbol("ADJECTIVAL-WORD-TREE-P"), makeSymbol("SISTER")), list(makeSymbol("ADVERBIAL-WORD-TREE-P"), makeSymbol("SISTER")), list(makeSymbol("PREPOSITIONAL-OR-PARTICLE-WORD-TREE-P"), makeSymbol("SISTER")),
				    list(makeSymbol("NUMERICAL-TREE-P"), makeSymbol("SISTER"))),
			    list(RET, list(makeSymbol("LIST"), makeSymbol("SISTER"))))),
	    list(makeSymbol("CDOLIST"), list(makeSymbol("ANCESTOR"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-ANCESTORS")))),
		    list(makeSymbol("PWHEN"), list(makeSymbol("VERBAL-PHRASE-TREE-P"), makeSymbol("ANCESTOR")), list(RET, list(makeSymbol("FIM"), makeSymbol("ANCESTOR"), list(QUOTE, makeSymbol("GET-SEMANTIC-HEADS")))))));

    protected static final SubLList $list_alt655 = list(makeSymbol("WH-TREE"));

    protected static final SubLList $list_alt659 = list(makeSymbol("PREPOSITIONAL-OR-PARTICLE-WORD"));

    protected static final SubLList $list_alt660 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-OBLIQUE-OBJECT"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-VERBAL-COMPLEMENT"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-COMPLEMENTS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MODIFIEDS"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-REFS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ANTECEDENT"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KEYWORD-RENAMINGS"), NIL, makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LOGICAL-FORM-INT"), NIL, makeKeyword("PROTECTED")));

    protected static final SubLList $list_alt661 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("KEYWORDS"), list(QUOTE, list($NOUN, makeKeyword("ACTION"), makeKeyword("OBJECT"), makeKeyword("CLAUSE")))));

    protected static final SubLList $list_alt662 = list(list(makeSymbol("PUNLESS"), list(EQUALP, list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-STRING"))), makeString("that")),
	    list(makeSymbol("CLET"), list(list(makeSymbol("CONJUNCTS"), NIL), list(makeSymbol("MODIFIED"), list(makeSymbol("FIRST"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-MODIFIEDS"))))),
		    list(makeSymbol("COMPLEMENT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-OBLIQUE-OBJECT")))), list(makeSymbol("CLAUSE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-VERBAL-COMPLEMENT"))))),
		    list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("MODIFIED"), list(makeSymbol("MEMBER"), $NOUN, makeSymbol("KEYWORDS"), list(QUOTE, EQL)), list(makeSymbol("NOMINAL-WORD-P"), makeSymbol("MODIFIED"))),
			    list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), $NOUN, makeSymbol("MODIFIED")), makeSymbol("CONJUNCTS"))),
		    list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("MODIFIED"), list(makeSymbol("MEMBER"), makeKeyword("ACTION"), makeSymbol("KEYWORDS"), list(QUOTE, EQL)), list(makeSymbol("VERBAL-WORD-P"), makeSymbol("MODIFIED"))),
			    list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("ACTION"), makeSymbol("MODIFIED")), makeSymbol("CONJUNCTS"))),
		    list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("COMPLEMENT"), list(makeSymbol("MEMBER"), makeKeyword("OBJECT"), makeSymbol("KEYWORDS"), list(QUOTE, EQL))),
			    list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("OBJECT"), makeSymbol("COMPLEMENT")), makeSymbol("CONJUNCTS"))),
		    list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("CLAUSE"), list(makeSymbol("MEMBER"), makeKeyword("CLAUSE"), makeSymbol("KEYWORDS"), list(QUOTE, EQL))),
			    list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("CLAUSE"), makeSymbol("CLAUSE")), makeSymbol("CONJUNCTS"))),
		    list(RET, list(makeSymbol("DISJUNCTIVE-KEYWORD-RENAMINGS"), makeSymbol("CONJUNCTS"), NIL)))));

    protected static final SubLList $list_alt663 = list($NOUN, makeKeyword("ACTION"), makeKeyword("OBJECT"), makeKeyword("CLAUSE"));

    protected static final SubLList $list_alt667 = list(makeString("@return nominal-tree-p; the singleton lists of complements of this preposition"),
	    list(makeSymbol("CLET"), list(list(makeSymbol("SISTER"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SISTER")), ONE_INTEGER))),
		    list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("SISTER"), list(makeSymbol("COR"), list(makeSymbol("NOMINAL-TREE-P"), makeSymbol("SISTER")), list(makeSymbol("SENTENTIAL-TREE-P"), makeSymbol("SISTER")))), list(RET, makeSymbol("SISTER")))),
	    list(makeSymbol("CDOLIST"), list(makeSymbol("ANCESTOR"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-ANCESTORS")))),
		    list(makeSymbol("PWHEN"),
			    list(makeSymbol("CAND"), list(makeSymbol("COR"), list(makeSymbol("SBAR-TREE-P"), makeSymbol("ANCESTOR")), list(makeSymbol("SBARQ-TREE-P"), makeSymbol("ANCESTOR"))),
				    list(makeSymbol("WHNP-TREE-P"), list(makeSymbol("FIM"), makeSymbol("ANCESTOR"), list(QUOTE, makeSymbol("GET-DAUGHTER")), ZERO_INTEGER))),
			    list(RET, list(makeSymbol("FIM"), makeSymbol("ANCESTOR"), list(QUOTE, makeSymbol("GET-DAUGHTER")), ZERO_INTEGER)))));

    protected static final SubLList $list_alt669 = list(makeString("@return verbal-tree-p; the verbal complement of this preposition or particle"),
	    list(RET, list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("FIND-FIRST")), list(QUOTE, makeSymbol("VERBAL-TREE-P")), list(makeSymbol("1+"), makeSymbol("IDX")))));

    protected static final SubLList $list_alt67 = list(list(makeSymbol("CDOLIST"), list(makeSymbol("PP"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-PPS")))), list(makeSymbol("CLET"),
	    list(list(makeSymbol("PP-HEAD"), list(makeSymbol("FWHEN"), makeSymbol("PP"), list(makeSymbol("FIM"), makeSymbol("PP"), list(QUOTE, makeSymbol("GET-HEAD"))))),
		    list(makeSymbol("PP-HEAD-STRING"), list(makeSymbol("FWHEN"), makeSymbol("PP-HEAD"), list(makeSymbol("FIM"), makeSymbol("PP-HEAD"), list(QUOTE, makeSymbol("GET-STRING")))))),
	    list(makeSymbol("PWHEN"), makeSymbol("PP-HEAD-STRING"), list(makeSymbol("CDOLIST"), list(makeSymbol("RLE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-RANKED-LEXES")))), list(makeSymbol("CLET"),
		    list(list(makeSymbol("CYCL"), list(makeSymbol("FIM"), list(makeSymbol("RLE-LEX"), makeSymbol("RLE")), list(QUOTE, makeSymbol("GET")), makeKeyword("SEMTRANS"))), list(makeSymbol("KEYWORDS"), list(makeSymbol("FORMULA-KEYWORDS"), makeSymbol("CYCL"))),
			    list(makeSymbol("FRAME"), list(makeSymbol("FIM"), list(makeSymbol("RLE-LEX"), makeSymbol("RLE")), list(QUOTE, makeSymbol("GET")), makeKeyword("FRAME")))),
		    list(makeSymbol("PCOND"), list(
			    list(makeSymbol("CAND"), list(makeSymbol("MEMBER?"), makeKeyword("OBLIQUE-OBJECT"), makeSymbol("KEYWORDS"), list(QUOTE, EQL)), list(makeSymbol("FORMULA-ARG2"), makeSymbol("FRAME")),
				    list(makeSymbol("ISA?"), makeSymbol("FRAME"), reader_make_constant_shell("PPCompFrame"), reader_make_constant_shell("EverythingPSC"))),
			    list(makeSymbol("CLET"),
				    list(list(makeSymbol("PREPOSITION"), list(makeSymbol("FORMULA-ARG2"), makeSymbol("FRAME"))), list(makeSymbol("PREP-STRING"), list(makeSymbol("FIRST"), list(makeSymbol("GET-STRINGS-OF-TYPE"), makeSymbol("PREPOSITION"), reader_make_constant_shell("Preposition"))))),
				    list(makeSymbol("PWHEN"), list(EQUALP, makeSymbol("PREP-STRING"), makeSymbol("PP-HEAD-STRING")), list(RET, makeSymbol("PP"))))),
			    list(list(makeSymbol("CAND"), list(makeSymbol("INTERSECTION"), list(QUOTE, list(makeKeyword("POSSESSOR"), makeKeyword("POSS-COL"))), makeSymbol("KEYWORDS"), list(QUOTE, EQL)), list(EQUALP, makeString("of"), makeSymbol("PP-HEAD-STRING"))),
				    list(RET, makeSymbol("PP"))))))))));

    protected static final SubLList $list_alt673 = list(makeString("@return nominal-tree-p; the complements of this preposition"),
	    list(makeSymbol("CLET"),
		    list(list(makeSymbol("MODIFIEDS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-MODIFIEDS")))), list(makeSymbol("SISTER"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SISTER")), ONE_INTEGER))),
		    list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("SISTER"), list(makeSymbol("COR"), list(makeSymbol("NOMINAL-TREE-P"), makeSymbol("SISTER")), list(makeSymbol("SENTENTIAL-TREE-P"), makeSymbol("SISTER")))),
			    list(RET, list(makeSymbol("APPEND"), makeSymbol("MODIFIEDS"), list(makeSymbol("LIST"), makeSymbol("SISTER"))))),
		    list(makeSymbol("CDOLIST"), list(makeSymbol("ANCESTOR"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-ANCESTORS")))),
			    list(makeSymbol("PWHEN"),
				    list(makeSymbol("CAND"), list(makeSymbol("COR"), list(makeSymbol("SBAR-TREE-P"), makeSymbol("ANCESTOR")), list(makeSymbol("SBARQ-TREE-P"), makeSymbol("ANCESTOR"))),
					    list(makeSymbol("WHNP-TREE-P"), list(makeSymbol("FIM"), makeSymbol("ANCESTOR"), list(QUOTE, makeSymbol("GET-DAUGHTER")), ZERO_INTEGER))),
				    list(RET, list(makeSymbol("APPEND"), makeSymbol("MODIFIEDS"), list(makeSymbol("LIST"), list(makeSymbol("FIM"), makeSymbol("ANCESTOR"), list(QUOTE, makeSymbol("GET-DAUGHTER")), ZERO_INTEGER))))))));

    protected static final SubLList $list_alt675 = list(makeString("@return listp; a list of trees this preposition modifies"),
	    list(makeSymbol("CLET"),
		    list(list(makeSymbol("COMPLEMENTS"), NIL), list(makeSymbol("CANDIDATES"), NIL), list(makeSymbol("GRANDMOTHER"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("GET-MOTHER")))),
			    list(makeSymbol("GRANDMOTHER-HEAD"), list(makeSymbol("FWHEN"), makeSymbol("GRANDMOTHER"),
				    list(makeSymbol("FIM"), makeSymbol("GRANDMOTHER"), list(QUOTE, makeSymbol("GET-HEAD"))))),
			    list(makeSymbol("SISTER"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("GET-SISTER")), ONE_INTEGER))),
		    list(makeSymbol("PIF"), list(makeSymbol("CAND"), list(makeSymbol("WHPP-TREE-P"), makeSymbol("MOTHER")), list(makeSymbol("QUESTION-TREE-P"), makeSymbol("GRANDMOTHER")), makeSymbol("SISTER"), list(makeSymbol("SQ-TREE-P"), makeSymbol("SISTER"))),
			    list(makeSymbol("CLET"), list(list(makeSymbol("LAST-PHRASE"), list(makeSymbol("FIM"), makeSymbol("SISTER"), list(QUOTE, makeSymbol("FIND-LAST")), list(QUOTE, makeSymbol("PHRASE-TREE-P"))))),
				    list(makeSymbol("PWHEN"), makeSymbol("LAST-PHRASE"), list(makeSymbol("CSETQ"), makeSymbol("CANDIDATES"), list(makeSymbol("FIM"), makeSymbol("LAST-PHRASE"), list(QUOTE, makeSymbol("GET-HEADS")))))),
			    list(makeSymbol("PWHEN"), makeSymbol("GRANDMOTHER-HEAD"),
				    list(makeSymbol("CSETQ"), makeSymbol("CANDIDATES"),
					    list(makeSymbol("FCOND"),
						    list(list(makeSymbol("CAND"), list(makeSymbol("AUX-VERB-TREE-P"), makeSymbol("GRANDMOTHER-HEAD")), list(makeSymbol("FIM"), makeSymbol("GRANDMOTHER-HEAD"), list(QUOTE, makeSymbol("GET-SUBJECT"))),
							    list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("GRANDMOTHER-HEAD"), list(QUOTE, makeSymbol("GET-SUBJECT"))), list(QUOTE, makeSymbol("GET-HEAD")))),
							    list(makeSymbol("LIST"), list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("GRANDMOTHER-HEAD"), list(QUOTE, makeSymbol("GET-SUBJECT"))), list(QUOTE, makeSymbol("GET-HEAD"))))),
						    list(list(makeSymbol("ADJECTIVAL-WORD-TREE-P"), makeSymbol("GRANDMOTHER-HEAD")), NIL), list(list(EQ, makeSymbol("GRANDMOTHER-HEAD"), makeSymbol("SELF")), NIL), list(T, list(makeSymbol("LIST"), makeSymbol("GRANDMOTHER-HEAD"))))))),
		    list(makeSymbol("CDOLIST"), list(makeSymbol("CANDIDATE"), makeSymbol("CANDIDATES")),
			    list(makeSymbol("CDOLIST"), list(makeSymbol("COMPLEMENT"), list(makeSymbol("FIM"), makeSymbol("CANDIDATE"), list(QUOTE, makeSymbol("GET-COMPLEMENTS")))),
				    list(makeSymbol("PWHEN"), list(EQ, makeSymbol("COMPLEMENT"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-OBLIQUE-OBJECT")))), list(makeSymbol("CPUSH"), makeSymbol("CANDIDATE"), makeSymbol("COMPLEMENTS"))))),
		    list(RET, list(makeSymbol("SET-DIFFERENCE"), makeSymbol("CANDIDATES"), makeSymbol("COMPLEMENTS")))));

    protected static final SubLList $list_alt679 = list(makeString("@return listp; the unique referents of this word"), list(makeSymbol("CLET"), list(list(makeSymbol("COMP-REFS"), NIL)),
	    list(makeSymbol("PWHEN"), list(EQUALP, makeSymbol("STRING"), makeString("of")), list(makeSymbol("CDOLIST"),
		    list(makeSymbol("REF"), list(makeSymbol("FIM"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-OBLIQUE-OBJECT"))), list(QUOTE, makeSymbol("GET-REFS")))), list(makeSymbol("CPUSH"), makeSymbol("REF"), makeSymbol("COMP-REFS"))),
		    list(makeSymbol("SET-WORD-TREE-REFS"), makeSymbol("SELF"), makeSymbol("COMP-REFS")))),
	    list(RET, list(makeSymbol("GET-WORD-TREE-REFS"), makeSymbol("SELF"))));

    protected static final SubLList $list_alt682 = list(makeString("@return parse-tree-p; the tree that serves as an antecedent to this wh word"),
	    list(makeSymbol("PWHEN"), list(EQUALP, makeSymbol("STRING"), makeString("that")),
		    list(makeSymbol("CLET"), list(list(makeSymbol("GRANDMOTHER"), list(makeSymbol("FWHEN"), makeSymbol("MOTHER"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("GET-MOTHER")))))),
			    list(makeSymbol("PWHEN"), list(makeSymbol("NP-TREE-P"), makeSymbol("GRANDMOTHER")), list(RET, list(makeSymbol("FIM"), makeSymbol("GRANDMOTHER"), list(QUOTE, makeSymbol("GET-HEAD"))))))));

    protected static final SubLList $list_alt686 = list(makeSymbol("PREPOSITIONAL-TREE"));

    protected static final SubLList $list_alt69 = list(makeKeyword("POSSESSOR"), makeKeyword("POSS-COL"));

    protected static final SubLList $list_alt690 = list(makeSymbol("PARTICLE-TREE"));

    protected static final SubLList $list_alt694 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SPECIFIED"), NIL, makeKeyword("PUBLIC")));

    protected static final SubLList $list_alt698 = list(makeString("@return parse-tree-p; the tree that this specifier specifies"), list(RET, list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("GET-HEAD")))));

    protected static final SubLList $list_alt702 = list(makeSymbol("QUANTIFIER-TREE"), makeSymbol("QUANTIFIER-WORD"));

    protected static final SubLList $list_alt703 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-QUANTIFIED"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-SPECIFIED"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KEYWORD-RENAMINGS"), list(makeSymbol("&OPTIONAL"), makeSymbol("KEYWORDS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")));

    protected static final SubLList $list_alt704 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("KEYWORDS"), list(QUOTE, list($NOUN, makeKeyword("RESTR"), makeKeyword("SCOPE")))));

    protected static final SubLList $list_alt705 = list(list(makeSymbol("CLET"), list(list(makeSymbol("CONJUNCTS"), NIL), list(makeSymbol("DISJUNCTS"), NIL)),
	    list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER?"), $NOUN, makeSymbol("KEYWORDS"), list(QUOTE, EQL)), list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), $NOUN, makeSymbol("SELF")), makeSymbol("CONJUNCTS"))),
	    list(RET, list(makeSymbol("DISJUNCTIVE-KEYWORD-RENAMINGS"), makeSymbol("CONJUNCTS"), makeSymbol("DISJUNCTS")))));

    protected static final SubLList $list_alt706 = list($NOUN, makeKeyword("RESTR"), makeKeyword("SCOPE"));

    protected static final SubLList $list_alt711 = list(makeString("@return word-tree; the word that restricts the variable that this determiner quantifies"),
	    list(makeSymbol("PCOND"), list(list(makeSymbol("NOMINAL-PHRASE-TREE-P"), makeSymbol("MOTHER")), list(RET, list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("GET-HEAD"))))),
		    list(list(makeSymbol("WHADJP-TREE-P"), makeSymbol("MOTHER")), list(makeSymbol("CLET"), list(list(makeSymbol("GRANDMOTHER"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("GET-MOTHER"))))),
			    list(makeSymbol("PWHEN"), makeSymbol("GRANDMOTHER"), list(RET, list(makeSymbol("FIM"), makeSymbol("GRANDMOTHER"), list(QUOTE, makeSymbol("GET-HEAD")))))))));

    protected static final SubLList $list_alt714 = list(makeString("@return word-tree; the word that this specifier specifies"), list(RET, list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-QUANTIFIED")))));

    protected static final SubLList $list_alt722 = list(makeString("my"), makeString("your"), makeString("his"), makeString("her"), makeString("its"));

    protected static final SubLList $list_alt723 = list(makeString("our"), makeString("your"), makeString("their"));

    protected static final SubLList $list_alt724 = list(makeString("@return listp; a list of numbers of this possessive pronoun with possible number values\n   :SINGULAR and :PLURAL"),
	    list(makeSymbol("CLET"), list(list(makeSymbol("NUMBERS"), NIL)),
		    list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER?"), makeSymbol("STRING"), makeSymbol("*SINGULAR-POSSESSIVE-PRONOUNS*"), list(QUOTE, EQUALP)), list(makeSymbol("CPUSH"), makeKeyword("SINGULAR"), makeSymbol("NUMBERS"))),
		    list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER?"), makeSymbol("STRING"), makeSymbol("*PLURAL-POSSESSIVE-PRONOUNS*"), list(QUOTE, EQUALP)), list(makeSymbol("CPUSH"), makeKeyword("PLURAL"), makeSymbol("NUMBERS"))), list(RET, makeSymbol("NUMBERS"))));

    protected static final SubLList $list_alt727 = list(makeString("@return numberp; the person of this noun; 1, 2, or 3"), list(RET,
	    list(makeSymbol("FCOND"), list(list(EQUALP, makeSymbol("STRING"), makeString("my")), ONE_INTEGER), list(list(EQUALP, makeSymbol("STRING"), makeString("your")), TWO_INTEGER), list(list(EQUALP, makeSymbol("STRING"), makeString("our")), ONE_INTEGER), list(T, THREE_INTEGER))));

    protected static final SubLList $list_alt733 = list(makeString("@return listp; a list of genders of this pronoun with possible gender values \n   :FEMININE, :MASCULINE and :NEUTER"),
	    list(RET, list(makeSymbol("CDR"), list(makeSymbol("ASSOC"), makeSymbol("STRING"), list(QUOTE,
		    list(list(makeString("my"), makeKeyword("MASCULINE"), makeKeyword("FEMININE")), list(makeString("your"), makeKeyword("MASCULINE"), makeKeyword("FEMININE"), makeKeyword("NEUTER")), list(makeString("his"), makeKeyword("MASCULINE")), list(makeString("her"), makeKeyword("FEMININE")),
			    list(makeString("its"), makeKeyword("NEUTER")), list(makeString("our"), makeKeyword("MASCULINE"), makeKeyword("FEMININE"), makeKeyword("NEUTER")), list(makeString("their"), makeKeyword("MASCULINE"), makeKeyword("FEMININE"), makeKeyword("NEUTER")))),
		    list(QUOTE, EQUALP)))));

    protected static final SubLList $list_alt735 = list(list(makeString("my"), makeKeyword("MASCULINE"), makeKeyword("FEMININE")), list(makeString("your"), makeKeyword("MASCULINE"), makeKeyword("FEMININE"), makeKeyword("NEUTER")), list(makeString("his"), makeKeyword("MASCULINE")),
	    list(makeString("her"), makeKeyword("FEMININE")), list(makeString("its"), makeKeyword("NEUTER")), list(makeString("our"), makeKeyword("MASCULINE"), makeKeyword("FEMININE"), makeKeyword("NEUTER")),
	    list(makeString("their"), makeKeyword("MASCULINE"), makeKeyword("FEMININE"), makeKeyword("NEUTER")));

    protected static final SubLList $list_alt738 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-REFS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-ANTECEDENT"), NIL, makeKeyword("PUBLIC")));

    protected static final SubLList $list_alt746 = list(makeSymbol("POSSESSIVE-WORD"));

    protected static final SubLList $list_alt747 = list(list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-POSSESSOR"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-POSSESSED"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-COMPLEMENTS"), NIL, makeKeyword("PUBLIC")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-MODIFIEDS"), NIL, makeKeyword("PUBLIC")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("GET-KEYWORD-RENAMINGS"), list(makeSymbol("&OPTIONAL"), makeSymbol("KEYWORDS")), makeKeyword("INSTANTIATE-TEMPLATE"), makeKeyword("PROTECTED")),
	    list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("LOGICAL-FORM-INT"), NIL, makeKeyword("PROTECTED")));

    protected static final SubLList $list_alt748 = list(makeSymbol("&OPTIONAL"), list(makeSymbol("KEYWORDS"), list(QUOTE, list(makeKeyword("POSSESSOR"), makeKeyword("POSSESSED")))));

    protected static final SubLList $list_alt749 = list(list(makeSymbol("CLET"),
	    list(list(makeSymbol("CONJUNCTS"), NIL), list(makeSymbol("POSSESSOR"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-POSSESSOR")))),
		    list(makeSymbol("POSSESSED"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-POSSESSED"))))),
	    list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("POSSESSOR"), list(makeSymbol("MEMBER"), makeKeyword("POSSESSOR"), makeSymbol("KEYWORDS"), list(QUOTE, EQL))),
		    list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("POSSESSOR"), makeSymbol("POSSESSOR")), makeSymbol("CONJUNCTS"))),
	    list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), makeSymbol("POSSESSED"), list(makeSymbol("MEMBER"), makeKeyword("POSSESSED"), makeSymbol("KEYWORDS"), list(QUOTE, EQL))),
		    list(makeSymbol("CPUSH"), list(makeSymbol("COORDINATE-KEYWORD-RENAMING"), makeKeyword("POSSESSED"), makeSymbol("POSSESSED")), makeSymbol("CONJUNCTS"))),
	    list(RET, list(makeSymbol("DISJUNCTIVE-KEYWORD-RENAMINGS"), makeSymbol("CONJUNCTS"), NIL))));

    protected static final SubLList $list_alt750 = list(makeKeyword("POSSESSOR"), makeKeyword("POSSESSED"));

    protected static final SubLList $list_alt756 = list(makeString("@return nominal-word-tree-p; the word that is the possessor in this possessive relation"),
	    list(makeSymbol("CLET"), list(list(makeSymbol("POSSESSOR"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-SISTER")), MINUS_ONE_INTEGER))), list(RET, list(makeSymbol("FWHEN"), makeSymbol("POSSESSOR"), makeSymbol("POSSESSOR")))));

    protected static final SubLList $list_alt758 = list(makeString("@return nominal-word-tree-p; the word that is the possessed in this possessive relation"),
	    list(makeSymbol("CLET"),
		    list(list(makeSymbol("GRANDMOTHER"), list(makeSymbol("FWHEN"), makeSymbol("MOTHER"), list(makeSymbol("FIM"), makeSymbol("MOTHER"), list(QUOTE, makeSymbol("GET-MOTHER"))))),
			    list(makeSymbol("GRANDMOTHER-HEAD"), list(makeSymbol("FWHEN"), list(makeSymbol("NOMINAL-PHRASE-TREE-P"), makeSymbol("GRANDMOTHER")), list(makeSymbol("FIM"), makeSymbol("GRANDMOTHER"), list(QUOTE, makeSymbol("GET-HEAD")))))),
		    list(RET, list(makeSymbol("FWHEN"), makeSymbol("GRANDMOTHER-HEAD"), makeSymbol("GRANDMOTHER-HEAD")))));

    protected static final SubLList $list_alt761 = list(makeString("@return listp; a list of all complements of this tree, in surface order"),
	    list(makeSymbol("CLET"),
		    list(list(makeSymbol("COMPLEMENTS"), NIL), list(makeSymbol("POSSESSOR"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-POSSESSOR")))),
			    list(makeSymbol("POSSESSED"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-POSSESSED"))))),
		    list(makeSymbol("PWHEN"), makeSymbol("POSSESSED"), list(makeSymbol("CPUSH"), makeSymbol("POSSESSED"), makeSymbol("COMPLEMENTS"))), list(makeSymbol("PWHEN"), makeSymbol("POSSESSOR"), list(makeSymbol("CPUSH"), makeSymbol("POSSESSOR"), makeSymbol("COMPLEMENTS"))),
		    list(RET, makeSymbol("COMPLEMENTS"))));

    protected static final SubLList $list_alt763 = list(makeString("@return listp; the constituents this possessive marker modifies"),
	    list(makeSymbol("PWHEN"), makeSymbol("MOTHER"),
		    list(makeSymbol("CLET"), list(list(makeSymbol("CANDIDATE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-POSSESSED"))))), list(makeSymbol("PWHEN"), makeSymbol("CANDIDATE"), list(makeSymbol("PUNLESS"),
			    list(makeSymbol("MEMBER?"), makeSymbol("MOTHER"), list(makeSymbol("FIM"), makeSymbol("CANDIDATE"), list(QUOTE, makeSymbol("GET-COMPLEMENTS"))), list(QUOTE, EQ)), list(RET, list(makeSymbol("LIST"), makeSymbol("CANDIDATE"))))))));

    protected static final SubLList $list_alt767 = list(makeSymbol("NUMERICAL-TREE"));

    protected static final SubLList $list_alt774 = list(makeSymbol("PUNCTUATION-WORD"));

    protected static final SubLList $list_alt777 = list(new SubLObject[] { cons(makeKeyword("NN"), makeSymbol("NN-TREE")), cons(makeKeyword("NNS"), makeSymbol("NNS-TREE")), cons(makeKeyword("NNP"), makeSymbol("NNP-TREE")), cons($NNPS, makeSymbol("NNPS-TREE")),
	    cons(makeKeyword("NPS"), makeSymbol("NNPS-TREE")), cons(makeKeyword("NP"), makeSymbol("NAME-WORD-TREE")), cons(makeKeyword("NPLIST"), makeSymbol("NOMINAL-WORD-TREE")), cons(makeKeyword("WP"), makeSymbol("WP-TREE")), cons(makeKeyword("PP"), makeSymbol("NOMINAL-WORD-TREE")),
	    cons(makeKeyword("PRP"), makeSymbol("PRP-TREE")), cons(makeKeyword("FW"), makeSymbol("NOMINAL-WORD-TREE")), cons(makeKeyword("VBZ"), makeSymbol("VBZ-TREE")), cons(makeKeyword("VBN"), makeSymbol("VBN-TREE")), cons(makeKeyword("VBD"), makeSymbol("VBD-TREE")),
	    cons(makeKeyword("VBP"), makeSymbol("VBP-TREE")), cons(makeKeyword("VB"), makeSymbol("VB-TREE")), cons(makeKeyword("VBG"), makeSymbol("VBG-TREE")), cons(makeKeyword("AUX"), makeSymbol("AUX-VERB-TREE")), cons($AUXZ, makeSymbol("AUX-VERB-TREE")),
	    cons($AUXD, makeSymbol("AUX-VERB-TREE")), cons($AUXG, makeSymbol("AUX-VERB-TREE")), cons(makeKeyword("MD"), makeSymbol("MODAL-VERB-TREE")), cons(makeKeyword("IN"), makeSymbol("PREPOSITIONAL-WORD-TREE")),
	    cons(makeKeyword("TO"), makeSymbol("PREPOSITIONAL-WORD-TREE")), cons(makeKeyword("CC"), makeSymbol("COORDINATE-WORD-TREE")), cons(makeKeyword("JJ"), makeSymbol("ADJECTIVAL-WORD-TREE")), cons(makeKeyword("JJR"), makeSymbol("ADJECTIVAL-WORD-TREE")),
	    cons(makeKeyword("JJS"), makeSymbol("ADJECTIVAL-WORD-TREE")), cons(makeKeyword("RB"), makeSymbol("ADVERBIAL-WORD-TREE")), cons(makeKeyword("WRB"), makeSymbol("WRB-WORD-TREE")), cons(makeKeyword("RBR"), makeSymbol("ADVERBIAL-WORD-TREE")),
	    cons(makeKeyword("RBS"), makeSymbol("ADVERBIAL-WORD-TREE")), cons(makeKeyword("DT"), makeSymbol("DETERMINER-WORD-TREE")), cons(makeKeyword("WDT"), makeSymbol("WDT-WORD-TREE")), cons(makeKeyword("PRP$"), makeSymbol("PRP$-TREE")),
	    cons(makeKeyword("PDT"), makeSymbol("DETERMINER-WORD-TREE")), cons(makeKeyword("PP$"), makeSymbol("DETERMINER-WORD-TREE")), cons(makeKeyword("RP"), makeSymbol("PARTICLE-WORD-TREE")), cons(makeKeyword("POS"), makeSymbol("POSSESSIVE-WORD-TREE")),
	    cons(makeKeyword("CD"), makeSymbol("CARDINAL-WORD-TREE")), cons(makeKeyword("EX"), makeSymbol("EXISTENTIAL-WORD-TREE")), cons(makeKeyword("$"), makeSymbol("DOLLAR-WORD-TREE")), cons(makeKeyword("."), makeSymbol("PUNCTUATION-WORD-TREE")),
	    cons(makeKeyword(","), makeSymbol("PUNCTUATION-WORD-TREE")), cons(makeKeyword(":"), makeSymbol("PUNCTUATION-WORD-TREE")), cons(makeKeyword("''"), makeSymbol("PUNCTUATION-WORD-TREE")), cons(makeKeyword("``"), makeSymbol("PUNCTUATION-WORD-TREE")),
	    cons(makeKeyword("'"), makeSymbol("PUNCTUATION-WORD-TREE")), cons(makeKeyword("`"), makeSymbol("PUNCTUATION-WORD-TREE")), cons(makeKeyword("("), makeSymbol("PUNCTUATION-WORD-TREE")), cons(makeKeyword(")"), makeSymbol("PUNCTUATION-WORD-TREE")),
	    cons(makeKeyword("-LRB-"), makeSymbol("PUNCTUATION-WORD-TREE")), cons(makeKeyword("-RRB-"), makeSymbol("PUNCTUATION-WORD-TREE")), cons(makeKeyword("LS"), makeSymbol("PUNCTUATION-WORD-TREE")) });

    protected static final SubLList $list_alt779 = list(list(makeSymbol("DAUGHTERS"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")));

    protected static final SubLList $list_alt784 = list(makeSymbol("LIST-OF-STRINGS"));

    protected static final SubLList $list_alt785 = list(makeString("@param LIST-OF-STRINGS listp; a list of strings\n   @return booleanp; T is the yield of the tree contains every string\n   in LIST-OF-STRINGS, NIL otherwise.\n   @owner bertolo"),
	    list(makeSymbol("CLET"), list(list(makeSymbol("YIELD"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("YIELD")))), list(makeSymbol("TREE-WORDS"), NIL), list(makeSymbol("FAIL"), NIL)),
		    list(makeSymbol("CDOLIST"), list(makeSymbol("TREE"), makeSymbol("YIELD")), list(makeSymbol("CPUSH"), list(makeSymbol("FIM"), makeSymbol("TREE"), list(QUOTE, makeSymbol("GET-STRING"))), makeSymbol("TREE-WORDS"))),
		    list(makeSymbol("CSOME"), list(makeSymbol("TERM"), makeSymbol("LIST-OF-STRINGS"), makeSymbol("FAIL")),
			    list(makeSymbol("CLET"), list(makeSymbol("MATCH")),
				    list(makeSymbol("CSOME"), list(makeSymbol("WORD"), makeSymbol("TREE-WORDS"), makeSymbol("MATCH")), list(makeSymbol("PWHEN"), list(EQUALP, makeSymbol("TERM"), makeSymbol("WORD")), list(makeSymbol("CSETQ"), makeSymbol("MATCH"), T))),
				    list(makeSymbol("PUNLESS"), makeSymbol("MATCH"), list(makeSymbol("CSETQ"), makeSymbol("FAIL"), T)))),
		    list(RET, list(makeSymbol("CNOT"), makeSymbol("FAIL")))));

    protected static final SubLList $list_alt788 = list(makeString("@param LIST-OF-STRINGS listp; a list of strings\n   @return booleanp; T all the subtrees of this tree that cover the\n   strings in LIST-OF-STRINGS.\n   @owner bertolo"),
	    list(makeSymbol("PUNLESS"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("COVERS")), makeSymbol("LIST-OF-STRINGS")), list(RET, NIL)),
	    list(makeSymbol("CLET"), list(makeSymbol("FAIL")),
		    list(makeSymbol("PWHEN"), list(makeSymbol("PHRASE-TREE-P"), makeSymbol("SELF")),
			    list(makeSymbol("DO-VECTOR"), list(makeSymbol("DAUGHTER"), list(makeSymbol("GET-PHRASE-TREE-DAUGHTERS"), makeSymbol("SELF")), makeKeyword("ELEMENT-NUM"), NIL, $DONE, makeSymbol("FAIL")),
				    list(makeSymbol("PWHEN"), list(makeSymbol("FIM"), makeSymbol("DAUGHTER"), list(QUOTE, makeSymbol("COVERS")), makeSymbol("LIST-OF-STRINGS")), list(makeSymbol("CSETQ"), makeSymbol("FAIL"), T)))),
		    list(RET, list(makeSymbol("CNOT"), makeSymbol("FAIL")))));

    protected static final SubLList $list_alt789 = list(makeUninternedSymbol("START"), makeUninternedSymbol("END"), makeUninternedSymbol("DELTA"));

    protected static final SubLList $list_alt792 = list(makeString("@param LIST-OF-STRINGS listp; a list of strings\n   @return listp; a list of all the minimal subtrees of this tree that cover the\n   strings in LIST-OF-STRINGS.\n   @owner bertolo"),
	    list(makeSymbol("CLET"), list(list(makeSymbol("MINIMAL"), NIL), list(makeSymbol("QUEUE"), list(makeSymbol("CREATE-QUEUE")))), list(makeSymbol("ENQUEUE"), makeSymbol("SELF"), makeSymbol("QUEUE")),
		    list(makeSymbol("UNTIL"), list(makeSymbol("QUEUE-EMPTY-P"), makeSymbol("QUEUE")),
			    list(makeSymbol("CLET"), list(list(makeSymbol("SUBTREE"), list(makeSymbol("DEQUEUE"), makeSymbol("QUEUE")))),
				    list(makeSymbol("PIF"), list(makeSymbol("FIM"), makeSymbol("SUBTREE"), list(QUOTE, makeSymbol("COVERS-MINIMALLY")), makeSymbol("LIST-OF-STRINGS")), list(makeSymbol("CPUSH"), makeSymbol("SUBTREE"), makeSymbol("MINIMAL")),
					    list(makeSymbol("PWHEN"), list(makeSymbol("CAND"), list(makeSymbol("FIM"), makeSymbol("SUBTREE"), list(QUOTE, makeSymbol("COVERS")), makeSymbol("LIST-OF-STRINGS")), list(makeSymbol("PHRASE-TREE-P"), makeSymbol("SUBTREE"))),
						    list(makeSymbol("DO-VECTOR"), list(makeSymbol("DAUGHTER"), list(makeSymbol("GET-PHRASE-TREE-DAUGHTERS"), makeSymbol("SUBTREE"))), list(makeSymbol("ENQUEUE"), makeSymbol("DAUGHTER"), makeSymbol("QUEUE"))))))),
		    list(RET, makeSymbol("MINIMAL"))));

    protected static final SubLList $list_alt8 = list(makeKeyword("PROTECTED"));

    protected static final SubLList $list_alt87 = list(makeString("@return stringp; the string of this word-tree"), list(RET, makeSymbol("STRING")));

    protected static final SubLList $list_alt9 = list(list(makeSymbol("CLET"), list(makeSymbol("SEMTRANS")),
	    list(makeSymbol("CDOLIST"), list(makeSymbol("RLE"), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-RANKED-LEXES")))),
		    list(makeSymbol("CSETQ"), makeSymbol("SEMTRANS"), list(makeSymbol("FIM"), list(makeSymbol("RLE-LEX"), makeSymbol("RLE")), list(QUOTE, makeSymbol("GET")), makeKeyword("SEMTRANS"))),
		    list(makeSymbol("PWHEN"), list(makeSymbol("MEMBER?"), makeKeyword("REPLACE"), list(makeSymbol("FORMULA-KEYWORDS"), makeSymbol("SEMTRANS"))), list(RET, T))),
	    list(RET, NIL)));

    protected static final SubLList $list_alt91 = list(makeString("@return non-negative-integer-p; the absolute index of this word"), list(RET, makeSymbol("ABS-IDX")));

    protected static final SubLList $list_alt95 = list(makeString("@return listp; the list of lexical entries of this word"),
	    list(RET, list(makeSymbol("MAPCAR"), list(QUOTE, makeSymbol("CAR")), list(makeSymbol("FIM"), makeSymbol("SELF"), list(QUOTE, makeSymbol("GET-RANKED-LEXES"))))));

    protected static final SubLList $list_alt97 = list(makeString("@return listp; the list of ranked lexical entries of this word"), list(RET, makeSymbol("LEXES")));

    protected static final SubLList $list101 = list(makeKeyword("READ-ONLY"), makeKeyword("PUBLIC"));
}

/**
 * Total time: 5589 ms
 */
