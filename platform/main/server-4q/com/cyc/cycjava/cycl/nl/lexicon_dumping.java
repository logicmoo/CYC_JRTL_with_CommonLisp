/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.nl;


import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.file_utilities.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.utilities_macros.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Characters.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.*;
import com.cyc.cycjava.cycl.owl.owl_cycl_to_xml;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Strings;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      LEXICON-DUMPING
 * source file: /cyc/top/cycl/nl/lexicon-dumping.lisp
 * created:     2019/07/03 17:38:55
 */
public final class lexicon_dumping extends SubLTranslatedFile implements V12 {
    public static final SubLObject denotational_term_name(SubLObject cycl) {
        if (NIL != constant_p(cycl)) {
            return constants_high.constant_name(cycl);
        } else {
            if (NIL != nart_handles.nart_p(cycl)) {
                return string_utilities.string_substitute($str_alt43$, $str_alt80$__, string_utilities.object_to_string(narts_high.nart_el_formula(cycl)), UNPROVIDED);
            } else {
                if (NIL != narts_high.naut_p(cycl)) {
                    return string_utilities.string_substitute($str_alt43$, $str_alt80$__, string_utilities.object_to_string(cycl), UNPROVIDED);
                }
            }
        }
        return NIL;
    }

    static private final SubLString $str_alt43$ = makeString("");

    public static final SubLFile me = new lexicon_dumping();

 public static final String myName = "com.cyc.cycjava.cycl.nl.lexicon_dumping";


    // defparameter
    // Definitions
    /**
     * When extending a lexicon, should we copy the file, modify it, then copy it
     * back (thereby hopefully avoiding any concurrent-write problems)
     */
    @LispMethod(comment = "When extending a lexicon, should we copy the file, modify it, then copy it\r\nback (thereby hopefully avoiding any concurrent-write problems)\ndefparameter\nWhen extending a lexicon, should we copy the file, modify it, then copy it\nback (thereby hopefully avoiding any concurrent-write problems)")
    public static final SubLSymbol $lexicon_dumping_copy_filesP$ = makeSymbol("*LEXICON-DUMPING-COPY-FILES?*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $lexicon_dump_excluded_predicates$ = makeSymbol("*LEXICON-DUMP-EXCLUDED-PREDICATES*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $dumping_lexicon$ = makeSymbol("*DUMPING-LEXICON*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $dumping_semtrans_lexicon$ = makeSymbol("*DUMPING-SEMTRANS-LEXICON*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $semtrans_lexicon_dump_excluded_pos_list$ = makeSymbol("*SEMTRANS-LEXICON-DUMP-EXCLUDED-POS-LIST*");

    // deflexical
    // The separator between entries in the TSV files
    /**
     * The separator between entries in the TSV files
     */
    @LispMethod(comment = "The separator between entries in the TSV files\ndeflexical")
    private static final SubLSymbol $lexicon_file_record_separator$ = makeSymbol("*LEXICON-FILE-RECORD-SEPARATOR*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(new SubLObject[]{ reader_make_constant_shell("abbreviationForLexicalWord"), reader_make_constant_shell("abbreviationString-PN"), reader_make_constant_shell("airportHasIATACode"), reader_make_constant_shell("atomicSymbol"), reader_make_constant_shell("chemicalFormulaString"), reader_make_constant_shell("countryCodeDigraph"), reader_make_constant_shell("countryCodeTrigraph"), reader_make_constant_shell("currencyCode"), reader_make_constant_shell("geopoliticalEntityCodeDigraph"), reader_make_constant_shell("internetCountryCode"), reader_make_constant_shell("urlStringOfCW") });



    private static final SubLObject $const5$AllGeneralEnglishValidatedLexical = reader_make_constant_shell("AllGeneralEnglishValidatedLexicalMicrotheoryPSC");

    static private final SubLList $list6 = list(reader_make_constant_shell("Adjective"), reader_make_constant_shell("Preposition"), reader_make_constant_shell("Adverb"));

    private static final SubLString $str9$_cyc_projects_opencyc_tagging_lex = makeString("/cyc/projects/opencyc/tagging-lexicon/");

    private static final SubLSymbol $sym10$FORT_HAS_EXPORTED_OWL_OPENCYC_CONTENT_ = makeSymbol("FORT-HAS-EXPORTED-OWL-OPENCYC-CONTENT?");

    private static final SubLString $str11$_cyc_projects_concept_search_ = makeString("/cyc/projects/concept-search/");

    private static final SubLSymbol $sym12$FORT_SHOULD_BE_IN_LEXICON_ = makeSymbol("FORT-SHOULD-BE-IN-LEXICON?");

    private static final SubLString $str13$strings_to_short_ids = makeString("strings-to-short-ids");

    private static final SubLString $str14$_ = makeString("-");

    private static final SubLString $str15$_xml = makeString(".xml");

    private static final SubLString $str16$short_ids_to_concepts_ = makeString("short-ids-to-concepts-");

    private static final SubLString $str17$_tsv = makeString(".tsv");

    private static final SubLString $str18$_cyc_projects_concept_search_stri = makeString("/cyc/projects/concept-search/strings-to-short-ids.xml");

    private static final SubLString $str19$_cyc_projects_concept_search_shor = makeString("/cyc/projects/concept-search/short-ids-to-concepts-test.tsv");

    private static final SubLString $str21$strings_to_short_ids_tsv = makeString("strings-to-short-ids.tsv");

    private static final SubLString $str22$short_ids_to_concepts_tsv = makeString("short-ids-to-concepts.tsv");

    private static final SubLString $$$Exceeded_desired_lexicon_size = makeString("Exceeded desired lexicon size");



    private static final SubLSymbol ADD_STOP_WORD = makeSymbol("ADD-STOP-WORD");

    private static final SubLString $str31$found__a_____a_in_the_lexicon = makeString("found ~a -> ~a in the lexicon");

    private static final SubLString $str33$_ = makeString(".");

    private static final SubLString $str34$error_when_writing_out_lexicon_fo = makeString("error when writing out lexicon for ~S: ~S");

    private static final SubLSymbol GET_STOP_WORDS = makeSymbol("GET-STOP-WORDS");

    private static final SubLString $str41$Copying_files_from_temporary_loca = makeString("Copying files from temporary locations");

    private static final SubLString $$$February = makeString("February");

    private static final SubLString $str47$adding__S___S = makeString("adding ~S: ~S");

    private static final SubLString $$$_ = makeString(" ");

    private static final SubLString $str49$No_entries_added_for__S__ = makeString("No entries added for ~S~%");

    private static final SubLString $str51$Unable_to_open__S = makeString("Unable to open ~S");

    private static final SubLString $str52$writing_strings_to_ids = makeString("writing strings-to-ids");

    private static final SubLString $str53$ = makeString("");

    private static final SubLString $str54$writing_ids_to_concepts = makeString("writing ids-to-concepts");

    private static final SubLString $$$lexicon = makeString("lexicon");

    private static final SubLString $$$Lexicon_Dump_XML_Clipper = makeString("Lexicon Dump XML Clipper");

    private static final SubLString $$$perl = makeString("perl");

    private static final SubLString $str60$_p = makeString("-p");

    private static final SubLString $str61$_i = makeString("-i");

    private static final SubLString $str62$_e = makeString("-e");

    private static final SubLString $str63$_s____ = makeString("\'s/<\\/");

    private static final SubLString $str64$____ = makeString(">//'");

    private static final SubLString $str65$done_dumping___S__S__S = makeString("done dumping: ~S ~S ~S");

    private static final SubLString $$$mapping = makeString("mapping");

    private static final SubLString $$$nlString = makeString("nlString");

    private static final SubLString $$$caseSensitive = makeString("caseSensitive");

    private static final SubLString $$$t = makeString("t");

    private static final SubLString $$$f = makeString("f");

    private static final SubLString $$$entryType = makeString("entryType");

    private static final SubLString $$$mappingStrength = makeString("mappingStrength");

    private static final SubLString $$$entry = makeString("entry");

    private static final SubLList $list74 = list(makeKeyword("EXTERNAL-ID"));

    private static final SubLObject $const75$ContextuallyDependentLexicalMappi = reader_make_constant_shell("ContextuallyDependentLexicalMapping");





    private static final SubLList $list80 = list(makeKeyword("EXTERNAL-ID"), $CYCL, makeKeyword("PREFERRED-NL"));

    private static final SubLString $$$uri = makeString("uri");

    private static final SubLString $$$nat = makeString("nat");

    private static final SubLString $$$concept = makeString("concept");

    private static final SubLString $$$externalId = makeString("externalId");

    private static final SubLString $$$id = makeString("id");

    private static final SubLString $$$preferredNl = makeString("preferredNl");

    private static final SubLList $list89 = list(makeString("xml:lang"), makeString("en"));

    private static final SubLSymbol $PPH_LEXICAL_CONTEXT = makeKeyword("PPH-LEXICAL-CONTEXT");



    private static final SubLString $$$cycl = makeString("cycl");

    private static final SubLList $list93 = list(makeString("xml:lang"), makeString("x-cycl-en-us"));



    private static final SubLString $str95$_cyc_projects_concept_search_shor = makeString("/cyc/projects/concept-search/short-ids-to-concepts.tsv");

    private static final SubLString $str96$_cyc_projects_concept_search_shor = makeString("/cyc/projects/concept-search/short-ids-to-isa-genls.tsv");

    private static final SubLString $str97$reading_the_file___ = makeString("reading the file...");

    private static final SubLList $list99 = list(CHAR_quotation);



    private static final SubLString $str101$g_ = makeString("g:");

    private static final SubLString $str102$i_ = makeString("i:");

    public static final SubLObject get_dumping_lexicon_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == abstract_lexicon.abstract_lexicon_p($dumping_lexicon$.getDynamicValue(thread))) {
                $dumping_lexicon$.setDynamicValue(object.new_class_instance(TERM_LEXICON), thread);
                {
                    SubLObject cdolist_list_var = $lexicon_dump_excluded_predicates$.getDynamicValue(thread);
                    SubLObject pred = NIL;
                    for (pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pred = cdolist_list_var.first()) {
                        methods.funcall_instance_method_with_1_args($dumping_lexicon$.getDynamicValue(thread), EXCLUDE_PREDICATE, pred);
                    }
                }
                if (NIL != valid_constantP($$EnglishDocumentTaggingLexicalMt, UNPROVIDED)) {
                    instances.set_slot($dumping_lexicon$.getDynamicValue(thread), DEFAULT_BASE_MT, $$EnglishDocumentTaggingLexicalMt);
                } else {
                    instances.set_slot($dumping_lexicon$.getDynamicValue(thread), DEFAULT_BASE_MT, $const5$AllGeneralEnglishValidatedLexical);
                }
            }
            return $dumping_lexicon$.getDynamicValue(thread);
        }
    }

