/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.access_macros.*;
import static com.cyc.cycjava.cycl.cfasl.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.id_index.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import java.util.Iterator;
import java.util.Map;

import org.armedbear.lisp.Lisp;
import org.logicmoo.system.BeanShellCntrl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
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
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      KB-COMPARE
 * source file: /cyc/top/cycl/kb-compare.lisp
 * created:     2019/07/03 17:37:51
 */
public final class kb_compare extends SubLTranslatedFile implements V12 {
    public static final SubLObject kb_wff_compare_via_intersection(SubLObject intersection, SubLObject machine, SubLObject port) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject assertions_that_became_ill_formed = NIL;
                SubLObject connection = remote_image.new_remote_image_connection(remote_image.new_remote_image(machine, port, UNPROVIDED));
                try {
                    remote_image.open_remote_image_connection(connection);
                    {
                        SubLObject _prev_bind_0 = remote_image.$current_remote_image_connection$.currentBinding(thread);
                        try {
                            remote_image.$current_remote_image_connection$.bind(connection, thread);
                            {
                                SubLObject idx = assertion_handles.do_assertions_table();
                                SubLObject total = id_index_count(idx);
                                SubLObject sofar = ZERO_INTEGER;
                                SubLTrampolineFile.checkType($$$mapping_Cyc_assertions, STRINGP);
                                {
                                    SubLObject _prev_bind_0_15 = $last_percent_progress_index$.currentBinding(thread);
                                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                    try {
                                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                        $last_percent_progress_prediction$.bind(NIL, thread);
                                        $within_noting_percent_progress$.bind(T, thread);
                                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                                        noting_percent_progress_preamble($$$mapping_Cyc_assertions);
                                        if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                                            {
                                                SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
                                                SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
                                                SubLObject assertion = NIL;
                                                while (NIL != id) {
                                                    assertion = do_id_index_state_object(idx, $SKIP, id, state_var);
                                                    if (NIL != do_id_index_id_and_object_validP(id, assertion, $SKIP)) {
                                                        note_percent_progress(sofar, total);
                                                        sofar = add(sofar, ONE_INTEGER);
                                                        if (NIL != kb_intersection_assertionP(intersection, assertion)) {
                                                            {
                                                                SubLObject remote_assertion_id = kb_intersection_assertion_remote_id(intersection, assertion);
                                                                SubLObject remotely_ill_formedP = remote_image.current_remote_image_connection_eval(list($sym159$ASSERTION_NOT_WFF_, list(FIND_ASSERTION_BY_ID, remote_assertion_id)));
                                                                if (NIL != remotely_ill_formedP) {
                                                                    {
                                                                        SubLObject locally_ill_formedP = wff_utilities.assertion_not_wffP(assertion);
                                                                        if (NIL != locally_ill_formedP) {
                                                                        } else {
                                                                            assertions_that_became_ill_formed = cons(assertion, assertions_that_became_ill_formed);
                                                                            $assertions_that_became_ill_formed$.setGlobalValue(assertions_that_became_ill_formed);
                                                                            format(T, $str_alt161$__assertion__a__remotely__a_____a, new SubLObject[]{ assertion_handles.assertion_id(assertion), remote_assertion_id, assertions_high.assertion_formula(assertion) });
                                                                        }
                                                                    }
                                                                }
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
                                        $last_percent_progress_index$.rebind(_prev_bind_0_15, thread);
                                    }
                                }
                            }
                        } finally {
                            remote_image.$current_remote_image_connection$.rebind(_prev_bind_0, thread);
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            remote_image.close_remote_image_connection(connection);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
                return nreverse(assertions_that_became_ill_formed);
            }
        }
    }

    /**
     *
     *
     * @return listp; a list of assertion-p which are wff in this image
    but ill-formed in the remote image.
     * @param MACHINE
     * 		stringp; the name of the machine to compare well-formedness to.
     * @param PORT
     * 		integerp; the port number to connect to on the remote machine.
     */
    @LispMethod(comment = "@return listp; a list of assertion-p which are wff in this image\r\nbut ill-formed in the remote image.\r\n@param MACHINE\r\n\t\tstringp; the name of the machine to compare well-formedness to.\r\n@param PORT\r\n\t\tintegerp; the port number to connect to on the remote machine.")
    public static final SubLObject kb_wff_compare(SubLObject machine, SubLObject port) {
        {
            SubLObject intersection = compute_remote_image_kb_intersection(machine, port, UNPROVIDED);
            return kb_wff_compare_via_intersection(intersection, machine, port);
        }
    }

    public static final SubLSymbol $assertions_that_became_ill_formed$ = makeSymbol("*ASSERTIONS-THAT-BECAME-ILL-FORMED*");

    public static final SubLFile me = new kb_compare();

 public static final String myName = "com.cyc.cycjava.cycl.kb_compare";


    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_kb_intersection$ = makeSymbol("*DTP-KB-INTERSECTION*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $kb_intersection$ = makeSymbol("*KB-INTERSECTION*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_kb_difference$ = makeSymbol("*DTP-KB-DIFFERENCE*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(T);

    static private final SubLList $list1 = list(makeSymbol("ASSERTION-ID-FROM-RECIPE"), makeSymbol("DEDUCTION-ID-FROM-RECIPE"), makeSymbol("CONSTANT-INTERNAL-ID-FROM-EXTERNAL-ID"), makeSymbol("CONSTANT-NAME-FROM-INTERNAL-ID"), makeSymbol("NART-ID-FROM-RECIPE"));

    static private final SubLList $list2 = list(makeSymbol("REMOTE-IMAGE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol WITH_NEW_REMOTE_IMAGE_CONNECTION = makeSymbol("WITH-NEW-REMOTE-IMAGE-CONNECTION");

    static private final SubLList $list5 = list(list(makeSymbol("*KB-COMPARE-COMMON-SYMBOLS*"), makeSymbol("*KB-COMPARE-COMMON-SYMBOLS*")));

    static private final SubLList $list6 = list(makeSymbol("SET-KB-COMPARE-CONNECTION-COMMON-SYMBOLS"));

    private static final SubLSymbol WITH_CFASL_COMMON_SYMBOLS = makeSymbol("WITH-CFASL-COMMON-SYMBOLS");

    public static final SubLSymbol $kb_compare_common_symbols$ = makeSymbol("*KB-COMPARE-COMMON-SYMBOLS*");

    private static final SubLSymbol SET_KB_COMPARE_CONNECTION_COMMON_SYMBOLS = makeSymbol("SET-KB-COMPARE-CONNECTION-COMMON-SYMBOLS");

    private static final SubLSymbol WITH_NEW_KB_COMPARE_CONNECTION = makeSymbol("WITH-NEW-KB-COMPARE-CONNECTION");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLSymbol CFASL_SET_COMMON_SYMBOLS = makeSymbol("CFASL-SET-COMMON-SYMBOLS");

    static private final SubLList $list17 = list(list(makeSymbol("ERROR"), makeString("hack")));

    private static final SubLSymbol KB_INTERSECTION = makeSymbol("KB-INTERSECTION");

    private static final SubLSymbol KB_INTERSECTION_P = makeSymbol("KB-INTERSECTION-P");

    static private final SubLList $list20 = list(makeSymbol("REMOTE-IMAGE"), makeSymbol("CONSTANT-INDEX"), makeSymbol("NART-INDEX"), makeSymbol("ASSERTION-INDEX"), makeSymbol("DEDUCTION-INDEX"));

    static private final SubLList $list21 = list(makeKeyword("REMOTE-IMAGE"), makeKeyword("CONSTANT-INDEX"), makeKeyword("NART-INDEX"), makeKeyword("ASSERTION-INDEX"), makeKeyword("DEDUCTION-INDEX"));

    static private final SubLList $list22 = list(makeSymbol("KB-INTRSCT-REMOTE-IMAGE"), makeSymbol("KB-INTRSCT-CONSTANT-INDEX"), makeSymbol("KB-INTRSCT-NART-INDEX"), makeSymbol("KB-INTRSCT-ASSERTION-INDEX"), makeSymbol("KB-INTRSCT-DEDUCTION-INDEX"));

    static private final SubLList $list23 = list(makeSymbol("_CSETF-KB-INTRSCT-REMOTE-IMAGE"), makeSymbol("_CSETF-KB-INTRSCT-CONSTANT-INDEX"), makeSymbol("_CSETF-KB-INTRSCT-NART-INDEX"), makeSymbol("_CSETF-KB-INTRSCT-ASSERTION-INDEX"), makeSymbol("_CSETF-KB-INTRSCT-DEDUCTION-INDEX"));

    private static final SubLSymbol PRINT_KB_INTERSECTION = makeSymbol("PRINT-KB-INTERSECTION");

    private static final SubLSymbol KB_INTERSECTION_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("KB-INTERSECTION-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list26 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("KB-INTERSECTION-P"));

    private static final SubLSymbol KB_INTRSCT_REMOTE_IMAGE = makeSymbol("KB-INTRSCT-REMOTE-IMAGE");

    private static final SubLSymbol _CSETF_KB_INTRSCT_REMOTE_IMAGE = makeSymbol("_CSETF-KB-INTRSCT-REMOTE-IMAGE");

    private static final SubLSymbol KB_INTRSCT_CONSTANT_INDEX = makeSymbol("KB-INTRSCT-CONSTANT-INDEX");

    private static final SubLSymbol _CSETF_KB_INTRSCT_CONSTANT_INDEX = makeSymbol("_CSETF-KB-INTRSCT-CONSTANT-INDEX");

    private static final SubLSymbol KB_INTRSCT_NART_INDEX = makeSymbol("KB-INTRSCT-NART-INDEX");

    private static final SubLSymbol _CSETF_KB_INTRSCT_NART_INDEX = makeSymbol("_CSETF-KB-INTRSCT-NART-INDEX");

    private static final SubLSymbol KB_INTRSCT_ASSERTION_INDEX = makeSymbol("KB-INTRSCT-ASSERTION-INDEX");

    private static final SubLSymbol _CSETF_KB_INTRSCT_ASSERTION_INDEX = makeSymbol("_CSETF-KB-INTRSCT-ASSERTION-INDEX");

    private static final SubLSymbol KB_INTRSCT_DEDUCTION_INDEX = makeSymbol("KB-INTRSCT-DEDUCTION-INDEX");

    private static final SubLSymbol _CSETF_KB_INTRSCT_DEDUCTION_INDEX = makeSymbol("_CSETF-KB-INTRSCT-DEDUCTION-INDEX");

    private static final SubLString $str42$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_KB_INTERSECTION = makeSymbol("MAKE-KB-INTERSECTION");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_KB_INTERSECTION_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-KB-INTERSECTION-METHOD");

    private static final SubLString $str48$_KB_INTERSECTION_to__a_ = makeString("<KB-INTERSECTION to ~a>");

    private static final SubLSymbol KB_INTERSECTION_CONSTANT_INDEX = makeSymbol("KB-INTERSECTION-CONSTANT-INDEX");

    private static final SubLSymbol DO_KB_INTERSECTION_CONSTANTS = makeSymbol("DO-KB-INTERSECTION-CONSTANTS");

    private static final SubLList $list57 = list(list(makeSymbol("CONSTANT"), makeSymbol("INTERSECTION"), makeSymbol("&KEY"), makeSymbol("PROGRESS-MESSAGE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list58 = list(makeKeyword("PROGRESS-MESSAGE"));

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol $sym61$INTERNAL_ID = makeUninternedSymbol("INTERNAL-ID");

    private static final SubLSymbol $sym62$REMOTE_ID = makeUninternedSymbol("REMOTE-ID");

    private static final SubLSymbol KB_INTERSECTION_NART_IMPOSSIBLE_INT = makeSymbol("KB-INTERSECTION-NART-IMPOSSIBLE-INT");

    private static final SubLSymbol KB_INTERSECTION_ASSERTION_IMPOSSIBLE_INT = makeSymbol("KB-INTERSECTION-ASSERTION-IMPOSSIBLE-INT");

    private static final SubLSymbol KB_INTERSECTION_DEDUCTION_IMPOSSIBLE_INT = makeSymbol("KB-INTERSECTION-DEDUCTION-IMPOSSIBLE-INT");

    private static final SubLString $str71$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLString $$$Constants = makeString("Constants");

    private static final SubLString $$$NARTs = makeString("NARTs");

    private static final SubLString $$$Assertions = makeString("Assertions");

    private static final SubLString $$$Deductions = makeString("Deductions");

    private static final SubLString $$$Saving_KB_ = makeString("Saving KB ");

    private static final SubLString $str82$_Intersection_ID_Index_____ = makeString(" Intersection ID Index ....");

    private static final SubLString $$$Loading_KB_ = makeString("Loading KB ");

    private static final SubLString $str84$Error_in_KB_Intersection_ID_index = makeString("Error in KB Intersection ID index format ... expected ~A, got ~A.");

    private static final SubLString $str85$Expected_a_KB_Intersection_ID_ind = makeString("Expected a KB Intersection ID index, but got ~A instead.");

    private static final SubLString $str87$This_ID_index_cannot_be_inverted_ = makeString("This ID index cannot be inverted, ID ~A points to non-ID ~A.");

    private static final SubLSymbol KB_DIFFERENCE = makeSymbol("KB-DIFFERENCE");

    private static final SubLSymbol KB_DIFFERENCE_P = makeSymbol("KB-DIFFERENCE-P");

    private static final SubLList $list90 = list(makeSymbol("COMMON-INTERSECTION"), makeSymbol("RENAMED-CONSTANTS"), makeSymbol("CONSTANTS"), makeSymbol("NARTS"), makeSymbol("ASSERTIONS"), makeSymbol("DEDUCTIONS"));

    private static final SubLList $list91 = list(makeKeyword("COMMON-INTERSECTION"), makeKeyword("RENAMED-CONSTANTS"), makeKeyword("CONSTANTS"), makeKeyword("NARTS"), makeKeyword("ASSERTIONS"), makeKeyword("DEDUCTIONS"));

    private static final SubLList $list92 = list(makeSymbol("KB-DIFF-COMMON-INTERSECTION"), makeSymbol("KB-DIFF-RENAMED-CONSTANTS"), makeSymbol("KB-DIFF-CONSTANTS"), makeSymbol("KB-DIFF-NARTS"), makeSymbol("KB-DIFF-ASSERTIONS"), makeSymbol("KB-DIFF-DEDUCTIONS"));

    private static final SubLList $list93 = list(makeSymbol("_CSETF-KB-DIFF-COMMON-INTERSECTION"), makeSymbol("_CSETF-KB-DIFF-RENAMED-CONSTANTS"), makeSymbol("_CSETF-KB-DIFF-CONSTANTS"), makeSymbol("_CSETF-KB-DIFF-NARTS"), makeSymbol("_CSETF-KB-DIFF-ASSERTIONS"), makeSymbol("_CSETF-KB-DIFF-DEDUCTIONS"));

    private static final SubLSymbol PRINT_KB_DIFFERENCE = makeSymbol("PRINT-KB-DIFFERENCE");

    private static final SubLSymbol KB_DIFFERENCE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("KB-DIFFERENCE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list96 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("KB-DIFFERENCE-P"));

    private static final SubLSymbol KB_DIFF_COMMON_INTERSECTION = makeSymbol("KB-DIFF-COMMON-INTERSECTION");

    private static final SubLSymbol _CSETF_KB_DIFF_COMMON_INTERSECTION = makeSymbol("_CSETF-KB-DIFF-COMMON-INTERSECTION");

    private static final SubLSymbol KB_DIFF_RENAMED_CONSTANTS = makeSymbol("KB-DIFF-RENAMED-CONSTANTS");

    private static final SubLSymbol _CSETF_KB_DIFF_RENAMED_CONSTANTS = makeSymbol("_CSETF-KB-DIFF-RENAMED-CONSTANTS");

    private static final SubLSymbol KB_DIFF_CONSTANTS = makeSymbol("KB-DIFF-CONSTANTS");

    private static final SubLSymbol _CSETF_KB_DIFF_CONSTANTS = makeSymbol("_CSETF-KB-DIFF-CONSTANTS");

    private static final SubLSymbol KB_DIFF_NARTS = makeSymbol("KB-DIFF-NARTS");

    private static final SubLSymbol _CSETF_KB_DIFF_NARTS = makeSymbol("_CSETF-KB-DIFF-NARTS");

    private static final SubLSymbol KB_DIFF_ASSERTIONS = makeSymbol("KB-DIFF-ASSERTIONS");

    private static final SubLSymbol _CSETF_KB_DIFF_ASSERTIONS = makeSymbol("_CSETF-KB-DIFF-ASSERTIONS");

    private static final SubLSymbol KB_DIFF_DEDUCTIONS = makeSymbol("KB-DIFF-DEDUCTIONS");

    private static final SubLSymbol _CSETF_KB_DIFF_DEDUCTIONS = makeSymbol("_CSETF-KB-DIFF-DEDUCTIONS");

    private static final SubLSymbol MAKE_KB_DIFFERENCE = makeSymbol("MAKE-KB-DIFFERENCE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_KB_DIFFERENCE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-KB-DIFFERENCE-METHOD");

    private static final SubLString $str113$_KB_DIFFERENCE_using__a_ = makeString("<KB-DIFFERENCE using ~a>");

    private static final SubLSymbol KB_DIFFERENCE_RENAMED_CONSTANTS = makeSymbol("KB-DIFFERENCE-RENAMED-CONSTANTS");

    private static final SubLSymbol DO_KB_DIFFERENCE_RENAMED_CONSTANTS = makeSymbol("DO-KB-DIFFERENCE-RENAMED-CONSTANTS");

    private static final SubLSymbol KB_DIFFERENCE_CONSTANTS = makeSymbol("KB-DIFFERENCE-CONSTANTS");

    private static final SubLSymbol DO_KB_DIFFERENCE_CONSTANTS = makeSymbol("DO-KB-DIFFERENCE-CONSTANTS");

    private static final SubLSymbol KB_DIFFERENCE_NARTS = makeSymbol("KB-DIFFERENCE-NARTS");

    private static final SubLSymbol DO_KB_DIFFERENCE_NARTS = makeSymbol("DO-KB-DIFFERENCE-NARTS");

    private static final SubLSymbol KB_DIFFERENCE_ASSERTIONS = makeSymbol("KB-DIFFERENCE-ASSERTIONS");

    private static final SubLSymbol DO_KB_DIFFERENCE_ASSERTIONS = makeSymbol("DO-KB-DIFFERENCE-ASSERTIONS");

    private static final SubLSymbol KB_DIFFERENCE_DEDUCTIONS = makeSymbol("KB-DIFFERENCE-DEDUCTIONS");

    private static final SubLSymbol DO_KB_DIFFERENCE_DEDUCTIONS = makeSymbol("DO-KB-DIFFERENCE-DEDUCTIONS");

    private static final SubLList $list124 = list(list(makeSymbol("CONSTANT"), makeSymbol("REMOTE-NAME"), makeSymbol("DIFFERENCE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list125 = list($DONE);

    private static final SubLList $list128 = list(list(makeSymbol("CONSTANT"), makeSymbol("DIFFERENCE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list130 = list(list(makeSymbol("NART"), makeSymbol("DIFFERENCE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list131 = list(list(makeSymbol("ASSERTION"), makeSymbol("DIFFERENCE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list132 = list(list(makeSymbol("DEDUCTION"), makeSymbol("DIFFERENCE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym134$_ = makeSymbol("<");

    private static final SubLSymbol CONSTANT_INTERNAL_ID = makeSymbol("CONSTANT-INTERNAL-ID");

    private static final SubLSymbol NART_ID = makeSymbol("NART-ID");

    private static final SubLSymbol DEDUCTION_ID = makeSymbol("DEDUCTION-ID");

    private static final SubLString $str138$KB_Intersection___Examining_new_c = makeString("KB Intersection : Examining new constants");

    private static final SubLString $str139$KB_Intersection___Examining_const = makeString("KB Intersection : Examining constants");

    private static final SubLString $str140$KB_Intersection___Examining_old_c = makeString("KB Intersection : Examining old constants (congruent)");

    private static final SubLList $list141 = list(makeUninternedSymbol("START"), makeUninternedSymbol("END"), makeUninternedSymbol("DELTA"));

    private static final SubLString $str142$KB_Intersection___Examining_new_n = makeString("KB Intersection : Examining new narts");

    private static final SubLString $str143$KB_Intersection___Examining_narts = makeString("KB Intersection : Examining narts");

    private static final SubLString $str144$KB_Intersection___Examining_old_n = makeString("KB Intersection : Examining old narts (congruent)");

    private static final SubLString $str145$KB_Intersection___Examining_new_a = makeString("KB Intersection : Examining new assertions");

    private static final SubLString $str146$KB_Intersection___Examining_asser = makeString("KB Intersection : Examining assertions");

    private static final SubLString $str147$KB_Intersection___Examining_old_a = makeString("KB Intersection : Examining old assertions (congruent)");

    private static final SubLString $str148$KB_Intersection___Examining_new_d = makeString("KB Intersection : Examining new deductions");

    private static final SubLString $str149$KB_Intersection___Examining_deduc = makeString("KB Intersection : Examining deductions");

    private static final SubLString $str150$KB_Intersection___Examining_old_d = makeString("KB Intersection : Examining old deductions (congruent)");

    private static final SubLString $str151$KB_DIFFERENCE___Examining_constan = makeString("KB-DIFFERENCE : Examining constant renames");

    private static final SubLString $str152$KB_DIFFERENCE___Examining_constan = makeString("KB-DIFFERENCE : Examining constants");

    private static final SubLString $str153$KB_DIFFERENCE___Examining_narts = makeString("KB-DIFFERENCE : Examining narts");

    private static final SubLString $str154$KB_DIFFERENCE___Examining_asserti = makeString("KB-DIFFERENCE : Examining assertions");

    private static final SubLString $str155$KB_DIFFERENCE___Examining_deducti = makeString("KB-DIFFERENCE : Examining deductions");

    private static final SubLString $str156$___No_Difference___ = makeString(";; No Difference!~%");

    private static final SubLString $str157$___Renamed_Constants____ = makeString(";; Renamed Constants :~%");

    private static final SubLString $str158$_S_renamed_to__S__ = makeString("~S renamed to ~S~%");

    private static final SubLString $str159$___Constants____ = makeString(";; Constants :~%");

    private static final SubLString $str160$_S__ = makeString("~S~%");

    private static final SubLString $str161$___Narts____ = makeString(";; Narts :~%");

    private static final SubLString $str162$___Assertions____ = makeString(";; Assertions :~%");

    private static final SubLString $str163$___Deductions____ = makeString(";; Deductions :~%");

    private static final SubLString $str164$_S__supports___ = makeString("~S~%supports:~%");

    private static final SubLSymbol $sym165$_ = makeSymbol("=");

    private static final SubLList $list166 = list(list(makeSymbol("OLD-CONSTANT-COUNT")));

    private static final SubLList $list167 = list(makeSymbol("MISSING-OLD-CONSTANT-INTERNAL-IDS"));

    private static final SubLSymbol CONSTANT_INTERNAL_ID_FROM_EXTERNAL_ID = makeSymbol("CONSTANT-INTERNAL-ID-FROM-EXTERNAL-ID");

    private static final SubLString $str170$Could_not_compute_remote_ID_for__ = makeString("Could not compute remote ID for ~S.~% ~A~%");

    private static final SubLSymbol CONSTANT_NAME_FROM_INTERNAL_ID = makeSymbol("CONSTANT-NAME-FROM-INTERNAL-ID");

    private static final SubLList $list172 = list(list(makeSymbol("OLD-NART-COUNT")));

    private static final SubLList $list173 = list(makeSymbol("MISSING-OLD-NART-IDS"));

    private static final SubLSymbol NART_ID_FROM_RECIPE = makeSymbol("NART-ID-FROM-RECIPE");

    private static final SubLList $list175 = list(list(makeSymbol("OLD-ASSERTION-COUNT")));

    private static final SubLList $list176 = list(makeSymbol("MISSING-OLD-ASSERTION-IDS"));

    private static final SubLSymbol ASSERTION_ID_FROM_RECIPE = makeSymbol("ASSERTION-ID-FROM-RECIPE");

    private static final SubLList $list178 = list(list(makeSymbol("OLD-DEDUCTION-COUNT")));

    private static final SubLList $list179 = list(makeSymbol("MISSING-OLD-DEDUCTION-IDS"));

    private static final SubLSymbol DEDUCTION_ID_FROM_RECIPE = makeSymbol("DEDUCTION-ID-FROM-RECIPE");

    public static final SubLObject with_new_kb_compare_connection_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject v_remote_image = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt2);
            v_remote_image = current.first();
            current = current.rest();
            {
                SubLObject body = current;
                return list(WITH_NEW_REMOTE_IMAGE_CONNECTION, v_remote_image, list(CLET, $list_alt5, $list_alt6, listS(WITH_CFASL_COMMON_SYMBOLS, $kb_compare_common_symbols$, append(body, NIL))));
            }
        }
    }

    public static SubLObject with_new_kb_compare_connection(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject v_remote_image = NIL;
        destructuring_bind_must_consp(current, datum, $list2);
        v_remote_image = current.first();
        final SubLObject body;
        current = body = current.rest();
        return list(WITH_NEW_REMOTE_IMAGE_CONNECTION, v_remote_image, list(CLET, $list5, $list6, listS(WITH_CFASL_COMMON_SYMBOLS, $kb_compare_common_symbols$, append(body, NIL))));
    }

    public static final SubLObject set_kb_compare_connection_common_symbols_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject connection = remote_image.current_remote_image_connection();
                if (NIL != connection) {
                    {
                        SubLObject protocol = remote_image.remote_image_connection_protocol(connection);
                        if ($CFASL == protocol) {
                            {
                                SubLObject ignore_errors_tag = NIL;
                                try {
                                    {
                                        SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                                        try {
                                            Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                                            try {
                                                remote_image.remote_image_connection_eval(connection, listS(PROGN, list(CFASL_SET_COMMON_SYMBOLS, list(QUOTE, $kb_compare_common_symbols$.getDynamicValue(thread))), $list_alt17));
                                            } catch (Throwable catch_var) {
                                                Errors.handleThrowable(catch_var, NIL);
                                            }
                                        } finally {
                                            Errors.$error_handler$.rebind(_prev_bind_0, thread);
                                        }
                                    }
                                } catch (Throwable ccatch_env_var) {
                                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                                }
                            }
                        } else {
                            $kb_compare_common_symbols$.setDynamicValue(NIL, thread);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject set_kb_compare_connection_common_symbols() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject connection = remote_image.current_remote_image_connection();
        if (NIL != connection) {
            final SubLObject protocol = remote_image.remote_image_connection_protocol(connection);
            if ($CFASL == protocol) {
                SubLObject ignore_errors_tag = NIL;
                try {
                    thread.throwStack.push($IGNORE_ERRORS_TARGET);
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                        try {
                            remote_image.remote_image_connection_eval(connection, listS(PROGN, list(CFASL_SET_COMMON_SYMBOLS, list(QUOTE, $kb_compare_common_symbols$.getDynamicValue(thread))), $list17));
                        } catch (final Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                    }
                } catch (final Throwable ccatch_env_var) {
                    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
                } finally {
                    thread.throwStack.pop();
                }
            } else {
                $kb_compare_common_symbols$.setDynamicValue(NIL, thread);
            }
        }
        return NIL;
    }

    public static final SubLObject kb_intersection_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_kb_intersection(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject kb_intersection_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_kb_intersection(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject kb_intersection_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.kb_compare.$kb_intersection_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject kb_intersection_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.kb_compare.$kb_intersection_native.class ? T : NIL;
    }

    public static final SubLObject kb_intrsct_remote_image_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, KB_INTERSECTION_P);
        return v_object.getField2();
    }

    public static SubLObject kb_intrsct_remote_image(final SubLObject v_object) {
        assert NIL != kb_intersection_p(v_object) : "! kb_compare.kb_intersection_p(v_object) " + "kb_compare.kb_intersection_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject kb_intrsct_constant_index_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, KB_INTERSECTION_P);
        return v_object.getField3();
    }

    public static SubLObject kb_intrsct_constant_index(final SubLObject v_object) {
        assert NIL != kb_intersection_p(v_object) : "! kb_compare.kb_intersection_p(v_object) " + "kb_compare.kb_intersection_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject kb_intrsct_nart_index_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, KB_INTERSECTION_P);
        return v_object.getField4();
    }

    public static SubLObject kb_intrsct_nart_index(final SubLObject v_object) {
        assert NIL != kb_intersection_p(v_object) : "! kb_compare.kb_intersection_p(v_object) " + "kb_compare.kb_intersection_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject kb_intrsct_assertion_index_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, KB_INTERSECTION_P);
        return v_object.getField5();
    }

    public static SubLObject kb_intrsct_assertion_index(final SubLObject v_object) {
        assert NIL != kb_intersection_p(v_object) : "! kb_compare.kb_intersection_p(v_object) " + "kb_compare.kb_intersection_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject kb_intrsct_deduction_index_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, KB_INTERSECTION_P);
        return v_object.getField6();
    }

    public static SubLObject kb_intrsct_deduction_index(final SubLObject v_object) {
        assert NIL != kb_intersection_p(v_object) : "! kb_compare.kb_intersection_p(v_object) " + "kb_compare.kb_intersection_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject _csetf_kb_intrsct_remote_image_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, KB_INTERSECTION_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_kb_intrsct_remote_image(final SubLObject v_object, final SubLObject value) {
        assert NIL != kb_intersection_p(v_object) : "! kb_compare.kb_intersection_p(v_object) " + "kb_compare.kb_intersection_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_kb_intrsct_constant_index_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, KB_INTERSECTION_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_kb_intrsct_constant_index(final SubLObject v_object, final SubLObject value) {
        assert NIL != kb_intersection_p(v_object) : "! kb_compare.kb_intersection_p(v_object) " + "kb_compare.kb_intersection_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_kb_intrsct_nart_index_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, KB_INTERSECTION_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_kb_intrsct_nart_index(final SubLObject v_object, final SubLObject value) {
        assert NIL != kb_intersection_p(v_object) : "! kb_compare.kb_intersection_p(v_object) " + "kb_compare.kb_intersection_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_kb_intrsct_assertion_index_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, KB_INTERSECTION_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_kb_intrsct_assertion_index(final SubLObject v_object, final SubLObject value) {
        assert NIL != kb_intersection_p(v_object) : "! kb_compare.kb_intersection_p(v_object) " + "kb_compare.kb_intersection_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_kb_intrsct_deduction_index_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, KB_INTERSECTION_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_kb_intrsct_deduction_index(final SubLObject v_object, final SubLObject value) {
        assert NIL != kb_intersection_p(v_object) : "! kb_compare.kb_intersection_p(v_object) " + "kb_compare.kb_intersection_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject make_kb_intersection_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.kb_compare.$kb_intersection_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($REMOTE_IMAGE)) {
                        _csetf_kb_intrsct_remote_image(v_new, current_value);
                    } else {
                        if (pcase_var.eql($CONSTANT_INDEX)) {
                            _csetf_kb_intrsct_constant_index(v_new, current_value);
                        } else {
                            if (pcase_var.eql($NART_INDEX)) {
                                _csetf_kb_intrsct_nart_index(v_new, current_value);
                            } else {
                                if (pcase_var.eql($ASSERTION_INDEX)) {
                                    _csetf_kb_intrsct_assertion_index(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($DEDUCTION_INDEX)) {
                                        _csetf_kb_intrsct_deduction_index(v_new, current_value);
                                    } else {
                                        Errors.error($str_alt41$Invalid_slot__S_for_construction_, current_arg);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_kb_intersection(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.kb_compare.$kb_intersection_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($REMOTE_IMAGE)) {
                _csetf_kb_intrsct_remote_image(v_new, current_value);
            } else
                if (pcase_var.eql($CONSTANT_INDEX)) {
                    _csetf_kb_intrsct_constant_index(v_new, current_value);
                } else
                    if (pcase_var.eql($NART_INDEX)) {
                        _csetf_kb_intrsct_nart_index(v_new, current_value);
                    } else
                        if (pcase_var.eql($ASSERTION_INDEX)) {
                            _csetf_kb_intrsct_assertion_index(v_new, current_value);
                        } else
                            if (pcase_var.eql($DEDUCTION_INDEX)) {
                                _csetf_kb_intrsct_deduction_index(v_new, current_value);
                            } else {
                                Errors.error($str42$Invalid_slot__S_for_construction_, current_arg);
                            }




        }
        return v_new;
    }

    public static SubLObject visit_defstruct_kb_intersection(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_KB_INTERSECTION, FIVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $REMOTE_IMAGE, kb_intrsct_remote_image(obj));
        funcall(visitor_fn, obj, $SLOT, $CONSTANT_INDEX, kb_intrsct_constant_index(obj));
        funcall(visitor_fn, obj, $SLOT, $NART_INDEX, kb_intrsct_nart_index(obj));
        funcall(visitor_fn, obj, $SLOT, $ASSERTION_INDEX, kb_intrsct_assertion_index(obj));
        funcall(visitor_fn, obj, $SLOT, $DEDUCTION_INDEX, kb_intrsct_deduction_index(obj));
        funcall(visitor_fn, obj, $END, MAKE_KB_INTERSECTION, FIVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_kb_intersection_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_kb_intersection(obj, visitor_fn);
    }

    public static final SubLObject print_kb_intersection_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        format(stream, $str_alt42$_KB_INTERSECTION_to__a_, kb_intersection_remote_image(v_object));
        return NIL;
    }

    public static SubLObject print_kb_intersection(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str48$_KB_INTERSECTION_to__a_, kb_intersection_remote_image(v_object));
        return NIL;
    }

    public static final SubLObject new_kb_intersection_alt(SubLObject v_remote_image) {
        {
            SubLObject intersection = make_kb_intersection(UNPROVIDED);
            _csetf_kb_intrsct_remote_image(intersection, v_remote_image);
            _csetf_kb_intrsct_constant_index(intersection, new_dense_constant_id_index());
            _csetf_kb_intrsct_nart_index(intersection, nart_handles.new_dense_nart_id_index());
            _csetf_kb_intrsct_assertion_index(intersection, assertion_handles.new_dense_assertion_id_index());
            _csetf_kb_intrsct_deduction_index(intersection, deduction_handles.new_dense_deduction_id_index());
            return intersection;
        }
    }

    public static SubLObject new_kb_intersection(final SubLObject v_remote_image) {
        final SubLObject intersection = make_kb_intersection(UNPROVIDED);
        _csetf_kb_intrsct_remote_image(intersection, v_remote_image);
        _csetf_kb_intrsct_constant_index(intersection, new_dense_constant_id_index());
        _csetf_kb_intrsct_nart_index(intersection, nart_handles.new_dense_nart_id_index());
        _csetf_kb_intrsct_assertion_index(intersection, assertion_handles.new_dense_assertion_id_index());
        _csetf_kb_intrsct_deduction_index(intersection, deduction_handles.new_dense_deduction_id_index());
        return intersection;
    }

    public static final SubLObject destroy_kb_intersection_alt(SubLObject intersection) {
        clear_id_index(kb_intrsct_constant_index(intersection));
        clear_id_index(kb_intrsct_nart_index(intersection));
        clear_id_index(kb_intrsct_assertion_index(intersection));
        clear_id_index(kb_intrsct_deduction_index(intersection));
        _csetf_kb_intrsct_remote_image(intersection, $FREE);
        _csetf_kb_intrsct_constant_index(intersection, NIL);
        _csetf_kb_intrsct_nart_index(intersection, NIL);
        _csetf_kb_intrsct_assertion_index(intersection, NIL);
        _csetf_kb_intrsct_deduction_index(intersection, NIL);
        return intersection;
    }

    public static SubLObject destroy_kb_intersection(final SubLObject intersection) {
        clear_id_index(kb_intrsct_constant_index(intersection));
        clear_id_index(kb_intrsct_nart_index(intersection));
        clear_id_index(kb_intrsct_assertion_index(intersection));
        clear_id_index(kb_intrsct_deduction_index(intersection));
        _csetf_kb_intrsct_remote_image(intersection, $FREE);
        _csetf_kb_intrsct_constant_index(intersection, NIL);
        _csetf_kb_intrsct_nart_index(intersection, NIL);
        _csetf_kb_intrsct_assertion_index(intersection, NIL);
        _csetf_kb_intrsct_deduction_index(intersection, NIL);
        return intersection;
    }

    public static final SubLObject kb_intersection_remote_image_alt(SubLObject connection) {
        return kb_intrsct_remote_image(connection);
    }

    public static SubLObject kb_intersection_remote_image(final SubLObject connection) {
        return kb_intrsct_remote_image(connection);
    }

    public static final SubLObject kb_intersection_constant_index_alt(SubLObject intersection) {
        return kb_intrsct_constant_index(intersection);
    }

    public static SubLObject kb_intersection_constant_index(final SubLObject intersection) {
        return kb_intrsct_constant_index(intersection);
    }

    public static final SubLObject kb_intersection_add_constant_alt(SubLObject intersection, SubLObject constant, SubLObject remote_id) {
        SubLTrampolineFile.checkType(constant, CONSTANT_P);
        SubLTrampolineFile.checkType(remote_id, NON_NEGATIVE_INTEGER_P);
        id_index_enter(kb_intrsct_constant_index(intersection), constants_high.constant_internal_id(constant), remote_id);
        return intersection;
    }

    public static SubLObject kb_intersection_add_constant(final SubLObject intersection, final SubLObject constant, final SubLObject remote_id) {
        assert NIL != constant_p(constant) : "! constant_handles.constant_p(constant) " + ("constant_handles.constant_p(constant) " + "CommonSymbols.NIL != constant_handles.constant_p(constant) ") + constant;
        assert NIL != subl_promotions.non_negative_integer_p(remote_id) : "! subl_promotions.non_negative_integer_p(remote_id) " + ("subl_promotions.non_negative_integer_p(remote_id) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(remote_id) ") + remote_id;
        id_index_enter(kb_intrsct_constant_index(intersection), constants_high.constant_internal_id(constant), remote_id);
        return intersection;
    }

    public static final SubLObject kb_intersection_add_nart_alt(SubLObject intersection, SubLObject nart, SubLObject remote_id) {
        SubLTrampolineFile.checkType(nart, NART_P);
        SubLTrampolineFile.checkType(remote_id, NON_NEGATIVE_INTEGER_P);
        id_index_enter(kb_intrsct_nart_index(intersection), nart_handles.nart_id(nart), remote_id);
        return intersection;
    }

    public static SubLObject kb_intersection_add_nart(final SubLObject intersection, final SubLObject nart, final SubLObject remote_id) {
        assert NIL != nart_handles.nart_p(nart) : "! nart_handles.nart_p(nart) " + ("nart_handles.nart_p(nart) " + "CommonSymbols.NIL != nart_handles.nart_p(nart) ") + nart;
        assert NIL != subl_promotions.non_negative_integer_p(remote_id) : "! subl_promotions.non_negative_integer_p(remote_id) " + ("subl_promotions.non_negative_integer_p(remote_id) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(remote_id) ") + remote_id;
        id_index_enter(kb_intrsct_nart_index(intersection), nart_handles.nart_id(nart), remote_id);
        return intersection;
    }

    public static final SubLObject kb_intersection_add_assertion_alt(SubLObject intersection, SubLObject assertion, SubLObject remote_id) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        SubLTrampolineFile.checkType(remote_id, NON_NEGATIVE_INTEGER_P);
        id_index_enter(kb_intrsct_assertion_index(intersection), assertion_handles.assertion_id(assertion), remote_id);
        return intersection;
    }

    public static SubLObject kb_intersection_add_assertion(final SubLObject intersection, final SubLObject assertion, final SubLObject remote_id) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        assert NIL != subl_promotions.non_negative_integer_p(remote_id) : "! subl_promotions.non_negative_integer_p(remote_id) " + ("subl_promotions.non_negative_integer_p(remote_id) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(remote_id) ") + remote_id;
        id_index_enter(kb_intrsct_assertion_index(intersection), assertion_handles.assertion_id(assertion), remote_id);
        return intersection;
    }

    public static final SubLObject kb_intersection_add_deduction_alt(SubLObject intersection, SubLObject deduction, SubLObject remote_id) {
        SubLTrampolineFile.checkType(deduction, DEDUCTION_P);
        SubLTrampolineFile.checkType(remote_id, NON_NEGATIVE_INTEGER_P);
        id_index_enter(kb_intrsct_deduction_index(intersection), deduction_handles.deduction_id(deduction), remote_id);
        return intersection;
    }

    public static SubLObject kb_intersection_add_deduction(final SubLObject intersection, final SubLObject deduction, final SubLObject remote_id) {
        assert NIL != deduction_handles.deduction_p(deduction) : "! deduction_handles.deduction_p(deduction) " + ("deduction_handles.deduction_p(deduction) " + "CommonSymbols.NIL != deduction_handles.deduction_p(deduction) ") + deduction;
        assert NIL != subl_promotions.non_negative_integer_p(remote_id) : "! subl_promotions.non_negative_integer_p(remote_id) " + ("subl_promotions.non_negative_integer_p(remote_id) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(remote_id) ") + remote_id;
        id_index_enter(kb_intrsct_deduction_index(intersection), deduction_handles.deduction_id(deduction), remote_id);
        return intersection;
    }

    public static final SubLObject kb_intersection_remote_image_machine_alt(SubLObject intersection) {
        return remote_image.remote_image_machine(kb_intersection_remote_image(intersection));
    }

    public static SubLObject kb_intersection_remote_image_machine(final SubLObject intersection) {
        return remote_image.remote_image_machine(kb_intersection_remote_image(intersection));
    }

    public static final SubLObject kb_intersection_remote_image_port_alt(SubLObject intersection) {
        return remote_image.remote_image_port(kb_intersection_remote_image(intersection));
    }

    public static SubLObject kb_intersection_remote_image_port(final SubLObject intersection) {
        return remote_image.remote_image_port(kb_intersection_remote_image(intersection));
    }

    public static final SubLObject kb_intersection_remote_image_protocol_alt(SubLObject intersection) {
        return remote_image.remote_image_protocol(kb_intersection_remote_image(intersection));
    }

    public static SubLObject kb_intersection_remote_image_protocol(final SubLObject intersection) {
        return remote_image.remote_image_protocol(kb_intersection_remote_image(intersection));
    }

    public static final SubLObject kb_intersection_constantP_alt(SubLObject intersection, SubLObject constant) {
        return makeBoolean((NIL != constant_p(constant)) && (NIL != list_utilities.sublisp_boolean(kb_intersection_constant_remote_id(intersection, constant))));
    }

    public static SubLObject kb_intersection_constantP(final SubLObject intersection, final SubLObject constant) {
        return makeBoolean((NIL != constant_p(constant)) && (NIL != list_utilities.sublisp_boolean(kb_intersection_constant_remote_id(intersection, constant))));
    }

    public static final SubLObject kb_intersection_constant_remote_id_alt(SubLObject intersection, SubLObject constant) {
        {
            SubLObject index = kb_intrsct_constant_index(intersection);
            SubLObject local_id = constants_high.constant_internal_id(constant);
            if (NIL != local_id) {
                return id_index_lookup(index, local_id, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject kb_intersection_constant_remote_id(final SubLObject intersection, final SubLObject constant) {
        final SubLObject index = kb_intrsct_constant_index(intersection);
        final SubLObject local_id = constants_high.constant_internal_id(constant);
        if (NIL != local_id) {
            return id_index_lookup(index, local_id, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject kb_intersection_nartP_alt(SubLObject intersection, SubLObject nart) {
        return makeBoolean((NIL != nart_handles.nart_p(nart)) && (NIL != list_utilities.sublisp_boolean(kb_intersection_nart_remote_id(intersection, nart))));
    }

    public static SubLObject kb_intersection_nartP(final SubLObject intersection, final SubLObject nart) {
        return makeBoolean((NIL != nart_handles.nart_p(nart)) && (NIL != list_utilities.sublisp_boolean(kb_intersection_nart_remote_id(intersection, nart))));
    }

    public static final SubLObject kb_intersection_nart_remote_id_alt(SubLObject intersection, SubLObject nart) {
        {
            SubLObject index = kb_intrsct_nart_index(intersection);
            SubLObject local_id = nart_handles.nart_id(nart);
            if (NIL != local_id) {
                return id_index_lookup(index, local_id, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject kb_intersection_nart_remote_id(final SubLObject intersection, final SubLObject nart) {
        final SubLObject index = kb_intrsct_nart_index(intersection);
        final SubLObject local_id = nart_handles.nart_id(nart);
        if (NIL != local_id) {
            return id_index_lookup(index, local_id, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject kb_intersection_assertionP_alt(SubLObject intersection, SubLObject assertion) {
        return makeBoolean((NIL != assertion_handles.assertion_p(assertion)) && (NIL != list_utilities.sublisp_boolean(kb_intersection_assertion_remote_id(intersection, assertion))));
    }

    public static SubLObject kb_intersection_assertionP(final SubLObject intersection, final SubLObject assertion) {
        return makeBoolean((NIL != assertion_handles.assertion_p(assertion)) && (NIL != list_utilities.sublisp_boolean(kb_intersection_assertion_remote_id(intersection, assertion))));
    }

    public static final SubLObject kb_intersection_assertion_remote_id_alt(SubLObject intersection, SubLObject assertion) {
        {
            SubLObject index = kb_intrsct_assertion_index(intersection);
            SubLObject local_id = assertion_handles.assertion_id(assertion);
            if (NIL != local_id) {
                return id_index_lookup(index, local_id, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject kb_intersection_assertion_remote_id(final SubLObject intersection, final SubLObject assertion) {
        final SubLObject index = kb_intrsct_assertion_index(intersection);
        final SubLObject local_id = assertion_handles.assertion_id(assertion);
        if (NIL != local_id) {
            return id_index_lookup(index, local_id, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject kb_intersection_deductionP_alt(SubLObject intersection, SubLObject deduction) {
        return makeBoolean((NIL != deduction_handles.deduction_p(deduction)) && (NIL != list_utilities.sublisp_boolean(kb_intersection_deduction_remote_id(intersection, deduction))));
    }

    public static SubLObject kb_intersection_deductionP(final SubLObject intersection, final SubLObject deduction) {
        return makeBoolean((NIL != deduction_handles.deduction_p(deduction)) && (NIL != list_utilities.sublisp_boolean(kb_intersection_deduction_remote_id(intersection, deduction))));
    }

    public static final SubLObject kb_intersection_deduction_remote_id_alt(SubLObject intersection, SubLObject deduction) {
        {
            SubLObject index = kb_intrsct_deduction_index(intersection);
            SubLObject local_id = deduction_handles.deduction_id(deduction);
            if (NIL != local_id) {
                return id_index_lookup(index, local_id, UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject kb_intersection_deduction_remote_id(final SubLObject intersection, final SubLObject deduction) {
        final SubLObject index = kb_intrsct_deduction_index(intersection);
        final SubLObject local_id = deduction_handles.deduction_id(deduction);
        if (NIL != local_id) {
            return id_index_lookup(index, local_id, UNPROVIDED);
        }
        return NIL;
    }

    public static final SubLObject do_kb_intersection_constants_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt51);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject constant = NIL;
                    SubLObject intersection = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt51);
                    constant = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt51);
                    intersection = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_1 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt51);
                            current_1 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt51);
                            if (NIL == member(current_1, $list_alt52, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_1 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt51);
                        }
                        {
                            SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
                            SubLObject progress_message = (NIL != progress_message_tail) ? ((SubLObject) (cadr(progress_message_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                SubLObject internal_id = $sym55$INTERNAL_ID;
                                SubLObject remote_id = $sym56$REMOTE_ID;
                                return list(DO_ID_INDEX, list(internal_id, remote_id, list(KB_INTERSECTION_CONSTANT_INDEX, intersection), $PROGRESS_MESSAGE, progress_message), list(IGNORE, remote_id), listS(CLET, list(list(constant, list(FIND_CONSTANT_BY_INTERNAL_ID, internal_id))), append(body, NIL)));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_kb_intersection_constants(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list57);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject constant = NIL;
        SubLObject intersection = NIL;
        destructuring_bind_must_consp(current, datum, $list57);
        constant = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list57);
        intersection = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$1 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list57);
            current_$1 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list57);
            if (NIL == member(current_$1, $list58, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$1 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list57);
        }
        final SubLObject progress_message_tail = property_list_member($PROGRESS_MESSAGE, current);
        final SubLObject progress_message = (NIL != progress_message_tail) ? cadr(progress_message_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        final SubLObject internal_id = $sym61$INTERNAL_ID;
        final SubLObject remote_id = $sym62$REMOTE_ID;
        return list(DO_ID_INDEX, list(internal_id, remote_id, list(KB_INTERSECTION_CONSTANT_INDEX, intersection), $PROGRESS_MESSAGE, progress_message), list(IGNORE, remote_id), listS(CLET, list(list(constant, list(FIND_CONSTANT_BY_INTERNAL_ID, internal_id))), append(body, NIL)));
    }

    /**
     * Return T iff it is provably impossible for INTERSECTION to contain NART.
     * Assumes constant-index of INTERSECTION.
     */
    @LispMethod(comment = "Return T iff it is provably impossible for INTERSECTION to contain NART.\r\nAssumes constant-index of INTERSECTION.\nReturn T iff it is provably impossible for INTERSECTION to contain NART.\nAssumes constant-index of INTERSECTION.")
    public static final SubLObject kb_intersection_nart_impossibleP_alt(SubLObject intersection, SubLObject nart) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject impossible = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = $kb_intersection$.currentBinding(thread);
                        try {
                            $kb_intersection$.bind(intersection, thread);
                            list_utilities.tree_map(KB_INTERSECTION_NART_IMPOSSIBLE_INT, cycl_utilities.nart_cons(nart), UNPROVIDED);
                        } finally {
                            $kb_intersection$.rebind(_prev_bind_0, thread);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    impossible = Errors.handleThrowable(ccatch_env_var, $IMPOSSIBLE);
                }
                return impossible;
            }
        }
    }

    /**
     * Return T iff it is provably impossible for INTERSECTION to contain NART.
     * Assumes constant-index of INTERSECTION.
     */
    @LispMethod(comment = "Return T iff it is provably impossible for INTERSECTION to contain NART.\r\nAssumes constant-index of INTERSECTION.\nReturn T iff it is provably impossible for INTERSECTION to contain NART.\nAssumes constant-index of INTERSECTION.")
    public static SubLObject kb_intersection_nart_impossibleP(final SubLObject intersection, final SubLObject nart) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject impossible = NIL;
        try {
            thread.throwStack.push($IMPOSSIBLE);
            final SubLObject _prev_bind_0 = $kb_intersection$.currentBinding(thread);
            try {
                $kb_intersection$.bind(intersection, thread);
                list_utilities.tree_map(KB_INTERSECTION_NART_IMPOSSIBLE_INT, cycl_utilities.nart_cons(nart), UNPROVIDED);
            } finally {
                $kb_intersection$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            impossible = Errors.handleThrowable(ccatch_env_var, $IMPOSSIBLE);
        } finally {
            thread.throwStack.pop();
        }
        return impossible;
    }

    public static final SubLObject kb_intersection_nart_impossible_int_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (((NIL != constant_p(v_object)) && (NIL == kb_intersection_constantP($kb_intersection$.getDynamicValue(thread), v_object))) || ((NIL != nart_handles.nart_p(v_object)) && (NIL != kb_intersection_nart_impossibleP($kb_intersection$.getDynamicValue(thread), v_object)))) {
                sublisp_throw($IMPOSSIBLE, T);
            }
            return NIL;
        }
    }

    public static SubLObject kb_intersection_nart_impossible_int(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL != constant_p(v_object)) && (NIL == kb_intersection_constantP($kb_intersection$.getDynamicValue(thread), v_object))) || ((NIL != nart_handles.nart_p(v_object)) && (NIL != kb_intersection_nart_impossibleP($kb_intersection$.getDynamicValue(thread), v_object)))) {
            sublisp_throw($IMPOSSIBLE, T);
        }
        return NIL;
    }

    /**
     * Return T iff it is provably impossible for INTERSECTION to contain ASSERTION.
     * Assumes constant-index and nart-index of INTERSECTION.
     */
    @LispMethod(comment = "Return T iff it is provably impossible for INTERSECTION to contain ASSERTION.\r\nAssumes constant-index and nart-index of INTERSECTION.\nReturn T iff it is provably impossible for INTERSECTION to contain ASSERTION.\nAssumes constant-index and nart-index of INTERSECTION.")
    public static final SubLObject kb_intersection_assertion_impossibleP_alt(SubLObject intersection, SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject impossible = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = $kb_intersection$.currentBinding(thread);
                        try {
                            $kb_intersection$.bind(intersection, thread);
                            list_utilities.tree_map(KB_INTERSECTION_ASSERTION_IMPOSSIBLE_INT, assertions_high.assertion_cons(assertion), UNPROVIDED);
                            cycl_utilities.expression_map(KB_INTERSECTION_ASSERTION_IMPOSSIBLE_INT, assertions_high.assertion_mt(assertion), T, UNPROVIDED);
                        } finally {
                            $kb_intersection$.rebind(_prev_bind_0, thread);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    impossible = Errors.handleThrowable(ccatch_env_var, $IMPOSSIBLE);
                }
                return impossible;
            }
        }
    }

    /**
     * Return T iff it is provably impossible for INTERSECTION to contain ASSERTION.
     * Assumes constant-index and nart-index of INTERSECTION.
     */
    @LispMethod(comment = "Return T iff it is provably impossible for INTERSECTION to contain ASSERTION.\r\nAssumes constant-index and nart-index of INTERSECTION.\nReturn T iff it is provably impossible for INTERSECTION to contain ASSERTION.\nAssumes constant-index and nart-index of INTERSECTION.")
    public static SubLObject kb_intersection_assertion_impossibleP(final SubLObject intersection, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject impossible = NIL;
        try {
            thread.throwStack.push($IMPOSSIBLE);
            final SubLObject _prev_bind_0 = $kb_intersection$.currentBinding(thread);
            try {
                $kb_intersection$.bind(intersection, thread);
                list_utilities.tree_map(KB_INTERSECTION_ASSERTION_IMPOSSIBLE_INT, assertions_high.assertion_cons(assertion), UNPROVIDED);
                cycl_utilities.expression_map(KB_INTERSECTION_ASSERTION_IMPOSSIBLE_INT, assertions_high.assertion_mt(assertion), T, UNPROVIDED);
            } finally {
                $kb_intersection$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            impossible = Errors.handleThrowable(ccatch_env_var, $IMPOSSIBLE);
        } finally {
            thread.throwStack.pop();
        }
        return impossible;
    }

    public static final SubLObject kb_intersection_assertion_impossible_int_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((((NIL != constant_p(v_object)) && (NIL == kb_intersection_constantP($kb_intersection$.getDynamicValue(thread), v_object))) || ((NIL != nart_handles.nart_p(v_object)) && (NIL == kb_intersection_nartP($kb_intersection$.getDynamicValue(thread), v_object)))) || ((NIL != assertion_handles.assertion_p(v_object)) && (NIL != kb_intersection_assertion_impossibleP($kb_intersection$.getDynamicValue(thread), v_object)))) {
                sublisp_throw($IMPOSSIBLE, T);
            }
            return NIL;
        }
    }

    public static SubLObject kb_intersection_assertion_impossible_int(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((((NIL != constant_p(v_object)) && (NIL == kb_intersection_constantP($kb_intersection$.getDynamicValue(thread), v_object))) || ((NIL != nart_handles.nart_p(v_object)) && (NIL == kb_intersection_nartP($kb_intersection$.getDynamicValue(thread), v_object)))) || ((NIL != assertion_handles.assertion_p(v_object)) && (NIL != kb_intersection_assertion_impossibleP($kb_intersection$.getDynamicValue(thread), v_object)))) {
            sublisp_throw($IMPOSSIBLE, T);
        }
        return NIL;
    }

    /**
     * Return T iff it is provably impossible for INTERSECTION to contain DEDUCTION.
     * Assumes constant-index, nart-index and assertion-index of INTERSECTION.
     */
    @LispMethod(comment = "Return T iff it is provably impossible for INTERSECTION to contain DEDUCTION.\r\nAssumes constant-index, nart-index and assertion-index of INTERSECTION.\nReturn T iff it is provably impossible for INTERSECTION to contain DEDUCTION.\nAssumes constant-index, nart-index and assertion-index of INTERSECTION.")
    public static final SubLObject kb_intersection_deduction_impossibleP_alt(SubLObject intersection, SubLObject deduction) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject impossible = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = $kb_intersection$.currentBinding(thread);
                        try {
                            $kb_intersection$.bind(intersection, thread);
                            kb_intersection_deduction_impossible_int(deductions_high.deduction_assertion(deduction));
                            {
                                SubLObject cdolist_list_var = deductions_high.deduction_supports(deduction);
                                SubLObject support = NIL;
                                for (support = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , support = cdolist_list_var.first()) {
                                    if (NIL != assertion_handles.assertion_p(support)) {
                                        kb_intersection_deduction_impossible_int(support);
                                    } else {
                                        list_utilities.tree_map(KB_INTERSECTION_DEDUCTION_IMPOSSIBLE_INT, arguments.support_cons(support), UNPROVIDED);
                                        cycl_utilities.expression_map(KB_INTERSECTION_DEDUCTION_IMPOSSIBLE_INT, arguments.support_mt(support), T, UNPROVIDED);
                                    }
                                }
                            }
                        } finally {
                            $kb_intersection$.rebind(_prev_bind_0, thread);
                        }
                    }
                } catch (Throwable ccatch_env_var) {
                    impossible = Errors.handleThrowable(ccatch_env_var, $IMPOSSIBLE);
                }
                return impossible;
            }
        }
    }

    /**
     * Return T iff it is provably impossible for INTERSECTION to contain DEDUCTION.
     * Assumes constant-index, nart-index and assertion-index of INTERSECTION.
     */
    @LispMethod(comment = "Return T iff it is provably impossible for INTERSECTION to contain DEDUCTION.\r\nAssumes constant-index, nart-index and assertion-index of INTERSECTION.\nReturn T iff it is provably impossible for INTERSECTION to contain DEDUCTION.\nAssumes constant-index, nart-index and assertion-index of INTERSECTION.")
    public static SubLObject kb_intersection_deduction_impossibleP(final SubLObject intersection, final SubLObject deduction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject impossible = NIL;
        try {
            thread.throwStack.push($IMPOSSIBLE);
            final SubLObject _prev_bind_0 = $kb_intersection$.currentBinding(thread);
            try {
                $kb_intersection$.bind(intersection, thread);
                kb_intersection_deduction_impossible_int(deductions_high.deduction_supported_object(deduction));
                SubLObject cdolist_list_var = deductions_high.deduction_supports(deduction);
                SubLObject support = NIL;
                support = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != assertion_handles.assertion_p(support)) {
                        kb_intersection_deduction_impossible_int(support);
                    } else {
                        list_utilities.tree_map(KB_INTERSECTION_DEDUCTION_IMPOSSIBLE_INT, arguments.support_cons(support), UNPROVIDED);
                        cycl_utilities.expression_map(KB_INTERSECTION_DEDUCTION_IMPOSSIBLE_INT, arguments.support_mt(support), T, UNPROVIDED);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    support = cdolist_list_var.first();
                } 
            } finally {
                $kb_intersection$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            impossible = Errors.handleThrowable(ccatch_env_var, $IMPOSSIBLE);
        } finally {
            thread.throwStack.pop();
        }
        return impossible;
    }

    public static final SubLObject kb_intersection_deduction_impossible_int_alt(SubLObject v_object) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if ((((NIL != constant_p(v_object)) && (NIL == kb_intersection_constantP($kb_intersection$.getDynamicValue(thread), v_object))) || ((NIL != nart_handles.nart_p(v_object)) && (NIL == kb_intersection_nartP($kb_intersection$.getDynamicValue(thread), v_object)))) || ((NIL != assertion_handles.assertion_p(v_object)) && (NIL == kb_intersection_assertionP($kb_intersection$.getDynamicValue(thread), v_object)))) {
                sublisp_throw($IMPOSSIBLE, T);
            }
            return NIL;
        }
    }

    public static SubLObject kb_intersection_deduction_impossible_int(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((((NIL != constant_p(v_object)) && (NIL == kb_intersection_constantP($kb_intersection$.getDynamicValue(thread), v_object))) || ((NIL != nart_handles.nart_p(v_object)) && (NIL == kb_intersection_nartP($kb_intersection$.getDynamicValue(thread), v_object)))) || ((NIL != assertion_handles.assertion_p(v_object)) && (NIL == kb_intersection_assertionP($kb_intersection$.getDynamicValue(thread), v_object)))) {
            sublisp_throw($IMPOSSIBLE, T);
        }
        return NIL;
    }

    public static SubLObject save_kb_intersection_information_to_file(final SubLObject kb_intersection, final SubLObject file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(file, $OUTPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str71$Unable_to_open__S, file);
            }
            final SubLObject s = stream;
            save_kb_intersection_information(kb_intersection, s);
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return kb_intersection;
    }

    public static SubLObject load_kb_intersection_information_from_file(final SubLObject v_remote_image, final SubLObject file) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject kb_intersection = NIL;
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(file, $INPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str71$Unable_to_open__S, file);
            }
            final SubLObject s = stream;
            kb_intersection = load_kb_intersection_information(v_remote_image, s);
        } finally {
            final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return kb_intersection;
    }

    public static SubLObject save_kb_intersection_information(final SubLObject kb_intersection, final SubLObject stream) {
        dumper.dump_copyright(stream);
        cfasl_output($CONSTANTS, stream);
        save_kb_intersection_id_index(kb_intrsct_constant_index(kb_intersection), stream, $$$Constants);
        cfasl_output($NARTS, stream);
        save_kb_intersection_id_index(kb_intrsct_nart_index(kb_intersection), stream, $$$NARTs);
        cfasl_output($ASSERTIONS, stream);
        save_kb_intersection_id_index(kb_intrsct_assertion_index(kb_intersection), stream, $$$Assertions);
        cfasl_output($DEDUCTIONS, stream);
        save_kb_intersection_id_index(kb_intrsct_deduction_index(kb_intersection), stream, $$$Deductions);
        return kb_intersection;
    }

    public static SubLObject load_kb_intersection_information(final SubLObject v_remote_image, final SubLObject stream) {
        final SubLObject kb_intersection = new_kb_intersection(v_remote_image);
        dumper.load_copyright(stream);
        _csetf_kb_intrsct_constant_index(kb_intersection, load_kb_intersection_id_index($CONSTANTS, stream));
        _csetf_kb_intrsct_nart_index(kb_intersection, load_kb_intersection_id_index($NARTS, stream));
        _csetf_kb_intrsct_assertion_index(kb_intersection, load_kb_intersection_id_index($ASSERTIONS, stream));
        _csetf_kb_intrsct_deduction_index(kb_intersection, load_kb_intersection_id_index($DEDUCTIONS, stream));
        return kb_intersection;
    }

    public static SubLObject save_kb_intersection_id_index(final SubLObject v_id_index, final SubLObject stream, final SubLObject type) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject str;
        final SubLObject message = str = cconcatenate($$$Saving_KB_, new SubLObject[]{ format_nil.format_nil_a_no_copy(type), $str82$_Intersection_ID_Index_____ });
        final SubLObject _prev_bind_0 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_last_pacification_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
        try {
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
            $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
            $progress_notification_count$.bind(ZERO_INTEGER, thread);
            $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
            $progress_count$.bind(ZERO_INTEGER, thread);
            $is_noting_progressP$.bind(T, thread);
            $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
            noting_progress_preamble(str);
            cfasl_output(invert_kb_intersection_id_index(v_id_index), stream);
            noting_progress_postamble();
        } finally {
            $silent_progressP$.rebind(_prev_bind_8, thread);
            $is_noting_progressP$.rebind(_prev_bind_7, thread);
            $progress_count$.rebind(_prev_bind_6, thread);
            $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
            $progress_notification_count$.rebind(_prev_bind_4, thread);
            $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
            $progress_last_pacification_time$.rebind(_prev_bind_2, thread);
            $progress_start_time$.rebind(_prev_bind_0, thread);
        }
        return v_id_index;
    }

    public static SubLObject load_kb_intersection_id_index(final SubLObject type, final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject message = cconcatenate($$$Loading_KB_, new SubLObject[]{ format_nil.format_nil_a_no_copy(type), $str82$_Intersection_ID_Index_____ });
        final SubLObject marker = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
        SubLObject v_id_index = NIL;
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!type.eql(marker))) {
            Errors.error($str84$Error_in_KB_Intersection_ID_index, type, marker);
        }
        final SubLObject str = message;
        final SubLObject _prev_bind_0 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_last_pacification_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_notification_count$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $progress_pacifications_since_last_nl$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $progress_count$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $is_noting_progressP$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $silent_progressP$.currentBinding(thread);
        try {
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
            $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
            $progress_notification_count$.bind(ZERO_INTEGER, thread);
            $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
            $progress_count$.bind(ZERO_INTEGER, thread);
            $is_noting_progressP$.bind(T, thread);
            $silent_progressP$.bind(NIL != str ? $silent_progressP$.getDynamicValue(thread) : T, thread);
            noting_progress_preamble(str);
            v_id_index = cfasl_input(stream, UNPROVIDED, UNPROVIDED);
            if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == id_index_p(v_id_index))) {
                Errors.error($str85$Expected_a_KB_Intersection_ID_ind, v_id_index);
            }
            noting_progress_postamble();
        } finally {
            $silent_progressP$.rebind(_prev_bind_8, thread);
            $is_noting_progressP$.rebind(_prev_bind_7, thread);
            $progress_count$.rebind(_prev_bind_6, thread);
            $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
            $progress_notification_count$.rebind(_prev_bind_4, thread);
            $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
            $progress_last_pacification_time$.rebind(_prev_bind_2, thread);
            $progress_start_time$.rebind(_prev_bind_0, thread);
        }
        return v_id_index;
    }

    public static SubLObject invert_kb_intersection_id_index(final SubLObject v_id_index) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject new_index = clone_id_index(v_id_index);
        if (NIL == id_index_objects_empty_p(v_id_index, $SKIP)) {
            if (NIL == id_index_dense_objects_empty_p(v_id_index, $SKIP)) {
                final SubLObject vector_var = id_index_dense_objects(v_id_index);
                final SubLObject backwardP_var = NIL;
                SubLObject length;
                SubLObject v_iteration;
                SubLObject id;
                SubLObject v_object;
                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                    v_object = aref(vector_var, id);
                    if ((NIL == id_index_tombstone_p(v_object)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        if (NIL != id_index_tombstone_p(v_object)) {
                            v_object = $SKIP;
                        }
                        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subl_promotions.non_negative_integer_p(v_object))) {
                            Errors.error($str87$This_ID_index_cannot_be_inverted_, id, v_object);
                        }
                        id_index_enter(new_index, v_object, id);
                    }
                }
            }
            if (NIL == id_index_sparse_objects_empty_p(v_id_index)) {
                final SubLObject cdohash_table = id_index_sparse_objects(v_id_index);
                SubLObject id2 = NIL;
                SubLObject v_object2 = NIL;
                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                try {
                    while (iteratorHasNext(cdohash_iterator)) {
                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                        id2 = getEntryKey(cdohash_entry);
                        v_object2 = getEntryValue(cdohash_entry);
                        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subl_promotions.non_negative_integer_p(v_object2))) {
                            Errors.error($str87$This_ID_index_cannot_be_inverted_, id2, v_object2);
                        }
                        id_index_enter(new_index, v_object2, id2);
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator);
                }
            }
        }
        return new_index;
    }

    public static final SubLObject kb_difference_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        print_kb_difference(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject kb_difference_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_kb_difference(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject kb_difference_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.kb_compare.$kb_difference_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject kb_difference_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.kb_compare.$kb_difference_native.class ? T : NIL;
    }

    public static final SubLObject kb_diff_common_intersection_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, KB_DIFFERENCE_P);
        return v_object.getField2();
    }

    public static SubLObject kb_diff_common_intersection(final SubLObject v_object) {
        assert NIL != kb_difference_p(v_object) : "! kb_compare.kb_difference_p(v_object) " + "kb_compare.kb_difference_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject kb_diff_renamed_constants_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, KB_DIFFERENCE_P);
        return v_object.getField3();
    }

    public static SubLObject kb_diff_renamed_constants(final SubLObject v_object) {
        assert NIL != kb_difference_p(v_object) : "! kb_compare.kb_difference_p(v_object) " + "kb_compare.kb_difference_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject kb_diff_constants_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, KB_DIFFERENCE_P);
        return v_object.getField4();
    }

    public static SubLObject kb_diff_constants(final SubLObject v_object) {
        assert NIL != kb_difference_p(v_object) : "! kb_compare.kb_difference_p(v_object) " + "kb_compare.kb_difference_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject kb_diff_narts_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, KB_DIFFERENCE_P);
        return v_object.getField5();
    }

    public static SubLObject kb_diff_narts(final SubLObject v_object) {
        assert NIL != kb_difference_p(v_object) : "! kb_compare.kb_difference_p(v_object) " + "kb_compare.kb_difference_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject kb_diff_assertions_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, KB_DIFFERENCE_P);
        return v_object.getField6();
    }

    public static SubLObject kb_diff_assertions(final SubLObject v_object) {
        assert NIL != kb_difference_p(v_object) : "! kb_compare.kb_difference_p(v_object) " + "kb_compare.kb_difference_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject kb_diff_deductions_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, KB_DIFFERENCE_P);
        return v_object.getField7();
    }

    public static SubLObject kb_diff_deductions(final SubLObject v_object) {
        assert NIL != kb_difference_p(v_object) : "! kb_compare.kb_difference_p(v_object) " + "kb_compare.kb_difference_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject _csetf_kb_diff_common_intersection_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, KB_DIFFERENCE_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_kb_diff_common_intersection(final SubLObject v_object, final SubLObject value) {
        assert NIL != kb_difference_p(v_object) : "! kb_compare.kb_difference_p(v_object) " + "kb_compare.kb_difference_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_kb_diff_renamed_constants_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, KB_DIFFERENCE_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_kb_diff_renamed_constants(final SubLObject v_object, final SubLObject value) {
        assert NIL != kb_difference_p(v_object) : "! kb_compare.kb_difference_p(v_object) " + "kb_compare.kb_difference_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_kb_diff_constants_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, KB_DIFFERENCE_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_kb_diff_constants(final SubLObject v_object, final SubLObject value) {
        assert NIL != kb_difference_p(v_object) : "! kb_compare.kb_difference_p(v_object) " + "kb_compare.kb_difference_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_kb_diff_narts_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, KB_DIFFERENCE_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_kb_diff_narts(final SubLObject v_object, final SubLObject value) {
        assert NIL != kb_difference_p(v_object) : "! kb_compare.kb_difference_p(v_object) " + "kb_compare.kb_difference_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_kb_diff_assertions_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, KB_DIFFERENCE_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_kb_diff_assertions(final SubLObject v_object, final SubLObject value) {
        assert NIL != kb_difference_p(v_object) : "! kb_compare.kb_difference_p(v_object) " + "kb_compare.kb_difference_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_kb_diff_deductions_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, KB_DIFFERENCE_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_kb_diff_deductions(final SubLObject v_object, final SubLObject value) {
        assert NIL != kb_difference_p(v_object) : "! kb_compare.kb_difference_p(v_object) " + "kb_compare.kb_difference_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject make_kb_difference_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.kb_compare.$kb_difference_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($COMMON_INTERSECTION)) {
                        _csetf_kb_diff_common_intersection(v_new, current_value);
                    } else {
                        if (pcase_var.eql($RENAMED_CONSTANTS)) {
                            _csetf_kb_diff_renamed_constants(v_new, current_value);
                        } else {
                            if (pcase_var.eql($CONSTANTS)) {
                                _csetf_kb_diff_constants(v_new, current_value);
                            } else {
                                if (pcase_var.eql($NARTS)) {
                                    _csetf_kb_diff_narts(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($ASSERTIONS)) {
                                        _csetf_kb_diff_assertions(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($DEDUCTIONS)) {
                                            _csetf_kb_diff_deductions(v_new, current_value);
                                        } else {
                                            Errors.error($str_alt41$Invalid_slot__S_for_construction_, current_arg);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return v_new;
        }
    }

    public static SubLObject make_kb_difference(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.kb_compare.$kb_difference_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($COMMON_INTERSECTION)) {
                _csetf_kb_diff_common_intersection(v_new, current_value);
            } else
                if (pcase_var.eql($RENAMED_CONSTANTS)) {
                    _csetf_kb_diff_renamed_constants(v_new, current_value);
                } else
                    if (pcase_var.eql($CONSTANTS)) {
                        _csetf_kb_diff_constants(v_new, current_value);
                    } else
                        if (pcase_var.eql($NARTS)) {
                            _csetf_kb_diff_narts(v_new, current_value);
                        } else
                            if (pcase_var.eql($ASSERTIONS)) {
                                _csetf_kb_diff_assertions(v_new, current_value);
                            } else
                                if (pcase_var.eql($DEDUCTIONS)) {
                                    _csetf_kb_diff_deductions(v_new, current_value);
                                } else {
                                    Errors.error($str42$Invalid_slot__S_for_construction_, current_arg);
                                }





        }
        return v_new;
    }

    public static SubLObject visit_defstruct_kb_difference(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_KB_DIFFERENCE, SIX_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $COMMON_INTERSECTION, kb_diff_common_intersection(obj));
        funcall(visitor_fn, obj, $SLOT, $RENAMED_CONSTANTS, kb_diff_renamed_constants(obj));
        funcall(visitor_fn, obj, $SLOT, $CONSTANTS, kb_diff_constants(obj));
        funcall(visitor_fn, obj, $SLOT, $NARTS, kb_diff_narts(obj));
        funcall(visitor_fn, obj, $SLOT, $ASSERTIONS, kb_diff_assertions(obj));
        funcall(visitor_fn, obj, $SLOT, $DEDUCTIONS, kb_diff_deductions(obj));
        funcall(visitor_fn, obj, $END, MAKE_KB_DIFFERENCE, SIX_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_kb_difference_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_kb_difference(obj, visitor_fn);
    }

    public static final SubLObject print_kb_difference_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
        format(stream, $str_alt90$_KB_DIFFERENCE_using__a_, kb_difference_common_intersection(v_object));
        return NIL;
    }

    public static SubLObject print_kb_difference(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        format(stream, $str113$_KB_DIFFERENCE_using__a_, kb_difference_common_intersection(v_object));
        return NIL;
    }

    public static final SubLObject new_kb_difference_alt(SubLObject intersection) {
        {
            SubLObject difference = make_kb_difference(UNPROVIDED);
            _csetf_kb_diff_common_intersection(difference, intersection);
            _csetf_kb_diff_renamed_constants(difference, dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
            _csetf_kb_diff_constants(difference, set.new_set(symbol_function(EQ), UNPROVIDED));
            _csetf_kb_diff_narts(difference, set.new_set(symbol_function(EQ), UNPROVIDED));
            _csetf_kb_diff_assertions(difference, set.new_set(symbol_function(EQ), UNPROVIDED));
            _csetf_kb_diff_deductions(difference, set.new_set(symbol_function(EQ), UNPROVIDED));
            return difference;
        }
    }

    public static SubLObject new_kb_difference(final SubLObject intersection) {
        final SubLObject difference = make_kb_difference(UNPROVIDED);
        _csetf_kb_diff_common_intersection(difference, intersection);
        _csetf_kb_diff_renamed_constants(difference, dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED));
        _csetf_kb_diff_constants(difference, set.new_set(symbol_function(EQL), UNPROVIDED));
        _csetf_kb_diff_narts(difference, set.new_set(symbol_function(EQL), UNPROVIDED));
        _csetf_kb_diff_assertions(difference, set.new_set(symbol_function(EQL), UNPROVIDED));
        _csetf_kb_diff_deductions(difference, set.new_set(symbol_function(EQL), UNPROVIDED));
        return difference;
    }

    public static final SubLObject destroy_kb_difference_alt(SubLObject difference) {
        dictionary.clear_dictionary(kb_diff_renamed_constants(difference));
        set.clear_set(kb_diff_constants(difference));
        set.clear_set(kb_diff_narts(difference));
        set.clear_set(kb_diff_assertions(difference));
        set.clear_set(kb_diff_deductions(difference));
        _csetf_kb_diff_common_intersection(difference, $FREE);
        _csetf_kb_diff_renamed_constants(difference, NIL);
        _csetf_kb_diff_constants(difference, NIL);
        _csetf_kb_diff_narts(difference, NIL);
        _csetf_kb_diff_assertions(difference, NIL);
        _csetf_kb_diff_deductions(difference, NIL);
        return difference;
    }

    public static SubLObject destroy_kb_difference(final SubLObject difference) {
        dictionary.clear_dictionary(kb_diff_renamed_constants(difference));
        set.clear_set(kb_diff_constants(difference));
        set.clear_set(kb_diff_narts(difference));
        set.clear_set(kb_diff_assertions(difference));
        set.clear_set(kb_diff_deductions(difference));
        _csetf_kb_diff_common_intersection(difference, $FREE);
        _csetf_kb_diff_renamed_constants(difference, NIL);
        _csetf_kb_diff_constants(difference, NIL);
        _csetf_kb_diff_narts(difference, NIL);
        _csetf_kb_diff_assertions(difference, NIL);
        _csetf_kb_diff_deductions(difference, NIL);
        return difference;
    }

    public static final SubLObject kb_difference_common_intersection_alt(SubLObject difference) {
        return kb_diff_common_intersection(difference);
    }

    public static SubLObject kb_difference_common_intersection(final SubLObject difference) {
        return kb_diff_common_intersection(difference);
    }

    public static final SubLObject kb_difference_renamed_constants_alt(SubLObject difference) {
        return kb_diff_renamed_constants(difference);
    }

    public static SubLObject kb_difference_renamed_constants(final SubLObject difference) {
        return kb_diff_renamed_constants(difference);
    }

    public static final SubLObject kb_difference_constants_alt(SubLObject difference) {
        return kb_diff_constants(difference);
    }

    public static SubLObject kb_difference_constants(final SubLObject difference) {
        return kb_diff_constants(difference);
    }

    public static final SubLObject kb_difference_narts_alt(SubLObject difference) {
        return kb_diff_narts(difference);
    }

    public static SubLObject kb_difference_narts(final SubLObject difference) {
        return kb_diff_narts(difference);
    }

    public static final SubLObject kb_difference_assertions_alt(SubLObject difference) {
        return kb_diff_assertions(difference);
    }

    public static SubLObject kb_difference_assertions(final SubLObject difference) {
        return kb_diff_assertions(difference);
    }

    public static final SubLObject kb_difference_deductions_alt(SubLObject difference) {
        return kb_diff_deductions(difference);
    }

    public static SubLObject kb_difference_deductions(final SubLObject difference) {
        return kb_diff_deductions(difference);
    }

    public static final SubLObject do_kb_difference_renamed_constants_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt101);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject constant = NIL;
                    SubLObject remote_name = NIL;
                    SubLObject difference = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt101);
                    constant = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt101);
                    remote_name = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt101);
                    difference = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_2 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt101);
                            current_2 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt101);
                            if (NIL == member(current_2, $list_alt102, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_2 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt101);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return listS(DO_DICTIONARY, list(constant, remote_name, list(KB_DIFFERENCE_RENAMED_CONSTANTS, difference), $DONE, done), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_kb_difference_renamed_constants(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list124);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject constant = NIL;
        SubLObject remote_name = NIL;
        SubLObject difference = NIL;
        destructuring_bind_must_consp(current, datum, $list124);
        constant = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list124);
        remote_name = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list124);
        difference = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$4 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list124);
            current_$4 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list124);
            if (NIL == member(current_$4, $list125, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$4 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list124);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_DICTIONARY, list(constant, remote_name, list(KB_DIFFERENCE_RENAMED_CONSTANTS, difference), $DONE, done), append(body, NIL));
    }

    public static final SubLObject do_kb_difference_constants_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt105);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject constant = NIL;
                    SubLObject difference = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt105);
                    constant = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt105);
                    difference = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_3 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt105);
                            current_3 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt105);
                            if (NIL == member(current_3, $list_alt102, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_3 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt105);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return listS(DO_SET, list(constant, list(KB_DIFFERENCE_CONSTANTS, difference), $DONE, done), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_kb_difference_constants(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list128);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject constant = NIL;
        SubLObject difference = NIL;
        destructuring_bind_must_consp(current, datum, $list128);
        constant = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list128);
        difference = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$5 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list128);
            current_$5 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list128);
            if (NIL == member(current_$5, $list125, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$5 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list128);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_SET, list(constant, list(KB_DIFFERENCE_CONSTANTS, difference), $DONE, done), append(body, NIL));
    }

    public static final SubLObject do_kb_difference_narts_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt107);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject nart = NIL;
                    SubLObject difference = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt107);
                    nart = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt107);
                    difference = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_4 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt107);
                            current_4 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt107);
                            if (NIL == member(current_4, $list_alt102, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_4 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt107);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return listS(DO_SET, list(nart, list(KB_DIFFERENCE_NARTS, difference), $DONE, done), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_kb_difference_narts(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list130);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject nart = NIL;
        SubLObject difference = NIL;
        destructuring_bind_must_consp(current, datum, $list130);
        nart = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list130);
        difference = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$6 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list130);
            current_$6 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list130);
            if (NIL == member(current_$6, $list125, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$6 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list130);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_SET, list(nart, list(KB_DIFFERENCE_NARTS, difference), $DONE, done), append(body, NIL));
    }

    public static final SubLObject do_kb_difference_assertions_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt108);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject assertion = NIL;
                    SubLObject difference = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt108);
                    assertion = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt108);
                    difference = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_5 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt108);
                            current_5 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt108);
                            if (NIL == member(current_5, $list_alt102, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_5 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt108);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return listS(DO_SET, list(assertion, list(KB_DIFFERENCE_ASSERTIONS, difference), $DONE, done), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_kb_difference_assertions(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list131);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject assertion = NIL;
        SubLObject difference = NIL;
        destructuring_bind_must_consp(current, datum, $list131);
        assertion = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list131);
        difference = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$7 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list131);
            current_$7 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list131);
            if (NIL == member(current_$7, $list125, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$7 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list131);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_SET, list(assertion, list(KB_DIFFERENCE_ASSERTIONS, difference), $DONE, done), append(body, NIL));
    }

    public static final SubLObject do_kb_difference_deductions_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt109);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject deduction = NIL;
                    SubLObject difference = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt109);
                    deduction = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt109);
                    difference = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_6 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt109);
                            current_6 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt109);
                            if (NIL == member(current_6, $list_alt102, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_6 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt109);
                        }
                        {
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return listS(DO_SET, list(deduction, list(KB_DIFFERENCE_DEDUCTIONS, difference), $DONE, done), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    public static SubLObject do_kb_difference_deductions(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list132);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject deduction = NIL;
        SubLObject difference = NIL;
        destructuring_bind_must_consp(current, datum, $list132);
        deduction = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list132);
        difference = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$8 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list132);
            current_$8 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list132);
            if (NIL == member(current_$8, $list125, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$8 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list132);
        }
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_SET, list(deduction, list(KB_DIFFERENCE_DEDUCTIONS, difference), $DONE, done), append(body, NIL));
    }

    public static final SubLObject kb_difference_add_renamed_constant_alt(SubLObject difference, SubLObject constant, SubLObject remote_name) {
        SubLTrampolineFile.checkType(constant, CONSTANT_P);
        SubLTrampolineFile.checkType(remote_name, STRINGP);
        dictionary.dictionary_enter(kb_diff_renamed_constants(difference), constant, remote_name);
        return difference;
    }

    public static SubLObject kb_difference_add_renamed_constant(final SubLObject difference, final SubLObject constant, final SubLObject remote_name) {
        assert NIL != constant_p(constant) : "! constant_handles.constant_p(constant) " + ("constant_handles.constant_p(constant) " + "CommonSymbols.NIL != constant_handles.constant_p(constant) ") + constant;
        assert NIL != stringp(remote_name) : "! stringp(remote_name) " + ("Types.stringp(remote_name) " + "CommonSymbols.NIL != Types.stringp(remote_name) ") + remote_name;
        dictionary.dictionary_enter(kb_diff_renamed_constants(difference), constant, remote_name);
        return difference;
    }

    public static final SubLObject kb_difference_add_constant_alt(SubLObject difference, SubLObject constant) {
        SubLTrampolineFile.checkType(constant, CONSTANT_P);
        set.set_add(constant, kb_diff_constants(difference));
        return difference;
    }

    public static SubLObject kb_difference_add_constant(final SubLObject difference, final SubLObject constant) {
        assert NIL != constant_p(constant) : "! constant_handles.constant_p(constant) " + ("constant_handles.constant_p(constant) " + "CommonSymbols.NIL != constant_handles.constant_p(constant) ") + constant;
        set.set_add(constant, kb_diff_constants(difference));
        return difference;
    }

    public static final SubLObject kb_difference_add_nart_alt(SubLObject difference, SubLObject nart) {
        SubLTrampolineFile.checkType(nart, NART_P);
        set.set_add(nart, kb_diff_narts(difference));
        return difference;
    }

    public static SubLObject kb_difference_add_nart(final SubLObject difference, final SubLObject nart) {
        assert NIL != nart_handles.nart_p(nart) : "! nart_handles.nart_p(nart) " + ("nart_handles.nart_p(nart) " + "CommonSymbols.NIL != nart_handles.nart_p(nart) ") + nart;
        set.set_add(nart, kb_diff_narts(difference));
        return difference;
    }

    public static final SubLObject kb_difference_add_assertion_alt(SubLObject difference, SubLObject assertion) {
        SubLTrampolineFile.checkType(assertion, ASSERTION_P);
        set.set_add(assertion, kb_diff_assertions(difference));
        return difference;
    }

    public static SubLObject kb_difference_add_assertion(final SubLObject difference, final SubLObject assertion) {
        assert NIL != assertion_handles.assertion_p(assertion) : "! assertion_handles.assertion_p(assertion) " + ("assertion_handles.assertion_p(assertion) " + "CommonSymbols.NIL != assertion_handles.assertion_p(assertion) ") + assertion;
        set.set_add(assertion, kb_diff_assertions(difference));
        return difference;
    }

    public static final SubLObject kb_difference_add_deduction_alt(SubLObject difference, SubLObject deduction) {
        SubLTrampolineFile.checkType(deduction, DEDUCTION_P);
        set.set_add(deduction, kb_diff_deductions(difference));
        return difference;
    }

    public static SubLObject kb_difference_add_deduction(final SubLObject difference, final SubLObject deduction) {
        assert NIL != deduction_handles.deduction_p(deduction) : "! deduction_handles.deduction_p(deduction) " + ("deduction_handles.deduction_p(deduction) " + "CommonSymbols.NIL != deduction_handles.deduction_p(deduction) ") + deduction;
        set.set_add(deduction, kb_diff_deductions(difference));
        return difference;
    }

    public static final SubLObject kb_difference_remote_image_alt(SubLObject difference) {
        return kb_intersection_remote_image(kb_difference_common_intersection(difference));
    }

    public static SubLObject kb_difference_remote_image(final SubLObject difference) {
        return kb_intersection_remote_image(kb_difference_common_intersection(difference));
    }

    public static final SubLObject kb_difference_remote_image_machine_alt(SubLObject difference) {
        return kb_intersection_remote_image_machine(kb_difference_common_intersection(difference));
    }

    public static SubLObject kb_difference_remote_image_machine(final SubLObject difference) {
        return kb_intersection_remote_image_machine(kb_difference_common_intersection(difference));
    }

    public static final SubLObject kb_difference_remote_image_port_alt(SubLObject difference) {
        return kb_intersection_remote_image_port(kb_difference_common_intersection(difference));
    }

    public static SubLObject kb_difference_remote_image_port(final SubLObject difference) {
        return kb_intersection_remote_image_port(kb_difference_common_intersection(difference));
    }

    public static final SubLObject kb_difference_remote_image_protocol_alt(SubLObject difference) {
        return kb_intersection_remote_image_protocol(kb_difference_common_intersection(difference));
    }

    public static SubLObject kb_difference_remote_image_protocol(final SubLObject difference) {
        return kb_intersection_remote_image_protocol(kb_difference_common_intersection(difference));
    }

    public static final SubLObject kb_difference_constant_remote_name_alt(SubLObject difference, SubLObject constant) {
        return dictionary.dictionary_lookup(kb_diff_renamed_constants(difference), constant, constants_high.constant_name(constant));
    }

    public static SubLObject kb_difference_constant_remote_name(final SubLObject difference, final SubLObject constant) {
        return dictionary.dictionary_lookup(kb_diff_renamed_constants(difference), constant, constants_high.constant_name(constant));
    }

    public static final SubLObject kb_difference_all_renamed_constants_alt(SubLObject difference) {
        return Sort.sort(dictionary.dictionary_keys(kb_diff_renamed_constants(difference)), symbol_function($sym111$_), CONSTANT_INTERNAL_ID);
    }

    public static SubLObject kb_difference_all_renamed_constants(final SubLObject difference) {
        return Sort.sort(dictionary.dictionary_keys(kb_diff_renamed_constants(difference)), symbol_function($sym134$_), CONSTANT_INTERNAL_ID);
    }

    public static final SubLObject kb_difference_all_constants_alt(SubLObject difference) {
        return Sort.sort(set.set_element_list(kb_diff_constants(difference)), symbol_function($sym111$_), CONSTANT_INTERNAL_ID);
    }

    public static SubLObject kb_difference_all_constants(final SubLObject difference) {
        return Sort.sort(set.set_element_list(kb_diff_constants(difference)), symbol_function($sym134$_), CONSTANT_INTERNAL_ID);
    }

    public static final SubLObject kb_difference_all_narts_alt(SubLObject difference) {
        return Sort.sort(set.set_element_list(kb_diff_narts(difference)), symbol_function($sym111$_), NART_ID);
    }

    public static SubLObject kb_difference_all_narts(final SubLObject difference) {
        return Sort.sort(set.set_element_list(kb_diff_narts(difference)), symbol_function($sym134$_), NART_ID);
    }

    public static final SubLObject kb_difference_all_assertions_alt(SubLObject difference) {
        return Sort.sort(set.set_element_list(kb_diff_assertions(difference)), symbol_function($sym111$_), ASSERTION_ID);
    }

    public static SubLObject kb_difference_all_assertions(final SubLObject difference) {
        return assertion_utilities.sort_assertions(set.set_element_list(kb_diff_assertions(difference)));
    }

    public static final SubLObject kb_difference_all_deductions_alt(SubLObject difference) {
        return Sort.sort(set.set_element_list(kb_diff_deductions(difference)), symbol_function($sym111$_), DEDUCTION_ID);
    }

    public static SubLObject kb_difference_all_deductions(final SubLObject difference) {
        return Sort.sort(set.set_element_list(kb_diff_deductions(difference)), symbol_function($sym134$_), DEDUCTION_ID);
    }

    public static final SubLObject kb_intersection_compute_alt(SubLObject intersection) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(intersection, KB_INTERSECTION_P);
            {
                SubLObject v_remote_image = kb_intersection_remote_image(intersection);
                SubLObject connection = remote_image.new_remote_image_connection(v_remote_image);
                try {
                    remote_image.open_remote_image_connection(connection);
                    {
                        SubLObject _prev_bind_0 = remote_image.$current_remote_image_connection$.currentBinding(thread);
                        SubLObject _prev_bind_1 = $kb_compare_common_symbols$.currentBinding(thread);
                        try {
                            remote_image.$current_remote_image_connection$.bind(connection, thread);
                            $kb_compare_common_symbols$.bind($kb_compare_common_symbols$.getDynamicValue(thread), thread);
                            set_kb_compare_connection_common_symbols();
                            {
                                SubLObject _prev_bind_0_7 = $cfasl_common_symbols$.currentBinding(thread);
                                try {
                                    $cfasl_common_symbols$.bind(NIL, thread);
                                    cfasl_set_common_symbols($kb_compare_common_symbols$.getDynamicValue(thread));
                                    kb_intersection_compute_constants(intersection);
                                    kb_intersection_compute_narts(intersection);
                                    kb_intersection_compute_assertions(intersection);
                                    kb_intersection_compute_deductions(intersection);
                                } finally {
                                    $cfasl_common_symbols$.rebind(_prev_bind_0_7, thread);
                                }
                            }
                        } finally {
                            $kb_compare_common_symbols$.rebind(_prev_bind_1, thread);
                            remote_image.$current_remote_image_connection$.rebind(_prev_bind_0, thread);
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            remote_image.close_remote_image_connection(connection);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return intersection;
        }
    }

    public static SubLObject kb_intersection_compute(final SubLObject intersection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != kb_intersection_p(intersection) : "! kb_compare.kb_intersection_p(intersection) " + ("kb_compare.kb_intersection_p(intersection) " + "CommonSymbols.NIL != kb_compare.kb_intersection_p(intersection) ") + intersection;
        final SubLObject v_remote_image = kb_intersection_remote_image(intersection);
        final SubLObject connection = remote_image.new_remote_image_connection(v_remote_image);
        try {
            remote_image.open_remote_image_connection(connection);
            final SubLObject _prev_bind_0 = remote_image.$current_remote_image_connection$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $kb_compare_common_symbols$.currentBinding(thread);
            try {
                remote_image.$current_remote_image_connection$.bind(connection, thread);
                $kb_compare_common_symbols$.bind($kb_compare_common_symbols$.getDynamicValue(thread), thread);
                set_kb_compare_connection_common_symbols();
                final SubLObject _prev_bind_0_$9 = $cfasl_common_symbols$.currentBinding(thread);
                try {
                    $cfasl_common_symbols$.bind(NIL, thread);
                    cfasl_set_common_symbols($kb_compare_common_symbols$.getDynamicValue(thread));
                    kb_intersection_compute_constants(intersection);
                    kb_intersection_compute_narts(intersection);
                    kb_intersection_compute_assertions(intersection);
                    kb_intersection_compute_deductions(intersection);
                } finally {
                    $cfasl_common_symbols$.rebind(_prev_bind_0_$9, thread);
                }
            } finally {
                $kb_compare_common_symbols$.rebind(_prev_bind_2, thread);
                remote_image.$current_remote_image_connection$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                remote_image.close_remote_image_connection(connection);
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return intersection;
    }

    public static final SubLObject kb_intersection_compute_constants_alt(SubLObject intersection) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != compute_remote_image_old_constants_congruentP()) {
                kb_intersection_compute_congruent_old_constants(intersection);
                {
                    SubLObject start = add(ONE_INTEGER, constant_index_manager.get_file_backed_constant_internal_id_threshold());
                    SubLObject idx = do_constants_table();
                    SubLObject total = id_index_count(idx);
                    SubLObject sofar = ZERO_INTEGER;
                    SubLTrampolineFile.checkType($str_alt116$KB_Intersection___Examining_new_c, STRINGP);
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
                            noting_percent_progress_preamble($str_alt116$KB_Intersection___Examining_new_c);
                            if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                                {
                                    SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
                                    SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
                                    SubLObject constant = NIL;
                                    while (NIL != id) {
                                        constant = do_id_index_state_object(idx, $SKIP, id, state_var);
                                        if (NIL != do_id_index_id_and_object_validP(id, constant, $SKIP)) {
                                            note_percent_progress(sofar, total);
                                            sofar = add(sofar, ONE_INTEGER);
                                            if (!id.numL(start)) {
                                                kb_intersection_compute_constant(intersection, constant);
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
            } else {
                {
                    SubLObject idx = do_constants_table();
                    SubLObject total = id_index_count(idx);
                    SubLObject sofar = ZERO_INTEGER;
                    SubLTrampolineFile.checkType($str_alt118$KB_Intersection___Examining_const, STRINGP);
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
                            noting_percent_progress_preamble($str_alt118$KB_Intersection___Examining_const);
                            if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                                {
                                    SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
                                    SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
                                    SubLObject constant = NIL;
                                    while (NIL != id) {
                                        constant = do_id_index_state_object(idx, $SKIP, id, state_var);
                                        if (NIL != do_id_index_id_and_object_validP(id, constant, $SKIP)) {
                                            note_percent_progress(sofar, total);
                                            sofar = add(sofar, ONE_INTEGER);
                                            kb_intersection_compute_constant(intersection, constant);
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
            return intersection;
        }
    }

    public static SubLObject kb_intersection_compute_constants(final SubLObject intersection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != compute_remote_image_old_constants_congruentP()) {
            kb_intersection_compute_congruent_old_constants(intersection);
            final SubLObject start = new_constant_suid_threshold();
            final SubLObject table_var = do_constants_table();
            final SubLObject total = subtract(id_index_next_id(table_var), start);
            SubLObject sofar = ZERO_INTEGER;
            final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($str138$KB_Intersection___Examining_new_c);
                    SubLObject end_var;
                    SubLObject end;
                    SubLObject id;
                    SubLObject constant;
                    for (end = end_var = id_index_next_id(table_var), id = NIL, id = start; !id.numGE(end_var); id = number_utilities.f_1X(id)) {
                        constant = id_index_lookup(table_var, id, UNPROVIDED);
                        if (NIL != constant) {
                            note_percent_progress(sofar, total);
                            sofar = add(sofar, ONE_INTEGER);
                            kb_intersection_compute_constant(intersection, constant);
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                $last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
        } else {
            final SubLObject idx = do_constants_table();
            final SubLObject mess = $str139$KB_Intersection___Examining_const;
            final SubLObject total = id_index_count(idx);
            SubLObject sofar = ZERO_INTEGER;
            assert NIL != stringp(mess) : "! stringp(mess) " + ("Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) ") + mess;
            final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble(mess);
                    final SubLObject idx_$11 = idx;
                    if (NIL == id_index_objects_empty_p(idx_$11, $SKIP)) {
                        final SubLObject idx_$12 = idx_$11;
                        if (NIL == id_index_dense_objects_empty_p(idx_$12, $SKIP)) {
                            final SubLObject vector_var = id_index_dense_objects(idx_$12);
                            final SubLObject backwardP_var = NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject id2;
                            SubLObject constant2;
                            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                id2 = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                constant2 = aref(vector_var, id2);
                                if ((NIL == id_index_tombstone_p(constant2)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                    if (NIL != id_index_tombstone_p(constant2)) {
                                        constant2 = $SKIP;
                                    }
                                    kb_intersection_compute_constant(intersection, constant2);
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                }
                            }
                        }
                        final SubLObject idx_$13 = idx_$11;
                        if ((NIL == id_index_sparse_objects_empty_p(idx_$13)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                            final SubLObject sparse = id_index_sparse_objects(idx_$13);
                            SubLObject id3 = id_index_sparse_id_threshold(idx_$13);
                            final SubLObject end_id = id_index_next_id(idx_$13);
                            final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                            while (id3.numL(end_id)) {
                                final SubLObject constant3 = gethash_without_values(id3, sparse, v_default);
                                if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(constant3))) {
                                    kb_intersection_compute_constant(intersection, constant3);
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                }
                                id3 = add(id3, ONE_INTEGER);
                            } 
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$11 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$11, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                $last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
        }
        return intersection;
    }

    public static final SubLObject kb_intersection_compute_congruent_old_constants_alt(SubLObject intersection) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject missing_remote_ids = compute_missing_old_constant_remote_ids();
                SubLObject missing_set = set_utilities.construct_set_from_list(missing_remote_ids, symbol_function(EQL), UNPROVIDED);
                SubLObject threshold = constant_index_manager.get_file_backed_constant_internal_id_threshold();
                SubLObject past_ids = NIL;
                SubLObject my_done = NIL;
                SubLObject idx = do_constants_table();
                SubLObject total = id_index_count(idx);
                SubLObject sofar = ZERO_INTEGER;
                SubLTrampolineFile.checkType($str_alt119$KB_Intersection___Examining_old_c, STRINGP);
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
                        noting_percent_progress_preamble($str_alt119$KB_Intersection___Examining_old_c);
                        if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                            {
                                SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
                                SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
                                SubLObject constant = NIL;
                                while ((NIL != id) && (NIL == my_done)) {
                                    constant = do_id_index_state_object(idx, $SKIP, id, state_var);
                                    if (NIL != do_id_index_id_and_object_validP(id, constant, $SKIP)) {
                                        note_percent_progress(sofar, total);
                                        sofar = add(sofar, ONE_INTEGER);
                                        {
                                            SubLObject past_ids_8 = numL(threshold, id);
                                            if (NIL == past_ids_8) {
                                                {
                                                    SubLObject remote_id = constants_high.constant_internal_id(constant);
                                                    if (NIL == set.set_memberP(remote_id, missing_set)) {
                                                        kb_intersection_add_constant(intersection, constant, remote_id);
                                                    }
                                                }
                                            }
                                            my_done = past_ids_8;
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
            return NIL;
        }
    }

    public static SubLObject kb_intersection_compute_congruent_old_constants(final SubLObject intersection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject missing_remote_ids = compute_missing_old_constant_remote_ids();
        final SubLObject missing_set = set_utilities.construct_set_from_list(missing_remote_ids, symbol_function(EQL), UNPROVIDED);
        final SubLObject threshold = new_constant_suid_threshold();
        final SubLObject past_ids = NIL;
        SubLObject my_done = NIL;
        final SubLObject idx = do_constants_table();
        final SubLObject mess = $str140$KB_Intersection___Examining_old_c;
        final SubLObject total = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "! stringp(mess) " + ("Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) ") + mess;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(mess);
                final SubLObject idx_$15 = idx;
                if (NIL == id_index_objects_empty_p(idx_$15, $SKIP)) {
                    final SubLObject idx_$16 = idx_$15;
                    if (NIL == id_index_dense_objects_empty_p(idx_$16, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$16);
                        final SubLObject backwardP_var = NIL;
                        final SubLObject length = length(vector_var);
                        SubLObject current;
                        final SubLObject datum = current = (NIL != backwardP_var) ? list(subtract(length, ONE_INTEGER), MINUS_ONE_INTEGER, MINUS_ONE_INTEGER) : list(ZERO_INTEGER, length, ONE_INTEGER);
                        SubLObject start = NIL;
                        SubLObject end = NIL;
                        SubLObject delta = NIL;
                        destructuring_bind_must_consp(current, datum, $list141);
                        start = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list141);
                        end = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list141);
                        delta = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            if (NIL == my_done) {
                                SubLObject end_var;
                                SubLObject id;
                                SubLObject constant;
                                SubLObject past_ids_$17;
                                SubLObject remote_id;
                                for (end_var = end, id = NIL, id = start; (NIL == my_done) && (NIL == subl_macros.do_numbers_endtest(id, delta, end_var)); id = add(id, delta)) {
                                    constant = aref(vector_var, id);
                                    if ((NIL == id_index_tombstone_p(constant)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                        if (NIL != id_index_tombstone_p(constant)) {
                                            constant = $SKIP;
                                        }
                                        past_ids_$17 = numL(threshold, id);
                                        if (NIL == past_ids_$17) {
                                            remote_id = constants_high.constant_internal_id(constant);
                                            if (NIL == set.set_memberP(remote_id, missing_set)) {
                                                kb_intersection_add_constant(intersection, constant, remote_id);
                                            }
                                        }
                                        my_done = past_ids_$17;
                                        sofar = add(sofar, ONE_INTEGER);
                                        note_percent_progress(sofar, total);
                                    }
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list141);
                        }
                    }
                    final SubLObject idx_$17 = idx_$15;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$17)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$17);
                        SubLObject id2 = id_index_sparse_id_threshold(idx_$17);
                        final SubLObject end_id = id_index_next_id(idx_$17);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (id2.numL(end_id) && (NIL == my_done)) {
                            final SubLObject constant2 = gethash_without_values(id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(constant2))) {
                                final SubLObject past_ids_$18 = numL(threshold, id2);
                                if (NIL == past_ids_$18) {
                                    final SubLObject remote_id2 = constants_high.constant_internal_id(constant2);
                                    if (NIL == set.set_memberP(remote_id2, missing_set)) {
                                        kb_intersection_add_constant(intersection, constant2, remote_id2);
                                    }
                                }
                                my_done = past_ids_$18;
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            id2 = add(id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$20 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$20, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject kb_intersection_compute_constant_alt(SubLObject intersection, SubLObject constant) {
        {
            SubLObject remote_id = compute_constant_remote_id(constant);
            if (NIL != remote_id) {
                kb_intersection_add_constant(intersection, constant, remote_id);
            }
        }
        return NIL;
    }

    public static SubLObject kb_intersection_compute_constant(final SubLObject intersection, final SubLObject constant) {
        final SubLObject remote_id = compute_constant_remote_id(constant);
        if (NIL != remote_id) {
            kb_intersection_add_constant(intersection, constant, remote_id);
        }
        return NIL;
    }

    public static final SubLObject kb_intersection_compute_narts_alt(SubLObject intersection) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != compute_remote_image_old_narts_congruentP()) {
                kb_intersection_compute_congruent_old_narts(intersection);
                {
                    SubLObject start = add(ONE_INTEGER, nart_handles.get_file_backed_nart_internal_id_threshold());
                    SubLObject idx = nart_handles.do_narts_table();
                    SubLObject total = id_index_count(idx);
                    SubLObject sofar = ZERO_INTEGER;
                    SubLTrampolineFile.checkType($str_alt120$KB_Intersection___Examining_new_n, STRINGP);
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
                            noting_percent_progress_preamble($str_alt120$KB_Intersection___Examining_new_n);
                            if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                                {
                                    SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
                                    SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
                                    SubLObject nart = NIL;
                                    while (NIL != id) {
                                        nart = do_id_index_state_object(idx, $SKIP, id, state_var);
                                        if (NIL != do_id_index_id_and_object_validP(id, nart, $SKIP)) {
                                            note_percent_progress(sofar, total);
                                            sofar = add(sofar, ONE_INTEGER);
                                            if (!id.numL(start)) {
                                                kb_intersection_compute_nart(intersection, nart);
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
            } else {
                {
                    SubLObject idx = nart_handles.do_narts_table();
                    SubLObject total = id_index_count(idx);
                    SubLObject sofar = ZERO_INTEGER;
                    SubLTrampolineFile.checkType($str_alt121$KB_Intersection___Examining_narts, STRINGP);
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
                            noting_percent_progress_preamble($str_alt121$KB_Intersection___Examining_narts);
                            if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                                {
                                    SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
                                    SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
                                    SubLObject nart = NIL;
                                    while (NIL != id) {
                                        nart = do_id_index_state_object(idx, $SKIP, id, state_var);
                                        if (NIL != do_id_index_id_and_object_validP(id, nart, $SKIP)) {
                                            note_percent_progress(sofar, total);
                                            sofar = add(sofar, ONE_INTEGER);
                                            kb_intersection_compute_nart(intersection, nart);
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
            return intersection;
        }
    }

    public static SubLObject kb_intersection_compute_narts(final SubLObject intersection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != compute_remote_image_old_narts_congruentP()) {
            kb_intersection_compute_congruent_old_narts(intersection);
            final SubLObject start = nart_handles.new_nart_id_threshold();
            final SubLObject table_var = nart_handles.do_narts_table();
            final SubLObject total = subtract(id_index_next_id(table_var), start);
            SubLObject sofar = ZERO_INTEGER;
            final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($str142$KB_Intersection___Examining_new_n);
                    SubLObject end_var;
                    SubLObject end;
                    SubLObject id;
                    SubLObject nart;
                    for (end = end_var = id_index_next_id(table_var), id = NIL, id = start; !id.numGE(end_var); id = number_utilities.f_1X(id)) {
                        nart = id_index_lookup(table_var, id, UNPROVIDED);
                        if (NIL != nart) {
                            note_percent_progress(sofar, total);
                            sofar = add(sofar, ONE_INTEGER);
                            kb_intersection_compute_nart(intersection, nart);
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$21 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$21, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                $last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
        } else {
            final SubLObject idx = nart_handles.do_narts_table();
            final SubLObject mess = $str143$KB_Intersection___Examining_narts;
            final SubLObject total = id_index_count(idx);
            SubLObject sofar = ZERO_INTEGER;
            assert NIL != stringp(mess) : "! stringp(mess) " + ("Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) ") + mess;
            final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble(mess);
                    final SubLObject idx_$22 = idx;
                    if (NIL == id_index_objects_empty_p(idx_$22, $SKIP)) {
                        final SubLObject idx_$23 = idx_$22;
                        if (NIL == id_index_dense_objects_empty_p(idx_$23, $SKIP)) {
                            final SubLObject vector_var = id_index_dense_objects(idx_$23);
                            final SubLObject backwardP_var = NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject id2;
                            SubLObject nart2;
                            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                id2 = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                nart2 = aref(vector_var, id2);
                                if ((NIL == id_index_tombstone_p(nart2)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                    if (NIL != id_index_tombstone_p(nart2)) {
                                        nart2 = $SKIP;
                                    }
                                    kb_intersection_compute_nart(intersection, nart2);
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                }
                            }
                        }
                        final SubLObject idx_$24 = idx_$22;
                        if ((NIL == id_index_sparse_objects_empty_p(idx_$24)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                            final SubLObject sparse = id_index_sparse_objects(idx_$24);
                            SubLObject id3 = id_index_sparse_id_threshold(idx_$24);
                            final SubLObject end_id = id_index_next_id(idx_$24);
                            final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                            while (id3.numL(end_id)) {
                                final SubLObject nart3 = gethash_without_values(id3, sparse, v_default);
                                if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(nart3))) {
                                    kb_intersection_compute_nart(intersection, nart3);
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                }
                                id3 = add(id3, ONE_INTEGER);
                            } 
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$22 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$22, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                $last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
        }
        return intersection;
    }

    public static final SubLObject kb_intersection_compute_congruent_old_narts_alt(SubLObject intersection) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject missing_remote_ids = compute_missing_old_nart_remote_ids();
                SubLObject missing_set = set_utilities.construct_set_from_list(missing_remote_ids, symbol_function(EQL), UNPROVIDED);
                SubLObject threshold = nart_handles.get_file_backed_nart_internal_id_threshold();
                SubLObject past_ids = NIL;
                SubLObject my_done = NIL;
                SubLObject idx = nart_handles.do_narts_table();
                SubLObject total = id_index_count(idx);
                SubLObject sofar = ZERO_INTEGER;
                SubLTrampolineFile.checkType($str_alt122$KB_Intersection___Examining_old_n, STRINGP);
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
                        noting_percent_progress_preamble($str_alt122$KB_Intersection___Examining_old_n);
                        if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                            {
                                SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
                                SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
                                SubLObject nart = NIL;
                                while ((NIL != id) && (NIL == my_done)) {
                                    nart = do_id_index_state_object(idx, $SKIP, id, state_var);
                                    if (NIL != do_id_index_id_and_object_validP(id, nart, $SKIP)) {
                                        note_percent_progress(sofar, total);
                                        sofar = add(sofar, ONE_INTEGER);
                                        {
                                            SubLObject past_ids_9 = numL(threshold, id);
                                            if (NIL == past_ids_9) {
                                                {
                                                    SubLObject remote_id = nart_handles.nart_id(nart);
                                                    if (NIL == set.set_memberP(remote_id, missing_set)) {
                                                        kb_intersection_add_nart(intersection, nart, remote_id);
                                                    }
                                                }
                                            }
                                            my_done = past_ids_9;
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
            return NIL;
        }
    }

    public static SubLObject kb_intersection_compute_congruent_old_narts(final SubLObject intersection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject missing_remote_ids = compute_missing_old_nart_remote_ids();
        final SubLObject missing_set = set_utilities.construct_set_from_list(missing_remote_ids, symbol_function(EQL), UNPROVIDED);
        final SubLObject threshold = nart_handles.new_nart_id_threshold();
        final SubLObject past_ids = NIL;
        SubLObject my_done = NIL;
        final SubLObject idx = nart_handles.do_narts_table();
        final SubLObject mess = $str144$KB_Intersection___Examining_old_n;
        final SubLObject total = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "! stringp(mess) " + ("Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) ") + mess;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(mess);
                final SubLObject idx_$26 = idx;
                if (NIL == id_index_objects_empty_p(idx_$26, $SKIP)) {
                    final SubLObject idx_$27 = idx_$26;
                    if (NIL == id_index_dense_objects_empty_p(idx_$27, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$27);
                        final SubLObject backwardP_var = NIL;
                        final SubLObject length = length(vector_var);
                        SubLObject current;
                        final SubLObject datum = current = (NIL != backwardP_var) ? list(subtract(length, ONE_INTEGER), MINUS_ONE_INTEGER, MINUS_ONE_INTEGER) : list(ZERO_INTEGER, length, ONE_INTEGER);
                        SubLObject start = NIL;
                        SubLObject end = NIL;
                        SubLObject delta = NIL;
                        destructuring_bind_must_consp(current, datum, $list141);
                        start = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list141);
                        end = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list141);
                        delta = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            if (NIL == my_done) {
                                SubLObject end_var;
                                SubLObject id;
                                SubLObject nart;
                                SubLObject past_ids_$28;
                                SubLObject remote_id;
                                for (end_var = end, id = NIL, id = start; (NIL == my_done) && (NIL == subl_macros.do_numbers_endtest(id, delta, end_var)); id = add(id, delta)) {
                                    nart = aref(vector_var, id);
                                    if ((NIL == id_index_tombstone_p(nart)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                        if (NIL != id_index_tombstone_p(nart)) {
                                            nart = $SKIP;
                                        }
                                        past_ids_$28 = numL(threshold, id);
                                        if (NIL == past_ids_$28) {
                                            remote_id = nart_handles.nart_id(nart);
                                            if (NIL == set.set_memberP(remote_id, missing_set)) {
                                                kb_intersection_add_nart(intersection, nart, remote_id);
                                            }
                                        }
                                        my_done = past_ids_$28;
                                        sofar = add(sofar, ONE_INTEGER);
                                        note_percent_progress(sofar, total);
                                    }
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list141);
                        }
                    }
                    final SubLObject idx_$28 = idx_$26;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$28)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$28);
                        SubLObject id2 = id_index_sparse_id_threshold(idx_$28);
                        final SubLObject end_id = id_index_next_id(idx_$28);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (id2.numL(end_id) && (NIL == my_done)) {
                            final SubLObject nart2 = gethash_without_values(id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(nart2))) {
                                final SubLObject past_ids_$29 = numL(threshold, id2);
                                if (NIL == past_ids_$29) {
                                    final SubLObject remote_id2 = nart_handles.nart_id(nart2);
                                    if (NIL == set.set_memberP(remote_id2, missing_set)) {
                                        kb_intersection_add_nart(intersection, nart2, remote_id2);
                                    }
                                }
                                my_done = past_ids_$29;
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            id2 = add(id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$31 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$31, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject kb_intersection_compute_nart_alt(SubLObject intersection, SubLObject nart) {
        if (NIL == kb_intersection_nart_impossibleP(intersection, nart)) {
            {
                SubLObject remote_id = compute_nart_remote_id(nart);
                if (NIL != remote_id) {
                    kb_intersection_add_nart(intersection, nart, remote_id);
                }
            }
        }
        return NIL;
    }

    public static SubLObject kb_intersection_compute_nart(final SubLObject intersection, final SubLObject nart) {
        if (NIL == kb_intersection_nart_impossibleP(intersection, nart)) {
            final SubLObject remote_id = compute_nart_remote_id(nart);
            if (NIL != remote_id) {
                kb_intersection_add_nart(intersection, nart, remote_id);
            }
        }
        return NIL;
    }

    public static final SubLObject kb_intersection_compute_assertions_alt(SubLObject intersection) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != compute_remote_image_old_assertions_congruentP()) {
                kb_intersection_compute_congruent_old_assertions(intersection);
                {
                    SubLObject start = add(ONE_INTEGER, assertion_handles.get_file_backed_assertion_internal_id_threshold());
                    SubLObject idx = assertion_handles.do_assertions_table();
                    SubLObject total = id_index_count(idx);
                    SubLObject sofar = ZERO_INTEGER;
                    SubLTrampolineFile.checkType($str_alt123$KB_Intersection___Examining_new_a, STRINGP);
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
                            noting_percent_progress_preamble($str_alt123$KB_Intersection___Examining_new_a);
                            if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                                {
                                    SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
                                    SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
                                    SubLObject assertion = NIL;
                                    while (NIL != id) {
                                        assertion = do_id_index_state_object(idx, $SKIP, id, state_var);
                                        if (NIL != do_id_index_id_and_object_validP(id, assertion, $SKIP)) {
                                            note_percent_progress(sofar, total);
                                            sofar = add(sofar, ONE_INTEGER);
                                            if (!id.numL(start)) {
                                                kb_intersection_compute_assertion(intersection, assertion);
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
            } else {
                {
                    SubLObject idx = assertion_handles.do_assertions_table();
                    SubLObject total = id_index_count(idx);
                    SubLObject sofar = ZERO_INTEGER;
                    SubLTrampolineFile.checkType($str_alt124$KB_Intersection___Examining_asser, STRINGP);
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
                            noting_percent_progress_preamble($str_alt124$KB_Intersection___Examining_asser);
                            if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                                {
                                    SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
                                    SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
                                    SubLObject assertion = NIL;
                                    while (NIL != id) {
                                        assertion = do_id_index_state_object(idx, $SKIP, id, state_var);
                                        if (NIL != do_id_index_id_and_object_validP(id, assertion, $SKIP)) {
                                            note_percent_progress(sofar, total);
                                            sofar = add(sofar, ONE_INTEGER);
                                            kb_intersection_compute_assertion(intersection, assertion);
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
            return intersection;
        }
    }

    public static SubLObject kb_intersection_compute_assertions(final SubLObject intersection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != compute_remote_image_old_assertions_congruentP()) {
            kb_intersection_compute_congruent_old_assertions(intersection);
            final SubLObject start = assertion_handles.get_file_backed_assertion_internal_id_threshold();
            final SubLObject table_var = assertion_handles.do_assertions_table();
            final SubLObject total = subtract(id_index_next_id(table_var), start);
            SubLObject sofar = ZERO_INTEGER;
            final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($str145$KB_Intersection___Examining_new_a);
                    SubLObject end_var;
                    SubLObject end;
                    SubLObject id;
                    SubLObject assertion;
                    for (end = end_var = id_index_next_id(table_var), id = NIL, id = start; !id.numGE(end_var); id = number_utilities.f_1X(id)) {
                        assertion = id_index_lookup(table_var, id, UNPROVIDED);
                        if (NIL != assertion) {
                            note_percent_progress(sofar, total);
                            sofar = add(sofar, ONE_INTEGER);
                            kb_intersection_compute_assertion(intersection, assertion);
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$32 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$32, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                $last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
        } else {
            final SubLObject idx = assertion_handles.do_assertions_table();
            final SubLObject mess = $str146$KB_Intersection___Examining_asser;
            final SubLObject total = id_index_count(idx);
            SubLObject sofar = ZERO_INTEGER;
            assert NIL != stringp(mess) : "! stringp(mess) " + ("Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) ") + mess;
            final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble(mess);
                    final SubLObject idx_$33 = idx;
                    if (NIL == id_index_objects_empty_p(idx_$33, $SKIP)) {
                        final SubLObject idx_$34 = idx_$33;
                        if (NIL == id_index_dense_objects_empty_p(idx_$34, $SKIP)) {
                            final SubLObject vector_var = id_index_dense_objects(idx_$34);
                            final SubLObject backwardP_var = NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject a_id;
                            SubLObject a_handle;
                            SubLObject assertion2;
                            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                a_handle = aref(vector_var, a_id);
                                if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                    if (NIL != id_index_tombstone_p(a_handle)) {
                                        a_handle = $SKIP;
                                    }
                                    assertion2 = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                    kb_intersection_compute_assertion(intersection, assertion2);
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                }
                            }
                        }
                        final SubLObject idx_$35 = idx_$33;
                        if ((NIL == id_index_sparse_objects_empty_p(idx_$35)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                            final SubLObject sparse = id_index_sparse_objects(idx_$35);
                            SubLObject a_id2 = id_index_sparse_id_threshold(idx_$35);
                            final SubLObject end_id = id_index_next_id(idx_$35);
                            final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                            while (a_id2.numL(end_id)) {
                                final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                                if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                    final SubLObject assertion3 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                    kb_intersection_compute_assertion(intersection, assertion3);
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                }
                                a_id2 = add(a_id2, ONE_INTEGER);
                            } 
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$33 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$33, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                $last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
        }
        return intersection;
    }

    public static final SubLObject kb_intersection_compute_congruent_old_assertions_alt(SubLObject intersection) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject missing_remote_ids = compute_missing_old_assertion_remote_ids();
                SubLObject missing_set = set_utilities.construct_set_from_list(missing_remote_ids, symbol_function(EQL), UNPROVIDED);
                SubLObject threshold = assertion_handles.get_file_backed_assertion_internal_id_threshold();
                SubLObject past_ids = NIL;
                SubLObject my_done = NIL;
                SubLObject idx = assertion_handles.do_assertions_table();
                SubLObject total = id_index_count(idx);
                SubLObject sofar = ZERO_INTEGER;
                SubLTrampolineFile.checkType($str_alt125$KB_Intersection___Examining_old_a, STRINGP);
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
                        noting_percent_progress_preamble($str_alt125$KB_Intersection___Examining_old_a);
                        if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                            {
                                SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
                                SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
                                SubLObject assertion = NIL;
                                while ((NIL != id) && (NIL == my_done)) {
                                    assertion = do_id_index_state_object(idx, $SKIP, id, state_var);
                                    if (NIL != do_id_index_id_and_object_validP(id, assertion, $SKIP)) {
                                        note_percent_progress(sofar, total);
                                        sofar = add(sofar, ONE_INTEGER);
                                        {
                                            SubLObject past_ids_10 = numL(threshold, id);
                                            if (NIL == past_ids_10) {
                                                {
                                                    SubLObject remote_id = assertion_handles.assertion_id(assertion);
                                                    if (NIL == set.set_memberP(remote_id, missing_set)) {
                                                        kb_intersection_add_assertion(intersection, assertion, remote_id);
                                                    }
                                                }
                                            }
                                            my_done = past_ids_10;
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
            return NIL;
        }
    }

    public static SubLObject kb_intersection_compute_congruent_old_assertions(final SubLObject intersection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject missing_remote_ids = compute_missing_old_assertion_remote_ids();
        final SubLObject missing_set = set_utilities.construct_set_from_list(missing_remote_ids, symbol_function(EQL), UNPROVIDED);
        final SubLObject threshold = assertion_handles.get_file_backed_assertion_internal_id_threshold();
        final SubLObject past_ids = NIL;
        SubLObject my_done = NIL;
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = $str147$KB_Intersection___Examining_old_a;
        final SubLObject total = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "! stringp(mess) " + ("Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) ") + mess;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(mess);
                final SubLObject idx_$37 = idx;
                if (NIL == id_index_objects_empty_p(idx_$37, $SKIP)) {
                    final SubLObject idx_$38 = idx_$37;
                    if (NIL == id_index_dense_objects_empty_p(idx_$38, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$38);
                        final SubLObject backwardP_var = NIL;
                        final SubLObject length = length(vector_var);
                        SubLObject current;
                        final SubLObject datum = current = (NIL != backwardP_var) ? list(subtract(length, ONE_INTEGER), MINUS_ONE_INTEGER, MINUS_ONE_INTEGER) : list(ZERO_INTEGER, length, ONE_INTEGER);
                        SubLObject start = NIL;
                        SubLObject end = NIL;
                        SubLObject delta = NIL;
                        destructuring_bind_must_consp(current, datum, $list141);
                        start = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list141);
                        end = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list141);
                        delta = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            if (NIL == my_done) {
                                SubLObject end_var;
                                SubLObject id;
                                SubLObject assertion;
                                SubLObject past_ids_$39;
                                SubLObject remote_id;
                                for (end_var = end, id = NIL, id = start; (NIL == my_done) && (NIL == subl_macros.do_numbers_endtest(id, delta, end_var)); id = add(id, delta)) {
                                    assertion = aref(vector_var, id);
                                    if ((NIL == id_index_tombstone_p(assertion)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                        if (NIL != id_index_tombstone_p(assertion)) {
                                            assertion = $SKIP;
                                        }
                                        past_ids_$39 = numL(threshold, id);
                                        if (NIL == past_ids_$39) {
                                            remote_id = assertion_handles.assertion_id(assertion);
                                            if (NIL == set.set_memberP(remote_id, missing_set)) {
                                                kb_intersection_add_assertion(intersection, assertion, remote_id);
                                            }
                                        }
                                        my_done = past_ids_$39;
                                        sofar = add(sofar, ONE_INTEGER);
                                        note_percent_progress(sofar, total);
                                    }
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list141);
                        }
                    }
                    final SubLObject idx_$39 = idx_$37;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$39)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$39);
                        SubLObject id2 = id_index_sparse_id_threshold(idx_$39);
                        final SubLObject end_id = id_index_next_id(idx_$39);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (id2.numL(end_id) && (NIL == my_done)) {
                            final SubLObject assertion2 = gethash_without_values(id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(assertion2))) {
                                final SubLObject past_ids_$40 = numL(threshold, id2);
                                if (NIL == past_ids_$40) {
                                    final SubLObject remote_id2 = assertion_handles.assertion_id(assertion2);
                                    if (NIL == set.set_memberP(remote_id2, missing_set)) {
                                        kb_intersection_add_assertion(intersection, assertion2, remote_id2);
                                    }
                                }
                                my_done = past_ids_$40;
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            id2 = add(id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$42 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$42, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject kb_intersection_compute_assertion_alt(SubLObject intersection, SubLObject assertion) {
        if (NIL == kb_intersection_assertion_impossibleP(intersection, assertion)) {
            {
                SubLObject remote_id = compute_assertion_remote_id(assertion);
                if (NIL != remote_id) {
                    kb_intersection_add_assertion(intersection, assertion, remote_id);
                }
            }
        }
        return NIL;
    }

    public static SubLObject kb_intersection_compute_assertion(final SubLObject intersection, final SubLObject assertion) {
        if (NIL == kb_intersection_assertion_impossibleP(intersection, assertion)) {
            final SubLObject remote_id = compute_assertion_remote_id(assertion);
            if (NIL != remote_id) {
                kb_intersection_add_assertion(intersection, assertion, remote_id);
            }
        }
        return NIL;
    }

    public static final SubLObject kb_intersection_compute_deductions_alt(SubLObject intersection) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != compute_remote_image_old_deductions_congruentP()) {
                kb_intersection_compute_congruent_old_deductions(intersection);
                {
                    SubLObject start = add(ONE_INTEGER, deduction_handles.get_file_backed_deduction_internal_id_threshold());
                    SubLObject idx = deduction_handles.do_deductions_table();
                    SubLObject total = id_index_count(idx);
                    SubLObject sofar = ZERO_INTEGER;
                    SubLTrampolineFile.checkType($str_alt126$KB_Intersection___Examining_new_d, STRINGP);
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
                            noting_percent_progress_preamble($str_alt126$KB_Intersection___Examining_new_d);
                            if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                                {
                                    SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
                                    SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
                                    SubLObject deduction = NIL;
                                    while (NIL != id) {
                                        deduction = do_id_index_state_object(idx, $SKIP, id, state_var);
                                        if (NIL != do_id_index_id_and_object_validP(id, deduction, $SKIP)) {
                                            note_percent_progress(sofar, total);
                                            sofar = add(sofar, ONE_INTEGER);
                                            if (!id.numL(start)) {
                                                kb_intersection_compute_deduction(intersection, deduction);
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
            } else {
                {
                    SubLObject idx = deduction_handles.do_deductions_table();
                    SubLObject total = id_index_count(idx);
                    SubLObject sofar = ZERO_INTEGER;
                    SubLTrampolineFile.checkType($str_alt127$KB_Intersection___Examining_deduc, STRINGP);
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
                            noting_percent_progress_preamble($str_alt127$KB_Intersection___Examining_deduc);
                            if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                                {
                                    SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
                                    SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
                                    SubLObject deduction = NIL;
                                    while (NIL != id) {
                                        deduction = do_id_index_state_object(idx, $SKIP, id, state_var);
                                        if (NIL != do_id_index_id_and_object_validP(id, deduction, $SKIP)) {
                                            note_percent_progress(sofar, total);
                                            sofar = add(sofar, ONE_INTEGER);
                                            if (NIL != deduction_handles.valid_deduction(deduction, T)) {
                                                kb_intersection_compute_deduction(intersection, deduction);
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
            return intersection;
        }
    }

    public static SubLObject kb_intersection_compute_deductions(final SubLObject intersection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != compute_remote_image_old_deductions_congruentP()) {
            kb_intersection_compute_congruent_old_deductions(intersection);
            final SubLObject start = deduction_handles.get_file_backed_deduction_internal_id_threshold();
            final SubLObject table_var = deduction_handles.do_deductions_table();
            final SubLObject total = subtract(id_index_next_id(table_var), start);
            SubLObject sofar = ZERO_INTEGER;
            final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($str148$KB_Intersection___Examining_new_d);
                    SubLObject end_var;
                    SubLObject end;
                    SubLObject id;
                    SubLObject deduction;
                    for (end = end_var = id_index_next_id(table_var), id = NIL, id = start; !id.numGE(end_var); id = number_utilities.f_1X(id)) {
                        deduction = id_index_lookup(table_var, id, UNPROVIDED);
                        if (NIL != deduction) {
                            note_percent_progress(sofar, total);
                            sofar = add(sofar, ONE_INTEGER);
                            kb_intersection_compute_deduction(intersection, deduction);
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$43 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$43, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                $last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
        } else {
            final SubLObject idx = deduction_handles.do_deductions_table();
            final SubLObject mess = $str149$KB_Intersection___Examining_deduc;
            final SubLObject total = id_index_count(idx);
            SubLObject sofar = ZERO_INTEGER;
            assert NIL != stringp(mess) : "! stringp(mess) " + ("Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) ") + mess;
            final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble(mess);
                    final SubLObject idx_$44 = idx;
                    if (NIL == id_index_objects_empty_p(idx_$44, $SKIP)) {
                        final SubLObject idx_$45 = idx_$44;
                        if (NIL == id_index_dense_objects_empty_p(idx_$45, $SKIP)) {
                            final SubLObject vector_var = id_index_dense_objects(idx_$45);
                            final SubLObject backwardP_var = NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject d_id;
                            SubLObject d_handle;
                            SubLObject deduction2;
                            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                d_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                d_handle = aref(vector_var, d_id);
                                if ((NIL == id_index_tombstone_p(d_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                    if (NIL != id_index_tombstone_p(d_handle)) {
                                        d_handle = $SKIP;
                                    }
                                    deduction2 = deduction_handles.resolve_deduction_id_value_pair(d_id, d_handle);
                                    if (NIL != deduction_handles.valid_deduction(deduction2, T)) {
                                        kb_intersection_compute_deduction(intersection, deduction2);
                                    }
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                }
                            }
                        }
                        final SubLObject idx_$46 = idx_$44;
                        if ((NIL == id_index_sparse_objects_empty_p(idx_$46)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                            final SubLObject sparse = id_index_sparse_objects(idx_$46);
                            SubLObject d_id2 = id_index_sparse_id_threshold(idx_$46);
                            final SubLObject end_id = id_index_next_id(idx_$46);
                            final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                            while (d_id2.numL(end_id)) {
                                final SubLObject d_handle2 = gethash_without_values(d_id2, sparse, v_default);
                                if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(d_handle2))) {
                                    final SubLObject deduction3 = deduction_handles.resolve_deduction_id_value_pair(d_id2, d_handle2);
                                    if (NIL != deduction_handles.valid_deduction(deduction3, T)) {
                                        kb_intersection_compute_deduction(intersection, deduction3);
                                    }
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                }
                                d_id2 = add(d_id2, ONE_INTEGER);
                            } 
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$44 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$44, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                $last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
        }
        return intersection;
    }

    public static final SubLObject kb_intersection_compute_congruent_old_deductions_alt(SubLObject intersection) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject missing_remote_ids = compute_missing_old_deduction_remote_ids();
                SubLObject missing_set = set_utilities.construct_set_from_list(missing_remote_ids, symbol_function(EQL), UNPROVIDED);
                SubLObject threshold = deduction_handles.get_file_backed_deduction_internal_id_threshold();
                SubLObject past_ids = NIL;
                SubLObject my_done = NIL;
                SubLObject idx = deduction_handles.do_deductions_table();
                SubLObject total = id_index_count(idx);
                SubLObject sofar = ZERO_INTEGER;
                SubLTrampolineFile.checkType($str_alt128$KB_Intersection___Examining_old_d, STRINGP);
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
                        noting_percent_progress_preamble($str_alt128$KB_Intersection___Examining_old_d);
                        if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                            {
                                SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
                                SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
                                SubLObject deduction = NIL;
                                while ((NIL != id) && (NIL == my_done)) {
                                    deduction = do_id_index_state_object(idx, $SKIP, id, state_var);
                                    if (NIL != do_id_index_id_and_object_validP(id, deduction, $SKIP)) {
                                        note_percent_progress(sofar, total);
                                        sofar = add(sofar, ONE_INTEGER);
                                        {
                                            SubLObject past_ids_11 = numL(threshold, id);
                                            if (NIL == past_ids_11) {
                                                {
                                                    SubLObject remote_id = deduction_handles.deduction_id(deduction);
                                                    if (NIL == set.set_memberP(remote_id, missing_set)) {
                                                        kb_intersection_add_deduction(intersection, deduction, remote_id);
                                                    }
                                                }
                                            }
                                            my_done = past_ids_11;
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
            return NIL;
        }
    }

    public static SubLObject kb_intersection_compute_congruent_old_deductions(final SubLObject intersection) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject missing_remote_ids = compute_missing_old_deduction_remote_ids();
        final SubLObject missing_set = set_utilities.construct_set_from_list(missing_remote_ids, symbol_function(EQL), UNPROVIDED);
        final SubLObject threshold = deduction_handles.get_file_backed_deduction_internal_id_threshold();
        final SubLObject past_ids = NIL;
        SubLObject my_done = NIL;
        final SubLObject idx = deduction_handles.do_deductions_table();
        final SubLObject mess = $str150$KB_Intersection___Examining_old_d;
        final SubLObject total = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "! stringp(mess) " + ("Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) ") + mess;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(mess);
                final SubLObject idx_$48 = idx;
                if (NIL == id_index_objects_empty_p(idx_$48, $SKIP)) {
                    final SubLObject idx_$49 = idx_$48;
                    if (NIL == id_index_dense_objects_empty_p(idx_$49, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$49);
                        final SubLObject backwardP_var = NIL;
                        final SubLObject length = length(vector_var);
                        SubLObject current;
                        final SubLObject datum = current = (NIL != backwardP_var) ? list(subtract(length, ONE_INTEGER), MINUS_ONE_INTEGER, MINUS_ONE_INTEGER) : list(ZERO_INTEGER, length, ONE_INTEGER);
                        SubLObject start = NIL;
                        SubLObject end = NIL;
                        SubLObject delta = NIL;
                        destructuring_bind_must_consp(current, datum, $list141);
                        start = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list141);
                        end = current.first();
                        current = current.rest();
                        destructuring_bind_must_consp(current, datum, $list141);
                        delta = current.first();
                        current = current.rest();
                        if (NIL == current) {
                            if (NIL == my_done) {
                                SubLObject end_var;
                                SubLObject id;
                                SubLObject deduction;
                                SubLObject past_ids_$50;
                                SubLObject remote_id;
                                for (end_var = end, id = NIL, id = start; (NIL == my_done) && (NIL == subl_macros.do_numbers_endtest(id, delta, end_var)); id = add(id, delta)) {
                                    deduction = aref(vector_var, id);
                                    if ((NIL == id_index_tombstone_p(deduction)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                        if (NIL != id_index_tombstone_p(deduction)) {
                                            deduction = $SKIP;
                                        }
                                        past_ids_$50 = numL(threshold, id);
                                        if (NIL == past_ids_$50) {
                                            remote_id = deduction_handles.deduction_id(deduction);
                                            if (NIL == set.set_memberP(remote_id, missing_set)) {
                                                kb_intersection_add_deduction(intersection, deduction, remote_id);
                                            }
                                        }
                                        my_done = past_ids_$50;
                                        sofar = add(sofar, ONE_INTEGER);
                                        note_percent_progress(sofar, total);
                                    }
                                }
                            }
                        } else {
                            cdestructuring_bind_error(datum, $list141);
                        }
                    }
                    final SubLObject idx_$50 = idx_$48;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$50)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$50);
                        SubLObject id2 = id_index_sparse_id_threshold(idx_$50);
                        final SubLObject end_id = id_index_next_id(idx_$50);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (id2.numL(end_id) && (NIL == my_done)) {
                            final SubLObject deduction2 = gethash_without_values(id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(deduction2))) {
                                final SubLObject past_ids_$51 = numL(threshold, id2);
                                if (NIL == past_ids_$51) {
                                    final SubLObject remote_id2 = deduction_handles.deduction_id(deduction2);
                                    if (NIL == set.set_memberP(remote_id2, missing_set)) {
                                        kb_intersection_add_deduction(intersection, deduction2, remote_id2);
                                    }
                                }
                                my_done = past_ids_$51;
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            id2 = add(id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$53 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$53, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject kb_intersection_compute_deduction_alt(SubLObject intersection, SubLObject deduction) {
        if (NIL == kb_intersection_deduction_impossibleP(intersection, deduction)) {
            {
                SubLObject remote_id = compute_deduction_remote_id(deduction);
                if (NIL != remote_id) {
                    kb_intersection_add_deduction(intersection, deduction, remote_id);
                }
            }
        }
        return NIL;
    }

    public static SubLObject kb_intersection_compute_deduction(final SubLObject intersection, final SubLObject deduction) {
        if (NIL == kb_intersection_deduction_impossibleP(intersection, deduction)) {
            final SubLObject remote_id = compute_deduction_remote_id(deduction);
            if (NIL != remote_id) {
                kb_intersection_add_deduction(intersection, deduction, remote_id);
            }
        }
        return NIL;
    }

    public static final SubLObject kb_difference_compute_alt(SubLObject difference) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(difference, KB_DIFFERENCE_P);
            {
                SubLObject v_remote_image = kb_difference_remote_image(difference);
                SubLObject connection = remote_image.new_remote_image_connection(v_remote_image);
                try {
                    remote_image.open_remote_image_connection(connection);
                    {
                        SubLObject _prev_bind_0 = remote_image.$current_remote_image_connection$.currentBinding(thread);
                        SubLObject _prev_bind_1 = $kb_compare_common_symbols$.currentBinding(thread);
                        try {
                            remote_image.$current_remote_image_connection$.bind(connection, thread);
                            $kb_compare_common_symbols$.bind($kb_compare_common_symbols$.getDynamicValue(thread), thread);
                            set_kb_compare_connection_common_symbols();
                            {
                                SubLObject _prev_bind_0_12 = $cfasl_common_symbols$.currentBinding(thread);
                                try {
                                    $cfasl_common_symbols$.bind(NIL, thread);
                                    cfasl_set_common_symbols($kb_compare_common_symbols$.getDynamicValue(thread));
                                    kb_difference_compute_renamed_constants(difference);
                                    kb_difference_compute_constants(difference);
                                    kb_difference_compute_narts(difference);
                                    kb_difference_compute_assertions(difference);
                                    kb_difference_compute_deductions(difference);
                                } finally {
                                    $cfasl_common_symbols$.rebind(_prev_bind_0_12, thread);
                                }
                            }
                        } finally {
                            $kb_compare_common_symbols$.rebind(_prev_bind_1, thread);
                            remote_image.$current_remote_image_connection$.rebind(_prev_bind_0, thread);
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            remote_image.close_remote_image_connection(connection);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return difference;
        }
    }

    public static SubLObject kb_difference_compute(final SubLObject difference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != kb_difference_p(difference) : "! kb_compare.kb_difference_p(difference) " + ("kb_compare.kb_difference_p(difference) " + "CommonSymbols.NIL != kb_compare.kb_difference_p(difference) ") + difference;
        final SubLObject v_remote_image = kb_difference_remote_image(difference);
        final SubLObject connection = remote_image.new_remote_image_connection(v_remote_image);
        try {
            remote_image.open_remote_image_connection(connection);
            final SubLObject _prev_bind_0 = remote_image.$current_remote_image_connection$.currentBinding(thread);
            final SubLObject _prev_bind_2 = $kb_compare_common_symbols$.currentBinding(thread);
            try {
                remote_image.$current_remote_image_connection$.bind(connection, thread);
                $kb_compare_common_symbols$.bind($kb_compare_common_symbols$.getDynamicValue(thread), thread);
                set_kb_compare_connection_common_symbols();
                final SubLObject _prev_bind_0_$54 = $cfasl_common_symbols$.currentBinding(thread);
                try {
                    $cfasl_common_symbols$.bind(NIL, thread);
                    cfasl_set_common_symbols($kb_compare_common_symbols$.getDynamicValue(thread));
                    kb_difference_compute_renamed_constants(difference);
                    kb_difference_compute_constants(difference);
                    kb_difference_compute_narts(difference);
                    kb_difference_compute_assertions(difference);
                    kb_difference_compute_deductions(difference);
                } finally {
                    $cfasl_common_symbols$.rebind(_prev_bind_0_$54, thread);
                }
            } finally {
                $kb_compare_common_symbols$.rebind(_prev_bind_2, thread);
                remote_image.$current_remote_image_connection$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                remote_image.close_remote_image_connection(connection);
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return difference;
    }

    public static final SubLObject kb_difference_compute_renamed_constants_alt(SubLObject difference) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject intersection = kb_difference_common_intersection(difference);
                SubLObject message = $str_alt129$KB_DIFFERENCE___Examining_constan;
                SubLObject idx = kb_intersection_constant_index(intersection);
                SubLObject total = id_index_count(idx);
                SubLObject sofar = ZERO_INTEGER;
                SubLTrampolineFile.checkType(message, STRINGP);
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
                        noting_percent_progress_preamble(message);
                        if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                            {
                                SubLObject internal_id = do_id_index_next_id(idx, NIL, NIL, NIL);
                                SubLObject state_var = do_id_index_next_state(idx, NIL, internal_id, NIL);
                                SubLObject remote_id = NIL;
                                while (NIL != internal_id) {
                                    remote_id = do_id_index_state_object(idx, $SKIP, internal_id, state_var);
                                    if (NIL != do_id_index_id_and_object_validP(internal_id, remote_id, $SKIP)) {
                                        note_percent_progress(sofar, total);
                                        sofar = add(sofar, ONE_INTEGER);
                                        {
                                            SubLObject constant = constants_high.find_constant_by_internal_id(internal_id);
                                            SubLObject remote_id_13 = kb_intersection_constant_remote_id(intersection, constant);
                                            SubLObject remote_name = compute_constant_remote_name(remote_id_13);
                                            if (!remote_name.equal(constants_high.constant_name(constant))) {
                                                kb_difference_add_renamed_constant(difference, constant, remote_name);
                                            }
                                        }
                                    }
                                    internal_id = do_id_index_next_id(idx, NIL, internal_id, state_var);
                                    state_var = do_id_index_next_state(idx, NIL, internal_id, state_var);
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
            return NIL;
        }
    }

    public static SubLObject kb_difference_compute_renamed_constants(final SubLObject difference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject intersection = kb_difference_common_intersection(difference);
        final SubLObject message = $str151$KB_DIFFERENCE___Examining_constan;
        final SubLObject idx = kb_intersection_constant_index(intersection);
        final SubLObject mess = message;
        final SubLObject total = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "! stringp(mess) " + ("Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) ") + mess;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(mess);
                final SubLObject idx_$55 = idx;
                if (NIL == id_index_objects_empty_p(idx_$55, $SKIP)) {
                    final SubLObject idx_$56 = idx_$55;
                    if (NIL == id_index_dense_objects_empty_p(idx_$56, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$56);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject internal_id;
                        SubLObject remote_id;
                        SubLObject constant;
                        SubLObject remote_id_$57;
                        SubLObject remote_name;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            internal_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            remote_id = aref(vector_var, internal_id);
                            if ((NIL == id_index_tombstone_p(remote_id)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(remote_id)) {
                                    remote_id = $SKIP;
                                }
                                constant = constants_high.find_constant_by_internal_id(internal_id);
                                remote_id_$57 = kb_intersection_constant_remote_id(intersection, constant);
                                remote_name = compute_constant_remote_name(remote_id_$57);
                                if (!remote_name.equal(constants_high.constant_name(constant))) {
                                    kb_difference_add_renamed_constant(difference, constant, remote_name);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$57 = idx_$55;
                    if (NIL == id_index_sparse_objects_empty_p(idx_$57)) {
                        final SubLObject cdohash_table = id_index_sparse_objects(idx_$57);
                        SubLObject internal_id2 = NIL;
                        SubLObject remote_id2 = NIL;
                        final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                        try {
                            while (iteratorHasNext(cdohash_iterator)) {
                                final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                internal_id2 = getEntryKey(cdohash_entry);
                                remote_id2 = getEntryValue(cdohash_entry);
                                final SubLObject constant2 = constants_high.find_constant_by_internal_id(internal_id2);
                                final SubLObject remote_id_$58 = kb_intersection_constant_remote_id(intersection, constant2);
                                final SubLObject remote_name2 = compute_constant_remote_name(remote_id_$58);
                                if (!remote_name2.equal(constants_high.constant_name(constant2))) {
                                    kb_difference_add_renamed_constant(difference, constant2, remote_name2);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            } 
                        } finally {
                            releaseEntrySetIterator(cdohash_iterator);
                        }
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$60 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$60, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject kb_difference_compute_constants_alt(SubLObject difference) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject intersection = kb_difference_common_intersection(difference);
                SubLObject idx = do_constants_table();
                SubLObject total = id_index_count(idx);
                SubLObject sofar = ZERO_INTEGER;
                SubLTrampolineFile.checkType($str_alt130$KB_DIFFERENCE___Examining_constan, STRINGP);
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
                        noting_percent_progress_preamble($str_alt130$KB_DIFFERENCE___Examining_constan);
                        if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                            {
                                SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
                                SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
                                SubLObject constant = NIL;
                                while (NIL != id) {
                                    constant = do_id_index_state_object(idx, $SKIP, id, state_var);
                                    if (NIL != do_id_index_id_and_object_validP(id, constant, $SKIP)) {
                                        note_percent_progress(sofar, total);
                                        sofar = add(sofar, ONE_INTEGER);
                                        if (NIL == kb_intersection_constantP(intersection, constant)) {
                                            kb_difference_add_constant(difference, constant);
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
            return NIL;
        }
    }

    public static SubLObject kb_difference_compute_constants(final SubLObject difference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject intersection = kb_difference_common_intersection(difference);
        final SubLObject idx = do_constants_table();
        final SubLObject mess = $str152$KB_DIFFERENCE___Examining_constan;
        final SubLObject total = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "! stringp(mess) " + ("Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) ") + mess;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(mess);
                final SubLObject idx_$61 = idx;
                if (NIL == id_index_objects_empty_p(idx_$61, $SKIP)) {
                    final SubLObject idx_$62 = idx_$61;
                    if (NIL == id_index_dense_objects_empty_p(idx_$62, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$62);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject id;
                        SubLObject constant;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            constant = aref(vector_var, id);
                            if ((NIL == id_index_tombstone_p(constant)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(constant)) {
                                    constant = $SKIP;
                                }
                                if (NIL == kb_intersection_constantP(intersection, constant)) {
                                    kb_difference_add_constant(difference, constant);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$63 = idx_$61;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$63)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$63);
                        SubLObject id2 = id_index_sparse_id_threshold(idx_$63);
                        final SubLObject end_id = id_index_next_id(idx_$63);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (id2.numL(end_id)) {
                            final SubLObject constant2 = gethash_without_values(id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(constant2))) {
                                if (NIL == kb_intersection_constantP(intersection, constant2)) {
                                    kb_difference_add_constant(difference, constant2);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            id2 = add(id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$64 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$64, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject kb_difference_compute_narts_alt(SubLObject difference) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject intersection = kb_difference_common_intersection(difference);
                SubLObject idx = nart_handles.do_narts_table();
                SubLObject total = id_index_count(idx);
                SubLObject sofar = ZERO_INTEGER;
                SubLTrampolineFile.checkType($str_alt131$KB_DIFFERENCE___Examining_narts, STRINGP);
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
                        noting_percent_progress_preamble($str_alt131$KB_DIFFERENCE___Examining_narts);
                        if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                            {
                                SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
                                SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
                                SubLObject nart = NIL;
                                while (NIL != id) {
                                    nart = do_id_index_state_object(idx, $SKIP, id, state_var);
                                    if (NIL != do_id_index_id_and_object_validP(id, nart, $SKIP)) {
                                        note_percent_progress(sofar, total);
                                        sofar = add(sofar, ONE_INTEGER);
                                        if (NIL == kb_intersection_nartP(intersection, nart)) {
                                            kb_difference_add_nart(difference, nart);
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
            return NIL;
        }
    }

    public static SubLObject kb_difference_compute_narts(final SubLObject difference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject intersection = kb_difference_common_intersection(difference);
        final SubLObject idx = nart_handles.do_narts_table();
        final SubLObject mess = $str153$KB_DIFFERENCE___Examining_narts;
        final SubLObject total = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "! stringp(mess) " + ("Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) ") + mess;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(mess);
                final SubLObject idx_$65 = idx;
                if (NIL == id_index_objects_empty_p(idx_$65, $SKIP)) {
                    final SubLObject idx_$66 = idx_$65;
                    if (NIL == id_index_dense_objects_empty_p(idx_$66, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$66);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject id;
                        SubLObject nart;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            nart = aref(vector_var, id);
                            if ((NIL == id_index_tombstone_p(nart)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(nart)) {
                                    nart = $SKIP;
                                }
                                if (NIL == kb_intersection_nartP(intersection, nart)) {
                                    kb_difference_add_nart(difference, nart);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$67 = idx_$65;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$67)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$67);
                        SubLObject id2 = id_index_sparse_id_threshold(idx_$67);
                        final SubLObject end_id = id_index_next_id(idx_$67);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (id2.numL(end_id)) {
                            final SubLObject nart2 = gethash_without_values(id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(nart2))) {
                                if (NIL == kb_intersection_nartP(intersection, nart2)) {
                                    kb_difference_add_nart(difference, nart2);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            id2 = add(id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$68 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$68, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(T);

    static private final SubLList $list_alt1 = list(makeSymbol("ASSERTION-ID-FROM-RECIPE"), makeSymbol("DEDUCTION-ID-FROM-RECIPE"), makeSymbol("CONSTANT-INTERNAL-ID-FROM-EXTERNAL-ID"), makeSymbol("CONSTANT-NAME-FROM-INTERNAL-ID"), makeSymbol("NART-ID-FROM-RECIPE"));

    static private final SubLList $list_alt2 = list(makeSymbol("REMOTE-IMAGE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt5 = list(list(makeSymbol("*KB-COMPARE-COMMON-SYMBOLS*"), makeSymbol("*KB-COMPARE-COMMON-SYMBOLS*")));

    static private final SubLList $list_alt6 = list(makeSymbol("SET-KB-COMPARE-CONNECTION-COMMON-SYMBOLS"));

    static private final SubLList $list_alt17 = list(list(makeSymbol("ERROR"), makeString("hack")));

    static private final SubLList $list_alt20 = list(makeSymbol("REMOTE-IMAGE"), makeSymbol("CONSTANT-INDEX"), makeSymbol("NART-INDEX"), makeSymbol("ASSERTION-INDEX"), makeSymbol("DEDUCTION-INDEX"));

    static private final SubLList $list_alt21 = list(makeKeyword("REMOTE-IMAGE"), makeKeyword("CONSTANT-INDEX"), makeKeyword("NART-INDEX"), makeKeyword("ASSERTION-INDEX"), makeKeyword("DEDUCTION-INDEX"));

    static private final SubLList $list_alt22 = list(makeSymbol("KB-INTRSCT-REMOTE-IMAGE"), makeSymbol("KB-INTRSCT-CONSTANT-INDEX"), makeSymbol("KB-INTRSCT-NART-INDEX"), makeSymbol("KB-INTRSCT-ASSERTION-INDEX"), makeSymbol("KB-INTRSCT-DEDUCTION-INDEX"));

    static private final SubLList $list_alt23 = list(makeSymbol("_CSETF-KB-INTRSCT-REMOTE-IMAGE"), makeSymbol("_CSETF-KB-INTRSCT-CONSTANT-INDEX"), makeSymbol("_CSETF-KB-INTRSCT-NART-INDEX"), makeSymbol("_CSETF-KB-INTRSCT-ASSERTION-INDEX"), makeSymbol("_CSETF-KB-INTRSCT-DEDUCTION-INDEX"));

    static private final SubLString $str_alt41$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    public static final SubLObject kb_difference_compute_assertions_alt(SubLObject difference) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject intersection = kb_difference_common_intersection(difference);
                SubLObject idx = assertion_handles.do_assertions_table();
                SubLObject total = id_index_count(idx);
                SubLObject sofar = ZERO_INTEGER;
                SubLTrampolineFile.checkType($str_alt132$KB_DIFFERENCE___Examining_asserti, STRINGP);
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
                        noting_percent_progress_preamble($str_alt132$KB_DIFFERENCE___Examining_asserti);
                        if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                            {
                                SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
                                SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
                                SubLObject assertion = NIL;
                                while (NIL != id) {
                                    assertion = do_id_index_state_object(idx, $SKIP, id, state_var);
                                    if (NIL != do_id_index_id_and_object_validP(id, assertion, $SKIP)) {
                                        note_percent_progress(sofar, total);
                                        sofar = add(sofar, ONE_INTEGER);
                                        if (NIL == kb_intersection_assertionP(intersection, assertion)) {
                                            kb_difference_add_assertion(difference, assertion);
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
            return NIL;
        }
    }

    public static SubLObject kb_difference_compute_assertions(final SubLObject difference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject intersection = kb_difference_common_intersection(difference);
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = $str154$KB_DIFFERENCE___Examining_asserti;
        final SubLObject total = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "! stringp(mess) " + ("Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) ") + mess;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(mess);
                final SubLObject idx_$69 = idx;
                if (NIL == id_index_objects_empty_p(idx_$69, $SKIP)) {
                    final SubLObject idx_$70 = idx_$69;
                    if (NIL == id_index_dense_objects_empty_p(idx_$70, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$70);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject a_id;
                        SubLObject a_handle;
                        SubLObject assertion;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            a_handle = aref(vector_var, a_id);
                            if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(a_handle)) {
                                    a_handle = $SKIP;
                                }
                                assertion = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                if (NIL == kb_intersection_assertionP(intersection, assertion)) {
                                    kb_difference_add_assertion(difference, assertion);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$71 = idx_$69;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$71)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$71);
                        SubLObject a_id2 = id_index_sparse_id_threshold(idx_$71);
                        final SubLObject end_id = id_index_next_id(idx_$71);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (a_id2.numL(end_id)) {
                            final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                final SubLObject assertion2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                if (NIL == kb_intersection_assertionP(intersection, assertion2)) {
                                    kb_difference_add_assertion(difference, assertion2);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            a_id2 = add(a_id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$72 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$72, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    static private final SubLString $str_alt42$_KB_INTERSECTION_to__a_ = makeString("<KB-INTERSECTION to ~a>");

    static private final SubLList $list_alt51 = list(list(makeSymbol("CONSTANT"), makeSymbol("INTERSECTION"), makeSymbol("&KEY"), makeSymbol("PROGRESS-MESSAGE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt52 = list(makeKeyword("PROGRESS-MESSAGE"));

    static private final SubLSymbol $sym55$INTERNAL_ID = makeUninternedSymbol("INTERNAL-ID");

    static private final SubLSymbol $sym56$REMOTE_ID = makeUninternedSymbol("REMOTE-ID");

    static private final SubLList $list_alt66 = list(makeSymbol("COMMON-INTERSECTION"), makeSymbol("RENAMED-CONSTANTS"), makeSymbol("CONSTANTS"), makeSymbol("NARTS"), makeSymbol("ASSERTIONS"), makeSymbol("DEDUCTIONS"));

    static private final SubLList $list_alt67 = list(makeKeyword("COMMON-INTERSECTION"), makeKeyword("RENAMED-CONSTANTS"), makeKeyword("CONSTANTS"), makeKeyword("NARTS"), makeKeyword("ASSERTIONS"), makeKeyword("DEDUCTIONS"));

    static private final SubLList $list_alt68 = list(makeSymbol("KB-DIFF-COMMON-INTERSECTION"), makeSymbol("KB-DIFF-RENAMED-CONSTANTS"), makeSymbol("KB-DIFF-CONSTANTS"), makeSymbol("KB-DIFF-NARTS"), makeSymbol("KB-DIFF-ASSERTIONS"), makeSymbol("KB-DIFF-DEDUCTIONS"));

    static private final SubLList $list_alt69 = list(makeSymbol("_CSETF-KB-DIFF-COMMON-INTERSECTION"), makeSymbol("_CSETF-KB-DIFF-RENAMED-CONSTANTS"), makeSymbol("_CSETF-KB-DIFF-CONSTANTS"), makeSymbol("_CSETF-KB-DIFF-NARTS"), makeSymbol("_CSETF-KB-DIFF-ASSERTIONS"), makeSymbol("_CSETF-KB-DIFF-DEDUCTIONS"));

    static private final SubLString $str_alt90$_KB_DIFFERENCE_using__a_ = makeString("<KB-DIFFERENCE using ~a>");

    static private final SubLList $list_alt101 = list(list(makeSymbol("CONSTANT"), makeSymbol("REMOTE-NAME"), makeSymbol("DIFFERENCE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt102 = list($DONE);

    static private final SubLList $list_alt105 = list(list(makeSymbol("CONSTANT"), makeSymbol("DIFFERENCE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLObject kb_difference_compute_deductions_alt(SubLObject difference) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject intersection = kb_difference_common_intersection(difference);
                SubLObject idx = deduction_handles.do_deductions_table();
                SubLObject total = id_index_count(idx);
                SubLObject sofar = ZERO_INTEGER;
                SubLTrampolineFile.checkType($str_alt133$KB_DIFFERENCE___Examining_deducti, STRINGP);
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
                        noting_percent_progress_preamble($str_alt133$KB_DIFFERENCE___Examining_deducti);
                        if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                            {
                                SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
                                SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
                                SubLObject deduction = NIL;
                                while (NIL != id) {
                                    deduction = do_id_index_state_object(idx, $SKIP, id, state_var);
                                    if (NIL != do_id_index_id_and_object_validP(id, deduction, $SKIP)) {
                                        note_percent_progress(sofar, total);
                                        sofar = add(sofar, ONE_INTEGER);
                                        if (NIL == kb_intersection_deductionP(intersection, deduction)) {
                                            kb_difference_add_deduction(difference, deduction);
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
            return NIL;
        }
    }

    public static SubLObject kb_difference_compute_deductions(final SubLObject difference) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject intersection = kb_difference_common_intersection(difference);
        final SubLObject idx = deduction_handles.do_deductions_table();
        final SubLObject mess = $str155$KB_DIFFERENCE___Examining_deducti;
        final SubLObject total = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "! stringp(mess) " + ("Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) ") + mess;
        final SubLObject _prev_bind_0 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble(mess);
                final SubLObject idx_$73 = idx;
                if (NIL == id_index_objects_empty_p(idx_$73, $SKIP)) {
                    final SubLObject idx_$74 = idx_$73;
                    if (NIL == id_index_dense_objects_empty_p(idx_$74, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$74);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject d_id;
                        SubLObject d_handle;
                        SubLObject deduction;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            d_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            d_handle = aref(vector_var, d_id);
                            if ((NIL == id_index_tombstone_p(d_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(d_handle)) {
                                    d_handle = $SKIP;
                                }
                                deduction = deduction_handles.resolve_deduction_id_value_pair(d_id, d_handle);
                                if (NIL == kb_intersection_deductionP(intersection, deduction)) {
                                    kb_difference_add_deduction(difference, deduction);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$75 = idx_$73;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$75)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$75);
                        SubLObject d_id2 = id_index_sparse_id_threshold(idx_$75);
                        final SubLObject end_id = id_index_next_id(idx_$75);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (d_id2.numL(end_id)) {
                            final SubLObject d_handle2 = gethash_without_values(d_id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(d_handle2))) {
                                final SubLObject deduction2 = deduction_handles.resolve_deduction_id_value_pair(d_id2, d_handle2);
                                if (NIL == kb_intersection_deductionP(intersection, deduction2)) {
                                    kb_difference_add_deduction(difference, deduction2);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            d_id2 = add(d_id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$76 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$76, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    static private final SubLList $list_alt107 = list(list(makeSymbol("NART"), makeSymbol("DIFFERENCE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt108 = list(list(makeSymbol("ASSERTION"), makeSymbol("DIFFERENCE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt109 = list(list(makeSymbol("DEDUCTION"), makeSymbol("DIFFERENCE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym111$_ = makeSymbol("<");

    static private final SubLString $str_alt116$KB_Intersection___Examining_new_c = makeString("KB Intersection : Examining new constants");

    static private final SubLString $str_alt118$KB_Intersection___Examining_const = makeString("KB Intersection : Examining constants");

    static private final SubLString $str_alt119$KB_Intersection___Examining_old_c = makeString("KB Intersection : Examining old constants (congruent)");

    static private final SubLString $str_alt120$KB_Intersection___Examining_new_n = makeString("KB Intersection : Examining new narts");

    static private final SubLString $str_alt121$KB_Intersection___Examining_narts = makeString("KB Intersection : Examining narts");

    static private final SubLString $str_alt122$KB_Intersection___Examining_old_n = makeString("KB Intersection : Examining old narts (congruent)");

    static private final SubLString $str_alt123$KB_Intersection___Examining_new_a = makeString("KB Intersection : Examining new assertions");

    static private final SubLString $str_alt124$KB_Intersection___Examining_asser = makeString("KB Intersection : Examining assertions");

    static private final SubLString $str_alt125$KB_Intersection___Examining_old_a = makeString("KB Intersection : Examining old assertions (congruent)");

    static private final SubLString $str_alt126$KB_Intersection___Examining_new_d = makeString("KB Intersection : Examining new deductions");

    static private final SubLString $str_alt127$KB_Intersection___Examining_deduc = makeString("KB Intersection : Examining deductions");

    static private final SubLString $str_alt128$KB_Intersection___Examining_old_d = makeString("KB Intersection : Examining old deductions (congruent)");

    static private final SubLString $str_alt129$KB_DIFFERENCE___Examining_constan = makeString("KB-DIFFERENCE : Examining constant renames");

    static private final SubLString $str_alt130$KB_DIFFERENCE___Examining_constan = makeString("KB-DIFFERENCE : Examining constants");

    static private final SubLString $str_alt131$KB_DIFFERENCE___Examining_narts = makeString("KB-DIFFERENCE : Examining narts");

    static private final SubLString $str_alt132$KB_DIFFERENCE___Examining_asserti = makeString("KB-DIFFERENCE : Examining assertions");

    static private final SubLString $str_alt133$KB_DIFFERENCE___Examining_deducti = makeString("KB-DIFFERENCE : Examining deductions");

    static private final SubLString $str_alt134$___No_Difference___ = makeString(";; No Difference!~%");

    static private final SubLString $str_alt135$___Renamed_Constants____ = makeString(";; Renamed Constants :~%");

    static private final SubLString $str_alt136$_S_renamed_to__S__ = makeString("~S renamed to ~S~%");

    static private final SubLString $str_alt137$___Constants____ = makeString(";; Constants :~%");

    static private final SubLString $str_alt138$_S__ = makeString("~S~%");

    static private final SubLString $str_alt139$___Narts____ = makeString(";; Narts :~%");

    static private final SubLString $str_alt140$___Assertions____ = makeString(";; Assertions :~%");

    static private final SubLString $str_alt141$___Deductions____ = makeString(";; Deductions :~%");

    static private final SubLString $str_alt142$_S__supports___ = makeString("~S~%supports:~%");

    static private final SubLSymbol $sym143$_ = makeSymbol("=");

    static private final SubLList $list_alt144 = list(list(makeSymbol("OLD-CONSTANT-COUNT")));

    static private final SubLList $list_alt145 = list(makeSymbol("MISSING-OLD-CONSTANT-INTERNAL-IDS"));

    static private final SubLList $list_alt148 = list(list(makeSymbol("OLD-NART-COUNT")));

    static private final SubLList $list_alt149 = list(makeSymbol("MISSING-OLD-NART-IDS"));

    static private final SubLList $list_alt151 = list(list(makeSymbol("OLD-ASSERTION-COUNT")));

    static private final SubLList $list_alt152 = list(makeSymbol("MISSING-OLD-ASSERTION-IDS"));

    static private final SubLList $list_alt154 = list(list(makeSymbol("OLD-DEDUCTION-COUNT")));

    static private final SubLList $list_alt155 = list(makeSymbol("MISSING-OLD-DEDUCTION-IDS"));

    /**
     * Compute and return the kb-intersection between this Cyc image and
     * the remote image accessible at MACHINE PORT via PROTOCOL.
     */
    @LispMethod(comment = "Compute and return the kb-intersection between this Cyc image and\r\nthe remote image accessible at MACHINE PORT via PROTOCOL.\nCompute and return the kb-intersection between this Cyc image and\nthe remote image accessible at MACHINE PORT via PROTOCOL.")
    public static final SubLObject compute_remote_image_kb_intersection_alt(SubLObject machine, SubLObject port, SubLObject protocol) {
        if (protocol == UNPROVIDED) {
            protocol = $CFASL;
        }
        {
            SubLObject v_remote_image = remote_image.new_remote_image(machine, port, protocol);
            SubLObject intersection = kb_intersection_compute(new_kb_intersection(v_remote_image));
            return intersection;
        }
    }

    /**
     * Compute and return the kb-intersection between this Cyc image and
     * the remote image accessible at MACHINE PORT via PROTOCOL.
     */
    @LispMethod(comment = "Compute and return the kb-intersection between this Cyc image and\r\nthe remote image accessible at MACHINE PORT via PROTOCOL.\nCompute and return the kb-intersection between this Cyc image and\nthe remote image accessible at MACHINE PORT via PROTOCOL.")
    public static SubLObject compute_remote_image_kb_intersection(final SubLObject machine, final SubLObject port, SubLObject protocol) {
        if (protocol == UNPROVIDED) {
            protocol = $CFASL;
        }
        final SubLObject v_remote_image = remote_image.new_remote_image(machine, port, protocol);
        final SubLObject intersection = kb_intersection_compute(new_kb_intersection(v_remote_image));
        return intersection;
    }

    static private final SubLString $$$mapping_Cyc_assertions = makeString("mapping Cyc assertions");

    static private final SubLSymbol $sym159$ASSERTION_NOT_WFF_ = makeSymbol("ASSERTION-NOT-WFF?");

    /**
     * Compute and return the kb-difference between this Cyc image and
     * the remote image accessible at MACHINE PORT via PROTOCOL.
     */
    @LispMethod(comment = "Compute and return the kb-difference between this Cyc image and\r\nthe remote image accessible at MACHINE PORT via PROTOCOL.\nCompute and return the kb-difference between this Cyc image and\nthe remote image accessible at MACHINE PORT via PROTOCOL.")
    public static final SubLObject compute_remote_image_kb_difference_alt(SubLObject machine, SubLObject port, SubLObject protocol) {
        if (protocol == UNPROVIDED) {
            protocol = $CFASL;
        }
        {
            SubLObject intersection = compute_remote_image_kb_intersection(machine, port, protocol);
            SubLObject difference = kb_difference_compute(new_kb_difference(intersection));
            return difference;
        }
    }

    /**
     * Compute and return the kb-difference between this Cyc image and
     * the remote image accessible at MACHINE PORT via PROTOCOL.
     */
    @LispMethod(comment = "Compute and return the kb-difference between this Cyc image and\r\nthe remote image accessible at MACHINE PORT via PROTOCOL.\nCompute and return the kb-difference between this Cyc image and\nthe remote image accessible at MACHINE PORT via PROTOCOL.")
    public static SubLObject compute_remote_image_kb_difference(final SubLObject machine, final SubLObject port, SubLObject protocol) {
        if (protocol == UNPROVIDED) {
            protocol = $CFASL;
        }
        final SubLObject intersection = compute_remote_image_kb_intersection(machine, port, protocol);
        final SubLObject difference = kb_difference_compute(new_kb_difference(intersection));
        return difference;
    }

    static private final SubLString $str_alt161$__assertion__a__remotely__a_____a = makeString("~%assertion ~a (remotely ~a):~%~a~%is well-formed in this image but ill-formed on the remote image~%");

    /**
     * Display the kb-difference DIFFERENCE to STREAM.
     */
    @LispMethod(comment = "Display the kb-difference DIFFERENCE to STREAM.")
    public static final SubLObject show_kb_difference_alt(SubLObject difference, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        {
            SubLObject renamed_constants = kb_difference_all_renamed_constants(difference);
            SubLObject constants = kb_difference_all_constants(difference);
            SubLObject narts = kb_difference_all_narts(difference);
            SubLObject assertions = kb_difference_all_assertions(difference);
            SubLObject deductions = kb_difference_all_deductions(difference);
            if (!(((((NIL != renamed_constants) || (NIL != constants)) || (NIL != narts)) || (NIL != assertions)) || (NIL != deductions))) {
                format(stream, $str_alt134$___No_Difference___);
            } else {
                if (NIL != renamed_constants) {
                    format(stream, $str_alt135$___Renamed_Constants____);
                    {
                        SubLObject cdolist_list_var = renamed_constants;
                        SubLObject constant = NIL;
                        for (constant = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constant = cdolist_list_var.first()) {
                            {
                                SubLObject remote_name = kb_difference_constant_remote_name(difference, constant);
                                format(stream, $str_alt136$_S_renamed_to__S__, constant, remote_name);
                            }
                        }
                    }
                    terpri(stream);
                }
                if (NIL != constants) {
                    format(stream, $str_alt137$___Constants____);
                    {
                        SubLObject cdolist_list_var = constants;
                        SubLObject constant = NIL;
                        for (constant = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , constant = cdolist_list_var.first()) {
                            format(stream, $str_alt138$_S__, constant);
                        }
                    }
                    terpri(stream);
                }
                if (NIL != narts) {
                    format(stream, $str_alt139$___Narts____);
                    {
                        SubLObject cdolist_list_var = narts;
                        SubLObject nart = NIL;
                        for (nart = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , nart = cdolist_list_var.first()) {
                            format(stream, $str_alt138$_S__, nart);
                        }
                    }
                    terpri(stream);
                }
                if (NIL != assertions) {
                    format(stream, $str_alt140$___Assertions____);
                    {
                        SubLObject cdolist_list_var = assertions;
                        SubLObject assertion = NIL;
                        for (assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , assertion = cdolist_list_var.first()) {
                            format(stream, $str_alt138$_S__, assertion);
                        }
                    }
                    terpri(stream);
                }
                if (NIL != deductions) {
                    format(stream, $str_alt141$___Deductions____);
                    {
                        SubLObject cdolist_list_var = deductions;
                        SubLObject deduction = NIL;
                        for (deduction = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , deduction = cdolist_list_var.first()) {
                            {
                                SubLObject assertion = deductions_high.deduction_assertion(deduction);
                                format(stream, $str_alt142$_S__supports___, assertion);
                                {
                                    SubLObject cdolist_list_var_14 = deductions_high.deduction_supports(deduction);
                                    SubLObject support = NIL;
                                    for (support = cdolist_list_var_14.first(); NIL != cdolist_list_var_14; cdolist_list_var_14 = cdolist_list_var_14.rest() , support = cdolist_list_var_14.first()) {
                                        format(stream, $str_alt138$_S__, support);
                                    }
                                }
                                terpri(stream);
                            }
                        }
                    }
                }
            }
        }
        return difference;
    }

    /**
     * Display the kb-difference DIFFERENCE to STREAM.
     */
    @LispMethod(comment = "Display the kb-difference DIFFERENCE to STREAM.")
    public static SubLObject show_kb_difference(final SubLObject difference, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLObject renamed_constants = kb_difference_all_renamed_constants(difference);
        final SubLObject constants = kb_difference_all_constants(difference);
        final SubLObject narts = kb_difference_all_narts(difference);
        final SubLObject assertions = kb_difference_all_assertions(difference);
        final SubLObject deductions = kb_difference_all_deductions(difference);
        if (((((NIL == renamed_constants) && (NIL == constants)) && (NIL == narts)) && (NIL == assertions)) && (NIL == deductions)) {
            format(stream, $str156$___No_Difference___);
        } else {
            if (NIL != renamed_constants) {
                format(stream, $str157$___Renamed_Constants____);
                SubLObject cdolist_list_var = renamed_constants;
                SubLObject constant = NIL;
                constant = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject remote_name = kb_difference_constant_remote_name(difference, constant);
                    format(stream, $str158$_S_renamed_to__S__, constant, remote_name);
                    cdolist_list_var = cdolist_list_var.rest();
                    constant = cdolist_list_var.first();
                } 
                terpri(stream);
            }
            if (NIL != constants) {
                format(stream, $str159$___Constants____);
                SubLObject cdolist_list_var = constants;
                SubLObject constant = NIL;
                constant = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    format(stream, $str160$_S__, constant);
                    cdolist_list_var = cdolist_list_var.rest();
                    constant = cdolist_list_var.first();
                } 
                terpri(stream);
            }
            if (NIL != narts) {
                format(stream, $str161$___Narts____);
                SubLObject cdolist_list_var = narts;
                SubLObject nart = NIL;
                nart = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    format(stream, $str160$_S__, nart);
                    cdolist_list_var = cdolist_list_var.rest();
                    nart = cdolist_list_var.first();
                } 
                terpri(stream);
            }
            if (NIL != assertions) {
                format(stream, $str162$___Assertions____);
                SubLObject cdolist_list_var = assertions;
                SubLObject assertion = NIL;
                assertion = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    format(stream, $str160$_S__, assertion);
                    cdolist_list_var = cdolist_list_var.rest();
                    assertion = cdolist_list_var.first();
                } 
                terpri(stream);
            }
            if (NIL != deductions) {
                format(stream, $str163$___Deductions____);
                SubLObject cdolist_list_var = deductions;
                SubLObject deduction = NIL;
                deduction = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    final SubLObject supported_object = deductions_high.deduction_supported_object(deduction);
                    format(stream, $str164$_S__supports___, supported_object);
                    SubLObject cdolist_list_var_$77 = deductions_high.deduction_supports(deduction);
                    SubLObject support = NIL;
                    support = cdolist_list_var_$77.first();
                    while (NIL != cdolist_list_var_$77) {
                        format(stream, $str160$_S__, support);
                        cdolist_list_var_$77 = cdolist_list_var_$77.rest();
                        support = cdolist_list_var_$77.first();
                    } 
                    terpri(stream);
                    cdolist_list_var = cdolist_list_var.rest();
                    deduction = cdolist_list_var.first();
                } 
            }
        }
        return difference;
    }

    public static final SubLObject compute_remote_image_old_constants_congruentP_alt() {
        {
            SubLObject old_constant_count = old_constant_count();
            return remote_image.current_remote_image_connection_eval(listS($sym143$_, old_constant_count, $list_alt144));
        }
    }

    public static SubLObject compute_remote_image_old_constants_congruentP() {
        final SubLObject old_constant_count = old_constant_count();
        return remote_image.current_remote_image_connection_eval(listS($sym165$_, old_constant_count, $list166));
    }

    public static final SubLObject compute_missing_old_constant_remote_ids_alt() {
        return remote_image.current_remote_image_connection_eval($list_alt145);
    }

    public static SubLObject compute_missing_old_constant_remote_ids() {
        return remote_image.current_remote_image_connection_eval($list167);
    }

    public static final SubLObject compute_constant_remote_id_alt(SubLObject constant) {
        return remote_image.current_remote_image_connection_eval(list(CONSTANT_INTERNAL_ID_FROM_EXTERNAL_ID, list(QUOTE, constants_high.constant_external_id(constant))));
    }

    public static SubLObject compute_constant_remote_id(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject error = NIL;
        SubLObject result = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    result = remote_image.current_remote_image_connection_eval(list(CONSTANT_INTERNAL_ID_FROM_EXTERNAL_ID, list(QUOTE, constants_high.constant_external_id(constant))));
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (error.isString()) {
            Errors.error($str170$Could_not_compute_remote_ID_for__, constant, error);
        }
        return result;
    }

    public static final SubLObject compute_constant_remote_name_alt(SubLObject remote_id) {
        return remote_image.current_remote_image_connection_eval(list(CONSTANT_NAME_FROM_INTERNAL_ID, remote_id));
    }

    public static SubLObject compute_constant_remote_name(final SubLObject remote_id) {
        return remote_image.current_remote_image_connection_eval(list(CONSTANT_NAME_FROM_INTERNAL_ID, remote_id));
    }

    public static final SubLObject compute_remote_image_old_narts_congruentP_alt() {
        {
            SubLObject old_nart_count = nart_handles.old_nart_count();
            return remote_image.current_remote_image_connection_eval(listS($sym143$_, old_nart_count, $list_alt148));
        }
    }

    public static SubLObject compute_remote_image_old_narts_congruentP() {
        final SubLObject old_nart_count = nart_handles.old_nart_count();
        return remote_image.current_remote_image_connection_eval(listS($sym165$_, old_nart_count, $list172));
    }

    public static final SubLObject compute_missing_old_nart_remote_ids_alt() {
        return remote_image.current_remote_image_connection_eval($list_alt149);
    }

    public static SubLObject compute_missing_old_nart_remote_ids() {
        return remote_image.current_remote_image_connection_eval($list173);
    }

    public static final SubLObject compute_nart_remote_id_alt(SubLObject nart) {
        return remote_image.current_remote_image_connection_eval(list(NART_ID_FROM_RECIPE, list(QUOTE, narts_high.nart_hl_formula(nart))));
    }

    public static SubLObject compute_nart_remote_id(final SubLObject nart) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject error = NIL;
        SubLObject result = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    result = remote_image.current_remote_image_connection_eval(list(NART_ID_FROM_RECIPE, list(QUOTE, narts_high.nart_hl_formula(nart))));
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (error.isString()) {
            Errors.error($str170$Could_not_compute_remote_ID_for__, nart, error);
        }
        return result;
    }

    public static final SubLObject compute_remote_image_old_assertions_congruentP_alt() {
        {
            SubLObject old_assertion_count = assertion_handles.old_assertion_count();
            return remote_image.current_remote_image_connection_eval(listS($sym143$_, old_assertion_count, $list_alt151));
        }
    }

    public static SubLObject compute_remote_image_old_assertions_congruentP() {
        final SubLObject old_assertion_count = assertion_handles.old_assertion_count();
        return remote_image.current_remote_image_connection_eval(listS($sym165$_, old_assertion_count, $list175));
    }

    public static final SubLObject compute_missing_old_assertion_remote_ids_alt() {
        return remote_image.current_remote_image_connection_eval($list_alt152);
    }

    public static SubLObject compute_missing_old_assertion_remote_ids() {
        return remote_image.current_remote_image_connection_eval($list176);
    }

    public static final SubLObject compute_assertion_remote_id_alt(SubLObject assertion) {
        return remote_image.current_remote_image_connection_eval(list(ASSERTION_ID_FROM_RECIPE, list(QUOTE, assertions_high.assertion_cnf(assertion)), list(QUOTE, assertions_high.assertion_mt(assertion))));
    }

    public static SubLObject compute_assertion_remote_id(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject error = NIL;
        SubLObject result = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    result = remote_image.current_remote_image_connection_eval(list(ASSERTION_ID_FROM_RECIPE, list(QUOTE, assertions_high.assertion_cnf(assertion)), list(QUOTE, assertions_high.assertion_mt(assertion))));
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (error.isString()) {
            Errors.error($str170$Could_not_compute_remote_ID_for__, assertion, error);
        }
        return result;
    }

    public static final SubLObject compute_remote_image_old_deductions_congruentP_alt() {
        {
            SubLObject old_deduction_count = deduction_handles.old_deduction_count();
            return remote_image.current_remote_image_connection_eval(listS($sym143$_, old_deduction_count, $list_alt154));
        }
    }

    public static SubLObject compute_remote_image_old_deductions_congruentP() {
        final SubLObject old_deduction_count = deduction_handles.old_deduction_count();
        return remote_image.current_remote_image_connection_eval(listS($sym165$_, old_deduction_count, $list178));
    }

    public static final SubLObject compute_missing_old_deduction_remote_ids_alt() {
        return remote_image.current_remote_image_connection_eval($list_alt155);
    }

    public static SubLObject compute_missing_old_deduction_remote_ids() {
        return remote_image.current_remote_image_connection_eval($list179);
    }

    public static final SubLObject compute_deduction_remote_id_alt(SubLObject deduction) {
        return remote_image.current_remote_image_connection_eval(list(DEDUCTION_ID_FROM_RECIPE, deductions_high.deduction_assertion(deduction), list(QUOTE, deductions_high.deduction_supports(deduction)), arguments.argument_truth(deduction)));
    }

    public static SubLObject compute_deduction_remote_id(final SubLObject deduction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject error = NIL;
        SubLObject result = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    result = remote_image.current_remote_image_connection_eval(list(DEDUCTION_ID_FROM_RECIPE, list_utilities.quotify(deductions_high.deduction_supported_object(deduction)), list(QUOTE, deductions_high.deduction_supports(deduction)), arguments.argument_truth(deduction)));
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (error.isString()) {
            Errors.error($str170$Could_not_compute_remote_ID_for__, deduction, error);
        }
        return result;
    }

    public static final SubLObject declare_kb_compare_file_alt() {
        declareMacro("with_new_kb_compare_connection", "WITH-NEW-KB-COMPARE-CONNECTION");
        declareFunction("set_kb_compare_connection_common_symbols", "SET-KB-COMPARE-CONNECTION-COMMON-SYMBOLS", 0, 0, false);
        declareFunction("kb_intersection_print_function_trampoline", "KB-INTERSECTION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("kb_intersection_p", "KB-INTERSECTION-P", 1, 0, false);
        new com.cyc.cycjava.cycl.kb_compare.$kb_intersection_p$UnaryFunction();
        declareFunction("kb_intrsct_remote_image", "KB-INTRSCT-REMOTE-IMAGE", 1, 0, false);
        declareFunction("kb_intrsct_constant_index", "KB-INTRSCT-CONSTANT-INDEX", 1, 0, false);
        declareFunction("kb_intrsct_nart_index", "KB-INTRSCT-NART-INDEX", 1, 0, false);
        declareFunction("kb_intrsct_assertion_index", "KB-INTRSCT-ASSERTION-INDEX", 1, 0, false);
        declareFunction("kb_intrsct_deduction_index", "KB-INTRSCT-DEDUCTION-INDEX", 1, 0, false);
        declareFunction("_csetf_kb_intrsct_remote_image", "_CSETF-KB-INTRSCT-REMOTE-IMAGE", 2, 0, false);
        declareFunction("_csetf_kb_intrsct_constant_index", "_CSETF-KB-INTRSCT-CONSTANT-INDEX", 2, 0, false);
        declareFunction("_csetf_kb_intrsct_nart_index", "_CSETF-KB-INTRSCT-NART-INDEX", 2, 0, false);
        declareFunction("_csetf_kb_intrsct_assertion_index", "_CSETF-KB-INTRSCT-ASSERTION-INDEX", 2, 0, false);
        declareFunction("_csetf_kb_intrsct_deduction_index", "_CSETF-KB-INTRSCT-DEDUCTION-INDEX", 2, 0, false);
        declareFunction("make_kb_intersection", "MAKE-KB-INTERSECTION", 0, 1, false);
        declareFunction("print_kb_intersection", "PRINT-KB-INTERSECTION", 3, 0, false);
        declareFunction("new_kb_intersection", "NEW-KB-INTERSECTION", 1, 0, false);
        declareFunction("destroy_kb_intersection", "DESTROY-KB-INTERSECTION", 1, 0, false);
        declareFunction("kb_intersection_remote_image", "KB-INTERSECTION-REMOTE-IMAGE", 1, 0, false);
        declareFunction("kb_intersection_constant_index", "KB-INTERSECTION-CONSTANT-INDEX", 1, 0, false);
        declareFunction("kb_intersection_add_constant", "KB-INTERSECTION-ADD-CONSTANT", 3, 0, false);
        declareFunction("kb_intersection_add_nart", "KB-INTERSECTION-ADD-NART", 3, 0, false);
        declareFunction("kb_intersection_add_assertion", "KB-INTERSECTION-ADD-ASSERTION", 3, 0, false);
        declareFunction("kb_intersection_add_deduction", "KB-INTERSECTION-ADD-DEDUCTION", 3, 0, false);
        declareFunction("kb_intersection_remote_image_machine", "KB-INTERSECTION-REMOTE-IMAGE-MACHINE", 1, 0, false);
        declareFunction("kb_intersection_remote_image_port", "KB-INTERSECTION-REMOTE-IMAGE-PORT", 1, 0, false);
        declareFunction("kb_intersection_remote_image_protocol", "KB-INTERSECTION-REMOTE-IMAGE-PROTOCOL", 1, 0, false);
        declareFunction("kb_intersection_constantP", "KB-INTERSECTION-CONSTANT?", 2, 0, false);
        declareFunction("kb_intersection_constant_remote_id", "KB-INTERSECTION-CONSTANT-REMOTE-ID", 2, 0, false);
        declareFunction("kb_intersection_nartP", "KB-INTERSECTION-NART?", 2, 0, false);
        declareFunction("kb_intersection_nart_remote_id", "KB-INTERSECTION-NART-REMOTE-ID", 2, 0, false);
        declareFunction("kb_intersection_assertionP", "KB-INTERSECTION-ASSERTION?", 2, 0, false);
        declareFunction("kb_intersection_assertion_remote_id", "KB-INTERSECTION-ASSERTION-REMOTE-ID", 2, 0, false);
        declareFunction("kb_intersection_deductionP", "KB-INTERSECTION-DEDUCTION?", 2, 0, false);
        declareFunction("kb_intersection_deduction_remote_id", "KB-INTERSECTION-DEDUCTION-REMOTE-ID", 2, 0, false);
        declareMacro("do_kb_intersection_constants", "DO-KB-INTERSECTION-CONSTANTS");
        declareFunction("kb_intersection_nart_impossibleP", "KB-INTERSECTION-NART-IMPOSSIBLE?", 2, 0, false);
        declareFunction("kb_intersection_nart_impossible_int", "KB-INTERSECTION-NART-IMPOSSIBLE-INT", 1, 0, false);
        declareFunction("kb_intersection_assertion_impossibleP", "KB-INTERSECTION-ASSERTION-IMPOSSIBLE?", 2, 0, false);
        declareFunction("kb_intersection_assertion_impossible_int", "KB-INTERSECTION-ASSERTION-IMPOSSIBLE-INT", 1, 0, false);
        declareFunction("kb_intersection_deduction_impossibleP", "KB-INTERSECTION-DEDUCTION-IMPOSSIBLE?", 2, 0, false);
        declareFunction("kb_intersection_deduction_impossible_int", "KB-INTERSECTION-DEDUCTION-IMPOSSIBLE-INT", 1, 0, false);
        declareFunction("kb_difference_print_function_trampoline", "KB-DIFFERENCE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("kb_difference_p", "KB-DIFFERENCE-P", 1, 0, false);
        new com.cyc.cycjava.cycl.kb_compare.$kb_difference_p$UnaryFunction();
        declareFunction("kb_diff_common_intersection", "KB-DIFF-COMMON-INTERSECTION", 1, 0, false);
        declareFunction("kb_diff_renamed_constants", "KB-DIFF-RENAMED-CONSTANTS", 1, 0, false);
        declareFunction("kb_diff_constants", "KB-DIFF-CONSTANTS", 1, 0, false);
        declareFunction("kb_diff_narts", "KB-DIFF-NARTS", 1, 0, false);
        declareFunction("kb_diff_assertions", "KB-DIFF-ASSERTIONS", 1, 0, false);
        declareFunction("kb_diff_deductions", "KB-DIFF-DEDUCTIONS", 1, 0, false);
        declareFunction("_csetf_kb_diff_common_intersection", "_CSETF-KB-DIFF-COMMON-INTERSECTION", 2, 0, false);
        declareFunction("_csetf_kb_diff_renamed_constants", "_CSETF-KB-DIFF-RENAMED-CONSTANTS", 2, 0, false);
        declareFunction("_csetf_kb_diff_constants", "_CSETF-KB-DIFF-CONSTANTS", 2, 0, false);
        declareFunction("_csetf_kb_diff_narts", "_CSETF-KB-DIFF-NARTS", 2, 0, false);
        declareFunction("_csetf_kb_diff_assertions", "_CSETF-KB-DIFF-ASSERTIONS", 2, 0, false);
        declareFunction("_csetf_kb_diff_deductions", "_CSETF-KB-DIFF-DEDUCTIONS", 2, 0, false);
        declareFunction("make_kb_difference", "MAKE-KB-DIFFERENCE", 0, 1, false);
        declareFunction("print_kb_difference", "PRINT-KB-DIFFERENCE", 3, 0, false);
        declareFunction("new_kb_difference", "NEW-KB-DIFFERENCE", 1, 0, false);
        declareFunction("destroy_kb_difference", "DESTROY-KB-DIFFERENCE", 1, 0, false);
        declareFunction("kb_difference_common_intersection", "KB-DIFFERENCE-COMMON-INTERSECTION", 1, 0, false);
        declareFunction("kb_difference_renamed_constants", "KB-DIFFERENCE-RENAMED-CONSTANTS", 1, 0, false);
        declareFunction("kb_difference_constants", "KB-DIFFERENCE-CONSTANTS", 1, 0, false);
        declareFunction("kb_difference_narts", "KB-DIFFERENCE-NARTS", 1, 0, false);
        declareFunction("kb_difference_assertions", "KB-DIFFERENCE-ASSERTIONS", 1, 0, false);
        declareFunction("kb_difference_deductions", "KB-DIFFERENCE-DEDUCTIONS", 1, 0, false);
        declareMacro("do_kb_difference_renamed_constants", "DO-KB-DIFFERENCE-RENAMED-CONSTANTS");
        declareMacro("do_kb_difference_constants", "DO-KB-DIFFERENCE-CONSTANTS");
        declareMacro("do_kb_difference_narts", "DO-KB-DIFFERENCE-NARTS");
        declareMacro("do_kb_difference_assertions", "DO-KB-DIFFERENCE-ASSERTIONS");
        declareMacro("do_kb_difference_deductions", "DO-KB-DIFFERENCE-DEDUCTIONS");
        declareFunction("kb_difference_add_renamed_constant", "KB-DIFFERENCE-ADD-RENAMED-CONSTANT", 3, 0, false);
        declareFunction("kb_difference_add_constant", "KB-DIFFERENCE-ADD-CONSTANT", 2, 0, false);
        declareFunction("kb_difference_add_nart", "KB-DIFFERENCE-ADD-NART", 2, 0, false);
        declareFunction("kb_difference_add_assertion", "KB-DIFFERENCE-ADD-ASSERTION", 2, 0, false);
        declareFunction("kb_difference_add_deduction", "KB-DIFFERENCE-ADD-DEDUCTION", 2, 0, false);
        declareFunction("kb_difference_remote_image", "KB-DIFFERENCE-REMOTE-IMAGE", 1, 0, false);
        declareFunction("kb_difference_remote_image_machine", "KB-DIFFERENCE-REMOTE-IMAGE-MACHINE", 1, 0, false);
        declareFunction("kb_difference_remote_image_port", "KB-DIFFERENCE-REMOTE-IMAGE-PORT", 1, 0, false);
        declareFunction("kb_difference_remote_image_protocol", "KB-DIFFERENCE-REMOTE-IMAGE-PROTOCOL", 1, 0, false);
        declareFunction("kb_difference_constant_remote_name", "KB-DIFFERENCE-CONSTANT-REMOTE-NAME", 2, 0, false);
        declareFunction("kb_difference_all_renamed_constants", "KB-DIFFERENCE-ALL-RENAMED-CONSTANTS", 1, 0, false);
        declareFunction("kb_difference_all_constants", "KB-DIFFERENCE-ALL-CONSTANTS", 1, 0, false);
        declareFunction("kb_difference_all_narts", "KB-DIFFERENCE-ALL-NARTS", 1, 0, false);
        declareFunction("kb_difference_all_assertions", "KB-DIFFERENCE-ALL-ASSERTIONS", 1, 0, false);
        declareFunction("kb_difference_all_deductions", "KB-DIFFERENCE-ALL-DEDUCTIONS", 1, 0, false);
        declareFunction("kb_intersection_compute", "KB-INTERSECTION-COMPUTE", 1, 0, false);
        declareFunction("kb_intersection_compute_constants", "KB-INTERSECTION-COMPUTE-CONSTANTS", 1, 0, false);
        declareFunction("kb_intersection_compute_congruent_old_constants", "KB-INTERSECTION-COMPUTE-CONGRUENT-OLD-CONSTANTS", 1, 0, false);
        declareFunction("kb_intersection_compute_constant", "KB-INTERSECTION-COMPUTE-CONSTANT", 2, 0, false);
        declareFunction("kb_intersection_compute_narts", "KB-INTERSECTION-COMPUTE-NARTS", 1, 0, false);
        declareFunction("kb_intersection_compute_congruent_old_narts", "KB-INTERSECTION-COMPUTE-CONGRUENT-OLD-NARTS", 1, 0, false);
        declareFunction("kb_intersection_compute_nart", "KB-INTERSECTION-COMPUTE-NART", 2, 0, false);
        declareFunction("kb_intersection_compute_assertions", "KB-INTERSECTION-COMPUTE-ASSERTIONS", 1, 0, false);
        declareFunction("kb_intersection_compute_congruent_old_assertions", "KB-INTERSECTION-COMPUTE-CONGRUENT-OLD-ASSERTIONS", 1, 0, false);
        declareFunction("kb_intersection_compute_assertion", "KB-INTERSECTION-COMPUTE-ASSERTION", 2, 0, false);
        declareFunction("kb_intersection_compute_deductions", "KB-INTERSECTION-COMPUTE-DEDUCTIONS", 1, 0, false);
        declareFunction("kb_intersection_compute_congruent_old_deductions", "KB-INTERSECTION-COMPUTE-CONGRUENT-OLD-DEDUCTIONS", 1, 0, false);
        declareFunction("kb_intersection_compute_deduction", "KB-INTERSECTION-COMPUTE-DEDUCTION", 2, 0, false);
        declareFunction("kb_difference_compute", "KB-DIFFERENCE-COMPUTE", 1, 0, false);
        declareFunction("kb_difference_compute_renamed_constants", "KB-DIFFERENCE-COMPUTE-RENAMED-CONSTANTS", 1, 0, false);
        declareFunction("kb_difference_compute_constants", "KB-DIFFERENCE-COMPUTE-CONSTANTS", 1, 0, false);
        declareFunction("kb_difference_compute_narts", "KB-DIFFERENCE-COMPUTE-NARTS", 1, 0, false);
        declareFunction("kb_difference_compute_assertions", "KB-DIFFERENCE-COMPUTE-ASSERTIONS", 1, 0, false);
        declareFunction("kb_difference_compute_deductions", "KB-DIFFERENCE-COMPUTE-DEDUCTIONS", 1, 0, false);
        declareFunction("compute_remote_image_kb_intersection", "COMPUTE-REMOTE-IMAGE-KB-INTERSECTION", 2, 1, false);
        declareFunction("compute_remote_image_kb_difference", "COMPUTE-REMOTE-IMAGE-KB-DIFFERENCE", 2, 1, false);
        declareFunction("show_kb_difference", "SHOW-KB-DIFFERENCE", 1, 1, false);
        declareFunction("compute_remote_image_old_constants_congruentP", "COMPUTE-REMOTE-IMAGE-OLD-CONSTANTS-CONGRUENT?", 0, 0, false);
        declareFunction("compute_missing_old_constant_remote_ids", "COMPUTE-MISSING-OLD-CONSTANT-REMOTE-IDS", 0, 0, false);
        declareFunction("compute_constant_remote_id", "COMPUTE-CONSTANT-REMOTE-ID", 1, 0, false);
        declareFunction("compute_constant_remote_name", "COMPUTE-CONSTANT-REMOTE-NAME", 1, 0, false);
        declareFunction("compute_remote_image_old_narts_congruentP", "COMPUTE-REMOTE-IMAGE-OLD-NARTS-CONGRUENT?", 0, 0, false);
        declareFunction("compute_missing_old_nart_remote_ids", "COMPUTE-MISSING-OLD-NART-REMOTE-IDS", 0, 0, false);
        declareFunction("compute_nart_remote_id", "COMPUTE-NART-REMOTE-ID", 1, 0, false);
        declareFunction("compute_remote_image_old_assertions_congruentP", "COMPUTE-REMOTE-IMAGE-OLD-ASSERTIONS-CONGRUENT?", 0, 0, false);
        declareFunction("compute_missing_old_assertion_remote_ids", "COMPUTE-MISSING-OLD-ASSERTION-REMOTE-IDS", 0, 0, false);
        declareFunction("compute_assertion_remote_id", "COMPUTE-ASSERTION-REMOTE-ID", 1, 0, false);
        declareFunction("compute_remote_image_old_deductions_congruentP", "COMPUTE-REMOTE-IMAGE-OLD-DEDUCTIONS-CONGRUENT?", 0, 0, false);
        declareFunction("compute_missing_old_deduction_remote_ids", "COMPUTE-MISSING-OLD-DEDUCTION-REMOTE-IDS", 0, 0, false);
        declareFunction("compute_deduction_remote_id", "COMPUTE-DEDUCTION-REMOTE-ID", 1, 0, false);
        declareFunction("kb_wff_compare", "KB-WFF-COMPARE", 2, 0, false);
        declareFunction("kb_wff_compare_via_intersection", "KB-WFF-COMPARE-VIA-INTERSECTION", 3, 0, false);
        return NIL;
    }

    public static SubLObject declare_kb_compare_file() {
        if (SubLFiles.USE_V1) {
            declareMacro("with_new_kb_compare_connection", "WITH-NEW-KB-COMPARE-CONNECTION");
            declareFunction("set_kb_compare_connection_common_symbols", "SET-KB-COMPARE-CONNECTION-COMMON-SYMBOLS", 0, 0, false);
            declareFunction("kb_intersection_print_function_trampoline", "KB-INTERSECTION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("kb_intersection_p", "KB-INTERSECTION-P", 1, 0, false);
            new kb_compare.$kb_intersection_p$UnaryFunction();
            declareFunction("kb_intrsct_remote_image", "KB-INTRSCT-REMOTE-IMAGE", 1, 0, false);
            declareFunction("kb_intrsct_constant_index", "KB-INTRSCT-CONSTANT-INDEX", 1, 0, false);
            declareFunction("kb_intrsct_nart_index", "KB-INTRSCT-NART-INDEX", 1, 0, false);
            declareFunction("kb_intrsct_assertion_index", "KB-INTRSCT-ASSERTION-INDEX", 1, 0, false);
            declareFunction("kb_intrsct_deduction_index", "KB-INTRSCT-DEDUCTION-INDEX", 1, 0, false);
            declareFunction("_csetf_kb_intrsct_remote_image", "_CSETF-KB-INTRSCT-REMOTE-IMAGE", 2, 0, false);
            declareFunction("_csetf_kb_intrsct_constant_index", "_CSETF-KB-INTRSCT-CONSTANT-INDEX", 2, 0, false);
            declareFunction("_csetf_kb_intrsct_nart_index", "_CSETF-KB-INTRSCT-NART-INDEX", 2, 0, false);
            declareFunction("_csetf_kb_intrsct_assertion_index", "_CSETF-KB-INTRSCT-ASSERTION-INDEX", 2, 0, false);
            declareFunction("_csetf_kb_intrsct_deduction_index", "_CSETF-KB-INTRSCT-DEDUCTION-INDEX", 2, 0, false);
            declareFunction("make_kb_intersection", "MAKE-KB-INTERSECTION", 0, 1, false);
            declareFunction("visit_defstruct_kb_intersection", "VISIT-DEFSTRUCT-KB-INTERSECTION", 2, 0, false);
            declareFunction("visit_defstruct_object_kb_intersection_method", "VISIT-DEFSTRUCT-OBJECT-KB-INTERSECTION-METHOD", 2, 0, false);
            declareFunction("print_kb_intersection", "PRINT-KB-INTERSECTION", 3, 0, false);
            declareFunction("new_kb_intersection", "NEW-KB-INTERSECTION", 1, 0, false);
            declareFunction("destroy_kb_intersection", "DESTROY-KB-INTERSECTION", 1, 0, false);
            declareFunction("kb_intersection_remote_image", "KB-INTERSECTION-REMOTE-IMAGE", 1, 0, false);
            declareFunction("kb_intersection_constant_index", "KB-INTERSECTION-CONSTANT-INDEX", 1, 0, false);
            declareFunction("kb_intersection_add_constant", "KB-INTERSECTION-ADD-CONSTANT", 3, 0, false);
            declareFunction("kb_intersection_add_nart", "KB-INTERSECTION-ADD-NART", 3, 0, false);
            declareFunction("kb_intersection_add_assertion", "KB-INTERSECTION-ADD-ASSERTION", 3, 0, false);
            declareFunction("kb_intersection_add_deduction", "KB-INTERSECTION-ADD-DEDUCTION", 3, 0, false);
            declareFunction("kb_intersection_remote_image_machine", "KB-INTERSECTION-REMOTE-IMAGE-MACHINE", 1, 0, false);
            declareFunction("kb_intersection_remote_image_port", "KB-INTERSECTION-REMOTE-IMAGE-PORT", 1, 0, false);
            declareFunction("kb_intersection_remote_image_protocol", "KB-INTERSECTION-REMOTE-IMAGE-PROTOCOL", 1, 0, false);
            declareFunction("kb_intersection_constantP", "KB-INTERSECTION-CONSTANT?", 2, 0, false);
            declareFunction("kb_intersection_constant_remote_id", "KB-INTERSECTION-CONSTANT-REMOTE-ID", 2, 0, false);
            declareFunction("kb_intersection_nartP", "KB-INTERSECTION-NART?", 2, 0, false);
            declareFunction("kb_intersection_nart_remote_id", "KB-INTERSECTION-NART-REMOTE-ID", 2, 0, false);
            declareFunction("kb_intersection_assertionP", "KB-INTERSECTION-ASSERTION?", 2, 0, false);
            declareFunction("kb_intersection_assertion_remote_id", "KB-INTERSECTION-ASSERTION-REMOTE-ID", 2, 0, false);
            declareFunction("kb_intersection_deductionP", "KB-INTERSECTION-DEDUCTION?", 2, 0, false);
            declareFunction("kb_intersection_deduction_remote_id", "KB-INTERSECTION-DEDUCTION-REMOTE-ID", 2, 0, false);
            declareMacro("do_kb_intersection_constants", "DO-KB-INTERSECTION-CONSTANTS");
            declareFunction("kb_intersection_nart_impossibleP", "KB-INTERSECTION-NART-IMPOSSIBLE?", 2, 0, false);
            declareFunction("kb_intersection_nart_impossible_int", "KB-INTERSECTION-NART-IMPOSSIBLE-INT", 1, 0, false);
            declareFunction("kb_intersection_assertion_impossibleP", "KB-INTERSECTION-ASSERTION-IMPOSSIBLE?", 2, 0, false);
            declareFunction("kb_intersection_assertion_impossible_int", "KB-INTERSECTION-ASSERTION-IMPOSSIBLE-INT", 1, 0, false);
            declareFunction("kb_intersection_deduction_impossibleP", "KB-INTERSECTION-DEDUCTION-IMPOSSIBLE?", 2, 0, false);
            declareFunction("kb_intersection_deduction_impossible_int", "KB-INTERSECTION-DEDUCTION-IMPOSSIBLE-INT", 1, 0, false);
            declareFunction("save_kb_intersection_information_to_file", "SAVE-KB-INTERSECTION-INFORMATION-TO-FILE", 2, 0, false);
            declareFunction("load_kb_intersection_information_from_file", "LOAD-KB-INTERSECTION-INFORMATION-FROM-FILE", 2, 0, false);
            declareFunction("save_kb_intersection_information", "SAVE-KB-INTERSECTION-INFORMATION", 2, 0, false);
            declareFunction("load_kb_intersection_information", "LOAD-KB-INTERSECTION-INFORMATION", 2, 0, false);
            declareFunction("save_kb_intersection_id_index", "SAVE-KB-INTERSECTION-ID-INDEX", 3, 0, false);
            declareFunction("load_kb_intersection_id_index", "LOAD-KB-INTERSECTION-ID-INDEX", 2, 0, false);
            declareFunction("invert_kb_intersection_id_index", "INVERT-KB-INTERSECTION-ID-INDEX", 1, 0, false);
            declareFunction("kb_difference_print_function_trampoline", "KB-DIFFERENCE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
            declareFunction("kb_difference_p", "KB-DIFFERENCE-P", 1, 0, false);
            new kb_compare.$kb_difference_p$UnaryFunction();
            declareFunction("kb_diff_common_intersection", "KB-DIFF-COMMON-INTERSECTION", 1, 0, false);
            declareFunction("kb_diff_renamed_constants", "KB-DIFF-RENAMED-CONSTANTS", 1, 0, false);
            declareFunction("kb_diff_constants", "KB-DIFF-CONSTANTS", 1, 0, false);
            declareFunction("kb_diff_narts", "KB-DIFF-NARTS", 1, 0, false);
            declareFunction("kb_diff_assertions", "KB-DIFF-ASSERTIONS", 1, 0, false);
            declareFunction("kb_diff_deductions", "KB-DIFF-DEDUCTIONS", 1, 0, false);
            declareFunction("_csetf_kb_diff_common_intersection", "_CSETF-KB-DIFF-COMMON-INTERSECTION", 2, 0, false);
            declareFunction("_csetf_kb_diff_renamed_constants", "_CSETF-KB-DIFF-RENAMED-CONSTANTS", 2, 0, false);
            declareFunction("_csetf_kb_diff_constants", "_CSETF-KB-DIFF-CONSTANTS", 2, 0, false);
            declareFunction("_csetf_kb_diff_narts", "_CSETF-KB-DIFF-NARTS", 2, 0, false);
            declareFunction("_csetf_kb_diff_assertions", "_CSETF-KB-DIFF-ASSERTIONS", 2, 0, false);
            declareFunction("_csetf_kb_diff_deductions", "_CSETF-KB-DIFF-DEDUCTIONS", 2, 0, false);
            declareFunction("make_kb_difference", "MAKE-KB-DIFFERENCE", 0, 1, false);
            declareFunction("visit_defstruct_kb_difference", "VISIT-DEFSTRUCT-KB-DIFFERENCE", 2, 0, false);
            declareFunction("visit_defstruct_object_kb_difference_method", "VISIT-DEFSTRUCT-OBJECT-KB-DIFFERENCE-METHOD", 2, 0, false);
            declareFunction("print_kb_difference", "PRINT-KB-DIFFERENCE", 3, 0, false);
            declareFunction("new_kb_difference", "NEW-KB-DIFFERENCE", 1, 0, false);
            declareFunction("destroy_kb_difference", "DESTROY-KB-DIFFERENCE", 1, 0, false);
            declareFunction("kb_difference_common_intersection", "KB-DIFFERENCE-COMMON-INTERSECTION", 1, 0, false);
            declareFunction("kb_difference_renamed_constants", "KB-DIFFERENCE-RENAMED-CONSTANTS", 1, 0, false);
            declareFunction("kb_difference_constants", "KB-DIFFERENCE-CONSTANTS", 1, 0, false);
            declareFunction("kb_difference_narts", "KB-DIFFERENCE-NARTS", 1, 0, false);
            declareFunction("kb_difference_assertions", "KB-DIFFERENCE-ASSERTIONS", 1, 0, false);
            declareFunction("kb_difference_deductions", "KB-DIFFERENCE-DEDUCTIONS", 1, 0, false);
            declareMacro("do_kb_difference_renamed_constants", "DO-KB-DIFFERENCE-RENAMED-CONSTANTS");
            declareMacro("do_kb_difference_constants", "DO-KB-DIFFERENCE-CONSTANTS");
            declareMacro("do_kb_difference_narts", "DO-KB-DIFFERENCE-NARTS");
            declareMacro("do_kb_difference_assertions", "DO-KB-DIFFERENCE-ASSERTIONS");
            declareMacro("do_kb_difference_deductions", "DO-KB-DIFFERENCE-DEDUCTIONS");
            declareFunction("kb_difference_add_renamed_constant", "KB-DIFFERENCE-ADD-RENAMED-CONSTANT", 3, 0, false);
            declareFunction("kb_difference_add_constant", "KB-DIFFERENCE-ADD-CONSTANT", 2, 0, false);
            declareFunction("kb_difference_add_nart", "KB-DIFFERENCE-ADD-NART", 2, 0, false);
            declareFunction("kb_difference_add_assertion", "KB-DIFFERENCE-ADD-ASSERTION", 2, 0, false);
            declareFunction("kb_difference_add_deduction", "KB-DIFFERENCE-ADD-DEDUCTION", 2, 0, false);
            declareFunction("kb_difference_remote_image", "KB-DIFFERENCE-REMOTE-IMAGE", 1, 0, false);
            declareFunction("kb_difference_remote_image_machine", "KB-DIFFERENCE-REMOTE-IMAGE-MACHINE", 1, 0, false);
            declareFunction("kb_difference_remote_image_port", "KB-DIFFERENCE-REMOTE-IMAGE-PORT", 1, 0, false);
            declareFunction("kb_difference_remote_image_protocol", "KB-DIFFERENCE-REMOTE-IMAGE-PROTOCOL", 1, 0, false);
            declareFunction("kb_difference_constant_remote_name", "KB-DIFFERENCE-CONSTANT-REMOTE-NAME", 2, 0, false);
            declareFunction("kb_difference_all_renamed_constants", "KB-DIFFERENCE-ALL-RENAMED-CONSTANTS", 1, 0, false);
            declareFunction("kb_difference_all_constants", "KB-DIFFERENCE-ALL-CONSTANTS", 1, 0, false);
            declareFunction("kb_difference_all_narts", "KB-DIFFERENCE-ALL-NARTS", 1, 0, false);
            declareFunction("kb_difference_all_assertions", "KB-DIFFERENCE-ALL-ASSERTIONS", 1, 0, false);
            declareFunction("kb_difference_all_deductions", "KB-DIFFERENCE-ALL-DEDUCTIONS", 1, 0, false);
            declareFunction("kb_intersection_compute", "KB-INTERSECTION-COMPUTE", 1, 0, false);
            declareFunction("kb_intersection_compute_constants", "KB-INTERSECTION-COMPUTE-CONSTANTS", 1, 0, false);
            declareFunction("kb_intersection_compute_congruent_old_constants", "KB-INTERSECTION-COMPUTE-CONGRUENT-OLD-CONSTANTS", 1, 0, false);
            declareFunction("kb_intersection_compute_constant", "KB-INTERSECTION-COMPUTE-CONSTANT", 2, 0, false);
            declareFunction("kb_intersection_compute_narts", "KB-INTERSECTION-COMPUTE-NARTS", 1, 0, false);
            declareFunction("kb_intersection_compute_congruent_old_narts", "KB-INTERSECTION-COMPUTE-CONGRUENT-OLD-NARTS", 1, 0, false);
            declareFunction("kb_intersection_compute_nart", "KB-INTERSECTION-COMPUTE-NART", 2, 0, false);
            declareFunction("kb_intersection_compute_assertions", "KB-INTERSECTION-COMPUTE-ASSERTIONS", 1, 0, false);
            declareFunction("kb_intersection_compute_congruent_old_assertions", "KB-INTERSECTION-COMPUTE-CONGRUENT-OLD-ASSERTIONS", 1, 0, false);
            declareFunction("kb_intersection_compute_assertion", "KB-INTERSECTION-COMPUTE-ASSERTION", 2, 0, false);
            declareFunction("kb_intersection_compute_deductions", "KB-INTERSECTION-COMPUTE-DEDUCTIONS", 1, 0, false);
            declareFunction("kb_intersection_compute_congruent_old_deductions", "KB-INTERSECTION-COMPUTE-CONGRUENT-OLD-DEDUCTIONS", 1, 0, false);
            declareFunction("kb_intersection_compute_deduction", "KB-INTERSECTION-COMPUTE-DEDUCTION", 2, 0, false);
            declareFunction("kb_difference_compute", "KB-DIFFERENCE-COMPUTE", 1, 0, false);
            declareFunction("kb_difference_compute_renamed_constants", "KB-DIFFERENCE-COMPUTE-RENAMED-CONSTANTS", 1, 0, false);
            declareFunction("kb_difference_compute_constants", "KB-DIFFERENCE-COMPUTE-CONSTANTS", 1, 0, false);
            declareFunction("kb_difference_compute_narts", "KB-DIFFERENCE-COMPUTE-NARTS", 1, 0, false);
            declareFunction("kb_difference_compute_assertions", "KB-DIFFERENCE-COMPUTE-ASSERTIONS", 1, 0, false);
            declareFunction("kb_difference_compute_deductions", "KB-DIFFERENCE-COMPUTE-DEDUCTIONS", 1, 0, false);
            declareFunction("compute_remote_image_kb_intersection", "COMPUTE-REMOTE-IMAGE-KB-INTERSECTION", 2, 1, false);
            declareFunction("compute_remote_image_kb_difference", "COMPUTE-REMOTE-IMAGE-KB-DIFFERENCE", 2, 1, false);
            declareFunction("show_kb_difference", "SHOW-KB-DIFFERENCE", 1, 1, false);
            declareFunction("compute_remote_image_old_constants_congruentP", "COMPUTE-REMOTE-IMAGE-OLD-CONSTANTS-CONGRUENT?", 0, 0, false);
            declareFunction("compute_missing_old_constant_remote_ids", "COMPUTE-MISSING-OLD-CONSTANT-REMOTE-IDS", 0, 0, false);
            declareFunction("compute_constant_remote_id", "COMPUTE-CONSTANT-REMOTE-ID", 1, 0, false);
            declareFunction("compute_constant_remote_name", "COMPUTE-CONSTANT-REMOTE-NAME", 1, 0, false);
            declareFunction("compute_remote_image_old_narts_congruentP", "COMPUTE-REMOTE-IMAGE-OLD-NARTS-CONGRUENT?", 0, 0, false);
            declareFunction("compute_missing_old_nart_remote_ids", "COMPUTE-MISSING-OLD-NART-REMOTE-IDS", 0, 0, false);
            declareFunction("compute_nart_remote_id", "COMPUTE-NART-REMOTE-ID", 1, 0, false);
            declareFunction("compute_remote_image_old_assertions_congruentP", "COMPUTE-REMOTE-IMAGE-OLD-ASSERTIONS-CONGRUENT?", 0, 0, false);
            declareFunction("compute_missing_old_assertion_remote_ids", "COMPUTE-MISSING-OLD-ASSERTION-REMOTE-IDS", 0, 0, false);
            declareFunction("compute_assertion_remote_id", "COMPUTE-ASSERTION-REMOTE-ID", 1, 0, false);
            declareFunction("compute_remote_image_old_deductions_congruentP", "COMPUTE-REMOTE-IMAGE-OLD-DEDUCTIONS-CONGRUENT?", 0, 0, false);
            declareFunction("compute_missing_old_deduction_remote_ids", "COMPUTE-MISSING-OLD-DEDUCTION-REMOTE-IDS", 0, 0, false);
            declareFunction("compute_deduction_remote_id", "COMPUTE-DEDUCTION-REMOTE-ID", 1, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("kb_wff_compare", "KB-WFF-COMPARE", 2, 0, false);
            declareFunction("kb_wff_compare_via_intersection", "KB-WFF-COMPARE-VIA-INTERSECTION", 3, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_kb_compare_file_Previous() {
        declareMacro("with_new_kb_compare_connection", "WITH-NEW-KB-COMPARE-CONNECTION");
        declareFunction("set_kb_compare_connection_common_symbols", "SET-KB-COMPARE-CONNECTION-COMMON-SYMBOLS", 0, 0, false);
        declareFunction("kb_intersection_print_function_trampoline", "KB-INTERSECTION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("kb_intersection_p", "KB-INTERSECTION-P", 1, 0, false);
        new kb_compare.$kb_intersection_p$UnaryFunction();
        declareFunction("kb_intrsct_remote_image", "KB-INTRSCT-REMOTE-IMAGE", 1, 0, false);
        declareFunction("kb_intrsct_constant_index", "KB-INTRSCT-CONSTANT-INDEX", 1, 0, false);
        declareFunction("kb_intrsct_nart_index", "KB-INTRSCT-NART-INDEX", 1, 0, false);
        declareFunction("kb_intrsct_assertion_index", "KB-INTRSCT-ASSERTION-INDEX", 1, 0, false);
        declareFunction("kb_intrsct_deduction_index", "KB-INTRSCT-DEDUCTION-INDEX", 1, 0, false);
        declareFunction("_csetf_kb_intrsct_remote_image", "_CSETF-KB-INTRSCT-REMOTE-IMAGE", 2, 0, false);
        declareFunction("_csetf_kb_intrsct_constant_index", "_CSETF-KB-INTRSCT-CONSTANT-INDEX", 2, 0, false);
        declareFunction("_csetf_kb_intrsct_nart_index", "_CSETF-KB-INTRSCT-NART-INDEX", 2, 0, false);
        declareFunction("_csetf_kb_intrsct_assertion_index", "_CSETF-KB-INTRSCT-ASSERTION-INDEX", 2, 0, false);
        declareFunction("_csetf_kb_intrsct_deduction_index", "_CSETF-KB-INTRSCT-DEDUCTION-INDEX", 2, 0, false);
        declareFunction("make_kb_intersection", "MAKE-KB-INTERSECTION", 0, 1, false);
        declareFunction("visit_defstruct_kb_intersection", "VISIT-DEFSTRUCT-KB-INTERSECTION", 2, 0, false);
        declareFunction("visit_defstruct_object_kb_intersection_method", "VISIT-DEFSTRUCT-OBJECT-KB-INTERSECTION-METHOD", 2, 0, false);
        declareFunction("print_kb_intersection", "PRINT-KB-INTERSECTION", 3, 0, false);
        declareFunction("new_kb_intersection", "NEW-KB-INTERSECTION", 1, 0, false);
        declareFunction("destroy_kb_intersection", "DESTROY-KB-INTERSECTION", 1, 0, false);
        declareFunction("kb_intersection_remote_image", "KB-INTERSECTION-REMOTE-IMAGE", 1, 0, false);
        declareFunction("kb_intersection_constant_index", "KB-INTERSECTION-CONSTANT-INDEX", 1, 0, false);
        declareFunction("kb_intersection_add_constant", "KB-INTERSECTION-ADD-CONSTANT", 3, 0, false);
        declareFunction("kb_intersection_add_nart", "KB-INTERSECTION-ADD-NART", 3, 0, false);
        declareFunction("kb_intersection_add_assertion", "KB-INTERSECTION-ADD-ASSERTION", 3, 0, false);
        declareFunction("kb_intersection_add_deduction", "KB-INTERSECTION-ADD-DEDUCTION", 3, 0, false);
        declareFunction("kb_intersection_remote_image_machine", "KB-INTERSECTION-REMOTE-IMAGE-MACHINE", 1, 0, false);
        declareFunction("kb_intersection_remote_image_port", "KB-INTERSECTION-REMOTE-IMAGE-PORT", 1, 0, false);
        declareFunction("kb_intersection_remote_image_protocol", "KB-INTERSECTION-REMOTE-IMAGE-PROTOCOL", 1, 0, false);
        declareFunction("kb_intersection_constantP", "KB-INTERSECTION-CONSTANT?", 2, 0, false);
        declareFunction("kb_intersection_constant_remote_id", "KB-INTERSECTION-CONSTANT-REMOTE-ID", 2, 0, false);
        declareFunction("kb_intersection_nartP", "KB-INTERSECTION-NART?", 2, 0, false);
        declareFunction("kb_intersection_nart_remote_id", "KB-INTERSECTION-NART-REMOTE-ID", 2, 0, false);
        declareFunction("kb_intersection_assertionP", "KB-INTERSECTION-ASSERTION?", 2, 0, false);
        declareFunction("kb_intersection_assertion_remote_id", "KB-INTERSECTION-ASSERTION-REMOTE-ID", 2, 0, false);
        declareFunction("kb_intersection_deductionP", "KB-INTERSECTION-DEDUCTION?", 2, 0, false);
        declareFunction("kb_intersection_deduction_remote_id", "KB-INTERSECTION-DEDUCTION-REMOTE-ID", 2, 0, false);
        declareMacro("do_kb_intersection_constants", "DO-KB-INTERSECTION-CONSTANTS");
        declareFunction("kb_intersection_nart_impossibleP", "KB-INTERSECTION-NART-IMPOSSIBLE?", 2, 0, false);
        declareFunction("kb_intersection_nart_impossible_int", "KB-INTERSECTION-NART-IMPOSSIBLE-INT", 1, 0, false);
        declareFunction("kb_intersection_assertion_impossibleP", "KB-INTERSECTION-ASSERTION-IMPOSSIBLE?", 2, 0, false);
        declareFunction("kb_intersection_assertion_impossible_int", "KB-INTERSECTION-ASSERTION-IMPOSSIBLE-INT", 1, 0, false);
        declareFunction("kb_intersection_deduction_impossibleP", "KB-INTERSECTION-DEDUCTION-IMPOSSIBLE?", 2, 0, false);
        declareFunction("kb_intersection_deduction_impossible_int", "KB-INTERSECTION-DEDUCTION-IMPOSSIBLE-INT", 1, 0, false);
        declareFunction("save_kb_intersection_information_to_file", "SAVE-KB-INTERSECTION-INFORMATION-TO-FILE", 2, 0, false);
        declareFunction("load_kb_intersection_information_from_file", "LOAD-KB-INTERSECTION-INFORMATION-FROM-FILE", 2, 0, false);
        declareFunction("save_kb_intersection_information", "SAVE-KB-INTERSECTION-INFORMATION", 2, 0, false);
        declareFunction("load_kb_intersection_information", "LOAD-KB-INTERSECTION-INFORMATION", 2, 0, false);
        declareFunction("save_kb_intersection_id_index", "SAVE-KB-INTERSECTION-ID-INDEX", 3, 0, false);
        declareFunction("load_kb_intersection_id_index", "LOAD-KB-INTERSECTION-ID-INDEX", 2, 0, false);
        declareFunction("invert_kb_intersection_id_index", "INVERT-KB-INTERSECTION-ID-INDEX", 1, 0, false);
        declareFunction("kb_difference_print_function_trampoline", "KB-DIFFERENCE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("kb_difference_p", "KB-DIFFERENCE-P", 1, 0, false);
        new kb_compare.$kb_difference_p$UnaryFunction();
        declareFunction("kb_diff_common_intersection", "KB-DIFF-COMMON-INTERSECTION", 1, 0, false);
        declareFunction("kb_diff_renamed_constants", "KB-DIFF-RENAMED-CONSTANTS", 1, 0, false);
        declareFunction("kb_diff_constants", "KB-DIFF-CONSTANTS", 1, 0, false);
        declareFunction("kb_diff_narts", "KB-DIFF-NARTS", 1, 0, false);
        declareFunction("kb_diff_assertions", "KB-DIFF-ASSERTIONS", 1, 0, false);
        declareFunction("kb_diff_deductions", "KB-DIFF-DEDUCTIONS", 1, 0, false);
        declareFunction("_csetf_kb_diff_common_intersection", "_CSETF-KB-DIFF-COMMON-INTERSECTION", 2, 0, false);
        declareFunction("_csetf_kb_diff_renamed_constants", "_CSETF-KB-DIFF-RENAMED-CONSTANTS", 2, 0, false);
        declareFunction("_csetf_kb_diff_constants", "_CSETF-KB-DIFF-CONSTANTS", 2, 0, false);
        declareFunction("_csetf_kb_diff_narts", "_CSETF-KB-DIFF-NARTS", 2, 0, false);
        declareFunction("_csetf_kb_diff_assertions", "_CSETF-KB-DIFF-ASSERTIONS", 2, 0, false);
        declareFunction("_csetf_kb_diff_deductions", "_CSETF-KB-DIFF-DEDUCTIONS", 2, 0, false);
        declareFunction("make_kb_difference", "MAKE-KB-DIFFERENCE", 0, 1, false);
        declareFunction("visit_defstruct_kb_difference", "VISIT-DEFSTRUCT-KB-DIFFERENCE", 2, 0, false);
        declareFunction("visit_defstruct_object_kb_difference_method", "VISIT-DEFSTRUCT-OBJECT-KB-DIFFERENCE-METHOD", 2, 0, false);
        declareFunction("print_kb_difference", "PRINT-KB-DIFFERENCE", 3, 0, false);
        declareFunction("new_kb_difference", "NEW-KB-DIFFERENCE", 1, 0, false);
        declareFunction("destroy_kb_difference", "DESTROY-KB-DIFFERENCE", 1, 0, false);
        declareFunction("kb_difference_common_intersection", "KB-DIFFERENCE-COMMON-INTERSECTION", 1, 0, false);
        declareFunction("kb_difference_renamed_constants", "KB-DIFFERENCE-RENAMED-CONSTANTS", 1, 0, false);
        declareFunction("kb_difference_constants", "KB-DIFFERENCE-CONSTANTS", 1, 0, false);
        declareFunction("kb_difference_narts", "KB-DIFFERENCE-NARTS", 1, 0, false);
        declareFunction("kb_difference_assertions", "KB-DIFFERENCE-ASSERTIONS", 1, 0, false);
        declareFunction("kb_difference_deductions", "KB-DIFFERENCE-DEDUCTIONS", 1, 0, false);
        declareMacro("do_kb_difference_renamed_constants", "DO-KB-DIFFERENCE-RENAMED-CONSTANTS");
        declareMacro("do_kb_difference_constants", "DO-KB-DIFFERENCE-CONSTANTS");
        declareMacro("do_kb_difference_narts", "DO-KB-DIFFERENCE-NARTS");
        declareMacro("do_kb_difference_assertions", "DO-KB-DIFFERENCE-ASSERTIONS");
        declareMacro("do_kb_difference_deductions", "DO-KB-DIFFERENCE-DEDUCTIONS");
        declareFunction("kb_difference_add_renamed_constant", "KB-DIFFERENCE-ADD-RENAMED-CONSTANT", 3, 0, false);
        declareFunction("kb_difference_add_constant", "KB-DIFFERENCE-ADD-CONSTANT", 2, 0, false);
        declareFunction("kb_difference_add_nart", "KB-DIFFERENCE-ADD-NART", 2, 0, false);
        declareFunction("kb_difference_add_assertion", "KB-DIFFERENCE-ADD-ASSERTION", 2, 0, false);
        declareFunction("kb_difference_add_deduction", "KB-DIFFERENCE-ADD-DEDUCTION", 2, 0, false);
        declareFunction("kb_difference_remote_image", "KB-DIFFERENCE-REMOTE-IMAGE", 1, 0, false);
        declareFunction("kb_difference_remote_image_machine", "KB-DIFFERENCE-REMOTE-IMAGE-MACHINE", 1, 0, false);
        declareFunction("kb_difference_remote_image_port", "KB-DIFFERENCE-REMOTE-IMAGE-PORT", 1, 0, false);
        declareFunction("kb_difference_remote_image_protocol", "KB-DIFFERENCE-REMOTE-IMAGE-PROTOCOL", 1, 0, false);
        declareFunction("kb_difference_constant_remote_name", "KB-DIFFERENCE-CONSTANT-REMOTE-NAME", 2, 0, false);
        declareFunction("kb_difference_all_renamed_constants", "KB-DIFFERENCE-ALL-RENAMED-CONSTANTS", 1, 0, false);
        declareFunction("kb_difference_all_constants", "KB-DIFFERENCE-ALL-CONSTANTS", 1, 0, false);
        declareFunction("kb_difference_all_narts", "KB-DIFFERENCE-ALL-NARTS", 1, 0, false);
        declareFunction("kb_difference_all_assertions", "KB-DIFFERENCE-ALL-ASSERTIONS", 1, 0, false);
        declareFunction("kb_difference_all_deductions", "KB-DIFFERENCE-ALL-DEDUCTIONS", 1, 0, false);
        declareFunction("kb_intersection_compute", "KB-INTERSECTION-COMPUTE", 1, 0, false);
        declareFunction("kb_intersection_compute_constants", "KB-INTERSECTION-COMPUTE-CONSTANTS", 1, 0, false);
        declareFunction("kb_intersection_compute_congruent_old_constants", "KB-INTERSECTION-COMPUTE-CONGRUENT-OLD-CONSTANTS", 1, 0, false);
        declareFunction("kb_intersection_compute_constant", "KB-INTERSECTION-COMPUTE-CONSTANT", 2, 0, false);
        declareFunction("kb_intersection_compute_narts", "KB-INTERSECTION-COMPUTE-NARTS", 1, 0, false);
        declareFunction("kb_intersection_compute_congruent_old_narts", "KB-INTERSECTION-COMPUTE-CONGRUENT-OLD-NARTS", 1, 0, false);
        declareFunction("kb_intersection_compute_nart", "KB-INTERSECTION-COMPUTE-NART", 2, 0, false);
        declareFunction("kb_intersection_compute_assertions", "KB-INTERSECTION-COMPUTE-ASSERTIONS", 1, 0, false);
        declareFunction("kb_intersection_compute_congruent_old_assertions", "KB-INTERSECTION-COMPUTE-CONGRUENT-OLD-ASSERTIONS", 1, 0, false);
        declareFunction("kb_intersection_compute_assertion", "KB-INTERSECTION-COMPUTE-ASSERTION", 2, 0, false);
        declareFunction("kb_intersection_compute_deductions", "KB-INTERSECTION-COMPUTE-DEDUCTIONS", 1, 0, false);
        declareFunction("kb_intersection_compute_congruent_old_deductions", "KB-INTERSECTION-COMPUTE-CONGRUENT-OLD-DEDUCTIONS", 1, 0, false);
        declareFunction("kb_intersection_compute_deduction", "KB-INTERSECTION-COMPUTE-DEDUCTION", 2, 0, false);
        declareFunction("kb_difference_compute", "KB-DIFFERENCE-COMPUTE", 1, 0, false);
        declareFunction("kb_difference_compute_renamed_constants", "KB-DIFFERENCE-COMPUTE-RENAMED-CONSTANTS", 1, 0, false);
        declareFunction("kb_difference_compute_constants", "KB-DIFFERENCE-COMPUTE-CONSTANTS", 1, 0, false);
        declareFunction("kb_difference_compute_narts", "KB-DIFFERENCE-COMPUTE-NARTS", 1, 0, false);
        declareFunction("kb_difference_compute_assertions", "KB-DIFFERENCE-COMPUTE-ASSERTIONS", 1, 0, false);
        declareFunction("kb_difference_compute_deductions", "KB-DIFFERENCE-COMPUTE-DEDUCTIONS", 1, 0, false);
        declareFunction("compute_remote_image_kb_intersection", "COMPUTE-REMOTE-IMAGE-KB-INTERSECTION", 2, 1, false);
        declareFunction("compute_remote_image_kb_difference", "COMPUTE-REMOTE-IMAGE-KB-DIFFERENCE", 2, 1, false);
        declareFunction("show_kb_difference", "SHOW-KB-DIFFERENCE", 1, 1, false);
        declareFunction("compute_remote_image_old_constants_congruentP", "COMPUTE-REMOTE-IMAGE-OLD-CONSTANTS-CONGRUENT?", 0, 0, false);
        declareFunction("compute_missing_old_constant_remote_ids", "COMPUTE-MISSING-OLD-CONSTANT-REMOTE-IDS", 0, 0, false);
        declareFunction("compute_constant_remote_id", "COMPUTE-CONSTANT-REMOTE-ID", 1, 0, false);
        declareFunction("compute_constant_remote_name", "COMPUTE-CONSTANT-REMOTE-NAME", 1, 0, false);
        declareFunction("compute_remote_image_old_narts_congruentP", "COMPUTE-REMOTE-IMAGE-OLD-NARTS-CONGRUENT?", 0, 0, false);
        declareFunction("compute_missing_old_nart_remote_ids", "COMPUTE-MISSING-OLD-NART-REMOTE-IDS", 0, 0, false);
        declareFunction("compute_nart_remote_id", "COMPUTE-NART-REMOTE-ID", 1, 0, false);
        declareFunction("compute_remote_image_old_assertions_congruentP", "COMPUTE-REMOTE-IMAGE-OLD-ASSERTIONS-CONGRUENT?", 0, 0, false);
        declareFunction("compute_missing_old_assertion_remote_ids", "COMPUTE-MISSING-OLD-ASSERTION-REMOTE-IDS", 0, 0, false);
        declareFunction("compute_assertion_remote_id", "COMPUTE-ASSERTION-REMOTE-ID", 1, 0, false);
        declareFunction("compute_remote_image_old_deductions_congruentP", "COMPUTE-REMOTE-IMAGE-OLD-DEDUCTIONS-CONGRUENT?", 0, 0, false);
        declareFunction("compute_missing_old_deduction_remote_ids", "COMPUTE-MISSING-OLD-DEDUCTION-REMOTE-IDS", 0, 0, false);
        declareFunction("compute_deduction_remote_id", "COMPUTE-DEDUCTION-REMOTE-ID", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_kb_compare_file_alt() {
        defparameter("*KB-COMPARE-COMMON-SYMBOLS*", append($list_alt0, $list_alt1, append(enumeration_types.valid_truths(), enumeration_types.valid_hl_truth_values(), hl_supports.hl_support_modules())));
        defconstant("*DTP-KB-INTERSECTION*", KB_INTERSECTION);
        defparameter("*KB-INTERSECTION*", NIL);
        defconstant("*DTP-KB-DIFFERENCE*", KB_DIFFERENCE);
        deflexical("*ASSERTIONS-THAT-BECAME-ILL-FORMED*", NIL != boundp($assertions_that_became_ill_formed$) ? ((SubLObject) ($assertions_that_became_ill_formed$.getGlobalValue())) : NIL);
        return NIL;
    }

    public static SubLObject init_kb_compare_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*KB-COMPARE-COMMON-SYMBOLS*", append($list0, $list1, append(enumeration_types.valid_truths(), enumeration_types.valid_hl_truth_values(), hl_supports.hl_support_modules())));
            defconstant("*DTP-KB-INTERSECTION*", KB_INTERSECTION);
            defparameter("*KB-INTERSECTION*", NIL);
            defconstant("*DTP-KB-DIFFERENCE*", KB_DIFFERENCE);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*ASSERTIONS-THAT-BECAME-ILL-FORMED*", NIL != boundp($assertions_that_became_ill_formed$) ? ((SubLObject) ($assertions_that_became_ill_formed$.getGlobalValue())) : NIL);
        }
        return NIL;
    }

    public static SubLObject init_kb_compare_file_Previous() {
        defparameter("*KB-COMPARE-COMMON-SYMBOLS*", append($list0, $list1, append(enumeration_types.valid_truths(), enumeration_types.valid_hl_truth_values(), hl_supports.hl_support_modules())));
        defconstant("*DTP-KB-INTERSECTION*", KB_INTERSECTION);
        defparameter("*KB-INTERSECTION*", NIL);
        defconstant("*DTP-KB-DIFFERENCE*", KB_DIFFERENCE);
        return NIL;
    }

    public static final SubLObject setup_kb_compare_file_alt() {
        register_macro_helper(SET_KB_COMPARE_CONNECTION_COMMON_SYMBOLS, WITH_NEW_KB_COMPARE_CONNECTION);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_kb_intersection$.getGlobalValue(), symbol_function(KB_INTERSECTION_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(KB_INTRSCT_REMOTE_IMAGE, _CSETF_KB_INTRSCT_REMOTE_IMAGE);
        def_csetf(KB_INTRSCT_CONSTANT_INDEX, _CSETF_KB_INTRSCT_CONSTANT_INDEX);
        def_csetf(KB_INTRSCT_NART_INDEX, _CSETF_KB_INTRSCT_NART_INDEX);
        def_csetf(KB_INTRSCT_ASSERTION_INDEX, _CSETF_KB_INTRSCT_ASSERTION_INDEX);
        def_csetf(KB_INTRSCT_DEDUCTION_INDEX, _CSETF_KB_INTRSCT_DEDUCTION_INDEX);
        identity(KB_INTERSECTION);
        register_macro_helper(KB_INTERSECTION_CONSTANT_INDEX, DO_KB_INTERSECTION_CONSTANTS);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_kb_difference$.getGlobalValue(), symbol_function(KB_DIFFERENCE_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(KB_DIFF_COMMON_INTERSECTION, _CSETF_KB_DIFF_COMMON_INTERSECTION);
        def_csetf(KB_DIFF_RENAMED_CONSTANTS, _CSETF_KB_DIFF_RENAMED_CONSTANTS);
        def_csetf(KB_DIFF_CONSTANTS, _CSETF_KB_DIFF_CONSTANTS);
        def_csetf(KB_DIFF_NARTS, _CSETF_KB_DIFF_NARTS);
        def_csetf(KB_DIFF_ASSERTIONS, _CSETF_KB_DIFF_ASSERTIONS);
        def_csetf(KB_DIFF_DEDUCTIONS, _CSETF_KB_DIFF_DEDUCTIONS);
        identity(KB_DIFFERENCE);
        register_macro_helper(KB_DIFFERENCE_RENAMED_CONSTANTS, DO_KB_DIFFERENCE_RENAMED_CONSTANTS);
        register_macro_helper(KB_DIFFERENCE_CONSTANTS, DO_KB_DIFFERENCE_CONSTANTS);
        register_macro_helper(KB_DIFFERENCE_NARTS, DO_KB_DIFFERENCE_NARTS);
        register_macro_helper(KB_DIFFERENCE_ASSERTIONS, DO_KB_DIFFERENCE_ASSERTIONS);
        register_macro_helper(KB_DIFFERENCE_DEDUCTIONS, DO_KB_DIFFERENCE_DEDUCTIONS);
        declare_defglobal($assertions_that_became_ill_formed$);
        return NIL;
    }

    public static SubLObject setup_kb_compare_file() {
        if (SubLFiles.USE_V1) {
            register_macro_helper(SET_KB_COMPARE_CONNECTION_COMMON_SYMBOLS, WITH_NEW_KB_COMPARE_CONNECTION);
            register_method($print_object_method_table$.getGlobalValue(), $dtp_kb_intersection$.getGlobalValue(), symbol_function(KB_INTERSECTION_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list26);
            def_csetf(KB_INTRSCT_REMOTE_IMAGE, _CSETF_KB_INTRSCT_REMOTE_IMAGE);
            def_csetf(KB_INTRSCT_CONSTANT_INDEX, _CSETF_KB_INTRSCT_CONSTANT_INDEX);
            def_csetf(KB_INTRSCT_NART_INDEX, _CSETF_KB_INTRSCT_NART_INDEX);
            def_csetf(KB_INTRSCT_ASSERTION_INDEX, _CSETF_KB_INTRSCT_ASSERTION_INDEX);
            def_csetf(KB_INTRSCT_DEDUCTION_INDEX, _CSETF_KB_INTRSCT_DEDUCTION_INDEX);
            identity(KB_INTERSECTION);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_kb_intersection$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_KB_INTERSECTION_METHOD));
            register_macro_helper(KB_INTERSECTION_CONSTANT_INDEX, DO_KB_INTERSECTION_CONSTANTS);
            register_method($print_object_method_table$.getGlobalValue(), $dtp_kb_difference$.getGlobalValue(), symbol_function(KB_DIFFERENCE_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim($list96);
            def_csetf(KB_DIFF_COMMON_INTERSECTION, _CSETF_KB_DIFF_COMMON_INTERSECTION);
            def_csetf(KB_DIFF_RENAMED_CONSTANTS, _CSETF_KB_DIFF_RENAMED_CONSTANTS);
            def_csetf(KB_DIFF_CONSTANTS, _CSETF_KB_DIFF_CONSTANTS);
            def_csetf(KB_DIFF_NARTS, _CSETF_KB_DIFF_NARTS);
            def_csetf(KB_DIFF_ASSERTIONS, _CSETF_KB_DIFF_ASSERTIONS);
            def_csetf(KB_DIFF_DEDUCTIONS, _CSETF_KB_DIFF_DEDUCTIONS);
            identity(KB_DIFFERENCE);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_kb_difference$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_KB_DIFFERENCE_METHOD));
            register_macro_helper(KB_DIFFERENCE_RENAMED_CONSTANTS, DO_KB_DIFFERENCE_RENAMED_CONSTANTS);
            register_macro_helper(KB_DIFFERENCE_CONSTANTS, DO_KB_DIFFERENCE_CONSTANTS);
            register_macro_helper(KB_DIFFERENCE_NARTS, DO_KB_DIFFERENCE_NARTS);
            register_macro_helper(KB_DIFFERENCE_ASSERTIONS, DO_KB_DIFFERENCE_ASSERTIONS);
            register_macro_helper(KB_DIFFERENCE_DEDUCTIONS, DO_KB_DIFFERENCE_DEDUCTIONS);
        }
        if (SubLFiles.USE_V2) {
            declare_defglobal($assertions_that_became_ill_formed$);
        }
        return NIL;
    }

    public static SubLObject setup_kb_compare_file_Previous() {
        register_macro_helper(SET_KB_COMPARE_CONNECTION_COMMON_SYMBOLS, WITH_NEW_KB_COMPARE_CONNECTION);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_kb_intersection$.getGlobalValue(), symbol_function(KB_INTERSECTION_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list26);
        def_csetf(KB_INTRSCT_REMOTE_IMAGE, _CSETF_KB_INTRSCT_REMOTE_IMAGE);
        def_csetf(KB_INTRSCT_CONSTANT_INDEX, _CSETF_KB_INTRSCT_CONSTANT_INDEX);
        def_csetf(KB_INTRSCT_NART_INDEX, _CSETF_KB_INTRSCT_NART_INDEX);
        def_csetf(KB_INTRSCT_ASSERTION_INDEX, _CSETF_KB_INTRSCT_ASSERTION_INDEX);
        def_csetf(KB_INTRSCT_DEDUCTION_INDEX, _CSETF_KB_INTRSCT_DEDUCTION_INDEX);
        identity(KB_INTERSECTION);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_kb_intersection$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_KB_INTERSECTION_METHOD));
        register_macro_helper(KB_INTERSECTION_CONSTANT_INDEX, DO_KB_INTERSECTION_CONSTANTS);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_kb_difference$.getGlobalValue(), symbol_function(KB_DIFFERENCE_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list96);
        def_csetf(KB_DIFF_COMMON_INTERSECTION, _CSETF_KB_DIFF_COMMON_INTERSECTION);
        def_csetf(KB_DIFF_RENAMED_CONSTANTS, _CSETF_KB_DIFF_RENAMED_CONSTANTS);
        def_csetf(KB_DIFF_CONSTANTS, _CSETF_KB_DIFF_CONSTANTS);
        def_csetf(KB_DIFF_NARTS, _CSETF_KB_DIFF_NARTS);
        def_csetf(KB_DIFF_ASSERTIONS, _CSETF_KB_DIFF_ASSERTIONS);
        def_csetf(KB_DIFF_DEDUCTIONS, _CSETF_KB_DIFF_DEDUCTIONS);
        identity(KB_DIFFERENCE);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_kb_difference$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_KB_DIFFERENCE_METHOD));
        register_macro_helper(KB_DIFFERENCE_RENAMED_CONSTANTS, DO_KB_DIFFERENCE_RENAMED_CONSTANTS);
        register_macro_helper(KB_DIFFERENCE_CONSTANTS, DO_KB_DIFFERENCE_CONSTANTS);
        register_macro_helper(KB_DIFFERENCE_NARTS, DO_KB_DIFFERENCE_NARTS);
        register_macro_helper(KB_DIFFERENCE_ASSERTIONS, DO_KB_DIFFERENCE_ASSERTIONS);
        register_macro_helper(KB_DIFFERENCE_DEDUCTIONS, DO_KB_DIFFERENCE_DEDUCTIONS);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_kb_compare_file();
    }

    @Override
    public void initializeVariables() {
        init_kb_compare_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_kb_compare_file();
    }

    static {
    }

    public static final class $kb_intersection_native extends SubLStructNative {
        public SubLObject $remote_image;

        public SubLObject $constant_index;

        public SubLObject $nart_index;

        public SubLObject $assertion_index;

        public SubLObject $deduction_index;

        private static final SubLStructDeclNative structDecl;

        public $kb_intersection_native() {
            kb_compare.$kb_intersection_native.this.$remote_image = Lisp.NIL;
            kb_compare.$kb_intersection_native.this.$constant_index = Lisp.NIL;
            kb_compare.$kb_intersection_native.this.$nart_index = Lisp.NIL;
            kb_compare.$kb_intersection_native.this.$assertion_index = Lisp.NIL;
            kb_compare.$kb_intersection_native.this.$deduction_index = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return kb_compare.$kb_intersection_native.this.$remote_image;
        }

        @Override
        public SubLObject getField3() {
            return kb_compare.$kb_intersection_native.this.$constant_index;
        }

        @Override
        public SubLObject getField4() {
            return kb_compare.$kb_intersection_native.this.$nart_index;
        }

        @Override
        public SubLObject getField5() {
            return kb_compare.$kb_intersection_native.this.$assertion_index;
        }

        @Override
        public SubLObject getField6() {
            return kb_compare.$kb_intersection_native.this.$deduction_index;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return kb_compare.$kb_intersection_native.this.$remote_image = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return kb_compare.$kb_intersection_native.this.$constant_index = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return kb_compare.$kb_intersection_native.this.$nart_index = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return kb_compare.$kb_intersection_native.this.$assertion_index = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return kb_compare.$kb_intersection_native.this.$deduction_index = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.kb_compare.$kb_intersection_native.class, KB_INTERSECTION, KB_INTERSECTION_P, $list20, $list21, new String[]{ "$remote_image", "$constant_index", "$nart_index", "$assertion_index", "$deduction_index" }, $list22, $list23, PRINT_KB_INTERSECTION);
        }
    }

    public static final class $kb_intersection_p$UnaryFunction extends UnaryFunction {
        public $kb_intersection_p$UnaryFunction() {
            super(extractFunctionNamed("KB-INTERSECTION-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return kb_intersection_p(arg1);
        }
    }

    public static final class $kb_difference_native extends SubLStructNative {
        public SubLObject $common_intersection;

        public SubLObject $renamed_constants;

        public SubLObject $constants;

        public SubLObject $narts;

        public SubLObject $assertions;

        public SubLObject $deductions;

        private static final SubLStructDeclNative structDecl;

        public $kb_difference_native() {
            kb_compare.$kb_difference_native.this.$common_intersection = Lisp.NIL;
            kb_compare.$kb_difference_native.this.$renamed_constants = Lisp.NIL;
            kb_compare.$kb_difference_native.this.$constants = Lisp.NIL;
            kb_compare.$kb_difference_native.this.$narts = Lisp.NIL;
            kb_compare.$kb_difference_native.this.$assertions = Lisp.NIL;
            kb_compare.$kb_difference_native.this.$deductions = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return kb_compare.$kb_difference_native.this.$common_intersection;
        }

        @Override
        public SubLObject getField3() {
            return kb_compare.$kb_difference_native.this.$renamed_constants;
        }

        @Override
        public SubLObject getField4() {
            return kb_compare.$kb_difference_native.this.$constants;
        }

        @Override
        public SubLObject getField5() {
            return kb_compare.$kb_difference_native.this.$narts;
        }

        @Override
        public SubLObject getField6() {
            return kb_compare.$kb_difference_native.this.$assertions;
        }

        @Override
        public SubLObject getField7() {
            return kb_compare.$kb_difference_native.this.$deductions;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return kb_compare.$kb_difference_native.this.$common_intersection = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return kb_compare.$kb_difference_native.this.$renamed_constants = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return kb_compare.$kb_difference_native.this.$constants = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return kb_compare.$kb_difference_native.this.$narts = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return kb_compare.$kb_difference_native.this.$assertions = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return kb_compare.$kb_difference_native.this.$deductions = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.kb_compare.$kb_difference_native.class, KB_DIFFERENCE, KB_DIFFERENCE_P, $list90, $list91, new String[]{ "$common_intersection", "$renamed_constants", "$constants", "$narts", "$assertions", "$deductions" }, $list92, $list93, PRINT_KB_DIFFERENCE);
        }
    }

    public static final class $kb_difference_p$UnaryFunction extends UnaryFunction {
        public $kb_difference_p$UnaryFunction() {
            super(extractFunctionNamed("KB-DIFFERENCE-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return kb_difference_p(arg1);
        }
    }
}

/**
 * Total time: 1308 ms
 */
