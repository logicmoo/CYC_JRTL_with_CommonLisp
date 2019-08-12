/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.armedbear.lisp.Lisp;
import org.logicmoo.system.BeanShellCntrl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      SET-UTILITIES
 * source file: /cyc/top/cycl/set-utilities.lisp
 * created:     2019/07/03 17:37:14
 */
public final class set_utilities extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new set_utilities();

 public static final String myName = "com.cyc.cycjava.cycl.set_utilities";


    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_sliding_window$ = makeSymbol("*DTP-SLIDING-WINDOW*");

    public static final SubLSymbol $empty_set$ = makeSymbol("*EMPTY-SET*");

    private static final SubLSymbol SET_SIZE = makeSymbol("SET-SIZE");

    private static final SubLSymbol SET_CONTENTS_P = makeSymbol("SET-CONTENTS-P");

    private static final SubLSymbol SET_CONTENTS_SIZE = makeSymbol("SET-CONTENTS-SIZE");

    private static final SubLSymbol $sym8$_ = makeSymbol("<");

    private static final SubLSymbol SET_TEST = makeSymbol("SET-TEST");

    private static final SubLSymbol MAKE_SET_FROM_LIST = makeSymbol("MAKE-SET-FROM-LIST");

    private static final SubLList $list11 = list(makeSymbol("CONSTRUCT-SET-FROM-LIST"));

    private static final SubLString $str12$_A__ = makeString("~A~%");

    static private final SubLList $list13 = list(list(makeSymbol("ELEM"), makeSymbol("COUNTER"), makeSymbol("SET"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list14 = list($DONE);

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLList $list18 = list(ZERO_INTEGER);

    private static final SubLSymbol SLIDING_WINDOW = makeSymbol("SLIDING-WINDOW");

    private static final SubLSymbol SLIDING_WINDOW_P = makeSymbol("SLIDING-WINDOW-P");

    private static final SubLList $list23 = list(makeSymbol("WINDOW"), makeSymbol("SET-A"), makeSymbol("SET-B"), makeSymbol("WINDOW-A"), makeSymbol("WINDOW-B"));

    private static final SubLList $list24 = list(makeKeyword("WINDOW"), makeKeyword("SET-A"), makeKeyword("SET-B"), makeKeyword("WINDOW-A"), makeKeyword("WINDOW-B"));

    private static final SubLList $list25 = list(makeSymbol("SLDWND-WINDOW"), makeSymbol("SLDWND-SET-A"), makeSymbol("SLDWND-SET-B"), makeSymbol("SLDWND-WINDOW-A"), makeSymbol("SLDWND-WINDOW-B"));

    private static final SubLList $list26 = list(makeSymbol("_CSETF-SLDWND-WINDOW"), makeSymbol("_CSETF-SLDWND-SET-A"), makeSymbol("_CSETF-SLDWND-SET-B"), makeSymbol("_CSETF-SLDWND-WINDOW-A"), makeSymbol("_CSETF-SLDWND-WINDOW-B"));

    private static final SubLSymbol SLIDING_WINDOW_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("SLIDING-WINDOW-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list29 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("SLIDING-WINDOW-P"));

    private static final SubLSymbol SLDWND_WINDOW = makeSymbol("SLDWND-WINDOW");

    private static final SubLSymbol _CSETF_SLDWND_WINDOW = makeSymbol("_CSETF-SLDWND-WINDOW");

    private static final SubLSymbol SLDWND_SET_A = makeSymbol("SLDWND-SET-A");

    private static final SubLSymbol _CSETF_SLDWND_SET_A = makeSymbol("_CSETF-SLDWND-SET-A");

    private static final SubLSymbol SLDWND_SET_B = makeSymbol("SLDWND-SET-B");

    private static final SubLSymbol _CSETF_SLDWND_SET_B = makeSymbol("_CSETF-SLDWND-SET-B");

    private static final SubLSymbol SLDWND_WINDOW_A = makeSymbol("SLDWND-WINDOW-A");

    private static final SubLSymbol _CSETF_SLDWND_WINDOW_A = makeSymbol("_CSETF-SLDWND-WINDOW-A");

    private static final SubLSymbol SLDWND_WINDOW_B = makeSymbol("SLDWND-WINDOW-B");

    private static final SubLSymbol _CSETF_SLDWND_WINDOW_B = makeSymbol("_CSETF-SLDWND-WINDOW-B");

    private static final SubLString $str45$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_SLIDING_WINDOW = makeSymbol("MAKE-SLIDING-WINDOW");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_SLIDING_WINDOW_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-SLIDING-WINDOW-METHOD");

    private static final SubLSymbol TEST_SLIDING_WINDOWS = makeSymbol("TEST-SLIDING-WINDOWS");

    private static final SubLList $list58 = list(list(list(list(new SubLObject[]{ TEN_INTEGER, NINE_INTEGER, EIGHT_INTEGER, SEVEN_INTEGER, SIX_INTEGER, FIVE_INTEGER, FOUR_INTEGER, THREE_INTEGER, TWO_INTEGER, ONE_INTEGER }), list(EIGHT_INTEGER, SEVEN_INTEGER, SIX_INTEGER, FIVE_INTEGER, FOUR_INTEGER, THREE_INTEGER, TWO_INTEGER, ONE_INTEGER), FIVE_INTEGER, list(EIGHT_INTEGER, SEVEN_INTEGER, SIX_INTEGER)), makeKeyword("SUCCESS")), list(list(list(new SubLObject[]{ TWELVE_INTEGER, ELEVEN_INTEGER, TEN_INTEGER, EIGHT_INTEGER, SEVEN_INTEGER, FIVE_INTEGER, FOUR_INTEGER, THREE_INTEGER, TWO_INTEGER, ONE_INTEGER }), list(new SubLObject[]{ TEN_INTEGER, NINE_INTEGER, EIGHT_INTEGER, SEVEN_INTEGER, SIX_INTEGER, FIVE_INTEGER, FOUR_INTEGER, THREE_INTEGER, TWO_INTEGER, ONE_INTEGER }), FOUR_INTEGER, list(EIGHT_INTEGER, SEVEN_INTEGER, FIVE_INTEGER)), makeKeyword("SUCCESS")));

    private static final SubLString $str60$Set__A_is_not_co_extensional_with = makeString("Set ~A is not co-extensional with expected set ~A.");

    // Definitions
    /**
     * Returns an arbitrary element of SET.
     */
    @LispMethod(comment = "Returns an arbitrary element of SET.")
    public static final SubLObject set_arbitrary_element_alt(SubLObject v_set) {
        {
            SubLObject result = NIL;
            SubLObject foundP = NIL;
            SubLObject set_contents_var = set.do_set_internal(v_set);
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); !((NIL != foundP) || (NIL != set_contents.do_set_contents_doneP(basis_object, state))); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject element = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, element)) {
                        result = element;
                        foundP = T;
                    }
                }
            }
            return values(result, foundP);
        }
    }

    // Definitions
    /**
     * Returns an arbitrary element of SET.
     */
    @LispMethod(comment = "Returns an arbitrary element of SET.")
    public static SubLObject set_arbitrary_element(final SubLObject v_set) {
        SubLObject result = NIL;
        SubLObject foundP = NIL;
        final SubLObject set_contents_var = set.do_set_internal(v_set);
        SubLObject basis_object;
        SubLObject state;
        SubLObject element;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == foundP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
            element = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, element)) {
                result = element;
                foundP = T;
            }
        }
        return values(result, foundP);
    }

    /**
     * Returns an arbitrary element of SET.
     * Returns DEFAULT if SET is empty.
     */
    @LispMethod(comment = "Returns an arbitrary element of SET.\r\nReturns DEFAULT if SET is empty.\nReturns an arbitrary element of SET.\nReturns DEFAULT if SET is empty.")
    public static final SubLObject set_arbitrary_element_without_values_alt(SubLObject v_set, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        {
            SubLObject set_contents_var = set.do_set_internal(v_set);
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject element = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, element)) {
                        return element;
                    }
                }
            }
        }
        return v_default;
    }

    /**
     * Returns an arbitrary element of SET.
     * Returns DEFAULT if SET is empty.
     */
    @LispMethod(comment = "Returns an arbitrary element of SET.\r\nReturns DEFAULT if SET is empty.\nReturns an arbitrary element of SET.\nReturns DEFAULT if SET is empty.")
    public static SubLObject set_arbitrary_element_without_values(final SubLObject v_set, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        final SubLObject set_contents_var = set.do_set_internal(v_set);
        SubLObject basis_object;
        SubLObject state;
        SubLObject element;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            element = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, element)) {
                return element;
            }
        }
        return v_default;
    }

    /**
     * Returns an arbitrary element of SET-CONTENTS.
     */
    @LispMethod(comment = "Returns an arbitrary element of SET-CONTENTS.")
    public static final SubLObject set_contents_arbitrary_element_alt(SubLObject v_set_contents) {
        {
            SubLObject result = NIL;
            SubLObject foundP = NIL;
            SubLObject set_contents_var = v_set_contents;
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); !((NIL != foundP) || (NIL != set_contents.do_set_contents_doneP(basis_object, state))); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject element = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, element)) {
                        result = element;
                        foundP = T;
                    }
                }
            }
            return values(result, foundP);
        }
    }

    /**
     * Returns an arbitrary element of SET-CONTENTS.
     */
    @LispMethod(comment = "Returns an arbitrary element of SET-CONTENTS.")
    public static SubLObject set_contents_arbitrary_element(final SubLObject v_set_contents) {
        SubLObject result = NIL;
        SubLObject foundP;
        SubLObject basis_object;
        SubLObject state;
        SubLObject element;
        for (foundP = NIL, basis_object = set_contents.do_set_contents_basis_object(v_set_contents), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, v_set_contents); (NIL == foundP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
            element = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, element)) {
                result = element;
                foundP = T;
            }
        }
        return values(result, foundP);
    }

    /**
     * Returns an arbitrary element of SET-CONTENTS.
     * Returns DEFAULT if SET is empty.
     */
    @LispMethod(comment = "Returns an arbitrary element of SET-CONTENTS.\r\nReturns DEFAULT if SET is empty.\nReturns an arbitrary element of SET-CONTENTS.\nReturns DEFAULT if SET is empty.")
    public static final SubLObject set_contents_arbitrary_element_without_values_alt(SubLObject v_set_contents, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        {
            SubLObject set_contents_var = v_set_contents;
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject element = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, element)) {
                        return element;
                    }
                }
            }
        }
        return v_default;
    }

    /**
     * Returns an arbitrary element of SET-CONTENTS.
     * Returns DEFAULT if SET is empty.
     */
    @LispMethod(comment = "Returns an arbitrary element of SET-CONTENTS.\r\nReturns DEFAULT if SET is empty.\nReturns an arbitrary element of SET-CONTENTS.\nReturns DEFAULT if SET is empty.")
    public static SubLObject set_contents_arbitrary_element_without_values(final SubLObject v_set_contents, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        SubLObject basis_object;
        SubLObject state;
        SubLObject element;
        for (basis_object = set_contents.do_set_contents_basis_object(v_set_contents), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, v_set_contents); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            element = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, element)) {
                return element;
            }
        }
        return v_default;
    }

    /**
     * Remove and return a randomly chosen element of SET, if any.
     *
     * @unknown bgottesm
     */
    @LispMethod(comment = "Remove and return a randomly chosen element of SET, if any.\r\n\r\n@unknown bgottesm")
    public static final SubLObject set_remove_random_element_alt(SubLObject v_set) {
        SubLTrampolineFile.checkType(v_set, SET_P);
        {
            SubLObject element = set.set_random_element(v_set);
            set.set_remove(element, v_set);
            return element;
        }
    }

    /**
     * Remove and return a randomly chosen element of SET, if any.
     *
     * @unknown bgottesm
     */
    @LispMethod(comment = "Remove and return a randomly chosen element of SET, if any.\r\n\r\n@unknown bgottesm")
    public static SubLObject set_remove_random_element(final SubLObject v_set) {
        assert NIL != set.set_p(v_set) : "! set.set_p(v_set) " + ("set.set_p(v_set) " + "CommonSymbols.NIL != set.set_p(v_set) ") + v_set;
        final SubLObject element = set.set_random_element(v_set);
        set.set_remove(element, v_set);
        return element;
    }

    /**
     *
     *
     * @param SETS;
     * 		listp of SET-P objects.
     * @param TEST;
     * 		the equality test function to use for the output set.
     * @return set-p or NIL; the union of SETS.
     * @unknown baxter
     */
    @LispMethod(comment = "@param SETS;\r\n\t\tlistp of SET-P objects.\r\n@param TEST;\r\n\t\tthe equality test function to use for the output set.\r\n@return set-p or NIL; the union of SETS.\r\n@unknown baxter")
    public static final SubLObject set_union_alt(SubLObject sets, SubLObject test) {
        if (test == UNPROVIDED) {
            test = NIL;
        }
        SubLTrampolineFile.checkType(sets, LISTP);
        if (NIL == test) {
            test = com.cyc.cycjava.cycl.set_utilities.default_test_function_for_sets(sets);
        }
        SubLTrampolineFile.checkType(test, VALID_HASH_TEST_P);
        if (NIL != list_utilities.find_if_not(SET_P, sets, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return NIL;
        } else {
            if (NIL == sets) {
                return set.new_set(test, UNPROVIDED);
            } else {
                {
                    SubLObject size = number_utilities.maximum(Mapping.mapcar(SET_SIZE, sets), UNPROVIDED);
                    SubLObject result = set.new_set(test, size);
                    SubLObject cdolist_list_var = sets;
                    SubLObject v_set = NIL;
                    for (v_set = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_set = cdolist_list_var.first()) {
                        {
                            SubLObject set_contents_var = set.do_set_internal(v_set);
                            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                            SubLObject state = NIL;
                            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                {
                                    SubLObject elem = set_contents.do_set_contents_next(basis_object, state);
                                    if (NIL != set_contents.do_set_contents_element_validP(state, elem)) {
                                        set.set_add(elem, result);
                                    }
                                }
                            }
                        }
                    }
                    return result;
                }
            }
        }
    }

    /**
     *
     *
     * @param SETS;
     * 		listp of SET-P objects.
     * @param TEST;
     * 		the equality test function to use for the output set.
     * @return set-p or NIL; the union of SETS.
     * @unknown baxter
     */
    @LispMethod(comment = "@param SETS;\r\n\t\tlistp of SET-P objects.\r\n@param TEST;\r\n\t\tthe equality test function to use for the output set.\r\n@return set-p or NIL; the union of SETS.\r\n@unknown baxter")
    public static SubLObject set_union(final SubLObject sets, SubLObject test) {
        if (test == UNPROVIDED) {
            test = NIL;
        }
        assert NIL != listp(sets) : "! listp(sets) " + ("Types.listp(sets) " + "CommonSymbols.NIL != Types.listp(sets) ") + sets;
        if (NIL == test) {
            test = set_utilities.default_test_function_for_sets(sets);
        }
        assert NIL != hash_table_utilities.valid_hash_test_p(test) : "! hash_table_utilities.valid_hash_test_p(test) " + ("hash_table_utilities.valid_hash_test_p(test) " + "CommonSymbols.NIL != hash_table_utilities.valid_hash_test_p(test) ") + test;
        if (NIL != list_utilities.find_if_not(SET_P, sets, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return NIL;
        }
        if (NIL == sets) {
            return set.new_set(test, UNPROVIDED);
        }
        final SubLObject size = number_utilities.maximum(Mapping.mapcar(set_utilities.SET_SIZE, sets), UNPROVIDED);
        final SubLObject result = set.new_set(test, size);
        SubLObject cdolist_list_var = sets;
        SubLObject v_set = NIL;
        v_set = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject set_contents_var = set.do_set_internal(v_set);
            SubLObject basis_object;
            SubLObject state;
            SubLObject elem;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                elem = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, elem)) {
                    set.set_add(elem, result);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_set = cdolist_list_var.first();
        } 
        return result;
    }

    public static final SubLObject set_contents_union_alt(SubLObject set_contents_list, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        {
            SubLObject list_var = set_contents_list;
            SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
            {
                SubLObject cdolist_list_var = list_var;
                SubLObject elem = NIL;
                for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                    SubLTrampolineFile.checkType(elem, SET_CONTENTS_P);
                }
            }
        }
        if (NIL == set_contents_list) {
            return set_contents.new_set_contents(ZERO_INTEGER, test);
        } else {
            if (NIL != list_utilities.singletonP(set_contents_list)) {
                return set_contents.copy_set_contents(set_contents_list.first());
            } else {
                {
                    SubLObject size = number_utilities.maximum(Mapping.mapcar(SET_CONTENTS_SIZE, set_contents_list), UNPROVIDED);
                    SubLObject union = set_contents.new_set_contents(size, test);
                    SubLObject cdolist_list_var = set_contents_list;
                    SubLObject v_set_contents = NIL;
                    for (v_set_contents = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_set_contents = cdolist_list_var.first()) {
                        {
                            SubLObject set_contents_var = v_set_contents;
                            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                            SubLObject state = NIL;
                            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                {
                                    SubLObject element = set_contents.do_set_contents_next(basis_object, state);
                                    if (NIL != set_contents.do_set_contents_element_validP(state, element)) {
                                        union = set_contents.set_contents_add(element, union, UNPROVIDED);
                                    }
                                }
                            }
                        }
                    }
                    return union;
                }
            }
        }
    }

    public static SubLObject set_contents_union(final SubLObject set_contents_list, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        assert NIL != list_utilities.non_dotted_list_p(set_contents_list) : "! list_utilities.non_dotted_list_p(set_contents_list) " + ("list_utilities.non_dotted_list_p(set_contents_list) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(set_contents_list) ") + set_contents_list;
        SubLObject cdolist_list_var = set_contents_list;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != set_contents.set_contents_p(elem) : "! set_contents.set_contents_p(elem) " + ("set_contents.set_contents_p(elem) " + "CommonSymbols.NIL != set_contents.set_contents_p(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        if (NIL == set_contents_list) {
            return set_contents.new_set_contents(ZERO_INTEGER, test);
        }
        if (NIL != list_utilities.singletonP(set_contents_list)) {
            return set_contents.copy_set_contents(set_contents_list.first());
        }
        final SubLObject size = number_utilities.maximum(Mapping.mapcar(set_utilities.SET_CONTENTS_SIZE, set_contents_list), UNPROVIDED);
        SubLObject union = set_contents.new_set_contents(size, test);
        SubLObject cdolist_list_var2 = set_contents_list;
        SubLObject v_set_contents = NIL;
        v_set_contents = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            final SubLObject set_contents_var = v_set_contents;
            SubLObject basis_object;
            SubLObject state;
            SubLObject element;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                element = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, element)) {
                    union = set_contents.set_contents_add(element, union, UNPROVIDED);
                }
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            v_set_contents = cdolist_list_var2.first();
        } 
        return union;
    }

    /**
     *
     *
     * @param SETS;
     * 		listp of SET-P objects.
     * @param TEST;
     * 		the equality test function to use for the output set.
     * @return set-p or NIL; the intersection of SETS.
     * @unknown baxter
     */
    @LispMethod(comment = "@param SETS;\r\n\t\tlistp of SET-P objects.\r\n@param TEST;\r\n\t\tthe equality test function to use for the output set.\r\n@return set-p or NIL; the intersection of SETS.\r\n@unknown baxter")
    public static final SubLObject set_intersection_alt(SubLObject sets, SubLObject test) {
        if (test == UNPROVIDED) {
            test = NIL;
        }
        SubLTrampolineFile.checkType(sets, LISTP);
        if (NIL == test) {
            test = com.cyc.cycjava.cycl.set_utilities.default_test_function_for_sets(sets);
        }
        SubLTrampolineFile.checkType(test, VALID_HASH_TEST_P);
        if (NIL != list_utilities.find_if_not(SET_P, sets, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return NIL;
        } else {
            if (NIL == sets) {
                return set.new_set(test, UNPROVIDED);
            } else {
                {
                    SubLObject smallest_set = list_utilities.extremal(sets, symbol_function($sym7$_), SET_SIZE);
                    SubLObject size = set.set_size(smallest_set);
                    SubLObject result = set.new_set(test, size);
                    SubLObject set_contents_var = set.do_set_internal(smallest_set);
                    SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                    SubLObject state = NIL;
                    for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                        {
                            SubLObject elem = set_contents.do_set_contents_next(basis_object, state);
                            if (NIL != set_contents.do_set_contents_element_validP(state, elem)) {
                                {
                                    SubLObject not_in_intersectionP = NIL;
                                    if (NIL == not_in_intersectionP) {
                                        {
                                            SubLObject csome_list_var = sets;
                                            SubLObject v_set = NIL;
                                            for (v_set = csome_list_var.first(); !((NIL != not_in_intersectionP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , v_set = csome_list_var.first()) {
                                                if (v_set != smallest_set) {
                                                    if (NIL == set.set_memberP(elem, v_set)) {
                                                        not_in_intersectionP = T;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    if (NIL == not_in_intersectionP) {
                                        set.set_add(elem, result);
                                    }
                                }
                            }
                        }
                    }
                    return result;
                }
            }
        }
    }

    /**
     *
     *
     * @param SETS;
     * 		listp of SET-P objects.
     * @param TEST;
     * 		the equality test function to use for the output set.
     * @return set-p or NIL; the intersection of SETS.
     * @unknown baxter
     */
    @LispMethod(comment = "@param SETS;\r\n\t\tlistp of SET-P objects.\r\n@param TEST;\r\n\t\tthe equality test function to use for the output set.\r\n@return set-p or NIL; the intersection of SETS.\r\n@unknown baxter")
    public static SubLObject set_intersection(final SubLObject sets, SubLObject test) {
        if (test == UNPROVIDED) {
            test = NIL;
        }
        assert NIL != listp(sets) : "! listp(sets) " + ("Types.listp(sets) " + "CommonSymbols.NIL != Types.listp(sets) ") + sets;
        if (NIL == test) {
            test = set_utilities.default_test_function_for_sets(sets);
        }
        assert NIL != hash_table_utilities.valid_hash_test_p(test) : "! hash_table_utilities.valid_hash_test_p(test) " + ("hash_table_utilities.valid_hash_test_p(test) " + "CommonSymbols.NIL != hash_table_utilities.valid_hash_test_p(test) ") + test;
        if (NIL != list_utilities.find_if_not(SET_P, sets, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return NIL;
        }
        if (NIL == sets) {
            return set.new_set(test, UNPROVIDED);
        }
        final SubLObject smallest_set = list_utilities.extremal(sets, symbol_function(set_utilities.$sym8$_), set_utilities.SET_SIZE);
        final SubLObject size = set.set_size(smallest_set);
        final SubLObject result = set.new_set(test, size);
        final SubLObject set_contents_var = set.do_set_internal(smallest_set);
        SubLObject basis_object;
        SubLObject state;
        SubLObject elem;
        SubLObject not_in_intersectionP;
        SubLObject csome_list_var;
        SubLObject v_set;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            elem = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, elem)) {
                not_in_intersectionP = NIL;
                if (NIL == not_in_intersectionP) {
                    csome_list_var = sets;
                    v_set = NIL;
                    v_set = csome_list_var.first();
                    while ((NIL == not_in_intersectionP) && (NIL != csome_list_var)) {
                        if ((!v_set.eql(smallest_set)) && (NIL == set.set_memberP(elem, v_set))) {
                            not_in_intersectionP = T;
                        }
                        csome_list_var = csome_list_var.rest();
                        v_set = csome_list_var.first();
                    } 
                }
                if (NIL == not_in_intersectionP) {
                    set.set_add(elem, result);
                }
            }
        }
        return result;
    }

    public static final SubLObject set_contents_intersection_alt(SubLObject set_contents_list, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        {
            SubLObject list_var = set_contents_list;
            SubLTrampolineFile.checkType(list_var, NON_DOTTED_LIST_P);
            {
                SubLObject cdolist_list_var = list_var;
                SubLObject elem = NIL;
                for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                    SubLTrampolineFile.checkType(elem, SET_CONTENTS_P);
                }
            }
        }
        if (NIL == set_contents_list) {
            return set_contents.new_set_contents(ZERO_INTEGER, test);
        } else {
            if (NIL != list_utilities.singletonP(set_contents_list)) {
                return set_contents.copy_set_contents(set_contents_list.first());
            } else {
                {
                    SubLObject intersection = set_contents.new_set_contents(ZERO_INTEGER, test);
                    if (NIL != set_contents_list) {
                        {
                            SubLObject smallest = list_utilities.extremal(set_contents_list, symbol_function($sym7$_), SET_CONTENTS_SIZE);
                            SubLObject set_contents_var = smallest;
                            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                            SubLObject state = NIL;
                            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                {
                                    SubLObject element = set_contents.do_set_contents_next(basis_object, state);
                                    if (NIL != set_contents.do_set_contents_element_validP(state, element)) {
                                        {
                                            SubLObject not_in_intersectionP = NIL;
                                            if (NIL == not_in_intersectionP) {
                                                {
                                                    SubLObject csome_list_var = set_contents_list;
                                                    SubLObject v_set_contents = NIL;
                                                    for (v_set_contents = csome_list_var.first(); !((NIL != not_in_intersectionP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , v_set_contents = csome_list_var.first()) {
                                                        if (!((v_set_contents == smallest) || (NIL != set_contents.set_contents_memberP(element, v_set_contents, test)))) {
                                                            not_in_intersectionP = T;
                                                        }
                                                    }
                                                }
                                            }
                                            if (NIL == not_in_intersectionP) {
                                                intersection = set_contents.set_contents_add(element, intersection, test);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                    return intersection;
                }
            }
        }
    }

    public static SubLObject set_contents_intersection(final SubLObject set_contents_list, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        assert NIL != list_utilities.non_dotted_list_p(set_contents_list) : "! list_utilities.non_dotted_list_p(set_contents_list) " + ("list_utilities.non_dotted_list_p(set_contents_list) " + "CommonSymbols.NIL != list_utilities.non_dotted_list_p(set_contents_list) ") + set_contents_list;
        SubLObject cdolist_list_var = set_contents_list;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            assert NIL != set_contents.set_contents_p(elem) : "! set_contents.set_contents_p(elem) " + ("set_contents.set_contents_p(elem) " + "CommonSymbols.NIL != set_contents.set_contents_p(elem) ") + elem;
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        if (NIL == set_contents_list) {
            return set_contents.new_set_contents(ZERO_INTEGER, test);
        }
        if (NIL != list_utilities.singletonP(set_contents_list)) {
            return set_contents.copy_set_contents(set_contents_list.first());
        }
        SubLObject intersection = set_contents.new_set_contents(ZERO_INTEGER, test);
        if (NIL != set_contents_list) {
            final SubLObject set_contents_var;
            final SubLObject smallest = set_contents_var = list_utilities.extremal(set_contents_list, symbol_function(set_utilities.$sym8$_), set_utilities.SET_CONTENTS_SIZE);
            SubLObject basis_object;
            SubLObject state;
            SubLObject element;
            SubLObject not_in_intersectionP;
            SubLObject csome_list_var;
            SubLObject v_set_contents;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                element = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, element)) {
                    not_in_intersectionP = NIL;
                    if (NIL == not_in_intersectionP) {
                        csome_list_var = set_contents_list;
                        v_set_contents = NIL;
                        v_set_contents = csome_list_var.first();
                        while ((NIL == not_in_intersectionP) && (NIL != csome_list_var)) {
                            if ((!v_set_contents.eql(smallest)) && (NIL == set_contents.set_contents_memberP(element, v_set_contents, test))) {
                                not_in_intersectionP = T;
                            }
                            csome_list_var = csome_list_var.rest();
                            v_set_contents = csome_list_var.first();
                        } 
                    }
                    if (NIL == not_in_intersectionP) {
                        intersection = set_contents.set_contents_add(element, intersection, test);
                    }
                }
            }
        }
        return intersection;
    }

    /**
     *
     *
     * @return booleanp; whether SETS share any common element.
     */
    @LispMethod(comment = "@return booleanp; whether SETS share any common element.")
    public static final SubLObject sets_intersectP_alt(SubLObject sets) {
        SubLTrampolineFile.checkType(sets, LISTP);
        if (NIL == sets) {
            return NIL;
        } else {
            {
                SubLObject smallest_set = list_utilities.extremal(sets, symbol_function($sym7$_), SET_SIZE);
                SubLObject set_contents_var = set.do_set_internal(smallest_set);
                SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                SubLObject state = NIL;
                for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    {
                        SubLObject elem = set_contents.do_set_contents_next(basis_object, state);
                        if (NIL != set_contents.do_set_contents_element_validP(state, elem)) {
                            {
                                SubLObject cdolist_list_var = sets;
                                SubLObject v_set = NIL;
                                for (v_set = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_set = cdolist_list_var.first()) {
                                    if (v_set != smallest_set) {
                                        if (NIL != set.set_memberP(elem, v_set)) {
                                            return T;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                return NIL;
            }
        }
    }

    /**
     *
     *
     * @return booleanp; whether SETS share any common element.
     */
    @LispMethod(comment = "@return booleanp; whether SETS share any common element.")
    public static SubLObject sets_intersectP(final SubLObject sets) {
        assert NIL != listp(sets) : "! listp(sets) " + ("Types.listp(sets) " + "CommonSymbols.NIL != Types.listp(sets) ") + sets;
        if (NIL == sets) {
            return NIL;
        }
        final SubLObject smallest_set = list_utilities.extremal(sets, symbol_function(set_utilities.$sym8$_), set_utilities.SET_SIZE);
        final SubLObject set_contents_var = set.do_set_internal(smallest_set);
        SubLObject basis_object;
        SubLObject state;
        SubLObject elem;
        SubLObject cdolist_list_var;
        SubLObject v_set;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            elem = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, elem)) {
                cdolist_list_var = sets;
                v_set = NIL;
                v_set = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if ((!v_set.eql(smallest_set)) && (NIL != set.set_memberP(elem, v_set))) {
                        return T;
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    v_set = cdolist_list_var.first();
                } 
            }
        }
        return NIL;
    }

    /**
     * Return the fraction of the smaller set in the larger set.
     */
    @LispMethod(comment = "Return the fraction of the smaller set in the larger set.")
    public static final SubLObject set_intersection_fraction_alt(SubLObject set1, SubLObject set2) {
        {
            SubLObject smaller_set = (set.set_size(set1).numLE(set.set_size(set2))) ? ((SubLObject) (set1)) : set2;
            SubLObject larger_set = (set.set_size(set1).numLE(set.set_size(set2))) ? ((SubLObject) (set2)) : set1;
            SubLObject total = set.set_size(smaller_set);
            SubLObject common = ZERO_INTEGER;
            if (total.numE(ZERO_INTEGER)) {
                return ZERO_INTEGER;
            }
            {
                SubLObject set_contents_var = set.do_set_internal(smaller_set);
                SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                SubLObject state = NIL;
                for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    {
                        SubLObject element = set_contents.do_set_contents_next(basis_object, state);
                        if (NIL != set_contents.do_set_contents_element_validP(state, element)) {
                            if (NIL != set.set_memberP(element, larger_set)) {
                                common = add(common, ONE_INTEGER);
                            }
                        }
                    }
                }
            }
            return divide(common, total);
        }
    }

    /**
     * Return the fraction of the smaller set in the larger set.
     */
    @LispMethod(comment = "Return the fraction of the smaller set in the larger set.")
    public static SubLObject set_intersection_fraction(final SubLObject set1, final SubLObject set2) {
        final SubLObject smaller_set = (set.set_size(set1).numLE(set.set_size(set2))) ? set1 : set2;
        final SubLObject larger_set = (set.set_size(set1).numLE(set.set_size(set2))) ? set2 : set1;
        final SubLObject total = set.set_size(smaller_set);
        SubLObject common = ZERO_INTEGER;
        if (total.numE(ZERO_INTEGER)) {
            return ZERO_INTEGER;
        }
        final SubLObject set_contents_var = set.do_set_internal(smaller_set);
        SubLObject basis_object;
        SubLObject state;
        SubLObject element;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            element = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, element)) && (NIL != set.set_memberP(element, larger_set))) {
                common = add(common, ONE_INTEGER);
            }
        }
        return divide(common, total);
    }

    public static SubLObject sets_intersect_by(final SubLObject set1, final SubLObject set2, final SubLObject amount) {
        if (set.set_size(set1).numL(amount)) {
            return NIL;
        }
        if (set.set_size(set2).numL(amount)) {
            return NIL;
        }
        final SubLObject smaller_set = (set.set_size(set1).numLE(set.set_size(set2))) ? set1 : set2;
        final SubLObject larger_set = (set.set_size(set1).numLE(set.set_size(set2))) ? set2 : set1;
        SubLObject match_count = amount;
        final SubLObject set_contents_var = set.do_set_internal(smaller_set);
        SubLObject basis_object;
        SubLObject state;
        SubLObject element;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            element = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, element)) && (NIL != set.set_memberP(element, larger_set))) {
                match_count = subtract(match_count, ONE_INTEGER);
                if (match_count.isZero()) {
                    return T;
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @param SET1;
    set-p.
     * 		
     * @param SET2;
    set-p.
     * 		
     * @param TEST;
     * 		the equality test function to use for the output set.
     * @return set-p or NIL; SET1 - SET2.
     * @unknown kknight
     */
    @LispMethod(comment = "@param SET1;\nset-p.\r\n\t\t\r\n@param SET2;\nset-p.\r\n\t\t\r\n@param TEST;\r\n\t\tthe equality test function to use for the output set.\r\n@return set-p or NIL; SET1 - SET2.\r\n@unknown kknight")
    public static final SubLObject set_minus_alt(SubLObject set1, SubLObject set2, SubLObject test) {
        if (test == UNPROVIDED) {
            test = NIL;
        }
        SubLTrampolineFile.checkType(set1, SET_P);
        SubLTrampolineFile.checkType(set2, SET_P);
        if (NIL == test) {
            test = com.cyc.cycjava.cycl.set_utilities.default_test_function_for_sets(list(set1, set2));
        }
        SubLTrampolineFile.checkType(test, VALID_HASH_TEST_P);
        {
            SubLObject v_set = set.new_set(test, UNPROVIDED);
            SubLObject set_contents_var = set.do_set_internal(set1);
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject element = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, element)) {
                        if (NIL == set.set_memberP(element, set2)) {
                            set.set_add(element, v_set);
                        }
                    }
                }
            }
            return v_set;
        }
    }

    /**
     *
     *
     * @param SET1;
    set-p.
     * 		
     * @param SET2;
    set-p.
     * 		
     * @param TEST;
     * 		the equality test function to use for the output set.
     * @return set-p or NIL; SET1 - SET2.
     * @unknown kknight
     */
    @LispMethod(comment = "@param SET1;\nset-p.\r\n\t\t\r\n@param SET2;\nset-p.\r\n\t\t\r\n@param TEST;\r\n\t\tthe equality test function to use for the output set.\r\n@return set-p or NIL; SET1 - SET2.\r\n@unknown kknight")
    public static SubLObject set_minus(final SubLObject set1, final SubLObject set2, SubLObject test) {
        if (test == UNPROVIDED) {
            test = NIL;
        }
        assert NIL != set.set_p(set1) : "! set.set_p(set1) " + ("set.set_p(set1) " + "CommonSymbols.NIL != set.set_p(set1) ") + set1;
        assert NIL != set.set_p(set2) : "! set.set_p(set2) " + ("set.set_p(set2) " + "CommonSymbols.NIL != set.set_p(set2) ") + set2;
        if (NIL == test) {
            test = set_utilities.default_test_function_for_sets(list(set1, set2));
        }
        assert NIL != hash_table_utilities.valid_hash_test_p(test) : "! hash_table_utilities.valid_hash_test_p(test) " + ("hash_table_utilities.valid_hash_test_p(test) " + "CommonSymbols.NIL != hash_table_utilities.valid_hash_test_p(test) ") + test;
        final SubLObject v_set = set.new_set(test, UNPROVIDED);
        final SubLObject set_contents_var = set.do_set_internal(set1);
        SubLObject basis_object;
        SubLObject state;
        SubLObject element;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            element = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, element)) && (NIL == set.set_memberP(element, set2))) {
                set.set_add(element, v_set);
            }
        }
        return v_set;
    }

    /**
     * Destructively prune all elements in GONERS from KEEPERS
     *
     * @param KEEPERS,
    set-p
     * 		
     * @param GONERS,
    set-p
     * 		
     * @return modified KEEPERS, set-p
     */
    @LispMethod(comment = "Destructively prune all elements in GONERS from KEEPERS\r\n\r\n@param KEEPERS,\nset-p\r\n\t\t\r\n@param GONERS,\nset-p\r\n\t\t\r\n@return modified KEEPERS, set-p")
    public static final SubLObject set_nprune_alt(SubLObject keepers, SubLObject goners) {
        {
            SubLObject set_contents_var = set.do_set_internal(goners);
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject goner = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, goner)) {
                        set.set_remove(goner, keepers);
                    }
                }
            }
        }
        return keepers;
    }

    /**
     * Destructively prune all elements in GONERS from KEEPERS
     *
     * @param KEEPERS,
    		set-p
     * 		
     * @param GONERS,
    		set-p
     * 		
     * @return modified KEEPERS, set-p
     */
    @LispMethod(comment = "Destructively prune all elements in GONERS from KEEPERS\r\n\r\n@param KEEPERS,\n\t\tset-p\r\n\t\t\r\n@param GONERS,\n\t\tset-p\r\n\t\t\r\n@return modified KEEPERS, set-p")
    public static SubLObject set_nprune(final SubLObject keepers, final SubLObject goners) {
        final SubLObject set_contents_var = set.do_set_internal(goners);
        SubLObject basis_object;
        SubLObject state;
        SubLObject goner;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            goner = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, goner)) {
                set.set_remove(goner, keepers);
            }
        }
        return keepers;
    }

    /**
     * Return all new set with all elements in KEEPERS not in GONERS
     *
     * @param KEEPERS,
    set-p
     * 		
     * @param GONERS,
    set-p
     * 		
     * @return set-p
     */
    @LispMethod(comment = "Return all new set with all elements in KEEPERS not in GONERS\r\n\r\n@param KEEPERS,\nset-p\r\n\t\t\r\n@param GONERS,\nset-p\r\n\t\t\r\n@return set-p")
    public static final SubLObject set_prune_alt(SubLObject keepers, SubLObject goners) {
        return com.cyc.cycjava.cycl.set_utilities.set_nprune(set.copy_set(keepers), goners);
    }

    /**
     * Return all new set with all elements in KEEPERS not in GONERS
     *
     * @param KEEPERS,
    		set-p
     * 		
     * @param GONERS,
    		set-p
     * 		
     * @return set-p
     */
    @LispMethod(comment = "Return all new set with all elements in KEEPERS not in GONERS\r\n\r\n@param KEEPERS,\n\t\tset-p\r\n\t\t\r\n@param GONERS,\n\t\tset-p\r\n\t\t\r\n@return set-p")
    public static SubLObject set_prune(final SubLObject keepers, final SubLObject goners) {
        return set_utilities.set_nprune(set.copy_set(keepers), goners);
    }

    /**
     *
     *
     * @return BOOLEANP; Is every member of SET1 also a member of SET2, and vice versa?
     * @unknown baxter
     */
    @LispMethod(comment = "@return BOOLEANP; Is every member of SET1 also a member of SET2, and vice versa?\r\n@unknown baxter")
    public static final SubLObject sets_coextensionalP_alt(SubLObject set1, SubLObject set2) {
        SubLTrampolineFile.checkType(set1, SET_P);
        SubLTrampolineFile.checkType(set2, SET_P);
        if (set1 == set2) {
            return T;
        }
        if (!set.set_size(set1).eql(set.set_size(set2))) {
            return NIL;
        }
        {
            SubLObject failP = NIL;
            {
                SubLObject set_contents_var = set.do_set_internal(set1);
                SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                SubLObject state = NIL;
                for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); !((NIL != failP) || (NIL != set_contents.do_set_contents_doneP(basis_object, state))); state = set_contents.do_set_contents_update_state(state)) {
                    {
                        SubLObject element_of_set1 = set_contents.do_set_contents_next(basis_object, state);
                        if (NIL != set_contents.do_set_contents_element_validP(state, element_of_set1)) {
                            if (NIL == set.set_memberP(element_of_set1, set2)) {
                                failP = T;
                            }
                        }
                    }
                }
            }
            if (!((NIL != failP) || set.set_test(set1).eql(set.set_test(set2)))) {
                {
                    SubLObject set_contents_var = set.do_set_internal(set2);
                    SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                    SubLObject state = NIL;
                    for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); !((NIL != failP) || (NIL != set_contents.do_set_contents_doneP(basis_object, state))); state = set_contents.do_set_contents_update_state(state)) {
                        {
                            SubLObject element_of_set2 = set_contents.do_set_contents_next(basis_object, state);
                            if (NIL != set_contents.do_set_contents_element_validP(state, element_of_set2)) {
                                if (NIL == set.set_memberP(element_of_set2, set1)) {
                                    failP = T;
                                }
                            }
                        }
                    }
                }
            }
            return makeBoolean(NIL == failP);
        }
    }

    /**
     *
     *
     * @return BOOLEANP; Is every member of SET1 also a member of SET2, and vice versa?
     * @unknown baxter
     */
    @LispMethod(comment = "@return BOOLEANP; Is every member of SET1 also a member of SET2, and vice versa?\r\n@unknown baxter")
    public static SubLObject sets_coextensionalP(final SubLObject set1, final SubLObject set2) {
        assert NIL != set.set_p(set1) : "! set.set_p(set1) " + ("set.set_p(set1) " + "CommonSymbols.NIL != set.set_p(set1) ") + set1;
        assert NIL != set.set_p(set2) : "! set.set_p(set2) " + ("set.set_p(set2) " + "CommonSymbols.NIL != set.set_p(set2) ") + set2;
        if (set1.eql(set2)) {
            return T;
        }
        if (!set.set_size(set1).eql(set.set_size(set2))) {
            return NIL;
        }
        SubLObject failP = NIL;
        SubLObject set_contents_var = set.do_set_internal(set1);
        SubLObject basis_object;
        SubLObject state;
        SubLObject element_of_set1;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == failP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
            element_of_set1 = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, element_of_set1)) && (NIL == set.set_memberP(element_of_set1, set2))) {
                failP = T;
            }
        }
        if ((NIL == failP) && (!set.set_test(set1).eql(set.set_test(set2)))) {
            set_contents_var = set.do_set_internal(set2);
            SubLObject element_of_set2;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == failP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                element_of_set2 = set_contents.do_set_contents_next(basis_object, state);
                if ((NIL != set_contents.do_set_contents_element_validP(state, element_of_set2)) && (NIL == set.set_memberP(element_of_set2, set1))) {
                    failP = T;
                }
            }
        }
        return makeBoolean(NIL == failP);
    }

    /**
     *
     *
     * @param SETS;
     * 		listp of SET-P.
     * @return FUNCTIONP; The test function to use for a new set formed from
    elements of SETS.
     * @unknown baxter
     */
    @LispMethod(comment = "@param SETS;\r\n\t\tlistp of SET-P.\r\n@return FUNCTIONP; The test function to use for a new set formed from\r\nelements of SETS.\r\n@unknown baxter")
    public static final SubLObject default_test_function_for_sets_alt(SubLObject sets) {
        {
            SubLObject first_set_test = set.set_test(sets.first());
            if (NIL == remove(first_set_test, sets, symbol_function(EQ), SET_TEST, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                return first_set_test;
            } else {
                return set.$new_set_default_test_function$.getGlobalValue();
            }
        }
    }

    /**
     *
     *
     * @param SETS;
     * 		listp of SET-P.
     * @return FUNCTIONP; The test function to use for a new set formed from
    elements of SETS.
     * @unknown baxter
     */
    @LispMethod(comment = "@param SETS;\r\n\t\tlistp of SET-P.\r\n@return FUNCTIONP; The test function to use for a new set formed from\r\nelements of SETS.\r\n@unknown baxter")
    public static SubLObject default_test_function_for_sets(final SubLObject sets) {
        final SubLObject first_set_test = set.set_test(sets.first());
        if (NIL == remove(first_set_test, sets, symbol_function(EQ), set_utilities.SET_TEST, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return first_set_test;
        }
        return set.$new_set_default_test_function$.getGlobalValue();
    }

    /**
     *
     *
     * @param SMALL;
    set-p
     * 		
     * @param LARGE;
    set-p
     * 		
     * @return BOOLEAN; Is every member of SMALL a member of LARGE?
     * @unknown baxter
     */
    @LispMethod(comment = "@param SMALL;\nset-p\r\n\t\t\r\n@param LARGE;\nset-p\r\n\t\t\r\n@return BOOLEAN; Is every member of SMALL a member of LARGE?\r\n@unknown baxter")
    public static final SubLObject set_subsetP_alt(SubLObject small, SubLObject large) {
        SubLTrampolineFile.checkType(small, SET_P);
        SubLTrampolineFile.checkType(large, SET_P);
        {
            SubLObject failP = NIL;
            if (set.set_size(small).numG(set.set_size(large)) && (set.set_test(small) == set.set_test(large))) {
                failP = T;
            }
            {
                SubLObject set_contents_var = set.do_set_internal(small);
                SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                SubLObject state = NIL;
                for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); !((NIL != failP) || (NIL != set_contents.do_set_contents_doneP(basis_object, state))); state = set_contents.do_set_contents_update_state(state)) {
                    {
                        SubLObject elem = set_contents.do_set_contents_next(basis_object, state);
                        if (NIL != set_contents.do_set_contents_element_validP(state, elem)) {
                            if (NIL == set.set_memberP(elem, large)) {
                                failP = T;
                            }
                        }
                    }
                }
            }
            return makeBoolean(NIL == failP);
        }
    }

    /**
     *
     *
     * @param SMALL;
    set-p
     * 		
     * @param LARGE;
    set-p
     * 		
     * @return BOOLEAN; Is every member of SMALL a member of LARGE?
     * @unknown baxter
     */
    @LispMethod(comment = "@param SMALL;\nset-p\r\n\t\t\r\n@param LARGE;\nset-p\r\n\t\t\r\n@return BOOLEAN; Is every member of SMALL a member of LARGE?\r\n@unknown baxter")
    public static SubLObject set_subsetP(final SubLObject small, final SubLObject large) {
        assert NIL != set.set_p(small) : "! set.set_p(small) " + ("set.set_p(small) " + "CommonSymbols.NIL != set.set_p(small) ") + small;
        assert NIL != set.set_p(large) : "! set.set_p(large) " + ("set.set_p(large) " + "CommonSymbols.NIL != set.set_p(large) ") + large;
        SubLObject failP = NIL;
        if (set.set_size(small).numG(set.set_size(large)) && set.set_test(small).eql(set.set_test(large))) {
            failP = T;
        }
        final SubLObject set_contents_var = set.do_set_internal(small);
        SubLObject basis_object;
        SubLObject state;
        SubLObject elem;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == failP) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
            elem = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, elem)) && (NIL == set.set_memberP(elem, large))) {
                failP = T;
            }
        }
        return makeBoolean(NIL == failP);
    }

    /**
     *
     *
     * @return booleanp; t iff SMALL is a subset of any of LARGE-SETS.
     */
    @LispMethod(comment = "@return booleanp; t iff SMALL is a subset of any of LARGE-SETS.")
    public static final SubLObject set_subset_anyP_alt(SubLObject small, SubLObject large_sets) {
        {
            SubLObject cdolist_list_var = large_sets;
            SubLObject large = NIL;
            for (large = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , large = cdolist_list_var.first()) {
                if (NIL != com.cyc.cycjava.cycl.set_utilities.set_subsetP(small, large)) {
                    return T;
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return booleanp; t iff SMALL is a subset of any of LARGE-SETS.
     */
    @LispMethod(comment = "@return booleanp; t iff SMALL is a subset of any of LARGE-SETS.")
    public static SubLObject set_subset_anyP(final SubLObject small, final SubLObject large_sets) {
        SubLObject cdolist_list_var = large_sets;
        SubLObject large = NIL;
        large = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != set_utilities.set_subsetP(small, large)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            large = cdolist_list_var.first();
        } 
        return NIL;
    }

    /**
     * Return the first occurrance of ITEM in SET.
     */
    @LispMethod(comment = "Return the first occurrance of ITEM in SET.")
    public static final SubLObject set_find_alt(SubLObject item, SubLObject v_set, SubLObject test, SubLObject key) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        SubLTrampolineFile.checkType(v_set, SET_P);
        {
            SubLObject found = NIL;
            SubLObject set_contents_var = set.do_set_internal(v_set);
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); !((NIL != found) || (NIL != set_contents.do_set_contents_doneP(basis_object, state))); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject element = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, element)) {
                        if (NIL != funcall(test, item, funcall(key, element))) {
                            found = element;
                        }
                    }
                }
            }
            return found;
        }
    }

    @LispMethod(comment = "Return the first occurrance of ITEM in SET.")
    public static SubLObject set_find(final SubLObject item, final SubLObject v_set, SubLObject test, SubLObject key) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        assert NIL != set.set_p(v_set) : "! set.set_p(v_set) " + ("set.set_p(v_set) " + "CommonSymbols.NIL != set.set_p(v_set) ") + v_set;
        SubLObject found = NIL;
        final SubLObject set_contents_var = set.do_set_internal(v_set);
        SubLObject basis_object;
        SubLObject state;
        SubLObject element;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == found) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
            element = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, element)) && (NIL != funcall(test, item, funcall(key, element)))) {
                found = element;
            }
        }
        return found;
    }

    /**
     * Return the first element of SET that passes TEST.
     */
    @LispMethod(comment = "Return the first element of SET that passes TEST.")
    public static final SubLObject set_find_if_alt(SubLObject test, SubLObject v_set, SubLObject key) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        SubLTrampolineFile.checkType(v_set, SET_P);
        {
            SubLObject found = NIL;
            SubLObject set_contents_var = set.do_set_internal(v_set);
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); !((NIL != found) || (NIL != set_contents.do_set_contents_doneP(basis_object, state))); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject element = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, element)) {
                        if (NIL != funcall(test, funcall(key, element))) {
                            found = element;
                        }
                    }
                }
            }
            return found;
        }
    }

    @LispMethod(comment = "Return the first element of SET that passes TEST.")
    public static SubLObject set_find_if(final SubLObject test, final SubLObject v_set, SubLObject key) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        assert NIL != set.set_p(v_set) : "! set.set_p(v_set) " + ("set.set_p(v_set) " + "CommonSymbols.NIL != set.set_p(v_set) ") + v_set;
        SubLObject found = NIL;
        final SubLObject set_contents_var = set.do_set_internal(v_set);
        SubLObject basis_object;
        SubLObject state;
        SubLObject element;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == found) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
            element = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, element)) && (NIL != funcall(test, funcall(key, element)))) {
                found = element;
            }
        }
        return found;
    }

    /**
     * Return the first element of SET that fails TEST.
     */
    @LispMethod(comment = "Return the first element of SET that fails TEST.")
    public static final SubLObject set_find_if_not_alt(SubLObject test, SubLObject v_set, SubLObject key) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        SubLTrampolineFile.checkType(v_set, SET_P);
        {
            SubLObject found = NIL;
            SubLObject set_contents_var = set.do_set_internal(v_set);
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); !((NIL != found) || (NIL != set_contents.do_set_contents_doneP(basis_object, state))); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject element = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, element)) {
                        if (NIL == funcall(test, funcall(key, element))) {
                            found = element;
                        }
                    }
                }
            }
            return found;
        }
    }

    @LispMethod(comment = "Return the first element of SET that fails TEST.")
    public static SubLObject set_find_if_not(final SubLObject test, final SubLObject v_set, SubLObject key) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        assert NIL != set.set_p(v_set) : "! set.set_p(v_set) " + ("set.set_p(v_set) " + "CommonSymbols.NIL != set.set_p(v_set) ") + v_set;
        SubLObject found = NIL;
        final SubLObject set_contents_var = set.do_set_internal(v_set);
        SubLObject basis_object;
        SubLObject state;
        SubLObject element;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == found) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
            element = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, element)) && (NIL == funcall(test, funcall(key, element)))) {
                found = element;
            }
        }
        return found;
    }

    /**
     * Remove all elements of SET that pass TEST.
     */
    @LispMethod(comment = "Remove all elements of SET that pass TEST.")
    public static final SubLObject set_remove_if_alt(SubLObject test, SubLObject v_set, SubLObject key) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        SubLTrampolineFile.checkType(v_set, SET_P);
        {
            SubLObject doomed = NIL;
            SubLObject set_contents_var = set.do_set_internal(v_set);
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject element = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, element)) {
                        if (NIL != funcall(test, funcall(key, element))) {
                            doomed = cons(element, doomed);
                        }
                    }
                }
            }
            {
                SubLObject cdolist_list_var = doomed;
                SubLObject element = NIL;
                for (element = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , element = cdolist_list_var.first()) {
                    set.set_remove(element, v_set);
                }
            }
            return v_set;
        }
    }

    @LispMethod(comment = "Remove all elements of SET that pass TEST.")
    public static SubLObject set_remove_if(final SubLObject test, final SubLObject v_set, SubLObject key) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        assert NIL != set.set_p(v_set) : "! set.set_p(v_set) " + ("set.set_p(v_set) " + "CommonSymbols.NIL != set.set_p(v_set) ") + v_set;
        SubLObject doomed = NIL;
        final SubLObject set_contents_var = set.do_set_internal(v_set);
        SubLObject basis_object;
        SubLObject state;
        SubLObject element;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            element = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, element)) && (NIL != funcall(test, funcall(key, element)))) {
                doomed = cons(element, doomed);
            }
        }
        SubLObject cdolist_list_var = doomed;
        SubLObject element2 = NIL;
        element2 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            set.set_remove(element2, v_set);
            cdolist_list_var = cdolist_list_var.rest();
            element2 = cdolist_list_var.first();
        } 
        return values(v_set, list_utilities.non_empty_list_p(doomed));
    }

    /**
     * Remove all elements of SET that fail TEST.
     */
    @LispMethod(comment = "Remove all elements of SET that fail TEST.")
    public static final SubLObject set_remove_if_not_alt(SubLObject test, SubLObject v_set, SubLObject key) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        SubLTrampolineFile.checkType(v_set, SET_P);
        {
            SubLObject doomed = NIL;
            SubLObject set_contents_var = set.do_set_internal(v_set);
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject element = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, element)) {
                        if (NIL == funcall(test, funcall(key, element))) {
                            doomed = cons(element, doomed);
                        }
                    }
                }
            }
            {
                SubLObject cdolist_list_var = doomed;
                SubLObject element = NIL;
                for (element = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , element = cdolist_list_var.first()) {
                    set.set_remove(element, v_set);
                }
            }
            return v_set;
        }
    }

    @LispMethod(comment = "Remove all elements of SET that fail TEST.")
    public static SubLObject set_remove_if_not(final SubLObject test, final SubLObject v_set, SubLObject key) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        assert NIL != set.set_p(v_set) : "! set.set_p(v_set) " + ("set.set_p(v_set) " + "CommonSymbols.NIL != set.set_p(v_set) ") + v_set;
        SubLObject doomed = NIL;
        final SubLObject set_contents_var = set.do_set_internal(v_set);
        SubLObject basis_object;
        SubLObject state;
        SubLObject element;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            element = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, element)) && (NIL == funcall(test, funcall(key, element)))) {
                doomed = cons(element, doomed);
            }
        }
        SubLObject cdolist_list_var = doomed;
        SubLObject element2 = NIL;
        element2 = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            set.set_remove(element2, v_set);
            cdolist_list_var = cdolist_list_var.rest();
            element2 = cdolist_list_var.first();
        } 
        return values(v_set, list_utilities.non_empty_list_p(doomed));
    }

    /**
     * Returns a set from the objects in LIST.
     */
    @LispMethod(comment = "Returns a set from the objects in LIST.")
    public static final SubLObject construct_set_from_list_alt(SubLObject list, SubLObject test, SubLObject size) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (size == UNPROVIDED) {
            size = length(list);
        }
        {
            SubLObject v_set = set.new_set(test, size);
            SubLObject cdolist_list_var = list;
            SubLObject elem = NIL;
            for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                set.set_add(elem, v_set);
            }
            return v_set;
        }
    }

    @LispMethod(comment = "Returns a set from the objects in LIST.")
    public static SubLObject construct_set_from_list(final SubLObject list, SubLObject test, SubLObject size) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (size == UNPROVIDED) {
            size = length(list);
        }
        final SubLObject v_set = set.new_set(test, size);
        SubLObject cdolist_list_var = list;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            set.set_add(elem, v_set);
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        return v_set;
    }

    /**
     * Returns a set-contents object constructed from the objects in LIST.
     */
    @LispMethod(comment = "Returns a set-contents object constructed from the objects in LIST.")
    public static final SubLObject construct_set_contents_from_list_alt(SubLObject list, SubLObject test, SubLObject size) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (size == UNPROVIDED) {
            size = length(list);
        }
        {
            SubLObject v_set_contents = set_contents.new_set_contents(size, test);
            SubLObject cdolist_list_var = list;
            SubLObject elem = NIL;
            for (elem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , elem = cdolist_list_var.first()) {
                v_set_contents = set_contents.set_contents_add(elem, v_set_contents, test);
            }
            return v_set_contents;
        }
    }

    @LispMethod(comment = "Returns a set-contents object constructed from the objects in LIST.")
    public static SubLObject construct_set_contents_from_list(final SubLObject list, SubLObject test, SubLObject size) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        if (size == UNPROVIDED) {
            size = length(list);
        }
        SubLObject v_set_contents = set_contents.new_set_contents(size, test);
        SubLObject cdolist_list_var = list;
        SubLObject elem = NIL;
        elem = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            v_set_contents = set_contents.set_contents_add(elem, v_set_contents, test);
            cdolist_list_var = cdolist_list_var.rest();
            elem = cdolist_list_var.first();
        } 
        return v_set_contents;
    }

    /**
     * Returns a singleton set containing just ELEMENT.
     */
    @LispMethod(comment = "Returns a singleton set containing just ELEMENT.")
    public static final SubLObject new_singleton_set_alt(SubLObject element, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        {
            SubLObject v_set = set.new_set(test, ONE_INTEGER);
            set.set_add(element, v_set);
            return v_set;
        }
    }

    @LispMethod(comment = "Returns a singleton set containing just ELEMENT.")
    public static SubLObject new_singleton_set(final SubLObject element, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        final SubLObject v_set = set.new_set(test, ONE_INTEGER);
        set.set_add(element, v_set);
        return v_set;
    }

    /**
     * Allocates and returns a new set with @xref new-set, with LIST for the set values.
     */
    @LispMethod(comment = "Allocates and returns a new set with @xref new-set, with LIST for the set values.")
    public static final SubLObject make_set_from_list_alt(SubLObject list, SubLObject test) {
        if (test == UNPROVIDED) {
            test = set.$new_set_default_test_function$.getGlobalValue();
        }
        return com.cyc.cycjava.cycl.set_utilities.construct_set_from_list(list, test, length(list));
    }

    @LispMethod(comment = "Allocates and returns a new set with @xref new-set, with LIST for the set values.")
    public static SubLObject make_set_from_list(final SubLObject list, SubLObject test) {
        if (test == UNPROVIDED) {
            test = set.$new_set_default_test_function$.getGlobalValue();
        }
        return set_utilities.construct_set_from_list(list, test, length(list));
    }

    public static final SubLObject any_in_set_alt(SubLObject func, SubLObject v_set, SubLObject key) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        {
            SubLObject result = NIL;
            if ((key == symbol_function(IDENTITY)) || (key == IDENTITY)) {
                {
                    SubLObject set_contents_var = set.do_set_internal(v_set);
                    SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                    SubLObject state = NIL;
                    for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); !((NIL != result) || (NIL != set_contents.do_set_contents_doneP(basis_object, state))); state = set_contents.do_set_contents_update_state(state)) {
                        {
                            SubLObject item = set_contents.do_set_contents_next(basis_object, state);
                            if (NIL != set_contents.do_set_contents_element_validP(state, item)) {
                                result = funcall(func, item);
                            }
                        }
                    }
                }
            } else {
                {
                    SubLObject set_contents_var = set.do_set_internal(v_set);
                    SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                    SubLObject state = NIL;
                    for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); !((NIL != result) || (NIL != set_contents.do_set_contents_doneP(basis_object, state))); state = set_contents.do_set_contents_update_state(state)) {
                        {
                            SubLObject item = set_contents.do_set_contents_next(basis_object, state);
                            if (NIL != set_contents.do_set_contents_element_validP(state, item)) {
                                result = funcall(func, funcall(key, item));
                            }
                        }
                    }
                }
            }
            return result;
        }
    }

    public static SubLObject any_in_set(final SubLObject func, final SubLObject v_set, SubLObject key) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        SubLObject result = NIL;
        if (key.eql(symbol_function(IDENTITY)) || (key == IDENTITY)) {
            final SubLObject set_contents_var = set.do_set_internal(v_set);
            SubLObject basis_object;
            SubLObject state;
            SubLObject item;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == result) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                item = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, item)) {
                    result = funcall(func, item);
                }
            }
        } else {
            final SubLObject set_contents_var = set.do_set_internal(v_set);
            SubLObject basis_object;
            SubLObject state;
            SubLObject item;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == result) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                item = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, item)) {
                    result = funcall(func, funcall(key, item));
                }
            }
        }
        return result;
    }

    public static final SubLObject every_in_set_alt(SubLObject func, SubLObject v_set, SubLObject key) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        {
            SubLObject result = NIL;
            if ((key == symbol_function(IDENTITY)) || (key == IDENTITY)) {
                {
                    SubLObject set_contents_var = set.do_set_internal(v_set);
                    SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                    SubLObject state = NIL;
                    for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); !((NIL != result) || (NIL != set_contents.do_set_contents_doneP(basis_object, state))); state = set_contents.do_set_contents_update_state(state)) {
                        {
                            SubLObject item = set_contents.do_set_contents_next(basis_object, state);
                            if (NIL != set_contents.do_set_contents_element_validP(state, item)) {
                                result = makeBoolean(NIL == funcall(func, item));
                            }
                        }
                    }
                }
            } else {
                {
                    SubLObject set_contents_var = set.do_set_internal(v_set);
                    SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                    SubLObject state = NIL;
                    for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); !((NIL != result) || (NIL != set_contents.do_set_contents_doneP(basis_object, state))); state = set_contents.do_set_contents_update_state(state)) {
                        {
                            SubLObject item = set_contents.do_set_contents_next(basis_object, state);
                            if (NIL != set_contents.do_set_contents_element_validP(state, item)) {
                                result = makeBoolean(NIL == funcall(func, funcall(key, item)));
                            }
                        }
                    }
                }
            }
            return makeBoolean(NIL == result);
        }
    }

    public static SubLObject every_in_set(final SubLObject func, final SubLObject v_set, SubLObject key) {
        if (key == UNPROVIDED) {
            key = symbol_function(IDENTITY);
        }
        SubLObject result = NIL;
        if (key.eql(symbol_function(IDENTITY)) || (key == IDENTITY)) {
            final SubLObject set_contents_var = set.do_set_internal(v_set);
            SubLObject basis_object;
            SubLObject state;
            SubLObject item;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == result) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                item = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, item)) {
                    result = makeBoolean(NIL == funcall(func, item));
                }
            }
        } else {
            final SubLObject set_contents_var = set.do_set_internal(v_set);
            SubLObject basis_object;
            SubLObject state;
            SubLObject item;
            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); (NIL == result) && (NIL == set_contents.do_set_contents_doneP(basis_object, state)); state = set_contents.do_set_contents_update_state(state)) {
                item = set_contents.do_set_contents_next(basis_object, state);
                if (NIL != set_contents.do_set_contents_element_validP(state, item)) {
                    result = makeBoolean(NIL == funcall(func, funcall(key, item)));
                }
            }
        }
        return makeBoolean(NIL == result);
    }

    public static final SubLObject print_set_contents_alt(SubLObject v_set, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        {
            SubLObject set_contents_var = set.do_set_internal(v_set);
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject item = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, item)) {
                        format(stream, $str_alt11$_A__, item);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject print_set_contents(final SubLObject v_set, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        final SubLObject set_contents_var = set.do_set_internal(v_set);
        SubLObject basis_object;
        SubLObject state;
        SubLObject item;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            item = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, item)) {
                format(stream, set_utilities.$str12$_A__, item);
            }
        }
        return NIL;
    }

    public static final SubLObject set_add_all_alt(SubLObject elements, SubLObject v_set) {
        {
            SubLObject cdolist_list_var = elements;
            SubLObject element = NIL;
            for (element = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , element = cdolist_list_var.first()) {
                set.set_add(element, v_set);
            }
        }
        return v_set;
    }

    public static SubLObject set_add_all(final SubLObject elements, final SubLObject v_set) {
        SubLObject cdolist_list_var = elements;
        SubLObject element = NIL;
        element = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            set.set_add(element, v_set);
            cdolist_list_var = cdolist_list_var.rest();
            element = cdolist_list_var.first();
        } 
        return v_set;
    }

    public static SubLObject set_add_set(final SubLObject v_set, final SubLObject resulting_set) {
        final SubLObject set_contents_var = set.do_set_internal(v_set);
        SubLObject basis_object;
        SubLObject state;
        SubLObject elt;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            elt = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, elt)) {
                set.set_add(elt, resulting_set);
            }
        }
        return resulting_set;
    }

    public static final SubLObject set_remove_all_alt(SubLObject elements, SubLObject v_set) {
        {
            SubLObject cdolist_list_var = elements;
            SubLObject element = NIL;
            for (element = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , element = cdolist_list_var.first()) {
                set.set_remove(element, v_set);
            }
        }
        return v_set;
    }

    public static SubLObject set_remove_all(final SubLObject elements, final SubLObject v_set) {
        SubLObject cdolist_list_var = elements;
        SubLObject element = NIL;
        element = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            set.set_remove(element, v_set);
            cdolist_list_var = cdolist_list_var.rest();
            element = cdolist_list_var.first();
        } 
        return v_set;
    }

    /**
     * Returns the TARGET-SET after adding the members of the SOURCE-SET to it.
     */
    @LispMethod(comment = "Returns the TARGET-SET after adding the members of the SOURCE-SET to it.")
    public static final SubLObject set_nmerge_alt(SubLObject target_set, SubLObject source_set) {
        SubLTrampolineFile.checkType(target_set, SET_P);
        SubLTrampolineFile.checkType(source_set, SET_P);
        {
            SubLObject set_contents_var = set.do_set_internal(source_set);
            SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
            SubLObject state = NIL;
            for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                {
                    SubLObject element = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, element)) {
                        set.set_add(element, target_set);
                    }
                }
            }
        }
        return target_set;
    }

    @LispMethod(comment = "Returns the TARGET-SET after adding the members of the SOURCE-SET to it.")
    public static SubLObject set_nmerge(final SubLObject target_set, final SubLObject source_set) {
        assert NIL != set.set_p(target_set) : "! set.set_p(target_set) " + ("set.set_p(target_set) " + "CommonSymbols.NIL != set.set_p(target_set) ") + target_set;
        assert NIL != set.set_p(source_set) : "! set.set_p(source_set) " + ("set.set_p(source_set) " + "CommonSymbols.NIL != set.set_p(source_set) ") + source_set;
        final SubLObject set_contents_var = set.do_set_internal(source_set);
        SubLObject basis_object;
        SubLObject state;
        SubLObject element;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            element = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, element)) {
                set.set_add(element, target_set);
            }
        }
        return target_set;
    }

    /**
     *
     *
     * @see CDOLIST-NUMBERED
     */
    @LispMethod(comment = "@see CDOLIST-NUMBERED")
    public static final SubLObject do_set_numbered_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt12);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject elem = NIL;
                    SubLObject counter = NIL;
                    SubLObject v_set = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt12);
                    elem = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt12);
                    counter = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt12);
                    v_set = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_1 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt12);
                            current_1 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt12);
                            if (NIL == member(current_1, $list_alt13, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_1 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt12);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return list(CLET, list(bq_cons(counter, $list_alt17)), listS(DO_SET, list(elem, v_set, $DONE, done), append(body, list(list(CINC, counter)))));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     *
     *
     * @see CDOLIST-NUMBERED
     */
    @LispMethod(comment = "@see CDOLIST-NUMBERED")
    public static SubLObject do_set_numbered(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, set_utilities.$list13);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject elem = NIL;
        SubLObject counter = NIL;
        SubLObject v_set = NIL;
        destructuring_bind_must_consp(current, datum, set_utilities.$list13);
        elem = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, set_utilities.$list13);
        counter = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, set_utilities.$list13);
        v_set = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, set_utilities.$list13);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, set_utilities.$list13);
            if (NIL == member(current_$1, set_utilities.$list14, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == set_utilities.$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, set_utilities.$list13);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return list(CLET, list(bq_cons(counter, set_utilities.$list18)), listS(DO_SET, list(elem, v_set, $DONE, done), append(body, list(list(CINC, counter)))));
    }

    public static SubLObject sliding_window_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject sliding_window_p(final SubLObject v_object) {
        return v_object.getClass() == set_utilities.$sliding_window_native.class ? T : NIL;
    }

    public static SubLObject sldwnd_window(final SubLObject v_object) {
        assert NIL != set_utilities.sliding_window_p(v_object) : "! set_utilities.sliding_window_p(v_object) " + "set_utilities.sliding_window_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject sldwnd_set_a(final SubLObject v_object) {
        assert NIL != set_utilities.sliding_window_p(v_object) : "! set_utilities.sliding_window_p(v_object) " + "set_utilities.sliding_window_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject sldwnd_set_b(final SubLObject v_object) {
        assert NIL != set_utilities.sliding_window_p(v_object) : "! set_utilities.sliding_window_p(v_object) " + "set_utilities.sliding_window_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject sldwnd_window_a(final SubLObject v_object) {
        assert NIL != set_utilities.sliding_window_p(v_object) : "! set_utilities.sliding_window_p(v_object) " + "set_utilities.sliding_window_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject sldwnd_window_b(final SubLObject v_object) {
        assert NIL != set_utilities.sliding_window_p(v_object) : "! set_utilities.sliding_window_p(v_object) " + "set_utilities.sliding_window_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject _csetf_sldwnd_window(final SubLObject v_object, final SubLObject value) {
        assert NIL != set_utilities.sliding_window_p(v_object) : "! set_utilities.sliding_window_p(v_object) " + "set_utilities.sliding_window_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_sldwnd_set_a(final SubLObject v_object, final SubLObject value) {
        assert NIL != set_utilities.sliding_window_p(v_object) : "! set_utilities.sliding_window_p(v_object) " + "set_utilities.sliding_window_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_sldwnd_set_b(final SubLObject v_object, final SubLObject value) {
        assert NIL != set_utilities.sliding_window_p(v_object) : "! set_utilities.sliding_window_p(v_object) " + "set_utilities.sliding_window_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_sldwnd_window_a(final SubLObject v_object, final SubLObject value) {
        assert NIL != set_utilities.sliding_window_p(v_object) : "! set_utilities.sliding_window_p(v_object) " + "set_utilities.sliding_window_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_sldwnd_window_b(final SubLObject v_object, final SubLObject value) {
        assert NIL != set_utilities.sliding_window_p(v_object) : "! set_utilities.sliding_window_p(v_object) " + "set_utilities.sliding_window_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject make_sliding_window(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new set_utilities.$sliding_window_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($WINDOW)) {
                set_utilities._csetf_sldwnd_window(v_new, current_value);
            } else
                if (pcase_var.eql($SET_A)) {
                    set_utilities._csetf_sldwnd_set_a(v_new, current_value);
                } else
                    if (pcase_var.eql($SET_B)) {
                        set_utilities._csetf_sldwnd_set_b(v_new, current_value);
                    } else
                        if (pcase_var.eql($WINDOW_A)) {
                            set_utilities._csetf_sldwnd_window_a(v_new, current_value);
                        } else
                            if (pcase_var.eql($WINDOW_B)) {
                                set_utilities._csetf_sldwnd_window_b(v_new, current_value);
                            } else {
                                Errors.error(set_utilities.$str45$Invalid_slot__S_for_construction_, current_arg);
                            }




        }
        return v_new;
    }

    static private final SubLSymbol $sym7$_ = makeSymbol("<");

    static private final SubLList $list_alt10 = list(makeSymbol("CONSTRUCT-SET-FROM-LIST"));

    static private final SubLString $str_alt11$_A__ = makeString("~A~%");

    public static SubLObject visit_defstruct_sliding_window(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, set_utilities.MAKE_SLIDING_WINDOW, FIVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $WINDOW, set_utilities.sldwnd_window(obj));
        funcall(visitor_fn, obj, $SLOT, $SET_A, set_utilities.sldwnd_set_a(obj));
        funcall(visitor_fn, obj, $SLOT, $SET_B, set_utilities.sldwnd_set_b(obj));
        funcall(visitor_fn, obj, $SLOT, $WINDOW_A, set_utilities.sldwnd_window_a(obj));
        funcall(visitor_fn, obj, $SLOT, $WINDOW_B, set_utilities.sldwnd_window_b(obj));
        funcall(visitor_fn, obj, $END, set_utilities.MAKE_SLIDING_WINDOW, FIVE_INTEGER);
        return obj;
    }

    static private final SubLList $list_alt12 = list(list(makeSymbol("ELEM"), makeSymbol("COUNTER"), makeSymbol("SET"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt13 = list($DONE);

    static private final SubLList $list_alt17 = list(ZERO_INTEGER);

    public static SubLObject visit_defstruct_object_sliding_window_method(final SubLObject obj, final SubLObject visitor_fn) {
        return set_utilities.visit_defstruct_sliding_window(obj, visitor_fn);
    }

    public static SubLObject new_sliding_window(final SubLObject window_size, SubLObject test) {
        if (test == UNPROVIDED) {
            test = symbol_function(EQL);
        }
        final SubLObject slw = set_utilities.make_sliding_window(UNPROVIDED);
        set_utilities._csetf_sldwnd_window(slw, window_size);
        set_utilities._csetf_sldwnd_set_a(slw, set.new_set(test, window_size));
        set_utilities._csetf_sldwnd_set_b(slw, set.new_set(test, window_size));
        set_utilities._csetf_sldwnd_window_a(slw, queues.create_queue(UNPROVIDED));
        set_utilities._csetf_sldwnd_window_b(slw, queues.create_queue(UNPROVIDED));
        return slw;
    }

    public static SubLObject sliding_window_add_a(final SubLObject element, final SubLObject slw) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_set = set_utilities.sldwnd_set_a(slw);
        final SubLObject window = set_utilities.sldwnd_window_a(slw);
        final SubLObject window_size = set_utilities.sldwnd_window(slw);
        thread.resetMultipleValues();
        final SubLObject newP = set_utilities.sliding_window_add_element(element, v_set, window, window_size);
        final SubLObject old_element = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return values(newP, old_element);
    }

    public static SubLObject sliding_window_add_b(final SubLObject element, final SubLObject slw) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_set = set_utilities.sldwnd_set_b(slw);
        final SubLObject window = set_utilities.sldwnd_window_b(slw);
        final SubLObject window_size = set_utilities.sldwnd_window(slw);
        thread.resetMultipleValues();
        final SubLObject newP = set_utilities.sliding_window_add_element(element, v_set, window, window_size);
        final SubLObject old_element = thread.secondMultipleValue();
        thread.resetMultipleValues();
        return values(newP, old_element);
    }

    public static SubLObject sliding_window_overlapP(final SubLObject slw, final SubLObject amount) {
        return set_utilities.sets_intersect_by(set_utilities.sldwnd_set_a(slw), set_utilities.sldwnd_set_b(slw), amount);
    }

    public static SubLObject sliding_window_intersection(final SubLObject slw) {
        final SubLObject set_a = set_utilities.sldwnd_set_a(slw);
        final SubLObject set_b = set_utilities.sldwnd_set_b(slw);
        final SubLObject test = set.set_test(set_a);
        return set_utilities.set_intersection(list(set_a, set_b), test);
    }

    public static SubLObject sliding_window_add_element(final SubLObject element, final SubLObject v_set, final SubLObject window, final SubLObject window_size) {
        final SubLObject new_comer = set.set_add(element, v_set);
        if (NIL == list_utilities.sublisp_boolean(new_comer)) {
            queues.remqueue(element, window, set.set_test(v_set));
            queues.enqueue(element, window);
            return values(NIL, NIL);
        }
        queues.enqueue(element, window);
        if (window_size.numL(set.set_size(v_set))) {
            final SubLObject loser = queues.dequeue(window);
            set.set_remove(loser, v_set);
            return values(T, loser);
        }
        return values(T, NIL);
    }

    public static SubLObject test_sliding_windows(final SubLObject list_a, final SubLObject list_b, final SubLObject window, final SubLObject shared) {
        final SubLObject test = EQUAL;
        final SubLObject amount = length(shared);
        final SubLObject shared_set = set_utilities.construct_set_from_list(shared, test, amount);
        final SubLObject slw = set_utilities.new_sliding_window(window, test);
        for (SubLObject cursor_a = list_a, cursor_b = list_b; (NIL != list_utilities.sublisp_boolean(cursor_a)) || (NIL != list_utilities.sublisp_boolean(cursor_b)); cursor_a = cursor_a.rest() , cursor_b = cursor_b.rest()) {
            set_utilities.sliding_window_add_a(cursor_a.first(), slw);
            set_utilities.sliding_window_add_b(cursor_b.first(), slw);
            if (NIL != set_utilities.sliding_window_overlapP(slw, amount)) {
                final SubLObject intersection = set_utilities.sliding_window_intersection(slw);
                if (NIL != set_utilities.sets_coextensionalP(intersection, shared_set)) {
                    return $SUCCESS;
                }
                Errors.error(set_utilities.$str60$Set__A_is_not_co_extensional_with, intersection, shared_set);
            }
        }
        return $FAILURE;
    }

    public static SubLObject declare_set_utilities_file() {
        declareFunction("set_arbitrary_element", "SET-ARBITRARY-ELEMENT", 1, 0, false);
        declareFunction("set_arbitrary_element_without_values", "SET-ARBITRARY-ELEMENT-WITHOUT-VALUES", 1, 1, false);
        declareFunction("set_contents_arbitrary_element", "SET-CONTENTS-ARBITRARY-ELEMENT", 1, 0, false);
        declareFunction("set_contents_arbitrary_element_without_values", "SET-CONTENTS-ARBITRARY-ELEMENT-WITHOUT-VALUES", 1, 1, false);
        declareFunction("set_remove_random_element", "SET-REMOVE-RANDOM-ELEMENT", 1, 0, false);
        declareFunction("set_union", "SET-UNION", 1, 1, false);
        declareFunction("set_contents_union", "SET-CONTENTS-UNION", 1, 1, false);
        declareFunction("set_intersection", "SET-INTERSECTION", 1, 1, false);
        declareFunction("set_contents_intersection", "SET-CONTENTS-INTERSECTION", 1, 1, false);
        declareFunction("sets_intersectP", "SETS-INTERSECT?", 1, 0, false);
        declareFunction("set_intersection_fraction", "SET-INTERSECTION-FRACTION", 2, 0, false);
        declareFunction("sets_intersect_by", "SETS-INTERSECT-BY", 3, 0, false);
        declareFunction("set_minus", "SET-MINUS", 2, 1, false);
        declareFunction("set_nprune", "SET-NPRUNE", 2, 0, false);
        declareFunction("set_prune", "SET-PRUNE", 2, 0, false);
        declareFunction("sets_coextensionalP", "SETS-COEXTENSIONAL?", 2, 0, false);
        declareFunction("default_test_function_for_sets", "DEFAULT-TEST-FUNCTION-FOR-SETS", 1, 0, false);
        declareFunction("set_subsetP", "SET-SUBSET?", 2, 0, false);
        declareFunction("set_subset_anyP", "SET-SUBSET-ANY?", 2, 0, false);
        declareFunction("set_find", "SET-FIND", 2, 2, false);
        declareFunction("set_find_if", "SET-FIND-IF", 2, 1, false);
        declareFunction("set_find_if_not", "SET-FIND-IF-NOT", 2, 1, false);
        declareFunction("set_remove_if", "SET-REMOVE-IF", 2, 1, false);
        declareFunction("set_remove_if_not", "SET-REMOVE-IF-NOT", 2, 1, false);
        declareFunction("construct_set_from_list", "CONSTRUCT-SET-FROM-LIST", 1, 2, false);
        declareFunction("construct_set_contents_from_list", "CONSTRUCT-SET-CONTENTS-FROM-LIST", 1, 2, false);
        declareFunction("new_singleton_set", "NEW-SINGLETON-SET", 1, 1, false);
        declareFunction("make_set_from_list", "MAKE-SET-FROM-LIST", 1, 1, false);
        declareFunction("any_in_set", "ANY-IN-SET", 2, 1, false);
        declareFunction("every_in_set", "EVERY-IN-SET", 2, 1, false);
        declareFunction("print_set_contents", "PRINT-SET-CONTENTS", 1, 1, false);
        declareFunction("set_add_all", "SET-ADD-ALL", 2, 0, false);
        declareFunction("set_add_set", "SET-ADD-SET", 2, 0, false);
        declareFunction("set_remove_all", "SET-REMOVE-ALL", 2, 0, false);
        declareFunction("set_nmerge", "SET-NMERGE", 2, 0, false);
        declareMacro("do_set_numbered", "DO-SET-NUMBERED");
        declareFunction("sliding_window_print_function_trampoline", "SLIDING-WINDOW-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("sliding_window_p", "SLIDING-WINDOW-P", 1, 0, false);
        new set_utilities.$sliding_window_p$UnaryFunction();
        declareFunction("sldwnd_window", "SLDWND-WINDOW", 1, 0, false);
        declareFunction("sldwnd_set_a", "SLDWND-SET-A", 1, 0, false);
        declareFunction("sldwnd_set_b", "SLDWND-SET-B", 1, 0, false);
        declareFunction("sldwnd_window_a", "SLDWND-WINDOW-A", 1, 0, false);
        declareFunction("sldwnd_window_b", "SLDWND-WINDOW-B", 1, 0, false);
        declareFunction("_csetf_sldwnd_window", "_CSETF-SLDWND-WINDOW", 2, 0, false);
        declareFunction("_csetf_sldwnd_set_a", "_CSETF-SLDWND-SET-A", 2, 0, false);
        declareFunction("_csetf_sldwnd_set_b", "_CSETF-SLDWND-SET-B", 2, 0, false);
        declareFunction("_csetf_sldwnd_window_a", "_CSETF-SLDWND-WINDOW-A", 2, 0, false);
        declareFunction("_csetf_sldwnd_window_b", "_CSETF-SLDWND-WINDOW-B", 2, 0, false);
        declareFunction("make_sliding_window", "MAKE-SLIDING-WINDOW", 0, 1, false);
        declareFunction("visit_defstruct_sliding_window", "VISIT-DEFSTRUCT-SLIDING-WINDOW", 2, 0, false);
        declareFunction("visit_defstruct_object_sliding_window_method", "VISIT-DEFSTRUCT-OBJECT-SLIDING-WINDOW-METHOD", 2, 0, false);
        declareFunction("new_sliding_window", "NEW-SLIDING-WINDOW", 1, 1, false);
        declareFunction("sliding_window_add_a", "SLIDING-WINDOW-ADD-A", 2, 0, false);
        declareFunction("sliding_window_add_b", "SLIDING-WINDOW-ADD-B", 2, 0, false);
        declareFunction("sliding_window_overlapP", "SLIDING-WINDOW-OVERLAP?", 2, 0, false);
        declareFunction("sliding_window_intersection", "SLIDING-WINDOW-INTERSECTION", 1, 0, false);
        declareFunction("sliding_window_add_element", "SLIDING-WINDOW-ADD-ELEMENT", 4, 0, false);
        declareFunction("test_sliding_windows", "TEST-SLIDING-WINDOWS", 4, 0, false);
        return NIL;
    }

    public static SubLObject init_set_utilities_file() {
        deflexical("*EMPTY-SET*", SubLTrampolineFile.maybeDefault(set_utilities.$empty_set$, set_utilities.$empty_set$, () -> set.new_set(symbol_function(EQ), ZERO_INTEGER)));
        defconstant("*DTP-SLIDING-WINDOW*", set_utilities.SLIDING_WINDOW);
        return NIL;
    }

    public static final SubLObject setup_set_utilities_file_alt() {
        define_obsolete_register(MAKE_SET_FROM_LIST, $list_alt10);
        return NIL;
    }

    public static SubLObject setup_set_utilities_file() {
        if (SubLFiles.USE_V1) {
            declare_defglobal(set_utilities.$empty_set$);
            define_obsolete_register(set_utilities.MAKE_SET_FROM_LIST, set_utilities.$list11);
            register_method($print_object_method_table$.getGlobalValue(), set_utilities.$dtp_sliding_window$.getGlobalValue(), symbol_function(set_utilities.SLIDING_WINDOW_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim(set_utilities.$list29);
            def_csetf(set_utilities.SLDWND_WINDOW, set_utilities._CSETF_SLDWND_WINDOW);
            def_csetf(set_utilities.SLDWND_SET_A, set_utilities._CSETF_SLDWND_SET_A);
            def_csetf(set_utilities.SLDWND_SET_B, set_utilities._CSETF_SLDWND_SET_B);
            def_csetf(set_utilities.SLDWND_WINDOW_A, set_utilities._CSETF_SLDWND_WINDOW_A);
            def_csetf(set_utilities.SLDWND_WINDOW_B, set_utilities._CSETF_SLDWND_WINDOW_B);
            identity(set_utilities.SLIDING_WINDOW);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), set_utilities.$dtp_sliding_window$.getGlobalValue(), symbol_function(set_utilities.VISIT_DEFSTRUCT_OBJECT_SLIDING_WINDOW_METHOD));
            define_test_case_table_int(set_utilities.TEST_SLIDING_WINDOWS, list(new SubLObject[]{ $TEST, EQL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), set_utilities.$list58);
        }
        if (SubLFiles.USE_V2) {
            define_obsolete_register(MAKE_SET_FROM_LIST, $list_alt10);
        }
        return NIL;
    }

    public static SubLObject setup_set_utilities_file_Previous() {
        declare_defglobal(set_utilities.$empty_set$);
        define_obsolete_register(set_utilities.MAKE_SET_FROM_LIST, set_utilities.$list11);
        register_method($print_object_method_table$.getGlobalValue(), set_utilities.$dtp_sliding_window$.getGlobalValue(), symbol_function(set_utilities.SLIDING_WINDOW_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim(set_utilities.$list29);
        def_csetf(set_utilities.SLDWND_WINDOW, set_utilities._CSETF_SLDWND_WINDOW);
        def_csetf(set_utilities.SLDWND_SET_A, set_utilities._CSETF_SLDWND_SET_A);
        def_csetf(set_utilities.SLDWND_SET_B, set_utilities._CSETF_SLDWND_SET_B);
        def_csetf(set_utilities.SLDWND_WINDOW_A, set_utilities._CSETF_SLDWND_WINDOW_A);
        def_csetf(set_utilities.SLDWND_WINDOW_B, set_utilities._CSETF_SLDWND_WINDOW_B);
        identity(set_utilities.SLIDING_WINDOW);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), set_utilities.$dtp_sliding_window$.getGlobalValue(), symbol_function(set_utilities.VISIT_DEFSTRUCT_OBJECT_SLIDING_WINDOW_METHOD));
        define_test_case_table_int(set_utilities.TEST_SLIDING_WINDOWS, list(new SubLObject[]{ $TEST, EQL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), set_utilities.$list58);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        set_utilities.declare_set_utilities_file();
    }

    @Override
    public void initializeVariables() {
        set_utilities.init_set_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        set_utilities.setup_set_utilities_file();
    }

    static {
    }

    public static final class $sliding_window_native extends SubLStructNative {
        public SubLObject $window;

        public SubLObject $set_a;

        public SubLObject $set_b;

        public SubLObject $window_a;

        public SubLObject $window_b;

        private static final SubLStructDeclNative structDecl;

        public $sliding_window_native() {
            this.$window = Lisp.NIL;
            this.$set_a = Lisp.NIL;
            this.$set_b = Lisp.NIL;
            this.$window_a = Lisp.NIL;
            this.$window_b = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$window;
        }

        @Override
        public SubLObject getField3() {
            return this.$set_a;
        }

        @Override
        public SubLObject getField4() {
            return this.$set_b;
        }

        @Override
        public SubLObject getField5() {
            return this.$window_a;
        }

        @Override
        public SubLObject getField6() {
            return this.$window_b;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$window = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$set_a = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$set_b = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$window_a = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$window_b = value;
        }

        static {
            structDecl = makeStructDeclNative(set_utilities.$sliding_window_native.class, set_utilities.SLIDING_WINDOW, set_utilities.SLIDING_WINDOW_P, set_utilities.$list23, set_utilities.$list24, new String[]{ "$window", "$set_a", "$set_b", "$window_a", "$window_b" }, set_utilities.$list25, set_utilities.$list26, DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $sliding_window_p$UnaryFunction extends UnaryFunction {
        public $sliding_window_p$UnaryFunction() {
            super(extractFunctionNamed("SLIDING-WINDOW-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return set_utilities.sliding_window_p(arg1);
        }
    }
}

/**
 * Total time: 335 ms
 */
