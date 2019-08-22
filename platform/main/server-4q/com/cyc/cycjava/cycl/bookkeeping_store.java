package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$hl_lock$;
import static com.cyc.cycjava.cycl.el_utilities.el_binary_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.replace_formula_arg;
import static com.cyc.cycjava.cycl.el_utilities.sequence_term;
import static com.cyc.cycjava.cycl.el_utilities.unmake_binary_formula;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.indexed_term_p;
import static com.cyc.cycjava.cycl.kb_indexing_datastructures.valid_indexed_termP;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.$is_noting_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_elapsed_seconds_for_notification$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_last_pacification_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_note$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_notification_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_pacifications_since_last_nl$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_sofar$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_total$;
import static com.cyc.cycjava.cycl.utilities_macros.$silent_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$suppress_all_progress_faster_than_seconds$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_preamble;
import static com.cyc.cycjava.cycl.utilities_macros.register_cyc_api_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeUninternedSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.assoc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.third;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;

import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_bookkeeping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


public final class bookkeeping_store extends SubLTranslatedFile {
    public static final SubLFile me = new bookkeeping_store();

    public static final String myName = "com.cyc.cycjava.cycl.bookkeeping_store";

    public static final String myFingerPrint = "bb198128e7f32a4b997447d099a967836be467d3d29b96794b731a59465e28e1";

    // deflexical
    private static final SubLSymbol $bookkeeping_predicates_for_hl_store$ = makeSymbol("*BOOKKEEPING-PREDICATES-FOR-HL-STORE*");

    // deflexical
    private static final SubLSymbol $arg2_indexed_bookkeeping_predicates_for_hl_store$ = makeSymbol("*ARG2-INDEXED-BOOKKEEPING-PREDICATES-FOR-HL-STORE*");



    // deflexical
    // An index for bookkeeping binary gafs: pred -> arg2 -> list of arg1s
    private static final SubLSymbol $bookkeeping_binary_gaf_arg2_index$ = makeSymbol("*BOOKKEEPING-BINARY-GAF-ARG2-INDEX*");





    private static final SubLSymbol HL_ASSERT_BOOKKEEPING_BINARY_GAF = makeSymbol("HL-ASSERT-BOOKKEEPING-BINARY-GAF");



    private static final SubLSymbol $sym4$_EXIT = makeSymbol("%EXIT");

    private static final SubLList $list5 = list(makeSymbol("PRED"), makeSymbol("ARG1"), makeSymbol("ARG2"), makeSymbol("MT"));

    private static final SubLString $str6$Assert__PRED_ARG1_ARG2__in_MT_to_ = makeString("Assert (PRED ARG1 ARG2) in MT to the bookkeeping store.");

    private static final SubLList $list7 = list(list(makeSymbol("PRED"), makeSymbol("FORT-P")), list(makeSymbol("MT"), makeSymbol("HLMT-P")));

    public static final SubLList $list8 = list(makeSymbol("BOOLEAN"));

    private static final SubLSymbol HL_UNASSERT_BOOKKEEPING_BINARY_GAF = makeSymbol("HL-UNASSERT-BOOKKEEPING-BINARY-GAF");

    private static final SubLString $str10$Unassert__PRED_ARG1_ARG2__in_MT_f = makeString("Unassert (PRED ARG1 ARG2) in MT from the bookkeeping store.");

    private static final SubLObject $$BookkeepingMt = reader_make_constant_shell(makeString("BookkeepingMt"));

    private static final SubLSymbol ASSERTED_ARGUMENT_SPEC_P = makeSymbol("ASSERTED-ARGUMENT-SPEC-P");









    private static final SubLObject $$myCreator = reader_make_constant_shell(makeString("myCreator"));



    private static final SubLList $list19 = list(new SubLObject[]{ makeKeyword("PRETTY-NAME"), makeString("myCreator"), makeKeyword("ARGUMENT-TYPE"), makeKeyword("ASSERTED-ARGUMENT"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("myCreator")), makeKeyword("APPLICABILITY"), makeSymbol("MY-CREATOR-HL-STORAGE-MODULE-APPLICABLE?"), makeKeyword("INCOMPLETENESS"), makeSymbol("BOOKKEEPING-PREDICATE-HL-STORAGE-MODULE-INCOMPLETENESS"), makeKeyword("ADD"), makeSymbol("BOOKKEEPING-PREDICATE-HL-STORAGE-MODULE-ASSERT"), makeKeyword("REMOVE"), makeSymbol("BOOKKEEPING-PREDICATE-HL-STORAGE-MODULE-UNASSERT"), makeKeyword("REMOVE-ALL"), makeSymbol("BOOKKEEPING-PREDICATE-HL-STORAGE-MODULE-UNASSERT") });

    public static final SubLList $list20 = list(reader_make_constant_shell(makeString("myCreator")), makeKeyword("FORT"), makeKeyword("FORT"));

    private static final SubLObject $$myCreationTime = reader_make_constant_shell(makeString("myCreationTime"));

    private static final SubLSymbol $MY_CREATION_TIME = makeKeyword("MY-CREATION-TIME");

    private static final SubLList $list23 = list(new SubLObject[]{ makeKeyword("PRETTY-NAME"), makeString("myCreationTime"), makeKeyword("ARGUMENT-TYPE"), makeKeyword("ASSERTED-ARGUMENT"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("myCreationTime")), makeKeyword("APPLICABILITY"), makeSymbol("MY-CREATION-TIME-HL-STORAGE-MODULE-APPLICABLE?"), makeKeyword("INCOMPLETENESS"), makeSymbol("BOOKKEEPING-PREDICATE-HL-STORAGE-MODULE-INCOMPLETENESS"), makeKeyword("ADD"), makeSymbol("BOOKKEEPING-PREDICATE-HL-STORAGE-MODULE-ASSERT"), makeKeyword("REMOVE"), makeSymbol("BOOKKEEPING-PREDICATE-HL-STORAGE-MODULE-UNASSERT"), makeKeyword("REMOVE-ALL"), makeSymbol("BOOKKEEPING-PREDICATE-HL-STORAGE-MODULE-UNASSERT") });

    public static final SubLList $list24 = list(reader_make_constant_shell(makeString("myCreationTime")), makeKeyword("FORT"), list(makeKeyword("TEST"), makeSymbol("UNIVERSAL-DATE-P")));

    private static final SubLObject $$myCreationPurpose = reader_make_constant_shell(makeString("myCreationPurpose"));

    private static final SubLSymbol $MY_CREATION_PURPOSE = makeKeyword("MY-CREATION-PURPOSE");

    public static final SubLList $list27 = list(new SubLObject[]{ makeKeyword("PRETTY-NAME"), makeString("myCreationPurpose"), makeKeyword("ARGUMENT-TYPE"), makeKeyword("ASSERTED-ARGUMENT"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("myCreationPurpose")), makeKeyword("APPLICABILITY"), makeSymbol("MY-CREATION-PURPOSE-HL-STORAGE-MODULE-APPLICABLE?"), makeKeyword("INCOMPLETENESS"), makeSymbol("BOOKKEEPING-PREDICATE-HL-STORAGE-MODULE-INCOMPLETENESS"), makeKeyword("ADD"), makeSymbol("BOOKKEEPING-PREDICATE-HL-STORAGE-MODULE-ASSERT"), makeKeyword("REMOVE"), makeSymbol("BOOKKEEPING-PREDICATE-HL-STORAGE-MODULE-UNASSERT"), makeKeyword("REMOVE-ALL"), makeSymbol("BOOKKEEPING-PREDICATE-HL-STORAGE-MODULE-UNASSERT") });

    public static final SubLList $list28 = list(reader_make_constant_shell(makeString("myCreationPurpose")), makeKeyword("FORT"), makeKeyword("FORT"));

    private static final SubLObject $$myCreationSecond = reader_make_constant_shell(makeString("myCreationSecond"));

    private static final SubLSymbol $MY_CREATION_SECOND = makeKeyword("MY-CREATION-SECOND");

    public static final SubLList $list31 = list(new SubLObject[]{ makeKeyword("PRETTY-NAME"), makeString("myCreationSecond"), makeKeyword("ARGUMENT-TYPE"), makeKeyword("ASSERTED-ARGUMENT"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("myCreationSecond")), makeKeyword("APPLICABILITY"), makeSymbol("MY-CREATION-SECOND-HL-STORAGE-MODULE-APPLICABLE?"), makeKeyword("INCOMPLETENESS"), makeSymbol("BOOKKEEPING-PREDICATE-HL-STORAGE-MODULE-INCOMPLETENESS"), makeKeyword("ADD"), makeSymbol("BOOKKEEPING-PREDICATE-HL-STORAGE-MODULE-ASSERT"), makeKeyword("REMOVE"), makeSymbol("BOOKKEEPING-PREDICATE-HL-STORAGE-MODULE-UNASSERT"), makeKeyword("REMOVE-ALL"), makeSymbol("BOOKKEEPING-PREDICATE-HL-STORAGE-MODULE-UNASSERT") });

    private static final SubLList $list32 = list(reader_make_constant_shell(makeString("myCreationSecond")), makeKeyword("FORT"), list(makeKeyword("TEST"), makeSymbol("UNIVERSAL-SECOND-P")));

    private static final SubLObject $$myCreationDate = reader_make_constant_shell(makeString("myCreationDate"));

