package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$mapping_answer$;
import static com.cyc.cycjava.cycl.control_vars.$mapping_data_1$;
import static com.cyc.cycjava.cycl.control_vars.$mapping_data_2$;
import static com.cyc.cycjava.cycl.control_vars.$mapping_index_arg$;
import static com.cyc.cycjava.cycl.control_vars.$mapping_path$;
import static com.cyc.cycjava.cycl.control_vars.$mapping_pivot_arg$;
import static com.cyc.cycjava.cycl.control_vars.$mapping_pred$;
import static com.cyc.cycjava.cycl.control_vars.$mapping_target$;
import static com.cyc.cycjava.cycl.control_vars.$mapping_target_arg$;
import static com.cyc.cycjava.cycl.control_vars.within_askP;
import static com.cyc.cycjava.cycl.control_vars.within_assertP;
import static com.cyc.cycjava.cycl.el_utilities.arg_types_prescribe_unreifiedP;
import static com.cyc.cycjava.cycl.el_utilities.closedP;
import static com.cyc.cycjava.cycl.el_utilities.designated_mt;
import static com.cyc.cycjava.cycl.el_utilities.el_conjunction_p;
import static com.cyc.cycjava.cycl.el_utilities.el_disjunction_p;
import static com.cyc.cycjava.cycl.el_utilities.el_error;
import static com.cyc.cycjava.cycl.el_utilities.el_exception_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.el_formula_with_operator_p;
import static com.cyc.cycjava.cycl.el_utilities.el_implication_p;
import static com.cyc.cycjava.cycl.el_utilities.el_logical_operator_formula_p;
import static com.cyc.cycjava.cycl.el_utilities.formula_arityGE;
import static com.cyc.cycjava.cycl.el_utilities.genls_litP;
import static com.cyc.cycjava.cycl.el_utilities.holds_in_litP;
import static com.cyc.cycjava.cycl.el_utilities.isa_litP;
import static com.cyc.cycjava.cycl.el_utilities.literal_arg;
import static com.cyc.cycjava.cycl.el_utilities.literal_arg0;
import static com.cyc.cycjava.cycl.el_utilities.literal_arg1;
import static com.cyc.cycjava.cycl.el_utilities.literal_arg2;
import static com.cyc.cycjava.cycl.el_utilities.literal_args;
import static com.cyc.cycjava.cycl.el_utilities.literal_predicate;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.el_utilities.make_el_literal;
import static com.cyc.cycjava.cycl.el_utilities.mt_designating_literalP;
import static com.cyc.cycjava.cycl.el_utilities.possibly_naut_p;
import static com.cyc.cycjava.cycl.el_utilities.predicate_specP;
import static com.cyc.cycjava.cycl.el_utilities.scoped_vars;
import static com.cyc.cycjava.cycl.el_utilities.scoping_relation_expressionP;
import static com.cyc.cycjava.cycl.el_utilities.sentence_free_variables;
import static com.cyc.cycjava.cycl.el_utilities.sequence_var;
import static com.cyc.cycjava.cycl.utilities_macros.$is_noting_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_elapsed_seconds_for_notification$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_last_pacification_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_notification_count$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_pacifications_since_last_nl$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$silent_progressP$;
import static com.cyc.cycjava.cycl.utilities_macros.$suppress_all_progress_faster_than_seconds$;
import static com.cyc.cycjava.cycl.utilities_macros.note_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nconc;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eql;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.apply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numGE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.delete_if;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.remove;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.booleanp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.function_spec_p;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.integerp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.listp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.sublisp_null;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.resetMultipleValues;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeInteger;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeKeyword;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeString;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeSymbol;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.cdestructuring_bind_error;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.destructuring_bind_must_consp;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cadr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.cddr;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.second;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.set_difference;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.inference.modules.removal.removal_modules_genlpreds_lookup;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_time_modules;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ZeroArityFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile; 
 public final class arg_type extends SubLTranslatedFile {
    public static final SubLFile me = new arg_type();

    public static final String myName = "com.cyc.cycjava.cycl.arg_type";

    public static final String myFingerPrint = "a2cc20e96c305bec09d5ce6083f739898b4e893fe0cb3e19cd976e2a2161b0af";

    // defparameter
    /**
     * dynamic variable to work around the lack of 'ignore-this' arguments to cached
     * functions
     */
    private static final SubLSymbol $relation_arg_ok_argnum$ = makeSymbol("*RELATION-ARG-OK-ARGNUM*");

    // deflexical
    private static final SubLSymbol $cached_relation_arg_okP_caching_state$ = makeSymbol("*CACHED-RELATION-ARG-OK?-CACHING-STATE*");

    // deflexical
    private static final SubLSymbol $cached_format_okP_caching_state$ = makeSymbol("*CACHED-FORMAT-OK?-CACHING-STATE*");

    // defconstant
    public static final SubLSymbol $dtp_arg_constraint$ = makeSymbol("*DTP-ARG-CONSTRAINT*");

    // defparameter
    private static final SubLSymbol $arg_constraint_struct_printing_verboseP$ = makeSymbol("*ARG-CONSTRAINT-STRUCT-PRINTING-VERBOSE?*");



    private static final SubLObject $$forAll = reader_make_constant_shell(makeString("forAll"));

    private static final SubLObject $$thereExists = reader_make_constant_shell(makeString("thereExists"));

    private static final SubLSymbol $INHIBITED_SEQUENCE_VARIABLE = makeKeyword("INHIBITED-SEQUENCE-VARIABLE");

    public static final SubLSymbol $sym3$CACHED_RELATION_ARG_OK_ = makeSymbol("CACHED-RELATION-ARG-OK?");

    public static final SubLSymbol $sym4$_CACHED_RELATION_ARG_OK__CACHING_STATE_ = makeSymbol("*CACHED-RELATION-ARG-OK?-CACHING-STATE*");

    private static final SubLInteger $int$1024 = makeInteger(1024);

    public static final SubLSymbol $sym6$CLEAR_CACHED_RELATION_ARG_OK_ = makeSymbol("CLEAR-CACHED-RELATION-ARG-OK?");

    private static final SubLList $list7 = list(reader_make_constant_shell(makeString("Quote")), reader_make_constant_shell(makeString("QuasiQuote")));

    private static final SubLObject $$not = reader_make_constant_shell(makeString("not"));

    private static final SubLObject $$ist = reader_make_constant_shell(makeString("ist"));

    private static final SubLObject $$termOfUnit = reader_make_constant_shell(makeString("termOfUnit"));



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLSymbol $sym13$_EXIT = makeSymbol("%EXIT");



    private static final SubLSymbol $NOT_ISA_DISJOINT = makeKeyword("NOT-ISA-DISJOINT");

    private static final SubLSymbol $NOT_QUOTED_ISA_DISJOINT = makeKeyword("NOT-QUOTED-ISA-DISJOINT");



    private static final SubLSymbol $NOT_GENLS_DISJOINT = makeKeyword("NOT-GENLS-DISJOINT");













    private static final SubLSymbol POSSIBLY_NAUT_P = makeSymbol("POSSIBLY-NAUT-P");



    private static final SubLSymbol $sym27$VARIABLE_TERM_WRT_ARG_TYPE_ = makeSymbol("VARIABLE-TERM-WRT-ARG-TYPE?");





    private static final SubLObject $$Collection = reader_make_constant_shell(makeString("Collection"));

    private static final SubLObject $$CollectionDenotingFunction = reader_make_constant_shell(makeString("CollectionDenotingFunction"));

    private static final SubLObject $$Thing = reader_make_constant_shell(makeString("Thing"));







    private static final SubLObject $$genls = reader_make_constant_shell(makeString("genls"));

    private static final SubLObject $$Quote = reader_make_constant_shell(makeString("Quote"));

    private static final SubLList $list38 = list(makeKeyword("ISA"), makeKeyword("NOT-ISA-DISJOINT"));

    private static final SubLList $list39 = list(makeKeyword("GENLS"), makeKeyword("NOT-GENLS-DISJOINT"));

    private static final SubLString $str40$invalid_at_test__s_in_mal_intra_a = makeString("invalid at test ~s in mal-intra-arg?");

    private static final SubLString $str41$invalid_at_test__s_in_mal_inter_a = makeString("invalid at test ~s in mal-inter-arg?");

    private static final SubLSymbol $sym42$MEMOIZED_DEFINING_MTS_OK_ = makeSymbol("MEMOIZED-DEFINING-MTS-OK?");

    private static final SubLString $str43$__at_test_fails___s_in__s_fails__ = makeString("~%at test fails: ~s in ~s fails #$definingMt constraint: ~s");

    private static final SubLSymbol $DEFINING_MT_VIOLATION = makeKeyword("DEFINING-MT-VIOLATION");



    private static final SubLSymbol $ANTI_SYMMETRIC_PREDICATE = makeKeyword("ANTI-SYMMETRIC-PREDICATE");



    private static final SubLSymbol $ANTI_TRANSITIVE_PREDICATE = makeKeyword("ANTI-TRANSITIVE-PREDICATE");





    private static final SubLString $str51$unknown_predicate_constraint___s = makeString("unknown predicate constraint: ~s");

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    private static final SubLObject $$AsymmetricBinaryPredicate = reader_make_constant_shell(makeString("AsymmetricBinaryPredicate"));



    private static final SubLList $list55 = list(makeKeyword("PREDICATE-EXTENT"), makeKeyword("GAF-ARG"));

    private static final SubLSymbol $AT_MAPPING_DONE = makeKeyword("AT-MAPPING-DONE");



    private static final SubLSymbol SELECT_ASYMMETRIC_PRED_VIOLATION = makeSymbol("SELECT-ASYMMETRIC-PRED-VIOLATION");



    private static final SubLString $$$Ignore_it = makeString("Ignore it");

    private static final SubLString $str61$Unexpected_index_type_when_gather = makeString("Unexpected index type when gathering asymmetric violations");

    private static final SubLObject $$AntiSymmetricBinaryPredicate = reader_make_constant_shell(makeString("AntiSymmetricBinaryPredicate"));

    private static final SubLObject $$IrreflexiveBinaryPredicate = reader_make_constant_shell(makeString("IrreflexiveBinaryPredicate"));

    private static final SubLSymbol $kw64$COMPLETES_CYCLE_ = makeKeyword("COMPLETES-CYCLE?");

    private static final SubLSymbol $kw65$WHY_COMPLETES_CYCLE_ = makeKeyword("WHY-COMPLETES-CYCLE?");

    private static final SubLObject $$TransitiveBinaryPredicate = reader_make_constant_shell(makeString("TransitiveBinaryPredicate"));

    private static final SubLObject $$AntiTransitiveBinaryPredicate = reader_make_constant_shell(makeString("AntiTransitiveBinaryPredicate"));

    private static final SubLSymbol SELECT_ANTI_TRANSITIVE_PRED_VIOLATION_VIA_PRED = makeSymbol("SELECT-ANTI-TRANSITIVE-PRED-VIOLATION-VIA-PRED");

    private static final SubLList $list69 = list(makeSymbol("*MAPPING-INDEX-ARG*"), makeSymbol("*MAPPING-PIVOT-ARG*"), makeSymbol("*MAPPING-TARGET-ARG*"));

    private static final SubLSymbol SEARCH_FOR_ANTI_TRANSITIVE_PRED_VIOLATION = makeSymbol("SEARCH-FOR-ANTI-TRANSITIVE-PRED-VIOLATION");

    private static final SubLList $list71 = list(list(ONE_INTEGER, TWO_INTEGER, ONE_INTEGER), list(TWO_INTEGER, ONE_INTEGER, TWO_INTEGER), list(ONE_INTEGER, ONE_INTEGER, TWO_INTEGER));

    private static final SubLList $list72 = list(list(ONE_INTEGER, TWO_INTEGER, ONE_INTEGER), list(TWO_INTEGER, ONE_INTEGER, TWO_INTEGER), list(TWO_INTEGER, TWO_INTEGER, ONE_INTEGER));

    private static final SubLSymbol SELECT_ANTI_TRANSITIVE_PRED_VIOLATION = makeSymbol("SELECT-ANTI-TRANSITIVE-PRED-VIOLATION");

    private static final SubLSymbol $sym74$UNREIFIED_SKOLEM_TERM_ = makeSymbol("UNREIFIED-SKOLEM-TERM?");







    private static final SubLObject $$negationPreds = reader_make_constant_shell(makeString("negationPreds"));

    private static final SubLObject $$negationInverse = reader_make_constant_shell(makeString("negationInverse"));

    private static final SubLSymbol $sym80$CACHED_FORMAT_OK_ = makeSymbol("CACHED-FORMAT-OK?");

    private static final SubLSymbol $sym81$_CACHED_FORMAT_OK__CACHING_STATE_ = makeSymbol("*CACHED-FORMAT-OK?-CACHING-STATE*");

    private static final SubLInteger $int$128 = makeInteger(128);

    private static final SubLSymbol $sym83$MEMOIZED_FORMAT_OK_ = makeSymbol("MEMOIZED-FORMAT-OK?");

    private static final SubLObject $$SingleEntry = reader_make_constant_shell(makeString("SingleEntry"));

    private static final SubLObject $$IntervalEntry = reader_make_constant_shell(makeString("IntervalEntry"));

    private static final SubLObject $$SetTheFormat = reader_make_constant_shell(makeString("SetTheFormat"));

    private static final SubLObject $$singleEntryFormatInArgs = reader_make_constant_shell(makeString("singleEntryFormatInArgs"));

    private static final SubLObject $$intervalEntryFormatInArgs = reader_make_constant_shell(makeString("intervalEntryFormatInArgs"));

    private static final SubLObject $$openEntryFormatInArgs = reader_make_constant_shell(makeString("openEntryFormatInArgs"));

    private static final SubLObject $const90$temporallyIntersectingEntryFormat = reader_make_constant_shell(makeString("temporallyIntersectingEntryFormatInArgs"));

    private static final SubLObject $const91$spatiallyIntersectingEntryFormatI = reader_make_constant_shell(makeString("spatiallyIntersectingEntryFormatInArgs"));

    private static final SubLObject $const92$spatioTemporallyIntersectingEntry = reader_make_constant_shell(makeString("spatioTemporallyIntersectingEntryFormatInArgs"));

    private static final SubLString $str93$unknown_entry_format___s = makeString("unknown entry format: ~s");

    private static final SubLObject $$IndeterminateTerm = reader_make_constant_shell(makeString("IndeterminateTerm"));

    private static final SubLObject $$natFunction = reader_make_constant_shell(makeString("natFunction"));

    private static final SubLObject $$natArgument = reader_make_constant_shell(makeString("natArgument"));



    private static final SubLList $list98 = list(makeSymbol("NEG-LITS"), makeSymbol("POS-LITS"));

    private static final SubLSymbol ARG_CONSTRAINT = makeSymbol("ARG-CONSTRAINT");

    private static final SubLSymbol ARG_CONSTRAINT_P = makeSymbol("ARG-CONSTRAINT-P");

    private static final SubLList $list101 = list(makeSymbol("SENTENCE"), makeSymbol("MT"), makeSymbol("TEST-FUNCTION"), makeSymbol("TEST-ARGS"), makeSymbol("CLOSED?"), makeSymbol("ATOMIC?"));

    private static final SubLList $list102 = list(makeKeyword("SENTENCE"), makeKeyword("MT"), makeKeyword("TEST-FUNCTION"), makeKeyword("TEST-ARGS"), makeKeyword("CLOSED?"), makeKeyword("ATOMIC?"));

    private static final SubLList $list103 = list(makeSymbol("ARGCONST-SENTENCE"), makeSymbol("ARGCONST-MT"), makeSymbol("ARGCONST-TEST-FUNCTION"), makeSymbol("ARGCONST-TEST-ARGS"), makeSymbol("ARGCONST-CLOSED?"), makeSymbol("ARGCONST-ATOMIC?"));

    private static final SubLList $list104 = list(makeSymbol("_CSETF-ARGCONST-SENTENCE"), makeSymbol("_CSETF-ARGCONST-MT"), makeSymbol("_CSETF-ARGCONST-TEST-FUNCTION"), makeSymbol("_CSETF-ARGCONST-TEST-ARGS"), makeSymbol("_CSETF-ARGCONST-CLOSED?"), makeSymbol("_CSETF-ARGCONST-ATOMIC?"));

    private static final SubLSymbol PRINT_ARG_CONSTRAINT = makeSymbol("PRINT-ARG-CONSTRAINT");

    private static final SubLSymbol ARG_CONSTRAINT_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("ARG-CONSTRAINT-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list107 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("ARG-CONSTRAINT-P"));

    private static final SubLSymbol ARGCONST_SENTENCE = makeSymbol("ARGCONST-SENTENCE");

    private static final SubLSymbol _CSETF_ARGCONST_SENTENCE = makeSymbol("_CSETF-ARGCONST-SENTENCE");

    private static final SubLSymbol ARGCONST_MT = makeSymbol("ARGCONST-MT");

    private static final SubLSymbol _CSETF_ARGCONST_MT = makeSymbol("_CSETF-ARGCONST-MT");

    private static final SubLSymbol ARGCONST_TEST_FUNCTION = makeSymbol("ARGCONST-TEST-FUNCTION");

    private static final SubLSymbol _CSETF_ARGCONST_TEST_FUNCTION = makeSymbol("_CSETF-ARGCONST-TEST-FUNCTION");

    private static final SubLSymbol ARGCONST_TEST_ARGS = makeSymbol("ARGCONST-TEST-ARGS");

    private static final SubLSymbol _CSETF_ARGCONST_TEST_ARGS = makeSymbol("_CSETF-ARGCONST-TEST-ARGS");

    private static final SubLSymbol $sym116$ARGCONST_CLOSED_ = makeSymbol("ARGCONST-CLOSED?");

    private static final SubLSymbol $sym117$_CSETF_ARGCONST_CLOSED_ = makeSymbol("_CSETF-ARGCONST-CLOSED?");

    private static final SubLSymbol $sym118$ARGCONST_ATOMIC_ = makeSymbol("ARGCONST-ATOMIC?");

    private static final SubLSymbol $sym119$_CSETF_ARGCONST_ATOMIC_ = makeSymbol("_CSETF-ARGCONST-ATOMIC?");













    private static final SubLString $str126$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_ARG_CONSTRAINT = makeSymbol("MAKE-ARG-CONSTRAINT");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_ARG_CONSTRAINT_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-ARG-CONSTRAINT-METHOD");

    private static final SubLString $str132$__a_ARG_CONSTRAINT__a__a__a__a_ = makeString("<~a ARG-CONSTRAINT:~a:~a:~a:~a>");

    private static final SubLString $str133$_ARG_CONSTRAINT__a__a_ = makeString("<ARG-CONSTRAINT:~a:~a>");

    private static final SubLString $$$GAF = makeString("GAF");

    private static final SubLString $$$GNAF = makeString("GNAF");

    private static final SubLString $$$OAF = makeString("OAF");

    private static final SubLString $$$ONAF = makeString("ONAF");



    private static final SubLSymbol $sym139$ISA_ = makeSymbol("ISA?");

    private static final SubLSymbol $sym140$GENLS_ = makeSymbol("GENLS?");

    private static final SubLSymbol SORTED_ARG_CONSTRAINT_PREDICATES = makeSymbol("SORTED-ARG-CONSTRAINT-PREDICATES");

    private static final SubLList $list142 = list(reader_make_constant_shell(makeString("argIsa")), reader_make_constant_shell(makeString("argGenl")));

    private static final SubLObject $$ArgTypePredicate = reader_make_constant_shell(makeString("ArgTypePredicate"));

    private static final SubLSymbol NO_PREDICATE_EXTENT_P = makeSymbol("NO-PREDICATE-EXTENT-P");

    private static final SubLObject $$ArgConstraintPredicate = reader_make_constant_shell(makeString("ArgConstraintPredicate"));

    private static final SubLSymbol $sorted_arg_constraint_predicates_caching_state$ = makeSymbol("*SORTED-ARG-CONSTRAINT-PREDICATES-CACHING-STATE*");







    private static final SubLObject $$Relation = reader_make_constant_shell(makeString("Relation"));

    private static final SubLObject $$argIsa = reader_make_constant_shell(makeString("argIsa"));

    private static final SubLObject $$argGenl = reader_make_constant_shell(makeString("argGenl"));

    public static SubLObject at_gaf_assertionP(final SubLObject assertion) {
        return makeBoolean((NIL != assertions_high.gaf_assertionP(assertion)) && (NIL == assertion_utilities.excepted_assertionP(assertion, NIL, NIL)));
    }

    public static SubLObject formula_args_ok_wrt_typeP(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != mt_designating_literalP(formula)) {
            return mt_literal_args_ok_wrt_typeP(formula, mt);
        }
        return formula_args_ok_wrt_type_intP(formula, mt);
    }

    public static SubLObject why_not_formula_args_ok_wrt_typeP(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        wff.reset_wff_state();
        final SubLObject _prev_bind_0 = wff_vars.$wff_formula$.currentBinding(thread);
        final SubLObject _prev_bind_2 = wff_vars.$wff_original_formula$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$noting_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_5 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
        final SubLObject _prev_bind_6 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
        try {
            wff_vars.$wff_formula$.bind(formula, thread);
            wff_vars.$wff_original_formula$.bind((NIL != wff_macros.within_wffP()) && (NIL != wff_vars.wff_original_formula()) ? wff_vars.wff_original_formula() : formula, thread);
            at_vars.$noting_at_violationsP$.bind(T, thread);
            at_vars.$accumulating_at_violationsP$.bind(T, thread);
            wff_vars.$noting_wff_violationsP$.bind(T, thread);
            wff_vars.$accumulating_wff_violationsP$.bind(T, thread);
            formula_args_ok_wrt_typeP(formula, mt);
        } finally {
            wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_6, thread);
            wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_5, thread);
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_4, thread);
            at_vars.$noting_at_violationsP$.rebind(_prev_bind_3, thread);
            wff_vars.$wff_original_formula$.rebind(_prev_bind_2, thread);
            wff_vars.$wff_formula$.rebind(_prev_bind_0, thread);
        }
        return nreverse(at_vars.$at_violations$.getDynamicValue(thread));
    }

    public static SubLObject mt_literal_args_ok_wrt_typeP(final SubLObject literal, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt_arg = cycl_utilities.reify_when_closed_naut(designated_mt(literal));
        if (NIL != hlmt.hlmtP(mt_arg)) {
            return formula_args_ok_wrt_type_intP(literal, mt_arg);
        }
        if (NIL == cycl_variables.cyc_varP(mt_arg)) {
            return formula_args_ok_wrt_type_intP(literal, mt);
        }
        if (NIL != within_askP()) {
            return T;
        }
        if (NIL != within_assertP()) {
            return formula_args_ok_wrt_type_intP(literal, mt_relevance_macros.$mt$.getDynamicValue(thread));
        }
        return formula_args_ok_wrt_type_intP(literal, mt);
    }

    public static SubLObject seqvars_inhibited_by_relation_expression(final SubLObject relation) {
        if (((NIL != scoping_relation_expressionP(relation)) && (NIL == el_formula_with_operator_p(relation, $$forAll))) && (NIL == el_formula_with_operator_p(relation, $$thereExists))) {
            return scoped_vars(relation, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject new_inhibited_seqvars(final SubLObject relation) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return append(czer_vars.$variables_that_cannot_be_sequence_variables$.getDynamicValue(thread), seqvars_inhibited_by_relation_expression(relation));
    }

    public static SubLObject at_considering_atomic_sentence_p() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((((NIL == at_vars.$appraising_disjunctP$.getDynamicValue(thread)) && (NIL == at_vars.$within_functionP$.getDynamicValue(thread))) && (NIL == at_vars.$within_predicateP$.getDynamicValue(thread))) && (NIL == czer_utilities.within_negationP()));
    }

    public static SubLObject formula_args_ok_wrt_type_intP(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject args = cycl_utilities.formula_args(formula, UNPROVIDED);
        final SubLObject seqvar = sequence_var(formula, UNPROVIDED);
        SubLObject okP = T;
        SubLObject doneP = NIL;
        final SubLObject _prev_bind_0 = at_vars.$fag_search_limit$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$at_argnum$.currentBinding(thread);
        try {
            at_vars.$fag_search_limit$.bind(at_vars.$at_gaf_search_limit$.getDynamicValue(thread), thread);
            at_vars.$at_argnum$.bind(ZERO_INTEGER, thread);
            final SubLObject groundP = sublisp_null(sentence_free_variables(formula, UNPROVIDED, UNPROVIDED, UNPROVIDED));
            final SubLObject _prev_bind_0_$1 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
            final SubLObject _prev_bind_1_$2 = at_vars.$at_check_relator_constraintsP$.currentBinding(thread);
            final SubLObject _prev_bind_3 = at_vars.$at_formula$.currentBinding(thread);
            final SubLObject _prev_bind_4 = at_vars.$at_reln$.currentBinding(thread);
            final SubLObject _prev_bind_5 = czer_vars.$variables_that_cannot_be_sequence_variables$.currentBinding(thread);
            try {
                at_vars.$at_check_arg_formatP$.bind(NIL != at_vars.$at_check_arg_formatP$.getDynamicValue(thread) ? (((NIL != at_vars.$appraising_disjunctP$.getDynamicValue(thread)) || (NIL != at_vars.$within_functionP$.getDynamicValue(thread))) || (NIL != at_vars.$within_predicateP$.getDynamicValue(thread))) || (NIL != czer_utilities.within_negationP()) ? NIL : groundP : NIL, thread);
                at_vars.$at_check_relator_constraintsP$.bind(NIL != at_vars.$at_check_relator_constraintsP$.getDynamicValue(thread) ? (((NIL != at_vars.$appraising_disjunctP$.getDynamicValue(thread)) || (NIL != at_vars.$within_functionP$.getDynamicValue(thread))) || (NIL != at_vars.$within_predicateP$.getDynamicValue(thread))) || (NIL != czer_utilities.within_negationP()) ? NIL : groundP : NIL, thread);
                at_vars.$at_formula$.bind(formula, thread);
                at_vars.$at_reln$.bind(cycl_utilities.reify_when_closed_naut(cycl_utilities.formula_arg0(formula)), thread);
                czer_vars.$variables_that_cannot_be_sequence_variables$.bind(new_inhibited_seqvars(formula), thread);
                if (NIL != subl_promotions.memberP(seqvar, czer_vars.$variables_that_cannot_be_sequence_variables$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                    wff.note_wff_violation(list($INHIBITED_SEQUENCE_VARIABLE, seqvar, formula));
                    okP = NIL;
                }
                if (NIL != forts.fort_p(at_vars.$at_reln$.getDynamicValue(thread))) {
                    okP = makeBoolean(((NIL != defining_mts_okP(at_vars.$at_reln$.getDynamicValue(thread), mt)) && (NIL != relator_constraints_okP(formula, UNPROVIDED))) && (NIL != okP));
                    doneP = at_utilities.at_finishedP(makeBoolean(NIL == okP));
                    final SubLObject _prev_bind_0_$2 = czer_vars.$distributing_meta_knowledgeP$.currentBinding(thread);
                    try {
                        czer_vars.$distributing_meta_knowledgeP$.bind(czer_utilities.distributing_meta_predP(at_vars.$at_reln$.getDynamicValue(thread)), thread);
                        if (NIL == doneP) {
                            SubLObject csome_list_var = args;
                            SubLObject arg = NIL;
                            arg = csome_list_var.first();
                            while ((NIL == doneP) && (NIL != csome_list_var)) {
                                at_vars.$at_argnum$.setDynamicValue(add(at_vars.$at_argnum$.getDynamicValue(thread), ONE_INTEGER), thread);
                                final SubLObject _prev_bind_0_$3 = czer_vars.$within_negationP$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$3 = at_vars.$within_functionP$.currentBinding(thread);
                                final SubLObject _prev_bind_2_$6 = at_vars.$within_predicateP$.currentBinding(thread);
                                final SubLObject _prev_bind_3_$7 = at_vars.$within_disjunctionP$.currentBinding(thread);
                                final SubLObject _prev_bind_4_$8 = wff_utilities.$check_arityP$.currentBinding(thread);
                                final SubLObject _prev_bind_6 = at_vars.$at_check_arg_typesP$.currentBinding(thread);
                                final SubLObject _prev_bind_7 = at_vars.$at_check_defining_mtsP$.currentBinding(thread);
                                final SubLObject _prev_bind_8 = at_vars.$appraising_disjunctP$.currentBinding(thread);
                                final SubLObject _prev_bind_9 = at_vars.$within_decontextualizedP$.currentBinding(thread);
                                try {
                                    czer_vars.$within_negationP$.bind(at_within_negationP(at_vars.$at_reln$.getDynamicValue(thread), at_vars.$at_argnum$.getDynamicValue(thread)), thread);
                                    at_vars.$within_functionP$.bind(at_within_functionP(at_vars.$at_reln$.getDynamicValue(thread)), thread);
                                    at_vars.$within_predicateP$.bind(at_within_predicateP(at_vars.$at_reln$.getDynamicValue(thread)), thread);
                                    at_vars.$within_disjunctionP$.bind(at_within_disjunctP(formula, at_vars.$at_argnum$.getDynamicValue(thread)), thread);
                                    wff_utilities.$check_arityP$.bind(wff.check_arityP(at_vars.$at_reln$.getDynamicValue(thread), at_vars.$at_argnum$.getDynamicValue(thread)), thread);
                                    at_vars.$at_check_arg_typesP$.bind(at_check_arg_typesP(at_vars.$at_reln$.getDynamicValue(thread), at_vars.$at_argnum$.getDynamicValue(thread), mt), thread);
                                    at_vars.$at_check_defining_mtsP$.bind(at_check_defining_mtsP(formula, at_vars.$at_argnum$.getDynamicValue(thread)), thread);
                                    at_vars.$appraising_disjunctP$.bind(appraising_disjunctP(formula, mt), thread);
                                    at_vars.$within_decontextualizedP$.bind(at_within_decontextualizedP(formula), thread);
                                    okP = makeBoolean((NIL != relation_arg_okP(at_vars.$at_reln$.getDynamicValue(thread), arg, at_vars.$at_argnum$.getDynamicValue(thread), at_utilities.arg_type_mt(at_vars.$at_reln$.getDynamicValue(thread), args, at_vars.$at_argnum$.getDynamicValue(thread), mt))) && (NIL != okP));
                                } finally {
                                    at_vars.$within_decontextualizedP$.rebind(_prev_bind_9, thread);
                                    at_vars.$appraising_disjunctP$.rebind(_prev_bind_8, thread);
                                    at_vars.$at_check_defining_mtsP$.rebind(_prev_bind_7, thread);
                                    at_vars.$at_check_arg_typesP$.rebind(_prev_bind_6, thread);
                                    wff_utilities.$check_arityP$.rebind(_prev_bind_4_$8, thread);
                                    at_vars.$within_disjunctionP$.rebind(_prev_bind_3_$7, thread);
                                    at_vars.$within_predicateP$.rebind(_prev_bind_2_$6, thread);
                                    at_vars.$within_functionP$.rebind(_prev_bind_1_$3, thread);
                                    czer_vars.$within_negationP$.rebind(_prev_bind_0_$3, thread);
                                }
                                doneP = at_utilities.at_finishedP(makeBoolean(NIL == okP));
                                csome_list_var = csome_list_var.rest();
                                arg = csome_list_var.first();
                            } 
                        }
                    } finally {
                        czer_vars.$distributing_meta_knowledgeP$.rebind(_prev_bind_0_$2, thread);
                    }
                }
            } finally {
                czer_vars.$variables_that_cannot_be_sequence_variables$.rebind(_prev_bind_5, thread);
                at_vars.$at_reln$.rebind(_prev_bind_4, thread);
                at_vars.$at_formula$.rebind(_prev_bind_3, thread);
                at_vars.$at_check_relator_constraintsP$.rebind(_prev_bind_1_$2, thread);
                at_vars.$at_check_arg_formatP$.rebind(_prev_bind_0_$1, thread);
            }
        } finally {
            at_vars.$at_argnum$.rebind(_prev_bind_2, thread);
            at_vars.$fag_search_limit$.rebind(_prev_bind_0, thread);
        }
        return okP;
    }

    public static SubLObject relation_arg_okP(final SubLObject relation, final SubLObject arg, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != wff_macros.within_wffP()) && (NIL != fort_types_interface.logical_connective_p(relation))) {
            return T;
        }
        SubLObject okP = NIL;
        final SubLObject _prev_bind_0 = wff_vars.$permit_keyword_variablesP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = wff_vars.$permit_generic_arg_variablesP$.currentBinding(thread);
        try {
            wff_vars.$permit_keyword_variablesP$.bind(makeBoolean((NIL != wff_vars.$permit_keyword_variablesP$.getDynamicValue(thread)) || (NIL != czer_utilities.arg_permits_keyword_variablesP(relation, argnum, mt))), thread);
            wff_vars.$permit_generic_arg_variablesP$.bind(makeBoolean((NIL != wff_vars.$permit_generic_arg_variablesP$.getDynamicValue(thread)) || (NIL != czer_utilities.arg_permits_generic_arg_variablesP(relation, argnum, mt))), thread);
            if (NIL != variable_wrt_arg_typeP(arg)) {
                okP = variable_arg_okP(relation, arg, argnum, mt);
            }
            if (NIL == okP) {
                okP = relation_arg_ok_intP(relation, arg, argnum, mt);
            }
        } finally {
            wff_vars.$permit_generic_arg_variablesP$.rebind(_prev_bind_2, thread);
            wff_vars.$permit_keyword_variablesP$.rebind(_prev_bind_0, thread);
        }
        return okP;
    }

    public static SubLObject clear_cached_relation_arg_okP() {
        final SubLObject cs = $cached_relation_arg_okP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_cached_relation_arg_okP(final SubLObject relation, final SubLObject arg, final SubLObject argnum, final SubLObject mt, final SubLObject mt_info, final SubLObject at_parameter_state) {
        return memoization_state.caching_state_remove_function_results_with_args($cached_relation_arg_okP_caching_state$.getGlobalValue(), list(relation, arg, argnum, mt, mt_info, at_parameter_state), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cached_relation_arg_okP_internal(final SubLObject relation, final SubLObject arg, final SubLObject argnum, final SubLObject mt, final SubLObject mt_info, final SubLObject at_parameter_state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return relation_arg_ok_intP(relation, arg, $relation_arg_ok_argnum$.getDynamicValue(thread), mt);
    }

    public static SubLObject cached_relation_arg_okP(final SubLObject relation, final SubLObject arg, final SubLObject argnum, final SubLObject mt, final SubLObject mt_info, final SubLObject at_parameter_state) {
        SubLObject caching_state = $cached_relation_arg_okP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym3$CACHED_RELATION_ARG_OK_, $sym4$_CACHED_RELATION_ARG_OK__CACHING_STATE_, $int$1024, EQUAL, SIX_INTEGER, ZERO_INTEGER);
            memoization_state.register_hl_store_cache_clear_callback($sym6$CLEAR_CACHED_RELATION_ARG_OK_);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_6(relation, arg, argnum, mt, mt_info, at_parameter_state);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (relation.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (arg.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (argnum.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (mt.equal(cached_args.first())) {
                                cached_args = cached_args.rest();
                                if (mt_info.equal(cached_args.first())) {
                                    cached_args = cached_args.rest();
                                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && at_parameter_state.equal(cached_args.first())) {
                                        return memoization_state.caching_results(results2);
                                    }
                                }
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(resetMultipleValues(), multiple_value_list(cached_relation_arg_okP_internal(relation, arg, argnum, mt, mt_info, at_parameter_state)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(relation, arg, argnum, mt, mt_info, at_parameter_state));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject relation_arg_ok_intP(final SubLObject relation, final SubLObject arg, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject okP = NIL;
        final SubLObject _prev_bind_0 = at_vars.$at_reln$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$at_arg$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$at_argnum$.currentBinding(thread);
        try {
            at_vars.$at_reln$.bind(relation, thread);
            at_vars.$at_arg$.bind(arg, thread);
            at_vars.$at_argnum$.bind(argnum, thread);
            okP = defining_mts_okP(arg, mt);
            if (NIL == at_utilities.at_finishedP(makeBoolean(NIL == okP))) {
                if (NIL != list_utilities.member_kbeqP(relation, $list7)) {
                    okP = T;
                } else
                    if (NIL != tou_wrt_arg_typeP(arg)) {
                        okP = makeBoolean((NIL != tou_arg_okP(arg, argnum)) && (NIL != okP));
                    } else
                        if (NIL != weak_fort_wrt_arg_typeP(arg)) {
                            okP = makeBoolean((NIL != weak_fort_arg_okP(relation, arg, argnum, mt)) && (NIL != okP));
                        } else
                            if (NIL != lenient_fort_wrt_arg_typeP(arg)) {
                                okP = makeBoolean((NIL != lenient_fort_arg_okP(relation, arg, argnum, mt)) && (NIL != okP));
                            } else
                                if (NIL != nat_function_wrt_arg_typeP(arg)) {
                                    okP = makeBoolean((NIL != nat_function_arg_okP(arg, argnum)) && (NIL != okP));
                                } else
                                    if (NIL != nat_argument_wrt_arg_typeP(arg)) {
                                        okP = makeBoolean((NIL != nat_argument_arg_okP(arg, argnum)) && (NIL != okP));
                                    } else
                                        if (NIL != naut_wrt_arg_typeP(arg, mt)) {
                                            okP = makeBoolean((NIL != naut_arg_okP(relation, arg, argnum, mt)) && (NIL != okP));
                                        } else
                                            if (NIL != strong_fort_wrt_arg_typeP(arg, UNPROVIDED)) {
                                                okP = makeBoolean((NIL != strong_fort_arg_okP(relation, arg, argnum, mt)) && (NIL != okP));
                                            } else {
                                                okP = makeBoolean((NIL != opaque_arg_okP(relation, arg, argnum, mt)) && (NIL != okP));
                                            }







            }
        } finally {
            at_vars.$at_argnum$.rebind(_prev_bind_3, thread);
            at_vars.$at_arg$.rebind(_prev_bind_2, thread);
            at_vars.$at_reln$.rebind(_prev_bind_0, thread);
        }
        return okP;
    }

    public static SubLObject at_within_negationP(final SubLObject formula_arg0, final SubLObject arg) {
        return formula_arg0.eql($$not) || ((NIL != at_utilities.implication_opP(formula_arg0)) && arg.eql(ONE_INTEGER)) ? makeBoolean(NIL == czer_utilities.within_negationP()) : czer_utilities.within_negationP();
    }

    public static SubLObject at_within_predicateP(final SubLObject formula_arg0) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($$ist.eql(formula_arg0)) {
            return NIL;
        }
        return makeBoolean((NIL != at_vars.$within_predicateP$.getDynamicValue(thread)) || (NIL != predicate_specP(formula_arg0, UNPROVIDED)));
    }

    public static SubLObject at_within_functionP(SubLObject formula_arg0) {
        if (formula_arg0 == UNPROVIDED) {
            formula_arg0 = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != at_vars.$within_functionP$.getDynamicValue(thread)) || (NIL != fort_types_interface.functorP(formula_arg0)));
    }

    public static SubLObject at_check_arg_typesP(SubLObject relation, SubLObject argnum, SubLObject mt) {
        if (relation == UNPROVIDED) {
            relation = NIL;
        }
        if (argnum == UNPROVIDED) {
            argnum = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != at_vars.$at_check_arg_typesP$.getDynamicValue(thread)) && (((NIL == czer_utilities.expression_argP(relation, argnum, mt)) || (NIL == czer_utilities.askable_expression_argP(relation, argnum, mt))) || (NIL != czer_utilities.assertible_expression_argP(relation, argnum, mt))));
    }

    public static SubLObject at_check_defining_mtsP(final SubLObject formula, final SubLObject argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != at_vars.$at_possibly_check_defining_mtsP$.getDynamicValue(thread)) && (NIL != at_vars.at_check_arg_types_p())) {
            final SubLObject relation = cycl_utilities.formula_arg0(formula);
            if (NIL == forts.fort_p(relation)) {
                return T;
            }
            if (NIL == kb_accessors.quoted_argumentP(relation, argnum)) {
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject appraising_disjunctP(final SubLObject formula, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != at_vars.$relax_arg_constraints_for_disjunctionsP$.getDynamicValue(thread)) && (NIL == czer_utilities.reifiable_function_termP(formula, mt))) {
            return makeBoolean((NIL != at_vars.$appraising_disjunctP$.getDynamicValue(thread)) || (NIL != czer_utilities.within_disjunctionP()));
        }
        return NIL;
    }

    public static SubLObject at_within_disjunctP(final SubLObject formula, final SubLObject argnum) {
        return makeBoolean((NIL != czer_utilities.within_disjunctionP()) || ((NIL != formula_arityGE(formula, TWO_INTEGER, UNPROVIDED)) && (NIL != (NIL != czer_utilities.within_negationP() ? makeBoolean((NIL != el_conjunction_p(formula)) || ((NIL != el_implication_p(formula)) && argnum.eql(ONE_INTEGER))) : makeBoolean((((NIL != el_disjunction_p(formula)) || (NIL != el_implication_p(formula))) || (NIL != holds_in_litP(formula))) || (NIL != el_exception_p(formula)))))));
    }

    public static SubLObject appraising_disjunct_cnfP(final SubLObject cnf) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != at_vars.$relax_arg_constraints_for_disjunctionsP$.getDynamicValue(thread)) {
            return makeBoolean((NIL != at_vars.$appraising_disjunctP$.getDynamicValue(thread)) || ((NIL != clauses.pos_lits(cnf)) && (NIL != clauses.neg_lits(cnf))));
        }
        return NIL;
    }

    public static SubLObject at_within_decontextualizedP(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != at_vars.$within_decontextualizedP$.getDynamicValue(thread)) || (NIL != kb_accessors.decontextualized_literalP(formula)));
    }

    public static SubLObject variable_arg_okP(final SubLObject relation, final SubLObject arg, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (relation.eql($$termOfUnit)) {
            return tou_arg_okP(arg, argnum);
        }
        if ((NIL == term.first_order_nautP(arg)) || (NIL != term.unreified_skolem_termP(arg))) {
            return T;
        }
        if (NIL != naut_arg_okP(relation, arg, argnum, mt)) {
            return T;
        }
        return NIL;
    }

    public static SubLObject weak_fort_arg_okP(final SubLObject relation, final SubLObject arg, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return weak_fort_types_okP(relation, arg, argnum, mt);
    }

    public static SubLObject lenient_fort_arg_okP(final SubLObject relation, final SubLObject arg, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return lenient_fort_types_okP(relation, arg, argnum, mt);
    }

    public static SubLObject naut_arg_okP(final SubLObject relation, final SubLObject arg, final SubLObject argnum, final SubLObject mt) {
        SubLObject okP = naut_functor_okP(arg, mt);
        if (NIL != okP) {
            okP = naut_args_okP(arg, mt);
        } else
            if (NIL == at_utilities.at_finishedP(T)) {
                naut_args_okP(arg, mt);
            }

        if (NIL != okP) {
            okP = naut_arg_types_okP(relation, arg, argnum, mt);
        } else
            if (NIL == at_utilities.at_finishedP(T)) {
                naut_arg_types_okP(relation, arg, argnum, mt);
            }

        return okP;
    }

    public static SubLObject at_nat_okP(final SubLObject nat, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        SubLObject okP = nat_functor_okP(nat, mt);
        if (NIL != okP) {
            okP = nat_args_okP(nat, mt);
        } else
            if (NIL == at_utilities.at_finishedP(T)) {
                nat_args_okP(nat, mt);
            }

        return okP;
    }

    public static SubLObject nat_functor_okP(final SubLObject nat, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != nart_handles.nart_p(nat)) {
            return naut_functor_okP(narts_high.nart_hl_formula(nat), mt);
        }
        return naut_functor_okP(nat, mt);
    }

    public static SubLObject nat_args_okP(final SubLObject nat, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != nart_handles.nart_p(nat)) {
            return naut_args_okP(narts_high.nart_hl_formula(nat), mt);
        }
        return naut_args_okP(nat, mt);
    }

    public static SubLObject nart_or_reify_forward_nautP(final SubLObject v_object, final SubLObject mt) {
        return makeBoolean((NIL != nart_handles.nart_p(v_object)) || (((NIL != kb_control_vars.within_forward_inferenceP()) && (NIL != possibly_naut_p(v_object))) && (NIL != kb_accessors.skolemize_forwardP(cycl_utilities.nat_functor(v_object), mt))));
    }

    public static SubLObject tou_arg_okP(final SubLObject nat, final SubLObject argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (argnum.eql(ONE_INTEGER)) {
            if (NIL != nart_handles.nart_p(nat)) {
                return T;
            }
            if (NIL != cycl_variables.cyc_varP(nat)) {
                return makeBoolean(((NIL != within_askP()) || (NIL != czer_utilities.within_disjunctionP())) || (NIL != at_vars.$appraising_disjunctP$.getDynamicValue(thread)));
            }
            if (NIL != term.nautP(nat, UNPROVIDED)) {
                return tou_naut_okP(nat);
            }
        } else
            if (argnum.eql(TWO_INTEGER)) {
                if (NIL != term.nautP(nat, UNPROVIDED)) {
                    return tou_naut_okP(nat);
                }
                if (NIL != cycl_variables.cyc_varP(nat)) {
                    return makeBoolean(((NIL != within_askP()) || (NIL != czer_utilities.within_disjunctionP())) || (NIL != at_vars.$appraising_disjunctP$.getDynamicValue(thread)));
                }
            }

        return NIL;
    }

    public static SubLObject nat_function_arg_okP(final SubLObject arg, final SubLObject argnum) {
        if (argnum.eql(ONE_INTEGER)) {
            if (NIL != nart_handles.nart_p(arg)) {
                return T;
            }
            if (NIL != cycl_variables.cyc_varP(arg)) {
                return T;
            }
            if (NIL != term.nautP(arg, UNPROVIDED)) {
                return tou_naut_okP(arg);
            }
        } else
            if (argnum.eql(TWO_INTEGER)) {
                if (NIL != cycl_variables.cyc_varP(arg)) {
                    return T;
                }
                if (NIL != czer_utilities.reifiable_functorP(arg, UNPROVIDED)) {
                    return T;
                }
            }

        return NIL;
    }

    public static SubLObject nat_argument_arg_okP(final SubLObject arg, final SubLObject argnum) {
        if (argnum.eql(ONE_INTEGER)) {
            if (NIL != nart_handles.nart_p(arg)) {
                return T;
            }
            if (NIL != cycl_variables.cyc_varP(arg)) {
                return T;
            }
            if (NIL != term.nautP(arg, UNPROVIDED)) {
                return tou_naut_okP(arg);
            }
        } else {
            if (argnum.eql(TWO_INTEGER)) {
                return collection_defns.cyc_non_negative_integer(arg);
            }
            if (argnum.eql(THREE_INTEGER)) {
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject tou_naut_okP(final SubLObject naut) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject functor = cycl_utilities.nat_functor(naut);
        SubLObject okP = cycl_variables.cyc_varP(functor);
        if (NIL == okP) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                okP = czer_utilities.reifiable_functorP(cycl_utilities.nat_functor(naut), UNPROVIDED);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return okP;
    }

    public static SubLObject strong_fort_arg_okP(final SubLObject relation, final SubLObject arg, final SubLObject argnum, final SubLObject mt) {
        return strong_fort_arg_types_okP(relation, arg, argnum, mt);
    }

    public static SubLObject opaque_arg_okP(final SubLObject relation, final SubLObject arg, final SubLObject argnum, final SubLObject mt) {
        return opaque_arg_types_okP(relation, arg, argnum, mt);
    }

    public static SubLObject naut_functor_okP(final SubLObject naut, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != term.function_termP(naut)) {
            final SubLObject okP = T;
            final SubLObject functor = cycl_utilities.nat_functor(naut);
            if (NIL != at_vars.$at_check_fn_symbolP$.getDynamicValue(thread)) {
                if (NIL != forts.fort_p(functor)) {
                    return T;
                }
                if (NIL != term.nautP(functor, UNPROVIDED)) {
                    return makeBoolean((NIL != naut_functor_okP(functor, mt)) && (NIL != naut_args_okP(functor, mt)));
                }
            }
            return okP;
        }
        return NIL;
    }

    public static SubLObject naut_args_okP(final SubLObject naut, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (NIL != term.function_termP(naut)) {
            return naut_args_ok_wrt_typeP(naut, mt);
        }
        return NIL;
    }

    public static SubLObject naut_args_ok_wrt_typeP(final SubLObject naut, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == at_vars.at_check_arg_types_p()) {
            return T;
        }
        if (NIL != term.function_termP(naut)) {
            SubLObject okP = NIL;
            final SubLObject _prev_bind_0 = wff_vars.$recognize_variablesP$.currentBinding(thread);
            try {
                wff_vars.$recognize_variablesP$.bind(T, thread);
                okP = formula_args_ok_wrt_typeP(naut, mt);
            } finally {
                wff_vars.$recognize_variablesP$.rebind(_prev_bind_0, thread);
            }
            return okP;
        }
        return NIL;
    }

    public static SubLObject weak_fort_types_okP(final SubLObject reln, final SubLObject arg, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
        try {
            at_vars.$at_check_arg_formatP$.bind(NIL, thread);
            return lenient_fort_types_okP(reln, arg, argnum, mt);
        } finally {
            at_vars.$at_check_arg_formatP$.rebind(_prev_bind_0, thread);
        }
    }

    public static SubLObject lenient_fort_types_okP(final SubLObject reln, final SubLObject arg, final SubLObject argnum, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject isa_okP = makeBoolean(NIL == at_vars.$at_check_not_isa_disjointP$.getDynamicValue(thread));
        SubLObject quoted_isa_okP = makeBoolean(NIL == at_vars.$at_check_not_quoted_isa_disjointP$.getDynamicValue(thread));
        SubLObject not_isa_okP = makeBoolean(NIL == at_vars.$at_check_arg_not_isaP$.getDynamicValue(thread));
        SubLObject genls_okP = makeBoolean(NIL == at_vars.$at_check_not_genls_disjointP$.getDynamicValue(thread));
        SubLObject not_genls_okP = makeBoolean(NIL == at_vars.$at_check_inter_arg_not_genlP$.getDynamicValue(thread));
        SubLObject genl_isa_okP = makeBoolean(NIL == at_vars.$at_check_inter_arg_genl_isaP$.getDynamicValue(thread));
        SubLObject isa_genl_okP = makeBoolean(NIL == at_vars.$at_check_inter_arg_isa_genlP$.getDynamicValue(thread));
        SubLObject different_okP = makeBoolean(NIL == at_vars.$at_check_inter_arg_differentP$.getDynamicValue(thread));
        SubLObject format_okP = makeBoolean(NIL == at_vars.$at_check_arg_formatP$.getDynamicValue(thread));
        final SubLObject nat = (NIL != arg_types_prescribe_unreifiedP(reln, argnum)) ? NIL : cycl_utilities.find_closed_naut(arg);
        final SubLObject admit_consistent_fortP = makeBoolean((NIL != wff_vars.wff_lenientP()) || ((NIL != at_vars.$at_admit_consistent_nartsP$.getDynamicValue(thread)) && (NIL != nart_handles.nart_p(arg))));
        if (NIL != nart_handles.nart_p(nat)) {
            return relation_arg_okP(reln, nat, argnum, mt);
        }
        if (((((((((NIL == isa_okP) || (NIL == quoted_isa_okP)) || (NIL == not_isa_okP)) || (NIL == genls_okP)) || (NIL == not_genls_okP)) || (NIL == genl_isa_okP)) || (NIL == isa_genl_okP)) || (NIL == different_okP)) || (NIL == format_okP)) {
            final SubLObject _prev_bind_0 = at_vars.$noting_at_violationsP$.currentBinding(thread);
            final SubLObject _prev_bind_2 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
            final SubLObject _prev_bind_3 = wff_vars.$noting_wff_violationsP$.currentBinding(thread);
            final SubLObject _prev_bind_4 = wff_vars.$accumulating_wff_violationsP$.currentBinding(thread);
            try {
                at_vars.$noting_at_violationsP$.bind(NIL, thread);
                at_vars.$accumulating_at_violationsP$.bind(NIL, thread);
                wff_vars.$noting_wff_violationsP$.bind(NIL, thread);
                wff_vars.$accumulating_wff_violationsP$.bind(NIL, thread);
                if (NIL != strong_fort_arg_types_okP(reln, arg, argnum, mt)) {
                    return T;
                }
            } finally {
                wff_vars.$accumulating_wff_violationsP$.rebind(_prev_bind_4, thread);
                wff_vars.$noting_wff_violationsP$.rebind(_prev_bind_3, thread);
                at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_2, thread);
                at_vars.$noting_at_violationsP$.rebind(_prev_bind_0, thread);
            }
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_5 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_6 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_7 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            final SubLObject _prev_bind_8 = at_vars.$at_arg_type$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                at_vars.$at_arg_type$.bind($WEAK_FORT, thread);
                if (NIL == isa_okP) {
                    if ((NIL != admit_consistent_fortP) || (NIL != isa.isa(arg, mt, UNPROVIDED))) {
                        isa_okP = arg_test_okP(reln, arg, argnum, $NOT_ISA_DISJOINT);
                    } else {
                        final SubLObject _prev_bind_0_$9 = at_vars.$at_check_arg_quoted_isaP$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$10 = at_vars.$at_check_arg_genlsP$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$11 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
                        try {
                            at_vars.$at_check_arg_quoted_isaP$.bind(NIL, thread);
                            at_vars.$at_check_arg_genlsP$.bind(NIL, thread);
                            at_vars.$at_check_arg_formatP$.bind(NIL, thread);
                            isa_okP = opaque_arg_types_okP(reln, arg, argnum, mt);
                        } finally {
                            at_vars.$at_check_arg_formatP$.rebind(_prev_bind_2_$11, thread);
                            at_vars.$at_check_arg_genlsP$.rebind(_prev_bind_1_$10, thread);
                            at_vars.$at_check_arg_quoted_isaP$.rebind(_prev_bind_0_$9, thread);
                        }
                    }
                }
                if ((NIL == at_utilities.at_finishedP(makeBoolean(NIL == isa_okP))) && (NIL == quoted_isa_okP)) {
                    if ((NIL != admit_consistent_fortP) || (NIL != isa.quoted_isa(arg, mt, UNPROVIDED))) {
                        quoted_isa_okP = arg_test_okP(reln, arg, argnum, $NOT_QUOTED_ISA_DISJOINT);
                    } else {
                        final SubLObject _prev_bind_0_$10 = at_vars.$at_check_arg_isaP$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$11 = at_vars.$at_check_arg_genlsP$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$12 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
                        try {
                            at_vars.$at_check_arg_isaP$.bind(NIL, thread);
                            at_vars.$at_check_arg_genlsP$.bind(NIL, thread);
                            at_vars.$at_check_arg_formatP$.bind(NIL, thread);
                            quoted_isa_okP = opaque_arg_types_okP(reln, arg, argnum, mt);
                        } finally {
                            at_vars.$at_check_arg_formatP$.rebind(_prev_bind_2_$12, thread);
                            at_vars.$at_check_arg_genlsP$.rebind(_prev_bind_1_$11, thread);
                            at_vars.$at_check_arg_isaP$.rebind(_prev_bind_0_$10, thread);
                        }
                    }
                }
                if ((NIL == at_utilities.at_finishedP(makeBoolean((NIL == isa_okP) || (NIL == quoted_isa_okP)))) && (NIL == not_isa_okP)) {
                    not_isa_okP = arg_test_okP(reln, arg, argnum, $NOT_ISA);
                }
                if ((NIL == at_utilities.at_finishedP(makeBoolean(((NIL == isa_okP) || (NIL == quoted_isa_okP)) || (NIL == not_isa_okP)))) && (NIL == genls_okP)) {
                    if ((NIL != admit_consistent_fortP) || (NIL != genls.genls(arg, mt, UNPROVIDED))) {
                        genls_okP = arg_test_okP(reln, arg, argnum, $NOT_GENLS_DISJOINT);
                    } else {
                        genls_okP = arg_test_okP(reln, arg, argnum, $GENLS);
                    }
                }
                if ((NIL == at_utilities.at_finishedP(makeBoolean((((NIL == isa_okP) || (NIL == quoted_isa_okP)) || (NIL == not_isa_okP)) || (NIL == genls_okP)))) && (NIL == not_genls_okP)) {
                    not_genls_okP = arg_test_okP(reln, arg, argnum, $NOT_GENLS);
                }
                if ((NIL == at_utilities.at_finishedP(makeBoolean(((((NIL == isa_okP) || (NIL == quoted_isa_okP)) || (NIL == not_isa_okP)) || (NIL == genls_okP)) || (NIL == not_genls_okP)))) && (NIL == genl_isa_okP)) {
                    genl_isa_okP = arg_test_okP(reln, arg, argnum, $GENL_ISA);
                }
                if ((NIL == at_utilities.at_finishedP(makeBoolean((((((NIL == isa_okP) || (NIL == quoted_isa_okP)) || (NIL == not_isa_okP)) || (NIL == genls_okP)) || (NIL == not_genls_okP)) || (NIL == genl_isa_okP)))) && (NIL == isa_genl_okP)) {
                    isa_genl_okP = arg_test_okP(reln, arg, argnum, $ISA_GENL);
                }
                if ((NIL == at_utilities.at_finishedP(makeBoolean(((((((NIL == isa_okP) || (NIL == quoted_isa_okP)) || (NIL == not_isa_okP)) || (NIL == genls_okP)) || (NIL == not_genls_okP)) || (NIL == genl_isa_okP)) || (NIL == isa_genl_okP)))) && (NIL == different_okP)) {
                    different_okP = arg_test_okP(reln, arg, argnum, $DIFFERENT);
                }
                if ((NIL == at_utilities.at_finishedP(makeBoolean((((((((NIL == isa_okP) || (NIL == quoted_isa_okP)) || (NIL == not_isa_okP)) || (NIL == genls_okP)) || (NIL == not_genls_okP)) || (NIL == genl_isa_okP)) || (NIL == isa_genl_okP)) || (NIL == different_okP)))) && (NIL == format_okP)) {
                    format_okP = arg_test_okP(reln, arg, argnum, $FORMAT);
                }
            } finally {
                at_vars.$at_arg_type$.rebind(_prev_bind_8, thread);
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_7, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_6, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_5, thread);
            }
        }
        return makeBoolean(((((((((NIL != isa_okP) && (NIL != quoted_isa_okP)) && (NIL != not_isa_okP)) && (NIL != genls_okP)) && (NIL != not_genls_okP)) && (NIL != genl_isa_okP)) && (NIL != isa_genl_okP)) && (NIL != different_okP)) && (NIL != format_okP));
    }

    public static SubLObject naut_arg_types_okP(final SubLObject reln, final SubLObject arg, final SubLObject argnum, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != possibly_naut_p(arg) : "el_utilities.possibly_naut_p(arg) " + "CommonSymbols.NIL != el_utilities.possibly_naut_p(arg) " + arg;
        if (NIL != at_vars.$at_admit_consistent_nautsP$.getDynamicValue(thread)) {
            return naut_arg_types_consistentP(reln, arg, argnum, mt);
        }
        return naut_arg_types_trueP(reln, arg, argnum, mt);
    }

    public static SubLObject naut_arg_types_consistentP(final SubLObject reln, final SubLObject arg, final SubLObject argnum, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject isa_okP = makeBoolean(NIL == at_vars.$at_check_not_isa_disjointP$.getDynamicValue(thread));
        SubLObject quoted_isa_okP = makeBoolean(NIL == at_vars.$at_check_not_quoted_isa_disjointP$.getDynamicValue(thread));
        SubLObject not_isa_okP = makeBoolean(NIL == at_vars.$at_check_arg_not_isaP$.getDynamicValue(thread));
        SubLObject genls_okP = makeBoolean(NIL == at_vars.$at_check_not_genls_disjointP$.getDynamicValue(thread));
        SubLObject not_genls_okP = makeBoolean(NIL == at_vars.$at_check_inter_arg_not_genlP$.getDynamicValue(thread));
        SubLObject genl_isa_okP = makeBoolean(NIL == at_vars.$at_check_inter_arg_genl_isaP$.getDynamicValue(thread));
        SubLObject isa_genl_okP = makeBoolean(NIL == at_vars.$at_check_inter_arg_isa_genlP$.getDynamicValue(thread));
        SubLObject different_okP = makeBoolean(NIL == at_vars.$at_check_inter_arg_differentP$.getDynamicValue(thread));
        SubLObject format_okP = makeBoolean(NIL == at_vars.$at_check_arg_formatP$.getDynamicValue(thread));
        SubLObject functor = cycl_utilities.nat_functor(arg);
        final SubLObject nat = (NIL != arg_types_prescribe_unreifiedP(reln, argnum)) ? NIL : cycl_utilities.find_closed_naut(arg);
        if (NIL != nart_handles.nart_p(nat)) {
            return relation_arg_okP(reln, nat, argnum, mt);
        }
        if (((((((((NIL == isa_okP) || (NIL == quoted_isa_okP)) || (NIL == not_isa_okP)) || (NIL == genls_okP)) || (NIL == not_genls_okP)) || (NIL == genl_isa_okP)) || (NIL == isa_genl_okP)) || (NIL == different_okP)) || (NIL == format_okP)) {
            if (!functor.isAtom()) {
                functor = narts_high.nart_substitute(functor);
            }
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            final SubLObject _prev_bind_4 = at_vars.$at_arg_type$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
                at_vars.$at_arg_type$.bind($NAUT, thread);
                if (NIL == isa_okP) {
                    if (((NIL != kb_accessors.result_isaP(functor, mt)) || (NIL != kb_accessors.result_isa_argP(functor, mt))) || (NIL != kb_accessors.result_isa_arg_arg_isaP(arg, mt))) {
                        isa_okP = arg_test_okP(reln, arg, argnum, $NOT_ISA_DISJOINT);
                    } else {
                        final SubLObject _prev_bind_0_$15 = at_vars.$at_check_arg_quoted_isaP$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$16 = at_vars.$at_check_arg_genlsP$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$17 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
                        try {
                            at_vars.$at_check_arg_quoted_isaP$.bind(NIL, thread);
                            at_vars.$at_check_arg_genlsP$.bind(NIL, thread);
                            at_vars.$at_check_arg_formatP$.bind(NIL, thread);
                            isa_okP = opaque_arg_types_okP(reln, arg, argnum, UNPROVIDED);
                        } finally {
                            at_vars.$at_check_arg_formatP$.rebind(_prev_bind_2_$17, thread);
                            at_vars.$at_check_arg_genlsP$.rebind(_prev_bind_1_$16, thread);
                            at_vars.$at_check_arg_quoted_isaP$.rebind(_prev_bind_0_$15, thread);
                        }
                    }
                }
                if ((NIL == at_utilities.at_finishedP(makeBoolean(NIL == isa_okP))) && (NIL == quoted_isa_okP)) {
                    if (((NIL != czer_utilities.reifiable_functorP(functor, mt)) || (NIL != kb_accessors.evaluation_result_quoted_isaP(functor, mt))) || (NIL != kb_accessors.result_quoted_isaP(functor, mt))) {
                        quoted_isa_okP = arg_test_okP(reln, arg, argnum, $NOT_QUOTED_ISA_DISJOINT);
                    } else {
                        final SubLObject _prev_bind_0_$16 = at_vars.$at_check_arg_isaP$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$17 = at_vars.$at_check_arg_genlsP$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$18 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
                        try {
                            at_vars.$at_check_arg_isaP$.bind(NIL, thread);
                            at_vars.$at_check_arg_genlsP$.bind(NIL, thread);
                            at_vars.$at_check_arg_formatP$.bind(NIL, thread);
                            quoted_isa_okP = opaque_arg_types_okP(reln, arg, argnum, UNPROVIDED);
                        } finally {
                            at_vars.$at_check_arg_formatP$.rebind(_prev_bind_2_$18, thread);
                            at_vars.$at_check_arg_genlsP$.rebind(_prev_bind_1_$17, thread);
                            at_vars.$at_check_arg_isaP$.rebind(_prev_bind_0_$16, thread);
                        }
                    }
                }
                if ((NIL == at_utilities.at_finishedP(makeBoolean((NIL == isa_okP) || (NIL == quoted_isa_okP)))) && (NIL == not_isa_okP)) {
                    not_isa_okP = arg_test_okP(reln, arg, argnum, $NOT_ISA);
                }
                if ((NIL == at_utilities.at_finishedP(makeBoolean(((NIL == isa_okP) || (NIL == quoted_isa_okP)) || (NIL == not_isa_okP)))) && (NIL == genls_okP)) {
                    if (NIL != cycl_utilities.expression_find_if($sym27$VARIABLE_TERM_WRT_ARG_TYPE_, arg, UNPROVIDED, UNPROVIDED)) {
                        genls_okP = T;
                    } else {
                        genls_okP = arg_test_okP(reln, arg, argnum, $NOT_GENLS_DISJOINT);
                    }
                }
                if ((NIL == at_utilities.at_finishedP(makeBoolean((((NIL == isa_okP) || (NIL == quoted_isa_okP)) || (NIL == not_isa_okP)) || (NIL == genls_okP)))) && (NIL == not_genls_okP)) {
                    not_genls_okP = arg_test_okP(reln, arg, argnum, $NOT_GENLS);
                }
                if ((NIL == at_utilities.at_finishedP(makeBoolean(((((NIL == isa_okP) || (NIL == quoted_isa_okP)) || (NIL == not_isa_okP)) || (NIL == genls_okP)) || (NIL == not_genls_okP)))) && (NIL == genl_isa_okP)) {
                    genl_isa_okP = arg_test_okP(reln, arg, argnum, $GENL_ISA);
                }
                if ((NIL == at_utilities.at_finishedP(makeBoolean((((((NIL == isa_okP) || (NIL == quoted_isa_okP)) || (NIL == not_isa_okP)) || (NIL == genls_okP)) || (NIL == not_genls_okP)) || (NIL == genl_isa_okP)))) && (NIL == isa_genl_okP)) {
                    isa_genl_okP = arg_test_okP(reln, arg, argnum, $NOT_GENLS);
                }
                if ((NIL == at_utilities.at_finishedP(makeBoolean(((((((NIL == isa_okP) || (NIL == quoted_isa_okP)) || (NIL == not_isa_okP)) || (NIL == genls_okP)) || (NIL == not_genls_okP)) || (NIL == genl_isa_okP)) || (NIL == isa_genl_okP)))) && (NIL == different_okP)) {
                    different_okP = arg_test_okP(reln, arg, argnum, $DIFFERENT);
                }
                if ((NIL == at_utilities.at_finishedP(makeBoolean((((((((NIL == isa_okP) || (NIL == quoted_isa_okP)) || (NIL == not_isa_okP)) || (NIL == genls_okP)) || (NIL == not_genls_okP)) || (NIL == genl_isa_okP)) || (NIL == isa_genl_okP)) || (NIL == different_okP)))) && (NIL == format_okP)) {
                    format_okP = arg_test_okP(reln, arg, argnum, $FORMAT);
                }
            } finally {
                at_vars.$at_arg_type$.rebind(_prev_bind_4, thread);
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return makeBoolean(((((((((NIL != isa_okP) && (NIL != quoted_isa_okP)) && (NIL != not_isa_okP)) && (NIL != genls_okP)) && (NIL != not_genls_okP)) && (NIL != genl_isa_okP)) && (NIL != isa_genl_okP)) && (NIL != different_okP)) && (NIL != format_okP));
    }

    public static SubLObject naut_arg_types_trueP(final SubLObject reln, final SubLObject arg, final SubLObject argnum, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject isa_okP = makeBoolean(NIL == at_vars.$at_check_arg_isaP$.getDynamicValue(thread));
        SubLObject quoted_isa_okP = makeBoolean(NIL == at_vars.$at_check_arg_quoted_isaP$.getDynamicValue(thread));
        SubLObject not_isa_okP = makeBoolean(NIL == at_vars.$at_check_arg_not_isaP$.getDynamicValue(thread));
        SubLObject genls_okP = makeBoolean(NIL == at_vars.$at_check_arg_genlsP$.getDynamicValue(thread));
        SubLObject not_genls_okP = makeBoolean(NIL == at_vars.$at_check_inter_arg_not_genlP$.getDynamicValue(thread));
        SubLObject genl_isa_okP = makeBoolean(NIL == at_vars.$at_check_inter_arg_genl_isaP$.getDynamicValue(thread));
        SubLObject isa_genl_okP = makeBoolean(NIL == at_vars.$at_check_inter_arg_isa_genlP$.getDynamicValue(thread));
        SubLObject different_okP = makeBoolean(NIL == at_vars.$at_check_inter_arg_differentP$.getDynamicValue(thread));
        SubLObject format_okP = makeBoolean(NIL == at_vars.$at_check_arg_formatP$.getDynamicValue(thread));
        SubLObject functor = cycl_utilities.nat_functor(arg);
        final SubLObject nat = (NIL == arg_types_prescribe_unreifiedP(reln, argnum)) ? NIL : cycl_utilities.find_closed_naut(arg);
        if (NIL != nart_handles.nart_p(nat)) {
            return relation_arg_okP(reln, nat, argnum, mt);
        }
        if (((((((((NIL == isa_okP) || (NIL == quoted_isa_okP)) || (NIL == not_isa_okP)) || (NIL == genls_okP)) || (NIL == not_genls_okP)) || (NIL == genl_isa_okP)) || (NIL == isa_genl_okP)) || (NIL == different_okP)) || (NIL == format_okP)) {
            if (!functor.isAtom()) {
                functor = narts_high.nart_substitute(functor);
            }
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            final SubLObject _prev_bind_4 = at_vars.$at_arg_type$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
                at_vars.$at_arg_type$.bind($NAUT, thread);
                if (NIL == isa_okP) {
                    if (((NIL != kb_accessors.result_isaP(functor, mt)) || (NIL != kb_accessors.result_isa_argP(functor, mt))) || (NIL != kb_accessors.result_isa_arg_arg_isaP(arg, mt))) {
                        isa_okP = arg_test_okP(reln, arg, argnum, $ISA);
                    } else {
                        final SubLObject _prev_bind_0_$21 = at_vars.$at_check_arg_quoted_isaP$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$22 = at_vars.$at_check_arg_genlsP$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$23 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
                        try {
                            at_vars.$at_check_arg_quoted_isaP$.bind(NIL, thread);
                            at_vars.$at_check_arg_genlsP$.bind(NIL, thread);
                            at_vars.$at_check_arg_formatP$.bind(NIL, thread);
                            isa_okP = opaque_arg_types_okP(reln, arg, argnum, UNPROVIDED);
                        } finally {
                            at_vars.$at_check_arg_formatP$.rebind(_prev_bind_2_$23, thread);
                            at_vars.$at_check_arg_genlsP$.rebind(_prev_bind_1_$22, thread);
                            at_vars.$at_check_arg_quoted_isaP$.rebind(_prev_bind_0_$21, thread);
                        }
                    }
                }
                if ((NIL == at_utilities.at_finishedP(makeBoolean(NIL == isa_okP))) && (NIL == quoted_isa_okP)) {
                    if ((NIL != kb_accessors.evaluation_result_quoted_isaP(functor, mt)) || (NIL != kb_accessors.result_quoted_isaP(functor, mt))) {
                        quoted_isa_okP = arg_test_okP(reln, arg, argnum, $QUOTED_ISA);
                    } else {
                        final SubLObject _prev_bind_0_$22 = at_vars.$at_check_arg_isaP$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$23 = at_vars.$at_check_arg_genlsP$.currentBinding(thread);
                        final SubLObject _prev_bind_2_$24 = at_vars.$at_check_arg_formatP$.currentBinding(thread);
                        try {
                            at_vars.$at_check_arg_isaP$.bind(NIL, thread);
                            at_vars.$at_check_arg_genlsP$.bind(NIL, thread);
                            at_vars.$at_check_arg_formatP$.bind(NIL, thread);
                            quoted_isa_okP = opaque_arg_types_okP(reln, arg, argnum, UNPROVIDED);
                        } finally {
                            at_vars.$at_check_arg_formatP$.rebind(_prev_bind_2_$24, thread);
                            at_vars.$at_check_arg_genlsP$.rebind(_prev_bind_1_$23, thread);
                            at_vars.$at_check_arg_isaP$.rebind(_prev_bind_0_$22, thread);
                        }
                    }
                }
                if ((NIL == at_utilities.at_finishedP(makeBoolean((NIL == isa_okP) || (NIL == quoted_isa_okP)))) && (NIL == not_isa_okP)) {
                    not_isa_okP = arg_test_okP(reln, arg, argnum, $NOT_ISA);
                }
                if ((NIL == at_utilities.at_finishedP(makeBoolean(((NIL == isa_okP) || (NIL == quoted_isa_okP)) || (NIL == not_isa_okP)))) && (NIL == genls_okP)) {
                    if (((NIL != kb_accessors.result_genlP(functor, UNPROVIDED)) || (NIL != kb_accessors.result_genl_argP(functor, UNPROVIDED))) || (NIL != kb_accessors.result_genl_arg_arg_genlP(arg, mt))) {
                        genls_okP = arg_test_okP(reln, arg, argnum, $GENLS);
                    } else
                        if (NIL != cycl_utilities.formula_find_if($sym27$VARIABLE_TERM_WRT_ARG_TYPE_, arg, UNPROVIDED, UNPROVIDED)) {
                            genls_okP = T;
                        } else {
                            final SubLObject collectionP = makeBoolean((NIL != genls.genlsP(nat, $$Collection, mt, UNPROVIDED)) || (NIL != isa.isaP(functor, $$CollectionDenotingFunction, mt, UNPROVIDED)));
                            final SubLObject resourcing_p = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
                            final SubLObject _prev_bind_0_$23 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$24 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(NIL, thread);
                                sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                try {
                                    final SubLObject _prev_bind_0_$24 = at_vars.$at_genls_space$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$25 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                    try {
                                        at_vars.$at_genls_space$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(resourcing_p, thread);
                                        if (NIL != collectionP) {
                                            sbhl_marking_methods.sbhl_record_node($$Thing, UNPROVIDED);
                                        }
                                        final SubLObject _prev_bind_0_$25 = at_vars.$at_arg_type$.currentBinding(thread);
                                        try {
                                            at_vars.$at_arg_type$.bind($OPAQUE, thread);
                                            genls_okP = arg_test_okP(reln, arg, argnum, $GENLS);
                                        } finally {
                                            at_vars.$at_arg_type$.rebind(_prev_bind_0_$25, thread);
                                        }
                                    } finally {
                                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_$25, thread);
                                        at_vars.$at_genls_space$.rebind(_prev_bind_0_$24, thread);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$26 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$26, thread);
                                    }
                                }
                            } finally {
                                sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_1_$24, thread);
                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_0_$23, thread);
                            }
                        }

                }
                if ((NIL == at_utilities.at_finishedP(makeBoolean((((NIL == isa_okP) || (NIL == quoted_isa_okP)) || (NIL == not_isa_okP)) || (NIL == genls_okP)))) && (NIL == not_genls_okP)) {
                    not_genls_okP = arg_test_okP(reln, arg, argnum, $NOT_GENLS);
                }
                if ((NIL == at_utilities.at_finishedP(makeBoolean(((((NIL == isa_okP) || (NIL == quoted_isa_okP)) || (NIL == not_isa_okP)) || (NIL == genls_okP)) || (NIL == not_genls_okP)))) && (NIL == genl_isa_okP)) {
                    genl_isa_okP = arg_test_okP(reln, arg, argnum, $GENL_ISA);
                }
                if ((NIL == at_utilities.at_finishedP(makeBoolean((((((NIL == isa_okP) || (NIL == quoted_isa_okP)) || (NIL == not_isa_okP)) || (NIL == genls_okP)) || (NIL == not_genls_okP)) || (NIL == genl_isa_okP)))) && (NIL == isa_genl_okP)) {
                    isa_genl_okP = arg_test_okP(reln, arg, argnum, $ISA_GENL);
                }
                if ((NIL == at_utilities.at_finishedP(makeBoolean(((((((NIL == isa_okP) || (NIL == quoted_isa_okP)) || (NIL == not_isa_okP)) || (NIL == genls_okP)) || (NIL == not_genls_okP)) || (NIL == genl_isa_okP)) || (NIL == isa_genl_okP)))) && (NIL == different_okP)) {
                    different_okP = arg_test_okP(reln, arg, argnum, $DIFFERENT);
                }
                if ((NIL == at_utilities.at_finishedP(makeBoolean((((((((NIL == isa_okP) || (NIL == quoted_isa_okP)) || (NIL == not_isa_okP)) || (NIL == genls_okP)) || (NIL == not_genls_okP)) || (NIL == genl_isa_okP)) || (NIL == isa_genl_okP)) || (NIL == different_okP)))) && (NIL == format_okP)) {
                    format_okP = arg_test_okP(reln, arg, argnum, $FORMAT);
                }
            } finally {
                at_vars.$at_arg_type$.rebind(_prev_bind_4, thread);
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return makeBoolean(((((((((NIL != isa_okP) && (NIL != quoted_isa_okP)) && (NIL != not_isa_okP)) && (NIL != genls_okP)) && (NIL != not_genls_okP)) && (NIL != genl_isa_okP)) && (NIL != isa_genl_okP)) && (NIL != different_okP)) && (NIL != format_okP));
    }

    public static SubLObject strong_fort_arg_types_okP(SubLObject reln, SubLObject arg, SubLObject argnum, SubLObject mt) {
        if (reln == UNPROVIDED) {
            reln = at_vars.$at_reln$.getDynamicValue();
        }
        if (arg == UNPROVIDED) {
            arg = at_vars.$at_arg$.getDynamicValue();
        }
        if (argnum == UNPROVIDED) {
            argnum = at_vars.$at_argnum$.getDynamicValue();
        }
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject isa_okP = makeBoolean(NIL == at_vars.$at_check_arg_isaP$.getDynamicValue(thread));
        SubLObject quoted_isa_okP = makeBoolean(NIL == at_vars.$at_check_arg_quoted_isaP$.getDynamicValue(thread));
        SubLObject not_isa_okP = makeBoolean(NIL == at_vars.$at_check_arg_not_isaP$.getDynamicValue(thread));
        SubLObject genls_okP = makeBoolean(NIL == at_vars.$at_check_arg_genlsP$.getDynamicValue(thread));
        SubLObject not_genls_okP = makeBoolean(NIL == at_vars.$at_check_inter_arg_not_genlP$.getDynamicValue(thread));
        SubLObject genl_isa_okP = makeBoolean(NIL == at_vars.$at_check_inter_arg_genl_isaP$.getDynamicValue(thread));
        SubLObject isa_genl_okP = makeBoolean(NIL == at_vars.$at_check_inter_arg_isa_genlP$.getDynamicValue(thread));
        SubLObject format_okP = makeBoolean(NIL == at_vars.$at_check_arg_formatP$.getDynamicValue(thread));
        SubLObject different_okP = makeBoolean(NIL == at_vars.$at_check_inter_arg_differentP$.getDynamicValue(thread));
        if (((((((((NIL == isa_okP) || (NIL == quoted_isa_okP)) || (NIL == not_isa_okP)) || (NIL == genls_okP)) || (NIL == not_genls_okP)) || (NIL == genl_isa_okP)) || (NIL == isa_genl_okP)) || (NIL == format_okP)) || (NIL == different_okP)) {
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            final SubLObject _prev_bind_4 = at_vars.$at_arg_type$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                at_vars.$at_arg_type$.bind($STRONG_FORT, thread);
                if (NIL == isa_okP) {
                    isa_okP = arg_test_okP(reln, arg, argnum, $ISA);
                }
                if ((NIL == at_utilities.at_finishedP(makeBoolean(NIL == isa_okP))) && (NIL == quoted_isa_okP)) {
                    quoted_isa_okP = arg_test_okP(reln, arg, argnum, $QUOTED_ISA);
                }
                if ((NIL == at_utilities.at_finishedP(makeBoolean((NIL == isa_okP) || (NIL == quoted_isa_okP)))) && (NIL == not_isa_okP)) {
                    not_isa_okP = arg_test_okP(reln, arg, argnum, $NOT_ISA);
                }
                if ((NIL == at_utilities.at_finishedP(makeBoolean(((NIL == isa_okP) || (NIL == quoted_isa_okP)) || (NIL == not_isa_okP)))) && (NIL == genls_okP)) {
                    genls_okP = arg_test_okP(reln, arg, argnum, $GENLS);
                }
                if ((NIL == at_utilities.at_finishedP(makeBoolean((((NIL == isa_okP) || (NIL == quoted_isa_okP)) || (NIL == not_isa_okP)) || (NIL == genls_okP)))) && (NIL == not_genls_okP)) {
                    not_genls_okP = arg_test_okP(reln, arg, argnum, $NOT_GENLS);
                }
                if ((NIL == at_utilities.at_finishedP(makeBoolean(((((NIL == isa_okP) || (NIL == quoted_isa_okP)) || (NIL == not_isa_okP)) || (NIL == genls_okP)) || (NIL == not_genls_okP)))) && (NIL == genl_isa_okP)) {
                    genl_isa_okP = arg_test_okP(reln, arg, argnum, $GENL_ISA);
                }
                if ((NIL == at_utilities.at_finishedP(makeBoolean((((((NIL == isa_okP) || (NIL == quoted_isa_okP)) || (NIL == not_isa_okP)) || (NIL == genls_okP)) || (NIL == not_genls_okP)) || (NIL == genl_isa_okP)))) && (NIL == isa_genl_okP)) {
                    isa_genl_okP = arg_test_okP(reln, arg, argnum, $ISA_GENL);
                }
                if ((NIL == at_utilities.at_finishedP(makeBoolean(((((((NIL == isa_okP) || (NIL == quoted_isa_okP)) || (NIL == not_isa_okP)) || (NIL == genls_okP)) || (NIL == not_genls_okP)) || (NIL == genl_isa_okP)) || (NIL == isa_genl_okP)))) && (NIL == format_okP)) {
                    format_okP = arg_test_okP(reln, arg, argnum, $FORMAT);
                }
                if ((NIL == at_utilities.at_finishedP(makeBoolean((((((((NIL == isa_okP) || (NIL == quoted_isa_okP)) || (NIL == not_isa_okP)) || (NIL == genls_okP)) || (NIL == not_genls_okP)) || (NIL == genl_isa_okP)) || (NIL == isa_genl_okP)) || (NIL == format_okP)))) && (NIL == different_okP)) {
                    different_okP = arg_test_okP(reln, arg, argnum, $DIFFERENT);
                }
            } finally {
                at_vars.$at_arg_type$.rebind(_prev_bind_4, thread);
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return makeBoolean((((((((((NIL != isa_okP) && (NIL != quoted_isa_okP)) && (NIL != not_isa_okP)) && (NIL != genls_okP)) && (NIL != not_genls_okP)) && (NIL != isa_genl_okP)) && (NIL != genl_isa_okP)) && (NIL != format_okP)) && (NIL != different_okP)) && ((NIL == at_vars.$at_ensure_consistencyP$.getDynamicValue(thread)) || (NIL != weak_fort_types_okP(reln, arg, argnum, mt))));
    }

    public static SubLObject opaque_arg_types_okP(SubLObject reln, SubLObject arg, SubLObject argnum, SubLObject mt) {
        if (reln == UNPROVIDED) {
            reln = at_vars.$at_reln$.getDynamicValue();
        }
        if (arg == UNPROVIDED) {
            arg = at_vars.$at_arg$.getDynamicValue();
        }
        if (argnum == UNPROVIDED) {
            argnum = at_vars.$at_argnum$.getDynamicValue();
        }
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject isa_okP = makeBoolean(NIL == at_vars.$at_check_arg_isaP$.getDynamicValue(thread));
        SubLObject quoted_isa_okP = makeBoolean(NIL == at_vars.$at_check_arg_quoted_isaP$.getDynamicValue(thread));
        SubLObject not_isa_okP = makeBoolean(NIL == at_vars.$at_check_arg_not_isaP$.getDynamicValue(thread));
        SubLObject genls_okP = makeBoolean(NIL == at_vars.$at_check_arg_genlsP$.getDynamicValue(thread));
        SubLObject not_genls_okP = makeBoolean(NIL == at_vars.$at_check_inter_arg_not_genlP$.getDynamicValue(thread));
        SubLObject genl_isa_okP = makeBoolean(NIL == at_vars.$at_check_inter_arg_genl_isaP$.getDynamicValue(thread));
        SubLObject isa_genl_okP = makeBoolean(NIL == at_vars.$at_check_inter_arg_isa_genlP$.getDynamicValue(thread));
        SubLObject format_okP = makeBoolean(NIL == at_vars.$at_check_arg_formatP$.getDynamicValue(thread));
        SubLObject different_okP = makeBoolean(NIL == at_vars.$at_check_inter_arg_differentP$.getDynamicValue(thread));
        if (((((((((NIL == isa_okP) || (NIL == quoted_isa_okP)) || (NIL == not_isa_okP)) || (NIL == genls_okP)) || (NIL == not_genls_okP)) || (NIL == genl_isa_okP)) || (NIL == isa_genl_okP)) || (NIL == format_okP)) || (NIL == different_okP)) {
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            final SubLObject _prev_bind_4 = at_vars.$at_arg_type$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                at_vars.$at_arg_type$.bind($OPAQUE, thread);
                if (NIL == isa_okP) {
                    isa_okP = arg_test_okP(reln, arg, argnum, $ISA);
                }
                if ((NIL == at_utilities.at_finishedP(makeBoolean(NIL == isa_okP))) && (NIL == quoted_isa_okP)) {
                    quoted_isa_okP = arg_test_okP(reln, arg, argnum, $QUOTED_ISA);
                }
                if ((NIL == at_utilities.at_finishedP(makeBoolean((NIL == isa_okP) || (NIL == quoted_isa_okP)))) && (NIL == not_isa_okP)) {
                    not_isa_okP = arg_test_okP(reln, arg, argnum, $NOT_ISA);
                }
                if ((NIL == at_utilities.at_finishedP(makeBoolean(((NIL == isa_okP) || (NIL == quoted_isa_okP)) || (NIL == not_isa_okP)))) && (NIL == genls_okP)) {
                    final SubLObject resourcing_p = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
                    final SubLObject _prev_bind_0_$33 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$34 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(NIL, thread);
                        sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject _prev_bind_0_$34 = at_vars.$at_genls_space$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$35 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                            try {
                                at_vars.$at_genls_space$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(resourcing_p, thread);
                                genls_okP = arg_test_okP(reln, arg, argnum, $GENLS);
                            } finally {
                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_$35, thread);
                                at_vars.$at_genls_space$.rebind(_prev_bind_0_$34, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$35 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$35, thread);
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_1_$34, thread);
                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_0_$33, thread);
                    }
                }
                if ((NIL == at_utilities.at_finishedP(makeBoolean((((NIL == isa_okP) || (NIL == quoted_isa_okP)) || (NIL == not_isa_okP)) || (NIL == genls_okP)))) && (NIL == not_genls_okP)) {
                    not_genls_okP = arg_test_okP(reln, arg, argnum, $NOT_GENLS);
                }
                if ((NIL == at_utilities.at_finishedP(makeBoolean(((((NIL == isa_okP) || (NIL == quoted_isa_okP)) || (NIL == not_isa_okP)) || (NIL == genls_okP)) || (NIL == not_genls_okP)))) && (NIL == genl_isa_okP)) {
                    genl_isa_okP = arg_test_okP(reln, arg, argnum, $GENL_ISA);
                }
                if ((NIL == at_utilities.at_finishedP(makeBoolean((((((NIL == isa_okP) || (NIL == quoted_isa_okP)) || (NIL == not_isa_okP)) || (NIL == genls_okP)) || (NIL == not_genls_okP)) || (NIL == genl_isa_okP)))) && (NIL == isa_genl_okP)) {
                    isa_genl_okP = arg_test_okP(reln, arg, argnum, $ISA_GENL);
                }
                if ((NIL == at_utilities.at_finishedP(makeBoolean(((((((NIL == isa_okP) || (NIL == quoted_isa_okP)) || (NIL == not_isa_okP)) || (NIL == genls_okP)) || (NIL == not_genls_okP)) || (NIL == genl_isa_okP)) || (NIL == isa_genl_okP)))) && (NIL == format_okP)) {
                    format_okP = arg_test_okP(reln, arg, argnum, $FORMAT);
                }
                if ((NIL == at_utilities.at_finishedP(makeBoolean((((((((NIL == isa_okP) || (NIL == quoted_isa_okP)) || (NIL == not_isa_okP)) || (NIL == genls_okP)) || (NIL == not_genls_okP)) || (NIL == genl_isa_okP)) || (NIL == isa_genl_okP)) || (NIL == format_okP)))) && (NIL == different_okP)) {
                    different_okP = arg_test_okP(reln, arg, argnum, $DIFFERENT);
                }
            } finally {
                at_vars.$at_arg_type$.rebind(_prev_bind_4, thread);
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return makeBoolean(((((((((NIL != isa_okP) && (NIL != quoted_isa_okP)) && (NIL != not_isa_okP)) && (NIL != genls_okP)) && (NIL != not_genls_okP)) && (NIL != genls_okP)) && (NIL != isa_genl_okP)) && (NIL != format_okP)) && (NIL != different_okP));
    }

    public static SubLObject arg_isa_arg_types_okP(SubLObject reln, SubLObject arg_isa, SubLObject argnum, SubLObject mt) {
        if (reln == UNPROVIDED) {
            reln = at_vars.$at_reln$.getDynamicValue();
        }
        if (arg_isa == UNPROVIDED) {
            arg_isa = at_vars.$at_arg$.getDynamicValue();
        }
        if (argnum == UNPROVIDED) {
            argnum = at_vars.$at_argnum$.getDynamicValue();
        }
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject isa_okP = makeBoolean(NIL == at_vars.$at_check_arg_isaP$.getDynamicValue(thread));
        SubLObject quoted_isa_okP = makeBoolean(NIL == at_vars.$at_check_arg_quoted_isaP$.getDynamicValue(thread));
        SubLObject genls_okP = makeBoolean(NIL == at_vars.$at_check_arg_genlsP$.getDynamicValue(thread));
        if (((NIL == isa_okP) || (NIL == quoted_isa_okP)) || (NIL == genls_okP)) {
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                final SubLObject genl_somethingP = (NIL != forts.fort_p(reln)) ? makeBoolean((NIL != genl_predicates.genl_predicates(reln, UNPROVIDED, UNPROVIDED)) || (NIL != genl_predicates.genl_inverses(reln, UNPROVIDED, UNPROVIDED))) : NIL;
                final SubLObject _prev_bind_0_$38 = at_vars.$at_reln$.currentBinding(thread);
                final SubLObject _prev_bind_1_$39 = at_vars.$at_search_genl_predsP$.currentBinding(thread);
                final SubLObject _prev_bind_2_$40 = at_vars.$at_search_genl_inversesP$.currentBinding(thread);
                final SubLObject _prev_bind_4 = at_vars.$at_arg$.currentBinding(thread);
                try {
                    at_vars.$at_reln$.bind(reln, thread);
                    at_vars.$at_search_genl_predsP$.bind(makeBoolean((NIL != at_vars.$at_check_genl_predsP$.getDynamicValue(thread)) && (NIL != genl_somethingP)), thread);
                    at_vars.$at_search_genl_inversesP$.bind(makeBoolean((NIL != at_vars.$at_check_genl_inversesP$.getDynamicValue(thread)) && (NIL != genl_somethingP)), thread);
                    at_vars.$at_arg$.bind(arg_isa, thread);
                    assert NIL != integerp(argnum) : "Types.integerp(argnum) " + "CommonSymbols.NIL != Types.integerp(argnum) " + argnum;
                    final SubLObject _prev_bind_0_$39 = at_vars.$at_argnum$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$40 = at_vars.$defn_fn_history$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$41 = at_vars.$quoted_defn_fn_history$.currentBinding(thread);
                    final SubLObject _prev_bind_3_$44 = at_vars.$defn_col_history$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = at_vars.$quoted_defn_col_history$.currentBinding(thread);
                    try {
                        at_vars.$at_argnum$.bind(argnum, thread);
                        at_vars.$defn_fn_history$.bind(at_macros.make_defn_fn_history_table(), thread);
                        at_vars.$quoted_defn_fn_history$.bind(at_macros.make_quoted_defn_fn_history_table(), thread);
                        at_vars.$defn_col_history$.bind(at_macros.make_defn_col_history_table(), thread);
                        at_vars.$quoted_defn_col_history$.bind(at_macros.make_quoted_defn_col_history_table(), thread);
                        try {
                            final SubLObject _prev_bind_0_$40 = at_vars.$at_arg_type$.currentBinding(thread);
                            try {
                                at_vars.$at_arg_type$.bind($STRONG_FORT, thread);
                                if (NIL == isa_okP) {
                                    final SubLObject resourcing_p = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
                                    final SubLObject _prev_bind_0_$41 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$41 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                                    try {
                                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(NIL, thread);
                                        sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                        try {
                                            final SubLObject _prev_bind_0_$42 = at_vars.$at_isa_space$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$42 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                            try {
                                                at_vars.$at_isa_space$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(resourcing_p, thread);
                                                sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), arg_isa, UNPROVIDED, UNPROVIDED);
                                                isa_okP = arg_test_okP(reln, arg_isa, argnum, $ISA);
                                            } finally {
                                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_$42, thread);
                                                at_vars.$at_isa_space$.rebind(_prev_bind_0_$42, thread);
                                            }
                                        } finally {
                                            final SubLObject _prev_bind_0_$43 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values = getValuesAsVector();
                                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                                                restoreValuesFromVector(_values);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$43, thread);
                                            }
                                        }
                                    } finally {
                                        sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_1_$41, thread);
                                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_0_$41, thread);
                                    }
                                }
                                if ((NIL == at_utilities.at_finishedP(makeBoolean(NIL == isa_okP))) && (NIL == quoted_isa_okP)) {
                                    quoted_isa_okP = arg_test_okP(reln, arg_isa, argnum, $QUOTED_ISA);
                                }
                                if ((NIL == at_utilities.at_finishedP(makeBoolean((NIL == isa_okP) || (NIL == quoted_isa_okP)))) && (NIL == genls_okP)) {
                                    final SubLObject collectionP = fort_types_interface.collectionP(arg_isa);
                                    final SubLObject resourcing_p2 = sbhl_marking_vars.resourcing_sbhl_marking_spaces_p();
                                    final SubLObject _prev_bind_0_$44 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$43 = sbhl_marking_vars.$sbhl_table$.currentBinding(thread);
                                    try {
                                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(NIL, thread);
                                        sbhl_marking_vars.$sbhl_table$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                        try {
                                            final SubLObject _prev_bind_0_$45 = at_vars.$at_genls_space$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$44 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                            try {
                                                at_vars.$at_genls_space$.bind(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread), thread);
                                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(resourcing_p2, thread);
                                                if (NIL != collectionP) {
                                                    sbhl_marking_methods.sbhl_record_all_forward_true_nodes(sbhl_module_vars.get_sbhl_module($$genls), arg_isa, UNPROVIDED, UNPROVIDED);
                                                }
                                                genls_okP = arg_test_okP(reln, arg_isa, argnum, $GENLS);
                                            } finally {
                                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_1_$44, thread);
                                                at_vars.$at_genls_space$.rebind(_prev_bind_0_$45, thread);
                                            }
                                        } finally {
                                            final SubLObject _prev_bind_0_$46 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values2 = getValuesAsVector();
                                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_table$.getDynamicValue(thread));
                                                restoreValuesFromVector(_values2);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$46, thread);
                                            }
                                        }
                                    } finally {
                                        sbhl_marking_vars.$sbhl_table$.rebind(_prev_bind_1_$43, thread);
                                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_0_$44, thread);
                                    }
                                }
                            } finally {
                                at_vars.$at_arg_type$.rebind(_prev_bind_0_$40, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$47 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values3 = getValuesAsVector();
                                at_defns.clear_defn_space();
                                restoreValuesFromVector(_values3);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$47, thread);
                            }
                        }
                    } finally {
                        at_vars.$quoted_defn_col_history$.rebind(_prev_bind_5, thread);
                        at_vars.$defn_col_history$.rebind(_prev_bind_3_$44, thread);
                        at_vars.$quoted_defn_fn_history$.rebind(_prev_bind_2_$41, thread);
                        at_vars.$defn_fn_history$.rebind(_prev_bind_1_$40, thread);
                        at_vars.$at_argnum$.rebind(_prev_bind_0_$39, thread);
                    }
                } finally {
                    at_vars.$at_arg$.rebind(_prev_bind_4, thread);
                    at_vars.$at_search_genl_inversesP$.rebind(_prev_bind_2_$40, thread);
                    at_vars.$at_search_genl_predsP$.rebind(_prev_bind_1_$39, thread);
                    at_vars.$at_reln$.rebind(_prev_bind_0_$38, thread);
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return makeBoolean(((NIL != isa_okP) && (NIL != quoted_isa_okP)) && (NIL != genls_okP));
    }

    public static SubLObject arg_test_okP(final SubLObject reln, final SubLObject arg, final SubLObject argnum, SubLObject test) {
        if (test == UNPROVIDED) {
            test = $ISA;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject not_okP = NIL;
        if (reln.eql($$Quote)) {
            final SubLObject _prev_bind_0 = cycl_grammar.$within_quote_form$.currentBinding(thread);
            try {
                cycl_grammar.$within_quote_form$.bind(T, thread);
                if (((($OPAQUE != at_vars.$at_arg_type$.getDynamicValue(thread)) || (NIL == at_vars.$at_relax_arg_constraints_for_opaque_expansion_natsP$.getDynamicValue(thread))) || (NIL == wff_vars.validating_expansionP())) || (NIL == verbosifier.expansion_nautP(arg, UNPROVIDED))) {
                    if (NIL != subl_promotions.memberP(test, $list38, UNPROVIDED, UNPROVIDED)) {
                        if (NIL != at_vars.$at_check_inter_arg_isaP$.getDynamicValue(thread)) {
                            not_okP = inter_arg_test_failsP(reln, arg, argnum, test);
                        }
                    } else
                        if ((NIL != at_vars.$at_check_inter_arg_not_isaP$.getDynamicValue(thread)) && test.eql($NOT_ISA)) {
                            not_okP = inter_arg_test_failsP(reln, arg, argnum, test);
                        } else
                            if ((NIL != at_vars.$at_check_inter_arg_genlP$.getDynamicValue(thread)) && (NIL != subl_promotions.memberP(test, $list39, UNPROVIDED, UNPROVIDED))) {
                                not_okP = inter_arg_test_failsP(reln, arg, argnum, test);
                            } else
                                if ((NIL != at_vars.$at_check_inter_arg_not_genlP$.getDynamicValue(thread)) && test.eql($NOT_GENLS)) {
                                    not_okP = inter_arg_test_failsP(reln, arg, argnum, test);
                                } else
                                    if ((NIL != at_vars.$at_check_inter_arg_genl_isaP$.getDynamicValue(thread)) && test.eql($GENL_ISA)) {
                                        not_okP = inter_arg_test_failsP(reln, arg, argnum, test);
                                    } else
                                        if ((NIL != at_vars.$at_check_inter_arg_isa_genlP$.getDynamicValue(thread)) && test.eql($ISA_GENL)) {
                                            not_okP = inter_arg_test_failsP(reln, arg, argnum, test);
                                        } else
                                            if ((NIL != at_vars.$at_check_inter_arg_formatP$.getDynamicValue(thread)) && test.eql($FORMAT)) {
                                                clear_cached_format_okP();
                                                not_okP = inter_arg_test_failsP(reln, arg, argnum, test);
                                            } else
                                                if ((NIL != at_vars.$at_check_inter_arg_differentP$.getDynamicValue(thread)) && test.eql($DIFFERENT)) {
                                                    not_okP = inter_arg_test_failsP(reln, arg, argnum, test);
                                                }







                    if (NIL == at_utilities.at_finishedP(not_okP)) {
                        not_okP = makeBoolean((NIL != mal_intra_argP(reln, arg, argnum, test)) || (NIL != not_okP));
                    }
                }
            } finally {
                cycl_grammar.$within_quote_form$.rebind(_prev_bind_0, thread);
            }
        } else
            if (((($OPAQUE != at_vars.$at_arg_type$.getDynamicValue(thread)) || (NIL == at_vars.$at_relax_arg_constraints_for_opaque_expansion_natsP$.getDynamicValue(thread))) || (NIL == wff_vars.validating_expansionP())) || (NIL == verbosifier.expansion_nautP(arg, UNPROVIDED))) {
                if (NIL != subl_promotions.memberP(test, $list38, UNPROVIDED, UNPROVIDED)) {
                    if (NIL != at_vars.$at_check_inter_arg_isaP$.getDynamicValue(thread)) {
                        not_okP = inter_arg_test_failsP(reln, arg, argnum, test);
                    }
                } else
                    if ((NIL != at_vars.$at_check_inter_arg_not_isaP$.getDynamicValue(thread)) && test.eql($NOT_ISA)) {
                        not_okP = inter_arg_test_failsP(reln, arg, argnum, test);
                    } else
                        if ((NIL != at_vars.$at_check_inter_arg_genlP$.getDynamicValue(thread)) && (NIL != subl_promotions.memberP(test, $list39, UNPROVIDED, UNPROVIDED))) {
                            not_okP = inter_arg_test_failsP(reln, arg, argnum, test);
                        } else
                            if ((NIL != at_vars.$at_check_inter_arg_not_genlP$.getDynamicValue(thread)) && test.eql($NOT_GENLS)) {
                                not_okP = inter_arg_test_failsP(reln, arg, argnum, test);
                            } else
                                if ((NIL != at_vars.$at_check_inter_arg_genl_isaP$.getDynamicValue(thread)) && test.eql($GENL_ISA)) {
                                    not_okP = inter_arg_test_failsP(reln, arg, argnum, test);
                                } else
                                    if ((NIL != at_vars.$at_check_inter_arg_isa_genlP$.getDynamicValue(thread)) && test.eql($ISA_GENL)) {
                                        not_okP = inter_arg_test_failsP(reln, arg, argnum, test);
                                    } else
                                        if ((NIL != at_vars.$at_check_inter_arg_formatP$.getDynamicValue(thread)) && test.eql($FORMAT)) {
                                            clear_cached_format_okP();
                                            not_okP = inter_arg_test_failsP(reln, arg, argnum, test);
                                        } else
                                            if ((NIL != at_vars.$at_check_inter_arg_differentP$.getDynamicValue(thread)) && test.eql($DIFFERENT)) {
                                                not_okP = inter_arg_test_failsP(reln, arg, argnum, test);
                                            }







                if (NIL == at_utilities.at_finishedP(not_okP)) {
                    not_okP = makeBoolean((NIL != mal_intra_argP(reln, arg, argnum, test)) || (NIL != not_okP));
                }
            }

        return makeBoolean(NIL == not_okP);
    }

    public static SubLObject inter_arg_test_failsP(final SubLObject reln, final SubLObject arg, final SubLObject argnum, SubLObject test) {
        if (test == UNPROVIDED) {
            test = $ISA;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ind_argnum = ZERO_INTEGER;
        SubLObject not_okP = NIL;
        SubLObject doneP = NIL;
        if (NIL == doneP) {
            SubLObject csome_list_var = cycl_utilities.formula_args(at_vars.$at_formula$.getDynamicValue(thread), UNPROVIDED);
            SubLObject ind_arg = NIL;
            ind_arg = csome_list_var.first();
            while ((NIL == doneP) && (NIL != csome_list_var)) {
                ind_argnum = add(ind_argnum, ONE_INTEGER);
                if (!argnum.eql(ind_argnum)) {
                    not_okP = makeBoolean((NIL != mal_inter_argP(reln, ind_arg, ind_argnum, arg, argnum, test)) || (NIL != not_okP));
                    doneP = at_utilities.at_finishedP(not_okP);
                }
                csome_list_var = csome_list_var.rest();
                ind_arg = csome_list_var.first();
            } 
        }
        return not_okP;
    }

    public static SubLObject mal_intra_argP(final SubLObject reln, final SubLObject arg, final SubLObject argnum, final SubLObject test) {
        if (test.eql($ISA)) {
            return at_routines.mal_arg_isaP(reln, arg, argnum);
        }
        if (test.eql($NOT_ISA)) {
            return at_routines.mal_arg_not_isaP(reln, arg, argnum);
        }
        if (test.eql($QUOTED_ISA)) {
            return at_routines.mal_arg_quoted_isaP(reln, arg, argnum);
        }
        if (test.eql($GENLS)) {
            return at_routines.mal_arg_genlsP(reln, arg, argnum);
        }
        if (test.eql($NOT_ISA_DISJOINT)) {
            return at_routines.mal_arg_not_isa_disjointP(reln, arg, argnum);
        }
        if (test.eql($NOT_QUOTED_ISA_DISJOINT)) {
            return at_routines.mal_arg_not_quoted_isa_disjointP(reln, arg, argnum);
        }
        if (test.eql($NOT_GENLS_DISJOINT)) {
            return at_routines.mal_arg_not_genls_disjointP(reln, arg, argnum);
        }
        if (test.eql($FORMAT)) {
            return at_routines.mal_arg_formatP(reln, arg, argnum);
        }
        if (test.eql($DIFFERENT)) {
            return NIL;
        }
        el_error(THREE_INTEGER, $str40$invalid_at_test__s_in_mal_intra_a, test, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject mal_inter_argP(final SubLObject reln, final SubLObject ind_arg, final SubLObject ind_argnum, final SubLObject dep_arg, final SubLObject dep_argnum, final SubLObject test) {
        if (test.eql($ISA)) {
            return at_routines.mal_inter_arg_isaP(reln, ind_arg, ind_argnum, dep_arg, dep_argnum);
        }
        if (test.eql($NOT_ISA)) {
            return at_routines.mal_inter_arg_not_isaP(reln, ind_arg, ind_argnum, dep_arg, dep_argnum);
        }
        if (test.eql($NOT_ISA_DISJOINT)) {
            return at_routines.mal_inter_arg_not_isa_disjointP(reln, ind_arg, ind_argnum, dep_arg, dep_argnum);
        }
        if (test.eql($GENLS)) {
            return at_routines.mal_inter_arg_genlP(reln, ind_arg, ind_argnum, dep_arg, dep_argnum);
        }
        if (test.eql($NOT_GENLS)) {
            return at_routines.mal_inter_arg_not_genlP(reln, ind_arg, ind_argnum, dep_arg, dep_argnum);
        }
        if (test.eql($NOT_GENLS_DISJOINT)) {
            return at_routines.mal_inter_arg_not_genl_disjointP(reln, ind_arg, ind_argnum, dep_arg, dep_argnum);
        }
        if (test.eql($GENL_ISA)) {
            return at_routines.mal_inter_arg_genl_isaP(reln, ind_arg, ind_argnum, dep_arg, dep_argnum);
        }
        if (test.eql($ISA_GENL)) {
            return at_routines.mal_inter_arg_isa_genlP(reln, ind_arg, ind_argnum, dep_arg, dep_argnum);
        }
        if (test.eql($FORMAT)) {
            return at_routines.mal_inter_arg_formatP(reln, ind_arg, ind_argnum, dep_arg, dep_argnum);
        }
        if (test.eql($DIFFERENT)) {
            return makeBoolean(ind_argnum.numG(dep_argnum) && (NIL != at_routines.mal_inter_arg_differentP(reln, ind_arg, ind_argnum, dep_arg, dep_argnum)));
        }
        el_error(THREE_INTEGER, $str41$invalid_at_test__s_in_mal_inter_a, test, UNPROVIDED, UNPROVIDED);
        return NIL;
    }

    public static SubLObject defining_mts_okP(final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if ((NIL == forts.fort_p(fort)) || (NIL == at_vars.at_check_defining_mts_p())) {
            return T;
        }
        if (NIL != wff_macros.within_wffP()) {
            return memoized_defining_mts_okP(fort, mt);
        }
        return defining_mts_ok_intP(fort, mt);
    }

    public static SubLObject memoized_defining_mts_okP_internal(final SubLObject fort, final SubLObject mt) {
        return defining_mts_ok_intP(fort, mt);
    }

    public static SubLObject memoized_defining_mts_okP(final SubLObject fort, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return memoized_defining_mts_okP_internal(fort, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym42$MEMOIZED_DEFINING_MTS_OK_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym42$MEMOIZED_DEFINING_MTS_OK_, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym42$MEMOIZED_DEFINING_MTS_OK_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(fort, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (fort.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(memoized_defining_mts_okP_internal(fort, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(fort, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject defining_mts_ok_intP(final SubLObject fort, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject okP = T;
        final SubLObject mts = (NIL != at_vars.$at_check_defining_mtsP$.getDynamicValue(thread)) ? list(kb_accessors.defining_mt(fort)) : NIL;
        if ((NIL != mts) && (NIL == genl_mts.any_genl_mtP(mt, mts, UNPROVIDED, UNPROVIDED))) {
            okP = NIL;
            if (NIL != at_vars.$noting_at_violationsP$.getDynamicValue(thread)) {
                at_utilities.at_note(THREE_INTEGER, $str43$__at_test_fails___s_in__s_fails__, fort, mt, mts, UNPROVIDED, UNPROVIDED);
                if (NIL != at_vars.$at_break_on_failureP$.getDynamicValue(thread)) {
                    at_utilities.at_error(ONE_INTEGER, $str43$__at_test_fails___s_in__s_fails__, fort, mt, mts, UNPROVIDED, UNPROVIDED);
                }
                at_utilities.note_at_violation(list($DEFINING_MT_VIOLATION, fort, mt, mts));
            }
        }
        return okP;
    }

    public static SubLObject relator_constraints_okP(final SubLObject relation, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject relator = cycl_utilities.formula_arg0(relation);
        SubLObject okP = T;
        if (NIL != at_vars.$at_check_relator_constraintsP$.getDynamicValue(thread)) {
            if (NIL != forts.fort_p(relator)) {
                if (NIL != term.kb_predicateP(relator)) {
                    okP = predicate_constraints_okP(relation, mt);
                }
            }
        }
        return okP;
    }

    public static SubLObject predicate_constraints_okP(final SubLObject literal, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject okP = T;
        final SubLObject predicate = literal_predicate(literal, UNPROVIDED);
        SubLObject doneP = NIL;
        if (NIL == doneP) {
            SubLObject csome_list_var = at_vars.$at_pred_constraints$.getDynamicValue(thread);
            final SubLObject _prev_bind_0 = at_vars.$at_mode$.currentBinding(thread);
            try {
                at_vars.$at_mode$.bind(NIL, thread);
                at_vars.$at_mode$.setDynamicValue(csome_list_var.first(), thread);
                while ((NIL == doneP) && (NIL != csome_list_var)) {
                    final SubLObject pcase_var = at_vars.$at_mode$.getDynamicValue(thread);
                    if (pcase_var.eql($ASYMMETRIC_PREDICATE)) {
                        if (NIL != kb_accessors.asymmetric_predicateP(predicate)) {
                            final SubLObject _prev_bind_0_$57 = at_vars.$gather_at_predicate_violationsP$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = at_vars.$at_predicate_violations$.currentBinding(thread);
                            try {
                                at_vars.$gather_at_predicate_violationsP$.bind(T, thread);
                                at_vars.$at_predicate_violations$.bind(NIL, thread);
                                okP = makeBoolean((NIL != gaf_ok_wrt_asymmetric_predP(literal, mt)) && (NIL != okP));
                            } finally {
                                at_vars.$at_predicate_violations$.rebind(_prev_bind_2, thread);
                                at_vars.$gather_at_predicate_violationsP$.rebind(_prev_bind_0_$57, thread);
                            }
                        }
                    } else
                        if (pcase_var.eql($ANTI_SYMMETRIC_PREDICATE)) {
                            if (NIL != kb_accessors.anti_symmetric_predicateP(predicate)) {
                                final SubLObject _prev_bind_0_$58 = at_vars.$gather_at_predicate_violationsP$.currentBinding(thread);
                                final SubLObject _prev_bind_2 = at_vars.$at_predicate_violations$.currentBinding(thread);
                                try {
                                    at_vars.$gather_at_predicate_violationsP$.bind(T, thread);
                                    at_vars.$at_predicate_violations$.bind(NIL, thread);
                                    okP = makeBoolean((NIL != gaf_ok_wrt_anti_symmetric_predP(literal, mt)) && (NIL != okP));
                                } finally {
                                    at_vars.$at_predicate_violations$.rebind(_prev_bind_2, thread);
                                    at_vars.$gather_at_predicate_violationsP$.rebind(_prev_bind_0_$58, thread);
                                }
                            }
                        } else
                            if (pcase_var.eql($IRREFLEXIVE_PREDICATE)) {
                                if (NIL != kb_accessors.irreflexive_predicateP(predicate)) {
                                    final SubLObject _prev_bind_0_$59 = at_vars.$gather_at_predicate_violationsP$.currentBinding(thread);
                                    final SubLObject _prev_bind_2 = at_vars.$at_predicate_violations$.currentBinding(thread);
                                    try {
                                        at_vars.$gather_at_predicate_violationsP$.bind(T, thread);
                                        at_vars.$at_predicate_violations$.bind(NIL, thread);
                                        okP = makeBoolean((NIL != gaf_ok_wrt_irreflexive_predP(literal, mt)) && (NIL != okP));
                                    } finally {
                                        at_vars.$at_predicate_violations$.rebind(_prev_bind_2, thread);
                                        at_vars.$gather_at_predicate_violationsP$.rebind(_prev_bind_0_$59, thread);
                                    }
                                }
                            } else
                                if (pcase_var.eql($ANTI_TRANSITIVE_PREDICATE)) {
                                    if (NIL != kb_accessors.anti_transitive_predicateP(predicate)) {
                                        final SubLObject _prev_bind_0_$60 = at_vars.$gather_at_predicate_violationsP$.currentBinding(thread);
                                        final SubLObject _prev_bind_2 = at_vars.$at_predicate_violations$.currentBinding(thread);
                                        try {
                                            at_vars.$gather_at_predicate_violationsP$.bind(T, thread);
                                            at_vars.$at_predicate_violations$.bind(NIL, thread);
                                            okP = makeBoolean((NIL != gaf_ok_wrt_anti_transitive_predP(literal, mt)) && (NIL != okP));
                                        } finally {
                                            at_vars.$at_predicate_violations$.rebind(_prev_bind_2, thread);
                                            at_vars.$gather_at_predicate_violationsP$.rebind(_prev_bind_0_$60, thread);
                                        }
                                    }
                                } else
                                    if (pcase_var.eql($NEGATION_PREDS)) {
                                        final SubLObject _prev_bind_0_$61 = at_vars.$gather_at_predicate_violationsP$.currentBinding(thread);
                                        final SubLObject _prev_bind_2 = at_vars.$at_predicate_violations$.currentBinding(thread);
                                        try {
                                            at_vars.$gather_at_predicate_violationsP$.bind(T, thread);
                                            at_vars.$at_predicate_violations$.bind(NIL, thread);
                                            okP = makeBoolean((NIL != gaf_ok_wrt_negation_predsP(literal, mt)) && (NIL != okP));
                                        } finally {
                                            at_vars.$at_predicate_violations$.rebind(_prev_bind_2, thread);
                                            at_vars.$gather_at_predicate_violationsP$.rebind(_prev_bind_0_$61, thread);
                                        }
                                    } else
                                        if (pcase_var.eql($NEGATION_INVERSES)) {
                                            final SubLObject _prev_bind_0_$62 = at_vars.$gather_at_predicate_violationsP$.currentBinding(thread);
                                            final SubLObject _prev_bind_2 = at_vars.$at_predicate_violations$.currentBinding(thread);
                                            try {
                                                at_vars.$gather_at_predicate_violationsP$.bind(T, thread);
                                                at_vars.$at_predicate_violations$.bind(NIL, thread);
                                                okP = makeBoolean((NIL != gaf_ok_wrt_negation_inversesP(literal, mt)) && (NIL != okP));
                                            } finally {
                                                at_vars.$at_predicate_violations$.rebind(_prev_bind_2, thread);
                                                at_vars.$gather_at_predicate_violationsP$.rebind(_prev_bind_0_$62, thread);
                                            }
                                        } else {
                                            el_error(THREE_INTEGER, $str51$unknown_predicate_constraint___s, at_vars.$at_mode$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
                                        }





                    if ((NIL == okP) && (NIL == at_vars.$accumulating_at_violationsP$.getDynamicValue(thread))) {
                        doneP = T;
                    }
                    csome_list_var = csome_list_var.rest();
                    at_vars.$at_mode$.setDynamicValue(csome_list_var.first(), thread);
                } 
            } finally {
                at_vars.$at_mode$.rebind(_prev_bind_0, thread);
            }
        }
        return okP;
    }

    public static SubLObject gaf_ok_wrt_asymmetric_predP(final SubLObject gaf, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject violations = asymmetric_violations(gaf, mt);
        if (NIL != violations) {
            final SubLObject _prev_bind_0 = at_vars.$at_pred$.currentBinding(thread);
            try {
                at_vars.$at_pred$.bind($$isa, thread);
                if (NIL != at_vars.$at_pred$.getDynamicValue(thread)) {
                    at_utilities.at_handle_mal_constraint($$AsymmetricBinaryPredicate);
                }
            } finally {
                at_vars.$at_pred$.rebind(_prev_bind_0, thread);
            }
        }
        return sublisp_null(violations);
    }

    public static SubLObject asymmetric_violations(final SubLObject gaf, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred = cycl_utilities.reify_arg_when_closed_naut(gaf, ZERO_INTEGER);
        final SubLObject arg1 = cycl_utilities.reify_arg_when_closed_naut(gaf, ONE_INTEGER);
        final SubLObject arg2 = cycl_utilities.reify_arg_when_closed_naut(gaf, TWO_INTEGER);
        SubLObject violations = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
            violations = gather_asymmetric_violations(pred, arg1, arg2);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return violations;
    }

    public static SubLObject gather_asymmetric_violations(final SubLObject pred, final SubLObject arg1, final SubLObject arg2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject violations = NIL;
        final SubLObject _prev_bind_0 = $mapping_answer$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$at_arg1$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$at_arg2$.currentBinding(thread);
        try {
            $mapping_answer$.bind(NIL, thread);
            at_vars.$at_arg1$.bind(arg1, thread);
            at_vars.$at_arg2$.bind(arg2, thread);
            final SubLObject lookup_index = best_gaf_lookup_index_for_anti_transitive(make_binary_formula(pred, arg2, arg1), $TRUE, $list55);
            final SubLObject index_type = kb_indexing.lookup_index_get_type(lookup_index);
            SubLObject catch_var = NIL;
            try {
                thread.throwStack.push($AT_MAPPING_DONE);
                final SubLObject _prev_bind_0_$63 = at_vars.$within_at_mappingP$.currentBinding(thread);
                try {
                    at_vars.$within_at_mappingP$.bind(T, thread);
                    if (index_type == $PREDICATE_EXTENT) {
                        final SubLObject predicate = kb_indexing.lookup_index_predicate_extent_value(lookup_index);
                        if (NIL != check_inter_assert_format_wXo_arg_indexP(at_vars.$at_formula$.getDynamicValue(thread))) {
                            kb_mapping.map_predicate_extent_index(SELECT_ASYMMETRIC_PRED_VIOLATION, predicate, UNPROVIDED, UNPROVIDED);
                        }
                    } else
                        if (index_type == $GAF_ARG) {
                            thread.resetMultipleValues();
                            final SubLObject v_term = kb_indexing.lookup_index_gaf_arg_values(lookup_index);
                            final SubLObject argnum = thread.secondMultipleValue();
                            final SubLObject predicate2 = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            kb_gp_mapping.gp_map_arg_index(SELECT_ASYMMETRIC_PRED_VIOLATION, v_term, argnum, predicate2);
                        } else {
                            Errors.cerror($$$Ignore_it, $str61$Unexpected_index_type_when_gather);
                        }

                } finally {
                    at_vars.$within_at_mappingP$.rebind(_prev_bind_0_$63, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, $AT_MAPPING_DONE);
            } finally {
                thread.throwStack.pop();
            }
            violations = $mapping_answer$.getDynamicValue(thread);
        } finally {
            at_vars.$at_arg2$.rebind(_prev_bind_3, thread);
            at_vars.$at_arg1$.rebind(_prev_bind_2, thread);
            $mapping_answer$.rebind(_prev_bind_0, thread);
        }
        return violations;
    }

    public static SubLObject select_asymmetric_pred_violation(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != at_gaf_assertionP(assertion)) {
            final SubLObject gaf = assertions_high.gaf_formula(assertion);
            if (at_vars.$at_arg1$.getDynamicValue(thread).equal(literal_arg(gaf, TWO_INTEGER, UNPROVIDED)) && at_vars.$at_arg2$.getDynamicValue(thread).equal(literal_arg(gaf, ONE_INTEGER, UNPROVIDED))) {
                $mapping_answer$.setDynamicValue(cons(assertion, $mapping_answer$.getDynamicValue(thread)), thread);
                if ((NIL != at_vars.$gather_at_predicate_violationsP$.getDynamicValue(thread)) && (NIL == member(assertion, at_vars.$at_predicate_violations$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY)))) {
                    at_vars.$at_predicate_violations$.setDynamicValue(cons(assertion, at_vars.$at_predicate_violations$.getDynamicValue(thread)), thread);
                }
                if (NIL == at_vars.$accumulating_at_violationsP$.getDynamicValue(thread)) {
                    at_utilities.at_mapping_finished();
                }
            }
        }
        return $mapping_answer$.getDynamicValue(thread);
    }

    public static SubLObject gaf_ok_wrt_anti_symmetric_predP(final SubLObject gaf, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject violations = anti_symmetric_violations(gaf, mt);
        if (NIL != violations) {
            final SubLObject _prev_bind_0 = at_vars.$at_pred$.currentBinding(thread);
            try {
                at_vars.$at_pred$.bind($$isa, thread);
                if (NIL != at_vars.$at_pred$.getDynamicValue(thread)) {
                    at_utilities.at_handle_mal_constraint($$AntiSymmetricBinaryPredicate);
                }
            } finally {
                at_vars.$at_pred$.rebind(_prev_bind_0, thread);
            }
        }
        return sublisp_null(violations);
    }

    public static SubLObject anti_symmetric_violations(final SubLObject gaf, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred = cycl_utilities.reify_arg_when_closed_naut(gaf, ZERO_INTEGER);
        final SubLObject arg1 = cycl_utilities.reify_arg_when_closed_naut(gaf, ONE_INTEGER);
        final SubLObject arg2 = cycl_utilities.reify_arg_when_closed_naut(gaf, TWO_INTEGER);
        SubLObject violations = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
            if (NIL == equals.equalsP(arg1, arg2, UNPROVIDED, UNPROVIDED)) {
                violations = gather_asymmetric_violations(pred, arg1, arg2);
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return violations;
    }

    public static SubLObject gaf_ok_wrt_irreflexive_predP(final SubLObject gaf, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject okP = T;
        final SubLObject arg1 = cycl_utilities.reify_arg_when_closed_naut(gaf, ONE_INTEGER);
        final SubLObject arg2 = cycl_utilities.reify_arg_when_closed_naut(gaf, TWO_INTEGER);
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            if (NIL != equals.equalsP(arg1, arg2, UNPROVIDED, UNPROVIDED)) {
                okP = NIL;
                final SubLObject _prev_bind_0_$64 = at_vars.$at_pred$.currentBinding(thread);
                try {
                    at_vars.$at_pred$.bind($$isa, thread);
                    if (NIL != at_vars.$at_pred$.getDynamicValue(thread)) {
                        at_utilities.at_handle_mal_constraint($$IrreflexiveBinaryPredicate);
                    }
                } finally {
                    at_vars.$at_pred$.rebind(_prev_bind_0_$64, thread);
                }
            }
            if ((NIL != okP) || (NIL != at_vars.$accumulating_at_violationsP$.getDynamicValue(thread))) {
                final SubLObject pred = cycl_utilities.reify_arg_when_closed_naut(gaf, ZERO_INTEGER);
                if (((NIL != kb_accessors.transitive_predicateP(pred)) && (NIL == kb_accessors.symmetric_predicateP(pred))) && (NIL != transitivity.gtm(pred, $kw64$COMPLETES_CYCLE_, arg1, arg2, mt, UNPROVIDED, UNPROVIDED))) {
                    okP = NIL;
                    if (NIL != at_vars.$gather_at_predicate_violationsP$.getDynamicValue(thread)) {
                        at_vars.$at_predicate_violations$.setDynamicValue(transitivity.gtm(pred, $kw65$WHY_COMPLETES_CYCLE_, arg1, arg2, UNPROVIDED, UNPROVIDED, UNPROVIDED), thread);
                        if (NIL != at_vars.$at_predicate_violations$.getDynamicValue(thread)) {
                            at_vars.$at_predicate_violations$.setDynamicValue(nconc(hl_supports.gaf_axioms_genl_mts(isa.why_isaP(pred, $$TransitiveBinaryPredicate, UNPROVIDED, UNPROVIDED, UNPROVIDED), mt_relevance_macros.$mt$.getDynamicValue(thread)), at_vars.$at_predicate_violations$.getDynamicValue(thread)), thread);
                        }
                    }
                    final SubLObject _prev_bind_0_$65 = at_vars.$at_pred$.currentBinding(thread);
                    try {
                        at_vars.$at_pred$.bind($$isa, thread);
                        if (NIL != at_vars.$at_pred$.getDynamicValue(thread)) {
                            at_utilities.at_handle_mal_constraint($$IrreflexiveBinaryPredicate);
                        }
                    } finally {
                        at_vars.$at_pred$.rebind(_prev_bind_0_$65, thread);
                    }
                }
            }
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return okP;
    }

    public static SubLObject gaf_ok_wrt_anti_transitive_predP(final SubLObject gaf, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject violations = anti_transitive_violations(gaf, mt);
        if ((NIL != violations) && (NIL != wff_macros.within_wffP())) {
            final SubLObject _prev_bind_0 = at_vars.$at_pred$.currentBinding(thread);
            try {
                at_vars.$at_pred$.bind($$isa, thread);
                if (NIL != at_vars.$at_pred$.getDynamicValue(thread)) {
                    final SubLObject _prev_bind_0_$66 = at_vars.$at_argnum$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = at_vars.$at_result$.currentBinding(thread);
                    try {
                        at_vars.$at_argnum$.bind(ZERO_INTEGER, thread);
                        at_vars.$at_result$.bind(NIL, thread);
                        at_utilities.at_handle_mal_constraint($$AntiTransitiveBinaryPredicate);
                    } finally {
                        at_vars.$at_result$.rebind(_prev_bind_2, thread);
                        at_vars.$at_argnum$.rebind(_prev_bind_0_$66, thread);
                    }
                }
            } finally {
                at_vars.$at_pred$.rebind(_prev_bind_0, thread);
            }
        }
        return sublisp_null(violations);
    }

    public static SubLObject anti_transitive_violations(final SubLObject gaf, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject violations = NIL;
        final SubLObject _prev_bind_0 = at_vars.$at_reln$.currentBinding(thread);
        final SubLObject _prev_bind_2 = at_vars.$at_arg1$.currentBinding(thread);
        final SubLObject _prev_bind_3 = at_vars.$at_arg2$.currentBinding(thread);
        try {
            at_vars.$at_reln$.bind(cycl_utilities.reify_when_closed_naut(cycl_utilities.formula_arg0(gaf)), thread);
            at_vars.$at_arg1$.bind(cycl_utilities.reify_arg_when_closed_naut(gaf, ONE_INTEGER), thread);
            at_vars.$at_arg2$.bind(cycl_utilities.reify_arg_when_closed_naut(gaf, TWO_INTEGER), thread);
            final SubLObject _prev_bind_0_$67 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_1_$68 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2_$69 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
                violations = gather_anti_transitive_violations(at_vars.$at_reln$.getDynamicValue(thread), at_vars.$at_arg1$.getDynamicValue(thread), at_vars.$at_arg2$.getDynamicValue(thread));
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$69, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$68, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0_$67, thread);
            }
        } finally {
            at_vars.$at_arg2$.rebind(_prev_bind_3, thread);
            at_vars.$at_arg1$.rebind(_prev_bind_2, thread);
            at_vars.$at_reln$.rebind(_prev_bind_0, thread);
        }
        return violations;
    }

    public static SubLObject gather_anti_transitive_violations(final SubLObject pred, final SubLObject arg1, final SubLObject arg2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject violations = NIL;
        final SubLObject _prev_bind_0 = $mapping_answer$.currentBinding(thread);
        try {
            $mapping_answer$.bind(NIL, thread);
            final SubLObject lookup_index = best_gaf_lookup_index_for_anti_transitive(make_binary_formula(pred, arg1, arg2), $TRUE, $list55);
            final SubLObject index_type = kb_indexing.lookup_index_get_type(lookup_index);
            SubLObject catch_var = NIL;
            try {
                thread.throwStack.push($AT_MAPPING_DONE);
                final SubLObject _prev_bind_0_$70 = at_vars.$within_at_mappingP$.currentBinding(thread);
                try {
                    at_vars.$within_at_mappingP$.bind(T, thread);
                    final SubLObject pcase_var = index_type;
                    if (pcase_var.eql($PREDICATE_EXTENT)) {
                        final SubLObject predicate = kb_indexing.lookup_index_predicate_extent_value(lookup_index);
                        final SubLObject _prev_bind_0_$71 = $mapping_pred$.currentBinding(thread);
                        try {
                            $mapping_pred$.bind(predicate, thread);
                            if (NIL != check_inter_assert_format_wXo_arg_indexP(at_vars.$at_formula$.getDynamicValue(thread))) {
                                final SubLObject _prev_bind_0_$72 = $mapping_data_1$.currentBinding(thread);
                                final SubLObject _prev_bind_2 = $mapping_data_2$.currentBinding(thread);
                                try {
                                    $mapping_data_1$.bind(NIL, thread);
                                    $mapping_data_2$.bind(NIL, thread);
                                    kb_mapping.map_predicate_extent_index(SELECT_ANTI_TRANSITIVE_PRED_VIOLATION_VIA_PRED, predicate, UNPROVIDED, UNPROVIDED);
                                } finally {
                                    $mapping_data_2$.rebind(_prev_bind_2, thread);
                                    $mapping_data_1$.rebind(_prev_bind_0_$72, thread);
                                }
                            }
                        } finally {
                            $mapping_pred$.rebind(_prev_bind_0_$71, thread);
                        }
                    } else
                        if (pcase_var.eql($GAF_ARG)) {
                            thread.resetMultipleValues();
                            final SubLObject v_term = kb_indexing.lookup_index_gaf_arg_values(lookup_index);
                            final SubLObject argnum = thread.secondMultipleValue();
                            final SubLObject predicate2 = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            final SubLObject _prev_bind_0_$73 = $mapping_pred$.currentBinding(thread);
                            try {
                                $mapping_pred$.bind(predicate2, thread);
                                final SubLObject pcase_var_$74 = argnum;
                                if (pcase_var_$74.eql(ONE_INTEGER)) {
                                    final SubLObject _prev_bind_0_$74 = $mapping_target$.currentBinding(thread);
                                    try {
                                        $mapping_target$.bind(arg2, thread);
                                        SubLObject cdolist_list_var = $list71;
                                        SubLObject arg_binds = NIL;
                                        arg_binds = cdolist_list_var.first();
                                        while (NIL != cdolist_list_var) {
                                            SubLObject current;
                                            final SubLObject datum = current = arg_binds;
                                            final SubLObject _prev_bind_0_$75 = $mapping_index_arg$.currentBinding(thread);
                                            final SubLObject _prev_bind_3 = $mapping_pivot_arg$.currentBinding(thread);
                                            final SubLObject _prev_bind_4 = $mapping_target_arg$.currentBinding(thread);
                                            try {
                                                $mapping_index_arg$.bind(NIL, thread);
                                                $mapping_pivot_arg$.bind(NIL, thread);
                                                $mapping_target_arg$.bind(NIL, thread);
                                                destructuring_bind_must_consp(current, datum, $list69);
                                                $mapping_index_arg$.setDynamicValue(current.first(), thread);
                                                current = current.rest();
                                                destructuring_bind_must_consp(current, datum, $list69);
                                                $mapping_pivot_arg$.setDynamicValue(current.first(), thread);
                                                current = current.rest();
                                                destructuring_bind_must_consp(current, datum, $list69);
                                                $mapping_target_arg$.setDynamicValue(current.first(), thread);
                                                current = current.rest();
                                                if (NIL == current) {
                                                    kb_gp_mapping.gp_map_arg_index(SEARCH_FOR_ANTI_TRANSITIVE_PRED_VIOLATION, v_term, $mapping_index_arg$.getDynamicValue(thread), $mapping_pred$.getDynamicValue(thread));
                                                } else {
                                                    cdestructuring_bind_error(datum, $list69);
                                                }
                                            } finally {
                                                $mapping_target_arg$.rebind(_prev_bind_4, thread);
                                                $mapping_pivot_arg$.rebind(_prev_bind_3, thread);
                                                $mapping_index_arg$.rebind(_prev_bind_0_$75, thread);
                                            }
                                            cdolist_list_var = cdolist_list_var.rest();
                                            arg_binds = cdolist_list_var.first();
                                        } 
                                    } finally {
                                        $mapping_target$.rebind(_prev_bind_0_$74, thread);
                                    }
                                } else
                                    if (pcase_var_$74.eql(TWO_INTEGER)) {
                                        final SubLObject _prev_bind_0_$76 = $mapping_target$.currentBinding(thread);
                                        try {
                                            $mapping_target$.bind(arg1, thread);
                                            SubLObject cdolist_list_var = $list72;
                                            SubLObject arg_binds = NIL;
                                            arg_binds = cdolist_list_var.first();
                                            while (NIL != cdolist_list_var) {
                                                SubLObject current;
                                                final SubLObject datum = current = arg_binds;
                                                final SubLObject _prev_bind_0_$77 = $mapping_index_arg$.currentBinding(thread);
                                                final SubLObject _prev_bind_3 = $mapping_pivot_arg$.currentBinding(thread);
                                                final SubLObject _prev_bind_4 = $mapping_target_arg$.currentBinding(thread);
                                                try {
                                                    $mapping_index_arg$.bind(NIL, thread);
                                                    $mapping_pivot_arg$.bind(NIL, thread);
                                                    $mapping_target_arg$.bind(NIL, thread);
                                                    destructuring_bind_must_consp(current, datum, $list69);
                                                    $mapping_index_arg$.setDynamicValue(current.first(), thread);
                                                    current = current.rest();
                                                    destructuring_bind_must_consp(current, datum, $list69);
                                                    $mapping_pivot_arg$.setDynamicValue(current.first(), thread);
                                                    current = current.rest();
                                                    destructuring_bind_must_consp(current, datum, $list69);
                                                    $mapping_target_arg$.setDynamicValue(current.first(), thread);
                                                    current = current.rest();
                                                    if (NIL == current) {
                                                        kb_gp_mapping.gp_map_arg_index(SEARCH_FOR_ANTI_TRANSITIVE_PRED_VIOLATION, v_term, $mapping_index_arg$.getDynamicValue(thread), $mapping_pred$.getDynamicValue(thread));
                                                    } else {
                                                        cdestructuring_bind_error(datum, $list69);
                                                    }
                                                } finally {
                                                    $mapping_target_arg$.rebind(_prev_bind_4, thread);
                                                    $mapping_pivot_arg$.rebind(_prev_bind_3, thread);
                                                    $mapping_index_arg$.rebind(_prev_bind_0_$77, thread);
                                                }
                                                cdolist_list_var = cdolist_list_var.rest();
                                                arg_binds = cdolist_list_var.first();
                                            } 
                                        } finally {
                                            $mapping_target$.rebind(_prev_bind_0_$76, thread);
                                        }
                                    }

                            } finally {
                                $mapping_pred$.rebind(_prev_bind_0_$73, thread);
                            }
                        }

                } finally {
                    at_vars.$within_at_mappingP$.rebind(_prev_bind_0_$70, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                catch_var = Errors.handleThrowable(ccatch_env_var, $AT_MAPPING_DONE);
            } finally {
                thread.throwStack.pop();
            }
            violations = $mapping_answer$.getDynamicValue(thread);
        } finally {
            $mapping_answer$.rebind(_prev_bind_0, thread);
        }
        return violations;
    }

    public static SubLObject best_gaf_lookup_index_for_anti_transitive(final SubLObject asent, final SubLObject truth, final SubLObject v_methods) {
        return kb_indexing.best_gaf_lookup_index(asent, truth, v_methods);
    }

    public static SubLObject search_for_anti_transitive_pred_violation(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)) {
            return search_for_anti_transitive_pred_violation_swap(assertion);
        }
        return search_for_anti_transitive_pred_violation_pivot(assertion);
    }

    public static SubLObject search_for_anti_transitive_pred_violation_pivot(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != at_gaf_assertionP(assertion)) {
            final SubLObject _prev_bind_0 = $mapping_path$.currentBinding(thread);
            try {
                $mapping_path$.bind(assertion, thread);
                final SubLObject pivot_constant = assertions_high.gaf_arg(assertion, misc_utilities.other_binary_arg($mapping_index_arg$.getDynamicValue(thread)));
                if (NIL != forts.fort_p(pivot_constant)) {
                    kb_gp_mapping.gp_map_arg_index(SELECT_ANTI_TRANSITIVE_PRED_VIOLATION, pivot_constant, $mapping_pivot_arg$.getDynamicValue(thread), $mapping_pred$.getDynamicValue(thread));
                }
            } finally {
                $mapping_path$.rebind(_prev_bind_0, thread);
            }
            return $mapping_answer$.getDynamicValue(thread);
        }
        return NIL;
    }

    public static SubLObject search_for_anti_transitive_pred_violation_swap(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != at_gaf_assertionP(assertion)) {
            final SubLObject _prev_bind_0 = $mapping_path$.currentBinding(thread);
            try {
                $mapping_path$.bind(assertion, thread);
                final SubLObject pivot_constant = assertions_high.gaf_arg(assertion, $mapping_index_arg$.getDynamicValue(thread));
                final SubLObject pivot_index = misc_utilities.other_binary_arg($mapping_pivot_arg$.getDynamicValue(thread));
                if (NIL != forts.fort_p(pivot_constant)) {
                    kb_gp_mapping.gp_map_arg_index(SELECT_ANTI_TRANSITIVE_PRED_VIOLATION, pivot_constant, pivot_index, $mapping_pred$.getDynamicValue(thread));
                }
            } finally {
                $mapping_path$.rebind(_prev_bind_0, thread);
            }
            return $mapping_answer$.getDynamicValue(thread);
        }
        return NIL;
    }

    public static SubLObject select_anti_transitive_pred_violation(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != at_gaf_assertionP(assertion)) {
            final SubLObject gaf = assertions_high.gaf_formula(assertion);
            final SubLObject target_arg = (NIL != kb_gp_mapping.$mapping_arg_swap$.getDynamicValue(thread)) ? misc_utilities.other_binary_arg($mapping_target_arg$.getDynamicValue(thread)) : $mapping_target_arg$.getDynamicValue(thread);
            if ($mapping_target$.getDynamicValue(thread).equal(literal_arg(gaf, target_arg, UNPROVIDED))) {
                $mapping_answer$.setDynamicValue(cons(assertion, $mapping_answer$.getDynamicValue(thread)), thread);
                if (NIL != at_vars.$gather_at_predicate_violationsP$.getDynamicValue(thread)) {
                    if (!$mapping_pred$.getDynamicValue(thread).equal(literal_predicate(gaf, UNPROVIDED))) {
                        SubLObject cdolist_list_var;
                        final SubLObject accomplices = cdolist_list_var = hl_supports.gaf_axioms_genl_mts(genl_predicates.why_genl_predicateP(literal_predicate(gaf, UNPROVIDED), $mapping_pred$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED), mt_relevance_macros.$mt$.getDynamicValue(thread));
                        SubLObject accomplice = NIL;
                        accomplice = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            if (NIL != term.kb_assertionP(accomplice)) {
                                final SubLObject item_var = accomplice;
                                if (NIL == member(item_var, at_vars.$at_predicate_violations$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                    at_vars.$at_predicate_violations$.setDynamicValue(cons(item_var, at_vars.$at_predicate_violations$.getDynamicValue(thread)), thread);
                                }
                            }
                            cdolist_list_var = cdolist_list_var.rest();
                            accomplice = cdolist_list_var.first();
                        } 
                    }
                    if (NIL == member(assertion, at_vars.$at_predicate_violations$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                        at_vars.$at_predicate_violations$.setDynamicValue(cons(assertion, at_vars.$at_predicate_violations$.getDynamicValue(thread)), thread);
                    }
                    final SubLObject item_var2 = $mapping_path$.getDynamicValue(thread);
                    if (NIL == member(item_var2, at_vars.$at_predicate_violations$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                        at_vars.$at_predicate_violations$.setDynamicValue(cons(item_var2, at_vars.$at_predicate_violations$.getDynamicValue(thread)), thread);
                    }
                }
                if (NIL == at_vars.$accumulating_at_violationsP$.getDynamicValue(thread)) {
                    at_utilities.at_mapping_finished();
                }
            }
        }
        return $mapping_answer$.getDynamicValue(thread);
    }

    public static SubLObject select_anti_transitive_pred_violation_via_pred(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != at_gaf_assertionP(assertion)) {
            final SubLObject gaf = assertions_high.gaf_formula(assertion);
            final SubLObject pred = literal_arg0(gaf, UNPROVIDED);
            final SubLObject arg1 = literal_arg1(gaf, UNPROVIDED);
            final SubLObject arg2 = literal_arg2(gaf, UNPROVIDED);
            if (arg1.equal(at_vars.$at_arg1$.getDynamicValue(thread))) {
                $mapping_data_1$.setDynamicValue(cons(arg2, $mapping_data_1$.getDynamicValue(thread)), thread);
                if (NIL != subl_promotions.memberP(arg2, $mapping_data_2$.getDynamicValue(thread), symbol_function(EQUAL), UNPROVIDED)) {
                    $mapping_answer$.setDynamicValue(cons(assertion, $mapping_answer$.getDynamicValue(thread)), thread);
                    if (NIL != at_vars.$gather_at_predicate_violationsP$.getDynamicValue(thread)) {
                        if (NIL == member(assertion, at_vars.$at_predicate_violations$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                            at_vars.$at_predicate_violations$.setDynamicValue(cons(assertion, at_vars.$at_predicate_violations$.getDynamicValue(thread)), thread);
                        }
                        final SubLObject _prev_bind_0 = at_vars.$fag_search_limit$.currentBinding(thread);
                        try {
                            at_vars.$fag_search_limit$.bind(NIL, thread);
                            final SubLObject accomplice = find_accessible_gaf(list(pred, arg2, at_vars.$at_arg2$.getDynamicValue(thread)), ZERO_INTEGER, UNPROVIDED, UNPROVIDED);
                            if (NIL != accomplice) {
                                final SubLObject item_var = accomplice;
                                if (NIL == member(item_var, at_vars.$at_predicate_violations$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                    at_vars.$at_predicate_violations$.setDynamicValue(cons(item_var, at_vars.$at_predicate_violations$.getDynamicValue(thread)), thread);
                                }
                            }
                        } finally {
                            at_vars.$fag_search_limit$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (NIL == at_vars.$accumulating_at_violationsP$.getDynamicValue(thread)) {
                        at_utilities.at_mapping_finished();
                    }
                }
            }
            if (arg2.equal(at_vars.$at_arg2$.getDynamicValue(thread))) {
                $mapping_data_2$.setDynamicValue(cons(arg1, $mapping_data_2$.getDynamicValue(thread)), thread);
                if (NIL != subl_promotions.memberP(arg1, $mapping_data_1$.getDynamicValue(thread), symbol_function(EQUAL), UNPROVIDED)) {
                    $mapping_answer$.setDynamicValue(cons(assertion, $mapping_answer$.getDynamicValue(thread)), thread);
                    if (NIL != at_vars.$gather_at_predicate_violationsP$.getDynamicValue(thread)) {
                        if (NIL == member(assertion, at_vars.$at_predicate_violations$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                            at_vars.$at_predicate_violations$.setDynamicValue(cons(assertion, at_vars.$at_predicate_violations$.getDynamicValue(thread)), thread);
                        }
                        final SubLObject _prev_bind_0 = at_vars.$fag_search_limit$.currentBinding(thread);
                        try {
                            at_vars.$fag_search_limit$.bind(NIL, thread);
                            final SubLObject accomplice = find_accessible_gaf(list(pred, at_vars.$at_arg1$.getDynamicValue(thread), arg1), ZERO_INTEGER, UNPROVIDED, UNPROVIDED);
                            if (NIL != accomplice) {
                                final SubLObject item_var = accomplice;
                                if (NIL == member(item_var, at_vars.$at_predicate_violations$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                    at_vars.$at_predicate_violations$.setDynamicValue(cons(item_var, at_vars.$at_predicate_violations$.getDynamicValue(thread)), thread);
                                }
                            }
                        } finally {
                            at_vars.$fag_search_limit$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (NIL == at_vars.$accumulating_at_violationsP$.getDynamicValue(thread)) {
                        at_utilities.at_mapping_finished();
                    }
                }
            }
        }
        return $mapping_answer$.getDynamicValue(thread);
    }

    public static SubLObject find_accessible_gaf(final SubLObject gaf_formula, SubLObject index, SubLObject mt, SubLObject truth) {
        if (index == UNPROVIDED) {
            index = NIL;
        }
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (truth == UNPROVIDED) {
            truth = $TRUE;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject assertion = NIL;
        final SubLObject _prev_bind_0 = $mapping_target$.currentBinding(thread);
        try {
            $mapping_target$.bind(gaf_formula, thread);
            final SubLObject mt_var = mt;
            final SubLObject _prev_bind_0_$79 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                final SubLObject obfuscated_formula = removal_modules_genlpreds_lookup.obfuscate_predicate(gaf_formula);
                if (NIL == cycl_utilities.expression_find_if($sym74$UNREIFIED_SKOLEM_TERM_, gaf_formula, NIL, UNPROVIDED)) {
                    final SubLObject _prev_bind_0_$80 = pred_relevance_macros.$relevant_pred_function$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$81 = pred_relevance_macros.$pred$.currentBinding(thread);
                    try {
                        pred_relevance_macros.$relevant_pred_function$.bind(RELEVANT_PRED_IS_SPEC_PRED, thread);
                        pred_relevance_macros.$pred$.bind(cycl_utilities.atomic_sentence_predicate(gaf_formula), thread);
                        final SubLObject l_index = kb_indexing.best_gaf_lookup_index(obfuscated_formula, truth, NIL);
                        final SubLObject pcase_var;
                        final SubLObject method = pcase_var = kb_mapping_macros.do_gli_extract_method(l_index);
                        if (pcase_var.eql($GAF_ARG)) {
                            thread.resetMultipleValues();
                            final SubLObject v_term = kb_mapping_macros.do_gli_vga_extract_keys(l_index);
                            final SubLObject argnum = thread.secondMultipleValue();
                            final SubLObject predicate = thread.thirdMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != argnum) {
                                if (NIL != predicate) {
                                    final SubLObject pred_var = predicate;
                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                                        SubLObject done_var = assertion;
                                        final SubLObject token_var = NIL;
                                        while (NIL == done_var) {
                                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                            if (NIL != valid) {
                                                SubLObject final_index_iterator = NIL;
                                                try {
                                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, truth, NIL);
                                                    SubLObject done_var_$82 = assertion;
                                                    final SubLObject token_var_$83 = NIL;
                                                    while (NIL == done_var_$82) {
                                                        final SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$83);
                                                        final SubLObject valid_$84 = makeBoolean(!token_var_$83.eql(as));
                                                        if (NIL != valid_$84) {
                                                            assertion = select_target_gaf(as);
                                                        }
                                                        done_var_$82 = makeBoolean((NIL == valid_$84) || (NIL != assertion));
                                                    } 
                                                } finally {
                                                    final SubLObject _prev_bind_0_$81 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        final SubLObject _values = getValuesAsVector();
                                                        if (NIL != final_index_iterator) {
                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                        }
                                                        restoreValuesFromVector(_values);
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$81, thread);
                                                    }
                                                }
                                            }
                                            done_var = makeBoolean((NIL == valid) || (NIL != assertion));
                                        } 
                                    }
                                } else {
                                    final SubLObject pred_var = NIL;
                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, argnum, pred_var)) {
                                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, argnum, pred_var);
                                        SubLObject done_var = assertion;
                                        final SubLObject token_var = NIL;
                                        while (NIL == done_var) {
                                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                            if (NIL != valid) {
                                                SubLObject final_index_iterator = NIL;
                                                try {
                                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, truth, NIL);
                                                    SubLObject done_var_$83 = assertion;
                                                    final SubLObject token_var_$84 = NIL;
                                                    while (NIL == done_var_$83) {
                                                        final SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$84);
                                                        final SubLObject valid_$85 = makeBoolean(!token_var_$84.eql(as));
                                                        if (NIL != valid_$85) {
                                                            assertion = select_target_gaf(as);
                                                        }
                                                        done_var_$83 = makeBoolean((NIL == valid_$85) || (NIL != assertion));
                                                    } 
                                                } finally {
                                                    final SubLObject _prev_bind_0_$82 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        final SubLObject _values2 = getValuesAsVector();
                                                        if (NIL != final_index_iterator) {
                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                        }
                                                        restoreValuesFromVector(_values2);
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$82, thread);
                                                    }
                                                }
                                            }
                                            done_var = makeBoolean((NIL == valid) || (NIL != assertion));
                                        } 
                                    }
                                }
                            } else
                                if (NIL != predicate) {
                                    final SubLObject pred_var = predicate;
                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                                        SubLObject done_var = assertion;
                                        final SubLObject token_var = NIL;
                                        while (NIL == done_var) {
                                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                            if (NIL != valid) {
                                                SubLObject final_index_iterator = NIL;
                                                try {
                                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, truth, NIL);
                                                    SubLObject done_var_$84 = assertion;
                                                    final SubLObject token_var_$85 = NIL;
                                                    while (NIL == done_var_$84) {
                                                        final SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$85);
                                                        final SubLObject valid_$86 = makeBoolean(!token_var_$85.eql(as));
                                                        if (NIL != valid_$86) {
                                                            assertion = select_target_gaf(as);
                                                        }
                                                        done_var_$84 = makeBoolean((NIL == valid_$86) || (NIL != assertion));
                                                    } 
                                                } finally {
                                                    final SubLObject _prev_bind_0_$83 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        final SubLObject _values3 = getValuesAsVector();
                                                        if (NIL != final_index_iterator) {
                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                        }
                                                        restoreValuesFromVector(_values3);
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$83, thread);
                                                    }
                                                }
                                            }
                                            done_var = makeBoolean((NIL == valid) || (NIL != assertion));
                                        } 
                                    }
                                } else {
                                    final SubLObject pred_var = NIL;
                                    if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, NIL, pred_var)) {
                                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, NIL, pred_var);
                                        SubLObject done_var = assertion;
                                        final SubLObject token_var = NIL;
                                        while (NIL == done_var) {
                                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                            if (NIL != valid) {
                                                SubLObject final_index_iterator = NIL;
                                                try {
                                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, truth, NIL);
                                                    SubLObject done_var_$85 = assertion;
                                                    final SubLObject token_var_$86 = NIL;
                                                    while (NIL == done_var_$85) {
                                                        final SubLObject as = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$86);
                                                        final SubLObject valid_$87 = makeBoolean(!token_var_$86.eql(as));
                                                        if (NIL != valid_$87) {
                                                            assertion = select_target_gaf(as);
                                                        }
                                                        done_var_$85 = makeBoolean((NIL == valid_$87) || (NIL != assertion));
                                                    } 
                                                } finally {
                                                    final SubLObject _prev_bind_0_$84 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        final SubLObject _values4 = getValuesAsVector();
                                                        if (NIL != final_index_iterator) {
                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                        }
                                                        restoreValuesFromVector(_values4);
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$84, thread);
                                                    }
                                                }
                                            }
                                            done_var = makeBoolean((NIL == valid) || (NIL != assertion));
                                        } 
                                    }
                                }

                        } else
                            if (pcase_var.eql($PREDICATE_EXTENT)) {
                                final SubLObject pred_var2 = kb_mapping_macros.do_gli_vpe_extract_key(l_index);
                                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var2)) {
                                    final SubLObject str = NIL;
                                    final SubLObject _prev_bind_0_$85 = $progress_start_time$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$82 = $progress_last_pacification_time$.currentBinding(thread);
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
                                        final SubLObject iterator_var2 = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var2);
                                        SubLObject done_var2 = assertion;
                                        final SubLObject token_var2 = NIL;
                                        while (NIL == done_var2) {
                                            final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                            final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                                            if (NIL != valid2) {
                                                note_progress();
                                                SubLObject final_index_iterator2 = NIL;
                                                try {
                                                    final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, truth, NIL);
                                                    SubLObject done_var_$86 = assertion;
                                                    final SubLObject token_var_$87 = NIL;
                                                    while (NIL == done_var_$86) {
                                                        final SubLObject as2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$87);
                                                        final SubLObject valid_$88 = makeBoolean(!token_var_$87.eql(as2));
                                                        if (NIL != valid_$88) {
                                                            assertion = select_target_gaf(as2);
                                                        }
                                                        done_var_$86 = makeBoolean((NIL == valid_$88) || (NIL != assertion));
                                                    } 
                                                } finally {
                                                    final SubLObject _prev_bind_0_$86 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        final SubLObject _values5 = getValuesAsVector();
                                                        if (NIL != final_index_iterator2) {
                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                                        }
                                                        restoreValuesFromVector(_values5);
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$86, thread);
                                                    }
                                                }
                                            }
                                            done_var2 = makeBoolean((NIL == valid2) || (NIL != assertion));
                                        } 
                                        noting_progress_postamble();
                                    } finally {
                                        $silent_progressP$.rebind(_prev_bind_8, thread);
                                        $is_noting_progressP$.rebind(_prev_bind_7, thread);
                                        $progress_count$.rebind(_prev_bind_6, thread);
                                        $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                                        $progress_notification_count$.rebind(_prev_bind_4, thread);
                                        $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                                        $progress_last_pacification_time$.rebind(_prev_bind_1_$82, thread);
                                        $progress_start_time$.rebind(_prev_bind_0_$85, thread);
                                    }
                                }
                            } else
                                if (pcase_var.eql($OVERLAP)) {
                                    SubLObject rest;
                                    SubLObject as3;
                                    for (rest = NIL, rest = virtual_indexing.gather_overlap_index(kb_mapping_macros.do_gli_vo_extract_key(l_index), UNPROVIDED); (NIL == assertion) && (NIL != rest); rest = rest.rest()) {
                                        as3 = rest.first();
                                        if ((NIL == truth) || (NIL != assertions_high.assertion_has_truth(as3, truth))) {
                                            assertion = select_target_gaf(as3);
                                        }
                                    }
                                } else {
                                    kb_mapping_macros.do_gli_method_error(l_index, method);
                                }


                    } finally {
                        pred_relevance_macros.$pred$.rebind(_prev_bind_1_$81, thread);
                        pred_relevance_macros.$relevant_pred_function$.rebind(_prev_bind_0_$80, thread);
                    }
                }
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$79, thread);
            }
        } finally {
            $mapping_target$.rebind(_prev_bind_0, thread);
        }
        return assertion;
    }

    public static SubLObject select_target_gaf(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != at_gaf_assertionP(assertion)) {
            final SubLObject gaf_formula = assertions_high.gaf_formula(assertion);
            if (literal_args($mapping_target$.getDynamicValue(thread), UNPROVIDED).equal(literal_args(gaf_formula, UNPROVIDED)) && (literal_predicate($mapping_target$.getDynamicValue(thread), UNPROVIDED).equal(literal_predicate(gaf_formula, UNPROVIDED)) || (NIL != genl_predicates.genl_predicateP(literal_predicate($mapping_target$.getDynamicValue(thread), UNPROVIDED), literal_predicate(gaf_formula, UNPROVIDED), UNPROVIDED, UNPROVIDED)))) {
                return assertion;
            }
        }
        return NIL;
    }

    public static SubLObject gaf_ok_wrt_negation_predsP(final SubLObject gaf, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred = cycl_utilities.reify_arg_when_closed_naut(gaf, ZERO_INTEGER);
        final SubLObject arg1 = cycl_utilities.reify_arg_when_closed_naut(gaf, ONE_INTEGER);
        final SubLObject arg2 = cycl_utilities.reify_arg_when_closed_naut(gaf, TWO_INTEGER);
        SubLObject violations = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            violations = negation_pred_violations(pred, arg1, arg2);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return sublisp_null(violations);
    }

    public static SubLObject negation_pred_violations(final SubLObject pred, final SubLObject arg1, final SubLObject arg2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject doneP = NIL;
        SubLObject violations = NIL;
        final SubLObject args = remove(NIL, list(arg1, arg2), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL == doneP) {
            SubLObject csome_list_var = negation_predicate.max_negation_preds(pred, UNPROVIDED);
            SubLObject negation_pred = NIL;
            negation_pred = csome_list_var.first();
            while ((NIL == doneP) && (NIL != csome_list_var)) {
                final SubLObject assertion = find_accessible_gaf(czer_main.canonicalize_literal_commutative_terms(make_el_literal(negation_pred, args, UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL != term.kb_assertionP(assertion)) {
                    final SubLObject _prev_bind_0 = at_vars.$gather_at_predicate_violationsP$.currentBinding(thread);
                    final SubLObject _prev_bind_2 = at_vars.$at_predicate_violations$.currentBinding(thread);
                    try {
                        at_vars.$gather_at_predicate_violationsP$.bind(T, thread);
                        at_vars.$at_predicate_violations$.bind(NIL, thread);
                        final SubLObject item_var = assertion;
                        if (NIL == member(item_var, at_vars.$at_predicate_violations$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                            at_vars.$at_predicate_violations$.setDynamicValue(cons(item_var, at_vars.$at_predicate_violations$.getDynamicValue(thread)), thread);
                        }
                        final SubLObject _prev_bind_0_$104 = at_vars.$at_pred$.currentBinding(thread);
                        try {
                            at_vars.$at_pred$.bind($$negationPreds, thread);
                            if (NIL != at_vars.$at_pred$.getDynamicValue(thread)) {
                                at_utilities.at_handle_mal_constraint(negation_pred);
                            }
                        } finally {
                            at_vars.$at_pred$.rebind(_prev_bind_0_$104, thread);
                        }
                    } finally {
                        at_vars.$at_predicate_violations$.rebind(_prev_bind_2, thread);
                        at_vars.$gather_at_predicate_violationsP$.rebind(_prev_bind_0, thread);
                    }
                    violations = cons(negation_pred, violations);
                    if (NIL == at_vars.$accumulating_at_violationsP$.getDynamicValue(thread)) {
                        doneP = T;
                    }
                }
                csome_list_var = csome_list_var.rest();
                negation_pred = csome_list_var.first();
            } 
        }
        return violations;
    }

    public static SubLObject gaf_ok_wrt_negation_inversesP(final SubLObject gaf, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pred = cycl_utilities.reify_arg_when_closed_naut(gaf, ZERO_INTEGER);
        final SubLObject arg1 = cycl_utilities.reify_arg_when_closed_naut(gaf, ONE_INTEGER);
        final SubLObject arg2 = cycl_utilities.reify_arg_when_closed_naut(gaf, TWO_INTEGER);
        SubLObject violations = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            violations = negation_inverse_violations(pred, arg1, arg2);
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return sublisp_null(violations);
    }

    public static SubLObject negation_inverse_violations(final SubLObject pred, final SubLObject arg1, final SubLObject arg2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject doneP = NIL;
        SubLObject violations = NIL;
        if ((NIL != arg1) && (NIL != arg2)) {
            final SubLObject args = list(arg2, arg1);
            if (NIL == doneP) {
                SubLObject csome_list_var = negation_predicate.max_negation_inverses(pred, UNPROVIDED);
                SubLObject negation_inverse = NIL;
                negation_inverse = csome_list_var.first();
                while ((NIL == doneP) && (NIL != csome_list_var)) {
                    final SubLObject assertion = find_accessible_gaf(czer_main.canonicalize_literal_commutative_terms(make_el_literal(negation_inverse, args, UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    if (NIL != term.kb_assertionP(assertion)) {
                        final SubLObject _prev_bind_0 = at_vars.$gather_at_predicate_violationsP$.currentBinding(thread);
                        final SubLObject _prev_bind_2 = at_vars.$at_predicate_violations$.currentBinding(thread);
                        try {
                            at_vars.$gather_at_predicate_violationsP$.bind(T, thread);
                            at_vars.$at_predicate_violations$.bind(NIL, thread);
                            final SubLObject item_var = assertion;
                            if (NIL == member(item_var, at_vars.$at_predicate_violations$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                                at_vars.$at_predicate_violations$.setDynamicValue(cons(item_var, at_vars.$at_predicate_violations$.getDynamicValue(thread)), thread);
                            }
                            final SubLObject _prev_bind_0_$105 = at_vars.$at_pred$.currentBinding(thread);
                            try {
                                at_vars.$at_pred$.bind($$negationInverse, thread);
                                if (NIL != at_vars.$at_pred$.getDynamicValue(thread)) {
                                    at_utilities.at_handle_mal_constraint(negation_inverse);
                                }
                            } finally {
                                at_vars.$at_pred$.rebind(_prev_bind_0_$105, thread);
                            }
                        } finally {
                            at_vars.$at_predicate_violations$.rebind(_prev_bind_2, thread);
                            at_vars.$gather_at_predicate_violationsP$.rebind(_prev_bind_0, thread);
                        }
                        violations = cons(negation_inverse, violations);
                        if (NIL == at_vars.$accumulating_at_violationsP$.getDynamicValue(thread)) {
                            doneP = T;
                        }
                    }
                    csome_list_var = csome_list_var.rest();
                    negation_inverse = csome_list_var.first();
                } 
            }
        }
        return violations;
    }

    public static SubLObject clear_cached_format_okP() {
        final SubLObject cs = $cached_format_okP_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_cached_format_okP(final SubLObject format) {
        return memoization_state.caching_state_remove_function_results_with_args($cached_format_okP_caching_state$.getGlobalValue(), list(format), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cached_format_okP_internal(final SubLObject format) {
        return at_format_okP(format, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject cached_format_okP(final SubLObject format) {
        SubLObject caching_state = $cached_format_okP_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name($sym80$CACHED_FORMAT_OK_, $sym81$_CACHED_FORMAT_OK__CACHING_STATE_, $int$128, EQL, ONE_INTEGER, EIGHT_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, format, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(cached_format_okP_internal(format)));
            memoization_state.caching_state_put(caching_state, format, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject memoized_format_okP_internal(final SubLObject format, final SubLObject literal, final SubLObject argnum, final SubLObject mt) {
        return at_format_okP(format, literal, argnum, mt);
    }

    public static SubLObject memoized_format_okP(final SubLObject format, final SubLObject literal, final SubLObject argnum, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return memoized_format_okP_internal(format, literal, argnum, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym83$MEMOIZED_FORMAT_OK_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym83$MEMOIZED_FORMAT_OK_, FOUR_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym83$MEMOIZED_FORMAT_OK_, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(format, literal, argnum, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (format.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (literal.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (argnum.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(memoized_format_okP_internal(format, literal, argnum, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(format, literal, argnum, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject at_format_okP(final SubLObject format, SubLObject literal, SubLObject argnum, SubLObject mt) {
        if (literal == UNPROVIDED) {
            literal = at_vars.$at_formula$.getDynamicValue();
        }
        if (argnum == UNPROVIDED) {
            argnum = at_vars.$at_argnum$.getDynamicValue();
        }
        if (mt == UNPROVIDED) {
            mt = mt_relevance_macros.$mt$.getDynamicValue();
        }
        if (format.eql($$SingleEntry)) {
            return single_entry_okP(literal, argnum, mt);
        }
        if (format.eql($$IntervalEntry)) {
            return interval_entry_okP(literal, argnum, mt);
        }
        if (format.eql($$SetTheFormat)) {
            return set_entry_okP(literal, argnum, mt);
        }
        if (format.eql($$singleEntryFormatInArgs)) {
            return single_entry_okP(literal, argnum, mt);
        }
        if (format.eql($$intervalEntryFormatInArgs)) {
            return interval_entry_okP(literal, argnum, mt);
        }
        if (format.eql($$openEntryFormatInArgs)) {
            return set_entry_okP(literal, argnum, mt);
        }
        if (format.eql($const90$temporallyIntersectingEntryFormat)) {
            return temporally_intersecting_okP(literal, argnum, mt);
        }
        if (format.eql($const91$spatiallyIntersectingEntryFormatI)) {
            return spatially_intersecting_okP(literal, argnum, mt);
        }
        if (format.eql($const92$spatioTemporallyIntersectingEntry)) {
            return spatio_temporally__intersecting_okP(literal, argnum, mt);
        }
        el_error(THREE_INTEGER, $str93$unknown_entry_format___s, format, UNPROVIDED, UNPROVIDED);
        return T;
    }

    public static SubLObject single_entry_okP(final SubLObject literal, final SubLObject argnum, final SubLObject mt) {
        return sublisp_null(sef_violations(literal, argnum, mt));
    }

    public static SubLObject literal_single_entry_okP(final SubLObject literal, final SubLObject argnum, final SubLObject mt) {
        return single_entry_okP(literal, argnum, mt);
    }

    public static SubLObject why_not_literal_single_entry_okP(final SubLObject literal, final SubLObject argnum, final SubLObject mt, SubLObject assertion) {
        if (assertion == UNPROVIDED) {
            assertion = czer_meta.find_assertion_cycl(literal, mt);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject violations = NIL;
        final SubLObject _prev_bind_0 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
        try {
            at_vars.$accumulating_at_violationsP$.bind(T, thread);
            violations = sef_violations(literal, argnum, mt);
        } finally {
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_0, thread);
        }
        if (NIL != violations) {
            final SubLObject var = assertion;
            if (NIL != var) {
                violations = cons(var, violations);
            }
        }
        return violations;
    }

    public static SubLObject sef_violations(final SubLObject literal, final SubLObject argnum, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject violations = NIL;
        final SubLObject find_formula = list_utilities.replace_nth(argnum, variables.find_variable_by_id(ZERO_INTEGER), literal);
        final SubLObject arg = cycl_utilities.reify_arg_when_closed_naut(literal, argnum);
        if ((NIL == wff_vars.validating_expansionP()) || (NIL == unification_utilities.asent_unify(wff_vars.unexpanded_formula(), find_formula, T, UNPROVIDED))) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
                final SubLObject lookup_index = kb_indexing.best_gaf_lookup_index(find_formula, $TRUE, $list55);
                final SubLObject index_type = kb_indexing.lookup_index_get_type(lookup_index);
                SubLObject doneP = NIL;
                SubLObject catch_var = NIL;
                try {
                    thread.throwStack.push($AT_MAPPING_DONE);
                    final SubLObject _prev_bind_0_$106 = at_vars.$within_at_mappingP$.currentBinding(thread);
                    try {
                        at_vars.$within_at_mappingP$.bind(T, thread);
                        final SubLObject pcase_var = index_type;
                        if (pcase_var.eql($PREDICATE_EXTENT)) {
                            final SubLObject predicate = kb_indexing.lookup_index_predicate_extent_value(lookup_index);
                            if (NIL != check_inter_assert_format_wXo_arg_indexP(find_formula)) {
                                final SubLObject pred_var = predicate;
                                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                    final SubLObject str = NIL;
                                    final SubLObject _prev_bind_0_$107 = $progress_start_time$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$108 = $progress_last_pacification_time$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$109 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
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
                                        final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                        SubLObject done_var = doneP;
                                        final SubLObject token_var = NIL;
                                        while (NIL == done_var) {
                                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                            if (NIL != valid) {
                                                note_progress();
                                                SubLObject final_index_iterator = NIL;
                                                try {
                                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                    SubLObject done_var_$110 = doneP;
                                                    final SubLObject token_var_$111 = NIL;
                                                    while (NIL == done_var_$110) {
                                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$111);
                                                        final SubLObject valid_$112 = makeBoolean(!token_var_$111.eql(assertion));
                                                        if ((NIL != valid_$112) && (NIL != sef_violating_assertionP(assertion, find_formula, arg, argnum))) {
                                                            violations = cons(assertion, violations);
                                                            if (NIL == at_vars.$accumulating_at_violationsP$.getDynamicValue(thread)) {
                                                                doneP = T;
                                                            }
                                                        }
                                                        done_var_$110 = makeBoolean((NIL == valid_$112) || (NIL != doneP));
                                                    } 
                                                } finally {
                                                    final SubLObject _prev_bind_0_$108 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                    try {
                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                        final SubLObject _values = getValuesAsVector();
                                                        if (NIL != final_index_iterator) {
                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                        }
                                                        restoreValuesFromVector(_values);
                                                    } finally {
                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$108, thread);
                                                    }
                                                }
                                            }
                                            done_var = makeBoolean((NIL == valid) || (NIL != doneP));
                                        } 
                                        noting_progress_postamble();
                                    } finally {
                                        $silent_progressP$.rebind(_prev_bind_8, thread);
                                        $is_noting_progressP$.rebind(_prev_bind_7, thread);
                                        $progress_count$.rebind(_prev_bind_6, thread);
                                        $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                                        $progress_notification_count$.rebind(_prev_bind_4, thread);
                                        $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$109, thread);
                                        $progress_last_pacification_time$.rebind(_prev_bind_1_$108, thread);
                                        $progress_start_time$.rebind(_prev_bind_0_$107, thread);
                                    }
                                }
                            }
                        } else
                            if (pcase_var.eql($GAF_ARG)) {
                                thread.resetMultipleValues();
                                final SubLObject v_term = kb_indexing.lookup_index_gaf_arg_values(lookup_index);
                                final SubLObject largnum = thread.secondMultipleValue();
                                final SubLObject predicate2 = thread.thirdMultipleValue();
                                thread.resetMultipleValues();
                                final SubLObject pred_var2 = predicate2;
                                if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, largnum, pred_var2)) {
                                    final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, largnum, pred_var2);
                                    SubLObject done_var2 = doneP;
                                    final SubLObject token_var2 = NIL;
                                    while (NIL == done_var2) {
                                        final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                        final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                                        if (NIL != valid2) {
                                            SubLObject final_index_iterator2 = NIL;
                                            try {
                                                final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, NIL, NIL);
                                                SubLObject done_var_$111 = doneP;
                                                final SubLObject token_var_$112 = NIL;
                                                while (NIL == done_var_$111) {
                                                    final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$112);
                                                    final SubLObject valid_$113 = makeBoolean(!token_var_$112.eql(assertion2));
                                                    if ((NIL != valid_$113) && (NIL != sef_violating_assertionP(assertion2, find_formula, arg, argnum))) {
                                                        violations = cons(assertion2, violations);
                                                        if (NIL == at_vars.$accumulating_at_violationsP$.getDynamicValue(thread)) {
                                                            doneP = T;
                                                        }
                                                    }
                                                    done_var_$111 = makeBoolean((NIL == valid_$113) || (NIL != doneP));
                                                } 
                                            } finally {
                                                final SubLObject _prev_bind_0_$109 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                try {
                                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                                    final SubLObject _values2 = getValuesAsVector();
                                                    if (NIL != final_index_iterator2) {
                                                        kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                                    }
                                                    restoreValuesFromVector(_values2);
                                                } finally {
                                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$109, thread);
                                                }
                                            }
                                        }
                                        done_var2 = makeBoolean((NIL == valid2) || (NIL != doneP));
                                    } 
                                }
                            }

                    } finally {
                        at_vars.$within_at_mappingP$.rebind(_prev_bind_0_$106, thread);
                    }
                } catch (final Throwable ccatch_env_var) {
                    catch_var = Errors.handleThrowable(ccatch_env_var, $AT_MAPPING_DONE);
                } finally {
                    thread.throwStack.pop();
                }
            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return violations;
    }

    public static SubLObject check_inter_assert_format_wXo_arg_indexP(final SubLObject formula) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != at_vars.$at_check_inter_assert_format_wXo_arg_indexP$.getDynamicValue(thread)) && (NIL != formula)) {
            if (!at_vars.$at_check_inter_assert_format_wXo_arg_index_gaf_count_threshold$.getDynamicValue(thread).isNumber()) {
                return T;
            }
            final SubLObject predicate = literal_predicate(formula, UNPROVIDED);
            final SubLObject gaf_count = (NIL != forts.fort_p(predicate)) ? kb_indexing.relevant_num_predicate_extent_index(predicate) : NIL;
            if (gaf_count.isNumber()) {
                return numGE(at_vars.$at_check_inter_assert_format_wXo_arg_index_gaf_count_threshold$.getDynamicValue(thread), gaf_count);
            }
        }
        return NIL;
    }

    public static SubLObject sef_violating_assertionP(final SubLObject assertion, final SubLObject find_formula, final SubLObject arg, final SubLObject argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL != at_gaf_assertionP(assertion)) && (NIL != assertion_utilities.true_assertionP(assertion))) {
            final SubLObject gaf = assertions_high.gaf_formula(assertion);
            if (NIL != unification_utilities.asent_unify(find_formula, gaf, T, UNPROVIDED)) {
                if (((NIL != wff_vars.wff_assertiveP()) && (NIL != isa.quoted_isaP(arg, $$IndeterminateTerm, UNPROVIDED, UNPROVIDED))) && (NIL == equals.differentP_binary(arg, assertions_high.gaf_arg(assertion, argnum), UNPROVIDED))) {
                    return NIL;
                }
                if (NIL == equals.equalsP(arg, cycl_utilities.reify_arg_when_closed_naut(gaf, argnum), UNPROVIDED, UNPROVIDED)) {
                    if ((NIL != at_vars.$gather_at_format_violationsP$.getDynamicValue(thread)) && (NIL == member(assertion, at_vars.$at_format_violations$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY)))) {
                        at_vars.$at_format_violations$.setDynamicValue(cons(assertion, at_vars.$at_format_violations$.getDynamicValue(thread)), thread);
                    }
                    return T;
                }
            }
        }
        return NIL;
    }

    public static SubLObject temporally_intersecting_okP(final SubLObject literal, final SubLObject argnum, final SubLObject mt) {
        return sublisp_null(tief_violations(literal, argnum, mt));
    }

    public static SubLObject tief_violations(final SubLObject literal, final SubLObject argnum, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject violations = NIL;
        final SubLObject find_formula = list_utilities.replace_nth(argnum, variables.find_variable_by_id(ZERO_INTEGER), literal);
        final SubLObject arg = cycl_utilities.reify_arg_when_closed_naut(literal, argnum);
        if ((NIL == wff_vars.validating_expansionP()) || (NIL == unification_utilities.asent_unify(wff_vars.unexpanded_formula(), find_formula, T, UNPROVIDED))) {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
            try {
                mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt), thread);
                mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt), thread);
                mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt), thread);
                final SubLObject lookup_index = kb_indexing.best_gaf_lookup_index(find_formula, $TRUE, $list55);
                final SubLObject index_type = kb_indexing.lookup_index_get_type(lookup_index);
                SubLObject doneP = NIL;
                final SubLObject pcase_var = index_type;
                if (pcase_var.eql($PREDICATE_EXTENT)) {
                    final SubLObject predicate = kb_indexing.lookup_index_predicate_extent_value(lookup_index);
                    if (NIL != check_inter_assert_format_wXo_arg_indexP(find_formula)) {
                        final SubLObject pred_var = predicate;
                        if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                            final SubLObject str = NIL;
                            final SubLObject _prev_bind_0_$118 = $progress_start_time$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$119 = $progress_last_pacification_time$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$120 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
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
                                final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                                SubLObject done_var = doneP;
                                final SubLObject token_var = NIL;
                                while (NIL == done_var) {
                                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                    if (NIL != valid) {
                                        note_progress();
                                        SubLObject final_index_iterator = NIL;
                                        try {
                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                            SubLObject done_var_$121 = doneP;
                                            final SubLObject token_var_$122 = NIL;
                                            while (NIL == done_var_$121) {
                                                final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$122);
                                                final SubLObject valid_$123 = makeBoolean(!token_var_$122.eql(assertion));
                                                if ((NIL != valid_$123) && (NIL != tief_violating_assertionP(assertion, find_formula, arg, argnum))) {
                                                    violations = cons(assertion, violations);
                                                    if (NIL == at_vars.$accumulating_at_violationsP$.getDynamicValue(thread)) {
                                                        doneP = T;
                                                    }
                                                }
                                                done_var_$121 = makeBoolean((NIL == valid_$123) || (NIL != doneP));
                                            } 
                                        } finally {
                                            final SubLObject _prev_bind_0_$119 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values = getValuesAsVector();
                                                if (NIL != final_index_iterator) {
                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                }
                                                restoreValuesFromVector(_values);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$119, thread);
                                            }
                                        }
                                    }
                                    done_var = makeBoolean((NIL == valid) || (NIL != doneP));
                                } 
                                noting_progress_postamble();
                            } finally {
                                $silent_progressP$.rebind(_prev_bind_8, thread);
                                $is_noting_progressP$.rebind(_prev_bind_7, thread);
                                $progress_count$.rebind(_prev_bind_6, thread);
                                $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                                $progress_notification_count$.rebind(_prev_bind_4, thread);
                                $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_2_$120, thread);
                                $progress_last_pacification_time$.rebind(_prev_bind_1_$119, thread);
                                $progress_start_time$.rebind(_prev_bind_0_$118, thread);
                            }
                        }
                    }
                } else
                    if (pcase_var.eql($GAF_ARG)) {
                        thread.resetMultipleValues();
                        final SubLObject v_term = kb_indexing.lookup_index_gaf_arg_values(lookup_index);
                        final SubLObject largnum = thread.secondMultipleValue();
                        final SubLObject predicate2 = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        final SubLObject pred_var2 = predicate2;
                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(v_term, largnum, pred_var2)) {
                            final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(v_term, largnum, pred_var2);
                            SubLObject done_var2 = doneP;
                            final SubLObject token_var2 = NIL;
                            while (NIL == done_var2) {
                                final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                                if (NIL != valid2) {
                                    SubLObject final_index_iterator2 = NIL;
                                    try {
                                        final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, NIL, NIL);
                                        SubLObject done_var_$122 = doneP;
                                        final SubLObject token_var_$123 = NIL;
                                        while (NIL == done_var_$122) {
                                            final SubLObject assertion2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$123);
                                            final SubLObject valid_$124 = makeBoolean(!token_var_$123.eql(assertion2));
                                            if ((NIL != valid_$124) && (NIL != tief_violating_assertionP(assertion2, find_formula, arg, argnum))) {
                                                violations = cons(assertion2, violations);
                                                if (NIL == at_vars.$accumulating_at_violationsP$.getDynamicValue(thread)) {
                                                    doneP = T;
                                                }
                                            }
                                            done_var_$122 = makeBoolean((NIL == valid_$124) || (NIL != doneP));
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_0_$120 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values2 = getValuesAsVector();
                                            if (NIL != final_index_iterator2) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                            }
                                            restoreValuesFromVector(_values2);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$120, thread);
                                        }
                                    }
                                }
                                done_var2 = makeBoolean((NIL == valid2) || (NIL != doneP));
                            } 
                        }
                    }

            } finally {
                mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
            }
        }
        return violations;
    }

    public static SubLObject tief_violating_assertionP(final SubLObject assertion, final SubLObject find_formula, final SubLObject arg, final SubLObject argnum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != at_gaf_assertionP(assertion)) {
            final SubLObject gaf = assertions_high.gaf_formula(assertion);
            if ((NIL != unification_utilities.asent_unify(find_formula, gaf, T, UNPROVIDED)) && (NIL != sbhl_time_modules.temporally_disjointP(arg, literal_arg(gaf, argnum, UNPROVIDED), UNPROVIDED))) {
                if ((NIL != at_vars.$gather_at_format_violationsP$.getDynamicValue(thread)) && (NIL == member(assertion, at_vars.$at_format_violations$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY)))) {
                    at_vars.$at_format_violations$.setDynamicValue(cons(assertion, at_vars.$at_format_violations$.getDynamicValue(thread)), thread);
                }
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject spatially_intersecting_okP(final SubLObject literal, final SubLObject argnum, final SubLObject mt) {
        return sublisp_null(sief_violations(literal, argnum, mt));
    }

    public static SubLObject sief_violations(final SubLObject literal, final SubLObject argnum, final SubLObject mt) {
        return NIL;
    }

    public static SubLObject sief_violating_assertionP(final SubLObject assertion, final SubLObject find_formula, final SubLObject arg, final SubLObject argnum) {
        return NIL;
    }

    public static SubLObject spatio_temporally__intersecting_okP(final SubLObject literal, final SubLObject argnum, final SubLObject mt) {
        return sublisp_null(stief_violations(literal, argnum, mt));
    }

    public static SubLObject stief_violations(final SubLObject literal, final SubLObject argnum, final SubLObject mt) {
        final SubLObject tief_violations = tief_violations(literal, argnum, mt);
        final SubLObject sief_violations = sief_violations(literal, argnum, mt);
        return append(tief_violations, sief_violations);
    }

    public static SubLObject interval_entry_okP(final SubLObject literal, final SubLObject argnum, final SubLObject mt) {
        return T;
    }

    public static SubLObject set_entry_okP(final SubLObject literal, final SubLObject argnum, final SubLObject mt) {
        return T;
    }

    public static SubLObject variable_wrt_arg_typeP(final SubLObject arg) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == wff_vars.$recognize_variablesP$.getDynamicValue(thread)) {
            return NIL;
        }
        if (NIL != variable_term_wrt_arg_typeP(arg)) {
            return T;
        }
        if ((NIL != term.first_order_nautP(arg)) && (((NIL != kb_accessors.result_isaP(cycl_utilities.nat_functor(arg), UNPROVIDED)) || (NIL != kb_accessors.result_isa_argP(cycl_utilities.nat_functor(arg), UNPROVIDED))) || (NIL != kb_accessors.result_isa_arg_arg_isaP(arg, UNPROVIDED)))) {
            return NIL;
        }
        if ((NIL != term.nautP(arg, UNPROVIDED)) && (NIL != cycl_utilities.formula_find_if($sym27$VARIABLE_TERM_WRT_ARG_TYPE_, arg, UNPROVIDED, UNPROVIDED))) {
            return T;
        }
        return NIL;
    }

    public static SubLObject variable_term_wrt_arg_typeP(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(((((((NIL != cycl_variables.el_varP(v_term)) || (NIL != cycl_variables.kb_varP(v_term))) || ((NIL != wff_vars.$permit_generic_arg_variablesP$.getDynamicValue(thread)) && (NIL != at_admitted.generic_arg_p(v_term)))) || ((NIL != wff_vars.$permit_keyword_variablesP$.getDynamicValue(thread)) && v_term.isKeyword())) || (NIL != term.reified_skolem_termP(v_term))) || (NIL != term.unreified_skolem_termP(v_term))) || ((NIL != kb_control_vars.$relax_type_restrictions_for_nats$.getDynamicValue(thread)) && (NIL != nart_handles.nart_p(v_term))));
    }

    public static SubLObject naut_wrt_arg_typeP(final SubLObject v_term, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(((NIL != at_vars.$within_decontextualizedP$.getDynamicValue(thread)) && (NIL != narts_high.naut_p(v_term))) || (((NIL == nart_handles.nart_p(v_term)) && (NIL != term.function_termP(v_term))) && ((NIL != forts.fort_p(cycl_utilities.nat_functor(v_term))) || (NIL == czer_utilities.leave_some_terms_at_el_for_argP(at_vars.$at_reln$.getDynamicValue(thread), at_vars.$at_argnum$.getDynamicValue(thread), mt)))));
    }

    public static SubLObject tou_wrt_arg_typeP(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return eql(at_vars.$at_reln$.getDynamicValue(thread), $$termOfUnit);
    }

    public static SubLObject nat_function_wrt_arg_typeP(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return eql(at_vars.$at_reln$.getDynamicValue(thread), $$natFunction);
    }

    public static SubLObject nat_argument_wrt_arg_typeP(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return eql(at_vars.$at_reln$.getDynamicValue(thread), $$natArgument);
    }

    public static SubLObject strong_fort_wrt_arg_typeP(final SubLObject v_term, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        return forts.fort_p(v_term);
    }

    public static SubLObject lenient_fort_wrt_arg_typeP(final SubLObject v_term) {
        return makeBoolean((NIL != forts.fort_p(v_term)) && (NIL != wff_vars.wff_lenientP()));
    }

    public static SubLObject weak_fort_wrt_arg_typeP(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((((NIL != at_vars.$appraising_disjunctP$.getDynamicValue(thread)) || (NIL != at_vars.$within_decontextualizedP$.getDynamicValue(thread))) && (NIL != forts.fort_p(v_term))) || ((NIL != at_vars.$at_admit_consistent_nartsP$.getDynamicValue(thread)) && ((NIL != nart_handles.nart_p(v_term)) || ((NIL != czer_utilities.reifiable_nautP(v_term, UNPROVIDED, UNPROVIDED)) && (NIL != narts_high.find_nart(v_term))))));
    }

    public static SubLObject semantically_valid_dnfP(final SubLObject dnf, SubLObject mt, SubLObject varP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (varP == UNPROVIDED) {
            varP = VARIABLE_P;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != dnf) {
            at_utilities.reset_semantic_violations(UNPROVIDED);
            SubLObject neg_lits = NIL;
            SubLObject pos_lits = NIL;
            destructuring_bind_must_consp(dnf, dnf, $list98);
            neg_lits = dnf.first();
            SubLObject current = dnf.rest();
            destructuring_bind_must_consp(current, dnf, $list98);
            pos_lits = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLObject invalidP = NIL;
                final SubLObject _prev_bind_0 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
                final SubLObject _prev_bind_2 = wff_vars.$provide_wff_suggestionsP$.currentBinding(thread);
                try {
                    at_vars.$accumulating_at_violationsP$.bind(NIL, thread);
                    wff_vars.$provide_wff_suggestionsP$.bind(NIL, thread);
                    if (NIL == neg_lits) {
                        if (NIL == invalidP) {
                            SubLObject csome_list_var = pos_lits;
                            SubLObject lit = NIL;
                            lit = csome_list_var.first();
                            while ((NIL == invalidP) && (NIL != csome_list_var)) {
                                if (NIL == semantically_valid_literal_intP(lit, mt, varP)) {
                                    invalidP = T;
                                }
                                csome_list_var = csome_list_var.rest();
                                lit = csome_list_var.first();
                            } 
                        }
                        if ((NIL == invalidP) && (NIL != wff_utilities.$check_var_typesP$.getDynamicValue(thread))) {
                            invalidP = makeBoolean(NIL == at_var_types.dnfs_variables_arg_constraints_okP(list(dnf), mt, varP));
                        }
                    }
                } finally {
                    wff_vars.$provide_wff_suggestionsP$.rebind(_prev_bind_2, thread);
                    at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_0, thread);
                }
                return makeBoolean(NIL == invalidP);
            }
            cdestructuring_bind_error(dnf, $list98);
        }
        return NIL;
    }

    public static SubLObject semantically_valid_dnf_type_literalsP(final SubLObject dnf, SubLObject mt, SubLObject varP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (varP == UNPROVIDED) {
            varP = VARIABLE_P;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject invalidP = NIL;
        final SubLObject _prev_bind_0 = wff_utilities.$check_arg_typesP$.currentBinding(thread);
        try {
            wff_utilities.$check_arg_typesP$.bind(NIL, thread);
            if (NIL == invalidP) {
                SubLObject csome_list_var;
                SubLObject literal;
                for (csome_list_var = clauses.pos_lits(dnf), literal = NIL, literal = csome_list_var.first(); (NIL == invalidP) && (NIL != csome_list_var); invalidP = makeBoolean(NIL == semantically_valid_literal_intP(literal, mt, varP)) , csome_list_var = csome_list_var.rest() , literal = csome_list_var.first()) {
                }
            }
        } finally {
            wff_utilities.$check_arg_typesP$.rebind(_prev_bind_0, thread);
        }
        return makeBoolean(NIL == invalidP);
    }

    public static SubLObject semantically_valid_literalP(final SubLObject literal, SubLObject mt, SubLObject varP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (varP == UNPROVIDED) {
            varP = VARIABLE_P;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject validP = NIL;
        final SubLObject _prev_bind_0 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
        try {
            at_vars.$accumulating_at_violationsP$.bind(NIL, thread);
            validP = semantically_valid_literal_intP(literal, mt, varP);
        } finally {
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_0, thread);
        }
        if ((NIL != validP) && (NIL != wff_utilities.$check_var_typesP$.getDynamicValue(thread))) {
            validP = at_var_types.dnfs_variables_arg_constraints_okP(list(clauses.make_dnf(NIL, list(literal))), mt, varP);
        }
        return validP;
    }

    public static SubLObject semantically_valid_literal_intP(final SubLObject literal, SubLObject mt, SubLObject varP) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        if (varP == UNPROVIDED) {
            varP = VARIABLE_P;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject validP = makeBoolean((NIL == wff_utilities.$check_arg_typesP$.getDynamicValue(thread)) || (NIL != formula_args_ok_wrt_typeP(literal, mt)));
        if ((NIL != validP) && (NIL != at_vars.$semantic_dnf_hl_filtering_enabled$.getDynamicValue(thread))) {
            if (NIL != isa_litP(literal)) {
                if (NIL != closedP(literal, varP)) {
                    validP = makeBoolean((NIL != term.el_fort_p(literal_arg2(literal, UNPROVIDED))) && (NIL != isa.isaP(literal_arg1(literal, UNPROVIDED), literal_arg2(literal, UNPROVIDED), mt, UNPROVIDED)));
                }
            } else
                if ((NIL != genls_litP(literal)) && (NIL != closedP(literal, varP))) {
                    validP = makeBoolean(((NIL != term.el_fort_p(literal_arg1(literal, UNPROVIDED))) && (NIL != term.el_fort_p(literal_arg2(literal, UNPROVIDED)))) && (NIL != genls.genlsP(literal_arg1(literal, UNPROVIDED), literal_arg2(literal, UNPROVIDED), mt, UNPROVIDED)));
                }

        }
        return validP;
    }

    public static SubLObject why_not_assertion_semantically_validP(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        wff.reset_wff_state();
        at_utilities.reset_semantic_violations(UNPROVIDED);
        final SubLObject _prev_bind_0 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
        try {
            at_vars.$accumulating_at_violationsP$.bind(T, thread);
            if (NIL != at_gaf_assertionP(assertion)) {
                semantically_valid_literalP(assertions_high.gaf_hl_formula(assertion), assertions_high.assertion_mt(assertion), UNPROVIDED);
            } else {
                why_not_cnf_semantically_valid_int(assertions_high.assertion_cnf(assertion), assertions_high.assertion_mt(assertion));
            }
        } finally {
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_0, thread);
        }
        return at_utilities.semantic_violations();
    }

    public static SubLObject why_not_cnf_semantically_validP(final SubLObject cnf, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        wff.reset_wff_state();
        at_utilities.reset_semantic_violations(UNPROVIDED);
        final SubLObject _prev_bind_0 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
        try {
            at_vars.$accumulating_at_violationsP$.bind(T, thread);
            why_not_cnf_semantically_valid_int(cnf, mt);
        } finally {
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_0, thread);
        }
        return at_utilities.semantic_violations();
    }

    public static SubLObject why_not_cnf_semantically_valid_int(final SubLObject cnf, final SubLObject mt) {
        SubLObject cdolist_list_var = clauses.neg_lits(cnf);
        SubLObject literal = NIL;
        literal = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            semantically_valid_literalP(literal, mt, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            literal = cdolist_list_var.first();
        } 
        cdolist_list_var = clauses.pos_lits(cnf);
        literal = NIL;
        literal = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            semantically_valid_literalP(literal, mt, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            literal = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject why_not_literal_semantically_validP(final SubLObject literal, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        wff.reset_wff_state();
        final SubLObject _prev_bind_0 = at_vars.$accumulating_at_violationsP$.currentBinding(thread);
        try {
            at_vars.$accumulating_at_violationsP$.bind(T, thread);
            semantically_valid_literalP(literal, mt, UNPROVIDED);
        } finally {
            at_vars.$accumulating_at_violationsP$.rebind(_prev_bind_0, thread);
        }
        return at_utilities.semantic_violations();
    }

    public static SubLObject arg_constraint_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_arg_constraint(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject arg_constraint_p(final SubLObject v_object) {
        return v_object.getJavaClass() ==$arg_constraint_native.class ? T : NIL;
    }

    public static SubLObject argconst_sentence(final SubLObject v_object) {
        assert NIL != arg_constraint_p(v_object) : "arg_type.arg_constraint_p error :" + v_object;
        return v_object.getField2();
    }

    public static SubLObject argconst_mt(final SubLObject v_object) {
        assert NIL != arg_constraint_p(v_object) : "arg_type.arg_constraint_p error :" + v_object;
        return v_object.getField3();
    }

    public static SubLObject argconst_test_function(final SubLObject v_object) {
        assert NIL != arg_constraint_p(v_object) : "arg_type.arg_constraint_p error :" + v_object;
        return v_object.getField4();
    }

    public static SubLObject argconst_test_args(final SubLObject v_object) {
        assert NIL != arg_constraint_p(v_object) : "arg_type.arg_constraint_p error :" + v_object;
        return v_object.getField5();
    }

    public static SubLObject argconst_closedP(final SubLObject v_object) {
        assert NIL != arg_constraint_p(v_object) : "arg_type.arg_constraint_p error :" + v_object;
        return v_object.getField6();
    }

    public static SubLObject argconst_atomicP(final SubLObject v_object) {
        assert NIL != arg_constraint_p(v_object) : "arg_type.arg_constraint_p error :" + v_object;
        return v_object.getField7();
    }

    public static SubLObject _csetf_argconst_sentence(final SubLObject v_object, final SubLObject value) {
        assert NIL != arg_constraint_p(v_object) : "arg_type.arg_constraint_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_argconst_mt(final SubLObject v_object, final SubLObject value) {
        assert NIL != arg_constraint_p(v_object) : "arg_type.arg_constraint_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_argconst_test_function(final SubLObject v_object, final SubLObject value) {
        assert NIL != arg_constraint_p(v_object) : "arg_type.arg_constraint_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_argconst_test_args(final SubLObject v_object, final SubLObject value) {
        assert NIL != arg_constraint_p(v_object) : "arg_type.arg_constraint_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_argconst_closedP(final SubLObject v_object, final SubLObject value) {
        assert NIL != arg_constraint_p(v_object) : "arg_type.arg_constraint_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_argconst_atomicP(final SubLObject v_object, final SubLObject value) {
        assert NIL != arg_constraint_p(v_object) : "arg_type.arg_constraint_p error :" + v_object;
        return v_object.setField7(value);
    }

    public static SubLObject make_arg_constraint(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new $arg_constraint_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($SENTENCE)) {
                _csetf_argconst_sentence(v_new, current_value);
            } else
                if (pcase_var.eql($MT)) {
                    _csetf_argconst_mt(v_new, current_value);
                } else
                    if (pcase_var.eql($TEST_FUNCTION)) {
                        _csetf_argconst_test_function(v_new, current_value);
                    } else
                        if (pcase_var.eql($TEST_ARGS)) {
                            _csetf_argconst_test_args(v_new, current_value);
                        } else
                            if (pcase_var.eql($CLOSED_)) {
                                _csetf_argconst_closedP(v_new, current_value);
                            } else
                                if (pcase_var.eql($ATOMIC_)) {
                                    _csetf_argconst_atomicP(v_new, current_value);
                                } else {
                                    Errors.error($str126$Invalid_slot__S_for_construction_, current_arg);
                                }





        }
        return v_new;
    }

    public static SubLObject visit_defstruct_arg_constraint(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_ARG_CONSTRAINT, SIX_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $SENTENCE, argconst_sentence(obj));
        funcall(visitor_fn, obj, $SLOT, $MT, argconst_mt(obj));
        funcall(visitor_fn, obj, $SLOT, $TEST_FUNCTION, argconst_test_function(obj));
        funcall(visitor_fn, obj, $SLOT, $TEST_ARGS, argconst_test_args(obj));
        funcall(visitor_fn, obj, $SLOT, $CLOSED_, argconst_closedP(obj));
        funcall(visitor_fn, obj, $SLOT, $ATOMIC_, argconst_atomicP(obj));
        funcall(visitor_fn, obj, $END, MAKE_ARG_CONSTRAINT, SIX_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_arg_constraint_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_arg_constraint(obj, visitor_fn);
    }

    public static SubLObject print_arg_constraint(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sentence = arg_constraint_sentence(v_object);
        final SubLObject mt = arg_constraint_mt(v_object);
        if (NIL != $arg_constraint_struct_printing_verboseP$.getDynamicValue(thread)) {
            final SubLObject test_function = arg_constraint_test_function(v_object);
            final SubLObject test_args = arg_constraint_test_args(v_object);
            final SubLObject type_string = arg_constraint_type_string(v_object);
            format(stream, $str132$__a_ARG_CONSTRAINT__a__a__a__a_, new SubLObject[]{ type_string, sentence, mt, test_function, test_args });
        } else {
            format(stream, $str133$_ARG_CONSTRAINT__a__a_, sentence, mt);
        }
        return NIL;
    }

    public static SubLObject arg_constraint_sentence(final SubLObject arg_constraint) {
        assert NIL != arg_constraint_p(arg_constraint) : "arg_type.arg_constraint_p(arg_constraint) " + "CommonSymbols.NIL != arg_type.arg_constraint_p(arg_constraint) " + arg_constraint;
        return argconst_sentence(arg_constraint);
    }

    public static SubLObject arg_constraint_mt(final SubLObject arg_constraint) {
        assert NIL != arg_constraint_p(arg_constraint) : "arg_type.arg_constraint_p(arg_constraint) " + "CommonSymbols.NIL != arg_type.arg_constraint_p(arg_constraint) " + arg_constraint;
        return argconst_mt(arg_constraint);
    }

    public static SubLObject arg_constraint_test_function(final SubLObject arg_constraint) {
        assert NIL != arg_constraint_p(arg_constraint) : "arg_type.arg_constraint_p(arg_constraint) " + "CommonSymbols.NIL != arg_type.arg_constraint_p(arg_constraint) " + arg_constraint;
        return argconst_test_function(arg_constraint);
    }

    public static SubLObject arg_constraint_test_args(final SubLObject arg_constraint) {
        assert NIL != arg_constraint_p(arg_constraint) : "arg_type.arg_constraint_p(arg_constraint) " + "CommonSymbols.NIL != arg_type.arg_constraint_p(arg_constraint) " + arg_constraint;
        return argconst_test_args(arg_constraint);
    }

    public static SubLObject arg_constraint_open_p(final SubLObject arg_constraint) {
        return makeBoolean(NIL == argconst_closedP(arg_constraint));
    }

    public static SubLObject arg_constraint_closed_p(final SubLObject arg_constraint) {
        return argconst_closedP(arg_constraint);
    }

    public static SubLObject arg_constraint_atomic_p(final SubLObject arg_constraint) {
        return argconst_atomicP(arg_constraint);
    }

    public static SubLObject arg_constraint_non_atomic_p(final SubLObject arg_constraint) {
        return makeBoolean(NIL == argconst_atomicP(arg_constraint));
    }

    public static SubLObject arg_constraint_gaf_p(final SubLObject arg_constraint) {
        return makeBoolean((NIL != arg_constraint_closed_p(arg_constraint)) && (NIL != arg_constraint_atomic_p(arg_constraint)));
    }

    public static SubLObject arg_constraint_type_string(final SubLObject arg_constraint) {
        if (NIL != arg_constraint_gaf_p(arg_constraint)) {
            return $$$GAF;
        }
        if (NIL != arg_constraint_closed_p(arg_constraint)) {
            return $$$GNAF;
        }
        if (NIL != arg_constraint_atomic_p(arg_constraint)) {
            return $$$OAF;
        }
        return $$$ONAF;
    }

    public static SubLObject new_arg_constraint(final SubLObject sentence, final SubLObject mt, final SubLObject test_function, final SubLObject test_args, SubLObject closedP, SubLObject atomicP) {
        if (closedP == UNPROVIDED) {
            closedP = $UNKNOWN;
        }
        if (atomicP == UNPROVIDED) {
            atomicP = $UNKNOWN;
        }
        final SubLObject arg_constraint = make_arg_constraint(UNPROVIDED);
        final SubLObject arg_constraint_closedP = determine_arg_constraint_closedP(sentence, closedP);
        final SubLObject arg_constraint_atomicP = determine_arg_constraint_atomicP(sentence, atomicP);
        _csetf_argconst_sentence(arg_constraint, sentence);
        _csetf_argconst_mt(arg_constraint, mt);
        _csetf_argconst_test_function(arg_constraint, test_function);
        _csetf_argconst_test_args(arg_constraint, test_args);
        _csetf_argconst_closedP(arg_constraint, arg_constraint_closedP);
        _csetf_argconst_atomicP(arg_constraint, arg_constraint_atomicP);
        return arg_constraint;
    }

    public static SubLObject determine_arg_constraint_closedP(final SubLObject sentence, final SubLObject closedP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject resultP = NIL;
        if (NIL != booleanp(closedP)) {
            resultP = closedP;
        } else {
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                resultP = closedP(sentence, UNPROVIDED);
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return resultP;
    }

    public static SubLObject determine_arg_constraint_atomicP(final SubLObject sentence, final SubLObject atomicP) {
        SubLObject resultP = NIL;
        if (NIL != booleanp(atomicP)) {
            resultP = atomicP;
        } else {
            resultP = makeBoolean(NIL == el_logical_operator_formula_p(sentence));
        }
        return resultP;
    }

    public static SubLObject new_isa_arg_constraint(final SubLObject ins, final SubLObject col, final SubLObject mt) {
        return new_arg_constraint(list($$isa, ins, col), mt, $sym139$ISA_, list(ins, col), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject new_genls_arg_constraint(final SubLObject spec, final SubLObject genl, final SubLObject mt) {
        return new_arg_constraint(list($$genls, spec, genl), mt, $sym140$GENLS_, list(spec, genl), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject clear_sorted_arg_constraint_predicates() {
        final SubLObject cs = $sorted_arg_constraint_predicates_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_sorted_arg_constraint_predicates() {
        return memoization_state.caching_state_remove_function_results_with_args($sorted_arg_constraint_predicates_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject sorted_arg_constraint_predicates_internal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject beginning_of_list = $list142;
            final SubLObject all_arg_type_predicates = isa.all_fort_instances($$ArgTypePredicate, UNPROVIDED, UNPROVIDED);
            final SubLObject useful_arg_type_predicates = delete_if(NO_PREDICATE_EXTENT_P, all_arg_type_predicates, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject middle_of_list = set_difference(useful_arg_type_predicates, beginning_of_list, UNPROVIDED, UNPROVIDED);
            final SubLObject all_arg_constraint_predicates = isa.all_fort_instances($$ArgConstraintPredicate, UNPROVIDED, UNPROVIDED);
            final SubLObject useful_arg_constraint_predicates = delete_if(NO_PREDICATE_EXTENT_P, all_arg_constraint_predicates, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject end_of_list = set_difference(useful_arg_constraint_predicates, append(beginning_of_list, middle_of_list), UNPROVIDED, UNPROVIDED);
            result = append(beginning_of_list, middle_of_list, end_of_list);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject sorted_arg_constraint_predicates() {
        SubLObject caching_state = $sorted_arg_constraint_predicates_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(SORTED_ARG_CONSTRAINT_PREDICATES, $sorted_arg_constraint_predicates_caching_state$, NIL, EQ, ZERO_INTEGER, ONE_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(sorted_arg_constraint_predicates_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject sorted_top_level_arg_constraints_on_formula(final SubLObject formula) {
        final SubLObject operator = cycl_utilities.formula_operator(formula);
        if (NIL != cycl_variables.cyc_varP(operator)) {
            return arg_constraints_on_formula_with_variable_operator(formula);
        }
        if (NIL == forts.fort_p(operator)) {
            return NIL;
        }
        SubLObject constraints = NIL;
        SubLObject cdolist_list_var;
        final SubLObject ac_preds = cdolist_list_var = sorted_arg_constraint_predicates();
        SubLObject ac_pred = NIL;
        ac_pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject pred_var = ac_pred;
            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(operator, ONE_INTEGER, pred_var)) {
                final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(operator, ONE_INTEGER, pred_var);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                            SubLObject done_var_$129 = NIL;
                            final SubLObject token_var_$130 = NIL;
                            while (NIL == done_var_$129) {
                                final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$130);
                                final SubLObject valid_$131 = makeBoolean(!token_var_$130.eql(ass));
                                if (NIL != valid_$131) {
                                    final SubLObject constraint = compute_constraint_for_assertion_and_formula(ass, formula);
                                    if (NIL != constraint) {
                                        constraints = cons(constraint, constraints);
                                    }
                                }
                                done_var_$129 = makeBoolean(NIL == valid_$131);
                            } 
                        } finally {
                            final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
                            try {
                                bind($is_thread_performing_cleanupP$, T);
                                final SubLObject _values = getValuesAsVector();
                                if (NIL != final_index_iterator) {
                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                }
                                restoreValuesFromVector(_values);
                            } finally {
                                rebind($is_thread_performing_cleanupP$, _prev_bind_0);
                            }
                        }
                    }
                    done_var = makeBoolean(NIL == valid);
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            ac_pred = cdolist_list_var.first();
        } 
        return nreverse(constraints);
    }

    public static SubLObject inside_out_arg_constraints_on_formula(final SubLObject formula) {
        SubLObject constraints = NIL;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(formula, $IGNORE);
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != el_formula_p(arg)) {
                final SubLObject new_constraints = inside_out_arg_constraints_on_formula(arg);
                constraints = append(constraints, new_constraints);
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        final SubLObject top_level_constraints = sorted_top_level_arg_constraints_on_formula(formula);
        constraints = append(constraints, top_level_constraints);
        return constraints;
    }

    public static SubLObject arg_constraint_satisfiedP(final SubLObject arg_constraint) {
        assert NIL != arg_constraint_p(arg_constraint) : "arg_type.arg_constraint_p(arg_constraint) " + "CommonSymbols.NIL != arg_type.arg_constraint_p(arg_constraint) " + arg_constraint;
        final SubLObject test_func = arg_constraint_test_function(arg_constraint);
        final SubLObject test_args = arg_constraint_test_args(arg_constraint);
        assert NIL != function_spec_p(test_func) : "Types.function_spec_p(test_func) " + "CommonSymbols.NIL != Types.function_spec_p(test_func) " + test_func;
        assert NIL != listp(test_args) : "Types.listp(test_args) " + "CommonSymbols.NIL != Types.listp(test_args) " + test_args;
        return apply(test_func, test_args);
    }

    public static SubLObject arg_constraints_on_formula_with_variable_operator(final SubLObject formula) {
        SubLObject constraints = NIL;
        final SubLObject variable_operator = cycl_utilities.formula_operator(formula);
        final SubLObject relation_constraint = new_isa_arg_constraint(variable_operator, $$Relation, mt_vars.$relation_defining_mt$.getGlobalValue());
        constraints = cons(relation_constraint, constraints);
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(formula, $IGNORE);
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == cycl_variables.cyc_varP(arg)) {
                final SubLObject constraint = new_isa_arg_constraint(arg, $$Thing, mt_vars.$thing_defining_mt$.getGlobalValue());
                constraints = cons(constraint, constraints);
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        return constraints;
    }

    public static SubLObject compute_constraint_for_assertion_and_formula(final SubLObject ass, final SubLObject formula) {
        final SubLObject constraint_pred = assertions_high.gaf_predicate(ass);
        final SubLObject mt = assertions_high.assertion_mt(ass);
        final SubLObject pcase_var = constraint_pred;
        if (pcase_var.eql($$argIsa)) {
            final SubLObject constrained_argnum = assertions_high.gaf_arg2(ass);
            final SubLObject col = assertions_high.gaf_arg3(ass);
            final SubLObject constrained_arg = cycl_utilities.formula_arg(formula, constrained_argnum, UNPROVIDED);
            final SubLObject constraint = new_isa_arg_constraint(constrained_arg, col, mt);
            return constraint;
        }
        if (pcase_var.eql($$argGenl)) {
            final SubLObject constrained_argnum = assertions_high.gaf_arg2(ass);
            final SubLObject col = assertions_high.gaf_arg3(ass);
            final SubLObject constrained_arg = cycl_utilities.formula_arg(formula, constrained_argnum, UNPROVIDED);
            final SubLObject constraint = new_genls_arg_constraint(constrained_arg, col, mt);
            return constraint;
        }
        return NIL;
    }

    public static SubLObject declare_arg_type_file() {
        declareFunction(me, "at_gaf_assertionP", "AT-GAF-ASSERTION?", 1, 0, false);
        declareFunction(me, "formula_args_ok_wrt_typeP", "FORMULA-ARGS-OK-WRT-TYPE?", 1, 1, false);
        declareFunction(me, "why_not_formula_args_ok_wrt_typeP", "WHY-NOT-FORMULA-ARGS-OK-WRT-TYPE?", 1, 1, false);
        declareFunction(me, "mt_literal_args_ok_wrt_typeP", "MT-LITERAL-ARGS-OK-WRT-TYPE?", 2, 0, false);
        declareFunction(me, "seqvars_inhibited_by_relation_expression", "SEQVARS-INHIBITED-BY-RELATION-EXPRESSION", 1, 0, false);
        declareFunction(me, "new_inhibited_seqvars", "NEW-INHIBITED-SEQVARS", 1, 0, false);
        declareFunction(me, "at_considering_atomic_sentence_p", "AT-CONSIDERING-ATOMIC-SENTENCE-P", 0, 0, false);
        declareFunction(me, "formula_args_ok_wrt_type_intP", "FORMULA-ARGS-OK-WRT-TYPE-INT?", 1, 1, false);
        declareFunction(me, "relation_arg_okP", "RELATION-ARG-OK?", 3, 1, false);
        declareFunction(me, "clear_cached_relation_arg_okP", "CLEAR-CACHED-RELATION-ARG-OK?", 0, 0, false);
        new arg_type.$clear_cached_relation_arg_okP$ZeroArityFunction();
        declareFunction(me, "remove_cached_relation_arg_okP", "REMOVE-CACHED-RELATION-ARG-OK?", 6, 0, false);
        declareFunction(me, "cached_relation_arg_okP_internal", "CACHED-RELATION-ARG-OK?-INTERNAL", 6, 0, false);
        declareFunction(me, "cached_relation_arg_okP", "CACHED-RELATION-ARG-OK?", 6, 0, false);
        declareFunction(me, "relation_arg_ok_intP", "RELATION-ARG-OK-INT?", 3, 1, false);
        declareFunction(me, "at_within_negationP", "AT-WITHIN-NEGATION?", 2, 0, false);
        declareFunction(me, "at_within_predicateP", "AT-WITHIN-PREDICATE?", 1, 0, false);
        declareFunction(me, "at_within_functionP", "AT-WITHIN-FUNCTION?", 0, 1, false);
        declareFunction(me, "at_check_arg_typesP", "AT-CHECK-ARG-TYPES?", 0, 3, false);
        declareFunction(me, "at_check_defining_mtsP", "AT-CHECK-DEFINING-MTS?", 2, 0, false);
        declareFunction(me, "appraising_disjunctP", "APPRAISING-DISJUNCT?", 1, 1, false);
        declareFunction(me, "at_within_disjunctP", "AT-WITHIN-DISJUNCT?", 2, 0, false);
        declareFunction(me, "appraising_disjunct_cnfP", "APPRAISING-DISJUNCT-CNF?", 1, 0, false);
        declareFunction(me, "at_within_decontextualizedP", "AT-WITHIN-DECONTEXTUALIZED?", 1, 0, false);
        declareFunction(me, "variable_arg_okP", "VARIABLE-ARG-OK?", 3, 1, false);
        declareFunction(me, "weak_fort_arg_okP", "WEAK-FORT-ARG-OK?", 3, 1, false);
        declareFunction(me, "lenient_fort_arg_okP", "LENIENT-FORT-ARG-OK?", 3, 1, false);
        declareFunction(me, "naut_arg_okP", "NAUT-ARG-OK?", 4, 0, false);
        declareFunction(me, "at_nat_okP", "AT-NAT-OK?", 1, 1, false);
        declareFunction(me, "nat_functor_okP", "NAT-FUNCTOR-OK?", 1, 1, false);
        declareFunction(me, "nat_args_okP", "NAT-ARGS-OK?", 1, 1, false);
        declareFunction(me, "nart_or_reify_forward_nautP", "NART-OR-REIFY-FORWARD-NAUT?", 2, 0, false);
        declareFunction(me, "tou_arg_okP", "TOU-ARG-OK?", 2, 0, false);
        declareFunction(me, "nat_function_arg_okP", "NAT-FUNCTION-ARG-OK?", 2, 0, false);
        declareFunction(me, "nat_argument_arg_okP", "NAT-ARGUMENT-ARG-OK?", 2, 0, false);
        declareFunction(me, "tou_naut_okP", "TOU-NAUT-OK?", 1, 0, false);
        declareFunction(me, "strong_fort_arg_okP", "STRONG-FORT-ARG-OK?", 4, 0, false);
        declareFunction(me, "opaque_arg_okP", "OPAQUE-ARG-OK?", 4, 0, false);
        declareFunction(me, "naut_functor_okP", "NAUT-FUNCTOR-OK?", 1, 1, false);
        declareFunction(me, "naut_args_okP", "NAUT-ARGS-OK?", 1, 1, false);
        declareFunction(me, "naut_args_ok_wrt_typeP", "NAUT-ARGS-OK-WRT-TYPE?", 1, 1, false);
        declareFunction(me, "weak_fort_types_okP", "WEAK-FORT-TYPES-OK?", 3, 1, false);
        declareFunction(me, "lenient_fort_types_okP", "LENIENT-FORT-TYPES-OK?", 3, 1, false);
        declareFunction(me, "naut_arg_types_okP", "NAUT-ARG-TYPES-OK?", 4, 0, false);
        declareFunction(me, "naut_arg_types_consistentP", "NAUT-ARG-TYPES-CONSISTENT?", 4, 0, false);
        declareFunction(me, "naut_arg_types_trueP", "NAUT-ARG-TYPES-TRUE?", 4, 0, false);
        declareFunction(me, "strong_fort_arg_types_okP", "STRONG-FORT-ARG-TYPES-OK?", 0, 4, false);
        declareFunction(me, "opaque_arg_types_okP", "OPAQUE-ARG-TYPES-OK?", 0, 4, false);
        declareFunction(me, "arg_isa_arg_types_okP", "ARG-ISA-ARG-TYPES-OK?", 0, 4, false);
        declareFunction(me, "arg_test_okP", "ARG-TEST-OK?", 3, 1, false);
        declareFunction(me, "inter_arg_test_failsP", "INTER-ARG-TEST-FAILS?", 3, 1, false);
        declareFunction(me, "mal_intra_argP", "MAL-INTRA-ARG?", 4, 0, false);
        declareFunction(me, "mal_inter_argP", "MAL-INTER-ARG?", 6, 0, false);
        declareFunction(me, "defining_mts_okP", "DEFINING-MTS-OK?", 1, 1, false);
        declareFunction(me, "memoized_defining_mts_okP_internal", "MEMOIZED-DEFINING-MTS-OK?-INTERNAL", 2, 0, false);
        declareFunction(me, "memoized_defining_mts_okP", "MEMOIZED-DEFINING-MTS-OK?", 2, 0, false);
        declareFunction(me, "defining_mts_ok_intP", "DEFINING-MTS-OK-INT?", 1, 1, false);
        declareFunction(me, "relator_constraints_okP", "RELATOR-CONSTRAINTS-OK?", 1, 1, false);
        declareFunction(me, "predicate_constraints_okP", "PREDICATE-CONSTRAINTS-OK?", 1, 1, false);
        declareFunction(me, "gaf_ok_wrt_asymmetric_predP", "GAF-OK-WRT-ASYMMETRIC-PRED?", 1, 1, false);
        declareFunction(me, "asymmetric_violations", "ASYMMETRIC-VIOLATIONS", 2, 0, false);
        declareFunction(me, "gather_asymmetric_violations", "GATHER-ASYMMETRIC-VIOLATIONS", 3, 0, false);
        declareFunction(me, "select_asymmetric_pred_violation", "SELECT-ASYMMETRIC-PRED-VIOLATION", 1, 0, false);
        declareFunction(me, "gaf_ok_wrt_anti_symmetric_predP", "GAF-OK-WRT-ANTI-SYMMETRIC-PRED?", 1, 1, false);
        declareFunction(me, "anti_symmetric_violations", "ANTI-SYMMETRIC-VIOLATIONS", 2, 0, false);
        declareFunction(me, "gaf_ok_wrt_irreflexive_predP", "GAF-OK-WRT-IRREFLEXIVE-PRED?", 1, 1, false);
        declareFunction(me, "gaf_ok_wrt_anti_transitive_predP", "GAF-OK-WRT-ANTI-TRANSITIVE-PRED?", 1, 1, false);
        declareFunction(me, "anti_transitive_violations", "ANTI-TRANSITIVE-VIOLATIONS", 2, 0, false);
        declareFunction(me, "gather_anti_transitive_violations", "GATHER-ANTI-TRANSITIVE-VIOLATIONS", 3, 0, false);
        declareFunction(me, "best_gaf_lookup_index_for_anti_transitive", "BEST-GAF-LOOKUP-INDEX-FOR-ANTI-TRANSITIVE", 3, 0, false);
        declareFunction(me, "search_for_anti_transitive_pred_violation", "SEARCH-FOR-ANTI-TRANSITIVE-PRED-VIOLATION", 1, 0, false);
        declareFunction(me, "search_for_anti_transitive_pred_violation_pivot", "SEARCH-FOR-ANTI-TRANSITIVE-PRED-VIOLATION-PIVOT", 1, 0, false);
        declareFunction(me, "search_for_anti_transitive_pred_violation_swap", "SEARCH-FOR-ANTI-TRANSITIVE-PRED-VIOLATION-SWAP", 1, 0, false);
        declareFunction(me, "select_anti_transitive_pred_violation", "SELECT-ANTI-TRANSITIVE-PRED-VIOLATION", 1, 0, false);
        declareFunction(me, "select_anti_transitive_pred_violation_via_pred", "SELECT-ANTI-TRANSITIVE-PRED-VIOLATION-VIA-PRED", 1, 0, false);
        declareFunction(me, "find_accessible_gaf", "FIND-ACCESSIBLE-GAF", 1, 3, false);
        declareFunction(me, "select_target_gaf", "SELECT-TARGET-GAF", 1, 0, false);
        declareFunction(me, "gaf_ok_wrt_negation_predsP", "GAF-OK-WRT-NEGATION-PREDS?", 1, 1, false);
        declareFunction(me, "negation_pred_violations", "NEGATION-PRED-VIOLATIONS", 3, 0, false);
        declareFunction(me, "gaf_ok_wrt_negation_inversesP", "GAF-OK-WRT-NEGATION-INVERSES?", 1, 1, false);
        declareFunction(me, "negation_inverse_violations", "NEGATION-INVERSE-VIOLATIONS", 3, 0, false);
        declareFunction(me, "clear_cached_format_okP", "CLEAR-CACHED-FORMAT-OK?", 0, 0, false);
        declareFunction(me, "remove_cached_format_okP", "REMOVE-CACHED-FORMAT-OK?", 1, 0, false);
        declareFunction(me, "cached_format_okP_internal", "CACHED-FORMAT-OK?-INTERNAL", 1, 0, false);
        declareFunction(me, "cached_format_okP", "CACHED-FORMAT-OK?", 1, 0, false);
        declareFunction(me, "memoized_format_okP_internal", "MEMOIZED-FORMAT-OK?-INTERNAL", 4, 0, false);
        declareFunction(me, "memoized_format_okP", "MEMOIZED-FORMAT-OK?", 4, 0, false);
        declareFunction(me, "at_format_okP", "AT-FORMAT-OK?", 1, 3, false);
        declareFunction(me, "single_entry_okP", "SINGLE-ENTRY-OK?", 3, 0, false);
        declareFunction(me, "literal_single_entry_okP", "LITERAL-SINGLE-ENTRY-OK?", 3, 0, false);
        declareFunction(me, "why_not_literal_single_entry_okP", "WHY-NOT-LITERAL-SINGLE-ENTRY-OK?", 3, 1, false);
        declareFunction(me, "sef_violations", "SEF-VIOLATIONS", 3, 0, false);
        declareFunction(me, "check_inter_assert_format_wXo_arg_indexP", "CHECK-INTER-ASSERT-FORMAT-W/O-ARG-INDEX?", 1, 0, false);
        declareFunction(me, "sef_violating_assertionP", "SEF-VIOLATING-ASSERTION?", 4, 0, false);
        declareFunction(me, "temporally_intersecting_okP", "TEMPORALLY-INTERSECTING-OK?", 3, 0, false);
        declareFunction(me, "tief_violations", "TIEF-VIOLATIONS", 3, 0, false);
        declareFunction(me, "tief_violating_assertionP", "TIEF-VIOLATING-ASSERTION?", 4, 0, false);
        declareFunction(me, "spatially_intersecting_okP", "SPATIALLY-INTERSECTING-OK?", 3, 0, false);
        declareFunction(me, "sief_violations", "SIEF-VIOLATIONS", 3, 0, false);
        declareFunction(me, "sief_violating_assertionP", "SIEF-VIOLATING-ASSERTION?", 4, 0, false);
        declareFunction(me, "spatio_temporally__intersecting_okP", "SPATIO-TEMPORALLY--INTERSECTING-OK?", 3, 0, false);
        declareFunction(me, "stief_violations", "STIEF-VIOLATIONS", 3, 0, false);
        declareFunction(me, "interval_entry_okP", "INTERVAL-ENTRY-OK?", 3, 0, false);
        declareFunction(me, "set_entry_okP", "SET-ENTRY-OK?", 3, 0, false);
        declareFunction(me, "variable_wrt_arg_typeP", "VARIABLE-WRT-ARG-TYPE?", 1, 0, false);
        declareFunction(me, "variable_term_wrt_arg_typeP", "VARIABLE-TERM-WRT-ARG-TYPE?", 1, 0, false);
        new arg_type.$variable_term_wrt_arg_typeP$UnaryFunction();
        declareFunction(me, "naut_wrt_arg_typeP", "NAUT-WRT-ARG-TYPE?", 2, 0, false);
        declareFunction(me, "tou_wrt_arg_typeP", "TOU-WRT-ARG-TYPE?", 1, 0, false);
        declareFunction(me, "nat_function_wrt_arg_typeP", "NAT-FUNCTION-WRT-ARG-TYPE?", 1, 0, false);
        declareFunction(me, "nat_argument_wrt_arg_typeP", "NAT-ARGUMENT-WRT-ARG-TYPE?", 1, 0, false);
        declareFunction(me, "strong_fort_wrt_arg_typeP", "STRONG-FORT-WRT-ARG-TYPE?", 1, 1, false);
        declareFunction(me, "lenient_fort_wrt_arg_typeP", "LENIENT-FORT-WRT-ARG-TYPE?", 1, 0, false);
        declareFunction(me, "weak_fort_wrt_arg_typeP", "WEAK-FORT-WRT-ARG-TYPE?", 1, 0, false);
        declareFunction(me, "semantically_valid_dnfP", "SEMANTICALLY-VALID-DNF?", 1, 2, false);
        declareFunction(me, "semantically_valid_dnf_type_literalsP", "SEMANTICALLY-VALID-DNF-TYPE-LITERALS?", 1, 2, false);
        declareFunction(me, "semantically_valid_literalP", "SEMANTICALLY-VALID-LITERAL?", 1, 2, false);
        declareFunction(me, "semantically_valid_literal_intP", "SEMANTICALLY-VALID-LITERAL-INT?", 1, 2, false);
        declareFunction(me, "why_not_assertion_semantically_validP", "WHY-NOT-ASSERTION-SEMANTICALLY-VALID?", 1, 0, false);
        declareFunction(me, "why_not_cnf_semantically_validP", "WHY-NOT-CNF-SEMANTICALLY-VALID?", 1, 1, false);
        declareFunction(me, "why_not_cnf_semantically_valid_int", "WHY-NOT-CNF-SEMANTICALLY-VALID-INT", 2, 0, false);
        declareFunction(me, "why_not_literal_semantically_validP", "WHY-NOT-LITERAL-SEMANTICALLY-VALID?", 1, 1, false);
        declareFunction(me, "arg_constraint_print_function_trampoline", "ARG-CONSTRAINT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "arg_constraint_p", "ARG-CONSTRAINT-P", 1, 0, false);
        new arg_type.$arg_constraint_p$UnaryFunction();
        declareFunction(me, "argconst_sentence", "ARGCONST-SENTENCE", 1, 0, false);
        declareFunction(me, "argconst_mt", "ARGCONST-MT", 1, 0, false);
        declareFunction(me, "argconst_test_function", "ARGCONST-TEST-FUNCTION", 1, 0, false);
        declareFunction(me, "argconst_test_args", "ARGCONST-TEST-ARGS", 1, 0, false);
        declareFunction(me, "argconst_closedP", "ARGCONST-CLOSED?", 1, 0, false);
        declareFunction(me, "argconst_atomicP", "ARGCONST-ATOMIC?", 1, 0, false);
        declareFunction(me, "_csetf_argconst_sentence", "_CSETF-ARGCONST-SENTENCE", 2, 0, false);
        declareFunction(me, "_csetf_argconst_mt", "_CSETF-ARGCONST-MT", 2, 0, false);
        declareFunction(me, "_csetf_argconst_test_function", "_CSETF-ARGCONST-TEST-FUNCTION", 2, 0, false);
        declareFunction(me, "_csetf_argconst_test_args", "_CSETF-ARGCONST-TEST-ARGS", 2, 0, false);
        declareFunction(me, "_csetf_argconst_closedP", "_CSETF-ARGCONST-CLOSED?", 2, 0, false);
        declareFunction(me, "_csetf_argconst_atomicP", "_CSETF-ARGCONST-ATOMIC?", 2, 0, false);
        declareFunction(me, "make_arg_constraint", "MAKE-ARG-CONSTRAINT", 0, 1, false);
        declareFunction(me, "visit_defstruct_arg_constraint", "VISIT-DEFSTRUCT-ARG-CONSTRAINT", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_arg_constraint_method", "VISIT-DEFSTRUCT-OBJECT-ARG-CONSTRAINT-METHOD", 2, 0, false);
        declareFunction(me, "print_arg_constraint", "PRINT-ARG-CONSTRAINT", 3, 0, false);
        declareFunction(me, "arg_constraint_sentence", "ARG-CONSTRAINT-SENTENCE", 1, 0, false);
        declareFunction(me, "arg_constraint_mt", "ARG-CONSTRAINT-MT", 1, 0, false);
        declareFunction(me, "arg_constraint_test_function", "ARG-CONSTRAINT-TEST-FUNCTION", 1, 0, false);
        declareFunction(me, "arg_constraint_test_args", "ARG-CONSTRAINT-TEST-ARGS", 1, 0, false);
        declareFunction(me, "arg_constraint_open_p", "ARG-CONSTRAINT-OPEN-P", 1, 0, false);
        declareFunction(me, "arg_constraint_closed_p", "ARG-CONSTRAINT-CLOSED-P", 1, 0, false);
        declareFunction(me, "arg_constraint_atomic_p", "ARG-CONSTRAINT-ATOMIC-P", 1, 0, false);
        declareFunction(me, "arg_constraint_non_atomic_p", "ARG-CONSTRAINT-NON-ATOMIC-P", 1, 0, false);
        declareFunction(me, "arg_constraint_gaf_p", "ARG-CONSTRAINT-GAF-P", 1, 0, false);
        declareFunction(me, "arg_constraint_type_string", "ARG-CONSTRAINT-TYPE-STRING", 1, 0, false);
        declareFunction(me, "new_arg_constraint", "NEW-ARG-CONSTRAINT", 4, 2, false);
        declareFunction(me, "determine_arg_constraint_closedP", "DETERMINE-ARG-CONSTRAINT-CLOSED?", 2, 0, false);
        declareFunction(me, "determine_arg_constraint_atomicP", "DETERMINE-ARG-CONSTRAINT-ATOMIC?", 2, 0, false);
        declareFunction(me, "new_isa_arg_constraint", "NEW-ISA-ARG-CONSTRAINT", 3, 0, false);
        declareFunction(me, "new_genls_arg_constraint", "NEW-GENLS-ARG-CONSTRAINT", 3, 0, false);
        declareFunction(me, "clear_sorted_arg_constraint_predicates", "CLEAR-SORTED-ARG-CONSTRAINT-PREDICATES", 0, 0, false);
        declareFunction(me, "remove_sorted_arg_constraint_predicates", "REMOVE-SORTED-ARG-CONSTRAINT-PREDICATES", 0, 0, false);
        declareFunction(me, "sorted_arg_constraint_predicates_internal", "SORTED-ARG-CONSTRAINT-PREDICATES-INTERNAL", 0, 0, false);
        declareFunction(me, "sorted_arg_constraint_predicates", "SORTED-ARG-CONSTRAINT-PREDICATES", 0, 0, false);
        declareFunction(me, "sorted_top_level_arg_constraints_on_formula", "SORTED-TOP-LEVEL-ARG-CONSTRAINTS-ON-FORMULA", 1, 0, false);
        declareFunction(me, "inside_out_arg_constraints_on_formula", "INSIDE-OUT-ARG-CONSTRAINTS-ON-FORMULA", 1, 0, false);
        declareFunction(me, "arg_constraint_satisfiedP", "ARG-CONSTRAINT-SATISFIED?", 1, 0, false);
        declareFunction(me, "arg_constraints_on_formula_with_variable_operator", "ARG-CONSTRAINTS-ON-FORMULA-WITH-VARIABLE-OPERATOR", 1, 0, false);
        declareFunction(me, "compute_constraint_for_assertion_and_formula", "COMPUTE-CONSTRAINT-FOR-ASSERTION-AND-FORMULA", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_arg_type_file() {
        defparameter("*RELATION-ARG-OK-ARGNUM*", NIL);
        deflexical("*CACHED-RELATION-ARG-OK?-CACHING-STATE*", NIL);
        deflexical("*CACHED-FORMAT-OK?-CACHING-STATE*", NIL);
        defconstant("*DTP-ARG-CONSTRAINT*", ARG_CONSTRAINT);
        defparameter("*ARG-CONSTRAINT-STRUCT-PRINTING-VERBOSE?*", NIL);
        deflexical("*SORTED-ARG-CONSTRAINT-PREDICATES-CACHING-STATE*", NIL);
        return NIL;
    }

    public static SubLObject setup_arg_type_file() {
        memoization_state.note_globally_cached_function($sym3$CACHED_RELATION_ARG_OK_);
        memoization_state.note_memoized_function($sym42$MEMOIZED_DEFINING_MTS_OK_);
        memoization_state.note_globally_cached_function($sym80$CACHED_FORMAT_OK_);
        memoization_state.note_memoized_function($sym83$MEMOIZED_FORMAT_OK_);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_arg_constraint$.getGlobalValue(), symbol_function(ARG_CONSTRAINT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list107);
        def_csetf(ARGCONST_SENTENCE, _CSETF_ARGCONST_SENTENCE);
        def_csetf(ARGCONST_MT, _CSETF_ARGCONST_MT);
        def_csetf(ARGCONST_TEST_FUNCTION, _CSETF_ARGCONST_TEST_FUNCTION);
        def_csetf(ARGCONST_TEST_ARGS, _CSETF_ARGCONST_TEST_ARGS);
        def_csetf($sym116$ARGCONST_CLOSED_, $sym117$_CSETF_ARGCONST_CLOSED_);
        def_csetf($sym118$ARGCONST_ATOMIC_, $sym119$_CSETF_ARGCONST_ATOMIC_);
        identity(ARG_CONSTRAINT);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_arg_constraint$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_ARG_CONSTRAINT_METHOD));
        memoization_state.note_globally_cached_function(SORTED_ARG_CONSTRAINT_PREDICATES);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_arg_type_file();
    }

    @Override
    public void initializeVariables() {
        init_arg_type_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_arg_type_file();
    }

    

    public static final class $clear_cached_relation_arg_okP$ZeroArityFunction extends ZeroArityFunction {
        public $clear_cached_relation_arg_okP$ZeroArityFunction() {
            super(extractFunctionNamed("CLEAR-CACHED-RELATION-ARG-OK?"));
        }

        @Override
        public SubLObject processItem() {
            return clear_cached_relation_arg_okP();
        }
    }

    public static final class $variable_term_wrt_arg_typeP$UnaryFunction extends UnaryFunction {
        public $variable_term_wrt_arg_typeP$UnaryFunction() {
            super(extractFunctionNamed("VARIABLE-TERM-WRT-ARG-TYPE?"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return variable_term_wrt_arg_typeP(arg1);
        }
    }

    public static final class $arg_constraint_native extends SubLStructNative {
        public SubLObject $sentence;

        public SubLObject $mt;

        public SubLObject $test_function;

        public SubLObject $test_args;

        public SubLObject $closedP;

        public SubLObject $atomicP;

        private static final SubLStructDeclNative structDecl;

        private $arg_constraint_native() {
            this.$sentence = Lisp.NIL;
            this.$mt = Lisp.NIL;
            this.$test_function = Lisp.NIL;
            this.$test_args = Lisp.NIL;
            this.$closedP = Lisp.NIL;
            this.$atomicP = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$sentence;
        }

        @Override
        public SubLObject getField3() {
            return this.$mt;
        }

        @Override
        public SubLObject getField4() {
            return this.$test_function;
        }

        @Override
        public SubLObject getField5() {
            return this.$test_args;
        }

        @Override
        public SubLObject getField6() {
            return this.$closedP;
        }

        @Override
        public SubLObject getField7() {
            return this.$atomicP;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$sentence = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$mt = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$test_function = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$test_args = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$closedP = value;
        }

        @Override
        public SubLObject setField7(final SubLObject value) {
            return this.$atomicP = value;
        }

        static {
            structDecl = makeStructDeclNative($arg_constraint_native.class, ARG_CONSTRAINT, ARG_CONSTRAINT_P, $list101, $list102, new String[]{ "$sentence", "$mt", "$test_function", "$test_args", "$closedP", "$atomicP" }, $list103, $list104, PRINT_ARG_CONSTRAINT);
        }
    }

    public static final class $arg_constraint_p$UnaryFunction extends UnaryFunction {
        public $arg_constraint_p$UnaryFunction() {
            super(extractFunctionNamed("ARG-CONSTRAINT-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return arg_constraint_p(arg1);
        }
    }
}

/**
 * Total time: 2749 ms
 */
