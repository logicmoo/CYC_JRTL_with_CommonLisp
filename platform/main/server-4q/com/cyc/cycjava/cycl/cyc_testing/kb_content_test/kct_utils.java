/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.cyc_testing.kb_content_test;


import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_with_operator_p;
import static com.cyc.cycjava.cycl.el_utilities.possibly_naut_p;
import static com.cyc.cycjava.cycl.forts.fort_p;
import static com.cyc.cycjava.cycl.inference.kb_query.kbq_known_unrunnableP;
import static com.cyc.cycjava.cycl.inference.kb_query.kbq_query_spec_p;
import static com.cyc.cycjava.cycl.inference.kb_query.why_not_kbq_valid;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.assertion_handles;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.bindings;
import com.cyc.cycjava.cycl.classes;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_main;
import com.cyc.cycjava.cycl.czer_vars;
import com.cyc.cycjava.cycl.deck;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.fi;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.cycjava.cycl.genl_mts;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_accessors;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.kb_mapping_macros;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.mail_utilities;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.obsolete;
import com.cyc.cycjava.cycl.operation_communication;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.sunit_macros;
import com.cyc.cycjava.cycl.transform_list_utilities;
import com.cyc.cycjava.cycl.cyc_testing.ctest_utils;
import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.janus;
import com.cyc.cycjava.cycl.inference.kb_query;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Environment;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      KCT-UTILS
 * source file: /cyc/top/cycl/cyc-testing/kb-content-test/kct-utils.lisp
 * created:     2019/07/03 17:37:56
 */
public final class kct_utils extends SubLTranslatedFile implements V12 {
    public static final SubLObject test_spec_validity_p(SubLObject test_spec_validity) {
        return classes.subloop_instanceof_class(test_spec_validity, TEST_SPEC_VALIDITY);
    }

