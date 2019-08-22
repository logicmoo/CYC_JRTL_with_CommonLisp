package com.cyc.cycjava.cycl.sksi.query_sks;


import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.$expensive_hl_module_check_cost$;
import static com.cyc.cycjava.cycl.el_utilities.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.eq;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Eval.eval;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages.intern;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.aref;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.util.SubLFiles.*;

import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.cyc_kernel;
import com.cyc.cycjava.cycl.cycl_grammar;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.cycjava.cycl.czer_utilities;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary_utilities;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.fort_types_interface;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.genl_predicates;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.hlmt;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.kb_mapping;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.keyhash_utilities;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.narts_high;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.cycjava.cycl.inference.harness.inference_modules;
import com.cyc.cycjava.cycl.inference.harness.removal_module_utilities;
import com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate;
import com.cyc.cycjava.cycl.sksi.sks_browser.sksi_external_browser_utilities;
import com.cyc.cycjava.cycl.sksi.sks_browser.sksi_external_term_browser;
import com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_gaf_arg_indexing;
import com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_mt_indexing;
import com.cyc.cycjava.cycl.sksi.sks_indexing.sksi_sks_predicate_indexing;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_access_path;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_generation;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_debugging;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_infrastructure_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
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


public final class sksi_removal_module_generation extends SubLTranslatedFile {
    public static final SubLFile me = new sksi_removal_module_generation();

    public static final String myName = "com.cyc.cycjava.cycl.sksi.query_sks.sksi_removal_module_generation";

    public static final String myFingerPrint = "d7df1b2b65f88671a48232343ff9ee0d42518ebdbc2367b0e76d645e16f50a04";



    // defparameter
    public static final SubLSymbol $sksi_browsing_enabled$ = makeSymbol("*SKSI-BROWSING-ENABLED*");

















    // deflexical
    /**
     * List of preds which we do not to store rewrite module info for meaning
     * sentences of that pred.
     */
    private static final SubLSymbol $filtered_sksi_preds$ = makeSymbol("*FILTERED-SKSI-PREDS*");





    // defparameter
    private static final SubLSymbol $sks_preference_modules_count$ = makeSymbol("*SKS-PREFERENCE-MODULES-COUNT*");

    // defparameter
    private static final SubLSymbol $sks_prune_modules_count$ = makeSymbol("*SKS-PRUNE-MODULES-COUNT*");

    // deflexical
    /**
     * The properties that an SKSI module-info contains, but are not supported by
     * the inference engine module harness. These properties must be declared/stored
     * elsewhere than the inference engine module store, e.g. the SKSI module cache.
     */
    private static final SubLSymbol $sksi_specific_module_properties$ = makeSymbol("*SKSI-SPECIFIC-MODULE-PROPERTIES*");



    // deflexical
    private static final SubLSymbol $sksi_default_check_cost$ = makeSymbol("*SKSI-DEFAULT-CHECK-COST*");









    // defparameter
    private static final SubLSymbol $sksi_supported_gaf_argument_browsing_max_term_cutoff$ = makeSymbol("*SKSI-SUPPORTED-GAF-ARGUMENT-BROWSING-MAX-TERM-CUTOFF*");

    // defparameter
    private static final SubLSymbol $show_sksi_supported_gaf_argument_browsing_skipsP$ = makeSymbol("*SHOW-SKSI-SUPPORTED-GAF-ARGUMENT-BROWSING-SKIPS?*");

    // Internal Constants
    public static final SubLSymbol $sksi_modules$ = makeSymbol("*SKSI-MODULES*");

    public static final SubLList $list1 = list(list(makeSymbol("HL-MODULE")), makeSymbol("&BODY"), makeSymbol("BODY"));



    public static final SubLList $list3 = list(makeSymbol("*SKSI-MODULES*"));



    public static final SubLList $list5 = list(list(makeSymbol("SET-ELEMENT-LIST"), makeSymbol("*SKSI-MODULES*")));

    public static final SubLSymbol $sksi_module_supports$ = makeSymbol("*SKSI-MODULE-SUPPORTS*");

    public static final SubLSymbol $sksi_module_simple_required_pattern$ = makeSymbol("*SKSI-MODULE-SIMPLE-REQUIRED-PATTERN*");

    public static final SubLSymbol $sks_multiply_indexed_conditional_meaning_sentence_cache$ = makeSymbol("*SKS-MULTIPLY-INDEXED-CONDITIONAL-MEANING-SENTENCE-CACHE*");

    public static final SubLSymbol $sksi_module_multiply_indexed_conditional_meaning_sentence_cache$ = makeSymbol("*SKSI-MODULE-MULTIPLY-INDEXED-CONDITIONAL-MEANING-SENTENCE-CACHE*");

    public static final SubLSymbol $sksi_modules_by_sks$ = makeSymbol("*SKSI-MODULES-BY-SKS*");



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLSymbol $sksi_code_mapping_sks_cache$ = makeSymbol("*SKSI-CODE-MAPPING-SKS-CACHE*");