    private static final SubLSymbol $MY_CREATION_DATE = makeKeyword("MY-CREATION-DATE");

    public static final SubLList $list35 = list(new SubLObject[]{ makeKeyword("PRETTY-NAME"), makeString("myCreationDate"), makeKeyword("ARGUMENT-TYPE"), makeKeyword("ASSERTED-ARGUMENT"), makeKeyword("PREDICATE"), reader_make_constant_shell(makeString("myCreationDate")), makeKeyword("APPLICABILITY"), makeSymbol("MY-CREATION-DATE-HL-STORAGE-MODULE-APPLICABLE?"), makeKeyword("INCOMPLETENESS"), makeSymbol("BOOKKEEPING-PREDICATE-HL-STORAGE-MODULE-INCOMPLETENESS"), makeKeyword("ADD"), makeSymbol("MY-CREATION-DATE-HL-STORAGE-MODULE-ASSERT"), makeKeyword("REMOVE"), makeSymbol("MY-CREATION-DATE-HL-STORAGE-MODULE-UNASSERT"), makeKeyword("REMOVE-ALL"), makeSymbol("MY-CREATION-DATE-HL-STORAGE-MODULE-UNASSERT") });

    private static final SubLList $list36 = list(reader_make_constant_shell(makeString("myCreationDate")), makeKeyword("FORT"), list(makeKeyword("TEST"), makeSymbol("DATE-P")));

    public static final SubLList $list37 = list(reader_make_constant_shell(makeString("myCreator")), reader_make_constant_shell(makeString("myCreationPurpose")), reader_make_constant_shell(makeString("myCreationTime")), reader_make_constant_shell(makeString("myCreationSecond")));

    public static final SubLList $list38 = list(reader_make_constant_shell(makeString("myCreator")), reader_make_constant_shell(makeString("myCreationPurpose")));