    public static SubLObject get_dumping_lexicon() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == abstract_lexicon.abstract_lexicon_p($dumping_lexicon$.getDynamicValue(thread))) {
            $dumping_lexicon$.setDynamicValue(object.new_class_instance(TERM_LEXICON), thread);
            SubLObject cdolist_list_var = $lexicon_dump_excluded_predicates$.getDynamicValue(thread);
            SubLObject pred = NIL;
            pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                methods.funcall_instance_method_with_1_args($dumping_lexicon$.getDynamicValue(thread), EXCLUDE_PREDICATE, pred);
                cdolist_list_var = cdolist_list_var.rest();
                pred = cdolist_list_var.first();
            } 
            if (NIL != valid_constantP($$EnglishDocumentTaggingLexicalMt, UNPROVIDED)) {
                instances.set_slot($dumping_lexicon$.getDynamicValue(thread), DEFAULT_BASE_MT, $$EnglishDocumentTaggingLexicalMt);
            } else {
                instances.set_slot($dumping_lexicon$.getDynamicValue(thread), DEFAULT_BASE_MT, $const5$AllGeneralEnglishValidatedLexical);
            }
        }
        return $dumping_lexicon$.getDynamicValue(thread);
    }

    public static final SubLObject get_dumping_semtrans_lexicon_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == abstract_lexicon.abstract_lexicon_p($dumping_semtrans_lexicon$.getDynamicValue(thread))) {
                $dumping_semtrans_lexicon$.setDynamicValue(object.new_class_instance(SEMTRANS_LEXICON), thread);
                {
                    SubLObject cdolist_list_var = $lexicon_dump_excluded_predicates$.getDynamicValue(thread);
                    SubLObject pred = NIL;
                    for (pred = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pred = cdolist_list_var.first()) {
                        methods.funcall_instance_method_with_1_args($dumping_semtrans_lexicon$.getDynamicValue(thread), EXCLUDE_PREDICATE, pred);
                    }
                }
                {
                    SubLObject cdolist_list_var = $semtrans_lexicon_dump_excluded_pos_list$.getDynamicValue(thread);
                    SubLObject pos = NIL;
                    for (pos = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , pos = cdolist_list_var.first()) {
                        methods.funcall_instance_method_with_1_args($dumping_semtrans_lexicon$.getDynamicValue(thread), EXCLUDE_POS, pos);
                    }
                }
                if (NIL != valid_constantP($$EnglishDocumentTaggingLexicalMt, UNPROVIDED)) {
                    instances.set_slot($dumping_semtrans_lexicon$.getDynamicValue(thread), DEFAULT_BASE_MT, $$EnglishDocumentTaggingLexicalMt);
                } else {
                    instances.set_slot($dumping_semtrans_lexicon$.getDynamicValue(thread), DEFAULT_BASE_MT, $const5$AllGeneralEnglishValidatedLexical);
                }
            }
            return $dumping_lexicon$.getDynamicValue(thread);
        }
    }

    public static SubLObject get_dumping_semtrans_lexicon() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == abstract_lexicon.abstract_lexicon_p($dumping_semtrans_lexicon$.getDynamicValue(thread))) {
            $dumping_semtrans_lexicon$.setDynamicValue(object.new_class_instance(SEMTRANS_LEXICON), thread);
            SubLObject cdolist_list_var = $lexicon_dump_excluded_predicates$.getDynamicValue(thread);
            SubLObject pred = NIL;
            pred = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                methods.funcall_instance_method_with_1_args($dumping_semtrans_lexicon$.getDynamicValue(thread), EXCLUDE_PREDICATE, pred);
                cdolist_list_var = cdolist_list_var.rest();
                pred = cdolist_list_var.first();
            } 
            cdolist_list_var = $semtrans_lexicon_dump_excluded_pos_list$.getDynamicValue(thread);
            SubLObject pos = NIL;
            pos = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                methods.funcall_instance_method_with_1_args($dumping_semtrans_lexicon$.getDynamicValue(thread), EXCLUDE_POS, pos);
                cdolist_list_var = cdolist_list_var.rest();
                pos = cdolist_list_var.first();
            } 
            if (NIL != valid_constantP($$EnglishDocumentTaggingLexicalMt, UNPROVIDED)) {
                instances.set_slot($dumping_semtrans_lexicon$.getDynamicValue(thread), DEFAULT_BASE_MT, $$EnglishDocumentTaggingLexicalMt);
            } else {
                instances.set_slot($dumping_semtrans_lexicon$.getDynamicValue(thread), DEFAULT_BASE_MT, $const5$AllGeneralEnglishValidatedLexical);
            }
        }
        return $dumping_lexicon$.getDynamicValue(thread);
    }

    public static final SubLObject dump_opencyc_lexicon_alt(SubLObject output_path) {
        if (output_path == UNPROVIDED) {
            output_path = $str_alt34$_cyc_projects_opencyc_tagging_lex;
        }
        {
            SubLObject timestamp_string = numeric_date_utilities.timestamp(UNPROVIDED, UNPROVIDED);
            SubLObject strings_to_ids = cconcatenate(output_path, new SubLObject[]{ $str_alt35$strings_to_short_ids_, timestamp_string, $str_alt36$_xml });
            SubLObject ids_to_concepts = cconcatenate(output_path, new SubLObject[]{ $str_alt37$short_ids_to_concepts_, timestamp_string, $str_alt38$_tsv });
            return com.cyc.cycjava.cycl.nl.lexicon_dumping.dump_xml_lexicon(strings_to_ids, ids_to_concepts, $sym39$FORT_HAS_EXPORTED_OWL_OPENCYC_CONTENT_, NIL);
        }
    }

    public static SubLObject dump_opencyc_lexicon(SubLObject output_path) {
        if (output_path == UNPROVIDED) {
            output_path = $str9$_cyc_projects_opencyc_tagging_lex;
        }
        return dump_and_link_lexicon(output_path, $sym10$FORT_HAS_EXPORTED_OWL_OPENCYC_CONTENT_);
    }

    public static SubLObject dump_full_lexicon(SubLObject output_path) {
        if (output_path == UNPROVIDED) {
            output_path = $str11$_cyc_projects_concept_search_;
        }
        return dump_and_link_lexicon(output_path, $sym12$FORT_SHOULD_BE_IN_LEXICON_);
    }

    public static SubLObject dump_and_link_lexicon(final SubLObject output_path, final SubLObject test_func) {
        final SubLObject timestamp_string = numeric_date_utilities.timestamp(UNPROVIDED, UNPROVIDED);
        final SubLObject prefix = cconcatenate(output_path, $str13$strings_to_short_ids);
        final SubLObject strings_to_ids = cconcatenate(prefix, new SubLObject[]{ $str14$_, timestamp_string, $str15$_xml });
        final SubLObject strings_to_ids_link = cconcatenate(prefix, $str15$_xml);
        final SubLObject ids_to_concepts = cconcatenate(output_path, new SubLObject[]{ $str16$short_ids_to_concepts_, timestamp_string, $str17$_tsv });
        final SubLObject output_files = dump_xml_lexicon(strings_to_ids, ids_to_concepts, test_func, NIL);
        file_utilities.delete_file_via_os(strings_to_ids_link);
        file_utilities.create_symbolic_link(strings_to_ids_link, strings_to_ids);
        return output_files;
    }

    public static SubLObject fort_should_be_in_lexiconP(final SubLObject fort) {
        return makeBoolean(NIL == hlmt.hlmtP(fort));
    }

    public static final SubLObject dump_xml_lexicon_alt(SubLObject strings_to_ids, SubLObject ids_to_concepts, SubLObject test_func, SubLObject include_stop_wordsP) {
        if (strings_to_ids == UNPROVIDED) {
            strings_to_ids = $str_alt9$_cyc_projects_concept_search_stri;
        }
        if (ids_to_concepts == UNPROVIDED) {
            ids_to_concepts = $str_alt10$_cyc_projects_concept_search_shor;
        }
        if (test_func == UNPROVIDED) {
            test_func = TRUE;
        }
        if (include_stop_wordsP == UNPROVIDED) {
            include_stop_wordsP = T;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject tmp_strings_to_ids = cconcatenate(temp_directory(), $str_alt12$strings_to_short_ids_tsv);
                SubLObject tmp_ids_to_concepts = cconcatenate(temp_directory(), $str_alt13$short_ids_to_concepts_tsv);
                {
                    SubLObject _prev_bind_0 = $print_pretty$.currentBinding(thread);
                    try {
                        $print_pretty$.bind(NIL, thread);
                        {
                            SubLObject denot_lex = com.cyc.cycjava.cycl.nl.lexicon_dumping.get_dumping_lexicon();
                            SubLObject count = ZERO_INTEGER;
                            SubLObject limit = $most_positive_fixnum$.getGlobalValue();
                            SubLObject string_to_concepts = dictionary.new_dictionary(EQUAL, UNPROVIDED);
                            SubLObject concepts_to_ids = dictionary.new_dictionary(EQUAL, UNPROVIDED);
                            SubLObject over_limit_msg = $$$Exceeded_desired_lexicon_size;
                            SubLObject msg = NIL;
                            {
                                SubLObject _prev_bind_0_1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                                try {
                                    mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                                    mt_relevance_macros.$mt$.bind($$EnglishDocumentTaggingLexicalMt, thread);
                                    {
                                        SubLObject pred_var = $$stopWordString;
                                        if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                                            {
                                                SubLObject iterator_var = kb_mapping_macros.new_predicate_extent_final_index_spec_iterator(pred_var);
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
                                                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, $GAF, NIL, NIL);
                                                                    {
                                                                        SubLObject done_var_2 = NIL;
                                                                        SubLObject token_var_3 = NIL;
                                                                        while (NIL == done_var_2) {
                                                                            {
                                                                                SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_3);
                                                                                SubLObject valid_4 = makeBoolean(token_var_3 != ass);
                                                                                if (NIL != valid_4) {
                                                                                    methods.funcall_instance_method_with_1_args(denot_lex, ADD_STOP_WORD, cycl_utilities.formula_arg1(ass, UNPROVIDED));
                                                                                }
                                                                                done_var_2 = makeBoolean(NIL == valid_4);
                                                                            }
                                                                        } 
                                                                    }
                                                                } finally {
                                                                    {
                                                                        SubLObject _prev_bind_0_5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                                                        try {
                                                                            $is_thread_performing_cleanupP$.bind(T, thread);
                                                                            if (NIL != final_index_iterator) {
                                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                            }
                                                                        } finally {
                                                                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_5, thread);
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
                                    mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                                    mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_1, thread);
                                }
                            }
                            try {
                                {
                                    SubLObject _prev_bind_0_6 = Errors.$error_handler$.currentBinding(thread);
                                    try {
                                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                                        try {
                                            {
                                                SubLObject cdolist_list_var = list(denot_lex);
                                                SubLObject lex = NIL;
                                                for (lex = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , lex = cdolist_list_var.first()) {
                                                    {
                                                        SubLObject iterator = abstract_lexicon.new_lexicon_iterator(lex);
                                                        while (NIL == iteration.iteration_done(iterator)) {
                                                            {
                                                                SubLObject entry = iteration.iteration_next(iterator);
                                                                SubLObject string = methods.funcall_instance_method_with_1_args(entry, GET, $STRING);
                                                                if (string.isString()) {
                                                                    if (!(((NIL != lexicon_accessors.closed_lexical_class_stringP(methods.funcall_instance_method_with_1_args(entry, GET, $STRING), UNPROVIDED)) || (NIL != com.cyc.cycjava.cycl.nl.lexicon_dumping.thing_describable_as_lex_p(entry))) || (NIL != com.cyc.cycjava.cycl.nl.lexicon_dumping.contextually_dependent_entryP(entry)))) {
                                                                        {
                                                                            SubLObject case_sensitiveP = lexicon_accessors.closed_lexical_class_stringP(string, UNPROVIDED);
                                                                            thread.resetMultipleValues();
                                                                            {
                                                                                SubLObject cycl = com.cyc.cycjava.cycl.nl.lexicon_dumping.get_dumping_entry_cycl(entry, lex);
                                                                                SubLObject entry_type = thread.secondMultipleValue();
                                                                                thread.resetMultipleValues();
                                                                                if (count.numGE(limit)) {
                                                                                    Errors.error(over_limit_msg);
                                                                                }
                                                                                if (NIL != funcall(test_func, cycl)) {
                                                                                    count = add(count, ONE_INTEGER);
                                                                                    {
                                                                                        SubLObject entry_info = list($CYCL, cycl, $ENTRY_TYPE, entry_type, $CASE_SENSITIVE, case_sensitiveP);
                                                                                        dictionary_utilities.dictionary_pushnew(string_to_concepts, string, entry_info, EQUAL, UNPROVIDED);
                                                                                        if (NIL == dictionary.dictionary_lookup(concepts_to_ids, cycl, UNPROVIDED)) {
                                                                                            dictionary.dictionary_enter(concepts_to_ids, cycl, kb_utilities.compact_hl_external_id_string(cycl));
                                                                                        }
                                                                                        if (ZERO_INTEGER.numE(mod(count, $int$100))) {
                                                                                            princ($str_alt26$_, T);
                                                                                            force_output(UNPROVIDED);
                                                                                        }
                                                                                        if (NIL != list_utilities.lengthG(string_utilities.search_all($str_alt27$_, string, UNPROVIDED, UNPROVIDED), ONE_INTEGER, UNPROVIDED)) {
                                                                                            {
                                                                                                SubLObject capitalized = string_utilities.capitalize_smart(string);
                                                                                                if (NIL == methods.funcall_instance_method_with_1_args(lex, GET, capitalized)) {
                                                                                                    dictionary_utilities.dictionary_pushnew(string_to_concepts, string_utilities.capitalize_smart(string), entry_info, EQUAL, UNPROVIDED);
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                    }
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                } else {
                                                                    Errors.warn($str_alt28$found__a_____a_in_the_lexicon, string, entry);
                                                                }
                                                            }
                                                        } 
                                                    }
                                                }
                                            }
                                        } catch (Throwable catch_var) {
                                            Errors.handleThrowable(catch_var, NIL);
                                        }
                                    } finally {
                                        Errors.$error_handler$.rebind(_prev_bind_0_6, thread);
                                    }
                                }
                            } catch (Throwable ccatch_env_var) {
                                msg = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                            }
                            if ((NIL != msg) && (!msg.equal(over_limit_msg))) {
                                Errors.warn($str_alt29$error_when_writing_out_lexicon___, msg);
                            }
                            if (NIL != include_stop_wordsP) {
                                {
                                    SubLObject set_contents_var = set.do_set_internal(methods.funcall_instance_method_with_0_args(denot_lex, GET_STOP_WORDS));
                                    SubLObject basis_object = set_contents.do_set_contents_basis_object(set_contents_var);
                                    SubLObject state = NIL;
                                    for (state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                        {
                                            SubLObject stop_word = set_contents.do_set_contents_next(basis_object, state);
                                            if (NIL != set_contents.do_set_contents_element_validP(state, stop_word)) {
                                                dictionary_utilities.dictionary_pushnew(string_to_concepts, stop_word, list($CYCL, $$stopWordString, $ENTRY_TYPE, $DENOT, $CASE_SENSITIVE, NIL), EQUAL, UNPROVIDED);
                                            }
                                        }
                                    }
                                }
                            }
                            com.cyc.cycjava.cycl.nl.lexicon_dumping.dump_xml_string_to_concepts_dict(string_to_concepts, tmp_strings_to_ids, tmp_ids_to_concepts, $OUTPUT, UNPROVIDED);
                            format(T, $str_alt33$Copying_files_from_temporary_loca);
                            if (NIL != Filesys.probe_file(strings_to_ids)) {
                                subl_promotions.copy_file(strings_to_ids, cconcatenate(strings_to_ids, numeric_date_utilities.universal_timestring(Filesys.file_write_date(strings_to_ids))));
                            }
                            if (NIL != Filesys.probe_file(ids_to_concepts)) {
                                subl_promotions.copy_file(ids_to_concepts, cconcatenate(ids_to_concepts, numeric_date_utilities.universal_timestring(Filesys.file_write_date(ids_to_concepts))));
                            }
                            subl_promotions.copy_file(tmp_strings_to_ids, strings_to_ids);
                            subl_promotions.copy_file(tmp_ids_to_concepts, ids_to_concepts);
                        }
                    } finally {
                        $print_pretty$.rebind(_prev_bind_0, thread);
                    }
                }
            }
            return list(strings_to_ids, ids_to_concepts);
        }
    }

    public static SubLObject dump_xml_lexicon(SubLObject strings_to_ids, SubLObject ids_to_concepts, SubLObject test_func, SubLObject include_stop_wordsP) {
        if (strings_to_ids == UNPROVIDED) {
            strings_to_ids = $str18$_cyc_projects_concept_search_stri;
        }
        if (ids_to_concepts == UNPROVIDED) {
            ids_to_concepts = $str19$_cyc_projects_concept_search_shor;
        }
        if (test_func == UNPROVIDED) {
            test_func = TRUE;
        }
        if (include_stop_wordsP == UNPROVIDED) {
            include_stop_wordsP = T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject tmp_strings_to_ids = cconcatenate(file_utilities.temp_directory(), $str21$strings_to_short_ids_tsv);
        final SubLObject tmp_ids_to_concepts = cconcatenate(file_utilities.temp_directory(), $str22$short_ids_to_concepts_tsv);
        final SubLObject _prev_bind_0 = $print_pretty$.currentBinding(thread);
        try {
            $print_pretty$.bind(NIL, thread);
            final SubLObject denot_lex = get_dumping_lexicon();
            SubLObject count = ZERO_INTEGER;
            final SubLObject limit = $most_positive_fixnum$.getGlobalValue();
            final SubLObject string_to_concepts = dictionary.new_dictionary(EQUAL, UNPROVIDED);
            final SubLObject over_limit_msg = $$$Exceeded_desired_lexicon_size;
            SubLObject msg = NIL;
            final SubLObject _prev_bind_0_$1 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_GENL_MT, thread);
                mt_relevance_macros.$mt$.bind($$EnglishDocumentTaggingLexicalMt, thread);
                final SubLObject pred_var = $$stopWordString;
                if (NIL != kb_mapping_macros.do_predicate_extent_index_key_validator(pred_var)) {
                    final SubLObject str = NIL;
                    final SubLObject _prev_bind_0_$2 = $progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$3 = $progress_last_pacification_time$.currentBinding(thread);
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
                                    SubLObject done_var_$4 = NIL;
                                    final SubLObject token_var_$5 = NIL;
                                    while (NIL == done_var_$4) {
                                        final SubLObject ass = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$5);
                                        final SubLObject valid_$6 = makeBoolean(!token_var_$5.eql(ass));
                                        if (NIL != valid_$6) {
                                            methods.funcall_instance_method_with_1_args(denot_lex, ADD_STOP_WORD, cycl_utilities.formula_arg1(ass, UNPROVIDED));
                                        }
                                        done_var_$4 = makeBoolean(NIL == valid_$6);
                                    } 
                                } finally {
                                    final SubLObject _prev_bind_0_$3 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        $is_thread_performing_cleanupP$.bind(T, thread);
                                        final SubLObject _values = getValuesAsVector();
                                        if (NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        restoreValuesFromVector(_values);
                                    } finally {
                                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$3, thread);
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
                        $progress_last_pacification_time$.rebind(_prev_bind_1_$3, thread);
                        $progress_start_time$.rebind(_prev_bind_0_$2, thread);
                    }
                }
            } finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0_$1, thread);
            }
            SubLObject cdolist_list_var = list(denot_lex);
            SubLObject lex = NIL;
            lex = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                final SubLObject iterator = abstract_lexicon.new_lexicon_iterator(lex);
                while (NIL == iteration.iteration_done(iterator)) {
                    final SubLObject entry = iteration.iteration_next(iterator);
                    final SubLObject string = methods.funcall_instance_method_with_1_args(entry, GET, $STRING);
                    try {
                        thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                        final SubLObject _prev_bind_0_$4 = Errors.$error_handler$.currentBinding(thread);
                        try {
                            Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                            try {
                                if (string.isString()) {
                                    count = add(count, add_entry_to_dictionary(entry, lex, string_to_concepts, test_func));
                                } else {
                                    Errors.warn($str31$found__a_____a_in_the_lexicon, string, entry);
                                }
                                if (count.numGE(limit)) {
                                    Errors.error(over_limit_msg);
                                }
                                if (ZERO_INTEGER.numE(mod(count, $int$100))) {
                                    princ($str33$_, T);
                                    force_output(UNPROVIDED);
                                }
                            } catch (final Throwable catch_var) {
                                Errors.handleThrowable(catch_var, NIL);
                            }
                        } finally {
                            Errors.$error_handler$.rebind(_prev_bind_0_$4, thread);
                        }
                    } catch (final Throwable ccatch_env_var) {
                        msg = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                    } finally {
                        thread.throwStack.pop();
                    }
                    if ((NIL != msg) && (!msg.equal(over_limit_msg))) {
                        Errors.warn($str34$error_when_writing_out_lexicon_fo, string, msg);
                        msg = NIL;
                    }
                } 
                cdolist_list_var = cdolist_list_var.rest();
                lex = cdolist_list_var.first();
            } 
            if (NIL != include_stop_wordsP) {
                final SubLObject set_var = methods.funcall_instance_method_with_0_args(denot_lex, GET_STOP_WORDS);
                final SubLObject set_contents_var = set.do_set_internal(set_var);
                SubLObject basis_object;
                SubLObject state;
                SubLObject stop_word;
                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                    stop_word = set_contents.do_set_contents_next(basis_object, state);
                    if (NIL != set_contents.do_set_contents_element_validP(state, stop_word)) {
                        dictionary_utilities.dictionary_pushnew(string_to_concepts, stop_word, list($CYCL, $$stopWordString, $ENTRY_TYPE, $DENOT, $CASE_SENSITIVE, NIL), EQUAL, UNPROVIDED);
                    }
                }
            }
            dump_xml_string_to_concepts_dict(string_to_concepts, tmp_strings_to_ids, tmp_ids_to_concepts, $OUTPUT, UNPROVIDED);
            format(T, $str41$Copying_files_from_temporary_loca);
            if (NIL != Filesys.probe_file(strings_to_ids)) {
                Filesys.copy_file(strings_to_ids, cconcatenate(strings_to_ids, numeric_date_utilities.universal_timestring(Filesys.file_write_date(strings_to_ids))));
            }
            if (NIL != Filesys.probe_file(ids_to_concepts)) {
                Filesys.copy_file(ids_to_concepts, cconcatenate(ids_to_concepts, numeric_date_utilities.universal_timestring(Filesys.file_write_date(ids_to_concepts))));
            }
            Filesys.copy_file(tmp_strings_to_ids, strings_to_ids);
            Filesys.copy_file(tmp_ids_to_concepts, ids_to_concepts);
        } finally {
            $print_pretty$.rebind(_prev_bind_0, thread);
        }
        return list(strings_to_ids, ids_to_concepts);
    }

    public static SubLObject add_entry_to_dictionary(final SubLObject entry, final SubLObject lexicon, final SubLObject string_to_concepts, final SubLObject test_func) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject entry_count = ZERO_INTEGER;
        final SubLObject string = methods.funcall_instance_method_with_1_args(entry, GET, $STRING);
        if ((NIL == lexicon_accessors.closed_lexical_class_stringP(methods.funcall_instance_method_with_1_args(entry, GET, $STRING), UNPROVIDED)) && (NIL == thing_describable_as_lex_p(entry))) {
            final SubLObject case_sensitiveP = lexicon_accessors.closed_lexical_class_stringP(string, UNPROVIDED);
            thread.resetMultipleValues();
            final SubLObject cycl = get_dumping_entry_cycl(entry, lexicon);
            final SubLObject entry_type = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (NIL != funcall(test_func, cycl)) {
                SubLObject entry_info = list($CYCL, cycl, $ENTRY_TYPE, entry_type, $CASE_SENSITIVE, case_sensitiveP);
                if (NIL != contextually_dependent_entryP(entry)) {
                    entry_info = putf(entry_info, $ENTRY_STRENGTH, $CONTEXTDEPENDENT);
                } else
                    if (NIL != primary_entryP(entry)) {
                        entry_info = putf(entry_info, $ENTRY_STRENGTH, $PRIMARY);
                    } else
                        if (NIL != vanishingly_rare_entryP(entry)) {
                            entry_info = putf(entry_info, $ENTRY_STRENGTH, $VANISHINGLY_RARE);
                        }


                if (string.equalp($$$February)) {
                    format(T, $str47$adding__S___S, string, entry_info);
                }
                dictionary_utilities.dictionary_pushnew(string_to_concepts, string, entry_info, EQUAL, UNPROVIDED);
                entry_count = add(entry_count, ONE_INTEGER);
                if (NIL != list_utilities.lengthG(string_utilities.search_all($$$_, string, UNPROVIDED, UNPROVIDED), ONE_INTEGER, UNPROVIDED)) {
                    final SubLObject capitalized = string_utilities.capitalize_smart(string);
                    if (NIL == methods.funcall_instance_method_with_1_args(lexicon, GET, capitalized)) {
                        dictionary_utilities.dictionary_pushnew(string_to_concepts, string_utilities.capitalize_smart(string), entry_info, EQUAL, UNPROVIDED);
                        entry_count = add(entry_count, ONE_INTEGER);
                    }
                }
            }
        }
        if (entry_count.numE(ZERO_INTEGER)) {
            format(T, $str49$No_entries_added_for__S__, string);
        }
        return entry_count;
    }

    public static final SubLObject dump_string_to_concepts_dict_alt(SubLObject string_to_concepts, SubLObject file, SubLObject id_file, SubLObject direction, SubLObject concepts_to_ids) {
        if (direction == UNPROVIDED) {
            direction = $APPEND;
        }
        if (concepts_to_ids == UNPROVIDED) {
            concepts_to_ids = dictionary.new_dictionary(EQUAL, UNPROVIDED);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject newline_string = Strings.make_string(ONE_INTEGER, CHAR_newline);
                SubLObject stream = NIL;
                try {
                    stream = compatibility.open_text(file, direction, NIL);
                    if (!stream.isStream()) {
                        Errors.error($str_alt41$Unable_to_open__S, file);
                    }
                    {
                        SubLObject s = stream;
                        SubLObject so_far = ZERO_INTEGER;
                        SubLObject total = dictionary.dictionary_length(string_to_concepts);
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
                                noting_percent_progress_preamble($str_alt42$writing_strings_to_ids);
                                {
                                    SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(string_to_concepts));
                                    while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                        thread.resetMultipleValues();
                                        {
                                            SubLObject string = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                            SubLObject concepts = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            princ(string_utilities.string_subst($str_alt43$, newline_string, string, UNPROVIDED), s);
                                            princ(CHAR_tab, s);
                                            {
                                                SubLObject require_case_sensitivityP = lexicon_accessors.closed_lexical_class_stringP(string, UNPROVIDED);
                                                princ(require_case_sensitivityP, s);
                                            }
                                            {
                                                SubLObject cdolist_list_var = concepts;
                                                SubLObject concept = NIL;
                                                for (concept = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , concept = cdolist_list_var.first()) {
                                                    {
                                                        SubLObject hl_id = dictionary.dictionary_lookup(concepts_to_ids, concept, UNPROVIDED);
                                                        if (NIL == hl_id) {
                                                            hl_id = kb_utilities.compact_hl_external_id_string(concept);
                                                            dictionary.dictionary_enter(concepts_to_ids, concept, kb_utilities.compact_hl_external_id_string(concept));
                                                        }
                                                        princ(CHAR_tab, s);
                                                        princ(dictionary.dictionary_lookup(concepts_to_ids, concept, UNPROVIDED), s);
                                                    }
                                                }
                                            }
                                            terpri(s);
                                            so_far = add(so_far, ONE_INTEGER);
                                            note_percent_progress(so_far, total);
                                            iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                        }
                                    } 
                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
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
                {
                    SubLObject stream_7 = NIL;
                    try {
                        stream_7 = compatibility.open_text(id_file, direction, NIL);
                        if (!stream_7.isStream()) {
                            Errors.error($str_alt41$Unable_to_open__S, id_file);
                        }
                        {
                            SubLObject s = stream_7;
                            SubLObject so_far = ZERO_INTEGER;
                            SubLObject total = dictionary.dictionary_length(concepts_to_ids);
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
                                    noting_percent_progress_preamble($str_alt44$writing_ids_to_concepts);
                                    {
                                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(concepts_to_ids));
                                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject concept = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                SubLObject id = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                if (NIL == forts.fort_p(concept)) {
                                                    princ(id, s);
                                                    princ(CHAR_tab, s);
                                                    princ(string_utilities.to_string(concept), s);
                                                    terpri(s);
                                                }
                                                so_far = add(so_far, ONE_INTEGER);
                                                note_percent_progress(so_far, total);
                                                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                            }
                                        } 
                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
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
                    } finally {
                        {
                            SubLObject _prev_bind_0 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                if (stream_7.isStream()) {
                                    close(stream_7, UNPROVIDED);
                                }
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0, thread);
                            }
                        }
                    }
                }
            }
            return values(file, id_file);
        }
    }

    public static SubLObject dump_string_to_concepts_dict(final SubLObject string_to_concepts, final SubLObject file, final SubLObject id_file, SubLObject direction, SubLObject concepts_to_ids) {
        if (direction == UNPROVIDED) {
            direction = $APPEND;
        }
        if (concepts_to_ids == UNPROVIDED) {
            concepts_to_ids = dictionary.new_dictionary(EQUAL, UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject newline_string = Strings.make_string(ONE_INTEGER, CHAR_newline);
        SubLObject stream = NIL;
        try {
            stream = compatibility.open_text(file, direction);
            if (!stream.isStream()) {
                Errors.error($str51$Unable_to_open__S, file);
            }
            final SubLObject s = stream;
            SubLObject so_far = ZERO_INTEGER;
            final SubLObject total = dictionary.dictionary_length(string_to_concepts);
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
                    noting_percent_progress_preamble($str52$writing_strings_to_ids);
                    SubLObject iteration_state;
                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(string_to_concepts)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                        thread.resetMultipleValues();
                        final SubLObject string = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                        final SubLObject concepts = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        princ(string_utilities.string_subst($str53$, newline_string, string, UNPROVIDED), s);
                        princ(CHAR_tab, s);
                        final SubLObject require_case_sensitivityP = lexicon_accessors.closed_lexical_class_stringP(string, UNPROVIDED);
                        princ(require_case_sensitivityP, s);
                        SubLObject cdolist_list_var = concepts;
                        SubLObject concept = NIL;
                        concept = cdolist_list_var.first();
                        while (NIL != cdolist_list_var) {
                            SubLObject hl_id = dictionary.dictionary_lookup(concepts_to_ids, concept, UNPROVIDED);
                            if (NIL == hl_id) {
                                hl_id = kb_utilities.compact_hl_external_id_string(concept);
                                dictionary.dictionary_enter(concepts_to_ids, concept, kb_utilities.compact_hl_external_id_string(concept));
                            }
                            princ(CHAR_tab, s);
                            princ(dictionary.dictionary_lookup(concepts_to_ids, concept, UNPROVIDED), s);
                            cdolist_list_var = cdolist_list_var.rest();
                            concept = cdolist_list_var.first();
                        } 
                        terpri(s);
                        so_far = add(so_far, ONE_INTEGER);
                        note_percent_progress(so_far, total);
                    }
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                } finally {
                    final SubLObject _prev_bind_0_$9 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
                $last_percent_progress_index$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_5 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values2 = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values2);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
            }
        }
        SubLObject stream_$10 = NIL;
        try {
            stream_$10 = compatibility.open_text(id_file, direction);
            if (!stream_$10.isStream()) {
                Errors.error($str51$Unable_to_open__S, id_file);
            }
            final SubLObject s2 = stream_$10;
            SubLObject so_far2 = ZERO_INTEGER;
            final SubLObject total2 = dictionary.dictionary_length(concepts_to_ids);
            final SubLObject _prev_bind_6 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_9 = $percent_progress_start_time$.currentBinding(thread);
            try {
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($str54$writing_ids_to_concepts);
                    SubLObject iteration_state2;
                    for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(concepts_to_ids)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                        thread.resetMultipleValues();
                        final SubLObject concept2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                        final SubLObject id = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (NIL == forts.fort_p(concept2)) {
                            princ(id, s2);
                            princ(CHAR_tab, s2);
                            princ(string_utilities.to_string(concept2), s2);
                            terpri(s2);
                        }
                        so_far2 = add(so_far2, ONE_INTEGER);
                        note_percent_progress(so_far2, total2);
                    }
                    dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                } finally {
                    final SubLObject _prev_bind_0_$10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values3 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values3);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$10, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_9, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_8, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_7, thread);
                $last_percent_progress_index$.rebind(_prev_bind_6, thread);
            }
        } finally {
            final SubLObject _prev_bind_10 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values4 = getValuesAsVector();
                if (stream_$10.isStream()) {
                    close(stream_$10, UNPROVIDED);
                }
                restoreValuesFromVector(_values4);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_10, thread);
            }
        }
        return values(file, id_file);
    }

    public static final SubLObject get_dumping_entry_cycl_alt(SubLObject entry, SubLObject lexicon) {
        if (NIL != term_lexicon.term_lexicon_p(lexicon)) {
            return values(narts_high.nart_substitute(methods.funcall_instance_method_with_1_args(entry, GET, $DENOT)), $DENOT);
        } else {
            if (NIL != semtrans_lexicon.semtrans_lexicon_p(lexicon)) {
                return values(narts_high.nart_substitute(methods.funcall_instance_method_with_1_args(entry, GET, $SEMTRANS)), $SEMTRANS);
            }
        }
        return NIL;
    }

    public static SubLObject get_dumping_entry_cycl(final SubLObject entry, final SubLObject lexicon) {
        if (NIL != term_lexicon.term_lexicon_p(lexicon)) {
            return values(narts_high.nart_substitute(methods.funcall_instance_method_with_1_args(entry, GET, $DENOT)), $DENOT);
        }
        if (NIL != semtrans_lexicon.semtrans_lexicon_p(lexicon)) {
            return values(narts_high.nart_substitute(methods.funcall_instance_method_with_1_args(entry, GET, $SEMTRANS)), $SEMTRANS);
        }
        return NIL;
    }

    public static final SubLObject dump_xml_string_to_concepts_dict_alt(SubLObject string_to_concepts, SubLObject file, SubLObject id_file, SubLObject direction, SubLObject concepts_to_ids) {
        if (direction == UNPROVIDED) {
            direction = $APPEND;
        }
        if (concepts_to_ids == UNPROVIDED) {
            concepts_to_ids = dictionary.new_dictionary(EQUAL, UNPROVIDED);
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject lexicon_tag = $$$lexicon;
                if (direction == $OUTPUT) {
                    {
                        SubLObject stream = NIL;
                        try {
                            stream = compatibility.open_text(file, direction, NIL);
                            if (!stream.isStream()) {
                                Errors.error($str_alt41$Unable_to_open__S, file);
                            }
                            {
                                SubLObject s = stream;
                                {
                                    SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_stream$.bind(s, thread);
                                        {
                                            SubLObject _prev_bind_0_8 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                            SubLObject _prev_bind_1 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                            try {
                                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                                xml_utilities.xml_start_tag_internal(lexicon_tag, NIL, NIL);
                                                {
                                                    SubLObject so_far = ZERO_INTEGER;
                                                    SubLObject total = dictionary.dictionary_length(string_to_concepts);
                                                    {
                                                        SubLObject _prev_bind_0_9 = $last_percent_progress_index$.currentBinding(thread);
                                                        SubLObject _prev_bind_1_10 = $last_percent_progress_prediction$.currentBinding(thread);
                                                        SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                                                        SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                                        try {
                                                            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                                            $last_percent_progress_prediction$.bind(NIL, thread);
                                                            $within_noting_percent_progress$.bind(T, thread);
                                                            $percent_progress_start_time$.bind(get_universal_time(), thread);
                                                            noting_percent_progress_preamble($str_alt42$writing_strings_to_ids);
                                                            {
                                                                SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(string_to_concepts));
                                                                while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                                    thread.resetMultipleValues();
                                                                    {
                                                                        SubLObject string = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        SubLObject concepts = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        com.cyc.cycjava.cycl.nl.lexicon_dumping.xml_dump_lexicon_string_row(string, concepts, xml_vars.$xml_stream$.getDynamicValue(thread), concepts_to_ids);
                                                                        so_far = add(so_far, ONE_INTEGER);
                                                                        note_percent_progress(so_far, total);
                                                                        iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                                    }
                                                                } 
                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                            }
                                                            noting_percent_progress_postamble();
                                                        } finally {
                                                            $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                                            $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                                            $last_percent_progress_prediction$.rebind(_prev_bind_1_10, thread);
                                                            $last_percent_progress_index$.rebind(_prev_bind_0_9, thread);
                                                        }
                                                    }
                                                }
                                            } finally {
                                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1, thread);
                                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_8, thread);
                                            }
                                        }
                                        xml_utilities.xml_terpri();
                                        xml_utilities.xml_end_tag_internal(lexicon_tag);
                                    } finally {
                                        xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
                                    }
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
                } else {
                    os_process_utilities.wait_until_os_process_finished(os_process_utilities.make_os_process($$$Lexicon_Dump_XML_Clipper, $$$perl, list($str_alt49$_p, $str_alt50$_i, $str_alt51$_e, cconcatenate($str_alt52$_s____, new SubLObject[]{ format_nil.format_nil_a_no_copy(lexicon_tag), $str_alt53$____ }), file), UNPROVIDED, UNPROVIDED, UNPROVIDED));
                    {
                        SubLObject stream = NIL;
                        try {
                            stream = compatibility.open_text(file, direction, NIL);
                            if (!stream.isStream()) {
                                Errors.error($str_alt41$Unable_to_open__S, file);
                            }
                            {
                                SubLObject s = stream;
                                {
                                    SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
                                    try {
                                        xml_vars.$xml_stream$.bind(s, thread);
                                        {
                                            SubLObject so_far = ZERO_INTEGER;
                                            SubLObject total = dictionary.dictionary_length(string_to_concepts);
                                            {
                                                SubLObject _prev_bind_0_11 = $last_percent_progress_index$.currentBinding(thread);
                                                SubLObject _prev_bind_1 = $last_percent_progress_prediction$.currentBinding(thread);
                                                SubLObject _prev_bind_2 = $within_noting_percent_progress$.currentBinding(thread);
                                                SubLObject _prev_bind_3 = $percent_progress_start_time$.currentBinding(thread);
                                                try {
                                                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                                    $last_percent_progress_prediction$.bind(NIL, thread);
                                                    $within_noting_percent_progress$.bind(T, thread);
                                                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                                                    noting_percent_progress_preamble($str_alt42$writing_strings_to_ids);
                                                    {
                                                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(string_to_concepts));
                                                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                                            thread.resetMultipleValues();
                                                            {
                                                                SubLObject string = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                SubLObject concepts = thread.secondMultipleValue();
                                                                thread.resetMultipleValues();
                                                                com.cyc.cycjava.cycl.nl.lexicon_dumping.xml_dump_lexicon_string_row(string, concepts, xml_vars.$xml_stream$.getDynamicValue(thread), concepts_to_ids);
                                                                so_far = add(so_far, ONE_INTEGER);
                                                                note_percent_progress(so_far, total);
                                                                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                                            }
                                                        } 
                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                    }
                                                    noting_percent_progress_postamble();
                                                } finally {
                                                    $percent_progress_start_time$.rebind(_prev_bind_3, thread);
                                                    $within_noting_percent_progress$.rebind(_prev_bind_2, thread);
                                                    $last_percent_progress_prediction$.rebind(_prev_bind_1, thread);
                                                    $last_percent_progress_index$.rebind(_prev_bind_0_11, thread);
                                                }
                                            }
                                            xml_utilities.xml_end_tag_internal($$$lexicon);
                                            force_output(xml_vars.$xml_stream$.getDynamicValue(thread));
                                        }
                                    } finally {
                                        xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
                                    }
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
                }
                {
                    SubLObject stream = NIL;
                    try {
                        stream = compatibility.open_text(id_file, direction, NIL);
                        if (!stream.isStream()) {
                            Errors.error($str_alt41$Unable_to_open__S, id_file);
                        }
                        {
                            SubLObject s = stream;
                            SubLObject so_far = ZERO_INTEGER;
                            SubLObject total = dictionary.dictionary_length(concepts_to_ids);
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
                                    noting_percent_progress_preamble($str_alt44$writing_ids_to_concepts);
                                    {
                                        SubLObject iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(concepts_to_ids));
                                        while (NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state)) {
                                            thread.resetMultipleValues();
                                            {
                                                SubLObject concept = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                SubLObject id = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                if (NIL != forts.fort_p(concept)) {
                                                    princ(id, s);
                                                    princ(CHAR_tab, s);
                                                    princ(string_utilities.to_string(concept), s);
                                                    terpri(s);
                                                }
                                                so_far = add(so_far, ONE_INTEGER);
                                                note_percent_progress(so_far, total);
                                                iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state);
                                            }
                                        } 
                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
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
                Errors.warn($str_alt54$done_dumping___S__S__S, string_to_concepts, file, id_file);
                return values(file, id_file);
            }
        }
    }

    public static SubLObject dump_xml_string_to_concepts_dict(final SubLObject string_to_concepts, final SubLObject file, final SubLObject id_file, SubLObject direction, SubLObject concepts_to_ids) {
        if (direction == UNPROVIDED) {
            direction = $APPEND;
        }
        if (concepts_to_ids == UNPROVIDED) {
            concepts_to_ids = dictionary.new_dictionary(EQUAL, UNPROVIDED);
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject lexicon_tag = $$$lexicon;
        final SubLObject already_memory_mapped = nl_generation_fort_cache.nl_generation_cache_memory_mappedP();
        try {
            nl_generation_fort_cache.enable_nl_generation_cache_memory_mapping();
            if (direction == $OUTPUT) {
                SubLObject stream = NIL;
                try {
                    stream = compatibility.open_text(file, direction);
                    if (!stream.isStream()) {
                        Errors.error($str51$Unable_to_open__S, file);
                    }
                    SubLObject s = stream;
                    s = file_utilities.change_file_stream_buffer_size(s, file_utilities.$default_big_stream_buffer_size$.getDynamicValue(thread));
                    final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
                    try {
                        xml_vars.$xml_stream$.bind(s, thread);
                        try {
                            final SubLObject _prev_bind_0_$12 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal(lexicon_tag, NIL, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$13 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    SubLObject so_far = ZERO_INTEGER;
                                    final SubLObject total = dictionary.dictionary_length(string_to_concepts);
                                    final SubLObject _prev_bind_0_$14 = $last_percent_progress_index$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$15 = $last_percent_progress_prediction$.currentBinding(thread);
                                    final SubLObject _prev_bind_3 = $within_noting_percent_progress$.currentBinding(thread);
                                    final SubLObject _prev_bind_4 = $percent_progress_start_time$.currentBinding(thread);
                                    try {
                                        $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                        $last_percent_progress_prediction$.bind(NIL, thread);
                                        $within_noting_percent_progress$.bind(T, thread);
                                        $percent_progress_start_time$.bind(get_universal_time(), thread);
                                        try {
                                            noting_percent_progress_preamble($str52$writing_strings_to_ids);
                                            SubLObject iteration_state;
                                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(string_to_concepts)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                thread.resetMultipleValues();
                                                final SubLObject string = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                final SubLObject concepts = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                xml_dump_lexicon_string_row(string, concepts, xml_vars.$xml_stream$.getDynamicValue(thread), concepts_to_ids);
                                                so_far = add(so_far, ONE_INTEGER);
                                                note_percent_progress(so_far, total);
                                            }
                                            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                        } finally {
                                            final SubLObject _prev_bind_0_$15 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                final SubLObject _values = getValuesAsVector();
                                                noting_percent_progress_postamble();
                                                restoreValuesFromVector(_values);
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                                            }
                                        }
                                    } finally {
                                        $percent_progress_start_time$.rebind(_prev_bind_4, thread);
                                        $within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                                        $last_percent_progress_prediction$.rebind(_prev_bind_1_$15, thread);
                                        $last_percent_progress_index$.rebind(_prev_bind_0_$14, thread);
                                    }
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$13, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$12, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$16 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal(lexicon_tag);
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$16, thread);
                            }
                        }
                        force_output(s);
                    } finally {
                        xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_5 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values3 = getValuesAsVector();
                        if (stream.isStream()) {
                            close(stream, UNPROVIDED);
                        }
                        restoreValuesFromVector(_values3);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_5, thread);
                    }
                }
            } else {
                os_process_utilities.wait_until_os_process_finished(os_process_utilities.make_os_process($$$Lexicon_Dump_XML_Clipper, $$$perl, list($str60$_p, $str61$_i, $str62$_e, cconcatenate($str63$_s____, new SubLObject[]{ format_nil.format_nil_a_no_copy(lexicon_tag), $str64$____ }), file), UNPROVIDED, UNPROVIDED, UNPROVIDED));
                SubLObject stream = NIL;
                try {
                    final SubLObject _prev_bind_6 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                    try {
                        stream_macros.$stream_requires_locking$.bind(NIL, thread);
                        stream = compatibility.open_text(file, direction);
                    } finally {
                        stream_macros.$stream_requires_locking$.rebind(_prev_bind_6, thread);
                    }
                    if (!stream.isStream()) {
                        Errors.error($str51$Unable_to_open__S, file);
                    }
                    final SubLObject s = stream;
                    final SubLObject _prev_bind_0 = xml_vars.$xml_stream$.currentBinding(thread);
                    try {
                        xml_vars.$xml_stream$.bind(s, thread);
                        SubLObject so_far2 = ZERO_INTEGER;
                        final SubLObject total2 = dictionary.dictionary_length(string_to_concepts);
                        final SubLObject _prev_bind_0_$17 = $last_percent_progress_index$.currentBinding(thread);
                        final SubLObject _prev_bind_7 = $last_percent_progress_prediction$.currentBinding(thread);
                        final SubLObject _prev_bind_8 = $within_noting_percent_progress$.currentBinding(thread);
                        final SubLObject _prev_bind_9 = $percent_progress_start_time$.currentBinding(thread);
                        try {
                            $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                            $last_percent_progress_prediction$.bind(NIL, thread);
                            $within_noting_percent_progress$.bind(T, thread);
                            $percent_progress_start_time$.bind(get_universal_time(), thread);
                            try {
                                noting_percent_progress_preamble($str52$writing_strings_to_ids);
                                SubLObject iteration_state2;
                                for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(string_to_concepts)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                    thread.resetMultipleValues();
                                    final SubLObject string2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                    final SubLObject concepts2 = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    xml_dump_lexicon_string_row(string2, concepts2, xml_vars.$xml_stream$.getDynamicValue(thread), concepts_to_ids);
                                    so_far2 = add(so_far2, ONE_INTEGER);
                                    note_percent_progress(so_far2, total2);
                                }
                                dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                            } finally {
                                final SubLObject _prev_bind_0_$18 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                try {
                                    $is_thread_performing_cleanupP$.bind(T, thread);
                                    final SubLObject _values4 = getValuesAsVector();
                                    noting_percent_progress_postamble();
                                    restoreValuesFromVector(_values4);
                                } finally {
                                    $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$18, thread);
                                }
                            }
                        } finally {
                            $percent_progress_start_time$.rebind(_prev_bind_9, thread);
                            $within_noting_percent_progress$.rebind(_prev_bind_8, thread);
                            $last_percent_progress_prediction$.rebind(_prev_bind_7, thread);
                            $last_percent_progress_index$.rebind(_prev_bind_0_$17, thread);
                        }
                        xml_utilities.xml_end_tag_internal($$$lexicon);
                        force_output(s);
                    } finally {
                        xml_vars.$xml_stream$.rebind(_prev_bind_0, thread);
                    }
                } finally {
                    final SubLObject _prev_bind_10 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values5 = getValuesAsVector();
                        if (stream.isStream()) {
                            close(stream, UNPROVIDED);
                        }
                        restoreValuesFromVector(_values5);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_10, thread);
                    }
                }
            }
            SubLObject stream = NIL;
            try {
                stream = compatibility.open_text(id_file, direction);
                if (!stream.isStream()) {
                    Errors.error($str51$Unable_to_open__S, id_file);
                }
                SubLObject s = stream;
                s = file_utilities.change_file_stream_buffer_size(s, file_utilities.$default_big_stream_buffer_size$.getDynamicValue(thread));
                SubLObject so_far3 = ZERO_INTEGER;
                final SubLObject total3 = dictionary.dictionary_length(concepts_to_ids);
                final SubLObject _prev_bind_11 = $last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_12 = $last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_13 = $within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_14 = $percent_progress_start_time$.currentBinding(thread);
                try {
                    $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                    $last_percent_progress_prediction$.bind(NIL, thread);
                    $within_noting_percent_progress$.bind(T, thread);
                    $percent_progress_start_time$.bind(get_universal_time(), thread);
                    try {
                        noting_percent_progress_preamble($str54$writing_ids_to_concepts);
                        SubLObject iteration_state3;
                        for (iteration_state3 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(concepts_to_ids)); NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state3); iteration_state3 = dictionary_contents.do_dictionary_contents_next(iteration_state3)) {
                            thread.resetMultipleValues();
                            final SubLObject concept = dictionary_contents.do_dictionary_contents_key_value(iteration_state3);
                            final SubLObject id = thread.secondMultipleValue();
                            thread.resetMultipleValues();
                            if (NIL != forts.fort_p(concept)) {
                                princ(id, s);
                                princ(CHAR_tab, s);
                                princ(string_utilities.to_string(concept), s);
                                terpri(s);
                            }
                            so_far3 = add(so_far3, ONE_INTEGER);
                            note_percent_progress(so_far3, total3);
                        }
                        dictionary_contents.do_dictionary_contents_finalize(iteration_state3);
                    } finally {
                        final SubLObject _prev_bind_0_$19 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values6 = getValuesAsVector();
                            noting_percent_progress_postamble();
                            restoreValuesFromVector(_values6);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$19, thread);
                        }
                    }
                } finally {
                    $percent_progress_start_time$.rebind(_prev_bind_14, thread);
                    $within_noting_percent_progress$.rebind(_prev_bind_13, thread);
                    $last_percent_progress_prediction$.rebind(_prev_bind_12, thread);
                    $last_percent_progress_index$.rebind(_prev_bind_11, thread);
                }
                force_output(s);
            } finally {
                final SubLObject _prev_bind_15 = $is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    $is_thread_performing_cleanupP$.bind(T, thread);
                    final SubLObject _values7 = getValuesAsVector();
                    if (stream.isStream()) {
                        close(stream, UNPROVIDED);
                    }
                    restoreValuesFromVector(_values7);
                } finally {
                    $is_thread_performing_cleanupP$.rebind(_prev_bind_15, thread);
                }
            }
        } finally {
            final SubLObject _prev_bind_16 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values8 = getValuesAsVector();
                if (NIL == already_memory_mapped) {
                    nl_generation_fort_cache.disable_nl_generation_cache_memory_mapping();
                }
                restoreValuesFromVector(_values8);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_16, thread);
            }
        }
        Errors.warn($str65$done_dumping___S__S__S, string_to_concepts, file, id_file);
        return values(file, id_file);
    }

    public static final SubLObject dump_lexicon_string_row_alt(SubLObject string, SubLObject concepts, SubLObject stream, SubLObject concepts_to_ids_dict) {
        if (concepts_to_ids_dict == UNPROVIDED) {
            concepts_to_ids_dict = NIL;
        }
        princ(string_utilities.string_subst($str_alt43$, Strings.make_string(ONE_INTEGER, CHAR_newline), string, UNPROVIDED), stream);
        princ(CHAR_tab, stream);
        {
            SubLObject require_case_sensitivityP = lexicon_accessors.closed_lexical_class_stringP(string, UNPROVIDED);
            princ(require_case_sensitivityP, stream);
        }
        {
            SubLObject cdolist_list_var = concepts;
            SubLObject concept = NIL;
            for (concept = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , concept = cdolist_list_var.first()) {
                {
                    SubLObject hl_id = dictionary.dictionary_lookup(concepts_to_ids_dict, concept, UNPROVIDED);
                    if (!((NIL != hl_id) || (NIL == dictionary.dictionary_p(concepts_to_ids_dict)))) {
                        hl_id = kb_utilities.compact_hl_external_id_string(concept);
                        dictionary.dictionary_enter(concepts_to_ids_dict, concept, kb_utilities.compact_hl_external_id_string(concept));
                    }
                    princ(CHAR_tab, stream);
                    princ(dictionary.dictionary_lookup(concepts_to_ids_dict, concept, UNPROVIDED), stream);
                }
            }
        }
        terpri(stream);
        return NIL;
    }

    public static SubLObject dump_lexicon_string_row(final SubLObject string, final SubLObject concepts, final SubLObject stream, SubLObject concepts_to_ids_dict) {
        if (concepts_to_ids_dict == UNPROVIDED) {
            concepts_to_ids_dict = NIL;
        }
        princ(string_utilities.string_subst($str53$, Strings.make_string(ONE_INTEGER, CHAR_newline), string, UNPROVIDED), stream);
        princ(CHAR_tab, stream);
        final SubLObject require_case_sensitivityP = lexicon_accessors.closed_lexical_class_stringP(string, UNPROVIDED);
        princ(require_case_sensitivityP, stream);
        SubLObject cdolist_list_var = concepts;
        SubLObject concept = NIL;
        concept = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            SubLObject hl_id = dictionary.dictionary_lookup(concepts_to_ids_dict, concept, UNPROVIDED);
            if ((NIL == hl_id) && (NIL != dictionary.dictionary_p(concepts_to_ids_dict))) {
                hl_id = kb_utilities.compact_hl_external_id_string(concept);
                dictionary.dictionary_enter(concepts_to_ids_dict, concept, kb_utilities.compact_hl_external_id_string(concept));
            }
            princ(CHAR_tab, stream);
            princ(dictionary.dictionary_lookup(concepts_to_ids_dict, concept, UNPROVIDED), stream);
            cdolist_list_var = cdolist_list_var.rest();
            concept = cdolist_list_var.first();
        } 
        terpri(stream);
        return NIL;
    }

    public static final SubLObject xml_dump_lexicon_string_row_alt(SubLObject string, SubLObject concepts, SubLObject stream, SubLObject concepts_to_ids_dict) {
        if (concepts_to_ids_dict == UNPROVIDED) {
            concepts_to_ids_dict = NIL;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                SubLObject _prev_bind_1 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                try {
                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                    xml_utilities.xml_start_tag_internal($$$mapping, NIL, NIL);
                    {
                        SubLObject _prev_bind_0_12 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        SubLObject _prev_bind_1_13 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$nlString, NIL, NIL);
                            xml_utilities.xml_cdata(string);
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_13, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_12, thread);
                        }
                    }
                    xml_utilities.xml_terpri();
                    xml_utilities.xml_end_tag_internal($$$nlString);
                    {
                        SubLObject require_case_sensitivityP = lexicon_accessors.closed_lexical_class_stringP(string, UNPROVIDED);
                        SubLObject cdolist_list_var = concepts;
                        SubLObject concept = NIL;
                        for (concept = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , concept = cdolist_list_var.first()) {
                            {
                                SubLObject attr_list = list($$$caseSensitive, NIL != require_case_sensitivityP ? ((SubLObject) ($$$t)) : $$$f, $$$entryType, Strings.string_downcase(princ_to_string(getf(concept, $ENTRY_TYPE, UNPROVIDED)), UNPROVIDED, UNPROVIDED));
                                {
                                    SubLObject _prev_bind_0_14 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                    SubLObject _prev_bind_1_15 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                    try {
                                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                        xml_utilities.xml_start_tag_internal($$$entry, attr_list, NIL);
                                        xml_utilities.xml_terpri();
                                        com.cyc.cycjava.cycl.nl.lexicon_dumping.xml_output_concept(getf(concept, $CYCL, UNPROVIDED), $list_alt62);
                                    } finally {
                                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_15, thread);
                                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_14, thread);
                                    }
                                }
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$entry);
                            }
                        }
                    }
                } finally {
                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1, thread);
                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
                }
            }
            xml_utilities.xml_terpri();
            xml_utilities.xml_end_tag_internal($$$mapping);
            xml_utilities.xml_terpri();
            return NIL;
        }
    }

    public static SubLObject xml_dump_lexicon_string_row(final SubLObject string, final SubLObject concepts, final SubLObject stream, SubLObject concepts_to_ids_dict) {
        if (concepts_to_ids_dict == UNPROVIDED) {
            concepts_to_ids_dict = NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal($$$mapping, NIL, NIL, NIL, $UNINITIALIZED);
                final SubLObject _prev_bind_0_$21 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                    try {
                        final SubLObject _prev_bind_0_$22 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$23 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$nlString, NIL, NIL, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$23 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                xml_utilities.xml_cdata(string);
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$23, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$23, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$22, thread);
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$24 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            xml_utilities.xml_end_tag_internal($$$nlString);
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$24, thread);
                        }
                    }
                    final SubLObject require_case_sensitivityP = lexicon_accessors.closed_lexical_class_stringP(string, UNPROVIDED);
                    SubLObject cdolist_list_var = concepts;
                    SubLObject concept = NIL;
                    concept = cdolist_list_var.first();
                    while (NIL != cdolist_list_var) {
                        SubLObject attr_list = list($$$caseSensitive, NIL != require_case_sensitivityP ? $$$t : $$$f, $$$entryType, Strings.string_downcase(princ_to_string(getf(concept, $ENTRY_TYPE, UNPROVIDED)), UNPROVIDED, UNPROVIDED));
                        if (NIL != getf(concept, $ENTRY_STRENGTH, UNPROVIDED)) {
                            SubLObject new_cons = cons($$$mappingStrength, NIL);
                            SubLObject list = attr_list;
                            if (NIL != list) {
                                subl_macros.rplacd_last(list, new_cons);
                            } else {
                                attr_list = new_cons;
                            }
                            new_cons = cons(Strings.string_downcase(princ_to_string(getf(concept, $ENTRY_STRENGTH, UNPROVIDED)), UNPROVIDED, UNPROVIDED), NIL);
                            list = attr_list;
                            if (NIL != list) {
                                subl_macros.rplacd_last(list, new_cons);
                            } else {
                                attr_list = new_cons;
                            }
                        }
                        try {
                            final SubLObject _prev_bind_0_$25 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$24 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$entry, attr_list, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$26 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    xml_utilities.xml_terpri();
                                    xml_output_concept(getf(concept, $CYCL, UNPROVIDED), $list74);
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$26, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$24, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$25, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$27 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                xml_utilities.xml_terpri();
                                xml_utilities.xml_end_tag_internal($$$entry);
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$27, thread);
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        concept = cdolist_list_var.first();
                    } 
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
                final SubLObject _values3 = getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal($$$mapping);
                restoreValuesFromVector(_values3);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        xml_utilities.xml_terpri();
        return NIL;
    }

    public static final SubLObject contextually_dependent_entryP_alt(SubLObject entry) {
        return list_utilities.sublisp_boolean(find($const63$ContextuallyDependentLexicalMappi, methods.funcall_instance_method_with_1_args(entry, GET, $PRAGMATICS), EQ, FIRST, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject contextually_dependent_entryP(final SubLObject entry) {
        return list_utilities.sublisp_boolean(find($const75$ContextuallyDependentLexicalMappi, methods.funcall_instance_method_with_1_args(entry, GET, $PRAGMATICS), EQ, FIRST, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject vanishingly_rare_entryP(final SubLObject entry) {
        return list_utilities.sublisp_boolean(find($$VanishinglyRareLexicalMapping, methods.funcall_instance_method_with_1_args(entry, GET, $PRAGMATICS), EQ, FIRST, UNPROVIDED, UNPROVIDED));
    }

    public static SubLObject primary_entryP(final SubLObject entry) {
        return list_utilities.sublisp_boolean(find($$PrimaryLexicalMapping, methods.funcall_instance_method_with_1_args(entry, GET, $PRAGMATICS), EQ, FIRST, UNPROVIDED, UNPROVIDED));
    }

    public static final SubLObject xml_output_concept_alt(SubLObject concept, SubLObject optional_elts) {
        if (optional_elts == UNPROVIDED) {
            optional_elts = $list_alt66;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject props = list($$$uri, NIL != forts.fort_p(concept) ? ((SubLObject) (owl_cycl_to_xml.owl_opencyc_latest_uri_for_fort(concept))) : $$$nat);
                SubLObject hl_id = kb_utilities.compact_hl_external_id_string(concept);
                {
                    SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                    SubLObject _prev_bind_1 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                    try {
                        xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                        xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                        xml_utilities.xml_start_tag_internal($$$concept, props, NIL);
                        if (NIL != subl_promotions.memberP($EXTERNAL_ID, optional_elts, UNPROVIDED, UNPROVIDED)) {
                            xml_utilities.xml_terpri();
                            {
                                SubLObject _prev_bind_0_16 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                SubLObject _prev_bind_1_17 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$externalId, list($$$id, hl_id), T);
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_17, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_16, thread);
                                }
                            }
                        }
                        if (NIL != subl_promotions.memberP($PREFERRED_NL, optional_elts, UNPROVIDED, UNPROVIDED)) {
                            xml_utilities.xml_terpri();
                            {
                                SubLObject _prev_bind_0_18 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                SubLObject _prev_bind_1_19 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$preferredNl, $list_alt75, NIL);
                                    {
                                        SubLObject params = nl_generation_api.new_pph_parameters(list($PPH_LEXICAL_CONTEXT, $$TextPrismParaphraseMt));
                                        xml_utilities.xml_cdata(nl_generation_api.cycl_term_to_nl_string_internal(concept, params).first());
                                    }
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_19, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_18, thread);
                                }
                            }
                            xml_utilities.xml_end_tag_internal($$$preferredNl);
                        }
                        if (NIL != subl_promotions.memberP($CYCL, optional_elts, UNPROVIDED, UNPROVIDED)) {
                            xml_utilities.xml_terpri();
                            {
                                SubLObject _prev_bind_0_20 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                                SubLObject _prev_bind_1_21 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                                try {
                                    xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                    xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                    xml_utilities.xml_start_tag_internal($$$cycl, $list_alt79, NIL);
                                    xml_utilities.xml_print(com.cyc.cycjava.cycl.nl.lexicon_dumping.denotational_term_name(concept), UNPROVIDED);
                                } finally {
                                    xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_21, thread);
                                    xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_20, thread);
                                }
                            }
                            xml_utilities.xml_end_tag_internal($$$cycl);
                        }
                    } finally {
                        xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1, thread);
                        xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
                    }
                }
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal($$$concept);
            }
            return NIL;
        }
    }

    public static SubLObject xml_output_concept(final SubLObject concept, SubLObject optional_elts) {
        if (optional_elts == UNPROVIDED) {
            optional_elts = $list80;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject props = list($$$uri, NIL != forts.fort_p(concept) ? owl_cycl_to_xml.owl_opencyc_latest_uri_for_fort(concept) : $$$nat);
        final SubLObject hl_id = kb_utilities.compact_hl_external_id_string(concept);
        try {
            final SubLObject _prev_bind_0 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
            final SubLObject _prev_bind_2 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
            try {
                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                xml_utilities.xml_start_tag_internal($$$concept, props, NIL, NIL, $UNINITIALIZED);
                final SubLObject _prev_bind_0_$30 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                try {
                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                    if (NIL != subl_promotions.memberP($EXTERNAL_ID, optional_elts, UNPROVIDED, UNPROVIDED)) {
                        xml_utilities.xml_terpri();
                        final SubLObject _prev_bind_0_$31 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                        final SubLObject _prev_bind_1_$32 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                        try {
                            xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                            xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                            xml_utilities.xml_start_tag_internal($$$externalId, list($$$id, hl_id), T, NIL, $UNINITIALIZED);
                            final SubLObject _prev_bind_0_$32 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                            try {
                                xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                            } finally {
                                xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$32, thread);
                            }
                        } finally {
                            xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$32, thread);
                            xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$31, thread);
                        }
                    }
                    if (NIL != subl_promotions.memberP($PREFERRED_NL, optional_elts, UNPROVIDED, UNPROVIDED)) {
                        xml_utilities.xml_terpri();
                        try {
                            final SubLObject _prev_bind_0_$33 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$33 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$preferredNl, $list89, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$34 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    final SubLObject params = nl_generation_api.new_pph_parameters(list($PPH_LEXICAL_CONTEXT, $$TextPrismParaphraseMt));
                                    xml_utilities.xml_cdata(nl_generation_api.cycl_term_to_nl_string_internal(concept, params).first());
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$34, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$33, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$33, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$35 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values = getValuesAsVector();
                                xml_utilities.xml_end_tag_internal($$$preferredNl);
                                restoreValuesFromVector(_values);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$35, thread);
                            }
                        }
                    }
                    if (NIL != subl_promotions.memberP($CYCL, optional_elts, UNPROVIDED, UNPROVIDED)) {
                        xml_utilities.xml_terpri();
                        try {
                            final SubLObject _prev_bind_0_$36 = xml_utilities.$xml_indentation_level$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$34 = xml_utilities.$cycml_indent_level$.currentBinding(thread);
                            try {
                                xml_utilities.$xml_indentation_level$.bind(add(xml_utilities.$xml_indentation_amount$.getDynamicValue(thread), xml_utilities.$xml_indentation_level$.getDynamicValue(thread)), thread);
                                xml_utilities.$cycml_indent_level$.bind(xml_utilities.$xml_indentation_level$.getDynamicValue(thread), thread);
                                xml_utilities.xml_start_tag_internal($$$cycl, $list93, NIL, NIL, $UNINITIALIZED);
                                final SubLObject _prev_bind_0_$37 = xml_vars.$xml_default_namespace$.currentBinding(thread);
                                try {
                                    xml_vars.$xml_default_namespace$.bind($UNINITIALIZED, thread);
                                    xml_utilities.xml_print(cycl_utilities.denotational_term_name(concept), UNPROVIDED);
                                } finally {
                                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$37, thread);
                                }
                            } finally {
                                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_1_$34, thread);
                                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0_$36, thread);
                            }
                        } finally {
                            final SubLObject _prev_bind_0_$38 = $is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                $is_thread_performing_cleanupP$.bind(T, thread);
                                final SubLObject _values2 = getValuesAsVector();
                                xml_utilities.xml_end_tag_internal($$$cycl);
                                restoreValuesFromVector(_values2);
                            } finally {
                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$38, thread);
                            }
                        }
                    }
                } finally {
                    xml_vars.$xml_default_namespace$.rebind(_prev_bind_0_$30, thread);
                }
            } finally {
                xml_utilities.$cycml_indent_level$.rebind(_prev_bind_2, thread);
                xml_utilities.$xml_indentation_level$.rebind(_prev_bind_0, thread);
            }
        } finally {
            final SubLObject _prev_bind_3 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values3 = getValuesAsVector();
                xml_utilities.xml_terpri();
                xml_utilities.xml_end_tag_internal($$$concept);
                restoreValuesFromVector(_values3);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_3, thread);
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @return t if LEX is a #$ThingDescribableAsFn lex entry, nil otherwise
     */
    @LispMethod(comment = "@return t if LEX is a #$ThingDescribableAsFn lex entry, nil otherwise")
    public static final SubLObject thing_describable_as_lex_p_alt(SubLObject lex) {
        return eql(cycl_utilities.formula_operator(methods.funcall_instance_method_with_1_args(lex, GET, $DENOT)), $$ThingDescribableAsFn);
    }

    /**
     *
     *
     * @return t if LEX is a #$ThingDescribableAsFn lex entry, nil otherwise
     */
    @LispMethod(comment = "@return t if LEX is a #$ThingDescribableAsFn lex entry, nil otherwise")
    public static SubLObject thing_describable_as_lex_p(final SubLObject lex) {
        return eql(cycl_utilities.formula_operator(methods.funcall_instance_method_with_1_args(lex, GET, $DENOT)), $$ThingDescribableAsFn);
    }

    public static final SubLObject dump_isa_genls_alt(SubLObject input_file, SubLObject output_file) {
        if (input_file == UNPROVIDED) {
            input_file = $str_alt82$_cyc_projects_concept_search_shor;
        }
        if (output_file == UNPROVIDED) {
            output_file = $str_alt83$_cyc_projects_concept_search_shor;
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject stream = NIL;
                try {
                    {
                        SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream = compatibility.open_text(output_file, $OUTPUT, NIL);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
                        }
                    }
                    if (!stream.isStream()) {
                        Errors.error($str_alt41$Unable_to_open__S, output_file);
                    }
                    {
                        SubLObject s = stream;
                        SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
                        {
                            SubLObject _prev_bind_0 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
                            SubLObject _prev_bind_1 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
                            SubLObject _prev_bind_2 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
                            SubLObject _prev_bind_3 = $last_percent_progress_index$.currentBinding(thread);
                            SubLObject _prev_bind_4 = $last_percent_progress_prediction$.currentBinding(thread);
                            SubLObject _prev_bind_5 = $within_noting_percent_progress$.currentBinding(thread);
                            SubLObject _prev_bind_6 = $percent_progress_start_time$.currentBinding(thread);
                            try {
                                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
                                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                                $last_percent_progress_prediction$.bind(NIL, thread);
                                $within_noting_percent_progress$.bind(T, thread);
                                $percent_progress_start_time$.bind(get_universal_time(), thread);
                                noting_percent_progress_preamble($str_alt84$reading_the_file___);
                                {
                                    SubLObject file_var = input_file;
                                    SubLObject stream_22 = NIL;
                                    try {
                                        {
                                            SubLObject _prev_bind_0_23 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                                            try {
                                                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                                                stream_22 = compatibility.open_text(file_var, $INPUT, NIL);
                                            } finally {
                                                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_23, thread);
                                            }
                                        }
                                        if (!stream_22.isStream()) {
                                            Errors.error($str_alt41$Unable_to_open__S, file_var);
                                        }
                                        {
                                            SubLObject stream_var = stream_22;
                                            if (stream_var.isStream()) {
                                                {
                                                    SubLObject length_var = file_length(stream_var);
                                                    SubLObject stream_var_24 = stream_var;
                                                    SubLObject line_number_var = NIL;
                                                    SubLObject line = NIL;
                                                    for (line_number_var = ZERO_INTEGER, line = read_line(stream_var_24, NIL, NIL, UNPROVIDED); NIL != line; line_number_var = number_utilities.f_1X(line_number_var) , line = read_line(stream_var_24, NIL, NIL, UNPROVIDED)) {
                                                        {
                                                            SubLObject term_id = Strings.string_trim($list_alt86, string_utilities.string_tokenize(line, list(CHAR_tab), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED).first());
                                                            SubLObject cycl_term = kb_utilities.find_object_by_compact_hl_external_id_string(term_id);
                                                            com.cyc.cycjava.cycl.nl.lexicon_dumping.write_one_complete_fort_record_compactly(cycl_term, s, $$EverythingPSC, term_id);
                                                        }
                                                        note_percent_progress(file_position(stream_var, UNPROVIDED), length_var);
                                                    }
                                                }
                                            }
                                        }
                                    } finally {
                                        {
                                            SubLObject _prev_bind_0_25 = $is_thread_performing_cleanupP$.currentBinding(thread);
                                            try {
                                                $is_thread_performing_cleanupP$.bind(T, thread);
                                                if (stream_22.isStream()) {
                                                    close(stream_22, UNPROVIDED);
                                                }
                                            } finally {
                                                $is_thread_performing_cleanupP$.rebind(_prev_bind_0_25, thread);
                                            }
                                        }
                                    }
                                }
                                noting_percent_progress_postamble();
                            } finally {
                                $percent_progress_start_time$.rebind(_prev_bind_6, thread);
                                $within_noting_percent_progress$.rebind(_prev_bind_5, thread);
                                $last_percent_progress_prediction$.rebind(_prev_bind_4, thread);
                                $last_percent_progress_index$.rebind(_prev_bind_3, thread);
                                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_2, thread);
                                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_1, thread);
                                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0, thread);
                            }
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
            return output_file;
        }
    }

    public static SubLObject dump_isa_genls(SubLObject input_file, SubLObject output_file) {
        if (input_file == UNPROVIDED) {
            input_file = $str95$_cyc_projects_concept_search_shor;
        }
        if (output_file == UNPROVIDED) {
            output_file = $str96$_cyc_projects_concept_search_shor;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stream = NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind(NIL, thread);
                stream = compatibility.open_text(output_file, $OUTPUT);
            } finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error($str51$Unable_to_open__S, output_file);
            }
            final SubLObject s = stream;
            final SubLObject already_resourcing_p = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.getDynamicValue(thread);
            final SubLObject _prev_bind_2 = sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.currentBinding(thread);
            final SubLObject _prev_bind_3 = sbhl_marking_vars.$resourced_sbhl_marking_spaces$.currentBinding(thread);
            final SubLObject _prev_bind_4 = sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.currentBinding(thread);
            final SubLObject _prev_bind_5 = $last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_6 = $last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_7 = $within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_8 = $percent_progress_start_time$.currentBinding(thread);
            try {
                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, SIX_INTEGER), thread);
                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind(T, thread);
                $last_percent_progress_index$.bind(ZERO_INTEGER, thread);
                $last_percent_progress_prediction$.bind(NIL, thread);
                $within_noting_percent_progress$.bind(T, thread);
                $percent_progress_start_time$.bind(get_universal_time(), thread);
                try {
                    noting_percent_progress_preamble($str97$reading_the_file___);
                    final SubLObject file_var = input_file;
                    SubLObject stream_$42 = NIL;
                    try {
                        final SubLObject _prev_bind_0_$43 = stream_macros.$stream_requires_locking$.currentBinding(thread);
                        try {
                            stream_macros.$stream_requires_locking$.bind(NIL, thread);
                            stream_$42 = compatibility.open_text(file_var, $INPUT);
                        } finally {
                            stream_macros.$stream_requires_locking$.rebind(_prev_bind_0_$43, thread);
                        }
                        if (!stream_$42.isStream()) {
                            Errors.error($str51$Unable_to_open__S, file_var);
                        }
                        final SubLObject stream_var = stream_$42;
                        if (stream_var.isStream()) {
                            final SubLObject length_var = file_length(stream_var);
                            final SubLObject stream_var_$44 = stream_var;
                            SubLObject line_number_var = NIL;
                            SubLObject line = NIL;
                            line_number_var = ZERO_INTEGER;
                            for (line = file_utilities.do_stream_lines_get_next_line(stream_var_$44); NIL != line; line = file_utilities.do_stream_lines_get_next_line(stream_var_$44)) {
                                final SubLObject term_id = Strings.string_trim($list99, string_utilities.string_tokenize(line, list(CHAR_tab), UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED).first());
                                final SubLObject cycl_term = kb_utilities.find_object_by_compact_hl_external_id_string(term_id);
                                write_one_complete_fort_record_compactly(cycl_term, s, $$EverythingPSC, term_id);
                                note_percent_progress(file_position(stream_var, UNPROVIDED), length_var);
                                line_number_var = number_utilities.f_1X(line_number_var);
                            }
                        }
                    } finally {
                        final SubLObject _prev_bind_0_$44 = $is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            $is_thread_performing_cleanupP$.bind(T, thread);
                            final SubLObject _values = getValuesAsVector();
                            if (stream_$42.isStream()) {
                                close(stream_$42, UNPROVIDED);
                            }
                            restoreValuesFromVector(_values);
                        } finally {
                            $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$44, thread);
                        }
                    }
                } finally {
                    final SubLObject _prev_bind_0_$45 = $is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        $is_thread_performing_cleanupP$.bind(T, thread);
                        final SubLObject _values2 = getValuesAsVector();
                        noting_percent_progress_postamble();
                        restoreValuesFromVector(_values2);
                    } finally {
                        $is_thread_performing_cleanupP$.rebind(_prev_bind_0_$45, thread);
                    }
                }
            } finally {
                $percent_progress_start_time$.rebind(_prev_bind_8, thread);
                $within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                $last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                $last_percent_progress_index$.rebind(_prev_bind_5, thread);
                sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_4, thread);
                sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_3, thread);
                sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_2, thread);
            }
        } finally {
            final SubLObject _prev_bind_9 = $is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                $is_thread_performing_cleanupP$.bind(T, thread);
                final SubLObject _values3 = getValuesAsVector();
                if (stream.isStream()) {
                    close(stream, UNPROVIDED);
                }
                restoreValuesFromVector(_values3);
            } finally {
                $is_thread_performing_cleanupP$.rebind(_prev_bind_9, thread);
            }
        }
        return output_file;
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(new SubLObject[]{ reader_make_constant_shell("abbreviationForLexicalWord"), reader_make_constant_shell("abbreviationString-PN"), reader_make_constant_shell("airportHasIATACode"), reader_make_constant_shell("atomicSymbol"), reader_make_constant_shell("chemicalFormulaString"), reader_make_constant_shell("countryCodeDigraph"), reader_make_constant_shell("countryCodeTrigraph"), reader_make_constant_shell("currencyCode"), reader_make_constant_shell("geopoliticalEntityCodeDigraph"), reader_make_constant_shell("internetCountryCode") });

    static private final SubLList $list_alt6 = list(reader_make_constant_shell("Adjective"), reader_make_constant_shell("Preposition"), reader_make_constant_shell("Adverb"));

    static private final SubLString $str_alt9$_cyc_projects_concept_search_stri = makeString("/cyc/projects/concept-search/strings-to-short-ids.xml");

    static private final SubLString $str_alt10$_cyc_projects_concept_search_shor = makeString("/cyc/projects/concept-search/short-ids-to-concepts-test.tsv");

    static private final SubLString $str_alt12$strings_to_short_ids_tsv = makeString("strings-to-short-ids.tsv");

    static private final SubLString $str_alt13$short_ids_to_concepts_tsv = makeString("short-ids-to-concepts.tsv");

    static private final SubLString $str_alt26$_ = makeString(".");

    static private final SubLString $str_alt27$_ = makeString(" ");

    static private final SubLString $str_alt28$found__a_____a_in_the_lexicon = makeString("found ~a -> ~a in the lexicon");

    static private final SubLString $str_alt29$error_when_writing_out_lexicon___ = makeString("error when writing out lexicon: ~S");

    static private final SubLString $str_alt33$Copying_files_from_temporary_loca = makeString("Copying files from temporary locations");

    static private final SubLString $str_alt34$_cyc_projects_opencyc_tagging_lex = makeString("/cyc/projects/opencyc/tagging-lexicon/");

    static private final SubLString $str_alt35$strings_to_short_ids_ = makeString("strings-to-short-ids-");

    static private final SubLString $str_alt36$_xml = makeString(".xml");

    static private final SubLString $str_alt37$short_ids_to_concepts_ = makeString("short-ids-to-concepts-");

    static private final SubLString $str_alt38$_tsv = makeString(".tsv");

    static private final SubLSymbol $sym39$FORT_HAS_EXPORTED_OWL_OPENCYC_CONTENT_ = makeSymbol("FORT-HAS-EXPORTED-OWL-OPENCYC-CONTENT?");

    static private final SubLString $str_alt41$Unable_to_open__S = makeString("Unable to open ~S");

    static private final SubLString $str_alt42$writing_strings_to_ids = makeString("writing strings-to-ids");

    static private final SubLString $str_alt44$writing_ids_to_concepts = makeString("writing ids-to-concepts");

    static private final SubLString $str_alt49$_p = makeString("-p");

    static private final SubLString $str_alt50$_i = makeString("-i");

    static private final SubLString $str_alt51$_e = makeString("-e");

    static private final SubLString $str_alt52$_s____ = makeString("\'s/<\\/");

    static private final SubLString $str_alt53$____ = makeString(">//'");

    static private final SubLString $str_alt54$done_dumping___S__S__S = makeString("done dumping: ~S ~S ~S");

    /**
     *
     */
    public static final SubLObject write_one_complete_fort_record_compactly_alt(SubLObject cycl_term, SubLObject stream, SubLObject mt, SubLObject term_id) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        if (mt == UNPROVIDED) {
            mt = $$EverythingPSC;
        }
        if (term_id == UNPROVIDED) {
            term_id = kb_utilities.compact_hl_external_id_string(cycl_term);
        }
        {
            SubLObject all_genls = (NIL != forts.fort_p(cycl_term)) ? ((SubLObject) (genls.all_genls(cycl_term, mt, UNPROVIDED))) : NIL;
            SubLObject all_isa = (NIL != forts.fort_p(cycl_term)) ? ((SubLObject) (isa.all_isa(cycl_term, mt, UNPROVIDED))) : NIL;
            SubLObject string_for_term = term_id;
            princ(string_for_term, stream);
            {
                SubLObject cdolist_list_var = all_genls;
                SubLObject genl = NIL;
                for (genl = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , genl = cdolist_list_var.first()) {
                    com.cyc.cycjava.cycl.nl.lexicon_dumping.write_one_fort_compactly(genl, $str_alt88$g_, stream);
                }
            }
            {
                SubLObject cdolist_list_var = all_isa;
                SubLObject v_isa = NIL;
                for (v_isa = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_isa = cdolist_list_var.first()) {
                    com.cyc.cycjava.cycl.nl.lexicon_dumping.write_one_fort_compactly(v_isa, $str_alt89$i_, stream);
                }
            }
            terpri(stream);
        }
        return cycl_term;
    }

    public static SubLObject write_one_complete_fort_record_compactly(final SubLObject cycl_term, SubLObject stream, SubLObject mt, SubLObject term_id) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        if (mt == UNPROVIDED) {
            mt = $$EverythingPSC;
        }
        if (term_id == UNPROVIDED) {
            term_id = kb_utilities.compact_hl_external_id_string(cycl_term);
        }
        final SubLObject all_genls = (NIL != forts.fort_p(cycl_term)) ? genls.all_genls(cycl_term, mt, UNPROVIDED) : NIL;
        final SubLObject all_isa = (NIL != forts.fort_p(cycl_term)) ? isa.all_isa(cycl_term, mt, UNPROVIDED) : NIL;
        final SubLObject string_for_term = term_id;
        princ(string_for_term, stream);
        SubLObject cdolist_list_var = all_genls;
        SubLObject genl = NIL;
        genl = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            write_one_fort_compactly(genl, $str101$g_, stream);
            cdolist_list_var = cdolist_list_var.rest();
            genl = cdolist_list_var.first();
        } 
        cdolist_list_var = all_isa;
        SubLObject v_isa = NIL;
        v_isa = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            write_one_fort_compactly(v_isa, $str102$i_, stream);
            cdolist_list_var = cdolist_list_var.rest();
            v_isa = cdolist_list_var.first();
        } 
        terpri(stream);
        return cycl_term;
    }

    static private final SubLList $list_alt62 = list(makeKeyword("EXTERNAL-ID"));

    public static final SubLObject $const63$ContextuallyDependentLexicalMappi = reader_make_constant_shell("ContextuallyDependentLexicalMapping");

    static private final SubLList $list_alt66 = list(makeKeyword("EXTERNAL-ID"), $CYCL, makeKeyword("PREFERRED-NL"));

    static private final SubLList $list_alt75 = list(makeString("xml:lang"), makeString("en"));

    static private final SubLList $list_alt79 = list(makeString("xml:lang"), makeString("x-cycl-en-us"));

    static private final SubLString $str_alt80$__ = makeString("#$");

    public static final SubLObject write_one_fort_compactly_alt(SubLObject fort, SubLObject link_indicator, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        princ($lexicon_file_record_separator$.getGlobalValue(), stream);
        princ(link_indicator, stream);
        princ(kb_utilities.compact_hl_external_id_string(fort), stream);
        return fort;
    }

    public static SubLObject write_one_fort_compactly(final SubLObject fort, final SubLObject link_indicator, SubLObject stream) {
        if (stream == UNPROVIDED) {
            stream = T;
        }
        princ($lexicon_file_record_separator$.getGlobalValue(), stream);
        princ(link_indicator, stream);
        princ(kb_utilities.compact_hl_external_id_string(fort), stream);
        return fort;
    }

    static private final SubLString $str_alt82$_cyc_projects_concept_search_shor = makeString("/cyc/projects/concept-search/short-ids-to-concepts.tsv");

    static private final SubLString $str_alt83$_cyc_projects_concept_search_shor = makeString("/cyc/projects/concept-search/short-ids-to-isa-genls.tsv");

    public static final SubLObject declare_lexicon_dumping_file_alt() {
        declareFunction("get_dumping_lexicon", "GET-DUMPING-LEXICON", 0, 0, false);
        declareFunction("get_dumping_semtrans_lexicon", "GET-DUMPING-SEMTRANS-LEXICON", 0, 0, false);
        declareFunction("dump_xml_lexicon", "DUMP-XML-LEXICON", 0, 4, false);
        declareFunction("dump_opencyc_lexicon", "DUMP-OPENCYC-LEXICON", 0, 1, false);
        declareFunction("dump_string_to_concepts_dict", "DUMP-STRING-TO-CONCEPTS-DICT", 3, 2, false);
        declareFunction("get_dumping_entry_cycl", "GET-DUMPING-ENTRY-CYCL", 2, 0, false);
        declareFunction("dump_xml_string_to_concepts_dict", "DUMP-XML-STRING-TO-CONCEPTS-DICT", 3, 2, false);
        declareFunction("dump_lexicon_string_row", "DUMP-LEXICON-STRING-ROW", 3, 1, false);
        declareFunction("xml_dump_lexicon_string_row", "XML-DUMP-LEXICON-STRING-ROW", 3, 1, false);
        declareFunction("contextually_dependent_entryP", "CONTEXTUALLY-DEPENDENT-ENTRY?", 1, 0, false);
        declareFunction("xml_output_concept", "XML-OUTPUT-CONCEPT", 1, 1, false);
        declareFunction("denotational_term_name", "DENOTATIONAL-TERM-NAME", 1, 0, false);
        declareFunction("thing_describable_as_lex_p", "THING-DESCRIBABLE-AS-LEX-P", 1, 0, false);
        declareFunction("dump_isa_genls", "DUMP-ISA-GENLS", 0, 2, false);
        declareFunction("write_one_complete_fort_record_compactly", "WRITE-ONE-COMPLETE-FORT-RECORD-COMPACTLY", 1, 3, false);
        declareFunction("write_one_fort_compactly", "WRITE-ONE-FORT-COMPACTLY", 2, 1, false);
        return NIL;
    }

    public static SubLObject declare_lexicon_dumping_file() {
        if (SubLFiles.USE_V1) {
            declareFunction("get_dumping_lexicon", "GET-DUMPING-LEXICON", 0, 0, false);
            declareFunction("get_dumping_semtrans_lexicon", "GET-DUMPING-SEMTRANS-LEXICON", 0, 0, false);
            declareFunction("dump_opencyc_lexicon", "DUMP-OPENCYC-LEXICON", 0, 1, false);
            declareFunction("dump_full_lexicon", "DUMP-FULL-LEXICON", 0, 1, false);
            declareFunction("dump_and_link_lexicon", "DUMP-AND-LINK-LEXICON", 2, 0, false);
            declareFunction("fort_should_be_in_lexiconP", "FORT-SHOULD-BE-IN-LEXICON?", 1, 0, false);
            declareFunction("dump_xml_lexicon", "DUMP-XML-LEXICON", 0, 4, false);
            declareFunction("add_entry_to_dictionary", "ADD-ENTRY-TO-DICTIONARY", 4, 0, false);
            declareFunction("dump_string_to_concepts_dict", "DUMP-STRING-TO-CONCEPTS-DICT", 3, 2, false);
            declareFunction("get_dumping_entry_cycl", "GET-DUMPING-ENTRY-CYCL", 2, 0, false);
            declareFunction("dump_xml_string_to_concepts_dict", "DUMP-XML-STRING-TO-CONCEPTS-DICT", 3, 2, false);
            declareFunction("dump_lexicon_string_row", "DUMP-LEXICON-STRING-ROW", 3, 1, false);
            declareFunction("xml_dump_lexicon_string_row", "XML-DUMP-LEXICON-STRING-ROW", 3, 1, false);
            declareFunction("contextually_dependent_entryP", "CONTEXTUALLY-DEPENDENT-ENTRY?", 1, 0, false);
            declareFunction("vanishingly_rare_entryP", "VANISHINGLY-RARE-ENTRY?", 1, 0, false);
            declareFunction("primary_entryP", "PRIMARY-ENTRY?", 1, 0, false);
            declareFunction("xml_output_concept", "XML-OUTPUT-CONCEPT", 1, 1, false);
            declareFunction("thing_describable_as_lex_p", "THING-DESCRIBABLE-AS-LEX-P", 1, 0, false);
            declareFunction("dump_isa_genls", "DUMP-ISA-GENLS", 0, 2, false);
            declareFunction("write_one_complete_fort_record_compactly", "WRITE-ONE-COMPLETE-FORT-RECORD-COMPACTLY", 1, 3, false);
            declareFunction("write_one_fort_compactly", "WRITE-ONE-FORT-COMPACTLY", 2, 1, false);
        }
        if (SubLFiles.USE_V2) {
            declareFunction("denotational_term_name", "DENOTATIONAL-TERM-NAME", 1, 0, false);
        }
        return NIL;
    }

    public static SubLObject declare_lexicon_dumping_file_Previous() {
        declareFunction("get_dumping_lexicon", "GET-DUMPING-LEXICON", 0, 0, false);
        declareFunction("get_dumping_semtrans_lexicon", "GET-DUMPING-SEMTRANS-LEXICON", 0, 0, false);
        declareFunction("dump_opencyc_lexicon", "DUMP-OPENCYC-LEXICON", 0, 1, false);
        declareFunction("dump_full_lexicon", "DUMP-FULL-LEXICON", 0, 1, false);
        declareFunction("dump_and_link_lexicon", "DUMP-AND-LINK-LEXICON", 2, 0, false);
        declareFunction("fort_should_be_in_lexiconP", "FORT-SHOULD-BE-IN-LEXICON?", 1, 0, false);
        declareFunction("dump_xml_lexicon", "DUMP-XML-LEXICON", 0, 4, false);
        declareFunction("add_entry_to_dictionary", "ADD-ENTRY-TO-DICTIONARY", 4, 0, false);
        declareFunction("dump_string_to_concepts_dict", "DUMP-STRING-TO-CONCEPTS-DICT", 3, 2, false);
        declareFunction("get_dumping_entry_cycl", "GET-DUMPING-ENTRY-CYCL", 2, 0, false);
        declareFunction("dump_xml_string_to_concepts_dict", "DUMP-XML-STRING-TO-CONCEPTS-DICT", 3, 2, false);
        declareFunction("dump_lexicon_string_row", "DUMP-LEXICON-STRING-ROW", 3, 1, false);
        declareFunction("xml_dump_lexicon_string_row", "XML-DUMP-LEXICON-STRING-ROW", 3, 1, false);
        declareFunction("contextually_dependent_entryP", "CONTEXTUALLY-DEPENDENT-ENTRY?", 1, 0, false);
        declareFunction("vanishingly_rare_entryP", "VANISHINGLY-RARE-ENTRY?", 1, 0, false);
        declareFunction("primary_entryP", "PRIMARY-ENTRY?", 1, 0, false);
        declareFunction("xml_output_concept", "XML-OUTPUT-CONCEPT", 1, 1, false);
        declareFunction("thing_describable_as_lex_p", "THING-DESCRIBABLE-AS-LEX-P", 1, 0, false);
        declareFunction("dump_isa_genls", "DUMP-ISA-GENLS", 0, 2, false);
        declareFunction("write_one_complete_fort_record_compactly", "WRITE-ONE-COMPLETE-FORT-RECORD-COMPACTLY", 1, 3, false);
        declareFunction("write_one_fort_compactly", "WRITE-ONE-FORT-COMPACTLY", 2, 1, false);
        return NIL;
    }

    static private final SubLString $str_alt84$reading_the_file___ = makeString("reading the file...");

    static private final SubLList $list_alt86 = list(CHAR_quotation);

    static private final SubLString $str_alt88$g_ = makeString("g:");

    static private final SubLString $str_alt89$i_ = makeString("i:");

    public static SubLObject init_lexicon_dumping_file() {
        defparameter("*LEXICON-DUMPING-COPY-FILES?*", T);
        defparameter("*LEXICON-DUMP-EXCLUDED-PREDICATES*", $list0);
        defparameter("*DUMPING-LEXICON*", NIL);
        defparameter("*DUMPING-SEMTRANS-LEXICON*", NIL);
        defparameter("*SEMTRANS-LEXICON-DUMP-EXCLUDED-POS-LIST*", $list6);
        deflexical("*LEXICON-FILE-RECORD-SEPARATOR*", Strings.make_string(ONE_INTEGER, CHAR_tab));
        return NIL;
    }

    public static SubLObject setup_lexicon_dumping_file() {
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_lexicon_dumping_file();
    }

    @Override
    public void initializeVariables() {
        init_lexicon_dumping_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_lexicon_dumping_file();
    }

    static {
    }
}

/**
 * Total time: 1295 ms
 */
