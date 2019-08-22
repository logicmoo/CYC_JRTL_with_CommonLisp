/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.el_utilities.el_error;
import static com.cyc.cycjava.cycl.el_utilities.sentence_free_variables;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.char_lessp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.make_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplacd;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove_duplicates;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.reverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.subseq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_name;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_listp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.intersection;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.list_length;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member_if;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nsubst;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.sublis;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subsetp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subst;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.union;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class multibindings extends SubLTranslatedFile implements V12 {
    public static final SubLObject subloop_reserved_initialize_multibinding_test_case_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
        classes.subloop_initialize_slot(new_instance, MULTIBINDING_TEST_CASE, BINDING_LIST1, NIL);
        classes.subloop_initialize_slot(new_instance, MULTIBINDING_TEST_CASE, BINDING2, NIL);
        classes.subloop_initialize_slot(new_instance, MULTIBINDING_TEST_CASE, MBINDING1, NIL);
        classes.subloop_initialize_slot(new_instance, MULTIBINDING_TEST_CASE, MBINDING2, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_multibinding_test_case_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
        return NIL;
    }

    public static final SubLObject set_multibinding_test_case_mbinding2(SubLObject multibinding_test_case, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(multibinding_test_case, value, SIX_INTEGER, MBINDING2);
    }

    public static final SubLObject set_multibinding_test_case_mbinding1(SubLObject multibinding_test_case, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(multibinding_test_case, value, FIVE_INTEGER, MBINDING1);
    }

    public static final SubLObject set_multibinding_test_case_binding_list1(SubLObject multibinding_test_case, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(multibinding_test_case, value, THREE_INTEGER, BINDING_LIST1);
    }

    public static final SubLObject set_multibinding_test_case_binding2(SubLObject multibinding_test_case, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(multibinding_test_case, value, FOUR_INTEGER, BINDING2);
    }

    public static final SubLObject multibinding_test_case_p(SubLObject multibinding_test_case) {
        return classes.subloop_instanceof_class(multibinding_test_case, MULTIBINDING_TEST_CASE);
    }

    public static final SubLObject get_multibinding_test_case_mbinding2(SubLObject multibinding_test_case) {
        return classes.subloop_get_access_protected_instance_slot(multibinding_test_case, SIX_INTEGER, MBINDING2);
    }

    public static final SubLObject get_multibinding_test_case_mbinding1(SubLObject multibinding_test_case) {
        return classes.subloop_get_access_protected_instance_slot(multibinding_test_case, FIVE_INTEGER, MBINDING1);
    }

    public static final SubLObject get_multibinding_test_case_binding_list1(SubLObject multibinding_test_case) {
        return classes.subloop_get_access_protected_instance_slot(multibinding_test_case, THREE_INTEGER, BINDING_LIST1);
    }

    public static final SubLObject get_multibinding_test_case_binding2(SubLObject multibinding_test_case) {
        return classes.subloop_get_access_protected_instance_slot(multibinding_test_case, FOUR_INTEGER, BINDING2);
    }

    static private final SubLString $str_alt51$ = makeString("");

    public static final SubLFile me = new multibindings();

 public static final String myName = "com.cyc.cycjava.cycl.multibindings";


    // deflexical
    @LispMethod(comment = "Represents the degenerate multibinding case\ndeflexical")
    // Definitions
    /**
     * Represents the degenerate multibinding case
     */
    private static final SubLSymbol $multibinding_fail$ = makeSymbol("*MULTIBINDING-FAIL*");

    // defparameter
    @LispMethod(comment = "Set to NIL in those cases where it is known there\r\nis no need to reify nats in a mb value list.\ndefparameter\nSet to NIL in those cases where it is known there\nis no need to reify nats in a mb value list.")
    /**
     * Set to NIL in those cases where it is known there
     * is no need to reify nats in a mb value list.
     */
    public static final SubLSymbol $mb_reify_natsP$ = makeSymbol("*MB-REIFY-NATS?*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_mbinding$ = makeSymbol("*DTP-MBINDING*");

    static private final SubLSymbol $sym1$TERMS_IN_MULTIBINDING_ORDER_ = makeSymbol("TERMS-IN-MULTIBINDING-ORDER?");

    static private final SubLSymbol $sym2$EL_VAR_ = makeSymbol("EL-VAR?");

    static private final SubLString $str4$warning__trying_to_sort_the_varia = makeString("warning: trying to sort the variables ~A and ~A~%");

    static private final SubLString $str5$warning__trying_to_string_sort_th = makeString("warning: trying to string-sort the atoms ~A and ~A~%");

    static private final SubLSymbol $sym6$EMPTY_MULTIBINDING_PAIR_ = makeSymbol("EMPTY-MULTIBINDING-PAIR?");

    static private final SubLString $str7$convert_unit_to_normal_binding___ = makeString("convert-unit-to-normal-binding: ~s is not a unit-multibinding-pair?");

    private static final SubLSymbol MULTIBINDING_P = makeSymbol("MULTIBINDING-P");

    static private final SubLString $str9$MBIND_SIMPLE_BINDING_LIST___s_is_ = makeString("MBIND-SIMPLE-BINDING-LIST: ~s is not a multibinding-p.");

    static private final SubLString $str10$MULTIBINDING_ = makeString("MULTIBINDING:");

    static private final SubLString $str11$_s____ = makeString("~s -->");

    static private final SubLString $str12$__s = makeString(" ~s");

    private static final SubLSymbol MBINDING_P = makeSymbol("MBINDING-P");

    static private final SubLList $list15 = list(makeSymbol("MULTI-VAR-TERM-MAP"), makeSymbol("SIMPLE-VAR-TERM-MAP"), makeSymbol("DEGENERATE?"));

    static private final SubLList $list16 = list(makeKeyword("MULTI-VAR-TERM-MAP"), makeKeyword("SIMPLE-VAR-TERM-MAP"), makeKeyword("DEGENERATE?"));

    static private final SubLList $list17 = list(makeSymbol("MB-MULTI-VAR-TERM-MAP"), makeSymbol("MB-SIMPLE-VAR-TERM-MAP"), makeSymbol("MB-DEGENERATE?"));

    static private final SubLList $list18 = list(makeSymbol("_CSETF-MB-MULTI-VAR-TERM-MAP"), makeSymbol("_CSETF-MB-SIMPLE-VAR-TERM-MAP"), makeSymbol("_CSETF-MB-DEGENERATE?"));

    private static final SubLSymbol PRINT_MB = makeSymbol("PRINT-MB");

    private static final SubLSymbol MBINDING_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("MBINDING-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list21 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("MBINDING-P"));

    private static final SubLSymbol MB_MULTI_VAR_TERM_MAP = makeSymbol("MB-MULTI-VAR-TERM-MAP");

    private static final SubLSymbol _CSETF_MB_MULTI_VAR_TERM_MAP = makeSymbol("_CSETF-MB-MULTI-VAR-TERM-MAP");

    private static final SubLSymbol MB_SIMPLE_VAR_TERM_MAP = makeSymbol("MB-SIMPLE-VAR-TERM-MAP");

    private static final SubLSymbol _CSETF_MB_SIMPLE_VAR_TERM_MAP = makeSymbol("_CSETF-MB-SIMPLE-VAR-TERM-MAP");

    private static final SubLSymbol $sym26$MB_DEGENERATE_ = makeSymbol("MB-DEGENERATE?");

    private static final SubLSymbol $sym27$_CSETF_MB_DEGENERATE_ = makeSymbol("_CSETF-MB-DEGENERATE?");

    private static final SubLSymbol $MULTI_VAR_TERM_MAP = makeKeyword("MULTI-VAR-TERM-MAP");

    private static final SubLSymbol $SIMPLE_VAR_TERM_MAP = makeKeyword("SIMPLE-VAR-TERM-MAP");

    private static final SubLString $str31$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_MBINDING = makeSymbol("MAKE-MBINDING");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_MBINDING_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-MBINDING-METHOD");

    private static final SubLString $str37$__MB_ = makeString("#<MB:");

    private static final SubLString $str38$_a_ = makeString("~a:");

    private static final SubLString $str39$_a = makeString("~a");

    private static final SubLString $str40$_ = makeString(">");

    private static final SubLString $str41$empty_ = makeString("empty>");

    static private final SubLList $list45 = list(list(makeSymbol("VAR"), makeSymbol("VALUES"), makeSymbol("MB"), makeSymbol("&OPTIONAL"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym46$ENTRY = makeUninternedSymbol("ENTRY");

    private static final SubLList $list51 = list(makeSymbol("FUNCTION"), makeSymbol("FIRST"));

    private static final SubLList $list53 = list(list(makeSymbol("VAR"), makeSymbol("EXTENT"), makeSymbol("MB"), makeSymbol("&OPTIONAL"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym54$ENTRY = makeUninternedSymbol("ENTRY");

    private static final SubLSymbol VARIABLE_EXTENT_IN_MULTIBINDING = makeSymbol("VARIABLE-EXTENT-IN-MULTIBINDING");

    private static final SubLString $str57$ = makeString("");

    private static final SubLString $str58$___s____ = makeString("~%~s -->");

    private static final SubLList $list60 = list(makeSymbol("VALUE"), makeSymbol("OLD-SUPPORTS"));

    private static final SubLSymbol MB_ADD_BINDINGS_AND_SUPPORTS = makeSymbol("MB-ADD-BINDINGS-AND-SUPPORTS");

    static private final SubLList $list62 = list(makeSymbol("BINDING"), makeSymbol("SUPPORTS"));

    private static final SubLSymbol BINDING_LIST_P = makeSymbol("BINDING-LIST-P");

    private static final SubLList $list64 = cons(makeSymbol("BINDING"), makeSymbol("SUPPORTS-LIST"));

    private static final SubLSymbol MULTIBINDING_REIFY_NAT_VALUES = makeSymbol("MULTIBINDING-REIFY-NAT-VALUES");

    public static final SubLObject multibinding_fail_token_alt() {
        return $multibinding_fail$.getGlobalValue();
    }

    public static SubLObject multibinding_fail_token() {
        return $multibinding_fail$.getGlobalValue();
    }

    /**
     *
     *
     * @param MBINDING
    multibinding-p
     * 		
     */
    @LispMethod(comment = "@param MBINDING\nmultibinding-p")
    public static final SubLObject multibinding_failedP_alt(SubLObject mbinding) {
        return eq($multibinding_fail$.getGlobalValue(), mbinding);
    }

    /**
     *
     *
     * @param MBINDING
    multibinding-p
     * 		
     */
    @LispMethod(comment = "@param MBINDING\nmultibinding-p")
    public static SubLObject multibinding_failedP(final SubLObject mbinding) {
        return eq($multibinding_fail$.getGlobalValue(), mbinding);
    }

    public static final SubLObject empty_multibindingP_alt(SubLObject mbind) {
        return makeBoolean((NIL != dictionary.dictionary_empty_p(mb_multi_var_term_map(mbind))) && (NIL != dictionary.dictionary_empty_p(mb_simple_var_term_map(mbind))));
    }

    public static SubLObject empty_multibindingP(final SubLObject mbind) {
        return makeBoolean((NIL != dictionary.dictionary_empty_p(mb_multi_var_term_map(mbind))) && (NIL != dictionary.dictionary_empty_p(mb_simple_var_term_map(mbind))));
    }

    /**
     *
     *
     * @deprecated 
     */
    @LispMethod(comment = "@deprecated")
    public static final SubLObject make_multibinding_alt() {
        return make_mbinding(UNPROVIDED);
    }

    /**
     *
     *
     * @deprecated 
     */
    @LispMethod(comment = "@deprecated")
    public static SubLObject make_multibinding() {
        return make_mbinding(UNPROVIDED);
    }

    /**
     *
     *
     * @param MBIND
     * 		multibinding-p; mbinding to copy
     * @return consp             ; complete copy of MBIND
     * @deprecated 
     */
    @LispMethod(comment = "@param MBIND\r\n\t\tmultibinding-p; mbinding to copy\r\n@return consp             ; complete copy of MBIND\r\n@deprecated")
    public static final SubLObject copy_multibinding_alt(SubLObject mbind) {
        return copy_mb(mbind);
    }

    /**
     *
     *
     * @param MBIND
     * 		multibinding-p; mbinding to copy
     * @return consp             ; complete copy of MBIND
     * @deprecated 
     */
    @LispMethod(comment = "@param MBIND\r\n\t\tmultibinding-p; mbinding to copy\r\n@return consp             ; complete copy of MBIND\r\n@deprecated")
    public static SubLObject copy_multibinding(final SubLObject mbind) {
        return copy_mb(mbind);
    }

    /**
     * This code was lifted almost whole from @xref COMMUTATIVE-TERMS-IN-ORDER?
     */
    @LispMethod(comment = "This code was lifted almost whole from @xref COMMUTATIVE-TERMS-IN-ORDER?")
    public static final SubLObject terms_in_multibinding_orderP_alt(SubLObject term1, SubLObject term2) {
        if (term1 == term2) {
            return T;
        }
        if (term1.isAtom()) {
            if (term2.isAtom()) {
                return atoms_in_multibinding_orderP(term1, term2);
            } else {
                return T;
            }
        } else {
            if (term2.isAtom()) {
                return NIL;
            } else {
                return formulas_in_multibinding_orderP(term1, term2);
            }
        }
    }

    /**
     * This code was lifted almost whole from @xref COMMUTATIVE-TERMS-IN-ORDER?
     */
    @LispMethod(comment = "This code was lifted almost whole from @xref COMMUTATIVE-TERMS-IN-ORDER?")
    public static SubLObject terms_in_multibinding_orderP(final SubLObject term1, final SubLObject term2) {
        if (term1.eql(term2)) {
            return T;
        }
        if (term1.isAtom()) {
            if (term2.isAtom()) {
                return atoms_in_multibinding_orderP(term1, term2);
            }
            return T;
        } else {
            if (term2.isAtom()) {
                return NIL;
            }
            return formulas_in_multibinding_orderP(term1, term2);
        }
    }

    public static final SubLObject sort_terms_into_multibinding_order_alt(SubLObject term_list) {
        return Sort.sort(term_list, symbol_function($sym1$TERMS_IN_MULTIBINDING_ORDER_), UNPROVIDED);
    }

    public static SubLObject sort_terms_into_multibinding_order(final SubLObject term_list) {
        return Sort.sort(term_list, symbol_function($sym1$TERMS_IN_MULTIBINDING_ORDER_), UNPROVIDED);
    }

    public static final SubLObject formulas_in_multibinding_orderP_alt(SubLObject formula1, SubLObject formula2) {
        {
            SubLObject var_num1 = list_utilities.tree_count_if(symbol_function($sym2$EL_VAR_), formula1, UNPROVIDED);
            SubLObject var_num2 = list_utilities.tree_count_if(symbol_function($sym2$EL_VAR_), formula2, UNPROVIDED);
            if (var_num1.numL(var_num2)) {
                return T;
            } else {
                if (var_num1.numG(var_num2)) {
                    return NIL;
                } else {
                    {
                        SubLObject atom_num1 = list_utilities.tree_count_if(symbol_function(ATOM), formula1, UNPROVIDED);
                        SubLObject atom_num2 = list_utilities.tree_count_if(symbol_function(ATOM), formula2, UNPROVIDED);
                        if (atom_num1.numL(atom_num2)) {
                            return T;
                        } else {
                            if (atom_num1.numG(atom_num2)) {
                                return NIL;
                            } else {
                                if (cycl_utilities.formula_arg0(formula1).equal(cycl_utilities.formula_arg0(formula2))) {
                                    return terms_in_multibinding_orderP(cycl_utilities.formula_args(formula1, UNPROVIDED), cycl_utilities.formula_args(formula2, UNPROVIDED));
                                } else {
                                    return terms_in_multibinding_orderP(cycl_utilities.formula_arg0(formula1), cycl_utilities.formula_arg0(formula2));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject formulas_in_multibinding_orderP(final SubLObject formula1, final SubLObject formula2) {
        final SubLObject var_num1 = list_utilities.tree_count_if(symbol_function($sym2$EL_VAR_), formula1, UNPROVIDED);
        final SubLObject var_num2 = list_utilities.tree_count_if(symbol_function($sym2$EL_VAR_), formula2, UNPROVIDED);
        if (var_num1.numL(var_num2)) {
            return T;
        }
        if (var_num1.numG(var_num2)) {
            return NIL;
        }
        final SubLObject atom_num1 = list_utilities.tree_count_if(symbol_function(ATOM), formula1, UNPROVIDED);
        final SubLObject atom_num2 = list_utilities.tree_count_if(symbol_function(ATOM), formula2, UNPROVIDED);
        if (atom_num1.numL(atom_num2)) {
            return T;
        }
        if (atom_num1.numG(atom_num2)) {
            return NIL;
        }
        if (cycl_utilities.formula_arg0(formula1).equal(cycl_utilities.formula_arg0(formula2))) {
            return terms_in_multibinding_orderP(cycl_utilities.formula_args(formula1, UNPROVIDED), cycl_utilities.formula_args(formula2, UNPROVIDED));
        }
        return terms_in_multibinding_orderP(cycl_utilities.formula_arg0(formula1), cycl_utilities.formula_arg0(formula2));
    }

    public static final SubLObject multibinding_constant_L_alt(SubLObject constant1, SubLObject constant2) {
        return constants_high.constant_external_id_L(constant1, constant2);
    }

    public static SubLObject multibinding_constant_L(final SubLObject constant1, final SubLObject constant2) {
        return constants_high.constant_external_id_L(constant1, constant2);
    }

    public static final SubLObject atoms_in_multibinding_orderP_alt(SubLObject atom1, SubLObject atom2) {
        if ((NIL != nart_handles.nart_p(atom1)) && (NIL != nart_handles.nart_p(atom2))) {
            return terms_in_multibinding_orderP(narts_high.nart_el_formula(atom1), narts_high.nart_el_formula(atom2));
        }
        if (NIL != nart_handles.nart_p(atom1)) {
            return terms_in_multibinding_orderP(narts_high.nart_el_formula(atom1), atom2);
        }
        if (NIL != nart_handles.nart_p(atom2)) {
            return terms_in_multibinding_orderP(atom1, narts_high.nart_el_formula(atom2));
        }
        if (NIL != cycl_variables.kb_varP(atom1)) {
            return terms_in_multibinding_orderP(variables.default_el_var_for_hl_var(atom1), atom2);
        }
        if (NIL != cycl_variables.kb_varP(atom2)) {
            return terms_in_multibinding_orderP(atom1, variables.default_el_var_for_hl_var(atom2));
        }
        if (NIL != constant_p(atom1)) {
            if (NIL != constant_p(atom2)) {
                return multibinding_constant_L(atom1, atom2);
            } else {
                return T;
            }
        } else {
            if (NIL != constant_p(atom2)) {
                return NIL;
            } else {
                if (NIL != cycl_variables.el_varP(atom1)) {
                    if (NIL != cycl_variables.el_varP(atom2)) {
                        el_error(FIVE_INTEGER, $str_alt4$warning__trying_to_sort_the_varia, atom1, atom2, UNPROVIDED);
                        return Strings.string_lessp(symbol_name(atom1), symbol_name(atom2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } else {
                        return T;
                    }
                } else {
                    if (NIL != cycl_variables.el_varP(atom2)) {
                        return NIL;
                    } else {
                        if (atom1.isSymbol()) {
                            if (atom2.isSymbol()) {
                                return Strings.string_lessp(symbol_name(atom1), symbol_name(atom2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            } else {
                                return T;
                            }
                        } else {
                            if (atom2.isSymbol()) {
                                return NIL;
                            } else {
                                if (atom1.isNumber()) {
                                    if (atom2.isNumber()) {
                                        return numL(atom1, atom2);
                                    } else {
                                        return T;
                                    }
                                } else {
                                    if (atom2.isNumber()) {
                                        return NIL;
                                    } else {
                                        if (atom1.isChar()) {
                                            if (atom2.isChar()) {
                                                return char_lessp(atom1, atom2);
                                            } else {
                                                return T;
                                            }
                                        } else {
                                            if (atom2.isChar()) {
                                                return NIL;
                                            } else {
                                                if (atom1.isString()) {
                                                    if (atom2.isString()) {
                                                        return Strings.string_lessp(atom1, atom2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    } else {
                                                        return T;
                                                    }
                                                } else {
                                                    if (atom2.isString()) {
                                                        return NIL;
                                                    } else {
                                                        el_error(FIVE_INTEGER, $str_alt5$warning__trying_to_string_sort_th, atom1, atom2, UNPROVIDED);
                                                        return Strings.string_lessp(string_utilities.str(atom1), string_utilities.str(atom2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject atoms_in_multibinding_orderP(final SubLObject atom1, final SubLObject atom2) {
        if ((NIL != nart_handles.nart_p(atom1)) && (NIL != nart_handles.nart_p(atom2))) {
            return terms_in_multibinding_orderP(narts_high.nart_el_formula(atom1), narts_high.nart_el_formula(atom2));
        }
        if (NIL != nart_handles.nart_p(atom1)) {
            return terms_in_multibinding_orderP(narts_high.nart_el_formula(atom1), atom2);
        }
        if (NIL != nart_handles.nart_p(atom2)) {
            return terms_in_multibinding_orderP(atom1, narts_high.nart_el_formula(atom2));
        }
        if (NIL != cycl_variables.kb_varP(atom1)) {
            return terms_in_multibinding_orderP(variables.default_el_var_for_hl_var(atom1), atom2);
        }
        if (NIL != cycl_variables.kb_varP(atom2)) {
            return terms_in_multibinding_orderP(atom1, variables.default_el_var_for_hl_var(atom2));
        }
        if (NIL != constant_p(atom1)) {
            if (NIL != constant_p(atom2)) {
                return multibinding_constant_L(atom1, atom2);
            }
            return T;
        } else {
            if (NIL != constant_p(atom2)) {
                return NIL;
            }
            if (NIL != cycl_variables.el_varP(atom1)) {
                if (NIL != cycl_variables.el_varP(atom2)) {
                    el_error(FIVE_INTEGER, $str4$warning__trying_to_sort_the_varia, atom1, atom2, UNPROVIDED);
                    return Strings.string_lessp(symbol_name(atom1), symbol_name(atom2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                }
                return T;
            } else {
                if (NIL != cycl_variables.el_varP(atom2)) {
                    return NIL;
                }
                if (atom1.isSymbol()) {
                    if (atom2.isSymbol()) {
                        return Strings.string_lessp(symbol_name(atom1), symbol_name(atom2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    }
                    return T;
                } else {
                    if (atom2.isSymbol()) {
                        return NIL;
                    }
                    if (atom1.isNumber()) {
                        if (atom2.isNumber()) {
                            return numL(atom1, atom2);
                        }
                        return T;
                    } else {
                        if (atom2.isNumber()) {
                            return NIL;
                        }
                        if (atom1.isChar()) {
                            if (atom2.isChar()) {
                                return char_lessp(atom1, atom2);
                            }
                            return T;
                        } else {
                            if (atom2.isChar()) {
                                return NIL;
                            }
                            if (atom1.isString()) {
                                if (atom2.isString()) {
                                    return Strings.string_lessp(atom1, atom2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                                return T;
                            } else {
                                if (atom2.isString()) {
                                    return NIL;
                                }
                                el_error(FIVE_INTEGER, $str5$warning__trying_to_string_sort_th, atom1, atom2, UNPROVIDED);
                                return Strings.string_lessp(string_utilities.str(atom1), string_utilities.str(atom2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Applies SUB2 to the right-hand-side of each item
     * in SUB1, and appends all items in SUB2 whose left-hand-sides aren't in SUB1.
     * Warning:  destroys the old value of SUB1 ***
     */
    @LispMethod(comment = "Applies SUB2 to the right-hand-side of each item\r\nin SUB1, and appends all items in SUB2 whose left-hand-sides aren\'t in SUB1.\r\nWarning:  destroys the old value of SUB1 ***\nApplies SUB2 to the right-hand-side of each item\nin SUB1, and appends all items in SUB2 whose left-hand-sides aren\'t in SUB1.\nWarning:  destroys the old value of SUB1 ***")
    public static final SubLObject compose_multibindings_alt(SubLObject sub1, SubLObject sub2) {
        {
            SubLObject new_bindings = copy_list(sub1);
            SubLObject bindings_to_append = NIL;
            SubLObject cdolist_list_var = sub2;
            SubLObject sub_pair = NIL;
            for (sub_pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sub_pair = cdolist_list_var.first()) {
                if (NIL == assoc(sub_pair.first(), new_bindings, UNPROVIDED, UNPROVIDED)) {
                    bindings_to_append = cons(sub_pair, bindings_to_append);
                }
            }
            return append(new_bindings, reverse(bindings_to_append));
        }
    }

    /**
     * Applies SUB2 to the right-hand-side of each item
     * in SUB1, and appends all items in SUB2 whose left-hand-sides aren't in SUB1.
     * * Warning:  destroys the old value of SUB1 ***
     */
    @LispMethod(comment = "Applies SUB2 to the right-hand-side of each item\r\nin SUB1, and appends all items in SUB2 whose left-hand-sides aren\'t in SUB1.\r\n* Warning:  destroys the old value of SUB1 ***\nApplies SUB2 to the right-hand-side of each item\nin SUB1, and appends all items in SUB2 whose left-hand-sides aren\'t in SUB1.\n* Warning:  destroys the old value of SUB1 ***")
    public static SubLObject compose_multibindings(final SubLObject sub1, final SubLObject sub2) {
        final SubLObject new_bindings = copy_list(sub1);
        SubLObject bindings_to_append = NIL;
        SubLObject cdolist_list_var = sub2;
        SubLObject sub_pair = NIL;
        sub_pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == assoc(sub_pair.first(), new_bindings, UNPROVIDED, UNPROVIDED)) {
                bindings_to_append = cons(sub_pair, bindings_to_append);
            }
            cdolist_list_var = cdolist_list_var.rest();
            sub_pair = cdolist_list_var.first();
        } 
        return append(new_bindings, reverse(bindings_to_append));
    }

    /**
     *
     *
     * @return booleanp ;; Returns T if X has the form of a multibinding, and NIL otherwise.
     */
    @LispMethod(comment = "@return booleanp ;; Returns T if X has the form of a multibinding, and NIL otherwise.")
    public static final SubLObject multibinding_p_alt(SubLObject x) {
        return mbinding_p(x);
    }

    /**
     *
     *
     * @return booleanp ;; Returns T if X has the form of a multibinding, and NIL otherwise.
     */
    @LispMethod(comment = "@return booleanp ;; Returns T if X has the form of a multibinding, and NIL otherwise.")
    public static SubLObject multibinding_p(final SubLObject x) {
        return mbinding_p(x);
    }

    public static final SubLObject simple_multibinding_listP_alt(SubLObject subs) {
        if (NIL == subs) {
            return T;
        } else {
            if (NIL != unit_multibinding_pairP(subs.first())) {
                return simple_multibinding_listP(subs.rest());
            } else {
                return NIL;
            }
        }
    }

    public static SubLObject simple_multibinding_listP(final SubLObject subs) {
        if (NIL == subs) {
            return T;
        }
        if (NIL != unit_multibinding_pairP(subs.first())) {
            return simple_multibinding_listP(subs.rest());
        }
        return NIL;
    }

    /**
     *
     *
     * @param BINDING
    multibinding-pair-p
     * 		
     * @return booleanp
     */
    @LispMethod(comment = "@param BINDING\nmultibinding-pair-p\r\n\t\t\r\n@return booleanp")
    public static final SubLObject unit_multibinding_pairP_alt(SubLObject binding) {
        return numE(list_length(binding), TWO_INTEGER);
    }

    /**
     *
     *
     * @param BINDING
    multibinding-pair-p
     * 		
     * @return booleanp
     */
    @LispMethod(comment = "@param BINDING\nmultibinding-pair-p\r\n\t\t\r\n@return booleanp")
    public static SubLObject unit_multibinding_pairP(final SubLObject binding) {
        return numE(list_length(binding), TWO_INTEGER);
    }

    /**
     *
     *
     * @param BINDING
    multibinding-pair-p
     * 		
     * @return booleanp
     */
    @LispMethod(comment = "@param BINDING\nmultibinding-pair-p\r\n\t\t\r\n@return booleanp")
    public static final SubLObject empty_multibinding_pairP_alt(SubLObject binding) {
        return numE(list_length(binding), ONE_INTEGER);
    }

    /**
     *
     *
     * @param BINDING
    multibinding-pair-p
     * 		
     * @return booleanp
     */
    @LispMethod(comment = "@param BINDING\nmultibinding-pair-p\r\n\t\t\r\n@return booleanp")
    public static SubLObject empty_multibinding_pairP(final SubLObject binding) {
        return numE(list_length(binding), ONE_INTEGER);
    }

    /**
     *
     *
     * @param MBINDING
    multibinding-p
     * 		
     * @return booleanp
     */
    @LispMethod(comment = "@param MBINDING\nmultibinding-p\r\n\t\t\r\n@return booleanp")
    public static final SubLObject degenerate_multibindingP_alt(SubLObject mbinding) {
        return member_if($sym6$EMPTY_MULTIBINDING_PAIR_, mbinding, UNPROVIDED);
    }

    /**
     *
     *
     * @param MBINDING
    multibinding-p
     * 		
     * @return booleanp
     */
    @LispMethod(comment = "@param MBINDING\nmultibinding-p\r\n\t\t\r\n@return booleanp")
    public static SubLObject degenerate_multibindingP(final SubLObject mbinding) {
        return member_if($sym6$EMPTY_MULTIBINDING_PAIR_, mbinding, UNPROVIDED);
    }

    /**
     *
     *
     * @param BINDING
    multibinding-pair-p
     * 		
     * @return booleanp
     */
    @LispMethod(comment = "@param BINDING\nmultibinding-pair-p\r\n\t\t\r\n@return booleanp")
    public static final SubLObject atomic_unit_multibinding_pairP_alt(SubLObject binding) {
        return makeBoolean(((NIL != unit_multibinding_pairP(binding)) && second(binding).isAtom()) && (NIL == cycl_variables.el_varP(second(binding))));
    }

    /**
     *
     *
     * @param BINDING
    multibinding-pair-p
     * 		
     * @return booleanp
     */
    @LispMethod(comment = "@param BINDING\nmultibinding-pair-p\r\n\t\t\r\n@return booleanp")
    public static SubLObject atomic_unit_multibinding_pairP(final SubLObject binding) {
        return makeBoolean(((NIL != unit_multibinding_pairP(binding)) && second(binding).isAtom()) && (NIL == cycl_variables.el_varP(second(binding))));
    }

    /**
     *
     *
     * @param UNIT-BINDING
    multibinding-pair-p
     * 		
     * @return consp
     */
    @LispMethod(comment = "@param UNIT-BINDING\nmultibinding-pair-p\r\n\t\t\r\n@return consp")
    public static final SubLObject convert_unit_to_normal_binding_alt(SubLObject unit_binding) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == unit_multibinding_pairP(unit_binding)) {
                    Errors.error($str_alt7$convert_unit_to_normal_binding___, unit_binding);
                }
            }
            return cons(unit_binding.first(), second(unit_binding));
        }
    }

    /**
     *
     *
     * @param UNIT-BINDING
    multibinding-pair-p
     * 		
     * @return consp
     */
    @LispMethod(comment = "@param UNIT-BINDING\nmultibinding-pair-p\r\n\t\t\r\n@return consp")
    public static SubLObject convert_unit_to_normal_binding(final SubLObject unit_binding) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == unit_multibinding_pairP(unit_binding))) {
            Errors.error($str7$convert_unit_to_normal_binding___, unit_binding);
        }
        return cons(unit_binding.first(), second(unit_binding));
    }

    /**
     *
     *
     * @param VAR
    el-var?
     * 		
     * @param MBINDING
    multibinding-p
     * 		
     * @return multibinding-pair-p
     */
    @LispMethod(comment = "@param VAR\nel-var?\r\n\t\t\r\n@param MBINDING\nmultibinding-p\r\n\t\t\r\n@return multibinding-pair-p")
    public static final SubLObject assoc_multibinding_alt(SubLObject var, SubLObject mbinding) {
        return assoc(var, mbinding, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @param VAR
    el-var?
     * 		
     * @param MBINDING
    multibinding-p
     * 		
     * @return multibinding-pair-p
     */
    @LispMethod(comment = "@param VAR\nel-var?\r\n\t\t\r\n@param MBINDING\nmultibinding-p\r\n\t\t\r\n@return multibinding-pair-p")
    public static SubLObject assoc_multibinding(final SubLObject var, final SubLObject mbinding) {
        return assoc(var, mbinding, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @param VAR
    el-var?
     * 		
     * @param MBINDING
    multibinding-p
     * 		
     * @return listp
     */
    @LispMethod(comment = "@param VAR\nel-var?\r\n\t\t\r\n@param MBINDING\nmultibinding-p\r\n\t\t\r\n@return listp")
    public static final SubLObject get_multibinding_values_alt(SubLObject var, SubLObject mbinding) {
        return mb_var_values(var, mbinding);
    }

    /**
     *
     *
     * @param VAR
    el-var?
     * 		
     * @param MBINDING
    multibinding-p
     * 		
     * @return listp
     */
    @LispMethod(comment = "@param VAR\nel-var?\r\n\t\t\r\n@param MBINDING\nmultibinding-p\r\n\t\t\r\n@return listp")
    public static SubLObject get_multibinding_values(final SubLObject var, final SubLObject mbinding) {
        return mb_var_values(var, mbinding);
    }

    /**
     *
     *
     * @param VAR
    el-var?
     * 		
     * @param MBIND
    multibinding-p
     * 		
     * @return symbolp; t if VAR is bound to a single non-var, nil otherwise.
     */
    @LispMethod(comment = "@param VAR\nel-var?\r\n\t\t\r\n@param MBIND\nmultibinding-p\r\n\t\t\r\n@return symbolp; t if VAR is bound to a single non-var, nil otherwise.")
    public static final SubLObject atomic_binding_in_multibindingP_alt(SubLObject var, SubLObject mbind) {
        {
            SubLObject values = get_multibinding_values(var, mbind);
            if (list_length(values).numE(ONE_INTEGER) && list_utilities.tree_count_if($sym2$EL_VAR_, values, UNPROVIDED).numE(ZERO_INTEGER)) {
                return T;
            } else {
                return NIL;
            }
        }
    }

    /**
     *
     *
     * @param VAR
    el-var?
     * 		
     * @param MBIND
    multibinding-p
     * 		
     * @return symbolp; t if VAR is bound to a single non-var, nil otherwise.
     */
    @LispMethod(comment = "@param VAR\nel-var?\r\n\t\t\r\n@param MBIND\nmultibinding-p\r\n\t\t\r\n@return symbolp; t if VAR is bound to a single non-var, nil otherwise.")
    public static SubLObject atomic_binding_in_multibindingP(final SubLObject var, final SubLObject mbind) {
        final SubLObject values = get_multibinding_values(var, mbind);
        if (list_length(values).numE(ONE_INTEGER) && list_utilities.tree_count_if($sym2$EL_VAR_, values, UNPROVIDED).numE(ZERO_INTEGER)) {
            return T;
        }
        return NIL;
    }

    /**
     *
     *
     * @param VAR
    el-var?
     * 		
     * @param VALUE-LIST
    listp
     * 		
     * @param MBINDING
    multibinding-p
     * 		
     * @return multibinding-p; MBINDING with VAR now mapped to VALUE-LIST.
     */
    @LispMethod(comment = "@param VAR\nel-var?\r\n\t\t\r\n@param VALUE-LIST\nlistp\r\n\t\t\r\n@param MBINDING\nmultibinding-p\r\n\t\t\r\n@return multibinding-p; MBINDING with VAR now mapped to VALUE-LIST.")
    public static final SubLObject replace_or_create_in_multibinding_alt(SubLObject var, SubLObject value_list, SubLObject mbinding) {
        {
            SubLObject bpair = assoc_multibinding(var, mbinding);
            if (NIL == bpair) {
                return cons(cons(var, value_list), mbinding);
            } else {
                rplacd(bpair, value_list);
                return mbinding;
            }
        }
    }

    /**
     *
     *
     * @param VAR
    el-var?
     * 		
     * @param VALUE-LIST
    listp
     * 		
     * @param MBINDING
    multibinding-p
     * 		
     * @return multibinding-p; MBINDING with VAR now mapped to VALUE-LIST.
     */
    @LispMethod(comment = "@param VAR\nel-var?\r\n\t\t\r\n@param VALUE-LIST\nlistp\r\n\t\t\r\n@param MBINDING\nmultibinding-p\r\n\t\t\r\n@return multibinding-p; MBINDING with VAR now mapped to VALUE-LIST.")
    public static SubLObject replace_or_create_in_multibinding(final SubLObject var, final SubLObject value_list, final SubLObject mbinding) {
        final SubLObject bpair = assoc_multibinding(var, mbinding);
        if (NIL == bpair) {
            return cons(cons(var, value_list), mbinding);
        }
        rplacd(bpair, value_list);
        return mbinding;
    }

    public static final SubLObject variable_in_multibindingP_alt(SubLObject var, SubLObject mbinding) {
        return list_utilities.sublisp_boolean(assoc_multibinding(var, mbinding));
    }

    public static SubLObject variable_in_multibindingP(final SubLObject var, final SubLObject mbinding) {
        return list_utilities.sublisp_boolean(assoc_multibinding(var, mbinding));
    }

    /**
     * Returns T if VAR either is not bound to any atoms, or
     * VAR is bound to another free variable in MBINDING.
     */
    @LispMethod(comment = "Returns T if VAR either is not bound to any atoms, or\r\nVAR is bound to another free variable in MBINDING.\nReturns T if VAR either is not bound to any atoms, or\nVAR is bound to another free variable in MBINDING.")
    public static final SubLObject free_variable_in_multibindingP_alt(SubLObject var, SubLObject mbinding) {
        {
            SubLObject vals = get_multibinding_values(var, mbinding);
            if (NIL == vals) {
                return T;
            } else {
                {
                    SubLObject vars_in_binding = list_utilities.tree_gather(vals, $sym2$EL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (NIL == vars_in_binding) {
                        return NIL;
                    } else {
                        {
                            SubLObject cdolist_list_var = vars_in_binding;
                            SubLObject v = NIL;
                            for (v = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v = cdolist_list_var.first()) {
                                if (NIL != free_variable_in_multibindingP(v, mbinding)) {
                                    return T;
                                }
                            }
                        }
                    }
                    return NIL;
                }
            }
        }
    }

    @LispMethod(comment = "Returns T if VAR either is not bound to any atoms, or\r\nVAR is bound to another free variable in MBINDING.\nReturns T if VAR either is not bound to any atoms, or\nVAR is bound to another free variable in MBINDING.")
    public static SubLObject free_variable_in_multibindingP(final SubLObject var, final SubLObject mbinding) {
        final SubLObject vals = get_multibinding_values(var, mbinding);
        if (NIL == vals) {
            return T;
        }
        final SubLObject vars_in_binding = list_utilities.tree_gather(vals, $sym2$EL_VAR_, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL == vars_in_binding) {
            return NIL;
        }
        SubLObject cdolist_list_var = vars_in_binding;
        SubLObject v = NIL;
        v = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != free_variable_in_multibindingP(v, mbinding)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            v = cdolist_list_var.first();
        } 
        return NIL;
    }

    /**
     *
     *
     * @unknown 
     */
    @LispMethod(comment = "@unknown")
    public static final SubLObject apply_multibinding_alt(SubLObject exp, SubLObject mbind) {
        return list(sublis(mbind, exp, UNPROVIDED, UNPROVIDED));
    }

    /**
     *
     *
     * @unknown 
     */
    @LispMethod(comment = "@unknown")
    public static SubLObject apply_multibinding(final SubLObject exp, final SubLObject mbind) {
        return list(sublis(mbind, exp, UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject propagate_atomic_multibinding_alt(SubLObject mbinding) {
        {
            SubLObject reversed_mbinding = reverse(mbinding);
            SubLObject unit_subs = NIL;
            SubLObject cdolist_list_var = reversed_mbinding;
            SubLObject bpair = NIL;
            for (bpair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , bpair = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_1 = unit_subs;
                    SubLObject unit_sub = NIL;
                    for (unit_sub = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , unit_sub = cdolist_list_var_1.first()) {
                        nsubst(second(unit_sub), unit_sub.first(), bpair, UNPROVIDED, UNPROVIDED);
                    }
                }
                if (NIL != atomic_unit_multibinding_pairP(bpair)) {
                    unit_subs = cons(bpair, unit_subs);
                }
            }
            return reverse(reversed_mbinding);
        }
    }

    public static SubLObject propagate_atomic_multibinding(final SubLObject mbinding) {
        final SubLObject reversed_mbinding = reverse(mbinding);
        SubLObject unit_subs = NIL;
        SubLObject cdolist_list_var = reversed_mbinding;
        SubLObject bpair = NIL;
        bpair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$1 = unit_subs;
            SubLObject unit_sub = NIL;
            unit_sub = cdolist_list_var_$1.first();
            while (NIL != cdolist_list_var_$1) {
                nsubst(second(unit_sub), unit_sub.first(), bpair, UNPROVIDED, UNPROVIDED);
                cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                unit_sub = cdolist_list_var_$1.first();
            } 
            if (NIL != atomic_unit_multibinding_pairP(bpair)) {
                unit_subs = cons(bpair, unit_subs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            bpair = cdolist_list_var.first();
        } 
        return reverse(reversed_mbinding);
    }

    /**
     *
     *
     * @return booleanp ;;Returns T if VAR is bound to only one variable in MBINDING.
     */
    @LispMethod(comment = "@return booleanp ;;Returns T if VAR is bound to only one variable in MBINDING.")
    public static final SubLObject singleton_variable_extentP_alt(SubLObject var, SubLObject mbinding) {
        return list_length(variable_extent_in_multibinding(var, mbinding)).numE(ONE_INTEGER) ? ((SubLObject) (T)) : NIL;
    }

    /**
     *
     *
     * @return booleanp ;;Returns T if VAR is bound to only one variable in MBINDING.
     */
    @LispMethod(comment = "@return booleanp ;;Returns T if VAR is bound to only one variable in MBINDING.")
    public static SubLObject singleton_variable_extentP(final SubLObject var, final SubLObject mbinding) {
        return list_length(variable_extent_in_multibinding(var, mbinding)).numE(ONE_INTEGER) ? T : NIL;
    }

    /**
     *
     *
     * @param MBINDINGS
     * 		listp ;; of multibinding-p
     * 		MBINDINGS are assumed to be a list of non-identical mbindings.
     */
    @LispMethod(comment = "@param MBINDINGS\r\n\t\tlistp ;; of multibinding-p\r\n\t\tMBINDINGS are assumed to be a list of non-identical mbindings.")
    public static final SubLObject collate_multibinding_list_alt(SubLObject mbindings) {
        {
            SubLObject next_mbindings = subseq(mbindings, ZERO_INTEGER, ONE_INTEGER);
            SubLObject made_a_changeP = NIL;
            SubLObject cdolist_list_var = mbindings.rest();
            SubLObject cur_mbinding = NIL;
            for (cur_mbinding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cur_mbinding = cdolist_list_var.first()) {
                {
                    SubLObject doneP = NIL;
                    if (NIL == doneP) {
                        {
                            SubLObject csome_list_var = next_mbindings;
                            SubLObject cur_next_mbinding = NIL;
                            for (cur_next_mbinding = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , cur_next_mbinding = csome_list_var.first()) {
                                {
                                    SubLObject different_var = only_variable_different(cur_next_mbinding, cur_mbinding);
                                    if (NIL != different_var) {
                                        {
                                            SubLObject old_values = get_multibinding_values(different_var, cur_mbinding);
                                            SubLObject next_entry = assoc_multibinding(different_var, cur_next_mbinding);
                                            made_a_changeP = T;
                                            rplacd(next_entry, sort_terms_into_multibinding_order(union(next_entry.rest(), old_values, UNPROVIDED, UNPROVIDED)));
                                            doneP = T;
                                        }
                                    }
                                }
                            }
                        }
                    }
                    if (NIL == doneP) {
                        next_mbindings = cons(cur_mbinding, next_mbindings);
                    }
                }
            }
            return values(next_mbindings, made_a_changeP);
        }
    }

    /**
     *
     *
     * @param MBINDINGS
     * 		listp ;; of multibinding-p
     * 		MBINDINGS are assumed to be a list of non-identical mbindings.
     */
    @LispMethod(comment = "@param MBINDINGS\r\n\t\tlistp ;; of multibinding-p\r\n\t\tMBINDINGS are assumed to be a list of non-identical mbindings.")
    public static SubLObject collate_multibinding_list(final SubLObject mbindings) {
        SubLObject next_mbindings = subseq(mbindings, ZERO_INTEGER, ONE_INTEGER);
        SubLObject made_a_changeP = NIL;
        SubLObject cdolist_list_var = mbindings.rest();
        SubLObject cur_mbinding = NIL;
        cur_mbinding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject doneP = NIL;
            if (NIL == doneP) {
                SubLObject csome_list_var = next_mbindings;
                SubLObject cur_next_mbinding = NIL;
                cur_next_mbinding = csome_list_var.first();
                while ((NIL == doneP) && (NIL != csome_list_var)) {
                    final SubLObject different_var = only_variable_different(cur_next_mbinding, cur_mbinding);
                    if (NIL != different_var) {
                        final SubLObject old_values = get_multibinding_values(different_var, cur_mbinding);
                        final SubLObject next_entry = assoc_multibinding(different_var, cur_next_mbinding);
                        made_a_changeP = T;
                        rplacd(next_entry, sort_terms_into_multibinding_order(union(next_entry.rest(), old_values, UNPROVIDED, UNPROVIDED)));
                        doneP = T;
                    }
                    csome_list_var = csome_list_var.rest();
                    cur_next_mbinding = csome_list_var.first();
                } 
            }
            if (NIL == doneP) {
                next_mbindings = cons(cur_mbinding, next_mbindings);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cur_mbinding = cdolist_list_var.first();
        } 
        return values(next_mbindings, made_a_changeP);
    }

    /**
     * Returns that part of MBINDING that consists
     * only of variables bound to one value only.
     */
    @LispMethod(comment = "Returns that part of MBINDING that consists\r\nonly of variables bound to one value only.\nReturns that part of MBINDING that consists\nonly of variables bound to one value only.")
    public static final SubLObject simple_multibinding_alt(SubLObject mbinding) {
        SubLTrampolineFile.checkType(mbinding, MULTIBINDING_P);
        {
            SubLObject simple_pairs = NIL;
            SubLObject cdolist_list_var = mbinding;
            SubLObject bpair = NIL;
            for (bpair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , bpair = cdolist_list_var.first()) {
                {
                    SubLObject var = bpair.first();
                    if (NIL != singleton_variable_extentP(var, mbinding)) {
                        simple_pairs = cons(bpair, simple_pairs);
                    }
                }
            }
            return reverse(simple_pairs);
        }
    }

    /**
     * Returns that part of MBINDING that consists
     * only of variables bound to one value only.
     */
    @LispMethod(comment = "Returns that part of MBINDING that consists\r\nonly of variables bound to one value only.\nReturns that part of MBINDING that consists\nonly of variables bound to one value only.")
    public static SubLObject simple_multibinding(final SubLObject mbinding) {
        assert NIL != multibinding_p(mbinding) : "! multibindings.multibinding_p(mbinding) " + ("multibindings.multibinding_p(mbinding) " + "CommonSymbols.NIL != multibindings.multibinding_p(mbinding) ") + mbinding;
        SubLObject simple_pairs = NIL;
        SubLObject cdolist_list_var = mbinding;
        SubLObject bpair = NIL;
        bpair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject var = bpair.first();
            if (NIL != singleton_variable_extentP(var, mbinding)) {
                simple_pairs = cons(bpair, simple_pairs);
            }
            cdolist_list_var = cdolist_list_var.rest();
            bpair = cdolist_list_var.first();
        } 
        return reverse(simple_pairs);
    }

    /**
     *
     *
     * @param MBINDING
    multibinding-p
     * 		
     * @return binding-list-p ;; a binding list of all the variable in MBINDING
    bound to one variable only.
     */
    @LispMethod(comment = "@param MBINDING\nmultibinding-p\r\n\t\t\r\n@return binding-list-p ;; a binding list of all the variable in MBINDING\r\nbound to one variable only.")
    public static final SubLObject mbind_simple_binding_list_alt(SubLObject mbinding) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (NIL == multibinding_p(mbinding)) {
                    Errors.error($str_alt9$MBIND_SIMPLE_BINDING_LIST___s_is_, mbinding);
                }
            }
            return mb_simple_binding(mbinding);
        }
    }

    /**
     *
     *
     * @param MBINDING
    multibinding-p
     * 		
     * @return binding-list-p ;; a binding list of all the variable in MBINDING
    bound to one variable only.
     */
    @LispMethod(comment = "@param MBINDING\nmultibinding-p\r\n\t\t\r\n@return binding-list-p ;; a binding list of all the variable in MBINDING\r\nbound to one variable only.")
    public static SubLObject mbind_simple_binding_list(final SubLObject mbinding) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == multibinding_p(mbinding))) {
            Errors.error($str9$MBIND_SIMPLE_BINDING_LIST___s_is_, mbinding);
        }
        return mb_simple_binding(mbinding);
    }

    public static final SubLObject print_multibinding_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        SubLTrampolineFile.checkType(v_object, MULTIBINDING_P);
        princ($str_alt10$MULTIBINDING_, UNPROVIDED);
        terpri(UNPROVIDED);
        {
            SubLObject cdolist_list_var = v_object;
            SubLObject cur_pair = NIL;
            for (cur_pair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cur_pair = cdolist_list_var.first()) {
                format(stream, $str_alt11$_s____, cur_pair.first());
                {
                    SubLObject cdolist_list_var_2 = cur_pair.rest();
                    SubLObject cur_val = NIL;
                    for (cur_val = cdolist_list_var_2.first(); NIL != cdolist_list_var_2; cdolist_list_var_2 = cdolist_list_var_2.rest() , cur_val = cdolist_list_var_2.first()) {
                        format(stream, $str_alt12$__s, cur_val);
                    }
                }
                terpri(UNPROVIDED);
            }
        }
        return v_object;
    }

    public static SubLObject print_multibinding(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        assert NIL != multibinding_p(v_object) : "! multibindings.multibinding_p(v_object) " + "multibindings.multibinding_p error :" + v_object;
        princ($str10$MULTIBINDING_, UNPROVIDED);
        terpri(UNPROVIDED);
        SubLObject cdolist_list_var = v_object;
        SubLObject cur_pair = NIL;
        cur_pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            format(stream, $str11$_s____, cur_pair.first());
            SubLObject cdolist_list_var_$2 = cur_pair.rest();
            SubLObject cur_val = NIL;
            cur_val = cdolist_list_var_$2.first();
            while (NIL != cdolist_list_var_$2) {
                format(stream, $str12$__s, cur_val);
                cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                cur_val = cdolist_list_var_$2.first();
            } 
            terpri(UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            cur_pair = cdolist_list_var.first();
        } 
        return v_object;
    }

    public static final SubLObject multibinding_string_alt(SubLObject v_object) {
        return mb_string(v_object);
    }

    public static SubLObject multibinding_string(final SubLObject v_object) {
        return mb_string(v_object);
    }

    public static final SubLObject mbinding_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_mb(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject mbinding_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_mb(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject mbinding_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.multibindings.$mbinding_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject mbinding_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.multibindings.$mbinding_native.class ? T : NIL;
    }

    public static final SubLObject mb_multi_var_term_map_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, MBINDING_P);
        return v_object.getField2();
    }

    public static SubLObject mb_multi_var_term_map(final SubLObject v_object) {
        assert NIL != mbinding_p(v_object) : "! multibindings.mbinding_p(v_object) " + "multibindings.mbinding_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject mb_simple_var_term_map_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, MBINDING_P);
        return v_object.getField3();
    }

    public static SubLObject mb_simple_var_term_map(final SubLObject v_object) {
        assert NIL != mbinding_p(v_object) : "! multibindings.mbinding_p(v_object) " + "multibindings.mbinding_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject mb_degenerateP_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, MBINDING_P);
        return v_object.getField4();
    }

    public static SubLObject mb_degenerateP(final SubLObject v_object) {
        assert NIL != mbinding_p(v_object) : "! multibindings.mbinding_p(v_object) " + "multibindings.mbinding_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject _csetf_mb_multi_var_term_map_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, MBINDING_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_mb_multi_var_term_map(final SubLObject v_object, final SubLObject value) {
        assert NIL != mbinding_p(v_object) : "! multibindings.mbinding_p(v_object) " + "multibindings.mbinding_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_mb_simple_var_term_map_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, MBINDING_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_mb_simple_var_term_map(final SubLObject v_object, final SubLObject value) {
        assert NIL != mbinding_p(v_object) : "! multibindings.mbinding_p(v_object) " + "multibindings.mbinding_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_mb_degenerateP_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, MBINDING_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_mb_degenerateP(final SubLObject v_object, final SubLObject value) {
        assert NIL != mbinding_p(v_object) : "! multibindings.mbinding_p(v_object) " + "multibindings.mbinding_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject make_mbinding_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.multibindings.$mbinding_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($MULTI_VAR_TERM_MAP)) {
                        _csetf_mb_multi_var_term_map(v_new, current_value);
                    } else {
                        if (pcase_var.eql($SIMPLE_VAR_TERM_MAP)) {
                            _csetf_mb_simple_var_term_map(v_new, current_value);
                        } else {
                            if (pcase_var.eql($DEGENERATE_)) {
                                _csetf_mb_degenerateP(v_new, current_value);
                            } else {
                                Errors.error($str_alt30$Invalid_slot__S_for_construction_, current_arg);
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_mbinding(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.multibindings.$mbinding_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($MULTI_VAR_TERM_MAP)) {
                _csetf_mb_multi_var_term_map(v_new, current_value);
            } else
                if (pcase_var.eql($SIMPLE_VAR_TERM_MAP)) {
                    _csetf_mb_simple_var_term_map(v_new, current_value);
                } else
                    if (pcase_var.eql($DEGENERATE_)) {
                        _csetf_mb_degenerateP(v_new, current_value);
                    } else {
                        Errors.error($str31$Invalid_slot__S_for_construction_, current_arg);
                    }


        }
        return v_new;
    }

    public static SubLObject visit_defstruct_mbinding(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_MBINDING, THREE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $MULTI_VAR_TERM_MAP, mb_multi_var_term_map(obj));
        funcall(visitor_fn, obj, $SLOT, $SIMPLE_VAR_TERM_MAP, mb_simple_var_term_map(obj));
        funcall(visitor_fn, obj, $SLOT, $DEGENERATE_, mb_degenerateP(obj));
        funcall(visitor_fn, obj, $END, MAKE_MBINDING, THREE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_mbinding_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_mbinding(obj, visitor_fn);
    }

    public static final SubLObject print_mb_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        format(stream, $str_alt31$__MB_);
        {
            SubLObject vars = mb_variables(v_object);
            if (NIL != vars) {
                {
                    SubLObject cdolist_list_var = vars;
                    SubLObject cur_var = NIL;
                    for (cur_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cur_var = cdolist_list_var.first()) {
                        format(stream, $str_alt32$_a_, cur_var);
                        {
                            SubLObject terms = mb_var_values(cur_var, v_object);
                            SubLObject n = length(terms);
                            format(stream, $str_alt33$_a, n);
                        }
                    }
                    format(stream, $str_alt34$_);
                }
            } else {
                format(stream, $str_alt35$empty_);
            }
        }
        return NIL;
    }

    public static SubLObject print_mb(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str37$__MB_);
        final SubLObject vars = mb_variables(v_object);
        if (NIL != vars) {
            SubLObject cdolist_list_var = vars;
            SubLObject cur_var = NIL;
            cur_var = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                format(stream, $str38$_a_, cur_var);
                final SubLObject terms = mb_var_values(cur_var, v_object);
                final SubLObject n = length(terms);
                format(stream, $str39$_a, n);
                cdolist_list_var = cdolist_list_var.rest();
                cur_var = cdolist_list_var.first();
            } 
            format(stream, $str40$_);
        } else {
            format(stream, $str41$empty_);
        }
        return NIL;
    }

    public static final SubLObject create_mb_alt() {
        {
            SubLObject new_mbind = make_mbinding(UNPROVIDED);
            _csetf_mb_multi_var_term_map(new_mbind, dictionary.new_dictionary(symbol_function(EQL), TEN_INTEGER));
            _csetf_mb_simple_var_term_map(new_mbind, dictionary.new_dictionary(symbol_function(EQL), TEN_INTEGER));
            return new_mbind;
        }
    }

    public static SubLObject create_mb() {
        final SubLObject new_mbind = make_mbinding(UNPROVIDED);
        _csetf_mb_multi_var_term_map(new_mbind, dictionary.new_dictionary(symbol_function(EQL), TEN_INTEGER));
        _csetf_mb_simple_var_term_map(new_mbind, dictionary.new_dictionary(symbol_function(EQL), TEN_INTEGER));
        return new_mbind;
    }

    public static final SubLObject empty_mb_alt() {
        return create_mb();
    }

    public static SubLObject empty_mb() {
        return create_mb();
    }

    public static final SubLObject copy_mb_alt(SubLObject mb) {
        {
            SubLObject new_mb = make_mbinding(UNPROVIDED);
            _csetf_mb_multi_var_term_map(new_mb, dictionary_utilities.copy_dictionary(mb_multi_var_term_map(mb)));
            _csetf_mb_simple_var_term_map(new_mb, dictionary_utilities.copy_dictionary(mb_simple_var_term_map(mb)));
            return new_mb;
        }
    }

    public static SubLObject copy_mb(final SubLObject mb) {
        final SubLObject new_mb = make_mbinding(UNPROVIDED);
        _csetf_mb_multi_var_term_map(new_mb, dictionary_utilities.copy_dictionary(mb_multi_var_term_map(mb)));
        _csetf_mb_simple_var_term_map(new_mb, dictionary_utilities.copy_dictionary(mb_simple_var_term_map(mb)));
        return new_mb;
    }

    public static final SubLObject mb_multi_variables_alt(SubLObject mb) {
        return dictionary.dictionary_keys(mb_multi_var_term_map(mb));
    }

    public static SubLObject mb_multi_variables(final SubLObject mb) {
        return dictionary.dictionary_keys(mb_multi_var_term_map(mb));
    }

    public static final SubLObject mb_simple_variables_alt(SubLObject mb) {
        return dictionary.dictionary_keys(mb_simple_var_term_map(mb));
    }

    public static SubLObject mb_simple_variables(final SubLObject mb) {
        return dictionary.dictionary_keys(mb_simple_var_term_map(mb));
    }

    public static final SubLObject mb_variables_alt(SubLObject mb) {
        return append(mb_multi_variables(mb), mb_simple_variables(mb));
    }

    public static SubLObject mb_variables(final SubLObject mb) {
        return append(mb_multi_variables(mb), mb_simple_variables(mb));
    }

    public static final SubLObject mb_multi_var_entry_alt(SubLObject var, SubLObject mb) {
        return dictionary.dictionary_lookup(mb_multi_var_term_map(mb), var, UNPROVIDED);
    }

    public static SubLObject mb_multi_var_entry(final SubLObject var, final SubLObject mb) {
        return dictionary.dictionary_lookup(mb_multi_var_term_map(mb), var, UNPROVIDED);
    }

    public static final SubLObject mb_multi_var_values_alt(SubLObject var, SubLObject mb) {
        return Mapping.mapcar(symbol_function(FIRST), mb_multi_var_entry(var, mb));
    }

    public static SubLObject mb_multi_var_values(final SubLObject var, final SubLObject mb) {
        return Mapping.mapcar(symbol_function(FIRST), mb_multi_var_entry(var, mb));
    }

    public static final SubLObject mb_simple_var_entry_alt(SubLObject var, SubLObject mb) {
        return dictionary.dictionary_lookup(mb_simple_var_term_map(mb), var, UNPROVIDED);
    }

    public static SubLObject mb_simple_var_entry(final SubLObject var, final SubLObject mb) {
        return dictionary.dictionary_lookup(mb_simple_var_term_map(mb), var, UNPROVIDED);
    }

    public static final SubLObject mb_simple_var_values_alt(SubLObject var, SubLObject mb) {
        return Mapping.mapcar(symbol_function(FIRST), mb_simple_var_entry(var, mb));
    }

    public static SubLObject mb_simple_var_values(final SubLObject var, final SubLObject mb) {
        return Mapping.mapcar(symbol_function(FIRST), mb_simple_var_entry(var, mb));
    }

    public static final SubLObject mb_var_values_alt(SubLObject var, SubLObject mb) {
        {
            SubLObject result = mb_multi_var_values(var, mb);
            return NIL != result ? ((SubLObject) (result)) : mb_simple_var_values(var, mb);
        }
    }

    public static SubLObject mb_var_values(final SubLObject var, final SubLObject mb) {
        final SubLObject result = mb_multi_var_values(var, mb);
        return NIL != result ? result : mb_simple_var_values(var, mb);
    }

    public static final SubLObject mb_var_entry_alt(SubLObject var, SubLObject mb) {
        {
            SubLObject result = mb_multi_var_entry(var, mb);
            return NIL != result ? ((SubLObject) (result)) : mb_simple_var_entry(var, mb);
        }
    }

    public static SubLObject mb_var_entry(final SubLObject var, final SubLObject mb) {
        final SubLObject result = mb_multi_var_entry(var, mb);
        return NIL != result ? result : mb_simple_var_entry(var, mb);
    }

    public static final SubLObject mb_var_supports_alt(SubLObject var, SubLObject mb) {
        return Mapping.mapcar(symbol_function(SECOND), mb_var_entry(var, mb));
    }

    public static SubLObject mb_var_supports(final SubLObject var, final SubLObject mb) {
        return Mapping.mapcar(symbol_function(SECOND), mb_var_entry(var, mb));
    }

    public static final SubLObject mb_supports_alt(SubLObject mb) {
        {
            SubLObject supports = NIL;
            SubLObject cdolist_list_var = mb_variables(mb);
            SubLObject var = NIL;
            for (var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , var = cdolist_list_var.first()) {
                supports = apply(APPEND, cons(supports, mb_var_supports(var, mb)));
            }
            return supports;
        }
    }

    public static SubLObject mb_supports(final SubLObject mb) {
        SubLObject supports = NIL;
        SubLObject cdolist_list_var = mb_variables(mb);
        SubLObject var = NIL;
        var = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            supports = apply(APPEND, cons(supports, mb_var_supports(var, mb)));
            cdolist_list_var = cdolist_list_var.rest();
            var = cdolist_list_var.first();
        } 
        return supports;
    }

    public static final SubLObject set_mb_var_entry_alt(SubLObject mb, SubLObject var, SubLObject entry) {
        if (length(entry).numG(ONE_INTEGER)) {
            mb_promote_var_to_multi(var, mb);
            dictionary.dictionary_enter(mb_multi_var_term_map(mb), var, entry);
        } else {
            mb_promote_var_to_simple(var, mb);
            dictionary.dictionary_enter(mb_simple_var_term_map(mb), var, entry);
        }
        return NIL;
    }

    public static SubLObject set_mb_var_entry(final SubLObject mb, final SubLObject var, final SubLObject entry) {
        if (length(entry).numG(ONE_INTEGER)) {
            mb_promote_var_to_multi(var, mb);
            dictionary.dictionary_enter(mb_multi_var_term_map(mb), var, entry);
        } else {
            mb_promote_var_to_simple(var, mb);
            dictionary.dictionary_enter(mb_simple_var_term_map(mb), var, entry);
        }
        return NIL;
    }

    public static final SubLObject mb_var_push_alt(SubLObject mb, SubLObject var, SubLObject item) {
        if (NIL != mb_multi_variableP(var, mb)) {
            dictionary_utilities.dictionary_push(mb_multi_var_term_map(mb), var, item);
        } else {
            if (NIL != mb_simple_variableP(var, mb)) {
                mb_promote_var_to_multi(var, mb);
                dictionary_utilities.dictionary_push(mb_multi_var_term_map(mb), var, item);
            } else {
                dictionary_utilities.dictionary_push(mb_simple_var_term_map(mb), var, item);
            }
        }
        return NIL;
    }

    public static SubLObject mb_var_push(final SubLObject mb, final SubLObject var, final SubLObject item) {
        if (NIL != mb_multi_variableP(var, mb)) {
            dictionary_utilities.dictionary_push(mb_multi_var_term_map(mb), var, item);
        } else
            if (NIL != mb_simple_variableP(var, mb)) {
                mb_promote_var_to_multi(var, mb);
                dictionary_utilities.dictionary_push(mb_multi_var_term_map(mb), var, item);
            } else {
                dictionary_utilities.dictionary_push(mb_simple_var_term_map(mb), var, item);
            }

        return NIL;
    }

    public static final SubLObject mb_multi_variableP_alt(SubLObject var, SubLObject mb) {
        return mb_multi_var_values(var, mb);
    }

    public static SubLObject mb_multi_variableP(final SubLObject var, final SubLObject mb) {
        return mb_multi_var_values(var, mb);
    }

    public static final SubLObject mb_simple_variableP_alt(SubLObject var, SubLObject mb) {
        return mb_simple_var_values(var, mb);
    }

    public static SubLObject mb_simple_variableP(final SubLObject var, final SubLObject mb) {
        return mb_simple_var_values(var, mb);
    }

    public static final SubLObject mb_variableP_alt(SubLObject var, SubLObject mb) {
        return makeBoolean((NIL != mb_multi_variableP(var, mb)) || (NIL != mb_simple_variableP(var, mb)));
    }

    public static SubLObject mb_variableP(final SubLObject var, final SubLObject mb) {
        return makeBoolean((NIL != mb_multi_variableP(var, mb)) || (NIL != mb_simple_variableP(var, mb)));
    }

    public static final SubLObject mb_promote_var_to_simple_alt(SubLObject var, SubLObject mb) {
        {
            SubLObject values = mb_multi_var_entry(var, mb);
            dictionary.dictionary_enter(mb_simple_var_term_map(mb), var, values);
            dictionary.dictionary_remove(mb_multi_var_term_map(mb), var);
            return NIL;
        }
    }

    public static SubLObject mb_promote_var_to_simple(final SubLObject var, final SubLObject mb) {
        final SubLObject values = mb_multi_var_entry(var, mb);
        dictionary.dictionary_enter(mb_simple_var_term_map(mb), var, values);
        dictionary.dictionary_remove(mb_multi_var_term_map(mb), var);
        return NIL;
    }

    public static final SubLObject mb_promote_var_to_multi_alt(SubLObject var, SubLObject mb) {
        {
            SubLObject values = mb_simple_var_entry(var, mb);
            dictionary.dictionary_enter(mb_multi_var_term_map(mb), var, values);
            dictionary.dictionary_remove(mb_simple_var_term_map(mb), var);
            return NIL;
        }
    }

    public static SubLObject mb_promote_var_to_multi(final SubLObject var, final SubLObject mb) {
        final SubLObject values = mb_simple_var_entry(var, mb);
        dictionary.dictionary_enter(mb_multi_var_term_map(mb), var, values);
        dictionary.dictionary_remove(mb_simple_var_term_map(mb), var);
        return NIL;
    }

    public static final SubLObject do_mbind_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt39);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject var = NIL;
                    SubLObject values = NIL;
                    SubLObject mb = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt39);
                    var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt39);
                    values = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt39);
                    mb = current.first();
                    current = current.rest();
                    {
                        SubLObject done = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt39);
                        current = current.rest();
                        if (NIL == current) {
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject entry = $sym40$ENTRY;
                                return list(PROGN, list(DO_DICTIONARY, list(var, entry, list(MB_MULTI_VAR_TERM_MAP, mb), done), listS(CLET, list(list(values, list(MAPCAR, $list_alt45, entry))), append(body, NIL))), list(PUNLESS, done, list(DO_DICTIONARY, list(var, entry, list(MB_SIMPLE_VAR_TERM_MAP, mb), done), listS(CLET, list(list(values, list(MAPCAR, $list_alt45, entry))), append(body, NIL)))));
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt39);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject do_mbind(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list45);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject values = NIL;
        SubLObject mb = NIL;
        destructuring_bind_must_consp(current, datum, $list45);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list45);
        values = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list45);
        mb = current.first();
        current = current.rest();
        final SubLObject done = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list45);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject entry = $sym46$ENTRY;
            return list(PROGN, list(DO_DICTIONARY, list(var, entry, list(MB_MULTI_VAR_TERM_MAP, mb), done), listS(CLET, list(list(values, list(MAPCAR, $list51, entry))), append(body, NIL))), list(PUNLESS, done, list(DO_DICTIONARY, list(var, entry, list(MB_SIMPLE_VAR_TERM_MAP, mb), done), listS(CLET, list(list(values, list(MAPCAR, $list51, entry))), append(body, NIL)))));
        }
        cdestructuring_bind_error(datum, $list45);
        return NIL;
    }

    public static final SubLObject do_mbind_var_extents_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt47);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject var = NIL;
                    SubLObject extent = NIL;
                    SubLObject mb = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt47);
                    var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt47);
                    extent = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt47);
                    mb = current.first();
                    current = current.rest();
                    {
                        SubLObject done = (current.isCons()) ? ((SubLObject) (current.first())) : NIL;
                        destructuring_bind_must_listp(current, datum, $list_alt47);
                        current = current.rest();
                        if (NIL == current) {
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject entry = $sym48$ENTRY;
                                return list(PROGN, list(DO_DICTIONARY, list(var, entry, list(MB_MULTI_VAR_TERM_MAP, mb), done), listS(CLET, list(list(extent, list(VARIABLE_EXTENT_IN_MULTIBINDING, var, mb))), list(IGNORE, entry), append(body, NIL))), list(PUNLESS, done, list(DO_DICTIONARY, list(var, entry, list(MB_SIMPLE_VAR_TERM_MAP, mb), done), listS(CLET, list(list(extent, list(VARIABLE_EXTENT_IN_MULTIBINDING, var, mb))), list(IGNORE, entry), append(body, NIL)))));
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list_alt47);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject do_mbind_var_extents(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list53);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject var = NIL;
        SubLObject extent = NIL;
        SubLObject mb = NIL;
        destructuring_bind_must_consp(current, datum, $list53);
        var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list53);
        extent = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list53);
        mb = current.first();
        current = current.rest();
        final SubLObject done = (current.isCons()) ? current.first() : NIL;
        destructuring_bind_must_listp(current, datum, $list53);
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject entry = $sym54$ENTRY;
            return list(PROGN, list(DO_DICTIONARY, list(var, entry, list(MB_MULTI_VAR_TERM_MAP, mb), done), listS(CLET, list(list(extent, list(VARIABLE_EXTENT_IN_MULTIBINDING, var, mb))), list(IGNORE, entry), append(body, NIL))), list(PUNLESS, done, list(DO_DICTIONARY, list(var, entry, list(MB_SIMPLE_VAR_TERM_MAP, mb), done), listS(CLET, list(list(extent, list(VARIABLE_EXTENT_IN_MULTIBINDING, var, mb))), list(IGNORE, entry), append(body, NIL)))));
        }
        cdestructuring_bind_error(datum, $list53);
        return NIL;
    }

    public static final SubLObject mb_simple_binding_alt(SubLObject mb) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject blist = NIL;
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mb_simple_var_term_map(mb)));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject entry = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        blist = cons(cons(var, entry.first().first()), blist);
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                return blist;
            }
        }
    }

    public static SubLObject mb_simple_binding(final SubLObject mb) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject blist = NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mb_simple_var_term_map(mb))); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject entry = thread.secondMultipleValue();
            thread.resetMultipleValues();
            blist = cons(cons(var, entry.first().first()), blist);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return blist;
    }

    /**
     * Prints a multiline string that represents MB.
     */
    @LispMethod(comment = "Prints a multiline string that represents MB.")
    public static final SubLObject mb_string_alt(SubLObject mb) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject obj_string = $str_alt51$;
                {
                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mb_multi_var_term_map(mb)));
                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            SubLObject entry = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            {
                                SubLObject values = Mapping.mapcar(symbol_function(FIRST), entry);
                                obj_string = cconcatenate(obj_string, format(NIL, $str_alt52$___s____, var));
                                {
                                    SubLObject cdolist_list_var = values;
                                    SubLObject cur_val = NIL;
                                    for (cur_val = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cur_val = cdolist_list_var.first()) {
                                        obj_string = cconcatenate(obj_string, format(NIL, $str_alt12$__s, cur_val));
                                    }
                                }
                            }
                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                        }
                    } 
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                }
                {
                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mb_simple_var_term_map(mb)));
                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            SubLObject entry = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            {
                                SubLObject values = Mapping.mapcar(symbol_function(FIRST), entry);
                                obj_string = cconcatenate(obj_string, format(NIL, $str_alt52$___s____, var));
                                {
                                    SubLObject cdolist_list_var = values;
                                    SubLObject cur_val = NIL;
                                    for (cur_val = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cur_val = cdolist_list_var.first()) {
                                        obj_string = cconcatenate(obj_string, format(NIL, $str_alt12$__s, cur_val));
                                    }
                                }
                            }
                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                        }
                    } 
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                }
                return obj_string;
            }
        }
    }

    @LispMethod(comment = "Prints a multiline string that represents MB.")
    public static SubLObject mb_string(final SubLObject mb) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject obj_string = $str57$;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mb_multi_var_term_map(mb))); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject entry = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject values = Mapping.mapcar(symbol_function(FIRST), entry);
            obj_string = cconcatenate(obj_string, format(NIL, $str58$___s____, var));
            SubLObject cdolist_list_var = values;
            SubLObject cur_val = NIL;
            cur_val = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                obj_string = cconcatenate(obj_string, format(NIL, $str12$__s, cur_val));
                cdolist_list_var = cdolist_list_var.rest();
                cur_val = cdolist_list_var.first();
            } 
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mb_simple_var_term_map(mb))); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject entry = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject values = Mapping.mapcar(symbol_function(FIRST), entry);
            obj_string = cconcatenate(obj_string, format(NIL, $str58$___s____, var));
            SubLObject cdolist_list_var = values;
            SubLObject cur_val = NIL;
            cur_val = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                obj_string = cconcatenate(obj_string, format(NIL, $str12$__s, cur_val));
                cdolist_list_var = cdolist_list_var.rest();
                cur_val = cdolist_list_var.first();
            } 
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return obj_string;
    }/**
     * Prints a multiline string that represents MB.
     */


    public static final SubLObject mb_add_bindings_alt(SubLObject mb, SubLObject v_bindings) {
        return mb_add_bindings_and_supports(mb, v_bindings, NIL);
    }

    public static SubLObject mb_add_bindings(final SubLObject mb, final SubLObject v_bindings) {
        return mb_add_bindings_and_supports(mb, v_bindings, NIL);
    }

    /**
     * Resets entry for VAR to have only the value VALUE with
     * the combined supports of the old entry and SUPPORTS.
     */
    @LispMethod(comment = "Resets entry for VAR to have only the value VALUE with\r\nthe combined supports of the old entry and SUPPORTS.\nResets entry for VAR to have only the value VALUE with\nthe combined supports of the old entry and SUPPORTS.")
    public static final SubLObject mb_add_supports_to_value_alt(SubLObject mb, SubLObject var, SubLObject value, SubLObject new_supports) {
        {
            SubLObject entry = mb_var_entry(var, mb);
            SubLObject datum = member(value, entry, symbol_function(EQUAL), symbol_function(CAR)).first();
            SubLObject current = datum;
            SubLObject value_3 = NIL;
            SubLObject old_supports = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt54);
            value_3 = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt54);
            old_supports = current.first();
            current = current.rest();
            if (NIL == current) {
                set_mb_var_entry(mb, var, list(list(value_3, append(old_supports, new_supports))));
            } else {
                cdestructuring_bind_error(datum, $list_alt54);
            }
            return NIL;
        }
    }

    @LispMethod(comment = "Resets entry for VAR to have only the value VALUE with\r\nthe combined supports of the old entry and SUPPORTS.\nResets entry for VAR to have only the value VALUE with\nthe combined supports of the old entry and SUPPORTS.")
    public static SubLObject mb_add_supports_to_value(final SubLObject mb, final SubLObject var, final SubLObject value, final SubLObject new_supports) {
        final SubLObject entry = mb_var_entry(var, mb);
        SubLObject current;
        final SubLObject datum = current = member(value, entry, symbol_function(EQUAL), symbol_function(CAR)).first();
        SubLObject value_$3 = NIL;
        SubLObject old_supports = NIL;
        destructuring_bind_must_consp(current, datum, $list60);
        value_$3 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list60);
        old_supports = current.first();
        current = current.rest();
        if (NIL == current) {
            set_mb_var_entry(mb, var, list(list(value_$3, append(old_supports, new_supports))));
        } else {
            cdestructuring_bind_error(datum, $list60);
        }
        return NIL;
    }/**
     * Resets entry for VAR to have only the value VALUE with
     * the combined supports of the old entry and SUPPORTS.
     */


    public static final SubLObject mb_add_bindings_and_supports_alt(SubLObject mb, SubLObject v_bindings, SubLObject supports) {
        {
            SubLObject new_mb = copy_mb(mb);
            SubLObject cdolist_list_var = v_bindings;
            SubLObject bpair = NIL;
            for (bpair = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , bpair = cdolist_list_var.first()) {
                {
                    SubLObject var = bpair.first();
                    SubLObject value = bpair.rest();
                    if (NIL != mb_variableP(var, new_mb)) {
                        {
                            SubLObject values = mb_var_values(var, new_mb);
                            if (NIL != member(value, values, symbol_function(EQUAL), UNPROVIDED)) {
                                mb_add_supports_to_value(new_mb, var, value, supports);
                            } else {
                                if (NIL != cycl_variables.el_varP(value)) {
                                    {
                                        SubLObject values_2 = mb_var_values(value, new_mb);
                                        set_mb_var_entry(new_mb, value, mb_make_entry_with_null_supports(intersection(values, values_2, symbol_function(EQUAL), UNPROVIDED)));
                                        set_mb_var_entry(new_mb, var, list(list(value, NIL)));
                                    }
                                } else {
                                    return multibinding_fail_token();
                                }
                            }
                        }
                    } else {
                        mb_var_push(new_mb, var, list(value, supports));
                    }
                }
            }
            return new_mb;
        }
    }

    public static SubLObject mb_add_bindings_and_supports(final SubLObject mb, final SubLObject v_bindings, final SubLObject supports) {
        final SubLObject new_mb = copy_mb(mb);
        SubLObject cdolist_list_var = v_bindings;
        SubLObject bpair = NIL;
        bpair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject var = bpair.first();
            final SubLObject value = bpair.rest();
            if (NIL != mb_variableP(var, new_mb)) {
                final SubLObject values = mb_var_values(var, new_mb);
                if (NIL != member(value, values, symbol_function(EQUAL), UNPROVIDED)) {
                    mb_add_supports_to_value(new_mb, var, value, supports);
                } else {
                    if (NIL == cycl_variables.el_varP(value)) {
                        return multibinding_fail_token();
                    }
                    final SubLObject values_2 = mb_var_values(value, new_mb);
                    set_mb_var_entry(new_mb, value, mb_make_entry_with_null_supports(intersection(values, values_2, symbol_function(EQUAL), UNPROVIDED)));
                    set_mb_var_entry(new_mb, var, list(list(value, NIL)));
                }
            } else {
                mb_var_push(new_mb, var, list(value, supports));
            }
            cdolist_list_var = cdolist_list_var.rest();
            bpair = cdolist_list_var.first();
        } 
        return new_mb;
    }

    public static final SubLObject mb_add_blist_and_supports_entry_alt(SubLObject mb, SubLObject entry) {
        return apply(MB_ADD_BINDINGS_AND_SUPPORTS, cons(mb, entry));
    }

    public static SubLObject mb_add_blist_and_supports_entry(final SubLObject mb, final SubLObject entry) {
        return apply(MB_ADD_BINDINGS_AND_SUPPORTS, cons(mb, entry));
    }

    public static final SubLObject make_mbinds_from_binding_lists_alt(SubLObject binding_lists, SubLObject old_mb) {
        {
            SubLObject v_answer = NIL;
            SubLObject mb = NIL;
            SubLObject cdolist_list_var = mb_collapse_multiple_proof_bindings(binding_lists);
            SubLObject blist = NIL;
            for (blist = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , blist = cdolist_list_var.first()) {
                mb = copy_mb(old_mb);
                mb = mb_add_blist_and_supports_entry(mb, blist);
                if (NIL == multibinding_failedP(mb)) {
                    v_answer = cons(mb, v_answer);
                }
            }
            return v_answer;
        }
    }

    public static SubLObject make_mbinds_from_binding_lists(final SubLObject binding_lists, final SubLObject old_mb) {
        SubLObject v_answer = NIL;
        SubLObject mb = NIL;
        SubLObject cdolist_list_var = mb_collapse_multiple_proof_bindings(binding_lists);
        SubLObject blist = NIL;
        blist = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            mb = copy_mb(old_mb);
            mb = mb_add_blist_and_supports_entry(mb, blist);
            if (NIL == multibinding_failedP(mb)) {
                v_answer = cons(mb, v_answer);
            }
            cdolist_list_var = cdolist_list_var.rest();
            blist = cdolist_list_var.first();
        } 
        return v_answer;
    }

    public static final SubLObject gather_bound_vars_in_blists_and_supports_alt(SubLObject binding_lists) {
        {
            SubLObject var_list = NIL;
            SubLObject cdolist_list_var = binding_lists;
            SubLObject cur_entry = NIL;
            for (cur_entry = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cur_entry = cdolist_list_var.first()) {
                {
                    SubLObject cdolist_list_var_4 = cur_entry.first();
                    SubLObject cur_pair = NIL;
                    for (cur_pair = cdolist_list_var_4.first(); NIL != cdolist_list_var_4; cdolist_list_var_4 = cdolist_list_var_4.rest() , cur_pair = cdolist_list_var_4.first()) {
                        {
                            SubLObject item_var = cur_pair.first();
                            if (NIL == member(item_var, var_list, symbol_function(EQL), symbol_function(IDENTITY))) {
                                var_list = cons(item_var, var_list);
                            }
                        }
                    }
                }
            }
            return var_list;
        }
    }

    public static SubLObject gather_bound_vars_in_blists_and_supports(final SubLObject binding_lists) {
        SubLObject var_list = NIL;
        SubLObject cdolist_list_var = binding_lists;
        SubLObject cur_entry = NIL;
        cur_entry = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$4 = cur_entry.first();
            SubLObject cur_pair = NIL;
            cur_pair = cdolist_list_var_$4.first();
            while (NIL != cdolist_list_var_$4) {
                final SubLObject item_var = cur_pair.first();
                if (NIL == member(item_var, var_list, symbol_function(EQL), symbol_function(IDENTITY))) {
                    var_list = cons(item_var, var_list);
                }
                cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                cur_pair = cdolist_list_var_$4.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            cur_entry = cdolist_list_var.first();
        } 
        return var_list;
    }

    public static final SubLObject mb_reifiable_natP_alt(SubLObject nat) {
        if (NIL != obsolete.reifiable_natP(nat, UNPROVIDED, UNPROVIDED)) {
            if (NIL != czer_utilities.el_find_nart(nat)) {
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject mb_reifiable_natP(final SubLObject nat) {
        if ((NIL != obsolete.reifiable_natP(nat, UNPROVIDED, UNPROVIDED)) && (NIL != czer_utilities.el_find_nart(nat))) {
            return T;
        }
        return NIL;
    }

    /**
     *
     *
     * @return nart-p for NAT (if it exists) or NAT otherwise.
     */
    @LispMethod(comment = "@return nart-p for NAT (if it exists) or NAT otherwise.")
    public static final SubLObject mb_find_nart_or_naut_alt(SubLObject nat) {
        {
            SubLObject nart = czer_utilities.el_find_nart(nat);
            if (NIL != nart) {
                return nart;
            }
            return nat;
        }
    }

    /**
     *
     *
     * @return nart-p for NAT (if it exists) or NAT otherwise.
     */
    @LispMethod(comment = "@return nart-p for NAT (if it exists) or NAT otherwise.")
    public static SubLObject mb_find_nart_or_naut(final SubLObject nat) {
        final SubLObject nart = czer_utilities.el_find_nart(nat);
        if (NIL != nart) {
            return nart;
        }
        return nat;
    }

    /**
     *
     *
     * @param MBINDING
    multibinding-p
     * 		
     */
    @LispMethod(comment = "@param MBINDING\nmultibinding-p")
    public static final SubLObject multibinding_reify_nat_values_alt(SubLObject mb) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject done = NIL;
                {
                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mb_multi_var_term_map(mb)));
                    while (!((NIL != done) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))) {
                        thread.resetMultipleValues();
                        {
                            SubLObject cur_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            SubLObject entry = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            set_mb_var_entry(mb, cur_var, shop_basic_planner_thread.shop_reify_narts_in_expression(entry));
                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                        }
                    } 
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                }
                {
                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mb_simple_var_term_map(mb)));
                    while (!((NIL != done) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))) {
                        thread.resetMultipleValues();
                        {
                            SubLObject cur_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            SubLObject entry = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            set_mb_var_entry(mb, cur_var, shop_basic_planner_thread.shop_reify_narts_in_expression(entry));
                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                        }
                    } 
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                }
                return mb;
            }
        }
    }

    /**
     *
     *
     * @param MBINDING
    multibinding-p
     * 		
     */
    @LispMethod(comment = "@param MBINDING\nmultibinding-p")
    public static SubLObject multibinding_reify_nat_values(final SubLObject mb) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject done;
        SubLObject iteration_state;
        for (done = NIL, iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mb_multi_var_term_map(mb))); (NIL == done) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject cur_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject entry = thread.secondMultipleValue();
            thread.resetMultipleValues();
            set_mb_var_entry(mb, cur_var, shop_basic_planner_thread.shop_reify_narts_in_expression(entry));
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mb_simple_var_term_map(mb))); (NIL == done) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject cur_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject entry = thread.secondMultipleValue();
            thread.resetMultipleValues();
            set_mb_var_entry(mb, cur_var, shop_basic_planner_thread.shop_reify_narts_in_expression(entry));
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return mb;
    }

    public static final SubLObject mb_collapse_multiple_proof_bindings_alt(SubLObject binding_lists) {
        {
            SubLObject alist = NIL;
            SubLObject blist = NIL;
            {
                SubLObject cdolist_list_var = binding_lists;
                SubLObject cur_binding = NIL;
                for (cur_binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cur_binding = cdolist_list_var.first()) {
                    {
                        SubLObject datum = cur_binding;
                        SubLObject current = datum;
                        SubLObject binding = NIL;
                        SubLObject supports = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt56);
                        binding = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list_alt56);
                        supports = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            SubLTrampolineFile.checkType(binding, BINDING_LIST_P);
                            alist = list_utilities.assoc_push(binding, supports, alist, symbol_function(EQUAL));
                        } else {
                            cdestructuring_bind_error(datum, $list_alt56);
                        }
                    }
                }
            }
            {
                SubLObject cdolist_list_var = alist;
                SubLObject cons = NIL;
                for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cons = cdolist_list_var.first()) {
                    {
                        SubLObject datum = cons;
                        SubLObject current = datum;
                        SubLObject binding = NIL;
                        SubLObject supports_list = NIL;
                        destructuring_bind_must_consp(current, datum, $list_alt58);
                        binding = current.first();
                        current = current.rest();
                        supports_list = current;
                        blist = cons(list(binding, remove_duplicates(apply(symbol_function(APPEND), supports_list.first()), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED)), blist);
                    }
                }
            }
            return blist;
        }
    }

    public static SubLObject mb_collapse_multiple_proof_bindings(final SubLObject binding_lists) {
        SubLObject alist = NIL;
        SubLObject blist = NIL;
        SubLObject cdolist_list_var = binding_lists;
        SubLObject cur_binding = NIL;
        cur_binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cur_binding;
            SubLObject binding = NIL;
            SubLObject supports = NIL;
            destructuring_bind_must_consp(current, datum, $list62);
            binding = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list62);
            supports = current.first();
            current = current.rest();
            if (NIL == current) {
                assert NIL != bindings.binding_list_p(binding) : "! bindings.binding_list_p(binding) " + ("bindings.binding_list_p(binding) " + "CommonSymbols.NIL != bindings.binding_list_p(binding) ") + binding;
                alist = list_utilities.assoc_push(binding, supports, alist, symbol_function(EQUAL));
            } else {
                cdestructuring_bind_error(datum, $list62);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cur_binding = cdolist_list_var.first();
        } 
        cdolist_list_var = alist;
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject binding = NIL;
            SubLObject supports_list = NIL;
            destructuring_bind_must_consp(current, datum, $list64);
            binding = current.first();
            current = supports_list = current.rest();
            blist = cons(list(binding, remove_duplicates(apply(symbol_function(APPEND), supports_list.first()), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED)), blist);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        return blist;
    }

    public static final SubLObject convert_binding_lists_and_supports_to_mbinds_alt(SubLObject binding_lists, SubLObject mbind, SubLObject bound_variables) {
        if (bound_variables == UNPROVIDED) {
            bound_variables = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == bound_variables) {
                bound_variables = gather_bound_vars_in_blists_and_supports(binding_lists);
            }
            {
                SubLObject variable_count = list_length(bound_variables);
                SubLObject v_answer = NIL;
                SubLObject mb = NIL;
                if (ONE_INTEGER.numE(variable_count) || ZERO_INTEGER.numE(variable_count)) {
                    if (NIL != binding_lists) {
                        v_answer = list(mbind);
                    } else {
                        v_answer = NIL;
                    }
                } else {
                    mb = make_mbinds_from_binding_lists(binding_lists, mbind);
                    v_answer = collate_multibindings_totally(mb);
                }
                if (v_answer.isList() && (NIL != $mb_reify_natsP$.getDynamicValue(thread))) {
                    v_answer = Mapping.mapcar(MULTIBINDING_REIFY_NAT_VALUES, v_answer);
                }
                return v_answer;
            }
        }
    }

    public static SubLObject convert_binding_lists_and_supports_to_mbinds(final SubLObject binding_lists, final SubLObject mbind, SubLObject bound_variables) {
        if (bound_variables == UNPROVIDED) {
            bound_variables = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == bound_variables) {
            bound_variables = gather_bound_vars_in_blists_and_supports(binding_lists);
        }
        final SubLObject variable_count = list_length(bound_variables);
        SubLObject v_answer = NIL;
        SubLObject mb = NIL;
        if (ONE_INTEGER.numE(variable_count) || ZERO_INTEGER.numE(variable_count)) {
            if (NIL != binding_lists) {
                v_answer = list(mbind);
            } else {
                v_answer = NIL;
            }
        } else {
            mb = make_mbinds_from_binding_lists(binding_lists, mbind);
            v_answer = collate_multibindings_totally(mb);
        }
        if (v_answer.isList() && (NIL != $mb_reify_natsP$.getDynamicValue(thread))) {
            v_answer = Mapping.mapcar(MULTIBINDING_REIFY_NAT_VALUES, v_answer);
        }
        return v_answer;
    }

    public static final SubLObject convert_binding_lists_to_mbinds_alt(SubLObject v_bindings, SubLObject mbind) {
        if (mbind == UNPROVIDED) {
            mbind = empty_mb();
        }
        {
            SubLObject bindings_with_emtpy_supports = NIL;
            SubLObject cdolist_list_var = v_bindings;
            SubLObject binding = NIL;
            for (binding = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding = cdolist_list_var.first()) {
                bindings_with_emtpy_supports = cons(list(binding, NIL), bindings_with_emtpy_supports);
            }
            return convert_binding_lists_and_supports_to_mbinds(bindings_with_emtpy_supports, mbind, UNPROVIDED);
        }
    }

    public static SubLObject convert_binding_lists_to_mbinds(final SubLObject v_bindings, SubLObject mbind) {
        if (mbind == UNPROVIDED) {
            mbind = empty_mb();
        }
        SubLObject bindings_with_emtpy_supports = NIL;
        SubLObject cdolist_list_var = v_bindings;
        SubLObject binding = NIL;
        binding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            bindings_with_emtpy_supports = cons(list(binding, NIL), bindings_with_emtpy_supports);
            cdolist_list_var = cdolist_list_var.rest();
            binding = cdolist_list_var.first();
        } 
        return convert_binding_lists_and_supports_to_mbinds(bindings_with_emtpy_supports, mbind, UNPROVIDED);
    }

    public static final SubLObject convert_binding_to_mbind_alt(SubLObject binding, SubLObject mbind) {
        {
            SubLObject result = NIL;
            SubLObject ls = convert_binding_lists_and_supports_to_mbinds(list(list(binding, NIL)), mbind, UNPROVIDED);
            if (NIL != list_utilities.singletonP(ls)) {
                result = ls.first();
            }
            return result;
        }
    }

    public static SubLObject convert_binding_to_mbind(final SubLObject binding, final SubLObject mbind) {
        SubLObject result = NIL;
        final SubLObject ls = convert_binding_lists_and_supports_to_mbinds(list(list(binding, NIL)), mbind, UNPROVIDED);
        if (NIL != list_utilities.singletonP(ls)) {
            result = ls.first();
        }
        return result;
    }

    /**
     *
     *
     * @param MBINDINGS
     * 		listp ;; of multibinding-p
     */
    @LispMethod(comment = "@param MBINDINGS\r\n\t\tlistp ;; of multibinding-p")
    public static final SubLObject collate_multibindings_totally_alt(SubLObject mbindings) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject not_doneP = T;
                SubLObject cur_mbindings = NIL;
                for (cur_mbindings = mbindings; NIL != not_doneP; cur_mbindings = cur_mbindings) {
                    thread.resetMultipleValues();
                    {
                        SubLObject cur_mbindings_5 = collate_mb_list(cur_mbindings);
                        SubLObject not_doneP_6 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        cur_mbindings = cur_mbindings_5;
                        not_doneP = not_doneP_6;
                    }
                }
                mbindings = cur_mbindings;
                return mbindings;
            }
        }
    }

    /**
     *
     *
     * @param MBINDINGS
     * 		listp ;; of multibinding-p
     */
    @LispMethod(comment = "@param MBINDINGS\r\n\t\tlistp ;; of multibinding-p")
    public static SubLObject collate_multibindings_totally(SubLObject mbindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject not_doneP = T;
        SubLObject cur_mbindings = NIL;
        cur_mbindings = mbindings;
        while (NIL != not_doneP) {
            thread.resetMultipleValues();
            final SubLObject cur_mbindings_$5 = collate_mb_list(cur_mbindings);
            final SubLObject not_doneP_$6 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            cur_mbindings = cur_mbindings_$5;
            not_doneP = not_doneP_$6;
            // cur_mbindings = cur_mbindings;
        } 
        mbindings = cur_mbindings;
        return mbindings;
    }

    /**
     *
     *
     * @param MBINDING1
    multibinding-p
     * 		
     * @param MBINDING2
    multibinding-p
     * 		
     * @return (cor el-var? booleanp)
    If MBINDING1 and MBINDING2 are identical in all but one variable, return
    that variable, o/w return nil.
     */
    @LispMethod(comment = "@param MBINDING1\nmultibinding-p\r\n\t\t\r\n@param MBINDING2\nmultibinding-p\r\n\t\t\r\n@return (cor el-var? booleanp)\r\nIf MBINDING1 and MBINDING2 are identical in all but one variable, return\r\nthat variable, o/w return nil.")
    public static final SubLObject only_variable_different_alt(SubLObject mbinding1, SubLObject mbinding2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject any_differentP = NIL;
                SubLObject many_differentP = NIL;
                SubLObject different_var = NIL;
                {
                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mb_multi_var_term_map(mbinding1)));
                    while (!((NIL != many_differentP) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))) {
                        thread.resetMultipleValues();
                        {
                            SubLObject cur_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            SubLObject entry = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            {
                                SubLObject cur_values = Mapping.mapcar(symbol_function(FIRST), entry);
                                if (!cur_values.equal(mb_var_values(cur_var, mbinding2))) {
                                    if (NIL != any_differentP) {
                                        many_differentP = T;
                                    } else {
                                        any_differentP = T;
                                        different_var = cur_var;
                                    }
                                }
                            }
                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                        }
                    } 
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                }
                if (NIL == many_differentP) {
                    {
                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mb_simple_var_term_map(mbinding1)));
                        while (!((NIL != many_differentP) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))) {
                            thread.resetMultipleValues();
                            {
                                SubLObject cur_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                SubLObject entry = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                {
                                    SubLObject cur_values = Mapping.mapcar(symbol_function(FIRST), entry);
                                    if (!cur_values.equal(mb_var_values(cur_var, mbinding2))) {
                                        if (NIL != any_differentP) {
                                            many_differentP = T;
                                        } else {
                                            any_differentP = T;
                                            different_var = cur_var;
                                        }
                                    }
                                }
                                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                            }
                        } 
                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                    }
                }
                return NIL == many_differentP ? ((SubLObject) (NIL != any_differentP ? ((SubLObject) (different_var)) : NIL)) : NIL;
            }
        }
    }

    /**
     *
     *
     * @param MBINDING1
    multibinding-p
     * 		
     * @param MBINDING2
    multibinding-p
     * 		
     * @return (cor el-var? booleanp)
    If MBINDING1 and MBINDING2 are identical in all but one variable, return
    that variable, o/w return nil.
     */
    @LispMethod(comment = "@param MBINDING1\nmultibinding-p\r\n\t\t\r\n@param MBINDING2\nmultibinding-p\r\n\t\t\r\n@return (cor el-var? booleanp)\r\nIf MBINDING1 and MBINDING2 are identical in all but one variable, return\r\nthat variable, o/w return nil.")
    public static SubLObject only_variable_different(final SubLObject mbinding1, final SubLObject mbinding2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject any_differentP = NIL;
        SubLObject many_differentP = NIL;
        SubLObject different_var = NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mb_multi_var_term_map(mbinding1))); (NIL == many_differentP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject cur_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject entry = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject cur_values = Mapping.mapcar(symbol_function(FIRST), entry);
            if (!cur_values.equal(mb_var_values(cur_var, mbinding2))) {
                if (NIL != any_differentP) {
                    many_differentP = T;
                } else {
                    any_differentP = T;
                    different_var = cur_var;
                }
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        if (NIL == many_differentP) {
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mb_simple_var_term_map(mbinding1))); (NIL == many_differentP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject cur_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject entry = thread.secondMultipleValue();
                thread.resetMultipleValues();
                final SubLObject cur_values = Mapping.mapcar(symbol_function(FIRST), entry);
                if (!cur_values.equal(mb_var_values(cur_var, mbinding2))) {
                    if (NIL != any_differentP) {
                        many_differentP = T;
                    } else {
                        any_differentP = T;
                        different_var = cur_var;
                    }
                }
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        }
        return NIL == many_differentP ? NIL != any_differentP ? different_var : NIL : NIL;
    }

    public static final SubLObject mb_entry_L_alt(SubLObject x, SubLObject y) {
        return terms_in_multibinding_orderP(x.first(), y.first());
    }

    public static SubLObject mb_entry_L(final SubLObject x, final SubLObject y) {
        return terms_in_multibinding_orderP(x.first(), y.first());
    }

    /**
     * Merge MB values in list sorted by Cycl term ordering.
     * This is useful in keeping the collating code fast.
     */
    @LispMethod(comment = "Merge MB values in list sorted by Cycl term ordering.\r\nThis is useful in keeping the collating code fast.\nMerge MB values in list sorted by Cycl term ordering.\nThis is useful in keeping the collating code fast.")
    public static final SubLObject mb_merge_entry_values_alt(SubLObject values1, SubLObject values2) {
        return mb_merge_entry_values_int(values1, values2, NIL);
    }

    @LispMethod(comment = "Merge MB values in list sorted by Cycl term ordering.\r\nThis is useful in keeping the collating code fast.\nMerge MB values in list sorted by Cycl term ordering.\nThis is useful in keeping the collating code fast.")
    public static SubLObject mb_merge_entry_values(final SubLObject values1, final SubLObject values2) {
        return mb_merge_entry_values_int(values1, values2, NIL);
    }/**
     * Merge MB values in list sorted by Cycl term ordering.
     * This is useful in keeping the collating code fast.
     */


    public static final SubLObject mb_merge_entry_values_int_alt(SubLObject values1, SubLObject values2, SubLObject merged_values) {
        {
            SubLObject new1 = NIL;
            SubLObject new2 = NIL;
            SubLObject new_merge = NIL;
            if ((NIL == values1) && (NIL == values2)) {
                return nreverse(merged_values);
            } else {
                if (NIL == values1) {
                    new2 = values2.rest();
                    new_merge = cons(values2.first(), merged_values);
                } else {
                    if (NIL == values2) {
                        new1 = values1.rest();
                        new_merge = cons(values1.first(), merged_values);
                    } else {
                        {
                            SubLObject val1 = values1.first();
                            SubLObject val2 = values2.first();
                            if (NIL != mb_entry_L(val1, val2)) {
                                new1 = values1.rest();
                                new2 = values2;
                                new_merge = cons(val1, merged_values);
                            } else {
                                new2 = values2.rest();
                                new1 = values1;
                                new_merge = cons(val2, merged_values);
                            }
                        }
                    }
                }
            }
            return mb_merge_entry_values_int(new1, new2, new_merge);
        }
    }

    public static SubLObject mb_merge_entry_values_int(final SubLObject values1, final SubLObject values2, final SubLObject merged_values) {
        SubLObject new1 = NIL;
        SubLObject new2 = NIL;
        SubLObject new_merge = NIL;
        if ((NIL == values1) && (NIL == values2)) {
            return nreverse(merged_values);
        }
        if (NIL == values1) {
            new2 = values2.rest();
            new_merge = cons(values2.first(), merged_values);
        } else
            if (NIL == values2) {
                new1 = values1.rest();
                new_merge = cons(values1.first(), merged_values);
            } else {
                final SubLObject val1 = values1.first();
                final SubLObject val2 = values2.first();
                if (NIL != mb_entry_L(val1, val2)) {
                    new1 = values1.rest();
                    new2 = values2;
                    new_merge = cons(val1, merged_values);
                } else {
                    new2 = values2.rest();
                    new1 = values1;
                    new_merge = cons(val2, merged_values);
                }
            }

        return mb_merge_entry_values_int(new1, new2, new_merge);
    }

    public static final SubLObject collate_mb_list_alt(SubLObject mbinds) {
        {
            SubLObject next_mbinds = subseq(mbinds, ZERO_INTEGER, ONE_INTEGER);
            SubLObject made_a_changeP = NIL;
            SubLObject doneP = NIL;
            SubLObject cdolist_list_var = mbinds.rest();
            SubLObject cur_mbind = NIL;
            for (cur_mbind = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cur_mbind = cdolist_list_var.first()) {
                doneP = NIL;
                if (NIL == doneP) {
                    {
                        SubLObject csome_list_var = next_mbinds;
                        SubLObject cur_next_mbind = NIL;
                        for (cur_next_mbind = csome_list_var.first(); !((NIL != doneP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , cur_next_mbind = csome_list_var.first()) {
                            {
                                SubLObject different_var = only_variable_different(cur_next_mbind, cur_mbind);
                                if (NIL != different_var) {
                                    {
                                        SubLObject cur_values = mb_var_entry(different_var, cur_mbind);
                                        SubLObject cur_next_values = mb_var_entry(different_var, cur_next_mbind);
                                        SubLObject new_values = mb_merge_entry_values(cur_values, cur_next_values);
                                        made_a_changeP = T;
                                        set_mb_var_entry(cur_next_mbind, different_var, new_values);
                                        doneP = T;
                                    }
                                }
                            }
                        }
                    }
                }
                if (NIL == doneP) {
                    next_mbinds = cons(cur_mbind, next_mbinds);
                }
            }
            return values(next_mbinds, made_a_changeP);
        }
    }

    public static SubLObject collate_mb_list(final SubLObject mbinds) {
        SubLObject next_mbinds = subseq(mbinds, ZERO_INTEGER, ONE_INTEGER);
        SubLObject made_a_changeP = NIL;
        SubLObject doneP = NIL;
        SubLObject cdolist_list_var = mbinds.rest();
        SubLObject cur_mbind = NIL;
        cur_mbind = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            doneP = NIL;
            if (NIL == doneP) {
                SubLObject csome_list_var = next_mbinds;
                SubLObject cur_next_mbind = NIL;
                cur_next_mbind = csome_list_var.first();
                while ((NIL == doneP) && (NIL != csome_list_var)) {
                    final SubLObject different_var = only_variable_different(cur_next_mbind, cur_mbind);
                    if (NIL != different_var) {
                        final SubLObject cur_values = mb_var_entry(different_var, cur_mbind);
                        final SubLObject cur_next_values = mb_var_entry(different_var, cur_next_mbind);
                        final SubLObject new_values = mb_merge_entry_values(cur_values, cur_next_values);
                        made_a_changeP = T;
                        set_mb_var_entry(cur_next_mbind, different_var, new_values);
                        doneP = T;
                    }
                    csome_list_var = csome_list_var.rest();
                    cur_next_mbind = csome_list_var.first();
                } 
            }
            if (NIL == doneP) {
                next_mbinds = cons(cur_mbind, next_mbinds);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cur_mbind = cdolist_list_var.first();
        } 
        return values(next_mbinds, made_a_changeP);
    }

    public static final SubLObject mb_equivP_alt(SubLObject mbind1, SubLObject mbind2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mb_multi_var_term_map(mbind1)));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject entry = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject values1 = Mapping.mapcar(symbol_function(FIRST), entry);
                            SubLObject values2 = mb_var_values(var, mbind2);
                            if (NIL == subsetp(values1, values2, symbol_function(EQUAL), UNPROVIDED)) {
                                return NIL;
                            }
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            {
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mb_simple_var_term_map(mbind1)));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject entry = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject values1 = Mapping.mapcar(symbol_function(FIRST), entry);
                            SubLObject values2 = mb_var_values(var, mbind2);
                            if (NIL == subsetp(values1, values2, symbol_function(EQUAL), UNPROVIDED)) {
                                return NIL;
                            }
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            return T;
        }
    }

    public static SubLObject mb_equivP(final SubLObject mbind1, final SubLObject mbind2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mb_multi_var_term_map(mbind1))); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject entry = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject values1 = Mapping.mapcar(symbol_function(FIRST), entry);
            final SubLObject values2 = mb_var_values(var, mbind2);
            if (NIL == subsetp(values1, values2, symbol_function(EQUAL), UNPROVIDED)) {
                return NIL;
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mb_simple_var_term_map(mbind1))); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject entry = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject values1 = Mapping.mapcar(symbol_function(FIRST), entry);
            final SubLObject values2 = mb_var_values(var, mbind2);
            if (NIL == subsetp(values1, values2, symbol_function(EQUAL), UNPROVIDED)) {
                return NIL;
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return T;
    }

    /**
     *
     *
     * @param VAR
    el-var?
     * 		
     * @param MBINDING
    multibinding-p
     * 		
     * @return listp; list of all possible bindings of VAR in MBINDING.
     */
    @LispMethod(comment = "@param VAR\nel-var?\r\n\t\t\r\n@param MBINDING\nmultibinding-p\r\n\t\t\r\n@return listp; list of all possible bindings of VAR in MBINDING.")
    public static final SubLObject variable_extent_in_multibinding_alt(SubLObject var, SubLObject mbinding) {
        {
            SubLObject domain = NIL;
            SubLObject cdolist_list_var = mb_var_values(var, mbinding);
            SubLObject val = NIL;
            for (val = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , val = cdolist_list_var.first()) {
                if (NIL != cycl_variables.el_varP(val)) {
                    domain = append(variable_extent_in_multibinding(val, mbinding), domain);
                } else {
                    if (val.isAtom()) {
                        domain = cons(val, domain);
                    } else {
                        if (val.isCons()) {
                            domain = cons(val, domain);
                        }
                    }
                }
            }
            return domain;
        }
    }

    /**
     *
     *
     * @param VAR
    el-var?
     * 		
     * @param MBINDING
    multibinding-p
     * 		
     * @return listp; list of all possible bindings of VAR in MBINDING.
     */
    @LispMethod(comment = "@param VAR\nel-var?\r\n\t\t\r\n@param MBINDING\nmultibinding-p\r\n\t\t\r\n@return listp; list of all possible bindings of VAR in MBINDING.")
    public static SubLObject variable_extent_in_multibinding(final SubLObject var, final SubLObject mbinding) {
        SubLObject domain = NIL;
        SubLObject cdolist_list_var = mb_var_values(var, mbinding);
        SubLObject val = NIL;
        val = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != cycl_variables.el_varP(val)) {
                domain = append(variable_extent_in_multibinding(val, mbinding), domain);
            } else
                if (val.isAtom()) {
                    domain = cons(val, domain);
                } else
                    if (val.isCons()) {
                        domain = cons(val, domain);
                    }


            cdolist_list_var = cdolist_list_var.rest();
            val = cdolist_list_var.first();
        } 
        return domain;
    }

    /**
     *
     *
     * @param EXP
     * 		consp;  sentence to be bound
     * @param MBINDING
     * 		multibinding-p; multibinding to be applied
     * @return listp; list of resulting expressions
     */
    @LispMethod(comment = "@param EXP\r\n\t\tconsp;  sentence to be bound\r\n@param MBINDING\r\n\t\tmultibinding-p; multibinding to be applied\r\n@return listp; list of resulting expressions")
    public static final SubLObject apply_mb_alt(SubLObject exp, SubLObject mbinding) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == mbinding) {
                return list(exp);
            }
            {
                SubLObject answers = list(exp);
                SubLObject new_answers = NIL;
                {
                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mb_multi_var_term_map(mbinding)));
                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            SubLObject entry = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            {
                                SubLObject values = Mapping.mapcar(symbol_function(FIRST), entry);
                                SubLObject cdolist_list_var = answers;
                                SubLObject cur_exp = NIL;
                                for (cur_exp = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cur_exp = cdolist_list_var.first()) {
                                    if (NIL != subl_promotions.memberP(var, sentence_free_variables(cur_exp, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED)) {
                                        {
                                            SubLObject cdolist_list_var_7 = values;
                                            SubLObject val = NIL;
                                            for (val = cdolist_list_var_7.first(); NIL != cdolist_list_var_7; cdolist_list_var_7 = cdolist_list_var_7.rest() , val = cdolist_list_var_7.first()) {
                                                new_answers = append(new_answers, list(subst(val, var, cur_exp, UNPROVIDED, UNPROVIDED)));
                                            }
                                        }
                                    } else {
                                        new_answers = append(new_answers, list(cur_exp));
                                    }
                                }
                                answers = new_answers;
                                new_answers = NIL;
                            }
                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                        }
                    } 
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                }
                {
                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mb_simple_var_term_map(mbinding)));
                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                        thread.resetMultipleValues();
                        {
                            SubLObject var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                            SubLObject entry = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            {
                                SubLObject values = Mapping.mapcar(symbol_function(FIRST), entry);
                                SubLObject cdolist_list_var = answers;
                                SubLObject cur_exp = NIL;
                                for (cur_exp = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cur_exp = cdolist_list_var.first()) {
                                    if (NIL != subl_promotions.memberP(var, sentence_free_variables(cur_exp, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED)) {
                                        {
                                            SubLObject cdolist_list_var_8 = values;
                                            SubLObject val = NIL;
                                            for (val = cdolist_list_var_8.first(); NIL != cdolist_list_var_8; cdolist_list_var_8 = cdolist_list_var_8.rest() , val = cdolist_list_var_8.first()) {
                                                new_answers = append(new_answers, list(subst(val, var, cur_exp, UNPROVIDED, UNPROVIDED)));
                                            }
                                        }
                                    } else {
                                        new_answers = append(new_answers, list(cur_exp));
                                    }
                                }
                                answers = new_answers;
                                new_answers = NIL;
                            }
                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                        }
                    } 
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                }
                return answers;
            }
        }
    }

    /**
     *
     *
     * @param EXP
     * 		consp;  sentence to be bound
     * @param MBINDING
     * 		multibinding-p; multibinding to be applied
     * @return listp; list of resulting expressions
     */
    @LispMethod(comment = "@param EXP\r\n\t\tconsp;  sentence to be bound\r\n@param MBINDING\r\n\t\tmultibinding-p; multibinding to be applied\r\n@return listp; list of resulting expressions")
    public static SubLObject apply_mb(final SubLObject exp, final SubLObject mbinding) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == mbinding) {
            return list(exp);
        }
        SubLObject answers = list(exp);
        SubLObject new_answers = NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mb_multi_var_term_map(mbinding))); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject entry = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject values = Mapping.mapcar(symbol_function(FIRST), entry);
            SubLObject cdolist_list_var = answers;
            SubLObject cur_exp = NIL;
            cur_exp = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != subl_promotions.memberP(var, sentence_free_variables(cur_exp, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED)) {
                    SubLObject cdolist_list_var_$7 = values;
                    SubLObject val = NIL;
                    val = cdolist_list_var_$7.first();
                    while (NIL != cdolist_list_var_$7) {
                        new_answers = append(new_answers, list(subst(val, var, cur_exp, UNPROVIDED, UNPROVIDED)));
                        cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                        val = cdolist_list_var_$7.first();
                    } 
                } else {
                    new_answers = append(new_answers, list(cur_exp));
                }
                cdolist_list_var = cdolist_list_var.rest();
                cur_exp = cdolist_list_var.first();
            } 
            answers = new_answers;
            new_answers = NIL;
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mb_simple_var_term_map(mbinding))); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject entry = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject values = Mapping.mapcar(symbol_function(FIRST), entry);
            SubLObject cdolist_list_var = answers;
            SubLObject cur_exp = NIL;
            cur_exp = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != subl_promotions.memberP(var, sentence_free_variables(cur_exp, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED)) {
                    SubLObject cdolist_list_var_$8 = values;
                    SubLObject val = NIL;
                    val = cdolist_list_var_$8.first();
                    while (NIL != cdolist_list_var_$8) {
                        new_answers = append(new_answers, list(subst(val, var, cur_exp, UNPROVIDED, UNPROVIDED)));
                        cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                        val = cdolist_list_var_$8.first();
                    } 
                } else {
                    new_answers = append(new_answers, list(cur_exp));
                }
                cdolist_list_var = cdolist_list_var.rest();
                cur_exp = cdolist_list_var.first();
            } 
            answers = new_answers;
            new_answers = NIL;
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return answers;
    }

    public static final SubLObject mb_make_entry_with_null_supports_alt(SubLObject values) {
        return nreverse(list_utilities.make_pair_list(values, make_list(length(values), NIL)));
    }

    public static SubLObject mb_make_entry_with_null_supports(final SubLObject values) {
        return nreverse(list_utilities.make_pair_list(values, make_list(length(values), NIL)));
    }

    /**
     *
     *
     * @param VAR
    el-var?
     * 		
     * @param EXTENT
    listp
     * 		
     * @param MBINDING
    multibinding-p
     * 		
     */
    @LispMethod(comment = "@param VAR\nel-var?\r\n\t\t\r\n@param EXTENT\nlistp\r\n\t\t\r\n@param MBINDING\nmultibinding-p")
    public static final SubLObject propagate_variable_extent_in_multibinding_alt(SubLObject var, SubLObject extent, SubLObject mbinding) {
        if (NIL != mb_var_entry(var, mbinding)) {
            set_mb_var_entry(mbinding, var, mb_make_entry_with_null_supports(extent));
        } else {
            {
                SubLObject vals = mb_var_entry(var, mbinding);
                SubLObject new_vals = NIL;
                SubLObject cdolist_list_var = vals;
                SubLObject val = NIL;
                for (val = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , val = cdolist_list_var.first()) {
                    if (NIL != cycl_variables.el_varP(val.first())) {
                        new_vals = cons(val, new_vals);
                        mbinding = propagate_variable_extent_in_multibinding(val.first(), extent, mbinding);
                    } else {
                        if (NIL != member(val.first(), extent, symbol_function(EQUAL), UNPROVIDED)) {
                            new_vals = cons(val, new_vals);
                        }
                    }
                }
                set_mb_var_entry(mbinding, var, new_vals);
            }
        }
        return mbinding;
    }

    /**
     *
     *
     * @param VAR
    el-var?
     * 		
     * @param EXTENT
    listp
     * 		
     * @param MBINDING
    multibinding-p
     * 		
     */
    @LispMethod(comment = "@param VAR\nel-var?\r\n\t\t\r\n@param EXTENT\nlistp\r\n\t\t\r\n@param MBINDING\nmultibinding-p")
    public static SubLObject propagate_variable_extent_in_multibinding(final SubLObject var, final SubLObject extent, SubLObject mbinding) {
        if (NIL != mb_var_entry(var, mbinding)) {
            set_mb_var_entry(mbinding, var, mb_make_entry_with_null_supports(extent));
        } else {
            final SubLObject vals = mb_var_entry(var, mbinding);
            SubLObject new_vals = NIL;
            SubLObject cdolist_list_var = vals;
            SubLObject val = NIL;
            val = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != cycl_variables.el_varP(val.first())) {
                    new_vals = cons(val, new_vals);
                    mbinding = propagate_variable_extent_in_multibinding(val.first(), extent, mbinding);
                } else
                    if (NIL != member(val.first(), extent, symbol_function(EQUAL), UNPROVIDED)) {
                        new_vals = cons(val, new_vals);
                    }

                cdolist_list_var = cdolist_list_var.rest();
                val = cdolist_list_var.first();
            } 
            set_mb_var_entry(mbinding, var, new_vals);
        }
        return mbinding;
    }

    /**
     * Returns the difference between MBIND1 and MBIND2.
     *
     * @param MBIND1
    multibinding-p
     * 		
     * @param MBIND2
    multibinding-p
     * 		
     * @return multibinding-p.

    It is assumed that MBIND2 is a refinement of MBIND1.
     */
    @LispMethod(comment = "Returns the difference between MBIND1 and MBIND2.\r\n\r\n@param MBIND1\nmultibinding-p\r\n\t\t\r\n@param MBIND2\nmultibinding-p\r\n\t\t\r\n@return multibinding-p.\r\n\r\nIt is assumed that MBIND2 is a refinement of MBIND1.")
    public static final SubLObject mb_inverse_alt(SubLObject mbind1, SubLObject mbind2) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != mb_equivP(mbind1, mbind2)) {
                return multibinding_fail_token();
            }
            {
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mb_multi_var_term_map(mbind1)));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject cur_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject entry = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject extent1 = variable_extent_in_multibinding(cur_var, mbind1);
                            SubLObject extent2 = variable_extent_in_multibinding(cur_var, mbind2);
                            SubLObject extent_diff = set_difference(extent1, extent2, symbol_function(EQUAL), UNPROVIDED);
                            if (NIL == extent_diff) {
                                return multibinding_fail_token();
                            } else {
                                mbind1 = propagate_variable_extent_in_multibinding(cur_var, extent_diff, mbind1);
                            }
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            {
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mb_simple_var_term_map(mbind1)));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject cur_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject entry = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject extent1 = variable_extent_in_multibinding(cur_var, mbind1);
                            SubLObject extent2 = variable_extent_in_multibinding(cur_var, mbind2);
                            SubLObject extent_diff = set_difference(extent1, extent2, symbol_function(EQUAL), UNPROVIDED);
                            if (NIL == extent_diff) {
                                return multibinding_fail_token();
                            } else {
                                mbind1 = propagate_variable_extent_in_multibinding(cur_var, extent_diff, mbind1);
                            }
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            return mbind1;
        }
    }

    @LispMethod(comment = "Returns the difference between MBIND1 and MBIND2.\r\n\r\n@param MBIND1\n\t\tmultibinding-p\r\n\t\t\r\n@param MBIND2\n\t\tmultibinding-p\r\n\t\t\r\n@return multibinding-p.\r\n\r\nIt is assumed that MBIND2 is a refinement of MBIND1.")
    public static SubLObject mb_inverse(SubLObject mbind1, final SubLObject mbind2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != mb_equivP(mbind1, mbind2)) {
            return multibinding_fail_token();
        }
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mb_multi_var_term_map(mbind1))); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject cur_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject entry = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject extent1 = variable_extent_in_multibinding(cur_var, mbind1);
            final SubLObject extent2 = variable_extent_in_multibinding(cur_var, mbind2);
            final SubLObject extent_diff = set_difference(extent1, extent2, symbol_function(EQUAL), UNPROVIDED);
            if (NIL == extent_diff) {
                return multibinding_fail_token();
            }
            mbind1 = propagate_variable_extent_in_multibinding(cur_var, extent_diff, mbind1);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mb_simple_var_term_map(mbind1))); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject cur_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject entry = thread.secondMultipleValue();
            thread.resetMultipleValues();
            final SubLObject extent1 = variable_extent_in_multibinding(cur_var, mbind1);
            final SubLObject extent2 = variable_extent_in_multibinding(cur_var, mbind2);
            final SubLObject extent_diff = set_difference(extent1, extent2, symbol_function(EQUAL), UNPROVIDED);
            if (NIL == extent_diff) {
                return multibinding_fail_token();
            }
            mbind1 = propagate_variable_extent_in_multibinding(cur_var, extent_diff, mbind1);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return mbind1;
    }/**
     * Returns the difference between MBIND1 and MBIND2.
     *
     * @param MBIND1
    		multibinding-p
     * 		
     * @param MBIND2
    		multibinding-p
     * 		
     * @return multibinding-p.

    It is assumed that MBIND2 is a refinement of MBIND1.
     */


    /**
     *
     *
     * @param GENL-MBIND
    multbinding-p
     * 		
     * @param MBIND-LIST
     * 		listp ;; of multibinding-p
     * @return multibinding-p ;; the multibinding of all values
    in GENL-MBIND, not permitted in any member of MBIND-LIST.
     */
    @LispMethod(comment = "@param GENL-MBIND\nmultbinding-p\r\n\t\t\r\n@param MBIND-LIST\r\n\t\tlistp ;; of multibinding-p\r\n@return multibinding-p ;; the multibinding of all values\r\nin GENL-MBIND, not permitted in any member of MBIND-LIST.")
    public static final SubLObject multibinding_inverse_list_alt(SubLObject genl_mbind, SubLObject mbind_list) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mb_multi_var_term_map(genl_mbind)));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject cur_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject entry = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject cur_genl_extent = variable_extent_in_multibinding(cur_var, genl_mbind);
                            SubLObject extent_diff = cur_genl_extent;
                            SubLObject cdolist_list_var = mbind_list;
                            SubLObject cur_mbind = NIL;
                            for (cur_mbind = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cur_mbind = cdolist_list_var.first()) {
                                {
                                    SubLObject cur_spec_extent = variable_extent_in_multibinding(cur_var, cur_mbind);
                                    extent_diff = set_difference(extent_diff, cur_spec_extent, UNPROVIDED, UNPROVIDED);
                                }
                            }
                            if (NIL == extent_diff) {
                                return $multibinding_fail$.getGlobalValue();
                            } else {
                                genl_mbind = propagate_variable_extent_in_multibinding(cur_var, extent_diff, genl_mbind);
                            }
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            {
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mb_simple_var_term_map(genl_mbind)));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject cur_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject entry = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        {
                            SubLObject cur_genl_extent = variable_extent_in_multibinding(cur_var, genl_mbind);
                            SubLObject extent_diff = cur_genl_extent;
                            SubLObject cdolist_list_var = mbind_list;
                            SubLObject cur_mbind = NIL;
                            for (cur_mbind = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cur_mbind = cdolist_list_var.first()) {
                                {
                                    SubLObject cur_spec_extent = variable_extent_in_multibinding(cur_var, cur_mbind);
                                    extent_diff = set_difference(extent_diff, cur_spec_extent, UNPROVIDED, UNPROVIDED);
                                }
                            }
                            if (NIL == extent_diff) {
                                return $multibinding_fail$.getGlobalValue();
                            } else {
                                genl_mbind = propagate_variable_extent_in_multibinding(cur_var, extent_diff, genl_mbind);
                            }
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            }
            return genl_mbind;
        }
    }

    /**
     *
     *
     * @param GENL-MBIND
    multbinding-p
     * 		
     * @param MBIND-LIST
     * 		listp ;; of multibinding-p
     * @return multibinding-p ;; the multibinding of all values
    in GENL-MBIND, not permitted in any member of MBIND-LIST.
     */
    @LispMethod(comment = "@param GENL-MBIND\nmultbinding-p\r\n\t\t\r\n@param MBIND-LIST\r\n\t\tlistp ;; of multibinding-p\r\n@return multibinding-p ;; the multibinding of all values\r\nin GENL-MBIND, not permitted in any member of MBIND-LIST.")
    public static SubLObject multibinding_inverse_list(SubLObject genl_mbind, final SubLObject mbind_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mb_multi_var_term_map(genl_mbind))); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject cur_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject entry = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject extent_diff;
            final SubLObject cur_genl_extent = extent_diff = variable_extent_in_multibinding(cur_var, genl_mbind);
            SubLObject cdolist_list_var = mbind_list;
            SubLObject cur_mbind = NIL;
            cur_mbind = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject cur_spec_extent = variable_extent_in_multibinding(cur_var, cur_mbind);
                extent_diff = set_difference(extent_diff, cur_spec_extent, UNPROVIDED, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                cur_mbind = cdolist_list_var.first();
            } 
            if (NIL == extent_diff) {
                return $multibinding_fail$.getGlobalValue();
            }
            genl_mbind = propagate_variable_extent_in_multibinding(cur_var, extent_diff, genl_mbind);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mb_simple_var_term_map(genl_mbind))); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject cur_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject entry = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject extent_diff;
            final SubLObject cur_genl_extent = extent_diff = variable_extent_in_multibinding(cur_var, genl_mbind);
            SubLObject cdolist_list_var = mbind_list;
            SubLObject cur_mbind = NIL;
            cur_mbind = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject cur_spec_extent = variable_extent_in_multibinding(cur_var, cur_mbind);
                extent_diff = set_difference(extent_diff, cur_spec_extent, UNPROVIDED, UNPROVIDED);
                cdolist_list_var = cdolist_list_var.rest();
                cur_mbind = cdolist_list_var.first();
            } 
            if (NIL == extent_diff) {
                return $multibinding_fail$.getGlobalValue();
            }
            genl_mbind = propagate_variable_extent_in_multibinding(cur_var, extent_diff, genl_mbind);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return genl_mbind;
    }

    public static final SubLObject declare_multibindings_file_alt() {
        declareFunction("multibinding_fail_token", "MULTIBINDING-FAIL-TOKEN", 0, 0, false);
        declareFunction("multibinding_failedP", "MULTIBINDING-FAILED?", 1, 0, false);
        declareFunction("empty_multibindingP", "EMPTY-MULTIBINDING?", 1, 0, false);
        declareFunction("make_multibinding", "MAKE-MULTIBINDING", 0, 0, false);
        declareFunction("copy_multibinding", "COPY-MULTIBINDING", 1, 0, false);
        declareFunction("terms_in_multibinding_orderP", "TERMS-IN-MULTIBINDING-ORDER?", 2, 0, false);
        declareFunction("sort_terms_into_multibinding_order", "SORT-TERMS-INTO-MULTIBINDING-ORDER", 1, 0, false);
        declareFunction("formulas_in_multibinding_orderP", "FORMULAS-IN-MULTIBINDING-ORDER?", 2, 0, false);
        declareFunction("multibinding_constant_L", "MULTIBINDING-CONSTANT-<", 2, 0, false);
        declareFunction("atoms_in_multibinding_orderP", "ATOMS-IN-MULTIBINDING-ORDER?", 2, 0, false);
        declareFunction("compose_multibindings", "COMPOSE-MULTIBINDINGS", 2, 0, false);
        declareFunction("multibinding_p", "MULTIBINDING-P", 1, 0, false);
        declareFunction("simple_multibinding_listP", "SIMPLE-MULTIBINDING-LIST?", 1, 0, false);
        declareFunction("unit_multibinding_pairP", "UNIT-MULTIBINDING-PAIR?", 1, 0, false);
        declareFunction("empty_multibinding_pairP", "EMPTY-MULTIBINDING-PAIR?", 1, 0, false);
        declareFunction("degenerate_multibindingP", "DEGENERATE-MULTIBINDING?", 1, 0, false);
        declareFunction("atomic_unit_multibinding_pairP", "ATOMIC-UNIT-MULTIBINDING-PAIR?", 1, 0, false);
        declareFunction("convert_unit_to_normal_binding", "CONVERT-UNIT-TO-NORMAL-BINDING", 1, 0, false);
        declareFunction("assoc_multibinding", "ASSOC-MULTIBINDING", 2, 0, false);
        declareFunction("get_multibinding_values", "GET-MULTIBINDING-VALUES", 2, 0, false);
        declareFunction("atomic_binding_in_multibindingP", "ATOMIC-BINDING-IN-MULTIBINDING?", 2, 0, false);
        declareFunction("replace_or_create_in_multibinding", "REPLACE-OR-CREATE-IN-MULTIBINDING", 3, 0, false);
        declareFunction("variable_in_multibindingP", "VARIABLE-IN-MULTIBINDING?", 2, 0, false);
        declareFunction("free_variable_in_multibindingP", "FREE-VARIABLE-IN-MULTIBINDING?", 2, 0, false);
        declareFunction("apply_multibinding", "APPLY-MULTIBINDING", 2, 0, false);
        declareFunction("propagate_atomic_multibinding", "PROPAGATE-ATOMIC-MULTIBINDING", 1, 0, false);
        declareFunction("singleton_variable_extentP", "SINGLETON-VARIABLE-EXTENT?", 2, 0, false);
        declareFunction("collate_multibinding_list", "COLLATE-MULTIBINDING-LIST", 1, 0, false);
        declareFunction("simple_multibinding", "SIMPLE-MULTIBINDING", 1, 0, false);
        declareFunction("mbind_simple_binding_list", "MBIND-SIMPLE-BINDING-LIST", 1, 0, false);
        declareFunction("print_multibinding", "PRINT-MULTIBINDING", 3, 0, false);
        declareFunction("multibinding_string", "MULTIBINDING-STRING", 1, 0, false);
        declareFunction("mbinding_print_function_trampoline", "MBINDING-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("mbinding_p", "MBINDING-P", 1, 0, false);
        new com.cyc.cycjava.cycl.multibindings.$mbinding_p$UnaryFunction();
        declareFunction("mb_multi_var_term_map", "MB-MULTI-VAR-TERM-MAP", 1, 0, false);
        declareFunction("mb_simple_var_term_map", "MB-SIMPLE-VAR-TERM-MAP", 1, 0, false);
        declareFunction("mb_degenerateP", "MB-DEGENERATE?", 1, 0, false);
        declareFunction("_csetf_mb_multi_var_term_map", "_CSETF-MB-MULTI-VAR-TERM-MAP", 2, 0, false);
        declareFunction("_csetf_mb_simple_var_term_map", "_CSETF-MB-SIMPLE-VAR-TERM-MAP", 2, 0, false);
        declareFunction("_csetf_mb_degenerateP", "_CSETF-MB-DEGENERATE?", 2, 0, false);
        declareFunction("make_mbinding", "MAKE-MBINDING", 0, 1, false);
        declareFunction("print_mb", "PRINT-MB", 3, 0, false);
        declareFunction("create_mb", "CREATE-MB", 0, 0, false);
        declareFunction("empty_mb", "EMPTY-MB", 0, 0, false);
        declareFunction("copy_mb", "COPY-MB", 1, 0, false);
        declareFunction("mb_multi_variables", "MB-MULTI-VARIABLES", 1, 0, false);
        declareFunction("mb_simple_variables", "MB-SIMPLE-VARIABLES", 1, 0, false);
        declareFunction("mb_variables", "MB-VARIABLES", 1, 0, false);
        declareFunction("mb_multi_var_entry", "MB-MULTI-VAR-ENTRY", 2, 0, false);
        declareFunction("mb_multi_var_values", "MB-MULTI-VAR-VALUES", 2, 0, false);
        declareFunction("mb_simple_var_entry", "MB-SIMPLE-VAR-ENTRY", 2, 0, false);
        declareFunction("mb_simple_var_values", "MB-SIMPLE-VAR-VALUES", 2, 0, false);
        declareFunction("mb_var_values", "MB-VAR-VALUES", 2, 0, false);
        declareFunction("mb_var_entry", "MB-VAR-ENTRY", 2, 0, false);
        declareFunction("mb_var_supports", "MB-VAR-SUPPORTS", 2, 0, false);
        declareFunction("mb_supports", "MB-SUPPORTS", 1, 0, false);
        declareFunction("set_mb_var_entry", "SET-MB-VAR-ENTRY", 3, 0, false);
        declareFunction("mb_var_push", "MB-VAR-PUSH", 3, 0, false);
        declareFunction("mb_multi_variableP", "MB-MULTI-VARIABLE?", 2, 0, false);
        declareFunction("mb_simple_variableP", "MB-SIMPLE-VARIABLE?", 2, 0, false);
        declareFunction("mb_variableP", "MB-VARIABLE?", 2, 0, false);
        declareFunction("mb_promote_var_to_simple", "MB-PROMOTE-VAR-TO-SIMPLE", 2, 0, false);
        declareFunction("mb_promote_var_to_multi", "MB-PROMOTE-VAR-TO-MULTI", 2, 0, false);
        declareMacro("do_mbind", "DO-MBIND");
        declareMacro("do_mbind_var_extents", "DO-MBIND-VAR-EXTENTS");
        declareFunction("mb_simple_binding", "MB-SIMPLE-BINDING", 1, 0, false);
        declareFunction("mb_string", "MB-STRING", 1, 0, false);
        declareFunction("mb_add_bindings", "MB-ADD-BINDINGS", 2, 0, false);
        declareFunction("mb_add_supports_to_value", "MB-ADD-SUPPORTS-TO-VALUE", 4, 0, false);
        declareFunction("mb_add_bindings_and_supports", "MB-ADD-BINDINGS-AND-SUPPORTS", 3, 0, false);
        declareFunction("mb_add_blist_and_supports_entry", "MB-ADD-BLIST-AND-SUPPORTS-ENTRY", 2, 0, false);
        declareFunction("make_mbinds_from_binding_lists", "MAKE-MBINDS-FROM-BINDING-LISTS", 2, 0, false);
        declareFunction("gather_bound_vars_in_blists_and_supports", "GATHER-BOUND-VARS-IN-BLISTS-AND-SUPPORTS", 1, 0, false);
        declareFunction("mb_reifiable_natP", "MB-REIFIABLE-NAT?", 1, 0, false);
        declareFunction("mb_find_nart_or_naut", "MB-FIND-NART-OR-NAUT", 1, 0, false);
        declareFunction("multibinding_reify_nat_values", "MULTIBINDING-REIFY-NAT-VALUES", 1, 0, false);
        declareFunction("mb_collapse_multiple_proof_bindings", "MB-COLLAPSE-MULTIPLE-PROOF-BINDINGS", 1, 0, false);
        declareFunction("convert_binding_lists_and_supports_to_mbinds", "CONVERT-BINDING-LISTS-AND-SUPPORTS-TO-MBINDS", 2, 1, false);
        declareFunction("convert_binding_lists_to_mbinds", "CONVERT-BINDING-LISTS-TO-MBINDS", 1, 1, false);
        declareFunction("convert_binding_to_mbind", "CONVERT-BINDING-TO-MBIND", 2, 0, false);
        declareFunction("collate_multibindings_totally", "COLLATE-MULTIBINDINGS-TOTALLY", 1, 0, false);
        declareFunction("only_variable_different", "ONLY-VARIABLE-DIFFERENT", 2, 0, false);
        declareFunction("mb_entry_L", "MB-ENTRY-<", 2, 0, false);
        declareFunction("mb_merge_entry_values", "MB-MERGE-ENTRY-VALUES", 2, 0, false);
        declareFunction("mb_merge_entry_values_int", "MB-MERGE-ENTRY-VALUES-INT", 3, 0, false);
        declareFunction("collate_mb_list", "COLLATE-MB-LIST", 1, 0, false);
        declareFunction("mb_equivP", "MB-EQUIV?", 2, 0, false);
        declareFunction("variable_extent_in_multibinding", "VARIABLE-EXTENT-IN-MULTIBINDING", 2, 0, false);
        declareFunction("apply_mb", "APPLY-MB", 2, 0, false);
        declareFunction("mb_make_entry_with_null_supports", "MB-MAKE-ENTRY-WITH-NULL-SUPPORTS", 1, 0, false);
        declareFunction("propagate_variable_extent_in_multibinding", "PROPAGATE-VARIABLE-EXTENT-IN-MULTIBINDING", 3, 0, false);
        declareFunction("mb_inverse", "MB-INVERSE", 2, 0, false);
        declareFunction("multibinding_inverse_list", "MULTIBINDING-INVERSE-LIST", 2, 0, false);
        declareFunction("get_multibinding_test_case_mbinding2", "GET-MULTIBINDING-TEST-CASE-MBINDING2", 1, 0, false);
        declareFunction("set_multibinding_test_case_mbinding2", "SET-MULTIBINDING-TEST-CASE-MBINDING2", 2, 0, false);
        declareFunction("get_multibinding_test_case_mbinding1", "GET-MULTIBINDING-TEST-CASE-MBINDING1", 1, 0, false);
        declareFunction("set_multibinding_test_case_mbinding1", "SET-MULTIBINDING-TEST-CASE-MBINDING1", 2, 0, false);
        declareFunction("get_multibinding_test_case_binding2", "GET-MULTIBINDING-TEST-CASE-BINDING2", 1, 0, false);
        declareFunction("set_multibinding_test_case_binding2", "SET-MULTIBINDING-TEST-CASE-BINDING2", 2, 0, false);
        declareFunction("get_multibinding_test_case_binding_list1", "GET-MULTIBINDING-TEST-CASE-BINDING-LIST1", 1, 0, false);
        declareFunction("set_multibinding_test_case_binding_list1", "SET-MULTIBINDING-TEST-CASE-BINDING-LIST1", 2, 0, false);
        declareFunction("subloop_reserved_initialize_multibinding_test_case_class", "SUBLOOP-RESERVED-INITIALIZE-MULTIBINDING-TEST-CASE-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_multibinding_test_case_instance", "SUBLOOP-RESERVED-INITIALIZE-MULTIBINDING-TEST-CASE-INSTANCE", 1, 0, false);
        declareFunction("multibinding_test_case_p", "MULTIBINDING-TEST-CASE-P", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_multibindings_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("multibinding_fail_token", "MULTIBINDING-FAIL-TOKEN", 0, 0, false);
            declareFunction("multibinding_failedP", "MULTIBINDING-FAILED?", 1, 0, false);
            declareFunction("empty_multibindingP", "EMPTY-MULTIBINDING?", 1, 0, false);
            declareFunction("make_multibinding", "MAKE-MULTIBINDING", 0, 0, false);
            declareFunction("copy_multibinding", "COPY-MULTIBINDING", 1, 0, false);
            declareFunction("terms_in_multibinding_orderP", "TERMS-IN-MULTIBINDING-ORDER?", 2, 0, false);
            declareFunction("sort_terms_into_multibinding_order", "SORT-TERMS-INTO-MULTIBINDING-ORDER", 1, 0, false);
            declareFunction("formulas_in_multibinding_orderP", "FORMULAS-IN-MULTIBINDING-ORDER?", 2, 0, false);
            declareFunction("multibinding_constant_L", "MULTIBINDING-CONSTANT-<", 2, 0, false);
            declareFunction("atoms_in_multibinding_orderP", "ATOMS-IN-MULTIBINDING-ORDER?", 2, 0, false);
            declareFunction("compose_multibindings", "COMPOSE-MULTIBINDINGS", 2, 0, false);
            declareFunction("multibinding_p", "MULTIBINDING-P", 1, 0, false);
            declareFunction("simple_multibinding_listP", "SIMPLE-MULTIBINDING-LIST?", 1, 0, false);
            declareFunction("unit_multibinding_pairP", "UNIT-MULTIBINDING-PAIR?", 1, 0, false);
            declareFunction("empty_multibinding_pairP", "EMPTY-MULTIBINDING-PAIR?", 1, 0, false);
            declareFunction("degenerate_multibindingP", "DEGENERATE-MULTIBINDING?", 1, 0, false);
            declareFunction("atomic_unit_multibinding_pairP", "ATOMIC-UNIT-MULTIBINDING-PAIR?", 1, 0, false);
            declareFunction("convert_unit_to_normal_binding", "CONVERT-UNIT-TO-NORMAL-BINDING", 1, 0, false);
            declareFunction("assoc_multibinding", "ASSOC-MULTIBINDING", 2, 0, false);
            declareFunction("get_multibinding_values", "GET-MULTIBINDING-VALUES", 2, 0, false);
            declareFunction("atomic_binding_in_multibindingP", "ATOMIC-BINDING-IN-MULTIBINDING?", 2, 0, false);
            declareFunction("replace_or_create_in_multibinding", "REPLACE-OR-CREATE-IN-MULTIBINDING", 3, 0, false);
            declareFunction("variable_in_multibindingP", "VARIABLE-IN-MULTIBINDING?", 2, 0, false);
            declareFunction("free_variable_in_multibindingP", "FREE-VARIABLE-IN-MULTIBINDING?", 2, 0, false);
            declareFunction("apply_multibinding", "APPLY-MULTIBINDING", 2, 0, false);
            declareFunction("propagate_atomic_multibinding", "PROPAGATE-ATOMIC-MULTIBINDING", 1, 0, false);
            declareFunction("singleton_variable_extentP", "SINGLETON-VARIABLE-EXTENT?", 2, 0, false);
            declareFunction("collate_multibinding_list", "COLLATE-MULTIBINDING-LIST", 1, 0, false);
            declareFunction("simple_multibinding", "SIMPLE-MULTIBINDING", 1, 0, false);
            declareFunction("mbind_simple_binding_list", "MBIND-SIMPLE-BINDING-LIST", 1, 0, false);
            declareFunction("print_multibinding", "PRINT-MULTIBINDING", 3, 0, false);
            declareFunction("multibinding_string", "MULTIBINDING-STRING", 1, 0, false);
            declareFunction("mbinding_print_function_trampoline", "MBINDING-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("mbinding_p", "MBINDING-P", 1, 0, false);
            new multibindings.$mbinding_p$UnaryFunction();
            declareFunction("mb_multi_var_term_map", "MB-MULTI-VAR-TERM-MAP", 1, 0, false);
            declareFunction("mb_simple_var_term_map", "MB-SIMPLE-VAR-TERM-MAP", 1, 0, false);
            declareFunction("mb_degenerateP", "MB-DEGENERATE?", 1, 0, false);
            declareFunction("_csetf_mb_multi_var_term_map", "_CSETF-MB-MULTI-VAR-TERM-MAP", 2, 0, false);
            declareFunction("_csetf_mb_simple_var_term_map", "_CSETF-MB-SIMPLE-VAR-TERM-MAP", 2, 0, false);
            declareFunction("_csetf_mb_degenerateP", "_CSETF-MB-DEGENERATE?", 2, 0, false);
            declareFunction("make_mbinding", "MAKE-MBINDING", 0, 1, false);
            declareFunction("visit_defstruct_mbinding", "VISIT-DEFSTRUCT-MBINDING", 2, 0, false);
            declareFunction("visit_defstruct_object_mbinding_method", "VISIT-DEFSTRUCT-OBJECT-MBINDING-METHOD", 2, 0, false);
            declareFunction("print_mb", "PRINT-MB", 3, 0, false);
            declareFunction("create_mb", "CREATE-MB", 0, 0, false);
            declareFunction("empty_mb", "EMPTY-MB", 0, 0, false);
            declareFunction("copy_mb", "COPY-MB", 1, 0, false);
            declareFunction("mb_multi_variables", "MB-MULTI-VARIABLES", 1, 0, false);
            declareFunction("mb_simple_variables", "MB-SIMPLE-VARIABLES", 1, 0, false);
            declareFunction("mb_variables", "MB-VARIABLES", 1, 0, false);
            declareFunction("mb_multi_var_entry", "MB-MULTI-VAR-ENTRY", 2, 0, false);
            declareFunction("mb_multi_var_values", "MB-MULTI-VAR-VALUES", 2, 0, false);
            declareFunction("mb_simple_var_entry", "MB-SIMPLE-VAR-ENTRY", 2, 0, false);
            declareFunction("mb_simple_var_values", "MB-SIMPLE-VAR-VALUES", 2, 0, false);
            declareFunction("mb_var_values", "MB-VAR-VALUES", 2, 0, false);
            declareFunction("mb_var_entry", "MB-VAR-ENTRY", 2, 0, false);
            declareFunction("mb_var_supports", "MB-VAR-SUPPORTS", 2, 0, false);
            declareFunction("mb_supports", "MB-SUPPORTS", 1, 0, false);
            declareFunction("set_mb_var_entry", "SET-MB-VAR-ENTRY", 3, 0, false);
            declareFunction("mb_var_push", "MB-VAR-PUSH", 3, 0, false);
            declareFunction("mb_multi_variableP", "MB-MULTI-VARIABLE?", 2, 0, false);
            declareFunction("mb_simple_variableP", "MB-SIMPLE-VARIABLE?", 2, 0, false);
            declareFunction("mb_variableP", "MB-VARIABLE?", 2, 0, false);
            declareFunction("mb_promote_var_to_simple", "MB-PROMOTE-VAR-TO-SIMPLE", 2, 0, false);
            declareFunction("mb_promote_var_to_multi", "MB-PROMOTE-VAR-TO-MULTI", 2, 0, false);
            declareMacro("do_mbind", "DO-MBIND");
            declareMacro("do_mbind_var_extents", "DO-MBIND-VAR-EXTENTS");
            declareFunction("mb_simple_binding", "MB-SIMPLE-BINDING", 1, 0, false);
            declareFunction("mb_string", "MB-STRING", 1, 0, false);
            declareFunction("mb_add_bindings", "MB-ADD-BINDINGS", 2, 0, false);
            declareFunction("mb_add_supports_to_value", "MB-ADD-SUPPORTS-TO-VALUE", 4, 0, false);
            declareFunction("mb_add_bindings_and_supports", "MB-ADD-BINDINGS-AND-SUPPORTS", 3, 0, false);
            declareFunction("mb_add_blist_and_supports_entry", "MB-ADD-BLIST-AND-SUPPORTS-ENTRY", 2, 0, false);
            declareFunction("make_mbinds_from_binding_lists", "MAKE-MBINDS-FROM-BINDING-LISTS", 2, 0, false);
            declareFunction("gather_bound_vars_in_blists_and_supports", "GATHER-BOUND-VARS-IN-BLISTS-AND-SUPPORTS", 1, 0, false);
            declareFunction("mb_reifiable_natP", "MB-REIFIABLE-NAT?", 1, 0, false);
            declareFunction("mb_find_nart_or_naut", "MB-FIND-NART-OR-NAUT", 1, 0, false);
            declareFunction("multibinding_reify_nat_values", "MULTIBINDING-REIFY-NAT-VALUES", 1, 0, false);
            declareFunction("mb_collapse_multiple_proof_bindings", "MB-COLLAPSE-MULTIPLE-PROOF-BINDINGS", 1, 0, false);
            declareFunction("convert_binding_lists_and_supports_to_mbinds", "CONVERT-BINDING-LISTS-AND-SUPPORTS-TO-MBINDS", 2, 1, false);
            declareFunction("convert_binding_lists_to_mbinds", "CONVERT-BINDING-LISTS-TO-MBINDS", 1, 1, false);
            declareFunction("convert_binding_to_mbind", "CONVERT-BINDING-TO-MBIND", 2, 0, false);
            declareFunction("collate_multibindings_totally", "COLLATE-MULTIBINDINGS-TOTALLY", 1, 0, false);
            declareFunction("only_variable_different", "ONLY-VARIABLE-DIFFERENT", 2, 0, false);
            declareFunction("mb_entry_L", "MB-ENTRY-<", 2, 0, false);
            declareFunction("mb_merge_entry_values", "MB-MERGE-ENTRY-VALUES", 2, 0, false);
            declareFunction("mb_merge_entry_values_int", "MB-MERGE-ENTRY-VALUES-INT", 3, 0, false);
            declareFunction("collate_mb_list", "COLLATE-MB-LIST", 1, 0, false);
            declareFunction("mb_equivP", "MB-EQUIV?", 2, 0, false);
            declareFunction("variable_extent_in_multibinding", "VARIABLE-EXTENT-IN-MULTIBINDING", 2, 0, false);
            declareFunction("apply_mb", "APPLY-MB", 2, 0, false);
            declareFunction("mb_make_entry_with_null_supports", "MB-MAKE-ENTRY-WITH-NULL-SUPPORTS", 1, 0, false);
            declareFunction("propagate_variable_extent_in_multibinding", "PROPAGATE-VARIABLE-EXTENT-IN-MULTIBINDING", 3, 0, false);
            declareFunction("mb_inverse", "MB-INVERSE", 2, 0, false);
            declareFunction("multibinding_inverse_list", "MULTIBINDING-INVERSE-LIST", 2, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("get_multibinding_test_case_mbinding2", "GET-MULTIBINDING-TEST-CASE-MBINDING2", 1, 0, false);
            declareFunction("set_multibinding_test_case_mbinding2", "SET-MULTIBINDING-TEST-CASE-MBINDING2", 2, 0, false);
            declareFunction("get_multibinding_test_case_mbinding1", "GET-MULTIBINDING-TEST-CASE-MBINDING1", 1, 0, false);
            declareFunction("set_multibinding_test_case_mbinding1", "SET-MULTIBINDING-TEST-CASE-MBINDING1", 2, 0, false);
            declareFunction("get_multibinding_test_case_binding2", "GET-MULTIBINDING-TEST-CASE-BINDING2", 1, 0, false);
            declareFunction("set_multibinding_test_case_binding2", "SET-MULTIBINDING-TEST-CASE-BINDING2", 2, 0, false);
            declareFunction("get_multibinding_test_case_binding_list1", "GET-MULTIBINDING-TEST-CASE-BINDING-LIST1", 1, 0, false);
            declareFunction("set_multibinding_test_case_binding_list1", "SET-MULTIBINDING-TEST-CASE-BINDING-LIST1", 2, 0, false);
            declareFunction("subloop_reserved_initialize_multibinding_test_case_class", "SUBLOOP-RESERVED-INITIALIZE-MULTIBINDING-TEST-CASE-CLASS", 1, 0, false);
            declareFunction("subloop_reserved_initialize_multibinding_test_case_instance", "SUBLOOP-RESERVED-INITIALIZE-MULTIBINDING-TEST-CASE-INSTANCE", 1, 0, false);
            declareFunction("multibinding_test_case_p", "MULTIBINDING-TEST-CASE-P", 1, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_multibindings_file_Previous() {
        declareFunction("multibinding_fail_token", "MULTIBINDING-FAIL-TOKEN", 0, 0, false);
        declareFunction("multibinding_failedP", "MULTIBINDING-FAILED?", 1, 0, false);
        declareFunction("empty_multibindingP", "EMPTY-MULTIBINDING?", 1, 0, false);
        declareFunction("make_multibinding", "MAKE-MULTIBINDING", 0, 0, false);
        declareFunction("copy_multibinding", "COPY-MULTIBINDING", 1, 0, false);
        declareFunction("terms_in_multibinding_orderP", "TERMS-IN-MULTIBINDING-ORDER?", 2, 0, false);
        declareFunction("sort_terms_into_multibinding_order", "SORT-TERMS-INTO-MULTIBINDING-ORDER", 1, 0, false);
        declareFunction("formulas_in_multibinding_orderP", "FORMULAS-IN-MULTIBINDING-ORDER?", 2, 0, false);
        declareFunction("multibinding_constant_L", "MULTIBINDING-CONSTANT-<", 2, 0, false);
        declareFunction("atoms_in_multibinding_orderP", "ATOMS-IN-MULTIBINDING-ORDER?", 2, 0, false);
        declareFunction("compose_multibindings", "COMPOSE-MULTIBINDINGS", 2, 0, false);
        declareFunction("multibinding_p", "MULTIBINDING-P", 1, 0, false);
        declareFunction("simple_multibinding_listP", "SIMPLE-MULTIBINDING-LIST?", 1, 0, false);
        declareFunction("unit_multibinding_pairP", "UNIT-MULTIBINDING-PAIR?", 1, 0, false);
        declareFunction("empty_multibinding_pairP", "EMPTY-MULTIBINDING-PAIR?", 1, 0, false);
        declareFunction("degenerate_multibindingP", "DEGENERATE-MULTIBINDING?", 1, 0, false);
        declareFunction("atomic_unit_multibinding_pairP", "ATOMIC-UNIT-MULTIBINDING-PAIR?", 1, 0, false);
        declareFunction("convert_unit_to_normal_binding", "CONVERT-UNIT-TO-NORMAL-BINDING", 1, 0, false);
        declareFunction("assoc_multibinding", "ASSOC-MULTIBINDING", 2, 0, false);
        declareFunction("get_multibinding_values", "GET-MULTIBINDING-VALUES", 2, 0, false);
        declareFunction("atomic_binding_in_multibindingP", "ATOMIC-BINDING-IN-MULTIBINDING?", 2, 0, false);
        declareFunction("replace_or_create_in_multibinding", "REPLACE-OR-CREATE-IN-MULTIBINDING", 3, 0, false);
        declareFunction("variable_in_multibindingP", "VARIABLE-IN-MULTIBINDING?", 2, 0, false);
        declareFunction("free_variable_in_multibindingP", "FREE-VARIABLE-IN-MULTIBINDING?", 2, 0, false);
        declareFunction("apply_multibinding", "APPLY-MULTIBINDING", 2, 0, false);
        declareFunction("propagate_atomic_multibinding", "PROPAGATE-ATOMIC-MULTIBINDING", 1, 0, false);
        declareFunction("singleton_variable_extentP", "SINGLETON-VARIABLE-EXTENT?", 2, 0, false);
        declareFunction("collate_multibinding_list", "COLLATE-MULTIBINDING-LIST", 1, 0, false);
        declareFunction("simple_multibinding", "SIMPLE-MULTIBINDING", 1, 0, false);
        declareFunction("mbind_simple_binding_list", "MBIND-SIMPLE-BINDING-LIST", 1, 0, false);
        declareFunction("print_multibinding", "PRINT-MULTIBINDING", 3, 0, false);
        declareFunction("multibinding_string", "MULTIBINDING-STRING", 1, 0, false);
        declareFunction("mbinding_print_function_trampoline", "MBINDING-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("mbinding_p", "MBINDING-P", 1, 0, false);
        new multibindings.$mbinding_p$UnaryFunction();
        declareFunction("mb_multi_var_term_map", "MB-MULTI-VAR-TERM-MAP", 1, 0, false);
        declareFunction("mb_simple_var_term_map", "MB-SIMPLE-VAR-TERM-MAP", 1, 0, false);
        declareFunction("mb_degenerateP", "MB-DEGENERATE?", 1, 0, false);
        declareFunction("_csetf_mb_multi_var_term_map", "_CSETF-MB-MULTI-VAR-TERM-MAP", 2, 0, false);
        declareFunction("_csetf_mb_simple_var_term_map", "_CSETF-MB-SIMPLE-VAR-TERM-MAP", 2, 0, false);
        declareFunction("_csetf_mb_degenerateP", "_CSETF-MB-DEGENERATE?", 2, 0, false);
        declareFunction("make_mbinding", "MAKE-MBINDING", 0, 1, false);
        declareFunction("visit_defstruct_mbinding", "VISIT-DEFSTRUCT-MBINDING", 2, 0, false);
        declareFunction("visit_defstruct_object_mbinding_method", "VISIT-DEFSTRUCT-OBJECT-MBINDING-METHOD", 2, 0, false);
        declareFunction("print_mb", "PRINT-MB", 3, 0, false);
        declareFunction("create_mb", "CREATE-MB", 0, 0, false);
        declareFunction("empty_mb", "EMPTY-MB", 0, 0, false);
        declareFunction("copy_mb", "COPY-MB", 1, 0, false);
        declareFunction("mb_multi_variables", "MB-MULTI-VARIABLES", 1, 0, false);
        declareFunction("mb_simple_variables", "MB-SIMPLE-VARIABLES", 1, 0, false);
        declareFunction("mb_variables", "MB-VARIABLES", 1, 0, false);
        declareFunction("mb_multi_var_entry", "MB-MULTI-VAR-ENTRY", 2, 0, false);
        declareFunction("mb_multi_var_values", "MB-MULTI-VAR-VALUES", 2, 0, false);
        declareFunction("mb_simple_var_entry", "MB-SIMPLE-VAR-ENTRY", 2, 0, false);
        declareFunction("mb_simple_var_values", "MB-SIMPLE-VAR-VALUES", 2, 0, false);
        declareFunction("mb_var_values", "MB-VAR-VALUES", 2, 0, false);
        declareFunction("mb_var_entry", "MB-VAR-ENTRY", 2, 0, false);
        declareFunction("mb_var_supports", "MB-VAR-SUPPORTS", 2, 0, false);
        declareFunction("mb_supports", "MB-SUPPORTS", 1, 0, false);
        declareFunction("set_mb_var_entry", "SET-MB-VAR-ENTRY", 3, 0, false);
        declareFunction("mb_var_push", "MB-VAR-PUSH", 3, 0, false);
        declareFunction("mb_multi_variableP", "MB-MULTI-VARIABLE?", 2, 0, false);
        declareFunction("mb_simple_variableP", "MB-SIMPLE-VARIABLE?", 2, 0, false);
        declareFunction("mb_variableP", "MB-VARIABLE?", 2, 0, false);
        declareFunction("mb_promote_var_to_simple", "MB-PROMOTE-VAR-TO-SIMPLE", 2, 0, false);
        declareFunction("mb_promote_var_to_multi", "MB-PROMOTE-VAR-TO-MULTI", 2, 0, false);
        declareMacro("do_mbind", "DO-MBIND");
        declareMacro("do_mbind_var_extents", "DO-MBIND-VAR-EXTENTS");
        declareFunction("mb_simple_binding", "MB-SIMPLE-BINDING", 1, 0, false);
        declareFunction("mb_string", "MB-STRING", 1, 0, false);
        declareFunction("mb_add_bindings", "MB-ADD-BINDINGS", 2, 0, false);
        declareFunction("mb_add_supports_to_value", "MB-ADD-SUPPORTS-TO-VALUE", 4, 0, false);
        declareFunction("mb_add_bindings_and_supports", "MB-ADD-BINDINGS-AND-SUPPORTS", 3, 0, false);
        declareFunction("mb_add_blist_and_supports_entry", "MB-ADD-BLIST-AND-SUPPORTS-ENTRY", 2, 0, false);
        declareFunction("make_mbinds_from_binding_lists", "MAKE-MBINDS-FROM-BINDING-LISTS", 2, 0, false);
        declareFunction("gather_bound_vars_in_blists_and_supports", "GATHER-BOUND-VARS-IN-BLISTS-AND-SUPPORTS", 1, 0, false);
        declareFunction("mb_reifiable_natP", "MB-REIFIABLE-NAT?", 1, 0, false);
        declareFunction("mb_find_nart_or_naut", "MB-FIND-NART-OR-NAUT", 1, 0, false);
        declareFunction("multibinding_reify_nat_values", "MULTIBINDING-REIFY-NAT-VALUES", 1, 0, false);
        declareFunction("mb_collapse_multiple_proof_bindings", "MB-COLLAPSE-MULTIPLE-PROOF-BINDINGS", 1, 0, false);
        declareFunction("convert_binding_lists_and_supports_to_mbinds", "CONVERT-BINDING-LISTS-AND-SUPPORTS-TO-MBINDS", 2, 1, false);
        declareFunction("convert_binding_lists_to_mbinds", "CONVERT-BINDING-LISTS-TO-MBINDS", 1, 1, false);
        declareFunction("convert_binding_to_mbind", "CONVERT-BINDING-TO-MBIND", 2, 0, false);
        declareFunction("collate_multibindings_totally", "COLLATE-MULTIBINDINGS-TOTALLY", 1, 0, false);
        declareFunction("only_variable_different", "ONLY-VARIABLE-DIFFERENT", 2, 0, false);
        declareFunction("mb_entry_L", "MB-ENTRY-<", 2, 0, false);
        declareFunction("mb_merge_entry_values", "MB-MERGE-ENTRY-VALUES", 2, 0, false);
        declareFunction("mb_merge_entry_values_int", "MB-MERGE-ENTRY-VALUES-INT", 3, 0, false);
        declareFunction("collate_mb_list", "COLLATE-MB-LIST", 1, 0, false);
        declareFunction("mb_equivP", "MB-EQUIV?", 2, 0, false);
        declareFunction("variable_extent_in_multibinding", "VARIABLE-EXTENT-IN-MULTIBINDING", 2, 0, false);
        declareFunction("apply_mb", "APPLY-MB", 2, 0, false);
        declareFunction("mb_make_entry_with_null_supports", "MB-MAKE-ENTRY-WITH-NULL-SUPPORTS", 1, 0, false);
        declareFunction("propagate_variable_extent_in_multibinding", "PROPAGATE-VARIABLE-EXTENT-IN-MULTIBINDING", 3, 0, false);
        declareFunction("mb_inverse", "MB-INVERSE", 2, 0, false);
        declareFunction("multibinding_inverse_list", "MULTIBINDING-INVERSE-LIST", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_multibindings_file() {
        deflexical("*MULTIBINDING-FAIL*", $FAIL);
        defparameter("*MB-REIFY-NATS?*", T);
        defconstant("*DTP-MBINDING*", MBINDING);
        return NIL;
    }

    public static final SubLObject setup_multibindings_file_alt() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_mbinding$.getGlobalValue(), symbol_function(MBINDING_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(MB_MULTI_VAR_TERM_MAP, _CSETF_MB_MULTI_VAR_TERM_MAP);
        def_csetf(MB_SIMPLE_VAR_TERM_MAP, _CSETF_MB_SIMPLE_VAR_TERM_MAP);
        def_csetf($sym25$MB_DEGENERATE_, $sym26$_CSETF_MB_DEGENERATE_);
        identity(MBINDING);
        sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(MULTIBINDING_TEST_CASE, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
        sunit_macros.define_test_case_preamble(MULTIBINDING_TEST_CASE);
        classes.subloop_new_class(MULTIBINDING_TEST_CASE, TEST_CASE, NIL, NIL, $list_alt62);
        classes.class_set_implements_slot_listeners(MULTIBINDING_TEST_CASE, NIL);
        classes.subloop_note_class_initialization_function(MULTIBINDING_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_MULTIBINDING_TEST_CASE_CLASS);
        classes.subloop_note_instance_initialization_function(MULTIBINDING_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_MULTIBINDING_TEST_CASE_INSTANCE);
        subloop_reserved_initialize_multibinding_test_case_class(MULTIBINDING_TEST_CASE);
        sunit_macros.define_test_case_postamble(MULTIBINDING_TEST_CASE, $$$multibindings, $$$cycl, NIL);
        sunit_macros.def_test_method_register(MULTIBINDING_TEST_CASE, COLLAPSING_MULTIPLE_PROOFS_TEST);
        sunit_macros.def_test_method_register(MULTIBINDING_TEST_CASE, CONVERSION_TEST);
        sunit_macros.def_test_method_register(MULTIBINDING_TEST_CASE, ADDING_SUPPORTS_TEST);
        sunit_macros.def_test_method_register(MULTIBINDING_TEST_CASE, MERGE_ENTRY_TEST);
        return NIL;
    }

    public static SubLObject setup_multibindings_file() {
        if (SubLFiles.USE_V1) {
            register_method($print_object_method_table$.getGlobalValue(), $dtp_mbinding$.getGlobalValue(), symbol_function(MBINDING_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list21);
            def_csetf(MB_MULTI_VAR_TERM_MAP, _CSETF_MB_MULTI_VAR_TERM_MAP);
            def_csetf(MB_SIMPLE_VAR_TERM_MAP, _CSETF_MB_SIMPLE_VAR_TERM_MAP);
            def_csetf($sym26$MB_DEGENERATE_, $sym27$_CSETF_MB_DEGENERATE_);
            identity(MBINDING);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_mbinding$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_MBINDING_METHOD));
        }
        if (SubLFiles.USE_V2) {
            def_csetf($sym25$MB_DEGENERATE_, $sym26$_CSETF_MB_DEGENERATE_);
            sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(MULTIBINDING_TEST_CASE, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
            sunit_macros.define_test_case_preamble(MULTIBINDING_TEST_CASE);
            classes.subloop_new_class(MULTIBINDING_TEST_CASE, TEST_CASE, NIL, NIL, $list_alt62);
            classes.class_set_implements_slot_listeners(MULTIBINDING_TEST_CASE, NIL);
            classes.subloop_note_class_initialization_function(MULTIBINDING_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_MULTIBINDING_TEST_CASE_CLASS);
            classes.subloop_note_instance_initialization_function(MULTIBINDING_TEST_CASE, SUBLOOP_RESERVED_INITIALIZE_MULTIBINDING_TEST_CASE_INSTANCE);
            subloop_reserved_initialize_multibinding_test_case_class(MULTIBINDING_TEST_CASE);
            sunit_macros.define_test_case_postamble(MULTIBINDING_TEST_CASE, $$$multibindings, $$$cycl, NIL);
            sunit_macros.def_test_method_register(MULTIBINDING_TEST_CASE, COLLAPSING_MULTIPLE_PROOFS_TEST);
            sunit_macros.def_test_method_register(MULTIBINDING_TEST_CASE, CONVERSION_TEST);
            sunit_macros.def_test_method_register(MULTIBINDING_TEST_CASE, ADDING_SUPPORTS_TEST);
            sunit_macros.def_test_method_register(MULTIBINDING_TEST_CASE, MERGE_ENTRY_TEST);
        }
        return NIL;
    }

    public static SubLObject setup_multibindings_file_Previous() {
        register_method($print_object_method_table$.getGlobalValue(), $dtp_mbinding$.getGlobalValue(), symbol_function(MBINDING_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list21);
        def_csetf(MB_MULTI_VAR_TERM_MAP, _CSETF_MB_MULTI_VAR_TERM_MAP);
        def_csetf(MB_SIMPLE_VAR_TERM_MAP, _CSETF_MB_SIMPLE_VAR_TERM_MAP);
        def_csetf($sym26$MB_DEGENERATE_, $sym27$_CSETF_MB_DEGENERATE_);
        identity(MBINDING);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_mbinding$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_MBINDING_METHOD));
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_multibindings_file();
    }

    @Override
    public void initializeVariables() {
        init_multibindings_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_multibindings_file();
    }

    

    public static final class $mbinding_native extends SubLStructNative {
        public SubLObject $multi_var_term_map;

        public SubLObject $simple_var_term_map;

        public SubLObject $degenerateP;

        private static final SubLStructDeclNative structDecl;

        public $mbinding_native() {
            multibindings.$mbinding_native.this.$multi_var_term_map = Lisp.NIL;
            multibindings.$mbinding_native.this.$simple_var_term_map = Lisp.NIL;
            multibindings.$mbinding_native.this.$degenerateP = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return multibindings.$mbinding_native.this.$multi_var_term_map;
        }

        @Override
        public SubLObject getField3() {
            return multibindings.$mbinding_native.this.$simple_var_term_map;
        }

        @Override
        public SubLObject getField4() {
            return multibindings.$mbinding_native.this.$degenerateP;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return multibindings.$mbinding_native.this.$multi_var_term_map = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return multibindings.$mbinding_native.this.$simple_var_term_map = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return multibindings.$mbinding_native.this.$degenerateP = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.multibindings.$mbinding_native.class, MBINDING, MBINDING_P, $list15, $list16, new String[]{ "$multi_var_term_map", "$simple_var_term_map", "$degenerateP" }, $list17, $list18, PRINT_MB);
        }
    }

    public static final class $mbinding_p$UnaryFunction extends UnaryFunction {
        public $mbinding_p$UnaryFunction() {
            super(extractFunctionNamed("MBINDING-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return mbinding_p(arg1);
        }
    }

    static private final SubLString $str_alt4$warning__trying_to_sort_the_varia = makeString("warning: trying to sort the variables ~A and ~A~%");

    static private final SubLString $str_alt5$warning__trying_to_string_sort_th = makeString("warning: trying to string-sort the atoms ~A and ~A~%");

    static private final SubLString $str_alt7$convert_unit_to_normal_binding___ = makeString("convert-unit-to-normal-binding: ~s is not a unit-multibinding-pair?");

    static private final SubLString $str_alt9$MBIND_SIMPLE_BINDING_LIST___s_is_ = makeString("MBIND-SIMPLE-BINDING-LIST: ~s is not a multibinding-p.");

    static private final SubLString $str_alt10$MULTIBINDING_ = makeString("MULTIBINDING:");

    static private final SubLString $str_alt11$_s____ = makeString("~s -->");

    static private final SubLString $str_alt12$__s = makeString(" ~s");

    static private final SubLList $list_alt15 = list(makeSymbol("MULTI-VAR-TERM-MAP"), makeSymbol("SIMPLE-VAR-TERM-MAP"), makeSymbol("DEGENERATE?"));

    static private final SubLList $list_alt16 = list(makeKeyword("MULTI-VAR-TERM-MAP"), makeKeyword("SIMPLE-VAR-TERM-MAP"), makeKeyword("DEGENERATE?"));

    static private final SubLList $list_alt17 = list(makeSymbol("MB-MULTI-VAR-TERM-MAP"), makeSymbol("MB-SIMPLE-VAR-TERM-MAP"), makeSymbol("MB-DEGENERATE?"));

    static private final SubLList $list_alt18 = list(makeSymbol("_CSETF-MB-MULTI-VAR-TERM-MAP"), makeSymbol("_CSETF-MB-SIMPLE-VAR-TERM-MAP"), makeSymbol("_CSETF-MB-DEGENERATE?"));

    static private final SubLSymbol $sym25$MB_DEGENERATE_ = makeSymbol("MB-DEGENERATE?");

    static private final SubLSymbol $sym26$_CSETF_MB_DEGENERATE_ = makeSymbol("_CSETF-MB-DEGENERATE?");

    static private final SubLString $str_alt30$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt31$__MB_ = makeString("#<MB:");

    static private final SubLString $str_alt32$_a_ = makeString("~a:");

    static private final SubLString $str_alt33$_a = makeString("~a");

    static private final SubLString $str_alt34$_ = makeString(">");

    static private final SubLString $str_alt35$empty_ = makeString("empty>");

    static private final SubLList $list_alt39 = list(list(makeSymbol("VAR"), makeSymbol("VALUES"), makeSymbol("MB"), makeSymbol("&OPTIONAL"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym40$ENTRY = makeUninternedSymbol("ENTRY");

    static private final SubLList $list_alt45 = list(makeSymbol("FUNCTION"), makeSymbol("FIRST"));

    static private final SubLList $list_alt47 = list(list(makeSymbol("VAR"), makeSymbol("EXTENT"), makeSymbol("MB"), makeSymbol("&OPTIONAL"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym48$ENTRY = makeUninternedSymbol("ENTRY");

    static private final SubLString $str_alt52$___s____ = makeString("~%~s -->");

    static private final SubLList $list_alt54 = list(makeSymbol("VALUE"), makeSymbol("OLD-SUPPORTS"));

    static private final SubLList $list_alt56 = list(makeSymbol("BINDING"), makeSymbol("SUPPORTS"));

    static private final SubLList $list_alt58 = cons(makeSymbol("BINDING"), makeSymbol("SUPPORTS-LIST"));

    private static final SubLSymbol MULTIBINDING_TEST_CASE = makeSymbol("MULTIBINDING-TEST-CASE");

    static private final SubLList $list_alt62 = list(new SubLObject[]{ list(makeSymbol("BINDING-LIST1"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("BINDING2"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("MBINDING1"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("MBINDING2"), makeKeyword("INSTANCE"), makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SETUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEANUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CONVERSION-TEST"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("ADDING-SUPPORTS-TEST"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("MERGE-ENTRY-TEST"), NIL, makeKeyword("PROTECTED")) });

    private static final SubLSymbol MBINDING2 = makeSymbol("MBINDING2");

    private static final SubLSymbol MBINDING1 = makeSymbol("MBINDING1");

    private static final SubLSymbol BINDING2 = makeSymbol("BINDING2");

    private static final SubLSymbol BINDING_LIST1 = makeSymbol("BINDING-LIST1");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_MULTIBINDING_TEST_CASE_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-MULTIBINDING-TEST-CASE-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_MULTIBINDING_TEST_CASE_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-MULTIBINDING-TEST-CASE-INSTANCE");

    static private final SubLString $$$multibindings = makeString("multibindings");

    static private final SubLString $$$cycl = makeString("cycl");

    private static final SubLSymbol COLLAPSING_MULTIPLE_PROOFS_TEST = makeSymbol("COLLAPSING-MULTIPLE-PROOFS-TEST");

    private static final SubLSymbol CONVERSION_TEST = makeSymbol("CONVERSION-TEST");

    private static final SubLSymbol ADDING_SUPPORTS_TEST = makeSymbol("ADDING-SUPPORTS-TEST");

    private static final SubLSymbol MERGE_ENTRY_TEST = makeSymbol("MERGE-ENTRY-TEST");
}

/**
 * Total time: 894 ms
 */