    private static final SubLList $list14 = list(list(makeSymbol("SKS"), makeSymbol("PS"), makeSymbol("LS"), makeSymbol("MAPPING-MT")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLSymbol $sym15$TUPLE = makeUninternedSymbol("TUPLE");

    private static final SubLSymbol $sym16$TUPLES = makeUninternedSymbol("TUPLES");



    private static final SubLList $list18 = list(makeSymbol("*SKSI-CODE-MAPPING-SKS-CACHE*"));



    private static final SubLSymbol CODE_MAPPING_FORWARD_RULES_TO_REPROPAGATE = makeSymbol("CODE-MAPPING-FORWARD-RULES-TO-REPROPAGATE");

    private static final SubLObject $$codeMapping = reader_make_constant_shell(makeString("codeMapping"));



    private static final SubLObject $$SKSIMt = reader_make_constant_shell(makeString("SKSIMt"));



    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");

    private static final SubLObject $$isa = reader_make_constant_shell(makeString("isa"));

    private static final SubLSymbol $isa_sks_term_to_cycl_term_mts$ = makeSymbol("*ISA-SKS-TERM-TO-CYCL-TERM-MTS*");



    private static final SubLSymbol $isa_sks_term_to_cycl_term_store$ = makeSymbol("*ISA-SKS-TERM-TO-CYCL-TERM-STORE*");

    private static final SubLSymbol ALL_SKSI_RELEVANT_REWRITE_SPECS_FOR_TERM_INT = makeSymbol("ALL-SKSI-RELEVANT-REWRITE-SPECS-FOR-TERM-INT");

    private static final SubLSymbol ALL_SKSI_RELEVANT_REWRITE_ISAS_INT = makeSymbol("ALL-SKSI-RELEVANT-REWRITE-ISAS-INT");

    public static final SubLList $list33 = list(makeSymbol("ARG-POS"), makeSymbol("TERMS"));

    private static final SubLList $list34 = list(reader_make_constant_shell(makeString("holdsIn")));

    private static final SubLSymbol $meaning_sentence_mts$ = makeSymbol("*MEANING-SENTENCE-MTS*");

    private static final SubLSymbol $meaning_sentence_pred_store$ = makeSymbol("*MEANING-SENTENCE-PRED-STORE*");

    private static final SubLSymbol ALL_SKSI_RELEVANT_REWRITE_SPEC_PREDS_FOR_PRED_INT = makeSymbol("ALL-SKSI-RELEVANT-REWRITE-SPEC-PREDS-FOR-PRED-INT");

    private static final SubLSymbol ALL_SKSI_RELEVANT_REWRITE_SPEC_INVERSES_FOR_PRED_INT = makeSymbol("ALL-SKSI-RELEVANT-REWRITE-SPEC-INVERSES-FOR-PRED-INT");

    public static final SubLSymbol $sym39$CODE_MAPPING_KNOWLEDGE_SOURCE_ = makeSymbol("CODE-MAPPING-KNOWLEDGE-SOURCE?");

    public static final SubLList $list40 = list(makeSymbol("HL-MODULE-INFO-PLIST"), makeSymbol("HL-MODULE-RELEVANT-CODE-MAPPING-SCHEMAS"), makeSymbol("HL-MODULE-RELEVANT-INSTANCE-NAMED-FN-COLLS"));



    private static final SubLSymbol $SIMPLE_REQUIRED_PATTERN = makeKeyword("SIMPLE-REQUIRED-PATTERN");



    private static final SubLSymbol $MULTIPLY_INDEXED_CMS = makeKeyword("MULTIPLY-INDEXED-CMS");

    public static final SubLList $list45 = list(makeSymbol("PS"), makeSymbol("LS"), makeSymbol("MAPPING-MT"));

    public static final SubLList $list46 = list(makeKeyword("MODULE-NAME"), makeKeyword("SIMPLE-REQUIRED-PATTERN"), makeKeyword("MODULE-SUPPORTS"), makeKeyword("INPUT-TERMNUMS"), makeKeyword("OUTPUT-TERMNUMS"), makeKeyword("MULTIPLY-INDEXED-CMS"), makeKeyword("MEANING-SENTENCE"));

    public static final SubLString $str47$_S_was_not_a_valid_module_paramet = makeString("~S was not a valid module parameter");







    public static final SubLString $str51$sksi_ = makeString("sksi-");



    public static final SubLString $str53$Invalid_predicate_for_meaning_sen = makeString("Invalid predicate for meaning sentence GAF: ~a.");

    public static final SubLString $str54$complex_non_atomic_meaning_senten = makeString("complex non-atomic meaning sentences not handled yet");

    public static final SubLSymbol LOGICAL_FIELD_INDEXICAL_P = makeSymbol("LOGICAL-FIELD-INDEXICAL-P");

    public static final SubLString $str56$No_logical_field_indexicals_for_m = makeString("No logical field indexicals for meaning sentence ~a in logical schemata ~a.");

    public static final SubLString $str57$The_following_conditional_meaning = makeString("The following conditional meaning sentence GAF is not supported: ~%~a");

    public static final SubLString $str58$Invalid_consequent_predicate_for_ = makeString("Invalid consequent predicate for conditional meaning sentence GAF: ~a.");

    public static final SubLSymbol PHYSICAL_SCHEMA_SK_SOURCES_MEMOIZED = makeSymbol("PHYSICAL-SCHEMA-SK-SOURCES-MEMOIZED");

    public static final SubLSymbol LOGICAL_SCHEMA_PHYSICAL_SCHEMATA = makeSymbol("LOGICAL-SCHEMA-PHYSICAL-SCHEMATA");

    private static final SubLSymbol $OUTPUT_GENERATE_PATTERN = makeKeyword("OUTPUT-GENERATE-PATTERN");

    private static final SubLSymbol $OUTPUT_CHECK_PATTERN = makeKeyword("OUTPUT-CHECK-PATTERN");





    public static final SubLString $str65$No__output_generate_pattern_or__o = makeString("No :output-generate-pattern or :output-check-pattern.");

    public static final SubLSymbol CSQL_FROM_CLAUSE_P = makeSymbol("CSQL-FROM-CLAUSE-P");

    public static final SubLSymbol CSQL_WHERE_CLAUSE_P = makeSymbol("CSQL-WHERE-CLAUSE-P");



    public static final SubLSymbol CSQL_SELECT_QUERY_P = makeSymbol("CSQL-SELECT-QUERY-P");

    public static final SubLSymbol SKSI_GET_ANY_PREDICATES_PATTERN = makeSymbol("SKSI-GET-ANY-PREDICATES-PATTERN");

    private static final SubLObject $$SchemaObjectFn = reader_make_constant_shell(makeString("SchemaObjectFn"));

    public static final SubLList $list72 = list(makeKeyword("ANYTHING"));

    private static final SubLObject $$SourceSchemaObjectFn = reader_make_constant_shell(makeString("SourceSchemaObjectFn"));

    public static final SubLSymbol LFI_ALIAS_FN_NAUT_P = makeSymbol("LFI-ALIAS-FN-NAUT-P");

    public static final SubLSymbol LOGICAL_FIELD_INDEXICAL_FORT_P = makeSymbol("LOGICAL-FIELD-INDEXICAL-FORT-P");



    private static final SubLObject $$evaluate = reader_make_constant_shell(makeString("evaluate"));

    public static final SubLSymbol NON_LOGICAL_FIELD_INDEXICAL_P = makeSymbol("NON-LOGICAL-FIELD-INDEXICAL-P");



    private static final SubLObject $$sksiModulesDoomedUnlessArgBound = reader_make_constant_shell(makeString("sksiModulesDoomedUnlessArgBound"));

    private static final SubLSymbol $NOT_FULLY_BOUND = makeKeyword("NOT-FULLY-BOUND");

    private static final SubLSymbol $sym82$PHYSICAL_SCHEMA_ENUMERABLE_ = makeSymbol("PHYSICAL-SCHEMA-ENUMERABLE?");

    public static final SubLList $list83 = list(list(ZERO_INTEGER));



    private static final SubLList $list85 = list(makeSymbol("TUPLE"), makeSymbol("INPUT-TERMNUMS"), makeSymbol("OUTPUT-TERMNUMS"));

    private static final SubLString $str86$Could_not_constrain_the__not_full = makeString("Could not constrain the :not-fully-bound predicate for ~a");















    private static final SubLList $list94 = list(makeKeyword("FULLY-BOUND"), makeKeyword("NOT-FULLY-BOUND"));

    public static final SubLList $list95 = list(makeKeyword("FULLY-BOUND"));



    private static final SubLList $list97 = list(makeSymbol("ARG-POS-LIST"), makeSymbol("VALUE"));



    private static final SubLSymbol MAKE_NAT_SUBPATTERN = makeSymbol("MAKE-NAT-SUBPATTERN");





    private static final SubLList $list102 = list(makeKeyword("NOT-FULLY-BOUND"));



    private static final SubLSymbol $sym104$NAUT_ = makeSymbol("NAUT?");

    private static final SubLSymbol MAKE_UNIFY_SUBPATTERN = makeSymbol("MAKE-UNIFY-SUBPATTERN");

    private static final SubLSymbol NON_SENTENTIAL_RELATION_FORT_P = makeSymbol("NON-SENTENTIAL-RELATION-FORT-P");

    private static final SubLSymbol NAT_SUBPATTERN_P = makeSymbol("NAT-SUBPATTERN-P");

    private static final SubLSymbol MAKE_DISJUNCTIVE_SUBPATTERN = makeSymbol("MAKE-DISJUNCTIVE-SUBPATTERN");

    private static final SubLObject $$SententialRelation = reader_make_constant_shell(makeString("SententialRelation"));

    private static final SubLSymbol UNIFY_SUBPATTERN_P = makeSymbol("UNIFY-SUBPATTERN-P");



    private static final SubLSymbol DISJUNCTIVE_SUBPATTERN_P = makeSymbol("DISJUNCTIVE-SUBPATTERN-P");

    private static final SubLSymbol NARTIFY_NAT_PATTERN = makeSymbol("NARTIFY-NAT-PATTERN");



    private static final SubLSymbol GENERATE_SKSI_SLRM_REQUIRED_FUNCTION = makeSymbol("GENERATE-SKSI-SLRM-REQUIRED-FUNCTION");



    private static final SubLList $list117 = list(makeSymbol("ASENT"), makeSymbol("SENSE"));

    private static final SubLList $list118 = list(makeSymbol("IGNORE"), makeSymbol("ASENT"), makeSymbol("SENSE"));



    private static final SubLSymbol $sym120$EXTERNAL_SOURCE_ACTIVATED_IN_IMAGE_ = makeSymbol("EXTERNAL-SOURCE-ACTIVATED-IN-IMAGE?");

    private static final SubLSymbol $generate_sksi_slrm_required_function_caching_state$ = makeSymbol("*GENERATE-SKSI-SLRM-REQUIRED-FUNCTION-CACHING-STATE*");

    private static final SubLString $str122$_REQUIRED_FUNC = makeString("-REQUIRED-FUNC");

    private static final SubLSymbol $sym123$SKSI_ONLY_PREDICATE_ = makeSymbol("SKSI-ONLY-PREDICATE?");

    private static final SubLObject $$SKSIOnlyPredicate = reader_make_constant_shell(makeString("SKSIOnlyPredicate"));

    private static final SubLInteger $int$1024 = makeInteger(1024);







    private static final SubLString $str129$_prune_unreformulatable = makeString("-prune-unreformulatable");









    private static final SubLList $list134 = list(makeKeyword("SKSI"));













    private static final SubLList $list141 = list(makeKeyword("NOT"), list(makeKeyword("MODULE-SUBTYPE"), makeKeyword("SKSI")));



    public static final SubLList $list143 = list(makeKeyword("COST-EXPRESSION"), ZERO_INTEGER);



    private static final SubLList $list145 = list(list(makeKeyword("NOT"), list(makeKeyword("MODULE-SUBTYPE"), makeKeyword("SKSI"))));

    private static final SubLSymbol $INPUT_EXTRACT_PATTERN = makeKeyword("INPUT-EXTRACT-PATTERN");

    private static final SubLSymbol $INPUT_ENCODE_PATTERN = makeKeyword("INPUT-ENCODE-PATTERN");

    private static final SubLSymbol $INPUT_VERIFY_PATTERN = makeKeyword("INPUT-VERIFY-PATTERN");

    private static final SubLSymbol $OUTPUT_DECODE_PATTERN = makeKeyword("OUTPUT-DECODE-PATTERN");

    private static final SubLSymbol $OUTPUT_VERIFY_PATTERN = makeKeyword("OUTPUT-VERIFY-PATTERN");

    private static final SubLSymbol $OUTPUT_CONSTRUCT_PATTERN = makeKeyword("OUTPUT-CONSTRUCT-PATTERN");













    private static final SubLString $str158$___not_ = makeString("(#$not ");

    private static final SubLString $str159$_ = makeString(")");

    public static final SubLString $str160$_FULLY_BOUND = makeString(" FULLY-BOUND");

    public static final SubLString $str161$__FULLY_BOUND_ = makeString(" <FULLY-BOUND>");

    private static final SubLString $str162$_FULLY_BOUND = makeString("(FULLY-BOUND");

    private static final SubLString $str163$__FULLY_BOUND_ = makeString("(<FULLY-BOUND>");

    private static final SubLString $str164$NOT_FULLY_BOUND = makeString("NOT-FULLY-BOUND");

    private static final SubLString $str165$_NOT_FULLY_BOUND_ = makeString("<NOT-FULLY-BOUND>");







    private static final SubLList $list169 = list(makeKeyword("TEST"), makeSymbol("SKSI-REFORMULATION-CHECK"));

    private static final SubLList $list170 = list(makeKeyword("TEST"), makeSymbol("SKSI-NOT-CONTAINING-NIL-P"));

    private static final SubLSymbol TOKEN_CYCL_SYMBOL_FOR_TERMNUM = makeSymbol("TOKEN-CYCL-SYMBOL-FOR-TERMNUM");



    private static final SubLSymbol $sym173$SKSI_REFORMULATABLE_VIA_TEMPLATE_ = makeSymbol("SKSI-REFORMULATABLE-VIA-TEMPLATE?");

    private static final SubLString $str174$No_field_encodings_for_physical_f = makeString("No field encodings for physical field indexical ~a, physical schemata ~a, and logical schemata ~a.");









    private static final SubLSymbol SKSI_REFORMULATE = makeSymbol("SKSI-REFORMULATE");

    private static final SubLString $str180$No_field_decodings_for_logical_fi = makeString("No field decodings for logical field indexical ~a, logical schemata ~a, and physical schemata ~a.");



    private static final SubLSymbol DUMMY_EXTERNAL_TERM_DENOTING_FUNCTION_EXPRESSION_P = makeSymbol("DUMMY-EXTERNAL-TERM-DENOTING-FUNCTION-EXPRESSION-P");

    private static final SubLSymbol CITY_NAMED_FN_EXPRESSION_P = makeSymbol("CITY-NAMED-FN-EXPRESSION-P");

    private static final SubLSymbol SCHEMA_OBJECT_FN_EXPRESSION_P = makeSymbol("SCHEMA-OBJECT-FN-EXPRESSION-P");

    private static final SubLSymbol SOURCE_SCHEMA_OBJECT_FN_EXPRESSION_P = makeSymbol("SOURCE-SCHEMA-OBJECT-FN-EXPRESSION-P");

    private static final SubLSymbol INSTANCE_NAMED_FN_EXPRESSION_P = makeSymbol("INSTANCE-NAMED-FN-EXPRESSION-P");

    private static final SubLObject $$City = reader_make_constant_shell(makeString("City"));

    private static final SubLSymbol GET_SKSI_REMOVAL_MODULE_COST = makeSymbol("GET-SKSI-REMOVAL-MODULE-COST");



    private static final SubLSymbol LOGICAL_FIELD_FOR_INDEXICAL = makeSymbol("LOGICAL-FIELD-FOR-INDEXICAL");

    private static final SubLSymbol $sym191$FAST_SUBSET_ = makeSymbol("FAST-SUBSET?");

    private static final SubLSymbol $sym192$SETS_EQUAL_ = makeSymbol("SETS-EQUAL?");

    private static final SubLSymbol $sym193$FAST_SUPERSET_ = makeSymbol("FAST-SUPERSET?");

    private static final SubLSymbol GENERATE_SKSI_SINGLE_LITERAL_COST_RECORDING_ITERATOR = makeSymbol("GENERATE-SKSI-SINGLE-LITERAL-COST-RECORDING-ITERATOR");

    private static final SubLSymbol GENERATE_BOOLEAN_FROM_CSQL = makeSymbol("GENERATE-BOOLEAN-FROM-CSQL");

    private static final SubLSymbol NOT_BOOLEAN = makeSymbol("NOT-BOOLEAN");

    private static final SubLSymbol PHYSICAL_SCHEMA_REQUIRED_FIELDS = makeSymbol("PHYSICAL-SCHEMA-REQUIRED-FIELDS");

    private static final SubLList $list198 = list(makeSymbol("SELECT-KEYWORD"), makeSymbol("FIELDS"), makeSymbol("FROM"), makeSymbol("&OPTIONAL"), makeSymbol("WHERE"));

    private static final SubLList $list199 = list(makeSymbol("WHERE-KEYWORD"), makeSymbol("WHERE-CLAUSE"));

    private static final SubLString $str200$CYCL_TERM = makeString("CYCL-TERM");

    private static final SubLString $str201$RAW_TERM = makeString("RAW-TERM");

    private static final SubLString $$$RAW = makeString("RAW");

    private static final SubLString $$$CYCL = makeString("CYCL");

    private static final SubLSymbol $virtual_assertion_count$ = makeSymbol("*VIRTUAL-ASSERTION-COUNT*");

    private static final SubLSymbol $mt_virtual_assertion_count_table$ = makeSymbol("*MT-VIRTUAL-ASSERTION-COUNT-TABLE*");

    private static final SubLSymbol $sksi_module_code_mapping_terms_cache$ = makeSymbol("*SKSI-MODULE-CODE-MAPPING-TERMS-CACHE*");

    private static final SubLSymbol $sksi_module_logical_schemas_cache$ = makeSymbol("*SKSI-MODULE-LOGICAL-SCHEMAS-CACHE*");

    private static final SubLSymbol SKSI_MODULE_ANY_PREDICATES_LIST = makeSymbol("SKSI-MODULE-ANY-PREDICATES-LIST");

    private static final SubLSymbol SKSI_SUPPORTED_PREDICATE_TYPE_P = makeSymbol("SKSI-SUPPORTED-PREDICATE-TYPE-P");

    private static final SubLInteger $int$5000 = makeInteger(5000);



    private static final SubLString $str212$Too_many_term_arguments___S__for_ = makeString("Too many term arguments (~S) for meaning-sentence ~S to register browsing on all of them.  Skipping.");

    private static final SubLString $str213$Too_many_code_mapping_terms___S__ = makeString("Too many code mapping terms (~S) for meaning-sentence ~S to register browsing on all of them.  Skipping.");

    private static final SubLSymbol GATHER_CYCL_TERMS_MAPPED_TO_BY_CODE_MAPPING_SCHEMAS = makeSymbol("GATHER-CYCL-TERMS-MAPPED-TO-BY-CODE-MAPPING-SCHEMAS");

    private static final SubLList $list215 = list(makeSymbol("ARG-POS"), makeSymbol("CODE-MAPPING-SCHEMAS"));

    private static final SubLList $list216 = list(makeSymbol("ARG-POS"), makeSymbol("COLLS"));

    private static final SubLString $str217$Continue_without_generating_remov = makeString("Continue without generating removal modules for ");

    public static SubLObject sksi_module_p(final SubLObject hl_module) {
        return set.set_memberP(hl_module, $sksi_modules$.getGlobalValue());
    }

    public static SubLObject do_sksi_modules(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list1);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject hl_module = NIL;
        destructuring_bind_must_consp(current, datum, $list1);
        hl_module = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(DO_SET, bq_cons(hl_module, $list3), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list1);
        return NIL;
    }

    public static SubLObject do_sksi_modules_list(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list1);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject hl_module = NIL;
        destructuring_bind_must_consp(current, datum, $list1);
        hl_module = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CDOLIST, bq_cons(hl_module, $list5), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list1);
        return NIL;
    }

    public static SubLObject sksi_modules_count() {
        return set.set_size($sksi_modules$.getGlobalValue());
    }

    public static SubLObject some_sksi_single_literal_removal_module_registeredP() {
        return makeBoolean(NIL == set.set_emptyP($sksi_modules$.getGlobalValue()));
    }

    public static SubLObject note_sksi_module(final SubLObject hl_module) {
        return set.set_add(hl_module, $sksi_modules$.getGlobalValue());
    }

    public static SubLObject un_note_sksi_module(final SubLObject hl_module) {
        return set.set_remove(hl_module, $sksi_modules$.getGlobalValue());
    }

    public static SubLObject un_note_all_sksi_modules() {
        return set.clear_set($sksi_modules$.getGlobalValue());
    }

    public static SubLObject note_sksi_module_supports(final SubLObject hl_module, final SubLObject supports) {
        return dictionary.dictionary_enter($sksi_module_supports$.getGlobalValue(), hl_module, supports);
    }

    public static SubLObject un_note_sksi_module_supports(final SubLObject hl_module) {
        return dictionary.dictionary_remove($sksi_module_supports$.getGlobalValue(), hl_module);
    }

    public static SubLObject un_note_all_sksi_module_supports() {
        return dictionary.clear_dictionary($sksi_module_supports$.getGlobalValue());
    }

    public static SubLObject sksi_module_supports(final SubLObject hl_module) {
        return dictionary.dictionary_lookup_without_values($sksi_module_supports$.getGlobalValue(), hl_module, UNPROVIDED);
    }

    public static SubLObject note_sksi_module_simple_required_pattern(final SubLObject hl_module, final SubLObject pattern) {
        return dictionary.dictionary_enter($sksi_module_simple_required_pattern$.getGlobalValue(), hl_module, pattern);
    }

    public static SubLObject un_note_sksi_module_simple_required_pattern(final SubLObject hl_module) {
        return dictionary.dictionary_remove($sksi_module_simple_required_pattern$.getGlobalValue(), hl_module);
    }

    public static SubLObject un_note_all_sksi_module_simple_required_patterns() {
        return dictionary.clear_dictionary($sksi_module_simple_required_pattern$.getGlobalValue());
    }

    public static SubLObject sksi_module_simple_required_pattern(final SubLObject hl_module) {
        return dictionary.dictionary_lookup_without_values($sksi_module_simple_required_pattern$.getGlobalValue(), hl_module, UNPROVIDED);
    }

    public static SubLObject note_multiply_indexed_conditional_meaning_sentence_for_sks(final SubLObject sks, final SubLObject conditional_meaning_sentence_gaf) {
        final SubLObject cur_val = dictionary.dictionary_lookup_without_values($sks_multiply_indexed_conditional_meaning_sentence_cache$.getGlobalValue(), sks, UNPROVIDED);
        if (NIL != set.set_p(cur_val)) {
            return set.set_add(conditional_meaning_sentence_gaf, cur_val);
        }
        final SubLObject new_val = set.new_set(symbol_function(EQ), UNPROVIDED);
        set.set_add(conditional_meaning_sentence_gaf, new_val);
        return dictionary.dictionary_enter($sks_multiply_indexed_conditional_meaning_sentence_cache$.getGlobalValue(), sks, new_val);
    }

    public static SubLObject un_note_multiply_indexed_conditional_meaning_sentence_for_sks(final SubLObject sks, final SubLObject conditional_meaning_sentence_gaf) {
        final SubLObject cur_val = dictionary.dictionary_lookup_without_values($sks_multiply_indexed_conditional_meaning_sentence_cache$.getGlobalValue(), sks, UNPROVIDED);
        if (NIL != set.set_p(cur_val)) {
            return set.set_remove(conditional_meaning_sentence_gaf, cur_val);
        }
        return NIL;
    }

    public static SubLObject multiply_indexed_conditional_meaning_sentence_noted_for_sksP(final SubLObject sks, final SubLObject conditional_meaning_sentence_gaf) {
        final SubLObject cur_val = dictionary.dictionary_lookup_without_values($sks_multiply_indexed_conditional_meaning_sentence_cache$.getGlobalValue(), sks, UNPROVIDED);
        if (NIL != set.set_p(cur_val)) {
            return set.set_memberP(conditional_meaning_sentence_gaf, cur_val);
        }
        return NIL;
    }

    public static SubLObject un_note_all_multiply_indexed_conditional_meaning_sentences() {
        return dictionary.clear_dictionary($sks_multiply_indexed_conditional_meaning_sentence_cache$.getGlobalValue());
    }

    public static SubLObject note_sksi_module_multiply_indexed_conditional_meaning_sentence(final SubLObject hl_module, final SubLObject cms_gaf) {
        final SubLObject sks = inference_modules.hl_module_source(hl_module);
        note_multiply_indexed_conditional_meaning_sentence_for_sks(sks, cms_gaf);
        return dictionary.dictionary_enter($sksi_module_multiply_indexed_conditional_meaning_sentence_cache$.getGlobalValue(), hl_module, cms_gaf);
    }

    public static SubLObject un_note_sksi_module_multiply_indexed_conditional_meaning_sentence(final SubLObject hl_module) {
        final SubLObject cms_gaf = dictionary.dictionary_lookup_without_values($sksi_module_multiply_indexed_conditional_meaning_sentence_cache$.getGlobalValue(), hl_module, UNPROVIDED);
        if (NIL != cms_gaf) {
            final SubLObject sks = inference_modules.hl_module_source(hl_module);
            un_note_multiply_indexed_conditional_meaning_sentence_for_sks(sks, cms_gaf);
            return dictionary.dictionary_remove($sksi_module_multiply_indexed_conditional_meaning_sentence_cache$.getGlobalValue(), hl_module);
        }
        return NIL;
    }

    public static SubLObject un_note_all_sksi_module_multiply_indexed_conditional_meaning_sentences() {
        un_note_all_multiply_indexed_conditional_meaning_sentences();
        return dictionary.clear_dictionary($sksi_module_multiply_indexed_conditional_meaning_sentence_cache$.getGlobalValue());
    }

    public static SubLObject note_sksi_module_by_sks(final SubLObject sks, final SubLObject hl_module) {
        return dictionary_utilities.dictionary_pushnew($sksi_modules_by_sks$.getGlobalValue(), sks, hl_module, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject un_note_sksi_modules_by_sks(final SubLObject sks) {
        return dictionary.dictionary_remove($sksi_modules_by_sks$.getGlobalValue(), sks);
    }

    public static SubLObject clear_sksi_modules_by_sks_cache() {
        return dictionary.clear_dictionary($sksi_modules_by_sks$.getGlobalValue());
    }

    public static SubLObject un_note_sksi_modules_by_sks_for_module(final SubLObject hl_module) {
        SubLObject cdolist_list_var = dictionary.dictionary_keys($sksi_modules_by_sks$.getGlobalValue());
        SubLObject sks = NIL;
        sks = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            dictionary_utilities.dictionary_delete_from_value($sksi_modules_by_sks$.getGlobalValue(), sks, hl_module, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            sks = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject sksi_modules_by_sks_get_skses() {
        return dictionary.dictionary_keys($sksi_modules_by_sks$.getGlobalValue());
    }

    public static SubLObject sksi_modules_by_sks_find_modules(final SubLObject sks) {
        return dictionary.dictionary_lookup_without_values($sksi_modules_by_sks$.getGlobalValue(), sks, UNPROVIDED);
    }

    public static SubLObject sksi_modules_by_sks_find_modules_with_children(final SubLObject sks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_modules = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            SubLObject cdolist_list_var = sksi_kb_accessors.sk_source_sub_ks_closure(sks);
            SubLObject ks = NIL;
            ks = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject items_var = sksi_modules_by_sks_find_modules(ks);
                if (items_var.isVector()) {
                    final SubLObject vector_var = items_var;
                    final SubLObject backwardP_var = NIL;
                    SubLObject length;
                    SubLObject v_iteration;
                    SubLObject element_num;
                    SubLObject item;
                    for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                        element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                        item = aref(vector_var, element_num);
                        v_modules = cons(item, v_modules);
                    }
                } else {
                    SubLObject cdolist_list_var_$1 = items_var;
                    SubLObject item2 = NIL;
                    item2 = cdolist_list_var_$1.first();
                    while (NIL != cdolist_list_var_$1) {
                        v_modules = cons(item2, v_modules);
                        cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                        item2 = cdolist_list_var_$1.first();
                    } 
                }
                cdolist_list_var = cdolist_list_var.rest();
                ks = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_modules;
    }

    public static SubLObject do_code_mapping_sks_cache(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list14);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject sks = NIL;
        SubLObject ps = NIL;
        SubLObject ls = NIL;
        SubLObject mapping_mt = NIL;
        destructuring_bind_must_consp(current, datum, $list14);
        sks = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list14);
        ps = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list14);
        ls = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list14);
        mapping_mt = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            final SubLObject tuple = $sym15$TUPLE;
            final SubLObject tuples = $sym16$TUPLES;
            return list(DO_DICTIONARY, listS(sks, tuples, $list18), list(CDOLIST, list(tuple, tuples), listS(CDESTRUCTURING_BIND, list(ps, ls, mapping_mt), tuple, append(body, NIL))));
        }
        cdestructuring_bind_error(datum, $list14);
        return NIL;
    }

    public static SubLObject note_code_mapping_sks(final SubLObject sks, final SubLObject ps, final SubLObject ls, final SubLObject mapping_mt) {
        return dictionary_utilities.dictionary_push($sksi_code_mapping_sks_cache$.getGlobalValue(), sks, list(ps, ls, mapping_mt));
    }

    public static SubLObject unnote_code_mapping_sks(final SubLObject sks, final SubLObject ps, final SubLObject ls, final SubLObject mapping_mt) {
        return dictionary_utilities.dictionary_remove_from_value($sksi_code_mapping_sks_cache$.getGlobalValue(), sks, list(ps, ls, mapping_mt), symbol_function(EQUAL), UNPROVIDED);
    }

    public static SubLObject clear_code_mapping_sks_cache() {
        return dictionary.clear_dictionary($sksi_code_mapping_sks_cache$.getGlobalValue());
    }

    public static SubLObject code_mapping_sks_cache_lookup(final SubLObject sks) {
        return dictionary.dictionary_lookup_without_values($sksi_code_mapping_sks_cache$.getGlobalValue(), sks, UNPROVIDED);
    }

    public static SubLObject code_mapping_forward_rules_to_repropagate_internal() {
        return kb_mapping.gather_predicate_rule_index($$codeMapping, $NEG, $$SKSIMt, $FORWARD);
    }

    public static SubLObject code_mapping_forward_rules_to_repropagate() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return code_mapping_forward_rules_to_repropagate_internal();
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, CODE_MAPPING_FORWARD_RULES_TO_REPROPAGATE, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), CODE_MAPPING_FORWARD_RULES_TO_REPROPAGATE, ZERO_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, CODE_MAPPING_FORWARD_RULES_TO_REPROPAGATE, caching_state);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(code_mapping_forward_rules_to_repropagate_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject sksi_assert_code_mapping_sks_content(final SubLObject sks, final SubLObject ps, final SubLObject ls, final SubLObject mapping_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sks_iterator = sksi_batch_translate.new_sksi_translate_iterator(sks, ps, ls, mapping_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != iteration.iterator_p(sks_iterator)) {
            SubLObject count = ZERO_INTEGER;
            SubLObject ignore_errors_tag = NIL;
            try {
                thread.throwStack.push($IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                    try {
                        final SubLObject _prev_bind_0_$2 = kb_control_vars.$forward_inference_enabledP$.currentBinding(thread);
                        try {
                            kb_control_vars.$forward_inference_enabledP$.bind(NIL, thread);
                            SubLObject mt = sksi_kb_accessors.sk_source_source_description_mt(sks);
                            if (NIL == mt) {
                                mt = mapping_mt;
                            }
                            SubLObject valid;
                            for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                                thread.resetMultipleValues();
                                final SubLObject sentence = iteration.iteration_next(sks_iterator);
                                valid = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if ((NIL != valid) && (NIL != cycl_utilities.atomic_sentence_with_pred_p(sentence, $$codeMapping))) {
                                    final SubLObject arg3 = cycl_utilities.atomic_sentence_arg3(sentence, UNPROVIDED);
                                    if (((NIL == sksi_kb_accessors.schema_object_fn_expression_p(arg3)) && (NIL == sksi_kb_accessors.source_schema_object_fn_expression_p(arg3))) && (NIL != cyc_kernel.cyc_assert_wff(sentence, mt, UNPROVIDED))) {
                                        count = add(count, ONE_INTEGER);
                                    }
                                }
                            }
                        } finally {
                            kb_control_vars.$forward_inference_enabledP$.rebind(_prev_bind_0_$2, thread);
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
            return count;
        }
        return NIL;
    }

    public static SubLObject sksi_unassert_code_mapping_sks_content(final SubLObject sks, final SubLObject ps, final SubLObject ls, final SubLObject mapping_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sks_iterator = sksi_batch_translate.new_sksi_translate_iterator(sks, ps, ls, mapping_mt, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        if (NIL != iteration.iterator_p(sks_iterator)) {
            SubLObject count = ZERO_INTEGER;
            SubLObject ignore_errors_tag = NIL;
            try {
                thread.throwStack.push($IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                    try {
                        final SubLObject _prev_bind_0_$3 = kb_control_vars.$forward_inference_enabledP$.currentBinding(thread);
                        try {
                            kb_control_vars.$forward_inference_enabledP$.bind(NIL, thread);
                            SubLObject mt = sksi_kb_accessors.sk_source_source_description_mt(sks);
                            if (NIL == mt) {
                                mt = mapping_mt;
                            }
                            SubLObject valid;
                            for (SubLObject done_var = NIL; NIL == done_var; done_var = makeBoolean(NIL == valid)) {
                                thread.resetMultipleValues();
                                final SubLObject sentence = iteration.iteration_next(sks_iterator);
                                valid = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if ((NIL != valid) && (NIL != cycl_utilities.atomic_sentence_with_pred_p(sentence, $$codeMapping))) {
                                    final SubLObject arg3 = cycl_utilities.atomic_sentence_arg3(sentence, UNPROVIDED);
                                    if (((NIL == sksi_kb_accessors.schema_object_fn_expression_p(arg3)) && (NIL == sksi_kb_accessors.source_schema_object_fn_expression_p(arg3))) && (NIL != cyc_kernel.cyc_unassert(sentence, mt))) {
                                        count = add(count, ONE_INTEGER);
                                    }
                                }
                            }
                        } finally {
                            kb_control_vars.$forward_inference_enabledP$.rebind(_prev_bind_0_$3, thread);
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
            return count;
        }
        return NIL;
    }

    public static SubLObject isa_removal_module_p(final SubLObject hl_module) {
        final SubLObject pred = inference_modules.hl_module_predicate(hl_module);
        final SubLObject mt = inference_modules.hl_module_required_mt(hl_module);
        if (NIL != sksi_infrastructure_utilities.sksi_supported_predicate_type_p(pred, mt)) {
            return genl_predicates.genl_predP(inference_modules.hl_module_predicate(hl_module), $$isa, UNPROVIDED, UNPROVIDED);
        }
        return NIL;
    }

    public static SubLObject add_isa_sks_term_to_cycl_term_mts(final SubLObject mt) {
        if (NIL == member(mt, $isa_sks_term_to_cycl_term_mts$.getGlobalValue(), HLMT_EQUAL, symbol_function(IDENTITY))) {
            $isa_sks_term_to_cycl_term_mts$.setGlobalValue(cons(mt, $isa_sks_term_to_cycl_term_mts$.getGlobalValue()));
        }
        return NIL;
    }

    public static SubLObject clear_isa_sks_term_to_cycl_term_mts() {
        $isa_sks_term_to_cycl_term_mts$.setGlobalValue(NIL);
        return NIL;
    }

    public static SubLObject isa_sks_term_to_cycl_term_mt_relevantP() {
        return mt_relevance_macros.any_relevant_mtP($isa_sks_term_to_cycl_term_mts$.getGlobalValue());
    }

    public static SubLObject add_isa_sks_term_to_cycl_term_store(final SubLObject v_term, final SubLObject mt) {
        if (NIL == dictionary.dictionary_p($isa_sks_term_to_cycl_term_store$.getGlobalValue())) {
            $isa_sks_term_to_cycl_term_store$.setGlobalValue(dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        }
        dictionary_utilities.dictionary_pushnew($isa_sks_term_to_cycl_term_store$.getGlobalValue(), v_term, mt, HLMT_EQUAL, UNPROVIDED);
        return NIL;
    }

    public static SubLObject clear_isa_sks_term_to_cycl_term_store() {
        if (NIL != dictionary.dictionary_p($isa_sks_term_to_cycl_term_store$.getGlobalValue())) {
            dictionary.clear_dictionary($isa_sks_term_to_cycl_term_store$.getGlobalValue());
        }
        return NIL;
    }

    public static SubLObject any_sks_term_spec_to_cycl_term_in_relevant_mtP(final SubLObject cycl_term) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject foundP;
        SubLObject iteration_state;
        for (foundP = NIL, iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents($isa_sks_term_to_cycl_term_store$.getGlobalValue())); (NIL == foundP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject sks_term = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject mts = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if ((NIL != list_utilities.not_eq(sks_term, cycl_term)) && (NIL != genls.genlP(sks_term, cycl_term, UNPROVIDED, UNPROVIDED))) {
                foundP = mt_relevance_macros.any_relevant_mtP(mts);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return foundP;
    }

    public static SubLObject all_sksi_relevant_rewrite_specs_for_term(final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return all_sksi_relevant_rewrite_specs_for_term_int(col, mt_relevance_macros.$mt$.getDynamicValue(thread));
    }

    public static SubLObject all_sksi_relevant_rewrite_specs_for_term_int_internal(final SubLObject col, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents($isa_sks_term_to_cycl_term_store$.getGlobalValue())); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject sks_term = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject mts = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (((NIL != list_utilities.not_eq(col, sks_term)) && (NIL != mt_relevance_macros.any_relevant_mtP(mts))) && (NIL != genls.genlP(sks_term, col, UNPROVIDED, UNPROVIDED))) {
                result = cons(sks_term, result);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return result;
    }

    public static SubLObject all_sksi_relevant_rewrite_specs_for_term_int(final SubLObject col, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return all_sksi_relevant_rewrite_specs_for_term_int_internal(col, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, ALL_SKSI_RELEVANT_REWRITE_SPECS_FOR_TERM_INT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), ALL_SKSI_RELEVANT_REWRITE_SPECS_FOR_TERM_INT, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, ALL_SKSI_RELEVANT_REWRITE_SPECS_FOR_TERM_INT, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(col, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (col.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(all_sksi_relevant_rewrite_specs_for_term_int_internal(col, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(col, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject all_sksi_relevant_rewrite_isas() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return all_sksi_relevant_rewrite_isas_int(mt_relevance_macros.$mt$.getDynamicValue(thread));
    }

    public static SubLObject all_sksi_relevant_rewrite_isas_int_internal(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents($isa_sks_term_to_cycl_term_store$.getGlobalValue())); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject sks_term = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject mts = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != mt_relevance_macros.any_relevant_mtP(mts)) {
                result = cons(sks_term, result);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return result;
    }

    public static SubLObject all_sksi_relevant_rewrite_isas_int(final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return all_sksi_relevant_rewrite_isas_int_internal(mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, ALL_SKSI_RELEVANT_REWRITE_ISAS_INT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), ALL_SKSI_RELEVANT_REWRITE_ISAS_INT, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, ALL_SKSI_RELEVANT_REWRITE_ISAS_INT, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, mt, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(all_sksi_relevant_rewrite_isas_int_internal(mt)));
            memoization_state.caching_state_put(caching_state, mt, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject add_isa_sks_term_to_cycl_term(final SubLObject v_term, final SubLObject mt) {
        add_isa_sks_term_to_cycl_term_mts(mt);
        add_isa_sks_term_to_cycl_term_store(v_term, mt);
        return NIL;
    }

    public static SubLObject clear_isa_sks_term_to_cycl_term() {
        clear_isa_sks_term_to_cycl_term_mts();
        clear_isa_sks_term_to_cycl_term_store();
        return NIL;
    }

    public static SubLObject store_sksi_isa_module_rewrite_info(final SubLObject hl_module, final SubLObject required_pattern, SubLObject code_mapping_schemas) {
        if (code_mapping_schemas == UNPROVIDED) {
            code_mapping_schemas = NIL;
        }
        final SubLObject required_mt = inference_modules.hl_module_required_mt(hl_module);
        final SubLObject required_arg2 = cycl_utilities.formula_arg2(required_pattern, UNPROVIDED);
        final SubLObject mt = inference_modules.hl_module_required_mt(hl_module);
        if (NIL != genls_rewrite_supported_term_p(required_arg2, mt)) {
            add_isa_sks_term_to_cycl_term(required_arg2, required_mt);
        } else {
            SubLObject cdolist_list_var;
            final SubLObject code_mapping_arg2s = cdolist_list_var = gather_code_mapping_arg2s(hl_module, code_mapping_schemas);
            SubLObject v_term = NIL;
            v_term = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != genls_rewrite_supported_term_p(v_term, mt)) {
                    add_isa_sks_term_to_cycl_term(v_term, required_mt);
                }
                cdolist_list_var = cdolist_list_var.rest();
                v_term = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static SubLObject genls_rewrite_supported_term_p(final SubLObject v_term, final SubLObject mt) {
        return makeBoolean((NIL != forts.fort_p(v_term)) && (NIL != fort_types_interface.isa_collectionP(v_term, mt)));
    }

    public static SubLObject gather_code_mapping_arg2s(final SubLObject hl_module, final SubLObject code_mapping_schemas) {
        final SubLObject code_mapping_terms = (NIL != code_mapping_schemas) ? gather_cycl_terms_mapped_to_by_code_mapping_schemas(code_mapping_schemas) : sksi_module_code_mapping_terms(hl_module);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = code_mapping_terms;
        SubLObject arg_pos_terms_pair = NIL;
        arg_pos_terms_pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = arg_pos_terms_pair;
            SubLObject arg_pos = NIL;
            SubLObject terms = NIL;
            destructuring_bind_must_consp(current, datum, $list33);
            arg_pos = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list33);
            terms = current.first();
            current = current.rest();
            if (NIL == current) {
                if (arg_pos.numE(TWO_INTEGER)) {
                    result = append(result, terms);
                }
            } else {
                cdestructuring_bind_error(datum, $list33);
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg_pos_terms_pair = cdolist_list_var.first();
        } 
        return list_utilities.fast_delete_duplicates(result, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject recalculate_sksi_isa_module_rewrite_info() {
        clear_isa_sks_term_to_cycl_term();
        final SubLObject set_contents_var = set.do_set_internal($sksi_modules$.getGlobalValue());
        SubLObject basis_object;
        SubLObject state;
        SubLObject hl_module;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            hl_module = set_contents.do_set_contents_next(basis_object, state);
            if ((NIL != set_contents.do_set_contents_element_validP(state, hl_module)) && (NIL != isa_removal_module_p(hl_module))) {
                store_sksi_isa_module_rewrite_info(hl_module, sksi_module_simple_required_pattern(hl_module), UNPROVIDED);
            }
        }
        return NIL;
    }

    public static SubLObject filtered_sksi_predP(final SubLObject pred) {
        return subl_promotions.memberP(pred, $filtered_sksi_preds$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject add_to_meaning_sentence_mts(final SubLObject mt) {
        if (NIL == member(mt, $meaning_sentence_mts$.getGlobalValue(), HLMT_EQUAL, symbol_function(IDENTITY))) {
            $meaning_sentence_mts$.setGlobalValue(cons(mt, $meaning_sentence_mts$.getGlobalValue()));
        }
        return NIL;
    }

    public static SubLObject clear_meaning_sentence_mts() {
        $meaning_sentence_mts$.setGlobalValue(NIL);
        return NIL;
    }

    public static SubLObject any_sksi_meaning_sentence_mt_relevantP() {
        return mt_relevance_macros.any_relevant_mtP($meaning_sentence_mts$.getGlobalValue());
    }

    public static SubLObject meaning_sentence_pred_store_count() {
        if (NIL != dictionary.dictionary_p($meaning_sentence_pred_store$.getGlobalValue())) {
            return dictionary.dictionary_length($meaning_sentence_pred_store$.getGlobalValue());
        }
        return ZERO_INTEGER;
    }

    public static SubLObject meaning_sentence_predP(final SubLObject pred) {
        final SubLObject mts = dictionary.dictionary_lookup($meaning_sentence_pred_store$.getGlobalValue(), pred, UNPROVIDED);
        return mt_relevance_macros.any_relevant_mtP(mts);
    }

    public static SubLObject add_meaning_sentence_pred_to_store(final SubLObject pred, final SubLObject mt) {
        if (NIL == dictionary.dictionary_p($meaning_sentence_pred_store$.getGlobalValue())) {
            $meaning_sentence_pred_store$.setGlobalValue(dictionary.new_dictionary(UNPROVIDED, UNPROVIDED));
        }
        dictionary_utilities.dictionary_pushnew($meaning_sentence_pred_store$.getGlobalValue(), pred, mt, HLMT_EQUAL, UNPROVIDED);
        return NIL;
    }

    public static SubLObject clear_meaning_sentence_pred_store() {
        if (NIL != dictionary.dictionary_p($meaning_sentence_pred_store$.getGlobalValue())) {
            dictionary.clear_dictionary($meaning_sentence_pred_store$.getGlobalValue());
        }
        return NIL;
    }

    public static SubLObject any_sksi_meaning_sentence_spec_predP(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject foundP;
        SubLObject iteration_state;
        for (foundP = NIL, iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents($meaning_sentence_pred_store$.getGlobalValue())); (NIL == foundP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject spec_pred = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject mts = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if ((NIL != list_utilities.not_eq(spec_pred, pred)) && (NIL != genl_predicates.genl_predP(spec_pred, pred, UNPROVIDED, UNPROVIDED))) {
                foundP = mt_relevance_macros.any_relevant_mtP(mts);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return foundP;
    }

    public static SubLObject any_sksi_meaning_sentence_spec_inverseP(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject foundP;
        SubLObject iteration_state;
        for (foundP = NIL, iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents($meaning_sentence_pred_store$.getGlobalValue())); (NIL == foundP) && (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject spec_inv = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject mts = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != genl_predicates.genl_inverseP(spec_inv, pred, UNPROVIDED, UNPROVIDED)) {
                foundP = mt_relevance_macros.any_relevant_mtP(mts);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return foundP;
    }

    public static SubLObject all_sksi_relevant_rewrite_spec_preds_for_pred(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return all_sksi_relevant_rewrite_spec_preds_for_pred_int(pred, mt_relevance_macros.$mt$.getDynamicValue(thread));
    }

    public static SubLObject all_sksi_relevant_rewrite_spec_preds_for_pred_int_internal(final SubLObject pred, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents($meaning_sentence_pred_store$.getGlobalValue())); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject spec_pred = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject mts = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (((NIL != list_utilities.not_eq(spec_pred, pred)) && (NIL != mt_relevance_macros.any_relevant_mtP(mts))) && ((NIL != cycl_grammar.hl_variable_p(pred)) || (NIL != genl_predicates.genl_predP(spec_pred, pred, UNPROVIDED, UNPROVIDED)))) {
                result = cons(spec_pred, result);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return result;
    }

    public static SubLObject all_sksi_relevant_rewrite_spec_preds_for_pred_int(final SubLObject pred, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return all_sksi_relevant_rewrite_spec_preds_for_pred_int_internal(pred, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, ALL_SKSI_RELEVANT_REWRITE_SPEC_PREDS_FOR_PRED_INT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), ALL_SKSI_RELEVANT_REWRITE_SPEC_PREDS_FOR_PRED_INT, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, ALL_SKSI_RELEVANT_REWRITE_SPEC_PREDS_FOR_PRED_INT, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(pred, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (pred.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(all_sksi_relevant_rewrite_spec_preds_for_pred_int_internal(pred, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(pred, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject all_sksi_relevant_rewrite_spec_inverses_for_pred(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return all_sksi_relevant_rewrite_spec_inverses_for_pred_int(pred, mt_relevance_macros.$mt$.getDynamicValue(thread));
    }

    public static SubLObject all_sksi_relevant_rewrite_spec_inverses_for_pred_int_internal(final SubLObject pred, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents($meaning_sentence_pred_store$.getGlobalValue())); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject spec_inv = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject mts = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if ((NIL != mt_relevance_macros.any_relevant_mtP(mts)) && (NIL != genl_predicates.genl_inverseP(spec_inv, pred, UNPROVIDED, UNPROVIDED))) {
                result = cons(spec_inv, result);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return result;
    }

    public static SubLObject all_sksi_relevant_rewrite_spec_inverses_for_pred_int(final SubLObject pred, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return all_sksi_relevant_rewrite_spec_inverses_for_pred_int_internal(pred, mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, ALL_SKSI_RELEVANT_REWRITE_SPEC_INVERSES_FOR_PRED_INT, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), ALL_SKSI_RELEVANT_REWRITE_SPEC_INVERSES_FOR_PRED_INT, TWO_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, ALL_SKSI_RELEVANT_REWRITE_SPEC_INVERSES_FOR_PRED_INT, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_2(pred, mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (pred.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (((NIL != cached_args) && (NIL == cached_args.rest())) && mt.equal(cached_args.first())) {
                        return memoization_state.caching_results(results2);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(all_sksi_relevant_rewrite_spec_inverses_for_pred_int_internal(pred, mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(pred, mt));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject add_meaning_sentence_pred(final SubLObject pred, final SubLObject mt) {
        if (NIL == filtered_sksi_predP(pred)) {
            add_to_meaning_sentence_mts(mt);
            add_meaning_sentence_pred_to_store(pred, mt);
        }
        return NIL;
    }

    public static SubLObject clear_meaning_sentence_preds() {
        clear_meaning_sentence_mts();
        clear_meaning_sentence_pred_store();
        return NIL;
    }

    public static SubLObject store_sksi_module_rewrite_pred_info(final SubLObject hl_module) {
        final SubLObject required_mt = inference_modules.hl_module_required_mt(hl_module);
        final SubLObject required_pred = inference_modules.hl_module_predicate(hl_module);
        if (NIL != sksi_infrastructure_utilities.sksi_supported_predicate_type_p(required_pred, required_mt)) {
            add_meaning_sentence_pred(required_pred, required_mt);
        } else {
            SubLObject cdolist_list_var;
            final SubLObject pred_list = cdolist_list_var = sksi_module_any_predicates_list(hl_module);
            SubLObject pred = NIL;
            pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != sksi_infrastructure_utilities.sksi_supported_predicate_type_p(pred, required_mt)) {
                    add_meaning_sentence_pred(pred, required_mt);
                }
                cdolist_list_var = cdolist_list_var.rest();
                pred = cdolist_list_var.first();
            } 
        }
        return NIL;
    }

    public static SubLObject recalculate_sksi_rewrite_pred_info() {
        clear_meaning_sentence_preds();
        final SubLObject set_contents_var = set.do_set_internal($sksi_modules$.getGlobalValue());
        SubLObject basis_object;
        SubLObject state;
        SubLObject hl_module;
        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
            hl_module = set_contents.do_set_contents_next(basis_object, state);
            if (NIL != set_contents.do_set_contents_element_validP(state, hl_module)) {
                store_sksi_module_rewrite_pred_info(hl_module);
            }
        }
        return NIL;
    }

    public static SubLObject store_sksi_module_rewrite_info(final SubLObject hl_module, final SubLObject required_pattern, final SubLObject code_mapping_schemas) {
        store_sksi_module_rewrite_pred_info(hl_module);
        if (NIL != isa_removal_module_p(hl_module)) {
            store_sksi_isa_module_rewrite_info(hl_module, required_pattern, code_mapping_schemas);
        }
        return NIL;
    }

    public static SubLObject recalculate_sksi_rewrite_info() {
        recalculate_sksi_isa_module_rewrite_info();
        recalculate_sksi_rewrite_pred_info();
        return NIL;
    }

    public static SubLObject clear_sksi_rewrite_info() {
        clear_isa_sks_term_to_cycl_term();
        clear_meaning_sentence_preds();
        return NIL;
    }

    public static SubLObject register_sksi_removal_modules_for_sks(final SubLObject sks, SubLObject mapping_mt, SubLObject reclassifyP, SubLObject add_to_allowed_ksesP) {
        if (mapping_mt == UNPROVIDED) {
            mapping_mt = NIL;
        }
        if (reclassifyP == UNPROVIDED) {
            reclassifyP = T;
        }
        if (add_to_allowed_ksesP == UNPROVIDED) {
            add_to_allowed_ksesP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        SubLObject pref_mod_count = ZERO_INTEGER;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                if (NIL == mapping_mt) {
                    mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sks);
                }
                final SubLObject mt_var = mapping_mt;
                final SubLObject _prev_bind_0_$4 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                    mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                    final SubLObject sub_ks_closure = sksi_kb_accessors.sk_source_sub_ks_closure(sks);
                    final SubLObject code_mapping_ks_list = list_utilities.remove_if_not($sym39$CODE_MAPPING_KNOWLEDGE_SOURCE_, sub_ks_closure, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    final SubLObject remaining_sub_ks_list = list_utilities.fast_set_difference(sub_ks_closure, code_mapping_ks_list, UNPROVIDED);
                    SubLObject code_mapping_assertedP = NIL;
                    SubLObject cdolist_list_var = code_mapping_ks_list;
                    SubLObject ks = NIL;
                    ks = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        thread.resetMultipleValues();
                        final SubLObject sub_count = register_sksi_removal_modules_for_just_sks(ks, mapping_mt, NIL, sks, NIL);
                        final SubLObject any_code_mappingsP = thread.secondMultipleValue();
                        final SubLObject sub_pref_mod_count = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        count = add(count, sub_count);
                        pref_mod_count = add(pref_mod_count, sub_pref_mod_count);
                        if (NIL == code_mapping_assertedP) {
                            code_mapping_assertedP = any_code_mappingsP;
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        ks = cdolist_list_var.first();
                    } 
                    cdolist_list_var = remaining_sub_ks_list;
                    ks = NIL;
                    ks = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        thread.resetMultipleValues();
                        final SubLObject sub_count = register_sksi_removal_modules_for_just_sks(ks, mapping_mt, NIL, sks, NIL);
                        final SubLObject any_code_mappingsP = thread.secondMultipleValue();
                        final SubLObject sub_pref_mod_count = thread.thirdMultipleValue();
                        thread.resetMultipleValues();
                        count = add(count, sub_count);
                        pref_mod_count = add(pref_mod_count, sub_pref_mod_count);
                        cdolist_list_var = cdolist_list_var.rest();
                        ks = cdolist_list_var.first();
                    } 
                    if (NIL != code_mapping_assertedP) {
                        repropagate_code_mapping_forward_rules();
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$4, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        if (NIL != reclassifyP) {
            inference_modules.reclassify_removal_modules();
        }
        if (NIL != add_to_allowed_ksesP) {
            sksi_infrastructure_utilities.add_to_external_sources_activated_in_image(sks, UNPROVIDED);
        }
        return values(count, pref_mod_count);
    }

    public static SubLObject register_sksi_removal_modules_for_just_sks(final SubLObject sks, SubLObject mapping_mt, SubLObject reclassifyP, SubLObject top_ks, SubLObject add_to_allowed_ksesP) {
        if (mapping_mt == UNPROVIDED) {
            mapping_mt = NIL;
        }
        if (reclassifyP == UNPROVIDED) {
            reclassifyP = T;
        }
        if (top_ks == UNPROVIDED) {
            top_ks = sks;
        }
        if (add_to_allowed_ksesP == UNPROVIDED) {
            add_to_allowed_ksesP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        SubLObject pref_mod_count = NIL;
        SubLObject code_mapping_assertedP = NIL;
        final SubLObject _prev_bind_0 = $sks_preference_modules_count$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $sks_prune_modules_count$.currentBinding(thread);
        try {
            $sks_preference_modules_count$.bind(ZERO_INTEGER, thread);
            $sks_prune_modules_count$.bind(ZERO_INTEGER, thread);
            final SubLObject local_state;
            final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
            final SubLObject _prev_bind_0_$6 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    deregister_sksi_removal_modules_for_just_sks(sks, NIL, UNPROVIDED);
                    if (NIL == mapping_mt) {
                        mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sks);
                    }
                    sksi_access_path.external_source_access_path(sks, NIL, mapping_mt);
                    final SubLObject mt_var = mapping_mt;
                    final SubLObject _prev_bind_0_$7 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$8 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
                        final SubLObject gaf = sksi_kb_accessors.sk_source_content_mt_gaf(sks);
                        if (NIL != gaf) {
                            final SubLObject content_mt = assertions_high.gaf_arg2(gaf);
                            SubLObject hl_module_infos = NIL;
                            thread.resetMultipleValues();
                            final SubLObject hl_module_infos_$9 = sk_source_module_infos(sks, content_mt, list(gaf), top_ks, mapping_mt);
                            final SubLObject code_mapping_assertedP_$10 = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            hl_module_infos = hl_module_infos_$9;
                            code_mapping_assertedP = code_mapping_assertedP_$10;
                            SubLObject cdolist_list_var = hl_module_infos;
                            SubLObject hl_module_info = NIL;
                            hl_module_info = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                SubLObject current;
                                final SubLObject datum = current = hl_module_info;
                                SubLObject hl_module_info_plist = NIL;
                                SubLObject hl_module_relevant_code_mapping_schemas = NIL;
                                SubLObject hl_module_relevant_instance_named_fn_colls = NIL;
                                destructuring_bind_must_consp(current, datum, $list40);
                                hl_module_info_plist = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list40);
                                hl_module_relevant_code_mapping_schemas = current.first();
                                current = current.rest();
                                destructuring_bind_must_consp(current, datum, $list40);
                                hl_module_relevant_instance_named_fn_colls = current.first();
                                current = current.rest();
                                if (NIL == current) {
                                    final SubLObject hl_module = inference_removal_module_info(hl_module_info_plist);
                                    final SubLObject supports = module_info_get(hl_module_info_plist, $MODULE_SUPPORTS, UNPROVIDED);
                                    final SubLObject simple_required_pattern = replace_pattern_special_subpatterns_with_forts(module_info_get(hl_module_info_plist, $SIMPLE_REQUIRED_PATTERN, UNPROVIDED));
                                    final SubLObject meaning_sentence = module_info_get(hl_module_info_plist, $MEANING_SENTENCE, UNPROVIDED);
                                    final SubLObject multiply_indexed_cms = module_info_get(hl_module_info_plist, $MULTIPLY_INDEXED_CMS, UNPROVIDED);
                                    note_sksi_module(hl_module);
                                    note_sksi_module_supports(hl_module, supports);
                                    note_sksi_module_simple_required_pattern(hl_module, simple_required_pattern);
                                    if (NIL != multiply_indexed_cms) {
                                        note_sksi_module_multiply_indexed_conditional_meaning_sentence(hl_module, multiply_indexed_cms);
                                    }
                                    note_sksi_module_by_sks(sks, hl_module);
                                    store_sksi_module_rewrite_info(hl_module, simple_required_pattern, hl_module_relevant_code_mapping_schemas);
                                    if (NIL != $sksi_browsing_enabled$.getDynamicValue(thread)) {
                                        register_sksi_supported_browsing_for_module(hl_module, meaning_sentence, simple_required_pattern, hl_module_relevant_code_mapping_schemas, hl_module_relevant_instance_named_fn_colls, content_mt);
                                    }
                                } else {
                                    cdestructuring_bind_error(datum, $list40);
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                hl_module_info = cdolist_list_var.first();
                            } 
                            count = length(hl_module_infos);
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1_$8, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$7, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$8 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$8, thread);
                    }
                }
            } finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$6, thread);
            }
            pref_mod_count = $sks_preference_modules_count$.getDynamicValue(thread);
            count = add(count, $sks_prune_modules_count$.getDynamicValue(thread));
        } finally {
            $sks_prune_modules_count$.rebind(_prev_bind_2, thread);
            $sks_preference_modules_count$.rebind(_prev_bind_0, thread);
        }
        if (NIL != reclassifyP) {
            inference_modules.reclassify_removal_modules();
            if (NIL != code_mapping_assertedP) {
                repropagate_code_mapping_forward_rules();
            }
        }
        if (NIL != add_to_allowed_ksesP) {
            sksi_infrastructure_utilities.add_to_external_sources_activated_in_image(sks, NIL);
        }
        return values(count, code_mapping_assertedP, pref_mod_count);
    }

    public static SubLObject repropagate_code_mapping_forward_rules() {
        return NIL;
    }

    public static SubLObject deregister_sksi_removal_modules_for_sks(final SubLObject sks, SubLObject mapping_mt, SubLObject reclassifyP, SubLObject remove_from_allowed_ksesP) {
        if (mapping_mt == UNPROVIDED) {
            mapping_mt = NIL;
        }
        if (reclassifyP == UNPROVIDED) {
            reclassifyP = T;
        }
        if (remove_from_allowed_ksesP == UNPROVIDED) {
            remove_from_allowed_ksesP = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject rm_count = ZERO_INTEGER;
        SubLObject pm_count = ZERO_INTEGER;
        if (NIL == mapping_mt) {
            mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sks);
        }
        final SubLObject mt_var = mapping_mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(mt_var), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(mt_var), thread);
            SubLObject cdolist_list_var;
            final SubLObject sub_ks_closure = cdolist_list_var = sksi_kb_accessors.sk_source_sub_ks_closure(sks);
            SubLObject ks = NIL;
            ks = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                thread.resetMultipleValues();
                final SubLObject ks_rm_count = deregister_sksi_removal_modules_for_just_sks(ks, NIL, UNPROVIDED);
                final SubLObject ks_pm_count = thread.secondMultipleValue();
                thread.resetMultipleValues();
                rm_count = add(rm_count, ks_rm_count);
                pm_count = add(pm_count, ks_pm_count);
                cdolist_list_var = cdolist_list_var.rest();
                ks = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        if (NIL != reclassifyP) {
            inference_modules.reclassify_removal_modules();
            recalculate_sksi_rewrite_info();
        }
        if (NIL != remove_from_allowed_ksesP) {
            sksi_infrastructure_utilities.remove_from_external_sources_activated_in_image(sks, UNPROVIDED);
        }
        return values(rm_count, pm_count);
    }

    public static SubLObject deregister_sksi_removal_modules_for_just_sks(final SubLObject sks, SubLObject reclassifyP, SubLObject remove_from_allowed_ksesP) {
        if (reclassifyP == UNPROVIDED) {
            reclassifyP = T;
        }
        if (remove_from_allowed_ksesP == UNPROVIDED) {
            remove_from_allowed_ksesP = NIL;
        }
        final SubLObject hl_modules = sksi_modules_by_sks_find_modules(sks);
        SubLObject rm_count = ZERO_INTEGER;
        SubLObject pm_count = ZERO_INTEGER;
        SubLObject cdolist_list_var = hl_modules;
        SubLObject hl_module = NIL;
        hl_module = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            rm_count = add(rm_count, deregister_sksi_removal_module(hl_module, NIL));
            cdolist_list_var = cdolist_list_var.rest();
            hl_module = cdolist_list_var.first();
        } 
        un_note_sksi_modules_by_sks(sks);
        if (NIL != reclassifyP) {
            inference_modules.reclassify_removal_modules();
            recalculate_sksi_rewrite_info();
        }
        pm_count = sksi_preference_module_generation.deregister_sksi_preference_modules_for_sks(sks);
        SubLObject cdolist_list_var2;
        final SubLObject code_mapping_tuples = cdolist_list_var2 = code_mapping_sks_cache_lookup(sks);
        SubLObject code_mapping_tuple = NIL;
        code_mapping_tuple = cdolist_list_var2.first();
        while (NIL != cdolist_list_var2) {
            SubLObject current;
            final SubLObject datum = current = code_mapping_tuple;
            SubLObject ps = NIL;
            SubLObject ls = NIL;
            SubLObject mapping_mt = NIL;
            destructuring_bind_must_consp(current, datum, $list45);
            ps = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list45);
            ls = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list45);
            mapping_mt = current.first();
            current = current.rest();
            if (NIL == current) {
                sksi_unassert_code_mapping_sks_content(sks, ps, ls, mapping_mt);
                unnote_code_mapping_sks(sks, ps, ls, mapping_mt);
            } else {
                cdestructuring_bind_error(datum, $list45);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            code_mapping_tuple = cdolist_list_var2.first();
        } 
        if (NIL != remove_from_allowed_ksesP) {
            sksi_infrastructure_utilities.remove_from_external_sources_activated_in_image(sks, UNPROVIDED);
        }
        return values(rm_count, pm_count);
    }

    public static SubLObject deregister_sksi_removal_module(final SubLObject hl_module, SubLObject reclassifyP) {
        if (reclassifyP == UNPROVIDED) {
            reclassifyP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = ZERO_INTEGER;
        if (NIL != sksi_module_p(hl_module)) {
            final SubLObject name = inference_modules.hl_module_name(hl_module);
            inference_modules.undeclare_inference_removal_module(name, NIL);
            un_note_sksi_module(hl_module);
            un_note_sksi_module_supports(hl_module);
            if (NIL != $sksi_browsing_enabled$.getDynamicValue(thread)) {
                deregister_sksi_supported_browsing_for_module(hl_module);
            }
            if (NIL != reclassifyP) {
                inference_modules.reclassify_removal_modules();
                recalculate_sksi_rewrite_info();
                un_note_sksi_modules_by_sks_for_module(hl_module);
            }
            un_note_sksi_module_simple_required_pattern(hl_module);
            un_note_sksi_module_multiply_indexed_conditional_meaning_sentence(hl_module);
            count = ONE_INTEGER;
        }
        return count;
    }

    public static SubLObject deregister_all_sksi_removal_modules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject rm_count = ZERO_INTEGER;
        SubLObject pm_count = ZERO_INTEGER;
        clear_virtual_assertion_count();
        clear_sksi_rewrite_info();
        deregister_sksi_supported_browsing();
        SubLObject cdolist_list_var = set.set_element_list($sksi_modules$.getGlobalValue());
        SubLObject hl_module = NIL;
        hl_module = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject name = inference_modules.hl_module_name(hl_module);
            inference_modules.undeclare_inference_removal_module(name, NIL);
            rm_count = add(rm_count, ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            hl_module = cdolist_list_var.first();
        } 
        inference_modules.reclassify_removal_modules();
        pm_count = sksi_preference_module_generation.deregister_all_sksi_preference_modules();
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents($sksi_code_mapping_sks_cache$.getGlobalValue())); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject sks = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject tuples = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject cdolist_list_var2 = tuples;
            SubLObject tuple = NIL;
            tuple = cdolist_list_var2.first();
            while (NIL != cdolist_list_var2) {
                SubLObject current;
                final SubLObject datum = current = tuple;
                SubLObject ps = NIL;
                SubLObject ls = NIL;
                SubLObject mapping_mt = NIL;
                destructuring_bind_must_consp(current, datum, $list45);
                ps = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list45);
                ls = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list45);
                mapping_mt = current.first();
                current = current.rest();
                if (NIL == current) {
                    sksi_unassert_code_mapping_sks_content(sks, ps, ls, mapping_mt);
                } else {
                    cdestructuring_bind_error(datum, $list45);
                }
                cdolist_list_var2 = cdolist_list_var2.rest();
                tuple = cdolist_list_var2.first();
            } 
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        clear_code_mapping_sks_cache();
        un_note_all_sksi_modules();
        un_note_all_sksi_module_supports();
        un_note_all_sksi_module_simple_required_patterns();
        un_note_all_sksi_module_multiply_indexed_conditional_meaning_sentences();
        clear_sksi_modules_by_sks_cache();
        return values(rm_count, pm_count);
    }

    public static SubLObject module_info_p(final SubLObject v_object) {
        return list_utilities.property_list_p(v_object);
    }

    public static SubLObject new_module_info() {
        return NIL;
    }

    public static SubLObject module_info_add(final SubLObject module_info, final SubLObject property, final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subl_promotions.memberP(property, inference_modules.removal_module_plist_indicators(), UNPROVIDED, UNPROVIDED))) && (NIL == member(property, $sksi_specific_module_properties$.getGlobalValue(), UNPROVIDED, UNPROVIDED))) {
            Errors.error($str47$_S_was_not_a_valid_module_paramet, property);
        }
        return putf(module_info, property, value);
    }

    public static SubLObject module_info_push(final SubLObject module_info, final SubLObject property, final SubLObject elem) {
        SubLObject list = module_info_get(module_info, property, UNPROVIDED);
        list = cons(elem, list);
        return module_info_add(module_info, property, list);
    }

    public static SubLObject module_info_get(final SubLObject module_info, final SubLObject property, SubLObject v_default) {
        if (v_default == UNPROVIDED) {
            v_default = NIL;
        }
        return getf(module_info, property, v_default);
    }

    public static SubLObject module_info_remove(final SubLObject module_info, final SubLObject property) {
        return remf(module_info, property);
    }

    public static SubLObject module_info_to_inference_module_info(final SubLObject module_info) {
        SubLObject inference_module_info = copy_list(module_info);
        SubLObject cdolist_list_var = $sksi_specific_module_properties$.getGlobalValue();
        SubLObject property = NIL;
        property = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            inference_module_info = module_info_remove(inference_module_info, property);
            cdolist_list_var = cdolist_list_var.rest();
            property = cdolist_list_var.first();
        } 
        return inference_module_info;
    }

    public static SubLObject inference_removal_module_info(final SubLObject module_info) {
        final SubLObject module_name = module_info_get(module_info, $MODULE_NAME, UNPROVIDED);
        final SubLObject inf_module_info = module_info_to_inference_module_info(module_info);
        final SubLObject hl_module = inference_modules.inference_removal_module(module_name, inf_module_info);
        SubLObject cdolist_list_var;
        final SubLObject pred_list = cdolist_list_var = inference_modules.hl_module_any_predicates(hl_module);
        SubLObject pred = NIL;
        pred = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != forts.fort_p(pred)) && (NIL != inference_modules.solely_specific_removal_module_predicateP(pred))) {
                inference_modules.inference_removal_module_use_generic(pred, module_name);
            }
            cdolist_list_var = cdolist_list_var.rest();
            pred = cdolist_list_var.first();
        } 
        return hl_module;
    }

    public static SubLObject determine_module_info_name(final SubLObject module_info) {
        SubLObject documentation = module_info_get(module_info, $DOCUMENTATION, UNPROVIDED);
        final SubLObject sense = module_info_get(module_info, $SENSE, UNPROVIDED);
        documentation = Strings.string_downcase(documentation, UNPROVIDED, UNPROVIDED);
        documentation = cconcatenate($str51$sksi_, documentation);
        return removal_module_utilities.determine_hl_module_name(documentation, sense);
    }

    public static SubLObject sk_source_module_infos(final SubLObject sk_source, final SubLObject content_mt, final SubLObject module_supports, final SubLObject top_ks, final SubLObject mapping_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject physical_schema_gafs = sksi_kb_accessors.sk_source_physical_schema_gafs(sk_source);
        SubLObject result = NIL;
        SubLObject code_mapping_assertedP = NIL;
        SubLObject cdolist_list_var = physical_schema_gafs;
        SubLObject gaf = NIL;
        gaf = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject ps = assertions_high.gaf_arg1(gaf);
            thread.resetMultipleValues();
            final SubLObject module_infos = physical_schema_module_infos(ps, sk_source, content_mt, cons(gaf, module_supports), top_ks, mapping_mt);
            final SubLObject any_code_mappingP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            result = nconc(result, module_infos);
            if (NIL == code_mapping_assertedP) {
                code_mapping_assertedP = any_code_mappingP;
            }
            cdolist_list_var = cdolist_list_var.rest();
            gaf = cdolist_list_var.first();
        } 
        return values(result, code_mapping_assertedP);
    }

    public static SubLObject physical_schema_module_infos(final SubLObject physical_schema, final SubLObject sk_source, final SubLObject content_mt, final SubLObject module_supports, final SubLObject top_ks, final SubLObject mapping_mt) {
        final SubLObject logical_schema_gafs = sksi_kb_accessors.physical_schema_logical_schema_gafs(physical_schema);
        SubLObject result = NIL;
        SubLObject code_mapping_assertedP = NIL;
        SubLObject cdolist_list_var = logical_schema_gafs;
        SubLObject gaf = NIL;
        gaf = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject ls = assertions_high.gaf_arg1(gaf);
            final SubLObject module_infos = logical_schema_module_infos(ls, physical_schema, sk_source, content_mt, cons(gaf, module_supports), top_ks);
            result = nconc(result, module_infos);
            if ((NIL != sksi_kb_accessors.isa_reified_mappingP(ls)) && (NIL != sksi_kb_accessors.code_mapping_knowledge_sourceP(sk_source))) {
                final SubLObject count = sksi_assert_code_mapping_sks_content(sk_source, physical_schema, ls, mapping_mt);
                if (NIL != subl_promotions.positive_integer_p(count)) {
                    note_code_mapping_sks(sk_source, physical_schema, ls, mapping_mt);
                    code_mapping_assertedP = T;
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            gaf = cdolist_list_var.first();
        } 
        return values(result, code_mapping_assertedP);
    }

    public static SubLObject logical_schema_module_infos(final SubLObject logical_schema, final SubLObject physical_schema, final SubLObject sk_source, final SubLObject content_mt, final SubLObject module_supports, final SubLObject top_ks) {
        final SubLObject meaning_sentence_gafs = sksi_meaning_sentence_utilities.logical_schema_meaning_sentence_gafs(logical_schema, UNPROVIDED);
        final SubLObject conditional_meaning_sentence_gafs = sksi_meaning_sentence_utilities.logical_schema_consequent_conditional_meaning_sentence_gafs(logical_schema, T, NIL, NIL);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = meaning_sentence_gafs;
        SubLObject gaf = NIL;
        gaf = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject module_infos = meaning_sentence_gaf_module_infos(gaf, logical_schema, physical_schema, sk_source, content_mt, cons(gaf, module_supports));
            result = nconc(result, module_infos);
            cdolist_list_var = cdolist_list_var.rest();
            gaf = cdolist_list_var.first();
        } 
        cdolist_list_var = conditional_meaning_sentence_gafs;
        gaf = NIL;
        gaf = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject module_infos = conditional_meaning_sentence_gaf_module_infos(gaf, logical_schema, physical_schema, sk_source, content_mt, cons(gaf, module_supports), top_ks);
            result = nconc(result, module_infos);
            cdolist_list_var = cdolist_list_var.rest();
            gaf = cdolist_list_var.first();
        } 
        return result;
    }

    public static SubLObject meaning_sentence_gaf_module_infos(final SubLObject meaning_sentence_gaf, final SubLObject logical_schema, final SubLObject physical_schema, final SubLObject sk_source, final SubLObject content_mt, final SubLObject module_supports) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject module_infos = NIL;
        SubLObject error_message = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    final SubLObject sentence = sksi_meaning_sentence_utilities.get_meaning_sentence_from_gaf(meaning_sentence_gaf, UNPROVIDED);
                    if (NIL == sksi_meaning_sentence_utilities.sksi_valid_meaning_sentence_pred_p(cycl_utilities.formula_operator(sentence), content_mt)) {
                        Errors.error($str53$Invalid_predicate_for_meaning_sen, meaning_sentence_gaf);
                    }
                    final SubLObject rev_sentence = sksi_meaning_sentence_utilities.sksi_reconstruct_meaning_sentence(sentence);
                    if (NIL != atomic_sentenceP(rev_sentence)) {
                        module_infos = pos_atomic_meaning_sentence_module_infos(rev_sentence, list(logical_schema), list(physical_schema), sk_source, content_mt, module_supports, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                    } else
                        if ((NIL != el_negation_p(rev_sentence)) && (NIL != atomic_sentenceP(cycl_utilities.sentence_arg1(rev_sentence, UNPROVIDED)))) {
                            final SubLObject subsentence = cycl_utilities.sentence_arg1(rev_sentence, UNPROVIDED);
                            module_infos = negated_atomic_meaning_sentence_module_infos(subsentence, list(logical_schema), list(physical_schema), sk_source, content_mt, module_supports);
                        } else {
                            Errors.error($str54$complex_non_atomic_meaning_senten);
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
            sksi_meaning_sentence_gaf_infos_error(meaning_sentence_gaf, error_message);
            module_infos = NIL;
        }
        return module_infos;
    }

    public static SubLObject negated_atomic_meaning_sentence_module_infos(final SubLObject pos_sentence, final SubLObject logical_schemata, final SubLObject physical_schemata, final SubLObject sk_source, final SubLObject content_mt, final SubLObject module_supports) {
        return NIL;
    }

    public static SubLObject pos_atomic_meaning_sentence_module_infos(final SubLObject sentence, final SubLObject logical_schemata, final SubLObject physical_schemata, final SubLObject sk_source, final SubLObject content_mt, final SubLObject module_supports, SubLObject antecedent_sentence, SubLObject where_expression, SubLObject from_expression, SubLObject eval_conditions) {
        if (antecedent_sentence == UNPROVIDED) {
            antecedent_sentence = NIL;
        }
        if (where_expression == UNPROVIDED) {
            where_expression = NIL;
        }
        if (from_expression == UNPROVIDED) {
            from_expression = NIL;
        }
        if (eval_conditions == UNPROVIDED) {
            eval_conditions = NIL;
        }
        SubLObject module_infos = NIL;
        final SubLObject any_logical_field_indexicals_appearingP = cycl_utilities.expression_find_if(LOGICAL_FIELD_INDEXICAL_P, sentence, T, UNPROVIDED);
        if (NIL == any_logical_field_indexicals_appearingP) {
            Errors.error($str56$No_logical_field_indexicals_for_m, sentence, logical_schemata);
        }
        SubLObject cdolist_list_var;
        final SubLObject required_module_infos = cdolist_list_var = pos_atomic_meaning_sentence_required_pattern_infos(sentence, logical_schemata, physical_schemata, sk_source, content_mt, module_supports, antecedent_sentence);
        SubLObject required_info = NIL;
        required_info = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject module_info = required_info_module_info(required_info, sentence, logical_schemata, physical_schemata, sk_source, content_mt, where_expression, from_expression, eval_conditions);
            if (NIL != module_info) {
                module_infos = cons(module_info, module_infos);
            }
            cdolist_list_var = cdolist_list_var.rest();
            required_info = cdolist_list_var.first();
        } 
        return nreverse(module_infos);
    }

    public static SubLObject conditional_meaning_sentence_gaf_module_infos(final SubLObject conditional_meaning_sentence_gaf, final SubLObject logical_schema, final SubLObject physical_schema, final SubLObject sk_source, final SubLObject content_mt, final SubLObject module_supports, final SubLObject top_ks) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject module_infos = NIL;
        SubLObject error_message = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    if (NIL == sksi_meaning_sentence_utilities.supported_conditional_meaning_sentence_gaf_p(conditional_meaning_sentence_gaf, top_ks)) {
                        Errors.error($str57$The_following_conditional_meaning, conditional_meaning_sentence_gaf);
                    }
                    final SubLObject antecedent_logical_schema_set = sksi_meaning_sentence_utilities.get_antecedent_logical_schemata_from_conditional_meaning_sentence_gaf(conditional_meaning_sentence_gaf);
                    final SubLObject antecedent_meaning_sentence = sksi_meaning_sentence_utilities.get_antecedent_meaning_sentence_from_gaf(conditional_meaning_sentence_gaf);
                    final SubLObject consequent_logical_schema_set = sksi_meaning_sentence_utilities.get_consequent_logical_schemata_from_conditional_meaning_sentence_gaf(conditional_meaning_sentence_gaf);
                    final SubLObject consequent_meaning_sentence = sksi_meaning_sentence_utilities.get_consequent_meaning_sentence_from_gaf(conditional_meaning_sentence_gaf, UNPROVIDED);
                    final SubLObject new_sk_source = sksi_kb_accessors.nearest_common_super_ks_for_ls_list(union(consequent_logical_schema_set, antecedent_logical_schema_set, UNPROVIDED, UNPROVIDED));
                    if ((NIL != sksi_kb_accessors.sk_source_super_ksP(new_sk_source, top_ks)) && ((NIL != list_utilities.singletonP(consequent_logical_schema_set)) || (NIL == multiply_indexed_conditional_meaning_sentence_noted_for_sksP(new_sk_source, conditional_meaning_sentence_gaf)))) {
                        if (NIL == sksi_meaning_sentence_utilities.sksi_valid_meaning_sentence_pred_p(cycl_utilities.formula_operator(consequent_meaning_sentence), content_mt)) {
                            Errors.error($str58$Invalid_consequent_predicate_for_, conditional_meaning_sentence_gaf);
                        }
                        final SubLObject reconstructed_cms = sksi_meaning_sentence_utilities.sksi_reconstruct_meaning_sentence(consequent_meaning_sentence);
                        final SubLObject reconstructed_ams = sksi_meaning_sentence_utilities.sksi_reconstruct_meaning_sentence(antecedent_meaning_sentence);
                        final SubLObject antecedent_physical_schemata = sksi_kb_accessors.logical_schemata_physical_schemata(antecedent_logical_schema_set);
                        final SubLObject consequent_physical_schemata = sksi_kb_accessors.logical_schemata_physical_schemata(consequent_logical_schema_set);
                        final SubLObject all_physical_schemata = union(consequent_physical_schemata, antecedent_physical_schemata, UNPROVIDED, UNPROVIDED);
                        final SubLObject new_content_mt = sksi_kb_accessors.sk_source_content_mt(new_sk_source);
                        if (NIL != atomic_sentenceP(reconstructed_cms)) {
                            thread.resetMultipleValues();
                            final SubLObject where_expression = sksi_query_utilities.get_where_expression_from_antecedent_meaning_sentence(conditional_meaning_sentence_gaf, new_content_mt, new_sk_source, all_physical_schemata, UNPROVIDED, UNPROVIDED);
                            final SubLObject eval_conditions = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            final SubLObject from_expression = sksi_query_utilities.get_from_expression_from_antecedent_meaning_sentence(conditional_meaning_sentence_gaf, new_content_mt, new_sk_source, all_physical_schemata, UNPROVIDED);
                            final SubLObject cms_module_infos = pos_atomic_meaning_sentence_module_infos(reconstructed_cms, consequent_logical_schema_set, list_utilities.delete_if_not(PHYSICAL_SCHEMA_SK_SOURCES_MEMOIZED, Mapping.mapcan(LOGICAL_SCHEMA_PHYSICAL_SCHEMATA, consequent_logical_schema_set, EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), new_sk_source, content_mt, module_supports, reconstructed_ams, where_expression, from_expression, eval_conditions);
                            SubLObject new_module_infos = NIL;
                            SubLObject cdolist_list_var = cms_module_infos;
                            SubLObject module_info = NIL;
                            module_info = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                SubLObject module_plist = module_info.first();
                                final SubLObject module_rest = module_info.rest();
                                final SubLObject output_generate_pattern = module_info_get(module_plist, $OUTPUT_GENERATE_PATTERN, NIL);
                                final SubLObject output_check_pattern = (NIL != output_generate_pattern) ? NIL : module_info_get(module_plist, $OUTPUT_CHECK_PATTERN, NIL);
                                module_plist = module_info_add(module_plist, $REQUIRED_MT, new_content_mt);
                                module_plist = module_info_add(module_plist, $SUPPORT_MT, new_content_mt);
                                if (NIL == list_utilities.singletonP(consequent_logical_schema_set)) {
                                    module_plist = module_info_add(module_plist, $MULTIPLY_INDEXED_CMS, conditional_meaning_sentence_gaf);
                                }
                                if (NIL != output_generate_pattern) {
                                    final SubLObject new_output_generate_pattern = condition_output_pattern(output_generate_pattern, from_expression, where_expression, eval_conditions, sk_source, content_mt, new_sk_source, new_content_mt);
                                    module_plist = module_info_add(module_plist, $OUTPUT_GENERATE_PATTERN, new_output_generate_pattern);
                                } else
                                    if (NIL != output_check_pattern) {
                                        final SubLObject new_output_check_pattern = condition_output_pattern(output_check_pattern, from_expression, where_expression, eval_conditions, sk_source, content_mt, new_sk_source, new_content_mt);
                                        module_plist = module_info_add(module_plist, $OUTPUT_CHECK_PATTERN, new_output_check_pattern);
                                    } else {
                                        Errors.error($str65$No__output_generate_pattern_or__o);
                                    }

                                new_module_infos = cons(cons(module_plist, module_rest), new_module_infos);
                                cdolist_list_var = cdolist_list_var.rest();
                                module_info = cdolist_list_var.first();
                            } 
                            module_infos = new_module_infos;
                        } else
                            if ((NIL != el_negation_p(reconstructed_cms)) && (NIL != atomic_sentenceP(cycl_utilities.sentence_arg1(reconstructed_cms, UNPROVIDED)))) {
                                module_infos = NIL;
                            } else {
                                Errors.error($str54$complex_non_atomic_meaning_senten);
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
            sksi_meaning_sentence_gaf_infos_error(conditional_meaning_sentence_gaf, error_message);
            module_infos = NIL;
        }
        return module_infos;
    }

    public static SubLObject condition_output_pattern(final SubLObject output_pattern, final SubLObject from_expression, final SubLObject where_expression, final SubLObject eval_conditions, final SubLObject old_sk_source, final SubLObject old_content_mt, final SubLObject new_sk_source, final SubLObject new_content_mt) {
        if (NIL != sksi_csql_utilities.csql_true_p(where_expression)) {
            return output_pattern;
        }
        final SubLObject old_from = list_utilities.tree_find_if(CSQL_FROM_CLAUSE_P, output_pattern, UNPROVIDED);
        final SubLObject old_tables = second(old_from);
        final SubLObject new_tables = union(old_tables, from_expression, symbol_function(EQUAL), UNPROVIDED);
        final SubLObject old_where = list_utilities.tree_find_if(CSQL_WHERE_CLAUSE_P, output_pattern, UNPROVIDED);
        SubLObject new_output_pattern = list_utilities.tree_substitute(output_pattern, old_tables, new_tables);
        if (NIL == kb_utilities.kbeq(old_sk_source, new_sk_source)) {
            new_output_pattern = list_utilities.tree_substitute(new_output_pattern, old_sk_source, new_sk_source);
        }
        if (NIL == hlmt.hlmt_equal(old_content_mt, new_content_mt)) {
            new_output_pattern = list_utilities.tree_substitute(new_output_pattern, old_content_mt, new_content_mt);
        }
        if (NIL != old_where) {
            final SubLObject old_where_clauses = second(old_where);
            final SubLObject new_where_clauses = cons(where_expression, old_where_clauses);
            new_output_pattern = list_utilities.tree_substitute(new_output_pattern, old_where_clauses, new_where_clauses);
        } else {
            final SubLObject new_where = cons($WHERE, list(list(where_expression)));
            final SubLObject old_select = list_utilities.tree_find_if(CSQL_SELECT_QUERY_P, new_output_pattern, UNPROVIDED);
            final SubLObject new_select = list_utilities.snoc(new_where, old_select);
            new_output_pattern = list_utilities.tree_substitute(new_output_pattern, old_select, new_select);
        }
        return new_output_pattern;
    }

    public static SubLObject sksi_get_any_predicates_pattern_internal(final SubLObject pred, final SubLObject logical_schemata, final SubLObject physical_schemata) {
        final SubLObject field_decodings = sksi_field_translation_utilities.relevant_field_decodings_for_indexical(pred, logical_schemata, physical_schemata);
        SubLObject pred_list = NIL;
        SubLObject schema_object_fn_expression_list = NIL;
        SubLObject cdolist_list_var = field_decodings;
        SubLObject field_decoding = NIL;
        field_decoding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != sksi_kb_accessors.schema_object_fn_expression_p(field_decoding)) {
                final SubLObject code_mapping_schema = cycl_utilities.formula_arg1(field_decoding, UNPROVIDED);
                if (NIL != forts.fort_p(code_mapping_schema)) {
                    SubLObject cdolist_list_var_$12;
                    final SubLObject mapped_terms = cdolist_list_var_$12 = sksi_kb_accessors.cycl_terms_mapped_to_by_code_mapping_schema(code_mapping_schema);
                    SubLObject v_term = NIL;
                    v_term = cdolist_list_var_$12.first();
                    while (NIL != cdolist_list_var_$12) {
                        if (NIL != fort_types_interface.predicateP(v_term)) {
                            pred_list = cons(v_term, pred_list);
                        }
                        cdolist_list_var_$12 = cdolist_list_var_$12.rest();
                        v_term = cdolist_list_var_$12.first();
                    } 
                    schema_object_fn_expression_list = cons(listS($$SchemaObjectFn, code_mapping_schema, $list72), schema_object_fn_expression_list);
                    schema_object_fn_expression_list = cons(listS($$SourceSchemaObjectFn, code_mapping_schema, $list72), schema_object_fn_expression_list);
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            field_decoding = cdolist_list_var.first();
        } 
        return nconc(kb_utilities.sort_terms(list_utilities.fast_delete_duplicates(pred_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED), NIL, T, T, UNPROVIDED, UNPROVIDED, UNPROVIDED), list_utilities.fast_delete_duplicates(schema_object_fn_expression_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject sksi_get_any_predicates_pattern(final SubLObject pred, final SubLObject logical_schemata, final SubLObject physical_schemata) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return sksi_get_any_predicates_pattern_internal(pred, logical_schemata, physical_schemata);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, SKSI_GET_ANY_PREDICATES_PATTERN, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), SKSI_GET_ANY_PREDICATES_PATTERN, THREE_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, SKSI_GET_ANY_PREDICATES_PATTERN, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_3(pred, logical_schemata, physical_schemata);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = NIL;
            collision = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = second(collision);
                if (pred.eql(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (logical_schemata.eql(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (((NIL != cached_args) && (NIL == cached_args.rest())) && physical_schemata.eql(cached_args.first())) {
                            return memoization_state.caching_results(results2);
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            } 
        }
        final SubLObject results3 = arg2(thread.resetMultipleValues(), multiple_value_list(sksi_get_any_predicates_pattern_internal(pred, logical_schemata, physical_schemata)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, list(pred, logical_schemata, physical_schemata));
        return memoization_state.caching_results(results3);
    }

    public static SubLObject sksi_too_many_unbound_required_pattern_termsP(final SubLObject pattern, final SubLObject meaning_sentence, final SubLObject antecedent_meaning_sentence) {
        return makeBoolean((NIL != sksi_fully_unbound_required_pattern_termsP(pattern)) || (NIL != sksi_too_many_unbound_required_pattern_terms_intP(pattern, meaning_sentence, antecedent_meaning_sentence)));
    }

    public static SubLObject sksi_too_many_unbound_required_pattern_terms_intP(final SubLObject pattern, final SubLObject meaning_sentence, final SubLObject antecedent_meaning_sentence) {
        final SubLObject lfi_alias_fn_pos_list = cycl_utilities.arg_positions_if_bfs(LFI_ALIAS_FN_NAUT_P, meaning_sentence, UNPROVIDED);
        SubLObject unbound_pos_count = ZERO_INTEGER;
        SubLObject too_manyP = NIL;
        SubLObject cdolist_list_var = lfi_alias_fn_pos_list;
        SubLObject lfi_alias_fn_pos = NIL;
        lfi_alias_fn_pos = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL == sksi_fully_bound_required_pattern_termP(cycl_utilities.formula_arg_position(pattern, lfi_alias_fn_pos, UNPROVIDED))) {
                unbound_pos_count = add(unbound_pos_count, ONE_INTEGER);
            }
            if (unbound_pos_count.numGE(ONE_INTEGER)) {
                too_manyP = T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            lfi_alias_fn_pos = cdolist_list_var.first();
        } 
        if (unbound_pos_count.isPositive() && (NIL != list_utilities.lengthE(lfi_alias_fn_pos_list, unbound_pos_count, UNPROVIDED))) {
            return T;
        }
        if (NIL == too_manyP) {
            return NIL;
        }
        final SubLObject expression_lfi_forts = cycl_utilities.expression_gather(meaning_sentence, LOGICAL_FIELD_INDEXICAL_FORT_P, T, symbol_function(EQ), symbol_function(IDENTITY), NIL);
        SubLObject bound_non_lfi_aliasP = NIL;
        if (NIL == bound_non_lfi_aliasP) {
            SubLObject csome_list_var = expression_lfi_forts;
            SubLObject lfi = NIL;
            lfi = csome_list_var.first();
            while ((NIL == bound_non_lfi_aliasP) && (NIL != csome_list_var)) {
                final SubLObject lfi_pos = cycl_utilities.arg_positions_bfs(lfi, meaning_sentence, UNPROVIDED).first();
                final SubLObject lfi_boundedness = cycl_utilities.formula_arg_position(pattern, lfi_pos, UNPROVIDED);
                if (lfi_boundedness == $FULLY_BOUND) {
                    bound_non_lfi_aliasP = T;
                }
                csome_list_var = csome_list_var.rest();
                lfi = csome_list_var.first();
            } 
        }
        if (NIL != bound_non_lfi_aliasP) {
            return NIL;
        }
        final SubLObject restrictive_constraintP = antecedent_sentence_contains_restrictive_constraintP(antecedent_meaning_sentence);
        if (NIL != restrictive_constraintP) {
            return NIL;
        }
        return T;
    }

    public static SubLObject antecedent_sentence_contains_restrictive_constraintP(final SubLObject antecedent_meaning_sentence) {
        if (NIL == atomic_sentenceP(antecedent_meaning_sentence)) {
            SubLObject doneP = NIL;
            final SubLObject args = cycl_utilities.formula_args(antecedent_meaning_sentence, $IGNORE);
            SubLObject rest;
            SubLObject arg;
            for (rest = NIL, rest = args; (NIL == doneP) && (NIL != rest); rest = rest.rest()) {
                arg = rest.first();
                if (NIL != antecedent_sentence_contains_restrictive_constraintP(arg)) {
                    doneP = T;
                }
            }
            return doneP;
        }
        if (NIL != kb_utilities.kbeq(cycl_utilities.formula_operator(antecedent_meaning_sentence), $$evaluate)) {
            return NIL;
        }
        final SubLObject args2 = cycl_utilities.formula_args(antecedent_meaning_sentence, UNPROVIDED);
        if (NIL != list_utilities.any_in_list(NON_LOGICAL_FIELD_INDEXICAL_P, args2, UNPROVIDED)) {
            return T;
        }
        SubLObject alias_index_list = NIL;
        SubLObject cdolist_list_var = args2;
        SubLObject arg = NIL;
        arg = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != sksi_kb_accessors.lfi_alias_fn_naut_p(arg)) {
                alias_index_list = cons(sksi_kb_accessors.lfi_alias_fn_naut_index(arg), alias_index_list);
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        } 
        alias_index_list = list_utilities.fast_delete_duplicates(alias_index_list, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return list_utilities.lengthG(alias_index_list, ONE_INTEGER, UNPROVIDED);
    }

    public static SubLObject non_logical_field_indexical_p(final SubLObject v_object) {
        return makeBoolean(NIL == sksi_kb_accessors.logical_field_indexical_p(v_object));
    }

    public static SubLObject sksi_doomed_unless_arg_boundP(final SubLObject pattern, final SubLObject meaning_sentence) {
        SubLObject cdolist_list_var = cycl_utilities.arg_positions_bfs($NOT_FULLY_BOUND, pattern, UNPROVIDED);
        SubLObject arg_position = NIL;
        arg_position = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject lfi = cycl_utilities.formula_arg_position(meaning_sentence, arg_position, UNPROVIDED);
            SubLObject cdolist_list_var_$13;
            final SubLObject doomy_assertions = cdolist_list_var_$13 = (NIL != sksi_kb_accessors.logical_field_indexical_p(lfi)) ? kb_mapping_utilities.pred_values(lfi, $$sksiModulesDoomedUnlessArgBound, ONE_INTEGER, TWO_INTEGER, UNPROVIDED) : NIL;
            SubLObject doomy_assertion = NIL;
            doomy_assertion = cdolist_list_var_$13.first();
            while (NIL != cdolist_list_var_$13) {
                final SubLObject doomed_meaning_sentence = assertions_high.gaf_arg2(doomy_assertion);
                if (NIL != czer_utilities.equals_elP(meaning_sentence, doomed_meaning_sentence, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    return T;
                }
                cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                doomy_assertion = cdolist_list_var_$13.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            arg_position = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject sksi_valid_removal_module_required_patternP(final SubLObject pattern, final SubLObject meaning_sentence, final SubLObject physical_schemata, final SubLObject antecedent_meaning_sentence) {
        final SubLObject enumerable_schemaP = list_utilities.every_in_list($sym82$PHYSICAL_SCHEMA_ENUMERABLE_, physical_schemata, UNPROVIDED);
        if (NIL != enumerable_schemaP) {
            return T;
        }
        final SubLObject doomed_unless_arg_boundP = sksi_doomed_unless_arg_boundP(pattern, meaning_sentence);
        if (NIL != doomed_unless_arg_boundP) {
            return NIL;
        }
        final SubLObject too_many_unboundsP = sksi_too_many_unbound_required_pattern_termsP(pattern, meaning_sentence, antecedent_meaning_sentence);
        if (NIL == too_many_unboundsP) {
            return T;
        }
        return NIL;
    }

    public static SubLObject pos_atomic_meaning_sentence_required_pattern_infos(SubLObject meaning_sentence, final SubLObject logical_schemata, final SubLObject physical_schemata, final SubLObject sk_source, final SubLObject content_mt, final SubLObject module_supports, SubLObject antecedent_sentence) {
        if (antecedent_sentence == UNPROVIDED) {
            antecedent_sentence = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject logical_field_indexical_termnums = sentence_termnums_containing_logical_field_indexicals(meaning_sentence);
        SubLObject module_infos = NIL;
        final SubLObject lfi_predP = sksi_meaning_sentence_utilities.meaning_sentence_with_logical_field_indexical_predicateP(meaning_sentence);
        final SubLObject pred = cycl_utilities.atomic_sentence_predicate(meaning_sentence);
        SubLObject constrained_pred = NIL;
        SubLObject pred_list = NIL;
        if (NIL != lfi_predP) {
            thread.resetMultipleValues();
            final SubLObject meaning_sentence_$14 = sksi_meaning_sentence_utilities.possibly_constrain_consequent_meaning_sentence(antecedent_sentence, meaning_sentence);
            final SubLObject constrained_pred_$15 = thread.secondMultipleValue();
            thread.resetMultipleValues();
            meaning_sentence = meaning_sentence_$14;
            constrained_pred = constrained_pred_$15;
            if (NIL != constrained_pred) {
                logical_field_indexical_termnums = delete($list83, logical_field_indexical_termnums, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            } else {
                pred_list = sksi_get_any_predicates_pattern(pred, logical_schemata, physical_schemata);
            }
        }
        SubLObject cdolist_list_var;
        final SubLObject permutations = cdolist_list_var = compute_meaning_sentence_required_patterns(meaning_sentence, logical_field_indexical_termnums, $POS);
        SubLObject permutation = NIL;
        permutation = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = permutation;
            SubLObject tuple = NIL;
            SubLObject input_termnums = NIL;
            SubLObject output_termnums = NIL;
            destructuring_bind_must_consp(current, datum, $list85);
            tuple = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list85);
            input_termnums = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list85);
            output_termnums = current.first();
            current = current.rest();
            if (NIL == current) {
                final SubLObject enumerable_schemaP = list_utilities.every_in_list($sym82$PHYSICAL_SCHEMA_ENUMERABLE_, physical_schemata, UNPROVIDED);
                final SubLObject valid_required_patternP = sksi_valid_removal_module_required_patternP(tuple, meaning_sentence, physical_schemata, antecedent_sentence);
                if (NIL == valid_required_patternP) {
                    if ((NIL != lfi_predP) && (NIL == constrained_pred)) {
                        Errors.warn($str86$Could_not_constrain_the__not_full, meaning_sentence);
                    } else {
                        final SubLObject assertion_count = sksi_removal_module_cost(tuple, meaning_sentence, logical_schemata, physical_schemata, input_termnums, output_termnums, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        if (NIL != assertion_count) {
                            increment_assertion_count_for_mt(content_mt, assertion_count);
                        }
                        sksi_preference_module_generation.register_sksi_preference_module_for_sks(sk_source, tuple, $POS, NIL != lfi_predP ? constrained_pred : pred, pred_list, content_mt, $DISALLOWED);
                        $sks_preference_modules_count$.setDynamicValue(add($sks_preference_modules_count$.getDynamicValue(thread), ONE_INTEGER), thread);
                    }
                }
                if (NIL != valid_required_patternP) {
                    SubLObject module_info = new_module_info();
                    module_info = module_info_add(module_info, $INPUT_TERMNUMS, input_termnums);
                    module_info = module_info_add(module_info, $OUTPUT_TERMNUMS, output_termnums);
                    module_info = module_info_add(module_info, $MODULE_SUPPORTS, module_supports);
                    module_info = module_info_add(module_info, $SENSE, $POS);
                    if (NIL != lfi_predP) {
                        if (NIL != constrained_pred) {
                            module_info = module_info_add(module_info, $PREDICATE, constrained_pred);
                        } else
                            if ((NIL != pred_list) && (NIL == sksi_not_fully_bound_required_pattern_predicateP(tuple))) {
                                module_info = module_info_add(module_info, $ANY_PREDICATES, pred_list);
                            }

                    } else {
                        module_info = module_info_add(module_info, $PREDICATE, pred);
                    }
                    final SubLObject documentation = sksi_make_documentation_string_from_required_pattern_and_sense(tuple, $POS);
                    final SubLObject required_pattern = add_cmls_pruning_to_required_pattern(tuple, meaning_sentence, logical_field_indexical_termnums, logical_schemata, physical_schemata);
                    module_info = module_info_add(module_info, $SIMPLE_REQUIRED_PATTERN, tuple);
                    module_info = module_info_add(module_info, $MEANING_SENTENCE, meaning_sentence);
                    module_info = module_info_add(module_info, $REQUIRED_PATTERN, required_pattern);
                    module_info = module_info_add(module_info, $DOCUMENTATION, documentation);
                    module_info = module_info_add(module_info, $REQUIRED_MT, content_mt);
                    if (NIL != enumerable_schemaP) {
                        SubLObject cdolist_list_var_$16 = physical_schemata;
                        SubLObject physical_schema = NIL;
                        physical_schema = cdolist_list_var_$16.first();
                        while (NIL != cdolist_list_var_$16) {
                            module_info = module_info_push(module_info, $MODULE_SUPPORTS, sksi_kb_accessors.enumerable_schema_gaf(physical_schema));
                            cdolist_list_var_$16 = cdolist_list_var_$16.rest();
                            physical_schema = cdolist_list_var_$16.first();
                        } 
                    }
                    module_info = module_info_add(module_info, $MODULE_NAME, determine_module_info_name(module_info));
                    module_infos = cons(module_info, module_infos);
                }
            } else {
                cdestructuring_bind_error(datum, $list85);
            }
            cdolist_list_var = cdolist_list_var.rest();
            permutation = cdolist_list_var.first();
        } 
        return nreverse(module_infos);
    }

    public static SubLObject sksi_fully_unbound_required_pattern_termsP(final SubLObject required_pattern_terms) {
        return makeBoolean(NIL == list_utilities.tree_find($FULLY_BOUND, required_pattern_terms, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject sksi_not_fully_bound_required_pattern_predicateP(final SubLObject required_pattern_terms) {
        return eq(required_pattern_terms.first(), $NOT_FULLY_BOUND);
    }

    public static SubLObject has_duplicate_keysP(final SubLObject list) {
        return list_utilities.equal_duplicatesP(list, FIRST);
    }

    public static SubLObject compute_boundedness_permutations_for_logical_field_indexical_termnums(final SubLObject logical_field_indexical_termnums, final SubLObject sense) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = logical_field_indexical_termnums;
        SubLObject termnums_list = NIL;
        termnums_list = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            result = cons(list_utilities.cartesian_product(list(list(termnums_list), sense == $POS ? $list94 : $list95), UNPROVIDED, UNPROVIDED, UNPROVIDED), result);
            cdolist_list_var = cdolist_list_var.rest();
            termnums_list = cdolist_list_var.first();
        } 
        return list_utilities.cartesian_product(nreverse(result), UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject distinct_logical_field_termnum_bindingsP(final SubLObject binding_1, final SubLObject binding_2) {
        return makeBoolean(NIL == subl_promotions.memberP(binding_1.first(), binding_2, symbol_function(EQUAL), CAR));
    }

    public static SubLObject compute_meaning_sentence_required_patterns(final SubLObject meaning_sentence, final SubLObject logical_field_indexical_termnums, final SubLObject sense) {
        final SubLObject permutations = compute_boundedness_permutations_for_logical_field_indexical_termnums(logical_field_indexical_termnums, sense);
        SubLObject result = NIL;
        SubLObject cdolist_list_var = permutations;
        SubLObject permutation = NIL;
        permutation = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject pattern = copy_expression(meaning_sentence);
            SubLObject input_termnums = NIL;
            SubLObject output_termnums = NIL;
            SubLObject cdolist_list_var_$17 = permutation;
            SubLObject arg_pos_list_value_pair = NIL;
            arg_pos_list_value_pair = cdolist_list_var_$17.first();
            while (NIL != cdolist_list_var_$17) {
                SubLObject current;
                final SubLObject datum = current = arg_pos_list_value_pair;
                SubLObject arg_pos_list = NIL;
                SubLObject value = NIL;
                destructuring_bind_must_consp(current, datum, $list97);
                arg_pos_list = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list97);
                value = current.first();
                current = current.rest();
                if (NIL == current) {
                    SubLObject cdolist_list_var_$18 = arg_pos_list;
                    SubLObject arg_pos = NIL;
                    arg_pos = cdolist_list_var_$18.first();
                    while (NIL != cdolist_list_var_$18) {
                        pattern = cycl_utilities.formula_arg_position_nsubst(value, arg_pos, pattern);
                        cdolist_list_var_$18 = cdolist_list_var_$18.rest();
                        arg_pos = cdolist_list_var_$18.first();
                    } 
                    final SubLObject pcase_var = value;
                    if (pcase_var.eql($FULLY_BOUND)) {
                        input_termnums = append(input_termnums, arg_pos_list);
                    } else
                        if (pcase_var.eql($NOT_FULLY_BOUND)) {
                            output_termnums = append(output_termnums, arg_pos_list);
                        }

                } else {
                    cdestructuring_bind_error(datum, $list97);
                }
                cdolist_list_var_$17 = cdolist_list_var_$17.rest();
                arg_pos_list_value_pair = cdolist_list_var_$17.first();
            } 
            pattern = replace_pattern_parts(pattern, sense);
            result = cons(list(pattern, input_termnums, output_termnums), result);
            cdolist_list_var = cdolist_list_var.rest();
            permutation = cdolist_list_var.first();
        } 
        return result;
    }

    public static SubLObject replace_pattern_parts(SubLObject pattern, final SubLObject sense) {
        pattern = replace_pattern_nauts_with_unify_subpatterns(pattern);
        pattern = replace_pattern_narts_with_nat_subpatterns(pattern);
        if (sense == $POS) {
            pattern = replace_pattern_forts_with_unify_subpatterns(pattern);
        }
        return pattern;
    }

    public static SubLObject replace_pattern_narts_with_nat_subpatterns(final SubLObject pattern) {
        final SubLObject new_subpattern = list_utilities.tree_transform_if(cycl_utilities.formula_args(pattern, UNPROVIDED), NART_P, MAKE_NAT_SUBPATTERN, UNPROVIDED);
        return make_el_formula(cycl_utilities.formula_operator(pattern), new_subpattern, UNPROVIDED);
    }

    public static SubLObject make_nat_subpattern(final SubLObject nart) {
        return list($NAT, narts_high.nart_el_formula(nart));
    }

    public static SubLObject nat_subpattern_p(final SubLObject pattern) {
        return makeBoolean(pattern.isCons() && (pattern.first() == $NAT));
    }

    public static SubLObject nartify_nat_pattern(final SubLObject pattern) {
        return narts_high.find_nart(second(pattern));
    }

    public static SubLObject disjunctive_subpattern_p(final SubLObject pattern) {
        return makeBoolean(pattern.isCons() && (pattern.first() == $OR));
    }

    public static SubLObject make_disjunctive_subpattern(final SubLObject nat_pattern) {
        return listS($OR, nat_pattern, $list102);
    }

    public static SubLObject make_unify_subpattern(final SubLObject fort) {
        return list($UNIFY, fort);
    }

    public static SubLObject unify_subpattern_p(final SubLObject pattern) {
        return makeBoolean(pattern.isCons() && (pattern.first() == $UNIFY));
    }

    public static SubLObject replace_pattern_nauts_with_unify_subpatterns(final SubLObject pattern) {
        final SubLObject new_subpattern = list_utilities.tree_transform_if(cycl_utilities.formula_args(pattern, UNPROVIDED), $sym104$NAUT_, MAKE_UNIFY_SUBPATTERN, UNPROVIDED);
        return make_el_formula(cycl_utilities.formula_operator(pattern), new_subpattern, UNPROVIDED);
    }

    public static SubLObject replace_pattern_forts_with_unify_subpatterns(final SubLObject pattern) {
        SubLObject new_subpattern = list_utilities.tree_transform_if(cycl_utilities.formula_args(pattern, UNPROVIDED), NON_SENTENTIAL_RELATION_FORT_P, MAKE_UNIFY_SUBPATTERN, UNPROVIDED);
        new_subpattern = list_utilities.tree_transform_if(new_subpattern, NAT_SUBPATTERN_P, MAKE_DISJUNCTIVE_SUBPATTERN, UNPROVIDED);
        return make_el_formula(cycl_utilities.formula_operator(pattern), new_subpattern, UNPROVIDED);
    }

    public static SubLObject non_sentential_relation_fort_p_internal(final SubLObject v_object) {
        return makeBoolean((NIL != forts.fort_p(v_object)) && (NIL == isa.isaP(v_object, $$SententialRelation, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject non_sentential_relation_fort_p(final SubLObject v_object) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return non_sentential_relation_fort_p_internal(v_object);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, NON_SENTENTIAL_RELATION_FORT_P, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), NON_SENTENTIAL_RELATION_FORT_P, ONE_INTEGER, NIL, EQL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, NON_SENTENTIAL_RELATION_FORT_P, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, v_object, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(non_sentential_relation_fort_p_internal(v_object)));
            memoization_state.caching_state_put(caching_state, v_object, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject replace_pattern_special_subpatterns_with_forts(final SubLObject pattern) {
        SubLObject new_subpattern = list_utilities.tree_transform_if(cycl_utilities.formula_args(pattern, UNPROVIDED), UNIFY_SUBPATTERN_P, SECOND, UNPROVIDED);
        new_subpattern = list_utilities.tree_transform_if(new_subpattern, DISJUNCTIVE_SUBPATTERN_P, SECOND, UNPROVIDED);
        new_subpattern = list_utilities.tree_transform_if(new_subpattern, NAT_SUBPATTERN_P, NARTIFY_NAT_PATTERN, UNPROVIDED);
        return make_el_formula(cycl_utilities.formula_operator(pattern), new_subpattern, UNPROVIDED);
    }

    public static SubLObject replace_pattern_special_subpatterns_with_anything(final SubLObject pattern) {
        final SubLObject new_subpattern = subst_if($ANYTHING, UNIFY_SUBPATTERN_P, subst_if($ANYTHING, NAT_SUBPATTERN_P, subst_if($ANYTHING, DISJUNCTIVE_SUBPATTERN_P, cycl_utilities.formula_args(pattern, UNPROVIDED), UNPROVIDED), UNPROVIDED), UNPROVIDED);
        return make_el_formula(cycl_utilities.formula_operator(pattern), new_subpattern, UNPROVIDED);
    }

    public static SubLObject add_cmls_pruning_to_required_pattern(final SubLObject required_pattern, final SubLObject sentence, final SubLObject logical_field_indexical_termnums, final SubLObject logical_schemata, final SubLObject physical_schemata) {
        final SubLObject new_required_pattern = copy_tree(required_pattern);
        return new_required_pattern;
    }

    public static SubLObject clear_generate_sksi_slrm_required_function() {
        final SubLObject cs = $generate_sksi_slrm_required_function_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_generate_sksi_slrm_required_function(final SubLObject sk_source) {
        return memoization_state.caching_state_remove_function_results_with_args($generate_sksi_slrm_required_function_caching_state$.getGlobalValue(), list(sk_source), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject generate_sksi_slrm_required_function_internal(final SubLObject sk_source) {
        final SubLObject required_func_name = determine_sk_source_required_func_name(sk_source);
        return eval(list(DEFINE_PRIVATE, required_func_name, $list117, $list118, list(RET, list($sym120$EXTERNAL_SOURCE_ACTIVATED_IN_IMAGE_, sk_source))));
    }

    public static SubLObject generate_sksi_slrm_required_function(final SubLObject sk_source) {
        SubLObject caching_state = $generate_sksi_slrm_required_function_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(GENERATE_SKSI_SLRM_REQUIRED_FUNCTION, $generate_sksi_slrm_required_function_caching_state$, NIL, EQ, ONE_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, sk_source, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(generate_sksi_slrm_required_function_internal(sk_source)));
            memoization_state.caching_state_put(caching_state, sk_source, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject determine_sk_source_required_func_name(final SubLObject sk_source) {
        return make_symbol(cconcatenate(Strings.string_upcase(kb_utilities.fort_alphanumeric_name(sk_source), UNPROVIDED, UNPROVIDED), $str122$_REQUIRED_FUNC));
    }

    public static SubLObject sksi_only_predicateP_internal(final SubLObject pred) {
        return isa.isa_in_any_mtP(pred, $$SKSIOnlyPredicate);
    }

    public static SubLObject sksi_only_predicateP(final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return sksi_only_predicateP_internal(pred);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym123$SKSI_ONLY_PREDICATE_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym123$SKSI_ONLY_PREDICATE_, ONE_INTEGER, $int$1024, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym123$SKSI_ONLY_PREDICATE_, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, pred, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(sksi_only_predicateP_internal(pred)));
            memoization_state.caching_state_put(caching_state, pred, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject required_info_module_info(SubLObject module_info, final SubLObject sentence, final SubLObject logical_schemata, final SubLObject physical_schemata, final SubLObject sk_source, final SubLObject content_mt, final SubLObject where_expression, final SubLObject from_expression, final SubLObject eval_conditions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject required_pattern = module_info_get(module_info, $SIMPLE_REQUIRED_PATTERN, UNPROVIDED);
        final SubLObject pred = module_info_get(module_info, $PREDICATE, UNPROVIDED);
        final SubLObject pred_list = module_info_get(module_info, $ANY_PREDICATES, UNPROVIDED);
        final SubLObject sense = module_info_get(module_info, $SENSE, UNPROVIDED);
        final SubLObject direction = sksi_kb_accessors.get_sks_single_literal_lookup_direction_from_kb(sk_source);
        final SubLObject completeness = sksi_removal_module_completeness(sentence, logical_schemata);
        final SubLObject supplants_allP = sksi_only_predicateP(pred);
        final SubLObject required_func_name = generate_sksi_slrm_required_function(sk_source);
        final SubLObject module_supports = module_info_get(module_info, $MODULE_SUPPORTS, UNPROVIDED);
        final SubLObject checkP = required_pattern_is_checkP(required_pattern);
        final SubLObject input_termnums = module_info_get(module_info, $INPUT_TERMNUMS, UNPROVIDED);
        final SubLObject output_termnums = module_info_get(module_info, $OUTPUT_TERMNUMS, UNPROVIDED);
        final SubLObject cost = (NIL != checkP) ? $sksi_default_check_cost$.getGlobalValue() : sksi_removal_module_cost(required_pattern, sentence, logical_schemata, physical_schemata, input_termnums, output_termnums, sk_source, where_expression == T ? NIL : where_expression, from_expression);
        SubLObject referenced_code_mapping_schemas = NIL;
        SubLObject referenced_instance_named_fn_colls = NIL;
        SubLObject errorP = NIL;
        final SubLObject _prev_bind_0 = sksi_hl_support_utilities.$sksi_supports$.currentBinding(thread);
        try {
            sksi_hl_support_utilities.$sksi_supports$.bind(NIL, thread);
            final SubLObject input_extract_pattern = sksi_determine_input_extract_pattern(required_pattern, sentence, input_termnums, eval_conditions);
            SubLObject boolean_csqlP = NIL;
            SubLObject missing_required_fieldsP = NIL;
            SubLObject input_verify_pattern = NIL;
            SubLObject output_generate_pattern = NIL;
            SubLObject output_check_pattern = NIL;
            SubLObject output_decode_pattern = NIL;
            SubLObject output_verify_pattern = NIL;
            SubLObject output_construct_pattern = NIL;
            SubLObject cost_pattern = NIL;
            final SubLObject support_module = $SKSI;
            final SubLObject support_strength = $DEFAULT;
            thread.resetMultipleValues();
            final SubLObject input_encode_pattern = sksi_determine_input_encode_pattern(sentence, logical_schemata, physical_schemata, sk_source, input_termnums, eval_conditions);
            final SubLObject relevant_physical_field_indexicals = thread.secondMultipleValue();
            final SubLObject prune_patterns = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (NIL != checkP) {
                output_check_pattern = sksi_determine_output_check_pattern(relevant_physical_field_indexicals, sentence, logical_schemata, physical_schemata, sk_source, input_termnums, output_termnums, sense, content_mt, eval_conditions);
            } else {
                thread.resetMultipleValues();
                final SubLObject output_generate_pattern_$19 = sksi_determine_output_generate_pattern(required_pattern, relevant_physical_field_indexicals, sentence, logical_schemata, physical_schemata, sk_source, input_termnums, output_termnums, content_mt, eval_conditions);
                final SubLObject boolean_csqlP_$20 = thread.secondMultipleValue();
                final SubLObject missing_required_fieldsP_$21 = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                output_generate_pattern = output_generate_pattern_$19;
                boolean_csqlP = boolean_csqlP_$20;
                missing_required_fieldsP = missing_required_fieldsP_$21;
                if (NIL != output_generate_pattern) {
                    if (NIL == boolean_csqlP) {
                        output_verify_pattern = sksi_determine_output_verify_pattern(output_termnums);
                    }
                    input_verify_pattern = sksi_determine_input_verify_pattern(input_termnums);
                    cost_pattern = sksi_determine_cost_pattern(sense, sk_source, cost);
                    thread.resetMultipleValues();
                    final SubLObject output_decode_pattern_$22 = sksi_determine_output_decode_pattern(sentence, logical_schemata, physical_schemata, output_termnums, sk_source, input_termnums);
                    final SubLObject referenced_code_mapping_schemas_$23 = thread.secondMultipleValue();
                    final SubLObject referenced_instance_named_fn_colls_$24 = thread.thirdMultipleValue();
                    thread.resetMultipleValues();
                    output_decode_pattern = output_decode_pattern_$22;
                    referenced_code_mapping_schemas = referenced_code_mapping_schemas_$23;
                    referenced_instance_named_fn_colls = referenced_instance_named_fn_colls_$24;
                    output_construct_pattern = sksi_determine_output_construct_pattern(sentence, required_pattern, input_termnums, output_termnums);
                }
                if (NIL != missing_required_fieldsP) {
                    sksi_preference_module_generation.register_sksi_preference_module_for_sks(sk_source, required_pattern, $POS, pred, pred_list, content_mt, $DISPREFERRED);
                    $sks_preference_modules_count$.setDynamicValue(add($sks_preference_modules_count$.getDynamicValue(thread), ONE_INTEGER), thread);
                }
            }
            if ((NIL != prune_patterns) && (NIL != sksi_only_predicateP(pred))) {
                final SubLObject supplanted_module_name = module_info_get(module_info, $MODULE_NAME, UNPROVIDED);
                final SubLObject prune_module_name = string_utilities.keyword_from_string(Strings.string_upcase(cconcatenate(string_utilities.string_from_keyword(supplanted_module_name), $str129$_prune_unreformulatable), UNPROVIDED, UNPROVIDED));
                SubLObject prune_required_pattern = NIL;
                SubLObject cdolist_list_var = prune_patterns;
                SubLObject prune_pattern = NIL;
                prune_pattern = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    prune_required_pattern = cons(prune_pattern, prune_required_pattern);
                    cdolist_list_var = cdolist_list_var.rest();
                    prune_pattern = cdolist_list_var.first();
                } 
                prune_required_pattern = cons($OR, prune_required_pattern);
                prune_required_pattern = list(prune_required_pattern);
                prune_required_pattern = cons(required_pattern, prune_required_pattern);
                prune_required_pattern = cons($AND, prune_required_pattern);
                SubLObject hl_module_plist = listS($MODULE_TYPE, new SubLObject[]{ $REMOVAL, $MODULE_SUBTYPE, $list134, $MODULE_SOURCE, sk_source, $CHECK, NIL, $SENSE, sense, $DIRECTION, direction, $REQUIRED_PATTERN, prune_required_pattern, $REQUIRED_MT, content_mt, $EXCLUSIVE, TRUE, $SUPPLANTS, list($list141, supplanted_module_name), $COMPLETENESS, completeness, $list143 });
                SubLObject hl_module = NIL;
                if (NIL != pred) {
                    hl_module_plist = putf(hl_module_plist, $PREDICATE, pred);
                }
                if (NIL != pred_list) {
                    hl_module_plist = putf(hl_module_plist, $ANY_PREDICATES, pred_list);
                }
                hl_module = inference_modules.inference_removal_module(prune_module_name, hl_module_plist);
                $sks_prune_modules_count$.setDynamicValue(add($sks_prune_modules_count$.getDynamicValue(thread), ONE_INTEGER), thread);
                note_sksi_module(hl_module);
                note_sksi_module_by_sks(sk_source, hl_module);
            }
            if ((NIL == output_generate_pattern) && (NIL == output_check_pattern)) {
                errorP = T;
            }
            module_info = module_info_add(module_info, $MODULE_SUBTYPE, $SKSI);
            module_info = module_info_add(module_info, $MODULE_SOURCE, sk_source);
            module_info = module_info_add(module_info, $CHECK, checkP);
            module_info = module_info_add(module_info, $REQUIRED, required_func_name);
            module_info = module_info_add(module_info, $DIRECTION, direction);
            module_info = module_info_add(module_info, $COMPLETENESS, completeness);
            if (NIL != supplants_allP) {
                module_info = module_info_add(module_info, $EXCLUSIVE, TRUE);
                module_info = module_info_add(module_info, $SUPPLANTS, $list145);
            }
            if (NIL != input_extract_pattern) {
                module_info = module_info_add(module_info, $INPUT_EXTRACT_PATTERN, input_extract_pattern);
            }
            if (NIL != input_encode_pattern) {
                module_info = module_info_add(module_info, $INPUT_ENCODE_PATTERN, input_encode_pattern);
            }
            if (NIL != input_verify_pattern) {
                module_info = module_info_add(module_info, $INPUT_VERIFY_PATTERN, input_verify_pattern);
            }
            if (NIL != output_generate_pattern) {
                module_info = module_info_add(module_info, $OUTPUT_GENERATE_PATTERN, output_generate_pattern);
            }
            if (NIL != output_check_pattern) {
                module_info = module_info_add(module_info, $OUTPUT_CHECK_PATTERN, output_check_pattern);
            }
            if (NIL != output_decode_pattern) {
                module_info = module_info_add(module_info, $OUTPUT_DECODE_PATTERN, output_decode_pattern);
            }
            if (NIL != output_verify_pattern) {
                module_info = module_info_add(module_info, $OUTPUT_VERIFY_PATTERN, output_verify_pattern);
            }
            if (NIL != output_construct_pattern) {
                module_info = module_info_add(module_info, $OUTPUT_CONSTRUCT_PATTERN, output_construct_pattern);
            }
            module_info = module_info_add(module_info, $COST_EXPRESSION, cost);
            module_info = module_info_add(module_info, $COST_PATTERN, cost_pattern);
            if (NIL != support_module) {
                module_info = module_info_add(module_info, $SUPPORT_MODULE, support_module);
            }
            if (NIL != content_mt) {
                module_info = module_info_add(module_info, $SUPPORT_MT, content_mt);
            }
            if (NIL != support_strength) {
                module_info = module_info_add(module_info, $SUPPORT_STRENGTH, support_strength);
            }
            final SubLObject more_supports = list_utilities.fast_delete_duplicates(sksi_hl_support_utilities.sksi_supports(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject supports = append(more_supports, module_supports);
            if (NIL != supports) {
                module_info = module_info_add(module_info, $MODULE_SUPPORTS, supports);
            }
        } finally {
            sksi_hl_support_utilities.$sksi_supports$.rebind(_prev_bind_0, thread);
        }
        return NIL != errorP ? NIL : list(module_info, referenced_code_mapping_schemas, referenced_instance_named_fn_colls);
    }

    public static SubLObject sksi_removal_module_completeness(final SubLObject sentence, final SubLObject logical_schemata) {
        SubLObject completeP = NIL;
        if (NIL == completeP) {
            SubLObject csome_list_var = logical_schemata;
            SubLObject logical_schema = NIL;
            logical_schema = csome_list_var.first();
            while ((NIL == completeP) && (NIL != csome_list_var)) {
                if (NIL != sksi_kb_accessors.logical_schema_complete_extent_known_for_predicateP(logical_schema, cycl_utilities.formula_operator(sentence), UNPROVIDED)) {
                    completeP = T;
                }
                csome_list_var = csome_list_var.rest();
                logical_schema = csome_list_var.first();
            } 
        }
        return NIL != completeP ? $COMPLETE : $INCOMPLETE;
    }

    public static SubLObject sksi_make_documentation_string_from_required_pattern_and_sense(final SubLObject required_pattern, final SubLObject sense) {
        SubLObject string = format_nil.format_nil_a(required_pattern);
        if (sense == $NEG) {
            string = cconcatenate($str158$___not_, new SubLObject[]{ string, $str159$_ });
        }
        string = string_utilities.replace_substring(string, $str160$_FULLY_BOUND, $str161$__FULLY_BOUND_);
        string = string_utilities.replace_substring(string, $str162$_FULLY_BOUND, $str163$__FULLY_BOUND_);
        string = string_utilities.replace_substring(string, $str164$NOT_FULLY_BOUND, $str165$_NOT_FULLY_BOUND_);
        return string;
    }

    public static SubLObject sksi_determine_input_extract_pattern(final SubLObject required_pattern, final SubLObject sentence, final SubLObject input_termnums, final SubLObject eval_conditions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject template_sentence = replace_pattern_special_subpatterns_with_anything(required_pattern);
        SubLObject transform_tuple = NIL;
        template_sentence = cycl_utilities.expression_subst($ANYTHING, $NOT_FULLY_BOUND, template_sentence, UNPROVIDED, UNPROVIDED);
        SubLObject cdolist_list_var = input_termnums;
        SubLObject input_termnum = NIL;
        input_termnum = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject symbol = token_cycl_symbol_for_termnum(input_termnum);
            final SubLObject new_term = list($BIND, symbol);
            final SubLObject new_pair = list($VALUE, symbol);
            thread.resetMultipleValues();
            final SubLObject elem = list_utilities.get_nested_nth(template_sentence, input_termnum, UNPROVIDED);
            final SubLObject foundP = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != foundP) {
                template_sentence = list_utilities.replace_nested_nth(template_sentence, input_termnum, new_term);
                transform_tuple = cons(new_pair, transform_tuple);
            }
            cdolist_list_var = cdolist_list_var.rest();
            input_termnum = cdolist_list_var.first();
        } 
        transform_tuple = nreverse(transform_tuple);
        final SubLObject input_extract_pattern = list($TEMPLATE, template_sentence, transform_tuple);
        return input_extract_pattern;
    }

    public static SubLObject sksi_determine_output_verify_pattern(final SubLObject output_termnums) {
        if (NIL != output_termnums) {
            return $list169;
        }
        return NIL;
    }

    public static SubLObject sksi_determine_input_verify_pattern(final SubLObject input_termnums) {
        if (NIL != input_termnums) {
            return $list170;
        }
        return NIL;
    }

    public static SubLObject sksi_determine_input_encode_pattern(final SubLObject sentence, final SubLObject logical_schemata, final SubLObject physical_schemata, final SubLObject sk_source, final SubLObject input_termnums, final SubLObject eval_conditions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject logical_field_indexicals = sksi_referenced_logical_field_indexicals(sentence, input_termnums);
        final SubLObject relevant_physical_field_indexicals = sksi_infrastructure_utilities.sksi_determine_relevant_physical_field_indexicals(logical_field_indexicals, logical_schemata, physical_schemata);
        final SubLObject tuple_variables = Mapping.mapcar(TOKEN_CYCL_SYMBOL_FOR_TERMNUM, input_termnums);
        SubLObject subpatterns = NIL;
        SubLObject resulting_physical_field_indexicals = NIL;
        final SubLObject prune_pattern_template = make_list(length(sentence), $ANYTHING);
        SubLObject prune_patterns = NIL;
        SubLObject cdolist_list_var = relevant_physical_field_indexicals;
        SubLObject pfi = NIL;
        pfi = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject subpattern = sksi_determine_field_input_encode_pattern(sentence, pfi, physical_schemata, logical_field_indexicals, logical_schemata, sk_source);
            final SubLObject sub_prune_patterns = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != subpattern) {
                subpatterns = nconc(subpatterns, subpattern);
                resulting_physical_field_indexicals = nconc(resulting_physical_field_indexicals, make_list(length(subpattern), pfi));
            }
            SubLObject cdolist_list_var_$25 = sub_prune_patterns;
            SubLObject sub_prune_pattern = NIL;
            sub_prune_pattern = cdolist_list_var_$25.first();
            while (NIL != cdolist_list_var_$25) {
                SubLObject prune_pattern = copy_list(prune_pattern_template);
                SubLObject cdolist_list_var_$26 = sub_prune_pattern.first();
                SubLObject lfi_position = NIL;
                lfi_position = cdolist_list_var_$26.first();
                while (NIL != cdolist_list_var_$26) {
                    prune_pattern = list_utilities.replace_nth(lfi_position, second(sub_prune_pattern), prune_pattern);
                    cdolist_list_var_$26 = cdolist_list_var_$26.rest();
                    lfi_position = cdolist_list_var_$26.first();
                } 
                prune_patterns = cons(prune_pattern, prune_patterns);
                cdolist_list_var_$25 = cdolist_list_var_$25.rest();
                sub_prune_pattern = cdolist_list_var_$25.first();
            } 
            cdolist_list_var = cdolist_list_var.rest();
            pfi = cdolist_list_var.first();
        } 
        if (NIL == subpatterns) {
            return values(NIL, NIL);
        }
        final SubLObject input_encode_pattern = list($TUPLE, tuple_variables, subpatterns);
        return values(input_encode_pattern, resulting_physical_field_indexicals, prune_patterns);
    }

    public static SubLObject sksi_reformulatable_via_templateP(final SubLObject expression, final SubLObject template, final SubLObject direction, final SubLObject sks) {
        return template.isCons() ? makeBoolean(NIL == sksi_query_utilities.sksi_unreformulatable_p(sksi_reformulate.sksi_reformulate(list_utilities.tree_substitute(template, $VALUE, expression), direction, sks))) : makeBoolean(NIL == sksi_query_utilities.sksi_unreformulatable_p(sksi_reformulate.sksi_reformulate(expression, direction, sks)));
    }

    public static SubLObject sksi_determine_field_input_encode_pattern(final SubLObject sentence, final SubLObject physical_field_indexical, final SubLObject physical_schemata, final SubLObject logical_field_indexicals, final SubLObject logical_schemata, final SubLObject sk_source) {
        final SubLObject field_encodings = sksi_field_translation_utilities.get_field_encodings_for_physical_field_indexical(physical_field_indexical, logical_schemata, physical_schemata);
        final SubLObject pfi_source = sksi_kb_accessors.physical_field_indexical_sk_source(physical_field_indexical);
        SubLObject prune_patterns = NIL;
        SubLObject patterns = NIL;
        if (NIL == pfi_source) {
            return NIL;
        }
        if ((NIL != physical_field_indexical) && (NIL == field_encodings)) {
            Errors.error($str174$No_field_encodings_for_physical_f, physical_field_indexical, physical_schemata, logical_schemata);
        }
        SubLObject cdolist_list_var = field_encodings;
        SubLObject field_encoding = NIL;
        field_encoding = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject result = copy_expression(field_encoding);
            SubLObject prune_result = copy_expression(field_encoding);
            SubLObject foundP = NIL;
            SubLObject cdolist_list_var_$27 = logical_field_indexicals;
            SubLObject lfi = NIL;
            lfi = cdolist_list_var_$27.first();
            while (NIL != cdolist_list_var_$27) {
                if (((NIL != forts.fort_p(physical_field_indexical)) && (NIL != forts.fort_p(lfi))) || (((NIL != sksi_kb_accessors.pfi_alias_fn_naut_p(physical_field_indexical)) && (NIL != sksi_kb_accessors.lfi_alias_fn_naut_p(lfi))) && (NIL != kb_utilities.kbeq(sksi_kb_accessors.pfi_alias_fn_naut_index(physical_field_indexical), sksi_kb_accessors.lfi_alias_fn_naut_index(lfi))))) {
                    final SubLObject lfi_fort = sksi_kb_accessors.lfi_fort_for_lfi(lfi);
                    if (NIL != cycl_utilities.expression_find(lfi_fort, field_encoding, T, UNPROVIDED, UNPROVIDED)) {
                        final SubLObject replacement = list($VALUE, cycl_token_for_logical_field_indexical(lfi, sentence));
                        final SubLObject lfi_positions = logical_field_indexical_positions_in_sentence(lfi, sentence);
                        result = cycl_utilities.expression_nsubst(replacement, lfi_fort, result, UNPROVIDED, UNPROVIDED);
                        prune_result = list(lfi_positions, list($NOT, list($TEST, $sym173$SKSI_REFORMULATABLE_VIA_TEMPLATE_, cycl_utilities.expression_nsubst($VALUE, lfi_fort, prune_result, UNPROVIDED, UNPROVIDED), $ENCODE, sk_source)));
                        foundP = T;
                    }
                }
                cdolist_list_var_$27 = cdolist_list_var_$27.rest();
                lfi = cdolist_list_var_$27.first();
            } 
            if (NIL != foundP) {
                patterns = cons(list($CALL, SKSI_REFORMULATE, result, $ENCODE, pfi_source), patterns);
                prune_patterns = cons(prune_result, prune_patterns);
            }
            cdolist_list_var = cdolist_list_var.rest();
            field_encoding = cdolist_list_var.first();
        } 
        return values(patterns, prune_patterns);
    }

    public static SubLObject sksi_determine_output_decode_pattern(final SubLObject sentence, final SubLObject logical_schemata, final SubLObject physical_schemata, final SubLObject output_termnums, final SubLObject sk_source, final SubLObject input_termnums) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject unbound_logical_field_indexicals = sksi_referenced_logical_field_indexicals(sentence, output_termnums);
        final SubLObject relevant_physical_field_indexicals = sksi_infrastructure_utilities.sksi_determine_relevant_physical_field_indexicals(unbound_logical_field_indexicals, logical_schemata, physical_schemata);
        final SubLObject tuple_variables = sksi_generate_raw_symbols_for_relevant_physical_field_indexicals(relevant_physical_field_indexicals);
        SubLObject subpatterns = NIL;
        final SubLObject bound_logical_field_indexicals = sksi_referenced_logical_field_indexicals(sentence, input_termnums);
        SubLObject referenced_code_mapping_schemas = NIL;
        SubLObject referenced_instance_named_fn_colls = NIL;
        SubLObject cdolist_list_var = unbound_logical_field_indexicals;
        SubLObject lfi = NIL;
        lfi = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            thread.resetMultipleValues();
            final SubLObject subpattern = sksi_determine_field_output_decode_pattern(lfi, physical_schemata, relevant_physical_field_indexicals, logical_schemata, sk_source, NIL);
            final SubLObject code_mapping_schemas = thread.secondMultipleValue();
            final SubLObject instance_named_fn_colls = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            if (NIL != subpattern) {
                subpatterns = cons(subpattern, subpatterns);
            }
            cdolist_list_var = cdolist_list_var.rest();
            lfi = cdolist_list_var.first();
        } 
        cdolist_list_var = bound_logical_field_indexicals;
        lfi = NIL;
        lfi = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject logical_field_indexical_arg_pos = formula_position(lfi, sentence, symbol_function(EQUAL));
            if (logical_field_indexical_arg_pos.isInteger()) {
                thread.resetMultipleValues();
                final SubLObject subpattern2 = sksi_determine_field_output_decode_pattern(lfi, physical_schemata, relevant_physical_field_indexicals, logical_schemata, sk_source, T);
                final SubLObject code_mapping_schemas2 = thread.secondMultipleValue();
                final SubLObject instance_named_fn_colls2 = thread.thirdMultipleValue();
                thread.resetMultipleValues();
                if (NIL != code_mapping_schemas2) {
                    referenced_code_mapping_schemas = nconc(referenced_code_mapping_schemas, list(list(logical_field_indexical_arg_pos, code_mapping_schemas2)));
                }
                if (NIL != instance_named_fn_colls2) {
                    referenced_instance_named_fn_colls = nconc(referenced_instance_named_fn_colls, list(list(logical_field_indexical_arg_pos, instance_named_fn_colls2)));
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            lfi = cdolist_list_var.first();
        } 
        subpatterns = nreverse(subpatterns);
        referenced_code_mapping_schemas = nreverse(referenced_code_mapping_schemas);
        final SubLObject output_decode_pattern = list($TUPLE, tuple_variables, subpatterns);
        return values(output_decode_pattern, referenced_code_mapping_schemas, referenced_instance_named_fn_colls);
    }

    public static SubLObject sksi_determine_field_output_decode_pattern(final SubLObject logical_field_indexical, final SubLObject physical_schemata, final SubLObject physical_field_indexicals, final SubLObject logical_schemata, final SubLObject sk_source, final SubLObject gather_code_mapping_schemas_onlyP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject field_decodings = sksi_field_translation_utilities.get_field_decodings_for_logical_field_indexical(logical_field_indexical, logical_schemata, physical_schemata);
        final SubLObject lfi_source = sksi_kb_accessors.logical_field_indexical_sk_source(logical_field_indexical);
        SubLObject pattern = NIL;
        SubLObject referenced_code_mapping_schemas = NIL;
        SubLObject referenced_instance_named_fn_colls = NIL;
        if ((NIL != logical_field_indexical) && (NIL == field_decodings)) {
            Errors.error($str180$No_field_decodings_for_logical_fi, logical_field_indexical, logical_schemata, physical_schemata);
        }
        if (NIL != gather_code_mapping_schemas_onlyP) {
            SubLObject cdolist_list_var = field_decodings;
            SubLObject field_decoding = NIL;
            field_decoding = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                thread.resetMultipleValues();
                final SubLObject code_mapping_schemas = gather_code_mapping_schemas_mentioned_in_field_decoding(sksi_kb_accessors.logical_field_for_indexical(logical_field_indexical), field_decoding);
                final SubLObject instance_named_fn_colls = thread.secondMultipleValue();
                thread.resetMultipleValues();
                referenced_code_mapping_schemas = nconc(referenced_code_mapping_schemas, code_mapping_schemas);
                referenced_instance_named_fn_colls = nconc(referenced_instance_named_fn_colls, instance_named_fn_colls);
                cdolist_list_var = cdolist_list_var.rest();
                field_decoding = cdolist_list_var.first();
            } 
        } else
            if (NIL == pattern) {
                SubLObject csome_list_var = field_decodings;
                SubLObject field_decoding = NIL;
                field_decoding = csome_list_var.first();
                while ((NIL == pattern) && (NIL != csome_list_var)) {
                    final SubLObject referenced_physical_field_indexicals = sksi_infrastructure_utilities.determine_relevant_physical_field_indexicals_for_field_decoding(field_decoding, physical_field_indexicals);
                    if (NIL != referenced_physical_field_indexicals) {
                        pattern = sksi_determine_field_output_decode_pattern_int(field_decoding, physical_field_indexicals, referenced_physical_field_indexicals, lfi_source);
                    }
                    csome_list_var = csome_list_var.rest();
                    field_decoding = csome_list_var.first();
                } 
            }

        return values(pattern, referenced_code_mapping_schemas, referenced_instance_named_fn_colls);
    }

    public static SubLObject sksi_determine_field_output_decode_pattern_int(final SubLObject field_decoding, final SubLObject physical_field_indexicals, final SubLObject referenced_physical_field_indexicals, final SubLObject lfi_source) {
        SubLObject result = copy_expression(field_decoding);
        SubLObject cdolist_list_var = referenced_physical_field_indexicals;
        SubLObject pfi = NIL;
        pfi = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject pfi_index = number_utilities.f_1X(position(pfi, physical_field_indexicals, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED, UNPROVIDED));
            final SubLObject raw_symbol = token_raw_symbol_for_termnum(pfi_index);
            final SubLObject replacement = list($VALUE, raw_symbol);
            result = cycl_utilities.expression_nsubst(replacement, sksi_kb_accessors.pfi_fort_for_pfi(pfi), result, UNPROVIDED, UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            pfi = cdolist_list_var.first();
        } 
        return list($CALL, SKSI_REFORMULATE, result, $DECODE, lfi_source);
    }

    public static SubLObject dummy_external_term_denoting_function_expression_p(final SubLObject expression, final SubLObject argnum) {
        return fort_types_interface.sksi_external_term_denoting_function_p(cycl_utilities.formula_operator(expression));
    }

    public static SubLObject gather_external_term_denoting_expressions_of_type_in_field_decoding(final SubLObject field_decoding, final SubLObject pred) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        final SubLObject _prev_bind_0 = cycl_utilities.$opaque_arg_function$.currentBinding(thread);
        try {
            cycl_utilities.$opaque_arg_function$.bind(DUMMY_EXTERNAL_TERM_DENOTING_FUNCTION_EXPRESSION_P, thread);
            v_answer = cycl_utilities.expression_gather(field_decoding, pred, T, symbol_function(EQUAL), UNPROVIDED, UNPROVIDED);
        } finally {
            cycl_utilities.$opaque_arg_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    public static SubLObject field_decoding_contains_city_named_fn_expressionP(final SubLObject field_decoding) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject v_answer = NIL;
        final SubLObject _prev_bind_0 = cycl_utilities.$opaque_arg_function$.currentBinding(thread);
        try {
            cycl_utilities.$opaque_arg_function$.bind(DUMMY_EXTERNAL_TERM_DENOTING_FUNCTION_EXPRESSION_P, thread);
            v_answer = cycl_utilities.expression_find_if(CITY_NAMED_FN_EXPRESSION_P, field_decoding, T, UNPROVIDED);
        } finally {
            cycl_utilities.$opaque_arg_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }

    public static SubLObject gather_code_mapping_schemas_mentioned_in_field_decoding(final SubLObject logical_field, final SubLObject field_decoding) {
        final SubLObject schema_object_fn_terms = gather_external_term_denoting_expressions_of_type_in_field_decoding(field_decoding, SCHEMA_OBJECT_FN_EXPRESSION_P);
        final SubLObject source_schema_object_fn_terms = gather_external_term_denoting_expressions_of_type_in_field_decoding(field_decoding, SOURCE_SCHEMA_OBJECT_FN_EXPRESSION_P);
        final SubLObject instance_named_fn_terms = gather_external_term_denoting_expressions_of_type_in_field_decoding(field_decoding, INSTANCE_NAMED_FN_EXPRESSION_P);
        SubLObject code_mapping_schemas = NIL;
        SubLObject instance_named_fn_colls = NIL;
        SubLObject cdolist_list_var = schema_object_fn_terms;
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            code_mapping_schemas = cons(cycl_utilities.nat_arg1(v_term, UNPROVIDED), code_mapping_schemas);
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        cdolist_list_var = source_schema_object_fn_terms;
        v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            code_mapping_schemas = cons(cycl_utilities.nat_arg2(v_term, UNPROVIDED), code_mapping_schemas);
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        cdolist_list_var = instance_named_fn_terms;
        v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            instance_named_fn_colls = cons(cycl_utilities.nat_arg2(v_term, UNPROVIDED), instance_named_fn_colls);
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        if (NIL != field_decoding_contains_city_named_fn_expressionP(field_decoding)) {
            SubLObject field_isas = sksi_kb_accessors.logical_field_isa(logical_field);
            field_isas = cons($$City, field_isas);
            instance_named_fn_colls = nconc(instance_named_fn_colls, genls.min_cols(field_isas, UNPROVIDED, UNPROVIDED));
        }
        return values(code_mapping_schemas, instance_named_fn_colls);
    }

    public static SubLObject sksi_determine_output_construct_pattern(final SubLObject sentence, final SubLObject required_pattern, final SubLObject input_termnums, final SubLObject output_termnums) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject template = replace_pattern_special_subpatterns_with_forts(required_pattern);
        SubLObject tuple_output = NIL;
        thread.resetMultipleValues();
        final SubLObject template_$28 = determine_output_construct_pattern_template_and_tuple_output(template, input_termnums, output_termnums);
        final SubLObject tuple_output_$29 = thread.secondMultipleValue();
        thread.resetMultipleValues();
        template = template_$28;
        tuple_output = tuple_output_$29;
        return list($TUPLE, tuple_output, template);
    }

    public static SubLObject determine_output_construct_pattern_template_and_tuple_output(final SubLObject pattern, final SubLObject input_termnums, final SubLObject output_termnums) {
        SubLObject template = pattern;
        SubLObject tuple_output = NIL;
        SubLObject cdolist_list_var = input_termnums;
        SubLObject input_termnum = NIL;
        input_termnum = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject token_term = token_cycl_symbol_for_termnum(input_termnum);
            template = list_utilities.replace_nested_nth(template, input_termnum, list($VALUE, token_term));
            cdolist_list_var = cdolist_list_var.rest();
            input_termnum = cdolist_list_var.first();
        } 
        cdolist_list_var = output_termnums;
        SubLObject output_termnum = NIL;
        output_termnum = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject token_term = token_cycl_symbol_for_termnum(output_termnum);
            template = list_utilities.replace_nested_nth(template, output_termnum, list($VALUE, token_term));
            tuple_output = cons(token_term, tuple_output);
            cdolist_list_var = cdolist_list_var.rest();
            output_termnum = cdolist_list_var.first();
        } 
        return values(template, nreverse(tuple_output));
    }

    public static SubLObject sksi_determine_cost_pattern(final SubLObject sense, final SubLObject sk_source, SubLObject cost) {
        if (cost == UNPROVIDED) {
            cost = NIL;
        }
        return NIL != cost ? list($CALL, GET_SKSI_REMOVAL_MODULE_COST, $INPUT, sense, sk_source, cost) : list($CALL, GET_SKSI_REMOVAL_MODULE_COST, $INPUT, sense, sk_source);
    }

    public static SubLObject sksi_removal_module_cost(final SubLObject required_pattern, final SubLObject sentence, final SubLObject logical_schemata, final SubLObject physical_schemata, final SubLObject input_termnums, final SubLObject output_termnums, SubLObject sk_source, SubLObject where_expression, SubLObject from_expression) {
        if (sk_source == UNPROVIDED) {
            sk_source = NIL;
        }
        if (where_expression == UNPROVIDED) {
            where_expression = NIL;
        }
        if (from_expression == UNPROVIDED) {
            from_expression = NIL;
        }
        if (NIL == output_termnums) {
            return $sksi_default_check_cost$.getGlobalValue();
        }
        SubLObject cost = sksi_removal_module_logical_cost(sentence, logical_schemata, input_termnums, output_termnums, sk_source);
        if (NIL != cost) {
            return max($sksi_default_check_cost$.getGlobalValue(), cost);
        }
        cost = sksi_removal_module_physical_cost(sentence, logical_schemata, physical_schemata, input_termnums, output_termnums, sk_source, where_expression, from_expression);
        if (NIL != cost) {
            return max($sksi_default_check_cost$.getGlobalValue(), cost);
        }
        return NIL;
    }

    public static SubLObject sksi_removal_module_logical_cost(final SubLObject sentence, final SubLObject logical_schemata, final SubLObject input_termnums, final SubLObject output_termnums, SubLObject sk_source) {
        if (sk_source == UNPROVIDED) {
            sk_source = NIL;
        }
        final SubLObject lrs_cardinality_wrt_value_gafs = sksi_kb_accessors.logical_schemata_result_set_cardinality_wrt_value_gafs(logical_schemata);
        final SubLObject lrs_cardinality_gafs = sksi_kb_accessors.logical_schemata_result_set_cardinality_gafs(logical_schemata);
        if ((NIL != lrs_cardinality_wrt_value_gafs) || (NIL != lrs_cardinality_gafs)) {
            final SubLObject not_fully_bound_logical_field_indexicals = list_utilities.fast_delete_duplicates(sksi_referenced_logical_field_indexicals(sentence, output_termnums), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject fully_bound_logical_field_indexicals = list_utilities.fast_delete_duplicates(sksi_referenced_logical_field_indexicals(sentence, input_termnums), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject not_fully_bound_logical_fields_list = Mapping.mapcar(symbol_function(LOGICAL_FIELD_FOR_INDEXICAL), not_fully_bound_logical_field_indexicals);
            final SubLObject fully_bound_logical_fields_list = Mapping.mapcar(symbol_function(LOGICAL_FIELD_FOR_INDEXICAL), fully_bound_logical_field_indexicals);
            if (NIL != lrs_cardinality_wrt_value_gafs) {
                sksi_query_utilities.cache_cost_from_lrs_cardinality_wrt_value_gafs(sentence, not_fully_bound_logical_fields_list, fully_bound_logical_fields_list, lrs_cardinality_wrt_value_gafs, sk_source);
            }
            if (NIL != lrs_cardinality_gafs) {
                final SubLObject cost = sksi_query_utilities.guess_cost_from_lrs_cardinality_gafs(not_fully_bound_logical_fields_list, fully_bound_logical_fields_list, lrs_cardinality_gafs);
                return cost;
            }
        }
        return NIL;
    }

    public static SubLObject sksi_removal_module_physical_cost(final SubLObject sentence, final SubLObject logical_schemata, final SubLObject physical_schemata, final SubLObject input_termnums, final SubLObject output_termnums, SubLObject sk_source, SubLObject where_expression, SubLObject from_expression) {
        if (sk_source == UNPROVIDED) {
            sk_source = NIL;
        }
        if (where_expression == UNPROVIDED) {
            where_expression = NIL;
        }
        if (from_expression == UNPROVIDED) {
            from_expression = NIL;
        }
        final SubLObject rs_cardinality_gafs = (NIL != where_expression) ? sksi_kb_accessors.physical_schemata_result_set_cardinality_wXconstraints_gafs(physical_schemata) : sksi_kb_accessors.physical_schemata_result_set_cardinality_gafs(physical_schemata);
        SubLObject cost = NIL;
        if (NIL != rs_cardinality_gafs) {
            final SubLObject not_fully_bound_logical_field_indexicals = list_utilities.fast_delete_duplicates(sksi_referenced_logical_field_indexicals(sentence, output_termnums), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject fully_bound_logical_field_indexicals = list_utilities.fast_delete_duplicates(sksi_referenced_logical_field_indexicals(sentence, input_termnums), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject logical_physical_field_mappings = sksi_infrastructure_utilities.logical_physical_field_mappings_given_logical_physical_schemata(logical_schemata, physical_schemata);
            final SubLObject not_fully_bound_physical_fields_list = substitute_logical_field_indexicals_with_physical_fields_list(not_fully_bound_logical_field_indexicals, logical_physical_field_mappings);
            final SubLObject fully_bound_physical_fields_list = substitute_logical_field_indexicals_with_physical_fields_list(fully_bound_logical_field_indexicals, logical_physical_field_mappings);
            final SubLObject subset_testP = numG(add(length(fully_bound_physical_fields_list), length(not_fully_bound_physical_fields_list)), ONE_INTEGER);
            final SubLObject select_func = (NIL != subset_testP) ? $sym191$FAST_SUBSET_ : $sym192$SETS_EQUAL_;
            final SubLObject where_func = (NIL != subset_testP) ? $sym193$FAST_SUPERSET_ : $sym192$SETS_EQUAL_;
            final SubLObject cycl_for_where_expression = (NIL != where_expression) ? sksi_csql_utilities.csql_to_cycl(where_expression, sk_source, from_expression) : NIL;
            cost = sksi_query_utilities.guess_cost_from_rs_cardinality_gafs(not_fully_bound_physical_fields_list, fully_bound_physical_fields_list, rs_cardinality_gafs, select_func, where_func, cycl_for_where_expression);
        }
        return cost;
    }

    public static SubLObject substitute_logical_field_indexicals_with_physical_fields_list(final SubLObject logical_field_indexicals, final SubLObject logical_physical_field_mappings) {
        SubLObject result = NIL;
        SubLObject cdolist_list_var = logical_field_indexicals;
        SubLObject lfi = NIL;
        lfi = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject lf = sksi_kb_accessors.logical_field_for_indexical(lfi);
            final SubLObject pf_list = dictionary.dictionary_lookup_without_values(logical_physical_field_mappings, lf, UNPROVIDED);
            SubLObject new_pf_list = NIL;
            SubLObject cdolist_list_var_$30 = pf_list;
            SubLObject pf = NIL;
            pf = cdolist_list_var_$30.first();
            while (NIL != cdolist_list_var_$30) {
                new_pf_list = cons(sksi_kb_accessors.pf_for_lfi(pf, lfi), new_pf_list);
                cdolist_list_var_$30 = cdolist_list_var_$30.rest();
                pf = cdolist_list_var_$30.first();
            } 
            result = append(nreverse(new_pf_list), result);
            cdolist_list_var = cdolist_list_var.rest();
            lfi = cdolist_list_var.first();
        } 
        return result;
    }

    public static SubLObject sksi_determine_output_generate_pattern(final SubLObject required_pattern, final SubLObject relevant_physical_field_indexicals, final SubLObject sentence, final SubLObject logical_schemata, final SubLObject physical_schemata, final SubLObject sk_source, final SubLObject input_termnums, final SubLObject output_termnums, final SubLObject content_mt, final SubLObject eval_conditions) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject tuple_expression = sksi_determine_output_csql_tuple_expression(relevant_physical_field_indexicals, sentence, logical_schemata, physical_schemata, sk_source, input_termnums, output_termnums, eval_conditions);
        final SubLObject boolean_csqlP = thread.secondMultipleValue();
        final SubLObject missing_required_fieldsP = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (NIL != tuple_expression) {
            return values(list($CALL, GENERATE_SKSI_SINGLE_LITERAL_COST_RECORDING_ITERATOR, tuple_expression, sk_source, content_mt), boolean_csqlP, missing_required_fieldsP);
        }
        return values(NIL, boolean_csqlP, missing_required_fieldsP);
    }

    public static SubLObject sksi_determine_output_check_pattern(final SubLObject relevant_physical_field_indexicals, final SubLObject sentence, final SubLObject logical_schemata, final SubLObject physical_schemata, final SubLObject sk_source, final SubLObject input_termnums, final SubLObject output_termnums, final SubLObject sense, final SubLObject content_mt, final SubLObject eval_conditions) {
        final SubLObject tuple_expression = sksi_determine_output_csql_tuple_expression(relevant_physical_field_indexicals, sentence, logical_schemata, physical_schemata, sk_source, input_termnums, output_termnums, eval_conditions);
        final SubLObject subpattern = list($CALL, GENERATE_BOOLEAN_FROM_CSQL, tuple_expression, sk_source, content_mt);
        if ($POS == sense) {
            return subpattern;
        }
        return list($CALL, NOT_BOOLEAN, subpattern);
    }

    public static SubLObject sksi_determine_output_csql_tuple_expression(final SubLObject relevant_physical_field_indexicals, final SubLObject sentence, final SubLObject logical_schemata, final SubLObject physical_schemata, final SubLObject sk_source, final SubLObject input_termnums, final SubLObject output_termnums, final SubLObject eval_conditions) {
        final SubLObject required_fields = Mapping.mapcan(PHYSICAL_SCHEMA_REQUIRED_FIELDS, physical_schemata, EMPTY_SUBL_OBJECT_ARRAY);
        final SubLObject raw_terms = sksi_determine_csql_tuple_terms(relevant_physical_field_indexicals);
        final SubLObject csql_output = sksi_csql_generation.sksi_determine_output_csql(sentence, logical_schemata, physical_schemata, sk_source, input_termnums, output_termnums, relevant_physical_field_indexicals, eval_conditions, UNPROVIDED, UNPROVIDED);
        final SubLObject required_fields_in_placeP = required_fields_have_values_in_csqlP(csql_output, required_fields, sk_source);
        if ((NIL != csql_output) && (NIL != required_fields_in_placeP)) {
            return values(list($TUPLE, raw_terms, csql_output), sksi_csql_utilities.boolean_csqlP(csql_output), makeBoolean(NIL == required_fields_in_placeP));
        }
        return values(NIL, NIL, makeBoolean(NIL == required_fields_in_placeP));
    }

    public static SubLObject sksi_determine_csql_tuple_terms(final SubLObject relevant_physical_field_indexicals) {
        return sksi_generate_raw_symbols_for_relevant_physical_field_indexicals(relevant_physical_field_indexicals);
    }

    public static SubLObject required_fields_have_values_in_csqlP(final SubLObject csql, final SubLObject required_fields, final SubLObject sk_source) {
        SubLObject failureP = NIL;
        if (NIL != required_fields) {
            SubLObject select_keyword = NIL;
            SubLObject fields = NIL;
            SubLObject from = NIL;
            destructuring_bind_must_consp(csql, csql, $list198);
            select_keyword = csql.first();
            SubLObject current = csql.rest();
            destructuring_bind_must_consp(current, csql, $list198);
            fields = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, csql, $list198);
            from = current.first();
            current = current.rest();
            final SubLObject where = (current.isCons()) ? current.first() : NIL;
            destructuring_bind_must_listp(current, csql, $list198);
            current = current.rest();
            if (NIL == current) {
                if (NIL != where) {
                    SubLObject current_$32;
                    final SubLObject datum_$31 = current_$32 = where;
                    SubLObject where_keyword = NIL;
                    SubLObject where_clause = NIL;
                    destructuring_bind_must_consp(current_$32, datum_$31, $list199);
                    where_keyword = current_$32.first();
                    current_$32 = current_$32.rest();
                    destructuring_bind_must_consp(current_$32, datum_$31, $list199);
                    where_clause = current_$32.first();
                    current_$32 = current_$32.rest();
                    if (NIL == current_$32) {
                        if (NIL == failureP) {
                            SubLObject csome_list_var = required_fields;
                            SubLObject required_field = NIL;
                            required_field = csome_list_var.first();
                            while ((NIL == failureP) && (NIL != csome_list_var)) {
                                final SubLObject naked_field_name = list(sksi_kb_accessors.physical_field_name(required_field));
                                final SubLObject field_expressions = sksi_conjunctive_removal_module_utilities.get_field_expressions_for_physical_field(required_field, sk_source, UNPROVIDED);
                                SubLObject successP = NIL;
                                if (NIL == successP) {
                                    SubLObject csome_list_var_$33 = where_clause;
                                    SubLObject where_expression = NIL;
                                    where_expression = csome_list_var_$33.first();
                                    while ((NIL == successP) && (NIL != csome_list_var_$33)) {
                                        if (NIL != sksi_conjunctive_removal_module_utilities.where_expression_contains_value_for_field_expressionP(where_expression, naked_field_name)) {
                                            successP = T;
                                        } else
                                            if (NIL == successP) {
                                                SubLObject csome_list_var_$34 = field_expressions;
                                                SubLObject field_expression = NIL;
                                                field_expression = csome_list_var_$34.first();
                                                while ((NIL == successP) && (NIL != csome_list_var_$34)) {
                                                    if (NIL != sksi_conjunctive_removal_module_utilities.where_expression_contains_value_for_field_expressionP(where_expression, field_expression)) {
                                                        successP = T;
                                                    }
                                                    csome_list_var_$34 = csome_list_var_$34.rest();
                                                    field_expression = csome_list_var_$34.first();
                                                } 
                                            }

                                        csome_list_var_$33 = csome_list_var_$33.rest();
                                        where_expression = csome_list_var_$33.first();
                                    } 
                                }
                                failureP = makeBoolean(NIL == successP);
                                csome_list_var = csome_list_var.rest();
                                required_field = csome_list_var.first();
                            } 
                        }
                    } else {
                        cdestructuring_bind_error(datum_$31, $list199);
                    }
                } else {
                    failureP = T;
                }
            } else {
                cdestructuring_bind_error(csql, $list198);
            }
        }
        return makeBoolean(NIL == failureP);
    }

    public static SubLObject sksi_generate_raw_symbols_for_relevant_physical_field_indexicals(final SubLObject relevant_physical_field_indexicals) {
        SubLObject tuple_output = NIL;
        SubLObject cdotimes_end_var;
        SubLObject i;
        for (cdotimes_end_var = length(relevant_physical_field_indexicals), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
            tuple_output = cons(token_raw_symbol_for_termnum(number_utilities.f_1X(i)), tuple_output);
        }
        return nreverse(tuple_output);
    }

    public static SubLObject cycl_token_for_logical_field_indexical(final SubLObject lfi, final SubLObject sentence) {
        final SubLObject termnum = cycl_utilities.arg_positions_bfs(lfi, sentence, symbol_function(EQUAL)).first();
        return token_cycl_symbol_for_termnum(termnum);
    }

    public static SubLObject logical_field_indexical_positions_in_sentence(final SubLObject lfi, final SubLObject sentence) {
        final SubLObject termnum = cycl_utilities.arg_positions_bfs(lfi, sentence, symbol_function(EQUAL)).first();
        return termnum;
    }

    public static SubLObject sksi_referenced_logical_field_indexicals(final SubLObject sentence, final SubLObject termnums) {
        SubLObject logical_field_indexicals = NIL;
        SubLObject cdolist_list_var = termnums;
        SubLObject termnum = NIL;
        termnum = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject lfi = cycl_utilities.formula_arg_position(sentence, termnum, UNPROVIDED);
            if (NIL != sksi_kb_accessors.logical_field_indexical_p(lfi)) {
                logical_field_indexicals = cons(lfi, logical_field_indexicals);
            }
            cdolist_list_var = cdolist_list_var.rest();
            termnum = cdolist_list_var.first();
        } 
        return nreverse(logical_field_indexicals);
    }

    public static SubLObject token_cycl_symbol_for_termnum(final SubLObject termnum) {
        return intern(cconcatenate($str200$CYCL_TERM, format_nil.format_nil_a_no_copy(termnum)), UNPROVIDED);
    }

    public static SubLObject token_raw_symbol_for_termnum(final SubLObject termnum) {
        return intern(cconcatenate($str201$RAW_TERM, format_nil.format_nil_a_no_copy(termnum)), UNPROVIDED);
    }

    public static SubLObject token_raw_symbol_for_cycl_symbol(final SubLObject cycl_symbol) {
        final SubLObject cycl_name = symbol_name(cycl_symbol);
        final SubLObject postfix = string_utilities.substring(cycl_name, FOUR_INTEGER, UNPROVIDED);
        final SubLObject raw_name = cconcatenate($$$RAW, postfix);
        return intern(raw_name, UNPROVIDED);
    }

    public static SubLObject token_cycl_symbol_for_raw_symbol(final SubLObject raw_symbol) {
        final SubLObject raw_name = symbol_name(raw_symbol);
        final SubLObject postfix = string_utilities.substring(raw_name, THREE_INTEGER, UNPROVIDED);
        final SubLObject cycl_name = cconcatenate($$$CYCL, postfix);
        return intern(cycl_name, UNPROVIDED);
    }

    public static SubLObject sentence_termnums_containing_logical_field_indexicals(final SubLObject sentence) {
        final SubLObject logical_field_indexicals_appearing = list_utilities.fast_delete_duplicates(list_utilities.tree_gather_ordered(sentence, LOGICAL_FIELD_INDEXICAL_P, symbol_function(IDENTITY), NIL), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject termnums = NIL;
        SubLObject cdolist_list_var = logical_field_indexicals_appearing;
        SubLObject lfi = NIL;
        lfi = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject positions = cycl_utilities.arg_positions_bfs(lfi, sentence, symbol_function(EQUAL));
            termnums = cons(positions, termnums);
            cdolist_list_var = cdolist_list_var.rest();
            lfi = cdolist_list_var.first();
        } 
        return nreverse(termnums);
    }

    public static SubLObject required_pattern_is_checkP(final SubLObject required_pattern) {
        return makeBoolean((NIL == cycl_utilities.expression_find($NOT_FULLY_BOUND, required_pattern, T, UNPROVIDED, UNPROVIDED)) && (NIL == cycl_utilities.expression_find($UNIFY, required_pattern, T, UNPROVIDED, UNPROVIDED)));
    }

    public static SubLObject virtual_assertion_count() {
        return $virtual_assertion_count$.getGlobalValue();
    }

    public static SubLObject increment_virtual_assertion_count(final SubLObject delta_count) {
        $virtual_assertion_count$.setGlobalValue(add($virtual_assertion_count$.getGlobalValue(), round(delta_count, UNPROVIDED)));
        return $virtual_assertion_count$.getGlobalValue();
    }

    public static SubLObject decrement_virtual_assertion_count(final SubLObject delta_count) {
        $virtual_assertion_count$.setGlobalValue(subtract($virtual_assertion_count$.getGlobalValue(), round(delta_count, UNPROVIDED)));
        return $virtual_assertion_count$.getGlobalValue();
    }

    public static SubLObject clear_virtual_assertion_count() {
        $virtual_assertion_count$.setGlobalValue(ZERO_INTEGER);
        clear_assertion_count_for_mt_table();
        return $virtual_assertion_count$.getGlobalValue();
    }

    public static SubLObject mt_virtual_assertion_count_table() {
        return $mt_virtual_assertion_count_table$.getGlobalValue();
    }

    public static SubLObject increment_assertion_count_for_mt(final SubLObject mt, final SubLObject assertion_count) {
        SubLObject current_count = gethash(mt, $mt_virtual_assertion_count_table$.getGlobalValue(), ZERO_INTEGER);
        current_count = add(current_count, round(assertion_count, UNPROVIDED));
        sethash(mt, $mt_virtual_assertion_count_table$.getGlobalValue(), current_count);
        increment_virtual_assertion_count(assertion_count);
        return current_count;
    }

    public static SubLObject decrement_assertion_count_for_mt(final SubLObject mt, final SubLObject assertion_count) {
        SubLObject current_count = gethash(mt, $mt_virtual_assertion_count_table$.getGlobalValue(), ZERO_INTEGER);
        current_count = subtract(current_count, round(assertion_count, UNPROVIDED));
        if (current_count.isPositive()) {
            sethash(mt, $mt_virtual_assertion_count_table$.getGlobalValue(), current_count);
        } else {
            remhash(mt, $mt_virtual_assertion_count_table$.getGlobalValue());
        }
        decrement_virtual_assertion_count(assertion_count);
        return current_count;
    }

    public static SubLObject clear_assertion_count_for_mt_table() {
        return clrhash($mt_virtual_assertion_count_table$.getGlobalValue());
    }

    public static SubLObject sksi_module_code_mapping_terms(final SubLObject hl_module) {
        return dictionary.dictionary_lookup_without_values($sksi_module_code_mapping_terms_cache$.getGlobalValue(), hl_module, UNPROVIDED);
    }

    public static SubLObject note_sksi_module_code_mapping_terms(final SubLObject hl_module, final SubLObject module_relevant_code_mapping_terms) {
        return dictionary.dictionary_enter($sksi_module_code_mapping_terms_cache$.getGlobalValue(), hl_module, module_relevant_code_mapping_terms);
    }

    public static SubLObject unnote_sksi_module_code_mapping_terms(final SubLObject hl_module) {
        return dictionary.dictionary_remove($sksi_module_code_mapping_terms_cache$.getGlobalValue(), hl_module);
    }

    public static SubLObject clear_sksi_module_code_mapping_terms_cache() {
        return dictionary.clear_dictionary($sksi_module_code_mapping_terms_cache$.getGlobalValue());
    }

    public static SubLObject sksi_module_logical_schemas(final SubLObject hl_module) {
        return dictionary.dictionary_lookup_without_values($sksi_module_logical_schemas_cache$.getGlobalValue(), hl_module, UNPROVIDED);
    }

    public static SubLObject note_sksi_module_logical_schemas(final SubLObject hl_module, final SubLObject module_relevant_logical_schemas) {
        return dictionary.dictionary_enter($sksi_module_logical_schemas_cache$.getGlobalValue(), hl_module, module_relevant_logical_schemas);
    }

    public static SubLObject unnote_sksi_module_logical_schemas(final SubLObject hl_module) {
        return dictionary.dictionary_remove($sksi_module_logical_schemas_cache$.getGlobalValue(), hl_module);
    }

    public static SubLObject clear_sksi_module_logical_schemas_cache() {
        return dictionary.clear_dictionary($sksi_module_logical_schemas_cache$.getGlobalValue());
    }

    public static SubLObject deregister_sksi_supported_browsing() {
        sksi_external_browser_utilities.clear_sksi_supported_browsing_caches();
        clear_sksi_module_code_mapping_terms_cache();
        clear_sksi_module_logical_schemas_cache();
        return NIL;
    }

    public static SubLObject sksi_module_adequate_for_browsing_supportP(final SubLObject required_pattern, final SubLObject predicate_list, final SubLObject relevant_code_mapping_schemas_or_terms) {
        final SubLObject all_variablesP = sksi_fully_unbound_required_pattern_termsP(cycl_utilities.formula_args(required_pattern, UNPROVIDED));
        final SubLObject relevant_code_mapping_arg_positions = (NIL != all_variablesP) ? NIL : Mapping.mapcar(FIRST, relevant_code_mapping_schemas_or_terms);
        if ((NIL == all_variablesP) && (NIL == sksi_fully_unbound_required_pattern_termsP(cycl_utilities.formula_args(list_utilities.remove_nths(relevant_code_mapping_arg_positions, required_pattern), UNPROVIDED)))) {
            return NIL;
        }
        if ((NIL != predicate_list) && (NIL == sksi_fully_bound_required_pattern_termP(cycl_utilities.formula_operator(required_pattern)))) {
            return NIL;
        }
        return values(T, all_variablesP);
    }

    public static SubLObject sksi_fully_bound_required_pattern_termP(final SubLObject required_pattern_term) {
        return list_utilities.not_eq(required_pattern_term, $NOT_FULLY_BOUND);
    }

    public static SubLObject sksi_removal_module_assertion_count(final SubLObject hl_module) {
        SubLObject count = inference_modules.hl_module_cost_expression(hl_module);
        if (NIL == count) {
            count = list_utilities.last_one(inference_modules.hl_module_cost_pattern(hl_module));
        }
        if (count.isNumber()) {
            count = round(count, UNPROVIDED);
        } else {
            count = NIL;
        }
        return count;
    }

    public static SubLObject sksi_module_any_predicates_list_internal(final SubLObject module) {
        return list_utilities.remove_if_not(SKSI_SUPPORTED_PREDICATE_TYPE_P, inference_modules.hl_module_any_predicates(module), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject sksi_module_any_predicates_list(final SubLObject module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return sksi_module_any_predicates_list_internal(module);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, SKSI_MODULE_ANY_PREDICATES_LIST, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), SKSI_MODULE_ANY_PREDICATES_LIST, ONE_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, SKSI_MODULE_ANY_PREDICATES_LIST, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, module, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(sksi_module_any_predicates_list_internal(module)));
            memoization_state.caching_state_put(caching_state, module, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject register_sksi_supported_browsing_for_module(final SubLObject hl_module, final SubLObject meaning_sentence, final SubLObject required_pattern, final SubLObject relevant_code_mapping_schemas, final SubLObject relevant_instance_named_fn_colls, final SubLObject content_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject predicate_list = sksi_module_any_predicates_list(hl_module);
        final SubLObject generic_moduleP = list_utilities.sublisp_boolean(predicate_list);
        thread.resetMultipleValues();
        final SubLObject browsing_supportP = sksi_module_adequate_for_browsing_supportP(required_pattern, predicate_list, append(relevant_code_mapping_schemas, relevant_instance_named_fn_colls));
        final SubLObject normal_term_browsingP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != browsing_supportP) {
            final SubLObject required_mt = inference_modules.hl_module_required_mt(hl_module);
            final SubLObject fort_arguments = keyhash_utilities.fast_intersection(cycl_utilities.formula_forts(required_pattern, UNPROVIDED, UNPROVIDED, UNPROVIDED), cycl_utilities.formula_args(required_pattern, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED);
            final SubLObject count = sksi_removal_module_assertion_count(hl_module);
            if (NIL == predicate_list) {
                final SubLObject pred = inference_modules.hl_module_predicate(hl_module);
                if (NIL != pred) {
                    predicate_list = list(pred);
                }
            }
            if (NIL != normal_term_browsingP) {
                final SubLObject term_arguments = keyhash_utilities.fast_intersection(cycl_utilities.formula_forts(required_pattern, UNPROVIDED, UNPROVIDED, UNPROVIDED), cycl_utilities.formula_args(required_pattern, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if (NIL != count) {
                    increment_virtual_assertion_count(count);
                }
                sksi_sks_predicate_indexing.register_sksi_supported_predicates(predicate_list, meaning_sentence, required_pattern, required_mt, NIL != generic_moduleP ? NIL : count, hl_module);
                sksi_sks_mt_indexing.register_sksi_supported_mt(required_mt, predicate_list, required_pattern, NIL != generic_moduleP ? NIL : count, hl_module);
                final SubLObject fort_count = list_utilities.tree_count_if(FORT_P, fort_arguments, UNPROVIDED);
                if (fort_count.numG($sksi_supported_gaf_argument_browsing_max_term_cutoff$.getDynamicValue(thread))) {
                    if (NIL != $show_sksi_supported_gaf_argument_browsing_skipsP$.getDynamicValue(thread)) {
                        Errors.warn($str212$Too_many_term_arguments___S__for_, fort_count, meaning_sentence);
                    }
                } else
                    if (NIL != term_arguments) {
                        sksi_sks_gaf_arg_indexing.register_sksi_supported_gaf_arguments(fort_arguments, NIL, required_pattern, predicate_list, required_mt, NIL != generic_moduleP ? NIL : count, hl_module);
                    }

            } else
                if (NIL != module_required_pattern_adequate_for_gaf_argument_browsing_supportP(required_pattern)) {
                    final SubLObject code_mapping_terms = gather_cycl_terms_mapped_to_by_code_mapping_schemas(relevant_code_mapping_schemas);
                    final SubLObject instance_named_fn_coll_instances = gather_cycl_terms_mapped_to_by_instance_named_fn_collections(relevant_instance_named_fn_colls, content_mt);
                    final SubLObject all_terms = nconc(code_mapping_terms, instance_named_fn_coll_instances);
                    final SubLObject term_count = list_utilities.tree_count_if(FORT_P, all_terms, UNPROVIDED);
                    if (term_count.numG($sksi_supported_gaf_argument_browsing_max_term_cutoff$.getDynamicValue(thread))) {
                        if (NIL != $show_sksi_supported_gaf_argument_browsing_skipsP$.getDynamicValue(thread)) {
                            Errors.warn($str213$Too_many_code_mapping_terms___S__, term_count, meaning_sentence);
                        }
                    } else
                        if (NIL != all_terms) {
                            sksi_sks_gaf_arg_indexing.register_sksi_supported_gaf_arguments(NIL, all_terms, required_pattern, predicate_list, required_mt, NIL, hl_module);
                            note_sksi_module_code_mapping_terms(hl_module, all_terms);
                        }

                }

            if ((NIL != relevant_code_mapping_schemas) && (NIL != module_required_pattern_adequate_for_gaf_argument_browsing_supportP(required_pattern))) {
                sksi_external_term_browser.register_sksi_supported_external_terms(relevant_code_mapping_schemas, meaning_sentence, required_pattern, predicate_list, required_mt, NIL, hl_module);
                note_sksi_module_logical_schemas(hl_module, relevant_code_mapping_schemas);
            }
        }
        return NIL;
    }

    public static SubLObject module_required_pattern_adequate_for_gaf_argument_browsing_supportP(final SubLObject required_pattern) {
        return list_utilities.occurs_at_most_n_timesP($FULLY_BOUND, required_pattern.rest(), ONE_INTEGER, UNPROVIDED);
    }

    public static SubLObject gather_cycl_terms_mapped_to_by_code_mapping_schemas_internal(final SubLObject code_mapping_schemas) {
        SubLObject code_mapping_terms = NIL;
        SubLObject cdolist_list_var = code_mapping_schemas;
        SubLObject arg_pos_code_mapping_schemas_pair = NIL;
        arg_pos_code_mapping_schemas_pair = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = arg_pos_code_mapping_schemas_pair;
            SubLObject arg_pos = NIL;
            SubLObject code_mapping_schemas_$35 = NIL;
            destructuring_bind_must_consp(current, datum, $list215);
            arg_pos = current.first();
            current = current.rest();
            destructuring_bind_must_consp(current, datum, $list215);
            code_mapping_schemas_$35 = current.first();
            current = current.rest();
            if (NIL == current) {
                SubLObject cdolist_list_var_$36 = code_mapping_schemas_$35;
                SubLObject code_mapping_schema = NIL;
                code_mapping_schema = cdolist_list_var_$36.first();
                while (NIL != cdolist_list_var_$36) {
                    if (arg_pos.numG(ZERO_INTEGER)) {
                        final SubLObject cycl_terms = sksi_kb_accessors.cycl_terms_mapped_to_by_code_mapping_schema(code_mapping_schema);
                        if (NIL != cycl_terms) {
                            code_mapping_terms = nconc(code_mapping_terms, list(list(arg_pos, cycl_terms)));
                        }
                    }
                    cdolist_list_var_$36 = cdolist_list_var_$36.rest();
                    code_mapping_schema = cdolist_list_var_$36.first();
                } 
            } else {
                cdestructuring_bind_error(datum, $list215);
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg_pos_code_mapping_schemas_pair = cdolist_list_var.first();
        } 
        return code_mapping_terms;
    }

    public static SubLObject gather_cycl_terms_mapped_to_by_code_mapping_schemas(final SubLObject code_mapping_schemas) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return gather_cycl_terms_mapped_to_by_code_mapping_schemas_internal(code_mapping_schemas);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, GATHER_CYCL_TERMS_MAPPED_TO_BY_CODE_MAPPING_SCHEMAS, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), GATHER_CYCL_TERMS_MAPPED_TO_BY_CODE_MAPPING_SCHEMAS, ONE_INTEGER, NIL, EQUAL, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, GATHER_CYCL_TERMS_MAPPED_TO_BY_CODE_MAPPING_SCHEMAS, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, code_mapping_schemas, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(gather_cycl_terms_mapped_to_by_code_mapping_schemas_internal(code_mapping_schemas)));
            memoization_state.caching_state_put(caching_state, code_mapping_schemas, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject gather_cycl_terms_mapped_to_by_instance_named_fn_collections(final SubLObject instance_named_fn_colls, final SubLObject content_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(content_mt), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(content_mt), thread);
            SubLObject cdolist_list_var = instance_named_fn_colls;
            SubLObject arg_pos_colls_pair = NIL;
            arg_pos_colls_pair = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = arg_pos_colls_pair;
                SubLObject arg_pos = NIL;
                SubLObject colls = NIL;
                destructuring_bind_must_consp(current, datum, $list216);
                arg_pos = current.first();
                current = current.rest();
                destructuring_bind_must_consp(current, datum, $list216);
                colls = current.first();
                current = current.rest();
                if (NIL == current) {
                    SubLObject cdolist_list_var_$37 = colls;
                    SubLObject coll = NIL;
                    coll = cdolist_list_var_$37.first();
                    while (NIL != cdolist_list_var_$37) {
                        final SubLObject cycl_terms = sksi_infrastructure_utilities.all_fort_instances_memoized(coll, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                        if (NIL != cycl_terms) {
                            result = nconc(result, list(list(arg_pos, cycl_terms)));
                        }
                        cdolist_list_var_$37 = cdolist_list_var_$37.rest();
                        coll = cdolist_list_var_$37.first();
                    } 
                } else {
                    cdestructuring_bind_error(datum, $list216);
                }
                cdolist_list_var = cdolist_list_var.rest();
                arg_pos_colls_pair = cdolist_list_var.first();
            } 
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    public static SubLObject deregister_sksi_supported_browsing_for_module(final SubLObject hl_module) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject required_pattern = sksi_module_simple_required_pattern(hl_module);
        SubLObject predicate_list = sksi_module_any_predicates_list(hl_module);
        final SubLObject code_mapping_terms = sksi_module_code_mapping_terms(hl_module);
        final SubLObject logical_schemas = sksi_module_logical_schemas(hl_module);
        final SubLObject generic_moduleP = list_utilities.sublisp_boolean(predicate_list);
        thread.resetMultipleValues();
        final SubLObject browsing_supportP = sksi_module_adequate_for_browsing_supportP(required_pattern, predicate_list, append(code_mapping_terms, logical_schemas));
        final SubLObject normal_term_browsingP = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (NIL != browsing_supportP) {
            final SubLObject mt = inference_modules.hl_module_required_mt_result(hl_module);
            final SubLObject count = sksi_removal_module_assertion_count(hl_module);
            if (NIL == predicate_list) {
                predicate_list = list(inference_modules.hl_module_predicate(hl_module));
            }
            if (NIL != normal_term_browsingP) {
                if (NIL != count) {
                    decrement_virtual_assertion_count(count);
                }
                final SubLObject term_arguments = keyhash_utilities.fast_intersection(NIL != required_pattern ? cycl_utilities.formula_forts(required_pattern, UNPROVIDED, UNPROVIDED, UNPROVIDED) : NIL, cycl_utilities.formula_args(required_pattern, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject cdolist_list_var = predicate_list;
                SubLObject predicate = NIL;
                predicate = cdolist_list_var.first();
                while (NIL != cdolist_list_var) {
                    if (NIL != sksi_infrastructure_utilities.sksi_supported_predicate_type_p(predicate, mt)) {
                        sksi_sks_predicate_indexing.deregister_sksi_supported_predicate(predicate, mt, hl_module, NIL != generic_moduleP ? NIL : count);
                        sksi_sks_mt_indexing.deregister_sksi_supported_mt(mt, predicate, hl_module, NIL != generic_moduleP ? NIL : count);
                        if (NIL != term_arguments) {
                            sksi_sks_gaf_arg_indexing.deregister_sksi_supported_gaf_arguments(term_arguments, NIL, required_pattern, predicate, mt, hl_module, NIL != generic_moduleP ? NIL : count);
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    predicate = cdolist_list_var.first();
                } 
            } else
                if (NIL != module_required_pattern_adequate_for_gaf_argument_browsing_supportP(required_pattern)) {
                    SubLObject cdolist_list_var2 = predicate_list;
                    SubLObject predicate2 = NIL;
                    predicate2 = cdolist_list_var2.first();
                    while (NIL != cdolist_list_var2) {
                        if (NIL != sksi_infrastructure_utilities.sksi_supported_predicate_type_p(predicate2, mt)) {
                            sksi_sks_gaf_arg_indexing.deregister_sksi_supported_gaf_arguments(NIL, code_mapping_terms, required_pattern, predicate2, mt, hl_module, NIL);
                        }
                        unnote_sksi_module_code_mapping_terms(hl_module);
                        cdolist_list_var2 = cdolist_list_var2.rest();
                        predicate2 = cdolist_list_var2.first();
                    } 
                }

            if ((NIL != logical_schemas) && (NIL != module_required_pattern_adequate_for_gaf_argument_browsing_supportP(required_pattern))) {
                SubLObject cdolist_list_var2 = predicate_list;
                SubLObject predicate2 = NIL;
                predicate2 = cdolist_list_var2.first();
                while (NIL != cdolist_list_var2) {
                    if (NIL != sksi_infrastructure_utilities.sksi_supported_predicate_type_p(predicate2, mt)) {
                        sksi_external_term_browser.deregister_sksi_supported_external_terms(logical_schemas, predicate2, mt, hl_module, NIL);
                    }
                    unnote_sksi_module_logical_schemas(hl_module);
                    cdolist_list_var2 = cdolist_list_var2.rest();
                    predicate2 = cdolist_list_var2.first();
                } 
            }
        }
        return NIL;
    }

    public static SubLObject sksi_removal_module_generation_error(final SubLObject cycl, final SubLObject error_message) {
        if (NIL != sksi_debugging.sksi_ignore_registration_errorsP()) {
            return NIL;
        }
        if (NIL != sksi_debugging.sksi_warn_on_registration_errorsP()) {
            return Errors.warn(error_message);
        }
        if (NIL != sksi_debugging.sksi_break_on_registration_errorsP()) {
            final SubLObject cont_string = cconcatenate($str217$Continue_without_generating_remov, format_nil.format_nil_a_no_copy(cycl));
            return Errors.cerror(cont_string, error_message);
        }
        return NIL;
    }

    public static SubLObject sksi_meaning_sentence_gaf_infos_error(final SubLObject meaning_sentence_gaf, final SubLObject error_message) {
        return sksi_removal_module_generation_error(meaning_sentence_gaf, error_message);
    }

    public static SubLObject declare_sksi_removal_module_generation_file() {
        declareFunction(me, "sksi_module_p", "SKSI-MODULE-P", 1, 0, false);
        declareMacro(me, "do_sksi_modules", "DO-SKSI-MODULES");
        declareMacro(me, "do_sksi_modules_list", "DO-SKSI-MODULES-LIST");
        declareFunction(me, "sksi_modules_count", "SKSI-MODULES-COUNT", 0, 0, false);
        declareFunction(me, "some_sksi_single_literal_removal_module_registeredP", "SOME-SKSI-SINGLE-LITERAL-REMOVAL-MODULE-REGISTERED?", 0, 0, false);
        declareFunction(me, "note_sksi_module", "NOTE-SKSI-MODULE", 1, 0, false);
        declareFunction(me, "un_note_sksi_module", "UN-NOTE-SKSI-MODULE", 1, 0, false);
        declareFunction(me, "un_note_all_sksi_modules", "UN-NOTE-ALL-SKSI-MODULES", 0, 0, false);
        declareFunction(me, "note_sksi_module_supports", "NOTE-SKSI-MODULE-SUPPORTS", 2, 0, false);
        declareFunction(me, "un_note_sksi_module_supports", "UN-NOTE-SKSI-MODULE-SUPPORTS", 1, 0, false);
        declareFunction(me, "un_note_all_sksi_module_supports", "UN-NOTE-ALL-SKSI-MODULE-SUPPORTS", 0, 0, false);
        declareFunction(me, "sksi_module_supports", "SKSI-MODULE-SUPPORTS", 1, 0, false);
        declareFunction(me, "note_sksi_module_simple_required_pattern", "NOTE-SKSI-MODULE-SIMPLE-REQUIRED-PATTERN", 2, 0, false);
        declareFunction(me, "un_note_sksi_module_simple_required_pattern", "UN-NOTE-SKSI-MODULE-SIMPLE-REQUIRED-PATTERN", 1, 0, false);
        declareFunction(me, "un_note_all_sksi_module_simple_required_patterns", "UN-NOTE-ALL-SKSI-MODULE-SIMPLE-REQUIRED-PATTERNS", 0, 0, false);
        declareFunction(me, "sksi_module_simple_required_pattern", "SKSI-MODULE-SIMPLE-REQUIRED-PATTERN", 1, 0, false);
        declareFunction(me, "note_multiply_indexed_conditional_meaning_sentence_for_sks", "NOTE-MULTIPLY-INDEXED-CONDITIONAL-MEANING-SENTENCE-FOR-SKS", 2, 0, false);
        declareFunction(me, "un_note_multiply_indexed_conditional_meaning_sentence_for_sks", "UN-NOTE-MULTIPLY-INDEXED-CONDITIONAL-MEANING-SENTENCE-FOR-SKS", 2, 0, false);
        declareFunction(me, "multiply_indexed_conditional_meaning_sentence_noted_for_sksP", "MULTIPLY-INDEXED-CONDITIONAL-MEANING-SENTENCE-NOTED-FOR-SKS?", 2, 0, false);
        declareFunction(me, "un_note_all_multiply_indexed_conditional_meaning_sentences", "UN-NOTE-ALL-MULTIPLY-INDEXED-CONDITIONAL-MEANING-SENTENCES", 0, 0, false);
        declareFunction(me, "note_sksi_module_multiply_indexed_conditional_meaning_sentence", "NOTE-SKSI-MODULE-MULTIPLY-INDEXED-CONDITIONAL-MEANING-SENTENCE", 2, 0, false);
        declareFunction(me, "un_note_sksi_module_multiply_indexed_conditional_meaning_sentence", "UN-NOTE-SKSI-MODULE-MULTIPLY-INDEXED-CONDITIONAL-MEANING-SENTENCE", 1, 0, false);
        declareFunction(me, "un_note_all_sksi_module_multiply_indexed_conditional_meaning_sentences", "UN-NOTE-ALL-SKSI-MODULE-MULTIPLY-INDEXED-CONDITIONAL-MEANING-SENTENCES", 0, 0, false);
        declareFunction(me, "note_sksi_module_by_sks", "NOTE-SKSI-MODULE-BY-SKS", 2, 0, false);
        declareFunction(me, "un_note_sksi_modules_by_sks", "UN-NOTE-SKSI-MODULES-BY-SKS", 1, 0, false);
        declareFunction(me, "clear_sksi_modules_by_sks_cache", "CLEAR-SKSI-MODULES-BY-SKS-CACHE", 0, 0, false);
        declareFunction(me, "un_note_sksi_modules_by_sks_for_module", "UN-NOTE-SKSI-MODULES-BY-SKS-FOR-MODULE", 1, 0, false);
        declareFunction(me, "sksi_modules_by_sks_get_skses", "SKSI-MODULES-BY-SKS-GET-SKSES", 0, 0, false);
        declareFunction(me, "sksi_modules_by_sks_find_modules", "SKSI-MODULES-BY-SKS-FIND-MODULES", 1, 0, false);
        declareFunction(me, "sksi_modules_by_sks_find_modules_with_children", "SKSI-MODULES-BY-SKS-FIND-MODULES-WITH-CHILDREN", 1, 0, false);
        declareMacro(me, "do_code_mapping_sks_cache", "DO-CODE-MAPPING-SKS-CACHE");
        declareFunction(me, "note_code_mapping_sks", "NOTE-CODE-MAPPING-SKS", 4, 0, false);
        declareFunction(me, "unnote_code_mapping_sks", "UNNOTE-CODE-MAPPING-SKS", 4, 0, false);
        declareFunction(me, "clear_code_mapping_sks_cache", "CLEAR-CODE-MAPPING-SKS-CACHE", 0, 0, false);
        declareFunction(me, "code_mapping_sks_cache_lookup", "CODE-MAPPING-SKS-CACHE-LOOKUP", 1, 0, false);
        declareFunction(me, "code_mapping_forward_rules_to_repropagate_internal", "CODE-MAPPING-FORWARD-RULES-TO-REPROPAGATE-INTERNAL", 0, 0, false);
        declareFunction(me, "code_mapping_forward_rules_to_repropagate", "CODE-MAPPING-FORWARD-RULES-TO-REPROPAGATE", 0, 0, false);
        declareFunction(me, "sksi_assert_code_mapping_sks_content", "SKSI-ASSERT-CODE-MAPPING-SKS-CONTENT", 4, 0, false);
        declareFunction(me, "sksi_unassert_code_mapping_sks_content", "SKSI-UNASSERT-CODE-MAPPING-SKS-CONTENT", 4, 0, false);
        declareFunction(me, "isa_removal_module_p", "ISA-REMOVAL-MODULE-P", 1, 0, false);
        declareFunction(me, "add_isa_sks_term_to_cycl_term_mts", "ADD-ISA-SKS-TERM-TO-CYCL-TERM-MTS", 1, 0, false);
        declareFunction(me, "clear_isa_sks_term_to_cycl_term_mts", "CLEAR-ISA-SKS-TERM-TO-CYCL-TERM-MTS", 0, 0, false);
        declareFunction(me, "isa_sks_term_to_cycl_term_mt_relevantP", "ISA-SKS-TERM-TO-CYCL-TERM-MT-RELEVANT?", 0, 0, false);
        declareFunction(me, "add_isa_sks_term_to_cycl_term_store", "ADD-ISA-SKS-TERM-TO-CYCL-TERM-STORE", 2, 0, false);
        declareFunction(me, "clear_isa_sks_term_to_cycl_term_store", "CLEAR-ISA-SKS-TERM-TO-CYCL-TERM-STORE", 0, 0, false);
        declareFunction(me, "any_sks_term_spec_to_cycl_term_in_relevant_mtP", "ANY-SKS-TERM-SPEC-TO-CYCL-TERM-IN-RELEVANT-MT?", 1, 0, false);
        declareFunction(me, "all_sksi_relevant_rewrite_specs_for_term", "ALL-SKSI-RELEVANT-REWRITE-SPECS-FOR-TERM", 1, 0, false);
        declareFunction(me, "all_sksi_relevant_rewrite_specs_for_term_int_internal", "ALL-SKSI-RELEVANT-REWRITE-SPECS-FOR-TERM-INT-INTERNAL", 2, 0, false);
        declareFunction(me, "all_sksi_relevant_rewrite_specs_for_term_int", "ALL-SKSI-RELEVANT-REWRITE-SPECS-FOR-TERM-INT", 2, 0, false);
        declareFunction(me, "all_sksi_relevant_rewrite_isas", "ALL-SKSI-RELEVANT-REWRITE-ISAS", 0, 0, false);
        declareFunction(me, "all_sksi_relevant_rewrite_isas_int_internal", "ALL-SKSI-RELEVANT-REWRITE-ISAS-INT-INTERNAL", 1, 0, false);
        declareFunction(me, "all_sksi_relevant_rewrite_isas_int", "ALL-SKSI-RELEVANT-REWRITE-ISAS-INT", 1, 0, false);
        declareFunction(me, "add_isa_sks_term_to_cycl_term", "ADD-ISA-SKS-TERM-TO-CYCL-TERM", 2, 0, false);
        declareFunction(me, "clear_isa_sks_term_to_cycl_term", "CLEAR-ISA-SKS-TERM-TO-CYCL-TERM", 0, 0, false);
        declareFunction(me, "store_sksi_isa_module_rewrite_info", "STORE-SKSI-ISA-MODULE-REWRITE-INFO", 2, 1, false);
        declareFunction(me, "genls_rewrite_supported_term_p", "GENLS-REWRITE-SUPPORTED-TERM-P", 2, 0, false);
        declareFunction(me, "gather_code_mapping_arg2s", "GATHER-CODE-MAPPING-ARG2S", 2, 0, false);
        declareFunction(me, "recalculate_sksi_isa_module_rewrite_info", "RECALCULATE-SKSI-ISA-MODULE-REWRITE-INFO", 0, 0, false);
        declareFunction(me, "filtered_sksi_predP", "FILTERED-SKSI-PRED?", 1, 0, false);
        declareFunction(me, "add_to_meaning_sentence_mts", "ADD-TO-MEANING-SENTENCE-MTS", 1, 0, false);
        declareFunction(me, "clear_meaning_sentence_mts", "CLEAR-MEANING-SENTENCE-MTS", 0, 0, false);
        declareFunction(me, "any_sksi_meaning_sentence_mt_relevantP", "ANY-SKSI-MEANING-SENTENCE-MT-RELEVANT?", 0, 0, false);
        declareFunction(me, "meaning_sentence_pred_store_count", "MEANING-SENTENCE-PRED-STORE-COUNT", 0, 0, false);
        declareFunction(me, "meaning_sentence_predP", "MEANING-SENTENCE-PRED?", 1, 0, false);
        declareFunction(me, "add_meaning_sentence_pred_to_store", "ADD-MEANING-SENTENCE-PRED-TO-STORE", 2, 0, false);
        declareFunction(me, "clear_meaning_sentence_pred_store", "CLEAR-MEANING-SENTENCE-PRED-STORE", 0, 0, false);
        declareFunction(me, "any_sksi_meaning_sentence_spec_predP", "ANY-SKSI-MEANING-SENTENCE-SPEC-PRED?", 1, 0, false);
        declareFunction(me, "any_sksi_meaning_sentence_spec_inverseP", "ANY-SKSI-MEANING-SENTENCE-SPEC-INVERSE?", 1, 0, false);
        declareFunction(me, "all_sksi_relevant_rewrite_spec_preds_for_pred", "ALL-SKSI-RELEVANT-REWRITE-SPEC-PREDS-FOR-PRED", 1, 0, false);
        declareFunction(me, "all_sksi_relevant_rewrite_spec_preds_for_pred_int_internal", "ALL-SKSI-RELEVANT-REWRITE-SPEC-PREDS-FOR-PRED-INT-INTERNAL", 2, 0, false);
        declareFunction(me, "all_sksi_relevant_rewrite_spec_preds_for_pred_int", "ALL-SKSI-RELEVANT-REWRITE-SPEC-PREDS-FOR-PRED-INT", 2, 0, false);
        declareFunction(me, "all_sksi_relevant_rewrite_spec_inverses_for_pred", "ALL-SKSI-RELEVANT-REWRITE-SPEC-INVERSES-FOR-PRED", 1, 0, false);
        declareFunction(me, "all_sksi_relevant_rewrite_spec_inverses_for_pred_int_internal", "ALL-SKSI-RELEVANT-REWRITE-SPEC-INVERSES-FOR-PRED-INT-INTERNAL", 2, 0, false);
        declareFunction(me, "all_sksi_relevant_rewrite_spec_inverses_for_pred_int", "ALL-SKSI-RELEVANT-REWRITE-SPEC-INVERSES-FOR-PRED-INT", 2, 0, false);
        declareFunction(me, "add_meaning_sentence_pred", "ADD-MEANING-SENTENCE-PRED", 2, 0, false);
        declareFunction(me, "clear_meaning_sentence_preds", "CLEAR-MEANING-SENTENCE-PREDS", 0, 0, false);
        declareFunction(me, "store_sksi_module_rewrite_pred_info", "STORE-SKSI-MODULE-REWRITE-PRED-INFO", 1, 0, false);
        declareFunction(me, "recalculate_sksi_rewrite_pred_info", "RECALCULATE-SKSI-REWRITE-PRED-INFO", 0, 0, false);
        declareFunction(me, "store_sksi_module_rewrite_info", "STORE-SKSI-MODULE-REWRITE-INFO", 3, 0, false);
        declareFunction(me, "recalculate_sksi_rewrite_info", "RECALCULATE-SKSI-REWRITE-INFO", 0, 0, false);
        declareFunction(me, "clear_sksi_rewrite_info", "CLEAR-SKSI-REWRITE-INFO", 0, 0, false);
        declareFunction(me, "register_sksi_removal_modules_for_sks", "REGISTER-SKSI-REMOVAL-MODULES-FOR-SKS", 1, 3, false);
        declareFunction(me, "register_sksi_removal_modules_for_just_sks", "REGISTER-SKSI-REMOVAL-MODULES-FOR-JUST-SKS", 1, 4, false);
        declareFunction(me, "repropagate_code_mapping_forward_rules", "REPROPAGATE-CODE-MAPPING-FORWARD-RULES", 0, 0, false);
        declareFunction(me, "deregister_sksi_removal_modules_for_sks", "DEREGISTER-SKSI-REMOVAL-MODULES-FOR-SKS", 1, 3, false);
        declareFunction(me, "deregister_sksi_removal_modules_for_just_sks", "DEREGISTER-SKSI-REMOVAL-MODULES-FOR-JUST-SKS", 1, 2, false);
        declareFunction(me, "deregister_sksi_removal_module", "DEREGISTER-SKSI-REMOVAL-MODULE", 1, 1, false);
        declareFunction(me, "deregister_all_sksi_removal_modules", "DEREGISTER-ALL-SKSI-REMOVAL-MODULES", 0, 0, false);
        declareFunction(me, "module_info_p", "MODULE-INFO-P", 1, 0, false);
        declareFunction(me, "new_module_info", "NEW-MODULE-INFO", 0, 0, false);
        declareFunction(me, "module_info_add", "MODULE-INFO-ADD", 3, 0, false);
        declareFunction(me, "module_info_push", "MODULE-INFO-PUSH", 3, 0, false);
        declareFunction(me, "module_info_get", "MODULE-INFO-GET", 2, 1, false);
        declareFunction(me, "module_info_remove", "MODULE-INFO-REMOVE", 2, 0, false);
        declareFunction(me, "module_info_to_inference_module_info", "MODULE-INFO-TO-INFERENCE-MODULE-INFO", 1, 0, false);
        declareFunction(me, "inference_removal_module_info", "INFERENCE-REMOVAL-MODULE-INFO", 1, 0, false);
        declareFunction(me, "determine_module_info_name", "DETERMINE-MODULE-INFO-NAME", 1, 0, false);
        declareFunction(me, "sk_source_module_infos", "SK-SOURCE-MODULE-INFOS", 5, 0, false);
        declareFunction(me, "physical_schema_module_infos", "PHYSICAL-SCHEMA-MODULE-INFOS", 6, 0, false);
        declareFunction(me, "logical_schema_module_infos", "LOGICAL-SCHEMA-MODULE-INFOS", 6, 0, false);
        declareFunction(me, "meaning_sentence_gaf_module_infos", "MEANING-SENTENCE-GAF-MODULE-INFOS", 6, 0, false);
        declareFunction(me, "negated_atomic_meaning_sentence_module_infos", "NEGATED-ATOMIC-MEANING-SENTENCE-MODULE-INFOS", 6, 0, false);
        declareFunction(me, "pos_atomic_meaning_sentence_module_infos", "POS-ATOMIC-MEANING-SENTENCE-MODULE-INFOS", 6, 4, false);
        declareFunction(me, "conditional_meaning_sentence_gaf_module_infos", "CONDITIONAL-MEANING-SENTENCE-GAF-MODULE-INFOS", 7, 0, false);
        declareFunction(me, "condition_output_pattern", "CONDITION-OUTPUT-PATTERN", 8, 0, false);
        declareFunction(me, "sksi_get_any_predicates_pattern_internal", "SKSI-GET-ANY-PREDICATES-PATTERN-INTERNAL", 3, 0, false);
        declareFunction(me, "sksi_get_any_predicates_pattern", "SKSI-GET-ANY-PREDICATES-PATTERN", 3, 0, false);
        declareFunction(me, "sksi_too_many_unbound_required_pattern_termsP", "SKSI-TOO-MANY-UNBOUND-REQUIRED-PATTERN-TERMS?", 3, 0, false);
        declareFunction(me, "sksi_too_many_unbound_required_pattern_terms_intP", "SKSI-TOO-MANY-UNBOUND-REQUIRED-PATTERN-TERMS-INT?", 3, 0, false);
        declareFunction(me, "antecedent_sentence_contains_restrictive_constraintP", "ANTECEDENT-SENTENCE-CONTAINS-RESTRICTIVE-CONSTRAINT?", 1, 0, false);
        declareFunction(me, "non_logical_field_indexical_p", "NON-LOGICAL-FIELD-INDEXICAL-P", 1, 0, false);
        declareFunction(me, "sksi_doomed_unless_arg_boundP", "SKSI-DOOMED-UNLESS-ARG-BOUND?", 2, 0, false);
        declareFunction(me, "sksi_valid_removal_module_required_patternP", "SKSI-VALID-REMOVAL-MODULE-REQUIRED-PATTERN?", 4, 0, false);
        declareFunction(me, "pos_atomic_meaning_sentence_required_pattern_infos", "POS-ATOMIC-MEANING-SENTENCE-REQUIRED-PATTERN-INFOS", 6, 1, false);
        declareFunction(me, "sksi_fully_unbound_required_pattern_termsP", "SKSI-FULLY-UNBOUND-REQUIRED-PATTERN-TERMS?", 1, 0, false);
        declareFunction(me, "sksi_not_fully_bound_required_pattern_predicateP", "SKSI-NOT-FULLY-BOUND-REQUIRED-PATTERN-PREDICATE?", 1, 0, false);
        declareFunction(me, "has_duplicate_keysP", "HAS-DUPLICATE-KEYS?", 1, 0, false);
        declareFunction(me, "compute_boundedness_permutations_for_logical_field_indexical_termnums", "COMPUTE-BOUNDEDNESS-PERMUTATIONS-FOR-LOGICAL-FIELD-INDEXICAL-TERMNUMS", 2, 0, false);
        declareFunction(me, "distinct_logical_field_termnum_bindingsP", "DISTINCT-LOGICAL-FIELD-TERMNUM-BINDINGS?", 2, 0, false);
        declareFunction(me, "compute_meaning_sentence_required_patterns", "COMPUTE-MEANING-SENTENCE-REQUIRED-PATTERNS", 3, 0, false);
        declareFunction(me, "replace_pattern_parts", "REPLACE-PATTERN-PARTS", 2, 0, false);
        declareFunction(me, "replace_pattern_narts_with_nat_subpatterns", "REPLACE-PATTERN-NARTS-WITH-NAT-SUBPATTERNS", 1, 0, false);
        declareFunction(me, "make_nat_subpattern", "MAKE-NAT-SUBPATTERN", 1, 0, false);
        declareFunction(me, "nat_subpattern_p", "NAT-SUBPATTERN-P", 1, 0, false);
        declareFunction(me, "nartify_nat_pattern", "NARTIFY-NAT-PATTERN", 1, 0, false);
        declareFunction(me, "disjunctive_subpattern_p", "DISJUNCTIVE-SUBPATTERN-P", 1, 0, false);
        declareFunction(me, "make_disjunctive_subpattern", "MAKE-DISJUNCTIVE-SUBPATTERN", 1, 0, false);
        declareFunction(me, "make_unify_subpattern", "MAKE-UNIFY-SUBPATTERN", 1, 0, false);
        declareFunction(me, "unify_subpattern_p", "UNIFY-SUBPATTERN-P", 1, 0, false);
        declareFunction(me, "replace_pattern_nauts_with_unify_subpatterns", "REPLACE-PATTERN-NAUTS-WITH-UNIFY-SUBPATTERNS", 1, 0, false);
        declareFunction(me, "replace_pattern_forts_with_unify_subpatterns", "REPLACE-PATTERN-FORTS-WITH-UNIFY-SUBPATTERNS", 1, 0, false);
        declareFunction(me, "non_sentential_relation_fort_p_internal", "NON-SENTENTIAL-RELATION-FORT-P-INTERNAL", 1, 0, false);
        declareFunction(me, "non_sentential_relation_fort_p", "NON-SENTENTIAL-RELATION-FORT-P", 1, 0, false);
        declareFunction(me, "replace_pattern_special_subpatterns_with_forts", "REPLACE-PATTERN-SPECIAL-SUBPATTERNS-WITH-FORTS", 1, 0, false);
        declareFunction(me, "replace_pattern_special_subpatterns_with_anything", "REPLACE-PATTERN-SPECIAL-SUBPATTERNS-WITH-ANYTHING", 1, 0, false);
        declareFunction(me, "add_cmls_pruning_to_required_pattern", "ADD-CMLS-PRUNING-TO-REQUIRED-PATTERN", 5, 0, false);
        declareFunction(me, "clear_generate_sksi_slrm_required_function", "CLEAR-GENERATE-SKSI-SLRM-REQUIRED-FUNCTION", 0, 0, false);
        declareFunction(me, "remove_generate_sksi_slrm_required_function", "REMOVE-GENERATE-SKSI-SLRM-REQUIRED-FUNCTION", 1, 0, false);
        declareFunction(me, "generate_sksi_slrm_required_function_internal", "GENERATE-SKSI-SLRM-REQUIRED-FUNCTION-INTERNAL", 1, 0, false);
        declareFunction(me, "generate_sksi_slrm_required_function", "GENERATE-SKSI-SLRM-REQUIRED-FUNCTION", 1, 0, false);
        declareFunction(me, "determine_sk_source_required_func_name", "DETERMINE-SK-SOURCE-REQUIRED-FUNC-NAME", 1, 0, false);
        declareFunction(me, "sksi_only_predicateP_internal", "SKSI-ONLY-PREDICATE?-INTERNAL", 1, 0, false);
        declareFunction(me, "sksi_only_predicateP", "SKSI-ONLY-PREDICATE?", 1, 0, false);
        declareFunction(me, "required_info_module_info", "REQUIRED-INFO-MODULE-INFO", 9, 0, false);
        declareFunction(me, "sksi_removal_module_completeness", "SKSI-REMOVAL-MODULE-COMPLETENESS", 2, 0, false);
        declareFunction(me, "sksi_make_documentation_string_from_required_pattern_and_sense", "SKSI-MAKE-DOCUMENTATION-STRING-FROM-REQUIRED-PATTERN-AND-SENSE", 2, 0, false);
        declareFunction(me, "sksi_determine_input_extract_pattern", "SKSI-DETERMINE-INPUT-EXTRACT-PATTERN", 4, 0, false);
        declareFunction(me, "sksi_determine_output_verify_pattern", "SKSI-DETERMINE-OUTPUT-VERIFY-PATTERN", 1, 0, false);
        declareFunction(me, "sksi_determine_input_verify_pattern", "SKSI-DETERMINE-INPUT-VERIFY-PATTERN", 1, 0, false);
        declareFunction(me, "sksi_determine_input_encode_pattern", "SKSI-DETERMINE-INPUT-ENCODE-PATTERN", 6, 0, false);
        declareFunction(me, "sksi_reformulatable_via_templateP", "SKSI-REFORMULATABLE-VIA-TEMPLATE?", 4, 0, false);
        declareFunction(me, "sksi_determine_field_input_encode_pattern", "SKSI-DETERMINE-FIELD-INPUT-ENCODE-PATTERN", 6, 0, false);
        declareFunction(me, "sksi_determine_output_decode_pattern", "SKSI-DETERMINE-OUTPUT-DECODE-PATTERN", 6, 0, false);
        declareFunction(me, "sksi_determine_field_output_decode_pattern", "SKSI-DETERMINE-FIELD-OUTPUT-DECODE-PATTERN", 6, 0, false);
        declareFunction(me, "sksi_determine_field_output_decode_pattern_int", "SKSI-DETERMINE-FIELD-OUTPUT-DECODE-PATTERN-INT", 4, 0, false);
        declareFunction(me, "dummy_external_term_denoting_function_expression_p", "DUMMY-EXTERNAL-TERM-DENOTING-FUNCTION-EXPRESSION-P", 2, 0, false);
        declareFunction(me, "gather_external_term_denoting_expressions_of_type_in_field_decoding", "GATHER-EXTERNAL-TERM-DENOTING-EXPRESSIONS-OF-TYPE-IN-FIELD-DECODING", 2, 0, false);
        declareFunction(me, "field_decoding_contains_city_named_fn_expressionP", "FIELD-DECODING-CONTAINS-CITY-NAMED-FN-EXPRESSION?", 1, 0, false);
        declareFunction(me, "gather_code_mapping_schemas_mentioned_in_field_decoding", "GATHER-CODE-MAPPING-SCHEMAS-MENTIONED-IN-FIELD-DECODING", 2, 0, false);
        declareFunction(me, "sksi_determine_output_construct_pattern", "SKSI-DETERMINE-OUTPUT-CONSTRUCT-PATTERN", 4, 0, false);
        declareFunction(me, "determine_output_construct_pattern_template_and_tuple_output", "DETERMINE-OUTPUT-CONSTRUCT-PATTERN-TEMPLATE-AND-TUPLE-OUTPUT", 3, 0, false);
        declareFunction(me, "sksi_determine_cost_pattern", "SKSI-DETERMINE-COST-PATTERN", 2, 1, false);
        declareFunction(me, "sksi_removal_module_cost", "SKSI-REMOVAL-MODULE-COST", 6, 3, false);
        declareFunction(me, "sksi_removal_module_logical_cost", "SKSI-REMOVAL-MODULE-LOGICAL-COST", 4, 1, false);
        declareFunction(me, "sksi_removal_module_physical_cost", "SKSI-REMOVAL-MODULE-PHYSICAL-COST", 5, 3, false);
        declareFunction(me, "substitute_logical_field_indexicals_with_physical_fields_list", "SUBSTITUTE-LOGICAL-FIELD-INDEXICALS-WITH-PHYSICAL-FIELDS-LIST", 2, 0, false);
        declareFunction(me, "sksi_determine_output_generate_pattern", "SKSI-DETERMINE-OUTPUT-GENERATE-PATTERN", 10, 0, false);
        declareFunction(me, "sksi_determine_output_check_pattern", "SKSI-DETERMINE-OUTPUT-CHECK-PATTERN", 10, 0, false);
        declareFunction(me, "sksi_determine_output_csql_tuple_expression", "SKSI-DETERMINE-OUTPUT-CSQL-TUPLE-EXPRESSION", 8, 0, false);
        declareFunction(me, "sksi_determine_csql_tuple_terms", "SKSI-DETERMINE-CSQL-TUPLE-TERMS", 1, 0, false);
        declareFunction(me, "required_fields_have_values_in_csqlP", "REQUIRED-FIELDS-HAVE-VALUES-IN-CSQL?", 3, 0, false);
        declareFunction(me, "sksi_generate_raw_symbols_for_relevant_physical_field_indexicals", "SKSI-GENERATE-RAW-SYMBOLS-FOR-RELEVANT-PHYSICAL-FIELD-INDEXICALS", 1, 0, false);
        declareFunction(me, "cycl_token_for_logical_field_indexical", "CYCL-TOKEN-FOR-LOGICAL-FIELD-INDEXICAL", 2, 0, false);
        declareFunction(me, "logical_field_indexical_positions_in_sentence", "LOGICAL-FIELD-INDEXICAL-POSITIONS-IN-SENTENCE", 2, 0, false);
        declareFunction(me, "sksi_referenced_logical_field_indexicals", "SKSI-REFERENCED-LOGICAL-FIELD-INDEXICALS", 2, 0, false);
        declareFunction(me, "token_cycl_symbol_for_termnum", "TOKEN-CYCL-SYMBOL-FOR-TERMNUM", 1, 0, false);
        declareFunction(me, "token_raw_symbol_for_termnum", "TOKEN-RAW-SYMBOL-FOR-TERMNUM", 1, 0, false);
        declareFunction(me, "token_raw_symbol_for_cycl_symbol", "TOKEN-RAW-SYMBOL-FOR-CYCL-SYMBOL", 1, 0, false);
        declareFunction(me, "token_cycl_symbol_for_raw_symbol", "TOKEN-CYCL-SYMBOL-FOR-RAW-SYMBOL", 1, 0, false);
        declareFunction(me, "sentence_termnums_containing_logical_field_indexicals", "SENTENCE-TERMNUMS-CONTAINING-LOGICAL-FIELD-INDEXICALS", 1, 0, false);
        declareFunction(me, "required_pattern_is_checkP", "REQUIRED-PATTERN-IS-CHECK?", 1, 0, false);
        declareFunction(me, "virtual_assertion_count", "VIRTUAL-ASSERTION-COUNT", 0, 0, false);
        declareFunction(me, "increment_virtual_assertion_count", "INCREMENT-VIRTUAL-ASSERTION-COUNT", 1, 0, false);
        declareFunction(me, "decrement_virtual_assertion_count", "DECREMENT-VIRTUAL-ASSERTION-COUNT", 1, 0, false);
        declareFunction(me, "clear_virtual_assertion_count", "CLEAR-VIRTUAL-ASSERTION-COUNT", 0, 0, false);
        declareFunction(me, "mt_virtual_assertion_count_table", "MT-VIRTUAL-ASSERTION-COUNT-TABLE", 0, 0, false);
        declareFunction(me, "increment_assertion_count_for_mt", "INCREMENT-ASSERTION-COUNT-FOR-MT", 2, 0, false);
        declareFunction(me, "decrement_assertion_count_for_mt", "DECREMENT-ASSERTION-COUNT-FOR-MT", 2, 0, false);
        declareFunction(me, "clear_assertion_count_for_mt_table", "CLEAR-ASSERTION-COUNT-FOR-MT-TABLE", 0, 0, false);
        declareFunction(me, "sksi_module_code_mapping_terms", "SKSI-MODULE-CODE-MAPPING-TERMS", 1, 0, false);
        declareFunction(me, "note_sksi_module_code_mapping_terms", "NOTE-SKSI-MODULE-CODE-MAPPING-TERMS", 2, 0, false);
        declareFunction(me, "unnote_sksi_module_code_mapping_terms", "UNNOTE-SKSI-MODULE-CODE-MAPPING-TERMS", 1, 0, false);
        declareFunction(me, "clear_sksi_module_code_mapping_terms_cache", "CLEAR-SKSI-MODULE-CODE-MAPPING-TERMS-CACHE", 0, 0, false);
        declareFunction(me, "sksi_module_logical_schemas", "SKSI-MODULE-LOGICAL-SCHEMAS", 1, 0, false);
        declareFunction(me, "note_sksi_module_logical_schemas", "NOTE-SKSI-MODULE-LOGICAL-SCHEMAS", 2, 0, false);
        declareFunction(me, "unnote_sksi_module_logical_schemas", "UNNOTE-SKSI-MODULE-LOGICAL-SCHEMAS", 1, 0, false);
        declareFunction(me, "clear_sksi_module_logical_schemas_cache", "CLEAR-SKSI-MODULE-LOGICAL-SCHEMAS-CACHE", 0, 0, false);
        declareFunction(me, "deregister_sksi_supported_browsing", "DEREGISTER-SKSI-SUPPORTED-BROWSING", 0, 0, false);
        declareFunction(me, "sksi_module_adequate_for_browsing_supportP", "SKSI-MODULE-ADEQUATE-FOR-BROWSING-SUPPORT?", 3, 0, false);
        declareFunction(me, "sksi_fully_bound_required_pattern_termP", "SKSI-FULLY-BOUND-REQUIRED-PATTERN-TERM?", 1, 0, false);
        declareFunction(me, "sksi_removal_module_assertion_count", "SKSI-REMOVAL-MODULE-ASSERTION-COUNT", 1, 0, false);
        declareFunction(me, "sksi_module_any_predicates_list_internal", "SKSI-MODULE-ANY-PREDICATES-LIST-INTERNAL", 1, 0, false);
        declareFunction(me, "sksi_module_any_predicates_list", "SKSI-MODULE-ANY-PREDICATES-LIST", 1, 0, false);
        declareFunction(me, "register_sksi_supported_browsing_for_module", "REGISTER-SKSI-SUPPORTED-BROWSING-FOR-MODULE", 6, 0, false);
        declareFunction(me, "module_required_pattern_adequate_for_gaf_argument_browsing_supportP", "MODULE-REQUIRED-PATTERN-ADEQUATE-FOR-GAF-ARGUMENT-BROWSING-SUPPORT?", 1, 0, false);
        declareFunction(me, "gather_cycl_terms_mapped_to_by_code_mapping_schemas_internal", "GATHER-CYCL-TERMS-MAPPED-TO-BY-CODE-MAPPING-SCHEMAS-INTERNAL", 1, 0, false);
        declareFunction(me, "gather_cycl_terms_mapped_to_by_code_mapping_schemas", "GATHER-CYCL-TERMS-MAPPED-TO-BY-CODE-MAPPING-SCHEMAS", 1, 0, false);
        declareFunction(me, "gather_cycl_terms_mapped_to_by_instance_named_fn_collections", "GATHER-CYCL-TERMS-MAPPED-TO-BY-INSTANCE-NAMED-FN-COLLECTIONS", 2, 0, false);
        declareFunction(me, "deregister_sksi_supported_browsing_for_module", "DEREGISTER-SKSI-SUPPORTED-BROWSING-FOR-MODULE", 1, 0, false);
        declareFunction(me, "sksi_removal_module_generation_error", "SKSI-REMOVAL-MODULE-GENERATION-ERROR", 2, 0, false);
        declareFunction(me, "sksi_meaning_sentence_gaf_infos_error", "SKSI-MEANING-SENTENCE-GAF-INFOS-ERROR", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_sksi_removal_module_generation_file() {
        deflexical("*SKSI-MODULES*", SubLTrampolineFile.maybeDefault($sksi_modules$, $sksi_modules$, () -> set.new_set(UNPROVIDED, UNPROVIDED)));
        defparameter("*SKSI-BROWSING-ENABLED*", T);
        deflexical("*SKSI-MODULE-SUPPORTS*", SubLTrampolineFile.maybeDefault($sksi_module_supports$, $sksi_module_supports$, () -> dictionary.new_dictionary(UNPROVIDED, UNPROVIDED)));
        deflexical("*SKSI-MODULE-SIMPLE-REQUIRED-PATTERN*", SubLTrampolineFile.maybeDefault($sksi_module_simple_required_pattern$, $sksi_module_simple_required_pattern$, () -> dictionary.new_dictionary(UNPROVIDED, UNPROVIDED)));
        deflexical("*SKS-MULTIPLY-INDEXED-CONDITIONAL-MEANING-SENTENCE-CACHE*", SubLTrampolineFile.maybeDefault($sks_multiply_indexed_conditional_meaning_sentence_cache$, $sks_multiply_indexed_conditional_meaning_sentence_cache$, () -> dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED)));
        deflexical("*SKSI-MODULE-MULTIPLY-INDEXED-CONDITIONAL-MEANING-SENTENCE-CACHE*", SubLTrampolineFile.maybeDefault($sksi_module_multiply_indexed_conditional_meaning_sentence_cache$, $sksi_module_multiply_indexed_conditional_meaning_sentence_cache$, () -> dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED)));
        deflexical("*SKSI-MODULES-BY-SKS*", SubLTrampolineFile.maybeDefault($sksi_modules_by_sks$, $sksi_modules_by_sks$, () -> dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED)));
        deflexical("*SKSI-CODE-MAPPING-SKS-CACHE*", SubLTrampolineFile.maybeDefault($sksi_code_mapping_sks_cache$, $sksi_code_mapping_sks_cache$, () -> dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED)));
        deflexical("*ISA-SKS-TERM-TO-CYCL-TERM-MTS*", SubLTrampolineFile.maybeDefault($isa_sks_term_to_cycl_term_mts$, $isa_sks_term_to_cycl_term_mts$, NIL));
        deflexical("*ISA-SKS-TERM-TO-CYCL-TERM-STORE*", SubLTrampolineFile.maybeDefault($isa_sks_term_to_cycl_term_store$, $isa_sks_term_to_cycl_term_store$, NIL));
        deflexical("*FILTERED-SKSI-PREDS*", $list34);
        deflexical("*MEANING-SENTENCE-MTS*", SubLTrampolineFile.maybeDefault($meaning_sentence_mts$, $meaning_sentence_mts$, NIL));
        deflexical("*MEANING-SENTENCE-PRED-STORE*", SubLTrampolineFile.maybeDefault($meaning_sentence_pred_store$, $meaning_sentence_pred_store$, NIL));
        defparameter("*SKS-PREFERENCE-MODULES-COUNT*", NIL);
        defparameter("*SKS-PRUNE-MODULES-COUNT*", NIL);
        deflexical("*SKSI-SPECIFIC-MODULE-PROPERTIES*", $list46);
        deflexical("*GENERATE-SKSI-SLRM-REQUIRED-FUNCTION-CACHING-STATE*", NIL);
        deflexical("*SKSI-DEFAULT-CHECK-COST*", $expensive_hl_module_check_cost$.getGlobalValue());
        deflexical("*VIRTUAL-ASSERTION-COUNT*", SubLTrampolineFile.maybeDefault($virtual_assertion_count$, $virtual_assertion_count$, ZERO_INTEGER));
        deflexical("*MT-VIRTUAL-ASSERTION-COUNT-TABLE*", SubLTrampolineFile.maybeDefault($mt_virtual_assertion_count_table$, $mt_virtual_assertion_count_table$, () -> make_hash_table(SIXTEEN_INTEGER, UNPROVIDED, UNPROVIDED)));
        deflexical("*SKSI-MODULE-CODE-MAPPING-TERMS-CACHE*", SubLTrampolineFile.maybeDefault($sksi_module_code_mapping_terms_cache$, $sksi_module_code_mapping_terms_cache$, () -> dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED)));
        deflexical("*SKSI-MODULE-LOGICAL-SCHEMAS-CACHE*", SubLTrampolineFile.maybeDefault($sksi_module_logical_schemas_cache$, $sksi_module_logical_schemas_cache$, () -> dictionary.new_dictionary(symbol_function(EQ), UNPROVIDED)));
        defparameter("*SKSI-SUPPORTED-GAF-ARGUMENT-BROWSING-MAX-TERM-CUTOFF*", $int$5000);
        defparameter("*SHOW-SKSI-SUPPORTED-GAF-ARGUMENT-BROWSING-SKIPS?*", NIL);
        return NIL;
    }

    public static SubLObject setup_sksi_removal_module_generation_file() {
        declare_defglobal($sksi_modules$);
        declare_defglobal($sksi_module_supports$);
        declare_defglobal($sksi_module_simple_required_pattern$);
        declare_defglobal($sks_multiply_indexed_conditional_meaning_sentence_cache$);
        declare_defglobal($sksi_module_multiply_indexed_conditional_meaning_sentence_cache$);
        declare_defglobal($sksi_modules_by_sks$);
        declare_defglobal($sksi_code_mapping_sks_cache$);
        memoization_state.note_memoized_function(CODE_MAPPING_FORWARD_RULES_TO_REPROPAGATE);
        declare_defglobal($isa_sks_term_to_cycl_term_mts$);
        declare_defglobal($isa_sks_term_to_cycl_term_store$);
        memoization_state.note_memoized_function(ALL_SKSI_RELEVANT_REWRITE_SPECS_FOR_TERM_INT);
        memoization_state.note_memoized_function(ALL_SKSI_RELEVANT_REWRITE_ISAS_INT);
        declare_defglobal($meaning_sentence_mts$);
        declare_defglobal($meaning_sentence_pred_store$);
        memoization_state.note_memoized_function(ALL_SKSI_RELEVANT_REWRITE_SPEC_PREDS_FOR_PRED_INT);
        memoization_state.note_memoized_function(ALL_SKSI_RELEVANT_REWRITE_SPEC_INVERSES_FOR_PRED_INT);
        memoization_state.note_memoized_function(SKSI_GET_ANY_PREDICATES_PATTERN);
        memoization_state.note_memoized_function(NON_SENTENTIAL_RELATION_FORT_P);
        memoization_state.note_globally_cached_function(GENERATE_SKSI_SLRM_REQUIRED_FUNCTION);
        memoization_state.note_memoized_function($sym123$SKSI_ONLY_PREDICATE_);
        note_funcall_helper_function($sym173$SKSI_REFORMULATABLE_VIA_TEMPLATE_);
        declare_defglobal($virtual_assertion_count$);
        declare_defglobal($mt_virtual_assertion_count_table$);
        declare_defglobal($sksi_module_code_mapping_terms_cache$);
        declare_defglobal($sksi_module_logical_schemas_cache$);
        memoization_state.note_memoized_function(SKSI_MODULE_ANY_PREDICATES_LIST);
        memoization_state.note_memoized_function(GATHER_CYCL_TERMS_MAPPED_TO_BY_CODE_MAPPING_SCHEMAS);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_sksi_removal_module_generation_file();
    }

    @Override
    public void initializeVariables() {
        init_sksi_removal_module_generation_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_sksi_removal_module_generation_file();
    }

    
}

/**
 * Total time: 1288 ms
 */
