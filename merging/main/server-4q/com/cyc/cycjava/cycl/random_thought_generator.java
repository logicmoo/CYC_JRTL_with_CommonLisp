/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.id_index.do_id_index_empty_p;
import static com.cyc.cycjava.cycl.id_index.do_id_index_id_and_object_validP;
import static com.cyc.cycjava.cycl.id_index.do_id_index_next_id;
import static com.cyc.cycjava.cycl.id_index.do_id_index_next_state;
import static com.cyc.cycjava.cycl.id_index.do_id_index_state_object;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_next_id;
import static com.cyc.cycjava.cycl.id_index.id_index_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_skip_tombstones_p;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_id_threshold;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_tombstone_p;
import static com.cyc.cycjava.cycl.owl.owl_cycl_to_xml.fort_has_exported_owl_opencyc_contentP;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.subl_promotions.values_list;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.CHAR_quote;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplaca;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.rplacd;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.equal;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.divide;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.min;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.mod;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numGE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.find;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_value;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.kill_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.sleep;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.valid_process_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeDouble;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.property_list_member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.princ;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.open_stream_p;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

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
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      RANDOM-THOUGHT-GENERATOR
 * source file: /cyc/top/cycl/random-thought-generator.lisp
 * created:     2019/07/03 17:38:40
 */
public final class random_thought_generator extends SubLTranslatedFile implements V12 {
    public static final SubLFile me = new random_thought_generator();

