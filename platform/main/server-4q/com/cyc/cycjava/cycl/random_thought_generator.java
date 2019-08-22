package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.id_index.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quote;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.owl.owl_cycl_to_xml;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
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
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.random;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile; 
 public final class random_thought_generator extends SubLTranslatedFile {
    public static final SubLFile me = new random_thought_generator();

    public static final String myName = "com.cyc.cycjava.cycl.random_thought_generator";

    public static final String myFingerPrint = "23d9d65387a8bc7b35f48e55cebb3daa4fb4f20b115ed6abd19165de34310e7f";









    // deflexical
    private static final SubLSymbol $remote_random_thought_connection_pool_lock$ = makeSymbol("*REMOTE-RANDOM-THOUGHT-CONNECTION-POOL-LOCK*");

    // deflexical
    private static final SubLSymbol $remote_random_thought_connection_pool_max_size$ = makeSymbol("*REMOTE-RANDOM-THOUGHT-CONNECTION-POOL-MAX-SIZE*");



    // defconstant
    public static final SubLSymbol $dtp_random_thought_generator$ = makeSymbol("*DTP-RANDOM-THOUGHT-GENERATOR*");

    // defparameter
    private static final SubLSymbol $print_rtg_notesP$ = makeSymbol("*PRINT-RTG-NOTES?*");

    // Internal Constants
    public static final SubLList $list0 = list(NIL, NIL, NIL);

    public static final SubLList $list1 = list(list(makeKeyword("TEST"), makeSymbol("FORT-P")), list(makeKeyword("TEST"), makeSymbol("ASSERTION-P")), list(makeKeyword("TEST"), makeSymbol("PPH-JAVALIST-P")));

    private static final SubLObject $$Guest = reader_make_constant_shell(makeString("Guest"));







    public static final SubLString $str6$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLString $$$Generating_ = makeString("Generating ");

    private static final SubLString $str8$_random_thoughts___ = makeString(" random thoughts...");

    private static final SubLString $str9$random_thoughts = makeString("random-thoughts");



    public static final SubLList $list11 = list(makeKeyword("NOW"), NIL);

    public static final SubLString $$$thoughts = makeString("thoughts");

    public static final SubLString $$$Exporting_random_thoughts_to_ = makeString("Exporting random thoughts to ");



    private static final SubLList $list15 = list(makeUninternedSymbol("START"), makeUninternedSymbol("END"), makeUninternedSymbol("DELTA"));

    private static final SubLString $str16$Parsing_XML_stream___ = makeString("Parsing XML stream...");

    private static final SubLString $str17$thoughts_about = makeString("thoughts-about");

    private static final SubLString $str18$topic_id = makeString("topic-id");

    private static final SubLString $$$thought = makeString("thought");

    private static final SubLString $str20$Expected__thought___got__S = makeString("Expected 'thought', got ~S");

    private static final SubLString $str21$assertion_id = makeString("assertion-id");

    private static final SubLString $$$paraphrase = makeString("paraphrase");

    private static final SubLString $$$string = makeString("string");

    private static final SubLString $str24$_____ = makeString(";~%~%");

    private static final SubLString $str25$___ = makeString(",~%");

    private static final SubLString $str26$INSERT_INTO_THOUGHTS_INTERNAL_ID_ = makeString("INSERT INTO THOUGHTS(INTERNAL_ID, TERM_EID, TERM_CYCL, ASRTN_EID, ASRTN_CYCL_SENTENCE, ASRTN_MT, ASRTN_PARAPHRASE) VALUES");

    private static final SubLString $str27$___D____A_____A_____A_____A_____A = makeString(" (~D, '~A', '~A', '~A', '~A', '~A', '~A')");

    private static final SubLString $str28$_ = makeString("'");

    private static final SubLString $str29$__ = makeString("''");



    private static final SubLString $$$term = makeString("term");

    private static final SubLSymbol VALID_NON_EMPTY_RANDOM_THOUGHT_P = makeSymbol("VALID-NON-EMPTY-RANDOM-THOUGHT-P");



    private static final SubLList $list34 = list(makeString("external.random-thought-server.host"));

    private static final SubLSymbol $random_thought_server_host$ = makeSymbol("*RANDOM-THOUGHT-SERVER-HOST*");

    private static final SubLString $str36$random_thoughts_cyc_com = makeString("random-thoughts.cyc.com");



    private static final SubLList $list38 = list(makeString("external.random-thought-server.port"));

    private static final SubLSymbol $random_thought_server_port$ = makeSymbol("*RANDOM-THOUGHT-SERVER-PORT*");

    private static final SubLInteger $int$3634 = makeInteger(3634);

    private static final SubLSymbol $remote_random_thought_image$ = makeSymbol("*REMOTE-RANDOM-THOUGHT-IMAGE*");



    private static final SubLSymbol $remote_random_thought_connection_pool$ = makeSymbol("*REMOTE-RANDOM-THOUGHT-CONNECTION-POOL*");

    private static final SubLString $str44$Remote_Random_Thought_Connection_ = makeString("Remote Random Thought Connection Pool Lock");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");



    private static final SubLSymbol NEXT_RANDOM_THOUGHT_FOR_USER = makeSymbol("NEXT-RANDOM-THOUGHT-FOR-USER");





    private static final SubLList $list51 = list(makeSymbol("CSETQ"), makeSymbol("*PERFORM-CFASL-EXTERNALIZATION*"), T);





    private static final SubLString $str54$Could_not_open_a_connection_to__s = makeString("Could not open a connection to ~s");

    private static final SubLSymbol $random_thought_generators_for_users$ = makeSymbol("*RANDOM-THOUGHT-GENERATORS-FOR-USERS*");

    private static final SubLSymbol RANDOM_THOUGHT_GENERATOR = makeSymbol("RANDOM-THOUGHT-GENERATOR");

    private static final SubLSymbol RANDOM_THOUGHT_GENERATOR_P = makeSymbol("RANDOM-THOUGHT-GENERATOR-P");

    public static final SubLList $list58 = list(makeSymbol("USER"), makeSymbol("DONE-ASSERTIONS"), makeSymbol("GENERATOR-THREAD"), makeSymbol("QUEUE"), makeSymbol("MOST-RECENTLY-ADDED-THOUGHT"), makeSymbol("TOPICAL-THOUGHTS"));

    public static final SubLList $list59 = list(makeKeyword("USER"), makeKeyword("DONE-ASSERTIONS"), makeKeyword("GENERATOR-THREAD"), makeKeyword("QUEUE"), makeKeyword("MOST-RECENTLY-ADDED-THOUGHT"), makeKeyword("TOPICAL-THOUGHTS"));

    public static final SubLList $list60 = list(makeSymbol("RTG-STRUCT-USER"), makeSymbol("RTG-STRUCT-DONE-ASSERTIONS"), makeSymbol("RTG-STRUCT-GENERATOR-THREAD"), makeSymbol("RTG-STRUCT-QUEUE"), makeSymbol("RTG-STRUCT-MOST-RECENTLY-ADDED-THOUGHT"), makeSymbol("RTG-STRUCT-TOPICAL-THOUGHTS"));

    private static final SubLList $list61 = list(makeSymbol("_CSETF-RTG-STRUCT-USER"), makeSymbol("_CSETF-RTG-STRUCT-DONE-ASSERTIONS"), makeSymbol("_CSETF-RTG-STRUCT-GENERATOR-THREAD"), makeSymbol("_CSETF-RTG-STRUCT-QUEUE"), makeSymbol("_CSETF-RTG-STRUCT-MOST-RECENTLY-ADDED-THOUGHT"), makeSymbol("_CSETF-RTG-STRUCT-TOPICAL-THOUGHTS"));

    private static final SubLSymbol PPRINT_RANDOM_THOUGHT_GENERATOR = makeSymbol("PPRINT-RANDOM-THOUGHT-GENERATOR");

    private static final SubLSymbol RANDOM_THOUGHT_GENERATOR_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("RANDOM-THOUGHT-GENERATOR-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list64 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("RANDOM-THOUGHT-GENERATOR-P"));

    private static final SubLSymbol RTG_STRUCT_USER = makeSymbol("RTG-STRUCT-USER");

    private static final SubLSymbol _CSETF_RTG_STRUCT_USER = makeSymbol("_CSETF-RTG-STRUCT-USER");

    private static final SubLSymbol RTG_STRUCT_DONE_ASSERTIONS = makeSymbol("RTG-STRUCT-DONE-ASSERTIONS");

    private static final SubLSymbol _CSETF_RTG_STRUCT_DONE_ASSERTIONS = makeSymbol("_CSETF-RTG-STRUCT-DONE-ASSERTIONS");

    private static final SubLSymbol RTG_STRUCT_GENERATOR_THREAD = makeSymbol("RTG-STRUCT-GENERATOR-THREAD");

    private static final SubLSymbol _CSETF_RTG_STRUCT_GENERATOR_THREAD = makeSymbol("_CSETF-RTG-STRUCT-GENERATOR-THREAD");

    private static final SubLSymbol RTG_STRUCT_QUEUE = makeSymbol("RTG-STRUCT-QUEUE");

    private static final SubLSymbol _CSETF_RTG_STRUCT_QUEUE = makeSymbol("_CSETF-RTG-STRUCT-QUEUE");

    private static final SubLSymbol RTG_STRUCT_MOST_RECENTLY_ADDED_THOUGHT = makeSymbol("RTG-STRUCT-MOST-RECENTLY-ADDED-THOUGHT");

    private static final SubLSymbol _CSETF_RTG_STRUCT_MOST_RECENTLY_ADDED_THOUGHT = makeSymbol("_CSETF-RTG-STRUCT-MOST-RECENTLY-ADDED-THOUGHT");

    private static final SubLSymbol RTG_STRUCT_TOPICAL_THOUGHTS = makeSymbol("RTG-STRUCT-TOPICAL-THOUGHTS");

    private static final SubLSymbol _CSETF_RTG_STRUCT_TOPICAL_THOUGHTS = makeSymbol("_CSETF-RTG-STRUCT-TOPICAL-THOUGHTS");









    private static final SubLSymbol $MOST_RECENTLY_ADDED_THOUGHT = makeKeyword("MOST-RECENTLY-ADDED-THOUGHT");



    private static final SubLString $str83$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_RANDOM_THOUGHT_GENERATOR = makeSymbol("MAKE-RANDOM-THOUGHT-GENERATOR");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_RANDOM_THOUGHT_GENERATOR_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-RANDOM-THOUGHT-GENERATOR-METHOD");

    private static final SubLString $str89$__RTG_for__S___S_done__A__ = makeString("#<RTG for ~S (~S done ~A)>");

    private static final SubLString $$$_queued = makeString(" queued");

    private static final SubLString $$$exhausted = makeString("exhausted");





    public static final SubLList $list94 = list(makeSymbol("FORMAT-STR"), makeSymbol("&REST"), makeSymbol("ARGS"));



    private static final SubLSymbol $sym96$_PRINT_RTG_NOTES__ = makeSymbol("*PRINT-RTG-NOTES?*");



    private static final SubLList $list98 = list(makeSymbol("QUOTE"), makeSymbol("FORMAT"));





    private static final SubLList $list101 = list(list(makeSymbol("FORCE-OUTPUT"), T));



    private static final SubLString $str103$__Registering_interest_of__S_in__ = makeString("~&Registering interest of ~S in ~S~%");

    private static final SubLList $list104 = list(makeKeyword("NOW"), NIL, makeKeyword("REQUIRE-TOPICAL?"), T);



    private static final SubLSymbol $kw106$REQUIRE_TOPICAL_ = makeKeyword("REQUIRE-TOPICAL?");

    private static final SubLString $str107$__Waiting_for_new_thoughts_about_ = makeString("~&Waiting for new thoughts about ~S~%");

    private static final SubLFloat $float$0_5 = makeDouble(0.5);

    private static final SubLString $str109$___A_out_of_thoughts_about__S__ = makeString("~&~A out of thoughts about ~S~%");

    private static final SubLString $$$Totally = makeString("Totally");

    private static final SubLString $$$Temporarily = makeString("Temporarily");

    private static final SubLString $$$Random_Thought_Generator = makeString("Random Thought Generator");

    private static final SubLSymbol KEEP_RANDOM_THOUGHT_GENERATOR_FULL = makeSymbol("KEEP-RANDOM-THOUGHT-GENERATOR-FULL");

    private static final SubLInteger $int$25 = makeInteger(25);

    private static final SubLFloat $float$1_5 = makeDouble(1.5);



    private static final SubLString $str117$__Filling__S__ = makeString("~&Filling ~S~%");

    private static final SubLList $list118 = cons(makeSymbol("TOPIC"), makeSymbol("NEW-DATA"));

    private static final SubLString $str119$___S_is_now_full__ = makeString("~&~S is now full~%");

    private static final SubLString $str120$_S_is_not_in_an_updatable_state = makeString("~S is not in an updatable state");

    private static final SubLString $str121$__New_thought_concerning__S_____S = makeString("~&New thought concerning ~S:~% ~S~%");

    private static final SubLSymbol OPEN_CYC_FORT = makeSymbol("OPEN-CYC-FORT");

    private static final SubLSymbol $sym123$POTENTIALLY_PORN_RELATED_ = makeSymbol("POTENTIALLY-PORN-RELATED?");

    private static final SubLObject $$PotentiallyPornRelated = reader_make_constant_shell(makeString("PotentiallyPornRelated"));







    private static final SubLString $str128$__Found__S_GAF_assertions_about__ = makeString("~&Found ~S GAF assertions about ~S~%");

    private static final SubLString $str129$___Top_level_CycL___S = makeString("~% Top-level CycL: ~S");

    private static final SubLList $list130 = list(makeSymbol("TERM"), makeSymbol("ASSERTION"), makeSymbol("ASSERTION-PARAPHRASE"));

    private static final SubLSymbol $NEW_ARG_FROM_ASSERTION = makeKeyword("NEW-ARG-FROM-ASSERTION");

    private static final SubLSymbol $REUSE_MOST_RECENTLY_ADDED_TOPIC = makeKeyword("REUSE-MOST-RECENTLY-ADDED-TOPIC");



    public static SubLObject random_thought_p(final SubLObject v_object) {
        return makeBoolean((NIL != empty_random_thought_p(v_object)) || (NIL != non_empty_random_thought_p(v_object)));
    }

    public static SubLObject empty_random_thought_p(final SubLObject v_object) {
        return equal(v_object, $list0);
    }

    public static SubLObject non_empty_random_thought_p(final SubLObject v_object) {
        return pattern_match.tree_matches_pattern(v_object, $list1);
    }

    public static SubLObject xml_output_random_thoughts(final SubLObject number_of_thoughts, final SubLObject filename, SubLObject user) {
        if (user == UNPROVIDED) {
            user = $$Guest;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != subl_promotions.positive_integer_p(number_of_thoughts) : "subl_promotions.positive_integer_p(number_of_thoughts) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(number_of_thoughts) " + number_of_thoughts;
        assert NIL != stringp(filename) : "Types.stringp(filename) " + "CommonSymbols.NIL != Types.stringp(filename) " + filename;
        SubLObject stream = NIL;
        try {
            SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(filename, $OUTPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str6$Unable_to_open__S, filename);
            }
            _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
            try {
                xml_vars.$xml_stream$.bind(stream, thread);
                xml_utilities.xml_header(UNPROVIDED, UNPROVIDED, UNPROVIDED);
                final SubLObject local_state;
                final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                final SubLObject _prev_bind_0_$1 = memoization_state.$memoization_state$.currentBinding(thread);
                try {
                    memoization_state.$memoization_state$.bind(local_state, thread);
                    final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                    try {
                        final SubLObject _prev_bind_0_$2 = $last_percent_progress_index$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = $last_percent_progress_prediction$.currentBinding(thread);
                        final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
                        final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
                        try {
                            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                            $last_percent_progress_prediction$.bind(NIL, thread);
                            $within_noting_percent_progress$.bind(T, thread);
                            $percent_progress_start_time$.bind(get_universal_time(), thread);
                            try {
                                noting_percent_progress_preamble(cconcatenate($$$Generating_, new SubLObject[]{ format_nil.format_nil_d_no_copy(number_of_thoughts), $str8$_random_thoughts___ }));
                                try {
                                    final SubLObject _prev_bind_0_$3 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$4 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal($str9$random_thoughts, NIL, NIL, NIL, $UNINITIALIZED);
                                        final SubLObject _prev_bind_0_$4 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                            xml_utilities.xml_terpri();
                                            SubLObject i;
                                            for (i = NIL, i = ZERO_INTEGER; i.numL(number_of_thoughts); i = add(i, ONE_INTEGER)) {
                                                xml_output_random_thought(next_random_thought_for_user(user, $list11));
                                                xml_utilities.xml_terpri();
                                                force_output(xml_vars.$xml_stream$.getDynamicValue(thread));
                                                note_percent_progress(i, number_of_thoughts);
                                            }
                                        } finally {
                                            xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$4, thread);
                                        }
                                    } finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$4, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$3, thread);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        xml_utilities.xml_terpri();
                                        xml_utilities.xml_end_tag_internal($str9$random_thoughts);
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                                    }
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values2 = getValuesAsVector();
                                    noting_percent_progress_postamble();
                                    restoreValuesFromVector(_values2);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                                }
                            }
                        } finally {
                            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                            $last_percent_progress_index$.rebind(_prev_bind_0_$2, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$7 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values3 = getValuesAsVector();
                            memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                            restoreValuesFromVector(_values3);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$7, thread);
                        }
                    }
                } finally {
                    memoization_state.$memoization_state$.rebind(_prev_bind_0_$1, thread);
                }
            } finally {
                xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_5 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values4 = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values4);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
            }
        }
        return number_of_thoughts;
    }

    public static SubLObject xml_output_random_thoughts_for_terms(final SubLObject number_of_terms, final SubLObject filename, SubLObject start_after_fort) {
        if (start_after_fort == UNPROVIDED) {
            start_after_fort = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL != number_of_terms) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == subl_promotions.positive_integer_p(number_of_terms))) {
            throw new AssertionError(number_of_terms);
        }
        assert NIL != stringp(filename) : "Types.stringp(filename) " + "CommonSymbols.NIL != Types.stringp(filename) " + filename;
        SubLObject stream = NIL;
        try {
            SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(filename, $OUTPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str6$Unable_to_open__S, filename);
            }
            _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
            try {
                xml_vars.$xml_stream$.bind(stream, thread);
                xml_utilities.xml_header(UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject done_count = ZERO_INTEGER;
                SubLObject doneP = NIL;
                SubLObject ok_to_startP = sublisp_null(start_after_fort);
                final SubLObject local_state;
                final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                final SubLObject _prev_bind_0_$9 = memoization_state.$memoization_state$.currentBinding(thread);
                try {
                    memoization_state.$memoization_state$.bind(local_state, thread);
                    final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                    try {
                        try {
                            final SubLObject _prev_bind_0_$10 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$thoughts, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$11 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    xml_utilities.xml_terpri();
                                    final SubLObject message = cconcatenate($$$Exporting_random_thoughts_to_, format_nil.format_nil_s_no_copy(filename));
                                    final SubLObject total = forts.fort_count();
                                    SubLObject sofar = ZERO_INTEGER;
                                    final SubLObject _prev_bind_0_$12 = $last_percent_progress_index$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$13 = $last_percent_progress_prediction$.currentBinding(thread);
                                    final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
                                    final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
                                    try {
                                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                        $last_percent_progress_prediction$.bind(NIL, thread);
                                        $within_noting_percent_progress$.bind(T, thread);
                                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                                        try {
                                            noting_percent_progress_preamble(message);
                                            SubLObject rest;
                                            SubLObject idx;
                                            SubLObject table_var;
                                            SubLObject idx_$14;
                                            SubLObject vector_var;
                                            SubLObject backwardP_var;
                                            SubLObject length;
                                            SubLObject current;
                                            SubLObject datum;
                                            SubLObject start;
                                            SubLObject end;
                                            SubLObject delta;
                                            SubLObject end_var;
                                            SubLObject id;
                                            SubLObject fort;
                                            SubLObject thoughts;
                                            SubLObject idx_$15;
                                            SubLObject sparse;
                                            SubLObject id2;
                                            SubLObject end_id;
                                            SubLObject v_default;
                                            SubLObject fort2;
                                            SubLObject thoughts2;
                                            for (rest = NIL, rest = forts.do_forts_tables(); (NIL == doneP) && (NIL != rest); rest = rest.rest()) {
                                                table_var = idx = rest.first();
                                                if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
                                                    idx_$14 = idx;
                                                    if (NIL == id_index_dense_objects_empty_p(idx_$14, $SKIP)) {
                                                        vector_var = id_index_dense_objects(idx_$14);
                                                        backwardP_var = NIL;
                                                        length = length(vector_var);
                                                        datum = current = (NIL != backwardP_var) ? list(subtract(length, ONE_INTEGER), MINUS_ONE_INTEGER, MINUS_ONE_INTEGER) : list(ZERO_INTEGER, length, ONE_INTEGER);
                                                        start = NIL;
                                                        end = NIL;
                                                        delta = NIL;
                                                        destructuring_bind_must_consp(current, datum, $list15);
                                                        start = current.first();
                                                        current = current.rest();
                                                        destructuring_bind_must_consp(current, datum, $list15);
                                                        end = current.first();
                                                        current = current.rest();
                                                        destructuring_bind_must_consp(current, datum, $list15);
                                                        delta = current.first();
                                                        current = current.rest();
                                                        if (NIL == current) {
                                                            if (NIL == doneP) {
                                                                for (end_var = end, id = NIL, id = start; (NIL == doneP) && (NIL == subl_macros.do_numbers_endtest(id, delta, end_var)); id = add(id, delta)) {
                                                                    fort = aref(vector_var, id);
                                                                    if ((NIL == id_index_tombstone_p(fort)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                                                        if (NIL != id_index_tombstone_p(fort)) {
                                                                            fort = $SKIP;
                                                                        }
                                                                        sofar = add(sofar, ONE_INTEGER);
                                                                        note_percent_progress(sofar, total);
                                                                        if (((NIL != ok_to_startP) && (NIL != open_cyc_fort(fort))) && (NIL == fort_types_interface.predicate_p(fort))) {
                                                                            thoughts = all_random_thoughts_on_topic(fort);
                                                                            if (NIL != list_utilities.non_empty_list_p(thoughts)) {
                                                                                xml_output_random_thoughts_for_term(fort, thoughts);
                                                                                xml_utilities.xml_terpri();
                                                                                done_count = add(done_count, ONE_INTEGER);
                                                                                if (NIL != number_of_terms) {
                                                                                    doneP = numGE(done_count, number_of_terms);
                                                                                }
                                                                            }
                                                                        }
                                                                        if (fort.eql(start_after_fort)) {
                                                                            ok_to_startP = T;
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        } else {
                                                            cdestructuring_bind_error(datum, $list15);
                                                        }
                                                    }
                                                    idx_$15 = idx;
                                                    if ((NIL == id_index_sparse_objects_empty_p(idx_$15)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                                        sparse = id_index_sparse_objects(idx_$15);
                                                        id2 = id_index_sparse_id_threshold(idx_$15);
                                                        end_id = id_index_next_id(idx_$15);
                                                        v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                                                        while (id2.numL(end_id) && (NIL == doneP)) {
                                                            fort2 = gethash_without_values(id2, sparse, v_default);
                                                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(fort2))) {
                                                                sofar = add(sofar, ONE_INTEGER);
                                                                note_percent_progress(sofar, total);
                                                                if (((NIL != ok_to_startP) && (NIL != open_cyc_fort(fort2))) && (NIL == fort_types_interface.predicate_p(fort2))) {
                                                                    thoughts2 = all_random_thoughts_on_topic(fort2);
                                                                    if (NIL != list_utilities.non_empty_list_p(thoughts2)) {
                                                                        xml_output_random_thoughts_for_term(fort2, thoughts2);
                                                                        xml_utilities.xml_terpri();
                                                                        done_count = add(done_count, ONE_INTEGER);
                                                                        if (NIL != number_of_terms) {
                                                                            doneP = numGE(done_count, number_of_terms);
                                                                        }
                                                                    }
                                                                }
                                                                if (fort2.eql(start_after_fort)) {
                                                                    ok_to_startP = T;
                                                                }
                                                            }
                                                            id2 = add(id2, ONE_INTEGER);
                                                        } 
                                                    }
                                                }
                                            }
                                        } finally {
                                            final SubLObject _prev_bind_0_$13 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values = getValuesAsVector();
                                                noting_percent_progress_postamble();
                                                restoreValuesFromVector(_values);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
                                            }
                                        }
                                    } finally {
                                        $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                                        $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                                        $last_percent_progress_prediction$.rebind(_prev_bind_1_$13, thread);
                                        $last_percent_progress_index$.rebind(_prev_bind_0_$12, thread);
                                    }
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$11, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$10, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$14 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$thoughts);
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$14, thread);
                            }
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$15 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values3 = getValuesAsVector();
                            memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                            restoreValuesFromVector(_values3);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                        }
                    }
                } finally {
                    memoization_state.$memoization_state$.rebind(_prev_bind_0_$9, thread);
                }
            } finally {
                xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_5 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values4 = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values4);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
            }
        }
        return NIL;
    }

    public static SubLObject sql_output_random_thoughts_from_xml(final SubLObject xml_stream, final SubLObject output_filename, SubLObject id_tracker) {
        if (id_tracker == UNPROVIDED) {
            id_tracker = integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject token_iterator = xml_parsing_utilities.new_xml_token_iterator(xml_stream, NIL, NIL, NIL);
        SubLObject row_count = ZERO_INTEGER;
        final SubLObject max_rows_per_insert_statement = TEN_INTEGER;
        SubLObject written_some_rowP = NIL;
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(output_filename, $OUTPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str6$Unable_to_open__S, output_filename);
            }
            final SubLObject sql_stream = stream;
            write_random_thought_sql_header(sql_stream);
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
                    noting_percent_progress_preamble($str16$Parsing_XML_stream___);
                    xml_parsing_utilities.advance_xml_token_iterator_to_next_element(token_iterator);
                    iteration.iteration_next(token_iterator);
                    xml_parsing_utilities.advance_xml_token_iterator_to_next_element(token_iterator);
                    while (NIL != xml_parsing_utilities.xml_token_element_nameP(iteration.xml_token_iterator_peek(token_iterator), $str17$thoughts_about)) {
                        iteration.iteration_next(token_iterator);
                        xml_parsing_utilities.advance_xml_token_iterator_to_next_element(token_iterator);
                    } 
                    while (NIL == xml_parsing_utilities.xml_token_element_nameP(iteration.xml_token_iterator_peek(token_iterator), $$$thoughts)) {
                        final SubLObject sexpr = xml_parsing_utilities.xml_token_iterator_to_sexpr(token_iterator, UNPROVIDED);
                        final SubLObject topic_id = xml_parsing_utilities.xml_sexpr_attribute_value(sexpr, $str18$topic_id);
                        final SubLObject topic = kb_utilities.find_object_by_compact_hl_external_id_string(topic_id);
                        final SubLObject sexpr_type = xml_parsing_utilities.xml_sexpr_type(sexpr);
                        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!sexpr_type.equal($$$thought))) {
                            Errors.error($str20$Expected__thought___got__S, sexpr_type);
                        }
                        final SubLObject assertion_id = xml_parsing_utilities.xml_sexpr_attribute_value(sexpr, $str21$assertion_id);
                        final SubLObject assertion = kb_utilities.find_object_by_compact_hl_external_id_string(assertion_id);
                        if (NIL != assertion_handles.valid_assertionP(assertion, UNPROVIDED)) {
                            final SubLObject paraphrase_sexpr = xml_parsing_utilities.xml_sexpr_daughter(sexpr, $$$paraphrase);
                            final SubLObject paraphrase = xml_parsing_utilities.xml_sexpr_attribute_value(paraphrase_sexpr, $$$string);
                            if (paraphrase.isString()) {
                                final SubLObject thought_num = next_random_thought_num_for_topic(id_tracker, topic);
                                if (NIL != written_some_rowP) {
                                    if (mod(row_count, max_rows_per_insert_statement).isZero()) {
                                        format(sql_stream, $str24$_____);
                                        write_random_thought_sql_header(sql_stream);
                                    } else {
                                        format(sql_stream, $str25$___);
                                    }
                                }
                                write_random_thought_sql_row(thought_num, topic, assertion, paraphrase, sql_stream);
                                written_some_rowP = T;
                                row_count = add(row_count, ONE_INTEGER);
                            }
                        }
                        xml_parsing_utilities.advance_xml_token_iterator_to_next_element(token_iterator);
                        while (NIL != xml_parsing_utilities.xml_token_element_nameP(iteration.xml_token_iterator_peek(token_iterator), $str17$thoughts_about)) {
                            iteration.iteration_next(token_iterator);
                            xml_parsing_utilities.advance_xml_token_iterator_to_next_element(token_iterator);
                        } 
                        thread.resetMultipleValues();
                        final SubLObject done = xml_parsing_utilities.xml_token_iterator_progress(token_iterator);
                        final SubLObject total = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        note_percent_progress(done, total);
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$19 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_5, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_4, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_3, thread);
                $last_percent_progress_index$.rebind(_prev_bind_2, thread);
            }
            format(sql_stream, $str24$_____);
        } finally {
            final SubLObject _prev_bind_6 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_6, thread);
            }
        }
        return values(output_filename, id_tracker);
    }

    public static SubLObject next_random_thought_num_for_topic(final SubLObject id_tracker, final SubLObject topic) {
        return integer_sequence_generator.integer_sequence_generator_next(id_tracker);
    }

    public static SubLObject write_random_thought_sql_header(final SubLObject sql_stream) {
        princ($str26$INSERT_INTO_THOUGHTS_INTERNAL_ID_, sql_stream);
        terpri(sql_stream);
        return NIL;
    }

    public static SubLObject write_random_thought_sql_row(final SubLObject thought_num, final SubLObject topic, final SubLObject assertion, final SubLObject paraphrase, final SubLObject sql_stream) {
        assert NIL != stringp(paraphrase) : "Types.stringp(paraphrase) " + "CommonSymbols.NIL != Types.stringp(paraphrase) " + paraphrase;
        format(sql_stream, $str27$___D____A_____A_____A_____A_____A, new SubLObject[]{ thought_num, kb_utilities.compact_hl_external_id_string(topic), topic, kb_utilities.compact_hl_external_id_string(assertion), uncanonicalizer.assertion_el_formula(assertion), uncanonicalizer.assertion_elmt(assertion), NIL != find(CHAR_quote, paraphrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) ? string_utilities.replace_substring(paraphrase, $str28$_, $str29$__) : paraphrase });
        return NIL;
    }

    public static SubLObject xml_output_random_thoughts_for_term(final SubLObject v_term, SubLObject thoughts) {
        if (thoughts == UNPROVIDED) {
            thoughts = all_random_thoughts_on_topic(v_term);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(v_term) : "forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) " + v_term;
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal($str17$thoughts_about, list($$$term, kb_utilities.compact_hl_external_id_string(v_term)), NIL, NIL, $UNINITIALIZED);
                final SubLObject _prev_bind_0_$20 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                    xml_utilities.xml_terpri();
                    SubLObject cdolist_list_var = thoughts;
                    SubLObject thought = NIL;
                    thought = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        xml_output_random_thought(thought);
                        xml_utilities.xml_terpri();
                        force_output(xml_vars.$xml_stream$.getDynamicValue(thread));
                        cdolist_list_var = cdolist_list_var.rest();
                        thought = cdolist_list_var.first();
                    } 
                } finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$20, thread);
                }
            } finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal($str17$thoughts_about);
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return v_term;
    }

    public static SubLObject xml_output_random_thought(final SubLObject random_thought) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != valid_non_empty_random_thought_p(random_thought) : "random_thought_generator.valid_non_empty_random_thought_p(random_thought) " + "CommonSymbols.NIL != random_thought_generator.valid_non_empty_random_thought_p(random_thought) " + random_thought;
        final SubLObject attributes = list($str18$topic_id, kb_utilities.compact_hl_external_id_string(random_thought.first()), $str21$assertion_id, kb_utilities.compact_hl_external_id_string(second(random_thought)));
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal($$$thought, attributes, NIL, NIL, $UNINITIALIZED);
                final SubLObject _prev_bind_0_$21 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                    xml_utilities.xml_terpri();
                    pph_html.xml_output_pph_javalist(third(random_thought));
                } finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$21, thread);
                }
            } finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values = getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal($$$thought);
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return NIL;
    }

    public static SubLObject valid_non_empty_random_thought_p(final SubLObject v_object) {
        return makeBoolean(((NIL != non_empty_random_thought_p(v_object)) && (NIL != forts.valid_fortP(v_object.first()))) && (NIL != assertion_handles.valid_assertionP(second(v_object), UNPROVIDED)));
    }

    public static SubLObject next_random_thought_for_user(final SubLObject user, SubLObject parameters) {
        if (parameters == UNPROVIDED) {
            parameters = NIL;
        }
        assert NIL != forts.fort_p(user) : "forts.fort_p(user) " + "CommonSymbols.NIL != forts.fort_p(user) " + user;
        final SubLObject rtg = find_or_create_random_thought_generator_for_user(user);
        if (NIL != getf(parameters, $TOPIC, NIL)) {
            return next_random_thought_with_suggested_topic(rtg, parameters);
        }
        return next_random_thought_without_suggested_topic(rtg, parameters);
    }

    public static SubLObject thcl_assertion_seen_by_cyclistP(final SubLObject assertion, final SubLObject cyclist) {
        if (NIL == forts.fort_p(cyclist)) {
            return NIL;
        }
        final SubLObject rtg = find_random_thought_generator_for_user(cyclist);
        return makeBoolean((NIL != rtg) && (NIL != set.set_memberP(assertion, rtg_done_assertions(rtg))));
    }

    public static SubLObject number_of_queued_random_thoughts_for_user(final SubLObject user) {
        assert NIL != forts.fort_p(user) : "forts.fort_p(user) " + "CommonSymbols.NIL != forts.fort_p(user) " + user;
        final SubLObject rtg = find_random_thought_generator_for_user(user);
        return NIL != rtg ? queues.queue_size(rtg_queue(rtg)) : ZERO_INTEGER;
    }

    public static SubLObject number_of_used_random_thoughts_for_user(final SubLObject user) {
        assert NIL != forts.fort_p(user) : "forts.fort_p(user) " + "CommonSymbols.NIL != forts.fort_p(user) " + user;
        final SubLObject rtg = find_random_thought_generator_for_user(user);
        return NIL != rtg ? subtract(set.set_size(rtg_done_assertions(rtg)), number_of_queued_random_thoughts_for_user(user)) : ZERO_INTEGER;
    }

    public static SubLObject remote_random_thought_image() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == remote_image.remote_image_p($remote_random_thought_image$.getGlobalValue())) {
            set_remote_random_thought_image($random_thought_server_host$.getDynamicValue(thread), $random_thought_server_port$.getDynamicValue(thread), $CFASL);
        }
        return $remote_random_thought_image$.getGlobalValue();
    }

    public static SubLObject set_remote_random_thought_image(final SubLObject machine, final SubLObject port, final SubLObject protocol) {
        $remote_random_thought_image$.setGlobalValue(remote_image.new_remote_image(machine, port, protocol));
        return remote_image.remote_image_p($remote_random_thought_image$.getGlobalValue());
    }

    public static SubLObject unset_remote_random_thought_image() {
        $remote_random_thought_image$.setGlobalValue(NIL);
        return T;
    }

    public static SubLObject clear_remote_random_thought_connection_pool() {
        for (SubLObject q = $remote_random_thought_connection_pool$.getGlobalValue(), done_var = queues.queue_empty_p(q); NIL == done_var; done_var = queues.queue_empty_p(q)) {
            final SubLObject connection = queues.dequeue(q);
            remote_image.close_remote_image_connection(connection);
        }
        return T;
    }

    public static SubLObject random_thought_server_hostXport() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject host = NIL;
        SubLObject port = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    final SubLObject connection = get_free_random_thought_connection();
                    SubLObject success_var = NIL;
                    try {
                        if (NIL != open_remote_random_thought_connection_p(connection)) {
                            final SubLObject image = remote_image.remote_image_connection_image(connection);
                            final SubLObject cfasl_port = remote_image.remote_image_port(image);
                            host = remote_image.remote_image_machine(image);
                            port = subtract(cfasl_port, system_parameters.$cfasl_port_offset$.getDynamicValue(thread));
                            release_random_thought_connection(connection);
                        }
                        success_var = T;
                    } finally {
                        final SubLObject _prev_bind_0_$22 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL == success_var) {
                                remote_image.close_remote_image_connection(connection);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$22, thread);
                        }
                    }
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
        return values(host, port);
    }

    public static SubLObject next_random_thought_for_user_from_remote_server(final SubLObject user, final SubLObject parameters) {
        SubLObject thought;
        for (thought = $NOT_TRIED; (NIL != thought) && (NIL == valid_non_empty_random_thought_p(thought)); thought = next_random_thought_for_user_from_remote_server_int(user, parameters)) {
        }
        return thought;
    }

    public static SubLObject next_random_thought_for_user_from_remote_server_int(final SubLObject user, final SubLObject parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject api_request = list(NEXT_RANDOM_THOUGHT_FOR_USER, list(QUOTE, user), list(QUOTE, parameters));
        final SubLObject augmented_api_request = list(PROGN, $list51, list(MULTIPLE_VALUE_LIST, api_request));
        SubLObject results_list = NIL;
        SubLObject connection = NIL;
        SubLObject error_message = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    connection = get_free_random_thought_connection();
                    SubLObject success_var = NIL;
                    try {
                        results_list = remote_image.remote_image_connection_eval(connection, augmented_api_request);
                        release_random_thought_connection(connection);
                        success_var = T;
                    } finally {
                        final SubLObject _prev_bind_0_$23 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (NIL == success_var) {
                                remote_image.close_remote_image_connection(connection);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$23, thread);
                        }
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != error_message) {
            Errors.warn(error_message);
        }
        return NIL != results_list ? subl_promotions.values_list(results_list) : NIL;
    }

    public static SubLObject create_remote_random_thought_connection() {
        final SubLObject v_remote_image = remote_random_thought_image();
        final SubLObject connection = remote_image.new_remote_image_connection(v_remote_image);
        if (NIL != remote_image.remote_image_connection_p(connection)) {
            remote_image.open_remote_image_connection(connection);
            return connection;
        }
        return Errors.error($str54$Could_not_open_a_connection_to__s, v_remote_image);
    }

    public static SubLObject release_random_thought_connection(final SubLObject connection) {
        SubLObject release = NIL;
        try {
            release = seize_lock($remote_random_thought_connection_pool_lock$.getGlobalValue());
            if (queues.queue_size($remote_random_thought_connection_pool$.getGlobalValue()).numGE($remote_random_thought_connection_pool_max_size$.getGlobalValue())) {
                remote_image.close_remote_image_connection(connection);
            } else {
                queues.enqueue(connection, $remote_random_thought_connection_pool$.getGlobalValue());
            }
        } finally {
            if (NIL != release) {
                release_lock($remote_random_thought_connection_pool_lock$.getGlobalValue());
            }
        }
        return T;
    }

    public static SubLObject open_remote_random_thought_connection_p(final SubLObject v_object) {
        return makeBoolean((NIL != remote_image.remote_image_connection_p(v_object)) && (NIL != open_stream_p(remote_image.remote_image_connection_channel(v_object))));
    }

    public static SubLObject get_free_random_thought_connection() {
        SubLObject connection = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock($remote_random_thought_connection_pool_lock$.getGlobalValue());
            for (SubLObject q = $remote_random_thought_connection_pool$.getGlobalValue(), done_var = makeBoolean((NIL != connection) || (NIL != queues.queue_empty_p(q))); NIL == done_var; done_var = makeBoolean((NIL != connection) || (NIL != queues.queue_empty_p(q)))) {
                final SubLObject candidate = queues.dequeue(q);
                if (NIL != open_remote_random_thought_connection_p(candidate)) {
                    connection = candidate;
                }
            }
            if (NIL == connection) {
                connection = create_remote_random_thought_connection();
            }
        } finally {
            if (NIL != release) {
                release_lock($remote_random_thought_connection_pool_lock$.getGlobalValue());
            }
        }
        return connection;
    }

    public static SubLObject register_random_thought_generator(final SubLObject rtg, final SubLObject user) {
        return dictionary.dictionary_enter($random_thought_generators_for_users$.getGlobalValue(), user, rtg);
    }

    public static SubLObject find_random_thought_generator_for_user(final SubLObject user) {
        return dictionary.dictionary_lookup($random_thought_generators_for_users$.getGlobalValue(), user, NIL);
    }

    public static SubLObject random_thought_generator_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        pprint_random_thought_generator(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject random_thought_generator_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$random_thought_generator_native.class ? T : NIL;
    }

    public static SubLObject rtg_struct_user(final SubLObject v_object) {
        assert NIL != random_thought_generator_p(v_object) : "random_thought_generator.random_thought_generator_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject rtg_struct_done_assertions(final SubLObject v_object) {
        assert NIL != random_thought_generator_p(v_object) : "random_thought_generator.random_thought_generator_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject rtg_struct_generator_thread(final SubLObject v_object) {
        assert NIL != random_thought_generator_p(v_object) : "random_thought_generator.random_thought_generator_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject rtg_struct_queue(final SubLObject v_object) {
        assert NIL != random_thought_generator_p(v_object) : "random_thought_generator.random_thought_generator_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject rtg_struct_most_recently_added_thought(final SubLObject v_object) {
        assert NIL != random_thought_generator_p(v_object) : "random_thought_generator.random_thought_generator_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject rtg_struct_topical_thoughts(final SubLObject v_object) {
        assert NIL != random_thought_generator_p(v_object) : "random_thought_generator.random_thought_generator_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject _csetf_rtg_struct_user(final SubLObject v_object, final SubLObject value) {
        assert NIL != random_thought_generator_p(v_object) : "random_thought_generator.random_thought_generator_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_rtg_struct_done_assertions(final SubLObject v_object, final SubLObject value) {
        assert NIL != random_thought_generator_p(v_object) : "random_thought_generator.random_thought_generator_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_rtg_struct_generator_thread(final SubLObject v_object, final SubLObject value) {
        assert NIL != random_thought_generator_p(v_object) : "random_thought_generator.random_thought_generator_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_rtg_struct_queue(final SubLObject v_object, final SubLObject value) {
        assert NIL != random_thought_generator_p(v_object) : "random_thought_generator.random_thought_generator_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_rtg_struct_most_recently_added_thought(final SubLObject v_object, final SubLObject value) {
        assert NIL != random_thought_generator_p(v_object) : "random_thought_generator.random_thought_generator_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_rtg_struct_topical_thoughts(final SubLObject v_object, final SubLObject value) {
        assert NIL != random_thought_generator_p(v_object) : "random_thought_generator.random_thought_generator_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject make_random_thought_generator(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $random_thought_generator_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($USER)) {
                _csetf_rtg_struct_user(v_new, current_value);
            } else
                if (pcase_var.eql($DONE_ASSERTIONS)) {
                    _csetf_rtg_struct_done_assertions(v_new, current_value);
                } else
                    if (pcase_var.eql($GENERATOR_THREAD)) {
                        _csetf_rtg_struct_generator_thread(v_new, current_value);
                    } else
                        if (pcase_var.eql($QUEUE)) {
                            _csetf_rtg_struct_queue(v_new, current_value);
                        } else
                            if (pcase_var.eql($MOST_RECENTLY_ADDED_THOUGHT)) {
                                _csetf_rtg_struct_most_recently_added_thought(v_new, current_value);
                            } else
                                if (pcase_var.eql($TOPICAL_THOUGHTS)) {
                                    _csetf_rtg_struct_topical_thoughts(v_new, current_value);
                                } else {
                                    Errors.error($str83$Invalid_slot__S_for_construction_, current_arg);
                                }





        }
        return v_new;
    }

    public static SubLObject visit_defstruct_random_thought_generator(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_RANDOM_THOUGHT_GENERATOR, SIX_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $USER, rtg_struct_user(obj));
        funcall(visitor_fn, obj, $SLOT, $DONE_ASSERTIONS, rtg_struct_done_assertions(obj));
        funcall(visitor_fn, obj, $SLOT, $GENERATOR_THREAD, rtg_struct_generator_thread(obj));
        funcall(visitor_fn, obj, $SLOT, $QUEUE, rtg_struct_queue(obj));
        funcall(visitor_fn, obj, $SLOT, $MOST_RECENTLY_ADDED_THOUGHT, rtg_struct_most_recently_added_thought(obj));
        funcall(visitor_fn, obj, $SLOT, $TOPICAL_THOUGHTS, rtg_struct_topical_thoughts(obj));
        funcall(visitor_fn, obj, $END, MAKE_RANDOM_THOUGHT_GENERATOR, SIX_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_random_thought_generator_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_random_thought_generator(obj, visitor_fn);
    }

    public static SubLObject rtg_user(final SubLObject rtg) {
        return rtg_struct_user(rtg);
    }

    public static SubLObject rtg_done_assertions(final SubLObject rtg) {
        return rtg_struct_done_assertions(rtg);
    }

    public static SubLObject rtg_generator_thread(final SubLObject rtg) {
        return rtg_struct_generator_thread(rtg);
    }

    public static SubLObject rtg_set_generator_thread(final SubLObject rtg, final SubLObject process) {
        _csetf_rtg_struct_generator_thread(rtg, process);
        return process;
    }

    public static SubLObject rtg_queue(final SubLObject rtg) {
        return rtg_struct_queue(rtg);
    }

    public static SubLObject rtg_most_recently_added_thought(final SubLObject rtg) {
        return rtg_struct_most_recently_added_thought(rtg);
    }

    public static SubLObject rtg_set_most_recently_added_thought(final SubLObject rtg, final SubLObject thought) {
        _csetf_rtg_struct_most_recently_added_thought(rtg, thought);
        return thought;
    }

    public static SubLObject rtg_topical_thoughts(final SubLObject rtg) {
        return rtg_struct_topical_thoughts(rtg);
    }

    public static SubLObject rtg_set_topical_thoughts(final SubLObject rtg, final SubLObject thoughts) {
        _csetf_rtg_struct_topical_thoughts(rtg, thoughts);
        return thoughts;
    }

    public static SubLObject pprint_random_thought_generator(final SubLObject rtg, SubLObject stream, SubLObject depth) {
        if (stream == UNPROVIDED) {
            stream = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        format(stream, $str89$__RTG_for__S___S_done__A__, new SubLObject[]{ rtg_struct_user(rtg), set.set_size(rtg_struct_done_assertions(rtg)), NIL != queues.queue_p(rtg_struct_queue(rtg)) ? cconcatenate(format_nil.format_nil_s_no_copy(queues.queue_size(rtg_struct_queue(rtg))), $$$_queued) : $$$exhausted });
        return rtg;
    }

    public static SubLObject find_or_create_random_thought_generator_for_user(final SubLObject user) {
        assert NIL != forts.fort_p(user) : "forts.fort_p(user) " + "CommonSymbols.NIL != forts.fort_p(user) " + user;
        final SubLObject existing = find_random_thought_generator_for_user(user);
        return NIL != existing ? existing : new_random_thought_generator_for_user(user);
    }

    public static SubLObject empty_thought() {
        return $list0;
    }

    public static SubLObject new_random_thought_generator_for_user(final SubLObject user) {
        final SubLObject rtg = new_random_thought_generator();
        _csetf_rtg_struct_user(rtg, user);
        register_random_thought_generator(rtg, user);
        find_or_create_random_thought_generator_thread(rtg, UNPROVIDED);
        return rtg;
    }

    public static SubLObject new_random_thought_generator() {
        final SubLObject rtg = make_random_thought_generator(list(new SubLObject[]{ $USER, NIL, $DONE_ASSERTIONS, set.new_set(UNPROVIDED, UNPROVIDED), $QUEUE, queues.create_queue(UNPROVIDED), $MOST_RECENTLY_ADDED_THOUGHT, empty_thought(), $TOPICAL_THOUGHTS, dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED) }));
        return rtg;
    }

    public static SubLObject note_rtg_exhausted(final SubLObject rtg) {
        rtg_set_generator_thread(rtg, $EXHAUSTED);
        return rtg;
    }

    public static SubLObject random_thought_generator_exhausted_p(final SubLObject rtg) {
        return eq($EXHAUSTED, rtg_generator_thread(rtg));
    }

    public static SubLObject random_thoughts_on_topic_exhausted_p(final SubLObject data) {
        return makeBoolean((NIL == data.rest()) || $EXHAUSTED.eql(data.rest()));
    }

    public static SubLObject note_random_thoughts_on_topic_exhausted(final SubLObject data) {
        return rplacd(data, $EXHAUSTED);
    }

    public static SubLObject random_thought_generator_full_p(final SubLObject rtg, final SubLObject target_size) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject not_fullP;
        SubLObject iteration_state;
        for (not_fullP = makeBoolean(NIL == random_thought_generator_queue_full_p(rtg, target_size)), iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(rtg_topical_thoughts(rtg))); (NIL == not_fullP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject data = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if ((!data.isCons()) || ((NIL == random_thoughts_on_topic_exhausted_p(data)) && (NIL == data.first()))) {
                not_fullP = T;
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return makeBoolean(NIL == not_fullP);
    }

    public static SubLObject random_thought_generator_queue_full_p(final SubLObject rtg, final SubLObject target_size) {
        return numGE(queues.queue_size(rtg_queue(rtg)), target_size);
    }

    public static SubLObject declare_interest_in_random_thoughts_about_topic(final SubLObject rtg, final SubLObject topic) {
        final SubLObject topical_thoughts = rtg_topical_thoughts(rtg);
        if (NIL == dictionary.dictionary_lookup(topical_thoughts, topic, NIL)) {
            register_interest_in_random_thoughts_about_topic(rtg, topic);
            dictionary.dictionary_enter(topical_thoughts, topic, $NEW_TOPIC);
        }
        return rtg;
    }

    public static SubLObject rtg_note(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject format_str = NIL;
        destructuring_bind_must_consp(current, datum, $list94);
        format_str = current.first();
        final SubLObject args;
        current = args = current.rest();
        return listS(PWHEN, $sym96$_PRINT_RTG_NOTES__, list(APPLY, $list98, list(CONS, T, listS(LIST, format_str, append(args, NIL)))), $list101);
    }

    public static SubLObject register_interest_in_random_thoughts_about_topic(final SubLObject rtg, final SubLObject topic) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(topic) : "forts.fort_p(topic) " + "CommonSymbols.NIL != forts.fort_p(topic) " + topic;
        final SubLObject topical_thoughts = rtg_topical_thoughts(rtg);
        if (NIL != $print_rtg_notesP$.getDynamicValue(thread)) {
            apply(FORMAT, cons(T, list($str103$__Registering_interest_of__S_in__, rtg_user(rtg), topic)));
            force_output(T);
        }
        dictionary.dictionary_enter(topical_thoughts, topic, $NEW_TOPIC);
        return rtg;
    }

    public static SubLObject all_random_thoughts_on_topic(final SubLObject topic) {
        assert NIL != forts.fort_p(topic) : "forts.fort_p(topic) " + "CommonSymbols.NIL != forts.fort_p(topic) " + topic;
        final SubLObject rtg = new_random_thought_generator();
        SubLObject thoughts = NIL;
        SubLObject doneP = NIL;
        while (NIL == doneP) {
            final SubLObject thought = next_random_thought_with_suggested_topic(rtg, listS($TOPIC, topic, $list104));
            if (NIL != empty_random_thought_p(thought)) {
                doneP = T;
            } else {
                thoughts = cons(thought, thoughts);
            }
        } 
        kill_process(rtg_generator_thread(rtg));
        return thoughts;
    }

    public static SubLObject next_random_thought_with_suggested_topic(final SubLObject rtg, final SubLObject parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject topic_tail = property_list_member($TOPIC, parameters);
        final SubLObject topic = (NIL != topic_tail) ? cadr(topic_tail) : NIL;
        final SubLObject now_tail = property_list_member($NOW, parameters);
        final SubLObject now = (NIL != now_tail) ? cadr(now_tail) : T;
        final SubLObject require_topicalP_tail = property_list_member($kw106$REQUIRE_TOPICAL_, parameters);
        final SubLObject require_topicalP = (NIL != require_topicalP_tail) ? cadr(require_topicalP_tail) : NIL;
        register_interest_in_random_thoughts_about_topic(rtg, topic);
        final SubLObject topical_thoughts = rtg_topical_thoughts(rtg);
        SubLObject existing_info = dictionary.dictionary_lookup(topical_thoughts, topic, NIL);
        SubLObject thought = NIL;
        if ((!existing_info.isCons()) && (NIL == now)) {
            final SubLObject generator_thread = find_or_create_random_thought_generator_thread(rtg, T);
            SubLObject stopP = NIL;
            if (NIL != $print_rtg_notesP$.getDynamicValue(thread)) {
                apply(FORMAT, cons(T, list($str107$__Waiting_for_new_thoughts_about_, topic)));
                force_output(T);
            }
            while (NIL == stopP) {
                existing_info = dictionary.dictionary_lookup(topical_thoughts, topic, NIL);
                sleep($float$0_5);
                stopP = makeBoolean(existing_info.isCons() || (NIL == valid_process_p(generator_thread)));
            } 
        }
        if (existing_info.isCons()) {
            thought = existing_info.first();
            final SubLObject freshly_exhaustedP = sublisp_null(existing_info.rest());
            final SubLObject known_exhaustedP = makeBoolean((NIL != freshly_exhaustedP) || (NIL != random_thoughts_on_topic_exhausted_p(existing_info)));
            if (NIL != freshly_exhaustedP) {
                note_random_thoughts_on_topic_exhausted(existing_info);
            }
            if (NIL == thought) {
                if (((NIL != freshly_exhaustedP) || (NIL == known_exhaustedP)) && (NIL != $print_rtg_notesP$.getDynamicValue(thread))) {
                    apply(FORMAT, cons(T, list($str109$___A_out_of_thoughts_about__S__, NIL != known_exhaustedP ? $$$Totally : $$$Temporarily, topic)));
                    force_output(T);
                }
                if ((NIL == now) && (NIL == known_exhaustedP)) {
                    final SubLObject generator_thread2 = find_or_create_random_thought_generator_thread(rtg, UNPROVIDED);
                    SubLObject stopP2 = NIL;
                    if (NIL != $print_rtg_notesP$.getDynamicValue(thread)) {
                        apply(FORMAT, cons(T, list($str107$__Waiting_for_new_thoughts_about_, topic)));
                        force_output(T);
                    }
                    while (NIL == stopP2) {
                        sleep($float$0_5);
                        thought = existing_info.first();
                        stopP2 = makeBoolean(((NIL != thought) || (NIL == existing_info.rest())) || (NIL == valid_process_p(generator_thread2)));
                    } 
                }
            }
            rplaca(existing_info, NIL);
        } else
            if (NIL == dictionary.dictionary_lookup(topical_thoughts, topic, NIL)) {
                register_interest_in_random_thoughts_about_topic(rtg, topic);
            }

        return NIL != thought ? thought : NIL != require_topicalP ? empty_thought() : next_random_thought_without_suggested_topic(rtg, parameters);
    }

    public static SubLObject next_random_thought_without_suggested_topic(SubLObject rtg, final SubLObject parameters) {
        final SubLObject queue = rtg_queue(rtg);
        SubLObject thought = empty_thought();
        if ((NIL != queues.queue_empty_p(queue)) && (NIL != random_thought_generator_exhausted_p(rtg))) {
            set.clear_set(rtg_done_assertions(rtg));
            rtg = new_random_thought_generator_for_user(rtg_user(rtg));
        }
        for (SubLObject generator_thread = find_or_create_random_thought_generator_thread(rtg, UNPROVIDED), dont_waitP = getf(parameters, $NOW, T), stopP = NIL; NIL == stopP; stopP = makeBoolean(((NIL != dont_waitP) || (NIL != thought.first())) || (NIL == valid_process_p(generator_thread)))) {
            thought = queues.dequeue(queue);
        }
        return thought;
    }

    public static SubLObject find_or_create_random_thought_generator_thread(final SubLObject rtg, SubLObject topical_onlyP) {
        if (topical_onlyP == UNPROVIDED) {
            topical_onlyP = NIL;
        }
        SubLObject generator_thread = rtg_generator_thread(rtg);
        if (NIL == valid_process_p(generator_thread)) {
            generator_thread = process_utilities.make_cyc_server_process_with_args($$$Random_Thought_Generator, KEEP_RANDOM_THOUGHT_GENERATOR_FULL, list(rtg, NIL != topical_onlyP ? ZERO_INTEGER : $int$25));
            SubLObject doneP = NIL;
            SubLObject interval_ms = ONE_INTEGER;
            final SubLObject increase_factor = $float$1_5;
            final SubLObject max_ms = NIL;
            while (NIL == doneP) {
                doneP = valid_process_p(generator_thread);
                if (NIL == doneP) {
                    sleep(divide(interval_ms, $int$1000));
                    if (interval_ms.numGE(max_ms)) {
                        continue;
                    }
                    final SubLObject new_interval = multiply(interval_ms, increase_factor);
                    interval_ms = min(new_interval, max_ms);
                }
            } 
            rtg_set_generator_thread(rtg, generator_thread);
        }
        return generator_thread;
    }

    public static SubLObject keep_random_thought_generator_full(final SubLObject rtg, SubLObject target_size, SubLObject check_interval) {
        if (target_size == UNPROVIDED) {
            target_size = $int$25;
        }
        if (check_interval == UNPROVIDED) {
            check_interval = TEN_INTEGER;
        }
        while (NIL == random_thought_generator_exhausted_p(rtg)) {
            if (NIL != random_thought_generator_full_p(rtg, target_size)) {
                sleep(check_interval);
            } else {
                fill_random_thought_generator(rtg, target_size);
            }
        } 
        return rtg;
    }

    public static SubLObject fill_random_thought_generator(final SubLObject rtg, final SubLObject target_size) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $print_rtg_notesP$.getDynamicValue(thread)) {
            apply(FORMAT, cons(T, list($str117$__Filling__S__, rtg)));
            force_output(T);
        }
        SubLObject new_entries = NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(rtg_topical_thoughts(rtg))); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject topic = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject data = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if ($NEW_TOPIC.eql(data)) {
                new_entries = list_utilities.alist_enter(new_entries, topic, update_random_thought_data(new_random_thought_data_for_topic(topic), topic, rtg), UNPROVIDED);
            } else
                if ((NIL == data.first()) && (NIL == random_thoughts_on_topic_exhausted_p(data))) {
                    new_entries = list_utilities.alist_enter(new_entries, topic, update_random_thought_data(data, topic, rtg), UNPROVIDED);
                }

        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        SubLObject cdolist_list_var = new_entries;
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject topic2 = NIL;
            SubLObject new_data = NIL;
            destructuring_bind_must_consp(current, datum, $list118);
            topic2 = current.first();
            current = new_data = current.rest();
            dictionary.dictionary_enter(rtg_topical_thoughts(rtg), topic2, new_data);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        if (NIL != list_utilities.empty_list_p(new_entries)) {
            fill_random_thought_generator_queue(rtg, target_size);
        }
        if (NIL != $print_rtg_notesP$.getDynamicValue(thread)) {
            apply(FORMAT, cons(T, list($str119$___S_is_now_full__, rtg)));
            force_output(T);
        }
        return rtg;
    }

    public static SubLObject update_random_thought_data(final SubLObject data, final SubLObject topic, final SubLObject rtg) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((!data.isCons()) || (NIL != data.first()))) {
            Errors.error($str120$_S_is_not_in_an_updatable_state, data);
        }
        while ((NIL == data.first()) && (NIL != data.rest())) {
            thread.resetMultipleValues();
            final SubLObject remaining = list_utilities.random_delete(data.rest());
            final SubLObject candidate = thread.secondMultipleValue();
            thread.resetMultipleValues();
            rplacd(data, remaining);
            final SubLObject really_newP = set.set_add(candidate, rtg_done_assertions(rtg));
            if ((((NIL != really_newP) && (NIL != open_cyc_formula(candidate))) && (NIL != thcl.thcl_formulaP(candidate, UNPROVIDED))) && (NIL == potentially_porn_relatedP(candidate))) {
                final SubLObject paraphrase = thcl_paraphrase_for_assertion(candidate);
                if (NIL == paraphrase) {
                    continue;
                }
                if (NIL != $print_rtg_notesP$.getDynamicValue(thread)) {
                    apply(FORMAT, cons(T, list($str121$__New_thought_concerning__S_____S, topic, pph_utilities.pph_javalist_string(paraphrase))));
                    force_output(T);
                }
                rplaca(data, list(topic, candidate, paraphrase));
            }
        } 
        return data;
    }

    public static SubLObject open_cyc_formula(final SubLObject formula) {
        return makeBoolean(NIL == list_utilities.find_if_not(OPEN_CYC_FORT, cycl_utilities.expression_gather(formula, FORT_P, T, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject open_cyc_fort_internal(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push($IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                try {
                    ans = owl_cycl_to_xml.fort_has_exported_owl_opencyc_contentP(fort);
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
        return ans;
    }

    public static SubLObject open_cyc_fort(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return open_cyc_fort_internal(fort);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, OPEN_CYC_FORT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), OPEN_CYC_FORT, ONE_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, OPEN_CYC_FORT, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, fort, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(open_cyc_fort_internal(fort)));
            memoization_state.caching_state_put(caching_state, fort, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject potentially_porn_relatedP_internal(final SubLObject obj) {
        if (NIL != forts.fort_p(obj)) {
            return isa.quoted_isa_in_any_mtP(obj, $$PotentiallyPornRelated);
        }
        if (NIL != el_formula_p(obj)) {
            SubLObject result = NIL;
            final SubLObject args = cycl_utilities.formula_args(obj, $IGNORE);
            SubLObject rest;
            SubLObject arg;
            for (rest = NIL, rest = args; (NIL == result) && (NIL != rest); rest = rest.rest()) {
                arg = rest.first();
                if (NIL != potentially_porn_relatedP(arg)) {
                    result = T;
                }
            }
            return result;
        }
        return NIL;
    }

    public static SubLObject potentially_porn_relatedP(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return potentially_porn_relatedP_internal(obj);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym123$POTENTIALLY_PORN_RELATED_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym123$POTENTIALLY_PORN_RELATED_, ONE_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym123$POTENTIALLY_PORN_RELATED_, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, obj, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(potentially_porn_relatedP_internal(obj)));
            memoization_state.caching_state_put(caching_state, obj, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject new_random_thought_data_for_topic(final SubLObject topic) {
        return cons(NIL, gafs_about_topic(topic));
    }

    public static SubLObject gafs_about_topic(final SubLObject topic) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject gafs = NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(thcl.random_thcl_assertion_mt());
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject preds_to_skip = set.new_set(symbol_function(EQL), UNPROVIDED);
            final SubLObject pred_var = NIL;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(topic, NIL, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(topic, NIL, pred_var);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                            SubLObject done_var_$24 = NIL;
                            final SubLObject token_var_$25 = NIL;
                            while (NIL == done_var_$24) {
                                final SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$25);
                                final SubLObject valid_$26 = makeBoolean(!token_var_$25.eql(gaf));
                                if (NIL != valid_$26) {
                                    final SubLObject pred = assertions_high.gaf_arg0(gaf);
                                    if (NIL == set.set_memberP(pred, preds_to_skip)) {
                                        if (NIL == gaf_about_topicP(gaf, topic, pred)) {
                                            set.set_add(pred, preds_to_skip);
                                        } else {
                                            gafs = cons(gaf, gafs);
                                        }
                                    }
                                }
                                done_var_$24 = makeBoolean(NIL == valid_$26);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$27 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$27, thread);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        if (NIL != $print_rtg_notesP$.getDynamicValue(thread)) {
            apply(FORMAT, cons(T, list($str128$__Found__S_GAF_assertions_about__, length(gafs), topic)));
            force_output(T);
        }
        return gafs;
    }

    public static SubLObject gaf_about_topicP(final SubLObject gaf, final SubLObject topic, SubLObject pred) {
        if (pred == UNPROVIDED) {
            pred = assertions_high.gaf_arg0(gaf);
        }
        SubLObject min_count = NIL;
        SubLObject min_topic_count = NIL;
        SubLObject argnum = ZERO_INTEGER;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(gaf, $IGNORE);
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            argnum = add(argnum, ONE_INTEGER);
            final SubLObject count = kb_indexing.num_gaf_arg_index(arg, argnum, pred, UNPROVIDED);
            if (arg.eql(topic) && ((NIL == min_topic_count) || count.numL(min_topic_count))) {
                min_topic_count = count;
            } else
                if ((NIL == min_count) || count.numL(min_count)) {
                    min_count = count;
                }

            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        return makeBoolean((NIL != min_topic_count) && ((NIL == min_count) || min_topic_count.numLE(min_count)));
    }

    public static SubLObject fill_random_thought_generator_queue(final SubLObject rtg, final SubLObject target_size) {
        while ((NIL == random_thought_generator_exhausted_p(rtg)) && (NIL == random_thought_generator_queue_full_p(rtg, target_size))) {
            add_random_thought_to_rtg(rtg);
        } 
        return rtg;
    }

    public static SubLObject add_random_thought_to_rtg(final SubLObject rtg) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject user = rtg_user(rtg);
        final SubLObject most_recently_added_thought = rtg_most_recently_added_thought(rtg);
        SubLObject next_thought = NIL;
        SubLObject next_term = next_thcl_topic(most_recently_added_thought);
        SubLObject next_assertion = NIL;
        SubLObject next_assertion_paraphrase = NIL;
        if (NIL == next_term) {
            thread.resetMultipleValues();
            final SubLObject next_term_$28 = thcl.random_thcl_constant_and_assertion(user);
            final SubLObject next_assertion_$29 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            next_term = next_term_$28;
            next_assertion = next_assertion_$29;
        } else
            if (NIL == next_assertion) {
                next_assertion = thcl.random_thcl_assertion(next_term, user);
                if (NIL == next_assertion) {
                    thread.resetMultipleValues();
                    final SubLObject next_term_$29 = thcl.random_thcl_constant_and_assertion(user);
                    final SubLObject next_assertion_$30 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    next_term = next_term_$29;
                    next_assertion = next_assertion_$30;
                }
            }

        SubLObject triedP = NIL;
        while (NIL == next_assertion_paraphrase) {
            if (NIL != triedP) {
                next_assertion = thcl.random_thcl_assertion(next_term, user);
                if (NIL == next_assertion) {
                    thread.resetMultipleValues();
                    final SubLObject next_term_$30 = thcl.random_thcl_constant_and_assertion(user);
                    final SubLObject next_assertion_$31 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    next_term = next_term_$30;
                    next_assertion = next_assertion_$31;
                }
            }
            if (NIL != next_assertion) {
                next_assertion_paraphrase = thcl_paraphrase_for_assertion(next_assertion);
                triedP = T;
                set.set_add(next_assertion, rtg_done_assertions(rtg));
            }
        } 
        if ((NIL == next_assertion) || (NIL == next_assertion_paraphrase)) {
            note_rtg_exhausted(rtg);
        } else {
            next_thought = list(next_term, next_assertion, next_assertion_paraphrase);
        }
        if (NIL != next_thought) {
            queues.enqueue(next_thought, rtg_queue(rtg));
            rtg_set_most_recently_added_thought(rtg, next_thought);
        }
        return next_thought;
    }

    public static SubLObject thcl_paraphrase_for_assertion(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject paraphrase = NIL;
        SubLObject error_message = NIL;
        final SubLObject _prev_bind_0 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
        final SubLObject _prev_bind_2 = Errors.$continue_cerrorP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = pph_error.$pph_error_handling_onP$.currentBinding(thread);
        try {
            pph_vars.$pph_demerit_cutoff$.bind(ONE_INTEGER, thread);
            Errors.$continue_cerrorP$.bind(NIL, thread);
            pph_error.$pph_error_handling_onP$.bind(T, thread);
            if (NIL != pph_error.pph_break_on_errorP()) {
                paraphrase = pph_main.generate_phrase_for_java(assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else {
                try {
                    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0_$34 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            paraphrase = pph_main.generate_phrase_for_java(assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } catch (final Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_0_$34, thread);
                    }
                } catch (final Throwable ccatch_env_var) {
                    error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                } finally {
                    thread.throwStack.pop();
                }
                if (error_message.isString() && (NIL == pph_error.suppress_pph_warningsP())) {
                    Errors.warn(cconcatenate(pph_error_message_truncator.truncate_pph_error_message(error_message), $str129$___Top_level_CycL___S), pph_vars.pph_top_level_cycl());
                }
            }
        } finally {
            pph_error.$pph_error_handling_onP$.rebind(_prev_bind_3, thread);
            Errors.$continue_cerrorP$.rebind(_prev_bind_2, thread);
            pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_0, thread);
        }
        return (NIL == paraphrase) || (NIL != thcl_paraphrase_unacceptableP(pph_utilities.pph_javalist_string(paraphrase))) ? NIL : paraphrase;
    }

    public static SubLObject thcl_paraphrase_unacceptableP(final SubLObject string) {
        if (NIL == string_utilities.non_empty_stringP(string)) {
            return T;
        }
        if (NIL != string_utilities.substringP(constant_reader.constant_reader_prefix(), string, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject next_thcl_topic(final SubLObject most_recently_added_thought) {
        SubLObject next_term = NIL;
        final SubLObject method = choose_thcl_topic_selection_method();
        SubLObject v_term = NIL;
        SubLObject assertion = NIL;
        SubLObject assertion_paraphrase = NIL;
        destructuring_bind_must_consp(most_recently_added_thought, most_recently_added_thought, $list130);
        v_term = most_recently_added_thought.first();
        SubLObject current = most_recently_added_thought.rest();
        destructuring_bind_must_consp(current, most_recently_added_thought, $list130);
        assertion = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, most_recently_added_thought, $list130);
        assertion_paraphrase = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject pcase_var = method;
            if (pcase_var.eql($NEW_ARG_FROM_ASSERTION)) {
                if (NIL != assertion) {
                    final SubLObject args = cycl_utilities.formula_args(uncanonicalizer.assertion_el_formula(assertion), $IGNORE);
                    SubLObject rest;
                    SubLObject arg;
                    for (rest = NIL, rest = args; (NIL == next_term) && (NIL != rest); rest = rest.rest()) {
                        arg = rest.first();
                        if ((!arg.eql(v_term)) && (NIL != thcl.thcl_constantP(arg, UNPROVIDED))) {
                            next_term = arg;
                        }
                    }
                }
                if (NIL == next_term) {
                    next_term = v_term;
                }
            } else
                if (pcase_var.eql($REUSE_MOST_RECENTLY_ADDED_TOPIC)) {
                    next_term = v_term;
                } else {
                    next_term = NIL;
                }

        } else {
            cdestructuring_bind_error(most_recently_added_thought, $list130);
        }
        return next_term;
    }

    public static SubLObject choose_thcl_topic_selection_method() {
        final SubLObject pcase_var;
        final SubLObject pick_a_number = pcase_var = random.random(SIXTEEN_INTEGER);
        if (pcase_var.eql(ZERO_INTEGER)) {
            return $RANDOM;
        }
        if (pcase_var.eql(ONE_INTEGER) || pcase_var.eql(TWO_INTEGER)) {
            return $REUSE_MOST_RECENTLY_ADDED_TOPIC;
        }
        return $NEW_ARG_FROM_ASSERTION;
    }

    public static SubLObject declare_random_thought_generator_file() {
        declareFunction(me, "random_thought_p", "RANDOM-THOUGHT-P", 1, 0, false);
        declareFunction(me, "empty_random_thought_p", "EMPTY-RANDOM-THOUGHT-P", 1, 0, false);
        declareFunction(me, "non_empty_random_thought_p", "NON-EMPTY-RANDOM-THOUGHT-P", 1, 0, false);
        declareFunction(me, "xml_output_random_thoughts", "XML-OUTPUT-RANDOM-THOUGHTS", 2, 1, false);
        declareFunction(me, "xml_output_random_thoughts_for_terms", "XML-OUTPUT-RANDOM-THOUGHTS-FOR-TERMS", 2, 1, false);
        declareFunction(me, "sql_output_random_thoughts_from_xml", "SQL-OUTPUT-RANDOM-THOUGHTS-FROM-XML", 2, 1, false);
        declareFunction(me, "next_random_thought_num_for_topic", "NEXT-RANDOM-THOUGHT-NUM-FOR-TOPIC", 2, 0, false);
        declareFunction(me, "write_random_thought_sql_header", "WRITE-RANDOM-THOUGHT-SQL-HEADER", 1, 0, false);
        declareFunction(me, "write_random_thought_sql_row", "WRITE-RANDOM-THOUGHT-SQL-ROW", 5, 0, false);
        declareFunction(me, "xml_output_random_thoughts_for_term", "XML-OUTPUT-RANDOM-THOUGHTS-FOR-TERM", 1, 1, false);
        declareFunction(me, "xml_output_random_thought", "XML-OUTPUT-RANDOM-THOUGHT", 1, 0, false);
        declareFunction(me, "valid_non_empty_random_thought_p", "VALID-NON-EMPTY-RANDOM-THOUGHT-P", 1, 0, false);
        declareFunction(me, "next_random_thought_for_user", "NEXT-RANDOM-THOUGHT-FOR-USER", 1, 1, false);
        declareFunction(me, "thcl_assertion_seen_by_cyclistP", "THCL-ASSERTION-SEEN-BY-CYCLIST?", 2, 0, false);
        declareFunction(me, "number_of_queued_random_thoughts_for_user", "NUMBER-OF-QUEUED-RANDOM-THOUGHTS-FOR-USER", 1, 0, false);
        declareFunction(me, "number_of_used_random_thoughts_for_user", "NUMBER-OF-USED-RANDOM-THOUGHTS-FOR-USER", 1, 0, false);
        declareFunction(me, "remote_random_thought_image", "REMOTE-RANDOM-THOUGHT-IMAGE", 0, 0, false);
        declareFunction(me, "set_remote_random_thought_image", "SET-REMOTE-RANDOM-THOUGHT-IMAGE", 3, 0, false);
        declareFunction(me, "unset_remote_random_thought_image", "UNSET-REMOTE-RANDOM-THOUGHT-IMAGE", 0, 0, false);
        declareFunction(me, "clear_remote_random_thought_connection_pool", "CLEAR-REMOTE-RANDOM-THOUGHT-CONNECTION-POOL", 0, 0, false);
        declareFunction(me, "random_thought_server_hostXport", "RANDOM-THOUGHT-SERVER-HOST&PORT", 0, 0, false);
        declareFunction(me, "next_random_thought_for_user_from_remote_server", "NEXT-RANDOM-THOUGHT-FOR-USER-FROM-REMOTE-SERVER", 2, 0, false);
        declareFunction(me, "next_random_thought_for_user_from_remote_server_int", "NEXT-RANDOM-THOUGHT-FOR-USER-FROM-REMOTE-SERVER-INT", 2, 0, false);
        declareFunction(me, "create_remote_random_thought_connection", "CREATE-REMOTE-RANDOM-THOUGHT-CONNECTION", 0, 0, false);
        declareFunction(me, "release_random_thought_connection", "RELEASE-RANDOM-THOUGHT-CONNECTION", 1, 0, false);
        declareFunction(me, "open_remote_random_thought_connection_p", "OPEN-REMOTE-RANDOM-THOUGHT-CONNECTION-P", 1, 0, false);
        declareFunction(me, "get_free_random_thought_connection", "GET-FREE-RANDOM-THOUGHT-CONNECTION", 0, 0, false);
        declareFunction(me, "register_random_thought_generator", "REGISTER-RANDOM-THOUGHT-GENERATOR", 2, 0, false);
        declareFunction(me, "find_random_thought_generator_for_user", "FIND-RANDOM-THOUGHT-GENERATOR-FOR-USER", 1, 0, false);
        declareFunction(me, "random_thought_generator_print_function_trampoline", "RANDOM-THOUGHT-GENERATOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "random_thought_generator_p", "RANDOM-THOUGHT-GENERATOR-P", 1, 0, false);
        new random_thought_generator.$random_thought_generator_p$UnaryFunction();
        declareFunction(me, "rtg_struct_user", "RTG-STRUCT-USER", 1, 0, false);
        declareFunction(me, "rtg_struct_done_assertions", "RTG-STRUCT-DONE-ASSERTIONS", 1, 0, false);
        declareFunction(me, "rtg_struct_generator_thread", "RTG-STRUCT-GENERATOR-THREAD", 1, 0, false);
        declareFunction(me, "rtg_struct_queue", "RTG-STRUCT-QUEUE", 1, 0, false);
        declareFunction(me, "rtg_struct_most_recently_added_thought", "RTG-STRUCT-MOST-RECENTLY-ADDED-THOUGHT", 1, 0, false);
        declareFunction(me, "rtg_struct_topical_thoughts", "RTG-STRUCT-TOPICAL-THOUGHTS", 1, 0, false);
        declareFunction(me, "_csetf_rtg_struct_user", "_CSETF-RTG-STRUCT-USER", 2, 0, false);
        declareFunction(me, "_csetf_rtg_struct_done_assertions", "_CSETF-RTG-STRUCT-DONE-ASSERTIONS", 2, 0, false);
        declareFunction(me, "_csetf_rtg_struct_generator_thread", "_CSETF-RTG-STRUCT-GENERATOR-THREAD", 2, 0, false);
        declareFunction(me, "_csetf_rtg_struct_queue", "_CSETF-RTG-STRUCT-QUEUE", 2, 0, false);
        declareFunction(me, "_csetf_rtg_struct_most_recently_added_thought", "_CSETF-RTG-STRUCT-MOST-RECENTLY-ADDED-THOUGHT", 2, 0, false);
        declareFunction(me, "_csetf_rtg_struct_topical_thoughts", "_CSETF-RTG-STRUCT-TOPICAL-THOUGHTS", 2, 0, false);
        declareFunction(me, "make_random_thought_generator", "MAKE-RANDOM-THOUGHT-GENERATOR", 0, 1, false);
        declareFunction(me, "visit_defstruct_random_thought_generator", "VISIT-DEFSTRUCT-RANDOM-THOUGHT-GENERATOR", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_random_thought_generator_method", "VISIT-DEFSTRUCT-OBJECT-RANDOM-THOUGHT-GENERATOR-METHOD", 2, 0, false);
        declareFunction(me, "rtg_user", "RTG-USER", 1, 0, false);
        declareFunction(me, "rtg_done_assertions", "RTG-DONE-ASSERTIONS", 1, 0, false);
        declareFunction(me, "rtg_generator_thread", "RTG-GENERATOR-THREAD", 1, 0, false);
        declareFunction(me, "rtg_set_generator_thread", "RTG-SET-GENERATOR-THREAD", 2, 0, false);
        declareFunction(me, "rtg_queue", "RTG-QUEUE", 1, 0, false);
        declareFunction(me, "rtg_most_recently_added_thought", "RTG-MOST-RECENTLY-ADDED-THOUGHT", 1, 0, false);
        declareFunction(me, "rtg_set_most_recently_added_thought", "RTG-SET-MOST-RECENTLY-ADDED-THOUGHT", 2, 0, false);
        declareFunction(me, "rtg_topical_thoughts", "RTG-TOPICAL-THOUGHTS", 1, 0, false);
        declareFunction(me, "rtg_set_topical_thoughts", "RTG-SET-TOPICAL-THOUGHTS", 2, 0, false);
        declareFunction(me, "pprint_random_thought_generator", "PPRINT-RANDOM-THOUGHT-GENERATOR", 1, 2, false);
        declareFunction(me, "find_or_create_random_thought_generator_for_user", "FIND-OR-CREATE-RANDOM-THOUGHT-GENERATOR-FOR-USER", 1, 0, false);
        declareFunction(me, "empty_thought", "EMPTY-THOUGHT", 0, 0, false);
        declareFunction(me, "new_random_thought_generator_for_user", "NEW-RANDOM-THOUGHT-GENERATOR-FOR-USER", 1, 0, false);
        declareFunction(me, "new_random_thought_generator", "NEW-RANDOM-THOUGHT-GENERATOR", 0, 0, false);
        declareFunction(me, "note_rtg_exhausted", "NOTE-RTG-EXHAUSTED", 1, 0, false);
        declareFunction(me, "random_thought_generator_exhausted_p", "RANDOM-THOUGHT-GENERATOR-EXHAUSTED-P", 1, 0, false);
        declareFunction(me, "random_thoughts_on_topic_exhausted_p", "RANDOM-THOUGHTS-ON-TOPIC-EXHAUSTED-P", 1, 0, false);
        declareFunction(me, "note_random_thoughts_on_topic_exhausted", "NOTE-RANDOM-THOUGHTS-ON-TOPIC-EXHAUSTED", 1, 0, false);
        declareFunction(me, "random_thought_generator_full_p", "RANDOM-THOUGHT-GENERATOR-FULL-P", 2, 0, false);
        declareFunction(me, "random_thought_generator_queue_full_p", "RANDOM-THOUGHT-GENERATOR-QUEUE-FULL-P", 2, 0, false);
        declareFunction(me, "declare_interest_in_random_thoughts_about_topic", "DECLARE-INTEREST-IN-RANDOM-THOUGHTS-ABOUT-TOPIC", 2, 0, false);
        declareMacro(me, "rtg_note", "RTG-NOTE");
        declareFunction(me, "register_interest_in_random_thoughts_about_topic", "REGISTER-INTEREST-IN-RANDOM-THOUGHTS-ABOUT-TOPIC", 2, 0, false);
        declareFunction(me, "all_random_thoughts_on_topic", "ALL-RANDOM-THOUGHTS-ON-TOPIC", 1, 0, false);
        declareFunction(me, "next_random_thought_with_suggested_topic", "NEXT-RANDOM-THOUGHT-WITH-SUGGESTED-TOPIC", 2, 0, false);
        declareFunction(me, "next_random_thought_without_suggested_topic", "NEXT-RANDOM-THOUGHT-WITHOUT-SUGGESTED-TOPIC", 2, 0, false);
        declareFunction(me, "find_or_create_random_thought_generator_thread", "FIND-OR-CREATE-RANDOM-THOUGHT-GENERATOR-THREAD", 1, 1, false);
        declareFunction(me, "keep_random_thought_generator_full", "KEEP-RANDOM-THOUGHT-GENERATOR-FULL", 1, 2, false);
        declareFunction(me, "fill_random_thought_generator", "FILL-RANDOM-THOUGHT-GENERATOR", 2, 0, false);
        declareFunction(me, "update_random_thought_data", "UPDATE-RANDOM-THOUGHT-DATA", 3, 0, false);
        declareFunction(me, "open_cyc_formula", "OPEN-CYC-FORMULA", 1, 0, false);
        declareFunction(me, "open_cyc_fort_internal", "OPEN-CYC-FORT-INTERNAL", 1, 0, false);
        declareFunction(me, "open_cyc_fort", "OPEN-CYC-FORT", 1, 0, false);
        declareFunction(me, "potentially_porn_relatedP_internal", "POTENTIALLY-PORN-RELATED?-INTERNAL", 1, 0, false);
        declareFunction(me, "potentially_porn_relatedP", "POTENTIALLY-PORN-RELATED?", 1, 0, false);
        declareFunction(me, "new_random_thought_data_for_topic", "NEW-RANDOM-THOUGHT-DATA-FOR-TOPIC", 1, 0, false);
        declareFunction(me, "gafs_about_topic", "GAFS-ABOUT-TOPIC", 1, 0, false);
        declareFunction(me, "gaf_about_topicP", "GAF-ABOUT-TOPIC?", 2, 1, false);
        declareFunction(me, "fill_random_thought_generator_queue", "FILL-RANDOM-THOUGHT-GENERATOR-QUEUE", 2, 0, false);
        declareFunction(me, "add_random_thought_to_rtg", "ADD-RANDOM-THOUGHT-TO-RTG", 1, 0, false);
        declareFunction(me, "thcl_paraphrase_for_assertion", "THCL-PARAPHRASE-FOR-ASSERTION", 1, 0, false);
        declareFunction(me, "thcl_paraphrase_unacceptableP", "THCL-PARAPHRASE-UNACCEPTABLE?", 1, 0, false);
        declareFunction(me, "next_thcl_topic", "NEXT-THCL-TOPIC", 1, 0, false);
        declareFunction(me, "choose_thcl_topic_selection_method", "CHOOSE-THCL-TOPIC-SELECTION-METHOD", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_random_thought_generator_file() {
        defparameter("*RANDOM-THOUGHT-SERVER-HOST*", red_infrastructure_macros.red_def_helper($list34.isSymbol() ? symbol_value($list34) : $list34, $random_thought_server_host$, $str36$random_thoughts_cyc_com.isSymbol() ? symbol_value($str36$random_thoughts_cyc_com) : $str36$random_thoughts_cyc_com, $PARAMETER, UNPROVIDED));
        defparameter("*RANDOM-THOUGHT-SERVER-PORT*", red_infrastructure_macros.red_def_helper($list38.isSymbol() ? symbol_value($list38) : $list38, $random_thought_server_port$, $int$3634.isSymbol() ? symbol_value($int$3634) : $int$3634, $PARAMETER, UNPROVIDED));
        deflexical("*REMOTE-RANDOM-THOUGHT-IMAGE*", SubLTrampolineFile.maybeDefault($remote_random_thought_image$, $remote_random_thought_image$, NIL));
        deflexical("*REMOTE-RANDOM-THOUGHT-CONNECTION-POOL*", SubLTrampolineFile.maybeDefault($remote_random_thought_connection_pool$, $remote_random_thought_connection_pool$, () -> queues.create_queue(UNPROVIDED)));
        deflexical("*REMOTE-RANDOM-THOUGHT-CONNECTION-POOL-LOCK*", make_lock($str44$Remote_Random_Thought_Connection_));
        deflexical("*REMOTE-RANDOM-THOUGHT-CONNECTION-POOL-MAX-SIZE*", NINE_INTEGER);
        deflexical("*RANDOM-THOUGHT-GENERATORS-FOR-USERS*", SubLTrampolineFile.maybeDefault($random_thought_generators_for_users$, $random_thought_generators_for_users$, () -> dictionary.new_dictionary(UNPROVIDED, UNPROVIDED)));
        defconstant("*DTP-RANDOM-THOUGHT-GENERATOR*", RANDOM_THOUGHT_GENERATOR);
        defparameter("*PRINT-RTG-NOTES?*", NIL);
        return NIL;
    }

    public static SubLObject setup_random_thought_generator_file() {
        declare_defglobal($remote_random_thought_image$);
        declare_defglobal($remote_random_thought_connection_pool$);
        declare_defglobal($random_thought_generators_for_users$);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_random_thought_generator$.getGlobalValue(), symbol_function(RANDOM_THOUGHT_GENERATOR_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list64);
        def_csetf(RTG_STRUCT_USER, _CSETF_RTG_STRUCT_USER);
        def_csetf(RTG_STRUCT_DONE_ASSERTIONS, _CSETF_RTG_STRUCT_DONE_ASSERTIONS);
        def_csetf(RTG_STRUCT_GENERATOR_THREAD, _CSETF_RTG_STRUCT_GENERATOR_THREAD);
        def_csetf(RTG_STRUCT_QUEUE, _CSETF_RTG_STRUCT_QUEUE);
        def_csetf(RTG_STRUCT_MOST_RECENTLY_ADDED_THOUGHT, _CSETF_RTG_STRUCT_MOST_RECENTLY_ADDED_THOUGHT);
        def_csetf(RTG_STRUCT_TOPICAL_THOUGHTS, _CSETF_RTG_STRUCT_TOPICAL_THOUGHTS);
        identity(RANDOM_THOUGHT_GENERATOR);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_random_thought_generator$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_RANDOM_THOUGHT_GENERATOR_METHOD));
        note_funcall_helper_function(PPRINT_RANDOM_THOUGHT_GENERATOR);
        memoization_state.note_memoized_function(OPEN_CYC_FORT);
        memoization_state.note_memoized_function($sym123$POTENTIALLY_PORN_RELATED_);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_random_thought_generator_file();
    }

    @Override
    public void initializeVariables() {
        init_random_thought_generator_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_random_thought_generator_file();
    }

    

    public static final class $random_thought_generator_native extends SubLStructNative {
        public SubLObject $user;

        public SubLObject $done_assertions;

        public SubLObject $generator_thread;

        public SubLObject $queue;

        public SubLObject $most_recently_added_thought;

        public SubLObject $topical_thoughts;

        private static final SubLStructDeclNative structDecl;

        private $random_thought_generator_native() {
            this.$user = Lisp.NIL;
            this.$done_assertions = Lisp.NIL;
            this.$generator_thread = Lisp.NIL;
            this.$queue = Lisp.NIL;
            this.$most_recently_added_thought = Lisp.NIL;
            this.$topical_thoughts = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$user;
        }

        @Override
        public SubLObject getField3() {
            return this.$done_assertions;
        }

        @Override
        public SubLObject getField4() {
            return this.$generator_thread;
        }

        @Override
        public SubLObject getField5() {
            return this.$queue;
        }

        @Override
        public SubLObject getField6() {
            return this.$most_recently_added_thought;
        }

        @Override
        public SubLObject getField7() {
            return this.$topical_thoughts;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$user = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$done_assertions = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$generator_thread = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$queue = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$most_recently_added_thought = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$topical_thoughts = value;
        }

        static {
            structDecl = makeStructDeclNative($random_thought_generator_native.class, RANDOM_THOUGHT_GENERATOR, RANDOM_THOUGHT_GENERATOR_P, $list58, $list59, new String[]{ "$user", "$done_assertions", "$generator_thread", "$queue", "$most_recently_added_thought", "$topical_thoughts" }, $list60, $list61, PPRINT_RANDOM_THOUGHT_GENERATOR);
        }
    }

    public static final class $random_thought_generator_p$UnaryFunction extends UnaryFunction {
        public $random_thought_generator_p$UnaryFunction() {
            super(extractFunctionNamed("RANDOM-THOUGHT-GENERATOR-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return random_thought_generator_p(arg1);
        }
    }
}

/**
 * Total time: 837 ms synthetic
 */
