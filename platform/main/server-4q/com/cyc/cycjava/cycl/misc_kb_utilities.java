/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.cb_utilities.cb_guess_fort;
import static com.cyc.cycjava.cycl.constant_handles.$dtp_constant$;
import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.constant_handles.valid_constantP;
import static com.cyc.cycjava.cycl.control_vars.$within_assert$;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_with_operator_p;
import static com.cyc.cycjava.cycl.id_index.do_id_index_empty_p;
import static com.cyc.cycjava.cycl.id_index.do_id_index_id_and_object_validP;
import static com.cyc.cycjava.cycl.id_index.do_id_index_next_id;
import static com.cyc.cycjava.cycl.id_index.do_id_index_next_state;
import static com.cyc.cycjava.cycl.id_index.do_id_index_state_object;
import static com.cyc.cycjava.cycl.id_index.id_index_count;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_next_id;
import static com.cyc.cycjava.cycl.id_index.id_index_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_skip_tombstones_p;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_id_threshold;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_tombstone_p;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.mapping_finished;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.minus;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.mod;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.method_func;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.keywordp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.make_vector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.subst;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.union;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.read_from_string_ignoring_errors;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UserIO;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      MISC-KB-UTILITIES
 * source file: /cyc/top/cycl/misc-kb-utilities.lisp
 * created:     2019/07/03 17:37:51
 */
public final class misc_kb_utilities extends SubLTranslatedFile implements V12 {
    static private final SubLString $str_alt42$ = makeString("");

    public static final SubLFile me = new misc_kb_utilities();

