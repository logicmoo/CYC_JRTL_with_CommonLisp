package com.cyc.cycjava.cycl;


import com.cyc.cycjava.cycl.inference.ask_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_utilities;
import com.cyc.cycjava.cycl.kbs_identification;
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
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLBoolean;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
import java.util.Iterator;
import java.util.Map;

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.id_index.*;
import static com.cyc.cycjava.cycl.kbs_identification.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQ;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIFTEEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.IDENTITY;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TEN_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class kbs_identification extends SubLTranslatedFile {
    public static final SubLFile me = new kbs_identification();

    public static final String myName = "com.cyc.cycjava.cycl.kbs_identification";

    public static final String myFingerPrint = "8a0f9c03d910b8b988851c59b3cd6859ab9f0a69684f917cbfc0442dd9906689";

    // defvar
    // Definitions
    private static final SubLSymbol $kbs_raw_constants$ = makeSymbol("*KBS-RAW-CONSTANTS*");

    // defvar
    /**
     * A hash table mapping terms to the relevant element of :collection justifying
     * their inclusion.
     */
    private static final SubLSymbol $kbs_raw_constants_table$ = makeSymbol("*KBS-RAW-CONSTANTS-TABLE*");

    // defvar
    /**
     * A hash table mapping terms to the relevant elements of :collection and
     * :omission-collections justifying their omission.
     */
    private static final SubLSymbol $kbs_raw_constants_omission_table$ = makeSymbol("*KBS-RAW-CONSTANTS-OMISSION-TABLE*");

    // defvar
    /**
     * A hash table mapping terms to the :definitional-predicate-set restricting
     * their appearance.
     */
    private static final SubLSymbol $kbs_definitional_constant_table$ = makeSymbol("*KBS-DEFINITIONAL-CONSTANT-TABLE*");



    // defvar
    private static final SubLSymbol $kbs_skolems$ = makeSymbol("*KBS-SKOLEMS*");

    // defvar
    private static final SubLSymbol $kbs_constants$ = makeSymbol("*KBS-CONSTANTS*");

    // defvar
    private static final SubLSymbol $kbs_constant_table$ = makeSymbol("*KBS-CONSTANT-TABLE*");

    // defvar
    private static final SubLSymbol $kbs_narts$ = makeSymbol("*KBS-NARTS*");

    // defvar
    private static final SubLSymbol $kbs_forts$ = makeSymbol("*KBS-FORTS*");

    // defvar
    private static final SubLSymbol $kbs_fort_table$ = makeSymbol("*KBS-FORT-TABLE*");

    // defvar
    /**
     * A list of kbs predicate sets ordered by the section order. @note that a
     * predicate set may be used multiple times in a KBS definition, but *only* in
     * adjacent sections.
     */
    private static final SubLSymbol $kbs_ordered_definitional_predicate_sets$ = makeSymbol("*KBS-ORDERED-DEFINITIONAL-PREDICATE-SETS*");

    // defvar
    private static final SubLSymbol $kbs_definitional_predicate_table$ = makeSymbol("*KBS-DEFINITIONAL-PREDICATE-TABLE*");

    // defvar
    private static final SubLSymbol $kbs_definitional_rule_table$ = makeSymbol("*KBS-DEFINITIONAL-RULE-TABLE*");

    // defvar
    private static final SubLSymbol $kbs_assertion_table$ = makeSymbol("*KBS-ASSERTION-TABLE*");

    // defvar
    private static final SubLSymbol $kbs_deduction_table$ = makeSymbol("*KBS-DEDUCTION-TABLE*");

    // defvar
    private static final SubLSymbol $kbs_fort_state_validP$ = makeSymbol("*KBS-FORT-STATE-VALID?*");

    // defvar
    private static final SubLSymbol $kbs_state_validP$ = makeSymbol("*KBS-STATE-VALID?*");

    // deflexical
    public static final SubLSymbol $default_kbs_kappa_query_settings$ = makeSymbol("*DEFAULT-KBS-KAPPA-QUERY-SETTINGS*");

    // defparameter
    public static final SubLSymbol $kbs_kappa_query_settings$ = makeSymbol("*KBS-KAPPA-QUERY-SETTINGS*");



    private static final SubLObject $$quotedIsa = reader_make_constant_shell(makeString("quotedIsa"));

    private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));

    public static final SubLString $str3$Even_though_explicitly_included_v = makeString("Even though explicitly included via:");

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    public static final SubLString $str5$The_constant_is_also_excluded_bec = makeString("The constant is also excluded because:");

    private static final SubLObject $$not = reader_make_constant_shell(makeString("not"));

    public static final SubLSymbol NON_KBS_RAW_CONSTANT_P = makeSymbol("NON-KBS-RAW-CONSTANT-P");



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));













    public static final SubLString $str16$_A_is_not_a__A = makeString("~A is not a ~A");





    public static final SubLString $$$continue_anyway = makeString("continue anyway");



    public static final SubLString $str21$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    private static final SubLString $str22$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLString $str23$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    private static final SubLList $list24 = list(makeUninternedSymbol("LINK-NODE"), makeUninternedSymbol("MT"), makeUninternedSymbol("TV"));

    private static final SubLString $str25$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");



    private static final SubLString $$$mapping_Cyc_constants = makeString("mapping Cyc constants");





    private static final SubLObject $$CycLConstant = reader_make_constant_shell(makeString("CycLConstant"));



    private static final SubLString $str32$Overriding_constant__A_omission__ = makeString("Overriding constant ~A omission (~S) due to #$kbsProfileRetainTerm");

    private static final SubLObject $$kbsProfileRetainTerm = reader_make_constant_shell(makeString("kbsProfileRetainTerm"));

    private static final SubLObject $$kbsProfileRemoveFORT = reader_make_constant_shell(makeString("kbsProfileRemoveFORT"));

    private static final SubLString $str35$___S_constants_included_via_the_c = makeString("~&~S constants included via the collections : ~S~%");

    private static final SubLString $str36$___S_constants_omitted_via_the__A = makeString("~&~S constants omitted via the ~A ~A: ~A ~A~%");

    private static final SubLString $$$collections_ = makeString("collections ");

    private static final SubLString $str38$ = makeString("");

    private static final SubLString $str39$_predicate_ = makeString("/predicate ");

    private static final SubLString $str40$___S_total_constants_included___ = makeString("~&~S total constants included.~%");

    private static final SubLString $str41$___S_total_constants_omitted___ = makeString("~&~S total constants omitted.~%");

    private static final SubLString $str42$__Omitted_constants__ = makeString("~&Omitted constants: ");

    private static final SubLString $str43$_A_ = makeString("~A ");

    private static final SubLString $str44$__ = makeString("~%");

    private static final SubLString $str45$____S_total_raw_KBS_constants_ide = makeString(" ~&~S total raw KBS constants identified.~%");

    private static final SubLSymbol KBS_KBQ_QUERY_SET_TERMS = makeSymbol("KBS-KBQ-QUERY-SET-TERMS");

    private static final SubLObject $$TheSetOf = reader_make_constant_shell(makeString("TheSetOf"));

    private static final SubLSymbol $sym48$_Q = makeSymbol("?Q");

    private static final SubLObject $$thereExists = reader_make_constant_shell(makeString("thereExists"));

    private static final SubLSymbol $sym50$_T = makeSymbol("?T");

    private static final SubLObject $$and = reader_make_constant_shell(makeString("and"));

    private static final SubLList $list52 = list(list(reader_make_constant_shell(makeString("testQuery")), makeSymbol("?T"), makeSymbol("?Q")));

    private static final SubLInteger $int$300 = makeInteger(300);

    private static final SubLSymbol $kbs_kbq_query_set_terms_caching_state$ = makeSymbol("*KBS-KBQ-QUERY-SET-TERMS-CACHING-STATE*");

    private static final SubLString $$$Continue = makeString("Continue");

    private static final SubLString $str56$compute_kbs_skolems_requirements_ = makeString("compute-kbs-skolems requirements not met.");

    private static final SubLObject $$SkolemFunction = reader_make_constant_shell(makeString("SkolemFunction"));

    private static final SubLString $$$Computing_KBS_skolems = makeString("Computing KBS skolems");

    private static final SubLString $$$cdolist = makeString("cdolist");

    private static final SubLString $str60$____S_total_KBS_skolems_identifie = makeString(" ~&~S total KBS skolems identified.");

    private static final SubLSymbol KBS_SKOLEM_ASSERTION_FAST_FAIL_CONSTANT_P = makeSymbol("KBS-SKOLEM-ASSERTION-FAST-FAIL-CONSTANT-P");

    private static final SubLString $$$akb = makeString("akb");

    private static final SubLObject $$TKBTerm_Proprietary = reader_make_constant_shell(makeString("TKBTerm-Proprietary"));

    private static final SubLObject $$ProprietaryTerm = reader_make_constant_shell(makeString("ProprietaryTerm"));

    private static final SubLString $$$cyfi = makeString("cyfi");

    private static final SubLObject $$Cy_FiProprietaryTerm = reader_make_constant_shell(makeString("Cy-FiProprietaryTerm"));

    private static final SubLObject $$ResearchCycConstant = reader_make_constant_shell(makeString("ResearchCycConstant"));

    private static final SubLObject $$ScaffoldingConstant = reader_make_constant_shell(makeString("ScaffoldingConstant"));

    private static final SubLObject $$TerroristAgent = reader_make_constant_shell(makeString("TerroristAgent"));

    private static final SubLObject $$TerroristAct = reader_make_constant_shell(makeString("TerroristAct"));

    private static final SubLObject $$HostileSocialAction = reader_make_constant_shell(makeString("HostileSocialAction"));

    private static final SubLString $$$research = makeString("research");

    private static final SubLSymbol NON_KBS_CONSTANT_P = makeSymbol("NON-KBS-CONSTANT-P");

    private static final SubLString $$$Computing_KBS_narts = makeString("Computing KBS narts");

    private static final SubLString $str75$____S_total_KBS_NARTs_identified_ = makeString(" ~&~S total KBS NARTs identified.~%");

    private static final SubLString $str76$All_KB_subset_requirements_met_ = makeString("All KB subset requirements met.");

    private static final SubLString $str77$Also__the_following_GAFs_will_be_ = makeString("Also, the following GAFs will be spliced in:");



    private static final SubLSymbol NON_KBS_FORT_P = makeSymbol("NON-KBS-FORT-P");

    private static final SubLString $str80$The_term_contains_terms_not_in_th = makeString("The term contains terms not in the KB subset:");

    private static final SubLSymbol KBS_DEFINITIONAL_FORT_P = makeSymbol("KBS-DEFINITIONAL-FORT-P");



    private static final SubLSymbol KBS_DEFINITIONAL_FORT_PREDICATE_SETS = makeSymbol("KBS-DEFINITIONAL-FORT-PREDICATE-SETS");



    private static final SubLSymbol $sym85$KBS_DEFINITIONAL_PREDICATE_SET_ = makeSymbol("KBS-DEFINITIONAL-PREDICATE-SET<");

    private static final SubLSymbol KBS_DEFINITIONAL_PREDICATE_SET_P = makeSymbol("KBS-DEFINITIONAL-PREDICATE-SET-P");

    private static final SubLString $str87$The_assertion_s_microtheory_is_no = makeString("The assertion's microtheory is not in the KB subset:");

    private static final SubLString $str88$The_assertion_was_explicitly_omit = makeString("The assertion was explicitly omitted via #$kbsProfileRemoveAssertion");

    private static final SubLString $str89$The_assertion_s_formula_contains_ = makeString("The assertion's formula contains FORTs not in the KB subset:");

    private static final SubLString $str90$The_assertion_is_definitional_bec = makeString("The assertion is definitional because:");

    private static final SubLString $str91$__The_predicate_is_definitional_ = makeString("- The predicate is definitional:");

    private static final SubLString $str92$__The_predicate_is_not_definition = makeString("- The predicate is not definitional.");

    private static final SubLString $str93$__But_the_assertion_contains_defi = makeString("- But the assertion contains definitional terms for the KBS sections with the predicate sets:");

    private static final SubLString $str94$The_assertion_is_a_rule_containin = makeString("The assertion is a rule containing definitional FORTs:");

    private static final SubLString $$$Computing_KBS_assertions = makeString("Computing KBS assertions");

    private static final SubLSymbol COMPUTE_NON_KBS_ASSERTION_P = makeSymbol("COMPUTE-NON-KBS-ASSERTION-P");

    private static final SubLString $$$Computing_KBS_deductions = makeString("Computing KBS deductions");

    private static final SubLSymbol KBS_RAW_CONSTANT_OMITTED_P = makeSymbol("KBS-RAW-CONSTANT-OMITTED-P");

    private static final SubLList $list99 = list(new SubLObject[]{ makeKeyword("CONTINUABLE?"), NIL, makeKeyword("MAX-NUMBER"), NIL, makeKeyword("COMPUTE-ANSWER-JUSTIFICATIONS?"), NIL, makeKeyword("INFERENCE-MODE"), makeKeyword("MINIMAL"), makeKeyword("RESULT-UNIQUENESS"), makeKeyword("BINDINGS"), makeKeyword("PRODUCTIVITY-LIMIT"), makeKeyword("POSITIVE-INFINITY"), makeKeyword("MAX-PROBLEM-COUNT"), makeKeyword("POSITIVE-INFINITY"), makeKeyword("ANSWER-LANGUAGE"), makeKeyword("HL") });

    private static final SubLString $$$Preremoving_ = makeString("Preremoving ");

    private static final SubLString $$$_assertions = makeString(" assertions");

    private static final SubLString $str102$Only_unary_KAPPA_predicates_suppo = makeString("Only unary KAPPA predicates supported, not ~A.");

    private static final SubLString $$$Identifying_ = makeString("Identifying ");

    private static final SubLString $str104$_PREREMOVED_ASSERTIONS_specificat = makeString(":PREREMOVED-ASSERTIONS specification ~A picked out no assertions.~%");

    private static final SubLString $str105$Applying__PREREMOVED_ASSERTIONS_s = makeString("Applying :PREREMOVED-ASSERTIONS specification ~A .....~%");

    private static final SubLString $str106$_assertions_indentified_by_Kappa_ = makeString(" assertions indentified by Kappa predicate");

    private static final SubLString $str107$Finished_applying__A___ = makeString("Finished applying ~A.~%");

    private static final SubLString $str108$Invalid_pre_removal_specification = makeString("Invalid pre-removal specification ~A.");

    private static final SubLString $str109$Killing__A_assertion_for_KB_subse = makeString("Killing ~A assertion for KB subset: ~A~%");

    private static final SubLString $$$an = makeString("an");

    private static final SubLString $str111$prerun__Calling__A__ = makeString("prerun: Calling ~A~%");

    private static final SubLString $str112$post_kbs_forts__Calling__A___ = makeString("post-kbs-forts: Calling ~A.~%");

    private static final SubLString $str113$POST_KBS_FORTS__Unmark_NARTs_that = makeString("POST-KBS-FORTS: Unmark NARTs that have HL assertions as arguments");



    private static final SubLString $str115$__Unmarking_NART__A_with_formula_ = makeString("~&Unmarking NART ~A with formula ~A ....~%");

    private static final SubLString $str116$__No_NARTs_had_to_be_unmarked___ = makeString("~&No NARTs had to be unmarked.~%");

    private static final SubLString $str117$___A_NARTs_with_HL_assertions_as_ = makeString("~&~A NARTs with HL assertions as arguments unmarked.~%");

    private static final SubLString $str118$post_kbs_assertions__Calling__A__ = makeString("post-kbs-assertions: Calling ~A~%");

    private static final SubLString $str119$_kbs_raw_constants__is_null_ = makeString("*kbs-raw-constants* is null.");

    private static final SubLString $str120$_kbs_raw_constants_table__is_null = makeString("*kbs-raw-constants-table* is null.");

    private static final SubLString $str121$_kbs_raw_constants_omission_table = makeString("*kbs-raw-constants-omission-table* is null.");

    private static final SubLString $str122$_kbs_skolems__is_null_ = makeString("*kbs-skolems* is null.");

    private static final SubLString $str123$_kbs_constants__is_null_ = makeString("*kbs-constants* is null.");

    private static final SubLString $str124$_kbs_constant_table__is_null_ = makeString("*kbs-constant-table* is null.");

    private static final SubLString $str125$_kbs_narts__is_null_ = makeString("*kbs-narts* is null.");

    private static final SubLString $str126$_kbs_forts__is_null_ = makeString("*kbs-forts* is null.");

    private static final SubLString $str127$_kbs_fort_table__is_null_ = makeString("*kbs-fort-table* is null.");

    private static final SubLString $str128$_kbs_definitional_constant_table_ = makeString("*kbs-definitional-constant-table* is null.");

    private static final SubLString $str129$_kbs_definitional_predicate_table = makeString("*kbs-definitional-predicate-table* is null.");

    private static final SubLString $str130$_kbs_assertion_table__is_null_ = makeString("*kbs-assertion-table* is null.");

    private static final SubLString $str131$_kbs_deduction_table__is_null_ = makeString("*kbs-deduction-table* is null.");

    private static final SubLString $str132$______KB__S_KBS_statistics__ = makeString("~&;;; KB ~S KBS statistics~%");

    private static final SubLString $str133$__FORTs___________7___D__ = makeString("~&FORTs        : ~7,' D~%");

    private static final SubLString $str134$___Constants______7___D__ = makeString("~& Constants   : ~7,' D~%");

    private static final SubLString $str135$_____def_only_____7___D__ = makeString("~&  (def only) : ~7,' D~%");

    private static final SubLString $str136$___NARTs__________7___D__ = makeString("~& NARTs       : ~7,' D~%");

    private static final SubLString $str137$__Assertions______7___D__ = makeString("~&Assertions   : ~7,' D~%");

    private static final SubLString $str138$__Deductions______7___D__ = makeString("~&Deductions   : ~7,' D~%");

    private static final SubLSymbol $sym139$ISA_MT_ = makeSymbol("ISA-MT?");

    private static final SubLString $str140$No_valid_KBS_available_ = makeString("No valid KBS available!");





    private static final SubLString $str143$do_broad_mt_index = makeString("do-broad-mt-index");

    public static SubLObject kbs_raw_constants() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $kbs_raw_constants$.getDynamicValue(thread);
    }

    public static SubLObject kbs_raw_constant_p(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean((NIL != constant_p(constant)) && (NIL != gethash(constant, $kbs_raw_constants_table$.getDynamicValue(thread), UNPROVIDED)));
    }

    public static SubLObject why_kbs_raw_constantP(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        if (NIL != kbs_raw_constant_p(constant)) {
            SubLObject cdolist_list_var;
            final SubLObject inclusion_cols = cdolist_list_var = gethash(constant, $kbs_raw_constants_table$.getDynamicValue(thread), UNPROVIDED);
            SubLObject inclusion_col = NIL;
            inclusion_col = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                result = cons(arguments.make_hl_support($ISA, make_binary_formula($$quotedIsa, constant, inclusion_col), $$InferencePSC, UNPROVIDED), result);
                cdolist_list_var = cdolist_list_var.rest();
                inclusion_col = cdolist_list_var.first();
            } 
        }
        return nreverse(result);
    }

    public static SubLObject non_kbs_raw_constant_p(final SubLObject constant) {
        return makeBoolean((NIL != constant_p(constant)) && (NIL == kbs_raw_constant_p(constant)));
    }

    public static SubLObject why_non_kbs_raw_constantP(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject supports = NIL;
        if (NIL != non_kbs_raw_constant_p(constant)) {
            SubLObject cdolist_list_var;
            final SubLObject inclusion_exclusion_cols_list = cdolist_list_var = gethash(constant, $kbs_raw_constants_omission_table$.getDynamicValue(thread), UNPROVIDED);
            SubLObject inclusion_exclusion_cols = NIL;
            inclusion_exclusion_cols = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject inclusion_cols = inclusion_exclusion_cols.first();
                final SubLObject exclusion_cols = second(inclusion_exclusion_cols);
                supports = cons($str3$Even_though_explicitly_included_v, supports);
                SubLObject cdolist_list_var_$1 = inclusion_cols;
                SubLObject inclusion_col = NIL;
                inclusion_col = cdolist_list_var_$1.first();
                while (NIL != cdolist_list_var_$1) {
                    supports = cons(arguments.make_hl_support($ISA, make_binary_formula($$isa, constant, inclusion_col), $$InferencePSC, UNPROVIDED), supports);
                    cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                    inclusion_col = cdolist_list_var_$1.first();
                } 
                supports = cons($str5$The_constant_is_also_excluded_bec, supports);
                SubLObject cdolist_list_var_$2 = exclusion_cols;
                SubLObject exclusion_col = NIL;
                exclusion_col = cdolist_list_var_$2.first();
                while (NIL != cdolist_list_var_$2) {
                    supports = cons(arguments.make_hl_support($ISA, make_binary_formula($$isa, constant, exclusion_col), $$InferencePSC, UNPROVIDED), supports);
                    cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                    exclusion_col = cdolist_list_var_$2.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                inclusion_exclusion_cols = cdolist_list_var.first();
            } 
        }
        if (NIL == supports) {
            SubLObject cdolist_list_var2 = kbs_utilities.get_kbs_sections();
            SubLObject kbs_section = NIL;
            kbs_section = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                SubLObject cdolist_list_var_$3 = kbs_utilities.get_kbs_section_collections(kbs_section);
                SubLObject inclusion_col2 = NIL;
                inclusion_col2 = cdolist_list_var_$3.first();
                while (NIL != cdolist_list_var_$3) {
                    supports = cons(arguments.make_hl_support($ISA, make_unary_formula($$not, make_binary_formula($$isa, constant, inclusion_col2)), UNPROVIDED, UNPROVIDED), supports);
                    cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                    inclusion_col2 = cdolist_list_var_$3.first();
                } 
                cdolist_list_var2 = cdolist_list_var2.rest();
                kbs_section = cdolist_list_var2.first();
            } 
        }
        return nreverse(supports);
    }

    public static SubLObject kbs_raw_constant_omitted_p(final SubLObject v_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $kbs_raw_constants_omission_table$.getDynamicValue(thread)) {
            return gethash(v_term, $kbs_raw_constants_omission_table$.getDynamicValue(thread), UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject kbs_raw_el_formula_p(final SubLObject formula) {
        return makeBoolean(NIL == non_kbs_raw_el_formula_p(formula));
    }

    public static SubLObject non_kbs_raw_el_formula_p(final SubLObject formula) {
        return list_utilities.tree_find_if(symbol_function(NON_KBS_RAW_CONSTANT_P), formula, UNPROVIDED);
    }

    public static SubLObject reset_kbs_raw_constant_tables() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            SubLObject inclusion_size = ZERO_INTEGER;
            SubLObject omission_size = ZERO_INTEGER;
            SubLObject cdolist_list_var = kbs_utilities.get_kbs_sections();
            SubLObject kbs_section = NIL;
            kbs_section = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject collections = kbs_utilities.get_kbs_section_collections(kbs_section);
                final SubLObject omission_predicate = kbs_utilities.get_kbs_section_omission_predicate(kbs_section);
                final SubLObject omission_collections = kbs_utilities.get_kbs_section_omission_collections(kbs_section);
                SubLObject cdolist_list_var_$4 = collections;
                SubLObject collection = NIL;
                collection = cdolist_list_var_$4.first();
                while (NIL != cdolist_list_var_$4) {
                    inclusion_size = add(inclusion_size, cardinality_estimates.instance_cardinality(collection));
                    inclusion_size = add(inclusion_size, cardinality_estimates.quoted_instance_cardinality(collection));
                    cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                    collection = cdolist_list_var_$4.first();
                } 
                if (NIL != fort_types_interface.predicateP(omission_predicate)) {
                    omission_size = add(omission_size, kb_indexing.num_predicate_extent_index(omission_predicate, UNPROVIDED));
                }
                SubLObject cdolist_list_var_$5 = omission_collections;
                SubLObject omission_collection = NIL;
                omission_collection = cdolist_list_var_$5.first();
                while (NIL != cdolist_list_var_$5) {
                    omission_size = add(omission_size, cardinality_estimates.instance_cardinality(omission_collection));
                    omission_size = add(omission_size, cardinality_estimates.quoted_instance_cardinality(omission_collection));
                    cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                    omission_collection = cdolist_list_var_$5.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                kbs_section = cdolist_list_var.first();
            } 
            $kbs_raw_constants_table$.setDynamicValue(make_hash_table(inclusion_size, symbol_function(EQ), UNPROVIDED), thread);
            $kbs_definitional_constant_table$.setDynamicValue(make_hash_table(inclusion_size, symbol_function(EQ), UNPROVIDED), thread);
            $kbs_raw_constants_omission_table$.setDynamicValue(make_hash_table(omission_size, symbol_function(EQ), UNPROVIDED), thread);
            $kbs_raw_constants$.setDynamicValue(NIL, thread);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject compute_kbs_raw_constants() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        reset_kbs_raw_constant_tables();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            SubLObject cdolist_list_var = kbs_utilities.get_kbs_sections();
            SubLObject kbs_section = NIL;
            kbs_section = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject inclusion_collections = kbs_utilities.get_kbs_section_collections(kbs_section);
                final SubLObject inclusion_sets = kbs_utilities.get_kbs_section_sets(kbs_section);
                final SubLObject omission_collections = kbs_utilities.get_kbs_section_omission_collections(kbs_section);
                final SubLObject omission_predicate = kbs_utilities.get_kbs_section_omission_predicate(kbs_section);
                final SubLObject definitional_predicate_set = kbs_utilities.get_kbs_section_definitional_predicate_set(kbs_section);
                final SubLObject kbq_query_sets = kbs_utilities.get_kbs_section_kbq_query_sets(kbs_section);
                final SubLObject retained_terms = kbs_utilities.get_kbs_section_retained_terms(kbs_section);
                final SubLObject omission_terms = kbs_utilities.get_kbs_section_omission_terms(kbs_section);
                final SubLObject inclusion_constants_hash = make_hash_table($int$1000, symbol_function(EQ), UNPROVIDED);
                final SubLObject omission_constants_hash = make_hash_table($int$1000, symbol_function(EQ), UNPROVIDED);
                SubLObject inclusion_count = ZERO_INTEGER;
                SubLObject omission_count = ZERO_INTEGER;
                if (NIL != list_utilities.non_empty_list_p(inclusion_collections)) {
                    SubLObject cdolist_list_var_$6 = inclusion_collections;
                    SubLObject inclusion_collection = NIL;
                    inclusion_collection = cdolist_list_var_$6.first();
                    while (NIL != cdolist_list_var_$6) {
                        final SubLObject node_var = inclusion_collection;
                        final SubLObject _prev_bind_0_$7 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$8 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                        try {
                            sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
                            sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                            try {
                                SubLObject node_var_$9 = node_var;
                                final SubLObject deck_type = $STACK;
                                final SubLObject recur_deck = deck.create_deck(deck_type);
                                final SubLObject _prev_bind_0_$8 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                try {
                                    sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                    try {
                                        final SubLObject tv_var = NIL;
                                        final SubLObject _prev_bind_0_$9 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$9 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                            sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                            if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                                final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                                if (pcase_var.eql($ERROR)) {
                                                    sbhl_paranoia.sbhl_error(ONE_INTEGER, $str16$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                } else
                                                    if (pcase_var.eql($CERROR)) {
                                                        sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str16$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                    } else
                                                        if (pcase_var.eql($WARN)) {
                                                            Errors.warn($str16$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                        } else {
                                                            Errors.warn($str21$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                            Errors.cerror($$$continue_anyway, $str16$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                        }


                                            }
                                            final SubLObject _prev_bind_0_$10 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                            final SubLObject _prev_bind_1_$10 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
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
                                                    final SubLObject _prev_bind_0_$11 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$11 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                    final SubLObject _prev_bind_2_$17 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                        sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$9, UNPROVIDED);
                                                        while (NIL != node_var_$9) {
                                                            final SubLObject tt_node_var = node_var_$9;
                                                            SubLObject cdolist_list_var_$7;
                                                            final SubLObject accessible_modules = cdolist_list_var_$7 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                                            SubLObject module_var = NIL;
                                                            module_var = cdolist_list_var_$7.first();
                                                            while (NIL != cdolist_list_var_$7) {
                                                                final SubLObject _prev_bind_0_$12 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                final SubLObject _prev_bind_1_$12 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
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
                                                                                        final SubLObject _prev_bind_0_$13 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                            SubLObject iteration_state_$22;
                                                                                            for (iteration_state_$22 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$22); iteration_state_$22 = dictionary_contents.do_dictionary_contents_next(iteration_state_$22)) {
                                                                                                thread.resetMultipleValues();
                                                                                                final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$22);
                                                                                                final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                thread.resetMultipleValues();
                                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                    final SubLObject _prev_bind_0_$14 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                    try {
                                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                        final SubLObject sol = link_nodes;
                                                                                                        if (NIL != set.set_p(sol)) {
                                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                            SubLObject basis_object;
                                                                                                            SubLObject state;
                                                                                                            SubLObject constant;
                                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                                constant = set_contents.do_set_contents_next(basis_object, state);
                                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state, constant)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(constant, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(constant, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                    if ((NIL != forts.fort_p(constant)) && (NIL != constant_p(constant))) {
                                                                                                                        hash_table_utilities.pushnew_hash(constant, inclusion_collection, inclusion_constants_hash, UNPROVIDED);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        } else
                                                                                                            if (sol.isList()) {
                                                                                                                SubLObject csome_list_var = sol;
                                                                                                                SubLObject constant2 = NIL;
                                                                                                                constant2 = csome_list_var.first();
                                                                                                                while (NIL != csome_list_var) {
                                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(constant2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(constant2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                        if ((NIL != forts.fort_p(constant2)) && (NIL != constant_p(constant2))) {
                                                                                                                            hash_table_utilities.pushnew_hash(constant2, inclusion_collection, inclusion_constants_hash, UNPROVIDED);
                                                                                                                        }
                                                                                                                    }
                                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                                    constant2 = csome_list_var.first();
                                                                                                                } 
                                                                                                            } else {
                                                                                                                Errors.error($str22$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                            }

                                                                                                    } finally {
                                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$14, thread);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$22);
                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$13, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                            }
                                                                        } else {
                                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str23$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
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
                                                                                destructuring_bind_must_consp(current, datum, $list24);
                                                                                link_node = current.first();
                                                                                current = current.rest();
                                                                                destructuring_bind_must_consp(current, datum, $list24);
                                                                                mt2 = current.first();
                                                                                current = current.rest();
                                                                                destructuring_bind_must_consp(current, datum, $list24);
                                                                                tv2 = current.first();
                                                                                current = current.rest();
                                                                                if (NIL == current) {
                                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                                        final SubLObject _prev_bind_0_$15 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                                final SubLObject _prev_bind_0_$16 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                try {
                                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                                    final SubLObject sol;
                                                                                                    final SubLObject link_nodes2 = sol = list(link_node);
                                                                                                    if (NIL != set.set_p(sol)) {
                                                                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                        SubLObject basis_object;
                                                                                                        SubLObject state;
                                                                                                        SubLObject constant;
                                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                            constant = set_contents.do_set_contents_next(basis_object, state);
                                                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state, constant)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(constant, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(constant, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                if ((NIL != forts.fort_p(constant)) && (NIL != constant_p(constant))) {
                                                                                                                    hash_table_utilities.pushnew_hash(constant, inclusion_collection, inclusion_constants_hash, UNPROVIDED);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    } else
                                                                                                        if (sol.isList()) {
                                                                                                            SubLObject csome_list_var_$26 = sol;
                                                                                                            SubLObject constant2 = NIL;
                                                                                                            constant2 = csome_list_var_$26.first();
                                                                                                            while (NIL != csome_list_var_$26) {
                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(constant2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(constant2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                    if ((NIL != forts.fort_p(constant2)) && (NIL != constant_p(constant2))) {
                                                                                                                        hash_table_utilities.pushnew_hash(constant2, inclusion_collection, inclusion_constants_hash, UNPROVIDED);
                                                                                                                    }
                                                                                                                }
                                                                                                                csome_list_var_$26 = csome_list_var_$26.rest();
                                                                                                                constant2 = csome_list_var_$26.first();
                                                                                                            } 
                                                                                                        } else {
                                                                                                            Errors.error($str22$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                        }

                                                                                                } finally {
                                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$16, thread);
                                                                                                }
                                                                                            }
                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$15, thread);
                                                                                        }
                                                                                    }
                                                                                } else {
                                                                                    cdestructuring_bind_error(datum, $list24);
                                                                                }
                                                                                csome_list_var2 = csome_list_var2.rest();
                                                                                instance_tuple = csome_list_var2.first();
                                                                            } 
                                                                        }
                                                                    } else
                                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                            SubLObject cdolist_list_var_$8;
                                                                            final SubLObject new_list = cdolist_list_var_$8 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                            SubLObject generating_fn = NIL;
                                                                            generating_fn = cdolist_list_var_$8.first();
                                                                            while (NIL != cdolist_list_var_$8) {
                                                                                final SubLObject _prev_bind_0_$17 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                try {
                                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                    final SubLObject sol2;
                                                                                    final SubLObject link_nodes3 = sol2 = funcall(generating_fn, node);
                                                                                    if (NIL != set.set_p(sol2)) {
                                                                                        final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                                        SubLObject basis_object2;
                                                                                        SubLObject state2;
                                                                                        SubLObject constant3;
                                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                            constant3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state2, constant3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(constant3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(constant3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                if ((NIL != forts.fort_p(constant3)) && (NIL != constant_p(constant3))) {
                                                                                                    hash_table_utilities.pushnew_hash(constant3, inclusion_collection, inclusion_constants_hash, UNPROVIDED);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    } else
                                                                                        if (sol2.isList()) {
                                                                                            SubLObject csome_list_var3 = sol2;
                                                                                            SubLObject constant4 = NIL;
                                                                                            constant4 = csome_list_var3.first();
                                                                                            while (NIL != csome_list_var3) {
                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(constant4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(constant4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if ((NIL != forts.fort_p(constant4)) && (NIL != constant_p(constant4))) {
                                                                                                        hash_table_utilities.pushnew_hash(constant4, inclusion_collection, inclusion_constants_hash, UNPROVIDED);
                                                                                                    }
                                                                                                }
                                                                                                csome_list_var3 = csome_list_var3.rest();
                                                                                                constant4 = csome_list_var3.first();
                                                                                            } 
                                                                                        } else {
                                                                                            Errors.error($str22$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                                        }

                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$17, thread);
                                                                                }
                                                                                cdolist_list_var_$8 = cdolist_list_var_$8.rest();
                                                                                generating_fn = cdolist_list_var_$8.first();
                                                                            } 
                                                                        }

                                                                } finally {
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$12, thread);
                                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$12, thread);
                                                                }
                                                                cdolist_list_var_$7 = cdolist_list_var_$7.rest();
                                                                module_var = cdolist_list_var_$7.first();
                                                            } 
                                                            SubLObject cdolist_list_var_$9;
                                                            final SubLObject accessible_modules2 = cdolist_list_var_$9 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)));
                                                            SubLObject module_var2 = NIL;
                                                            module_var2 = cdolist_list_var_$9.first();
                                                            while (NIL != cdolist_list_var_$9) {
                                                                final SubLObject _prev_bind_0_$18 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                final SubLObject _prev_bind_1_$13 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                try {
                                                                    sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                    final SubLObject node2 = function_terms.naut_to_nart(node_var_$9);
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
                                                                                        final SubLObject _prev_bind_0_$19 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                                            SubLObject iteration_state_$23;
                                                                                            for (iteration_state_$23 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$23); iteration_state_$23 = dictionary_contents.do_dictionary_contents_next(iteration_state_$23)) {
                                                                                                thread.resetMultipleValues();
                                                                                                final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$23);
                                                                                                final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                                thread.resetMultipleValues();
                                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                                    final SubLObject _prev_bind_0_$20 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
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
                                                                                                                Errors.error($str22$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                                            }

                                                                                                    } finally {
                                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$20, thread);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$23);
                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$19, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                            }
                                                                        } else {
                                                                            sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str23$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                        }
                                                                    } else
                                                                        if (NIL != obsolete.cnat_p(node2, UNPROVIDED)) {
                                                                            SubLObject cdolist_list_var_$10;
                                                                            final SubLObject new_list2 = cdolist_list_var_$10 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                            SubLObject generating_fn2 = NIL;
                                                                            generating_fn2 = cdolist_list_var_$10.first();
                                                                            while (NIL != cdolist_list_var_$10) {
                                                                                final SubLObject _prev_bind_0_$21 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
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
                                                                                            Errors.error($str22$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                                        }

                                                                                } finally {
                                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$21, thread);
                                                                                }
                                                                                cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                                                                                generating_fn2 = cdolist_list_var_$10.first();
                                                                            } 
                                                                        }

                                                                } finally {
                                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$13, thread);
                                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$18, thread);
                                                                }
                                                                cdolist_list_var_$9 = cdolist_list_var_$9.rest();
                                                                module_var2 = cdolist_list_var_$9.first();
                                                            } 
                                                            node_var_$9 = deck.deck_pop(recur_deck);
                                                        } 
                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$17, thread);
                                                        sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$11, thread);
                                                        sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$11, thread);
                                                    }
                                                } else {
                                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str25$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                }
                                            } finally {
                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$10, thread);
                                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$10, thread);
                                            }
                                        } finally {
                                            sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$9, thread);
                                            sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$9, thread);
                                        }
                                    } finally {
                                        final SubLObject _prev_bind_0_$22 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values = getValuesAsVector();
                                            sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                            restoreValuesFromVector(_values);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$22, thread);
                                        }
                                    }
                                } finally {
                                    sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$8, thread);
                                }
                            } finally {
                                final SubLObject _prev_bind_0_$23 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values2 = getValuesAsVector();
                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                    restoreValuesFromVector(_values2);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$23, thread);
                                }
                            }
                        } finally {
                            sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1_$8, thread);
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$7, thread);
                        }
                        SubLObject cdolist_list_var_$11 = kbs_utilities.all_quoted_instances_enhanced(inclusion_collection, NIL);
                        SubLObject constant5 = NIL;
                        constant5 = cdolist_list_var_$11.first();
                        while (NIL != cdolist_list_var_$11) {
                            if (NIL != constant_p(constant5)) {
                                hash_table_utilities.pushnew_hash(constant5, inclusion_collection, inclusion_constants_hash, UNPROVIDED);
                            }
                            cdolist_list_var_$11 = cdolist_list_var_$11.rest();
                            constant5 = cdolist_list_var_$11.first();
                        } 
                        cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                        inclusion_collection = cdolist_list_var_$6.first();
                    } 
                } else
                    if (NIL != list_utilities.non_empty_list_p(inclusion_sets)) {
                        SubLObject cdolist_list_var_$12 = inclusion_sets;
                        SubLObject inclusion_set = NIL;
                        inclusion_set = cdolist_list_var_$12.first();
                        while (NIL != cdolist_list_var_$12) {
                            final SubLObject set_contents_var5 = set.do_set_internal(inclusion_set);
                            SubLObject basis_object5;
                            SubLObject state5;
                            SubLObject constant6;
                            for (basis_object5 = set_contents.do_set_contents_basis_object(set_contents_var5), state5 = NIL, state5 = set_contents.do_set_contents_initial_state(basis_object5, set_contents_var5); NIL == set_contents.do_set_contents_doneP(basis_object5, state5); state5 = set_contents.do_set_contents_update_state(state5)) {
                                constant6 = set_contents.do_set_contents_next(basis_object5, state5);
                                if ((NIL != set_contents.do_set_contents_element_validP(state5, constant6)) && (NIL != constant_p(constant6))) {
                                    hash_table_utilities.pushnew_hash(constant6, inclusion_set, inclusion_constants_hash, UNPROVIDED);
                                }
                            }
                            cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                            inclusion_set = cdolist_list_var_$12.first();
                        } 
                    } else
                        if (NIL != list_utilities.non_empty_list_p(kbq_query_sets)) {
                            SubLObject cdolist_list_var_$13 = kbq_query_sets;
                            SubLObject kbq_query_set = NIL;
                            kbq_query_set = cdolist_list_var_$13.first();
                            while (NIL != cdolist_list_var_$13) {
                                final SubLObject cdohash_table = keyhash.do_keyhash_nodes(kbs_kbq_query_set_terms(kbq_query_set));
                                SubLObject v_term = NIL;
                                SubLObject the_value = NIL;
                                final Iterator cdohash_iterator = getEntrySetIterator(cdohash_table);
                                try {
                                    while (iteratorHasNext(cdohash_iterator)) {
                                        final Map.Entry cdohash_entry = iteratorNextEntry(cdohash_iterator);
                                        v_term = getEntryKey(cdohash_entry);
                                        the_value = getEntryValue(cdohash_entry);
                                        if (NIL != constant_p(v_term)) {
                                            hash_table_utilities.pushnew_hash(v_term, kbq_query_set, inclusion_constants_hash, UNPROVIDED);
                                        } else {
                                            if (NIL == nart_handles.nart_p(v_term)) {
                                                continue;
                                            }
                                            SubLObject cdolist_list_var_$14 = list_utilities.find_all_if(CONSTANT_P, narts_high.nart_el_formula(v_term), UNPROVIDED);
                                            SubLObject constant7 = NIL;
                                            constant7 = cdolist_list_var_$14.first();
                                            while (NIL != cdolist_list_var_$14) {
                                                hash_table_utilities.pushnew_hash(constant7, kbq_query_set, inclusion_constants_hash, UNPROVIDED);
                                                cdolist_list_var_$14 = cdolist_list_var_$14.rest();
                                                constant7 = cdolist_list_var_$14.first();
                                            } 
                                        }
                                    } 
                                } finally {
                                    releaseEntrySetIterator(cdohash_iterator);
                                }
                                cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                                kbq_query_set = cdolist_list_var_$13.first();
                            } 
                        } else {
                            final SubLObject idx = do_constants_table();
                            final SubLObject mess = $$$mapping_Cyc_constants;
                            final SubLObject total = id_index_count(idx);
                            SubLObject sofar = ZERO_INTEGER;
                            assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
                            final SubLObject _prev_bind_0_$24 = $last_percent_progress_index$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$14 = $last_percent_progress_prediction$.currentBinding(thread);
                            final SubLObject _prev_bind_6 = $within_noting_percent_progress$.currentBinding(thread);
                            final SubLObject _prev_bind_7 = $percent_progress_start_time$.currentBinding(thread);
                            try {
                                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                $last_percent_progress_prediction$.bind(NIL, thread);
                                $within_noting_percent_progress$.bind(T, thread);
                                $percent_progress_start_time$.bind(get_universal_time(), thread);
                                try {
                                    noting_percent_progress_preamble(mess);
                                    final SubLObject idx_$45 = idx;
                                    if (NIL == id_index_objects_empty_p(idx_$45, $SKIP)) {
                                        final SubLObject idx_$46 = idx_$45;
                                        if (NIL == id_index_dense_objects_empty_p(idx_$46, $SKIP)) {
                                            final SubLObject vector_var = id_index_dense_objects(idx_$46);
                                            final SubLObject backwardP_var = NIL;
                                            SubLObject length;
                                            SubLObject v_iteration;
                                            SubLObject id;
                                            SubLObject constant8;
                                            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                                id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                                constant8 = aref(vector_var, id);
                                                if ((NIL == id_index_tombstone_p(constant8)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                                    if (NIL != id_index_tombstone_p(constant8)) {
                                                        constant8 = $SKIP;
                                                    }
                                                    hash_table_utilities.pushnew_hash(constant8, $$CycLConstant, inclusion_constants_hash, UNPROVIDED);
                                                    sofar = add(sofar, ONE_INTEGER);
                                                    note_percent_progress(sofar, total);
                                                }
                                            }
                                        }
                                        final SubLObject idx_$47 = idx_$45;
                                        if ((NIL == id_index_sparse_objects_empty_p(idx_$47)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                            final SubLObject sparse = id_index_sparse_objects(idx_$47);
                                            SubLObject id2 = id_index_sparse_id_threshold(idx_$47);
                                            final SubLObject end_id = id_index_next_id(idx_$47);
                                            final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                                            while (id2.numL(end_id)) {
                                                final SubLObject constant9 = gethash_without_values(id2, sparse, v_default);
                                                if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(constant9))) {
                                                    hash_table_utilities.pushnew_hash(constant9, $$CycLConstant, inclusion_constants_hash, UNPROVIDED);
                                                    sofar = add(sofar, ONE_INTEGER);
                                                    note_percent_progress(sofar, total);
                                                }
                                                id2 = add(id2, ONE_INTEGER);
                                            } 
                                        }
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$25 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values3 = getValuesAsVector();
                                        noting_percent_progress_postamble();
                                        restoreValuesFromVector(_values3);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$25, thread);
                                    }
                                }
                            } finally {
                                $percent_progress_start_time$.rebind(_prev_bind_7, thread);
                                $within_noting_percent_progress$.rebind(_prev_bind_6, thread);
                                $last_percent_progress_prediction$.rebind(_prev_bind_1_$14, thread);
                                $last_percent_progress_index$.rebind(_prev_bind_0_$24, thread);
                            }
                        }


                SubLObject cdolist_list_var_$15 = omission_collections;
                SubLObject omission_collection = NIL;
                omission_collection = cdolist_list_var_$15.first();
                while (NIL != cdolist_list_var_$15) {
                    final SubLObject node_var = omission_collection;
                    final SubLObject _prev_bind_0_$26 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$15 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                    try {
                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
                        sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            SubLObject node_var_$10 = node_var;
                            final SubLObject deck_type = $STACK;
                            final SubLObject recur_deck = deck.create_deck(deck_type);
                            final SubLObject _prev_bind_0_$27 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                try {
                                    final SubLObject tv_var = NIL;
                                    final SubLObject _prev_bind_0_$28 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$16 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                                    try {
                                        sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                        sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                        if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                            final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                            if (pcase_var.eql($ERROR)) {
                                                sbhl_paranoia.sbhl_error(ONE_INTEGER, $str16$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            } else
                                                if (pcase_var.eql($CERROR)) {
                                                    sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str16$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                } else
                                                    if (pcase_var.eql($WARN)) {
                                                        Errors.warn($str16$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                    } else {
                                                        Errors.warn($str21$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                        Errors.cerror($$$continue_anyway, $str16$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                                    }


                                        }
                                        final SubLObject _prev_bind_0_$29 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$17 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
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
                                                final SubLObject _prev_bind_0_$30 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                final SubLObject _prev_bind_1_$18 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                final SubLObject _prev_bind_2_$18 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                try {
                                                    sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                    sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                                    sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$10, UNPROVIDED);
                                                    while (NIL != node_var_$10) {
                                                        final SubLObject tt_node_var = node_var_$10;
                                                        SubLObject cdolist_list_var_$16;
                                                        final SubLObject accessible_modules = cdolist_list_var_$16 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                                        SubLObject module_var = NIL;
                                                        module_var = cdolist_list_var_$16.first();
                                                        while (NIL != cdolist_list_var_$16) {
                                                            final SubLObject _prev_bind_0_$31 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                            final SubLObject _prev_bind_1_$19 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
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
                                                                                    final SubLObject _prev_bind_0_$32 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                        SubLObject iteration_state_$24;
                                                                                        for (iteration_state_$24 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$24); iteration_state_$24 = dictionary_contents.do_dictionary_contents_next(iteration_state_$24)) {
                                                                                            thread.resetMultipleValues();
                                                                                            final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$24);
                                                                                            final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                            thread.resetMultipleValues();
                                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                final SubLObject _prev_bind_0_$33 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                try {
                                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                    final SubLObject sol = link_nodes;
                                                                                                    if (NIL != set.set_p(sol)) {
                                                                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                        SubLObject basis_object;
                                                                                                        SubLObject state;
                                                                                                        SubLObject constant;
                                                                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                            constant = set_contents.do_set_contents_next(basis_object, state);
                                                                                                            if ((NIL != set_contents.do_set_contents_element_validP(state, constant)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(constant, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(constant, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                if ((NIL != forts.fort_p(constant)) && (NIL != constant_p(constant))) {
                                                                                                                    hash_table_utilities.pushnew_hash(constant, omission_collection, omission_constants_hash, UNPROVIDED);
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    } else
                                                                                                        if (sol.isList()) {
                                                                                                            SubLObject csome_list_var = sol;
                                                                                                            SubLObject constant2 = NIL;
                                                                                                            constant2 = csome_list_var.first();
                                                                                                            while (NIL != csome_list_var) {
                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(constant2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(constant2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                    if ((NIL != forts.fort_p(constant2)) && (NIL != constant_p(constant2))) {
                                                                                                                        hash_table_utilities.pushnew_hash(constant2, omission_collection, omission_constants_hash, UNPROVIDED);
                                                                                                                    }
                                                                                                                }
                                                                                                                csome_list_var = csome_list_var.rest();
                                                                                                                constant2 = csome_list_var.first();
                                                                                                            } 
                                                                                                        } else {
                                                                                                            Errors.error($str22$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                        }

                                                                                                } finally {
                                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$33, thread);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$24);
                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$32, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                        }
                                                                    } else {
                                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str23$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
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
                                                                            destructuring_bind_must_consp(current, datum, $list24);
                                                                            link_node = current.first();
                                                                            current = current.rest();
                                                                            destructuring_bind_must_consp(current, datum, $list24);
                                                                            mt2 = current.first();
                                                                            current = current.rest();
                                                                            destructuring_bind_must_consp(current, datum, $list24);
                                                                            tv2 = current.first();
                                                                            current = current.rest();
                                                                            if (NIL == current) {
                                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                                    final SubLObject _prev_bind_0_$34 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                            final SubLObject _prev_bind_0_$35 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                                final SubLObject sol;
                                                                                                final SubLObject link_nodes2 = sol = list(link_node);
                                                                                                if (NIL != set.set_p(sol)) {
                                                                                                    final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                    SubLObject basis_object;
                                                                                                    SubLObject state;
                                                                                                    SubLObject constant;
                                                                                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                        constant = set_contents.do_set_contents_next(basis_object, state);
                                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state, constant)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(constant, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(constant, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            if ((NIL != forts.fort_p(constant)) && (NIL != constant_p(constant))) {
                                                                                                                hash_table_utilities.pushnew_hash(constant, omission_collection, omission_constants_hash, UNPROVIDED);
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                } else
                                                                                                    if (sol.isList()) {
                                                                                                        SubLObject csome_list_var_$27 = sol;
                                                                                                        SubLObject constant2 = NIL;
                                                                                                        constant2 = csome_list_var_$27.first();
                                                                                                        while (NIL != csome_list_var_$27) {
                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(constant2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(constant2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                if ((NIL != forts.fort_p(constant2)) && (NIL != constant_p(constant2))) {
                                                                                                                    hash_table_utilities.pushnew_hash(constant2, omission_collection, omission_constants_hash, UNPROVIDED);
                                                                                                                }
                                                                                                            }
                                                                                                            csome_list_var_$27 = csome_list_var_$27.rest();
                                                                                                            constant2 = csome_list_var_$27.first();
                                                                                                        } 
                                                                                                    } else {
                                                                                                        Errors.error($str22$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                    }

                                                                                            } finally {
                                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$35, thread);
                                                                                            }
                                                                                        }
                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$34, thread);
                                                                                    }
                                                                                }
                                                                            } else {
                                                                                cdestructuring_bind_error(datum, $list24);
                                                                            }
                                                                            csome_list_var2 = csome_list_var2.rest();
                                                                            instance_tuple = csome_list_var2.first();
                                                                        } 
                                                                    }
                                                                } else
                                                                    if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                        SubLObject cdolist_list_var_$17;
                                                                        final SubLObject new_list = cdolist_list_var_$17 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                        SubLObject generating_fn = NIL;
                                                                        generating_fn = cdolist_list_var_$17.first();
                                                                        while (NIL != cdolist_list_var_$17) {
                                                                            final SubLObject _prev_bind_0_$36 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                final SubLObject sol2;
                                                                                final SubLObject link_nodes3 = sol2 = funcall(generating_fn, node);
                                                                                if (NIL != set.set_p(sol2)) {
                                                                                    final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                                    SubLObject basis_object2;
                                                                                    SubLObject state2;
                                                                                    SubLObject constant3;
                                                                                    for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                        constant3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                        if ((NIL != set_contents.do_set_contents_element_validP(state2, constant3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(constant3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(constant3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                            if ((NIL != forts.fort_p(constant3)) && (NIL != constant_p(constant3))) {
                                                                                                hash_table_utilities.pushnew_hash(constant3, omission_collection, omission_constants_hash, UNPROVIDED);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                } else
                                                                                    if (sol2.isList()) {
                                                                                        SubLObject csome_list_var3 = sol2;
                                                                                        SubLObject constant4 = NIL;
                                                                                        constant4 = csome_list_var3.first();
                                                                                        while (NIL != csome_list_var3) {
                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(constant4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(constant4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                if ((NIL != forts.fort_p(constant4)) && (NIL != constant_p(constant4))) {
                                                                                                    hash_table_utilities.pushnew_hash(constant4, omission_collection, omission_constants_hash, UNPROVIDED);
                                                                                                }
                                                                                            }
                                                                                            csome_list_var3 = csome_list_var3.rest();
                                                                                            constant4 = csome_list_var3.first();
                                                                                        } 
                                                                                    } else {
                                                                                        Errors.error($str22$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                                    }

                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$36, thread);
                                                                            }
                                                                            cdolist_list_var_$17 = cdolist_list_var_$17.rest();
                                                                            generating_fn = cdolist_list_var_$17.first();
                                                                        } 
                                                                    }

                                                            } finally {
                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$19, thread);
                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$31, thread);
                                                            }
                                                            cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                                                            module_var = cdolist_list_var_$16.first();
                                                        } 
                                                        SubLObject cdolist_list_var_$18;
                                                        final SubLObject accessible_modules2 = cdolist_list_var_$18 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)));
                                                        SubLObject module_var2 = NIL;
                                                        module_var2 = cdolist_list_var_$18.first();
                                                        while (NIL != cdolist_list_var_$18) {
                                                            final SubLObject _prev_bind_0_$37 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                            final SubLObject _prev_bind_1_$20 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                            try {
                                                                sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                final SubLObject node2 = function_terms.naut_to_nart(node_var_$10);
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
                                                                                    final SubLObject _prev_bind_0_$38 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                                        SubLObject iteration_state_$25;
                                                                                        for (iteration_state_$25 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$25); iteration_state_$25 = dictionary_contents.do_dictionary_contents_next(iteration_state_$25)) {
                                                                                            thread.resetMultipleValues();
                                                                                            final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$25);
                                                                                            final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                            thread.resetMultipleValues();
                                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                                final SubLObject _prev_bind_0_$39 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
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
                                                                                                            Errors.error($str22$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                                        }

                                                                                                } finally {
                                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$39, thread);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$25);
                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$38, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                        }
                                                                    } else {
                                                                        sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str23$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                    }
                                                                } else
                                                                    if (NIL != obsolete.cnat_p(node2, UNPROVIDED)) {
                                                                        SubLObject cdolist_list_var_$19;
                                                                        final SubLObject new_list2 = cdolist_list_var_$19 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                        SubLObject generating_fn2 = NIL;
                                                                        generating_fn2 = cdolist_list_var_$19.first();
                                                                        while (NIL != cdolist_list_var_$19) {
                                                                            final SubLObject _prev_bind_0_$40 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
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
                                                                                        Errors.error($str22$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                                    }

                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$40, thread);
                                                                            }
                                                                            cdolist_list_var_$19 = cdolist_list_var_$19.rest();
                                                                            generating_fn2 = cdolist_list_var_$19.first();
                                                                        } 
                                                                    }

                                                            } finally {
                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$20, thread);
                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$37, thread);
                                                            }
                                                            cdolist_list_var_$18 = cdolist_list_var_$18.rest();
                                                            module_var2 = cdolist_list_var_$18.first();
                                                        } 
                                                        node_var_$10 = deck.deck_pop(recur_deck);
                                                    } 
                                                } finally {
                                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$18, thread);
                                                    sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$18, thread);
                                                    sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$30, thread);
                                                }
                                            } else {
                                                sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str25$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                            }
                                        } finally {
                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                            sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                            sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$17, thread);
                                            sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$29, thread);
                                        }
                                    } finally {
                                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$16, thread);
                                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$28, thread);
                                    }
                                } finally {
                                    final SubLObject _prev_bind_0_$41 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values4 = getValuesAsVector();
                                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                        restoreValuesFromVector(_values4);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$41, thread);
                                    }
                                }
                            } finally {
                                sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$27, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$42 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values5 = getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                restoreValuesFromVector(_values5);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$42, thread);
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1_$15, thread);
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$26, thread);
                    }
                    SubLObject cdolist_list_var_$20 = kbs_utilities.all_quoted_instances_enhanced(omission_collection, NIL);
                    SubLObject constant5 = NIL;
                    constant5 = cdolist_list_var_$20.first();
                    while (NIL != cdolist_list_var_$20) {
                        if (NIL != constant_p(constant5)) {
                            hash_table_utilities.pushnew_hash(constant5, omission_collection, omission_constants_hash, UNPROVIDED);
                        }
                        cdolist_list_var_$20 = cdolist_list_var_$20.rest();
                        constant5 = cdolist_list_var_$20.first();
                    } 
                    cdolist_list_var_$15 = cdolist_list_var_$15.rest();
                    omission_collection = cdolist_list_var_$15.first();
                } 
                if (NIL != fort_types_interface.predicateP(omission_predicate)) {
                    final SubLObject pred_var = omission_predicate;
                    if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                        final SubLObject str = NIL;
                        final SubLObject _prev_bind_0_$43 = $progress_start_time$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$21 = $progress_last_pacification_time$.currentBinding(thread);
                        final SubLObject _prev_bind_8 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                        final SubLObject _prev_bind_9 = $progress_notification_count$.currentBinding(thread);
                        final SubLObject _prev_bind_10 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                        final SubLObject _prev_bind_11 = $progress_count$.currentBinding(thread);
                        final SubLObject _prev_bind_12 = $is_noting_progressP$.currentBinding(thread);
                        final SubLObject _prev_bind_13 = $silent_progressP$.currentBinding(thread);
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
                            SubLObject done_var = NIL;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    note_progress();
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                        SubLObject done_var_$85 = NIL;
                                        final SubLObject token_var_$86 = NIL;
                                        while (NIL == done_var_$85) {
                                            final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$86);
                                            final SubLObject valid_$87 = makeBoolean(!token_var_$86.eql(ass));
                                            if (NIL != valid_$87) {
                                                final SubLObject constant10 = assertions_high.gaf_arg1(ass);
                                                if (NIL != constant_p(constant10)) {
                                                    hash_table_utilities.pushnew_hash(constant10, omission_predicate, omission_constants_hash, UNPROVIDED);
                                                }
                                            }
                                            done_var_$85 = makeBoolean(NIL == valid_$87);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_0_$44 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values6 = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values6);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$44, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            } 
                            noting_progress_postamble();
                        } finally {
                            $silent_progressP$.rebind(_prev_bind_13, thread);
                            $is_noting_progressP$.rebind(_prev_bind_12, thread);
                            $progress_count$.rebind(_prev_bind_11, thread);
                            $progress_pacifications_since_last_nl$.rebind(_prev_bind_10, thread);
                            $progress_notification_count$.rebind(_prev_bind_9, thread);
                            $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_8, thread);
                            $progress_last_pacification_time$.rebind(_prev_bind_1_$21, thread);
                            $progress_start_time$.rebind(_prev_bind_0_$43, thread);
                        }
                    }
                }
                SubLObject cdolist_list_var_$21 = retained_terms;
                SubLObject force_retained_term = NIL;
                force_retained_term = cdolist_list_var_$21.first();
                while (NIL != cdolist_list_var_$21) {
                    if (NIL != gethash(force_retained_term, omission_constants_hash, UNPROVIDED)) {
                        Errors.warn($str32$Overriding_constant__A_omission__, force_retained_term, gethash(force_retained_term, omission_constants_hash, UNPROVIDED));
                        remhash(force_retained_term, omission_constants_hash);
                    }
                    hash_table_utilities.pushnew_hash(force_retained_term, $$kbsProfileRetainTerm, inclusion_constants_hash, UNPROVIDED);
                    cdolist_list_var_$21 = cdolist_list_var_$21.rest();
                    force_retained_term = cdolist_list_var_$21.first();
                } 
                SubLObject cdolist_list_var_$22 = omission_terms;
                SubLObject force_excluded_term = NIL;
                force_excluded_term = cdolist_list_var_$22.first();
                while (NIL != cdolist_list_var_$22) {
                    hash_table_utilities.pushnew_hash(force_excluded_term, $$kbsProfileRemoveFORT, omission_constants_hash, UNPROVIDED);
                    cdolist_list_var_$22 = cdolist_list_var_$22.rest();
                    force_excluded_term = cdolist_list_var_$22.first();
                } 
                SubLObject constant11 = NIL;
                SubLObject inclusion_reason = NIL;
                final Iterator cdohash_iterator2 = getEntrySetIterator(inclusion_constants_hash);
                try {
                    while (iteratorHasNext(cdohash_iterator2)) {
                        final Map.Entry cdohash_entry2 = iteratorNextEntry(cdohash_iterator2);
                        constant11 = getEntryKey(cdohash_entry2);
                        inclusion_reason = getEntryValue(cdohash_entry2);
                        final SubLObject exclusion_reason = gethash(constant11, omission_constants_hash, UNPROVIDED);
                        if (NIL != exclusion_reason) {
                            if ((NIL == gethash(constant11, $kbs_raw_constants_table$.getDynamicValue(thread), UNPROVIDED)) && (NIL == gethash(constant11, $kbs_raw_constants_omission_table$.getDynamicValue(thread), UNPROVIDED))) {
                                hash_table_utilities.pushnew_hash(constant11, list(inclusion_reason, exclusion_reason), $kbs_raw_constants_omission_table$.getDynamicValue(thread), UNPROVIDED);
                                remhash(constant11, $kbs_raw_constants_table$.getDynamicValue(thread));
                            }
                            omission_count = add(omission_count, ONE_INTEGER);
                        } else {
                            if ((NIL != definitional_predicate_set) && (NIL == gethash(constant11, $kbs_raw_constants_table$.getDynamicValue(thread), UNPROVIDED))) {
                                sethash(constant11, $kbs_definitional_constant_table$.getDynamicValue(thread), definitional_predicate_set);
                            }
                            SubLObject cdolist_list_var_$23 = inclusion_reason;
                            SubLObject inclusion_reason_col = NIL;
                            inclusion_reason_col = cdolist_list_var_$23.first();
                            while (NIL != cdolist_list_var_$23) {
                                hash_table_utilities.pushnew_hash(constant11, inclusion_reason_col, $kbs_raw_constants_table$.getDynamicValue(thread), UNPROVIDED);
                                cdolist_list_var_$23 = cdolist_list_var_$23.rest();
                                inclusion_reason_col = cdolist_list_var_$23.first();
                            } 
                            inclusion_count = add(inclusion_count, ONE_INTEGER);
                        }
                    } 
                } finally {
                    releaseEntrySetIterator(cdohash_iterator2);
                }
                format(T, $str35$___S_constants_included_via_the_c, inclusion_count, inclusion_collections);
                if ((NIL != omission_collections) || (NIL != omission_predicate)) {
                    format(T, $str36$___S_constants_omitted_via_the__A, new SubLObject[]{ omission_count, NIL != omission_collections ? $$$collections_ : $str38$, NIL != omission_predicate ? $str39$_predicate_ : $str38$, NIL != omission_collections ? omission_collections : $str38$, NIL != omission_predicate ? omission_predicate : $str38$ });
                }
                cdolist_list_var = cdolist_list_var.rest();
                kbs_section = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        format(T, $str40$___S_total_constants_included___, hash_table_count($kbs_raw_constants_table$.getDynamicValue(thread)));
        format(T, $str41$___S_total_constants_omitted___, hash_table_count($kbs_raw_constants_omission_table$.getDynamicValue(thread)));
        if (!$int$1000.numL(hash_table_count($kbs_raw_constants_omission_table$.getDynamicValue(thread)))) {
            format(T, $str42$__Omitted_constants__);
            final SubLObject cdohash_table2 = $kbs_raw_constants_omission_table$.getDynamicValue(thread);
            SubLObject constant12 = NIL;
            SubLObject reason = NIL;
            final Iterator cdohash_iterator3 = getEntrySetIterator(cdohash_table2);
            try {
                while (iteratorHasNext(cdohash_iterator3)) {
                    final Map.Entry cdohash_entry3 = iteratorNextEntry(cdohash_iterator3);
                    constant12 = getEntryKey(cdohash_entry3);
                    reason = getEntryValue(cdohash_entry3);
                    format(T, $str43$_A_, constant12);
                } 
            } finally {
                releaseEntrySetIterator(cdohash_iterator3);
            }
            format(T, $str44$__);
        }
        final SubLObject cdohash_table2 = $kbs_raw_constants_table$.getDynamicValue(thread);
        SubLObject constant12 = NIL;
        SubLObject v = NIL;
        final Iterator cdohash_iterator3 = getEntrySetIterator(cdohash_table2);
        try {
            while (iteratorHasNext(cdohash_iterator3)) {
                final Map.Entry cdohash_entry3 = iteratorNextEntry(cdohash_iterator3);
                constant12 = getEntryKey(cdohash_entry3);
                v = getEntryValue(cdohash_entry3);
                if (NIL == gethash(constant12, $kbs_raw_constants_omission_table$.getDynamicValue(thread), UNPROVIDED)) {
                    $kbs_raw_constants$.setDynamicValue(cons(constant12, $kbs_raw_constants$.getDynamicValue(thread)), thread);
                }
            } 
        } finally {
            releaseEntrySetIterator(cdohash_iterator3);
        }
        format(T, $str45$____S_total_raw_KBS_constants_ide, length($kbs_raw_constants$.getDynamicValue(thread)));
        return $kbs_raw_constants$.getDynamicValue(thread);
    }

    public static SubLObject clear_kbs_kbq_query_set_terms() {
        final SubLObject cs = $kbs_kbq_query_set_terms_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_kbs_kbq_query_set_terms(final SubLObject kbq_query_set) {
        return memoization_state.caching_state_remove_function_results_with_args($kbs_kbq_query_set_terms_caching_state$.getGlobalValue(), list(kbq_query_set), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject kbs_kbq_query_set_terms_internal(final SubLObject kbq_query_set) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return inference_utilities.gather_vocab_required_for_kbq_query_set(list($$TheSetOf, $sym48$_Q, list($$thereExists, $sym50$_T, listS($$and, list($$isa, $sym50$_T, kbq_query_set), $list52))), $int$300, NIL, StreamsLow.$standard_output$.getDynamicValue(thread));
    }

    public static SubLObject kbs_kbq_query_set_terms(final SubLObject kbq_query_set) {
        SubLObject caching_state = $kbs_kbq_query_set_terms_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(KBS_KBQ_QUERY_SET_TERMS, $kbs_kbq_query_set_terms_caching_state$, FIFTEEN_INTEGER, EQL, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, kbq_query_set, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(kbs_kbq_query_set_terms_internal(kbq_query_set)));
            memoization_state.caching_state_put(caching_state, kbq_query_set, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject kbs_skolems() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $kbs_skolems$.getDynamicValue(thread);
    }

    public static SubLObject kbs_skolem_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP(v_object, $kbs_skolems$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject compute_kbs_skolems() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.new_memoization_state(UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                if ((((NIL == $kbs_raw_constants$.getDynamicValue(thread)) || (!$kbs_raw_constants_table$.getDynamicValue(thread).isHashtable())) || (!$kbs_raw_constants_omission_table$.getDynamicValue(thread).isHashtable())) || (!$kbs_definitional_constant_table$.getDynamicValue(thread).isHashtable())) {
                    Errors.cerror($$$Continue, $str56$compute_kbs_skolems_requirements_);
                }
                SubLObject all_skolems = NIL;
                SubLObject kbs_skolems = NIL;
                final SubLObject _prev_bind_0_$92 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    all_skolems = isa.all_fort_instances($$SkolemFunction, UNPROVIDED, UNPROVIDED);
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$92, thread);
                }
                final SubLObject list_var = all_skolems;
                final SubLObject _prev_bind_0_$93 = $progress_note$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $progress_total$.currentBinding(thread);
                final SubLObject _prev_bind_5 = $progress_sofar$.currentBinding(thread);
                final SubLObject _prev_bind_6 = $last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_7 = $last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_8 = $within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_9 = $percent_progress_start_time$.currentBinding(thread);
                try {
                    $progress_note$.bind($$$Computing_KBS_skolems, thread);
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
                        SubLObject skolem = NIL;
                        skolem = csome_list_var.first();
                        while (NIL != csome_list_var) {
                            if (NIL != compute_kbs_skolem_p(skolem)) {
                                kbs_skolems = cons(skolem, kbs_skolems);
                            }
                            $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                            note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                            csome_list_var = csome_list_var.rest();
                            skolem = csome_list_var.first();
                        } 
                    } finally {
                        final SubLObject _prev_bind_0_$94 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            noting_percent_progress_postamble();
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$94, thread);
                        }
                    }
                } finally {
                    $percent_progress_start_time$.rebind(_prev_bind_9, thread);
                    $within_noting_percent_progress$.rebind(_prev_bind_8, thread);
                    $last_percent_progress_prediction$.rebind(_prev_bind_7, thread);
                    $last_percent_progress_index$.rebind(_prev_bind_6, thread);
                    $progress_sofar$.rebind(_prev_bind_5, thread);
                    $progress_total$.rebind(_prev_bind_4, thread);
                    $progress_start_time$.rebind(_prev_bind_3, thread);
                    $progress_note$.rebind(_prev_bind_0_$93, thread);
                }
                $kbs_skolems$.setDynamicValue(kbs_skolems, thread);
                format(T, $str60$____S_total_KBS_skolems_identifie, length($kbs_skolems$.getDynamicValue(thread)));
            } finally {
                final SubLObject _prev_bind_0_$95 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$95, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject compute_kbs_skolem_p(final SubLObject skolem) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        if (NIL != constant_p(skolem)) {
            final SubLObject defining_assertions = skolems.skolem_defn_assertions_robust(skolem, UNPROVIDED);
            if (NIL != defining_assertions) {
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    SubLObject non_kbs;
                    SubLObject rest;
                    SubLObject assertion;
                    for (non_kbs = NIL, rest = NIL, rest = defining_assertions; (NIL == non_kbs) && (NIL != rest); non_kbs = makeBoolean(NIL == compute_kbs_skolem_assertion_p(skolem, assertion)) , rest = rest.rest()) {
                        assertion = rest.first();
                    }
                    result = makeBoolean(NIL == non_kbs);
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
        }
        return result;
    }

    public static SubLObject compute_kbs_skolem_assertion_p(final SubLObject skolem, final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != list_utilities.tree_find_if(symbol_function(KBS_SKOLEM_ASSERTION_FAST_FAIL_CONSTANT_P), assertions_high.assertion_cons(assertion), UNPROVIDED)) {
            return NIL;
        }
        thread.resetMultipleValues();
        final SubLObject el_formula = uncanonicalizer.assertion_el_formula_memoized(assertion);
        final SubLObject el_mt = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if ((((NIL == el_formula) || (NIL != list_utilities.tree_find(skolem, el_formula, UNPROVIDED, UNPROVIDED))) || (NIL != non_kbs_raw_el_formula_p(el_mt))) || (NIL != non_kbs_raw_el_formula_p(el_formula))) {
            return NIL;
        }
        return T;
    }

    public static SubLObject kbs_skolem_assertion_fast_fail_constant_p(final SubLObject v_object) {
        return makeBoolean(((NIL != constant_p(v_object)) && (NIL == kbs_raw_constant_p(v_object))) && (NIL == fort_types_interface.skolem_function_p(v_object)));
    }

    public static SubLObject kbs_constants() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $kbs_constants$.getDynamicValue(thread);
    }

    public static SubLObject kbs_constant_p(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return keyhash.getkeyhash(constant, $kbs_constant_table$.getDynamicValue(thread));
    }

    public static SubLObject non_kbs_constant_p(final SubLObject constant) {
        return makeBoolean((NIL != constant_p(constant)) && (NIL == kbs_constant_p(constant)));
    }

    public static SubLObject initialize_kbs_constant_table() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject kbs_constants = kbs_constants();
        $kbs_constant_table$.setDynamicValue(keyhash_utilities.keyhash_list_elements(kbs_constants, symbol_function(EQ), UNPROVIDED), thread);
        return keyhash.keyhash_count($kbs_constant_table$.getDynamicValue(thread));
    }

    public static SubLObject compute_kbs_constants() {
        compute_kbs_raw_constants();
        compute_kbs_skolems();
        final SubLObject tiny_constants = core.all_core_constants();
        final SubLObject kbs_raw_constants = kbs_raw_constants();
        final SubLObject kbs_skolems = kbs_skolems();
        $kbs_constants$.setDynamicValue(list_utilities.remove_duplicate_forts(cconcatenate(tiny_constants, new SubLObject[]{ kbs_raw_constants, kbs_skolems })));
        initialize_kbs_constant_table();
        return NIL;
    }

    public static SubLObject kbs_narts() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $kbs_narts$.getDynamicValue(thread);
    }

    public static SubLObject kbs_nart_p(final SubLObject nart) {
        return makeBoolean(((NIL != kbs_nart_formula_p(narts_high.nart_el_formula(nart))) && (NIL == list_utilities.member_equalP(nart, kbs_utilities.get_kbs_section_omission_terms(kbs_utilities.get_kbs_sections().first())))) && (NIL != (NIL != Strings.stringE($$$akb, kbs_utilities.get_kbs_name(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) ? makeBoolean((((NIL == kbs_utilities.quoted_isa_enhanced_in_any_mtP(nart, $$TKBTerm_Proprietary)) && (NIL == isa.isa_in_any_mtP(nart, $$TKBTerm_Proprietary))) || (NIL != kbs_utilities.quoted_isa_enhanced_in_any_mtP(nart, $$ProprietaryTerm))) || (NIL != isa.isa_in_any_mtP(nart, $$ProprietaryTerm))) : NIL != Strings.stringE($$$cyfi, kbs_utilities.get_kbs_name(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) ? makeBoolean(((((((((((NIL != kbs_utilities.quoted_isa_enhanced_in_any_mtP(nart, $$Cy_FiProprietaryTerm)) || (NIL != isa.isa_in_any_mtP(nart, $$Cy_FiProprietaryTerm))) || ((((NIL == kbs_utilities.quoted_isa_enhanced_in_any_mtP(nart, $$ResearchCycConstant)) && (NIL == isa.isa_in_any_mtP(nart, $$ResearchCycConstant))) && (NIL == kbs_utilities.quoted_isa_enhanced_in_any_mtP(nart, $$ScaffoldingConstant))) && (NIL == isa.isa_in_any_mtP(nart, $$ScaffoldingConstant)))) || (NIL != kbs_utilities.quoted_isa_enhanced_in_any_mtP(nart, $$ProprietaryTerm))) || (NIL != isa.isa_in_any_mtP(nart, $$ProprietaryTerm))) || (NIL != kbs_utilities.quoted_isa_enhanced_in_any_mtP(nart, $$TerroristAgent))) || (NIL != isa.isa_in_any_mtP(nart, $$TerroristAgent))) || (NIL != kbs_utilities.quoted_isa_enhanced_in_any_mtP(nart, $$TerroristAct))) || (NIL != isa.isa_in_any_mtP(nart, $$TerroristAct))) || (NIL != kbs_utilities.quoted_isa_enhanced_in_any_mtP(nart, $$HostileSocialAction))) || (NIL != isa.isa_in_any_mtP(nart, $$HostileSocialAction))) : NIL != Strings.stringE($$$research, kbs_utilities.get_kbs_name(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED) ? makeBoolean((((((((NIL == kbs_utilities.quoted_isa_enhanced_in_any_mtP(nart, $$ProprietaryTerm)) && (NIL == isa.isa_in_any_mtP(nart, $$ProprietaryTerm))) && (NIL == kbs_utilities.quoted_isa_enhanced_in_any_mtP(nart, $$TerroristAgent))) && (NIL == isa.isa_in_any_mtP(nart, $$TerroristAgent))) && (NIL == kbs_utilities.quoted_isa_enhanced_in_any_mtP(nart, $$TerroristAct))) && (NIL == isa.isa_in_any_mtP(nart, $$TerroristAct))) && (NIL == kbs_utilities.quoted_isa_enhanced_in_any_mtP(nart, $$HostileSocialAction))) && (NIL == isa.isa_in_any_mtP(nart, $$HostileSocialAction))) : T)));
    }

    public static SubLObject kbs_nart_formula_p(final SubLObject nart_formula) {
        return makeBoolean(nart_formula.isCons() && (NIL == list_utilities.tree_find_if(symbol_function(NON_KBS_CONSTANT_P), nart_formula, UNPROVIDED)));
    }

    public static SubLObject compute_kbs_narts() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject narts = NIL;
        final SubLObject idx = nart_handles.do_narts_table();
        final SubLObject mess = $$$Computing_KBS_narts;
        final SubLObject total = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
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
                final SubLObject idx_$96 = idx;
                if (NIL == id_index_objects_empty_p(idx_$96, $SKIP)) {
                    final SubLObject idx_$97 = idx_$96;
                    if (NIL == id_index_dense_objects_empty_p(idx_$97, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$97);
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
                                if (NIL != kbs_nart_p(nart)) {
                                    narts = cons(nart, narts);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$98 = idx_$96;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$98)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$98);
                        SubLObject id2 = id_index_sparse_id_threshold(idx_$98);
                        final SubLObject end_id = id_index_next_id(idx_$98);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (id2.numL(end_id)) {
                            final SubLObject nart2 = gethash_without_values(id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(nart2))) {
                                if (NIL != kbs_nart_p(nart2)) {
                                    narts = cons(nart2, narts);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            id2 = add(id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$99 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$99, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        $kbs_narts$.setDynamicValue(narts, thread);
        format(T, $str75$____S_total_KBS_NARTs_identified_, length($kbs_narts$.getDynamicValue(thread)));
        return NIL;
    }

    public static SubLObject kbs_forts() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $kbs_forts$.getDynamicValue(thread);
    }

    public static SubLObject kbs_fort_p(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return keyhash.getkeyhash(fort, $kbs_fort_table$.getDynamicValue(thread));
    }

    public static SubLObject why_kbs_fortP(final SubLObject fort) {
        SubLObject supports = NIL;
        if (NIL != constant_p(fort)) {
            SubLObject cdolist_list_var = why_kbs_raw_constantP(fort);
            SubLObject support = NIL;
            support = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                supports = cons(support, supports);
                cdolist_list_var = cdolist_list_var.rest();
                support = cdolist_list_var.first();
            } 
        } else {
            supports = cons($str76$All_KB_subset_requirements_met_, supports);
        }
        final SubLObject splicing_gafs = kbs_add_redundant.kbs_additional_redundant_definitional_info(fort);
        if (NIL != splicing_gafs) {
            supports = cons($str38$, supports);
            supports = cons($str77$Also__the_following_GAFs_will_be_, supports);
            SubLObject cdolist_list_var2 = splicing_gafs;
            SubLObject splicing_gaf = NIL;
            splicing_gaf = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                final SubLObject formula = splicing_gaf.first();
                final SubLObject mt = second(splicing_gaf);
                supports = cons(arguments.make_hl_support($OPAQUE, formula, mt, UNPROVIDED), supports);
                cdolist_list_var2 = cdolist_list_var2.rest();
                splicing_gaf = cdolist_list_var2.first();
            } 
        }
        return nreverse(supports);
    }

    public static SubLObject non_kbs_fort_p(final SubLObject fort) {
        return makeBoolean((NIL != forts.fort_p(fort)) && (NIL == kbs_fort_p(fort)));
    }

    public static SubLObject why_non_kbs_fortP(final SubLObject fort) {
        if (NIL != constant_p(fort)) {
            return why_non_kbs_raw_constantP(fort);
        }
        final SubLObject fort_el_formula = forts.fort_el_formula(fort);
        final SubLObject fort_non_forts = list_utilities.remove_duplicate_forts(list_utilities.tree_find_all_if(NON_KBS_FORT_P, fort_el_formula, UNPROVIDED));
        SubLObject supports = NIL;
        supports = cons($str80$The_term_contains_terms_not_in_th, supports);
        SubLObject cdolist_list_var = fort_non_forts;
        SubLObject fort_non_fort = NIL;
        fort_non_fort = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            supports = cons(fort_non_fort, supports);
            cdolist_list_var = cdolist_list_var.rest();
            fort_non_fort = cdolist_list_var.first();
        } 
        return nreverse(supports);
    }

    public static SubLObject kbs_definitional_fort_p(final SubLObject fort) {
        if (NIL != constant_p(fort)) {
            return kbs_definitional_constant_p(fort);
        }
        if (NIL != nart_handles.nart_p(fort)) {
            return list_utilities.tree_find_if(KBS_DEFINITIONAL_FORT_P, narts_high.nart_el_formula(fort), UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject non_kbs_definitional_fort_p(final SubLObject fort) {
        return makeBoolean(NIL == kbs_definitional_fort_p(fort));
    }

    public static SubLObject initialize_kbs_fort_table() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject kbs_forts = kbs_forts();
        $kbs_fort_table$.setDynamicValue(keyhash_utilities.keyhash_list_elements(kbs_forts, symbol_function(EQ), UNPROVIDED), thread);
        return keyhash.keyhash_count($kbs_fort_table$.getDynamicValue(thread));
    }

    public static SubLObject unmark_kbs_fort(final SubLObject fort) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return keyhash.remkeyhash(fort, $kbs_fort_table$.getDynamicValue(thread));
    }

    public static SubLObject unmark_kbs_fort_and_dependents(final SubLObject fort) {
        SubLObject assertion_count = ZERO_INTEGER;
        SubLObject fort_count = ZERO_INTEGER;
        if (NIL != kbs_fort_p(fort)) {
            unmark_kbs_fort(fort);
            fort_count = add(fort_count, ONE_INTEGER);
            if (NIL != kb_mapping_macros.do_term_index_key_validator(fort, NIL)) {
                final SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator(fort, NIL);
                SubLObject done_var = NIL;
                final SubLObject token_var = NIL;
                while (NIL == done_var) {
                    final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                    final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                    if (NIL != valid) {
                        SubLObject final_index_iterator = NIL;
                        try {
                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, NIL, NIL, NIL);
                            SubLObject done_var_$100 = NIL;
                            final SubLObject token_var_$101 = NIL;
                            while (NIL == done_var_$100) {
                                final SubLObject a = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$101);
                                final SubLObject valid_$102 = makeBoolean(!token_var_$101.eql(a));
                                if ((NIL != valid_$102) && (NIL != kb_mapping_macros.do_term_index_assertion_match_p(a, final_index_spec))) {
                                    if (NIL != function_terms.tou_assertionP(a)) {
                                        unmark_kbs_fort_and_dependents(assertions_high.gaf_arg1(a));
                                    }
                                    if (NIL != kbs_assertion_p(a)) {
                                        unmark_kbs_assertion(a);
                                        assertion_count = add(assertion_count, ONE_INTEGER);
                                    }
                                }
                                done_var_$100 = makeBoolean(NIL == valid_$102);
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
        }
        return values(fort_count, assertion_count);
    }

    public static SubLObject compute_kbs_forts() {
        compute_kbs_narts();
        final SubLObject kbs_constants = kbs_constants();
        final SubLObject kbs_narts = kbs_narts();
        $kbs_forts$.setDynamicValue(cconcatenate(kbs_constants, kbs_narts));
        initialize_kbs_fort_table();
        return NIL;
    }

    public static SubLObject kbs_definitional_constant_predicate_sets(final SubLObject constant) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != constant_p(constant)) {
            return gethash(constant, $kbs_definitional_constant_table$.getDynamicValue(thread), UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject kbs_definitional_fort_predicate_sets(final SubLObject fort) {
        if (NIL != constant_p(fort)) {
            return kbs_definitional_constant_predicate_sets(fort);
        }
        if (NIL != nart_handles.nart_p(fort)) {
            return list_utilities.remove_duplicate_forts(remove_if(symbol_function(NULL), Mapping.mapcar(KBS_DEFINITIONAL_FORT_PREDICATE_SETS, narts_high.nart_hl_formula(fort)), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
        }
        return NIL;
    }

    public static SubLObject kbs_definitional_constant_p(final SubLObject constant) {
        return list_utilities.sublisp_boolean(kbs_definitional_constant_predicate_sets(constant));
    }

    public static SubLObject non_kbs_definitional_constant_p(final SubLObject constant) {
        return makeBoolean((NIL != constant_p(constant)) && (NIL == kbs_definitional_constant_predicate_sets(constant)));
    }

    public static SubLObject tree_gather_relevant_kbs_definitional_predicate_sets(final SubLObject tree) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ($kbs_definitional_constant_table$.getDynamicValue(thread).isHashtable()) {
            final SubLObject tree_forts = list_utilities.fast_delete_duplicates(list_utilities.tree_gather(tree, FORT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject predicate_sets_list = remove_if(symbol_function(NULL), Mapping.mapcar(KBS_DEFINITIONAL_FORT_PREDICATE_SETS, tree_forts), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject relevant_predicate_sets = list_utilities.fast_delete_duplicates(list_utilities.tree_gather(predicate_sets_list, FORT_P, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject sorted_relevant_predicate_sets = Sort.sort(relevant_predicate_sets, $sym85$KBS_DEFINITIONAL_PREDICATE_SET_, UNPROVIDED);
            return sorted_relevant_predicate_sets;
        }
        return NIL;
    }

    public static SubLObject kbs_definitional_predicate_set_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return subl_promotions.memberP(v_object, $kbs_ordered_definitional_predicate_sets$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject kbs_definitional_predicate_setL(final SubLObject predicate_set1, final SubLObject predicate_set2) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != kbs_definitional_predicate_set_p(predicate_set1) : "kbs_identification.kbs_definitional_predicate_set_p(predicate_set1) " + "CommonSymbols.NIL != kbs_identification.kbs_definitional_predicate_set_p(predicate_set1) " + predicate_set1;
        assert NIL != kbs_definitional_predicate_set_p(predicate_set2) : "kbs_identification.kbs_definitional_predicate_set_p(predicate_set2) " + "CommonSymbols.NIL != kbs_identification.kbs_definitional_predicate_set_p(predicate_set2) " + predicate_set2;
        return numG(position(predicate_set1, $kbs_ordered_definitional_predicate_sets$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), position(predicate_set2, $kbs_ordered_definitional_predicate_sets$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject kbs_predicate_definitional_predicate_sets(final SubLObject predicate) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != fort_types_interface.predicate_p(predicate)) {
            return gethash(predicate, $kbs_definitional_predicate_table$.getDynamicValue(thread), UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject all_kbs_definitional_predicates() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return hash_table_utilities.hash_table_keys($kbs_definitional_predicate_table$.getDynamicValue(thread));
    }

    public static SubLObject kbs_definitional_predicate_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return list_utilities.sublisp_boolean(gethash_without_values(v_object, $kbs_definitional_predicate_table$.getDynamicValue(thread), NIL));
    }

    public static SubLObject clear_kbs_definitional_predicate_table() {
        $kbs_definitional_predicate_table$.setDynamicValue(make_hash_table($int$1000, symbol_function(EQUAL), UNPROVIDED));
        return NIL;
    }

    public static SubLObject initialize_kbs_definitional_predicate_table() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        clear_kbs_definitional_predicate_table();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            SubLObject cdolist_list_var = kbs_utilities.get_kbs_sections();
            SubLObject kbs_section = NIL;
            kbs_section = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject definitional_predicate_set = kbs_utilities.get_kbs_section_definitional_predicate_set(kbs_section);
                if (NIL != definitional_predicate_set) {
                    final SubLObject item_var = definitional_predicate_set;
                    if (NIL == member(item_var, $kbs_ordered_definitional_predicate_sets$.getDynamicValue(thread), symbol_function(EQL), symbol_function(IDENTITY))) {
                        $kbs_ordered_definitional_predicate_sets$.setDynamicValue(cons(item_var, $kbs_ordered_definitional_predicate_sets$.getDynamicValue(thread)), thread);
                    }
                    SubLObject cdolist_list_var_$103 = kbs_utilities.all_quoted_instances_enhanced(definitional_predicate_set, UNPROVIDED);
                    SubLObject definitional_predicate = NIL;
                    definitional_predicate = cdolist_list_var_$103.first();
                    while (NIL != cdolist_list_var_$103) {
                        final SubLObject old_value = gethash(definitional_predicate, $kbs_definitional_predicate_table$.getDynamicValue(thread), UNPROVIDED);
                        final SubLObject new_value = cons(definitional_predicate_set, old_value);
                        sethash(definitional_predicate, $kbs_definitional_predicate_table$.getDynamicValue(thread), new_value);
                        cdolist_list_var_$103 = cdolist_list_var_$103.rest();
                        definitional_predicate = cdolist_list_var_$103.first();
                    } 
                }
                cdolist_list_var = cdolist_list_var.rest();
                kbs_section = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return hash_table_count($kbs_definitional_predicate_table$.getDynamicValue(thread));
    }

    public static SubLObject compute_kbs_definitional_predicates() {
        initialize_kbs_definitional_predicate_table();
        return NIL;
    }

    public static SubLObject kbs_rule_definitional_predicate_sets(final SubLObject rule) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return gethash(rule, $kbs_definitional_rule_table$.getDynamicValue(thread), UNPROVIDED);
    }

    public static SubLObject clear_kbs_definitional_rule_table() {
        $kbs_definitional_rule_table$.setDynamicValue(make_hash_table($int$1000, symbol_function(EQ), UNPROVIDED));
        return NIL;
    }

    public static SubLObject initialize_kbs_definitional_rule_table() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        clear_kbs_definitional_rule_table();
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            SubLObject cdolist_list_var = kbs_utilities.get_kbs_sections();
            SubLObject kbs_section = NIL;
            kbs_section = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject definitional_predicate_set = kbs_utilities.get_kbs_section_definitional_predicate_set(kbs_section);
                final SubLObject definitional_rule_predicate = kbs_utilities.get_kbs_section_definitional_rule_predicate(kbs_section);
                if (NIL != definitional_rule_predicate) {
                    final SubLObject pred_var = definitional_rule_predicate;
                    if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                        final SubLObject str = NIL;
                        final SubLObject _prev_bind_0_$104 = $progress_start_time$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$105 = $progress_last_pacification_time$.currentBinding(thread);
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
                            final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                            SubLObject done_var = NIL;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    note_progress();
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                        SubLObject done_var_$106 = NIL;
                                        final SubLObject token_var_$107 = NIL;
                                        while (NIL == done_var_$106) {
                                            final SubLObject definitional_rule = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$107);
                                            final SubLObject valid_$108 = makeBoolean(!token_var_$107.eql(definitional_rule));
                                            if (NIL != valid_$108) {
                                                final SubLObject rule_assertion = assertions_high.gaf_arg1(definitional_rule);
                                                final SubLObject old_value = gethash(rule_assertion, $kbs_definitional_rule_table$.getDynamicValue(thread), UNPROVIDED);
                                                final SubLObject new_value = cons(definitional_predicate_set, old_value);
                                                sethash(rule_assertion, $kbs_definitional_rule_table$.getDynamicValue(thread), new_value);
                                            }
                                            done_var_$106 = makeBoolean(NIL == valid_$108);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_0_$105 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$105, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            } 
                            noting_progress_postamble();
                        } finally {
                            $silent_progressP$.rebind(_prev_bind_8, thread);
                            $is_noting_progressP$.rebind(_prev_bind_7, thread);
                            $progress_count$.rebind(_prev_bind_6, thread);
                            $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                            $progress_notification_count$.rebind(_prev_bind_4, thread);
                            $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                            $progress_last_pacification_time$.rebind(_prev_bind_1_$105, thread);
                            $progress_start_time$.rebind(_prev_bind_0_$104, thread);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                kbs_section = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return hash_table_count($kbs_definitional_rule_table$.getDynamicValue(thread));
    }

    public static SubLObject compute_kbs_definitional_rules() {
        initialize_kbs_definitional_rule_table();
        return NIL;
    }

    public static SubLObject kbs_assertion_table() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $kbs_assertion_table$.getDynamicValue(thread);
    }

    public static SubLObject kbs_assertion_p(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return keyhash.getkeyhash(assertion, $kbs_assertion_table$.getDynamicValue(thread));
    }

    public static SubLObject why_kbs_assertionP(final SubLObject assertion) {
        SubLObject supports = NIL;
        supports = cons($str76$All_KB_subset_requirements_met_, supports);
        return nreverse(supports);
    }

    public static SubLObject non_kbs_assertion_p(final SubLObject assertion) {
        return makeBoolean((NIL != assertion_handles.assertion_p(assertion)) && (NIL == kbs_assertion_p(assertion)));
    }

    public static SubLObject why_non_kbs_assertionP(final SubLObject assertion) {
        if (NIL != assertion_handles.assertion_p(assertion)) {
            final SubLObject mt = assertions_high.assertion_mt(assertion);
            final SubLObject cnf = assertions_high.assertion_cnf(assertion);
            SubLObject supports = NIL;
            if (NIL != non_kbs_fort_p(mt)) {
                supports = cons($str87$The_assertion_s_microtheory_is_no, supports);
                SubLObject cdolist_list_var = why_non_kbs_fortP(mt);
                SubLObject support = NIL;
                support = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    supports = cons(support, supports);
                    cdolist_list_var = cdolist_list_var.rest();
                    support = cdolist_list_var.first();
                } 
            } else
                if (NIL != subl_promotions.memberP(assertion, kbs_utilities.get_kbs_section_omission_assertions(kbs_utilities.get_kbs_sections().first()), UNPROVIDED, UNPROVIDED)) {
                    supports = cons($str88$The_assertion_was_explicitly_omit, supports);
                } else {
                    final SubLObject non_kbs_forts_in_cnf = list_utilities.remove_duplicate_forts(list_utilities.tree_find_all_if(symbol_function(NON_KBS_FORT_P), cnf, UNPROVIDED));
                    if (NIL != non_kbs_forts_in_cnf) {
                        supports = cons($str89$The_assertion_s_formula_contains_, supports);
                        SubLObject cdolist_list_var2 = non_kbs_forts_in_cnf;
                        SubLObject non_kbs_fort = NIL;
                        non_kbs_fort = cdolist_list_var2.first();
                        while (NIL != cdolist_list_var2) {
                            SubLObject cdolist_list_var_$110 = why_non_kbs_fortP(non_kbs_fort);
                            SubLObject support2 = NIL;
                            support2 = cdolist_list_var_$110.first();
                            while (NIL != cdolist_list_var_$110) {
                                supports = cons(support2, supports);
                                cdolist_list_var_$110 = cdolist_list_var_$110.rest();
                                support2 = cdolist_list_var_$110.first();
                            } 
                            cdolist_list_var2 = cdolist_list_var2.rest();
                            non_kbs_fort = cdolist_list_var2.first();
                        } 
                    } else
                        if (NIL != assertions_high.gaf_assertionP(assertion)) {
                            final SubLObject predicate = assertions_high.gaf_predicate(assertion);
                            final SubLObject predicate_predicate_sets = kbs_predicate_definitional_predicate_sets(predicate);
                            final SubLObject assertion_predicate_sets = tree_gather_relevant_kbs_definitional_predicate_sets(cnf);
                            if (NIL == list_utilities.fast_subsetP(assertion_predicate_sets, predicate_predicate_sets, UNPROVIDED)) {
                                supports = cons($str90$The_assertion_is_definitional_bec, supports);
                                if (NIL != predicate_predicate_sets) {
                                    supports = cons($str91$__The_predicate_is_definitional_, supports);
                                    SubLObject cdolist_list_var3 = predicate_predicate_sets;
                                    SubLObject predicate_predicate_set = NIL;
                                    predicate_predicate_set = cdolist_list_var3.first();
                                    while (NIL != cdolist_list_var3) {
                                        supports = cons(arguments.make_hl_support($ISA, make_binary_formula($$isa, predicate, predicate_predicate_set), UNPROVIDED, UNPROVIDED), supports);
                                        cdolist_list_var3 = cdolist_list_var3.rest();
                                        predicate_predicate_set = cdolist_list_var3.first();
                                    } 
                                } else {
                                    supports = cons($str92$__The_predicate_is_not_definition, supports);
                                }
                                supports = cons($str93$__But_the_assertion_contains_defi, supports);
                                SubLObject cdolist_list_var3 = assertion_predicate_sets;
                                SubLObject assertion_predicate_set = NIL;
                                assertion_predicate_set = cdolist_list_var3.first();
                                while (NIL != cdolist_list_var3) {
                                    supports = cons(assertion_predicate_set, supports);
                                    cdolist_list_var3 = cdolist_list_var3.rest();
                                    assertion_predicate_set = cdolist_list_var3.first();
                                } 
                            }
                        } else {
                            final SubLObject assertion_predicate_sets2 = tree_gather_relevant_kbs_definitional_predicate_sets(cnf);
                            supports = cons($str94$The_assertion_is_a_rule_containin, supports);
                            SubLObject cdolist_list_var4 = assertion_predicate_sets2;
                            SubLObject assertion_predicate_set2 = NIL;
                            assertion_predicate_set2 = cdolist_list_var4.first();
                            while (NIL != cdolist_list_var4) {
                                supports = cons(assertion_predicate_set2, supports);
                                cdolist_list_var4 = cdolist_list_var4.rest();
                                assertion_predicate_set2 = cdolist_list_var4.first();
                            } 
                        }

                }

            return nreverse(supports);
        }
        return NIL;
    }

    public static SubLObject initialize_kbs_assertion_table(final SubLObject kbs_assertions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $kbs_assertion_table$.setDynamicValue(NIL, thread);
        $kbs_assertion_table$.setDynamicValue(keyhash_utilities.keyhash_list_elements(kbs_assertions, symbol_function(EQ), UNPROVIDED), thread);
        return keyhash.keyhash_count($kbs_assertion_table$.getDynamicValue(thread));
    }

    public static SubLObject mark_kbs_assertion(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return keyhash.setkeyhash(assertion, $kbs_assertion_table$.getDynamicValue(thread));
    }

    public static SubLObject unmark_kbs_assertion(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return keyhash.remkeyhash(assertion, $kbs_assertion_table$.getDynamicValue(thread));
    }

    public static SubLObject compute_kbs_assertions() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject assertions = NIL;
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = $$$Computing_KBS_assertions;
        final SubLObject total = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
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
                final SubLObject idx_$111 = idx;
                if (NIL == id_index_objects_empty_p(idx_$111, $SKIP)) {
                    final SubLObject idx_$112 = idx_$111;
                    if (NIL == id_index_dense_objects_empty_p(idx_$112, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$112);
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
                                if (NIL != compute_kbs_assertion_p(assertion)) {
                                    assertions = cons(assertion, assertions);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$113 = idx_$111;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$113)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$113);
                        SubLObject a_id2 = id_index_sparse_id_threshold(idx_$113);
                        final SubLObject end_id = id_index_next_id(idx_$113);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (a_id2.numL(end_id)) {
                            final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                final SubLObject assertion2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                if (NIL != compute_kbs_assertion_p(assertion2)) {
                                    assertions = cons(assertion2, assertions);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            a_id2 = add(a_id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$114 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$114, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        initialize_kbs_assertion_table(assertions);
        return NIL;
    }

    public static SubLObject compute_kbs_assertion_p(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            if (NIL != assertion_handles.assertion_p(assertion)) {
                if ((NIL == kbs_assertion_references_excluded_termsP(assertion)) && (NIL == kbs_definitionally_restricted_assertionP(assertion))) {
                    v_answer = T;
                }
                if (((NIL != assertions_high.gaf_assertionP(assertion)) && ((NIL != genl_predicates.any_genl_predP(assertions_high.gaf_predicate(assertion), kbs_utilities.get_kbs_section_omission_predicate_extent(kbs_utilities.get_kbs_sections().first()), UNPROVIDED, UNPROVIDED)) || (NIL != genl_predicates.any_genl_inverseP(assertions_high.gaf_predicate(assertion), kbs_utilities.get_kbs_section_omission_predicate_extent(kbs_utilities.get_kbs_sections().first()), UNPROVIDED, UNPROVIDED)))) && (NIL == subl_promotions.memberP(assertion, kbs_utilities.get_kbs_section_retained_assertions(kbs_utilities.get_kbs_sections().first()), UNPROVIDED, UNPROVIDED))) {
                    v_answer = NIL;
                }
                if ((NIL != v_answer) && (NIL != subl_promotions.memberP(assertion, kbs_utilities.get_kbs_section_omission_assertions(kbs_utilities.get_kbs_sections().first()), UNPROVIDED, UNPROVIDED))) {
                    v_answer = NIL;
                }
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    public static SubLObject compute_non_kbs_assertion_p(final SubLObject assertion) {
        return makeBoolean((NIL != assertion_handles.assertion_p(assertion)) && (NIL == compute_kbs_assertion_p(assertion)));
    }

    public static SubLObject kbs_assertion_references_excluded_termsP(final SubLObject assertion) {
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        final SubLObject cnf = assertions_high.assertion_cnf(assertion);
        return makeBoolean((((NIL != non_kbs_fort_p(mt)) || (NIL != list_utilities.tree_find_if(symbol_function(NON_KBS_FORT_P), cnf, UNPROVIDED))) || (NIL != (NIL != forts.fort_p(mt) ? non_kbs_fort_p(mt) : list_utilities.tree_find_if(symbol_function(NON_KBS_FORT_P), mt, UNPROVIDED)))) || (NIL != list_utilities.tree_find_if(symbol_function(COMPUTE_NON_KBS_ASSERTION_P), cnf, UNPROVIDED)));
    }

    public static SubLObject kbs_definitionally_restricted_assertionP(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != hash_table_utilities.hash_table_empty_p($kbs_definitional_constant_table$.getDynamicValue(thread))) {
            return NIL;
        }
        final SubLObject mt = assertions_high.assertion_mt(assertion);
        final SubLObject cnf = assertions_high.assertion_cnf(assertion);
        if (NIL == list_utilities.tree_find_if(KBS_DEFINITIONAL_FORT_P, cnf, UNPROVIDED)) {
            return NIL;
        }
        final SubLObject assertion_predicate_sets = tree_gather_relevant_kbs_definitional_predicate_sets(cnf);
        if (NIL != assertions_high.rule_assertionP(assertion)) {
            final SubLObject rule_predicate_sets = kbs_rule_definitional_predicate_sets(assertion);
            return makeBoolean(NIL == list_utilities.fast_subsetP(assertion_predicate_sets, rule_predicate_sets, UNPROVIDED));
        }
        final SubLObject predicate = assertions_high.gaf_predicate(assertion);
        final SubLObject predicate_predicate_sets = kbs_predicate_definitional_predicate_sets(predicate);
        return makeBoolean(NIL == list_utilities.fast_subsetP(assertion_predicate_sets, predicate_predicate_sets, UNPROVIDED));
    }

    public static SubLObject kbs_deduction_p(final SubLObject deduction) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return keyhash.getkeyhash(deduction, $kbs_deduction_table$.getDynamicValue(thread));
    }

    public static SubLObject non_kbs_deduction_p(final SubLObject deduction) {
        return makeBoolean((NIL != deduction_handles.deduction_p(deduction)) && (NIL == kbs_deduction_p(deduction)));
    }

    public static SubLObject initialize_kbs_deduction_table(final SubLObject kbs_deductions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        $kbs_deduction_table$.setDynamicValue(NIL, thread);
        $kbs_deduction_table$.setDynamicValue(keyhash_utilities.keyhash_list_elements(kbs_deductions, symbol_function(EQ), UNPROVIDED), thread);
        return keyhash.keyhash_count($kbs_deduction_table$.getDynamicValue(thread));
    }

    public static SubLObject compute_kbs_deductions() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject deductions = NIL;
        final SubLObject list_var = keyhash_utilities.keyhash_element_list(kbs_assertion_table());
        final SubLObject _prev_bind_0 = $progress_note$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $progress_start_time$.currentBinding(thread);
        final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
        final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
        final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
        try {
            $progress_note$.bind($$$Computing_KBS_deductions, thread);
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
                SubLObject assertion = NIL;
                assertion = csome_list_var.first();
                while (NIL != csome_list_var) {
                    SubLObject cdolist_list_var = assertions_high.assertion_arguments(assertion);
                    SubLObject argument = NIL;
                    argument = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        if (NIL != compute_kbs_deduction_p(argument)) {
                            deductions = cons(argument, deductions);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        argument = cdolist_list_var.first();
                    } 
                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                    csome_list_var = csome_list_var.rest();
                    assertion = csome_list_var.first();
                } 
            } finally {
                final SubLObject _prev_bind_0_$115 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$115, thread);
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
        initialize_kbs_deduction_table(deductions);
        return NIL;
    }

    public static SubLObject compute_kbs_deduction_p(final SubLObject deduction) {
        SubLObject v_answer = NIL;
        if ((NIL != deduction_handles.deduction_p(deduction)) && (NIL != kbs_assertion_p(deductions_high.deduction_supported_object(deduction)))) {
            SubLObject invalidP;
            SubLObject rest;
            SubLObject support;
            for (invalidP = NIL, rest = NIL, rest = deductions_high.deduction_supports(deduction); (NIL == invalidP) && (NIL != rest); invalidP = makeBoolean(NIL == compute_kbs_support_p(support)) , rest = rest.rest()) {
                support = rest.first();
            }
            v_answer = makeBoolean(NIL == invalidP);
        }
        return v_answer;
    }

    public static SubLObject compute_kbs_support_p(final SubLObject support) {
        if (NIL != arguments.support_p(support)) {
            if (NIL != assertion_handles.assertion_p(support)) {
                return kbs_assertion_p(support);
            }
            final SubLObject mt = arguments.support_mt(support);
            if ((NIL == non_kbs_fort_p(mt)) && (NIL == kbs_raw_constant_omitted_p(mt))) {
                final SubLObject formula = arguments.support_formula(support);
                if ((NIL == list_utilities.tree_find_if(symbol_function(NON_KBS_FORT_P), formula, UNPROVIDED)) && (NIL == list_utilities.tree_find_if(symbol_function(KBS_RAW_CONSTANT_OMITTED_P), formula, UNPROVIDED))) {
                    return T;
                }
            }
        }
        return NIL;
    }

    public static SubLObject kbs_fort_state_validP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $kbs_fort_state_validP$.getDynamicValue(thread);
    }

    public static SubLObject kbs_state_validP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return $kbs_state_validP$.getDynamicValue(thread);
    }

    public static SubLObject prepare_kbs_kb_destructive(SubLObject skip_functionsP) {
        if (skip_functionsP == UNPROVIDED) {
            skip_functionsP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var;
        final SubLObject preremoved_assertion_identifying_predicates = cdolist_list_var = kbs_utilities.get_kbs_preremoved_assertions();
        SubLObject preremoved_assertion_identifying_predicate = NIL;
        preremoved_assertion_identifying_predicate = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != forts.fort_p(preremoved_assertion_identifying_predicate)) {
                final SubLObject predicate = preremoved_assertion_identifying_predicate;
                final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    final SubLObject pred_var = predicate;
                    if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                        final SubLObject str = cconcatenate($$$Preremoving_, new SubLObject[]{ format_nil.format_nil_s_no_copy(predicate), $$$_assertions });
                        final SubLObject _prev_bind_0_$116 = $progress_start_time$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$117 = $progress_last_pacification_time$.currentBinding(thread);
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
                            final SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
                            SubLObject done_var = NIL;
                            final SubLObject token_var = NIL;
                            while (NIL == done_var) {
                                final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                                if (NIL != valid) {
                                    note_progress();
                                    SubLObject final_index_iterator = NIL;
                                    try {
                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                        SubLObject done_var_$118 = NIL;
                                        final SubLObject token_var_$119 = NIL;
                                        while (NIL == done_var_$118) {
                                            final SubLObject meta_a = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$119);
                                            final SubLObject valid_$120 = makeBoolean(!token_var_$119.eql(meta_a));
                                            if (NIL != valid_$120) {
                                                final SubLObject a = assertions_high.gaf_arg1(meta_a);
                                                kbs_handle_preremoved_assertion(a, predicate);
                                            }
                                            done_var_$118 = makeBoolean(NIL == valid_$120);
                                        } 
                                    } finally {
                                        final SubLObject _prev_bind_0_$117 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                        try {
                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                            final SubLObject _values = getValuesAsVector();
                                            if (NIL != final_index_iterator) {
                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                            }
                                            restoreValuesFromVector(_values);
                                        } finally {
                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$117, thread);
                                        }
                                    }
                                }
                                done_var = makeBoolean(NIL == valid);
                            } 
                            noting_progress_postamble();
                        } finally {
                            $silent_progressP$.rebind(_prev_bind_8, thread);
                            $is_noting_progressP$.rebind(_prev_bind_7, thread);
                            $progress_count$.rebind(_prev_bind_6, thread);
                            $progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                            $progress_notification_count$.rebind(_prev_bind_4, thread);
                            $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                            $progress_last_pacification_time$.rebind(_prev_bind_1_$117, thread);
                            $progress_start_time$.rebind(_prev_bind_0_$116, thread);
                        }
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            } else
                if (NIL != kappa_predicate_p(preremoved_assertion_identifying_predicate)) {
                    final SubLObject kappa = preremoved_assertion_identifying_predicate;
                    if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!ONE_INTEGER.numE(kappa_predicate_arity(kappa)))) {
                        Errors.error($str102$Only_unary_KAPPA_predicates_suppo, kappa);
                    }
                    SubLObject assertions = NIL;
                    final SubLObject str2 = cconcatenate($$$Identifying_, new SubLObject[]{ format_nil.format_nil_s_no_copy(kappa), $$$_assertions });
                    final SubLObject _prev_bind_9 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_10 = $progress_last_pacification_time$.currentBinding(thread);
                    final SubLObject _prev_bind_11 = $progress_elapsed_seconds_for_notification$.currentBinding(thread);
                    final SubLObject _prev_bind_12 = $progress_notification_count$.currentBinding(thread);
                    final SubLObject _prev_bind_13 = $progress_pacifications_since_last_nl$.currentBinding(thread);
                    final SubLObject _prev_bind_14 = $progress_count$.currentBinding(thread);
                    final SubLObject _prev_bind_15 = $is_noting_progressP$.currentBinding(thread);
                    final SubLObject _prev_bind_16 = $silent_progressP$.currentBinding(thread);
                    try {
                        $progress_start_time$.bind(get_universal_time(), thread);
                        $progress_last_pacification_time$.bind($progress_start_time$.getDynamicValue(thread), thread);
                        $progress_elapsed_seconds_for_notification$.bind($suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                        $progress_notification_count$.bind(ZERO_INTEGER, thread);
                        $progress_pacifications_since_last_nl$.bind(ZERO_INTEGER, thread);
                        $progress_count$.bind(ZERO_INTEGER, thread);
                        $is_noting_progressP$.bind(T, thread);
                        $silent_progressP$.bind(NIL != str2 ? $silent_progressP$.getDynamicValue(thread) : T, thread);
                        noting_progress_preamble(str2);
                        assertions = kbs_get_kappa_specified_assertions(kappa);
                        noting_progress_postamble();
                    } finally {
                        $silent_progressP$.rebind(_prev_bind_16, thread);
                        $is_noting_progressP$.rebind(_prev_bind_15, thread);
                        $progress_count$.rebind(_prev_bind_14, thread);
                        $progress_pacifications_since_last_nl$.rebind(_prev_bind_13, thread);
                        $progress_notification_count$.rebind(_prev_bind_12, thread);
                        $progress_elapsed_seconds_for_notification$.rebind(_prev_bind_11, thread);
                        $progress_last_pacification_time$.rebind(_prev_bind_10, thread);
                        $progress_start_time$.rebind(_prev_bind_9, thread);
                    }
                    if (NIL == assertions) {
                        Errors.warn($str104$_PREREMOVED_ASSERTIONS_specificat, kappa);
                    } else {
                        Errors.warn($str105$Applying__PREREMOVED_ASSERTIONS_s, kappa);
                        final SubLObject list_var = assertions;
                        final SubLObject _prev_bind_17 = $progress_note$.currentBinding(thread);
                        final SubLObject _prev_bind_18 = $progress_start_time$.currentBinding(thread);
                        final SubLObject _prev_bind_19 = $progress_total$.currentBinding(thread);
                        final SubLObject _prev_bind_20 = $progress_sofar$.currentBinding(thread);
                        final SubLObject _prev_bind_21 = $last_percent_progress_index$.currentBinding(thread);
                        final SubLObject _prev_bind_22 = $last_percent_progress_prediction$.currentBinding(thread);
                        final SubLObject _prev_bind_23 = $within_noting_percent_progress$.currentBinding(thread);
                        final SubLObject _prev_bind_24 = $percent_progress_start_time$.currentBinding(thread);
                        try {
                            $progress_note$.bind(NIL != cconcatenate($$$Preremoving_, new SubLObject[]{ format_nil.format_nil_a_no_copy(length(assertions)), $str106$_assertions_indentified_by_Kappa_ }) ? cconcatenate($$$Preremoving_, new SubLObject[]{ format_nil.format_nil_a_no_copy(length(assertions)), $str106$_assertions_indentified_by_Kappa_ }) : $$$cdolist, thread);
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
                                SubLObject assertion = NIL;
                                assertion = csome_list_var.first();
                                while (NIL != csome_list_var) {
                                    kbs_handle_preremoved_assertion(assertion, UNPROVIDED);
                                    $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                    note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                    csome_list_var = csome_list_var.rest();
                                    assertion = csome_list_var.first();
                                } 
                            } finally {
                                final SubLObject _prev_bind_0_$118 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values2 = getValuesAsVector();
                                    noting_percent_progress_postamble();
                                    restoreValuesFromVector(_values2);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$118, thread);
                                }
                            }
                        } finally {
                            $percent_progress_start_time$.rebind(_prev_bind_24, thread);
                            $within_noting_percent_progress$.rebind(_prev_bind_23, thread);
                            $last_percent_progress_prediction$.rebind(_prev_bind_22, thread);
                            $last_percent_progress_index$.rebind(_prev_bind_21, thread);
                            $progress_sofar$.rebind(_prev_bind_20, thread);
                            $progress_total$.rebind(_prev_bind_19, thread);
                            $progress_start_time$.rebind(_prev_bind_18, thread);
                            $progress_note$.rebind(_prev_bind_17, thread);
                        }
                        Errors.warn($str107$Finished_applying__A___, kappa);
                    }
                } else {
                    Errors.error($str108$Invalid_pre_removal_specification, preremoved_assertion_identifying_predicate);
                }

            cdolist_list_var = cdolist_list_var.rest();
            preremoved_assertion_identifying_predicate = cdolist_list_var.first();
        } 
        if (NIL == skip_functionsP) {
            do_prerun_kbs_fns();
        }
        return NIL;
    }

    public static SubLObject kbs_get_kappa_specified_assertions(final SubLObject kappa) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject query = kappa_predicate_query(kappa);
        final SubLObject variable = kappa_predicate_formal_args(kappa).first();
        final SubLObject v_bindings = ask_utilities.query_variable(variable, query, $$InferencePSC, $kbs_kappa_query_settings$.getDynamicValue(thread));
        return v_bindings;
    }

    public static SubLObject kbs_handle_preremoved_assertion(final SubLObject a, SubLObject pred) {
        if (pred == UNPROVIDED) {
            pred = NIL;
        }
        if ((NIL != assertion_handles.assertion_p(a)) && (NIL != assertion_handles.valid_assertionP(a, UNPROVIDED))) {
            Errors.warn($str109$Killing__A_assertion_for_KB_subse, NIL != forts.fort_p(pred) ? pred : $$$an, a);
            cyc_kernel.cyc_unassert(canon_tl.assertion_tl_ist_formula(a), assertions_high.assertion_mt(a));
        }
        return a;
    }

    public static SubLObject do_prerun_kbs_fns() {
        SubLObject cdolist_list_var = kbs_utilities.get_kbs_prerun_fns();
        SubLObject prerun_fn = NIL;
        prerun_fn = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (prerun_fn.isFunctionSpec()) {
                format_nil.force_format(T, $str111$prerun__Calling__A__, prerun_fn, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                funcall(prerun_fn);
            }
            cdolist_list_var = cdolist_list_var.rest();
            prerun_fn = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject identify_kbs_forts_and_assertions() {
        clear_kbs_state();
        prepare_kbs_kb_destructive(T);
        identify_kbs_forts();
        identify_kbs_assertions();
        identify_kbs_deductions();
        $kbs_state_validP$.setDynamicValue(T);
        return NIL;
    }

    public static SubLObject identify_kbs_forts() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        clear_kbs_state();
        SubLObject sbhl_ms_resource = sbhl_marking_vars.new_sbhl_marking_space_resource(TEN_INTEGER);
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
        try {
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_ms_resource, thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_marking_space_limit(sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread)), thread);
            try {
                compute_kbs_constants();
                compute_kbs_forts();
                compute_kbs_definitional_predicates();
                compute_kbs_definitional_rules();
            } finally {
                final SubLObject _prev_bind_0_$123 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    sbhl_ms_resource = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$123, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_3, thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_0, thread);
        }
        $kbs_fort_state_validP$.setDynamicValue(T, thread);
        return NIL;
    }

    public static SubLObject do_post_identify_kbs_forts_fns() {
        SubLObject cdolist_list_var = kbs_utilities.get_kbs_post_identify_forts_fns();
        SubLObject post_identify_forts_fn = NIL;
        post_identify_forts_fn = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (post_identify_forts_fn.isFunctionSpec()) {
                format_nil.force_format(T, $str112$post_kbs_forts__Calling__A___, post_identify_forts_fn, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                funcall(post_identify_forts_fn);
            }
            cdolist_list_var = cdolist_list_var.rest();
            post_identify_forts_fn = cdolist_list_var.first();
        } 
        perform_limitation_motivated_post_identify_cleanups();
        return NIL;
    }

    public static SubLObject perform_limitation_motivated_post_identify_cleanups() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject bad_narts = ZERO_INTEGER;
        final SubLObject idx = nart_handles.do_narts_table();
        final SubLObject mess = $str113$POST_KBS_FORTS__Unmark_NARTs_that;
        final SubLObject total = id_index_count(idx);
        SubLObject sofar = ZERO_INTEGER;
        assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
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
                final SubLObject idx_$124 = idx;
                if (NIL == id_index_objects_empty_p(idx_$124, $SKIP)) {
                    final SubLObject idx_$125 = idx_$124;
                    if (NIL == id_index_dense_objects_empty_p(idx_$125, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$125);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject id;
                        SubLObject n;
                        SubLObject formula;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            n = aref(vector_var, id);
                            if ((NIL == id_index_tombstone_p(n)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(n)) {
                                    n = $SKIP;
                                }
                                formula = narts_high.nart_hl_formula(n);
                                if (NIL != list_utilities.tree_find_if(symbol_function(ASSERTION_P), cycl_utilities.el_formula_args(formula, UNPROVIDED), UNPROVIDED)) {
                                    unmark_kbs_fort(n);
                                    bad_narts = add(bad_narts, ONE_INTEGER);
                                    format_nil.force_format(T, $str115$__Unmarking_NART__A_with_formula_, nart_handles.nart_id(n), formula, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$126 = idx_$124;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$126)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$126);
                        SubLObject id2 = id_index_sparse_id_threshold(idx_$126);
                        final SubLObject end_id = id_index_next_id(idx_$126);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (id2.numL(end_id)) {
                            final SubLObject n2 = gethash_without_values(id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(n2))) {
                                final SubLObject formula2 = narts_high.nart_hl_formula(n2);
                                if (NIL != list_utilities.tree_find_if(symbol_function(ASSERTION_P), cycl_utilities.el_formula_args(formula2, UNPROVIDED), UNPROVIDED)) {
                                    unmark_kbs_fort(n2);
                                    bad_narts = add(bad_narts, ONE_INTEGER);
                                    format_nil.force_format(T, $str115$__Unmarking_NART__A_with_formula_, nart_handles.nart_id(n2), formula2, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                }
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            id2 = add(id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$127 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$127, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        if (bad_narts.isZero()) {
            format_nil.force_format(T, $str116$__No_NARTs_had_to_be_unmarked___, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        } else {
            format_nil.force_format(T, $str117$___A_NARTs_with_HL_assertions_as_, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject identify_kbs_assertions() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sbhl_ms_resource = sbhl_marking_vars.new_sbhl_marking_space_resource(TEN_INTEGER);
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
        try {
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_ms_resource, thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_marking_space_limit(sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread)), thread);
            try {
                compute_kbs_assertions();
            } finally {
                final SubLObject _prev_bind_0_$128 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    sbhl_ms_resource = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$128, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_3, thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject do_post_identify_kbs_assertions_fns() {
        SubLObject cdolist_list_var = kbs_utilities.get_kbs_post_identify_assertions_fns();
        SubLObject post_identify_assertions_fn = NIL;
        post_identify_assertions_fn = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (post_identify_assertions_fn.isFunctionSpec()) {
                format_nil.force_format(T, $str118$post_kbs_assertions__Calling__A__, post_identify_assertions_fn, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                funcall(post_identify_assertions_fn);
            }
            cdolist_list_var = cdolist_list_var.rest();
            post_identify_assertions_fn = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject identify_kbs_deductions() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sbhl_ms_resource = sbhl_marking_vars.new_sbhl_marking_space_resource(TEN_INTEGER);
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
        try {
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_ms_resource, thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_marking_space_limit(sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread)), thread);
            try {
                compute_kbs_deductions();
            } finally {
                final SubLObject _prev_bind_0_$129 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    sbhl_ms_resource = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.getDynamicValue(thread);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$129, thread);
                }
            }
        } finally {
            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_3, thread);
            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static SubLObject clear_kbs_state() {
        $kbs_fort_state_validP$.setDynamicValue(NIL);
        $kbs_state_validP$.setDynamicValue(NIL);
        $kbs_raw_constants$.setDynamicValue(NIL);
        $kbs_raw_constants_table$.setDynamicValue(NIL);
        $kbs_raw_constants_omission_table$.setDynamicValue(NIL);
        $kbs_skolems$.setDynamicValue(NIL);
        $kbs_constants$.setDynamicValue(NIL);
        $kbs_constant_table$.setDynamicValue(NIL);
        $kbs_narts$.setDynamicValue(NIL);
        $kbs_forts$.setDynamicValue(NIL);
        $kbs_fort_table$.setDynamicValue(NIL);
        $kbs_definitional_constant_table$.setDynamicValue(NIL);
        $kbs_definitional_predicate_table$.setDynamicValue(NIL);
        $kbs_assertion_table$.setDynamicValue(NIL);
        $kbs_deduction_table$.setDynamicValue(NIL);
        return NIL;
    }

    public static SubLObject why_kbs_state_invalidP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $kbs_raw_constants$.getDynamicValue(thread)) {
            Errors.warn($str119$_kbs_raw_constants__is_null_);
        }
        if (!$kbs_raw_constants_table$.getDynamicValue(thread).isHashtable()) {
            Errors.warn($str120$_kbs_raw_constants_table__is_null);
        }
        if (!$kbs_raw_constants_omission_table$.getDynamicValue(thread).isHashtable()) {
            Errors.warn($str121$_kbs_raw_constants_omission_table);
        }
        if (NIL == $kbs_skolems$.getDynamicValue(thread)) {
            Errors.warn($str122$_kbs_skolems__is_null_);
        }
        if (NIL == $kbs_constants$.getDynamicValue(thread)) {
            Errors.warn($str123$_kbs_constants__is_null_);
        }
        if (NIL == keyhash.keyhash_p($kbs_constant_table$.getDynamicValue(thread))) {
            Errors.warn($str124$_kbs_constant_table__is_null_);
        }
        if (NIL == $kbs_narts$.getDynamicValue(thread)) {
            Errors.warn($str125$_kbs_narts__is_null_);
        }
        if (NIL == $kbs_forts$.getDynamicValue(thread)) {
            Errors.warn($str126$_kbs_forts__is_null_);
        }
        if (NIL == keyhash.keyhash_p($kbs_fort_table$.getDynamicValue(thread))) {
            Errors.warn($str127$_kbs_fort_table__is_null_);
        }
        if (!$kbs_definitional_constant_table$.getDynamicValue(thread).isHashtable()) {
            Errors.warn($str128$_kbs_definitional_constant_table_);
        }
        if (!$kbs_definitional_predicate_table$.getDynamicValue(thread).isHashtable()) {
            Errors.warn($str129$_kbs_definitional_predicate_table);
        }
        if (NIL == keyhash.keyhash_p($kbs_assertion_table$.getDynamicValue(thread))) {
            Errors.warn($str130$_kbs_assertion_table__is_null_);
        }
        if (NIL == keyhash.keyhash_p($kbs_deduction_table$.getDynamicValue(thread))) {
            Errors.warn($str131$_kbs_deduction_table__is_null_);
        }
        return NIL;
    }

    public static SubLObject kbs_statistics(SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        final SubLObject fort_count = kbs_fort_count();
        final SubLObject constant_count = kbs_constant_count();
        final SubLObject nart_count = kbs_nart_count();
        final SubLObject assertion_count = kbs_assertion_count();
        final SubLObject deduction_count = kbs_deduction_count();
        final SubLObject definitional_constant_count = kbs_definitional_constant_count();
        format(stream, $str132$______KB__S_KBS_statistics__, kb_loaded());
        format(stream, $str133$__FORTs___________7___D__, fort_count);
        format(stream, $str134$___Constants______7___D__, constant_count);
        if (definitional_constant_count.isPositive()) {
            format(stream, $str135$_____def_only_____7___D__, definitional_constant_count);
        }
        format(stream, $str136$___NARTs__________7___D__, nart_count);
        format(stream, $str137$__Assertions______7___D__, assertion_count);
        format(stream, $str138$__Deductions______7___D__, deduction_count);
        terpri(stream);
        return NIL;
    }

    public static SubLObject kbs_fort_count() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $kbs_fort_table$.getDynamicValue(thread)) {
            return keyhash.keyhash_count($kbs_fort_table$.getDynamicValue(thread));
        }
        return ZERO_INTEGER;
    }

    public static SubLObject kbs_constant_count() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $kbs_constant_table$.getDynamicValue(thread)) {
            return keyhash.keyhash_count($kbs_constant_table$.getDynamicValue(thread));
        }
        return ZERO_INTEGER;
    }

    public static SubLObject kbs_nart_count() {
        return subtract(kbs_fort_count(), kbs_constant_count());
    }

    public static SubLObject kbs_definitional_constant_count() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $kbs_definitional_constant_table$.getDynamicValue(thread)) {
            return hash_table_count($kbs_definitional_constant_table$.getDynamicValue(thread));
        }
        return ZERO_INTEGER;
    }

    public static SubLObject kbs_assertion_count() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $kbs_assertion_table$.getDynamicValue(thread)) {
            return keyhash.keyhash_count($kbs_assertion_table$.getDynamicValue(thread));
        }
        return ZERO_INTEGER;
    }

    public static SubLObject kbs_deduction_count() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL != $kbs_deduction_table$.getDynamicValue(thread)) {
            return keyhash.keyhash_count($kbs_deduction_table$.getDynamicValue(thread));
        }
        return ZERO_INTEGER;
    }

    public static SubLObject count_all_kbs_assertions_in_mt(final SubLObject mt, SubLObject type) {
        if (type == UNPROVIDED) {
            type = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != fort_types_interface.isa_mtP(mt, UNPROVIDED) : "fort_types_interface.isa_mtP(mt, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != fort_types_interface.isa_mtP(mt, CommonSymbols.UNPROVIDED) " + mt;
        if (NIL == kbs_state_validP()) {
            Errors.warn($str140$No_valid_KBS_available_);
            return NIL;
        }
        SubLObject count = ZERO_INTEGER;
        final SubLObject pcase_var = kb_mapping_macros.do_mt_contents_method(function_terms.naut_to_nart(mt));
        if (pcase_var.eql($MT)) {
            if (NIL != kb_mapping_macros.do_mt_index_key_validator(function_terms.naut_to_nart(mt), type)) {
                final SubLObject final_index_spec = kb_mapping_macros.mt_final_index_spec(function_terms.naut_to_nart(mt));
                SubLObject final_index_iterator = NIL;
                try {
                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, type, NIL, NIL);
                    SubLObject done_var = NIL;
                    final SubLObject token_var = NIL;
                    while (NIL == done_var) {
                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var);
                        final SubLObject valid = makeBoolean(!token_var.eql(assertion));
                        if ((NIL != valid) && (NIL != kbs_assertion_p(assertion))) {
                            count = add(count, ONE_INTEGER);
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
            if (pcase_var.eql($BROAD_MT) && (NIL != kb_mapping_macros.do_broad_mt_index_key_validator(function_terms.naut_to_nart(mt), type))) {
                final SubLObject idx = assertion_handles.do_assertions_table();
                final SubLObject mess = $str143$do_broad_mt_index;
                final SubLObject total = id_index_count(idx);
                SubLObject sofar = ZERO_INTEGER;
                assert NIL != stringp(mess) : "Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) " + mess;
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
                        final SubLObject idx_$130 = idx;
                        if (NIL == id_index_objects_empty_p(idx_$130, $SKIP)) {
                            final SubLObject idx_$131 = idx_$130;
                            if (NIL == id_index_dense_objects_empty_p(idx_$131, $SKIP)) {
                                final SubLObject vector_var = id_index_dense_objects(idx_$131);
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
                                        if ((NIL != kb_mapping_macros.do_broad_mt_index_match_p(assertion2, function_terms.naut_to_nart(mt), type, NIL)) && (NIL != kbs_assertion_p(assertion2))) {
                                            count = add(count, ONE_INTEGER);
                                        }
                                        sofar = add(sofar, ONE_INTEGER);
                                        note_percent_progress(sofar, total);
                                    }
                                }
                            }
                            final SubLObject idx_$132 = idx_$130;
                            if ((NIL == id_index_sparse_objects_empty_p(idx_$132)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                final SubLObject sparse = id_index_sparse_objects(idx_$132);
                                SubLObject a_id2 = id_index_sparse_id_threshold(idx_$132);
                                final SubLObject end_id = id_index_next_id(idx_$132);
                                final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                                while (a_id2.numL(end_id)) {
                                    final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                                    if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                        final SubLObject assertion3 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                        if ((NIL != kb_mapping_macros.do_broad_mt_index_match_p(assertion3, function_terms.naut_to_nart(mt), type, NIL)) && (NIL != kbs_assertion_p(assertion3))) {
                                            count = add(count, ONE_INTEGER);
                                        }
                                        sofar = add(sofar, ONE_INTEGER);
                                        note_percent_progress(sofar, total);
                                    }
                                    a_id2 = add(a_id2, ONE_INTEGER);
                                } 
                            }
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$133 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values2 = getValuesAsVector();
                            noting_percent_progress_postamble();
                            restoreValuesFromVector(_values2);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$133, thread);
                        }
                    }
                } finally {
                    $percent_progress_start_time$.rebind(_prev_bind_5, thread);
                    $within_noting_percent_progress$.rebind(_prev_bind_4, thread);
                    $last_percent_progress_prediction$.rebind(_prev_bind_3, thread);
                    $last_percent_progress_index$.rebind(_prev_bind_2, thread);
                }
            }

        return count;
    }

    public static SubLObject declare_kbs_identification_file() {
        declareFunction(me, "kbs_raw_constants", "KBS-RAW-CONSTANTS", 0, 0, false);
        declareFunction(me, "kbs_raw_constant_p", "KBS-RAW-CONSTANT-P", 1, 0, false);
        declareFunction(me, "why_kbs_raw_constantP", "WHY-KBS-RAW-CONSTANT?", 1, 0, false);
        declareFunction(me, "non_kbs_raw_constant_p", "NON-KBS-RAW-CONSTANT-P", 1, 0, false);
        declareFunction(me, "why_non_kbs_raw_constantP", "WHY-NON-KBS-RAW-CONSTANT?", 1, 0, false);
        declareFunction(me, "kbs_raw_constant_omitted_p", "KBS-RAW-CONSTANT-OMITTED-P", 1, 0, false);
        declareFunction(me, "kbs_raw_el_formula_p", "KBS-RAW-EL-FORMULA-P", 1, 0, false);
        declareFunction(me, "non_kbs_raw_el_formula_p", "NON-KBS-RAW-EL-FORMULA-P", 1, 0, false);
        declareFunction(me, "reset_kbs_raw_constant_tables", "RESET-KBS-RAW-CONSTANT-TABLES", 0, 0, false);
        declareFunction(me, "compute_kbs_raw_constants", "COMPUTE-KBS-RAW-CONSTANTS", 0, 0, false);
        declareFunction(me, "clear_kbs_kbq_query_set_terms", "CLEAR-KBS-KBQ-QUERY-SET-TERMS", 0, 0, false);
        declareFunction(me, "remove_kbs_kbq_query_set_terms", "REMOVE-KBS-KBQ-QUERY-SET-TERMS", 1, 0, false);
        declareFunction(me, "kbs_kbq_query_set_terms_internal", "KBS-KBQ-QUERY-SET-TERMS-INTERNAL", 1, 0, false);
        declareFunction(me, "kbs_kbq_query_set_terms", "KBS-KBQ-QUERY-SET-TERMS", 1, 0, false);
        declareFunction(me, "kbs_skolems", "KBS-SKOLEMS", 0, 0, false);
        declareFunction(me, "kbs_skolem_p", "KBS-SKOLEM-P", 1, 0, false);
        declareFunction(me, "compute_kbs_skolems", "COMPUTE-KBS-SKOLEMS", 0, 0, false);
        declareFunction(me, "compute_kbs_skolem_p", "COMPUTE-KBS-SKOLEM-P", 1, 0, false);
        declareFunction(me, "compute_kbs_skolem_assertion_p", "COMPUTE-KBS-SKOLEM-ASSERTION-P", 2, 0, false);
        declareFunction(me, "kbs_skolem_assertion_fast_fail_constant_p", "KBS-SKOLEM-ASSERTION-FAST-FAIL-CONSTANT-P", 1, 0, false);
        declareFunction(me, "kbs_constants", "KBS-CONSTANTS", 0, 0, false);
        declareFunction(me, "kbs_constant_p", "KBS-CONSTANT-P", 1, 0, false);
        declareFunction(me, "non_kbs_constant_p", "NON-KBS-CONSTANT-P", 1, 0, false);
        declareFunction(me, "initialize_kbs_constant_table", "INITIALIZE-KBS-CONSTANT-TABLE", 0, 0, false);
        declareFunction(me, "compute_kbs_constants", "COMPUTE-KBS-CONSTANTS", 0, 0, false);
        declareFunction(me, "kbs_narts", "KBS-NARTS", 0, 0, false);
        declareFunction(me, "kbs_nart_p", "KBS-NART-P", 1, 0, false);
        declareFunction(me, "kbs_nart_formula_p", "KBS-NART-FORMULA-P", 1, 0, false);
        declareFunction(me, "compute_kbs_narts", "COMPUTE-KBS-NARTS", 0, 0, false);
        declareFunction(me, "kbs_forts", "KBS-FORTS", 0, 0, false);
        declareFunction(me, "kbs_fort_p", "KBS-FORT-P", 1, 0, false);
        declareFunction(me, "why_kbs_fortP", "WHY-KBS-FORT?", 1, 0, false);
        declareFunction(me, "non_kbs_fort_p", "NON-KBS-FORT-P", 1, 0, false);
        declareFunction(me, "why_non_kbs_fortP", "WHY-NON-KBS-FORT?", 1, 0, false);
        declareFunction(me, "kbs_definitional_fort_p", "KBS-DEFINITIONAL-FORT-P", 1, 0, false);
        declareFunction(me, "non_kbs_definitional_fort_p", "NON-KBS-DEFINITIONAL-FORT-P", 1, 0, false);
        declareFunction(me, "initialize_kbs_fort_table", "INITIALIZE-KBS-FORT-TABLE", 0, 0, false);
        declareFunction(me, "unmark_kbs_fort", "UNMARK-KBS-FORT", 1, 0, false);
        declareFunction(me, "unmark_kbs_fort_and_dependents", "UNMARK-KBS-FORT-AND-DEPENDENTS", 1, 0, false);
        declareFunction(me, "compute_kbs_forts", "COMPUTE-KBS-FORTS", 0, 0, false);
        declareFunction(me, "kbs_definitional_constant_predicate_sets", "KBS-DEFINITIONAL-CONSTANT-PREDICATE-SETS", 1, 0, false);
        declareFunction(me, "kbs_definitional_fort_predicate_sets", "KBS-DEFINITIONAL-FORT-PREDICATE-SETS", 1, 0, false);
        declareFunction(me, "kbs_definitional_constant_p", "KBS-DEFINITIONAL-CONSTANT-P", 1, 0, false);
        declareFunction(me, "non_kbs_definitional_constant_p", "NON-KBS-DEFINITIONAL-CONSTANT-P", 1, 0, false);
        declareFunction(me, "tree_gather_relevant_kbs_definitional_predicate_sets", "TREE-GATHER-RELEVANT-KBS-DEFINITIONAL-PREDICATE-SETS", 1, 0, false);
        declareFunction(me, "kbs_definitional_predicate_set_p", "KBS-DEFINITIONAL-PREDICATE-SET-P", 1, 0, false);
        declareFunction(me, "kbs_definitional_predicate_setL", "KBS-DEFINITIONAL-PREDICATE-SET<", 2, 0, false);
        declareFunction(me, "kbs_predicate_definitional_predicate_sets", "KBS-PREDICATE-DEFINITIONAL-PREDICATE-SETS", 1, 0, false);
        declareFunction(me, "all_kbs_definitional_predicates", "ALL-KBS-DEFINITIONAL-PREDICATES", 0, 0, false);
        declareFunction(me, "kbs_definitional_predicate_p", "KBS-DEFINITIONAL-PREDICATE-P", 1, 0, false);
        declareFunction(me, "clear_kbs_definitional_predicate_table", "CLEAR-KBS-DEFINITIONAL-PREDICATE-TABLE", 0, 0, false);
        declareFunction(me, "initialize_kbs_definitional_predicate_table", "INITIALIZE-KBS-DEFINITIONAL-PREDICATE-TABLE", 0, 0, false);
        declareFunction(me, "compute_kbs_definitional_predicates", "COMPUTE-KBS-DEFINITIONAL-PREDICATES", 0, 0, false);
        declareFunction(me, "kbs_rule_definitional_predicate_sets", "KBS-RULE-DEFINITIONAL-PREDICATE-SETS", 1, 0, false);
        declareFunction(me, "clear_kbs_definitional_rule_table", "CLEAR-KBS-DEFINITIONAL-RULE-TABLE", 0, 0, false);
        declareFunction(me, "initialize_kbs_definitional_rule_table", "INITIALIZE-KBS-DEFINITIONAL-RULE-TABLE", 0, 0, false);
        declareFunction(me, "compute_kbs_definitional_rules", "COMPUTE-KBS-DEFINITIONAL-RULES", 0, 0, false);
        declareFunction(me, "kbs_assertion_table", "KBS-ASSERTION-TABLE", 0, 0, false);
        declareFunction(me, "kbs_assertion_p", "KBS-ASSERTION-P", 1, 0, false);
        declareFunction(me, "why_kbs_assertionP", "WHY-KBS-ASSERTION?", 1, 0, false);
        declareFunction(me, "non_kbs_assertion_p", "NON-KBS-ASSERTION-P", 1, 0, false);
        declareFunction(me, "why_non_kbs_assertionP", "WHY-NON-KBS-ASSERTION?", 1, 0, false);
        declareFunction(me, "initialize_kbs_assertion_table", "INITIALIZE-KBS-ASSERTION-TABLE", 1, 0, false);
        declareFunction(me, "mark_kbs_assertion", "MARK-KBS-ASSERTION", 1, 0, false);
        declareFunction(me, "unmark_kbs_assertion", "UNMARK-KBS-ASSERTION", 1, 0, false);
        declareFunction(me, "compute_kbs_assertions", "COMPUTE-KBS-ASSERTIONS", 0, 0, false);
        declareFunction(me, "compute_kbs_assertion_p", "COMPUTE-KBS-ASSERTION-P", 1, 0, false);
        declareFunction(me, "compute_non_kbs_assertion_p", "COMPUTE-NON-KBS-ASSERTION-P", 1, 0, false);
        declareFunction(me, "kbs_assertion_references_excluded_termsP", "KBS-ASSERTION-REFERENCES-EXCLUDED-TERMS?", 1, 0, false);
        declareFunction(me, "kbs_definitionally_restricted_assertionP", "KBS-DEFINITIONALLY-RESTRICTED-ASSERTION?", 1, 0, false);
        declareFunction(me, "kbs_deduction_p", "KBS-DEDUCTION-P", 1, 0, false);
        declareFunction(me, "non_kbs_deduction_p", "NON-KBS-DEDUCTION-P", 1, 0, false);
        declareFunction(me, "initialize_kbs_deduction_table", "INITIALIZE-KBS-DEDUCTION-TABLE", 1, 0, false);
        declareFunction(me, "compute_kbs_deductions", "COMPUTE-KBS-DEDUCTIONS", 0, 0, false);
        declareFunction(me, "compute_kbs_deduction_p", "COMPUTE-KBS-DEDUCTION-P", 1, 0, false);
        declareFunction(me, "compute_kbs_support_p", "COMPUTE-KBS-SUPPORT-P", 1, 0, false);
        declareFunction(me, "kbs_fort_state_validP", "KBS-FORT-STATE-VALID?", 0, 0, false);
        declareFunction(me, "kbs_state_validP", "KBS-STATE-VALID?", 0, 0, false);
        declareFunction(me, "prepare_kbs_kb_destructive", "PREPARE-KBS-KB-DESTRUCTIVE", 0, 1, false);
        declareFunction(me, "kbs_get_kappa_specified_assertions", "KBS-GET-KAPPA-SPECIFIED-ASSERTIONS", 1, 0, false);
        declareFunction(me, "kbs_handle_preremoved_assertion", "KBS-HANDLE-PREREMOVED-ASSERTION", 1, 1, false);
        declareFunction(me, "do_prerun_kbs_fns", "DO-PRERUN-KBS-FNS", 0, 0, false);
        declareFunction(me, "identify_kbs_forts_and_assertions", "IDENTIFY-KBS-FORTS-AND-ASSERTIONS", 0, 0, false);
        declareFunction(me, "identify_kbs_forts", "IDENTIFY-KBS-FORTS", 0, 0, false);
        declareFunction(me, "do_post_identify_kbs_forts_fns", "DO-POST-IDENTIFY-KBS-FORTS-FNS", 0, 0, false);
        declareFunction(me, "perform_limitation_motivated_post_identify_cleanups", "PERFORM-LIMITATION-MOTIVATED-POST-IDENTIFY-CLEANUPS", 0, 0, false);
        declareFunction(me, "identify_kbs_assertions", "IDENTIFY-KBS-ASSERTIONS", 0, 0, false);
        declareFunction(me, "do_post_identify_kbs_assertions_fns", "DO-POST-IDENTIFY-KBS-ASSERTIONS-FNS", 0, 0, false);
        declareFunction(me, "identify_kbs_deductions", "IDENTIFY-KBS-DEDUCTIONS", 0, 0, false);
        declareFunction(me, "clear_kbs_state", "CLEAR-KBS-STATE", 0, 0, false);
        declareFunction(me, "why_kbs_state_invalidP", "WHY-KBS-STATE-INVALID?", 0, 0, false);
        declareFunction(me, "kbs_statistics", "KBS-STATISTICS", 0, 1, false);
        declareFunction(me, "kbs_fort_count", "KBS-FORT-COUNT", 0, 0, false);
        declareFunction(me, "kbs_constant_count", "KBS-CONSTANT-COUNT", 0, 0, false);
        declareFunction(me, "kbs_nart_count", "KBS-NART-COUNT", 0, 0, false);
        declareFunction(me, "kbs_definitional_constant_count", "KBS-DEFINITIONAL-CONSTANT-COUNT", 0, 0, false);
        declareFunction(me, "kbs_assertion_count", "KBS-ASSERTION-COUNT", 0, 0, false);
        declareFunction(me, "kbs_deduction_count", "KBS-DEDUCTION-COUNT", 0, 0, false);
        declareFunction(me, "count_all_kbs_assertions_in_mt", "COUNT-ALL-KBS-ASSERTIONS-IN-MT", 1, 1, false);
        return NIL;
    }

    public static SubLObject init_kbs_identification_file() {
        defvar("*KBS-RAW-CONSTANTS*", NIL);
        defvar("*KBS-RAW-CONSTANTS-TABLE*", NIL);
        defvar("*KBS-RAW-CONSTANTS-OMISSION-TABLE*", NIL);
        defvar("*KBS-DEFINITIONAL-CONSTANT-TABLE*", NIL);
        deflexical("*KBS-KBQ-QUERY-SET-TERMS-CACHING-STATE*", NIL);
        defvar("*KBS-SKOLEMS*", NIL);
        defvar("*KBS-CONSTANTS*", NIL);
        defvar("*KBS-CONSTANT-TABLE*", make_hash_table($int$1000, symbol_function(EQ), UNPROVIDED));
        defvar("*KBS-NARTS*", NIL);
        defvar("*KBS-FORTS*", NIL);
        defvar("*KBS-FORT-TABLE*", NIL);
        defvar("*KBS-ORDERED-DEFINITIONAL-PREDICATE-SETS*", NIL);
        defvar("*KBS-DEFINITIONAL-PREDICATE-TABLE*", NIL);
        defvar("*KBS-DEFINITIONAL-RULE-TABLE*", NIL);
        defvar("*KBS-ASSERTION-TABLE*", NIL);
        defvar("*KBS-DEDUCTION-TABLE*", NIL);
        defvar("*KBS-FORT-STATE-VALID?*", NIL);
        defvar("*KBS-STATE-VALID?*", NIL);
        deflexical("*DEFAULT-KBS-KAPPA-QUERY-SETTINGS*", $list99);
        defparameter("*KBS-KAPPA-QUERY-SETTINGS*", $default_kbs_kappa_query_settings$.getGlobalValue());
        return NIL;
    }

    public static SubLObject setup_kbs_identification_file() {
        memoization_state.note_globally_cached_function(KBS_KBQ_QUERY_SET_TERMS);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_kbs_identification_file();
    }

    @Override
    public void initializeVariables() {
        init_kbs_identification_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_kbs_identification_file();
    }

    static {





































































































































































    }
}

/**
 * Total time: 8188 ms
 */