 public static final String myName = "com.cyc.cycjava.cycl.random_thought_generator";


    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $remote_random_thought_connection_pool_lock$ = makeSymbol("*REMOTE-RANDOM-THOUGHT-CONNECTION-POOL-LOCK*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $remote_random_thought_connection_pool_max_size$ = makeSymbol("*REMOTE-RANDOM-THOUGHT-CONNECTION-POOL-MAX-SIZE*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_random_thought_generator$ = makeSymbol("*DTP-RANDOM-THOUGHT-GENERATOR*");



    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(NIL, NIL, NIL);

    static private final SubLList $list1 = list(list($TEST, makeSymbol("FORT-P")), list($TEST, makeSymbol("ASSERTION-P")), list($TEST, makeSymbol("PPH-JAVALIST-P")));



    static private final SubLString $str6$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLString $$$Generating_ = makeString("Generating ");

    private static final SubLString $str8$_random_thoughts___ = makeString(" random thoughts...");

    private static final SubLString $str9$random_thoughts = makeString("random-thoughts");

    static private final SubLList $list11 = list(makeKeyword("NOW"), NIL);

    static private final SubLString $$$thoughts = makeString("thoughts");

    static private final SubLString $$$Exporting_random_thoughts_to_ = makeString("Exporting random thoughts to ");

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

    static private final SubLList $list58 = list(makeSymbol("USER"), makeSymbol("DONE-ASSERTIONS"), makeSymbol("GENERATOR-THREAD"), makeSymbol("QUEUE"), makeSymbol("MOST-RECENTLY-ADDED-THOUGHT"), makeSymbol("TOPICAL-THOUGHTS"));

    static private final SubLList $list59 = list($USER, makeKeyword("DONE-ASSERTIONS"), makeKeyword("GENERATOR-THREAD"), makeKeyword("QUEUE"), makeKeyword("MOST-RECENTLY-ADDED-THOUGHT"), makeKeyword("TOPICAL-THOUGHTS"));

    static private final SubLList $list60 = list(makeSymbol("RTG-STRUCT-USER"), makeSymbol("RTG-STRUCT-DONE-ASSERTIONS"), makeSymbol("RTG-STRUCT-GENERATOR-THREAD"), makeSymbol("RTG-STRUCT-QUEUE"), makeSymbol("RTG-STRUCT-MOST-RECENTLY-ADDED-THOUGHT"), makeSymbol("RTG-STRUCT-TOPICAL-THOUGHTS"));

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

    static private final SubLList $list94 = list(makeSymbol("FORMAT-STR"), makeSymbol("&REST"), makeSymbol("ARGS"));

    private static final SubLSymbol $print_rtg_notesP$ = makeSymbol("*PRINT-RTG-NOTES?*");

    private static final SubLList $list98 = list(QUOTE, makeSymbol("FORMAT"));

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



    private static final SubLFloat $float$1_5 = makeDouble(1.5);

    private static final SubLString $str117$__Filling__S__ = makeString("~&Filling ~S~%");

    private static final SubLList $list118 = cons(makeSymbol("TOPIC"), makeSymbol("NEW-DATA"));

    private static final SubLString $str119$___S_is_now_full__ = makeString("~&~S is now full~%");

    private static final SubLString $str120$_S_is_not_in_an_updatable_state = makeString("~S is not in an updatable state");

    private static final SubLString $str121$__New_thought_concerning__S_____S = makeString("~&New thought concerning ~S:~% ~S~%");

    private static final SubLSymbol OPEN_CYC_FORT = makeSymbol("OPEN-CYC-FORT");

    private static final SubLSymbol $sym123$POTENTIALLY_PORN_RELATED_ = makeSymbol("POTENTIALLY-PORN-RELATED?");



    private static final SubLString $str128$__Found__S_GAF_assertions_about__ = makeString("~&Found ~S GAF assertions about ~S~%");

    private static final SubLString $str129$___Top_level_CycL___S = makeString("~% Top-level CycL: ~S");

    private static final SubLList $list130 = list(makeSymbol("TERM"), makeSymbol("ASSERTION"), makeSymbol("ASSERTION-PARAPHRASE"));

    private static final SubLSymbol $NEW_ARG_FROM_ASSERTION = makeKeyword("NEW-ARG-FROM-ASSERTION");

    private static final SubLSymbol $REUSE_MOST_RECENTLY_ADDED_TOPIC = makeKeyword("REUSE-MOST-RECENTLY-ADDED-TOPIC");

    // Definitions
    /**
     * A triple consisting of a topic, an assertion mentioning the topic,
     * and a paraphrase of the assertion.
     */
    @LispMethod(comment = "A triple consisting of a topic, an assertion mentioning the topic,\r\nand a paraphrase of the assertion.\nA triple consisting of a topic, an assertion mentioning the topic,\nand a paraphrase of the assertion.")
    public static final SubLObject random_thought_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != com.cyc.cycjava.cycl.random_thought_generator.empty_random_thought_p(v_object)) || (NIL != com.cyc.cycjava.cycl.random_thought_generator.non_empty_random_thought_p(v_object)));
    }

    // Definitions
    /**
     * A triple consisting of a topic, an assertion mentioning the topic,
     * and a paraphrase of the assertion.
     */
    @LispMethod(comment = "A triple consisting of a topic, an assertion mentioning the topic,\r\nand a paraphrase of the assertion.\nA triple consisting of a topic, an assertion mentioning the topic,\nand a paraphrase of the assertion.")
    public static SubLObject random_thought_p(final SubLObject v_object) {
        return makeBoolean((NIL != random_thought_generator.empty_random_thought_p(v_object)) || (NIL != random_thought_generator.non_empty_random_thought_p(v_object)));
    }

    public static final SubLObject empty_random_thought_p_alt(SubLObject v_object) {
        return equal(v_object, $list_alt0);
    }

    public static SubLObject empty_random_thought_p(final SubLObject v_object) {
        return equal(v_object, random_thought_generator.$list0);
    }

    /**
     * A triple consisting of a topic, an assertion mentioning the topic,
     * and a paraphrase of the assertion.
     */
    @LispMethod(comment = "A triple consisting of a topic, an assertion mentioning the topic,\r\nand a paraphrase of the assertion.\nA triple consisting of a topic, an assertion mentioning the topic,\nand a paraphrase of the assertion.")
    public static final SubLObject non_empty_random_thought_p_alt(SubLObject v_object) {
        return pattern_match.tree_matches_pattern(v_object, $list_alt1);
    }

    /**
     * A triple consisting of a topic, an assertion mentioning the topic,
     * and a paraphrase of the assertion.
     */
    @LispMethod(comment = "A triple consisting of a topic, an assertion mentioning the topic,\r\nand a paraphrase of the assertion.\nA triple consisting of a topic, an assertion mentioning the topic,\nand a paraphrase of the assertion.")
    public static SubLObject non_empty_random_thought_p(final SubLObject v_object) {
        return pattern_match.tree_matches_pattern(v_object, random_thought_generator.$list1);
    }

    /**
     * Export NUMBER-OF-THOUGHTS random thoughts in XML to FILENAME.
     */
    @LispMethod(comment = "Export NUMBER-OF-THOUGHTS random thoughts in XML to FILENAME.")
    public static final SubLObject xml_output_random_thoughts_alt(SubLObject number_of_thoughts, SubLObject filename, SubLObject user) {
        if (user == UNPROVIDED) {
            user = $$Guest;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(number_of_thoughts, POSITIVE_INTEGER_P);
            SubLTrampolineFile.checkType(filename, STRINGP);
            {
                SubLObject stream = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream = compatibility.open_text(filename, $OUTPUT, NIL);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (!stream.isStream()) {
                        Errors.error($str_alt6$Unable_to_open__S, filename);
                    }
                    {
                        SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
                        try {
                            xml_vars.$xml_stream$.bind(stream, thread);
                            xml_utilities.xml_header(UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            {
                                SubLObject state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                SubLObject local_state = state;
                                {
                                    SubLObject _prev_bind_0_1 = memoization_state.$memoization_state$.currentBinding(thread);
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
                                                            Errors.error($str_alt7$Invalid_attempt_to_reuse_memoizat);
                                                        }
                                                    }
                                                }
                                            }
                                            try {
                                                {
                                                    SubLObject _prev_bind_0_2 = $last_percent_progress_index$.currentBinding(thread);
                                                    SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                                                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                                                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                                    try {
                                                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                                        $last_percent_progress_prediction$.bind(NIL, thread);
                                                        $within_noting_percent_progress$.bind(T, thread);
                                                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                                                        noting_percent_progress_preamble(cconcatenate($str_alt8$Generating_, new SubLObject[]{ format_nil.format_nil_d_no_copy(number_of_thoughts), $str_alt9$_random_thoughts___ }));
                                                        {
                                                            SubLObject _prev_bind_0_3 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                            SubLObject _prev_bind_1_4 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                            try {
                                                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                                xml_utilities.xml_start_tag_internal($str_alt10$random_thoughts, NIL, NIL);
                                                                xml_utilities.xml_terpri();
                                                                {
                                                                    SubLObject i = NIL;
                                                                    for (i = ZERO_INTEGER; i.numL(number_of_thoughts); i = add(i, ONE_INTEGER)) {
                                                                        com.cyc.cycjava.cycl.random_thought_generator.xml_output_random_thought(com.cyc.cycjava.cycl.random_thought_generator.next_random_thought_for_user(user, $list_alt11));
                                                                        xml_utilities.xml_terpri();
                                                                        force_output(xml_vars.$xml_stream$.getDynamicValue(thread));
                                                                        note_percent_progress(i, number_of_thoughts);
                                                                    }
                                                                }
                                                            } finally {
                                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_4, thread);
                                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_3, thread);
                                                            }
                                                        }
                                                        xml_utilities.xml_terpri();
                                                        xml_utilities.xml_end_tag_internal($str_alt10$random_thoughts);
                                                        noting_percent_progress_postamble();
                                                    } finally {
                                                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                                        $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                                        $last_percent_progress_index$.rebind(_prev_bind_0_2, thread);
                                                    }
                                                }
                                            } finally {
                                                {
                                                    SubLObject _prev_bind_0_5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                            memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                        }
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_5, thread);
                                                    }
                                                }
                                            }
                                        }
                                    } finally {
                                        memoization_state.$memoization_state$.rebind(_prev_bind_0_1, thread);
                                    }
                                }
                            }
                        } finally {
                            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return number_of_thoughts;
        }
    }

    /**
     * Export NUMBER-OF-THOUGHTS random thoughts in XML to FILENAME.
     */
    @LispMethod(comment = "Export NUMBER-OF-THOUGHTS random thoughts in XML to FILENAME.")
    public static SubLObject xml_output_random_thoughts(final SubLObject number_of_thoughts, final SubLObject filename, SubLObject user) {
        if (user == UNPROVIDED) {
            user = random_thought_generator.$$Guest;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != subl_promotions.positive_integer_p(number_of_thoughts) : "! subl_promotions.positive_integer_p(number_of_thoughts) " + ("subl_promotions.positive_integer_p(number_of_thoughts) " + "CommonSymbols.NIL != subl_promotions.positive_integer_p(number_of_thoughts) ") + number_of_thoughts;
        assert NIL != stringp(filename) : "! stringp(filename) " + ("Types.stringp(filename) " + "CommonSymbols.NIL != Types.stringp(filename) ") + filename;
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
                Errors.error(random_thought_generator.$str6$Unable_to_open__S, filename);
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
                                noting_percent_progress_preamble(cconcatenate(random_thought_generator.$$$Generating_, new SubLObject[]{ format_nil.format_nil_d_no_copy(number_of_thoughts), random_thought_generator.$str8$_random_thoughts___ }));
                                try {
                                    final SubLObject _prev_bind_0_$3 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$4 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal(random_thought_generator.$str9$random_thoughts, NIL, NIL, NIL, $UNINITIALIZED);
                                        final SubLObject _prev_bind_0_$4 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                        try {
                                            xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                            xml_utilities.xml_terpri();
                                            SubLObject i;
                                            for (i = NIL, i = ZERO_INTEGER; i.numL(number_of_thoughts); i = add(i, ONE_INTEGER)) {
                                                random_thought_generator.xml_output_random_thought(random_thought_generator.next_random_thought_for_user(user, random_thought_generator.$list11));
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
                                        xml_utilities.xml_end_tag_internal(random_thought_generator.$str9$random_thoughts);
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

    /**
     * For NUMBER-OF-TERMS terms, export all random thoughts for each term in XML to FILENAME.
     * Terms are done in DO-FORTS order, starting after START-AFTER-FORT, if non-NIL.
     */
    @LispMethod(comment = "For NUMBER-OF-TERMS terms, export all random thoughts for each term in XML to FILENAME.\r\nTerms are done in DO-FORTS order, starting after START-AFTER-FORT, if non-NIL.\nFor NUMBER-OF-TERMS terms, export all random thoughts for each term in XML to FILENAME.\nTerms are done in DO-FORTS order, starting after START-AFTER-FORT, if non-NIL.")
    public static final SubLObject xml_output_random_thoughts_for_terms_alt(SubLObject number_of_terms, SubLObject filename, SubLObject start_after_fort) {
        if (start_after_fort == UNPROVIDED) {
            start_after_fort = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != number_of_terms) {
                SubLTrampolineFile.checkType(number_of_terms, POSITIVE_INTEGER_P);
            }
            SubLTrampolineFile.checkType(filename, STRINGP);
            {
                SubLObject stream = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream = compatibility.open_text(filename, $OUTPUT, NIL);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (!stream.isStream()) {
                        Errors.error($str_alt6$Unable_to_open__S, filename);
                    }
                    {
                        SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
                        try {
                            xml_vars.$xml_stream$.bind(stream, thread);
                            xml_utilities.xml_header(UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            {
                                SubLObject done_count = ZERO_INTEGER;
                                SubLObject doneP = NIL;
                                SubLObject ok_to_startP = sublisp_null(start_after_fort);
                                SubLObject state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                SubLObject local_state = state;
                                {
                                    SubLObject _prev_bind_0_6 = memoization_state.$memoization_state$.currentBinding(thread);
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
                                                            Errors.error($str_alt7$Invalid_attempt_to_reuse_memoizat);
                                                        }
                                                    }
                                                }
                                            }
                                            try {
                                                {
                                                    SubLObject _prev_bind_0_7 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                                    SubLObject _prev_bind_1 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                                    try {
                                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                        xml_utilities.xml_start_tag_internal($$$thoughts, NIL, NIL);
                                                        xml_utilities.xml_terpri();
                                                        {
                                                            SubLObject message = cconcatenate($str_alt13$Exporting_random_thoughts_to_, format_nil.format_nil_s_no_copy(filename));
                                                            SubLObject total = forts.fort_count();
                                                            SubLObject sofar = ZERO_INTEGER;
                                                            {
                                                                SubLObject _prev_bind_0_8 = $last_percent_progress_index$.currentBinding(thread);
                                                                SubLObject _prev_bind_1_9 = $last_percent_progress_prediction$.currentBinding(thread);
                                                                SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                                                                SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                                                try {
                                                                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                                                    $last_percent_progress_prediction$.bind(NIL, thread);
                                                                    $within_noting_percent_progress$.bind(T, thread);
                                                                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                                                                    noting_percent_progress_preamble(message);
                                                                    {
                                                                        SubLObject rest = NIL;
                                                                        for (rest = forts.do_forts_tables(); !((NIL != doneP) || (NIL == rest)); rest = rest.rest()) {
                                                                            {
                                                                                SubLObject table_var = rest.first();
                                                                                if (NIL == do_id_index_empty_p(table_var, $SKIP)) {
                                                                                    {
                                                                                        SubLObject id = do_id_index_next_id(table_var, T, NIL, NIL);
                                                                                        SubLObject state_var = do_id_index_next_state(table_var, T, id, NIL);
                                                                                        SubLObject fort = NIL;
                                                                                        while ((NIL != id) && (NIL == doneP)) {
                                                                                            fort = do_id_index_state_object(table_var, $SKIP, id, state_var);
                                                                                            if (NIL != do_id_index_id_and_object_validP(id, fort, $SKIP)) {
                                                                                                sofar = add(sofar, ONE_INTEGER);
                                                                                                note_percent_progress(sofar, total);
                                                                                                if (((NIL != ok_to_startP) && (NIL != com.cyc.cycjava.cycl.random_thought_generator.open_cyc_fort(fort))) && (NIL == fort_types_interface.predicate_p(fort))) {
                                                                                                    {
                                                                                                        SubLObject thoughts = com.cyc.cycjava.cycl.random_thought_generator.all_random_thoughts_on_topic(fort);
                                                                                                        if (NIL != list_utilities.non_empty_list_p(thoughts)) {
                                                                                                            com.cyc.cycjava.cycl.random_thought_generator.xml_output_random_thoughts_for_term(fort, thoughts);
                                                                                                            xml_utilities.xml_terpri();
                                                                                                            done_count = add(done_count, ONE_INTEGER);
                                                                                                            if (NIL != number_of_terms) {
                                                                                                                doneP = numGE(done_count, number_of_terms);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                                if (fort.eql(start_after_fort)) {
                                                                                                    ok_to_startP = T;
                                                                                                }
                                                                                            }
                                                                                            id = do_id_index_next_id(table_var, T, id, state_var);
                                                                                            state_var = do_id_index_next_state(table_var, T, id, state_var);
                                                                                        } 
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    noting_percent_progress_postamble();
                                                                } finally {
                                                                    $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                                                    $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                                                    $last_percent_progress_prediction$.rebind(_prev_bind_1_9, thread);
                                                                    $last_percent_progress_index$.rebind(_prev_bind_0_8, thread);
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1, thread);
                                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_7, thread);
                                                    }
                                                }
                                                xml_utilities.xml_terpri();
                                                xml_utilities.xml_end_tag_internal($$$thoughts);
                                            } finally {
                                                {
                                                    SubLObject _prev_bind_0_10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                                            memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                                        }
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_10, thread);
                                                    }
                                                }
                                            }
                                        }
                                    } finally {
                                        memoization_state.$memoization_state$.rebind(_prev_bind_0_6, thread);
                                    }
                                }
                            }
                        } finally {
                            xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
                        }
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return NIL;
        }
    }

    /**
     * For NUMBER-OF-TERMS terms, export all random thoughts for each term in XML to FILENAME.
     * Terms are done in DO-FORTS order, starting after START-AFTER-FORT, if non-NIL.
     */
    @LispMethod(comment = "For NUMBER-OF-TERMS terms, export all random thoughts for each term in XML to FILENAME.\r\nTerms are done in DO-FORTS order, starting after START-AFTER-FORT, if non-NIL.\nFor NUMBER-OF-TERMS terms, export all random thoughts for each term in XML to FILENAME.\nTerms are done in DO-FORTS order, starting after START-AFTER-FORT, if non-NIL.")
    public static SubLObject xml_output_random_thoughts_for_terms(final SubLObject number_of_terms, final SubLObject filename, SubLObject start_after_fort) {
        if (start_after_fort == UNPROVIDED) {
            start_after_fort = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL != number_of_terms) && (!SubLTrampolineFile.assertionsDisabledInClass)) && (NIL == subl_promotions.positive_integer_p(number_of_terms))) {
            throw new AssertionError(number_of_terms);
        }
        assert NIL != stringp(filename) : "! stringp(filename) " + ("Types.stringp(filename) " + "CommonSymbols.NIL != Types.stringp(filename) ") + filename;
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
                Errors.error(random_thought_generator.$str6$Unable_to_open__S, filename);
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
                                xml_utilities.xml_start_tag_internal(random_thought_generator.$$$thoughts, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$11 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    xml_utilities.xml_terpri();
                                    final SubLObject message = cconcatenate(random_thought_generator.$$$Exporting_random_thoughts_to_, format_nil.format_nil_s_no_copy(filename));
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
                                                        destructuring_bind_must_consp(current, datum, random_thought_generator.$list15);
                                                        start = current.first();
                                                        current = current.rest();
                                                        destructuring_bind_must_consp(current, datum, random_thought_generator.$list15);
                                                        end = current.first();
                                                        current = current.rest();
                                                        destructuring_bind_must_consp(current, datum, random_thought_generator.$list15);
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
                                                                        if (((NIL != ok_to_startP) && (NIL != random_thought_generator.open_cyc_fort(fort))) && (NIL == fort_types_interface.predicate_p(fort))) {
                                                                            thoughts = random_thought_generator.all_random_thoughts_on_topic(fort);
                                                                            if (NIL != list_utilities.non_empty_list_p(thoughts)) {
                                                                                random_thought_generator.xml_output_random_thoughts_for_term(fort, thoughts);
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
                                                            cdestructuring_bind_error(datum, random_thought_generator.$list15);
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
                                                                if (((NIL != ok_to_startP) && (NIL != random_thought_generator.open_cyc_fort(fort2))) && (NIL == fort_types_interface.predicate_p(fort2))) {
                                                                    thoughts2 = random_thought_generator.all_random_thoughts_on_topic(fort2);
                                                                    if (NIL != list_utilities.non_empty_list_p(thoughts2)) {
                                                                        random_thought_generator.xml_output_random_thoughts_for_term(fort2, thoughts2);
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
                                xml_utilities.xml_end_tag_internal(random_thought_generator.$$$thoughts);
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

    /**
     * Generate a loadable SQL file at OUTPUT-FILENAME from a random-thought XML document at XML-STREAM.
     */
    @LispMethod(comment = "Generate a loadable SQL file at OUTPUT-FILENAME from a random-thought XML document at XML-STREAM.")
    public static final SubLObject sql_output_random_thoughts_from_xml_alt(SubLObject xml_stream, SubLObject output_filename, SubLObject id_tracker) {
        if (id_tracker == UNPROVIDED) {
            id_tracker = integer_sequence_generator.new_integer_sequence_generator(UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject token_iterator = web_utilities.new_xml_token_iterator(xml_stream, NIL, NIL, NIL);
                SubLObject row_count = ZERO_INTEGER;
                SubLObject max_rows_per_insert_statement = TEN_INTEGER;
                SubLObject written_some_rowP = NIL;
                SubLObject stream = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream = compatibility.open_text(output_filename, $OUTPUT, NIL);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (!stream.isStream()) {
                        Errors.error($str_alt6$Unable_to_open__S, output_filename);
                    }
                    {
                        SubLObject sql_stream = stream;
                        com.cyc.cycjava.cycl.random_thought_generator.write_random_thought_sql_header(sql_stream);
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
                                noting_percent_progress_preamble($str_alt15$Parsing_XML_stream___);
                                web_utilities.advance_xml_token_iterator_to_next_element(token_iterator);
                                iteration.iteration_next(token_iterator);
                                web_utilities.advance_xml_token_iterator_to_next_element(token_iterator);
                                while (NIL != web_utilities.xml_token_element_nameP(iteration.xml_token_iterator_peek(token_iterator), $str_alt16$thoughts_about)) {
                                    iteration.iteration_next(token_iterator);
                                    web_utilities.advance_xml_token_iterator_to_next_element(token_iterator);
                                } 
                                while (NIL == web_utilities.xml_token_element_nameP(iteration.xml_token_iterator_peek(token_iterator), $$$thoughts)) {
                                    {
                                        SubLObject sexpr = web_utilities.xml_token_iterator_to_sexpr(token_iterator, UNPROVIDED);
                                        SubLObject topic_id = web_utilities.xml_sexpr_attribute_value(sexpr, $str_alt17$topic_id);
                                        SubLObject topic = kb_utilities.find_object_by_compact_hl_external_id_string(topic_id);
                                        SubLObject sexpr_type = web_utilities.xml_sexpr_type(sexpr);
                                        if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                                            if (!sexpr_type.equal($$$thought)) {
                                                Errors.error($str_alt19$Expected__thought___got__S, sexpr_type);
                                            }
                                        }
                                        {
                                            SubLObject assertion_id = web_utilities.xml_sexpr_attribute_value(sexpr, $str_alt20$assertion_id);
                                            SubLObject assertion = kb_utilities.find_object_by_compact_hl_external_id_string(assertion_id);
                                            if (NIL != assertion_handles.valid_assertionP(assertion, UNPROVIDED)) {
                                                {
                                                    SubLObject paraphrase_sexpr = web_utilities.xml_sexpr_daughter(sexpr, $$$paraphrase);
                                                    SubLObject paraphrase = web_utilities.xml_sexpr_attribute_value(paraphrase_sexpr, $$$string);
                                                    if (paraphrase.isString()) {
                                                        {
                                                            SubLObject thought_num = com.cyc.cycjava.cycl.random_thought_generator.next_random_thought_num_for_topic(id_tracker, topic);
                                                            if (NIL == written_some_rowP) {
                                                            } else {
                                                                if (mod(row_count, max_rows_per_insert_statement).isZero()) {
                                                                    format(sql_stream, $str_alt23$_____);
                                                                    com.cyc.cycjava.cycl.random_thought_generator.write_random_thought_sql_header(sql_stream);
                                                                } else {
                                                                    format(sql_stream, $str_alt24$___);
                                                                }
                                                            }
                                                            com.cyc.cycjava.cycl.random_thought_generator.write_random_thought_sql_row(thought_num, topic, assertion, paraphrase, sql_stream);
                                                            written_some_rowP = T;
                                                            row_count = add(row_count, ONE_INTEGER);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                    web_utilities.advance_xml_token_iterator_to_next_element(token_iterator);
                                    while (NIL != web_utilities.xml_token_element_nameP(iteration.xml_token_iterator_peek(token_iterator), $str_alt16$thoughts_about)) {
                                        iteration.iteration_next(token_iterator);
                                        web_utilities.advance_xml_token_iterator_to_next_element(token_iterator);
                                    } 
                                    thread.resetMultipleValues();
                                    {
                                        SubLObject done = web_utilities.xml_token_iterator_progress(token_iterator);
                                        SubLObject total = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        note_percent_progress(done, total);
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
                        format(sql_stream, $str_alt23$_____);
                    }
                } finally {
                    {
                        SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            if (stream.isStream()) {
                                close(stream, UNPROVIDED);
                            }
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                        }
                    }
                }
            }
            return values(output_filename, id_tracker);
        }
    }

    /**
     * Generate a loadable SQL file at OUTPUT-FILENAME from a random-thought XML document at XML-STREAM.
     */
    @LispMethod(comment = "Generate a loadable SQL file at OUTPUT-FILENAME from a random-thought XML document at XML-STREAM.")
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
                Errors.error(random_thought_generator.$str6$Unable_to_open__S, output_filename);
            }
            final SubLObject sql_stream = stream;
            random_thought_generator.write_random_thought_sql_header(sql_stream);
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
                    noting_percent_progress_preamble(random_thought_generator.$str16$Parsing_XML_stream___);
                    xml_parsing_utilities.advance_xml_token_iterator_to_next_element(token_iterator);
                    iteration.iteration_next(token_iterator);
                    xml_parsing_utilities.advance_xml_token_iterator_to_next_element(token_iterator);
                    while (NIL != xml_parsing_utilities.xml_token_element_nameP(iteration.xml_token_iterator_peek(token_iterator), random_thought_generator.$str17$thoughts_about)) {
                        iteration.iteration_next(token_iterator);
                        xml_parsing_utilities.advance_xml_token_iterator_to_next_element(token_iterator);
                    } 
                    while (NIL == xml_parsing_utilities.xml_token_element_nameP(iteration.xml_token_iterator_peek(token_iterator), random_thought_generator.$$$thoughts)) {
                        final SubLObject sexpr = xml_parsing_utilities.xml_token_iterator_to_sexpr(token_iterator, UNPROVIDED);
                        final SubLObject topic_id = xml_parsing_utilities.xml_sexpr_attribute_value(sexpr, random_thought_generator.$str18$topic_id);
                        final SubLObject topic = kb_utilities.find_object_by_compact_hl_external_id_string(topic_id);
                        final SubLObject sexpr_type = xml_parsing_utilities.xml_sexpr_type(sexpr);
                        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!sexpr_type.equal(random_thought_generator.$$$thought))) {
                            Errors.error(random_thought_generator.$str20$Expected__thought___got__S, sexpr_type);
                        }
                        final SubLObject assertion_id = xml_parsing_utilities.xml_sexpr_attribute_value(sexpr, random_thought_generator.$str21$assertion_id);
                        final SubLObject assertion = kb_utilities.find_object_by_compact_hl_external_id_string(assertion_id);
                        if (NIL != assertion_handles.valid_assertionP(assertion, UNPROVIDED)) {
                            final SubLObject paraphrase_sexpr = xml_parsing_utilities.xml_sexpr_daughter(sexpr, random_thought_generator.$$$paraphrase);
                            final SubLObject paraphrase = xml_parsing_utilities.xml_sexpr_attribute_value(paraphrase_sexpr, random_thought_generator.$$$string);
                            if (paraphrase.isString()) {
                                final SubLObject thought_num = random_thought_generator.next_random_thought_num_for_topic(id_tracker, topic);
                                if (NIL != written_some_rowP) {
                                    if (mod(row_count, max_rows_per_insert_statement).isZero()) {
                                        format(sql_stream, random_thought_generator.$str24$_____);
                                        random_thought_generator.write_random_thought_sql_header(sql_stream);
                                    } else {
                                        format(sql_stream, random_thought_generator.$str25$___);
                                    }
                                }
                                random_thought_generator.write_random_thought_sql_row(thought_num, topic, assertion, paraphrase, sql_stream);
                                written_some_rowP = T;
                                row_count = add(row_count, ONE_INTEGER);
                            }
                        }
                        xml_parsing_utilities.advance_xml_token_iterator_to_next_element(token_iterator);
                        while (NIL != xml_parsing_utilities.xml_token_element_nameP(iteration.xml_token_iterator_peek(token_iterator), random_thought_generator.$str17$thoughts_about)) {
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
            format(sql_stream, random_thought_generator.$str24$_____);
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

    public static final SubLObject next_random_thought_num_for_topic_alt(SubLObject id_tracker, SubLObject topic) {
        return integer_sequence_generator.integer_sequence_generator_next(id_tracker);
    }

    public static SubLObject next_random_thought_num_for_topic(final SubLObject id_tracker, final SubLObject topic) {
        return integer_sequence_generator.integer_sequence_generator_next(id_tracker);
    }

    public static final SubLObject write_random_thought_sql_header_alt(SubLObject sql_stream) {
        princ($str_alt25$INSERT_INTO_THOUGHTS_INTERNAL_ID_, sql_stream);
        terpri(sql_stream);
        return NIL;
    }

    public static SubLObject write_random_thought_sql_header(final SubLObject sql_stream) {
        princ(random_thought_generator.$str26$INSERT_INTO_THOUGHTS_INTERNAL_ID_, sql_stream);
        terpri(sql_stream);
        return NIL;
    }

    public static final SubLObject write_random_thought_sql_row_alt(SubLObject thought_num, SubLObject topic, SubLObject assertion, SubLObject paraphrase, SubLObject sql_stream) {
        SubLTrampolineFile.checkType(paraphrase, STRINGP);
        format(sql_stream, $str_alt26$___D____A_____A_____A_____A_____A, new SubLObject[]{ thought_num, kb_utilities.compact_hl_external_id_string(topic), topic, kb_utilities.compact_hl_external_id_string(assertion), uncanonicalizer.assertion_el_formula(assertion), uncanonicalizer.assertion_elmt(assertion), NIL != find(CHAR_quote, paraphrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) ? ((SubLObject) (string_utilities.replace_substring(paraphrase, $str_alt27$_, $str_alt28$__))) : paraphrase });
        return NIL;
    }

    public static SubLObject write_random_thought_sql_row(final SubLObject thought_num, final SubLObject topic, final SubLObject assertion, final SubLObject paraphrase, final SubLObject sql_stream) {
        assert NIL != stringp(paraphrase) : "! stringp(paraphrase) " + ("Types.stringp(paraphrase) " + "CommonSymbols.NIL != Types.stringp(paraphrase) ") + paraphrase;
        format(sql_stream, random_thought_generator.$str27$___D____A_____A_____A_____A_____A, new SubLObject[]{ thought_num, kb_utilities.compact_hl_external_id_string(topic), topic, kb_utilities.compact_hl_external_id_string(assertion), uncanonicalizer.assertion_el_formula(assertion), uncanonicalizer.assertion_elmt(assertion), NIL != find(CHAR_quote, paraphrase, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) ? string_utilities.replace_substring(paraphrase, random_thought_generator.$str28$_, random_thought_generator.$str29$__) : paraphrase });
        return NIL;
    }

    public static final SubLObject xml_output_random_thoughts_for_term_alt(SubLObject v_term, SubLObject thoughts) {
        if (thoughts == UNPROVIDED) {
            thoughts = com.cyc.cycjava.cycl.random_thought_generator.all_random_thoughts_on_topic(v_term);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(v_term, FORT_P);
            {
                SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                SubLObject _prev_bind_1 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal($str_alt16$thoughts_about, list($$$term, kb_utilities.compact_hl_external_id_string(v_term)), NIL);
                    xml_utilities.xml_terpri();
                    {
                        SubLObject cdolist_list_var = thoughts;
                        SubLObject thought = NIL;
                        for (thought = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , thought = cdolist_list_var.first()) {
                            com.cyc.cycjava.cycl.random_thought_generator.xml_output_random_thought(thought);
                            xml_utilities.xml_terpri();
                            force_output(xml_vars.$xml_stream$.getDynamicValue(thread));
                        }
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
                }
            }
            xml_utilities.xml_terpri();
            xml_utilities.xml_end_tag_internal($str_alt16$thoughts_about);
            return v_term;
        }
    }

    public static SubLObject xml_output_random_thoughts_for_term(final SubLObject v_term, SubLObject thoughts) {
        if (thoughts == UNPROVIDED) {
            thoughts = random_thought_generator.all_random_thoughts_on_topic(v_term);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(v_term) : "! forts.fort_p(v_term) " + ("forts.fort_p(v_term) " + "CommonSymbols.NIL != forts.fort_p(v_term) ") + v_term;
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal(random_thought_generator.$str17$thoughts_about, list(random_thought_generator.$$$term, kb_utilities.compact_hl_external_id_string(v_term)), NIL, NIL, $UNINITIALIZED);
                final SubLObject _prev_bind_0_$20 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                    xml_utilities.xml_terpri();
                    SubLObject cdolist_list_var = thoughts;
                    SubLObject thought = NIL;
                    thought = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        random_thought_generator.xml_output_random_thought(thought);
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
                xml_utilities.xml_end_tag_internal(random_thought_generator.$str17$thoughts_about);
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return v_term;
    }

    public static final SubLObject xml_output_random_thought_alt(SubLObject random_thought) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(random_thought, VALID_NON_EMPTY_RANDOM_THOUGHT_P);
            {
                SubLObject attributes = list($str_alt17$topic_id, kb_utilities.compact_hl_external_id_string(random_thought.first()), $str_alt20$assertion_id, kb_utilities.compact_hl_external_id_string(second(random_thought)));
                {
                    SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                    SubLObject _prev_bind_1 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                        xml_utilities.xml_start_tag_internal($$$thought, attributes, NIL);
                        xml_utilities.xml_terpri();
                        pph_html.xml_output_pph_javalist(third(random_thought));
                    } finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1, thread);
                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
                    }
                }
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal($$$thought);
            }
            return NIL;
        }
    }

    public static SubLObject xml_output_random_thought(final SubLObject random_thought) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != random_thought_generator.valid_non_empty_random_thought_p(random_thought) : "! random_thought_generator.valid_non_empty_random_thought_p(random_thought) " + ("random_thought_generator.valid_non_empty_random_thought_p(random_thought) " + "CommonSymbols.NIL != random_thought_generator.valid_non_empty_random_thought_p(random_thought) ") + random_thought;
        final SubLObject attributes = list(random_thought_generator.$str18$topic_id, kb_utilities.compact_hl_external_id_string(random_thought.first()), random_thought_generator.$str21$assertion_id, kb_utilities.compact_hl_external_id_string(second(random_thought)));
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal(random_thought_generator.$$$thought, attributes, NIL, NIL, $UNINITIALIZED);
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
                xml_utilities.xml_end_tag_internal(random_thought_generator.$$$thought);
                restoreValuesFromVector(_values);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return NIL;
    }

    public static final SubLObject valid_non_empty_random_thought_p_alt(SubLObject v_object) {
        return makeBoolean(((NIL != com.cyc.cycjava.cycl.random_thought_generator.non_empty_random_thought_p(v_object)) && (NIL != forts.valid_fortP(v_object.first()))) && (NIL != assertion_handles.valid_assertionP(second(v_object), UNPROVIDED)));
    }

    public static SubLObject valid_non_empty_random_thought_p(final SubLObject v_object) {
        return makeBoolean(((NIL != random_thought_generator.non_empty_random_thought_p(v_object)) && (NIL != forts.valid_fortP(v_object.first()))) && (NIL != assertion_handles.valid_assertionP(second(v_object), UNPROVIDED)));
    }

    /**
     *
     *
     * @return RANDOM-THOUGHT-P, not yet shown to USER.
     * @param PARAMETERS
     * 		property-list-p, including
     * 		:TOPIC if specified, we'll try to return a thought on that topic.
     * 		:REQUIRE-TOPICAL? if non-NIL, we'll return the empty thought rather than an off-topic thought.
     * 		:NOW if non-NIL, we won't wait for a new thought to be generated if none is queued up
     */
    @LispMethod(comment = "@return RANDOM-THOUGHT-P, not yet shown to USER.\r\n@param PARAMETERS\r\n\t\tproperty-list-p, including\r\n\t\t:TOPIC if specified, we\'ll try to return a thought on that topic.\r\n\t\t:REQUIRE-TOPICAL? if non-NIL, we\'ll return the empty thought rather than an off-topic thought.\r\n\t\t:NOW if non-NIL, we won\'t wait for a new thought to be generated if none is queued up")
    public static final SubLObject next_random_thought_for_user_alt(SubLObject user, SubLObject parameters) {
        if (parameters == UNPROVIDED) {
            parameters = NIL;
        }
        SubLTrampolineFile.checkType(user, FORT_P);
        {
            SubLObject rtg = com.cyc.cycjava.cycl.random_thought_generator.find_or_create_random_thought_generator_for_user(user);
            if (NIL != getf(parameters, $TOPIC, NIL)) {
                return com.cyc.cycjava.cycl.random_thought_generator.next_random_thought_with_suggested_topic(rtg, parameters);
            } else {
                return com.cyc.cycjava.cycl.random_thought_generator.next_random_thought_without_suggested_topic(rtg, parameters);
            }
        }
    }

    /**
     *
     *
     * @return RANDOM-THOUGHT-P, not yet shown to USER.
     * @param PARAMETERS
     * 		property-list-p, including
     * 		:TOPIC if specified, we'll try to return a thought on that topic.
     * 		:REQUIRE-TOPICAL? if non-NIL, we'll return the empty thought rather than an off-topic thought.
     * 		:NOW if non-NIL, we won't wait for a new thought to be generated if none is queued up
     */
    @LispMethod(comment = "@return RANDOM-THOUGHT-P, not yet shown to USER.\r\n@param PARAMETERS\r\n\t\tproperty-list-p, including\r\n\t\t:TOPIC if specified, we\'ll try to return a thought on that topic.\r\n\t\t:REQUIRE-TOPICAL? if non-NIL, we\'ll return the empty thought rather than an off-topic thought.\r\n\t\t:NOW if non-NIL, we won\'t wait for a new thought to be generated if none is queued up")
    public static SubLObject next_random_thought_for_user(final SubLObject user, SubLObject parameters) {
        if (parameters == UNPROVIDED) {
            parameters = NIL;
        }
        assert NIL != forts.fort_p(user) : "! forts.fort_p(user) " + ("forts.fort_p(user) " + "CommonSymbols.NIL != forts.fort_p(user) ") + user;
        final SubLObject rtg = random_thought_generator.find_or_create_random_thought_generator_for_user(user);
        if (NIL != getf(parameters, $TOPIC, NIL)) {
            return random_thought_generator.next_random_thought_with_suggested_topic(rtg, parameters);
        }
        return random_thought_generator.next_random_thought_without_suggested_topic(rtg, parameters);
    }

    /**
     *
     *
     * @return BOOLEANP; Has ASSERTION been shown to CYCLIST as a random thought?
     */
    @LispMethod(comment = "@return BOOLEANP; Has ASSERTION been shown to CYCLIST as a random thought?")
    public static final SubLObject thcl_assertion_seen_by_cyclistP_alt(SubLObject assertion, SubLObject cyclist) {
        if (NIL == forts.fort_p(cyclist)) {
            return NIL;
        }
        {
            SubLObject rtg = com.cyc.cycjava.cycl.random_thought_generator.find_random_thought_generator_for_user(cyclist);
            return makeBoolean((NIL != rtg) && (NIL != set.set_memberP(assertion, com.cyc.cycjava.cycl.random_thought_generator.rtg_done_assertions(rtg))));
        }
    }

    /**
     *
     *
     * @return BOOLEANP; Has ASSERTION been shown to CYCLIST as a random thought?
     */
    @LispMethod(comment = "@return BOOLEANP; Has ASSERTION been shown to CYCLIST as a random thought?")
    public static SubLObject thcl_assertion_seen_by_cyclistP(final SubLObject assertion, final SubLObject cyclist) {
        if (NIL == forts.fort_p(cyclist)) {
            return NIL;
        }
        final SubLObject rtg = random_thought_generator.find_random_thought_generator_for_user(cyclist);
        return makeBoolean((NIL != rtg) && (NIL != set.set_memberP(assertion, random_thought_generator.rtg_done_assertions(rtg))));
    }

    /**
     *
     *
     * @return NON-NEGATIVE-INTEGER-P; Number of random thoughts queued up
    to show to USER.
     */
    @LispMethod(comment = "@return NON-NEGATIVE-INTEGER-P; Number of random thoughts queued up\r\nto show to USER.")
    public static final SubLObject number_of_queued_random_thoughts_for_user_alt(SubLObject user) {
        SubLTrampolineFile.checkType(user, FORT_P);
        {
            SubLObject rtg = com.cyc.cycjava.cycl.random_thought_generator.find_random_thought_generator_for_user(user);
            return NIL != rtg ? ((SubLObject) (queues.queue_size(com.cyc.cycjava.cycl.random_thought_generator.rtg_queue(rtg)))) : ZERO_INTEGER;
        }
    }

    /**
     *
     *
     * @return NON-NEGATIVE-INTEGER-P; Number of random thoughts queued up
    to show to USER.
     */
    @LispMethod(comment = "@return NON-NEGATIVE-INTEGER-P; Number of random thoughts queued up\r\nto show to USER.")
    public static SubLObject number_of_queued_random_thoughts_for_user(final SubLObject user) {
        assert NIL != forts.fort_p(user) : "! forts.fort_p(user) " + ("forts.fort_p(user) " + "CommonSymbols.NIL != forts.fort_p(user) ") + user;
        final SubLObject rtg = random_thought_generator.find_random_thought_generator_for_user(user);
        return NIL != rtg ? queues.queue_size(random_thought_generator.rtg_queue(rtg)) : ZERO_INTEGER;
    }

    /**
     *
     *
     * @return NON-NEGATIVE-INTEGER-P; Number of random thoughts already used
    for USER.
     */
    @LispMethod(comment = "@return NON-NEGATIVE-INTEGER-P; Number of random thoughts already used\r\nfor USER.")
    public static final SubLObject number_of_used_random_thoughts_for_user_alt(SubLObject user) {
        SubLTrampolineFile.checkType(user, FORT_P);
        {
            SubLObject rtg = com.cyc.cycjava.cycl.random_thought_generator.find_random_thought_generator_for_user(user);
            return NIL != rtg ? ((SubLObject) (subtract(set.set_size(com.cyc.cycjava.cycl.random_thought_generator.rtg_done_assertions(rtg)), com.cyc.cycjava.cycl.random_thought_generator.number_of_queued_random_thoughts_for_user(user)))) : ZERO_INTEGER;
        }
    }

    /**
     *
     *
     * @return NON-NEGATIVE-INTEGER-P; Number of random thoughts already used
    for USER.
     */
    @LispMethod(comment = "@return NON-NEGATIVE-INTEGER-P; Number of random thoughts already used\r\nfor USER.")
    public static SubLObject number_of_used_random_thoughts_for_user(final SubLObject user) {
        assert NIL != forts.fort_p(user) : "! forts.fort_p(user) " + ("forts.fort_p(user) " + "CommonSymbols.NIL != forts.fort_p(user) ") + user;
        final SubLObject rtg = random_thought_generator.find_random_thought_generator_for_user(user);
        return NIL != rtg ? subtract(set.set_size(random_thought_generator.rtg_done_assertions(rtg)), random_thought_generator.number_of_queued_random_thoughts_for_user(user)) : ZERO_INTEGER;
    }

    public static final SubLObject remote_random_thought_image_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == remote_image.remote_image_p($remote_random_thought_image$.getGlobalValue())) {
                com.cyc.cycjava.cycl.random_thought_generator.set_remote_random_thought_image($random_thought_server_host$.getDynamicValue(thread), $random_thought_server_port$.getDynamicValue(thread), $CFASL);
            }
            return $remote_random_thought_image$.getGlobalValue();
        }
    }

    public static SubLObject remote_random_thought_image() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == remote_image.remote_image_p(random_thought_generator.$remote_random_thought_image$.getGlobalValue())) {
            random_thought_generator.set_remote_random_thought_image(random_thought_generator.$random_thought_server_host$.getDynamicValue(thread), random_thought_generator.$random_thought_server_port$.getDynamicValue(thread), $CFASL);
        }
        return random_thought_generator.$remote_random_thought_image$.getGlobalValue();
    }

    public static final SubLObject set_remote_random_thought_image_alt(SubLObject machine, SubLObject port, SubLObject protocol) {
        $remote_random_thought_image$.setGlobalValue(remote_image.new_remote_image(machine, port, protocol));
        return remote_image.remote_image_p($remote_random_thought_image$.getGlobalValue());
    }

    public static SubLObject set_remote_random_thought_image(final SubLObject machine, final SubLObject port, final SubLObject protocol) {
        random_thought_generator.$remote_random_thought_image$.setGlobalValue(remote_image.new_remote_image(machine, port, protocol));
        return remote_image.remote_image_p(random_thought_generator.$remote_random_thought_image$.getGlobalValue());
    }

    public static final SubLObject unset_remote_random_thought_image_alt() {
        $remote_random_thought_image$.setGlobalValue(NIL);
        return T;
    }

    public static SubLObject unset_remote_random_thought_image() {
        random_thought_generator.$remote_random_thought_image$.setGlobalValue(NIL);
        return T;
    }

    public static final SubLObject clear_remote_random_thought_connection_pool_alt() {
        {
            SubLObject q = $remote_random_thought_connection_pool$.getGlobalValue();
            SubLObject done_var = queues.queue_empty_p(q);
            while (NIL == done_var) {
                {
                    SubLObject connection = queues.dequeue(q);
                    remote_image.close_remote_image_connection(connection);
                    done_var = queues.queue_empty_p(q);
                }
            } 
        }
        return T;
    }

    public static SubLObject clear_remote_random_thought_connection_pool() {
        for (SubLObject q = random_thought_generator.$remote_random_thought_connection_pool$.getGlobalValue(), done_var = queues.queue_empty_p(q); NIL == done_var; done_var = queues.queue_empty_p(q)) {
            final SubLObject connection = queues.dequeue(q);
            remote_image.close_remote_image_connection(connection);
        }
        return T;
    }

    public static final SubLObject random_thought_server_hostXport_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject host = NIL;
                SubLObject port = NIL;
                SubLObject ignore_errors_tag = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                            try {
                                {
                                    SubLObject connection = com.cyc.cycjava.cycl.random_thought_generator.get_free_random_thought_connection();
                                    SubLObject success_var = NIL;
                                    try {
                                        if (NIL != com.cyc.cycjava.cycl.random_thought_generator.open_remote_random_thought_connection_p(connection)) {
                                            {
                                                SubLObject image = remote_image.remote_image_connection_image(connection);
                                                SubLObject cfasl_port = remote_image.remote_image_port(image);
                                                host = remote_image.remote_image_machine(image);
                                                port = subtract(cfasl_port, system_parameters.$cfasl_port_offset$.getDynamicValue(thread));
                                            }
                                            com.cyc.cycjava.cycl.random_thought_generator.release_random_thought_connection(connection);
                                        }
                                        success_var = T;
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0_11 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                if (NIL == success_var) {
                                                    remote_image.close_remote_image_connection(connection);
                                                }
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_11, thread);
                                            }
                                        }
                                    }
                                }
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
                return values(host, port);
            }
        }
    }

    public static SubLObject random_thought_server_hostXport() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject host = NIL;
        SubLObject port = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push(random_thought_generator.$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(random_thought_generator.IGNORE_ERRORS_HANDLER), thread);
                try {
                    final SubLObject connection = random_thought_generator.get_free_random_thought_connection();
                    SubLObject success_var = NIL;
                    try {
                        if (NIL != random_thought_generator.open_remote_random_thought_connection_p(connection)) {
                            final SubLObject image = remote_image.remote_image_connection_image(connection);
                            final SubLObject cfasl_port = remote_image.remote_image_port(image);
                            host = remote_image.remote_image_machine(image);
                            port = subtract(cfasl_port, system_parameters.$cfasl_port_offset$.getDynamicValue(thread));
                            random_thought_generator.release_random_thought_connection(connection);
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
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, random_thought_generator.$IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        return values(host, port);
    }

    public static final SubLObject next_random_thought_for_user_from_remote_server_alt(SubLObject user, SubLObject parameters) {
        {
            SubLObject thought = $NOT_TRIED;
            while (!((NIL == thought) || (NIL != com.cyc.cycjava.cycl.random_thought_generator.valid_non_empty_random_thought_p(thought)))) {
                thought = com.cyc.cycjava.cycl.random_thought_generator.next_random_thought_for_user_from_remote_server_int(user, parameters);
            } 
            return thought;
        }
    }

    public static SubLObject next_random_thought_for_user_from_remote_server(final SubLObject user, final SubLObject parameters) {
        SubLObject thought;
        for (thought = $NOT_TRIED; (NIL != thought) && (NIL == random_thought_generator.valid_non_empty_random_thought_p(thought)); thought = random_thought_generator.next_random_thought_for_user_from_remote_server_int(user, parameters)) {
        }
        return thought;
    }

    public static final SubLObject next_random_thought_for_user_from_remote_server_int_alt(SubLObject user, SubLObject parameters) {
        {
            SubLObject api_request = list(NEXT_RANDOM_THOUGHT_FOR_USER, list(QUOTE, user), list(QUOTE, parameters));
            SubLObject augmented_api_request = list(PROGN, $list_alt50, list(MULTIPLE_VALUE_LIST, api_request));
            SubLObject results_list = NIL;
            SubLObject connection = NIL;
            SubLObject error_message = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                        try {
                            connection = com.cyc.cycjava.cycl.random_thought_generator.get_free_random_thought_connection();
                            {
                                SubLObject success_var = NIL;
                                try {
                                    results_list = remote_image.remote_image_connection_eval(connection, augmented_api_request);
                                    com.cyc.cycjava.cycl.random_thought_generator.release_random_thought_connection(connection);
                                    success_var = T;
                                } finally {
                                    {
                                        SubLObject _prev_bind_0_12 = currentBinding($is_thread_performing_cleanupP$);
                                        try {
                                            bind($is_thread_performing_cleanupP$, T);
                                            if (NIL == success_var) {
                                                remote_image.close_remote_image_connection(connection);
                                            }
                                        } finally {
                                            rebind($is_thread_performing_cleanupP$, _prev_bind_0_12);
                                        }
                                    }
                                }
                            }
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            }
            if (NIL != error_message) {
                Errors.warn(error_message);
            }
            return NIL != results_list ? ((SubLObject) (values_list(results_list))) : NIL;
        }
    }

    public static SubLObject next_random_thought_for_user_from_remote_server_int(final SubLObject user, final SubLObject parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject api_request = list(random_thought_generator.NEXT_RANDOM_THOUGHT_FOR_USER, list(QUOTE, user), list(QUOTE, parameters));
        final SubLObject augmented_api_request = list(PROGN, random_thought_generator.$list51, list(MULTIPLE_VALUE_LIST, api_request));
        SubLObject results_list = NIL;
        SubLObject connection = NIL;
        SubLObject error_message = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    connection = random_thought_generator.get_free_random_thought_connection();
                    SubLObject success_var = NIL;
                    try {
                        results_list = remote_image.remote_image_connection_eval(connection, augmented_api_request);
                        random_thought_generator.release_random_thought_connection(connection);
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

    public static final SubLObject create_remote_random_thought_connection_alt() {
        {
            SubLObject v_remote_image = com.cyc.cycjava.cycl.random_thought_generator.remote_random_thought_image();
            SubLObject connection = remote_image.new_remote_image_connection(v_remote_image);
            if (NIL != remote_image.remote_image_connection_p(connection)) {
                remote_image.open_remote_image_connection(connection);
                return connection;
            }
            return Errors.error($str_alt53$Could_not_open_a_connection_to__s, v_remote_image);
        }
    }

    public static SubLObject create_remote_random_thought_connection() {
        final SubLObject v_remote_image = random_thought_generator.remote_random_thought_image();
        final SubLObject connection = remote_image.new_remote_image_connection(v_remote_image);
        if (NIL != remote_image.remote_image_connection_p(connection)) {
            remote_image.open_remote_image_connection(connection);
            return connection;
        }
        return Errors.error(random_thought_generator.$str54$Could_not_open_a_connection_to__s, v_remote_image);
    }

    public static final SubLObject release_random_thought_connection_alt(SubLObject connection) {
        {
            SubLObject lock = $remote_random_thought_connection_pool_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                if (queues.queue_size($remote_random_thought_connection_pool$.getGlobalValue()).numGE($remote_random_thought_connection_pool_max_size$.getGlobalValue())) {
                    remote_image.close_remote_image_connection(connection);
                } else {
                    queues.enqueue(connection, $remote_random_thought_connection_pool$.getGlobalValue());
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
        }
        return T;
    }

    public static SubLObject release_random_thought_connection(final SubLObject connection) {
        SubLObject release = NIL;
        try {
            release = seize_lock(random_thought_generator.$remote_random_thought_connection_pool_lock$.getGlobalValue());
            if (queues.queue_size(random_thought_generator.$remote_random_thought_connection_pool$.getGlobalValue()).numGE(random_thought_generator.$remote_random_thought_connection_pool_max_size$.getGlobalValue())) {
                remote_image.close_remote_image_connection(connection);
            } else {
                queues.enqueue(connection, random_thought_generator.$remote_random_thought_connection_pool$.getGlobalValue());
            }
        } finally {
            if (NIL != release) {
                release_lock(random_thought_generator.$remote_random_thought_connection_pool_lock$.getGlobalValue());
            }
        }
        return T;
    }

    public static final SubLObject open_remote_random_thought_connection_p_alt(SubLObject v_object) {
        return makeBoolean((NIL != remote_image.remote_image_connection_p(v_object)) && (NIL != open_stream_p(remote_image.remote_image_connection_channel(v_object))));
    }

    public static SubLObject open_remote_random_thought_connection_p(final SubLObject v_object) {
        return makeBoolean((NIL != remote_image.remote_image_connection_p(v_object)) && (NIL != open_stream_p(remote_image.remote_image_connection_channel(v_object))));
    }

    public static final SubLObject get_free_random_thought_connection_alt() {
        {
            SubLObject connection = NIL;
            SubLObject lock = $remote_random_thought_connection_pool_lock$.getGlobalValue();
            SubLObject release = NIL;
            try {
                release = seize_lock(lock);
                {
                    SubLObject q = $remote_random_thought_connection_pool$.getGlobalValue();
                    SubLObject done_var = makeBoolean((NIL != connection) || (NIL != queues.queue_empty_p(q)));
                    while (NIL == done_var) {
                        {
                            SubLObject candidate = queues.dequeue(q);
                            if (NIL != com.cyc.cycjava.cycl.random_thought_generator.open_remote_random_thought_connection_p(candidate)) {
                                connection = candidate;
                            }
                            done_var = makeBoolean((NIL != connection) || (NIL != queues.queue_empty_p(q)));
                        }
                    } 
                }
                if (NIL == connection) {
                    connection = com.cyc.cycjava.cycl.random_thought_generator.create_remote_random_thought_connection();
                }
            } finally {
                if (NIL != release) {
                    release_lock(lock);
                }
            }
            return connection;
        }
    }

    public static SubLObject get_free_random_thought_connection() {
        SubLObject connection = NIL;
        SubLObject release = NIL;
        try {
            release = seize_lock(random_thought_generator.$remote_random_thought_connection_pool_lock$.getGlobalValue());
            for (SubLObject q = random_thought_generator.$remote_random_thought_connection_pool$.getGlobalValue(), done_var = makeBoolean((NIL != connection) || (NIL != queues.queue_empty_p(q))); NIL == done_var; done_var = makeBoolean((NIL != connection) || (NIL != queues.queue_empty_p(q)))) {
                final SubLObject candidate = queues.dequeue(q);
                if (NIL != random_thought_generator.open_remote_random_thought_connection_p(candidate)) {
                    connection = candidate;
                }
            }
            if (NIL == connection) {
                connection = random_thought_generator.create_remote_random_thought_connection();
            }
        } finally {
            if (NIL != release) {
                release_lock(random_thought_generator.$remote_random_thought_connection_pool_lock$.getGlobalValue());
            }
        }
        return connection;
    }

    public static final SubLObject register_random_thought_generator_alt(SubLObject rtg, SubLObject user) {
        return dictionary.dictionary_enter($random_thought_generators_for_users$.getGlobalValue(), user, rtg);
    }

    public static SubLObject register_random_thought_generator(final SubLObject rtg, final SubLObject user) {
        return dictionary.dictionary_enter(random_thought_generator.$random_thought_generators_for_users$.getGlobalValue(), user, rtg);
    }

    public static final SubLObject find_random_thought_generator_for_user_alt(SubLObject user) {
        return dictionary.dictionary_lookup($random_thought_generators_for_users$.getGlobalValue(), user, NIL);
    }

    public static SubLObject find_random_thought_generator_for_user(final SubLObject user) {
        return dictionary.dictionary_lookup(random_thought_generator.$random_thought_generators_for_users$.getGlobalValue(), user, NIL);
    }

    public static final SubLObject random_thought_generator_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        com.cyc.cycjava.cycl.random_thought_generator.pprint_random_thought_generator(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject random_thought_generator_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        random_thought_generator.pprint_random_thought_generator(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject random_thought_generator_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.random_thought_generator.$random_thought_generator_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject random_thought_generator_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.random_thought_generator.$random_thought_generator_native.class ? T : NIL;
    }

    public static final SubLObject rtg_struct_user_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RANDOM_THOUGHT_GENERATOR_P);
        return v_object.getField2();
    }

    public static SubLObject rtg_struct_user(final SubLObject v_object) {
        assert NIL != random_thought_generator.random_thought_generator_p(v_object) : "! random_thought_generator.random_thought_generator_p(v_object) " + "random_thought_generator.random_thought_generator_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject rtg_struct_done_assertions_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RANDOM_THOUGHT_GENERATOR_P);
        return v_object.getField3();
    }

    public static SubLObject rtg_struct_done_assertions(final SubLObject v_object) {
        assert NIL != random_thought_generator.random_thought_generator_p(v_object) : "! random_thought_generator.random_thought_generator_p(v_object) " + "random_thought_generator.random_thought_generator_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject rtg_struct_generator_thread_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RANDOM_THOUGHT_GENERATOR_P);
        return v_object.getField4();
    }

    public static SubLObject rtg_struct_generator_thread(final SubLObject v_object) {
        assert NIL != random_thought_generator.random_thought_generator_p(v_object) : "! random_thought_generator.random_thought_generator_p(v_object) " + "random_thought_generator.random_thought_generator_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject rtg_struct_queue_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RANDOM_THOUGHT_GENERATOR_P);
        return v_object.getField5();
    }

    public static SubLObject rtg_struct_queue(final SubLObject v_object) {
        assert NIL != random_thought_generator.random_thought_generator_p(v_object) : "! random_thought_generator.random_thought_generator_p(v_object) " + "random_thought_generator.random_thought_generator_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject rtg_struct_most_recently_added_thought_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RANDOM_THOUGHT_GENERATOR_P);
        return v_object.getField6();
    }

    public static SubLObject rtg_struct_most_recently_added_thought(final SubLObject v_object) {
        assert NIL != random_thought_generator.random_thought_generator_p(v_object) : "! random_thought_generator.random_thought_generator_p(v_object) " + "random_thought_generator.random_thought_generator_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject rtg_struct_topical_thoughts_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, RANDOM_THOUGHT_GENERATOR_P);
        return v_object.getField7();
    }

    public static SubLObject rtg_struct_topical_thoughts(final SubLObject v_object) {
        assert NIL != random_thought_generator.random_thought_generator_p(v_object) : "! random_thought_generator.random_thought_generator_p(v_object) " + "random_thought_generator.random_thought_generator_p error :" + v_object;
        return v_object.getField7();
    }

    public static final SubLObject _csetf_rtg_struct_user_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RANDOM_THOUGHT_GENERATOR_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_rtg_struct_user(final SubLObject v_object, final SubLObject value) {
        assert NIL != random_thought_generator.random_thought_generator_p(v_object) : "! random_thought_generator.random_thought_generator_p(v_object) " + "random_thought_generator.random_thought_generator_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_rtg_struct_done_assertions_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RANDOM_THOUGHT_GENERATOR_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_rtg_struct_done_assertions(final SubLObject v_object, final SubLObject value) {
        assert NIL != random_thought_generator.random_thought_generator_p(v_object) : "! random_thought_generator.random_thought_generator_p(v_object) " + "random_thought_generator.random_thought_generator_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_rtg_struct_generator_thread_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RANDOM_THOUGHT_GENERATOR_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_rtg_struct_generator_thread(final SubLObject v_object, final SubLObject value) {
        assert NIL != random_thought_generator.random_thought_generator_p(v_object) : "! random_thought_generator.random_thought_generator_p(v_object) " + "random_thought_generator.random_thought_generator_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_rtg_struct_queue_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RANDOM_THOUGHT_GENERATOR_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_rtg_struct_queue(final SubLObject v_object, final SubLObject value) {
        assert NIL != random_thought_generator.random_thought_generator_p(v_object) : "! random_thought_generator.random_thought_generator_p(v_object) " + "random_thought_generator.random_thought_generator_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_rtg_struct_most_recently_added_thought_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RANDOM_THOUGHT_GENERATOR_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_rtg_struct_most_recently_added_thought(final SubLObject v_object, final SubLObject value) {
        assert NIL != random_thought_generator.random_thought_generator_p(v_object) : "! random_thought_generator.random_thought_generator_p(v_object) " + "random_thought_generator.random_thought_generator_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject _csetf_rtg_struct_topical_thoughts_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, RANDOM_THOUGHT_GENERATOR_P);
        return v_object.setField7(value);
    }

    public static SubLObject _csetf_rtg_struct_topical_thoughts(final SubLObject v_object, final SubLObject value) {
        assert NIL != random_thought_generator.random_thought_generator_p(v_object) : "! random_thought_generator.random_thought_generator_p(v_object) " + "random_thought_generator.random_thought_generator_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static final SubLObject make_random_thought_generator_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.random_thought_generator.$random_thought_generator_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($USER)) {
                        com.cyc.cycjava.cycl.random_thought_generator._csetf_rtg_struct_user(v_new, current_value);
                    } else {
                        if (pcase_var.eql($DONE_ASSERTIONS)) {
                            com.cyc.cycjava.cycl.random_thought_generator._csetf_rtg_struct_done_assertions(v_new, current_value);
                        } else {
                            if (pcase_var.eql($GENERATOR_THREAD)) {
                                com.cyc.cycjava.cycl.random_thought_generator._csetf_rtg_struct_generator_thread(v_new, current_value);
                            } else {
                                if (pcase_var.eql($QUEUE)) {
                                    com.cyc.cycjava.cycl.random_thought_generator._csetf_rtg_struct_queue(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($MOST_RECENTLY_ADDED_THOUGHT)) {
                                        com.cyc.cycjava.cycl.random_thought_generator._csetf_rtg_struct_most_recently_added_thought(v_new, current_value);
                                    } else {
                                        if (pcase_var.eql($TOPICAL_THOUGHTS)) {
                                            com.cyc.cycjava.cycl.random_thought_generator._csetf_rtg_struct_topical_thoughts(v_new, current_value);
                                        } else {
                                            Errors.error($str_alt81$Invalid_slot__S_for_construction_, current_arg);
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

    public static SubLObject make_random_thought_generator(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.random_thought_generator.$random_thought_generator_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($USER)) {
                random_thought_generator._csetf_rtg_struct_user(v_new, current_value);
            } else
                if (pcase_var.eql($DONE_ASSERTIONS)) {
                    random_thought_generator._csetf_rtg_struct_done_assertions(v_new, current_value);
                } else
                    if (pcase_var.eql($GENERATOR_THREAD)) {
                        random_thought_generator._csetf_rtg_struct_generator_thread(v_new, current_value);
                    } else
                        if (pcase_var.eql($QUEUE)) {
                            random_thought_generator._csetf_rtg_struct_queue(v_new, current_value);
                        } else
                            if (pcase_var.eql(random_thought_generator.$MOST_RECENTLY_ADDED_THOUGHT)) {
                                random_thought_generator._csetf_rtg_struct_most_recently_added_thought(v_new, current_value);
                            } else
                                if (pcase_var.eql($TOPICAL_THOUGHTS)) {
                                    random_thought_generator._csetf_rtg_struct_topical_thoughts(v_new, current_value);
                                } else {
                                    Errors.error(random_thought_generator.$str83$Invalid_slot__S_for_construction_, current_arg);
                                }





        }
        return v_new;
    }

    public static SubLObject visit_defstruct_random_thought_generator(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, random_thought_generator.MAKE_RANDOM_THOUGHT_GENERATOR, SIX_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $USER, random_thought_generator.rtg_struct_user(obj));
        funcall(visitor_fn, obj, $SLOT, $DONE_ASSERTIONS, random_thought_generator.rtg_struct_done_assertions(obj));
        funcall(visitor_fn, obj, $SLOT, $GENERATOR_THREAD, random_thought_generator.rtg_struct_generator_thread(obj));
        funcall(visitor_fn, obj, $SLOT, $QUEUE, random_thought_generator.rtg_struct_queue(obj));
        funcall(visitor_fn, obj, $SLOT, random_thought_generator.$MOST_RECENTLY_ADDED_THOUGHT, random_thought_generator.rtg_struct_most_recently_added_thought(obj));
        funcall(visitor_fn, obj, $SLOT, $TOPICAL_THOUGHTS, random_thought_generator.rtg_struct_topical_thoughts(obj));
        funcall(visitor_fn, obj, $END, random_thought_generator.MAKE_RANDOM_THOUGHT_GENERATOR, SIX_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_random_thought_generator_method(final SubLObject obj, final SubLObject visitor_fn) {
        return random_thought_generator.visit_defstruct_random_thought_generator(obj, visitor_fn);
    }

    public static final SubLObject rtg_user_alt(SubLObject rtg) {
        return com.cyc.cycjava.cycl.random_thought_generator.rtg_struct_user(rtg);
    }

    public static SubLObject rtg_user(final SubLObject rtg) {
        return random_thought_generator.rtg_struct_user(rtg);
    }

    public static final SubLObject rtg_done_assertions_alt(SubLObject rtg) {
        return com.cyc.cycjava.cycl.random_thought_generator.rtg_struct_done_assertions(rtg);
    }

    public static SubLObject rtg_done_assertions(final SubLObject rtg) {
        return random_thought_generator.rtg_struct_done_assertions(rtg);
    }

    public static final SubLObject rtg_generator_thread_alt(SubLObject rtg) {
        return com.cyc.cycjava.cycl.random_thought_generator.rtg_struct_generator_thread(rtg);
    }

    public static SubLObject rtg_generator_thread(final SubLObject rtg) {
        return random_thought_generator.rtg_struct_generator_thread(rtg);
    }

    public static final SubLObject rtg_set_generator_thread_alt(SubLObject rtg, SubLObject process) {
        com.cyc.cycjava.cycl.random_thought_generator._csetf_rtg_struct_generator_thread(rtg, process);
        return process;
    }

    public static SubLObject rtg_set_generator_thread(final SubLObject rtg, final SubLObject process) {
        random_thought_generator._csetf_rtg_struct_generator_thread(rtg, process);
        return process;
    }

    public static final SubLObject rtg_queue_alt(SubLObject rtg) {
        return com.cyc.cycjava.cycl.random_thought_generator.rtg_struct_queue(rtg);
    }

    public static SubLObject rtg_queue(final SubLObject rtg) {
        return random_thought_generator.rtg_struct_queue(rtg);
    }

    public static final SubLObject rtg_most_recently_added_thought_alt(SubLObject rtg) {
        return com.cyc.cycjava.cycl.random_thought_generator.rtg_struct_most_recently_added_thought(rtg);
    }

    public static SubLObject rtg_most_recently_added_thought(final SubLObject rtg) {
        return random_thought_generator.rtg_struct_most_recently_added_thought(rtg);
    }

    public static final SubLObject rtg_set_most_recently_added_thought_alt(SubLObject rtg, SubLObject thought) {
        com.cyc.cycjava.cycl.random_thought_generator._csetf_rtg_struct_most_recently_added_thought(rtg, thought);
        return thought;
    }

    public static SubLObject rtg_set_most_recently_added_thought(final SubLObject rtg, final SubLObject thought) {
        random_thought_generator._csetf_rtg_struct_most_recently_added_thought(rtg, thought);
        return thought;
    }

    public static final SubLObject rtg_topical_thoughts_alt(SubLObject rtg) {
        return com.cyc.cycjava.cycl.random_thought_generator.rtg_struct_topical_thoughts(rtg);
    }

    public static SubLObject rtg_topical_thoughts(final SubLObject rtg) {
        return random_thought_generator.rtg_struct_topical_thoughts(rtg);
    }

    public static final SubLObject rtg_set_topical_thoughts_alt(SubLObject rtg, SubLObject thoughts) {
        com.cyc.cycjava.cycl.random_thought_generator._csetf_rtg_struct_topical_thoughts(rtg, thoughts);
        return thoughts;
    }

    public static SubLObject rtg_set_topical_thoughts(final SubLObject rtg, final SubLObject thoughts) {
        random_thought_generator._csetf_rtg_struct_topical_thoughts(rtg, thoughts);
        return thoughts;
    }

    public static final SubLObject pprint_random_thought_generator_alt(SubLObject rtg, SubLObject stream, SubLObject depth) {
        if (stream == UNPROVIDED) {
            stream = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        format(stream, $str_alt82$__RTG_for__S___S_done__A__, new SubLObject[]{ com.cyc.cycjava.cycl.random_thought_generator.rtg_struct_user(rtg), set.set_size(com.cyc.cycjava.cycl.random_thought_generator.rtg_struct_done_assertions(rtg)), NIL != queues.queue_p(com.cyc.cycjava.cycl.random_thought_generator.rtg_struct_queue(rtg)) ? ((SubLObject) (cconcatenate(format_nil.format_nil_s_no_copy(queues.queue_size(com.cyc.cycjava.cycl.random_thought_generator.rtg_struct_queue(rtg))), $str_alt83$_queued))) : $$$exhausted });
        return rtg;
    }

    public static SubLObject pprint_random_thought_generator(final SubLObject rtg, SubLObject stream, SubLObject depth) {
        if (stream == UNPROVIDED) {
            stream = NIL;
        }
        if (depth == UNPROVIDED) {
            depth = NIL;
        }
        format(stream, random_thought_generator.$str89$__RTG_for__S___S_done__A__, new SubLObject[]{ random_thought_generator.rtg_struct_user(rtg), set.set_size(random_thought_generator.rtg_struct_done_assertions(rtg)), NIL != queues.queue_p(random_thought_generator.rtg_struct_queue(rtg)) ? cconcatenate(format_nil.format_nil_s_no_copy(queues.queue_size(random_thought_generator.rtg_struct_queue(rtg))), random_thought_generator.$$$_queued) : random_thought_generator.$$$exhausted });
        return rtg;
    }

    public static final SubLObject find_or_create_random_thought_generator_for_user_alt(SubLObject user) {
        SubLTrampolineFile.checkType(user, FORT_P);
        {
            SubLObject existing = com.cyc.cycjava.cycl.random_thought_generator.find_random_thought_generator_for_user(user);
            return NIL != existing ? ((SubLObject) (existing)) : com.cyc.cycjava.cycl.random_thought_generator.new_random_thought_generator_for_user(user);
        }
    }

    public static SubLObject find_or_create_random_thought_generator_for_user(final SubLObject user) {
        assert NIL != forts.fort_p(user) : "! forts.fort_p(user) " + ("forts.fort_p(user) " + "CommonSymbols.NIL != forts.fort_p(user) ") + user;
        final SubLObject existing = random_thought_generator.find_random_thought_generator_for_user(user);
        return NIL != existing ? existing : random_thought_generator.new_random_thought_generator_for_user(user);
    }

    public static final SubLObject empty_thought_alt() {
        return $list_alt0;
    }

    public static SubLObject empty_thought() {
        return random_thought_generator.$list0;
    }

    public static final SubLObject new_random_thought_generator_for_user_alt(SubLObject user) {
        {
            SubLObject rtg = com.cyc.cycjava.cycl.random_thought_generator.new_random_thought_generator();
            com.cyc.cycjava.cycl.random_thought_generator._csetf_rtg_struct_user(rtg, user);
            com.cyc.cycjava.cycl.random_thought_generator.register_random_thought_generator(rtg, user);
            com.cyc.cycjava.cycl.random_thought_generator.find_or_create_random_thought_generator_thread(rtg, UNPROVIDED);
            return rtg;
        }
    }

    public static SubLObject new_random_thought_generator_for_user(final SubLObject user) {
        final SubLObject rtg = random_thought_generator.new_random_thought_generator();
        random_thought_generator._csetf_rtg_struct_user(rtg, user);
        random_thought_generator.register_random_thought_generator(rtg, user);
        random_thought_generator.find_or_create_random_thought_generator_thread(rtg, UNPROVIDED);
        return rtg;
    }

    public static final SubLObject new_random_thought_generator_alt() {
        {
            SubLObject rtg = com.cyc.cycjava.cycl.random_thought_generator.make_random_thought_generator(list(new SubLObject[]{ $USER, NIL, $DONE_ASSERTIONS, set.new_set(UNPROVIDED, UNPROVIDED), $QUEUE, queues.create_queue(), $MOST_RECENTLY_ADDED_THOUGHT, com.cyc.cycjava.cycl.random_thought_generator.empty_thought(), $TOPICAL_THOUGHTS, dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED) }));
            return rtg;
        }
    }

    public static SubLObject new_random_thought_generator() {
        final SubLObject rtg = random_thought_generator.make_random_thought_generator(list(new SubLObject[]{ $USER, NIL, $DONE_ASSERTIONS, set.new_set(UNPROVIDED, UNPROVIDED), $QUEUE, queues.create_queue(UNPROVIDED), random_thought_generator.$MOST_RECENTLY_ADDED_THOUGHT, random_thought_generator.empty_thought(), $TOPICAL_THOUGHTS, dictionary.new_dictionary(symbol_function(EQL), UNPROVIDED) }));
        return rtg;
    }

    public static final SubLObject note_rtg_exhausted_alt(SubLObject rtg) {
        com.cyc.cycjava.cycl.random_thought_generator.rtg_set_generator_thread(rtg, $EXHAUSTED);
        return rtg;
    }

    public static SubLObject note_rtg_exhausted(final SubLObject rtg) {
        random_thought_generator.rtg_set_generator_thread(rtg, $EXHAUSTED);
        return rtg;
    }

    public static final SubLObject random_thought_generator_exhausted_p_alt(SubLObject rtg) {
        return eq($EXHAUSTED, com.cyc.cycjava.cycl.random_thought_generator.rtg_generator_thread(rtg));
    }

    public static SubLObject random_thought_generator_exhausted_p(final SubLObject rtg) {
        return eq($EXHAUSTED, random_thought_generator.rtg_generator_thread(rtg));
    }

    public static final SubLObject random_thoughts_on_topic_exhausted_p_alt(SubLObject data) {
        return makeBoolean((NIL == data.rest()) || $EXHAUSTED.eql(data.rest()));
    }

    public static SubLObject random_thoughts_on_topic_exhausted_p(final SubLObject data) {
        return makeBoolean((NIL == data.rest()) || $EXHAUSTED.eql(data.rest()));
    }

    public static final SubLObject note_random_thoughts_on_topic_exhausted_alt(SubLObject data) {
        return rplacd(data, $EXHAUSTED);
    }

    public static SubLObject note_random_thoughts_on_topic_exhausted(final SubLObject data) {
        return rplacd(data, $EXHAUSTED);
    }

    public static final SubLObject random_thought_generator_full_p_alt(SubLObject rtg, SubLObject target_size) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject not_fullP = makeBoolean(NIL == com.cyc.cycjava.cycl.random_thought_generator.random_thought_generator_queue_full_p(rtg, target_size));
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(com.cyc.cycjava.cycl.random_thought_generator.rtg_topical_thoughts(rtg)));
                while (!((NIL != not_fullP) || (NIL != dictionary_contents.do_dictionary_contents_doneP(iteration_state)))) {
                    thread.resetMultipleValues();
                    {
                        SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject data = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (!(data.isCons() && ((NIL != com.cyc.cycjava.cycl.random_thought_generator.random_thoughts_on_topic_exhausted_p(data)) || (NIL != data.first())))) {
                            not_fullP = T;
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                return makeBoolean(NIL == not_fullP);
            }
        }
    }

    public static SubLObject random_thought_generator_full_p(final SubLObject rtg, final SubLObject target_size) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject not_fullP;
        SubLObject iteration_state;
        for (not_fullP = makeBoolean(NIL == random_thought_generator.random_thought_generator_queue_full_p(rtg, target_size)), iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(random_thought_generator.rtg_topical_thoughts(rtg))); (NIL == not_fullP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject key = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject data = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if ((!data.isCons()) || ((NIL == random_thought_generator.random_thoughts_on_topic_exhausted_p(data)) && (NIL == data.first()))) {
                not_fullP = T;
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return makeBoolean(NIL == not_fullP);
    }

    public static final SubLObject random_thought_generator_queue_full_p_alt(SubLObject rtg, SubLObject target_size) {
        return numGE(queues.queue_size(com.cyc.cycjava.cycl.random_thought_generator.rtg_queue(rtg)), target_size);
    }

    public static SubLObject random_thought_generator_queue_full_p(final SubLObject rtg, final SubLObject target_size) {
        return numGE(queues.queue_size(random_thought_generator.rtg_queue(rtg)), target_size);
    }

    public static final SubLObject declare_interest_in_random_thoughts_about_topic_alt(SubLObject rtg, SubLObject topic) {
        {
            SubLObject topical_thoughts = com.cyc.cycjava.cycl.random_thought_generator.rtg_topical_thoughts(rtg);
            if (NIL == dictionary.dictionary_lookup(topical_thoughts, topic, NIL)) {
                com.cyc.cycjava.cycl.random_thought_generator.register_interest_in_random_thoughts_about_topic(rtg, topic);
                dictionary.dictionary_enter(topical_thoughts, topic, $NEW_TOPIC);
            }
            return rtg;
        }
    }

    public static SubLObject declare_interest_in_random_thoughts_about_topic(final SubLObject rtg, final SubLObject topic) {
        final SubLObject topical_thoughts = random_thought_generator.rtg_topical_thoughts(rtg);
        if (NIL == dictionary.dictionary_lookup(topical_thoughts, topic, NIL)) {
            random_thought_generator.register_interest_in_random_thoughts_about_topic(rtg, topic);
            dictionary.dictionary_enter(topical_thoughts, topic, $NEW_TOPIC);
        }
        return rtg;
    }

    public static final SubLObject rtg_note_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            SubLObject format_str = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt87);
            format_str = current.first();
            current = current.rest();
            {
                SubLObject args = current;
                return listS(PWHEN, $print_rtg_notesP$, list(APPLY, $list_alt91, list(CONS, T, listS(LIST, format_str, append(args, NIL)))), $list_alt94);
            }
        }
    }

    public static SubLObject rtg_note(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject format_str = NIL;
        destructuring_bind_must_consp(current, datum, random_thought_generator.$list94);
        format_str = current.first();
        final SubLObject args;
        current = args = current.rest();
        return listS(PWHEN, random_thought_generator.$print_rtg_notesP$, list(APPLY, random_thought_generator.$list98, list(CONS, T, listS(LIST, format_str, append(args, NIL)))), random_thought_generator.$list101);
    }

    public static final SubLObject register_interest_in_random_thoughts_about_topic_alt(SubLObject rtg, SubLObject topic) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            SubLTrampolineFile.checkType(topic, FORT_P);
            {
                SubLObject topical_thoughts = com.cyc.cycjava.cycl.random_thought_generator.rtg_topical_thoughts(rtg);
                if (NIL != $print_rtg_notesP$.getDynamicValue(thread)) {
                    apply(FORMAT, cons(T, list($str_alt96$__Registering_interest_of__S_in__, com.cyc.cycjava.cycl.random_thought_generator.rtg_user(rtg), topic)));
                    force_output(T);
                }
                dictionary.dictionary_enter(topical_thoughts, topic, $NEW_TOPIC);
                return rtg;
            }
        }
    }

    public static SubLObject register_interest_in_random_thoughts_about_topic(final SubLObject rtg, final SubLObject topic) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != forts.fort_p(topic) : "! forts.fort_p(topic) " + ("forts.fort_p(topic) " + "CommonSymbols.NIL != forts.fort_p(topic) ") + topic;
        final SubLObject topical_thoughts = random_thought_generator.rtg_topical_thoughts(rtg);
        if (NIL != random_thought_generator.$print_rtg_notesP$.getDynamicValue(thread)) {
            apply(FORMAT, cons(T, list(random_thought_generator.$str103$__Registering_interest_of__S_in__, random_thought_generator.rtg_user(rtg), topic)));
            force_output(T);
        }
        dictionary.dictionary_enter(topical_thoughts, topic, $NEW_TOPIC);
        return rtg;
    }

    public static final SubLObject all_random_thoughts_on_topic_alt(SubLObject topic) {
        SubLTrampolineFile.checkType(topic, FORT_P);
        {
            SubLObject rtg = com.cyc.cycjava.cycl.random_thought_generator.new_random_thought_generator();
            SubLObject thoughts = NIL;
            SubLObject doneP = NIL;
            while (NIL == doneP) {
                {
                    SubLObject thought = com.cyc.cycjava.cycl.random_thought_generator.next_random_thought_with_suggested_topic(rtg, listS($TOPIC, topic, $list_alt97));
                    if (NIL != com.cyc.cycjava.cycl.random_thought_generator.empty_random_thought_p(thought)) {
                        doneP = T;
                    } else {
                        thoughts = cons(thought, thoughts);
                    }
                }
            } 
            kill_process(com.cyc.cycjava.cycl.random_thought_generator.rtg_generator_thread(rtg));
            return thoughts;
        }
    }

    public static SubLObject all_random_thoughts_on_topic(final SubLObject topic) {
        assert NIL != forts.fort_p(topic) : "! forts.fort_p(topic) " + ("forts.fort_p(topic) " + "CommonSymbols.NIL != forts.fort_p(topic) ") + topic;
        final SubLObject rtg = random_thought_generator.new_random_thought_generator();
        SubLObject thoughts = NIL;
        SubLObject doneP = NIL;
        while (NIL == doneP) {
            final SubLObject thought = random_thought_generator.next_random_thought_with_suggested_topic(rtg, listS($TOPIC, topic, random_thought_generator.$list104));
            if (NIL != random_thought_generator.empty_random_thought_p(thought)) {
                doneP = T;
            } else {
                thoughts = cons(thought, thoughts);
            }
        } 
        kill_process(random_thought_generator.rtg_generator_thread(rtg));
        return thoughts;
    }

    public static final SubLObject next_random_thought_with_suggested_topic_alt(SubLObject rtg, SubLObject parameters) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject datum = parameters;
                SubLObject current = datum;
                SubLObject topic_tail = property_list_member($TOPIC, current);
                SubLObject topic = (NIL != topic_tail) ? ((SubLObject) (cadr(topic_tail))) : NIL;
                SubLObject now_tail = property_list_member($NOW, current);
                SubLObject now = (NIL != now_tail) ? ((SubLObject) (cadr(now_tail))) : T;
                SubLObject require_topicalP_tail = property_list_member($kw99$REQUIRE_TOPICAL_, current);
                SubLObject require_topicalP = (NIL != require_topicalP_tail) ? ((SubLObject) (cadr(require_topicalP_tail))) : NIL;
                com.cyc.cycjava.cycl.random_thought_generator.register_interest_in_random_thoughts_about_topic(rtg, topic);
                {
                    SubLObject topical_thoughts = com.cyc.cycjava.cycl.random_thought_generator.rtg_topical_thoughts(rtg);
                    SubLObject existing_info = dictionary.dictionary_lookup(topical_thoughts, topic, NIL);
                    SubLObject thought = NIL;
                    if (!(existing_info.isCons() || (NIL != now))) {
                        {
                            SubLObject generator_thread = com.cyc.cycjava.cycl.random_thought_generator.find_or_create_random_thought_generator_thread(rtg, T);
                            SubLObject stopP = NIL;
                            if (NIL != $print_rtg_notesP$.getDynamicValue(thread)) {
                                apply(FORMAT, cons(T, list($str_alt100$__Waiting_for_new_thoughts_about_, topic)));
                                force_output(T);
                            }
                            while (NIL == stopP) {
                                existing_info = dictionary.dictionary_lookup(topical_thoughts, topic, NIL);
                                sleep($float$0_5);
                                stopP = makeBoolean(existing_info.isCons() || (NIL == valid_process_p(generator_thread)));
                            } 
                        }
                    }
                    if (existing_info.isCons()) {
                        thought = existing_info.first();
                        {
                            SubLObject freshly_exhaustedP = sublisp_null(existing_info.rest());
                            SubLObject known_exhaustedP = makeBoolean((NIL != freshly_exhaustedP) || (NIL != com.cyc.cycjava.cycl.random_thought_generator.random_thoughts_on_topic_exhausted_p(existing_info)));
                            if (NIL != freshly_exhaustedP) {
                                com.cyc.cycjava.cycl.random_thought_generator.note_random_thoughts_on_topic_exhausted(existing_info);
                            }
                            if (NIL == thought) {
                                if ((NIL != freshly_exhaustedP) || (NIL == known_exhaustedP)) {
                                    if (NIL != $print_rtg_notesP$.getDynamicValue(thread)) {
                                        apply(FORMAT, cons(T, list($str_alt102$___A_out_of_thoughts_about__S__, NIL != known_exhaustedP ? ((SubLObject) ($$$Totally)) : $$$Temporarily, topic)));
                                        force_output(T);
                                    }
                                }
                                if (!((NIL != now) || (NIL != known_exhaustedP))) {
                                    {
                                        SubLObject generator_thread = com.cyc.cycjava.cycl.random_thought_generator.find_or_create_random_thought_generator_thread(rtg, UNPROVIDED);
                                        SubLObject stopP = NIL;
                                        if (NIL != $print_rtg_notesP$.getDynamicValue(thread)) {
                                            apply(FORMAT, cons(T, list($str_alt100$__Waiting_for_new_thoughts_about_, topic)));
                                            force_output(T);
                                        }
                                        while (NIL == stopP) {
                                            sleep($float$0_5);
                                            thought = existing_info.first();
                                            stopP = makeBoolean(((NIL != thought) || (NIL == existing_info.rest())) || (NIL == valid_process_p(generator_thread)));
                                        } 
                                    }
                                }
                            }
                        }
                        rplaca(existing_info, NIL);
                    } else {
                        if (NIL == dictionary.dictionary_lookup(topical_thoughts, topic, NIL)) {
                            com.cyc.cycjava.cycl.random_thought_generator.register_interest_in_random_thoughts_about_topic(rtg, topic);
                        }
                    }
                    return NIL != thought ? ((SubLObject) (thought)) : NIL != require_topicalP ? ((SubLObject) (com.cyc.cycjava.cycl.random_thought_generator.empty_thought())) : com.cyc.cycjava.cycl.random_thought_generator.next_random_thought_without_suggested_topic(rtg, parameters);
                }
            }
        }
    }

    public static SubLObject next_random_thought_with_suggested_topic(final SubLObject rtg, final SubLObject parameters) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject topic_tail = property_list_member($TOPIC, parameters);
        final SubLObject topic = (NIL != topic_tail) ? cadr(topic_tail) : NIL;
        final SubLObject now_tail = property_list_member($NOW, parameters);
        final SubLObject now = (NIL != now_tail) ? cadr(now_tail) : T;
        final SubLObject require_topicalP_tail = property_list_member(random_thought_generator.$kw106$REQUIRE_TOPICAL_, parameters);
        final SubLObject require_topicalP = (NIL != require_topicalP_tail) ? cadr(require_topicalP_tail) : NIL;
        random_thought_generator.register_interest_in_random_thoughts_about_topic(rtg, topic);
        final SubLObject topical_thoughts = random_thought_generator.rtg_topical_thoughts(rtg);
        SubLObject existing_info = dictionary.dictionary_lookup(topical_thoughts, topic, NIL);
        SubLObject thought = NIL;
        if ((!existing_info.isCons()) && (NIL == now)) {
            final SubLObject generator_thread = random_thought_generator.find_or_create_random_thought_generator_thread(rtg, T);
            SubLObject stopP = NIL;
            if (NIL != random_thought_generator.$print_rtg_notesP$.getDynamicValue(thread)) {
                apply(FORMAT, cons(T, list(random_thought_generator.$str107$__Waiting_for_new_thoughts_about_, topic)));
                force_output(T);
            }
            while (NIL == stopP) {
                existing_info = dictionary.dictionary_lookup(topical_thoughts, topic, NIL);
                sleep(random_thought_generator.$float$0_5);
                stopP = makeBoolean(existing_info.isCons() || (NIL == valid_process_p(generator_thread)));
            } 
        }
        if (existing_info.isCons()) {
            thought = existing_info.first();
            final SubLObject freshly_exhaustedP = sublisp_null(existing_info.rest());
            final SubLObject known_exhaustedP = makeBoolean((NIL != freshly_exhaustedP) || (NIL != random_thought_generator.random_thoughts_on_topic_exhausted_p(existing_info)));
            if (NIL != freshly_exhaustedP) {
                random_thought_generator.note_random_thoughts_on_topic_exhausted(existing_info);
            }
            if (NIL == thought) {
                if (((NIL != freshly_exhaustedP) || (NIL == known_exhaustedP)) && (NIL != random_thought_generator.$print_rtg_notesP$.getDynamicValue(thread))) {
                    apply(FORMAT, cons(T, list(random_thought_generator.$str109$___A_out_of_thoughts_about__S__, NIL != known_exhaustedP ? random_thought_generator.$$$Totally : random_thought_generator.$$$Temporarily, topic)));
                    force_output(T);
                }
                if ((NIL == now) && (NIL == known_exhaustedP)) {
                    final SubLObject generator_thread2 = random_thought_generator.find_or_create_random_thought_generator_thread(rtg, UNPROVIDED);
                    SubLObject stopP2 = NIL;
                    if (NIL != random_thought_generator.$print_rtg_notesP$.getDynamicValue(thread)) {
                        apply(FORMAT, cons(T, list(random_thought_generator.$str107$__Waiting_for_new_thoughts_about_, topic)));
                        force_output(T);
                    }
                    while (NIL == stopP2) {
                        sleep(random_thought_generator.$float$0_5);
                        thought = existing_info.first();
                        stopP2 = makeBoolean(((NIL != thought) || (NIL == existing_info.rest())) || (NIL == valid_process_p(generator_thread2)));
                    } 
                }
            }
            rplaca(existing_info, NIL);
        } else
            if (NIL == dictionary.dictionary_lookup(topical_thoughts, topic, NIL)) {
                random_thought_generator.register_interest_in_random_thoughts_about_topic(rtg, topic);
            }

        return NIL != thought ? thought : NIL != require_topicalP ? random_thought_generator.empty_thought() : random_thought_generator.next_random_thought_without_suggested_topic(rtg, parameters);
    }

    public static final SubLObject next_random_thought_without_suggested_topic_alt(SubLObject rtg, SubLObject parameters) {
        {
            SubLObject queue = com.cyc.cycjava.cycl.random_thought_generator.rtg_queue(rtg);
            SubLObject thought = com.cyc.cycjava.cycl.random_thought_generator.empty_thought();
            if ((NIL != queues.queue_empty_p(queue)) && (NIL != com.cyc.cycjava.cycl.random_thought_generator.random_thought_generator_exhausted_p(rtg))) {
                set.clear_set(com.cyc.cycjava.cycl.random_thought_generator.rtg_done_assertions(rtg));
                rtg = com.cyc.cycjava.cycl.random_thought_generator.new_random_thought_generator_for_user(com.cyc.cycjava.cycl.random_thought_generator.rtg_user(rtg));
            }
            {
                SubLObject generator_thread = com.cyc.cycjava.cycl.random_thought_generator.find_or_create_random_thought_generator_thread(rtg, UNPROVIDED);
                SubLObject dont_waitP = getf(parameters, $NOW, T);
                SubLObject stopP = NIL;
                while (NIL == stopP) {
                    thought = queues.dequeue(queue);
                    stopP = makeBoolean(((NIL != dont_waitP) || (NIL != thought.first())) || (NIL == valid_process_p(generator_thread)));
                } 
            }
            return thought;
        }
    }

    public static SubLObject next_random_thought_without_suggested_topic(SubLObject rtg, final SubLObject parameters) {
        final SubLObject queue = random_thought_generator.rtg_queue(rtg);
        SubLObject thought = random_thought_generator.empty_thought();
        if ((NIL != queues.queue_empty_p(queue)) && (NIL != random_thought_generator.random_thought_generator_exhausted_p(rtg))) {
            set.clear_set(random_thought_generator.rtg_done_assertions(rtg));
            rtg = random_thought_generator.new_random_thought_generator_for_user(random_thought_generator.rtg_user(rtg));
        }
        for (SubLObject generator_thread = random_thought_generator.find_or_create_random_thought_generator_thread(rtg, UNPROVIDED), dont_waitP = getf(parameters, $NOW, T), stopP = NIL; NIL == stopP; stopP = makeBoolean(((NIL != dont_waitP) || (NIL != thought.first())) || (NIL == valid_process_p(generator_thread)))) {
            thought = queues.dequeue(queue);
        }
        return thought;
    }

    public static final SubLObject find_or_create_random_thought_generator_thread_alt(SubLObject rtg, SubLObject topical_onlyP) {
        if (topical_onlyP == UNPROVIDED) {
            topical_onlyP = NIL;
        }
        {
            SubLObject generator_thread = com.cyc.cycjava.cycl.random_thought_generator.rtg_generator_thread(rtg);
            if (NIL == valid_process_p(generator_thread)) {
                generator_thread = process_utilities.make_cyc_server_process_with_args($$$Random_Thought_Generator, KEEP_RANDOM_THOUGHT_GENERATOR_FULL, list(rtg, NIL != topical_onlyP ? ((SubLObject) (ZERO_INTEGER)) : $int$25));
                {
                    SubLObject doneP = NIL;
                    SubLObject interval_ms = ONE_INTEGER;
                    SubLObject increase_factor = $float$1_5;
                    SubLObject max_ms = NIL;
                    while (NIL == doneP) {
                        doneP = valid_process_p(generator_thread);
                        if (NIL == doneP) {
                            sleep(divide(interval_ms, $int$1000));
                            if (!interval_ms.numGE(max_ms)) {
                                {
                                    SubLObject new_interval = multiply(interval_ms, increase_factor);
                                    interval_ms = min(new_interval, max_ms);
                                }
                            }
                        }
                    } 
                }
                com.cyc.cycjava.cycl.random_thought_generator.rtg_set_generator_thread(rtg, generator_thread);
            }
            return generator_thread;
        }
    }

    public static SubLObject find_or_create_random_thought_generator_thread(final SubLObject rtg, SubLObject topical_onlyP) {
        if (topical_onlyP == UNPROVIDED) {
            topical_onlyP = NIL;
        }
        SubLObject generator_thread = random_thought_generator.rtg_generator_thread(rtg);
        if (NIL == valid_process_p(generator_thread)) {
            generator_thread = process_utilities.make_cyc_server_process_with_args(random_thought_generator.$$$Random_Thought_Generator, random_thought_generator.KEEP_RANDOM_THOUGHT_GENERATOR_FULL, list(rtg, NIL != topical_onlyP ? ZERO_INTEGER : random_thought_generator.$int$25));
            SubLObject doneP = NIL;
            SubLObject interval_ms = ONE_INTEGER;
            final SubLObject increase_factor = random_thought_generator.$float$1_5;
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
            random_thought_generator.rtg_set_generator_thread(rtg, generator_thread);
        }
        return generator_thread;
    }

    public static final SubLObject keep_random_thought_generator_full_alt(SubLObject rtg, SubLObject target_size, SubLObject check_interval) {
        if (target_size == UNPROVIDED) {
            target_size = $int$25;
        }
        if (check_interval == UNPROVIDED) {
            check_interval = TEN_INTEGER;
        }
        while (NIL == com.cyc.cycjava.cycl.random_thought_generator.random_thought_generator_exhausted_p(rtg)) {
            if (NIL != com.cyc.cycjava.cycl.random_thought_generator.random_thought_generator_full_p(rtg, target_size)) {
                sleep(check_interval);
            } else {
                com.cyc.cycjava.cycl.random_thought_generator.fill_random_thought_generator(rtg, target_size);
            }
        } 
        return rtg;
    }

    public static SubLObject keep_random_thought_generator_full(final SubLObject rtg, SubLObject target_size, SubLObject check_interval) {
        if (target_size == UNPROVIDED) {
            target_size = random_thought_generator.$int$25;
        }
        if (check_interval == UNPROVIDED) {
            check_interval = TEN_INTEGER;
        }
        while (NIL == random_thought_generator.random_thought_generator_exhausted_p(rtg)) {
            if (NIL != random_thought_generator.random_thought_generator_full_p(rtg, target_size)) {
                sleep(check_interval);
            } else {
                random_thought_generator.fill_random_thought_generator(rtg, target_size);
            }
        } 
        return rtg;
    }

    public static final SubLObject fill_random_thought_generator_alt(SubLObject rtg, SubLObject target_size) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL != $print_rtg_notesP$.getDynamicValue(thread)) {
                apply(FORMAT, cons(T, list($str_alt110$__Filling__S__, rtg)));
                force_output(T);
            }
            {
                SubLObject new_entries = NIL;
                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(com.cyc.cycjava.cycl.random_thought_generator.rtg_topical_thoughts(rtg)));
                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                    thread.resetMultipleValues();
                    {
                        SubLObject topic = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        SubLObject data = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if ($NEW_TOPIC.eql(data)) {
                            new_entries = list_utilities.alist_enter(new_entries, topic, com.cyc.cycjava.cycl.random_thought_generator.update_random_thought_data(com.cyc.cycjava.cycl.random_thought_generator.new_random_thought_data_for_topic(topic), topic, rtg), UNPROVIDED);
                        } else {
                            if ((NIL == data.first()) && (NIL == com.cyc.cycjava.cycl.random_thought_generator.random_thoughts_on_topic_exhausted_p(data))) {
                                new_entries = list_utilities.alist_enter(new_entries, topic, com.cyc.cycjava.cycl.random_thought_generator.update_random_thought_data(data, topic, rtg), UNPROVIDED);
                            }
                        }
                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                    }
                } 
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                {
                    SubLObject cdolist_list_var = new_entries;
                    SubLObject cons = NIL;
                    for (cons = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cons = cdolist_list_var.first()) {
                        {
                            SubLObject datum = cons;
                            SubLObject current = datum;
                            SubLObject topic = NIL;
                            SubLObject new_data = NIL;
                            destructuring_bind_must_consp(current, datum, $list_alt111);
                            topic = current.first();
                            current = current.rest();
                            new_data = current;
                            dictionary.dictionary_enter(com.cyc.cycjava.cycl.random_thought_generator.rtg_topical_thoughts(rtg), topic, new_data);
                        }
                    }
                }
                if (NIL != list_utilities.empty_list_p(new_entries)) {
                    com.cyc.cycjava.cycl.random_thought_generator.fill_random_thought_generator_queue(rtg, target_size);
                }
            }
            if (NIL != $print_rtg_notesP$.getDynamicValue(thread)) {
                apply(FORMAT, cons(T, list($str_alt112$___S_is_now_full__, rtg)));
                force_output(T);
            }
            return rtg;
        }
    }

    public static SubLObject fill_random_thought_generator(final SubLObject rtg, final SubLObject target_size) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != random_thought_generator.$print_rtg_notesP$.getDynamicValue(thread)) {
            apply(FORMAT, cons(T, list(random_thought_generator.$str117$__Filling__S__, rtg)));
            force_output(T);
        }
        SubLObject new_entries = NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(random_thought_generator.rtg_topical_thoughts(rtg))); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject topic = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject data = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if ($NEW_TOPIC.eql(data)) {
                new_entries = list_utilities.alist_enter(new_entries, topic, random_thought_generator.update_random_thought_data(random_thought_generator.new_random_thought_data_for_topic(topic), topic, rtg), UNPROVIDED);
            } else
                if ((NIL == data.first()) && (NIL == random_thought_generator.random_thoughts_on_topic_exhausted_p(data))) {
                    new_entries = list_utilities.alist_enter(new_entries, topic, random_thought_generator.update_random_thought_data(data, topic, rtg), UNPROVIDED);
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
            destructuring_bind_must_consp(current, datum, random_thought_generator.$list118);
            topic2 = current.first();
            current = new_data = current.rest();
            dictionary.dictionary_enter(random_thought_generator.rtg_topical_thoughts(rtg), topic2, new_data);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        if (NIL != list_utilities.empty_list_p(new_entries)) {
            random_thought_generator.fill_random_thought_generator_queue(rtg, target_size);
        }
        if (NIL != random_thought_generator.$print_rtg_notesP$.getDynamicValue(thread)) {
            apply(FORMAT, cons(T, list(random_thought_generator.$str119$___S_is_now_full__, rtg)));
            force_output(T);
        }
        return rtg;
    }

    public static final SubLObject update_random_thought_data_alt(SubLObject data, SubLObject topic, SubLObject rtg) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
                if (!(data.isCons() && (NIL == data.first()))) {
                    Errors.error($str_alt113$_S_is_not_in_an_updatable_state, data);
                }
            }
            while (!((NIL != data.first()) || (NIL == data.rest()))) {
                thread.resetMultipleValues();
                {
                    SubLObject remaining = list_utilities.random_delete(data.rest());
                    SubLObject candidate = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    rplacd(data, remaining);
                    {
                        SubLObject really_newP = set.set_add(candidate, com.cyc.cycjava.cycl.random_thought_generator.rtg_done_assertions(rtg));
                        if ((((NIL != really_newP) && (NIL != com.cyc.cycjava.cycl.random_thought_generator.open_cyc_formula(candidate))) && (NIL != thcl.thcl_formulaP(candidate, UNPROVIDED))) && (NIL == com.cyc.cycjava.cycl.random_thought_generator.potentially_porn_relatedP(candidate))) {
                            {
                                SubLObject paraphrase = com.cyc.cycjava.cycl.random_thought_generator.thcl_paraphrase_for_assertion(candidate);
                                if (NIL != paraphrase) {
                                    if (NIL != $print_rtg_notesP$.getDynamicValue(thread)) {
                                        apply(FORMAT, cons(T, list($str_alt114$__New_thought_concerning__S_____S, topic, pph_utilities.pph_javalist_string(paraphrase))));
                                        force_output(T);
                                    }
                                    rplaca(data, list(topic, candidate, paraphrase));
                                }
                            }
                        }
                    }
                }
            } 
            return data;
        }
    }

    public static SubLObject update_random_thought_data(final SubLObject data, final SubLObject topic, final SubLObject rtg) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && ((!data.isCons()) || (NIL != data.first()))) {
            Errors.error(random_thought_generator.$str120$_S_is_not_in_an_updatable_state, data);
        }
        while ((NIL == data.first()) && (NIL != data.rest())) {
            thread.resetMultipleValues();
            final SubLObject remaining = list_utilities.random_delete(data.rest());
            final SubLObject candidate = thread.secondMultipleValue();
            thread.resetMultipleValues();
            rplacd(data, remaining);
            final SubLObject really_newP = set.set_add(candidate, random_thought_generator.rtg_done_assertions(rtg));
            if ((((NIL != really_newP) && (NIL != random_thought_generator.open_cyc_formula(candidate))) && (NIL != thcl.thcl_formulaP(candidate, UNPROVIDED))) && (NIL == random_thought_generator.potentially_porn_relatedP(candidate))) {
                final SubLObject paraphrase = random_thought_generator.thcl_paraphrase_for_assertion(candidate);
                if (NIL == paraphrase) {
                    continue;
                }
                if (NIL != random_thought_generator.$print_rtg_notesP$.getDynamicValue(thread)) {
                    apply(FORMAT, cons(T, list(random_thought_generator.$str121$__New_thought_concerning__S_____S, topic, pph_utilities.pph_javalist_string(paraphrase))));
                    force_output(T);
                }
                rplaca(data, list(topic, candidate, paraphrase));
            }
        } 
        return data;
    }

    public static final SubLObject open_cyc_formula_alt(SubLObject formula) {
        return makeBoolean(NIL == list_utilities.find_if_not(OPEN_CYC_FORT, cycl_utilities.expression_gather(formula, FORT_P, T, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject open_cyc_formula(final SubLObject formula) {
        return makeBoolean(NIL == list_utilities.find_if_not(random_thought_generator.OPEN_CYC_FORT, cycl_utilities.expression_gather(formula, FORT_P, T, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject open_cyc_fort_internal_alt(SubLObject fort) {
        {
            SubLObject ans = NIL;
            SubLObject ignore_errors_tag = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, symbol_function(IGNORE_ERRORS_HANDLER));
                        try {
                            ans = owl_cycl_to_xml.fort_has_exported_owl_opencyc_contentP(fort);
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
            }
            return ans;
        }
    }

    public static SubLObject open_cyc_fort_internal(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        SubLObject ignore_errors_tag = NIL;
        try {
            thread.throwStack.push(random_thought_generator.$IGNORE_ERRORS_TARGET);
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(symbol_function(random_thought_generator.IGNORE_ERRORS_HANDLER), thread);
                try {
                    ans = fort_has_exported_owl_opencyc_contentP(fort);
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, random_thought_generator.$IGNORE_ERRORS_TARGET);
        } finally {
            thread.throwStack.pop();
        }
        return ans;
    }

    public static final SubLObject open_cyc_fort_alt(SubLObject fort) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.random_thought_generator.open_cyc_fort_internal(fort);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, OPEN_CYC_FORT, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), OPEN_CYC_FORT, ONE_INTEGER, NIL, EQL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, OPEN_CYC_FORT, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, fort, $kw116$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw116$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.random_thought_generator.open_cyc_fort_internal(fort)));
                        memoization_state.caching_state_put(caching_state, fort, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject open_cyc_fort(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return random_thought_generator.open_cyc_fort_internal(fort);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, random_thought_generator.OPEN_CYC_FORT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), random_thought_generator.OPEN_CYC_FORT, ONE_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, random_thought_generator.OPEN_CYC_FORT, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, fort, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(random_thought_generator.open_cyc_fort_internal(fort)));
            memoization_state.caching_state_put(caching_state, fort, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject potentially_porn_relatedP_internal_alt(SubLObject obj) {
        if (NIL != forts.fort_p(obj)) {
            return isa.quoted_isa_in_any_mtP(obj, $$PotentiallyPornRelated);
        } else {
            if (NIL != el_formula_p(obj)) {
                {
                    SubLObject result = NIL;
                    SubLObject args = cycl_utilities.formula_args(obj, $IGNORE);
                    SubLObject rest = NIL;
                    for (rest = args; !((NIL != result) || (NIL == rest)); rest = rest.rest()) {
                        {
                            SubLObject arg = rest.first();
                            if (NIL != com.cyc.cycjava.cycl.random_thought_generator.potentially_porn_relatedP(arg)) {
                                result = T;
                            }
                        }
                    }
                    return result;
                }
            }
        }
        return NIL;
    }

    public static SubLObject potentially_porn_relatedP_internal(final SubLObject obj) {
        if (NIL != forts.fort_p(obj)) {
            return isa.quoted_isa_in_any_mtP(obj, random_thought_generator.$$PotentiallyPornRelated);
        }
        if (NIL != el_formula_p(obj)) {
            SubLObject result = NIL;
            final SubLObject args = cycl_utilities.formula_args(obj, $IGNORE);
            SubLObject rest;
            SubLObject arg;
            for (rest = NIL, rest = args; (NIL == result) && (NIL != rest); rest = rest.rest()) {
                arg = rest.first();
                if (NIL != random_thought_generator.potentially_porn_relatedP(arg)) {
                    result = T;
                }
            }
            return result;
        }
        return NIL;
    }

    public static final SubLObject potentially_porn_relatedP_alt(SubLObject obj) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.random_thought_generator.potentially_porn_relatedP_internal(obj);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym117$POTENTIALLY_PORN_RELATED_, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym117$POTENTIALLY_PORN_RELATED_, ONE_INTEGER, NIL, EQL, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, $sym117$POTENTIALLY_PORN_RELATED_, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, obj, $kw116$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw116$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.random_thought_generator.potentially_porn_relatedP_internal(obj)));
                        memoization_state.caching_state_put(caching_state, obj, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject potentially_porn_relatedP(final SubLObject obj) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return random_thought_generator.potentially_porn_relatedP_internal(obj);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, random_thought_generator.$sym123$POTENTIALLY_PORN_RELATED_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), random_thought_generator.$sym123$POTENTIALLY_PORN_RELATED_, ONE_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, random_thought_generator.$sym123$POTENTIALLY_PORN_RELATED_, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, obj, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(random_thought_generator.potentially_porn_relatedP_internal(obj)));
            memoization_state.caching_state_put(caching_state, obj, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static final SubLObject new_random_thought_data_for_topic_alt(SubLObject topic) {
        return cons(NIL, com.cyc.cycjava.cycl.random_thought_generator.gafs_about_topic(topic));
    }

    public static SubLObject new_random_thought_data_for_topic(final SubLObject topic) {
        return cons(NIL, random_thought_generator.gafs_about_topic(topic));
    }

    public static final SubLObject gafs_about_topic_alt(SubLObject topic) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject gafs = NIL;
                SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(thcl.random_thcl_assertion_mt());
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        {
                            SubLObject preds_to_skip = set.new_set(symbol_function(EQL), UNPROVIDED);
                            SubLObject pred_var = NIL;
                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(topic, NIL, pred_var)) {
                                {
                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(topic, NIL, pred_var);
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
                                                            SubLObject done_var_13 = NIL;
                                                            SubLObject token_var_14 = NIL;
                                                            while (NIL == done_var_13) {
                                                                {
                                                                    SubLObject gaf = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_14);
                                                                    SubLObject valid_15 = makeBoolean(token_var_14 != gaf);
                                                                    if (NIL != valid_15) {
                                                                        {
                                                                            SubLObject pred = assertions_high.gaf_arg0(gaf);
                                                                            if (NIL != set.set_memberP(pred, preds_to_skip)) {
                                                                            } else {
                                                                                if (NIL == com.cyc.cycjava.cycl.random_thought_generator.gaf_about_topicP(gaf, topic, pred)) {
                                                                                    set.set_add(pred, preds_to_skip);
                                                                                } else {
                                                                                    gafs = cons(gaf, gafs);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    done_var_13 = makeBoolean(NIL == valid_15);
                                                                }
                                                            } 
                                                        }
                                                    } finally {
                                                        {
                                                            SubLObject _prev_bind_0_16 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_16, thread);
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
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                if (NIL != $print_rtg_notesP$.getDynamicValue(thread)) {
                    apply(FORMAT, cons(T, list($str_alt122$__Found__S_GAF_assertions_about__, length(gafs), topic)));
                    force_output(T);
                }
                return gafs;
            }
        }
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
                                        if (NIL == random_thought_generator.gaf_about_topicP(gaf, topic, pred)) {
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
        if (NIL != random_thought_generator.$print_rtg_notesP$.getDynamicValue(thread)) {
            apply(FORMAT, cons(T, list(random_thought_generator.$str128$__Found__S_GAF_assertions_about__, length(gafs), topic)));
            force_output(T);
        }
        return gafs;
    }

    public static final SubLObject gaf_about_topicP_alt(SubLObject gaf, SubLObject topic, SubLObject pred) {
        if (pred == UNPROVIDED) {
            pred = assertions_high.gaf_arg0(gaf);
        }
        {
            SubLObject min_count = NIL;
            SubLObject min_topic_count = NIL;
            SubLObject argnum = ZERO_INTEGER;
            SubLObject args = cycl_utilities.formula_args(gaf, $IGNORE);
            SubLObject cdolist_list_var = args;
            SubLObject arg = NIL;
            for (arg = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , arg = cdolist_list_var.first()) {
                argnum = add(argnum, ONE_INTEGER);
                {
                    SubLObject count = kb_indexing.num_gaf_arg_index(arg, argnum, pred, UNPROVIDED);
                    if (arg.eql(topic) && ((NIL == min_topic_count) || count.numL(min_topic_count))) {
                        min_topic_count = count;
                    } else {
                        if ((NIL == min_count) || count.numL(min_count)) {
                            min_count = count;
                        }
                    }
                }
            }
            return makeBoolean((NIL != min_topic_count) && ((NIL == min_count) || min_topic_count.numLE(min_count)));
        }
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

    public static final SubLObject fill_random_thought_generator_queue_alt(SubLObject rtg, SubLObject target_size) {
        while (!((NIL != com.cyc.cycjava.cycl.random_thought_generator.random_thought_generator_exhausted_p(rtg)) || (NIL != com.cyc.cycjava.cycl.random_thought_generator.random_thought_generator_queue_full_p(rtg, target_size)))) {
            com.cyc.cycjava.cycl.random_thought_generator.add_random_thought_to_rtg(rtg);
        } 
        return rtg;
    }

    public static SubLObject fill_random_thought_generator_queue(final SubLObject rtg, final SubLObject target_size) {
        while ((NIL == random_thought_generator.random_thought_generator_exhausted_p(rtg)) && (NIL == random_thought_generator.random_thought_generator_queue_full_p(rtg, target_size))) {
            random_thought_generator.add_random_thought_to_rtg(rtg);
        } 
        return rtg;
    }

    public static final SubLObject add_random_thought_to_rtg_alt(SubLObject rtg) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject user = com.cyc.cycjava.cycl.random_thought_generator.rtg_user(rtg);
                SubLObject most_recently_added_thought = com.cyc.cycjava.cycl.random_thought_generator.rtg_most_recently_added_thought(rtg);
                SubLObject next_thought = NIL;
                SubLObject next_term = com.cyc.cycjava.cycl.random_thought_generator.next_thcl_topic(most_recently_added_thought);
                SubLObject next_assertion = NIL;
                SubLObject next_assertion_paraphrase = NIL;
                if (NIL == next_term) {
                    thread.resetMultipleValues();
                    {
                        SubLObject next_term_17 = thcl.random_thcl_constant_and_assertion(user);
                        SubLObject next_assertion_18 = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        next_term = next_term_17;
                        next_assertion = next_assertion_18;
                    }
                } else {
                    if (NIL == next_assertion) {
                        next_assertion = thcl.random_thcl_assertion(next_term, user);
                        if (NIL == next_assertion) {
                            thread.resetMultipleValues();
                            {
                                SubLObject next_term_19 = thcl.random_thcl_constant_and_assertion(user);
                                SubLObject next_assertion_20 = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                next_term = next_term_19;
                                next_assertion = next_assertion_20;
                            }
                        }
                    }
                }
                {
                    SubLObject triedP = NIL;
                    while (NIL == next_assertion_paraphrase) {
                        if (NIL != triedP) {
                            next_assertion = thcl.random_thcl_assertion(next_term, user);
                            if (NIL == next_assertion) {
                                thread.resetMultipleValues();
                                {
                                    SubLObject next_term_21 = thcl.random_thcl_constant_and_assertion(user);
                                    SubLObject next_assertion_22 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    next_term = next_term_21;
                                    next_assertion = next_assertion_22;
                                }
                            }
                        }
                        if (NIL != next_assertion) {
                            next_assertion_paraphrase = com.cyc.cycjava.cycl.random_thought_generator.thcl_paraphrase_for_assertion(next_assertion);
                            triedP = T;
                            set.set_add(next_assertion, com.cyc.cycjava.cycl.random_thought_generator.rtg_done_assertions(rtg));
                        }
                    } 
                }
                if ((NIL == next_assertion) || (NIL == next_assertion_paraphrase)) {
                    com.cyc.cycjava.cycl.random_thought_generator.note_rtg_exhausted(rtg);
                } else {
                    next_thought = list(next_term, next_assertion, next_assertion_paraphrase);
                }
                if (NIL != next_thought) {
                    queues.enqueue(next_thought, com.cyc.cycjava.cycl.random_thought_generator.rtg_queue(rtg));
                    com.cyc.cycjava.cycl.random_thought_generator.rtg_set_most_recently_added_thought(rtg, next_thought);
                }
                return next_thought;
            }
        }
    }

    public static SubLObject add_random_thought_to_rtg(final SubLObject rtg) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject user = random_thought_generator.rtg_user(rtg);
        final SubLObject most_recently_added_thought = random_thought_generator.rtg_most_recently_added_thought(rtg);
        SubLObject next_thought = NIL;
        SubLObject next_term = random_thought_generator.next_thcl_topic(most_recently_added_thought);
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
                next_assertion_paraphrase = random_thought_generator.thcl_paraphrase_for_assertion(next_assertion);
                triedP = T;
                set.set_add(next_assertion, random_thought_generator.rtg_done_assertions(rtg));
            }
        } 
        if ((NIL == next_assertion) || (NIL == next_assertion_paraphrase)) {
            random_thought_generator.note_rtg_exhausted(rtg);
        } else {
            next_thought = list(next_term, next_assertion, next_assertion_paraphrase);
        }
        if (NIL != next_thought) {
            queues.enqueue(next_thought, random_thought_generator.rtg_queue(rtg));
            random_thought_generator.rtg_set_most_recently_added_thought(rtg, next_thought);
        }
        return next_thought;
    }

    public static final SubLObject thcl_paraphrase_for_assertion_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject paraphrase = NIL;
                SubLObject error_message = NIL;
                if (!((NIL != pph_error.$suspend_pph_type_checkingP$.getDynamicValue(thread)) || (NIL != pph_macros.valid_pph_demerit_cutoff_p(ONE_INTEGER)))) {
                    {
                        SubLObject new_format_string = cconcatenate($str_alt123$_PPH_error_level_, new SubLObject[]{ format_nil.format_nil_s_no_copy(ONE_INTEGER), $str_alt124$__, format_nil.format_nil_a_no_copy(cconcatenate(format_nil.format_nil_s_no_copy(ONE_INTEGER), new SubLObject[]{ $str_alt125$_is_not_a_, format_nil.format_nil_s_no_copy(VALID_PPH_DEMERIT_CUTOFF_P) })) });
                        pph_error.pph_handle_error(new_format_string, list(EMPTY_SUBL_OBJECT_ARRAY));
                    }
                }
                {
                    SubLObject _prev_bind_0 = pph_vars.$pph_demerit_cutoff$.currentBinding(thread);
                    SubLObject _prev_bind_1 = Errors.$continue_cerrorP$.currentBinding(thread);
                    SubLObject _prev_bind_2 = pph_error.$pph_error_handling_onP$.currentBinding(thread);
                    try {
                        pph_vars.$pph_demerit_cutoff$.bind(ONE_INTEGER, thread);
                        Errors.$continue_cerrorP$.bind(NIL, thread);
                        pph_error.$pph_error_handling_onP$.bind(T, thread);
                        if (NIL != pph_error.pph_break_on_errorP()) {
                            paraphrase = pph_main.generate_phrase_for_java(assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        } else {
                            try {
                                {
                                    SubLObject _prev_bind_0_23 = Errors.$error_handler$.currentBinding(thread);
                                    try {
                                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                        try {
                                            paraphrase = pph_main.generate_phrase_for_java(assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } catch (Throwable catch_var) {
                                            Errors.handleThrowable(catch_var, NIL);
                                        }
                                    } finally {
                                        Errors.$error_handler$.rebind(_prev_bind_0_23, thread);
                                    }
                                }
                            } catch (Throwable ccatch_env_var) {
                                error_message = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                            }
                            if (error_message.isString()) {
                                Errors.warn(error_message);
                            }
                        }
                    } finally {
                        pph_error.$pph_error_handling_onP$.rebind(_prev_bind_2, thread);
                        Errors.$continue_cerrorP$.rebind(_prev_bind_1, thread);
                        pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_0, thread);
                    }
                }
                return (NIL == paraphrase) || (NIL != com.cyc.cycjava.cycl.random_thought_generator.thcl_paraphrase_unacceptableP(pph_utilities.pph_javalist_string(paraphrase))) ? ((SubLObject) (NIL)) : paraphrase;
            }
        }
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
                    Errors.warn(cconcatenate(pph_error_message_truncator.truncate_pph_error_message(error_message), random_thought_generator.$str129$___Top_level_CycL___S), pph_vars.pph_top_level_cycl());
                }
            }
        } finally {
            pph_error.$pph_error_handling_onP$.rebind(_prev_bind_3, thread);
            Errors.$continue_cerrorP$.rebind(_prev_bind_2, thread);
            pph_vars.$pph_demerit_cutoff$.rebind(_prev_bind_0, thread);
        }
        return (NIL == paraphrase) || (NIL != random_thought_generator.thcl_paraphrase_unacceptableP(pph_utilities.pph_javalist_string(paraphrase))) ? NIL : paraphrase;
    }

    /**
     * Is STRING a string that we never want to use to display THCL thoughts?
     */
    @LispMethod(comment = "Is STRING a string that we never want to use to display THCL thoughts?")
    public static final SubLObject thcl_paraphrase_unacceptableP_alt(SubLObject string) {
        if (NIL == string_utilities.non_empty_stringP(string)) {
            return T;
        } else {
            if (NIL != string_utilities.substringP(constant_reader.constant_reader_prefix(), string, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                return T;
            } else {
                return NIL;
            }
        }
    }

    /**
     * Is STRING a string that we never want to use to display THCL thoughts?
     */
    @LispMethod(comment = "Is STRING a string that we never want to use to display THCL thoughts?")
    public static SubLObject thcl_paraphrase_unacceptableP(final SubLObject string) {
        if (NIL == string_utilities.non_empty_stringP(string)) {
            return T;
        }
        if (NIL != string_utilities.substringP(constant_reader.constant_reader_prefix(), string, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
            return T;
        }
        return NIL;
    }

    public static final SubLObject next_thcl_topic_alt(SubLObject most_recently_added_thought) {
        {
            SubLObject next_term = NIL;
            SubLObject method = com.cyc.cycjava.cycl.random_thought_generator.choose_thcl_topic_selection_method();
            SubLObject datum = most_recently_added_thought;
            SubLObject current = datum;
            SubLObject v_term = NIL;
            SubLObject assertion = NIL;
            SubLObject assertion_paraphrase = NIL;
            destructuring_bind_must_consp(current, datum, $list_alt127);
            v_term = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt127);
            assertion = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list_alt127);
            assertion_paraphrase = current.first();
            current = current.rest();
            if (NIL == current) {
                {
                    SubLObject pcase_var = method;
                    if (pcase_var.eql($NEW_ARG_FROM_ASSERTION)) {
                        if (NIL != assertion) {
                            {
                                SubLObject args = cycl_utilities.formula_args(uncanonicalizer.assertion_el_formula(assertion), $IGNORE);
                                SubLObject rest = NIL;
                                for (rest = args; !((NIL != next_term) || (NIL == rest)); rest = rest.rest()) {
                                    {
                                        SubLObject arg = rest.first();
                                        if (!(arg.eql(v_term) || (NIL == thcl.thcl_constantP(arg, UNPROVIDED)))) {
                                            next_term = arg;
                                        }
                                    }
                                }
                            }
                        }
                        if (NIL == next_term) {
                            next_term = v_term;
                        }
                    } else {
                        if (pcase_var.eql($REUSE_MOST_RECENTLY_ADDED_TOPIC)) {
                            next_term = v_term;
                        } else {
                            next_term = NIL;
                        }
                    }
                }
            } else {
                cdestructuring_bind_error(datum, $list_alt127);
            }
            return next_term;
        }
    }

    public static SubLObject next_thcl_topic(final SubLObject most_recently_added_thought) {
        SubLObject next_term = NIL;
        final SubLObject method = random_thought_generator.choose_thcl_topic_selection_method();
        SubLObject v_term = NIL;
        SubLObject assertion = NIL;
        SubLObject assertion_paraphrase = NIL;
        destructuring_bind_must_consp(most_recently_added_thought, most_recently_added_thought, random_thought_generator.$list130);
        v_term = most_recently_added_thought.first();
        SubLObject current = most_recently_added_thought.rest();
        destructuring_bind_must_consp(current, most_recently_added_thought, random_thought_generator.$list130);
        assertion = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, most_recently_added_thought, random_thought_generator.$list130);
        assertion_paraphrase = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject pcase_var = method;
            if (pcase_var.eql(random_thought_generator.$NEW_ARG_FROM_ASSERTION)) {
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
                if (pcase_var.eql(random_thought_generator.$REUSE_MOST_RECENTLY_ADDED_TOPIC)) {
                    next_term = v_term;
                } else {
                    next_term = NIL;
                }

        } else {
            cdestructuring_bind_error(most_recently_added_thought, random_thought_generator.$list130);
        }
        return next_term;
    }

    public static final SubLObject choose_thcl_topic_selection_method_alt() {
        {
            SubLObject pick_a_number = random.random(SIXTEEN_INTEGER);
            SubLObject pcase_var = pick_a_number;
            if (pcase_var.eql(ZERO_INTEGER)) {
                return $RANDOM;
            } else {
                if (pcase_var.eql(ONE_INTEGER) || pcase_var.eql(TWO_INTEGER)) {
                    return $REUSE_MOST_RECENTLY_ADDED_TOPIC;
                } else {
                    return $NEW_ARG_FROM_ASSERTION;
                }
            }
        }
    }

    public static SubLObject choose_thcl_topic_selection_method() {
        final SubLObject pcase_var;
        final SubLObject pick_a_number = pcase_var = random.random(SIXTEEN_INTEGER);
        if (pcase_var.eql(ZERO_INTEGER)) {
            return $RANDOM;
        }
        if (pcase_var.eql(ONE_INTEGER) || pcase_var.eql(TWO_INTEGER)) {
            return random_thought_generator.$REUSE_MOST_RECENTLY_ADDED_TOPIC;
        }
        return random_thought_generator.$NEW_ARG_FROM_ASSERTION;
    }

    public static SubLObject declare_random_thought_generator_file() {
        declareFunction("random_thought_p", "RANDOM-THOUGHT-P", 1, 0, false);
        declareFunction("empty_random_thought_p", "EMPTY-RANDOM-THOUGHT-P", 1, 0, false);
        declareFunction("non_empty_random_thought_p", "NON-EMPTY-RANDOM-THOUGHT-P", 1, 0, false);
        declareFunction("xml_output_random_thoughts", "XML-OUTPUT-RANDOM-THOUGHTS", 2, 1, false);
        declareFunction("xml_output_random_thoughts_for_terms", "XML-OUTPUT-RANDOM-THOUGHTS-FOR-TERMS", 2, 1, false);
        declareFunction("sql_output_random_thoughts_from_xml", "SQL-OUTPUT-RANDOM-THOUGHTS-FROM-XML", 2, 1, false);
        declareFunction("next_random_thought_num_for_topic", "NEXT-RANDOM-THOUGHT-NUM-FOR-TOPIC", 2, 0, false);
        declareFunction("write_random_thought_sql_header", "WRITE-RANDOM-THOUGHT-SQL-HEADER", 1, 0, false);
        declareFunction("write_random_thought_sql_row", "WRITE-RANDOM-THOUGHT-SQL-ROW", 5, 0, false);
        declareFunction("xml_output_random_thoughts_for_term", "XML-OUTPUT-RANDOM-THOUGHTS-FOR-TERM", 1, 1, false);
        declareFunction("xml_output_random_thought", "XML-OUTPUT-RANDOM-THOUGHT", 1, 0, false);
        declareFunction("valid_non_empty_random_thought_p", "VALID-NON-EMPTY-RANDOM-THOUGHT-P", 1, 0, false);
        declareFunction("next_random_thought_for_user", "NEXT-RANDOM-THOUGHT-FOR-USER", 1, 1, false);
        declareFunction("thcl_assertion_seen_by_cyclistP", "THCL-ASSERTION-SEEN-BY-CYCLIST?", 2, 0, false);
        declareFunction("number_of_queued_random_thoughts_for_user", "NUMBER-OF-QUEUED-RANDOM-THOUGHTS-FOR-USER", 1, 0, false);
        declareFunction("number_of_used_random_thoughts_for_user", "NUMBER-OF-USED-RANDOM-THOUGHTS-FOR-USER", 1, 0, false);
        declareFunction("remote_random_thought_image", "REMOTE-RANDOM-THOUGHT-IMAGE", 0, 0, false);
        declareFunction("set_remote_random_thought_image", "SET-REMOTE-RANDOM-THOUGHT-IMAGE", 3, 0, false);
        declareFunction("unset_remote_random_thought_image", "UNSET-REMOTE-RANDOM-THOUGHT-IMAGE", 0, 0, false);
        declareFunction("clear_remote_random_thought_connection_pool", "CLEAR-REMOTE-RANDOM-THOUGHT-CONNECTION-POOL", 0, 0, false);
        declareFunction("random_thought_server_hostXport", "RANDOM-THOUGHT-SERVER-HOST&PORT", 0, 0, false);
        declareFunction("next_random_thought_for_user_from_remote_server", "NEXT-RANDOM-THOUGHT-FOR-USER-FROM-REMOTE-SERVER", 2, 0, false);
        declareFunction("next_random_thought_for_user_from_remote_server_int", "NEXT-RANDOM-THOUGHT-FOR-USER-FROM-REMOTE-SERVER-INT", 2, 0, false);
        declareFunction("create_remote_random_thought_connection", "CREATE-REMOTE-RANDOM-THOUGHT-CONNECTION", 0, 0, false);
        declareFunction("release_random_thought_connection", "RELEASE-RANDOM-THOUGHT-CONNECTION", 1, 0, false);
        declareFunction("open_remote_random_thought_connection_p", "OPEN-REMOTE-RANDOM-THOUGHT-CONNECTION-P", 1, 0, false);
        declareFunction("get_free_random_thought_connection", "GET-FREE-RANDOM-THOUGHT-CONNECTION", 0, 0, false);
        declareFunction("register_random_thought_generator", "REGISTER-RANDOM-THOUGHT-GENERATOR", 2, 0, false);
        declareFunction("find_random_thought_generator_for_user", "FIND-RANDOM-THOUGHT-GENERATOR-FOR-USER", 1, 0, false);
        declareFunction("random_thought_generator_print_function_trampoline", "RANDOM-THOUGHT-GENERATOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("random_thought_generator_p", "RANDOM-THOUGHT-GENERATOR-P", 1, 0, false);
        new random_thought_generator.$random_thought_generator_p$UnaryFunction();
        declareFunction("rtg_struct_user", "RTG-STRUCT-USER", 1, 0, false);
        declareFunction("rtg_struct_done_assertions", "RTG-STRUCT-DONE-ASSERTIONS", 1, 0, false);
        declareFunction("rtg_struct_generator_thread", "RTG-STRUCT-GENERATOR-THREAD", 1, 0, false);
        declareFunction("rtg_struct_queue", "RTG-STRUCT-QUEUE", 1, 0, false);
        declareFunction("rtg_struct_most_recently_added_thought", "RTG-STRUCT-MOST-RECENTLY-ADDED-THOUGHT", 1, 0, false);
        declareFunction("rtg_struct_topical_thoughts", "RTG-STRUCT-TOPICAL-THOUGHTS", 1, 0, false);
        declareFunction("_csetf_rtg_struct_user", "_CSETF-RTG-STRUCT-USER", 2, 0, false);
        declareFunction("_csetf_rtg_struct_done_assertions", "_CSETF-RTG-STRUCT-DONE-ASSERTIONS", 2, 0, false);
        declareFunction("_csetf_rtg_struct_generator_thread", "_CSETF-RTG-STRUCT-GENERATOR-THREAD", 2, 0, false);
        declareFunction("_csetf_rtg_struct_queue", "_CSETF-RTG-STRUCT-QUEUE", 2, 0, false);
        declareFunction("_csetf_rtg_struct_most_recently_added_thought", "_CSETF-RTG-STRUCT-MOST-RECENTLY-ADDED-THOUGHT", 2, 0, false);
        declareFunction("_csetf_rtg_struct_topical_thoughts", "_CSETF-RTG-STRUCT-TOPICAL-THOUGHTS", 2, 0, false);
        declareFunction("make_random_thought_generator", "MAKE-RANDOM-THOUGHT-GENERATOR", 0, 1, false);
        declareFunction("visit_defstruct_random_thought_generator", "VISIT-DEFSTRUCT-RANDOM-THOUGHT-GENERATOR", 2, 0, false);
        declareFunction("visit_defstruct_object_random_thought_generator_method", "VISIT-DEFSTRUCT-OBJECT-RANDOM-THOUGHT-GENERATOR-METHOD", 2, 0, false);
        declareFunction("rtg_user", "RTG-USER", 1, 0, false);
        declareFunction("rtg_done_assertions", "RTG-DONE-ASSERTIONS", 1, 0, false);
        declareFunction("rtg_generator_thread", "RTG-GENERATOR-THREAD", 1, 0, false);
        declareFunction("rtg_set_generator_thread", "RTG-SET-GENERATOR-THREAD", 2, 0, false);
        declareFunction("rtg_queue", "RTG-QUEUE", 1, 0, false);
        declareFunction("rtg_most_recently_added_thought", "RTG-MOST-RECENTLY-ADDED-THOUGHT", 1, 0, false);
        declareFunction("rtg_set_most_recently_added_thought", "RTG-SET-MOST-RECENTLY-ADDED-THOUGHT", 2, 0, false);
        declareFunction("rtg_topical_thoughts", "RTG-TOPICAL-THOUGHTS", 1, 0, false);
        declareFunction("rtg_set_topical_thoughts", "RTG-SET-TOPICAL-THOUGHTS", 2, 0, false);
        declareFunction("pprint_random_thought_generator", "PPRINT-RANDOM-THOUGHT-GENERATOR", 1, 2, false);
        declareFunction("find_or_create_random_thought_generator_for_user", "FIND-OR-CREATE-RANDOM-THOUGHT-GENERATOR-FOR-USER", 1, 0, false);
        declareFunction("empty_thought", "EMPTY-THOUGHT", 0, 0, false);
        declareFunction("new_random_thought_generator_for_user", "NEW-RANDOM-THOUGHT-GENERATOR-FOR-USER", 1, 0, false);
        declareFunction("new_random_thought_generator", "NEW-RANDOM-THOUGHT-GENERATOR", 0, 0, false);
        declareFunction("note_rtg_exhausted", "NOTE-RTG-EXHAUSTED", 1, 0, false);
        declareFunction("random_thought_generator_exhausted_p", "RANDOM-THOUGHT-GENERATOR-EXHAUSTED-P", 1, 0, false);
        declareFunction("random_thoughts_on_topic_exhausted_p", "RANDOM-THOUGHTS-ON-TOPIC-EXHAUSTED-P", 1, 0, false);
        declareFunction("note_random_thoughts_on_topic_exhausted", "NOTE-RANDOM-THOUGHTS-ON-TOPIC-EXHAUSTED", 1, 0, false);
        declareFunction("random_thought_generator_full_p", "RANDOM-THOUGHT-GENERATOR-FULL-P", 2, 0, false);
        declareFunction("random_thought_generator_queue_full_p", "RANDOM-THOUGHT-GENERATOR-QUEUE-FULL-P", 2, 0, false);
        declareFunction("declare_interest_in_random_thoughts_about_topic", "DECLARE-INTEREST-IN-RANDOM-THOUGHTS-ABOUT-TOPIC", 2, 0, false);
        declareMacro("rtg_note", "RTG-NOTE");
        declareFunction("register_interest_in_random_thoughts_about_topic", "REGISTER-INTEREST-IN-RANDOM-THOUGHTS-ABOUT-TOPIC", 2, 0, false);
        declareFunction("all_random_thoughts_on_topic", "ALL-RANDOM-THOUGHTS-ON-TOPIC", 1, 0, false);
        declareFunction("next_random_thought_with_suggested_topic", "NEXT-RANDOM-THOUGHT-WITH-SUGGESTED-TOPIC", 2, 0, false);
        declareFunction("next_random_thought_without_suggested_topic", "NEXT-RANDOM-THOUGHT-WITHOUT-SUGGESTED-TOPIC", 2, 0, false);
        declareFunction("find_or_create_random_thought_generator_thread", "FIND-OR-CREATE-RANDOM-THOUGHT-GENERATOR-THREAD", 1, 1, false);
        declareFunction("keep_random_thought_generator_full", "KEEP-RANDOM-THOUGHT-GENERATOR-FULL", 1, 2, false);
        declareFunction("fill_random_thought_generator", "FILL-RANDOM-THOUGHT-GENERATOR", 2, 0, false);
        declareFunction("update_random_thought_data", "UPDATE-RANDOM-THOUGHT-DATA", 3, 0, false);
        declareFunction("open_cyc_formula", "OPEN-CYC-FORMULA", 1, 0, false);
        declareFunction("open_cyc_fort_internal", "OPEN-CYC-FORT-INTERNAL", 1, 0, false);
        declareFunction("open_cyc_fort", "OPEN-CYC-FORT", 1, 0, false);
        declareFunction("potentially_porn_relatedP_internal", "POTENTIALLY-PORN-RELATED?-INTERNAL", 1, 0, false);
        declareFunction("potentially_porn_relatedP", "POTENTIALLY-PORN-RELATED?", 1, 0, false);
        declareFunction("new_random_thought_data_for_topic", "NEW-RANDOM-THOUGHT-DATA-FOR-TOPIC", 1, 0, false);
        declareFunction("gafs_about_topic", "GAFS-ABOUT-TOPIC", 1, 0, false);
        declareFunction("gaf_about_topicP", "GAF-ABOUT-TOPIC?", 2, 1, false);
        declareFunction("fill_random_thought_generator_queue", "FILL-RANDOM-THOUGHT-GENERATOR-QUEUE", 2, 0, false);
        declareFunction("add_random_thought_to_rtg", "ADD-RANDOM-THOUGHT-TO-RTG", 1, 0, false);
        declareFunction("thcl_paraphrase_for_assertion", "THCL-PARAPHRASE-FOR-ASSERTION", 1, 0, false);
        declareFunction("thcl_paraphrase_unacceptableP", "THCL-PARAPHRASE-UNACCEPTABLE?", 1, 0, false);
        declareFunction("next_thcl_topic", "NEXT-THCL-TOPIC", 1, 0, false);
        declareFunction("choose_thcl_topic_selection_method", "CHOOSE-THCL-TOPIC-SELECTION-METHOD", 0, 0, false);
        return NIL;
    }

    public static final SubLObject init_random_thought_generator_file_alt() {
        defparameter("*RANDOM-THOUGHT-SERVER-HOST*", red_infrastructure_macros.red_def_helper($list_alt33.isSymbol() ? ((SubLObject) (symbol_value($list_alt33))) : $list_alt33, $random_thought_server_host$, $str_alt35$random_thoughts_cyc_com.isSymbol() ? ((SubLObject) (symbol_value($str_alt35$random_thoughts_cyc_com))) : $str_alt35$random_thoughts_cyc_com, $PARAMETER, UNPROVIDED));
        defparameter("*RANDOM-THOUGHT-SERVER-PORT*", red_infrastructure_macros.red_def_helper($list_alt37.isSymbol() ? ((SubLObject) (symbol_value($list_alt37))) : $list_alt37, $random_thought_server_port$, $int$3634.isSymbol() ? ((SubLObject) (symbol_value($int$3634))) : $int$3634, $PARAMETER, UNPROVIDED));
        deflexical("*REMOTE-RANDOM-THOUGHT-IMAGE*", NIL != boundp($remote_random_thought_image$) ? ((SubLObject) ($remote_random_thought_image$.getGlobalValue())) : NIL);
        deflexical("*REMOTE-RANDOM-THOUGHT-CONNECTION-POOL*", NIL != boundp($remote_random_thought_connection_pool$) ? ((SubLObject) ($remote_random_thought_connection_pool$.getGlobalValue())) : queues.create_queue());
        deflexical("*REMOTE-RANDOM-THOUGHT-CONNECTION-POOL-LOCK*", make_lock($str_alt43$Remote_Random_Thought_Connection_));
        deflexical("*REMOTE-RANDOM-THOUGHT-CONNECTION-POOL-MAX-SIZE*", NINE_INTEGER);
        deflexical("*RANDOM-THOUGHT-GENERATORS-FOR-USERS*", NIL != boundp($random_thought_generators_for_users$) ? ((SubLObject) ($random_thought_generators_for_users$.getGlobalValue())) : dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        defconstant("*DTP-RANDOM-THOUGHT-GENERATOR*", RANDOM_THOUGHT_GENERATOR);
        defparameter("*PRINT-RTG-NOTES?*", NIL);
        return NIL;
    }

    public static SubLObject init_random_thought_generator_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*RANDOM-THOUGHT-SERVER-HOST*", red_infrastructure_macros.red_def_helper(random_thought_generator.$list34.isSymbol() ? symbol_value(random_thought_generator.$list34) : random_thought_generator.$list34, random_thought_generator.$random_thought_server_host$, random_thought_generator.$str36$random_thoughts_cyc_com.isSymbol() ? symbol_value(random_thought_generator.$str36$random_thoughts_cyc_com) : random_thought_generator.$str36$random_thoughts_cyc_com, $PARAMETER, UNPROVIDED));
            defparameter("*RANDOM-THOUGHT-SERVER-PORT*", red_infrastructure_macros.red_def_helper(random_thought_generator.$list38.isSymbol() ? symbol_value(random_thought_generator.$list38) : random_thought_generator.$list38, random_thought_generator.$random_thought_server_port$, random_thought_generator.$int$3634.isSymbol() ? symbol_value(random_thought_generator.$int$3634) : random_thought_generator.$int$3634, $PARAMETER, UNPROVIDED));
            deflexical("*REMOTE-RANDOM-THOUGHT-IMAGE*", SubLTrampolineFile.maybeDefault(random_thought_generator.$remote_random_thought_image$, random_thought_generator.$remote_random_thought_image$, NIL));
            deflexical("*REMOTE-RANDOM-THOUGHT-CONNECTION-POOL*", SubLTrampolineFile.maybeDefault(random_thought_generator.$remote_random_thought_connection_pool$, random_thought_generator.$remote_random_thought_connection_pool$, () -> queues.create_queue(UNPROVIDED)));
            deflexical("*REMOTE-RANDOM-THOUGHT-CONNECTION-POOL-LOCK*", make_lock(random_thought_generator.$str44$Remote_Random_Thought_Connection_));
            deflexical("*REMOTE-RANDOM-THOUGHT-CONNECTION-POOL-MAX-SIZE*", NINE_INTEGER);
            deflexical("*RANDOM-THOUGHT-GENERATORS-FOR-USERS*", SubLTrampolineFile.maybeDefault(random_thought_generator.$random_thought_generators_for_users$, random_thought_generator.$random_thought_generators_for_users$, () -> dictionary.new_dictionary(UNPROVIDED, UNPROVIDED)));
            defconstant("*DTP-RANDOM-THOUGHT-GENERATOR*", random_thought_generator.RANDOM_THOUGHT_GENERATOR);
            defparameter("*PRINT-RTG-NOTES?*", NIL);
        }
        if (SubLFiles.USE_V2) {
            defparameter("*RANDOM-THOUGHT-SERVER-HOST*", red_infrastructure_macros.red_def_helper($list_alt33.isSymbol() ? ((SubLObject) (symbol_value($list_alt33))) : $list_alt33, $random_thought_server_host$, $str_alt35$random_thoughts_cyc_com.isSymbol() ? ((SubLObject) (symbol_value($str_alt35$random_thoughts_cyc_com))) : $str_alt35$random_thoughts_cyc_com, $PARAMETER, UNPROVIDED));
            defparameter("*RANDOM-THOUGHT-SERVER-PORT*", red_infrastructure_macros.red_def_helper($list_alt37.isSymbol() ? ((SubLObject) (symbol_value($list_alt37))) : $list_alt37, $random_thought_server_port$, $int$3634.isSymbol() ? ((SubLObject) (symbol_value($int$3634))) : $int$3634, $PARAMETER, UNPROVIDED));
            deflexical("*REMOTE-RANDOM-THOUGHT-IMAGE*", NIL != boundp($remote_random_thought_image$) ? ((SubLObject) ($remote_random_thought_image$.getGlobalValue())) : NIL);
            deflexical("*REMOTE-RANDOM-THOUGHT-CONNECTION-POOL*", NIL != boundp($remote_random_thought_connection_pool$) ? ((SubLObject) ($remote_random_thought_connection_pool$.getGlobalValue())) : queues.create_queue());
            deflexical("*REMOTE-RANDOM-THOUGHT-CONNECTION-POOL-LOCK*", make_lock($str_alt43$Remote_Random_Thought_Connection_));
            deflexical("*RANDOM-THOUGHT-GENERATORS-FOR-USERS*", NIL != boundp($random_thought_generators_for_users$) ? ((SubLObject) ($random_thought_generators_for_users$.getGlobalValue())) : dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        }
        return NIL;
    }

    public static SubLObject init_random_thought_generator_file_Previous() {
        defparameter("*RANDOM-THOUGHT-SERVER-HOST*", red_infrastructure_macros.red_def_helper(random_thought_generator.$list34.isSymbol() ? symbol_value(random_thought_generator.$list34) : random_thought_generator.$list34, random_thought_generator.$random_thought_server_host$, random_thought_generator.$str36$random_thoughts_cyc_com.isSymbol() ? symbol_value(random_thought_generator.$str36$random_thoughts_cyc_com) : random_thought_generator.$str36$random_thoughts_cyc_com, $PARAMETER, UNPROVIDED));
        defparameter("*RANDOM-THOUGHT-SERVER-PORT*", red_infrastructure_macros.red_def_helper(random_thought_generator.$list38.isSymbol() ? symbol_value(random_thought_generator.$list38) : random_thought_generator.$list38, random_thought_generator.$random_thought_server_port$, random_thought_generator.$int$3634.isSymbol() ? symbol_value(random_thought_generator.$int$3634) : random_thought_generator.$int$3634, $PARAMETER, UNPROVIDED));
        deflexical("*REMOTE-RANDOM-THOUGHT-IMAGE*", SubLTrampolineFile.maybeDefault(random_thought_generator.$remote_random_thought_image$, random_thought_generator.$remote_random_thought_image$, NIL));
        deflexical("*REMOTE-RANDOM-THOUGHT-CONNECTION-POOL*", SubLTrampolineFile.maybeDefault(random_thought_generator.$remote_random_thought_connection_pool$, random_thought_generator.$remote_random_thought_connection_pool$, () -> queues.create_queue(UNPROVIDED)));
        deflexical("*REMOTE-RANDOM-THOUGHT-CONNECTION-POOL-LOCK*", make_lock(random_thought_generator.$str44$Remote_Random_Thought_Connection_));
        deflexical("*REMOTE-RANDOM-THOUGHT-CONNECTION-POOL-MAX-SIZE*", NINE_INTEGER);
        deflexical("*RANDOM-THOUGHT-GENERATORS-FOR-USERS*", SubLTrampolineFile.maybeDefault(random_thought_generator.$random_thought_generators_for_users$, random_thought_generator.$random_thought_generators_for_users$, () -> dictionary.new_dictionary(UNPROVIDED, UNPROVIDED)));
        defconstant("*DTP-RANDOM-THOUGHT-GENERATOR*", random_thought_generator.RANDOM_THOUGHT_GENERATOR);
        defparameter("*PRINT-RTG-NOTES?*", NIL);
        return NIL;
    }

    public static final SubLObject setup_random_thought_generator_file_alt() {
        declare_defglobal($remote_random_thought_image$);
        declare_defglobal($remote_random_thought_connection_pool$);
        declare_defglobal($random_thought_generators_for_users$);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_random_thought_generator$.getGlobalValue(), symbol_function(RANDOM_THOUGHT_GENERATOR_PRINT_FUNCTION_TRAMPOLINE));
        def_csetf(RTG_STRUCT_USER, _CSETF_RTG_STRUCT_USER);
        def_csetf(RTG_STRUCT_DONE_ASSERTIONS, _CSETF_RTG_STRUCT_DONE_ASSERTIONS);
        def_csetf(RTG_STRUCT_GENERATOR_THREAD, _CSETF_RTG_STRUCT_GENERATOR_THREAD);
        def_csetf(RTG_STRUCT_QUEUE, _CSETF_RTG_STRUCT_QUEUE);
        def_csetf(RTG_STRUCT_MOST_RECENTLY_ADDED_THOUGHT, _CSETF_RTG_STRUCT_MOST_RECENTLY_ADDED_THOUGHT);
        def_csetf(RTG_STRUCT_TOPICAL_THOUGHTS, _CSETF_RTG_STRUCT_TOPICAL_THOUGHTS);
        identity(RANDOM_THOUGHT_GENERATOR);
        note_funcall_helper_function(PPRINT_RANDOM_THOUGHT_GENERATOR);
        memoization_state.note_memoized_function(OPEN_CYC_FORT);
        memoization_state.note_memoized_function($sym117$POTENTIALLY_PORN_RELATED_);
        return NIL;
    }

    public static SubLObject setup_random_thought_generator_file() {
        if (SubLFiles.USE_V1) {
            declare_defglobal(random_thought_generator.$remote_random_thought_image$);
            declare_defglobal(random_thought_generator.$remote_random_thought_connection_pool$);
            declare_defglobal(random_thought_generator.$random_thought_generators_for_users$);
            register_method($print_object_method_table$.getGlobalValue(), random_thought_generator.$dtp_random_thought_generator$.getGlobalValue(), symbol_function(random_thought_generator.RANDOM_THOUGHT_GENERATOR_PRINT_FUNCTION_TRAMPOLINE));
            SubLSpecialOperatorDeclarations.proclaim(random_thought_generator.$list64);
            def_csetf(random_thought_generator.RTG_STRUCT_USER, random_thought_generator._CSETF_RTG_STRUCT_USER);
            def_csetf(random_thought_generator.RTG_STRUCT_DONE_ASSERTIONS, random_thought_generator._CSETF_RTG_STRUCT_DONE_ASSERTIONS);
            def_csetf(random_thought_generator.RTG_STRUCT_GENERATOR_THREAD, random_thought_generator._CSETF_RTG_STRUCT_GENERATOR_THREAD);
            def_csetf(random_thought_generator.RTG_STRUCT_QUEUE, random_thought_generator._CSETF_RTG_STRUCT_QUEUE);
            def_csetf(random_thought_generator.RTG_STRUCT_MOST_RECENTLY_ADDED_THOUGHT, random_thought_generator._CSETF_RTG_STRUCT_MOST_RECENTLY_ADDED_THOUGHT);
            def_csetf(random_thought_generator.RTG_STRUCT_TOPICAL_THOUGHTS, random_thought_generator._CSETF_RTG_STRUCT_TOPICAL_THOUGHTS);
            identity(random_thought_generator.RANDOM_THOUGHT_GENERATOR);
            register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), random_thought_generator.$dtp_random_thought_generator$.getGlobalValue(), symbol_function(random_thought_generator.VISIT_DEFSTRUCT_OBJECT_RANDOM_THOUGHT_GENERATOR_METHOD));
            note_funcall_helper_function(random_thought_generator.PPRINT_RANDOM_THOUGHT_GENERATOR);
            memoization_state.note_memoized_function(random_thought_generator.OPEN_CYC_FORT);
            memoization_state.note_memoized_function(random_thought_generator.$sym123$POTENTIALLY_PORN_RELATED_);
        }
        if (SubLFiles.USE_V2) {
            memoization_state.note_memoized_function($sym117$POTENTIALLY_PORN_RELATED_);
        }
        return NIL;
    }

    public static SubLObject setup_random_thought_generator_file_Previous() {
        declare_defglobal(random_thought_generator.$remote_random_thought_image$);
        declare_defglobal(random_thought_generator.$remote_random_thought_connection_pool$);
        declare_defglobal(random_thought_generator.$random_thought_generators_for_users$);
        register_method($print_object_method_table$.getGlobalValue(), random_thought_generator.$dtp_random_thought_generator$.getGlobalValue(), symbol_function(random_thought_generator.RANDOM_THOUGHT_GENERATOR_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim(random_thought_generator.$list64);
        def_csetf(random_thought_generator.RTG_STRUCT_USER, random_thought_generator._CSETF_RTG_STRUCT_USER);
        def_csetf(random_thought_generator.RTG_STRUCT_DONE_ASSERTIONS, random_thought_generator._CSETF_RTG_STRUCT_DONE_ASSERTIONS);
        def_csetf(random_thought_generator.RTG_STRUCT_GENERATOR_THREAD, random_thought_generator._CSETF_RTG_STRUCT_GENERATOR_THREAD);
        def_csetf(random_thought_generator.RTG_STRUCT_QUEUE, random_thought_generator._CSETF_RTG_STRUCT_QUEUE);
        def_csetf(random_thought_generator.RTG_STRUCT_MOST_RECENTLY_ADDED_THOUGHT, random_thought_generator._CSETF_RTG_STRUCT_MOST_RECENTLY_ADDED_THOUGHT);
        def_csetf(random_thought_generator.RTG_STRUCT_TOPICAL_THOUGHTS, random_thought_generator._CSETF_RTG_STRUCT_TOPICAL_THOUGHTS);
        identity(random_thought_generator.RANDOM_THOUGHT_GENERATOR);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), random_thought_generator.$dtp_random_thought_generator$.getGlobalValue(), symbol_function(random_thought_generator.VISIT_DEFSTRUCT_OBJECT_RANDOM_THOUGHT_GENERATOR_METHOD));
        note_funcall_helper_function(random_thought_generator.PPRINT_RANDOM_THOUGHT_GENERATOR);
        memoization_state.note_memoized_function(random_thought_generator.OPEN_CYC_FORT);
        memoization_state.note_memoized_function(random_thought_generator.$sym123$POTENTIALLY_PORN_RELATED_);
        return NIL;
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(NIL, NIL, NIL);

    @Override
    public void declareFunctions() {
        random_thought_generator.declare_random_thought_generator_file();
    }

    static private final SubLList $list_alt1 = list(list($TEST, makeSymbol("FORT-P")), list($TEST, makeSymbol("ASSERTION-P")), list($TEST, makeSymbol("PPH-JAVALIST-P")));

    @Override
    public void initializeVariables() {
        random_thought_generator.init_random_thought_generator_file();
    }

    @Override
    public void runTopLevelForms() {
        random_thought_generator.setup_random_thought_generator_file();
    }

    

    static private final SubLString $str_alt6$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $str_alt7$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

    static private final SubLString $str_alt8$Generating_ = makeString("Generating ");

    public static final class $random_thought_generator_native extends SubLStructNative {
        public SubLObject $user;

        public SubLObject $done_assertions;

        public SubLObject $generator_thread;

        public SubLObject $queue;

        public SubLObject $most_recently_added_thought;

        public SubLObject $topical_thoughts;

        private static final SubLStructDeclNative structDecl;

        public $random_thought_generator_native() {
            random_thought_generator.$random_thought_generator_native.this.$user = Lisp.NIL;
            random_thought_generator.$random_thought_generator_native.this.$done_assertions = Lisp.NIL;
            random_thought_generator.$random_thought_generator_native.this.$generator_thread = Lisp.NIL;
            random_thought_generator.$random_thought_generator_native.this.$queue = Lisp.NIL;
            random_thought_generator.$random_thought_generator_native.this.$most_recently_added_thought = Lisp.NIL;
            random_thought_generator.$random_thought_generator_native.this.$topical_thoughts = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return random_thought_generator.$random_thought_generator_native.this.$user;
        }

        @Override
        public SubLObject getField3() {
            return random_thought_generator.$random_thought_generator_native.this.$done_assertions;
        }

        @Override
        public SubLObject getField4() {
            return random_thought_generator.$random_thought_generator_native.this.$generator_thread;
        }

        @Override
        public SubLObject getField5() {
            return random_thought_generator.$random_thought_generator_native.this.$queue;
        }

        @Override
        public SubLObject getField6() {
            return random_thought_generator.$random_thought_generator_native.this.$most_recently_added_thought;
        }

        @Override
        public SubLObject getField7() {
            return random_thought_generator.$random_thought_generator_native.this.$topical_thoughts;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return random_thought_generator.$random_thought_generator_native.this.$user = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return random_thought_generator.$random_thought_generator_native.this.$done_assertions = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return random_thought_generator.$random_thought_generator_native.this.$generator_thread = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return random_thought_generator.$random_thought_generator_native.this.$queue = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return random_thought_generator.$random_thought_generator_native.this.$most_recently_added_thought = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return random_thought_generator.$random_thought_generator_native.this.$topical_thoughts = value;
        }

        static {
            structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.random_thought_generator.$random_thought_generator_native.class, random_thought_generator.RANDOM_THOUGHT_GENERATOR, random_thought_generator.RANDOM_THOUGHT_GENERATOR_P, random_thought_generator.$list58, random_thought_generator.$list59, new String[]{ "$user", "$done_assertions", "$generator_thread", "$queue", "$most_recently_added_thought", "$topical_thoughts" }, random_thought_generator.$list60, random_thought_generator.$list61, random_thought_generator.PPRINT_RANDOM_THOUGHT_GENERATOR);
        }
    }

    static private final SubLString $str_alt9$_random_thoughts___ = makeString(" random thoughts...");

    static private final SubLString $str_alt10$random_thoughts = makeString("random-thoughts");

    static private final SubLList $list_alt11 = list(makeKeyword("NOW"), NIL);

    static private final SubLString $str_alt13$Exporting_random_thoughts_to_ = makeString("Exporting random thoughts to ");

    static private final SubLString $str_alt15$Parsing_XML_stream___ = makeString("Parsing XML stream...");

    static private final SubLString $str_alt16$thoughts_about = makeString("thoughts-about");

    static private final SubLString $str_alt17$topic_id = makeString("topic-id");

    static private final SubLString $str_alt19$Expected__thought___got__S = makeString("Expected 'thought', got ~S");

    static private final SubLString $str_alt20$assertion_id = makeString("assertion-id");

    static private final SubLString $str_alt23$_____ = makeString(";~%~%");

    static private final SubLString $str_alt24$___ = makeString(",~%");

    static private final SubLString $str_alt25$INSERT_INTO_THOUGHTS_INTERNAL_ID_ = makeString("INSERT INTO THOUGHTS(INTERNAL_ID, TERM_EID, TERM_CYCL, ASRTN_EID, ASRTN_CYCL_SENTENCE, ASRTN_MT, ASRTN_PARAPHRASE) VALUES");

    static private final SubLString $str_alt26$___D____A_____A_____A_____A_____A = makeString(" (~D, '~A', '~A', '~A', '~A', '~A', '~A')");

    static private final SubLString $str_alt27$_ = makeString("'");

    static private final SubLString $str_alt28$__ = makeString("''");

    static private final SubLList $list_alt33 = list(makeString("external.random-thought-server.host"));

    static private final SubLString $str_alt35$random_thoughts_cyc_com = makeString("random-thoughts.cyc.com");

    static private final SubLList $list_alt37 = list(makeString("external.random-thought-server.port"));

    public static final class $random_thought_generator_p$UnaryFunction extends UnaryFunction {
        public $random_thought_generator_p$UnaryFunction() {
            super(extractFunctionNamed("RANDOM-THOUGHT-GENERATOR-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return random_thought_generator.random_thought_generator_p(arg1);
        }
    }

    static private final SubLString $str_alt43$Remote_Random_Thought_Connection_ = makeString("Remote Random Thought Connection Pool Lock");

    static private final SubLList $list_alt50 = list(makeSymbol("CSETQ"), makeSymbol("*PERFORM-CFASL-EXTERNALIZATION*"), T);

    static private final SubLString $str_alt53$Could_not_open_a_connection_to__s = makeString("Could not open a connection to ~s");

    static private final SubLList $list_alt57 = list(makeSymbol("USER"), makeSymbol("DONE-ASSERTIONS"), makeSymbol("GENERATOR-THREAD"), makeSymbol("QUEUE"), makeSymbol("MOST-RECENTLY-ADDED-THOUGHT"), makeSymbol("TOPICAL-THOUGHTS"));

    static private final SubLList $list_alt58 = list($USER, makeKeyword("DONE-ASSERTIONS"), makeKeyword("GENERATOR-THREAD"), makeKeyword("QUEUE"), makeKeyword("MOST-RECENTLY-ADDED-THOUGHT"), makeKeyword("TOPICAL-THOUGHTS"));

    static private final SubLList $list_alt59 = list(makeSymbol("RTG-STRUCT-USER"), makeSymbol("RTG-STRUCT-DONE-ASSERTIONS"), makeSymbol("RTG-STRUCT-GENERATOR-THREAD"), makeSymbol("RTG-STRUCT-QUEUE"), makeSymbol("RTG-STRUCT-MOST-RECENTLY-ADDED-THOUGHT"), makeSymbol("RTG-STRUCT-TOPICAL-THOUGHTS"));

    static private final SubLList $list_alt60 = list(makeSymbol("_CSETF-RTG-STRUCT-USER"), makeSymbol("_CSETF-RTG-STRUCT-DONE-ASSERTIONS"), makeSymbol("_CSETF-RTG-STRUCT-GENERATOR-THREAD"), makeSymbol("_CSETF-RTG-STRUCT-QUEUE"), makeSymbol("_CSETF-RTG-STRUCT-MOST-RECENTLY-ADDED-THOUGHT"), makeSymbol("_CSETF-RTG-STRUCT-TOPICAL-THOUGHTS"));

    static private final SubLString $str_alt81$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt82$__RTG_for__S___S_done__A__ = makeString("#<RTG for ~S (~S done ~A)>");

    static private final SubLString $str_alt83$_queued = makeString(" queued");

    static private final SubLList $list_alt87 = list(makeSymbol("FORMAT-STR"), makeSymbol("&REST"), makeSymbol("ARGS"));

    static private final SubLList $list_alt91 = list(QUOTE, makeSymbol("FORMAT"));

    static private final SubLList $list_alt94 = list(list(makeSymbol("FORCE-OUTPUT"), T));

    static private final SubLString $str_alt96$__Registering_interest_of__S_in__ = makeString("~&Registering interest of ~S in ~S~%");

    static private final SubLList $list_alt97 = list(makeKeyword("NOW"), NIL, makeKeyword("REQUIRE-TOPICAL?"), T);

    public static final SubLSymbol $kw99$REQUIRE_TOPICAL_ = makeKeyword("REQUIRE-TOPICAL?");

    static private final SubLString $str_alt100$__Waiting_for_new_thoughts_about_ = makeString("~&Waiting for new thoughts about ~S~%");

    static private final SubLString $str_alt102$___A_out_of_thoughts_about__S__ = makeString("~&~A out of thoughts about ~S~%");

    static private final SubLString $str_alt110$__Filling__S__ = makeString("~&Filling ~S~%");

    static private final SubLList $list_alt111 = cons(makeSymbol("TOPIC"), makeSymbol("NEW-DATA"));

    static private final SubLString $str_alt112$___S_is_now_full__ = makeString("~&~S is now full~%");

    static private final SubLString $str_alt113$_S_is_not_in_an_updatable_state = makeString("~S is not in an updatable state");

    static private final SubLString $str_alt114$__New_thought_concerning__S_____S = makeString("~&New thought concerning ~S:~% ~S~%");

    public static final SubLSymbol $kw116$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLSymbol $sym117$POTENTIALLY_PORN_RELATED_ = makeSymbol("POTENTIALLY-PORN-RELATED?");

    static private final SubLString $str_alt122$__Found__S_GAF_assertions_about__ = makeString("~&Found ~S GAF assertions about ~S~%");

    static private final SubLString $str_alt123$_PPH_error_level_ = makeString("(PPH error level ");

    static private final SubLString $str_alt124$__ = makeString(") ");

    static private final SubLString $str_alt125$_is_not_a_ = makeString(" is not a ");

    static private final SubLList $list_alt127 = list(makeSymbol("TERM"), makeSymbol("ASSERTION"), makeSymbol("ASSERTION-PARAPHRASE"));
}

/**
 * Total time: 837 ms synthetic
 */