 public static final String myName = "com.cyc.cycjava.cycl.misc_kb_utilities";


    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $kb_handle_internal_method_table$ = makeSymbol("*KB-HANDLE-INTERNAL-METHOD-TABLE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $find_object_by_kb_handle_methods$ = makeSymbol("*FIND-OBJECT-BY-KB-HANDLE-METHODS*");



    static private final SubLString $str2$__Collecting_proprietary_constant = makeString("~%Collecting proprietary constants ... ");

    static private final SubLString $str3$_____s_____ = makeString("~%  ~s ... ");

    static private final SubLString $str4$_s_found_ = makeString("~s found.");

    static private final SubLString $str5$__Preparing_to_kill__s_proprietar = makeString("~%Preparing to kill ~s proprietary constants.  Go ahead? ");



    static private final SubLString $str7$___s_terms_killed_ = makeString("~%~s terms killed.");

    static private final SubLString $str8$__Done_ = makeString("~%Done.");

    static private final SubLString $str9$__Returning_to_Lisp_Interactor_ = makeString("~%Returning to Lisp Interactor.");

    static private final SubLString $str14$_S_is_not_a_KB_datastructure_obje = makeString("~S is not a KB datastructure object");

    private static final SubLSymbol KB_HANDLE_INTERNAL_CONSTANT_METHOD = makeSymbol("KB-HANDLE-INTERNAL-CONSTANT-METHOD");

    private static final SubLSymbol KB_HANDLE_INTERNAL_NART_METHOD = makeSymbol("KB-HANDLE-INTERNAL-NART-METHOD");

    private static final SubLSymbol KB_HANDLE_INTERNAL_VARIABLE_METHOD = makeSymbol("KB-HANDLE-INTERNAL-VARIABLE-METHOD");

    private static final SubLSymbol KB_HANDLE_INTERNAL_ASSERTION_METHOD = makeSymbol("KB-HANDLE-INTERNAL-ASSERTION-METHOD");

    private static final SubLSymbol KB_HANDLE_INTERNAL_DEDUCTION_METHOD = makeSymbol("KB-HANDLE-INTERNAL-DEDUCTION-METHOD");

    private static final SubLSymbol FIND_NART_BY_ID = makeSymbol("FIND-NART-BY-ID");

    private static final SubLSymbol FIND_VARIABLE_BY_ID = makeSymbol("FIND-VARIABLE-BY-ID");

    private static final SubLSymbol FIND_DEDUCTION_BY_ID = makeSymbol("FIND-DEDUCTION-BY-ID");

    static private final SubLList $list31 = list(makeSymbol("FORT-P"), makeSymbol("ASSERTION-P"), makeSymbol("VARIABLE-P"), makeSymbol("DEDUCTION-P"));

    static private final SubLSymbol $sym34$CONSTANT_OR_NAT_ = makeSymbol("CONSTANT-OR-NAT?");

    static private final SubLString $str38$do_broad_mt_index = makeString("do-broad-mt-index");

    static private final SubLString $str41$_a = makeString("~a");

    static private final SubLString $str42$ = makeString("");

    static private final SubLSymbol $sym43$STRING_ = makeSymbol("STRING<");

    private static final SubLSymbol COERCE_NAME = makeSymbol("COERCE-NAME");

    static private final SubLString $str45$_s_is_not_a_microtheory_ = makeString("~s is not a microtheory.");



    static private final SubLString $str49$____a__does_not_refer_to_a_valid_ = makeString("~&'~a' does not refer to a valid term~%");



    static private final SubLSymbol $sym52$VALID_CONSTANT_ = makeSymbol("VALID-CONSTANT?");



    private static final SubLObject $$InstanceNamedFn_Ternary = reader_make_constant_shell("InstanceNamedFn-Ternary");

    private static final SubLSymbol GET_CYC_TERM_EXTERNAL_IDENTIFIERS = makeSymbol("GET-CYC-TERM-EXTERNAL-IDENTIFIERS");

    static private final SubLString $str56$_ = makeString("\"");

    private static final SubLSymbol GET_CYC_TERM_EXTERNAL_IDENITIFIERS_FOR_LIST = makeSymbol("GET-CYC-TERM-EXTERNAL-IDENITIFIERS-FOR-LIST");

    private static final SubLSymbol SERIALIZE_EXTERNAL_XML_TAG_FOR_CYCL_TERM = makeSymbol("SERIALIZE-EXTERNAL-XML-TAG-FOR-CYCL-TERM");

    private static final SubLString $$$concept = makeString("concept");

    private static final SubLString $$$nl = makeString("nl");

    private static final SubLString $$$cycl = makeString("cycl");

    private static final SubLString $$$uri = makeString("uri");

    private static final SubLString $str64$urn_cyc__cycapi_concept_ = makeString("urn:cyc:/cycapi/concept/");

    // Definitions
    public static final SubLObject kill_proprietary_constants_alt(SubLObject collections) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject kill_these = NIL;
                SubLObject count = ZERO_INTEGER;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        format(T, $str_alt2$__Collecting_proprietary_constant);
                        {
                            SubLObject cdolist_list_var = collections;
                            SubLObject c = NIL;
                            for (c = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , c = cdolist_list_var.first()) {
                                format(T, $str_alt3$_____s_____, c);
                                {
                                    SubLObject units = isa.all_fort_instances(c, UNPROVIDED, UNPROVIDED);
                                    SubLObject len = length(units);
                                    kill_these = union(kill_these, units, UNPROVIDED, UNPROVIDED);
                                    format(T, $str_alt4$_s_found_, len);
                                }
                            }
                        }
                        if (NIL != UserIO.user_confirm(format(NIL, $str_alt5$__Preparing_to_kill__s_proprietar, length(kill_these)))) {
                            {
                                SubLObject cdolist_list_var = kill_these;
                                SubLObject k = NIL;
                                for (k = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , k = cdolist_list_var.first()) {
                                    if (((NIL != forts.fort_p(k)) || ((NIL != term.hl_ground_nautP(k)) && (NIL != narts_high.find_nart(k)))) && (NIL == isa.isa_in_any_mtP(k, $$Microtheory))) {
                                        fi.fi_kill_int(k);
                                        count = add(count, ONE_INTEGER);
                                        if (mod(count, TEN_INTEGER).numE(ZERO_INTEGER)) {
                                            format(T, $str_alt7$___s_terms_killed_, count);
                                        }
                                    }
                                }
                            }
                            {
                                SubLObject cdolist_list_var = kill_these;
                                SubLObject k = NIL;
                                for (k = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , k = cdolist_list_var.first()) {
                                    if (((NIL != forts.fort_p(k)) || ((NIL != term.hl_ground_nautP(k)) && (NIL != narts_high.find_nart(k)))) && (NIL != isa.isa_in_any_mtP(k, $$Microtheory))) {
                                        fi.fi_kill_int(k);
                                        count = add(count, ONE_INTEGER);
                                        if (mod(count, TEN_INTEGER).numE(ZERO_INTEGER)) {
                                            format(T, $str_alt7$___s_terms_killed_, count);
                                        }
                                    }
                                }
                            }
                            format(T, $str_alt8$__Done_);
                        } else {
                            format(T, $str_alt9$__Returning_to_Lisp_Interactor_);
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return DONE;
            }
        }
    }

    // Definitions
    public static SubLObject kill_proprietary_constants(final SubLObject collections) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject kill_these = NIL;
        SubLObject count = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            format(T, $str2$__Collecting_proprietary_constant);
            SubLObject cdolist_list_var = collections;
            SubLObject c = NIL;
            c = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                format(T, $str3$_____s_____, c);
                final SubLObject units = isa.all_fort_instances(c, UNPROVIDED, UNPROVIDED);
                final SubLObject len = length(units);
                kill_these = union(kill_these, units, UNPROVIDED, UNPROVIDED);
                format(T, $str4$_s_found_, len);
                cdolist_list_var = cdolist_list_var.rest();
                c = cdolist_list_var.first();
            } 
            if (NIL != UserIO.user_confirm(format(NIL, $str5$__Preparing_to_kill__s_proprietar, length(kill_these)))) {
                cdolist_list_var = kill_these;
                SubLObject k = NIL;
                k = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (((NIL != forts.fort_p(k)) || ((NIL != term.hl_ground_nautP(k)) && (NIL != narts_high.find_nart(k)))) && (NIL == isa.isa_in_any_mtP(k, $$Microtheory))) {
                        fi.fi_kill_int(k);
                        count = add(count, ONE_INTEGER);
                        if (mod(count, TEN_INTEGER).numE(ZERO_INTEGER)) {
                            format(T, $str7$___s_terms_killed_, count);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    k = cdolist_list_var.first();
                } 
                cdolist_list_var = kill_these;
                k = NIL;
                k = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (((NIL != forts.fort_p(k)) || ((NIL != term.hl_ground_nautP(k)) && (NIL != narts_high.find_nart(k)))) && (NIL != isa.isa_in_any_mtP(k, $$Microtheory))) {
                        fi.fi_kill_int(k);
                        count = add(count, ONE_INTEGER);
                        if (mod(count, TEN_INTEGER).numE(ZERO_INTEGER)) {
                            format(T, $str7$___s_terms_killed_, count);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    k = cdolist_list_var.first();
                } 
                format(T, $str8$__Done_);
            } else {
                format(T, $str9$__Returning_to_Lisp_Interactor_);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return DONE;
    }

    public static final SubLObject make_lispy_form_alt(SubLObject form) {
        if (NIL != assertion_handles.assertion_p(form)) {
            return com.cyc.cycjava.cycl.misc_kb_utilities.make_lispy_form(fi.assertion_fi_formula(form, UNPROVIDED));
        } else {
            if (form.isCons()) {
                {
                    SubLObject assertion = list_utilities.tree_find_if(symbol_function(ASSERTION_P), form, UNPROVIDED);
                    if (NIL != assertion) {
                        return com.cyc.cycjava.cycl.misc_kb_utilities.make_lispy_form(subst(fi.assertion_fi_formula(assertion, UNPROVIDED), assertion, form, symbol_function(EQUAL), UNPROVIDED));
                    } else {
                        {
                            SubLObject nart = list_utilities.tree_find_if(symbol_function(NART_P), form, UNPROVIDED);
                            if (NIL != nart) {
                                return com.cyc.cycjava.cycl.misc_kb_utilities.make_lispy_form(subst(narts_high.nart_hl_formula(nart), nart, form, symbol_function(EQUAL), UNPROVIDED));
                            } else {
                                return form;
                            }
                        }
                    }
                }
            } else {
                if (NIL != nart_handles.nart_p(form)) {
                    return com.cyc.cycjava.cycl.misc_kb_utilities.make_lispy_form(narts_high.nart_hl_formula(form));
                } else {
                    return form;
                }
            }
        }
    }

    public static SubLObject make_lispy_form(final SubLObject form) {
        if (NIL != assertion_handles.assertion_p(form)) {
            return make_lispy_form(fi.assertion_fi_formula(form, UNPROVIDED));
        }
        if (form.isCons()) {
            final SubLObject assertion = list_utilities.tree_find_if(symbol_function(ASSERTION_P), form, UNPROVIDED);
            if (NIL != assertion) {
                return make_lispy_form(subst(fi.assertion_fi_formula(assertion, UNPROVIDED), assertion, form, symbol_function(EQUAL), UNPROVIDED));
            }
            final SubLObject nart = list_utilities.tree_find_if(symbol_function(NART_P), form, UNPROVIDED);
            if (NIL != nart) {
                return make_lispy_form(subst(narts_high.nart_hl_formula(nart), nart, form, symbol_function(EQUAL), UNPROVIDED));
            }
            return form;
        } else {
            if (NIL != nart_handles.nart_p(form)) {
                return make_lispy_form(narts_high.nart_hl_formula(form));
            }
            return form;
        }
    }

    public static final SubLObject cycl_from_id_alt(SubLObject assertion_id) {
        {
            SubLObject assertion = assertion_handles.find_assertion_by_id(assertion_id);
            if (NIL != assertion) {
                return com.cyc.cycjava.cycl.misc_kb_utilities.make_lispy_form(assertion);
            } else {
                return NIL;
            }
        }
    }

    public static SubLObject cycl_from_id(final SubLObject assertion_id) {
        final SubLObject assertion = assertion_handles.find_assertion_by_id(assertion_id);
        if (NIL != assertion) {
            return make_lispy_form(assertion);
        }
        return NIL;
    }

    public static final SubLObject name_of_car_alt(SubLObject form) {
        return constants_high.constant_name(form.first());
    }

    public static SubLObject name_of_car(final SubLObject form) {
        return constants_high.constant_name(form.first());
    }

    /**
     * Return a type and an identifier which together specify
     * a unique handle for OBJECT.
     */
    @LispMethod(comment = "Return a type and an identifier which together specify\r\na unique handle for OBJECT.\nReturn a type and an identifier which together specify\na unique handle for OBJECT.")
    public static final SubLObject kb_handle_alt(SubLObject v_object) {
        return com.cyc.cycjava.cycl.misc_kb_utilities.kb_handle_internal(v_object);
    }

    /**
     * Return a type and an identifier which together specify
     * a unique handle for OBJECT.
     */
    @LispMethod(comment = "Return a type and an identifier which together specify\r\na unique handle for OBJECT.\nReturn a type and an identifier which together specify\na unique handle for OBJECT.")
    public static SubLObject kb_handle(final SubLObject v_object) {
        return kb_handle_internal(v_object);
    }

    public static final SubLObject kb_handle_internal_alt(SubLObject v_object) {
        {
            SubLObject method_function = method_func(v_object, $kb_handle_internal_method_table$.getGlobalValue());
            if (NIL != method_function) {
                return funcall(method_function, v_object);
            }
            Errors.error($str_alt14$_S_is_not_a_KB_datastructure_obje, v_object);
            return NIL;
        }
    }

    public static SubLObject kb_handle_internal(final SubLObject v_object) {
        final SubLObject method_function = method_func(v_object, $kb_handle_internal_method_table$.getGlobalValue());
        if (NIL != method_function) {
            return funcall(method_function, v_object);
        }
        Errors.error($str14$_S_is_not_a_KB_datastructure_obje, v_object);
        return NIL;
    }

    public static final SubLObject kb_handle_internal_constant_method_alt(SubLObject v_object) {
        return values($CONSTANT, constants_high.constant_internal_id(v_object));
    }

    public static SubLObject kb_handle_internal_constant_method(final SubLObject v_object) {
        return values($CONSTANT, constants_high.constant_internal_id(v_object));
    }

    public static final SubLObject kb_handle_internal_nart_method_alt(SubLObject v_object) {
        return com.cyc.cycjava.cycl.misc_kb_utilities.kb_handle_internal_nart(v_object);
    }

    public static SubLObject kb_handle_internal_nart_method(final SubLObject v_object) {
        return kb_handle_internal_nart(v_object);
    }

    public static final SubLObject kb_handle_internal_nart_alt(SubLObject nart) {
        return values($NART, nart_handles.nart_id(nart));
    }

    public static SubLObject kb_handle_internal_nart(final SubLObject nart) {
        return values($NART, nart_handles.nart_id(nart));
    }

    public static final SubLObject kb_handle_internal_variable_method_alt(SubLObject v_object) {
        return values($VARIABLE, variables.variable_id(v_object));
    }

    public static SubLObject kb_handle_internal_variable_method(final SubLObject v_object) {
        return values($VARIABLE, variables.variable_id(v_object));
    }

    public static final SubLObject kb_handle_internal_assertion_method_alt(SubLObject v_object) {
        return values($ASSERTION, assertion_handles.assertion_id(v_object));
    }

    public static SubLObject kb_handle_internal_assertion_method(final SubLObject v_object) {
        return values($ASSERTION, assertion_handles.assertion_id(v_object));
    }

    public static final SubLObject kb_handle_internal_deduction_method_alt(SubLObject v_object) {
        return values($DEDUCTION, deduction_handles.deduction_id(v_object));
    }

    public static SubLObject kb_handle_internal_deduction_method(final SubLObject v_object) {
        return values($DEDUCTION, deduction_handles.deduction_id(v_object));
    }

    /**
     * Return the KB object specified by a unique TYPE ID handle.
     */
    @LispMethod(comment = "Return the KB object specified by a unique TYPE ID handle.")
    public static final SubLObject find_object_by_kb_handle_alt(SubLObject type, SubLObject id) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject method = second(assoc(type, $find_object_by_kb_handle_methods$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED));
                if (NIL != method) {
                    return funcall(method, id);
                }
            }
            return NIL;
        }
    }

    /**
     * Return the KB object specified by a unique TYPE ID handle.
     */
    @LispMethod(comment = "Return the KB object specified by a unique TYPE ID handle.")
    public static SubLObject find_object_by_kb_handle(final SubLObject type, final SubLObject id) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject method = second(assoc(type, $find_object_by_kb_handle_methods$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED));
        if (NIL != method) {
            return funcall(method, id);
        }
        return NIL;
    }

    public static final SubLObject register_find_object_by_kb_handle_method_alt(SubLObject type, SubLObject method) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            $find_object_by_kb_handle_methods$.setDynamicValue(delete(type, $find_object_by_kb_handle_methods$.getDynamicValue(thread), symbol_function(EQL), symbol_function(FIRST), UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
            $find_object_by_kb_handle_methods$.setDynamicValue(cons(list(type, method), $find_object_by_kb_handle_methods$.getDynamicValue(thread)), thread);
            return NIL;
        }
    }

    public static SubLObject register_find_object_by_kb_handle_method(final SubLObject type, final SubLObject method) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $find_object_by_kb_handle_methods$.setDynamicValue(delete(type, $find_object_by_kb_handle_methods$.getDynamicValue(thread), symbol_function(EQL), symbol_function(FIRST), UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
        $find_object_by_kb_handle_methods$.setDynamicValue(cons(list(type, method), $find_object_by_kb_handle_methods$.getDynamicValue(thread)), thread);
        return NIL;
    }

    /**
     * If object is a lispy nat, or is a KB datastructure object,
     * return a list consisting of a type keyword and an id for object,
     * else return nil.
     */
    @LispMethod(comment = "If object is a lispy nat, or is a KB datastructure object,\r\nreturn a list consisting of a type keyword and an id for object,\r\nelse return nil.\nIf object is a lispy nat, or is a KB datastructure object,\nreturn a list consisting of a type keyword and an id for object,\nelse return nil.")
    public static final SubLObject list_kb_handle_alt(SubLObject v_object) {
        v_object = function_terms.naut_to_nart(v_object);
        {
            SubLObject kb_datastructure_objectP = NIL;
            if (NIL == kb_datastructure_objectP) {
                {
                    SubLObject csome_list_var = $list_alt31;
                    SubLObject pred = NIL;
                    for (pred = csome_list_var.first(); !((NIL != kb_datastructure_objectP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , pred = csome_list_var.first()) {
                        kb_datastructure_objectP = funcall(pred, v_object);
                    }
                }
            }
            return NIL != kb_datastructure_objectP ? ((SubLObject) (arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.misc_kb_utilities.kb_handle(v_object))))) : NIL;
        }
    }

    /**
     * If object is a lispy nat, or is a KB datastructure object,
     * return a list consisting of a type keyword and an id for object,
     * else return nil.
     */
    @LispMethod(comment = "If object is a lispy nat, or is a KB datastructure object,\r\nreturn a list consisting of a type keyword and an id for object,\r\nelse return nil.\nIf object is a lispy nat, or is a KB datastructure object,\nreturn a list consisting of a type keyword and an id for object,\nelse return nil.")
    public static SubLObject list_kb_handle(SubLObject v_object) {
        v_object = function_terms.naut_to_nart(v_object);
        SubLObject kb_datastructure_objectP = NIL;
        if (NIL == kb_datastructure_objectP) {
            SubLObject csome_list_var;
            SubLObject pred;
            for (csome_list_var = $list31, pred = NIL, pred = csome_list_var.first(); (NIL == kb_datastructure_objectP) && (NIL != csome_list_var); kb_datastructure_objectP = funcall(pred, v_object) , csome_list_var = csome_list_var.rest() , pred = csome_list_var.first()) {
            }
        }
        return NIL != kb_datastructure_objectP ? arg2(resetMultipleValues(), multiple_value_list(kb_handle(v_object))) : NIL;
    }

    /**
     * If id and type together constitute the unique id of a KB
     * datastructure object, return the FI form (lispy form) of the object,
     * else return nil.
     */
    @LispMethod(comment = "If id and type together constitute the unique id of a KB\r\ndatastructure object, return the FI form (lispy form) of the object,\r\nelse return nil.\nIf id and type together constitute the unique id of a KB\ndatastructure object, return the FI form (lispy form) of the object,\nelse return nil.")
    public static final SubLObject fi_object_from_handle_alt(SubLObject id, SubLObject type) {
        if (type == UNPROVIDED) {
            type = $CONSTANT;
        }
        SubLTrampolineFile.checkType(id, INTEGERP);
        SubLTrampolineFile.checkType(type, KEYWORDP);
        return com.cyc.cycjava.cycl.misc_kb_utilities.make_lispy_form(com.cyc.cycjava.cycl.misc_kb_utilities.find_object_by_kb_handle(type, id));
    }

    /**
     * If id and type together constitute the unique id of a KB
     * datastructure object, return the FI form (lispy form) of the object,
     * else return nil.
     */
    @LispMethod(comment = "If id and type together constitute the unique id of a KB\r\ndatastructure object, return the FI form (lispy form) of the object,\r\nelse return nil.\nIf id and type together constitute the unique id of a KB\ndatastructure object, return the FI form (lispy form) of the object,\nelse return nil.")
    public static SubLObject fi_object_from_handle(final SubLObject id, SubLObject type) {
        if (type == UNPROVIDED) {
            type = $CONSTANT;
        }
        assert NIL != integerp(id) : "! integerp(id) " + ("Types.integerp(id) " + "CommonSymbols.NIL != Types.integerp(id) ") + id;
        assert NIL != keywordp(type) : "! keywordp(type) " + ("Types.keywordp(type) " + "CommonSymbols.NIL != Types.keywordp(type) ") + type;
        return make_lispy_form(find_object_by_kb_handle(type, id));
    }

    /**
     *
     *
     * @unknown this function breaks for nart with id 0, which will be mistaken by term-from-id for the constant with id 0.
     */
    @LispMethod(comment = "@unknown this function breaks for nart with id 0, which will be mistaken by term-from-id for the constant with id 0.")
    public static final SubLObject get_term_id_alt(SubLObject v_term) {
        v_term = function_terms.naut_to_nart(v_term);
        if (NIL == forts.valid_fortP(v_term)) {
            return NIL;
        }
        if (NIL != nart_handles.nart_p(v_term)) {
            return minus(nart_handles.nart_id(v_term));
        } else {
            if (NIL != constant_p(v_term)) {
                return constants_high.constant_internal_id(v_term);
            } else {
                return NIL;
            }
        }
    }

    /**
     *
     *
     * @unknown this function breaks for nart with id 0, which will be mistaken by term-from-id for the constant with id 0.
     */
    @LispMethod(comment = "@unknown this function breaks for nart with id 0, which will be mistaken by term-from-id for the constant with id 0.")
    public static SubLObject get_term_id(SubLObject v_term) {
        v_term = function_terms.naut_to_nart(v_term);
        if (NIL == forts.valid_fortP(v_term)) {
            return NIL;
        }
        if (NIL != nart_handles.nart_p(v_term)) {
            return minus(nart_handles.nart_id(v_term));
        }
        if (NIL != constant_p(v_term)) {
            return constants_high.constant_internal_id(v_term);
        }
        return NIL;
    }

    public static final SubLObject term_from_id_alt(SubLObject id) {
        if (!id.isInteger()) {
            return NIL;
        }
        {
            SubLObject v_term = NIL;
            if (id.isNegative()) {
                v_term = nart_handles.find_nart_by_id(minus(id));
            } else {
                v_term = constants_high.find_constant_by_internal_id(id);
            }
            return com.cyc.cycjava.cycl.misc_kb_utilities.make_lispy_form(v_term);
        }
    }

    public static SubLObject term_from_id(final SubLObject id) {
        if (!id.isInteger()) {
            return NIL;
        }
        SubLObject v_term = NIL;
        if (id.isNegative()) {
            v_term = nart_handles.find_nart_by_id(minus(id));
        } else {
            v_term = constants_high.find_constant_by_internal_id(id);
        }
        return make_lispy_form(v_term);
    }

    public static final SubLObject not_a_cyc_constantP_alt(SubLObject obj) {
        return makeBoolean(NIL == constant_p(obj));
    }

    public static SubLObject not_a_cyc_constantP(final SubLObject obj) {
        return makeBoolean(NIL == constant_p(obj));
    }

    public static final SubLObject gather_constants_alt(SubLObject form) {
        if (NIL != com.cyc.cycjava.cycl.misc_kb_utilities.constant_or_natP(form)) {
            return list(form);
        } else {
            return list_utilities.cons_tree_gather(form, symbol_function($sym34$CONSTANT_OR_NAT_), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject gather_constants(final SubLObject form) {
        if (NIL != constant_or_natP(form)) {
            return list(form);
        }
        return list_utilities.cons_tree_gather(form, symbol_function($sym34$CONSTANT_OR_NAT_), symbol_function(EQUAL), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject constant_or_natP_alt(SubLObject obj) {
        return makeBoolean((NIL != forts.valid_fortP(obj)) || ((NIL != term.hl_ground_nautP(obj)) && (NIL != forts.valid_fortP(narts_high.find_nart(obj)))));
    }

    public static SubLObject constant_or_natP(final SubLObject obj) {
        return makeBoolean((NIL != forts.valid_fortP(obj)) || ((NIL != term.hl_ground_nautP(obj)) && (NIL != forts.valid_fortP(narts_high.find_nart(obj)))));
    }

    public static final SubLObject nat_objectP_alt(SubLObject obj) {
        return makeBoolean((NIL != term.hl_ground_nautP(obj)) || (NIL != term.hl_ground_nautP(function_terms.nart_to_naut(obj))));
    }

    public static SubLObject nat_objectP(final SubLObject obj) {
        return makeBoolean((NIL != term.hl_ground_nautP(obj)) || (NIL != term.hl_ground_nautP(function_terms.nart_to_naut(obj))));
    }

    public static final SubLObject remove_mt_assertions_alt(SubLObject mt) {
        tms.tms_remove_mt_arguments(mt, UNPROVIDED);
        return com.cyc.cycjava.cycl.misc_kb_utilities.empty_mt_p(mt);
    }

    public static SubLObject remove_mt_assertions(final SubLObject mt) {
        tms.tms_remove_mt_arguments(mt, UNPROVIDED);
        return empty_mt_p(mt);
    }

    public static final SubLObject empty_mt_p_alt(SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject found = NIL;
                SubLObject pcase_var = kb_mapping_macros.do_mt_contents_method(mt);
                if (pcase_var.eql($MT)) {
                    if (NIL != kb_mapping_macros.do_mt_index_key_validator(mt, NIL)) {
                        {
                            SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec(mt);
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, NIL, NIL, NIL);
                                {
                                    SubLObject done_var = found;
                                    SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        {
                                            SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                                            SubLObject valid = makeBoolean(token_var != ass);
                                            if (NIL != valid) {
                                                found = T;
                                            }
                                            done_var = makeBoolean((NIL == valid) || (NIL != found));
                                        }
                                    } 
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (pcase_var.eql($BROAD_MT)) {
                        if (NIL != kb_mapping_macros.do_broad_mt_index_key_validator(mt, NIL)) {
                            {
                                SubLObject catch_var = NIL;
                                try {
                                    {
                                        SubLObject idx = assertion_handles.do_assertions_table();
                                        SubLObject total = id_index_count(idx);
                                        SubLObject sofar = ZERO_INTEGER;
                                        SubLTrampolineFile.checkType($str_alt38$do_broad_mt_index, STRINGP);
                                        {
                                            SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                                            SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                            try {
                                                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                                $last_percent_progress_prediction$.bind(NIL, thread);
                                                $within_noting_percent_progress$.bind(T, thread);
                                                $percent_progress_start_time$.bind(get_universal_time(), thread);
                                                noting_percent_progress_preamble($str_alt38$do_broad_mt_index);
                                                if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                                                    {
                                                        SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
                                                        SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
                                                        SubLObject ass = NIL;
                                                        while (NIL != id) {
                                                            ass = do_id_index_state_object(idx, $SKIP, id, state_var);
                                                            if (NIL != do_id_index_id_and_object_validP(id, ass, $SKIP)) {
                                                                note_percent_progress(sofar, total);
                                                                sofar = add(sofar, ONE_INTEGER);
                                                                if (NIL != found) {
                                                                    mapping_finished();
                                                                }
                                                                if (NIL != kb_mapping_macros.do_broad_mt_index_match_p(ass, mt, NIL, NIL)) {
                                                                    found = T;
                                                                }
                                                            }
                                                            id = do_id_index_next_id(idx, T, id, state_var);
                                                            state_var = do_id_index_next_state(idx, T, id, state_var);
                                                        } 
                                                    }
                                                }
                                                noting_percent_progress_postamble();
                                            } finally {
                                                $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                                $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                                $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                                $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                                            }
                                        }
                                    }
                                } catch (Throwable ccatch_env_var) {
                                    catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
                                }
                            }
                        }
                    }
                }
                return makeBoolean(NIL == found);
            }
        }
    }

    public static SubLObject empty_mt_p(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject found = NIL;
        final SubLObject pcase_var = kb_mapping_macros.do_mt_contents_method(mt);
        if (pcase_var.eql($MT)) {
            if (NIL != kb_mapping_macros.do_mt_index_key_validator(mt, NIL)) {
                final SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec(mt);
                SubLObject final_index_iterator = NIL;
                try {
                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, NIL, NIL, NIL);
                    SubLObject done_var = found;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(ass));
                        if (NIL != valid) {
                            found = T;
                        }
                        done_var = makeBoolean((NIL == valid) || (NIL != found));
                    } 
                } finally {
                    final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        if (NIL != final_index_iterator) {
                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                        }
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                    }
                }
            }
        } else
            if (pcase_var.eql($BROAD_MT) && (NIL != kb_mapping_macros.do_broad_mt_index_key_validator(mt, NIL))) {
                SubLObject catch_var = NIL;
                try {
                    thread.throwStack.push($MAPPING_DONE);
                    final SubLObject idx = assertion_handles.do_assertions_table();
                    final SubLObject mess = $str38$do_broad_mt_index;
                    final SubLObject total = id_index_count(idx);
                    SubLObject sofar = ZERO_INTEGER;
                    assert NIL != stringp(mess) : "! stringp(mess) " + ("Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) ") + mess;
                    final SubLObject _prev_bind_2 = $last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = $last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = $within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        try {
                            noting_percent_progress_preamble(mess);
                            final SubLObject idx_$1 = idx;
                            if (NIL == id_index_objects_empty_p(idx_$1, $SKIP)) {
                                final SubLObject idx_$2 = idx_$1;
                                if (NIL == id_index_dense_objects_empty_p(idx_$2, $SKIP)) {
                                    final SubLObject vector_var = id_index_dense_objects(idx_$2);
                                    final SubLObject backwardP_var = NIL;
                                    SubLObject length;
                                    SubLObject v_iteration;
                                    SubLObject a_id;
                                    SubLObject a_handle;
                                    SubLObject ass2;
                                    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                        a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                        a_handle = aref(vector_var, a_id);
                                        if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                            if (NIL != id_index_tombstone_p(a_handle)) {
                                                a_handle = $SKIP;
                                            }
                                            ass2 = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                            if (NIL != found) {
                                                mapping_finished();
                                            }
                                            if (NIL != kb_mapping_macros.do_broad_mt_index_match_p(ass2, mt, NIL, NIL)) {
                                                found = T;
                                            }
                                            sofar = add(sofar, ONE_INTEGER);
                                            note_percent_progress(sofar, total);
                                        }
                                    }
                                }
                                final SubLObject idx_$3 = idx_$1;
                                if ((NIL == id_index_sparse_objects_empty_p(idx_$3)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                    final SubLObject sparse = id_index_sparse_objects(idx_$3);
                                    SubLObject a_id2 = id_index_sparse_id_threshold(idx_$3);
                                    final SubLObject end_id = id_index_next_id(idx_$3);
                                    final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                                    while (a_id2.numL(end_id)) {
                                        final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                                        if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                            final SubLObject ass3 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                            if (NIL != found) {
                                                mapping_finished();
                                            }
                                            if (NIL != kb_mapping_macros.do_broad_mt_index_match_p(ass3, mt, NIL, NIL)) {
                                                found = T;
                                            }
                                            sofar = add(sofar, ONE_INTEGER);
                                            note_percent_progress(sofar, total);
                                        }
                                        a_id2 = add(a_id2, ONE_INTEGER);
                                    } 
                                }
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                noting_percent_progress_postamble();
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                            }
                        }
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_5, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_4, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_3, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_2, thread);
                    }
                } catch (final Throwable ccatch_env_var) {
                    catch_var = Errors.handleThrowable(ccatch_env_var, $MAPPING_DONE);
                } finally {
                    thread.throwStack.pop();
                }
            }

        return makeBoolean(NIL == found);
    }

    public static final SubLObject coerce_name_alt(SubLObject obj) {
        if (NIL != constant_p(obj)) {
            {
                SubLObject name = constants_high.constant_name(obj);
                if (name.isString()) {
                    return name;
                } else {
                    if (NIL != nart_handles.nart_p(obj)) {
                        return string_utilities.string_remove_constant_reader_prefixes(format(NIL, $str_alt41$_a, narts_high.nart_hl_formula(obj)));
                    } else {
                        return string_utilities.string_remove_constant_reader_prefixes(format(NIL, $str_alt41$_a, obj));
                    }
                }
            }
        } else {
            if (NIL != term.hl_ground_nautP(obj)) {
                return string_utilities.string_remove_constant_reader_prefixes(format(NIL, $str_alt41$_a, obj));
            } else {
                if (NIL != string_utilities.non_empty_stringP(obj)) {
                    return obj;
                } else {
                    if (NIL == obj) {
                        return $str_alt42$;
                    } else {
                        return format(NIL, $str_alt41$_a, obj);
                    }
                }
            }
        }
    }

    public static SubLObject coerce_name(final SubLObject obj) {
        if (NIL != constant_p(obj)) {
            final SubLObject name = constants_high.constant_name(obj);
            if (name.isString()) {
                return name;
            }
            if (NIL != nart_handles.nart_p(obj)) {
                return string_utilities.string_remove_constant_reader_prefixes(format(NIL, $str41$_a, narts_high.nart_hl_formula(obj)));
            }
            return string_utilities.string_remove_constant_reader_prefixes(format(NIL, $str41$_a, obj));
        } else {
            if (NIL != term.hl_ground_nautP(obj)) {
                return string_utilities.string_remove_constant_reader_prefixes(format(NIL, $str41$_a, obj));
            }
            if (NIL != string_utilities.non_empty_stringP(obj)) {
                return obj;
            }
            if (NIL == obj) {
                return $str42$;
            }
            return format(NIL, $str41$_a, obj);
        }
    }

    public static final SubLObject terms_in_mt_alt(SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_boolean = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        v_boolean = isa.isaP(mt, $$Microtheory, UNPROVIDED, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                if ((NIL != forts.valid_fortP(mt)) && (NIL != v_boolean)) {
                    {
                        SubLObject terms = NIL;
                        SubLObject pcase_var = kb_mapping_macros.do_mt_contents_method(mt);
                        if (pcase_var.eql($MT)) {
                            if (NIL != kb_mapping_macros.do_mt_index_key_validator(mt, NIL)) {
                                {
                                    SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec(mt);
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, NIL, NIL, NIL);
                                        {
                                            SubLObject done_var = NIL;
                                            SubLObject token_var = NIL;
                                            while (NIL == done_var) {
                                                {
                                                    SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                                                    SubLObject valid = makeBoolean(token_var != ass);
                                                    if (NIL != valid) {
                                                        {
                                                            SubLObject form = com.cyc.cycjava.cycl.misc_kb_utilities.make_lispy_form(ass);
                                                            terms = union(terms, list_utilities.tree_gather(form, symbol_function($sym34$CONSTANT_OR_NAT_), UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                                                        }
                                                    }
                                                    done_var = makeBoolean(NIL == valid);
                                                }
                                            } 
                                        }
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                if (NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (pcase_var.eql($BROAD_MT)) {
                                if (NIL != kb_mapping_macros.do_broad_mt_index_key_validator(mt, NIL)) {
                                    {
                                        SubLObject idx = assertion_handles.do_assertions_table();
                                        SubLObject total = id_index_count(idx);
                                        SubLObject sofar = ZERO_INTEGER;
                                        SubLTrampolineFile.checkType($str_alt38$do_broad_mt_index, STRINGP);
                                        {
                                            SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                                            SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                                            SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                            try {
                                                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                                $last_percent_progress_prediction$.bind(NIL, thread);
                                                $within_noting_percent_progress$.bind(T, thread);
                                                $percent_progress_start_time$.bind(get_universal_time(), thread);
                                                noting_percent_progress_preamble($str_alt38$do_broad_mt_index);
                                                if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                                                    {
                                                        SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
                                                        SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
                                                        SubLObject ass = NIL;
                                                        while (NIL != id) {
                                                            ass = do_id_index_state_object(idx, $SKIP, id, state_var);
                                                            if (NIL != do_id_index_id_and_object_validP(id, ass, $SKIP)) {
                                                                note_percent_progress(sofar, total);
                                                                sofar = add(sofar, ONE_INTEGER);
                                                                if (NIL != kb_mapping_macros.do_broad_mt_index_match_p(ass, mt, NIL, NIL)) {
                                                                    {
                                                                        SubLObject form = com.cyc.cycjava.cycl.misc_kb_utilities.make_lispy_form(ass);
                                                                        terms = union(terms, list_utilities.tree_gather(form, symbol_function($sym34$CONSTANT_OR_NAT_), UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                                                                    }
                                                                }
                                                            }
                                                            id = do_id_index_next_id(idx, T, id, state_var);
                                                            state_var = do_id_index_next_state(idx, T, id, state_var);
                                                        } 
                                                    }
                                                }
                                                noting_percent_progress_postamble();
                                            } finally {
                                                $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                                $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                                $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                                $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                        return Sort.sort(copy_list(terms), symbol_function($sym43$STRING_), symbol_function(COERCE_NAME));
                    }
                } else {
                    Errors.warn($str_alt45$_s_is_not_a_microtheory_, mt);
                    return NIL;
                }
            }
        }
    }

    public static SubLObject terms_in_mt(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_boolean = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            v_boolean = isa.isaP(mt, $$Microtheory, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if ((NIL != forts.valid_fortP(mt)) && (NIL != v_boolean)) {
            SubLObject terms = NIL;
            final SubLObject pcase_var = kb_mapping_macros.do_mt_contents_method(mt);
            if (pcase_var.eql($MT)) {
                if (NIL != kb_mapping_macros.do_mt_index_key_validator(mt, NIL)) {
                    final SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec(mt);
                    SubLObject final_index_iterator = NIL;
                    try {
                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, NIL, NIL, NIL);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(ass));
                            if (NIL != valid) {
                                final SubLObject form = make_lispy_form(ass);
                                terms = union(terms, list_utilities.tree_gather(form, symbol_function($sym34$CONSTANT_OR_NAT_), UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    } finally {
                        final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL != final_index_iterator) {
                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
                        }
                    }
                }
            } else
                if (pcase_var.eql($BROAD_MT) && (NIL != kb_mapping_macros.do_broad_mt_index_key_validator(mt, NIL))) {
                    final SubLObject idx = assertion_handles.do_assertions_table();
                    final SubLObject mess = $str38$do_broad_mt_index;
                    final SubLObject total = id_index_count(idx);
                    SubLObject sofar = ZERO_INTEGER;
                    assert NIL != stringp(mess) : "! stringp(mess) " + ("Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) ") + mess;
                    final SubLObject _prev_bind_4 = $last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = $last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = $within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                        $last_percent_progress_prediction$.bind(NIL, thread);
                        $within_noting_percent_progress$.bind(T, thread);
                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                        try {
                            noting_percent_progress_preamble(mess);
                            final SubLObject idx_$5 = idx;
                            if (NIL == id_index_objects_empty_p(idx_$5, $SKIP)) {
                                final SubLObject idx_$6 = idx_$5;
                                if (NIL == id_index_dense_objects_empty_p(idx_$6, $SKIP)) {
                                    final SubLObject vector_var = id_index_dense_objects(idx_$6);
                                    final SubLObject backwardP_var = NIL;
                                    SubLObject length;
                                    SubLObject v_iteration;
                                    SubLObject a_id;
                                    SubLObject a_handle;
                                    SubLObject ass2;
                                    SubLObject form2;
                                    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                        a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                        a_handle = aref(vector_var, a_id);
                                        if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                            if (NIL != id_index_tombstone_p(a_handle)) {
                                                a_handle = $SKIP;
                                            }
                                            ass2 = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                            if (NIL != kb_mapping_macros.do_broad_mt_index_match_p(ass2, mt, NIL, NIL)) {
                                                form2 = make_lispy_form(ass2);
                                                terms = union(terms, list_utilities.tree_gather(form2, symbol_function($sym34$CONSTANT_OR_NAT_), UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                                            }
                                            sofar = add(sofar, ONE_INTEGER);
                                            note_percent_progress(sofar, total);
                                        }
                                    }
                                }
                                final SubLObject idx_$7 = idx_$5;
                                if ((NIL == id_index_sparse_objects_empty_p(idx_$7)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                    final SubLObject sparse = id_index_sparse_objects(idx_$7);
                                    SubLObject a_id2 = id_index_sparse_id_threshold(idx_$7);
                                    final SubLObject end_id = id_index_next_id(idx_$7);
                                    final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                                    while (a_id2.numL(end_id)) {
                                        final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                                        if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                            final SubLObject ass3 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                            if (NIL != kb_mapping_macros.do_broad_mt_index_match_p(ass3, mt, NIL, NIL)) {
                                                final SubLObject form3 = make_lispy_form(ass3);
                                                terms = union(terms, list_utilities.tree_gather(form3, symbol_function($sym34$CONSTANT_OR_NAT_), UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
                                            }
                                            sofar = add(sofar, ONE_INTEGER);
                                            note_percent_progress(sofar, total);
                                        }
                                        a_id2 = add(a_id2, ONE_INTEGER);
                                    } 
                                }
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                noting_percent_progress_postamble();
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                            }
                        }
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_7, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_6, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_5, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_4, thread);
                    }
                }

            return Sort.sort(copy_list(terms), symbol_function($sym43$STRING_), symbol_function(COERCE_NAME));
        }
        Errors.warn($str45$_s_is_not_a_microtheory_, mt);
        return NIL;
    }

    public static final SubLObject assertion_ids_in_mt_alt(SubLObject mt) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ids = NIL;
                SubLObject pcase_var = kb_mapping_macros.do_mt_contents_method(mt);
                if (pcase_var.eql($MT)) {
                    if (NIL != kb_mapping_macros.do_mt_index_key_validator(mt, NIL)) {
                        {
                            SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec(mt);
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, NIL, NIL, NIL);
                                {
                                    SubLObject done_var = NIL;
                                    SubLObject token_var = NIL;
                                    while (NIL == done_var) {
                                        {
                                            SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                                            SubLObject valid = makeBoolean(token_var != ass);
                                            if (NIL != valid) {
                                                ids = cons(assertion_handles.assertion_id(ass), ids);
                                            }
                                            done_var = makeBoolean(NIL == valid);
                                        }
                                    } 
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    if (pcase_var.eql($BROAD_MT)) {
                        if (NIL != kb_mapping_macros.do_broad_mt_index_key_validator(mt, NIL)) {
                            {
                                SubLObject idx = assertion_handles.do_assertions_table();
                                SubLObject total = id_index_count(idx);
                                SubLObject sofar = ZERO_INTEGER;
                                SubLTrampolineFile.checkType($str_alt38$do_broad_mt_index, STRINGP);
                                {
                                    SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                    try {
                                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                        $last_percent_progress_prediction$.bind(NIL, thread);
                                        $within_noting_percent_progress$.bind(T, thread);
                                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                                        noting_percent_progress_preamble($str_alt38$do_broad_mt_index);
                                        if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                                            {
                                                SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
                                                SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
                                                SubLObject ass = NIL;
                                                while (NIL != id) {
                                                    ass = do_id_index_state_object(idx, $SKIP, id, state_var);
                                                    if (NIL != do_id_index_id_and_object_validP(id, ass, $SKIP)) {
                                                        note_percent_progress(sofar, total);
                                                        sofar = add(sofar, ONE_INTEGER);
                                                        if (NIL != kb_mapping_macros.do_broad_mt_index_match_p(ass, mt, NIL, NIL)) {
                                                            ids = cons(assertion_handles.assertion_id(ass), ids);
                                                        }
                                                    }
                                                    id = do_id_index_next_id(idx, T, id, state_var);
                                                    state_var = do_id_index_next_state(idx, T, id, state_var);
                                                } 
                                            }
                                        }
                                        noting_percent_progress_postamble();
                                    } finally {
                                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                        $last_percent_progress_index$.rebind(_prev_bind_0, thread);
                                    }
                                }
                            }
                        }
                    }
                }
                return nreverse(ids);
            }
        }
    }

    public static SubLObject assertion_ids_in_mt(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ids = NIL;
        final SubLObject pcase_var = kb_mapping_macros.do_mt_contents_method(mt);
        if (pcase_var.eql($MT)) {
            if (NIL != kb_mapping_macros.do_mt_index_key_validator(mt, NIL)) {
                final SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec(mt);
                SubLObject final_index_iterator = NIL;
                try {
                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, NIL, NIL, NIL);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(ass));
                        if (NIL != valid) {
                            ids = cons(assertion_handles.assertion_id(ass), ids);
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                } finally {
                    final SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        if (NIL != final_index_iterator) {
                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                        }
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                    }
                }
            }
        } else
            if (pcase_var.eql($BROAD_MT) && (NIL != kb_mapping_macros.do_broad_mt_index_key_validator(mt, NIL))) {
                final SubLObject idx = assertion_handles.do_assertions_table();
                final SubLObject mess = $str38$do_broad_mt_index;
                final SubLObject total = id_index_count(idx);
                SubLObject sofar = ZERO_INTEGER;
                assert NIL != stringp(mess) : "! stringp(mess) " + ("Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) ") + mess;
                final SubLObject _prev_bind_2 = $last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_5 = $percent_progress_start_time$.currentBinding(thread);
                try {
                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_prediction$.bind(NIL, thread);
                    $within_noting_percent_progress$.bind(T, thread);
                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                    try {
                        noting_percent_progress_preamble(mess);
                        final SubLObject idx_$9 = idx;
                        if (NIL == id_index_objects_empty_p(idx_$9, $SKIP)) {
                            final SubLObject idx_$10 = idx_$9;
                            if (NIL == id_index_dense_objects_empty_p(idx_$10, $SKIP)) {
                                final SubLObject vector_var = id_index_dense_objects(idx_$10);
                                final SubLObject backwardP_var = NIL;
                                SubLObject length;
                                SubLObject v_iteration;
                                SubLObject a_id;
                                SubLObject a_handle;
                                SubLObject ass2;
                                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                    a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                    a_handle = aref(vector_var, a_id);
                                    if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                        if (NIL != id_index_tombstone_p(a_handle)) {
                                            a_handle = $SKIP;
                                        }
                                        ass2 = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                        if (NIL != kb_mapping_macros.do_broad_mt_index_match_p(ass2, mt, NIL, NIL)) {
                                            ids = cons(assertion_handles.assertion_id(ass2), ids);
                                        }
                                        sofar = add(sofar, ONE_INTEGER);
                                        note_percent_progress(sofar, total);
                                    }
                                }
                            }
                            final SubLObject idx_$11 = idx_$9;
                            if ((NIL == id_index_sparse_objects_empty_p(idx_$11)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                final SubLObject sparse = id_index_sparse_objects(idx_$11);
                                SubLObject a_id2 = id_index_sparse_id_threshold(idx_$11);
                                final SubLObject end_id = id_index_next_id(idx_$11);
                                final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                                while (a_id2.numL(end_id)) {
                                    final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                                    if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                        final SubLObject ass3 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                        if (NIL != kb_mapping_macros.do_broad_mt_index_match_p(ass3, mt, NIL, NIL)) {
                                            ids = cons(assertion_handles.assertion_id(ass3), ids);
                                        }
                                        sofar = add(sofar, ONE_INTEGER);
                                        note_percent_progress(sofar, total);
                                    }
                                    a_id2 = add(a_id2, ONE_INTEGER);
                                } 
                            }
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$12 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            noting_percent_progress_postamble();
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$12, thread);
                        }
                    }
                } finally {
                    $percent_progress_start_time$.rebind(_prev_bind_5, thread);
                    $within_noting_percent_progress$.rebind(_prev_bind_4, thread);
                    $last_percent_progress_prediction$.rebind(_prev_bind_3, thread);
                    $last_percent_progress_index$.rebind(_prev_bind_2, thread);
                }
            }

        return nreverse(ids);
    }

    /**
     * Like @xref ke-unassert, but only does the operation when the assertion exists.
     *
     * @return boolean; status code.
     * @unknown tom
     */
    @LispMethod(comment = "Like @xref ke-unassert, but only does the operation when the assertion exists.\r\n\r\n@return boolean; status code.\r\n@unknown tom")
    public static final SubLObject try_unassert_alt(SubLObject sentence, SubLObject mt) {
        if (NIL != fi.sentence_assertions(sentence, mt)) {
            return ke.ke_unassert(sentence, mt);
        }
        return T;
    }

    /**
     * Like @xref ke-unassert, but only does the operation when the assertion exists.
     *
     * @return boolean; status code.
     * @unknown tom
     */
    @LispMethod(comment = "Like @xref ke-unassert, but only does the operation when the assertion exists.\r\n\r\n@return boolean; status code.\r\n@unknown tom")
    public static SubLObject try_unassert(final SubLObject sentence, final SubLObject mt) {
        if (NIL != fi.sentence_assertions(sentence, mt)) {
            return ke.ke_unassert(sentence, mt);
        }
        return T;
    }

    /**
     * Like @xref ke-assert, but only does the operation when the assertion doesn't exist.
     *
     * @return boolean; status code.
     * @unknown tom
     */
    @LispMethod(comment = "Like @xref ke-assert, but only does the operation when the assertion doesn\'t exist.\r\n\r\n@return boolean; status code.\r\n@unknown tom")
    public static final SubLObject try_assert_alt(SubLObject sentence, SubLObject mt, SubLObject strength, SubLObject direction) {
        if (strength == UNPROVIDED) {
            strength = $DEFAULT;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (NIL == fi.sentence_assertions(sentence, mt)) {
            return ke.ke_assert(sentence, mt, strength, direction);
        }
        return T;
    }

    /**
     * Like @xref ke-assert, but only does the operation when the assertion doesn't exist.
     *
     * @return boolean; status code.
     * @unknown tom
     */
    @LispMethod(comment = "Like @xref ke-assert, but only does the operation when the assertion doesn\'t exist.\r\n\r\n@return boolean; status code.\r\n@unknown tom")
    public static SubLObject try_assert(final SubLObject sentence, final SubLObject mt, SubLObject strength, SubLObject direction) {
        if (strength == UNPROVIDED) {
            strength = $DEFAULT;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (NIL == fi.sentence_assertions(sentence, mt)) {
            return ke.ke_assert(sentence, mt, strength, direction);
        }
        return T;
    }

    /**
     * Like @xref ke-unassert-now, but only does the operation when the assertion exists.
     *
     * @return boolean; status code.
     * @unknown tom
     */
    @LispMethod(comment = "Like @xref ke-unassert-now, but only does the operation when the assertion exists.\r\n\r\n@return boolean; status code.\r\n@unknown tom")
    public static final SubLObject try_unassert_now_alt(SubLObject sentence, SubLObject mt) {
        if (NIL != fi.sentence_assertions(sentence, mt)) {
            return ke.ke_unassert_now(sentence, mt);
        }
        return T;
    }

    /**
     * Like @xref ke-unassert-now, but only does the operation when the assertion exists.
     *
     * @return boolean; status code.
     * @unknown tom
     */
    @LispMethod(comment = "Like @xref ke-unassert-now, but only does the operation when the assertion exists.\r\n\r\n@return boolean; status code.\r\n@unknown tom")
    public static SubLObject try_unassert_now(final SubLObject sentence, final SubLObject mt) {
        if (NIL != fi.sentence_assertions(sentence, mt)) {
            return ke.ke_unassert_now(sentence, mt);
        }
        return T;
    }

    /**
     * Like @xref ke-assert-now, but only does the operation when the assertion doesn't exist.
     *
     * @return boolean; status code.
     * @unknown tom
     */
    @LispMethod(comment = "Like @xref ke-assert-now, but only does the operation when the assertion doesn\'t exist.\r\n\r\n@return boolean; status code.\r\n@unknown tom")
    public static final SubLObject try_assert_now_alt(SubLObject sentence, SubLObject mt, SubLObject strength, SubLObject direction) {
        if (strength == UNPROVIDED) {
            strength = $DEFAULT;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (NIL == fi.sentence_assertions(sentence, mt)) {
            return ke.ke_assert_now(sentence, mt, strength, direction);
        }
        return T;
    }

    /**
     * Like @xref ke-assert-now, but only does the operation when the assertion doesn't exist.
     *
     * @return boolean; status code.
     * @unknown tom
     */
    @LispMethod(comment = "Like @xref ke-assert-now, but only does the operation when the assertion doesn\'t exist.\r\n\r\n@return boolean; status code.\r\n@unknown tom")
    public static SubLObject try_assert_now(final SubLObject sentence, final SubLObject mt, SubLObject strength, SubLObject direction) {
        if (strength == UNPROVIDED) {
            strength = $DEFAULT;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (NIL == fi.sentence_assertions(sentence, mt)) {
            return ke.ke_assert_now(sentence, mt, strength, direction);
        }
        return T;
    }

    public static final SubLObject fast_assert_int_alt(SubLObject sentence, SubLObject mt, SubLObject strength, SubLObject direction, SubLObject forward_inference_enabledP, SubLObject sbhl_type_checkingP, SubLObject semantic_wff_checkingP) {
        if (strength == UNPROVIDED) {
            strength = $DEFAULT;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (forward_inference_enabledP == UNPROVIDED) {
            forward_inference_enabledP = T;
        }
        if (sbhl_type_checkingP == UNPROVIDED) {
            sbhl_type_checkingP = NIL;
        }
        if (semantic_wff_checkingP == UNPROVIDED) {
            semantic_wff_checkingP = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_enabledP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
                    try {
                        kb_control_vars.$forward_inference_enabledP$.bind(forward_inference_enabledP, thread);
                        system_parameters.$suspend_sbhl_type_checkingP$.bind(makeBoolean(NIL == sbhl_type_checkingP), thread);
                        if (NIL != semantic_wff_checkingP) {
                            result = fi.fi_assert_int(sentence, mt, strength, direction);
                        } else {
                            {
                                SubLObject _prev_bind_0_1 = $within_assert$.currentBinding(thread);
                                SubLObject _prev_bind_1_2 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
                                SubLObject _prev_bind_2 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
                                SubLObject _prev_bind_3 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
                                SubLObject _prev_bind_4 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
                                SubLObject _prev_bind_5 = wff_utilities.$check_var_typesP$.currentBinding(thread);
                                SubLObject _prev_bind_6 = czer_vars.$simplify_literalP$.currentBinding(thread);
                                SubLObject _prev_bind_7 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
                                SubLObject _prev_bind_8 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
                                SubLObject _prev_bind_9 = wff_vars.$validate_constantsP$.currentBinding(thread);
                                SubLObject _prev_bind_10 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
                                try {
                                    $within_assert$.bind(NIL, thread);
                                    wff_utilities.$check_arg_typesP$.bind(NIL, thread);
                                    at_vars.$at_check_arg_typesP$.bind(NIL, thread);
                                    wff_utilities.$check_wff_semanticsP$.bind(NIL, thread);
                                    wff_utilities.$check_wff_coherenceP$.bind(NIL, thread);
                                    wff_utilities.$check_var_typesP$.bind(NIL, thread);
                                    czer_vars.$simplify_literalP$.bind(NIL, thread);
                                    at_vars.$at_check_relator_constraintsP$.bind(NIL, thread);
                                    at_vars.$at_check_arg_formatP$.bind(NIL, thread);
                                    wff_vars.$validate_constantsP$.bind(NIL, thread);
                                    system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
                                    result = fi.fi_assert_int(sentence, mt, strength, direction);
                                } finally {
                                    system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_10, thread);
                                    wff_vars.$validate_constantsP$.rebind(_prev_bind_9, thread);
                                    at_vars.$at_check_arg_formatP$.rebind(_prev_bind_8, thread);
                                    at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_7, thread);
                                    czer_vars.$simplify_literalP$.rebind(_prev_bind_6, thread);
                                    wff_utilities.$check_var_typesP$.rebind(_prev_bind_5, thread);
                                    wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_4, thread);
                                    wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_3, thread);
                                    at_vars.$at_check_arg_typesP$.rebind(_prev_bind_2, thread);
                                    wff_utilities.$check_arg_typesP$.rebind(_prev_bind_1_2, thread);
                                    $within_assert$.rebind(_prev_bind_0_1, thread);
                                }
                            }
                        }
                    } finally {
                        system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_1, thread);
                        kb_control_vars.$forward_inference_enabledP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject fast_assert_int(final SubLObject sentence, final SubLObject mt, SubLObject strength, SubLObject direction, SubLObject forward_inference_enabledP, SubLObject sbhl_type_checkingP, SubLObject semantic_wff_checkingP) {
        if (strength == UNPROVIDED) {
            strength = $DEFAULT;
        }
        if (direction == UNPROVIDED) {
            direction = NIL;
        }
        if (forward_inference_enabledP == UNPROVIDED) {
            forward_inference_enabledP = T;
        }
        if (sbhl_type_checkingP == UNPROVIDED) {
            sbhl_type_checkingP = NIL;
        }
        if (semantic_wff_checkingP == UNPROVIDED) {
            semantic_wff_checkingP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = kb_control_vars.$forward_inference_enabledP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
        try {
            kb_control_vars.$forward_inference_enabledP$.bind(forward_inference_enabledP, thread);
            system_parameters.$suspend_sbhl_type_checkingP$.bind(makeBoolean(NIL == sbhl_type_checkingP), thread);
            if (NIL != semantic_wff_checkingP) {
                result = fi.fi_assert_int(sentence, mt, strength, direction);
            } else {
                final SubLObject _prev_bind_0_$13 = $within_assert$.currentBinding(thread);
                final SubLObject _prev_bind_1_$14 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
                final SubLObject _prev_bind_3 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
                final SubLObject _prev_bind_4 = wff_utilities.$check_wff_semanticsP$.currentBinding(thread);
                final SubLObject _prev_bind_5 = wff_utilities.$check_wff_coherenceP$.currentBinding(thread);
                final SubLObject _prev_bind_6 = wff_utilities.$check_var_typesP$.currentBinding(thread);
                final SubLObject _prev_bind_7 = czer_vars.$simplify_literalP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
                final SubLObject _prev_bind_9 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
                final SubLObject _prev_bind_10 = wff_vars.$validate_constantsP$.currentBinding(thread);
                final SubLObject _prev_bind_11 = system_parameters.$suspend_sbhl_type_checkingP$.currentBinding(thread);
                try {
                    $within_assert$.bind(NIL, thread);
                    wff_utilities.$check_arg_typesP$.bind(NIL, thread);
                    at_vars.$at_check_arg_typesP$.bind(NIL, thread);
                    wff_utilities.$check_wff_semanticsP$.bind(NIL, thread);
                    wff_utilities.$check_wff_coherenceP$.bind(NIL, thread);
                    wff_utilities.$check_var_typesP$.bind(NIL, thread);
                    czer_vars.$simplify_literalP$.bind(NIL, thread);
                    at_vars.$at_check_relator_constraintsP$.bind(NIL, thread);
                    at_vars.$at_check_arg_formatP$.bind(NIL, thread);
                    wff_vars.$validate_constantsP$.bind(NIL, thread);
                    system_parameters.$suspend_sbhl_type_checkingP$.bind(T, thread);
                    result = fi.fi_assert_int(sentence, mt, strength, direction);
                } finally {
                    system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_11, thread);
                    wff_vars.$validate_constantsP$.rebind(_prev_bind_10, thread);
                    at_vars.$at_check_arg_formatP$.rebind(_prev_bind_9, thread);
                    at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_8, thread);
                    czer_vars.$simplify_literalP$.rebind(_prev_bind_7, thread);
                    wff_utilities.$check_var_typesP$.rebind(_prev_bind_6, thread);
                    wff_utilities.$check_wff_coherenceP$.rebind(_prev_bind_5, thread);
                    wff_utilities.$check_wff_semanticsP$.rebind(_prev_bind_4, thread);
                    at_vars.$at_check_arg_typesP$.rebind(_prev_bind_3, thread);
                    wff_utilities.$check_arg_typesP$.rebind(_prev_bind_1_$14, thread);
                    $within_assert$.rebind(_prev_bind_0_$13, thread);
                }
            }
        } finally {
            system_parameters.$suspend_sbhl_type_checkingP$.rebind(_prev_bind_2, thread);
            kb_control_vars.$forward_inference_enabledP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     * used in various afterAddings that affect genl-pos?
     *
     * @param ASSERTION
    assertion
     * 		
     * @unknown daves
     */
    @LispMethod(comment = "used in various afterAddings that affect genl-pos?\r\n\r\n@param ASSERTION\nassertion\r\n\t\t\r\n@unknown daves")
    public static final SubLObject possibly_clear_genl_pos_alt(SubLObject assertion) {
        if (NIL != isa.isaP(assertions_high.gaf_arg2(assertion), $$SpeechPart, assertions_high.assertion_mt(assertion), UNPROVIDED)) {
            lexicon_accessors.clear_genl_posP();
        }
        return $CHECKED;
    }

    /**
     * used in various afterAddings that affect genl-pos?
     *
     * @param ASSERTION
    		assertion
     * 		
     * @unknown daves
     */
    @LispMethod(comment = "used in various afterAddings that affect genl-pos?\r\n\r\n@param ASSERTION\n\t\tassertion\r\n\t\t\r\n@unknown daves")
    public static SubLObject possibly_clear_genl_pos(final SubLObject assertion) {
        if (NIL != isa.isaP(assertions_high.gaf_arg2(assertion), $$SpeechPart, assertions_high.assertion_mt(assertion), UNPROVIDED)) {
            lexicon_accessors.clear_genl_posP();
        }
        return $CHECKED;
    }

    /**
     *
     *
     * @return fort ; fort that corresponds to the fort specification or nil
     * @unknown This is currently just a wrapper around @xref cb-guess-fort (or @xref fort-from-string in non Cyc-HTML builds, which does handle NART's).
     * @unknown As with @xref cb-guess-fort, the function is identity given a fort.
     * @unknown Rename function to reflect this overloading of the string parameter.
     * @unknown tom
     */
    @LispMethod(comment = "@return fort ; fort that corresponds to the fort specification or nil\r\n@unknown This is currently just a wrapper around @xref cb-guess-fort (or @xref fort-from-string in non Cyc-HTML builds, which does handle NART\'s).\r\n@unknown As with @xref cb-guess-fort, the function is identity given a fort.\r\n@unknown Rename function to reflect this overloading of the string parameter.\r\n@unknown tom")
    public static final SubLObject guess_fort_alt(SubLObject fort_spec) {
        return cb_guess_fort(fort_spec, UNPROVIDED);
    }

    /**
     *
     *
     * @return fort ; fort that corresponds to the fort specification or nil
     * @unknown This is currently just a wrapper around @xref cb-guess-fort (or @xref fort-from-string in non Cyc-HTML builds, which does handle NART's).
     * @unknown As with @xref cb-guess-fort, the function is identity given a fort.
     * @unknown Rename function to reflect this overloading of the string parameter.
     * @unknown tom
     */
    @LispMethod(comment = "@return fort ; fort that corresponds to the fort specification or nil\r\n@unknown This is currently just a wrapper around @xref cb-guess-fort (or @xref fort-from-string in non Cyc-HTML builds, which does handle NART\'s).\r\n@unknown As with @xref cb-guess-fort, the function is identity given a fort.\r\n@unknown Rename function to reflect this overloading of the string parameter.\r\n@unknown tom")
    public static SubLObject guess_fort(final SubLObject fort_spec) {
        return cb_guess_fort(fort_spec, UNPROVIDED);
    }

    /**
     * alias for @xref guess-fort
     */
    @LispMethod(comment = "alias for @xref guess-fort")
    public static final SubLObject fort_for_string_alt(SubLObject fort_spec) {
        return com.cyc.cycjava.cycl.misc_kb_utilities.guess_fort(fort_spec);
    }

    /**
     * alias for @xref guess-fort
     */
    @LispMethod(comment = "alias for @xref guess-fort")
    public static SubLObject fort_for_string(final SubLObject fort_spec) {
        return guess_fort(fort_spec);
    }

    /**
     *
     *
     * @return list ; list of forts listed in the file (one per line)
     * @unknown The terms can be specified in an uncyclified format
     * @unknown tom
     */
    @LispMethod(comment = "@return list ; list of forts listed in the file (one per line)\r\n@unknown The terms can be specified in an uncyclified format\r\n@unknown tom")
    public static final SubLObject read_terms_from_file_alt(SubLObject filename) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject terms_names = file_utilities.read_text_file(filename);
                SubLObject term_list = NIL;
                SubLObject cdolist_list_var = terms_names;
                SubLObject name = NIL;
                for (name = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , name = cdolist_list_var.first()) {
                    {
                        SubLObject v_term = com.cyc.cycjava.cycl.misc_kb_utilities.fort_for_string(name);
                        if (NIL != v_term) {
                            term_list = cons(v_term, term_list);
                        } else {
                            format(StreamsLow.$trace_output$.getDynamicValue(thread), $str_alt49$____a__does_not_refer_to_a_valid_, name);
                        }
                    }
                }
                return nreverse(term_list);
            }
        }
    }

    /**
     *
     *
     * @return list ; list of forts listed in the file (one per line)
     * @unknown The terms can be specified in an uncyclified format
     * @unknown tom
     */
    @LispMethod(comment = "@return list ; list of forts listed in the file (one per line)\r\n@unknown The terms can be specified in an uncyclified format\r\n@unknown tom")
    public static SubLObject read_terms_from_file(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject terms_names = file_utilities.read_text_file(filename);
        SubLObject term_list = NIL;
        SubLObject cdolist_list_var = terms_names;
        SubLObject name = NIL;
        name = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject v_term = fort_for_string(name);
            if (NIL != v_term) {
                term_list = cons(v_term, term_list);
            } else {
                format(StreamsLow.$trace_output$.getDynamicValue(thread), $str49$____a__does_not_refer_to_a_valid_, name);
            }
            cdolist_list_var = cdolist_list_var.rest();
            name = cdolist_list_var.first();
        } 
        return nreverse(term_list);
    }

    /**
     * Also ignores EOF errors.
     */
    @LispMethod(comment = "Also ignores EOF errors.")
    public static final SubLObject read_from_string_ignoring_all_errors_alt(SubLObject string, SubLObject eof_value, SubLObject start, SubLObject end) {
        if (eof_value == UNPROVIDED) {
            eof_value = $EOF;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        return read_from_string_ignoring_errors(string, NIL, eof_value, start, end);
    }

    /**
     * Also ignores EOF errors.
     */
    @LispMethod(comment = "Also ignores EOF errors.")
    public static SubLObject read_from_string_ignoring_all_errors(final SubLObject string, SubLObject eof_value, SubLObject start, SubLObject end) {
        if (eof_value == UNPROVIDED) {
            eof_value = $EOF;
        }
        if (start == UNPROVIDED) {
            start = ZERO_INTEGER;
        }
        if (end == UNPROVIDED) {
            end = NIL;
        }
        return read_from_string_ignoring_errors(string, NIL, eof_value, start, end);
    }

    /**
     *
     *
     * @return formula ; lisp representation of the formula given by FORMULA-TEXT
     * @unknown Make sure the entire string is read
     * @unknown tom
     */
    @LispMethod(comment = "@return formula ; lisp representation of the formula given by FORMULA-TEXT\r\n@unknown Make sure the entire string is read\r\n@unknown tom")
    public static final SubLObject string_to_formula_alt(SubLObject formula_text) {
        return read_from_string_ignoring_errors(string_utilities.cyclify_string(formula_text), NIL, NIL, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return formula ; lisp representation of the formula given by FORMULA-TEXT
     * @unknown Make sure the entire string is read
     * @unknown tom
     */
    @LispMethod(comment = "@return formula ; lisp representation of the formula given by FORMULA-TEXT\r\n@unknown Make sure the entire string is read\r\n@unknown tom")
    public static SubLObject string_to_formula(final SubLObject formula_text) {
        return read_from_string_ignoring_errors(string_utilities.cyclify_string(formula_text), NIL, NIL, UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @return fort ; new (or existing) FORT representing the NART-TEXT (or nil if invalid)
     * @unknown This is a wrapper around @xref find-or-create-nart that takes a string as input (possibly uncyclified)
     * @unknown tom
     */
    @LispMethod(comment = "@return fort ; new (or existing) FORT representing the NART-TEXT (or nil if invalid)\r\n@unknown This is a wrapper around @xref find-or-create-nart that takes a string as input (possibly uncyclified)\r\n@unknown tom")
    public static final SubLObject find_or_create_nart_from_text_alt(SubLObject nart_text) {
        SubLTrampolineFile.checkType(nart_text, STRINGP);
        {
            SubLObject fort = com.cyc.cycjava.cycl.misc_kb_utilities.fort_for_string(nart_text);
            if (NIL == forts.fort_p(fort)) {
                czer_main.cyc_find_or_create_nart(com.cyc.cycjava.cycl.misc_kb_utilities.string_to_formula(nart_text), UNPROVIDED);
                fort = com.cyc.cycjava.cycl.misc_kb_utilities.fort_for_string(nart_text);
            }
            return fort;
        }
    }

    /**
     *
     *
     * @return fort ; new (or existing) FORT representing the NART-TEXT (or nil if invalid)
     * @unknown This is a wrapper around @xref find-or-create-nart that takes a string as input (possibly uncyclified)
     * @unknown tom
     */
    @LispMethod(comment = "@return fort ; new (or existing) FORT representing the NART-TEXT (or nil if invalid)\r\n@unknown This is a wrapper around @xref find-or-create-nart that takes a string as input (possibly uncyclified)\r\n@unknown tom")
    public static SubLObject find_or_create_nart_from_text(final SubLObject nart_text) {
        assert NIL != stringp(nart_text) : "! stringp(nart_text) " + ("Types.stringp(nart_text) " + "CommonSymbols.NIL != Types.stringp(nart_text) ") + nart_text;
        SubLObject fort = fort_for_string(nart_text);
        if (NIL == forts.fort_p(fort)) {
            czer_main.cyc_find_or_create_nart(string_to_formula(nart_text), UNPROVIDED);
            fort = fort_for_string(nart_text);
        }
        return fort;
    }

    /**
     *
     *
     * @return fort ; result of @xref find-constant for NAME, using DEFAULT if invalid
     * @unknown Similar to (first-of (resolve-constant name) default), but with more type checking
     * @unknown tom
     */
    @LispMethod(comment = "@return fort ; result of @xref find-constant for NAME, using DEFAULT if invalid\r\n@unknown Similar to (first-of (resolve-constant name) default), but with more type checking\r\n@unknown tom")
    public static final SubLObject resolve_constant_alt(SubLObject name, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = $$DeadTerm;
        }
        SubLTrampolineFile.checkType(v_default, $sym52$VALID_CONSTANT_);
        {
            SubLObject constant = constants_high.find_constant(name);
            if (NIL == valid_constantP(constant, UNPROVIDED)) {
                constant = v_default;
            }
            return constant;
        }
    }

    /**
     *
     *
     * @return fort ; result of @xref find-constant for NAME, using DEFAULT if invalid
     * @unknown Similar to (first-of (resolve-constant name) default), but with more type checking
     * @unknown tom
     */
    @LispMethod(comment = "@return fort ; result of @xref find-constant for NAME, using DEFAULT if invalid\r\n@unknown Similar to (first-of (resolve-constant name) default), but with more type checking\r\n@unknown tom")
    public static SubLObject resolve_constant(final SubLObject name, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = $$DeadTerm;
        }
        assert NIL != valid_constantP(v_default, UNPROVIDED) : "! constant_handles.valid_constantP(v_default, .UNPROVIDED) " + ("constant_handles.valid_constantP(v_default, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != constant_handles.valid_constantP(v_default, CommonSymbols.UNPROVIDED) ") + v_default;
        SubLObject constant = constants_high.find_constant(name);
        if (NIL == valid_constantP(constant, UNPROVIDED)) {
            constant = v_default;
        }
        return constant;
    }

    public static final SubLObject instance_named_fn_expression_p_alt(SubLObject expression) {
        return makeBoolean((NIL != el_formula_with_operator_p(expression, $$InstanceNamedFn)) || (NIL != el_formula_with_operator_p(expression, $$InstanceNamedFn_Ternary)));
    }

    public static SubLObject instance_named_fn_expression_p(final SubLObject expression) {
        return makeBoolean((NIL != el_formula_with_operator_p(expression, $$InstanceNamedFn)) || (NIL != el_formula_with_operator_p(expression, $$InstanceNamedFn_Ternary)));
    }

    public static final SubLObject instance_named_fn_term_p_alt(SubLObject expression) {
        return makeBoolean((NIL != el_formula_with_operator_p(cycl_utilities.hl_to_el(expression), $$InstanceNamedFn)) || (NIL != el_formula_with_operator_p(cycl_utilities.hl_to_el(expression), $$InstanceNamedFn_Ternary)));
    }

    public static SubLObject instance_named_fn_term_p(final SubLObject expression) {
        return makeBoolean((NIL != el_formula_with_operator_p(cycl_utilities.hl_to_el(expression), $$InstanceNamedFn)) || (NIL != el_formula_with_operator_p(cycl_utilities.hl_to_el(expression), $$InstanceNamedFn_Ternary)));
    }

    /**
     * Returns a list including identifiers (cycl-object compact-hl-external-id-string default-nl-generation) that
     * are convenient for identifying a CYCL-TERM for external users of Cyc.
     */
    @LispMethod(comment = "Returns a list including identifiers (cycl-object compact-hl-external-id-string default-nl-generation) that\r\nare convenient for identifying a CYCL-TERM for external users of Cyc.\nReturns a list including identifiers (cycl-object compact-hl-external-id-string default-nl-generation) that\nare convenient for identifying a CYCL-TERM for external users of Cyc.")
    public static final SubLObject get_cyc_term_external_identifiers_alt(SubLObject cycl_term) {
        {
            SubLObject generation_term = (cycl_term.isString()) ? ((SubLObject) (cconcatenate($str_alt56$_, new SubLObject[]{ cycl_term, $str_alt56$_ }))) : cycl_term;
            SubLObject el_term = cycl_utilities.hl_to_el(cycl_term);
            SubLObject result = NIL;
            if (generation_term.isNumber() || generation_term.isString()) {
                result = cons(string_utilities.to_string(generation_term), result);
            } else {
                result = cons(pph_main.generate_phrase(cycl_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), result);
            }
            result = cons(kb_utilities.compact_hl_external_id_string(el_term), result);
            result = cons(el_term, result);
            return result;
        }
    }

    /**
     * Returns a list including identifiers (cycl-object compact-hl-external-id-string default-nl-generation) that
     * are convenient for identifying a CYCL-TERM for external users of Cyc.
     */
    @LispMethod(comment = "Returns a list including identifiers (cycl-object compact-hl-external-id-string default-nl-generation) that\r\nare convenient for identifying a CYCL-TERM for external users of Cyc.\nReturns a list including identifiers (cycl-object compact-hl-external-id-string default-nl-generation) that\nare convenient for identifying a CYCL-TERM for external users of Cyc.")
    public static SubLObject get_cyc_term_external_identifiers(final SubLObject cycl_term) {
        final SubLObject generation_term = (cycl_term.isString()) ? cconcatenate($str56$_, new SubLObject[]{ cycl_term, $str56$_ }) : cycl_term;
        final SubLObject el_term = cycl_utilities.hl_to_el(cycl_term);
        SubLObject result = NIL;
        if (generation_term.isNumber() || generation_term.isString()) {
            result = cons(string_utilities.to_string(generation_term), result);
        } else {
            result = cons(pph_main.generate_phrase(cycl_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), result);
        }
        result = cons(kb_utilities.compact_hl_external_id_string(el_term), result);
        result = cons(el_term, result);
        return result;
    }

    /**
     * Returns a list whe list of identifiers (cycl-object compact-hl-external-id-string default-nl-generation) that
     * are convenient for identifying items of LIST-OF-CYCL-TERMS to external users of Cyc.
     */
    @LispMethod(comment = "Returns a list whe list of identifiers (cycl-object compact-hl-external-id-string default-nl-generation) that\r\nare convenient for identifying items of LIST-OF-CYCL-TERMS to external users of Cyc.\nReturns a list whe list of identifiers (cycl-object compact-hl-external-id-string default-nl-generation) that\nare convenient for identifying items of LIST-OF-CYCL-TERMS to external users of Cyc.")
    public static final SubLObject get_cyc_term_external_idenitifiers_for_list_alt(SubLObject list_of_cycl_terms) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                thread.resetMultipleValues();
                {
                    SubLObject _prev_bind_0 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
                    try {
                        pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                        {
                            SubLObject reuseP = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            try {
                                thread.resetMultipleValues();
                                {
                                    SubLObject _prev_bind_0_3 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                                    try {
                                        pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                                        {
                                            SubLObject new_or_reused = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject _prev_bind_0_4 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                                                try {
                                                    pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                                                    {
                                                        SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                                                        {
                                                            SubLObject _prev_bind_0_5 = memoization_state.$memoization_state$.currentBinding(thread);
                                                            try {
                                                                memoization_state.$memoization_state$.bind(local_state, thread);
                                                                {
                                                                    SubLObject original_memoization_process = NIL;
                                                                    if ((NIL != local_state) && (NIL == memoization_state.memoization_state_lock(local_state))) {
                                                                        original_memoization_process = memoization_state.memoization_state_get_current_process_internal(local_state);
                                                                        {
                                                                            SubLObject current_proc = current_process();
                                                                            if (NIL == original_memoization_process) {
                                                                                memoization_state.memoization_state_set_current_process_internal(local_state, current_proc);
                                                                            } else {
                                                                                if (original_memoization_process != current_proc) {
                                                                                    Errors.error($str_alt58$Invalid_attempt_to_reuse_memoizat);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    try {
                                                                        result = Mapping.mapcar(GET_CYC_TERM_EXTERNAL_IDENTIFIERS, list_of_cycl_terms);
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0_6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                                                    memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_6, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            } finally {
                                                                memoization_state.$memoization_state$.rebind(_prev_bind_0_5, thread);
                                                            }
                                                        }
                                                    }
                                                } finally {
                                                    pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_4, thread);
                                                }
                                            }
                                            if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                                                memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                                            }
                                        }
                                    } finally {
                                        pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_3, thread);
                                    }
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0_7 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if (NIL == reuseP) {
                                            pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_7, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * Returns a list whe list of identifiers (cycl-object compact-hl-external-id-string default-nl-generation) that
     * are convenient for identifying items of LIST-OF-CYCL-TERMS to external users of Cyc.
     */
    @LispMethod(comment = "Returns a list whe list of identifiers (cycl-object compact-hl-external-id-string default-nl-generation) that\r\nare convenient for identifying items of LIST-OF-CYCL-TERMS to external users of Cyc.\nReturns a list whe list of identifiers (cycl-object compact-hl-external-id-string default-nl-generation) that\nare convenient for identifying items of LIST-OF-CYCL-TERMS to external users of Cyc.")
    public static SubLObject get_cyc_term_external_idenitifiers_for_list(final SubLObject list_of_cycl_terms) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = pph_macros.$free_pph_problem_store_pointers$.currentBinding(thread);
        try {
            pph_macros.$free_pph_problem_store_pointers$.bind(NIL, thread);
            thread.resetMultipleValues();
            final SubLObject _prev_bind_0_$15 = pph_macros.$pph_problem_store_pointer$.currentBinding(thread);
            try {
                pph_macros.$pph_problem_store_pointer$.bind(pph_macros.find_or_create_pph_problem_store_pointer(), thread);
                final SubLObject reuseP = thread.secondMultipleValue();
                thread.resetMultipleValues();
                try {
                    thread.resetMultipleValues();
                    final SubLObject _prev_bind_0_$16 = pph_macros.$pph_memoization_state$.currentBinding(thread);
                    try {
                        pph_macros.$pph_memoization_state$.bind(pph_macros.find_or_create_pph_memoization_state(), thread);
                        final SubLObject new_or_reused = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        final SubLObject _prev_bind_0_$17 = pph_macros.$pph_external_memoization_state$.currentBinding(thread);
                        try {
                            pph_macros.$pph_external_memoization_state$.bind(pph_macros.find_or_create_pph_external_memoization_state(), thread);
                            final SubLObject local_state = pph_macros.$pph_memoization_state$.getDynamicValue(thread);
                            final SubLObject _prev_bind_0_$18 = memoization_state.$memoization_state$.currentBinding(thread);
                            try {
                                memoization_state.$memoization_state$.bind(local_state, thread);
                                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                                try {
                                    result = Mapping.mapcar(GET_CYC_TERM_EXTERNAL_IDENTIFIERS, list_of_cycl_terms);
                                } finally {
                                    final SubLObject _prev_bind_0_$19 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                                    }
                                }
                            } finally {
                                memoization_state.$memoization_state$.rebind(_prev_bind_0_$18, thread);
                            }
                        } finally {
                            pph_macros.$pph_external_memoization_state$.rebind(_prev_bind_0_$17, thread);
                        }
                        if ((new_or_reused == $NEW) && (NIL != memoization_state.memoization_state_p(pph_macros.$pph_memoization_state$.getDynamicValue(thread)))) {
                            memoization_state.clear_all_memoization(pph_macros.$pph_memoization_state$.getDynamicValue(thread));
                        }
                    } finally {
                        pph_macros.$pph_memoization_state$.rebind(_prev_bind_0_$16, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$20 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        if (NIL == reuseP) {
                            pph_macros.free_pph_problem_store_pointer(pph_macros.$pph_problem_store_pointer$.getDynamicValue(thread));
                        }
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
                    }
                }
            } finally {
                pph_macros.$pph_problem_store_pointer$.rebind(_prev_bind_0_$15, thread);
            }
        } finally {
            pph_macros.$free_pph_problem_store_pointers$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     * Returns an XML 'concept' tag string that is useful for refering to a CYCL-TERM outside of Cyc.
     */
    @LispMethod(comment = "Returns an XML \'concept\' tag string that is useful for refering to a CYCL-TERM outside of Cyc.")
    public static final SubLObject serialize_external_xml_tag_for_cycl_term_alt(SubLObject cycl_term) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ids = com.cyc.cycjava.cycl.misc_kb_utilities.get_cyc_term_external_identifiers(cycl_term);
                {
                    SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                    SubLObject _prev_bind_1 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                        xml_utilities.xml_start_tag_internal($$$concept, list($$$nl, third(ids), $$$cycl, string_utilities.to_string(ids.first()), $$$uri, cconcatenate($str_alt65$urn_cyc__cycapi_concept_, web_utilities.html_url_encode(second(ids), T))), T);
                    } finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1, thread);
                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
                    }
                }
                return NIL;
            }
        }
    }

    @LispMethod(comment = "Returns an XML \'concept\' tag string that is useful for refering to a CYCL-TERM outside of Cyc.")
    public static SubLObject serialize_external_xml_tag_for_cycl_term(final SubLObject cycl_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject ids = get_cyc_term_external_identifiers(cycl_term);
        final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
        final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
        try {
            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
            xml_utilities.xml_start_tag_internal($$$concept, list($$$nl, third(ids), $$$cycl, string_utilities.to_string(ids.first()), $$$uri, cconcatenate($str64$urn_cyc__cycapi_concept_, web_utilities.html_url_encode(second(ids), T))), T, NIL, $UNINITIALIZED);
            final SubLObject _prev_bind_0_$21 = xml_vars.$xml_default_namespace$.currentBinding(thread);
            try {
                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
            } finally {
                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$21, thread);
            }
        } finally {
            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }/**
     * Returns an XML 'concept' tag string that is useful for refering to a CYCL-TERM outside of Cyc.
     */


    public static SubLObject declare_misc_kb_utilities_file() {
        declareFunction("kill_proprietary_constants", "KILL-PROPRIETARY-CONSTANTS", 1, 0, false);
        declareFunction("make_lispy_form", "MAKE-LISPY-FORM", 1, 0, false);
        declareFunction("cycl_from_id", "CYCL-FROM-ID", 1, 0, false);
        declareFunction("name_of_car", "NAME-OF-CAR", 1, 0, false);
        declareFunction("kb_handle", "KB-HANDLE", 1, 0, false);
        declareFunction("kb_handle_internal", "KB-HANDLE-INTERNAL", 1, 0, false);
        declareFunction("kb_handle_internal_constant_method", "KB-HANDLE-INTERNAL-CONSTANT-METHOD", 1, 0, false);
        declareFunction("kb_handle_internal_nart_method", "KB-HANDLE-INTERNAL-NART-METHOD", 1, 0, false);
        declareFunction("kb_handle_internal_nart", "KB-HANDLE-INTERNAL-NART", 1, 0, false);
        declareFunction("kb_handle_internal_variable_method", "KB-HANDLE-INTERNAL-VARIABLE-METHOD", 1, 0, false);
        declareFunction("kb_handle_internal_assertion_method", "KB-HANDLE-INTERNAL-ASSERTION-METHOD", 1, 0, false);
        declareFunction("kb_handle_internal_deduction_method", "KB-HANDLE-INTERNAL-DEDUCTION-METHOD", 1, 0, false);
        declareFunction("find_object_by_kb_handle", "FIND-OBJECT-BY-KB-HANDLE", 2, 0, false);
        declareFunction("register_find_object_by_kb_handle_method", "REGISTER-FIND-OBJECT-BY-KB-HANDLE-METHOD", 2, 0, false);
        declareFunction("list_kb_handle", "LIST-KB-HANDLE", 1, 0, false);
        declareFunction("fi_object_from_handle", "FI-OBJECT-FROM-HANDLE", 1, 1, false);
        declareFunction("get_term_id", "GET-TERM-ID", 1, 0, false);
        new misc_kb_utilities.$get_term_id$UnaryFunction();
        declareFunction("term_from_id", "TERM-FROM-ID", 1, 0, false);
        declareFunction("not_a_cyc_constantP", "NOT-A-CYC-CONSTANT?", 1, 0, false);
        declareFunction("gather_constants", "GATHER-CONSTANTS", 1, 0, false);
        declareFunction("constant_or_natP", "CONSTANT-OR-NAT?", 1, 0, false);
        declareFunction("nat_objectP", "NAT-OBJECT?", 1, 0, false);
        declareFunction("remove_mt_assertions", "REMOVE-MT-ASSERTIONS", 1, 0, false);
        declareFunction("empty_mt_p", "EMPTY-MT-P", 1, 0, false);
        declareFunction("coerce_name", "COERCE-NAME", 1, 0, false);
        declareFunction("terms_in_mt", "TERMS-IN-MT", 1, 0, false);
        declareFunction("assertion_ids_in_mt", "ASSERTION-IDS-IN-MT", 1, 0, false);
        declareFunction("try_unassert", "TRY-UNASSERT", 2, 0, false);
        declareFunction("try_assert", "TRY-ASSERT", 2, 2, false);
        declareFunction("try_unassert_now", "TRY-UNASSERT-NOW", 2, 0, false);
        declareFunction("try_assert_now", "TRY-ASSERT-NOW", 2, 2, false);
        declareFunction("fast_assert_int", "FAST-ASSERT-INT", 2, 5, false);
        declareFunction("possibly_clear_genl_pos", "POSSIBLY-CLEAR-GENL-POS", 1, 0, false);
        declareFunction("guess_fort", "GUESS-FORT", 1, 0, false);
        declareFunction("fort_for_string", "FORT-FOR-STRING", 1, 0, false);
        declareFunction("read_terms_from_file", "READ-TERMS-FROM-FILE", 1, 0, false);
        declareFunction("read_from_string_ignoring_all_errors", "READ-FROM-STRING-IGNORING-ALL-ERRORS", 1, 3, false);
        declareFunction("string_to_formula", "STRING-TO-FORMULA", 1, 0, false);
        declareFunction("find_or_create_nart_from_text", "FIND-OR-CREATE-NART-FROM-TEXT", 1, 0, false);
        declareFunction("resolve_constant", "RESOLVE-CONSTANT", 1, 1, false);
        declareFunction("instance_named_fn_expression_p", "INSTANCE-NAMED-FN-EXPRESSION-P", 1, 0, false);
        declareFunction("instance_named_fn_term_p", "INSTANCE-NAMED-FN-TERM-P", 1, 0, false);
        declareFunction("get_cyc_term_external_identifiers", "GET-CYC-TERM-EXTERNAL-IDENTIFIERS", 1, 0, false);
        declareFunction("get_cyc_term_external_idenitifiers_for_list", "GET-CYC-TERM-EXTERNAL-IDENITIFIERS-FOR-LIST", 1, 0, false);
        declareFunction("serialize_external_xml_tag_for_cycl_term", "SERIALIZE-EXTERNAL-XML-TAG-FOR-CYCL-TERM", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_misc_kb_utilities_file() {
        deflexical("*KB-HANDLE-INTERNAL-METHOD-TABLE*", make_vector($int$256, NIL));
        defparameter("*FIND-OBJECT-BY-KB-HANDLE-METHODS*", NIL);
        return NIL;
    }

    public static SubLObject setup_misc_kb_utilities_file() {
        register_method($kb_handle_internal_method_table$.getGlobalValue(), $dtp_constant$.getGlobalValue(), symbol_function(KB_HANDLE_INTERNAL_CONSTANT_METHOD));
        register_method($kb_handle_internal_method_table$.getGlobalValue(), nart_handles.$dtp_nart$.getGlobalValue(), symbol_function(KB_HANDLE_INTERNAL_NART_METHOD));
        register_method($kb_handle_internal_method_table$.getGlobalValue(), variables.$dtp_variable$.getGlobalValue(), symbol_function(KB_HANDLE_INTERNAL_VARIABLE_METHOD));
        register_method($kb_handle_internal_method_table$.getGlobalValue(), assertion_handles.$dtp_assertion$.getGlobalValue(), symbol_function(KB_HANDLE_INTERNAL_ASSERTION_METHOD));
        register_method($kb_handle_internal_method_table$.getGlobalValue(), deduction_handles.$dtp_deduction$.getGlobalValue(), symbol_function(KB_HANDLE_INTERNAL_DEDUCTION_METHOD));
        register_find_object_by_kb_handle_method($CONSTANT, FIND_CONSTANT_BY_INTERNAL_ID);
        register_find_object_by_kb_handle_method($NART, FIND_NART_BY_ID);
        register_find_object_by_kb_handle_method($VARIABLE, FIND_VARIABLE_BY_ID);
        register_find_object_by_kb_handle_method($ASSERTION, FIND_ASSERTION_BY_ID);
        register_find_object_by_kb_handle_method($DEDUCTION, FIND_DEDUCTION_BY_ID);
        register_external_symbol(GET_CYC_TERM_EXTERNAL_IDENTIFIERS);
        register_external_symbol(GET_CYC_TERM_EXTERNAL_IDENITIFIERS_FOR_LIST);
        register_external_symbol(SERIALIZE_EXTERNAL_XML_TAG_FOR_CYCL_TERM);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_misc_kb_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_misc_kb_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_misc_kb_utilities_file();
    }

    static {
    }

    public static final class $get_term_id$UnaryFunction extends UnaryFunction {
        public $get_term_id$UnaryFunction() {
            super(extractFunctionNamed("GET-TERM-ID"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return get_term_id(arg1);
        }
    }

    static private final SubLString $str_alt2$__Collecting_proprietary_constant = makeString("~%Collecting proprietary constants ... ");

    static private final SubLString $str_alt3$_____s_____ = makeString("~%  ~s ... ");

    static private final SubLString $str_alt4$_s_found_ = makeString("~s found.");

    static private final SubLString $str_alt5$__Preparing_to_kill__s_proprietar = makeString("~%Preparing to kill ~s proprietary constants.  Go ahead? ");

    static private final SubLString $str_alt7$___s_terms_killed_ = makeString("~%~s terms killed.");

    static private final SubLString $str_alt8$__Done_ = makeString("~%Done.");

    static private final SubLString $str_alt9$__Returning_to_Lisp_Interactor_ = makeString("~%Returning to Lisp Interactor.");

    static private final SubLString $str_alt14$_S_is_not_a_KB_datastructure_obje = makeString("~S is not a KB datastructure object");

    static private final SubLList $list_alt31 = list(makeSymbol("FORT-P"), makeSymbol("ASSERTION-P"), makeSymbol("VARIABLE-P"), makeSymbol("DEDUCTION-P"));

    static private final SubLString $str_alt38$do_broad_mt_index = makeString("do-broad-mt-index");

    static private final SubLString $str_alt41$_a = makeString("~a");

    static private final SubLString $str_alt45$_s_is_not_a_microtheory_ = makeString("~s is not a microtheory.");

    static private final SubLString $str_alt49$____a__does_not_refer_to_a_valid_ = makeString("~&'~a' does not refer to a valid term~%");

    static private final SubLString $str_alt56$_ = makeString("\"");

    static private final SubLString $str_alt58$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

    static private final SubLString $str_alt65$urn_cyc__cycapi_concept_ = makeString("urn:cyc:/cycapi/concept/");
}

/**
 * Total time: 601 ms
 */
