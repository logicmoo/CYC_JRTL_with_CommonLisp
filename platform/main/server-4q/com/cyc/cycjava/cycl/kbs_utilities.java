/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl;


import static com.cyc.cycjava.cycl.constant_handles.constant_p;
import static com.cyc.cycjava.cycl.constant_handles.do_constants_table;
import static com.cyc.cycjava.cycl.constant_handles.reader_make_constant_shell;
import static com.cyc.cycjava.cycl.control_vars.set_build_kb_loaded;
import static com.cyc.cycjava.cycl.cyc_kernel.cyc_assert;
import static com.cyc.cycjava.cycl.cyc_kernel.cyc_remove_all_arguments;
import static com.cyc.cycjava.cycl.cyc_kernel.cyc_unassert;
import static com.cyc.cycjava.cycl.el_utilities.ist_sentence_p;
import static com.cyc.cycjava.cycl.el_utilities.make_binary_formula;
import static com.cyc.cycjava.cycl.fi.assertion_hl_formula;
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
import static com.cyc.cycjava.cycl.iteration.iteration_next_without_values_macro_helper;
import static com.cyc.cycjava.cycl.kbs_identification.clear_kbs_state;
import static com.cyc.cycjava.cycl.kbs_identification.do_post_identify_kbs_assertions_fns;
import static com.cyc.cycjava.cycl.kbs_identification.do_post_identify_kbs_forts_fns;
import static com.cyc.cycjava.cycl.kbs_identification.identify_kbs_assertions;
import static com.cyc.cycjava.cycl.kbs_identification.identify_kbs_deductions;
import static com.cyc.cycjava.cycl.kbs_identification.identify_kbs_forts;
import static com.cyc.cycjava.cycl.kbs_identification.kbs_assertion_p;
import static com.cyc.cycjava.cycl.kbs_identification.kbs_assertion_table;
import static com.cyc.cycjava.cycl.kbs_identification.kbs_constant_p;
import static com.cyc.cycjava.cycl.kbs_identification.kbs_fort_count;
import static com.cyc.cycjava.cycl.kbs_identification.kbs_fort_p;
import static com.cyc.cycjava.cycl.kbs_identification.mark_kbs_assertion;
import static com.cyc.cycjava.cycl.kbs_identification.prepare_kbs_kb_destructive;
import static com.cyc.cycjava.cycl.kbs_identification.unmark_kbs_assertion;
import static com.cyc.cycjava.cycl.kbs_identification.unmark_kbs_fort;
import static com.cyc.cycjava.cycl.kbs_identification.unmark_kbs_fort_and_dependents;
import static com.cyc.cycjava.cycl.nl_trie_staleness_test.declare_nl_trie_staleness_acceptable;
import static com.cyc.cycjava.cycl.partitions.$load_partition_weaken_hl_supports$;
import static com.cyc.cycjava.cycl.partitions.load_partition_clean;
import static com.cyc.cycjava.cycl.set.new_set;
import static com.cyc.cycjava.cycl.set.set_add;
import static com.cyc.cycjava.cycl.set.set_memberP;
import static com.cyc.cycjava.cycl.string_utilities.non_empty_stringP;
import static com.cyc.cycjava.cycl.string_utilities.starts_with;
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
import static com.cyc.cycjava.cycl.utilities_macros.note_funcall_helper_function;
import static com.cyc.cycjava.cycl.utilities_macros.note_percent_progress;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_percent_progress_preamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_postamble;
import static com.cyc.cycjava.cycl.utilities_macros.noting_progress_preamble;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.append;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.cons;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.list;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.listS;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.nth;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.funcall;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.gethash_without_values;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.make_hash_table;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables.sethash;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.abs;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.add;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.subtract;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.format;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.cconcatenate;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.length;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.nreverse;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.position;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.symbol_function;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.$is_thread_performing_cleanupP$;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.current_process;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.get_universal_time;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types.stringp;
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
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.getf;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.member;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader.bq_cons;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.close;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.force_output;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.terpri;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.write_string;
import static com.cyc.tool.subl.util.SubLFiles.declareFunction;
import static com.cyc.tool.subl.util.SubLFiles.declareMacro;
import static com.cyc.tool.subl.util.SubLFiles.deflexical;
import static com.cyc.tool.subl.util.SubLFiles.defparameter;
import static com.cyc.tool.subl.util.SubLFiles.defvar;

import com.cyc.cycjava.cycl.inference.harness.after_adding;
import com.cyc.cycjava.cycl.sbhl.sbhl_cache;
import com.cyc.cycjava.cycl.sbhl.sbhl_caching_policies;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_declarations;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapper;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.util.SubLFiles.LispMethod;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      KBS-UTILITIES
 * source file: /cyc/top/cycl/kbs-utilities.lisp
 * created:     2019/07/03 17:37:50
 */
public final class kbs_utilities extends SubLTranslatedFile implements V12 {
    /**
     * Write the image containing the KB subset assertions and an empty FHT pointing to the assertions.
     */
    @LispMethod(comment = "Write the image containing the KB subset assertions and an empty FHT pointing to the assertions.")
    public static final SubLObject prepare_assertion_gloss_generation(SubLObject kb_filename, SubLObject fht_filename, SubLObject tmp_dir) {
        if (kb_filename == UNPROVIDED) {
            kb_filename = $str_alt48$kb_and_kbs_kb_load;
        }
        if (fht_filename == UNPROVIDED) {
            fht_filename = $str_alt49$assertion_gloss_fht;
        }
        if (tmp_dir == UNPROVIDED) {
            tmp_dir = $str_alt50$_home_jantos_space_;
        }
        Mapper.write_image(kb_filename, UNPROVIDED);
        assertion_gloss_cache.create_empty_assertion_gloss_cache(fht_filename, tmp_dir);
        return NIL;
    }

    /**
     * Since skolem computation is expensive set this to t to skip it.
     * For KB subsets where it is knon that no skolem terms are wanted there is no sacrifice of correctness.
     */
    // defparameter
    @LispMethod(comment = "Since skolem computation is expensive set this to t to skip it.\r\nFor KB subsets where it is knon that no skolem terms are wanted there is no sacrifice of correctness.\nSince skolem computation is expensive set this to t to skip it.\nFor KB subsets where it is knon that no skolem terms are wanted there is no sacrifice of correctness.\ndefparameter")
    public static final SubLSymbol $skip_compute_kbs_skolemsP$ = makeSymbol("*SKIP-COMPUTE-KBS-SKOLEMS?*");

    public static final SubLFile me = new kbs_utilities();

 public static final String myName = "com.cyc.cycjava.cycl.kbs_utilities";


    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $postpone_kb_hl_support_bootstrappingP$ = makeSymbol("*POSTPONE-KB-HL-SUPPORT-BOOTSTRAPPING?*");

    // defvar
    // The definition of the current KB subset used by the KBS process.
    /**
     * The definition of the current KB subset used by the KBS process.
     */
    @LispMethod(comment = "The definition of the current KB subset used by the KBS process.\ndefvar")
    public static final SubLSymbol $kbs_definition$ = makeSymbol("*KBS-DEFINITION*");

    // deflexical
    // The valid properties for a KBS definition.
    /**
     * The valid properties for a KBS definition.
     */
    @LispMethod(comment = "The valid properties for a KBS definition.\ndeflexical")
    private static final SubLSymbol $kbs_definition_properties$ = makeSymbol("*KBS-DEFINITION-PROPERTIES*");