    public static final SubLObject subloop_reserved_initialize_test_spec_validity_instance(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, ISOLATED_P, NIL);
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_NUMBER, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, RESULT, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHOD, NIL);
        classes.subloop_initialize_slot(new_instance, CYCL_TEST_CASE, CONSTANTS, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_SPEC_VALIDITY, RESPONSIBLE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_SPEC_VALIDITY, NON_TEST_SPEC, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_SPEC_VALIDITY, NO_QUERY_SPEC, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_SPEC_VALIDITY, NO_MT_NOT_IST, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_SPEC_VALIDITY, NO_MT_BUT_IST, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_SPEC_VALIDITY, TOO_MANY_MTS, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_SPEC_VALIDITY, NO_SENTENCE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_SPEC_VALIDITY, TOO_MANY_SENTENCES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_SPEC_VALIDITY, NO_CYCLIST, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_SPEC_VALIDITY, NO_EXPECTED, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_SPEC_VALIDITY, ALL_OK1, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_SPEC_VALIDITY, ALL_OK2, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_SPEC_VALIDITY, COL_NOT_COL, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_SPEC_VALIDITY, COL_NO_CYCLIST, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_SPEC_VALIDITY, COL_NO_INSTANCES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_SPEC_VALIDITY, COL_OK, NIL);
        return NIL;
    }

    public static final SubLObject subloop_reserved_initialize_test_spec_validity_class(SubLObject new_instance) {
        classes.subloop_initialize_slot(new_instance, OBJECT, INSTANCE_COUNT, ZERO_INTEGER);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, MODULE, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, CATEGORIES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, SUITES, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, TEST_METHODS, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, ENABLED, NIL);
        classes.subloop_initialize_slot(new_instance, TEST_CASE, LOCK, NIL);
        return NIL;
    }

    public static final SubLObject set_test_spec_validity_too_many_sentences(SubLObject test_spec_validity, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(test_spec_validity, value, ELEVEN_INTEGER, TOO_MANY_SENTENCES);
    }

    public static final SubLObject set_test_spec_validity_too_many_mts(SubLObject test_spec_validity, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(test_spec_validity, value, NINE_INTEGER, TOO_MANY_MTS);
    }

    public static final SubLObject set_test_spec_validity_responsible(SubLObject test_spec_validity, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(test_spec_validity, value, FOUR_INTEGER, RESPONSIBLE);
    }

    public static final SubLObject set_test_spec_validity_non_test_spec(SubLObject test_spec_validity, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(test_spec_validity, value, FIVE_INTEGER, NON_TEST_SPEC);
    }

    public static final SubLObject set_test_spec_validity_no_sentence(SubLObject test_spec_validity, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(test_spec_validity, value, TEN_INTEGER, NO_SENTENCE);
    }

    public static final SubLObject set_test_spec_validity_no_query_spec(SubLObject test_spec_validity, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(test_spec_validity, value, SIX_INTEGER, NO_QUERY_SPEC);
    }

    public static final SubLObject set_test_spec_validity_no_mt_not_ist(SubLObject test_spec_validity, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(test_spec_validity, value, SEVEN_INTEGER, NO_MT_NOT_IST);
    }

    public static final SubLObject set_test_spec_validity_no_mt_but_ist(SubLObject test_spec_validity, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(test_spec_validity, value, EIGHT_INTEGER, NO_MT_BUT_IST);
    }

    public static final SubLObject set_test_spec_validity_no_expected(SubLObject test_spec_validity, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(test_spec_validity, value, THIRTEEN_INTEGER, NO_EXPECTED);
    }

    public static final SubLObject set_test_spec_validity_no_cyclist(SubLObject test_spec_validity, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(test_spec_validity, value, TWELVE_INTEGER, NO_CYCLIST);
    }

    public static final SubLObject set_test_spec_validity_col_ok(SubLObject test_spec_validity, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(test_spec_validity, value, NINETEEN_INTEGER, COL_OK);
    }

    public static final SubLObject set_test_spec_validity_col_not_col(SubLObject test_spec_validity, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(test_spec_validity, value, SIXTEEN_INTEGER, COL_NOT_COL);
    }

    public static final SubLObject set_test_spec_validity_col_no_instances(SubLObject test_spec_validity, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(test_spec_validity, value, EIGHTEEN_INTEGER, COL_NO_INSTANCES);
    }

    public static final SubLObject set_test_spec_validity_col_no_cyclist(SubLObject test_spec_validity, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(test_spec_validity, value, SEVENTEEN_INTEGER, COL_NO_CYCLIST);
    }

    public static final SubLObject set_test_spec_validity_all_ok2(SubLObject test_spec_validity, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(test_spec_validity, value, FIFTEEN_INTEGER, ALL_OK2);
    }

    public static final SubLObject set_test_spec_validity_all_ok1(SubLObject test_spec_validity, SubLObject value) {
        return classes.subloop_set_access_protected_instance_slot(test_spec_validity, value, FOURTEEN_INTEGER, ALL_OK1);
    }

    public static final SubLObject get_test_spec_validity_too_many_sentences(SubLObject test_spec_validity) {
        return classes.subloop_get_access_protected_instance_slot(test_spec_validity, ELEVEN_INTEGER, TOO_MANY_SENTENCES);
    }

    public static final SubLObject get_test_spec_validity_too_many_mts(SubLObject test_spec_validity) {
        return classes.subloop_get_access_protected_instance_slot(test_spec_validity, NINE_INTEGER, TOO_MANY_MTS);
    }

    public static final SubLObject get_test_spec_validity_responsible(SubLObject test_spec_validity) {
        return classes.subloop_get_access_protected_instance_slot(test_spec_validity, FOUR_INTEGER, RESPONSIBLE);
    }

    public static final SubLObject get_test_spec_validity_non_test_spec(SubLObject test_spec_validity) {
        return classes.subloop_get_access_protected_instance_slot(test_spec_validity, FIVE_INTEGER, NON_TEST_SPEC);
    }

    public static final SubLObject get_test_spec_validity_no_sentence(SubLObject test_spec_validity) {
        return classes.subloop_get_access_protected_instance_slot(test_spec_validity, TEN_INTEGER, NO_SENTENCE);
    }

    public static final SubLObject get_test_spec_validity_no_query_spec(SubLObject test_spec_validity) {
        return classes.subloop_get_access_protected_instance_slot(test_spec_validity, SIX_INTEGER, NO_QUERY_SPEC);
    }

    public static final SubLObject get_test_spec_validity_no_mt_not_ist(SubLObject test_spec_validity) {
        return classes.subloop_get_access_protected_instance_slot(test_spec_validity, SEVEN_INTEGER, NO_MT_NOT_IST);
    }

    public static final SubLObject get_test_spec_validity_no_mt_but_ist(SubLObject test_spec_validity) {
        return classes.subloop_get_access_protected_instance_slot(test_spec_validity, EIGHT_INTEGER, NO_MT_BUT_IST);
    }

    public static final SubLObject get_test_spec_validity_no_expected(SubLObject test_spec_validity) {
        return classes.subloop_get_access_protected_instance_slot(test_spec_validity, THIRTEEN_INTEGER, NO_EXPECTED);
    }

    public static final SubLObject get_test_spec_validity_no_cyclist(SubLObject test_spec_validity) {
        return classes.subloop_get_access_protected_instance_slot(test_spec_validity, TWELVE_INTEGER, NO_CYCLIST);
    }

    public static final SubLObject get_test_spec_validity_col_ok(SubLObject test_spec_validity) {
        return classes.subloop_get_access_protected_instance_slot(test_spec_validity, NINETEEN_INTEGER, COL_OK);
    }

    public static final SubLObject get_test_spec_validity_col_not_col(SubLObject test_spec_validity) {
        return classes.subloop_get_access_protected_instance_slot(test_spec_validity, SIXTEEN_INTEGER, COL_NOT_COL);
    }

    public static final SubLObject get_test_spec_validity_col_no_instances(SubLObject test_spec_validity) {
        return classes.subloop_get_access_protected_instance_slot(test_spec_validity, EIGHTEEN_INTEGER, COL_NO_INSTANCES);
    }

    public static final SubLObject get_test_spec_validity_col_no_cyclist(SubLObject test_spec_validity) {
        return classes.subloop_get_access_protected_instance_slot(test_spec_validity, SEVENTEEN_INTEGER, COL_NO_CYCLIST);
    }

    public static final SubLObject get_test_spec_validity_all_ok2(SubLObject test_spec_validity) {
        return classes.subloop_get_access_protected_instance_slot(test_spec_validity, FIFTEEN_INTEGER, ALL_OK2);
    }

    public static final SubLObject get_test_spec_validity_all_ok1(SubLObject test_spec_validity) {
        return classes.subloop_get_access_protected_instance_slot(test_spec_validity, FOURTEEN_INTEGER, ALL_OK1);
    }

    public static final SubLObject config_problem_notify(SubLObject constant, SubLObject status, SubLObject text) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject full_text = $str_alt33$;
                SubLObject subject = $str_alt33$;
                SubLObject test_type = $str_alt33$;
                SubLObject fix_instructions = $str_alt33$;
                SubLObject cyclists = NIL;
                SubLObject v_default = NIL;
                SubLObject responsibility_text = $str_alt33$;
                SubLObject cyclist_list = $str_alt33$;
                SubLObject text_header = format(NIL, $str_alt72$__Machine___A__KB_version___A__, Environment.get_machine_name(UNPROVIDED), operation_communication.kb_version_string());
                if (NIL != com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_utils.kct_test_spec_p(constant, UNPROVIDED)) {
                    cyclists = ask_utilities.ask_variable($WHO, listS($$testResponsibleCyclist, constant, $list_alt17), $list_alt73, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (NIL == cyclists) {
                        v_default = T;
                        cyclists = list($kct_default_error_notify_cyclist$.getDynamicValue(thread));
                    }
                } else {
                    if (NIL != com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_utils.kct_test_collection_p(constant, UNPROVIDED)) {
                        cyclists = ask_utilities.ask_variable($WHO, listS($$testCollectionCyclistResponsible, constant, $list_alt17), $list_alt73, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        if (NIL == cyclists) {
                            v_default = T;
                            cyclists = list($kct_default_error_notify_cyclist$.getDynamicValue(thread));
                        }
                    }
                }
                {
                    SubLObject cdolist_list_var = cyclists;
                    SubLObject cyclist = NIL;
                    for (cyclist = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cyclist = cdolist_list_var.first()) {
                        cyclist_list = cconcatenate(cyclist_list, string_utilities.to_string(cyclist));
                        cyclist_list = cconcatenate(cyclist_list, $str_alt74$_);
                    }
                }
                if (NIL != v_default) {
                    responsibility_text = format(NIL, $str_alt75$__Responsible_Cyclist_s____A____S, cyclist_list);
                } else {
                    responsibility_text = format(NIL, $str_alt76$__Responsible_Cyclist_s____A____A, cyclist_list);
                }
                if (NIL != com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_utils.kct_test_spec_p(constant, UNPROVIDED)) {
                    test_type = $$$Test;
                    fix_instructions = format(NIL, $str_alt78$To_correct_the_problem__display__, constant);
                } else {
                    if (NIL != com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_utils.kct_test_collection_p(constant, UNPROVIDED)) {
                        test_type = $$$Collection;
                        fix_instructions = format(NIL, $str_alt80$__To_correct_the_problem__use_the, constant);
                    }
                }
                if (status == $PROBLEM) {
                    full_text = format(NIL, $str_alt81$_A__A___A__A___has_minor_configur, new SubLObject[]{ text_header, responsibility_text, test_type, constant, test_type, fix_instructions, text });
                    subject = format(NIL, $str_alt82$KCT__A__A_Configuration_Problem, constant, test_type);
                } else {
                    if (status == $SEVERE) {
                        full_text = format(NIL, $str_alt83$_A__A___A__A___has_configuration_, new SubLObject[]{ text_header, responsibility_text, test_type, constant, test_type, fix_instructions, text });
                        subject = format(NIL, $str_alt84$KCT__A__A_Configuration_Error, constant, test_type);
                    }
                }
                {
                    SubLObject cdolist_list_var = cyclists;
                    SubLObject cyclist = NIL;
                    for (cyclist = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cyclist = cdolist_list_var.first()) {
                        {
                            SubLObject to_address = kb_accessors.current_valid_cycorp_email_address_text(cyclist);
                            if (NIL == to_address) {
                                Errors.warn($str_alt85$Can_t_notify__A_of_the_invalid__A, cyclist, constant, full_text);
                            }
                            if (NIL != to_address) {
                                mail_utilities.mail_message($str_alt86$cyc_cyc_com, to_address, full_text, subject, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    static private final SubLString $str_alt33$ = makeString("");

    public static final SubLFile me = new kct_utils();

 public static final String myName = "com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_utils";


    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $kct_test_execution_type$ = makeSymbol("*KCT-TEST-EXECUTION-TYPE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $kct_collection_execution_type$ = makeSymbol("*KCT-COLLECTION-EXECUTION-TYPE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $kct_default_error_notify_cyclist$ = makeSymbol("*KCT-DEFAULT-ERROR-NOTIFY-CYCLIST*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $kct_use_sampling_mode$ = makeSymbol("*KCT-USE-SAMPLING-MODE*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $kct_debug$ = makeSymbol("*KCT-DEBUG*");

    // deflexical
    // A representative sample of the KB constants that KCT depends on.
    /**
     * A representative sample of the KB constants that KCT depends on.
     */
    @LispMethod(comment = "A representative sample of the KB constants that KCT depends on.\ndeflexical")
    private static final SubLSymbol $kct_core_constants$ = makeSymbol("*KCT-CORE-CONSTANTS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $hypothetical_bindings_to_substitute$ = makeSymbol("*HYPOTHETICAL-BINDINGS-TO-SUBSTITUTE*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLString $$$I = makeString("I");

    static private final SubLString $$$C = makeString("C");

    static private final SubLList $list2 = list(reader_make_constant_shell("TestVocabularyMt"), reader_make_constant_shell("testQuerySpecification"));

    static private final SubLSymbol $sym3$VALID_CONSTANT_ = makeSymbol("VALID-CONSTANT?");



    private static final SubLSymbol KBQ_QUERY_SPEC_P = makeSymbol("KBQ-QUERY-SPEC-P");

    private static final SubLObject $$KBContentTest_FullySpecified = reader_make_constant_shell("KBContentTest-FullySpecified");







    private static final SubLSymbol KCT_TEST_COLLECTION_P = makeSymbol("KCT-TEST-COLLECTION-P");





    static private final SubLList $list17 = list(makeKeyword("WHO"));





    private static final SubLObject $$testAnswersCycL_Exact = reader_make_constant_shell("testAnswersCycL-Exact");

    private static final SubLObject $$testAnswersCycL_Wanted = reader_make_constant_shell("testAnswersCycL-Wanted");

    private static final SubLObject $$testAnswersCycL_NotWanted = reader_make_constant_shell("testAnswersCycL-NotWanted");



    private static final SubLObject $$testAnswers_Cardinality_Exact = reader_make_constant_shell("testAnswers-Cardinality-Exact");

    private static final SubLObject $$testAnswers_Cardinality_Min = reader_make_constant_shell("testAnswers-Cardinality-Min");

    private static final SubLObject $$testAnswers_Cardinality_Max = reader_make_constant_shell("testAnswers-Cardinality-Max");

    static private final SubLList $list27 = list(new SubLObject[]{ reader_make_constant_shell("testAnswersCycL-Exact"), reader_make_constant_shell("testAnswersCycL-Wanted"), reader_make_constant_shell("testAnswersCycL-NotWanted"), reader_make_constant_shell("testAnswersCycLUnimportant"), reader_make_constant_shell("testAnswerSupport-Wanted"), reader_make_constant_shell("testAnswerSupport-NotWanted"), reader_make_constant_shell("testAnswerSupportedByHLSupportModule-Wanted"), reader_make_constant_shell("testAnswerSupportedByHLSupportModule-NotWanted"), reader_make_constant_shell("testResponsibleCyclist"), reader_make_constant_shell("testQuerySpecification") });





    static private final SubLString $str33$ = makeString("");

    static private final SubLString $str34$___A_is_not_a___KBContentTest_Ful = makeString("~%~A is not a #$KBContentTest-FullySpecified.");

    private static final SubLSymbol $NOT_A_TEST_SPECIFICATION = makeKeyword("NOT-A-TEST-SPECIFICATION");

    static private final SubLString $str36$___A_does_not_have_a_valid_arg2_f = makeString("~%~A does not have a valid arg2 for #$testQuerySpecification.");

    private static final SubLSymbol $NO_VALID_QUERY = makeKeyword("NO-VALID-QUERY");

    private static final SubLString $str38$_has_no___testAnswer_MultipleChoi = makeString(" has no #$testAnswer-MultipleChoice.");

    private static final SubLSymbol $NO_TEST_EXPECTATION = makeKeyword("NO-TEST-EXPECTATION");

    private static final SubLObject $$testAnswerSupport_Wanted = reader_make_constant_shell("testAnswerSupport-Wanted");

    private static final SubLObject $$testAnswerSupport_NotWanted = reader_make_constant_shell("testAnswerSupport-NotWanted");

    private static final SubLObject $const42$testAnswerSupportedByHLSupportMod = reader_make_constant_shell("testAnswerSupportedByHLSupportModule-Wanted");

    private static final SubLObject $const43$testAnswerSupportedByHLSupportMod = reader_make_constant_shell("testAnswerSupportedByHLSupportModule-NotWanted");

    private static final SubLString $str44$___A_has_no_stated_test_expectati = makeString("~%~A has no stated test expectation.");

    private static final SubLString $str45$___A_s_exact_answer_should_includ = makeString("~%~A's exact answer should include only #$ELInferenceBindingSets, but these are not: ");

    private static final SubLSymbol $EXACT_ANSWER_CONTAINS_MALFORMED_INFERENCE_BINDING_SET = makeKeyword("EXACT-ANSWER-CONTAINS-MALFORMED-INFERENCE-BINDING-SET");

    private static final SubLString $str47$_A_ = makeString("~A ");

    private static final SubLString $str48$___A_s_wanted_answer_should_be_an = makeString("~%~A's wanted answer should be an #$ELInferenceBindingSet but isn't: ");

    private static final SubLSymbol $WANTED_ANSWER_IS_NOT_AN_INFERENCE_BINDING_SET = makeKeyword("WANTED-ANSWER-IS-NOT-AN-INFERENCE-BINDING-SET");

    private static final SubLString $str50$___A_s_unwanted_answer_should_be_ = makeString("~%~A's unwanted answer should be an #$ELInferenceBindingSet but isn't: ");

    private static final SubLSymbol $UNWANTED_ANSWER_IS_NOT_AN_INFERENCE_BINDING_SET = makeKeyword("UNWANTED-ANSWER-IS-NOT-AN-INFERENCE-BINDING-SET");

    private static final SubLString $str53$___A_does_not_have_a_responsible_ = makeString("~%~A does not have a responsible Cyclist.");

    private static final SubLSymbol $NO_RESPONSIBLE_CYCLIST = makeKeyword("NO-RESPONSIBLE-CYCLIST");

    private static final SubLString $str60$_A_is_not_a__A = makeString("~A is not a ~A");

    private static final SubLString $$$continue_anyway = makeString("continue anyway");

    private static final SubLString $str65$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");



    private static final SubLString $str67$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLString $str68$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    private static final SubLList $list69 = list(makeUninternedSymbol("LINK-NODE"), makeUninternedSymbol("MT"), makeUninternedSymbol("TV"));

    private static final SubLString $str70$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    private static final SubLString $str71$___A_is_not_a___KBContentTestSpec = makeString("~%~A is not a #$KBContentTestSpecificationType!");

    private static final SubLString $str72$___A_has_no_responsible_Cyclists_ = makeString("~%~A has no responsible Cyclists.");

    private static final SubLString $str73$___A_has_no_instances_ = makeString("~%~A has no instances.");

    private static final SubLString $$$Sampling = makeString("Sampling");

    private static final SubLString $$$Hypothesize = makeString("Hypothesize");

    private static final SubLString $$$Simple = makeString("Simple");

    private static final SubLString $$$Test_Set = makeString("Test Set");

    private static final SubLString $$$Individual_Test = makeString("Individual Test");





    private static final SubLObject $const81$defaultSoftwareParameterValueInSo = reader_make_constant_shell("defaultSoftwareParameterValueInSoftwareObject");





    private static final SubLSymbol CANONICALIZE_QUERY_BINDINGS_INT = makeSymbol("CANONICALIZE-QUERY-BINDINGS-INT");

    private static final SubLSymbol $sym86$_EXIT = makeSymbol("%EXIT");

    private static final SubLSymbol HYPOTHETICAL_FOR_VARIABLE_FN_TERM_P = makeSymbol("HYPOTHETICAL-FOR-VARIABLE-FN-TERM-P");

    private static final SubLSymbol HYPOTHETICAL_FOR_VARIABLE = makeSymbol("HYPOTHETICAL-FOR-VARIABLE");



    private static final SubLString $str90$When_determining_test_results__co = makeString("When determining test results, could not find a hypothetical binding for the variable ~a");

    private static final SubLSymbol NCANONICALIZE_QUERY_BINDING_INT = makeSymbol("NCANONICALIZE-QUERY-BINDING-INT");

    private static final SubLSymbol $sym92$TERM__ = makeSymbol("TERM-<");

    private static final SubLSymbol VARIABLE_BINDING_VARIABLE = makeSymbol("VARIABLE-BINDING-VARIABLE");

    private static final SubLList $list94 = cons(makeSymbol("VARIABLE"), makeSymbol("VALUE"));

    // Definitions
    public static final SubLObject initialize_kct_alt() {
        ctest_utils.initialize_ctest();
        return T;
    }

    // Definitions
    public static SubLObject initialize_kct() {
        ctest_utils.initialize_ctest();
        return T;
    }

    /**
     * Determines whether the portion of the KB necessary for KCTs is loaded.
     */
    @LispMethod(comment = "Determines whether the portion of the KB necessary for KCTs is loaded.")
    public static final SubLObject initialize_kct_kb_feature_alt() {
        if (NIL != list_utilities.every_in_list($sym3$VALID_CONSTANT_, $kct_core_constants$.getGlobalValue(), UNPROVIDED)) {
            kb_control_vars.set_kct_kb_loaded();
        } else {
            kb_control_vars.unset_kct_kb_loaded();
        }
        return kb_control_vars.kct_kb_loaded_p();
    }

    /**
     * Determines whether the portion of the KB necessary for KCTs is loaded.
     */
    @LispMethod(comment = "Determines whether the portion of the KB necessary for KCTs is loaded.")
    public static SubLObject initialize_kct_kb_feature() {
        if (NIL != list_utilities.every_in_list($sym3$VALID_CONSTANT_, $kct_core_constants$.getGlobalValue(), UNPROVIDED)) {
            kb_control_vars.set_kct_kb_loaded();
        } else {
            kb_control_vars.unset_kct_kb_loaded();
        }
        return kb_control_vars.kct_kb_loaded_p();
    }

    public static final SubLObject kct_query_specification_alt(SubLObject kct_constant, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = kct_variables.kct_mt();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != janus.janus_operation_p(kct_constant)) {
                return kct_constant;
            }
            SubLTrampolineFile.checkType(kct_constant, CONSTANT_P);
            {
                SubLObject result = NIL;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        result = kb_mapping_utilities.fpred_value(kct_constant, $$testQuerySpecification, ONE_INTEGER, TWO_INTEGER, $TRUE);
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject kct_query_specification(final SubLObject kct_constant, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = kct_variables.kct_mt();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != janus.janus_operation_p(kct_constant)) {
            return kct_constant;
        }
        assert NIL != forts.fort_p(kct_constant) : "! forts.fort_p(kct_constant) " + ("forts.fort_p(kct_constant) " + "CommonSymbols.NIL != forts.fort_p(kct_constant) ") + kct_constant;
        SubLObject result = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            result = kb_mapping_utilities.fpred_value(kct_constant, $$testQuerySpecification, ONE_INTEGER, TWO_INTEGER, $TRUE);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject query_specification_kcts(final SubLObject query_spec, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = kct_variables.kct_mt();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != janus.janus_operation_p(query_spec)) {
            return query_spec;
        }
        assert NIL != kb_query.kbq_query_spec_p(query_spec) : "! kb_query.kbq_query_spec_p(query_spec) " + ("kb_query.kbq_query_spec_p(query_spec) " + "CommonSymbols.NIL != kb_query.kbq_query_spec_p(query_spec) ") + query_spec;
        SubLObject result = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            result = kb_mapping_utilities.pred_values(query_spec, $$testQuerySpecification, TWO_INTEGER, ONE_INTEGER, $TRUE);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    /**
     * Place all initializations here, and call this function before running the KB Content Test framework
     */
    @LispMethod(comment = "Place all initializations here, and call this function before running the KB Content Test framework")
    public static final SubLObject kct_initialize_alt() {
        return NIL;
    }

    /**
     * Place all initializations here, and call this function before running the KB Content Test framework
     */
    @LispMethod(comment = "Place all initializations here, and call this function before running the KB Content Test framework")
    public static SubLObject kct_initialize() {
        return NIL;
    }

    public static final SubLObject kct_test_spec_p_alt(SubLObject v_object, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = kct_variables.kct_mt();
        }
        return makeBoolean((((NIL != kb_control_vars.kct_kb_loaded_p()) && (NIL != constant_p(v_object))) && (NIL != isa.isaP(v_object, $$KBContentTest_FullySpecified, mt, UNPROVIDED))) || (NIL != janus.janus_operation_p(v_object)));
    }

    public static SubLObject kct_test_spec_p(final SubLObject v_object, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = kct_variables.kct_mt();
        }
        return makeBoolean((((NIL != kb_control_vars.kct_kb_loaded_p()) && (NIL != forts.fort_p(v_object))) && (NIL != isa.isaP(v_object, $$KBContentTest_FullySpecified, mt, UNPROVIDED))) || (NIL != janus.janus_operation_p(v_object)));
    }

    /**
     * A more permissive version of @xref kct-test-spec-p
     */
    @LispMethod(comment = "A more permissive version of @xref kct-test-spec-p")
    public static final SubLObject kct_test_spec_permissive_p_alt(SubLObject v_object) {
        return makeBoolean((((NIL != kb_control_vars.kct_kb_loaded_p()) && (NIL != fort_p(v_object))) && (NIL != isa.isa_in_any_mtP(v_object, $$KBContentTest))) || (NIL != janus.janus_operation_p(v_object)));
    }

    /**
     * A more permissive version of @xref kct-test-spec-p
     */
    @LispMethod(comment = "A more permissive version of @xref kct-test-spec-p")
    public static SubLObject kct_test_spec_permissive_p(final SubLObject v_object) {
        return makeBoolean((((NIL != kb_control_vars.kct_kb_loaded_p()) && (NIL != forts.fort_p(v_object))) && (NIL != isa.isa_in_any_mtP(v_object, $$KBContentTest))) || (NIL != janus.janus_operation_p(v_object)));
    }

    public static final SubLObject kct_test_collection_p_alt(SubLObject v_object, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = kct_variables.kct_mt();
        }
        if ((NIL != kb_control_vars.kct_kb_loaded_p()) && (NIL != constant_p(v_object))) {
            return isa.isaP(v_object, $$KBContentTestSpecificationType, mt, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject kct_test_collection_p(final SubLObject v_object, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = kct_variables.kct_mt();
        }
        if ((NIL != kb_control_vars.kct_kb_loaded_p()) && (NIL != forts.fort_p(v_object))) {
            return isa.isaP(v_object, $$KBContentTestSpecificationType, mt, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject kct_asserted_test_collections_alt(SubLObject test_spec, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = kct_variables.kct_mt();
        }
        SubLTrampolineFile.checkType(test_spec, FORT_P);
        {
            SubLObject result = kb_mapping_utilities.pred_values_in_relevant_mts(test_spec, $$isa, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            return list_utilities.remove_if_not(symbol_function(KCT_TEST_COLLECTION_P), result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
    }

    public static SubLObject kct_asserted_test_collections(final SubLObject test_spec, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = kct_variables.kct_mt();
        }
        assert NIL != forts.fort_p(test_spec) : "! forts.fort_p(test_spec) " + ("forts.fort_p(test_spec) " + "CommonSymbols.NIL != forts.fort_p(test_spec) ") + test_spec;
        final SubLObject result = kb_mapping_utilities.pred_values_in_relevant_mts(test_spec, $$isa, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return list_utilities.remove_if_not(symbol_function(KCT_TEST_COLLECTION_P), result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject kct_comments_alt(SubLObject test_spec, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = kct_variables.kct_mt();
        }
        SubLTrampolineFile.checkType(test_spec, FORT_P);
        return kb_mapping_utilities.pred_values_in_relevant_mts(test_spec, $$comment, mt, ONE_INTEGER, TWO_INTEGER, $TRUE);
    }

    public static SubLObject kct_comments(final SubLObject test_spec, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = kct_variables.kct_mt();
        }
        assert NIL != forts.fort_p(test_spec) : "! forts.fort_p(test_spec) " + ("forts.fort_p(test_spec) " + "CommonSymbols.NIL != forts.fort_p(test_spec) ") + test_spec;
        return kb_mapping_utilities.pred_values_in_relevant_mts(test_spec, $$comment, mt, ONE_INTEGER, TWO_INTEGER, $TRUE);
    }

    public static final SubLObject kct_test_collection_instances_alt(SubLObject test_col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = kct_variables.kct_mt();
        }
        SubLTrampolineFile.checkType(test_col, COLLECTION_P);
        return isa.all_fort_instances(test_col, mt, UNPROVIDED);
    }

    public static SubLObject kct_test_collection_instances(final SubLObject test_col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = kct_variables.kct_mt();
        }
        assert NIL != fort_types_interface.collection_p(test_col) : "! fort_types_interface.collection_p(test_col) " + ("fort_types_interface.collection_p(test_col) " + "CommonSymbols.NIL != fort_types_interface.collection_p(test_col) ") + test_col;
        return isa.all_fort_instances(test_col, mt, UNPROVIDED);
    }

    public static final SubLObject kct_responsible_cyclists_alt(SubLObject test_spec, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = kct_variables.kct_mt_for_now(UNPROVIDED);
        }
        SubLTrampolineFile.checkType(test_spec, FORT_P);
        return ask_utilities.ask_variable($WHO, listS($$testResponsibleCyclist, test_spec, $list_alt17), mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject kct_responsible_cyclists(final SubLObject test_spec, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = kct_variables.kct_mt_for_now(UNPROVIDED);
        }
        assert NIL != forts.fort_p(test_spec) : "! forts.fort_p(test_spec) " + ("forts.fort_p(test_spec) " + "CommonSymbols.NIL != forts.fort_p(test_spec) ") + test_spec;
        return ask_utilities.ask_variable($WHO, listS($$testResponsibleCyclist, test_spec, $list17), mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject kct_collection_responsible_cyclists_alt(SubLObject test_col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = kct_variables.kct_mt_for_now(UNPROVIDED);
        }
        SubLTrampolineFile.checkType(test_col, FORT_P);
        return ask_utilities.ask_variable($WHO, listS($$testCollectionCyclistResponsible, test_col, $list_alt17), mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject kct_collection_responsible_cyclists(final SubLObject test_col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = kct_variables.kct_mt_for_now(UNPROVIDED);
        }
        assert NIL != forts.fort_p(test_col) : "! forts.fort_p(test_col) " + ("forts.fort_p(test_col) " + "CommonSymbols.NIL != forts.fort_p(test_col) ") + test_col;
        return ask_utilities.ask_variable($WHO, listS($$testCollectionCyclistResponsible, test_col, $list17), mt, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject kct_test_metrics_alt(SubLObject test_spec, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = kct_variables.kct_mt();
        }
        if (NIL != janus.janus_operation_p(test_spec)) {
            return NIL;
        }
        SubLTrampolineFile.checkType(test_spec, FORT_P);
        return kb_mapping_utilities.pred_values_in_relevant_mts(test_spec, $$testMetricsToGather, mt, ONE_INTEGER, TWO_INTEGER, $TRUE);
    }

    public static SubLObject kct_test_metrics(final SubLObject test_spec, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = kct_variables.kct_mt();
        }
        if (NIL != janus.janus_operation_p(test_spec)) {
            return NIL;
        }
        assert NIL != forts.fort_p(test_spec) : "! forts.fort_p(test_spec) " + ("forts.fort_p(test_spec) " + "CommonSymbols.NIL != forts.fort_p(test_spec) ") + test_spec;
        return kb_mapping_utilities.pred_values_in_relevant_mts(test_spec, $$testMetricsToGather, mt, ONE_INTEGER, TWO_INTEGER, $TRUE);
    }

    /**
     *
     *
     * @return kb-set-of-binding-sets-p
     */
    @LispMethod(comment = "@return kb-set-of-binding-sets-p")
    public static final SubLObject kct_exact_set_of_binding_sets_alt(SubLObject test_spec, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = kct_variables.kct_mt();
        }
        SubLTrampolineFile.checkType(test_spec, FORT_P);
        return kb_mapping_utilities.fpred_value_in_mt(test_spec, $$testAnswersCycL_Exact, mt, ONE_INTEGER, TWO_INTEGER, $TRUE);
    }

    /**
     *
     *
     * @return kb-set-of-binding-sets-p
     */
    @LispMethod(comment = "@return kb-set-of-binding-sets-p")
    public static SubLObject kct_exact_set_of_binding_sets(final SubLObject test_spec, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = kct_variables.kct_mt();
        }
        assert NIL != forts.fort_p(test_spec) : "! forts.fort_p(test_spec) " + ("forts.fort_p(test_spec) " + "CommonSymbols.NIL != forts.fort_p(test_spec) ") + test_spec;
        return kb_mapping_utilities.fpred_value_in_mt(test_spec, $$testAnswersCycL_Exact, mt, ONE_INTEGER, TWO_INTEGER, $TRUE);
    }

    /**
     *
     *
     * @return a list of kb-binding-set-p
     */
    @LispMethod(comment = "@return a list of kb-binding-set-p")
    public static final SubLObject kct_exact_binding_sets_alt(SubLObject test_spec, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = kct_variables.kct_mt();
        }
        SubLTrampolineFile.checkType(test_spec, FORT_P);
        return cycl_utilities.nat_args(com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_utils.kct_exact_set_of_binding_sets(test_spec, mt), UNPROVIDED);
    }

    /**
     *
     *
     * @return a list of kb-binding-set-p
     */
    @LispMethod(comment = "@return a list of kb-binding-set-p")
    public static SubLObject kct_exact_binding_sets(final SubLObject test_spec, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = kct_variables.kct_mt();
        }
        assert NIL != forts.fort_p(test_spec) : "! forts.fort_p(test_spec) " + ("forts.fort_p(test_spec) " + "CommonSymbols.NIL != forts.fort_p(test_spec) ") + test_spec;
        return cycl_utilities.nat_args(kct_exact_set_of_binding_sets(test_spec, mt), UNPROVIDED);
    }

    /**
     *
     *
     * @return a list of kb-binding-set-p
     */
    @LispMethod(comment = "@return a list of kb-binding-set-p")
    public static final SubLObject kct_wanted_binding_sets_alt(SubLObject test_spec, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = kct_variables.kct_mt();
        }
        SubLTrampolineFile.checkType(test_spec, FORT_P);
        return kb_mapping_utilities.pred_values_in_mt(test_spec, $$testAnswersCycL_Wanted, mt, ONE_INTEGER, TWO_INTEGER, $TRUE);
    }

    /**
     *
     *
     * @return a list of kb-binding-set-p
     */
    @LispMethod(comment = "@return a list of kb-binding-set-p")
    public static SubLObject kct_wanted_binding_sets(final SubLObject test_spec, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = kct_variables.kct_mt();
        }
        assert NIL != forts.fort_p(test_spec) : "! forts.fort_p(test_spec) " + ("forts.fort_p(test_spec) " + "CommonSymbols.NIL != forts.fort_p(test_spec) ") + test_spec;
        return kb_mapping_utilities.pred_values_in_mt(test_spec, $$testAnswersCycL_Wanted, mt, ONE_INTEGER, TWO_INTEGER, $TRUE);
    }

    /**
     *
     *
     * @return a list of kb-binding-set-p
     */
    @LispMethod(comment = "@return a list of kb-binding-set-p")
    public static final SubLObject kct_unwanted_binding_sets_alt(SubLObject test_spec, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = kct_variables.kct_mt();
        }
        SubLTrampolineFile.checkType(test_spec, FORT_P);
        return kb_mapping_utilities.pred_values_in_mt(test_spec, $$testAnswersCycL_NotWanted, mt, ONE_INTEGER, TWO_INTEGER, $TRUE);
    }

    /**
     *
     *
     * @return a list of kb-binding-set-p
     */
    @LispMethod(comment = "@return a list of kb-binding-set-p")
    public static SubLObject kct_unwanted_binding_sets(final SubLObject test_spec, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = kct_variables.kct_mt();
        }
        assert NIL != forts.fort_p(test_spec) : "! forts.fort_p(test_spec) " + ("forts.fort_p(test_spec) " + "CommonSymbols.NIL != forts.fort_p(test_spec) ") + test_spec;
        return kb_mapping_utilities.pred_values_in_mt(test_spec, $$testAnswersCycL_NotWanted, mt, ONE_INTEGER, TWO_INTEGER, $TRUE);
    }

    /**
     *
     *
     * @return boolean
     */
    @LispMethod(comment = "@return boolean")
    public static final SubLObject kct_bindings_unimportantP_alt(SubLObject test_spec, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = kct_variables.kct_mt();
        }
        SubLTrampolineFile.checkType(test_spec, FORT_P);
        return list_utilities.sublisp_boolean(kb_mapping_utilities.some_pred_value_in_mt(test_spec, $$testAnswersCycLUnimportant, mt, ONE_INTEGER, $TRUE));
    }

    /**
     *
     *
     * @return boolean
     */
    @LispMethod(comment = "@return boolean")
    public static SubLObject kct_bindings_unimportantP(final SubLObject test_spec, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = kct_variables.kct_mt();
        }
        assert NIL != forts.fort_p(test_spec) : "! forts.fort_p(test_spec) " + ("forts.fort_p(test_spec) " + "CommonSymbols.NIL != forts.fort_p(test_spec) ") + test_spec;
        return list_utilities.sublisp_boolean(kb_mapping_utilities.some_pred_value_in_mt(test_spec, $$testAnswersCycLUnimportant, mt, ONE_INTEGER, $TRUE));
    }

    /**
     *
     *
     * @return integer
     */
    @LispMethod(comment = "@return integer")
    public static final SubLObject kct_binding_sets_cardinality_alt(SubLObject test_spec, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = kct_variables.kct_mt();
        }
        SubLTrampolineFile.checkType(test_spec, FORT_P);
        return kb_mapping_utilities.fpred_value_in_mt(test_spec, $$testAnswers_Cardinality_Exact, mt, ONE_INTEGER, TWO_INTEGER, $TRUE);
    }

    /**
     *
     *
     * @return integer
     */
    @LispMethod(comment = "@return integer")
    public static SubLObject kct_binding_sets_cardinality(final SubLObject test_spec, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = kct_variables.kct_mt();
        }
        assert NIL != forts.fort_p(test_spec) : "! forts.fort_p(test_spec) " + ("forts.fort_p(test_spec) " + "CommonSymbols.NIL != forts.fort_p(test_spec) ") + test_spec;
        return kb_mapping_utilities.fpred_value_in_mt(test_spec, $$testAnswers_Cardinality_Exact, mt, ONE_INTEGER, TWO_INTEGER, $TRUE);
    }

    /**
     *
     *
     * @return integer
     */
    @LispMethod(comment = "@return integer")
    public static final SubLObject kct_binding_sets_min_cardinality_alt(SubLObject test_spec, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = kct_variables.kct_mt();
        }
        SubLTrampolineFile.checkType(test_spec, FORT_P);
        return kb_mapping_utilities.fpred_value_in_mt(test_spec, $$testAnswers_Cardinality_Min, mt, ONE_INTEGER, TWO_INTEGER, $TRUE);
    }

    /**
     *
     *
     * @return integer
     */
    @LispMethod(comment = "@return integer")
    public static SubLObject kct_binding_sets_min_cardinality(final SubLObject test_spec, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = kct_variables.kct_mt();
        }
        assert NIL != forts.fort_p(test_spec) : "! forts.fort_p(test_spec) " + ("forts.fort_p(test_spec) " + "CommonSymbols.NIL != forts.fort_p(test_spec) ") + test_spec;
        return kb_mapping_utilities.fpred_value_in_mt(test_spec, $$testAnswers_Cardinality_Min, mt, ONE_INTEGER, TWO_INTEGER, $TRUE);
    }

    /**
     *
     *
     * @return integer
     */
    @LispMethod(comment = "@return integer")
    public static final SubLObject kct_binding_sets_max_cardinality_alt(SubLObject test_spec, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = kct_variables.kct_mt();
        }
        SubLTrampolineFile.checkType(test_spec, FORT_P);
        return kb_mapping_utilities.fpred_value_in_mt(test_spec, $$testAnswers_Cardinality_Max, mt, ONE_INTEGER, TWO_INTEGER, $TRUE);
    }

    /**
     *
     *
     * @return integer
     */
    @LispMethod(comment = "@return integer")
    public static SubLObject kct_binding_sets_max_cardinality(final SubLObject test_spec, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = kct_variables.kct_mt();
        }
        assert NIL != forts.fort_p(test_spec) : "! forts.fort_p(test_spec) " + ("forts.fort_p(test_spec) " + "CommonSymbols.NIL != forts.fort_p(test_spec) ") + test_spec;
        return kb_mapping_utilities.fpred_value_in_mt(test_spec, $$testAnswers_Cardinality_Max, mt, ONE_INTEGER, TWO_INTEGER, $TRUE);
    }

    /**
     * Returns #$TestVocabularyMt by default, but attempts to determine which Mt the
     * test specificiation's defining assertions are in.
     */
    @LispMethod(comment = "Returns #$TestVocabularyMt by default, but attempts to determine which Mt the\r\ntest specificiation\'s defining assertions are in.\nReturns #$TestVocabularyMt by default, but attempts to determine which Mt the\ntest specificiation\'s defining assertions are in.")
    public static final SubLObject kct_defining_mt_alt(SubLObject test_spec) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject candidates = NIL;
                SubLObject result = NIL;
                SubLObject predicates = $list_alt27;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        {
                            SubLObject cdolist_list_var = predicates;
                            SubLObject predicate = NIL;
                            for (predicate = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , predicate = cdolist_list_var.first()) {
                                {
                                    SubLObject pred_var = predicate;
                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(test_spec, ONE_INTEGER, pred_var)) {
                                        {
                                            SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(test_spec, ONE_INTEGER, pred_var);
                                            SubLObject done_var = NIL;
                                            SubLObject token_var = NIL;
                                            while (NIL == done_var) {
                                                {
                                                    SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                    SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                    if (NIL != valid) {
                                                        {
                                                            SubLObject final_index_iterator = NIL;
                                                            try {
                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                                {
                                                                    SubLObject done_var_1 = NIL;
                                                                    SubLObject token_var_2 = NIL;
                                                                    while (NIL == done_var_1) {
                                                                        {
                                                                            SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_2);
                                                                            SubLObject valid_3 = makeBoolean(token_var_2 != assertion);
                                                                            if (NIL != valid_3) {
                                                                                {
                                                                                    SubLObject mt = assertions_high.assertion_mt(assertion);
                                                                                    SubLObject monad = hlmt.hlmt_monad_mt(mt);
                                                                                    SubLObject item_var = monad;
                                                                                    if (NIL == member(item_var, candidates, symbol_function(EQL), symbol_function(IDENTITY))) {
                                                                                        candidates = cons(item_var, candidates);
                                                                                    }
                                                                                }
                                                                            }
                                                                            done_var_1 = makeBoolean(NIL == valid_3);
                                                                        }
                                                                    } 
                                                                }
                                                            } finally {
                                                                {
                                                                    SubLObject _prev_bind_0_4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                    try {
                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                        if (NIL != final_index_iterator) {
                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                        }
                                                                    } finally {
                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_4, thread);
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                    done_var = makeBoolean(NIL == valid);
                                                }
                                            } 
                                        }
                                    }
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                result = genl_mts.max_floor_mts(candidates, candidates, UNPROVIDED);
                if (NIL != list_utilities.singletonP(result)) {
                    return result.first();
                }
                return $$TestVocabularyMt;
            }
        }
    }

    /**
     * Returns #$TestVocabularyMt by default, but attempts to determine which Mt the
     * test specificiation's defining assertions are in.
     */
    @LispMethod(comment = "Returns #$TestVocabularyMt by default, but attempts to determine which Mt the\r\ntest specificiation\'s defining assertions are in.\nReturns #$TestVocabularyMt by default, but attempts to determine which Mt the\ntest specificiation\'s defining assertions are in.")
    public static SubLObject kct_defining_mt(final SubLObject test_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject candidates = NIL;
        SubLObject result = NIL;
        final SubLObject predicates = $list27;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            SubLObject cdolist_list_var = predicates;
            SubLObject predicate = NIL;
            predicate = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject pred_var = predicate;
                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(test_spec, ONE_INTEGER, pred_var)) {
                    final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(test_spec, ONE_INTEGER, pred_var);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                        if (NIL != valid) {
                            SubLObject final_index_iterator = NIL;
                            try {
                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                SubLObject done_var_$1 = NIL;
                                final SubLObject token_var_$2 = NIL;
                                while (NIL == done_var_$1) {
                                    final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$2);
                                    final SubLObject valid_$3 = makeBoolean(!token_var_$2.eql(assertion));
                                    if (NIL != valid_$3) {
                                        final SubLObject mt = assertions_high.assertion_mt(assertion);
                                        final SubLObject item_var;
                                        final SubLObject monad = item_var = hlmt.hlmt_monad_mt(mt);
                                        if (NIL == member(item_var, candidates, symbol_function(EQL), symbol_function(IDENTITY))) {
                                            candidates = cons(item_var, candidates);
                                        }
                                    }
                                    done_var_$1 = makeBoolean(NIL == valid_$3);
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values = getValuesAsVector();
                                    if (NIL != final_index_iterator) {
                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                    }
                                    restoreValuesFromVector(_values);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                                }
                            }
                        }
                        done_var = makeBoolean(NIL == valid);
                    } 
                }
                cdolist_list_var = cdolist_list_var.rest();
                predicate = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        result = genl_mts.max_floor_mts(candidates, candidates, UNPROVIDED);
        if (NIL != list_utilities.singletonP(result)) {
            return result.first();
        }
        return $$TestVocabularyMt;
    }

    public static final SubLObject kct_test_runnableP_alt(SubLObject test_spec) {
        return makeBoolean((NIL == com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_utils.kct_test_known_unrunnableP(test_spec)) && ($SEVERE != com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_utils.why_not_kct_test_valid(test_spec)));
    }

    public static SubLObject kct_test_runnableP(final SubLObject test_spec) {
        return makeBoolean((NIL == kct_test_known_unrunnableP(test_spec)) && ($SEVERE != why_not_kct_test_valid(test_spec)));
    }

    public static final SubLObject kct_test_known_unrunnableP_alt(SubLObject test_spec) {
        if (NIL != com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_utils.kct_test_spec_p(test_spec, UNPROVIDED)) {
            {
                SubLObject query_spec = com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_utils.kct_query_specification(test_spec, UNPROVIDED);
                if (NIL != query_spec) {
                    return kbq_known_unrunnableP(query_spec);
                }
            }
        }
        return NIL;
    }

    public static SubLObject kct_test_known_unrunnableP(final SubLObject test_spec) {
        if (NIL != kct_test_spec_p(test_spec, UNPROVIDED)) {
            final SubLObject query_spec = kct_query_specification(test_spec, UNPROVIDED);
            if (NIL != query_spec) {
                return kb_query.kbq_known_unrunnableP(query_spec);
            }
        }
        return NIL;
    }

    /**
     * Evaluate TEST-SPEC for problems.  If any are found, return a token and a non empty message.
     *
     * @return 0 keywordp or nil - NIL if there are no problems; :PROBLEM if there a problem that should be
    reported, but the test is still runnable, and :SEVERE if the problem will
    prevent the test from running.
     * @return 1 stringp - Empty string if no problems were found; otherwise, a string containing one or more
     * @return 2 list of keywordp; a list of keywords tersely describing the list of problems in the returned string.
     */
    @LispMethod(comment = "Evaluate TEST-SPEC for problems.  If any are found, return a token and a non empty message.\r\n\r\n@return 0 keywordp or nil - NIL if there are no problems; :PROBLEM if there a problem that should be\r\nreported, but the test is still runnable, and :SEVERE if the problem will\r\nprevent the test from running.\r\n@return 1 stringp - Empty string if no problems were found; otherwise, a string containing one or more\r\n@return 2 list of keywordp; a list of keywords tersely describing the list of problems in the returned string.")
    public static final SubLObject why_not_kct_test_valid_alt(SubLObject test_spec) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != janus.janus_operation_p(test_spec)) {
                return values(NIL, NIL, NIL);
            }
            {
                SubLObject result = NIL;
                SubLObject message = $str_alt33$;
                SubLObject problem_keywords = NIL;
                if (NIL == com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_utils.kct_test_spec_p(test_spec, UNPROVIDED)) {
                    message = format(NIL, $str_alt34$___A_is_not_a___KBContentTest_Ful, test_spec);
                    problem_keywords = cons($NOT_A_TEST_SPECIFICATION, problem_keywords);
                    return values($SEVERE, message, nreverse(problem_keywords));
                }
                {
                    SubLObject query_spec = com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_utils.kct_query_specification(test_spec, UNPROVIDED);
                    if (NIL == kbq_query_spec_p(query_spec)) {
                        message = format(NIL, $str_alt36$___A_does_not_have_a_valid_arg2_f, test_spec);
                        problem_keywords = cons($NO_VALID_QUERY, problem_keywords);
                        return values($SEVERE, message, nreverse(problem_keywords));
                    }
                    thread.resetMultipleValues();
                    {
                        SubLObject query_problem = why_not_kbq_valid(query_spec, test_spec);
                        SubLObject query_problem_message = thread.secondMultipleValue();
                        SubLObject query_problem_keywords = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL != query_problem) {
                            result = query_problem;
                            message = query_problem_message;
                            problem_keywords = append(query_problem_keywords, problem_keywords);
                        }
                    }
                }
                {
                    SubLObject exact = com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_utils.kct_exact_set_of_binding_sets(test_spec, kct_variables.kct_mt());
                    SubLObject unimportant = com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_utils.kct_bindings_unimportantP(test_spec, kct_variables.kct_mt());
                    SubLObject wanted = com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_utils.kct_wanted_binding_sets(test_spec, kct_variables.kct_mt());
                    SubLObject not_wanted = com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_utils.kct_unwanted_binding_sets(test_spec, kct_variables.kct_mt());
                    SubLObject binding_sets_cardinality = com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_utils.kct_binding_sets_cardinality(test_spec, kct_variables.kct_mt());
                    SubLObject binding_sets_min_cardinality = com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_utils.kct_binding_sets_min_cardinality(test_spec, kct_variables.kct_mt());
                    SubLObject binding_sets_max_cardinality = com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_utils.kct_binding_sets_max_cardinality(test_spec, kct_variables.kct_mt());
                    SubLObject support_wanted = kb_mapping_utilities.pred_values_in_mt(test_spec, $$testAnswerSupport_Wanted, kct_variables.kct_mt(), ONE_INTEGER, TWO_INTEGER, UNPROVIDED);
                    SubLObject support_not_wanted = kb_mapping_utilities.pred_values_in_mt(test_spec, $$testAnswerSupport_NotWanted, kct_variables.kct_mt(), ONE_INTEGER, TWO_INTEGER, UNPROVIDED);
                    SubLObject support_module_wanted = kb_mapping_utilities.pred_values_in_mt(test_spec, $const40$testAnswerSupportedByHLSupportMod, kct_variables.kct_mt(), ONE_INTEGER, TWO_INTEGER, UNPROVIDED);
                    SubLObject support_module_not_wanted = kb_mapping_utilities.pred_values_in_mt(test_spec, $const41$testAnswerSupportedByHLSupportMod, kct_variables.kct_mt(), ONE_INTEGER, TWO_INTEGER, UNPROVIDED);
                    SubLObject bad_exact = NIL;
                    SubLObject bad_wanted = NIL;
                    SubLObject bad_not_wanted = NIL;
                    if (!(((((((((((NIL != exact) || (NIL != unimportant)) || (NIL != wanted)) || (NIL != not_wanted)) || (NIL != binding_sets_cardinality)) || (NIL != binding_sets_min_cardinality)) || (NIL != binding_sets_max_cardinality)) || (NIL != support_wanted)) || (NIL != support_not_wanted)) || (NIL != support_module_wanted)) || (NIL != support_module_not_wanted))) {
                        result = $SEVERE;
                        message = cconcatenate(message, format(NIL, $str_alt42$___A_has_no_stated_test_expectati, test_spec));
                        problem_keywords = cons($NO_TEST_EXPECTATION, problem_keywords);
                    }
                    {
                        SubLObject cdolist_list_var = cycl_utilities.nat_args(exact, UNPROVIDED);
                        SubLObject binding_set = NIL;
                        for (binding_set = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding_set = cdolist_list_var.first()) {
                            if (NIL == bindings.kb_binding_set_p(binding_set)) {
                                bad_exact = cons(binding_set, bad_exact);
                            }
                        }
                    }
                    if (NIL != bad_exact) {
                        result = $SEVERE;
                        message = cconcatenate(message, format(NIL, $str_alt44$___A_s_exact_answer_should_includ, test_spec));
                        problem_keywords = cons($EXACT_ANSWER_CONTAINS_MALFORMED_INFERENCE_BINDING_SET, problem_keywords);
                        {
                            SubLObject cdolist_list_var = bad_exact;
                            SubLObject bad = NIL;
                            for (bad = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , bad = cdolist_list_var.first()) {
                                message = cconcatenate(message, format(NIL, $str_alt46$_A_, bad));
                            }
                        }
                    }
                    {
                        SubLObject cdolist_list_var = wanted;
                        SubLObject binding_set = NIL;
                        for (binding_set = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding_set = cdolist_list_var.first()) {
                            if (NIL == bindings.kb_binding_set_p(binding_set)) {
                                bad_wanted = cons(binding_set, bad_wanted);
                            }
                        }
                    }
                    if (NIL != bad_wanted) {
                        result = $SEVERE;
                        message = cconcatenate(message, format(NIL, $str_alt47$___A_s_wanted_answer_should_be_an, test_spec));
                        problem_keywords = cons($WANTED_ANSWER_IS_NOT_AN_INFERENCE_BINDING_SET, problem_keywords);
                        {
                            SubLObject cdolist_list_var = bad_wanted;
                            SubLObject bad = NIL;
                            for (bad = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , bad = cdolist_list_var.first()) {
                                message = cconcatenate(message, format(NIL, $str_alt46$_A_, bad));
                            }
                        }
                    }
                    {
                        SubLObject cdolist_list_var = not_wanted;
                        SubLObject binding_set = NIL;
                        for (binding_set = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding_set = cdolist_list_var.first()) {
                            if (NIL == bindings.kb_binding_set_p(binding_set)) {
                                bad_not_wanted = cons(binding_set, bad_not_wanted);
                            }
                        }
                    }
                    if (NIL != bad_not_wanted) {
                        result = $SEVERE;
                        message = cconcatenate(message, format(NIL, $str_alt49$___A_s_unwanted_answer_should_be_, test_spec));
                        problem_keywords = cons($UNWANTED_ANSWER_IS_NOT_AN_INFERENCE_BINDING_SET, problem_keywords);
                        {
                            SubLObject cdolist_list_var = bad_not_wanted;
                            SubLObject bad = NIL;
                            for (bad = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , bad = cdolist_list_var.first()) {
                                message = cconcatenate(message, format(NIL, $str_alt46$_A_, bad));
                            }
                        }
                    }
                }
                {
                    SubLObject cyclists = com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_utils.kct_responsible_cyclists(test_spec, UNPROVIDED);
                    if (NIL == cyclists) {
                        if (result != $SEVERE) {
                            result = $PROBLEM;
                        }
                        message = cconcatenate(message, format(NIL, $str_alt52$___A_does_not_have_a_responsible_, test_spec));
                        problem_keywords = cons($NO_RESPONSIBLE_CYCLIST, problem_keywords);
                    }
                }
                return values(result, message, nreverse(problem_keywords));
            }
        }
    }

    /**
     * Evaluate TEST-SPEC for problems.  If any are found, return a token and a non empty message.
     *
     * @return 0 keywordp or nil - NIL if there are no problems; :PROBLEM if there a problem that should be
    reported, but the test is still runnable, and :SEVERE if the problem will
    prevent the test from running.
     * @return 1 stringp - Empty string if no problems were found; otherwise, a string containing one or more
     * @return 2 list of keywordp; a list of keywords tersely describing the list of problems in the returned string.
     */
    @LispMethod(comment = "Evaluate TEST-SPEC for problems.  If any are found, return a token and a non empty message.\r\n\r\n@return 0 keywordp or nil - NIL if there are no problems; :PROBLEM if there a problem that should be\r\nreported, but the test is still runnable, and :SEVERE if the problem will\r\nprevent the test from running.\r\n@return 1 stringp - Empty string if no problems were found; otherwise, a string containing one or more\r\n@return 2 list of keywordp; a list of keywords tersely describing the list of problems in the returned string.")
    public static SubLObject why_not_kct_test_valid(final SubLObject test_spec) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != janus.janus_operation_p(test_spec)) {
            return values(NIL, NIL, NIL);
        }
        SubLObject result = NIL;
        SubLObject message = $str33$;
        SubLObject problem_keywords = NIL;
        if (NIL == kct_test_spec_p(test_spec, UNPROVIDED)) {
            message = format(NIL, $str34$___A_is_not_a___KBContentTest_Ful, test_spec);
            problem_keywords = cons($NOT_A_TEST_SPECIFICATION, problem_keywords);
            return values($SEVERE, message, nreverse(problem_keywords));
        }
        final SubLObject query_spec = kct_query_specification(test_spec, UNPROVIDED);
        if (NIL == kb_query.kbq_query_spec_p(query_spec)) {
            message = format(NIL, $str36$___A_does_not_have_a_valid_arg2_f, test_spec);
            problem_keywords = cons($NO_VALID_QUERY, problem_keywords);
            return values($SEVERE, message, nreverse(problem_keywords));
        }
        thread.resetMultipleValues();
        final SubLObject query_problem = kb_query.why_not_kbq_valid(query_spec, test_spec);
        final SubLObject query_problem_message = thread.secondMultipleValue();
        final SubLObject query_problem_keywords = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL != query_problem) {
            result = query_problem;
            message = query_problem_message;
            problem_keywords = append(query_problem_keywords, problem_keywords);
        }
        if (NIL != kb_query.multiple_choice_testP(test_spec)) {
            if (NIL == funcall(makeSymbol("MULTIPLE-CHOICE-TEST-DESIRED-OPTION"), test_spec)) {
                result = $SEVERE;
                message = cconcatenate(message, cconcatenate(format_nil.$format_nil_percent$.getGlobalValue(), new SubLObject[]{ format_nil.format_nil_a_no_copy(test_spec), $str38$_has_no___testAnswer_MultipleChoi }));
                problem_keywords = cons($NO_TEST_EXPECTATION, problem_keywords);
            }
        } else {
            final SubLObject exact = kct_exact_set_of_binding_sets(test_spec, kct_variables.kct_mt());
            final SubLObject unimportant = kct_bindings_unimportantP(test_spec, kct_variables.kct_mt());
            final SubLObject wanted = kct_wanted_binding_sets(test_spec, kct_variables.kct_mt());
            final SubLObject not_wanted = kct_unwanted_binding_sets(test_spec, kct_variables.kct_mt());
            final SubLObject binding_sets_cardinality = kct_binding_sets_cardinality(test_spec, kct_variables.kct_mt());
            final SubLObject binding_sets_min_cardinality = kct_binding_sets_min_cardinality(test_spec, kct_variables.kct_mt());
            final SubLObject binding_sets_max_cardinality = kct_binding_sets_max_cardinality(test_spec, kct_variables.kct_mt());
            final SubLObject support_wanted = kb_mapping_utilities.pred_values_in_mt(test_spec, $$testAnswerSupport_Wanted, kct_variables.kct_mt(), ONE_INTEGER, TWO_INTEGER, UNPROVIDED);
            final SubLObject support_not_wanted = kb_mapping_utilities.pred_values_in_mt(test_spec, $$testAnswerSupport_NotWanted, kct_variables.kct_mt(), ONE_INTEGER, TWO_INTEGER, UNPROVIDED);
            final SubLObject support_module_wanted = kb_mapping_utilities.pred_values_in_mt(test_spec, $const42$testAnswerSupportedByHLSupportMod, kct_variables.kct_mt(), ONE_INTEGER, TWO_INTEGER, UNPROVIDED);
            final SubLObject support_module_not_wanted = kb_mapping_utilities.pred_values_in_mt(test_spec, $const43$testAnswerSupportedByHLSupportMod, kct_variables.kct_mt(), ONE_INTEGER, TWO_INTEGER, UNPROVIDED);
            SubLObject bad_exact = NIL;
            SubLObject bad_wanted = NIL;
            SubLObject bad_not_wanted = NIL;
            if (((((((((((NIL == exact) && (NIL == unimportant)) && (NIL == wanted)) && (NIL == not_wanted)) && (NIL == binding_sets_cardinality)) && (NIL == binding_sets_min_cardinality)) && (NIL == binding_sets_max_cardinality)) && (NIL == support_wanted)) && (NIL == support_not_wanted)) && (NIL == support_module_wanted)) && (NIL == support_module_not_wanted)) {
                result = $SEVERE;
                message = cconcatenate(message, format(NIL, $str44$___A_has_no_stated_test_expectati, test_spec));
                problem_keywords = cons($NO_TEST_EXPECTATION, problem_keywords);
            }
            SubLObject cdolist_list_var = cycl_utilities.nat_args(exact, UNPROVIDED);
            SubLObject binding_set = NIL;
            binding_set = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == bindings.kb_binding_set_p(binding_set)) {
                    bad_exact = cons(binding_set, bad_exact);
                }
                cdolist_list_var = cdolist_list_var.rest();
                binding_set = cdolist_list_var.first();
            } 
            if (NIL != bad_exact) {
                result = $SEVERE;
                message = cconcatenate(message, format(NIL, $str45$___A_s_exact_answer_should_includ, test_spec));
                problem_keywords = cons($EXACT_ANSWER_CONTAINS_MALFORMED_INFERENCE_BINDING_SET, problem_keywords);
                cdolist_list_var = bad_exact;
                SubLObject bad = NIL;
                bad = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    message = cconcatenate(message, format(NIL, $str47$_A_, bad));
                    cdolist_list_var = cdolist_list_var.rest();
                    bad = cdolist_list_var.first();
                } 
            }
            cdolist_list_var = wanted;
            binding_set = NIL;
            binding_set = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == bindings.kb_binding_set_p(binding_set)) {
                    bad_wanted = cons(binding_set, bad_wanted);
                }
                cdolist_list_var = cdolist_list_var.rest();
                binding_set = cdolist_list_var.first();
            } 
            if (NIL != bad_wanted) {
                result = $SEVERE;
                message = cconcatenate(message, format(NIL, $str48$___A_s_wanted_answer_should_be_an, test_spec));
                problem_keywords = cons($WANTED_ANSWER_IS_NOT_AN_INFERENCE_BINDING_SET, problem_keywords);
                cdolist_list_var = bad_wanted;
                SubLObject bad = NIL;
                bad = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    message = cconcatenate(message, format(NIL, $str47$_A_, bad));
                    cdolist_list_var = cdolist_list_var.rest();
                    bad = cdolist_list_var.first();
                } 
            }
            cdolist_list_var = not_wanted;
            binding_set = NIL;
            binding_set = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL == bindings.kb_binding_set_p(binding_set)) {
                    bad_not_wanted = cons(binding_set, bad_not_wanted);
                }
                cdolist_list_var = cdolist_list_var.rest();
                binding_set = cdolist_list_var.first();
            } 
            if (NIL != bad_not_wanted) {
                result = $SEVERE;
                message = cconcatenate(message, format(NIL, $str50$___A_s_unwanted_answer_should_be_, test_spec));
                problem_keywords = cons($UNWANTED_ANSWER_IS_NOT_AN_INFERENCE_BINDING_SET, problem_keywords);
                cdolist_list_var = bad_not_wanted;
                SubLObject bad = NIL;
                bad = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    message = cconcatenate(message, format(NIL, $str47$_A_, bad));
                    cdolist_list_var = cdolist_list_var.rest();
                    bad = cdolist_list_var.first();
                } 
            }
        }
        final SubLObject cyclists = kct_responsible_cyclists(test_spec, UNPROVIDED);
        if (NIL == cyclists) {
            if (result != $SEVERE) {
                result = $PROBLEM;
            }
            message = cconcatenate(message, format(NIL, $str53$___A_does_not_have_a_responsible_, test_spec));
            problem_keywords = cons($NO_RESPONSIBLE_CYCLIST, problem_keywords);
        }
        return values(result, message, nreverse(problem_keywords));
    }

    /**
     * Returns a dictionary mapping lists of severe KCT invalidity reasons to lists of queries
     * which are invalid for those reasons.
     */
    @LispMethod(comment = "Returns a dictionary mapping lists of severe KCT invalidity reasons to lists of queries\r\nwhich are invalid for those reasons.\nReturns a dictionary mapping lists of severe KCT invalidity reasons to lists of queries\nwhich are invalid for those reasons.")
    public static final SubLObject categorize_kct_invalidity_reasons_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject dict = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        {
                            SubLObject node_var = $$KBContentTest_FullySpecified;
                            {
                                SubLObject _prev_bind_0_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                SubLObject _prev_bind_1_6 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                                try {
                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
                                    sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                    {
                                        SubLObject node_var_7 = node_var;
                                        SubLObject deck_type = (false) ? ((SubLObject) ($QUEUE)) : $STACK;
                                        SubLObject recur_deck = deck.create_deck(deck_type);
                                        {
                                            SubLObject _prev_bind_0_8 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                            try {
                                                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                                {
                                                    SubLObject tv_var = NIL;
                                                    {
                                                        SubLObject _prev_bind_0_9 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                                        SubLObject _prev_bind_1_10 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                                        try {
                                                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? ((SubLObject) (tv_var)) : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? ((SubLObject) (RELEVANT_SBHL_TV_IS_GENERAL_TV)) : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                                            if (NIL != tv_var) {
                                                                if (NIL != sbhl_paranoia.sbhl_object_type_checking_p()) {
                                                                    if (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                                        {
                                                                            SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                                            if (pcase_var.eql($ERROR)) {
                                                                                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str_alt59$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                            } else {
                                                                                if (pcase_var.eql($CERROR)) {
                                                                                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str_alt59$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                } else {
                                                                                    if (pcase_var.eql($WARN)) {
                                                                                        Errors.warn($str_alt59$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                    } else {
                                                                                        Errors.warn($str_alt64$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                                                        Errors.cerror($$$continue_anyway, $str_alt59$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                            {
                                                                SubLObject _prev_bind_0_11 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                                SubLObject _prev_bind_1_12 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                                                SubLObject _prev_bind_2 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                                                SubLObject _prev_bind_3 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                SubLObject _prev_bind_4 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                try {
                                                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                                                    if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                                                        {
                                                                            SubLObject _prev_bind_0_13 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                            SubLObject _prev_bind_1_14 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                            SubLObject _prev_bind_2_15 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var_7, UNPROVIDED);
                                                                                while (NIL != node_var_7) {
                                                                                    {
                                                                                        SubLObject tt_node_var = node_var_7;
                                                                                        SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                                                                        SubLObject cdolist_list_var = accessible_modules;
                                                                                        SubLObject module_var = NIL;
                                                                                        for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                                            {
                                                                                                SubLObject _prev_bind_0_16 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                                SubLObject _prev_bind_1_17 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                try {
                                                                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                                    {
                                                                                                        SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                            {
                                                                                                                SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                if (NIL != d_link) {
                                                                                                                    {
                                                                                                                        SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                        if (NIL != mt_links) {
                                                                                                                            {
                                                                                                                                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                    {
                                                                                                                                        SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                        SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                                            {
                                                                                                                                                SubLObject _prev_bind_0_18 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                                try {
                                                                                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                                    {
                                                                                                                                                        SubLObject iteration_state_19 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_19)) {
                                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                                            {
                                                                                                                                                                SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_19);
                                                                                                                                                                SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                                    {
                                                                                                                                                                        SubLObject _prev_bind_0_20 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                        try {
                                                                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                            {
                                                                                                                                                                                SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                                SubLObject cdolist_list_var_21 = new_list;
                                                                                                                                                                                SubLObject test = NIL;
                                                                                                                                                                                for (test = cdolist_list_var_21.first(); NIL != cdolist_list_var_21; cdolist_list_var_21 = cdolist_list_var_21.rest() , test = cdolist_list_var_21.first()) {
                                                                                                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(test, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(test, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                                                                                        if (NIL != fort_p(test)) {
                                                                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                                                                            {
                                                                                                                                                                                                SubLObject invalid = com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_utils.why_not_kct_test_valid(test);
                                                                                                                                                                                                SubLObject why_string = thread.secondMultipleValue();
                                                                                                                                                                                                SubLObject why_keywords = thread.thirdMultipleValue();
                                                                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                                                                if ($SEVERE == invalid) {
                                                                                                                                                                                                    {
                                                                                                                                                                                                        SubLObject query = com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_utils.kct_query_specification(test, UNPROVIDED);
                                                                                                                                                                                                        if (NIL == isa.not_isaP(query, $$AreteQuery, UNPROVIDED, UNPROVIDED)) {
                                                                                                                                                                                                            why_keywords = delete($NO_RESPONSIBLE_CYCLIST, why_keywords, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                                                                                                            dictionary_utilities.dictionary_push(dict, why_keywords, test);
                                                                                                                                                                                                        }
                                                                                                                                                                                                    }
                                                                                                                                                                                                }
                                                                                                                                                                                            }
                                                                                                                                                                                        }
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        } finally {
                                                                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_20, thread);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                iteration_state_19 = dictionary_contents.do_dictionary_contents_next(iteration_state_19);
                                                                                                                                                            }
                                                                                                                                                        } 
                                                                                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_19);
                                                                                                                                                    }
                                                                                                                                                } finally {
                                                                                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_18, thread);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                                    }
                                                                                                                                } 
                                                                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt66$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                }
                                                                                                            }
                                                                                                            if (NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
                                                                                                                {
                                                                                                                    SubLObject csome_list_var = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                                                                    SubLObject instance_tuple = NIL;
                                                                                                                    for (instance_tuple = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , instance_tuple = csome_list_var.first()) {
                                                                                                                        {
                                                                                                                            SubLObject datum = instance_tuple;
                                                                                                                            SubLObject current = datum;
                                                                                                                            SubLObject link_node = NIL;
                                                                                                                            SubLObject mt = NIL;
                                                                                                                            SubLObject tv = NIL;
                                                                                                                            destructuring_bind_must_consp(current, datum, $list_alt67);
                                                                                                                            link_node = current.first();
                                                                                                                            current = current.rest();
                                                                                                                            destructuring_bind_must_consp(current, datum, $list_alt67);
                                                                                                                            mt = current.first();
                                                                                                                            current = current.rest();
                                                                                                                            destructuring_bind_must_consp(current, datum, $list_alt67);
                                                                                                                            tv = current.first();
                                                                                                                            current = current.rest();
                                                                                                                            if (NIL == current) {
                                                                                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                                    {
                                                                                                                                        SubLObject _prev_bind_0_22 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                        try {
                                                                                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                {
                                                                                                                                                    SubLObject _prev_bind_0_23 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                    try {
                                                                                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                        {
                                                                                                                                                            SubLObject link_nodes = list(link_node);
                                                                                                                                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                            SubLObject cdolist_list_var_24 = new_list;
                                                                                                                                                            SubLObject test = NIL;
                                                                                                                                                            for (test = cdolist_list_var_24.first(); NIL != cdolist_list_var_24; cdolist_list_var_24 = cdolist_list_var_24.rest() , test = cdolist_list_var_24.first()) {
                                                                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(test, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(test, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                                                                    if (NIL != fort_p(test)) {
                                                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                                                        {
                                                                                                                                                                            SubLObject invalid = com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_utils.why_not_kct_test_valid(test);
                                                                                                                                                                            SubLObject why_string = thread.secondMultipleValue();
                                                                                                                                                                            SubLObject why_keywords = thread.thirdMultipleValue();
                                                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                                                            if ($SEVERE == invalid) {
                                                                                                                                                                                {
                                                                                                                                                                                    SubLObject query = com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_utils.kct_query_specification(test, UNPROVIDED);
                                                                                                                                                                                    if (NIL == isa.not_isaP(query, $$AreteQuery, UNPROVIDED, UNPROVIDED)) {
                                                                                                                                                                                        why_keywords = delete($NO_RESPONSIBLE_CYCLIST, why_keywords, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                                                                                        dictionary_utilities.dictionary_push(dict, why_keywords, test);
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    } finally {
                                                                                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_23, thread);
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        } finally {
                                                                                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_22, thread);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            } else {
                                                                                                                                cdestructuring_bind_error(datum, $list_alt67);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        } else {
                                                                                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                                {
                                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                    SubLObject cdolist_list_var_25 = new_list;
                                                                                                                    SubLObject generating_fn = NIL;
                                                                                                                    for (generating_fn = cdolist_list_var_25.first(); NIL != cdolist_list_var_25; cdolist_list_var_25 = cdolist_list_var_25.rest() , generating_fn = cdolist_list_var_25.first()) {
                                                                                                                        {
                                                                                                                            SubLObject _prev_bind_0_26 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                            try {
                                                                                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                                {
                                                                                                                                    SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                                    SubLObject new_list_27 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                    SubLObject cdolist_list_var_28 = new_list_27;
                                                                                                                                    SubLObject test = NIL;
                                                                                                                                    for (test = cdolist_list_var_28.first(); NIL != cdolist_list_var_28; cdolist_list_var_28 = cdolist_list_var_28.rest() , test = cdolist_list_var_28.first()) {
                                                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(test, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(test, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                                            if (NIL != fort_p(test)) {
                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                {
                                                                                                                                                    SubLObject invalid = com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_utils.why_not_kct_test_valid(test);
                                                                                                                                                    SubLObject why_string = thread.secondMultipleValue();
                                                                                                                                                    SubLObject why_keywords = thread.thirdMultipleValue();
                                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                                    if ($SEVERE == invalid) {
                                                                                                                                                        {
                                                                                                                                                            SubLObject query = com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_utils.kct_query_specification(test, UNPROVIDED);
                                                                                                                                                            if (NIL == isa.not_isaP(query, $$AreteQuery, UNPROVIDED, UNPROVIDED)) {
                                                                                                                                                                why_keywords = delete($NO_RESPONSIBLE_CYCLIST, why_keywords, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                                                                dictionary_utilities.dictionary_push(dict, why_keywords, test);
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            } finally {
                                                                                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_26, thread);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                } finally {
                                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_17, thread);
                                                                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_16, thread);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    {
                                                                                        SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)));
                                                                                        SubLObject cdolist_list_var = accessible_modules;
                                                                                        SubLObject module_var = NIL;
                                                                                        for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                                            {
                                                                                                SubLObject _prev_bind_0_29 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                                SubLObject _prev_bind_1_30 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                                try {
                                                                                                    sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                                    {
                                                                                                        SubLObject node = function_terms.naut_to_nart(node_var_7);
                                                                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                                                                            {
                                                                                                                SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                if (NIL != d_link) {
                                                                                                                    {
                                                                                                                        SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                        if (NIL != mt_links) {
                                                                                                                            {
                                                                                                                                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                                                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                                                                    thread.resetMultipleValues();
                                                                                                                                    {
                                                                                                                                        SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                                                                        SubLObject tv_links = thread.secondMultipleValue();
                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                                            {
                                                                                                                                                SubLObject _prev_bind_0_31 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                                try {
                                                                                                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                                    {
                                                                                                                                                        SubLObject iteration_state_32 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_32)) {
                                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                                            {
                                                                                                                                                                SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_32);
                                                                                                                                                                SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                                thread.resetMultipleValues();
                                                                                                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                                    {
                                                                                                                                                                        SubLObject _prev_bind_0_33 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                        try {
                                                                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                            {
                                                                                                                                                                                SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                                SubLObject cdolist_list_var_34 = new_list;
                                                                                                                                                                                SubLObject node_vars_link_node = NIL;
                                                                                                                                                                                for (node_vars_link_node = cdolist_list_var_34.first(); NIL != cdolist_list_var_34; cdolist_list_var_34 = cdolist_list_var_34.rest() , node_vars_link_node = cdolist_list_var_34.first()) {
                                                                                                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                                        deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        } finally {
                                                                                                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_33, thread);
                                                                                                                                                                        }
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                                iteration_state_32 = dictionary_contents.do_dictionary_contents_next(iteration_state_32);
                                                                                                                                                            }
                                                                                                                                                        } 
                                                                                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_32);
                                                                                                                                                    }
                                                                                                                                                } finally {
                                                                                                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_31, thread);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                                                                    }
                                                                                                                                } 
                                                                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                } else {
                                                                                                                    sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt66$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                }
                                                                                                            }
                                                                                                        } else {
                                                                                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                                {
                                                                                                                    SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                    SubLObject cdolist_list_var_35 = new_list;
                                                                                                                    SubLObject generating_fn = NIL;
                                                                                                                    for (generating_fn = cdolist_list_var_35.first(); NIL != cdolist_list_var_35; cdolist_list_var_35 = cdolist_list_var_35.rest() , generating_fn = cdolist_list_var_35.first()) {
                                                                                                                        {
                                                                                                                            SubLObject _prev_bind_0_36 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                            try {
                                                                                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                                {
                                                                                                                                    SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                                    SubLObject new_list_37 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                    SubLObject cdolist_list_var_38 = new_list_37;
                                                                                                                                    SubLObject node_vars_link_node = NIL;
                                                                                                                                    for (node_vars_link_node = cdolist_list_var_38.first(); NIL != cdolist_list_var_38; cdolist_list_var_38 = cdolist_list_var_38.rest() , node_vars_link_node = cdolist_list_var_38.first()) {
                                                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            } finally {
                                                                                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_36, thread);
                                                                                                                            }
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                } finally {
                                                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_30, thread);
                                                                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_29, thread);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    node_var_7 = deck.deck_pop(recur_deck);
                                                                                } 
                                                                            } finally {
                                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_15, thread);
                                                                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_14, thread);
                                                                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_13, thread);
                                                                            }
                                                                        }
                                                                    } else {
                                                                        sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt68$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    }
                                                                } finally {
                                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                                                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_12, thread);
                                                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_11, thread);
                                                                }
                                                            }
                                                        } finally {
                                                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_10, thread);
                                                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_9, thread);
                                                        }
                                                    }
                                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                                }
                                            } finally {
                                                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_8, thread);
                                            }
                                        }
                                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                    }
                                } finally {
                                    sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1_6, thread);
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_5, thread);
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return dict;
            }
        }
    }

    /**
     * Returns a dictionary mapping lists of severe KCT invalidity reasons to lists of queries
     * which are invalid for those reasons.
     */
    @LispMethod(comment = "Returns a dictionary mapping lists of severe KCT invalidity reasons to lists of queries\r\nwhich are invalid for those reasons.\nReturns a dictionary mapping lists of severe KCT invalidity reasons to lists of queries\nwhich are invalid for those reasons.")
    public static SubLObject categorize_kct_invalidity_reasons() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject dict = dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject node_var = $$KBContentTest_FullySpecified;
            final SubLObject _prev_bind_0_$5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            final SubLObject _prev_bind_1_$6 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
            try {
                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
                sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    SubLObject node_var_$7 = node_var;
                    final SubLObject deck_type = $STACK;
                    final SubLObject recur_deck = deck.create_deck(deck_type);
                    final SubLObject _prev_bind_0_$6 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject tv_var = NIL;
                            final SubLObject _prev_bind_0_$7 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$7 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                    if (pcase_var.eql($ERROR)) {
                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str60$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($CERROR)) {
                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str60$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else
                                            if (pcase_var.eql($WARN)) {
                                                Errors.warn($str60$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                            } else {
                                                Errors.warn($str65$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                Errors.cerror($$$continue_anyway, $str60$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                            }


                                }
                                final SubLObject _prev_bind_0_$8 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$8 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)), thread);
                                    if ((NIL != sbhl_paranoia.suspend_sbhl_type_checkingP()) || (NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module(UNPROVIDED)))) {
                                        final SubLObject _prev_bind_0_$9 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$9 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$15 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$7, UNPROVIDED);
                                            while (NIL != node_var_$7) {
                                                final SubLObject tt_node_var = node_var_$7;
                                                SubLObject cdolist_list_var;
                                                final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                                SubLObject module_var = NIL;
                                                module_var = cdolist_list_var.first();
                                                while (NIL != cdolist_list_var) {
                                                    final SubLObject _prev_bind_0_$10 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$10 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                        final SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != d_link) {
                                                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != mt_links) {
                                                                    SubLObject iteration_state;
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        final SubLObject tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                            final SubLObject _prev_bind_0_$11 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                SubLObject iteration_state_$19;
                                                                                for (iteration_state_$19 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$19); iteration_state_$19 = dictionary_contents.do_dictionary_contents_next(iteration_state_$19)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$19);
                                                                                    final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        final SubLObject _prev_bind_0_$12 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            final SubLObject sol = link_nodes;
                                                                                            if (NIL != set.set_p(sol)) {
                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state;
                                                                                                SubLObject test;
                                                                                                SubLObject invalid;
                                                                                                SubLObject why_string;
                                                                                                SubLObject why_keywords;
                                                                                                SubLObject query;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    test = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state, test)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(test, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(test, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (NIL != forts.fort_p(test)) {
                                                                                                            thread.resetMultipleValues();
                                                                                                            invalid = why_not_kct_test_valid(test);
                                                                                                            why_string = thread.secondMultipleValue();
                                                                                                            why_keywords = thread.thirdMultipleValue();
                                                                                                            thread.resetMultipleValues();
                                                                                                            if ($SEVERE == invalid) {
                                                                                                                query = kct_query_specification(test, UNPROVIDED);
                                                                                                                if (NIL == isa.not_isaP(query, $$AreteQuery, UNPROVIDED, UNPROVIDED)) {
                                                                                                                    why_keywords = delete($NO_RESPONSIBLE_CYCLIST, why_keywords, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                    dictionary_utilities.dictionary_push(dict, why_keywords, test);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (sol.isList()) {
                                                                                                    SubLObject csome_list_var = sol;
                                                                                                    SubLObject test2 = NIL;
                                                                                                    test2 = csome_list_var.first();
                                                                                                    while (NIL != csome_list_var) {
                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(test2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(test2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            if (NIL != forts.fort_p(test2)) {
                                                                                                                thread.resetMultipleValues();
                                                                                                                final SubLObject invalid2 = why_not_kct_test_valid(test2);
                                                                                                                final SubLObject why_string2 = thread.secondMultipleValue();
                                                                                                                SubLObject why_keywords2 = thread.thirdMultipleValue();
                                                                                                                thread.resetMultipleValues();
                                                                                                                if ($SEVERE == invalid2) {
                                                                                                                    final SubLObject query2 = kct_query_specification(test2, UNPROVIDED);
                                                                                                                    if (NIL == isa.not_isaP(query2, $$AreteQuery, UNPROVIDED, UNPROVIDED)) {
                                                                                                                        why_keywords2 = delete($NO_RESPONSIBLE_CYCLIST, why_keywords2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                        dictionary_utilities.dictionary_push(dict, why_keywords2, test2);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        csome_list_var = csome_list_var.rest();
                                                                                                        test2 = csome_list_var.first();
                                                                                                    } 
                                                                                                } else {
                                                                                                    Errors.error($str67$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$12, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$19);
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$11, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str68$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                            if (NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module(UNPROVIDED))) {
                                                                SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                SubLObject instance_tuple = NIL;
                                                                instance_tuple = csome_list_var2.first();
                                                                while (NIL != csome_list_var2) {
                                                                    SubLObject current;
                                                                    final SubLObject datum = current = instance_tuple;
                                                                    SubLObject link_node = NIL;
                                                                    SubLObject mt2 = NIL;
                                                                    SubLObject tv2 = NIL;
                                                                    destructuring_bind_must_consp(current, datum, $list69);
                                                                    link_node = current.first();
                                                                    current = current.rest();
                                                                    destructuring_bind_must_consp(current, datum, $list69);
                                                                    mt2 = current.first();
                                                                    current = current.rest();
                                                                    destructuring_bind_must_consp(current, datum, $list69);
                                                                    tv2 = current.first();
                                                                    current = current.rest();
                                                                    if (NIL == current) {
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                            final SubLObject _prev_bind_0_$13 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                    final SubLObject _prev_bind_0_$14 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                        final SubLObject sol;
                                                                                        final SubLObject link_nodes2 = sol = list(link_node);
                                                                                        if (NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject test;
                                                                                            SubLObject invalid;
                                                                                            SubLObject why_string;
                                                                                            SubLObject why_keywords;
                                                                                            SubLObject query;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                test = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state, test)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(test, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(test, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if (NIL != forts.fort_p(test)) {
                                                                                                        thread.resetMultipleValues();
                                                                                                        invalid = why_not_kct_test_valid(test);
                                                                                                        why_string = thread.secondMultipleValue();
                                                                                                        why_keywords = thread.thirdMultipleValue();
                                                                                                        thread.resetMultipleValues();
                                                                                                        if ($SEVERE == invalid) {
                                                                                                            query = kct_query_specification(test, UNPROVIDED);
                                                                                                            if (NIL == isa.not_isaP(query, $$AreteQuery, UNPROVIDED, UNPROVIDED)) {
                                                                                                                why_keywords = delete($NO_RESPONSIBLE_CYCLIST, why_keywords, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                dictionary_utilities.dictionary_push(dict, why_keywords, test);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol.isList()) {
                                                                                                SubLObject csome_list_var_$23 = sol;
                                                                                                SubLObject test2 = NIL;
                                                                                                test2 = csome_list_var_$23.first();
                                                                                                while (NIL != csome_list_var_$23) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(test2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(test2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (NIL != forts.fort_p(test2)) {
                                                                                                            thread.resetMultipleValues();
                                                                                                            final SubLObject invalid2 = why_not_kct_test_valid(test2);
                                                                                                            final SubLObject why_string2 = thread.secondMultipleValue();
                                                                                                            SubLObject why_keywords2 = thread.thirdMultipleValue();
                                                                                                            thread.resetMultipleValues();
                                                                                                            if ($SEVERE == invalid2) {
                                                                                                                final SubLObject query2 = kct_query_specification(test2, UNPROVIDED);
                                                                                                                if (NIL == isa.not_isaP(query2, $$AreteQuery, UNPROVIDED, UNPROVIDED)) {
                                                                                                                    why_keywords2 = delete($NO_RESPONSIBLE_CYCLIST, why_keywords2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                                    dictionary_utilities.dictionary_push(dict, why_keywords2, test2);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    csome_list_var_$23 = csome_list_var_$23.rest();
                                                                                                    test2 = csome_list_var_$23.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error($str67$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$14, thread);
                                                                                    }
                                                                                }
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$13, thread);
                                                                            }
                                                                        }
                                                                    } else {
                                                                        cdestructuring_bind_error(datum, $list69);
                                                                    }
                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                    instance_tuple = csome_list_var2.first();
                                                                } 
                                                            }
                                                        } else
                                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                SubLObject cdolist_list_var_$24;
                                                                final SubLObject new_list = cdolist_list_var_$24 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                SubLObject generating_fn = NIL;
                                                                generating_fn = cdolist_list_var_$24.first();
                                                                while (NIL != cdolist_list_var_$24) {
                                                                    final SubLObject _prev_bind_0_$15 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                        final SubLObject sol2;
                                                                        final SubLObject link_nodes3 = sol2 = funcall(generating_fn, node);
                                                                        if (NIL != set.set_p(sol2)) {
                                                                            final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                            SubLObject basis_object2;
                                                                            SubLObject state2;
                                                                            SubLObject test3;
                                                                            SubLObject invalid3;
                                                                            SubLObject why_string3;
                                                                            SubLObject why_keywords3;
                                                                            SubLObject query3;
                                                                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                test3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state2, test3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(test3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(test3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                    if (NIL != forts.fort_p(test3)) {
                                                                                        thread.resetMultipleValues();
                                                                                        invalid3 = why_not_kct_test_valid(test3);
                                                                                        why_string3 = thread.secondMultipleValue();
                                                                                        why_keywords3 = thread.thirdMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        if ($SEVERE == invalid3) {
                                                                                            query3 = kct_query_specification(test3, UNPROVIDED);
                                                                                            if (NIL == isa.not_isaP(query3, $$AreteQuery, UNPROVIDED, UNPROVIDED)) {
                                                                                                why_keywords3 = delete($NO_RESPONSIBLE_CYCLIST, why_keywords3, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                dictionary_utilities.dictionary_push(dict, why_keywords3, test3);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else
                                                                            if (sol2.isList()) {
                                                                                SubLObject csome_list_var3 = sol2;
                                                                                SubLObject test4 = NIL;
                                                                                test4 = csome_list_var3.first();
                                                                                while (NIL != csome_list_var3) {
                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(test4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(test4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                        if (NIL != forts.fort_p(test4)) {
                                                                                            thread.resetMultipleValues();
                                                                                            final SubLObject invalid4 = why_not_kct_test_valid(test4);
                                                                                            final SubLObject why_string4 = thread.secondMultipleValue();
                                                                                            SubLObject why_keywords4 = thread.thirdMultipleValue();
                                                                                            thread.resetMultipleValues();
                                                                                            if ($SEVERE == invalid4) {
                                                                                                final SubLObject query4 = kct_query_specification(test4, UNPROVIDED);
                                                                                                if (NIL == isa.not_isaP(query4, $$AreteQuery, UNPROVIDED, UNPROVIDED)) {
                                                                                                    why_keywords4 = delete($NO_RESPONSIBLE_CYCLIST, why_keywords4, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                    dictionary_utilities.dictionary_push(dict, why_keywords4, test4);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    csome_list_var3 = csome_list_var3.rest();
                                                                                    test4 = csome_list_var3.first();
                                                                                } 
                                                                            } else {
                                                                                Errors.error($str67$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                            }

                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$15, thread);
                                                                    }
                                                                    cdolist_list_var_$24 = cdolist_list_var_$24.rest();
                                                                    generating_fn = cdolist_list_var_$24.first();
                                                                } 
                                                            }

                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$10, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$10, thread);
                                                    }
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    module_var = cdolist_list_var.first();
                                                } 
                                                SubLObject cdolist_list_var2;
                                                final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)));
                                                SubLObject module_var2 = NIL;
                                                module_var2 = cdolist_list_var2.first();
                                                while (NIL != cdolist_list_var2) {
                                                    final SubLObject _prev_bind_0_$16 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$11 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                        final SubLObject node2 = function_terms.naut_to_nart(node_var_$7);
                                                        if (NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                            final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                            if (NIL != d_link2) {
                                                                final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                if (NIL != mt_links2) {
                                                                    SubLObject iteration_state2;
                                                                    for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                        final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt3)) {
                                                                            final SubLObject _prev_bind_0_$17 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                                SubLObject iteration_state_$20;
                                                                                for (iteration_state_$20 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$20); iteration_state_$20 = dictionary_contents.do_dictionary_contents_next(iteration_state_$20)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$20);
                                                                                    final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                        final SubLObject _prev_bind_0_$18 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                            final SubLObject sol3 = link_nodes4;
                                                                                            if (NIL != set.set_p(sol3)) {
                                                                                                final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                                SubLObject basis_object3;
                                                                                                SubLObject state3;
                                                                                                SubLObject node_vars_link_node;
                                                                                                for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (sol3.isList()) {
                                                                                                    SubLObject csome_list_var4 = sol3;
                                                                                                    SubLObject node_vars_link_node2 = NIL;
                                                                                                    node_vars_link_node2 = csome_list_var4.first();
                                                                                                    while (NIL != csome_list_var4) {
                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, UNPROVIDED)) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, UNPROVIDED);
                                                                                                            deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                        }
                                                                                                        csome_list_var4 = csome_list_var4.rest();
                                                                                                        node_vars_link_node2 = csome_list_var4.first();
                                                                                                    } 
                                                                                                } else {
                                                                                                    Errors.error($str67$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$18, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$20);
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$17, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str68$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                        } else
                                                            if (NIL != obsolete.cnat_p(node2, UNPROVIDED)) {
                                                                SubLObject cdolist_list_var_$25;
                                                                final SubLObject new_list2 = cdolist_list_var_$25 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                SubLObject generating_fn2 = NIL;
                                                                generating_fn2 = cdolist_list_var_$25.first();
                                                                while (NIL != cdolist_list_var_$25) {
                                                                    final SubLObject _prev_bind_0_$19 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                        final SubLObject sol4;
                                                                        final SubLObject link_nodes5 = sol4 = funcall(generating_fn2, node2);
                                                                        if (NIL != set.set_p(sol4)) {
                                                                            final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                            SubLObject basis_object4;
                                                                            SubLObject state4;
                                                                            SubLObject node_vars_link_node3;
                                                                            for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                                node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, UNPROVIDED))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, UNPROVIDED);
                                                                                    deck.deck_push(node_vars_link_node3, recur_deck);
                                                                                }
                                                                            }
                                                                        } else
                                                                            if (sol4.isList()) {
                                                                                SubLObject csome_list_var5 = sol4;
                                                                                SubLObject node_vars_link_node4 = NIL;
                                                                                node_vars_link_node4 = csome_list_var5.first();
                                                                                while (NIL != csome_list_var5) {
                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, UNPROVIDED)) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, UNPROVIDED);
                                                                                        deck.deck_push(node_vars_link_node4, recur_deck);
                                                                                    }
                                                                                    csome_list_var5 = csome_list_var5.rest();
                                                                                    node_vars_link_node4 = csome_list_var5.first();
                                                                                } 
                                                                            } else {
                                                                                Errors.error($str67$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                            }

                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$19, thread);
                                                                    }
                                                                    cdolist_list_var_$25 = cdolist_list_var_$25.rest();
                                                                    generating_fn2 = cdolist_list_var_$25.first();
                                                                } 
                                                            }

                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$11, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$16, thread);
                                                    }
                                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                                    module_var2 = cdolist_list_var2.first();
                                                } 
                                                node_var_$7 = deck.deck_pop(recur_deck);
                                            } 
                                        } finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$15, thread);
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$9, thread);
                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$9, thread);
                                        }
                                    } else {
                                        sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str70$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                } finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$8, thread);
                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$8, thread);
                                }
                            } finally {
                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$7, thread);
                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$7, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$20 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$6, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$21 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$21, thread);
                    }
                }
            } finally {
                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1_$6, thread);
                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$5, thread);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return dict;
    }

    /**
     * Evaluate TEST-COL for problems.  If any are found, return a token and a non empty message.
     *
     * @return keywordp or nil - NIL if there are no problems; :PROBLEM if there a problem that should be
    reported, but the test category is still runnable, and :SEVERE if the problem will
    prevent the test category from running.
     * @return stringp - Empty string if no problems were found; otherwise, a string containing one or more
    problem descriptions.
     */
    @LispMethod(comment = "Evaluate TEST-COL for problems.  If any are found, return a token and a non empty message.\r\n\r\n@return keywordp or nil - NIL if there are no problems; :PROBLEM if there a problem that should be\r\nreported, but the test category is still runnable, and :SEVERE if the problem will\r\nprevent the test category from running.\r\n@return stringp - Empty string if no problems were found; otherwise, a string containing one or more\r\nproblem descriptions.")
    public static final SubLObject why_not_kct_test_collection_valid_alt(SubLObject test_col) {
        {
            SubLObject result = NIL;
            SubLObject message = $str_alt33$;
            if (NIL == com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_utils.kct_test_collection_p(test_col, UNPROVIDED)) {
                result = $SEVERE;
                message = cconcatenate(message, format(NIL, $str_alt69$___A_is_not_a___KBContentTestSpec, test_col));
                return values(result, message);
            }
            {
                SubLObject cyclists = com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_utils.kct_collection_responsible_cyclists(test_col, UNPROVIDED);
                if (NIL == cyclists) {
                    result = $PROBLEM;
                    message = cconcatenate(message, format(NIL, $str_alt70$___A_has_no_responsible_Cyclists_, test_col));
                }
            }
            {
                SubLObject test_specs = com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_utils.kct_test_collection_instances(test_col, UNPROVIDED);
                if (NIL == test_specs) {
                    result = $PROBLEM;
                    message = cconcatenate(message, format(NIL, $str_alt71$___A_has_no_instances_, test_col));
                }
            }
            return values(result, message);
        }
    }

    /**
     * Evaluate TEST-COL for problems.  If any are found, return a token and a non empty message.
     *
     * @return keywordp or nil - NIL if there are no problems; :PROBLEM if there a problem that should be
    reported, but the test category is still runnable, and :SEVERE if the problem will
    prevent the test category from running.
     * @return stringp - Empty string if no problems were found; otherwise, a string containing one or more
    problem descriptions.
     */
    @LispMethod(comment = "Evaluate TEST-COL for problems.  If any are found, return a token and a non empty message.\r\n\r\n@return keywordp or nil - NIL if there are no problems; :PROBLEM if there a problem that should be\r\nreported, but the test category is still runnable, and :SEVERE if the problem will\r\nprevent the test category from running.\r\n@return stringp - Empty string if no problems were found; otherwise, a string containing one or more\r\nproblem descriptions.")
    public static SubLObject why_not_kct_test_collection_valid(final SubLObject test_col) {
        SubLObject result = NIL;
        SubLObject message = $str33$;
        if (NIL == kct_test_collection_p(test_col, UNPROVIDED)) {
            result = $SEVERE;
            message = cconcatenate(message, format(NIL, $str71$___A_is_not_a___KBContentTestSpec, test_col));
            return values(result, message);
        }
        final SubLObject cyclists = kct_collection_responsible_cyclists(test_col, UNPROVIDED);
        if (NIL == cyclists) {
            result = $PROBLEM;
            message = cconcatenate(message, format(NIL, $str72$___A_has_no_responsible_Cyclists_, test_col));
        }
        final SubLObject test_specs = kct_test_collection_instances(test_col, UNPROVIDED);
        if (NIL == test_specs) {
            result = $PROBLEM;
            message = cconcatenate(message, format(NIL, $str73$___A_has_no_instances_, test_col));
        }
        return values(result, message);
    }/**
     * Evaluate TEST-COL for problems.  If any are found, return a token and a non empty message.
     *
     * @return keywordp or nil - NIL if there are no problems; :PROBLEM if there a problem that should be
    reported, but the test category is still runnable, and :SEVERE if the problem will
    prevent the test category from running.
     * @return stringp - Empty string if no problems were found; otherwise, a string containing one or more
    problem descriptions.
     */


    public static final SubLObject printable_execution_mode_alt(SubLObject execution_mode) {
        {
            SubLObject alist = list(cons(ctest_utils.$sampling_execution_mode$.getGlobalValue(), $$$Sampling), cons(ctest_utils.$hypothesize_execution_mode$.getGlobalValue(), $$$Hypothesize), cons(ctest_utils.$simple_execution_mode$.getGlobalValue(), $$$Simple));
            return assoc(execution_mode, alist, symbol_function(EQUAL), UNPROVIDED).rest();
        }
    }

    public static SubLObject printable_execution_mode(final SubLObject execution_mode) {
        final SubLObject alist = list(cons(ctest_utils.$sampling_execution_mode$.getGlobalValue(), $$$Sampling), cons(ctest_utils.$hypothesize_execution_mode$.getGlobalValue(), $$$Hypothesize), cons(ctest_utils.$simple_execution_mode$.getGlobalValue(), $$$Simple));
        return assoc(execution_mode, alist, symbol_function(EQUAL), UNPROVIDED).rest();
    }

    public static final SubLObject printable_execution_type_alt(SubLObject execution_type) {
        {
            SubLObject alist = list(cons(ctest_utils.$collection_execution_type$.getGlobalValue(), $$$Test_Set), cons(ctest_utils.$individual_execution_type$.getGlobalValue(), $$$Individual_Test));
            return assoc(execution_type, alist, symbol_function(EQUAL), UNPROVIDED).rest();
        }
    }

    public static SubLObject printable_execution_type(final SubLObject execution_type) {
        final SubLObject alist = list(cons(ctest_utils.$collection_execution_type$.getGlobalValue(), $$$Test_Set), cons(ctest_utils.$individual_execution_type$.getGlobalValue(), $$$Individual_Test));
        return assoc(execution_type, alist, symbol_function(EQUAL), UNPROVIDED).rest();
    }

    public static final SubLObject kct_default_for_parameter_alt(SubLObject parameter_constant) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(parameter_constant, FORT_P);
            {
                SubLObject result = NIL;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate($$CycArchitectureMt);
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        {
                            SubLObject value = kb_mapping_utilities.pred_arg_values($$CycKBContentTestFramework, $const94$defaultSoftwareParameterValueInSo, parameter_constant, THREE_INTEGER, ONE_INTEGER, TWO_INTEGER, UNPROVIDED).first();
                            SubLObject pcase_var = value;
                            if (pcase_var.eql($$True)) {
                                result = T;
                            } else {
                                if (pcase_var.eql($$False)) {
                                    result = NIL;
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    public static SubLObject kct_default_for_parameter(final SubLObject parameter_constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(parameter_constant) : "! forts.fort_p(parameter_constant) " + ("forts.fort_p(parameter_constant) " + "CommonSymbols.NIL != forts.fort_p(parameter_constant) ") + parameter_constant;
        SubLObject result = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate($$CycArchitectureMt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject pcase_var;
            final SubLObject value = pcase_var = kb_mapping_utilities.pred_arg_values($$CycKBContentTestFramework, $const81$defaultSoftwareParameterValueInSo, parameter_constant, THREE_INTEGER, ONE_INTEGER, TWO_INTEGER, UNPROVIDED, UNPROVIDED).first();
            if (pcase_var.eql($$True)) {
                result = T;
            } else
                if (pcase_var.eql($$False)) {
                    result = NIL;
                }

        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static final SubLObject kct_new_hlmt_alt(SubLObject monad_mt, SubLObject temporal_object, SubLObject time_param) {
        return hlmt.new_hlmt(list(monad_mt, hlmt.new_time_dimension(temporal_object, time_param)));
    }

    public static SubLObject kct_new_hlmt(final SubLObject monad_mt, final SubLObject temporal_object, final SubLObject time_param) {
        return hlmt.new_hlmt(list(monad_mt, hlmt.new_time_dimension(temporal_object, time_param)));
    }

    public static final SubLObject kct_transform_query_results_for_comparison(SubLObject query_results) {
        {
            SubLObject el_results = cycl_utilities.binding_lists_hl_to_el(query_results);
            if (NIL != bindings.binding_lists_p(query_results)) {
                el_results = Mapping.mapcar(CANONICALIZE_QUERY_BINDINGS_INT, el_results);
            }
            return el_results;
        }
    }

    public static SubLObject kct_transform_query_results_for_comparison(final SubLObject query_results, final SubLObject hypothetical_bindings) {
        final SubLObject substituted_results = substitute_hypothetical_terms_for_indexicals(query_results, hypothetical_bindings);
        SubLObject el_results = cycl_utilities.binding_lists_hl_to_el(substituted_results);
        if (NIL != bindings.binding_lists_p(query_results)) {
            el_results = Mapping.mapcar(CANONICALIZE_QUERY_BINDINGS_INT, el_results);
        }
        return el_results;
    }

    public static SubLObject substitute_hypothetical_terms_for_indexicals(final SubLObject query_results, final SubLObject hypothetical_bindings) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == hypothetical_bindings) {
            return query_results;
        }
        final SubLObject _prev_bind_0 = $hypothetical_bindings_to_substitute$.currentBinding(thread);
        try {
            $hypothetical_bindings_to_substitute$.bind(hypothetical_bindings, thread);
            return transform_list_utilities.transform(query_results, HYPOTHETICAL_FOR_VARIABLE_FN_TERM_P, HYPOTHETICAL_FOR_VARIABLE, UNPROVIDED);
        } finally {
            $hypothetical_bindings_to_substitute$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject hypothetical_for_variable_fn_term_p(final SubLObject v_object) {
        return makeBoolean((NIL != possibly_naut_p(v_object)) && (NIL != el_formula_with_operator_p(v_object, $$HypotheticalForVariableFn)));
    }

    public static SubLObject hypothetical_for_variable(final SubLObject hfv_naut) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject variable = cycl_utilities.nat_arg1(hfv_naut, UNPROVIDED);
        final SubLObject thing = list_utilities.alist_lookup($hypothetical_bindings_to_substitute$.getDynamicValue(thread), variable, UNPROVIDED, UNPROVIDED);
        if (NIL == thing) {
            Errors.warn($str90$When_determining_test_results__co, variable);
        }
        return thing;
    }

    public static final SubLObject canonicalize_query_bindings_int_alt(SubLObject v_bindings) {
        return com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_utils.ncanonicalize_query_bindings_int(copy_list(v_bindings));
    }

    public static SubLObject canonicalize_query_bindings_int(final SubLObject v_bindings) {
        return ncanonicalize_query_bindings_int(copy_list(v_bindings));
    }

    public static final SubLObject ncanonicalize_query_bindings_int_alt(SubLObject v_bindings) {
        {
            SubLObject canonical_bindings = Mapping.mapcar(NCANONICALIZE_QUERY_BINDING_INT, v_bindings);
            SubLObject sorted_bindings = Sort.sort(canonical_bindings, $sym99$TERM__, VARIABLE_BINDING_VARIABLE);
            return list_utilities.delete_duplicates_sorted(sorted_bindings, symbol_function(EQUAL));
        }
    }

    public static SubLObject ncanonicalize_query_bindings_int(final SubLObject v_bindings) {
        final SubLObject canonical_bindings = Mapping.mapcar(NCANONICALIZE_QUERY_BINDING_INT, v_bindings);
        final SubLObject sorted_bindings = Sort.sort(canonical_bindings, $sym92$TERM__, VARIABLE_BINDING_VARIABLE);
        return list_utilities.delete_duplicates_sorted(sorted_bindings, symbol_function(EQUAL));
    }

    /**
     * canonicalizes the value of BINDING (wrt e.g. commutative term reordering)
     * and ensures it's still at the EL
     */
    @LispMethod(comment = "canonicalizes the value of BINDING (wrt e.g. commutative term reordering)\r\nand ensures it\'s still at the EL\ncanonicalizes the value of BINDING (wrt e.g. commutative term reordering)\nand ensures it\'s still at the EL")
    public static final SubLObject ncanonicalize_query_binding_int_alt(SubLObject binding) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                SubLObject datum = binding;
                SubLObject current = datum;
                SubLObject variable = NIL;
                SubLObject value = NIL;
                destructuring_bind_must_consp(current, datum, $list_alt101);
                variable = current.first();
                current = current.rest();
                value = current;
                {
                    SubLObject _prev_bind_0 = czer_vars.$reify_skolemsP$.currentBinding(thread);
                    SubLObject _prev_bind_1 = czer_vars.$canonicalize_functionsP$.currentBinding(thread);
                    try {
                        czer_vars.$reify_skolemsP$.bind(NIL, thread);
                        czer_vars.$canonicalize_functionsP$.bind(NIL, thread);
                        {
                            SubLObject canonical_value = cycl_utilities.hl_to_el(czer_main.canonicalize_term(value, UNPROVIDED));
                            result = bindings.make_variable_binding(variable, canonical_value);
                        }
                    } finally {
                        czer_vars.$canonicalize_functionsP$.rebind(_prev_bind_1, thread);
                        czer_vars.$reify_skolemsP$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * canonicalizes the value of BINDING (wrt e.g. commutative term reordering)
     * and ensures it's still at the EL
     */
    @LispMethod(comment = "canonicalizes the value of BINDING (wrt e.g. commutative term reordering)\r\nand ensures it\'s still at the EL\ncanonicalizes the value of BINDING (wrt e.g. commutative term reordering)\nand ensures it\'s still at the EL")
    public static SubLObject ncanonicalize_query_binding_int(final SubLObject binding) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject variable = NIL;
        SubLObject value = NIL;
        destructuring_bind_must_consp(binding, binding, $list94);
        variable = binding.first();
        final SubLObject current = value = binding.rest();
        final SubLObject _prev_bind_0 = czer_vars.$reify_skolemsP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = czer_vars.$canonicalize_functionsP$.currentBinding(thread);
        try {
            czer_vars.$reify_skolemsP$.bind(NIL, thread);
            czer_vars.$canonicalize_functionsP$.bind(NIL, thread);
            final SubLObject canonical_value = cycl_utilities.hl_to_el(czer_main.canonicalize_term(value, UNPROVIDED));
            result = bindings.make_variable_binding(variable, canonical_value);
        } finally {
            czer_vars.$canonicalize_functionsP$.rebind(_prev_bind_2, thread);
            czer_vars.$reify_skolemsP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }/**
     * canonicalizes the value of BINDING (wrt e.g. commutative term reordering)
     * and ensures it's still at the EL
     */


    public static final SubLObject kct_transform_set_of_binding_sets_alt(SubLObject inference_set_of_binding_sets, SubLObject filter) {
        {
            SubLObject new_set_of_binding_sets = NIL;
            SubLObject cdolist_list_var = inference_set_of_binding_sets;
            SubLObject binding_set = NIL;
            for (binding_set = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , binding_set = cdolist_list_var.first()) {
                {
                    SubLObject new_binding_set = NIL;
                    SubLObject cdolist_list_var_39 = binding_set;
                    SubLObject binding = NIL;
                    for (binding = cdolist_list_var_39.first(); NIL != cdolist_list_var_39; cdolist_list_var_39 = cdolist_list_var_39.rest() , binding = cdolist_list_var_39.first()) {
                        new_binding_set = cons(bindings.make_variable_binding(bindings.variable_binding_variable(binding), funcall(filter, bindings.variable_binding_value(binding))), new_binding_set);
                    }
                    new_binding_set = nreverse(new_binding_set);
                    new_set_of_binding_sets = cons(new_binding_set, new_set_of_binding_sets);
                }
            }
            new_set_of_binding_sets = nreverse(new_set_of_binding_sets);
            return new_set_of_binding_sets;
        }
    }

    public static SubLObject kct_transform_set_of_binding_sets(final SubLObject inference_set_of_binding_sets, final SubLObject filter) {
        SubLObject new_set_of_binding_sets = NIL;
        SubLObject cdolist_list_var = inference_set_of_binding_sets;
        SubLObject binding_set = NIL;
        binding_set = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject new_binding_set = NIL;
            SubLObject cdolist_list_var_$35 = binding_set;
            SubLObject binding = NIL;
            binding = cdolist_list_var_$35.first();
            while (NIL != cdolist_list_var_$35) {
                new_binding_set = cons(bindings.make_variable_binding(bindings.variable_binding_variable(binding), funcall(filter, bindings.variable_binding_value(binding))), new_binding_set);
                cdolist_list_var_$35 = cdolist_list_var_$35.rest();
                binding = cdolist_list_var_$35.first();
            } 
            new_binding_set = nreverse(new_binding_set);
            new_set_of_binding_sets = cons(new_binding_set, new_set_of_binding_sets);
            cdolist_list_var = cdolist_list_var.rest();
            binding_set = cdolist_list_var.first();
        } 
        new_set_of_binding_sets = nreverse(new_set_of_binding_sets);
        return new_set_of_binding_sets;
    }

    public static final SubLObject kct_formula_if_assertion_alt(SubLObject v_object) {
        if (NIL != assertion_handles.assertion_p(v_object)) {
            return fi.assertion_hl_formula(v_object, UNPROVIDED);
        } else {
            return v_object;
        }
    }

    public static SubLObject kct_formula_if_assertion(final SubLObject v_object) {
        if (NIL != assertion_handles.assertion_p(v_object)) {
            return fi.assertion_hl_formula(v_object, UNPROVIDED);
        }
        return v_object;
    }

    public static final SubLObject declare_kct_utils_file_alt() {
        declareFunction("initialize_kct", "INITIALIZE-KCT", 0, 0, false);
        declareFunction("initialize_kct_kb_feature", "INITIALIZE-KCT-KB-FEATURE", 0, 0, false);
        declareFunction("kct_query_specification", "KCT-QUERY-SPECIFICATION", 1, 1, false);
        declareFunction("kct_initialize", "KCT-INITIALIZE", 0, 0, false);
        declareFunction("kct_test_spec_p", "KCT-TEST-SPEC-P", 1, 1, false);
        declareFunction("kct_test_spec_permissive_p", "KCT-TEST-SPEC-PERMISSIVE-P", 1, 0, false);
        declareFunction("kct_test_collection_p", "KCT-TEST-COLLECTION-P", 1, 1, false);
        declareFunction("kct_asserted_test_collections", "KCT-ASSERTED-TEST-COLLECTIONS", 1, 1, false);
        declareFunction("kct_comments", "KCT-COMMENTS", 1, 1, false);
        declareFunction("kct_test_collection_instances", "KCT-TEST-COLLECTION-INSTANCES", 1, 1, false);
        declareFunction("kct_responsible_cyclists", "KCT-RESPONSIBLE-CYCLISTS", 1, 1, false);
        declareFunction("kct_collection_responsible_cyclists", "KCT-COLLECTION-RESPONSIBLE-CYCLISTS", 1, 1, false);
        declareFunction("kct_test_metrics", "KCT-TEST-METRICS", 1, 1, false);
        declareFunction("kct_exact_set_of_binding_sets", "KCT-EXACT-SET-OF-BINDING-SETS", 1, 1, false);
        declareFunction("kct_exact_binding_sets", "KCT-EXACT-BINDING-SETS", 1, 1, false);
        declareFunction("kct_wanted_binding_sets", "KCT-WANTED-BINDING-SETS", 1, 1, false);
        declareFunction("kct_unwanted_binding_sets", "KCT-UNWANTED-BINDING-SETS", 1, 1, false);
        declareFunction("kct_bindings_unimportantP", "KCT-BINDINGS-UNIMPORTANT?", 1, 1, false);
        declareFunction("kct_binding_sets_cardinality", "KCT-BINDING-SETS-CARDINALITY", 1, 1, false);
        declareFunction("kct_binding_sets_min_cardinality", "KCT-BINDING-SETS-MIN-CARDINALITY", 1, 1, false);
        declareFunction("kct_binding_sets_max_cardinality", "KCT-BINDING-SETS-MAX-CARDINALITY", 1, 1, false);
        declareFunction("kct_defining_mt", "KCT-DEFINING-MT", 1, 0, false);
        declareFunction("kct_test_runnableP", "KCT-TEST-RUNNABLE?", 1, 0, false);
        declareFunction("kct_test_known_unrunnableP", "KCT-TEST-KNOWN-UNRUNNABLE?", 1, 0, false);
        declareFunction("why_not_kct_test_valid", "WHY-NOT-KCT-TEST-VALID", 1, 0, false);
        declareFunction("categorize_kct_invalidity_reasons", "CATEGORIZE-KCT-INVALIDITY-REASONS", 0, 0, false);
        declareFunction("why_not_kct_test_collection_valid", "WHY-NOT-KCT-TEST-COLLECTION-VALID", 1, 0, false);
        declareFunction("config_problem_notify", "CONFIG-PROBLEM-NOTIFY", 3, 0, false);
        declareFunction("printable_execution_mode", "PRINTABLE-EXECUTION-MODE", 1, 0, false);
        declareFunction("printable_execution_type", "PRINTABLE-EXECUTION-TYPE", 1, 0, false);
        declareFunction("kct_default_for_parameter", "KCT-DEFAULT-FOR-PARAMETER", 1, 0, false);
        declareFunction("kct_new_hlmt", "KCT-NEW-HLMT", 3, 0, false);
        declareFunction("kct_transform_query_results_for_comparison", "KCT-TRANSFORM-QUERY-RESULTS-FOR-COMPARISON", 1, 0, false);
        declareFunction("canonicalize_query_bindings_int", "CANONICALIZE-QUERY-BINDINGS-INT", 1, 0, false);
        declareFunction("ncanonicalize_query_bindings_int", "NCANONICALIZE-QUERY-BINDINGS-INT", 1, 0, false);
        declareFunction("ncanonicalize_query_binding_int", "NCANONICALIZE-QUERY-BINDING-INT", 1, 0, false);
        declareFunction("kct_transform_set_of_binding_sets", "KCT-TRANSFORM-SET-OF-BINDING-SETS", 2, 0, false);
        declareFunction("kct_formula_if_assertion", "KCT-FORMULA-IF-ASSERTION", 1, 0, false);
        declareFunction("get_test_spec_validity_col_ok", "GET-TEST-SPEC-VALIDITY-COL-OK", 1, 0, false);
        declareFunction("set_test_spec_validity_col_ok", "SET-TEST-SPEC-VALIDITY-COL-OK", 2, 0, false);
        declareFunction("get_test_spec_validity_col_no_instances", "GET-TEST-SPEC-VALIDITY-COL-NO-INSTANCES", 1, 0, false);
        declareFunction("set_test_spec_validity_col_no_instances", "SET-TEST-SPEC-VALIDITY-COL-NO-INSTANCES", 2, 0, false);
        declareFunction("get_test_spec_validity_col_no_cyclist", "GET-TEST-SPEC-VALIDITY-COL-NO-CYCLIST", 1, 0, false);
        declareFunction("set_test_spec_validity_col_no_cyclist", "SET-TEST-SPEC-VALIDITY-COL-NO-CYCLIST", 2, 0, false);
        declareFunction("get_test_spec_validity_col_not_col", "GET-TEST-SPEC-VALIDITY-COL-NOT-COL", 1, 0, false);
        declareFunction("set_test_spec_validity_col_not_col", "SET-TEST-SPEC-VALIDITY-COL-NOT-COL", 2, 0, false);
        declareFunction("get_test_spec_validity_all_ok2", "GET-TEST-SPEC-VALIDITY-ALL-OK2", 1, 0, false);
        declareFunction("set_test_spec_validity_all_ok2", "SET-TEST-SPEC-VALIDITY-ALL-OK2", 2, 0, false);
        declareFunction("get_test_spec_validity_all_ok1", "GET-TEST-SPEC-VALIDITY-ALL-OK1", 1, 0, false);
        declareFunction("set_test_spec_validity_all_ok1", "SET-TEST-SPEC-VALIDITY-ALL-OK1", 2, 0, false);
        declareFunction("get_test_spec_validity_no_expected", "GET-TEST-SPEC-VALIDITY-NO-EXPECTED", 1, 0, false);
        declareFunction("set_test_spec_validity_no_expected", "SET-TEST-SPEC-VALIDITY-NO-EXPECTED", 2, 0, false);
        declareFunction("get_test_spec_validity_no_cyclist", "GET-TEST-SPEC-VALIDITY-NO-CYCLIST", 1, 0, false);
        declareFunction("set_test_spec_validity_no_cyclist", "SET-TEST-SPEC-VALIDITY-NO-CYCLIST", 2, 0, false);
        declareFunction("get_test_spec_validity_too_many_sentences", "GET-TEST-SPEC-VALIDITY-TOO-MANY-SENTENCES", 1, 0, false);
        declareFunction("set_test_spec_validity_too_many_sentences", "SET-TEST-SPEC-VALIDITY-TOO-MANY-SENTENCES", 2, 0, false);
        declareFunction("get_test_spec_validity_no_sentence", "GET-TEST-SPEC-VALIDITY-NO-SENTENCE", 1, 0, false);
        declareFunction("set_test_spec_validity_no_sentence", "SET-TEST-SPEC-VALIDITY-NO-SENTENCE", 2, 0, false);
        declareFunction("get_test_spec_validity_too_many_mts", "GET-TEST-SPEC-VALIDITY-TOO-MANY-MTS", 1, 0, false);
        declareFunction("set_test_spec_validity_too_many_mts", "SET-TEST-SPEC-VALIDITY-TOO-MANY-MTS", 2, 0, false);
        declareFunction("get_test_spec_validity_no_mt_but_ist", "GET-TEST-SPEC-VALIDITY-NO-MT-BUT-IST", 1, 0, false);
        declareFunction("set_test_spec_validity_no_mt_but_ist", "SET-TEST-SPEC-VALIDITY-NO-MT-BUT-IST", 2, 0, false);
        declareFunction("get_test_spec_validity_no_mt_not_ist", "GET-TEST-SPEC-VALIDITY-NO-MT-NOT-IST", 1, 0, false);
        declareFunction("set_test_spec_validity_no_mt_not_ist", "SET-TEST-SPEC-VALIDITY-NO-MT-NOT-IST", 2, 0, false);
        declareFunction("get_test_spec_validity_no_query_spec", "GET-TEST-SPEC-VALIDITY-NO-QUERY-SPEC", 1, 0, false);
        declareFunction("set_test_spec_validity_no_query_spec", "SET-TEST-SPEC-VALIDITY-NO-QUERY-SPEC", 2, 0, false);
        declareFunction("get_test_spec_validity_non_test_spec", "GET-TEST-SPEC-VALIDITY-NON-TEST-SPEC", 1, 0, false);
        declareFunction("set_test_spec_validity_non_test_spec", "SET-TEST-SPEC-VALIDITY-NON-TEST-SPEC", 2, 0, false);
        declareFunction("get_test_spec_validity_responsible", "GET-TEST-SPEC-VALIDITY-RESPONSIBLE", 1, 0, false);
        declareFunction("set_test_spec_validity_responsible", "SET-TEST-SPEC-VALIDITY-RESPONSIBLE", 2, 0, false);
        declareFunction("subloop_reserved_initialize_test_spec_validity_class", "SUBLOOP-RESERVED-INITIALIZE-TEST-SPEC-VALIDITY-CLASS", 1, 0, false);
        declareFunction("subloop_reserved_initialize_test_spec_validity_instance", "SUBLOOP-RESERVED-INITIALIZE-TEST-SPEC-VALIDITY-INSTANCE", 1, 0, false);
        declareFunction("test_spec_validity_p", "TEST-SPEC-VALIDITY-P", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_kct_utils_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("initialize_kct", "INITIALIZE-KCT", 0, 0, false);
            declareFunction("initialize_kct_kb_feature", "INITIALIZE-KCT-KB-FEATURE", 0, 0, false);
            declareFunction("kct_query_specification", "KCT-QUERY-SPECIFICATION", 1, 1, false);
            declareFunction("query_specification_kcts", "QUERY-SPECIFICATION-KCTS", 1, 1, false);
            declareFunction("kct_initialize", "KCT-INITIALIZE", 0, 0, false);
            declareFunction("kct_test_spec_p", "KCT-TEST-SPEC-P", 1, 1, false);
            declareFunction("kct_test_spec_permissive_p", "KCT-TEST-SPEC-PERMISSIVE-P", 1, 0, false);
            declareFunction("kct_test_collection_p", "KCT-TEST-COLLECTION-P", 1, 1, false);
            declareFunction("kct_asserted_test_collections", "KCT-ASSERTED-TEST-COLLECTIONS", 1, 1, false);
            declareFunction("kct_comments", "KCT-COMMENTS", 1, 1, false);
            declareFunction("kct_test_collection_instances", "KCT-TEST-COLLECTION-INSTANCES", 1, 1, false);
            declareFunction("kct_responsible_cyclists", "KCT-RESPONSIBLE-CYCLISTS", 1, 1, false);
            declareFunction("kct_collection_responsible_cyclists", "KCT-COLLECTION-RESPONSIBLE-CYCLISTS", 1, 1, false);
            declareFunction("kct_test_metrics", "KCT-TEST-METRICS", 1, 1, false);
            declareFunction("kct_exact_set_of_binding_sets", "KCT-EXACT-SET-OF-BINDING-SETS", 1, 1, false);
            declareFunction("kct_exact_binding_sets", "KCT-EXACT-BINDING-SETS", 1, 1, false);
            declareFunction("kct_wanted_binding_sets", "KCT-WANTED-BINDING-SETS", 1, 1, false);
            declareFunction("kct_unwanted_binding_sets", "KCT-UNWANTED-BINDING-SETS", 1, 1, false);
            declareFunction("kct_bindings_unimportantP", "KCT-BINDINGS-UNIMPORTANT?", 1, 1, false);
            declareFunction("kct_binding_sets_cardinality", "KCT-BINDING-SETS-CARDINALITY", 1, 1, false);
            declareFunction("kct_binding_sets_min_cardinality", "KCT-BINDING-SETS-MIN-CARDINALITY", 1, 1, false);
            declareFunction("kct_binding_sets_max_cardinality", "KCT-BINDING-SETS-MAX-CARDINALITY", 1, 1, false);
            declareFunction("kct_defining_mt", "KCT-DEFINING-MT", 1, 0, false);
            declareFunction("kct_test_runnableP", "KCT-TEST-RUNNABLE?", 1, 0, false);
            declareFunction("kct_test_known_unrunnableP", "KCT-TEST-KNOWN-UNRUNNABLE?", 1, 0, false);
            declareFunction("why_not_kct_test_valid", "WHY-NOT-KCT-TEST-VALID", 1, 0, false);
            declareFunction("categorize_kct_invalidity_reasons", "CATEGORIZE-KCT-INVALIDITY-REASONS", 0, 0, false);
            declareFunction("why_not_kct_test_collection_valid", "WHY-NOT-KCT-TEST-COLLECTION-VALID", 1, 0, false);
            declareFunction("printable_execution_mode", "PRINTABLE-EXECUTION-MODE", 1, 0, false);
            declareFunction("printable_execution_type", "PRINTABLE-EXECUTION-TYPE", 1, 0, false);
            declareFunction("kct_default_for_parameter", "KCT-DEFAULT-FOR-PARAMETER", 1, 0, false);
            declareFunction("kct_new_hlmt", "KCT-NEW-HLMT", 3, 0, false);
            declareFunction("kct_transform_query_results_for_comparison", "KCT-TRANSFORM-QUERY-RESULTS-FOR-COMPARISON", 2, 0, false);
            declareFunction("substitute_hypothetical_terms_for_indexicals", "SUBSTITUTE-HYPOTHETICAL-TERMS-FOR-INDEXICALS", 2, 0, false);
            declareFunction("hypothetical_for_variable_fn_term_p", "HYPOTHETICAL-FOR-VARIABLE-FN-TERM-P", 1, 0, false);
            declareFunction("hypothetical_for_variable", "HYPOTHETICAL-FOR-VARIABLE", 1, 0, false);
            declareFunction("canonicalize_query_bindings_int", "CANONICALIZE-QUERY-BINDINGS-INT", 1, 0, false);
            declareFunction("ncanonicalize_query_bindings_int", "NCANONICALIZE-QUERY-BINDINGS-INT", 1, 0, false);
            declareFunction("ncanonicalize_query_binding_int", "NCANONICALIZE-QUERY-BINDING-INT", 1, 0, false);
            declareFunction("kct_transform_set_of_binding_sets", "KCT-TRANSFORM-SET-OF-BINDING-SETS", 2, 0, false);
            declareFunction("kct_formula_if_assertion", "KCT-FORMULA-IF-ASSERTION", 1, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("config_problem_notify", "CONFIG-PROBLEM-NOTIFY", 3, 0, false);
            declareFunction("kct_transform_query_results_for_comparison", "KCT-TRANSFORM-QUERY-RESULTS-FOR-COMPARISON", 1, 0, false);
            declareFunction("get_test_spec_validity_col_ok", "GET-TEST-SPEC-VALIDITY-COL-OK", 1, 0, false);
            declareFunction("set_test_spec_validity_col_ok", "SET-TEST-SPEC-VALIDITY-COL-OK", 2, 0, false);
            declareFunction("get_test_spec_validity_col_no_instances", "GET-TEST-SPEC-VALIDITY-COL-NO-INSTANCES", 1, 0, false);
            declareFunction("set_test_spec_validity_col_no_instances", "SET-TEST-SPEC-VALIDITY-COL-NO-INSTANCES", 2, 0, false);
            declareFunction("get_test_spec_validity_col_no_cyclist", "GET-TEST-SPEC-VALIDITY-COL-NO-CYCLIST", 1, 0, false);
            declareFunction("set_test_spec_validity_col_no_cyclist", "SET-TEST-SPEC-VALIDITY-COL-NO-CYCLIST", 2, 0, false);
            declareFunction("get_test_spec_validity_col_not_col", "GET-TEST-SPEC-VALIDITY-COL-NOT-COL", 1, 0, false);
            declareFunction("set_test_spec_validity_col_not_col", "SET-TEST-SPEC-VALIDITY-COL-NOT-COL", 2, 0, false);
            declareFunction("get_test_spec_validity_all_ok2", "GET-TEST-SPEC-VALIDITY-ALL-OK2", 1, 0, false);
            declareFunction("set_test_spec_validity_all_ok2", "SET-TEST-SPEC-VALIDITY-ALL-OK2", 2, 0, false);
            declareFunction("get_test_spec_validity_all_ok1", "GET-TEST-SPEC-VALIDITY-ALL-OK1", 1, 0, false);
            declareFunction("set_test_spec_validity_all_ok1", "SET-TEST-SPEC-VALIDITY-ALL-OK1", 2, 0, false);
            declareFunction("get_test_spec_validity_no_expected", "GET-TEST-SPEC-VALIDITY-NO-EXPECTED", 1, 0, false);
            declareFunction("set_test_spec_validity_no_expected", "SET-TEST-SPEC-VALIDITY-NO-EXPECTED", 2, 0, false);
            declareFunction("get_test_spec_validity_no_cyclist", "GET-TEST-SPEC-VALIDITY-NO-CYCLIST", 1, 0, false);
            declareFunction("set_test_spec_validity_no_cyclist", "SET-TEST-SPEC-VALIDITY-NO-CYCLIST", 2, 0, false);
            declareFunction("get_test_spec_validity_too_many_sentences", "GET-TEST-SPEC-VALIDITY-TOO-MANY-SENTENCES", 1, 0, false);
            declareFunction("set_test_spec_validity_too_many_sentences", "SET-TEST-SPEC-VALIDITY-TOO-MANY-SENTENCES", 2, 0, false);
            declareFunction("get_test_spec_validity_no_sentence", "GET-TEST-SPEC-VALIDITY-NO-SENTENCE", 1, 0, false);
            declareFunction("set_test_spec_validity_no_sentence", "SET-TEST-SPEC-VALIDITY-NO-SENTENCE", 2, 0, false);
            declareFunction("get_test_spec_validity_too_many_mts", "GET-TEST-SPEC-VALIDITY-TOO-MANY-MTS", 1, 0, false);
            declareFunction("set_test_spec_validity_too_many_mts", "SET-TEST-SPEC-VALIDITY-TOO-MANY-MTS", 2, 0, false);
            declareFunction("get_test_spec_validity_no_mt_but_ist", "GET-TEST-SPEC-VALIDITY-NO-MT-BUT-IST", 1, 0, false);
            declareFunction("set_test_spec_validity_no_mt_but_ist", "SET-TEST-SPEC-VALIDITY-NO-MT-BUT-IST", 2, 0, false);
            declareFunction("get_test_spec_validity_no_mt_not_ist", "GET-TEST-SPEC-VALIDITY-NO-MT-NOT-IST", 1, 0, false);
            declareFunction("set_test_spec_validity_no_mt_not_ist", "SET-TEST-SPEC-VALIDITY-NO-MT-NOT-IST", 2, 0, false);
            declareFunction("get_test_spec_validity_no_query_spec", "GET-TEST-SPEC-VALIDITY-NO-QUERY-SPEC", 1, 0, false);
            declareFunction("set_test_spec_validity_no_query_spec", "SET-TEST-SPEC-VALIDITY-NO-QUERY-SPEC", 2, 0, false);
            declareFunction("get_test_spec_validity_non_test_spec", "GET-TEST-SPEC-VALIDITY-NON-TEST-SPEC", 1, 0, false);
            declareFunction("set_test_spec_validity_non_test_spec", "SET-TEST-SPEC-VALIDITY-NON-TEST-SPEC", 2, 0, false);
            declareFunction("get_test_spec_validity_responsible", "GET-TEST-SPEC-VALIDITY-RESPONSIBLE", 1, 0, false);
            declareFunction("set_test_spec_validity_responsible", "SET-TEST-SPEC-VALIDITY-RESPONSIBLE", 2, 0, false);
            declareFunction("subloop_reserved_initialize_test_spec_validity_class", "SUBLOOP-RESERVED-INITIALIZE-TEST-SPEC-VALIDITY-CLASS", 1, 0, false);
            declareFunction("subloop_reserved_initialize_test_spec_validity_instance", "SUBLOOP-RESERVED-INITIALIZE-TEST-SPEC-VALIDITY-INSTANCE", 1, 0, false);
            declareFunction("test_spec_validity_p", "TEST-SPEC-VALIDITY-P", 1, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_kct_utils_file_Previous() {
        declareFunction("initialize_kct", "INITIALIZE-KCT", 0, 0, false);
        declareFunction("initialize_kct_kb_feature", "INITIALIZE-KCT-KB-FEATURE", 0, 0, false);
        declareFunction("kct_query_specification", "KCT-QUERY-SPECIFICATION", 1, 1, false);
        declareFunction("query_specification_kcts", "QUERY-SPECIFICATION-KCTS", 1, 1, false);
        declareFunction("kct_initialize", "KCT-INITIALIZE", 0, 0, false);
        declareFunction("kct_test_spec_p", "KCT-TEST-SPEC-P", 1, 1, false);
        declareFunction("kct_test_spec_permissive_p", "KCT-TEST-SPEC-PERMISSIVE-P", 1, 0, false);
        declareFunction("kct_test_collection_p", "KCT-TEST-COLLECTION-P", 1, 1, false);
        declareFunction("kct_asserted_test_collections", "KCT-ASSERTED-TEST-COLLECTIONS", 1, 1, false);
        declareFunction("kct_comments", "KCT-COMMENTS", 1, 1, false);
        declareFunction("kct_test_collection_instances", "KCT-TEST-COLLECTION-INSTANCES", 1, 1, false);
        declareFunction("kct_responsible_cyclists", "KCT-RESPONSIBLE-CYCLISTS", 1, 1, false);
        declareFunction("kct_collection_responsible_cyclists", "KCT-COLLECTION-RESPONSIBLE-CYCLISTS", 1, 1, false);
        declareFunction("kct_test_metrics", "KCT-TEST-METRICS", 1, 1, false);
        declareFunction("kct_exact_set_of_binding_sets", "KCT-EXACT-SET-OF-BINDING-SETS", 1, 1, false);
        declareFunction("kct_exact_binding_sets", "KCT-EXACT-BINDING-SETS", 1, 1, false);
        declareFunction("kct_wanted_binding_sets", "KCT-WANTED-BINDING-SETS", 1, 1, false);
        declareFunction("kct_unwanted_binding_sets", "KCT-UNWANTED-BINDING-SETS", 1, 1, false);
        declareFunction("kct_bindings_unimportantP", "KCT-BINDINGS-UNIMPORTANT?", 1, 1, false);
        declareFunction("kct_binding_sets_cardinality", "KCT-BINDING-SETS-CARDINALITY", 1, 1, false);
        declareFunction("kct_binding_sets_min_cardinality", "KCT-BINDING-SETS-MIN-CARDINALITY", 1, 1, false);
        declareFunction("kct_binding_sets_max_cardinality", "KCT-BINDING-SETS-MAX-CARDINALITY", 1, 1, false);
        declareFunction("kct_defining_mt", "KCT-DEFINING-MT", 1, 0, false);
        declareFunction("kct_test_runnableP", "KCT-TEST-RUNNABLE?", 1, 0, false);
        declareFunction("kct_test_known_unrunnableP", "KCT-TEST-KNOWN-UNRUNNABLE?", 1, 0, false);
        declareFunction("why_not_kct_test_valid", "WHY-NOT-KCT-TEST-VALID", 1, 0, false);
        declareFunction("categorize_kct_invalidity_reasons", "CATEGORIZE-KCT-INVALIDITY-REASONS", 0, 0, false);
        declareFunction("why_not_kct_test_collection_valid", "WHY-NOT-KCT-TEST-COLLECTION-VALID", 1, 0, false);
        declareFunction("printable_execution_mode", "PRINTABLE-EXECUTION-MODE", 1, 0, false);
        declareFunction("printable_execution_type", "PRINTABLE-EXECUTION-TYPE", 1, 0, false);
        declareFunction("kct_default_for_parameter", "KCT-DEFAULT-FOR-PARAMETER", 1, 0, false);
        declareFunction("kct_new_hlmt", "KCT-NEW-HLMT", 3, 0, false);
        declareFunction("kct_transform_query_results_for_comparison", "KCT-TRANSFORM-QUERY-RESULTS-FOR-COMPARISON", 2, 0, false);
        declareFunction("substitute_hypothetical_terms_for_indexicals", "SUBSTITUTE-HYPOTHETICAL-TERMS-FOR-INDEXICALS", 2, 0, false);
        declareFunction("hypothetical_for_variable_fn_term_p", "HYPOTHETICAL-FOR-VARIABLE-FN-TERM-P", 1, 0, false);
        declareFunction("hypothetical_for_variable", "HYPOTHETICAL-FOR-VARIABLE", 1, 0, false);
        declareFunction("canonicalize_query_bindings_int", "CANONICALIZE-QUERY-BINDINGS-INT", 1, 0, false);
        declareFunction("ncanonicalize_query_bindings_int", "NCANONICALIZE-QUERY-BINDINGS-INT", 1, 0, false);
        declareFunction("ncanonicalize_query_binding_int", "NCANONICALIZE-QUERY-BINDING-INT", 1, 0, false);
        declareFunction("kct_transform_set_of_binding_sets", "KCT-TRANSFORM-SET-OF-BINDING-SETS", 2, 0, false);
        declareFunction("kct_formula_if_assertion", "KCT-FORMULA-IF-ASSERTION", 1, 0, false);
        return NIL;
    }

    public static SubLObject init_kct_utils_file() {
        defconstant("*KCT-TEST-EXECUTION-TYPE*", $$$I);
        defconstant("*KCT-COLLECTION-EXECUTION-TYPE*", $$$C);
        defparameter("*KCT-DEFAULT-ERROR-NOTIFY-CYCLIST*", NIL);
        defparameter("*KCT-USE-SAMPLING-MODE*", NIL);
        defparameter("*KCT-DEBUG*", NIL);
        deflexical("*KCT-CORE-CONSTANTS*", $list2);
        defparameter("*HYPOTHETICAL-BINDINGS-TO-SUBSTITUTE*", $UNINITIALIZED);
        return NIL;
    }

    public static final SubLObject setup_kct_utils_file_alt() {
        sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(TEST_SPEC_VALIDITY, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
        sunit_macros.define_test_case_preamble(TEST_SPEC_VALIDITY);
        classes.subloop_new_class(TEST_SPEC_VALIDITY, CYCL_TEST_CASE, NIL, NIL, $list_alt104);
        classes.class_set_implements_slot_listeners(TEST_SPEC_VALIDITY, NIL);
        classes.subloop_note_class_initialization_function(TEST_SPEC_VALIDITY, SUBLOOP_RESERVED_INITIALIZE_TEST_SPEC_VALIDITY_CLASS);
        classes.subloop_note_instance_initialization_function(TEST_SPEC_VALIDITY, SUBLOOP_RESERVED_INITIALIZE_TEST_SPEC_VALIDITY_INSTANCE);
        com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_utils.subloop_reserved_initialize_test_spec_validity_class(TEST_SPEC_VALIDITY);
        sunit_macros.define_test_case_postamble(TEST_SPEC_VALIDITY, $str_alt137$kct_utils, $$$cycl, NIL);
        sunit_macros.def_test_method_register(TEST_SPEC_VALIDITY, TEST_SPEC_VALIDATOR);
        return NIL;
    }

    public static SubLObject setup_kct_utils_file() {
        if (SubLFiles.USE_V1) {
        }
        if (SubLFiles.USE_V2) {
            sunit_macros.$current_module_sunit_tests$.setDynamicValue(cons(TEST_SPEC_VALIDITY, sunit_macros.$current_module_sunit_tests$.getDynamicValue()));
            sunit_macros.define_test_case_preamble(TEST_SPEC_VALIDITY);
            classes.subloop_new_class(TEST_SPEC_VALIDITY, CYCL_TEST_CASE, NIL, NIL, $list_alt104);
            classes.class_set_implements_slot_listeners(TEST_SPEC_VALIDITY, NIL);
            classes.subloop_note_class_initialization_function(TEST_SPEC_VALIDITY, SUBLOOP_RESERVED_INITIALIZE_TEST_SPEC_VALIDITY_CLASS);
            classes.subloop_note_instance_initialization_function(TEST_SPEC_VALIDITY, SUBLOOP_RESERVED_INITIALIZE_TEST_SPEC_VALIDITY_INSTANCE);
            com.cyc.cycjava.cycl.cyc_testing.kb_content_test.kct_utils.subloop_reserved_initialize_test_spec_validity_class(TEST_SPEC_VALIDITY);
            sunit_macros.define_test_case_postamble(TEST_SPEC_VALIDITY, $str_alt137$kct_utils, $$$cycl, NIL);
            sunit_macros.def_test_method_register(TEST_SPEC_VALIDITY, TEST_SPEC_VALIDATOR);
        }
        return NIL;
    }

    public static SubLObject setup_kct_utils_file_Previous() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_kct_utils_file();
    }

    @Override
    public void initializeVariables() {
        init_kct_utils_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_kct_utils_file();
    }

    static {
    }

    static private final SubLList $list_alt2 = list(reader_make_constant_shell("TestVocabularyMt"), reader_make_constant_shell("testQuerySpecification"));

    static private final SubLList $list_alt17 = list(makeKeyword("WHO"));

    static private final SubLList $list_alt27 = list(new SubLObject[]{ reader_make_constant_shell("testAnswersCycL-Exact"), reader_make_constant_shell("testAnswersCycL-Wanted"), reader_make_constant_shell("testAnswersCycL-NotWanted"), reader_make_constant_shell("testAnswersCycLUnimportant"), reader_make_constant_shell("testAnswerSupport-Wanted"), reader_make_constant_shell("testAnswerSupport-NotWanted"), reader_make_constant_shell("testAnswerSupportedByHLSupportModule-Wanted"), reader_make_constant_shell("testAnswerSupportedByHLSupportModule-NotWanted"), reader_make_constant_shell("testResponsibleCyclist"), reader_make_constant_shell("testQuerySpecification") });

    static private final SubLString $str_alt34$___A_is_not_a___KBContentTest_Ful = makeString("~%~A is not a #$KBContentTest-FullySpecified.");

    static private final SubLString $str_alt36$___A_does_not_have_a_valid_arg2_f = makeString("~%~A does not have a valid arg2 for #$testQuerySpecification.");

    public static final SubLObject $const40$testAnswerSupportedByHLSupportMod = reader_make_constant_shell("testAnswerSupportedByHLSupportModule-Wanted");

    public static final SubLObject $const41$testAnswerSupportedByHLSupportMod = reader_make_constant_shell("testAnswerSupportedByHLSupportModule-NotWanted");

    static private final SubLString $str_alt42$___A_has_no_stated_test_expectati = makeString("~%~A has no stated test expectation.");

    static private final SubLString $str_alt44$___A_s_exact_answer_should_includ = makeString("~%~A's exact answer should include only #$ELInferenceBindingSets, but these are not: ");

    static private final SubLString $str_alt46$_A_ = makeString("~A ");

    static private final SubLString $str_alt47$___A_s_wanted_answer_should_be_an = makeString("~%~A's wanted answer should be an #$ELInferenceBindingSet but isn't: ");

    static private final SubLString $str_alt49$___A_s_unwanted_answer_should_be_ = makeString("~%~A's unwanted answer should be an #$ELInferenceBindingSet but isn't: ");

    static private final SubLString $str_alt52$___A_does_not_have_a_responsible_ = makeString("~%~A does not have a responsible Cyclist.");

    static private final SubLString $str_alt59$_A_is_not_a__A = makeString("~A is not a ~A");

    static private final SubLString $str_alt64$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    static private final SubLString $str_alt66$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    static private final SubLList $list_alt67 = list(makeUninternedSymbol("LINK-NODE"), makeUninternedSymbol("MT"), makeUninternedSymbol("TV"));

    static private final SubLString $str_alt68$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    static private final SubLString $str_alt69$___A_is_not_a___KBContentTestSpec = makeString("~%~A is not a #$KBContentTestSpecificationType!");

    static private final SubLString $str_alt70$___A_has_no_responsible_Cyclists_ = makeString("~%~A has no responsible Cyclists.");

    static private final SubLString $str_alt71$___A_has_no_instances_ = makeString("~%~A has no instances.");

    static private final SubLString $str_alt72$__Machine___A__KB_version___A__ = makeString("~%Machine: ~A~%KB version: ~A~%");

    static private final SubLList $list_alt73 = list(reader_make_constant_shell("MtSpace"), reader_make_constant_shell("TestVocabularyMt"), list(reader_make_constant_shell("MtTimeWithGranularityDimFn"), reader_make_constant_shell("Now"), reader_make_constant_shell("Null-TimeParameter")));

    static private final SubLString $str_alt74$_ = makeString(" ");

    static private final SubLString $str_alt75$__Responsible_Cyclist_s____A____S = makeString("~%Responsible Cyclist(s): ~A~%~%Since this test or collection has no responsible cyclist(s), the default cyclist becomes the responsible cyclist.  The responsible cyclist is responsible for seeing that the configuration problems detailed below get fixed.~%");

    static private final SubLString $str_alt76$__Responsible_Cyclist_s____A____A = makeString("~%Responsible Cyclist(s): ~A~%~%As a responsible cyclist for this test or collection, you are responsible for fixing the configuration problems detailed below.~%");

    static private final SubLString $$$Test = makeString("Test");

    static private final SubLString $str_alt78$To_correct_the_problem__display__ = makeString("To correct the problem, display ~A in the Cyc Browser ~%and select [Edit Test] from the term toolbar.");

    static private final SubLString $$$Collection = makeString("Collection");

    static private final SubLString $str_alt80$__To_correct_the_problem__use_the = makeString("~%To correct the problem, use the Cyc Browser's assertion editing tools to add, edit, or remove missing, incorrect or superfluous information.");

    static private final SubLString $str_alt81$_A__A___A__A___has_minor_configur = makeString("~A ~A~%~A ~A ~%has minor configuration issues that do not stop the ~A from being executed. Please review the information provided below. ~A ~%~%~A");

    static private final SubLString $str_alt82$KCT__A__A_Configuration_Problem = makeString("KCT ~A ~A Configuration Problem");

    static private final SubLString $str_alt83$_A__A___A__A___has_configuration_ = makeString("~A ~A~%~A ~A ~%has configuration issues that render the ~A unexecutable. Please review the information provided below. ~A ~%~%~A");

    static private final SubLString $str_alt84$KCT__A__A_Configuration_Error = makeString("KCT ~A ~A Configuration Error");

    static private final SubLString $str_alt85$Can_t_notify__A_of_the_invalid__A = makeString("Can't notify ~A of the invalid ~A test/collection configuration -- no valid email address available.  Message: ~A");

    static private final SubLString $str_alt86$cyc_cyc_com = makeString("cyc@cyc.com");

    public static final SubLObject $const94$defaultSoftwareParameterValueInSo = reader_make_constant_shell("defaultSoftwareParameterValueInSoftwareObject");

    static private final SubLSymbol $sym99$TERM__ = makeSymbol("TERM-<");

    static private final SubLList $list_alt101 = cons(makeSymbol("VARIABLE"), makeSymbol("VALUE"));

    private static final SubLSymbol TEST_SPEC_VALIDITY = makeSymbol("TEST-SPEC-VALIDITY");

    private static final SubLSymbol CYCL_TEST_CASE = makeSymbol("CYCL-TEST-CASE");

    static private final SubLList $list_alt104 = list(new SubLObject[]{ list(makeSymbol("RESPONSIBLE"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("NON-TEST-SPEC"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("NO-QUERY-SPEC"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("NO-MT-NOT-IST"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("NO-MT-BUT-IST"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("TOO-MANY-MTS"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("NO-SENTENCE"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("TOO-MANY-SENTENCES"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("NO-CYCLIST"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("NO-EXPECTED"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("ALL-OK1"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("ALL-OK2"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("COL-NOT-COL"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("COL-NO-CYCLIST"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("COL-NO-INSTANCES"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("COL-OK"), makeKeyword("INSTANCE"), makeKeyword("PRIVATE")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("SETUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("CLEANUP"), NIL, makeKeyword("PROTECTED")), list(makeSymbol("DEF-INSTANCE-METHOD"), makeSymbol("TEST-SPEC-VALIDATOR"), NIL, makeKeyword("PROTECTED")) });

    private static final SubLSymbol COL_OK = makeSymbol("COL-OK");

    private static final SubLSymbol COL_NO_INSTANCES = makeSymbol("COL-NO-INSTANCES");

    private static final SubLSymbol COL_NO_CYCLIST = makeSymbol("COL-NO-CYCLIST");

    private static final SubLSymbol COL_NOT_COL = makeSymbol("COL-NOT-COL");

    private static final SubLSymbol ALL_OK2 = makeSymbol("ALL-OK2");

    private static final SubLSymbol ALL_OK1 = makeSymbol("ALL-OK1");

    private static final SubLSymbol NO_EXPECTED = makeSymbol("NO-EXPECTED");

    private static final SubLSymbol NO_CYCLIST = makeSymbol("NO-CYCLIST");

    private static final SubLSymbol TOO_MANY_SENTENCES = makeSymbol("TOO-MANY-SENTENCES");

    private static final SubLSymbol NO_SENTENCE = makeSymbol("NO-SENTENCE");

    private static final SubLSymbol TOO_MANY_MTS = makeSymbol("TOO-MANY-MTS");

    private static final SubLSymbol NO_MT_BUT_IST = makeSymbol("NO-MT-BUT-IST");

    private static final SubLSymbol NO_MT_NOT_IST = makeSymbol("NO-MT-NOT-IST");

    private static final SubLSymbol NO_QUERY_SPEC = makeSymbol("NO-QUERY-SPEC");

    private static final SubLSymbol NON_TEST_SPEC = makeSymbol("NON-TEST-SPEC");

    private static final SubLSymbol RESPONSIBLE = makeSymbol("RESPONSIBLE");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_TEST_SPEC_VALIDITY_CLASS = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TEST-SPEC-VALIDITY-CLASS");

    private static final SubLSymbol SUBLOOP_RESERVED_INITIALIZE_TEST_SPEC_VALIDITY_INSTANCE = makeSymbol("SUBLOOP-RESERVED-INITIALIZE-TEST-SPEC-VALIDITY-INSTANCE");

    static private final SubLString $str_alt137$kct_utils = makeString("kct-utils");

    static private final SubLString $$$cycl = makeString("cycl");

    private static final SubLSymbol TEST_SPEC_VALIDATOR = makeSymbol("TEST-SPEC-VALIDATOR");
}

/**
 * Total time: 1283 ms
 */
