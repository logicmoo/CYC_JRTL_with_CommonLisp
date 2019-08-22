package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.cfasl.cfasl_input;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class set_contents extends SubLTranslatedFile {
    public static final SubLFile me = new set_contents();

    public static final String myName = "com.cyc.cycjava.cycl.set_contents";

    public static final String myFingerPrint = "6d25b9d3725b3d84d4d1b8977da7c78f08bbc78b3ccf8256418aca09375f3771";

    // deflexical
    private static final SubLSymbol $set_contents_grow_to_keyhash_size$ = makeSymbol("*SET-CONTENTS-GROW-TO-KEYHASH-SIZE*");

    // deflexical
    private static final SubLSymbol $set_contents_shrink_to_list_size$ = makeSymbol("*SET-CONTENTS-SHRINK-TO-LIST-SIZE*");

    private static final SubLInteger $int$128 = makeInteger(128);

    private static final SubLInteger $int$110 = makeInteger(110);

    private static final SubLList $list2 = list(makeSymbol("INLINE"), makeSymbol("SET-CONTENTS-STYLE"));







    private static final SubLList $list6 = list(makeSymbol("INLINE"), makeSymbol("SET-CONTENTS-MEMBER-SINGLETON-STYLE"), makeSymbol("SET-CONTENTS-MEMBER-LIST-STYLE"), makeSymbol("SET-CONTENTS-MEMBER-KEYHASH-STYLE"));

    private static final SubLString $str7$Keyhash_test_conflict___S_and__S = makeString("Keyhash test conflict: ~S and ~S");

    private static final SubLList $list8 = list(makeSymbol("INLINE"), makeSymbol("SET-CONTENTS-ADD-KEYHASH-STYLE"));







    private static final SubLList $list12 = list(list(makeSymbol("ELEMENT-VAR"), makeSymbol("SET-CONTENTS"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list13 = list(makeKeyword("DONE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");



    private static final SubLSymbol $sym16$SET_CONTENTS_VAR = makeUninternedSymbol("SET-CONTENTS-VAR");

    private static final SubLSymbol $sym17$BASIS_OBJECT = makeUninternedSymbol("BASIS-OBJECT");

    private static final SubLSymbol $sym18$STATE = makeUninternedSymbol("STATE");



    private static final SubLSymbol DO_SET_CONTENTS_BASIS_OBJECT = makeSymbol("DO-SET-CONTENTS-BASIS-OBJECT");



    private static final SubLSymbol DO_SET_CONTENTS_INITIAL_STATE = makeSymbol("DO-SET-CONTENTS-INITIAL-STATE");

    private static final SubLSymbol DO_SET_CONTENTS_UPDATE_STATE = makeSymbol("DO-SET-CONTENTS-UPDATE-STATE");



    private static final SubLSymbol $sym25$DO_SET_CONTENTS_DONE_ = makeSymbol("DO-SET-CONTENTS-DONE?");

    private static final SubLSymbol DO_SET_CONTENTS_NEXT = makeSymbol("DO-SET-CONTENTS-NEXT");



    private static final SubLSymbol $sym28$DO_SET_CONTENTS_ELEMENT_VALID_ = makeSymbol("DO-SET-CONTENTS-ELEMENT-VALID?");





    private static final SubLString $str31$new_set_contents_did_not_have_siz = makeString("new set-contents did not have size zero");

    private static final SubLString $str32$set_contents_was_purported_to_con = makeString("set-contents was purported to contain 1 as an element but should have been empty");

    private static final SubLString $str33$do_set_contents_should_not_have_i = makeString("do-set-contents should not have iterated over set-contents.");

    private static final SubLString $str34$size_did_not_increment_to_1_when_ = makeString("size did not increment to 1 when an element was added");

    private static final SubLString $str35$set_contents_should_have_had_1_as = makeString("set-contents should have had 1 as an element but did not");

    private static final SubLString $str36$do_set_contents_should_have_itera = makeString("do-set-contents should have iterated once over set-contents.");

    private static final SubLString $str37$size_did_not_stay_1_when_a_redund = makeString("size did not stay 1 when a redundant element was added");

    private static final SubLString $str38$incorrectly_thought_that_NIL_was_ = makeString("incorrectly thought that NIL was an element of the set-contents");

    private static final SubLString $str39$size_did_not_increment_to_2_when_ = makeString("size did not increment to 2 when a new element was added");

    private static final SubLString $str40$failed_to_identify_that_NIL_is_an = makeString("failed to identify that NIL is an element of the set-contents");

    private static final SubLString $str41$do_set_contents_should_have_itera = makeString("do-set-contents should have iterated twice over set-contents.");

    private static final SubLInteger $int$2000 = makeInteger(2000);

    private static final SubLInteger $int$2001 = makeInteger(2001);

    private static final SubLString $$$size_did_not_increment_to_2001 = makeString("size did not increment to 2001");

    private static final SubLInteger $int$212 = makeInteger(212);

    private static final SubLString $$$212_was_not_a_member = makeString("212 was not a member");

    public static final SubLString $str47$do_set_contents_should_have_itera = makeString("do-set-contents should have iterated 2001 times over set-contents.");

    private static final SubLString $str48$removing_an_element_that_wasn_t_t = makeString("removing an element that wasn't there decreased the size of the set-contents");

    private static final SubLString $str49$removing_an_element_failed_to_dec = makeString("removing an element failed to decrement the size of a large set-contents");

    private static final SubLString $str50$do_set_contents_should_have_itera = makeString("do-set-contents should have iterated 2000 times over set-contents.");

    private static final SubLString $str51$newly_emptied_set_contents_was_pu = makeString("newly emptied set-contents was purported to contain 1 as an element but should have been empty except for NIL");

    private static final SubLString $str52$failed_to_identify_that_NIL_is_st = makeString("failed to identify that NIL is still an element of the set-contents");

    private static final SubLString $str53$size_did_not_decrement_to_1_when_ = makeString("size did not decrement to 1 when lots of elements were deleted");

    private static final SubLString $str54$newly_emptied_set_contents_did_no = makeString("newly emptied set-contents did not have size zero");



    public static SubLObject set_contents_singleton_element_p(final SubLObject element) {
        return makeBoolean((!element.isList()) && (NIL == keyhash.keyhash_p(element)));
    }

    public static SubLObject set_contents_style(final SubLObject v_set_contents) {
        if (v_set_contents.isList()) {
            return $LIST;
        }
        if (NIL != keyhash.keyhash_p(v_set_contents)) {
            return $KEYHASH;
        }
        return $SINGLETON;
    }

    public static SubLObject set_contents_member_singleton_style(final SubLObject v_set_contents, final SubLObject element, final SubLObject test) {
        return funcall(test, element, v_set_contents);
    }

    public static SubLObject set_contents_member_list_style(final SubLObject v_set_contents, final SubLObject element, final SubLObject test) {
        return subl_promotions.memberP(element, v_set_contents, test, UNPROVIDED);
    }

    public static SubLObject set_contents_nmember_list_style(final SubLObject v_set_contents, final SubLObject element, final SubLObject test) {
        return list_utilities.nmemberP(element, v_set_contents, test);
    }

    public static SubLObject set_contents_member_keyhash_style(final SubLObject v_set_contents, final SubLObject element, final SubLObject test) {
        return keyhash.getkeyhash(element, v_set_contents);
    }

    public static SubLObject set_contents_matching_element_singleton_style(final SubLObject v_set_contents, final SubLObject element, final SubLObject test) {
        if (NIL != funcall(test, element, v_set_contents)) {
            return v_set_contents;
        }
        return NIL;
    }

    public static SubLObject set_contents_matching_element_list_style(final SubLObject v_set_contents, final SubLObject element, final SubLObject test) {
        return find(element, v_set_contents, test, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject set_contents_matching_element_keyhash_style(final SubLObject v_set_contents, final SubLObject element, final SubLObject test) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject keyhash_test = keyhash.keyhash_test(v_set_contents);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!hash_table_utilities.hash_test_to_symbol(test).eql(hash_table_utilities.hash_test_to_symbol(keyhash_test)))) {
            Errors.error($str7$Keyhash_test_conflict___S_and__S, test, keyhash_test);
        }
        return keyhash.keyhash_matching_key(element, v_set_contents);
    }

    public static SubLObject set_contents_add_singleton_style(SubLObject v_set_contents, final SubLObject element, final SubLObject test) {
        final SubLObject already_thereP = set_contents_member_singleton_style(v_set_contents, element, test);
        if (NIL == already_thereP) {
            v_set_contents = list(element, v_set_contents);
        }
        return v_set_contents;
    }

    public static SubLObject set_contents_add_list_style(SubLObject v_set_contents, final SubLObject element, final SubLObject test) {
        final SubLObject already_thereP = set_contents_member_list_style(v_set_contents, element, test);
        if (NIL == already_thereP) {
            if ((NIL == v_set_contents) && (NIL != set_contents_singleton_element_p(element))) {
                v_set_contents = element;
            } else {
                v_set_contents = cons(element, v_set_contents);
                final SubLObject size = length(v_set_contents);
                if (size.numG($set_contents_grow_to_keyhash_size$.getGlobalValue())) {
                    v_set_contents = keyhash_utilities.keyhash_list_elements(v_set_contents, test, size);
                }
            }
        }
        return v_set_contents;
    }

    public static SubLObject set_contents_add_keyhash_style(final SubLObject v_set_contents, final SubLObject element, final SubLObject test) {
        keyhash.setkeyhash(element, v_set_contents);
        return v_set_contents;
    }

    public static SubLObject set_contents_delete_singleton_style(SubLObject v_set_contents, final SubLObject element, final SubLObject test) {
        final SubLObject already_thereP = set_contents_member_singleton_style(v_set_contents, element, test);
        if (NIL != already_thereP) {
            v_set_contents = NIL;
        }
        return v_set_contents;
    }

    public static SubLObject set_contents_delete_list_style(SubLObject v_set_contents, final SubLObject element, final SubLObject test) {
        v_set_contents = delete(element, v_set_contents, test, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != list_utilities.singletonP(v_set_contents)) {
            final SubLObject sole_element = v_set_contents.first();
            if (NIL != set_contents_singleton_element_p(sole_element)) {
                v_set_contents = sole_element;
            }
        }
        return v_set_contents;
    }

    public static SubLObject set_contents_delete_keyhash_style(SubLObject v_set_contents, final SubLObject element, final SubLObject test) {
        final SubLObject already_thereP = set_contents_member_keyhash_style(v_set_contents, element, test);
        if (NIL != already_thereP) {
            keyhash.remkeyhash(element, v_set_contents);
            final SubLObject size = keyhash.keyhash_count(v_set_contents);
            if (size.numL($set_contents_shrink_to_list_size$.getGlobalValue())) {
                v_set_contents = keyhash_utilities.keyhash_element_list(v_set_contents);
            }
        }
        return v_set_contents;
    }

    public static SubLObject set_contents_p(final SubLObject v_object) {
        return T;
    }

    public static SubLObject set_contents_of_type_p(final SubLObject v_object, final SubLObject type) {
        if (v_object.isList() || (NIL != keyhash.keyhash_p(v_object))) {
            return T;
        }
        assert NIL != function_spec_p(type) : "Types.function_spec_p(type) " + "CommonSymbols.NIL != Types.function_spec_p(type) " + type;
        return makeBoolean((NIL != set_contents_singleton_element_p(v_object)) && (NIL != funcall(type, v_object)));
    }

    public static SubLObject new_set_contents(SubLObject size, SubLObject test) {
        if (size == UNPROVIDED) {
            size = ZERO_INTEGER;
        }
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        assert NIL != subl_promotions.non_negative_integer_p(size) : "subl_promotions.non_negative_integer_p(size) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(size) " + size;
        assert NIL != hash_table_utilities.valid_hash_test_p(test) : "hash_table_utilities.valid_hash_test_p(test) " + "CommonSymbols.NIL != hash_table_utilities.valid_hash_test_p(test) " + test;
        if (size.numG($set_contents_grow_to_keyhash_size$.getGlobalValue())) {
            return keyhash.new_keyhash(size, test);
        }
        return NIL;
    }

    public static SubLObject copy_set_contents(final SubLObject v_set_contents) {
        final SubLObject pcase_var = set_contents_style(v_set_contents);
        if (pcase_var.eql($SINGLETON)) {
            return v_set_contents;
        }
        if (pcase_var.eql($LIST)) {
            return copy_list(v_set_contents);
        }
        if (pcase_var.eql($KEYHASH)) {
            return keyhash.copy_keyhash(v_set_contents);
        }
        return NIL;
    }

    public static SubLObject set_contents_size(final SubLObject v_set_contents) {
        final SubLObject pcase_var = set_contents_style(v_set_contents);
        if (pcase_var.eql($SINGLETON)) {
            return ONE_INTEGER;
        }
        if (pcase_var.eql($LIST)) {
            return length(v_set_contents);
        }
        if (pcase_var.eql($KEYHASH)) {
            return keyhash.keyhash_count(v_set_contents);
        }
        return NIL;
    }

    public static SubLObject set_contents_emptyP(final SubLObject v_set_contents) {
        final SubLObject pcase_var = set_contents_style(v_set_contents);
        if (pcase_var.eql($SINGLETON)) {
            return NIL;
        }
        if (pcase_var.eql($LIST)) {
            return sublisp_null(v_set_contents);
        }
        if (pcase_var.eql($KEYHASH)) {
            return zerop(keyhash.keyhash_count(v_set_contents));
        }
        return NIL;
    }

    public static SubLObject set_contents_singletonP(final SubLObject v_set_contents) {
        final SubLObject pcase_var = set_contents_style(v_set_contents);
        if (pcase_var.eql($SINGLETON)) {
            return T;
        }
        if (pcase_var.eql($LIST)) {
            return NIL;
        }
        if (pcase_var.eql($KEYHASH)) {
            return NIL;
        }
        return NIL;
    }

    public static SubLObject set_contents_memberP(final SubLObject element, final SubLObject v_set_contents, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        final SubLObject pcase_var = set_contents_style(v_set_contents);
        if (pcase_var.eql($SINGLETON)) {
            return set_contents_member_singleton_style(v_set_contents, element, test);
        }
        if (pcase_var.eql($LIST)) {
            return set_contents_member_list_style(v_set_contents, element, test);
        }
        if (pcase_var.eql($KEYHASH)) {
            return set_contents_member_keyhash_style(v_set_contents, element, test);
        }
        return NIL;
    }

    public static SubLObject set_contents_nmemberP(final SubLObject element, final SubLObject v_set_contents, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        final SubLObject pcase_var = set_contents_style(v_set_contents);
        if (pcase_var.eql($SINGLETON)) {
            return set_contents_member_singleton_style(v_set_contents, element, test);
        }
        if (pcase_var.eql($LIST)) {
            return set_contents_nmember_list_style(v_set_contents, element, test);
        }
        if (pcase_var.eql($KEYHASH)) {
            return set_contents_member_keyhash_style(v_set_contents, element, test);
        }
        return NIL;
    }

    public static SubLObject set_contents_matching_element(final SubLObject element, final SubLObject v_set_contents, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        final SubLObject pcase_var = set_contents_style(v_set_contents);
        if (pcase_var.eql($SINGLETON)) {
            return set_contents_matching_element_singleton_style(v_set_contents, element, test);
        }
        if (pcase_var.eql($LIST)) {
            return set_contents_matching_element_list_style(v_set_contents, element, test);
        }
        if (pcase_var.eql($KEYHASH)) {
            return set_contents_matching_element_keyhash_style(v_set_contents, element, test);
        }
        return NIL;
    }

    public static SubLObject set_contents_random_element(final SubLObject v_set_contents) {
        final SubLObject pcase_var = set_contents_style(v_set_contents);
        if (pcase_var.eql($SINGLETON)) {
            return v_set_contents;
        }
        if (pcase_var.eql($LIST)) {
            return list_utilities.random_element(v_set_contents);
        }
        if (pcase_var.eql($KEYHASH)) {
            return keyhash.keyhash_random_key(v_set_contents);
        }
        return NIL;
    }

    public static SubLObject singleton_set_contents_element(final SubLObject v_set_contents) {
        return v_set_contents;
    }

    public static SubLObject set_contents_add(final SubLObject element, final SubLObject v_set_contents, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        assert NIL != hash_table_utilities.valid_hash_test_p(test) : "hash_table_utilities.valid_hash_test_p(test) " + "CommonSymbols.NIL != hash_table_utilities.valid_hash_test_p(test) " + test;
        final SubLObject pcase_var = set_contents_style(v_set_contents);
        if (pcase_var.eql($SINGLETON)) {
            return set_contents_add_singleton_style(v_set_contents, element, test);
        }
        if (pcase_var.eql($LIST)) {
            return set_contents_add_list_style(v_set_contents, element, test);
        }
        if (pcase_var.eql($KEYHASH)) {
            return set_contents_add_keyhash_style(v_set_contents, element, test);
        }
        return NIL;
    }

    public static SubLObject set_contents_delete(final SubLObject element, final SubLObject v_set_contents, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        assert NIL != hash_table_utilities.valid_hash_test_p(test) : "hash_table_utilities.valid_hash_test_p(test) " + "CommonSymbols.NIL != hash_table_utilities.valid_hash_test_p(test) " + test;
        final SubLObject pcase_var = set_contents_style(v_set_contents);
        if (pcase_var.eql($SINGLETON)) {
            return set_contents_delete_singleton_style(v_set_contents, element, test);
        }
        if (pcase_var.eql($LIST)) {
            return set_contents_delete_list_style(v_set_contents, element, test);
        }
        if (pcase_var.eql($KEYHASH)) {
            return set_contents_delete_keyhash_style(v_set_contents, element, test);
        }
        return NIL;
    }

    public static SubLObject clear_set_contents(final SubLObject v_set_contents) {
        final SubLObject pcase_var = set_contents_style(v_set_contents);
        if (pcase_var.eql($KEYHASH)) {
            keyhash.clrkeyhash(v_set_contents);
        }
        return new_set_contents(ZERO_INTEGER, UNPROVIDED);
    }

    public static SubLObject new_set_contents_iterator(final SubLObject v_set_contents) {
        final SubLObject pcase_var = set_contents_style(v_set_contents);
        if (pcase_var.eql($SINGLETON)) {
            return iteration.new_list_iterator(list(v_set_contents));
        }
        if (pcase_var.eql($LIST)) {
            return iteration.new_list_iterator(v_set_contents);
        }
        if (pcase_var.eql($KEYHASH)) {
            return keyhash.new_keyhash_iterator(v_set_contents);
        }
        return NIL;
    }

    public static SubLObject do_set_contents(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list12);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject element_var = NIL;
        SubLObject v_set_contents = NIL;
        destructuring_bind_must_consp(current, datum, $list12);
        element_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list12);
        v_set_contents = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list12);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list12);
            if (NIL == member(current_$1, $list13, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list12);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject set_contents_var = $sym16$SET_CONTENTS_VAR;
        final SubLObject basis_object = $sym17$BASIS_OBJECT;
        final SubLObject state = $sym18$STATE;
        return list(CLET, list(list(set_contents_var, v_set_contents), list(basis_object, list(DO_SET_CONTENTS_BASIS_OBJECT, set_contents_var))), list(CDO, list(list(state, list(DO_SET_CONTENTS_INITIAL_STATE, basis_object, set_contents_var), list(DO_SET_CONTENTS_UPDATE_STATE, state))), list(bq_cons(COR, append(NIL != done ? list(done) : NIL, list(list($sym25$DO_SET_CONTENTS_DONE_, basis_object, state))))), list(CLET, list(list(element_var, list(DO_SET_CONTENTS_NEXT, basis_object, state))), listS(PWHEN, list($sym28$DO_SET_CONTENTS_ELEMENT_VALID_, state, element_var), append(body, NIL)))));
    }

    public static SubLObject do_set_contents_basis_object(final SubLObject v_set_contents) {
        final SubLObject pcase_var = set_contents_style(v_set_contents);
        if (pcase_var.eql($SINGLETON)) {
            return v_set_contents;
        }
        if (pcase_var.eql($LIST)) {
            return v_set_contents;
        }
        if (pcase_var.eql($KEYHASH)) {
            return v_set_contents;
        }
        return NIL;
    }

    public static SubLObject do_set_contents_initial_state(final SubLObject basis_object, final SubLObject v_set_contents) {
        final SubLObject pcase_var = set_contents_style(v_set_contents);
        if (pcase_var.eql($SINGLETON)) {
            return $NOT_DONE;
        }
        if (pcase_var.eql($LIST)) {
            return basis_object;
        }
        if (pcase_var.eql($KEYHASH)) {
            return keyhash.new_keyhash_iterator(basis_object);
        }
        return NIL;
    }

    public static SubLObject do_set_contents_update_state(final SubLObject state) {
        if (state.isKeyword()) {
            return $DONE;
        }
        if (state.isList()) {
            return state.rest();
        }
        return state;
    }

    public static SubLObject do_set_contents_doneP(final SubLObject basis_object, final SubLObject state) {
        if (state.isKeyword()) {
            return eq($DONE, state);
        }
        if (state.isList()) {
            return sublisp_null(state);
        }
        return iteration.iteration_done(state);
    }

    public static SubLObject do_set_contents_next(final SubLObject basis_object, final SubLObject state) {
        if ($NOT_DONE == state) {
            return basis_object;
        }
        if (state.isList()) {
            return state.first();
        }
        return keyhash.keyhash_iterator_next(state);
    }

    public static SubLObject do_set_contents_element_validP(final SubLObject state, final SubLObject element) {
        if ($NOT_DONE == state) {
            return T;
        }
        if (state.isList()) {
            return T;
        }
        return keyhash.do_keyhash_valid_key_p(element);
    }

    public static SubLObject map_set_contents(final SubLObject function, final SubLObject v_set_contents, SubLObject args) {
        if (args == UNPROVIDED) {
            args = NIL;
        }
        assert NIL != function_spec_p(function) : "Types.function_spec_p(function) " + "CommonSymbols.NIL != Types.function_spec_p(function) " + function;
        SubLObject basis_object;
        SubLObject state;
        SubLObject element;
        for (basis_object = do_set_contents_basis_object(v_set_contents), state = NIL, state = do_set_contents_initial_state(basis_object, v_set_contents); NIL == do_set_contents_doneP(basis_object, state); state = do_set_contents_update_state(state)) {
            element = do_set_contents_next(basis_object, state);
            if (NIL != do_set_contents_element_validP(state, element)) {
                apply(function, element, args);
            }
        }
        return NIL;
    }

    public static SubLObject cfasl_input_set_contents(final SubLObject stream, final SubLObject v_set_contents, final SubLObject size, final SubLObject test) {
        final SubLObject pcase_var = set_contents_style(v_set_contents);
        if (pcase_var.eql($SINGLETON)) {
            return cfasl_input_set_contents_singleton_style(stream, v_set_contents, size, test);
        }
        if (pcase_var.eql($LIST)) {
            return cfasl_input_set_contents_list_style(stream, v_set_contents, size, test);
        }
        if (pcase_var.eql($KEYHASH)) {
            return cfasl_input_set_contents_keyhash_style(stream, v_set_contents, size, test);
        }
        return NIL;
    }

    public static SubLObject cfasl_input_set_contents_singleton_style(final SubLObject stream, SubLObject v_set_contents, final SubLObject size, final SubLObject test) {
        if (!ONE_INTEGER.numE(size)) {
            return cfasl_input_set_contents_logically(stream, v_set_contents, size, test);
        }
        final SubLObject element = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        if (NIL != set_contents_singleton_element_p(element)) {
            v_set_contents = element;
        } else {
            v_set_contents = make_list(ONE_INTEGER, NIL);
            rplaca(v_set_contents, element);
        }
        return v_set_contents;
    }

    public static SubLObject cfasl_input_set_contents_list_style(final SubLObject stream, SubLObject v_set_contents, final SubLObject size, final SubLObject test) {
        if (ONE_INTEGER.numE(size)) {
            return cfasl_input_set_contents_singleton_style(stream, v_set_contents, size, test);
        }
        v_set_contents = make_list(size, NIL);
        SubLObject cons;
        SubLObject element;
        for (cons = NIL, cons = v_set_contents; !cons.isAtom(); cons = cons.rest()) {
            element = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            rplaca(cons, element);
        }
        return v_set_contents;
    }

    public static SubLObject cfasl_input_set_contents_keyhash_style(final SubLObject stream, final SubLObject v_set_contents, final SubLObject size, final SubLObject test) {
        return cfasl_input_set_contents_logically(stream, v_set_contents, size, test);
    }

    public static SubLObject cfasl_input_set_contents_logically(final SubLObject stream, SubLObject v_set_contents, final SubLObject size, final SubLObject test) {
        SubLObject i;
        SubLObject element;
        for (i = NIL, i = ZERO_INTEGER; i.numL(size); i = add(i, ONE_INTEGER)) {
            element = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            v_set_contents = set_contents_add(element, v_set_contents, test);
        }
        return v_set_contents;
    }

    public static SubLObject set_contents_element_list(final SubLObject v_set_contents) {
        final SubLObject pcase_var = set_contents_style(v_set_contents);
        if (pcase_var.eql($SINGLETON)) {
            return list(v_set_contents);
        }
        if (pcase_var.eql($LIST)) {
            return copy_list(v_set_contents);
        }
        if (pcase_var.eql($KEYHASH)) {
            return keyhash_utilities.keyhash_element_list(v_set_contents);
        }
        return NIL;
    }

    public static SubLObject set_contents_rebuild(final SubLObject v_set_contents) {
        final SubLObject pcase_var = set_contents_style(v_set_contents);
        if (!pcase_var.eql($SINGLETON)) {
            if (!pcase_var.eql($LIST)) {
                if (pcase_var.eql($KEYHASH)) {
                    keyhash_utilities.keyhash_rebuild(v_set_contents);
                }
            }
        }
        return v_set_contents;
    }

    public static SubLObject test_set_contents() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject test = symbol_function(EQL);
        SubLObject v_set_contents = new_set_contents(ZERO_INTEGER, test);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!ZERO_INTEGER.numE(set_contents_size(v_set_contents)))) {
            Errors.error($str31$new_set_contents_did_not_have_siz);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != set_contents_memberP(ONE_INTEGER, v_set_contents, test))) {
            Errors.error($str32$set_contents_was_purported_to_con);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!ZERO_INTEGER.numE(do_set_contents_iteration_count(v_set_contents)))) {
            Errors.error($str33$do_set_contents_should_not_have_i);
        }
        v_set_contents = set_contents_add(ONE_INTEGER, v_set_contents, test);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!ONE_INTEGER.numE(set_contents_size(v_set_contents)))) {
            Errors.error($str34$size_did_not_increment_to_1_when_);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == set_contents_memberP(ONE_INTEGER, v_set_contents, test))) {
            Errors.error($str35$set_contents_should_have_had_1_as);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!ONE_INTEGER.numE(do_set_contents_iteration_count(v_set_contents)))) {
            Errors.error($str36$do_set_contents_should_have_itera);
        }
        v_set_contents = set_contents_add(ONE_INTEGER, v_set_contents, test);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!ONE_INTEGER.numE(set_contents_size(v_set_contents)))) {
            Errors.error($str37$size_did_not_stay_1_when_a_redund);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != set_contents_memberP(NIL, v_set_contents, test))) {
            Errors.error($str38$incorrectly_thought_that_NIL_was_);
        }
        v_set_contents = set_contents_add(NIL, v_set_contents, test);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!TWO_INTEGER.numE(set_contents_size(v_set_contents)))) {
            Errors.error($str39$size_did_not_increment_to_2_when_);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == set_contents_memberP(NIL, v_set_contents, test))) {
            Errors.error($str40$failed_to_identify_that_NIL_is_an);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!TWO_INTEGER.numE(do_set_contents_iteration_count(v_set_contents)))) {
            Errors.error($str41$do_set_contents_should_have_itera);
        }
        SubLObject n;
        for (n = NIL, n = ZERO_INTEGER; n.numL($int$2000); n = add(n, ONE_INTEGER)) {
            v_set_contents = set_contents_add(n, v_set_contents, test);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!$int$2001.numE(set_contents_size(v_set_contents)))) {
            Errors.error($$$size_did_not_increment_to_2001);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == set_contents_memberP($int$212, v_set_contents, test))) {
            Errors.error($$$212_was_not_a_member);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!$int$2001.numE(do_set_contents_iteration_count(v_set_contents)))) {
            Errors.error($str47$do_set_contents_should_have_itera);
        }
        v_set_contents = set_contents_delete(T, v_set_contents, test);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!$int$2001.numE(set_contents_size(v_set_contents)))) {
            Errors.error($str48$removing_an_element_that_wasn_t_t);
        }
        v_set_contents = set_contents_delete($int$212, v_set_contents, test);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!$int$2000.numE(set_contents_size(v_set_contents)))) {
            Errors.error($str49$removing_an_element_failed_to_dec);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!$int$2000.numE(do_set_contents_iteration_count(v_set_contents)))) {
            Errors.error($str50$do_set_contents_should_have_itera);
        }
        for (n = NIL, n = ZERO_INTEGER; n.numL($int$2000); n = add(n, ONE_INTEGER)) {
            v_set_contents = set_contents_delete(n, v_set_contents, test);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != set_contents_memberP(ONE_INTEGER, v_set_contents, test))) {
            Errors.error($str51$newly_emptied_set_contents_was_pu);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == set_contents_memberP(NIL, v_set_contents, test))) {
            Errors.error($str52$failed_to_identify_that_NIL_is_st);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!ONE_INTEGER.numE(set_contents_size(v_set_contents)))) {
            Errors.error($str53$size_did_not_decrement_to_1_when_);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!ONE_INTEGER.numE(do_set_contents_iteration_count(v_set_contents)))) {
            Errors.error($str36$do_set_contents_should_have_itera);
        }
        v_set_contents = set_contents_delete(NIL, v_set_contents, test);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!ZERO_INTEGER.numE(set_contents_size(v_set_contents)))) {
            Errors.error($str54$newly_emptied_set_contents_did_no);
        }
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!ZERO_INTEGER.numE(do_set_contents_iteration_count(v_set_contents)))) {
            Errors.error($str33$do_set_contents_should_not_have_i);
        }
        v_set_contents = set_contents_add(T, v_set_contents, test);
        v_set_contents = set_contents_delete(T, v_set_contents, test);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!ZERO_INTEGER.numE(set_contents_size(v_set_contents)))) {
            Errors.error($str54$newly_emptied_set_contents_did_no);
        }
        return $SUCCESS;
    }

    public static SubLObject do_set_contents_iteration_count(final SubLObject v_set_contents) {
        SubLObject count = ZERO_INTEGER;
        SubLObject basis_object;
        SubLObject state;
        SubLObject element;
        for (basis_object = do_set_contents_basis_object(v_set_contents), state = NIL, state = do_set_contents_initial_state(basis_object, v_set_contents); NIL == do_set_contents_doneP(basis_object, state); state = do_set_contents_update_state(state)) {
            element = do_set_contents_next(basis_object, state);
            if (NIL != do_set_contents_element_validP(state, element)) {
                count = add(count, ONE_INTEGER);
            }
        }
        return count;
    }

    public static SubLObject declare_set_contents_file() {
        declareFunction(me, "set_contents_singleton_element_p", "SET-CONTENTS-SINGLETON-ELEMENT-P", 1, 0, false);
        declareFunction(me, "set_contents_style", "SET-CONTENTS-STYLE", 1, 0, false);
        declareFunction(me, "set_contents_member_singleton_style", "SET-CONTENTS-MEMBER-SINGLETON-STYLE", 3, 0, false);
        declareFunction(me, "set_contents_member_list_style", "SET-CONTENTS-MEMBER-LIST-STYLE", 3, 0, false);
        declareFunction(me, "set_contents_nmember_list_style", "SET-CONTENTS-NMEMBER-LIST-STYLE", 3, 0, false);
        declareFunction(me, "set_contents_member_keyhash_style", "SET-CONTENTS-MEMBER-KEYHASH-STYLE", 3, 0, false);
        declareFunction(me, "set_contents_matching_element_singleton_style", "SET-CONTENTS-MATCHING-ELEMENT-SINGLETON-STYLE", 3, 0, false);
        declareFunction(me, "set_contents_matching_element_list_style", "SET-CONTENTS-MATCHING-ELEMENT-LIST-STYLE", 3, 0, false);
        declareFunction(me, "set_contents_matching_element_keyhash_style", "SET-CONTENTS-MATCHING-ELEMENT-KEYHASH-STYLE", 3, 0, false);
        declareFunction(me, "set_contents_add_singleton_style", "SET-CONTENTS-ADD-SINGLETON-STYLE", 3, 0, false);
        declareFunction(me, "set_contents_add_list_style", "SET-CONTENTS-ADD-LIST-STYLE", 3, 0, false);
        declareFunction(me, "set_contents_add_keyhash_style", "SET-CONTENTS-ADD-KEYHASH-STYLE", 3, 0, false);
        declareFunction(me, "set_contents_delete_singleton_style", "SET-CONTENTS-DELETE-SINGLETON-STYLE", 3, 0, false);
        declareFunction(me, "set_contents_delete_list_style", "SET-CONTENTS-DELETE-LIST-STYLE", 3, 0, false);
        declareFunction(me, "set_contents_delete_keyhash_style", "SET-CONTENTS-DELETE-KEYHASH-STYLE", 3, 0, false);
        declareFunction(me, "set_contents_p", "SET-CONTENTS-P", 1, 0, false);
        declareFunction(me, "set_contents_of_type_p", "SET-CONTENTS-OF-TYPE-P", 2, 0, false);
        declareFunction(me, "new_set_contents", "NEW-SET-CONTENTS", 0, 2, false);
        declareFunction(me, "copy_set_contents", "COPY-SET-CONTENTS", 1, 0, false);
        declareFunction(me, "set_contents_size", "SET-CONTENTS-SIZE", 1, 0, false);
        new set_contents.$set_contents_size$UnaryFunction();
        declareFunction(me, "set_contents_emptyP", "SET-CONTENTS-EMPTY?", 1, 0, false);
        declareFunction(me, "set_contents_singletonP", "SET-CONTENTS-SINGLETON?", 1, 0, false);
        declareFunction(me, "set_contents_memberP", "SET-CONTENTS-MEMBER?", 2, 1, false);
        declareFunction(me, "set_contents_nmemberP", "SET-CONTENTS-NMEMBER?", 2, 1, false);
        declareFunction(me, "set_contents_matching_element", "SET-CONTENTS-MATCHING-ELEMENT", 2, 1, false);
        declareFunction(me, "set_contents_random_element", "SET-CONTENTS-RANDOM-ELEMENT", 1, 0, false);
        declareFunction(me, "singleton_set_contents_element", "SINGLETON-SET-CONTENTS-ELEMENT", 1, 0, false);
        declareFunction(me, "set_contents_add", "SET-CONTENTS-ADD", 2, 1, false);
        declareFunction(me, "set_contents_delete", "SET-CONTENTS-DELETE", 2, 1, false);
        declareFunction(me, "clear_set_contents", "CLEAR-SET-CONTENTS", 1, 0, false);
        declareFunction(me, "new_set_contents_iterator", "NEW-SET-CONTENTS-ITERATOR", 1, 0, false);
        declareMacro(me, "do_set_contents", "DO-SET-CONTENTS");
        declareFunction(me, "do_set_contents_basis_object", "DO-SET-CONTENTS-BASIS-OBJECT", 1, 0, false);
        declareFunction(me, "do_set_contents_initial_state", "DO-SET-CONTENTS-INITIAL-STATE", 2, 0, false);
        declareFunction(me, "do_set_contents_update_state", "DO-SET-CONTENTS-UPDATE-STATE", 1, 0, false);
        declareFunction(me, "do_set_contents_doneP", "DO-SET-CONTENTS-DONE?", 2, 0, false);
        declareFunction(me, "do_set_contents_next", "DO-SET-CONTENTS-NEXT", 2, 0, false);
        declareFunction(me, "do_set_contents_element_validP", "DO-SET-CONTENTS-ELEMENT-VALID?", 2, 0, false);
        declareFunction(me, "map_set_contents", "MAP-SET-CONTENTS", 2, 1, false);
        declareFunction(me, "cfasl_input_set_contents", "CFASL-INPUT-SET-CONTENTS", 4, 0, false);
        declareFunction(me, "cfasl_input_set_contents_singleton_style", "CFASL-INPUT-SET-CONTENTS-SINGLETON-STYLE", 4, 0, false);
        declareFunction(me, "cfasl_input_set_contents_list_style", "CFASL-INPUT-SET-CONTENTS-LIST-STYLE", 4, 0, false);
        declareFunction(me, "cfasl_input_set_contents_keyhash_style", "CFASL-INPUT-SET-CONTENTS-KEYHASH-STYLE", 4, 0, false);
        declareFunction(me, "cfasl_input_set_contents_logically", "CFASL-INPUT-SET-CONTENTS-LOGICALLY", 4, 0, false);
        declareFunction(me, "set_contents_element_list", "SET-CONTENTS-ELEMENT-LIST", 1, 0, false);
        declareFunction(me, "set_contents_rebuild", "SET-CONTENTS-REBUILD", 1, 0, false);
        declareFunction(me, "test_set_contents", "TEST-SET-CONTENTS", 0, 0, false);
        declareFunction(me, "do_set_contents_iteration_count", "DO-SET-CONTENTS-ITERATION-COUNT", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_set_contents_file() {
        deflexical("*SET-CONTENTS-GROW-TO-KEYHASH-SIZE*", $int$128);
        deflexical("*SET-CONTENTS-SHRINK-TO-LIST-SIZE*", $int$110);
        return NIL;
    }

    public static SubLObject setup_set_contents_file() {
        SubLSpecialOperatorDeclarations.proclaim($list2);
        SubLSpecialOperatorDeclarations.proclaim($list6);
        SubLSpecialOperatorDeclarations.proclaim($list8);
        register_macro_helper(DO_SET_CONTENTS_BASIS_OBJECT, DO_SET_CONTENTS);
        register_macro_helper(DO_SET_CONTENTS_INITIAL_STATE, DO_SET_CONTENTS);
        register_macro_helper(DO_SET_CONTENTS_UPDATE_STATE, DO_SET_CONTENTS);
        register_macro_helper($sym25$DO_SET_CONTENTS_DONE_, DO_SET_CONTENTS);
        register_macro_helper(DO_SET_CONTENTS_NEXT, DO_SET_CONTENTS);
        register_macro_helper($sym28$DO_SET_CONTENTS_ELEMENT_VALID_, DO_SET_CONTENTS);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_set_contents_file();
    }

    @Override
    public void initializeVariables() {
        init_set_contents_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_set_contents_file();
    }

    

    public static final class $set_contents_size$UnaryFunction extends UnaryFunction {
        public $set_contents_size$UnaryFunction() {
            super(extractFunctionNamed("SET-CONTENTS-SIZE"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return set_contents_size(arg1);
        }
    }
}

/**
 * Total time: 229 ms
 */
