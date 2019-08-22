/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.inference.harness;

import static com.cyc.cycjava.cycl.access_macros.register_external_symbol;
import static com.cyc.cycjava.cycl.access_macros.register_macro_helper;
import static com.cyc.cycjava.cycl.control_vars.$kbq_run_query_practice_modeP$;
import static com.cyc.cycjava.cycl.cyc_testing.generic_testing.define_test_case_table_int;
import static com.cyc.cycjava.cycl.id_index.clear_id_index;
import static com.cyc.cycjava.cycl.id_index.do_id_index_empty_p;
import static com.cyc.cycjava.cycl.id_index.do_id_index_id_and_object_validP;
import static com.cyc.cycjava.cycl.id_index.do_id_index_next_id;
import static com.cyc.cycjava.cycl.id_index.do_id_index_next_state;
import static com.cyc.cycjava.cycl.id_index.do_id_index_state_object;
import static com.cyc.cycjava.cycl.id_index.id_index_count;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_dense_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_enter;
import static com.cyc.cycjava.cycl.id_index.id_index_enter_unlocked_autoextend;
import static com.cyc.cycjava.cycl.id_index.id_index_lookup;
import static com.cyc.cycjava.cycl.id_index.id_index_next_id;
import static com.cyc.cycjava.cycl.id_index.id_index_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_pessimized_p;
import static com.cyc.cycjava.cycl.id_index.id_index_remove;
import static com.cyc.cycjava.cycl.id_index.id_index_reserve;
import static com.cyc.cycjava.cycl.id_index.id_index_skip_tombstones_p;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_id_threshold;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects;
import static com.cyc.cycjava.cycl.id_index.id_index_sparse_objects_empty_p;
import static com.cyc.cycjava.cycl.id_index.id_index_tombstone_p;
import static com.cyc.cycjava.cycl.id_index.id_index_values;
import static com.cyc.cycjava.cycl.id_index.new_id_index;
import static com.cyc.cycjava.cycl.id_index.optimize_id_index;
import static com.cyc.cycjava.cycl.id_index.pessimize_id_index;
import static com.cyc.cycjava.cycl.list_utilities.alist_to_plist;
import static com.cyc.cycjava.cycl.list_utilities.member_eqP;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.declare_defglobal;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_index$;
import static com.cyc.cycjava.cycl.utilities_macros.$last_percent_progress_prediction$;
import static com.cyc.cycjava.cycl.utilities_macros.$percent_progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_note$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_sofar$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_start_time$;
import static com.cyc.cycjava.cycl.utilities_macros.$progress_total$;
import static com.cyc.cycjava.cycl.utilities_macros.$within_noting_percent_progress$;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.bind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.currentBinding;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.rebind;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.identity;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.clrhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryKey;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.getEntryValue;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorHasNext;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.iteratorNextEntry;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.releaseEntrySetIterator;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.remhash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.make_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.release_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks.seize_lock;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.$most_positive_fixnum$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.multiply;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.numLE;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.def_csetf;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.makeStructDeclNative;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.register_method;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.boundp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.booleanp;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.arg2;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.getValuesAsVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.multiple_value_list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.restoreValuesFromVector;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.makeBoolean;
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
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.copy_list;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.nreconc;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.putf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.defconstant;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;

import java.util.Iterator;
import java.util.Map;

import org.armedbear.lisp.Lisp;

import com.cyc.cycjava.cycl.V12;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.unification_utilities;
import com.cyc.cycjava.cycl.cyc_testing.cyc_testing;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sksi.query_sks.sksi_query_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Guids;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ReadWriteLocks;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sxhash;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      INFERENCE-DATASTRUCTURES-PROBLEM-STORE
 * source file: /cyc/top/cycl/inference/harness/inference-datastructures-problem-store.lisp
 * created:     2019/07/03 17:37:38
 */
public final class inference_datastructures_problem_store extends SubLTranslatedFile implements V12 {
    public static final class $problem_store_janitor_native extends SubLStructNative {
	public SubLStructDecl getStructDecl() {
	    return structDecl;
	}

	public SubLObject getField2() {
	    return $problem_store_janitor_native.this.$store;
	}

	public SubLObject getField3() {
	    return $problem_store_janitor_native.this.$indestructible_problems;
	}

	public SubLObject getField4() {
	    return $problem_store_janitor_native.this.$staleP;
	}

	public SubLObject setField2(SubLObject value) {
	    return $problem_store_janitor_native.this.$store = value;
	}

	public SubLObject setField3(SubLObject value) {
	    return $problem_store_janitor_native.this.$indestructible_problems = value;
	}

	public SubLObject setField4(SubLObject value) {
	    return $problem_store_janitor_native.this.$staleP = value;
	}

	public SubLObject $store = Lisp.NIL;

	public SubLObject $indestructible_problems = Lisp.NIL;

	public SubLObject $staleP = Lisp.NIL;

	private static final SubLStructDeclNative structDecl = makeStructDeclNative($problem_store_janitor_native.class, PROBLEM_STORE_JANITOR, PROBLEM_STORE_JANITOR_P, $list_alt305, $list_alt306, new String[] { "$store", "$indestructible_problems", "$staleP" }, $list_alt307, $list_alt308,
		DEFAULT_STRUCT_PRINT_FUNCTION);
    }

    public static final SubLFile me = new inference_datastructures_problem_store();

 public static final String myName = "com.cyc.cycjava.cycl.inference.harness.inference_datastructures_problem_store";


    // defparameter
    // Definitions
    /**
     * Whether the problem store and related datastructures are permitted to be
     * created, destroyed, or modified. This is set to T in the main entry point to
     * inference but NIL in the inference browser. Currently this only controls
     * modifications that could conceivably happen via the browser, like lazy
     * manifestation of non-focals.
     */
    @LispMethod(comment = "Whether the problem store and related datastructures are permitted to be\r\ncreated, destroyed, or modified. This is set to T in the main entry point to\r\ninference but NIL in the inference browser. Currently this only controls\r\nmodifications that could conceivably happen via the browser, like lazy\r\nmanifestation of non-focals.\ndefparameter\nWhether the problem store and related datastructures are permitted to be\ncreated, destroyed, or modified. This is set to T in the main entry point to\ninference but NIL in the inference browser. Currently this only controls\nmodifications that could conceivably happen via the browser, like lazy\nmanifestation of non-focals.")
    public static final SubLSymbol $problem_store_modification_permittedP$ = makeSymbol("*PROBLEM-STORE-MODIFICATION-PERMITTED?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $problem_store_multiple_subqueries_count$ = makeSymbol("*PROBLEM-STORE-MULTIPLE-SUBQUERIES-COUNT*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_problem_store$ = makeSymbol("*DTP-PROBLEM-STORE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $default_problem_store_problem_size$ = makeSymbol("*DEFAULT-PROBLEM-STORE-PROBLEM-SIZE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $default_problem_store_link_size$ = makeSymbol("*DEFAULT-PROBLEM-STORE-LINK-SIZE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $default_problem_store_inference_size$ = makeSymbol("*DEFAULT-PROBLEM-STORE-INFERENCE-SIZE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $default_problem_store_strategy_size$ = makeSymbol("*DEFAULT-PROBLEM-STORE-STRATEGY-SIZE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $default_problem_store_proof_size$ = makeSymbol("*DEFAULT-PROBLEM-STORE-PROOF-SIZE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $problem_store_sbhl_resource_space_number$ = makeSymbol("*PROBLEM-STORE-SBHL-RESOURCE-SPACE-NUMBER*");

    // deflexical
    /**
     * If the problem store fills up with this many times more than the max problem
     * count, halt with a :max-proof-count halt reason.
     */
    @LispMethod(comment = "If the problem store fills up with this many times more than the max problem\r\ncount, halt with a :max-proof-count halt reason.\ndeflexical\nIf the problem store fills up with this many times more than the max problem\ncount, halt with a :max-proof-count halt reason.")
    private static final SubLSymbol $max_proof_count_multiplier$ = makeSymbol("*MAX-PROOF-COUNT-MULTIPLIER*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $disable_problem_store_allows_problem_hl_free_vars_optimizationP$ = makeSymbol("*DISABLE-PROBLEM-STORE-ALLOWS-PROBLEM-HL-FREE-VARS-OPTIMIZATION?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $force_problem_identity_depends_on_free_hl_vars$ = makeSymbol("*FORCE-PROBLEM-IDENTITY-DEPENDS-ON-FREE-HL-VARS*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_problem_store_janitor$ = makeSymbol("*DTP-PROBLEM-STORE-JANITOR*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $problem_store_hash_watermark$ = makeSymbol("*PROBLEM-STORE-HASH-WATERMARK*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    public static final SubLSymbol $problem_store_id_index$ = makeSymbol("*PROBLEM-STORE-ID-INDEX*");

    static private final SubLList $list1 = list(list(makeSymbol("PROBLEM-STORE-VAR"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list2 = list($DONE);

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    static private final SubLSymbol $sym5$ID = makeUninternedSymbol("ID");

    static private final SubLList $list7 = list(makeSymbol("PROBLEM-STORE-ID-INDEX"));

    private static final SubLSymbol PROBLEM_STORE_ID_INDEX = makeSymbol("PROBLEM-STORE-ID-INDEX");

    private static final SubLSymbol DO_ALL_PROBLEM_STORES = makeSymbol("DO-ALL-PROBLEM-STORES");

    private static final SubLString $$$Destroying_all_ = makeString("Destroying all ");

    private static final SubLString $$$_problem_stores = makeString(" problem stores");

    private static final SubLString $$$cdolist = makeString("cdolist");

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLSymbol $sym17$_ = makeSymbol(">");

    private static final SubLSymbol PROBLEM_STORE_CREATION_TIME = makeSymbol("PROBLEM-STORE-CREATION-TIME");

    private static final SubLString $$$Destroying_ = makeString("Destroying ");

    private static final SubLString $str20$_problem_stores__all_but_the_last = makeString(" problem stores (all but the last ");

    private static final SubLString $str21$_ = makeString(")");

    private static final SubLSymbol PROBLEM_STORE = makeSymbol("PROBLEM-STORE");

    private static final SubLList $list24 = list(new SubLObject[] { makeSymbol("GUID"), makeSymbol("SUID"), makeSymbol("LOCK"), makeSymbol("CREATION-TIME"), makeSymbol("INFERENCE-ID-INDEX"), makeSymbol("STRATEGY-ID-INDEX"), makeSymbol("PROBLEM-ID-INDEX"), makeSymbol("LINK-ID-INDEX"),
	    makeSymbol("PROOF-ID-INDEX"), makeSymbol("PROBLEMS-BY-QUERY-INDEX"), makeSymbol("REJECTED-PROOFS"), makeSymbol("PROCESSED-PROOFS"), makeSymbol("POTENTIALLY-PROCESSED-PROBLEMS"), makeSymbol("NON-EXPLANATORY-SUBPROOFS-POSSIBLE?"), makeSymbol("NON-EXPLANATORY-SUBPROOFS-INDEX"),
	    makeSymbol("MOST-RECENT-TACTIC-EXECUTED"), makeSymbol("MIN-PROOF-DEPTH-INDEX"), makeSymbol("MIN-TRANSFORMATION-DEPTH-INDEX"), makeSymbol("MIN-TRANSFORMATION-DEPTH-SIGNATURE-INDEX"), makeSymbol("MIN-DEPTH-INDEX"), makeSymbol("EQUALITY-REASONING-METHOD"),
	    makeSymbol("EQUALITY-REASONING-DOMAIN"), makeSymbol("INTERMEDIATE-STEP-VALIDATION-LEVEL"), makeSymbol("MAX-PROBLEM-COUNT"), makeSymbol("CRAZY-MAX-PROBLEM-COUNT"), makeSymbol("REMOVAL-ALLOWED?"), makeSymbol("TRANSFORMATION-ALLOWED?"), makeSymbol("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"),
	    makeSymbol("NEGATION-BY-FAILURE?"), makeSymbol("COMPLETENESS-MINIMIZATION-ALLOWED?"), makeSymbol("DIRECTION"), makeSymbol("EVALUATE-SUBL-ALLOWED?"), makeSymbol("REWRITE-ALLOWED?"), makeSymbol("ABDUCTION-ALLOWED?"), makeSymbol("NEW-TERMS-ALLOWED?"),
	    makeSymbol("COMPUTE-ANSWER-JUSTIFICATIONS?"), makeSymbol("MEMOIZATION-STATE"), makeSymbol("SBHL-RESOURCE-SPACE"), makeSymbol("PREPARED?"), makeSymbol("DESTRUCTION-IMMINENT?"), makeSymbol("META-PROBLEM-STORE"), makeSymbol("STATIC-PROPERTIES"), makeSymbol("JANITOR"),
	    makeSymbol("HISTORICAL-ROOT-PROBLEMS"), makeSymbol("HISTORICAL-TACTIC-COUNT"), makeSymbol("COMPLEX-PROBLEM-QUERY-CZER-INDEX"), makeSymbol("COMPLEX-PROBLEM-QUERY-SIGNATURES"), makeSymbol("PROOF-KEEPING-INDEX") });

    private static final SubLList $list25 = list(new SubLObject[] { $GUID, $SUID, $LOCK, makeKeyword("CREATION-TIME"), makeKeyword("INFERENCE-ID-INDEX"), makeKeyword("STRATEGY-ID-INDEX"), makeKeyword("PROBLEM-ID-INDEX"), makeKeyword("LINK-ID-INDEX"),
	    makeKeyword("PROOF-ID-INDEX"), makeKeyword("PROBLEMS-BY-QUERY-INDEX"), makeKeyword("REJECTED-PROOFS"), makeKeyword("PROCESSED-PROOFS"), makeKeyword("POTENTIALLY-PROCESSED-PROBLEMS"), makeKeyword("NON-EXPLANATORY-SUBPROOFS-POSSIBLE?"), makeKeyword("NON-EXPLANATORY-SUBPROOFS-INDEX"),
	    makeKeyword("MOST-RECENT-TACTIC-EXECUTED"), makeKeyword("MIN-PROOF-DEPTH-INDEX"), makeKeyword("MIN-TRANSFORMATION-DEPTH-INDEX"), makeKeyword("MIN-TRANSFORMATION-DEPTH-SIGNATURE-INDEX"), makeKeyword("MIN-DEPTH-INDEX"), makeKeyword("EQUALITY-REASONING-METHOD"),
	    makeKeyword("EQUALITY-REASONING-DOMAIN"), makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL"), makeKeyword("MAX-PROBLEM-COUNT"), makeKeyword("CRAZY-MAX-PROBLEM-COUNT"), makeKeyword("REMOVAL-ALLOWED?"), makeKeyword("TRANSFORMATION-ALLOWED?"),
	    makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), makeKeyword("NEGATION-BY-FAILURE?"), makeKeyword("COMPLETENESS-MINIMIZATION-ALLOWED?"), makeKeyword("DIRECTION"), makeKeyword("EVALUATE-SUBL-ALLOWED?"), makeKeyword("REWRITE-ALLOWED?"), makeKeyword("ABDUCTION-ALLOWED?"),
	    makeKeyword("NEW-TERMS-ALLOWED?"), makeKeyword("COMPUTE-ANSWER-JUSTIFICATIONS?"), makeKeyword("MEMOIZATION-STATE"), makeKeyword("SBHL-RESOURCE-SPACE"), makeKeyword("PREPARED?"), makeKeyword("DESTRUCTION-IMMINENT?"), makeKeyword("META-PROBLEM-STORE"), makeKeyword("STATIC-PROPERTIES"),
	    makeKeyword("JANITOR"), makeKeyword("HISTORICAL-ROOT-PROBLEMS"), makeKeyword("HISTORICAL-TACTIC-COUNT"), makeKeyword("COMPLEX-PROBLEM-QUERY-CZER-INDEX"), makeKeyword("COMPLEX-PROBLEM-QUERY-SIGNATURES"), makeKeyword("PROOF-KEEPING-INDEX") });

    private static final SubLList $list26 = list(new SubLObject[] { makeSymbol("PROB-STORE-GUID"), makeSymbol("PROB-STORE-SUID"), makeSymbol("PROB-STORE-LOCK"), makeSymbol("PROB-STORE-CREATION-TIME"), makeSymbol("PROB-STORE-INFERENCE-ID-INDEX"), makeSymbol("PROB-STORE-STRATEGY-ID-INDEX"),
	    makeSymbol("PROB-STORE-PROBLEM-ID-INDEX"), makeSymbol("PROB-STORE-LINK-ID-INDEX"), makeSymbol("PROB-STORE-PROOF-ID-INDEX"), makeSymbol("PROB-STORE-PROBLEMS-BY-QUERY-INDEX"), makeSymbol("PROB-STORE-REJECTED-PROOFS"), makeSymbol("PROB-STORE-PROCESSED-PROOFS"),
	    makeSymbol("PROB-STORE-POTENTIALLY-PROCESSED-PROBLEMS"), makeSymbol("PROB-STORE-NON-EXPLANATORY-SUBPROOFS-POSSIBLE?"), makeSymbol("PROB-STORE-NON-EXPLANATORY-SUBPROOFS-INDEX"), makeSymbol("PROB-STORE-MOST-RECENT-TACTIC-EXECUTED"), makeSymbol("PROB-STORE-MIN-PROOF-DEPTH-INDEX"),
	    makeSymbol("PROB-STORE-MIN-TRANSFORMATION-DEPTH-INDEX"), makeSymbol("PROB-STORE-MIN-TRANSFORMATION-DEPTH-SIGNATURE-INDEX"), makeSymbol("PROB-STORE-MIN-DEPTH-INDEX"), makeSymbol("PROB-STORE-EQUALITY-REASONING-METHOD"), makeSymbol("PROB-STORE-EQUALITY-REASONING-DOMAIN"),
	    makeSymbol("PROB-STORE-INTERMEDIATE-STEP-VALIDATION-LEVEL"), makeSymbol("PROB-STORE-MAX-PROBLEM-COUNT"), makeSymbol("PROB-STORE-CRAZY-MAX-PROBLEM-COUNT"), makeSymbol("PROB-STORE-REMOVAL-ALLOWED?"), makeSymbol("PROB-STORE-TRANSFORMATION-ALLOWED?"),
	    makeSymbol("PROB-STORE-ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), makeSymbol("PROB-STORE-NEGATION-BY-FAILURE?"), makeSymbol("PROB-STORE-COMPLETENESS-MINIMIZATION-ALLOWED?"), makeSymbol("PROB-STORE-DIRECTION"), makeSymbol("PROB-STORE-EVALUATE-SUBL-ALLOWED?"),
	    makeSymbol("PROB-STORE-REWRITE-ALLOWED?"), makeSymbol("PROB-STORE-ABDUCTION-ALLOWED?"), makeSymbol("PROB-STORE-NEW-TERMS-ALLOWED?"), makeSymbol("PROB-STORE-COMPUTE-ANSWER-JUSTIFICATIONS?"), makeSymbol("PROB-STORE-MEMOIZATION-STATE"), makeSymbol("PROB-STORE-SBHL-RESOURCE-SPACE"),
	    makeSymbol("PROB-STORE-PREPARED?"), makeSymbol("PROB-STORE-DESTRUCTION-IMMINENT?"), makeSymbol("PROB-STORE-META-PROBLEM-STORE"), makeSymbol("PROB-STORE-STATIC-PROPERTIES"), makeSymbol("PROB-STORE-JANITOR"), makeSymbol("PROB-STORE-HISTORICAL-ROOT-PROBLEMS"),
	    makeSymbol("PROB-STORE-HISTORICAL-TACTIC-COUNT"), makeSymbol("PROB-STORE-COMPLEX-PROBLEM-QUERY-CZER-INDEX"), makeSymbol("PROB-STORE-COMPLEX-PROBLEM-QUERY-SIGNATURES"), makeSymbol("PROB-STORE-PROOF-KEEPING-INDEX") });

    private static final SubLList $list27 = list(new SubLObject[] { makeSymbol("_CSETF-PROB-STORE-GUID"), makeSymbol("_CSETF-PROB-STORE-SUID"), makeSymbol("_CSETF-PROB-STORE-LOCK"), makeSymbol("_CSETF-PROB-STORE-CREATION-TIME"), makeSymbol("_CSETF-PROB-STORE-INFERENCE-ID-INDEX"),
	    makeSymbol("_CSETF-PROB-STORE-STRATEGY-ID-INDEX"), makeSymbol("_CSETF-PROB-STORE-PROBLEM-ID-INDEX"), makeSymbol("_CSETF-PROB-STORE-LINK-ID-INDEX"), makeSymbol("_CSETF-PROB-STORE-PROOF-ID-INDEX"), makeSymbol("_CSETF-PROB-STORE-PROBLEMS-BY-QUERY-INDEX"),
	    makeSymbol("_CSETF-PROB-STORE-REJECTED-PROOFS"), makeSymbol("_CSETF-PROB-STORE-PROCESSED-PROOFS"), makeSymbol("_CSETF-PROB-STORE-POTENTIALLY-PROCESSED-PROBLEMS"), makeSymbol("_CSETF-PROB-STORE-NON-EXPLANATORY-SUBPROOFS-POSSIBLE?"),
	    makeSymbol("_CSETF-PROB-STORE-NON-EXPLANATORY-SUBPROOFS-INDEX"), makeSymbol("_CSETF-PROB-STORE-MOST-RECENT-TACTIC-EXECUTED"), makeSymbol("_CSETF-PROB-STORE-MIN-PROOF-DEPTH-INDEX"), makeSymbol("_CSETF-PROB-STORE-MIN-TRANSFORMATION-DEPTH-INDEX"),
	    makeSymbol("_CSETF-PROB-STORE-MIN-TRANSFORMATION-DEPTH-SIGNATURE-INDEX"), makeSymbol("_CSETF-PROB-STORE-MIN-DEPTH-INDEX"), makeSymbol("_CSETF-PROB-STORE-EQUALITY-REASONING-METHOD"), makeSymbol("_CSETF-PROB-STORE-EQUALITY-REASONING-DOMAIN"),
	    makeSymbol("_CSETF-PROB-STORE-INTERMEDIATE-STEP-VALIDATION-LEVEL"), makeSymbol("_CSETF-PROB-STORE-MAX-PROBLEM-COUNT"), makeSymbol("_CSETF-PROB-STORE-CRAZY-MAX-PROBLEM-COUNT"), makeSymbol("_CSETF-PROB-STORE-REMOVAL-ALLOWED?"), makeSymbol("_CSETF-PROB-STORE-TRANSFORMATION-ALLOWED?"),
	    makeSymbol("_CSETF-PROB-STORE-ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), makeSymbol("_CSETF-PROB-STORE-NEGATION-BY-FAILURE?"), makeSymbol("_CSETF-PROB-STORE-COMPLETENESS-MINIMIZATION-ALLOWED?"), makeSymbol("_CSETF-PROB-STORE-DIRECTION"),
	    makeSymbol("_CSETF-PROB-STORE-EVALUATE-SUBL-ALLOWED?"), makeSymbol("_CSETF-PROB-STORE-REWRITE-ALLOWED?"), makeSymbol("_CSETF-PROB-STORE-ABDUCTION-ALLOWED?"), makeSymbol("_CSETF-PROB-STORE-NEW-TERMS-ALLOWED?"), makeSymbol("_CSETF-PROB-STORE-COMPUTE-ANSWER-JUSTIFICATIONS?"),
	    makeSymbol("_CSETF-PROB-STORE-MEMOIZATION-STATE"), makeSymbol("_CSETF-PROB-STORE-SBHL-RESOURCE-SPACE"), makeSymbol("_CSETF-PROB-STORE-PREPARED?"), makeSymbol("_CSETF-PROB-STORE-DESTRUCTION-IMMINENT?"), makeSymbol("_CSETF-PROB-STORE-META-PROBLEM-STORE"),
	    makeSymbol("_CSETF-PROB-STORE-STATIC-PROPERTIES"), makeSymbol("_CSETF-PROB-STORE-JANITOR"), makeSymbol("_CSETF-PROB-STORE-HISTORICAL-ROOT-PROBLEMS"), makeSymbol("_CSETF-PROB-STORE-HISTORICAL-TACTIC-COUNT"), makeSymbol("_CSETF-PROB-STORE-COMPLEX-PROBLEM-QUERY-CZER-INDEX"),
	    makeSymbol("_CSETF-PROB-STORE-COMPLEX-PROBLEM-QUERY-SIGNATURES"), makeSymbol("_CSETF-PROB-STORE-PROOF-KEEPING-INDEX") });

    private static final SubLSymbol PRINT_PROBLEM_STORE = makeSymbol("PRINT-PROBLEM-STORE");

    private static final SubLSymbol PROBLEM_STORE_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("PROBLEM-STORE-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list59 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("PROBLEM-STORE-P"));

    private static final SubLSymbol PROB_STORE_GUID = makeSymbol("PROB-STORE-GUID");

    private static final SubLSymbol _CSETF_PROB_STORE_GUID = makeSymbol("_CSETF-PROB-STORE-GUID");

    private static final SubLSymbol PROB_STORE_SUID = makeSymbol("PROB-STORE-SUID");

    private static final SubLSymbol _CSETF_PROB_STORE_SUID = makeSymbol("_CSETF-PROB-STORE-SUID");

    private static final SubLSymbol PROB_STORE_LOCK = makeSymbol("PROB-STORE-LOCK");

    private static final SubLSymbol _CSETF_PROB_STORE_LOCK = makeSymbol("_CSETF-PROB-STORE-LOCK");

    private static final SubLSymbol PROB_STORE_CREATION_TIME = makeSymbol("PROB-STORE-CREATION-TIME");

    private static final SubLSymbol _CSETF_PROB_STORE_CREATION_TIME = makeSymbol("_CSETF-PROB-STORE-CREATION-TIME");

    private static final SubLSymbol PROB_STORE_INFERENCE_ID_INDEX = makeSymbol("PROB-STORE-INFERENCE-ID-INDEX");

    private static final SubLSymbol _CSETF_PROB_STORE_INFERENCE_ID_INDEX = makeSymbol("_CSETF-PROB-STORE-INFERENCE-ID-INDEX");

    private static final SubLSymbol PROB_STORE_STRATEGY_ID_INDEX = makeSymbol("PROB-STORE-STRATEGY-ID-INDEX");

    private static final SubLSymbol _CSETF_PROB_STORE_STRATEGY_ID_INDEX = makeSymbol("_CSETF-PROB-STORE-STRATEGY-ID-INDEX");

    private static final SubLSymbol PROB_STORE_PROBLEM_ID_INDEX = makeSymbol("PROB-STORE-PROBLEM-ID-INDEX");

    private static final SubLSymbol _CSETF_PROB_STORE_PROBLEM_ID_INDEX = makeSymbol("_CSETF-PROB-STORE-PROBLEM-ID-INDEX");

    private static final SubLSymbol PROB_STORE_LINK_ID_INDEX = makeSymbol("PROB-STORE-LINK-ID-INDEX");

    private static final SubLSymbol _CSETF_PROB_STORE_LINK_ID_INDEX = makeSymbol("_CSETF-PROB-STORE-LINK-ID-INDEX");

    private static final SubLSymbol PROB_STORE_PROOF_ID_INDEX = makeSymbol("PROB-STORE-PROOF-ID-INDEX");

    private static final SubLSymbol _CSETF_PROB_STORE_PROOF_ID_INDEX = makeSymbol("_CSETF-PROB-STORE-PROOF-ID-INDEX");

    private static final SubLSymbol PROB_STORE_PROBLEMS_BY_QUERY_INDEX = makeSymbol("PROB-STORE-PROBLEMS-BY-QUERY-INDEX");

    private static final SubLSymbol _CSETF_PROB_STORE_PROBLEMS_BY_QUERY_INDEX = makeSymbol("_CSETF-PROB-STORE-PROBLEMS-BY-QUERY-INDEX");

    private static final SubLSymbol PROB_STORE_REJECTED_PROOFS = makeSymbol("PROB-STORE-REJECTED-PROOFS");

    private static final SubLSymbol _CSETF_PROB_STORE_REJECTED_PROOFS = makeSymbol("_CSETF-PROB-STORE-REJECTED-PROOFS");

    private static final SubLSymbol PROB_STORE_PROCESSED_PROOFS = makeSymbol("PROB-STORE-PROCESSED-PROOFS");

    private static final SubLSymbol _CSETF_PROB_STORE_PROCESSED_PROOFS = makeSymbol("_CSETF-PROB-STORE-PROCESSED-PROOFS");

    private static final SubLSymbol PROB_STORE_POTENTIALLY_PROCESSED_PROBLEMS = makeSymbol("PROB-STORE-POTENTIALLY-PROCESSED-PROBLEMS");

    private static final SubLSymbol _CSETF_PROB_STORE_POTENTIALLY_PROCESSED_PROBLEMS = makeSymbol("_CSETF-PROB-STORE-POTENTIALLY-PROCESSED-PROBLEMS");

    private static final SubLSymbol $sym86$PROB_STORE_NON_EXPLANATORY_SUBPROOFS_POSSIBLE_ = makeSymbol("PROB-STORE-NON-EXPLANATORY-SUBPROOFS-POSSIBLE?");

    private static final SubLSymbol $sym87$_CSETF_PROB_STORE_NON_EXPLANATORY_SUBPROOFS_POSSIBLE_ = makeSymbol("_CSETF-PROB-STORE-NON-EXPLANATORY-SUBPROOFS-POSSIBLE?");

    private static final SubLSymbol PROB_STORE_NON_EXPLANATORY_SUBPROOFS_INDEX = makeSymbol("PROB-STORE-NON-EXPLANATORY-SUBPROOFS-INDEX");

    private static final SubLSymbol _CSETF_PROB_STORE_NON_EXPLANATORY_SUBPROOFS_INDEX = makeSymbol("_CSETF-PROB-STORE-NON-EXPLANATORY-SUBPROOFS-INDEX");

    private static final SubLSymbol PROB_STORE_MOST_RECENT_TACTIC_EXECUTED = makeSymbol("PROB-STORE-MOST-RECENT-TACTIC-EXECUTED");

    private static final SubLSymbol _CSETF_PROB_STORE_MOST_RECENT_TACTIC_EXECUTED = makeSymbol("_CSETF-PROB-STORE-MOST-RECENT-TACTIC-EXECUTED");

    private static final SubLSymbol PROB_STORE_MIN_PROOF_DEPTH_INDEX = makeSymbol("PROB-STORE-MIN-PROOF-DEPTH-INDEX");

    private static final SubLSymbol _CSETF_PROB_STORE_MIN_PROOF_DEPTH_INDEX = makeSymbol("_CSETF-PROB-STORE-MIN-PROOF-DEPTH-INDEX");

    private static final SubLSymbol PROB_STORE_MIN_TRANSFORMATION_DEPTH_INDEX = makeSymbol("PROB-STORE-MIN-TRANSFORMATION-DEPTH-INDEX");

    private static final SubLSymbol _CSETF_PROB_STORE_MIN_TRANSFORMATION_DEPTH_INDEX = makeSymbol("_CSETF-PROB-STORE-MIN-TRANSFORMATION-DEPTH-INDEX");

    private static final SubLSymbol PROB_STORE_MIN_TRANSFORMATION_DEPTH_SIGNATURE_INDEX = makeSymbol("PROB-STORE-MIN-TRANSFORMATION-DEPTH-SIGNATURE-INDEX");

    private static final SubLSymbol _CSETF_PROB_STORE_MIN_TRANSFORMATION_DEPTH_SIGNATURE_INDEX = makeSymbol("_CSETF-PROB-STORE-MIN-TRANSFORMATION-DEPTH-SIGNATURE-INDEX");

    private static final SubLSymbol PROB_STORE_MIN_DEPTH_INDEX = makeSymbol("PROB-STORE-MIN-DEPTH-INDEX");

    private static final SubLSymbol _CSETF_PROB_STORE_MIN_DEPTH_INDEX = makeSymbol("_CSETF-PROB-STORE-MIN-DEPTH-INDEX");

    private static final SubLSymbol PROB_STORE_EQUALITY_REASONING_METHOD = makeSymbol("PROB-STORE-EQUALITY-REASONING-METHOD");

    private static final SubLSymbol _CSETF_PROB_STORE_EQUALITY_REASONING_METHOD = makeSymbol("_CSETF-PROB-STORE-EQUALITY-REASONING-METHOD");

    private static final SubLSymbol PROB_STORE_EQUALITY_REASONING_DOMAIN = makeSymbol("PROB-STORE-EQUALITY-REASONING-DOMAIN");

    private static final SubLSymbol _CSETF_PROB_STORE_EQUALITY_REASONING_DOMAIN = makeSymbol("_CSETF-PROB-STORE-EQUALITY-REASONING-DOMAIN");

    private static final SubLSymbol PROB_STORE_INTERMEDIATE_STEP_VALIDATION_LEVEL = makeSymbol("PROB-STORE-INTERMEDIATE-STEP-VALIDATION-LEVEL");

    private static final SubLSymbol _CSETF_PROB_STORE_INTERMEDIATE_STEP_VALIDATION_LEVEL = makeSymbol("_CSETF-PROB-STORE-INTERMEDIATE-STEP-VALIDATION-LEVEL");

    private static final SubLSymbol PROB_STORE_MAX_PROBLEM_COUNT = makeSymbol("PROB-STORE-MAX-PROBLEM-COUNT");

    private static final SubLSymbol _CSETF_PROB_STORE_MAX_PROBLEM_COUNT = makeSymbol("_CSETF-PROB-STORE-MAX-PROBLEM-COUNT");

    private static final SubLSymbol PROB_STORE_CRAZY_MAX_PROBLEM_COUNT = makeSymbol("PROB-STORE-CRAZY-MAX-PROBLEM-COUNT");

    private static final SubLSymbol _CSETF_PROB_STORE_CRAZY_MAX_PROBLEM_COUNT = makeSymbol("_CSETF-PROB-STORE-CRAZY-MAX-PROBLEM-COUNT");

    private static final SubLSymbol $sym110$PROB_STORE_REMOVAL_ALLOWED_ = makeSymbol("PROB-STORE-REMOVAL-ALLOWED?");

    private static final SubLSymbol $sym111$_CSETF_PROB_STORE_REMOVAL_ALLOWED_ = makeSymbol("_CSETF-PROB-STORE-REMOVAL-ALLOWED?");

    private static final SubLSymbol $sym112$PROB_STORE_TRANSFORMATION_ALLOWED_ = makeSymbol("PROB-STORE-TRANSFORMATION-ALLOWED?");

    private static final SubLSymbol $sym113$_CSETF_PROB_STORE_TRANSFORMATION_ALLOWED_ = makeSymbol("_CSETF-PROB-STORE-TRANSFORMATION-ALLOWED?");

    private static final SubLSymbol $sym114$PROB_STORE_ADD_RESTRICTION_LAYER_OF_INDIRECTION_ = makeSymbol("PROB-STORE-ADD-RESTRICTION-LAYER-OF-INDIRECTION?");

    private static final SubLSymbol $sym115$_CSETF_PROB_STORE_ADD_RESTRICTION_LAYER_OF_INDIRECTION_ = makeSymbol("_CSETF-PROB-STORE-ADD-RESTRICTION-LAYER-OF-INDIRECTION?");

    private static final SubLSymbol $sym116$PROB_STORE_NEGATION_BY_FAILURE_ = makeSymbol("PROB-STORE-NEGATION-BY-FAILURE?");

    private static final SubLSymbol $sym117$_CSETF_PROB_STORE_NEGATION_BY_FAILURE_ = makeSymbol("_CSETF-PROB-STORE-NEGATION-BY-FAILURE?");

    private static final SubLSymbol $sym118$PROB_STORE_COMPLETENESS_MINIMIZATION_ALLOWED_ = makeSymbol("PROB-STORE-COMPLETENESS-MINIMIZATION-ALLOWED?");

    private static final SubLSymbol $sym119$_CSETF_PROB_STORE_COMPLETENESS_MINIMIZATION_ALLOWED_ = makeSymbol("_CSETF-PROB-STORE-COMPLETENESS-MINIMIZATION-ALLOWED?");

    private static final SubLSymbol PROB_STORE_DIRECTION = makeSymbol("PROB-STORE-DIRECTION");

    private static final SubLSymbol _CSETF_PROB_STORE_DIRECTION = makeSymbol("_CSETF-PROB-STORE-DIRECTION");

    private static final SubLSymbol $sym122$PROB_STORE_EVALUATE_SUBL_ALLOWED_ = makeSymbol("PROB-STORE-EVALUATE-SUBL-ALLOWED?");

    private static final SubLSymbol $sym123$_CSETF_PROB_STORE_EVALUATE_SUBL_ALLOWED_ = makeSymbol("_CSETF-PROB-STORE-EVALUATE-SUBL-ALLOWED?");

    private static final SubLSymbol $sym124$PROB_STORE_REWRITE_ALLOWED_ = makeSymbol("PROB-STORE-REWRITE-ALLOWED?");

    private static final SubLSymbol $sym125$_CSETF_PROB_STORE_REWRITE_ALLOWED_ = makeSymbol("_CSETF-PROB-STORE-REWRITE-ALLOWED?");

    private static final SubLSymbol $sym126$PROB_STORE_ABDUCTION_ALLOWED_ = makeSymbol("PROB-STORE-ABDUCTION-ALLOWED?");

    private static final SubLSymbol $sym127$_CSETF_PROB_STORE_ABDUCTION_ALLOWED_ = makeSymbol("_CSETF-PROB-STORE-ABDUCTION-ALLOWED?");

    private static final SubLSymbol $sym128$PROB_STORE_NEW_TERMS_ALLOWED_ = makeSymbol("PROB-STORE-NEW-TERMS-ALLOWED?");

    private static final SubLSymbol $sym129$_CSETF_PROB_STORE_NEW_TERMS_ALLOWED_ = makeSymbol("_CSETF-PROB-STORE-NEW-TERMS-ALLOWED?");

    private static final SubLSymbol $sym130$PROB_STORE_COMPUTE_ANSWER_JUSTIFICATIONS_ = makeSymbol("PROB-STORE-COMPUTE-ANSWER-JUSTIFICATIONS?");

    private static final SubLSymbol $sym131$_CSETF_PROB_STORE_COMPUTE_ANSWER_JUSTIFICATIONS_ = makeSymbol("_CSETF-PROB-STORE-COMPUTE-ANSWER-JUSTIFICATIONS?");

    private static final SubLSymbol PROB_STORE_MEMOIZATION_STATE = makeSymbol("PROB-STORE-MEMOIZATION-STATE");

    private static final SubLSymbol _CSETF_PROB_STORE_MEMOIZATION_STATE = makeSymbol("_CSETF-PROB-STORE-MEMOIZATION-STATE");

    private static final SubLSymbol PROB_STORE_SBHL_RESOURCE_SPACE = makeSymbol("PROB-STORE-SBHL-RESOURCE-SPACE");

    private static final SubLSymbol _CSETF_PROB_STORE_SBHL_RESOURCE_SPACE = makeSymbol("_CSETF-PROB-STORE-SBHL-RESOURCE-SPACE");

    private static final SubLSymbol $sym136$PROB_STORE_PREPARED_ = makeSymbol("PROB-STORE-PREPARED?");

    private static final SubLSymbol $sym137$_CSETF_PROB_STORE_PREPARED_ = makeSymbol("_CSETF-PROB-STORE-PREPARED?");

    private static final SubLSymbol $sym138$PROB_STORE_DESTRUCTION_IMMINENT_ = makeSymbol("PROB-STORE-DESTRUCTION-IMMINENT?");

    private static final SubLSymbol $sym139$_CSETF_PROB_STORE_DESTRUCTION_IMMINENT_ = makeSymbol("_CSETF-PROB-STORE-DESTRUCTION-IMMINENT?");

    private static final SubLSymbol PROB_STORE_META_PROBLEM_STORE = makeSymbol("PROB-STORE-META-PROBLEM-STORE");

    private static final SubLSymbol _CSETF_PROB_STORE_META_PROBLEM_STORE = makeSymbol("_CSETF-PROB-STORE-META-PROBLEM-STORE");

    private static final SubLSymbol PROB_STORE_STATIC_PROPERTIES = makeSymbol("PROB-STORE-STATIC-PROPERTIES");

    private static final SubLSymbol _CSETF_PROB_STORE_STATIC_PROPERTIES = makeSymbol("_CSETF-PROB-STORE-STATIC-PROPERTIES");

    private static final SubLSymbol PROB_STORE_JANITOR = makeSymbol("PROB-STORE-JANITOR");

    private static final SubLSymbol _CSETF_PROB_STORE_JANITOR = makeSymbol("_CSETF-PROB-STORE-JANITOR");

    private static final SubLSymbol PROB_STORE_HISTORICAL_ROOT_PROBLEMS = makeSymbol("PROB-STORE-HISTORICAL-ROOT-PROBLEMS");

    private static final SubLSymbol _CSETF_PROB_STORE_HISTORICAL_ROOT_PROBLEMS = makeSymbol("_CSETF-PROB-STORE-HISTORICAL-ROOT-PROBLEMS");

    private static final SubLSymbol PROB_STORE_HISTORICAL_TACTIC_COUNT = makeSymbol("PROB-STORE-HISTORICAL-TACTIC-COUNT");

    private static final SubLSymbol _CSETF_PROB_STORE_HISTORICAL_TACTIC_COUNT = makeSymbol("_CSETF-PROB-STORE-HISTORICAL-TACTIC-COUNT");

    private static final SubLSymbol PROB_STORE_COMPLEX_PROBLEM_QUERY_CZER_INDEX = makeSymbol("PROB-STORE-COMPLEX-PROBLEM-QUERY-CZER-INDEX");

    private static final SubLSymbol _CSETF_PROB_STORE_COMPLEX_PROBLEM_QUERY_CZER_INDEX = makeSymbol("_CSETF-PROB-STORE-COMPLEX-PROBLEM-QUERY-CZER-INDEX");

    private static final SubLSymbol PROB_STORE_COMPLEX_PROBLEM_QUERY_SIGNATURES = makeSymbol("PROB-STORE-COMPLEX-PROBLEM-QUERY-SIGNATURES");

    private static final SubLSymbol _CSETF_PROB_STORE_COMPLEX_PROBLEM_QUERY_SIGNATURES = makeSymbol("_CSETF-PROB-STORE-COMPLEX-PROBLEM-QUERY-SIGNATURES");

    private static final SubLSymbol PROB_STORE_PROOF_KEEPING_INDEX = makeSymbol("PROB-STORE-PROOF-KEEPING-INDEX");

    private static final SubLSymbol _CSETF_PROB_STORE_PROOF_KEEPING_INDEX = makeSymbol("_CSETF-PROB-STORE-PROOF-KEEPING-INDEX");

    private static final SubLSymbol $INFERENCE_ID_INDEX = makeKeyword("INFERENCE-ID-INDEX");

    private static final SubLSymbol $STRATEGY_ID_INDEX = makeKeyword("STRATEGY-ID-INDEX");

    private static final SubLSymbol $PROBLEM_ID_INDEX = makeKeyword("PROBLEM-ID-INDEX");

    private static final SubLSymbol $LINK_ID_INDEX = makeKeyword("LINK-ID-INDEX");

    private static final SubLSymbol $PROOF_ID_INDEX = makeKeyword("PROOF-ID-INDEX");

    private static final SubLSymbol $PROBLEMS_BY_QUERY_INDEX = makeKeyword("PROBLEMS-BY-QUERY-INDEX");

    private static final SubLSymbol $POTENTIALLY_PROCESSED_PROBLEMS = makeKeyword("POTENTIALLY-PROCESSED-PROBLEMS");

    private static final SubLSymbol $kw169$NON_EXPLANATORY_SUBPROOFS_POSSIBLE_ = makeKeyword("NON-EXPLANATORY-SUBPROOFS-POSSIBLE?");

    private static final SubLSymbol $NON_EXPLANATORY_SUBPROOFS_INDEX = makeKeyword("NON-EXPLANATORY-SUBPROOFS-INDEX");

    private static final SubLSymbol $MOST_RECENT_TACTIC_EXECUTED = makeKeyword("MOST-RECENT-TACTIC-EXECUTED");

    private static final SubLSymbol $MIN_PROOF_DEPTH_INDEX = makeKeyword("MIN-PROOF-DEPTH-INDEX");

    private static final SubLSymbol $MIN_TRANSFORMATION_DEPTH_INDEX = makeKeyword("MIN-TRANSFORMATION-DEPTH-INDEX");

    private static final SubLSymbol $MIN_TRANSFORMATION_DEPTH_SIGNATURE_INDEX = makeKeyword("MIN-TRANSFORMATION-DEPTH-SIGNATURE-INDEX");

    private static final SubLSymbol $MIN_DEPTH_INDEX = makeKeyword("MIN-DEPTH-INDEX");

    private static final SubLSymbol $EQUALITY_REASONING_METHOD = makeKeyword("EQUALITY-REASONING-METHOD");

    private static final SubLSymbol $EQUALITY_REASONING_DOMAIN = makeKeyword("EQUALITY-REASONING-DOMAIN");

    private static final SubLSymbol $INTERMEDIATE_STEP_VALIDATION_LEVEL = makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL");

    private static final SubLSymbol $MAX_PROBLEM_COUNT = makeKeyword("MAX-PROBLEM-COUNT");

    private static final SubLSymbol $CRAZY_MAX_PROBLEM_COUNT = makeKeyword("CRAZY-MAX-PROBLEM-COUNT");

    private static final SubLSymbol $kw181$REMOVAL_ALLOWED_ = makeKeyword("REMOVAL-ALLOWED?");

    private static final SubLSymbol $kw182$TRANSFORMATION_ALLOWED_ = makeKeyword("TRANSFORMATION-ALLOWED?");

    private static final SubLSymbol $kw183$ADD_RESTRICTION_LAYER_OF_INDIRECTION_ = makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?");

    private static final SubLSymbol $kw184$NEGATION_BY_FAILURE_ = makeKeyword("NEGATION-BY-FAILURE?");

    private static final SubLSymbol $kw185$COMPLETENESS_MINIMIZATION_ALLOWED_ = makeKeyword("COMPLETENESS-MINIMIZATION-ALLOWED?");

    private static final SubLSymbol $kw187$EVALUATE_SUBL_ALLOWED_ = makeKeyword("EVALUATE-SUBL-ALLOWED?");

    private static final SubLSymbol $kw188$REWRITE_ALLOWED_ = makeKeyword("REWRITE-ALLOWED?");

    private static final SubLSymbol $kw189$ABDUCTION_ALLOWED_ = makeKeyword("ABDUCTION-ALLOWED?");

    private static final SubLSymbol $kw190$NEW_TERMS_ALLOWED_ = makeKeyword("NEW-TERMS-ALLOWED?");

    private static final SubLSymbol $kw191$COMPUTE_ANSWER_JUSTIFICATIONS_ = makeKeyword("COMPUTE-ANSWER-JUSTIFICATIONS?");

    private static final SubLSymbol $SBHL_RESOURCE_SPACE = makeKeyword("SBHL-RESOURCE-SPACE");

    private static final SubLSymbol $kw195$DESTRUCTION_IMMINENT_ = makeKeyword("DESTRUCTION-IMMINENT?");

    private static final SubLSymbol $META_PROBLEM_STORE = makeKeyword("META-PROBLEM-STORE");

    private static final SubLSymbol $HISTORICAL_ROOT_PROBLEMS = makeKeyword("HISTORICAL-ROOT-PROBLEMS");

    private static final SubLSymbol $HISTORICAL_TACTIC_COUNT = makeKeyword("HISTORICAL-TACTIC-COUNT");

    private static final SubLSymbol $COMPLEX_PROBLEM_QUERY_CZER_INDEX = makeKeyword("COMPLEX-PROBLEM-QUERY-CZER-INDEX");

    private static final SubLSymbol $COMPLEX_PROBLEM_QUERY_SIGNATURES = makeKeyword("COMPLEX-PROBLEM-QUERY-SIGNATURES");

    private static final SubLSymbol $PROOF_KEEPING_INDEX = makeKeyword("PROOF-KEEPING-INDEX");

    private static final SubLString $str204$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    private static final SubLSymbol MAKE_PROBLEM_STORE = makeSymbol("MAKE-PROBLEM-STORE");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_PROBLEM_STORE_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-PROBLEM-STORE-METHOD");

    private static final SubLString $str211$_Invalid_PROBLEM_STORE__s_ = makeString("<Invalid PROBLEM STORE ~s>");

    private static final SubLString $str212$_PROBLEM_STORE__a_size__a_ = makeString("<PROBLEM STORE ~a size=~a>");

    private static final SubLSymbol SXHASH_PROBLEM_STORE_METHOD = makeSymbol("SXHASH-PROBLEM-STORE-METHOD");

    static private final SubLList $list214 = list(makeSymbol("STORE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol PROBLEM_STORE_LOCK = makeSymbol("PROBLEM-STORE-LOCK");

    private static final SubLSymbol WITH_PROBLEM_STORE_LOCK_HELD = makeSymbol("WITH-PROBLEM-STORE-LOCK-HELD");

    static private final SubLList $list218 = list(list(makeSymbol("STORE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol PROBLEM_STORE_MEMOIZATION_STATE = makeSymbol("PROBLEM-STORE-MEMOIZATION-STATE");

    private static final SubLSymbol WITH_PROBLEM_STORE_MEMOIZATION_STATE = makeSymbol("WITH-PROBLEM-STORE-MEMOIZATION-STATE");

    private static final SubLSymbol $sym222$SPACE_VAR = makeUninternedSymbol("SPACE-VAR");

    private static final SubLSymbol PROBLEM_STORE_SBHL_RESOURCE_SPACE = makeSymbol("PROBLEM-STORE-SBHL-RESOURCE-SPACE");

    private static final SubLSymbol WITH_SBHL_MARKING_SPACE_RESOURCE = makeSymbol("WITH-SBHL-MARKING-SPACE-RESOURCE");

    private static final SubLSymbol SET_PROBLEM_STORE_SBHL_RESOURCE_SPACE = makeSymbol("SET-PROBLEM-STORE-SBHL-RESOURCE-SPACE");

    private static final SubLSymbol WITH_PROBLEM_STORE_SBHL_RESOURCE_SPACE = makeSymbol("WITH-PROBLEM-STORE-SBHL-RESOURCE-SPACE");

    private static final SubLSymbol $sym228$STORE_VAR = makeUninternedSymbol("STORE-VAR");

    private static final SubLList $list229 = list(list(makeSymbol("INFERENCE-VAR"), makeSymbol("STORE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym230$ID = makeUninternedSymbol("ID");

    private static final SubLSymbol PROBLEM_STORE_INFERENCE_ID_INDEX = makeSymbol("PROBLEM-STORE-INFERENCE-ID-INDEX");

    private static final SubLSymbol DO_PROBLEM_STORE_INFERENCES = makeSymbol("DO-PROBLEM-STORE-INFERENCES");

    private static final SubLList $list233 = list(list(makeSymbol("STRATEGY-VAR"), makeSymbol("STORE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym234$ID = makeUninternedSymbol("ID");

    private static final SubLSymbol PROBLEM_STORE_STRATEGY_ID_INDEX = makeSymbol("PROBLEM-STORE-STRATEGY-ID-INDEX");

    private static final SubLSymbol DO_PROBLEM_STORE_STRATEGIES = makeSymbol("DO-PROBLEM-STORE-STRATEGIES");

    private static final SubLList $list237 = list(list(makeSymbol("STRATEGIC-CONTEXT-VAR"), makeSymbol("STORE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list239 = list(makeKeyword("TACTICAL"));

    private static final SubLList $list240 = list(list(makeSymbol("PROBLEM-VAR"), makeSymbol("STORE"), makeSymbol("&KEY"), makeSymbol("ORDERED"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list241 = list(makeKeyword("ORDERED"), $DONE);

    private static final SubLSymbol $sym243$ID = makeUninternedSymbol("ID");

    private static final SubLSymbol PROBLEM_STORE_PROBLEM_ID_INDEX = makeSymbol("PROBLEM-STORE-PROBLEM-ID-INDEX");

    private static final SubLSymbol DO_PROBLEM_STORE_PROBLEMS = makeSymbol("DO-PROBLEM-STORE-PROBLEMS");

    static private final SubLList $list246 = list(list(makeSymbol("LINK-VAR"), makeSymbol("STORE"), makeSymbol("&KEY"), makeSymbol("TYPE"), makeSymbol("ORDERED"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list247 = list($TYPE, makeKeyword("ORDERED"), $DONE);

    private static final SubLSymbol $sym249$ID = makeUninternedSymbol("ID");

    private static final SubLSymbol PROBLEM_STORE_LINK_ID_INDEX = makeSymbol("PROBLEM-STORE-LINK-ID-INDEX");

    private static final SubLSymbol DO_PROBLEM_STORE_LINKS = makeSymbol("DO-PROBLEM-STORE-LINKS");

    private static final SubLSymbol $sym253$PROBLEM_LINK_HAS_TYPE_ = makeSymbol("PROBLEM-LINK-HAS-TYPE?");

    private static final SubLList $list254 = list(list(makeSymbol("PROOF-VAR"), makeSymbol("STORE"), makeSymbol("&KEY"), makeSymbol("PROOF-STATUS"), makeSymbol("ORDERED"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list255 = list(makeKeyword("PROOF-STATUS"), makeKeyword("ORDERED"), $DONE);

    private static final SubLSymbol $sym257$ID = makeUninternedSymbol("ID");

    private static final SubLSymbol PROBLEM_STORE_PROOF_ID_INDEX = makeSymbol("PROBLEM-STORE-PROOF-ID-INDEX");

    private static final SubLSymbol DO_PROBLEM_STORE_PROOFS = makeSymbol("DO-PROBLEM-STORE-PROOFS");

    private static final SubLSymbol $sym260$PROOF_HAS_STATUS_ = makeSymbol("PROOF-HAS-STATUS?");

    private static final SubLList $list261 = list(list(makeSymbol("PROBLEM-VAR"), makeSymbol("STORE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol PROBLEM_STORE_HISTORICAL_ROOT_PROBLEMS = makeSymbol("PROBLEM-STORE-HISTORICAL-ROOT-PROBLEMS");

    private static final SubLSymbol DO_PROBLEM_STORE_HISTORICAL_ROOT_PROBLEMS = makeSymbol("DO-PROBLEM-STORE-HISTORICAL-ROOT-PROBLEMS");

    private static final SubLList $list265 = list(list(makeSymbol("STRATEGY-VAR"), makeSymbol("INFERENCE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym266$INFERENCE_VAR = makeUninternedSymbol("INFERENCE-VAR");

    private static final SubLSymbol INFERENCE_STRATEGY_SET = makeSymbol("INFERENCE-STRATEGY-SET");

    private static final SubLInteger $int$80 = makeInteger(80);

    private static final SubLInteger $int$120 = makeInteger(120);

    private static final SubLSymbol PROBLEM_STORE_PROPERTIES_P = makeSymbol("PROBLEM-STORE-PROPERTIES-P");

    private static final SubLSymbol PROBLEM_STORE_NAME_P = makeSymbol("PROBLEM-STORE-NAME-P");

    private static final SubLString $str272$A_problem_store_named__s_already_ = makeString("A problem store named ~s already exists.");

    private static final SubLString $$$Problem_Store_Lock = makeString("Problem Store Lock");

    private static final SubLSymbol PROBLEM_STORE_EQUALITY_REASONING_METHOD_P = makeSymbol("PROBLEM-STORE-EQUALITY-REASONING-METHOD-P");

    private static final SubLSymbol PROBLEM_STORE_EQUALITY_REASONING_DOMAIN_P = makeSymbol("PROBLEM-STORE-EQUALITY-REASONING-DOMAIN-P");

    private static final SubLSymbol INTERMEDIATE_STEP_VALIDATION_LEVEL_P = makeSymbol("INTERMEDIATE-STEP-VALIDATION-LEVEL-P");

    private static final SubLSymbol MAX_PROBLEM_COUNT_P = makeSymbol("MAX-PROBLEM-COUNT-P");

    private static final SubLSymbol INFERENCE_DIRECTION_P = makeSymbol("INFERENCE-DIRECTION-P");

    private static final SubLString $$$problem_store_memoization_state = makeString("problem store memoization state");

    private static final SubLString $$$problem_store_memoization_lock = makeString("problem store memoization lock");

    private static final SubLString $str284$Destroying_problem_store__S_at_le = makeString("Destroying problem store ~S at least one running inference ~S");

    private static final SubLSymbol NEW_PROBLEM_STORE_P = makeSymbol("NEW-PROBLEM-STORE-P");

    private static final SubLInteger $int$212 = makeInteger(212);

    private static final SubLSymbol $sym305$PROBLEM_STORE_ALLOWS_PROBLEM_HL_FREE_VARS_OPTIMIZATION__INT = makeSymbol("PROBLEM-STORE-ALLOWS-PROBLEM-HL-FREE-VARS-OPTIMIZATION?-INT");

    private static final SubLSymbol $sym309$_ = makeSymbol("<");

    private static final SubLSymbol PROOF_SUID = makeSymbol("PROOF-SUID");

    private static final SubLSymbol PROBLEM_STORE_SIZE = makeSymbol("PROBLEM-STORE-SIZE");

    private static final SubLSymbol PROBLEM_LINK_SUID = makeSymbol("PROBLEM-LINK-SUID");

    private static final SubLSymbol $NON_PROOF_KEEPING = makeKeyword("NON-PROOF-KEEPING");

    private static final SubLList $list317 = list(makeKeyword("NON-PROOF-KEEPING"), makeKeyword("UNKNOWN"));

    private static final SubLString $str318$Invalid_proof_keeping_reason__a_f = makeString("Invalid proof-keeping reason ~a for problem ~a");

    private static final SubLSymbol $sym319$PROOF_REJECTED_ = makeSymbol("PROOF-REJECTED?");

    private static final SubLSymbol ENSURE_TRANSFORMATION_RULE_CONSIDERED_NOTED = makeSymbol("ENSURE-TRANSFORMATION-RULE-CONSIDERED-NOTED");

    private static final SubLSymbol ENSURE_TRANSFORMATION_RULE_SUCCESS_NOTED = makeSymbol("ENSURE-TRANSFORMATION-RULE-SUCCESS-NOTED");

    private static final SubLSymbol PROBLEM_STORE_JANITOR = makeSymbol("PROBLEM-STORE-JANITOR");

    private static final SubLSymbol PROBLEM_STORE_JANITOR_P = makeSymbol("PROBLEM-STORE-JANITOR-P");

    private static final SubLList $list327 = list(makeSymbol("STORE"), makeSymbol("INDESTRUCTIBLE-PROBLEMS"), makeSymbol("STALE?"));

    private static final SubLList $list328 = list(makeKeyword("STORE"), makeKeyword("INDESTRUCTIBLE-PROBLEMS"), makeKeyword("STALE?"));

    private static final SubLList $list329 = list(makeSymbol("PROB-STORE-JANITOR-STORE"), makeSymbol("PROB-STORE-JANITOR-INDESTRUCTIBLE-PROBLEMS"), makeSymbol("PROB-STORE-JANITOR-STALE?"));

    private static final SubLList $list330 = list(makeSymbol("_CSETF-PROB-STORE-JANITOR-STORE"), makeSymbol("_CSETF-PROB-STORE-JANITOR-INDESTRUCTIBLE-PROBLEMS"), makeSymbol("_CSETF-PROB-STORE-JANITOR-STALE?"));

    private static final SubLSymbol PROBLEM_STORE_JANITOR_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("PROBLEM-STORE-JANITOR-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list333 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("PROBLEM-STORE-JANITOR-P"));

    private static final SubLSymbol PROB_STORE_JANITOR_STORE = makeSymbol("PROB-STORE-JANITOR-STORE");

    private static final SubLSymbol _CSETF_PROB_STORE_JANITOR_STORE = makeSymbol("_CSETF-PROB-STORE-JANITOR-STORE");

    private static final SubLSymbol PROB_STORE_JANITOR_INDESTRUCTIBLE_PROBLEMS = makeSymbol("PROB-STORE-JANITOR-INDESTRUCTIBLE-PROBLEMS");

    private static final SubLSymbol _CSETF_PROB_STORE_JANITOR_INDESTRUCTIBLE_PROBLEMS = makeSymbol("_CSETF-PROB-STORE-JANITOR-INDESTRUCTIBLE-PROBLEMS");

    private static final SubLSymbol $sym338$PROB_STORE_JANITOR_STALE_ = makeSymbol("PROB-STORE-JANITOR-STALE?");

    private static final SubLSymbol $sym339$_CSETF_PROB_STORE_JANITOR_STALE_ = makeSymbol("_CSETF-PROB-STORE-JANITOR-STALE?");

    private static final SubLSymbol MAKE_PROBLEM_STORE_JANITOR = makeSymbol("MAKE-PROBLEM-STORE-JANITOR");

    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_PROBLEM_STORE_JANITOR_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-PROBLEM-STORE-JANITOR-METHOD");

    private static final SubLSymbol PROBLEM_STORE_JANITOR_INDESTRUCTIBLE_PROBLEMS = makeSymbol("PROBLEM-STORE-JANITOR-INDESTRUCTIBLE-PROBLEMS");

    private static final SubLSymbol DO_PROBLEM_STORE_JANITOR_INDESTRUCTIBLE_PROBLEMS = makeSymbol("DO-PROBLEM-STORE-JANITOR-INDESTRUCTIBLE-PROBLEMS");

    private static final SubLList $list347 = list(list(makeSymbol("PROBLEM-VAR"), makeSymbol("JANITOR"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol PROBLEM_STORE_JANITOR_STORE = makeSymbol("PROBLEM-STORE-JANITOR-STORE");

    private static final SubLSymbol $sym349$PROBLEM_DESTRUCTIBLE_ = makeSymbol("PROBLEM-DESTRUCTIBLE?");

    private static final SubLSymbol $problem_store_id_to_name_table$ = makeSymbol("*PROBLEM-STORE-ID-TO-NAME-TABLE*");

    private static final SubLSymbol $problem_store_name_to_id_table$ = makeSymbol("*PROBLEM-STORE-NAME-TO-ID-TABLE*");

    private static final SubLSymbol FIND_PROBLEM_STORE_BY_NAME = makeSymbol("FIND-PROBLEM-STORE-BY-NAME");

    private static final SubLSymbol FIND_OR_CREATE_PROBLEM_STORE_BY_NAME = makeSymbol("FIND-OR-CREATE-PROBLEM-STORE-BY-NAME");

    private static final SubLSymbol $PROBLEM_STORE_NAME = makeKeyword("PROBLEM-STORE-NAME");

    private static final SubLSymbol DESTROY_PROBLEM_STORE_BY_NAME = makeSymbol("DESTROY-PROBLEM-STORE-BY-NAME");

    private static final SubLSymbol PROBLEM_STORE_PROPERTY_P = makeSymbol("PROBLEM-STORE-PROPERTY-P");

    private static final SubLString $str357$Problem_store_property__S_reflect = makeString("Problem store property ~S reflection is not yet supported");

    private static final SubLInteger $int$50 = makeInteger(50);

    private static final SubLSymbol TEST_PROBLEM_STORE_PROPERTY_VALUE_SUPPORT = makeSymbol("TEST-PROBLEM-STORE-PROPERTY-VALUE-SUPPORT");

    private static final SubLList $list367 = list(list(NIL, NIL));

    public static final SubLObject new_problem_store_id_alt() {
	return id_index_reserve($problem_store_id_index$.getGlobalValue());
    }

    public static SubLObject new_problem_store_id() {
	return id_index_reserve($problem_store_id_index$.getGlobalValue());
    }

    public static final SubLObject index_problem_store_by_id_alt(SubLObject store, SubLObject suid) {
	return id_index_enter($problem_store_id_index$.getGlobalValue(), suid, store);
    }

    public static SubLObject index_problem_store_by_id(final SubLObject store, final SubLObject suid) {
	return id_index_enter($problem_store_id_index$.getGlobalValue(), suid, store);
    }

    public static final SubLObject unindex_problem_store_by_id_alt(SubLObject store) {
	{
	    SubLObject suid = problem_store_suid(store);
	    return id_index_remove($problem_store_id_index$.getGlobalValue(), suid);
	}
    }

    public static SubLObject unindex_problem_store_by_id(final SubLObject store) {
	final SubLObject suid = inference_datastructures_problem_store.problem_store_suid(store);
	return id_index_remove($problem_store_id_index$.getGlobalValue(), suid);
    }

    public static final SubLObject find_problem_store_by_id_alt(SubLObject suid) {
	return id_index_lookup($problem_store_id_index$.getGlobalValue(), suid, UNPROVIDED);
    }

    public static SubLObject find_problem_store_by_id(final SubLObject suid) {
	return id_index_lookup($problem_store_id_index$.getGlobalValue(), suid, UNPROVIDED);
    }

    public static final SubLObject problem_store_count_alt() {
	return id_index_count($problem_store_id_index$.getGlobalValue());
    }

    public static SubLObject problem_store_count() {
	return id_index_count($problem_store_id_index$.getGlobalValue());
    }

    public static final SubLObject problem_store_next_id_alt() {
	return id_index_next_id($problem_store_id_index$.getGlobalValue());
    }

    public static SubLObject problem_store_next_id() {
	return id_index_next_id($problem_store_id_index$.getGlobalValue());
    }

    public static final SubLObject most_recent_problem_store_alt() {
	{
	    SubLObject start = problem_store_next_id();
	    SubLObject end_var = MINUS_ONE_INTEGER;
	    SubLObject i = NIL;
	    for (i = start; !i.numLE(end_var); i = add(i, MINUS_ONE_INTEGER)) {
		{
		    SubLObject store = find_problem_store_by_id(i);
		    if (NIL != store) {
			return store;
		    }
		}
	    }
	}
	return NIL;
    }

    public static SubLObject most_recent_problem_store() {
	final SubLObject start = inference_datastructures_problem_store.problem_store_next_id();
	SubLObject end_var;
	SubLObject i;
	SubLObject store;
	for (end_var = MINUS_ONE_INTEGER, i = NIL, i = start; !i.numLE(end_var); i = add(i, MINUS_ONE_INTEGER)) {
	    store = inference_datastructures_problem_store.find_problem_store_by_id(i);
	    if (NIL != store) {
		return store;
	    }
	}
	return NIL;
    }

    public static final SubLObject do_all_problem_stores_alt(SubLObject macroform, SubLObject environment) {
	{
	    SubLObject datum = macroform.rest();
	    SubLObject current = datum;
	    destructuring_bind_must_consp(current, datum, $list_alt1);
	    {
		SubLObject temp = current.rest();
		current = current.first();
		{
		    SubLObject problem_store_var = NIL;
		    destructuring_bind_must_consp(current, datum, $list_alt1);
		    problem_store_var = current.first();
		    current = current.rest();
		    {
			SubLObject allow_other_keys_p = NIL;
			SubLObject rest = current;
			SubLObject bad = NIL;
			SubLObject current_1 = NIL;
			for (; NIL != rest;) {
			    destructuring_bind_must_consp(rest, datum, $list_alt1);
			    current_1 = rest.first();
			    rest = rest.rest();
			    destructuring_bind_must_consp(rest, datum, $list_alt1);
			    if (NIL == member(current_1, $list_alt2, UNPROVIDED, UNPROVIDED)) {
				bad = T;
			    }
			    if (current_1 == $ALLOW_OTHER_KEYS) {
				allow_other_keys_p = rest.first();
			    }
			    rest = rest.rest();
			}
			if ((NIL != bad) && (NIL == allow_other_keys_p)) {
			    cdestructuring_bind_error(datum, $list_alt1);
			}
			{
			    SubLObject done_tail = property_list_member($DONE, current);
			    SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
			    current = temp;
			    {
				SubLObject body = current;
				SubLObject id = $sym5$ID;
				return listS(DO_ID_INDEX, list(id, problem_store_var, $list_alt7, $DONE, done), list(IGNORE, id), append(body, NIL));
			    }
			}
		    }
		}
	    }
	}
    }

    public static SubLObject do_all_problem_stores(final SubLObject macroform, final SubLObject environment) {
	SubLObject current;
	final SubLObject datum = current = macroform.rest();
	destructuring_bind_must_consp(current, datum, $list1);
	final SubLObject temp = current.rest();
	current = current.first();
	SubLObject problem_store_var = NIL;
	destructuring_bind_must_consp(current, datum, $list1);
	problem_store_var = current.first();
	current = current.rest();
	SubLObject allow_other_keys_p = NIL;
	SubLObject rest = current;
	SubLObject bad = NIL;
	SubLObject current_$1 = NIL;
	while (NIL != rest) {
	    destructuring_bind_must_consp(rest, datum, $list1);
	    current_$1 = rest.first();
	    rest = rest.rest();
	    destructuring_bind_must_consp(rest, datum, $list1);
	    if (NIL == member(current_$1, $list2, UNPROVIDED, UNPROVIDED)) {
		bad = T;
	    }
	    if (current_$1 == $ALLOW_OTHER_KEYS) {
		allow_other_keys_p = rest.first();
	    }
	    rest = rest.rest();
	}
	if ((NIL != bad) && (NIL == allow_other_keys_p)) {
	    cdestructuring_bind_error(datum, $list1);
	}
	final SubLObject done_tail = property_list_member($DONE, current);
	final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
	final SubLObject body;
	current = body = temp;
	final SubLObject id = $sym5$ID;
	return listS(DO_ID_INDEX, list(id, problem_store_var, $list7, $DONE, done), list(IGNORE, id), append(body, NIL));
    }

    public static final SubLObject problem_store_id_index_alt() {
	return $problem_store_id_index$.getGlobalValue();
    }

    public static SubLObject problem_store_id_index() {
	return $problem_store_id_index$.getGlobalValue();
    }

    /**
     * Return a list of all problem stores.
     */
    @LispMethod(comment = "Return a list of all problem stores.")
    public static final SubLObject all_problem_stores_alt() {
	return id_index_values($problem_store_id_index$.getGlobalValue());
    }

    /**
     * Return a list of all problem stores.
     */
    @LispMethod(comment = "Return a list of all problem stores.")
    public static SubLObject all_problem_stores() {
	return id_index_values($problem_store_id_index$.getGlobalValue());
    }

    /**
     * Destroy all current problem stores; @return integer, the number of stores successfully destroyed.
     */
    @LispMethod(comment = "Destroy all current problem stores; @return integer, the number of stores successfully destroyed.")
    public static final SubLObject destroy_all_problem_stores_alt() {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject cdolist_list_var = all_problem_stores();
	    SubLObject store = NIL;
	    for (store = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), store = cdolist_list_var.first()) {
		{
		    SubLObject ignore_errors_tag = NIL;
		    try {
			{
			    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
			    try {
				bind(Errors.$error_handler$, symbol_function(IGNORE_ERRORS_HANDLER));
				try {
				    destroy_problem_store(store);
				    count = add(count, ONE_INTEGER);
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
		}
	    }
	    return count;
	}
    }

    /**
     * Destroy all current problem stores; @return integer, the number of stores successfully destroyed.
     */
    @LispMethod(comment = "Destroy all current problem stores; @return integer, the number of stores successfully destroyed.")
    public static SubLObject destroy_all_problem_stores() {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject count = ZERO_INTEGER;
	if (NIL != inference_datastructures_problem_store.all_problem_stores()) {
	    final SubLObject list_var = inference_datastructures_problem_store.all_problem_stores();
	    final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
	    final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
	    final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
	    final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
	    final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
	    final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
	    final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
	    final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
	    try {
		$progress_note$.bind(NIL != cconcatenate($$$Destroying_all_, new SubLObject[] { format_nil.format_nil_a_no_copy(length(inference_datastructures_problem_store.all_problem_stores())), $$$_problem_stores })
			? cconcatenate($$$Destroying_all_, new SubLObject[] { format_nil.format_nil_a_no_copy(length(inference_datastructures_problem_store.all_problem_stores())), $$$_problem_stores })
			: $$$cdolist, thread);
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
		    SubLObject store = NIL;
		    store = csome_list_var.first();
		    while (NIL != csome_list_var) {
			SubLObject ignore_errors_tag = NIL;
			try {
			    thread.throwStack.push($IGNORE_ERRORS_TARGET);
			    final SubLObject _prev_bind_0_$2 = Errors.$error_handler$.currentBinding(thread);
			    try {
				Errors.$error_handler$.bind(symbol_function(inference_datastructures_problem_store.IGNORE_ERRORS_HANDLER), thread);
				try {
				    inference_datastructures_problem_store.destroy_problem_store(store);
				    count = add(count, ONE_INTEGER);
				} catch (final Throwable catch_var) {
				    Errors.handleThrowable(catch_var, NIL);
				}
			    } finally {
				Errors.$error_handler$.rebind(_prev_bind_0_$2, thread);
			    }
			} catch (final Throwable ccatch_env_var) {
			    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
			} finally {
			    thread.throwStack.pop();
			}
			$progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
			note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
			csome_list_var = csome_list_var.rest();
			store = csome_list_var.first();
		    }
		} finally {
		    final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
		    try {
			$is_thread_performing_cleanupP$.bind(T, thread);
			final SubLObject _values = getValuesAsVector();
			noting_percent_progress_postamble();
			restoreValuesFromVector(_values);
		    } finally {
			$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
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
	}
	return count;
    }

    public static SubLObject destroy_most_problem_stores(SubLObject number_remaining) {
	if (number_remaining == UNPROVIDED) {
	    number_remaining = FIVE_INTEGER;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	assert NIL != subl_promotions.non_negative_integer_p(number_remaining) : "! subl_promotions.non_negative_integer_p(number_remaining) " + ("subl_promotions.non_negative_integer_p(number_remaining) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(number_remaining) ")
		+ number_remaining;
	SubLObject remaining_count = ZERO_INTEGER;
	SubLObject destroyed_count = ZERO_INTEGER;
	SubLObject stores = Sort.sort(copy_list(inference_datastructures_problem_store.all_problem_stores()), $sym17$_, inference_datastructures_problem_store.PROBLEM_STORE_CREATION_TIME);
	SubLObject n;
	for (n = NIL, n = ZERO_INTEGER; n.numL(number_remaining); n = add(n, ONE_INTEGER)) {
	    if (NIL != list_utilities.non_empty_list_p(stores)) {
		stores = stores.rest();
		remaining_count = add(remaining_count, ONE_INTEGER);
	    }
	}
	if (NIL != stores) {
	    final SubLObject list_var = stores;
	    final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
	    final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
	    final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
	    final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
	    final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
	    final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
	    final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
	    final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
	    try {
		$progress_note$.bind(NIL != cconcatenate($$$Destroying_, new SubLObject[] { format_nil.format_nil_a_no_copy(length(stores)), $str20$_problem_stores__all_but_the_last, format_nil.format_nil_a_no_copy(number_remaining), $str21$_ })
			? cconcatenate($$$Destroying_, new SubLObject[] { format_nil.format_nil_a_no_copy(length(stores)), $str20$_problem_stores__all_but_the_last, format_nil.format_nil_a_no_copy(number_remaining), $str21$_ })
			: $$$cdolist, thread);
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
		    SubLObject store = NIL;
		    store = csome_list_var.first();
		    while (NIL != csome_list_var) {
			SubLObject ignore_errors_tag = NIL;
			try {
			    thread.throwStack.push($IGNORE_ERRORS_TARGET);
			    final SubLObject _prev_bind_0_$4 = Errors.$error_handler$.currentBinding(thread);
			    try {
				Errors.$error_handler$.bind(symbol_function(inference_datastructures_problem_store.IGNORE_ERRORS_HANDLER), thread);
				try {
				    inference_datastructures_problem_store.destroy_problem_store(store);
				    destroyed_count = add(destroyed_count, ONE_INTEGER);
				} catch (final Throwable catch_var) {
				    Errors.handleThrowable(catch_var, NIL);
				}
			    } finally {
				Errors.$error_handler$.rebind(_prev_bind_0_$4, thread);
			    }
			} catch (final Throwable ccatch_env_var) {
			    ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, $IGNORE_ERRORS_TARGET);
			} finally {
			    thread.throwStack.pop();
			}
			$progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
			note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
			csome_list_var = csome_list_var.rest();
			store = csome_list_var.first();
		    }
		} finally {
		    final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
		    try {
			$is_thread_performing_cleanupP$.bind(T, thread);
			final SubLObject _values = getValuesAsVector();
			noting_percent_progress_postamble();
			restoreValuesFromVector(_values);
		    } finally {
			$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
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
	}
	return values(destroyed_count, remaining_count);
    }

    public static final SubLObject problem_store_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
	print_problem_store(v_object, stream, ZERO_INTEGER);
	return NIL;
    }

    public static SubLObject problem_store_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
	inference_datastructures_problem_store.print_problem_store(v_object, stream, ZERO_INTEGER);
	return NIL;
    }

    public static final SubLObject problem_store_p_alt(SubLObject v_object) {
	return v_object.getClass() == $problem_store_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject problem_store_p(final SubLObject v_object) {
	return v_object.getClass() == $problem_store_native.class ? T : NIL;
    }

    public static final SubLObject prob_store_guid_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) v_object).$guid;
    }

    public static SubLObject prob_store_guid(final SubLObject v_object) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return v_object.getField2();
    }

    public static final SubLObject prob_store_suid_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) v_object).$suid;
    }

    public static SubLObject prob_store_suid(final SubLObject v_object) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return v_object.getField3();
    }

    public static final SubLObject prob_store_lock_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) v_object).$lock;
    }

    public static SubLObject prob_store_lock(final SubLObject v_object) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return v_object.getField4();
    }

    public static final SubLObject prob_store_creation_time_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) v_object).$creation_time;
    }

    public static SubLObject prob_store_creation_time(final SubLObject v_object) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return v_object.getField5();
    }

    public static final SubLObject prob_store_inference_id_index_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) v_object).$inference_id_index;
    }

    public static SubLObject prob_store_inference_id_index(final SubLObject v_object) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return v_object.getField6();
    }

    public static final SubLObject prob_store_strategy_id_index_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) v_object).$strategy_id_index;
    }

    public static SubLObject prob_store_strategy_id_index(final SubLObject v_object) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return v_object.getField7();
    }

    public static final SubLObject prob_store_problem_id_index_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) v_object).$problem_id_index;
    }

    public static SubLObject prob_store_problem_id_index(final SubLObject v_object) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return v_object.getField8();
    }

    public static final SubLObject prob_store_link_id_index_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) v_object).$link_id_index;
    }

    public static SubLObject prob_store_link_id_index(final SubLObject v_object) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return v_object.getField9();
    }

    public static final SubLObject prob_store_proof_id_index_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) v_object).$proof_id_index;
    }

    public static SubLObject prob_store_proof_id_index(final SubLObject v_object) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return v_object.getField10();
    }

    public static SubLObject prob_store_problems_by_query_index(final SubLObject v_object) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return v_object.getField11();
    }

    public static final SubLObject prob_store_rejected_proofs_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) v_object).$rejected_proofs;
    }

    public static SubLObject prob_store_rejected_proofs(final SubLObject v_object) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return v_object.getField12();
    }

    public static final SubLObject prob_store_processed_proofs_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) v_object).$processed_proofs;
    }

    public static SubLObject prob_store_processed_proofs(final SubLObject v_object) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return v_object.getField13();
    }

    public static SubLObject prob_store_potentially_processed_problems(final SubLObject v_object) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return v_object.getField14();
    }

    public static final SubLObject prob_store_non_explanatory_subproofs_possibleP_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) v_object).$non_explanatory_subproofs_possibleP;
    }

    public static SubLObject prob_store_non_explanatory_subproofs_possibleP(final SubLObject v_object) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return v_object.getField15();
    }

    public static final SubLObject prob_store_non_explanatory_subproofs_index_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) v_object).$non_explanatory_subproofs_index;
    }

    public static SubLObject prob_store_non_explanatory_subproofs_index(final SubLObject v_object) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return v_object.getField16();
    }

    public static final SubLObject prob_store_most_recent_tactic_executed_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) v_object).$most_recent_tactic_executed;
    }

    public static SubLObject prob_store_most_recent_tactic_executed(final SubLObject v_object) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return v_object.getField17();
    }

    public static final SubLObject prob_store_min_proof_depth_index_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) v_object).$min_proof_depth_index;
    }

    public static SubLObject prob_store_min_proof_depth_index(final SubLObject v_object) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return v_object.getField18();
    }

    public static final SubLObject prob_store_min_transformation_depth_index_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) v_object).$min_transformation_depth_index;
    }

    public static SubLObject prob_store_min_transformation_depth_index(final SubLObject v_object) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return v_object.getField19();
    }

    public static final SubLObject prob_store_min_transformation_depth_signature_index_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) v_object).$min_transformation_depth_signature_index;
    }

    public static SubLObject prob_store_min_transformation_depth_signature_index(final SubLObject v_object) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return v_object.getField20();
    }

    public static final SubLObject prob_store_min_depth_index_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) v_object).$min_depth_index;
    }

    public static SubLObject prob_store_min_depth_index(final SubLObject v_object) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return (($problem_store_native) (v_object)).$min_depth_index;
    }

    public static final SubLObject prob_store_equality_reasoning_method_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) (v_object)).$equality_reasoning_method;
    }

    public static SubLObject prob_store_equality_reasoning_method(final SubLObject v_object) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return (($problem_store_native) (v_object)).$equality_reasoning_method;
    }

    public static final SubLObject prob_store_equality_reasoning_domain_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) (v_object)).$equality_reasoning_domain;
    }

    public static SubLObject prob_store_equality_reasoning_domain(final SubLObject v_object) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return (($problem_store_native) (v_object)).$equality_reasoning_domain;
    }

    public static final SubLObject prob_store_intermediate_step_validation_level_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) (v_object)).$intermediate_step_validation_level;
    }

    public static SubLObject prob_store_intermediate_step_validation_level(final SubLObject v_object) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return (($problem_store_native) (v_object)).$intermediate_step_validation_level;
    }

    public static final SubLObject prob_store_max_problem_count_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) (v_object)).$max_problem_count;
    }

    public static SubLObject prob_store_max_problem_count(final SubLObject v_object) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return (($problem_store_native) (v_object)).$max_problem_count;
    }

    public static final SubLObject prob_store_crazy_max_problem_count_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) (v_object)).$crazy_max_problem_count;
    }

    public static SubLObject prob_store_crazy_max_problem_count(final SubLObject v_object) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return (($problem_store_native) (v_object)).$crazy_max_problem_count;
    }

    public static final SubLObject prob_store_removal_allowedP_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) (v_object)).$removal_allowedP;
    }

    public static SubLObject prob_store_removal_allowedP(final SubLObject v_object) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return (($problem_store_native) (v_object)).$removal_allowedP;
    }

    public static final SubLObject prob_store_transformation_allowedP_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) (v_object)).$transformation_allowedP;
    }

    public static SubLObject prob_store_transformation_allowedP(final SubLObject v_object) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return (($problem_store_native) (v_object)).$transformation_allowedP;
    }

    public static final SubLObject prob_store_add_restriction_layer_of_indirectionP_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) (v_object)).$add_restriction_layer_of_indirectionP;
    }

    public static SubLObject prob_store_add_restriction_layer_of_indirectionP(final SubLObject v_object) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return (($problem_store_native) (v_object)).$add_restriction_layer_of_indirectionP;
    }

    public static final SubLObject prob_store_negation_by_failureP_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) (v_object)).$negation_by_failureP;
    }

    public static SubLObject prob_store_negation_by_failureP(final SubLObject v_object) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return (($problem_store_native) (v_object)).$negation_by_failureP;
    }

    public static final SubLObject prob_store_completeness_minimization_allowedP_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) (v_object)).$completeness_minimization_allowedP;
    }

    public static SubLObject prob_store_completeness_minimization_allowedP(final SubLObject v_object) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return (($problem_store_native) (v_object)).$completeness_minimization_allowedP;
    }

    public static final SubLObject prob_store_direction_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) (v_object)).$direction;
    }

    public static SubLObject prob_store_direction(final SubLObject v_object) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return (($problem_store_native) (v_object)).$direction;
    }

    public static final SubLObject prob_store_evaluate_subl_allowedP_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) (v_object)).$evaluate_subl_allowedP;
    }

    public static SubLObject prob_store_evaluate_subl_allowedP(final SubLObject v_object) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return (($problem_store_native) (v_object)).$evaluate_subl_allowedP;
    }

    public static final SubLObject prob_store_rewrite_allowedP_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) (v_object)).$rewrite_allowedP;
    }

    public static SubLObject prob_store_rewrite_allowedP(final SubLObject v_object) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return (($problem_store_native) (v_object)).$rewrite_allowedP;
    }

    public static final SubLObject prob_store_abduction_allowedP_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) (v_object)).$abduction_allowedP;
    }

    public static SubLObject prob_store_abduction_allowedP(final SubLObject v_object) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return (($problem_store_native) (v_object)).$abduction_allowedP;
    }

    public static final SubLObject prob_store_new_terms_allowedP_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) (v_object)).$new_terms_allowedP;
    }

    public static SubLObject prob_store_new_terms_allowedP(final SubLObject v_object) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return (($problem_store_native) (v_object)).$new_terms_allowedP;
    }

    public static final SubLObject prob_store_compute_answer_justificationsP_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) (v_object)).$compute_answer_justificationsP;
    }

    public static SubLObject prob_store_compute_answer_justificationsP(final SubLObject v_object) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return (($problem_store_native) (v_object)).$compute_answer_justificationsP;
    }

    public static final SubLObject prob_store_memoization_state_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) (v_object)).$memoization_state;
    }

    public static SubLObject prob_store_memoization_state(final SubLObject v_object) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return (($problem_store_native) (v_object)).$memoization_state;
    }

    public static final SubLObject prob_store_sbhl_resource_space_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) (v_object)).$sbhl_resource_space;
    }

    public static SubLObject prob_store_sbhl_resource_space(final SubLObject v_object) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return (($problem_store_native) (v_object)).$sbhl_resource_space;
    }

    public static final SubLObject prob_store_preparedP_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) (v_object)).$preparedP;
    }

    public static SubLObject prob_store_preparedP(final SubLObject v_object) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return (($problem_store_native) (v_object)).$preparedP;
    }

    public static final SubLObject prob_store_destruction_imminentP_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) (v_object)).$destruction_imminentP;
    }

    public static SubLObject prob_store_destruction_imminentP(final SubLObject v_object) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return (($problem_store_native) (v_object)).$destruction_imminentP;
    }

    public static final SubLObject prob_store_meta_problem_store_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) (v_object)).$meta_problem_store;
    }

    public static SubLObject prob_store_meta_problem_store(final SubLObject v_object) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return (($problem_store_native) (v_object)).$meta_problem_store;
    }

    public static final SubLObject prob_store_static_properties_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) (v_object)).$static_properties;
    }

    public static SubLObject prob_store_static_properties(final SubLObject v_object) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return (($problem_store_native) (v_object)).$static_properties;
    }

    public static final SubLObject prob_store_janitor_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) (v_object)).$janitor;
    }

    public static SubLObject prob_store_janitor(final SubLObject v_object) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return (($problem_store_native) (v_object)).$janitor;
    }

    public static final SubLObject prob_store_historical_root_problems_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) (v_object)).$historical_root_problems;
    }

    public static SubLObject prob_store_historical_root_problems(final SubLObject v_object) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return (($problem_store_native) (v_object)).$historical_root_problems;
    }

    public static final SubLObject prob_store_historical_tactic_count_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) (v_object)).$historical_tactic_count;
    }

    public static SubLObject prob_store_historical_tactic_count(final SubLObject v_object) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return (($problem_store_native) (v_object)).$historical_tactic_count;
    }

    public static final SubLObject prob_store_complex_problem_query_czer_index_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) (v_object)).$complex_problem_query_czer_index;
    }

    public static SubLObject prob_store_complex_problem_query_czer_index(final SubLObject v_object) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return (($problem_store_native) (v_object)).$complex_problem_query_czer_index;
    }

    public static final SubLObject prob_store_complex_problem_query_signatures_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) (v_object)).$complex_problem_query_signatures;
    }

    public static SubLObject prob_store_complex_problem_query_signatures(final SubLObject v_object) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return (($problem_store_native) (v_object)).$complex_problem_query_signatures;
    }

    public static final SubLObject prob_store_proof_keeping_index_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) (v_object)).$proof_keeping_index;
    }

    public static SubLObject prob_store_proof_keeping_index(final SubLObject v_object) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return (($problem_store_native) (v_object)).$proof_keeping_index;
    }

    public static final SubLObject _csetf_prob_store_guid_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) v_object).$guid = (value);
    }

    public static SubLObject _csetf_prob_store_guid(final SubLObject v_object, final SubLObject value) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return v_object.setField2(value);
    }

    public static final SubLObject _csetf_prob_store_suid_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) v_object).$suid = (value);
    }

    public static SubLObject _csetf_prob_store_suid(final SubLObject v_object, final SubLObject value) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return v_object.setField3(value);
    }

    public static final SubLObject _csetf_prob_store_lock_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) v_object).$lock = (value);
    }

    public static SubLObject _csetf_prob_store_lock(final SubLObject v_object, final SubLObject value) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return v_object.setField4(value);
    }

    public static final SubLObject _csetf_prob_store_creation_time_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) v_object).$creation_time = (value);
    }

    public static SubLObject _csetf_prob_store_creation_time(final SubLObject v_object, final SubLObject value) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return v_object.setField5(value);
    }

    public static final SubLObject _csetf_prob_store_inference_id_index_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) v_object).$inference_id_index = (value);
    }

    public static SubLObject _csetf_prob_store_inference_id_index(final SubLObject v_object, final SubLObject value) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return v_object.setField6(value);
    }

    public static final SubLObject _csetf_prob_store_strategy_id_index_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) v_object).$strategy_id_index = (value);
    }

    public static SubLObject _csetf_prob_store_strategy_id_index(final SubLObject v_object, final SubLObject value) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return v_object.setField7(value);
    }

    public static final SubLObject _csetf_prob_store_problem_id_index_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) v_object).$problem_id_index = (value);
    }

    public static SubLObject _csetf_prob_store_problem_id_index(final SubLObject v_object, final SubLObject value) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return v_object.setField8(value);
    }

    public static final SubLObject _csetf_prob_store_link_id_index_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) v_object).$link_id_index = (value);
    }

    public static SubLObject _csetf_prob_store_link_id_index(final SubLObject v_object, final SubLObject value) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return v_object.setField9(value);
    }

    public static final SubLObject _csetf_prob_store_proof_id_index_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) v_object).$proof_id_index = (value);
    }

    public static SubLObject _csetf_prob_store_proof_id_index(final SubLObject v_object, final SubLObject value) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return v_object.setField10(value);
    }

    public static SubLObject _csetf_prob_store_problems_by_query_index(final SubLObject v_object, final SubLObject value) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return v_object.setField11(value);
    }

    public static final SubLObject _csetf_prob_store_rejected_proofs_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) v_object).$rejected_proofs = (value);
    }

    public static SubLObject _csetf_prob_store_rejected_proofs(final SubLObject v_object, final SubLObject value) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return v_object.setField12(value);
    }

    public static final SubLObject _csetf_prob_store_processed_proofs_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) v_object).$processed_proofs = (value);
    }

    public static SubLObject _csetf_prob_store_processed_proofs(final SubLObject v_object, final SubLObject value) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return v_object.setField13(value);
    }

    public static SubLObject _csetf_prob_store_potentially_processed_problems(final SubLObject v_object, final SubLObject value) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return v_object.setField14(value);
    }

    public static final SubLObject _csetf_prob_store_non_explanatory_subproofs_possibleP_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) v_object).$non_explanatory_subproofs_possibleP = (value);
    }

    public static SubLObject _csetf_prob_store_non_explanatory_subproofs_possibleP(final SubLObject v_object, final SubLObject value) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return v_object.setField15(value);
    }

    public static final SubLObject _csetf_prob_store_non_explanatory_subproofs_index_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) v_object).$non_explanatory_subproofs_index = (value);
    }

    public static SubLObject _csetf_prob_store_non_explanatory_subproofs_index(final SubLObject v_object, final SubLObject value) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return v_object.setField16(value);
    }

    public static final SubLObject _csetf_prob_store_most_recent_tactic_executed_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) v_object).$most_recent_tactic_executed = (value);
    }

    public static SubLObject _csetf_prob_store_most_recent_tactic_executed(final SubLObject v_object, final SubLObject value) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return v_object.setField17(value);
    }

    public static final SubLObject _csetf_prob_store_min_proof_depth_index_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) v_object).$min_proof_depth_index = (value);
    }

    public static SubLObject _csetf_prob_store_min_proof_depth_index(final SubLObject v_object, final SubLObject value) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return v_object.setField18(value);
    }

    public static final SubLObject _csetf_prob_store_min_transformation_depth_index_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) v_object).$min_transformation_depth_index = (value);
    }

    public static SubLObject _csetf_prob_store_min_transformation_depth_index(final SubLObject v_object, final SubLObject value) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return v_object.setField19(value);
    }

    public static final SubLObject _csetf_prob_store_min_transformation_depth_signature_index_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) v_object).$min_transformation_depth_signature_index = (value);
    }

    public static SubLObject _csetf_prob_store_min_transformation_depth_signature_index(final SubLObject v_object, final SubLObject value) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return v_object.setField20(value);
    }

    public static final SubLObject _csetf_prob_store_min_depth_index_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) v_object).$min_depth_index = (value);
    }

    public static SubLObject _csetf_prob_store_min_depth_index(final SubLObject v_object, final SubLObject value) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return (($problem_store_native) (v_object)).$min_depth_index = value;
    }

    public static final SubLObject _csetf_prob_store_equality_reasoning_method_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) (v_object)).$equality_reasoning_method = value;
    }

    public static SubLObject _csetf_prob_store_equality_reasoning_method(final SubLObject v_object, final SubLObject value) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return (($problem_store_native) (v_object)).$equality_reasoning_method = value;
    }

    public static final SubLObject _csetf_prob_store_equality_reasoning_domain_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) (v_object)).$equality_reasoning_domain = value;
    }

    public static SubLObject _csetf_prob_store_equality_reasoning_domain(final SubLObject v_object, final SubLObject value) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return (($problem_store_native) (v_object)).$equality_reasoning_domain = value;
    }

    public static final SubLObject _csetf_prob_store_intermediate_step_validation_level_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) (v_object)).$intermediate_step_validation_level = value;
    }

    public static SubLObject _csetf_prob_store_intermediate_step_validation_level(final SubLObject v_object, final SubLObject value) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return (($problem_store_native) (v_object)).$intermediate_step_validation_level = value;
    }

    public static final SubLObject _csetf_prob_store_max_problem_count_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) (v_object)).$max_problem_count = value;
    }

    public static SubLObject _csetf_prob_store_max_problem_count(final SubLObject v_object, final SubLObject value) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return (($problem_store_native) (v_object)).$max_problem_count = value;
    }

    public static final SubLObject _csetf_prob_store_crazy_max_problem_count_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) (v_object)).$crazy_max_problem_count = value;
    }

    public static SubLObject _csetf_prob_store_crazy_max_problem_count(final SubLObject v_object, final SubLObject value) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return (($problem_store_native) (v_object)).$crazy_max_problem_count = value;
    }

    public static final SubLObject _csetf_prob_store_removal_allowedP_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) (v_object)).$removal_allowedP = value;
    }

    public static SubLObject _csetf_prob_store_removal_allowedP(final SubLObject v_object, final SubLObject value) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return (($problem_store_native) (v_object)).$removal_allowedP = value;
    }

    public static final SubLObject _csetf_prob_store_transformation_allowedP_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) (v_object)).$transformation_allowedP = value;
    }

    public static SubLObject _csetf_prob_store_transformation_allowedP(final SubLObject v_object, final SubLObject value) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return (($problem_store_native) (v_object)).$transformation_allowedP = value;
    }

    public static final SubLObject _csetf_prob_store_add_restriction_layer_of_indirectionP_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) (v_object)).$add_restriction_layer_of_indirectionP = value;
    }

    public static SubLObject _csetf_prob_store_add_restriction_layer_of_indirectionP(final SubLObject v_object, final SubLObject value) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return (($problem_store_native) (v_object)).$add_restriction_layer_of_indirectionP = value;
    }

    public static final SubLObject _csetf_prob_store_negation_by_failureP_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) (v_object)).$negation_by_failureP = value;
    }

    public static SubLObject _csetf_prob_store_negation_by_failureP(final SubLObject v_object, final SubLObject value) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return (($problem_store_native) (v_object)).$negation_by_failureP = value;
    }

    public static final SubLObject _csetf_prob_store_completeness_minimization_allowedP_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) (v_object)).$completeness_minimization_allowedP = value;
    }

    public static SubLObject _csetf_prob_store_completeness_minimization_allowedP(final SubLObject v_object, final SubLObject value) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return (($problem_store_native) (v_object)).$completeness_minimization_allowedP = value;
    }

    public static final SubLObject _csetf_prob_store_direction_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) (v_object)).$direction = value;
    }

    public static SubLObject _csetf_prob_store_direction(final SubLObject v_object, final SubLObject value) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return (($problem_store_native) (v_object)).$direction = value;
    }

    public static final SubLObject _csetf_prob_store_evaluate_subl_allowedP_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) (v_object)).$evaluate_subl_allowedP = value;
    }

    public static SubLObject _csetf_prob_store_evaluate_subl_allowedP(final SubLObject v_object, final SubLObject value) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return (($problem_store_native) (v_object)).$evaluate_subl_allowedP = value;
    }

    public static final SubLObject _csetf_prob_store_rewrite_allowedP_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) (v_object)).$rewrite_allowedP = value;
    }

    public static SubLObject _csetf_prob_store_rewrite_allowedP(final SubLObject v_object, final SubLObject value) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return (($problem_store_native) (v_object)).$rewrite_allowedP = value;
    }

    public static final SubLObject _csetf_prob_store_abduction_allowedP_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) (v_object)).$abduction_allowedP = value;
    }

    public static SubLObject _csetf_prob_store_abduction_allowedP(final SubLObject v_object, final SubLObject value) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return (($problem_store_native) (v_object)).$abduction_allowedP = value;
    }

    public static final SubLObject _csetf_prob_store_new_terms_allowedP_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) (v_object)).$new_terms_allowedP = value;
    }

    public static SubLObject _csetf_prob_store_new_terms_allowedP(final SubLObject v_object, final SubLObject value) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return (($problem_store_native) (v_object)).$new_terms_allowedP = value;
    }

    public static final SubLObject _csetf_prob_store_compute_answer_justificationsP_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) (v_object)).$compute_answer_justificationsP = value;
    }

    public static SubLObject _csetf_prob_store_compute_answer_justificationsP(final SubLObject v_object, final SubLObject value) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return (($problem_store_native) (v_object)).$compute_answer_justificationsP = value;
    }

    public static final SubLObject _csetf_prob_store_memoization_state_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) (v_object)).$memoization_state = value;
    }

    public static SubLObject _csetf_prob_store_memoization_state(final SubLObject v_object, final SubLObject value) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return (($problem_store_native) (v_object)).$memoization_state = value;
    }

    public static final SubLObject _csetf_prob_store_sbhl_resource_space_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) (v_object)).$sbhl_resource_space = value;
    }

    public static SubLObject _csetf_prob_store_sbhl_resource_space(final SubLObject v_object, final SubLObject value) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return (($problem_store_native) (v_object)).$sbhl_resource_space = value;
    }

    public static final SubLObject _csetf_prob_store_preparedP_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) (v_object)).$preparedP = value;
    }

    public static SubLObject _csetf_prob_store_preparedP(final SubLObject v_object, final SubLObject value) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return (($problem_store_native) (v_object)).$preparedP = value;
    }

    public static final SubLObject _csetf_prob_store_destruction_imminentP_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) (v_object)).$destruction_imminentP = value;
    }

    public static SubLObject _csetf_prob_store_destruction_imminentP(final SubLObject v_object, final SubLObject value) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return (($problem_store_native) (v_object)).$destruction_imminentP = value;
    }

    public static final SubLObject _csetf_prob_store_meta_problem_store_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) (v_object)).$meta_problem_store = value;
    }

    public static SubLObject _csetf_prob_store_meta_problem_store(final SubLObject v_object, final SubLObject value) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return (($problem_store_native) (v_object)).$meta_problem_store = value;
    }

    public static final SubLObject _csetf_prob_store_static_properties_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) (v_object)).$static_properties = value;
    }

    public static SubLObject _csetf_prob_store_static_properties(final SubLObject v_object, final SubLObject value) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return (($problem_store_native) (v_object)).$static_properties = value;
    }

    public static final SubLObject _csetf_prob_store_janitor_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) (v_object)).$janitor = value;
    }

    public static SubLObject _csetf_prob_store_janitor(final SubLObject v_object, final SubLObject value) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return (($problem_store_native) (v_object)).$janitor = value;
    }

    public static final SubLObject _csetf_prob_store_historical_root_problems_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) (v_object)).$historical_root_problems = value;
    }

    public static SubLObject _csetf_prob_store_historical_root_problems(final SubLObject v_object, final SubLObject value) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return (($problem_store_native) (v_object)).$historical_root_problems = value;
    }

    public static final SubLObject _csetf_prob_store_historical_tactic_count_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) (v_object)).$historical_tactic_count = value;
    }

    public static SubLObject _csetf_prob_store_historical_tactic_count(final SubLObject v_object, final SubLObject value) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return (($problem_store_native) (v_object)).$historical_tactic_count = value;
    }

    public static final SubLObject _csetf_prob_store_complex_problem_query_czer_index_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) (v_object)).$complex_problem_query_czer_index = value;
    }

    public static SubLObject _csetf_prob_store_complex_problem_query_czer_index(final SubLObject v_object, final SubLObject value) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return (($problem_store_native) (v_object)).$complex_problem_query_czer_index = value;
    }

    public static final SubLObject _csetf_prob_store_complex_problem_query_signatures_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) (v_object)).$complex_problem_query_signatures = value;
    }

    public static SubLObject _csetf_prob_store_complex_problem_query_signatures(final SubLObject v_object, final SubLObject value) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return (($problem_store_native) (v_object)).$complex_problem_query_signatures = value;
    }

    public static final SubLObject _csetf_prob_store_proof_keeping_index_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return (($problem_store_native) (v_object)).$proof_keeping_index = value;
    }

    public static SubLObject _csetf_prob_store_proof_keeping_index(final SubLObject v_object, final SubLObject value) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(v_object) : "! inference_datastructures_problem_store.problem_store_p(v_object) " + "inference_datastructures_problem_store.problem_store_p error :" + v_object;
	return (($problem_store_native) (v_object)).$proof_keeping_index = value;
    }

    public static final SubLObject make_problem_store_alt(SubLObject arglist) {
	if (arglist == UNPROVIDED) {
	    arglist = NIL;
	}
	{
	    SubLObject v_new = new $problem_store_native();
	    SubLObject next = NIL;
	    for (next = arglist; NIL != next; next = cddr(next)) {
		{
		    SubLObject current_arg = next.first();
		    SubLObject current_value = cadr(next);
		    SubLObject pcase_var = current_arg;
		    if (pcase_var.eql($GUID)) {
			_csetf_prob_store_guid(v_new, current_value);
		    } else {
			if (pcase_var.eql($SUID)) {
			    _csetf_prob_store_suid(v_new, current_value);
			} else {
			    if (pcase_var.eql($LOCK)) {
				_csetf_prob_store_lock(v_new, current_value);
			    } else {
				if (pcase_var.eql($CREATION_TIME)) {
				    _csetf_prob_store_creation_time(v_new, current_value);
				} else {
				    if (pcase_var.eql($INFERENCE_ID_INDEX)) {
					_csetf_prob_store_inference_id_index(v_new, current_value);
				    } else {
					if (pcase_var.eql($STRATEGY_ID_INDEX)) {
					    _csetf_prob_store_strategy_id_index(v_new, current_value);
					} else {
					    if (pcase_var.eql($PROBLEM_ID_INDEX)) {
						_csetf_prob_store_problem_id_index(v_new, current_value);
					    } else {
						if (pcase_var.eql($LINK_ID_INDEX)) {
						    _csetf_prob_store_link_id_index(v_new, current_value);
						} else {
						    if (pcase_var.eql($PROOF_ID_INDEX)) {
							_csetf_prob_store_proof_id_index(v_new, current_value);
						    } else {
							if (pcase_var.eql($PROBLEM_BY_QUERY_INDEX)) {
							    _csetf_prob_store_problem_by_query_index(v_new, current_value);
							} else {
							    if (pcase_var.eql($REJECTED_PROOFS)) {
								_csetf_prob_store_rejected_proofs(v_new, current_value);
							    } else {
								if (pcase_var.eql($PROCESSED_PROOFS)) {
								    _csetf_prob_store_processed_proofs(v_new, current_value);
								} else {
								    if (pcase_var.eql($kw155$NON_EXPLANATORY_SUBPROOFS_POSSIBLE_)) {
									_csetf_prob_store_non_explanatory_subproofs_possibleP(v_new, current_value);
								    } else {
									if (pcase_var.eql($NON_EXPLANATORY_SUBPROOFS_INDEX)) {
									    _csetf_prob_store_non_explanatory_subproofs_index(v_new, current_value);
									} else {
									    if (pcase_var.eql($MOST_RECENT_TACTIC_EXECUTED)) {
										_csetf_prob_store_most_recent_tactic_executed(v_new, current_value);
									    } else {
										if (pcase_var.eql($MIN_PROOF_DEPTH_INDEX)) {
										    _csetf_prob_store_min_proof_depth_index(v_new, current_value);
										} else {
										    if (pcase_var.eql($MIN_TRANSFORMATION_DEPTH_INDEX)) {
											_csetf_prob_store_min_transformation_depth_index(v_new, current_value);
										    } else {
											if (pcase_var.eql($MIN_TRANSFORMATION_DEPTH_SIGNATURE_INDEX)) {
											    _csetf_prob_store_min_transformation_depth_signature_index(v_new, current_value);
											} else {
											    if (pcase_var.eql($MIN_DEPTH_INDEX)) {
												_csetf_prob_store_min_depth_index(v_new, current_value);
											    } else {
												if (pcase_var.eql($EQUALITY_REASONING_METHOD)) {
												    _csetf_prob_store_equality_reasoning_method(v_new, current_value);
												} else {
												    if (pcase_var.eql($EQUALITY_REASONING_DOMAIN)) {
													_csetf_prob_store_equality_reasoning_domain(v_new, current_value);
												    } else {
													if (pcase_var.eql($INTERMEDIATE_STEP_VALIDATION_LEVEL)) {
													    _csetf_prob_store_intermediate_step_validation_level(v_new, current_value);
													} else {
													    if (pcase_var.eql($MAX_PROBLEM_COUNT)) {
														_csetf_prob_store_max_problem_count(v_new, current_value);
													    } else {
														if (pcase_var.eql($CRAZY_MAX_PROBLEM_COUNT)) {
														    _csetf_prob_store_crazy_max_problem_count(v_new, current_value);
														} else {
														    if (pcase_var.eql($kw167$REMOVAL_ALLOWED_)) {
															_csetf_prob_store_removal_allowedP(v_new, current_value);
														    } else {
															if (pcase_var.eql($kw168$TRANSFORMATION_ALLOWED_)) {
															    _csetf_prob_store_transformation_allowedP(v_new, current_value);
															} else {
															    if (pcase_var.eql($kw169$ADD_RESTRICTION_LAYER_OF_INDIRECTION_)) {
																_csetf_prob_store_add_restriction_layer_of_indirectionP(v_new, current_value);
															    } else {
																if (pcase_var.eql($kw170$NEGATION_BY_FAILURE_)) {
																    _csetf_prob_store_negation_by_failureP(v_new, current_value);
																} else {
																    if (pcase_var.eql($kw171$COMPLETENESS_MINIMIZATION_ALLOWED_)) {
																	_csetf_prob_store_completeness_minimization_allowedP(v_new, current_value);
																    } else {
																	if (pcase_var.eql($DIRECTION)) {
																	    _csetf_prob_store_direction(v_new, current_value);
																	} else {
																	    if (pcase_var.eql($kw173$EVALUATE_SUBL_ALLOWED_)) {
																		_csetf_prob_store_evaluate_subl_allowedP(v_new, current_value);
																	    } else {
																		if (pcase_var.eql($kw174$REWRITE_ALLOWED_)) {
																		    _csetf_prob_store_rewrite_allowedP(v_new, current_value);
																		} else {
																		    if (pcase_var.eql($kw175$ABDUCTION_ALLOWED_)) {
																			_csetf_prob_store_abduction_allowedP(v_new, current_value);
																		    } else {
																			if (pcase_var.eql($kw176$NEW_TERMS_ALLOWED_)) {
																			    _csetf_prob_store_new_terms_allowedP(v_new, current_value);
																			} else {
																			    if (pcase_var.eql($kw177$COMPUTE_ANSWER_JUSTIFICATIONS_)) {
																				_csetf_prob_store_compute_answer_justificationsP(v_new, current_value);
																			    } else {
																				if (pcase_var.eql($MEMOIZATION_STATE)) {
																				    _csetf_prob_store_memoization_state(v_new, current_value);
																				} else {
																				    if (pcase_var.eql($SBHL_RESOURCE_SPACE)) {
																					_csetf_prob_store_sbhl_resource_space(v_new, current_value);
																				    } else {
																					if (pcase_var.eql($PREPARED_)) {
																					    _csetf_prob_store_preparedP(v_new, current_value);
																					} else {
																					    if (pcase_var.eql($kw181$DESTRUCTION_IMMINENT_)) {
																						_csetf_prob_store_destruction_imminentP(v_new, current_value);
																					    } else {
																						if (pcase_var.eql($META_PROBLEM_STORE)) {
																						    _csetf_prob_store_meta_problem_store(v_new, current_value);
																						} else {
																						    if (pcase_var.eql($STATIC_PROPERTIES)) {
																							_csetf_prob_store_static_properties(v_new, current_value);
																						    } else {
																							if (pcase_var.eql($JANITOR)) {
																							    _csetf_prob_store_janitor(v_new, current_value);
																							} else {
																							    if (pcase_var.eql($HISTORICAL_ROOT_PROBLEMS)) {
																								_csetf_prob_store_historical_root_problems(v_new, current_value);
																							    } else {
																								if (pcase_var.eql($HISTORICAL_TACTIC_COUNT)) {
																								    _csetf_prob_store_historical_tactic_count(v_new, current_value);
																								} else {
																								    if (pcase_var.eql($COMPLEX_PROBLEM_QUERY_CZER_INDEX)) {
																									_csetf_prob_store_complex_problem_query_czer_index(v_new, current_value);
																								    } else {
																									if (pcase_var.eql($COMPLEX_PROBLEM_QUERY_SIGNATURES)) {
																									    _csetf_prob_store_complex_problem_query_signatures(v_new, current_value);
																									} else {
																									    if (pcase_var.eql($PROOF_KEEPING_INDEX)) {
																										_csetf_prob_store_proof_keeping_index(v_new, current_value);
																									    } else {
																										Errors.error($str_alt190$Invalid_slot__S_for_construction_, current_arg);
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
	    return v_new;
	}
    }

    public static SubLObject make_problem_store(SubLObject arglist) {
	if (arglist == UNPROVIDED) {
	    arglist = NIL;
	}
	final SubLObject v_new = new $problem_store_native();
	SubLObject next;
	SubLObject current_arg;
	SubLObject current_value;
	SubLObject pcase_var;
	for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
	    current_arg = next.first();
	    current_value = cadr(next);
	    pcase_var = current_arg;
	    if (pcase_var.eql($GUID)) {
		inference_datastructures_problem_store._csetf_prob_store_guid(v_new, current_value);
	    } else if (pcase_var.eql($SUID)) {
		inference_datastructures_problem_store._csetf_prob_store_suid(v_new, current_value);
	    } else if (pcase_var.eql($LOCK)) {
		inference_datastructures_problem_store._csetf_prob_store_lock(v_new, current_value);
	    } else if (pcase_var.eql($CREATION_TIME)) {
		inference_datastructures_problem_store._csetf_prob_store_creation_time(v_new, current_value);
	    } else if (pcase_var.eql($INFERENCE_ID_INDEX)) {
		inference_datastructures_problem_store._csetf_prob_store_inference_id_index(v_new, current_value);
	    } else if (pcase_var.eql($STRATEGY_ID_INDEX)) {
		inference_datastructures_problem_store._csetf_prob_store_strategy_id_index(v_new, current_value);
	    } else if (pcase_var.eql($PROBLEM_ID_INDEX)) {
		inference_datastructures_problem_store._csetf_prob_store_problem_id_index(v_new, current_value);
	    } else if (pcase_var.eql($LINK_ID_INDEX)) {
		inference_datastructures_problem_store._csetf_prob_store_link_id_index(v_new, current_value);
	    } else if (pcase_var.eql($PROOF_ID_INDEX)) {
		inference_datastructures_problem_store._csetf_prob_store_proof_id_index(v_new, current_value);
	    } else if (pcase_var.eql($PROBLEMS_BY_QUERY_INDEX)) {
		inference_datastructures_problem_store._csetf_prob_store_problems_by_query_index(v_new, current_value);
	    } else if (pcase_var.eql($REJECTED_PROOFS)) {
		inference_datastructures_problem_store._csetf_prob_store_rejected_proofs(v_new, current_value);
	    } else if (pcase_var.eql($PROCESSED_PROOFS)) {
		inference_datastructures_problem_store._csetf_prob_store_processed_proofs(v_new, current_value);
	    } else if (pcase_var.eql($POTENTIALLY_PROCESSED_PROBLEMS)) {
		inference_datastructures_problem_store._csetf_prob_store_potentially_processed_problems(v_new, current_value);
	    } else if (pcase_var.eql($kw169$NON_EXPLANATORY_SUBPROOFS_POSSIBLE_)) {
		inference_datastructures_problem_store._csetf_prob_store_non_explanatory_subproofs_possibleP(v_new, current_value);
	    } else if (pcase_var.eql($NON_EXPLANATORY_SUBPROOFS_INDEX)) {
		inference_datastructures_problem_store._csetf_prob_store_non_explanatory_subproofs_index(v_new, current_value);
	    } else if (pcase_var.eql($MOST_RECENT_TACTIC_EXECUTED)) {
		inference_datastructures_problem_store._csetf_prob_store_most_recent_tactic_executed(v_new, current_value);
	    } else if (pcase_var.eql($MIN_PROOF_DEPTH_INDEX)) {
		inference_datastructures_problem_store._csetf_prob_store_min_proof_depth_index(v_new, current_value);
	    } else if (pcase_var.eql($MIN_TRANSFORMATION_DEPTH_INDEX)) {
		inference_datastructures_problem_store._csetf_prob_store_min_transformation_depth_index(v_new, current_value);
	    } else if (pcase_var.eql($MIN_TRANSFORMATION_DEPTH_SIGNATURE_INDEX)) {
		inference_datastructures_problem_store._csetf_prob_store_min_transformation_depth_signature_index(v_new, current_value);
	    } else if (pcase_var.eql($MIN_DEPTH_INDEX)) {
		inference_datastructures_problem_store._csetf_prob_store_min_depth_index(v_new, current_value);
	    } else if (pcase_var.eql($EQUALITY_REASONING_METHOD)) {
		inference_datastructures_problem_store._csetf_prob_store_equality_reasoning_method(v_new, current_value);
	    } else if (pcase_var.eql($EQUALITY_REASONING_DOMAIN)) {
		inference_datastructures_problem_store._csetf_prob_store_equality_reasoning_domain(v_new, current_value);
	    } else if (pcase_var.eql($INTERMEDIATE_STEP_VALIDATION_LEVEL)) {
		inference_datastructures_problem_store._csetf_prob_store_intermediate_step_validation_level(v_new, current_value);
	    } else if (pcase_var.eql($MAX_PROBLEM_COUNT)) {
		inference_datastructures_problem_store._csetf_prob_store_max_problem_count(v_new, current_value);
	    } else if (pcase_var.eql($CRAZY_MAX_PROBLEM_COUNT)) {
		inference_datastructures_problem_store._csetf_prob_store_crazy_max_problem_count(v_new, current_value);
	    } else if (pcase_var.eql($kw181$REMOVAL_ALLOWED_)) {
		inference_datastructures_problem_store._csetf_prob_store_removal_allowedP(v_new, current_value);
	    } else if (pcase_var.eql($kw182$TRANSFORMATION_ALLOWED_)) {
		inference_datastructures_problem_store._csetf_prob_store_transformation_allowedP(v_new, current_value);
	    } else if (pcase_var.eql($kw183$ADD_RESTRICTION_LAYER_OF_INDIRECTION_)) {
		inference_datastructures_problem_store._csetf_prob_store_add_restriction_layer_of_indirectionP(v_new, current_value);
	    } else if (pcase_var.eql($kw184$NEGATION_BY_FAILURE_)) {
		inference_datastructures_problem_store._csetf_prob_store_negation_by_failureP(v_new, current_value);
	    } else if (pcase_var.eql($kw185$COMPLETENESS_MINIMIZATION_ALLOWED_)) {
		inference_datastructures_problem_store._csetf_prob_store_completeness_minimization_allowedP(v_new, current_value);
	    } else if (pcase_var.eql($DIRECTION)) {
		inference_datastructures_problem_store._csetf_prob_store_direction(v_new, current_value);
	    } else if (pcase_var.eql($kw187$EVALUATE_SUBL_ALLOWED_)) {
		inference_datastructures_problem_store._csetf_prob_store_evaluate_subl_allowedP(v_new, current_value);
	    } else if (pcase_var.eql($kw188$REWRITE_ALLOWED_)) {
		inference_datastructures_problem_store._csetf_prob_store_rewrite_allowedP(v_new, current_value);
	    } else if (pcase_var.eql($kw189$ABDUCTION_ALLOWED_)) {
		inference_datastructures_problem_store._csetf_prob_store_abduction_allowedP(v_new, current_value);
	    } else if (pcase_var.eql($kw190$NEW_TERMS_ALLOWED_)) {
		inference_datastructures_problem_store._csetf_prob_store_new_terms_allowedP(v_new, current_value);
	    } else if (pcase_var.eql($kw191$COMPUTE_ANSWER_JUSTIFICATIONS_)) {
		inference_datastructures_problem_store._csetf_prob_store_compute_answer_justificationsP(v_new, current_value);
	    } else if (pcase_var.eql($MEMOIZATION_STATE)) {
		inference_datastructures_problem_store._csetf_prob_store_memoization_state(v_new, current_value);
	    } else if (pcase_var.eql($SBHL_RESOURCE_SPACE)) {
		inference_datastructures_problem_store._csetf_prob_store_sbhl_resource_space(v_new, current_value);
	    } else if (pcase_var.eql($PREPARED_)) {
		inference_datastructures_problem_store._csetf_prob_store_preparedP(v_new, current_value);
	    } else if (pcase_var.eql($kw195$DESTRUCTION_IMMINENT_)) {
		inference_datastructures_problem_store._csetf_prob_store_destruction_imminentP(v_new, current_value);
	    } else if (pcase_var.eql($META_PROBLEM_STORE)) {
		inference_datastructures_problem_store._csetf_prob_store_meta_problem_store(v_new, current_value);
	    } else if (pcase_var.eql($STATIC_PROPERTIES)) {
		inference_datastructures_problem_store._csetf_prob_store_static_properties(v_new, current_value);
	    } else if (pcase_var.eql($JANITOR)) {
		inference_datastructures_problem_store._csetf_prob_store_janitor(v_new, current_value);
	    } else if (pcase_var.eql($HISTORICAL_ROOT_PROBLEMS)) {
		inference_datastructures_problem_store._csetf_prob_store_historical_root_problems(v_new, current_value);
	    } else if (pcase_var.eql($HISTORICAL_TACTIC_COUNT)) {
		inference_datastructures_problem_store._csetf_prob_store_historical_tactic_count(v_new, current_value);
	    } else if (pcase_var.eql($COMPLEX_PROBLEM_QUERY_CZER_INDEX)) {
		inference_datastructures_problem_store._csetf_prob_store_complex_problem_query_czer_index(v_new, current_value);
	    } else if (pcase_var.eql($COMPLEX_PROBLEM_QUERY_SIGNATURES)) {
		inference_datastructures_problem_store._csetf_prob_store_complex_problem_query_signatures(v_new, current_value);
	    } else if (pcase_var.eql($PROOF_KEEPING_INDEX)) {
		inference_datastructures_problem_store._csetf_prob_store_proof_keeping_index(v_new, current_value);
	    } else {
		Errors.error($str204$Invalid_slot__S_for_construction_, current_arg);
	    }

	}
	return v_new;
    }

    public static SubLObject visit_defstruct_problem_store(final SubLObject obj, final SubLObject visitor_fn) {
	funcall(visitor_fn, obj, $BEGIN, inference_datastructures_problem_store.MAKE_PROBLEM_STORE, $int$48);
	funcall(visitor_fn, obj, $SLOT, $GUID, inference_datastructures_problem_store.prob_store_guid(obj));
	funcall(visitor_fn, obj, $SLOT, $SUID, inference_datastructures_problem_store.prob_store_suid(obj));
	funcall(visitor_fn, obj, $SLOT, $LOCK, inference_datastructures_problem_store.prob_store_lock(obj));
	funcall(visitor_fn, obj, $SLOT, $CREATION_TIME, inference_datastructures_problem_store.prob_store_creation_time(obj));
	funcall(visitor_fn, obj, $SLOT, $INFERENCE_ID_INDEX, inference_datastructures_problem_store.prob_store_inference_id_index(obj));
	funcall(visitor_fn, obj, $SLOT, $STRATEGY_ID_INDEX, inference_datastructures_problem_store.prob_store_strategy_id_index(obj));
	funcall(visitor_fn, obj, $SLOT, $PROBLEM_ID_INDEX, inference_datastructures_problem_store.prob_store_problem_id_index(obj));
	funcall(visitor_fn, obj, $SLOT, $LINK_ID_INDEX, inference_datastructures_problem_store.prob_store_link_id_index(obj));
	funcall(visitor_fn, obj, $SLOT, $PROOF_ID_INDEX, inference_datastructures_problem_store.prob_store_proof_id_index(obj));
	funcall(visitor_fn, obj, $SLOT, $PROBLEMS_BY_QUERY_INDEX, inference_datastructures_problem_store.prob_store_problems_by_query_index(obj));
	funcall(visitor_fn, obj, $SLOT, $REJECTED_PROOFS, inference_datastructures_problem_store.prob_store_rejected_proofs(obj));
	funcall(visitor_fn, obj, $SLOT, $PROCESSED_PROOFS, inference_datastructures_problem_store.prob_store_processed_proofs(obj));
	funcall(visitor_fn, obj, $SLOT, $POTENTIALLY_PROCESSED_PROBLEMS, inference_datastructures_problem_store.prob_store_potentially_processed_problems(obj));
	funcall(visitor_fn, obj, $SLOT, $kw169$NON_EXPLANATORY_SUBPROOFS_POSSIBLE_, inference_datastructures_problem_store.prob_store_non_explanatory_subproofs_possibleP(obj));
	funcall(visitor_fn, obj, $SLOT, $NON_EXPLANATORY_SUBPROOFS_INDEX, inference_datastructures_problem_store.prob_store_non_explanatory_subproofs_index(obj));
	funcall(visitor_fn, obj, $SLOT, $MOST_RECENT_TACTIC_EXECUTED, inference_datastructures_problem_store.prob_store_most_recent_tactic_executed(obj));
	funcall(visitor_fn, obj, $SLOT, $MIN_PROOF_DEPTH_INDEX, inference_datastructures_problem_store.prob_store_min_proof_depth_index(obj));
	funcall(visitor_fn, obj, $SLOT, $MIN_TRANSFORMATION_DEPTH_INDEX, inference_datastructures_problem_store.prob_store_min_transformation_depth_index(obj));
	funcall(visitor_fn, obj, $SLOT, $MIN_TRANSFORMATION_DEPTH_SIGNATURE_INDEX, inference_datastructures_problem_store.prob_store_min_transformation_depth_signature_index(obj));
	funcall(visitor_fn, obj, $SLOT, $MIN_DEPTH_INDEX, inference_datastructures_problem_store.prob_store_min_depth_index(obj));
	funcall(visitor_fn, obj, $SLOT, $EQUALITY_REASONING_METHOD, inference_datastructures_problem_store.prob_store_equality_reasoning_method(obj));
	funcall(visitor_fn, obj, $SLOT, $EQUALITY_REASONING_DOMAIN, inference_datastructures_problem_store.prob_store_equality_reasoning_domain(obj));
	funcall(visitor_fn, obj, $SLOT, $INTERMEDIATE_STEP_VALIDATION_LEVEL, inference_datastructures_problem_store.prob_store_intermediate_step_validation_level(obj));
	funcall(visitor_fn, obj, $SLOT, $MAX_PROBLEM_COUNT, inference_datastructures_problem_store.prob_store_max_problem_count(obj));
	funcall(visitor_fn, obj, $SLOT, $CRAZY_MAX_PROBLEM_COUNT, inference_datastructures_problem_store.prob_store_crazy_max_problem_count(obj));
	funcall(visitor_fn, obj, $SLOT, $kw181$REMOVAL_ALLOWED_, inference_datastructures_problem_store.prob_store_removal_allowedP(obj));
	funcall(visitor_fn, obj, $SLOT, $kw182$TRANSFORMATION_ALLOWED_, inference_datastructures_problem_store.prob_store_transformation_allowedP(obj));
	funcall(visitor_fn, obj, $SLOT, $kw183$ADD_RESTRICTION_LAYER_OF_INDIRECTION_, inference_datastructures_problem_store.prob_store_add_restriction_layer_of_indirectionP(obj));
	funcall(visitor_fn, obj, $SLOT, $kw184$NEGATION_BY_FAILURE_, inference_datastructures_problem_store.prob_store_negation_by_failureP(obj));
	funcall(visitor_fn, obj, $SLOT, $kw185$COMPLETENESS_MINIMIZATION_ALLOWED_, inference_datastructures_problem_store.prob_store_completeness_minimization_allowedP(obj));
	funcall(visitor_fn, obj, $SLOT, $DIRECTION, inference_datastructures_problem_store.prob_store_direction(obj));
	funcall(visitor_fn, obj, $SLOT, $kw187$EVALUATE_SUBL_ALLOWED_, inference_datastructures_problem_store.prob_store_evaluate_subl_allowedP(obj));
	funcall(visitor_fn, obj, $SLOT, $kw188$REWRITE_ALLOWED_, inference_datastructures_problem_store.prob_store_rewrite_allowedP(obj));
	funcall(visitor_fn, obj, $SLOT, $kw189$ABDUCTION_ALLOWED_, inference_datastructures_problem_store.prob_store_abduction_allowedP(obj));
	funcall(visitor_fn, obj, $SLOT, $kw190$NEW_TERMS_ALLOWED_, inference_datastructures_problem_store.prob_store_new_terms_allowedP(obj));
	funcall(visitor_fn, obj, $SLOT, $kw191$COMPUTE_ANSWER_JUSTIFICATIONS_, inference_datastructures_problem_store.prob_store_compute_answer_justificationsP(obj));
	funcall(visitor_fn, obj, $SLOT, $MEMOIZATION_STATE, inference_datastructures_problem_store.prob_store_memoization_state(obj));
	funcall(visitor_fn, obj, $SLOT, $SBHL_RESOURCE_SPACE, inference_datastructures_problem_store.prob_store_sbhl_resource_space(obj));
	funcall(visitor_fn, obj, $SLOT, $PREPARED_, inference_datastructures_problem_store.prob_store_preparedP(obj));
	funcall(visitor_fn, obj, $SLOT, $kw195$DESTRUCTION_IMMINENT_, inference_datastructures_problem_store.prob_store_destruction_imminentP(obj));
	funcall(visitor_fn, obj, $SLOT, $META_PROBLEM_STORE, inference_datastructures_problem_store.prob_store_meta_problem_store(obj));
	funcall(visitor_fn, obj, $SLOT, $STATIC_PROPERTIES, inference_datastructures_problem_store.prob_store_static_properties(obj));
	funcall(visitor_fn, obj, $SLOT, $JANITOR, inference_datastructures_problem_store.prob_store_janitor(obj));
	funcall(visitor_fn, obj, $SLOT, $HISTORICAL_ROOT_PROBLEMS, inference_datastructures_problem_store.prob_store_historical_root_problems(obj));
	funcall(visitor_fn, obj, $SLOT, $HISTORICAL_TACTIC_COUNT, inference_datastructures_problem_store.prob_store_historical_tactic_count(obj));
	funcall(visitor_fn, obj, $SLOT, $COMPLEX_PROBLEM_QUERY_CZER_INDEX, inference_datastructures_problem_store.prob_store_complex_problem_query_czer_index(obj));
	funcall(visitor_fn, obj, $SLOT, $COMPLEX_PROBLEM_QUERY_SIGNATURES, inference_datastructures_problem_store.prob_store_complex_problem_query_signatures(obj));
	funcall(visitor_fn, obj, $SLOT, $PROOF_KEEPING_INDEX, inference_datastructures_problem_store.prob_store_proof_keeping_index(obj));
	funcall(visitor_fn, obj, $END, inference_datastructures_problem_store.MAKE_PROBLEM_STORE, $int$48);
	return obj;
    }

    public static SubLObject visit_defstruct_object_problem_store_method(final SubLObject obj, final SubLObject visitor_fn) {
	return inference_datastructures_problem_store.visit_defstruct_problem_store(obj, visitor_fn);
    }

    public static final SubLObject valid_problem_store_p_alt(SubLObject v_object) {
	return makeBoolean((NIL != problem_store_p(v_object)) && (NIL == problem_store_invalid_p(v_object)));
    }

    public static SubLObject valid_problem_store_p(final SubLObject v_object) {
	return makeBoolean((NIL != inference_datastructures_problem_store.problem_store_p(v_object)) && (NIL == inference_datastructures_problem_store.problem_store_invalid_p(v_object)));
    }

    public static final SubLObject id_of_valid_problem_store_p_alt(SubLObject v_object) {
	return valid_problem_store_p(find_problem_store_by_id(v_object));
    }

    public static SubLObject id_of_valid_problem_store_p(final SubLObject v_object) {
	return inference_datastructures_problem_store.valid_problem_store_p(inference_datastructures_problem_store.find_problem_store_by_id(v_object));
    }

    public static final SubLObject problem_store_invalid_p_alt(SubLObject store) {
	return eq($FREE, prob_store_equality_reasoning_domain(store));
    }

    public static SubLObject problem_store_invalid_p(final SubLObject store) {
	return eq($FREE, inference_datastructures_problem_store.prob_store_equality_reasoning_domain(store));
    }

    public static final SubLObject print_problem_store_alt(SubLObject v_object, SubLObject stream, SubLObject depth) {
	if (NIL != problem_store_invalid_p(v_object)) {
	    format(stream, $str_alt192$_Invalid_PROBLEM_STORE__s_, prob_store_suid(v_object));
	} else {
	    format(stream, $str_alt193$_PROBLEM_STORE__a_size__a_, problem_store_suid(v_object), problem_store_size(v_object));
	}
	return NIL;
    }

    public static SubLObject print_problem_store(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
	if (NIL != inference_datastructures_problem_store.problem_store_invalid_p(v_object)) {
	    format(stream, $str211$_Invalid_PROBLEM_STORE__s_, inference_datastructures_problem_store.prob_store_suid(v_object));
	} else {
	    format(stream, $str212$_PROBLEM_STORE__a_size__a_, inference_datastructures_problem_store.problem_store_suid(v_object), inference_datastructures_problem_store.problem_store_size(v_object));
	}
	return NIL;
    }

    public static final SubLObject sxhash_problem_store_method_alt(SubLObject v_object) {
	return prob_store_suid(v_object);
    }

    public static SubLObject sxhash_problem_store_method(final SubLObject v_object) {
	return inference_datastructures_problem_store.prob_store_suid(v_object);
    }

    public static final SubLObject with_problem_store_lock_held_alt(SubLObject macroform, SubLObject environment) {
	{
	    SubLObject datum = macroform.rest();
	    SubLObject current = datum;
	    SubLObject store = NIL;
	    destructuring_bind_must_consp(current, datum, $list_alt195);
	    store = current.first();
	    current = current.rest();
	    {
		SubLObject body = current;
		return listS(WITH_LOCK_HELD, list(list(PROBLEM_STORE_LOCK, store)), append(body, NIL));
	    }
	}
    }

    public static SubLObject with_problem_store_lock_held(final SubLObject macroform, final SubLObject environment) {
	SubLObject current;
	final SubLObject datum = current = macroform.rest();
	SubLObject store = NIL;
	destructuring_bind_must_consp(current, datum, $list214);
	store = current.first();
	final SubLObject body;
	current = body = current.rest();
	return listS(WITH_LOCK_HELD, list(list(inference_datastructures_problem_store.PROBLEM_STORE_LOCK, store)), append(body, NIL));
    }

    public static final SubLObject problem_store_lock_alt(SubLObject store) {
	return prob_store_lock(store);
    }

    public static SubLObject problem_store_lock(final SubLObject store) {
	return inference_datastructures_problem_store.prob_store_lock(store);
    }

    public static final SubLObject with_problem_store_memoization_state_alt(SubLObject macroform, SubLObject environment) {
	{
	    SubLObject datum = macroform.rest();
	    SubLObject current = datum;
	    destructuring_bind_must_consp(current, datum, $list_alt199);
	    {
		SubLObject temp = current.rest();
		current = current.first();
		{
		    SubLObject store = NIL;
		    destructuring_bind_must_consp(current, datum, $list_alt199);
		    store = current.first();
		    current = current.rest();
		    if (NIL == current) {
			current = temp;
			{
			    SubLObject body = current;
			    return listS(WITH_MEMOIZATION_STATE, list(list(PROBLEM_STORE_MEMOIZATION_STATE, store)), append(body, NIL));
			}
		    } else {
			cdestructuring_bind_error(datum, $list_alt199);
		    }
		}
	    }
	}
	return NIL;
    }

    public static SubLObject with_problem_store_memoization_state(final SubLObject macroform, final SubLObject environment) {
	SubLObject current;
	final SubLObject datum = current = macroform.rest();
	destructuring_bind_must_consp(current, datum, $list218);
	final SubLObject temp = current.rest();
	current = current.first();
	SubLObject store = NIL;
	destructuring_bind_must_consp(current, datum, $list218);
	store = current.first();
	current = current.rest();
	if (NIL == current) {
	    final SubLObject body;
	    current = body = temp;
	    return listS(WITH_MEMOIZATION_STATE, list(list(inference_datastructures_problem_store.PROBLEM_STORE_MEMOIZATION_STATE, store)), append(body, NIL));
	}
	cdestructuring_bind_error(datum, $list218);
	return NIL;
    }

    public static final SubLObject problem_store_memoization_state_alt(SubLObject store) {
	return prob_store_memoization_state(store);
    }

    public static SubLObject problem_store_memoization_state(final SubLObject store) {
	return inference_datastructures_problem_store.prob_store_memoization_state(store);
    }

    public static final SubLObject with_problem_store_sbhl_resource_space_alt(SubLObject macroform, SubLObject environment) {
	{
	    SubLObject datum = macroform.rest();
	    SubLObject current = datum;
	    destructuring_bind_must_consp(current, datum, $list_alt199);
	    {
		SubLObject temp = current.rest();
		current = current.first();
		{
		    SubLObject store = NIL;
		    destructuring_bind_must_consp(current, datum, $list_alt199);
		    store = current.first();
		    current = current.rest();
		    if (NIL == current) {
			current = temp;
			{
			    SubLObject body = current;
			    SubLObject space_var = $sym203$SPACE_VAR;
			    return list(CLET, list(list(space_var, list(PROBLEM_STORE_SBHL_RESOURCE_SPACE, store))), listS(WITH_SBHL_MARKING_SPACE_RESOURCE, space_var, append(body, NIL)), list(SET_PROBLEM_STORE_SBHL_RESOURCE_SPACE, store, space_var));
			}
		    } else {
			cdestructuring_bind_error(datum, $list_alt199);
		    }
		}
	    }
	}
	return NIL;
    }

    public static SubLObject with_problem_store_sbhl_resource_space(final SubLObject macroform, final SubLObject environment) {
	SubLObject current;
	final SubLObject datum = current = macroform.rest();
	destructuring_bind_must_consp(current, datum, $list218);
	final SubLObject temp = current.rest();
	current = current.first();
	SubLObject store = NIL;
	destructuring_bind_must_consp(current, datum, $list218);
	store = current.first();
	current = current.rest();
	if (NIL == current) {
	    final SubLObject body;
	    current = body = temp;
	    final SubLObject space_var = $sym222$SPACE_VAR;
	    return list(CLET, list(list(space_var, list(inference_datastructures_problem_store.PROBLEM_STORE_SBHL_RESOURCE_SPACE, store))), listS(inference_datastructures_problem_store.WITH_SBHL_MARKING_SPACE_RESOURCE, space_var, append(body, NIL)),
		    list(inference_datastructures_problem_store.SET_PROBLEM_STORE_SBHL_RESOURCE_SPACE, store, space_var));
	}
	cdestructuring_bind_error(datum, $list218);
	return NIL;
    }

    public static final SubLObject problem_store_sbhl_resource_space_alt(SubLObject store) {
	return prob_store_sbhl_resource_space(store);
    }

    public static SubLObject problem_store_sbhl_resource_space(final SubLObject store) {
	return inference_datastructures_problem_store.prob_store_sbhl_resource_space(store);
    }

    public static final SubLObject set_problem_store_sbhl_resource_space_alt(SubLObject store, SubLObject space) {
	_csetf_prob_store_sbhl_resource_space(store, space);
	return store;
    }

    public static SubLObject set_problem_store_sbhl_resource_space(final SubLObject store, final SubLObject space) {
	inference_datastructures_problem_store._csetf_prob_store_sbhl_resource_space(store, space);
	return store;
    }

    public static final SubLObject with_problem_store_resourcing_and_memoization_alt(SubLObject macroform, SubLObject environment) {
	{
	    SubLObject datum = macroform.rest();
	    SubLObject current = datum;
	    SubLObject store = NIL;
	    destructuring_bind_must_consp(current, datum, $list_alt195);
	    store = current.first();
	    current = current.rest();
	    {
		SubLObject body = current;
		SubLObject store_var = $sym209$STORE_VAR;
		return list(CLET, list(list(store_var, store)), list(WITH_PROBLEM_STORE_MEMOIZATION_STATE, list(store_var), listS(WITH_PROBLEM_STORE_SBHL_RESOURCE_SPACE, list(store_var), append(body, NIL))));
	    }
	}
    }

    public static SubLObject with_problem_store_resourcing_and_memoization(final SubLObject macroform, final SubLObject environment) {
	SubLObject current;
	final SubLObject datum = current = macroform.rest();
	SubLObject store = NIL;
	destructuring_bind_must_consp(current, datum, $list214);
	store = current.first();
	final SubLObject body;
	current = body = current.rest();
	final SubLObject store_var = $sym228$STORE_VAR;
	return list(CLET, list(list(store_var, store)), list(inference_datastructures_problem_store.WITH_PROBLEM_STORE_MEMOIZATION_STATE, list(store_var), listS(inference_datastructures_problem_store.WITH_PROBLEM_STORE_SBHL_RESOURCE_SPACE, list(store_var), append(body, NIL))));
    }

    public static final SubLObject do_problem_store_inferences_alt(SubLObject macroform, SubLObject environment) {
	{
	    SubLObject datum = macroform.rest();
	    SubLObject current = datum;
	    destructuring_bind_must_consp(current, datum, $list_alt210);
	    {
		SubLObject temp = current.rest();
		current = current.first();
		{
		    SubLObject inference_var = NIL;
		    SubLObject store = NIL;
		    destructuring_bind_must_consp(current, datum, $list_alt210);
		    inference_var = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt210);
		    store = current.first();
		    current = current.rest();
		    {
			SubLObject allow_other_keys_p = NIL;
			SubLObject rest = current;
			SubLObject bad = NIL;
			SubLObject current_2 = NIL;
			for (; NIL != rest;) {
			    destructuring_bind_must_consp(rest, datum, $list_alt210);
			    current_2 = rest.first();
			    rest = rest.rest();
			    destructuring_bind_must_consp(rest, datum, $list_alt210);
			    if (NIL == member(current_2, $list_alt2, UNPROVIDED, UNPROVIDED)) {
				bad = T;
			    }
			    if (current_2 == $ALLOW_OTHER_KEYS) {
				allow_other_keys_p = rest.first();
			    }
			    rest = rest.rest();
			}
			if ((NIL != bad) && (NIL == allow_other_keys_p)) {
			    cdestructuring_bind_error(datum, $list_alt210);
			}
			{
			    SubLObject done_tail = property_list_member($DONE, current);
			    SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
			    current = temp;
			    {
				SubLObject body = current;
				SubLObject id = $sym211$ID;
				return listS(DO_ID_INDEX, list(id, inference_var, list(PROBLEM_STORE_INFERENCE_ID_INDEX, store), $DONE, done), list(IGNORE, id), append(body, NIL));
			    }
			}
		    }
		}
	    }
	}
    }

    public static SubLObject do_problem_store_inferences(final SubLObject macroform, final SubLObject environment) {
	SubLObject current;
	final SubLObject datum = current = macroform.rest();
	destructuring_bind_must_consp(current, datum, $list229);
	final SubLObject temp = current.rest();
	current = current.first();
	SubLObject inference_var = NIL;
	SubLObject store = NIL;
	destructuring_bind_must_consp(current, datum, $list229);
	inference_var = current.first();
	current = current.rest();
	destructuring_bind_must_consp(current, datum, $list229);
	store = current.first();
	current = current.rest();
	SubLObject allow_other_keys_p = NIL;
	SubLObject rest = current;
	SubLObject bad = NIL;
	SubLObject current_$6 = NIL;
	while (NIL != rest) {
	    destructuring_bind_must_consp(rest, datum, $list229);
	    current_$6 = rest.first();
	    rest = rest.rest();
	    destructuring_bind_must_consp(rest, datum, $list229);
	    if (NIL == member(current_$6, $list2, UNPROVIDED, UNPROVIDED)) {
		bad = T;
	    }
	    if (current_$6 == $ALLOW_OTHER_KEYS) {
		allow_other_keys_p = rest.first();
	    }
	    rest = rest.rest();
	}
	if ((NIL != bad) && (NIL == allow_other_keys_p)) {
	    cdestructuring_bind_error(datum, $list229);
	}
	final SubLObject done_tail = property_list_member($DONE, current);
	final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
	final SubLObject body;
	current = body = temp;
	final SubLObject id = $sym230$ID;
	return listS(DO_ID_INDEX, list(id, inference_var, list(inference_datastructures_problem_store.PROBLEM_STORE_INFERENCE_ID_INDEX, store), $DONE, done), list(IGNORE, id), append(body, NIL));
    }

    public static final SubLObject problem_store_inference_id_index_alt(SubLObject store) {
	return prob_store_inference_id_index(store);
    }

    public static SubLObject problem_store_inference_id_index(final SubLObject store) {
	return inference_datastructures_problem_store.prob_store_inference_id_index(store);
    }

    public static final SubLObject do_problem_store_strategies_alt(SubLObject macroform, SubLObject environment) {
	{
	    SubLObject datum = macroform.rest();
	    SubLObject current = datum;
	    destructuring_bind_must_consp(current, datum, $list_alt214);
	    {
		SubLObject temp = current.rest();
		current = current.first();
		{
		    SubLObject strategy_var = NIL;
		    SubLObject store = NIL;
		    destructuring_bind_must_consp(current, datum, $list_alt214);
		    strategy_var = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt214);
		    store = current.first();
		    current = current.rest();
		    {
			SubLObject allow_other_keys_p = NIL;
			SubLObject rest = current;
			SubLObject bad = NIL;
			SubLObject current_3 = NIL;
			for (; NIL != rest;) {
			    destructuring_bind_must_consp(rest, datum, $list_alt214);
			    current_3 = rest.first();
			    rest = rest.rest();
			    destructuring_bind_must_consp(rest, datum, $list_alt214);
			    if (NIL == member(current_3, $list_alt2, UNPROVIDED, UNPROVIDED)) {
				bad = T;
			    }
			    if (current_3 == $ALLOW_OTHER_KEYS) {
				allow_other_keys_p = rest.first();
			    }
			    rest = rest.rest();
			}
			if ((NIL != bad) && (NIL == allow_other_keys_p)) {
			    cdestructuring_bind_error(datum, $list_alt214);
			}
			{
			    SubLObject done_tail = property_list_member($DONE, current);
			    SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
			    current = temp;
			    {
				SubLObject body = current;
				SubLObject id = $sym215$ID;
				return listS(DO_ID_INDEX, list(id, strategy_var, list(PROBLEM_STORE_STRATEGY_ID_INDEX, store), $DONE, done), list(IGNORE, id), append(body, NIL));
			    }
			}
		    }
		}
	    }
	}
    }

    public static SubLObject do_problem_store_strategies(final SubLObject macroform, final SubLObject environment) {
	SubLObject current;
	final SubLObject datum = current = macroform.rest();
	destructuring_bind_must_consp(current, datum, $list233);
	final SubLObject temp = current.rest();
	current = current.first();
	SubLObject strategy_var = NIL;
	SubLObject store = NIL;
	destructuring_bind_must_consp(current, datum, $list233);
	strategy_var = current.first();
	current = current.rest();
	destructuring_bind_must_consp(current, datum, $list233);
	store = current.first();
	current = current.rest();
	SubLObject allow_other_keys_p = NIL;
	SubLObject rest = current;
	SubLObject bad = NIL;
	SubLObject current_$7 = NIL;
	while (NIL != rest) {
	    destructuring_bind_must_consp(rest, datum, $list233);
	    current_$7 = rest.first();
	    rest = rest.rest();
	    destructuring_bind_must_consp(rest, datum, $list233);
	    if (NIL == member(current_$7, $list2, UNPROVIDED, UNPROVIDED)) {
		bad = T;
	    }
	    if (current_$7 == $ALLOW_OTHER_KEYS) {
		allow_other_keys_p = rest.first();
	    }
	    rest = rest.rest();
	}
	if ((NIL != bad) && (NIL == allow_other_keys_p)) {
	    cdestructuring_bind_error(datum, $list233);
	}
	final SubLObject done_tail = property_list_member($DONE, current);
	final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
	final SubLObject body;
	current = body = temp;
	final SubLObject id = $sym234$ID;
	return listS(DO_ID_INDEX, list(id, strategy_var, list(inference_datastructures_problem_store.PROBLEM_STORE_STRATEGY_ID_INDEX, store), $DONE, done), list(IGNORE, id), append(body, NIL));
    }

    public static final SubLObject problem_store_strategy_id_index_alt(SubLObject store) {
	return prob_store_strategy_id_index(store);
    }

    public static SubLObject problem_store_strategy_id_index(final SubLObject store) {
	return inference_datastructures_problem_store.prob_store_strategy_id_index(store);
    }

    public static final SubLObject do_problem_store_strategic_contexts_alt(SubLObject macroform, SubLObject environment) {
	{
	    SubLObject datum = macroform.rest();
	    SubLObject current = datum;
	    destructuring_bind_must_consp(current, datum, $list_alt218);
	    {
		SubLObject temp = current.rest();
		current = current.first();
		{
		    SubLObject strategic_context_var = NIL;
		    SubLObject store = NIL;
		    destructuring_bind_must_consp(current, datum, $list_alt218);
		    strategic_context_var = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt218);
		    store = current.first();
		    current = current.rest();
		    {
			SubLObject allow_other_keys_p = NIL;
			SubLObject rest = current;
			SubLObject bad = NIL;
			SubLObject current_4 = NIL;
			for (; NIL != rest;) {
			    destructuring_bind_must_consp(rest, datum, $list_alt218);
			    current_4 = rest.first();
			    rest = rest.rest();
			    destructuring_bind_must_consp(rest, datum, $list_alt218);
			    if (NIL == member(current_4, $list_alt2, UNPROVIDED, UNPROVIDED)) {
				bad = T;
			    }
			    if (current_4 == $ALLOW_OTHER_KEYS) {
				allow_other_keys_p = rest.first();
			    }
			    rest = rest.rest();
			}
			if ((NIL != bad) && (NIL == allow_other_keys_p)) {
			    cdestructuring_bind_error(datum, $list_alt218);
			}
			{
			    SubLObject done_tail = property_list_member($DONE, current);
			    SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
			    current = temp;
			    {
				SubLObject body = current;
				return list(PUNLESS, done, listS(CLET, list(bq_cons(strategic_context_var, $list_alt220)), append(body, NIL)), listS(DO_PROBLEM_STORE_STRATEGIES, list(strategic_context_var, store, $DONE, done), append(body, NIL)));
			    }
			}
		    }
		}
	    }
	}
    }

    public static SubLObject do_problem_store_strategic_contexts(final SubLObject macroform, final SubLObject environment) {
	SubLObject current;
	final SubLObject datum = current = macroform.rest();
	destructuring_bind_must_consp(current, datum, $list237);
	final SubLObject temp = current.rest();
	current = current.first();
	SubLObject strategic_context_var = NIL;
	SubLObject store = NIL;
	destructuring_bind_must_consp(current, datum, $list237);
	strategic_context_var = current.first();
	current = current.rest();
	destructuring_bind_must_consp(current, datum, $list237);
	store = current.first();
	current = current.rest();
	SubLObject allow_other_keys_p = NIL;
	SubLObject rest = current;
	SubLObject bad = NIL;
	SubLObject current_$8 = NIL;
	while (NIL != rest) {
	    destructuring_bind_must_consp(rest, datum, $list237);
	    current_$8 = rest.first();
	    rest = rest.rest();
	    destructuring_bind_must_consp(rest, datum, $list237);
	    if (NIL == member(current_$8, $list2, UNPROVIDED, UNPROVIDED)) {
		bad = T;
	    }
	    if (current_$8 == $ALLOW_OTHER_KEYS) {
		allow_other_keys_p = rest.first();
	    }
	    rest = rest.rest();
	}
	if ((NIL != bad) && (NIL == allow_other_keys_p)) {
	    cdestructuring_bind_error(datum, $list237);
	}
	final SubLObject done_tail = property_list_member($DONE, current);
	final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
	final SubLObject body;
	current = body = temp;
	return list(PUNLESS, done, listS(CLET, list(bq_cons(strategic_context_var, $list239)), append(body, NIL)), listS(inference_datastructures_problem_store.DO_PROBLEM_STORE_STRATEGIES, list(strategic_context_var, store, $DONE, done), append(body, NIL)));
    }

    public static final SubLObject do_problem_store_problems_alt(SubLObject macroform, SubLObject environment) {
	{
	    SubLObject datum = macroform.rest();
	    SubLObject current = datum;
	    destructuring_bind_must_consp(current, datum, $list_alt221);
	    {
		SubLObject temp = current.rest();
		current = current.first();
		{
		    SubLObject problem_var = NIL;
		    SubLObject store = NIL;
		    destructuring_bind_must_consp(current, datum, $list_alt221);
		    problem_var = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt221);
		    store = current.first();
		    current = current.rest();
		    {
			SubLObject allow_other_keys_p = NIL;
			SubLObject rest = current;
			SubLObject bad = NIL;
			SubLObject current_5 = NIL;
			for (; NIL != rest;) {
			    destructuring_bind_must_consp(rest, datum, $list_alt221);
			    current_5 = rest.first();
			    rest = rest.rest();
			    destructuring_bind_must_consp(rest, datum, $list_alt221);
			    if (NIL == member(current_5, $list_alt222, UNPROVIDED, UNPROVIDED)) {
				bad = T;
			    }
			    if (current_5 == $ALLOW_OTHER_KEYS) {
				allow_other_keys_p = rest.first();
			    }
			    rest = rest.rest();
			}
			if ((NIL != bad) && (NIL == allow_other_keys_p)) {
			    cdestructuring_bind_error(datum, $list_alt221);
			}
			{
			    SubLObject ordered_tail = property_list_member($ORDERED, current);
			    SubLObject ordered = (NIL != ordered_tail) ? ((SubLObject) (cadr(ordered_tail))) : NIL;
			    SubLObject done_tail = property_list_member($DONE, current);
			    SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
			    current = temp;
			    {
				SubLObject body = current;
				SubLObject id = $sym224$ID;
				return listS(DO_ID_INDEX, list(id, problem_var, list(PROBLEM_STORE_PROBLEM_ID_INDEX, store), $ORDERED, ordered, $DONE, done), list(IGNORE, id), append(body, NIL));
			    }
			}
		    }
		}
	    }
	}
    }

    public static SubLObject do_problem_store_problems(final SubLObject macroform, final SubLObject environment) {
	SubLObject current;
	final SubLObject datum = current = macroform.rest();
	destructuring_bind_must_consp(current, datum, $list240);
	final SubLObject temp = current.rest();
	current = current.first();
	SubLObject problem_var = NIL;
	SubLObject store = NIL;
	destructuring_bind_must_consp(current, datum, $list240);
	problem_var = current.first();
	current = current.rest();
	destructuring_bind_must_consp(current, datum, $list240);
	store = current.first();
	current = current.rest();
	SubLObject allow_other_keys_p = NIL;
	SubLObject rest = current;
	SubLObject bad = NIL;
	SubLObject current_$9 = NIL;
	while (NIL != rest) {
	    destructuring_bind_must_consp(rest, datum, $list240);
	    current_$9 = rest.first();
	    rest = rest.rest();
	    destructuring_bind_must_consp(rest, datum, $list240);
	    if (NIL == member(current_$9, $list241, UNPROVIDED, UNPROVIDED)) {
		bad = T;
	    }
	    if (current_$9 == $ALLOW_OTHER_KEYS) {
		allow_other_keys_p = rest.first();
	    }
	    rest = rest.rest();
	}
	if ((NIL != bad) && (NIL == allow_other_keys_p)) {
	    cdestructuring_bind_error(datum, $list240);
	}
	final SubLObject ordered_tail = property_list_member($ORDERED, current);
	final SubLObject ordered = (NIL != ordered_tail) ? cadr(ordered_tail) : NIL;
	final SubLObject done_tail = property_list_member($DONE, current);
	final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
	final SubLObject body;
	current = body = temp;
	final SubLObject id = $sym243$ID;
	return listS(DO_ID_INDEX, list(id, problem_var, list(inference_datastructures_problem_store.PROBLEM_STORE_PROBLEM_ID_INDEX, store), $ORDERED, ordered, $DONE, done), list(IGNORE, id), append(body, NIL));
    }

    public static final SubLObject problem_store_problem_id_index_alt(SubLObject store) {
	return prob_store_problem_id_index(store);
    }

    public static SubLObject problem_store_problem_id_index(final SubLObject store) {
	return inference_datastructures_problem_store.prob_store_problem_id_index(store);
    }

    public static final SubLObject do_problem_store_links_alt(SubLObject macroform, SubLObject environment) {
	{
	    SubLObject datum = macroform.rest();
	    SubLObject current = datum;
	    destructuring_bind_must_consp(current, datum, $list_alt227);
	    {
		SubLObject temp = current.rest();
		current = current.first();
		{
		    SubLObject link_var = NIL;
		    SubLObject store = NIL;
		    destructuring_bind_must_consp(current, datum, $list_alt227);
		    link_var = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt227);
		    store = current.first();
		    current = current.rest();
		    {
			SubLObject allow_other_keys_p = NIL;
			SubLObject rest = current;
			SubLObject bad = NIL;
			SubLObject current_6 = NIL;
			for (; NIL != rest;) {
			    destructuring_bind_must_consp(rest, datum, $list_alt227);
			    current_6 = rest.first();
			    rest = rest.rest();
			    destructuring_bind_must_consp(rest, datum, $list_alt227);
			    if (NIL == member(current_6, $list_alt228, UNPROVIDED, UNPROVIDED)) {
				bad = T;
			    }
			    if (current_6 == $ALLOW_OTHER_KEYS) {
				allow_other_keys_p = rest.first();
			    }
			    rest = rest.rest();
			}
			if ((NIL != bad) && (NIL == allow_other_keys_p)) {
			    cdestructuring_bind_error(datum, $list_alt227);
			}
			{
			    SubLObject type_tail = property_list_member($TYPE, current);
			    SubLObject type = (NIL != type_tail) ? ((SubLObject) (cadr(type_tail))) : NIL;
			    SubLObject ordered_tail = property_list_member($ORDERED, current);
			    SubLObject ordered = (NIL != ordered_tail) ? ((SubLObject) (cadr(ordered_tail))) : NIL;
			    SubLObject done_tail = property_list_member($DONE, current);
			    SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
			    current = temp;
			    {
				SubLObject body = current;
				SubLObject id = $sym230$ID;
				if (NIL == type) {
				    return listS(DO_ID_INDEX, list(id, link_var, list(PROBLEM_STORE_LINK_ID_INDEX, store), $ORDERED, ordered, $DONE, done), list(IGNORE, id), append(body, NIL));
				} else {
				    return list(DO_PROBLEM_STORE_LINKS, list(link_var, store, $ORDERED, ordered, $DONE, done), listS(PWHEN, list($sym234$PROBLEM_LINK_HAS_TYPE_, link_var, type), append(body, NIL)));
				}
			    }
			}
		    }
		}
	    }
	}
    }

    public static SubLObject do_problem_store_links(final SubLObject macroform, final SubLObject environment) {
	SubLObject current;
	final SubLObject datum = current = macroform.rest();
	destructuring_bind_must_consp(current, datum, $list246);
	final SubLObject temp = current.rest();
	current = current.first();
	SubLObject link_var = NIL;
	SubLObject store = NIL;
	destructuring_bind_must_consp(current, datum, $list246);
	link_var = current.first();
	current = current.rest();
	destructuring_bind_must_consp(current, datum, $list246);
	store = current.first();
	current = current.rest();
	SubLObject allow_other_keys_p = NIL;
	SubLObject rest = current;
	SubLObject bad = NIL;
	SubLObject current_$10 = NIL;
	while (NIL != rest) {
	    destructuring_bind_must_consp(rest, datum, $list246);
	    current_$10 = rest.first();
	    rest = rest.rest();
	    destructuring_bind_must_consp(rest, datum, $list246);
	    if (NIL == member(current_$10, $list247, UNPROVIDED, UNPROVIDED)) {
		bad = T;
	    }
	    if (current_$10 == $ALLOW_OTHER_KEYS) {
		allow_other_keys_p = rest.first();
	    }
	    rest = rest.rest();
	}
	if ((NIL != bad) && (NIL == allow_other_keys_p)) {
	    cdestructuring_bind_error(datum, $list246);
	}
	final SubLObject type_tail = property_list_member($TYPE, current);
	final SubLObject type = (NIL != type_tail) ? cadr(type_tail) : NIL;
	final SubLObject ordered_tail = property_list_member($ORDERED, current);
	final SubLObject ordered = (NIL != ordered_tail) ? cadr(ordered_tail) : NIL;
	final SubLObject done_tail = property_list_member($DONE, current);
	final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
	final SubLObject body;
	current = body = temp;
	final SubLObject id = $sym249$ID;
	if (NIL == type) {
	    return listS(DO_ID_INDEX, list(id, link_var, list(inference_datastructures_problem_store.PROBLEM_STORE_LINK_ID_INDEX, store), $ORDERED, ordered, $DONE, done), list(IGNORE, id), append(body, NIL));
	}
	return list(inference_datastructures_problem_store.DO_PROBLEM_STORE_LINKS, list(link_var, store, $ORDERED, ordered, $DONE, done), listS(PWHEN, list($sym253$PROBLEM_LINK_HAS_TYPE_, link_var, type), append(body, NIL)));
    }

    public static final SubLObject problem_store_link_id_index_alt(SubLObject store) {
	return prob_store_link_id_index(store);
    }

    public static SubLObject problem_store_link_id_index(final SubLObject store) {
	return inference_datastructures_problem_store.prob_store_link_id_index(store);
    }

    public static final SubLObject do_problem_store_proofs_alt(SubLObject macroform, SubLObject environment) {
	{
	    SubLObject datum = macroform.rest();
	    SubLObject current = datum;
	    destructuring_bind_must_consp(current, datum, $list_alt235);
	    {
		SubLObject temp = current.rest();
		current = current.first();
		{
		    SubLObject proof_var = NIL;
		    SubLObject store = NIL;
		    destructuring_bind_must_consp(current, datum, $list_alt235);
		    proof_var = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt235);
		    store = current.first();
		    current = current.rest();
		    {
			SubLObject allow_other_keys_p = NIL;
			SubLObject rest = current;
			SubLObject bad = NIL;
			SubLObject current_7 = NIL;
			for (; NIL != rest;) {
			    destructuring_bind_must_consp(rest, datum, $list_alt235);
			    current_7 = rest.first();
			    rest = rest.rest();
			    destructuring_bind_must_consp(rest, datum, $list_alt235);
			    if (NIL == member(current_7, $list_alt236, UNPROVIDED, UNPROVIDED)) {
				bad = T;
			    }
			    if (current_7 == $ALLOW_OTHER_KEYS) {
				allow_other_keys_p = rest.first();
			    }
			    rest = rest.rest();
			}
			if ((NIL != bad) && (NIL == allow_other_keys_p)) {
			    cdestructuring_bind_error(datum, $list_alt235);
			}
			{
			    SubLObject proof_status_tail = property_list_member($PROOF_STATUS, current);
			    SubLObject proof_status = (NIL != proof_status_tail) ? ((SubLObject) (cadr(proof_status_tail))) : NIL;
			    SubLObject ordered_tail = property_list_member($ORDERED, current);
			    SubLObject ordered = (NIL != ordered_tail) ? ((SubLObject) (cadr(ordered_tail))) : NIL;
			    SubLObject done_tail = property_list_member($DONE, current);
			    SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
			    current = temp;
			    {
				SubLObject body = current;
				SubLObject id = $sym238$ID;
				if (NIL == proof_status) {
				    return listS(DO_ID_INDEX, list(id, proof_var, list(PROBLEM_STORE_PROOF_ID_INDEX, store), $ORDERED, ordered, $DONE, done), list(IGNORE, id), append(body, NIL));
				} else {
				    return list(DO_PROBLEM_STORE_PROOFS, list(proof_var, store, $ORDERED, ordered, $DONE, done), listS(PWHEN, list($sym241$PROOF_HAS_STATUS_, proof_var, proof_status), append(body, NIL)));
				}
			    }
			}
		    }
		}
	    }
	}
    }

    public static SubLObject do_problem_store_proofs(final SubLObject macroform, final SubLObject environment) {
	SubLObject current;
	final SubLObject datum = current = macroform.rest();
	destructuring_bind_must_consp(current, datum, $list254);
	final SubLObject temp = current.rest();
	current = current.first();
	SubLObject proof_var = NIL;
	SubLObject store = NIL;
	destructuring_bind_must_consp(current, datum, $list254);
	proof_var = current.first();
	current = current.rest();
	destructuring_bind_must_consp(current, datum, $list254);
	store = current.first();
	current = current.rest();
	SubLObject allow_other_keys_p = NIL;
	SubLObject rest = current;
	SubLObject bad = NIL;
	SubLObject current_$11 = NIL;
	while (NIL != rest) {
	    destructuring_bind_must_consp(rest, datum, $list254);
	    current_$11 = rest.first();
	    rest = rest.rest();
	    destructuring_bind_must_consp(rest, datum, $list254);
	    if (NIL == member(current_$11, $list255, UNPROVIDED, UNPROVIDED)) {
		bad = T;
	    }
	    if (current_$11 == $ALLOW_OTHER_KEYS) {
		allow_other_keys_p = rest.first();
	    }
	    rest = rest.rest();
	}
	if ((NIL != bad) && (NIL == allow_other_keys_p)) {
	    cdestructuring_bind_error(datum, $list254);
	}
	final SubLObject proof_status_tail = property_list_member($PROOF_STATUS, current);
	final SubLObject proof_status = (NIL != proof_status_tail) ? cadr(proof_status_tail) : NIL;
	final SubLObject ordered_tail = property_list_member($ORDERED, current);
	final SubLObject ordered = (NIL != ordered_tail) ? cadr(ordered_tail) : NIL;
	final SubLObject done_tail = property_list_member($DONE, current);
	final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
	final SubLObject body;
	current = body = temp;
	final SubLObject id = $sym257$ID;
	if (NIL == proof_status) {
	    return listS(DO_ID_INDEX, list(id, proof_var, list(inference_datastructures_problem_store.PROBLEM_STORE_PROOF_ID_INDEX, store), $ORDERED, ordered, $DONE, done), list(IGNORE, id), append(body, NIL));
	}
	return list(inference_datastructures_problem_store.DO_PROBLEM_STORE_PROOFS, list(proof_var, store, $ORDERED, ordered, $DONE, done), listS(PWHEN, list($sym260$PROOF_HAS_STATUS_, proof_var, proof_status), append(body, NIL)));
    }

    public static final SubLObject problem_store_proof_id_index_alt(SubLObject store) {
	return prob_store_proof_id_index(store);
    }

    public static SubLObject problem_store_proof_id_index(final SubLObject store) {
	return inference_datastructures_problem_store.prob_store_proof_id_index(store);
    }

    public static final SubLObject do_problem_store_historical_root_problems_alt(SubLObject macroform, SubLObject environment) {
	{
	    SubLObject datum = macroform.rest();
	    SubLObject current = datum;
	    destructuring_bind_must_consp(current, datum, $list_alt242);
	    {
		SubLObject temp = current.rest();
		current = current.first();
		{
		    SubLObject problem_var = NIL;
		    SubLObject store = NIL;
		    destructuring_bind_must_consp(current, datum, $list_alt242);
		    problem_var = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt242);
		    store = current.first();
		    current = current.rest();
		    {
			SubLObject allow_other_keys_p = NIL;
			SubLObject rest = current;
			SubLObject bad = NIL;
			SubLObject current_8 = NIL;
			for (; NIL != rest;) {
			    destructuring_bind_must_consp(rest, datum, $list_alt242);
			    current_8 = rest.first();
			    rest = rest.rest();
			    destructuring_bind_must_consp(rest, datum, $list_alt242);
			    if (NIL == member(current_8, $list_alt2, UNPROVIDED, UNPROVIDED)) {
				bad = T;
			    }
			    if (current_8 == $ALLOW_OTHER_KEYS) {
				allow_other_keys_p = rest.first();
			    }
			    rest = rest.rest();
			}
			if ((NIL != bad) && (NIL == allow_other_keys_p)) {
			    cdestructuring_bind_error(datum, $list_alt242);
			}
			{
			    SubLObject done_tail = property_list_member($DONE, current);
			    SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
			    current = temp;
			    {
				SubLObject body = current;
				return listS(DO_SET, list(problem_var, list(PROBLEM_STORE_HISTORICAL_ROOT_PROBLEMS, store), $DONE, done), append(body, NIL));
			    }
			}
		    }
		}
	    }
	}
    }

    public static SubLObject do_problem_store_historical_root_problems(final SubLObject macroform, final SubLObject environment) {
	SubLObject current;
	final SubLObject datum = current = macroform.rest();
	destructuring_bind_must_consp(current, datum, $list261);
	final SubLObject temp = current.rest();
	current = current.first();
	SubLObject problem_var = NIL;
	SubLObject store = NIL;
	destructuring_bind_must_consp(current, datum, $list261);
	problem_var = current.first();
	current = current.rest();
	destructuring_bind_must_consp(current, datum, $list261);
	store = current.first();
	current = current.rest();
	SubLObject allow_other_keys_p = NIL;
	SubLObject rest = current;
	SubLObject bad = NIL;
	SubLObject current_$12 = NIL;
	while (NIL != rest) {
	    destructuring_bind_must_consp(rest, datum, $list261);
	    current_$12 = rest.first();
	    rest = rest.rest();
	    destructuring_bind_must_consp(rest, datum, $list261);
	    if (NIL == member(current_$12, $list2, UNPROVIDED, UNPROVIDED)) {
		bad = T;
	    }
	    if (current_$12 == $ALLOW_OTHER_KEYS) {
		allow_other_keys_p = rest.first();
	    }
	    rest = rest.rest();
	}
	if ((NIL != bad) && (NIL == allow_other_keys_p)) {
	    cdestructuring_bind_error(datum, $list261);
	}
	final SubLObject done_tail = property_list_member($DONE, current);
	final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
	final SubLObject body;
	current = body = temp;
	return listS(DO_SET, list(problem_var, list(inference_datastructures_problem_store.PROBLEM_STORE_HISTORICAL_ROOT_PROBLEMS, store), $DONE, done), append(body, NIL));
    }

    public static final SubLObject problem_store_historical_root_problems_alt(SubLObject store) {
	return prob_store_historical_root_problems(store);
    }

    public static SubLObject problem_store_historical_root_problems(final SubLObject store) {
	return inference_datastructures_problem_store.prob_store_historical_root_problems(store);
    }

    public static final SubLObject do_inference_strategies_alt(SubLObject macroform, SubLObject environment) {
	{
	    SubLObject datum = macroform.rest();
	    SubLObject current = datum;
	    destructuring_bind_must_consp(current, datum, $list_alt246);
	    {
		SubLObject temp = current.rest();
		current = current.first();
		{
		    SubLObject strategy_var = NIL;
		    SubLObject inference = NIL;
		    destructuring_bind_must_consp(current, datum, $list_alt246);
		    strategy_var = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt246);
		    inference = current.first();
		    current = current.rest();
		    {
			SubLObject allow_other_keys_p = NIL;
			SubLObject rest = current;
			SubLObject bad = NIL;
			SubLObject current_9 = NIL;
			for (; NIL != rest;) {
			    destructuring_bind_must_consp(rest, datum, $list_alt246);
			    current_9 = rest.first();
			    rest = rest.rest();
			    destructuring_bind_must_consp(rest, datum, $list_alt246);
			    if (NIL == member(current_9, $list_alt2, UNPROVIDED, UNPROVIDED)) {
				bad = T;
			    }
			    if (current_9 == $ALLOW_OTHER_KEYS) {
				allow_other_keys_p = rest.first();
			    }
			    rest = rest.rest();
			}
			if ((NIL != bad) && (NIL == allow_other_keys_p)) {
			    cdestructuring_bind_error(datum, $list_alt246);
			}
			{
			    SubLObject done_tail = property_list_member($DONE, current);
			    SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
			    current = temp;
			    {
				SubLObject body = current;
				SubLObject inference_var = $sym247$INFERENCE_VAR;
				return list(CLET, list(list(inference_var, inference)), listS(DO_SET, list(strategy_var, list(INFERENCE_STRATEGY_SET, inference_var), $DONE, done), append(body, NIL)));
			    }
			}
		    }
		}
	    }
	}
    }

    public static SubLObject do_inference_strategies(final SubLObject macroform, final SubLObject environment) {
	SubLObject current;
	final SubLObject datum = current = macroform.rest();
	destructuring_bind_must_consp(current, datum, $list265);
	final SubLObject temp = current.rest();
	current = current.first();
	SubLObject strategy_var = NIL;
	SubLObject inference = NIL;
	destructuring_bind_must_consp(current, datum, $list265);
	strategy_var = current.first();
	current = current.rest();
	destructuring_bind_must_consp(current, datum, $list265);
	inference = current.first();
	current = current.rest();
	SubLObject allow_other_keys_p = NIL;
	SubLObject rest = current;
	SubLObject bad = NIL;
	SubLObject current_$13 = NIL;
	while (NIL != rest) {
	    destructuring_bind_must_consp(rest, datum, $list265);
	    current_$13 = rest.first();
	    rest = rest.rest();
	    destructuring_bind_must_consp(rest, datum, $list265);
	    if (NIL == member(current_$13, $list2, UNPROVIDED, UNPROVIDED)) {
		bad = T;
	    }
	    if (current_$13 == $ALLOW_OTHER_KEYS) {
		allow_other_keys_p = rest.first();
	    }
	    rest = rest.rest();
	}
	if ((NIL != bad) && (NIL == allow_other_keys_p)) {
	    cdestructuring_bind_error(datum, $list265);
	}
	final SubLObject done_tail = property_list_member($DONE, current);
	final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
	final SubLObject body;
	current = body = temp;
	final SubLObject inference_var = $sym266$INFERENCE_VAR;
	return list(CLET, list(list(inference_var, inference)), listS(DO_SET, list(strategy_var, list(inference_datastructures_problem_store.INFERENCE_STRATEGY_SET, inference_var), $DONE, done), append(body, NIL)));
    }

    /**
     * Allocates a new problem-store object and sets up its internal datastructures.
     */
    @LispMethod(comment = "Allocates a new problem-store object and sets up its internal datastructures.")
    public static final SubLObject new_problem_store_alt(SubLObject problem_store_properties) {
	if (problem_store_properties == UNPROVIDED) {
	    problem_store_properties = NIL;
	}
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    SubLTrampolineFile.checkType(problem_store_properties, PROBLEM_STORE_PROPERTIES_P);
	    {
		SubLObject name = inference_datastructures_enumerated_types.problem_store_properties_name(problem_store_properties);
		SubLTrampolineFile.checkType(name, PROBLEM_STORE_NAME_P);
		if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
		    if (NIL != find_problem_store_by_name(name)) {
			Errors.error($str_alt253$A_problem_store_named__s_already_, name);
		    }
		}
	    }
	    {
		SubLObject store = make_problem_store(UNPROVIDED);
		SubLObject suid = new_problem_store_id();
		SubLObject guid = NIL;
		inference_metrics.increment_problem_store_historical_count();
		_csetf_prob_store_guid(store, guid);
		_csetf_prob_store_suid(store, suid);
		index_problem_store_by_id(store, suid);
		_csetf_prob_store_lock(store, make_lock($$$Problem_Store_Lock));
		_csetf_prob_store_creation_time(store, get_universal_time());
		_csetf_prob_store_preparedP(store, NIL);
		_csetf_prob_store_problem_id_index(store, new_id_index($default_problem_store_problem_size$.getGlobalValue(), ZERO_INTEGER));
		_csetf_prob_store_inference_id_index(store, new_id_index($default_problem_store_inference_size$.getGlobalValue(), ZERO_INTEGER));
		_csetf_prob_store_strategy_id_index(store, new_id_index($default_problem_store_strategy_size$.getGlobalValue(), ZERO_INTEGER));
		_csetf_prob_store_link_id_index(store, new_id_index($default_problem_store_link_size$.getGlobalValue(), ZERO_INTEGER));
		_csetf_prob_store_proof_id_index(store, new_id_index($default_problem_store_proof_size$.getGlobalValue(), ZERO_INTEGER));
		_csetf_prob_store_rejected_proofs(store, dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
		_csetf_prob_store_processed_proofs(store, set.new_set(symbol_function(EQ), UNPROVIDED));
		_csetf_prob_store_non_explanatory_subproofs_possibleP(store, NIL);
		_csetf_prob_store_non_explanatory_subproofs_index(store, dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
		_csetf_prob_store_most_recent_tactic_executed(store, NIL);
		_csetf_prob_store_min_proof_depth_index(store, dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
		_csetf_prob_store_min_transformation_depth_index(store, dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
		_csetf_prob_store_min_transformation_depth_signature_index(store, dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
		_csetf_prob_store_min_depth_index(store, make_hash_table(ONE_INTEGER, symbol_function(EQ), UNPROVIDED));
		{
		    SubLObject name = inference_datastructures_enumerated_types.problem_store_properties_name(problem_store_properties);
		    set_problem_store_name(store, name);
		    {
			SubLObject equality_reasoning_method = inference_datastructures_enumerated_types.problem_store_properties_equality_reasoning_method(problem_store_properties);
			SubLTrampolineFile.checkType(equality_reasoning_method, PROBLEM_STORE_EQUALITY_REASONING_METHOD_P);
			_csetf_prob_store_equality_reasoning_method(store, equality_reasoning_method);
		    }
		    {
			SubLObject equality_reasoning_domain = inference_datastructures_enumerated_types.problem_store_properties_equality_reasoning_domain(problem_store_properties);
			SubLTrampolineFile.checkType(equality_reasoning_domain, PROBLEM_STORE_EQUALITY_REASONING_DOMAIN_P);
			_csetf_prob_store_equality_reasoning_domain(store, equality_reasoning_domain);
			if ($NONE == equality_reasoning_domain) {
			    _csetf_prob_store_problem_by_query_index(store, $EMPTY_DOMAIN);
			} else {
			    _csetf_prob_store_problem_by_query_index(store, make_hash_table($default_problem_store_problem_size$.getGlobalValue(), symbol_function(EQUAL), UNPROVIDED));
			}
		    }
		    {
			SubLObject intermediate_step_validation_level = inference_datastructures_enumerated_types.problem_store_properties_intermediate_step_validation_level(problem_store_properties);
			SubLTrampolineFile.checkType(intermediate_step_validation_level, INTERMEDIATE_STEP_VALIDATION_LEVEL_P);
			_csetf_prob_store_intermediate_step_validation_level(store, intermediate_step_validation_level);
		    }
		    {
			SubLObject max_problem_count = inference_datastructures_enumerated_types.problem_store_properties_max_problem_count(problem_store_properties);
			SubLTrampolineFile.checkType(max_problem_count, MAX_PROBLEM_COUNT_P);
			_csetf_prob_store_max_problem_count(store, max_problem_count);
			{
			    SubLObject crazy_max_problem_count = compute_crazy_max_problem_count(max_problem_count);
			    SubLTrampolineFile.checkType(crazy_max_problem_count, MAX_PROBLEM_COUNT_P);
			    _csetf_prob_store_crazy_max_problem_count(store, crazy_max_problem_count);
			}
		    }
		    {
			SubLObject removal_allowedP = inference_datastructures_enumerated_types.removal_allowed_by_propertiesP(problem_store_properties);
			SubLTrampolineFile.checkType(removal_allowedP, BOOLEANP);
			_csetf_prob_store_removal_allowedP(store, removal_allowedP);
		    }
		    {
			SubLObject transformation_allowedP = inference_datastructures_enumerated_types.transformation_allowed_by_propertiesP(problem_store_properties);
			SubLTrampolineFile.checkType(transformation_allowedP, BOOLEANP);
			_csetf_prob_store_transformation_allowedP(store, transformation_allowedP);
		    }
		    {
			SubLObject add_restriction_layer_of_indirectionP = inference_datastructures_enumerated_types.problem_store_properties_add_restriction_layer_of_indirectionP(problem_store_properties);
			SubLTrampolineFile.checkType(add_restriction_layer_of_indirectionP, BOOLEANP);
			_csetf_prob_store_add_restriction_layer_of_indirectionP(store, add_restriction_layer_of_indirectionP);
		    }
		    {
			SubLObject negation_by_failureP = inference_datastructures_enumerated_types.problem_store_properties_negation_by_failureP(problem_store_properties);
			SubLTrampolineFile.checkType(negation_by_failureP, BOOLEANP);
			_csetf_prob_store_negation_by_failureP(store, negation_by_failureP);
		    }
		    {
			SubLObject completeness_minimization_allowedP = inference_datastructures_enumerated_types.problem_store_properties_completeness_minimization_allowedP(problem_store_properties);
			SubLTrampolineFile.checkType(completeness_minimization_allowedP, BOOLEANP);
			_csetf_prob_store_completeness_minimization_allowedP(store, completeness_minimization_allowedP);
		    }
		    {
			SubLObject direction = inference_datastructures_enumerated_types.problem_store_properties_direction(problem_store_properties);
			SubLTrampolineFile.checkType(direction, INFERENCE_DIRECTION_P);
			_csetf_prob_store_direction(store, direction);
		    }
		    {
			SubLObject evaluate_subl_allowedP = inference_datastructures_enumerated_types.problem_store_properties_evaluate_subl_allowedP(problem_store_properties);
			SubLTrampolineFile.checkType(evaluate_subl_allowedP, BOOLEANP);
			_csetf_prob_store_evaluate_subl_allowedP(store, evaluate_subl_allowedP);
		    }
		    {
			SubLObject rewrite_allowedP = inference_datastructures_enumerated_types.problem_store_properties_rewrite_allowedP(problem_store_properties);
			SubLTrampolineFile.checkType(rewrite_allowedP, BOOLEANP);
			_csetf_prob_store_rewrite_allowedP(store, rewrite_allowedP);
		    }
		    {
			SubLObject abduction_allowedP = inference_datastructures_enumerated_types.problem_store_properties_abduction_allowedP(problem_store_properties);
			SubLTrampolineFile.checkType(abduction_allowedP, BOOLEANP);
			_csetf_prob_store_abduction_allowedP(store, abduction_allowedP);
		    }
		    {
			SubLObject new_terms_allowedP = inference_datastructures_enumerated_types.problem_store_properties_new_terms_allowedP(problem_store_properties);
			SubLTrampolineFile.checkType(new_terms_allowedP, BOOLEANP);
			_csetf_prob_store_new_terms_allowedP(store, new_terms_allowedP);
		    }
		    {
			SubLObject compute_answer_justificationsP = inference_datastructures_enumerated_types.problem_store_properties_compute_answer_justificationsP(problem_store_properties);
			SubLTrampolineFile.checkType(compute_answer_justificationsP, BOOLEANP);
			_csetf_prob_store_compute_answer_justificationsP(store, compute_answer_justificationsP);
		    }
		}
		_csetf_prob_store_memoization_state(store, memoization_state.new_memoization_state($$$problem_store_memoization_state, ReadWriteLocks.new_rw_lock($$$problem_store_memoization_lock), UNPROVIDED, UNPROVIDED));
		set_problem_store_sbhl_resource_space(store, sbhl_marking_vars.new_sbhl_marking_space_resource($problem_store_sbhl_resource_space_number$.getGlobalValue()));
		_csetf_prob_store_destruction_imminentP(store, NIL);
		_csetf_prob_store_meta_problem_store(store, NIL);
		_csetf_prob_store_static_properties(store, copy_list(problem_store_properties));
		_csetf_prob_store_janitor(store, new_problem_store_janitor(store));
		_csetf_prob_store_historical_root_problems(store, set.new_set(symbol_function(EQ), UNPROVIDED));
		_csetf_prob_store_historical_tactic_count(store, ZERO_INTEGER);
		_csetf_prob_store_complex_problem_query_czer_index(store, dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED));
		_csetf_prob_store_complex_problem_query_signatures(store, dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
		_csetf_prob_store_proof_keeping_index(store, make_hash_table(ZERO_INTEGER, symbol_function(EQ), UNPROVIDED));
		return store;
	    }
	}
    }

    /**
     * Allocates a new problem-store object and sets up its internal datastructures.
     */
    @LispMethod(comment = "Allocates a new problem-store object and sets up its internal datastructures.")
    public static SubLObject new_problem_store(SubLObject problem_store_properties) {
	if (problem_store_properties == UNPROVIDED) {
	    problem_store_properties = NIL;
	}
	final SubLThread thread = SubLProcess.currentSubLThread();
	assert NIL != inference_datastructures_enumerated_types.problem_store_properties_p(problem_store_properties) : "! inference_datastructures_enumerated_types.problem_store_properties_p(problem_store_properties) "
		+ ("inference_datastructures_enumerated_types.problem_store_properties_p(problem_store_properties) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.problem_store_properties_p(problem_store_properties) ") + problem_store_properties;
	final SubLObject name = inference_datastructures_enumerated_types.problem_store_properties_name(problem_store_properties);
	assert NIL != inference_datastructures_enumerated_types.problem_store_name_p(name) : "! inference_datastructures_enumerated_types.problem_store_name_p(name) "
		+ ("inference_datastructures_enumerated_types.problem_store_name_p(name) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.problem_store_name_p(name) ") + name;
	if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != inference_datastructures_problem_store.find_problem_store_by_name(name))) {
	    Errors.error($str272$A_problem_store_named__s_already_, name);
	}
	final SubLObject store = inference_datastructures_problem_store.make_problem_store(UNPROVIDED);
	final SubLObject suid = inference_datastructures_problem_store.new_problem_store_id();
	final SubLObject guid = NIL;
	inference_metrics.increment_problem_store_historical_count();
	inference_datastructures_problem_store._csetf_prob_store_guid(store, guid);
	inference_datastructures_problem_store._csetf_prob_store_suid(store, suid);
	inference_datastructures_problem_store.index_problem_store_by_id(store, suid);
	inference_datastructures_problem_store._csetf_prob_store_lock(store, make_lock($$$Problem_Store_Lock));
	inference_datastructures_problem_store._csetf_prob_store_creation_time(store, get_universal_time());
	inference_datastructures_problem_store._csetf_prob_store_preparedP(store, NIL);
	inference_datastructures_problem_store._csetf_prob_store_problem_id_index(store, new_id_index($default_problem_store_problem_size$.getGlobalValue(), ZERO_INTEGER));
	inference_datastructures_problem_store._csetf_prob_store_inference_id_index(store, new_id_index($default_problem_store_inference_size$.getGlobalValue(), ZERO_INTEGER));
	inference_datastructures_problem_store._csetf_prob_store_strategy_id_index(store, new_id_index($default_problem_store_strategy_size$.getGlobalValue(), ZERO_INTEGER));
	inference_datastructures_problem_store._csetf_prob_store_link_id_index(store, new_id_index($default_problem_store_link_size$.getGlobalValue(), ZERO_INTEGER));
	inference_datastructures_problem_store._csetf_prob_store_proof_id_index(store, new_id_index($default_problem_store_proof_size$.getGlobalValue(), ZERO_INTEGER));
	inference_datastructures_problem_store._csetf_prob_store_rejected_proofs(store, dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
	inference_datastructures_problem_store._csetf_prob_store_processed_proofs(store, set.new_set(symbol_function(EQ), UNPROVIDED));
	inference_datastructures_problem_store._csetf_prob_store_potentially_processed_problems(store, set.new_set(symbol_function(EQ), UNPROVIDED));
	inference_datastructures_problem_store._csetf_prob_store_non_explanatory_subproofs_possibleP(store, NIL);
	inference_datastructures_problem_store._csetf_prob_store_non_explanatory_subproofs_index(store, dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
	inference_datastructures_problem_store._csetf_prob_store_most_recent_tactic_executed(store, NIL);
	inference_datastructures_problem_store._csetf_prob_store_min_proof_depth_index(store, dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
	inference_datastructures_problem_store._csetf_prob_store_min_transformation_depth_index(store, dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
	inference_datastructures_problem_store._csetf_prob_store_min_transformation_depth_signature_index(store, dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
	inference_datastructures_problem_store._csetf_prob_store_min_depth_index(store, make_hash_table(ONE_INTEGER, symbol_function(EQ), UNPROVIDED));
	final SubLObject name2 = inference_datastructures_enumerated_types.problem_store_properties_name(problem_store_properties);
	inference_datastructures_problem_store.set_problem_store_name(store, name2);
	final SubLObject equality_reasoning_method = inference_datastructures_enumerated_types.problem_store_properties_equality_reasoning_method(problem_store_properties);
	assert NIL != inference_datastructures_enumerated_types.problem_store_equality_reasoning_method_p(equality_reasoning_method) : "! inference_datastructures_enumerated_types.problem_store_equality_reasoning_method_p(equality_reasoning_method) "
		+ ("inference_datastructures_enumerated_types.problem_store_equality_reasoning_method_p(equality_reasoning_method) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.problem_store_equality_reasoning_method_p(equality_reasoning_method) ") + equality_reasoning_method;
	inference_datastructures_problem_store._csetf_prob_store_equality_reasoning_method(store, equality_reasoning_method);
	final SubLObject equality_reasoning_domain = inference_datastructures_enumerated_types.problem_store_properties_equality_reasoning_domain(problem_store_properties);
	assert NIL != inference_datastructures_enumerated_types.problem_store_equality_reasoning_domain_p(equality_reasoning_domain) : "! inference_datastructures_enumerated_types.problem_store_equality_reasoning_domain_p(equality_reasoning_domain) "
		+ ("inference_datastructures_enumerated_types.problem_store_equality_reasoning_domain_p(equality_reasoning_domain) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.problem_store_equality_reasoning_domain_p(equality_reasoning_domain) ") + equality_reasoning_domain;
	inference_datastructures_problem_store._csetf_prob_store_equality_reasoning_domain(store, equality_reasoning_domain);
	if ($NONE == equality_reasoning_domain) {
	    inference_datastructures_problem_store._csetf_prob_store_problems_by_query_index(store, $EMPTY_DOMAIN);
	} else {
	    inference_datastructures_problem_store._csetf_prob_store_problems_by_query_index(store, make_hash_table($default_problem_store_problem_size$.getGlobalValue(), symbol_function(EQUAL), UNPROVIDED));
	}
	final SubLObject intermediate_step_validation_level = inference_datastructures_enumerated_types.problem_store_properties_intermediate_step_validation_level(problem_store_properties);
	assert NIL != inference_datastructures_enumerated_types.intermediate_step_validation_level_p(intermediate_step_validation_level) : "! inference_datastructures_enumerated_types.intermediate_step_validation_level_p(intermediate_step_validation_level) "
		+ ("inference_datastructures_enumerated_types.intermediate_step_validation_level_p(intermediate_step_validation_level) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.intermediate_step_validation_level_p(intermediate_step_validation_level) ")
		+ intermediate_step_validation_level;
	inference_datastructures_problem_store._csetf_prob_store_intermediate_step_validation_level(store, intermediate_step_validation_level);
	final SubLObject max_problem_count = inference_datastructures_enumerated_types.problem_store_properties_max_problem_count(problem_store_properties);
	assert NIL != inference_datastructures_enumerated_types.max_problem_count_p(max_problem_count) : "! inference_datastructures_enumerated_types.max_problem_count_p(max_problem_count) "
		+ ("inference_datastructures_enumerated_types.max_problem_count_p(max_problem_count) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.max_problem_count_p(max_problem_count) ") + max_problem_count;
	inference_datastructures_problem_store._csetf_prob_store_max_problem_count(store, max_problem_count);
	final SubLObject crazy_max_problem_count = inference_datastructures_problem_store.compute_crazy_max_problem_count(max_problem_count);
	assert NIL != inference_datastructures_enumerated_types.max_problem_count_p(crazy_max_problem_count) : "! inference_datastructures_enumerated_types.max_problem_count_p(crazy_max_problem_count) "
		+ ("inference_datastructures_enumerated_types.max_problem_count_p(crazy_max_problem_count) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.max_problem_count_p(crazy_max_problem_count) ") + crazy_max_problem_count;
	inference_datastructures_problem_store._csetf_prob_store_crazy_max_problem_count(store, crazy_max_problem_count);
	final SubLObject removal_allowedP = inference_datastructures_enumerated_types.removal_allowed_by_propertiesP(problem_store_properties);
	assert NIL != booleanp(removal_allowedP) : "! booleanp(removal_allowedP) " + ("Types.booleanp(removal_allowedP) " + "CommonSymbols.NIL != Types.booleanp(removal_allowedP) ") + removal_allowedP;
	inference_datastructures_problem_store._csetf_prob_store_removal_allowedP(store, removal_allowedP);
	final SubLObject transformation_allowedP = inference_datastructures_enumerated_types.transformation_allowed_by_propertiesP(problem_store_properties);
	assert NIL != booleanp(transformation_allowedP) : "! booleanp(transformation_allowedP) " + ("Types.booleanp(transformation_allowedP) " + "CommonSymbols.NIL != Types.booleanp(transformation_allowedP) ") + transformation_allowedP;
	inference_datastructures_problem_store._csetf_prob_store_transformation_allowedP(store, transformation_allowedP);
	final SubLObject add_restriction_layer_of_indirectionP = inference_datastructures_enumerated_types.problem_store_properties_add_restriction_layer_of_indirectionP(problem_store_properties);
	assert NIL != booleanp(add_restriction_layer_of_indirectionP) : "! booleanp(add_restriction_layer_of_indirectionP) " + ("Types.booleanp(add_restriction_layer_of_indirectionP) " + "CommonSymbols.NIL != Types.booleanp(add_restriction_layer_of_indirectionP) ")
		+ add_restriction_layer_of_indirectionP;
	inference_datastructures_problem_store._csetf_prob_store_add_restriction_layer_of_indirectionP(store, add_restriction_layer_of_indirectionP);
	final SubLObject negation_by_failureP = inference_datastructures_enumerated_types.problem_store_properties_negation_by_failureP(problem_store_properties);
	assert NIL != booleanp(negation_by_failureP) : "! booleanp(negation_by_failureP) " + ("Types.booleanp(negation_by_failureP) " + "CommonSymbols.NIL != Types.booleanp(negation_by_failureP) ") + negation_by_failureP;
	inference_datastructures_problem_store._csetf_prob_store_negation_by_failureP(store, negation_by_failureP);
	final SubLObject completeness_minimization_allowedP = inference_datastructures_enumerated_types.problem_store_properties_completeness_minimization_allowedP(problem_store_properties);
	assert NIL != booleanp(completeness_minimization_allowedP) : "! booleanp(completeness_minimization_allowedP) " + ("Types.booleanp(completeness_minimization_allowedP) " + "CommonSymbols.NIL != Types.booleanp(completeness_minimization_allowedP) ") + completeness_minimization_allowedP;
	inference_datastructures_problem_store._csetf_prob_store_completeness_minimization_allowedP(store, completeness_minimization_allowedP);
	final SubLObject direction = inference_datastructures_enumerated_types.problem_store_properties_direction(problem_store_properties);
	assert NIL != inference_datastructures_enumerated_types.inference_direction_p(direction) : "! inference_datastructures_enumerated_types.inference_direction_p(direction) "
		+ ("inference_datastructures_enumerated_types.inference_direction_p(direction) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.inference_direction_p(direction) ") + direction;
	inference_datastructures_problem_store._csetf_prob_store_direction(store, direction);
	final SubLObject evaluate_subl_allowedP = inference_datastructures_enumerated_types.problem_store_properties_evaluate_subl_allowedP(problem_store_properties);
	assert NIL != booleanp(evaluate_subl_allowedP) : "! booleanp(evaluate_subl_allowedP) " + ("Types.booleanp(evaluate_subl_allowedP) " + "CommonSymbols.NIL != Types.booleanp(evaluate_subl_allowedP) ") + evaluate_subl_allowedP;
	inference_datastructures_problem_store._csetf_prob_store_evaluate_subl_allowedP(store, evaluate_subl_allowedP);
	final SubLObject rewrite_allowedP = inference_datastructures_enumerated_types.problem_store_properties_rewrite_allowedP(problem_store_properties);
	assert NIL != booleanp(rewrite_allowedP) : "! booleanp(rewrite_allowedP) " + ("Types.booleanp(rewrite_allowedP) " + "CommonSymbols.NIL != Types.booleanp(rewrite_allowedP) ") + rewrite_allowedP;
	inference_datastructures_problem_store._csetf_prob_store_rewrite_allowedP(store, rewrite_allowedP);
	final SubLObject abduction_allowedP = inference_datastructures_enumerated_types.problem_store_properties_abduction_allowedP(problem_store_properties);
	assert NIL != booleanp(abduction_allowedP) : "! booleanp(abduction_allowedP) " + ("Types.booleanp(abduction_allowedP) " + "CommonSymbols.NIL != Types.booleanp(abduction_allowedP) ") + abduction_allowedP;
	inference_datastructures_problem_store._csetf_prob_store_abduction_allowedP(store, abduction_allowedP);
	final SubLObject new_terms_allowedP = inference_datastructures_enumerated_types.problem_store_properties_new_terms_allowedP(problem_store_properties);
	assert NIL != booleanp(new_terms_allowedP) : "! booleanp(new_terms_allowedP) " + ("Types.booleanp(new_terms_allowedP) " + "CommonSymbols.NIL != Types.booleanp(new_terms_allowedP) ") + new_terms_allowedP;
	inference_datastructures_problem_store._csetf_prob_store_new_terms_allowedP(store, new_terms_allowedP);
	final SubLObject compute_answer_justificationsP = inference_datastructures_enumerated_types.problem_store_properties_compute_answer_justificationsP(problem_store_properties);
	assert NIL != booleanp(compute_answer_justificationsP) : "! booleanp(compute_answer_justificationsP) " + ("Types.booleanp(compute_answer_justificationsP) " + "CommonSymbols.NIL != Types.booleanp(compute_answer_justificationsP) ") + compute_answer_justificationsP;
	inference_datastructures_problem_store._csetf_prob_store_compute_answer_justificationsP(store, compute_answer_justificationsP);
	inference_datastructures_problem_store._csetf_prob_store_memoization_state(store, memoization_state.new_memoization_state($$$problem_store_memoization_state, ReadWriteLocks.new_rw_lock($$$problem_store_memoization_lock), UNPROVIDED, UNPROVIDED));
	inference_datastructures_problem_store.set_problem_store_sbhl_resource_space(store, sbhl_marking_vars.new_sbhl_marking_space_resource($problem_store_sbhl_resource_space_number$.getGlobalValue()));
	inference_datastructures_problem_store._csetf_prob_store_destruction_imminentP(store, NIL);
	inference_datastructures_problem_store._csetf_prob_store_meta_problem_store(store, NIL);
	inference_datastructures_problem_store._csetf_prob_store_static_properties(store, copy_list(problem_store_properties));
	inference_datastructures_problem_store._csetf_prob_store_janitor(store, inference_datastructures_problem_store.new_problem_store_janitor(store));
	inference_datastructures_problem_store._csetf_prob_store_historical_root_problems(store, set.new_set(symbol_function(EQ), UNPROVIDED));
	inference_datastructures_problem_store._csetf_prob_store_historical_tactic_count(store, ZERO_INTEGER);
	inference_datastructures_problem_store._csetf_prob_store_complex_problem_query_czer_index(store, dictionary.new_dictionary(symbol_function(EQUAL), UNPROVIDED));
	inference_datastructures_problem_store._csetf_prob_store_complex_problem_query_signatures(store, dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED));
	inference_datastructures_problem_store._csetf_prob_store_proof_keeping_index(store, make_hash_table(ZERO_INTEGER, symbol_function(EQ), UNPROVIDED));
	return store;
    }

    public static final SubLObject destroy_problem_store_alt(SubLObject store) {
	if (NIL != valid_problem_store_p(store)) {
	    try {
		destroy_problem_store_int(store);
	    } finally {
		{
		    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
		    try {
			bind($is_thread_performing_cleanupP$, T);
			unindex_problem_store_by_id(store);
			_csetf_prob_store_lock(store, $FREE);
		    } finally {
			rebind($is_thread_performing_cleanupP$, _prev_bind_0);
		    }
		}
	    }
	}
	return NIL;
    }

    public static SubLObject destroy_problem_store(final SubLObject store) {
	if (NIL != inference_datastructures_problem_store.valid_problem_store_p(store)) {
	    final SubLObject running_inferences = inference_datastructures_problem_store.problem_store_running_inferences(store);
	    if (NIL != running_inferences) {
		SubLObject cdolist_list_var = running_inferences;
		SubLObject running_inference = NIL;
		running_inference = cdolist_list_var.first();
		while (NIL != cdolist_list_var) {
		    Errors.warn($str284$Destroying_problem_store__S_at_le, store, running_inference);
		    cdolist_list_var = cdolist_list_var.rest();
		    running_inference = cdolist_list_var.first();
		}
	    }
	    try {
		inference_datastructures_problem_store.destroy_problem_store_int(store);
		final SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
		try {
		    bind($is_thread_performing_cleanupP$, T);
		    final SubLObject _values = getValuesAsVector();
		    inference_datastructures_problem_store.unindex_problem_store_by_id(store);
		    inference_datastructures_problem_store._csetf_prob_store_lock(store, $FREE);
		    restoreValuesFromVector(_values);
		} finally {
		    rebind($is_thread_performing_cleanupP$, _prev_bind_0);
		}
	    } finally {
		final SubLObject _prev_bind_2 = currentBinding($is_thread_performing_cleanupP$);
		try {
		    bind($is_thread_performing_cleanupP$, T);
		    final SubLObject _values2 = getValuesAsVector();
		    inference_datastructures_problem_store.unindex_problem_store_by_id(store);
		    inference_datastructures_problem_store._csetf_prob_store_lock(store, $FREE);
		    restoreValuesFromVector(_values2);
		} finally {
		    rebind($is_thread_performing_cleanupP$, _prev_bind_2);
		}
	    }
	}
	return NIL;
    }

    public static final SubLObject destroy_problem_store_int_alt(SubLObject store) {
	inference_metrics.update_maximum_problem_store_historical_problem_count(store);
	note_problem_store_invalid(store);
	{
	    SubLObject meta_problem_store = prob_store_meta_problem_store(store);
	    if (NIL != problem_store_p(meta_problem_store)) {
		destroy_problem_store(meta_problem_store);
	    }
	    _csetf_prob_store_meta_problem_store(store, $FREE);
	}
	destroy_problem_store_janitor(prob_store_janitor(store));
	_csetf_prob_store_janitor(store, $FREE);
	free_problem_store_name(store);
	_csetf_prob_store_equality_reasoning_method(store, $FREE);
	_csetf_prob_store_intermediate_step_validation_level(store, $FREE);
	_csetf_prob_store_max_problem_count(store, $FREE);
	_csetf_prob_store_crazy_max_problem_count(store, $FREE);
	_csetf_prob_store_removal_allowedP(store, $FREE);
	_csetf_prob_store_transformation_allowedP(store, $FREE);
	_csetf_prob_store_add_restriction_layer_of_indirectionP(store, $FREE);
	_csetf_prob_store_negation_by_failureP(store, $FREE);
	_csetf_prob_store_completeness_minimization_allowedP(store, $FREE);
	_csetf_prob_store_direction(store, $FREE);
	_csetf_prob_store_evaluate_subl_allowedP(store, $FREE);
	_csetf_prob_store_rewrite_allowedP(store, $FREE);
	_csetf_prob_store_abduction_allowedP(store, $FREE);
	_csetf_prob_store_new_terms_allowedP(store, $FREE);
	_csetf_prob_store_compute_answer_justificationsP(store, $FREE);
	_csetf_prob_store_preparedP(store, $FREE);
	_csetf_prob_store_destruction_imminentP(store, $FREE);
	_csetf_prob_store_static_properties(store, $FREE);
	clear_problem_store_proof_keeping_problems(store);
	_csetf_prob_store_proof_keeping_index(store, $FREE);
	dictionary.clear_dictionary(prob_store_complex_problem_query_signatures(store));
	_csetf_prob_store_complex_problem_query_signatures(store, $FREE);
	dictionary.clear_dictionary(prob_store_complex_problem_query_czer_index(store));
	_csetf_prob_store_complex_problem_query_czer_index(store, $FREE);
	set.clear_set(prob_store_historical_root_problems(store));
	_csetf_prob_store_historical_root_problems(store, $FREE);
	_csetf_prob_store_sbhl_resource_space(store, $FREE);
	memoization_state.clear_all_memoization(problem_store_memoization_state(store));
	_csetf_prob_store_memoization_state(store, $FREE);
	clrhash(prob_store_min_depth_index(store));
	_csetf_prob_store_min_depth_index(store, $FREE);
	dictionary.clear_dictionary(prob_store_min_transformation_depth_index(store));
	_csetf_prob_store_min_transformation_depth_index(store, $FREE);
	dictionary.clear_dictionary(prob_store_min_transformation_depth_signature_index(store));
	_csetf_prob_store_min_transformation_depth_signature_index(store, $FREE);
	dictionary.clear_dictionary(prob_store_min_proof_depth_index(store));
	_csetf_prob_store_min_proof_depth_index(store, $FREE);
	if (prob_store_problem_by_query_index(store).isHashtable()) {
	    clrhash(prob_store_problem_by_query_index(store));
	}
	_csetf_prob_store_problem_by_query_index(store, $FREE);
	{
	    SubLObject idx = problem_store_inference_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject inference = NIL;
		    while (NIL != id) {
			inference = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, inference, $SKIP)) {
			    inference_datastructures_inference.destroy_problem_store_inference(inference);
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    clear_id_index(prob_store_inference_id_index(store));
	    _csetf_prob_store_inference_id_index(store, $FREE);
	}
	{
	    SubLObject idx = problem_store_strategy_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject strategy = NIL;
		    while (NIL != id) {
			strategy = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, strategy, $SKIP)) {
			    inference_datastructures_strategy.destroy_problem_store_strategy(strategy);
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    clear_id_index(prob_store_strategy_id_index(store));
	    _csetf_prob_store_strategy_id_index(store, $FREE);
	}
	dictionary.clear_dictionary(prob_store_rejected_proofs(store));
	_csetf_prob_store_rejected_proofs(store, $FREE);
	set.clear_set(prob_store_processed_proofs(store));
	_csetf_prob_store_processed_proofs(store, $FREE);
	_csetf_prob_store_non_explanatory_subproofs_possibleP(store, $FREE);
	dictionary.clear_dictionary(prob_store_non_explanatory_subproofs_index(store));
	_csetf_prob_store_non_explanatory_subproofs_index(store, $FREE);
	_csetf_prob_store_most_recent_tactic_executed(store, $FREE);
	{
	    SubLObject idx = problem_store_proof_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject proof = NIL;
		    while (NIL != id) {
			proof = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, proof, $SKIP)) {
			    inference_datastructures_proof.destroy_problem_store_proof(proof);
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    clear_id_index(prob_store_proof_id_index(store));
	    _csetf_prob_store_proof_id_index(store, $FREE);
	}
	{
	    SubLObject idx = problem_store_link_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject link = NIL;
		    while (NIL != id) {
			link = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, link, $SKIP)) {
			    inference_datastructures_problem_link.destroy_problem_store_link(link);
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    clear_id_index(prob_store_link_id_index(store));
	    _csetf_prob_store_link_id_index(store, $FREE);
	}
	{
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    inference_datastructures_problem.destroy_problem_store_problem(problem);
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    clear_id_index(prob_store_problem_id_index(store));
	    _csetf_prob_store_problem_id_index(store, $FREE);
	}
	return NIL;
    }

    public static SubLObject destroy_problem_store_int(final SubLObject store) {
	inference_metrics.update_maximum_problem_store_historical_problem_count(store);
	inference_datastructures_problem_store.note_problem_store_invalid(store);
	final SubLObject meta_problem_store = inference_datastructures_problem_store.prob_store_meta_problem_store(store);
	if (NIL != inference_datastructures_problem_store.problem_store_p(meta_problem_store)) {
	    inference_datastructures_problem_store.destroy_problem_store(meta_problem_store);
	}
	inference_datastructures_problem_store._csetf_prob_store_meta_problem_store(store, $FREE);
	inference_datastructures_problem_store.destroy_problem_store_janitor(inference_datastructures_problem_store.prob_store_janitor(store));
	inference_datastructures_problem_store._csetf_prob_store_janitor(store, $FREE);
	inference_datastructures_problem_store.free_problem_store_name(store);
	inference_datastructures_problem_store._csetf_prob_store_equality_reasoning_method(store, $FREE);
	inference_datastructures_problem_store._csetf_prob_store_intermediate_step_validation_level(store, $FREE);
	inference_datastructures_problem_store._csetf_prob_store_max_problem_count(store, $FREE);
	inference_datastructures_problem_store._csetf_prob_store_crazy_max_problem_count(store, $FREE);
	inference_datastructures_problem_store._csetf_prob_store_removal_allowedP(store, $FREE);
	inference_datastructures_problem_store._csetf_prob_store_transformation_allowedP(store, $FREE);
	inference_datastructures_problem_store._csetf_prob_store_add_restriction_layer_of_indirectionP(store, $FREE);
	inference_datastructures_problem_store._csetf_prob_store_negation_by_failureP(store, $FREE);
	inference_datastructures_problem_store._csetf_prob_store_completeness_minimization_allowedP(store, $FREE);
	inference_datastructures_problem_store._csetf_prob_store_direction(store, $FREE);
	inference_datastructures_problem_store._csetf_prob_store_evaluate_subl_allowedP(store, $FREE);
	inference_datastructures_problem_store._csetf_prob_store_rewrite_allowedP(store, $FREE);
	inference_datastructures_problem_store._csetf_prob_store_abduction_allowedP(store, $FREE);
	inference_datastructures_problem_store._csetf_prob_store_new_terms_allowedP(store, $FREE);
	inference_datastructures_problem_store._csetf_prob_store_compute_answer_justificationsP(store, $FREE);
	inference_datastructures_problem_store._csetf_prob_store_preparedP(store, $FREE);
	inference_datastructures_problem_store._csetf_prob_store_destruction_imminentP(store, $FREE);
	inference_datastructures_problem_store._csetf_prob_store_static_properties(store, $FREE);
	inference_datastructures_problem_store.clear_problem_store_proof_keeping_problems(store);
	inference_datastructures_problem_store._csetf_prob_store_proof_keeping_index(store, $FREE);
	dictionary.clear_dictionary(inference_datastructures_problem_store.prob_store_complex_problem_query_signatures(store));
	inference_datastructures_problem_store._csetf_prob_store_complex_problem_query_signatures(store, $FREE);
	dictionary.clear_dictionary(inference_datastructures_problem_store.prob_store_complex_problem_query_czer_index(store));
	inference_datastructures_problem_store._csetf_prob_store_complex_problem_query_czer_index(store, $FREE);
	set.clear_set(inference_datastructures_problem_store.prob_store_historical_root_problems(store));
	inference_datastructures_problem_store._csetf_prob_store_historical_root_problems(store, $FREE);
	inference_datastructures_problem_store._csetf_prob_store_sbhl_resource_space(store, $FREE);
	inference_datastructures_problem_store._csetf_prob_store_memoization_state(store, $FREE);
	clrhash(inference_datastructures_problem_store.prob_store_min_depth_index(store));
	inference_datastructures_problem_store._csetf_prob_store_min_depth_index(store, $FREE);
	dictionary.clear_dictionary(inference_datastructures_problem_store.prob_store_min_transformation_depth_index(store));
	inference_datastructures_problem_store._csetf_prob_store_min_transformation_depth_index(store, $FREE);
	dictionary.clear_dictionary(inference_datastructures_problem_store.prob_store_min_transformation_depth_signature_index(store));
	inference_datastructures_problem_store._csetf_prob_store_min_transformation_depth_signature_index(store, $FREE);
	dictionary.clear_dictionary(inference_datastructures_problem_store.prob_store_min_proof_depth_index(store));
	inference_datastructures_problem_store._csetf_prob_store_min_proof_depth_index(store, $FREE);
	if (inference_datastructures_problem_store.prob_store_problems_by_query_index(store).isHashtable()) {
	    clrhash(inference_datastructures_problem_store.prob_store_problems_by_query_index(store));
	}
	inference_datastructures_problem_store._csetf_prob_store_problems_by_query_index(store, $FREE);
	SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$14 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$14, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$14);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject inference;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    inference = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(inference)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(inference)) {
			    inference = $SKIP;
			}
			inference_datastructures_inference.destroy_problem_store_inference(inference);
		    }
		}
	    }
	    final SubLObject idx_$15 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$15)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$15);
		SubLObject id2 = NIL;
		SubLObject inference2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			inference2 = getEntryValue(cdohash_entry);
			inference_datastructures_inference.destroy_problem_store_inference(inference2);
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	clear_id_index(inference_datastructures_problem_store.prob_store_inference_id_index(store));
	inference_datastructures_problem_store._csetf_prob_store_inference_id_index(store, $FREE);
	idx = inference_datastructures_problem_store.problem_store_strategy_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$16 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$16, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$16);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject strategy;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    strategy = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(strategy)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(strategy)) {
			    strategy = $SKIP;
			}
			inference_datastructures_strategy.destroy_problem_store_strategy(strategy);
		    }
		}
	    }
	    final SubLObject idx_$17 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$17)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$17);
		SubLObject id2 = NIL;
		SubLObject strategy2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			strategy2 = getEntryValue(cdohash_entry);
			inference_datastructures_strategy.destroy_problem_store_strategy(strategy2);
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	clear_id_index(inference_datastructures_problem_store.prob_store_strategy_id_index(store));
	inference_datastructures_problem_store._csetf_prob_store_strategy_id_index(store, $FREE);
	dictionary.clear_dictionary(inference_datastructures_problem_store.prob_store_rejected_proofs(store));
	inference_datastructures_problem_store._csetf_prob_store_rejected_proofs(store, $FREE);
	set.clear_set(inference_datastructures_problem_store.prob_store_processed_proofs(store));
	inference_datastructures_problem_store._csetf_prob_store_processed_proofs(store, $FREE);
	set.clear_set(inference_datastructures_problem_store.prob_store_potentially_processed_problems(store));
	inference_datastructures_problem_store._csetf_prob_store_potentially_processed_problems(store, $FREE);
	inference_datastructures_problem_store._csetf_prob_store_non_explanatory_subproofs_possibleP(store, $FREE);
	dictionary.clear_dictionary(inference_datastructures_problem_store.prob_store_non_explanatory_subproofs_index(store));
	inference_datastructures_problem_store._csetf_prob_store_non_explanatory_subproofs_index(store, $FREE);
	inference_datastructures_problem_store._csetf_prob_store_most_recent_tactic_executed(store, $FREE);
	idx = inference_datastructures_problem_store.problem_store_proof_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$18 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$18, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$18);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject proof;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    proof = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(proof)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(proof)) {
			    proof = $SKIP;
			}
			inference_datastructures_proof.destroy_problem_store_proof(proof);
		    }
		}
	    }
	    final SubLObject idx_$19 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$19)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$19);
		SubLObject id2 = NIL;
		SubLObject proof2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			proof2 = getEntryValue(cdohash_entry);
			inference_datastructures_proof.destroy_problem_store_proof(proof2);
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	clear_id_index(inference_datastructures_problem_store.prob_store_proof_id_index(store));
	inference_datastructures_problem_store._csetf_prob_store_proof_id_index(store, $FREE);
	idx = inference_datastructures_problem_store.problem_store_link_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$20 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$20, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$20);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject link;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    link = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(link)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(link)) {
			    link = $SKIP;
			}
			inference_datastructures_problem_link.destroy_problem_store_link(link);
		    }
		}
	    }
	    final SubLObject idx_$21 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$21)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$21);
		SubLObject id2 = NIL;
		SubLObject link2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			link2 = getEntryValue(cdohash_entry);
			inference_datastructures_problem_link.destroy_problem_store_link(link2);
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	clear_id_index(inference_datastructures_problem_store.prob_store_link_id_index(store));
	inference_datastructures_problem_store._csetf_prob_store_link_id_index(store, $FREE);
	idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$22 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$22, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$22);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			inference_datastructures_problem.destroy_problem_store_problem(problem);
		    }
		}
	    }
	    final SubLObject idx_$23 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$23)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$23);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			inference_datastructures_problem.destroy_problem_store_problem(problem2);
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	clear_id_index(inference_datastructures_problem_store.prob_store_problem_id_index(store));
	inference_datastructures_problem_store._csetf_prob_store_problem_id_index(store, $FREE);
	return NIL;
    }

    public static final SubLObject note_problem_store_invalid_alt(SubLObject store) {
	_csetf_prob_store_equality_reasoning_domain(store, $FREE);
	return store;
    }

    public static SubLObject note_problem_store_invalid(final SubLObject store) {
	inference_datastructures_problem_store._csetf_prob_store_equality_reasoning_domain(store, $FREE);
	return store;
    }

    public static final SubLObject problem_store_guid_alt(SubLObject store) {
	SubLTrampolineFile.checkType(store, PROBLEM_STORE_P);
	{
	    SubLObject guid = prob_store_guid(store);
	    if (NIL == guid) {
		guid = Guids.new_guid();
		_csetf_prob_store_guid(store, guid);
	    }
	    return guid;
	}
    }

    public static SubLObject problem_store_guid(final SubLObject store) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(store) : "! inference_datastructures_problem_store.problem_store_p(store) "
		+ ("inference_datastructures_problem_store.problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(store) ") + store;
	SubLObject guid = inference_datastructures_problem_store.prob_store_guid(store);
	if (NIL == guid) {
	    guid = Guids.new_guid();
	    inference_datastructures_problem_store._csetf_prob_store_guid(store, guid);
	}
	return guid;
    }

    public static final SubLObject problem_store_suid_alt(SubLObject store) {
	SubLTrampolineFile.checkType(store, PROBLEM_STORE_P);
	return prob_store_suid(store);
    }

    public static SubLObject problem_store_suid(final SubLObject store) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(store) : "! inference_datastructures_problem_store.problem_store_p(store) "
		+ ("inference_datastructures_problem_store.problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(store) ") + store;
	return inference_datastructures_problem_store.prob_store_suid(store);
    }

    public static final SubLObject problem_store_creation_time_alt(SubLObject store) {
	SubLTrampolineFile.checkType(store, PROBLEM_STORE_P);
	return prob_store_creation_time(store);
    }

    public static SubLObject problem_store_creation_time(final SubLObject store) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(store) : "! inference_datastructures_problem_store.problem_store_p(store) "
		+ ("inference_datastructures_problem_store.problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(store) ") + store;
	return inference_datastructures_problem_store.prob_store_creation_time(store);
    }

    public static final SubLObject problem_store_rejected_proofs_alt(SubLObject store) {
	return prob_store_rejected_proofs(store);
    }

    public static SubLObject problem_store_rejected_proofs(final SubLObject store) {
	return inference_datastructures_problem_store.prob_store_rejected_proofs(store);
    }

    public static final SubLObject problem_store_processed_proofs_alt(SubLObject store) {
	return prob_store_processed_proofs(store);
    }

    public static SubLObject problem_store_processed_proofs(final SubLObject store) {
	return inference_datastructures_problem_store.prob_store_processed_proofs(store);
    }

    public static SubLObject problem_store_potentially_processed_problems(final SubLObject store) {
	return inference_datastructures_problem_store.prob_store_potentially_processed_problems(store);
    }

    public static final SubLObject problem_store_non_explanatory_subproofs_possibleP_alt(SubLObject store) {
	SubLTrampolineFile.checkType(store, PROBLEM_STORE_P);
	return prob_store_non_explanatory_subproofs_possibleP(store);
    }

    public static SubLObject problem_store_non_explanatory_subproofs_possibleP(final SubLObject store) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(store) : "! inference_datastructures_problem_store.problem_store_p(store) "
		+ ("inference_datastructures_problem_store.problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(store) ") + store;
	return inference_datastructures_problem_store.prob_store_non_explanatory_subproofs_possibleP(store);
    }

    public static final SubLObject problem_store_non_explanatory_subproofs_index_alt(SubLObject store) {
	SubLTrampolineFile.checkType(store, PROBLEM_STORE_P);
	return prob_store_non_explanatory_subproofs_index(store);
    }

    public static SubLObject problem_store_non_explanatory_subproofs_index(final SubLObject store) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(store) : "! inference_datastructures_problem_store.problem_store_p(store) "
		+ ("inference_datastructures_problem_store.problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(store) ") + store;
	return inference_datastructures_problem_store.prob_store_non_explanatory_subproofs_index(store);
    }

    public static final SubLObject problem_store_most_recent_tactic_executed_alt(SubLObject store) {
	return prob_store_most_recent_tactic_executed(store);
    }

    public static SubLObject problem_store_most_recent_tactic_executed(final SubLObject store) {
	return inference_datastructures_problem_store.prob_store_most_recent_tactic_executed(store);
    }

    public static final SubLObject problem_store_min_proof_depth_index_alt(SubLObject store) {
	SubLTrampolineFile.checkType(store, PROBLEM_STORE_P);
	return prob_store_min_proof_depth_index(store);
    }

    public static SubLObject problem_store_min_proof_depth_index(final SubLObject store) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(store) : "! inference_datastructures_problem_store.problem_store_p(store) "
		+ ("inference_datastructures_problem_store.problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(store) ") + store;
	return inference_datastructures_problem_store.prob_store_min_proof_depth_index(store);
    }

    public static final SubLObject problem_store_min_transformation_depth_index_alt(SubLObject store) {
	SubLTrampolineFile.checkType(store, PROBLEM_STORE_P);
	return prob_store_min_transformation_depth_index(store);
    }

    public static SubLObject problem_store_min_transformation_depth_index(final SubLObject store) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(store) : "! inference_datastructures_problem_store.problem_store_p(store) "
		+ ("inference_datastructures_problem_store.problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(store) ") + store;
	return inference_datastructures_problem_store.prob_store_min_transformation_depth_index(store);
    }

    public static final SubLObject problem_store_min_transformation_depth_signature_index_alt(SubLObject store) {
	SubLTrampolineFile.checkType(store, PROBLEM_STORE_P);
	return prob_store_min_transformation_depth_signature_index(store);
    }

    public static SubLObject problem_store_min_transformation_depth_signature_index(final SubLObject store) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(store) : "! inference_datastructures_problem_store.problem_store_p(store) "
		+ ("inference_datastructures_problem_store.problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(store) ") + store;
	return inference_datastructures_problem_store.prob_store_min_transformation_depth_signature_index(store);
    }

    public static final SubLObject problem_store_min_depth_index_alt(SubLObject store) {
	SubLTrampolineFile.checkType(store, PROBLEM_STORE_P);
	return prob_store_min_depth_index(store);
    }

    public static SubLObject problem_store_min_depth_index(final SubLObject store) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(store) : "! inference_datastructures_problem_store.problem_store_p(store) "
		+ ("inference_datastructures_problem_store.problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(store) ") + store;
	return inference_datastructures_problem_store.prob_store_min_depth_index(store);
    }

    public static final SubLObject problem_store_equality_reasoning_method_alt(SubLObject store) {
	SubLTrampolineFile.checkType(store, PROBLEM_STORE_P);
	return prob_store_equality_reasoning_method(store);
    }

    public static SubLObject problem_store_equality_reasoning_method(final SubLObject store) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(store) : "! inference_datastructures_problem_store.problem_store_p(store) "
		+ ("inference_datastructures_problem_store.problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(store) ") + store;
	return inference_datastructures_problem_store.prob_store_equality_reasoning_method(store);
    }

    public static final SubLObject problem_store_equality_reasoning_domain_alt(SubLObject store) {
	SubLTrampolineFile.checkType(store, PROBLEM_STORE_P);
	return prob_store_equality_reasoning_domain(store);
    }

    public static SubLObject problem_store_equality_reasoning_domain(final SubLObject store) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(store) : "! inference_datastructures_problem_store.problem_store_p(store) "
		+ ("inference_datastructures_problem_store.problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(store) ") + store;
	return inference_datastructures_problem_store.prob_store_equality_reasoning_domain(store);
    }

    public static final SubLObject problem_store_intermediate_step_validation_level_alt(SubLObject store) {
	SubLTrampolineFile.checkType(store, PROBLEM_STORE_P);
	return prob_store_intermediate_step_validation_level(store);
    }

    public static SubLObject problem_store_intermediate_step_validation_level(final SubLObject store) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(store) : "! inference_datastructures_problem_store.problem_store_p(store) "
		+ ("inference_datastructures_problem_store.problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(store) ") + store;
	return inference_datastructures_problem_store.prob_store_intermediate_step_validation_level(store);
    }

    public static final SubLObject problem_store_max_problem_count_alt(SubLObject store) {
	SubLTrampolineFile.checkType(store, PROBLEM_STORE_P);
	return prob_store_max_problem_count(store);
    }

    public static SubLObject problem_store_max_problem_count(final SubLObject store) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(store) : "! inference_datastructures_problem_store.problem_store_p(store) "
		+ ("inference_datastructures_problem_store.problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(store) ") + store;
	return inference_datastructures_problem_store.prob_store_max_problem_count(store);
    }

    public static final SubLObject problem_store_crazy_max_problem_count_alt(SubLObject store) {
	SubLTrampolineFile.checkType(store, PROBLEM_STORE_P);
	return prob_store_crazy_max_problem_count(store);
    }

    public static SubLObject problem_store_crazy_max_problem_count(final SubLObject store) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(store) : "! inference_datastructures_problem_store.problem_store_p(store) "
		+ ("inference_datastructures_problem_store.problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(store) ") + store;
	return inference_datastructures_problem_store.prob_store_crazy_max_problem_count(store);
    }

    public static final SubLObject problem_store_removal_allowedP_alt(SubLObject store) {
	SubLTrampolineFile.checkType(store, PROBLEM_STORE_P);
	return prob_store_removal_allowedP(store);
    }

    public static SubLObject problem_store_removal_allowedP(final SubLObject store) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(store) : "! inference_datastructures_problem_store.problem_store_p(store) "
		+ ("inference_datastructures_problem_store.problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(store) ") + store;
	return inference_datastructures_problem_store.prob_store_removal_allowedP(store);
    }

    public static final SubLObject problem_store_transformation_allowedP_alt(SubLObject store) {
	SubLTrampolineFile.checkType(store, PROBLEM_STORE_P);
	return prob_store_transformation_allowedP(store);
    }

    public static SubLObject problem_store_transformation_allowedP(final SubLObject store) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(store) : "! inference_datastructures_problem_store.problem_store_p(store) "
		+ ("inference_datastructures_problem_store.problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(store) ") + store;
	return inference_datastructures_problem_store.prob_store_transformation_allowedP(store);
    }

    public static final SubLObject problem_store_add_restriction_layer_of_indirectionP_alt(SubLObject store) {
	SubLTrampolineFile.checkType(store, PROBLEM_STORE_P);
	return prob_store_add_restriction_layer_of_indirectionP(store);
    }

    public static SubLObject problem_store_add_restriction_layer_of_indirectionP(final SubLObject store) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(store) : "! inference_datastructures_problem_store.problem_store_p(store) "
		+ ("inference_datastructures_problem_store.problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(store) ") + store;
	return inference_datastructures_problem_store.prob_store_add_restriction_layer_of_indirectionP(store);
    }

    public static final SubLObject problem_store_negation_by_failureP_alt(SubLObject store) {
	SubLTrampolineFile.checkType(store, PROBLEM_STORE_P);
	return prob_store_negation_by_failureP(store);
    }

    public static SubLObject problem_store_negation_by_failureP(final SubLObject store) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(store) : "! inference_datastructures_problem_store.problem_store_p(store) "
		+ ("inference_datastructures_problem_store.problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(store) ") + store;
	return inference_datastructures_problem_store.prob_store_negation_by_failureP(store);
    }

    public static final SubLObject problem_store_completeness_minimization_allowedP_alt(SubLObject store) {
	SubLTrampolineFile.checkType(store, PROBLEM_STORE_P);
	return prob_store_completeness_minimization_allowedP(store);
    }

    public static SubLObject problem_store_completeness_minimization_allowedP(final SubLObject store) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(store) : "! inference_datastructures_problem_store.problem_store_p(store) "
		+ ("inference_datastructures_problem_store.problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(store) ") + store;
	return inference_datastructures_problem_store.prob_store_completeness_minimization_allowedP(store);
    }

    public static final SubLObject problem_store_direction_alt(SubLObject store) {
	SubLTrampolineFile.checkType(store, PROBLEM_STORE_P);
	return prob_store_direction(store);
    }

    public static SubLObject problem_store_direction(final SubLObject store) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(store) : "! inference_datastructures_problem_store.problem_store_p(store) "
		+ ("inference_datastructures_problem_store.problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(store) ") + store;
	return inference_datastructures_problem_store.prob_store_direction(store);
    }

    public static final SubLObject problem_store_evaluate_subl_allowedP_alt(SubLObject store) {
	SubLTrampolineFile.checkType(store, PROBLEM_STORE_P);
	return prob_store_evaluate_subl_allowedP(store);
    }

    public static SubLObject problem_store_evaluate_subl_allowedP(final SubLObject store) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(store) : "! inference_datastructures_problem_store.problem_store_p(store) "
		+ ("inference_datastructures_problem_store.problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(store) ") + store;
	return inference_datastructures_problem_store.prob_store_evaluate_subl_allowedP(store);
    }

    public static final SubLObject problem_store_rewrite_allowedP_alt(SubLObject store) {
	SubLTrampolineFile.checkType(store, PROBLEM_STORE_P);
	return prob_store_rewrite_allowedP(store);
    }

    public static SubLObject problem_store_rewrite_allowedP(final SubLObject store) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(store) : "! inference_datastructures_problem_store.problem_store_p(store) "
		+ ("inference_datastructures_problem_store.problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(store) ") + store;
	return inference_datastructures_problem_store.prob_store_rewrite_allowedP(store);
    }

    public static final SubLObject problem_store_abduction_allowedP_alt(SubLObject store) {
	SubLTrampolineFile.checkType(store, PROBLEM_STORE_P);
	return prob_store_abduction_allowedP(store);
    }

    public static SubLObject problem_store_abduction_allowedP(final SubLObject store) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(store) : "! inference_datastructures_problem_store.problem_store_p(store) "
		+ ("inference_datastructures_problem_store.problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(store) ") + store;
	return inference_datastructures_problem_store.prob_store_abduction_allowedP(store);
    }

    public static final SubLObject problem_store_new_terms_allowedP_alt(SubLObject store) {
	SubLTrampolineFile.checkType(store, PROBLEM_STORE_P);
	return prob_store_new_terms_allowedP(store);
    }

    public static SubLObject problem_store_new_terms_allowedP(final SubLObject store) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(store) : "! inference_datastructures_problem_store.problem_store_p(store) "
		+ ("inference_datastructures_problem_store.problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(store) ") + store;
	return inference_datastructures_problem_store.prob_store_new_terms_allowedP(store);
    }

    public static final SubLObject problem_store_compute_answer_justificationsP_alt(SubLObject store) {
	SubLTrampolineFile.checkType(store, PROBLEM_STORE_P);
	if (NIL != cyc_testing.testing_real_time_pruningP()) {
	    return NIL;
	} else {
	    return prob_store_compute_answer_justificationsP(store);
	}
    }

    public static SubLObject problem_store_compute_answer_justificationsP(final SubLObject store) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(store) : "! inference_datastructures_problem_store.problem_store_p(store) "
		+ ("inference_datastructures_problem_store.problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(store) ") + store;
	if (NIL != cyc_testing.testing_real_time_pruningP()) {
	    return inference_datastructures_problem_store.problem_store_forwardP(store);
	}
	return inference_datastructures_problem_store.prob_store_compute_answer_justificationsP(store);
    }

    public static final SubLObject problem_store_preparedP_alt(SubLObject store) {
	SubLTrampolineFile.checkType(store, PROBLEM_STORE_P);
	return prob_store_preparedP(store);
    }

    public static SubLObject problem_store_preparedP(final SubLObject store) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(store) : "! inference_datastructures_problem_store.problem_store_p(store) "
		+ ("inference_datastructures_problem_store.problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(store) ") + store;
	return inference_datastructures_problem_store.prob_store_preparedP(store);
    }

    public static final SubLObject problem_store_destruction_imminentP_alt(SubLObject store) {
	return prob_store_destruction_imminentP(store);
    }

    public static SubLObject problem_store_destruction_imminentP(final SubLObject store) {
	return inference_datastructures_problem_store.prob_store_destruction_imminentP(store);
    }

    /**
     * May initialize the meta-problem-store by side-effect.
     */
    @LispMethod(comment = "May initialize the meta-problem-store by side-effect.")
    public static final SubLObject problem_store_meta_problem_store_alt(SubLObject store) {
	{
	    SubLObject meta_problem_store = prob_store_meta_problem_store(store);
	    if (NIL == meta_problem_store) {
		meta_problem_store = new_problem_store(problem_store_static_properties(store));
		_csetf_prob_store_meta_problem_store(store, meta_problem_store);
	    }
	    return meta_problem_store;
	}
    }

    /**
     * May initialize the meta-problem-store by side-effect.
     */
    @LispMethod(comment = "May initialize the meta-problem-store by side-effect.")
    public static SubLObject problem_store_meta_problem_store(final SubLObject store) {
	SubLObject meta_problem_store = inference_datastructures_problem_store.prob_store_meta_problem_store(store);
	if (NIL == meta_problem_store) {
	    meta_problem_store = inference_datastructures_problem_store.new_problem_store(inference_datastructures_problem_store.problem_store_static_properties(store));
	    inference_datastructures_problem_store._csetf_prob_store_meta_problem_store(store, meta_problem_store);
	}
	return meta_problem_store;
    }

    /**
     *
     *
     * @unknown The result is not destructible.
     */
    @LispMethod(comment = "@unknown The result is not destructible.")
    public static final SubLObject problem_store_static_properties_alt(SubLObject store) {
	return prob_store_static_properties(store);
    }

    /**
     *
     *
     * @unknown The result is not destructible.
     */
    @LispMethod(comment = "@unknown The result is not destructible.")
    public static SubLObject problem_store_static_properties(final SubLObject store) {
	return inference_datastructures_problem_store.prob_store_static_properties(store);
    }

    public static final SubLObject problem_store_janitor_alt(SubLObject store) {
	return prob_store_janitor(store);
    }

    public static SubLObject problem_store_janitor(final SubLObject store) {
	return inference_datastructures_problem_store.prob_store_janitor(store);
    }

    public static final SubLObject note_problem_store_most_recent_tactic_executed_alt(SubLObject store, SubLObject tactic) {
	SubLTrampolineFile.checkType(store, PROBLEM_STORE_P);
	SubLTrampolineFile.checkType(tactic, TACTIC_P);
	_csetf_prob_store_most_recent_tactic_executed(store, tactic);
	return store;
    }

    public static SubLObject note_problem_store_most_recent_tactic_executed(final SubLObject store, final SubLObject tactic) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(store) : "! inference_datastructures_problem_store.problem_store_p(store) "
		+ ("inference_datastructures_problem_store.problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(store) ") + store;
	assert NIL != inference_datastructures_tactic.tactic_p(tactic) : "! inference_datastructures_tactic.tactic_p(tactic) " + ("inference_datastructures_tactic.tactic_p(tactic) " + "CommonSymbols.NIL != inference_datastructures_tactic.tactic_p(tactic) ") + tactic;
	inference_datastructures_problem_store._csetf_prob_store_most_recent_tactic_executed(store, tactic);
	return store;
    }

    public static final SubLObject set_problem_store_intermediate_step_validation_level_alt(SubLObject store, SubLObject value) {
	SubLTrampolineFile.checkType(store, NEW_PROBLEM_STORE_P);
	SubLTrampolineFile.checkType(value, INTERMEDIATE_STEP_VALIDATION_LEVEL_P);
	_csetf_prob_store_intermediate_step_validation_level(store, value);
	return store;
    }

    public static SubLObject set_problem_store_intermediate_step_validation_level(final SubLObject store, final SubLObject value) {
	assert NIL != inference_datastructures_problem_store.new_problem_store_p(store) : "! inference_datastructures_problem_store.new_problem_store_p(store) "
		+ ("inference_datastructures_problem_store.new_problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.new_problem_store_p(store) ") + store;
	assert NIL != inference_datastructures_enumerated_types.intermediate_step_validation_level_p(value) : "! inference_datastructures_enumerated_types.intermediate_step_validation_level_p(value) "
		+ ("inference_datastructures_enumerated_types.intermediate_step_validation_level_p(value) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.intermediate_step_validation_level_p(value) ") + value;
	inference_datastructures_problem_store._csetf_prob_store_intermediate_step_validation_level(store, value);
	return store;
    }

    public static final SubLObject set_problem_store_add_restriction_layer_of_indirectionP_alt(SubLObject store, SubLObject value) {
	SubLTrampolineFile.checkType(store, NEW_PROBLEM_STORE_P);
	SubLTrampolineFile.checkType(value, BOOLEANP);
	_csetf_prob_store_add_restriction_layer_of_indirectionP(store, value);
	return store;
    }

    public static SubLObject set_problem_store_add_restriction_layer_of_indirectionP(final SubLObject store, final SubLObject value) {
	assert NIL != inference_datastructures_problem_store.new_problem_store_p(store) : "! inference_datastructures_problem_store.new_problem_store_p(store) "
		+ ("inference_datastructures_problem_store.new_problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.new_problem_store_p(store) ") + store;
	assert NIL != booleanp(value) : "! booleanp(value) " + ("Types.booleanp(value) " + "CommonSymbols.NIL != Types.booleanp(value) ") + value;
	inference_datastructures_problem_store._csetf_prob_store_add_restriction_layer_of_indirectionP(store, value);
	return store;
    }

    public static final SubLObject set_problem_store_transformation_allowedP_alt(SubLObject store, SubLObject value) {
	SubLTrampolineFile.checkType(store, NEW_PROBLEM_STORE_P);
	SubLTrampolineFile.checkType(value, BOOLEANP);
	_csetf_prob_store_transformation_allowedP(store, value);
	return store;
    }

    public static SubLObject set_problem_store_transformation_allowedP(final SubLObject store, final SubLObject value) {
	assert NIL != inference_datastructures_problem_store.new_problem_store_p(store) : "! inference_datastructures_problem_store.new_problem_store_p(store) "
		+ ("inference_datastructures_problem_store.new_problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.new_problem_store_p(store) ") + store;
	assert NIL != booleanp(value) : "! booleanp(value) " + ("Types.booleanp(value) " + "CommonSymbols.NIL != Types.booleanp(value) ") + value;
	inference_datastructures_problem_store._csetf_prob_store_transformation_allowedP(store, value);
	return store;
    }

    public static final SubLObject set_problem_store_removal_allowedP_alt(SubLObject store, SubLObject value) {
	SubLTrampolineFile.checkType(store, NEW_PROBLEM_STORE_P);
	SubLTrampolineFile.checkType(value, BOOLEANP);
	_csetf_prob_store_removal_allowedP(store, value);
	return store;
    }

    public static SubLObject set_problem_store_removal_allowedP(final SubLObject store, final SubLObject value) {
	assert NIL != inference_datastructures_problem_store.new_problem_store_p(store) : "! inference_datastructures_problem_store.new_problem_store_p(store) "
		+ ("inference_datastructures_problem_store.new_problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.new_problem_store_p(store) ") + store;
	assert NIL != booleanp(value) : "! booleanp(value) " + ("Types.booleanp(value) " + "CommonSymbols.NIL != Types.booleanp(value) ") + value;
	inference_datastructures_problem_store._csetf_prob_store_removal_allowedP(store, value);
	return store;
    }

    public static final SubLObject set_problem_store_new_terms_allowedP_alt(SubLObject store, SubLObject value) {
	SubLTrampolineFile.checkType(store, NEW_PROBLEM_STORE_P);
	SubLTrampolineFile.checkType(value, BOOLEANP);
	_csetf_prob_store_new_terms_allowedP(store, value);
	return store;
    }

    public static SubLObject set_problem_store_new_terms_allowedP(final SubLObject store, final SubLObject value) {
	assert NIL != inference_datastructures_problem_store.new_problem_store_p(store) : "! inference_datastructures_problem_store.new_problem_store_p(store) "
		+ ("inference_datastructures_problem_store.new_problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.new_problem_store_p(store) ") + store;
	assert NIL != booleanp(value) : "! booleanp(value) " + ("Types.booleanp(value) " + "CommonSymbols.NIL != Types.booleanp(value) ") + value;
	inference_datastructures_problem_store._csetf_prob_store_new_terms_allowedP(store, value);
	return store;
    }

    public static final SubLObject note_problem_store_prepared_alt(SubLObject store) {
	SubLTrampolineFile.checkType(store, NEW_PROBLEM_STORE_P);
	_csetf_prob_store_preparedP(store, T);
	return store;
    }

    public static SubLObject note_problem_store_prepared(final SubLObject store) {
	assert NIL != inference_datastructures_problem_store.new_problem_store_p(store) : "! inference_datastructures_problem_store.new_problem_store_p(store) "
		+ ("inference_datastructures_problem_store.new_problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.new_problem_store_p(store) ") + store;
	inference_datastructures_problem_store._csetf_prob_store_preparedP(store, T);
	return store;
    }

    /**
     *
     *
     * @unknown the actual destruction must still be done by the caller.
     */
    @LispMethod(comment = "@unknown the actual destruction must still be done by the caller.")
    public static final SubLObject note_problem_store_destruction_imminent_alt(SubLObject store) {
	SubLTrampolineFile.checkType(store, NEW_PROBLEM_STORE_P);
	_csetf_prob_store_destruction_imminentP(store, T);
	return store;
    }

    /**
     *
     *
     * @unknown the actual destruction must still be done by the caller.
     */
    @LispMethod(comment = "@unknown the actual destruction must still be done by the caller.")
    public static SubLObject note_problem_store_destruction_imminent(final SubLObject store) {
	assert NIL != inference_datastructures_problem_store.new_problem_store_p(store) : "! inference_datastructures_problem_store.new_problem_store_p(store) "
		+ ("inference_datastructures_problem_store.new_problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.new_problem_store_p(store) ") + store;
	inference_datastructures_problem_store._csetf_prob_store_destruction_imminentP(store, T);
	return store;
    }

    public static final SubLObject reset_problem_store_janitor_alt(SubLObject store) {
	{
	    SubLObject janitor = problem_store_janitor(store);
	    destroy_problem_store_janitor(janitor);
	}
	_csetf_prob_store_janitor(store, new_problem_store_janitor(store));
	return store;
    }

    public static SubLObject reset_problem_store_janitor(final SubLObject store) {
	final SubLObject janitor = inference_datastructures_problem_store.problem_store_janitor(store);
	inference_datastructures_problem_store.destroy_problem_store_janitor(janitor);
	inference_datastructures_problem_store._csetf_prob_store_janitor(store, inference_datastructures_problem_store.new_problem_store_janitor(store));
	return store;
    }

    /**
     * Return T iff STORE has a direction of :FORWARD.
     */
    @LispMethod(comment = "Return T iff STORE has a direction of :FORWARD.")
    public static final SubLObject problem_store_forwardP_alt(SubLObject store) {
	return eq($FORWARD, problem_store_direction(store));
    }

    /**
     * Return T iff STORE has a direction of :FORWARD.
     */
    @LispMethod(comment = "Return T iff STORE has a direction of :FORWARD.")
    public static SubLObject problem_store_forwardP(final SubLObject store) {
	return eq($FORWARD, inference_datastructures_problem_store.problem_store_direction(store));
    }

    /**
     *
     *
     * @return booleanp; whether STORE is newly created and not yet finalized.
     * @see finalize-problem-store-properties
     */
    @LispMethod(comment = "@return booleanp; whether STORE is newly created and not yet finalized.\r\n@see finalize-problem-store-properties")
    public static final SubLObject problem_store_newP_alt(SubLObject store) {
	return makeBoolean(NIL == problem_store_preparedP(store));
    }

    /**
     *
     *
     * @return booleanp; whether STORE is newly created and not yet finalized.
     * @see finalize-problem-store-properties
     */
    @LispMethod(comment = "@return booleanp; whether STORE is newly created and not yet finalized.\r\n@see finalize-problem-store-properties")
    public static SubLObject problem_store_newP(final SubLObject store) {
	return makeBoolean(NIL == inference_datastructures_problem_store.problem_store_preparedP(store));
    }

    public static final SubLObject new_problem_store_p_alt(SubLObject store) {
	return makeBoolean((NIL != problem_store_p(store)) && (NIL != problem_store_newP(store)));
    }

    public static SubLObject new_problem_store_p(final SubLObject store) {
	return makeBoolean((NIL != inference_datastructures_problem_store.problem_store_p(store)) && (NIL != inference_datastructures_problem_store.problem_store_newP(store)));
    }

    /**
     * Return the number of inferences that are currently in STORE.
     */
    @LispMethod(comment = "Return the number of inferences that are currently in STORE.")
    public static final SubLObject problem_store_inference_count_alt(SubLObject store) {
	return id_index_count(prob_store_inference_id_index(store));
    }

    /**
     * Return the number of inferences that are currently in STORE.
     */
    @LispMethod(comment = "Return the number of inferences that are currently in STORE.")
    public static SubLObject problem_store_inference_count(final SubLObject store) {
	return id_index_count(inference_datastructures_problem_store.prob_store_inference_id_index(store));
    }

    public static SubLObject problem_store_non_recursive_inference_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$24 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$24, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$24);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject inference;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    inference = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(inference)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(inference)) {
			    inference = $SKIP;
			}
			if (NIL == getf(inference_datastructures_inference.inference_properties(inference), $MOTIVATING_TACTIC, UNPROVIDED)) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$25 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$25)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$25);
		SubLObject id2 = NIL;
		SubLObject inference2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			inference2 = getEntryValue(cdohash_entry);
			if (NIL == getf(inference_datastructures_inference.inference_properties(inference2), $MOTIVATING_TACTIC, UNPROVIDED)) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    public static final SubLObject problem_store_has_only_one_inferenceP_alt(SubLObject store) {
	return numE(ONE_INTEGER, problem_store_inference_count(store));
    }

    public static SubLObject problem_store_has_only_one_inferenceP(final SubLObject store) {
	return numE(ONE_INTEGER, inference_datastructures_problem_store.problem_store_inference_count(store));
    }

    /**
     * Return the number of inferences that have ever existed in STORE.
     */
    @LispMethod(comment = "Return the number of inferences that have ever existed in STORE.")
    public static final SubLObject problem_store_historical_inference_count_alt(SubLObject store) {
	return id_index_next_id(prob_store_inference_id_index(store));
    }

    /**
     * Return the number of inferences that have ever existed in STORE.
     */
    @LispMethod(comment = "Return the number of inferences that have ever existed in STORE.")
    public static SubLObject problem_store_historical_inference_count(final SubLObject store) {
	return id_index_next_id(inference_datastructures_problem_store.prob_store_inference_id_index(store));
    }

    public static final SubLObject find_inference_by_id_alt(SubLObject store, SubLObject inference_suid) {
	{
	    SubLObject v_id_index = prob_store_inference_id_index(store);
	    return id_index_lookup(v_id_index, inference_suid, UNPROVIDED);
	}
    }

    public static SubLObject find_inference_by_id(final SubLObject store, final SubLObject inference_suid) {
	final SubLObject v_id_index = inference_datastructures_problem_store.prob_store_inference_id_index(store);
	return id_index_lookup(v_id_index, inference_suid, UNPROVIDED);
    }

    public static final SubLObject find_inference_by_ids_alt(SubLObject store_suid, SubLObject inference_suid) {
	{
	    SubLObject store = find_problem_store_by_id(store_suid);
	    if (NIL != store) {
		{
		    SubLObject inference = find_inference_by_id(store, inference_suid);
		    return inference;
		}
	    }
	}
	return NIL;
    }

    public static SubLObject find_inference_by_ids(final SubLObject store_suid, final SubLObject inference_suid) {
	final SubLObject store = inference_datastructures_problem_store.find_problem_store_by_id(store_suid);
	if (NIL != store) {
	    final SubLObject inference = inference_datastructures_problem_store.find_inference_by_id(store, inference_suid);
	    return inference;
	}
	return NIL;
    }

    public static final SubLObject first_problem_store_inference_alt(SubLObject store) {
	{
	    SubLObject idx = problem_store_inference_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject inference = NIL;
		    while (NIL != id) {
			inference = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, inference, $SKIP)) {
			    return inference;
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	}
	return NIL;
    }

    public static SubLObject first_problem_store_inference(final SubLObject store) {
	final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$26 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$26, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$26);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject inference;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    inference = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(inference)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(inference)) {
			    inference = $SKIP;
			}
			return inference;
		    }
		}
	    }
	    final SubLObject idx_$27 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$27)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$27);
		SubLObject id2 = NIL;
		SubLObject inference2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    if (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			inference2 = getEntryValue(cdohash_entry);
			return inference2;
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return NIL;
    }

    public static final SubLObject earliest_problem_store_inference_alt(SubLObject store) {
	{
	    SubLObject earliest_id = $most_positive_fixnum$.getGlobalValue();
	    SubLObject earliest_inference = NIL;
	    SubLObject idx = problem_store_inference_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject inference = NIL;
		    while (NIL != id) {
			inference = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, inference, $SKIP)) {
			    {
				SubLObject id_10 = inference_datastructures_inference.inference_suid(inference);
				if (id_10.numL(earliest_id)) {
				    earliest_inference = inference;
				    earliest_id = id_10;
				}
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return earliest_inference;
	}
    }

    public static SubLObject earliest_problem_store_inference(final SubLObject store) {
	SubLObject earliest_id = $most_positive_fixnum$.getGlobalValue();
	SubLObject earliest_inference = NIL;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$28 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$28, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$28);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject inference;
		SubLObject id_$29;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    inference = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(inference)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(inference)) {
			    inference = $SKIP;
			}
			id_$29 = inference_datastructures_inference.inference_suid(inference);
			if (id_$29.numL(earliest_id)) {
			    earliest_inference = inference;
			    earliest_id = id_$29;
			}
		    }
		}
	    }
	    final SubLObject idx_$29 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$29)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$29);
		SubLObject id2 = NIL;
		SubLObject inference2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			inference2 = getEntryValue(cdohash_entry);
			final SubLObject id_$30 = inference_datastructures_inference.inference_suid(inference2);
			if (id_$30.numL(earliest_id)) {
			    earliest_inference = inference2;
			    earliest_id = id_$30;
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return earliest_inference;
    }

    public static final SubLObject latest_problem_store_inference_alt(SubLObject store) {
	{
	    SubLObject latest_id = MINUS_ONE_INTEGER;
	    SubLObject latest_inference = NIL;
	    SubLObject idx = problem_store_inference_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject inference = NIL;
		    while (NIL != id) {
			inference = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, inference, $SKIP)) {
			    {
				SubLObject id_11 = inference_datastructures_inference.inference_suid(inference);
				if (id_11.numG(latest_id)) {
				    latest_inference = inference;
				    latest_id = id_11;
				}
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return latest_inference;
	}
    }

    public static SubLObject latest_problem_store_inference(final SubLObject store) {
	SubLObject latest_id = MINUS_ONE_INTEGER;
	SubLObject latest_inference = NIL;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$32 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$32, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$32);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject inference;
		SubLObject id_$33;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    inference = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(inference)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(inference)) {
			    inference = $SKIP;
			}
			id_$33 = inference_datastructures_inference.inference_suid(inference);
			if (id_$33.numG(latest_id)) {
			    latest_inference = inference;
			    latest_id = id_$33;
			}
		    }
		}
	    }
	    final SubLObject idx_$33 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$33)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$33);
		SubLObject id2 = NIL;
		SubLObject inference2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			inference2 = getEntryValue(cdohash_entry);
			final SubLObject id_$34 = inference_datastructures_inference.inference_suid(inference2);
			if (id_$34.numG(latest_id)) {
			    latest_inference = inference2;
			    latest_id = id_$34;
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return latest_inference;
    }

    public static SubLObject problem_store_running_inferences(final SubLObject store) {
	SubLObject running_inferences = NIL;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_inference_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$36 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$36, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$36);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject inference;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    inference = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(inference)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(inference)) {
			    inference = $SKIP;
			}
			if (NIL != inference_datastructures_inference.running_inference_p(inference)) {
			    running_inferences = cons(inference, running_inferences);
			}
		    }
		}
	    }
	    final SubLObject idx_$37 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$37)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$37);
		SubLObject id2 = NIL;
		SubLObject inference2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			inference2 = getEntryValue(cdohash_entry);
			if (NIL != inference_datastructures_inference.running_inference_p(inference2)) {
			    running_inferences = cons(inference2, running_inferences);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return running_inferences;
    }

    public static final SubLObject problem_store_privateP_alt(SubLObject store) {
	{
	    SubLObject inference = first_problem_store_inference(store);
	    if (NIL != inference) {
		return inference_datastructures_inference.inference_problem_store_privateP(inference);
	    }
	}
	return NIL;
    }

    public static SubLObject problem_store_privateP(final SubLObject store) {
	final SubLObject inference = inference_datastructures_problem_store.first_problem_store_inference(store);
	if (NIL != inference) {
	    return inference_datastructures_inference.inference_problem_store_privateP(inference);
	}
	return NIL;
    }

    /**
     * Return the number of strategies that are currently in STORE.
     */
    @LispMethod(comment = "Return the number of strategies that are currently in STORE.")
    public static final SubLObject problem_store_strategy_count_alt(SubLObject store) {
	return id_index_count(prob_store_strategy_id_index(store));
    }

    /**
     * Return the number of strategies that are currently in STORE.
     */
    @LispMethod(comment = "Return the number of strategies that are currently in STORE.")
    public static SubLObject problem_store_strategy_count(final SubLObject store) {
	return id_index_count(inference_datastructures_problem_store.prob_store_strategy_id_index(store));
    }

    /**
     * Return the number of strategies that have ever existed in STORE.
     */
    @LispMethod(comment = "Return the number of strategies that have ever existed in STORE.")
    public static final SubLObject problem_store_historical_strategy_count_alt(SubLObject store) {
	return id_index_next_id(problem_store_strategy_id_index(store));
    }

    /**
     * Return the number of strategies that have ever existed in STORE.
     */
    @LispMethod(comment = "Return the number of strategies that have ever existed in STORE.")
    public static SubLObject problem_store_historical_strategy_count(final SubLObject store) {
	return id_index_next_id(inference_datastructures_problem_store.problem_store_strategy_id_index(store));
    }

    public static final SubLObject problem_store_strategies_alt(SubLObject store) {
	return id_index_values(problem_store_strategy_id_index(store));
    }

    public static SubLObject problem_store_strategies(final SubLObject store) {
	return id_index_values(inference_datastructures_problem_store.problem_store_strategy_id_index(store));
    }

    public static final SubLObject find_strategy_by_id_alt(SubLObject store, SubLObject strategy_suid) {
	{
	    SubLObject v_id_index = prob_store_strategy_id_index(store);
	    return id_index_lookup(v_id_index, strategy_suid, UNPROVIDED);
	}
    }

    public static SubLObject find_strategy_by_id(final SubLObject store, final SubLObject strategy_suid) {
	final SubLObject v_id_index = inference_datastructures_problem_store.prob_store_strategy_id_index(store);
	return id_index_lookup(v_id_index, strategy_suid, UNPROVIDED);
    }

    public static final SubLObject find_strategy_by_ids_alt(SubLObject store_suid, SubLObject strategy_suid) {
	{
	    SubLObject store = find_problem_store_by_id(store_suid);
	    if (NIL != store) {
		{
		    SubLObject strategy = find_strategy_by_id(store, strategy_suid);
		    return strategy;
		}
	    }
	}
	return NIL;
    }

    public static SubLObject find_strategy_by_ids(final SubLObject store_suid, final SubLObject strategy_suid) {
	final SubLObject store = inference_datastructures_problem_store.find_problem_store_by_id(store_suid);
	if (NIL != store) {
	    final SubLObject strategy = inference_datastructures_problem_store.find_strategy_by_id(store, strategy_suid);
	    return strategy;
	}
	return NIL;
    }

    public static final SubLObject first_problem_store_strategy_alt(SubLObject store) {
	{
	    SubLObject idx = problem_store_strategy_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject strategy = NIL;
		    while (NIL != id) {
			strategy = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, strategy, $SKIP)) {
			    return strategy;
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	}
	return NIL;
    }

    public static SubLObject first_problem_store_strategy(final SubLObject store) {
	final SubLObject idx = inference_datastructures_problem_store.problem_store_strategy_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$38 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$38, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$38);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject strategy;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    strategy = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(strategy)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(strategy)) {
			    strategy = $SKIP;
			}
			return strategy;
		    }
		}
	    }
	    final SubLObject idx_$39 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$39)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$39);
		SubLObject id2 = NIL;
		SubLObject strategy2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    if (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			strategy2 = getEntryValue(cdohash_entry);
			return strategy2;
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return NIL;
    }

    /**
     * Returns the most interesting strategy in STORE, if there is a unique one,
     * otherwise returns :tactical.
     */
    @LispMethod(comment = "Returns the most interesting strategy in STORE, if there is a unique one,\r\notherwise returns :tactical.\nReturns the most interesting strategy in STORE, if there is a unique one,\notherwise returns :tactical.")
    public static final SubLObject problem_store_obvious_strategic_context_alt(SubLObject store) {
	if (ONE_INTEGER.numE(problem_store_strategy_count(store))) {
	    return first_problem_store_strategy(store);
	} else {
	    {
		SubLObject bal_strat = problem_store_unique_balancing_tactician(store);
		if (NIL != bal_strat) {
		    return bal_strat;
		} else {
		    return $TACTICAL;
		}
	    }
	}
    }

    /**
     * Returns the most interesting strategy in STORE, if there is a unique one,
     * otherwise returns :tactical.
     */
    @LispMethod(comment = "Returns the most interesting strategy in STORE, if there is a unique one,\r\notherwise returns :tactical.\nReturns the most interesting strategy in STORE, if there is a unique one,\notherwise returns :tactical.")
    public static SubLObject problem_store_obvious_strategic_context(final SubLObject store) {
	if (ONE_INTEGER.numE(inference_datastructures_problem_store.problem_store_strategy_count(store))) {
	    return inference_datastructures_problem_store.first_problem_store_strategy(store);
	}
	final SubLObject bal_strat = inference_datastructures_problem_store.problem_store_unique_balancing_tactician(store);
	if (NIL != bal_strat) {
	    return bal_strat;
	}
	return $TACTICAL;
    }

    public static final SubLObject problem_store_unique_balancing_tactician_alt(SubLObject store) {
	{
	    SubLObject result = NIL;
	    SubLObject cdolist_list_var = problem_store_strategies(store);
	    SubLObject strategy = NIL;
	    for (strategy = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), strategy = cdolist_list_var.first()) {
		if (NIL != balancing_tactician.balancing_tactician_p(strategy)) {
		    if (NIL != result) {
			return NIL;
		    } else {
			result = strategy;
		    }
		}
	    }
	    return result;
	}
    }

    public static SubLObject problem_store_unique_balancing_tactician(final SubLObject store) {
	SubLObject result = NIL;
	SubLObject cdolist_list_var = inference_datastructures_problem_store.problem_store_strategies(store);
	SubLObject strategy = NIL;
	strategy = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    if (NIL != balancing_tactician.balancing_tactician_p(strategy)) {
		if (NIL != result) {
		    return NIL;
		}
		result = strategy;
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    strategy = cdolist_list_var.first();
	}
	return result;
    }

    /**
     * Return the number of problem links that are currently in STORE.
     */
    @LispMethod(comment = "Return the number of problem links that are currently in STORE.")
    public static final SubLObject problem_store_link_count_alt(SubLObject store) {
	return id_index_count(prob_store_link_id_index(store));
    }

    /**
     * Return the number of problem links that are currently in STORE.
     */
    @LispMethod(comment = "Return the number of problem links that are currently in STORE.")
    public static SubLObject problem_store_link_count(final SubLObject store) {
	return id_index_count(inference_datastructures_problem_store.prob_store_link_id_index(store));
    }

    /**
     * Return the number of problem links that have ever existed in STORE.
     */
    @LispMethod(comment = "Return the number of problem links that have ever existed in STORE.")
    public static final SubLObject problem_store_historical_link_count_alt(SubLObject store) {
	return id_index_next_id(prob_store_link_id_index(store));
    }

    /**
     * Return the number of problem links that have ever existed in STORE.
     */
    @LispMethod(comment = "Return the number of problem links that have ever existed in STORE.")
    public static SubLObject problem_store_historical_link_count(final SubLObject store) {
	return id_index_next_id(inference_datastructures_problem_store.prob_store_link_id_index(store));
    }

    public static final SubLObject find_problem_link_by_id_alt(SubLObject store, SubLObject link_suid) {
	{
	    SubLObject v_id_index = prob_store_link_id_index(store);
	    return id_index_lookup(v_id_index, link_suid, UNPROVIDED);
	}
    }

    public static SubLObject find_problem_link_by_id(final SubLObject store, final SubLObject link_suid) {
	final SubLObject v_id_index = inference_datastructures_problem_store.prob_store_link_id_index(store);
	return id_index_lookup(v_id_index, link_suid, UNPROVIDED);
    }

    public static final SubLObject find_problem_link_by_ids_alt(SubLObject store_suid, SubLObject link_suid) {
	{
	    SubLObject store = find_problem_store_by_id(store_suid);
	    if (NIL != store) {
		return find_problem_link_by_id(store, link_suid);
	    }
	}
	return NIL;
    }

    public static SubLObject find_problem_link_by_ids(final SubLObject store_suid, final SubLObject link_suid) {
	final SubLObject store = inference_datastructures_problem_store.find_problem_store_by_id(store_suid);
	if (NIL != store) {
	    return inference_datastructures_problem_store.find_problem_link_by_id(store, link_suid);
	}
	return NIL;
    }

    /**
     * Return the first problem-link of TYPE in STORE.
     */
    @LispMethod(comment = "Return the first problem-link of TYPE in STORE.")
    public static final SubLObject problem_store_first_link_of_type_alt(SubLObject store, SubLObject type) {
	{
	    SubLObject idx = problem_store_link_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject link = NIL;
		    while (NIL != id) {
			link = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, link, $SKIP)) {
			    if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(link, type)) {
				return link;
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	}
	return NIL;
    }

    /**
     * Return the first problem-link of TYPE in STORE.
     */
    @LispMethod(comment = "Return the first problem-link of TYPE in STORE.")
    public static SubLObject problem_store_first_link_of_type(final SubLObject store, final SubLObject type) {
	final SubLObject idx = inference_datastructures_problem_store.problem_store_link_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$40 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$40, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$40);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject link;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    link = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(link)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(link)) {
			    link = $SKIP;
			}
			if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(link, type)) {
			    return link;
			}
		    }
		}
	    }
	    final SubLObject idx_$41 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$41)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$41);
		SubLObject id2 = NIL;
		SubLObject link2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			link2 = getEntryValue(cdohash_entry);
			if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(link2, type)) {
			    return link2;
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return NIL;
    }

    /**
     * Return the number of problem-links in STORE of TYPE.
     */
    @LispMethod(comment = "Return the number of problem-links in STORE of TYPE.")
    public static final SubLObject problem_store_link_type_count_alt(SubLObject store, SubLObject type) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_link_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject link = NIL;
		    while (NIL != id) {
			link = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, link, $SKIP)) {
			    if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(link, type)) {
				count = add(count, ONE_INTEGER);
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    /**
     * Return the number of problem-links in STORE of TYPE.
     */
    @LispMethod(comment = "Return the number of problem-links in STORE of TYPE.")
    public static SubLObject problem_store_link_type_count(final SubLObject store, final SubLObject type) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_link_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$42 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$42, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$42);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject link;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    link = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(link)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(link)) {
			    link = $SKIP;
			}
			if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(link, type)) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$43 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$43)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$43);
		SubLObject id2 = NIL;
		SubLObject link2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			link2 = getEntryValue(cdohash_entry);
			if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(link2, type)) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    public static final SubLObject problem_store_content_link_count_alt(SubLObject store) {
	return problem_store_link_type_count(store, $CONTENT);
    }

    public static SubLObject problem_store_content_link_count(final SubLObject store) {
	return inference_datastructures_problem_store.problem_store_link_type_count(store, $CONTENT);
    }

    public static final SubLObject problem_store_answer_link_count_alt(SubLObject store) {
	return problem_store_link_type_count(store, $ANSWER);
    }

    public static SubLObject problem_store_answer_link_count(final SubLObject store) {
	return inference_datastructures_problem_store.problem_store_link_type_count(store, $ANSWER);
    }

    public static final SubLObject problem_store_removal_link_count_alt(SubLObject store) {
	return problem_store_link_type_count(store, $REMOVAL);
    }

    public static SubLObject problem_store_removal_link_count(final SubLObject store) {
	return inference_datastructures_problem_store.problem_store_link_type_count(store, $REMOVAL);
    }

    public static final SubLObject problem_store_conjunctive_removal_link_count_alt(SubLObject store) {
	return problem_store_link_type_count(store, $REMOVAL_CONJUNCTIVE);
    }

    public static SubLObject problem_store_conjunctive_removal_link_count(final SubLObject store) {
	return inference_datastructures_problem_store.problem_store_link_type_count(store, $REMOVAL_CONJUNCTIVE);
    }

    public static final SubLObject problem_store_transformation_link_count_alt(SubLObject store) {
	return problem_store_link_type_count(store, $TRANSFORMATION);
    }

    public static SubLObject problem_store_transformation_link_count(final SubLObject store) {
	return inference_datastructures_problem_store.problem_store_link_type_count(store, $TRANSFORMATION);
    }

    public static final SubLObject problem_store_rewrite_link_count_alt(SubLObject store) {
	return problem_store_link_type_count(store, $REWRITE);
    }

    public static SubLObject problem_store_rewrite_link_count(final SubLObject store) {
	return inference_datastructures_problem_store.problem_store_link_type_count(store, $REWRITE);
    }

    public static final SubLObject problem_store_structural_link_count_alt(SubLObject store) {
	return problem_store_link_type_count(store, $STRUCTURAL);
    }

    public static SubLObject problem_store_structural_link_count(final SubLObject store) {
	return inference_datastructures_problem_store.problem_store_link_type_count(store, $STRUCTURAL);
    }

    public static final SubLObject problem_store_join_ordered_link_count_alt(SubLObject store) {
	return problem_store_link_type_count(store, $JOIN_ORDERED);
    }

    public static SubLObject problem_store_join_ordered_link_count(final SubLObject store) {
	return inference_datastructures_problem_store.problem_store_link_type_count(store, $JOIN_ORDERED);
    }

    public static final SubLObject problem_store_join_link_count_alt(SubLObject store) {
	return problem_store_link_type_count(store, $JOIN);
    }

    public static SubLObject problem_store_join_link_count(final SubLObject store) {
	return inference_datastructures_problem_store.problem_store_link_type_count(store, $JOIN);
    }

    public static final SubLObject problem_store_split_link_count_alt(SubLObject store) {
	return problem_store_link_type_count(store, $SPLIT);
    }

    public static SubLObject problem_store_split_link_count(final SubLObject store) {
	return inference_datastructures_problem_store.problem_store_link_type_count(store, $SPLIT);
    }

    public static final SubLObject problem_store_restriction_link_count_alt(SubLObject store) {
	return problem_store_link_type_count(store, $RESTRICTION);
    }

    public static SubLObject problem_store_restriction_link_count(final SubLObject store) {
	return inference_datastructures_problem_store.problem_store_link_type_count(store, $RESTRICTION);
    }

    public static final SubLObject problem_store_residual_transformation_link_count_alt(SubLObject store) {
	return problem_store_link_type_count(store, $RESIDUAL_TRANSFORMATION);
    }

    public static SubLObject problem_store_residual_transformation_link_count(final SubLObject store) {
	return inference_datastructures_problem_store.problem_store_link_type_count(store, $RESIDUAL_TRANSFORMATION);
    }

    public static final SubLObject problem_store_union_link_count_alt(SubLObject store) {
	return problem_store_link_type_count(store, $UNION);
    }

    public static SubLObject problem_store_union_link_count(final SubLObject store) {
	return inference_datastructures_problem_store.problem_store_link_type_count(store, $UNION);
    }

    public static final SubLObject problem_store_unmanifested_non_focal_count_alt(SubLObject store) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_link_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject jo_link = NIL;
		    while (NIL != id) {
			jo_link = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, jo_link, $SKIP)) {
			    if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(jo_link, $JOIN_ORDERED)) {
				if (NIL != inference_datastructures_problem_link.problem_link_with_single_supporting_problem_p(jo_link)) {
				    count = add(count, ONE_INTEGER);
				}
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    public static SubLObject problem_store_unmanifested_non_focal_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_link_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$44 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$44, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$44);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject jo_link;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    jo_link = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(jo_link)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(jo_link)) {
			    jo_link = $SKIP;
			}
			if ((NIL != inference_datastructures_problem_link.problem_link_has_typeP(jo_link, $JOIN_ORDERED)) && (NIL != inference_datastructures_problem_link.problem_link_with_single_supporting_problem_p(jo_link))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$45 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$45)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$45);
		SubLObject id2 = NIL;
		SubLObject jo_link2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			jo_link2 = getEntryValue(cdohash_entry);
			if ((NIL != inference_datastructures_problem_link.problem_link_has_typeP(jo_link2, $JOIN_ORDERED)) && (NIL != inference_datastructures_problem_link.problem_link_with_single_supporting_problem_p(jo_link2))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    /**
     * Return the number of problems that are currently in STORE.
     */
    @LispMethod(comment = "Return the number of problems that are currently in STORE.")
    public static final SubLObject problem_store_problem_count_alt(SubLObject store) {
	return id_index_count(prob_store_problem_id_index(store));
    }

    /**
     * Return the number of problems that are currently in STORE.
     */
    @LispMethod(comment = "Return the number of problems that are currently in STORE.")
    public static SubLObject problem_store_problem_count(final SubLObject store) {
	return id_index_count(inference_datastructures_problem_store.prob_store_problem_id_index(store));
    }

    /**
     * Return the number of problems that have ever existed in STORE.
     */
    @LispMethod(comment = "Return the number of problems that have ever existed in STORE.")
    public static final SubLObject problem_store_historical_problem_count_alt(SubLObject store) {
	return id_index_next_id(prob_store_problem_id_index(store));
    }

    /**
     * Return the number of problems that have ever existed in STORE.
     */
    @LispMethod(comment = "Return the number of problems that have ever existed in STORE.")
    public static SubLObject problem_store_historical_problem_count(final SubLObject store) {
	return id_index_next_id(inference_datastructures_problem_store.prob_store_problem_id_index(store));
    }

    /**
     * 0 or 1 problems counts as empty.
     */
    @LispMethod(comment = "0 or 1 problems counts as empty.")
    public static final SubLObject problem_store_emptyP_alt(SubLObject store) {
	return numLE(problem_store_problem_count(store), ONE_INTEGER);
    }

    /**
     * 0 or 1 problems counts as empty.
     */
    @LispMethod(comment = "0 or 1 problems counts as empty.")
    public static SubLObject problem_store_emptyP(final SubLObject store) {
	return numLE(inference_datastructures_problem_store.problem_store_problem_count(store), ONE_INTEGER);
    }

    /**
     * Given MAX-PROBLEM-COUNT which is the amount of problems above which
     * the problem store will attempt to prune, returns the CRAZY-MAX-PROBLEM-COUNT
     * which is the amount of problems above which the problem store will error
     * without even trying to prune.
     */
    @LispMethod(comment = "Given MAX-PROBLEM-COUNT which is the amount of problems above which\r\nthe problem store will attempt to prune, returns the CRAZY-MAX-PROBLEM-COUNT\r\nwhich is the amount of problems above which the problem store will error\r\nwithout even trying to prune.\nGiven MAX-PROBLEM-COUNT which is the amount of problems above which\nthe problem store will attempt to prune, returns the CRAZY-MAX-PROBLEM-COUNT\nwhich is the amount of problems above which the problem store will error\nwithout even trying to prune.")
    public static final SubLObject compute_crazy_max_problem_count_alt(SubLObject max_problem_count) {
	return number_utilities.potentially_infinite_number_max(number_utilities.potentially_infinite_number_plus(max_problem_count, $int$212), number_utilities.potentially_infinite_number_times(max_problem_count, TWO_INTEGER));
    }

    /**
     * Given MAX-PROBLEM-COUNT which is the amount of problems above which
     * the problem store will attempt to prune, returns the CRAZY-MAX-PROBLEM-COUNT
     * which is the amount of problems above which the problem store will error
     * without even trying to prune.
     */
    @LispMethod(comment = "Given MAX-PROBLEM-COUNT which is the amount of problems above which\r\nthe problem store will attempt to prune, returns the CRAZY-MAX-PROBLEM-COUNT\r\nwhich is the amount of problems above which the problem store will error\r\nwithout even trying to prune.\nGiven MAX-PROBLEM-COUNT which is the amount of problems above which\nthe problem store will attempt to prune, returns the CRAZY-MAX-PROBLEM-COUNT\nwhich is the amount of problems above which the problem store will error\nwithout even trying to prune.")
    public static SubLObject compute_crazy_max_problem_count(final SubLObject max_problem_count) {
	return number_utilities.potentially_infinite_number_max(number_utilities.potentially_infinite_number_plus(max_problem_count, $int$212), number_utilities.potentially_infinite_number_times(max_problem_count, TWO_INTEGER));
    }

    public static final SubLObject problem_store_max_problem_count_reachedP_alt(SubLObject store) {
	{
	    SubLObject max_problem_count = problem_store_max_problem_count(store);
	    return makeBoolean((NIL == number_utilities.positive_infinity_p(max_problem_count)) && problem_store_problem_count(store).numGE(max_problem_count));
	}
    }

    public static SubLObject problem_store_max_problem_count_reachedP(final SubLObject store) {
	final SubLObject max_problem_count = inference_datastructures_problem_store.problem_store_max_problem_count(store);
	return makeBoolean((NIL == number_utilities.positive_infinity_p(max_problem_count)) && inference_datastructures_problem_store.problem_store_problem_count(store).numGE(max_problem_count));
    }

    public static final SubLObject problem_store_max_proof_count_reachedP_alt(SubLObject store) {
	{
	    SubLObject max_problem_count = problem_store_max_problem_count(store);
	    SubLObject max_proof_count = number_utilities.potentially_infinite_number_times(max_problem_count, $max_proof_count_multiplier$.getGlobalValue());
	    return makeBoolean((NIL == number_utilities.positive_infinity_p(max_proof_count)) && problem_store_proof_count(store).numGE(max_proof_count));
	}
    }

    public static SubLObject problem_store_max_proof_count_reachedP(final SubLObject store) {
	final SubLObject max_problem_count = inference_datastructures_problem_store.problem_store_max_problem_count(store);
	final SubLObject max_proof_count = number_utilities.potentially_infinite_number_times(max_problem_count, $max_proof_count_multiplier$.getGlobalValue());
	return makeBoolean((NIL == number_utilities.positive_infinity_p(max_proof_count)) && inference_datastructures_problem_store.problem_store_proof_count(store).numGE(max_proof_count));
    }

    public static final SubLObject problem_store_crazy_max_problem_count_exactly_reachedP_alt(SubLObject store) {
	{
	    SubLObject crazy_max_problem_count = problem_store_crazy_max_problem_count(store);
	    return makeBoolean((NIL == number_utilities.positive_infinity_p(crazy_max_problem_count)) && problem_store_problem_count(store).numE(crazy_max_problem_count));
	}
    }

    public static SubLObject problem_store_crazy_max_problem_count_exactly_reachedP(final SubLObject store) {
	final SubLObject crazy_max_problem_count = inference_datastructures_problem_store.problem_store_crazy_max_problem_count(store);
	return makeBoolean((NIL == number_utilities.positive_infinity_p(crazy_max_problem_count)) && inference_datastructures_problem_store.problem_store_problem_count(store).numE(crazy_max_problem_count));
    }

    public static final SubLObject problem_store_crazy_max_problem_count_reachedP_alt(SubLObject store) {
	{
	    SubLObject crazy_max_problem_count = problem_store_crazy_max_problem_count(store);
	    return makeBoolean((NIL == number_utilities.positive_infinity_p(crazy_max_problem_count)) && problem_store_problem_count(store).numGE(crazy_max_problem_count));
	}
    }

    public static SubLObject problem_store_crazy_max_problem_count_reachedP(final SubLObject store) {
	final SubLObject crazy_max_problem_count = inference_datastructures_problem_store.problem_store_crazy_max_problem_count(store);
	return makeBoolean((NIL == number_utilities.positive_infinity_p(crazy_max_problem_count)) && inference_datastructures_problem_store.problem_store_problem_count(store).numGE(crazy_max_problem_count));
    }

    public static final SubLObject problem_store_allows_proof_processingP_alt(SubLObject store) {
	return makeBoolean((NIL != problem_store_privateP(store)) && (NIL == problem_store_compute_answer_justificationsP(store)));
    }

    public static SubLObject problem_store_allows_proof_processingP(final SubLObject store) {
	return makeBoolean((NIL != inference_datastructures_problem_store.problem_store_privateP(store)) && (NIL == inference_datastructures_problem_store.problem_store_compute_answer_justificationsP(store)));
    }

    public static SubLObject problem_store_allows_problem_hl_free_vars_optimizationP(final SubLObject store) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject result = NIL;
	final SubLObject local_state = inference_datastructures_problem_store.problem_store_memoization_state(store);
	final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
	try {
	    memoization_state.$memoization_state$.bind(local_state, thread);
	    final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
	    try {
		result = inference_datastructures_problem_store.problem_store_allows_problem_hl_free_vars_optimizationP_int(store);
	    } finally {
		final SubLObject _prev_bind_0_$46 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$46, thread);
		}
	    }
	} finally {
	    memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
	}
	return result;
    }

    public static SubLObject problem_store_allows_problem_hl_free_vars_optimizationP_int_internal(final SubLObject store) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	return makeBoolean(
		((NIL == $disable_problem_store_allows_problem_hl_free_vars_optimizationP$.getDynamicValue(thread)) && (NIL == inference_datastructures_problem_store.problem_store_compute_answer_justificationsP(store))) && (NIL != sksi_query_utilities.some_sksi_removal_module_registeredP()));
    }

    public static SubLObject problem_store_allows_problem_hl_free_vars_optimizationP_int(final SubLObject store) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
	SubLObject caching_state = NIL;
	if (NIL == v_memoization_state) {
	    return inference_datastructures_problem_store.problem_store_allows_problem_hl_free_vars_optimizationP_int_internal(store);
	}
	caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym305$PROBLEM_STORE_ALLOWS_PROBLEM_HL_FREE_VARS_OPTIMIZATION__INT, UNPROVIDED);
	if (NIL == caching_state) {
	    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym305$PROBLEM_STORE_ALLOWS_PROBLEM_HL_FREE_VARS_OPTIMIZATION__INT, ONE_INTEGER, NIL, EQ, UNPROVIDED);
	    memoization_state.memoization_state_put(v_memoization_state, $sym305$PROBLEM_STORE_ALLOWS_PROBLEM_HL_FREE_VARS_OPTIMIZATION__INT, caching_state);
	}
	SubLObject results = memoization_state.caching_state_lookup(caching_state, store, memoization_state.$memoized_item_not_found$.getGlobalValue());
	if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
	    results = arg2(thread.resetMultipleValues(), multiple_value_list(inference_datastructures_problem_store.problem_store_allows_problem_hl_free_vars_optimizationP_int_internal(store)));
	    memoization_state.caching_state_put(caching_state, store, results, UNPROVIDED);
	}
	return memoization_state.caching_results(results);
    }

    public static SubLObject problem_identity_depends_on_free_hl_varsP(final SubLObject store) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	return makeBoolean((NIL != $force_problem_identity_depends_on_free_hl_vars$.getDynamicValue(thread)) || (NIL != inference_datastructures_problem_store.problem_store_allows_problem_hl_free_vars_optimizationP(store)));
    }

    public static final SubLObject find_problem_by_id_alt(SubLObject store, SubLObject problem_suid) {
	{
	    SubLObject v_id_index = prob_store_problem_id_index(store);
	    return id_index_lookup(v_id_index, problem_suid, UNPROVIDED);
	}
    }

    public static SubLObject find_problem_by_id(final SubLObject store, final SubLObject problem_suid) {
	final SubLObject v_id_index = inference_datastructures_problem_store.prob_store_problem_id_index(store);
	return id_index_lookup(v_id_index, problem_suid, UNPROVIDED);
    }

    public static final SubLObject find_problem_by_ids_alt(SubLObject store_suid, SubLObject problem_suid) {
	{
	    SubLObject store = find_problem_store_by_id(store_suid);
	    if (NIL != store) {
		return find_problem_by_id(store, problem_suid);
	    }
	}
	return NIL;
    }

    public static SubLObject find_problem_by_ids(final SubLObject store_suid, final SubLObject problem_suid) {
	final SubLObject store = inference_datastructures_problem_store.find_problem_store_by_id(store_suid);
	if (NIL != store) {
	    return inference_datastructures_problem_store.find_problem_by_id(store, problem_suid);
	}
	return NIL;
    }

    public static final SubLObject find_problem_by_query(SubLObject store, SubLObject query) {
	{
	    SubLObject domain = problem_store_equality_reasoning_domain(store);
	    if (NIL != inference_datastructures_problem_query.problem_query_in_equality_reasoning_domainP(query, domain)) {
		return gethash_without_values(query, prob_store_problem_by_query_index(store), UNPROVIDED);
	    }
	}
	return NIL;
    }

    public static SubLObject find_problem_by_query(final SubLObject store, final SubLObject query, SubLObject free_hl_vars) {
	if (free_hl_vars == UNPROVIDED) {
	    free_hl_vars = NIL;
	}
	final SubLObject domain = inference_datastructures_problem_store.problem_store_equality_reasoning_domain(store);
	SubLObject result = NIL;
	if ((NIL != inference_datastructures_problem_query.problem_query_in_equality_reasoning_domainP(query, domain)) && (NIL == result)) {
	    SubLObject csome_list_var = gethash_without_values(query, inference_datastructures_problem_store.prob_store_problems_by_query_index(store), UNPROVIDED);
	    SubLObject problem = NIL;
	    problem = csome_list_var.first();
	    while ((NIL == result) && (NIL != csome_list_var)) {
		if ((NIL == inference_datastructures_problem_store.problem_identity_depends_on_free_hl_varsP(store)) || free_hl_vars.equal(inference_datastructures_problem.problem_free_hl_vars(problem))) {
		    result = problem;
		}
		csome_list_var = csome_list_var.rest();
		problem = csome_list_var.first();
	    }
	}
	return result;
    }

    public static final SubLObject problem_store_tactical_problem_count_alt(SubLObject store) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    if (NIL != inference_datastructures_problem.tactical_problem_p(problem)) {
				count = add(count, ONE_INTEGER);
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    public static SubLObject problem_store_tactical_problem_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$47 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$47, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$47);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			if (NIL != inference_datastructures_problem.tactical_problem_p(problem)) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$48 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$48)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$48);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			if (NIL != inference_datastructures_problem.tactical_problem_p(problem2)) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    public static final SubLObject problem_store_unexamined_problem_count_alt(SubLObject store) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    if (NIL != inference_datastructures_problem.tactically_unexamined_problem_p(problem)) {
				count = add(count, ONE_INTEGER);
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    public static SubLObject problem_store_unexamined_problem_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$49 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$49, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$49);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			if (NIL != inference_datastructures_problem.tactically_unexamined_problem_p(problem)) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$50 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$50)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$50);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			if (NIL != inference_datastructures_problem.tactically_unexamined_problem_p(problem2)) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    public static final SubLObject problem_store_examined_problem_count_alt(SubLObject store) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    if (NIL != inference_datastructures_problem.tactically_examined_problem_p(problem)) {
				count = add(count, ONE_INTEGER);
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    public static SubLObject problem_store_examined_problem_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$51 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$51, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$51);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			if (NIL != inference_datastructures_problem.tactically_examined_problem_p(problem)) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$52 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$52)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$52);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			if (NIL != inference_datastructures_problem.tactically_examined_problem_p(problem2)) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    public static final SubLObject problem_store_possible_problem_count_alt(SubLObject store) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    if (NIL != inference_datastructures_problem.tactically_possible_problem_p(problem)) {
				count = add(count, ONE_INTEGER);
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    public static SubLObject problem_store_possible_problem_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$53 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$53, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$53);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			if (NIL != inference_datastructures_problem.tactically_possible_problem_p(problem)) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$54 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$54)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$54);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			if (NIL != inference_datastructures_problem.tactically_possible_problem_p(problem2)) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    public static final SubLObject problem_store_pending_problem_count_alt(SubLObject store) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    if (NIL != inference_datastructures_problem.tactically_pending_problem_p(problem)) {
				count = add(count, ONE_INTEGER);
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    public static SubLObject problem_store_pending_problem_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$55 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$55, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$55);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			if (NIL != inference_datastructures_problem.tactically_pending_problem_p(problem)) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$56 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$56)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$56);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			if (NIL != inference_datastructures_problem.tactically_pending_problem_p(problem2)) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    public static final SubLObject problem_store_finished_problem_count_alt(SubLObject store) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    if (NIL != inference_datastructures_problem.tactically_finished_problem_p(problem)) {
				count = add(count, ONE_INTEGER);
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    public static SubLObject problem_store_finished_problem_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$57 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$57, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$57);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			if (NIL != inference_datastructures_problem.tactically_finished_problem_p(problem)) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$58 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$58)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$58);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			if (NIL != inference_datastructures_problem.tactically_finished_problem_p(problem2)) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    public static final SubLObject problem_store_good_problem_count_alt(SubLObject store) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    if (NIL != inference_datastructures_problem.tactically_good_problem_p(problem)) {
				count = add(count, ONE_INTEGER);
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    public static SubLObject problem_store_good_problem_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$59 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$59, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$59);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			if (NIL != inference_datastructures_problem.tactically_good_problem_p(problem)) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$60 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$60)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$60);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			if (NIL != inference_datastructures_problem.tactically_good_problem_p(problem2)) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    public static final SubLObject problem_store_neutral_problem_count_alt(SubLObject store) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    if (NIL != inference_datastructures_problem.tactically_neutral_problem_p(problem)) {
				count = add(count, ONE_INTEGER);
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    public static SubLObject problem_store_neutral_problem_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$61 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$61, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$61);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			if (NIL != inference_datastructures_problem.tactically_neutral_problem_p(problem)) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$62 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$62)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$62);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			if (NIL != inference_datastructures_problem.tactically_neutral_problem_p(problem2)) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    public static final SubLObject problem_store_no_good_problem_count_alt(SubLObject store) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    if (NIL != inference_datastructures_problem.tactically_no_good_problem_p(problem)) {
				count = add(count, ONE_INTEGER);
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    public static SubLObject problem_store_no_good_problem_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$63 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$63, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$63);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			if (NIL != inference_datastructures_problem.tactically_no_good_problem_p(problem)) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$64 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$64)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$64);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			if (NIL != inference_datastructures_problem.tactically_no_good_problem_p(problem2)) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    public static final SubLObject problem_store_single_literal_problem_count_alt(SubLObject store) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    if (NIL != inference_datastructures_problem.single_literal_problem_p(problem)) {
				count = add(count, ONE_INTEGER);
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    public static SubLObject problem_store_single_literal_problem_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$65 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$65, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$65);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			if (NIL != inference_datastructures_problem.single_literal_problem_p(problem)) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$66 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$66)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$66);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			if (NIL != inference_datastructures_problem.single_literal_problem_p(problem2)) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    public static final SubLObject problem_store_conjunctive_problem_count_alt(SubLObject store) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    if (NIL != inference_datastructures_problem.conjunctive_problem_p(problem)) {
				count = add(count, ONE_INTEGER);
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    public static SubLObject problem_store_conjunctive_problem_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$67 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$67, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$67);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			if (NIL != inference_datastructures_problem.conjunctive_problem_p(problem)) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$68 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$68)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$68);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			if (NIL != inference_datastructures_problem.conjunctive_problem_p(problem2)) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    public static final SubLObject problem_store_join_problem_count_alt(SubLObject store) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    if (NIL != inference_datastructures_problem.join_problem_p(problem)) {
				count = add(count, ONE_INTEGER);
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    public static SubLObject problem_store_join_problem_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$69 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$69, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$69);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			if (NIL != inference_datastructures_problem.join_problem_p(problem)) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$70 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$70)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$70);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			if (NIL != inference_datastructures_problem.join_problem_p(problem2)) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    public static final SubLObject problem_store_split_problem_count_alt(SubLObject store) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    if (NIL != inference_datastructures_problem.split_problem_p(problem)) {
				count = add(count, ONE_INTEGER);
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    public static SubLObject problem_store_split_problem_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$71 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$71, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$71);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			if (NIL != inference_datastructures_problem.split_problem_p(problem)) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$72 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$72)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$72);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			if (NIL != inference_datastructures_problem.split_problem_p(problem2)) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    public static final SubLObject problem_store_disjunctive_problem_count_alt(SubLObject store) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    if (NIL != inference_datastructures_problem.disjunctive_problem_p(problem)) {
				count = add(count, ONE_INTEGER);
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    public static SubLObject problem_store_disjunctive_problem_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$73 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$73, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$73);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			if (NIL != inference_datastructures_problem.disjunctive_problem_p(problem)) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$74 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$74)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$74);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			if (NIL != inference_datastructures_problem.disjunctive_problem_p(problem2)) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    public static final SubLObject problem_store_unexamined_good_problem_count_alt(SubLObject store) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    if ((NIL != inference_datastructures_problem.tactically_unexamined_problem_p(problem)) && (NIL != inference_datastructures_problem.tactically_good_problem_p(problem))) {
				count = add(count, ONE_INTEGER);
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    public static SubLObject problem_store_unexamined_good_problem_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$75 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$75, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$75);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			if ((NIL != inference_datastructures_problem.tactically_unexamined_problem_p(problem)) && (NIL != inference_datastructures_problem.tactically_good_problem_p(problem))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$76 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$76)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$76);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			if ((NIL != inference_datastructures_problem.tactically_unexamined_problem_p(problem2)) && (NIL != inference_datastructures_problem.tactically_good_problem_p(problem2))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    public static final SubLObject problem_store_examined_good_problem_count_alt(SubLObject store) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    if ((NIL != inference_datastructures_problem.tactically_examined_problem_p(problem)) && (NIL != inference_datastructures_problem.tactically_good_problem_p(problem))) {
				count = add(count, ONE_INTEGER);
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    public static SubLObject problem_store_examined_good_problem_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$77 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$77, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$77);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			if ((NIL != inference_datastructures_problem.tactically_examined_problem_p(problem)) && (NIL != inference_datastructures_problem.tactically_good_problem_p(problem))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$78 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$78)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$78);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			if ((NIL != inference_datastructures_problem.tactically_examined_problem_p(problem2)) && (NIL != inference_datastructures_problem.tactically_good_problem_p(problem2))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    public static final SubLObject problem_store_possible_good_problem_count_alt(SubLObject store) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    if ((NIL != inference_datastructures_problem.tactically_possible_problem_p(problem)) && (NIL != inference_datastructures_problem.tactically_good_problem_p(problem))) {
				count = add(count, ONE_INTEGER);
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    public static SubLObject problem_store_possible_good_problem_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$79 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$79, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$79);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			if ((NIL != inference_datastructures_problem.tactically_possible_problem_p(problem)) && (NIL != inference_datastructures_problem.tactically_good_problem_p(problem))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$80 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$80)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$80);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			if ((NIL != inference_datastructures_problem.tactically_possible_problem_p(problem2)) && (NIL != inference_datastructures_problem.tactically_good_problem_p(problem2))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    public static final SubLObject problem_store_pending_good_problem_count_alt(SubLObject store) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    if ((NIL != inference_datastructures_problem.tactically_pending_problem_p(problem)) && (NIL != inference_datastructures_problem.tactically_good_problem_p(problem))) {
				count = add(count, ONE_INTEGER);
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    public static SubLObject problem_store_pending_good_problem_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$81 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$81, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$81);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			if ((NIL != inference_datastructures_problem.tactically_pending_problem_p(problem)) && (NIL != inference_datastructures_problem.tactically_good_problem_p(problem))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$82 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$82)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$82);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			if ((NIL != inference_datastructures_problem.tactically_pending_problem_p(problem2)) && (NIL != inference_datastructures_problem.tactically_good_problem_p(problem2))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    public static final SubLObject problem_store_finished_good_problem_count_alt(SubLObject store) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    if ((NIL != inference_datastructures_problem.tactically_finished_problem_p(problem)) && (NIL != inference_datastructures_problem.tactically_good_problem_p(problem))) {
				count = add(count, ONE_INTEGER);
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    public static SubLObject problem_store_finished_good_problem_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$83 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$83, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$83);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			if ((NIL != inference_datastructures_problem.tactically_finished_problem_p(problem)) && (NIL != inference_datastructures_problem.tactically_good_problem_p(problem))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$84 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$84)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$84);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			if ((NIL != inference_datastructures_problem.tactically_finished_problem_p(problem2)) && (NIL != inference_datastructures_problem.tactically_good_problem_p(problem2))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    public static final SubLObject problem_store_unexamined_neutral_problem_count_alt(SubLObject store) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    if ((NIL != inference_datastructures_problem.tactically_unexamined_problem_p(problem)) && (NIL != inference_datastructures_problem.tactically_neutral_problem_p(problem))) {
				count = add(count, ONE_INTEGER);
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    public static SubLObject problem_store_unexamined_neutral_problem_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$85 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$85, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$85);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			if ((NIL != inference_datastructures_problem.tactically_unexamined_problem_p(problem)) && (NIL != inference_datastructures_problem.tactically_neutral_problem_p(problem))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$86 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$86)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$86);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			if ((NIL != inference_datastructures_problem.tactically_unexamined_problem_p(problem2)) && (NIL != inference_datastructures_problem.tactically_neutral_problem_p(problem2))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    public static final SubLObject problem_store_examined_neutral_problem_count_alt(SubLObject store) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    if ((NIL != inference_datastructures_problem.tactically_examined_problem_p(problem)) && (NIL != inference_datastructures_problem.tactically_neutral_problem_p(problem))) {
				count = add(count, ONE_INTEGER);
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    public static SubLObject problem_store_examined_neutral_problem_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$87 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$87, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$87);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			if ((NIL != inference_datastructures_problem.tactically_examined_problem_p(problem)) && (NIL != inference_datastructures_problem.tactically_neutral_problem_p(problem))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$88 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$88)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$88);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			if ((NIL != inference_datastructures_problem.tactically_examined_problem_p(problem2)) && (NIL != inference_datastructures_problem.tactically_neutral_problem_p(problem2))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    public static final SubLObject problem_store_possible_neutral_problem_count_alt(SubLObject store) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    if ((NIL != inference_datastructures_problem.tactically_possible_problem_p(problem)) && (NIL != inference_datastructures_problem.tactically_neutral_problem_p(problem))) {
				count = add(count, ONE_INTEGER);
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    public static SubLObject problem_store_possible_neutral_problem_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$89 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$89, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$89);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			if ((NIL != inference_datastructures_problem.tactically_possible_problem_p(problem)) && (NIL != inference_datastructures_problem.tactically_neutral_problem_p(problem))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$90 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$90)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$90);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			if ((NIL != inference_datastructures_problem.tactically_possible_problem_p(problem2)) && (NIL != inference_datastructures_problem.tactically_neutral_problem_p(problem2))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    public static final SubLObject problem_store_pending_neutral_problem_count_alt(SubLObject store) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    if ((NIL != inference_datastructures_problem.tactically_pending_problem_p(problem)) && (NIL != inference_datastructures_problem.tactically_neutral_problem_p(problem))) {
				count = add(count, ONE_INTEGER);
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    public static SubLObject problem_store_pending_neutral_problem_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$91 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$91, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$91);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			if ((NIL != inference_datastructures_problem.tactically_pending_problem_p(problem)) && (NIL != inference_datastructures_problem.tactically_neutral_problem_p(problem))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$92 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$92)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$92);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			if ((NIL != inference_datastructures_problem.tactically_pending_problem_p(problem2)) && (NIL != inference_datastructures_problem.tactically_neutral_problem_p(problem2))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    public static final SubLObject problem_store_finished_neutral_problem_count_alt(SubLObject store) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    if ((NIL != inference_datastructures_problem.tactically_finished_problem_p(problem)) && (NIL != inference_datastructures_problem.tactically_neutral_problem_p(problem))) {
				count = add(count, ONE_INTEGER);
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    public static SubLObject problem_store_finished_neutral_problem_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$93 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$93, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$93);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			if ((NIL != inference_datastructures_problem.tactically_finished_problem_p(problem)) && (NIL != inference_datastructures_problem.tactically_neutral_problem_p(problem))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$94 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$94)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$94);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			if ((NIL != inference_datastructures_problem.tactically_finished_problem_p(problem2)) && (NIL != inference_datastructures_problem.tactically_neutral_problem_p(problem2))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    public static final SubLObject problem_store_unexamined_no_good_problem_count_alt(SubLObject store) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    if ((NIL != inference_datastructures_problem.tactically_unexamined_problem_p(problem)) && (NIL != inference_datastructures_problem.tactically_no_good_problem_p(problem))) {
				count = add(count, ONE_INTEGER);
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    public static SubLObject problem_store_unexamined_no_good_problem_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$95 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$95, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$95);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			if ((NIL != inference_datastructures_problem.tactically_unexamined_problem_p(problem)) && (NIL != inference_datastructures_problem.tactically_no_good_problem_p(problem))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$96 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$96)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$96);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			if ((NIL != inference_datastructures_problem.tactically_unexamined_problem_p(problem2)) && (NIL != inference_datastructures_problem.tactically_no_good_problem_p(problem2))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    public static final SubLObject problem_store_examined_no_good_problem_count_alt(SubLObject store) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    if ((NIL != inference_datastructures_problem.tactically_examined_problem_p(problem)) && (NIL != inference_datastructures_problem.tactically_no_good_problem_p(problem))) {
				count = add(count, ONE_INTEGER);
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    public static SubLObject problem_store_examined_no_good_problem_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$97 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$97, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$97);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			if ((NIL != inference_datastructures_problem.tactically_examined_problem_p(problem)) && (NIL != inference_datastructures_problem.tactically_no_good_problem_p(problem))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$98 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$98)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$98);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			if ((NIL != inference_datastructures_problem.tactically_examined_problem_p(problem2)) && (NIL != inference_datastructures_problem.tactically_no_good_problem_p(problem2))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    public static final SubLObject problem_store_possible_no_good_problem_count_alt(SubLObject store) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    if ((NIL != inference_datastructures_problem.tactically_possible_problem_p(problem)) && (NIL != inference_datastructures_problem.tactically_no_good_problem_p(problem))) {
				count = add(count, ONE_INTEGER);
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    public static SubLObject problem_store_possible_no_good_problem_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$99 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$99, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$99);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			if ((NIL != inference_datastructures_problem.tactically_possible_problem_p(problem)) && (NIL != inference_datastructures_problem.tactically_no_good_problem_p(problem))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$100 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$100)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$100);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			if ((NIL != inference_datastructures_problem.tactically_possible_problem_p(problem2)) && (NIL != inference_datastructures_problem.tactically_no_good_problem_p(problem2))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    public static final SubLObject problem_store_pending_no_good_problem_count_alt(SubLObject store) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    if ((NIL != inference_datastructures_problem.tactically_pending_problem_p(problem)) && (NIL != inference_datastructures_problem.tactically_no_good_problem_p(problem))) {
				count = add(count, ONE_INTEGER);
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    public static SubLObject problem_store_pending_no_good_problem_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$101 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$101, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$101);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			if ((NIL != inference_datastructures_problem.tactically_pending_problem_p(problem)) && (NIL != inference_datastructures_problem.tactically_no_good_problem_p(problem))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$102 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$102)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$102);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			if ((NIL != inference_datastructures_problem.tactically_pending_problem_p(problem2)) && (NIL != inference_datastructures_problem.tactically_no_good_problem_p(problem2))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    public static final SubLObject problem_store_finished_no_good_problem_count_alt(SubLObject store) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    if ((NIL != inference_datastructures_problem.tactically_finished_problem_p(problem)) && (NIL != inference_datastructures_problem.tactically_no_good_problem_p(problem))) {
				count = add(count, ONE_INTEGER);
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    public static SubLObject problem_store_finished_no_good_problem_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$103 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$103, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$103);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			if ((NIL != inference_datastructures_problem.tactically_finished_problem_p(problem)) && (NIL != inference_datastructures_problem.tactically_no_good_problem_p(problem))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$104 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$104)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$104);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			if ((NIL != inference_datastructures_problem.tactically_finished_problem_p(problem2)) && (NIL != inference_datastructures_problem.tactically_no_good_problem_p(problem2))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    public static final SubLObject problem_store_good_single_literal_problem_count_alt(SubLObject store) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    if ((NIL != inference_datastructures_problem.tactically_good_problem_p(problem)) && (NIL != inference_datastructures_problem.single_literal_problem_p(problem))) {
				count = add(count, ONE_INTEGER);
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    public static SubLObject problem_store_good_single_literal_problem_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$105 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$105, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$105);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			if ((NIL != inference_datastructures_problem.tactically_good_problem_p(problem)) && (NIL != inference_datastructures_problem.single_literal_problem_p(problem))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$106 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$106)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$106);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			if ((NIL != inference_datastructures_problem.tactically_good_problem_p(problem2)) && (NIL != inference_datastructures_problem.single_literal_problem_p(problem2))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    public static final SubLObject problem_store_good_conjunctive_problem_count_alt(SubLObject store) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    if ((NIL != inference_datastructures_problem.tactically_good_problem_p(problem)) && (NIL != inference_datastructures_problem.conjunctive_problem_p(problem))) {
				count = add(count, ONE_INTEGER);
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    public static SubLObject problem_store_good_conjunctive_problem_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$107 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$107, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$107);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			if ((NIL != inference_datastructures_problem.tactically_good_problem_p(problem)) && (NIL != inference_datastructures_problem.conjunctive_problem_p(problem))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$108 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$108)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$108);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			if ((NIL != inference_datastructures_problem.tactically_good_problem_p(problem2)) && (NIL != inference_datastructures_problem.conjunctive_problem_p(problem2))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    public static final SubLObject problem_store_good_join_problem_count_alt(SubLObject store) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    if ((NIL != inference_datastructures_problem.tactically_good_problem_p(problem)) && (NIL != inference_datastructures_problem.join_problem_p(problem))) {
				count = add(count, ONE_INTEGER);
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    public static SubLObject problem_store_good_join_problem_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$109 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$109, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$109);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			if ((NIL != inference_datastructures_problem.tactically_good_problem_p(problem)) && (NIL != inference_datastructures_problem.join_problem_p(problem))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$110 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$110)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$110);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			if ((NIL != inference_datastructures_problem.tactically_good_problem_p(problem2)) && (NIL != inference_datastructures_problem.join_problem_p(problem2))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    public static final SubLObject problem_store_good_split_problem_count_alt(SubLObject store) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    if ((NIL != inference_datastructures_problem.tactically_good_problem_p(problem)) && (NIL != inference_datastructures_problem.split_problem_p(problem))) {
				count = add(count, ONE_INTEGER);
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    public static SubLObject problem_store_good_split_problem_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$111 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$111, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$111);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			if ((NIL != inference_datastructures_problem.tactically_good_problem_p(problem)) && (NIL != inference_datastructures_problem.split_problem_p(problem))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$112 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$112)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$112);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			if ((NIL != inference_datastructures_problem.tactically_good_problem_p(problem2)) && (NIL != inference_datastructures_problem.split_problem_p(problem2))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    public static final SubLObject problem_store_good_disjunctive_problem_count_alt(SubLObject store) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    if ((NIL != inference_datastructures_problem.tactically_good_problem_p(problem)) && (NIL != inference_datastructures_problem.disjunctive_problem_p(problem))) {
				count = add(count, ONE_INTEGER);
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    public static SubLObject problem_store_good_disjunctive_problem_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$113 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$113, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$113);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			if ((NIL != inference_datastructures_problem.tactically_good_problem_p(problem)) && (NIL != inference_datastructures_problem.disjunctive_problem_p(problem))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$114 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$114)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$114);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			if ((NIL != inference_datastructures_problem.tactically_good_problem_p(problem2)) && (NIL != inference_datastructures_problem.disjunctive_problem_p(problem2))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    public static final SubLObject problem_store_neutral_single_literal_problem_count_alt(SubLObject store) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    if ((NIL != inference_datastructures_problem.tactically_neutral_problem_p(problem)) && (NIL != inference_datastructures_problem.single_literal_problem_p(problem))) {
				count = add(count, ONE_INTEGER);
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    public static SubLObject problem_store_neutral_single_literal_problem_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$115 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$115, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$115);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			if ((NIL != inference_datastructures_problem.tactically_neutral_problem_p(problem)) && (NIL != inference_datastructures_problem.single_literal_problem_p(problem))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$116 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$116)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$116);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			if ((NIL != inference_datastructures_problem.tactically_neutral_problem_p(problem2)) && (NIL != inference_datastructures_problem.single_literal_problem_p(problem2))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    public static final SubLObject problem_store_neutral_conjunctive_problem_count_alt(SubLObject store) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    if ((NIL != inference_datastructures_problem.tactically_neutral_problem_p(problem)) && (NIL != inference_datastructures_problem.conjunctive_problem_p(problem))) {
				count = add(count, ONE_INTEGER);
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    public static SubLObject problem_store_neutral_conjunctive_problem_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$117 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$117, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$117);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			if ((NIL != inference_datastructures_problem.tactically_neutral_problem_p(problem)) && (NIL != inference_datastructures_problem.conjunctive_problem_p(problem))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$118 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$118)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$118);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			if ((NIL != inference_datastructures_problem.tactically_neutral_problem_p(problem2)) && (NIL != inference_datastructures_problem.conjunctive_problem_p(problem2))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    public static final SubLObject problem_store_neutral_join_problem_count_alt(SubLObject store) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    if ((NIL != inference_datastructures_problem.tactically_neutral_problem_p(problem)) && (NIL != inference_datastructures_problem.join_problem_p(problem))) {
				count = add(count, ONE_INTEGER);
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    public static SubLObject problem_store_neutral_join_problem_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$119 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$119, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$119);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			if ((NIL != inference_datastructures_problem.tactically_neutral_problem_p(problem)) && (NIL != inference_datastructures_problem.join_problem_p(problem))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$120 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$120)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$120);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			if ((NIL != inference_datastructures_problem.tactically_neutral_problem_p(problem2)) && (NIL != inference_datastructures_problem.join_problem_p(problem2))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    public static final SubLObject problem_store_neutral_split_problem_count_alt(SubLObject store) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    if ((NIL != inference_datastructures_problem.tactically_neutral_problem_p(problem)) && (NIL != inference_datastructures_problem.split_problem_p(problem))) {
				count = add(count, ONE_INTEGER);
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    public static SubLObject problem_store_neutral_split_problem_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$121 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$121, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$121);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			if ((NIL != inference_datastructures_problem.tactically_neutral_problem_p(problem)) && (NIL != inference_datastructures_problem.split_problem_p(problem))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$122 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$122)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$122);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			if ((NIL != inference_datastructures_problem.tactically_neutral_problem_p(problem2)) && (NIL != inference_datastructures_problem.split_problem_p(problem2))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    public static final SubLObject problem_store_neutral_disjunctive_problem_count_alt(SubLObject store) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    if ((NIL != inference_datastructures_problem.tactically_neutral_problem_p(problem)) && (NIL != inference_datastructures_problem.disjunctive_problem_p(problem))) {
				count = add(count, ONE_INTEGER);
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    public static SubLObject problem_store_neutral_disjunctive_problem_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$123 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$123, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$123);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			if ((NIL != inference_datastructures_problem.tactically_neutral_problem_p(problem)) && (NIL != inference_datastructures_problem.disjunctive_problem_p(problem))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$124 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$124)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$124);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			if ((NIL != inference_datastructures_problem.tactically_neutral_problem_p(problem2)) && (NIL != inference_datastructures_problem.disjunctive_problem_p(problem2))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    public static final SubLObject problem_store_no_good_single_literal_problem_count_alt(SubLObject store) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    if ((NIL != inference_datastructures_problem.tactically_no_good_problem_p(problem)) && (NIL != inference_datastructures_problem.single_literal_problem_p(problem))) {
				count = add(count, ONE_INTEGER);
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    public static SubLObject problem_store_no_good_single_literal_problem_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$125 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$125, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$125);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			if ((NIL != inference_datastructures_problem.tactically_no_good_problem_p(problem)) && (NIL != inference_datastructures_problem.single_literal_problem_p(problem))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$126 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$126)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$126);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			if ((NIL != inference_datastructures_problem.tactically_no_good_problem_p(problem2)) && (NIL != inference_datastructures_problem.single_literal_problem_p(problem2))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    public static final SubLObject problem_store_no_good_conjunctive_problem_count_alt(SubLObject store) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    if ((NIL != inference_datastructures_problem.tactically_no_good_problem_p(problem)) && (NIL != inference_datastructures_problem.conjunctive_problem_p(problem))) {
				count = add(count, ONE_INTEGER);
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    public static SubLObject problem_store_no_good_conjunctive_problem_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$127 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$127, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$127);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			if ((NIL != inference_datastructures_problem.tactically_no_good_problem_p(problem)) && (NIL != inference_datastructures_problem.conjunctive_problem_p(problem))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$128 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$128)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$128);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			if ((NIL != inference_datastructures_problem.tactically_no_good_problem_p(problem2)) && (NIL != inference_datastructures_problem.conjunctive_problem_p(problem2))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    public static final SubLObject problem_store_no_good_join_problem_count_alt(SubLObject store) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    if ((NIL != inference_datastructures_problem.tactically_no_good_problem_p(problem)) && (NIL != inference_datastructures_problem.join_problem_p(problem))) {
				count = add(count, ONE_INTEGER);
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    public static SubLObject problem_store_no_good_join_problem_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$129 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$129, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$129);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			if ((NIL != inference_datastructures_problem.tactically_no_good_problem_p(problem)) && (NIL != inference_datastructures_problem.join_problem_p(problem))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$130 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$130)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$130);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			if ((NIL != inference_datastructures_problem.tactically_no_good_problem_p(problem2)) && (NIL != inference_datastructures_problem.join_problem_p(problem2))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    public static final SubLObject problem_store_no_good_split_problem_count_alt(SubLObject store) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    if ((NIL != inference_datastructures_problem.tactically_no_good_problem_p(problem)) && (NIL != inference_datastructures_problem.split_problem_p(problem))) {
				count = add(count, ONE_INTEGER);
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    public static SubLObject problem_store_no_good_split_problem_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$131 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$131, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$131);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			if ((NIL != inference_datastructures_problem.tactically_no_good_problem_p(problem)) && (NIL != inference_datastructures_problem.split_problem_p(problem))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$132 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$132)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$132);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			if ((NIL != inference_datastructures_problem.tactically_no_good_problem_p(problem2)) && (NIL != inference_datastructures_problem.split_problem_p(problem2))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    public static final SubLObject problem_store_no_good_disjunctive_problem_count_alt(SubLObject store) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    if ((NIL != inference_datastructures_problem.tactically_no_good_problem_p(problem)) && (NIL != inference_datastructures_problem.disjunctive_problem_p(problem))) {
				count = add(count, ONE_INTEGER);
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    public static SubLObject problem_store_no_good_disjunctive_problem_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$133 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$133, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$133);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			if ((NIL != inference_datastructures_problem.tactically_no_good_problem_p(problem)) && (NIL != inference_datastructures_problem.disjunctive_problem_p(problem))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$134 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$134)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$134);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			if ((NIL != inference_datastructures_problem.tactically_no_good_problem_p(problem2)) && (NIL != inference_datastructures_problem.disjunctive_problem_p(problem2))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    public static final SubLObject problem_store_unexamined_single_literal_problem_count_alt(SubLObject store) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    if ((NIL != inference_datastructures_problem.tactically_unexamined_problem_p(problem)) && (NIL != inference_datastructures_problem.single_literal_problem_p(problem))) {
				count = add(count, ONE_INTEGER);
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    public static SubLObject problem_store_unexamined_single_literal_problem_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$135 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$135, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$135);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			if ((NIL != inference_datastructures_problem.tactically_unexamined_problem_p(problem)) && (NIL != inference_datastructures_problem.single_literal_problem_p(problem))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$136 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$136)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$136);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			if ((NIL != inference_datastructures_problem.tactically_unexamined_problem_p(problem2)) && (NIL != inference_datastructures_problem.single_literal_problem_p(problem2))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    public static final SubLObject problem_store_unexamined_conjunctive_problem_count_alt(SubLObject store) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    if ((NIL != inference_datastructures_problem.tactically_unexamined_problem_p(problem)) && (NIL != inference_datastructures_problem.conjunctive_problem_p(problem))) {
				count = add(count, ONE_INTEGER);
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    public static SubLObject problem_store_unexamined_conjunctive_problem_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$137 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$137, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$137);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			if ((NIL != inference_datastructures_problem.tactically_unexamined_problem_p(problem)) && (NIL != inference_datastructures_problem.conjunctive_problem_p(problem))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$138 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$138)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$138);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			if ((NIL != inference_datastructures_problem.tactically_unexamined_problem_p(problem2)) && (NIL != inference_datastructures_problem.conjunctive_problem_p(problem2))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    public static final SubLObject problem_store_unexamined_join_problem_count_alt(SubLObject store) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    if ((NIL != inference_datastructures_problem.tactically_unexamined_problem_p(problem)) && (NIL != inference_datastructures_problem.join_problem_p(problem))) {
				count = add(count, ONE_INTEGER);
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    public static SubLObject problem_store_unexamined_join_problem_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$139 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$139, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$139);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			if ((NIL != inference_datastructures_problem.tactically_unexamined_problem_p(problem)) && (NIL != inference_datastructures_problem.join_problem_p(problem))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$140 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$140)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$140);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			if ((NIL != inference_datastructures_problem.tactically_unexamined_problem_p(problem2)) && (NIL != inference_datastructures_problem.join_problem_p(problem2))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    public static final SubLObject problem_store_unexamined_split_problem_count_alt(SubLObject store) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    if ((NIL != inference_datastructures_problem.tactically_unexamined_problem_p(problem)) && (NIL != inference_datastructures_problem.split_problem_p(problem))) {
				count = add(count, ONE_INTEGER);
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    public static SubLObject problem_store_unexamined_split_problem_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$141 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$141, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$141);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			if ((NIL != inference_datastructures_problem.tactically_unexamined_problem_p(problem)) && (NIL != inference_datastructures_problem.split_problem_p(problem))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$142 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$142)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$142);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			if ((NIL != inference_datastructures_problem.tactically_unexamined_problem_p(problem2)) && (NIL != inference_datastructures_problem.split_problem_p(problem2))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    public static final SubLObject problem_store_unexamined_disjunctive_problem_count_alt(SubLObject store) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    if ((NIL != inference_datastructures_problem.tactically_unexamined_problem_p(problem)) && (NIL != inference_datastructures_problem.disjunctive_problem_p(problem))) {
				count = add(count, ONE_INTEGER);
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    public static SubLObject problem_store_unexamined_disjunctive_problem_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$143 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$143, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$143);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			if ((NIL != inference_datastructures_problem.tactically_unexamined_problem_p(problem)) && (NIL != inference_datastructures_problem.disjunctive_problem_p(problem))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$144 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$144)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$144);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			if ((NIL != inference_datastructures_problem.tactically_unexamined_problem_p(problem2)) && (NIL != inference_datastructures_problem.disjunctive_problem_p(problem2))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    public static final SubLObject problem_store_examined_single_literal_problem_count_alt(SubLObject store) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    if ((NIL != inference_datastructures_problem.tactically_examined_problem_p(problem)) && (NIL != inference_datastructures_problem.single_literal_problem_p(problem))) {
				count = add(count, ONE_INTEGER);
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    public static SubLObject problem_store_examined_single_literal_problem_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$145 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$145, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$145);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			if ((NIL != inference_datastructures_problem.tactically_examined_problem_p(problem)) && (NIL != inference_datastructures_problem.single_literal_problem_p(problem))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$146 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$146)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$146);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			if ((NIL != inference_datastructures_problem.tactically_examined_problem_p(problem2)) && (NIL != inference_datastructures_problem.single_literal_problem_p(problem2))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    public static final SubLObject problem_store_examined_conjunctive_problem_count_alt(SubLObject store) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    if ((NIL != inference_datastructures_problem.tactically_examined_problem_p(problem)) && (NIL != inference_datastructures_problem.conjunctive_problem_p(problem))) {
				count = add(count, ONE_INTEGER);
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    public static SubLObject problem_store_examined_conjunctive_problem_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$147 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$147, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$147);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			if ((NIL != inference_datastructures_problem.tactically_examined_problem_p(problem)) && (NIL != inference_datastructures_problem.conjunctive_problem_p(problem))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$148 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$148)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$148);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			if ((NIL != inference_datastructures_problem.tactically_examined_problem_p(problem2)) && (NIL != inference_datastructures_problem.conjunctive_problem_p(problem2))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    public static final SubLObject problem_store_examined_join_problem_count_alt(SubLObject store) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    if ((NIL != inference_datastructures_problem.tactically_examined_problem_p(problem)) && (NIL != inference_datastructures_problem.join_problem_p(problem))) {
				count = add(count, ONE_INTEGER);
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    public static SubLObject problem_store_examined_join_problem_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$149 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$149, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$149);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			if ((NIL != inference_datastructures_problem.tactically_examined_problem_p(problem)) && (NIL != inference_datastructures_problem.join_problem_p(problem))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$150 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$150)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$150);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			if ((NIL != inference_datastructures_problem.tactically_examined_problem_p(problem2)) && (NIL != inference_datastructures_problem.join_problem_p(problem2))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    public static final SubLObject problem_store_examined_split_problem_count_alt(SubLObject store) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    if ((NIL != inference_datastructures_problem.tactically_examined_problem_p(problem)) && (NIL != inference_datastructures_problem.split_problem_p(problem))) {
				count = add(count, ONE_INTEGER);
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    public static SubLObject problem_store_examined_split_problem_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$151 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$151, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$151);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			if ((NIL != inference_datastructures_problem.tactically_examined_problem_p(problem)) && (NIL != inference_datastructures_problem.split_problem_p(problem))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$152 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$152)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$152);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			if ((NIL != inference_datastructures_problem.tactically_examined_problem_p(problem2)) && (NIL != inference_datastructures_problem.split_problem_p(problem2))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    public static final SubLObject problem_store_examined_disjunctive_problem_count_alt(SubLObject store) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    if ((NIL != inference_datastructures_problem.tactically_examined_problem_p(problem)) && (NIL != inference_datastructures_problem.disjunctive_problem_p(problem))) {
				count = add(count, ONE_INTEGER);
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    public static SubLObject problem_store_examined_disjunctive_problem_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$153 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$153, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$153);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			if ((NIL != inference_datastructures_problem.tactically_examined_problem_p(problem)) && (NIL != inference_datastructures_problem.disjunctive_problem_p(problem))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$154 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$154)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$154);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			if ((NIL != inference_datastructures_problem.tactically_examined_problem_p(problem2)) && (NIL != inference_datastructures_problem.disjunctive_problem_p(problem2))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    public static final SubLObject problem_store_possible_single_literal_problem_count_alt(SubLObject store) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    if ((NIL != inference_datastructures_problem.tactically_possible_problem_p(problem)) && (NIL != inference_datastructures_problem.single_literal_problem_p(problem))) {
				count = add(count, ONE_INTEGER);
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    public static SubLObject problem_store_possible_single_literal_problem_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$155 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$155, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$155);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			if ((NIL != inference_datastructures_problem.tactically_possible_problem_p(problem)) && (NIL != inference_datastructures_problem.single_literal_problem_p(problem))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$156 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$156)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$156);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			if ((NIL != inference_datastructures_problem.tactically_possible_problem_p(problem2)) && (NIL != inference_datastructures_problem.single_literal_problem_p(problem2))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    public static final SubLObject problem_store_possible_conjunctive_problem_count_alt(SubLObject store) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    if ((NIL != inference_datastructures_problem.tactically_possible_problem_p(problem)) && (NIL != inference_datastructures_problem.conjunctive_problem_p(problem))) {
				count = add(count, ONE_INTEGER);
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    public static SubLObject problem_store_possible_conjunctive_problem_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$157 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$157, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$157);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			if ((NIL != inference_datastructures_problem.tactically_possible_problem_p(problem)) && (NIL != inference_datastructures_problem.conjunctive_problem_p(problem))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$158 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$158)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$158);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			if ((NIL != inference_datastructures_problem.tactically_possible_problem_p(problem2)) && (NIL != inference_datastructures_problem.conjunctive_problem_p(problem2))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    public static final SubLObject problem_store_possible_join_problem_count_alt(SubLObject store) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    if ((NIL != inference_datastructures_problem.tactically_possible_problem_p(problem)) && (NIL != inference_datastructures_problem.join_problem_p(problem))) {
				count = add(count, ONE_INTEGER);
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    public static SubLObject problem_store_possible_join_problem_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$159 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$159, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$159);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			if ((NIL != inference_datastructures_problem.tactically_possible_problem_p(problem)) && (NIL != inference_datastructures_problem.join_problem_p(problem))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$160 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$160)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$160);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			if ((NIL != inference_datastructures_problem.tactically_possible_problem_p(problem2)) && (NIL != inference_datastructures_problem.join_problem_p(problem2))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    public static final SubLObject problem_store_possible_split_problem_count_alt(SubLObject store) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    if ((NIL != inference_datastructures_problem.tactically_possible_problem_p(problem)) && (NIL != inference_datastructures_problem.split_problem_p(problem))) {
				count = add(count, ONE_INTEGER);
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    public static SubLObject problem_store_possible_split_problem_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$161 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$161, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$161);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			if ((NIL != inference_datastructures_problem.tactically_possible_problem_p(problem)) && (NIL != inference_datastructures_problem.split_problem_p(problem))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$162 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$162)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$162);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			if ((NIL != inference_datastructures_problem.tactically_possible_problem_p(problem2)) && (NIL != inference_datastructures_problem.split_problem_p(problem2))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    public static final SubLObject problem_store_possible_disjunctive_problem_count_alt(SubLObject store) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    if ((NIL != inference_datastructures_problem.tactically_possible_problem_p(problem)) && (NIL != inference_datastructures_problem.disjunctive_problem_p(problem))) {
				count = add(count, ONE_INTEGER);
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    public static SubLObject problem_store_possible_disjunctive_problem_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$163 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$163, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$163);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			if ((NIL != inference_datastructures_problem.tactically_possible_problem_p(problem)) && (NIL != inference_datastructures_problem.disjunctive_problem_p(problem))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$164 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$164)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$164);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			if ((NIL != inference_datastructures_problem.tactically_possible_problem_p(problem2)) && (NIL != inference_datastructures_problem.disjunctive_problem_p(problem2))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    public static final SubLObject problem_store_pending_single_literal_problem_count_alt(SubLObject store) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    if ((NIL != inference_datastructures_problem.tactically_pending_problem_p(problem)) && (NIL != inference_datastructures_problem.single_literal_problem_p(problem))) {
				count = add(count, ONE_INTEGER);
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    public static SubLObject problem_store_pending_single_literal_problem_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$165 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$165, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$165);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			if ((NIL != inference_datastructures_problem.tactically_pending_problem_p(problem)) && (NIL != inference_datastructures_problem.single_literal_problem_p(problem))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$166 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$166)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$166);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			if ((NIL != inference_datastructures_problem.tactically_pending_problem_p(problem2)) && (NIL != inference_datastructures_problem.single_literal_problem_p(problem2))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    public static final SubLObject problem_store_pending_conjunctive_problem_count_alt(SubLObject store) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    if ((NIL != inference_datastructures_problem.tactically_pending_problem_p(problem)) && (NIL != inference_datastructures_problem.conjunctive_problem_p(problem))) {
				count = add(count, ONE_INTEGER);
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    public static SubLObject problem_store_pending_conjunctive_problem_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$167 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$167, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$167);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			if ((NIL != inference_datastructures_problem.tactically_pending_problem_p(problem)) && (NIL != inference_datastructures_problem.conjunctive_problem_p(problem))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$168 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$168)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$168);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			if ((NIL != inference_datastructures_problem.tactically_pending_problem_p(problem2)) && (NIL != inference_datastructures_problem.conjunctive_problem_p(problem2))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    public static final SubLObject problem_store_pending_join_problem_count_alt(SubLObject store) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    if ((NIL != inference_datastructures_problem.tactically_pending_problem_p(problem)) && (NIL != inference_datastructures_problem.join_problem_p(problem))) {
				count = add(count, ONE_INTEGER);
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    public static SubLObject problem_store_pending_join_problem_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$169 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$169, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$169);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			if ((NIL != inference_datastructures_problem.tactically_pending_problem_p(problem)) && (NIL != inference_datastructures_problem.join_problem_p(problem))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$170 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$170)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$170);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			if ((NIL != inference_datastructures_problem.tactically_pending_problem_p(problem2)) && (NIL != inference_datastructures_problem.join_problem_p(problem2))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    static private final SubLList $list_alt1 = list(list(makeSymbol("PROBLEM-STORE-VAR"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt2 = list($DONE);

    static private final SubLList $list_alt7 = list(makeSymbol("PROBLEM-STORE-ID-INDEX"));

    static private final SubLList $list_alt15 = list(new SubLObject[] { makeSymbol("GUID"), makeSymbol("SUID"), makeSymbol("LOCK"), makeSymbol("CREATION-TIME"), makeSymbol("INFERENCE-ID-INDEX"), makeSymbol("STRATEGY-ID-INDEX"), makeSymbol("PROBLEM-ID-INDEX"), makeSymbol("LINK-ID-INDEX"),
	    makeSymbol("PROOF-ID-INDEX"), makeSymbol("PROBLEM-BY-QUERY-INDEX"), makeSymbol("REJECTED-PROOFS"), makeSymbol("PROCESSED-PROOFS"), makeSymbol("NON-EXPLANATORY-SUBPROOFS-POSSIBLE?"), makeSymbol("NON-EXPLANATORY-SUBPROOFS-INDEX"), makeSymbol("MOST-RECENT-TACTIC-EXECUTED"),
	    makeSymbol("MIN-PROOF-DEPTH-INDEX"), makeSymbol("MIN-TRANSFORMATION-DEPTH-INDEX"), makeSymbol("MIN-TRANSFORMATION-DEPTH-SIGNATURE-INDEX"), makeSymbol("MIN-DEPTH-INDEX"), makeSymbol("EQUALITY-REASONING-METHOD"), makeSymbol("EQUALITY-REASONING-DOMAIN"),
	    makeSymbol("INTERMEDIATE-STEP-VALIDATION-LEVEL"), makeSymbol("MAX-PROBLEM-COUNT"), makeSymbol("CRAZY-MAX-PROBLEM-COUNT"), makeSymbol("REMOVAL-ALLOWED?"), makeSymbol("TRANSFORMATION-ALLOWED?"), makeSymbol("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), makeSymbol("NEGATION-BY-FAILURE?"),
	    makeSymbol("COMPLETENESS-MINIMIZATION-ALLOWED?"), makeSymbol("DIRECTION"), makeSymbol("EVALUATE-SUBL-ALLOWED?"), makeSymbol("REWRITE-ALLOWED?"), makeSymbol("ABDUCTION-ALLOWED?"), makeSymbol("NEW-TERMS-ALLOWED?"), makeSymbol("COMPUTE-ANSWER-JUSTIFICATIONS?"),
	    makeSymbol("MEMOIZATION-STATE"), makeSymbol("SBHL-RESOURCE-SPACE"), makeSymbol("PREPARED?"), makeSymbol("DESTRUCTION-IMMINENT?"), makeSymbol("META-PROBLEM-STORE"), makeSymbol("STATIC-PROPERTIES"), makeSymbol("JANITOR"), makeSymbol("HISTORICAL-ROOT-PROBLEMS"),
	    makeSymbol("HISTORICAL-TACTIC-COUNT"), makeSymbol("COMPLEX-PROBLEM-QUERY-CZER-INDEX"), makeSymbol("COMPLEX-PROBLEM-QUERY-SIGNATURES"), makeSymbol("PROOF-KEEPING-INDEX") });

    public static final SubLObject problem_store_pending_split_problem_count_alt(SubLObject store) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    if ((NIL != inference_datastructures_problem.tactically_pending_problem_p(problem)) && (NIL != inference_datastructures_problem.split_problem_p(problem))) {
				count = add(count, ONE_INTEGER);
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    public static SubLObject problem_store_pending_split_problem_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$171 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$171, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$171);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			if ((NIL != inference_datastructures_problem.tactically_pending_problem_p(problem)) && (NIL != inference_datastructures_problem.split_problem_p(problem))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$172 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$172)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$172);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			if ((NIL != inference_datastructures_problem.tactically_pending_problem_p(problem2)) && (NIL != inference_datastructures_problem.split_problem_p(problem2))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    static private final SubLList $list_alt16 = list(new SubLObject[] { $GUID, $SUID, $LOCK, makeKeyword("CREATION-TIME"), makeKeyword("INFERENCE-ID-INDEX"), makeKeyword("STRATEGY-ID-INDEX"), makeKeyword("PROBLEM-ID-INDEX"), makeKeyword("LINK-ID-INDEX"),
	    makeKeyword("PROOF-ID-INDEX"), makeKeyword("PROBLEM-BY-QUERY-INDEX"), makeKeyword("REJECTED-PROOFS"), makeKeyword("PROCESSED-PROOFS"), makeKeyword("NON-EXPLANATORY-SUBPROOFS-POSSIBLE?"), makeKeyword("NON-EXPLANATORY-SUBPROOFS-INDEX"), makeKeyword("MOST-RECENT-TACTIC-EXECUTED"),
	    makeKeyword("MIN-PROOF-DEPTH-INDEX"), makeKeyword("MIN-TRANSFORMATION-DEPTH-INDEX"), makeKeyword("MIN-TRANSFORMATION-DEPTH-SIGNATURE-INDEX"), makeKeyword("MIN-DEPTH-INDEX"), makeKeyword("EQUALITY-REASONING-METHOD"), makeKeyword("EQUALITY-REASONING-DOMAIN"),
	    makeKeyword("INTERMEDIATE-STEP-VALIDATION-LEVEL"), makeKeyword("MAX-PROBLEM-COUNT"), makeKeyword("CRAZY-MAX-PROBLEM-COUNT"), makeKeyword("REMOVAL-ALLOWED?"), makeKeyword("TRANSFORMATION-ALLOWED?"), makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), makeKeyword("NEGATION-BY-FAILURE?"),
	    makeKeyword("COMPLETENESS-MINIMIZATION-ALLOWED?"), makeKeyword("DIRECTION"), makeKeyword("EVALUATE-SUBL-ALLOWED?"), makeKeyword("REWRITE-ALLOWED?"), makeKeyword("ABDUCTION-ALLOWED?"), makeKeyword("NEW-TERMS-ALLOWED?"), makeKeyword("COMPUTE-ANSWER-JUSTIFICATIONS?"),
	    makeKeyword("MEMOIZATION-STATE"), makeKeyword("SBHL-RESOURCE-SPACE"), makeKeyword("PREPARED?"), makeKeyword("DESTRUCTION-IMMINENT?"), makeKeyword("META-PROBLEM-STORE"), makeKeyword("STATIC-PROPERTIES"), makeKeyword("JANITOR"), makeKeyword("HISTORICAL-ROOT-PROBLEMS"),
	    makeKeyword("HISTORICAL-TACTIC-COUNT"), makeKeyword("COMPLEX-PROBLEM-QUERY-CZER-INDEX"), makeKeyword("COMPLEX-PROBLEM-QUERY-SIGNATURES"), makeKeyword("PROOF-KEEPING-INDEX") });

    static private final SubLList $list_alt17 = list(new SubLObject[] { makeSymbol("PROB-STORE-GUID"), makeSymbol("PROB-STORE-SUID"), makeSymbol("PROB-STORE-LOCK"), makeSymbol("PROB-STORE-CREATION-TIME"), makeSymbol("PROB-STORE-INFERENCE-ID-INDEX"), makeSymbol("PROB-STORE-STRATEGY-ID-INDEX"),
	    makeSymbol("PROB-STORE-PROBLEM-ID-INDEX"), makeSymbol("PROB-STORE-LINK-ID-INDEX"), makeSymbol("PROB-STORE-PROOF-ID-INDEX"), makeSymbol("PROB-STORE-PROBLEM-BY-QUERY-INDEX"), makeSymbol("PROB-STORE-REJECTED-PROOFS"), makeSymbol("PROB-STORE-PROCESSED-PROOFS"),
	    makeSymbol("PROB-STORE-NON-EXPLANATORY-SUBPROOFS-POSSIBLE?"), makeSymbol("PROB-STORE-NON-EXPLANATORY-SUBPROOFS-INDEX"), makeSymbol("PROB-STORE-MOST-RECENT-TACTIC-EXECUTED"), makeSymbol("PROB-STORE-MIN-PROOF-DEPTH-INDEX"), makeSymbol("PROB-STORE-MIN-TRANSFORMATION-DEPTH-INDEX"),
	    makeSymbol("PROB-STORE-MIN-TRANSFORMATION-DEPTH-SIGNATURE-INDEX"), makeSymbol("PROB-STORE-MIN-DEPTH-INDEX"), makeSymbol("PROB-STORE-EQUALITY-REASONING-METHOD"), makeSymbol("PROB-STORE-EQUALITY-REASONING-DOMAIN"), makeSymbol("PROB-STORE-INTERMEDIATE-STEP-VALIDATION-LEVEL"),
	    makeSymbol("PROB-STORE-MAX-PROBLEM-COUNT"), makeSymbol("PROB-STORE-CRAZY-MAX-PROBLEM-COUNT"), makeSymbol("PROB-STORE-REMOVAL-ALLOWED?"), makeSymbol("PROB-STORE-TRANSFORMATION-ALLOWED?"), makeSymbol("PROB-STORE-ADD-RESTRICTION-LAYER-OF-INDIRECTION?"),
	    makeSymbol("PROB-STORE-NEGATION-BY-FAILURE?"), makeSymbol("PROB-STORE-COMPLETENESS-MINIMIZATION-ALLOWED?"), makeSymbol("PROB-STORE-DIRECTION"), makeSymbol("PROB-STORE-EVALUATE-SUBL-ALLOWED?"), makeSymbol("PROB-STORE-REWRITE-ALLOWED?"), makeSymbol("PROB-STORE-ABDUCTION-ALLOWED?"),
	    makeSymbol("PROB-STORE-NEW-TERMS-ALLOWED?"), makeSymbol("PROB-STORE-COMPUTE-ANSWER-JUSTIFICATIONS?"), makeSymbol("PROB-STORE-MEMOIZATION-STATE"), makeSymbol("PROB-STORE-SBHL-RESOURCE-SPACE"), makeSymbol("PROB-STORE-PREPARED?"), makeSymbol("PROB-STORE-DESTRUCTION-IMMINENT?"),
	    makeSymbol("PROB-STORE-META-PROBLEM-STORE"), makeSymbol("PROB-STORE-STATIC-PROPERTIES"), makeSymbol("PROB-STORE-JANITOR"), makeSymbol("PROB-STORE-HISTORICAL-ROOT-PROBLEMS"), makeSymbol("PROB-STORE-HISTORICAL-TACTIC-COUNT"), makeSymbol("PROB-STORE-COMPLEX-PROBLEM-QUERY-CZER-INDEX"),
	    makeSymbol("PROB-STORE-COMPLEX-PROBLEM-QUERY-SIGNATURES"), makeSymbol("PROB-STORE-PROOF-KEEPING-INDEX") });

    public static final SubLObject problem_store_pending_disjunctive_problem_count_alt(SubLObject store) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    if ((NIL != inference_datastructures_problem.tactically_pending_problem_p(problem)) && (NIL != inference_datastructures_problem.disjunctive_problem_p(problem))) {
				count = add(count, ONE_INTEGER);
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    public static SubLObject problem_store_pending_disjunctive_problem_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$173 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$173, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$173);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			if ((NIL != inference_datastructures_problem.tactically_pending_problem_p(problem)) && (NIL != inference_datastructures_problem.disjunctive_problem_p(problem))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$174 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$174)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$174);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			if ((NIL != inference_datastructures_problem.tactically_pending_problem_p(problem2)) && (NIL != inference_datastructures_problem.disjunctive_problem_p(problem2))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    static private final SubLList $list_alt18 = list(new SubLObject[] { makeSymbol("_CSETF-PROB-STORE-GUID"), makeSymbol("_CSETF-PROB-STORE-SUID"), makeSymbol("_CSETF-PROB-STORE-LOCK"), makeSymbol("_CSETF-PROB-STORE-CREATION-TIME"), makeSymbol("_CSETF-PROB-STORE-INFERENCE-ID-INDEX"),
	    makeSymbol("_CSETF-PROB-STORE-STRATEGY-ID-INDEX"), makeSymbol("_CSETF-PROB-STORE-PROBLEM-ID-INDEX"), makeSymbol("_CSETF-PROB-STORE-LINK-ID-INDEX"), makeSymbol("_CSETF-PROB-STORE-PROOF-ID-INDEX"), makeSymbol("_CSETF-PROB-STORE-PROBLEM-BY-QUERY-INDEX"),
	    makeSymbol("_CSETF-PROB-STORE-REJECTED-PROOFS"), makeSymbol("_CSETF-PROB-STORE-PROCESSED-PROOFS"), makeSymbol("_CSETF-PROB-STORE-NON-EXPLANATORY-SUBPROOFS-POSSIBLE?"), makeSymbol("_CSETF-PROB-STORE-NON-EXPLANATORY-SUBPROOFS-INDEX"),
	    makeSymbol("_CSETF-PROB-STORE-MOST-RECENT-TACTIC-EXECUTED"), makeSymbol("_CSETF-PROB-STORE-MIN-PROOF-DEPTH-INDEX"), makeSymbol("_CSETF-PROB-STORE-MIN-TRANSFORMATION-DEPTH-INDEX"), makeSymbol("_CSETF-PROB-STORE-MIN-TRANSFORMATION-DEPTH-SIGNATURE-INDEX"),
	    makeSymbol("_CSETF-PROB-STORE-MIN-DEPTH-INDEX"), makeSymbol("_CSETF-PROB-STORE-EQUALITY-REASONING-METHOD"), makeSymbol("_CSETF-PROB-STORE-EQUALITY-REASONING-DOMAIN"), makeSymbol("_CSETF-PROB-STORE-INTERMEDIATE-STEP-VALIDATION-LEVEL"), makeSymbol("_CSETF-PROB-STORE-MAX-PROBLEM-COUNT"),
	    makeSymbol("_CSETF-PROB-STORE-CRAZY-MAX-PROBLEM-COUNT"), makeSymbol("_CSETF-PROB-STORE-REMOVAL-ALLOWED?"), makeSymbol("_CSETF-PROB-STORE-TRANSFORMATION-ALLOWED?"), makeSymbol("_CSETF-PROB-STORE-ADD-RESTRICTION-LAYER-OF-INDIRECTION?"), makeSymbol("_CSETF-PROB-STORE-NEGATION-BY-FAILURE?"),
	    makeSymbol("_CSETF-PROB-STORE-COMPLETENESS-MINIMIZATION-ALLOWED?"), makeSymbol("_CSETF-PROB-STORE-DIRECTION"), makeSymbol("_CSETF-PROB-STORE-EVALUATE-SUBL-ALLOWED?"), makeSymbol("_CSETF-PROB-STORE-REWRITE-ALLOWED?"), makeSymbol("_CSETF-PROB-STORE-ABDUCTION-ALLOWED?"),
	    makeSymbol("_CSETF-PROB-STORE-NEW-TERMS-ALLOWED?"), makeSymbol("_CSETF-PROB-STORE-COMPUTE-ANSWER-JUSTIFICATIONS?"), makeSymbol("_CSETF-PROB-STORE-MEMOIZATION-STATE"), makeSymbol("_CSETF-PROB-STORE-SBHL-RESOURCE-SPACE"), makeSymbol("_CSETF-PROB-STORE-PREPARED?"),
	    makeSymbol("_CSETF-PROB-STORE-DESTRUCTION-IMMINENT?"), makeSymbol("_CSETF-PROB-STORE-META-PROBLEM-STORE"), makeSymbol("_CSETF-PROB-STORE-STATIC-PROPERTIES"), makeSymbol("_CSETF-PROB-STORE-JANITOR"), makeSymbol("_CSETF-PROB-STORE-HISTORICAL-ROOT-PROBLEMS"),
	    makeSymbol("_CSETF-PROB-STORE-HISTORICAL-TACTIC-COUNT"), makeSymbol("_CSETF-PROB-STORE-COMPLEX-PROBLEM-QUERY-CZER-INDEX"), makeSymbol("_CSETF-PROB-STORE-COMPLEX-PROBLEM-QUERY-SIGNATURES"), makeSymbol("_CSETF-PROB-STORE-PROOF-KEEPING-INDEX") });

    public static final SubLObject problem_store_finished_single_literal_problem_count_alt(SubLObject store) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    if ((NIL != inference_datastructures_problem.tactically_finished_problem_p(problem)) && (NIL != inference_datastructures_problem.single_literal_problem_p(problem))) {
				count = add(count, ONE_INTEGER);
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    public static SubLObject problem_store_finished_single_literal_problem_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$175 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$175, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$175);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			if ((NIL != inference_datastructures_problem.tactically_finished_problem_p(problem)) && (NIL != inference_datastructures_problem.single_literal_problem_p(problem))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$176 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$176)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$176);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			if ((NIL != inference_datastructures_problem.tactically_finished_problem_p(problem2)) && (NIL != inference_datastructures_problem.single_literal_problem_p(problem2))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    public static final SubLObject problem_store_finished_conjunctive_problem_count_alt(SubLObject store) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    if ((NIL != inference_datastructures_problem.tactically_finished_problem_p(problem)) && (NIL != inference_datastructures_problem.conjunctive_problem_p(problem))) {
				count = add(count, ONE_INTEGER);
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    public static SubLObject problem_store_finished_conjunctive_problem_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$177 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$177, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$177);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			if ((NIL != inference_datastructures_problem.tactically_finished_problem_p(problem)) && (NIL != inference_datastructures_problem.conjunctive_problem_p(problem))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$178 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$178)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$178);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			if ((NIL != inference_datastructures_problem.tactically_finished_problem_p(problem2)) && (NIL != inference_datastructures_problem.conjunctive_problem_p(problem2))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    public static final SubLObject problem_store_finished_join_problem_count_alt(SubLObject store) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    if ((NIL != inference_datastructures_problem.tactically_finished_problem_p(problem)) && (NIL != inference_datastructures_problem.join_problem_p(problem))) {
				count = add(count, ONE_INTEGER);
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    public static SubLObject problem_store_finished_join_problem_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$179 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$179, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$179);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			if ((NIL != inference_datastructures_problem.tactically_finished_problem_p(problem)) && (NIL != inference_datastructures_problem.join_problem_p(problem))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$180 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$180)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$180);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			if ((NIL != inference_datastructures_problem.tactically_finished_problem_p(problem2)) && (NIL != inference_datastructures_problem.join_problem_p(problem2))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    private static final SubLSymbol PROB_STORE_PROBLEM_BY_QUERY_INDEX = makeSymbol("PROB-STORE-PROBLEM-BY-QUERY-INDEX");

    public static final SubLSymbol _CSETF_PROB_STORE_PROBLEM_BY_QUERY_INDEX = makeSymbol("_CSETF-PROB-STORE-PROBLEM-BY-QUERY-INDEX");

    static private final SubLSymbol $sym73$PROB_STORE_NON_EXPLANATORY_SUBPROOFS_POSSIBLE_ = makeSymbol("PROB-STORE-NON-EXPLANATORY-SUBPROOFS-POSSIBLE?");

    static private final SubLSymbol $sym74$_CSETF_PROB_STORE_NON_EXPLANATORY_SUBPROOFS_POSSIBLE_ = makeSymbol("_CSETF-PROB-STORE-NON-EXPLANATORY-SUBPROOFS-POSSIBLE?");

    public static final SubLObject problem_store_finished_split_problem_count_alt(SubLObject store) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    if ((NIL != inference_datastructures_problem.tactically_finished_problem_p(problem)) && (NIL != inference_datastructures_problem.split_problem_p(problem))) {
				count = add(count, ONE_INTEGER);
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    public static SubLObject problem_store_finished_split_problem_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$181 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$181, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$181);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			if ((NIL != inference_datastructures_problem.tactically_finished_problem_p(problem)) && (NIL != inference_datastructures_problem.split_problem_p(problem))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$182 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$182)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$182);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			if ((NIL != inference_datastructures_problem.tactically_finished_problem_p(problem2)) && (NIL != inference_datastructures_problem.split_problem_p(problem2))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    static private final SubLSymbol $sym97$PROB_STORE_REMOVAL_ALLOWED_ = makeSymbol("PROB-STORE-REMOVAL-ALLOWED?");

    static private final SubLSymbol $sym98$_CSETF_PROB_STORE_REMOVAL_ALLOWED_ = makeSymbol("_CSETF-PROB-STORE-REMOVAL-ALLOWED?");

    static private final SubLSymbol $sym99$PROB_STORE_TRANSFORMATION_ALLOWED_ = makeSymbol("PROB-STORE-TRANSFORMATION-ALLOWED?");

    static private final SubLSymbol $sym100$_CSETF_PROB_STORE_TRANSFORMATION_ALLOWED_ = makeSymbol("_CSETF-PROB-STORE-TRANSFORMATION-ALLOWED?");

    static private final SubLSymbol $sym101$PROB_STORE_ADD_RESTRICTION_LAYER_OF_INDIRECTION_ = makeSymbol("PROB-STORE-ADD-RESTRICTION-LAYER-OF-INDIRECTION?");

    static private final SubLSymbol $sym102$_CSETF_PROB_STORE_ADD_RESTRICTION_LAYER_OF_INDIRECTION_ = makeSymbol("_CSETF-PROB-STORE-ADD-RESTRICTION-LAYER-OF-INDIRECTION?");

    static private final SubLSymbol $sym103$PROB_STORE_NEGATION_BY_FAILURE_ = makeSymbol("PROB-STORE-NEGATION-BY-FAILURE?");

    public static final SubLObject problem_store_finished_disjunctive_problem_count_alt(SubLObject store) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    if ((NIL != inference_datastructures_problem.tactically_finished_problem_p(problem)) && (NIL != inference_datastructures_problem.disjunctive_problem_p(problem))) {
				count = add(count, ONE_INTEGER);
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    public static SubLObject problem_store_finished_disjunctive_problem_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$183 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$183, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$183);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			if ((NIL != inference_datastructures_problem.tactically_finished_problem_p(problem)) && (NIL != inference_datastructures_problem.disjunctive_problem_p(problem))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		}
	    }
	    final SubLObject idx_$184 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$184)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$184);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			if ((NIL != inference_datastructures_problem.tactically_finished_problem_p(problem2)) && (NIL != inference_datastructures_problem.disjunctive_problem_p(problem2))) {
			    count = add(count, ONE_INTEGER);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    static private final SubLSymbol $sym104$_CSETF_PROB_STORE_NEGATION_BY_FAILURE_ = makeSymbol("_CSETF-PROB-STORE-NEGATION-BY-FAILURE?");

    static private final SubLSymbol $sym105$PROB_STORE_COMPLETENESS_MINIMIZATION_ALLOWED_ = makeSymbol("PROB-STORE-COMPLETENESS-MINIMIZATION-ALLOWED?");

    static private final SubLSymbol $sym106$_CSETF_PROB_STORE_COMPLETENESS_MINIMIZATION_ALLOWED_ = makeSymbol("_CSETF-PROB-STORE-COMPLETENESS-MINIMIZATION-ALLOWED?");

    static private final SubLSymbol $sym109$PROB_STORE_EVALUATE_SUBL_ALLOWED_ = makeSymbol("PROB-STORE-EVALUATE-SUBL-ALLOWED?");

    static private final SubLSymbol $sym110$_CSETF_PROB_STORE_EVALUATE_SUBL_ALLOWED_ = makeSymbol("_CSETF-PROB-STORE-EVALUATE-SUBL-ALLOWED?");

    static private final SubLSymbol $sym111$PROB_STORE_REWRITE_ALLOWED_ = makeSymbol("PROB-STORE-REWRITE-ALLOWED?");

    static private final SubLSymbol $sym112$_CSETF_PROB_STORE_REWRITE_ALLOWED_ = makeSymbol("_CSETF-PROB-STORE-REWRITE-ALLOWED?");

    static private final SubLSymbol $sym113$PROB_STORE_ABDUCTION_ALLOWED_ = makeSymbol("PROB-STORE-ABDUCTION-ALLOWED?");

    static private final SubLSymbol $sym114$_CSETF_PROB_STORE_ABDUCTION_ALLOWED_ = makeSymbol("_CSETF-PROB-STORE-ABDUCTION-ALLOWED?");

    static private final SubLSymbol $sym115$PROB_STORE_NEW_TERMS_ALLOWED_ = makeSymbol("PROB-STORE-NEW-TERMS-ALLOWED?");

    static private final SubLSymbol $sym116$_CSETF_PROB_STORE_NEW_TERMS_ALLOWED_ = makeSymbol("_CSETF-PROB-STORE-NEW-TERMS-ALLOWED?");

    static private final SubLSymbol $sym117$PROB_STORE_COMPUTE_ANSWER_JUSTIFICATIONS_ = makeSymbol("PROB-STORE-COMPUTE-ANSWER-JUSTIFICATIONS?");

    static private final SubLSymbol $sym118$_CSETF_PROB_STORE_COMPUTE_ANSWER_JUSTIFICATIONS_ = makeSymbol("_CSETF-PROB-STORE-COMPUTE-ANSWER-JUSTIFICATIONS?");

    static private final SubLSymbol $sym123$PROB_STORE_PREPARED_ = makeSymbol("PROB-STORE-PREPARED?");

    static private final SubLSymbol $sym124$_CSETF_PROB_STORE_PREPARED_ = makeSymbol("_CSETF-PROB-STORE-PREPARED?");

    /**
     * Return a list of tuples indicating the productivities for all executed removal tactics in STORE.
     * Tuples are of the form (HL-MODULE-NAME ESTIMATED ACTUAL)
     */
    @LispMethod(comment = "Return a list of tuples indicating the productivities for all executed removal tactics in STORE.\r\nTuples are of the form (HL-MODULE-NAME ESTIMATED ACTUAL)\nReturn a list of tuples indicating the productivities for all executed removal tactics in STORE.\nTuples are of the form (HL-MODULE-NAME ESTIMATED ACTUAL)")
    public static final SubLObject problem_store_executed_removal_tactic_productivities_alt(SubLObject store) {
	SubLTrampolineFile.checkType(store, PROBLEM_STORE_P);
	{
	    SubLObject tuples = NIL;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    {
				SubLObject problem_tuples = inference_datastructures_problem.problem_executed_removal_tactic_productivities(problem);
				tuples = nreconc(problem_tuples, tuples);
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return nreverse(tuples);
	}
    }

    /**
     * Return a list of tuples indicating the productivities for all executed removal tactics in STORE.
     * Tuples are of the form (HL-MODULE-NAME ESTIMATED ACTUAL)
     */
    @LispMethod(comment = "Return a list of tuples indicating the productivities for all executed removal tactics in STORE.\r\nTuples are of the form (HL-MODULE-NAME ESTIMATED ACTUAL)\nReturn a list of tuples indicating the productivities for all executed removal tactics in STORE.\nTuples are of the form (HL-MODULE-NAME ESTIMATED ACTUAL)")
    public static SubLObject problem_store_executed_removal_tactic_productivities(final SubLObject store) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(store) : "! inference_datastructures_problem_store.problem_store_p(store) "
		+ ("inference_datastructures_problem_store.problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(store) ") + store;
	SubLObject tuples = NIL;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$185 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$185, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$185);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		SubLObject problem_tuples;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			problem_tuples = inference_datastructures_problem.problem_executed_removal_tactic_productivities(problem);
			tuples = nreconc(problem_tuples, tuples);
		    }
		}
	    }
	    final SubLObject idx_$186 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$186)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$186);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			final SubLObject problem_tuples2 = inference_datastructures_problem.problem_executed_removal_tactic_productivities(problem2);
			tuples = nreconc(problem_tuples2, tuples);
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return nreverse(tuples);
    }

    static private final SubLSymbol $sym125$PROB_STORE_DESTRUCTION_IMMINENT_ = makeSymbol("PROB-STORE-DESTRUCTION-IMMINENT?");

    static private final SubLSymbol $sym126$_CSETF_PROB_STORE_DESTRUCTION_IMMINENT_ = makeSymbol("_CSETF-PROB-STORE-DESTRUCTION-IMMINENT?");

    private static final SubLSymbol $PROBLEM_BY_QUERY_INDEX = makeKeyword("PROBLEM-BY-QUERY-INDEX");

    /**
     *
     *
     * @return non-negative-integer-p; the number of tactics in STORE with status STATUS
     */
    @LispMethod(comment = "@return non-negative-integer-p; the number of tactics in STORE with status STATUS")
    public static final SubLObject problem_store_tactic_with_status_count_alt(SubLObject store, SubLObject status) {
	if (status == UNPROVIDED) {
	    status = NIL;
	}
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    count = add(count, inference_datastructures_problem.problem_tactic_with_status_count(problem, status));
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    /**
     *
     *
     * @return non-negative-integer-p; the number of tactics in STORE with status STATUS
     */
    @LispMethod(comment = "@return non-negative-integer-p; the number of tactics in STORE with status STATUS")
    public static SubLObject problem_store_tactic_with_status_count(final SubLObject store, SubLObject status) {
	if (status == UNPROVIDED) {
	    status = NIL;
	}
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$187 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$187, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$187);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			count = add(count, inference_datastructures_problem.problem_tactic_with_status_count(problem, status));
		    }
		}
	    }
	    final SubLObject idx_$188 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$188)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$188);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			count = add(count, inference_datastructures_problem.problem_tactic_with_status_count(problem2, status));
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    public static final SubLSymbol $kw155$NON_EXPLANATORY_SUBPROOFS_POSSIBLE_ = makeKeyword("NON-EXPLANATORY-SUBPROOFS-POSSIBLE?");

    public static final SubLSymbol $kw167$REMOVAL_ALLOWED_ = makeKeyword("REMOVAL-ALLOWED?");

    public static final SubLSymbol $kw168$TRANSFORMATION_ALLOWED_ = makeKeyword("TRANSFORMATION-ALLOWED?");

    public static final SubLSymbol $kw169$ADD_RESTRICTION_LAYER_OF_INDIRECTION_ = makeKeyword("ADD-RESTRICTION-LAYER-OF-INDIRECTION?");

    public static final SubLSymbol $kw170$NEGATION_BY_FAILURE_ = makeKeyword("NEGATION-BY-FAILURE?");

    public static final SubLSymbol $kw171$COMPLETENESS_MINIMIZATION_ALLOWED_ = makeKeyword("COMPLETENESS-MINIMIZATION-ALLOWED?");

    public static final SubLSymbol $kw173$EVALUATE_SUBL_ALLOWED_ = makeKeyword("EVALUATE-SUBL-ALLOWED?");

    public static final SubLSymbol $kw174$REWRITE_ALLOWED_ = makeKeyword("REWRITE-ALLOWED?");

    public static final SubLSymbol $kw175$ABDUCTION_ALLOWED_ = makeKeyword("ABDUCTION-ALLOWED?");

    public static final SubLSymbol $kw176$NEW_TERMS_ALLOWED_ = makeKeyword("NEW-TERMS-ALLOWED?");

    public static final SubLSymbol $kw177$COMPUTE_ANSWER_JUSTIFICATIONS_ = makeKeyword("COMPUTE-ANSWER-JUSTIFICATIONS?");

    /**
     *
     *
     * @return non-negative-integer-p; the number of tactics in STORE with type TYPE and status STATUS
     */
    @LispMethod(comment = "@return non-negative-integer-p; the number of tactics in STORE with type TYPE and status STATUS")
    public static final SubLObject problem_store_tactic_of_type_with_status_count_alt(SubLObject store, SubLObject type, SubLObject status) {
	if (type == UNPROVIDED) {
	    type = NIL;
	}
	if (status == UNPROVIDED) {
	    status = NIL;
	}
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    count = add(count, inference_datastructures_problem.problem_tactic_of_type_with_status_count(problem, type, status));
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    /**
     *
     *
     * @return non-negative-integer-p; the number of tactics in STORE with type TYPE and status STATUS
     */
    @LispMethod(comment = "@return non-negative-integer-p; the number of tactics in STORE with type TYPE and status STATUS")
    public static SubLObject problem_store_tactic_of_type_with_status_count(final SubLObject store, SubLObject type, SubLObject status) {
	if (type == UNPROVIDED) {
	    type = NIL;
	}
	if (status == UNPROVIDED) {
	    status = NIL;
	}
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$189 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$189, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$189);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			count = add(count, inference_datastructures_problem.problem_tactic_of_type_with_status_count(problem, type, status));
		    }
		}
	    }
	    final SubLObject idx_$190 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$190)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$190);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			count = add(count, inference_datastructures_problem.problem_tactic_of_type_with_status_count(problem2, type, status));
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    public static final SubLSymbol $kw181$DESTRUCTION_IMMINENT_ = makeKeyword("DESTRUCTION-IMMINENT?");

    static private final SubLString $str_alt190$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt192$_Invalid_PROBLEM_STORE__s_ = makeString("<Invalid PROBLEM STORE ~s>");

    static private final SubLString $str_alt193$_PROBLEM_STORE__a_size__a_ = makeString("<PROBLEM STORE ~a size=~a>");

    static private final SubLList $list_alt195 = list(makeSymbol("STORE"), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt199 = list(list(makeSymbol("STORE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym203$SPACE_VAR = makeUninternedSymbol("SPACE-VAR");

    /**
     *
     *
     * @return non-negative-integer-p; the number of tactics in STORE.
     */
    @LispMethod(comment = "@return non-negative-integer-p; the number of tactics in STORE.")
    public static final SubLObject problem_store_tactic_count_alt(SubLObject store) {
	return problem_store_tactic_with_status_count(store, NIL);
    }

    /**
     *
     *
     * @return non-negative-integer-p; the number of tactics in STORE.
     */
    @LispMethod(comment = "@return non-negative-integer-p; the number of tactics in STORE.")
    public static SubLObject problem_store_tactic_count(final SubLObject store) {
	return inference_datastructures_problem_store.problem_store_tactic_with_status_count(store, NIL);
    }

    static private final SubLSymbol $sym209$STORE_VAR = makeUninternedSymbol("STORE-VAR");

    static private final SubLList $list_alt210 = list(list(makeSymbol("INFERENCE-VAR"), makeSymbol("STORE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    /**
     *
     *
     * @return non-negative-integer-p; the number of tactics that have ever existed in STORE.
     */
    @LispMethod(comment = "@return non-negative-integer-p; the number of tactics that have ever existed in STORE.")
    public static final SubLObject problem_store_historical_tactic_count_alt(SubLObject store) {
	return prob_store_historical_tactic_count(store);
    }

    /**
     *
     *
     * @return non-negative-integer-p; the number of tactics that have ever existed in STORE.
     */
    @LispMethod(comment = "@return non-negative-integer-p; the number of tactics that have ever existed in STORE.")
    public static SubLObject problem_store_historical_tactic_count(final SubLObject store) {
	return inference_datastructures_problem_store.prob_store_historical_tactic_count(store);
    }

    static private final SubLSymbol $sym211$ID = makeUninternedSymbol("ID");

    /**
     * Note that a new tactic has been created in STORE.
     */
    @LispMethod(comment = "Note that a new tactic has been created in STORE.")
    public static final SubLObject problem_store_increment_historical_tactic_count_alt(SubLObject store) {
	_csetf_prob_store_historical_tactic_count(store, add(prob_store_historical_tactic_count(store), ONE_INTEGER));
	return store;
    }

    /**
     * Note that a new tactic has been created in STORE.
     */
    @LispMethod(comment = "Note that a new tactic has been created in STORE.")
    public static SubLObject problem_store_increment_historical_tactic_count(final SubLObject store) {
	inference_datastructures_problem_store._csetf_prob_store_historical_tactic_count(store, add(inference_datastructures_problem_store.prob_store_historical_tactic_count(store), ONE_INTEGER));
	return store;
    }

    /**
     *
     *
     * @return non-negative-integer-p; the number of possible tactics in STORE.
     */
    @LispMethod(comment = "@return non-negative-integer-p; the number of possible tactics in STORE.")
    public static final SubLObject problem_store_possible_tactic_count_alt(SubLObject store) {
	return problem_store_tactic_with_status_count(store, $POSSIBLE);
    }

    /**
     *
     *
     * @return non-negative-integer-p; the number of possible tactics in STORE.
     */
    @LispMethod(comment = "@return non-negative-integer-p; the number of possible tactics in STORE.")
    public static SubLObject problem_store_possible_tactic_count(final SubLObject store) {
	return inference_datastructures_problem_store.problem_store_tactic_with_status_count(store, $POSSIBLE);
    }

    static private final SubLList $list_alt214 = list(list(makeSymbol("STRATEGY-VAR"), makeSymbol("STORE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    /**
     *
     *
     * @return non-negative-integer-p; the number of executed tactics in STORE.
     */
    @LispMethod(comment = "@return non-negative-integer-p; the number of executed tactics in STORE.")
    public static final SubLObject problem_store_executed_tactic_count_alt(SubLObject store) {
	return problem_store_tactic_with_status_count(store, $EXECUTED);
    }

    /**
     *
     *
     * @return non-negative-integer-p; the number of executed tactics in STORE.
     */
    @LispMethod(comment = "@return non-negative-integer-p; the number of executed tactics in STORE.")
    public static SubLObject problem_store_executed_tactic_count(final SubLObject store) {
	return inference_datastructures_problem_store.problem_store_tactic_with_status_count(store, $EXECUTED);
    }

    static private final SubLSymbol $sym215$ID = makeUninternedSymbol("ID");

    /**
     *
     *
     * @return non-negative-integer-p; the number of discarded tactics in STORE.
     */
    @LispMethod(comment = "@return non-negative-integer-p; the number of discarded tactics in STORE.")
    public static final SubLObject problem_store_discarded_tactic_count_alt(SubLObject store) {
	return problem_store_tactic_with_status_count(store, $DISCARDED);
    }

    /**
     *
     *
     * @return non-negative-integer-p; the number of discarded tactics in STORE.
     */
    @LispMethod(comment = "@return non-negative-integer-p; the number of discarded tactics in STORE.")
    public static SubLObject problem_store_discarded_tactic_count(final SubLObject store) {
	return inference_datastructures_problem_store.problem_store_tactic_with_status_count(store, $DISCARDED);
    }

    /**
     * Return the number of proofs that are currently in STORE.
     */
    @LispMethod(comment = "Return the number of proofs that are currently in STORE.")
    public static final SubLObject problem_store_proof_count_alt(SubLObject store) {
	return id_index_count(prob_store_proof_id_index(store));
    }

    /**
     * Return the number of proofs that are currently in STORE.
     */
    @LispMethod(comment = "Return the number of proofs that are currently in STORE.")
    public static SubLObject problem_store_proof_count(final SubLObject store) {
	return id_index_count(inference_datastructures_problem_store.prob_store_proof_id_index(store));
    }

    static private final SubLList $list_alt218 = list(list(makeSymbol("STRATEGIC-CONTEXT-VAR"), makeSymbol("STORE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    /**
     * Return the number of proofs that have ever existed in STORE.
     */
    @LispMethod(comment = "Return the number of proofs that have ever existed in STORE.")
    public static final SubLObject problem_store_historical_proof_count_alt(SubLObject store) {
	return id_index_next_id(prob_store_proof_id_index(store));
    }

    /**
     * Return the number of proofs that have ever existed in STORE.
     */
    @LispMethod(comment = "Return the number of proofs that have ever existed in STORE.")
    public static SubLObject problem_store_historical_proof_count(final SubLObject store) {
	return id_index_next_id(inference_datastructures_problem_store.prob_store_proof_id_index(store));
    }

    static private final SubLList $list_alt220 = list(makeKeyword("TACTICAL"));

    static private final SubLList $list_alt221 = list(list(makeSymbol("PROBLEM-VAR"), makeSymbol("STORE"), makeSymbol("&KEY"), makeSymbol("ORDERED"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLObject find_proof_by_id_alt(SubLObject store, SubLObject proof_suid) {
	{
	    SubLObject v_id_index = prob_store_proof_id_index(store);
	    return id_index_lookup(v_id_index, proof_suid, UNPROVIDED);
	}
    }

    public static SubLObject find_proof_by_id(final SubLObject store, final SubLObject proof_suid) {
	final SubLObject v_id_index = inference_datastructures_problem_store.prob_store_proof_id_index(store);
	return id_index_lookup(v_id_index, proof_suid, UNPROVIDED);
    }

    static private final SubLList $list_alt222 = list(makeKeyword("ORDERED"), $DONE);

    public static final SubLObject find_proof_by_ids_alt(SubLObject store_suid, SubLObject proof_suid) {
	{
	    SubLObject store = find_problem_store_by_id(store_suid);
	    if (NIL != store) {
		return find_proof_by_id(store, proof_suid);
	    }
	}
	return NIL;
    }

    public static SubLObject find_proof_by_ids(final SubLObject store_suid, final SubLObject proof_suid) {
	final SubLObject store = inference_datastructures_problem_store.find_problem_store_by_id(store_suid);
	if (NIL != store) {
	    return inference_datastructures_problem_store.find_proof_by_id(store, proof_suid);
	}
	return NIL;
    }

    static private final SubLSymbol $sym224$ID = makeUninternedSymbol("ID");

    public static final SubLObject problem_store_some_rejected_proofsP_alt(SubLObject store) {
	return dictionary.non_empty_dictionary_p(problem_store_rejected_proofs(store));
    }

    public static SubLObject problem_store_some_rejected_proofsP(final SubLObject store) {
	return dictionary.non_empty_dictionary_p(inference_datastructures_problem_store.problem_store_rejected_proofs(store));
    }

    static private final SubLList $list_alt227 = list(list(makeSymbol("LINK-VAR"), makeSymbol("STORE"), makeSymbol("&KEY"), makeSymbol("TYPE"), makeSymbol("ORDERED"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLObject problem_store_rejected_proof_count_alt(SubLObject store) {
	return dictionary.dictionary_length(problem_store_rejected_proofs(store));
    }

    public static SubLObject problem_store_rejected_proof_count(final SubLObject store) {
	return dictionary.dictionary_length(inference_datastructures_problem_store.problem_store_rejected_proofs(store));
    }

    static private final SubLList $list_alt228 = list($TYPE, makeKeyword("ORDERED"), $DONE);

    public static final SubLObject problem_store_proven_proof_count_alt(SubLObject store) {
	return subtract(problem_store_proof_count(store), problem_store_rejected_proof_count(store));
    }

    public static SubLObject problem_store_proven_proof_count(final SubLObject store) {
	return subtract(inference_datastructures_problem_store.problem_store_proof_count(store), inference_datastructures_problem_store.problem_store_rejected_proof_count(store));
    }

    public static final SubLObject problem_store_all_processed_proofs_alt(SubLObject store) {
	return Sort.sort(set.set_element_list(problem_store_processed_proofs(store)), symbol_function($sym287$_), symbol_function(PROOF_SUID));
    }

    public static SubLObject problem_store_all_processed_proofs(final SubLObject store) {
	return Sort.sort(set.set_element_list(inference_datastructures_problem_store.problem_store_processed_proofs(store)), symbol_function($sym309$_), symbol_function(inference_datastructures_problem_store.PROOF_SUID));
    }

    static private final SubLSymbol $sym234$PROBLEM_LINK_HAS_TYPE_ = makeSymbol("PROBLEM-LINK-HAS-TYPE?");

    static private final SubLList $list_alt235 = list(list(makeSymbol("PROOF-VAR"), makeSymbol("STORE"), makeSymbol("&KEY"), makeSymbol("PROOF-STATUS"), makeSymbol("ORDERED"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static SubLObject problem_store_all_potentially_processed_problems(final SubLObject store) {
	return Sort.sort(set.set_element_list(inference_datastructures_problem_store.problem_store_potentially_processed_problems(store)), symbol_function($sym309$_), symbol_function(PROBLEM_SUID));
    }

    static private final SubLList $list_alt236 = list(makeKeyword("PROOF-STATUS"), makeKeyword("ORDERED"), $DONE);

    public static final SubLObject problem_store_has_some_non_explanatory_subproofP_alt(SubLObject store) {
	return makeBoolean(NIL == dictionary.dictionary_empty_p(problem_store_non_explanatory_subproofs_index(store)));
    }

    public static SubLObject problem_store_has_some_non_explanatory_subproofP(final SubLObject store) {
	return makeBoolean(NIL == dictionary.dictionary_empty_p(inference_datastructures_problem_store.problem_store_non_explanatory_subproofs_index(store)));
    }

    static private final SubLSymbol $sym238$ID = makeUninternedSymbol("ID");

    public static final SubLObject problem_store_proof_non_explanatory_subproofs_alt(SubLObject store, SubLObject proof) {
	return dictionary.dictionary_lookup_without_values(problem_store_non_explanatory_subproofs_index(store), proof, UNPROVIDED);
    }

    public static SubLObject problem_store_proof_non_explanatory_subproofs(final SubLObject store, final SubLObject proof) {
	return dictionary.dictionary_lookup_without_values(inference_datastructures_problem_store.problem_store_non_explanatory_subproofs_index(store), proof, UNPROVIDED);
    }

    static private final SubLSymbol $sym241$PROOF_HAS_STATUS_ = makeSymbol("PROOF-HAS-STATUS?");

    static private final SubLList $list_alt242 = list(list(makeSymbol("PROBLEM-VAR"), makeSymbol("STORE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static final SubLObject problem_store_size_alt(SubLObject store) {
	return add(problem_store_problem_count(store), problem_store_link_count(store), problem_store_proof_count(store));
    }

    public static SubLObject problem_store_size(final SubLObject store) {
	return add(inference_datastructures_problem_store.problem_store_problem_count(store), inference_datastructures_problem_store.problem_store_link_count(store), inference_datastructures_problem_store.problem_store_proof_count(store));
    }

    public static final SubLObject problem_store_historical_size_alt(SubLObject store) {
	return add(problem_store_historical_problem_count(store), problem_store_historical_link_count(store), problem_store_historical_proof_count(store));
    }

    public static SubLObject problem_store_historical_size(final SubLObject store) {
	return add(inference_datastructures_problem_store.problem_store_historical_problem_count(store), inference_datastructures_problem_store.problem_store_historical_link_count(store), inference_datastructures_problem_store.problem_store_historical_proof_count(store));
    }

    static private final SubLList $list_alt246 = list(list(makeSymbol("STRATEGY-VAR"), makeSymbol("INFERENCE"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    public static SubLObject total_size_of_all_problem_stores() {
	return number_utilities.summation(Mapping.mapcar(symbol_function(inference_datastructures_problem_store.PROBLEM_STORE_SIZE), inference_datastructures_problem_store.all_problem_stores()));
    }

    static private final SubLSymbol $sym247$INFERENCE_VAR = makeUninternedSymbol("INFERENCE-VAR");

    public static SubLObject total_size_of_all_historical_problem_stores() {
	return add(inference_metrics.problem_historical_count(), inference_metrics.problem_link_historical_count(), inference_metrics.proof_historical_count());
    }

    /**
     *
     *
     * @return non-negative-integer-p; the total count of current dependent links in STORE.
     */
    @LispMethod(comment = "@return non-negative-integer-p; the total count of current dependent links in STORE.")
    public static final SubLObject problem_store_dependent_link_count_alt(SubLObject store) {
	{
	    SubLObject count = ZERO_INTEGER;
	    SubLObject idx = problem_store_link_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject link = NIL;
		    while (NIL != id) {
			link = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, link, $SKIP)) {
			    count = add(count, inference_datastructures_problem_link.problem_link_number_of_supporting_problems(link));
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return count;
	}
    }

    /**
     *
     *
     * @return non-negative-integer-p; the total count of current dependent links in STORE.
     */
    @LispMethod(comment = "@return non-negative-integer-p; the total count of current dependent links in STORE.")
    public static SubLObject problem_store_dependent_link_count(final SubLObject store) {
	SubLObject count = ZERO_INTEGER;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_link_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$191 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$191, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$191);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject link;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    link = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(link)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(link)) {
			    link = $SKIP;
			}
			count = add(count, inference_datastructures_problem_link.problem_link_number_of_supporting_problems(link));
		    }
		}
	    }
	    final SubLObject idx_$192 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$192)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$192);
		SubLObject id2 = NIL;
		SubLObject link2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			link2 = getEntryValue(cdohash_entry);
			count = add(count, inference_datastructures_problem_link.problem_link_number_of_supporting_problems(link2));
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return count;
    }

    static private final SubLString $str_alt253$A_problem_store_named__s_already_ = makeString("A problem store named ~s already exists.");

    static private final SubLSymbol $sym287$_ = makeSymbol("<");

    static private final SubLList $list_alt294 = list(makeKeyword("NON-PROOF-KEEPING"), makeKeyword("UNKNOWN"));

    static private final SubLString $str_alt295$Invalid_proof_keeping_reason__a_f = makeString("Invalid proof-keeping reason ~a for problem ~a");

    static private final SubLSymbol $sym297$PROOF_REJECTED_ = makeSymbol("PROOF-REJECTED?");

    static private final SubLString $str_alt299$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

    public static final SubLObject problem_store_most_recent_transformation_link_alt(SubLObject store) {
	{
	    SubLObject link = NIL;
	    SubLObject idx = problem_store_link_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
		    SubLObject link_var = NIL;
		    while (NIL != id) {
			link_var = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, link_var, $SKIP)) {
			    if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(link_var, $TRANSFORMATION)) {
				link = link_var;
			    }
			}
			id = do_id_index_next_id(idx, T, id, state_var);
			state_var = do_id_index_next_state(idx, T, id, state_var);
		    }
		}
	    }
	    return link;
	}
    }

    public static SubLObject problem_store_most_recent_transformation_link(final SubLObject store) {
	SubLObject link = NIL;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_link_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$193 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$193, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$193);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject link_var;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    link_var = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(link_var)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(link_var)) {
			    link_var = $SKIP;
			}
			if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(link_var, $TRANSFORMATION)) {
			    link = link_var;
			}
		    }
		}
	    }
	    final SubLObject idx_$194 = idx;
	    if ((NIL == id_index_sparse_objects_empty_p(idx_$194)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
		final SubLObject sparse = id_index_sparse_objects(idx_$194);
		SubLObject id2 = id_index_sparse_id_threshold(idx_$194);
		final SubLObject end_id = id_index_next_id(idx_$194);
		final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
		while (id2.numL(end_id)) {
		    final SubLObject link_var2 = gethash_without_values(id2, sparse, v_default);
		    if (((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(link_var2))) && (NIL != inference_datastructures_problem_link.problem_link_has_typeP(link_var2, $TRANSFORMATION))) {
			link = link_var2;
		    }
		    id2 = add(id2, ONE_INTEGER);
		}
	    }
	}
	return link;
    }

    public static final SubLSymbol $kw301$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLList $list_alt305 = list(makeSymbol("STORE"), makeSymbol("INDESTRUCTIBLE-PROBLEMS"), makeSymbol("STALE?"));

    static private final SubLList $list_alt306 = list(makeKeyword("STORE"), makeKeyword("INDESTRUCTIBLE-PROBLEMS"), makeKeyword("STALE?"));

    static private final SubLList $list_alt307 = list(makeSymbol("PROB-STORE-JANITOR-STORE"), makeSymbol("PROB-STORE-JANITOR-INDESTRUCTIBLE-PROBLEMS"), makeSymbol("PROB-STORE-JANITOR-STALE?"));

    static private final SubLList $list_alt308 = list(makeSymbol("_CSETF-PROB-STORE-JANITOR-STORE"), makeSymbol("_CSETF-PROB-STORE-JANITOR-INDESTRUCTIBLE-PROBLEMS"), makeSymbol("_CSETF-PROB-STORE-JANITOR-STALE?"));

    static private final SubLSymbol $sym315$PROB_STORE_JANITOR_STALE_ = makeSymbol("PROB-STORE-JANITOR-STALE?");

    static private final SubLSymbol $sym316$_CSETF_PROB_STORE_JANITOR_STALE_ = makeSymbol("_CSETF-PROB-STORE-JANITOR-STALE?");

    /**
     * Return a list of all the rules used in some transformation link in PROBLEM-STORE.
     */
    @LispMethod(comment = "Return a list of all the rules used in some transformation link in PROBLEM-STORE.")
    public static final SubLObject problem_store_transformation_rules_alt(SubLObject store) {
	SubLTrampolineFile.checkType(store, PROBLEM_STORE_P);
	{
	    SubLObject considered_rules = set_contents.new_set_contents(ZERO_INTEGER, symbol_function(EQ));
	    SubLObject idx = problem_store_link_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject transformation_link = NIL;
		    while (NIL != id) {
			transformation_link = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, transformation_link, $SKIP)) {
			    if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(transformation_link, $TRANSFORMATION)) {
				{
				    SubLObject rule = inference_worker_transformation.transformation_link_rule_assertion(transformation_link);
				    considered_rules = set_contents.set_contents_add(rule, considered_rules, symbol_function(EQ));
				}
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return set_contents.set_contents_element_list(considered_rules);
	}
    }

    /**
     * Return a list of all the rules used in some transformation link in PROBLEM-STORE.
     */
    @LispMethod(comment = "Return a list of all the rules used in some transformation link in PROBLEM-STORE.")
    public static SubLObject problem_store_transformation_rules(final SubLObject store) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(store) : "! inference_datastructures_problem_store.problem_store_p(store) "
		+ ("inference_datastructures_problem_store.problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(store) ") + store;
	SubLObject considered_rules = set_contents.new_set_contents(ZERO_INTEGER, symbol_function(EQ));
	final SubLObject idx = inference_datastructures_problem_store.problem_store_link_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$195 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$195, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$195);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject transformation_link;
		SubLObject rule;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    transformation_link = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(transformation_link)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(transformation_link)) {
			    transformation_link = $SKIP;
			}
			if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(transformation_link, $TRANSFORMATION)) {
			    rule = inference_worker_transformation.transformation_link_rule_assertion(transformation_link);
			    considered_rules = set_contents.set_contents_add(rule, considered_rules, symbol_function(EQ));
			}
		    }
		}
	    }
	    final SubLObject idx_$196 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$196)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$196);
		SubLObject id2 = NIL;
		SubLObject transformation_link2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			transformation_link2 = getEntryValue(cdohash_entry);
			if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(transformation_link2, $TRANSFORMATION)) {
			    final SubLObject rule2 = inference_worker_transformation.transformation_link_rule_assertion(transformation_link2);
			    considered_rules = set_contents.set_contents_add(rule2, considered_rules, symbol_function(EQ));
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return set_contents.set_contents_element_list(considered_rules);
    }

    static private final SubLList $list_alt322 = list(list(makeSymbol("PROBLEM-VAR"), makeSymbol("JANITOR"), makeSymbol("&KEY"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLSymbol $sym324$PROBLEM_DESTRUCTIBLE_ = makeSymbol("PROBLEM-DESTRUCTIBLE?");

    static private final SubLString $str_alt333$Problem_store_property__S_reflect = makeString("Problem store property ~S reflection is not yet supported");

    static private final SubLString $$$goolsbey = makeString("goolsbey");

    static private final SubLList $list_alt343 = list(list(NIL, NIL));

    public static final SubLObject problem_store_all_non_focal_problems_alt(SubLObject store) {
	SubLTrampolineFile.checkType(store, PROBLEM_STORE_P);
	{
	    SubLObject problems = set.new_set(symbol_function(EQ), UNPROVIDED);
	    SubLObject idx = problem_store_link_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject join_ordered_link = NIL;
		    while (NIL != id) {
			join_ordered_link = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, join_ordered_link, $SKIP)) {
			    if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(join_ordered_link, $JOIN_ORDERED)) {
				{
				    SubLObject problem = inference_worker_join_ordered.join_ordered_link_non_focal_problem(join_ordered_link);
				    set.set_add(problem, problems);
				}
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return Sort.sort(set.set_element_list(problems), symbol_function($sym287$_), symbol_function(PROBLEM_SUID));
	}
    }

    public static SubLObject problem_store_all_non_focal_problems(final SubLObject store) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(store) : "! inference_datastructures_problem_store.problem_store_p(store) "
		+ ("inference_datastructures_problem_store.problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(store) ") + store;
	final SubLObject problems = set.new_set(symbol_function(EQ), UNPROVIDED);
	final SubLObject idx = inference_datastructures_problem_store.problem_store_link_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$197 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$197, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$197);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject join_ordered_link;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    join_ordered_link = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(join_ordered_link)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(join_ordered_link)) {
			    join_ordered_link = $SKIP;
			}
			if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(join_ordered_link, $JOIN_ORDERED)) {
			    problem = inference_worker_join_ordered.join_ordered_link_non_focal_problem(join_ordered_link);
			    set.set_add(problem, problems);
			}
		    }
		}
	    }
	    final SubLObject idx_$198 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$198)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$198);
		SubLObject id2 = NIL;
		SubLObject join_ordered_link2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			join_ordered_link2 = getEntryValue(cdohash_entry);
			if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(join_ordered_link2, $JOIN_ORDERED)) {
			    final SubLObject problem2 = inference_worker_join_ordered.join_ordered_link_non_focal_problem(join_ordered_link2);
			    set.set_add(problem2, problems);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return Sort.sort(set.set_element_list(problems), symbol_function($sym309$_), symbol_function(PROBLEM_SUID));
    }

    public static final SubLObject problem_store_could_recompute_destructiblesP_alt(SubLObject store) {
	{
	    SubLObject janitor = problem_store_janitor(store);
	    return problem_store_janitor_staleP(janitor);
	}
    }

    public static SubLObject problem_store_could_recompute_destructiblesP(final SubLObject store) {
	final SubLObject janitor = inference_datastructures_problem_store.problem_store_janitor(store);
	return inference_datastructures_problem_store.problem_store_janitor_staleP(janitor);
    }

    public static final SubLObject problem_store_could_remove_destructiblesP_alt(SubLObject store) {
	{
	    SubLObject janitor = problem_store_janitor(store);
	    return makeBoolean(NIL == problem_store_janitor_staleP(janitor));
	}
    }

    public static SubLObject problem_store_could_remove_destructiblesP(final SubLObject store) {
	final SubLObject janitor = inference_datastructures_problem_store.problem_store_janitor(store);
	return makeBoolean(NIL == inference_datastructures_problem_store.problem_store_janitor_staleP(janitor));
    }

    /**
     * Originally motivated by running two inferences side by side and halting when they diverge.
     *
     * @unknown flesh out
     */
    @LispMethod(comment = "Originally motivated by running two inferences side by side and halting when they diverge.\r\n\r\n@unknown flesh out")
    public static final SubLObject problem_stores_similarP_alt(SubLObject store1, SubLObject store2) {
	return numE(problem_store_problem_count(store1), problem_store_problem_count(store2));
    }

    /**
     * Originally motivated by running two inferences side by side and halting when they diverge.
     *
     * @unknown flesh out
     */
    @LispMethod(comment = "Originally motivated by running two inferences side by side and halting when they diverge.\r\n\r\n@unknown flesh out")
    public static SubLObject problem_stores_similarP(final SubLObject store1, final SubLObject store2) {
	return numE(inference_datastructures_problem_store.problem_store_problem_count(store1), inference_datastructures_problem_store.problem_store_problem_count(store2));
    }

    /**
     *
     *
     * @return listp, a list of triples, each of the form (RULE BINDINGS MT),
    where at least one of BINDINGS binds a variable in RULE to a closed term.
    MT is the mt of the supported problem being transformed, assumed to be a single literal.
     */
    @LispMethod(comment = "@return listp, a list of triples, each of the form (RULE BINDINGS MT),\r\nwhere at least one of BINDINGS binds a variable in RULE to a closed term.\r\nMT is the mt of the supported problem being transformed, assumed to be a single literal.")
    public static final SubLObject problem_store_transformation_rule_bindings_to_closed_alt(SubLObject store) {
	{
	    SubLObject triples = NIL;
	    SubLObject idx = problem_store_link_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject transformation_link = NIL;
		    while (NIL != id) {
			transformation_link = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, transformation_link, $SKIP)) {
			    if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(transformation_link, $TRANSFORMATION)) {
				{
				    SubLObject rule = inference_worker_transformation.transformation_link_rule_assertion(transformation_link);
				    SubLObject v_bindings = inference_worker_transformation.transformation_link_rule_bindings_to_closed(transformation_link);
				    SubLObject mt = inference_datastructures_problem.single_literal_problem_mt(inference_datastructures_problem_link.problem_link_supported_problem(transformation_link));
				    triples = cons(list(rule, v_bindings, mt), triples);
				}
			    }
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return nreverse(triples);
	}
    }

    /**
     *
     *
     * @return listp, a list of triples, each of the form (RULE BINDINGS MT),
    where at least one of BINDINGS binds a variable in RULE to a closed term.
    MT is the mt of the supported problem being transformed, assumed to be a single literal.
     */
    @LispMethod(comment = "@return listp, a list of triples, each of the form (RULE BINDINGS MT),\r\nwhere at least one of BINDINGS binds a variable in RULE to a closed term.\r\nMT is the mt of the supported problem being transformed, assumed to be a single literal.")
    public static SubLObject problem_store_transformation_rule_bindings_to_closed(final SubLObject store) {
	SubLObject triples = NIL;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_link_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$199 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$199, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$199);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject transformation_link;
		SubLObject rule;
		SubLObject v_bindings;
		SubLObject mt;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    transformation_link = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(transformation_link)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(transformation_link)) {
			    transformation_link = $SKIP;
			}
			if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(transformation_link, $TRANSFORMATION)) {
			    rule = inference_worker_transformation.transformation_link_rule_assertion(transformation_link);
			    v_bindings = inference_worker_transformation.transformation_link_rule_bindings_to_closed(transformation_link);
			    mt = inference_datastructures_problem.single_literal_problem_mt(inference_datastructures_problem_link.problem_link_supported_problem(transformation_link));
			    triples = cons(list(rule, v_bindings, mt), triples);
			}
		    }
		}
	    }
	    final SubLObject idx_$200 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$200)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$200);
		SubLObject id2 = NIL;
		SubLObject transformation_link2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			transformation_link2 = getEntryValue(cdohash_entry);
			if (NIL != inference_datastructures_problem_link.problem_link_has_typeP(transformation_link2, $TRANSFORMATION)) {
			    final SubLObject rule2 = inference_worker_transformation.transformation_link_rule_assertion(transformation_link2);
			    final SubLObject v_bindings2 = inference_worker_transformation.transformation_link_rule_bindings_to_closed(transformation_link2);
			    final SubLObject mt2 = inference_datastructures_problem.single_literal_problem_mt(inference_datastructures_problem_link.problem_link_supported_problem(transformation_link2));
			    triples = cons(list(rule2, v_bindings2, mt2), triples);
			}
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return nreverse(triples);
    }

    public static final SubLObject problem_store_all_problems_alt(SubLObject store) {
	{
	    SubLObject problems = NIL;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    problems = cons(problem, problems);
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return Sort.sort(problems, symbol_function($sym287$_), symbol_function(PROBLEM_SUID));
	}
    }

    public static SubLObject problem_store_all_problems(final SubLObject store) {
	SubLObject problems = NIL;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$201 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$201, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$201);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			problems = cons(problem, problems);
		    }
		}
	    }
	    final SubLObject idx_$202 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$202)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$202);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			problems = cons(problem2, problems);
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return Sort.sort(problems, symbol_function($sym309$_), symbol_function(PROBLEM_SUID));
    }

    public static final SubLObject problem_store_all_problem_queries_alt(SubLObject store) {
	{
	    SubLObject queries = NIL;
	    SubLObject idx = problem_store_problem_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject problem = NIL;
		    while (NIL != id) {
			problem = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, problem, $SKIP)) {
			    queries = cons(inference_datastructures_problem.problem_query(problem), queries);
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return nreverse(queries);
	}
    }

    public static SubLObject problem_store_all_problem_queries(final SubLObject store) {
	SubLObject queries = NIL;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$203 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$203, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$203);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject problem;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    problem = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(problem)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(problem)) {
			    problem = $SKIP;
			}
			queries = cons(inference_datastructures_problem.problem_query(problem), queries);
		    }
		}
	    }
	    final SubLObject idx_$204 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$204)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$204);
		SubLObject id2 = NIL;
		SubLObject problem2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			problem2 = getEntryValue(cdohash_entry);
			queries = cons(inference_datastructures_problem.problem_query(problem2), queries);
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return nreverse(queries);
    }

    public static final SubLObject problem_store_all_problem_links_alt(SubLObject store) {
	{
	    SubLObject links = NIL;
	    SubLObject idx = problem_store_link_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, NIL, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, NIL, id, NIL);
		    SubLObject link = NIL;
		    while (NIL != id) {
			link = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, link, $SKIP)) {
			    links = cons(link, links);
			}
			id = do_id_index_next_id(idx, NIL, id, state_var);
			state_var = do_id_index_next_state(idx, NIL, id, state_var);
		    }
		}
	    }
	    return Sort.sort(links, symbol_function($sym287$_), symbol_function(PROBLEM_LINK_SUID));
	}
    }

    public static SubLObject problem_store_all_problem_links(final SubLObject store) {
	SubLObject links = NIL;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_link_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$205 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$205, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$205);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject link;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    link = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(link)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(link)) {
			    link = $SKIP;
			}
			links = cons(link, links);
		    }
		}
	    }
	    final SubLObject idx_$206 = idx;
	    if (NIL == id_index_sparse_objects_empty_p(idx_$206)) {
		final SubLObject cdohash_table = id_index_sparse_objects(idx_$206);
		SubLObject id2 = NIL;
		SubLObject link2 = NIL;
		final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
		try {
		    while (iteratorHasNext(cdohash_iterator)) {
			final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
			id2 = getEntryKey(cdohash_entry);
			link2 = getEntryValue(cdohash_entry);
			links = cons(link2, links);
		    }
		} finally {
		    releaseEntrySetIterator(cdohash_iterator);
		}
	    }
	}
	return Sort.sort(links, symbol_function($sym309$_), symbol_function(inference_datastructures_problem_store.PROBLEM_LINK_SUID));
    }

    public static final SubLObject problem_store_all_proofs_alt(SubLObject store) {
	{
	    SubLObject proofs = NIL;
	    SubLObject idx = problem_store_proof_id_index(store);
	    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
		{
		    SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
		    SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
		    SubLObject proof = NIL;
		    while (NIL != id) {
			proof = do_id_index_state_object(idx, $SKIP, id, state_var);
			if (NIL != do_id_index_id_and_object_validP(id, proof, $SKIP)) {
			    proofs = cons(proof, proofs);
			}
			id = do_id_index_next_id(idx, T, id, state_var);
			state_var = do_id_index_next_state(idx, T, id, state_var);
		    }
		}
	    }
	    return nreverse(proofs);
	}
    }

    public static SubLObject problem_store_all_proofs(final SubLObject store) {
	SubLObject proofs = NIL;
	final SubLObject idx = inference_datastructures_problem_store.problem_store_proof_id_index(store);
	if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
	    final SubLObject idx_$207 = idx;
	    if (NIL == id_index_dense_objects_empty_p(idx_$207, $SKIP)) {
		final SubLObject vector_var = id_index_dense_objects(idx_$207);
		final SubLObject backwardP_var = NIL;
		SubLObject length;
		SubLObject v_iteration;
		SubLObject id;
		SubLObject proof;
		for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
		    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
		    proof = aref(vector_var, id);
		    if ((NIL == id_index_tombstone_p(proof)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
			if (NIL != id_index_tombstone_p(proof)) {
			    proof = $SKIP;
			}
			proofs = cons(proof, proofs);
		    }
		}
	    }
	    final SubLObject idx_$208 = idx;
	    if ((NIL == id_index_sparse_objects_empty_p(idx_$208)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
		final SubLObject sparse = id_index_sparse_objects(idx_$208);
		SubLObject id2 = id_index_sparse_id_threshold(idx_$208);
		final SubLObject end_id = id_index_next_id(idx_$208);
		final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
		while (id2.numL(end_id)) {
		    final SubLObject proof2 = gethash_without_values(id2, sparse, v_default);
		    if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(proof2))) {
			proofs = cons(proof2, proofs);
		    }
		    id2 = add(id2, ONE_INTEGER);
		}
	    }
	}
	return nreverse(proofs);
    }

    /**
     *
     *
     * @return booleanp; whether PROBLEM has ever been a root problem in STORE.
     */
    @LispMethod(comment = "@return booleanp; whether PROBLEM has ever been a root problem in STORE.")
    public static final SubLObject problem_store_historical_root_problemP_alt(SubLObject store, SubLObject problem) {
	return set.set_memberP(problem, prob_store_historical_root_problems(store));
    }

    /**
     *
     *
     * @return booleanp; whether PROBLEM has ever been a root problem in STORE.
     */
    @LispMethod(comment = "@return booleanp; whether PROBLEM has ever been a root problem in STORE.")
    public static SubLObject problem_store_historical_root_problemP(final SubLObject store, final SubLObject problem) {
	return set.set_memberP(problem, inference_datastructures_problem_store.prob_store_historical_root_problems(store));
    }

    /**
     *
     *
     * @return non-negative-integer-p; the number of currently existing problems in STORE
    that have ever been the root problem of some inference.
     */
    @LispMethod(comment = "@return non-negative-integer-p; the number of currently existing problems in STORE\r\nthat have ever been the root problem of some inference.")
    public static final SubLObject problem_store_historical_root_problem_count_alt(SubLObject store) {
	return set.set_size(prob_store_historical_root_problems(store));
    }

    /**
     *
     *
     * @return non-negative-integer-p; the number of currently existing problems in STORE
    that have ever been the root problem of some inference.
     */
    @LispMethod(comment = "@return non-negative-integer-p; the number of currently existing problems in STORE\r\nthat have ever been the root problem of some inference.")
    public static SubLObject problem_store_historical_root_problem_count(final SubLObject store) {
	return set.set_size(inference_datastructures_problem_store.prob_store_historical_root_problems(store));
    }

    /**
     *
     *
     * @return booleanp; whether PROBLEM has been noted as having a complex problem query that may become reused.
     */
    @LispMethod(comment = "@return booleanp; whether PROBLEM has been noted as having a complex problem query that may become reused.")
    public static final SubLObject problem_store_problem_with_complex_problem_queryP_alt(SubLObject store, SubLObject problem) {
	return dictionary_utilities.dictionary_has_keyP(prob_store_complex_problem_query_signatures(store), problem);
    }

    /**
     *
     *
     * @return booleanp; whether PROBLEM has been noted as having a complex problem query that may become reused.
     */
    @LispMethod(comment = "@return booleanp; whether PROBLEM has been noted as having a complex problem query that may become reused.")
    public static SubLObject problem_store_problem_with_complex_problem_queryP(final SubLObject store, final SubLObject problem) {
	return dictionary_utilities.dictionary_has_keyP(inference_datastructures_problem_store.prob_store_complex_problem_query_signatures(store), problem);
    }

    public static final SubLObject problem_store_complex_problem_query_signature_alt(SubLObject store, SubLObject problem) {
	return dictionary.dictionary_lookup_without_values(prob_store_complex_problem_query_signatures(store), problem, $UNDETERMINED);
    }

    public static SubLObject problem_store_complex_problem_query_signature(final SubLObject store, final SubLObject problem) {
	return dictionary.dictionary_lookup_without_values(inference_datastructures_problem_store.prob_store_complex_problem_query_signatures(store), problem, $UNDETERMINED);
    }

    /**
     * Return T iff STORE has an existing complex problem that matches QUERY modulo a variable map.
     *
     * @return 0 problem-p (or NIL if no match)
     * @return 1 variable-map-p ; a variable map from problem's vars -> query's vars
     */
    @LispMethod(comment = "Return T iff STORE has an existing complex problem that matches QUERY modulo a variable map.\r\n\r\n@return 0 problem-p (or NIL if no match)\r\n@return 1 variable-map-p ; a variable map from problem\'s vars -> query\'s vars")
    public static final SubLObject problem_store_find_complex_problem_query(SubLObject store, SubLObject query) {
	{
	    SubLObject signature = inference_datastructures_problem_query.problem_query_term_signature(query);
	    SubLObject index = prob_store_complex_problem_query_czer_index(store);
	    SubLObject candidate_problems = dictionary.dictionary_lookup_without_values(index, signature, NIL);
	    SubLObject cdolist_list_var = candidate_problems;
	    SubLObject problem = NIL;
	    for (problem = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), problem = cdolist_list_var.first()) {
		{
		    SubLObject candidate_query = inference_datastructures_problem.problem_query(problem);
		    SubLObject problem_variable_map = unification_utilities.compute_variable_map(candidate_query, query);
		    if (NIL != problem_variable_map) {
			return values(problem, problem_variable_map);
		    }
		}
	    }
	}
	return NIL;
    }

    public static SubLObject problem_store_find_complex_problem_query(final SubLObject store, final SubLObject query, final SubLObject free_hl_vars) {
	final SubLObject signature = inference_datastructures_problem_query.problem_query_term_signature(query);
	final SubLObject index = inference_datastructures_problem_store.prob_store_complex_problem_query_czer_index(store);
	SubLObject cdolist_list_var;
	final SubLObject candidate_problems = cdolist_list_var = dictionary.dictionary_lookup_without_values(index, signature, NIL);
	SubLObject problem = NIL;
	problem = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    if ((NIL == inference_datastructures_problem_store.problem_identity_depends_on_free_hl_varsP(store)) || free_hl_vars.equal(inference_datastructures_problem.problem_free_hl_vars(problem))) {
		final SubLObject candidate_query = inference_datastructures_problem.problem_query(problem);
		final SubLObject problem_variable_map = unification_utilities.compute_variable_map(candidate_query, query);
		if (NIL != problem_variable_map) {
		    return values(problem, problem_variable_map);
		}
	    }
	    cdolist_list_var = cdolist_list_var.rest();
	    problem = cdolist_list_var.first();
	}
	return NIL;
    }

    public static final SubLObject clear_problem_store_proof_keeping_problems_alt(SubLObject store) {
	clrhash(prob_store_proof_keeping_index(store));
	return NIL;
    }

    public static SubLObject clear_problem_store_proof_keeping_problems(final SubLObject store) {
	clrhash(inference_datastructures_problem_store.prob_store_proof_keeping_index(store));
	return NIL;
    }

    /**
     *
     *
     * @return keywordp; either :non-proof-keeping, :unknown, or anything else,
    which indicates the reason the problem is proof-keeping
     */
    @LispMethod(comment = "@return keywordp; either :non-proof-keeping, :unknown, or anything else,\r\nwhich indicates the reason the problem is proof-keeping")
    public static final SubLObject problem_proof_keeping_status_alt(SubLObject problem) {
	return gethash_without_values(problem, prob_store_proof_keeping_index(inference_datastructures_problem.problem_store(problem)), $UNKNOWN);
    }

    /**
     *
     *
     * @return keywordp; either :non-proof-keeping, :unknown, or anything else,
    which indicates the reason the problem is proof-keeping
     */
    @LispMethod(comment = "@return keywordp; either :non-proof-keeping, :unknown, or anything else,\r\nwhich indicates the reason the problem is proof-keeping")
    public static SubLObject problem_proof_keeping_status(final SubLObject problem) {
	return gethash_without_values(problem, inference_datastructures_problem_store.prob_store_proof_keeping_index(inference_datastructures_problem.problem_store(problem)), $UNKNOWN);
    }

    /**
     * note that a problem can be :unknown (no entry) in which case both
     *
     * @unknown proof-keeping-problem? and @xref non-proof-keeping-problem? will return NIL.
     */
    @LispMethod(comment = "note that a problem can be :unknown (no entry) in which case both\r\n\r\n@unknown proof-keeping-problem? and @xref non-proof-keeping-problem? will return NIL.")
    public static final SubLObject proof_keeping_problemP_alt(SubLObject problem) {
	{
	    SubLObject status = problem_proof_keeping_status(problem);
	    return makeBoolean((status != $NON_PROOF_KEEPING) && (status != $UNKNOWN));
	}
    }

    /**
     * note that a problem can be :unknown (no entry) in which case both
     *
     * @unknown proof-keeping-problem? and @xref non-proof-keeping-problem? will return NIL.
     */
    @LispMethod(comment = "note that a problem can be :unknown (no entry) in which case both\r\n\r\n@unknown proof-keeping-problem? and @xref non-proof-keeping-problem? will return NIL.")
    public static SubLObject proof_keeping_problemP(final SubLObject problem) {
	final SubLObject status = inference_datastructures_problem_store.problem_proof_keeping_status(problem);
	return makeBoolean((status != $NON_PROOF_KEEPING) && (status != $UNKNOWN));
    }

    /**
     * note that a problem can be :unknown (no entry) in which case both
     *
     * @unknown proof-keeping-problem? and @xref non-proof-keeping-problem? will return NIL.
     */
    @LispMethod(comment = "note that a problem can be :unknown (no entry) in which case both\r\n\r\n@unknown proof-keeping-problem? and @xref non-proof-keeping-problem? will return NIL.")
    public static final SubLObject non_proof_keeping_problemP_alt(SubLObject problem) {
	return eq($NON_PROOF_KEEPING, problem_proof_keeping_status(problem));
    }

    /**
     * note that a problem can be :unknown (no entry) in which case both
     *
     * @unknown proof-keeping-problem? and @xref non-proof-keeping-problem? will return NIL.
     */
    @LispMethod(comment = "note that a problem can be :unknown (no entry) in which case both\r\n\r\n@unknown proof-keeping-problem? and @xref non-proof-keeping-problem? will return NIL.")
    public static SubLObject non_proof_keeping_problemP(final SubLObject problem) {
	return eq($NON_PROOF_KEEPING, inference_datastructures_problem_store.problem_proof_keeping_status(problem));
    }

    public static final SubLObject unknown_proof_keeping_problemP_alt(SubLObject problem) {
	return eq($UNKNOWN, problem_proof_keeping_status(problem));
    }

    public static SubLObject unknown_proof_keeping_problemP(final SubLObject problem) {
	return eq($UNKNOWN, inference_datastructures_problem_store.problem_proof_keeping_status(problem));
    }

    public static final SubLObject note_proof_keeping_problem_alt(SubLObject problem, SubLObject reason) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    if (NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) {
		if (NIL != member_eqP(reason, $list_alt294)) {
		    Errors.error($str_alt295$Invalid_proof_keeping_reason__a_f, reason, problem);
		}
	    }
	    sethash(problem, prob_store_proof_keeping_index(inference_datastructures_problem.problem_store(problem)), reason);
	    return NIL;
	}
    }

    public static SubLObject note_proof_keeping_problem(final SubLObject problem, final SubLObject reason) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL != list_utilities.member_eqP(reason, $list317))) {
	    Errors.error($str318$Invalid_proof_keeping_reason__a_f, reason, problem);
	}
	sethash(problem, inference_datastructures_problem_store.prob_store_proof_keeping_index(inference_datastructures_problem.problem_store(problem)), reason);
	return NIL;
    }

    public static final SubLObject note_not_proof_keeping_problem_alt(SubLObject problem) {
	sethash(problem, prob_store_proof_keeping_index(inference_datastructures_problem.problem_store(problem)), $NON_PROOF_KEEPING);
	return NIL;
    }

    public static SubLObject note_not_proof_keeping_problem(final SubLObject problem) {
	sethash(problem, inference_datastructures_problem_store.prob_store_proof_keeping_index(inference_datastructures_problem.problem_store(problem)), $NON_PROOF_KEEPING);
	return NIL;
    }

    public static final SubLObject _csetf_prob_store_problem_by_query_index(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return v_object.setField11(value);
    }

    public static final SubLObject prob_store_problem_by_query_index(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_P);
	return v_object.getField11();
    }

    public static final SubLObject problem_store_prepare_for_expected_problem_count_alt(SubLObject store, SubLObject total) {
	SubLTrampolineFile.checkType(store, PROBLEM_STORE_P);
	SubLTrampolineFile.checkType(total, NON_NEGATIVE_INTEGER_P);
	{
	    SubLObject lock = problem_store_lock(store);
	    SubLObject release = NIL;
	    try {
		release = seize_lock(lock);
		{
		    SubLObject old_table = prob_store_problem_by_query_index(store);
		    _csetf_prob_store_problem_by_query_index(store, hash_table_utilities.copy_hashtable(old_table, total));
		}
	    } finally {
		if (NIL != release) {
		    release_lock(lock);
		}
	    }
	}
	return optimize_id_index(prob_store_problem_id_index(store), total);
    }

    public static SubLObject problem_store_prepare_for_expected_problem_count(final SubLObject store, final SubLObject total) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(store) : "! inference_datastructures_problem_store.problem_store_p(store) "
		+ ("inference_datastructures_problem_store.problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(store) ") + store;
	assert NIL != subl_promotions.non_negative_integer_p(total) : "! subl_promotions.non_negative_integer_p(total) " + ("subl_promotions.non_negative_integer_p(total) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(total) ") + total;
	final SubLObject lock = inference_datastructures_problem_store.problem_store_lock(store);
	SubLObject release = NIL;
	try {
	    release = seize_lock(lock);
	    final SubLObject old_table = inference_datastructures_problem_store.prob_store_problems_by_query_index(store);
	    inference_datastructures_problem_store._csetf_prob_store_problems_by_query_index(store, hash_table_utilities.copy_hashtable(old_table, total));
	} finally {
	    if (NIL != release) {
		release_lock(lock);
	    }
	}
	return optimize_id_index(inference_datastructures_problem_store.prob_store_problem_id_index(store), total);
    }

    public static final SubLObject problem_store_prepare_for_expected_link_count_alt(SubLObject store, SubLObject total) {
	SubLTrampolineFile.checkType(store, PROBLEM_STORE_P);
	SubLTrampolineFile.checkType(total, NON_NEGATIVE_INTEGER_P);
	return optimize_id_index(prob_store_link_id_index(store), total);
    }

    public static SubLObject problem_store_prepare_for_expected_link_count(final SubLObject store, final SubLObject total) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(store) : "! inference_datastructures_problem_store.problem_store_p(store) "
		+ ("inference_datastructures_problem_store.problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(store) ") + store;
	assert NIL != subl_promotions.non_negative_integer_p(total) : "! subl_promotions.non_negative_integer_p(total) " + ("subl_promotions.non_negative_integer_p(total) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(total) ") + total;
	return optimize_id_index(inference_datastructures_problem_store.prob_store_link_id_index(store), total);
    }

    public static final SubLObject problem_store_prepare_for_expected_proof_count_alt(SubLObject store, SubLObject total) {
	SubLTrampolineFile.checkType(store, PROBLEM_STORE_P);
	SubLTrampolineFile.checkType(total, NON_NEGATIVE_INTEGER_P);
	return optimize_id_index(prob_store_proof_id_index(store), total);
    }

    public static SubLObject problem_store_prepare_for_expected_proof_count(final SubLObject store, final SubLObject total) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(store) : "! inference_datastructures_problem_store.problem_store_p(store) "
		+ ("inference_datastructures_problem_store.problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(store) ") + store;
	assert NIL != subl_promotions.non_negative_integer_p(total) : "! subl_promotions.non_negative_integer_p(total) " + ("subl_promotions.non_negative_integer_p(total) " + "CommonSymbols.NIL != subl_promotions.non_negative_integer_p(total) ") + total;
	return optimize_id_index(inference_datastructures_problem_store.prob_store_proof_id_index(store), total);
    }

    public static final SubLObject problem_store_new_inference_id_alt(SubLObject store) {
	{
	    SubLObject v_id_index = problem_store_inference_id_index(store);
	    SubLObject suid = NIL;
	    SubLObject lock = problem_store_lock(store);
	    SubLObject release = NIL;
	    try {
		release = seize_lock(lock);
		suid = id_index_reserve(v_id_index);
	    } finally {
		if (NIL != release) {
		    release_lock(lock);
		}
	    }
	    return suid;
	}
    }

    public static SubLObject problem_store_new_inference_id(final SubLObject store) {
	final SubLObject v_id_index = inference_datastructures_problem_store.problem_store_inference_id_index(store);
	SubLObject suid = NIL;
	final SubLObject lock = inference_datastructures_problem_store.problem_store_lock(store);
	SubLObject release = NIL;
	try {
	    release = seize_lock(lock);
	    suid = id_index_reserve(v_id_index);
	} finally {
	    if (NIL != release) {
		release_lock(lock);
	    }
	}
	return suid;
    }

    public static final SubLObject problem_store_new_strategy_id_alt(SubLObject store) {
	{
	    SubLObject v_id_index = problem_store_strategy_id_index(store);
	    SubLObject suid = NIL;
	    SubLObject lock = problem_store_lock(store);
	    SubLObject release = NIL;
	    try {
		release = seize_lock(lock);
		suid = id_index_reserve(v_id_index);
	    } finally {
		if (NIL != release) {
		    release_lock(lock);
		}
	    }
	    return suid;
	}
    }

    public static SubLObject problem_store_new_strategy_id(final SubLObject store) {
	final SubLObject v_id_index = inference_datastructures_problem_store.problem_store_strategy_id_index(store);
	SubLObject suid = NIL;
	final SubLObject lock = inference_datastructures_problem_store.problem_store_lock(store);
	SubLObject release = NIL;
	try {
	    release = seize_lock(lock);
	    suid = id_index_reserve(v_id_index);
	} finally {
	    if (NIL != release) {
		release_lock(lock);
	    }
	}
	return suid;
    }

    public static final SubLObject problem_store_new_problem_id_alt(SubLObject store) {
	{
	    SubLObject v_id_index = problem_store_problem_id_index(store);
	    SubLObject suid = NIL;
	    SubLObject lock = problem_store_lock(store);
	    SubLObject release = NIL;
	    try {
		release = seize_lock(lock);
		suid = id_index_reserve(v_id_index);
	    } finally {
		if (NIL != release) {
		    release_lock(lock);
		}
	    }
	    return suid;
	}
    }

    public static SubLObject problem_store_new_problem_id(final SubLObject store) {
	final SubLObject v_id_index = inference_datastructures_problem_store.problem_store_problem_id_index(store);
	SubLObject suid = NIL;
	final SubLObject lock = inference_datastructures_problem_store.problem_store_lock(store);
	SubLObject release = NIL;
	try {
	    release = seize_lock(lock);
	    suid = id_index_reserve(v_id_index);
	} finally {
	    if (NIL != release) {
		release_lock(lock);
	    }
	}
	return suid;
    }

    public static final SubLObject problem_store_new_link_id_alt(SubLObject store) {
	{
	    SubLObject v_id_index = problem_store_link_id_index(store);
	    SubLObject suid = NIL;
	    SubLObject lock = problem_store_lock(store);
	    SubLObject release = NIL;
	    try {
		release = seize_lock(lock);
		suid = id_index_reserve(v_id_index);
	    } finally {
		if (NIL != release) {
		    release_lock(lock);
		}
	    }
	    return suid;
	}
    }

    public static SubLObject problem_store_new_link_id(final SubLObject store) {
	final SubLObject v_id_index = inference_datastructures_problem_store.problem_store_link_id_index(store);
	SubLObject suid = NIL;
	final SubLObject lock = inference_datastructures_problem_store.problem_store_lock(store);
	SubLObject release = NIL;
	try {
	    release = seize_lock(lock);
	    suid = id_index_reserve(v_id_index);
	} finally {
	    if (NIL != release) {
		release_lock(lock);
	    }
	}
	return suid;
    }

    public static final SubLObject problem_store_new_proof_id_alt(SubLObject store) {
	{
	    SubLObject v_id_index = problem_store_proof_id_index(store);
	    SubLObject suid = NIL;
	    SubLObject lock = problem_store_lock(store);
	    SubLObject release = NIL;
	    try {
		release = seize_lock(lock);
		suid = id_index_reserve(v_id_index);
	    } finally {
		if (NIL != release) {
		    release_lock(lock);
		}
	    }
	    return suid;
	}
    }

    public static SubLObject problem_store_new_proof_id(final SubLObject store) {
	final SubLObject v_id_index = inference_datastructures_problem_store.problem_store_proof_id_index(store);
	SubLObject suid = NIL;
	final SubLObject lock = inference_datastructures_problem_store.problem_store_lock(store);
	SubLObject release = NIL;
	try {
	    release = seize_lock(lock);
	    suid = id_index_reserve(v_id_index);
	} finally {
	    if (NIL != release) {
		release_lock(lock);
	    }
	}
	return suid;
    }

    public static final SubLObject add_problem_store_inference_alt(SubLObject store, SubLObject inference) {
	{
	    SubLObject id = inference_datastructures_inference.inference_suid(inference);
	    SubLObject lock = problem_store_lock(store);
	    SubLObject release = NIL;
	    try {
		release = seize_lock(lock);
		id_index_enter_unlocked_autoextend(prob_store_inference_id_index(store), id, inference);
	    } finally {
		if (NIL != release) {
		    release_lock(lock);
		}
	    }
	}
	return store;
    }

    public static SubLObject add_problem_store_inference(final SubLObject store, final SubLObject inference) {
	final SubLObject id = inference_datastructures_inference.inference_suid(inference);
	final SubLObject lock = inference_datastructures_problem_store.problem_store_lock(store);
	SubLObject release = NIL;
	try {
	    release = seize_lock(lock);
	    id_index_enter_unlocked_autoextend(inference_datastructures_problem_store.prob_store_inference_id_index(store), id, inference, NIL);
	} finally {
	    if (NIL != release) {
		release_lock(lock);
	    }
	}
	return store;
    }

    public static final SubLObject remove_problem_store_inference_alt(SubLObject store, SubLObject inference) {
	{
	    SubLObject id = inference_datastructures_inference.inference_suid(inference);
	    SubLObject lock = problem_store_lock(store);
	    SubLObject release = NIL;
	    try {
		release = seize_lock(lock);
		id_index_remove(prob_store_inference_id_index(store), id);
		problem_store_min_proof_depth_index_remove_inference(store, inference);
		problem_store_min_transformation_depth_index_remove_inference(store, inference);
		problem_store_min_transformation_depth_signature_index_remove_inference(store, inference);
	    } finally {
		if (NIL != release) {
		    release_lock(lock);
		}
	    }
	}
	return store;
    }

    public static SubLObject remove_problem_store_inference(final SubLObject store, final SubLObject inference) {
	final SubLObject id = inference_datastructures_inference.inference_suid(inference);
	final SubLObject lock = inference_datastructures_problem_store.problem_store_lock(store);
	SubLObject release = NIL;
	try {
	    release = seize_lock(lock);
	    id_index_remove(inference_datastructures_problem_store.prob_store_inference_id_index(store), id);
	    inference_datastructures_problem_store.problem_store_min_proof_depth_index_remove_inference(store, inference);
	    inference_datastructures_problem_store.problem_store_min_transformation_depth_index_remove_inference(store, inference);
	    inference_datastructures_problem_store.problem_store_min_transformation_depth_signature_index_remove_inference(store, inference);
	} finally {
	    if (NIL != release) {
		release_lock(lock);
	    }
	}
	return store;
    }

    public static final SubLObject add_problem_store_strategy_alt(SubLObject store, SubLObject strategy) {
	{
	    SubLObject id = inference_datastructures_strategy.strategy_suid(strategy);
	    SubLObject lock = problem_store_lock(store);
	    SubLObject release = NIL;
	    try {
		release = seize_lock(lock);
		id_index_enter_unlocked_autoextend(prob_store_strategy_id_index(store), id, strategy);
	    } finally {
		if (NIL != release) {
		    release_lock(lock);
		}
	    }
	}
	return store;
    }

    public static SubLObject add_problem_store_strategy(final SubLObject store, final SubLObject strategy) {
	final SubLObject id = inference_datastructures_strategy.strategy_suid(strategy);
	final SubLObject lock = inference_datastructures_problem_store.problem_store_lock(store);
	SubLObject release = NIL;
	try {
	    release = seize_lock(lock);
	    id_index_enter_unlocked_autoextend(inference_datastructures_problem_store.prob_store_strategy_id_index(store), id, strategy, NIL);
	} finally {
	    if (NIL != release) {
		release_lock(lock);
	    }
	}
	return store;
    }

    public static final SubLObject remove_problem_store_strategy_alt(SubLObject store, SubLObject strategy) {
	{
	    SubLObject id = inference_datastructures_strategy.strategy_suid(strategy);
	    SubLObject lock = problem_store_lock(store);
	    SubLObject release = NIL;
	    try {
		release = seize_lock(lock);
		id_index_remove(prob_store_strategy_id_index(store), id);
	    } finally {
		if (NIL != release) {
		    release_lock(lock);
		}
	    }
	}
	return store;
    }

    public static SubLObject remove_problem_store_strategy(final SubLObject store, final SubLObject strategy) {
	final SubLObject id = inference_datastructures_strategy.strategy_suid(strategy);
	final SubLObject lock = inference_datastructures_problem_store.problem_store_lock(store);
	SubLObject release = NIL;
	try {
	    release = seize_lock(lock);
	    id_index_remove(inference_datastructures_problem_store.prob_store_strategy_id_index(store), id);
	} finally {
	    if (NIL != release) {
		release_lock(lock);
	    }
	}
	return store;
    }

    public static final SubLObject add_problem_store_problem_by_id_alt(SubLObject store, SubLObject problem) {
	{
	    SubLObject id = inference_datastructures_problem.problem_suid(problem);
	    SubLObject lock = problem_store_lock(store);
	    SubLObject release = NIL;
	    try {
		release = seize_lock(lock);
		id_index_enter_unlocked_autoextend(prob_store_problem_id_index(store), id, problem);
	    } finally {
		if (NIL != release) {
		    release_lock(lock);
		}
	    }
	}
	return store;
    }

    public static SubLObject add_problem_store_problem_by_id(final SubLObject store, final SubLObject problem) {
	final SubLObject id = inference_datastructures_problem.problem_suid(problem);
	final SubLObject lock = inference_datastructures_problem_store.problem_store_lock(store);
	SubLObject release = NIL;
	try {
	    release = seize_lock(lock);
	    id_index_enter_unlocked_autoextend(inference_datastructures_problem_store.prob_store_problem_id_index(store), id, problem, NIL);
	} finally {
	    if (NIL != release) {
		release_lock(lock);
	    }
	}
	return store;
    }

    public static final SubLObject remove_problem_store_problem_by_id_alt(SubLObject store, SubLObject problem) {
	{
	    SubLObject id = inference_datastructures_problem.problem_suid(problem);
	    SubLObject lock = problem_store_lock(store);
	    SubLObject release = NIL;
	    try {
		release = seize_lock(lock);
		id_index_remove(prob_store_problem_id_index(store), id);
	    } finally {
		if (NIL != release) {
		    release_lock(lock);
		}
	    }
	}
	return store;
    }

    public static SubLObject remove_problem_store_problem_by_id(final SubLObject store, final SubLObject problem) {
	final SubLObject id = inference_datastructures_problem.problem_suid(problem);
	final SubLObject lock = inference_datastructures_problem_store.problem_store_lock(store);
	SubLObject release = NIL;
	try {
	    release = seize_lock(lock);
	    id_index_remove(inference_datastructures_problem_store.prob_store_problem_id_index(store), id);
	} finally {
	    if (NIL != release) {
		release_lock(lock);
	    }
	}
	return store;
    }

    public static final SubLObject add_problem_store_problem_by_query_alt(SubLObject store, SubLObject problem) {
	if (NIL != inference_datastructures_problem.problem_in_equality_reasoning_domainP(problem)) {
	    {
		SubLObject query = inference_datastructures_problem.problem_query(problem);
		SubLObject lock = problem_store_lock(store);
		SubLObject release = NIL;
		try {
		    release = seize_lock(lock);
		    sethash(query, prob_store_problem_by_query_index(store), problem);
		} finally {
		    if (NIL != release) {
			release_lock(lock);
		    }
		}
	    }
	}
	return store;
    }

    public static SubLObject add_problem_store_problem_by_query(final SubLObject store, final SubLObject problem) {
	if (NIL != inference_datastructures_problem.problem_in_equality_reasoning_domainP(problem)) {
	    final SubLObject query = inference_datastructures_problem.problem_query(problem);
	    final SubLObject lock = inference_datastructures_problem_store.problem_store_lock(store);
	    SubLObject release = NIL;
	    try {
		release = seize_lock(lock);
		hash_table_utilities.push_hash(query, problem, inference_datastructures_problem_store.prob_store_problems_by_query_index(store));
	    } finally {
		if (NIL != release) {
		    release_lock(lock);
		}
	    }
	}
	return store;
    }

    public static final SubLObject remove_problem_store_problem_by_query_alt(SubLObject store, SubLObject problem) {
	if (NIL != inference_datastructures_problem.problem_in_equality_reasoning_domainP(problem)) {
	    {
		SubLObject query = inference_datastructures_problem.problem_query(problem);
		SubLObject lock = problem_store_lock(store);
		SubLObject release = NIL;
		try {
		    release = seize_lock(lock);
		    remhash(query, prob_store_problem_by_query_index(store));
		} finally {
		    if (NIL != release) {
			release_lock(lock);
		    }
		}
	    }
	}
	return store;
    }

    public static SubLObject remove_problem_store_problem_by_query(final SubLObject store, final SubLObject problem) {
	if (NIL != inference_datastructures_problem.problem_in_equality_reasoning_domainP(problem)) {
	    final SubLObject query = inference_datastructures_problem.problem_query(problem);
	    final SubLObject lock = inference_datastructures_problem_store.problem_store_lock(store);
	    SubLObject release = NIL;
	    try {
		release = seize_lock(lock);
		hash_table_utilities.remove_value_from_hash(query, problem, inference_datastructures_problem_store.prob_store_problems_by_query_index(store), UNPROVIDED);
	    } finally {
		if (NIL != release) {
		    release_lock(lock);
		}
	    }
	}
	return store;
    }

    public static final SubLObject add_problem_store_link_alt(SubLObject store, SubLObject link) {
	{
	    SubLObject id = inference_datastructures_problem_link.problem_link_suid(link);
	    SubLObject lock = problem_store_lock(store);
	    SubLObject release = NIL;
	    try {
		release = seize_lock(lock);
		id_index_enter_unlocked_autoextend(prob_store_link_id_index(store), id, link);
	    } finally {
		if (NIL != release) {
		    release_lock(lock);
		}
	    }
	}
	return store;
    }

    public static SubLObject add_problem_store_link(final SubLObject store, final SubLObject link) {
	final SubLObject id = inference_datastructures_problem_link.problem_link_suid(link);
	final SubLObject lock = inference_datastructures_problem_store.problem_store_lock(store);
	SubLObject release = NIL;
	try {
	    release = seize_lock(lock);
	    id_index_enter_unlocked_autoextend(inference_datastructures_problem_store.prob_store_link_id_index(store), id, link, NIL);
	} finally {
	    if (NIL != release) {
		release_lock(lock);
	    }
	}
	return store;
    }

    public static final SubLObject remove_problem_store_link_alt(SubLObject store, SubLObject link) {
	{
	    SubLObject id = inference_datastructures_problem_link.problem_link_suid(link);
	    SubLObject lock = problem_store_lock(store);
	    SubLObject release = NIL;
	    try {
		release = seize_lock(lock);
		id_index_remove(prob_store_link_id_index(store), id);
	    } finally {
		if (NIL != release) {
		    release_lock(lock);
		}
	    }
	}
	return store;
    }

    public static SubLObject remove_problem_store_link(final SubLObject store, final SubLObject link) {
	final SubLObject id = inference_datastructures_problem_link.problem_link_suid(link);
	final SubLObject lock = inference_datastructures_problem_store.problem_store_lock(store);
	SubLObject release = NIL;
	try {
	    release = seize_lock(lock);
	    id_index_remove(inference_datastructures_problem_store.prob_store_link_id_index(store), id);
	} finally {
	    if (NIL != release) {
		release_lock(lock);
	    }
	}
	return store;
    }

    public static final SubLObject add_problem_store_proof_alt(SubLObject store, SubLObject proof) {
	{
	    SubLObject id = inference_datastructures_proof.proof_suid(proof);
	    SubLObject lock = problem_store_lock(store);
	    SubLObject release = NIL;
	    try {
		release = seize_lock(lock);
		id_index_enter_unlocked_autoextend(prob_store_proof_id_index(store), id, proof);
	    } finally {
		if (NIL != release) {
		    release_lock(lock);
		}
	    }
	}
	return store;
    }

    public static SubLObject add_problem_store_proof(final SubLObject store, final SubLObject proof) {
	final SubLObject id = inference_datastructures_proof.proof_suid(proof);
	final SubLObject lock = inference_datastructures_problem_store.problem_store_lock(store);
	SubLObject release = NIL;
	try {
	    release = seize_lock(lock);
	    id_index_enter_unlocked_autoextend(inference_datastructures_problem_store.prob_store_proof_id_index(store), id, proof, NIL);
	} finally {
	    if (NIL != release) {
		release_lock(lock);
	    }
	}
	return store;
    }

    public static final SubLObject remove_problem_store_proof_alt(SubLObject store, SubLObject proof) {
	{
	    SubLObject id = inference_datastructures_proof.proof_suid(proof);
	    SubLObject lock = problem_store_lock(store);
	    SubLObject release = NIL;
	    try {
		release = seize_lock(lock);
		id_index_remove(prob_store_proof_id_index(store), id);
	    } finally {
		if (NIL != release) {
		    release_lock(lock);
		}
	    }
	}
	return store;
    }

    public static SubLObject remove_problem_store_proof(final SubLObject store, final SubLObject proof) {
	final SubLObject id = inference_datastructures_proof.proof_suid(proof);
	final SubLObject lock = inference_datastructures_problem_store.problem_store_lock(store);
	SubLObject release = NIL;
	try {
	    release = seize_lock(lock);
	    id_index_remove(inference_datastructures_problem_store.prob_store_proof_id_index(store), id);
	} finally {
	    if (NIL != release) {
		release_lock(lock);
	    }
	}
	return store;
    }

    public static final SubLObject problem_store_forget_that_proof_is_rejected_alt(SubLObject store, SubLObject proof) {
	SubLTrampolineFile.checkType(store, PROBLEM_STORE_P);
	SubLTrampolineFile.checkType(proof, $sym297$PROOF_REJECTED_);
	{
	    SubLObject rejected_proofs = problem_store_rejected_proofs(store);
	    dictionary.dictionary_remove(rejected_proofs, proof);
	    return store;
	}
    }

    public static SubLObject problem_store_forget_that_proof_is_rejected(final SubLObject store, final SubLObject proof) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(store) : "! inference_datastructures_problem_store.problem_store_p(store) "
		+ ("inference_datastructures_problem_store.problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(store) ") + store;
	assert NIL != inference_datastructures_proof.proof_rejectedP(proof) : "! inference_datastructures_proof.proof_rejectedP(proof) " + ("inference_datastructures_proof.proof_rejectedP(proof) " + "CommonSymbols.NIL != inference_datastructures_proof.proof_rejectedP(proof) ") + proof;
	final SubLObject rejected_proofs = inference_datastructures_problem_store.problem_store_rejected_proofs(store);
	dictionary.dictionary_remove(rejected_proofs, proof);
	return store;
    }

    public static final SubLObject problem_store_note_proof_processed_alt(SubLObject store, SubLObject proof) {
	SubLTrampolineFile.checkType(store, PROBLEM_STORE_P);
	SubLTrampolineFile.checkType(proof, PROOF_P);
	{
	    SubLObject processed_proofs = problem_store_processed_proofs(store);
	    set.set_add(proof, processed_proofs);
	    return store;
	}
    }

    public static SubLObject problem_store_note_proof_processed(final SubLObject store, final SubLObject proof) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(store) : "! inference_datastructures_problem_store.problem_store_p(store) "
		+ ("inference_datastructures_problem_store.problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(store) ") + store;
	assert NIL != inference_datastructures_proof.proof_p(proof) : "! inference_datastructures_proof.proof_p(proof) " + ("inference_datastructures_proof.proof_p(proof) " + "CommonSymbols.NIL != inference_datastructures_proof.proof_p(proof) ") + proof;
	final SubLObject processed_proofs = inference_datastructures_problem_store.problem_store_processed_proofs(store);
	set.set_add(proof, processed_proofs);
	return store;
    }

    public static final SubLObject problem_store_note_proof_unprocessed_alt(SubLObject store, SubLObject proof) {
	SubLTrampolineFile.checkType(store, PROBLEM_STORE_P);
	SubLTrampolineFile.checkType(proof, PROOF_P);
	{
	    SubLObject processed_proofs = problem_store_processed_proofs(store);
	    set.set_remove(proof, processed_proofs);
	    return store;
	}
    }

    public static SubLObject problem_store_note_proof_unprocessed(final SubLObject store, final SubLObject proof) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(store) : "! inference_datastructures_problem_store.problem_store_p(store) "
		+ ("inference_datastructures_problem_store.problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(store) ") + store;
	assert NIL != inference_datastructures_proof.proof_p(proof) : "! inference_datastructures_proof.proof_p(proof) " + ("inference_datastructures_proof.proof_p(proof) " + "CommonSymbols.NIL != inference_datastructures_proof.proof_p(proof) ") + proof;
	final SubLObject processed_proofs = inference_datastructures_problem_store.problem_store_processed_proofs(store);
	set.set_remove(proof, processed_proofs);
	return store;
    }

    public static SubLObject problem_store_note_problem_potentially_processed(final SubLObject store, final SubLObject problem) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(store) : "! inference_datastructures_problem_store.problem_store_p(store) "
		+ ("inference_datastructures_problem_store.problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(store) ") + store;
	assert NIL != inference_datastructures_problem.problem_p(problem) : "! inference_datastructures_problem.problem_p(problem) " + ("inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) ") + problem;
	final SubLObject potentially_processed_problems = inference_datastructures_problem_store.problem_store_potentially_processed_problems(store);
	set.set_add(problem, potentially_processed_problems);
	return store;
    }

    public static SubLObject problem_store_note_problem_unprocessed(final SubLObject store, final SubLObject problem) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(store) : "! inference_datastructures_problem_store.problem_store_p(store) "
		+ ("inference_datastructures_problem_store.problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(store) ") + store;
	assert NIL != inference_datastructures_problem.problem_p(problem) : "! inference_datastructures_problem.problem_p(problem) " + ("inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) ") + problem;
	final SubLObject potentially_processed_problems = inference_datastructures_problem_store.problem_store_potentially_processed_problems(store);
	set.set_remove(problem, potentially_processed_problems);
	return store;
    }

    public static final SubLObject problem_store_note_non_explanatory_subproofs_possible_alt(SubLObject store) {
	{
	    SubLObject lock = problem_store_lock(store);
	    SubLObject release = NIL;
	    try {
		release = seize_lock(lock);
		_csetf_prob_store_non_explanatory_subproofs_possibleP(store, T);
	    } finally {
		if (NIL != release) {
		    release_lock(lock);
		}
	    }
	}
	return store;
    }

    public static SubLObject problem_store_note_non_explanatory_subproofs_possible(final SubLObject store) {
	final SubLObject lock = inference_datastructures_problem_store.problem_store_lock(store);
	SubLObject release = NIL;
	try {
	    release = seize_lock(lock);
	    inference_datastructures_problem_store._csetf_prob_store_non_explanatory_subproofs_possibleP(store, T);
	} finally {
	    if (NIL != release) {
		release_lock(lock);
	    }
	}
	return store;
    }

    public static final SubLObject problem_store_note_non_explanatory_subproof_alt(SubLObject store, SubLObject proof, SubLObject non_explanatory_subproof) {
	{
	    SubLObject lock = problem_store_lock(store);
	    SubLObject release = NIL;
	    try {
		release = seize_lock(lock);
		dictionary_utilities.dictionary_pushnew(problem_store_non_explanatory_subproofs_index(store), proof, non_explanatory_subproof, UNPROVIDED, UNPROVIDED);
	    } finally {
		if (NIL != release) {
		    release_lock(lock);
		}
	    }
	}
	return store;
    }

    public static SubLObject problem_store_note_non_explanatory_subproof(final SubLObject store, final SubLObject proof, final SubLObject non_explanatory_subproof) {
	final SubLObject lock = inference_datastructures_problem_store.problem_store_lock(store);
	SubLObject release = NIL;
	try {
	    release = seize_lock(lock);
	    dictionary_utilities.dictionary_pushnew(inference_datastructures_problem_store.problem_store_non_explanatory_subproofs_index(store), proof, non_explanatory_subproof, UNPROVIDED, UNPROVIDED);
	} finally {
	    if (NIL != release) {
		release_lock(lock);
	    }
	}
	return store;
    }

    public static final SubLObject proof_note_non_explanatory_subproof_alt(SubLObject proof, SubLObject non_explanatory_subproof) {
	SubLTrampolineFile.checkType(proof, PROOF_P);
	SubLTrampolineFile.checkType(non_explanatory_subproof, PROOF_P);
	{
	    SubLObject store = inference_datastructures_proof.proof_store(proof);
	    problem_store_note_non_explanatory_subproof(store, proof, non_explanatory_subproof);
	    return proof;
	}
    }

    public static SubLObject proof_note_non_explanatory_subproof(final SubLObject proof, final SubLObject non_explanatory_subproof) {
	assert NIL != inference_datastructures_proof.proof_p(proof) : "! inference_datastructures_proof.proof_p(proof) " + ("inference_datastructures_proof.proof_p(proof) " + "CommonSymbols.NIL != inference_datastructures_proof.proof_p(proof) ") + proof;
	assert NIL != inference_datastructures_proof.proof_p(non_explanatory_subproof) : "! inference_datastructures_proof.proof_p(non_explanatory_subproof) "
		+ ("inference_datastructures_proof.proof_p(non_explanatory_subproof) " + "CommonSymbols.NIL != inference_datastructures_proof.proof_p(non_explanatory_subproof) ") + non_explanatory_subproof;
	final SubLObject store = inference_datastructures_proof.proof_store(proof);
	inference_datastructures_problem_store.problem_store_note_non_explanatory_subproof(store, proof, non_explanatory_subproof);
	return proof;
    }

    public static final SubLObject reset_problem_store_min_depth_index_alt(SubLObject store) {
	_csetf_prob_store_min_depth_index(store, make_hash_table(problem_store_problem_count(store), symbol_function(EQ), UNPROVIDED));
	return store;
    }

    public static SubLObject reset_problem_store_min_depth_index(final SubLObject store) {
	inference_datastructures_problem_store._csetf_prob_store_min_depth_index(store, make_hash_table(inference_datastructures_problem_store.problem_store_problem_count(store), symbol_function(EQ), UNPROVIDED));
	return store;
    }

    public static final SubLObject problem_store_min_proof_depth_index_remove_inference_alt(SubLObject store, SubLObject inference) {
	{
	    SubLObject index = problem_store_min_proof_depth_index(store);
	    dictionary.dictionary_remove(index, inference);
	}
	return store;
    }

    public static SubLObject problem_store_min_proof_depth_index_remove_inference(final SubLObject store, final SubLObject inference) {
	final SubLObject index = inference_datastructures_problem_store.problem_store_min_proof_depth_index(store);
	dictionary.dictionary_remove(index, inference);
	return store;
    }

    public static final SubLObject problem_store_min_transformation_depth_index_remove_inference_alt(SubLObject store, SubLObject inference) {
	{
	    SubLObject index = problem_store_min_transformation_depth_index(store);
	    dictionary.dictionary_remove(index, inference);
	}
	return store;
    }

    public static SubLObject problem_store_min_transformation_depth_index_remove_inference(final SubLObject store, final SubLObject inference) {
	final SubLObject index = inference_datastructures_problem_store.problem_store_min_transformation_depth_index(store);
	dictionary.dictionary_remove(index, inference);
	return store;
    }

    public static final SubLObject problem_store_min_transformation_depth_signature_index_remove_inference_alt(SubLObject store, SubLObject inference) {
	{
	    SubLObject index = problem_store_min_transformation_depth_signature_index(store);
	    dictionary.dictionary_remove(index, inference);
	}
	return store;
    }

    public static SubLObject problem_store_min_transformation_depth_signature_index_remove_inference(final SubLObject store, final SubLObject inference) {
	final SubLObject index = inference_datastructures_problem_store.problem_store_min_transformation_depth_signature_index(store);
	dictionary.dictionary_remove(index, inference);
	return store;
    }

    public static final SubLObject add_problem_store_historical_root_problem_alt(SubLObject store, SubLObject problem) {
	return set.set_add(problem, prob_store_historical_root_problems(store));
    }

    public static SubLObject add_problem_store_historical_root_problem(final SubLObject store, final SubLObject problem) {
	return set.set_add(problem, inference_datastructures_problem_store.prob_store_historical_root_problems(store));
    }

    /**
     * called by destroy-problem
     */
    @LispMethod(comment = "called by destroy-problem")
    public static final SubLObject remove_problem_store_historical_root_problem_alt(SubLObject store, SubLObject problem) {
	return set.set_remove(problem, prob_store_historical_root_problems(store));
    }

    /**
     * called by destroy-problem
     */
    @LispMethod(comment = "called by destroy-problem")
    public static SubLObject remove_problem_store_historical_root_problem(final SubLObject store, final SubLObject problem) {
	return set.set_remove(problem, inference_datastructures_problem_store.prob_store_historical_root_problems(store));
    }

    /**
     * Call this after STORE is done being constructed.
     * Sets all STORE's static properties to be no longer modifiable.
     */
    @LispMethod(comment = "Call this after STORE is done being constructed.\r\nSets all STORE\'s static properties to be no longer modifiable.\nCall this after STORE is done being constructed.\nSets all STORE\'s static properties to be no longer modifiable.")
    public static final SubLObject finalize_problem_store_properties_alt(SubLObject store) {
	if (NIL == problem_store_preparedP(store)) {
	    note_problem_store_prepared(store);
	}
	return store;
    }

    /**
     * Call this after STORE is done being constructed.
     * Sets all STORE's static properties to be no longer modifiable.
     */
    @LispMethod(comment = "Call this after STORE is done being constructed.\r\nSets all STORE\'s static properties to be no longer modifiable.\nCall this after STORE is done being constructed.\nSets all STORE\'s static properties to be no longer modifiable.")
    public static SubLObject finalize_problem_store_properties(final SubLObject store) {
	if (NIL == inference_datastructures_problem_store.problem_store_preparedP(store)) {
	    inference_datastructures_problem_store.note_problem_store_prepared(store);
	}
	return store;
    }

    public static final SubLObject add_problem_store_complex_problem_alt(SubLObject store, SubLObject problem) {
	{
	    SubLObject query = inference_datastructures_problem.problem_query(problem);
	    SubLObject signature = inference_datastructures_problem_query.problem_query_term_signature(query);
	    if (NIL == problem_store_problem_with_complex_problem_queryP(store, problem)) {
		dictionary.dictionary_enter(prob_store_complex_problem_query_signatures(store), problem, signature);
		dictionary_utilities.dictionary_push(prob_store_complex_problem_query_czer_index(store), signature, problem);
	    }
	}
	return store;
    }

    public static SubLObject add_problem_store_complex_problem(final SubLObject store, final SubLObject problem) {
	final SubLObject query = inference_datastructures_problem.problem_query(problem);
	final SubLObject signature = inference_datastructures_problem_query.problem_query_term_signature(query);
	if (NIL == inference_datastructures_problem_store.problem_store_problem_with_complex_problem_queryP(store, problem)) {
	    dictionary.dictionary_enter(inference_datastructures_problem_store.prob_store_complex_problem_query_signatures(store), problem, signature);
	    dictionary_utilities.dictionary_push(inference_datastructures_problem_store.prob_store_complex_problem_query_czer_index(store), signature, problem);
	}
	return store;
    }

    public static final SubLObject remove_problem_store_complex_problem_alt(SubLObject store, SubLObject problem) {
	if (NIL != problem_store_problem_with_complex_problem_queryP(store, problem)) {
	    {
		SubLObject signature = dictionary.dictionary_lookup_without_values(prob_store_complex_problem_query_signatures(store), problem, UNPROVIDED);
		dictionary.dictionary_remove(prob_store_complex_problem_query_signatures(store), problem);
		dictionary_utilities.dictionary_delete_first_from_value(prob_store_complex_problem_query_czer_index(store), signature, problem, symbol_function(EQ));
	    }
	}
	return store;
    }

    public static SubLObject remove_problem_store_complex_problem(final SubLObject store, final SubLObject problem) {
	if (NIL != inference_datastructures_problem_store.problem_store_problem_with_complex_problem_queryP(store, problem)) {
	    final SubLObject signature = dictionary.dictionary_lookup_without_values(inference_datastructures_problem_store.prob_store_complex_problem_query_signatures(store), problem, UNPROVIDED);
	    dictionary.dictionary_remove(inference_datastructures_problem_store.prob_store_complex_problem_query_signatures(store), problem);
	    dictionary_utilities.dictionary_delete_first_from_value(inference_datastructures_problem_store.prob_store_complex_problem_query_czer_index(store), signature, problem, symbol_function(EQ));
	}
	return store;
    }

    public static final SubLObject add_problem_store_problem_alt(SubLObject store, SubLObject problem) {
	add_problem_store_problem_by_id(store, problem);
	add_problem_store_problem_by_query(store, problem);
	return store;
    }

    public static SubLObject add_problem_store_problem(final SubLObject store, final SubLObject problem) {
	inference_datastructures_problem_store.add_problem_store_problem_by_id(store, problem);
	inference_datastructures_problem_store.add_problem_store_problem_by_query(store, problem);
	return store;
    }

    public static final SubLObject remove_problem_store_problem_alt(SubLObject store, SubLObject problem) {
	remove_problem_store_historical_root_problem(store, problem);
	remove_problem_wrt_reuse(store, problem);
	remove_problem_store_problem_by_id(store, problem);
	return store;
    }

    public static SubLObject remove_problem_store_problem(final SubLObject store, final SubLObject problem) {
	inference_datastructures_problem_store.remove_problem_store_historical_root_problem(store, problem);
	inference_datastructures_problem_store.remove_problem_wrt_reuse(store, problem);
	inference_datastructures_problem_store.remove_problem_store_problem_by_id(store, problem);
	return store;
    }

    /**
     * Make PROBLEM non-reusable in STORE.
     */
    @LispMethod(comment = "Make PROBLEM non-reusable in STORE.")
    public static final SubLObject remove_problem_wrt_reuse_alt(SubLObject store, SubLObject problem) {
	remove_problem_store_complex_problem(store, problem);
	remove_problem_store_problem_by_query(store, problem);
	return store;
    }

    /**
     * Make PROBLEM non-reusable in STORE.
     */
    @LispMethod(comment = "Make PROBLEM non-reusable in STORE.")
    public static SubLObject remove_problem_wrt_reuse(final SubLObject store, final SubLObject problem) {
	inference_datastructures_problem_store.remove_problem_store_complex_problem(store, problem);
	inference_datastructures_problem_store.remove_problem_store_problem_by_query(store, problem);
	return store;
    }

    public static final SubLObject problem_store_note_transformation_rule_considered_alt(SubLObject store, SubLObject rule) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject local_state = problem_store_memoization_state(store);
		{
		    SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
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
					    Errors.error($str_alt299$Invalid_attempt_to_reuse_memoizat);
					}
				    }
				}
			    }
			    try {
				ensure_transformation_rule_considered_noted(rule);
			    } finally {
				{
				    SubLObject _prev_bind_0_12 = $is_thread_performing_cleanupP$.currentBinding(thread);
				    try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					if ((NIL != local_state) && (NIL == original_memoization_process)) {
					    memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
					}
				    } finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0_12, thread);
				    }
				}
			    }
			}
		    } finally {
			memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
		    }
		}
	    }
	    return T;
	}
    }

    public static SubLObject problem_store_note_transformation_rule_considered(final SubLObject store, final SubLObject rule) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject local_state = inference_datastructures_problem_store.problem_store_memoization_state(store);
	final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
	try {
	    memoization_state.$memoization_state$.bind(local_state, thread);
	    final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
	    try {
		inference_datastructures_problem_store.ensure_transformation_rule_considered_noted(rule);
	    } finally {
		final SubLObject _prev_bind_0_$209 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$209, thread);
		}
	    }
	} finally {
	    memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
	}
	return T;
    }

    public static final SubLObject problem_store_note_transformation_rule_success_alt(SubLObject store, SubLObject rule) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject local_state = problem_store_memoization_state(store);
		{
		    SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
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
					    Errors.error($str_alt299$Invalid_attempt_to_reuse_memoizat);
					}
				    }
				}
			    }
			    try {
				ensure_transformation_rule_success_noted(rule);
			    } finally {
				{
				    SubLObject _prev_bind_0_13 = $is_thread_performing_cleanupP$.currentBinding(thread);
				    try {
					$is_thread_performing_cleanupP$.bind(T, thread);
					if ((NIL != local_state) && (NIL == original_memoization_process)) {
					    memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
					}
				    } finally {
					$is_thread_performing_cleanupP$.rebind(_prev_bind_0_13, thread);
				    }
				}
			    }
			}
		    } finally {
			memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
		    }
		}
	    }
	    return NIL;
	}
    }

    public static SubLObject problem_store_note_transformation_rule_success(final SubLObject store, final SubLObject rule) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject local_state = inference_datastructures_problem_store.problem_store_memoization_state(store);
	final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
	try {
	    memoization_state.$memoization_state$.bind(local_state, thread);
	    final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
	    try {
		inference_datastructures_problem_store.ensure_transformation_rule_success_noted(rule);
	    } finally {
		final SubLObject _prev_bind_0_$210 = $is_thread_performing_cleanupP$.currentBinding(thread);
		try {
		    $is_thread_performing_cleanupP$.bind(T, thread);
		    final SubLObject _values = getValuesAsVector();
		    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
		    restoreValuesFromVector(_values);
		} finally {
		    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$210, thread);
		}
	    }
	} finally {
	    memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
	}
	return NIL;
    }

    public static final SubLObject ensure_transformation_rule_considered_noted_internal_alt(SubLObject rule) {
	if (NIL != assertions_high.rule_assertionP(rule)) {
	    inference_analysis.increment_transformation_rule_considered_count(rule, T, UNPROVIDED);
	    return T;
	}
	return NIL;
    }

    public static SubLObject ensure_transformation_rule_considered_noted_internal(final SubLObject rule) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	if (NIL != assertions_high.rule_assertionP(rule)) {
	    if (NIL == $kbq_run_query_practice_modeP$.getDynamicValue(thread)) {
		inference_analysis.increment_transformation_rule_considered_count(rule, T, UNPROVIDED, UNPROVIDED);
	    }
	    return T;
	}
	return NIL;
    }

    public static final SubLObject ensure_transformation_rule_considered_noted_alt(SubLObject rule) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
		    return ensure_transformation_rule_considered_noted_internal(rule);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, ENSURE_TRANSFORMATION_RULE_CONSIDERED_NOTED, UNPROVIDED);
		if (NIL == caching_state) {
		    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), ENSURE_TRANSFORMATION_RULE_CONSIDERED_NOTED, ONE_INTEGER, NIL, EQ, UNPROVIDED);
		    memoization_state.memoization_state_put(v_memoization_state, ENSURE_TRANSFORMATION_RULE_CONSIDERED_NOTED, caching_state);
		}
		{
		    SubLObject results = memoization_state.caching_state_lookup(caching_state, rule, $kw301$_MEMOIZED_ITEM_NOT_FOUND_);
		    if (results == $kw301$_MEMOIZED_ITEM_NOT_FOUND_) {
			results = arg2(thread.resetMultipleValues(), multiple_value_list(ensure_transformation_rule_considered_noted_internal(rule)));
			memoization_state.caching_state_put(caching_state, rule, results, UNPROVIDED);
		    }
		    return memoization_state.caching_results(results);
		}
	    }
	}
    }

    public static SubLObject ensure_transformation_rule_considered_noted(final SubLObject rule) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
	SubLObject caching_state = NIL;
	if (NIL == v_memoization_state) {
	    return inference_datastructures_problem_store.ensure_transformation_rule_considered_noted_internal(rule);
	}
	caching_state = memoization_state.memoization_state_lookup(v_memoization_state, inference_datastructures_problem_store.ENSURE_TRANSFORMATION_RULE_CONSIDERED_NOTED, UNPROVIDED);
	if (NIL == caching_state) {
	    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), inference_datastructures_problem_store.ENSURE_TRANSFORMATION_RULE_CONSIDERED_NOTED, ONE_INTEGER, NIL, EQ, UNPROVIDED);
	    memoization_state.memoization_state_put(v_memoization_state, inference_datastructures_problem_store.ENSURE_TRANSFORMATION_RULE_CONSIDERED_NOTED, caching_state);
	}
	SubLObject results = memoization_state.caching_state_lookup(caching_state, rule, memoization_state.$memoized_item_not_found$.getGlobalValue());
	if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
	    results = arg2(thread.resetMultipleValues(), multiple_value_list(inference_datastructures_problem_store.ensure_transformation_rule_considered_noted_internal(rule)));
	    memoization_state.caching_state_put(caching_state, rule, results, UNPROVIDED);
	}
	return memoization_state.caching_results(results);
    }

    public static final SubLObject ensure_transformation_rule_success_noted_internal_alt(SubLObject rule) {
	if (NIL != assertions_high.rule_assertionP(rule)) {
	    inference_analysis.increment_transformation_rule_success_count(rule, T, UNPROVIDED);
	    return T;
	}
	return NIL;
    }

    public static SubLObject ensure_transformation_rule_success_noted_internal(final SubLObject rule) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	if (NIL != assertions_high.rule_assertionP(rule)) {
	    if (NIL != $kbq_run_query_practice_modeP$.getDynamicValue(thread)) {
		inference_analysis.increment_transformation_rule_considered_count(rule, T, $int$100, UNPROVIDED);
		inference_analysis.increment_transformation_rule_success_count(rule, T, $int$100, UNPROVIDED);
	    } else if (NIL != subl_promotions.positive_integer_p($problem_store_multiple_subqueries_count$.getDynamicValue(thread))) {
		inference_analysis.increment_transformation_rule_considered_count(rule, T, subtract($problem_store_multiple_subqueries_count$.getDynamicValue(thread), ONE_INTEGER), UNPROVIDED);
		inference_analysis.increment_transformation_rule_success_count(rule, T, $problem_store_multiple_subqueries_count$.getDynamicValue(thread), UNPROVIDED);
	    } else {
		inference_analysis.increment_transformation_rule_success_count(rule, T, UNPROVIDED, UNPROVIDED);
	    }

	    return T;
	}
	return NIL;
    }

    public static final SubLObject ensure_transformation_rule_success_noted_alt(SubLObject rule) {
	{
	    final SubLThread thread = SubLProcess.currentSubLThread();
	    {
		SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
		SubLObject caching_state = NIL;
		if (NIL == v_memoization_state) {
		    return ensure_transformation_rule_success_noted_internal(rule);
		}
		caching_state = memoization_state.memoization_state_lookup(v_memoization_state, ENSURE_TRANSFORMATION_RULE_SUCCESS_NOTED, UNPROVIDED);
		if (NIL == caching_state) {
		    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), ENSURE_TRANSFORMATION_RULE_SUCCESS_NOTED, ONE_INTEGER, NIL, EQ, UNPROVIDED);
		    memoization_state.memoization_state_put(v_memoization_state, ENSURE_TRANSFORMATION_RULE_SUCCESS_NOTED, caching_state);
		}
		{
		    SubLObject results = memoization_state.caching_state_lookup(caching_state, rule, $kw301$_MEMOIZED_ITEM_NOT_FOUND_);
		    if (results == $kw301$_MEMOIZED_ITEM_NOT_FOUND_) {
			results = arg2(thread.resetMultipleValues(), multiple_value_list(ensure_transformation_rule_success_noted_internal(rule)));
			memoization_state.caching_state_put(caching_state, rule, results, UNPROVIDED);
		    }
		    return memoization_state.caching_results(results);
		}
	    }
	}
    }

    public static SubLObject ensure_transformation_rule_success_noted(final SubLObject rule) {
	final SubLThread thread = SubLProcess.currentSubLThread();
	final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
	SubLObject caching_state = NIL;
	if (NIL == v_memoization_state) {
	    return inference_datastructures_problem_store.ensure_transformation_rule_success_noted_internal(rule);
	}
	caching_state = memoization_state.memoization_state_lookup(v_memoization_state, inference_datastructures_problem_store.ENSURE_TRANSFORMATION_RULE_SUCCESS_NOTED, UNPROVIDED);
	if (NIL == caching_state) {
	    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), inference_datastructures_problem_store.ENSURE_TRANSFORMATION_RULE_SUCCESS_NOTED, ONE_INTEGER, NIL, EQ, UNPROVIDED);
	    memoization_state.memoization_state_put(v_memoization_state, inference_datastructures_problem_store.ENSURE_TRANSFORMATION_RULE_SUCCESS_NOTED, caching_state);
	}
	SubLObject results = memoization_state.caching_state_lookup(caching_state, rule, memoization_state.$memoized_item_not_found$.getGlobalValue());
	if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
	    results = arg2(thread.resetMultipleValues(), multiple_value_list(inference_datastructures_problem_store.ensure_transformation_rule_success_noted_internal(rule)));
	    memoization_state.caching_state_put(caching_state, rule, results, UNPROVIDED);
	}
	return memoization_state.caching_results(results);
    }

    public static final SubLObject problem_store_janitor_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
	compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
	return NIL;
    }

    public static SubLObject problem_store_janitor_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
	compatibility.default_struct_print_function(v_object, stream, ZERO_INTEGER);
	return NIL;
    }

    public static final SubLObject problem_store_janitor_p_alt(SubLObject v_object) {
	return v_object.getClass() == $problem_store_janitor_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject problem_store_janitor_p(final SubLObject v_object) {
	return v_object.getClass() == $problem_store_janitor_native.class ? T : NIL;
    }

    public static final SubLObject prob_store_janitor_store_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_JANITOR_P);
	return v_object.getField2();
    }

    public static SubLObject prob_store_janitor_store(final SubLObject v_object) {
	assert NIL != inference_datastructures_problem_store.problem_store_janitor_p(v_object) : "! inference_datastructures_problem_store.problem_store_janitor_p(v_object) " + "inference_datastructures_problem_store.problem_store_janitor_p error :" + v_object;
	return v_object.getField2();
    }

    public static final SubLObject prob_store_janitor_indestructible_problems_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_JANITOR_P);
	return v_object.getField3();
    }

    public static SubLObject prob_store_janitor_indestructible_problems(final SubLObject v_object) {
	assert NIL != inference_datastructures_problem_store.problem_store_janitor_p(v_object) : "! inference_datastructures_problem_store.problem_store_janitor_p(v_object) " + "inference_datastructures_problem_store.problem_store_janitor_p error :" + v_object;
	return v_object.getField3();
    }

    public static final SubLObject prob_store_janitor_staleP_alt(SubLObject v_object) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_JANITOR_P);
	return v_object.getField4();
    }

    public static SubLObject prob_store_janitor_staleP(final SubLObject v_object) {
	assert NIL != inference_datastructures_problem_store.problem_store_janitor_p(v_object) : "! inference_datastructures_problem_store.problem_store_janitor_p(v_object) " + "inference_datastructures_problem_store.problem_store_janitor_p error :" + v_object;
	return v_object.getField4();
    }

    public static final SubLObject _csetf_prob_store_janitor_store_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_JANITOR_P);
	return v_object.setField2(value);
    }

    public static SubLObject _csetf_prob_store_janitor_store(final SubLObject v_object, final SubLObject value) {
	assert NIL != inference_datastructures_problem_store.problem_store_janitor_p(v_object) : "! inference_datastructures_problem_store.problem_store_janitor_p(v_object) " + "inference_datastructures_problem_store.problem_store_janitor_p error :" + v_object;
	return v_object.setField2(value);
    }

    public static final SubLObject _csetf_prob_store_janitor_indestructible_problems_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_JANITOR_P);
	return v_object.setField3(value);
    }

    public static SubLObject _csetf_prob_store_janitor_indestructible_problems(final SubLObject v_object, final SubLObject value) {
	assert NIL != inference_datastructures_problem_store.problem_store_janitor_p(v_object) : "! inference_datastructures_problem_store.problem_store_janitor_p(v_object) " + "inference_datastructures_problem_store.problem_store_janitor_p error :" + v_object;
	return v_object.setField3(value);
    }

    public static final SubLObject _csetf_prob_store_janitor_staleP_alt(SubLObject v_object, SubLObject value) {
	SubLTrampolineFile.checkType(v_object, PROBLEM_STORE_JANITOR_P);
	return v_object.setField4(value);
    }

    public static SubLObject _csetf_prob_store_janitor_staleP(final SubLObject v_object, final SubLObject value) {
	assert NIL != inference_datastructures_problem_store.problem_store_janitor_p(v_object) : "! inference_datastructures_problem_store.problem_store_janitor_p(v_object) " + "inference_datastructures_problem_store.problem_store_janitor_p error :" + v_object;
	return v_object.setField4(value);
    }

    public static final SubLObject make_problem_store_janitor_alt(SubLObject arglist) {
	if (arglist == UNPROVIDED) {
	    arglist = NIL;
	}
	{
	    SubLObject v_new = new $problem_store_janitor_native();
	    SubLObject next = NIL;
	    for (next = arglist; NIL != next; next = cddr(next)) {
		{
		    SubLObject current_arg = next.first();
		    SubLObject current_value = cadr(next);
		    SubLObject pcase_var = current_arg;
		    if (pcase_var.eql($STORE)) {
			_csetf_prob_store_janitor_store(v_new, current_value);
		    } else {
			if (pcase_var.eql($INDESTRUCTIBLE_PROBLEMS)) {
			    _csetf_prob_store_janitor_indestructible_problems(v_new, current_value);
			} else {
			    if (pcase_var.eql($STALE_)) {
				_csetf_prob_store_janitor_staleP(v_new, current_value);
			    } else {
				Errors.error($str_alt190$Invalid_slot__S_for_construction_, current_arg);
			    }
			}
		    }
		}
	    }
	    return v_new;
	}
    }

    public static SubLObject make_problem_store_janitor(SubLObject arglist) {
	if (arglist == UNPROVIDED) {
	    arglist = NIL;
	}
	final SubLObject v_new = new $problem_store_janitor_native();
	SubLObject next;
	SubLObject current_arg;
	SubLObject current_value;
	SubLObject pcase_var;
	for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
	    current_arg = next.first();
	    current_value = cadr(next);
	    pcase_var = current_arg;
	    if (pcase_var.eql($STORE)) {
		inference_datastructures_problem_store._csetf_prob_store_janitor_store(v_new, current_value);
	    } else if (pcase_var.eql($INDESTRUCTIBLE_PROBLEMS)) {
		inference_datastructures_problem_store._csetf_prob_store_janitor_indestructible_problems(v_new, current_value);
	    } else if (pcase_var.eql($STALE_)) {
		inference_datastructures_problem_store._csetf_prob_store_janitor_staleP(v_new, current_value);
	    } else {
		Errors.error($str204$Invalid_slot__S_for_construction_, current_arg);
	    }

	}
	return v_new;
    }

    public static SubLObject visit_defstruct_problem_store_janitor(final SubLObject obj, final SubLObject visitor_fn) {
	funcall(visitor_fn, obj, $BEGIN, inference_datastructures_problem_store.MAKE_PROBLEM_STORE_JANITOR, THREE_INTEGER);
	funcall(visitor_fn, obj, $SLOT, $STORE, inference_datastructures_problem_store.prob_store_janitor_store(obj));
	funcall(visitor_fn, obj, $SLOT, $INDESTRUCTIBLE_PROBLEMS, inference_datastructures_problem_store.prob_store_janitor_indestructible_problems(obj));
	funcall(visitor_fn, obj, $SLOT, $STALE_, inference_datastructures_problem_store.prob_store_janitor_staleP(obj));
	funcall(visitor_fn, obj, $END, inference_datastructures_problem_store.MAKE_PROBLEM_STORE_JANITOR, THREE_INTEGER);
	return obj;
    }

    public static SubLObject visit_defstruct_object_problem_store_janitor_method(final SubLObject obj, final SubLObject visitor_fn) {
	return inference_datastructures_problem_store.visit_defstruct_problem_store_janitor(obj, visitor_fn);
    }

    public static final SubLObject new_problem_store_janitor_alt(SubLObject store) {
	SubLTrampolineFile.checkType(store, PROBLEM_STORE_P);
	{
	    SubLObject janitor = make_problem_store_janitor(UNPROVIDED);
	    _csetf_prob_store_janitor_store(janitor, store);
	    _csetf_prob_store_janitor_indestructible_problems(janitor, set.new_set(symbol_function(EQ), UNPROVIDED));
	    problem_store_janitor_note_stale(janitor);
	    return janitor;
	}
    }

    public static SubLObject new_problem_store_janitor(final SubLObject store) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(store) : "! inference_datastructures_problem_store.problem_store_p(store) "
		+ ("inference_datastructures_problem_store.problem_store_p(store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(store) ") + store;
	final SubLObject janitor = inference_datastructures_problem_store.make_problem_store_janitor(UNPROVIDED);
	inference_datastructures_problem_store._csetf_prob_store_janitor_store(janitor, store);
	inference_datastructures_problem_store._csetf_prob_store_janitor_indestructible_problems(janitor, set.new_set(symbol_function(EQ), UNPROVIDED));
	inference_datastructures_problem_store.problem_store_janitor_note_stale(janitor);
	return janitor;
    }

    public static final SubLObject destroy_problem_store_janitor_alt(SubLObject janitor) {
	set.clear_set(prob_store_janitor_indestructible_problems(janitor));
	_csetf_prob_store_janitor_indestructible_problems(janitor, $FREE);
	_csetf_prob_store_janitor_store(janitor, $FREE);
	problem_store_janitor_note_stale(janitor);
	return NIL;
    }

    public static SubLObject destroy_problem_store_janitor(final SubLObject janitor) {
	set.clear_set(inference_datastructures_problem_store.prob_store_janitor_indestructible_problems(janitor));
	inference_datastructures_problem_store._csetf_prob_store_janitor_indestructible_problems(janitor, $FREE);
	inference_datastructures_problem_store._csetf_prob_store_janitor_store(janitor, $FREE);
	inference_datastructures_problem_store.problem_store_janitor_note_stale(janitor);
	return NIL;
    }

    public static final SubLObject problem_store_janitor_store_alt(SubLObject janitor) {
	return prob_store_janitor_store(janitor);
    }

    public static SubLObject problem_store_janitor_store(final SubLObject janitor) {
	return inference_datastructures_problem_store.prob_store_janitor_store(janitor);
    }

    public static final SubLObject problem_store_janitor_staleP_alt(SubLObject janitor) {
	return prob_store_janitor_staleP(janitor);
    }

    public static SubLObject problem_store_janitor_staleP(final SubLObject janitor) {
	return inference_datastructures_problem_store.prob_store_janitor_staleP(janitor);
    }

    public static final SubLObject problem_store_janitor_indestructible_problems_alt(SubLObject janitor) {
	if (NIL != problem_store_janitor_staleP(janitor)) {
	    return set.new_set(symbol_function(EQ), UNPROVIDED);
	} else {
	    return prob_store_janitor_indestructible_problems(janitor);
	}
    }

    public static SubLObject problem_store_janitor_indestructible_problems(final SubLObject janitor) {
	if (NIL != inference_datastructures_problem_store.problem_store_janitor_staleP(janitor)) {
	    return set.new_set(symbol_function(EQ), UNPROVIDED);
	}
	return inference_datastructures_problem_store.prob_store_janitor_indestructible_problems(janitor);
    }

    public static final SubLObject do_problem_store_janitor_indestructible_problems_alt(SubLObject macroform, SubLObject environment) {
	{
	    SubLObject datum = macroform.rest();
	    SubLObject current = datum;
	    destructuring_bind_must_consp(current, datum, $list_alt322);
	    {
		SubLObject temp = current.rest();
		current = current.first();
		{
		    SubLObject problem_var = NIL;
		    SubLObject janitor = NIL;
		    destructuring_bind_must_consp(current, datum, $list_alt322);
		    problem_var = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt322);
		    janitor = current.first();
		    current = current.rest();
		    {
			SubLObject allow_other_keys_p = NIL;
			SubLObject rest = current;
			SubLObject bad = NIL;
			SubLObject current_14 = NIL;
			for (; NIL != rest;) {
			    destructuring_bind_must_consp(rest, datum, $list_alt322);
			    current_14 = rest.first();
			    rest = rest.rest();
			    destructuring_bind_must_consp(rest, datum, $list_alt322);
			    if (NIL == member(current_14, $list_alt2, UNPROVIDED, UNPROVIDED)) {
				bad = T;
			    }
			    if (current_14 == $ALLOW_OTHER_KEYS) {
				allow_other_keys_p = rest.first();
			    }
			    rest = rest.rest();
			}
			if ((NIL != bad) && (NIL == allow_other_keys_p)) {
			    cdestructuring_bind_error(datum, $list_alt322);
			}
			{
			    SubLObject done_tail = property_list_member($DONE, current);
			    SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
			    current = temp;
			    {
				SubLObject body = current;
				return listS(DO_SET, list(problem_var, list(PROBLEM_STORE_JANITOR_INDESTRUCTIBLE_PROBLEMS, janitor), $DONE, done), append(body, NIL));
			    }
			}
		    }
		}
	    }
	}
    }

    public static SubLObject do_problem_store_janitor_indestructible_problems(final SubLObject macroform, final SubLObject environment) {
	SubLObject current;
	final SubLObject datum = current = macroform.rest();
	destructuring_bind_must_consp(current, datum, $list347);
	final SubLObject temp = current.rest();
	current = current.first();
	SubLObject problem_var = NIL;
	SubLObject janitor = NIL;
	destructuring_bind_must_consp(current, datum, $list347);
	problem_var = current.first();
	current = current.rest();
	destructuring_bind_must_consp(current, datum, $list347);
	janitor = current.first();
	current = current.rest();
	SubLObject allow_other_keys_p = NIL;
	SubLObject rest = current;
	SubLObject bad = NIL;
	SubLObject current_$211 = NIL;
	while (NIL != rest) {
	    destructuring_bind_must_consp(rest, datum, $list347);
	    current_$211 = rest.first();
	    rest = rest.rest();
	    destructuring_bind_must_consp(rest, datum, $list347);
	    if (NIL == member(current_$211, $list2, UNPROVIDED, UNPROVIDED)) {
		bad = T;
	    }
	    if (current_$211 == $ALLOW_OTHER_KEYS) {
		allow_other_keys_p = rest.first();
	    }
	    rest = rest.rest();
	}
	if ((NIL != bad) && (NIL == allow_other_keys_p)) {
	    cdestructuring_bind_error(datum, $list347);
	}
	final SubLObject done_tail = property_list_member($DONE, current);
	final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
	final SubLObject body;
	current = body = temp;
	return listS(DO_SET, list(problem_var, list(inference_datastructures_problem_store.PROBLEM_STORE_JANITOR_INDESTRUCTIBLE_PROBLEMS, janitor), $DONE, done), append(body, NIL));
    }

    public static final SubLObject do_problem_store_janitor_destructible_problems_alt(SubLObject macroform, SubLObject environment) {
	{
	    SubLObject datum = macroform.rest();
	    SubLObject current = datum;
	    destructuring_bind_must_consp(current, datum, $list_alt322);
	    {
		SubLObject temp = current.rest();
		current = current.first();
		{
		    SubLObject problem_var = NIL;
		    SubLObject janitor = NIL;
		    destructuring_bind_must_consp(current, datum, $list_alt322);
		    problem_var = current.first();
		    current = current.rest();
		    destructuring_bind_must_consp(current, datum, $list_alt322);
		    janitor = current.first();
		    current = current.rest();
		    {
			SubLObject allow_other_keys_p = NIL;
			SubLObject rest = current;
			SubLObject bad = NIL;
			SubLObject current_15 = NIL;
			for (; NIL != rest;) {
			    destructuring_bind_must_consp(rest, datum, $list_alt322);
			    current_15 = rest.first();
			    rest = rest.rest();
			    destructuring_bind_must_consp(rest, datum, $list_alt322);
			    if (NIL == member(current_15, $list_alt2, UNPROVIDED, UNPROVIDED)) {
				bad = T;
			    }
			    if (current_15 == $ALLOW_OTHER_KEYS) {
				allow_other_keys_p = rest.first();
			    }
			    rest = rest.rest();
			}
			if ((NIL != bad) && (NIL == allow_other_keys_p)) {
			    cdestructuring_bind_error(datum, $list_alt322);
			}
			{
			    SubLObject done_tail = property_list_member($DONE, current);
			    SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
			    current = temp;
			    {
				SubLObject body = current;
				return list(DO_PROBLEM_STORE_PROBLEMS, list(problem_var, list(PROBLEM_STORE_JANITOR_STORE, janitor), $DONE, done), listS(PWHEN, list($sym324$PROBLEM_DESTRUCTIBLE_, problem_var), append(body, NIL)));
			    }
			}
		    }
		}
	    }
	}
    }

    public static SubLObject do_problem_store_janitor_destructible_problems(final SubLObject macroform, final SubLObject environment) {
	SubLObject current;
	final SubLObject datum = current = macroform.rest();
	destructuring_bind_must_consp(current, datum, $list347);
	final SubLObject temp = current.rest();
	current = current.first();
	SubLObject problem_var = NIL;
	SubLObject janitor = NIL;
	destructuring_bind_must_consp(current, datum, $list347);
	problem_var = current.first();
	current = current.rest();
	destructuring_bind_must_consp(current, datum, $list347);
	janitor = current.first();
	current = current.rest();
	SubLObject allow_other_keys_p = NIL;
	SubLObject rest = current;
	SubLObject bad = NIL;
	SubLObject current_$212 = NIL;
	while (NIL != rest) {
	    destructuring_bind_must_consp(rest, datum, $list347);
	    current_$212 = rest.first();
	    rest = rest.rest();
	    destructuring_bind_must_consp(rest, datum, $list347);
	    if (NIL == member(current_$212, $list2, UNPROVIDED, UNPROVIDED)) {
		bad = T;
	    }
	    if (current_$212 == $ALLOW_OTHER_KEYS) {
		allow_other_keys_p = rest.first();
	    }
	    rest = rest.rest();
	}
	if ((NIL != bad) && (NIL == allow_other_keys_p)) {
	    cdestructuring_bind_error(datum, $list347);
	}
	final SubLObject done_tail = property_list_member($DONE, current);
	final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
	final SubLObject body;
	current = body = temp;
	return list(inference_datastructures_problem_store.DO_PROBLEM_STORE_PROBLEMS, list(problem_var, list(inference_datastructures_problem_store.PROBLEM_STORE_JANITOR_STORE, janitor), $DONE, done), listS(PWHEN, list($sym349$PROBLEM_DESTRUCTIBLE_, problem_var), append(body, NIL)));
    }

    public static final SubLObject problem_store_janitor_indestructible_problem_count_alt(SubLObject janitor) {
	return set.set_size(problem_store_janitor_indestructible_problems(janitor));
    }

    public static SubLObject problem_store_janitor_indestructible_problem_count(final SubLObject janitor) {
	return set.set_size(inference_datastructures_problem_store.problem_store_janitor_indestructible_problems(janitor));
    }

    public static final SubLObject problem_store_janitor_destructible_problem_count_alt(SubLObject janitor) {
	return subtract(problem_store_problem_count(problem_store_janitor_store(janitor)), problem_store_janitor_indestructible_problem_count(janitor));
    }

    public static SubLObject problem_store_janitor_destructible_problem_count(final SubLObject janitor) {
	return subtract(inference_datastructures_problem_store.problem_store_problem_count(inference_datastructures_problem_store.problem_store_janitor_store(janitor)), inference_datastructures_problem_store.problem_store_janitor_indestructible_problem_count(janitor));
    }

    public static final SubLObject problem_store_janitor_note_stale_alt(SubLObject janitor) {
	_csetf_prob_store_janitor_staleP(janitor, T);
	return janitor;
    }

    public static SubLObject problem_store_janitor_note_stale(final SubLObject janitor) {
	inference_datastructures_problem_store._csetf_prob_store_janitor_staleP(janitor, T);
	return janitor;
    }

    public static final SubLObject problem_store_janitor_note_unstale_alt(SubLObject janitor) {
	_csetf_prob_store_janitor_staleP(janitor, NIL);
	return janitor;
    }

    public static SubLObject problem_store_janitor_note_unstale(final SubLObject janitor) {
	inference_datastructures_problem_store._csetf_prob_store_janitor_staleP(janitor, NIL);
	return janitor;
    }

    public static final SubLObject problem_store_janitor_note_problem_indestructible_alt(SubLObject janitor, SubLObject problem) {
	SubLTrampolineFile.checkType(janitor, PROBLEM_STORE_JANITOR_P);
	SubLTrampolineFile.checkType(problem, PROBLEM_P);
	{
	    SubLObject indestructible_problems = problem_store_janitor_indestructible_problems(janitor);
	    set.set_add(problem, indestructible_problems);
	}
	return janitor;
    }

    public static SubLObject problem_store_janitor_note_problem_indestructible(final SubLObject janitor, final SubLObject problem) {
	assert NIL != inference_datastructures_problem_store.problem_store_janitor_p(janitor) : "! inference_datastructures_problem_store.problem_store_janitor_p(janitor) "
		+ ("inference_datastructures_problem_store.problem_store_janitor_p(janitor) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_janitor_p(janitor) ") + janitor;
	assert NIL != inference_datastructures_problem.problem_p(problem) : "! inference_datastructures_problem.problem_p(problem) " + ("inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) ") + problem;
	final SubLObject indestructible_problems = inference_datastructures_problem_store.problem_store_janitor_indestructible_problems(janitor);
	set.set_add(problem, indestructible_problems);
	return janitor;
    }

    public static final SubLObject problem_store_janitor_note_problem_destructible_alt(SubLObject janitor, SubLObject problem) {
	SubLTrampolineFile.checkType(janitor, PROBLEM_STORE_JANITOR_P);
	SubLTrampolineFile.checkType(problem, PROBLEM_P);
	{
	    SubLObject indestructible_problems = problem_store_janitor_indestructible_problems(janitor);
	    set.set_remove(problem, indestructible_problems);
	}
	return janitor;
    }

    public static SubLObject problem_store_janitor_note_problem_destructible(final SubLObject janitor, final SubLObject problem) {
	assert NIL != inference_datastructures_problem_store.problem_store_janitor_p(janitor) : "! inference_datastructures_problem_store.problem_store_janitor_p(janitor) "
		+ ("inference_datastructures_problem_store.problem_store_janitor_p(janitor) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_janitor_p(janitor) ") + janitor;
	assert NIL != inference_datastructures_problem.problem_p(problem) : "! inference_datastructures_problem.problem_p(problem) " + ("inference_datastructures_problem.problem_p(problem) " + "CommonSymbols.NIL != inference_datastructures_problem.problem_p(problem) ") + problem;
	final SubLObject indestructible_problems = inference_datastructures_problem_store.problem_store_janitor_indestructible_problems(janitor);
	set.set_remove(problem, indestructible_problems);
	return janitor;
    }

    /**
     * Returns an object which is the unique name of PROBLEM-STORE.
     * This object can be of any type, but names are assumed unique wrt the #'equal test.
     */
    @LispMethod(comment = "Returns an object which is the unique name of PROBLEM-STORE.\r\nThis object can be of any type, but names are assumed unique wrt the #\'equal test.\nReturns an object which is the unique name of PROBLEM-STORE.\nThis object can be of any type, but names are assumed unique wrt the #\'equal test.")
    public static final SubLObject problem_store_name_alt(SubLObject problem_store) {
	SubLTrampolineFile.checkType(problem_store, PROBLEM_STORE_P);
	{
	    SubLObject id = problem_store_suid(problem_store);
	    return gethash_without_values(id, $problem_store_id_to_name_table$.getGlobalValue(), UNPROVIDED);
	}
    }

    /**
     * Returns an object which is the unique name of PROBLEM-STORE.
     * This object can be of any type, but names are assumed unique wrt the #'equal test.
     */
    @LispMethod(comment = "Returns an object which is the unique name of PROBLEM-STORE.\r\nThis object can be of any type, but names are assumed unique wrt the #\'equal test.\nReturns an object which is the unique name of PROBLEM-STORE.\nThis object can be of any type, but names are assumed unique wrt the #\'equal test.")
    public static SubLObject problem_store_name(final SubLObject problem_store) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(problem_store) : "! inference_datastructures_problem_store.problem_store_p(problem_store) "
		+ ("inference_datastructures_problem_store.problem_store_p(problem_store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(problem_store) ") + problem_store;
	final SubLObject id = inference_datastructures_problem_store.problem_store_suid(problem_store);
	return gethash_without_values(id, $problem_store_id_to_name_table$.getGlobalValue(), UNPROVIDED);
    }

    /**
     *
     *
     * @return nil or problem-store-p
     */
    @LispMethod(comment = "@return nil or problem-store-p")
    public static final SubLObject find_problem_store_by_name_alt(SubLObject name) {
	SubLTrampolineFile.checkType(name, PROBLEM_STORE_NAME_P);
	if (NIL != name) {
	    {
		SubLObject id = gethash_without_values(name, $problem_store_name_to_id_table$.getGlobalValue(), UNPROVIDED);
		if (NIL != id) {
		    return find_problem_store_by_id(id);
		}
	    }
	}
	return NIL;
    }

    /**
     *
     *
     * @return nil or problem-store-p
     */
    @LispMethod(comment = "@return nil or problem-store-p")
    public static SubLObject find_problem_store_by_name(final SubLObject name) {
	assert NIL != inference_datastructures_enumerated_types.problem_store_name_p(name) : "! inference_datastructures_enumerated_types.problem_store_name_p(name) "
		+ ("inference_datastructures_enumerated_types.problem_store_name_p(name) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.problem_store_name_p(name) ") + name;
	if (NIL != name) {
	    final SubLObject id = gethash_without_values(name, $problem_store_name_to_id_table$.getGlobalValue(), UNPROVIDED);
	    if (NIL != id) {
		return inference_datastructures_problem_store.find_problem_store_by_id(id);
	    }
	}
	return NIL;
    }

    /**
     *
     *
     * @param PROBLEM-STORE-PROPERTIES;
     * 		properties to be used if a new problem store is created.
     * @unknown If a :problem-store-name is specified in PROBLEM-STORE-PROPERTIES, it will be
    overridden by NAME.
     */
    @LispMethod(comment = "@param PROBLEM-STORE-PROPERTIES;\r\n\t\tproperties to be used if a new problem store is created.\r\n@unknown If a :problem-store-name is specified in PROBLEM-STORE-PROPERTIES, it will be\r\noverridden by NAME.")
    public static final SubLObject find_or_create_problem_store_by_name_alt(SubLObject name, SubLObject problem_store_properties) {
	if (problem_store_properties == UNPROVIDED) {
	    problem_store_properties = NIL;
	}
	SubLTrampolineFile.checkType(name, PROBLEM_STORE_NAME_P);
	SubLTrampolineFile.checkType(problem_store_properties, PROBLEM_STORE_PROPERTIES_P);
	{
	    SubLObject store = find_problem_store_by_name(name);
	    if (NIL == store) {
		{
		    SubLObject new_properties = putf(copy_list(problem_store_properties), $PROBLEM_STORE_NAME, name);
		    store = new_problem_store(new_properties);
		}
	    }
	    return store;
	}
    }

    /**
     *
     *
     * @param PROBLEM-STORE-PROPERTIES;
     * 		properties to be used if a new problem store is created.
     * @unknown If a :problem-store-name is specified in PROBLEM-STORE-PROPERTIES, it will be
    overridden by NAME.
     */
    @LispMethod(comment = "@param PROBLEM-STORE-PROPERTIES;\r\n\t\tproperties to be used if a new problem store is created.\r\n@unknown If a :problem-store-name is specified in PROBLEM-STORE-PROPERTIES, it will be\r\noverridden by NAME.")
    public static SubLObject find_or_create_problem_store_by_name(final SubLObject name, SubLObject problem_store_properties) {
	if (problem_store_properties == UNPROVIDED) {
	    problem_store_properties = NIL;
	}
	assert NIL != inference_datastructures_enumerated_types.problem_store_name_p(name) : "! inference_datastructures_enumerated_types.problem_store_name_p(name) "
		+ ("inference_datastructures_enumerated_types.problem_store_name_p(name) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.problem_store_name_p(name) ") + name;
	assert NIL != inference_datastructures_enumerated_types.problem_store_properties_p(problem_store_properties) : "! inference_datastructures_enumerated_types.problem_store_properties_p(problem_store_properties) "
		+ ("inference_datastructures_enumerated_types.problem_store_properties_p(problem_store_properties) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.problem_store_properties_p(problem_store_properties) ") + problem_store_properties;
	SubLObject store = inference_datastructures_problem_store.find_problem_store_by_name(name);
	if (NIL == store) {
	    final SubLObject new_properties = putf(copy_list(problem_store_properties), $PROBLEM_STORE_NAME, name);
	    store = inference_datastructures_problem_store.new_problem_store(new_properties);
	}
	return store;
    }

    public static final SubLObject destroy_problem_store_by_name_alt(SubLObject name) {
	SubLTrampolineFile.checkType(name, PROBLEM_STORE_NAME_P);
	return destroy_problem_store(find_problem_store_by_name(name));
    }

    public static SubLObject destroy_problem_store_by_name(final SubLObject name) {
	assert NIL != inference_datastructures_enumerated_types.problem_store_name_p(name) : "! inference_datastructures_enumerated_types.problem_store_name_p(name) "
		+ ("inference_datastructures_enumerated_types.problem_store_name_p(name) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.problem_store_name_p(name) ") + name;
	return inference_datastructures_problem_store.destroy_problem_store(inference_datastructures_problem_store.find_problem_store_by_name(name));
    }

    /**
     *
     *
     * @return booleanp; whether the rename was successful.  It will be unsuccessful
    if there is already a different problem store named NEW-NAME.
    No-op renames return T.
     */
    @LispMethod(comment = "@return booleanp; whether the rename was successful.  It will be unsuccessful\r\nif there is already a different problem store named NEW-NAME.\r\nNo-op renames return T.")
    public static final SubLObject rename_problem_store_alt(SubLObject problem_store, SubLObject new_name) {
	SubLTrampolineFile.checkType(problem_store, PROBLEM_STORE_P);
	SubLTrampolineFile.checkType(new_name, PROBLEM_STORE_NAME_P);
	{
	    SubLObject existing_store = find_problem_store_by_name(new_name);
	    if ((NIL != existing_store) && (problem_store == existing_store)) {
		return T;
	    } else {
		if (NIL != existing_store) {
		    return NIL;
		} else {
		    free_problem_store_name(problem_store);
		    set_problem_store_name(problem_store, new_name);
		    return T;
		}
	    }
	}
    }

    /**
     *
     *
     * @return booleanp; whether the rename was successful.  It will be unsuccessful
    if there is already a different problem store named NEW-NAME.
    No-op renames return T.
     */
    @LispMethod(comment = "@return booleanp; whether the rename was successful.  It will be unsuccessful\r\nif there is already a different problem store named NEW-NAME.\r\nNo-op renames return T.")
    public static SubLObject rename_problem_store(final SubLObject problem_store, final SubLObject new_name) {
	assert NIL != inference_datastructures_problem_store.problem_store_p(problem_store) : "! inference_datastructures_problem_store.problem_store_p(problem_store) "
		+ ("inference_datastructures_problem_store.problem_store_p(problem_store) " + "CommonSymbols.NIL != inference_datastructures_problem_store.problem_store_p(problem_store) ") + problem_store;
	assert NIL != inference_datastructures_enumerated_types.problem_store_name_p(new_name) : "! inference_datastructures_enumerated_types.problem_store_name_p(new_name) "
		+ ("inference_datastructures_enumerated_types.problem_store_name_p(new_name) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.problem_store_name_p(new_name) ") + new_name;
	final SubLObject existing_store = inference_datastructures_problem_store.find_problem_store_by_name(new_name);
	if ((NIL != existing_store) && problem_store.eql(existing_store)) {
	    return T;
	}
	if (NIL != existing_store) {
	    return NIL;
	}
	inference_datastructures_problem_store.free_problem_store_name(problem_store);
	inference_datastructures_problem_store.set_problem_store_name(problem_store, new_name);
	return T;
    }

    public static final SubLObject set_problem_store_name_alt(SubLObject problem_store, SubLObject name) {
	if (NIL != name) {
	    {
		SubLObject id = problem_store_suid(problem_store);
		sethash(id, $problem_store_id_to_name_table$.getGlobalValue(), name);
		sethash(name, $problem_store_name_to_id_table$.getGlobalValue(), id);
	    }
	}
	return problem_store;
    }

    public static SubLObject set_problem_store_name(final SubLObject problem_store, final SubLObject name) {
	if (NIL != name) {
	    final SubLObject id = inference_datastructures_problem_store.problem_store_suid(problem_store);
	    sethash(id, $problem_store_id_to_name_table$.getGlobalValue(), name);
	    sethash(name, $problem_store_name_to_id_table$.getGlobalValue(), id);
	}
	return problem_store;
    }

    public static final SubLObject free_problem_store_name_alt(SubLObject problem_store) {
	{
	    SubLObject id = problem_store_suid(problem_store);
	    SubLObject name = problem_store_name(problem_store);
	    remhash(id, $problem_store_id_to_name_table$.getGlobalValue());
	    remhash(name, $problem_store_name_to_id_table$.getGlobalValue());
	}
	return NIL;
    }

    public static SubLObject free_problem_store_name(final SubLObject problem_store) {
	final SubLObject id = inference_datastructures_problem_store.problem_store_suid(problem_store);
	final SubLObject name = inference_datastructures_problem_store.problem_store_name(problem_store);
	remhash(id, $problem_store_id_to_name_table$.getGlobalValue());
	remhash(name, $problem_store_name_to_id_table$.getGlobalValue());
	return NIL;
    }

    /**
     * Return a plist of the current problem store properties for STORE.
     */
    @LispMethod(comment = "Return a plist of the current problem store properties for STORE.")
    public static final SubLObject problem_store_properties_alt(SubLObject store) {
	{
	    SubLObject v_properties = NIL;
	    SubLObject cdolist_list_var = inference_datastructures_enumerated_types.all_problem_store_properties();
	    SubLObject property = NIL;
	    for (property = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), property = cdolist_list_var.first()) {
		{
		    SubLObject value = problem_store_property_value(store, property);
		    v_properties = cons(cons(property, value), v_properties);
		}
	    }
	    return alist_to_plist(nreverse(v_properties));
	}
    }

    /**
     * Return a plist of the current problem store properties for STORE.
     */
    @LispMethod(comment = "Return a plist of the current problem store properties for STORE.")
    public static SubLObject problem_store_properties(final SubLObject store) {
	SubLObject v_properties = NIL;
	SubLObject cdolist_list_var = inference_datastructures_enumerated_types.all_problem_store_properties();
	SubLObject property = NIL;
	property = cdolist_list_var.first();
	while (NIL != cdolist_list_var) {
	    final SubLObject value = inference_datastructures_problem_store.problem_store_property_value(store, property);
	    v_properties = cons(cons(property, value), v_properties);
	    cdolist_list_var = cdolist_list_var.rest();
	    property = cdolist_list_var.first();
	}
	return list_utilities.alist_to_plist(nreverse(v_properties));
    }

    public static final SubLObject problem_store_property_value_alt(SubLObject store, SubLObject property) {
	{
	    SubLObject pcase_var = property;
	    if (pcase_var.eql($kw175$ABDUCTION_ALLOWED_)) {
		return problem_store_abduction_allowedP(store);
	    } else {
		if (pcase_var.eql($kw169$ADD_RESTRICTION_LAYER_OF_INDIRECTION_)) {
		    return problem_store_add_restriction_layer_of_indirectionP(store);
		} else {
		    if (pcase_var.eql($kw171$COMPLETENESS_MINIMIZATION_ALLOWED_)) {
			return problem_store_completeness_minimization_allowedP(store);
		    } else {
			if (pcase_var.eql($DIRECTION)) {
			    return problem_store_direction(store);
			} else {
			    if (pcase_var.eql($EQUALITY_REASONING_DOMAIN)) {
				return problem_store_equality_reasoning_domain(store);
			    } else {
				if (pcase_var.eql($EQUALITY_REASONING_METHOD)) {
				    return problem_store_equality_reasoning_method(store);
				} else {
				    if (pcase_var.eql($kw173$EVALUATE_SUBL_ALLOWED_)) {
					return problem_store_evaluate_subl_allowedP(store);
				    } else {
					if (pcase_var.eql($INTERMEDIATE_STEP_VALIDATION_LEVEL)) {
					    return problem_store_intermediate_step_validation_level(store);
					} else {
					    if (pcase_var.eql($MAX_PROBLEM_COUNT)) {
						return problem_store_max_problem_count(store);
					    } else {
						if (pcase_var.eql($kw170$NEGATION_BY_FAILURE_)) {
						    return problem_store_negation_by_failureP(store);
						} else {
						    if (pcase_var.eql($kw176$NEW_TERMS_ALLOWED_)) {
							return problem_store_new_terms_allowedP(store);
						    } else {
							if (pcase_var.eql($PROBLEM_STORE_NAME)) {
							    return problem_store_name(store);
							} else {
							    if (pcase_var.eql($kw167$REMOVAL_ALLOWED_)) {
								return problem_store_removal_allowedP(store);
							    } else {
								if (pcase_var.eql($kw174$REWRITE_ALLOWED_)) {
								    return problem_store_rewrite_allowedP(store);
								} else {
								    if (pcase_var.eql($kw168$TRANSFORMATION_ALLOWED_)) {
									return problem_store_transformation_allowedP(store);
								    } else {
									if (pcase_var.eql($kw177$COMPUTE_ANSWER_JUSTIFICATIONS_)) {
									    return problem_store_compute_answer_justificationsP(store);
									} else {
									    SubLTrampolineFile.checkType(property, PROBLEM_STORE_PROPERTY_P);
									    return Errors.error($str_alt333$Problem_store_property__S_reflect, property);
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
		    }
		}
	    }
	}
    }

    public static SubLObject problem_store_property_value(final SubLObject store, final SubLObject property) {
	if (property.eql($kw189$ABDUCTION_ALLOWED_)) {
	    return inference_datastructures_problem_store.problem_store_abduction_allowedP(store);
	}
	if (property.eql($kw183$ADD_RESTRICTION_LAYER_OF_INDIRECTION_)) {
	    return inference_datastructures_problem_store.problem_store_add_restriction_layer_of_indirectionP(store);
	}
	if (property.eql($kw185$COMPLETENESS_MINIMIZATION_ALLOWED_)) {
	    return inference_datastructures_problem_store.problem_store_completeness_minimization_allowedP(store);
	}
	if (property.eql($DIRECTION)) {
	    return inference_datastructures_problem_store.problem_store_direction(store);
	}
	if (property.eql($EQUALITY_REASONING_DOMAIN)) {
	    return inference_datastructures_problem_store.problem_store_equality_reasoning_domain(store);
	}
	if (property.eql($EQUALITY_REASONING_METHOD)) {
	    return inference_datastructures_problem_store.problem_store_equality_reasoning_method(store);
	}
	if (property.eql($kw187$EVALUATE_SUBL_ALLOWED_)) {
	    return inference_datastructures_problem_store.problem_store_evaluate_subl_allowedP(store);
	}
	if (property.eql($INTERMEDIATE_STEP_VALIDATION_LEVEL)) {
	    return inference_datastructures_problem_store.problem_store_intermediate_step_validation_level(store);
	}
	if (property.eql($MAX_PROBLEM_COUNT)) {
	    return inference_datastructures_problem_store.problem_store_max_problem_count(store);
	}
	if (property.eql($kw184$NEGATION_BY_FAILURE_)) {
	    return inference_datastructures_problem_store.problem_store_negation_by_failureP(store);
	}
	if (property.eql($kw190$NEW_TERMS_ALLOWED_)) {
	    return inference_datastructures_problem_store.problem_store_new_terms_allowedP(store);
	}
	if (property.eql($PROBLEM_STORE_NAME)) {
	    return inference_datastructures_problem_store.problem_store_name(store);
	}
	if (property.eql($kw181$REMOVAL_ALLOWED_)) {
	    return inference_datastructures_problem_store.problem_store_removal_allowedP(store);
	}
	if (property.eql($kw188$REWRITE_ALLOWED_)) {
	    return inference_datastructures_problem_store.problem_store_rewrite_allowedP(store);
	}
	if (property.eql($kw182$TRANSFORMATION_ALLOWED_)) {
	    return inference_datastructures_problem_store.problem_store_transformation_allowedP(store);
	}
	if (property.eql($kw191$COMPUTE_ANSWER_JUSTIFICATIONS_)) {
	    return inference_datastructures_problem_store.problem_store_compute_answer_justificationsP(store);
	}
	assert NIL != inference_datastructures_enumerated_types.problem_store_property_p(property) : "! inference_datastructures_enumerated_types.problem_store_property_p(property) "
		+ ("inference_datastructures_enumerated_types.problem_store_property_p(property) " + "CommonSymbols.NIL != inference_datastructures_enumerated_types.problem_store_property_p(property) ") + property;
	return Errors.error($str357$Problem_store_property__S_reflect, property);
    }

    public static SubLObject possibly_optimize_problem_store(final SubLObject store) {
	if (NIL != inference_datastructures_problem_store.hashify_problem_storeP(store)) {
	    inference_datastructures_problem_store.hashify_problem_store(store);
	    return T;
	}
	return NIL;
    }

    public static SubLObject hashify_problem_storeP(final SubLObject store) {
	return makeBoolean(inference_datastructures_problem_store.problem_store_historical_problem_count(store).numG(multiply($problem_store_hash_watermark$.getGlobalValue(), inference_datastructures_problem_store.problem_store_problem_count(store)))
		&& (NIL == id_index_pessimized_p(inference_datastructures_problem_store.problem_store_problem_id_index(store))));
    }

    public static SubLObject hashify_problem_store(final SubLObject store) {
	pessimize_id_index(inference_datastructures_problem_store.problem_store_problem_id_index(store));
	pessimize_id_index(inference_datastructures_problem_store.problem_store_link_id_index(store));
	pessimize_id_index(inference_datastructures_problem_store.problem_store_proof_id_index(store));
	return store;
    }

    public static final SubLObject test_problem_store_property_value_support_alt() {
	{
	    SubLObject failures = NIL;
	    SubLObject store = NIL;
	    try {
		store = new_problem_store(NIL);
		{
		    SubLObject cdolist_list_var = inference_datastructures_enumerated_types.all_problem_store_properties();
		    SubLObject property = NIL;
		    for (property = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest(), property = cdolist_list_var.first()) {
			{
			    SubLObject error_message = NIL;
			    try {
				{
				    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
				    try {
					bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
					try {
					    problem_store_property_value(store, property);
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
				failures = cons(cons(property, error_message), failures);
			    }
			}
		    }
		}
	    } finally {
		{
		    SubLObject _prev_bind_0 = currentBinding($is_thread_performing_cleanupP$);
		    try {
			bind($is_thread_performing_cleanupP$, T);
			destroy_problem_store(store);
		    } finally {
			rebind($is_thread_performing_cleanupP$, _prev_bind_0);
		    }
		}
	    }
	    return failures;
	}
    }

    public static SubLObject test_problem_store_property_value_support() {
	final SubLThread thread = SubLProcess.currentSubLThread();
	SubLObject failures = NIL;
	SubLObject store = NIL;
	try {
	    store = inference_datastructures_problem_store.new_problem_store(NIL);
	    SubLObject cdolist_list_var = inference_datastructures_enumerated_types.all_problem_store_properties();
	    SubLObject property = NIL;
	    property = cdolist_list_var.first();
	    while (NIL != cdolist_list_var) {
		SubLObject error_message = NIL;
		try {
		    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
		    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
		    try {
			Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
			try {
			    inference_datastructures_problem_store.problem_store_property_value(store, property);
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
		    failures = cons(cons(property, error_message), failures);
		}
		cdolist_list_var = cdolist_list_var.rest();
		property = cdolist_list_var.first();
	    }
	} finally {
	    final SubLObject _prev_bind_2 = $is_thread_performing_cleanupP$.currentBinding(thread);
	    try {
		$is_thread_performing_cleanupP$.bind(T, thread);
		final SubLObject _values = getValuesAsVector();
		inference_datastructures_problem_store.destroy_problem_store(store);
		restoreValuesFromVector(_values);
	    } finally {
		$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
	    }
	}
	return failures;
    }

    public static final SubLObject declare_inference_datastructures_problem_store_file_alt() {
	declareFunction("new_problem_store_id", "NEW-PROBLEM-STORE-ID", 0, 0, false);
	declareFunction("index_problem_store_by_id", "INDEX-PROBLEM-STORE-BY-ID", 2, 0, false);
	declareFunction("unindex_problem_store_by_id", "UNINDEX-PROBLEM-STORE-BY-ID", 1, 0, false);
	declareFunction("find_problem_store_by_id", "FIND-PROBLEM-STORE-BY-ID", 1, 0, false);
	declareFunction("problem_store_count", "PROBLEM-STORE-COUNT", 0, 0, false);
	declareFunction("problem_store_next_id", "PROBLEM-STORE-NEXT-ID", 0, 0, false);
	declareFunction("most_recent_problem_store", "MOST-RECENT-PROBLEM-STORE", 0, 0, false);
	declareMacro("do_all_problem_stores", "DO-ALL-PROBLEM-STORES");
	declareFunction("problem_store_id_index", "PROBLEM-STORE-ID-INDEX", 0, 0, false);
	declareFunction("all_problem_stores", "ALL-PROBLEM-STORES", 0, 0, false);
	declareFunction("destroy_all_problem_stores", "DESTROY-ALL-PROBLEM-STORES", 0, 0, false);
	declareFunction("problem_store_print_function_trampoline", "PROBLEM-STORE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
	declareFunction("problem_store_p", "PROBLEM-STORE-P", 1, 0, false);
	new $problem_store_p$UnaryFunction();
	declareFunction("prob_store_guid", "PROB-STORE-GUID", 1, 0, false);
	declareFunction("prob_store_suid", "PROB-STORE-SUID", 1, 0, false);
	declareFunction("prob_store_lock", "PROB-STORE-LOCK", 1, 0, false);
	declareFunction("prob_store_creation_time", "PROB-STORE-CREATION-TIME", 1, 0, false);
	declareFunction("prob_store_inference_id_index", "PROB-STORE-INFERENCE-ID-INDEX", 1, 0, false);
	declareFunction("prob_store_strategy_id_index", "PROB-STORE-STRATEGY-ID-INDEX", 1, 0, false);
	declareFunction("prob_store_problem_id_index", "PROB-STORE-PROBLEM-ID-INDEX", 1, 0, false);
	declareFunction("prob_store_link_id_index", "PROB-STORE-LINK-ID-INDEX", 1, 0, false);
	declareFunction("prob_store_proof_id_index", "PROB-STORE-PROOF-ID-INDEX", 1, 0, false);
	declareFunction("prob_store_problem_by_query_index", "PROB-STORE-PROBLEM-BY-QUERY-INDEX", 1, 0, false);
	declareFunction("prob_store_rejected_proofs", "PROB-STORE-REJECTED-PROOFS", 1, 0, false);
	declareFunction("prob_store_processed_proofs", "PROB-STORE-PROCESSED-PROOFS", 1, 0, false);
	declareFunction("prob_store_non_explanatory_subproofs_possibleP", "PROB-STORE-NON-EXPLANATORY-SUBPROOFS-POSSIBLE?", 1, 0, false);
	declareFunction("prob_store_non_explanatory_subproofs_index", "PROB-STORE-NON-EXPLANATORY-SUBPROOFS-INDEX", 1, 0, false);
	declareFunction("prob_store_most_recent_tactic_executed", "PROB-STORE-MOST-RECENT-TACTIC-EXECUTED", 1, 0, false);
	declareFunction("prob_store_min_proof_depth_index", "PROB-STORE-MIN-PROOF-DEPTH-INDEX", 1, 0, false);
	declareFunction("prob_store_min_transformation_depth_index", "PROB-STORE-MIN-TRANSFORMATION-DEPTH-INDEX", 1, 0, false);
	declareFunction("prob_store_min_transformation_depth_signature_index", "PROB-STORE-MIN-TRANSFORMATION-DEPTH-SIGNATURE-INDEX", 1, 0, false);
	declareFunction("prob_store_min_depth_index", "PROB-STORE-MIN-DEPTH-INDEX", 1, 0, false);
	declareFunction("prob_store_equality_reasoning_method", "PROB-STORE-EQUALITY-REASONING-METHOD", 1, 0, false);
	declareFunction("prob_store_equality_reasoning_domain", "PROB-STORE-EQUALITY-REASONING-DOMAIN", 1, 0, false);
	declareFunction("prob_store_intermediate_step_validation_level", "PROB-STORE-INTERMEDIATE-STEP-VALIDATION-LEVEL", 1, 0, false);
	declareFunction("prob_store_max_problem_count", "PROB-STORE-MAX-PROBLEM-COUNT", 1, 0, false);
	declareFunction("prob_store_crazy_max_problem_count", "PROB-STORE-CRAZY-MAX-PROBLEM-COUNT", 1, 0, false);
	declareFunction("prob_store_removal_allowedP", "PROB-STORE-REMOVAL-ALLOWED?", 1, 0, false);
	declareFunction("prob_store_transformation_allowedP", "PROB-STORE-TRANSFORMATION-ALLOWED?", 1, 0, false);
	declareFunction("prob_store_add_restriction_layer_of_indirectionP", "PROB-STORE-ADD-RESTRICTION-LAYER-OF-INDIRECTION?", 1, 0, false);
	declareFunction("prob_store_negation_by_failureP", "PROB-STORE-NEGATION-BY-FAILURE?", 1, 0, false);
	declareFunction("prob_store_completeness_minimization_allowedP", "PROB-STORE-COMPLETENESS-MINIMIZATION-ALLOWED?", 1, 0, false);
	declareFunction("prob_store_direction", "PROB-STORE-DIRECTION", 1, 0, false);
	declareFunction("prob_store_evaluate_subl_allowedP", "PROB-STORE-EVALUATE-SUBL-ALLOWED?", 1, 0, false);
	declareFunction("prob_store_rewrite_allowedP", "PROB-STORE-REWRITE-ALLOWED?", 1, 0, false);
	declareFunction("prob_store_abduction_allowedP", "PROB-STORE-ABDUCTION-ALLOWED?", 1, 0, false);
	declareFunction("prob_store_new_terms_allowedP", "PROB-STORE-NEW-TERMS-ALLOWED?", 1, 0, false);
	declareFunction("prob_store_compute_answer_justificationsP", "PROB-STORE-COMPUTE-ANSWER-JUSTIFICATIONS?", 1, 0, false);
	declareFunction("prob_store_memoization_state", "PROB-STORE-MEMOIZATION-STATE", 1, 0, false);
	declareFunction("prob_store_sbhl_resource_space", "PROB-STORE-SBHL-RESOURCE-SPACE", 1, 0, false);
	declareFunction("prob_store_preparedP", "PROB-STORE-PREPARED?", 1, 0, false);
	declareFunction("prob_store_destruction_imminentP", "PROB-STORE-DESTRUCTION-IMMINENT?", 1, 0, false);
	declareFunction("prob_store_meta_problem_store", "PROB-STORE-META-PROBLEM-STORE", 1, 0, false);
	declareFunction("prob_store_static_properties", "PROB-STORE-STATIC-PROPERTIES", 1, 0, false);
	declareFunction("prob_store_janitor", "PROB-STORE-JANITOR", 1, 0, false);
	declareFunction("prob_store_historical_root_problems", "PROB-STORE-HISTORICAL-ROOT-PROBLEMS", 1, 0, false);
	declareFunction("prob_store_historical_tactic_count", "PROB-STORE-HISTORICAL-TACTIC-COUNT", 1, 0, false);
	declareFunction("prob_store_complex_problem_query_czer_index", "PROB-STORE-COMPLEX-PROBLEM-QUERY-CZER-INDEX", 1, 0, false);
	declareFunction("prob_store_complex_problem_query_signatures", "PROB-STORE-COMPLEX-PROBLEM-QUERY-SIGNATURES", 1, 0, false);
	declareFunction("prob_store_proof_keeping_index", "PROB-STORE-PROOF-KEEPING-INDEX", 1, 0, false);
	declareFunction("_csetf_prob_store_guid", "_CSETF-PROB-STORE-GUID", 2, 0, false);
	declareFunction("_csetf_prob_store_suid", "_CSETF-PROB-STORE-SUID", 2, 0, false);
	declareFunction("_csetf_prob_store_lock", "_CSETF-PROB-STORE-LOCK", 2, 0, false);
	declareFunction("_csetf_prob_store_creation_time", "_CSETF-PROB-STORE-CREATION-TIME", 2, 0, false);
	declareFunction("_csetf_prob_store_inference_id_index", "_CSETF-PROB-STORE-INFERENCE-ID-INDEX", 2, 0, false);
	declareFunction("_csetf_prob_store_strategy_id_index", "_CSETF-PROB-STORE-STRATEGY-ID-INDEX", 2, 0, false);
	declareFunction("_csetf_prob_store_problem_id_index", "_CSETF-PROB-STORE-PROBLEM-ID-INDEX", 2, 0, false);
	declareFunction("_csetf_prob_store_link_id_index", "_CSETF-PROB-STORE-LINK-ID-INDEX", 2, 0, false);
	declareFunction("_csetf_prob_store_proof_id_index", "_CSETF-PROB-STORE-PROOF-ID-INDEX", 2, 0, false);
	declareFunction("_csetf_prob_store_problem_by_query_index", "_CSETF-PROB-STORE-PROBLEM-BY-QUERY-INDEX", 2, 0, false);
	declareFunction("_csetf_prob_store_rejected_proofs", "_CSETF-PROB-STORE-REJECTED-PROOFS", 2, 0, false);
	declareFunction("_csetf_prob_store_processed_proofs", "_CSETF-PROB-STORE-PROCESSED-PROOFS", 2, 0, false);
	declareFunction("_csetf_prob_store_non_explanatory_subproofs_possibleP", "_CSETF-PROB-STORE-NON-EXPLANATORY-SUBPROOFS-POSSIBLE?", 2, 0, false);
	declareFunction("_csetf_prob_store_non_explanatory_subproofs_index", "_CSETF-PROB-STORE-NON-EXPLANATORY-SUBPROOFS-INDEX", 2, 0, false);
	declareFunction("_csetf_prob_store_most_recent_tactic_executed", "_CSETF-PROB-STORE-MOST-RECENT-TACTIC-EXECUTED", 2, 0, false);
	declareFunction("_csetf_prob_store_min_proof_depth_index", "_CSETF-PROB-STORE-MIN-PROOF-DEPTH-INDEX", 2, 0, false);
	declareFunction("_csetf_prob_store_min_transformation_depth_index", "_CSETF-PROB-STORE-MIN-TRANSFORMATION-DEPTH-INDEX", 2, 0, false);
	declareFunction("_csetf_prob_store_min_transformation_depth_signature_index", "_CSETF-PROB-STORE-MIN-TRANSFORMATION-DEPTH-SIGNATURE-INDEX", 2, 0, false);
	declareFunction("_csetf_prob_store_min_depth_index", "_CSETF-PROB-STORE-MIN-DEPTH-INDEX", 2, 0, false);
	declareFunction("_csetf_prob_store_equality_reasoning_method", "_CSETF-PROB-STORE-EQUALITY-REASONING-METHOD", 2, 0, false);
	declareFunction("_csetf_prob_store_equality_reasoning_domain", "_CSETF-PROB-STORE-EQUALITY-REASONING-DOMAIN", 2, 0, false);
	declareFunction("_csetf_prob_store_intermediate_step_validation_level", "_CSETF-PROB-STORE-INTERMEDIATE-STEP-VALIDATION-LEVEL", 2, 0, false);
	declareFunction("_csetf_prob_store_max_problem_count", "_CSETF-PROB-STORE-MAX-PROBLEM-COUNT", 2, 0, false);
	declareFunction("_csetf_prob_store_crazy_max_problem_count", "_CSETF-PROB-STORE-CRAZY-MAX-PROBLEM-COUNT", 2, 0, false);
	declareFunction("_csetf_prob_store_removal_allowedP", "_CSETF-PROB-STORE-REMOVAL-ALLOWED?", 2, 0, false);
	declareFunction("_csetf_prob_store_transformation_allowedP", "_CSETF-PROB-STORE-TRANSFORMATION-ALLOWED?", 2, 0, false);
	declareFunction("_csetf_prob_store_add_restriction_layer_of_indirectionP", "_CSETF-PROB-STORE-ADD-RESTRICTION-LAYER-OF-INDIRECTION?", 2, 0, false);
	declareFunction("_csetf_prob_store_negation_by_failureP", "_CSETF-PROB-STORE-NEGATION-BY-FAILURE?", 2, 0, false);
	declareFunction("_csetf_prob_store_completeness_minimization_allowedP", "_CSETF-PROB-STORE-COMPLETENESS-MINIMIZATION-ALLOWED?", 2, 0, false);
	declareFunction("_csetf_prob_store_direction", "_CSETF-PROB-STORE-DIRECTION", 2, 0, false);
	declareFunction("_csetf_prob_store_evaluate_subl_allowedP", "_CSETF-PROB-STORE-EVALUATE-SUBL-ALLOWED?", 2, 0, false);
	declareFunction("_csetf_prob_store_rewrite_allowedP", "_CSETF-PROB-STORE-REWRITE-ALLOWED?", 2, 0, false);
	declareFunction("_csetf_prob_store_abduction_allowedP", "_CSETF-PROB-STORE-ABDUCTION-ALLOWED?", 2, 0, false);
	declareFunction("_csetf_prob_store_new_terms_allowedP", "_CSETF-PROB-STORE-NEW-TERMS-ALLOWED?", 2, 0, false);
	declareFunction("_csetf_prob_store_compute_answer_justificationsP", "_CSETF-PROB-STORE-COMPUTE-ANSWER-JUSTIFICATIONS?", 2, 0, false);
	declareFunction("_csetf_prob_store_memoization_state", "_CSETF-PROB-STORE-MEMOIZATION-STATE", 2, 0, false);
	declareFunction("_csetf_prob_store_sbhl_resource_space", "_CSETF-PROB-STORE-SBHL-RESOURCE-SPACE", 2, 0, false);
	declareFunction("_csetf_prob_store_preparedP", "_CSETF-PROB-STORE-PREPARED?", 2, 0, false);
	declareFunction("_csetf_prob_store_destruction_imminentP", "_CSETF-PROB-STORE-DESTRUCTION-IMMINENT?", 2, 0, false);
	declareFunction("_csetf_prob_store_meta_problem_store", "_CSETF-PROB-STORE-META-PROBLEM-STORE", 2, 0, false);
	declareFunction("_csetf_prob_store_static_properties", "_CSETF-PROB-STORE-STATIC-PROPERTIES", 2, 0, false);
	declareFunction("_csetf_prob_store_janitor", "_CSETF-PROB-STORE-JANITOR", 2, 0, false);
	declareFunction("_csetf_prob_store_historical_root_problems", "_CSETF-PROB-STORE-HISTORICAL-ROOT-PROBLEMS", 2, 0, false);
	declareFunction("_csetf_prob_store_historical_tactic_count", "_CSETF-PROB-STORE-HISTORICAL-TACTIC-COUNT", 2, 0, false);
	declareFunction("_csetf_prob_store_complex_problem_query_czer_index", "_CSETF-PROB-STORE-COMPLEX-PROBLEM-QUERY-CZER-INDEX", 2, 0, false);
	declareFunction("_csetf_prob_store_complex_problem_query_signatures", "_CSETF-PROB-STORE-COMPLEX-PROBLEM-QUERY-SIGNATURES", 2, 0, false);
	declareFunction("_csetf_prob_store_proof_keeping_index", "_CSETF-PROB-STORE-PROOF-KEEPING-INDEX", 2, 0, false);
	declareFunction("make_problem_store", "MAKE-PROBLEM-STORE", 0, 1, false);
	declareFunction("valid_problem_store_p", "VALID-PROBLEM-STORE-P", 1, 0, false);
	declareFunction("id_of_valid_problem_store_p", "ID-OF-VALID-PROBLEM-STORE-P", 1, 0, false);
	declareFunction("problem_store_invalid_p", "PROBLEM-STORE-INVALID-P", 1, 0, false);
	declareFunction("print_problem_store", "PRINT-PROBLEM-STORE", 3, 0, false);
	declareFunction("sxhash_problem_store_method", "SXHASH-PROBLEM-STORE-METHOD", 1, 0, false);
	declareMacro("with_problem_store_lock_held", "WITH-PROBLEM-STORE-LOCK-HELD");
	declareFunction("problem_store_lock", "PROBLEM-STORE-LOCK", 1, 0, false);
	declareMacro("with_problem_store_memoization_state", "WITH-PROBLEM-STORE-MEMOIZATION-STATE");
	declareFunction("problem_store_memoization_state", "PROBLEM-STORE-MEMOIZATION-STATE", 1, 0, false);
	declareMacro("with_problem_store_sbhl_resource_space", "WITH-PROBLEM-STORE-SBHL-RESOURCE-SPACE");
	declareFunction("problem_store_sbhl_resource_space", "PROBLEM-STORE-SBHL-RESOURCE-SPACE", 1, 0, false);
	declareFunction("set_problem_store_sbhl_resource_space", "SET-PROBLEM-STORE-SBHL-RESOURCE-SPACE", 2, 0, false);
	declareMacro("with_problem_store_resourcing_and_memoization", "WITH-PROBLEM-STORE-RESOURCING-AND-MEMOIZATION");
	declareMacro("do_problem_store_inferences", "DO-PROBLEM-STORE-INFERENCES");
	declareFunction("problem_store_inference_id_index", "PROBLEM-STORE-INFERENCE-ID-INDEX", 1, 0, false);
	declareMacro("do_problem_store_strategies", "DO-PROBLEM-STORE-STRATEGIES");
	declareFunction("problem_store_strategy_id_index", "PROBLEM-STORE-STRATEGY-ID-INDEX", 1, 0, false);
	declareMacro("do_problem_store_strategic_contexts", "DO-PROBLEM-STORE-STRATEGIC-CONTEXTS");
	declareMacro("do_problem_store_problems", "DO-PROBLEM-STORE-PROBLEMS");
	declareFunction("problem_store_problem_id_index", "PROBLEM-STORE-PROBLEM-ID-INDEX", 1, 0, false);
	declareMacro("do_problem_store_links", "DO-PROBLEM-STORE-LINKS");
	declareFunction("problem_store_link_id_index", "PROBLEM-STORE-LINK-ID-INDEX", 1, 0, false);
	declareMacro("do_problem_store_proofs", "DO-PROBLEM-STORE-PROOFS");
	declareFunction("problem_store_proof_id_index", "PROBLEM-STORE-PROOF-ID-INDEX", 1, 0, false);
	declareMacro("do_problem_store_historical_root_problems", "DO-PROBLEM-STORE-HISTORICAL-ROOT-PROBLEMS");
	declareFunction("problem_store_historical_root_problems", "PROBLEM-STORE-HISTORICAL-ROOT-PROBLEMS", 1, 0, false);
	declareMacro("do_inference_strategies", "DO-INFERENCE-STRATEGIES");
	declareFunction("new_problem_store", "NEW-PROBLEM-STORE", 0, 1, false);
	declareFunction("destroy_problem_store", "DESTROY-PROBLEM-STORE", 1, 0, false);
	declareFunction("destroy_problem_store_int", "DESTROY-PROBLEM-STORE-INT", 1, 0, false);
	declareFunction("note_problem_store_invalid", "NOTE-PROBLEM-STORE-INVALID", 1, 0, false);
	declareFunction("problem_store_guid", "PROBLEM-STORE-GUID", 1, 0, false);
	declareFunction("problem_store_suid", "PROBLEM-STORE-SUID", 1, 0, false);
	declareFunction("problem_store_creation_time", "PROBLEM-STORE-CREATION-TIME", 1, 0, false);
	declareFunction("problem_store_rejected_proofs", "PROBLEM-STORE-REJECTED-PROOFS", 1, 0, false);
	declareFunction("problem_store_processed_proofs", "PROBLEM-STORE-PROCESSED-PROOFS", 1, 0, false);
	declareFunction("problem_store_non_explanatory_subproofs_possibleP", "PROBLEM-STORE-NON-EXPLANATORY-SUBPROOFS-POSSIBLE?", 1, 0, false);
	declareFunction("problem_store_non_explanatory_subproofs_index", "PROBLEM-STORE-NON-EXPLANATORY-SUBPROOFS-INDEX", 1, 0, false);
	declareFunction("problem_store_most_recent_tactic_executed", "PROBLEM-STORE-MOST-RECENT-TACTIC-EXECUTED", 1, 0, false);
	declareFunction("problem_store_min_proof_depth_index", "PROBLEM-STORE-MIN-PROOF-DEPTH-INDEX", 1, 0, false);
	declareFunction("problem_store_min_transformation_depth_index", "PROBLEM-STORE-MIN-TRANSFORMATION-DEPTH-INDEX", 1, 0, false);
	declareFunction("problem_store_min_transformation_depth_signature_index", "PROBLEM-STORE-MIN-TRANSFORMATION-DEPTH-SIGNATURE-INDEX", 1, 0, false);
	declareFunction("problem_store_min_depth_index", "PROBLEM-STORE-MIN-DEPTH-INDEX", 1, 0, false);
	declareFunction("problem_store_equality_reasoning_method", "PROBLEM-STORE-EQUALITY-REASONING-METHOD", 1, 0, false);
	declareFunction("problem_store_equality_reasoning_domain", "PROBLEM-STORE-EQUALITY-REASONING-DOMAIN", 1, 0, false);
	declareFunction("problem_store_intermediate_step_validation_level", "PROBLEM-STORE-INTERMEDIATE-STEP-VALIDATION-LEVEL", 1, 0, false);
	declareFunction("problem_store_max_problem_count", "PROBLEM-STORE-MAX-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_crazy_max_problem_count", "PROBLEM-STORE-CRAZY-MAX-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_removal_allowedP", "PROBLEM-STORE-REMOVAL-ALLOWED?", 1, 0, false);
	declareFunction("problem_store_transformation_allowedP", "PROBLEM-STORE-TRANSFORMATION-ALLOWED?", 1, 0, false);
	declareFunction("problem_store_add_restriction_layer_of_indirectionP", "PROBLEM-STORE-ADD-RESTRICTION-LAYER-OF-INDIRECTION?", 1, 0, false);
	declareFunction("problem_store_negation_by_failureP", "PROBLEM-STORE-NEGATION-BY-FAILURE?", 1, 0, false);
	declareFunction("problem_store_completeness_minimization_allowedP", "PROBLEM-STORE-COMPLETENESS-MINIMIZATION-ALLOWED?", 1, 0, false);
	declareFunction("problem_store_direction", "PROBLEM-STORE-DIRECTION", 1, 0, false);
	declareFunction("problem_store_evaluate_subl_allowedP", "PROBLEM-STORE-EVALUATE-SUBL-ALLOWED?", 1, 0, false);
	declareFunction("problem_store_rewrite_allowedP", "PROBLEM-STORE-REWRITE-ALLOWED?", 1, 0, false);
	declareFunction("problem_store_abduction_allowedP", "PROBLEM-STORE-ABDUCTION-ALLOWED?", 1, 0, false);
	declareFunction("problem_store_new_terms_allowedP", "PROBLEM-STORE-NEW-TERMS-ALLOWED?", 1, 0, false);
	declareFunction("problem_store_compute_answer_justificationsP", "PROBLEM-STORE-COMPUTE-ANSWER-JUSTIFICATIONS?", 1, 0, false);
	declareFunction("problem_store_preparedP", "PROBLEM-STORE-PREPARED?", 1, 0, false);
	declareFunction("problem_store_destruction_imminentP", "PROBLEM-STORE-DESTRUCTION-IMMINENT?", 1, 0, false);
	declareFunction("problem_store_meta_problem_store", "PROBLEM-STORE-META-PROBLEM-STORE", 1, 0, false);
	declareFunction("problem_store_static_properties", "PROBLEM-STORE-STATIC-PROPERTIES", 1, 0, false);
	declareFunction("problem_store_janitor", "PROBLEM-STORE-JANITOR", 1, 0, false);
	declareFunction("note_problem_store_most_recent_tactic_executed", "NOTE-PROBLEM-STORE-MOST-RECENT-TACTIC-EXECUTED", 2, 0, false);
	declareFunction("set_problem_store_intermediate_step_validation_level", "SET-PROBLEM-STORE-INTERMEDIATE-STEP-VALIDATION-LEVEL", 2, 0, false);
	declareFunction("set_problem_store_add_restriction_layer_of_indirectionP", "SET-PROBLEM-STORE-ADD-RESTRICTION-LAYER-OF-INDIRECTION?", 2, 0, false);
	declareFunction("set_problem_store_transformation_allowedP", "SET-PROBLEM-STORE-TRANSFORMATION-ALLOWED?", 2, 0, false);
	declareFunction("set_problem_store_removal_allowedP", "SET-PROBLEM-STORE-REMOVAL-ALLOWED?", 2, 0, false);
	declareFunction("set_problem_store_new_terms_allowedP", "SET-PROBLEM-STORE-NEW-TERMS-ALLOWED?", 2, 0, false);
	declareFunction("note_problem_store_prepared", "NOTE-PROBLEM-STORE-PREPARED", 1, 0, false);
	declareFunction("note_problem_store_destruction_imminent", "NOTE-PROBLEM-STORE-DESTRUCTION-IMMINENT", 1, 0, false);
	declareFunction("reset_problem_store_janitor", "RESET-PROBLEM-STORE-JANITOR", 1, 0, false);
	declareFunction("problem_store_forwardP", "PROBLEM-STORE-FORWARD?", 1, 0, false);
	declareFunction("problem_store_newP", "PROBLEM-STORE-NEW?", 1, 0, false);
	declareFunction("new_problem_store_p", "NEW-PROBLEM-STORE-P", 1, 0, false);
	declareFunction("problem_store_inference_count", "PROBLEM-STORE-INFERENCE-COUNT", 1, 0, false);
	declareFunction("problem_store_has_only_one_inferenceP", "PROBLEM-STORE-HAS-ONLY-ONE-INFERENCE?", 1, 0, false);
	declareFunction("problem_store_historical_inference_count", "PROBLEM-STORE-HISTORICAL-INFERENCE-COUNT", 1, 0, false);
	declareFunction("find_inference_by_id", "FIND-INFERENCE-BY-ID", 2, 0, false);
	declareFunction("find_inference_by_ids", "FIND-INFERENCE-BY-IDS", 2, 0, false);
	declareFunction("first_problem_store_inference", "FIRST-PROBLEM-STORE-INFERENCE", 1, 0, false);
	declareFunction("earliest_problem_store_inference", "EARLIEST-PROBLEM-STORE-INFERENCE", 1, 0, false);
	declareFunction("latest_problem_store_inference", "LATEST-PROBLEM-STORE-INFERENCE", 1, 0, false);
	declareFunction("problem_store_privateP", "PROBLEM-STORE-PRIVATE?", 1, 0, false);
	declareFunction("problem_store_strategy_count", "PROBLEM-STORE-STRATEGY-COUNT", 1, 0, false);
	declareFunction("problem_store_historical_strategy_count", "PROBLEM-STORE-HISTORICAL-STRATEGY-COUNT", 1, 0, false);
	declareFunction("problem_store_strategies", "PROBLEM-STORE-STRATEGIES", 1, 0, false);
	declareFunction("find_strategy_by_id", "FIND-STRATEGY-BY-ID", 2, 0, false);
	declareFunction("find_strategy_by_ids", "FIND-STRATEGY-BY-IDS", 2, 0, false);
	declareFunction("first_problem_store_strategy", "FIRST-PROBLEM-STORE-STRATEGY", 1, 0, false);
	declareFunction("problem_store_obvious_strategic_context", "PROBLEM-STORE-OBVIOUS-STRATEGIC-CONTEXT", 1, 0, false);
	declareFunction("problem_store_unique_balancing_tactician", "PROBLEM-STORE-UNIQUE-BALANCING-TACTICIAN", 1, 0, false);
	declareFunction("problem_store_link_count", "PROBLEM-STORE-LINK-COUNT", 1, 0, false);
	declareFunction("problem_store_historical_link_count", "PROBLEM-STORE-HISTORICAL-LINK-COUNT", 1, 0, false);
	declareFunction("find_problem_link_by_id", "FIND-PROBLEM-LINK-BY-ID", 2, 0, false);
	declareFunction("find_problem_link_by_ids", "FIND-PROBLEM-LINK-BY-IDS", 2, 0, false);
	declareFunction("problem_store_first_link_of_type", "PROBLEM-STORE-FIRST-LINK-OF-TYPE", 2, 0, false);
	declareFunction("problem_store_link_type_count", "PROBLEM-STORE-LINK-TYPE-COUNT", 2, 0, false);
	declareFunction("problem_store_content_link_count", "PROBLEM-STORE-CONTENT-LINK-COUNT", 1, 0, false);
	declareFunction("problem_store_answer_link_count", "PROBLEM-STORE-ANSWER-LINK-COUNT", 1, 0, false);
	declareFunction("problem_store_removal_link_count", "PROBLEM-STORE-REMOVAL-LINK-COUNT", 1, 0, false);
	declareFunction("problem_store_conjunctive_removal_link_count", "PROBLEM-STORE-CONJUNCTIVE-REMOVAL-LINK-COUNT", 1, 0, false);
	declareFunction("problem_store_transformation_link_count", "PROBLEM-STORE-TRANSFORMATION-LINK-COUNT", 1, 0, false);
	declareFunction("problem_store_rewrite_link_count", "PROBLEM-STORE-REWRITE-LINK-COUNT", 1, 0, false);
	declareFunction("problem_store_structural_link_count", "PROBLEM-STORE-STRUCTURAL-LINK-COUNT", 1, 0, false);
	declareFunction("problem_store_join_ordered_link_count", "PROBLEM-STORE-JOIN-ORDERED-LINK-COUNT", 1, 0, false);
	declareFunction("problem_store_join_link_count", "PROBLEM-STORE-JOIN-LINK-COUNT", 1, 0, false);
	declareFunction("problem_store_split_link_count", "PROBLEM-STORE-SPLIT-LINK-COUNT", 1, 0, false);
	declareFunction("problem_store_restriction_link_count", "PROBLEM-STORE-RESTRICTION-LINK-COUNT", 1, 0, false);
	declareFunction("problem_store_residual_transformation_link_count", "PROBLEM-STORE-RESIDUAL-TRANSFORMATION-LINK-COUNT", 1, 0, false);
	declareFunction("problem_store_union_link_count", "PROBLEM-STORE-UNION-LINK-COUNT", 1, 0, false);
	declareFunction("problem_store_unmanifested_non_focal_count", "PROBLEM-STORE-UNMANIFESTED-NON-FOCAL-COUNT", 1, 0, false);
	declareFunction("problem_store_problem_count", "PROBLEM-STORE-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_historical_problem_count", "PROBLEM-STORE-HISTORICAL-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_emptyP", "PROBLEM-STORE-EMPTY?", 1, 0, false);
	declareFunction("compute_crazy_max_problem_count", "COMPUTE-CRAZY-MAX-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_max_problem_count_reachedP", "PROBLEM-STORE-MAX-PROBLEM-COUNT-REACHED?", 1, 0, false);
	declareFunction("problem_store_max_proof_count_reachedP", "PROBLEM-STORE-MAX-PROOF-COUNT-REACHED?", 1, 0, false);
	declareFunction("problem_store_crazy_max_problem_count_exactly_reachedP", "PROBLEM-STORE-CRAZY-MAX-PROBLEM-COUNT-EXACTLY-REACHED?", 1, 0, false);
	declareFunction("problem_store_crazy_max_problem_count_reachedP", "PROBLEM-STORE-CRAZY-MAX-PROBLEM-COUNT-REACHED?", 1, 0, false);
	declareFunction("problem_store_allows_proof_processingP", "PROBLEM-STORE-ALLOWS-PROOF-PROCESSING?", 1, 0, false);
	declareFunction("find_problem_by_id", "FIND-PROBLEM-BY-ID", 2, 0, false);
	declareFunction("find_problem_by_ids", "FIND-PROBLEM-BY-IDS", 2, 0, false);
	declareFunction("find_problem_by_query", "FIND-PROBLEM-BY-QUERY", 2, 0, false);
	declareFunction("problem_store_tactical_problem_count", "PROBLEM-STORE-TACTICAL-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_unexamined_problem_count", "PROBLEM-STORE-UNEXAMINED-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_examined_problem_count", "PROBLEM-STORE-EXAMINED-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_possible_problem_count", "PROBLEM-STORE-POSSIBLE-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_pending_problem_count", "PROBLEM-STORE-PENDING-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_finished_problem_count", "PROBLEM-STORE-FINISHED-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_good_problem_count", "PROBLEM-STORE-GOOD-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_neutral_problem_count", "PROBLEM-STORE-NEUTRAL-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_no_good_problem_count", "PROBLEM-STORE-NO-GOOD-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_single_literal_problem_count", "PROBLEM-STORE-SINGLE-LITERAL-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_conjunctive_problem_count", "PROBLEM-STORE-CONJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_join_problem_count", "PROBLEM-STORE-JOIN-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_split_problem_count", "PROBLEM-STORE-SPLIT-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_disjunctive_problem_count", "PROBLEM-STORE-DISJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_unexamined_good_problem_count", "PROBLEM-STORE-UNEXAMINED-GOOD-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_examined_good_problem_count", "PROBLEM-STORE-EXAMINED-GOOD-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_possible_good_problem_count", "PROBLEM-STORE-POSSIBLE-GOOD-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_pending_good_problem_count", "PROBLEM-STORE-PENDING-GOOD-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_finished_good_problem_count", "PROBLEM-STORE-FINISHED-GOOD-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_unexamined_neutral_problem_count", "PROBLEM-STORE-UNEXAMINED-NEUTRAL-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_examined_neutral_problem_count", "PROBLEM-STORE-EXAMINED-NEUTRAL-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_possible_neutral_problem_count", "PROBLEM-STORE-POSSIBLE-NEUTRAL-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_pending_neutral_problem_count", "PROBLEM-STORE-PENDING-NEUTRAL-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_finished_neutral_problem_count", "PROBLEM-STORE-FINISHED-NEUTRAL-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_unexamined_no_good_problem_count", "PROBLEM-STORE-UNEXAMINED-NO-GOOD-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_examined_no_good_problem_count", "PROBLEM-STORE-EXAMINED-NO-GOOD-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_possible_no_good_problem_count", "PROBLEM-STORE-POSSIBLE-NO-GOOD-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_pending_no_good_problem_count", "PROBLEM-STORE-PENDING-NO-GOOD-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_finished_no_good_problem_count", "PROBLEM-STORE-FINISHED-NO-GOOD-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_good_single_literal_problem_count", "PROBLEM-STORE-GOOD-SINGLE-LITERAL-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_good_conjunctive_problem_count", "PROBLEM-STORE-GOOD-CONJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_good_join_problem_count", "PROBLEM-STORE-GOOD-JOIN-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_good_split_problem_count", "PROBLEM-STORE-GOOD-SPLIT-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_good_disjunctive_problem_count", "PROBLEM-STORE-GOOD-DISJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_neutral_single_literal_problem_count", "PROBLEM-STORE-NEUTRAL-SINGLE-LITERAL-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_neutral_conjunctive_problem_count", "PROBLEM-STORE-NEUTRAL-CONJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_neutral_join_problem_count", "PROBLEM-STORE-NEUTRAL-JOIN-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_neutral_split_problem_count", "PROBLEM-STORE-NEUTRAL-SPLIT-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_neutral_disjunctive_problem_count", "PROBLEM-STORE-NEUTRAL-DISJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_no_good_single_literal_problem_count", "PROBLEM-STORE-NO-GOOD-SINGLE-LITERAL-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_no_good_conjunctive_problem_count", "PROBLEM-STORE-NO-GOOD-CONJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_no_good_join_problem_count", "PROBLEM-STORE-NO-GOOD-JOIN-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_no_good_split_problem_count", "PROBLEM-STORE-NO-GOOD-SPLIT-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_no_good_disjunctive_problem_count", "PROBLEM-STORE-NO-GOOD-DISJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_unexamined_single_literal_problem_count", "PROBLEM-STORE-UNEXAMINED-SINGLE-LITERAL-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_unexamined_conjunctive_problem_count", "PROBLEM-STORE-UNEXAMINED-CONJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_unexamined_join_problem_count", "PROBLEM-STORE-UNEXAMINED-JOIN-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_unexamined_split_problem_count", "PROBLEM-STORE-UNEXAMINED-SPLIT-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_unexamined_disjunctive_problem_count", "PROBLEM-STORE-UNEXAMINED-DISJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_examined_single_literal_problem_count", "PROBLEM-STORE-EXAMINED-SINGLE-LITERAL-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_examined_conjunctive_problem_count", "PROBLEM-STORE-EXAMINED-CONJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_examined_join_problem_count", "PROBLEM-STORE-EXAMINED-JOIN-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_examined_split_problem_count", "PROBLEM-STORE-EXAMINED-SPLIT-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_examined_disjunctive_problem_count", "PROBLEM-STORE-EXAMINED-DISJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_possible_single_literal_problem_count", "PROBLEM-STORE-POSSIBLE-SINGLE-LITERAL-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_possible_conjunctive_problem_count", "PROBLEM-STORE-POSSIBLE-CONJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_possible_join_problem_count", "PROBLEM-STORE-POSSIBLE-JOIN-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_possible_split_problem_count", "PROBLEM-STORE-POSSIBLE-SPLIT-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_possible_disjunctive_problem_count", "PROBLEM-STORE-POSSIBLE-DISJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_pending_single_literal_problem_count", "PROBLEM-STORE-PENDING-SINGLE-LITERAL-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_pending_conjunctive_problem_count", "PROBLEM-STORE-PENDING-CONJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_pending_join_problem_count", "PROBLEM-STORE-PENDING-JOIN-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_pending_split_problem_count", "PROBLEM-STORE-PENDING-SPLIT-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_pending_disjunctive_problem_count", "PROBLEM-STORE-PENDING-DISJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_finished_single_literal_problem_count", "PROBLEM-STORE-FINISHED-SINGLE-LITERAL-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_finished_conjunctive_problem_count", "PROBLEM-STORE-FINISHED-CONJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_finished_join_problem_count", "PROBLEM-STORE-FINISHED-JOIN-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_finished_split_problem_count", "PROBLEM-STORE-FINISHED-SPLIT-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_finished_disjunctive_problem_count", "PROBLEM-STORE-FINISHED-DISJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_executed_removal_tactic_productivities", "PROBLEM-STORE-EXECUTED-REMOVAL-TACTIC-PRODUCTIVITIES", 1, 0, false);
	declareFunction("problem_store_tactic_with_status_count", "PROBLEM-STORE-TACTIC-WITH-STATUS-COUNT", 1, 1, false);
	declareFunction("problem_store_tactic_of_type_with_status_count", "PROBLEM-STORE-TACTIC-OF-TYPE-WITH-STATUS-COUNT", 1, 2, false);
	declareFunction("problem_store_tactic_count", "PROBLEM-STORE-TACTIC-COUNT", 1, 0, false);
	declareFunction("problem_store_historical_tactic_count", "PROBLEM-STORE-HISTORICAL-TACTIC-COUNT", 1, 0, false);
	declareFunction("problem_store_increment_historical_tactic_count", "PROBLEM-STORE-INCREMENT-HISTORICAL-TACTIC-COUNT", 1, 0, false);
	declareFunction("problem_store_possible_tactic_count", "PROBLEM-STORE-POSSIBLE-TACTIC-COUNT", 1, 0, false);
	declareFunction("problem_store_executed_tactic_count", "PROBLEM-STORE-EXECUTED-TACTIC-COUNT", 1, 0, false);
	declareFunction("problem_store_discarded_tactic_count", "PROBLEM-STORE-DISCARDED-TACTIC-COUNT", 1, 0, false);
	declareFunction("problem_store_proof_count", "PROBLEM-STORE-PROOF-COUNT", 1, 0, false);
	declareFunction("problem_store_historical_proof_count", "PROBLEM-STORE-HISTORICAL-PROOF-COUNT", 1, 0, false);
	declareFunction("find_proof_by_id", "FIND-PROOF-BY-ID", 2, 0, false);
	declareFunction("find_proof_by_ids", "FIND-PROOF-BY-IDS", 2, 0, false);
	declareFunction("problem_store_some_rejected_proofsP", "PROBLEM-STORE-SOME-REJECTED-PROOFS?", 1, 0, false);
	declareFunction("problem_store_rejected_proof_count", "PROBLEM-STORE-REJECTED-PROOF-COUNT", 1, 0, false);
	declareFunction("problem_store_proven_proof_count", "PROBLEM-STORE-PROVEN-PROOF-COUNT", 1, 0, false);
	declareFunction("problem_store_all_processed_proofs", "PROBLEM-STORE-ALL-PROCESSED-PROOFS", 1, 0, false);
	declareFunction("problem_store_has_some_non_explanatory_subproofP", "PROBLEM-STORE-HAS-SOME-NON-EXPLANATORY-SUBPROOF?", 1, 0, false);
	declareFunction("problem_store_proof_non_explanatory_subproofs", "PROBLEM-STORE-PROOF-NON-EXPLANATORY-SUBPROOFS", 2, 0, false);
	declareFunction("problem_store_size", "PROBLEM-STORE-SIZE", 1, 0, false);
	declareFunction("problem_store_historical_size", "PROBLEM-STORE-HISTORICAL-SIZE", 1, 0, false);
	declareFunction("problem_store_dependent_link_count", "PROBLEM-STORE-DEPENDENT-LINK-COUNT", 1, 0, false);
	declareFunction("problem_store_most_recent_transformation_link", "PROBLEM-STORE-MOST-RECENT-TRANSFORMATION-LINK", 1, 0, false);
	declareFunction("problem_store_transformation_rules", "PROBLEM-STORE-TRANSFORMATION-RULES", 1, 0, false);
	declareFunction("problem_store_all_non_focal_problems", "PROBLEM-STORE-ALL-NON-FOCAL-PROBLEMS", 1, 0, false);
	declareFunction("problem_store_could_recompute_destructiblesP", "PROBLEM-STORE-COULD-RECOMPUTE-DESTRUCTIBLES?", 1, 0, false);
	declareFunction("problem_store_could_remove_destructiblesP", "PROBLEM-STORE-COULD-REMOVE-DESTRUCTIBLES?", 1, 0, false);
	declareFunction("problem_stores_similarP", "PROBLEM-STORES-SIMILAR?", 2, 0, false);
	declareFunction("problem_store_transformation_rule_bindings_to_closed", "PROBLEM-STORE-TRANSFORMATION-RULE-BINDINGS-TO-CLOSED", 1, 0, false);
	declareFunction("problem_store_all_problems", "PROBLEM-STORE-ALL-PROBLEMS", 1, 0, false);
	declareFunction("problem_store_all_problem_queries", "PROBLEM-STORE-ALL-PROBLEM-QUERIES", 1, 0, false);
	declareFunction("problem_store_all_problem_links", "PROBLEM-STORE-ALL-PROBLEM-LINKS", 1, 0, false);
	declareFunction("problem_store_all_proofs", "PROBLEM-STORE-ALL-PROOFS", 1, 0, false);
	declareFunction("problem_store_historical_root_problemP", "PROBLEM-STORE-HISTORICAL-ROOT-PROBLEM?", 2, 0, false);
	declareFunction("problem_store_historical_root_problem_count", "PROBLEM-STORE-HISTORICAL-ROOT-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_problem_with_complex_problem_queryP", "PROBLEM-STORE-PROBLEM-WITH-COMPLEX-PROBLEM-QUERY?", 2, 0, false);
	declareFunction("problem_store_complex_problem_query_signature", "PROBLEM-STORE-COMPLEX-PROBLEM-QUERY-SIGNATURE", 2, 0, false);
	declareFunction("problem_store_find_complex_problem_query", "PROBLEM-STORE-FIND-COMPLEX-PROBLEM-QUERY", 2, 0, false);
	declareFunction("clear_problem_store_proof_keeping_problems", "CLEAR-PROBLEM-STORE-PROOF-KEEPING-PROBLEMS", 1, 0, false);
	declareFunction("problem_proof_keeping_status", "PROBLEM-PROOF-KEEPING-STATUS", 1, 0, false);
	declareFunction("proof_keeping_problemP", "PROOF-KEEPING-PROBLEM?", 1, 0, false);
	declareFunction("non_proof_keeping_problemP", "NON-PROOF-KEEPING-PROBLEM?", 1, 0, false);
	declareFunction("unknown_proof_keeping_problemP", "UNKNOWN-PROOF-KEEPING-PROBLEM?", 1, 0, false);
	declareFunction("note_proof_keeping_problem", "NOTE-PROOF-KEEPING-PROBLEM", 2, 0, false);
	declareFunction("note_not_proof_keeping_problem", "NOTE-NOT-PROOF-KEEPING-PROBLEM", 1, 0, false);
	declareFunction("problem_store_prepare_for_expected_problem_count", "PROBLEM-STORE-PREPARE-FOR-EXPECTED-PROBLEM-COUNT", 2, 0, false);
	declareFunction("problem_store_prepare_for_expected_link_count", "PROBLEM-STORE-PREPARE-FOR-EXPECTED-LINK-COUNT", 2, 0, false);
	declareFunction("problem_store_prepare_for_expected_proof_count", "PROBLEM-STORE-PREPARE-FOR-EXPECTED-PROOF-COUNT", 2, 0, false);
	declareFunction("problem_store_new_inference_id", "PROBLEM-STORE-NEW-INFERENCE-ID", 1, 0, false);
	declareFunction("problem_store_new_strategy_id", "PROBLEM-STORE-NEW-STRATEGY-ID", 1, 0, false);
	declareFunction("problem_store_new_problem_id", "PROBLEM-STORE-NEW-PROBLEM-ID", 1, 0, false);
	declareFunction("problem_store_new_link_id", "PROBLEM-STORE-NEW-LINK-ID", 1, 0, false);
	declareFunction("problem_store_new_proof_id", "PROBLEM-STORE-NEW-PROOF-ID", 1, 0, false);
	declareFunction("add_problem_store_inference", "ADD-PROBLEM-STORE-INFERENCE", 2, 0, false);
	declareFunction("remove_problem_store_inference", "REMOVE-PROBLEM-STORE-INFERENCE", 2, 0, false);
	declareFunction("add_problem_store_strategy", "ADD-PROBLEM-STORE-STRATEGY", 2, 0, false);
	declareFunction("remove_problem_store_strategy", "REMOVE-PROBLEM-STORE-STRATEGY", 2, 0, false);
	declareFunction("add_problem_store_problem_by_id", "ADD-PROBLEM-STORE-PROBLEM-BY-ID", 2, 0, false);
	declareFunction("remove_problem_store_problem_by_id", "REMOVE-PROBLEM-STORE-PROBLEM-BY-ID", 2, 0, false);
	declareFunction("add_problem_store_problem_by_query", "ADD-PROBLEM-STORE-PROBLEM-BY-QUERY", 2, 0, false);
	declareFunction("remove_problem_store_problem_by_query", "REMOVE-PROBLEM-STORE-PROBLEM-BY-QUERY", 2, 0, false);
	declareFunction("add_problem_store_link", "ADD-PROBLEM-STORE-LINK", 2, 0, false);
	declareFunction("remove_problem_store_link", "REMOVE-PROBLEM-STORE-LINK", 2, 0, false);
	declareFunction("add_problem_store_proof", "ADD-PROBLEM-STORE-PROOF", 2, 0, false);
	declareFunction("remove_problem_store_proof", "REMOVE-PROBLEM-STORE-PROOF", 2, 0, false);
	declareFunction("problem_store_forget_that_proof_is_rejected", "PROBLEM-STORE-FORGET-THAT-PROOF-IS-REJECTED", 2, 0, false);
	declareFunction("problem_store_note_proof_processed", "PROBLEM-STORE-NOTE-PROOF-PROCESSED", 2, 0, false);
	declareFunction("problem_store_note_proof_unprocessed", "PROBLEM-STORE-NOTE-PROOF-UNPROCESSED", 2, 0, false);
	declareFunction("problem_store_note_non_explanatory_subproofs_possible", "PROBLEM-STORE-NOTE-NON-EXPLANATORY-SUBPROOFS-POSSIBLE", 1, 0, false);
	declareFunction("problem_store_note_non_explanatory_subproof", "PROBLEM-STORE-NOTE-NON-EXPLANATORY-SUBPROOF", 3, 0, false);
	declareFunction("proof_note_non_explanatory_subproof", "PROOF-NOTE-NON-EXPLANATORY-SUBPROOF", 2, 0, false);
	declareFunction("reset_problem_store_min_depth_index", "RESET-PROBLEM-STORE-MIN-DEPTH-INDEX", 1, 0, false);
	declareFunction("problem_store_min_proof_depth_index_remove_inference", "PROBLEM-STORE-MIN-PROOF-DEPTH-INDEX-REMOVE-INFERENCE", 2, 0, false);
	declareFunction("problem_store_min_transformation_depth_index_remove_inference", "PROBLEM-STORE-MIN-TRANSFORMATION-DEPTH-INDEX-REMOVE-INFERENCE", 2, 0, false);
	declareFunction("problem_store_min_transformation_depth_signature_index_remove_inference", "PROBLEM-STORE-MIN-TRANSFORMATION-DEPTH-SIGNATURE-INDEX-REMOVE-INFERENCE", 2, 0, false);
	declareFunction("add_problem_store_historical_root_problem", "ADD-PROBLEM-STORE-HISTORICAL-ROOT-PROBLEM", 2, 0, false);
	declareFunction("remove_problem_store_historical_root_problem", "REMOVE-PROBLEM-STORE-HISTORICAL-ROOT-PROBLEM", 2, 0, false);
	declareFunction("finalize_problem_store_properties", "FINALIZE-PROBLEM-STORE-PROPERTIES", 1, 0, false);
	declareFunction("add_problem_store_complex_problem", "ADD-PROBLEM-STORE-COMPLEX-PROBLEM", 2, 0, false);
	declareFunction("remove_problem_store_complex_problem", "REMOVE-PROBLEM-STORE-COMPLEX-PROBLEM", 2, 0, false);
	declareFunction("add_problem_store_problem", "ADD-PROBLEM-STORE-PROBLEM", 2, 0, false);
	declareFunction("remove_problem_store_problem", "REMOVE-PROBLEM-STORE-PROBLEM", 2, 0, false);
	declareFunction("remove_problem_wrt_reuse", "REMOVE-PROBLEM-WRT-REUSE", 2, 0, false);
	declareFunction("problem_store_note_transformation_rule_considered", "PROBLEM-STORE-NOTE-TRANSFORMATION-RULE-CONSIDERED", 2, 0, false);
	declareFunction("problem_store_note_transformation_rule_success", "PROBLEM-STORE-NOTE-TRANSFORMATION-RULE-SUCCESS", 2, 0, false);
	declareFunction("ensure_transformation_rule_considered_noted_internal", "ENSURE-TRANSFORMATION-RULE-CONSIDERED-NOTED-INTERNAL", 1, 0, false);
	declareFunction("ensure_transformation_rule_considered_noted", "ENSURE-TRANSFORMATION-RULE-CONSIDERED-NOTED", 1, 0, false);
	declareFunction("ensure_transformation_rule_success_noted_internal", "ENSURE-TRANSFORMATION-RULE-SUCCESS-NOTED-INTERNAL", 1, 0, false);
	declareFunction("ensure_transformation_rule_success_noted", "ENSURE-TRANSFORMATION-RULE-SUCCESS-NOTED", 1, 0, false);
	declareFunction("problem_store_janitor_print_function_trampoline", "PROBLEM-STORE-JANITOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
	declareFunction("problem_store_janitor_p", "PROBLEM-STORE-JANITOR-P", 1, 0, false);
	new $problem_store_janitor_p$UnaryFunction();
	declareFunction("prob_store_janitor_store", "PROB-STORE-JANITOR-STORE", 1, 0, false);
	declareFunction("prob_store_janitor_indestructible_problems", "PROB-STORE-JANITOR-INDESTRUCTIBLE-PROBLEMS", 1, 0, false);
	declareFunction("prob_store_janitor_staleP", "PROB-STORE-JANITOR-STALE?", 1, 0, false);
	declareFunction("_csetf_prob_store_janitor_store", "_CSETF-PROB-STORE-JANITOR-STORE", 2, 0, false);
	declareFunction("_csetf_prob_store_janitor_indestructible_problems", "_CSETF-PROB-STORE-JANITOR-INDESTRUCTIBLE-PROBLEMS", 2, 0, false);
	declareFunction("_csetf_prob_store_janitor_staleP", "_CSETF-PROB-STORE-JANITOR-STALE?", 2, 0, false);
	declareFunction("make_problem_store_janitor", "MAKE-PROBLEM-STORE-JANITOR", 0, 1, false);
	declareFunction("new_problem_store_janitor", "NEW-PROBLEM-STORE-JANITOR", 1, 0, false);
	declareFunction("destroy_problem_store_janitor", "DESTROY-PROBLEM-STORE-JANITOR", 1, 0, false);
	declareFunction("problem_store_janitor_store", "PROBLEM-STORE-JANITOR-STORE", 1, 0, false);
	declareFunction("problem_store_janitor_staleP", "PROBLEM-STORE-JANITOR-STALE?", 1, 0, false);
	declareFunction("problem_store_janitor_indestructible_problems", "PROBLEM-STORE-JANITOR-INDESTRUCTIBLE-PROBLEMS", 1, 0, false);
	declareMacro("do_problem_store_janitor_indestructible_problems", "DO-PROBLEM-STORE-JANITOR-INDESTRUCTIBLE-PROBLEMS");
	declareMacro("do_problem_store_janitor_destructible_problems", "DO-PROBLEM-STORE-JANITOR-DESTRUCTIBLE-PROBLEMS");
	declareFunction("problem_store_janitor_indestructible_problem_count", "PROBLEM-STORE-JANITOR-INDESTRUCTIBLE-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_janitor_destructible_problem_count", "PROBLEM-STORE-JANITOR-DESTRUCTIBLE-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_janitor_note_stale", "PROBLEM-STORE-JANITOR-NOTE-STALE", 1, 0, false);
	declareFunction("problem_store_janitor_note_unstale", "PROBLEM-STORE-JANITOR-NOTE-UNSTALE", 1, 0, false);
	declareFunction("problem_store_janitor_note_problem_indestructible", "PROBLEM-STORE-JANITOR-NOTE-PROBLEM-INDESTRUCTIBLE", 2, 0, false);
	declareFunction("problem_store_janitor_note_problem_destructible", "PROBLEM-STORE-JANITOR-NOTE-PROBLEM-DESTRUCTIBLE", 2, 0, false);
	declareFunction("problem_store_name", "PROBLEM-STORE-NAME", 1, 0, false);
	declareFunction("find_problem_store_by_name", "FIND-PROBLEM-STORE-BY-NAME", 1, 0, false);
	declareFunction("find_or_create_problem_store_by_name", "FIND-OR-CREATE-PROBLEM-STORE-BY-NAME", 1, 1, false);
	declareFunction("destroy_problem_store_by_name", "DESTROY-PROBLEM-STORE-BY-NAME", 1, 0, false);
	declareFunction("rename_problem_store", "RENAME-PROBLEM-STORE", 2, 0, false);
	declareFunction("set_problem_store_name", "SET-PROBLEM-STORE-NAME", 2, 0, false);
	declareFunction("free_problem_store_name", "FREE-PROBLEM-STORE-NAME", 1, 0, false);
	declareFunction("problem_store_properties", "PROBLEM-STORE-PROPERTIES", 1, 0, false);
	declareFunction("problem_store_property_value", "PROBLEM-STORE-PROPERTY-VALUE", 2, 0, false);
	declareFunction("test_problem_store_property_value_support", "TEST-PROBLEM-STORE-PROPERTY-VALUE-SUPPORT", 0, 0, false);
	return NIL;
    }

    public static SubLObject declare_inference_datastructures_problem_store_file() {
	if (SubLFiles.USE_V1) {
	    declareFunction("new_problem_store_id", "NEW-PROBLEM-STORE-ID", 0, 0, false);
	    declareFunction("index_problem_store_by_id", "INDEX-PROBLEM-STORE-BY-ID", 2, 0, false);
	    declareFunction("unindex_problem_store_by_id", "UNINDEX-PROBLEM-STORE-BY-ID", 1, 0, false);
	    declareFunction("find_problem_store_by_id", "FIND-PROBLEM-STORE-BY-ID", 1, 0, false);
	    declareFunction("problem_store_count", "PROBLEM-STORE-COUNT", 0, 0, false);
	    declareFunction("problem_store_next_id", "PROBLEM-STORE-NEXT-ID", 0, 0, false);
	    declareFunction("most_recent_problem_store", "MOST-RECENT-PROBLEM-STORE", 0, 0, false);
	    declareMacro("do_all_problem_stores", "DO-ALL-PROBLEM-STORES");
	    declareFunction("problem_store_id_index", "PROBLEM-STORE-ID-INDEX", 0, 0, false);
	    declareFunction("all_problem_stores", "ALL-PROBLEM-STORES", 0, 0, false);
	    declareFunction("destroy_all_problem_stores", "DESTROY-ALL-PROBLEM-STORES", 0, 0, false);
	    declareFunction("destroy_most_problem_stores", "DESTROY-MOST-PROBLEM-STORES", 0, 1, false);
	    declareFunction("problem_store_print_function_trampoline", "PROBLEM-STORE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
	    declareFunction("problem_store_p", "PROBLEM-STORE-P", 1, 0, false);
	    new $problem_store_p$UnaryFunction();
	    declareFunction("prob_store_guid", "PROB-STORE-GUID", 1, 0, false);
	    declareFunction("prob_store_suid", "PROB-STORE-SUID", 1, 0, false);
	    declareFunction("prob_store_lock", "PROB-STORE-LOCK", 1, 0, false);
	    declareFunction("prob_store_creation_time", "PROB-STORE-CREATION-TIME", 1, 0, false);
	    declareFunction("prob_store_inference_id_index", "PROB-STORE-INFERENCE-ID-INDEX", 1, 0, false);
	    declareFunction("prob_store_strategy_id_index", "PROB-STORE-STRATEGY-ID-INDEX", 1, 0, false);
	    declareFunction("prob_store_problem_id_index", "PROB-STORE-PROBLEM-ID-INDEX", 1, 0, false);
	    declareFunction("prob_store_link_id_index", "PROB-STORE-LINK-ID-INDEX", 1, 0, false);
	    declareFunction("prob_store_proof_id_index", "PROB-STORE-PROOF-ID-INDEX", 1, 0, false);
	    declareFunction("prob_store_problems_by_query_index", "PROB-STORE-PROBLEMS-BY-QUERY-INDEX", 1, 0, false);
	    declareFunction("prob_store_rejected_proofs", "PROB-STORE-REJECTED-PROOFS", 1, 0, false);
	    declareFunction("prob_store_processed_proofs", "PROB-STORE-PROCESSED-PROOFS", 1, 0, false);
	    declareFunction("prob_store_potentially_processed_problems", "PROB-STORE-POTENTIALLY-PROCESSED-PROBLEMS", 1, 0, false);
	    declareFunction("prob_store_non_explanatory_subproofs_possibleP", "PROB-STORE-NON-EXPLANATORY-SUBPROOFS-POSSIBLE?", 1, 0, false);
	    declareFunction("prob_store_non_explanatory_subproofs_index", "PROB-STORE-NON-EXPLANATORY-SUBPROOFS-INDEX", 1, 0, false);
	    declareFunction("prob_store_most_recent_tactic_executed", "PROB-STORE-MOST-RECENT-TACTIC-EXECUTED", 1, 0, false);
	    declareFunction("prob_store_min_proof_depth_index", "PROB-STORE-MIN-PROOF-DEPTH-INDEX", 1, 0, false);
	    declareFunction("prob_store_min_transformation_depth_index", "PROB-STORE-MIN-TRANSFORMATION-DEPTH-INDEX", 1, 0, false);
	    declareFunction("prob_store_min_transformation_depth_signature_index", "PROB-STORE-MIN-TRANSFORMATION-DEPTH-SIGNATURE-INDEX", 1, 0, false);
	    declareFunction("prob_store_min_depth_index", "PROB-STORE-MIN-DEPTH-INDEX", 1, 0, false);
	    declareFunction("prob_store_equality_reasoning_method", "PROB-STORE-EQUALITY-REASONING-METHOD", 1, 0, false);
	    declareFunction("prob_store_equality_reasoning_domain", "PROB-STORE-EQUALITY-REASONING-DOMAIN", 1, 0, false);
	    declareFunction("prob_store_intermediate_step_validation_level", "PROB-STORE-INTERMEDIATE-STEP-VALIDATION-LEVEL", 1, 0, false);
	    declareFunction("prob_store_max_problem_count", "PROB-STORE-MAX-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("prob_store_crazy_max_problem_count", "PROB-STORE-CRAZY-MAX-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("prob_store_removal_allowedP", "PROB-STORE-REMOVAL-ALLOWED?", 1, 0, false);
	    declareFunction("prob_store_transformation_allowedP", "PROB-STORE-TRANSFORMATION-ALLOWED?", 1, 0, false);
	    declareFunction("prob_store_add_restriction_layer_of_indirectionP", "PROB-STORE-ADD-RESTRICTION-LAYER-OF-INDIRECTION?", 1, 0, false);
	    declareFunction("prob_store_negation_by_failureP", "PROB-STORE-NEGATION-BY-FAILURE?", 1, 0, false);
	    declareFunction("prob_store_completeness_minimization_allowedP", "PROB-STORE-COMPLETENESS-MINIMIZATION-ALLOWED?", 1, 0, false);
	    declareFunction("prob_store_direction", "PROB-STORE-DIRECTION", 1, 0, false);
	    declareFunction("prob_store_evaluate_subl_allowedP", "PROB-STORE-EVALUATE-SUBL-ALLOWED?", 1, 0, false);
	    declareFunction("prob_store_rewrite_allowedP", "PROB-STORE-REWRITE-ALLOWED?", 1, 0, false);
	    declareFunction("prob_store_abduction_allowedP", "PROB-STORE-ABDUCTION-ALLOWED?", 1, 0, false);
	    declareFunction("prob_store_new_terms_allowedP", "PROB-STORE-NEW-TERMS-ALLOWED?", 1, 0, false);
	    declareFunction("prob_store_compute_answer_justificationsP", "PROB-STORE-COMPUTE-ANSWER-JUSTIFICATIONS?", 1, 0, false);
	    declareFunction("prob_store_memoization_state", "PROB-STORE-MEMOIZATION-STATE", 1, 0, false);
	    declareFunction("prob_store_sbhl_resource_space", "PROB-STORE-SBHL-RESOURCE-SPACE", 1, 0, false);
	    declareFunction("prob_store_preparedP", "PROB-STORE-PREPARED?", 1, 0, false);
	    declareFunction("prob_store_destruction_imminentP", "PROB-STORE-DESTRUCTION-IMMINENT?", 1, 0, false);
	    declareFunction("prob_store_meta_problem_store", "PROB-STORE-META-PROBLEM-STORE", 1, 0, false);
	    declareFunction("prob_store_static_properties", "PROB-STORE-STATIC-PROPERTIES", 1, 0, false);
	    declareFunction("prob_store_janitor", "PROB-STORE-JANITOR", 1, 0, false);
	    declareFunction("prob_store_historical_root_problems", "PROB-STORE-HISTORICAL-ROOT-PROBLEMS", 1, 0, false);
	    declareFunction("prob_store_historical_tactic_count", "PROB-STORE-HISTORICAL-TACTIC-COUNT", 1, 0, false);
	    declareFunction("prob_store_complex_problem_query_czer_index", "PROB-STORE-COMPLEX-PROBLEM-QUERY-CZER-INDEX", 1, 0, false);
	    declareFunction("prob_store_complex_problem_query_signatures", "PROB-STORE-COMPLEX-PROBLEM-QUERY-SIGNATURES", 1, 0, false);
	    declareFunction("prob_store_proof_keeping_index", "PROB-STORE-PROOF-KEEPING-INDEX", 1, 0, false);
	    declareFunction("_csetf_prob_store_guid", "_CSETF-PROB-STORE-GUID", 2, 0, false);
	    declareFunction("_csetf_prob_store_suid", "_CSETF-PROB-STORE-SUID", 2, 0, false);
	    declareFunction("_csetf_prob_store_lock", "_CSETF-PROB-STORE-LOCK", 2, 0, false);
	    declareFunction("_csetf_prob_store_creation_time", "_CSETF-PROB-STORE-CREATION-TIME", 2, 0, false);
	    declareFunction("_csetf_prob_store_inference_id_index", "_CSETF-PROB-STORE-INFERENCE-ID-INDEX", 2, 0, false);
	    declareFunction("_csetf_prob_store_strategy_id_index", "_CSETF-PROB-STORE-STRATEGY-ID-INDEX", 2, 0, false);
	    declareFunction("_csetf_prob_store_problem_id_index", "_CSETF-PROB-STORE-PROBLEM-ID-INDEX", 2, 0, false);
	    declareFunction("_csetf_prob_store_link_id_index", "_CSETF-PROB-STORE-LINK-ID-INDEX", 2, 0, false);
	    declareFunction("_csetf_prob_store_proof_id_index", "_CSETF-PROB-STORE-PROOF-ID-INDEX", 2, 0, false);
	    declareFunction("_csetf_prob_store_problems_by_query_index", "_CSETF-PROB-STORE-PROBLEMS-BY-QUERY-INDEX", 2, 0, false);
	    declareFunction("_csetf_prob_store_rejected_proofs", "_CSETF-PROB-STORE-REJECTED-PROOFS", 2, 0, false);
	    declareFunction("_csetf_prob_store_processed_proofs", "_CSETF-PROB-STORE-PROCESSED-PROOFS", 2, 0, false);
	    declareFunction("_csetf_prob_store_potentially_processed_problems", "_CSETF-PROB-STORE-POTENTIALLY-PROCESSED-PROBLEMS", 2, 0, false);
	    declareFunction("_csetf_prob_store_non_explanatory_subproofs_possibleP", "_CSETF-PROB-STORE-NON-EXPLANATORY-SUBPROOFS-POSSIBLE?", 2, 0, false);
	    declareFunction("_csetf_prob_store_non_explanatory_subproofs_index", "_CSETF-PROB-STORE-NON-EXPLANATORY-SUBPROOFS-INDEX", 2, 0, false);
	    declareFunction("_csetf_prob_store_most_recent_tactic_executed", "_CSETF-PROB-STORE-MOST-RECENT-TACTIC-EXECUTED", 2, 0, false);
	    declareFunction("_csetf_prob_store_min_proof_depth_index", "_CSETF-PROB-STORE-MIN-PROOF-DEPTH-INDEX", 2, 0, false);
	    declareFunction("_csetf_prob_store_min_transformation_depth_index", "_CSETF-PROB-STORE-MIN-TRANSFORMATION-DEPTH-INDEX", 2, 0, false);
	    declareFunction("_csetf_prob_store_min_transformation_depth_signature_index", "_CSETF-PROB-STORE-MIN-TRANSFORMATION-DEPTH-SIGNATURE-INDEX", 2, 0, false);
	    declareFunction("_csetf_prob_store_min_depth_index", "_CSETF-PROB-STORE-MIN-DEPTH-INDEX", 2, 0, false);
	    declareFunction("_csetf_prob_store_equality_reasoning_method", "_CSETF-PROB-STORE-EQUALITY-REASONING-METHOD", 2, 0, false);
	    declareFunction("_csetf_prob_store_equality_reasoning_domain", "_CSETF-PROB-STORE-EQUALITY-REASONING-DOMAIN", 2, 0, false);
	    declareFunction("_csetf_prob_store_intermediate_step_validation_level", "_CSETF-PROB-STORE-INTERMEDIATE-STEP-VALIDATION-LEVEL", 2, 0, false);
	    declareFunction("_csetf_prob_store_max_problem_count", "_CSETF-PROB-STORE-MAX-PROBLEM-COUNT", 2, 0, false);
	    declareFunction("_csetf_prob_store_crazy_max_problem_count", "_CSETF-PROB-STORE-CRAZY-MAX-PROBLEM-COUNT", 2, 0, false);
	    declareFunction("_csetf_prob_store_removal_allowedP", "_CSETF-PROB-STORE-REMOVAL-ALLOWED?", 2, 0, false);
	    declareFunction("_csetf_prob_store_transformation_allowedP", "_CSETF-PROB-STORE-TRANSFORMATION-ALLOWED?", 2, 0, false);
	    declareFunction("_csetf_prob_store_add_restriction_layer_of_indirectionP", "_CSETF-PROB-STORE-ADD-RESTRICTION-LAYER-OF-INDIRECTION?", 2, 0, false);
	    declareFunction("_csetf_prob_store_negation_by_failureP", "_CSETF-PROB-STORE-NEGATION-BY-FAILURE?", 2, 0, false);
	    declareFunction("_csetf_prob_store_completeness_minimization_allowedP", "_CSETF-PROB-STORE-COMPLETENESS-MINIMIZATION-ALLOWED?", 2, 0, false);
	    declareFunction("_csetf_prob_store_direction", "_CSETF-PROB-STORE-DIRECTION", 2, 0, false);
	    declareFunction("_csetf_prob_store_evaluate_subl_allowedP", "_CSETF-PROB-STORE-EVALUATE-SUBL-ALLOWED?", 2, 0, false);
	    declareFunction("_csetf_prob_store_rewrite_allowedP", "_CSETF-PROB-STORE-REWRITE-ALLOWED?", 2, 0, false);
	    declareFunction("_csetf_prob_store_abduction_allowedP", "_CSETF-PROB-STORE-ABDUCTION-ALLOWED?", 2, 0, false);
	    declareFunction("_csetf_prob_store_new_terms_allowedP", "_CSETF-PROB-STORE-NEW-TERMS-ALLOWED?", 2, 0, false);
	    declareFunction("_csetf_prob_store_compute_answer_justificationsP", "_CSETF-PROB-STORE-COMPUTE-ANSWER-JUSTIFICATIONS?", 2, 0, false);
	    declareFunction("_csetf_prob_store_memoization_state", "_CSETF-PROB-STORE-MEMOIZATION-STATE", 2, 0, false);
	    declareFunction("_csetf_prob_store_sbhl_resource_space", "_CSETF-PROB-STORE-SBHL-RESOURCE-SPACE", 2, 0, false);
	    declareFunction("_csetf_prob_store_preparedP", "_CSETF-PROB-STORE-PREPARED?", 2, 0, false);
	    declareFunction("_csetf_prob_store_destruction_imminentP", "_CSETF-PROB-STORE-DESTRUCTION-IMMINENT?", 2, 0, false);
	    declareFunction("_csetf_prob_store_meta_problem_store", "_CSETF-PROB-STORE-META-PROBLEM-STORE", 2, 0, false);
	    declareFunction("_csetf_prob_store_static_properties", "_CSETF-PROB-STORE-STATIC-PROPERTIES", 2, 0, false);
	    declareFunction("_csetf_prob_store_janitor", "_CSETF-PROB-STORE-JANITOR", 2, 0, false);
	    declareFunction("_csetf_prob_store_historical_root_problems", "_CSETF-PROB-STORE-HISTORICAL-ROOT-PROBLEMS", 2, 0, false);
	    declareFunction("_csetf_prob_store_historical_tactic_count", "_CSETF-PROB-STORE-HISTORICAL-TACTIC-COUNT", 2, 0, false);
	    declareFunction("_csetf_prob_store_complex_problem_query_czer_index", "_CSETF-PROB-STORE-COMPLEX-PROBLEM-QUERY-CZER-INDEX", 2, 0, false);
	    declareFunction("_csetf_prob_store_complex_problem_query_signatures", "_CSETF-PROB-STORE-COMPLEX-PROBLEM-QUERY-SIGNATURES", 2, 0, false);
	    declareFunction("_csetf_prob_store_proof_keeping_index", "_CSETF-PROB-STORE-PROOF-KEEPING-INDEX", 2, 0, false);
	    declareFunction("make_problem_store", "MAKE-PROBLEM-STORE", 0, 1, false);
	    declareFunction("visit_defstruct_problem_store", "VISIT-DEFSTRUCT-PROBLEM-STORE", 2, 0, false);
	    declareFunction("visit_defstruct_object_problem_store_method", "VISIT-DEFSTRUCT-OBJECT-PROBLEM-STORE-METHOD", 2, 0, false);
	    declareFunction("valid_problem_store_p", "VALID-PROBLEM-STORE-P", 1, 0, false);
	    declareFunction("id_of_valid_problem_store_p", "ID-OF-VALID-PROBLEM-STORE-P", 1, 0, false);
	    declareFunction("problem_store_invalid_p", "PROBLEM-STORE-INVALID-P", 1, 0, false);
	    declareFunction("print_problem_store", "PRINT-PROBLEM-STORE", 3, 0, false);
	    declareFunction("sxhash_problem_store_method", "SXHASH-PROBLEM-STORE-METHOD", 1, 0, false);
	    declareMacro("with_problem_store_lock_held", "WITH-PROBLEM-STORE-LOCK-HELD");
	    declareFunction("problem_store_lock", "PROBLEM-STORE-LOCK", 1, 0, false);
	    declareMacro("with_problem_store_memoization_state", "WITH-PROBLEM-STORE-MEMOIZATION-STATE");
	    declareFunction("problem_store_memoization_state", "PROBLEM-STORE-MEMOIZATION-STATE", 1, 0, false);
	    declareMacro("with_problem_store_sbhl_resource_space", "WITH-PROBLEM-STORE-SBHL-RESOURCE-SPACE");
	    declareFunction("problem_store_sbhl_resource_space", "PROBLEM-STORE-SBHL-RESOURCE-SPACE", 1, 0, false);
	    declareFunction("set_problem_store_sbhl_resource_space", "SET-PROBLEM-STORE-SBHL-RESOURCE-SPACE", 2, 0, false);
	    declareMacro("with_problem_store_resourcing_and_memoization", "WITH-PROBLEM-STORE-RESOURCING-AND-MEMOIZATION");
	    declareMacro("do_problem_store_inferences", "DO-PROBLEM-STORE-INFERENCES");
	    declareFunction("problem_store_inference_id_index", "PROBLEM-STORE-INFERENCE-ID-INDEX", 1, 0, false);
	    declareMacro("do_problem_store_strategies", "DO-PROBLEM-STORE-STRATEGIES");
	    declareFunction("problem_store_strategy_id_index", "PROBLEM-STORE-STRATEGY-ID-INDEX", 1, 0, false);
	    declareMacro("do_problem_store_strategic_contexts", "DO-PROBLEM-STORE-STRATEGIC-CONTEXTS");
	    declareMacro("do_problem_store_problems", "DO-PROBLEM-STORE-PROBLEMS");
	    declareFunction("problem_store_problem_id_index", "PROBLEM-STORE-PROBLEM-ID-INDEX", 1, 0, false);
	    declareMacro("do_problem_store_links", "DO-PROBLEM-STORE-LINKS");
	    declareFunction("problem_store_link_id_index", "PROBLEM-STORE-LINK-ID-INDEX", 1, 0, false);
	    declareMacro("do_problem_store_proofs", "DO-PROBLEM-STORE-PROOFS");
	    declareFunction("problem_store_proof_id_index", "PROBLEM-STORE-PROOF-ID-INDEX", 1, 0, false);
	    declareMacro("do_problem_store_historical_root_problems", "DO-PROBLEM-STORE-HISTORICAL-ROOT-PROBLEMS");
	    declareFunction("problem_store_historical_root_problems", "PROBLEM-STORE-HISTORICAL-ROOT-PROBLEMS", 1, 0, false);
	    declareMacro("do_inference_strategies", "DO-INFERENCE-STRATEGIES");
	    declareFunction("new_problem_store", "NEW-PROBLEM-STORE", 0, 1, false);
	    declareFunction("destroy_problem_store", "DESTROY-PROBLEM-STORE", 1, 0, false);
	    declareFunction("destroy_problem_store_int", "DESTROY-PROBLEM-STORE-INT", 1, 0, false);
	    declareFunction("note_problem_store_invalid", "NOTE-PROBLEM-STORE-INVALID", 1, 0, false);
	    declareFunction("problem_store_guid", "PROBLEM-STORE-GUID", 1, 0, false);
	    declareFunction("problem_store_suid", "PROBLEM-STORE-SUID", 1, 0, false);
	    declareFunction("problem_store_creation_time", "PROBLEM-STORE-CREATION-TIME", 1, 0, false);
	    declareFunction("problem_store_rejected_proofs", "PROBLEM-STORE-REJECTED-PROOFS", 1, 0, false);
	    declareFunction("problem_store_processed_proofs", "PROBLEM-STORE-PROCESSED-PROOFS", 1, 0, false);
	    declareFunction("problem_store_potentially_processed_problems", "PROBLEM-STORE-POTENTIALLY-PROCESSED-PROBLEMS", 1, 0, false);
	    declareFunction("problem_store_non_explanatory_subproofs_possibleP", "PROBLEM-STORE-NON-EXPLANATORY-SUBPROOFS-POSSIBLE?", 1, 0, false);
	    declareFunction("problem_store_non_explanatory_subproofs_index", "PROBLEM-STORE-NON-EXPLANATORY-SUBPROOFS-INDEX", 1, 0, false);
	    declareFunction("problem_store_most_recent_tactic_executed", "PROBLEM-STORE-MOST-RECENT-TACTIC-EXECUTED", 1, 0, false);
	    declareFunction("problem_store_min_proof_depth_index", "PROBLEM-STORE-MIN-PROOF-DEPTH-INDEX", 1, 0, false);
	    declareFunction("problem_store_min_transformation_depth_index", "PROBLEM-STORE-MIN-TRANSFORMATION-DEPTH-INDEX", 1, 0, false);
	    declareFunction("problem_store_min_transformation_depth_signature_index", "PROBLEM-STORE-MIN-TRANSFORMATION-DEPTH-SIGNATURE-INDEX", 1, 0, false);
	    declareFunction("problem_store_min_depth_index", "PROBLEM-STORE-MIN-DEPTH-INDEX", 1, 0, false);
	    declareFunction("problem_store_equality_reasoning_method", "PROBLEM-STORE-EQUALITY-REASONING-METHOD", 1, 0, false);
	    declareFunction("problem_store_equality_reasoning_domain", "PROBLEM-STORE-EQUALITY-REASONING-DOMAIN", 1, 0, false);
	    declareFunction("problem_store_intermediate_step_validation_level", "PROBLEM-STORE-INTERMEDIATE-STEP-VALIDATION-LEVEL", 1, 0, false);
	    declareFunction("problem_store_max_problem_count", "PROBLEM-STORE-MAX-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_crazy_max_problem_count", "PROBLEM-STORE-CRAZY-MAX-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_removal_allowedP", "PROBLEM-STORE-REMOVAL-ALLOWED?", 1, 0, false);
	    declareFunction("problem_store_transformation_allowedP", "PROBLEM-STORE-TRANSFORMATION-ALLOWED?", 1, 0, false);
	    declareFunction("problem_store_add_restriction_layer_of_indirectionP", "PROBLEM-STORE-ADD-RESTRICTION-LAYER-OF-INDIRECTION?", 1, 0, false);
	    declareFunction("problem_store_negation_by_failureP", "PROBLEM-STORE-NEGATION-BY-FAILURE?", 1, 0, false);
	    declareFunction("problem_store_completeness_minimization_allowedP", "PROBLEM-STORE-COMPLETENESS-MINIMIZATION-ALLOWED?", 1, 0, false);
	    declareFunction("problem_store_direction", "PROBLEM-STORE-DIRECTION", 1, 0, false);
	    declareFunction("problem_store_evaluate_subl_allowedP", "PROBLEM-STORE-EVALUATE-SUBL-ALLOWED?", 1, 0, false);
	    declareFunction("problem_store_rewrite_allowedP", "PROBLEM-STORE-REWRITE-ALLOWED?", 1, 0, false);
	    declareFunction("problem_store_abduction_allowedP", "PROBLEM-STORE-ABDUCTION-ALLOWED?", 1, 0, false);
	    declareFunction("problem_store_new_terms_allowedP", "PROBLEM-STORE-NEW-TERMS-ALLOWED?", 1, 0, false);
	    declareFunction("problem_store_compute_answer_justificationsP", "PROBLEM-STORE-COMPUTE-ANSWER-JUSTIFICATIONS?", 1, 0, false);
	    declareFunction("problem_store_preparedP", "PROBLEM-STORE-PREPARED?", 1, 0, false);
	    declareFunction("problem_store_destruction_imminentP", "PROBLEM-STORE-DESTRUCTION-IMMINENT?", 1, 0, false);
	    declareFunction("problem_store_meta_problem_store", "PROBLEM-STORE-META-PROBLEM-STORE", 1, 0, false);
	    declareFunction("problem_store_static_properties", "PROBLEM-STORE-STATIC-PROPERTIES", 1, 0, false);
	    declareFunction("problem_store_janitor", "PROBLEM-STORE-JANITOR", 1, 0, false);
	    declareFunction("note_problem_store_most_recent_tactic_executed", "NOTE-PROBLEM-STORE-MOST-RECENT-TACTIC-EXECUTED", 2, 0, false);
	    declareFunction("set_problem_store_intermediate_step_validation_level", "SET-PROBLEM-STORE-INTERMEDIATE-STEP-VALIDATION-LEVEL", 2, 0, false);
	    declareFunction("set_problem_store_add_restriction_layer_of_indirectionP", "SET-PROBLEM-STORE-ADD-RESTRICTION-LAYER-OF-INDIRECTION?", 2, 0, false);
	    declareFunction("set_problem_store_transformation_allowedP", "SET-PROBLEM-STORE-TRANSFORMATION-ALLOWED?", 2, 0, false);
	    declareFunction("set_problem_store_removal_allowedP", "SET-PROBLEM-STORE-REMOVAL-ALLOWED?", 2, 0, false);
	    declareFunction("set_problem_store_new_terms_allowedP", "SET-PROBLEM-STORE-NEW-TERMS-ALLOWED?", 2, 0, false);
	    declareFunction("note_problem_store_prepared", "NOTE-PROBLEM-STORE-PREPARED", 1, 0, false);
	    declareFunction("note_problem_store_destruction_imminent", "NOTE-PROBLEM-STORE-DESTRUCTION-IMMINENT", 1, 0, false);
	    declareFunction("reset_problem_store_janitor", "RESET-PROBLEM-STORE-JANITOR", 1, 0, false);
	    declareFunction("problem_store_forwardP", "PROBLEM-STORE-FORWARD?", 1, 0, false);
	    declareFunction("problem_store_newP", "PROBLEM-STORE-NEW?", 1, 0, false);
	    declareFunction("new_problem_store_p", "NEW-PROBLEM-STORE-P", 1, 0, false);
	    declareFunction("problem_store_inference_count", "PROBLEM-STORE-INFERENCE-COUNT", 1, 0, false);
	    declareFunction("problem_store_non_recursive_inference_count", "PROBLEM-STORE-NON-RECURSIVE-INFERENCE-COUNT", 1, 0, false);
	    declareFunction("problem_store_has_only_one_inferenceP", "PROBLEM-STORE-HAS-ONLY-ONE-INFERENCE?", 1, 0, false);
	    declareFunction("problem_store_historical_inference_count", "PROBLEM-STORE-HISTORICAL-INFERENCE-COUNT", 1, 0, false);
	    declareFunction("find_inference_by_id", "FIND-INFERENCE-BY-ID", 2, 0, false);
	    declareFunction("find_inference_by_ids", "FIND-INFERENCE-BY-IDS", 2, 0, false);
	    declareFunction("first_problem_store_inference", "FIRST-PROBLEM-STORE-INFERENCE", 1, 0, false);
	    declareFunction("earliest_problem_store_inference", "EARLIEST-PROBLEM-STORE-INFERENCE", 1, 0, false);
	    declareFunction("latest_problem_store_inference", "LATEST-PROBLEM-STORE-INFERENCE", 1, 0, false);
	    declareFunction("problem_store_running_inferences", "PROBLEM-STORE-RUNNING-INFERENCES", 1, 0, false);
	    declareFunction("problem_store_privateP", "PROBLEM-STORE-PRIVATE?", 1, 0, false);
	    declareFunction("problem_store_strategy_count", "PROBLEM-STORE-STRATEGY-COUNT", 1, 0, false);
	    declareFunction("problem_store_historical_strategy_count", "PROBLEM-STORE-HISTORICAL-STRATEGY-COUNT", 1, 0, false);
	    declareFunction("problem_store_strategies", "PROBLEM-STORE-STRATEGIES", 1, 0, false);
	    declareFunction("find_strategy_by_id", "FIND-STRATEGY-BY-ID", 2, 0, false);
	    declareFunction("find_strategy_by_ids", "FIND-STRATEGY-BY-IDS", 2, 0, false);
	    declareFunction("first_problem_store_strategy", "FIRST-PROBLEM-STORE-STRATEGY", 1, 0, false);
	    declareFunction("problem_store_obvious_strategic_context", "PROBLEM-STORE-OBVIOUS-STRATEGIC-CONTEXT", 1, 0, false);
	    declareFunction("problem_store_unique_balancing_tactician", "PROBLEM-STORE-UNIQUE-BALANCING-TACTICIAN", 1, 0, false);
	    declareFunction("problem_store_link_count", "PROBLEM-STORE-LINK-COUNT", 1, 0, false);
	    declareFunction("problem_store_historical_link_count", "PROBLEM-STORE-HISTORICAL-LINK-COUNT", 1, 0, false);
	    declareFunction("find_problem_link_by_id", "FIND-PROBLEM-LINK-BY-ID", 2, 0, false);
	    declareFunction("find_problem_link_by_ids", "FIND-PROBLEM-LINK-BY-IDS", 2, 0, false);
	    declareFunction("problem_store_first_link_of_type", "PROBLEM-STORE-FIRST-LINK-OF-TYPE", 2, 0, false);
	    declareFunction("problem_store_link_type_count", "PROBLEM-STORE-LINK-TYPE-COUNT", 2, 0, false);
	    declareFunction("problem_store_content_link_count", "PROBLEM-STORE-CONTENT-LINK-COUNT", 1, 0, false);
	    declareFunction("problem_store_answer_link_count", "PROBLEM-STORE-ANSWER-LINK-COUNT", 1, 0, false);
	    declareFunction("problem_store_removal_link_count", "PROBLEM-STORE-REMOVAL-LINK-COUNT", 1, 0, false);
	    declareFunction("problem_store_conjunctive_removal_link_count", "PROBLEM-STORE-CONJUNCTIVE-REMOVAL-LINK-COUNT", 1, 0, false);
	    declareFunction("problem_store_transformation_link_count", "PROBLEM-STORE-TRANSFORMATION-LINK-COUNT", 1, 0, false);
	    declareFunction("problem_store_rewrite_link_count", "PROBLEM-STORE-REWRITE-LINK-COUNT", 1, 0, false);
	    declareFunction("problem_store_structural_link_count", "PROBLEM-STORE-STRUCTURAL-LINK-COUNT", 1, 0, false);
	    declareFunction("problem_store_join_ordered_link_count", "PROBLEM-STORE-JOIN-ORDERED-LINK-COUNT", 1, 0, false);
	    declareFunction("problem_store_join_link_count", "PROBLEM-STORE-JOIN-LINK-COUNT", 1, 0, false);
	    declareFunction("problem_store_split_link_count", "PROBLEM-STORE-SPLIT-LINK-COUNT", 1, 0, false);
	    declareFunction("problem_store_restriction_link_count", "PROBLEM-STORE-RESTRICTION-LINK-COUNT", 1, 0, false);
	    declareFunction("problem_store_residual_transformation_link_count", "PROBLEM-STORE-RESIDUAL-TRANSFORMATION-LINK-COUNT", 1, 0, false);
	    declareFunction("problem_store_union_link_count", "PROBLEM-STORE-UNION-LINK-COUNT", 1, 0, false);
	    declareFunction("problem_store_unmanifested_non_focal_count", "PROBLEM-STORE-UNMANIFESTED-NON-FOCAL-COUNT", 1, 0, false);
	    declareFunction("problem_store_problem_count", "PROBLEM-STORE-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_historical_problem_count", "PROBLEM-STORE-HISTORICAL-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_emptyP", "PROBLEM-STORE-EMPTY?", 1, 0, false);
	    declareFunction("compute_crazy_max_problem_count", "COMPUTE-CRAZY-MAX-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_max_problem_count_reachedP", "PROBLEM-STORE-MAX-PROBLEM-COUNT-REACHED?", 1, 0, false);
	    declareFunction("problem_store_max_proof_count_reachedP", "PROBLEM-STORE-MAX-PROOF-COUNT-REACHED?", 1, 0, false);
	    declareFunction("problem_store_crazy_max_problem_count_exactly_reachedP", "PROBLEM-STORE-CRAZY-MAX-PROBLEM-COUNT-EXACTLY-REACHED?", 1, 0, false);
	    declareFunction("problem_store_crazy_max_problem_count_reachedP", "PROBLEM-STORE-CRAZY-MAX-PROBLEM-COUNT-REACHED?", 1, 0, false);
	    declareFunction("problem_store_allows_proof_processingP", "PROBLEM-STORE-ALLOWS-PROOF-PROCESSING?", 1, 0, false);
	    declareFunction("problem_store_allows_problem_hl_free_vars_optimizationP", "PROBLEM-STORE-ALLOWS-PROBLEM-HL-FREE-VARS-OPTIMIZATION?", 1, 0, false);
	    declareFunction("problem_store_allows_problem_hl_free_vars_optimizationP_int_internal", "PROBLEM-STORE-ALLOWS-PROBLEM-HL-FREE-VARS-OPTIMIZATION?-INT-INTERNAL", 1, 0, false);
	    declareFunction("problem_store_allows_problem_hl_free_vars_optimizationP_int", "PROBLEM-STORE-ALLOWS-PROBLEM-HL-FREE-VARS-OPTIMIZATION?-INT", 1, 0, false);
	    declareFunction("problem_identity_depends_on_free_hl_varsP", "PROBLEM-IDENTITY-DEPENDS-ON-FREE-HL-VARS?", 1, 0, false);
	    declareFunction("find_problem_by_id", "FIND-PROBLEM-BY-ID", 2, 0, false);
	    declareFunction("find_problem_by_ids", "FIND-PROBLEM-BY-IDS", 2, 0, false);
	    declareFunction("find_problem_by_query", "FIND-PROBLEM-BY-QUERY", 2, 1, false);
	    declareFunction("problem_store_tactical_problem_count", "PROBLEM-STORE-TACTICAL-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_unexamined_problem_count", "PROBLEM-STORE-UNEXAMINED-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_examined_problem_count", "PROBLEM-STORE-EXAMINED-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_possible_problem_count", "PROBLEM-STORE-POSSIBLE-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_pending_problem_count", "PROBLEM-STORE-PENDING-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_finished_problem_count", "PROBLEM-STORE-FINISHED-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_good_problem_count", "PROBLEM-STORE-GOOD-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_neutral_problem_count", "PROBLEM-STORE-NEUTRAL-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_no_good_problem_count", "PROBLEM-STORE-NO-GOOD-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_single_literal_problem_count", "PROBLEM-STORE-SINGLE-LITERAL-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_conjunctive_problem_count", "PROBLEM-STORE-CONJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_join_problem_count", "PROBLEM-STORE-JOIN-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_split_problem_count", "PROBLEM-STORE-SPLIT-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_disjunctive_problem_count", "PROBLEM-STORE-DISJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_unexamined_good_problem_count", "PROBLEM-STORE-UNEXAMINED-GOOD-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_examined_good_problem_count", "PROBLEM-STORE-EXAMINED-GOOD-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_possible_good_problem_count", "PROBLEM-STORE-POSSIBLE-GOOD-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_pending_good_problem_count", "PROBLEM-STORE-PENDING-GOOD-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_finished_good_problem_count", "PROBLEM-STORE-FINISHED-GOOD-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_unexamined_neutral_problem_count", "PROBLEM-STORE-UNEXAMINED-NEUTRAL-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_examined_neutral_problem_count", "PROBLEM-STORE-EXAMINED-NEUTRAL-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_possible_neutral_problem_count", "PROBLEM-STORE-POSSIBLE-NEUTRAL-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_pending_neutral_problem_count", "PROBLEM-STORE-PENDING-NEUTRAL-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_finished_neutral_problem_count", "PROBLEM-STORE-FINISHED-NEUTRAL-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_unexamined_no_good_problem_count", "PROBLEM-STORE-UNEXAMINED-NO-GOOD-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_examined_no_good_problem_count", "PROBLEM-STORE-EXAMINED-NO-GOOD-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_possible_no_good_problem_count", "PROBLEM-STORE-POSSIBLE-NO-GOOD-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_pending_no_good_problem_count", "PROBLEM-STORE-PENDING-NO-GOOD-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_finished_no_good_problem_count", "PROBLEM-STORE-FINISHED-NO-GOOD-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_good_single_literal_problem_count", "PROBLEM-STORE-GOOD-SINGLE-LITERAL-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_good_conjunctive_problem_count", "PROBLEM-STORE-GOOD-CONJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_good_join_problem_count", "PROBLEM-STORE-GOOD-JOIN-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_good_split_problem_count", "PROBLEM-STORE-GOOD-SPLIT-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_good_disjunctive_problem_count", "PROBLEM-STORE-GOOD-DISJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_neutral_single_literal_problem_count", "PROBLEM-STORE-NEUTRAL-SINGLE-LITERAL-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_neutral_conjunctive_problem_count", "PROBLEM-STORE-NEUTRAL-CONJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_neutral_join_problem_count", "PROBLEM-STORE-NEUTRAL-JOIN-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_neutral_split_problem_count", "PROBLEM-STORE-NEUTRAL-SPLIT-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_neutral_disjunctive_problem_count", "PROBLEM-STORE-NEUTRAL-DISJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_no_good_single_literal_problem_count", "PROBLEM-STORE-NO-GOOD-SINGLE-LITERAL-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_no_good_conjunctive_problem_count", "PROBLEM-STORE-NO-GOOD-CONJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_no_good_join_problem_count", "PROBLEM-STORE-NO-GOOD-JOIN-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_no_good_split_problem_count", "PROBLEM-STORE-NO-GOOD-SPLIT-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_no_good_disjunctive_problem_count", "PROBLEM-STORE-NO-GOOD-DISJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_unexamined_single_literal_problem_count", "PROBLEM-STORE-UNEXAMINED-SINGLE-LITERAL-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_unexamined_conjunctive_problem_count", "PROBLEM-STORE-UNEXAMINED-CONJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_unexamined_join_problem_count", "PROBLEM-STORE-UNEXAMINED-JOIN-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_unexamined_split_problem_count", "PROBLEM-STORE-UNEXAMINED-SPLIT-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_unexamined_disjunctive_problem_count", "PROBLEM-STORE-UNEXAMINED-DISJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_examined_single_literal_problem_count", "PROBLEM-STORE-EXAMINED-SINGLE-LITERAL-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_examined_conjunctive_problem_count", "PROBLEM-STORE-EXAMINED-CONJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_examined_join_problem_count", "PROBLEM-STORE-EXAMINED-JOIN-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_examined_split_problem_count", "PROBLEM-STORE-EXAMINED-SPLIT-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_examined_disjunctive_problem_count", "PROBLEM-STORE-EXAMINED-DISJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_possible_single_literal_problem_count", "PROBLEM-STORE-POSSIBLE-SINGLE-LITERAL-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_possible_conjunctive_problem_count", "PROBLEM-STORE-POSSIBLE-CONJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_possible_join_problem_count", "PROBLEM-STORE-POSSIBLE-JOIN-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_possible_split_problem_count", "PROBLEM-STORE-POSSIBLE-SPLIT-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_possible_disjunctive_problem_count", "PROBLEM-STORE-POSSIBLE-DISJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_pending_single_literal_problem_count", "PROBLEM-STORE-PENDING-SINGLE-LITERAL-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_pending_conjunctive_problem_count", "PROBLEM-STORE-PENDING-CONJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_pending_join_problem_count", "PROBLEM-STORE-PENDING-JOIN-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_pending_split_problem_count", "PROBLEM-STORE-PENDING-SPLIT-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_pending_disjunctive_problem_count", "PROBLEM-STORE-PENDING-DISJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_finished_single_literal_problem_count", "PROBLEM-STORE-FINISHED-SINGLE-LITERAL-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_finished_conjunctive_problem_count", "PROBLEM-STORE-FINISHED-CONJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_finished_join_problem_count", "PROBLEM-STORE-FINISHED-JOIN-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_finished_split_problem_count", "PROBLEM-STORE-FINISHED-SPLIT-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_finished_disjunctive_problem_count", "PROBLEM-STORE-FINISHED-DISJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_executed_removal_tactic_productivities", "PROBLEM-STORE-EXECUTED-REMOVAL-TACTIC-PRODUCTIVITIES", 1, 0, false);
	    declareFunction("problem_store_tactic_with_status_count", "PROBLEM-STORE-TACTIC-WITH-STATUS-COUNT", 1, 1, false);
	    declareFunction("problem_store_tactic_of_type_with_status_count", "PROBLEM-STORE-TACTIC-OF-TYPE-WITH-STATUS-COUNT", 1, 2, false);
	    declareFunction("problem_store_tactic_count", "PROBLEM-STORE-TACTIC-COUNT", 1, 0, false);
	    declareFunction("problem_store_historical_tactic_count", "PROBLEM-STORE-HISTORICAL-TACTIC-COUNT", 1, 0, false);
	    declareFunction("problem_store_increment_historical_tactic_count", "PROBLEM-STORE-INCREMENT-HISTORICAL-TACTIC-COUNT", 1, 0, false);
	    declareFunction("problem_store_possible_tactic_count", "PROBLEM-STORE-POSSIBLE-TACTIC-COUNT", 1, 0, false);
	    declareFunction("problem_store_executed_tactic_count", "PROBLEM-STORE-EXECUTED-TACTIC-COUNT", 1, 0, false);
	    declareFunction("problem_store_discarded_tactic_count", "PROBLEM-STORE-DISCARDED-TACTIC-COUNT", 1, 0, false);
	    declareFunction("problem_store_proof_count", "PROBLEM-STORE-PROOF-COUNT", 1, 0, false);
	    declareFunction("problem_store_historical_proof_count", "PROBLEM-STORE-HISTORICAL-PROOF-COUNT", 1, 0, false);
	    declareFunction("find_proof_by_id", "FIND-PROOF-BY-ID", 2, 0, false);
	    declareFunction("find_proof_by_ids", "FIND-PROOF-BY-IDS", 2, 0, false);
	    declareFunction("problem_store_some_rejected_proofsP", "PROBLEM-STORE-SOME-REJECTED-PROOFS?", 1, 0, false);
	    declareFunction("problem_store_rejected_proof_count", "PROBLEM-STORE-REJECTED-PROOF-COUNT", 1, 0, false);
	    declareFunction("problem_store_proven_proof_count", "PROBLEM-STORE-PROVEN-PROOF-COUNT", 1, 0, false);
	    declareFunction("problem_store_all_processed_proofs", "PROBLEM-STORE-ALL-PROCESSED-PROOFS", 1, 0, false);
	    declareFunction("problem_store_all_potentially_processed_problems", "PROBLEM-STORE-ALL-POTENTIALLY-PROCESSED-PROBLEMS", 1, 0, false);
	    declareFunction("problem_store_has_some_non_explanatory_subproofP", "PROBLEM-STORE-HAS-SOME-NON-EXPLANATORY-SUBPROOF?", 1, 0, false);
	    declareFunction("problem_store_proof_non_explanatory_subproofs", "PROBLEM-STORE-PROOF-NON-EXPLANATORY-SUBPROOFS", 2, 0, false);
	    declareFunction("problem_store_size", "PROBLEM-STORE-SIZE", 1, 0, false);
	    declareFunction("problem_store_historical_size", "PROBLEM-STORE-HISTORICAL-SIZE", 1, 0, false);
	    declareFunction("total_size_of_all_problem_stores", "TOTAL-SIZE-OF-ALL-PROBLEM-STORES", 0, 0, false);
	    declareFunction("total_size_of_all_historical_problem_stores", "TOTAL-SIZE-OF-ALL-HISTORICAL-PROBLEM-STORES", 0, 0, false);
	    declareFunction("problem_store_dependent_link_count", "PROBLEM-STORE-DEPENDENT-LINK-COUNT", 1, 0, false);
	    declareFunction("problem_store_most_recent_transformation_link", "PROBLEM-STORE-MOST-RECENT-TRANSFORMATION-LINK", 1, 0, false);
	    declareFunction("problem_store_transformation_rules", "PROBLEM-STORE-TRANSFORMATION-RULES", 1, 0, false);
	    declareFunction("problem_store_all_non_focal_problems", "PROBLEM-STORE-ALL-NON-FOCAL-PROBLEMS", 1, 0, false);
	    declareFunction("problem_store_could_recompute_destructiblesP", "PROBLEM-STORE-COULD-RECOMPUTE-DESTRUCTIBLES?", 1, 0, false);
	    declareFunction("problem_store_could_remove_destructiblesP", "PROBLEM-STORE-COULD-REMOVE-DESTRUCTIBLES?", 1, 0, false);
	    declareFunction("problem_stores_similarP", "PROBLEM-STORES-SIMILAR?", 2, 0, false);
	    declareFunction("problem_store_transformation_rule_bindings_to_closed", "PROBLEM-STORE-TRANSFORMATION-RULE-BINDINGS-TO-CLOSED", 1, 0, false);
	    declareFunction("problem_store_all_problems", "PROBLEM-STORE-ALL-PROBLEMS", 1, 0, false);
	    declareFunction("problem_store_all_problem_queries", "PROBLEM-STORE-ALL-PROBLEM-QUERIES", 1, 0, false);
	    declareFunction("problem_store_all_problem_links", "PROBLEM-STORE-ALL-PROBLEM-LINKS", 1, 0, false);
	    declareFunction("problem_store_all_proofs", "PROBLEM-STORE-ALL-PROOFS", 1, 0, false);
	    declareFunction("problem_store_historical_root_problemP", "PROBLEM-STORE-HISTORICAL-ROOT-PROBLEM?", 2, 0, false);
	    declareFunction("problem_store_historical_root_problem_count", "PROBLEM-STORE-HISTORICAL-ROOT-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_problem_with_complex_problem_queryP", "PROBLEM-STORE-PROBLEM-WITH-COMPLEX-PROBLEM-QUERY?", 2, 0, false);
	    declareFunction("problem_store_complex_problem_query_signature", "PROBLEM-STORE-COMPLEX-PROBLEM-QUERY-SIGNATURE", 2, 0, false);
	    declareFunction("problem_store_find_complex_problem_query", "PROBLEM-STORE-FIND-COMPLEX-PROBLEM-QUERY", 3, 0, false);
	    declareFunction("clear_problem_store_proof_keeping_problems", "CLEAR-PROBLEM-STORE-PROOF-KEEPING-PROBLEMS", 1, 0, false);
	    declareFunction("problem_proof_keeping_status", "PROBLEM-PROOF-KEEPING-STATUS", 1, 0, false);
	    declareFunction("proof_keeping_problemP", "PROOF-KEEPING-PROBLEM?", 1, 0, false);
	    declareFunction("non_proof_keeping_problemP", "NON-PROOF-KEEPING-PROBLEM?", 1, 0, false);
	    declareFunction("unknown_proof_keeping_problemP", "UNKNOWN-PROOF-KEEPING-PROBLEM?", 1, 0, false);
	    declareFunction("note_proof_keeping_problem", "NOTE-PROOF-KEEPING-PROBLEM", 2, 0, false);
	    declareFunction("note_not_proof_keeping_problem", "NOTE-NOT-PROOF-KEEPING-PROBLEM", 1, 0, false);
	    declareFunction("problem_store_prepare_for_expected_problem_count", "PROBLEM-STORE-PREPARE-FOR-EXPECTED-PROBLEM-COUNT", 2, 0, false);
	    declareFunction("problem_store_prepare_for_expected_link_count", "PROBLEM-STORE-PREPARE-FOR-EXPECTED-LINK-COUNT", 2, 0, false);
	    declareFunction("problem_store_prepare_for_expected_proof_count", "PROBLEM-STORE-PREPARE-FOR-EXPECTED-PROOF-COUNT", 2, 0, false);
	    declareFunction("problem_store_new_inference_id", "PROBLEM-STORE-NEW-INFERENCE-ID", 1, 0, false);
	    declareFunction("problem_store_new_strategy_id", "PROBLEM-STORE-NEW-STRATEGY-ID", 1, 0, false);
	    declareFunction("problem_store_new_problem_id", "PROBLEM-STORE-NEW-PROBLEM-ID", 1, 0, false);
	    declareFunction("problem_store_new_link_id", "PROBLEM-STORE-NEW-LINK-ID", 1, 0, false);
	    declareFunction("problem_store_new_proof_id", "PROBLEM-STORE-NEW-PROOF-ID", 1, 0, false);
	    declareFunction("add_problem_store_inference", "ADD-PROBLEM-STORE-INFERENCE", 2, 0, false);
	    declareFunction("remove_problem_store_inference", "REMOVE-PROBLEM-STORE-INFERENCE", 2, 0, false);
	    declareFunction("add_problem_store_strategy", "ADD-PROBLEM-STORE-STRATEGY", 2, 0, false);
	    declareFunction("remove_problem_store_strategy", "REMOVE-PROBLEM-STORE-STRATEGY", 2, 0, false);
	    declareFunction("add_problem_store_problem_by_id", "ADD-PROBLEM-STORE-PROBLEM-BY-ID", 2, 0, false);
	    declareFunction("remove_problem_store_problem_by_id", "REMOVE-PROBLEM-STORE-PROBLEM-BY-ID", 2, 0, false);
	    declareFunction("add_problem_store_problem_by_query", "ADD-PROBLEM-STORE-PROBLEM-BY-QUERY", 2, 0, false);
	    declareFunction("remove_problem_store_problem_by_query", "REMOVE-PROBLEM-STORE-PROBLEM-BY-QUERY", 2, 0, false);
	    declareFunction("add_problem_store_link", "ADD-PROBLEM-STORE-LINK", 2, 0, false);
	    declareFunction("remove_problem_store_link", "REMOVE-PROBLEM-STORE-LINK", 2, 0, false);
	    declareFunction("add_problem_store_proof", "ADD-PROBLEM-STORE-PROOF", 2, 0, false);
	    declareFunction("remove_problem_store_proof", "REMOVE-PROBLEM-STORE-PROOF", 2, 0, false);
	    declareFunction("problem_store_forget_that_proof_is_rejected", "PROBLEM-STORE-FORGET-THAT-PROOF-IS-REJECTED", 2, 0, false);
	    declareFunction("problem_store_note_proof_processed", "PROBLEM-STORE-NOTE-PROOF-PROCESSED", 2, 0, false);
	    declareFunction("problem_store_note_proof_unprocessed", "PROBLEM-STORE-NOTE-PROOF-UNPROCESSED", 2, 0, false);
	    declareFunction("problem_store_note_problem_potentially_processed", "PROBLEM-STORE-NOTE-PROBLEM-POTENTIALLY-PROCESSED", 2, 0, false);
	    declareFunction("problem_store_note_problem_unprocessed", "PROBLEM-STORE-NOTE-PROBLEM-UNPROCESSED", 2, 0, false);
	    declareFunction("problem_store_note_non_explanatory_subproofs_possible", "PROBLEM-STORE-NOTE-NON-EXPLANATORY-SUBPROOFS-POSSIBLE", 1, 0, false);
	    declareFunction("problem_store_note_non_explanatory_subproof", "PROBLEM-STORE-NOTE-NON-EXPLANATORY-SUBPROOF", 3, 0, false);
	    declareFunction("proof_note_non_explanatory_subproof", "PROOF-NOTE-NON-EXPLANATORY-SUBPROOF", 2, 0, false);
	    declareFunction("reset_problem_store_min_depth_index", "RESET-PROBLEM-STORE-MIN-DEPTH-INDEX", 1, 0, false);
	    declareFunction("problem_store_min_proof_depth_index_remove_inference", "PROBLEM-STORE-MIN-PROOF-DEPTH-INDEX-REMOVE-INFERENCE", 2, 0, false);
	    declareFunction("problem_store_min_transformation_depth_index_remove_inference", "PROBLEM-STORE-MIN-TRANSFORMATION-DEPTH-INDEX-REMOVE-INFERENCE", 2, 0, false);
	    declareFunction("problem_store_min_transformation_depth_signature_index_remove_inference", "PROBLEM-STORE-MIN-TRANSFORMATION-DEPTH-SIGNATURE-INDEX-REMOVE-INFERENCE", 2, 0, false);
	    declareFunction("add_problem_store_historical_root_problem", "ADD-PROBLEM-STORE-HISTORICAL-ROOT-PROBLEM", 2, 0, false);
	    declareFunction("remove_problem_store_historical_root_problem", "REMOVE-PROBLEM-STORE-HISTORICAL-ROOT-PROBLEM", 2, 0, false);
	    declareFunction("finalize_problem_store_properties", "FINALIZE-PROBLEM-STORE-PROPERTIES", 1, 0, false);
	    declareFunction("add_problem_store_complex_problem", "ADD-PROBLEM-STORE-COMPLEX-PROBLEM", 2, 0, false);
	    declareFunction("remove_problem_store_complex_problem", "REMOVE-PROBLEM-STORE-COMPLEX-PROBLEM", 2, 0, false);
	    declareFunction("add_problem_store_problem", "ADD-PROBLEM-STORE-PROBLEM", 2, 0, false);
	    declareFunction("remove_problem_store_problem", "REMOVE-PROBLEM-STORE-PROBLEM", 2, 0, false);
	    declareFunction("remove_problem_wrt_reuse", "REMOVE-PROBLEM-WRT-REUSE", 2, 0, false);
	    declareFunction("problem_store_note_transformation_rule_considered", "PROBLEM-STORE-NOTE-TRANSFORMATION-RULE-CONSIDERED", 2, 0, false);
	    declareFunction("problem_store_note_transformation_rule_success", "PROBLEM-STORE-NOTE-TRANSFORMATION-RULE-SUCCESS", 2, 0, false);
	    declareFunction("ensure_transformation_rule_considered_noted_internal", "ENSURE-TRANSFORMATION-RULE-CONSIDERED-NOTED-INTERNAL", 1, 0, false);
	    declareFunction("ensure_transformation_rule_considered_noted", "ENSURE-TRANSFORMATION-RULE-CONSIDERED-NOTED", 1, 0, false);
	    declareFunction("ensure_transformation_rule_success_noted_internal", "ENSURE-TRANSFORMATION-RULE-SUCCESS-NOTED-INTERNAL", 1, 0, false);
	    declareFunction("ensure_transformation_rule_success_noted", "ENSURE-TRANSFORMATION-RULE-SUCCESS-NOTED", 1, 0, false);
	    declareFunction("problem_store_janitor_print_function_trampoline", "PROBLEM-STORE-JANITOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
	    declareFunction("problem_store_janitor_p", "PROBLEM-STORE-JANITOR-P", 1, 0, false);
	    new $problem_store_janitor_p$UnaryFunction();
	    declareFunction("prob_store_janitor_store", "PROB-STORE-JANITOR-STORE", 1, 0, false);
	    declareFunction("prob_store_janitor_indestructible_problems", "PROB-STORE-JANITOR-INDESTRUCTIBLE-PROBLEMS", 1, 0, false);
	    declareFunction("prob_store_janitor_staleP", "PROB-STORE-JANITOR-STALE?", 1, 0, false);
	    declareFunction("_csetf_prob_store_janitor_store", "_CSETF-PROB-STORE-JANITOR-STORE", 2, 0, false);
	    declareFunction("_csetf_prob_store_janitor_indestructible_problems", "_CSETF-PROB-STORE-JANITOR-INDESTRUCTIBLE-PROBLEMS", 2, 0, false);
	    declareFunction("_csetf_prob_store_janitor_staleP", "_CSETF-PROB-STORE-JANITOR-STALE?", 2, 0, false);
	    declareFunction("make_problem_store_janitor", "MAKE-PROBLEM-STORE-JANITOR", 0, 1, false);
	    declareFunction("visit_defstruct_problem_store_janitor", "VISIT-DEFSTRUCT-PROBLEM-STORE-JANITOR", 2, 0, false);
	    declareFunction("visit_defstruct_object_problem_store_janitor_method", "VISIT-DEFSTRUCT-OBJECT-PROBLEM-STORE-JANITOR-METHOD", 2, 0, false);
	    declareFunction("new_problem_store_janitor", "NEW-PROBLEM-STORE-JANITOR", 1, 0, false);
	    declareFunction("destroy_problem_store_janitor", "DESTROY-PROBLEM-STORE-JANITOR", 1, 0, false);
	    declareFunction("problem_store_janitor_store", "PROBLEM-STORE-JANITOR-STORE", 1, 0, false);
	    declareFunction("problem_store_janitor_staleP", "PROBLEM-STORE-JANITOR-STALE?", 1, 0, false);
	    declareFunction("problem_store_janitor_indestructible_problems", "PROBLEM-STORE-JANITOR-INDESTRUCTIBLE-PROBLEMS", 1, 0, false);
	    declareMacro("do_problem_store_janitor_indestructible_problems", "DO-PROBLEM-STORE-JANITOR-INDESTRUCTIBLE-PROBLEMS");
	    declareMacro("do_problem_store_janitor_destructible_problems", "DO-PROBLEM-STORE-JANITOR-DESTRUCTIBLE-PROBLEMS");
	    declareFunction("problem_store_janitor_indestructible_problem_count", "PROBLEM-STORE-JANITOR-INDESTRUCTIBLE-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_janitor_destructible_problem_count", "PROBLEM-STORE-JANITOR-DESTRUCTIBLE-PROBLEM-COUNT", 1, 0, false);
	    declareFunction("problem_store_janitor_note_stale", "PROBLEM-STORE-JANITOR-NOTE-STALE", 1, 0, false);
	    declareFunction("problem_store_janitor_note_unstale", "PROBLEM-STORE-JANITOR-NOTE-UNSTALE", 1, 0, false);
	    declareFunction("problem_store_janitor_note_problem_indestructible", "PROBLEM-STORE-JANITOR-NOTE-PROBLEM-INDESTRUCTIBLE", 2, 0, false);
	    declareFunction("problem_store_janitor_note_problem_destructible", "PROBLEM-STORE-JANITOR-NOTE-PROBLEM-DESTRUCTIBLE", 2, 0, false);
	    declareFunction("problem_store_name", "PROBLEM-STORE-NAME", 1, 0, false);
	    declareFunction("find_problem_store_by_name", "FIND-PROBLEM-STORE-BY-NAME", 1, 0, false);
	    declareFunction("find_or_create_problem_store_by_name", "FIND-OR-CREATE-PROBLEM-STORE-BY-NAME", 1, 1, false);
	    declareFunction("destroy_problem_store_by_name", "DESTROY-PROBLEM-STORE-BY-NAME", 1, 0, false);
	    declareFunction("rename_problem_store", "RENAME-PROBLEM-STORE", 2, 0, false);
	    declareFunction("set_problem_store_name", "SET-PROBLEM-STORE-NAME", 2, 0, false);
	    declareFunction("free_problem_store_name", "FREE-PROBLEM-STORE-NAME", 1, 0, false);
	    declareFunction("problem_store_properties", "PROBLEM-STORE-PROPERTIES", 1, 0, false);
	    declareFunction("problem_store_property_value", "PROBLEM-STORE-PROPERTY-VALUE", 2, 0, false);
	    declareFunction("possibly_optimize_problem_store", "POSSIBLY-OPTIMIZE-PROBLEM-STORE", 1, 0, false);
	    declareFunction("hashify_problem_storeP", "HASHIFY-PROBLEM-STORE?", 1, 0, false);
	    declareFunction("hashify_problem_store", "HASHIFY-PROBLEM-STORE", 1, 0, false);
	    declareFunction("test_problem_store_property_value_support", "TEST-PROBLEM-STORE-PROPERTY-VALUE-SUPPORT", 0, 0, false);
	}
	if (SubLFiles.USE_V2) {
	    declareFunction("prob_store_problem_by_query_index", "PROB-STORE-PROBLEM-BY-QUERY-INDEX", 1, 0, false);
	    declareFunction("_csetf_prob_store_problem_by_query_index", "_CSETF-PROB-STORE-PROBLEM-BY-QUERY-INDEX", 2, 0, false);
	    declareFunction("find_problem_by_query", "FIND-PROBLEM-BY-QUERY", 2, 0, false);
	    declareFunction("problem_store_find_complex_problem_query", "PROBLEM-STORE-FIND-COMPLEX-PROBLEM-QUERY", 2, 0, false);
	}
	return NIL;
    }

    public static SubLObject declare_inference_datastructures_problem_store_file_Previous() {
	declareFunction("new_problem_store_id", "NEW-PROBLEM-STORE-ID", 0, 0, false);
	declareFunction("index_problem_store_by_id", "INDEX-PROBLEM-STORE-BY-ID", 2, 0, false);
	declareFunction("unindex_problem_store_by_id", "UNINDEX-PROBLEM-STORE-BY-ID", 1, 0, false);
	declareFunction("find_problem_store_by_id", "FIND-PROBLEM-STORE-BY-ID", 1, 0, false);
	declareFunction("problem_store_count", "PROBLEM-STORE-COUNT", 0, 0, false);
	declareFunction("problem_store_next_id", "PROBLEM-STORE-NEXT-ID", 0, 0, false);
	declareFunction("most_recent_problem_store", "MOST-RECENT-PROBLEM-STORE", 0, 0, false);
	declareMacro("do_all_problem_stores", "DO-ALL-PROBLEM-STORES");
	declareFunction("problem_store_id_index", "PROBLEM-STORE-ID-INDEX", 0, 0, false);
	declareFunction("all_problem_stores", "ALL-PROBLEM-STORES", 0, 0, false);
	declareFunction("destroy_all_problem_stores", "DESTROY-ALL-PROBLEM-STORES", 0, 0, false);
	declareFunction("destroy_most_problem_stores", "DESTROY-MOST-PROBLEM-STORES", 0, 1, false);
	declareFunction("problem_store_print_function_trampoline", "PROBLEM-STORE-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
	declareFunction("problem_store_p", "PROBLEM-STORE-P", 1, 0, false);
	new $problem_store_p$UnaryFunction();
	declareFunction("prob_store_guid", "PROB-STORE-GUID", 1, 0, false);
	declareFunction("prob_store_suid", "PROB-STORE-SUID", 1, 0, false);
	declareFunction("prob_store_lock", "PROB-STORE-LOCK", 1, 0, false);
	declareFunction("prob_store_creation_time", "PROB-STORE-CREATION-TIME", 1, 0, false);
	declareFunction("prob_store_inference_id_index", "PROB-STORE-INFERENCE-ID-INDEX", 1, 0, false);
	declareFunction("prob_store_strategy_id_index", "PROB-STORE-STRATEGY-ID-INDEX", 1, 0, false);
	declareFunction("prob_store_problem_id_index", "PROB-STORE-PROBLEM-ID-INDEX", 1, 0, false);
	declareFunction("prob_store_link_id_index", "PROB-STORE-LINK-ID-INDEX", 1, 0, false);
	declareFunction("prob_store_proof_id_index", "PROB-STORE-PROOF-ID-INDEX", 1, 0, false);
	declareFunction("prob_store_problems_by_query_index", "PROB-STORE-PROBLEMS-BY-QUERY-INDEX", 1, 0, false);
	declareFunction("prob_store_rejected_proofs", "PROB-STORE-REJECTED-PROOFS", 1, 0, false);
	declareFunction("prob_store_processed_proofs", "PROB-STORE-PROCESSED-PROOFS", 1, 0, false);
	declareFunction("prob_store_potentially_processed_problems", "PROB-STORE-POTENTIALLY-PROCESSED-PROBLEMS", 1, 0, false);
	declareFunction("prob_store_non_explanatory_subproofs_possibleP", "PROB-STORE-NON-EXPLANATORY-SUBPROOFS-POSSIBLE?", 1, 0, false);
	declareFunction("prob_store_non_explanatory_subproofs_index", "PROB-STORE-NON-EXPLANATORY-SUBPROOFS-INDEX", 1, 0, false);
	declareFunction("prob_store_most_recent_tactic_executed", "PROB-STORE-MOST-RECENT-TACTIC-EXECUTED", 1, 0, false);
	declareFunction("prob_store_min_proof_depth_index", "PROB-STORE-MIN-PROOF-DEPTH-INDEX", 1, 0, false);
	declareFunction("prob_store_min_transformation_depth_index", "PROB-STORE-MIN-TRANSFORMATION-DEPTH-INDEX", 1, 0, false);
	declareFunction("prob_store_min_transformation_depth_signature_index", "PROB-STORE-MIN-TRANSFORMATION-DEPTH-SIGNATURE-INDEX", 1, 0, false);
	declareFunction("prob_store_min_depth_index", "PROB-STORE-MIN-DEPTH-INDEX", 1, 0, false);
	declareFunction("prob_store_equality_reasoning_method", "PROB-STORE-EQUALITY-REASONING-METHOD", 1, 0, false);
	declareFunction("prob_store_equality_reasoning_domain", "PROB-STORE-EQUALITY-REASONING-DOMAIN", 1, 0, false);
	declareFunction("prob_store_intermediate_step_validation_level", "PROB-STORE-INTERMEDIATE-STEP-VALIDATION-LEVEL", 1, 0, false);
	declareFunction("prob_store_max_problem_count", "PROB-STORE-MAX-PROBLEM-COUNT", 1, 0, false);
	declareFunction("prob_store_crazy_max_problem_count", "PROB-STORE-CRAZY-MAX-PROBLEM-COUNT", 1, 0, false);
	declareFunction("prob_store_removal_allowedP", "PROB-STORE-REMOVAL-ALLOWED?", 1, 0, false);
	declareFunction("prob_store_transformation_allowedP", "PROB-STORE-TRANSFORMATION-ALLOWED?", 1, 0, false);
	declareFunction("prob_store_add_restriction_layer_of_indirectionP", "PROB-STORE-ADD-RESTRICTION-LAYER-OF-INDIRECTION?", 1, 0, false);
	declareFunction("prob_store_negation_by_failureP", "PROB-STORE-NEGATION-BY-FAILURE?", 1, 0, false);
	declareFunction("prob_store_completeness_minimization_allowedP", "PROB-STORE-COMPLETENESS-MINIMIZATION-ALLOWED?", 1, 0, false);
	declareFunction("prob_store_direction", "PROB-STORE-DIRECTION", 1, 0, false);
	declareFunction("prob_store_evaluate_subl_allowedP", "PROB-STORE-EVALUATE-SUBL-ALLOWED?", 1, 0, false);
	declareFunction("prob_store_rewrite_allowedP", "PROB-STORE-REWRITE-ALLOWED?", 1, 0, false);
	declareFunction("prob_store_abduction_allowedP", "PROB-STORE-ABDUCTION-ALLOWED?", 1, 0, false);
	declareFunction("prob_store_new_terms_allowedP", "PROB-STORE-NEW-TERMS-ALLOWED?", 1, 0, false);
	declareFunction("prob_store_compute_answer_justificationsP", "PROB-STORE-COMPUTE-ANSWER-JUSTIFICATIONS?", 1, 0, false);
	declareFunction("prob_store_memoization_state", "PROB-STORE-MEMOIZATION-STATE", 1, 0, false);
	declareFunction("prob_store_sbhl_resource_space", "PROB-STORE-SBHL-RESOURCE-SPACE", 1, 0, false);
	declareFunction("prob_store_preparedP", "PROB-STORE-PREPARED?", 1, 0, false);
	declareFunction("prob_store_destruction_imminentP", "PROB-STORE-DESTRUCTION-IMMINENT?", 1, 0, false);
	declareFunction("prob_store_meta_problem_store", "PROB-STORE-META-PROBLEM-STORE", 1, 0, false);
	declareFunction("prob_store_static_properties", "PROB-STORE-STATIC-PROPERTIES", 1, 0, false);
	declareFunction("prob_store_janitor", "PROB-STORE-JANITOR", 1, 0, false);
	declareFunction("prob_store_historical_root_problems", "PROB-STORE-HISTORICAL-ROOT-PROBLEMS", 1, 0, false);
	declareFunction("prob_store_historical_tactic_count", "PROB-STORE-HISTORICAL-TACTIC-COUNT", 1, 0, false);
	declareFunction("prob_store_complex_problem_query_czer_index", "PROB-STORE-COMPLEX-PROBLEM-QUERY-CZER-INDEX", 1, 0, false);
	declareFunction("prob_store_complex_problem_query_signatures", "PROB-STORE-COMPLEX-PROBLEM-QUERY-SIGNATURES", 1, 0, false);
	declareFunction("prob_store_proof_keeping_index", "PROB-STORE-PROOF-KEEPING-INDEX", 1, 0, false);
	declareFunction("_csetf_prob_store_guid", "_CSETF-PROB-STORE-GUID", 2, 0, false);
	declareFunction("_csetf_prob_store_suid", "_CSETF-PROB-STORE-SUID", 2, 0, false);
	declareFunction("_csetf_prob_store_lock", "_CSETF-PROB-STORE-LOCK", 2, 0, false);
	declareFunction("_csetf_prob_store_creation_time", "_CSETF-PROB-STORE-CREATION-TIME", 2, 0, false);
	declareFunction("_csetf_prob_store_inference_id_index", "_CSETF-PROB-STORE-INFERENCE-ID-INDEX", 2, 0, false);
	declareFunction("_csetf_prob_store_strategy_id_index", "_CSETF-PROB-STORE-STRATEGY-ID-INDEX", 2, 0, false);
	declareFunction("_csetf_prob_store_problem_id_index", "_CSETF-PROB-STORE-PROBLEM-ID-INDEX", 2, 0, false);
	declareFunction("_csetf_prob_store_link_id_index", "_CSETF-PROB-STORE-LINK-ID-INDEX", 2, 0, false);
	declareFunction("_csetf_prob_store_proof_id_index", "_CSETF-PROB-STORE-PROOF-ID-INDEX", 2, 0, false);
	declareFunction("_csetf_prob_store_problems_by_query_index", "_CSETF-PROB-STORE-PROBLEMS-BY-QUERY-INDEX", 2, 0, false);
	declareFunction("_csetf_prob_store_rejected_proofs", "_CSETF-PROB-STORE-REJECTED-PROOFS", 2, 0, false);
	declareFunction("_csetf_prob_store_processed_proofs", "_CSETF-PROB-STORE-PROCESSED-PROOFS", 2, 0, false);
	declareFunction("_csetf_prob_store_potentially_processed_problems", "_CSETF-PROB-STORE-POTENTIALLY-PROCESSED-PROBLEMS", 2, 0, false);
	declareFunction("_csetf_prob_store_non_explanatory_subproofs_possibleP", "_CSETF-PROB-STORE-NON-EXPLANATORY-SUBPROOFS-POSSIBLE?", 2, 0, false);
	declareFunction("_csetf_prob_store_non_explanatory_subproofs_index", "_CSETF-PROB-STORE-NON-EXPLANATORY-SUBPROOFS-INDEX", 2, 0, false);
	declareFunction("_csetf_prob_store_most_recent_tactic_executed", "_CSETF-PROB-STORE-MOST-RECENT-TACTIC-EXECUTED", 2, 0, false);
	declareFunction("_csetf_prob_store_min_proof_depth_index", "_CSETF-PROB-STORE-MIN-PROOF-DEPTH-INDEX", 2, 0, false);
	declareFunction("_csetf_prob_store_min_transformation_depth_index", "_CSETF-PROB-STORE-MIN-TRANSFORMATION-DEPTH-INDEX", 2, 0, false);
	declareFunction("_csetf_prob_store_min_transformation_depth_signature_index", "_CSETF-PROB-STORE-MIN-TRANSFORMATION-DEPTH-SIGNATURE-INDEX", 2, 0, false);
	declareFunction("_csetf_prob_store_min_depth_index", "_CSETF-PROB-STORE-MIN-DEPTH-INDEX", 2, 0, false);
	declareFunction("_csetf_prob_store_equality_reasoning_method", "_CSETF-PROB-STORE-EQUALITY-REASONING-METHOD", 2, 0, false);
	declareFunction("_csetf_prob_store_equality_reasoning_domain", "_CSETF-PROB-STORE-EQUALITY-REASONING-DOMAIN", 2, 0, false);
	declareFunction("_csetf_prob_store_intermediate_step_validation_level", "_CSETF-PROB-STORE-INTERMEDIATE-STEP-VALIDATION-LEVEL", 2, 0, false);
	declareFunction("_csetf_prob_store_max_problem_count", "_CSETF-PROB-STORE-MAX-PROBLEM-COUNT", 2, 0, false);
	declareFunction("_csetf_prob_store_crazy_max_problem_count", "_CSETF-PROB-STORE-CRAZY-MAX-PROBLEM-COUNT", 2, 0, false);
	declareFunction("_csetf_prob_store_removal_allowedP", "_CSETF-PROB-STORE-REMOVAL-ALLOWED?", 2, 0, false);
	declareFunction("_csetf_prob_store_transformation_allowedP", "_CSETF-PROB-STORE-TRANSFORMATION-ALLOWED?", 2, 0, false);
	declareFunction("_csetf_prob_store_add_restriction_layer_of_indirectionP", "_CSETF-PROB-STORE-ADD-RESTRICTION-LAYER-OF-INDIRECTION?", 2, 0, false);
	declareFunction("_csetf_prob_store_negation_by_failureP", "_CSETF-PROB-STORE-NEGATION-BY-FAILURE?", 2, 0, false);
	declareFunction("_csetf_prob_store_completeness_minimization_allowedP", "_CSETF-PROB-STORE-COMPLETENESS-MINIMIZATION-ALLOWED?", 2, 0, false);
	declareFunction("_csetf_prob_store_direction", "_CSETF-PROB-STORE-DIRECTION", 2, 0, false);
	declareFunction("_csetf_prob_store_evaluate_subl_allowedP", "_CSETF-PROB-STORE-EVALUATE-SUBL-ALLOWED?", 2, 0, false);
	declareFunction("_csetf_prob_store_rewrite_allowedP", "_CSETF-PROB-STORE-REWRITE-ALLOWED?", 2, 0, false);
	declareFunction("_csetf_prob_store_abduction_allowedP", "_CSETF-PROB-STORE-ABDUCTION-ALLOWED?", 2, 0, false);
	declareFunction("_csetf_prob_store_new_terms_allowedP", "_CSETF-PROB-STORE-NEW-TERMS-ALLOWED?", 2, 0, false);
	declareFunction("_csetf_prob_store_compute_answer_justificationsP", "_CSETF-PROB-STORE-COMPUTE-ANSWER-JUSTIFICATIONS?", 2, 0, false);
	declareFunction("_csetf_prob_store_memoization_state", "_CSETF-PROB-STORE-MEMOIZATION-STATE", 2, 0, false);
	declareFunction("_csetf_prob_store_sbhl_resource_space", "_CSETF-PROB-STORE-SBHL-RESOURCE-SPACE", 2, 0, false);
	declareFunction("_csetf_prob_store_preparedP", "_CSETF-PROB-STORE-PREPARED?", 2, 0, false);
	declareFunction("_csetf_prob_store_destruction_imminentP", "_CSETF-PROB-STORE-DESTRUCTION-IMMINENT?", 2, 0, false);
	declareFunction("_csetf_prob_store_meta_problem_store", "_CSETF-PROB-STORE-META-PROBLEM-STORE", 2, 0, false);
	declareFunction("_csetf_prob_store_static_properties", "_CSETF-PROB-STORE-STATIC-PROPERTIES", 2, 0, false);
	declareFunction("_csetf_prob_store_janitor", "_CSETF-PROB-STORE-JANITOR", 2, 0, false);
	declareFunction("_csetf_prob_store_historical_root_problems", "_CSETF-PROB-STORE-HISTORICAL-ROOT-PROBLEMS", 2, 0, false);
	declareFunction("_csetf_prob_store_historical_tactic_count", "_CSETF-PROB-STORE-HISTORICAL-TACTIC-COUNT", 2, 0, false);
	declareFunction("_csetf_prob_store_complex_problem_query_czer_index", "_CSETF-PROB-STORE-COMPLEX-PROBLEM-QUERY-CZER-INDEX", 2, 0, false);
	declareFunction("_csetf_prob_store_complex_problem_query_signatures", "_CSETF-PROB-STORE-COMPLEX-PROBLEM-QUERY-SIGNATURES", 2, 0, false);
	declareFunction("_csetf_prob_store_proof_keeping_index", "_CSETF-PROB-STORE-PROOF-KEEPING-INDEX", 2, 0, false);
	declareFunction("make_problem_store", "MAKE-PROBLEM-STORE", 0, 1, false);
	declareFunction("visit_defstruct_problem_store", "VISIT-DEFSTRUCT-PROBLEM-STORE", 2, 0, false);
	declareFunction("visit_defstruct_object_problem_store_method", "VISIT-DEFSTRUCT-OBJECT-PROBLEM-STORE-METHOD", 2, 0, false);
	declareFunction("valid_problem_store_p", "VALID-PROBLEM-STORE-P", 1, 0, false);
	declareFunction("id_of_valid_problem_store_p", "ID-OF-VALID-PROBLEM-STORE-P", 1, 0, false);
	declareFunction("problem_store_invalid_p", "PROBLEM-STORE-INVALID-P", 1, 0, false);
	declareFunction("print_problem_store", "PRINT-PROBLEM-STORE", 3, 0, false);
	declareFunction("sxhash_problem_store_method", "SXHASH-PROBLEM-STORE-METHOD", 1, 0, false);
	declareMacro("with_problem_store_lock_held", "WITH-PROBLEM-STORE-LOCK-HELD");
	declareFunction("problem_store_lock", "PROBLEM-STORE-LOCK", 1, 0, false);
	declareMacro("with_problem_store_memoization_state", "WITH-PROBLEM-STORE-MEMOIZATION-STATE");
	declareFunction("problem_store_memoization_state", "PROBLEM-STORE-MEMOIZATION-STATE", 1, 0, false);
	declareMacro("with_problem_store_sbhl_resource_space", "WITH-PROBLEM-STORE-SBHL-RESOURCE-SPACE");
	declareFunction("problem_store_sbhl_resource_space", "PROBLEM-STORE-SBHL-RESOURCE-SPACE", 1, 0, false);
	declareFunction("set_problem_store_sbhl_resource_space", "SET-PROBLEM-STORE-SBHL-RESOURCE-SPACE", 2, 0, false);
	declareMacro("with_problem_store_resourcing_and_memoization", "WITH-PROBLEM-STORE-RESOURCING-AND-MEMOIZATION");
	declareMacro("do_problem_store_inferences", "DO-PROBLEM-STORE-INFERENCES");
	declareFunction("problem_store_inference_id_index", "PROBLEM-STORE-INFERENCE-ID-INDEX", 1, 0, false);
	declareMacro("do_problem_store_strategies", "DO-PROBLEM-STORE-STRATEGIES");
	declareFunction("problem_store_strategy_id_index", "PROBLEM-STORE-STRATEGY-ID-INDEX", 1, 0, false);
	declareMacro("do_problem_store_strategic_contexts", "DO-PROBLEM-STORE-STRATEGIC-CONTEXTS");
	declareMacro("do_problem_store_problems", "DO-PROBLEM-STORE-PROBLEMS");
	declareFunction("problem_store_problem_id_index", "PROBLEM-STORE-PROBLEM-ID-INDEX", 1, 0, false);
	declareMacro("do_problem_store_links", "DO-PROBLEM-STORE-LINKS");
	declareFunction("problem_store_link_id_index", "PROBLEM-STORE-LINK-ID-INDEX", 1, 0, false);
	declareMacro("do_problem_store_proofs", "DO-PROBLEM-STORE-PROOFS");
	declareFunction("problem_store_proof_id_index", "PROBLEM-STORE-PROOF-ID-INDEX", 1, 0, false);
	declareMacro("do_problem_store_historical_root_problems", "DO-PROBLEM-STORE-HISTORICAL-ROOT-PROBLEMS");
	declareFunction("problem_store_historical_root_problems", "PROBLEM-STORE-HISTORICAL-ROOT-PROBLEMS", 1, 0, false);
	declareMacro("do_inference_strategies", "DO-INFERENCE-STRATEGIES");
	declareFunction("new_problem_store", "NEW-PROBLEM-STORE", 0, 1, false);
	declareFunction("destroy_problem_store", "DESTROY-PROBLEM-STORE", 1, 0, false);
	declareFunction("destroy_problem_store_int", "DESTROY-PROBLEM-STORE-INT", 1, 0, false);
	declareFunction("note_problem_store_invalid", "NOTE-PROBLEM-STORE-INVALID", 1, 0, false);
	declareFunction("problem_store_guid", "PROBLEM-STORE-GUID", 1, 0, false);
	declareFunction("problem_store_suid", "PROBLEM-STORE-SUID", 1, 0, false);
	declareFunction("problem_store_creation_time", "PROBLEM-STORE-CREATION-TIME", 1, 0, false);
	declareFunction("problem_store_rejected_proofs", "PROBLEM-STORE-REJECTED-PROOFS", 1, 0, false);
	declareFunction("problem_store_processed_proofs", "PROBLEM-STORE-PROCESSED-PROOFS", 1, 0, false);
	declareFunction("problem_store_potentially_processed_problems", "PROBLEM-STORE-POTENTIALLY-PROCESSED-PROBLEMS", 1, 0, false);
	declareFunction("problem_store_non_explanatory_subproofs_possibleP", "PROBLEM-STORE-NON-EXPLANATORY-SUBPROOFS-POSSIBLE?", 1, 0, false);
	declareFunction("problem_store_non_explanatory_subproofs_index", "PROBLEM-STORE-NON-EXPLANATORY-SUBPROOFS-INDEX", 1, 0, false);
	declareFunction("problem_store_most_recent_tactic_executed", "PROBLEM-STORE-MOST-RECENT-TACTIC-EXECUTED", 1, 0, false);
	declareFunction("problem_store_min_proof_depth_index", "PROBLEM-STORE-MIN-PROOF-DEPTH-INDEX", 1, 0, false);
	declareFunction("problem_store_min_transformation_depth_index", "PROBLEM-STORE-MIN-TRANSFORMATION-DEPTH-INDEX", 1, 0, false);
	declareFunction("problem_store_min_transformation_depth_signature_index", "PROBLEM-STORE-MIN-TRANSFORMATION-DEPTH-SIGNATURE-INDEX", 1, 0, false);
	declareFunction("problem_store_min_depth_index", "PROBLEM-STORE-MIN-DEPTH-INDEX", 1, 0, false);
	declareFunction("problem_store_equality_reasoning_method", "PROBLEM-STORE-EQUALITY-REASONING-METHOD", 1, 0, false);
	declareFunction("problem_store_equality_reasoning_domain", "PROBLEM-STORE-EQUALITY-REASONING-DOMAIN", 1, 0, false);
	declareFunction("problem_store_intermediate_step_validation_level", "PROBLEM-STORE-INTERMEDIATE-STEP-VALIDATION-LEVEL", 1, 0, false);
	declareFunction("problem_store_max_problem_count", "PROBLEM-STORE-MAX-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_crazy_max_problem_count", "PROBLEM-STORE-CRAZY-MAX-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_removal_allowedP", "PROBLEM-STORE-REMOVAL-ALLOWED?", 1, 0, false);
	declareFunction("problem_store_transformation_allowedP", "PROBLEM-STORE-TRANSFORMATION-ALLOWED?", 1, 0, false);
	declareFunction("problem_store_add_restriction_layer_of_indirectionP", "PROBLEM-STORE-ADD-RESTRICTION-LAYER-OF-INDIRECTION?", 1, 0, false);
	declareFunction("problem_store_negation_by_failureP", "PROBLEM-STORE-NEGATION-BY-FAILURE?", 1, 0, false);
	declareFunction("problem_store_completeness_minimization_allowedP", "PROBLEM-STORE-COMPLETENESS-MINIMIZATION-ALLOWED?", 1, 0, false);
	declareFunction("problem_store_direction", "PROBLEM-STORE-DIRECTION", 1, 0, false);
	declareFunction("problem_store_evaluate_subl_allowedP", "PROBLEM-STORE-EVALUATE-SUBL-ALLOWED?", 1, 0, false);
	declareFunction("problem_store_rewrite_allowedP", "PROBLEM-STORE-REWRITE-ALLOWED?", 1, 0, false);
	declareFunction("problem_store_abduction_allowedP", "PROBLEM-STORE-ABDUCTION-ALLOWED?", 1, 0, false);
	declareFunction("problem_store_new_terms_allowedP", "PROBLEM-STORE-NEW-TERMS-ALLOWED?", 1, 0, false);
	declareFunction("problem_store_compute_answer_justificationsP", "PROBLEM-STORE-COMPUTE-ANSWER-JUSTIFICATIONS?", 1, 0, false);
	declareFunction("problem_store_preparedP", "PROBLEM-STORE-PREPARED?", 1, 0, false);
	declareFunction("problem_store_destruction_imminentP", "PROBLEM-STORE-DESTRUCTION-IMMINENT?", 1, 0, false);
	declareFunction("problem_store_meta_problem_store", "PROBLEM-STORE-META-PROBLEM-STORE", 1, 0, false);
	declareFunction("problem_store_static_properties", "PROBLEM-STORE-STATIC-PROPERTIES", 1, 0, false);
	declareFunction("problem_store_janitor", "PROBLEM-STORE-JANITOR", 1, 0, false);
	declareFunction("note_problem_store_most_recent_tactic_executed", "NOTE-PROBLEM-STORE-MOST-RECENT-TACTIC-EXECUTED", 2, 0, false);
	declareFunction("set_problem_store_intermediate_step_validation_level", "SET-PROBLEM-STORE-INTERMEDIATE-STEP-VALIDATION-LEVEL", 2, 0, false);
	declareFunction("set_problem_store_add_restriction_layer_of_indirectionP", "SET-PROBLEM-STORE-ADD-RESTRICTION-LAYER-OF-INDIRECTION?", 2, 0, false);
	declareFunction("set_problem_store_transformation_allowedP", "SET-PROBLEM-STORE-TRANSFORMATION-ALLOWED?", 2, 0, false);
	declareFunction("set_problem_store_removal_allowedP", "SET-PROBLEM-STORE-REMOVAL-ALLOWED?", 2, 0, false);
	declareFunction("set_problem_store_new_terms_allowedP", "SET-PROBLEM-STORE-NEW-TERMS-ALLOWED?", 2, 0, false);
	declareFunction("note_problem_store_prepared", "NOTE-PROBLEM-STORE-PREPARED", 1, 0, false);
	declareFunction("note_problem_store_destruction_imminent", "NOTE-PROBLEM-STORE-DESTRUCTION-IMMINENT", 1, 0, false);
	declareFunction("reset_problem_store_janitor", "RESET-PROBLEM-STORE-JANITOR", 1, 0, false);
	declareFunction("problem_store_forwardP", "PROBLEM-STORE-FORWARD?", 1, 0, false);
	declareFunction("problem_store_newP", "PROBLEM-STORE-NEW?", 1, 0, false);
	declareFunction("new_problem_store_p", "NEW-PROBLEM-STORE-P", 1, 0, false);
	declareFunction("problem_store_inference_count", "PROBLEM-STORE-INFERENCE-COUNT", 1, 0, false);
	declareFunction("problem_store_non_recursive_inference_count", "PROBLEM-STORE-NON-RECURSIVE-INFERENCE-COUNT", 1, 0, false);
	declareFunction("problem_store_has_only_one_inferenceP", "PROBLEM-STORE-HAS-ONLY-ONE-INFERENCE?", 1, 0, false);
	declareFunction("problem_store_historical_inference_count", "PROBLEM-STORE-HISTORICAL-INFERENCE-COUNT", 1, 0, false);
	declareFunction("find_inference_by_id", "FIND-INFERENCE-BY-ID", 2, 0, false);
	declareFunction("find_inference_by_ids", "FIND-INFERENCE-BY-IDS", 2, 0, false);
	declareFunction("first_problem_store_inference", "FIRST-PROBLEM-STORE-INFERENCE", 1, 0, false);
	declareFunction("earliest_problem_store_inference", "EARLIEST-PROBLEM-STORE-INFERENCE", 1, 0, false);
	declareFunction("latest_problem_store_inference", "LATEST-PROBLEM-STORE-INFERENCE", 1, 0, false);
	declareFunction("problem_store_running_inferences", "PROBLEM-STORE-RUNNING-INFERENCES", 1, 0, false);
	declareFunction("problem_store_privateP", "PROBLEM-STORE-PRIVATE?", 1, 0, false);
	declareFunction("problem_store_strategy_count", "PROBLEM-STORE-STRATEGY-COUNT", 1, 0, false);
	declareFunction("problem_store_historical_strategy_count", "PROBLEM-STORE-HISTORICAL-STRATEGY-COUNT", 1, 0, false);
	declareFunction("problem_store_strategies", "PROBLEM-STORE-STRATEGIES", 1, 0, false);
	declareFunction("find_strategy_by_id", "FIND-STRATEGY-BY-ID", 2, 0, false);
	declareFunction("find_strategy_by_ids", "FIND-STRATEGY-BY-IDS", 2, 0, false);
	declareFunction("first_problem_store_strategy", "FIRST-PROBLEM-STORE-STRATEGY", 1, 0, false);
	declareFunction("problem_store_obvious_strategic_context", "PROBLEM-STORE-OBVIOUS-STRATEGIC-CONTEXT", 1, 0, false);
	declareFunction("problem_store_unique_balancing_tactician", "PROBLEM-STORE-UNIQUE-BALANCING-TACTICIAN", 1, 0, false);
	declareFunction("problem_store_link_count", "PROBLEM-STORE-LINK-COUNT", 1, 0, false);
	declareFunction("problem_store_historical_link_count", "PROBLEM-STORE-HISTORICAL-LINK-COUNT", 1, 0, false);
	declareFunction("find_problem_link_by_id", "FIND-PROBLEM-LINK-BY-ID", 2, 0, false);
	declareFunction("find_problem_link_by_ids", "FIND-PROBLEM-LINK-BY-IDS", 2, 0, false);
	declareFunction("problem_store_first_link_of_type", "PROBLEM-STORE-FIRST-LINK-OF-TYPE", 2, 0, false);
	declareFunction("problem_store_link_type_count", "PROBLEM-STORE-LINK-TYPE-COUNT", 2, 0, false);
	declareFunction("problem_store_content_link_count", "PROBLEM-STORE-CONTENT-LINK-COUNT", 1, 0, false);
	declareFunction("problem_store_answer_link_count", "PROBLEM-STORE-ANSWER-LINK-COUNT", 1, 0, false);
	declareFunction("problem_store_removal_link_count", "PROBLEM-STORE-REMOVAL-LINK-COUNT", 1, 0, false);
	declareFunction("problem_store_conjunctive_removal_link_count", "PROBLEM-STORE-CONJUNCTIVE-REMOVAL-LINK-COUNT", 1, 0, false);
	declareFunction("problem_store_transformation_link_count", "PROBLEM-STORE-TRANSFORMATION-LINK-COUNT", 1, 0, false);
	declareFunction("problem_store_rewrite_link_count", "PROBLEM-STORE-REWRITE-LINK-COUNT", 1, 0, false);
	declareFunction("problem_store_structural_link_count", "PROBLEM-STORE-STRUCTURAL-LINK-COUNT", 1, 0, false);
	declareFunction("problem_store_join_ordered_link_count", "PROBLEM-STORE-JOIN-ORDERED-LINK-COUNT", 1, 0, false);
	declareFunction("problem_store_join_link_count", "PROBLEM-STORE-JOIN-LINK-COUNT", 1, 0, false);
	declareFunction("problem_store_split_link_count", "PROBLEM-STORE-SPLIT-LINK-COUNT", 1, 0, false);
	declareFunction("problem_store_restriction_link_count", "PROBLEM-STORE-RESTRICTION-LINK-COUNT", 1, 0, false);
	declareFunction("problem_store_residual_transformation_link_count", "PROBLEM-STORE-RESIDUAL-TRANSFORMATION-LINK-COUNT", 1, 0, false);
	declareFunction("problem_store_union_link_count", "PROBLEM-STORE-UNION-LINK-COUNT", 1, 0, false);
	declareFunction("problem_store_unmanifested_non_focal_count", "PROBLEM-STORE-UNMANIFESTED-NON-FOCAL-COUNT", 1, 0, false);
	declareFunction("problem_store_problem_count", "PROBLEM-STORE-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_historical_problem_count", "PROBLEM-STORE-HISTORICAL-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_emptyP", "PROBLEM-STORE-EMPTY?", 1, 0, false);
	declareFunction("compute_crazy_max_problem_count", "COMPUTE-CRAZY-MAX-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_max_problem_count_reachedP", "PROBLEM-STORE-MAX-PROBLEM-COUNT-REACHED?", 1, 0, false);
	declareFunction("problem_store_max_proof_count_reachedP", "PROBLEM-STORE-MAX-PROOF-COUNT-REACHED?", 1, 0, false);
	declareFunction("problem_store_crazy_max_problem_count_exactly_reachedP", "PROBLEM-STORE-CRAZY-MAX-PROBLEM-COUNT-EXACTLY-REACHED?", 1, 0, false);
	declareFunction("problem_store_crazy_max_problem_count_reachedP", "PROBLEM-STORE-CRAZY-MAX-PROBLEM-COUNT-REACHED?", 1, 0, false);
	declareFunction("problem_store_allows_proof_processingP", "PROBLEM-STORE-ALLOWS-PROOF-PROCESSING?", 1, 0, false);
	declareFunction("problem_store_allows_problem_hl_free_vars_optimizationP", "PROBLEM-STORE-ALLOWS-PROBLEM-HL-FREE-VARS-OPTIMIZATION?", 1, 0, false);
	declareFunction("problem_store_allows_problem_hl_free_vars_optimizationP_int_internal", "PROBLEM-STORE-ALLOWS-PROBLEM-HL-FREE-VARS-OPTIMIZATION?-INT-INTERNAL", 1, 0, false);
	declareFunction("problem_store_allows_problem_hl_free_vars_optimizationP_int", "PROBLEM-STORE-ALLOWS-PROBLEM-HL-FREE-VARS-OPTIMIZATION?-INT", 1, 0, false);
	declareFunction("problem_identity_depends_on_free_hl_varsP", "PROBLEM-IDENTITY-DEPENDS-ON-FREE-HL-VARS?", 1, 0, false);
	declareFunction("find_problem_by_id", "FIND-PROBLEM-BY-ID", 2, 0, false);
	declareFunction("find_problem_by_ids", "FIND-PROBLEM-BY-IDS", 2, 0, false);
	declareFunction("find_problem_by_query", "FIND-PROBLEM-BY-QUERY", 2, 1, false);
	declareFunction("problem_store_tactical_problem_count", "PROBLEM-STORE-TACTICAL-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_unexamined_problem_count", "PROBLEM-STORE-UNEXAMINED-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_examined_problem_count", "PROBLEM-STORE-EXAMINED-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_possible_problem_count", "PROBLEM-STORE-POSSIBLE-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_pending_problem_count", "PROBLEM-STORE-PENDING-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_finished_problem_count", "PROBLEM-STORE-FINISHED-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_good_problem_count", "PROBLEM-STORE-GOOD-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_neutral_problem_count", "PROBLEM-STORE-NEUTRAL-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_no_good_problem_count", "PROBLEM-STORE-NO-GOOD-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_single_literal_problem_count", "PROBLEM-STORE-SINGLE-LITERAL-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_conjunctive_problem_count", "PROBLEM-STORE-CONJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_join_problem_count", "PROBLEM-STORE-JOIN-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_split_problem_count", "PROBLEM-STORE-SPLIT-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_disjunctive_problem_count", "PROBLEM-STORE-DISJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_unexamined_good_problem_count", "PROBLEM-STORE-UNEXAMINED-GOOD-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_examined_good_problem_count", "PROBLEM-STORE-EXAMINED-GOOD-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_possible_good_problem_count", "PROBLEM-STORE-POSSIBLE-GOOD-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_pending_good_problem_count", "PROBLEM-STORE-PENDING-GOOD-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_finished_good_problem_count", "PROBLEM-STORE-FINISHED-GOOD-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_unexamined_neutral_problem_count", "PROBLEM-STORE-UNEXAMINED-NEUTRAL-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_examined_neutral_problem_count", "PROBLEM-STORE-EXAMINED-NEUTRAL-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_possible_neutral_problem_count", "PROBLEM-STORE-POSSIBLE-NEUTRAL-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_pending_neutral_problem_count", "PROBLEM-STORE-PENDING-NEUTRAL-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_finished_neutral_problem_count", "PROBLEM-STORE-FINISHED-NEUTRAL-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_unexamined_no_good_problem_count", "PROBLEM-STORE-UNEXAMINED-NO-GOOD-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_examined_no_good_problem_count", "PROBLEM-STORE-EXAMINED-NO-GOOD-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_possible_no_good_problem_count", "PROBLEM-STORE-POSSIBLE-NO-GOOD-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_pending_no_good_problem_count", "PROBLEM-STORE-PENDING-NO-GOOD-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_finished_no_good_problem_count", "PROBLEM-STORE-FINISHED-NO-GOOD-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_good_single_literal_problem_count", "PROBLEM-STORE-GOOD-SINGLE-LITERAL-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_good_conjunctive_problem_count", "PROBLEM-STORE-GOOD-CONJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_good_join_problem_count", "PROBLEM-STORE-GOOD-JOIN-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_good_split_problem_count", "PROBLEM-STORE-GOOD-SPLIT-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_good_disjunctive_problem_count", "PROBLEM-STORE-GOOD-DISJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_neutral_single_literal_problem_count", "PROBLEM-STORE-NEUTRAL-SINGLE-LITERAL-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_neutral_conjunctive_problem_count", "PROBLEM-STORE-NEUTRAL-CONJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_neutral_join_problem_count", "PROBLEM-STORE-NEUTRAL-JOIN-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_neutral_split_problem_count", "PROBLEM-STORE-NEUTRAL-SPLIT-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_neutral_disjunctive_problem_count", "PROBLEM-STORE-NEUTRAL-DISJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_no_good_single_literal_problem_count", "PROBLEM-STORE-NO-GOOD-SINGLE-LITERAL-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_no_good_conjunctive_problem_count", "PROBLEM-STORE-NO-GOOD-CONJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_no_good_join_problem_count", "PROBLEM-STORE-NO-GOOD-JOIN-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_no_good_split_problem_count", "PROBLEM-STORE-NO-GOOD-SPLIT-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_no_good_disjunctive_problem_count", "PROBLEM-STORE-NO-GOOD-DISJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_unexamined_single_literal_problem_count", "PROBLEM-STORE-UNEXAMINED-SINGLE-LITERAL-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_unexamined_conjunctive_problem_count", "PROBLEM-STORE-UNEXAMINED-CONJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_unexamined_join_problem_count", "PROBLEM-STORE-UNEXAMINED-JOIN-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_unexamined_split_problem_count", "PROBLEM-STORE-UNEXAMINED-SPLIT-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_unexamined_disjunctive_problem_count", "PROBLEM-STORE-UNEXAMINED-DISJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_examined_single_literal_problem_count", "PROBLEM-STORE-EXAMINED-SINGLE-LITERAL-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_examined_conjunctive_problem_count", "PROBLEM-STORE-EXAMINED-CONJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_examined_join_problem_count", "PROBLEM-STORE-EXAMINED-JOIN-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_examined_split_problem_count", "PROBLEM-STORE-EXAMINED-SPLIT-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_examined_disjunctive_problem_count", "PROBLEM-STORE-EXAMINED-DISJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_possible_single_literal_problem_count", "PROBLEM-STORE-POSSIBLE-SINGLE-LITERAL-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_possible_conjunctive_problem_count", "PROBLEM-STORE-POSSIBLE-CONJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_possible_join_problem_count", "PROBLEM-STORE-POSSIBLE-JOIN-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_possible_split_problem_count", "PROBLEM-STORE-POSSIBLE-SPLIT-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_possible_disjunctive_problem_count", "PROBLEM-STORE-POSSIBLE-DISJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_pending_single_literal_problem_count", "PROBLEM-STORE-PENDING-SINGLE-LITERAL-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_pending_conjunctive_problem_count", "PROBLEM-STORE-PENDING-CONJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_pending_join_problem_count", "PROBLEM-STORE-PENDING-JOIN-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_pending_split_problem_count", "PROBLEM-STORE-PENDING-SPLIT-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_pending_disjunctive_problem_count", "PROBLEM-STORE-PENDING-DISJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_finished_single_literal_problem_count", "PROBLEM-STORE-FINISHED-SINGLE-LITERAL-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_finished_conjunctive_problem_count", "PROBLEM-STORE-FINISHED-CONJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_finished_join_problem_count", "PROBLEM-STORE-FINISHED-JOIN-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_finished_split_problem_count", "PROBLEM-STORE-FINISHED-SPLIT-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_finished_disjunctive_problem_count", "PROBLEM-STORE-FINISHED-DISJUNCTIVE-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_executed_removal_tactic_productivities", "PROBLEM-STORE-EXECUTED-REMOVAL-TACTIC-PRODUCTIVITIES", 1, 0, false);
	declareFunction("problem_store_tactic_with_status_count", "PROBLEM-STORE-TACTIC-WITH-STATUS-COUNT", 1, 1, false);
	declareFunction("problem_store_tactic_of_type_with_status_count", "PROBLEM-STORE-TACTIC-OF-TYPE-WITH-STATUS-COUNT", 1, 2, false);
	declareFunction("problem_store_tactic_count", "PROBLEM-STORE-TACTIC-COUNT", 1, 0, false);
	declareFunction("problem_store_historical_tactic_count", "PROBLEM-STORE-HISTORICAL-TACTIC-COUNT", 1, 0, false);
	declareFunction("problem_store_increment_historical_tactic_count", "PROBLEM-STORE-INCREMENT-HISTORICAL-TACTIC-COUNT", 1, 0, false);
	declareFunction("problem_store_possible_tactic_count", "PROBLEM-STORE-POSSIBLE-TACTIC-COUNT", 1, 0, false);
	declareFunction("problem_store_executed_tactic_count", "PROBLEM-STORE-EXECUTED-TACTIC-COUNT", 1, 0, false);
	declareFunction("problem_store_discarded_tactic_count", "PROBLEM-STORE-DISCARDED-TACTIC-COUNT", 1, 0, false);
	declareFunction("problem_store_proof_count", "PROBLEM-STORE-PROOF-COUNT", 1, 0, false);
	declareFunction("problem_store_historical_proof_count", "PROBLEM-STORE-HISTORICAL-PROOF-COUNT", 1, 0, false);
	declareFunction("find_proof_by_id", "FIND-PROOF-BY-ID", 2, 0, false);
	declareFunction("find_proof_by_ids", "FIND-PROOF-BY-IDS", 2, 0, false);
	declareFunction("problem_store_some_rejected_proofsP", "PROBLEM-STORE-SOME-REJECTED-PROOFS?", 1, 0, false);
	declareFunction("problem_store_rejected_proof_count", "PROBLEM-STORE-REJECTED-PROOF-COUNT", 1, 0, false);
	declareFunction("problem_store_proven_proof_count", "PROBLEM-STORE-PROVEN-PROOF-COUNT", 1, 0, false);
	declareFunction("problem_store_all_processed_proofs", "PROBLEM-STORE-ALL-PROCESSED-PROOFS", 1, 0, false);
	declareFunction("problem_store_all_potentially_processed_problems", "PROBLEM-STORE-ALL-POTENTIALLY-PROCESSED-PROBLEMS", 1, 0, false);
	declareFunction("problem_store_has_some_non_explanatory_subproofP", "PROBLEM-STORE-HAS-SOME-NON-EXPLANATORY-SUBPROOF?", 1, 0, false);
	declareFunction("problem_store_proof_non_explanatory_subproofs", "PROBLEM-STORE-PROOF-NON-EXPLANATORY-SUBPROOFS", 2, 0, false);
	declareFunction("problem_store_size", "PROBLEM-STORE-SIZE", 1, 0, false);
	declareFunction("problem_store_historical_size", "PROBLEM-STORE-HISTORICAL-SIZE", 1, 0, false);
	declareFunction("total_size_of_all_problem_stores", "TOTAL-SIZE-OF-ALL-PROBLEM-STORES", 0, 0, false);
	declareFunction("total_size_of_all_historical_problem_stores", "TOTAL-SIZE-OF-ALL-HISTORICAL-PROBLEM-STORES", 0, 0, false);
	declareFunction("problem_store_dependent_link_count", "PROBLEM-STORE-DEPENDENT-LINK-COUNT", 1, 0, false);
	declareFunction("problem_store_most_recent_transformation_link", "PROBLEM-STORE-MOST-RECENT-TRANSFORMATION-LINK", 1, 0, false);
	declareFunction("problem_store_transformation_rules", "PROBLEM-STORE-TRANSFORMATION-RULES", 1, 0, false);
	declareFunction("problem_store_all_non_focal_problems", "PROBLEM-STORE-ALL-NON-FOCAL-PROBLEMS", 1, 0, false);
	declareFunction("problem_store_could_recompute_destructiblesP", "PROBLEM-STORE-COULD-RECOMPUTE-DESTRUCTIBLES?", 1, 0, false);
	declareFunction("problem_store_could_remove_destructiblesP", "PROBLEM-STORE-COULD-REMOVE-DESTRUCTIBLES?", 1, 0, false);
	declareFunction("problem_stores_similarP", "PROBLEM-STORES-SIMILAR?", 2, 0, false);
	declareFunction("problem_store_transformation_rule_bindings_to_closed", "PROBLEM-STORE-TRANSFORMATION-RULE-BINDINGS-TO-CLOSED", 1, 0, false);
	declareFunction("problem_store_all_problems", "PROBLEM-STORE-ALL-PROBLEMS", 1, 0, false);
	declareFunction("problem_store_all_problem_queries", "PROBLEM-STORE-ALL-PROBLEM-QUERIES", 1, 0, false);
	declareFunction("problem_store_all_problem_links", "PROBLEM-STORE-ALL-PROBLEM-LINKS", 1, 0, false);
	declareFunction("problem_store_all_proofs", "PROBLEM-STORE-ALL-PROOFS", 1, 0, false);
	declareFunction("problem_store_historical_root_problemP", "PROBLEM-STORE-HISTORICAL-ROOT-PROBLEM?", 2, 0, false);
	declareFunction("problem_store_historical_root_problem_count", "PROBLEM-STORE-HISTORICAL-ROOT-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_problem_with_complex_problem_queryP", "PROBLEM-STORE-PROBLEM-WITH-COMPLEX-PROBLEM-QUERY?", 2, 0, false);
	declareFunction("problem_store_complex_problem_query_signature", "PROBLEM-STORE-COMPLEX-PROBLEM-QUERY-SIGNATURE", 2, 0, false);
	declareFunction("problem_store_find_complex_problem_query", "PROBLEM-STORE-FIND-COMPLEX-PROBLEM-QUERY", 3, 0, false);
	declareFunction("clear_problem_store_proof_keeping_problems", "CLEAR-PROBLEM-STORE-PROOF-KEEPING-PROBLEMS", 1, 0, false);
	declareFunction("problem_proof_keeping_status", "PROBLEM-PROOF-KEEPING-STATUS", 1, 0, false);
	declareFunction("proof_keeping_problemP", "PROOF-KEEPING-PROBLEM?", 1, 0, false);
	declareFunction("non_proof_keeping_problemP", "NON-PROOF-KEEPING-PROBLEM?", 1, 0, false);
	declareFunction("unknown_proof_keeping_problemP", "UNKNOWN-PROOF-KEEPING-PROBLEM?", 1, 0, false);
	declareFunction("note_proof_keeping_problem", "NOTE-PROOF-KEEPING-PROBLEM", 2, 0, false);
	declareFunction("note_not_proof_keeping_problem", "NOTE-NOT-PROOF-KEEPING-PROBLEM", 1, 0, false);
	declareFunction("problem_store_prepare_for_expected_problem_count", "PROBLEM-STORE-PREPARE-FOR-EXPECTED-PROBLEM-COUNT", 2, 0, false);
	declareFunction("problem_store_prepare_for_expected_link_count", "PROBLEM-STORE-PREPARE-FOR-EXPECTED-LINK-COUNT", 2, 0, false);
	declareFunction("problem_store_prepare_for_expected_proof_count", "PROBLEM-STORE-PREPARE-FOR-EXPECTED-PROOF-COUNT", 2, 0, false);
	declareFunction("problem_store_new_inference_id", "PROBLEM-STORE-NEW-INFERENCE-ID", 1, 0, false);
	declareFunction("problem_store_new_strategy_id", "PROBLEM-STORE-NEW-STRATEGY-ID", 1, 0, false);
	declareFunction("problem_store_new_problem_id", "PROBLEM-STORE-NEW-PROBLEM-ID", 1, 0, false);
	declareFunction("problem_store_new_link_id", "PROBLEM-STORE-NEW-LINK-ID", 1, 0, false);
	declareFunction("problem_store_new_proof_id", "PROBLEM-STORE-NEW-PROOF-ID", 1, 0, false);
	declareFunction("add_problem_store_inference", "ADD-PROBLEM-STORE-INFERENCE", 2, 0, false);
	declareFunction("remove_problem_store_inference", "REMOVE-PROBLEM-STORE-INFERENCE", 2, 0, false);
	declareFunction("add_problem_store_strategy", "ADD-PROBLEM-STORE-STRATEGY", 2, 0, false);
	declareFunction("remove_problem_store_strategy", "REMOVE-PROBLEM-STORE-STRATEGY", 2, 0, false);
	declareFunction("add_problem_store_problem_by_id", "ADD-PROBLEM-STORE-PROBLEM-BY-ID", 2, 0, false);
	declareFunction("remove_problem_store_problem_by_id", "REMOVE-PROBLEM-STORE-PROBLEM-BY-ID", 2, 0, false);
	declareFunction("add_problem_store_problem_by_query", "ADD-PROBLEM-STORE-PROBLEM-BY-QUERY", 2, 0, false);
	declareFunction("remove_problem_store_problem_by_query", "REMOVE-PROBLEM-STORE-PROBLEM-BY-QUERY", 2, 0, false);
	declareFunction("add_problem_store_link", "ADD-PROBLEM-STORE-LINK", 2, 0, false);
	declareFunction("remove_problem_store_link", "REMOVE-PROBLEM-STORE-LINK", 2, 0, false);
	declareFunction("add_problem_store_proof", "ADD-PROBLEM-STORE-PROOF", 2, 0, false);
	declareFunction("remove_problem_store_proof", "REMOVE-PROBLEM-STORE-PROOF", 2, 0, false);
	declareFunction("problem_store_forget_that_proof_is_rejected", "PROBLEM-STORE-FORGET-THAT-PROOF-IS-REJECTED", 2, 0, false);
	declareFunction("problem_store_note_proof_processed", "PROBLEM-STORE-NOTE-PROOF-PROCESSED", 2, 0, false);
	declareFunction("problem_store_note_proof_unprocessed", "PROBLEM-STORE-NOTE-PROOF-UNPROCESSED", 2, 0, false);
	declareFunction("problem_store_note_problem_potentially_processed", "PROBLEM-STORE-NOTE-PROBLEM-POTENTIALLY-PROCESSED", 2, 0, false);
	declareFunction("problem_store_note_problem_unprocessed", "PROBLEM-STORE-NOTE-PROBLEM-UNPROCESSED", 2, 0, false);
	declareFunction("problem_store_note_non_explanatory_subproofs_possible", "PROBLEM-STORE-NOTE-NON-EXPLANATORY-SUBPROOFS-POSSIBLE", 1, 0, false);
	declareFunction("problem_store_note_non_explanatory_subproof", "PROBLEM-STORE-NOTE-NON-EXPLANATORY-SUBPROOF", 3, 0, false);
	declareFunction("proof_note_non_explanatory_subproof", "PROOF-NOTE-NON-EXPLANATORY-SUBPROOF", 2, 0, false);
	declareFunction("reset_problem_store_min_depth_index", "RESET-PROBLEM-STORE-MIN-DEPTH-INDEX", 1, 0, false);
	declareFunction("problem_store_min_proof_depth_index_remove_inference", "PROBLEM-STORE-MIN-PROOF-DEPTH-INDEX-REMOVE-INFERENCE", 2, 0, false);
	declareFunction("problem_store_min_transformation_depth_index_remove_inference", "PROBLEM-STORE-MIN-TRANSFORMATION-DEPTH-INDEX-REMOVE-INFERENCE", 2, 0, false);
	declareFunction("problem_store_min_transformation_depth_signature_index_remove_inference", "PROBLEM-STORE-MIN-TRANSFORMATION-DEPTH-SIGNATURE-INDEX-REMOVE-INFERENCE", 2, 0, false);
	declareFunction("add_problem_store_historical_root_problem", "ADD-PROBLEM-STORE-HISTORICAL-ROOT-PROBLEM", 2, 0, false);
	declareFunction("remove_problem_store_historical_root_problem", "REMOVE-PROBLEM-STORE-HISTORICAL-ROOT-PROBLEM", 2, 0, false);
	declareFunction("finalize_problem_store_properties", "FINALIZE-PROBLEM-STORE-PROPERTIES", 1, 0, false);
	declareFunction("add_problem_store_complex_problem", "ADD-PROBLEM-STORE-COMPLEX-PROBLEM", 2, 0, false);
	declareFunction("remove_problem_store_complex_problem", "REMOVE-PROBLEM-STORE-COMPLEX-PROBLEM", 2, 0, false);
	declareFunction("add_problem_store_problem", "ADD-PROBLEM-STORE-PROBLEM", 2, 0, false);
	declareFunction("remove_problem_store_problem", "REMOVE-PROBLEM-STORE-PROBLEM", 2, 0, false);
	declareFunction("remove_problem_wrt_reuse", "REMOVE-PROBLEM-WRT-REUSE", 2, 0, false);
	declareFunction("problem_store_note_transformation_rule_considered", "PROBLEM-STORE-NOTE-TRANSFORMATION-RULE-CONSIDERED", 2, 0, false);
	declareFunction("problem_store_note_transformation_rule_success", "PROBLEM-STORE-NOTE-TRANSFORMATION-RULE-SUCCESS", 2, 0, false);
	declareFunction("ensure_transformation_rule_considered_noted_internal", "ENSURE-TRANSFORMATION-RULE-CONSIDERED-NOTED-INTERNAL", 1, 0, false);
	declareFunction("ensure_transformation_rule_considered_noted", "ENSURE-TRANSFORMATION-RULE-CONSIDERED-NOTED", 1, 0, false);
	declareFunction("ensure_transformation_rule_success_noted_internal", "ENSURE-TRANSFORMATION-RULE-SUCCESS-NOTED-INTERNAL", 1, 0, false);
	declareFunction("ensure_transformation_rule_success_noted", "ENSURE-TRANSFORMATION-RULE-SUCCESS-NOTED", 1, 0, false);
	declareFunction("problem_store_janitor_print_function_trampoline", "PROBLEM-STORE-JANITOR-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
	declareFunction("problem_store_janitor_p", "PROBLEM-STORE-JANITOR-P", 1, 0, false);
	new $problem_store_janitor_p$UnaryFunction();
	declareFunction("prob_store_janitor_store", "PROB-STORE-JANITOR-STORE", 1, 0, false);
	declareFunction("prob_store_janitor_indestructible_problems", "PROB-STORE-JANITOR-INDESTRUCTIBLE-PROBLEMS", 1, 0, false);
	declareFunction("prob_store_janitor_staleP", "PROB-STORE-JANITOR-STALE?", 1, 0, false);
	declareFunction("_csetf_prob_store_janitor_store", "_CSETF-PROB-STORE-JANITOR-STORE", 2, 0, false);
	declareFunction("_csetf_prob_store_janitor_indestructible_problems", "_CSETF-PROB-STORE-JANITOR-INDESTRUCTIBLE-PROBLEMS", 2, 0, false);
	declareFunction("_csetf_prob_store_janitor_staleP", "_CSETF-PROB-STORE-JANITOR-STALE?", 2, 0, false);
	declareFunction("make_problem_store_janitor", "MAKE-PROBLEM-STORE-JANITOR", 0, 1, false);
	declareFunction("visit_defstruct_problem_store_janitor", "VISIT-DEFSTRUCT-PROBLEM-STORE-JANITOR", 2, 0, false);
	declareFunction("visit_defstruct_object_problem_store_janitor_method", "VISIT-DEFSTRUCT-OBJECT-PROBLEM-STORE-JANITOR-METHOD", 2, 0, false);
	declareFunction("new_problem_store_janitor", "NEW-PROBLEM-STORE-JANITOR", 1, 0, false);
	declareFunction("destroy_problem_store_janitor", "DESTROY-PROBLEM-STORE-JANITOR", 1, 0, false);
	declareFunction("problem_store_janitor_store", "PROBLEM-STORE-JANITOR-STORE", 1, 0, false);
	declareFunction("problem_store_janitor_staleP", "PROBLEM-STORE-JANITOR-STALE?", 1, 0, false);
	declareFunction("problem_store_janitor_indestructible_problems", "PROBLEM-STORE-JANITOR-INDESTRUCTIBLE-PROBLEMS", 1, 0, false);
	declareMacro("do_problem_store_janitor_indestructible_problems", "DO-PROBLEM-STORE-JANITOR-INDESTRUCTIBLE-PROBLEMS");
	declareMacro("do_problem_store_janitor_destructible_problems", "DO-PROBLEM-STORE-JANITOR-DESTRUCTIBLE-PROBLEMS");
	declareFunction("problem_store_janitor_indestructible_problem_count", "PROBLEM-STORE-JANITOR-INDESTRUCTIBLE-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_janitor_destructible_problem_count", "PROBLEM-STORE-JANITOR-DESTRUCTIBLE-PROBLEM-COUNT", 1, 0, false);
	declareFunction("problem_store_janitor_note_stale", "PROBLEM-STORE-JANITOR-NOTE-STALE", 1, 0, false);
	declareFunction("problem_store_janitor_note_unstale", "PROBLEM-STORE-JANITOR-NOTE-UNSTALE", 1, 0, false);
	declareFunction("problem_store_janitor_note_problem_indestructible", "PROBLEM-STORE-JANITOR-NOTE-PROBLEM-INDESTRUCTIBLE", 2, 0, false);
	declareFunction("problem_store_janitor_note_problem_destructible", "PROBLEM-STORE-JANITOR-NOTE-PROBLEM-DESTRUCTIBLE", 2, 0, false);
	declareFunction("problem_store_name", "PROBLEM-STORE-NAME", 1, 0, false);
	declareFunction("find_problem_store_by_name", "FIND-PROBLEM-STORE-BY-NAME", 1, 0, false);
	declareFunction("find_or_create_problem_store_by_name", "FIND-OR-CREATE-PROBLEM-STORE-BY-NAME", 1, 1, false);
	declareFunction("destroy_problem_store_by_name", "DESTROY-PROBLEM-STORE-BY-NAME", 1, 0, false);
	declareFunction("rename_problem_store", "RENAME-PROBLEM-STORE", 2, 0, false);
	declareFunction("set_problem_store_name", "SET-PROBLEM-STORE-NAME", 2, 0, false);
	declareFunction("free_problem_store_name", "FREE-PROBLEM-STORE-NAME", 1, 0, false);
	declareFunction("problem_store_properties", "PROBLEM-STORE-PROPERTIES", 1, 0, false);
	declareFunction("problem_store_property_value", "PROBLEM-STORE-PROPERTY-VALUE", 2, 0, false);
	declareFunction("possibly_optimize_problem_store", "POSSIBLY-OPTIMIZE-PROBLEM-STORE", 1, 0, false);
	declareFunction("hashify_problem_storeP", "HASHIFY-PROBLEM-STORE?", 1, 0, false);
	declareFunction("hashify_problem_store", "HASHIFY-PROBLEM-STORE", 1, 0, false);
	declareFunction("test_problem_store_property_value_support", "TEST-PROBLEM-STORE-PROPERTY-VALUE-SUPPORT", 0, 0, false);
	return NIL;
    }

    public static final SubLObject init_inference_datastructures_problem_store_file_alt() {
	defparameter("*PROBLEM-STORE-MODIFICATION-PERMITTED?*", NIL);
	deflexical("*PROBLEM-STORE-ID-INDEX*", NIL != boundp($problem_store_id_index$) ? ((SubLObject) ($problem_store_id_index$.getGlobalValue())) : new_id_index(UNPROVIDED, UNPROVIDED));
	defconstant("*DTP-PROBLEM-STORE*", PROBLEM_STORE);
	deflexical("*DEFAULT-PROBLEM-STORE-PROBLEM-SIZE*", $int$80);
	deflexical("*DEFAULT-PROBLEM-STORE-LINK-SIZE*", $int$120);
	deflexical("*DEFAULT-PROBLEM-STORE-INFERENCE-SIZE*", TEN_INTEGER);
	deflexical("*DEFAULT-PROBLEM-STORE-STRATEGY-SIZE*", $default_problem_store_inference_size$.getGlobalValue());
	deflexical("*DEFAULT-PROBLEM-STORE-PROOF-SIZE*", $int$40);
	deflexical("*PROBLEM-STORE-SBHL-RESOURCE-SPACE-NUMBER*", TEN_INTEGER);
	deflexical("*MAX-PROOF-COUNT-MULTIPLIER*", FIVE_INTEGER);
	defconstant("*DTP-PROBLEM-STORE-JANITOR*", PROBLEM_STORE_JANITOR);
	deflexical("*PROBLEM-STORE-ID-TO-NAME-TABLE*", NIL != boundp($problem_store_id_to_name_table$) ? ((SubLObject) ($problem_store_id_to_name_table$.getGlobalValue())) : make_hash_table(ONE_INTEGER, symbol_function(EQL), UNPROVIDED));
	deflexical("*PROBLEM-STORE-NAME-TO-ID-TABLE*", NIL != boundp($problem_store_name_to_id_table$) ? ((SubLObject) ($problem_store_name_to_id_table$.getGlobalValue())) : make_hash_table(ONE_INTEGER, symbol_function(EQUAL), UNPROVIDED));
	return NIL;
    }

    public static SubLObject init_inference_datastructures_problem_store_file() {
	if (SubLFiles.USE_V1) {
	    defparameter("*PROBLEM-STORE-MODIFICATION-PERMITTED?*", NIL);
	    defparameter("*PROBLEM-STORE-MULTIPLE-SUBQUERIES-COUNT*", NIL);
	    deflexical("*PROBLEM-STORE-ID-INDEX*", SubLTrampolineFile.maybeDefault($problem_store_id_index$, $problem_store_id_index$, () -> new_id_index(UNPROVIDED, UNPROVIDED)));
	    defconstant("*DTP-PROBLEM-STORE*", inference_datastructures_problem_store.PROBLEM_STORE);
	    deflexical("*DEFAULT-PROBLEM-STORE-PROBLEM-SIZE*", $int$80);
	    deflexical("*DEFAULT-PROBLEM-STORE-LINK-SIZE*", $int$120);
	    deflexical("*DEFAULT-PROBLEM-STORE-INFERENCE-SIZE*", TEN_INTEGER);
	    deflexical("*DEFAULT-PROBLEM-STORE-STRATEGY-SIZE*", $default_problem_store_inference_size$.getGlobalValue());
	    deflexical("*DEFAULT-PROBLEM-STORE-PROOF-SIZE*", $int$40);
	    deflexical("*PROBLEM-STORE-SBHL-RESOURCE-SPACE-NUMBER*", TEN_INTEGER);
	    deflexical("*MAX-PROOF-COUNT-MULTIPLIER*", TEN_INTEGER);
	    defparameter("*DISABLE-PROBLEM-STORE-ALLOWS-PROBLEM-HL-FREE-VARS-OPTIMIZATION?*", NIL);
	    defparameter("*FORCE-PROBLEM-IDENTITY-DEPENDS-ON-FREE-HL-VARS*", NIL);
	    defconstant("*DTP-PROBLEM-STORE-JANITOR*", inference_datastructures_problem_store.PROBLEM_STORE_JANITOR);
	    deflexical("*PROBLEM-STORE-ID-TO-NAME-TABLE*", SubLTrampolineFile.maybeDefault($problem_store_id_to_name_table$, $problem_store_id_to_name_table$, () -> make_hash_table(ONE_INTEGER, symbol_function(EQL), UNPROVIDED)));
	    deflexical("*PROBLEM-STORE-NAME-TO-ID-TABLE*", SubLTrampolineFile.maybeDefault($problem_store_name_to_id_table$, $problem_store_name_to_id_table$, () -> make_hash_table(ONE_INTEGER, symbol_function(EQUAL), UNPROVIDED)));
	    deflexical("*PROBLEM-STORE-HASH-WATERMARK*", $int$50);
	}
	if (SubLFiles.USE_V2) {
	    deflexical("*PROBLEM-STORE-ID-INDEX*", NIL != boundp($problem_store_id_index$) ? ((SubLObject) ($problem_store_id_index$.getGlobalValue())) : new_id_index(UNPROVIDED, UNPROVIDED));
	    deflexical("*MAX-PROOF-COUNT-MULTIPLIER*", FIVE_INTEGER);
	    deflexical("*PROBLEM-STORE-ID-TO-NAME-TABLE*", NIL != boundp($problem_store_id_to_name_table$) ? ((SubLObject) ($problem_store_id_to_name_table$.getGlobalValue())) : make_hash_table(ONE_INTEGER, symbol_function(EQL), UNPROVIDED));
	    deflexical("*PROBLEM-STORE-NAME-TO-ID-TABLE*", NIL != boundp($problem_store_name_to_id_table$) ? ((SubLObject) ($problem_store_name_to_id_table$.getGlobalValue())) : make_hash_table(ONE_INTEGER, symbol_function(EQUAL), UNPROVIDED));
	}
	return NIL;
    }

    public static SubLObject init_inference_datastructures_problem_store_file_Previous() {
	defparameter("*PROBLEM-STORE-MODIFICATION-PERMITTED?*", NIL);
	defparameter("*PROBLEM-STORE-MULTIPLE-SUBQUERIES-COUNT*", NIL);
	deflexical("*PROBLEM-STORE-ID-INDEX*", SubLTrampolineFile.maybeDefault($problem_store_id_index$, $problem_store_id_index$, () -> new_id_index(UNPROVIDED, UNPROVIDED)));
	defconstant("*DTP-PROBLEM-STORE*", inference_datastructures_problem_store.PROBLEM_STORE);
	deflexical("*DEFAULT-PROBLEM-STORE-PROBLEM-SIZE*", $int$80);
	deflexical("*DEFAULT-PROBLEM-STORE-LINK-SIZE*", $int$120);
	deflexical("*DEFAULT-PROBLEM-STORE-INFERENCE-SIZE*", TEN_INTEGER);
	deflexical("*DEFAULT-PROBLEM-STORE-STRATEGY-SIZE*", $default_problem_store_inference_size$.getGlobalValue());
	deflexical("*DEFAULT-PROBLEM-STORE-PROOF-SIZE*", $int$40);
	deflexical("*PROBLEM-STORE-SBHL-RESOURCE-SPACE-NUMBER*", TEN_INTEGER);
	deflexical("*MAX-PROOF-COUNT-MULTIPLIER*", TEN_INTEGER);
	defparameter("*DISABLE-PROBLEM-STORE-ALLOWS-PROBLEM-HL-FREE-VARS-OPTIMIZATION?*", NIL);
	defparameter("*FORCE-PROBLEM-IDENTITY-DEPENDS-ON-FREE-HL-VARS*", NIL);
	defconstant("*DTP-PROBLEM-STORE-JANITOR*", inference_datastructures_problem_store.PROBLEM_STORE_JANITOR);
	deflexical("*PROBLEM-STORE-ID-TO-NAME-TABLE*", SubLTrampolineFile.maybeDefault($problem_store_id_to_name_table$, $problem_store_id_to_name_table$, () -> make_hash_table(ONE_INTEGER, symbol_function(EQL), UNPROVIDED)));
	deflexical("*PROBLEM-STORE-NAME-TO-ID-TABLE*", SubLTrampolineFile.maybeDefault($problem_store_name_to_id_table$, $problem_store_name_to_id_table$, () -> make_hash_table(ONE_INTEGER, symbol_function(EQUAL), UNPROVIDED)));
	deflexical("*PROBLEM-STORE-HASH-WATERMARK*", $int$50);
	return NIL;
    }

    public static final SubLObject setup_inference_datastructures_problem_store_file_alt() {
	declare_defglobal($problem_store_id_index$);
	register_macro_helper(PROBLEM_STORE_ID_INDEX, DO_ALL_PROBLEM_STORES);
	register_method($print_object_method_table$.getGlobalValue(), $dtp_problem_store$.getGlobalValue(), symbol_function(PROBLEM_STORE_PRINT_FUNCTION_TRAMPOLINE));
	def_csetf(PROB_STORE_GUID, _CSETF_PROB_STORE_GUID);
	def_csetf(PROB_STORE_SUID, _CSETF_PROB_STORE_SUID);
	def_csetf(PROB_STORE_LOCK, _CSETF_PROB_STORE_LOCK);
	def_csetf(PROB_STORE_CREATION_TIME, _CSETF_PROB_STORE_CREATION_TIME);
	def_csetf(PROB_STORE_INFERENCE_ID_INDEX, _CSETF_PROB_STORE_INFERENCE_ID_INDEX);
	def_csetf(PROB_STORE_STRATEGY_ID_INDEX, _CSETF_PROB_STORE_STRATEGY_ID_INDEX);
	def_csetf(PROB_STORE_PROBLEM_ID_INDEX, _CSETF_PROB_STORE_PROBLEM_ID_INDEX);
	def_csetf(PROB_STORE_LINK_ID_INDEX, _CSETF_PROB_STORE_LINK_ID_INDEX);
	def_csetf(PROB_STORE_PROOF_ID_INDEX, _CSETF_PROB_STORE_PROOF_ID_INDEX);
	def_csetf(PROB_STORE_PROBLEM_BY_QUERY_INDEX, _CSETF_PROB_STORE_PROBLEM_BY_QUERY_INDEX);
	def_csetf(PROB_STORE_REJECTED_PROOFS, _CSETF_PROB_STORE_REJECTED_PROOFS);
	def_csetf(PROB_STORE_PROCESSED_PROOFS, _CSETF_PROB_STORE_PROCESSED_PROOFS);
	def_csetf($sym73$PROB_STORE_NON_EXPLANATORY_SUBPROOFS_POSSIBLE_, $sym74$_CSETF_PROB_STORE_NON_EXPLANATORY_SUBPROOFS_POSSIBLE_);
	def_csetf(PROB_STORE_NON_EXPLANATORY_SUBPROOFS_INDEX, _CSETF_PROB_STORE_NON_EXPLANATORY_SUBPROOFS_INDEX);
	def_csetf(PROB_STORE_MOST_RECENT_TACTIC_EXECUTED, _CSETF_PROB_STORE_MOST_RECENT_TACTIC_EXECUTED);
	def_csetf(PROB_STORE_MIN_PROOF_DEPTH_INDEX, _CSETF_PROB_STORE_MIN_PROOF_DEPTH_INDEX);
	def_csetf(PROB_STORE_MIN_TRANSFORMATION_DEPTH_INDEX, _CSETF_PROB_STORE_MIN_TRANSFORMATION_DEPTH_INDEX);
	def_csetf(PROB_STORE_MIN_TRANSFORMATION_DEPTH_SIGNATURE_INDEX, _CSETF_PROB_STORE_MIN_TRANSFORMATION_DEPTH_SIGNATURE_INDEX);
	def_csetf(PROB_STORE_MIN_DEPTH_INDEX, _CSETF_PROB_STORE_MIN_DEPTH_INDEX);
	def_csetf(PROB_STORE_EQUALITY_REASONING_METHOD, _CSETF_PROB_STORE_EQUALITY_REASONING_METHOD);
	def_csetf(PROB_STORE_EQUALITY_REASONING_DOMAIN, _CSETF_PROB_STORE_EQUALITY_REASONING_DOMAIN);
	def_csetf(PROB_STORE_INTERMEDIATE_STEP_VALIDATION_LEVEL, _CSETF_PROB_STORE_INTERMEDIATE_STEP_VALIDATION_LEVEL);
	def_csetf(PROB_STORE_MAX_PROBLEM_COUNT, _CSETF_PROB_STORE_MAX_PROBLEM_COUNT);
	def_csetf(PROB_STORE_CRAZY_MAX_PROBLEM_COUNT, _CSETF_PROB_STORE_CRAZY_MAX_PROBLEM_COUNT);
	def_csetf($sym97$PROB_STORE_REMOVAL_ALLOWED_, $sym98$_CSETF_PROB_STORE_REMOVAL_ALLOWED_);
	def_csetf($sym99$PROB_STORE_TRANSFORMATION_ALLOWED_, $sym100$_CSETF_PROB_STORE_TRANSFORMATION_ALLOWED_);
	def_csetf($sym101$PROB_STORE_ADD_RESTRICTION_LAYER_OF_INDIRECTION_, $sym102$_CSETF_PROB_STORE_ADD_RESTRICTION_LAYER_OF_INDIRECTION_);
	def_csetf($sym103$PROB_STORE_NEGATION_BY_FAILURE_, $sym104$_CSETF_PROB_STORE_NEGATION_BY_FAILURE_);
	def_csetf($sym105$PROB_STORE_COMPLETENESS_MINIMIZATION_ALLOWED_, $sym106$_CSETF_PROB_STORE_COMPLETENESS_MINIMIZATION_ALLOWED_);
	def_csetf(PROB_STORE_DIRECTION, _CSETF_PROB_STORE_DIRECTION);
	def_csetf($sym109$PROB_STORE_EVALUATE_SUBL_ALLOWED_, $sym110$_CSETF_PROB_STORE_EVALUATE_SUBL_ALLOWED_);
	def_csetf($sym111$PROB_STORE_REWRITE_ALLOWED_, $sym112$_CSETF_PROB_STORE_REWRITE_ALLOWED_);
	def_csetf($sym113$PROB_STORE_ABDUCTION_ALLOWED_, $sym114$_CSETF_PROB_STORE_ABDUCTION_ALLOWED_);
	def_csetf($sym115$PROB_STORE_NEW_TERMS_ALLOWED_, $sym116$_CSETF_PROB_STORE_NEW_TERMS_ALLOWED_);
	def_csetf($sym117$PROB_STORE_COMPUTE_ANSWER_JUSTIFICATIONS_, $sym118$_CSETF_PROB_STORE_COMPUTE_ANSWER_JUSTIFICATIONS_);
	def_csetf(PROB_STORE_MEMOIZATION_STATE, _CSETF_PROB_STORE_MEMOIZATION_STATE);
	def_csetf(PROB_STORE_SBHL_RESOURCE_SPACE, _CSETF_PROB_STORE_SBHL_RESOURCE_SPACE);
	def_csetf($sym123$PROB_STORE_PREPARED_, $sym124$_CSETF_PROB_STORE_PREPARED_);
	def_csetf($sym125$PROB_STORE_DESTRUCTION_IMMINENT_, $sym126$_CSETF_PROB_STORE_DESTRUCTION_IMMINENT_);
	def_csetf(PROB_STORE_META_PROBLEM_STORE, _CSETF_PROB_STORE_META_PROBLEM_STORE);
	def_csetf(PROB_STORE_STATIC_PROPERTIES, _CSETF_PROB_STORE_STATIC_PROPERTIES);
	def_csetf(PROB_STORE_JANITOR, _CSETF_PROB_STORE_JANITOR);
	def_csetf(PROB_STORE_HISTORICAL_ROOT_PROBLEMS, _CSETF_PROB_STORE_HISTORICAL_ROOT_PROBLEMS);
	def_csetf(PROB_STORE_HISTORICAL_TACTIC_COUNT, _CSETF_PROB_STORE_HISTORICAL_TACTIC_COUNT);
	def_csetf(PROB_STORE_COMPLEX_PROBLEM_QUERY_CZER_INDEX, _CSETF_PROB_STORE_COMPLEX_PROBLEM_QUERY_CZER_INDEX);
	def_csetf(PROB_STORE_COMPLEX_PROBLEM_QUERY_SIGNATURES, _CSETF_PROB_STORE_COMPLEX_PROBLEM_QUERY_SIGNATURES);
	def_csetf(PROB_STORE_PROOF_KEEPING_INDEX, _CSETF_PROB_STORE_PROOF_KEEPING_INDEX);
	identity(PROBLEM_STORE);
	register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_problem_store$.getGlobalValue(), symbol_function(SXHASH_PROBLEM_STORE_METHOD));
	register_macro_helper(PROBLEM_STORE_LOCK, WITH_PROBLEM_STORE_LOCK_HELD);
	register_macro_helper(PROBLEM_STORE_MEMOIZATION_STATE, WITH_PROBLEM_STORE_MEMOIZATION_STATE);
	register_macro_helper(PROBLEM_STORE_SBHL_RESOURCE_SPACE, WITH_PROBLEM_STORE_SBHL_RESOURCE_SPACE);
	register_macro_helper(SET_PROBLEM_STORE_SBHL_RESOURCE_SPACE, WITH_PROBLEM_STORE_SBHL_RESOURCE_SPACE);
	register_macro_helper(PROBLEM_STORE_INFERENCE_ID_INDEX, DO_PROBLEM_STORE_INFERENCES);
	register_macro_helper(PROBLEM_STORE_STRATEGY_ID_INDEX, DO_PROBLEM_STORE_STRATEGIES);
	register_macro_helper(PROBLEM_STORE_PROBLEM_ID_INDEX, DO_PROBLEM_STORE_PROBLEMS);
	register_macro_helper(PROBLEM_STORE_LINK_ID_INDEX, DO_PROBLEM_STORE_LINKS);
	register_macro_helper(PROBLEM_STORE_PROOF_ID_INDEX, DO_PROBLEM_STORE_PROOFS);
	register_macro_helper(PROBLEM_STORE_HISTORICAL_ROOT_PROBLEMS, DO_PROBLEM_STORE_HISTORICAL_ROOT_PROBLEMS);
	memoization_state.note_memoized_function(ENSURE_TRANSFORMATION_RULE_CONSIDERED_NOTED);
	memoization_state.note_memoized_function(ENSURE_TRANSFORMATION_RULE_SUCCESS_NOTED);
	register_method($print_object_method_table$.getGlobalValue(), $dtp_problem_store_janitor$.getGlobalValue(), symbol_function(PROBLEM_STORE_JANITOR_PRINT_FUNCTION_TRAMPOLINE));
	def_csetf(PROB_STORE_JANITOR_STORE, _CSETF_PROB_STORE_JANITOR_STORE);
	def_csetf(PROB_STORE_JANITOR_INDESTRUCTIBLE_PROBLEMS, _CSETF_PROB_STORE_JANITOR_INDESTRUCTIBLE_PROBLEMS);
	def_csetf($sym315$PROB_STORE_JANITOR_STALE_, $sym316$_CSETF_PROB_STORE_JANITOR_STALE_);
	identity(PROBLEM_STORE_JANITOR);
	register_macro_helper(PROBLEM_STORE_JANITOR_INDESTRUCTIBLE_PROBLEMS, DO_PROBLEM_STORE_JANITOR_INDESTRUCTIBLE_PROBLEMS);
	declare_defglobal($problem_store_id_to_name_table$);
	declare_defglobal($problem_store_name_to_id_table$);
	register_external_symbol(FIND_PROBLEM_STORE_BY_NAME);
	register_external_symbol(FIND_OR_CREATE_PROBLEM_STORE_BY_NAME);
	register_external_symbol(DESTROY_PROBLEM_STORE_BY_NAME);
	define_test_case_table_int(TEST_PROBLEM_STORE_PROPERTY_VALUE_SUPPORT, list(new SubLObject[] { $TEST, NIL, $OWNER, $$$goolsbey, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt343);
	return NIL;
    }

    public static SubLObject setup_inference_datastructures_problem_store_file() {
	if (SubLFiles.USE_V1) {
	    declare_defglobal($problem_store_id_index$);
	    register_macro_helper(inference_datastructures_problem_store.PROBLEM_STORE_ID_INDEX, inference_datastructures_problem_store.DO_ALL_PROBLEM_STORES);
	    register_method($print_object_method_table$.getGlobalValue(), $dtp_problem_store$.getGlobalValue(), symbol_function(inference_datastructures_problem_store.PROBLEM_STORE_PRINT_FUNCTION_TRAMPOLINE));
	    SubLSpecialOperatorDeclarations.proclaim($list59);
	    def_csetf(inference_datastructures_problem_store.PROB_STORE_GUID, inference_datastructures_problem_store._CSETF_PROB_STORE_GUID);
	    def_csetf(inference_datastructures_problem_store.PROB_STORE_SUID, inference_datastructures_problem_store._CSETF_PROB_STORE_SUID);
	    def_csetf(inference_datastructures_problem_store.PROB_STORE_LOCK, inference_datastructures_problem_store._CSETF_PROB_STORE_LOCK);
	    def_csetf(inference_datastructures_problem_store.PROB_STORE_CREATION_TIME, inference_datastructures_problem_store._CSETF_PROB_STORE_CREATION_TIME);
	    def_csetf(inference_datastructures_problem_store.PROB_STORE_INFERENCE_ID_INDEX, inference_datastructures_problem_store._CSETF_PROB_STORE_INFERENCE_ID_INDEX);
	    def_csetf(inference_datastructures_problem_store.PROB_STORE_STRATEGY_ID_INDEX, inference_datastructures_problem_store._CSETF_PROB_STORE_STRATEGY_ID_INDEX);
	    def_csetf(inference_datastructures_problem_store.PROB_STORE_PROBLEM_ID_INDEX, inference_datastructures_problem_store._CSETF_PROB_STORE_PROBLEM_ID_INDEX);
	    def_csetf(inference_datastructures_problem_store.PROB_STORE_LINK_ID_INDEX, inference_datastructures_problem_store._CSETF_PROB_STORE_LINK_ID_INDEX);
	    def_csetf(inference_datastructures_problem_store.PROB_STORE_PROOF_ID_INDEX, inference_datastructures_problem_store._CSETF_PROB_STORE_PROOF_ID_INDEX);
	    def_csetf(inference_datastructures_problem_store.PROB_STORE_PROBLEMS_BY_QUERY_INDEX, inference_datastructures_problem_store._CSETF_PROB_STORE_PROBLEMS_BY_QUERY_INDEX);
	    def_csetf(inference_datastructures_problem_store.PROB_STORE_REJECTED_PROOFS, inference_datastructures_problem_store._CSETF_PROB_STORE_REJECTED_PROOFS);
	    def_csetf(inference_datastructures_problem_store.PROB_STORE_PROCESSED_PROOFS, inference_datastructures_problem_store._CSETF_PROB_STORE_PROCESSED_PROOFS);
	    def_csetf(inference_datastructures_problem_store.PROB_STORE_POTENTIALLY_PROCESSED_PROBLEMS, inference_datastructures_problem_store._CSETF_PROB_STORE_POTENTIALLY_PROCESSED_PROBLEMS);
	    def_csetf($sym86$PROB_STORE_NON_EXPLANATORY_SUBPROOFS_POSSIBLE_, $sym87$_CSETF_PROB_STORE_NON_EXPLANATORY_SUBPROOFS_POSSIBLE_);
	    def_csetf(inference_datastructures_problem_store.PROB_STORE_NON_EXPLANATORY_SUBPROOFS_INDEX, inference_datastructures_problem_store._CSETF_PROB_STORE_NON_EXPLANATORY_SUBPROOFS_INDEX);
	    def_csetf(inference_datastructures_problem_store.PROB_STORE_MOST_RECENT_TACTIC_EXECUTED, inference_datastructures_problem_store._CSETF_PROB_STORE_MOST_RECENT_TACTIC_EXECUTED);
	    def_csetf(inference_datastructures_problem_store.PROB_STORE_MIN_PROOF_DEPTH_INDEX, inference_datastructures_problem_store._CSETF_PROB_STORE_MIN_PROOF_DEPTH_INDEX);
	    def_csetf(inference_datastructures_problem_store.PROB_STORE_MIN_TRANSFORMATION_DEPTH_INDEX, inference_datastructures_problem_store._CSETF_PROB_STORE_MIN_TRANSFORMATION_DEPTH_INDEX);
	    def_csetf(inference_datastructures_problem_store.PROB_STORE_MIN_TRANSFORMATION_DEPTH_SIGNATURE_INDEX, inference_datastructures_problem_store._CSETF_PROB_STORE_MIN_TRANSFORMATION_DEPTH_SIGNATURE_INDEX);
	    def_csetf(inference_datastructures_problem_store.PROB_STORE_MIN_DEPTH_INDEX, inference_datastructures_problem_store._CSETF_PROB_STORE_MIN_DEPTH_INDEX);
	    def_csetf(inference_datastructures_problem_store.PROB_STORE_EQUALITY_REASONING_METHOD, inference_datastructures_problem_store._CSETF_PROB_STORE_EQUALITY_REASONING_METHOD);
	    def_csetf(inference_datastructures_problem_store.PROB_STORE_EQUALITY_REASONING_DOMAIN, inference_datastructures_problem_store._CSETF_PROB_STORE_EQUALITY_REASONING_DOMAIN);
	    def_csetf(inference_datastructures_problem_store.PROB_STORE_INTERMEDIATE_STEP_VALIDATION_LEVEL, inference_datastructures_problem_store._CSETF_PROB_STORE_INTERMEDIATE_STEP_VALIDATION_LEVEL);
	    def_csetf(inference_datastructures_problem_store.PROB_STORE_MAX_PROBLEM_COUNT, inference_datastructures_problem_store._CSETF_PROB_STORE_MAX_PROBLEM_COUNT);
	    def_csetf(inference_datastructures_problem_store.PROB_STORE_CRAZY_MAX_PROBLEM_COUNT, inference_datastructures_problem_store._CSETF_PROB_STORE_CRAZY_MAX_PROBLEM_COUNT);
	    def_csetf($sym110$PROB_STORE_REMOVAL_ALLOWED_, $sym111$_CSETF_PROB_STORE_REMOVAL_ALLOWED_);
	    def_csetf($sym112$PROB_STORE_TRANSFORMATION_ALLOWED_, $sym113$_CSETF_PROB_STORE_TRANSFORMATION_ALLOWED_);
	    def_csetf($sym114$PROB_STORE_ADD_RESTRICTION_LAYER_OF_INDIRECTION_, $sym115$_CSETF_PROB_STORE_ADD_RESTRICTION_LAYER_OF_INDIRECTION_);
	    def_csetf($sym116$PROB_STORE_NEGATION_BY_FAILURE_, $sym117$_CSETF_PROB_STORE_NEGATION_BY_FAILURE_);
	    def_csetf($sym118$PROB_STORE_COMPLETENESS_MINIMIZATION_ALLOWED_, $sym119$_CSETF_PROB_STORE_COMPLETENESS_MINIMIZATION_ALLOWED_);
	    def_csetf(inference_datastructures_problem_store.PROB_STORE_DIRECTION, inference_datastructures_problem_store._CSETF_PROB_STORE_DIRECTION);
	    def_csetf($sym122$PROB_STORE_EVALUATE_SUBL_ALLOWED_, $sym123$_CSETF_PROB_STORE_EVALUATE_SUBL_ALLOWED_);
	    def_csetf($sym124$PROB_STORE_REWRITE_ALLOWED_, $sym125$_CSETF_PROB_STORE_REWRITE_ALLOWED_);
	    def_csetf($sym126$PROB_STORE_ABDUCTION_ALLOWED_, $sym127$_CSETF_PROB_STORE_ABDUCTION_ALLOWED_);
	    def_csetf($sym128$PROB_STORE_NEW_TERMS_ALLOWED_, $sym129$_CSETF_PROB_STORE_NEW_TERMS_ALLOWED_);
	    def_csetf($sym130$PROB_STORE_COMPUTE_ANSWER_JUSTIFICATIONS_, $sym131$_CSETF_PROB_STORE_COMPUTE_ANSWER_JUSTIFICATIONS_);
	    def_csetf(inference_datastructures_problem_store.PROB_STORE_MEMOIZATION_STATE, inference_datastructures_problem_store._CSETF_PROB_STORE_MEMOIZATION_STATE);
	    def_csetf(inference_datastructures_problem_store.PROB_STORE_SBHL_RESOURCE_SPACE, inference_datastructures_problem_store._CSETF_PROB_STORE_SBHL_RESOURCE_SPACE);
	    def_csetf($sym136$PROB_STORE_PREPARED_, $sym137$_CSETF_PROB_STORE_PREPARED_);
	    def_csetf($sym138$PROB_STORE_DESTRUCTION_IMMINENT_, $sym139$_CSETF_PROB_STORE_DESTRUCTION_IMMINENT_);
	    def_csetf(inference_datastructures_problem_store.PROB_STORE_META_PROBLEM_STORE, inference_datastructures_problem_store._CSETF_PROB_STORE_META_PROBLEM_STORE);
	    def_csetf(inference_datastructures_problem_store.PROB_STORE_STATIC_PROPERTIES, inference_datastructures_problem_store._CSETF_PROB_STORE_STATIC_PROPERTIES);
	    def_csetf(inference_datastructures_problem_store.PROB_STORE_JANITOR, inference_datastructures_problem_store._CSETF_PROB_STORE_JANITOR);
	    def_csetf(inference_datastructures_problem_store.PROB_STORE_HISTORICAL_ROOT_PROBLEMS, inference_datastructures_problem_store._CSETF_PROB_STORE_HISTORICAL_ROOT_PROBLEMS);
	    def_csetf(inference_datastructures_problem_store.PROB_STORE_HISTORICAL_TACTIC_COUNT, inference_datastructures_problem_store._CSETF_PROB_STORE_HISTORICAL_TACTIC_COUNT);
	    def_csetf(inference_datastructures_problem_store.PROB_STORE_COMPLEX_PROBLEM_QUERY_CZER_INDEX, inference_datastructures_problem_store._CSETF_PROB_STORE_COMPLEX_PROBLEM_QUERY_CZER_INDEX);
	    def_csetf(inference_datastructures_problem_store.PROB_STORE_COMPLEX_PROBLEM_QUERY_SIGNATURES, inference_datastructures_problem_store._CSETF_PROB_STORE_COMPLEX_PROBLEM_QUERY_SIGNATURES);
	    def_csetf(inference_datastructures_problem_store.PROB_STORE_PROOF_KEEPING_INDEX, inference_datastructures_problem_store._CSETF_PROB_STORE_PROOF_KEEPING_INDEX);
	    identity(inference_datastructures_problem_store.PROBLEM_STORE);
	    register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_problem_store$.getGlobalValue(), symbol_function(inference_datastructures_problem_store.VISIT_DEFSTRUCT_OBJECT_PROBLEM_STORE_METHOD));
	    register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_problem_store$.getGlobalValue(), symbol_function(inference_datastructures_problem_store.SXHASH_PROBLEM_STORE_METHOD));
	    register_macro_helper(inference_datastructures_problem_store.PROBLEM_STORE_LOCK, inference_datastructures_problem_store.WITH_PROBLEM_STORE_LOCK_HELD);
	    register_macro_helper(inference_datastructures_problem_store.PROBLEM_STORE_MEMOIZATION_STATE, inference_datastructures_problem_store.WITH_PROBLEM_STORE_MEMOIZATION_STATE);
	    register_macro_helper(inference_datastructures_problem_store.PROBLEM_STORE_SBHL_RESOURCE_SPACE, inference_datastructures_problem_store.WITH_PROBLEM_STORE_SBHL_RESOURCE_SPACE);
	    register_macro_helper(inference_datastructures_problem_store.SET_PROBLEM_STORE_SBHL_RESOURCE_SPACE, inference_datastructures_problem_store.WITH_PROBLEM_STORE_SBHL_RESOURCE_SPACE);
	    register_macro_helper(inference_datastructures_problem_store.PROBLEM_STORE_INFERENCE_ID_INDEX, inference_datastructures_problem_store.DO_PROBLEM_STORE_INFERENCES);
	    register_macro_helper(inference_datastructures_problem_store.PROBLEM_STORE_STRATEGY_ID_INDEX, inference_datastructures_problem_store.DO_PROBLEM_STORE_STRATEGIES);
	    register_macro_helper(inference_datastructures_problem_store.PROBLEM_STORE_PROBLEM_ID_INDEX, inference_datastructures_problem_store.DO_PROBLEM_STORE_PROBLEMS);
	    register_macro_helper(inference_datastructures_problem_store.PROBLEM_STORE_LINK_ID_INDEX, inference_datastructures_problem_store.DO_PROBLEM_STORE_LINKS);
	    register_macro_helper(inference_datastructures_problem_store.PROBLEM_STORE_PROOF_ID_INDEX, inference_datastructures_problem_store.DO_PROBLEM_STORE_PROOFS);
	    register_macro_helper(inference_datastructures_problem_store.PROBLEM_STORE_HISTORICAL_ROOT_PROBLEMS, inference_datastructures_problem_store.DO_PROBLEM_STORE_HISTORICAL_ROOT_PROBLEMS);
	    memoization_state.note_memoized_function($sym305$PROBLEM_STORE_ALLOWS_PROBLEM_HL_FREE_VARS_OPTIMIZATION__INT);
	    memoization_state.note_memoized_function(inference_datastructures_problem_store.ENSURE_TRANSFORMATION_RULE_CONSIDERED_NOTED);
	    memoization_state.note_memoized_function(inference_datastructures_problem_store.ENSURE_TRANSFORMATION_RULE_SUCCESS_NOTED);
	    register_method($print_object_method_table$.getGlobalValue(), $dtp_problem_store_janitor$.getGlobalValue(), symbol_function(inference_datastructures_problem_store.PROBLEM_STORE_JANITOR_PRINT_FUNCTION_TRAMPOLINE));
	    SubLSpecialOperatorDeclarations.proclaim($list333);
	    def_csetf(inference_datastructures_problem_store.PROB_STORE_JANITOR_STORE, inference_datastructures_problem_store._CSETF_PROB_STORE_JANITOR_STORE);
	    def_csetf(inference_datastructures_problem_store.PROB_STORE_JANITOR_INDESTRUCTIBLE_PROBLEMS, inference_datastructures_problem_store._CSETF_PROB_STORE_JANITOR_INDESTRUCTIBLE_PROBLEMS);
	    def_csetf($sym338$PROB_STORE_JANITOR_STALE_, $sym339$_CSETF_PROB_STORE_JANITOR_STALE_);
	    identity(inference_datastructures_problem_store.PROBLEM_STORE_JANITOR);
	    register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_problem_store_janitor$.getGlobalValue(), symbol_function(inference_datastructures_problem_store.VISIT_DEFSTRUCT_OBJECT_PROBLEM_STORE_JANITOR_METHOD));
	    register_macro_helper(inference_datastructures_problem_store.PROBLEM_STORE_JANITOR_INDESTRUCTIBLE_PROBLEMS, inference_datastructures_problem_store.DO_PROBLEM_STORE_JANITOR_INDESTRUCTIBLE_PROBLEMS);
	    declare_defglobal($problem_store_id_to_name_table$);
	    declare_defglobal($problem_store_name_to_id_table$);
	    register_external_symbol(inference_datastructures_problem_store.FIND_PROBLEM_STORE_BY_NAME);
	    register_external_symbol(inference_datastructures_problem_store.FIND_OR_CREATE_PROBLEM_STORE_BY_NAME);
	    register_external_symbol(inference_datastructures_problem_store.DESTROY_PROBLEM_STORE_BY_NAME);
	    define_test_case_table_int(inference_datastructures_problem_store.TEST_PROBLEM_STORE_PROPERTY_VALUE_SUPPORT, list(new SubLObject[] { $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list367);
	}
	if (SubLFiles.USE_V2) {
	    def_csetf(PROB_STORE_PROBLEM_BY_QUERY_INDEX, _CSETF_PROB_STORE_PROBLEM_BY_QUERY_INDEX);
	    def_csetf($sym73$PROB_STORE_NON_EXPLANATORY_SUBPROOFS_POSSIBLE_, $sym74$_CSETF_PROB_STORE_NON_EXPLANATORY_SUBPROOFS_POSSIBLE_);
	    def_csetf($sym97$PROB_STORE_REMOVAL_ALLOWED_, $sym98$_CSETF_PROB_STORE_REMOVAL_ALLOWED_);
	    def_csetf($sym99$PROB_STORE_TRANSFORMATION_ALLOWED_, $sym100$_CSETF_PROB_STORE_TRANSFORMATION_ALLOWED_);
	    def_csetf($sym101$PROB_STORE_ADD_RESTRICTION_LAYER_OF_INDIRECTION_, $sym102$_CSETF_PROB_STORE_ADD_RESTRICTION_LAYER_OF_INDIRECTION_);
	    def_csetf($sym103$PROB_STORE_NEGATION_BY_FAILURE_, $sym104$_CSETF_PROB_STORE_NEGATION_BY_FAILURE_);
	    def_csetf($sym105$PROB_STORE_COMPLETENESS_MINIMIZATION_ALLOWED_, $sym106$_CSETF_PROB_STORE_COMPLETENESS_MINIMIZATION_ALLOWED_);
	    def_csetf($sym109$PROB_STORE_EVALUATE_SUBL_ALLOWED_, $sym110$_CSETF_PROB_STORE_EVALUATE_SUBL_ALLOWED_);
	    def_csetf($sym111$PROB_STORE_REWRITE_ALLOWED_, $sym112$_CSETF_PROB_STORE_REWRITE_ALLOWED_);
	    def_csetf($sym113$PROB_STORE_ABDUCTION_ALLOWED_, $sym114$_CSETF_PROB_STORE_ABDUCTION_ALLOWED_);
	    def_csetf($sym115$PROB_STORE_NEW_TERMS_ALLOWED_, $sym116$_CSETF_PROB_STORE_NEW_TERMS_ALLOWED_);
	    def_csetf($sym117$PROB_STORE_COMPUTE_ANSWER_JUSTIFICATIONS_, $sym118$_CSETF_PROB_STORE_COMPUTE_ANSWER_JUSTIFICATIONS_);
	    def_csetf($sym123$PROB_STORE_PREPARED_, $sym124$_CSETF_PROB_STORE_PREPARED_);
	    def_csetf($sym125$PROB_STORE_DESTRUCTION_IMMINENT_, $sym126$_CSETF_PROB_STORE_DESTRUCTION_IMMINENT_);
	    def_csetf($sym315$PROB_STORE_JANITOR_STALE_, $sym316$_CSETF_PROB_STORE_JANITOR_STALE_);
	    define_test_case_table_int(TEST_PROBLEM_STORE_PROPERTY_VALUE_SUPPORT, list(new SubLObject[] { $TEST, NIL, $OWNER, $$$goolsbey, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list_alt343);
	}
	return NIL;
    }

    public static SubLObject setup_inference_datastructures_problem_store_file_Previous() {
	declare_defglobal($problem_store_id_index$);
	register_macro_helper(inference_datastructures_problem_store.PROBLEM_STORE_ID_INDEX, inference_datastructures_problem_store.DO_ALL_PROBLEM_STORES);
	register_method($print_object_method_table$.getGlobalValue(), $dtp_problem_store$.getGlobalValue(), symbol_function(inference_datastructures_problem_store.PROBLEM_STORE_PRINT_FUNCTION_TRAMPOLINE));
	SubLSpecialOperatorDeclarations.proclaim($list59);
	def_csetf(inference_datastructures_problem_store.PROB_STORE_GUID, inference_datastructures_problem_store._CSETF_PROB_STORE_GUID);
	def_csetf(inference_datastructures_problem_store.PROB_STORE_SUID, inference_datastructures_problem_store._CSETF_PROB_STORE_SUID);
	def_csetf(inference_datastructures_problem_store.PROB_STORE_LOCK, inference_datastructures_problem_store._CSETF_PROB_STORE_LOCK);
	def_csetf(inference_datastructures_problem_store.PROB_STORE_CREATION_TIME, inference_datastructures_problem_store._CSETF_PROB_STORE_CREATION_TIME);
	def_csetf(inference_datastructures_problem_store.PROB_STORE_INFERENCE_ID_INDEX, inference_datastructures_problem_store._CSETF_PROB_STORE_INFERENCE_ID_INDEX);
	def_csetf(inference_datastructures_problem_store.PROB_STORE_STRATEGY_ID_INDEX, inference_datastructures_problem_store._CSETF_PROB_STORE_STRATEGY_ID_INDEX);
	def_csetf(inference_datastructures_problem_store.PROB_STORE_PROBLEM_ID_INDEX, inference_datastructures_problem_store._CSETF_PROB_STORE_PROBLEM_ID_INDEX);
	def_csetf(inference_datastructures_problem_store.PROB_STORE_LINK_ID_INDEX, inference_datastructures_problem_store._CSETF_PROB_STORE_LINK_ID_INDEX);
	def_csetf(inference_datastructures_problem_store.PROB_STORE_PROOF_ID_INDEX, inference_datastructures_problem_store._CSETF_PROB_STORE_PROOF_ID_INDEX);
	def_csetf(inference_datastructures_problem_store.PROB_STORE_PROBLEMS_BY_QUERY_INDEX, inference_datastructures_problem_store._CSETF_PROB_STORE_PROBLEMS_BY_QUERY_INDEX);
	def_csetf(inference_datastructures_problem_store.PROB_STORE_REJECTED_PROOFS, inference_datastructures_problem_store._CSETF_PROB_STORE_REJECTED_PROOFS);
	def_csetf(inference_datastructures_problem_store.PROB_STORE_PROCESSED_PROOFS, inference_datastructures_problem_store._CSETF_PROB_STORE_PROCESSED_PROOFS);
	def_csetf(inference_datastructures_problem_store.PROB_STORE_POTENTIALLY_PROCESSED_PROBLEMS, inference_datastructures_problem_store._CSETF_PROB_STORE_POTENTIALLY_PROCESSED_PROBLEMS);
	def_csetf($sym86$PROB_STORE_NON_EXPLANATORY_SUBPROOFS_POSSIBLE_, $sym87$_CSETF_PROB_STORE_NON_EXPLANATORY_SUBPROOFS_POSSIBLE_);
	def_csetf(inference_datastructures_problem_store.PROB_STORE_NON_EXPLANATORY_SUBPROOFS_INDEX, inference_datastructures_problem_store._CSETF_PROB_STORE_NON_EXPLANATORY_SUBPROOFS_INDEX);
	def_csetf(inference_datastructures_problem_store.PROB_STORE_MOST_RECENT_TACTIC_EXECUTED, inference_datastructures_problem_store._CSETF_PROB_STORE_MOST_RECENT_TACTIC_EXECUTED);
	def_csetf(inference_datastructures_problem_store.PROB_STORE_MIN_PROOF_DEPTH_INDEX, inference_datastructures_problem_store._CSETF_PROB_STORE_MIN_PROOF_DEPTH_INDEX);
	def_csetf(inference_datastructures_problem_store.PROB_STORE_MIN_TRANSFORMATION_DEPTH_INDEX, inference_datastructures_problem_store._CSETF_PROB_STORE_MIN_TRANSFORMATION_DEPTH_INDEX);
	def_csetf(inference_datastructures_problem_store.PROB_STORE_MIN_TRANSFORMATION_DEPTH_SIGNATURE_INDEX, inference_datastructures_problem_store._CSETF_PROB_STORE_MIN_TRANSFORMATION_DEPTH_SIGNATURE_INDEX);
	def_csetf(inference_datastructures_problem_store.PROB_STORE_MIN_DEPTH_INDEX, inference_datastructures_problem_store._CSETF_PROB_STORE_MIN_DEPTH_INDEX);
	def_csetf(inference_datastructures_problem_store.PROB_STORE_EQUALITY_REASONING_METHOD, inference_datastructures_problem_store._CSETF_PROB_STORE_EQUALITY_REASONING_METHOD);
	def_csetf(inference_datastructures_problem_store.PROB_STORE_EQUALITY_REASONING_DOMAIN, inference_datastructures_problem_store._CSETF_PROB_STORE_EQUALITY_REASONING_DOMAIN);
	def_csetf(inference_datastructures_problem_store.PROB_STORE_INTERMEDIATE_STEP_VALIDATION_LEVEL, inference_datastructures_problem_store._CSETF_PROB_STORE_INTERMEDIATE_STEP_VALIDATION_LEVEL);
	def_csetf(inference_datastructures_problem_store.PROB_STORE_MAX_PROBLEM_COUNT, inference_datastructures_problem_store._CSETF_PROB_STORE_MAX_PROBLEM_COUNT);
	def_csetf(inference_datastructures_problem_store.PROB_STORE_CRAZY_MAX_PROBLEM_COUNT, inference_datastructures_problem_store._CSETF_PROB_STORE_CRAZY_MAX_PROBLEM_COUNT);
	def_csetf($sym110$PROB_STORE_REMOVAL_ALLOWED_, $sym111$_CSETF_PROB_STORE_REMOVAL_ALLOWED_);
	def_csetf($sym112$PROB_STORE_TRANSFORMATION_ALLOWED_, $sym113$_CSETF_PROB_STORE_TRANSFORMATION_ALLOWED_);
	def_csetf($sym114$PROB_STORE_ADD_RESTRICTION_LAYER_OF_INDIRECTION_, $sym115$_CSETF_PROB_STORE_ADD_RESTRICTION_LAYER_OF_INDIRECTION_);
	def_csetf($sym116$PROB_STORE_NEGATION_BY_FAILURE_, $sym117$_CSETF_PROB_STORE_NEGATION_BY_FAILURE_);
	def_csetf($sym118$PROB_STORE_COMPLETENESS_MINIMIZATION_ALLOWED_, $sym119$_CSETF_PROB_STORE_COMPLETENESS_MINIMIZATION_ALLOWED_);
	def_csetf(inference_datastructures_problem_store.PROB_STORE_DIRECTION, inference_datastructures_problem_store._CSETF_PROB_STORE_DIRECTION);
	def_csetf($sym122$PROB_STORE_EVALUATE_SUBL_ALLOWED_, $sym123$_CSETF_PROB_STORE_EVALUATE_SUBL_ALLOWED_);
	def_csetf($sym124$PROB_STORE_REWRITE_ALLOWED_, $sym125$_CSETF_PROB_STORE_REWRITE_ALLOWED_);
	def_csetf($sym126$PROB_STORE_ABDUCTION_ALLOWED_, $sym127$_CSETF_PROB_STORE_ABDUCTION_ALLOWED_);
	def_csetf($sym128$PROB_STORE_NEW_TERMS_ALLOWED_, $sym129$_CSETF_PROB_STORE_NEW_TERMS_ALLOWED_);
	def_csetf($sym130$PROB_STORE_COMPUTE_ANSWER_JUSTIFICATIONS_, $sym131$_CSETF_PROB_STORE_COMPUTE_ANSWER_JUSTIFICATIONS_);
	def_csetf(inference_datastructures_problem_store.PROB_STORE_MEMOIZATION_STATE, inference_datastructures_problem_store._CSETF_PROB_STORE_MEMOIZATION_STATE);
	def_csetf(inference_datastructures_problem_store.PROB_STORE_SBHL_RESOURCE_SPACE, inference_datastructures_problem_store._CSETF_PROB_STORE_SBHL_RESOURCE_SPACE);
	def_csetf($sym136$PROB_STORE_PREPARED_, $sym137$_CSETF_PROB_STORE_PREPARED_);
	def_csetf($sym138$PROB_STORE_DESTRUCTION_IMMINENT_, $sym139$_CSETF_PROB_STORE_DESTRUCTION_IMMINENT_);
	def_csetf(inference_datastructures_problem_store.PROB_STORE_META_PROBLEM_STORE, inference_datastructures_problem_store._CSETF_PROB_STORE_META_PROBLEM_STORE);
	def_csetf(inference_datastructures_problem_store.PROB_STORE_STATIC_PROPERTIES, inference_datastructures_problem_store._CSETF_PROB_STORE_STATIC_PROPERTIES);
	def_csetf(inference_datastructures_problem_store.PROB_STORE_JANITOR, inference_datastructures_problem_store._CSETF_PROB_STORE_JANITOR);
	def_csetf(inference_datastructures_problem_store.PROB_STORE_HISTORICAL_ROOT_PROBLEMS, inference_datastructures_problem_store._CSETF_PROB_STORE_HISTORICAL_ROOT_PROBLEMS);
	def_csetf(inference_datastructures_problem_store.PROB_STORE_HISTORICAL_TACTIC_COUNT, inference_datastructures_problem_store._CSETF_PROB_STORE_HISTORICAL_TACTIC_COUNT);
	def_csetf(inference_datastructures_problem_store.PROB_STORE_COMPLEX_PROBLEM_QUERY_CZER_INDEX, inference_datastructures_problem_store._CSETF_PROB_STORE_COMPLEX_PROBLEM_QUERY_CZER_INDEX);
	def_csetf(inference_datastructures_problem_store.PROB_STORE_COMPLEX_PROBLEM_QUERY_SIGNATURES, inference_datastructures_problem_store._CSETF_PROB_STORE_COMPLEX_PROBLEM_QUERY_SIGNATURES);
	def_csetf(inference_datastructures_problem_store.PROB_STORE_PROOF_KEEPING_INDEX, inference_datastructures_problem_store._CSETF_PROB_STORE_PROOF_KEEPING_INDEX);
	identity(inference_datastructures_problem_store.PROBLEM_STORE);
	register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_problem_store$.getGlobalValue(), symbol_function(inference_datastructures_problem_store.VISIT_DEFSTRUCT_OBJECT_PROBLEM_STORE_METHOD));
	register_method(Sxhash.$sxhash_method_table$.getGlobalValue(), $dtp_problem_store$.getGlobalValue(), symbol_function(inference_datastructures_problem_store.SXHASH_PROBLEM_STORE_METHOD));
	register_macro_helper(inference_datastructures_problem_store.PROBLEM_STORE_LOCK, inference_datastructures_problem_store.WITH_PROBLEM_STORE_LOCK_HELD);
	register_macro_helper(inference_datastructures_problem_store.PROBLEM_STORE_MEMOIZATION_STATE, inference_datastructures_problem_store.WITH_PROBLEM_STORE_MEMOIZATION_STATE);
	register_macro_helper(inference_datastructures_problem_store.PROBLEM_STORE_SBHL_RESOURCE_SPACE, inference_datastructures_problem_store.WITH_PROBLEM_STORE_SBHL_RESOURCE_SPACE);
	register_macro_helper(inference_datastructures_problem_store.SET_PROBLEM_STORE_SBHL_RESOURCE_SPACE, inference_datastructures_problem_store.WITH_PROBLEM_STORE_SBHL_RESOURCE_SPACE);
	register_macro_helper(inference_datastructures_problem_store.PROBLEM_STORE_INFERENCE_ID_INDEX, inference_datastructures_problem_store.DO_PROBLEM_STORE_INFERENCES);
	register_macro_helper(inference_datastructures_problem_store.PROBLEM_STORE_STRATEGY_ID_INDEX, inference_datastructures_problem_store.DO_PROBLEM_STORE_STRATEGIES);
	register_macro_helper(inference_datastructures_problem_store.PROBLEM_STORE_PROBLEM_ID_INDEX, inference_datastructures_problem_store.DO_PROBLEM_STORE_PROBLEMS);
	register_macro_helper(inference_datastructures_problem_store.PROBLEM_STORE_LINK_ID_INDEX, inference_datastructures_problem_store.DO_PROBLEM_STORE_LINKS);
	register_macro_helper(inference_datastructures_problem_store.PROBLEM_STORE_PROOF_ID_INDEX, inference_datastructures_problem_store.DO_PROBLEM_STORE_PROOFS);
	register_macro_helper(inference_datastructures_problem_store.PROBLEM_STORE_HISTORICAL_ROOT_PROBLEMS, inference_datastructures_problem_store.DO_PROBLEM_STORE_HISTORICAL_ROOT_PROBLEMS);
	memoization_state.note_memoized_function($sym305$PROBLEM_STORE_ALLOWS_PROBLEM_HL_FREE_VARS_OPTIMIZATION__INT);
	memoization_state.note_memoized_function(inference_datastructures_problem_store.ENSURE_TRANSFORMATION_RULE_CONSIDERED_NOTED);
	memoization_state.note_memoized_function(inference_datastructures_problem_store.ENSURE_TRANSFORMATION_RULE_SUCCESS_NOTED);
	register_method($print_object_method_table$.getGlobalValue(), $dtp_problem_store_janitor$.getGlobalValue(), symbol_function(inference_datastructures_problem_store.PROBLEM_STORE_JANITOR_PRINT_FUNCTION_TRAMPOLINE));
	SubLSpecialOperatorDeclarations.proclaim($list333);
	def_csetf(inference_datastructures_problem_store.PROB_STORE_JANITOR_STORE, inference_datastructures_problem_store._CSETF_PROB_STORE_JANITOR_STORE);
	def_csetf(inference_datastructures_problem_store.PROB_STORE_JANITOR_INDESTRUCTIBLE_PROBLEMS, inference_datastructures_problem_store._CSETF_PROB_STORE_JANITOR_INDESTRUCTIBLE_PROBLEMS);
	def_csetf($sym338$PROB_STORE_JANITOR_STALE_, $sym339$_CSETF_PROB_STORE_JANITOR_STALE_);
	identity(inference_datastructures_problem_store.PROBLEM_STORE_JANITOR);
	register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_problem_store_janitor$.getGlobalValue(), symbol_function(inference_datastructures_problem_store.VISIT_DEFSTRUCT_OBJECT_PROBLEM_STORE_JANITOR_METHOD));
	register_macro_helper(inference_datastructures_problem_store.PROBLEM_STORE_JANITOR_INDESTRUCTIBLE_PROBLEMS, inference_datastructures_problem_store.DO_PROBLEM_STORE_JANITOR_INDESTRUCTIBLE_PROBLEMS);
	declare_defglobal($problem_store_id_to_name_table$);
	declare_defglobal($problem_store_name_to_id_table$);
	register_external_symbol(inference_datastructures_problem_store.FIND_PROBLEM_STORE_BY_NAME);
	register_external_symbol(inference_datastructures_problem_store.FIND_OR_CREATE_PROBLEM_STORE_BY_NAME);
	register_external_symbol(inference_datastructures_problem_store.DESTROY_PROBLEM_STORE_BY_NAME);
	define_test_case_table_int(inference_datastructures_problem_store.TEST_PROBLEM_STORE_PROPERTY_VALUE_SUPPORT, list(new SubLObject[] { $TEST, NIL, $OWNER, NIL, $CLASSES, NIL, $KB, $TINY, $WORKING_, T }), $list367);
	return NIL;
    }

    @Override
    public void declareFunctions() {
	inference_datastructures_problem_store.declare_inference_datastructures_problem_store_file();
    }

    @Override
    public void initializeVariables() {
	inference_datastructures_problem_store.init_inference_datastructures_problem_store_file();
    }

    @Override
    public void runTopLevelForms() {
	inference_datastructures_problem_store.setup_inference_datastructures_problem_store_file();
    }

    

    public static final class $problem_store_native extends SubLStructNative {
	public SubLObject $problem_by_query_index = Lisp.NIL;

	public SubLObject $guid;

	public SubLObject $suid;

	public SubLObject $lock;

	public SubLObject $creation_time;

	public SubLObject $inference_id_index;

	public SubLObject $strategy_id_index;

	public SubLObject $problem_id_index;

	public SubLObject $link_id_index;

	public SubLObject $proof_id_index;

	public SubLObject $problems_by_query_index;

	public SubLObject $rejected_proofs;

	public SubLObject $processed_proofs;

	public SubLObject $potentially_processed_problems;

	public SubLObject $non_explanatory_subproofs_possibleP;

	public SubLObject $non_explanatory_subproofs_index;

	public SubLObject $most_recent_tactic_executed;

	public SubLObject $min_proof_depth_index;

	public SubLObject $min_transformation_depth_index;

	public SubLObject $min_transformation_depth_signature_index;

	public SubLObject $min_depth_index;

	public SubLObject $equality_reasoning_method;

	public SubLObject $equality_reasoning_domain;

	public SubLObject $intermediate_step_validation_level;

	public SubLObject $max_problem_count;

	public SubLObject $crazy_max_problem_count;

	public SubLObject $removal_allowedP;

	public SubLObject $transformation_allowedP;

	public SubLObject $add_restriction_layer_of_indirectionP;

	public SubLObject $negation_by_failureP;

	public SubLObject $completeness_minimization_allowedP;

	public SubLObject $direction;

	public SubLObject $evaluate_subl_allowedP;

	public SubLObject $rewrite_allowedP;

	public SubLObject $abduction_allowedP;

	public SubLObject $new_terms_allowedP;

	public SubLObject $compute_answer_justificationsP;

	public SubLObject $memoization_state;

	public SubLObject $sbhl_resource_space;

	public SubLObject $preparedP;

	public SubLObject $destruction_imminentP;

	public SubLObject $meta_problem_store;

	public SubLObject $static_properties;

	public SubLObject $janitor;

	public SubLObject $historical_root_problems;

	public SubLObject $historical_tactic_count;

	public SubLObject $complex_problem_query_czer_index;

	public SubLObject $complex_problem_query_signatures;

	public SubLObject $proof_keeping_index;

	private static final SubLStructDeclNative structDecl;

	public $problem_store_native() {
	    $guid = Lisp.NIL;
	    $suid = Lisp.NIL;
	    $lock = Lisp.NIL;
	    $creation_time = Lisp.NIL;
	    $inference_id_index = Lisp.NIL;
	    $strategy_id_index = Lisp.NIL;
	    $problem_id_index = Lisp.NIL;
	    $link_id_index = Lisp.NIL;
	    $proof_id_index = Lisp.NIL;
	    $problems_by_query_index = Lisp.NIL;
	    $rejected_proofs = Lisp.NIL;
	    $processed_proofs = Lisp.NIL;
	    $potentially_processed_problems = Lisp.NIL;
	    $non_explanatory_subproofs_possibleP = Lisp.NIL;
	    $non_explanatory_subproofs_index = Lisp.NIL;
	    $most_recent_tactic_executed = Lisp.NIL;
	    $min_proof_depth_index = Lisp.NIL;
	    $min_transformation_depth_index = Lisp.NIL;
	    $min_transformation_depth_signature_index = Lisp.NIL;
	    $min_depth_index = Lisp.NIL;
	    $equality_reasoning_method = Lisp.NIL;
	    $equality_reasoning_domain = Lisp.NIL;
	    $intermediate_step_validation_level = Lisp.NIL;
	    $max_problem_count = Lisp.NIL;
	    $crazy_max_problem_count = Lisp.NIL;
	    $removal_allowedP = Lisp.NIL;
	    $transformation_allowedP = Lisp.NIL;
	    $add_restriction_layer_of_indirectionP = Lisp.NIL;
	    $negation_by_failureP = Lisp.NIL;
	    $completeness_minimization_allowedP = Lisp.NIL;
	    $direction = Lisp.NIL;
	    $evaluate_subl_allowedP = Lisp.NIL;
	    $rewrite_allowedP = Lisp.NIL;
	    $abduction_allowedP = Lisp.NIL;
	    $new_terms_allowedP = Lisp.NIL;
	    $compute_answer_justificationsP = Lisp.NIL;
	    $memoization_state = Lisp.NIL;
	    $sbhl_resource_space = Lisp.NIL;
	    $preparedP = Lisp.NIL;
	    $destruction_imminentP = Lisp.NIL;
	    $meta_problem_store = Lisp.NIL;
	    $static_properties = Lisp.NIL;
	    $janitor = Lisp.NIL;
	    $historical_root_problems = Lisp.NIL;
	    $historical_tactic_count = Lisp.NIL;
	    $complex_problem_query_czer_index = Lisp.NIL;
	    $complex_problem_query_signatures = Lisp.NIL;
	    $proof_keeping_index = Lisp.NIL;
	}

	@Override
	public SubLStructDecl getStructDecl() {
	    return structDecl;
	}

	@Override
	public SubLObject getField2() {
	    return $guid;
	}

	@Override
	public SubLObject getField3() {
	    return $suid;
	}

	@Override
	public SubLObject getField4() {
	    return $lock;
	}

	@Override
	public SubLObject getField5() {
	    return $creation_time;
	}

	@Override
	public SubLObject getField6() {
	    return $inference_id_index;
	}

	@Override
	public SubLObject getField7() {
	    return $strategy_id_index;
	}

	@Override
	public SubLObject getField8() {
	    return $problem_id_index;
	}

	@Override
	public SubLObject getField9() {
	    return $link_id_index;
	}

	@Override
	public SubLObject getField10() {
	    return $proof_id_index;
	}

	@Override
	public SubLObject getField11() {
	    return $problems_by_query_index;
	}

	@Override
	public SubLObject getField12() {
	    return $rejected_proofs;
	}

	@Override
	public SubLObject getField13() {
	    return $processed_proofs;
	}

	@Override
	public SubLObject getField14() {
	    return $potentially_processed_problems;
	}

	@Override
	public SubLObject getField15() {
	    return $non_explanatory_subproofs_possibleP;
	}

	@Override
	public SubLObject getField16() {
	    return $non_explanatory_subproofs_index;
	}

	@Override
	public SubLObject getField17() {
	    return $most_recent_tactic_executed;
	}

	@Override
	public SubLObject getField18() {
	    return $min_proof_depth_index;
	}

	@Override
	public SubLObject getField19() {
	    return $min_transformation_depth_index;
	}

	@Override
	public SubLObject getField20() {
	    return $min_transformation_depth_signature_index;
	}

	public SubLObject getField21() {
	    return $min_depth_index;
	}

	public SubLObject getField22() {
	    return $equality_reasoning_method;
	}

	public SubLObject getField23() {
	    return $equality_reasoning_domain;
	}

	public SubLObject getField24() {
	    return $intermediate_step_validation_level;
	}

	public SubLObject getField25() {
	    return $max_problem_count;
	}

	public SubLObject getField26() {
	    return $crazy_max_problem_count;
	}

	public SubLObject getField27() {
	    return $removal_allowedP;
	}

	public SubLObject getField28() {
	    return $transformation_allowedP;
	}

	public SubLObject getField29() {
	    return $add_restriction_layer_of_indirectionP;
	}

	public SubLObject getField30() {
	    return $negation_by_failureP;
	}

	public SubLObject getField31() {
	    return $completeness_minimization_allowedP;
	}

	public SubLObject getField32() {
	    return $direction;
	}

	public SubLObject getField33() {
	    return $evaluate_subl_allowedP;
	}

	public SubLObject getField34() {
	    return $rewrite_allowedP;
	}

	public SubLObject getField35() {
	    return $abduction_allowedP;
	}

	public SubLObject getField36() {
	    return $new_terms_allowedP;
	}

	public SubLObject getField37() {
	    return $compute_answer_justificationsP;
	}

	public SubLObject getField38() {
	    return $memoization_state;
	}

	public SubLObject getField39() {
	    return $sbhl_resource_space;
	}

	public SubLObject getField40() {
	    return $preparedP;
	}

	public SubLObject getField41() {
	    return $destruction_imminentP;
	}

	public SubLObject getField42() {
	    return $meta_problem_store;
	}

	public SubLObject getField43() {
	    return $static_properties;
	}

	public SubLObject getField44() {
	    return $janitor;
	}

	public SubLObject getField45() {
	    return $historical_root_problems;
	}

	public SubLObject getField46() {
	    return $historical_tactic_count;
	}

	public SubLObject getField47() {
	    return $complex_problem_query_czer_index;
	}

	public SubLObject getField48() {
	    return $complex_problem_query_signatures;
	}

	public SubLObject getField49() {
	    return $proof_keeping_index;
	}

	@Override
	public SubLObject setField2(final SubLObject value) {
	    return $guid = value;
	}

	@Override
	public SubLObject setField3(final SubLObject value) {
	    return $suid = value;
	}

	@Override
	public SubLObject setField4(final SubLObject value) {
	    return $lock = value;
	}

	@Override
	public SubLObject setField5(final SubLObject value) {
	    return $creation_time = value;
	}

	@Override
	public SubLObject setField6(final SubLObject value) {
	    return $inference_id_index = value;
	}

	@Override
	public SubLObject setField7(final SubLObject value) {
	    return $strategy_id_index = value;
	}

	@Override
	public SubLObject setField8(final SubLObject value) {
	    return $problem_id_index = value;
	}

	@Override
	public SubLObject setField9(final SubLObject value) {
	    return $link_id_index = value;
	}

	@Override
	public SubLObject setField10(final SubLObject value) {
	    return $proof_id_index = value;
	}

	@Override
	public SubLObject setField11(final SubLObject value) {
	    return $problems_by_query_index = value;
	}

	@Override
	public SubLObject setField12(final SubLObject value) {
	    return $rejected_proofs = value;
	}

	@Override
	public SubLObject setField13(final SubLObject value) {
	    return $processed_proofs = value;
	}

	@Override
	public SubLObject setField14(final SubLObject value) {
	    return $potentially_processed_problems = value;
	}

	@Override
	public SubLObject setField15(final SubLObject value) {
	    return $non_explanatory_subproofs_possibleP = value;
	}

	@Override
	public SubLObject setField16(final SubLObject value) {
	    return $non_explanatory_subproofs_index = value;
	}

	@Override
	public SubLObject setField17(final SubLObject value) {
	    return $most_recent_tactic_executed = value;
	}

	@Override
	public SubLObject setField18(final SubLObject value) {
	    return $min_proof_depth_index = value;
	}

	@Override
	public SubLObject setField19(final SubLObject value) {
	    return $min_transformation_depth_index = value;
	}

	@Override
	public SubLObject setField20(final SubLObject value) {
	    return $min_transformation_depth_signature_index = value;
	}

	public SubLObject setField21(final SubLObject value) {
	    return $min_depth_index = value;
	}

	public SubLObject setField22(final SubLObject value) {
	    return $equality_reasoning_method = value;
	}

	public SubLObject setField23(final SubLObject value) {
	    return $equality_reasoning_domain = value;
	}

	public SubLObject setField24(final SubLObject value) {
	    return $intermediate_step_validation_level = value;
	}

	public SubLObject setField25(final SubLObject value) {
	    return $max_problem_count = value;
	}

	public SubLObject setField26(final SubLObject value) {
	    return $crazy_max_problem_count = value;
	}

	public SubLObject setField27(final SubLObject value) {
	    return $removal_allowedP = value;
	}

	public SubLObject setField28(final SubLObject value) {
	    return $transformation_allowedP = value;
	}

	public SubLObject setField29(final SubLObject value) {
	    return $add_restriction_layer_of_indirectionP = value;
	}

	public SubLObject setField30(final SubLObject value) {
	    return $negation_by_failureP = value;
	}

	public SubLObject setField31(final SubLObject value) {
	    return $completeness_minimization_allowedP = value;
	}

	public SubLObject setField32(final SubLObject value) {
	    return $direction = value;
	}

	public SubLObject setField33(final SubLObject value) {
	    return $evaluate_subl_allowedP = value;
	}

	public SubLObject setField34(final SubLObject value) {
	    return $rewrite_allowedP = value;
	}

	public SubLObject setField35(final SubLObject value) {
	    return $abduction_allowedP = value;
	}

	public SubLObject setField36(final SubLObject value) {
	    return $new_terms_allowedP = value;
	}

	public SubLObject setField37(final SubLObject value) {
	    return $compute_answer_justificationsP = value;
	}

	public SubLObject setField38(final SubLObject value) {
	    return $memoization_state = value;
	}

	public SubLObject setField39(final SubLObject value) {
	    return $sbhl_resource_space = value;
	}

	public SubLObject setField40(final SubLObject value) {
	    return $preparedP = value;
	}

	public SubLObject setField41(final SubLObject value) {
	    return $destruction_imminentP = value;
	}

	public SubLObject setField42(final SubLObject value) {
	    return $meta_problem_store = value;
	}

	public SubLObject setField43(final SubLObject value) {
	    return $static_properties = value;
	}

	public SubLObject setField44(final SubLObject value) {
	    return $janitor = value;
	}

	public SubLObject setField45(final SubLObject value) {
	    return $historical_root_problems = value;
	}

	public SubLObject setField46(final SubLObject value) {
	    return $historical_tactic_count = value;
	}

	public SubLObject setField47(final SubLObject value) {
	    return $complex_problem_query_czer_index = value;
	}

	public SubLObject setField48(final SubLObject value) {
	    return $complex_problem_query_signatures = value;
	}

	public SubLObject setField49(final SubLObject value) {
	    return $proof_keeping_index = value;
	}

	static {
	    structDecl = makeStructDeclNative($problem_store_native.class, inference_datastructures_problem_store.PROBLEM_STORE, PROBLEM_STORE_P, $list24, $list25,
		    new String[] { "$guid", "$suid", "$lock", "$creation_time", "$inference_id_index", "$strategy_id_index", "$problem_id_index", "$link_id_index", "$proof_id_index", "$problems_by_query_index", "$rejected_proofs", "$processed_proofs", "$potentially_processed_problems",
			    "$non_explanatory_subproofs_possibleP", "$non_explanatory_subproofs_index", "$most_recent_tactic_executed", "$min_proof_depth_index", "$min_transformation_depth_index", "$min_transformation_depth_signature_index", "$min_depth_index", "$equality_reasoning_method",
			    "$equality_reasoning_domain", "$intermediate_step_validation_level", "$max_problem_count", "$crazy_max_problem_count", "$removal_allowedP", "$transformation_allowedP", "$add_restriction_layer_of_indirectionP", "$negation_by_failureP",
			    "$completeness_minimization_allowedP", "$direction", "$evaluate_subl_allowedP", "$rewrite_allowedP", "$abduction_allowedP", "$new_terms_allowedP", "$compute_answer_justificationsP", "$memoization_state", "$sbhl_resource_space", "$preparedP", "$destruction_imminentP",
			    "$meta_problem_store", "$static_properties", "$janitor", "$historical_root_problems", "$historical_tactic_count", "$complex_problem_query_czer_index", "$complex_problem_query_signatures", "$proof_keeping_index" },
		    $list26, $list27, inference_datastructures_problem_store.PRINT_PROBLEM_STORE);
	}
    }

    public static final class $problem_store_p$UnaryFunction extends UnaryFunction {
	public $problem_store_p$UnaryFunction() {
	    super(extractFunctionNamed("PROBLEM-STORE-P"));
	}

	@Override
	public SubLObject processItem(final SubLObject arg1) {
	    return inference_datastructures_problem_store.problem_store_p(arg1);
	}
    }

    public static final class $problem_store_janitor_p$UnaryFunction extends UnaryFunction {
	public $problem_store_janitor_p$UnaryFunction() {
	    super(extractFunctionNamed("PROBLEM-STORE-JANITOR-P"));
	}

	@Override
	public SubLObject processItem(final SubLObject arg1) {
	    return inference_datastructures_problem_store.problem_store_janitor_p(arg1);
	}
    }
}

/**
 * Total time: 3518 ms
 */