    private static final SubLList $list39 = list(list(makeSymbol("KEY"), makeSymbol("SUBINDEX"), makeSymbol("TOP-INDEX")), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLList $list41 = cons(makeSymbol("PRED"), makeSymbol("SUBINDEX"));

    private static final SubLList $list42 = list(list(makeSymbol("KEY"), makeSymbol("VALUE"), makeSymbol("INDEX")), makeSymbol("&BODY"), makeSymbol("BODY"));



    private static final SubLSymbol $bookkeeping_binary_gaf_store$ = makeSymbol("*BOOKKEEPING-BINARY-GAF-STORE*");

    private static final SubLSymbol $sym45$_BOOKKEEPING_BINARY_GAF_ARG2_INDEX_ = makeSymbol("*BOOKKEEPING-BINARY-GAF-ARG2-INDEX*");

    public static final SubLList $list46 = list(list(makeSymbol("PRED"), makeSymbol("SUBINDEX")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol DO_BOOKKEEPING_TOP_LEVEL_INDEX = makeSymbol("DO-BOOKKEEPING-TOP-LEVEL-INDEX");

    private static final SubLList $list48 = list(list(makeSymbol("DUMPER-BOOKKEEPING-BINARY-GAF-STORE")));

    public static final SubLList $list49 = list(list(makeSymbol("ARG1"), makeSymbol("ARG2"), makeSymbol("INDEX")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol DO_BOOKKEEPING_INTERMEDIATE_INDEX = makeSymbol("DO-BOOKKEEPING-INTERMEDIATE-INDEX");



    private static final SubLList $list52 = list(makeSymbol("FORT"), makeSymbol("&OPTIONAL"), list(makeSymbol("MT"), reader_make_constant_shell(makeString("BookkeepingMt"))));

    private static final SubLString $str53$Identify_the_cyclist_who_created_ = makeString("Identify the cyclist who created FORT.");

    private static final SubLList $list54 = list(list(makeSymbol("FORT"), makeSymbol("FORT-P")), list(makeSymbol("MT"), makeSymbol("HLMT-P")));

    public static final SubLList $list55 = list(makeSymbol("FORT-P"));

    private static final SubLSymbol CREATION_TIME = makeSymbol("CREATION-TIME");

    private static final SubLString $str57$Identify_when_FORT_was_created_ = makeString("Identify when FORT was created.");

    private static final SubLList $list58 = list(makeSymbol("INTEGERP"));

    private static final SubLInteger $int$1000000 = makeInteger(1000000);

    private static final SubLSymbol BOOKKEEPING_ASENT_TO_HL_ASSERTION_SPEC = makeSymbol("BOOKKEEPING-ASENT-TO-HL-ASSERTION-SPEC");

    private static final SubLSymbol BOOKKEEPING_ASENT_TO_HL_ASSERTIBLE = makeSymbol("BOOKKEEPING-ASENT-TO-HL-ASSERTIBLE");

    private static final SubLList $list62 = list(list(makeSymbol("PRED"), makeSymbol("ARG1"), makeSymbol("ARG2")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym63$SUBINDEX = makeUninternedSymbol("SUBINDEX");

    private static final SubLList $list64 = list(list(makeSymbol("BOOKKEEPING-BINARY-GAF-STORE")));

    private static final SubLList $list65 = list(list(makeSymbol("ASENT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym66$SUBINDEX = makeUninternedSymbol("SUBINDEX");

    private static final SubLSymbol $sym67$PRED = makeUninternedSymbol("PRED");

    private static final SubLSymbol $sym68$ARG1 = makeUninternedSymbol("ARG1");

    private static final SubLSymbol $sym69$ARG2 = makeUninternedSymbol("ARG2");







    private static final SubLObject $$different = reader_make_constant_shell(makeString("different"));

    private static final SubLObject $$arg2Format = reader_make_constant_shell(makeString("arg2Format"));

    private static final SubLList $list75 = list(reader_make_constant_shell(makeString("singleEntryFormatInArgs")));

    private static final SubLObject $$unknownSentence = reader_make_constant_shell(makeString("unknownSentence"));

    private static final SubLObject $$completeExtentEnumerable = reader_make_constant_shell(makeString("completeExtentEnumerable"));

    private static final SubLString $str78$Gathering_all__s_assertions = makeString("Gathering all ~s assertions");

    private static final SubLString $str79$___forgetting___S__S__S___ = makeString("~& forgetting (~S ~S ~S)~%");

    private static final SubLString $$$Reindexing_all_ = makeString("Reindexing all ");

    private static final SubLString $$$_assertions = makeString(" assertions");

    private static final SubLString $$$cdolist = makeString("cdolist");

    private static final SubLList $list83 = list(makeSymbol("ARG1"), makeSymbol("ARG2"));

    private static final SubLString $str84$Gathering_invalid_bookkeeping_ass = makeString("Gathering invalid bookkeeping assertions");

    private static final SubLList $list85 = cons(makeSymbol("PRED"), makeUninternedSymbol("SUBINDEX"));

    private static final SubLString $$$Removing_ = makeString("Removing ");

    private static final SubLString $$$_invalid_bookkeeping_assertions = makeString(" invalid bookkeeping assertions");

    private static final SubLString $str88$__Killed___S__S__S___ = makeString("~&Killed (~S ~S ~S)~%");

    private static final SubLString $str89$__Could_not_kill___S__S__S___ = makeString("~&Could not kill (~S ~S ~S)~%");

    public static SubLObject hl_assert_bookkeeping_binary_gaf(final SubLObject pred, final SubLObject arg1, final SubLObject arg2, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(pred, FORT_P);
        SubLTrampolineFile.enforceType(mt, HLMT_P);
        SubLObject result = NIL;
        hl_interface_infrastructure.define_hl_modifier_preamble();
        hl_interface_infrastructure.note_hl_modifier_invocation(HL_ASSERT_BOOKKEEPING_BINARY_GAF, pred, arg1, arg2, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != hl_interface_infrastructure.hl_modify_remoteP()) {
            result = hl_interface_infrastructure.hl_store_remote_eval(list(HL_ASSERT_BOOKKEEPING_BINARY_GAF, list(QUOTE, pred), list(QUOTE, arg1), list(QUOTE, arg2), list(QUOTE, mt)));
        }
        if (NIL != hl_interface_infrastructure.hl_modify_localP()) {
            final SubLObject _prev_bind_0 = hl_interface_infrastructure.$override_hl_store_remote_accessP$.currentBinding(thread);
            try {
                hl_interface_infrastructure.$override_hl_store_remote_accessP$.bind(T, thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock($hl_lock$.getGlobalValue());
                    return assert_bookkeeping_binary_gaf(pred, arg1, arg2, mt);
                } finally {
                    if (NIL != release) {
                        release_lock($hl_lock$.getGlobalValue());
                    }
                }
            } finally {
                hl_interface_infrastructure.$override_hl_store_remote_accessP$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }

    public static SubLObject hl_unassert_bookkeeping_binary_gaf(final SubLObject pred, final SubLObject arg1, final SubLObject arg2, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLTrampolineFile.enforceType(pred, FORT_P);
        SubLTrampolineFile.enforceType(mt, HLMT_P);
        SubLObject result = NIL;
        hl_interface_infrastructure.define_hl_modifier_preamble();
        hl_interface_infrastructure.note_hl_modifier_invocation(HL_UNASSERT_BOOKKEEPING_BINARY_GAF, pred, arg1, arg2, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != hl_interface_infrastructure.hl_modify_remoteP()) {
            result = hl_interface_infrastructure.hl_store_remote_eval(list(HL_UNASSERT_BOOKKEEPING_BINARY_GAF, list(QUOTE, pred), list(QUOTE, arg1), list(QUOTE, arg2), list(QUOTE, mt)));
        }
        if (NIL != hl_interface_infrastructure.hl_modify_localP()) {
            final SubLObject _prev_bind_0 = hl_interface_infrastructure.$override_hl_store_remote_accessP$.currentBinding(thread);
            try {
                hl_interface_infrastructure.$override_hl_store_remote_accessP$.bind(T, thread);
                SubLObject release = NIL;
                try {
                    release = seize_lock($hl_lock$.getGlobalValue());
                    return unassert_bookkeeping_binary_gaf(pred, arg1, arg2, mt);
                } finally {
                    if (NIL != release) {
                        release_lock($hl_lock$.getGlobalValue());
                    }
                }
            } finally {
                hl_interface_infrastructure.$override_hl_store_remote_accessP$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }

    public static SubLObject bookkeeping_predicate_hl_storage_module_applicableP(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        if (NIL != clause_utilities.pos_atomic_cnf_p(cnf)) {
            final SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
            if (((NIL != el_binary_formula_p(asent)) && (NIL == sequence_term(asent))) && (NIL != hlmt.hlmt_equal(mt, $$BookkeepingMt))) {
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject bookkeeping_predicate_hl_storage_module_incompleteness(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        assert NIL != arguments.asserted_argument_spec_p(argument_spec) : "arguments.asserted_argument_spec_p(argument_spec) " + "CommonSymbols.NIL != arguments.asserted_argument_spec_p(argument_spec) " + argument_spec;
        SubLObject incompleteness = NIL;
        final SubLObject strength_spec = arguments.asserted_argument_spec_strength_spec(argument_spec);
        if ($MONOTONIC != strength_spec) {
            incompleteness = cons($STRENGTH, incompleteness);
        }
        if ($BACKWARD != direction) {
            incompleteness = cons($DIRECTION, incompleteness);
        }
        return incompleteness;
    }

    public static SubLObject bookkeeping_predicate_hl_storage_module_assert(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        final SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject arg1 = cycl_utilities.sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.sentence_arg2(asent, UNPROVIDED);
        hl_transcript_tracing.note_hlt_assert_bookkeeping_sentence(asent, mt);
        return hl_assert_bookkeeping_binary_gaf(pred, arg1, arg2, mt);
    }

    public static SubLObject bookkeeping_predicate_hl_storage_module_unassert(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt) {
        final SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject arg1 = cycl_utilities.sentence_arg1(asent, UNPROVIDED);
        final SubLObject arg2 = cycl_utilities.sentence_arg2(asent, UNPROVIDED);
        hl_transcript_tracing.note_hlt_unassert_bookkeeping_sentence(asent, mt);
        return hl_unassert_bookkeeping_binary_gaf(pred, arg1, arg2, mt);
    }

    public static SubLObject my_creator_hl_storage_module_applicableP(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        if (NIL != bookkeeping_predicate_hl_storage_module_applicableP(argument_spec, cnf, mt, direction, variable_map)) {
            final SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
            return formula_pattern_match.pattern_matches_formula($list20, asent);
        }
        return NIL;
    }

    public static SubLObject my_creation_time_hl_storage_module_applicableP(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        if (NIL != bookkeeping_predicate_hl_storage_module_applicableP(argument_spec, cnf, mt, direction, variable_map)) {
            final SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
            return formula_pattern_match.pattern_matches_formula($list24, asent);
        }
        return NIL;
    }

    public static SubLObject my_creation_purpose_hl_storage_module_applicableP(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        if (NIL != bookkeeping_predicate_hl_storage_module_applicableP(argument_spec, cnf, mt, direction, variable_map)) {
            final SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
            return formula_pattern_match.pattern_matches_formula($list28, asent);
        }
        return NIL;
    }

    public static SubLObject my_creation_second_hl_storage_module_applicableP(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        if (NIL != bookkeeping_predicate_hl_storage_module_applicableP(argument_spec, cnf, mt, direction, variable_map)) {
            final SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
            return formula_pattern_match.pattern_matches_formula($list32, asent);
        }
        return NIL;
    }

    public static SubLObject my_creation_date_hl_storage_module_applicableP(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        if (NIL != bookkeeping_predicate_hl_storage_module_applicableP(argument_spec, cnf, mt, direction, variable_map)) {
            final SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
            return formula_pattern_match.pattern_matches_formula($list36, asent);
        }
        return NIL;
    }

    public static SubLObject my_creation_date_hl_storage_module_assert(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt, final SubLObject direction, final SubLObject variable_map) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject arg1 = cycl_utilities.sentence_arg1(asent, UNPROVIDED);
        final SubLObject cycl_date = cycl_utilities.sentence_arg2(asent, UNPROVIDED);
        final SubLObject univ_time = date_utilities.cycl_date_to_universal_time(cycl_date);
        if (NIL != numeric_date_utilities.universal_time_p(univ_time)) {
            thread.resetMultipleValues();
            final SubLObject univ_date = numeric_date_utilities.universal_date_and_second_from_time(univ_time);
            final SubLObject univ_second = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return makeBoolean((univ_date.isPositive() && (NIL != hl_assert_bookkeeping_binary_gaf($$myCreationTime, arg1, univ_date, mt))) && ((!univ_second.isPositive()) || (NIL != hl_assert_bookkeeping_binary_gaf($$myCreationSecond, arg1, univ_second, mt))));
        }
        return NIL;
    }

    public static SubLObject my_creation_date_hl_storage_module_unassert(final SubLObject argument_spec, final SubLObject cnf, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject asent = clause_utilities.gaf_cnf_literal(cnf);
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(asent);
        final SubLObject arg1 = cycl_utilities.sentence_arg1(asent, UNPROVIDED);
        final SubLObject cycl_date = cycl_utilities.sentence_arg2(asent, UNPROVIDED);
        final SubLObject univ_time = date_utilities.cycl_date_to_universal_time(cycl_date);
        if (NIL != numeric_date_utilities.universal_time_p(univ_time)) {
            thread.resetMultipleValues();
            final SubLObject univ_date = numeric_date_utilities.universal_date_and_second_from_time(univ_time);
            final SubLObject univ_second = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return makeBoolean((univ_date.isPositive() && (NIL != hl_unassert_bookkeeping_binary_gaf($$myCreationTime, arg1, univ_date, mt))) && ((!univ_second.isPositive()) || (NIL != hl_unassert_bookkeeping_binary_gaf($$myCreationSecond, arg1, univ_second, mt))));
        }
        return NIL;
    }

    public static SubLObject do_bookkeeping_top_level_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list39);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = NIL;
        SubLObject subindex = NIL;
        SubLObject top_index = NIL;
        destructuring_bind_must_consp(current, datum, $list39);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list39);
        subindex = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list39);
        top_index = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_ALIST, list(key, subindex, top_index), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list39);
        return NIL;
    }

    public static SubLObject bookkeeping_predicates_for_hl_store() {
        return copy_list($bookkeeping_predicates_for_hl_store$.getGlobalValue());
    }

    public static SubLObject arg2_indexed_bookkeeping_predicates_for_hl_store() {
        return copy_list($arg2_indexed_bookkeeping_predicates_for_hl_store$.getGlobalValue());
    }

    public static SubLObject arg2_indexed_bookkeeping_predP(final SubLObject pred) {
        return subl_promotions.memberP(pred, arg2_indexed_bookkeeping_predicates_for_hl_store(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject new_bookkeeping_top_level_index(final SubLObject top_level_keys) {
        SubLObject top_index = NIL;
        SubLObject cdolist_list_var = top_level_keys;
        SubLObject key = NIL;
        key = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject value = new_bookkeeping_intermediate_index();
            top_index = cons(cons(key, value), top_index);
            cdolist_list_var = cdolist_list_var.rest();
            key = cdolist_list_var.first();
        } 
        return nreverse(top_index);
    }

    public static SubLObject bookkeeping_top_level_index_lookup(final SubLObject index, final SubLObject key) {
        return assoc(key, index, UNPROVIDED, UNPROVIDED).rest();
    }

    public static SubLObject bookkeeping_top_level_index_insert(final SubLObject index, final SubLObject top_key, final SubLObject mid_key, final SubLObject leaf, final SubLObject single_entryP) {
        final SubLObject intermediate_index = bookkeeping_top_level_index_lookup(index, top_key);
        return bookkeeping_intermediate_index_insert(intermediate_index, mid_key, leaf, single_entryP);
    }

    public static SubLObject bookkeeping_top_level_index_delete(final SubLObject index, final SubLObject top_key, final SubLObject mid_key, final SubLObject leaf, final SubLObject single_entryP) {
        final SubLObject intermediate_index = bookkeeping_top_level_index_lookup(index, top_key);
        return bookkeeping_intermediate_index_delete(intermediate_index, mid_key, leaf, single_entryP);
    }

    public static SubLObject bookkeeping_top_level_index_count(final SubLObject index) {
        SubLObject count = ZERO_INTEGER;
        SubLObject cdolist_list_var = index;
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject pred = NIL;
            SubLObject subindex = NIL;
            destructuring_bind_must_consp(current, datum, $list41);
            pred = current.first();
            current = subindex = current.rest();
            count = add(count, bookkeeping_intermediate_index_count(subindex));
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        return count;
    }

    public static SubLObject do_bookkeeping_intermediate_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list42);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject key = NIL;
        SubLObject value = NIL;
        SubLObject index = NIL;
        destructuring_bind_must_consp(current, datum, $list42);
        key = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list42);
        value = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list42);
        index = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_DICTIONARY, list(key, value, index), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list42);
        return NIL;
    }

    public static SubLObject new_bookkeeping_intermediate_index() {
        return dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED);
    }

    public static SubLObject bookkeeping_intermediate_index_lookup(final SubLObject index, final SubLObject key) {
        return dictionary.dictionary_lookup(index, key, UNPROVIDED);
    }

    public static SubLObject bookkeeping_intermediate_index_num_keys(final SubLObject index) {
        return dictionary.dictionary_length(index);
    }

    public static SubLObject bookkeeping_intermediate_index_set(final SubLObject index, final SubLObject key, final SubLObject value) {
        return dictionary.dictionary_enter(index, key, value);
    }

    public static SubLObject bookkeeping_intermediate_index_push(final SubLObject index, final SubLObject key, final SubLObject value) {
        SubLObject v_set = bookkeeping_intermediate_index_lookup(index, key);
        if (NIL == v_set) {
            v_set = set.new_set(UNPROVIDED, UNPROVIDED);
        }
        set.set_add(value, v_set);
        dictionary.dictionary_enter(index, key, v_set);
        return T;
    }

    public static SubLObject bookkeeping_intermediate_index_delete_key(final SubLObject index, final SubLObject key) {
        return dictionary.dictionary_remove(index, key);
    }

    public static SubLObject bookkeeping_intermediate_index_insert(final SubLObject index, final SubLObject key, final SubLObject value, final SubLObject single_entryP) {
        if (NIL != single_entryP) {
            return bookkeeping_intermediate_index_set(index, key, value);
        }
        return bookkeeping_intermediate_index_push(index, key, value);
    }

    public static SubLObject bookkeeping_intermediate_index_delete(final SubLObject index, final SubLObject key, final SubLObject value, final SubLObject single_entryP) {
        final SubLObject lookup_value = bookkeeping_intermediate_index_lookup(index, key);
        if (NIL != lookup_value) {
            if (NIL == single_entryP) {
                return set.set_remove(value, lookup_value);
            }
            if (lookup_value.eql(value)) {
                bookkeeping_intermediate_index_delete_key(index, key);
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject bookkeeping_intermediate_index_count(final SubLObject index) {
        return dictionary.dictionary_length(index);
    }

    public static SubLObject clear_bookkeeping_binary_gaf_store() {
        $bookkeeping_binary_gaf_store$.setGlobalValue(new_bookkeeping_top_level_index($bookkeeping_predicates_for_hl_store$.getGlobalValue()));
        return NIL;
    }

    public static SubLObject dumper_num_top_level_index() {
        return length(dumper_bookkeeping_binary_gaf_store());
    }

    public static SubLObject dumper_do_bookkeeping_top_level_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list46);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject pred = NIL;
        SubLObject subindex = NIL;
        destructuring_bind_must_consp(current, datum, $list46);
        pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list46);
        subindex = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_BOOKKEEPING_TOP_LEVEL_INDEX, listS(pred, subindex, $list48), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list46);
        return NIL;
    }

    public static SubLObject dumper_num_intermediate_index(final SubLObject index) {
        return bookkeeping_intermediate_index_num_keys(index);
    }

    public static SubLObject dumper_do_bookkeeping_intermediate_index(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list49);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject arg1 = NIL;
        SubLObject arg2 = NIL;
        SubLObject index = NIL;
        destructuring_bind_must_consp(current, datum, $list49);
        arg1 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list49);
        arg2 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list49);
        index = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_BOOKKEEPING_INTERMEDIATE_INDEX, list(arg1, arg2, index), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list49);
        return NIL;
    }

    public static SubLObject dumper_bookkeeping_binary_gaf_store() {
        return bookkeeping_binary_gaf_store();
    }

    public static SubLObject dumper_clear_bookkeeping_binary_gaf_store() {
        return clear_bookkeeping_binary_gaf_store();
    }

    public static SubLObject dumper_load_bookkeeping_binary_gaf(final SubLObject pred, final SubLObject arg1, final SubLObject arg2) {
        return assert_bookkeeping_binary_gaf_int(pred, arg1, arg2);
    }

    public static SubLObject dumper_dumpable_bookkeeping_index() {
        return bookkeeping_binary_gaf_arg2_index();
    }

    public static SubLObject dumper_load_bookkeeping_index(final SubLObject index) {
        $bookkeeping_binary_gaf_arg2_index$.setGlobalValue(index);
        return NIL;
    }

    public static SubLObject bookkeeping_binary_gaf_store() {
        return $bookkeeping_binary_gaf_store$.getGlobalValue();
    }

    public static SubLObject bookkeeping_binary_gaf_arg2_index() {
        return $bookkeeping_binary_gaf_arg2_index$.getGlobalValue();
    }

    public static SubLObject assert_bookkeeping_binary_gaf(final SubLObject pred, final SubLObject arg1, final SubLObject arg2, final SubLObject mt) {
        if (NIL == hlmt.hlmt_equal(mt, $$BookkeepingMt)) {
            return NIL;
        }
        final SubLObject old_value = bookkeeping_fpred_value(pred, arg1, UNPROVIDED);
        if ((NIL != old_value) && (!arg2.equal(old_value))) {
            return NIL;
        }
        return makeBoolean((NIL != assert_bookkeeping_binary_gaf_int(pred, arg1, arg2)) && (NIL != add_bookkeeping_binary_gaf_indices(pred, arg1, arg2)));
    }

    public static SubLObject assert_bookkeeping_binary_gaf_int(final SubLObject pred, final SubLObject arg1, final SubLObject arg2) {
        return bookkeeping_top_level_index_insert(bookkeeping_binary_gaf_store(), pred, arg1, arg2, T);
    }

    public static SubLObject add_bookkeeping_binary_gaf_indices(final SubLObject pred, final SubLObject arg1, final SubLObject arg2) {
        return makeBoolean((NIL == arg2_indexed_bookkeeping_predP(pred)) || (NIL != bookkeeping_top_level_index_insert(bookkeeping_binary_gaf_arg2_index(), pred, arg2, arg1, NIL)));
    }

    public static SubLObject unassert_bookkeeping_binary_gaf(final SubLObject pred, final SubLObject arg1, final SubLObject arg2, final SubLObject mt) {
        if (NIL != hlmt.hlmt_equal(mt, $$BookkeepingMt)) {
            return makeBoolean((NIL != unassert_bookkeeping_binary_gaf_int(pred, arg1, arg2)) && (NIL != remove_bookkeeping_binary_gaf_indices(pred, arg1, arg2)));
        }
        return NIL;
    }

    public static SubLObject unassert_bookkeeping_binary_gaf_int(final SubLObject pred, final SubLObject arg1, final SubLObject arg2) {
        return bookkeeping_top_level_index_delete(bookkeeping_binary_gaf_store(), pred, arg1, arg2, T);
    }

    public static SubLObject remove_bookkeeping_binary_gaf_indices(final SubLObject pred, final SubLObject arg1, final SubLObject arg2) {
        return makeBoolean((NIL == arg2_indexed_bookkeeping_predP(pred)) || (NIL != bookkeeping_top_level_index_delete(bookkeeping_binary_gaf_arg2_index(), pred, arg2, arg1, NIL)));
    }

    public static SubLObject unassert_all_bookkeeping_gafs_on_term(final SubLObject v_term) {
        SubLObject successP = T;
        SubLObject cdolist_list_var = bookkeeping_binary_gaf_store();
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject pred = NIL;
            SubLObject subindex = NIL;
            destructuring_bind_must_consp(current, datum, $list41);
            pred = current.first();
            current = subindex = current.rest();
            final SubLObject arg2 = bookkeeping_intermediate_index_lookup(subindex, v_term);
            if ((NIL != arg2) && (NIL == hl_unassert_bookkeeping_binary_gaf(pred, v_term, arg2, $$BookkeepingMt))) {
                successP = NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        SubLObject cdolist_list_var2;
        SubLObject created_terms = cdolist_list_var2 = terms_created_by(v_term, UNPROVIDED);
        SubLObject created_term = NIL;
        created_term = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            if (NIL == hl_unassert_bookkeeping_binary_gaf($$myCreator, created_term, v_term, $$BookkeepingMt)) {
                successP = NIL;
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            created_term = cdolist_list_var2.first();
        } 
        created_terms = cdolist_list_var2 = terms_created_for(v_term, UNPROVIDED);
        created_term = NIL;
        created_term = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            if (NIL == hl_unassert_bookkeeping_binary_gaf($$myCreationPurpose, created_term, v_term, $$BookkeepingMt)) {
                successP = NIL;
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            created_term = cdolist_list_var2.first();
        } 
        return successP;
    }

    public static SubLObject unassert_all_bookkeeping_gafs_for_pred(final SubLObject pred) {
        return dictionary.clear_dictionary(bookkeeping_top_level_index_lookup(bookkeeping_binary_gaf_store(), pred));
    }

    public static SubLObject creator(final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$BookkeepingMt;
        }
        SubLTrampolineFile.enforceType(fort, FORT_P);
        SubLTrampolineFile.enforceType(mt, HLMT_P);
        return bookkeeping_fpred_value($$myCreator, fort, mt);
    }

    public static SubLObject creation_time(final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$BookkeepingMt;
        }
        SubLTrampolineFile.enforceType(fort, FORT_P);
        SubLTrampolineFile.enforceType(mt, HLMT_P);
        return bookkeeping_fpred_value($$myCreationTime, fort, mt);
    }

    public static SubLObject creation_date(final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$BookkeepingMt;
        }
        return creation_time(fort, mt);
    }