    // defvar
    // The valid properties for each section of a KBS definition.
    /**
     * The valid properties for each section of a KBS definition.
     */
    @LispMethod(comment = "The valid properties for each section of a KBS definition.\ndefvar")
    private static final SubLSymbol $kbs_definition_section_properties$ = makeSymbol("*KBS-DEFINITION-SECTION-PROPERTIES*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $opencyc_kbs_term_queue$ = makeSymbol("*OPENCYC-KBS-TERM-QUEUE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $opencyc_kbs_assertion_queue$ = makeSymbol("*OPENCYC-KBS-ASSERTION-QUEUE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $opencyc_kbs_prettystring_term_queue$ = makeSymbol("*OPENCYC-KBS-PRETTYSTRING-TERM-QUEUE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    public static final SubLSymbol $opencyc_kbs_prettystring_assert_queue$ = makeSymbol("*OPENCYC-KBS-PRETTYSTRING-ASSERT-QUEUE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $opencyc_kbs_supported_prettystring_preds$ = makeSymbol("*OPENCYC-KBS-SUPPORTED-PRETTYSTRING-PREDS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $opencyc_kbs_supported_prettystring_mts$ = makeSymbol("*OPENCYC-KBS-SUPPORTED-PRETTYSTRING-MTS*");

    // deflexical
    /**
     * Sources for #$synonymousExternalConcept assertions that are permitted in
     * OpenCyc. Others will be removed.
     */
    @LispMethod(comment = "Sources for #$synonymousExternalConcept assertions that are permitted in\r\nOpenCyc. Others will be removed.\ndeflexical\nSources for #$synonymousExternalConcept assertions that are permitted in\nOpenCyc. Others will be removed.")
    private static final SubLSymbol $opencyc_permitted_sources$ = makeSymbol("*OPENCYC-PERMITTED-SOURCES*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLSymbol $sym0$NON_EMPTY_STRING_ = makeSymbol("NON-EMPTY-STRING?");

    static private final SubLString $$$Continue = makeString("Continue");

    static private final SubLString $str2$The_KBS_definition_is_not_valid_ = makeString("The KBS definition is not valid.");

    private static final SubLInteger $int$10000 = makeInteger(10000);

    private static final SubLList $list4 = list(cons($EVAL, $CODE));

    static private final SubLList $list5 = list($NAME, makeKeyword("SECTIONS"), makeKeyword("PREREMOVED-ASSERTIONS"), makeKeyword("PRERUN-FNS"), makeKeyword("POST-IDENTIFY-FORTS-FNS"), makeKeyword("POST-IDENTIFY-ASSERTIONS-FNS"), makeKeyword("INHERITED-STORES"));

    static private final SubLList $list6 = list(new SubLObject[]{ makeKeyword("COLLECTIONS"), $SETS, makeKeyword("OMISSION-COLLECTIONS"), makeKeyword("OMISSION-PREDICATE"), makeKeyword("DEFINITIONAL-PREDICATE-SET"), makeKeyword("DEFINITIONAL-RULE-PREDICATE"), makeKeyword("KBQ-QUERY-SETS"), makeKeyword("OMISSION-TERMS"), makeKeyword("OMISSION-ASSERTIONS"), makeKeyword("RETAINED-TERMS"), makeKeyword("RETAINED-ASSERTIONS"), makeKeyword("OMISSION-PREDICATE-EXTENT") });

    private static final SubLString $str7$_kbs_definition__is_null = makeString("*kbs-definition* is null");

    private static final SubLString $str8$_kbs_definition__has_section_usin = makeString("*kbs-definition* has section using invalid property ~A");

    private static final SubLString $str10$_kbs_definition__is_not_a_plist_ = makeString("*kbs-definition* is not a plist.");

    private static final SubLSymbol $POST_IDENTIFY_FORTS_FNS = makeKeyword("POST-IDENTIFY-FORTS-FNS");

    private static final SubLSymbol $POST_IDENTIFY_ASSERTIONS_FNS = makeKeyword("POST-IDENTIFY-ASSERTIONS-FNS");

    private static final SubLString $str17$A_section_is_using_invalid_proper = makeString("A section is using invalid property ~A");

    private static final SubLString $str18$A_Section_is_not_a_plist___A = makeString("A Section is not a plist: ~A");

    private static final SubLString $str19$No_sections_are_defined_ = makeString("No sections are defined.");

    private static final SubLList $list20 = list(list(makeSymbol("KBS-SECTION")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list22 = list(list(makeSymbol("GET-KBS-SECTIONS")));

    private static final SubLSymbol $DEFINITIONAL_PREDICATE_SET = makeKeyword("DEFINITIONAL-PREDICATE-SET");

    private static final SubLSymbol $DEFINITIONAL_RULE_PREDICATE = makeKeyword("DEFINITIONAL-RULE-PREDICATE");

    private static final SubLSymbol $KBQ_QUERY_SETS = makeKeyword("KBQ-QUERY-SETS");

    private static final SubLSymbol $OMISSION_PREDICATE_EXTENT = makeKeyword("OMISSION-PREDICATE-EXTENT");

    private static final SubLString $str38$Unknown_inherited_store__A__dont_ = makeString("Unknown inherited store ~A: dont know how to save.");

    private static final SubLString $str39$Unknown_inherited_store__A_____sk = makeString("Unknown inherited store ~A ... skipping.");

    private static final SubLSymbol KBS_RECONSTITUTE_BROADER_TERM_GAF_SPECIFICS = makeSymbol("KBS-RECONSTITUTE-BROADER-TERM-GAF-SPECIFICS");

    private static final SubLSymbol KBS_EXTRACT_BROADER_TERM_GAF_SPECIFICS = makeSymbol("KBS-EXTRACT-BROADER-TERM-GAF-SPECIFICS");

    private static final SubLString $str43$Whoa__someone_already_populated_t = makeString("Whoa, someone already populated the queue. There are ~A entries!");

    private static final SubLList $list45 = list(makeSymbol("SENTENCE"), makeSymbol("MT"), makeSymbol("STRENGTH"));

    private static final SubLList $list46 = list(makeSymbol("PRED"), makeSymbol("ARG1"), makeSymbol("ARG2"));



    private static final SubLString $str48$This_transform_filters_is_not_app = makeString("This transform filters is not applicable to GAF ~A.");

    private static final SubLString $str49$GAF__A_has_a_non_standard_EL_stre = makeString("GAF ~A has a non-standard EL strength ~A.");

    private static final SubLList $list50 = list(makeSymbol("ARG1"), makeSymbol("ARG2"), makeSymbol("MT"), makeSymbol("CODE"));



    private static final SubLString $str53$Unmarking_forts_with_only_include = makeString("Unmarking forts with only included #$termOfUnit assertions");

    private static final SubLString $str55$unmarking__A__ = makeString("unmarking ~A~%");

    private static final SubLString $str56$Unmarked__A_forts_and__A_assertio = makeString("Unmarked ~A forts and ~A assertions~%");

    private static final SubLSymbol OPENCYC_KBS_RECONSTITUTE_PRETTY_STRING_IST = makeSymbol("OPENCYC-KBS-RECONSTITUTE-PRETTY-STRING-IST");

    private static final SubLSymbol OPENCYC_KBS_SIMPLIFY_PRETTY_STRING_IST = makeSymbol("OPENCYC-KBS-SIMPLIFY-PRETTY-STRING-IST");

    private static final SubLList $list59 = list(reader_make_constant_shell("prettyString"), reader_make_constant_shell("prettyString-Canonical"));

    private static final SubLList $list60 = list(reader_make_constant_shell("EnglishMt"));

    private static final SubLList $list61 = list(makeSymbol("IST-PRED"), makeSymbol("MT"), list(makeSymbol("PRETTY-PRED"), makeSymbol("TERM"), makeSymbol("STRING")));



    private static final SubLString $str63$Do_not_know_how_to_simplify_sente = makeString("Do not know how to simplify sentence ~S.");

    private static final SubLList $list64 = list(makeSymbol("MT-CODE"), makeSymbol("PRED-CODE"), makeSymbol("TERM"), makeSymbol("STRING"));

    private static final SubLString $str65$Asserting_pretty_string_assertion = makeString("Asserting pretty string assertions for all ");

    private static final SubLString $$$_KBS_FORTs = makeString(" KBS FORTs");

    private static final SubLString $str67$Cannot_be_used_without_identifyin = makeString("Cannot be used without identifying KBS forts first.");

    private static final SubLSymbol $sym68$KBS_PRETTY_STRING_FORT_ = makeSymbol("KBS-PRETTY-STRING-FORT?");

    private static final SubLSymbol PRETTY_STRING_ASSERT_SENTENCE_ACCUMULATOR_RESET = makeSymbol("PRETTY-STRING-ASSERT-SENTENCE-ACCUMULATOR-RESET");

    private static final SubLSymbol PRETTY_STRING_ASSERT_SENTENCE_ACCUMULATOR_ADD = makeSymbol("PRETTY-STRING-ASSERT-SENTENCE-ACCUMULATOR-ADD");

    private static final SubLSymbol PRETTY_STRING_ASSERT_SENTENCE_ACCUMULATOR_SIZE = makeSymbol("PRETTY-STRING-ASSERT-SENTENCE-ACCUMULATOR-SIZE");

    private static final SubLSymbol PRETTY_STRING_ASSERT_SENTENCE_ACCUMULATOR_CONTENTS = makeSymbol("PRETTY-STRING-ASSERT-SENTENCE-ACCUMULATOR-CONTENTS");

    private static final SubLSymbol PRETTY_STRING_ASSERT_SENTENCE_ACCUMULATOR_ITERATOR = makeSymbol("PRETTY-STRING-ASSERT-SENTENCE-ACCUMULATOR-ITERATOR");

    private static final SubLString $str74$Reset_operation_not_supported_for = makeString("Reset operation not supported for pretty string assert sentence accumulators.");

    private static final SubLSymbol IST_SENTENCE_P = makeSymbol("IST-SENTENCE-P");



    private static final SubLList $list77 = list(makeKeyword("FORWARD-RULES"), NIL);

    private static final SubLString $str78$Get_contents_operation_not_suppor = makeString("Get-contents operation not supported for pretty string assert sentence accumulators.");

    private static final SubLString $str79$Get_iterator_operation_not_suppor = makeString("Get-iterator operation not supported for pretty string assert sentence accumulators.");

    private static final SubLList $list80 = list(reader_make_constant_shell("WordNet-Version2_0"), reader_make_constant_shell("FOAFOntology"), list(reader_make_constant_shell("CycExtendedSystemFn"), reader_make_constant_shell("LSCOMObjectAndSituationOntology")));

    private static final SubLString $$$OpenCycPermittedSource = makeString("OpenCycPermittedSource");



    private static final SubLString $str83$Removing_non_opencyc_related___sy = makeString("Removing non-opencyc related #$synonymousExternalConcept assertions (pass ");

    private static final SubLString $str84$_ = makeString(")");

    private static final SubLString $$$cdolist = makeString("cdolist");

    private static final SubLObject $$broaderTerm_NonTaxonomic = reader_make_constant_shell("broaderTerm-NonTaxonomic");

    private static final SubLString $$$Killing_ = makeString("Killing ");

    private static final SubLString $str89$___A__ = makeString("~&~A~%");

    private static final SubLString $str90$___s_constant_A__A__ = makeString("  ~s constant~A ~A~%");

    private static final SubLString $$$s_were = makeString("s were");

    private static final SubLString $$$_was = makeString(" was");

    private static final SubLString $$$created = makeString("created");

    private static final SubLString $$$destroyed = makeString("destroyed");

    private static final SubLString $str95$___s_nart_A__A__ = makeString("  ~s nart~A ~A~%");

    private static final SubLString $str96$___s_assertion_A__A__ = makeString("  ~s assertion~A ~A~%");

    private static final SubLString $str97$___s_kb_hl_support_A__A__ = makeString("  ~s kb-hl-support~A ~A~%");

    private static final SubLString $str98$___s_deduction_A__A__ = makeString("  ~s deduction~A ~A~%");

    private static final SubLList $list99 = list(reader_make_constant_shell("PredicateRuleTemplateFn"), reader_make_constant_shell("coGenlPreds"));

    private static final SubLString $str100$Unmarking_instances_of___Terroris = makeString("Unmarking instances of #$TerroristAgent, #$TerroristAct, and #$HostileSocialAction~%");





    private static final SubLString $str108$_A_is_not_a__A = makeString("~A is not a ~A");

    private static final SubLString $$$continue_anyway = makeString("continue anyway");

    private static final SubLString $str113$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    private static final SubLString $str114$_A_is_neither_SET_P_nor_LISTP_ = makeString("~A is neither SET-P nor LISTP.");

    private static final SubLString $str115$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    private static final SubLList $list116 = list(makeUninternedSymbol("LINK-NODE"), makeUninternedSymbol("MT"), makeUninternedSymbol("TV"));

    private static final SubLString $str117$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

















    private static final SubLString $$$AKB = makeString("AKB");

    private static final SubLString $$$BUTLER = makeString("BUTLER");

    private static final SubLString $$$CKB = makeString("CKB");

    private static final SubLString $$$CycInternalAssignment = makeString("CycInternalAssignment");

    private static final SubLString $$$TKB = makeString("TKB");

    private static final SubLString $str131$Translation_ = makeString("Translation-");

    private static final SubLString $str132$Unmarking_non_TKB_assertions = makeString("Unmarking non-TKB assertions");

    private static final SubLString $$$mapping_Cyc_constants = makeString("mapping Cyc constants");



    private static final SubLString $str137$Saving__A_by_asserting__A__ = makeString("Saving ~A by asserting ~A~%");



    private static final SubLString $str139$assertion__A_not_found = makeString("assertion ~A not found");

    private static final SubLSymbol $sym140$TKB_SPECIAL_EXCLUDED_ASSERTION_ = makeSymbol("TKB-SPECIAL-EXCLUDED-ASSERTION?");

    private static final SubLObject $const142$TKBFullySpecifiedSourceMicrotheor = reader_make_constant_shell("TKBFullySpecifiedSourceMicrotheory");































    private static final SubLObject $$genls_GenlDenotesSpecInstances = reader_make_constant_shell("genls-GenlDenotesSpecInstances");

    private static final SubLList $list160 = list(makeSymbol("INSTANCE"), makeUninternedSymbol("MT-VAR"), makeUninternedSymbol("TV-VAR"));

    private static final SubLList $list161 = list(list(makeSymbol("INSTANCE-VAR"), makeSymbol("TERM"), makeSymbol("&KEY"), makeSymbol("MT"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    private static final SubLList $list162 = list(makeKeyword("MT"), $DONE);

    private static final SubLSymbol $ALLOW_OTHER_KEYS = makeKeyword("ALLOW-OTHER-KEYS");

    private static final SubLSymbol ALL_QUOTED_INSTANCES_ENHANCED = makeSymbol("ALL-QUOTED-INSTANCES-ENHANCED");



    private static final SubLString $str169$_S_is_not_a_valid___KBSubsetProfi = makeString("~S is not a valid #$KBSubsetProfile");













    private static final SubLList $list176 = list(makeKeyword("RULE-STATISTICS"), makeKeyword("CACHING-POLICIES"));

    private static final SubLList $list177 = list(reader_make_constant_shell("CycLConstant"), reader_make_constant_shell("Thing"));

    private static final SubLString $str178$KB_subsets_are_not_supported_on_t = makeString("KB subsets are not supported on this port.");

    private static final SubLString $str180$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLString $str181$Gathering_up_all_assertion_EL_for = makeString("Gathering up all assertion EL formulas ....");

    // Definitions
    /**
     * Write out a KB subset partition to PARTITION-FILENAME.  If SPLICING-PARTITION-FILENAME is specified, if the file exists it will be loaded before splicing, otherwise it will be saved after splicing.
     */
    @LispMethod(comment = "Write out a KB subset partition to PARTITION-FILENAME.  If SPLICING-PARTITION-FILENAME is specified, if the file exists it will be loaded before splicing, otherwise it will be saved after splicing.")
    public static final SubLObject make_kbs_partition_alt(SubLObject kbs_partition_path, SubLObject partition_filename, SubLObject splicing_partition_filename) {
        if (splicing_partition_filename == UNPROVIDED) {
            splicing_partition_filename = NIL;
        }
        SubLTrampolineFile.checkType(partition_filename, $sym0$NON_EMPTY_STRING_);
        com.cyc.cycjava.cycl.kbs_utilities.construct_kbs_partition(splicing_partition_filename);
        com.cyc.cycjava.cycl.kbs_utilities.write_out_kbs_partition(kbs_partition_path, partition_filename, splicing_partition_filename);
        return NIL;
    }

    // Definitions
    /**
     * Write out a KB subset partition to PARTITION-FILENAME.  If SPLICING-PARTITION-FILENAME is specified, if the file exists it will be loaded before splicing, otherwise it will be saved after splicing.
     */
    @LispMethod(comment = "Write out a KB subset partition to PARTITION-FILENAME.  If SPLICING-PARTITION-FILENAME is specified, if the file exists it will be loaded before splicing, otherwise it will be saved after splicing.")
    public static SubLObject make_kbs_partition(final SubLObject kbs_partition_path, final SubLObject partition_filename, SubLObject splicing_partition_filename) {
        if (splicing_partition_filename == UNPROVIDED) {
            splicing_partition_filename = NIL;
        }
        assert NIL != string_utilities.non_empty_stringP(partition_filename) : "! string_utilities.non_empty_stringP(partition_filename) " + ("string_utilities.non_empty_stringP(partition_filename) " + "CommonSymbols.NIL != string_utilities.non_empty_stringP(partition_filename) ") + partition_filename;
        prepare_for_kbs_partition(splicing_partition_filename);
        return complete_kbs_partition(kbs_partition_path, partition_filename, splicing_partition_filename);
    }

    public static SubLObject prepare_kb_for_kbs_partition(final SubLObject prepared_units, SubLObject splicing_partition_filename) {
        if (splicing_partition_filename == UNPROVIDED) {
            splicing_partition_filename = NIL;
        }
        prepare_for_kbs_partition(splicing_partition_filename);
        builder_utilities.cyc_dump_standard_kb(prepared_units);
        return prepared_units;
    }

    public static SubLObject complete_kbs_partition(final SubLObject kbs_partition_path, final SubLObject partition_filename, SubLObject splicing_partition_filename) {
        if (splicing_partition_filename == UNPROVIDED) {
            splicing_partition_filename = NIL;
        }
        assert NIL != string_utilities.non_empty_stringP(partition_filename) : "! string_utilities.non_empty_stringP(partition_filename) " + ("string_utilities.non_empty_stringP(partition_filename) " + "CommonSymbols.NIL != string_utilities.non_empty_stringP(partition_filename) ") + partition_filename;
        construct_kbs_partition();
        write_out_kbs_partition(kbs_partition_path, partition_filename, splicing_partition_filename);
        return NIL;
    }

    public static SubLObject prepare_for_kbs_partition(SubLObject splicing_partition_filename) {
        if (splicing_partition_filename == UNPROVIDED) {
            splicing_partition_filename = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == kbs_definition_validP()) {
            Errors.cerror($$$Continue, $str2$The_KBS_definition_is_not_valid_);
        }
        nl_trie_staleness_test.declare_nl_trie_staleness_acceptable();
        kbs_identification.clear_kbs_state();
        kbs_identification.prepare_kbs_kb_destructive(UNPROVIDED);
        if ((NIL != string_utilities.non_empty_stringP(splicing_partition_filename)) && (NIL != Filesys.probe_file(splicing_partition_filename))) {
            partitions.load_partition_clean(splicing_partition_filename, UNPROVIDED);
        }
        return $kbs_definition$.getDynamicValue(thread);
    }

    /**
     *
     *
     * @unknown uses the active KBS defition as an implicit argument
     * @param SPLICING-PARTITION-FILENAME
     * 		optional splicing partition
     * @see SET-KBS-DEFINITION
     */
    @LispMethod(comment = "@unknown uses the active KBS defition as an implicit argument\r\n@param SPLICING-PARTITION-FILENAME\r\n\t\toptional splicing partition\r\n@see SET-KBS-DEFINITION")
    public static final SubLObject construct_kbs_partition(SubLObject splicing_partition_filename) {
        if (splicing_partition_filename == UNPROVIDED) {
            splicing_partition_filename = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == com.cyc.cycjava.cycl.kbs_utilities.kbs_definition_validP()) {
                Errors.cerror($$$Continue, $str_alt2$The_KBS_definition_is_not_valid_);
            }
            declare_nl_trie_staleness_acceptable();
            clear_kbs_state();
            prepare_kbs_kb_destructive(UNPROVIDED);
            identify_kbs_forts();
            do_post_identify_kbs_forts_fns();
            if ((NIL != non_empty_stringP(splicing_partition_filename)) && (NIL != Filesys.probe_file(splicing_partition_filename))) {
                load_partition_clean(splicing_partition_filename);
            }
            kbs_add_redundant.compute_and_add_kbs_additional_redundant_definitional_info();
            if ($$$opencyc.equal(com.cyc.cycjava.cycl.kbs_utilities.get_kbs_name())) {
                kbs_add_redundant.compute_and_add_kbs_broader_term_gafs();
            }
            identify_kbs_assertions();
            do_post_identify_kbs_assertions_fns();
            identify_kbs_deductions();
            kbs_add_redundant.compute_and_add_kbs_additional_redundant_asserted_arguments();
            return $kbs_definition$.getDynamicValue(thread);
        }
    }

    public static SubLObject construct_kbs_partition() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == kbs_identification.kbs_forts()) {
            kbs_identification.identify_kbs_forts();
        }
        kbs_identification.do_post_identify_kbs_forts_fns();
        kbs_add_redundant.compute_and_add_kbs_additional_redundant_definitional_info();
        kbs_identification.identify_kbs_assertions();
        kbs_identification.do_post_identify_kbs_assertions_fns();
        kbs_identification.identify_kbs_deductions();
        kbs_add_redundant.compute_and_add_kbs_additional_redundant_asserted_arguments();
        return $kbs_definition$.getDynamicValue(thread);
    }

    public static final SubLObject write_out_kbs_partition_alt(SubLObject kbs_partition_path, SubLObject partition_filename, SubLObject splicing_partition_filename) {
        if (splicing_partition_filename == UNPROVIDED) {
            splicing_partition_filename = NIL;
        }
        kbs_partition.save_kbs_partition(partition_filename);
        if (splicing_partition_filename.isString() && (NIL == Filesys.probe_file(splicing_partition_filename))) {
            kbs_partition.save_kbs_splicing_partition(splicing_partition_filename);
        }
        com.cyc.cycjava.cycl.kbs_utilities.save_inherited_stores(com.cyc.cycjava.cycl.kbs_utilities.get_kbs_inherited_stores(), kbs_partition_path);
        return kbs_partition_path;
    }

    public static SubLObject write_out_kbs_partition(final SubLObject kbs_partition_path, final SubLObject partition_filename, SubLObject splicing_partition_filename) {
        if (splicing_partition_filename == UNPROVIDED) {
            splicing_partition_filename = NIL;
        }
        kbs_partition.save_kbs_partition(partition_filename);
        if (splicing_partition_filename.isString() && (NIL == Filesys.probe_file(splicing_partition_filename))) {
            kbs_partition.save_kbs_splicing_partition(splicing_partition_filename);
        }
        save_inherited_stores(get_kbs_inherited_stores(), kbs_partition_path);
        return kbs_partition_path;
    }

    public static final SubLObject load_partition_into_empty_kb_alt(SubLObject kbs_partition_path, SubLObject partition_filename) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            kb_utilities.clear_kb_state($int$10000);
            kb_utilities.finalize_kb_tables();
            sbhl_module_declarations.initialize_sbhl_modules(UNPROVIDED);
            {
                SubLObject _prev_bind_0 = $load_partition_weaken_hl_supports$.currentBinding(thread);
                try {
                    $load_partition_weaken_hl_supports$.bind($list_alt5, thread);
                    kbs_partition.load_kbs_partition(partition_filename);
                } finally {
                    $load_partition_weaken_hl_supports$.rebind(_prev_bind_0, thread);
                }
            }
            set_build_kb_loaded(ONE_INTEGER);
            kb_utilities.finalize_kb_tables();
            dumper.load_essential_kb_initializations();
            dumper.rebuild_computable_content_dumpable_low();
            kb_hl_supports.bootstrap_kb_hl_supports(UNPROVIDED);
            dumper.rebuild_computable_remaining_hl_high();
            com.cyc.cycjava.cycl.kbs_utilities.load_inherited_stores(com.cyc.cycjava.cycl.kbs_utilities.get_kbs_inherited_stores(), kbs_partition_path);
            kbs_partition.clean_kbs_assert_info();
            return NIL;
        }
    }

    public static SubLObject load_partition_into_empty_kb(final SubLObject kbs_partition_path, final SubLObject partition_filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        kb_utilities.clear_kb_state($int$10000);
        kb_utilities.finalize_kb_tables();
        sbhl_module_declarations.initialize_sbhl_modules(UNPROVIDED);
        final SubLObject _prev_bind_0 = partitions.$load_partition_weaken_hl_supports$.currentBinding(thread);
        try {
            partitions.$load_partition_weaken_hl_supports$.bind($list4, thread);
            kbs_partition.load_kbs_partition(partition_filename);
        } finally {
            partitions.$load_partition_weaken_hl_supports$.rebind(_prev_bind_0, thread);
        }
        set_build_kb_loaded(ONE_INTEGER);
        kb_utilities.finalize_kb_tables();
        dumper.load_essential_kb_initializations();
        dumper.rebuild_computable_content_dumpable_low();
        if (NIL == $postpone_kb_hl_support_bootstrappingP$.getDynamicValue(thread)) {
            kb_hl_supports_high.bootstrap_kb_hl_supports(UNPROVIDED);
        }
        dumper.rebuild_computable_remaining_hl_high(UNPROVIDED);
        load_inherited_stores(get_kbs_inherited_stores(), kbs_partition_path);
        kbs_partition.clean_kbs_assert_info();
        return NIL;
    }

    public static final SubLObject kbs_image_cleanup_alt() {
        return kbs_cleanup.kbs_cleanup();
    }

    public static SubLObject kbs_image_cleanup() {
        return kbs_cleanup.kbs_cleanup();
    }

    public static final SubLObject sbhl_caching_init_alt() {
        sbhl_cache.initialize_all_sbhl_caching();
        return NIL;
    }

    public static SubLObject sbhl_caching_init() {
        sbhl_cache.initialize_all_sbhl_caching();
        return NIL;
    }

    public static final SubLObject kbs_definition_validP_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject validP = T;
                if (NIL == $kbs_definition$.getDynamicValue(thread)) {
                    Errors.warn($str_alt8$_kbs_definition__is_null);
                    validP = NIL;
                } else {
                    if (NIL != list_utilities.property_list_p($kbs_definition$.getDynamicValue(thread))) {
                        {
                            SubLObject remainder = NIL;
                            for (remainder = $kbs_definition$.getDynamicValue(thread); NIL != remainder; remainder = cddr(remainder)) {
                                {
                                    SubLObject property = remainder.first();
                                    SubLObject value = cadr(remainder);
                                    if (NIL == subl_promotions.memberP(property, $kbs_definition_properties$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) {
                                        Errors.warn($str_alt9$_kbs_definition__has_section_usin, property);
                                        validP = NIL;
                                    }
                                    if (property == $SECTIONS) {
                                        if (NIL == com.cyc.cycjava.cycl.kbs_utilities.kbs_section_definition_validP(value)) {
                                            validP = NIL;
                                        }
                                    }
                                }
                            }
                        }
                    } else {
                        Errors.warn($str_alt11$_kbs_definition__is_not_a_plist_);
                        validP = NIL;
                    }
                }
                return validP;
            }
        }
    }

    public static SubLObject kbs_definition_validP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject validP = T;
        if (NIL == $kbs_definition$.getDynamicValue(thread)) {
            Errors.warn($str7$_kbs_definition__is_null);
            validP = NIL;
        } else
            if (NIL != list_utilities.property_list_p($kbs_definition$.getDynamicValue(thread))) {
                SubLObject remainder;
                SubLObject property;
                SubLObject value;
                for (remainder = NIL, remainder = $kbs_definition$.getDynamicValue(thread); NIL != remainder; remainder = cddr(remainder)) {
                    property = remainder.first();
                    value = cadr(remainder);
                    if (NIL == subl_promotions.memberP(property, $kbs_definition_properties$.getGlobalValue(), UNPROVIDED, UNPROVIDED)) {
                        Errors.warn($str8$_kbs_definition__has_section_usin, property);
                        validP = NIL;
                    }
                    if ((property == $SECTIONS) && (NIL == kbs_section_definition_validP(value))) {
                        validP = NIL;
                    }
                }
            } else {
                Errors.warn($str10$_kbs_definition__is_not_a_plist_);
                validP = NIL;
            }

        return validP;
    }

    public static final SubLObject get_kbs_name_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return getf($kbs_definition$.getDynamicValue(thread), $NAME, UNPROVIDED);
        }
    }

    public static SubLObject get_kbs_name() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return getf($kbs_definition$.getDynamicValue(thread), $NAME, UNPROVIDED);
    }

    public static final SubLObject get_kbs_sections_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return getf($kbs_definition$.getDynamicValue(thread), $SECTIONS, UNPROVIDED);
        }
    }

    public static SubLObject get_kbs_sections() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return getf($kbs_definition$.getDynamicValue(thread), $SECTIONS, UNPROVIDED);
    }

    public static final SubLObject get_kbs_prerun_fns_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return getf($kbs_definition$.getDynamicValue(thread), $PRERUN_FNS, UNPROVIDED);
        }
    }

    public static SubLObject get_kbs_prerun_fns() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return getf($kbs_definition$.getDynamicValue(thread), $PRERUN_FNS, UNPROVIDED);
    }

    public static final SubLObject get_kbs_preremoved_assertions_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return getf($kbs_definition$.getDynamicValue(thread), $PREREMOVED_ASSERTIONS, UNPROVIDED);
        }
    }

    public static SubLObject get_kbs_preremoved_assertions() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return getf($kbs_definition$.getDynamicValue(thread), $PREREMOVED_ASSERTIONS, UNPROVIDED);
    }

    public static final SubLObject get_kbs_post_identify_forts_fns_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return getf($kbs_definition$.getDynamicValue(thread), $POST_IDENTIFY_FORTS_FNS, UNPROVIDED);
        }
    }

    public static SubLObject get_kbs_post_identify_forts_fns() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return getf($kbs_definition$.getDynamicValue(thread), $POST_IDENTIFY_FORTS_FNS, UNPROVIDED);
    }

    public static final SubLObject get_kbs_post_identify_assertions_fns_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return getf($kbs_definition$.getDynamicValue(thread), $POST_IDENTIFY_ASSERTIONS_FNS, UNPROVIDED);
        }
    }

    public static SubLObject get_kbs_post_identify_assertions_fns() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return getf($kbs_definition$.getDynamicValue(thread), $POST_IDENTIFY_ASSERTIONS_FNS, UNPROVIDED);
    }

    public static final SubLObject get_kbs_inherited_stores_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return getf($kbs_definition$.getDynamicValue(thread), $INHERITED_STORES, UNPROVIDED);
        }
    }

    public static SubLObject get_kbs_inherited_stores() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return getf($kbs_definition$.getDynamicValue(thread), $INHERITED_STORES, UNPROVIDED);
    }

    public static final SubLObject kbs_section_definition_validP_alt(SubLObject kbs_sections_definition) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject validP = T;
                if (NIL != list_utilities.non_empty_list_p(kbs_sections_definition)) {
                    {
                        SubLObject cdolist_list_var = kbs_sections_definition;
                        SubLObject poss_kbs_section = NIL;
                        for (poss_kbs_section = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , poss_kbs_section = cdolist_list_var.first()) {
                            if (NIL != list_utilities.property_list_p(poss_kbs_section)) {
                                {
                                    SubLObject remainder = NIL;
                                    for (remainder = poss_kbs_section; NIL != remainder; remainder = cddr(remainder)) {
                                        {
                                            SubLObject property = remainder.first();
                                            SubLObject value = cadr(remainder);
                                            if (NIL == subl_promotions.memberP(property, $kbs_definition_section_properties$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                                                Errors.warn($str_alt18$A_section_is_using_invalid_proper, property);
                                                validP = NIL;
                                            }
                                        }
                                    }
                                }
                            } else {
                                Errors.warn($str_alt19$A_Section_is_not_a_plist___A, poss_kbs_section);
                                validP = NIL;
                            }
                        }
                    }
                } else {
                    Errors.warn($str_alt20$No_sections_are_defined_);
                    validP = NIL;
                }
                return validP;
            }
        }
    }

    public static SubLObject kbs_section_definition_validP(final SubLObject kbs_sections_definition) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject validP = T;
        if (NIL != list_utilities.non_empty_list_p(kbs_sections_definition)) {
            SubLObject cdolist_list_var = kbs_sections_definition;
            SubLObject poss_kbs_section = NIL;
            poss_kbs_section = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != list_utilities.property_list_p(poss_kbs_section)) {
                    SubLObject remainder;
                    SubLObject property;
                    SubLObject value;
                    for (remainder = NIL, remainder = poss_kbs_section; NIL != remainder; remainder = cddr(remainder)) {
                        property = remainder.first();
                        value = cadr(remainder);
                        if (NIL == subl_promotions.memberP(property, $kbs_definition_section_properties$.getDynamicValue(thread), UNPROVIDED, UNPROVIDED)) {
                            Errors.warn($str17$A_section_is_using_invalid_proper, property);
                            validP = NIL;
                        }
                    }
                } else {
                    Errors.warn($str18$A_Section_is_not_a_plist___A, poss_kbs_section);
                    validP = NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                poss_kbs_section = cdolist_list_var.first();
            } 
        } else {
            Errors.warn($str19$No_sections_are_defined_);
            validP = NIL;
        }
        return validP;
    }

    public static final SubLObject do_kbs_definitional_sections_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt21);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject kbs_section = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt21);
                    kbs_section = current.first();
                    current = current.rest();
                    if (NIL == current) {
                        current = temp;
                        {
                            SubLObject body = current;
                            return listS(CDOLIST, bq_cons(kbs_section, $list_alt23), append(body, NIL));
                        }
                    } else {
                        cdestructuring_bind_error(datum, $list_alt21);
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject do_kbs_definitional_sections(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list20);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject kbs_section = NIL;
        destructuring_bind_must_consp(current, datum, $list20);
        kbs_section = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject body;
            current = body = temp;
            return listS(CDOLIST, bq_cons(kbs_section, $list22), append(body, NIL));
        }
        cdestructuring_bind_error(datum, $list20);
        return NIL;
    }

    public static final SubLObject get_kbs_section_collections_alt(SubLObject kbs_section) {
        return getf(kbs_section, $COLLECTIONS, UNPROVIDED);
    }

    public static SubLObject get_kbs_section_collections(final SubLObject kbs_section) {
        return getf(kbs_section, $COLLECTIONS, UNPROVIDED);
    }

    public static SubLObject get_kbs_section_sets(final SubLObject kbs_section) {
        return getf(kbs_section, $SETS, UNPROVIDED);
    }

    public static final SubLObject get_kbs_section_omission_collections_alt(SubLObject kbs_section) {
        return getf(kbs_section, $OMISSION_COLLECTIONS, UNPROVIDED);
    }

    public static SubLObject get_kbs_section_omission_collections(final SubLObject kbs_section) {
        return getf(kbs_section, $OMISSION_COLLECTIONS, UNPROVIDED);
    }

    public static final SubLObject get_kbs_section_omission_predicate_alt(SubLObject kbs_section) {
        return getf(kbs_section, $OMISSION_PREDICATE, UNPROVIDED);
    }

    public static SubLObject get_kbs_section_omission_predicate(final SubLObject kbs_section) {
        return getf(kbs_section, $OMISSION_PREDICATE, UNPROVIDED);
    }

    public static final SubLObject get_kbs_section_definitional_predicate_set_alt(SubLObject kbs_section) {
        return getf(kbs_section, $DEFINITIONAL_PREDICATE_SET, UNPROVIDED);
    }

    public static SubLObject get_kbs_section_definitional_predicate_set(final SubLObject kbs_section) {
        return getf(kbs_section, $DEFINITIONAL_PREDICATE_SET, UNPROVIDED);
    }

    public static final SubLObject get_kbs_section_definitional_rule_predicate_alt(SubLObject kbs_section) {
        return getf(kbs_section, $DEFINITIONAL_RULE_PREDICATE, UNPROVIDED);
    }

    public static SubLObject get_kbs_section_definitional_rule_predicate(final SubLObject kbs_section) {
        return getf(kbs_section, $DEFINITIONAL_RULE_PREDICATE, UNPROVIDED);
    }

    public static SubLObject get_kbs_section_kbq_query_sets(final SubLObject kbs_section) {
        return getf(kbs_section, $KBQ_QUERY_SETS, UNPROVIDED);
    }

    public static SubLObject get_kbs_section_omission_terms(final SubLObject kbs_section) {
        return getf(kbs_section, $OMISSION_TERMS, UNPROVIDED);
    }

    public static SubLObject get_kbs_section_omission_assertions(final SubLObject kbs_section) {
        return getf(kbs_section, $OMISSION_ASSERTIONS, UNPROVIDED);
    }

    public static SubLObject get_kbs_section_retained_terms(final SubLObject kbs_section) {
        return getf(kbs_section, $RETAINED_TERMS, UNPROVIDED);
    }

    public static SubLObject get_kbs_section_retained_assertions(final SubLObject kbs_section) {
        return getf(kbs_section, $RETAINED_ASSERTIONS, UNPROVIDED);
    }

    public static SubLObject get_kbs_section_omission_predicate_extent(final SubLObject kbs_section) {
        return getf(kbs_section, $OMISSION_PREDICATE_EXTENT, UNPROVIDED);
    }

    public static final SubLObject save_inherited_stores_alt(SubLObject inherited_stores, SubLObject inherited_store_directory) {
        {
            SubLObject cdolist_list_var = inherited_stores;
            SubLObject inherited_store = NIL;
            for (inherited_store = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , inherited_store = cdolist_list_var.first()) {
                {
                    SubLObject pcase_var = inherited_store;
                    if (pcase_var.eql($RULE_STATISTICS)) {
                        dumper.dump_rule_utility_experience(inherited_store_directory, NIL);
                    } else {
                        if (pcase_var.eql($CACHING_POLICIES)) {
                            sbhl_caching_policies.dump_active_kb_sbhl_caching_policies(inherited_store_directory, $EXTERNALIZE);
                        } else {
                            Errors.error($str_alt32$Unknown_inherited_store__A__dont_, inherited_store);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject save_inherited_stores(final SubLObject inherited_stores, final SubLObject inherited_store_directory) {
        SubLObject cdolist_list_var = inherited_stores;
        SubLObject inherited_store = NIL;
        inherited_store = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject pcase_var = inherited_store;
            if (pcase_var.eql($RULE_STATISTICS)) {
                dumper.dump_rule_utility_experience(inherited_store_directory, NIL);
            } else
                if (pcase_var.eql($CACHING_POLICIES)) {
                    sbhl_caching_policies.dump_active_kb_sbhl_caching_policies(inherited_store_directory, $EXTERNALIZE);
                } else {
                    Errors.error($str38$Unknown_inherited_store__A__dont_, inherited_store);
                }

            cdolist_list_var = cdolist_list_var.rest();
            inherited_store = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject load_inherited_stores_alt(SubLObject inherited_stores, SubLObject inherited_store_directory) {
        {
            SubLObject cdolist_list_var = inherited_stores;
            SubLObject inherited_store = NIL;
            for (inherited_store = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , inherited_store = cdolist_list_var.first()) {
                {
                    SubLObject pcase_var = inherited_store;
                    if (pcase_var.eql($RULE_STATISTICS)) {
                        dumper.load_rule_utility_experience(inherited_store_directory);
                    } else {
                        if (pcase_var.eql($CACHING_POLICIES)) {
                            sbhl_caching_policies.enforce_standard_kb_sbhl_caching_policies(inherited_store_directory);
                        } else {
                            Errors.warn($str_alt33$Unknown_inherited_store__A_____sk, inherited_store);
                        }
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject load_inherited_stores(final SubLObject inherited_stores, final SubLObject inherited_store_directory) {
        SubLObject cdolist_list_var = inherited_stores;
        SubLObject inherited_store = NIL;
        inherited_store = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject pcase_var = inherited_store;
            if (pcase_var.eql($RULE_STATISTICS)) {
                dumper.load_rule_utility_experience(inherited_store_directory);
            } else
                if (pcase_var.eql($CACHING_POLICIES)) {
                    sbhl_caching_policies.enforce_standard_kb_sbhl_caching_policies(inherited_store_directory);
                } else {
                    Errors.warn($str39$Unknown_inherited_store__A_____sk, inherited_store);
                }

            cdolist_list_var = cdolist_list_var.rest();
            inherited_store = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static SubLObject opencyc_kbs_assert_broader_term_gafs() {
        opencyc_kbs_possibly_prepare_broader_term_queue();
        final SubLObject gaf_acc = opencyc_kbs_contribute_to_broader_term_gafs();
        final SubLObject ass_iterator = opencyc_kbs_new_accumulated_broader_term_assertion_iterator(gaf_acc);
        kbs_add_redundant.add_some_kbs_broader_term_gafs(ass_iterator);
        return T;
    }

    public static SubLObject opencyc_kbs_contribute_to_broader_term_gafs() {
        final SubLObject gaf_acc = opencyc_kbs_new_broader_term_assertion_accumulator();
        final SubLObject term_iterator = opencyc_kbs_new_kbs_fort_iterator();
        kbs_add_redundant.compute_specified_kbs_broader_term_gafs(term_iterator, gaf_acc);
        accumulation.accumulation_contents(gaf_acc, UNPROVIDED);
        return gaf_acc;
    }

    public static SubLObject opencyc_kbs_new_kbs_fort_iterator() {
        if (NIL != simple_queue_service.is_known_sqs_queueP($opencyc_kbs_term_queue$.getGlobalValue())) {
            final SubLObject queue = $opencyc_kbs_term_queue$.getGlobalValue();
            return simple_queue_service.new_sqs_segment_iterator(simple_queue_service.new_sqs_iterator(queue, UNPROVIDED, UNPROVIDED));
        }
        return iteration.new_list_iterator(kbs_add_redundant.kbs_broader_term_candidate_forts());
    }

    public static SubLObject opencyc_kbs_new_assertion_accumulator(SubLObject simplifier_fn, SubLObject param) {
        if (simplifier_fn == UNPROVIDED) {
            simplifier_fn = NIL;
        }
        if (param == UNPROVIDED) {
            param = iteration.$xform_fn_param_do_not_pass$.getGlobalValue();
        }
        if (NIL != simple_queue_service.is_known_sqs_queueP($opencyc_kbs_assertion_queue$.getGlobalValue())) {
            final SubLObject queue = $opencyc_kbs_assertion_queue$.getGlobalValue();
            SubLObject acc = simple_queue_service.new_sqs_accumulator(queue, UNPROVIDED, UNPROVIDED);
            acc = simple_queue_service.new_segment_accumulator(acc, simple_queue_service.$recommended_max_bytes_per_sqs_message$.getGlobalValue(), NIL);
            if (NIL != simplifier_fn) {
                acc = accumulation.new_transform_accumulator(acc, simplifier_fn, param);
            }
            return acc;
        }
        return accumulation.new_list_accumulator(UNPROVIDED);
    }

    public static SubLObject opencyc_kbs_new_accumulated_assertions_iterator(final SubLObject gaf_accumulator, SubLObject simplifier_fn, SubLObject param) {
        if (simplifier_fn == UNPROVIDED) {
            simplifier_fn = NIL;
        }
        if (param == UNPROVIDED) {
            param = iteration.$xform_fn_param_do_not_pass$.getGlobalValue();
        }
        if (NIL != simple_queue_service.is_known_sqs_queueP($opencyc_kbs_assertion_queue$.getGlobalValue())) {
            SubLObject iterator = simple_queue_service.new_sqs_iterator($opencyc_kbs_assertion_queue$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
            iterator = simple_queue_service.new_sqs_segment_iterator(iterator);
            if (NIL != simplifier_fn) {
                iterator = iteration.new_transform_iterator(iterator, simplifier_fn, param);
            }
            return iterator;
        }
        return accumulation.accumulation_iterator(gaf_accumulator);
    }

    public static SubLObject opencyc_kbs_new_accumulated_broader_term_assertion_iterator(final SubLObject gaf_accumulator) {
        return opencyc_kbs_new_accumulated_assertions_iterator(gaf_accumulator, KBS_RECONSTITUTE_BROADER_TERM_GAF_SPECIFICS, UNPROVIDED);
    }

    public static SubLObject opencyc_kbs_new_broader_term_assertion_accumulator() {
        return opencyc_kbs_new_assertion_accumulator(KBS_EXTRACT_BROADER_TERM_GAF_SPECIFICS, UNPROVIDED);
    }

    public static SubLObject opencyc_kbs_possibly_prepare_broader_term_queue() {
        if (NIL != simple_queue_service.is_known_sqs_queueP($opencyc_kbs_term_queue$.getGlobalValue())) {
            return opencyc_kbs_prepare_broader_term_queue();
        }
        return $UNKNOWN;
    }

    public static SubLObject opencyc_kbs_prepare_broader_term_queue() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject queue = $opencyc_kbs_term_queue$.getGlobalValue();
        final SubLObject estimate = simple_queue_service.sqs_pending_message_estimate(queue);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!estimate.isZero())) {
            Errors.error($str43$Whoa__someone_already_populated_t, estimate);
        }
        accumulation.accumulation_add_items(simple_queue_service.new_segment_accumulator(simple_queue_service.new_sqs_accumulator(queue, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED), iteration.new_list_iterator(kbs_add_redundant.kbs_broader_term_candidate_forts()));
        return $PREPARED;
    }

    public static SubLObject kbs_extract_broader_term_gaf_specifics(final SubLObject information) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sentence = NIL;
        SubLObject mt = NIL;
        SubLObject strength = NIL;
        destructuring_bind_must_consp(information, information, $list45);
        sentence = information.first();
        SubLObject current = information.rest();
        destructuring_bind_must_consp(current, information, $list45);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, information, $list45);
        strength = current.first();
        current = current.rest();
        if (NIL == current) {
            SubLObject current_$2;
            final SubLObject datum_$1 = current_$2 = sentence;
            SubLObject pred = NIL;
            SubLObject arg1 = NIL;
            SubLObject arg2 = NIL;
            destructuring_bind_must_consp(current_$2, datum_$1, $list46);
            pred = current_$2.first();
            current_$2 = current_$2.rest();
            destructuring_bind_must_consp(current_$2, datum_$1, $list46);
            arg1 = current_$2.first();
            current_$2 = current_$2.rest();
            destructuring_bind_must_consp(current_$2, datum_$1, $list46);
            arg2 = current_$2.first();
            current_$2 = current_$2.rest();
            if (NIL == current_$2) {
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!pred.eql($$broaderTerm))) {
                    Errors.error($str48$This_transform_filters_is_not_app, information);
                }
                final SubLObject code = position(strength, enumeration_types.$valid_el_strengths$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == subl_promotions.non_negative_integer_p(code))) {
                    Errors.error($str49$GAF__A_has_a_non_standard_EL_stre, information, strength);
                }
                return list(arg1, arg2, mt, code);
            }
            cdestructuring_bind_error(datum_$1, $list46);
        } else {
            cdestructuring_bind_error(information, $list45);
        }
        return NIL;
    }

    public static SubLObject kbs_reconstitute_broader_term_gaf_specifics(final SubLObject information) {
        SubLObject arg1 = NIL;
        SubLObject arg2 = NIL;
        SubLObject mt = NIL;
        SubLObject code = NIL;
        destructuring_bind_must_consp(information, information, $list50);
        arg1 = information.first();
        SubLObject current = information.rest();
        destructuring_bind_must_consp(current, information, $list50);
        arg2 = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, information, $list50);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, information, $list50);
        code = current.first();
        current = current.rest();
        if (NIL == current) {
            return list(make_binary_formula($$broaderTerm, arg1, arg2), mt, nth(code, enumeration_types.$valid_el_strengths$.getGlobalValue()));
        }
        cdestructuring_bind_error(information, $list50);
        return NIL;
    }

    public static final SubLObject unmark_forts_without_assertions_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            identify_kbs_assertions();
            {
                SubLObject fort_count = ZERO_INTEGER;
                SubLObject assertion_count = ZERO_INTEGER;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        {
                            SubLObject message = $str_alt36$Unmarking_forts_with_only_include;
                            SubLObject total = forts.fort_count();
                            SubLObject sofar = ZERO_INTEGER;
                            {
                                SubLObject _prev_bind_0_1 = $last_percent_progress_index$.currentBinding(thread);
                                SubLObject _prev_bind_1_2 = $last_percent_progress_prediction$.currentBinding(thread);
                                SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                                SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                try {
                                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                    $last_percent_progress_prediction$.bind(NIL, thread);
                                    $within_noting_percent_progress$.bind(T, thread);
                                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                                    noting_percent_progress_preamble(message);
                                    {
                                        SubLObject cdolist_list_var = forts.do_forts_tables();
                                        SubLObject table_var = NIL;
                                        for (table_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , table_var = cdolist_list_var.first()) {
                                            if (NIL == do_id_index_empty_p(table_var, $SKIP)) {
                                                {
                                                    SubLObject id = do_id_index_next_id(table_var, T, NIL, NIL);
                                                    SubLObject state_var = do_id_index_next_state(table_var, T, id, NIL);
                                                    SubLObject fort = NIL;
                                                    while (NIL != id) {
                                                        fort = do_id_index_state_object(table_var, $SKIP, id, state_var);
                                                        if (NIL != do_id_index_id_and_object_validP(id, fort, $SKIP)) {
                                                            sofar = add(sofar, ONE_INTEGER);
                                                            note_percent_progress(sofar, total);
                                                            if (NIL != kbs_fort_p(fort)) {
                                                                {
                                                                    SubLObject keepP = NIL;
                                                                    if (NIL != kb_mapping_macros.do_term_index_key_validator(fort, NIL)) {
                                                                        {
                                                                            SubLObject iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator(fort, NIL);
                                                                            SubLObject done_var = keepP;
                                                                            SubLObject token_var = NIL;
                                                                            while (NIL == done_var) {
                                                                                {
                                                                                    SubLObject final_index_spec = iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                                                    SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                                                    if (NIL != valid) {
                                                                                        {
                                                                                            SubLObject final_index_iterator = NIL;
                                                                                            try {
                                                                                                final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, NIL, NIL, NIL);
                                                                                                {
                                                                                                    SubLObject done_var_3 = keepP;
                                                                                                    SubLObject token_var_4 = NIL;
                                                                                                    while (NIL == done_var_3) {
                                                                                                        {
                                                                                                            SubLObject a = iteration_next_without_values_macro_helper(final_index_iterator, token_var_4);
                                                                                                            SubLObject valid_5 = makeBoolean(token_var_4 != a);
                                                                                                            if (NIL != valid_5) {
                                                                                                                if (NIL != kb_mapping_macros.do_term_index_assertion_match_p(a, final_index_spec)) {
                                                                                                                    if (NIL == function_terms.tou_assertionP(a)) {
                                                                                                                        if (NIL != kbs_assertion_p(a)) {
                                                                                                                            keepP = T;
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                            done_var_3 = makeBoolean((NIL == valid_5) || (NIL != keepP));
                                                                                                        }
                                                                                                    } 
                                                                                                }
                                                                                            } finally {
                                                                                                {
                                                                                                    SubLObject _prev_bind_0_6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                                    try {
                                                                                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                        if (NIL != final_index_iterator) {
                                                                                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                                        }
                                                                                                    } finally {
                                                                                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_6, thread);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    done_var = makeBoolean((NIL == valid) || (NIL != keepP));
                                                                                }
                                                                            } 
                                                                        }
                                                                    }
                                                                    if (NIL == keepP) {
                                                                        format(T, $str_alt38$unmarking__A__, fort);
                                                                        force_output(UNPROVIDED);
                                                                        thread.resetMultipleValues();
                                                                        {
                                                                            SubLObject fort_count_int = unmark_kbs_fort_and_dependents(fort);
                                                                            SubLObject assertion_count_int = thread.secondMultipleValue();
                                                                            thread.resetMultipleValues();
                                                                            fort_count = add(fort_count, fort_count_int);
                                                                            assertion_count = add(assertion_count, assertion_count_int);
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                        id = do_id_index_next_id(table_var, T, id, state_var);
                                                        state_var = do_id_index_next_state(table_var, T, id, state_var);
                                                    } 
                                                }
                                            }
                                        }
                                    }
                                    noting_percent_progress_postamble();
                                } finally {
                                    $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                    $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                    $last_percent_progress_prediction$.rebind(_prev_bind_1_2, thread);
                                    $last_percent_progress_index$.rebind(_prev_bind_0_1, thread);
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                format(T, $str_alt39$Unmarked__A_forts_and__A_assertio, fort_count, assertion_count);
                return values(fort_count, assertion_count);
            }
        }
    }

    public static SubLObject unmark_forts_without_assertions() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        kbs_identification.identify_kbs_assertions();
        SubLObject fort_count = ZERO_INTEGER;
        SubLObject assertion_count = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject message = $str53$Unmarking_forts_with_only_include;
            final SubLObject total = forts.fort_count();
            SubLObject sofar = ZERO_INTEGER;
            final SubLObject _prev_bind_0_$3 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_1_$4 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble(message);
                    SubLObject cdolist_list_var = forts.do_forts_tables();
                    SubLObject table_var = NIL;
                    table_var = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject idx = table_var;
                        if (NIL == id_index_objects_empty_p(idx, $SKIP)) {
                            final SubLObject idx_$5 = idx;
                            if (NIL == id_index_dense_objects_empty_p(idx_$5, $SKIP)) {
                                final SubLObject vector_var = id_index_dense_objects(idx_$5);
                                final SubLObject backwardP_var = NIL;
                                SubLObject length;
                                SubLObject v_iteration;
                                SubLObject id;
                                SubLObject fort;
                                SubLObject keepP;
                                SubLObject iterator_var;
                                SubLObject done_var;
                                SubLObject token_var;
                                SubLObject final_index_spec;
                                SubLObject valid;
                                SubLObject final_index_iterator;
                                SubLObject done_var_$6;
                                SubLObject token_var_$7;
                                SubLObject a;
                                SubLObject valid_$8;
                                SubLObject _prev_bind_0_$4;
                                SubLObject _values;
                                SubLObject fort_count_int;
                                SubLObject assertion_count_int;
                                for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                    id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                    fort = aref(vector_var, id);
                                    if ((NIL == id_index_tombstone_p(fort)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                        if (NIL != id_index_tombstone_p(fort)) {
                                            fort = $SKIP;
                                        }
                                        sofar = add(sofar, ONE_INTEGER);
                                        note_percent_progress(sofar, total);
                                        if (NIL != kbs_identification.kbs_fort_p(fort)) {
                                            keepP = NIL;
                                            if (NIL != kb_mapping_macros.do_term_index_key_validator(fort, NIL)) {
                                                iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator(fort, NIL);
                                                done_var = keepP;
                                                token_var = NIL;
                                                while (NIL == done_var) {
                                                    final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                    valid = makeBoolean(!token_var.eql(final_index_spec));
                                                    if (NIL != valid) {
                                                        final_index_iterator = NIL;
                                                        try {
                                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, NIL, NIL, NIL);
                                                            done_var_$6 = keepP;
                                                            token_var_$7 = NIL;
                                                            while (NIL == done_var_$6) {
                                                                a = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$7);
                                                                valid_$8 = makeBoolean(!token_var_$7.eql(a));
                                                                if ((((NIL != valid_$8) && (NIL != kb_mapping_macros.do_term_index_assertion_match_p(a, final_index_spec))) && (NIL == function_terms.tou_assertionP(a))) && (NIL != kbs_identification.kbs_assertion_p(a))) {
                                                                    keepP = T;
                                                                }
                                                                done_var_$6 = makeBoolean((NIL == valid_$8) || (NIL != keepP));
                                                            } 
                                                        } finally {
                                                            _prev_bind_0_$4 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                _values = getValuesAsVector();
                                                                if (NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                                restoreValuesFromVector(_values);
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                                                            }
                                                        }
                                                    }
                                                    done_var = makeBoolean((NIL == valid) || (NIL != keepP));
                                                } 
                                            }
                                            if (NIL == keepP) {
                                                format(T, $str55$unmarking__A__, fort);
                                                force_output(UNPROVIDED);
                                                thread.resetMultipleValues();
                                                fort_count_int = kbs_identification.unmark_kbs_fort_and_dependents(fort);
                                                assertion_count_int = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                fort_count = add(fort_count, fort_count_int);
                                                assertion_count = add(assertion_count, assertion_count_int);
                                            }
                                        }
                                    }
                                }
                            }
                            final SubLObject idx_$6 = idx;
                            if ((NIL == id_index_sparse_objects_empty_p(idx_$6)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                final SubLObject sparse = id_index_sparse_objects(idx_$6);
                                SubLObject id2 = id_index_sparse_id_threshold(idx_$6);
                                final SubLObject end_id = id_index_next_id(idx_$6);
                                final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                                while (id2.numL(end_id)) {
                                    final SubLObject fort2 = gethash_without_values(id2, sparse, v_default);
                                    if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(fort2))) {
                                        sofar = add(sofar, ONE_INTEGER);
                                        note_percent_progress(sofar, total);
                                        if (NIL != kbs_identification.kbs_fort_p(fort2)) {
                                            SubLObject keepP2 = NIL;
                                            if (NIL != kb_mapping_macros.do_term_index_key_validator(fort2, NIL)) {
                                                final SubLObject iterator_var2 = kb_mapping_macros.new_term_final_index_spec_iterator(fort2, NIL);
                                                SubLObject done_var2 = keepP2;
                                                final SubLObject token_var2 = NIL;
                                                while (NIL == done_var2) {
                                                    final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                                    final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                                                    if (NIL != valid2) {
                                                        SubLObject final_index_iterator2 = NIL;
                                                        try {
                                                            final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, NIL, NIL, NIL);
                                                            SubLObject done_var_$7 = keepP2;
                                                            final SubLObject token_var_$8 = NIL;
                                                            while (NIL == done_var_$7) {
                                                                final SubLObject a2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$8);
                                                                final SubLObject valid_$9 = makeBoolean(!token_var_$8.eql(a2));
                                                                if ((((NIL != valid_$9) && (NIL != kb_mapping_macros.do_term_index_assertion_match_p(a2, final_index_spec2))) && (NIL == function_terms.tou_assertionP(a2))) && (NIL != kbs_identification.kbs_assertion_p(a2))) {
                                                                    keepP2 = T;
                                                                }
                                                                done_var_$7 = makeBoolean((NIL == valid_$9) || (NIL != keepP2));
                                                            } 
                                                        } finally {
                                                            final SubLObject _prev_bind_0_$5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                final SubLObject _values2 = getValuesAsVector();
                                                                if (NIL != final_index_iterator2) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                                                }
                                                                restoreValuesFromVector(_values2);
                                                            } finally {
                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                                                            }
                                                        }
                                                    }
                                                    done_var2 = makeBoolean((NIL == valid2) || (NIL != keepP2));
                                                } 
                                            }
                                            if (NIL == keepP2) {
                                                format(T, $str55$unmarking__A__, fort2);
                                                force_output(UNPROVIDED);
                                                thread.resetMultipleValues();
                                                final SubLObject fort_count_int2 = kbs_identification.unmark_kbs_fort_and_dependents(fort2);
                                                final SubLObject assertion_count_int2 = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                fort_count = add(fort_count, fort_count_int2);
                                                assertion_count = add(assertion_count, assertion_count_int2);
                                            }
                                        }
                                    }
                                    id2 = add(id2, ONE_INTEGER);
                                } 
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        table_var = cdolist_list_var.first();
                    } 
                } finally {
                    final SubLObject _prev_bind_0_$6 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values3 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values3);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_1_$4, thread);
                $last_percent_progress_index$.rebind(_prev_bind_0_$3, thread);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        format(T, $str56$Unmarked__A_forts_and__A_assertio, fort_count, assertion_count);
        return values(fort_count, assertion_count);
    }

    public static SubLObject valid_opencyc_kbs_prettystrings_sqs_setupP() {
        return makeBoolean((NIL != simple_queue_service.is_known_sqs_queueP($opencyc_kbs_prettystring_term_queue$.getGlobalValue())) && (NIL != simple_queue_service.is_known_sqs_queueP($opencyc_kbs_prettystring_assert_queue$.getGlobalValue())));
    }

    public static final SubLObject opencyc_kbs_forts_assert_pretty_strings_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject assertion_count = ZERO_INTEGER;
                {
                    SubLObject _prev_bind_0 = $skip_compute_kbs_skolemsP$.currentBinding(thread);
                    try {
                        $skip_compute_kbs_skolemsP$.bind(T, thread);
                        identify_kbs_forts();
                    } finally {
                        $skip_compute_kbs_skolemsP$.rebind(_prev_bind_0, thread);
                    }
                }
                {
                    SubLObject _prev_bind_0 = after_adding.$after_addings_disabledP$.currentBinding(thread);
                    try {
                        after_adding.$after_addings_disabledP$.bind(T, thread);
                        {
                            SubLObject state = memoization_state.possibly_new_memoization_state();
                            SubLObject local_state = state;
                            {
                                SubLObject _prev_bind_0_7 = memoization_state.$memoization_state$.currentBinding(thread);
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
                                                        Errors.error($str_alt40$Invalid_attempt_to_reuse_memoizat);
                                                    }
                                                }
                                            }
                                        }
                                        try {
                                            {
                                                SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                                                {
                                                    SubLObject _prev_bind_0_8 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                                                    SubLObject _prev_bind_1 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                                                    SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
                                                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                                                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                                                        {
                                                            SubLObject message = cconcatenate($str_alt41$Asserting_pretty_string_assertion, new SubLObject[]{ format_nil.format_nil_a_no_copy(kbs_fort_count()), $str_alt42$_KBS_FORTs });
                                                            SubLObject message_9 = message;
                                                            SubLObject total = forts.fort_count();
                                                            SubLObject sofar = ZERO_INTEGER;
                                                            {
                                                                SubLObject _prev_bind_0_10 = $last_percent_progress_index$.currentBinding(thread);
                                                                SubLObject _prev_bind_1_11 = $last_percent_progress_prediction$.currentBinding(thread);
                                                                SubLObject _prev_bind_2_12 = $within_noting_percent_progress$.currentBinding(thread);
                                                                SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                                                try {
                                                                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                                                    $last_percent_progress_prediction$.bind(NIL, thread);
                                                                    $within_noting_percent_progress$.bind(T, thread);
                                                                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                                                                    noting_percent_progress_preamble(message_9);
                                                                    {
                                                                        SubLObject cdolist_list_var = forts.do_forts_tables();
                                                                        SubLObject table_var = NIL;
                                                                        for (table_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , table_var = cdolist_list_var.first()) {
                                                                            if (NIL == do_id_index_empty_p(table_var, $SKIP)) {
                                                                                {
                                                                                    SubLObject id = do_id_index_next_id(table_var, T, NIL, NIL);
                                                                                    SubLObject state_var = do_id_index_next_state(table_var, T, id, NIL);
                                                                                    SubLObject fort = NIL;
                                                                                    while (NIL != id) {
                                                                                        fort = do_id_index_state_object(table_var, $SKIP, id, state_var);
                                                                                        if (NIL != do_id_index_id_and_object_validP(id, fort, $SKIP)) {
                                                                                            sofar = add(sofar, ONE_INTEGER);
                                                                                            note_percent_progress(sofar, total);
                                                                                            if ((NIL != kbs_fort_p(fort)) && (NIL == term.fast_reified_skolemP(fort))) {
                                                                                                assertion_count = add(assertion_count, pph_utilities.assert_pretty_strings(fort, UNPROVIDED, UNPROVIDED, UNPROVIDED));
                                                                                            }
                                                                                        }
                                                                                        id = do_id_index_next_id(table_var, T, id, state_var);
                                                                                        state_var = do_id_index_next_state(table_var, T, id, state_var);
                                                                                    } 
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    noting_percent_progress_postamble();
                                                                } finally {
                                                                    $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                                                    $within_noting_percent_progress$.rebind(_prev_bind_2_12, thread);
                                                                    $last_percent_progress_prediction$.rebind(_prev_bind_1_11, thread);
                                                                    $last_percent_progress_index$.rebind(_prev_bind_0_10, thread);
                                                                }
                                                            }
                                                        }
                                                    } finally {
                                                        sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                                                        sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1, thread);
                                                        sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_8, thread);
                                                    }
                                                }
                                            }
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
                                    memoization_state.$memoization_state$.rebind(_prev_bind_0_7, thread);
                                }
                            }
                        }
                    } finally {
                        after_adding.$after_addings_disabledP$.rebind(_prev_bind_0, thread);
                    }
                }
                return assertion_count;
            }
        }
    }

    public static SubLObject opencyc_kbs_forts_assert_pretty_strings() {
        final SubLObject assert_acc = new_pretty_string_assert_sentence_accumulator();
        final SubLObject term_iterator = new_kbs_pretty_string_fort_iterator();
        if (NIL != valid_opencyc_kbs_prettystrings_sqs_setupP()) {
            opencyc_kbs_populate_prettystring_term_queue(term_iterator);
            opencyc_kbs_forts_contribute_pretty_strings();
            final SubLObject a_queue = $opencyc_kbs_prettystring_assert_queue$.getGlobalValue();
            final SubLObject result_it = iteration.new_transform_iterator(simple_queue_service.new_sqs_segment_iterator(simple_queue_service.new_sqs_iterator(a_queue, UNPROVIDED, UNPROVIDED)), OPENCYC_KBS_RECONSTITUTE_PRETTY_STRING_IST, UNPROVIDED);
            accumulation.accumulation_add_items(assert_acc, result_it);
            return NIL;
        }
        opencyc_kbs_forts_work_on_pretty_strings(assert_acc, term_iterator);
        return accumulation.accumulation_size(assert_acc);
    }

    public static SubLObject opencyc_kbs_forts_contribute_pretty_strings() {
        final SubLObject t_queue = $opencyc_kbs_prettystring_term_queue$.getGlobalValue();
        final SubLObject a_queue = $opencyc_kbs_prettystring_assert_queue$.getGlobalValue();
        final SubLObject term_iterator = simple_queue_service.new_sqs_segment_iterator(simple_queue_service.new_sqs_iterator(t_queue, UNPROVIDED, UNPROVIDED));
        final SubLObject accumulator = accumulation.new_transform_accumulator(simple_queue_service.new_segment_accumulator(simple_queue_service.new_sqs_accumulator(a_queue, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED), OPENCYC_KBS_SIMPLIFY_PRETTY_STRING_IST, UNPROVIDED);
        opencyc_kbs_forts_work_on_pretty_strings(accumulator, term_iterator);
        return accumulator;
    }

    public static SubLObject opencyc_kbs_populate_prettystring_term_queue(final SubLObject term_iterator) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject t_queue = $opencyc_kbs_prettystring_term_queue$.getGlobalValue();
        final SubLObject estimate = simple_queue_service.sqs_pending_message_estimate(t_queue);
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!estimate.isZero())) {
            Errors.error($str43$Whoa__someone_already_populated_t, estimate);
        }
        final SubLObject accumulator = simple_queue_service.new_segment_accumulator(simple_queue_service.new_sqs_accumulator(t_queue, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED);
        accumulation.accumulation_add_items(accumulator, term_iterator);
        return $PREPARED;
    }

    public static SubLObject opencyc_kbs_simplify_pretty_string_ist(final SubLObject ist_sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ist_pred = NIL;
        SubLObject mt = NIL;
        destructuring_bind_must_consp(ist_sentence, ist_sentence, $list61);
        ist_pred = ist_sentence.first();
        SubLObject current = ist_sentence.rest();
        destructuring_bind_must_consp(current, ist_sentence, $list61);
        mt = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, ist_sentence, $list61);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject pretty_pred = NIL;
        SubLObject v_term = NIL;
        SubLObject string = NIL;
        destructuring_bind_must_consp(current, ist_sentence, $list61);
        pretty_pred = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, ist_sentence, $list61);
        v_term = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, ist_sentence, $list61);
        string = current.first();
        current = current.rest();
        if (NIL == current) {
            current = temp;
            if (NIL == current) {
                if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (!$$ist.eql(ist_pred))) {
                    Errors.error($str63$Do_not_know_how_to_simplify_sente, ist_sentence);
                }
                final SubLObject mt_code = position(mt, $opencyc_kbs_supported_prettystring_mts$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                final SubLObject pred_code = position(pretty_pred, $opencyc_kbs_supported_prettystring_preds$.getGlobalValue(), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                return list(NIL == mt_code ? mt : mt_code, NIL == pred_code ? pretty_pred : pred_code, v_term, string);
            }
            cdestructuring_bind_error(ist_sentence, $list61);
        } else {
            cdestructuring_bind_error(ist_sentence, $list61);
        }
        return NIL;
    }

    public static SubLObject opencyc_kbs_reconstitute_pretty_string_ist(final SubLObject item) {
        SubLObject mt_code = NIL;
        SubLObject pred_code = NIL;
        SubLObject v_term = NIL;
        SubLObject string = NIL;
        destructuring_bind_must_consp(item, item, $list64);
        mt_code = item.first();
        SubLObject current = item.rest();
        destructuring_bind_must_consp(current, item, $list64);
        pred_code = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, item, $list64);
        v_term = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, item, $list64);
        string = current.first();
        current = current.rest();
        if (NIL == current) {
            final SubLObject mt = (mt_code.isNumber()) ? nth(mt_code, $opencyc_kbs_supported_prettystring_mts$.getGlobalValue()) : mt_code;
            final SubLObject pred = (pred_code.isNumber()) ? nth(pred_code, $opencyc_kbs_supported_prettystring_preds$.getGlobalValue()) : pred_code;
            return make_binary_formula($$ist, mt, make_binary_formula(pred, v_term, string));
        }
        cdestructuring_bind_error(item, $list64);
        return NIL;
    }

    public static SubLObject opencyc_kbs_forts_work_on_pretty_strings(final SubLObject accumulator, final SubLObject iterator) {
        final SubLObject approx_total = kbs_identification.kbs_fort_count();
        final SubLObject message = cconcatenate($str65$Asserting_pretty_string_assertion, new SubLObject[]{ format_nil.format_nil_a_no_copy(approx_total), $$$_KBS_FORTs });
        pph_utilities.accumulate_pretty_strings_from_iterator(iterator, accumulator, message, approx_total, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        return accumulation.accumulation_size(accumulator);
    }

    public static SubLObject new_kbs_pretty_string_fort_iterator() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if ((NIL == Errors.$ignore_mustsP$.getDynamicValue(thread)) && (NIL == kbs_identification.kbs_forts())) {
            Errors.error($str67$Cannot_be_used_without_identifyin);
        }
        return iteration.new_filter_iterator(iteration.new_list_iterator(kbs_identification.kbs_forts()), $sym68$KBS_PRETTY_STRING_FORT_, UNPROVIDED);
    }

    public static SubLObject kbs_pretty_string_fortP(final SubLObject fort) {
        return makeBoolean(NIL == term.fast_reified_skolemP(fort));
    }

    public static SubLObject new_pretty_string_assert_sentence_accumulator() {
        return accumulation.new_accumulator(ZERO_INTEGER, PRETTY_STRING_ASSERT_SENTENCE_ACCUMULATOR_RESET, PRETTY_STRING_ASSERT_SENTENCE_ACCUMULATOR_ADD, PRETTY_STRING_ASSERT_SENTENCE_ACCUMULATOR_SIZE, PRETTY_STRING_ASSERT_SENTENCE_ACCUMULATOR_CONTENTS, PRETTY_STRING_ASSERT_SENTENCE_ACCUMULATOR_ITERATOR, UNPROVIDED);
    }

    public static SubLObject pretty_string_assert_sentence_accumulator_reset(final SubLObject old_state) {
        Errors.error($str74$Reset_operation_not_supported_for);
        return NIL;
    }

    public static SubLObject pretty_string_assert_sentence_accumulator_add(final SubLObject state, final SubLObject element) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert NIL != ist_sentence_p(element, UNPROVIDED) : "! el_utilities.ist_sentence_p(element, .UNPROVIDED) " + ("el_utilities.ist_sentence_p(element, CommonSymbols.UNPROVIDED) " + "CommonSymbols.NIL != el_utilities.ist_sentence_p(element, CommonSymbols.UNPROVIDED) ") + element;
        final SubLObject _prev_bind_0 = after_adding.$after_addings_disabledP$.currentBinding(thread);
        try {
            after_adding.$after_addings_disabledP$.bind(T, thread);
            cyc_kernel.cyc_assert_wff(element, $$BaseKB, $list77);
        } finally {
            after_adding.$after_addings_disabledP$.rebind(_prev_bind_0, thread);
        }
        return number_utilities.f_1X(state);
    }

    public static SubLObject pretty_string_assert_sentence_accumulator_size(final SubLObject state) {
        return state;
    }

    public static SubLObject pretty_string_assert_sentence_accumulator_contents(final SubLObject state, SubLObject resetP) {
        if (resetP == UNPROVIDED) {
            resetP = NIL;
        }
        Errors.error($str78$Get_contents_operation_not_suppor);
        return NIL;
    }

    public static SubLObject pretty_string_assert_sentence_accumulator_iterator(final SubLObject state) {
        Errors.error($str79$Get_iterator_operation_not_suppor);
        return NIL;
    }

    public static final SubLObject opencyc_kbs_remove_excluded_synonymous_external_concept_assertions_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = ZERO_INTEGER;
                SubLObject pass_number = ZERO_INTEGER;
                SubLObject last_count = MINUS_ONE_INTEGER;
                SubLObject permitted_sources = (NIL != constants_high.find_constant($$$OpenCycPermittedSource)) ? ((SubLObject) (isa.all_instances_in_all_mts(constants_high.find_constant($$$OpenCycPermittedSource)))) : narts_high.nart_substitute($opencyc_permitted_sources$.getGlobalValue());
                while (NIL != subl_promotions.non_zero_integer_p(last_count)) {
                    last_count = ZERO_INTEGER;
                    {
                        SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                        SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                        try {
                            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                            pass_number = add(pass_number, ONE_INTEGER);
                            {
                                SubLObject list_var = kb_mapping.gather_predicate_extent_index($$synonymousExternalConcept, UNPROVIDED, UNPROVIDED);
                                $progress_note$.setDynamicValue(cconcatenate($str_alt46$Removing_non_opencyc_related___sy, new SubLObject[]{ format_nil.format_nil_a_no_copy(pass_number), $str_alt47$_ }), thread);
                                $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                                $progress_total$.setDynamicValue(length(list_var), thread);
                                $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                                {
                                    SubLObject _prev_bind_0_14 = $last_percent_progress_index$.currentBinding(thread);
                                    SubLObject _prev_bind_1_15 = $last_percent_progress_prediction$.currentBinding(thread);
                                    SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                    try {
                                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                        $last_percent_progress_prediction$.bind(NIL, thread);
                                        $within_noting_percent_progress$.bind(T, thread);
                                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                                        noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                                        {
                                            SubLObject csome_list_var = list_var;
                                            SubLObject ass = NIL;
                                            for (ass = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , ass = csome_list_var.first()) {
                                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                if (NIL != com.cyc.cycjava.cycl.kbs_utilities.opencyc_kbs_possibly_remove_excluded_synonymous_external_concept_assertion(ass, permitted_sources)) {
                                                    result = add(result, ONE_INTEGER);
                                                    last_count = add(last_count, ONE_INTEGER);
                                                }
                                            }
                                        }
                                        noting_percent_progress_postamble();
                                    } finally {
                                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                        $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                        $last_percent_progress_prediction$.rebind(_prev_bind_1_15, thread);
                                        $last_percent_progress_index$.rebind(_prev_bind_0_14, thread);
                                    }
                                }
                            }
                        } finally {
                            mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                        }
                    }
                } 
                return result;
            }
        }
    }

    public static SubLObject opencyc_kbs_remove_excluded_synonymous_external_concept_assertions() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = ZERO_INTEGER;
        SubLObject pass_number = ZERO_INTEGER;
        SubLObject last_count = MINUS_ONE_INTEGER;
        final SubLObject permitted_sources = (NIL != constants_high.find_constant($$$OpenCycPermittedSource)) ? isa.all_instances_in_all_mts(constants_high.find_constant($$$OpenCycPermittedSource)) : narts_high.nart_substitute($opencyc_permitted_sources$.getGlobalValue());
        while (NIL != subl_promotions.non_zero_integer_p(last_count)) {
            last_count = ZERO_INTEGER;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                pass_number = add(pass_number, ONE_INTEGER);
                final SubLObject list_var = kb_mapping.gather_predicate_extent_index($$synonymousExternalConcept, UNPROVIDED, UNPROVIDED);
                final SubLObject _prev_bind_0_$16 = $progress_note$.currentBinding(thread);
                final SubLObject _prev_bind_1_$17 = $progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = $progress_total$.currentBinding(thread);
                final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
                final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
                try {
                    $progress_note$.bind(NIL != cconcatenate($str83$Removing_non_opencyc_related___sy, new SubLObject[]{ format_nil.format_nil_a_no_copy(pass_number), $str84$_ }) ? cconcatenate($str83$Removing_non_opencyc_related___sy, new SubLObject[]{ format_nil.format_nil_a_no_copy(pass_number), $str84$_ }) : $$$cdolist, thread);
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
                        SubLObject ass = NIL;
                        ass = csome_list_var.first();
                        while (NIL != csome_list_var) {
                            if (NIL != opencyc_kbs_possibly_remove_excluded_synonymous_external_concept_assertion(ass, permitted_sources)) {
                                result = add(result, ONE_INTEGER);
                                last_count = add(last_count, ONE_INTEGER);
                            }
                            $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                            note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                            csome_list_var = csome_list_var.rest();
                            ass = csome_list_var.first();
                        } 
                    } finally {
                        final SubLObject _prev_bind_0_$17 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            noting_percent_progress_postamble();
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                        }
                    }
                } finally {
                    $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                    $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                    $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                    $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                    $progress_sofar$.rebind(_prev_bind_4, thread);
                    $progress_total$.rebind(_prev_bind_3, thread);
                    $progress_start_time$.rebind(_prev_bind_1_$17, thread);
                    $progress_note$.rebind(_prev_bind_0_$16, thread);
                }
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        } 
        return result;
    }

    public static final SubLObject opencyc_kbs_possibly_remove_excluded_synonymous_external_concept_assertion_alt(SubLObject ass, SubLObject permitted_sources) {
        if (NIL != assertion_handles.valid_assertionP(ass, UNPROVIDED)) {
            {
                SubLObject source = assertions_high.gaf_arg2(ass);
                if (NIL == list_utilities.member_eqP(source, permitted_sources)) {
                    if (NIL != (NIL == assertions_high.asserted_assertionP(ass) ? ((SubLObject) (cyc_remove_all_arguments(canon_tl.assertion_tl_ist_formula(ass), assertions_high.assertion_mt(ass)))) : cyc_unassert(canon_tl.assertion_tl_ist_formula(ass), assertions_high.assertion_mt(ass)))) {
                        return T;
                    }
                }
            }
        }
        return NIL;
    }

    public static SubLObject opencyc_kbs_possibly_remove_excluded_synonymous_external_concept_assertion(final SubLObject ass, final SubLObject permitted_sources) {
        if (NIL != assertion_handles.valid_assertionP(ass, UNPROVIDED)) {
            final SubLObject source = assertions_high.gaf_arg2(ass);
            if ((NIL == list_utilities.member_eqP(source, permitted_sources)) && (NIL != (NIL == assertions_high.asserted_assertionP(ass) ? cyc_kernel.cyc_remove_all_arguments(canon_tl.assertion_tl_ist_formula(ass), assertions_high.assertion_mt(ass)) : cyc_kernel.cyc_unassert(canon_tl.assertion_tl_ist_formula(ass), assertions_high.assertion_mt(ass))))) {
                return T;
            }
        }
        return NIL;
    }

    public static SubLObject opencyc_kbs_prepare_caches() {
        tva_cache.ensure_tva_cache_created($$broaderTerm_NonTaxonomic, ONE_INTEGER);
        return T;
    }

    public static SubLObject researchcyc_kill_expensive_true_rule_templates() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = list(narts_high.find_nart($list99));
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != forts.fort_p(v_term)) {
                final SubLObject kb_object_count_list_1 = kb_utilities.kb_object_count_list();
                final SubLObject str = cconcatenate($$$Killing_, format_nil.format_nil_s_no_copy(v_term));
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
                    fi.fi_kill_int(v_term);
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
                final SubLObject kb_object_count_list_2 = kb_utilities.kb_object_count_list();
                final SubLObject new_constant_count = kb_utilities.kb_object_count_lists_new_constant_count(kb_object_count_list_2, kb_object_count_list_1);
                final SubLObject new_nart_count = kb_utilities.kb_object_count_lists_new_nart_count(kb_object_count_list_2, kb_object_count_list_1);
                final SubLObject new_assertion_count = kb_utilities.kb_object_count_lists_new_assertion_count(kb_object_count_list_2, kb_object_count_list_1);
                final SubLObject new_kb_hl_support_count = kb_utilities.kb_object_count_lists_new_kb_hl_support_count(kb_object_count_list_2, kb_object_count_list_1);
                final SubLObject new_deduction_count = kb_utilities.kb_object_count_lists_new_deduction_count(kb_object_count_list_2, kb_object_count_list_1);
                if (((((NIL != subl_promotions.non_zero_integer_p(new_constant_count)) || (NIL != subl_promotions.non_zero_integer_p(new_nart_count))) || (NIL != subl_promotions.non_zero_integer_p(new_assertion_count))) || (NIL != subl_promotions.non_zero_integer_p(new_kb_hl_support_count))) || (NIL != subl_promotions.non_zero_integer_p(new_deduction_count))) {
                    if (NIL.isString()) {
                        format(T, $str89$___A__, NIL);
                    }
                    if (NIL != subl_promotions.non_zero_integer_p(new_constant_count)) {
                        format(T, $str90$___s_constant_A__A__, new SubLObject[]{ abs(new_constant_count), abs(new_constant_count).numG(ONE_INTEGER) ? $$$s_were : $$$_was, NIL != subl_promotions.positive_integer_p(new_constant_count) ? $$$created : $$$destroyed });
                    }
                    if (NIL != subl_promotions.non_zero_integer_p(new_nart_count)) {
                        format(T, $str95$___s_nart_A__A__, new SubLObject[]{ abs(new_nart_count), abs(new_nart_count).numG(ONE_INTEGER) ? $$$s_were : $$$_was, NIL != subl_promotions.positive_integer_p(new_nart_count) ? $$$created : $$$destroyed });
                    }
                    if (NIL != subl_promotions.non_zero_integer_p(new_assertion_count)) {
                        format(T, $str96$___s_assertion_A__A__, new SubLObject[]{ abs(new_assertion_count), abs(new_assertion_count).numG(ONE_INTEGER) ? $$$s_were : $$$_was, NIL != subl_promotions.positive_integer_p(new_assertion_count) ? $$$created : $$$destroyed });
                    }
                    if (NIL != subl_promotions.non_zero_integer_p(new_kb_hl_support_count)) {
                        format(T, $str97$___s_kb_hl_support_A__A__, new SubLObject[]{ abs(new_kb_hl_support_count), abs(new_kb_hl_support_count).numG(ONE_INTEGER) ? $$$s_were : $$$_was, NIL != subl_promotions.positive_integer_p(new_kb_hl_support_count) ? $$$created : $$$destroyed });
                    }
                    if (NIL != subl_promotions.non_zero_integer_p(new_deduction_count)) {
                        format(T, $str98$___s_deduction_A__A__, new SubLObject[]{ abs(new_deduction_count), abs(new_deduction_count).numG(ONE_INTEGER) ? $$$s_were : $$$_was, NIL != subl_promotions.positive_integer_p(new_deduction_count) ? $$$created : $$$destroyed });
                    }
                } else
                    if (NIL.isString()) {
                        format(T, $str89$___A__, NIL);
                    }

                force_output(T);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        return NIL;
    }

    public static final SubLObject researchcyc_kbs_remove_unwanted_tkb_narts_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            format(T, $str_alt51$Unmarking_instances_of___Terroris);
            {
                SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                try {
                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                    mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                    {
                        SubLObject node_var = $$TerroristAgent;
                        {
                            SubLObject _prev_bind_0_16 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            SubLObject _prev_bind_1_17 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                            try {
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
                                sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                {
                                    SubLObject node_var_18 = node_var;
                                    SubLObject deck_type = (false) ? ((SubLObject) ($QUEUE)) : $STACK;
                                    SubLObject recur_deck = deck.create_deck(deck_type);
                                    {
                                        SubLObject _prev_bind_0_19 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                        try {
                                            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                            {
                                                SubLObject tv_var = NIL;
                                                {
                                                    SubLObject _prev_bind_0_20 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_21 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
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
                                                            SubLObject _prev_bind_0_22 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                            SubLObject _prev_bind_1_23 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
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
                                                                        SubLObject _prev_bind_0_24 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                        SubLObject _prev_bind_1_25 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                        SubLObject _prev_bind_2_26 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var_18, UNPROVIDED);
                                                                            while (NIL != node_var_18) {
                                                                                {
                                                                                    SubLObject tt_node_var = node_var_18;
                                                                                    SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                                                                    SubLObject cdolist_list_var = accessible_modules;
                                                                                    SubLObject module_var = NIL;
                                                                                    for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                                        {
                                                                                            SubLObject _prev_bind_0_27 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                            SubLObject _prev_bind_1_28 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
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
                                                                                                                                            SubLObject _prev_bind_0_29 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                            try {
                                                                                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                                {
                                                                                                                                                    SubLObject iteration_state_30 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_30)) {
                                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                                        {
                                                                                                                                                            SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_30);
                                                                                                                                                            SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                                {
                                                                                                                                                                    SubLObject _prev_bind_0_31 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                    try {
                                                                                                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                        {
                                                                                                                                                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                            SubLObject cdolist_list_var_32 = new_list;
                                                                                                                                                                            SubLObject fort = NIL;
                                                                                                                                                                            for (fort = cdolist_list_var_32.first(); NIL != cdolist_list_var_32; cdolist_list_var_32 = cdolist_list_var_32.rest() , fort = cdolist_list_var_32.first()) {
                                                                                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(fort, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(fort, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                                                                                    if (NIL != forts.fort_p(fort)) {
                                                                                                                                                                                        unmark_kbs_fort(fort);
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    } finally {
                                                                                                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_31, thread);
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            iteration_state_30 = dictionary_contents.do_dictionary_contents_next(iteration_state_30);
                                                                                                                                                        }
                                                                                                                                                    } 
                                                                                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_30);
                                                                                                                                                }
                                                                                                                                            } finally {
                                                                                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_29, thread);
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
                                                                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt65$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
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
                                                                                                                        destructuring_bind_must_consp(current, datum, $list_alt66);
                                                                                                                        link_node = current.first();
                                                                                                                        current = current.rest();
                                                                                                                        destructuring_bind_must_consp(current, datum, $list_alt66);
                                                                                                                        mt = current.first();
                                                                                                                        current = current.rest();
                                                                                                                        destructuring_bind_must_consp(current, datum, $list_alt66);
                                                                                                                        tv = current.first();
                                                                                                                        current = current.rest();
                                                                                                                        if (NIL == current) {
                                                                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                                {
                                                                                                                                    SubLObject _prev_bind_0_33 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                    try {
                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                            {
                                                                                                                                                SubLObject _prev_bind_0_34 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                try {
                                                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                    {
                                                                                                                                                        SubLObject link_nodes = list(link_node);
                                                                                                                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                        SubLObject cdolist_list_var_35 = new_list;
                                                                                                                                                        SubLObject fort = NIL;
                                                                                                                                                        for (fort = cdolist_list_var_35.first(); NIL != cdolist_list_var_35; cdolist_list_var_35 = cdolist_list_var_35.rest() , fort = cdolist_list_var_35.first()) {
                                                                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(fort, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(fort, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                                                                if (NIL != forts.fort_p(fort)) {
                                                                                                                                                                    unmark_kbs_fort(fort);
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                } finally {
                                                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_34, thread);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    } finally {
                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_33, thread);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            cdestructuring_bind_error(datum, $list_alt66);
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                            {
                                                                                                                SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                SubLObject cdolist_list_var_36 = new_list;
                                                                                                                SubLObject generating_fn = NIL;
                                                                                                                for (generating_fn = cdolist_list_var_36.first(); NIL != cdolist_list_var_36; cdolist_list_var_36 = cdolist_list_var_36.rest() , generating_fn = cdolist_list_var_36.first()) {
                                                                                                                    {
                                                                                                                        SubLObject _prev_bind_0_37 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                        try {
                                                                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                            {
                                                                                                                                SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                                SubLObject new_list_38 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                SubLObject cdolist_list_var_39 = new_list_38;
                                                                                                                                SubLObject fort = NIL;
                                                                                                                                for (fort = cdolist_list_var_39.first(); NIL != cdolist_list_var_39; cdolist_list_var_39 = cdolist_list_var_39.rest() , fort = cdolist_list_var_39.first()) {
                                                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(fort, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(fort, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                                        if (NIL != forts.fort_p(fort)) {
                                                                                                                                            unmark_kbs_fort(fort);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        } finally {
                                                                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_37, thread);
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } finally {
                                                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_28, thread);
                                                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_27, thread);
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
                                                                                            SubLObject _prev_bind_0_40 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                            SubLObject _prev_bind_1_41 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                                {
                                                                                                    SubLObject node = function_terms.naut_to_nart(node_var_18);
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
                                                                                                                                            SubLObject _prev_bind_0_42 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                            try {
                                                                                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                                {
                                                                                                                                                    SubLObject iteration_state_43 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_43)) {
                                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                                        {
                                                                                                                                                            SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_43);
                                                                                                                                                            SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                                {
                                                                                                                                                                    SubLObject _prev_bind_0_44 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                    try {
                                                                                                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                        {
                                                                                                                                                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                            SubLObject cdolist_list_var_45 = new_list;
                                                                                                                                                                            SubLObject node_vars_link_node = NIL;
                                                                                                                                                                            for (node_vars_link_node = cdolist_list_var_45.first(); NIL != cdolist_list_var_45; cdolist_list_var_45 = cdolist_list_var_45.rest() , node_vars_link_node = cdolist_list_var_45.first()) {
                                                                                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    } finally {
                                                                                                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_44, thread);
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            iteration_state_43 = dictionary_contents.do_dictionary_contents_next(iteration_state_43);
                                                                                                                                                        }
                                                                                                                                                    } 
                                                                                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_43);
                                                                                                                                                }
                                                                                                                                            } finally {
                                                                                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_42, thread);
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
                                                                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt65$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                            {
                                                                                                                SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                SubLObject cdolist_list_var_46 = new_list;
                                                                                                                SubLObject generating_fn = NIL;
                                                                                                                for (generating_fn = cdolist_list_var_46.first(); NIL != cdolist_list_var_46; cdolist_list_var_46 = cdolist_list_var_46.rest() , generating_fn = cdolist_list_var_46.first()) {
                                                                                                                    {
                                                                                                                        SubLObject _prev_bind_0_47 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                        try {
                                                                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                            {
                                                                                                                                SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                                SubLObject new_list_48 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                SubLObject cdolist_list_var_49 = new_list_48;
                                                                                                                                SubLObject node_vars_link_node = NIL;
                                                                                                                                for (node_vars_link_node = cdolist_list_var_49.first(); NIL != cdolist_list_var_49; cdolist_list_var_49 = cdolist_list_var_49.rest() , node_vars_link_node = cdolist_list_var_49.first()) {
                                                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                        deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        } finally {
                                                                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_47, thread);
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } finally {
                                                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_41, thread);
                                                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_40, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                node_var_18 = deck.deck_pop(recur_deck);
                                                                            } 
                                                                        } finally {
                                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_26, thread);
                                                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_25, thread);
                                                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_24, thread);
                                                                        }
                                                                    }
                                                                } else {
                                                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt67$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                            } finally {
                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                                                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_23, thread);
                                                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_22, thread);
                                                            }
                                                        }
                                                    } finally {
                                                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_21, thread);
                                                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_20, thread);
                                                    }
                                                }
                                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                            }
                                        } finally {
                                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_19, thread);
                                        }
                                    }
                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                }
                            } finally {
                                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1_17, thread);
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_16, thread);
                            }
                        }
                    }
                    {
                        SubLObject node_var = $$TerroristAct;
                        {
                            SubLObject _prev_bind_0_50 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            SubLObject _prev_bind_1_51 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                            try {
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
                                sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                {
                                    SubLObject node_var_52 = node_var;
                                    SubLObject deck_type = (false) ? ((SubLObject) ($QUEUE)) : $STACK;
                                    SubLObject recur_deck = deck.create_deck(deck_type);
                                    {
                                        SubLObject _prev_bind_0_53 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                        try {
                                            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                            {
                                                SubLObject tv_var = NIL;
                                                {
                                                    SubLObject _prev_bind_0_54 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_55 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
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
                                                            SubLObject _prev_bind_0_56 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                            SubLObject _prev_bind_1_57 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
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
                                                                        SubLObject _prev_bind_0_58 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                        SubLObject _prev_bind_1_59 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                        SubLObject _prev_bind_2_60 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var_52, UNPROVIDED);
                                                                            while (NIL != node_var_52) {
                                                                                {
                                                                                    SubLObject tt_node_var = node_var_52;
                                                                                    SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                                                                    SubLObject cdolist_list_var = accessible_modules;
                                                                                    SubLObject module_var = NIL;
                                                                                    for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                                        {
                                                                                            SubLObject _prev_bind_0_61 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                            SubLObject _prev_bind_1_62 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
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
                                                                                                                                            SubLObject _prev_bind_0_63 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                            try {
                                                                                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                                {
                                                                                                                                                    SubLObject iteration_state_64 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_64)) {
                                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                                        {
                                                                                                                                                            SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_64);
                                                                                                                                                            SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                                {
                                                                                                                                                                    SubLObject _prev_bind_0_65 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                    try {
                                                                                                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                        {
                                                                                                                                                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                            SubLObject cdolist_list_var_66 = new_list;
                                                                                                                                                                            SubLObject fort = NIL;
                                                                                                                                                                            for (fort = cdolist_list_var_66.first(); NIL != cdolist_list_var_66; cdolist_list_var_66 = cdolist_list_var_66.rest() , fort = cdolist_list_var_66.first()) {
                                                                                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(fort, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(fort, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                                                                                    if (NIL != forts.fort_p(fort)) {
                                                                                                                                                                                        unmark_kbs_fort(fort);
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    } finally {
                                                                                                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_65, thread);
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            iteration_state_64 = dictionary_contents.do_dictionary_contents_next(iteration_state_64);
                                                                                                                                                        }
                                                                                                                                                    } 
                                                                                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_64);
                                                                                                                                                }
                                                                                                                                            } finally {
                                                                                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_63, thread);
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
                                                                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt65$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
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
                                                                                                                        destructuring_bind_must_consp(current, datum, $list_alt66);
                                                                                                                        link_node = current.first();
                                                                                                                        current = current.rest();
                                                                                                                        destructuring_bind_must_consp(current, datum, $list_alt66);
                                                                                                                        mt = current.first();
                                                                                                                        current = current.rest();
                                                                                                                        destructuring_bind_must_consp(current, datum, $list_alt66);
                                                                                                                        tv = current.first();
                                                                                                                        current = current.rest();
                                                                                                                        if (NIL == current) {
                                                                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                                {
                                                                                                                                    SubLObject _prev_bind_0_67 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                    try {
                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                            {
                                                                                                                                                SubLObject _prev_bind_0_68 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                try {
                                                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                    {
                                                                                                                                                        SubLObject link_nodes = list(link_node);
                                                                                                                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                        SubLObject cdolist_list_var_69 = new_list;
                                                                                                                                                        SubLObject fort = NIL;
                                                                                                                                                        for (fort = cdolist_list_var_69.first(); NIL != cdolist_list_var_69; cdolist_list_var_69 = cdolist_list_var_69.rest() , fort = cdolist_list_var_69.first()) {
                                                                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(fort, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(fort, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                                                                if (NIL != forts.fort_p(fort)) {
                                                                                                                                                                    unmark_kbs_fort(fort);
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                } finally {
                                                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_68, thread);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    } finally {
                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_67, thread);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            cdestructuring_bind_error(datum, $list_alt66);
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                            {
                                                                                                                SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                SubLObject cdolist_list_var_70 = new_list;
                                                                                                                SubLObject generating_fn = NIL;
                                                                                                                for (generating_fn = cdolist_list_var_70.first(); NIL != cdolist_list_var_70; cdolist_list_var_70 = cdolist_list_var_70.rest() , generating_fn = cdolist_list_var_70.first()) {
                                                                                                                    {
                                                                                                                        SubLObject _prev_bind_0_71 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                        try {
                                                                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                            {
                                                                                                                                SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                                SubLObject new_list_72 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                SubLObject cdolist_list_var_73 = new_list_72;
                                                                                                                                SubLObject fort = NIL;
                                                                                                                                for (fort = cdolist_list_var_73.first(); NIL != cdolist_list_var_73; cdolist_list_var_73 = cdolist_list_var_73.rest() , fort = cdolist_list_var_73.first()) {
                                                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(fort, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(fort, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                                        if (NIL != forts.fort_p(fort)) {
                                                                                                                                            unmark_kbs_fort(fort);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        } finally {
                                                                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_71, thread);
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } finally {
                                                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_62, thread);
                                                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_61, thread);
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
                                                                                            SubLObject _prev_bind_0_74 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                            SubLObject _prev_bind_1_75 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                                {
                                                                                                    SubLObject node = function_terms.naut_to_nart(node_var_52);
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
                                                                                                                                            SubLObject _prev_bind_0_76 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                            try {
                                                                                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                                {
                                                                                                                                                    SubLObject iteration_state_77 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_77)) {
                                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                                        {
                                                                                                                                                            SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_77);
                                                                                                                                                            SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                                {
                                                                                                                                                                    SubLObject _prev_bind_0_78 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                    try {
                                                                                                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                        {
                                                                                                                                                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                            SubLObject cdolist_list_var_79 = new_list;
                                                                                                                                                                            SubLObject node_vars_link_node = NIL;
                                                                                                                                                                            for (node_vars_link_node = cdolist_list_var_79.first(); NIL != cdolist_list_var_79; cdolist_list_var_79 = cdolist_list_var_79.rest() , node_vars_link_node = cdolist_list_var_79.first()) {
                                                                                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    } finally {
                                                                                                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_78, thread);
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            iteration_state_77 = dictionary_contents.do_dictionary_contents_next(iteration_state_77);
                                                                                                                                                        }
                                                                                                                                                    } 
                                                                                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_77);
                                                                                                                                                }
                                                                                                                                            } finally {
                                                                                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_76, thread);
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
                                                                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt65$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                            {
                                                                                                                SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                SubLObject cdolist_list_var_80 = new_list;
                                                                                                                SubLObject generating_fn = NIL;
                                                                                                                for (generating_fn = cdolist_list_var_80.first(); NIL != cdolist_list_var_80; cdolist_list_var_80 = cdolist_list_var_80.rest() , generating_fn = cdolist_list_var_80.first()) {
                                                                                                                    {
                                                                                                                        SubLObject _prev_bind_0_81 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                        try {
                                                                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                            {
                                                                                                                                SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                                SubLObject new_list_82 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                SubLObject cdolist_list_var_83 = new_list_82;
                                                                                                                                SubLObject node_vars_link_node = NIL;
                                                                                                                                for (node_vars_link_node = cdolist_list_var_83.first(); NIL != cdolist_list_var_83; cdolist_list_var_83 = cdolist_list_var_83.rest() , node_vars_link_node = cdolist_list_var_83.first()) {
                                                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                        deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        } finally {
                                                                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_81, thread);
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } finally {
                                                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_75, thread);
                                                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_74, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                node_var_52 = deck.deck_pop(recur_deck);
                                                                            } 
                                                                        } finally {
                                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_60, thread);
                                                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_59, thread);
                                                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_58, thread);
                                                                        }
                                                                    }
                                                                } else {
                                                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt67$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                            } finally {
                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                                                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_57, thread);
                                                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_56, thread);
                                                            }
                                                        }
                                                    } finally {
                                                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_55, thread);
                                                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_54, thread);
                                                    }
                                                }
                                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                            }
                                        } finally {
                                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_53, thread);
                                        }
                                    }
                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                }
                            } finally {
                                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1_51, thread);
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_50, thread);
                            }
                        }
                    }
                    {
                        SubLObject node_var = $$HostileSocialAction;
                        {
                            SubLObject _prev_bind_0_84 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            SubLObject _prev_bind_1_85 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
                            try {
                                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
                                sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                {
                                    SubLObject node_var_86 = node_var;
                                    SubLObject deck_type = (false) ? ((SubLObject) ($QUEUE)) : $STACK;
                                    SubLObject recur_deck = deck.create_deck(deck_type);
                                    {
                                        SubLObject _prev_bind_0_87 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                                        try {
                                            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                                            {
                                                SubLObject tv_var = NIL;
                                                {
                                                    SubLObject _prev_bind_0_88 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_89 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
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
                                                            SubLObject _prev_bind_0_90 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                                            SubLObject _prev_bind_1_91 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
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
                                                                        SubLObject _prev_bind_0_92 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                                                        SubLObject _prev_bind_1_93 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                                                        SubLObject _prev_bind_2_94 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                        try {
                                                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var_86, UNPROVIDED);
                                                                            while (NIL != node_var_86) {
                                                                                {
                                                                                    SubLObject tt_node_var = node_var_86;
                                                                                    SubLObject accessible_modules = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                                                                    SubLObject cdolist_list_var = accessible_modules;
                                                                                    SubLObject module_var = NIL;
                                                                                    for (module_var = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , module_var = cdolist_list_var.first()) {
                                                                                        {
                                                                                            SubLObject _prev_bind_0_95 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                            SubLObject _prev_bind_1_96 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
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
                                                                                                                                            SubLObject _prev_bind_0_97 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                            try {
                                                                                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                                {
                                                                                                                                                    SubLObject iteration_state_98 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_98)) {
                                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                                        {
                                                                                                                                                            SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_98);
                                                                                                                                                            SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                                {
                                                                                                                                                                    SubLObject _prev_bind_0_99 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                    try {
                                                                                                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                        {
                                                                                                                                                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                            SubLObject cdolist_list_var_100 = new_list;
                                                                                                                                                                            SubLObject fort = NIL;
                                                                                                                                                                            for (fort = cdolist_list_var_100.first(); NIL != cdolist_list_var_100; cdolist_list_var_100 = cdolist_list_var_100.rest() , fort = cdolist_list_var_100.first()) {
                                                                                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(fort, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(fort, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                                                                                    if (NIL != forts.fort_p(fort)) {
                                                                                                                                                                                        unmark_kbs_fort(fort);
                                                                                                                                                                                    }
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    } finally {
                                                                                                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_99, thread);
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            iteration_state_98 = dictionary_contents.do_dictionary_contents_next(iteration_state_98);
                                                                                                                                                        }
                                                                                                                                                    } 
                                                                                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_98);
                                                                                                                                                }
                                                                                                                                            } finally {
                                                                                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_97, thread);
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
                                                                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt65$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
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
                                                                                                                        destructuring_bind_must_consp(current, datum, $list_alt66);
                                                                                                                        link_node = current.first();
                                                                                                                        current = current.rest();
                                                                                                                        destructuring_bind_must_consp(current, datum, $list_alt66);
                                                                                                                        mt = current.first();
                                                                                                                        current = current.rest();
                                                                                                                        destructuring_bind_must_consp(current, datum, $list_alt66);
                                                                                                                        tv = current.first();
                                                                                                                        current = current.rest();
                                                                                                                        if (NIL == current) {
                                                                                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                                                                                {
                                                                                                                                    SubLObject _prev_bind_0_101 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                    try {
                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                        if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                            {
                                                                                                                                                SubLObject _prev_bind_0_102 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                try {
                                                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                    {
                                                                                                                                                        SubLObject link_nodes = list(link_node);
                                                                                                                                                        SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                        SubLObject cdolist_list_var_103 = new_list;
                                                                                                                                                        SubLObject fort = NIL;
                                                                                                                                                        for (fort = cdolist_list_var_103.first(); NIL != cdolist_list_var_103; cdolist_list_var_103 = cdolist_list_var_103.rest() , fort = cdolist_list_var_103.first()) {
                                                                                                                                                            if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(fort, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(fort, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                                                                if (NIL != forts.fort_p(fort)) {
                                                                                                                                                                    unmark_kbs_fort(fort);
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                        }
                                                                                                                                                    }
                                                                                                                                                } finally {
                                                                                                                                                    sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_102, thread);
                                                                                                                                                }
                                                                                                                                            }
                                                                                                                                        }
                                                                                                                                    } finally {
                                                                                                                                        sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_101, thread);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        } else {
                                                                                                                            cdestructuring_bind_error(datum, $list_alt66);
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                            {
                                                                                                                SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                SubLObject cdolist_list_var_104 = new_list;
                                                                                                                SubLObject generating_fn = NIL;
                                                                                                                for (generating_fn = cdolist_list_var_104.first(); NIL != cdolist_list_var_104; cdolist_list_var_104 = cdolist_list_var_104.rest() , generating_fn = cdolist_list_var_104.first()) {
                                                                                                                    {
                                                                                                                        SubLObject _prev_bind_0_105 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                        try {
                                                                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                            {
                                                                                                                                SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                                SubLObject new_list_106 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                SubLObject cdolist_list_var_107 = new_list_106;
                                                                                                                                SubLObject fort = NIL;
                                                                                                                                for (fort = cdolist_list_var_107.first(); NIL != cdolist_list_var_107; cdolist_list_var_107 = cdolist_list_var_107.rest() , fort = cdolist_list_var_107.first()) {
                                                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(fort, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(fort, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                                                        if (NIL != forts.fort_p(fort)) {
                                                                                                                                            unmark_kbs_fort(fort);
                                                                                                                                        }
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        } finally {
                                                                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_105, thread);
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } finally {
                                                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_96, thread);
                                                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_95, thread);
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
                                                                                            SubLObject _prev_bind_0_108 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                                                            SubLObject _prev_bind_1_109 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                                                            try {
                                                                                                sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                                                                sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? ((SubLObject) (makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)))) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                                                                {
                                                                                                    SubLObject node = function_terms.naut_to_nart(node_var_86);
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
                                                                                                                                            SubLObject _prev_bind_0_110 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                                                                                            try {
                                                                                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                                                                                {
                                                                                                                                                    SubLObject iteration_state_111 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                                                                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_111)) {
                                                                                                                                                        thread.resetMultipleValues();
                                                                                                                                                        {
                                                                                                                                                            SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_111);
                                                                                                                                                            SubLObject link_nodes = thread.secondMultipleValue();
                                                                                                                                                            thread.resetMultipleValues();
                                                                                                                                                            if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                                                                                                {
                                                                                                                                                                    SubLObject _prev_bind_0_112 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                                                                                                    try {
                                                                                                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                                                                                                        {
                                                                                                                                                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                                                            SubLObject cdolist_list_var_113 = new_list;
                                                                                                                                                                            SubLObject node_vars_link_node = NIL;
                                                                                                                                                                            for (node_vars_link_node = cdolist_list_var_113.first(); NIL != cdolist_list_var_113; cdolist_list_var_113 = cdolist_list_var_113.rest() , node_vars_link_node = cdolist_list_var_113.first()) {
                                                                                                                                                                                if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                                                                    deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                                                                }
                                                                                                                                                                            }
                                                                                                                                                                        }
                                                                                                                                                                    } finally {
                                                                                                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_112, thread);
                                                                                                                                                                    }
                                                                                                                                                                }
                                                                                                                                                            }
                                                                                                                                                            iteration_state_111 = dictionary_contents.do_dictionary_contents_next(iteration_state_111);
                                                                                                                                                        }
                                                                                                                                                    } 
                                                                                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_111);
                                                                                                                                                }
                                                                                                                                            } finally {
                                                                                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_110, thread);
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
                                                                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str_alt65$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                                                            }
                                                                                                        }
                                                                                                    } else {
                                                                                                        if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                                                            {
                                                                                                                SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                                                                SubLObject cdolist_list_var_114 = new_list;
                                                                                                                SubLObject generating_fn = NIL;
                                                                                                                for (generating_fn = cdolist_list_var_114.first(); NIL != cdolist_list_var_114; cdolist_list_var_114 = cdolist_list_var_114.rest() , generating_fn = cdolist_list_var_114.first()) {
                                                                                                                    {
                                                                                                                        SubLObject _prev_bind_0_115 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                                                                        try {
                                                                                                                            sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                                                                            {
                                                                                                                                SubLObject link_nodes = funcall(generating_fn, node);
                                                                                                                                SubLObject new_list_116 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes))) : link_nodes;
                                                                                                                                SubLObject cdolist_list_var_117 = new_list_116;
                                                                                                                                SubLObject node_vars_link_node = NIL;
                                                                                                                                for (node_vars_link_node = cdolist_list_var_117.first(); NIL != cdolist_list_var_117; cdolist_list_var_117 = cdolist_list_var_117.rest() , node_vars_link_node = cdolist_list_var_117.first()) {
                                                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, UNPROVIDED)) {
                                                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, UNPROVIDED);
                                                                                                                                        deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                                                    }
                                                                                                                                }
                                                                                                                            }
                                                                                                                        } finally {
                                                                                                                            sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_115, thread);
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } finally {
                                                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_109, thread);
                                                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_108, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                                node_var_86 = deck.deck_pop(recur_deck);
                                                                            } 
                                                                        } finally {
                                                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_94, thread);
                                                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_93, thread);
                                                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_92, thread);
                                                                        }
                                                                    }
                                                                } else {
                                                                    sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str_alt67$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                                }
                                                            } finally {
                                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_4, thread);
                                                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_3, thread);
                                                                sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_2, thread);
                                                                sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_91, thread);
                                                                sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_90, thread);
                                                            }
                                                        }
                                                    } finally {
                                                        sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_89, thread);
                                                        sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_88, thread);
                                                    }
                                                }
                                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                            }
                                        } finally {
                                            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_87, thread);
                                        }
                                    }
                                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                }
                            } finally {
                                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1_85, thread);
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_84, thread);
                            }
                        }
                    }
                } finally {
                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                }
            }
            return NIL;
        }
    }

    public static SubLObject researchcyc_kbs_remove_unwanted_tkb_narts() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        format(T, $str100$Unmarking_instances_of___Terroris);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            SubLObject node_var = $$TerroristAgent;
            final SubLObject _prev_bind_0_$19 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            final SubLObject _prev_bind_1_$20 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
            try {
                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
                sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    SubLObject node_var_$21 = node_var;
                    final SubLObject deck_type = $STACK;
                    final SubLObject recur_deck = deck.create_deck(deck_type);
                    final SubLObject _prev_bind_0_$20 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject tv_var = NIL;
                            final SubLObject _prev_bind_0_$21 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$21 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                    if (pcase_var.eql($ERROR)) {
                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str108$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($CERROR)) {
                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str108$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else
                                            if (pcase_var.eql($WARN)) {
                                                Errors.warn($str108$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                            } else {
                                                Errors.warn($str113$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                Errors.cerror($$$continue_anyway, $str108$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                            }


                                }
                                final SubLObject _prev_bind_0_$22 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$22 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
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
                                        final SubLObject _prev_bind_0_$23 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$23 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$29 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$21, UNPROVIDED);
                                            while (NIL != node_var_$21) {
                                                final SubLObject tt_node_var = node_var_$21;
                                                SubLObject cdolist_list_var;
                                                final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                                SubLObject module_var = NIL;
                                                module_var = cdolist_list_var.first();
                                                while (NIL != cdolist_list_var) {
                                                    final SubLObject _prev_bind_0_$24 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$24 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
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
                                                                            final SubLObject _prev_bind_0_$25 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                SubLObject iteration_state_$33;
                                                                                for (iteration_state_$33 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$33); iteration_state_$33 = dictionary_contents.do_dictionary_contents_next(iteration_state_$33)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$33);
                                                                                    final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        final SubLObject _prev_bind_0_$26 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            final SubLObject sol = link_nodes;
                                                                                            if (NIL != set.set_p(sol)) {
                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state;
                                                                                                SubLObject fort;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    fort = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state, fort)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(fort, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(fort, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (NIL != forts.fort_p(fort)) {
                                                                                                            kbs_identification.unmark_kbs_fort(fort);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (sol.isList()) {
                                                                                                    SubLObject csome_list_var = sol;
                                                                                                    SubLObject fort2 = NIL;
                                                                                                    fort2 = csome_list_var.first();
                                                                                                    while (NIL != csome_list_var) {
                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(fort2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(fort2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            if (NIL != forts.fort_p(fort2)) {
                                                                                                                kbs_identification.unmark_kbs_fort(fort2);
                                                                                                            }
                                                                                                        }
                                                                                                        csome_list_var = csome_list_var.rest();
                                                                                                        fort2 = csome_list_var.first();
                                                                                                    } 
                                                                                                } else {
                                                                                                    Errors.error($str114$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$26, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$33);
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$25, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str115$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
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
                                                                    destructuring_bind_must_consp(current, datum, $list116);
                                                                    link_node = current.first();
                                                                    current = current.rest();
                                                                    destructuring_bind_must_consp(current, datum, $list116);
                                                                    mt2 = current.first();
                                                                    current = current.rest();
                                                                    destructuring_bind_must_consp(current, datum, $list116);
                                                                    tv2 = current.first();
                                                                    current = current.rest();
                                                                    if (NIL == current) {
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                            final SubLObject _prev_bind_0_$27 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                    final SubLObject _prev_bind_0_$28 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                        final SubLObject sol;
                                                                                        final SubLObject link_nodes2 = sol = list(link_node);
                                                                                        if (NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject fort;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                fort = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state, fort)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(fort, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(fort, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if (NIL != forts.fort_p(fort)) {
                                                                                                        kbs_identification.unmark_kbs_fort(fort);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol.isList()) {
                                                                                                SubLObject csome_list_var_$37 = sol;
                                                                                                SubLObject fort2 = NIL;
                                                                                                fort2 = csome_list_var_$37.first();
                                                                                                while (NIL != csome_list_var_$37) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(fort2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(fort2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (NIL != forts.fort_p(fort2)) {
                                                                                                            kbs_identification.unmark_kbs_fort(fort2);
                                                                                                        }
                                                                                                    }
                                                                                                    csome_list_var_$37 = csome_list_var_$37.rest();
                                                                                                    fort2 = csome_list_var_$37.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error($str114$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$28, thread);
                                                                                    }
                                                                                }
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$27, thread);
                                                                            }
                                                                        }
                                                                    } else {
                                                                        cdestructuring_bind_error(datum, $list116);
                                                                    }
                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                    instance_tuple = csome_list_var2.first();
                                                                } 
                                                            }
                                                        } else
                                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                SubLObject cdolist_list_var_$38;
                                                                final SubLObject new_list = cdolist_list_var_$38 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                SubLObject generating_fn = NIL;
                                                                generating_fn = cdolist_list_var_$38.first();
                                                                while (NIL != cdolist_list_var_$38) {
                                                                    final SubLObject _prev_bind_0_$29 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                        final SubLObject sol2;
                                                                        final SubLObject link_nodes3 = sol2 = funcall(generating_fn, node);
                                                                        if (NIL != set.set_p(sol2)) {
                                                                            final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                            SubLObject basis_object2;
                                                                            SubLObject state2;
                                                                            SubLObject fort3;
                                                                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                fort3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state2, fort3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(fort3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(fort3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                    if (NIL != forts.fort_p(fort3)) {
                                                                                        kbs_identification.unmark_kbs_fort(fort3);
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else
                                                                            if (sol2.isList()) {
                                                                                SubLObject csome_list_var3 = sol2;
                                                                                SubLObject fort4 = NIL;
                                                                                fort4 = csome_list_var3.first();
                                                                                while (NIL != csome_list_var3) {
                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(fort4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(fort4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                        if (NIL != forts.fort_p(fort4)) {
                                                                                            kbs_identification.unmark_kbs_fort(fort4);
                                                                                        }
                                                                                    }
                                                                                    csome_list_var3 = csome_list_var3.rest();
                                                                                    fort4 = csome_list_var3.first();
                                                                                } 
                                                                            } else {
                                                                                Errors.error($str114$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                            }

                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$29, thread);
                                                                    }
                                                                    cdolist_list_var_$38 = cdolist_list_var_$38.rest();
                                                                    generating_fn = cdolist_list_var_$38.first();
                                                                } 
                                                            }

                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$24, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$24, thread);
                                                    }
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    module_var = cdolist_list_var.first();
                                                } 
                                                SubLObject cdolist_list_var2;
                                                final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)));
                                                SubLObject module_var2 = NIL;
                                                module_var2 = cdolist_list_var2.first();
                                                while (NIL != cdolist_list_var2) {
                                                    final SubLObject _prev_bind_0_$30 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$25 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                        final SubLObject node2 = function_terms.naut_to_nart(node_var_$21);
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
                                                                            final SubLObject _prev_bind_0_$31 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                                SubLObject iteration_state_$34;
                                                                                for (iteration_state_$34 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$34); iteration_state_$34 = dictionary_contents.do_dictionary_contents_next(iteration_state_$34)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$34);
                                                                                    final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                        final SubLObject _prev_bind_0_$32 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
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
                                                                                                    Errors.error($str114$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$32, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$34);
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$31, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str115$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                        } else
                                                            if (NIL != obsolete.cnat_p(node2, UNPROVIDED)) {
                                                                SubLObject cdolist_list_var_$39;
                                                                final SubLObject new_list2 = cdolist_list_var_$39 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                SubLObject generating_fn2 = NIL;
                                                                generating_fn2 = cdolist_list_var_$39.first();
                                                                while (NIL != cdolist_list_var_$39) {
                                                                    final SubLObject _prev_bind_0_$33 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
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
                                                                                Errors.error($str114$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                            }

                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$33, thread);
                                                                    }
                                                                    cdolist_list_var_$39 = cdolist_list_var_$39.rest();
                                                                    generating_fn2 = cdolist_list_var_$39.first();
                                                                } 
                                                            }

                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$25, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$30, thread);
                                                    }
                                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                                    module_var2 = cdolist_list_var2.first();
                                                } 
                                                node_var_$21 = deck.deck_pop(recur_deck);
                                            } 
                                        } finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$29, thread);
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$23, thread);
                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$23, thread);
                                        }
                                    } else {
                                        sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str117$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                } finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$22, thread);
                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$22, thread);
                                }
                            } finally {
                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$21, thread);
                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$21, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$34 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$34, thread);
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$20, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$35 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$35, thread);
                    }
                }
            } finally {
                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1_$20, thread);
                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$19, thread);
            }
            node_var = $$TerroristAct;
            final SubLObject _prev_bind_0_$36 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            final SubLObject _prev_bind_1_$26 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
            try {
                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
                sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    SubLObject node_var_$22 = node_var;
                    final SubLObject deck_type = $STACK;
                    final SubLObject recur_deck = deck.create_deck(deck_type);
                    final SubLObject _prev_bind_0_$37 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject tv_var = NIL;
                            final SubLObject _prev_bind_0_$38 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$27 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                    if (pcase_var.eql($ERROR)) {
                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str108$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($CERROR)) {
                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str108$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else
                                            if (pcase_var.eql($WARN)) {
                                                Errors.warn($str108$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                            } else {
                                                Errors.warn($str113$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                Errors.cerror($$$continue_anyway, $str108$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                            }


                                }
                                final SubLObject _prev_bind_0_$39 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$28 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
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
                                        final SubLObject _prev_bind_0_$40 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$29 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$30 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$22, UNPROVIDED);
                                            while (NIL != node_var_$22) {
                                                final SubLObject tt_node_var = node_var_$22;
                                                SubLObject cdolist_list_var;
                                                final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                                SubLObject module_var = NIL;
                                                module_var = cdolist_list_var.first();
                                                while (NIL != cdolist_list_var) {
                                                    final SubLObject _prev_bind_0_$41 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$30 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
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
                                                                            final SubLObject _prev_bind_0_$42 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                SubLObject iteration_state_$35;
                                                                                for (iteration_state_$35 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$35); iteration_state_$35 = dictionary_contents.do_dictionary_contents_next(iteration_state_$35)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$35);
                                                                                    final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        final SubLObject _prev_bind_0_$43 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            final SubLObject sol = link_nodes;
                                                                                            if (NIL != set.set_p(sol)) {
                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state;
                                                                                                SubLObject fort;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    fort = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state, fort)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(fort, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(fort, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (NIL != forts.fort_p(fort)) {
                                                                                                            kbs_identification.unmark_kbs_fort(fort);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (sol.isList()) {
                                                                                                    SubLObject csome_list_var = sol;
                                                                                                    SubLObject fort2 = NIL;
                                                                                                    fort2 = csome_list_var.first();
                                                                                                    while (NIL != csome_list_var) {
                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(fort2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(fort2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            if (NIL != forts.fort_p(fort2)) {
                                                                                                                kbs_identification.unmark_kbs_fort(fort2);
                                                                                                            }
                                                                                                        }
                                                                                                        csome_list_var = csome_list_var.rest();
                                                                                                        fort2 = csome_list_var.first();
                                                                                                    } 
                                                                                                } else {
                                                                                                    Errors.error($str114$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$43, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$35);
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$42, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str115$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
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
                                                                    destructuring_bind_must_consp(current, datum, $list116);
                                                                    link_node = current.first();
                                                                    current = current.rest();
                                                                    destructuring_bind_must_consp(current, datum, $list116);
                                                                    mt2 = current.first();
                                                                    current = current.rest();
                                                                    destructuring_bind_must_consp(current, datum, $list116);
                                                                    tv2 = current.first();
                                                                    current = current.rest();
                                                                    if (NIL == current) {
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                            final SubLObject _prev_bind_0_$44 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                    final SubLObject _prev_bind_0_$45 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                        final SubLObject sol;
                                                                                        final SubLObject link_nodes2 = sol = list(link_node);
                                                                                        if (NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject fort;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                fort = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state, fort)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(fort, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(fort, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if (NIL != forts.fort_p(fort)) {
                                                                                                        kbs_identification.unmark_kbs_fort(fort);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol.isList()) {
                                                                                                SubLObject csome_list_var_$38 = sol;
                                                                                                SubLObject fort2 = NIL;
                                                                                                fort2 = csome_list_var_$38.first();
                                                                                                while (NIL != csome_list_var_$38) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(fort2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(fort2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (NIL != forts.fort_p(fort2)) {
                                                                                                            kbs_identification.unmark_kbs_fort(fort2);
                                                                                                        }
                                                                                                    }
                                                                                                    csome_list_var_$38 = csome_list_var_$38.rest();
                                                                                                    fort2 = csome_list_var_$38.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error($str114$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$45, thread);
                                                                                    }
                                                                                }
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$44, thread);
                                                                            }
                                                                        }
                                                                    } else {
                                                                        cdestructuring_bind_error(datum, $list116);
                                                                    }
                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                    instance_tuple = csome_list_var2.first();
                                                                } 
                                                            }
                                                        } else
                                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                SubLObject cdolist_list_var_$40;
                                                                final SubLObject new_list = cdolist_list_var_$40 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                SubLObject generating_fn = NIL;
                                                                generating_fn = cdolist_list_var_$40.first();
                                                                while (NIL != cdolist_list_var_$40) {
                                                                    final SubLObject _prev_bind_0_$46 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                        final SubLObject sol2;
                                                                        final SubLObject link_nodes3 = sol2 = funcall(generating_fn, node);
                                                                        if (NIL != set.set_p(sol2)) {
                                                                            final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                            SubLObject basis_object2;
                                                                            SubLObject state2;
                                                                            SubLObject fort3;
                                                                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                fort3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state2, fort3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(fort3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(fort3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                    if (NIL != forts.fort_p(fort3)) {
                                                                                        kbs_identification.unmark_kbs_fort(fort3);
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else
                                                                            if (sol2.isList()) {
                                                                                SubLObject csome_list_var3 = sol2;
                                                                                SubLObject fort4 = NIL;
                                                                                fort4 = csome_list_var3.first();
                                                                                while (NIL != csome_list_var3) {
                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(fort4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(fort4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                        if (NIL != forts.fort_p(fort4)) {
                                                                                            kbs_identification.unmark_kbs_fort(fort4);
                                                                                        }
                                                                                    }
                                                                                    csome_list_var3 = csome_list_var3.rest();
                                                                                    fort4 = csome_list_var3.first();
                                                                                } 
                                                                            } else {
                                                                                Errors.error($str114$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                            }

                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$46, thread);
                                                                    }
                                                                    cdolist_list_var_$40 = cdolist_list_var_$40.rest();
                                                                    generating_fn = cdolist_list_var_$40.first();
                                                                } 
                                                            }

                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$30, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$41, thread);
                                                    }
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    module_var = cdolist_list_var.first();
                                                } 
                                                SubLObject cdolist_list_var2;
                                                final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)));
                                                SubLObject module_var2 = NIL;
                                                module_var2 = cdolist_list_var2.first();
                                                while (NIL != cdolist_list_var2) {
                                                    final SubLObject _prev_bind_0_$47 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$31 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                        final SubLObject node2 = function_terms.naut_to_nart(node_var_$22);
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
                                                                            final SubLObject _prev_bind_0_$48 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                                SubLObject iteration_state_$36;
                                                                                for (iteration_state_$36 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$36); iteration_state_$36 = dictionary_contents.do_dictionary_contents_next(iteration_state_$36)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$36);
                                                                                    final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                        final SubLObject _prev_bind_0_$49 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
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
                                                                                                    Errors.error($str114$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$49, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$36);
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$48, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str115$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                        } else
                                                            if (NIL != obsolete.cnat_p(node2, UNPROVIDED)) {
                                                                SubLObject cdolist_list_var_$41;
                                                                final SubLObject new_list2 = cdolist_list_var_$41 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                SubLObject generating_fn2 = NIL;
                                                                generating_fn2 = cdolist_list_var_$41.first();
                                                                while (NIL != cdolist_list_var_$41) {
                                                                    final SubLObject _prev_bind_0_$50 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
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
                                                                                Errors.error($str114$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                            }

                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$50, thread);
                                                                    }
                                                                    cdolist_list_var_$41 = cdolist_list_var_$41.rest();
                                                                    generating_fn2 = cdolist_list_var_$41.first();
                                                                } 
                                                            }

                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$31, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$47, thread);
                                                    }
                                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                                    module_var2 = cdolist_list_var2.first();
                                                } 
                                                node_var_$22 = deck.deck_pop(recur_deck);
                                            } 
                                        } finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$30, thread);
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$29, thread);
                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$40, thread);
                                        }
                                    } else {
                                        sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str117$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                } finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$28, thread);
                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$39, thread);
                                }
                            } finally {
                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$27, thread);
                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$38, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$51 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values3 = getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                restoreValuesFromVector(_values3);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$51, thread);
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$37, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$52 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values4 = getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                        restoreValuesFromVector(_values4);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$52, thread);
                    }
                }
            } finally {
                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1_$26, thread);
                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$36, thread);
            }
            node_var = $$HostileSocialAction;
            final SubLObject _prev_bind_0_$53 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            final SubLObject _prev_bind_1_$32 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
            try {
                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module($$isa), thread);
                sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    SubLObject node_var_$23 = node_var;
                    final SubLObject deck_type = $STACK;
                    final SubLObject recur_deck = deck.create_deck(deck_type);
                    final SubLObject _prev_bind_0_$54 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject tv_var = NIL;
                            final SubLObject _prev_bind_0_$55 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$33 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_tv$.bind(NIL != tv_var ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind(NIL != tv_var ? RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread), thread);
                                if (((NIL != tv_var) && (NIL != sbhl_paranoia.sbhl_object_type_checking_p())) && (NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var))) {
                                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                    if (pcase_var.eql($ERROR)) {
                                        sbhl_paranoia.sbhl_error(ONE_INTEGER, $str108$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    } else
                                        if (pcase_var.eql($CERROR)) {
                                            sbhl_paranoia.sbhl_cerror(ONE_INTEGER, $$$continue_anyway, $str108$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                        } else
                                            if (pcase_var.eql($WARN)) {
                                                Errors.warn($str108$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                            } else {
                                                Errors.warn($str113$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                                Errors.cerror($$$continue_anyway, $str108$_A_is_not_a__A, tv_var, SBHL_TRUE_TV_P);
                                            }


                                }
                                final SubLObject _prev_bind_0_$56 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$34 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
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
                                        final SubLObject _prev_bind_0_$57 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$35 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$31 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa))), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL, thread);
                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$23, UNPROVIDED);
                                            while (NIL != node_var_$23) {
                                                final SubLObject tt_node_var = node_var_$23;
                                                SubLObject cdolist_list_var;
                                                final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module($$isa));
                                                SubLObject module_var = NIL;
                                                module_var = cdolist_list_var.first();
                                                while (NIL != cdolist_list_var) {
                                                    final SubLObject _prev_bind_0_$58 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$36 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
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
                                                                            final SubLObject _prev_bind_0_$59 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                SubLObject iteration_state_$37;
                                                                                for (iteration_state_$37 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$37); iteration_state_$37 = dictionary_contents.do_dictionary_contents_next(iteration_state_$37)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$37);
                                                                                    final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        final SubLObject _prev_bind_0_$60 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            final SubLObject sol = link_nodes;
                                                                                            if (NIL != set.set_p(sol)) {
                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state;
                                                                                                SubLObject fort;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    fort = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if ((NIL != set_contents.do_set_contents_element_validP(state, fort)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(fort, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(fort, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (NIL != forts.fort_p(fort)) {
                                                                                                            kbs_identification.unmark_kbs_fort(fort);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            } else
                                                                                                if (sol.isList()) {
                                                                                                    SubLObject csome_list_var = sol;
                                                                                                    SubLObject fort2 = NIL;
                                                                                                    fort2 = csome_list_var.first();
                                                                                                    while (NIL != csome_list_var) {
                                                                                                        if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(fort2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(fort2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                            if (NIL != forts.fort_p(fort2)) {
                                                                                                                kbs_identification.unmark_kbs_fort(fort2);
                                                                                                            }
                                                                                                        }
                                                                                                        csome_list_var = csome_list_var.rest();
                                                                                                        fort2 = csome_list_var.first();
                                                                                                    } 
                                                                                                } else {
                                                                                                    Errors.error($str114$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$60, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$37);
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$59, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str115$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
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
                                                                    destructuring_bind_must_consp(current, datum, $list116);
                                                                    link_node = current.first();
                                                                    current = current.rest();
                                                                    destructuring_bind_must_consp(current, datum, $list116);
                                                                    mt2 = current.first();
                                                                    current = current.rest();
                                                                    destructuring_bind_must_consp(current, datum, $list116);
                                                                    tv2 = current.first();
                                                                    current = current.rest();
                                                                    if (NIL == current) {
                                                                        if (NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                            final SubLObject _prev_bind_0_$61 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                                if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                    final SubLObject _prev_bind_0_$62 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                        final SubLObject sol;
                                                                                        final SubLObject link_nodes2 = sol = list(link_node);
                                                                                        if (NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject fort;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                fort = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state, fort)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(fort, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(fort, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if (NIL != forts.fort_p(fort)) {
                                                                                                        kbs_identification.unmark_kbs_fort(fort);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        } else
                                                                                            if (sol.isList()) {
                                                                                                SubLObject csome_list_var_$39 = sol;
                                                                                                SubLObject fort2 = NIL;
                                                                                                fort2 = csome_list_var_$39.first();
                                                                                                while (NIL != csome_list_var_$39) {
                                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(fort2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(fort2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (NIL != forts.fort_p(fort2)) {
                                                                                                            kbs_identification.unmark_kbs_fort(fort2);
                                                                                                        }
                                                                                                    }
                                                                                                    csome_list_var_$39 = csome_list_var_$39.rest();
                                                                                                    fort2 = csome_list_var_$39.first();
                                                                                                } 
                                                                                            } else {
                                                                                                Errors.error($str114$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }

                                                                                    } finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$62, thread);
                                                                                    }
                                                                                }
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$61, thread);
                                                                            }
                                                                        }
                                                                    } else {
                                                                        cdestructuring_bind_error(datum, $list116);
                                                                    }
                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                    instance_tuple = csome_list_var2.first();
                                                                } 
                                                            }
                                                        } else
                                                            if (NIL != obsolete.cnat_p(node, UNPROVIDED)) {
                                                                SubLObject cdolist_list_var_$42;
                                                                final SubLObject new_list = cdolist_list_var_$42 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                SubLObject generating_fn = NIL;
                                                                generating_fn = cdolist_list_var_$42.first();
                                                                while (NIL != cdolist_list_var_$42) {
                                                                    final SubLObject _prev_bind_0_$63 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                    try {
                                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                        final SubLObject sol2;
                                                                        final SubLObject link_nodes3 = sol2 = funcall(generating_fn, node);
                                                                        if (NIL != set.set_p(sol2)) {
                                                                            final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                            SubLObject basis_object2;
                                                                            SubLObject state2;
                                                                            SubLObject fort3;
                                                                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                                fort3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                                if ((NIL != set_contents.do_set_contents_element_validP(state2, fort3)) && (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(fort3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread)))) {
                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(fort3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                    if (NIL != forts.fort_p(fort3)) {
                                                                                        kbs_identification.unmark_kbs_fort(fort3);
                                                                                    }
                                                                                }
                                                                            }
                                                                        } else
                                                                            if (sol2.isList()) {
                                                                                SubLObject csome_list_var3 = sol2;
                                                                                SubLObject fort4 = NIL;
                                                                                fort4 = csome_list_var3.first();
                                                                                while (NIL != csome_list_var3) {
                                                                                    if (NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(fort4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(fort4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                        if (NIL != forts.fort_p(fort4)) {
                                                                                            kbs_identification.unmark_kbs_fort(fort4);
                                                                                        }
                                                                                    }
                                                                                    csome_list_var3 = csome_list_var3.rest();
                                                                                    fort4 = csome_list_var3.first();
                                                                                } 
                                                                            } else {
                                                                                Errors.error($str114$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                            }

                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$63, thread);
                                                                    }
                                                                    cdolist_list_var_$42 = cdolist_list_var_$42.rest();
                                                                    generating_fn = cdolist_list_var_$42.first();
                                                                } 
                                                            }

                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$36, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$58, thread);
                                                    }
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    module_var = cdolist_list_var.first();
                                                } 
                                                SubLObject cdolist_list_var2;
                                                final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module($$isa)));
                                                SubLObject module_var2 = NIL;
                                                module_var2 = cdolist_list_var2.first();
                                                while (NIL != cdolist_list_var2) {
                                                    final SubLObject _prev_bind_0_$64 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$37 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind(NIL != sbhl_search_vars.flip_genl_inverse_modeP(UNPROVIDED, UNPROVIDED) ? makeBoolean(NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread), thread);
                                                        final SubLObject node2 = function_terms.naut_to_nart(node_var_$23);
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
                                                                            final SubLObject _prev_bind_0_$65 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                                SubLObject iteration_state_$38;
                                                                                for (iteration_state_$38 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$38); iteration_state_$38 = dictionary_contents.do_dictionary_contents_next(iteration_state_$38)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$38);
                                                                                    final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                        final SubLObject _prev_bind_0_$66 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
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
                                                                                                    Errors.error($str114$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                                }

                                                                                        } finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$66, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$38);
                                                                            } finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$65, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                }
                                                            } else {
                                                                sbhl_paranoia.sbhl_error(FIVE_INTEGER, $str115$attempting_to_bind_direction_link, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                                            }
                                                        } else
                                                            if (NIL != obsolete.cnat_p(node2, UNPROVIDED)) {
                                                                SubLObject cdolist_list_var_$43;
                                                                final SubLObject new_list2 = cdolist_list_var_$43 = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module(UNPROVIDED));
                                                                SubLObject generating_fn2 = NIL;
                                                                generating_fn2 = cdolist_list_var_$43.first();
                                                                while (NIL != cdolist_list_var_$43) {
                                                                    final SubLObject _prev_bind_0_$67 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
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
                                                                                Errors.error($str114$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                            }

                                                                    } finally {
                                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$67, thread);
                                                                    }
                                                                    cdolist_list_var_$43 = cdolist_list_var_$43.rest();
                                                                    generating_fn2 = cdolist_list_var_$43.first();
                                                                } 
                                                            }

                                                    } finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$37, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$64, thread);
                                                    }
                                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                                    module_var2 = cdolist_list_var2.first();
                                                } 
                                                node_var_$23 = deck.deck_pop(recur_deck);
                                            } 
                                        } finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$31, thread);
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$35, thread);
                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$57, thread);
                                        }
                                    } else {
                                        sbhl_paranoia.sbhl_warn(TWO_INTEGER, $str117$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module(UNPROVIDED)), UNPROVIDED, UNPROVIDED, UNPROVIDED);
                                    }
                                } finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$34, thread);
                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$56, thread);
                                }
                            } finally {
                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$33, thread);
                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$55, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$68 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values5 = getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                restoreValuesFromVector(_values5);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$68, thread);
                            }
                        }
                    } finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$54, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_0_$69 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values6 = getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                        restoreValuesFromVector(_values6);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$69, thread);
                    }
                }
            } finally {
                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1_$32, thread);
                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$53, thread);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return NIL;
    }

    public static final SubLObject researchcyc_kbs_unwanted_tkb_termP_alt(SubLObject fort) {
        return makeBoolean(((NIL != isa.isa_in_any_mtP(fort, $$TerroristAgent)) || (NIL != isa.isa_in_any_mtP(fort, $$TerroristAct))) || (NIL != isa.isa_in_any_mtP(fort, $$HostileSocialAction)));
    }

    public static SubLObject researchcyc_kbs_unwanted_tkb_termP(final SubLObject fort) {
        return makeBoolean(((NIL != isa.isa_in_any_mtP(fort, $$TerroristAgent)) || (NIL != isa.isa_in_any_mtP(fort, $$TerroristAct))) || (NIL != isa.isa_in_any_mtP(fort, $$HostileSocialAction)));
    }

    public static final SubLObject researchcyc_candidate_term_alt(SubLObject fort) {
        return makeBoolean(((((((((!((NIL != com.cyc.cycjava.cycl.kbs_utilities.quoted_isa_enhanced_in_any_mtP(fort, $$ResearchCycConstant)) || (NIL != isa.isa_in_any_mtP(fort, $$ResearchCycConstant)))) && (!((NIL != com.cyc.cycjava.cycl.kbs_utilities.quoted_isa_enhanced_in_any_mtP(fort, $$ProprietaryTerm)) || (NIL != isa.isa_in_any_mtP(fort, $$ProprietaryTerm))))) && (!((NIL != com.cyc.cycjava.cycl.kbs_utilities.quoted_isa_enhanced_in_any_mtP(fort, $$TKBConstant)) || (NIL != isa.isa_in_any_mtP(fort, $$TKBConstant))))) && (NIL == com.cyc.cycjava.cycl.kbs_utilities.researchcyc_kbs_unwanted_tkb_termP(fort))) && (NIL == com.cyc.cycjava.cycl.kbs_utilities.quoted_isa_enhanced_in_any_mtP(fort, $$TermSuggestorExpertOnlyTerm))) && (!((NIL != com.cyc.cycjava.cycl.kbs_utilities.quoted_isa_enhanced_in_any_mtP(fort, $$TextualEntailmentConstant)) || (NIL != isa.isa_in_any_mtP(fort, $$TextualEntailmentConstant))))) && (NIL == isa.isa_in_any_mtP(fort, $$CurrentCycorpEmployee))) && (NIL == fort_types_interface.skolem_functionP(fort, UNPROVIDED))) && (NIL != (NIL != constant_p(fort) ? ((SubLObject) (makeBoolean((((((NIL == starts_with(constants_high.constant_name(fort), $$$AKB)) && (NIL == starts_with(constants_high.constant_name(fort), $$$BUTLER))) && (NIL == starts_with(constants_high.constant_name(fort), $$$CKB))) && (NIL == starts_with(constants_high.constant_name(fort), $$$CycInternalAssignment))) && (NIL == starts_with(constants_high.constant_name(fort), $$$TKB))) && (NIL == starts_with(constants_high.constant_name(fort), $str_alt81$Translation_))))) : NIL)));
    }

    public static SubLObject researchcyc_candidate_term(final SubLObject fort) {
        return makeBoolean(((((((((((((NIL == quoted_isa_enhanced_in_any_mtP(fort, $$ResearchCycConstant)) && (NIL == isa.isa_in_any_mtP(fort, $$ResearchCycConstant))) && (NIL == quoted_isa_enhanced_in_any_mtP(fort, $$ProprietaryTerm))) && (NIL == isa.isa_in_any_mtP(fort, $$ProprietaryTerm))) && (NIL == quoted_isa_enhanced_in_any_mtP(fort, $$TKBConstant))) && (NIL == isa.isa_in_any_mtP(fort, $$TKBConstant))) && (NIL == researchcyc_kbs_unwanted_tkb_termP(fort))) && (NIL == quoted_isa_enhanced_in_any_mtP(fort, $$TermSuggestorExpertOnlyTerm))) && (NIL == quoted_isa_enhanced_in_any_mtP(fort, $$TextualEntailmentConstant))) && (NIL == isa.isa_in_any_mtP(fort, $$TextualEntailmentConstant))) && (NIL == isa.isa_in_any_mtP(fort, $$CurrentCycorpEmployee))) && (NIL == fort_types_interface.skolem_functionP(fort, UNPROVIDED))) && (NIL != (NIL != constant_p(fort) ? makeBoolean((((((NIL == string_utilities.starts_with(constants_high.constant_name(fort), $$$AKB)) && (NIL == string_utilities.starts_with(constants_high.constant_name(fort), $$$BUTLER))) && (NIL == string_utilities.starts_with(constants_high.constant_name(fort), $$$CKB))) && (NIL == string_utilities.starts_with(constants_high.constant_name(fort), $$$CycInternalAssignment))) && (NIL == string_utilities.starts_with(constants_high.constant_name(fort), $$$TKB))) && (NIL == string_utilities.starts_with(constants_high.constant_name(fort), $str131$Translation_))) : NIL)));
    }

    public static final SubLObject tkb_kbs_unmark_certain_assertions_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject assertion_unmark_count = ZERO_INTEGER;
                SubLObject state = memoization_state.possibly_new_memoization_state();
                SubLObject local_state = state;
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
                                            Errors.error($str_alt40$Invalid_attempt_to_reuse_memoizat);
                                        }
                                    }
                                }
                            }
                            try {
                                {
                                    SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                                    {
                                        SubLObject _prev_bind_0_118 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                                        SubLObject _prev_bind_1 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                                        SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                                        try {
                                            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
                                            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                                            {
                                                SubLObject list_var = keyhash_utilities.keyhash_element_list(kbs_assertion_table());
                                                $progress_note$.setDynamicValue($str_alt82$Unmarking_non_TKB_assertions, thread);
                                                $progress_start_time$.setDynamicValue(get_universal_time(), thread);
                                                $progress_total$.setDynamicValue(length(list_var), thread);
                                                $progress_sofar$.setDynamicValue(ZERO_INTEGER, thread);
                                                {
                                                    SubLObject _prev_bind_0_119 = $last_percent_progress_index$.currentBinding(thread);
                                                    SubLObject _prev_bind_1_120 = $last_percent_progress_prediction$.currentBinding(thread);
                                                    SubLObject _prev_bind_2_121 = $within_noting_percent_progress$.currentBinding(thread);
                                                    SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                                    try {
                                                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                                        $last_percent_progress_prediction$.bind(NIL, thread);
                                                        $within_noting_percent_progress$.bind(T, thread);
                                                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                                                        noting_percent_progress_preamble($progress_note$.getDynamicValue(thread));
                                                        {
                                                            SubLObject csome_list_var = list_var;
                                                            SubLObject assertion = NIL;
                                                            for (assertion = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , assertion = csome_list_var.first()) {
                                                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                                                if (NIL != com.cyc.cycjava.cycl.kbs_utilities.tkb_special_excluded_assertionP(assertion)) {
                                                                    unmark_kbs_assertion(assertion);
                                                                    assertion_unmark_count = add(assertion_unmark_count, ONE_INTEGER);
                                                                }
                                                            }
                                                        }
                                                        noting_percent_progress_postamble();
                                                    } finally {
                                                        $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                                        $within_noting_percent_progress$.rebind(_prev_bind_2_121, thread);
                                                        $last_percent_progress_prediction$.rebind(_prev_bind_1_120, thread);
                                                        $last_percent_progress_index$.rebind(_prev_bind_0_119, thread);
                                                    }
                                                }
                                            }
                                        } finally {
                                            sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                                            sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1, thread);
                                            sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_118, thread);
                                        }
                                    }
                                }
                            } finally {
                                {
                                    SubLObject _prev_bind_0_122 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        if ((NIL != local_state) && (NIL == original_memoization_process)) {
                                            memoization_state.memoization_state_set_current_process_internal(local_state, NIL);
                                        }
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_122, thread);
                                    }
                                }
                            }
                        }
                    } finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
                    }
                }
                return assertion_unmark_count;
            }
        }
    }

    public static SubLObject tkb_kbs_unmark_certain_assertions() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject assertion_unmark_count = ZERO_INTEGER;
        final SubLObject local_state;
        final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                final SubLObject _prev_bind_0_$109 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                try {
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                    final SubLObject list_var = keyhash_utilities.keyhash_element_list(kbs_identification.kbs_assertion_table());
                    final SubLObject _prev_bind_0_$110 = $progress_note$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$111 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$112 = $progress_total$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = $progress_sofar$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
                    try {
                        $progress_note$.bind($str132$Unmarking_non_TKB_assertions, thread);
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
                                if (NIL != tkb_special_excluded_assertionP(assertion)) {
                                    kbs_identification.unmark_kbs_assertion(assertion);
                                    assertion_unmark_count = add(assertion_unmark_count, ONE_INTEGER);
                                }
                                $progress_sofar$.setDynamicValue(add($progress_sofar$.getDynamicValue(thread), ONE_INTEGER), thread);
                                note_percent_progress($progress_sofar$.getDynamicValue(thread), $progress_total$.getDynamicValue(thread));
                                csome_list_var = csome_list_var.rest();
                                assertion = csome_list_var.first();
                            } 
                        } finally {
                            final SubLObject _prev_bind_0_$111 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                noting_percent_progress_postamble();
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$111, thread);
                            }
                        }
                    } finally {
                        $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                        $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                        $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                        $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                        $progress_sofar$.rebind(_prev_bind_4, thread);
                        $progress_total$.rebind(_prev_bind_2_$112, thread);
                        $progress_start_time$.rebind(_prev_bind_1_$111, thread);
                        $progress_note$.rebind(_prev_bind_0_$110, thread);
                    }
                } finally {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$109, thread);
                }
            } finally {
                final SubLObject _prev_bind_0_$112 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values2 = getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    restoreValuesFromVector(_values2);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$112, thread);
                }
            }
        } finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return assertion_unmark_count;
    }

    public static final SubLObject tkb_kbs_save_terms_without_isas_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject assertion_count = ZERO_INTEGER;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        {
                            SubLObject idx = do_constants_table();
                            SubLObject total = id_index_count(idx);
                            SubLObject sofar = ZERO_INTEGER;
                            SubLTrampolineFile.checkType($$$mapping_Cyc_constants, STRINGP);
                            {
                                SubLObject _prev_bind_0_123 = $last_percent_progress_index$.currentBinding(thread);
                                SubLObject _prev_bind_1_124 = $last_percent_progress_prediction$.currentBinding(thread);
                                SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                                SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                try {
                                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                    $last_percent_progress_prediction$.bind(NIL, thread);
                                    $within_noting_percent_progress$.bind(T, thread);
                                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                                    noting_percent_progress_preamble($$$mapping_Cyc_constants);
                                    if (NIL == do_id_index_empty_p(idx, $SKIP)) {
                                        {
                                            SubLObject id = do_id_index_next_id(idx, T, NIL, NIL);
                                            SubLObject state_var = do_id_index_next_state(idx, T, id, NIL);
                                            SubLObject c = NIL;
                                            while (NIL != id) {
                                                c = do_id_index_state_object(idx, $SKIP, id, state_var);
                                                if (NIL != do_id_index_id_and_object_validP(id, c, $SKIP)) {
                                                    note_percent_progress(sofar, total);
                                                    sofar = add(sofar, ONE_INTEGER);
                                                    if ((NIL != kbs_constant_p(c)) && ((NIL != com.cyc.cycjava.cycl.kbs_utilities.quoted_isa_enhanced_in_any_mtP(c, $$TKBConstant)) || (NIL != isa.isa_in_any_mtP(c, $$TKBConstant)))) {
                                                        {
                                                            SubLObject constant_has_kbs_isa_assertionP = NIL;
                                                            SubLObject pred_var = $$isa;
                                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(c, ONE_INTEGER, pred_var)) {
                                                                {
                                                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(c, ONE_INTEGER, pred_var);
                                                                    SubLObject done_var = constant_has_kbs_isa_assertionP;
                                                                    SubLObject token_var = NIL;
                                                                    while (NIL == done_var) {
                                                                        {
                                                                            SubLObject final_index_spec = iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                                            if (NIL != valid) {
                                                                                {
                                                                                    SubLObject final_index_iterator = NIL;
                                                                                    try {
                                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                                                        {
                                                                                            SubLObject done_var_125 = constant_has_kbs_isa_assertionP;
                                                                                            SubLObject token_var_126 = NIL;
                                                                                            while (NIL == done_var_125) {
                                                                                                {
                                                                                                    SubLObject a = iteration_next_without_values_macro_helper(final_index_iterator, token_var_126);
                                                                                                    SubLObject valid_127 = makeBoolean(token_var_126 != a);
                                                                                                    if (NIL != valid_127) {
                                                                                                        constant_has_kbs_isa_assertionP = kbs_assertion_p(a);
                                                                                                    }
                                                                                                    done_var_125 = makeBoolean((NIL == valid_127) || (NIL != constant_has_kbs_isa_assertionP));
                                                                                                }
                                                                                            } 
                                                                                        }
                                                                                    } finally {
                                                                                        {
                                                                                            SubLObject _prev_bind_0_128 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                                            try {
                                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                                if (NIL != final_index_iterator) {
                                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                                }
                                                                                            } finally {
                                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_128, thread);
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                            done_var = makeBoolean((NIL == valid) || (NIL != constant_has_kbs_isa_assertionP));
                                                                        }
                                                                    } 
                                                                }
                                                            }
                                                            if (NIL == constant_has_kbs_isa_assertionP) {
                                                                {
                                                                    SubLObject formula = make_binary_formula($$isa, c, $$Individual);
                                                                    Errors.warn($str_alt87$Saving__A_by_asserting__A__, c, formula);
                                                                    cyc_assert(formula, $$UniversalVocabularyMt, UNPROVIDED);
                                                                    {
                                                                        SubLObject a = czer_meta.find_assertion_cycl(formula, $$UniversalVocabularyMt);
                                                                        if (NIL != assertion_handles.assertion_p(a)) {
                                                                            mark_kbs_assertion(a);
                                                                        } else {
                                                                            Errors.warn($str_alt89$assertion__A_not_found, formula);
                                                                        }
                                                                    }
                                                                    assertion_count = add(assertion_count, ONE_INTEGER);
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
                                    $last_percent_progress_prediction$.rebind(_prev_bind_1_124, thread);
                                    $last_percent_progress_index$.rebind(_prev_bind_0_123, thread);
                                }
                            }
                        }
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return assertion_count;
            }
        }
    }

    public static SubLObject tkb_kbs_save_terms_without_isas() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject assertion_count = ZERO_INTEGER;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            final SubLObject idx = do_constants_table();
            final SubLObject mess = $$$mapping_Cyc_constants;
            final SubLObject total = id_index_count(idx);
            SubLObject sofar = ZERO_INTEGER;
            assert NIL != stringp(mess) : "! stringp(mess) " + ("Types.stringp(mess) " + "CommonSymbols.NIL != Types.stringp(mess) ") + mess;
            final SubLObject _prev_bind_0_$115 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_1_$116 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble(mess);
                    final SubLObject idx_$117 = idx;
                    if (NIL == id_index_objects_empty_p(idx_$117, $SKIP)) {
                        final SubLObject idx_$118 = idx_$117;
                        if (NIL == id_index_dense_objects_empty_p(idx_$118, $SKIP)) {
                            final SubLObject vector_var = id_index_dense_objects(idx_$118);
                            final SubLObject backwardP_var = NIL;
                            SubLObject length;
                            SubLObject v_iteration;
                            SubLObject id;
                            SubLObject c;
                            SubLObject constant_has_kbs_isa_assertionP;
                            SubLObject pred_var;
                            SubLObject iterator_var;
                            SubLObject done_var;
                            SubLObject token_var;
                            SubLObject final_index_spec;
                            SubLObject valid;
                            SubLObject final_index_iterator;
                            SubLObject done_var_$119;
                            SubLObject token_var_$120;
                            SubLObject a;
                            SubLObject valid_$121;
                            SubLObject _prev_bind_0_$116;
                            SubLObject _values;
                            SubLObject formula;
                            SubLObject a2;
                            for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                                id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                                c = aref(vector_var, id);
                                if ((NIL == id_index_tombstone_p(c)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                    if (NIL != id_index_tombstone_p(c)) {
                                        c = $SKIP;
                                    }
                                    if ((NIL != kbs_identification.kbs_constant_p(c)) && ((NIL != quoted_isa_enhanced_in_any_mtP(c, $$TKBConstant)) || (NIL != isa.isa_in_any_mtP(c, $$TKBConstant)))) {
                                        constant_has_kbs_isa_assertionP = NIL;
                                        pred_var = $$isa;
                                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(c, ONE_INTEGER, pred_var)) {
                                            iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(c, ONE_INTEGER, pred_var);
                                            done_var = constant_has_kbs_isa_assertionP;
                                            token_var = NIL;
                                            while (NIL == done_var) {
                                                final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                valid = makeBoolean(!token_var.eql(final_index_spec));
                                                if (NIL != valid) {
                                                    final_index_iterator = NIL;
                                                    try {
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                        done_var_$119 = constant_has_kbs_isa_assertionP;
                                                        token_var_$120 = NIL;
                                                        while (NIL == done_var_$119) {
                                                            a = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$120);
                                                            valid_$121 = makeBoolean(!token_var_$120.eql(a));
                                                            if (NIL != valid_$121) {
                                                                constant_has_kbs_isa_assertionP = kbs_identification.kbs_assertion_p(a);
                                                            }
                                                            done_var_$119 = makeBoolean((NIL == valid_$121) || (NIL != constant_has_kbs_isa_assertionP));
                                                        } 
                                                    } finally {
                                                        _prev_bind_0_$116 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            _values = getValuesAsVector();
                                                            if (NIL != final_index_iterator) {
                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                            }
                                                            restoreValuesFromVector(_values);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$116, thread);
                                                        }
                                                    }
                                                }
                                                done_var = makeBoolean((NIL == valid) || (NIL != constant_has_kbs_isa_assertionP));
                                            } 
                                        }
                                        if (NIL == constant_has_kbs_isa_assertionP) {
                                            formula = make_binary_formula($$isa, c, $$Individual);
                                            Errors.warn($str137$Saving__A_by_asserting__A__, c, formula);
                                            cyc_kernel.cyc_assert(formula, $$UniversalVocabularyMt, UNPROVIDED);
                                            a2 = czer_meta.find_assertion_cycl(formula, $$UniversalVocabularyMt);
                                            if (NIL != assertion_handles.assertion_p(a2)) {
                                                kbs_identification.mark_kbs_assertion(a2);
                                            } else {
                                                Errors.warn($str139$assertion__A_not_found, formula);
                                            }
                                            assertion_count = add(assertion_count, ONE_INTEGER);
                                        }
                                    }
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                }
                            }
                        }
                        final SubLObject idx_$119 = idx_$117;
                        if ((NIL == id_index_sparse_objects_empty_p(idx_$119)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                            final SubLObject sparse = id_index_sparse_objects(idx_$119);
                            SubLObject id2 = id_index_sparse_id_threshold(idx_$119);
                            final SubLObject end_id = id_index_next_id(idx_$119);
                            final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                            while (id2.numL(end_id)) {
                                final SubLObject c2 = gethash_without_values(id2, sparse, v_default);
                                if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(c2))) {
                                    if ((NIL != kbs_identification.kbs_constant_p(c2)) && ((NIL != quoted_isa_enhanced_in_any_mtP(c2, $$TKBConstant)) || (NIL != isa.isa_in_any_mtP(c2, $$TKBConstant)))) {
                                        SubLObject constant_has_kbs_isa_assertionP2 = NIL;
                                        final SubLObject pred_var2 = $$isa;
                                        if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(c2, ONE_INTEGER, pred_var2)) {
                                            final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(c2, ONE_INTEGER, pred_var2);
                                            SubLObject done_var2 = constant_has_kbs_isa_assertionP2;
                                            final SubLObject token_var2 = NIL;
                                            while (NIL == done_var2) {
                                                final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                                final SubLObject valid2 = makeBoolean(!token_var2.eql(final_index_spec2));
                                                if (NIL != valid2) {
                                                    SubLObject final_index_iterator2 = NIL;
                                                    try {
                                                        final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, $GAF, NIL, NIL);
                                                        SubLObject done_var_$120 = constant_has_kbs_isa_assertionP2;
                                                        final SubLObject token_var_$121 = NIL;
                                                        while (NIL == done_var_$120) {
                                                            final SubLObject a3 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$121);
                                                            final SubLObject valid_$122 = makeBoolean(!token_var_$121.eql(a3));
                                                            if (NIL != valid_$122) {
                                                                constant_has_kbs_isa_assertionP2 = kbs_identification.kbs_assertion_p(a3);
                                                            }
                                                            done_var_$120 = makeBoolean((NIL == valid_$122) || (NIL != constant_has_kbs_isa_assertionP2));
                                                        } 
                                                    } finally {
                                                        final SubLObject _prev_bind_0_$117 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                            final SubLObject _values2 = getValuesAsVector();
                                                            if (NIL != final_index_iterator2) {
                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                                            }
                                                            restoreValuesFromVector(_values2);
                                                        } finally {
                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$117, thread);
                                                        }
                                                    }
                                                }
                                                done_var2 = makeBoolean((NIL == valid2) || (NIL != constant_has_kbs_isa_assertionP2));
                                            } 
                                        }
                                        if (NIL == constant_has_kbs_isa_assertionP2) {
                                            final SubLObject formula2 = make_binary_formula($$isa, c2, $$Individual);
                                            Errors.warn($str137$Saving__A_by_asserting__A__, c2, formula2);
                                            cyc_kernel.cyc_assert(formula2, $$UniversalVocabularyMt, UNPROVIDED);
                                            final SubLObject a4 = czer_meta.find_assertion_cycl(formula2, $$UniversalVocabularyMt);
                                            if (NIL != assertion_handles.assertion_p(a4)) {
                                                kbs_identification.mark_kbs_assertion(a4);
                                            } else {
                                                Errors.warn($str139$assertion__A_not_found, formula2);
                                            }
                                            assertion_count = add(assertion_count, ONE_INTEGER);
                                        }
                                    }
                                    sofar = add(sofar, ONE_INTEGER);
                                    note_percent_progress(sofar, total);
                                }
                                id2 = add(id2, ONE_INTEGER);
                            } 
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$118 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values3 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values3);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$118, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_1_$116, thread);
                $last_percent_progress_index$.rebind(_prev_bind_0_$115, thread);
            }
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return assertion_count;
    }

    public static final SubLObject tkb_special_excluded_assertionP_internal_alt(SubLObject assertion) {
        {
            SubLObject hl_formula = assertion_hl_formula(assertion, UNPROVIDED);
            SubLObject sub_assertions = list_utilities.tree_find_all_if(ASSERTION_P, hl_formula, UNPROVIDED);
            SubLObject cdolist_list_var = sub_assertions;
            SubLObject sub_assertion = NIL;
            for (sub_assertion = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , sub_assertion = cdolist_list_var.first()) {
                if (NIL != com.cyc.cycjava.cycl.kbs_utilities.tkb_special_excluded_assertionP(sub_assertion)) {
                    return T;
                }
            }
        }
        {
            SubLObject monad_mt = hlmt.hlmt_monad_mt(assertions_high.assertion_mt(assertion));
            if (((NIL != isa.isa_in_any_mtP(monad_mt, $const92$TKBFullySpecifiedSourceMicrotheor)) || (NIL != isa.isa_in_any_mtP(monad_mt, $$LexicalMicrotheory))) || (monad_mt == $$TestVocabularyMt)) {
                return NIL;
            }
        }
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            {
                SubLObject pred = assertions_high.gaf_predicate(assertion);
                if (!((((pred != $$quotedIsa) && (pred != $$termOfUnit)) && (!((pred == $$isa) && ((assertions_high.gaf_arg2(assertion) == $$Individual) || (assertions_high.gaf_arg2(assertion) == $$Thing))))) && (NIL == isa.isa_in_any_mtP(pred, $$ImagePathnamePredicate)))) {
                    return NIL;
                }
            }
        }
        {
            SubLObject v_forts = assertions_high.assertion_forts(assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject excludeP = NIL;
            if (NIL == excludeP) {
                {
                    SubLObject csome_list_var = v_forts;
                    SubLObject fort = NIL;
                    for (fort = csome_list_var.first(); !((NIL != excludeP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , fort = csome_list_var.first()) {
                        if (NIL != com.cyc.cycjava.cycl.kbs_utilities.tkb_special_excluded_termP(fort)) {
                            excludeP = T;
                        }
                    }
                }
            }
            if (NIL == excludeP) {
                return NIL;
            }
        }
        return T;
    }

    public static SubLObject tkb_special_excluded_assertionP_internal(final SubLObject assertion) {
        final SubLObject hl_formula = fi.assertion_hl_formula(assertion, UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject sub_assertions = cdolist_list_var = list_utilities.tree_find_all_if(ASSERTION_P, hl_formula, UNPROVIDED);
        SubLObject sub_assertion = NIL;
        sub_assertion = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if (NIL != tkb_special_excluded_assertionP(sub_assertion)) {
                return T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            sub_assertion = cdolist_list_var.first();
        } 
        final SubLObject monad_mt = hlmt.hlmt_monad_mt(assertions_high.assertion_mt(assertion));
        if (((NIL != isa.isa_in_any_mtP(monad_mt, $const142$TKBFullySpecifiedSourceMicrotheor)) || (NIL != isa.isa_in_any_mtP(monad_mt, $$LexicalMicrotheory))) || monad_mt.eql($$TestVocabularyMt)) {
            return NIL;
        }
        if (NIL != assertions_high.gaf_assertionP(assertion)) {
            final SubLObject pred = assertions_high.gaf_predicate(assertion);
            if (((pred.eql($$quotedIsa) || pred.eql($$termOfUnit)) || (pred.eql($$isa) && (assertions_high.gaf_arg2(assertion).eql($$Individual) || assertions_high.gaf_arg2(assertion).eql($$Thing)))) || (NIL != isa.isa_in_any_mtP(pred, $$ImagePathnamePredicate))) {
                return NIL;
            }
        }
        final SubLObject v_forts = assertions_high.assertion_forts(assertion, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject excludeP = NIL;
        if (NIL == excludeP) {
            SubLObject csome_list_var = v_forts;
            SubLObject fort = NIL;
            fort = csome_list_var.first();
            while ((NIL == excludeP) && (NIL != csome_list_var)) {
                if (NIL != tkb_special_excluded_termP(fort)) {
                    excludeP = T;
                }
                csome_list_var = csome_list_var.rest();
                fort = csome_list_var.first();
            } 
        }
        if (NIL == excludeP) {
            return NIL;
        }
        return T;
    }

    public static final SubLObject tkb_special_excluded_assertionP_alt(SubLObject assertion) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
                SubLObject caching_state = NIL;
                if (NIL == v_memoization_state) {
                    return com.cyc.cycjava.cycl.kbs_utilities.tkb_special_excluded_assertionP_internal(assertion);
                }
                caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym90$TKB_SPECIAL_EXCLUDED_ASSERTION_, UNPROVIDED);
                if (NIL == caching_state) {
                    caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym90$TKB_SPECIAL_EXCLUDED_ASSERTION_, ONE_INTEGER, NIL, EQ, UNPROVIDED);
                    memoization_state.memoization_state_put(v_memoization_state, $sym90$TKB_SPECIAL_EXCLUDED_ASSERTION_, caching_state);
                }
                {
                    SubLObject results = memoization_state.caching_state_lookup(caching_state, assertion, $kw99$_MEMOIZED_ITEM_NOT_FOUND_);
                    if (results == $kw99$_MEMOIZED_ITEM_NOT_FOUND_) {
                        results = arg2(thread.resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.kbs_utilities.tkb_special_excluded_assertionP_internal(assertion)));
                        memoization_state.caching_state_put(caching_state, assertion, results, UNPROVIDED);
                    }
                    return memoization_state.caching_results(results);
                }
            }
        }
    }

    public static SubLObject tkb_special_excluded_assertionP(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = NIL;
        if (NIL == v_memoization_state) {
            return tkb_special_excluded_assertionP_internal(assertion);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, $sym140$TKB_SPECIAL_EXCLUDED_ASSERTION_, UNPROVIDED);
        if (NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), $sym140$TKB_SPECIAL_EXCLUDED_ASSERTION_, ONE_INTEGER, NIL, EQ, UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, $sym140$TKB_SPECIAL_EXCLUDED_ASSERTION_, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, assertion, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(thread.resetMultipleValues(), multiple_value_list(tkb_special_excluded_assertionP_internal(assertion)));
            memoization_state.caching_state_put(caching_state, assertion, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    /**
     * Terms that the special exclusionary code applies to.
     */
    @LispMethod(comment = "Terms that the special exclusionary code applies to.")
    public static final SubLObject tkb_special_excluded_termP_alt(SubLObject fort) {
        return makeBoolean(((((((NIL != isa.isa_in_any_mtP(fort, $$Person)) || (NIL != isa.isa_in_any_mtP(fort, $$LegalCorporation))) || (NIL != isa.isa_in_any_mtP(fort, $$CommercialOrganization))) && (NIL == com.cyc.cycjava.cycl.kbs_utilities.quoted_isa_enhanced_in_any_mtP(fort, $$IndeterminateTerm))) && (NIL == com.cyc.cycjava.cycl.kbs_utilities.quoted_isa_enhanced_in_any_mtP(fort, $$IndexicalConcept))) && (NIL == isa.isa_in_any_mtP(fort, $$AgentNowTerminated))) && ((NIL == isa.isa_in_any_mtP(fort, $$ComputerUserWithUserModel)) || (NIL != isa.isa_in_any_mtP(fort, $$HumanCyclist))));
    }

    /**
     * Terms that the special exclusionary code applies to.
     */
    @LispMethod(comment = "Terms that the special exclusionary code applies to.")
    public static SubLObject tkb_special_excluded_termP(final SubLObject fort) {
        return makeBoolean(((((((NIL != isa.isa_in_any_mtP(fort, $$Person)) || (NIL != isa.isa_in_any_mtP(fort, $$LegalCorporation))) || (NIL != isa.isa_in_any_mtP(fort, $$CommercialOrganization))) && (NIL == quoted_isa_enhanced_in_any_mtP(fort, $$IndeterminateTerm))) && (NIL == quoted_isa_enhanced_in_any_mtP(fort, $$IndexicalConcept))) && (NIL == isa.isa_in_any_mtP(fort, $$AgentNowTerminated))) && ((NIL == isa.isa_in_any_mtP(fort, $$ComputerUserWithUserModel)) || (NIL != isa.isa_in_any_mtP(fort, $$HumanCyclist))));
    }

    /**
     * Return all quoted instances of COL in MT.
     * This is an enhanced version of @xref all-quoted-instances
     * that supports #$genls-GenlDenotesSpecInstances.
     */
    @LispMethod(comment = "Return all quoted instances of COL in MT.\r\nThis is an enhanced version of @xref all-quoted-instances\r\nthat supports #$genls-GenlDenotesSpecInstances.\nReturn all quoted instances of COL in MT.\nThis is an enhanced version of @xref all-quoted-instances\nthat supports #$genls-GenlDenotesSpecInstances.")
    public static final SubLObject all_quoted_instances_enhanced_alt(SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject visited_quoted_specs = make_hash_table(cardinality_estimates.spec_cardinality(col), symbol_function(EQ), UNPROVIDED);
                SubLObject visited_specs = make_hash_table(SIXTEEN_INTEGER, symbol_function(EQ), UNPROVIDED);
                SubLObject unvisited_quoted_specs = queues.create_queue();
                SubLObject unvisited_specs = queues.create_queue();
                SubLObject result_set = make_hash_table(SIXTEEN_INTEGER, symbol_function(EQ), UNPROVIDED);
                SubLObject result = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        queues.enqueue(col, unvisited_quoted_specs);
                        while (!((NIL != queues.queue_empty_p(unvisited_quoted_specs)) && (NIL != queues.queue_empty_p(unvisited_specs)))) {
                            while (NIL == queues.queue_empty_p(unvisited_quoted_specs)) {
                                {
                                    SubLObject quoted_col = queues.dequeue(unvisited_quoted_specs);
                                    if (NIL == gethash_without_values(quoted_col, visited_quoted_specs, UNPROVIDED)) {
                                        sethash(quoted_col, visited_quoted_specs, T);
                                        {
                                            SubLObject _prev_bind_0_129 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            try {
                                                sbhl_module_vars.$sbhl_module$.bind(NIL != sbhl_module_vars.get_sbhl_module($$quotedIsa) ? ((SubLObject) (sbhl_module_vars.get_sbhl_module($$quotedIsa))) : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
                                                {
                                                    SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(quoted_col, sbhl_module_vars.get_sbhl_module($$quotedIsa));
                                                    if (NIL != d_link) {
                                                        {
                                                            SubLObject cdolist_list_var = sbhl_module_utilities.get_relevant_sbhl_directions(sbhl_module_vars.get_sbhl_module($$quotedIsa));
                                                            SubLObject direction = NIL;
                                                            for (direction = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , direction = cdolist_list_var.first()) {
                                                                {
                                                                    SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, sbhl_module_vars.get_sbhl_module($$quotedIsa));
                                                                    if (NIL != mt_links) {
                                                                        if (direction == sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$quotedIsa))) {
                                                                            {
                                                                                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                    thread.resetMultipleValues();
                                                                                    {
                                                                                        SubLObject mt_var_130 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                        SubLObject tv_links = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        {
                                                                                            SubLObject iteration_state_131 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_131)) {
                                                                                                thread.resetMultipleValues();
                                                                                                {
                                                                                                    SubLObject tv_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state_131);
                                                                                                    SubLObject link_nodes_var = thread.secondMultipleValue();
                                                                                                    thread.resetMultipleValues();
                                                                                                    if (NIL != sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                                                                        {
                                                                                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes_var))) : link_nodes_var;
                                                                                                            SubLObject cdolist_list_var_132 = new_list;
                                                                                                            SubLObject instance = NIL;
                                                                                                            for (instance = cdolist_list_var_132.first(); NIL != cdolist_list_var_132; cdolist_list_var_132 = cdolist_list_var_132.rest() , instance = cdolist_list_var_132.first()) {
                                                                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt_var_130)) {
                                                                                                                    if (NIL == gethash_without_values(instance, result_set, UNPROVIDED)) {
                                                                                                                        result = cons(instance, result);
                                                                                                                        sethash(instance, result_set, T);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    iteration_state_131 = dictionary_contents.do_dictionary_contents_next(iteration_state_131);
                                                                                                }
                                                                                            } 
                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_131);
                                                                                        }
                                                                                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                    }
                                                                                } 
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } finally {
                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_129, thread);
                                            }
                                        }
                                        {
                                            SubLObject _prev_bind_0_133 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            try {
                                                sbhl_module_vars.$sbhl_module$.bind(NIL != sbhl_module_vars.get_sbhl_module($$genls) ? ((SubLObject) (sbhl_module_vars.get_sbhl_module($$genls))) : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
                                                {
                                                    SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(quoted_col, sbhl_module_vars.get_sbhl_module($$genls));
                                                    if (NIL != d_link) {
                                                        {
                                                            SubLObject cdolist_list_var = sbhl_module_utilities.get_relevant_sbhl_directions(sbhl_module_vars.get_sbhl_module($$genls));
                                                            SubLObject direction = NIL;
                                                            for (direction = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , direction = cdolist_list_var.first()) {
                                                                {
                                                                    SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, sbhl_module_vars.get_sbhl_module($$genls));
                                                                    if (NIL != mt_links) {
                                                                        if (direction == sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$genls))) {
                                                                            {
                                                                                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                    thread.resetMultipleValues();
                                                                                    {
                                                                                        SubLObject mt_var_134 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                        SubLObject tv_links = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        {
                                                                                            SubLObject iteration_state_135 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_135)) {
                                                                                                thread.resetMultipleValues();
                                                                                                {
                                                                                                    SubLObject tv_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state_135);
                                                                                                    SubLObject link_nodes_var = thread.secondMultipleValue();
                                                                                                    thread.resetMultipleValues();
                                                                                                    if (NIL != sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                                                                        {
                                                                                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes_var))) : link_nodes_var;
                                                                                                            SubLObject cdolist_list_var_136 = new_list;
                                                                                                            SubLObject quoted_spec = NIL;
                                                                                                            for (quoted_spec = cdolist_list_var_136.first(); NIL != cdolist_list_var_136; cdolist_list_var_136 = cdolist_list_var_136.rest() , quoted_spec = cdolist_list_var_136.first()) {
                                                                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt_var_134)) {
                                                                                                                    if (NIL == gethash_without_values(quoted_spec, visited_quoted_specs, UNPROVIDED)) {
                                                                                                                        queues.enqueue(quoted_spec, unvisited_quoted_specs);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    iteration_state_135 = dictionary_contents.do_dictionary_contents_next(iteration_state_135);
                                                                                                }
                                                                                            } 
                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_135);
                                                                                        }
                                                                                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                    }
                                                                                } 
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } finally {
                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_133, thread);
                                            }
                                        }
                                        {
                                            SubLObject spec = NIL;
                                            SubLObject pred_var = $$genls_GenlDenotesSpecInstances;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(quoted_col, TWO_INTEGER, pred_var)) {
                                                {
                                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(quoted_col, TWO_INTEGER, pred_var);
                                                    SubLObject done_var = NIL;
                                                    SubLObject token_var = NIL;
                                                    while (NIL == done_var) {
                                                        {
                                                            SubLObject final_index_spec = iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                            if (NIL != valid) {
                                                                {
                                                                    SubLObject final_index_iterator = NIL;
                                                                    try {
                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                                        {
                                                                            SubLObject done_var_137 = NIL;
                                                                            SubLObject token_var_138 = NIL;
                                                                            while (NIL == done_var_137) {
                                                                                {
                                                                                    SubLObject assertion = iteration_next_without_values_macro_helper(final_index_iterator, token_var_138);
                                                                                    SubLObject valid_139 = makeBoolean(token_var_138 != assertion);
                                                                                    if (NIL != valid_139) {
                                                                                        spec = assertions_high.gaf_arg(assertion, ONE_INTEGER);
                                                                                        if (NIL == gethash_without_values(spec, visited_specs, UNPROVIDED)) {
                                                                                            queues.enqueue(spec, unvisited_specs);
                                                                                        }
                                                                                    }
                                                                                    done_var_137 = makeBoolean(NIL == valid_139);
                                                                                }
                                                                            } 
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0_140 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (NIL != final_index_iterator) {
                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_140, thread);
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
                            } 
                            while (NIL == queues.queue_empty_p(unvisited_specs)) {
                                {
                                    SubLObject unquoted_col = queues.dequeue(unvisited_specs);
                                    if (NIL == gethash_without_values(unquoted_col, visited_specs, UNPROVIDED)) {
                                        sethash(unquoted_col, visited_specs, T);
                                        {
                                            SubLObject _prev_bind_0_141 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            try {
                                                sbhl_module_vars.$sbhl_module$.bind(NIL != sbhl_module_vars.get_sbhl_module($$isa) ? ((SubLObject) (sbhl_module_vars.get_sbhl_module($$isa))) : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
                                                {
                                                    SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(unquoted_col, sbhl_module_vars.get_sbhl_module($$isa));
                                                    if (NIL != d_link) {
                                                        {
                                                            SubLObject cdolist_list_var = sbhl_module_utilities.get_relevant_sbhl_directions(sbhl_module_vars.get_sbhl_module($$isa));
                                                            SubLObject direction = NIL;
                                                            for (direction = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , direction = cdolist_list_var.first()) {
                                                                {
                                                                    SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, sbhl_module_vars.get_sbhl_module($$isa));
                                                                    if (NIL != mt_links) {
                                                                        if (direction == sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa))) {
                                                                            {
                                                                                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                    thread.resetMultipleValues();
                                                                                    {
                                                                                        SubLObject mt_var_142 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                        SubLObject tv_links = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        {
                                                                                            SubLObject iteration_state_143 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_143)) {
                                                                                                thread.resetMultipleValues();
                                                                                                {
                                                                                                    SubLObject tv_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state_143);
                                                                                                    SubLObject link_nodes_var = thread.secondMultipleValue();
                                                                                                    thread.resetMultipleValues();
                                                                                                    if (NIL != sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                                                                        {
                                                                                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes_var))) : link_nodes_var;
                                                                                                            SubLObject cdolist_list_var_144 = new_list;
                                                                                                            SubLObject instance = NIL;
                                                                                                            for (instance = cdolist_list_var_144.first(); NIL != cdolist_list_var_144; cdolist_list_var_144 = cdolist_list_var_144.rest() , instance = cdolist_list_var_144.first()) {
                                                                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt_var_142)) {
                                                                                                                    if (NIL == gethash_without_values(instance, result_set, UNPROVIDED)) {
                                                                                                                        result = cons(instance, result);
                                                                                                                        sethash(instance, result_set, T);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    iteration_state_143 = dictionary_contents.do_dictionary_contents_next(iteration_state_143);
                                                                                                }
                                                                                            } 
                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_143);
                                                                                        }
                                                                                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                    }
                                                                                } 
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } finally {
                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_141, thread);
                                            }
                                        }
                                        {
                                            SubLObject csome_list_var = sbhl_link_methods.non_fort_instance_table_lookup(unquoted_col);
                                            SubLObject instance_tuple = NIL;
                                            for (instance_tuple = csome_list_var.first(); NIL != csome_list_var; csome_list_var = csome_list_var.rest() , instance_tuple = csome_list_var.first()) {
                                                {
                                                    SubLObject datum = instance_tuple;
                                                    SubLObject current = datum;
                                                    SubLObject instance = NIL;
                                                    SubLObject mt_var_145 = NIL;
                                                    SubLObject tv_var = NIL;
                                                    destructuring_bind_must_consp(current, datum, $list_alt111);
                                                    instance = current.first();
                                                    current = current.rest();
                                                    destructuring_bind_must_consp(current, datum, $list_alt111);
                                                    mt_var_145 = current.first();
                                                    current = current.rest();
                                                    destructuring_bind_must_consp(current, datum, $list_alt111);
                                                    tv_var = current.first();
                                                    current = current.rest();
                                                    if (NIL == current) {
                                                        if (NIL != sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                            if (NIL != mt_relevance_macros.relevant_mtP(mt_var_145)) {
                                                                if (NIL == gethash_without_values(instance, result_set, UNPROVIDED)) {
                                                                    result = cons(instance, result);
                                                                    sethash(instance, result_set, T);
                                                                }
                                                            }
                                                        }
                                                    } else {
                                                        cdestructuring_bind_error(datum, $list_alt111);
                                                    }
                                                }
                                            }
                                        }
                                        {
                                            SubLObject _prev_bind_0_146 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            try {
                                                sbhl_module_vars.$sbhl_module$.bind(NIL != sbhl_module_vars.get_sbhl_module($$genls) ? ((SubLObject) (sbhl_module_vars.get_sbhl_module($$genls))) : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
                                                {
                                                    SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(unquoted_col, sbhl_module_vars.get_sbhl_module($$genls));
                                                    if (NIL != d_link) {
                                                        {
                                                            SubLObject cdolist_list_var = sbhl_module_utilities.get_relevant_sbhl_directions(sbhl_module_vars.get_sbhl_module($$genls));
                                                            SubLObject direction = NIL;
                                                            for (direction = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , direction = cdolist_list_var.first()) {
                                                                {
                                                                    SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, sbhl_module_vars.get_sbhl_module($$genls));
                                                                    if (NIL != mt_links) {
                                                                        if (direction == sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$genls))) {
                                                                            {
                                                                                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                    thread.resetMultipleValues();
                                                                                    {
                                                                                        SubLObject mt_var_147 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                        SubLObject tv_links = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        {
                                                                                            SubLObject iteration_state_148 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_148)) {
                                                                                                thread.resetMultipleValues();
                                                                                                {
                                                                                                    SubLObject tv_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state_148);
                                                                                                    SubLObject link_nodes_var = thread.secondMultipleValue();
                                                                                                    thread.resetMultipleValues();
                                                                                                    if (NIL != sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                                                                        {
                                                                                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes_var))) : link_nodes_var;
                                                                                                            SubLObject cdolist_list_var_149 = new_list;
                                                                                                            SubLObject spec = NIL;
                                                                                                            for (spec = cdolist_list_var_149.first(); NIL != cdolist_list_var_149; cdolist_list_var_149 = cdolist_list_var_149.rest() , spec = cdolist_list_var_149.first()) {
                                                                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt_var_147)) {
                                                                                                                    if (NIL == gethash_without_values(spec, visited_specs, UNPROVIDED)) {
                                                                                                                        queues.enqueue(spec, unvisited_specs);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    iteration_state_148 = dictionary_contents.do_dictionary_contents_next(iteration_state_148);
                                                                                                }
                                                                                            } 
                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_148);
                                                                                        }
                                                                                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                    }
                                                                                } 
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } finally {
                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_146, thread);
                                            }
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
                return nreverse(result);
            }
        }
    }

    /**
     * Return all quoted instances of COL in MT.
     * This is an enhanced version of @xref all-quoted-instances
     * that supports #$genls-GenlDenotesSpecInstances.
     */
    @LispMethod(comment = "Return all quoted instances of COL in MT.\r\nThis is an enhanced version of @xref all-quoted-instances\r\nthat supports #$genls-GenlDenotesSpecInstances.\nReturn all quoted instances of COL in MT.\nThis is an enhanced version of @xref all-quoted-instances\nthat supports #$genls-GenlDenotesSpecInstances.")
    public static SubLObject all_quoted_instances_enhanced(final SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject visited_quoted_specs = make_hash_table(cardinality_estimates.spec_cardinality(col), symbol_function(EQ), UNPROVIDED);
        final SubLObject visited_specs = make_hash_table(SIXTEEN_INTEGER, symbol_function(EQ), UNPROVIDED);
        final SubLObject unvisited_quoted_specs = queues.create_queue(UNPROVIDED);
        final SubLObject unvisited_specs = queues.create_queue(UNPROVIDED);
        final SubLObject result_set = make_hash_table(SIXTEEN_INTEGER, symbol_function(EQ), UNPROVIDED);
        SubLObject result = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            queues.enqueue(col, unvisited_quoted_specs);
            while ((NIL == queues.queue_empty_p(unvisited_quoted_specs)) || (NIL == queues.queue_empty_p(unvisited_specs))) {
                while (NIL == queues.queue_empty_p(unvisited_quoted_specs)) {
                    final SubLObject quoted_col = queues.dequeue(unvisited_quoted_specs);
                    if (NIL == gethash_without_values(quoted_col, visited_quoted_specs, UNPROVIDED)) {
                        sethash(quoted_col, visited_quoted_specs, T);
                        final SubLObject _prev_bind_0_$129 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_module_vars.$sbhl_module$.bind(NIL != sbhl_module_vars.get_sbhl_module($$quotedIsa) ? sbhl_module_vars.get_sbhl_module($$quotedIsa) : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(quoted_col, sbhl_module_vars.get_sbhl_module($$quotedIsa));
                            if (NIL != d_link) {
                                SubLObject cdolist_list_var = sbhl_module_utilities.get_relevant_sbhl_directions(sbhl_module_vars.get_sbhl_module($$quotedIsa));
                                SubLObject direction = NIL;
                                direction = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, sbhl_module_vars.get_sbhl_module($$quotedIsa));
                                    if ((NIL != mt_links) && direction.eql(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$quotedIsa)))) {
                                        SubLObject iteration_state;
                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                            thread.resetMultipleValues();
                                            final SubLObject mt_var_$130 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                            final SubLObject tv_links = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            SubLObject iteration_state_$131;
                                            for (iteration_state_$131 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$131); iteration_state_$131 = dictionary_contents.do_dictionary_contents_next(iteration_state_$131)) {
                                                thread.resetMultipleValues();
                                                final SubLObject tv_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$131);
                                                final SubLObject link_nodes_var = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                if (NIL != sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                    final SubLObject sol = link_nodes_var;
                                                    if (NIL != set.set_p(sol)) {
                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                        SubLObject basis_object;
                                                        SubLObject state;
                                                        SubLObject instance;
                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                            instance = set_contents.do_set_contents_next(basis_object, state);
                                                            if (((NIL != set_contents.do_set_contents_element_validP(state, instance)) && (NIL != mt_relevance_macros.relevant_mtP(mt_var_$130))) && (NIL == gethash_without_values(instance, result_set, UNPROVIDED))) {
                                                                result = cons(instance, result);
                                                                sethash(instance, result_set, T);
                                                            }
                                                        }
                                                    } else
                                                        if (sol.isList()) {
                                                            SubLObject csome_list_var = sol;
                                                            SubLObject instance2 = NIL;
                                                            instance2 = csome_list_var.first();
                                                            while (NIL != csome_list_var) {
                                                                if ((NIL != mt_relevance_macros.relevant_mtP(mt_var_$130)) && (NIL == gethash_without_values(instance2, result_set, UNPROVIDED))) {
                                                                    result = cons(instance2, result);
                                                                    sethash(instance2, result_set, T);
                                                                }
                                                                csome_list_var = csome_list_var.rest();
                                                                instance2 = csome_list_var.first();
                                                            } 
                                                        } else {
                                                            Errors.error($str114$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                        }

                                                }
                                            }
                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$131);
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                    }
                                    cdolist_list_var = cdolist_list_var.rest();
                                    direction = cdolist_list_var.first();
                                } 
                            }
                        } finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$129, thread);
                        }
                        final SubLObject _prev_bind_0_$130 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_module_vars.$sbhl_module$.bind(NIL != sbhl_module_vars.get_sbhl_module($$genls) ? sbhl_module_vars.get_sbhl_module($$genls) : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(quoted_col, sbhl_module_vars.get_sbhl_module($$genls));
                            if (NIL != d_link) {
                                SubLObject cdolist_list_var = sbhl_module_utilities.get_relevant_sbhl_directions(sbhl_module_vars.get_sbhl_module($$genls));
                                SubLObject direction = NIL;
                                direction = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, sbhl_module_vars.get_sbhl_module($$genls));
                                    if ((NIL != mt_links) && direction.eql(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$genls)))) {
                                        SubLObject iteration_state;
                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                            thread.resetMultipleValues();
                                            final SubLObject mt_var_$131 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                            final SubLObject tv_links = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            SubLObject iteration_state_$132;
                                            for (iteration_state_$132 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$132); iteration_state_$132 = dictionary_contents.do_dictionary_contents_next(iteration_state_$132)) {
                                                thread.resetMultipleValues();
                                                final SubLObject tv_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$132);
                                                final SubLObject link_nodes_var = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                if (NIL != sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                    final SubLObject sol = link_nodes_var;
                                                    if (NIL != set.set_p(sol)) {
                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                        SubLObject basis_object;
                                                        SubLObject state;
                                                        SubLObject quoted_spec;
                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                            quoted_spec = set_contents.do_set_contents_next(basis_object, state);
                                                            if (((NIL != set_contents.do_set_contents_element_validP(state, quoted_spec)) && (NIL != mt_relevance_macros.relevant_mtP(mt_var_$131))) && (NIL == gethash_without_values(quoted_spec, visited_quoted_specs, UNPROVIDED))) {
                                                                queues.enqueue(quoted_spec, unvisited_quoted_specs);
                                                            }
                                                        }
                                                    } else
                                                        if (sol.isList()) {
                                                            SubLObject csome_list_var = sol;
                                                            SubLObject quoted_spec2 = NIL;
                                                            quoted_spec2 = csome_list_var.first();
                                                            while (NIL != csome_list_var) {
                                                                if ((NIL != mt_relevance_macros.relevant_mtP(mt_var_$131)) && (NIL == gethash_without_values(quoted_spec2, visited_quoted_specs, UNPROVIDED))) {
                                                                    queues.enqueue(quoted_spec2, unvisited_quoted_specs);
                                                                }
                                                                csome_list_var = csome_list_var.rest();
                                                                quoted_spec2 = csome_list_var.first();
                                                            } 
                                                        } else {
                                                            Errors.error($str114$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                        }

                                                }
                                            }
                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$132);
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                    }
                                    cdolist_list_var = cdolist_list_var.rest();
                                    direction = cdolist_list_var.first();
                                } 
                            }
                        } finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$130, thread);
                        }
                        SubLObject spec = NIL;
                        final SubLObject pred_var = $$genls_GenlDenotesSpecInstances;
                        if (NIL == kb_mapping_macros.do_gaf_arg_index_key_validator(quoted_col, TWO_INTEGER, pred_var)) {
                            continue;
                        }
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(quoted_col, TWO_INTEGER, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                    SubLObject done_var_$135 = NIL;
                                    final SubLObject token_var_$136 = NIL;
                                    while (NIL == done_var_$135) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$136);
                                        final SubLObject valid_$137 = makeBoolean(!token_var_$136.eql(assertion));
                                        if (NIL != valid_$137) {
                                            spec = assertions_high.gaf_arg(assertion, ONE_INTEGER);
                                            if (NIL == gethash_without_values(spec, visited_specs, UNPROVIDED)) {
                                                queues.enqueue(spec, unvisited_specs);
                                            }
                                        }
                                        done_var_$135 = makeBoolean(NIL == valid_$137);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$131 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$131, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                } 
                while (NIL == queues.queue_empty_p(unvisited_specs)) {
                    final SubLObject unquoted_col = queues.dequeue(unvisited_specs);
                    if (NIL == gethash_without_values(unquoted_col, visited_specs, UNPROVIDED)) {
                        sethash(unquoted_col, visited_specs, T);
                        final SubLObject _prev_bind_0_$132 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_module_vars.$sbhl_module$.bind(NIL != sbhl_module_vars.get_sbhl_module($$isa) ? sbhl_module_vars.get_sbhl_module($$isa) : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(unquoted_col, sbhl_module_vars.get_sbhl_module($$isa));
                            if (NIL != d_link) {
                                SubLObject cdolist_list_var = sbhl_module_utilities.get_relevant_sbhl_directions(sbhl_module_vars.get_sbhl_module($$isa));
                                SubLObject direction = NIL;
                                direction = cdolist_list_var.first();
                                while (NIL != cdolist_list_var) {
                                    final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, sbhl_module_vars.get_sbhl_module($$isa));
                                    if ((NIL != mt_links) && direction.eql(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$isa)))) {
                                        SubLObject iteration_state;
                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                            thread.resetMultipleValues();
                                            final SubLObject mt_var_$132 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                            final SubLObject tv_links = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            SubLObject iteration_state_$133;
                                            for (iteration_state_$133 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$133); iteration_state_$133 = dictionary_contents.do_dictionary_contents_next(iteration_state_$133)) {
                                                thread.resetMultipleValues();
                                                final SubLObject tv_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$133);
                                                final SubLObject link_nodes_var = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                if (NIL != sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                    final SubLObject sol = link_nodes_var;
                                                    if (NIL != set.set_p(sol)) {
                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                        SubLObject basis_object;
                                                        SubLObject state;
                                                        SubLObject instance;
                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                            instance = set_contents.do_set_contents_next(basis_object, state);
                                                            if (((NIL != set_contents.do_set_contents_element_validP(state, instance)) && (NIL != mt_relevance_macros.relevant_mtP(mt_var_$132))) && (NIL == gethash_without_values(instance, result_set, UNPROVIDED))) {
                                                                result = cons(instance, result);
                                                                sethash(instance, result_set, T);
                                                            }
                                                        }
                                                    } else
                                                        if (sol.isList()) {
                                                            SubLObject csome_list_var = sol;
                                                            SubLObject instance2 = NIL;
                                                            instance2 = csome_list_var.first();
                                                            while (NIL != csome_list_var) {
                                                                if ((NIL != mt_relevance_macros.relevant_mtP(mt_var_$132)) && (NIL == gethash_without_values(instance2, result_set, UNPROVIDED))) {
                                                                    result = cons(instance2, result);
                                                                    sethash(instance2, result_set, T);
                                                                }
                                                                csome_list_var = csome_list_var.rest();
                                                                instance2 = csome_list_var.first();
                                                            } 
                                                        } else {
                                                            Errors.error($str114$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                        }

                                                }
                                            }
                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$133);
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                    }
                                    cdolist_list_var = cdolist_list_var.rest();
                                    direction = cdolist_list_var.first();
                                } 
                            }
                        } finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$132, thread);
                        }
                        SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(unquoted_col);
                        SubLObject instance_tuple = NIL;
                        instance_tuple = csome_list_var2.first();
                        while (NIL != csome_list_var2) {
                            SubLObject current;
                            final SubLObject datum = current = instance_tuple;
                            SubLObject instance3 = NIL;
                            SubLObject mt_var_$133 = NIL;
                            SubLObject tv_var2 = NIL;
                            destructuring_bind_must_consp(current, datum, $list160);
                            instance3 = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list160);
                            mt_var_$133 = current.first();
                            current = current.rest();
                            destructuring_bind_must_consp(current, datum, $list160);
                            tv_var2 = current.first();
                            current = current.rest();
                            if (NIL == current) {
                                if (((NIL != sbhl_search_vars.sbhl_true_tv_p(tv_var2)) && (NIL != mt_relevance_macros.relevant_mtP(mt_var_$133))) && (NIL == gethash_without_values(instance3, result_set, UNPROVIDED))) {
                                    result = cons(instance3, result);
                                    sethash(instance3, result_set, T);
                                }
                            } else {
                                cdestructuring_bind_error(datum, $list160);
                            }
                            csome_list_var2 = csome_list_var2.rest();
                            instance_tuple = csome_list_var2.first();
                        } 
                        final SubLObject _prev_bind_0_$133 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_module_vars.$sbhl_module$.bind(NIL != sbhl_module_vars.get_sbhl_module($$genls) ? sbhl_module_vars.get_sbhl_module($$genls) : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(unquoted_col, sbhl_module_vars.get_sbhl_module($$genls));
                            if (NIL == d_link) {
                                continue;
                            }
                            SubLObject cdolist_list_var = sbhl_module_utilities.get_relevant_sbhl_directions(sbhl_module_vars.get_sbhl_module($$genls));
                            SubLObject direction = NIL;
                            direction = cdolist_list_var.first();
                            while (NIL != cdolist_list_var) {
                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, sbhl_module_vars.get_sbhl_module($$genls));
                                if ((NIL != mt_links) && direction.eql(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module($$genls)))) {
                                    SubLObject iteration_state;
                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                        thread.resetMultipleValues();
                                        final SubLObject mt_var_$134 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                        final SubLObject tv_links = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        SubLObject iteration_state_$134;
                                        for (iteration_state_$134 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$134); iteration_state_$134 = dictionary_contents.do_dictionary_contents_next(iteration_state_$134)) {
                                            thread.resetMultipleValues();
                                            final SubLObject tv_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$134);
                                            final SubLObject link_nodes_var = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if (NIL != sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                final SubLObject sol = link_nodes_var;
                                                if (NIL != set.set_p(sol)) {
                                                    final SubLObject set_contents_var = set.do_set_internal(sol);
                                                    SubLObject basis_object;
                                                    SubLObject state;
                                                    SubLObject spec2;
                                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                        spec2 = set_contents.do_set_contents_next(basis_object, state);
                                                        if (((NIL != set_contents.do_set_contents_element_validP(state, spec2)) && (NIL != mt_relevance_macros.relevant_mtP(mt_var_$134))) && (NIL == gethash_without_values(spec2, visited_specs, UNPROVIDED))) {
                                                            queues.enqueue(spec2, unvisited_specs);
                                                        }
                                                    }
                                                } else
                                                    if (sol.isList()) {
                                                        SubLObject csome_list_var = sol;
                                                        SubLObject spec3 = NIL;
                                                        spec3 = csome_list_var.first();
                                                        while (NIL != csome_list_var) {
                                                            if ((NIL != mt_relevance_macros.relevant_mtP(mt_var_$134)) && (NIL == gethash_without_values(spec3, visited_specs, UNPROVIDED))) {
                                                                queues.enqueue(spec3, unvisited_specs);
                                                            }
                                                            csome_list_var = csome_list_var.rest();
                                                            spec3 = csome_list_var.first();
                                                        } 
                                                    } else {
                                                        Errors.error($str114$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                    }

                                            }
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state_$134);
                                    }
                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                }
                                cdolist_list_var = cdolist_list_var.rest();
                                direction = cdolist_list_var.first();
                            } 
                        } finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$133, thread);
                        }
                    }
                } 
            } 
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return nreverse(result);
    }

    /**
     * Return T iff TERM is a quoted instance of COL in MT.
     * This is an enhanced version of @xref quoted-isa?
     * that supports #$genls-GenlDenotesSpecInstances.
     */
    @LispMethod(comment = "Return T iff TERM is a quoted instance of COL in MT.\r\nThis is an enhanced version of @xref quoted-isa?\r\nthat supports #$genls-GenlDenotesSpecInstances.\nReturn T iff TERM is a quoted instance of COL in MT.\nThis is an enhanced version of @xref quoted-isa?\nthat supports #$genls-GenlDenotesSpecInstances.")
    public static final SubLObject quoted_isa_enhancedP_alt(SubLObject v_term, SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject visited_quoted_genls = new_set(symbol_function(EQ), cardinality_estimates.isa_cardinality(col));
                SubLObject visited_genls = new_set(symbol_function(EQ), cardinality_estimates.isa_cardinality(col));
                SubLObject unvisited_quoted_genls = queues.create_queue();
                SubLObject unvisited_genls = queues.create_queue();
                SubLObject successP = NIL;
                SubLObject mt_var = mt;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                        {
                            SubLObject _prev_bind_0_150 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_module_vars.$sbhl_module$.bind(NIL != sbhl_module_vars.get_sbhl_module($$quotedIsa) ? ((SubLObject) (sbhl_module_vars.get_sbhl_module($$quotedIsa))) : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
                                {
                                    SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(v_term, sbhl_module_vars.get_sbhl_module($$quotedIsa));
                                    if (NIL != d_link) {
                                        {
                                            SubLObject cdolist_list_var = sbhl_module_utilities.get_relevant_sbhl_directions(sbhl_module_vars.get_sbhl_module($$quotedIsa));
                                            SubLObject direction = NIL;
                                            for (direction = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , direction = cdolist_list_var.first()) {
                                                {
                                                    SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, sbhl_module_vars.get_sbhl_module($$quotedIsa));
                                                    if (NIL != mt_links) {
                                                        if (direction == sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module($$quotedIsa))) {
                                                            {
                                                                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    {
                                                                        SubLObject mt_var_151 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        SubLObject tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        {
                                                                            SubLObject iteration_state_152 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_152)) {
                                                                                thread.resetMultipleValues();
                                                                                {
                                                                                    SubLObject tv_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state_152);
                                                                                    SubLObject link_nodes_var = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                                                        {
                                                                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes_var))) : link_nodes_var;
                                                                                            SubLObject cdolist_list_var_153 = new_list;
                                                                                            SubLObject quoted_isa = NIL;
                                                                                            for (quoted_isa = cdolist_list_var_153.first(); NIL != cdolist_list_var_153; cdolist_list_var_153 = cdolist_list_var_153.rest() , quoted_isa = cdolist_list_var_153.first()) {
                                                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt_var_151)) {
                                                                                                    queues.enqueue(quoted_isa, unvisited_quoted_genls);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    iteration_state_152 = dictionary_contents.do_dictionary_contents_next(iteration_state_152);
                                                                                }
                                                                            } 
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_152);
                                                                        }
                                                                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                    }
                                                                } 
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_150, thread);
                            }
                        }
                        {
                            SubLObject _prev_bind_0_154 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_module_vars.$sbhl_module$.bind(NIL != sbhl_module_vars.get_sbhl_module($$isa) ? ((SubLObject) (sbhl_module_vars.get_sbhl_module($$isa))) : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
                                {
                                    SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(v_term, sbhl_module_vars.get_sbhl_module($$isa));
                                    if (NIL != d_link) {
                                        {
                                            SubLObject cdolist_list_var = sbhl_module_utilities.get_relevant_sbhl_directions(sbhl_module_vars.get_sbhl_module($$isa));
                                            SubLObject direction = NIL;
                                            for (direction = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , direction = cdolist_list_var.first()) {
                                                {
                                                    SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, sbhl_module_vars.get_sbhl_module($$isa));
                                                    if (NIL != mt_links) {
                                                        if (direction == sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module($$isa))) {
                                                            {
                                                                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    {
                                                                        SubLObject mt_var_155 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        SubLObject tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        {
                                                                            SubLObject iteration_state_156 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_156)) {
                                                                                thread.resetMultipleValues();
                                                                                {
                                                                                    SubLObject tv_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state_156);
                                                                                    SubLObject link_nodes_var = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (NIL != sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                                                        {
                                                                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes_var))) : link_nodes_var;
                                                                                            SubLObject cdolist_list_var_157 = new_list;
                                                                                            SubLObject v_isa = NIL;
                                                                                            for (v_isa = cdolist_list_var_157.first(); NIL != cdolist_list_var_157; cdolist_list_var_157 = cdolist_list_var_157.rest() , v_isa = cdolist_list_var_157.first()) {
                                                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt_var_155)) {
                                                                                                    queues.enqueue(v_isa, unvisited_genls);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                    iteration_state_156 = dictionary_contents.do_dictionary_contents_next(iteration_state_156);
                                                                                }
                                                                            } 
                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_156);
                                                                        }
                                                                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                    }
                                                                } 
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_154, thread);
                            }
                        }
                        while (!((NIL != successP) || ((NIL != queues.queue_empty_p(unvisited_quoted_genls)) && (NIL != queues.queue_empty_p(unvisited_genls))))) {
                            while (!((NIL != successP) || (NIL != queues.queue_empty_p(unvisited_quoted_genls)))) {
                                {
                                    SubLObject quoted_col = queues.dequeue(unvisited_quoted_genls);
                                    if (NIL == set_memberP(quoted_col, visited_quoted_genls)) {
                                        set_add(quoted_col, visited_quoted_genls);
                                        if (quoted_col == col) {
                                            successP = T;
                                        } else {
                                            {
                                                SubLObject _prev_bind_0_158 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                try {
                                                    sbhl_module_vars.$sbhl_module$.bind(NIL != sbhl_module_vars.get_sbhl_module($$genls) ? ((SubLObject) (sbhl_module_vars.get_sbhl_module($$genls))) : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
                                                    {
                                                        SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(quoted_col, sbhl_module_vars.get_sbhl_module($$genls));
                                                        if (NIL != d_link) {
                                                            {
                                                                SubLObject cdolist_list_var = sbhl_module_utilities.get_relevant_sbhl_directions(sbhl_module_vars.get_sbhl_module($$genls));
                                                                SubLObject direction = NIL;
                                                                for (direction = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , direction = cdolist_list_var.first()) {
                                                                    {
                                                                        SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, sbhl_module_vars.get_sbhl_module($$genls));
                                                                        if (NIL != mt_links) {
                                                                            if (direction == sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module($$genls))) {
                                                                                {
                                                                                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                        thread.resetMultipleValues();
                                                                                        {
                                                                                            SubLObject mt_var_159 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                            SubLObject tv_links = thread.secondMultipleValue();
                                                                                            thread.resetMultipleValues();
                                                                                            {
                                                                                                SubLObject iteration_state_160 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_160)) {
                                                                                                    thread.resetMultipleValues();
                                                                                                    {
                                                                                                        SubLObject tv_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state_160);
                                                                                                        SubLObject link_nodes_var = thread.secondMultipleValue();
                                                                                                        thread.resetMultipleValues();
                                                                                                        if (NIL != sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                                                                            {
                                                                                                                SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes_var))) : link_nodes_var;
                                                                                                                SubLObject cdolist_list_var_161 = new_list;
                                                                                                                SubLObject quoted_genl = NIL;
                                                                                                                for (quoted_genl = cdolist_list_var_161.first(); NIL != cdolist_list_var_161; cdolist_list_var_161 = cdolist_list_var_161.rest() , quoted_genl = cdolist_list_var_161.first()) {
                                                                                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt_var_159)) {
                                                                                                                        if (NIL == set_memberP(quoted_genl, visited_quoted_genls)) {
                                                                                                                            queues.enqueue(quoted_genl, unvisited_quoted_genls);
                                                                                                                        }
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                        iteration_state_160 = dictionary_contents.do_dictionary_contents_next(iteration_state_160);
                                                                                                    }
                                                                                                } 
                                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_160);
                                                                                            }
                                                                                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                        }
                                                                                    } 
                                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                } finally {
                                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_158, thread);
                                                }
                                            }
                                        }
                                    }
                                }
                            } 
                            while (!(((NIL != successP) || (NIL == queues.queue_empty_p(unvisited_quoted_genls))) || (NIL != queues.queue_empty_p(unvisited_genls)))) {
                                {
                                    SubLObject unquoted_col = queues.dequeue(unvisited_genls);
                                    if (NIL == set_memberP(unquoted_col, visited_genls)) {
                                        set_add(unquoted_col, visited_genls);
                                        {
                                            SubLObject _prev_bind_0_162 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                            try {
                                                sbhl_module_vars.$sbhl_module$.bind(NIL != sbhl_module_vars.get_sbhl_module($$genls) ? ((SubLObject) (sbhl_module_vars.get_sbhl_module($$genls))) : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
                                                {
                                                    SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(unquoted_col, sbhl_module_vars.get_sbhl_module($$genls));
                                                    if (NIL != d_link) {
                                                        {
                                                            SubLObject cdolist_list_var = sbhl_module_utilities.get_relevant_sbhl_directions(sbhl_module_vars.get_sbhl_module($$genls));
                                                            SubLObject direction = NIL;
                                                            for (direction = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , direction = cdolist_list_var.first()) {
                                                                {
                                                                    SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, sbhl_module_vars.get_sbhl_module($$genls));
                                                                    if (NIL != mt_links) {
                                                                        if (direction == sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module($$genls))) {
                                                                            {
                                                                                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links));
                                                                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                                    thread.resetMultipleValues();
                                                                                    {
                                                                                        SubLObject mt_var_163 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                                        SubLObject tv_links = thread.secondMultipleValue();
                                                                                        thread.resetMultipleValues();
                                                                                        {
                                                                                            SubLObject iteration_state_164 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links));
                                                                                            while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_164)) {
                                                                                                thread.resetMultipleValues();
                                                                                                {
                                                                                                    SubLObject tv_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state_164);
                                                                                                    SubLObject link_nodes_var = thread.secondMultipleValue();
                                                                                                    thread.resetMultipleValues();
                                                                                                    if (NIL != sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                                                                        {
                                                                                                            SubLObject new_list = (NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? ((SubLObject) (list_utilities.randomize_list(link_nodes_var))) : link_nodes_var;
                                                                                                            SubLObject cdolist_list_var_165 = new_list;
                                                                                                            SubLObject unquoted_genl = NIL;
                                                                                                            for (unquoted_genl = cdolist_list_var_165.first(); NIL != cdolist_list_var_165; cdolist_list_var_165 = cdolist_list_var_165.rest() , unquoted_genl = cdolist_list_var_165.first()) {
                                                                                                                if (NIL != mt_relevance_macros.relevant_mtP(mt_var_163)) {
                                                                                                                    if (NIL == set_memberP(unquoted_genl, visited_genls)) {
                                                                                                                        queues.enqueue(unquoted_genl, unvisited_genls);
                                                                                                                    }
                                                                                                                }
                                                                                                            }
                                                                                                        }
                                                                                                    }
                                                                                                    iteration_state_164 = dictionary_contents.do_dictionary_contents_next(iteration_state_164);
                                                                                                }
                                                                                            } 
                                                                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_164);
                                                                                        }
                                                                                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                                    }
                                                                                } 
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                            }
                                                                        }
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            } finally {
                                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_162, thread);
                                            }
                                        }
                                        {
                                            SubLObject quoted_genl = NIL;
                                            SubLObject pred_var = $$genls_GenlDenotesSpecInstances;
                                            if (NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(unquoted_col, ONE_INTEGER, pred_var)) {
                                                {
                                                    SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(unquoted_col, ONE_INTEGER, pred_var);
                                                    SubLObject done_var = NIL;
                                                    SubLObject token_var = NIL;
                                                    while (NIL == done_var) {
                                                        {
                                                            SubLObject final_index_spec = iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                            SubLObject valid = makeBoolean(token_var != final_index_spec);
                                                            if (NIL != valid) {
                                                                {
                                                                    SubLObject final_index_iterator = NIL;
                                                                    try {
                                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                                                        {
                                                                            SubLObject done_var_166 = NIL;
                                                                            SubLObject token_var_167 = NIL;
                                                                            while (NIL == done_var_166) {
                                                                                {
                                                                                    SubLObject assertion = iteration_next_without_values_macro_helper(final_index_iterator, token_var_167);
                                                                                    SubLObject valid_168 = makeBoolean(token_var_167 != assertion);
                                                                                    if (NIL != valid_168) {
                                                                                        quoted_genl = assertions_high.gaf_arg(assertion, TWO_INTEGER);
                                                                                        if (NIL == set_memberP(quoted_genl, visited_quoted_genls)) {
                                                                                            queues.enqueue(quoted_genl, unvisited_quoted_genls);
                                                                                        }
                                                                                    }
                                                                                    done_var_166 = makeBoolean(NIL == valid_168);
                                                                                }
                                                                            } 
                                                                        }
                                                                    } finally {
                                                                        {
                                                                            SubLObject _prev_bind_0_169 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                            try {
                                                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                                                if (NIL != final_index_iterator) {
                                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                                }
                                                                            } finally {
                                                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_169, thread);
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
                            } 
                        } 
                    } finally {
                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
                    }
                }
                return successP;
            }
        }
    }

    /**
     * Return T iff TERM is a quoted instance of COL in MT.
     * This is an enhanced version of @xref quoted-isa?
     * that supports #$genls-GenlDenotesSpecInstances.
     */
    @LispMethod(comment = "Return T iff TERM is a quoted instance of COL in MT.\r\nThis is an enhanced version of @xref quoted-isa?\r\nthat supports #$genls-GenlDenotesSpecInstances.\nReturn T iff TERM is a quoted instance of COL in MT.\nThis is an enhanced version of @xref quoted-isa?\nthat supports #$genls-GenlDenotesSpecInstances.")
    public static SubLObject quoted_isa_enhancedP(final SubLObject v_term, final SubLObject col, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject visited_quoted_genls = set.new_set(symbol_function(EQ), cardinality_estimates.isa_cardinality(col));
        final SubLObject visited_genls = set.new_set(symbol_function(EQ), cardinality_estimates.isa_cardinality(col));
        final SubLObject unvisited_quoted_genls = queues.create_queue(UNPROVIDED);
        final SubLObject unvisited_genls = queues.create_queue(UNPROVIDED);
        SubLObject successP = NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject _prev_bind_0_$146 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            try {
                sbhl_module_vars.$sbhl_module$.bind(NIL != sbhl_module_vars.get_sbhl_module($$quotedIsa) ? sbhl_module_vars.get_sbhl_module($$quotedIsa) : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
                final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(v_term, sbhl_module_vars.get_sbhl_module($$quotedIsa));
                if (NIL != d_link) {
                    SubLObject cdolist_list_var = sbhl_module_utilities.get_relevant_sbhl_directions(sbhl_module_vars.get_sbhl_module($$quotedIsa));
                    SubLObject direction = NIL;
                    direction = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, sbhl_module_vars.get_sbhl_module($$quotedIsa));
                        if ((NIL != mt_links) && direction.eql(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module($$quotedIsa)))) {
                            SubLObject iteration_state;
                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                thread.resetMultipleValues();
                                final SubLObject mt_var_$147 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                final SubLObject tv_links = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                SubLObject iteration_state_$148;
                                for (iteration_state_$148 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$148); iteration_state_$148 = dictionary_contents.do_dictionary_contents_next(iteration_state_$148)) {
                                    thread.resetMultipleValues();
                                    final SubLObject tv_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$148);
                                    final SubLObject link_nodes_var = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL != sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                        final SubLObject sol = link_nodes_var;
                                        if (NIL != set.set_p(sol)) {
                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                            SubLObject basis_object;
                                            SubLObject state;
                                            SubLObject quoted_isa;
                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                quoted_isa = set_contents.do_set_contents_next(basis_object, state);
                                                if ((NIL != set_contents.do_set_contents_element_validP(state, quoted_isa)) && (NIL != mt_relevance_macros.relevant_mtP(mt_var_$147))) {
                                                    queues.enqueue(quoted_isa, unvisited_quoted_genls);
                                                }
                                            }
                                        } else
                                            if (sol.isList()) {
                                                SubLObject csome_list_var = sol;
                                                SubLObject quoted_isa2 = NIL;
                                                quoted_isa2 = csome_list_var.first();
                                                while (NIL != csome_list_var) {
                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt_var_$147)) {
                                                        queues.enqueue(quoted_isa2, unvisited_quoted_genls);
                                                    }
                                                    csome_list_var = csome_list_var.rest();
                                                    quoted_isa2 = csome_list_var.first();
                                                } 
                                            } else {
                                                Errors.error($str114$_A_is_neither_SET_P_nor_LISTP_, sol);
                                            }

                                    }
                                }
                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$148);
                            }
                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        direction = cdolist_list_var.first();
                    } 
                }
            } finally {
                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$146, thread);
            }
            final SubLObject _prev_bind_0_$147 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            try {
                sbhl_module_vars.$sbhl_module$.bind(NIL != sbhl_module_vars.get_sbhl_module($$isa) ? sbhl_module_vars.get_sbhl_module($$isa) : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
                final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(v_term, sbhl_module_vars.get_sbhl_module($$isa));
                if (NIL != d_link) {
                    SubLObject cdolist_list_var = sbhl_module_utilities.get_relevant_sbhl_directions(sbhl_module_vars.get_sbhl_module($$isa));
                    SubLObject direction = NIL;
                    direction = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, sbhl_module_vars.get_sbhl_module($$isa));
                        if ((NIL != mt_links) && direction.eql(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module($$isa)))) {
                            SubLObject iteration_state;
                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                thread.resetMultipleValues();
                                final SubLObject mt_var_$148 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                final SubLObject tv_links = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                SubLObject iteration_state_$149;
                                for (iteration_state_$149 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$149); iteration_state_$149 = dictionary_contents.do_dictionary_contents_next(iteration_state_$149)) {
                                    thread.resetMultipleValues();
                                    final SubLObject tv_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$149);
                                    final SubLObject link_nodes_var = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (NIL != sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                        final SubLObject sol = link_nodes_var;
                                        if (NIL != set.set_p(sol)) {
                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                            SubLObject basis_object;
                                            SubLObject state;
                                            SubLObject v_isa;
                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                v_isa = set_contents.do_set_contents_next(basis_object, state);
                                                if ((NIL != set_contents.do_set_contents_element_validP(state, v_isa)) && (NIL != mt_relevance_macros.relevant_mtP(mt_var_$148))) {
                                                    queues.enqueue(v_isa, unvisited_genls);
                                                }
                                            }
                                        } else
                                            if (sol.isList()) {
                                                SubLObject csome_list_var = sol;
                                                SubLObject v_isa2 = NIL;
                                                v_isa2 = csome_list_var.first();
                                                while (NIL != csome_list_var) {
                                                    if (NIL != mt_relevance_macros.relevant_mtP(mt_var_$148)) {
                                                        queues.enqueue(v_isa2, unvisited_genls);
                                                    }
                                                    csome_list_var = csome_list_var.rest();
                                                    v_isa2 = csome_list_var.first();
                                                } 
                                            } else {
                                                Errors.error($str114$_A_is_neither_SET_P_nor_LISTP_, sol);
                                            }

                                    }
                                }
                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$149);
                            }
                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        direction = cdolist_list_var.first();
                    } 
                }
            } finally {
                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$147, thread);
            }
            while ((NIL == successP) && ((NIL == queues.queue_empty_p(unvisited_quoted_genls)) || (NIL == queues.queue_empty_p(unvisited_genls)))) {
                while ((NIL == successP) && (NIL == queues.queue_empty_p(unvisited_quoted_genls))) {
                    final SubLObject quoted_col = queues.dequeue(unvisited_quoted_genls);
                    if (NIL == set.set_memberP(quoted_col, visited_quoted_genls)) {
                        set.set_add(quoted_col, visited_quoted_genls);
                        if (quoted_col.eql(col)) {
                            successP = T;
                        } else {
                            final SubLObject _prev_bind_0_$148 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_module_vars.$sbhl_module$.bind(NIL != sbhl_module_vars.get_sbhl_module($$genls) ? sbhl_module_vars.get_sbhl_module($$genls) : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
                                final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(quoted_col, sbhl_module_vars.get_sbhl_module($$genls));
                                if (NIL == d_link2) {
                                    continue;
                                }
                                SubLObject cdolist_list_var2 = sbhl_module_utilities.get_relevant_sbhl_directions(sbhl_module_vars.get_sbhl_module($$genls));
                                SubLObject direction2 = NIL;
                                direction2 = cdolist_list_var2.first();
                                while (NIL != cdolist_list_var2) {
                                    final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, direction2, sbhl_module_vars.get_sbhl_module($$genls));
                                    if ((NIL != mt_links2) && direction2.eql(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module($$genls)))) {
                                        SubLObject iteration_state2;
                                        for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                            thread.resetMultipleValues();
                                            final SubLObject mt_var_$149 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                            final SubLObject tv_links2 = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            SubLObject iteration_state_$150;
                                            for (iteration_state_$150 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$150); iteration_state_$150 = dictionary_contents.do_dictionary_contents_next(iteration_state_$150)) {
                                                thread.resetMultipleValues();
                                                final SubLObject tv_var2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$150);
                                                final SubLObject link_nodes_var2 = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                if (NIL != sbhl_search_vars.sbhl_true_tv_p(tv_var2)) {
                                                    final SubLObject sol2 = link_nodes_var2;
                                                    if (NIL != set.set_p(sol2)) {
                                                        final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                        SubLObject basis_object2;
                                                        SubLObject state2;
                                                        SubLObject quoted_genl;
                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                            quoted_genl = set_contents.do_set_contents_next(basis_object2, state2);
                                                            if (((NIL != set_contents.do_set_contents_element_validP(state2, quoted_genl)) && (NIL != mt_relevance_macros.relevant_mtP(mt_var_$149))) && (NIL == set.set_memberP(quoted_genl, visited_quoted_genls))) {
                                                                queues.enqueue(quoted_genl, unvisited_quoted_genls);
                                                            }
                                                        }
                                                    } else
                                                        if (sol2.isList()) {
                                                            SubLObject csome_list_var2 = sol2;
                                                            SubLObject quoted_genl2 = NIL;
                                                            quoted_genl2 = csome_list_var2.first();
                                                            while (NIL != csome_list_var2) {
                                                                if ((NIL != mt_relevance_macros.relevant_mtP(mt_var_$149)) && (NIL == set.set_memberP(quoted_genl2, visited_quoted_genls))) {
                                                                    queues.enqueue(quoted_genl2, unvisited_quoted_genls);
                                                                }
                                                                csome_list_var2 = csome_list_var2.rest();
                                                                quoted_genl2 = csome_list_var2.first();
                                                            } 
                                                        } else {
                                                            Errors.error($str114$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                        }

                                                }
                                            }
                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$150);
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                    }
                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                    direction2 = cdolist_list_var2.first();
                                } 
                            } finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$148, thread);
                            }
                        }
                    }
                } 
                while (((NIL == successP) && (NIL != queues.queue_empty_p(unvisited_quoted_genls))) && (NIL == queues.queue_empty_p(unvisited_genls))) {
                    final SubLObject unquoted_col = queues.dequeue(unvisited_genls);
                    if (NIL == set.set_memberP(unquoted_col, visited_genls)) {
                        set.set_add(unquoted_col, visited_genls);
                        final SubLObject _prev_bind_0_$149 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_module_vars.$sbhl_module$.bind(NIL != sbhl_module_vars.get_sbhl_module($$genls) ? sbhl_module_vars.get_sbhl_module($$genls) : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
                            final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(unquoted_col, sbhl_module_vars.get_sbhl_module($$genls));
                            if (NIL != d_link2) {
                                SubLObject cdolist_list_var2 = sbhl_module_utilities.get_relevant_sbhl_directions(sbhl_module_vars.get_sbhl_module($$genls));
                                SubLObject direction2 = NIL;
                                direction2 = cdolist_list_var2.first();
                                while (NIL != cdolist_list_var2) {
                                    final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, direction2, sbhl_module_vars.get_sbhl_module($$genls));
                                    if ((NIL != mt_links2) && direction2.eql(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module($$genls)))) {
                                        SubLObject iteration_state2;
                                        for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                            thread.resetMultipleValues();
                                            final SubLObject mt_var_$150 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                            final SubLObject tv_links2 = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            SubLObject iteration_state_$151;
                                            for (iteration_state_$151 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$151); iteration_state_$151 = dictionary_contents.do_dictionary_contents_next(iteration_state_$151)) {
                                                thread.resetMultipleValues();
                                                final SubLObject tv_var2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$151);
                                                final SubLObject link_nodes_var2 = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                if (NIL != sbhl_search_vars.sbhl_true_tv_p(tv_var2)) {
                                                    final SubLObject sol2 = link_nodes_var2;
                                                    if (NIL != set.set_p(sol2)) {
                                                        final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                        SubLObject basis_object2;
                                                        SubLObject state2;
                                                        SubLObject unquoted_genl;
                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                            unquoted_genl = set_contents.do_set_contents_next(basis_object2, state2);
                                                            if (((NIL != set_contents.do_set_contents_element_validP(state2, unquoted_genl)) && (NIL != mt_relevance_macros.relevant_mtP(mt_var_$150))) && (NIL == set.set_memberP(unquoted_genl, visited_genls))) {
                                                                queues.enqueue(unquoted_genl, unvisited_genls);
                                                            }
                                                        }
                                                    } else
                                                        if (sol2.isList()) {
                                                            SubLObject csome_list_var2 = sol2;
                                                            SubLObject unquoted_genl2 = NIL;
                                                            unquoted_genl2 = csome_list_var2.first();
                                                            while (NIL != csome_list_var2) {
                                                                if ((NIL != mt_relevance_macros.relevant_mtP(mt_var_$150)) && (NIL == set.set_memberP(unquoted_genl2, visited_genls))) {
                                                                    queues.enqueue(unquoted_genl2, unvisited_genls);
                                                                }
                                                                csome_list_var2 = csome_list_var2.rest();
                                                                unquoted_genl2 = csome_list_var2.first();
                                                            } 
                                                        } else {
                                                            Errors.error($str114$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                        }

                                                }
                                            }
                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state_$151);
                                        }
                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                    }
                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                    direction2 = cdolist_list_var2.first();
                                } 
                            }
                        } finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$149, thread);
                        }
                        SubLObject quoted_genl3 = NIL;
                        final SubLObject pred_var = $$genls_GenlDenotesSpecInstances;
                        if (NIL == kb_mapping_macros.do_gaf_arg_index_key_validator(unquoted_col, ONE_INTEGER, pred_var)) {
                            continue;
                        }
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(unquoted_col, ONE_INTEGER, pred_var);
                        SubLObject done_var = NIL;
                        final SubLObject token_var = NIL;
                        while (NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = makeBoolean(!token_var.eql(final_index_spec));
                            if (NIL != valid) {
                                SubLObject final_index_iterator = NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, $TRUE, NIL);
                                    SubLObject done_var_$158 = NIL;
                                    final SubLObject token_var_$159 = NIL;
                                    while (NIL == done_var_$158) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$159);
                                        final SubLObject valid_$160 = makeBoolean(!token_var_$159.eql(assertion));
                                        if (NIL != valid_$160) {
                                            quoted_genl3 = assertions_high.gaf_arg(assertion, TWO_INTEGER);
                                            if (NIL == set.set_memberP(quoted_genl3, visited_quoted_genls)) {
                                                queues.enqueue(quoted_genl3, unvisited_quoted_genls);
                                            }
                                        }
                                        done_var_$158 = makeBoolean(NIL == valid_$160);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$150 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$150, thread);
                                    }
                                }
                            }
                            done_var = makeBoolean(NIL == valid);
                        } 
                    }
                } 
            } 
        } finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return successP;
    }

    /**
     * Return T iff TERM is a quoted instance of COL in MT.
     * This is an enhanced version of @xref quoted-isa-in-any-mt?
     * that supports #$genls-GenlDenotesSpecInstances.
     */
    @LispMethod(comment = "Return T iff TERM is a quoted instance of COL in MT.\r\nThis is an enhanced version of @xref quoted-isa-in-any-mt?\r\nthat supports #$genls-GenlDenotesSpecInstances.\nReturn T iff TERM is a quoted instance of COL in MT.\nThis is an enhanced version of @xref quoted-isa-in-any-mt?\nthat supports #$genls-GenlDenotesSpecInstances.")
    public static final SubLObject quoted_isa_enhanced_in_any_mtP_alt(SubLObject v_term, SubLObject col) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        result = com.cyc.cycjava.cycl.kbs_utilities.quoted_isa_enhancedP(v_term, col, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return result;
            }
        }
    }

    /**
     * Return T iff TERM is a quoted instance of COL in MT.
     * This is an enhanced version of @xref quoted-isa-in-any-mt?
     * that supports #$genls-GenlDenotesSpecInstances.
     */
    @LispMethod(comment = "Return T iff TERM is a quoted instance of COL in MT.\r\nThis is an enhanced version of @xref quoted-isa-in-any-mt?\r\nthat supports #$genls-GenlDenotesSpecInstances.\nReturn T iff TERM is a quoted instance of COL in MT.\nThis is an enhanced version of @xref quoted-isa-in-any-mt?\nthat supports #$genls-GenlDenotesSpecInstances.")
    public static SubLObject quoted_isa_enhanced_in_any_mtP(final SubLObject v_term, final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            result = quoted_isa_enhancedP(v_term, col, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }/**
     * Return T iff TERM is a quoted instance of COL in MT.
     * This is an enhanced version of @xref quoted-isa-in-any-mt?
     * that supports #$genls-GenlDenotesSpecInstances.
     */


    /**
     * Iterate over all quoted instances of COL in MT.
     * This is an enhanced version of @xref do-all-quoted-instances
     * that supports #$genls-GenlDenotesSpecInstances.
     */
    @LispMethod(comment = "Iterate over all quoted instances of COL in MT.\r\nThis is an enhanced version of @xref do-all-quoted-instances\r\nthat supports #$genls-GenlDenotesSpecInstances.\nIterate over all quoted instances of COL in MT.\nThis is an enhanced version of @xref do-all-quoted-instances\nthat supports #$genls-GenlDenotesSpecInstances.")
    public static final SubLObject do_all_quoted_instances_enhanced_alt(SubLObject macroform, SubLObject environment) {
        {
            SubLObject datum = macroform.rest();
            SubLObject current = datum;
            destructuring_bind_must_consp(current, datum, $list_alt112);
            {
                SubLObject temp = current.rest();
                current = current.first();
                {
                    SubLObject instance_var = NIL;
                    SubLObject v_term = NIL;
                    destructuring_bind_must_consp(current, datum, $list_alt112);
                    instance_var = current.first();
                    current = current.rest();
                    destructuring_bind_must_consp(current, datum, $list_alt112);
                    v_term = current.first();
                    current = current.rest();
                    {
                        SubLObject allow_other_keys_p = NIL;
                        SubLObject rest = current;
                        SubLObject bad = NIL;
                        SubLObject current_170 = NIL;
                        for (; NIL != rest;) {
                            destructuring_bind_must_consp(rest, datum, $list_alt112);
                            current_170 = rest.first();
                            rest = rest.rest();
                            destructuring_bind_must_consp(rest, datum, $list_alt112);
                            if (NIL == member(current_170, $list_alt113, UNPROVIDED, UNPROVIDED)) {
                                bad = T;
                            }
                            if (current_170 == $ALLOW_OTHER_KEYS) {
                                allow_other_keys_p = rest.first();
                            }
                            rest = rest.rest();
                        }
                        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
                            cdestructuring_bind_error(datum, $list_alt112);
                        }
                        {
                            SubLObject mt_tail = property_list_member($MT, current);
                            SubLObject mt = (NIL != mt_tail) ? ((SubLObject) (cadr(mt_tail))) : NIL;
                            SubLObject done_tail = property_list_member($DONE, current);
                            SubLObject done = (NIL != done_tail) ? ((SubLObject) (cadr(done_tail))) : NIL;
                            current = temp;
                            {
                                SubLObject body = current;
                                return listS(DO_LIST, list(instance_var, list(ALL_QUOTED_INSTANCES_ENHANCED, v_term, mt), $DONE, done), append(body, NIL));
                            }
                        }
                    }
                }
            }
        }
    }

    /**
     * Iterate over all quoted instances of COL in MT.
     * This is an enhanced version of @xref do-all-quoted-instances
     * that supports #$genls-GenlDenotesSpecInstances.
     */
    @LispMethod(comment = "Iterate over all quoted instances of COL in MT.\r\nThis is an enhanced version of @xref do-all-quoted-instances\r\nthat supports #$genls-GenlDenotesSpecInstances.\nIterate over all quoted instances of COL in MT.\nThis is an enhanced version of @xref do-all-quoted-instances\nthat supports #$genls-GenlDenotesSpecInstances.")
    public static SubLObject do_all_quoted_instances_enhanced(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        destructuring_bind_must_consp(current, datum, $list161);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject instance_var = NIL;
        SubLObject v_term = NIL;
        destructuring_bind_must_consp(current, datum, $list161);
        instance_var = current.first();
        current = current.rest();
        destructuring_bind_must_consp(current, datum, $list161);
        v_term = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = NIL;
        SubLObject rest = current;
        SubLObject bad = NIL;
        SubLObject current_$162 = NIL;
        while (NIL != rest) {
            destructuring_bind_must_consp(rest, datum, $list161);
            current_$162 = rest.first();
            rest = rest.rest();
            destructuring_bind_must_consp(rest, datum, $list161);
            if (NIL == member(current_$162, $list162, UNPROVIDED, UNPROVIDED)) {
                bad = T;
            }
            if (current_$162 == $ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        } 
        if ((NIL != bad) && (NIL == allow_other_keys_p)) {
            cdestructuring_bind_error(datum, $list161);
        }
        final SubLObject mt_tail = property_list_member($MT, current);
        final SubLObject mt = (NIL != mt_tail) ? cadr(mt_tail) : NIL;
        final SubLObject done_tail = property_list_member($DONE, current);
        final SubLObject done = (NIL != done_tail) ? cadr(done_tail) : NIL;
        final SubLObject body;
        current = body = temp;
        return listS(DO_LIST, list(instance_var, list(ALL_QUOTED_INSTANCES_ENHANCED, v_term, mt), $DONE, done), append(body, NIL));
    }/**
     * Iterate over all quoted instances of COL in MT.
     * This is an enhanced version of @xref do-all-quoted-instances
     * that supports #$genls-GenlDenotesSpecInstances.
     */


    public static SubLObject set_kbs_definition_from_kbs_profile(final SubLObject kbs_profile) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == isa.isa_in_any_mtP(kbs_profile, $$KBSubsetProfile)) {
            Errors.error($str169$_S_is_not_a_valid___KBSubsetProfi);
        }
        final SubLObject remove_assertions = kb_mapping_utilities.pred_values_in_any_mt(kbs_profile, $$kbsProfileRemoveAssertion, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject remove_coll_extent = kb_mapping_utilities.pred_values_in_any_mt(kbs_profile, $$kbsProfileRemoveCollectionExtent, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject remove_forts = kb_mapping_utilities.pred_values_in_any_mt(kbs_profile, $$kbsProfileRemoveFORT, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject remove_predicate_extent = kb_mapping_utilities.pred_values_in_any_mt(kbs_profile, $$kbsProfileRemovePredicateExtent, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject retain_assertion = kb_mapping_utilities.pred_values_in_any_mt(kbs_profile, $$kbsProfileRetainAssertion, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        final SubLObject retain_term = kb_mapping_utilities.pred_values_in_any_mt(kbs_profile, $$kbsProfileRetainTerm, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        $kbs_definition$.setDynamicValue(list($NAME, kb_paths.fort_name(kbs_profile), $INHERITED_STORES, $list176, $SECTIONS, list(list(new SubLObject[]{ $COLLECTIONS, $list177, $OMISSION_ASSERTIONS, remove_assertions, $OMISSION_COLLECTIONS, remove_coll_extent, $OMISSION_TERMS, remove_forts, $OMISSION_PREDICATE_EXTENT, remove_predicate_extent, $RETAINED_ASSERTIONS, retain_assertion, $RETAINED_TERMS, retain_term }))), thread);
        return $kbs_definition$.getDynamicValue(thread);
    }

    public static final SubLObject set_kbs_definition_alt(SubLObject definition_string) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == definition_string) {
                $kbs_definition$.setDynamicValue(NIL, thread);
            } else {
                if (NIL != Strings.stringE(definition_string, $$$tiny, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                    $kbs_definition$.setDynamicValue($list_alt120, thread);
                } else {
                    if (NIL != Strings.stringE(definition_string, $str_alt121$tiny_owl, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                        $kbs_definition$.setDynamicValue($list_alt122, thread);
                    } else {
                        if (NIL != Strings.stringE(definition_string, $$$research, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                            $kbs_definition$.setDynamicValue($list_alt124, thread);
                        } else {
                            if (NIL != Strings.stringE(definition_string, $$$ccf, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                $kbs_definition$.setDynamicValue($list_alt126, thread);
                            } else {
                                if (NIL != Strings.stringE(definition_string, $$$cyfi, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                    $kbs_definition$.setDynamicValue($list_alt128, thread);
                                } else {
                                    if (NIL != Strings.stringE(definition_string, $str_alt129$research_restricted, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                        $kbs_definition$.setDynamicValue($list_alt130, thread);
                                    } else {
                                        if (NIL != Strings.stringE(definition_string, $$$akb, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                            $kbs_definition$.setDynamicValue($list_alt132, thread);
                                        } else {
                                            if (NIL != Strings.stringE(definition_string, $$$coretkb, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                                $kbs_definition$.setDynamicValue($list_alt134, thread);
                                            } else {
                                                if (NIL != Strings.stringE(definition_string, $str_alt135$coretkb_nonprop, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                                    $kbs_definition$.setDynamicValue($list_alt136, thread);
                                                } else {
                                                    if (NIL != Strings.stringE(definition_string, $str_alt137$opencyc_without_nonprop, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                                        $kbs_definition$.setDynamicValue($list_alt138, thread);
                                                    } else {
                                                        if (NIL != Strings.stringE(definition_string, $$$opencyc, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                                            $kbs_definition$.setDynamicValue($list_alt139, thread);
                                                        } else {
                                                            if (NIL != Strings.stringE(definition_string, $$$nonprop, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                                                $kbs_definition$.setDynamicValue($list_alt141, thread);
                                                            } else {
                                                                if (NIL != Strings.stringE(definition_string, $$$mysentient, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                                                    $kbs_definition$.setDynamicValue($list_alt143, thread);
                                                                } else {
                                                                    if (NIL != Strings.stringE(definition_string, $$$tkb, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                                                        $kbs_definition$.setDynamicValue($list_alt145, thread);
                                                                    } else {
                                                                        if (NIL != Strings.stringE(definition_string, $$$ikb, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                                                            $kbs_definition$.setDynamicValue($list_alt147, thread);
                                                                        } else {
                                                                            if (NIL != Strings.stringE(definition_string, $$$public, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                                                                $kbs_definition$.setDynamicValue($list_alt149, thread);
                                                                            } else {
                                                                                if (NIL != Strings.stringE(definition_string, $$$halo, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                                                                    $kbs_definition$.setDynamicValue($list_alt151, thread);
                                                                                } else {
                                                                                    if (NIL != Strings.stringE(definition_string, $$$cycsecure, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED)) {
                                                                                        $kbs_definition$.setDynamicValue($list_alt153, thread);
                                                                                    } else {
                                                                                        Errors.warn($str_alt154$KB_subset__S_not_defined_, definition_string);
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
            return $kbs_definition$.getDynamicValue(thread);
        }
    }

    public static SubLObject set_kbs_definition(final SubLObject definition_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        Errors.error($str178$KB_subsets_are_not_supported_on_t);
        return $kbs_definition$.getDynamicValue(thread);
    }

    /**
     *
     *
     * @unknown This method has OpenCYC in the name for the simple reason that
    under most other KB subsets, one would presumably never want to do this.
     */
    @LispMethod(comment = "@unknown This method has OpenCYC in the name for the simple reason that\r\nunder most other KB subsets, one would presumably never want to do this.")
    public static final SubLObject kbs_all_opencyc_formulas_to_file_alt(SubLObject filename) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
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
                        Errors.error($str_alt156$Unable_to_open__S, filename);
                    }
                    {
                        SubLObject s = stream;
                        com.cyc.cycjava.cycl.kbs_utilities.kbs_all_opencyc_formulas_to_stream(s);
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
            return filename;
        }
    }

    /**
     *
     *
     * @unknown This method has OpenCYC in the name for the simple reason that
    under most other KB subsets, one would presumably never want to do this.
     */
    @LispMethod(comment = "@unknown This method has OpenCYC in the name for the simple reason that\r\nunder most other KB subsets, one would presumably never want to do this.")
    public static SubLObject kbs_all_opencyc_formulas_to_file(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(filename, $OUTPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str180$Unable_to_open__S, filename);
            }
            final SubLObject s = stream;
            kbs_all_opencyc_formulas_to_stream(s);
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
        return filename;
    }

    /**
     * Write a copyright notice plus all openCYC formulas to the stream.
     * The formulas are written in a pretty-printed, Cyc-readable fashion
     * and include ELMT and sentence information. The order is the one of
     * the assertion IDs, which reflects in 2008 to a large extent the
     * historical order of the assertions (minus edit operations).
     *
     * @param the
     * 		stream to which to output
     * @return the stream
     */
    @LispMethod(comment = "Write a copyright notice plus all openCYC formulas to the stream.\r\nThe formulas are written in a pretty-printed, Cyc-readable fashion\r\nand include ELMT and sentence information. The order is the one of\r\nthe assertion IDs, which reflects in 2008 to a large extent the\r\nhistorical order of the assertions (minus edit operations).\r\n\r\n@param the\r\n\t\tstream to which to output\r\n@return the stream\nWrite a copyright notice plus all openCYC formulas to the stream.\nThe formulas are written in a pretty-printed, Cyc-readable fashion\nand include ELMT and sentence information. The order is the one of\nthe assertion IDs, which reflects in 2008 to a large extent the\nhistorical order of the assertions (minus edit operations).")
    public static final SubLObject kbs_all_opencyc_formulas_to_stream_alt(SubLObject stream) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            write_string(misc_utilities.kb_content_copyright_notice(), stream, UNPROVIDED, UNPROVIDED);
            terpri(stream);
            {
                SubLObject idx = assertion_handles.do_assertions_table();
                SubLObject total = id_index_count(idx);
                SubLObject sofar = ZERO_INTEGER;
                SubLTrampolineFile.checkType($str_alt157$Gathering_up_all_assertion_EL_for, STRINGP);
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
                        noting_percent_progress_preamble($str_alt157$Gathering_up_all_assertion_EL_for);
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
                                        {
                                            SubLObject sentence = uncanonicalizer.assertion_el_ist_formula(ass);
                                            format_cycl_expression.format_cycl_expression(sentence, stream, UNPROVIDED);
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
            return stream;
        }
    }

    /**
     * Write a copyright notice plus all openCYC formulas to the stream.
     * The formulas are written in a pretty-printed, Cyc-readable fashion
     * and include ELMT and sentence information. The order is the one of
     * the assertion IDs, which reflects in 2008 to a large extent the
     * historical order of the assertions (minus edit operations).
     *
     * @param the
     * 		stream to which to output
     * @return the stream
     */
    @LispMethod(comment = "Write a copyright notice plus all openCYC formulas to the stream.\r\nThe formulas are written in a pretty-printed, Cyc-readable fashion\r\nand include ELMT and sentence information. The order is the one of\r\nthe assertion IDs, which reflects in 2008 to a large extent the\r\nhistorical order of the assertions (minus edit operations).\r\n\r\n@param the\r\n\t\tstream to which to output\r\n@return the stream\nWrite a copyright notice plus all openCYC formulas to the stream.\nThe formulas are written in a pretty-printed, Cyc-readable fashion\nand include ELMT and sentence information. The order is the one of\nthe assertion IDs, which reflects in 2008 to a large extent the\nhistorical order of the assertions (minus edit operations).")
    public static SubLObject kbs_all_opencyc_formulas_to_stream(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        write_string(misc_utilities.kb_content_copyright_notice(), stream, UNPROVIDED, UNPROVIDED);
        terpri(stream);
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = $str181$Gathering_up_all_assertion_EL_for;
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
                final SubLObject idx_$163 = idx;
                if (NIL == id_index_objects_empty_p(idx_$163, $SKIP)) {
                    final SubLObject idx_$164 = idx_$163;
                    if (NIL == id_index_dense_objects_empty_p(idx_$164, $SKIP)) {
                        final SubLObject vector_var = id_index_dense_objects(idx_$164);
                        final SubLObject backwardP_var = NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject a_id;
                        SubLObject a_handle;
                        SubLObject ass;
                        SubLObject sentence;
                        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                            a_id = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
                            a_handle = aref(vector_var, a_id);
                            if ((NIL == id_index_tombstone_p(a_handle)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                                if (NIL != id_index_tombstone_p(a_handle)) {
                                    a_handle = $SKIP;
                                }
                                ass = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                sentence = uncanonicalizer.assertion_el_ist_formula(ass);
                                format_cycl_expression.format_cycl_expression(sentence, stream, UNPROVIDED);
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$165 = idx_$163;
                    if ((NIL == id_index_sparse_objects_empty_p(idx_$165)) || (NIL == id_index_skip_tombstones_p($SKIP))) {
                        final SubLObject sparse = id_index_sparse_objects(idx_$165);
                        SubLObject a_id2 = id_index_sparse_id_threshold(idx_$165);
                        final SubLObject end_id = id_index_next_id(idx_$165);
                        final SubLObject v_default = (NIL != id_index_skip_tombstones_p($SKIP)) ? NIL : $SKIP;
                        while (a_id2.numL(end_id)) {
                            final SubLObject a_handle2 = gethash_without_values(a_id2, sparse, v_default);
                            if ((NIL == id_index_skip_tombstones_p($SKIP)) || (NIL == id_index_tombstone_p(a_handle2))) {
                                final SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                final SubLObject sentence2 = uncanonicalizer.assertion_el_ist_formula(ass2);
                                format_cycl_expression.format_cycl_expression(sentence2, stream, UNPROVIDED);
                                sofar = add(sofar, ONE_INTEGER);
                                note_percent_progress(sofar, total);
                            }
                            a_id2 = add(a_id2, ONE_INTEGER);
                        } 
                    }
                }
            } finally {
                final SubLObject _prev_bind_0_$166 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values = getValuesAsVector();
                    noting_percent_progress_postamble();
                    restoreValuesFromVector(_values);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$166, thread);
                }
            }
        } finally {
            $percent_progress_start_time$.rebind(_prev_bind_4, thread);
            $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            $last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return stream;
    }/**
     * Write a copyright notice plus all openCYC formulas to the stream.
     * The formulas are written in a pretty-printed, Cyc-readable fashion
     * and include ELMT and sentence information. The order is the one of
     * the assertion IDs, which reflects in 2008 to a large extent the
     * historical order of the assertions (minus edit operations).
     *
     * @param the
     * 		stream to which to output
     * @return the stream
     */


    public static final SubLObject declare_kbs_utilities_file_alt() {
        declareFunction("make_kbs_partition", "MAKE-KBS-PARTITION", 2, 1, false);
        declareFunction("construct_kbs_partition", "CONSTRUCT-KBS-PARTITION", 0, 1, false);
        declareFunction("write_out_kbs_partition", "WRITE-OUT-KBS-PARTITION", 2, 1, false);
        declareFunction("load_partition_into_empty_kb", "LOAD-PARTITION-INTO-EMPTY-KB", 2, 0, false);
        declareFunction("kbs_image_cleanup", "KBS-IMAGE-CLEANUP", 0, 0, false);
        declareFunction("sbhl_caching_init", "SBHL-CACHING-INIT", 0, 0, false);
        declareFunction("kbs_definition_validP", "KBS-DEFINITION-VALID?", 0, 0, false);
        declareFunction("get_kbs_name", "GET-KBS-NAME", 0, 0, false);
        declareFunction("get_kbs_sections", "GET-KBS-SECTIONS", 0, 0, false);
        declareFunction("get_kbs_prerun_fns", "GET-KBS-PRERUN-FNS", 0, 0, false);
        declareFunction("get_kbs_preremoved_assertions", "GET-KBS-PREREMOVED-ASSERTIONS", 0, 0, false);
        declareFunction("get_kbs_post_identify_forts_fns", "GET-KBS-POST-IDENTIFY-FORTS-FNS", 0, 0, false);
        declareFunction("get_kbs_post_identify_assertions_fns", "GET-KBS-POST-IDENTIFY-ASSERTIONS-FNS", 0, 0, false);
        declareFunction("get_kbs_inherited_stores", "GET-KBS-INHERITED-STORES", 0, 0, false);
        declareFunction("kbs_section_definition_validP", "KBS-SECTION-DEFINITION-VALID?", 1, 0, false);
        declareMacro("do_kbs_definitional_sections", "DO-KBS-DEFINITIONAL-SECTIONS");
        declareFunction("get_kbs_section_collections", "GET-KBS-SECTION-COLLECTIONS", 1, 0, false);
        declareFunction("get_kbs_section_omission_collections", "GET-KBS-SECTION-OMISSION-COLLECTIONS", 1, 0, false);
        declareFunction("get_kbs_section_omission_predicate", "GET-KBS-SECTION-OMISSION-PREDICATE", 1, 0, false);
        declareFunction("get_kbs_section_definitional_predicate_set", "GET-KBS-SECTION-DEFINITIONAL-PREDICATE-SET", 1, 0, false);
        declareFunction("get_kbs_section_definitional_rule_predicate", "GET-KBS-SECTION-DEFINITIONAL-RULE-PREDICATE", 1, 0, false);
        declareFunction("save_inherited_stores", "SAVE-INHERITED-STORES", 2, 0, false);
        declareFunction("load_inherited_stores", "LOAD-INHERITED-STORES", 2, 0, false);
        declareFunction("unmark_forts_without_assertions", "UNMARK-FORTS-WITHOUT-ASSERTIONS", 0, 0, false);
        declareFunction("opencyc_kbs_forts_assert_pretty_strings", "OPENCYC-KBS-FORTS-ASSERT-PRETTY-STRINGS", 0, 0, false);
        declareFunction("opencyc_kbs_remove_excluded_synonymous_external_concept_assertions", "OPENCYC-KBS-REMOVE-EXCLUDED-SYNONYMOUS-EXTERNAL-CONCEPT-ASSERTIONS", 0, 0, false);
        declareFunction("opencyc_kbs_possibly_remove_excluded_synonymous_external_concept_assertion", "OPENCYC-KBS-POSSIBLY-REMOVE-EXCLUDED-SYNONYMOUS-EXTERNAL-CONCEPT-ASSERTION", 2, 0, false);
        declareFunction("prepare_assertion_gloss_generation", "PREPARE-ASSERTION-GLOSS-GENERATION", 0, 3, false);
        declareFunction("researchcyc_kbs_remove_unwanted_tkb_narts", "RESEARCHCYC-KBS-REMOVE-UNWANTED-TKB-NARTS", 0, 0, false);
        declareFunction("researchcyc_kbs_unwanted_tkb_termP", "RESEARCHCYC-KBS-UNWANTED-TKB-TERM?", 1, 0, false);
        declareFunction("researchcyc_candidate_term", "RESEARCHCYC-CANDIDATE-TERM", 1, 0, false);
        declareFunction("tkb_kbs_unmark_certain_assertions", "TKB-KBS-UNMARK-CERTAIN-ASSERTIONS", 0, 0, false);
        declareFunction("tkb_kbs_save_terms_without_isas", "TKB-KBS-SAVE-TERMS-WITHOUT-ISAS", 0, 0, false);
        declareFunction("tkb_special_excluded_assertionP_internal", "TKB-SPECIAL-EXCLUDED-ASSERTION?-INTERNAL", 1, 0, false);
        declareFunction("tkb_special_excluded_assertionP", "TKB-SPECIAL-EXCLUDED-ASSERTION?", 1, 0, false);
        declareFunction("tkb_special_excluded_termP", "TKB-SPECIAL-EXCLUDED-TERM?", 1, 0, false);
        declareFunction("all_quoted_instances_enhanced", "ALL-QUOTED-INSTANCES-ENHANCED", 1, 1, false);
        declareFunction("quoted_isa_enhancedP", "QUOTED-ISA-ENHANCED?", 2, 1, false);
        declareFunction("quoted_isa_enhanced_in_any_mtP", "QUOTED-ISA-ENHANCED-IN-ANY-MT?", 2, 0, false);
        declareMacro("do_all_quoted_instances_enhanced", "DO-ALL-QUOTED-INSTANCES-ENHANCED");
        declareFunction("set_kbs_definition", "SET-KBS-DEFINITION", 1, 0, false);
        declareFunction("kbs_all_opencyc_formulas_to_file", "KBS-ALL-OPENCYC-FORMULAS-TO-FILE", 1, 0, false);
        declareFunction("kbs_all_opencyc_formulas_to_stream", "KBS-ALL-OPENCYC-FORMULAS-TO-STREAM", 1, 0, false);
        return NIL;
    }

    public static SubLObject declare_kbs_utilities_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("make_kbs_partition", "MAKE-KBS-PARTITION", 2, 1, false);
            declareFunction("prepare_kb_for_kbs_partition", "PREPARE-KB-FOR-KBS-PARTITION", 1, 1, false);
            declareFunction("complete_kbs_partition", "COMPLETE-KBS-PARTITION", 2, 1, false);
            declareFunction("prepare_for_kbs_partition", "PREPARE-FOR-KBS-PARTITION", 0, 1, false);
            declareFunction("construct_kbs_partition", "CONSTRUCT-KBS-PARTITION", 0, 0, false);
            declareFunction("write_out_kbs_partition", "WRITE-OUT-KBS-PARTITION", 2, 1, false);
            declareFunction("load_partition_into_empty_kb", "LOAD-PARTITION-INTO-EMPTY-KB", 2, 0, false);
            declareFunction("kbs_image_cleanup", "KBS-IMAGE-CLEANUP", 0, 0, false);
            declareFunction("sbhl_caching_init", "SBHL-CACHING-INIT", 0, 0, false);
            declareFunction("kbs_definition_validP", "KBS-DEFINITION-VALID?", 0, 0, false);
            declareFunction("get_kbs_name", "GET-KBS-NAME", 0, 0, false);
            declareFunction("get_kbs_sections", "GET-KBS-SECTIONS", 0, 0, false);
            declareFunction("get_kbs_prerun_fns", "GET-KBS-PRERUN-FNS", 0, 0, false);
            declareFunction("get_kbs_preremoved_assertions", "GET-KBS-PREREMOVED-ASSERTIONS", 0, 0, false);
            declareFunction("get_kbs_post_identify_forts_fns", "GET-KBS-POST-IDENTIFY-FORTS-FNS", 0, 0, false);
            declareFunction("get_kbs_post_identify_assertions_fns", "GET-KBS-POST-IDENTIFY-ASSERTIONS-FNS", 0, 0, false);
            declareFunction("get_kbs_inherited_stores", "GET-KBS-INHERITED-STORES", 0, 0, false);
            declareFunction("kbs_section_definition_validP", "KBS-SECTION-DEFINITION-VALID?", 1, 0, false);
            declareMacro("do_kbs_definitional_sections", "DO-KBS-DEFINITIONAL-SECTIONS");
            declareFunction("get_kbs_section_collections", "GET-KBS-SECTION-COLLECTIONS", 1, 0, false);
            declareFunction("get_kbs_section_sets", "GET-KBS-SECTION-SETS", 1, 0, false);
            declareFunction("get_kbs_section_omission_collections", "GET-KBS-SECTION-OMISSION-COLLECTIONS", 1, 0, false);
            declareFunction("get_kbs_section_omission_predicate", "GET-KBS-SECTION-OMISSION-PREDICATE", 1, 0, false);
            declareFunction("get_kbs_section_definitional_predicate_set", "GET-KBS-SECTION-DEFINITIONAL-PREDICATE-SET", 1, 0, false);
            declareFunction("get_kbs_section_definitional_rule_predicate", "GET-KBS-SECTION-DEFINITIONAL-RULE-PREDICATE", 1, 0, false);
            declareFunction("get_kbs_section_kbq_query_sets", "GET-KBS-SECTION-KBQ-QUERY-SETS", 1, 0, false);
            declareFunction("get_kbs_section_omission_terms", "GET-KBS-SECTION-OMISSION-TERMS", 1, 0, false);
            declareFunction("get_kbs_section_omission_assertions", "GET-KBS-SECTION-OMISSION-ASSERTIONS", 1, 0, false);
            declareFunction("get_kbs_section_retained_terms", "GET-KBS-SECTION-RETAINED-TERMS", 1, 0, false);
            declareFunction("get_kbs_section_retained_assertions", "GET-KBS-SECTION-RETAINED-ASSERTIONS", 1, 0, false);
            declareFunction("get_kbs_section_omission_predicate_extent", "GET-KBS-SECTION-OMISSION-PREDICATE-EXTENT", 1, 0, false);
            declareFunction("save_inherited_stores", "SAVE-INHERITED-STORES", 2, 0, false);
            declareFunction("load_inherited_stores", "LOAD-INHERITED-STORES", 2, 0, false);
            declareFunction("opencyc_kbs_assert_broader_term_gafs", "OPENCYC-KBS-ASSERT-BROADER-TERM-GAFS", 0, 0, false);
            declareFunction("opencyc_kbs_contribute_to_broader_term_gafs", "OPENCYC-KBS-CONTRIBUTE-TO-BROADER-TERM-GAFS", 0, 0, false);
            declareFunction("opencyc_kbs_new_kbs_fort_iterator", "OPENCYC-KBS-NEW-KBS-FORT-ITERATOR", 0, 0, false);
            declareFunction("opencyc_kbs_new_assertion_accumulator", "OPENCYC-KBS-NEW-ASSERTION-ACCUMULATOR", 0, 2, false);
            declareFunction("opencyc_kbs_new_accumulated_assertions_iterator", "OPENCYC-KBS-NEW-ACCUMULATED-ASSERTIONS-ITERATOR", 1, 2, false);
            declareFunction("opencyc_kbs_new_accumulated_broader_term_assertion_iterator", "OPENCYC-KBS-NEW-ACCUMULATED-BROADER-TERM-ASSERTION-ITERATOR", 1, 0, false);
            declareFunction("opencyc_kbs_new_broader_term_assertion_accumulator", "OPENCYC-KBS-NEW-BROADER-TERM-ASSERTION-ACCUMULATOR", 0, 0, false);
            declareFunction("opencyc_kbs_possibly_prepare_broader_term_queue", "OPENCYC-KBS-POSSIBLY-PREPARE-BROADER-TERM-QUEUE", 0, 0, false);
            declareFunction("opencyc_kbs_prepare_broader_term_queue", "OPENCYC-KBS-PREPARE-BROADER-TERM-QUEUE", 0, 0, false);
            declareFunction("kbs_extract_broader_term_gaf_specifics", "KBS-EXTRACT-BROADER-TERM-GAF-SPECIFICS", 1, 0, false);
            declareFunction("kbs_reconstitute_broader_term_gaf_specifics", "KBS-RECONSTITUTE-BROADER-TERM-GAF-SPECIFICS", 1, 0, false);
            declareFunction("unmark_forts_without_assertions", "UNMARK-FORTS-WITHOUT-ASSERTIONS", 0, 0, false);
            declareFunction("valid_opencyc_kbs_prettystrings_sqs_setupP", "VALID-OPENCYC-KBS-PRETTYSTRINGS-SQS-SETUP?", 0, 0, false);
            declareFunction("opencyc_kbs_forts_assert_pretty_strings", "OPENCYC-KBS-FORTS-ASSERT-PRETTY-STRINGS", 0, 0, false);
            declareFunction("opencyc_kbs_forts_contribute_pretty_strings", "OPENCYC-KBS-FORTS-CONTRIBUTE-PRETTY-STRINGS", 0, 0, false);
            declareFunction("opencyc_kbs_populate_prettystring_term_queue", "OPENCYC-KBS-POPULATE-PRETTYSTRING-TERM-QUEUE", 1, 0, false);
            declareFunction("opencyc_kbs_simplify_pretty_string_ist", "OPENCYC-KBS-SIMPLIFY-PRETTY-STRING-IST", 1, 0, false);
            declareFunction("opencyc_kbs_reconstitute_pretty_string_ist", "OPENCYC-KBS-RECONSTITUTE-PRETTY-STRING-IST", 1, 0, false);
            declareFunction("opencyc_kbs_forts_work_on_pretty_strings", "OPENCYC-KBS-FORTS-WORK-ON-PRETTY-STRINGS", 2, 0, false);
            declareFunction("new_kbs_pretty_string_fort_iterator", "NEW-KBS-PRETTY-STRING-FORT-ITERATOR", 0, 0, false);
            declareFunction("kbs_pretty_string_fortP", "KBS-PRETTY-STRING-FORT?", 1, 0, false);
            declareFunction("new_pretty_string_assert_sentence_accumulator", "NEW-PRETTY-STRING-ASSERT-SENTENCE-ACCUMULATOR", 0, 0, false);
            declareFunction("pretty_string_assert_sentence_accumulator_reset", "PRETTY-STRING-ASSERT-SENTENCE-ACCUMULATOR-RESET", 1, 0, false);
            declareFunction("pretty_string_assert_sentence_accumulator_add", "PRETTY-STRING-ASSERT-SENTENCE-ACCUMULATOR-ADD", 2, 0, false);
            declareFunction("pretty_string_assert_sentence_accumulator_size", "PRETTY-STRING-ASSERT-SENTENCE-ACCUMULATOR-SIZE", 1, 0, false);
            declareFunction("pretty_string_assert_sentence_accumulator_contents", "PRETTY-STRING-ASSERT-SENTENCE-ACCUMULATOR-CONTENTS", 1, 1, false);
            declareFunction("pretty_string_assert_sentence_accumulator_iterator", "PRETTY-STRING-ASSERT-SENTENCE-ACCUMULATOR-ITERATOR", 1, 0, false);
            declareFunction("opencyc_kbs_remove_excluded_synonymous_external_concept_assertions", "OPENCYC-KBS-REMOVE-EXCLUDED-SYNONYMOUS-EXTERNAL-CONCEPT-ASSERTIONS", 0, 0, false);
            declareFunction("opencyc_kbs_possibly_remove_excluded_synonymous_external_concept_assertion", "OPENCYC-KBS-POSSIBLY-REMOVE-EXCLUDED-SYNONYMOUS-EXTERNAL-CONCEPT-ASSERTION", 2, 0, false);
            declareFunction("opencyc_kbs_prepare_caches", "OPENCYC-KBS-PREPARE-CACHES", 0, 0, false);
            declareFunction("researchcyc_kill_expensive_true_rule_templates", "RESEARCHCYC-KILL-EXPENSIVE-TRUE-RULE-TEMPLATES", 0, 0, false);
            declareFunction("researchcyc_kbs_remove_unwanted_tkb_narts", "RESEARCHCYC-KBS-REMOVE-UNWANTED-TKB-NARTS", 0, 0, false);
            declareFunction("researchcyc_kbs_unwanted_tkb_termP", "RESEARCHCYC-KBS-UNWANTED-TKB-TERM?", 1, 0, false);
            declareFunction("researchcyc_candidate_term", "RESEARCHCYC-CANDIDATE-TERM", 1, 0, false);
            declareFunction("tkb_kbs_unmark_certain_assertions", "TKB-KBS-UNMARK-CERTAIN-ASSERTIONS", 0, 0, false);
            declareFunction("tkb_kbs_save_terms_without_isas", "TKB-KBS-SAVE-TERMS-WITHOUT-ISAS", 0, 0, false);
            declareFunction("tkb_special_excluded_assertionP_internal", "TKB-SPECIAL-EXCLUDED-ASSERTION?-INTERNAL", 1, 0, false);
            declareFunction("tkb_special_excluded_assertionP", "TKB-SPECIAL-EXCLUDED-ASSERTION?", 1, 0, false);
            declareFunction("tkb_special_excluded_termP", "TKB-SPECIAL-EXCLUDED-TERM?", 1, 0, false);
            declareFunction("all_quoted_instances_enhanced", "ALL-QUOTED-INSTANCES-ENHANCED", 1, 1, false);
            declareFunction("quoted_isa_enhancedP", "QUOTED-ISA-ENHANCED?", 2, 1, false);
            declareFunction("quoted_isa_enhanced_in_any_mtP", "QUOTED-ISA-ENHANCED-IN-ANY-MT?", 2, 0, false);
            declareMacro("do_all_quoted_instances_enhanced", "DO-ALL-QUOTED-INSTANCES-ENHANCED");
            declareFunction("set_kbs_definition_from_kbs_profile", "SET-KBS-DEFINITION-FROM-KBS-PROFILE", 1, 0, false);
            declareFunction("set_kbs_definition", "SET-KBS-DEFINITION", 1, 0, false);
            declareFunction("kbs_all_opencyc_formulas_to_file", "KBS-ALL-OPENCYC-FORMULAS-TO-FILE", 1, 0, false);
            declareFunction("kbs_all_opencyc_formulas_to_stream", "KBS-ALL-OPENCYC-FORMULAS-TO-STREAM", 1, 0, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("construct_kbs_partition", "CONSTRUCT-KBS-PARTITION", 0, 1, false);
            declareFunction("prepare_assertion_gloss_generation", "PREPARE-ASSERTION-GLOSS-GENERATION", 0, 3, false);
        }
        return NIL;
    }

    public static SubLObject declare_kbs_utilities_file_Previous() {
        declareFunction("make_kbs_partition", "MAKE-KBS-PARTITION", 2, 1, false);
        declareFunction("prepare_kb_for_kbs_partition", "PREPARE-KB-FOR-KBS-PARTITION", 1, 1, false);
        declareFunction("complete_kbs_partition", "COMPLETE-KBS-PARTITION", 2, 1, false);
        declareFunction("prepare_for_kbs_partition", "PREPARE-FOR-KBS-PARTITION", 0, 1, false);
        declareFunction("construct_kbs_partition", "CONSTRUCT-KBS-PARTITION", 0, 0, false);
        declareFunction("write_out_kbs_partition", "WRITE-OUT-KBS-PARTITION", 2, 1, false);
        declareFunction("load_partition_into_empty_kb", "LOAD-PARTITION-INTO-EMPTY-KB", 2, 0, false);
        declareFunction("kbs_image_cleanup", "KBS-IMAGE-CLEANUP", 0, 0, false);
        declareFunction("sbhl_caching_init", "SBHL-CACHING-INIT", 0, 0, false);
        declareFunction("kbs_definition_validP", "KBS-DEFINITION-VALID?", 0, 0, false);
        declareFunction("get_kbs_name", "GET-KBS-NAME", 0, 0, false);
        declareFunction("get_kbs_sections", "GET-KBS-SECTIONS", 0, 0, false);
        declareFunction("get_kbs_prerun_fns", "GET-KBS-PRERUN-FNS", 0, 0, false);
        declareFunction("get_kbs_preremoved_assertions", "GET-KBS-PREREMOVED-ASSERTIONS", 0, 0, false);
        declareFunction("get_kbs_post_identify_forts_fns", "GET-KBS-POST-IDENTIFY-FORTS-FNS", 0, 0, false);
        declareFunction("get_kbs_post_identify_assertions_fns", "GET-KBS-POST-IDENTIFY-ASSERTIONS-FNS", 0, 0, false);
        declareFunction("get_kbs_inherited_stores", "GET-KBS-INHERITED-STORES", 0, 0, false);
        declareFunction("kbs_section_definition_validP", "KBS-SECTION-DEFINITION-VALID?", 1, 0, false);
        declareMacro("do_kbs_definitional_sections", "DO-KBS-DEFINITIONAL-SECTIONS");
        declareFunction("get_kbs_section_collections", "GET-KBS-SECTION-COLLECTIONS", 1, 0, false);
        declareFunction("get_kbs_section_sets", "GET-KBS-SECTION-SETS", 1, 0, false);
        declareFunction("get_kbs_section_omission_collections", "GET-KBS-SECTION-OMISSION-COLLECTIONS", 1, 0, false);
        declareFunction("get_kbs_section_omission_predicate", "GET-KBS-SECTION-OMISSION-PREDICATE", 1, 0, false);
        declareFunction("get_kbs_section_definitional_predicate_set", "GET-KBS-SECTION-DEFINITIONAL-PREDICATE-SET", 1, 0, false);
        declareFunction("get_kbs_section_definitional_rule_predicate", "GET-KBS-SECTION-DEFINITIONAL-RULE-PREDICATE", 1, 0, false);
        declareFunction("get_kbs_section_kbq_query_sets", "GET-KBS-SECTION-KBQ-QUERY-SETS", 1, 0, false);
        declareFunction("get_kbs_section_omission_terms", "GET-KBS-SECTION-OMISSION-TERMS", 1, 0, false);
        declareFunction("get_kbs_section_omission_assertions", "GET-KBS-SECTION-OMISSION-ASSERTIONS", 1, 0, false);
        declareFunction("get_kbs_section_retained_terms", "GET-KBS-SECTION-RETAINED-TERMS", 1, 0, false);
        declareFunction("get_kbs_section_retained_assertions", "GET-KBS-SECTION-RETAINED-ASSERTIONS", 1, 0, false);
        declareFunction("get_kbs_section_omission_predicate_extent", "GET-KBS-SECTION-OMISSION-PREDICATE-EXTENT", 1, 0, false);
        declareFunction("save_inherited_stores", "SAVE-INHERITED-STORES", 2, 0, false);
        declareFunction("load_inherited_stores", "LOAD-INHERITED-STORES", 2, 0, false);
        declareFunction("opencyc_kbs_assert_broader_term_gafs", "OPENCYC-KBS-ASSERT-BROADER-TERM-GAFS", 0, 0, false);
        declareFunction("opencyc_kbs_contribute_to_broader_term_gafs", "OPENCYC-KBS-CONTRIBUTE-TO-BROADER-TERM-GAFS", 0, 0, false);
        declareFunction("opencyc_kbs_new_kbs_fort_iterator", "OPENCYC-KBS-NEW-KBS-FORT-ITERATOR", 0, 0, false);
        declareFunction("opencyc_kbs_new_assertion_accumulator", "OPENCYC-KBS-NEW-ASSERTION-ACCUMULATOR", 0, 2, false);
        declareFunction("opencyc_kbs_new_accumulated_assertions_iterator", "OPENCYC-KBS-NEW-ACCUMULATED-ASSERTIONS-ITERATOR", 1, 2, false);
        declareFunction("opencyc_kbs_new_accumulated_broader_term_assertion_iterator", "OPENCYC-KBS-NEW-ACCUMULATED-BROADER-TERM-ASSERTION-ITERATOR", 1, 0, false);
        declareFunction("opencyc_kbs_new_broader_term_assertion_accumulator", "OPENCYC-KBS-NEW-BROADER-TERM-ASSERTION-ACCUMULATOR", 0, 0, false);
        declareFunction("opencyc_kbs_possibly_prepare_broader_term_queue", "OPENCYC-KBS-POSSIBLY-PREPARE-BROADER-TERM-QUEUE", 0, 0, false);
        declareFunction("opencyc_kbs_prepare_broader_term_queue", "OPENCYC-KBS-PREPARE-BROADER-TERM-QUEUE", 0, 0, false);
        declareFunction("kbs_extract_broader_term_gaf_specifics", "KBS-EXTRACT-BROADER-TERM-GAF-SPECIFICS", 1, 0, false);
        declareFunction("kbs_reconstitute_broader_term_gaf_specifics", "KBS-RECONSTITUTE-BROADER-TERM-GAF-SPECIFICS", 1, 0, false);
        declareFunction("unmark_forts_without_assertions", "UNMARK-FORTS-WITHOUT-ASSERTIONS", 0, 0, false);
        declareFunction("valid_opencyc_kbs_prettystrings_sqs_setupP", "VALID-OPENCYC-KBS-PRETTYSTRINGS-SQS-SETUP?", 0, 0, false);
        declareFunction("opencyc_kbs_forts_assert_pretty_strings", "OPENCYC-KBS-FORTS-ASSERT-PRETTY-STRINGS", 0, 0, false);
        declareFunction("opencyc_kbs_forts_contribute_pretty_strings", "OPENCYC-KBS-FORTS-CONTRIBUTE-PRETTY-STRINGS", 0, 0, false);
        declareFunction("opencyc_kbs_populate_prettystring_term_queue", "OPENCYC-KBS-POPULATE-PRETTYSTRING-TERM-QUEUE", 1, 0, false);
        declareFunction("opencyc_kbs_simplify_pretty_string_ist", "OPENCYC-KBS-SIMPLIFY-PRETTY-STRING-IST", 1, 0, false);
        declareFunction("opencyc_kbs_reconstitute_pretty_string_ist", "OPENCYC-KBS-RECONSTITUTE-PRETTY-STRING-IST", 1, 0, false);
        declareFunction("opencyc_kbs_forts_work_on_pretty_strings", "OPENCYC-KBS-FORTS-WORK-ON-PRETTY-STRINGS", 2, 0, false);
        declareFunction("new_kbs_pretty_string_fort_iterator", "NEW-KBS-PRETTY-STRING-FORT-ITERATOR", 0, 0, false);
        declareFunction("kbs_pretty_string_fortP", "KBS-PRETTY-STRING-FORT?", 1, 0, false);
        declareFunction("new_pretty_string_assert_sentence_accumulator", "NEW-PRETTY-STRING-ASSERT-SENTENCE-ACCUMULATOR", 0, 0, false);
        declareFunction("pretty_string_assert_sentence_accumulator_reset", "PRETTY-STRING-ASSERT-SENTENCE-ACCUMULATOR-RESET", 1, 0, false);
        declareFunction("pretty_string_assert_sentence_accumulator_add", "PRETTY-STRING-ASSERT-SENTENCE-ACCUMULATOR-ADD", 2, 0, false);
        declareFunction("pretty_string_assert_sentence_accumulator_size", "PRETTY-STRING-ASSERT-SENTENCE-ACCUMULATOR-SIZE", 1, 0, false);
        declareFunction("pretty_string_assert_sentence_accumulator_contents", "PRETTY-STRING-ASSERT-SENTENCE-ACCUMULATOR-CONTENTS", 1, 1, false);
        declareFunction("pretty_string_assert_sentence_accumulator_iterator", "PRETTY-STRING-ASSERT-SENTENCE-ACCUMULATOR-ITERATOR", 1, 0, false);
        declareFunction("opencyc_kbs_remove_excluded_synonymous_external_concept_assertions", "OPENCYC-KBS-REMOVE-EXCLUDED-SYNONYMOUS-EXTERNAL-CONCEPT-ASSERTIONS", 0, 0, false);
        declareFunction("opencyc_kbs_possibly_remove_excluded_synonymous_external_concept_assertion", "OPENCYC-KBS-POSSIBLY-REMOVE-EXCLUDED-SYNONYMOUS-EXTERNAL-CONCEPT-ASSERTION", 2, 0, false);
        declareFunction("opencyc_kbs_prepare_caches", "OPENCYC-KBS-PREPARE-CACHES", 0, 0, false);
        declareFunction("researchcyc_kill_expensive_true_rule_templates", "RESEARCHCYC-KILL-EXPENSIVE-TRUE-RULE-TEMPLATES", 0, 0, false);
        declareFunction("researchcyc_kbs_remove_unwanted_tkb_narts", "RESEARCHCYC-KBS-REMOVE-UNWANTED-TKB-NARTS", 0, 0, false);
        declareFunction("researchcyc_kbs_unwanted_tkb_termP", "RESEARCHCYC-KBS-UNWANTED-TKB-TERM?", 1, 0, false);
        declareFunction("researchcyc_candidate_term", "RESEARCHCYC-CANDIDATE-TERM", 1, 0, false);
        declareFunction("tkb_kbs_unmark_certain_assertions", "TKB-KBS-UNMARK-CERTAIN-ASSERTIONS", 0, 0, false);
        declareFunction("tkb_kbs_save_terms_without_isas", "TKB-KBS-SAVE-TERMS-WITHOUT-ISAS", 0, 0, false);
        declareFunction("tkb_special_excluded_assertionP_internal", "TKB-SPECIAL-EXCLUDED-ASSERTION?-INTERNAL", 1, 0, false);
        declareFunction("tkb_special_excluded_assertionP", "TKB-SPECIAL-EXCLUDED-ASSERTION?", 1, 0, false);
        declareFunction("tkb_special_excluded_termP", "TKB-SPECIAL-EXCLUDED-TERM?", 1, 0, false);
        declareFunction("all_quoted_instances_enhanced", "ALL-QUOTED-INSTANCES-ENHANCED", 1, 1, false);
        declareFunction("quoted_isa_enhancedP", "QUOTED-ISA-ENHANCED?", 2, 1, false);
        declareFunction("quoted_isa_enhanced_in_any_mtP", "QUOTED-ISA-ENHANCED-IN-ANY-MT?", 2, 0, false);
        declareMacro("do_all_quoted_instances_enhanced", "DO-ALL-QUOTED-INSTANCES-ENHANCED");
        declareFunction("set_kbs_definition_from_kbs_profile", "SET-KBS-DEFINITION-FROM-KBS-PROFILE", 1, 0, false);
        declareFunction("set_kbs_definition", "SET-KBS-DEFINITION", 1, 0, false);
        declareFunction("kbs_all_opencyc_formulas_to_file", "KBS-ALL-OPENCYC-FORMULAS-TO-FILE", 1, 0, false);
        declareFunction("kbs_all_opencyc_formulas_to_stream", "KBS-ALL-OPENCYC-FORMULAS-TO-STREAM", 1, 0, false);
        return NIL;
    }

    public static final SubLObject init_kbs_utilities_file_alt() {
        defvar("*KBS-DEFINITION*", NIL);
        deflexical("*KBS-DEFINITION-PROPERTIES*", $list_alt6);
        defvar("*KBS-DEFINITION-SECTION-PROPERTIES*", $list_alt7);
        defparameter("*SKIP-COMPUTE-KBS-SKOLEMS?*", NIL);
        deflexical("*OPENCYC-PERMITTED-SOURCES*", $list_alt43);
        return NIL;
    }

    public static SubLObject init_kbs_utilities_file() {
        if (SubLFiles.USE_V1) {
            defparameter("*POSTPONE-KB-HL-SUPPORT-BOOTSTRAPPING?*", NIL);
            defvar("*KBS-DEFINITION*", NIL);
            deflexical("*KBS-DEFINITION-PROPERTIES*", $list5);
            defvar("*KBS-DEFINITION-SECTION-PROPERTIES*", $list6);
            deflexical("*OPENCYC-KBS-TERM-QUEUE*", NIL);
            deflexical("*OPENCYC-KBS-ASSERTION-QUEUE*", NIL);
            deflexical("*OPENCYC-KBS-PRETTYSTRING-TERM-QUEUE*", NIL);
            deflexical("*OPENCYC-KBS-PRETTYSTRING-ASSERT-QUEUE*", NIL);
            deflexical("*OPENCYC-KBS-SUPPORTED-PRETTYSTRING-PREDS*", $list59);
            deflexical("*OPENCYC-KBS-SUPPORTED-PRETTYSTRING-MTS*", $list60);
            deflexical("*OPENCYC-PERMITTED-SOURCES*", $list80);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*KBS-DEFINITION-PROPERTIES*", $list_alt6);
            defvar("*KBS-DEFINITION-SECTION-PROPERTIES*", $list_alt7);
            defparameter("*SKIP-COMPUTE-KBS-SKOLEMS?*", NIL);
            deflexical("*OPENCYC-PERMITTED-SOURCES*", $list_alt43);
        }
        return NIL;
    }

    public static SubLObject init_kbs_utilities_file_Previous() {
        defparameter("*POSTPONE-KB-HL-SUPPORT-BOOTSTRAPPING?*", NIL);
        defvar("*KBS-DEFINITION*", NIL);
        deflexical("*KBS-DEFINITION-PROPERTIES*", $list5);
        defvar("*KBS-DEFINITION-SECTION-PROPERTIES*", $list6);
        deflexical("*OPENCYC-KBS-TERM-QUEUE*", NIL);
        deflexical("*OPENCYC-KBS-ASSERTION-QUEUE*", NIL);
        deflexical("*OPENCYC-KBS-PRETTYSTRING-TERM-QUEUE*", NIL);
        deflexical("*OPENCYC-KBS-PRETTYSTRING-ASSERT-QUEUE*", NIL);
        deflexical("*OPENCYC-KBS-SUPPORTED-PRETTYSTRING-PREDS*", $list59);
        deflexical("*OPENCYC-KBS-SUPPORTED-PRETTYSTRING-MTS*", $list60);
        deflexical("*OPENCYC-PERMITTED-SOURCES*", $list80);
        return NIL;
    }

    public static final SubLObject setup_kbs_utilities_file_alt() {
        memoization_state.note_memoized_function($sym90$TKB_SPECIAL_EXCLUDED_ASSERTION_);
        return NIL;
    }

    public static SubLObject setup_kbs_utilities_file() {
        if (SubLFiles.USE_V1) {
            note_funcall_helper_function($sym68$KBS_PRETTY_STRING_FORT_);
            note_funcall_helper_function(PRETTY_STRING_ASSERT_SENTENCE_ACCUMULATOR_RESET);
            note_funcall_helper_function(PRETTY_STRING_ASSERT_SENTENCE_ACCUMULATOR_ADD);
            note_funcall_helper_function(PRETTY_STRING_ASSERT_SENTENCE_ACCUMULATOR_SIZE);
            note_funcall_helper_function(PRETTY_STRING_ASSERT_SENTENCE_ACCUMULATOR_CONTENTS);
            note_funcall_helper_function(PRETTY_STRING_ASSERT_SENTENCE_ACCUMULATOR_ITERATOR);
            memoization_state.note_memoized_function($sym140$TKB_SPECIAL_EXCLUDED_ASSERTION_);
        }
        if (SubLFiles.USE_V2) {
            memoization_state.note_memoized_function($sym90$TKB_SPECIAL_EXCLUDED_ASSERTION_);
        }
        return NIL;
    }

    public static SubLObject setup_kbs_utilities_file_Previous() {
        note_funcall_helper_function($sym68$KBS_PRETTY_STRING_FORT_);
        note_funcall_helper_function(PRETTY_STRING_ASSERT_SENTENCE_ACCUMULATOR_RESET);
        note_funcall_helper_function(PRETTY_STRING_ASSERT_SENTENCE_ACCUMULATOR_ADD);
        note_funcall_helper_function(PRETTY_STRING_ASSERT_SENTENCE_ACCUMULATOR_SIZE);
        note_funcall_helper_function(PRETTY_STRING_ASSERT_SENTENCE_ACCUMULATOR_CONTENTS);
        note_funcall_helper_function(PRETTY_STRING_ASSERT_SENTENCE_ACCUMULATOR_ITERATOR);
        memoization_state.note_memoized_function($sym140$TKB_SPECIAL_EXCLUDED_ASSERTION_);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_kbs_utilities_file();
    }

    @Override
    public void initializeVariables() {
        init_kbs_utilities_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_kbs_utilities_file();
    }

    static {
    }

    static private final SubLString $str_alt2$The_KBS_definition_is_not_valid_ = makeString("The KBS definition is not valid.");

    static private final SubLString $$$opencyc = makeString("opencyc");

    static private final SubLList $list_alt5 = list(cons($EVAL, $CODE));

    static private final SubLList $list_alt6 = list($NAME, makeKeyword("SECTIONS"), makeKeyword("PREREMOVED-ASSERTIONS"), makeKeyword("PRERUN-FNS"), makeKeyword("POST-IDENTIFY-FORTS-FNS"), makeKeyword("POST-IDENTIFY-ASSERTIONS-FNS"), makeKeyword("INHERITED-STORES"));

    static private final SubLList $list_alt7 = list(makeKeyword("COLLECTIONS"), makeKeyword("OMISSION-COLLECTIONS"), makeKeyword("OMISSION-PREDICATE"), makeKeyword("DEFINITIONAL-PREDICATE-SET"), makeKeyword("DEFINITIONAL-RULE-PREDICATE"));

    static private final SubLString $str_alt8$_kbs_definition__is_null = makeString("*kbs-definition* is null");

    static private final SubLString $str_alt9$_kbs_definition__has_section_usin = makeString("*kbs-definition* has section using invalid property ~A");

    static private final SubLString $str_alt11$_kbs_definition__is_not_a_plist_ = makeString("*kbs-definition* is not a plist.");

    static private final SubLString $str_alt18$A_section_is_using_invalid_proper = makeString("A section is using invalid property ~A");

    static private final SubLString $str_alt19$A_Section_is_not_a_plist___A = makeString("A Section is not a plist: ~A");

    static private final SubLString $str_alt20$No_sections_are_defined_ = makeString("No sections are defined.");

    static private final SubLList $list_alt21 = list(list(makeSymbol("KBS-SECTION")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt23 = list(list(makeSymbol("GET-KBS-SECTIONS")));

    static private final SubLString $str_alt32$Unknown_inherited_store__A__dont_ = makeString("Unknown inherited store ~A: dont know how to save.");

    static private final SubLString $str_alt33$Unknown_inherited_store__A_____sk = makeString("Unknown inherited store ~A ... skipping.");

    static private final SubLString $str_alt36$Unmarking_forts_with_only_include = makeString("Unmarking forts with only included #$termOfUnit assertions");

    static private final SubLString $str_alt38$unmarking__A__ = makeString("unmarking ~A~%");

    static private final SubLString $str_alt39$Unmarked__A_forts_and__A_assertio = makeString("Unmarked ~A forts and ~A assertions~%");

    static private final SubLString $str_alt40$Invalid_attempt_to_reuse_memoizat = makeString("Invalid attempt to reuse memoization state in multiple threads simultaneously.");

    static private final SubLString $str_alt41$Asserting_pretty_string_assertion = makeString("Asserting pretty string assertions for all ");

    static private final SubLString $str_alt42$_KBS_FORTs = makeString(" KBS FORTs");

    static private final SubLList $list_alt43 = list(reader_make_constant_shell("WordNet-Version2_0"), reader_make_constant_shell("FOAFOntology"), list(reader_make_constant_shell("CycExtendedSystemFn"), reader_make_constant_shell("LSCOMObjectAndSituationOntology")));

    static private final SubLString $str_alt46$Removing_non_opencyc_related___sy = makeString("Removing non-opencyc related #$synonymousExternalConcept assertions (pass ");

    static private final SubLString $str_alt47$_ = makeString(")");

    static private final SubLString $str_alt48$kb_and_kbs_kb_load = makeString("kb-and-kbs-kb.load");

    static private final SubLString $str_alt49$assertion_gloss_fht = makeString("assertion-gloss.fht");

    static private final SubLString $str_alt50$_home_jantos_space_ = makeString("/home/jantos/space/");

    static private final SubLString $str_alt51$Unmarking_instances_of___Terroris = makeString("Unmarking instances of #$TerroristAgent, #$TerroristAct, and #$HostileSocialAction~%");

    static private final SubLString $str_alt59$_A_is_not_a__A = makeString("~A is not a ~A");

    static private final SubLString $str_alt64$_A_is_not_a_valid__sbhl_type_erro = makeString("~A is not a valid *sbhl-type-error-action* value");

    static private final SubLString $str_alt65$attempting_to_bind_direction_link = makeString("attempting to bind direction link variable, to NIL. macro body not executed.");

    static private final SubLList $list_alt66 = list(makeUninternedSymbol("LINK-NODE"), makeUninternedSymbol("MT"), makeUninternedSymbol("TV"));

    static private final SubLString $str_alt67$Node__a_does_not_pass_sbhl_type_t = makeString("Node ~a does not pass sbhl-type-test ~a~%");

    static private final SubLString $str_alt81$Translation_ = makeString("Translation-");

    static private final SubLString $str_alt82$Unmarking_non_TKB_assertions = makeString("Unmarking non-TKB assertions");

    static private final SubLString $str_alt87$Saving__A_by_asserting__A__ = makeString("Saving ~A by asserting ~A~%");

    static private final SubLString $str_alt89$assertion__A_not_found = makeString("assertion ~A not found");

    static private final SubLSymbol $sym90$TKB_SPECIAL_EXCLUDED_ASSERTION_ = makeSymbol("TKB-SPECIAL-EXCLUDED-ASSERTION?");

    public static final SubLObject $const92$TKBFullySpecifiedSourceMicrotheor = reader_make_constant_shell("TKBFullySpecifiedSourceMicrotheory");

    public static final SubLSymbol $kw99$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLList $list_alt111 = list(makeSymbol("INSTANCE"), makeUninternedSymbol("MT-VAR"), makeUninternedSymbol("TV-VAR"));

    static private final SubLList $list_alt112 = list(list(makeSymbol("INSTANCE-VAR"), makeSymbol("TERM"), makeSymbol("&KEY"), makeSymbol("MT"), makeSymbol("DONE")), makeSymbol("&BODY"), makeSymbol("BODY"));

    static private final SubLList $list_alt113 = list(makeKeyword("MT"), $DONE);

    static private final SubLString $$$tiny = makeString("tiny");

    static private final SubLList $list_alt120 = list($NAME, makeString("tiny"), makeKeyword("POST-IDENTIFY-ASSERTIONS-FNS"), list(makeSymbol("UNMARK-FORTS-WITH-NO-ARG1-ASSERTIONS")), makeKeyword("SECTIONS"), list(list(makeKeyword("COLLECTIONS"), list(reader_make_constant_shell("CoreConstant")), makeKeyword("OMISSION-COLLECTIONS"), list(reader_make_constant_shell("ProprietaryTerm")), makeKeyword("DEFINITIONAL-PREDICATE-SET"), NIL)));

    static private final SubLString $str_alt121$tiny_owl = makeString("tiny-owl");

    static private final SubLList $list_alt122 = list($NAME, makeString("tiny-owl"), makeKeyword("SECTIONS"), list(list(makeKeyword("COLLECTIONS"), list(reader_make_constant_shell("CoreConstant"), reader_make_constant_shell("CoreImplementationConstant"), reader_make_constant_shell("TestOWLExportConcept"), reader_make_constant_shell("OWLExportConcept")), makeKeyword("OMISSION-COLLECTIONS"), list(reader_make_constant_shell("ProprietaryTerm")), makeKeyword("DEFINITIONAL-PREDICATE-SET"), NIL)));

    static private final SubLString $$$research = makeString("research");

    static private final SubLList $list_alt124 = list($NAME, makeString("research"), makeKeyword("POST-IDENTIFY-FORTS-FNS"), list(makeSymbol("RESEARCHCYC-KBS-REMOVE-UNWANTED-TKB-NARTS"), makeSymbol("UNMARK-FORTS-WITHOUT-ASSERTIONS")), makeKeyword("INHERITED-STORES"), list(makeKeyword("RULE-STATISTICS"), makeKeyword("CACHING-POLICIES")), makeKeyword("SECTIONS"), list(list(makeKeyword("COLLECTIONS"), list(reader_make_constant_shell("CycLConstant"), reader_make_constant_shell("Thing")), makeKeyword("OMISSION-COLLECTIONS"), list(reader_make_constant_shell("ProprietaryTerm"), reader_make_constant_shell("TerroristAgent"), reader_make_constant_shell("TerroristAct"), reader_make_constant_shell("HostileSocialAction")), makeKeyword("DEFINITIONAL-PREDICATE-SET"), NIL)));

    static private final SubLString $$$ccf = makeString("ccf");

    static private final SubLList $list_alt126 = list($NAME, makeString("ccf"), makeKeyword("POST-IDENTIFY-FORTS-FNS"), list(makeSymbol("RESEARCHCYC-KBS-REMOVE-UNWANTED-TKB-NARTS"), makeSymbol("UNMARK-FORTS-WITHOUT-ASSERTIONS")), makeKeyword("INHERITED-STORES"), list(makeKeyword("RULE-STATISTICS"), makeKeyword("CACHING-POLICIES")), makeKeyword("SECTIONS"), list(list(makeKeyword("COLLECTIONS"), list(reader_make_constant_shell("CCFTerm-Proprietary")), makeKeyword("OMISSION-COLLECTIONS"), NIL, makeKeyword("DEFINITIONAL-PREDICATE-SET"), NIL), list(makeKeyword("COLLECTIONS"), list(reader_make_constant_shell("CycLConstant"), reader_make_constant_shell("Thing")), makeKeyword("OMISSION-COLLECTIONS"), list(reader_make_constant_shell("ProprietaryTerm"), reader_make_constant_shell("TerroristAgent"), reader_make_constant_shell("TerroristAct"), reader_make_constant_shell("HostileSocialAction")), makeKeyword("DEFINITIONAL-PREDICATE-SET"), NIL)));

    static private final SubLString $$$cyfi = makeString("cyfi");

    static private final SubLList $list_alt128 = list($NAME, makeString("cyfi"), makeKeyword("POST-IDENTIFY-FORTS-FNS"), list(makeSymbol("RESEARCHCYC-KBS-REMOVE-UNWANTED-TKB-NARTS"), makeSymbol("UNMARK-FORTS-WITHOUT-ASSERTIONS")), makeKeyword("SECTIONS"), list(list(makeKeyword("COLLECTIONS"), list(reader_make_constant_shell("Cy-FiProprietaryTerm")), makeKeyword("OMISSION-COLLECTIONS"), NIL, makeKeyword("DEFINITIONAL-PREDICATE-SET"), NIL), list(makeKeyword("COLLECTIONS"), list(reader_make_constant_shell("CycLConstant"), reader_make_constant_shell("Thing")), makeKeyword("OMISSION-COLLECTIONS"), list(reader_make_constant_shell("ProprietaryTerm"), reader_make_constant_shell("TerroristAgent"), reader_make_constant_shell("TerroristAct"), reader_make_constant_shell("HostileSocialAction")), makeKeyword("DEFINITIONAL-PREDICATE-SET"), NIL)));

    static private final SubLString $str_alt129$research_restricted = makeString("research-restricted");

    static private final SubLList $list_alt130 = list($NAME, makeString("research-restricted"), makeKeyword("POST-IDENTIFY-FORTS-FNS"), list(makeSymbol("RESEARCHCYC-KBS-REMOVE-UNWANTED-TKB-NARTS"), makeSymbol("UNMARK-FORTS-WITHOUT-ASSERTIONS")), makeKeyword("SECTIONS"), list(list(makeKeyword("COLLECTIONS"), list(reader_make_constant_shell("ResearchCycConstant"), reader_make_constant_shell("ScaffoldingConstant")), makeKeyword("OMISSION-COLLECTIONS"), list(reader_make_constant_shell("ProprietaryTerm"), reader_make_constant_shell("TerroristAgent"), reader_make_constant_shell("TerroristAct"), reader_make_constant_shell("HostileSocialAction")), makeKeyword("DEFINITIONAL-PREDICATE-SET"), NIL)));

    static private final SubLString $$$akb = makeString("akb");

    static private final SubLList $list_alt132 = list($NAME, makeString("akb"), makeKeyword("POST-IDENTIFY-ASSERTIONS-FNS"), list(makeSymbol("TKB-KBS-SAVE-TERMS-WITHOUT-ISAS")), makeKeyword("INHERITED-STORES"), list(makeKeyword("RULE-STATISTICS"), makeKeyword("CACHING-POLICIES")), makeKeyword("SECTIONS"), list(list(makeKeyword("COLLECTIONS"), list(reader_make_constant_shell("TKBTerm-Proprietary")), makeKeyword("OMISSION-COLLECTIONS"), NIL, makeKeyword("DEFINITIONAL-PREDICATE-SET"), NIL), list(makeKeyword("COLLECTIONS"), list(reader_make_constant_shell("CycLConstant"), reader_make_constant_shell("Thing")), makeKeyword("OMISSION-COLLECTIONS"), list(reader_make_constant_shell("ProprietaryTerm")), makeKeyword("DEFINITIONAL-PREDICATE-SET"), NIL)));

    static private final SubLString $$$coretkb = makeString("coretkb");

    static private final SubLList $list_alt134 = list($NAME, makeString("coretkb"), makeKeyword("POST-IDENTIFY-ASSERTIONS-FNS"), NIL, makeKeyword("INHERITED-STORES"), list(makeKeyword("RULE-STATISTICS"), makeKeyword("CACHING-POLICIES")), makeKeyword("SECTIONS"), list(list(makeKeyword("COLLECTIONS"), list(reader_make_constant_shell("TKBTerm-Proprietary")), makeKeyword("OMISSION-COLLECTIONS"), NIL, makeKeyword("DEFINITIONAL-PREDICATE-SET"), NIL), list(makeKeyword("COLLECTIONS"), list(reader_make_constant_shell("ResearchCycConstant"), reader_make_constant_shell("ScaffoldingConstant")), makeKeyword("OMISSION-COLLECTIONS"), list(reader_make_constant_shell("ProprietaryTerm")), makeKeyword("DEFINITIONAL-PREDICATE-SET"), NIL)));

    static private final SubLString $str_alt135$coretkb_nonprop = makeString("coretkb-nonprop");

    static private final SubLList $list_alt136 = list($NAME, makeString("coretkb-nonprop"), makeKeyword("POST-IDENTIFY-ASSERTIONS-FNS"), NIL, makeKeyword("INHERITED-STORES"), list(makeKeyword("RULE-STATISTICS"), makeKeyword("CACHING-POLICIES")), makeKeyword("SECTIONS"), list(list(makeKeyword("COLLECTIONS"), list(reader_make_constant_shell("ResearchCycConstant"), reader_make_constant_shell("ScaffoldingConstant")), makeKeyword("OMISSION-COLLECTIONS"), list(reader_make_constant_shell("ProprietaryTerm")), makeKeyword("DEFINITIONAL-PREDICATE-SET"), NIL)));

    static private final SubLString $str_alt137$opencyc_without_nonprop = makeString("opencyc-without-nonprop");

    static private final SubLList $list_alt138 = list($NAME, makeString("opencyc-without-nonprop"), makeKeyword("PREREMOVED-ASSERTIONS"), list(reader_make_constant_shell("unassertForOpenCycBuild"), reader_make_constant_shell("unassertForNonTKBBuild")), makeKeyword("PRERUN-FNS"), list(makeSymbol("OPENCYC-KBS-FORTS-ASSERT-PRETTY-STRINGS"), makeSymbol("OPENCYC-KBS-REMOVE-EXCLUDED-SYNONYMOUS-EXTERNAL-CONCEPT-ASSERTIONS")), makeKeyword("SECTIONS"), list(list(makeKeyword("COLLECTIONS"), list(reader_make_constant_shell("CoreUnionConstant")), makeKeyword("OMISSION-COLLECTIONS"), list(reader_make_constant_shell("ProprietaryTerm"))), list(makeKeyword("COLLECTIONS"), list(reader_make_constant_shell("PublicConstant"), reader_make_constant_shell("ProposedPublicConstant"), reader_make_constant_shell("ResearchCycConstant")), makeKeyword("OMISSION-COLLECTIONS"), list(reader_make_constant_shell("ProprietaryTerm")), makeKeyword("DEFINITIONAL-PREDICATE-SET"), reader_make_constant_shell("OpenCycDefinitionalPredicate"), makeKeyword("DEFINITIONAL-RULE-PREDICATE"), reader_make_constant_shell("openCycRetainRule")), list(makeKeyword("COLLECTIONS"), list(reader_make_constant_shell("ScaffoldingConstant")), makeKeyword("OMISSION-COLLECTIONS"), list(reader_make_constant_shell("ProprietaryTerm")), makeKeyword("DEFINITIONAL-PREDICATE-SET"), reader_make_constant_shell("ScaffoldingDefinitionalPredicate"))));

    static private final SubLList $list_alt139 = list($NAME, makeString("opencyc"), makeKeyword("PREREMOVED-ASSERTIONS"), list(reader_make_constant_shell("unassertForOpenCycBuild"), reader_make_constant_shell("unassertForNonTKBBuild")), makeKeyword("PRERUN-FNS"), list(makeSymbol("OPENCYC-KBS-REMOVE-EXCLUDED-SYNONYMOUS-EXTERNAL-CONCEPT-ASSERTIONS"), makeSymbol("OPENCYC-KBS-FORTS-ASSERT-PRETTY-STRINGS")), makeKeyword("SECTIONS"), list(list(makeKeyword("COLLECTIONS"), list(reader_make_constant_shell("CoreUnionConstant")), makeKeyword("OMISSION-COLLECTIONS"), list(reader_make_constant_shell("ProprietaryTerm"))), list(makeKeyword("COLLECTIONS"), list(reader_make_constant_shell("CycLConstant"), reader_make_constant_shell("Thing")), makeKeyword("OMISSION-COLLECTIONS"), list(reader_make_constant_shell("ProprietaryTerm"), reader_make_constant_shell("OpenCycExcludedTerm")), makeKeyword("DEFINITIONAL-PREDICATE-SET"), reader_make_constant_shell("OpenCycDefinitionalPredicate"), makeKeyword("DEFINITIONAL-RULE-PREDICATE"), reader_make_constant_shell("openCycRetainRule"))));

    static private final SubLString $$$nonprop = makeString("nonprop");

    static private final SubLList $list_alt141 = list($NAME, makeString("nonprop"), makeKeyword("SECTIONS"), list(list(makeKeyword("COLLECTIONS"), list(reader_make_constant_shell("CycLConstant"), reader_make_constant_shell("Thing")), makeKeyword("OMISSION-COLLECTIONS"), list(reader_make_constant_shell("ProprietaryTerm")), makeKeyword("DEFINITIONAL-PREDICATE-SET"), NIL)));

    static private final SubLString $$$mysentient = makeString("mysentient");

    static private final SubLList $list_alt143 = list($NAME, makeString("mysentient"), makeKeyword("SECTIONS"), list(list(makeKeyword("COLLECTIONS"), list(reader_make_constant_shell("MySentientProprietaryTerm")), makeKeyword("OMISSION-COLLECTIONS"), list(reader_make_constant_shell("ExcludeFromMySentient")), makeKeyword("DEFINITIONAL-PREDICATE-SET"), NIL), list(makeKeyword("COLLECTIONS"), list(reader_make_constant_shell("CycLConstant"), reader_make_constant_shell("Thing")), makeKeyword("OMISSION-COLLECTIONS"), list(reader_make_constant_shell("ProprietaryTerm"), reader_make_constant_shell("ExcludeFromMySentient")), makeKeyword("DEFINITIONAL-PREDICATE-SET"), NIL)));

    static private final SubLString $$$tkb = makeString("tkb");

    static private final SubLList $list_alt145 = list($NAME, makeString("tkb"), makeKeyword("POST-IDENTIFY-ASSERTIONS-FNS"), NIL, makeKeyword("INHERITED-STORES"), list(makeKeyword("RULE-STATISTICS"), makeKeyword("CACHING-POLICIES")), makeKeyword("SECTIONS"), list(list(makeKeyword("COLLECTIONS"), list(reader_make_constant_shell("TKBConstant-Generic"), reader_make_constant_shell("TKBTerm-Proprietary")), makeKeyword("OMISSION-COLLECTIONS"), NIL, makeKeyword("DEFINITIONAL-PREDICATE-SET"), NIL), list(makeKeyword("COLLECTIONS"), list(reader_make_constant_shell("CycLConstant"), reader_make_constant_shell("Thing")), makeKeyword("OMISSION-COLLECTIONS"), list(reader_make_constant_shell("ProprietaryTerm")), makeKeyword("DEFINITIONAL-PREDICATE-SET"), NIL)));

    static private final SubLString $$$ikb = makeString("ikb");

    static private final SubLList $list_alt147 = list($NAME, makeString("ikb"), makeKeyword("SECTIONS"), list(list(makeKeyword("COLLECTIONS"), list(reader_make_constant_shell("IKBConstant"), reader_make_constant_shell("PublicConstant"), reader_make_constant_shell("ProposedPublicConstant")), makeKeyword("OMISSION-COLLECTIONS"), list(reader_make_constant_shell("NonIKBConstant")), makeKeyword("DEFINITIONAL-PREDICATE-SET"), NIL)));

    static private final SubLString $$$public = makeString("public");

    static private final SubLList $list_alt149 = list($NAME, makeString("public"), makeKeyword("SECTIONS"), list(list(makeKeyword("COLLECTIONS"), list(reader_make_constant_shell("PublicConstant"), reader_make_constant_shell("ProposedPublicConstant")), makeKeyword("OMISSION-COLLECTIONS"), list(reader_make_constant_shell("ProprietaryTerm")), makeKeyword("DEFINITIONAL-PREDICATE-SET"), NIL)));

    static private final SubLString $$$halo = makeString("halo");

    static private final SubLList $list_alt151 = list($NAME, makeString("halo"), makeKeyword("SECTIONS"), list(list(makeKeyword("COLLECTIONS"), list(reader_make_constant_shell("HaloOpenSourceConstant")), makeKeyword("OMISSION-COLLECTIONS"), list(reader_make_constant_shell("ProprietaryTerm")), makeKeyword("DEFINITIONAL-PREDICATE-SET"), NIL)));

    static private final SubLString $$$cycsecure = makeString("cycsecure");

    static private final SubLList $list_alt153 = list($NAME, makeString("cycsecure"), makeKeyword("SECTIONS"), list(list(makeKeyword("COLLECTIONS"), list(reader_make_constant_shell("CycSecureFORT")), makeKeyword("OMISSION-COLLECTIONS"), NIL, makeKeyword("DEFINITIONAL-PREDICATE-SET"), NIL)));

    static private final SubLString $str_alt154$KB_subset__S_not_defined_ = makeString("KB subset ~S not defined.");

    static private final SubLString $str_alt156$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $str_alt157$Gathering_up_all_assertion_EL_for = makeString("Gathering up all assertion EL formulas ....");
}

/**
 * Total time: 8317 ms
 */