    public static SubLObject creation_purpose(final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$BookkeepingMt;
        }
        return bookkeeping_fpred_value($$myCreationPurpose, fort, mt);
    }

    public static SubLObject creation_second(final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$BookkeepingMt;
        }
        return bookkeeping_fpred_value($$myCreationSecond, fort, mt);
    }

    public static SubLObject created_when(final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$BookkeepingMt;
        }
        final SubLObject date = creation_time(fort, mt);
        final SubLObject second = creation_second(fort, mt);
        if (second.isInteger() && date.isInteger()) {
            return add(multiply($int$1000000, date), second);
        }
        if (date.isInteger()) {
            return multiply($int$1000000, date);
        }
        return NIL;
    }

    public static SubLObject creation_date_cycl(final SubLObject fort) {
        return removal_modules_bookkeeping.my_creation_date_arg2_lookup(fort);
    }

    public static SubLObject terms_created_by(final SubLObject cyclist, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$BookkeepingMt;
        }
        return bookkeeping_arg1_pred_values($$myCreator, cyclist, mt);
    }

    public static SubLObject terms_created_for(final SubLObject purpose, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$BookkeepingMt;
        }
        return bookkeeping_arg1_pred_values($$myCreationPurpose, purpose, mt);
    }

    public static SubLObject num_terms_created_by(final SubLObject cyclist, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$BookkeepingMt;
        }
        return bookkeeping_arg1_assertion_count($$myCreator, cyclist, mt);
    }

    public static SubLObject num_terms_created_for(final SubLObject purpose, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$BookkeepingMt;
        }
        return bookkeeping_arg1_assertion_count($$myCreationPurpose, purpose, mt);
    }

    public static SubLObject bookkeeping_asents_on_term(final SubLObject v_term) {
        SubLObject asents = NIL;
        SubLObject cdolist_list_var = bookkeeping_binary_gaf_store();
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject pred = NIL;
            SubLObject subindex = NIL;
            destructuring_bind_must_consp(current, datum, $list41);
            pred = current.first();
            current = subindex = current.rest();
            final SubLObject arg2 = bookkeeping_intermediate_index_lookup(subindex, v_term);
            if (NIL != arg2) {
                final SubLObject asent = make_binary_formula(pred, v_term, arg2);
                asents = cons(asent, asents);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        return asents;
    }

    public static SubLObject bookkeeping_assertibles_on_term(final SubLObject v_term) {
        SubLObject assertibles = NIL;
        SubLObject cdolist_list_var;
        final SubLObject asents = cdolist_list_var = bookkeeping_asents_on_term(v_term);
        SubLObject asent = NIL;
        asent = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject cnf = clause_utilities.make_gaf_cnf(asent);
            final SubLObject mt = $$BookkeepingMt;
            final SubLObject strength = $MONOTONIC;
            final SubLObject direction = $BACKWARD;
            final SubLObject variable_map = NIL;
            final SubLObject assertible = list(cnf, mt, strength, direction, variable_map);
            assertibles = cons(assertible, assertibles);
            cdolist_list_var = cdolist_list_var.rest();
            asent = cdolist_list_var.first();
        } 
        return assertibles;
    }

    public static SubLObject bookkeeping_hl_assertion_specs_on_term(final SubLObject v_term) {
        final SubLObject asents = bookkeeping_asents_on_term(v_term);
        return Mapping.mapcar(BOOKKEEPING_ASENT_TO_HL_ASSERTION_SPEC, asents);
    }

    public static SubLObject bookkeeping_hl_assertibles_on_term(final SubLObject v_term) {
        final SubLObject asents = bookkeeping_asents_on_term(v_term);
        return Mapping.mapcar(BOOKKEEPING_ASENT_TO_HL_ASSERTIBLE, asents);
    }

    public static SubLObject bookkeeping_asent_to_hl_assertion_spec(final SubLObject asent) {
        final SubLObject cnf = clause_utilities.make_gaf_cnf(asent);
        final SubLObject mt = $$BookkeepingMt;
        final SubLObject direction = $BACKWARD;
        final SubLObject variable_map = NIL;
        final SubLObject hl_assertion_spec = hl_storage_modules.new_hl_assertion_spec(cnf, mt, direction, variable_map);
        return hl_assertion_spec;
    }

    public static SubLObject bookkeeping_asent_to_hl_assertible(final SubLObject asent) {
        final SubLObject hl_assertion_spec = bookkeeping_asent_to_hl_assertion_spec(asent);
        final SubLObject strength = $MONOTONIC;
        final SubLObject argument_spec = arguments.create_asserted_argument_spec(strength);
        final SubLObject assertible = hl_storage_modules.new_hl_assertible(hl_assertion_spec, argument_spec);
        return assertible;
    }

    public static SubLObject bookkeeping_assertion_count() {
        return bookkeeping_top_level_index_count(bookkeeping_binary_gaf_store());
    }

    public static SubLObject num_bookkeeping_binary_gafs_on_term(final SubLObject v_term) {
        SubLObject count = ZERO_INTEGER;
        SubLObject cdolist_list_var = bookkeeping_binary_gaf_store();
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject pred = NIL;
            SubLObject subindex = NIL;
            destructuring_bind_must_consp(current, datum, $list41);
            pred = current.first();
            current = subindex = current.rest();
            if (NIL != bookkeeping_intermediate_index_lookup(subindex, v_term)) {
                count = add(count, ONE_INTEGER);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        return count;
    }

    public static SubLObject any_bookkeeping_assertions_on_termP(final SubLObject v_term) {
        SubLObject cdolist_list_var = bookkeeping_binary_gaf_store();
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject pred = NIL;
            SubLObject subindex = NIL;
            destructuring_bind_must_consp(current, datum, $list41);
            pred = current.first();
            current = subindex = current.rest();
            if (NIL != bookkeeping_intermediate_index_lookup(subindex, v_term)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject do_bookkeeping_assertions(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list62);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject pred = NIL;
        SubLObject arg1 = NIL;
        SubLObject arg2 = NIL;
        destructuring_bind_must_consp(current, datum, $list62);
        pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list62);
        arg1 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list62);
        arg2 = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject subindex = $sym63$SUBINDEX;
            return list(DO_BOOKKEEPING_TOP_LEVEL_INDEX, listS(pred, subindex, $list64), listS(DO_BOOKKEEPING_INTERMEDIATE_INDEX, list(arg1, arg2, subindex), append(body, NIL)));
        }
        cdestructuring_bind_error(datum, $list62);
        return NIL;
    }

    public static SubLObject do_bookkeeping_asents(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list65);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject asent = NIL;
        destructuring_bind_must_consp(current, datum, $list65);
        asent = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject subindex = $sym66$SUBINDEX;
            final SubLObject pred = $sym67$PRED;
            final SubLObject arg1 = $sym68$ARG1;
            final SubLObject arg2 = $sym69$ARG2;
            return list(DO_BOOKKEEPING_TOP_LEVEL_INDEX, listS(pred, subindex, $list64), list(DO_BOOKKEEPING_INTERMEDIATE_INDEX, list(arg1, arg2, subindex), listS(CLET, list(list(asent, list(MAKE_BINARY_FORMULA, pred, arg1, arg2))), append(body, NIL))));
        }
        cdestructuring_bind_error(datum, $list65);
        return NIL;
    }

    public static SubLObject total_num_assertions_on_term(final SubLObject v_term) {
        SubLObject count = ZERO_INTEGER;
        count = add(count, kb_indexing.num_index(v_term));
        count = add(count, num_bookkeeping_binary_gafs_on_term(v_term));
        return count;
    }

    public static SubLObject bookkeeping_asent_truth(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject predicate = unmake_binary_formula(asent);
        final SubLObject arg1 = thread.secondMultipleValue();
        final SubLObject arg2 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        return bookkeeping_assertion_truth(predicate, arg1, arg2);
    }

    public static SubLObject bookkeeping_assertion_truth(final SubLObject predicate, final SubLObject arg1, final SubLObject arg2) {
        if (predicate.eql($$myCreator)) {
            return enumeration_types.boolean_truth(eq(arg2, creator(arg1, UNPROVIDED)));
        }
        if (predicate.eql($$myCreationPurpose)) {
            return enumeration_types.boolean_truth(eq(arg2, creation_purpose(arg1, UNPROVIDED)));
        }
        if (predicate.eql($$myCreationTime)) {
            return enumeration_types.boolean_truth(eql(arg2, creation_time(arg1, UNPROVIDED)));
        }
        if (predicate.eql($$myCreationSecond)) {
            return enumeration_types.boolean_truth(eql(arg2, creation_second(arg1, UNPROVIDED)));
        }
        return $UNKNOWN;
    }

    public static SubLObject indexed_terms_mentioned_in_bookkeeping_assertions_of_term(final SubLObject v_term) {
        SubLObject indexed_terms = NIL;
        indexed_terms = cons($$BookkeepingMt, indexed_terms);
        SubLObject cdolist_list_var = bookkeeping_binary_gaf_store();
        SubLObject cons = NIL;
        cons = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject pred = NIL;
            SubLObject subindex = NIL;
            destructuring_bind_must_consp(current, datum, $list41);
            pred = current.first();
            current = subindex = current.rest();
            if (NIL != indexed_term_p(pred)) {
                indexed_terms = cons(pred, indexed_terms);
            }
            final SubLObject arg2 = bookkeeping_intermediate_index_lookup(subindex, v_term);
            if (NIL != indexed_term_p(arg2)) {
                indexed_terms = cons(arg2, indexed_terms);
            }
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        } 
        return list_utilities.fast_delete_duplicates(indexed_terms, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject why_not_bookkeeping_asent(final SubLObject asent) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject predicate = unmake_binary_formula(asent);
        final SubLObject arg1 = thread.secondMultipleValue();
        final SubLObject arg2 = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        SubLObject true_arg2 = NIL;
        final SubLObject pcase_var = predicate;
        if (pcase_var.eql($$myCreator)) {
            true_arg2 = creator(arg1, UNPROVIDED);
        } else
            if (pcase_var.eql($$myCreationPurpose)) {
                true_arg2 = creation_purpose(arg1, UNPROVIDED);
            } else
                if (pcase_var.eql($$myCreationTime)) {
                    true_arg2 = creation_time(arg1, UNPROVIDED);
                } else
                    if (pcase_var.eql($$myCreationSecond)) {
                        true_arg2 = creation_second(arg1, UNPROVIDED);
                    }



        if (NIL != true_arg2) {
            final SubLObject its_something_else = replace_formula_arg(TWO_INTEGER, true_arg2, asent);
            final SubLObject youre_different = list($$different, arg2, true_arg2);
            final SubLObject there_can_be_only_one = listS($$arg2Format, predicate, $list75);
            return list(its_something_else, youre_different, there_can_be_only_one);
        }
        final SubLObject its_unknown = list($$unknownSentence, asent);
        final SubLObject complete_extent = list($$completeExtentEnumerable, predicate);
        return list(its_unknown, complete_extent);
    }

    public static SubLObject bookkeeping_fpred_value(final SubLObject pred, final SubLObject arg1, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$BookkeepingMt;
        }
        if (NIL != hlmt.hlmt_equal(mt, $$BookkeepingMt)) {
            return bookkeeping_fpred_value_int(pred, arg1);
        }
        return kb_mapping_utilities.fpred_value_in_mt(arg1, pred, mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject bookkeeping_fpred_value_int(final SubLObject pred, final SubLObject arg1) {
        final SubLObject arg1_subindex = bookkeeping_top_level_index_lookup(bookkeeping_binary_gaf_store(), pred);
        if (NIL != arg1_subindex) {
            final SubLObject arg2 = bookkeeping_intermediate_index_lookup(arg1_subindex, arg1);
            return arg2;
        }
        return NIL;
    }

    public static SubLObject bookkeeping_arg1_pred_values(final SubLObject pred, final SubLObject arg2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$BookkeepingMt;
        }
        if (NIL != hlmt.hlmt_equal(mt, $$BookkeepingMt)) {
            return bookkeeping_arg1_pred_values_int(pred, arg2);
        }
        return kb_mapping_utilities.pred_values_in_mt(arg2, pred, mt, TWO_INTEGER, ONE_INTEGER, UNPROVIDED);
    }

    public static SubLObject bookkeeping_arg1_pred_values_int(final SubLObject pred, final SubLObject arg2) {
        final SubLObject arg2_subindex = bookkeeping_top_level_index_lookup(bookkeeping_binary_gaf_arg2_index(), pred);
        if (NIL == arg2_subindex) {
            return NIL;
        }
        final SubLObject arg1_set = bookkeeping_intermediate_index_lookup(arg2_subindex, arg2);
        if (NIL != arg1_set) {
            return set.set_element_list(arg1_set);
        }
        return NIL;
    }

    public static SubLObject bookkeeping_arg1_assertion_count(final SubLObject pred, final SubLObject arg2, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $$BookkeepingMt;
        }
        if (NIL != hlmt.hlmt_equal(mt, $$BookkeepingMt)) {
            return bookkeeping_arg1_assertion_count_int(pred, arg2);
        }
        return kb_indexing.num_predicate_extent_index(pred, mt);
    }

    public static SubLObject bookkeeping_arg1_assertion_count_int(final SubLObject pred, final SubLObject arg2) {
        final SubLObject arg2_subindex = bookkeeping_top_level_index_lookup(bookkeeping_binary_gaf_arg2_index(), pred);
        if (NIL == arg2_subindex) {
            return NIL;
        }
        final SubLObject arg1_set = bookkeeping_intermediate_index_lookup(arg2_subindex, arg2);
        if (NIL != arg1_set) {
            return set.set_size(arg1_set);
        }
        return ZERO_INTEGER;
    }

    public static SubLObject reindex_all_bookkeeping_assertions() {
        SubLObject count = ZERO_INTEGER;
        SubLObject cdolist_list_var = bookkeeping_predicates_for_hl_store();
        SubLObject pred = NIL;
        pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            count = add(count, reindex_all_bookkeeping_assertions_for_pred(pred));
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
        } 
        return count;
    }

    public static SubLObject reindex_all_bookkeeping_assertions_for_pred(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject arg1_subindex = bookkeeping_top_level_index_lookup(bookkeeping_binary_gaf_store(), pred);
        SubLObject bookkeeping_pairs = NIL;
        $progress_note$.setDynamicValue(format(NIL, $str78$Gathering_all__s_assertions, pred), thread);
        $progress_total$.setDynamicValue(bookkeeping_intermediate_index_num_keys(arg1_subindex), thread);
        $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(arg1_subindex)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject arg1 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject arg2 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if ((NIL != valid_indexed_termP(arg1)) && (NIL != valid_indexed_termP(arg2))) {
                bookkeeping_pairs = cons(list(arg1, arg2), bookkeeping_pairs);
            } else {
                format(T, $str79$___forgetting___S__S__S___, new SubLObject[]{ pred, arg1, arg2 });
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        unassert_all_bookkeeping_gafs_for_pred(pred);
        final SubLObject list_var = bookkeeping_pairs;
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind(NIL != cconcatenate($$$Reindexing_all_, new SubLObject[]{ format_nil.format_nil_s_no_copy(pred), $$$_assertions }) ? cconcatenate($$$Reindexing_all_, new SubLObject[]{ format_nil.format_nil_s_no_copy(pred), $$$_assertions }) : $$$cdolist, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(list_var), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject pair = NIL;
                pair = csome_list_var.first();
                while (NIL != csome_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = pair;
                    SubLObject arg3 = NIL;
                    SubLObject arg4 = NIL;
                    destructuring_bind_must_consp(current, datum, $list83);
                    arg3 = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list83);
                    arg4 = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        hl_assert_bookkeeping_binary_gaf(pred, arg3, arg4, $$BookkeepingMt);
                    } else {
                        cdestructuring_bind_error(datum, $list83);
                    }
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    pair = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$1 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$1, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_8, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
            $last_percent_progress_index$.rebind(_prev_bind_5, thread);
            $progress_sofar$.rebind(_prev_bind_4, thread);
            $progress_total$.rebind(_prev_bind_3, thread);
            $progress_start_time$.rebind(_prev_bind_2, thread);
            $progress_note$.rebind(_prev_bind_0, thread);
        }
        return length(bookkeeping_pairs);
    }

    public static SubLObject forget_invalid_bookkeeping_assertions() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        SubLObject invalid_bookkeeping_triples = NIL;
        final SubLObject str = $str84$Gathering_invalid_bookkeeping_ass;
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
            SubLObject cdolist_list_var = bookkeeping_binary_gaf_store();
            SubLObject cons = NIL;
            cons = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = cons;
                SubLObject pred = NIL;
                SubLObject subindex = NIL;
                destructuring_bind_must_consp(current, datum, $list85);
                pred = current.first();
                current = subindex = current.rest();
                SubLObject iteration_state;
                for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(subindex)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                    thread.resetMultipleValues();
                    final SubLObject arg1 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                    final SubLObject arg2 = thread.secondMultipleValue();
                    thread.resetMultipleValues();
                    if ((NIL == valid_indexed_termP(arg1)) || (NIL == valid_indexed_termP(arg2))) {
                        invalid_bookkeeping_triples = cons(list(pred, arg1, arg2), invalid_bookkeeping_triples);
                    }
                }
                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                cdolist_list_var = cdolist_list_var.rest();
                cons = cdolist_list_var.first();
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
        final SubLObject list_var = invalid_bookkeeping_triples;
        final SubLObject _prev_bind_9 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_10 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_11 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_12 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_13 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_14 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_15 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_16 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind(NIL != cconcatenate($$$Removing_, new SubLObject[]{ format_nil.format_nil_s_no_copy(length(invalid_bookkeeping_triples)), $$$_invalid_bookkeeping_assertions }) ? cconcatenate($$$Removing_, new SubLObject[]{ format_nil.format_nil_s_no_copy(length(invalid_bookkeeping_triples)), $$$_invalid_bookkeeping_assertions }) : $$$cdolist, thread);
            $progress_start_time$.bind(get_universal_time(), thread);
            $progress_total$.bind(length(list_var), thread);
            $progress_sofar$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
            $last_percent_progress_prediction$.bind(NIL, thread);
            $within_noting_percent_progress$.bind(T, thread);
            $percent_progress_start_time$.bind(get_universal_time(), thread);
            try {
                noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                SubLObject csome_list_var = list_var;
                SubLObject invalid_bookkeeping_triple = NIL;
                invalid_bookkeeping_triple = csome_list_var.first();
                while (NIL != csome_list_var) {
                    final SubLObject pred2 = invalid_bookkeeping_triple.first();
                    final SubLObject arg3 = second(invalid_bookkeeping_triple);
                    final SubLObject arg4 = third(invalid_bookkeeping_triple);
                    if (NIL != unassert_bookkeeping_binary_gaf(pred2, arg3, arg4, $$BookkeepingMt)) {
                        count = add(count, ONE_INTEGER);
                        if (NIL == $silent_progressP$.getDynamicValue(thread)) {
                            format(T, $str88$__Killed___S__S__S___, new SubLObject[]{ pred2, arg3, arg4 });
                        }
                    } else {
                        format(T, $str89$__Could_not_kill___S__S__S___, new SubLObject[]{ pred2, arg3, arg4 });
                    }
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    invalid_bookkeeping_triple = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$2 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$2, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_16, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_15, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_14, thread);
            $last_percent_progress_index$.rebind(_prev_bind_13, thread);
            $progress_sofar$.rebind(_prev_bind_12, thread);
            $progress_total$.rebind(_prev_bind_11, thread);
            $progress_start_time$.rebind(_prev_bind_10, thread);
            $progress_note$.rebind(_prev_bind_9, thread);
        }
        return count;
    }

    public static SubLObject declare_bookkeeping_store_file() {
        declareFunction(me, "hl_assert_bookkeeping_binary_gaf", "HL-ASSERT-BOOKKEEPING-BINARY-GAF", 4, 0, false);
        declareFunction(me, "hl_unassert_bookkeeping_binary_gaf", "HL-UNASSERT-BOOKKEEPING-BINARY-GAF", 4, 0, false);
        declareFunction(me, "bookkeeping_predicate_hl_storage_module_applicableP", "BOOKKEEPING-PREDICATE-HL-STORAGE-MODULE-APPLICABLE?", 5, 0, false);
        declareFunction(me, "bookkeeping_predicate_hl_storage_module_incompleteness", "BOOKKEEPING-PREDICATE-HL-STORAGE-MODULE-INCOMPLETENESS", 5, 0, false);
        declareFunction(me, "bookkeeping_predicate_hl_storage_module_assert", "BOOKKEEPING-PREDICATE-HL-STORAGE-MODULE-ASSERT", 5, 0, false);
        declareFunction(me, "bookkeeping_predicate_hl_storage_module_unassert", "BOOKKEEPING-PREDICATE-HL-STORAGE-MODULE-UNASSERT", 3, 0, false);
        declareFunction(me, "my_creator_hl_storage_module_applicableP", "MY-CREATOR-HL-STORAGE-MODULE-APPLICABLE?", 5, 0, false);
        declareFunction(me, "my_creation_time_hl_storage_module_applicableP", "MY-CREATION-TIME-HL-STORAGE-MODULE-APPLICABLE?", 5, 0, false);
        declareFunction(me, "my_creation_purpose_hl_storage_module_applicableP", "MY-CREATION-PURPOSE-HL-STORAGE-MODULE-APPLICABLE?", 5, 0, false);
        declareFunction(me, "my_creation_second_hl_storage_module_applicableP", "MY-CREATION-SECOND-HL-STORAGE-MODULE-APPLICABLE?", 5, 0, false);
        declareFunction(me, "my_creation_date_hl_storage_module_applicableP", "MY-CREATION-DATE-HL-STORAGE-MODULE-APPLICABLE?", 5, 0, false);
        declareFunction(me, "my_creation_date_hl_storage_module_assert", "MY-CREATION-DATE-HL-STORAGE-MODULE-ASSERT", 5, 0, false);
        declareFunction(me, "my_creation_date_hl_storage_module_unassert", "MY-CREATION-DATE-HL-STORAGE-MODULE-UNASSERT", 3, 0, false);
        declareMacro(me, "do_bookkeeping_top_level_index", "DO-BOOKKEEPING-TOP-LEVEL-INDEX");
        declareFunction(me, "bookkeeping_predicates_for_hl_store", "BOOKKEEPING-PREDICATES-FOR-HL-STORE", 0, 0, false);
        declareFunction(me, "arg2_indexed_bookkeeping_predicates_for_hl_store", "ARG2-INDEXED-BOOKKEEPING-PREDICATES-FOR-HL-STORE", 0, 0, false);
        declareFunction(me, "arg2_indexed_bookkeeping_predP", "ARG2-INDEXED-BOOKKEEPING-PRED?", 1, 0, false);
        declareFunction(me, "new_bookkeeping_top_level_index", "NEW-BOOKKEEPING-TOP-LEVEL-INDEX", 1, 0, false);
        declareFunction(me, "bookkeeping_top_level_index_lookup", "BOOKKEEPING-TOP-LEVEL-INDEX-LOOKUP", 2, 0, false);
        declareFunction(me, "bookkeeping_top_level_index_insert", "BOOKKEEPING-TOP-LEVEL-INDEX-INSERT", 5, 0, false);
        declareFunction(me, "bookkeeping_top_level_index_delete", "BOOKKEEPING-TOP-LEVEL-INDEX-DELETE", 5, 0, false);
        declareFunction(me, "bookkeeping_top_level_index_count", "BOOKKEEPING-TOP-LEVEL-INDEX-COUNT", 1, 0, false);
        declareMacro(me, "do_bookkeeping_intermediate_index", "DO-BOOKKEEPING-INTERMEDIATE-INDEX");
        declareFunction(me, "new_bookkeeping_intermediate_index", "NEW-BOOKKEEPING-INTERMEDIATE-INDEX", 0, 0, false);
        declareFunction(me, "bookkeeping_intermediate_index_lookup", "BOOKKEEPING-INTERMEDIATE-INDEX-LOOKUP", 2, 0, false);
        declareFunction(me, "bookkeeping_intermediate_index_num_keys", "BOOKKEEPING-INTERMEDIATE-INDEX-NUM-KEYS", 1, 0, false);
        declareFunction(me, "bookkeeping_intermediate_index_set", "BOOKKEEPING-INTERMEDIATE-INDEX-SET", 3, 0, false);
        declareFunction(me, "bookkeeping_intermediate_index_push", "BOOKKEEPING-INTERMEDIATE-INDEX-PUSH", 3, 0, false);
        declareFunction(me, "bookkeeping_intermediate_index_delete_key", "BOOKKEEPING-INTERMEDIATE-INDEX-DELETE-KEY", 2, 0, false);
        declareFunction(me, "bookkeeping_intermediate_index_insert", "BOOKKEEPING-INTERMEDIATE-INDEX-INSERT", 4, 0, false);
        declareFunction(me, "bookkeeping_intermediate_index_delete", "BOOKKEEPING-INTERMEDIATE-INDEX-DELETE", 4, 0, false);
        declareFunction(me, "bookkeeping_intermediate_index_count", "BOOKKEEPING-INTERMEDIATE-INDEX-COUNT", 1, 0, false);
        declareFunction(me, "clear_bookkeeping_binary_gaf_store", "CLEAR-BOOKKEEPING-BINARY-GAF-STORE", 0, 0, false);
        declareFunction(me, "dumper_num_top_level_index", "DUMPER-NUM-TOP-LEVEL-INDEX", 0, 0, false);
        declareMacro(me, "dumper_do_bookkeeping_top_level_index", "DUMPER-DO-BOOKKEEPING-TOP-LEVEL-INDEX");
        declareFunction(me, "dumper_num_intermediate_index", "DUMPER-NUM-INTERMEDIATE-INDEX", 1, 0, false);
        declareMacro(me, "dumper_do_bookkeeping_intermediate_index", "DUMPER-DO-BOOKKEEPING-INTERMEDIATE-INDEX");
        declareFunction(me, "dumper_bookkeeping_binary_gaf_store", "DUMPER-BOOKKEEPING-BINARY-GAF-STORE", 0, 0, false);
        declareFunction(me, "dumper_clear_bookkeeping_binary_gaf_store", "DUMPER-CLEAR-BOOKKEEPING-BINARY-GAF-STORE", 0, 0, false);
        declareFunction(me, "dumper_load_bookkeeping_binary_gaf", "DUMPER-LOAD-BOOKKEEPING-BINARY-GAF", 3, 0, false);
        declareFunction(me, "dumper_dumpable_bookkeeping_index", "DUMPER-DUMPABLE-BOOKKEEPING-INDEX", 0, 0, false);
        declareFunction(me, "dumper_load_bookkeeping_index", "DUMPER-LOAD-BOOKKEEPING-INDEX", 1, 0, false);
        declareFunction(me, "bookkeeping_binary_gaf_store", "BOOKKEEPING-BINARY-GAF-STORE", 0, 0, false);
        declareFunction(me, "bookkeeping_binary_gaf_arg2_index", "BOOKKEEPING-BINARY-GAF-ARG2-INDEX", 0, 0, false);
        declareFunction(me, "assert_bookkeeping_binary_gaf", "ASSERT-BOOKKEEPING-BINARY-GAF", 4, 0, false);
        declareFunction(me, "assert_bookkeeping_binary_gaf_int", "ASSERT-BOOKKEEPING-BINARY-GAF-INT", 3, 0, false);
        declareFunction(me, "add_bookkeeping_binary_gaf_indices", "ADD-BOOKKEEPING-BINARY-GAF-INDICES", 3, 0, false);
        declareFunction(me, "unassert_bookkeeping_binary_gaf", "UNASSERT-BOOKKEEPING-BINARY-GAF", 4, 0, false);
        declareFunction(me, "unassert_bookkeeping_binary_gaf_int", "UNASSERT-BOOKKEEPING-BINARY-GAF-INT", 3, 0, false);
        declareFunction(me, "remove_bookkeeping_binary_gaf_indices", "REMOVE-BOOKKEEPING-BINARY-GAF-INDICES", 3, 0, false);
        declareFunction(me, "unassert_all_bookkeeping_gafs_on_term", "UNASSERT-ALL-BOOKKEEPING-GAFS-ON-TERM", 1, 0, false);
        declareFunction(me, "unassert_all_bookkeeping_gafs_for_pred", "UNASSERT-ALL-BOOKKEEPING-GAFS-FOR-PRED", 1, 0, false);
        declareFunction(me, "creator", "CREATOR", 1, 1, false);
        declareFunction(me, "creation_time", "CREATION-TIME", 1, 1, false);
        declareFunction(me, "creation_date", "CREATION-DATE", 1, 1, false);
        declareFunction(me, "creation_purpose", "CREATION-PURPOSE", 1, 1, false);
        declareFunction(me, "creation_second", "CREATION-SECOND", 1, 1, false);
        declareFunction(me, "created_when", "CREATED-WHEN", 1, 1, false);
        declareFunction(me, "creation_date_cycl", "CREATION-DATE-CYCL", 1, 0, false);
        declareFunction(me, "terms_created_by", "TERMS-CREATED-BY", 1, 1, false);
        declareFunction(me, "terms_created_for", "TERMS-CREATED-FOR", 1, 1, false);
        declareFunction(me, "num_terms_created_by", "NUM-TERMS-CREATED-BY", 1, 1, false);
        declareFunction(me, "num_terms_created_for", "NUM-TERMS-CREATED-FOR", 1, 1, false);
        declareFunction(me, "bookkeeping_asents_on_term", "BOOKKEEPING-ASENTS-ON-TERM", 1, 0, false);
        declareFunction(me, "bookkeeping_assertibles_on_term", "BOOKKEEPING-ASSERTIBLES-ON-TERM", 1, 0, false);
        declareFunction(me, "bookkeeping_hl_assertion_specs_on_term", "BOOKKEEPING-HL-ASSERTION-SPECS-ON-TERM", 1, 0, false);
        declareFunction(me, "bookkeeping_hl_assertibles_on_term", "BOOKKEEPING-HL-ASSERTIBLES-ON-TERM", 1, 0, false);
        declareFunction(me, "bookkeeping_asent_to_hl_assertion_spec", "BOOKKEEPING-ASENT-TO-HL-ASSERTION-SPEC", 1, 0, false);
        declareFunction(me, "bookkeeping_asent_to_hl_assertible", "BOOKKEEPING-ASENT-TO-HL-ASSERTIBLE", 1, 0, false);
        declareFunction(me, "bookkeeping_assertion_count", "BOOKKEEPING-ASSERTION-COUNT", 0, 0, false);
        declareFunction(me, "num_bookkeeping_binary_gafs_on_term", "NUM-BOOKKEEPING-BINARY-GAFS-ON-TERM", 1, 0, false);
        declareFunction(me, "any_bookkeeping_assertions_on_termP", "ANY-BOOKKEEPING-ASSERTIONS-ON-TERM?", 1, 0, false);
        declareMacro(me, "do_bookkeeping_assertions", "DO-BOOKKEEPING-ASSERTIONS");
        declareMacro(me, "do_bookkeeping_asents", "DO-BOOKKEEPING-ASENTS");
        declareFunction(me, "total_num_assertions_on_term", "TOTAL-NUM-ASSERTIONS-ON-TERM", 1, 0, false);
        declareFunction(me, "bookkeeping_asent_truth", "BOOKKEEPING-ASENT-TRUTH", 1, 0, false);
        declareFunction(me, "bookkeeping_assertion_truth", "BOOKKEEPING-ASSERTION-TRUTH", 3, 0, false);
        declareFunction(me, "indexed_terms_mentioned_in_bookkeeping_assertions_of_term", "INDEXED-TERMS-MENTIONED-IN-BOOKKEEPING-ASSERTIONS-OF-TERM", 1, 0, false);
        declareFunction(me, "why_not_bookkeeping_asent", "WHY-NOT-BOOKKEEPING-ASENT", 1, 0, false);
        declareFunction(me, "bookkeeping_fpred_value", "BOOKKEEPING-FPRED-VALUE", 2, 1, false);
        declareFunction(me, "bookkeeping_fpred_value_int", "BOOKKEEPING-FPRED-VALUE-INT", 2, 0, false);
        declareFunction(me, "bookkeeping_arg1_pred_values", "BOOKKEEPING-ARG1-PRED-VALUES", 2, 1, false);
        declareFunction(me, "bookkeeping_arg1_pred_values_int", "BOOKKEEPING-ARG1-PRED-VALUES-INT", 2, 0, false);
        declareFunction(me, "bookkeeping_arg1_assertion_count", "BOOKKEEPING-ARG1-ASSERTION-COUNT", 2, 1, false);
        declareFunction(me, "bookkeeping_arg1_assertion_count_int", "BOOKKEEPING-ARG1-ASSERTION-COUNT-INT", 2, 0, false);
        declareFunction(me, "reindex_all_bookkeeping_assertions", "REINDEX-ALL-BOOKKEEPING-ASSERTIONS", 0, 0, false);
        declareFunction(me, "reindex_all_bookkeeping_assertions_for_pred", "REINDEX-ALL-BOOKKEEPING-ASSERTIONS-FOR-PRED", 1, 0, false);
        declareFunction(me, "forget_invalid_bookkeeping_assertions", "FORGET-INVALID-BOOKKEEPING-ASSERTIONS", 0, 0, false);
        return NIL;
    }

    public static SubLObject init_bookkeeping_store_file() {
        deflexical("*BOOKKEEPING-PREDICATES-FOR-HL-STORE*", $list37);
        deflexical("*ARG2-INDEXED-BOOKKEEPING-PREDICATES-FOR-HL-STORE*", $list38);
        deflexical("*BOOKKEEPING-BINARY-GAF-STORE*", SubLTrampolineFile.maybeDefault($bookkeeping_binary_gaf_store$, $bookkeeping_binary_gaf_store$, () -> new_bookkeeping_top_level_index($bookkeeping_predicates_for_hl_store$.getGlobalValue())));
        deflexical("*BOOKKEEPING-BINARY-GAF-ARG2-INDEX*", SubLTrampolineFile.maybeDefault($sym45$_BOOKKEEPING_BINARY_GAF_ARG2_INDEX_, $bookkeeping_binary_gaf_arg2_index$, () -> new_bookkeeping_top_level_index($arg2_indexed_bookkeeping_predicates_for_hl_store$.getGlobalValue())));
        return NIL;
    }

    public static SubLObject setup_bookkeeping_store_file() {
        register_cyc_api_function(HL_ASSERT_BOOKKEEPING_BINARY_GAF, $list5, $str6$Assert__PRED_ARG1_ARG2__in_MT_to_, $list7, $list8);
        register_cyc_api_function(HL_UNASSERT_BOOKKEEPING_BINARY_GAF, $list5, $str10$Unassert__PRED_ARG1_ARG2__in_MT_f, $list7, $list8);
        hl_storage_modules.register_solely_specific_hl_storage_module_predicate($$myCreator);
        hl_storage_modules.hl_storage_module($MY_CREATOR, $list19);
        hl_storage_modules.register_solely_specific_hl_storage_module_predicate($$myCreationTime);
        hl_storage_modules.hl_storage_module($MY_CREATION_TIME, $list23);
        hl_storage_modules.register_solely_specific_hl_storage_module_predicate($$myCreationPurpose);
        hl_storage_modules.hl_storage_module($MY_CREATION_PURPOSE, $list27);
        hl_storage_modules.register_solely_specific_hl_storage_module_predicate($$myCreationSecond);
        hl_storage_modules.hl_storage_module($MY_CREATION_SECOND, $list31);
        hl_storage_modules.register_solely_specific_hl_storage_module_predicate($$myCreationDate);
        hl_storage_modules.hl_storage_module($MY_CREATION_DATE, $list35);
        declare_defglobal($bookkeeping_binary_gaf_store$);
        declare_defglobal($sym45$_BOOKKEEPING_BINARY_GAF_ARG2_INDEX_);
        register_cyc_api_function(CREATOR, $list52, $str53$Identify_the_cyclist_who_created_, $list54, $list55);
        register_cyc_api_function(CREATION_TIME, $list52, $str57$Identify_when_FORT_was_created_, $list54, $list58);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_bookkeeping_store_file();
    }

    @Override
    public void initializeVariables() {
        init_bookkeeping_store_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_bookkeeping_store_file();
    }

    
}

/**
 * Total time: 419 ms
 */
