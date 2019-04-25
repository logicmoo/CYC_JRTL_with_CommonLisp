package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.stream_macros;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_methods;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.inference.harness.after_adding;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Time;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.sbhl.sbhl_caching_policies;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.sbhl.sbhl_cache;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_declarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Filesys;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class kbs_utilities extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.kbs_utilities";
    public static final String myFingerPrint = "cf88e640ef3ea43b82f1ce531c565ad8b2060d493be4099fb1bad98d7cec24f3";
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 5144L)
    private static SubLSymbol $postpone_kb_hl_support_bootstrappingP$;
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 6944L)
    public static SubLSymbol $kbs_definition$;
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 7366L)
    private static SubLSymbol $kbs_definition_properties$;
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 7820L)
    private static SubLSymbol $kbs_definition_section_properties$;
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 13564L)
    public static SubLSymbol $opencyc_kbs_term_queue$;
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 13785L)
    public static SubLSymbol $opencyc_kbs_assertion_queue$;
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 19762L)
    public static SubLSymbol $opencyc_kbs_prettystring_term_queue$;
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 20019L)
    public static SubLSymbol $opencyc_kbs_prettystring_assert_queue$;
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 22532L)
    private static SubLSymbol $opencyc_kbs_supported_prettystring_preds$;
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 22645L)
    private static SubLSymbol $opencyc_kbs_supported_prettystring_mts$;
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 26385L)
    private static SubLSymbol $opencyc_permitted_sources$;
    private static final SubLSymbol $sym0$NON_EMPTY_STRING_;
    private static final SubLString $str1$Continue;
    private static final SubLString $str2$The_KBS_definition_is_not_valid_;
    private static final SubLInteger $int3$10000;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLString $str7$_kbs_definition__is_null;
    private static final SubLString $str8$_kbs_definition__has_section_usin;
    private static final SubLSymbol $kw9$SECTIONS;
    private static final SubLString $str10$_kbs_definition__is_not_a_plist_;
    private static final SubLSymbol $kw11$NAME;
    private static final SubLSymbol $kw12$PRERUN_FNS;
    private static final SubLSymbol $kw13$PREREMOVED_ASSERTIONS;
    private static final SubLSymbol $kw14$POST_IDENTIFY_FORTS_FNS;
    private static final SubLSymbol $kw15$POST_IDENTIFY_ASSERTIONS_FNS;
    private static final SubLSymbol $kw16$INHERITED_STORES;
    private static final SubLString $str17$A_section_is_using_invalid_proper;
    private static final SubLString $str18$A_Section_is_not_a_plist___A;
    private static final SubLString $str19$No_sections_are_defined_;
    private static final SubLList $list20;
    private static final SubLSymbol $sym21$CDOLIST;
    private static final SubLList $list22;
    private static final SubLSymbol $kw23$COLLECTIONS;
    private static final SubLSymbol $kw24$SETS;
    private static final SubLSymbol $kw25$OMISSION_COLLECTIONS;
    private static final SubLSymbol $kw26$OMISSION_PREDICATE;
    private static final SubLSymbol $kw27$DEFINITIONAL_PREDICATE_SET;
    private static final SubLSymbol $kw28$DEFINITIONAL_RULE_PREDICATE;
    private static final SubLSymbol $kw29$KBQ_QUERY_SETS;
    private static final SubLSymbol $kw30$OMISSION_TERMS;
    private static final SubLSymbol $kw31$OMISSION_ASSERTIONS;
    private static final SubLSymbol $kw32$RETAINED_TERMS;
    private static final SubLSymbol $kw33$RETAINED_ASSERTIONS;
    private static final SubLSymbol $kw34$OMISSION_PREDICATE_EXTENT;
    private static final SubLSymbol $kw35$RULE_STATISTICS;
    private static final SubLSymbol $kw36$CACHING_POLICIES;
    private static final SubLSymbol $kw37$EXTERNALIZE;
    private static final SubLString $str38$Unknown_inherited_store__A__dont_;
    private static final SubLString $str39$Unknown_inherited_store__A_____sk;
    private static final SubLSymbol $sym40$KBS_RECONSTITUTE_BROADER_TERM_GAF_SPECIFICS;
    private static final SubLSymbol $sym41$KBS_EXTRACT_BROADER_TERM_GAF_SPECIFICS;
    private static final SubLSymbol $kw42$UNKNOWN;
    private static final SubLString $str43$Whoa__someone_already_populated_t;
    private static final SubLSymbol $kw44$PREPARED;
    private static final SubLList $list45;
    private static final SubLList $list46;
    private static final SubLObject $const47$broaderTerm;
    private static final SubLString $str48$This_transform_filters_is_not_app;
    private static final SubLString $str49$GAF__A_has_a_non_standard_EL_stre;
    private static final SubLList $list50;
    private static final SubLSymbol $sym51$RELEVANT_MT_IS_EVERYTHING;
    private static final SubLObject $const52$EverythingPSC;
    private static final SubLString $str53$Unmarking_forts_with_only_include;
    private static final SubLSymbol $kw54$SKIP;
    private static final SubLString $str55$unmarking__A__;
    private static final SubLString $str56$Unmarked__A_forts_and__A_assertio;
    private static final SubLSymbol $sym57$OPENCYC_KBS_RECONSTITUTE_PRETTY_STRING_IST;
    private static final SubLSymbol $sym58$OPENCYC_KBS_SIMPLIFY_PRETTY_STRING_IST;
    private static final SubLList $list59;
    private static final SubLList $list60;
    private static final SubLList $list61;
    private static final SubLObject $const62$ist;
    private static final SubLString $str63$Do_not_know_how_to_simplify_sente;
    private static final SubLList $list64;
    private static final SubLString $str65$Asserting_pretty_string_assertion;
    private static final SubLString $str66$_KBS_FORTs;
    private static final SubLString $str67$Cannot_be_used_without_identifyin;
    private static final SubLSymbol $sym68$KBS_PRETTY_STRING_FORT_;
    private static final SubLSymbol $sym69$PRETTY_STRING_ASSERT_SENTENCE_ACCUMULATOR_RESET;
    private static final SubLSymbol $sym70$PRETTY_STRING_ASSERT_SENTENCE_ACCUMULATOR_ADD;
    private static final SubLSymbol $sym71$PRETTY_STRING_ASSERT_SENTENCE_ACCUMULATOR_SIZE;
    private static final SubLSymbol $sym72$PRETTY_STRING_ASSERT_SENTENCE_ACCUMULATOR_CONTENTS;
    private static final SubLSymbol $sym73$PRETTY_STRING_ASSERT_SENTENCE_ACCUMULATOR_ITERATOR;
    private static final SubLString $str74$Reset_operation_not_supported_for;
    private static final SubLSymbol $sym75$IST_SENTENCE_P;
    private static final SubLObject $const76$BaseKB;
    private static final SubLList $list77;
    private static final SubLString $str78$Get_contents_operation_not_suppor;
    private static final SubLString $str79$Get_iterator_operation_not_suppor;
    private static final SubLList $list80;
    private static final SubLString $str81$OpenCycPermittedSource;
    private static final SubLObject $const82$synonymousExternalConcept;
    private static final SubLString $str83$Removing_non_opencyc_related___sy;
    private static final SubLString $str84$_;
    private static final SubLString $str85$cdolist;
    private static final SubLObject $const86$broaderTerm_NonTaxonomic;
    private static final SubLString $str87$Killing_;
    private static final SubLSymbol $kw88$SILENT;
    private static final SubLString $str89$___A__;
    private static final SubLString $str90$___s_constant_A__A__;
    private static final SubLString $str91$s_were;
    private static final SubLString $str92$_was;
    private static final SubLString $str93$created;
    private static final SubLString $str94$destroyed;
    private static final SubLString $str95$___s_nart_A__A__;
    private static final SubLString $str96$___s_assertion_A__A__;
    private static final SubLString $str97$___s_kb_hl_support_A__A__;
    private static final SubLString $str98$___s_deduction_A__A__;
    private static final SubLList $list99;
    private static final SubLString $str100$Unmarking_instances_of___Terroris;
    private static final SubLObject $const101$TerroristAgent;
    private static final SubLObject $const102$isa;
    private static final SubLSymbol $kw103$BREADTH;
    private static final SubLSymbol $kw104$QUEUE;
    private static final SubLSymbol $kw105$STACK;
    private static final SubLSymbol $sym106$RELEVANT_SBHL_TV_IS_GENERAL_TV;
    private static final SubLSymbol $kw107$ERROR;
    private static final SubLString $str108$_A_is_not_a__A;
    private static final SubLSymbol $sym109$SBHL_TRUE_TV_P;
    private static final SubLSymbol $kw110$CERROR;
    private static final SubLString $str111$continue_anyway;
    private static final SubLSymbol $kw112$WARN;
    private static final SubLString $str113$_A_is_not_a_valid__sbhl_type_erro;
    private static final SubLString $str114$_A_is_neither_SET_P_nor_LISTP_;
    private static final SubLString $str115$attempting_to_bind_direction_link;
    private static final SubLList $list116;
    private static final SubLString $str117$Node__a_does_not_pass_sbhl_type_t;
    private static final SubLObject $const118$TerroristAct;
    private static final SubLObject $const119$HostileSocialAction;
    private static final SubLObject $const120$ResearchCycConstant;
    private static final SubLObject $const121$ProprietaryTerm;
    private static final SubLObject $const122$TKBConstant;
    private static final SubLObject $const123$TermSuggestorExpertOnlyTerm;
    private static final SubLObject $const124$TextualEntailmentConstant;
    private static final SubLObject $const125$CurrentCycorpEmployee;
    private static final SubLString $str126$AKB;
    private static final SubLString $str127$BUTLER;
    private static final SubLString $str128$CKB;
    private static final SubLString $str129$CycInternalAssignment;
    private static final SubLString $str130$TKB;
    private static final SubLString $str131$Translation_;
    private static final SubLString $str132$Unmarking_non_TKB_assertions;
    private static final SubLString $str133$mapping_Cyc_constants;
    private static final SubLSymbol $sym134$STRINGP;
    private static final SubLSymbol $kw135$GAF;
    private static final SubLObject $const136$Individual;
    private static final SubLString $str137$Saving__A_by_asserting__A__;
    private static final SubLObject $const138$UniversalVocabularyMt;
    private static final SubLString $str139$assertion__A_not_found;
    private static final SubLSymbol $sym140$TKB_SPECIAL_EXCLUDED_ASSERTION_;
    private static final SubLSymbol $sym141$ASSERTION_P;
    private static final SubLObject $const142$TKBFullySpecifiedSourceMicrotheor;
    private static final SubLObject $const143$LexicalMicrotheory;
    private static final SubLObject $const144$TestVocabularyMt;
    private static final SubLObject $const145$quotedIsa;
    private static final SubLObject $const146$termOfUnit;
    private static final SubLObject $const147$Thing;
    private static final SubLObject $const148$ImagePathnamePredicate;
    private static final SubLObject $const149$Person;
    private static final SubLObject $const150$LegalCorporation;
    private static final SubLObject $const151$CommercialOrganization;
    private static final SubLObject $const152$IndeterminateTerm;
    private static final SubLObject $const153$IndexicalConcept;
    private static final SubLObject $const154$AgentNowTerminated;
    private static final SubLObject $const155$ComputerUserWithUserModel;
    private static final SubLObject $const156$HumanCyclist;
    private static final SubLObject $const157$genls;
    private static final SubLObject $const158$genls_GenlDenotesSpecInstances;
    private static final SubLSymbol $kw159$TRUE;
    private static final SubLList $list160;
    private static final SubLList $list161;
    private static final SubLList $list162;
    private static final SubLSymbol $kw163$ALLOW_OTHER_KEYS;
    private static final SubLSymbol $kw164$MT;
    private static final SubLSymbol $kw165$DONE;
    private static final SubLSymbol $sym166$DO_LIST;
    private static final SubLSymbol $sym167$ALL_QUOTED_INSTANCES_ENHANCED;
    private static final SubLObject $const168$KBSubsetProfile;
    private static final SubLString $str169$_S_is_not_a_valid___KBSubsetProfi;
    private static final SubLObject $const170$kbsProfileRemoveAssertion;
    private static final SubLObject $const171$kbsProfileRemoveCollectionExtent;
    private static final SubLObject $const172$kbsProfileRemoveFORT;
    private static final SubLObject $const173$kbsProfileRemovePredicateExtent;
    private static final SubLObject $const174$kbsProfileRetainAssertion;
    private static final SubLObject $const175$kbsProfileRetainTerm;
    private static final SubLList $list176;
    private static final SubLList $list177;
    private static final SubLString $str178$KB_subsets_are_not_supported_on_t;
    private static final SubLSymbol $kw179$OUTPUT;
    private static final SubLString $str180$Unable_to_open__S;
    private static final SubLString $str181$Gathering_up_all_assertion_EL_for;
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 1494L)
    public static SubLObject make_kbs_partition(final SubLObject kbs_partition_path, final SubLObject partition_filename, SubLObject splicing_partition_filename) {
        if (splicing_partition_filename == kbs_utilities.UNPROVIDED) {
            splicing_partition_filename = (SubLObject)kbs_utilities.NIL;
        }
        assert kbs_utilities.NIL != string_utilities.non_empty_stringP(partition_filename) : partition_filename;
        prepare_for_kbs_partition(splicing_partition_filename);
        return complete_kbs_partition(kbs_partition_path, partition_filename, splicing_partition_filename);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 2670L)
    public static SubLObject prepare_kb_for_kbs_partition(final SubLObject prepared_units, SubLObject splicing_partition_filename) {
        if (splicing_partition_filename == kbs_utilities.UNPROVIDED) {
            splicing_partition_filename = (SubLObject)kbs_utilities.NIL;
        }
        prepare_for_kbs_partition(splicing_partition_filename);
        builder_utilities.cyc_dump_standard_kb(prepared_units);
        return prepared_units;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 2990L)
    public static SubLObject complete_kbs_partition(final SubLObject kbs_partition_path, final SubLObject partition_filename, SubLObject splicing_partition_filename) {
        if (splicing_partition_filename == kbs_utilities.UNPROVIDED) {
            splicing_partition_filename = (SubLObject)kbs_utilities.NIL;
        }
        assert kbs_utilities.NIL != string_utilities.non_empty_stringP(partition_filename) : partition_filename;
        construct_kbs_partition();
        write_out_kbs_partition(kbs_partition_path, partition_filename, splicing_partition_filename);
        return (SubLObject)kbs_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 3489L)
    public static SubLObject prepare_for_kbs_partition(SubLObject splicing_partition_filename) {
        if (splicing_partition_filename == kbs_utilities.UNPROVIDED) {
            splicing_partition_filename = (SubLObject)kbs_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kbs_utilities.NIL == kbs_definition_validP()) {
            Errors.cerror((SubLObject)kbs_utilities.$str1$Continue, (SubLObject)kbs_utilities.$str2$The_KBS_definition_is_not_valid_);
        }
        nl_trie_staleness_test.declare_nl_trie_staleness_acceptable();
        kbs_identification.clear_kbs_state();
        kbs_identification.prepare_kbs_kb_destructive((SubLObject)kbs_utilities.UNPROVIDED);
        if (kbs_utilities.NIL != string_utilities.non_empty_stringP(splicing_partition_filename) && kbs_utilities.NIL != Filesys.probe_file(splicing_partition_filename)) {
            partitions.load_partition_clean(splicing_partition_filename, (SubLObject)kbs_utilities.UNPROVIDED);
        }
        return kbs_utilities.$kbs_definition$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 4188L)
    public static SubLObject construct_kbs_partition() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kbs_utilities.NIL == kbs_identification.kbs_forts()) {
            kbs_identification.identify_kbs_forts();
        }
        kbs_identification.do_post_identify_kbs_forts_fns();
        kbs_add_redundant.compute_and_add_kbs_additional_redundant_definitional_info();
        kbs_identification.identify_kbs_assertions();
        kbs_identification.do_post_identify_kbs_assertions_fns();
        kbs_identification.identify_kbs_deductions();
        kbs_add_redundant.compute_and_add_kbs_additional_redundant_asserted_arguments();
        return kbs_utilities.$kbs_definition$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 4641L)
    public static SubLObject write_out_kbs_partition(final SubLObject kbs_partition_path, final SubLObject partition_filename, SubLObject splicing_partition_filename) {
        if (splicing_partition_filename == kbs_utilities.UNPROVIDED) {
            splicing_partition_filename = (SubLObject)kbs_utilities.NIL;
        }
        kbs_partition.save_kbs_partition(partition_filename);
        if (splicing_partition_filename.isString() && kbs_utilities.NIL == Filesys.probe_file(splicing_partition_filename)) {
            kbs_partition.save_kbs_splicing_partition(splicing_partition_filename);
        }
        save_inherited_stores(get_kbs_inherited_stores(), kbs_partition_path);
        return kbs_partition_path;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 5402L)
    public static SubLObject load_partition_into_empty_kb(final SubLObject kbs_partition_path, final SubLObject partition_filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        kb_utilities.clear_kb_state((SubLObject)kbs_utilities.$int3$10000);
        kb_utilities.finalize_kb_tables();
        sbhl_module_declarations.initialize_sbhl_modules((SubLObject)kbs_utilities.UNPROVIDED);
        final SubLObject _prev_bind_0 = partitions.$load_partition_weaken_hl_supports$.currentBinding(thread);
        try {
            partitions.$load_partition_weaken_hl_supports$.bind((SubLObject)kbs_utilities.$list4, thread);
            kbs_partition.load_kbs_partition(partition_filename);
        }
        finally {
            partitions.$load_partition_weaken_hl_supports$.rebind(_prev_bind_0, thread);
        }
        control_vars.set_build_kb_loaded((SubLObject)kbs_utilities.ONE_INTEGER);
        kb_utilities.finalize_kb_tables();
        dumper.load_essential_kb_initializations();
        dumper.rebuild_computable_content_dumpable_low();
        if (kbs_utilities.NIL == kbs_utilities.$postpone_kb_hl_support_bootstrappingP$.getDynamicValue(thread)) {
            kb_hl_supports_high.bootstrap_kb_hl_supports((SubLObject)kbs_utilities.UNPROVIDED);
        }
        dumper.rebuild_computable_remaining_hl_high((SubLObject)kbs_utilities.UNPROVIDED);
        load_inherited_stores(get_kbs_inherited_stores(), kbs_partition_path);
        kbs_partition.clean_kbs_assert_info();
        return (SubLObject)kbs_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 6053L)
    public static SubLObject kbs_image_cleanup() {
        return kbs_cleanup.kbs_cleanup();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 6539L)
    public static SubLObject sbhl_caching_init() {
        sbhl_cache.initialize_all_sbhl_caching();
        return (SubLObject)kbs_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 8350L)
    public static SubLObject kbs_definition_validP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject validP = (SubLObject)kbs_utilities.T;
        if (kbs_utilities.NIL == kbs_utilities.$kbs_definition$.getDynamicValue(thread)) {
            Errors.warn((SubLObject)kbs_utilities.$str7$_kbs_definition__is_null);
            validP = (SubLObject)kbs_utilities.NIL;
        }
        else if (kbs_utilities.NIL != list_utilities.property_list_p(kbs_utilities.$kbs_definition$.getDynamicValue(thread))) {
            SubLObject remainder;
            SubLObject property;
            SubLObject value;
            for (remainder = (SubLObject)kbs_utilities.NIL, remainder = kbs_utilities.$kbs_definition$.getDynamicValue(thread); kbs_utilities.NIL != remainder; remainder = conses_high.cddr(remainder)) {
                property = remainder.first();
                value = conses_high.cadr(remainder);
                if (kbs_utilities.NIL == subl_promotions.memberP(property, kbs_utilities.$kbs_definition_properties$.getGlobalValue(), (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED)) {
                    Errors.warn((SubLObject)kbs_utilities.$str8$_kbs_definition__has_section_usin, property);
                    validP = (SubLObject)kbs_utilities.NIL;
                }
                if (property == kbs_utilities.$kw9$SECTIONS && kbs_utilities.NIL == kbs_section_definition_validP(value)) {
                    validP = (SubLObject)kbs_utilities.NIL;
                }
            }
        }
        else {
            Errors.warn((SubLObject)kbs_utilities.$str10$_kbs_definition__is_not_a_plist_);
            validP = (SubLObject)kbs_utilities.NIL;
        }
        return validP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 9606L)
    public static SubLObject get_kbs_name() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return conses_high.getf(kbs_utilities.$kbs_definition$.getDynamicValue(thread), (SubLObject)kbs_utilities.$kw11$NAME, (SubLObject)kbs_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 9680L)
    public static SubLObject get_kbs_sections() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return conses_high.getf(kbs_utilities.$kbs_definition$.getDynamicValue(thread), (SubLObject)kbs_utilities.$kw9$SECTIONS, (SubLObject)kbs_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 9762L)
    public static SubLObject get_kbs_prerun_fns() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return conses_high.getf(kbs_utilities.$kbs_definition$.getDynamicValue(thread), (SubLObject)kbs_utilities.$kw12$PRERUN_FNS, (SubLObject)kbs_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 9848L)
    public static SubLObject get_kbs_preremoved_assertions() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return conses_high.getf(kbs_utilities.$kbs_definition$.getDynamicValue(thread), (SubLObject)kbs_utilities.$kw13$PREREMOVED_ASSERTIONS, (SubLObject)kbs_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 9956L)
    public static SubLObject get_kbs_post_identify_forts_fns() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return conses_high.getf(kbs_utilities.$kbs_definition$.getDynamicValue(thread), (SubLObject)kbs_utilities.$kw14$POST_IDENTIFY_FORTS_FNS, (SubLObject)kbs_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 10068L)
    public static SubLObject get_kbs_post_identify_assertions_fns() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return conses_high.getf(kbs_utilities.$kbs_definition$.getDynamicValue(thread), (SubLObject)kbs_utilities.$kw15$POST_IDENTIFY_ASSERTIONS_FNS, (SubLObject)kbs_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 10190L)
    public static SubLObject get_kbs_inherited_stores() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return conses_high.getf(kbs_utilities.$kbs_definition$.getDynamicValue(thread), (SubLObject)kbs_utilities.$kw16$INHERITED_STORES, (SubLObject)kbs_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 10288L)
    public static SubLObject kbs_section_definition_validP(final SubLObject kbs_sections_definition) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject validP = (SubLObject)kbs_utilities.T;
        if (kbs_utilities.NIL != list_utilities.non_empty_list_p(kbs_sections_definition)) {
            SubLObject cdolist_list_var = kbs_sections_definition;
            SubLObject poss_kbs_section = (SubLObject)kbs_utilities.NIL;
            poss_kbs_section = cdolist_list_var.first();
            while (kbs_utilities.NIL != cdolist_list_var) {
                if (kbs_utilities.NIL != list_utilities.property_list_p(poss_kbs_section)) {
                    SubLObject remainder;
                    SubLObject property;
                    SubLObject value;
                    for (remainder = (SubLObject)kbs_utilities.NIL, remainder = poss_kbs_section; kbs_utilities.NIL != remainder; remainder = conses_high.cddr(remainder)) {
                        property = remainder.first();
                        value = conses_high.cadr(remainder);
                        if (kbs_utilities.NIL == subl_promotions.memberP(property, kbs_utilities.$kbs_definition_section_properties$.getDynamicValue(thread), (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED)) {
                            Errors.warn((SubLObject)kbs_utilities.$str17$A_section_is_using_invalid_proper, property);
                            validP = (SubLObject)kbs_utilities.NIL;
                        }
                    }
                }
                else {
                    Errors.warn((SubLObject)kbs_utilities.$str18$A_Section_is_not_a_plist___A, poss_kbs_section);
                    validP = (SubLObject)kbs_utilities.NIL;
                }
                cdolist_list_var = cdolist_list_var.rest();
                poss_kbs_section = cdolist_list_var.first();
            }
        }
        else {
            Errors.warn((SubLObject)kbs_utilities.$str19$No_sections_are_defined_);
            validP = (SubLObject)kbs_utilities.NIL;
        }
        return validP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 10942L)
    public static SubLObject do_kbs_definitional_sections(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kbs_utilities.$list20);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject kbs_section = (SubLObject)kbs_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kbs_utilities.$list20);
        kbs_section = current.first();
        current = current.rest();
        if (kbs_utilities.NIL == current) {
            final SubLObject body;
            current = (body = temp);
            return (SubLObject)ConsesLow.listS((SubLObject)kbs_utilities.$sym21$CDOLIST, reader.bq_cons(kbs_section, (SubLObject)kbs_utilities.$list22), ConsesLow.append(body, (SubLObject)kbs_utilities.NIL));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kbs_utilities.$list20);
        return (SubLObject)kbs_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 11073L)
    public static SubLObject get_kbs_section_collections(final SubLObject kbs_section) {
        return conses_high.getf(kbs_section, (SubLObject)kbs_utilities.$kw23$COLLECTIONS, (SubLObject)kbs_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 11175L)
    public static SubLObject get_kbs_section_sets(final SubLObject kbs_section) {
        return conses_high.getf(kbs_section, (SubLObject)kbs_utilities.$kw24$SETS, (SubLObject)kbs_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 11263L)
    public static SubLObject get_kbs_section_omission_collections(final SubLObject kbs_section) {
        return conses_high.getf(kbs_section, (SubLObject)kbs_utilities.$kw25$OMISSION_COLLECTIONS, (SubLObject)kbs_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 11383L)
    public static SubLObject get_kbs_section_omission_predicate(final SubLObject kbs_section) {
        return conses_high.getf(kbs_section, (SubLObject)kbs_utilities.$kw26$OMISSION_PREDICATE, (SubLObject)kbs_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 11499L)
    public static SubLObject get_kbs_section_definitional_predicate_set(final SubLObject kbs_section) {
        return conses_high.getf(kbs_section, (SubLObject)kbs_utilities.$kw27$DEFINITIONAL_PREDICATE_SET, (SubLObject)kbs_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 11631L)
    public static SubLObject get_kbs_section_definitional_rule_predicate(final SubLObject kbs_section) {
        return conses_high.getf(kbs_section, (SubLObject)kbs_utilities.$kw28$DEFINITIONAL_RULE_PREDICATE, (SubLObject)kbs_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 11765L)
    public static SubLObject get_kbs_section_kbq_query_sets(final SubLObject kbs_section) {
        return conses_high.getf(kbs_section, (SubLObject)kbs_utilities.$kw29$KBQ_QUERY_SETS, (SubLObject)kbs_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 11873L)
    public static SubLObject get_kbs_section_omission_terms(final SubLObject kbs_section) {
        return conses_high.getf(kbs_section, (SubLObject)kbs_utilities.$kw30$OMISSION_TERMS, (SubLObject)kbs_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 11981L)
    public static SubLObject get_kbs_section_omission_assertions(final SubLObject kbs_section) {
        return conses_high.getf(kbs_section, (SubLObject)kbs_utilities.$kw31$OMISSION_ASSERTIONS, (SubLObject)kbs_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 12099L)
    public static SubLObject get_kbs_section_retained_terms(final SubLObject kbs_section) {
        return conses_high.getf(kbs_section, (SubLObject)kbs_utilities.$kw32$RETAINED_TERMS, (SubLObject)kbs_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 12207L)
    public static SubLObject get_kbs_section_retained_assertions(final SubLObject kbs_section) {
        return conses_high.getf(kbs_section, (SubLObject)kbs_utilities.$kw33$RETAINED_ASSERTIONS, (SubLObject)kbs_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 12325L)
    public static SubLObject get_kbs_section_omission_predicate_extent(final SubLObject kbs_section) {
        return conses_high.getf(kbs_section, (SubLObject)kbs_utilities.$kw34$OMISSION_PREDICATE_EXTENT, (SubLObject)kbs_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 12455L)
    public static SubLObject save_inherited_stores(final SubLObject inherited_stores, final SubLObject inherited_store_directory) {
        SubLObject cdolist_list_var = inherited_stores;
        SubLObject inherited_store = (SubLObject)kbs_utilities.NIL;
        inherited_store = cdolist_list_var.first();
        while (kbs_utilities.NIL != cdolist_list_var) {
            final SubLObject pcase_var = inherited_store;
            if (pcase_var.eql((SubLObject)kbs_utilities.$kw35$RULE_STATISTICS)) {
                dumper.dump_rule_utility_experience(inherited_store_directory, (SubLObject)kbs_utilities.NIL);
            }
            else if (pcase_var.eql((SubLObject)kbs_utilities.$kw36$CACHING_POLICIES)) {
                sbhl_caching_policies.dump_active_kb_sbhl_caching_policies(inherited_store_directory, (SubLObject)kbs_utilities.$kw37$EXTERNALIZE);
            }
            else {
                Errors.error((SubLObject)kbs_utilities.$str38$Unknown_inherited_store__A__dont_, inherited_store);
            }
            cdolist_list_var = cdolist_list_var.rest();
            inherited_store = cdolist_list_var.first();
        }
        return (SubLObject)kbs_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 13047L)
    public static SubLObject load_inherited_stores(final SubLObject inherited_stores, final SubLObject inherited_store_directory) {
        SubLObject cdolist_list_var = inherited_stores;
        SubLObject inherited_store = (SubLObject)kbs_utilities.NIL;
        inherited_store = cdolist_list_var.first();
        while (kbs_utilities.NIL != cdolist_list_var) {
            final SubLObject pcase_var = inherited_store;
            if (pcase_var.eql((SubLObject)kbs_utilities.$kw35$RULE_STATISTICS)) {
                dumper.load_rule_utility_experience(inherited_store_directory);
            }
            else if (pcase_var.eql((SubLObject)kbs_utilities.$kw36$CACHING_POLICIES)) {
                sbhl_caching_policies.enforce_standard_kb_sbhl_caching_policies(inherited_store_directory);
            }
            else {
                Errors.warn((SubLObject)kbs_utilities.$str39$Unknown_inherited_store__A_____sk, inherited_store);
            }
            cdolist_list_var = cdolist_list_var.rest();
            inherited_store = cdolist_list_var.first();
        }
        return (SubLObject)kbs_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 13898L)
    public static SubLObject opencyc_kbs_assert_broader_term_gafs() {
        opencyc_kbs_possibly_prepare_broader_term_queue();
        final SubLObject gaf_acc = opencyc_kbs_contribute_to_broader_term_gafs();
        final SubLObject ass_iterator = opencyc_kbs_new_accumulated_broader_term_assertion_iterator(gaf_acc);
        kbs_add_redundant.add_some_kbs_broader_term_gafs(ass_iterator);
        return (SubLObject)kbs_utilities.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 14437L)
    public static SubLObject opencyc_kbs_contribute_to_broader_term_gafs() {
        final SubLObject gaf_acc = opencyc_kbs_new_broader_term_assertion_accumulator();
        final SubLObject term_iterator = opencyc_kbs_new_kbs_fort_iterator();
        kbs_add_redundant.compute_specified_kbs_broader_term_gafs(term_iterator, gaf_acc);
        accumulation.accumulation_contents(gaf_acc, (SubLObject)kbs_utilities.UNPROVIDED);
        return gaf_acc;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 15106L)
    public static SubLObject opencyc_kbs_new_kbs_fort_iterator() {
        if (kbs_utilities.NIL != simple_queue_service.is_known_sqs_queueP(kbs_utilities.$opencyc_kbs_term_queue$.getGlobalValue())) {
            final SubLObject queue = kbs_utilities.$opencyc_kbs_term_queue$.getGlobalValue();
            return simple_queue_service.new_sqs_segment_iterator(simple_queue_service.new_sqs_iterator(queue, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED));
        }
        return iteration.new_list_iterator(kbs_add_redundant.kbs_broader_term_candidate_forts());
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 15565L)
    public static SubLObject opencyc_kbs_new_assertion_accumulator(SubLObject simplifier_fn, SubLObject param) {
        if (simplifier_fn == kbs_utilities.UNPROVIDED) {
            simplifier_fn = (SubLObject)kbs_utilities.NIL;
        }
        if (param == kbs_utilities.UNPROVIDED) {
            param = iteration.$xform_fn_param_do_not_pass$.getGlobalValue();
        }
        if (kbs_utilities.NIL != simple_queue_service.is_known_sqs_queueP(kbs_utilities.$opencyc_kbs_assertion_queue$.getGlobalValue())) {
            final SubLObject queue = kbs_utilities.$opencyc_kbs_assertion_queue$.getGlobalValue();
            SubLObject acc = simple_queue_service.new_sqs_accumulator(queue, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED);
            acc = simple_queue_service.new_segment_accumulator(acc, simple_queue_service.$recommended_max_bytes_per_sqs_message$.getGlobalValue(), (SubLObject)kbs_utilities.NIL);
            if (kbs_utilities.NIL != simplifier_fn) {
                acc = accumulation.new_transform_accumulator(acc, simplifier_fn, param);
            }
            return acc;
        }
        return accumulation.new_list_accumulator((SubLObject)kbs_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 16285L)
    public static SubLObject opencyc_kbs_new_accumulated_assertions_iterator(final SubLObject gaf_accumulator, SubLObject simplifier_fn, SubLObject param) {
        if (simplifier_fn == kbs_utilities.UNPROVIDED) {
            simplifier_fn = (SubLObject)kbs_utilities.NIL;
        }
        if (param == kbs_utilities.UNPROVIDED) {
            param = iteration.$xform_fn_param_do_not_pass$.getGlobalValue();
        }
        if (kbs_utilities.NIL != simple_queue_service.is_known_sqs_queueP(kbs_utilities.$opencyc_kbs_assertion_queue$.getGlobalValue())) {
            SubLObject iterator = simple_queue_service.new_sqs_iterator(kbs_utilities.$opencyc_kbs_assertion_queue$.getGlobalValue(), (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED);
            iterator = simple_queue_service.new_sqs_segment_iterator(iterator);
            if (kbs_utilities.NIL != simplifier_fn) {
                iterator = iteration.new_transform_iterator(iterator, simplifier_fn, param);
            }
            return iterator;
        }
        return accumulation.accumulation_iterator(gaf_accumulator);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 16831L)
    public static SubLObject opencyc_kbs_new_accumulated_broader_term_assertion_iterator(final SubLObject gaf_accumulator) {
        return opencyc_kbs_new_accumulated_assertions_iterator(gaf_accumulator, (SubLObject)kbs_utilities.$sym40$KBS_RECONSTITUTE_BROADER_TERM_GAF_SPECIFICS, (SubLObject)kbs_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 17064L)
    public static SubLObject opencyc_kbs_new_broader_term_assertion_accumulator() {
        return opencyc_kbs_new_assertion_accumulator((SubLObject)kbs_utilities.$sym41$KBS_EXTRACT_BROADER_TERM_GAF_SPECIFICS, (SubLObject)kbs_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 17233L)
    public static SubLObject opencyc_kbs_possibly_prepare_broader_term_queue() {
        if (kbs_utilities.NIL != simple_queue_service.is_known_sqs_queueP(kbs_utilities.$opencyc_kbs_term_queue$.getGlobalValue())) {
            return opencyc_kbs_prepare_broader_term_queue();
        }
        return (SubLObject)kbs_utilities.$kw42$UNKNOWN;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 17427L)
    public static SubLObject opencyc_kbs_prepare_broader_term_queue() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject queue = kbs_utilities.$opencyc_kbs_term_queue$.getGlobalValue();
        final SubLObject estimate = simple_queue_service.sqs_pending_message_estimate(queue);
        if (kbs_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !estimate.isZero()) {
            Errors.error((SubLObject)kbs_utilities.$str43$Whoa__someone_already_populated_t, estimate);
        }
        accumulation.accumulation_add_items(simple_queue_service.new_segment_accumulator(simple_queue_service.new_sqs_accumulator(queue, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED), (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED), iteration.new_list_iterator(kbs_add_redundant.kbs_broader_term_candidate_forts()));
        return (SubLObject)kbs_utilities.$kw44$PREPARED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 17871L)
    public static SubLObject kbs_extract_broader_term_gaf_specifics(final SubLObject information) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sentence = (SubLObject)kbs_utilities.NIL;
        SubLObject mt = (SubLObject)kbs_utilities.NIL;
        SubLObject strength = (SubLObject)kbs_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(information, information, (SubLObject)kbs_utilities.$list45);
        sentence = information.first();
        SubLObject current = information.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, information, (SubLObject)kbs_utilities.$list45);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, information, (SubLObject)kbs_utilities.$list45);
        strength = current.first();
        current = current.rest();
        if (kbs_utilities.NIL == current) {
            SubLObject current_$2;
            final SubLObject datum_$1 = current_$2 = sentence;
            SubLObject pred = (SubLObject)kbs_utilities.NIL;
            SubLObject arg1 = (SubLObject)kbs_utilities.NIL;
            SubLObject arg2 = (SubLObject)kbs_utilities.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current_$2, datum_$1, (SubLObject)kbs_utilities.$list46);
            pred = current_$2.first();
            current_$2 = current_$2.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$2, datum_$1, (SubLObject)kbs_utilities.$list46);
            arg1 = current_$2.first();
            current_$2 = current_$2.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current_$2, datum_$1, (SubLObject)kbs_utilities.$list46);
            arg2 = current_$2.first();
            current_$2 = current_$2.rest();
            if (kbs_utilities.NIL == current_$2) {
                if (kbs_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !pred.eql(kbs_utilities.$const47$broaderTerm)) {
                    Errors.error((SubLObject)kbs_utilities.$str48$This_transform_filters_is_not_app, information);
                }
                final SubLObject code = Sequences.position(strength, enumeration_types.$valid_el_strengths$.getGlobalValue(), (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED);
                if (kbs_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && kbs_utilities.NIL == subl_promotions.non_negative_integer_p(code)) {
                    Errors.error((SubLObject)kbs_utilities.$str49$GAF__A_has_a_non_standard_EL_stre, information, strength);
                }
                return (SubLObject)ConsesLow.list(arg1, arg2, mt, code);
            }
            cdestructuring_bind.cdestructuring_bind_error(datum_$1, (SubLObject)kbs_utilities.$list46);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(information, (SubLObject)kbs_utilities.$list45);
        }
        return (SubLObject)kbs_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 18686L)
    public static SubLObject kbs_reconstitute_broader_term_gaf_specifics(final SubLObject information) {
        SubLObject arg1 = (SubLObject)kbs_utilities.NIL;
        SubLObject arg2 = (SubLObject)kbs_utilities.NIL;
        SubLObject mt = (SubLObject)kbs_utilities.NIL;
        SubLObject code = (SubLObject)kbs_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(information, information, (SubLObject)kbs_utilities.$list50);
        arg1 = information.first();
        SubLObject current = information.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, information, (SubLObject)kbs_utilities.$list50);
        arg2 = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, information, (SubLObject)kbs_utilities.$list50);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, information, (SubLObject)kbs_utilities.$list50);
        code = current.first();
        current = current.rest();
        if (kbs_utilities.NIL == current) {
            return (SubLObject)ConsesLow.list(el_utilities.make_binary_formula(kbs_utilities.$const47$broaderTerm, arg1, arg2), mt, ConsesLow.nth(code, enumeration_types.$valid_el_strengths$.getGlobalValue()));
        }
        cdestructuring_bind.cdestructuring_bind_error(information, (SubLObject)kbs_utilities.$list50);
        return (SubLObject)kbs_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 18953L)
    public static SubLObject unmark_forts_without_assertions() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        kbs_identification.identify_kbs_assertions();
        SubLObject fort_count = (SubLObject)kbs_utilities.ZERO_INTEGER;
        SubLObject assertion_count = (SubLObject)kbs_utilities.ZERO_INTEGER;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kbs_utilities.$sym51$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(kbs_utilities.$const52$EverythingPSC, thread);
            final SubLObject message = (SubLObject)kbs_utilities.$str53$Unmarking_forts_with_only_include;
            final SubLObject total = forts.fort_count();
            SubLObject sofar = (SubLObject)kbs_utilities.ZERO_INTEGER;
            final SubLObject _prev_bind_0_$3 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_1_$4 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)kbs_utilities.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kbs_utilities.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kbs_utilities.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(message);
                    SubLObject cdolist_list_var = forts.do_forts_tables();
                    SubLObject table_var = (SubLObject)kbs_utilities.NIL;
                    table_var = cdolist_list_var.first();
                    while (kbs_utilities.NIL != cdolist_list_var) {
                        final SubLObject idx = table_var;
                        if (kbs_utilities.NIL == id_index.id_index_objects_empty_p(idx, (SubLObject)kbs_utilities.$kw54$SKIP)) {
                            final SubLObject idx_$5 = idx;
                            if (kbs_utilities.NIL == id_index.id_index_dense_objects_empty_p(idx_$5, (SubLObject)kbs_utilities.$kw54$SKIP)) {
                                final SubLObject vector_var = id_index.id_index_dense_objects(idx_$5);
                                final SubLObject backwardP_var = (SubLObject)kbs_utilities.NIL;
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
                                for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kbs_utilities.NIL, v_iteration = (SubLObject)kbs_utilities.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kbs_utilities.ONE_INTEGER)) {
                                    id = ((kbs_utilities.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kbs_utilities.ONE_INTEGER) : v_iteration);
                                    fort = Vectors.aref(vector_var, id);
                                    if (kbs_utilities.NIL == id_index.id_index_tombstone_p(fort) || kbs_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kbs_utilities.$kw54$SKIP)) {
                                        if (kbs_utilities.NIL != id_index.id_index_tombstone_p(fort)) {
                                            fort = (SubLObject)kbs_utilities.$kw54$SKIP;
                                        }
                                        sofar = Numbers.add(sofar, (SubLObject)kbs_utilities.ONE_INTEGER);
                                        utilities_macros.note_percent_progress(sofar, total);
                                        if (kbs_utilities.NIL != kbs_identification.kbs_fort_p(fort)) {
                                            keepP = (SubLObject)kbs_utilities.NIL;
                                            if (kbs_utilities.NIL != kb_mapping_macros.do_term_index_key_validator(fort, (SubLObject)kbs_utilities.NIL)) {
                                                iterator_var = kb_mapping_macros.new_term_final_index_spec_iterator(fort, (SubLObject)kbs_utilities.NIL);
                                                done_var = keepP;
                                                token_var = (SubLObject)kbs_utilities.NIL;
                                                while (kbs_utilities.NIL == done_var) {
                                                    final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                    valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                                    if (kbs_utilities.NIL != valid) {
                                                        final_index_iterator = (SubLObject)kbs_utilities.NIL;
                                                        try {
                                                            final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)kbs_utilities.NIL, (SubLObject)kbs_utilities.NIL, (SubLObject)kbs_utilities.NIL);
                                                            done_var_$6 = keepP;
                                                            token_var_$7 = (SubLObject)kbs_utilities.NIL;
                                                            while (kbs_utilities.NIL == done_var_$6) {
                                                                a = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$7);
                                                                valid_$8 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$7.eql(a));
                                                                if (kbs_utilities.NIL != valid_$8 && kbs_utilities.NIL != kb_mapping_macros.do_term_index_assertion_match_p(a, final_index_spec) && kbs_utilities.NIL == function_terms.tou_assertionP(a) && kbs_utilities.NIL != kbs_identification.kbs_assertion_p(a)) {
                                                                    keepP = (SubLObject)kbs_utilities.T;
                                                                }
                                                                done_var_$6 = (SubLObject)SubLObjectFactory.makeBoolean(kbs_utilities.NIL == valid_$8 || kbs_utilities.NIL != keepP);
                                                            }
                                                        }
                                                        finally {
                                                            _prev_bind_0_$4 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbs_utilities.T, thread);
                                                                _values = Values.getValuesAsVector();
                                                                if (kbs_utilities.NIL != final_index_iterator) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                                }
                                                                Values.restoreValuesFromVector(_values);
                                                            }
                                                            finally {
                                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$4, thread);
                                                            }
                                                        }
                                                    }
                                                    done_var = (SubLObject)SubLObjectFactory.makeBoolean(kbs_utilities.NIL == valid || kbs_utilities.NIL != keepP);
                                                }
                                            }
                                            if (kbs_utilities.NIL == keepP) {
                                                PrintLow.format((SubLObject)kbs_utilities.T, (SubLObject)kbs_utilities.$str55$unmarking__A__, fort);
                                                streams_high.force_output((SubLObject)kbs_utilities.UNPROVIDED);
                                                thread.resetMultipleValues();
                                                fort_count_int = kbs_identification.unmark_kbs_fort_and_dependents(fort);
                                                assertion_count_int = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                fort_count = Numbers.add(fort_count, fort_count_int);
                                                assertion_count = Numbers.add(assertion_count, assertion_count_int);
                                            }
                                        }
                                    }
                                }
                            }
                            final SubLObject idx_$6 = idx;
                            if (kbs_utilities.NIL == id_index.id_index_sparse_objects_empty_p(idx_$6) || kbs_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kbs_utilities.$kw54$SKIP)) {
                                final SubLObject sparse = id_index.id_index_sparse_objects(idx_$6);
                                SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$6);
                                final SubLObject end_id = id_index.id_index_next_id(idx_$6);
                                final SubLObject v_default = (SubLObject)((kbs_utilities.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kbs_utilities.$kw54$SKIP)) ? kbs_utilities.NIL : kbs_utilities.$kw54$SKIP);
                                while (id2.numL(end_id)) {
                                    final SubLObject fort2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                                    if (kbs_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kbs_utilities.$kw54$SKIP) || kbs_utilities.NIL == id_index.id_index_tombstone_p(fort2)) {
                                        sofar = Numbers.add(sofar, (SubLObject)kbs_utilities.ONE_INTEGER);
                                        utilities_macros.note_percent_progress(sofar, total);
                                        if (kbs_utilities.NIL != kbs_identification.kbs_fort_p(fort2)) {
                                            SubLObject keepP2 = (SubLObject)kbs_utilities.NIL;
                                            if (kbs_utilities.NIL != kb_mapping_macros.do_term_index_key_validator(fort2, (SubLObject)kbs_utilities.NIL)) {
                                                final SubLObject iterator_var2 = kb_mapping_macros.new_term_final_index_spec_iterator(fort2, (SubLObject)kbs_utilities.NIL);
                                                SubLObject done_var2 = keepP2;
                                                final SubLObject token_var2 = (SubLObject)kbs_utilities.NIL;
                                                while (kbs_utilities.NIL == done_var2) {
                                                    final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                                    final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                                                    if (kbs_utilities.NIL != valid2) {
                                                        SubLObject final_index_iterator2 = (SubLObject)kbs_utilities.NIL;
                                                        try {
                                                            final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)kbs_utilities.NIL, (SubLObject)kbs_utilities.NIL, (SubLObject)kbs_utilities.NIL);
                                                            SubLObject done_var_$7 = keepP2;
                                                            final SubLObject token_var_$8 = (SubLObject)kbs_utilities.NIL;
                                                            while (kbs_utilities.NIL == done_var_$7) {
                                                                final SubLObject a2 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$8);
                                                                final SubLObject valid_$9 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$8.eql(a2));
                                                                if (kbs_utilities.NIL != valid_$9 && kbs_utilities.NIL != kb_mapping_macros.do_term_index_assertion_match_p(a2, final_index_spec2) && kbs_utilities.NIL == function_terms.tou_assertionP(a2) && kbs_utilities.NIL != kbs_identification.kbs_assertion_p(a2)) {
                                                                    keepP2 = (SubLObject)kbs_utilities.T;
                                                                }
                                                                done_var_$7 = (SubLObject)SubLObjectFactory.makeBoolean(kbs_utilities.NIL == valid_$9 || kbs_utilities.NIL != keepP2);
                                                            }
                                                        }
                                                        finally {
                                                            final SubLObject _prev_bind_0_$5 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                            try {
                                                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbs_utilities.T, thread);
                                                                final SubLObject _values2 = Values.getValuesAsVector();
                                                                if (kbs_utilities.NIL != final_index_iterator2) {
                                                                    kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                                                }
                                                                Values.restoreValuesFromVector(_values2);
                                                            }
                                                            finally {
                                                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$5, thread);
                                                            }
                                                        }
                                                    }
                                                    done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(kbs_utilities.NIL == valid2 || kbs_utilities.NIL != keepP2);
                                                }
                                            }
                                            if (kbs_utilities.NIL == keepP2) {
                                                PrintLow.format((SubLObject)kbs_utilities.T, (SubLObject)kbs_utilities.$str55$unmarking__A__, fort2);
                                                streams_high.force_output((SubLObject)kbs_utilities.UNPROVIDED);
                                                thread.resetMultipleValues();
                                                final SubLObject fort_count_int2 = kbs_identification.unmark_kbs_fort_and_dependents(fort2);
                                                final SubLObject assertion_count_int2 = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                fort_count = Numbers.add(fort_count, fort_count_int2);
                                                assertion_count = Numbers.add(assertion_count, assertion_count_int2);
                                            }
                                        }
                                    }
                                    id2 = Numbers.add(id2, (SubLObject)kbs_utilities.ONE_INTEGER);
                                }
                            }
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        table_var = cdolist_list_var.first();
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$6 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbs_utilities.T, thread);
                        final SubLObject _values3 = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values3);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$6, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1_$4, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_$3, thread);
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        PrintLow.format((SubLObject)kbs_utilities.T, (SubLObject)kbs_utilities.$str56$Unmarked__A_forts_and__A_assertio, fort_count, assertion_count);
        return Values.values(fort_count, assertion_count);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 20191L)
    public static SubLObject valid_opencyc_kbs_prettystrings_sqs_setupP() {
        return (SubLObject)SubLObjectFactory.makeBoolean(kbs_utilities.NIL != simple_queue_service.is_known_sqs_queueP(kbs_utilities.$opencyc_kbs_prettystring_term_queue$.getGlobalValue()) && kbs_utilities.NIL != simple_queue_service.is_known_sqs_queueP(kbs_utilities.$opencyc_kbs_prettystring_assert_queue$.getGlobalValue()));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 20407L)
    public static SubLObject opencyc_kbs_forts_assert_pretty_strings() {
        final SubLObject assert_acc = new_pretty_string_assert_sentence_accumulator();
        final SubLObject term_iterator = new_kbs_pretty_string_fort_iterator();
        if (kbs_utilities.NIL != valid_opencyc_kbs_prettystrings_sqs_setupP()) {
            opencyc_kbs_populate_prettystring_term_queue(term_iterator);
            opencyc_kbs_forts_contribute_pretty_strings();
            final SubLObject a_queue = kbs_utilities.$opencyc_kbs_prettystring_assert_queue$.getGlobalValue();
            final SubLObject result_it = iteration.new_transform_iterator(simple_queue_service.new_sqs_segment_iterator(simple_queue_service.new_sqs_iterator(a_queue, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED)), (SubLObject)kbs_utilities.$sym57$OPENCYC_KBS_RECONSTITUTE_PRETTY_STRING_IST, (SubLObject)kbs_utilities.UNPROVIDED);
            accumulation.accumulation_add_items(assert_acc, result_it);
            return (SubLObject)kbs_utilities.NIL;
        }
        opencyc_kbs_forts_work_on_pretty_strings(assert_acc, term_iterator);
        return accumulation.accumulation_size(assert_acc);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 21357L)
    public static SubLObject opencyc_kbs_forts_contribute_pretty_strings() {
        final SubLObject t_queue = kbs_utilities.$opencyc_kbs_prettystring_term_queue$.getGlobalValue();
        final SubLObject a_queue = kbs_utilities.$opencyc_kbs_prettystring_assert_queue$.getGlobalValue();
        final SubLObject term_iterator = simple_queue_service.new_sqs_segment_iterator(simple_queue_service.new_sqs_iterator(t_queue, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED));
        final SubLObject accumulator = accumulation.new_transform_accumulator(simple_queue_service.new_segment_accumulator(simple_queue_service.new_sqs_accumulator(a_queue, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED), (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED), (SubLObject)kbs_utilities.$sym58$OPENCYC_KBS_SIMPLIFY_PRETTY_STRING_IST, (SubLObject)kbs_utilities.UNPROVIDED);
        opencyc_kbs_forts_work_on_pretty_strings(accumulator, term_iterator);
        return accumulator;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 22035L)
    public static SubLObject opencyc_kbs_populate_prettystring_term_queue(final SubLObject term_iterator) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject t_queue = kbs_utilities.$opencyc_kbs_prettystring_term_queue$.getGlobalValue();
        final SubLObject estimate = simple_queue_service.sqs_pending_message_estimate(t_queue);
        if (kbs_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !estimate.isZero()) {
            Errors.error((SubLObject)kbs_utilities.$str43$Whoa__someone_already_populated_t, estimate);
        }
        final SubLObject accumulator = simple_queue_service.new_segment_accumulator(simple_queue_service.new_sqs_accumulator(t_queue, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED), (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED);
        accumulation.accumulation_add_items(accumulator, term_iterator);
        return (SubLObject)kbs_utilities.$kw44$PREPARED;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 22727L)
    public static SubLObject opencyc_kbs_simplify_pretty_string_ist(final SubLObject ist_sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ist_pred = (SubLObject)kbs_utilities.NIL;
        SubLObject mt = (SubLObject)kbs_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(ist_sentence, ist_sentence, (SubLObject)kbs_utilities.$list61);
        ist_pred = ist_sentence.first();
        SubLObject current = ist_sentence.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, ist_sentence, (SubLObject)kbs_utilities.$list61);
        mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, ist_sentence, (SubLObject)kbs_utilities.$list61);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject pretty_pred = (SubLObject)kbs_utilities.NIL;
        SubLObject v_term = (SubLObject)kbs_utilities.NIL;
        SubLObject string = (SubLObject)kbs_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, ist_sentence, (SubLObject)kbs_utilities.$list61);
        pretty_pred = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, ist_sentence, (SubLObject)kbs_utilities.$list61);
        v_term = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, ist_sentence, (SubLObject)kbs_utilities.$list61);
        string = current.first();
        current = current.rest();
        if (kbs_utilities.NIL == current) {
            current = temp;
            if (kbs_utilities.NIL == current) {
                if (kbs_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && !kbs_utilities.$const62$ist.eql(ist_pred)) {
                    Errors.error((SubLObject)kbs_utilities.$str63$Do_not_know_how_to_simplify_sente, ist_sentence);
                }
                final SubLObject mt_code = Sequences.position(mt, kbs_utilities.$opencyc_kbs_supported_prettystring_mts$.getGlobalValue(), (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED);
                final SubLObject pred_code = Sequences.position(pretty_pred, kbs_utilities.$opencyc_kbs_supported_prettystring_preds$.getGlobalValue(), (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED);
                return (SubLObject)ConsesLow.list((kbs_utilities.NIL == mt_code) ? mt : mt_code, (kbs_utilities.NIL == pred_code) ? pretty_pred : pred_code, v_term, string);
            }
            cdestructuring_bind.cdestructuring_bind_error(ist_sentence, (SubLObject)kbs_utilities.$list61);
        }
        else {
            cdestructuring_bind.cdestructuring_bind_error(ist_sentence, (SubLObject)kbs_utilities.$list61);
        }
        return (SubLObject)kbs_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 23322L)
    public static SubLObject opencyc_kbs_reconstitute_pretty_string_ist(final SubLObject item) {
        SubLObject mt_code = (SubLObject)kbs_utilities.NIL;
        SubLObject pred_code = (SubLObject)kbs_utilities.NIL;
        SubLObject v_term = (SubLObject)kbs_utilities.NIL;
        SubLObject string = (SubLObject)kbs_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(item, item, (SubLObject)kbs_utilities.$list64);
        mt_code = item.first();
        SubLObject current = item.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, item, (SubLObject)kbs_utilities.$list64);
        pred_code = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, item, (SubLObject)kbs_utilities.$list64);
        v_term = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, item, (SubLObject)kbs_utilities.$list64);
        string = current.first();
        current = current.rest();
        if (kbs_utilities.NIL == current) {
            final SubLObject mt = mt_code.isNumber() ? ConsesLow.nth(mt_code, kbs_utilities.$opencyc_kbs_supported_prettystring_mts$.getGlobalValue()) : mt_code;
            final SubLObject pred = pred_code.isNumber() ? ConsesLow.nth(pred_code, kbs_utilities.$opencyc_kbs_supported_prettystring_preds$.getGlobalValue()) : pred_code;
            return el_utilities.make_binary_formula(kbs_utilities.$const62$ist, mt, el_utilities.make_binary_formula(pred, v_term, string));
        }
        cdestructuring_bind.cdestructuring_bind_error(item, (SubLObject)kbs_utilities.$list64);
        return (SubLObject)kbs_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 23888L)
    public static SubLObject opencyc_kbs_forts_work_on_pretty_strings(final SubLObject accumulator, final SubLObject iterator) {
        final SubLObject approx_total = kbs_identification.kbs_fort_count();
        final SubLObject message = Sequences.cconcatenate((SubLObject)kbs_utilities.$str65$Asserting_pretty_string_assertion, new SubLObject[] { format_nil.format_nil_a_no_copy(approx_total), kbs_utilities.$str66$_KBS_FORTs });
        pph_utilities.accumulate_pretty_strings_from_iterator(iterator, accumulator, message, approx_total, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED);
        return accumulation.accumulation_size(accumulator);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 24393L)
    public static SubLObject new_kbs_pretty_string_fort_iterator() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kbs_utilities.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && kbs_utilities.NIL == kbs_identification.kbs_forts()) {
            Errors.error((SubLObject)kbs_utilities.$str67$Cannot_be_used_without_identifyin);
        }
        return iteration.new_filter_iterator(iteration.new_list_iterator(kbs_identification.kbs_forts()), (SubLObject)kbs_utilities.$sym68$KBS_PRETTY_STRING_FORT_, (SubLObject)kbs_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 24704L)
    public static SubLObject kbs_pretty_string_fortP(final SubLObject fort) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kbs_utilities.NIL == term.fast_reified_skolemP(fort));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 24804L)
    public static SubLObject new_pretty_string_assert_sentence_accumulator() {
        return accumulation.new_accumulator((SubLObject)kbs_utilities.ZERO_INTEGER, (SubLObject)kbs_utilities.$sym69$PRETTY_STRING_ASSERT_SENTENCE_ACCUMULATOR_RESET, (SubLObject)kbs_utilities.$sym70$PRETTY_STRING_ASSERT_SENTENCE_ACCUMULATOR_ADD, (SubLObject)kbs_utilities.$sym71$PRETTY_STRING_ASSERT_SENTENCE_ACCUMULATOR_SIZE, (SubLObject)kbs_utilities.$sym72$PRETTY_STRING_ASSERT_SENTENCE_ACCUMULATOR_CONTENTS, (SubLObject)kbs_utilities.$sym73$PRETTY_STRING_ASSERT_SENTENCE_ACCUMULATOR_ITERATOR, (SubLObject)kbs_utilities.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 25362L)
    public static SubLObject pretty_string_assert_sentence_accumulator_reset(final SubLObject old_state) {
        Errors.error((SubLObject)kbs_utilities.$str74$Reset_operation_not_supported_for);
        return (SubLObject)kbs_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 25571L)
    public static SubLObject pretty_string_assert_sentence_accumulator_add(final SubLObject state, final SubLObject element) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert kbs_utilities.NIL != el_utilities.ist_sentence_p(element, (SubLObject)kbs_utilities.UNPROVIDED) : element;
        final SubLObject _prev_bind_0 = after_adding.$after_addings_disabledP$.currentBinding(thread);
        try {
            after_adding.$after_addings_disabledP$.bind((SubLObject)kbs_utilities.T, thread);
            cyc_kernel.cyc_assert_wff(element, kbs_utilities.$const76$BaseKB, (SubLObject)kbs_utilities.$list77);
        }
        finally {
            after_adding.$after_addings_disabledP$.rebind(_prev_bind_0, thread);
        }
        return number_utilities.f_1X(state);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 25844L)
    public static SubLObject pretty_string_assert_sentence_accumulator_size(final SubLObject state) {
        return state;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 25939L)
    public static SubLObject pretty_string_assert_sentence_accumulator_contents(final SubLObject state, SubLObject resetP) {
        if (resetP == kbs_utilities.UNPROVIDED) {
            resetP = (SubLObject)kbs_utilities.NIL;
        }
        Errors.error((SubLObject)kbs_utilities.$str78$Get_contents_operation_not_suppor);
        return (SubLObject)kbs_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 26174L)
    public static SubLObject pretty_string_assert_sentence_accumulator_iterator(final SubLObject state) {
        Errors.error((SubLObject)kbs_utilities.$str79$Get_iterator_operation_not_suppor);
        return (SubLObject)kbs_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 26673L)
    public static SubLObject opencyc_kbs_remove_excluded_synonymous_external_concept_assertions() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)kbs_utilities.ZERO_INTEGER;
        SubLObject pass_number = (SubLObject)kbs_utilities.ZERO_INTEGER;
        SubLObject last_count = (SubLObject)kbs_utilities.MINUS_ONE_INTEGER;
        final SubLObject permitted_sources = (kbs_utilities.NIL != constants_high.find_constant((SubLObject)kbs_utilities.$str81$OpenCycPermittedSource)) ? isa.all_instances_in_all_mts(constants_high.find_constant((SubLObject)kbs_utilities.$str81$OpenCycPermittedSource)) : narts_high.nart_substitute(kbs_utilities.$opencyc_permitted_sources$.getGlobalValue());
        while (kbs_utilities.NIL != subl_promotions.non_zero_integer_p(last_count)) {
            last_count = (SubLObject)kbs_utilities.ZERO_INTEGER;
            final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
            final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
            try {
                mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kbs_utilities.$sym51$RELEVANT_MT_IS_EVERYTHING, thread);
                mt_relevance_macros.$mt$.bind(kbs_utilities.$const52$EverythingPSC, thread);
                pass_number = Numbers.add(pass_number, (SubLObject)kbs_utilities.ONE_INTEGER);
                final SubLObject list_var = kb_mapping.gather_predicate_extent_index(kbs_utilities.$const82$synonymousExternalConcept, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED);
                final SubLObject _prev_bind_0_$16 = utilities_macros.$progress_note$.currentBinding(thread);
                final SubLObject _prev_bind_1_$17 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$progress_total$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
                final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                try {
                    utilities_macros.$progress_note$.bind((SubLObject)((kbs_utilities.NIL != Sequences.cconcatenate((SubLObject)kbs_utilities.$str83$Removing_non_opencyc_related___sy, new SubLObject[] { format_nil.format_nil_a_no_copy(pass_number), kbs_utilities.$str84$_ })) ? Sequences.cconcatenate((SubLObject)kbs_utilities.$str83$Removing_non_opencyc_related___sy, new SubLObject[] { format_nil.format_nil_a_no_copy(pass_number), kbs_utilities.$str84$_ }) : kbs_utilities.$str85$cdolist), thread);
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                    utilities_macros.$progress_sofar$.bind((SubLObject)kbs_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_index$.bind((SubLObject)kbs_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kbs_utilities.NIL, thread);
                    utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kbs_utilities.T, thread);
                    utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                    try {
                        utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                        SubLObject csome_list_var = list_var;
                        SubLObject ass = (SubLObject)kbs_utilities.NIL;
                        ass = csome_list_var.first();
                        while (kbs_utilities.NIL != csome_list_var) {
                            if (kbs_utilities.NIL != opencyc_kbs_possibly_remove_excluded_synonymous_external_concept_assertion(ass, permitted_sources)) {
                                result = Numbers.add(result, (SubLObject)kbs_utilities.ONE_INTEGER);
                                last_count = Numbers.add(last_count, (SubLObject)kbs_utilities.ONE_INTEGER);
                            }
                            utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)kbs_utilities.ONE_INTEGER), thread);
                            utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                            csome_list_var = csome_list_var.rest();
                            ass = csome_list_var.first();
                        }
                    }
                    finally {
                        final SubLObject _prev_bind_0_$17 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                        try {
                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbs_utilities.T, thread);
                            final SubLObject _values = Values.getValuesAsVector();
                            utilities_macros.noting_percent_progress_postamble();
                            Values.restoreValuesFromVector(_values);
                        }
                        finally {
                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$17, thread);
                        }
                    }
                }
                finally {
                    utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                    utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                    utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                    utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                    utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
                    utilities_macros.$progress_total$.rebind(_prev_bind_3, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_1_$17, thread);
                    utilities_macros.$progress_note$.rebind(_prev_bind_0_$16, thread);
                }
            }
            finally {
                mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
                mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 27519L)
    public static SubLObject opencyc_kbs_possibly_remove_excluded_synonymous_external_concept_assertion(final SubLObject ass, final SubLObject permitted_sources) {
        if (kbs_utilities.NIL != assertion_handles.valid_assertionP(ass, (SubLObject)kbs_utilities.UNPROVIDED)) {
            final SubLObject source = assertions_high.gaf_arg2(ass);
            if (kbs_utilities.NIL == list_utilities.member_eqP(source, permitted_sources) && kbs_utilities.NIL != ((kbs_utilities.NIL == assertions_high.asserted_assertionP(ass)) ? cyc_kernel.cyc_remove_all_arguments(canon_tl.assertion_tl_ist_formula(ass), assertions_high.assertion_mt(ass)) : cyc_kernel.cyc_unassert(canon_tl.assertion_tl_ist_formula(ass), assertions_high.assertion_mt(ass)))) {
                return (SubLObject)kbs_utilities.T;
            }
        }
        return (SubLObject)kbs_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 27973L)
    public static SubLObject opencyc_kbs_prepare_caches() {
        tva_cache.ensure_tva_cache_created(kbs_utilities.$const86$broaderTerm_NonTaxonomic, (SubLObject)kbs_utilities.ONE_INTEGER);
        return (SubLObject)kbs_utilities.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 28584L)
    public static SubLObject researchcyc_kill_expensive_true_rule_templates() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject cdolist_list_var = (SubLObject)ConsesLow.list(narts_high.find_nart((SubLObject)kbs_utilities.$list99));
        SubLObject v_term = (SubLObject)kbs_utilities.NIL;
        v_term = cdolist_list_var.first();
        while (kbs_utilities.NIL != cdolist_list_var) {
            if (kbs_utilities.NIL != forts.fort_p(v_term)) {
                final SubLObject kb_object_count_list_1 = kb_utilities.kb_object_count_list();
                final SubLObject str = Sequences.cconcatenate((SubLObject)kbs_utilities.$str87$Killing_, format_nil.format_nil_s_no_copy(v_term));
                final SubLObject _prev_bind_0 = utilities_macros.$progress_start_time$.currentBinding(thread);
                final SubLObject _prev_bind_2 = utilities_macros.$progress_last_pacification_time$.currentBinding(thread);
                final SubLObject _prev_bind_3 = utilities_macros.$progress_elapsed_seconds_for_notification$.currentBinding(thread);
                final SubLObject _prev_bind_4 = utilities_macros.$progress_notification_count$.currentBinding(thread);
                final SubLObject _prev_bind_5 = utilities_macros.$progress_pacifications_since_last_nl$.currentBinding(thread);
                final SubLObject _prev_bind_6 = utilities_macros.$progress_count$.currentBinding(thread);
                final SubLObject _prev_bind_7 = utilities_macros.$is_noting_progressP$.currentBinding(thread);
                final SubLObject _prev_bind_8 = utilities_macros.$silent_progressP$.currentBinding(thread);
                try {
                    utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                    utilities_macros.$progress_last_pacification_time$.bind(utilities_macros.$progress_start_time$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.bind(utilities_macros.$suppress_all_progress_faster_than_seconds$.getDynamicValue(thread), thread);
                    utilities_macros.$progress_notification_count$.bind((SubLObject)kbs_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.bind((SubLObject)kbs_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$progress_count$.bind((SubLObject)kbs_utilities.ZERO_INTEGER, thread);
                    utilities_macros.$is_noting_progressP$.bind((SubLObject)kbs_utilities.T, thread);
                    utilities_macros.$silent_progressP$.bind((SubLObject)((kbs_utilities.NIL != str) ? utilities_macros.$silent_progressP$.getDynamicValue(thread) : kbs_utilities.T), thread);
                    utilities_macros.noting_progress_preamble(str);
                    fi.fi_kill_int(v_term);
                    utilities_macros.noting_progress_postamble();
                }
                finally {
                    utilities_macros.$silent_progressP$.rebind(_prev_bind_8, thread);
                    utilities_macros.$is_noting_progressP$.rebind(_prev_bind_7, thread);
                    utilities_macros.$progress_count$.rebind(_prev_bind_6, thread);
                    utilities_macros.$progress_pacifications_since_last_nl$.rebind(_prev_bind_5, thread);
                    utilities_macros.$progress_notification_count$.rebind(_prev_bind_4, thread);
                    utilities_macros.$progress_elapsed_seconds_for_notification$.rebind(_prev_bind_3, thread);
                    utilities_macros.$progress_last_pacification_time$.rebind(_prev_bind_2, thread);
                    utilities_macros.$progress_start_time$.rebind(_prev_bind_0, thread);
                }
                final SubLObject kb_object_count_list_2 = kb_utilities.kb_object_count_list();
                final SubLObject new_constant_count = kb_utilities.kb_object_count_lists_new_constant_count(kb_object_count_list_2, kb_object_count_list_1);
                final SubLObject new_nart_count = kb_utilities.kb_object_count_lists_new_nart_count(kb_object_count_list_2, kb_object_count_list_1);
                final SubLObject new_assertion_count = kb_utilities.kb_object_count_lists_new_assertion_count(kb_object_count_list_2, kb_object_count_list_1);
                final SubLObject new_kb_hl_support_count = kb_utilities.kb_object_count_lists_new_kb_hl_support_count(kb_object_count_list_2, kb_object_count_list_1);
                final SubLObject new_deduction_count = kb_utilities.kb_object_count_lists_new_deduction_count(kb_object_count_list_2, kb_object_count_list_1);
                if (kbs_utilities.NIL != subl_promotions.non_zero_integer_p(new_constant_count) || kbs_utilities.NIL != subl_promotions.non_zero_integer_p(new_nart_count) || kbs_utilities.NIL != subl_promotions.non_zero_integer_p(new_assertion_count) || kbs_utilities.NIL != subl_promotions.non_zero_integer_p(new_kb_hl_support_count) || kbs_utilities.NIL != subl_promotions.non_zero_integer_p(new_deduction_count)) {
                    if (kbs_utilities.NIL.isString()) {
                        PrintLow.format((SubLObject)kbs_utilities.T, (SubLObject)kbs_utilities.$str89$___A__, (SubLObject)kbs_utilities.NIL);
                    }
                    if (kbs_utilities.NIL != subl_promotions.non_zero_integer_p(new_constant_count)) {
                        PrintLow.format((SubLObject)kbs_utilities.T, (SubLObject)kbs_utilities.$str90$___s_constant_A__A__, new SubLObject[] { Numbers.abs(new_constant_count), Numbers.abs(new_constant_count).numG((SubLObject)kbs_utilities.ONE_INTEGER) ? kbs_utilities.$str91$s_were : kbs_utilities.$str92$_was, (kbs_utilities.NIL != subl_promotions.positive_integer_p(new_constant_count)) ? kbs_utilities.$str93$created : kbs_utilities.$str94$destroyed });
                    }
                    if (kbs_utilities.NIL != subl_promotions.non_zero_integer_p(new_nart_count)) {
                        PrintLow.format((SubLObject)kbs_utilities.T, (SubLObject)kbs_utilities.$str95$___s_nart_A__A__, new SubLObject[] { Numbers.abs(new_nart_count), Numbers.abs(new_nart_count).numG((SubLObject)kbs_utilities.ONE_INTEGER) ? kbs_utilities.$str91$s_were : kbs_utilities.$str92$_was, (kbs_utilities.NIL != subl_promotions.positive_integer_p(new_nart_count)) ? kbs_utilities.$str93$created : kbs_utilities.$str94$destroyed });
                    }
                    if (kbs_utilities.NIL != subl_promotions.non_zero_integer_p(new_assertion_count)) {
                        PrintLow.format((SubLObject)kbs_utilities.T, (SubLObject)kbs_utilities.$str96$___s_assertion_A__A__, new SubLObject[] { Numbers.abs(new_assertion_count), Numbers.abs(new_assertion_count).numG((SubLObject)kbs_utilities.ONE_INTEGER) ? kbs_utilities.$str91$s_were : kbs_utilities.$str92$_was, (kbs_utilities.NIL != subl_promotions.positive_integer_p(new_assertion_count)) ? kbs_utilities.$str93$created : kbs_utilities.$str94$destroyed });
                    }
                    if (kbs_utilities.NIL != subl_promotions.non_zero_integer_p(new_kb_hl_support_count)) {
                        PrintLow.format((SubLObject)kbs_utilities.T, (SubLObject)kbs_utilities.$str97$___s_kb_hl_support_A__A__, new SubLObject[] { Numbers.abs(new_kb_hl_support_count), Numbers.abs(new_kb_hl_support_count).numG((SubLObject)kbs_utilities.ONE_INTEGER) ? kbs_utilities.$str91$s_were : kbs_utilities.$str92$_was, (kbs_utilities.NIL != subl_promotions.positive_integer_p(new_kb_hl_support_count)) ? kbs_utilities.$str93$created : kbs_utilities.$str94$destroyed });
                    }
                    if (kbs_utilities.NIL != subl_promotions.non_zero_integer_p(new_deduction_count)) {
                        PrintLow.format((SubLObject)kbs_utilities.T, (SubLObject)kbs_utilities.$str98$___s_deduction_A__A__, new SubLObject[] { Numbers.abs(new_deduction_count), Numbers.abs(new_deduction_count).numG((SubLObject)kbs_utilities.ONE_INTEGER) ? kbs_utilities.$str91$s_were : kbs_utilities.$str92$_was, (kbs_utilities.NIL != subl_promotions.positive_integer_p(new_deduction_count)) ? kbs_utilities.$str93$created : kbs_utilities.$str94$destroyed });
                    }
                }
                else if (kbs_utilities.NIL.isString()) {
                    PrintLow.format((SubLObject)kbs_utilities.T, (SubLObject)kbs_utilities.$str89$___A__, (SubLObject)kbs_utilities.NIL);
                }
                streams_high.force_output((SubLObject)kbs_utilities.T);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        }
        return (SubLObject)kbs_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 28966L)
    public static SubLObject researchcyc_kbs_remove_unwanted_tkb_narts() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        PrintLow.format((SubLObject)kbs_utilities.T, (SubLObject)kbs_utilities.$str100$Unmarking_instances_of___Terroris);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kbs_utilities.$sym51$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(kbs_utilities.$const52$EverythingPSC, thread);
            SubLObject node_var = kbs_utilities.$const101$TerroristAgent;
            final SubLObject _prev_bind_0_$19 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            final SubLObject _prev_bind_1_$20 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
            try {
                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(kbs_utilities.$const102$isa), thread);
                sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    SubLObject node_var_$21 = node_var;
                    final SubLObject deck_type = (SubLObject)kbs_utilities.$kw105$STACK;
                    final SubLObject recur_deck = deck.create_deck(deck_type);
                    final SubLObject _prev_bind_0_$20 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject tv_var = (SubLObject)kbs_utilities.NIL;
                            final SubLObject _prev_bind_0_$21 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$21 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_tv$.bind((kbs_utilities.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((kbs_utilities.NIL != tv_var) ? kbs_utilities.$sym106$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                                if (kbs_utilities.NIL != tv_var && kbs_utilities.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && kbs_utilities.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                    if (pcase_var.eql((SubLObject)kbs_utilities.$kw107$ERROR)) {
                                        sbhl_paranoia.sbhl_error((SubLObject)kbs_utilities.ONE_INTEGER, (SubLObject)kbs_utilities.$str108$_A_is_not_a__A, tv_var, (SubLObject)kbs_utilities.$sym109$SBHL_TRUE_TV_P, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED);
                                    }
                                    else if (pcase_var.eql((SubLObject)kbs_utilities.$kw110$CERROR)) {
                                        sbhl_paranoia.sbhl_cerror((SubLObject)kbs_utilities.ONE_INTEGER, (SubLObject)kbs_utilities.$str111$continue_anyway, (SubLObject)kbs_utilities.$str108$_A_is_not_a__A, tv_var, (SubLObject)kbs_utilities.$sym109$SBHL_TRUE_TV_P, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED);
                                    }
                                    else if (pcase_var.eql((SubLObject)kbs_utilities.$kw112$WARN)) {
                                        Errors.warn((SubLObject)kbs_utilities.$str108$_A_is_not_a__A, tv_var, (SubLObject)kbs_utilities.$sym109$SBHL_TRUE_TV_P);
                                    }
                                    else {
                                        Errors.warn((SubLObject)kbs_utilities.$str113$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                        Errors.cerror((SubLObject)kbs_utilities.$str111$continue_anyway, (SubLObject)kbs_utilities.$str108$_A_is_not_a__A, tv_var, (SubLObject)kbs_utilities.$sym109$SBHL_TRUE_TV_P);
                                    }
                                }
                                final SubLObject _prev_bind_0_$22 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$22 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(kbs_utilities.$const102$isa)), thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(kbs_utilities.$const102$isa))), thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(kbs_utilities.$const102$isa))), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)kbs_utilities.NIL, thread);
                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(kbs_utilities.$const102$isa)), thread);
                                    if (kbs_utilities.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || kbs_utilities.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module((SubLObject)kbs_utilities.UNPROVIDED))) {
                                        final SubLObject _prev_bind_0_$23 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$23 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$29 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(kbs_utilities.$const102$isa))), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)kbs_utilities.NIL, thread);
                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$21, (SubLObject)kbs_utilities.UNPROVIDED);
                                            while (kbs_utilities.NIL != node_var_$21) {
                                                final SubLObject tt_node_var = node_var_$21;
                                                SubLObject cdolist_list_var;
                                                final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(kbs_utilities.$const102$isa));
                                                SubLObject module_var = (SubLObject)kbs_utilities.NIL;
                                                module_var = cdolist_list_var.first();
                                                while (kbs_utilities.NIL != cdolist_list_var) {
                                                    final SubLObject _prev_bind_0_$24 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$24 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((kbs_utilities.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(kbs_utilities.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                        final SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                        if (kbs_utilities.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)kbs_utilities.UNPROVIDED));
                                                            if (kbs_utilities.NIL != d_link) {
                                                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(kbs_utilities.$const102$isa)), sbhl_module_vars.get_sbhl_module((SubLObject)kbs_utilities.UNPROVIDED));
                                                                if (kbs_utilities.NIL != mt_links) {
                                                                    SubLObject iteration_state;
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); kbs_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        final SubLObject tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (kbs_utilities.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                            final SubLObject _prev_bind_0_$25 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                SubLObject iteration_state_$33;
                                                                                for (iteration_state_$33 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); kbs_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$33); iteration_state_$33 = dictionary_contents.do_dictionary_contents_next(iteration_state_$33)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$33);
                                                                                    final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (kbs_utilities.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        final SubLObject _prev_bind_0_$26 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            final SubLObject sol = link_nodes;
                                                                                            if (kbs_utilities.NIL != set.set_p(sol)) {
                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state;
                                                                                                SubLObject fort;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)kbs_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); kbs_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    fort = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if (kbs_utilities.NIL != set_contents.do_set_contents_element_validP(state, fort) && kbs_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(fort, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(fort, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (kbs_utilities.NIL != forts.fort_p(fort)) {
                                                                                                            kbs_identification.unmark_kbs_fort(fort);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (sol.isList()) {
                                                                                                SubLObject csome_list_var = sol;
                                                                                                SubLObject fort2 = (SubLObject)kbs_utilities.NIL;
                                                                                                fort2 = csome_list_var.first();
                                                                                                while (kbs_utilities.NIL != csome_list_var) {
                                                                                                    if (kbs_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(fort2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(fort2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (kbs_utilities.NIL != forts.fort_p(fort2)) {
                                                                                                            kbs_identification.unmark_kbs_fort(fort2);
                                                                                                        }
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    fort2 = csome_list_var.first();
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)kbs_utilities.$str114$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$26, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$33);
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$25, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            }
                                                            else {
                                                                sbhl_paranoia.sbhl_error((SubLObject)kbs_utilities.FIVE_INTEGER, (SubLObject)kbs_utilities.$str115$attempting_to_bind_direction_link, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED);
                                                            }
                                                            if (kbs_utilities.NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module((SubLObject)kbs_utilities.UNPROVIDED))) {
                                                                SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                SubLObject instance_tuple = (SubLObject)kbs_utilities.NIL;
                                                                instance_tuple = csome_list_var2.first();
                                                                while (kbs_utilities.NIL != csome_list_var2) {
                                                                    SubLObject current;
                                                                    final SubLObject datum = current = instance_tuple;
                                                                    SubLObject link_node = (SubLObject)kbs_utilities.NIL;
                                                                    SubLObject mt2 = (SubLObject)kbs_utilities.NIL;
                                                                    SubLObject tv2 = (SubLObject)kbs_utilities.NIL;
                                                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kbs_utilities.$list116);
                                                                    link_node = current.first();
                                                                    current = current.rest();
                                                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kbs_utilities.$list116);
                                                                    mt2 = current.first();
                                                                    current = current.rest();
                                                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kbs_utilities.$list116);
                                                                    tv2 = current.first();
                                                                    current = current.rest();
                                                                    if (kbs_utilities.NIL == current) {
                                                                        if (kbs_utilities.NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                            final SubLObject _prev_bind_0_$27 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                                if (kbs_utilities.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                    final SubLObject _prev_bind_0_$28 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                        final SubLObject sol;
                                                                                        final SubLObject link_nodes2 = sol = (SubLObject)ConsesLow.list(link_node);
                                                                                        if (kbs_utilities.NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject fort;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)kbs_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); kbs_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                fort = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if (kbs_utilities.NIL != set_contents.do_set_contents_element_validP(state, fort) && kbs_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(fort, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(fort, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if (kbs_utilities.NIL != forts.fort_p(fort)) {
                                                                                                        kbs_identification.unmark_kbs_fort(fort);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol.isList()) {
                                                                                            SubLObject csome_list_var_$37 = sol;
                                                                                            SubLObject fort2 = (SubLObject)kbs_utilities.NIL;
                                                                                            fort2 = csome_list_var_$37.first();
                                                                                            while (kbs_utilities.NIL != csome_list_var_$37) {
                                                                                                if (kbs_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(fort2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(fort2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if (kbs_utilities.NIL != forts.fort_p(fort2)) {
                                                                                                        kbs_identification.unmark_kbs_fort(fort2);
                                                                                                    }
                                                                                                }
                                                                                                csome_list_var_$37 = csome_list_var_$37.rest();
                                                                                                fort2 = csome_list_var_$37.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)kbs_utilities.$str114$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$28, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$27, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    else {
                                                                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kbs_utilities.$list116);
                                                                    }
                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                    instance_tuple = csome_list_var2.first();
                                                                }
                                                            }
                                                        }
                                                        else if (kbs_utilities.NIL != obsolete.cnat_p(node, (SubLObject)kbs_utilities.UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$38;
                                                            final SubLObject new_list = cdolist_list_var_$38 = ((kbs_utilities.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(kbs_utilities.$const102$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)kbs_utilities.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(kbs_utilities.$const102$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)kbs_utilities.UNPROVIDED)));
                                                            SubLObject generating_fn = (SubLObject)kbs_utilities.NIL;
                                                            generating_fn = cdolist_list_var_$38.first();
                                                            while (kbs_utilities.NIL != cdolist_list_var_$38) {
                                                                final SubLObject _prev_bind_0_$29 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    final SubLObject sol2;
                                                                    final SubLObject link_nodes3 = sol2 = Functions.funcall(generating_fn, node);
                                                                    if (kbs_utilities.NIL != set.set_p(sol2)) {
                                                                        final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                        SubLObject basis_object2;
                                                                        SubLObject state2;
                                                                        SubLObject fort3;
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)kbs_utilities.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); kbs_utilities.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            fort3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if (kbs_utilities.NIL != set_contents.do_set_contents_element_validP(state2, fort3) && kbs_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(fort3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(fort3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                if (kbs_utilities.NIL != forts.fort_p(fort3)) {
                                                                                    kbs_identification.unmark_kbs_fort(fort3);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (sol2.isList()) {
                                                                        SubLObject csome_list_var3 = sol2;
                                                                        SubLObject fort4 = (SubLObject)kbs_utilities.NIL;
                                                                        fort4 = csome_list_var3.first();
                                                                        while (kbs_utilities.NIL != csome_list_var3) {
                                                                            if (kbs_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(fort4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(fort4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                if (kbs_utilities.NIL != forts.fort_p(fort4)) {
                                                                                    kbs_identification.unmark_kbs_fort(fort4);
                                                                                }
                                                                            }
                                                                            csome_list_var3 = csome_list_var3.rest();
                                                                            fort4 = csome_list_var3.first();
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)kbs_utilities.$str114$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                    }
                                                                }
                                                                finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$29, thread);
                                                                }
                                                                cdolist_list_var_$38 = cdolist_list_var_$38.rest();
                                                                generating_fn = cdolist_list_var_$38.first();
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$24, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$24, thread);
                                                    }
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    module_var = cdolist_list_var.first();
                                                }
                                                SubLObject cdolist_list_var2;
                                                final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(kbs_utilities.$const102$isa)));
                                                SubLObject module_var2 = (SubLObject)kbs_utilities.NIL;
                                                module_var2 = cdolist_list_var2.first();
                                                while (kbs_utilities.NIL != cdolist_list_var2) {
                                                    final SubLObject _prev_bind_0_$30 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$25 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((kbs_utilities.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(kbs_utilities.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                        final SubLObject node2 = function_terms.naut_to_nart(node_var_$21);
                                                        if (kbs_utilities.NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                            final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module((SubLObject)kbs_utilities.UNPROVIDED));
                                                            if (kbs_utilities.NIL != d_link2) {
                                                                final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)kbs_utilities.UNPROVIDED));
                                                                if (kbs_utilities.NIL != mt_links2) {
                                                                    SubLObject iteration_state2;
                                                                    for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); kbs_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                        final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (kbs_utilities.NIL != mt_relevance_macros.relevant_mtP(mt3)) {
                                                                            final SubLObject _prev_bind_0_$31 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                                SubLObject iteration_state_$34;
                                                                                for (iteration_state_$34 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); kbs_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$34); iteration_state_$34 = dictionary_contents.do_dictionary_contents_next(iteration_state_$34)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$34);
                                                                                    final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (kbs_utilities.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                        final SubLObject _prev_bind_0_$32 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                            final SubLObject sol3 = link_nodes4;
                                                                                            if (kbs_utilities.NIL != set.set_p(sol3)) {
                                                                                                final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                                SubLObject basis_object3;
                                                                                                SubLObject state3;
                                                                                                SubLObject node_vars_link_node;
                                                                                                for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = (SubLObject)kbs_utilities.NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); kbs_utilities.NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                    if (kbs_utilities.NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node) && kbs_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)kbs_utilities.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)kbs_utilities.UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (sol3.isList()) {
                                                                                                SubLObject csome_list_var4 = sol3;
                                                                                                SubLObject node_vars_link_node2 = (SubLObject)kbs_utilities.NIL;
                                                                                                node_vars_link_node2 = csome_list_var4.first();
                                                                                                while (kbs_utilities.NIL != csome_list_var4) {
                                                                                                    if (kbs_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)kbs_utilities.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)kbs_utilities.UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                    }
                                                                                                    csome_list_var4 = csome_list_var4.rest();
                                                                                                    node_vars_link_node2 = csome_list_var4.first();
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)kbs_utilities.$str114$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$32, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$34);
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$31, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                }
                                                            }
                                                            else {
                                                                sbhl_paranoia.sbhl_error((SubLObject)kbs_utilities.FIVE_INTEGER, (SubLObject)kbs_utilities.$str115$attempting_to_bind_direction_link, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED);
                                                            }
                                                        }
                                                        else if (kbs_utilities.NIL != obsolete.cnat_p(node2, (SubLObject)kbs_utilities.UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$39;
                                                            final SubLObject new_list2 = cdolist_list_var_$39 = ((kbs_utilities.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)kbs_utilities.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)kbs_utilities.UNPROVIDED)));
                                                            SubLObject generating_fn2 = (SubLObject)kbs_utilities.NIL;
                                                            generating_fn2 = cdolist_list_var_$39.first();
                                                            while (kbs_utilities.NIL != cdolist_list_var_$39) {
                                                                final SubLObject _prev_bind_0_$33 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                    final SubLObject sol4;
                                                                    final SubLObject link_nodes5 = sol4 = Functions.funcall(generating_fn2, node2);
                                                                    if (kbs_utilities.NIL != set.set_p(sol4)) {
                                                                        final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                        SubLObject basis_object4;
                                                                        SubLObject state4;
                                                                        SubLObject node_vars_link_node3;
                                                                        for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = (SubLObject)kbs_utilities.NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); kbs_utilities.NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                            if (kbs_utilities.NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3) && kbs_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)kbs_utilities.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)kbs_utilities.UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node3, recur_deck);
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (sol4.isList()) {
                                                                        SubLObject csome_list_var5 = sol4;
                                                                        SubLObject node_vars_link_node4 = (SubLObject)kbs_utilities.NIL;
                                                                        node_vars_link_node4 = csome_list_var5.first();
                                                                        while (kbs_utilities.NIL != csome_list_var5) {
                                                                            if (kbs_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)kbs_utilities.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)kbs_utilities.UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node4, recur_deck);
                                                                            }
                                                                            csome_list_var5 = csome_list_var5.rest();
                                                                            node_vars_link_node4 = csome_list_var5.first();
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)kbs_utilities.$str114$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                    }
                                                                }
                                                                finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$33, thread);
                                                                }
                                                                cdolist_list_var_$39 = cdolist_list_var_$39.rest();
                                                                generating_fn2 = cdolist_list_var_$39.first();
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$25, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$30, thread);
                                                    }
                                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                                    module_var2 = cdolist_list_var2.first();
                                                }
                                                node_var_$21 = deck.deck_pop(recur_deck);
                                            }
                                        }
                                        finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$29, thread);
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$23, thread);
                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$23, thread);
                                        }
                                    }
                                    else {
                                        sbhl_paranoia.sbhl_warn((SubLObject)kbs_utilities.TWO_INTEGER, (SubLObject)kbs_utilities.$str117$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)kbs_utilities.UNPROVIDED)), (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED);
                                    }
                                }
                                finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$22, thread);
                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$22, thread);
                                }
                            }
                            finally {
                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$21, thread);
                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$21, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$34 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbs_utilities.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$34, thread);
                            }
                        }
                    }
                    finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$20, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$35 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbs_utilities.T, thread);
                        final SubLObject _values2 = Values.getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                        Values.restoreValuesFromVector(_values2);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$35, thread);
                    }
                }
            }
            finally {
                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1_$20, thread);
                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$19, thread);
            }
            node_var = kbs_utilities.$const118$TerroristAct;
            final SubLObject _prev_bind_0_$36 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            final SubLObject _prev_bind_1_$26 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
            try {
                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(kbs_utilities.$const102$isa), thread);
                sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    SubLObject node_var_$22 = node_var;
                    final SubLObject deck_type = (SubLObject)kbs_utilities.$kw105$STACK;
                    final SubLObject recur_deck = deck.create_deck(deck_type);
                    final SubLObject _prev_bind_0_$37 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject tv_var = (SubLObject)kbs_utilities.NIL;
                            final SubLObject _prev_bind_0_$38 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$27 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_tv$.bind((kbs_utilities.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((kbs_utilities.NIL != tv_var) ? kbs_utilities.$sym106$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                                if (kbs_utilities.NIL != tv_var && kbs_utilities.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && kbs_utilities.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                    if (pcase_var.eql((SubLObject)kbs_utilities.$kw107$ERROR)) {
                                        sbhl_paranoia.sbhl_error((SubLObject)kbs_utilities.ONE_INTEGER, (SubLObject)kbs_utilities.$str108$_A_is_not_a__A, tv_var, (SubLObject)kbs_utilities.$sym109$SBHL_TRUE_TV_P, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED);
                                    }
                                    else if (pcase_var.eql((SubLObject)kbs_utilities.$kw110$CERROR)) {
                                        sbhl_paranoia.sbhl_cerror((SubLObject)kbs_utilities.ONE_INTEGER, (SubLObject)kbs_utilities.$str111$continue_anyway, (SubLObject)kbs_utilities.$str108$_A_is_not_a__A, tv_var, (SubLObject)kbs_utilities.$sym109$SBHL_TRUE_TV_P, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED);
                                    }
                                    else if (pcase_var.eql((SubLObject)kbs_utilities.$kw112$WARN)) {
                                        Errors.warn((SubLObject)kbs_utilities.$str108$_A_is_not_a__A, tv_var, (SubLObject)kbs_utilities.$sym109$SBHL_TRUE_TV_P);
                                    }
                                    else {
                                        Errors.warn((SubLObject)kbs_utilities.$str113$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                        Errors.cerror((SubLObject)kbs_utilities.$str111$continue_anyway, (SubLObject)kbs_utilities.$str108$_A_is_not_a__A, tv_var, (SubLObject)kbs_utilities.$sym109$SBHL_TRUE_TV_P);
                                    }
                                }
                                final SubLObject _prev_bind_0_$39 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$28 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(kbs_utilities.$const102$isa)), thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(kbs_utilities.$const102$isa))), thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(kbs_utilities.$const102$isa))), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)kbs_utilities.NIL, thread);
                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(kbs_utilities.$const102$isa)), thread);
                                    if (kbs_utilities.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || kbs_utilities.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module((SubLObject)kbs_utilities.UNPROVIDED))) {
                                        final SubLObject _prev_bind_0_$40 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$29 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$30 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(kbs_utilities.$const102$isa))), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)kbs_utilities.NIL, thread);
                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$22, (SubLObject)kbs_utilities.UNPROVIDED);
                                            while (kbs_utilities.NIL != node_var_$22) {
                                                final SubLObject tt_node_var = node_var_$22;
                                                SubLObject cdolist_list_var;
                                                final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(kbs_utilities.$const102$isa));
                                                SubLObject module_var = (SubLObject)kbs_utilities.NIL;
                                                module_var = cdolist_list_var.first();
                                                while (kbs_utilities.NIL != cdolist_list_var) {
                                                    final SubLObject _prev_bind_0_$41 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$30 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((kbs_utilities.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(kbs_utilities.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                        final SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                        if (kbs_utilities.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)kbs_utilities.UNPROVIDED));
                                                            if (kbs_utilities.NIL != d_link) {
                                                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(kbs_utilities.$const102$isa)), sbhl_module_vars.get_sbhl_module((SubLObject)kbs_utilities.UNPROVIDED));
                                                                if (kbs_utilities.NIL != mt_links) {
                                                                    SubLObject iteration_state;
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); kbs_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        final SubLObject tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (kbs_utilities.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                            final SubLObject _prev_bind_0_$42 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                SubLObject iteration_state_$35;
                                                                                for (iteration_state_$35 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); kbs_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$35); iteration_state_$35 = dictionary_contents.do_dictionary_contents_next(iteration_state_$35)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$35);
                                                                                    final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (kbs_utilities.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        final SubLObject _prev_bind_0_$43 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            final SubLObject sol = link_nodes;
                                                                                            if (kbs_utilities.NIL != set.set_p(sol)) {
                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state;
                                                                                                SubLObject fort;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)kbs_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); kbs_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    fort = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if (kbs_utilities.NIL != set_contents.do_set_contents_element_validP(state, fort) && kbs_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(fort, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(fort, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (kbs_utilities.NIL != forts.fort_p(fort)) {
                                                                                                            kbs_identification.unmark_kbs_fort(fort);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (sol.isList()) {
                                                                                                SubLObject csome_list_var = sol;
                                                                                                SubLObject fort2 = (SubLObject)kbs_utilities.NIL;
                                                                                                fort2 = csome_list_var.first();
                                                                                                while (kbs_utilities.NIL != csome_list_var) {
                                                                                                    if (kbs_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(fort2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(fort2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (kbs_utilities.NIL != forts.fort_p(fort2)) {
                                                                                                            kbs_identification.unmark_kbs_fort(fort2);
                                                                                                        }
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    fort2 = csome_list_var.first();
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)kbs_utilities.$str114$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$43, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$35);
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$42, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            }
                                                            else {
                                                                sbhl_paranoia.sbhl_error((SubLObject)kbs_utilities.FIVE_INTEGER, (SubLObject)kbs_utilities.$str115$attempting_to_bind_direction_link, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED);
                                                            }
                                                            if (kbs_utilities.NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module((SubLObject)kbs_utilities.UNPROVIDED))) {
                                                                SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                SubLObject instance_tuple = (SubLObject)kbs_utilities.NIL;
                                                                instance_tuple = csome_list_var2.first();
                                                                while (kbs_utilities.NIL != csome_list_var2) {
                                                                    SubLObject current;
                                                                    final SubLObject datum = current = instance_tuple;
                                                                    SubLObject link_node = (SubLObject)kbs_utilities.NIL;
                                                                    SubLObject mt2 = (SubLObject)kbs_utilities.NIL;
                                                                    SubLObject tv2 = (SubLObject)kbs_utilities.NIL;
                                                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kbs_utilities.$list116);
                                                                    link_node = current.first();
                                                                    current = current.rest();
                                                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kbs_utilities.$list116);
                                                                    mt2 = current.first();
                                                                    current = current.rest();
                                                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kbs_utilities.$list116);
                                                                    tv2 = current.first();
                                                                    current = current.rest();
                                                                    if (kbs_utilities.NIL == current) {
                                                                        if (kbs_utilities.NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                            final SubLObject _prev_bind_0_$44 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                                if (kbs_utilities.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                    final SubLObject _prev_bind_0_$45 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                        final SubLObject sol;
                                                                                        final SubLObject link_nodes2 = sol = (SubLObject)ConsesLow.list(link_node);
                                                                                        if (kbs_utilities.NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject fort;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)kbs_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); kbs_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                fort = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if (kbs_utilities.NIL != set_contents.do_set_contents_element_validP(state, fort) && kbs_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(fort, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(fort, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if (kbs_utilities.NIL != forts.fort_p(fort)) {
                                                                                                        kbs_identification.unmark_kbs_fort(fort);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol.isList()) {
                                                                                            SubLObject csome_list_var_$38 = sol;
                                                                                            SubLObject fort2 = (SubLObject)kbs_utilities.NIL;
                                                                                            fort2 = csome_list_var_$38.first();
                                                                                            while (kbs_utilities.NIL != csome_list_var_$38) {
                                                                                                if (kbs_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(fort2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(fort2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if (kbs_utilities.NIL != forts.fort_p(fort2)) {
                                                                                                        kbs_identification.unmark_kbs_fort(fort2);
                                                                                                    }
                                                                                                }
                                                                                                csome_list_var_$38 = csome_list_var_$38.rest();
                                                                                                fort2 = csome_list_var_$38.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)kbs_utilities.$str114$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$45, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$44, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    else {
                                                                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kbs_utilities.$list116);
                                                                    }
                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                    instance_tuple = csome_list_var2.first();
                                                                }
                                                            }
                                                        }
                                                        else if (kbs_utilities.NIL != obsolete.cnat_p(node, (SubLObject)kbs_utilities.UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$40;
                                                            final SubLObject new_list = cdolist_list_var_$40 = ((kbs_utilities.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(kbs_utilities.$const102$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)kbs_utilities.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(kbs_utilities.$const102$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)kbs_utilities.UNPROVIDED)));
                                                            SubLObject generating_fn = (SubLObject)kbs_utilities.NIL;
                                                            generating_fn = cdolist_list_var_$40.first();
                                                            while (kbs_utilities.NIL != cdolist_list_var_$40) {
                                                                final SubLObject _prev_bind_0_$46 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    final SubLObject sol2;
                                                                    final SubLObject link_nodes3 = sol2 = Functions.funcall(generating_fn, node);
                                                                    if (kbs_utilities.NIL != set.set_p(sol2)) {
                                                                        final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                        SubLObject basis_object2;
                                                                        SubLObject state2;
                                                                        SubLObject fort3;
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)kbs_utilities.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); kbs_utilities.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            fort3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if (kbs_utilities.NIL != set_contents.do_set_contents_element_validP(state2, fort3) && kbs_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(fort3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(fort3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                if (kbs_utilities.NIL != forts.fort_p(fort3)) {
                                                                                    kbs_identification.unmark_kbs_fort(fort3);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (sol2.isList()) {
                                                                        SubLObject csome_list_var3 = sol2;
                                                                        SubLObject fort4 = (SubLObject)kbs_utilities.NIL;
                                                                        fort4 = csome_list_var3.first();
                                                                        while (kbs_utilities.NIL != csome_list_var3) {
                                                                            if (kbs_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(fort4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(fort4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                if (kbs_utilities.NIL != forts.fort_p(fort4)) {
                                                                                    kbs_identification.unmark_kbs_fort(fort4);
                                                                                }
                                                                            }
                                                                            csome_list_var3 = csome_list_var3.rest();
                                                                            fort4 = csome_list_var3.first();
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)kbs_utilities.$str114$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                    }
                                                                }
                                                                finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$46, thread);
                                                                }
                                                                cdolist_list_var_$40 = cdolist_list_var_$40.rest();
                                                                generating_fn = cdolist_list_var_$40.first();
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$30, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$41, thread);
                                                    }
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    module_var = cdolist_list_var.first();
                                                }
                                                SubLObject cdolist_list_var2;
                                                final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(kbs_utilities.$const102$isa)));
                                                SubLObject module_var2 = (SubLObject)kbs_utilities.NIL;
                                                module_var2 = cdolist_list_var2.first();
                                                while (kbs_utilities.NIL != cdolist_list_var2) {
                                                    final SubLObject _prev_bind_0_$47 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$31 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((kbs_utilities.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(kbs_utilities.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                        final SubLObject node2 = function_terms.naut_to_nart(node_var_$22);
                                                        if (kbs_utilities.NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                            final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module((SubLObject)kbs_utilities.UNPROVIDED));
                                                            if (kbs_utilities.NIL != d_link2) {
                                                                final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)kbs_utilities.UNPROVIDED));
                                                                if (kbs_utilities.NIL != mt_links2) {
                                                                    SubLObject iteration_state2;
                                                                    for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); kbs_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                        final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (kbs_utilities.NIL != mt_relevance_macros.relevant_mtP(mt3)) {
                                                                            final SubLObject _prev_bind_0_$48 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                                SubLObject iteration_state_$36;
                                                                                for (iteration_state_$36 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); kbs_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$36); iteration_state_$36 = dictionary_contents.do_dictionary_contents_next(iteration_state_$36)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$36);
                                                                                    final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (kbs_utilities.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                        final SubLObject _prev_bind_0_$49 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                            final SubLObject sol3 = link_nodes4;
                                                                                            if (kbs_utilities.NIL != set.set_p(sol3)) {
                                                                                                final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                                SubLObject basis_object3;
                                                                                                SubLObject state3;
                                                                                                SubLObject node_vars_link_node;
                                                                                                for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = (SubLObject)kbs_utilities.NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); kbs_utilities.NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                    if (kbs_utilities.NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node) && kbs_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)kbs_utilities.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)kbs_utilities.UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (sol3.isList()) {
                                                                                                SubLObject csome_list_var4 = sol3;
                                                                                                SubLObject node_vars_link_node2 = (SubLObject)kbs_utilities.NIL;
                                                                                                node_vars_link_node2 = csome_list_var4.first();
                                                                                                while (kbs_utilities.NIL != csome_list_var4) {
                                                                                                    if (kbs_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)kbs_utilities.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)kbs_utilities.UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                    }
                                                                                                    csome_list_var4 = csome_list_var4.rest();
                                                                                                    node_vars_link_node2 = csome_list_var4.first();
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)kbs_utilities.$str114$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$49, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$36);
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$48, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                }
                                                            }
                                                            else {
                                                                sbhl_paranoia.sbhl_error((SubLObject)kbs_utilities.FIVE_INTEGER, (SubLObject)kbs_utilities.$str115$attempting_to_bind_direction_link, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED);
                                                            }
                                                        }
                                                        else if (kbs_utilities.NIL != obsolete.cnat_p(node2, (SubLObject)kbs_utilities.UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$41;
                                                            final SubLObject new_list2 = cdolist_list_var_$41 = ((kbs_utilities.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)kbs_utilities.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)kbs_utilities.UNPROVIDED)));
                                                            SubLObject generating_fn2 = (SubLObject)kbs_utilities.NIL;
                                                            generating_fn2 = cdolist_list_var_$41.first();
                                                            while (kbs_utilities.NIL != cdolist_list_var_$41) {
                                                                final SubLObject _prev_bind_0_$50 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                    final SubLObject sol4;
                                                                    final SubLObject link_nodes5 = sol4 = Functions.funcall(generating_fn2, node2);
                                                                    if (kbs_utilities.NIL != set.set_p(sol4)) {
                                                                        final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                        SubLObject basis_object4;
                                                                        SubLObject state4;
                                                                        SubLObject node_vars_link_node3;
                                                                        for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = (SubLObject)kbs_utilities.NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); kbs_utilities.NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                            if (kbs_utilities.NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3) && kbs_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)kbs_utilities.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)kbs_utilities.UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node3, recur_deck);
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (sol4.isList()) {
                                                                        SubLObject csome_list_var5 = sol4;
                                                                        SubLObject node_vars_link_node4 = (SubLObject)kbs_utilities.NIL;
                                                                        node_vars_link_node4 = csome_list_var5.first();
                                                                        while (kbs_utilities.NIL != csome_list_var5) {
                                                                            if (kbs_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)kbs_utilities.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)kbs_utilities.UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node4, recur_deck);
                                                                            }
                                                                            csome_list_var5 = csome_list_var5.rest();
                                                                            node_vars_link_node4 = csome_list_var5.first();
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)kbs_utilities.$str114$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                    }
                                                                }
                                                                finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$50, thread);
                                                                }
                                                                cdolist_list_var_$41 = cdolist_list_var_$41.rest();
                                                                generating_fn2 = cdolist_list_var_$41.first();
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$31, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$47, thread);
                                                    }
                                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                                    module_var2 = cdolist_list_var2.first();
                                                }
                                                node_var_$22 = deck.deck_pop(recur_deck);
                                            }
                                        }
                                        finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$30, thread);
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$29, thread);
                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$40, thread);
                                        }
                                    }
                                    else {
                                        sbhl_paranoia.sbhl_warn((SubLObject)kbs_utilities.TWO_INTEGER, (SubLObject)kbs_utilities.$str117$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)kbs_utilities.UNPROVIDED)), (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED);
                                    }
                                }
                                finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$28, thread);
                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$39, thread);
                                }
                            }
                            finally {
                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$27, thread);
                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$38, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$51 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbs_utilities.T, thread);
                                final SubLObject _values3 = Values.getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                Values.restoreValuesFromVector(_values3);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$51, thread);
                            }
                        }
                    }
                    finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$37, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$52 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbs_utilities.T, thread);
                        final SubLObject _values4 = Values.getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                        Values.restoreValuesFromVector(_values4);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$52, thread);
                    }
                }
            }
            finally {
                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1_$26, thread);
                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$36, thread);
            }
            node_var = kbs_utilities.$const119$HostileSocialAction;
            final SubLObject _prev_bind_0_$53 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            final SubLObject _prev_bind_1_$32 = sbhl_marking_vars.$sbhl_gather_space$.currentBinding(thread);
            try {
                sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(kbs_utilities.$const102$isa), thread);
                sbhl_marking_vars.$sbhl_gather_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                try {
                    SubLObject node_var_$23 = node_var;
                    final SubLObject deck_type = (SubLObject)kbs_utilities.$kw105$STACK;
                    final SubLObject recur_deck = deck.create_deck(deck_type);
                    final SubLObject _prev_bind_0_$54 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
                    try {
                        sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
                        try {
                            final SubLObject tv_var = (SubLObject)kbs_utilities.NIL;
                            final SubLObject _prev_bind_0_$55 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$33 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_tv$.bind((kbs_utilities.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                                sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((kbs_utilities.NIL != tv_var) ? kbs_utilities.$sym106$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                                if (kbs_utilities.NIL != tv_var && kbs_utilities.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && kbs_utilities.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                    final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                                    if (pcase_var.eql((SubLObject)kbs_utilities.$kw107$ERROR)) {
                                        sbhl_paranoia.sbhl_error((SubLObject)kbs_utilities.ONE_INTEGER, (SubLObject)kbs_utilities.$str108$_A_is_not_a__A, tv_var, (SubLObject)kbs_utilities.$sym109$SBHL_TRUE_TV_P, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED);
                                    }
                                    else if (pcase_var.eql((SubLObject)kbs_utilities.$kw110$CERROR)) {
                                        sbhl_paranoia.sbhl_cerror((SubLObject)kbs_utilities.ONE_INTEGER, (SubLObject)kbs_utilities.$str111$continue_anyway, (SubLObject)kbs_utilities.$str108$_A_is_not_a__A, tv_var, (SubLObject)kbs_utilities.$sym109$SBHL_TRUE_TV_P, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED);
                                    }
                                    else if (pcase_var.eql((SubLObject)kbs_utilities.$kw112$WARN)) {
                                        Errors.warn((SubLObject)kbs_utilities.$str108$_A_is_not_a__A, tv_var, (SubLObject)kbs_utilities.$sym109$SBHL_TRUE_TV_P);
                                    }
                                    else {
                                        Errors.warn((SubLObject)kbs_utilities.$str113$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                                        Errors.cerror((SubLObject)kbs_utilities.$str111$continue_anyway, (SubLObject)kbs_utilities.$str108$_A_is_not_a__A, tv_var, (SubLObject)kbs_utilities.$sym109$SBHL_TRUE_TV_P);
                                    }
                                }
                                final SubLObject _prev_bind_0_$56 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                                final SubLObject _prev_bind_1_$34 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                                final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                                final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                try {
                                    sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(kbs_utilities.$const102$isa)), thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(kbs_utilities.$const102$isa))), thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(kbs_utilities.$const102$isa))), thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)kbs_utilities.NIL, thread);
                                    sbhl_module_vars.$sbhl_module$.bind(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(kbs_utilities.$const102$isa)), thread);
                                    if (kbs_utilities.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || kbs_utilities.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(node_var, sbhl_module_vars.get_sbhl_module((SubLObject)kbs_utilities.UNPROVIDED))) {
                                        final SubLObject _prev_bind_0_$57 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$35 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                                        final SubLObject _prev_bind_2_$31 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_backward_search_direction(), thread);
                                            sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_backward_search_direction(), sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(kbs_utilities.$const102$isa))), thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)kbs_utilities.NIL, thread);
                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_var_$23, (SubLObject)kbs_utilities.UNPROVIDED);
                                            while (kbs_utilities.NIL != node_var_$23) {
                                                final SubLObject tt_node_var = node_var_$23;
                                                SubLObject cdolist_list_var;
                                                final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(kbs_utilities.$const102$isa));
                                                SubLObject module_var = (SubLObject)kbs_utilities.NIL;
                                                module_var = cdolist_list_var.first();
                                                while (kbs_utilities.NIL != cdolist_list_var) {
                                                    final SubLObject _prev_bind_0_$58 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$36 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((kbs_utilities.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(kbs_utilities.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                        final SubLObject node = function_terms.naut_to_nart(tt_node_var);
                                                        if (kbs_utilities.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)kbs_utilities.UNPROVIDED));
                                                            if (kbs_utilities.NIL != d_link) {
                                                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(kbs_utilities.$const102$isa)), sbhl_module_vars.get_sbhl_module((SubLObject)kbs_utilities.UNPROVIDED));
                                                                if (kbs_utilities.NIL != mt_links) {
                                                                    SubLObject iteration_state;
                                                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); kbs_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                                        final SubLObject tv_links = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (kbs_utilities.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                            final SubLObject _prev_bind_0_$59 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                                SubLObject iteration_state_$37;
                                                                                for (iteration_state_$37 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); kbs_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$37); iteration_state_$37 = dictionary_contents.do_dictionary_contents_next(iteration_state_$37)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$37);
                                                                                    final SubLObject link_nodes = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (kbs_utilities.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                                        final SubLObject _prev_bind_0_$60 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                            final SubLObject sol = link_nodes;
                                                                                            if (kbs_utilities.NIL != set.set_p(sol)) {
                                                                                                final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                                SubLObject basis_object;
                                                                                                SubLObject state;
                                                                                                SubLObject fort;
                                                                                                for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)kbs_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); kbs_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                    fort = set_contents.do_set_contents_next(basis_object, state);
                                                                                                    if (kbs_utilities.NIL != set_contents.do_set_contents_element_validP(state, fort) && kbs_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(fort, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(fort, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (kbs_utilities.NIL != forts.fort_p(fort)) {
                                                                                                            kbs_identification.unmark_kbs_fort(fort);
                                                                                                        }
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (sol.isList()) {
                                                                                                SubLObject csome_list_var = sol;
                                                                                                SubLObject fort2 = (SubLObject)kbs_utilities.NIL;
                                                                                                fort2 = csome_list_var.first();
                                                                                                while (kbs_utilities.NIL != csome_list_var) {
                                                                                                    if (kbs_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(fort2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(fort2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                        if (kbs_utilities.NIL != forts.fort_p(fort2)) {
                                                                                                            kbs_identification.unmark_kbs_fort(fort2);
                                                                                                        }
                                                                                                    }
                                                                                                    csome_list_var = csome_list_var.rest();
                                                                                                    fort2 = csome_list_var.first();
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)kbs_utilities.$str114$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$60, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$37);
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$59, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                                }
                                                            }
                                                            else {
                                                                sbhl_paranoia.sbhl_error((SubLObject)kbs_utilities.FIVE_INTEGER, (SubLObject)kbs_utilities.$str115$attempting_to_bind_direction_link, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED);
                                                            }
                                                            if (kbs_utilities.NIL != sbhl_macros.do_sbhl_non_fort_linksP(node, sbhl_module_vars.get_sbhl_module((SubLObject)kbs_utilities.UNPROVIDED))) {
                                                                SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(node);
                                                                SubLObject instance_tuple = (SubLObject)kbs_utilities.NIL;
                                                                instance_tuple = csome_list_var2.first();
                                                                while (kbs_utilities.NIL != csome_list_var2) {
                                                                    SubLObject current;
                                                                    final SubLObject datum = current = instance_tuple;
                                                                    SubLObject link_node = (SubLObject)kbs_utilities.NIL;
                                                                    SubLObject mt2 = (SubLObject)kbs_utilities.NIL;
                                                                    SubLObject tv2 = (SubLObject)kbs_utilities.NIL;
                                                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kbs_utilities.$list116);
                                                                    link_node = current.first();
                                                                    current = current.rest();
                                                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kbs_utilities.$list116);
                                                                    mt2 = current.first();
                                                                    current = current.rest();
                                                                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kbs_utilities.$list116);
                                                                    tv2 = current.first();
                                                                    current = current.rest();
                                                                    if (kbs_utilities.NIL == current) {
                                                                        if (kbs_utilities.NIL != mt_relevance_macros.relevant_mtP(mt2)) {
                                                                            final SubLObject _prev_bind_0_$61 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt2, thread);
                                                                                if (kbs_utilities.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                    final SubLObject _prev_bind_0_$62 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                    try {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                        final SubLObject sol;
                                                                                        final SubLObject link_nodes2 = sol = (SubLObject)ConsesLow.list(link_node);
                                                                                        if (kbs_utilities.NIL != set.set_p(sol)) {
                                                                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                            SubLObject basis_object;
                                                                                            SubLObject state;
                                                                                            SubLObject fort;
                                                                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)kbs_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); kbs_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                                fort = set_contents.do_set_contents_next(basis_object, state);
                                                                                                if (kbs_utilities.NIL != set_contents.do_set_contents_element_validP(state, fort) && kbs_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(fort, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(fort, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if (kbs_utilities.NIL != forts.fort_p(fort)) {
                                                                                                        kbs_identification.unmark_kbs_fort(fort);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                        }
                                                                                        else if (sol.isList()) {
                                                                                            SubLObject csome_list_var_$39 = sol;
                                                                                            SubLObject fort2 = (SubLObject)kbs_utilities.NIL;
                                                                                            fort2 = csome_list_var_$39.first();
                                                                                            while (kbs_utilities.NIL != csome_list_var_$39) {
                                                                                                if (kbs_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(fort2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(fort2, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                                    if (kbs_utilities.NIL != forts.fort_p(fort2)) {
                                                                                                        kbs_identification.unmark_kbs_fort(fort2);
                                                                                                    }
                                                                                                }
                                                                                                csome_list_var_$39 = csome_list_var_$39.rest();
                                                                                                fort2 = csome_list_var_$39.first();
                                                                                            }
                                                                                        }
                                                                                        else {
                                                                                            Errors.error((SubLObject)kbs_utilities.$str114$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                        }
                                                                                    }
                                                                                    finally {
                                                                                        sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$62, thread);
                                                                                    }
                                                                                }
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$61, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    else {
                                                                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kbs_utilities.$list116);
                                                                    }
                                                                    csome_list_var2 = csome_list_var2.rest();
                                                                    instance_tuple = csome_list_var2.first();
                                                                }
                                                            }
                                                        }
                                                        else if (kbs_utilities.NIL != obsolete.cnat_p(node, (SubLObject)kbs_utilities.UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$42;
                                                            final SubLObject new_list = cdolist_list_var_$42 = ((kbs_utilities.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(kbs_utilities.$const102$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)kbs_utilities.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(kbs_utilities.$const102$isa)), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)kbs_utilities.UNPROVIDED)));
                                                            SubLObject generating_fn = (SubLObject)kbs_utilities.NIL;
                                                            generating_fn = cdolist_list_var_$42.first();
                                                            while (kbs_utilities.NIL != cdolist_list_var_$42) {
                                                                final SubLObject _prev_bind_0_$63 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                                    final SubLObject sol2;
                                                                    final SubLObject link_nodes3 = sol2 = Functions.funcall(generating_fn, node);
                                                                    if (kbs_utilities.NIL != set.set_p(sol2)) {
                                                                        final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                                        SubLObject basis_object2;
                                                                        SubLObject state2;
                                                                        SubLObject fort3;
                                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)kbs_utilities.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); kbs_utilities.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                            fort3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                            if (kbs_utilities.NIL != set_contents.do_set_contents_element_validP(state2, fort3) && kbs_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(fort3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(fort3, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                if (kbs_utilities.NIL != forts.fort_p(fort3)) {
                                                                                    kbs_identification.unmark_kbs_fort(fort3);
                                                                                }
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (sol2.isList()) {
                                                                        SubLObject csome_list_var3 = sol2;
                                                                        SubLObject fort4 = (SubLObject)kbs_utilities.NIL;
                                                                        fort4 = csome_list_var3.first();
                                                                        while (kbs_utilities.NIL != csome_list_var3) {
                                                                            if (kbs_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(fort4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread))) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(fort4, sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                                                                                if (kbs_utilities.NIL != forts.fort_p(fort4)) {
                                                                                    kbs_identification.unmark_kbs_fort(fort4);
                                                                                }
                                                                            }
                                                                            csome_list_var3 = csome_list_var3.rest();
                                                                            fort4 = csome_list_var3.first();
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)kbs_utilities.$str114$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                                    }
                                                                }
                                                                finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$63, thread);
                                                                }
                                                                cdolist_list_var_$42 = cdolist_list_var_$42.rest();
                                                                generating_fn = cdolist_list_var_$42.first();
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$36, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$58, thread);
                                                    }
                                                    cdolist_list_var = cdolist_list_var.rest();
                                                    module_var = cdolist_list_var.first();
                                                }
                                                SubLObject cdolist_list_var2;
                                                final SubLObject accessible_modules2 = cdolist_list_var2 = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_utilities.get_sbhl_transfers_through_module(sbhl_module_vars.get_sbhl_module(kbs_utilities.$const102$isa)));
                                                SubLObject module_var2 = (SubLObject)kbs_utilities.NIL;
                                                module_var2 = cdolist_list_var2.first();
                                                while (kbs_utilities.NIL != cdolist_list_var2) {
                                                    final SubLObject _prev_bind_0_$64 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                                    final SubLObject _prev_bind_1_$37 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                                    try {
                                                        sbhl_module_vars.$sbhl_module$.bind(module_var2, thread);
                                                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((kbs_utilities.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(kbs_utilities.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                                        final SubLObject node2 = function_terms.naut_to_nart(node_var_$23);
                                                        if (kbs_utilities.NIL != sbhl_link_vars.sbhl_node_object_p(node2)) {
                                                            final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(node2, sbhl_module_vars.get_sbhl_module((SubLObject)kbs_utilities.UNPROVIDED));
                                                            if (kbs_utilities.NIL != d_link2) {
                                                                final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)kbs_utilities.UNPROVIDED));
                                                                if (kbs_utilities.NIL != mt_links2) {
                                                                    SubLObject iteration_state2;
                                                                    for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); kbs_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject mt3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                                                        final SubLObject tv_links2 = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (kbs_utilities.NIL != mt_relevance_macros.relevant_mtP(mt3)) {
                                                                            final SubLObject _prev_bind_0_$65 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_mt$.bind(mt3, thread);
                                                                                SubLObject iteration_state_$38;
                                                                                for (iteration_state_$38 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); kbs_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$38); iteration_state_$38 = dictionary_contents.do_dictionary_contents_next(iteration_state_$38)) {
                                                                                    thread.resetMultipleValues();
                                                                                    final SubLObject tv2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$38);
                                                                                    final SubLObject link_nodes4 = thread.secondMultipleValue();
                                                                                    thread.resetMultipleValues();
                                                                                    if (kbs_utilities.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv2)) {
                                                                                        final SubLObject _prev_bind_0_$66 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                                        try {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.bind(tv2, thread);
                                                                                            final SubLObject sol3 = link_nodes4;
                                                                                            if (kbs_utilities.NIL != set.set_p(sol3)) {
                                                                                                final SubLObject set_contents_var3 = set.do_set_internal(sol3);
                                                                                                SubLObject basis_object3;
                                                                                                SubLObject state3;
                                                                                                SubLObject node_vars_link_node;
                                                                                                for (basis_object3 = set_contents.do_set_contents_basis_object(set_contents_var3), state3 = (SubLObject)kbs_utilities.NIL, state3 = set_contents.do_set_contents_initial_state(basis_object3, set_contents_var3); kbs_utilities.NIL == set_contents.do_set_contents_doneP(basis_object3, state3); state3 = set_contents.do_set_contents_update_state(state3)) {
                                                                                                    node_vars_link_node = set_contents.do_set_contents_next(basis_object3, state3);
                                                                                                    if (kbs_utilities.NIL != set_contents.do_set_contents_element_validP(state3, node_vars_link_node) && kbs_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)kbs_utilities.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)kbs_utilities.UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node, recur_deck);
                                                                                                    }
                                                                                                }
                                                                                            }
                                                                                            else if (sol3.isList()) {
                                                                                                SubLObject csome_list_var4 = sol3;
                                                                                                SubLObject node_vars_link_node2 = (SubLObject)kbs_utilities.NIL;
                                                                                                node_vars_link_node2 = csome_list_var4.first();
                                                                                                while (kbs_utilities.NIL != csome_list_var4) {
                                                                                                    if (kbs_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)kbs_utilities.UNPROVIDED)) {
                                                                                                        sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)kbs_utilities.UNPROVIDED);
                                                                                                        deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                                    }
                                                                                                    csome_list_var4 = csome_list_var4.rest();
                                                                                                    node_vars_link_node2 = csome_list_var4.first();
                                                                                                }
                                                                                            }
                                                                                            else {
                                                                                                Errors.error((SubLObject)kbs_utilities.$str114$_A_is_neither_SET_P_nor_LISTP_, sol3);
                                                                                            }
                                                                                        }
                                                                                        finally {
                                                                                            sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$66, thread);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                dictionary_contents.do_dictionary_contents_finalize(iteration_state_$38);
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$65, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state2);
                                                                }
                                                            }
                                                            else {
                                                                sbhl_paranoia.sbhl_error((SubLObject)kbs_utilities.FIVE_INTEGER, (SubLObject)kbs_utilities.$str115$attempting_to_bind_direction_link, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED);
                                                            }
                                                        }
                                                        else if (kbs_utilities.NIL != obsolete.cnat_p(node2, (SubLObject)kbs_utilities.UNPROVIDED)) {
                                                            SubLObject cdolist_list_var_$43;
                                                            final SubLObject new_list2 = cdolist_list_var_$43 = ((kbs_utilities.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)kbs_utilities.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)kbs_utilities.UNPROVIDED)));
                                                            SubLObject generating_fn2 = (SubLObject)kbs_utilities.NIL;
                                                            generating_fn2 = cdolist_list_var_$43.first();
                                                            while (kbs_utilities.NIL != cdolist_list_var_$43) {
                                                                final SubLObject _prev_bind_0_$67 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn2, thread);
                                                                    final SubLObject sol4;
                                                                    final SubLObject link_nodes5 = sol4 = Functions.funcall(generating_fn2, node2);
                                                                    if (kbs_utilities.NIL != set.set_p(sol4)) {
                                                                        final SubLObject set_contents_var4 = set.do_set_internal(sol4);
                                                                        SubLObject basis_object4;
                                                                        SubLObject state4;
                                                                        SubLObject node_vars_link_node3;
                                                                        for (basis_object4 = set_contents.do_set_contents_basis_object(set_contents_var4), state4 = (SubLObject)kbs_utilities.NIL, state4 = set_contents.do_set_contents_initial_state(basis_object4, set_contents_var4); kbs_utilities.NIL == set_contents.do_set_contents_doneP(basis_object4, state4); state4 = set_contents.do_set_contents_update_state(state4)) {
                                                                            node_vars_link_node3 = set_contents.do_set_contents_next(basis_object4, state4);
                                                                            if (kbs_utilities.NIL != set_contents.do_set_contents_element_validP(state4, node_vars_link_node3) && kbs_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)kbs_utilities.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)kbs_utilities.UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node3, recur_deck);
                                                                            }
                                                                        }
                                                                    }
                                                                    else if (sol4.isList()) {
                                                                        SubLObject csome_list_var5 = sol4;
                                                                        SubLObject node_vars_link_node4 = (SubLObject)kbs_utilities.NIL;
                                                                        node_vars_link_node4 = csome_list_var5.first();
                                                                        while (kbs_utilities.NIL != csome_list_var5) {
                                                                            if (kbs_utilities.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)kbs_utilities.UNPROVIDED)) {
                                                                                sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)kbs_utilities.UNPROVIDED);
                                                                                deck.deck_push(node_vars_link_node4, recur_deck);
                                                                            }
                                                                            csome_list_var5 = csome_list_var5.rest();
                                                                            node_vars_link_node4 = csome_list_var5.first();
                                                                        }
                                                                    }
                                                                    else {
                                                                        Errors.error((SubLObject)kbs_utilities.$str114$_A_is_neither_SET_P_nor_LISTP_, sol4);
                                                                    }
                                                                }
                                                                finally {
                                                                    sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$67, thread);
                                                                }
                                                                cdolist_list_var_$43 = cdolist_list_var_$43.rest();
                                                                generating_fn2 = cdolist_list_var_$43.first();
                                                            }
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$37, thread);
                                                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$64, thread);
                                                    }
                                                    cdolist_list_var2 = cdolist_list_var2.rest();
                                                    module_var2 = cdolist_list_var2.first();
                                                }
                                                node_var_$23 = deck.deck_pop(recur_deck);
                                            }
                                        }
                                        finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$31, thread);
                                            sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$35, thread);
                                            sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$57, thread);
                                        }
                                    }
                                    else {
                                        sbhl_paranoia.sbhl_warn((SubLObject)kbs_utilities.TWO_INTEGER, (SubLObject)kbs_utilities.$str117$Node__a_does_not_pass_sbhl_type_t, node_var, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)kbs_utilities.UNPROVIDED)), (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED);
                                    }
                                }
                                finally {
                                    sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                                    sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                                    sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                                    sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$34, thread);
                                    sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$56, thread);
                                }
                            }
                            finally {
                                sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_1_$33, thread);
                                sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$55, thread);
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$68 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbs_utilities.T, thread);
                                final SubLObject _values5 = Values.getValuesAsVector();
                                sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                                Values.restoreValuesFromVector(_values5);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$68, thread);
                            }
                        }
                    }
                    finally {
                        sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0_$54, thread);
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$69 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbs_utilities.T, thread);
                        final SubLObject _values6 = Values.getValuesAsVector();
                        sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_gather_space$.getDynamicValue(thread));
                        Values.restoreValuesFromVector(_values6);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$69, thread);
                    }
                }
            }
            finally {
                sbhl_marking_vars.$sbhl_gather_space$.rebind(_prev_bind_1_$32, thread);
                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$53, thread);
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)kbs_utilities.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 29406L)
    public static SubLObject researchcyc_kbs_unwanted_tkb_termP(final SubLObject fort) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kbs_utilities.NIL != isa.isa_in_any_mtP(fort, kbs_utilities.$const101$TerroristAgent) || kbs_utilities.NIL != isa.isa_in_any_mtP(fort, kbs_utilities.$const118$TerroristAct) || kbs_utilities.NIL != isa.isa_in_any_mtP(fort, kbs_utilities.$const119$HostileSocialAction));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 29612L)
    public static SubLObject researchcyc_candidate_term(final SubLObject fort) {
        return (SubLObject)SubLObjectFactory.makeBoolean(kbs_utilities.NIL == quoted_isa_enhanced_in_any_mtP(fort, kbs_utilities.$const120$ResearchCycConstant) && kbs_utilities.NIL == isa.isa_in_any_mtP(fort, kbs_utilities.$const120$ResearchCycConstant) && kbs_utilities.NIL == quoted_isa_enhanced_in_any_mtP(fort, kbs_utilities.$const121$ProprietaryTerm) && kbs_utilities.NIL == isa.isa_in_any_mtP(fort, kbs_utilities.$const121$ProprietaryTerm) && kbs_utilities.NIL == quoted_isa_enhanced_in_any_mtP(fort, kbs_utilities.$const122$TKBConstant) && kbs_utilities.NIL == isa.isa_in_any_mtP(fort, kbs_utilities.$const122$TKBConstant) && kbs_utilities.NIL == researchcyc_kbs_unwanted_tkb_termP(fort) && kbs_utilities.NIL == quoted_isa_enhanced_in_any_mtP(fort, kbs_utilities.$const123$TermSuggestorExpertOnlyTerm) && kbs_utilities.NIL == quoted_isa_enhanced_in_any_mtP(fort, kbs_utilities.$const124$TextualEntailmentConstant) && kbs_utilities.NIL == isa.isa_in_any_mtP(fort, kbs_utilities.$const124$TextualEntailmentConstant) && kbs_utilities.NIL == isa.isa_in_any_mtP(fort, kbs_utilities.$const125$CurrentCycorpEmployee) && kbs_utilities.NIL == fort_types_interface.skolem_functionP(fort, (SubLObject)kbs_utilities.UNPROVIDED) && kbs_utilities.NIL != ((kbs_utilities.NIL != constant_handles.constant_p(fort)) ? SubLObjectFactory.makeBoolean(kbs_utilities.NIL == string_utilities.starts_with(constants_high.constant_name(fort), (SubLObject)kbs_utilities.$str126$AKB) && kbs_utilities.NIL == string_utilities.starts_with(constants_high.constant_name(fort), (SubLObject)kbs_utilities.$str127$BUTLER) && kbs_utilities.NIL == string_utilities.starts_with(constants_high.constant_name(fort), (SubLObject)kbs_utilities.$str128$CKB) && kbs_utilities.NIL == string_utilities.starts_with(constants_high.constant_name(fort), (SubLObject)kbs_utilities.$str129$CycInternalAssignment) && kbs_utilities.NIL == string_utilities.starts_with(constants_high.constant_name(fort), (SubLObject)kbs_utilities.$str130$TKB) && kbs_utilities.NIL == string_utilities.starts_with(constants_high.constant_name(fort), (SubLObject)kbs_utilities.$str131$Translation_)) : kbs_utilities.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 30846L)
    public static SubLObject tkb_kbs_unmark_certain_assertions() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject assertion_unmark_count = (SubLObject)kbs_utilities.ZERO_INTEGER;
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
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.bind(sbhl_marking_vars.determine_resource_limit(already_resourcing_p, (SubLObject)kbs_utilities.SIX_INTEGER), thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.bind(sbhl_marking_vars.possibly_new_marking_resource(already_resourcing_p), thread);
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.bind((SubLObject)kbs_utilities.T, thread);
                    final SubLObject list_var = keyhash_utilities.keyhash_element_list(kbs_identification.kbs_assertion_table());
                    final SubLObject _prev_bind_0_$110 = utilities_macros.$progress_note$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$111 = utilities_macros.$progress_start_time$.currentBinding(thread);
                    final SubLObject _prev_bind_2_$112 = utilities_macros.$progress_total$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = utilities_macros.$progress_sofar$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
                    final SubLObject _prev_bind_6 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
                    final SubLObject _prev_bind_7 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
                    final SubLObject _prev_bind_8 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
                    try {
                        utilities_macros.$progress_note$.bind((SubLObject)kbs_utilities.$str132$Unmarking_non_TKB_assertions, thread);
                        utilities_macros.$progress_start_time$.bind(Time.get_universal_time(), thread);
                        utilities_macros.$progress_total$.bind(Sequences.length(list_var), thread);
                        utilities_macros.$progress_sofar$.bind((SubLObject)kbs_utilities.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_index$.bind((SubLObject)kbs_utilities.ZERO_INTEGER, thread);
                        utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kbs_utilities.NIL, thread);
                        utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kbs_utilities.T, thread);
                        utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                        try {
                            utilities_macros.noting_percent_progress_preamble(utilities_macros.$progress_note$.getDynamicValue(thread));
                            SubLObject csome_list_var = list_var;
                            SubLObject assertion = (SubLObject)kbs_utilities.NIL;
                            assertion = csome_list_var.first();
                            while (kbs_utilities.NIL != csome_list_var) {
                                if (kbs_utilities.NIL != tkb_special_excluded_assertionP(assertion)) {
                                    kbs_identification.unmark_kbs_assertion(assertion);
                                    assertion_unmark_count = Numbers.add(assertion_unmark_count, (SubLObject)kbs_utilities.ONE_INTEGER);
                                }
                                utilities_macros.$progress_sofar$.setDynamicValue(Numbers.add(utilities_macros.$progress_sofar$.getDynamicValue(thread), (SubLObject)kbs_utilities.ONE_INTEGER), thread);
                                utilities_macros.note_percent_progress(utilities_macros.$progress_sofar$.getDynamicValue(thread), utilities_macros.$progress_total$.getDynamicValue(thread));
                                csome_list_var = csome_list_var.rest();
                                assertion = csome_list_var.first();
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$111 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbs_utilities.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                utilities_macros.noting_percent_progress_postamble();
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$111, thread);
                            }
                        }
                    }
                    finally {
                        utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_8, thread);
                        utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_7, thread);
                        utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_6, thread);
                        utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_5, thread);
                        utilities_macros.$progress_sofar$.rebind(_prev_bind_4, thread);
                        utilities_macros.$progress_total$.rebind(_prev_bind_2_$112, thread);
                        utilities_macros.$progress_start_time$.rebind(_prev_bind_1_$111, thread);
                        utilities_macros.$progress_note$.rebind(_prev_bind_0_$110, thread);
                    }
                }
                finally {
                    sbhl_marking_vars.$resourcing_sbhl_marking_spaces_p$.rebind(_prev_bind_3, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_spaces$.rebind(_prev_bind_2, thread);
                    sbhl_marking_vars.$resourced_sbhl_marking_space_limit$.rebind(_prev_bind_0_$109, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$112 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbs_utilities.T, thread);
                    final SubLObject _values2 = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values2);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$112, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return assertion_unmark_count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 31298L)
    public static SubLObject tkb_kbs_save_terms_without_isas() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject assertion_count = (SubLObject)kbs_utilities.ZERO_INTEGER;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kbs_utilities.$sym51$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(kbs_utilities.$const52$EverythingPSC, thread);
            final SubLObject idx = constant_handles.do_constants_table();
            final SubLObject mess = (SubLObject)kbs_utilities.$str133$mapping_Cyc_constants;
            final SubLObject total = id_index.id_index_count(idx);
            SubLObject sofar = (SubLObject)kbs_utilities.ZERO_INTEGER;
            assert kbs_utilities.NIL != Types.stringp(mess) : mess;
            final SubLObject _prev_bind_0_$115 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
            final SubLObject _prev_bind_1_$116 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
            final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
            final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
            try {
                utilities_macros.$last_percent_progress_index$.bind((SubLObject)kbs_utilities.ZERO_INTEGER, thread);
                utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kbs_utilities.NIL, thread);
                utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kbs_utilities.T, thread);
                utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
                try {
                    utilities_macros.noting_percent_progress_preamble(mess);
                    final SubLObject idx_$117 = idx;
                    if (kbs_utilities.NIL == id_index.id_index_objects_empty_p(idx_$117, (SubLObject)kbs_utilities.$kw54$SKIP)) {
                        final SubLObject idx_$118 = idx_$117;
                        if (kbs_utilities.NIL == id_index.id_index_dense_objects_empty_p(idx_$118, (SubLObject)kbs_utilities.$kw54$SKIP)) {
                            final SubLObject vector_var = id_index.id_index_dense_objects(idx_$118);
                            final SubLObject backwardP_var = (SubLObject)kbs_utilities.NIL;
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
                            for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kbs_utilities.NIL, v_iteration = (SubLObject)kbs_utilities.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kbs_utilities.ONE_INTEGER)) {
                                id = ((kbs_utilities.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kbs_utilities.ONE_INTEGER) : v_iteration);
                                c = Vectors.aref(vector_var, id);
                                if (kbs_utilities.NIL == id_index.id_index_tombstone_p(c) || kbs_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kbs_utilities.$kw54$SKIP)) {
                                    if (kbs_utilities.NIL != id_index.id_index_tombstone_p(c)) {
                                        c = (SubLObject)kbs_utilities.$kw54$SKIP;
                                    }
                                    if (kbs_utilities.NIL != kbs_identification.kbs_constant_p(c) && (kbs_utilities.NIL != quoted_isa_enhanced_in_any_mtP(c, kbs_utilities.$const122$TKBConstant) || kbs_utilities.NIL != isa.isa_in_any_mtP(c, kbs_utilities.$const122$TKBConstant))) {
                                        constant_has_kbs_isa_assertionP = (SubLObject)kbs_utilities.NIL;
                                        pred_var = kbs_utilities.$const102$isa;
                                        if (kbs_utilities.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(c, (SubLObject)kbs_utilities.ONE_INTEGER, pred_var)) {
                                            iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(c, (SubLObject)kbs_utilities.ONE_INTEGER, pred_var);
                                            done_var = constant_has_kbs_isa_assertionP;
                                            token_var = (SubLObject)kbs_utilities.NIL;
                                            while (kbs_utilities.NIL == done_var) {
                                                final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                                                valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                                                if (kbs_utilities.NIL != valid) {
                                                    final_index_iterator = (SubLObject)kbs_utilities.NIL;
                                                    try {
                                                        final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)kbs_utilities.$kw135$GAF, (SubLObject)kbs_utilities.NIL, (SubLObject)kbs_utilities.NIL);
                                                        done_var_$119 = constant_has_kbs_isa_assertionP;
                                                        token_var_$120 = (SubLObject)kbs_utilities.NIL;
                                                        while (kbs_utilities.NIL == done_var_$119) {
                                                            a = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$120);
                                                            valid_$121 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$120.eql(a));
                                                            if (kbs_utilities.NIL != valid_$121) {
                                                                constant_has_kbs_isa_assertionP = kbs_identification.kbs_assertion_p(a);
                                                            }
                                                            done_var_$119 = (SubLObject)SubLObjectFactory.makeBoolean(kbs_utilities.NIL == valid_$121 || kbs_utilities.NIL != constant_has_kbs_isa_assertionP);
                                                        }
                                                    }
                                                    finally {
                                                        _prev_bind_0_$116 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbs_utilities.T, thread);
                                                            _values = Values.getValuesAsVector();
                                                            if (kbs_utilities.NIL != final_index_iterator) {
                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                                            }
                                                            Values.restoreValuesFromVector(_values);
                                                        }
                                                        finally {
                                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$116, thread);
                                                        }
                                                    }
                                                }
                                                done_var = (SubLObject)SubLObjectFactory.makeBoolean(kbs_utilities.NIL == valid || kbs_utilities.NIL != constant_has_kbs_isa_assertionP);
                                            }
                                        }
                                        if (kbs_utilities.NIL == constant_has_kbs_isa_assertionP) {
                                            formula = el_utilities.make_binary_formula(kbs_utilities.$const102$isa, c, kbs_utilities.$const136$Individual);
                                            Errors.warn((SubLObject)kbs_utilities.$str137$Saving__A_by_asserting__A__, c, formula);
                                            cyc_kernel.cyc_assert(formula, kbs_utilities.$const138$UniversalVocabularyMt, (SubLObject)kbs_utilities.UNPROVIDED);
                                            a2 = czer_meta.find_assertion_cycl(formula, kbs_utilities.$const138$UniversalVocabularyMt);
                                            if (kbs_utilities.NIL != assertion_handles.assertion_p(a2)) {
                                                kbs_identification.mark_kbs_assertion(a2);
                                            }
                                            else {
                                                Errors.warn((SubLObject)kbs_utilities.$str139$assertion__A_not_found, formula);
                                            }
                                            assertion_count = Numbers.add(assertion_count, (SubLObject)kbs_utilities.ONE_INTEGER);
                                        }
                                    }
                                    sofar = Numbers.add(sofar, (SubLObject)kbs_utilities.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                }
                            }
                        }
                        final SubLObject idx_$119 = idx_$117;
                        if (kbs_utilities.NIL == id_index.id_index_sparse_objects_empty_p(idx_$119) || kbs_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kbs_utilities.$kw54$SKIP)) {
                            final SubLObject sparse = id_index.id_index_sparse_objects(idx_$119);
                            SubLObject id2 = id_index.id_index_sparse_id_threshold(idx_$119);
                            final SubLObject end_id = id_index.id_index_next_id(idx_$119);
                            final SubLObject v_default = (SubLObject)((kbs_utilities.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kbs_utilities.$kw54$SKIP)) ? kbs_utilities.NIL : kbs_utilities.$kw54$SKIP);
                            while (id2.numL(end_id)) {
                                final SubLObject c2 = Hashtables.gethash_without_values(id2, sparse, v_default);
                                if (kbs_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kbs_utilities.$kw54$SKIP) || kbs_utilities.NIL == id_index.id_index_tombstone_p(c2)) {
                                    if (kbs_utilities.NIL != kbs_identification.kbs_constant_p(c2) && (kbs_utilities.NIL != quoted_isa_enhanced_in_any_mtP(c2, kbs_utilities.$const122$TKBConstant) || kbs_utilities.NIL != isa.isa_in_any_mtP(c2, kbs_utilities.$const122$TKBConstant))) {
                                        SubLObject constant_has_kbs_isa_assertionP2 = (SubLObject)kbs_utilities.NIL;
                                        final SubLObject pred_var2 = kbs_utilities.$const102$isa;
                                        if (kbs_utilities.NIL != kb_mapping_macros.do_gaf_arg_index_key_validator(c2, (SubLObject)kbs_utilities.ONE_INTEGER, pred_var2)) {
                                            final SubLObject iterator_var2 = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(c2, (SubLObject)kbs_utilities.ONE_INTEGER, pred_var2);
                                            SubLObject done_var2 = constant_has_kbs_isa_assertionP2;
                                            final SubLObject token_var2 = (SubLObject)kbs_utilities.NIL;
                                            while (kbs_utilities.NIL == done_var2) {
                                                final SubLObject final_index_spec2 = iteration.iteration_next_without_values_macro_helper(iterator_var2, token_var2);
                                                final SubLObject valid2 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var2.eql(final_index_spec2));
                                                if (kbs_utilities.NIL != valid2) {
                                                    SubLObject final_index_iterator2 = (SubLObject)kbs_utilities.NIL;
                                                    try {
                                                        final_index_iterator2 = kb_mapping_macros.new_final_index_iterator(final_index_spec2, (SubLObject)kbs_utilities.$kw135$GAF, (SubLObject)kbs_utilities.NIL, (SubLObject)kbs_utilities.NIL);
                                                        SubLObject done_var_$120 = constant_has_kbs_isa_assertionP2;
                                                        final SubLObject token_var_$121 = (SubLObject)kbs_utilities.NIL;
                                                        while (kbs_utilities.NIL == done_var_$120) {
                                                            final SubLObject a3 = iteration.iteration_next_without_values_macro_helper(final_index_iterator2, token_var_$121);
                                                            final SubLObject valid_$122 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$121.eql(a3));
                                                            if (kbs_utilities.NIL != valid_$122) {
                                                                constant_has_kbs_isa_assertionP2 = kbs_identification.kbs_assertion_p(a3);
                                                            }
                                                            done_var_$120 = (SubLObject)SubLObjectFactory.makeBoolean(kbs_utilities.NIL == valid_$122 || kbs_utilities.NIL != constant_has_kbs_isa_assertionP2);
                                                        }
                                                    }
                                                    finally {
                                                        final SubLObject _prev_bind_0_$117 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                                        try {
                                                            Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbs_utilities.T, thread);
                                                            final SubLObject _values2 = Values.getValuesAsVector();
                                                            if (kbs_utilities.NIL != final_index_iterator2) {
                                                                kb_mapping_macros.destroy_final_index_iterator(final_index_iterator2);
                                                            }
                                                            Values.restoreValuesFromVector(_values2);
                                                        }
                                                        finally {
                                                            Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$117, thread);
                                                        }
                                                    }
                                                }
                                                done_var2 = (SubLObject)SubLObjectFactory.makeBoolean(kbs_utilities.NIL == valid2 || kbs_utilities.NIL != constant_has_kbs_isa_assertionP2);
                                            }
                                        }
                                        if (kbs_utilities.NIL == constant_has_kbs_isa_assertionP2) {
                                            final SubLObject formula2 = el_utilities.make_binary_formula(kbs_utilities.$const102$isa, c2, kbs_utilities.$const136$Individual);
                                            Errors.warn((SubLObject)kbs_utilities.$str137$Saving__A_by_asserting__A__, c2, formula2);
                                            cyc_kernel.cyc_assert(formula2, kbs_utilities.$const138$UniversalVocabularyMt, (SubLObject)kbs_utilities.UNPROVIDED);
                                            final SubLObject a4 = czer_meta.find_assertion_cycl(formula2, kbs_utilities.$const138$UniversalVocabularyMt);
                                            if (kbs_utilities.NIL != assertion_handles.assertion_p(a4)) {
                                                kbs_identification.mark_kbs_assertion(a4);
                                            }
                                            else {
                                                Errors.warn((SubLObject)kbs_utilities.$str139$assertion__A_not_found, formula2);
                                            }
                                            assertion_count = Numbers.add(assertion_count, (SubLObject)kbs_utilities.ONE_INTEGER);
                                        }
                                    }
                                    sofar = Numbers.add(sofar, (SubLObject)kbs_utilities.ONE_INTEGER);
                                    utilities_macros.note_percent_progress(sofar, total);
                                }
                                id2 = Numbers.add(id2, (SubLObject)kbs_utilities.ONE_INTEGER);
                            }
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$118 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbs_utilities.T, thread);
                        final SubLObject _values3 = Values.getValuesAsVector();
                        utilities_macros.noting_percent_progress_postamble();
                        Values.restoreValuesFromVector(_values3);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$118, thread);
                    }
                }
            }
            finally {
                utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
                utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
                utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_1_$116, thread);
                utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0_$115, thread);
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return assertion_count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 32205L)
    public static SubLObject tkb_special_excluded_assertionP_internal(final SubLObject assertion) {
        final SubLObject hl_formula = fi.assertion_hl_formula(assertion, (SubLObject)kbs_utilities.UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject sub_assertions = cdolist_list_var = list_utilities.tree_find_all_if((SubLObject)kbs_utilities.$sym141$ASSERTION_P, hl_formula, (SubLObject)kbs_utilities.UNPROVIDED);
        SubLObject sub_assertion = (SubLObject)kbs_utilities.NIL;
        sub_assertion = cdolist_list_var.first();
        while (kbs_utilities.NIL != cdolist_list_var) {
            if (kbs_utilities.NIL != tkb_special_excluded_assertionP(sub_assertion)) {
                return (SubLObject)kbs_utilities.T;
            }
            cdolist_list_var = cdolist_list_var.rest();
            sub_assertion = cdolist_list_var.first();
        }
        final SubLObject monad_mt = hlmt.hlmt_monad_mt(assertions_high.assertion_mt(assertion));
        if (kbs_utilities.NIL != isa.isa_in_any_mtP(monad_mt, kbs_utilities.$const142$TKBFullySpecifiedSourceMicrotheor) || kbs_utilities.NIL != isa.isa_in_any_mtP(monad_mt, kbs_utilities.$const143$LexicalMicrotheory) || monad_mt.eql(kbs_utilities.$const144$TestVocabularyMt)) {
            return (SubLObject)kbs_utilities.NIL;
        }
        if (kbs_utilities.NIL != assertions_high.gaf_assertionP(assertion)) {
            final SubLObject pred = assertions_high.gaf_predicate(assertion);
            if (pred.eql(kbs_utilities.$const145$quotedIsa) || pred.eql(kbs_utilities.$const146$termOfUnit) || (pred.eql(kbs_utilities.$const102$isa) && (assertions_high.gaf_arg2(assertion).eql(kbs_utilities.$const136$Individual) || assertions_high.gaf_arg2(assertion).eql(kbs_utilities.$const147$Thing))) || kbs_utilities.NIL != isa.isa_in_any_mtP(pred, kbs_utilities.$const148$ImagePathnamePredicate)) {
                return (SubLObject)kbs_utilities.NIL;
            }
        }
        final SubLObject v_forts = assertions_high.assertion_forts(assertion, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED);
        SubLObject excludeP = (SubLObject)kbs_utilities.NIL;
        if (kbs_utilities.NIL == excludeP) {
            SubLObject csome_list_var = v_forts;
            SubLObject fort = (SubLObject)kbs_utilities.NIL;
            fort = csome_list_var.first();
            while (kbs_utilities.NIL == excludeP && kbs_utilities.NIL != csome_list_var) {
                if (kbs_utilities.NIL != tkb_special_excluded_termP(fort)) {
                    excludeP = (SubLObject)kbs_utilities.T;
                }
                csome_list_var = csome_list_var.rest();
                fort = csome_list_var.first();
            }
        }
        if (kbs_utilities.NIL == excludeP) {
            return (SubLObject)kbs_utilities.NIL;
        }
        return (SubLObject)kbs_utilities.T;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 32205L)
    public static SubLObject tkb_special_excluded_assertionP(final SubLObject assertion) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)kbs_utilities.NIL;
        if (kbs_utilities.NIL == v_memoization_state) {
            return tkb_special_excluded_assertionP_internal(assertion);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)kbs_utilities.$sym140$TKB_SPECIAL_EXCLUDED_ASSERTION_, (SubLObject)kbs_utilities.UNPROVIDED);
        if (kbs_utilities.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)kbs_utilities.$sym140$TKB_SPECIAL_EXCLUDED_ASSERTION_, (SubLObject)kbs_utilities.ONE_INTEGER, (SubLObject)kbs_utilities.NIL, (SubLObject)kbs_utilities.EQ, (SubLObject)kbs_utilities.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)kbs_utilities.$sym140$TKB_SPECIAL_EXCLUDED_ASSERTION_, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, assertion, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(tkb_special_excluded_assertionP_internal(assertion)));
            memoization_state.caching_state_put(caching_state, assertion, results, (SubLObject)kbs_utilities.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 33350L)
    public static SubLObject tkb_special_excluded_termP(final SubLObject fort) {
        return (SubLObject)SubLObjectFactory.makeBoolean((kbs_utilities.NIL != isa.isa_in_any_mtP(fort, kbs_utilities.$const149$Person) || kbs_utilities.NIL != isa.isa_in_any_mtP(fort, kbs_utilities.$const150$LegalCorporation) || kbs_utilities.NIL != isa.isa_in_any_mtP(fort, kbs_utilities.$const151$CommercialOrganization)) && kbs_utilities.NIL == quoted_isa_enhanced_in_any_mtP(fort, kbs_utilities.$const152$IndeterminateTerm) && kbs_utilities.NIL == quoted_isa_enhanced_in_any_mtP(fort, kbs_utilities.$const153$IndexicalConcept) && kbs_utilities.NIL == isa.isa_in_any_mtP(fort, kbs_utilities.$const154$AgentNowTerminated) && (kbs_utilities.NIL == isa.isa_in_any_mtP(fort, kbs_utilities.$const155$ComputerUserWithUserModel) || kbs_utilities.NIL != isa.isa_in_any_mtP(fort, kbs_utilities.$const156$HumanCyclist)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 33937L)
    public static SubLObject all_quoted_instances_enhanced(final SubLObject col, SubLObject mt) {
        if (mt == kbs_utilities.UNPROVIDED) {
            mt = (SubLObject)kbs_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject visited_quoted_specs = Hashtables.make_hash_table(cardinality_estimates.spec_cardinality(col), Symbols.symbol_function((SubLObject)kbs_utilities.EQ), (SubLObject)kbs_utilities.UNPROVIDED);
        final SubLObject visited_specs = Hashtables.make_hash_table((SubLObject)kbs_utilities.SIXTEEN_INTEGER, Symbols.symbol_function((SubLObject)kbs_utilities.EQ), (SubLObject)kbs_utilities.UNPROVIDED);
        final SubLObject unvisited_quoted_specs = queues.create_queue((SubLObject)kbs_utilities.UNPROVIDED);
        final SubLObject unvisited_specs = queues.create_queue((SubLObject)kbs_utilities.UNPROVIDED);
        final SubLObject result_set = Hashtables.make_hash_table((SubLObject)kbs_utilities.SIXTEEN_INTEGER, Symbols.symbol_function((SubLObject)kbs_utilities.EQ), (SubLObject)kbs_utilities.UNPROVIDED);
        SubLObject result = (SubLObject)kbs_utilities.NIL;
        final SubLObject mt_var = mt;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            queues.enqueue(col, unvisited_quoted_specs);
            while (kbs_utilities.NIL == queues.queue_empty_p(unvisited_quoted_specs) || kbs_utilities.NIL == queues.queue_empty_p(unvisited_specs)) {
                while (kbs_utilities.NIL == queues.queue_empty_p(unvisited_quoted_specs)) {
                    final SubLObject quoted_col = queues.dequeue(unvisited_quoted_specs);
                    if (kbs_utilities.NIL == Hashtables.gethash_without_values(quoted_col, visited_quoted_specs, (SubLObject)kbs_utilities.UNPROVIDED)) {
                        Hashtables.sethash(quoted_col, visited_quoted_specs, (SubLObject)kbs_utilities.T);
                        final SubLObject _prev_bind_0_$129 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_module_vars.$sbhl_module$.bind((kbs_utilities.NIL != sbhl_module_vars.get_sbhl_module(kbs_utilities.$const145$quotedIsa)) ? sbhl_module_vars.get_sbhl_module(kbs_utilities.$const145$quotedIsa) : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(quoted_col, sbhl_module_vars.get_sbhl_module(kbs_utilities.$const145$quotedIsa));
                            if (kbs_utilities.NIL != d_link) {
                                SubLObject cdolist_list_var = sbhl_module_utilities.get_relevant_sbhl_directions(sbhl_module_vars.get_sbhl_module(kbs_utilities.$const145$quotedIsa));
                                SubLObject direction = (SubLObject)kbs_utilities.NIL;
                                direction = cdolist_list_var.first();
                                while (kbs_utilities.NIL != cdolist_list_var) {
                                    final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, sbhl_module_vars.get_sbhl_module(kbs_utilities.$const145$quotedIsa));
                                    if (kbs_utilities.NIL != mt_links && direction.eql(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(kbs_utilities.$const145$quotedIsa)))) {
                                        SubLObject iteration_state;
                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); kbs_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                            thread.resetMultipleValues();
                                            final SubLObject mt_var_$130 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                            final SubLObject tv_links = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            SubLObject iteration_state_$131;
                                            for (iteration_state_$131 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); kbs_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$131); iteration_state_$131 = dictionary_contents.do_dictionary_contents_next(iteration_state_$131)) {
                                                thread.resetMultipleValues();
                                                final SubLObject tv_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$131);
                                                final SubLObject link_nodes_var = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                if (kbs_utilities.NIL != sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                    final SubLObject sol = link_nodes_var;
                                                    if (kbs_utilities.NIL != set.set_p(sol)) {
                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                        SubLObject basis_object;
                                                        SubLObject state;
                                                        SubLObject instance;
                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)kbs_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); kbs_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                            instance = set_contents.do_set_contents_next(basis_object, state);
                                                            if (kbs_utilities.NIL != set_contents.do_set_contents_element_validP(state, instance) && kbs_utilities.NIL != mt_relevance_macros.relevant_mtP(mt_var_$130) && kbs_utilities.NIL == Hashtables.gethash_without_values(instance, result_set, (SubLObject)kbs_utilities.UNPROVIDED)) {
                                                                result = (SubLObject)ConsesLow.cons(instance, result);
                                                                Hashtables.sethash(instance, result_set, (SubLObject)kbs_utilities.T);
                                                            }
                                                        }
                                                    }
                                                    else if (sol.isList()) {
                                                        SubLObject csome_list_var = sol;
                                                        SubLObject instance2 = (SubLObject)kbs_utilities.NIL;
                                                        instance2 = csome_list_var.first();
                                                        while (kbs_utilities.NIL != csome_list_var) {
                                                            if (kbs_utilities.NIL != mt_relevance_macros.relevant_mtP(mt_var_$130) && kbs_utilities.NIL == Hashtables.gethash_without_values(instance2, result_set, (SubLObject)kbs_utilities.UNPROVIDED)) {
                                                                result = (SubLObject)ConsesLow.cons(instance2, result);
                                                                Hashtables.sethash(instance2, result_set, (SubLObject)kbs_utilities.T);
                                                            }
                                                            csome_list_var = csome_list_var.rest();
                                                            instance2 = csome_list_var.first();
                                                        }
                                                    }
                                                    else {
                                                        Errors.error((SubLObject)kbs_utilities.$str114$_A_is_neither_SET_P_nor_LISTP_, sol);
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
                        }
                        finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$129, thread);
                        }
                        final SubLObject _prev_bind_0_$130 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_module_vars.$sbhl_module$.bind((kbs_utilities.NIL != sbhl_module_vars.get_sbhl_module(kbs_utilities.$const157$genls)) ? sbhl_module_vars.get_sbhl_module(kbs_utilities.$const157$genls) : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(quoted_col, sbhl_module_vars.get_sbhl_module(kbs_utilities.$const157$genls));
                            if (kbs_utilities.NIL != d_link) {
                                SubLObject cdolist_list_var = sbhl_module_utilities.get_relevant_sbhl_directions(sbhl_module_vars.get_sbhl_module(kbs_utilities.$const157$genls));
                                SubLObject direction = (SubLObject)kbs_utilities.NIL;
                                direction = cdolist_list_var.first();
                                while (kbs_utilities.NIL != cdolist_list_var) {
                                    final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, sbhl_module_vars.get_sbhl_module(kbs_utilities.$const157$genls));
                                    if (kbs_utilities.NIL != mt_links && direction.eql(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(kbs_utilities.$const157$genls)))) {
                                        SubLObject iteration_state;
                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); kbs_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                            thread.resetMultipleValues();
                                            final SubLObject mt_var_$131 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                            final SubLObject tv_links = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            SubLObject iteration_state_$132;
                                            for (iteration_state_$132 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); kbs_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$132); iteration_state_$132 = dictionary_contents.do_dictionary_contents_next(iteration_state_$132)) {
                                                thread.resetMultipleValues();
                                                final SubLObject tv_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$132);
                                                final SubLObject link_nodes_var = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                if (kbs_utilities.NIL != sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                    final SubLObject sol = link_nodes_var;
                                                    if (kbs_utilities.NIL != set.set_p(sol)) {
                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                        SubLObject basis_object;
                                                        SubLObject state;
                                                        SubLObject quoted_spec;
                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)kbs_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); kbs_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                            quoted_spec = set_contents.do_set_contents_next(basis_object, state);
                                                            if (kbs_utilities.NIL != set_contents.do_set_contents_element_validP(state, quoted_spec) && kbs_utilities.NIL != mt_relevance_macros.relevant_mtP(mt_var_$131) && kbs_utilities.NIL == Hashtables.gethash_without_values(quoted_spec, visited_quoted_specs, (SubLObject)kbs_utilities.UNPROVIDED)) {
                                                                queues.enqueue(quoted_spec, unvisited_quoted_specs);
                                                            }
                                                        }
                                                    }
                                                    else if (sol.isList()) {
                                                        SubLObject csome_list_var = sol;
                                                        SubLObject quoted_spec2 = (SubLObject)kbs_utilities.NIL;
                                                        quoted_spec2 = csome_list_var.first();
                                                        while (kbs_utilities.NIL != csome_list_var) {
                                                            if (kbs_utilities.NIL != mt_relevance_macros.relevant_mtP(mt_var_$131) && kbs_utilities.NIL == Hashtables.gethash_without_values(quoted_spec2, visited_quoted_specs, (SubLObject)kbs_utilities.UNPROVIDED)) {
                                                                queues.enqueue(quoted_spec2, unvisited_quoted_specs);
                                                            }
                                                            csome_list_var = csome_list_var.rest();
                                                            quoted_spec2 = csome_list_var.first();
                                                        }
                                                    }
                                                    else {
                                                        Errors.error((SubLObject)kbs_utilities.$str114$_A_is_neither_SET_P_nor_LISTP_, sol);
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
                        }
                        finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$130, thread);
                        }
                        SubLObject spec = (SubLObject)kbs_utilities.NIL;
                        final SubLObject pred_var = kbs_utilities.$const158$genls_GenlDenotesSpecInstances;
                        if (kbs_utilities.NIL == kb_mapping_macros.do_gaf_arg_index_key_validator(quoted_col, (SubLObject)kbs_utilities.TWO_INTEGER, pred_var)) {
                            continue;
                        }
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(quoted_col, (SubLObject)kbs_utilities.TWO_INTEGER, pred_var);
                        SubLObject done_var = (SubLObject)kbs_utilities.NIL;
                        final SubLObject token_var = (SubLObject)kbs_utilities.NIL;
                        while (kbs_utilities.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (kbs_utilities.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)kbs_utilities.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)kbs_utilities.$kw135$GAF, (SubLObject)kbs_utilities.$kw159$TRUE, (SubLObject)kbs_utilities.NIL);
                                    SubLObject done_var_$135 = (SubLObject)kbs_utilities.NIL;
                                    final SubLObject token_var_$136 = (SubLObject)kbs_utilities.NIL;
                                    while (kbs_utilities.NIL == done_var_$135) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$136);
                                        final SubLObject valid_$137 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$136.eql(assertion));
                                        if (kbs_utilities.NIL != valid_$137) {
                                            spec = assertions_high.gaf_arg(assertion, (SubLObject)kbs_utilities.ONE_INTEGER);
                                            if (kbs_utilities.NIL == Hashtables.gethash_without_values(spec, visited_specs, (SubLObject)kbs_utilities.UNPROVIDED)) {
                                                queues.enqueue(spec, unvisited_specs);
                                            }
                                        }
                                        done_var_$135 = (SubLObject)SubLObjectFactory.makeBoolean(kbs_utilities.NIL == valid_$137);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$131 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbs_utilities.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        if (kbs_utilities.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$131, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(kbs_utilities.NIL == valid);
                        }
                    }
                }
                while (kbs_utilities.NIL == queues.queue_empty_p(unvisited_specs)) {
                    final SubLObject unquoted_col = queues.dequeue(unvisited_specs);
                    if (kbs_utilities.NIL == Hashtables.gethash_without_values(unquoted_col, visited_specs, (SubLObject)kbs_utilities.UNPROVIDED)) {
                        Hashtables.sethash(unquoted_col, visited_specs, (SubLObject)kbs_utilities.T);
                        final SubLObject _prev_bind_0_$132 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_module_vars.$sbhl_module$.bind((kbs_utilities.NIL != sbhl_module_vars.get_sbhl_module(kbs_utilities.$const102$isa)) ? sbhl_module_vars.get_sbhl_module(kbs_utilities.$const102$isa) : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(unquoted_col, sbhl_module_vars.get_sbhl_module(kbs_utilities.$const102$isa));
                            if (kbs_utilities.NIL != d_link) {
                                SubLObject cdolist_list_var = sbhl_module_utilities.get_relevant_sbhl_directions(sbhl_module_vars.get_sbhl_module(kbs_utilities.$const102$isa));
                                SubLObject direction = (SubLObject)kbs_utilities.NIL;
                                direction = cdolist_list_var.first();
                                while (kbs_utilities.NIL != cdolist_list_var) {
                                    final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, sbhl_module_vars.get_sbhl_module(kbs_utilities.$const102$isa));
                                    if (kbs_utilities.NIL != mt_links && direction.eql(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(kbs_utilities.$const102$isa)))) {
                                        SubLObject iteration_state;
                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); kbs_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                            thread.resetMultipleValues();
                                            final SubLObject mt_var_$132 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                            final SubLObject tv_links = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            SubLObject iteration_state_$133;
                                            for (iteration_state_$133 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); kbs_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$133); iteration_state_$133 = dictionary_contents.do_dictionary_contents_next(iteration_state_$133)) {
                                                thread.resetMultipleValues();
                                                final SubLObject tv_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$133);
                                                final SubLObject link_nodes_var = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                if (kbs_utilities.NIL != sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                    final SubLObject sol = link_nodes_var;
                                                    if (kbs_utilities.NIL != set.set_p(sol)) {
                                                        final SubLObject set_contents_var = set.do_set_internal(sol);
                                                        SubLObject basis_object;
                                                        SubLObject state;
                                                        SubLObject instance;
                                                        for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)kbs_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); kbs_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                            instance = set_contents.do_set_contents_next(basis_object, state);
                                                            if (kbs_utilities.NIL != set_contents.do_set_contents_element_validP(state, instance) && kbs_utilities.NIL != mt_relevance_macros.relevant_mtP(mt_var_$132) && kbs_utilities.NIL == Hashtables.gethash_without_values(instance, result_set, (SubLObject)kbs_utilities.UNPROVIDED)) {
                                                                result = (SubLObject)ConsesLow.cons(instance, result);
                                                                Hashtables.sethash(instance, result_set, (SubLObject)kbs_utilities.T);
                                                            }
                                                        }
                                                    }
                                                    else if (sol.isList()) {
                                                        SubLObject csome_list_var = sol;
                                                        SubLObject instance2 = (SubLObject)kbs_utilities.NIL;
                                                        instance2 = csome_list_var.first();
                                                        while (kbs_utilities.NIL != csome_list_var) {
                                                            if (kbs_utilities.NIL != mt_relevance_macros.relevant_mtP(mt_var_$132) && kbs_utilities.NIL == Hashtables.gethash_without_values(instance2, result_set, (SubLObject)kbs_utilities.UNPROVIDED)) {
                                                                result = (SubLObject)ConsesLow.cons(instance2, result);
                                                                Hashtables.sethash(instance2, result_set, (SubLObject)kbs_utilities.T);
                                                            }
                                                            csome_list_var = csome_list_var.rest();
                                                            instance2 = csome_list_var.first();
                                                        }
                                                    }
                                                    else {
                                                        Errors.error((SubLObject)kbs_utilities.$str114$_A_is_neither_SET_P_nor_LISTP_, sol);
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
                        }
                        finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$132, thread);
                        }
                        SubLObject csome_list_var2 = sbhl_link_methods.non_fort_instance_table_lookup(unquoted_col);
                        SubLObject instance_tuple = (SubLObject)kbs_utilities.NIL;
                        instance_tuple = csome_list_var2.first();
                        while (kbs_utilities.NIL != csome_list_var2) {
                            SubLObject current;
                            final SubLObject datum = current = instance_tuple;
                            SubLObject instance3 = (SubLObject)kbs_utilities.NIL;
                            SubLObject mt_var_$133 = (SubLObject)kbs_utilities.NIL;
                            SubLObject tv_var2 = (SubLObject)kbs_utilities.NIL;
                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kbs_utilities.$list160);
                            instance3 = current.first();
                            current = current.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kbs_utilities.$list160);
                            mt_var_$133 = current.first();
                            current = current.rest();
                            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kbs_utilities.$list160);
                            tv_var2 = current.first();
                            current = current.rest();
                            if (kbs_utilities.NIL == current) {
                                if (kbs_utilities.NIL != sbhl_search_vars.sbhl_true_tv_p(tv_var2) && kbs_utilities.NIL != mt_relevance_macros.relevant_mtP(mt_var_$133) && kbs_utilities.NIL == Hashtables.gethash_without_values(instance3, result_set, (SubLObject)kbs_utilities.UNPROVIDED)) {
                                    result = (SubLObject)ConsesLow.cons(instance3, result);
                                    Hashtables.sethash(instance3, result_set, (SubLObject)kbs_utilities.T);
                                }
                            }
                            else {
                                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kbs_utilities.$list160);
                            }
                            csome_list_var2 = csome_list_var2.rest();
                            instance_tuple = csome_list_var2.first();
                        }
                        final SubLObject _prev_bind_0_$133 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_module_vars.$sbhl_module$.bind((kbs_utilities.NIL != sbhl_module_vars.get_sbhl_module(kbs_utilities.$const157$genls)) ? sbhl_module_vars.get_sbhl_module(kbs_utilities.$const157$genls) : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
                            final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(unquoted_col, sbhl_module_vars.get_sbhl_module(kbs_utilities.$const157$genls));
                            if (kbs_utilities.NIL == d_link) {
                                continue;
                            }
                            SubLObject cdolist_list_var = sbhl_module_utilities.get_relevant_sbhl_directions(sbhl_module_vars.get_sbhl_module(kbs_utilities.$const157$genls));
                            SubLObject direction = (SubLObject)kbs_utilities.NIL;
                            direction = cdolist_list_var.first();
                            while (kbs_utilities.NIL != cdolist_list_var) {
                                final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, sbhl_module_vars.get_sbhl_module(kbs_utilities.$const157$genls));
                                if (kbs_utilities.NIL != mt_links && direction.eql(sbhl_module_utilities.get_sbhl_module_backward_direction(sbhl_module_vars.get_sbhl_module(kbs_utilities.$const157$genls)))) {
                                    SubLObject iteration_state;
                                    for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); kbs_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                        thread.resetMultipleValues();
                                        final SubLObject mt_var_$134 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                        final SubLObject tv_links = thread.secondMultipleValue();
                                        thread.resetMultipleValues();
                                        SubLObject iteration_state_$134;
                                        for (iteration_state_$134 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); kbs_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$134); iteration_state_$134 = dictionary_contents.do_dictionary_contents_next(iteration_state_$134)) {
                                            thread.resetMultipleValues();
                                            final SubLObject tv_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$134);
                                            final SubLObject link_nodes_var = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            if (kbs_utilities.NIL != sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                                final SubLObject sol = link_nodes_var;
                                                if (kbs_utilities.NIL != set.set_p(sol)) {
                                                    final SubLObject set_contents_var = set.do_set_internal(sol);
                                                    SubLObject basis_object;
                                                    SubLObject state;
                                                    SubLObject spec2;
                                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)kbs_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); kbs_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                        spec2 = set_contents.do_set_contents_next(basis_object, state);
                                                        if (kbs_utilities.NIL != set_contents.do_set_contents_element_validP(state, spec2) && kbs_utilities.NIL != mt_relevance_macros.relevant_mtP(mt_var_$134) && kbs_utilities.NIL == Hashtables.gethash_without_values(spec2, visited_specs, (SubLObject)kbs_utilities.UNPROVIDED)) {
                                                            queues.enqueue(spec2, unvisited_specs);
                                                        }
                                                    }
                                                }
                                                else if (sol.isList()) {
                                                    SubLObject csome_list_var = sol;
                                                    SubLObject spec3 = (SubLObject)kbs_utilities.NIL;
                                                    spec3 = csome_list_var.first();
                                                    while (kbs_utilities.NIL != csome_list_var) {
                                                        if (kbs_utilities.NIL != mt_relevance_macros.relevant_mtP(mt_var_$134) && kbs_utilities.NIL == Hashtables.gethash_without_values(spec3, visited_specs, (SubLObject)kbs_utilities.UNPROVIDED)) {
                                                            queues.enqueue(spec3, unvisited_specs);
                                                        }
                                                        csome_list_var = csome_list_var.rest();
                                                        spec3 = csome_list_var.first();
                                                    }
                                                }
                                                else {
                                                    Errors.error((SubLObject)kbs_utilities.$str114$_A_is_neither_SET_P_nor_LISTP_, sol);
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
                        }
                        finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$133, thread);
                        }
                    }
                }
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 36223L)
    public static SubLObject quoted_isa_enhancedP(final SubLObject v_term, final SubLObject col, SubLObject mt) {
        if (mt == kbs_utilities.UNPROVIDED) {
            mt = (SubLObject)kbs_utilities.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject visited_quoted_genls = set.new_set(Symbols.symbol_function((SubLObject)kbs_utilities.EQ), cardinality_estimates.isa_cardinality(col));
        final SubLObject visited_genls = set.new_set(Symbols.symbol_function((SubLObject)kbs_utilities.EQ), cardinality_estimates.isa_cardinality(col));
        final SubLObject unvisited_quoted_genls = queues.create_queue((SubLObject)kbs_utilities.UNPROVIDED);
        final SubLObject unvisited_genls = queues.create_queue((SubLObject)kbs_utilities.UNPROVIDED);
        SubLObject successP = (SubLObject)kbs_utilities.NIL;
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
                sbhl_module_vars.$sbhl_module$.bind((kbs_utilities.NIL != sbhl_module_vars.get_sbhl_module(kbs_utilities.$const145$quotedIsa)) ? sbhl_module_vars.get_sbhl_module(kbs_utilities.$const145$quotedIsa) : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
                final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(v_term, sbhl_module_vars.get_sbhl_module(kbs_utilities.$const145$quotedIsa));
                if (kbs_utilities.NIL != d_link) {
                    SubLObject cdolist_list_var = sbhl_module_utilities.get_relevant_sbhl_directions(sbhl_module_vars.get_sbhl_module(kbs_utilities.$const145$quotedIsa));
                    SubLObject direction = (SubLObject)kbs_utilities.NIL;
                    direction = cdolist_list_var.first();
                    while (kbs_utilities.NIL != cdolist_list_var) {
                        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, sbhl_module_vars.get_sbhl_module(kbs_utilities.$const145$quotedIsa));
                        if (kbs_utilities.NIL != mt_links && direction.eql(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(kbs_utilities.$const145$quotedIsa)))) {
                            SubLObject iteration_state;
                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); kbs_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                thread.resetMultipleValues();
                                final SubLObject mt_var_$147 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                final SubLObject tv_links = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                SubLObject iteration_state_$148;
                                for (iteration_state_$148 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); kbs_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$148); iteration_state_$148 = dictionary_contents.do_dictionary_contents_next(iteration_state_$148)) {
                                    thread.resetMultipleValues();
                                    final SubLObject tv_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$148);
                                    final SubLObject link_nodes_var = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (kbs_utilities.NIL != sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                        final SubLObject sol = link_nodes_var;
                                        if (kbs_utilities.NIL != set.set_p(sol)) {
                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                            SubLObject basis_object;
                                            SubLObject state;
                                            SubLObject quoted_isa;
                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)kbs_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); kbs_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                quoted_isa = set_contents.do_set_contents_next(basis_object, state);
                                                if (kbs_utilities.NIL != set_contents.do_set_contents_element_validP(state, quoted_isa) && kbs_utilities.NIL != mt_relevance_macros.relevant_mtP(mt_var_$147)) {
                                                    queues.enqueue(quoted_isa, unvisited_quoted_genls);
                                                }
                                            }
                                        }
                                        else if (sol.isList()) {
                                            SubLObject csome_list_var = sol;
                                            SubLObject quoted_isa2 = (SubLObject)kbs_utilities.NIL;
                                            quoted_isa2 = csome_list_var.first();
                                            while (kbs_utilities.NIL != csome_list_var) {
                                                if (kbs_utilities.NIL != mt_relevance_macros.relevant_mtP(mt_var_$147)) {
                                                    queues.enqueue(quoted_isa2, unvisited_quoted_genls);
                                                }
                                                csome_list_var = csome_list_var.rest();
                                                quoted_isa2 = csome_list_var.first();
                                            }
                                        }
                                        else {
                                            Errors.error((SubLObject)kbs_utilities.$str114$_A_is_neither_SET_P_nor_LISTP_, sol);
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
            }
            finally {
                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$146, thread);
            }
            final SubLObject _prev_bind_0_$147 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
            try {
                sbhl_module_vars.$sbhl_module$.bind((kbs_utilities.NIL != sbhl_module_vars.get_sbhl_module(kbs_utilities.$const102$isa)) ? sbhl_module_vars.get_sbhl_module(kbs_utilities.$const102$isa) : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
                final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(v_term, sbhl_module_vars.get_sbhl_module(kbs_utilities.$const102$isa));
                if (kbs_utilities.NIL != d_link) {
                    SubLObject cdolist_list_var = sbhl_module_utilities.get_relevant_sbhl_directions(sbhl_module_vars.get_sbhl_module(kbs_utilities.$const102$isa));
                    SubLObject direction = (SubLObject)kbs_utilities.NIL;
                    direction = cdolist_list_var.first();
                    while (kbs_utilities.NIL != cdolist_list_var) {
                        final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, direction, sbhl_module_vars.get_sbhl_module(kbs_utilities.$const102$isa));
                        if (kbs_utilities.NIL != mt_links && direction.eql(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(kbs_utilities.$const102$isa)))) {
                            SubLObject iteration_state;
                            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); kbs_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                thread.resetMultipleValues();
                                final SubLObject mt_var_$148 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                final SubLObject tv_links = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                SubLObject iteration_state_$149;
                                for (iteration_state_$149 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); kbs_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$149); iteration_state_$149 = dictionary_contents.do_dictionary_contents_next(iteration_state_$149)) {
                                    thread.resetMultipleValues();
                                    final SubLObject tv_var = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$149);
                                    final SubLObject link_nodes_var = thread.secondMultipleValue();
                                    thread.resetMultipleValues();
                                    if (kbs_utilities.NIL != sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                                        final SubLObject sol = link_nodes_var;
                                        if (kbs_utilities.NIL != set.set_p(sol)) {
                                            final SubLObject set_contents_var = set.do_set_internal(sol);
                                            SubLObject basis_object;
                                            SubLObject state;
                                            SubLObject v_isa;
                                            for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)kbs_utilities.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); kbs_utilities.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                v_isa = set_contents.do_set_contents_next(basis_object, state);
                                                if (kbs_utilities.NIL != set_contents.do_set_contents_element_validP(state, v_isa) && kbs_utilities.NIL != mt_relevance_macros.relevant_mtP(mt_var_$148)) {
                                                    queues.enqueue(v_isa, unvisited_genls);
                                                }
                                            }
                                        }
                                        else if (sol.isList()) {
                                            SubLObject csome_list_var = sol;
                                            SubLObject v_isa2 = (SubLObject)kbs_utilities.NIL;
                                            v_isa2 = csome_list_var.first();
                                            while (kbs_utilities.NIL != csome_list_var) {
                                                if (kbs_utilities.NIL != mt_relevance_macros.relevant_mtP(mt_var_$148)) {
                                                    queues.enqueue(v_isa2, unvisited_genls);
                                                }
                                                csome_list_var = csome_list_var.rest();
                                                v_isa2 = csome_list_var.first();
                                            }
                                        }
                                        else {
                                            Errors.error((SubLObject)kbs_utilities.$str114$_A_is_neither_SET_P_nor_LISTP_, sol);
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
            }
            finally {
                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$147, thread);
            }
            while (kbs_utilities.NIL == successP && (kbs_utilities.NIL == queues.queue_empty_p(unvisited_quoted_genls) || kbs_utilities.NIL == queues.queue_empty_p(unvisited_genls))) {
                while (kbs_utilities.NIL == successP && kbs_utilities.NIL == queues.queue_empty_p(unvisited_quoted_genls)) {
                    final SubLObject quoted_col = queues.dequeue(unvisited_quoted_genls);
                    if (kbs_utilities.NIL == set.set_memberP(quoted_col, visited_quoted_genls)) {
                        set.set_add(quoted_col, visited_quoted_genls);
                        if (quoted_col.eql(col)) {
                            successP = (SubLObject)kbs_utilities.T;
                        }
                        else {
                            final SubLObject _prev_bind_0_$148 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                            try {
                                sbhl_module_vars.$sbhl_module$.bind((kbs_utilities.NIL != sbhl_module_vars.get_sbhl_module(kbs_utilities.$const157$genls)) ? sbhl_module_vars.get_sbhl_module(kbs_utilities.$const157$genls) : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
                                final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(quoted_col, sbhl_module_vars.get_sbhl_module(kbs_utilities.$const157$genls));
                                if (kbs_utilities.NIL == d_link2) {
                                    continue;
                                }
                                SubLObject cdolist_list_var2 = sbhl_module_utilities.get_relevant_sbhl_directions(sbhl_module_vars.get_sbhl_module(kbs_utilities.$const157$genls));
                                SubLObject direction2 = (SubLObject)kbs_utilities.NIL;
                                direction2 = cdolist_list_var2.first();
                                while (kbs_utilities.NIL != cdolist_list_var2) {
                                    final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, direction2, sbhl_module_vars.get_sbhl_module(kbs_utilities.$const157$genls));
                                    if (kbs_utilities.NIL != mt_links2 && direction2.eql(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(kbs_utilities.$const157$genls)))) {
                                        SubLObject iteration_state2;
                                        for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); kbs_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                            thread.resetMultipleValues();
                                            final SubLObject mt_var_$149 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                            final SubLObject tv_links2 = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            SubLObject iteration_state_$150;
                                            for (iteration_state_$150 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); kbs_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$150); iteration_state_$150 = dictionary_contents.do_dictionary_contents_next(iteration_state_$150)) {
                                                thread.resetMultipleValues();
                                                final SubLObject tv_var2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$150);
                                                final SubLObject link_nodes_var2 = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                if (kbs_utilities.NIL != sbhl_search_vars.sbhl_true_tv_p(tv_var2)) {
                                                    final SubLObject sol2 = link_nodes_var2;
                                                    if (kbs_utilities.NIL != set.set_p(sol2)) {
                                                        final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                        SubLObject basis_object2;
                                                        SubLObject state2;
                                                        SubLObject quoted_genl;
                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)kbs_utilities.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); kbs_utilities.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                            quoted_genl = set_contents.do_set_contents_next(basis_object2, state2);
                                                            if (kbs_utilities.NIL != set_contents.do_set_contents_element_validP(state2, quoted_genl) && kbs_utilities.NIL != mt_relevance_macros.relevant_mtP(mt_var_$149) && kbs_utilities.NIL == set.set_memberP(quoted_genl, visited_quoted_genls)) {
                                                                queues.enqueue(quoted_genl, unvisited_quoted_genls);
                                                            }
                                                        }
                                                    }
                                                    else if (sol2.isList()) {
                                                        SubLObject csome_list_var2 = sol2;
                                                        SubLObject quoted_genl2 = (SubLObject)kbs_utilities.NIL;
                                                        quoted_genl2 = csome_list_var2.first();
                                                        while (kbs_utilities.NIL != csome_list_var2) {
                                                            if (kbs_utilities.NIL != mt_relevance_macros.relevant_mtP(mt_var_$149) && kbs_utilities.NIL == set.set_memberP(quoted_genl2, visited_quoted_genls)) {
                                                                queues.enqueue(quoted_genl2, unvisited_quoted_genls);
                                                            }
                                                            csome_list_var2 = csome_list_var2.rest();
                                                            quoted_genl2 = csome_list_var2.first();
                                                        }
                                                    }
                                                    else {
                                                        Errors.error((SubLObject)kbs_utilities.$str114$_A_is_neither_SET_P_nor_LISTP_, sol2);
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
                            }
                            finally {
                                sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$148, thread);
                            }
                        }
                    }
                }
                while (kbs_utilities.NIL == successP && kbs_utilities.NIL != queues.queue_empty_p(unvisited_quoted_genls) && kbs_utilities.NIL == queues.queue_empty_p(unvisited_genls)) {
                    final SubLObject unquoted_col = queues.dequeue(unvisited_genls);
                    if (kbs_utilities.NIL == set.set_memberP(unquoted_col, visited_genls)) {
                        set.set_add(unquoted_col, visited_genls);
                        final SubLObject _prev_bind_0_$149 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                        try {
                            sbhl_module_vars.$sbhl_module$.bind((kbs_utilities.NIL != sbhl_module_vars.get_sbhl_module(kbs_utilities.$const157$genls)) ? sbhl_module_vars.get_sbhl_module(kbs_utilities.$const157$genls) : sbhl_module_vars.$sbhl_module$.getDynamicValue(thread), thread);
                            final SubLObject d_link2 = sbhl_graphs.get_sbhl_graph_link(unquoted_col, sbhl_module_vars.get_sbhl_module(kbs_utilities.$const157$genls));
                            if (kbs_utilities.NIL != d_link2) {
                                SubLObject cdolist_list_var2 = sbhl_module_utilities.get_relevant_sbhl_directions(sbhl_module_vars.get_sbhl_module(kbs_utilities.$const157$genls));
                                SubLObject direction2 = (SubLObject)kbs_utilities.NIL;
                                direction2 = cdolist_list_var2.first();
                                while (kbs_utilities.NIL != cdolist_list_var2) {
                                    final SubLObject mt_links2 = sbhl_links.get_sbhl_mt_links(d_link2, direction2, sbhl_module_vars.get_sbhl_module(kbs_utilities.$const157$genls));
                                    if (kbs_utilities.NIL != mt_links2 && direction2.eql(sbhl_module_utilities.get_sbhl_module_forward_direction(sbhl_module_vars.get_sbhl_module(kbs_utilities.$const157$genls)))) {
                                        SubLObject iteration_state2;
                                        for (iteration_state2 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links2)); kbs_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state2); iteration_state2 = dictionary_contents.do_dictionary_contents_next(iteration_state2)) {
                                            thread.resetMultipleValues();
                                            final SubLObject mt_var_$150 = dictionary_contents.do_dictionary_contents_key_value(iteration_state2);
                                            final SubLObject tv_links2 = thread.secondMultipleValue();
                                            thread.resetMultipleValues();
                                            SubLObject iteration_state_$151;
                                            for (iteration_state_$151 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links2)); kbs_utilities.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$151); iteration_state_$151 = dictionary_contents.do_dictionary_contents_next(iteration_state_$151)) {
                                                thread.resetMultipleValues();
                                                final SubLObject tv_var2 = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$151);
                                                final SubLObject link_nodes_var2 = thread.secondMultipleValue();
                                                thread.resetMultipleValues();
                                                if (kbs_utilities.NIL != sbhl_search_vars.sbhl_true_tv_p(tv_var2)) {
                                                    final SubLObject sol2 = link_nodes_var2;
                                                    if (kbs_utilities.NIL != set.set_p(sol2)) {
                                                        final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                        SubLObject basis_object2;
                                                        SubLObject state2;
                                                        SubLObject unquoted_genl;
                                                        for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)kbs_utilities.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); kbs_utilities.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                            unquoted_genl = set_contents.do_set_contents_next(basis_object2, state2);
                                                            if (kbs_utilities.NIL != set_contents.do_set_contents_element_validP(state2, unquoted_genl) && kbs_utilities.NIL != mt_relevance_macros.relevant_mtP(mt_var_$150) && kbs_utilities.NIL == set.set_memberP(unquoted_genl, visited_genls)) {
                                                                queues.enqueue(unquoted_genl, unvisited_genls);
                                                            }
                                                        }
                                                    }
                                                    else if (sol2.isList()) {
                                                        SubLObject csome_list_var2 = sol2;
                                                        SubLObject unquoted_genl2 = (SubLObject)kbs_utilities.NIL;
                                                        unquoted_genl2 = csome_list_var2.first();
                                                        while (kbs_utilities.NIL != csome_list_var2) {
                                                            if (kbs_utilities.NIL != mt_relevance_macros.relevant_mtP(mt_var_$150) && kbs_utilities.NIL == set.set_memberP(unquoted_genl2, visited_genls)) {
                                                                queues.enqueue(unquoted_genl2, unvisited_genls);
                                                            }
                                                            csome_list_var2 = csome_list_var2.rest();
                                                            unquoted_genl2 = csome_list_var2.first();
                                                        }
                                                    }
                                                    else {
                                                        Errors.error((SubLObject)kbs_utilities.$str114$_A_is_neither_SET_P_nor_LISTP_, sol2);
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
                        }
                        finally {
                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$149, thread);
                        }
                        SubLObject quoted_genl3 = (SubLObject)kbs_utilities.NIL;
                        final SubLObject pred_var = kbs_utilities.$const158$genls_GenlDenotesSpecInstances;
                        if (kbs_utilities.NIL == kb_mapping_macros.do_gaf_arg_index_key_validator(unquoted_col, (SubLObject)kbs_utilities.ONE_INTEGER, pred_var)) {
                            continue;
                        }
                        final SubLObject iterator_var = kb_mapping_macros.new_gaf_arg_final_index_spec_iterator(unquoted_col, (SubLObject)kbs_utilities.ONE_INTEGER, pred_var);
                        SubLObject done_var = (SubLObject)kbs_utilities.NIL;
                        final SubLObject token_var = (SubLObject)kbs_utilities.NIL;
                        while (kbs_utilities.NIL == done_var) {
                            final SubLObject final_index_spec = iteration.iteration_next_without_values_macro_helper(iterator_var, token_var);
                            final SubLObject valid = (SubLObject)SubLObjectFactory.makeBoolean(!token_var.eql(final_index_spec));
                            if (kbs_utilities.NIL != valid) {
                                SubLObject final_index_iterator = (SubLObject)kbs_utilities.NIL;
                                try {
                                    final_index_iterator = kb_mapping_macros.new_final_index_iterator(final_index_spec, (SubLObject)kbs_utilities.$kw135$GAF, (SubLObject)kbs_utilities.$kw159$TRUE, (SubLObject)kbs_utilities.NIL);
                                    SubLObject done_var_$158 = (SubLObject)kbs_utilities.NIL;
                                    final SubLObject token_var_$159 = (SubLObject)kbs_utilities.NIL;
                                    while (kbs_utilities.NIL == done_var_$158) {
                                        final SubLObject assertion = iteration.iteration_next_without_values_macro_helper(final_index_iterator, token_var_$159);
                                        final SubLObject valid_$160 = (SubLObject)SubLObjectFactory.makeBoolean(!token_var_$159.eql(assertion));
                                        if (kbs_utilities.NIL != valid_$160) {
                                            quoted_genl3 = assertions_high.gaf_arg(assertion, (SubLObject)kbs_utilities.TWO_INTEGER);
                                            if (kbs_utilities.NIL == set.set_memberP(quoted_genl3, visited_quoted_genls)) {
                                                queues.enqueue(quoted_genl3, unvisited_quoted_genls);
                                            }
                                        }
                                        done_var_$158 = (SubLObject)SubLObjectFactory.makeBoolean(kbs_utilities.NIL == valid_$160);
                                    }
                                }
                                finally {
                                    final SubLObject _prev_bind_0_$150 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                                    try {
                                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbs_utilities.T, thread);
                                        final SubLObject _values = Values.getValuesAsVector();
                                        if (kbs_utilities.NIL != final_index_iterator) {
                                            kb_mapping_macros.destroy_final_index_iterator(final_index_iterator);
                                        }
                                        Values.restoreValuesFromVector(_values);
                                    }
                                    finally {
                                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$150, thread);
                                    }
                                }
                            }
                            done_var = (SubLObject)SubLObjectFactory.makeBoolean(kbs_utilities.NIL == valid);
                        }
                    }
                }
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return successP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 38328L)
    public static SubLObject quoted_isa_enhanced_in_any_mtP(final SubLObject v_term, final SubLObject col) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)kbs_utilities.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)kbs_utilities.$sym51$RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind(kbs_utilities.$const52$EverythingPSC, thread);
            result = quoted_isa_enhancedP(v_term, col, (SubLObject)kbs_utilities.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 38664L)
    public static SubLObject do_all_quoted_instances_enhanced(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kbs_utilities.$list161);
        final SubLObject temp = current.rest();
        current = current.first();
        SubLObject instance_var = (SubLObject)kbs_utilities.NIL;
        SubLObject v_term = (SubLObject)kbs_utilities.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kbs_utilities.$list161);
        instance_var = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)kbs_utilities.$list161);
        v_term = current.first();
        current = current.rest();
        SubLObject allow_other_keys_p = (SubLObject)kbs_utilities.NIL;
        SubLObject rest = current;
        SubLObject bad = (SubLObject)kbs_utilities.NIL;
        SubLObject current_$162 = (SubLObject)kbs_utilities.NIL;
        while (kbs_utilities.NIL != rest) {
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kbs_utilities.$list161);
            current_$162 = rest.first();
            rest = rest.rest();
            cdestructuring_bind.destructuring_bind_must_consp(rest, datum, (SubLObject)kbs_utilities.$list161);
            if (kbs_utilities.NIL == conses_high.member(current_$162, (SubLObject)kbs_utilities.$list162, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED)) {
                bad = (SubLObject)kbs_utilities.T;
            }
            if (current_$162 == kbs_utilities.$kw163$ALLOW_OTHER_KEYS) {
                allow_other_keys_p = rest.first();
            }
            rest = rest.rest();
        }
        if (kbs_utilities.NIL != bad && kbs_utilities.NIL == allow_other_keys_p) {
            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)kbs_utilities.$list161);
        }
        final SubLObject mt_tail = cdestructuring_bind.property_list_member((SubLObject)kbs_utilities.$kw164$MT, current);
        final SubLObject mt = (SubLObject)((kbs_utilities.NIL != mt_tail) ? conses_high.cadr(mt_tail) : kbs_utilities.NIL);
        final SubLObject done_tail = cdestructuring_bind.property_list_member((SubLObject)kbs_utilities.$kw165$DONE, current);
        final SubLObject done = (SubLObject)((kbs_utilities.NIL != done_tail) ? conses_high.cadr(done_tail) : kbs_utilities.NIL);
        final SubLObject body;
        current = (body = temp);
        return (SubLObject)ConsesLow.listS((SubLObject)kbs_utilities.$sym166$DO_LIST, (SubLObject)ConsesLow.list(instance_var, (SubLObject)ConsesLow.list((SubLObject)kbs_utilities.$sym167$ALL_QUOTED_INSTANCES_ENHANCED, v_term, mt), (SubLObject)kbs_utilities.$kw165$DONE, done), ConsesLow.append(body, (SubLObject)kbs_utilities.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 39029L)
    public static SubLObject set_kbs_definition_from_kbs_profile(final SubLObject kbs_profile) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (kbs_utilities.NIL == isa.isa_in_any_mtP(kbs_profile, kbs_utilities.$const168$KBSubsetProfile)) {
            Errors.error((SubLObject)kbs_utilities.$str169$_S_is_not_a_valid___KBSubsetProfi);
        }
        final SubLObject remove_assertions = kb_mapping_utilities.pred_values_in_any_mt(kbs_profile, kbs_utilities.$const170$kbsProfileRemoveAssertion, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED);
        final SubLObject remove_coll_extent = kb_mapping_utilities.pred_values_in_any_mt(kbs_profile, kbs_utilities.$const171$kbsProfileRemoveCollectionExtent, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED);
        final SubLObject remove_forts = kb_mapping_utilities.pred_values_in_any_mt(kbs_profile, kbs_utilities.$const172$kbsProfileRemoveFORT, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED);
        final SubLObject remove_predicate_extent = kb_mapping_utilities.pred_values_in_any_mt(kbs_profile, kbs_utilities.$const173$kbsProfileRemovePredicateExtent, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED);
        final SubLObject retain_assertion = kb_mapping_utilities.pred_values_in_any_mt(kbs_profile, kbs_utilities.$const174$kbsProfileRetainAssertion, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED);
        final SubLObject retain_term = kb_mapping_utilities.pred_values_in_any_mt(kbs_profile, kbs_utilities.$const175$kbsProfileRetainTerm, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED);
        kbs_utilities.$kbs_definition$.setDynamicValue((SubLObject)ConsesLow.list((SubLObject)kbs_utilities.$kw11$NAME, kb_paths.fort_name(kbs_profile), (SubLObject)kbs_utilities.$kw16$INHERITED_STORES, (SubLObject)kbs_utilities.$list176, (SubLObject)kbs_utilities.$kw9$SECTIONS, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(new SubLObject[] { kbs_utilities.$kw23$COLLECTIONS, kbs_utilities.$list177, kbs_utilities.$kw31$OMISSION_ASSERTIONS, remove_assertions, kbs_utilities.$kw25$OMISSION_COLLECTIONS, remove_coll_extent, kbs_utilities.$kw30$OMISSION_TERMS, remove_forts, kbs_utilities.$kw34$OMISSION_PREDICATE_EXTENT, remove_predicate_extent, kbs_utilities.$kw33$RETAINED_ASSERTIONS, retain_assertion, kbs_utilities.$kw32$RETAINED_TERMS, retain_term }))), thread);
        return kbs_utilities.$kbs_definition$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 40378L)
    public static SubLObject set_kbs_definition(final SubLObject definition_string) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        Errors.error((SubLObject)kbs_utilities.$str178$KB_subsets_are_not_supported_on_t);
        return kbs_utilities.$kbs_definition$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 65343L)
    public static SubLObject kbs_all_opencyc_formulas_to_file(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject stream = (SubLObject)kbs_utilities.NIL;
        try {
            final SubLObject _prev_bind_0 = stream_macros.$stream_requires_locking$.currentBinding(thread);
            try {
                stream_macros.$stream_requires_locking$.bind((SubLObject)kbs_utilities.NIL, thread);
                stream = compatibility.open_text(filename, (SubLObject)kbs_utilities.$kw179$OUTPUT);
            }
            finally {
                stream_macros.$stream_requires_locking$.rebind(_prev_bind_0, thread);
            }
            if (!stream.isStream()) {
                Errors.error((SubLObject)kbs_utilities.$str180$Unable_to_open__S, filename);
            }
            final SubLObject s = stream;
            kbs_all_opencyc_formulas_to_stream(s);
        }
        finally {
            final SubLObject _prev_bind_2 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
            try {
                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbs_utilities.T, thread);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)kbs_utilities.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_2, thread);
            }
        }
        return filename;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/kbs-utilities.lisp", position = 65720L)
    public static SubLObject kbs_all_opencyc_formulas_to_stream(final SubLObject stream) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        streams_high.write_string(misc_utilities.kb_content_copyright_notice(), stream, (SubLObject)kbs_utilities.UNPROVIDED, (SubLObject)kbs_utilities.UNPROVIDED);
        streams_high.terpri(stream);
        final SubLObject idx = assertion_handles.do_assertions_table();
        final SubLObject mess = (SubLObject)kbs_utilities.$str181$Gathering_up_all_assertion_EL_for;
        final SubLObject total = id_index.id_index_count(idx);
        SubLObject sofar = (SubLObject)kbs_utilities.ZERO_INTEGER;
        assert kbs_utilities.NIL != Types.stringp(mess) : mess;
        final SubLObject _prev_bind_0 = utilities_macros.$last_percent_progress_index$.currentBinding(thread);
        final SubLObject _prev_bind_2 = utilities_macros.$last_percent_progress_prediction$.currentBinding(thread);
        final SubLObject _prev_bind_3 = utilities_macros.$within_noting_percent_progress$.currentBinding(thread);
        final SubLObject _prev_bind_4 = utilities_macros.$percent_progress_start_time$.currentBinding(thread);
        try {
            utilities_macros.$last_percent_progress_index$.bind((SubLObject)kbs_utilities.ZERO_INTEGER, thread);
            utilities_macros.$last_percent_progress_prediction$.bind((SubLObject)kbs_utilities.NIL, thread);
            utilities_macros.$within_noting_percent_progress$.bind((SubLObject)kbs_utilities.T, thread);
            utilities_macros.$percent_progress_start_time$.bind(Time.get_universal_time(), thread);
            try {
                utilities_macros.noting_percent_progress_preamble(mess);
                final SubLObject idx_$163 = idx;
                if (kbs_utilities.NIL == id_index.id_index_objects_empty_p(idx_$163, (SubLObject)kbs_utilities.$kw54$SKIP)) {
                    final SubLObject idx_$164 = idx_$163;
                    if (kbs_utilities.NIL == id_index.id_index_dense_objects_empty_p(idx_$164, (SubLObject)kbs_utilities.$kw54$SKIP)) {
                        final SubLObject vector_var = id_index.id_index_dense_objects(idx_$164);
                        final SubLObject backwardP_var = (SubLObject)kbs_utilities.NIL;
                        SubLObject length;
                        SubLObject v_iteration;
                        SubLObject a_id;
                        SubLObject a_handle;
                        SubLObject ass;
                        SubLObject sentence;
                        for (length = Sequences.length(vector_var), v_iteration = (SubLObject)kbs_utilities.NIL, v_iteration = (SubLObject)kbs_utilities.ZERO_INTEGER; v_iteration.numL(length); v_iteration = Numbers.add(v_iteration, (SubLObject)kbs_utilities.ONE_INTEGER)) {
                            a_id = ((kbs_utilities.NIL != backwardP_var) ? Numbers.subtract(length, v_iteration, (SubLObject)kbs_utilities.ONE_INTEGER) : v_iteration);
                            a_handle = Vectors.aref(vector_var, a_id);
                            if (kbs_utilities.NIL == id_index.id_index_tombstone_p(a_handle) || kbs_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kbs_utilities.$kw54$SKIP)) {
                                if (kbs_utilities.NIL != id_index.id_index_tombstone_p(a_handle)) {
                                    a_handle = (SubLObject)kbs_utilities.$kw54$SKIP;
                                }
                                ass = assertion_handles.resolve_assertion_id_value_pair(a_id, a_handle);
                                sentence = uncanonicalizer.assertion_el_ist_formula(ass);
                                format_cycl_expression.format_cycl_expression(sentence, stream, (SubLObject)kbs_utilities.UNPROVIDED);
                                sofar = Numbers.add(sofar, (SubLObject)kbs_utilities.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                        }
                    }
                    final SubLObject idx_$165 = idx_$163;
                    if (kbs_utilities.NIL == id_index.id_index_sparse_objects_empty_p(idx_$165) || kbs_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kbs_utilities.$kw54$SKIP)) {
                        final SubLObject sparse = id_index.id_index_sparse_objects(idx_$165);
                        SubLObject a_id2 = id_index.id_index_sparse_id_threshold(idx_$165);
                        final SubLObject end_id = id_index.id_index_next_id(idx_$165);
                        final SubLObject v_default = (SubLObject)((kbs_utilities.NIL != id_index.id_index_skip_tombstones_p((SubLObject)kbs_utilities.$kw54$SKIP)) ? kbs_utilities.NIL : kbs_utilities.$kw54$SKIP);
                        while (a_id2.numL(end_id)) {
                            final SubLObject a_handle2 = Hashtables.gethash_without_values(a_id2, sparse, v_default);
                            if (kbs_utilities.NIL == id_index.id_index_skip_tombstones_p((SubLObject)kbs_utilities.$kw54$SKIP) || kbs_utilities.NIL == id_index.id_index_tombstone_p(a_handle2)) {
                                final SubLObject ass2 = assertion_handles.resolve_assertion_id_value_pair(a_id2, a_handle2);
                                final SubLObject sentence2 = uncanonicalizer.assertion_el_ist_formula(ass2);
                                format_cycl_expression.format_cycl_expression(sentence2, stream, (SubLObject)kbs_utilities.UNPROVIDED);
                                sofar = Numbers.add(sofar, (SubLObject)kbs_utilities.ONE_INTEGER);
                                utilities_macros.note_percent_progress(sofar, total);
                            }
                            a_id2 = Numbers.add(a_id2, (SubLObject)kbs_utilities.ONE_INTEGER);
                        }
                    }
                }
            }
            finally {
                final SubLObject _prev_bind_0_$166 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)kbs_utilities.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    utilities_macros.noting_percent_progress_postamble();
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$166, thread);
                }
            }
        }
        finally {
            utilities_macros.$percent_progress_start_time$.rebind(_prev_bind_4, thread);
            utilities_macros.$within_noting_percent_progress$.rebind(_prev_bind_3, thread);
            utilities_macros.$last_percent_progress_prediction$.rebind(_prev_bind_2, thread);
            utilities_macros.$last_percent_progress_index$.rebind(_prev_bind_0, thread);
        }
        return stream;
    }
    
    public static SubLObject declare_kbs_utilities_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "make_kbs_partition", "MAKE-KBS-PARTITION", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "prepare_kb_for_kbs_partition", "PREPARE-KB-FOR-KBS-PARTITION", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "complete_kbs_partition", "COMPLETE-KBS-PARTITION", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "prepare_for_kbs_partition", "PREPARE-FOR-KBS-PARTITION", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "construct_kbs_partition", "CONSTRUCT-KBS-PARTITION", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "write_out_kbs_partition", "WRITE-OUT-KBS-PARTITION", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "load_partition_into_empty_kb", "LOAD-PARTITION-INTO-EMPTY-KB", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "kbs_image_cleanup", "KBS-IMAGE-CLEANUP", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "sbhl_caching_init", "SBHL-CACHING-INIT", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "kbs_definition_validP", "KBS-DEFINITION-VALID?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "get_kbs_name", "GET-KBS-NAME", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "get_kbs_sections", "GET-KBS-SECTIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "get_kbs_prerun_fns", "GET-KBS-PRERUN-FNS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "get_kbs_preremoved_assertions", "GET-KBS-PREREMOVED-ASSERTIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "get_kbs_post_identify_forts_fns", "GET-KBS-POST-IDENTIFY-FORTS-FNS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "get_kbs_post_identify_assertions_fns", "GET-KBS-POST-IDENTIFY-ASSERTIONS-FNS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "get_kbs_inherited_stores", "GET-KBS-INHERITED-STORES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "kbs_section_definition_validP", "KBS-SECTION-DEFINITION-VALID?", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kbs_utilities", "do_kbs_definitional_sections", "DO-KBS-DEFINITIONAL-SECTIONS");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "get_kbs_section_collections", "GET-KBS-SECTION-COLLECTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "get_kbs_section_sets", "GET-KBS-SECTION-SETS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "get_kbs_section_omission_collections", "GET-KBS-SECTION-OMISSION-COLLECTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "get_kbs_section_omission_predicate", "GET-KBS-SECTION-OMISSION-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "get_kbs_section_definitional_predicate_set", "GET-KBS-SECTION-DEFINITIONAL-PREDICATE-SET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "get_kbs_section_definitional_rule_predicate", "GET-KBS-SECTION-DEFINITIONAL-RULE-PREDICATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "get_kbs_section_kbq_query_sets", "GET-KBS-SECTION-KBQ-QUERY-SETS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "get_kbs_section_omission_terms", "GET-KBS-SECTION-OMISSION-TERMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "get_kbs_section_omission_assertions", "GET-KBS-SECTION-OMISSION-ASSERTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "get_kbs_section_retained_terms", "GET-KBS-SECTION-RETAINED-TERMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "get_kbs_section_retained_assertions", "GET-KBS-SECTION-RETAINED-ASSERTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "get_kbs_section_omission_predicate_extent", "GET-KBS-SECTION-OMISSION-PREDICATE-EXTENT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "save_inherited_stores", "SAVE-INHERITED-STORES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "load_inherited_stores", "LOAD-INHERITED-STORES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "opencyc_kbs_assert_broader_term_gafs", "OPENCYC-KBS-ASSERT-BROADER-TERM-GAFS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "opencyc_kbs_contribute_to_broader_term_gafs", "OPENCYC-KBS-CONTRIBUTE-TO-BROADER-TERM-GAFS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "opencyc_kbs_new_kbs_fort_iterator", "OPENCYC-KBS-NEW-KBS-FORT-ITERATOR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "opencyc_kbs_new_assertion_accumulator", "OPENCYC-KBS-NEW-ASSERTION-ACCUMULATOR", 0, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "opencyc_kbs_new_accumulated_assertions_iterator", "OPENCYC-KBS-NEW-ACCUMULATED-ASSERTIONS-ITERATOR", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "opencyc_kbs_new_accumulated_broader_term_assertion_iterator", "OPENCYC-KBS-NEW-ACCUMULATED-BROADER-TERM-ASSERTION-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "opencyc_kbs_new_broader_term_assertion_accumulator", "OPENCYC-KBS-NEW-BROADER-TERM-ASSERTION-ACCUMULATOR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "opencyc_kbs_possibly_prepare_broader_term_queue", "OPENCYC-KBS-POSSIBLY-PREPARE-BROADER-TERM-QUEUE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "opencyc_kbs_prepare_broader_term_queue", "OPENCYC-KBS-PREPARE-BROADER-TERM-QUEUE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "kbs_extract_broader_term_gaf_specifics", "KBS-EXTRACT-BROADER-TERM-GAF-SPECIFICS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "kbs_reconstitute_broader_term_gaf_specifics", "KBS-RECONSTITUTE-BROADER-TERM-GAF-SPECIFICS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "unmark_forts_without_assertions", "UNMARK-FORTS-WITHOUT-ASSERTIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "valid_opencyc_kbs_prettystrings_sqs_setupP", "VALID-OPENCYC-KBS-PRETTYSTRINGS-SQS-SETUP?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "opencyc_kbs_forts_assert_pretty_strings", "OPENCYC-KBS-FORTS-ASSERT-PRETTY-STRINGS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "opencyc_kbs_forts_contribute_pretty_strings", "OPENCYC-KBS-FORTS-CONTRIBUTE-PRETTY-STRINGS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "opencyc_kbs_populate_prettystring_term_queue", "OPENCYC-KBS-POPULATE-PRETTYSTRING-TERM-QUEUE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "opencyc_kbs_simplify_pretty_string_ist", "OPENCYC-KBS-SIMPLIFY-PRETTY-STRING-IST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "opencyc_kbs_reconstitute_pretty_string_ist", "OPENCYC-KBS-RECONSTITUTE-PRETTY-STRING-IST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "opencyc_kbs_forts_work_on_pretty_strings", "OPENCYC-KBS-FORTS-WORK-ON-PRETTY-STRINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "new_kbs_pretty_string_fort_iterator", "NEW-KBS-PRETTY-STRING-FORT-ITERATOR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "kbs_pretty_string_fortP", "KBS-PRETTY-STRING-FORT?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "new_pretty_string_assert_sentence_accumulator", "NEW-PRETTY-STRING-ASSERT-SENTENCE-ACCUMULATOR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "pretty_string_assert_sentence_accumulator_reset", "PRETTY-STRING-ASSERT-SENTENCE-ACCUMULATOR-RESET", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "pretty_string_assert_sentence_accumulator_add", "PRETTY-STRING-ASSERT-SENTENCE-ACCUMULATOR-ADD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "pretty_string_assert_sentence_accumulator_size", "PRETTY-STRING-ASSERT-SENTENCE-ACCUMULATOR-SIZE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "pretty_string_assert_sentence_accumulator_contents", "PRETTY-STRING-ASSERT-SENTENCE-ACCUMULATOR-CONTENTS", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "pretty_string_assert_sentence_accumulator_iterator", "PRETTY-STRING-ASSERT-SENTENCE-ACCUMULATOR-ITERATOR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "opencyc_kbs_remove_excluded_synonymous_external_concept_assertions", "OPENCYC-KBS-REMOVE-EXCLUDED-SYNONYMOUS-EXTERNAL-CONCEPT-ASSERTIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "opencyc_kbs_possibly_remove_excluded_synonymous_external_concept_assertion", "OPENCYC-KBS-POSSIBLY-REMOVE-EXCLUDED-SYNONYMOUS-EXTERNAL-CONCEPT-ASSERTION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "opencyc_kbs_prepare_caches", "OPENCYC-KBS-PREPARE-CACHES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "researchcyc_kill_expensive_true_rule_templates", "RESEARCHCYC-KILL-EXPENSIVE-TRUE-RULE-TEMPLATES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "researchcyc_kbs_remove_unwanted_tkb_narts", "RESEARCHCYC-KBS-REMOVE-UNWANTED-TKB-NARTS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "researchcyc_kbs_unwanted_tkb_termP", "RESEARCHCYC-KBS-UNWANTED-TKB-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "researchcyc_candidate_term", "RESEARCHCYC-CANDIDATE-TERM", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "tkb_kbs_unmark_certain_assertions", "TKB-KBS-UNMARK-CERTAIN-ASSERTIONS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "tkb_kbs_save_terms_without_isas", "TKB-KBS-SAVE-TERMS-WITHOUT-ISAS", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "tkb_special_excluded_assertionP_internal", "TKB-SPECIAL-EXCLUDED-ASSERTION?-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "tkb_special_excluded_assertionP", "TKB-SPECIAL-EXCLUDED-ASSERTION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "tkb_special_excluded_termP", "TKB-SPECIAL-EXCLUDED-TERM?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "all_quoted_instances_enhanced", "ALL-QUOTED-INSTANCES-ENHANCED", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "quoted_isa_enhancedP", "QUOTED-ISA-ENHANCED?", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "quoted_isa_enhanced_in_any_mtP", "QUOTED-ISA-ENHANCED-IN-ANY-MT?", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.kbs_utilities", "do_all_quoted_instances_enhanced", "DO-ALL-QUOTED-INSTANCES-ENHANCED");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "set_kbs_definition_from_kbs_profile", "SET-KBS-DEFINITION-FROM-KBS-PROFILE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "set_kbs_definition", "SET-KBS-DEFINITION", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "kbs_all_opencyc_formulas_to_file", "KBS-ALL-OPENCYC-FORMULAS-TO-FILE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.kbs_utilities", "kbs_all_opencyc_formulas_to_stream", "KBS-ALL-OPENCYC-FORMULAS-TO-STREAM", 1, 0, false);
        return (SubLObject)kbs_utilities.NIL;
    }
    
    public static SubLObject init_kbs_utilities_file() {
        kbs_utilities.$postpone_kb_hl_support_bootstrappingP$ = SubLFiles.defparameter("*POSTPONE-KB-HL-SUPPORT-BOOTSTRAPPING?*", (SubLObject)kbs_utilities.NIL);
        kbs_utilities.$kbs_definition$ = SubLFiles.defvar("*KBS-DEFINITION*", (SubLObject)kbs_utilities.NIL);
        kbs_utilities.$kbs_definition_properties$ = SubLFiles.deflexical("*KBS-DEFINITION-PROPERTIES*", (SubLObject)kbs_utilities.$list5);
        kbs_utilities.$kbs_definition_section_properties$ = SubLFiles.defvar("*KBS-DEFINITION-SECTION-PROPERTIES*", (SubLObject)kbs_utilities.$list6);
        kbs_utilities.$opencyc_kbs_term_queue$ = SubLFiles.deflexical("*OPENCYC-KBS-TERM-QUEUE*", (SubLObject)kbs_utilities.NIL);
        kbs_utilities.$opencyc_kbs_assertion_queue$ = SubLFiles.deflexical("*OPENCYC-KBS-ASSERTION-QUEUE*", (SubLObject)kbs_utilities.NIL);
        kbs_utilities.$opencyc_kbs_prettystring_term_queue$ = SubLFiles.deflexical("*OPENCYC-KBS-PRETTYSTRING-TERM-QUEUE*", (SubLObject)kbs_utilities.NIL);
        kbs_utilities.$opencyc_kbs_prettystring_assert_queue$ = SubLFiles.deflexical("*OPENCYC-KBS-PRETTYSTRING-ASSERT-QUEUE*", (SubLObject)kbs_utilities.NIL);
        kbs_utilities.$opencyc_kbs_supported_prettystring_preds$ = SubLFiles.deflexical("*OPENCYC-KBS-SUPPORTED-PRETTYSTRING-PREDS*", (SubLObject)kbs_utilities.$list59);
        kbs_utilities.$opencyc_kbs_supported_prettystring_mts$ = SubLFiles.deflexical("*OPENCYC-KBS-SUPPORTED-PRETTYSTRING-MTS*", (SubLObject)kbs_utilities.$list60);
        kbs_utilities.$opencyc_permitted_sources$ = SubLFiles.deflexical("*OPENCYC-PERMITTED-SOURCES*", (SubLObject)kbs_utilities.$list80);
        return (SubLObject)kbs_utilities.NIL;
    }
    
    public static SubLObject setup_kbs_utilities_file() {
        utilities_macros.note_funcall_helper_function((SubLObject)kbs_utilities.$sym68$KBS_PRETTY_STRING_FORT_);
        utilities_macros.note_funcall_helper_function((SubLObject)kbs_utilities.$sym69$PRETTY_STRING_ASSERT_SENTENCE_ACCUMULATOR_RESET);
        utilities_macros.note_funcall_helper_function((SubLObject)kbs_utilities.$sym70$PRETTY_STRING_ASSERT_SENTENCE_ACCUMULATOR_ADD);
        utilities_macros.note_funcall_helper_function((SubLObject)kbs_utilities.$sym71$PRETTY_STRING_ASSERT_SENTENCE_ACCUMULATOR_SIZE);
        utilities_macros.note_funcall_helper_function((SubLObject)kbs_utilities.$sym72$PRETTY_STRING_ASSERT_SENTENCE_ACCUMULATOR_CONTENTS);
        utilities_macros.note_funcall_helper_function((SubLObject)kbs_utilities.$sym73$PRETTY_STRING_ASSERT_SENTENCE_ACCUMULATOR_ITERATOR);
        memoization_state.note_memoized_function((SubLObject)kbs_utilities.$sym140$TKB_SPECIAL_EXCLUDED_ASSERTION_);
        return (SubLObject)kbs_utilities.NIL;
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
        me = (SubLFile)new kbs_utilities();
        kbs_utilities.$postpone_kb_hl_support_bootstrappingP$ = null;
        kbs_utilities.$kbs_definition$ = null;
        kbs_utilities.$kbs_definition_properties$ = null;
        kbs_utilities.$kbs_definition_section_properties$ = null;
        kbs_utilities.$opencyc_kbs_term_queue$ = null;
        kbs_utilities.$opencyc_kbs_assertion_queue$ = null;
        kbs_utilities.$opencyc_kbs_prettystring_term_queue$ = null;
        kbs_utilities.$opencyc_kbs_prettystring_assert_queue$ = null;
        kbs_utilities.$opencyc_kbs_supported_prettystring_preds$ = null;
        kbs_utilities.$opencyc_kbs_supported_prettystring_mts$ = null;
        kbs_utilities.$opencyc_permitted_sources$ = null;
        $sym0$NON_EMPTY_STRING_ = SubLObjectFactory.makeSymbol("NON-EMPTY-STRING?");
        $str1$Continue = SubLObjectFactory.makeString("Continue");
        $str2$The_KBS_definition_is_not_valid_ = SubLObjectFactory.makeString("The KBS definition is not valid.");
        $int3$10000 = SubLObjectFactory.makeInteger(10000);
        $list4 = ConsesLow.list((SubLObject)ConsesLow.cons((SubLObject)SubLObjectFactory.makeKeyword("EVAL"), (SubLObject)SubLObjectFactory.makeKeyword("CODE")));
        $list5 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("SECTIONS"), (SubLObject)SubLObjectFactory.makeKeyword("PREREMOVED-ASSERTIONS"), (SubLObject)SubLObjectFactory.makeKeyword("PRERUN-FNS"), (SubLObject)SubLObjectFactory.makeKeyword("POST-IDENTIFY-FORTS-FNS"), (SubLObject)SubLObjectFactory.makeKeyword("POST-IDENTIFY-ASSERTIONS-FNS"), (SubLObject)SubLObjectFactory.makeKeyword("INHERITED-STORES"));
        $list6 = ConsesLow.list(new SubLObject[] { SubLObjectFactory.makeKeyword("COLLECTIONS"), SubLObjectFactory.makeKeyword("SETS"), SubLObjectFactory.makeKeyword("OMISSION-COLLECTIONS"), SubLObjectFactory.makeKeyword("OMISSION-PREDICATE"), SubLObjectFactory.makeKeyword("DEFINITIONAL-PREDICATE-SET"), SubLObjectFactory.makeKeyword("DEFINITIONAL-RULE-PREDICATE"), SubLObjectFactory.makeKeyword("KBQ-QUERY-SETS"), SubLObjectFactory.makeKeyword("OMISSION-TERMS"), SubLObjectFactory.makeKeyword("OMISSION-ASSERTIONS"), SubLObjectFactory.makeKeyword("RETAINED-TERMS"), SubLObjectFactory.makeKeyword("RETAINED-ASSERTIONS"), SubLObjectFactory.makeKeyword("OMISSION-PREDICATE-EXTENT") });
        $str7$_kbs_definition__is_null = SubLObjectFactory.makeString("*kbs-definition* is null");
        $str8$_kbs_definition__has_section_usin = SubLObjectFactory.makeString("*kbs-definition* has section using invalid property ~A");
        $kw9$SECTIONS = SubLObjectFactory.makeKeyword("SECTIONS");
        $str10$_kbs_definition__is_not_a_plist_ = SubLObjectFactory.makeString("*kbs-definition* is not a plist.");
        $kw11$NAME = SubLObjectFactory.makeKeyword("NAME");
        $kw12$PRERUN_FNS = SubLObjectFactory.makeKeyword("PRERUN-FNS");
        $kw13$PREREMOVED_ASSERTIONS = SubLObjectFactory.makeKeyword("PREREMOVED-ASSERTIONS");
        $kw14$POST_IDENTIFY_FORTS_FNS = SubLObjectFactory.makeKeyword("POST-IDENTIFY-FORTS-FNS");
        $kw15$POST_IDENTIFY_ASSERTIONS_FNS = SubLObjectFactory.makeKeyword("POST-IDENTIFY-ASSERTIONS-FNS");
        $kw16$INHERITED_STORES = SubLObjectFactory.makeKeyword("INHERITED-STORES");
        $str17$A_section_is_using_invalid_proper = SubLObjectFactory.makeString("A section is using invalid property ~A");
        $str18$A_Section_is_not_a_plist___A = SubLObjectFactory.makeString("A Section is not a plist: ~A");
        $str19$No_sections_are_defined_ = SubLObjectFactory.makeString("No sections are defined.");
        $list20 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KBS-SECTION")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym21$CDOLIST = SubLObjectFactory.makeSymbol("CDOLIST");
        $list22 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("GET-KBS-SECTIONS")));
        $kw23$COLLECTIONS = SubLObjectFactory.makeKeyword("COLLECTIONS");
        $kw24$SETS = SubLObjectFactory.makeKeyword("SETS");
        $kw25$OMISSION_COLLECTIONS = SubLObjectFactory.makeKeyword("OMISSION-COLLECTIONS");
        $kw26$OMISSION_PREDICATE = SubLObjectFactory.makeKeyword("OMISSION-PREDICATE");
        $kw27$DEFINITIONAL_PREDICATE_SET = SubLObjectFactory.makeKeyword("DEFINITIONAL-PREDICATE-SET");
        $kw28$DEFINITIONAL_RULE_PREDICATE = SubLObjectFactory.makeKeyword("DEFINITIONAL-RULE-PREDICATE");
        $kw29$KBQ_QUERY_SETS = SubLObjectFactory.makeKeyword("KBQ-QUERY-SETS");
        $kw30$OMISSION_TERMS = SubLObjectFactory.makeKeyword("OMISSION-TERMS");
        $kw31$OMISSION_ASSERTIONS = SubLObjectFactory.makeKeyword("OMISSION-ASSERTIONS");
        $kw32$RETAINED_TERMS = SubLObjectFactory.makeKeyword("RETAINED-TERMS");
        $kw33$RETAINED_ASSERTIONS = SubLObjectFactory.makeKeyword("RETAINED-ASSERTIONS");
        $kw34$OMISSION_PREDICATE_EXTENT = SubLObjectFactory.makeKeyword("OMISSION-PREDICATE-EXTENT");
        $kw35$RULE_STATISTICS = SubLObjectFactory.makeKeyword("RULE-STATISTICS");
        $kw36$CACHING_POLICIES = SubLObjectFactory.makeKeyword("CACHING-POLICIES");
        $kw37$EXTERNALIZE = SubLObjectFactory.makeKeyword("EXTERNALIZE");
        $str38$Unknown_inherited_store__A__dont_ = SubLObjectFactory.makeString("Unknown inherited store ~A: dont know how to save.");
        $str39$Unknown_inherited_store__A_____sk = SubLObjectFactory.makeString("Unknown inherited store ~A ... skipping.");
        $sym40$KBS_RECONSTITUTE_BROADER_TERM_GAF_SPECIFICS = SubLObjectFactory.makeSymbol("KBS-RECONSTITUTE-BROADER-TERM-GAF-SPECIFICS");
        $sym41$KBS_EXTRACT_BROADER_TERM_GAF_SPECIFICS = SubLObjectFactory.makeSymbol("KBS-EXTRACT-BROADER-TERM-GAF-SPECIFICS");
        $kw42$UNKNOWN = SubLObjectFactory.makeKeyword("UNKNOWN");
        $str43$Whoa__someone_already_populated_t = SubLObjectFactory.makeString("Whoa, someone already populated the queue. There are ~A entries!");
        $kw44$PREPARED = SubLObjectFactory.makeKeyword("PREPARED");
        $list45 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("STRENGTH"));
        $list46 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRED"), (SubLObject)SubLObjectFactory.makeSymbol("ARG1"), (SubLObject)SubLObjectFactory.makeSymbol("ARG2"));
        $const47$broaderTerm = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("broaderTerm"));
        $str48$This_transform_filters_is_not_app = SubLObjectFactory.makeString("This transform filters is not applicable to GAF ~A.");
        $str49$GAF__A_has_a_non_standard_EL_stre = SubLObjectFactory.makeString("GAF ~A has a non-standard EL strength ~A.");
        $list50 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ARG1"), (SubLObject)SubLObjectFactory.makeSymbol("ARG2"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("CODE"));
        $sym51$RELEVANT_MT_IS_EVERYTHING = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-EVERYTHING");
        $const52$EverythingPSC = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EverythingPSC"));
        $str53$Unmarking_forts_with_only_include = SubLObjectFactory.makeString("Unmarking forts with only included #$termOfUnit assertions");
        $kw54$SKIP = SubLObjectFactory.makeKeyword("SKIP");
        $str55$unmarking__A__ = SubLObjectFactory.makeString("unmarking ~A~%");
        $str56$Unmarked__A_forts_and__A_assertio = SubLObjectFactory.makeString("Unmarked ~A forts and ~A assertions~%");
        $sym57$OPENCYC_KBS_RECONSTITUTE_PRETTY_STRING_IST = SubLObjectFactory.makeSymbol("OPENCYC-KBS-RECONSTITUTE-PRETTY-STRING-IST");
        $sym58$OPENCYC_KBS_SIMPLIFY_PRETTY_STRING_IST = SubLObjectFactory.makeSymbol("OPENCYC-KBS-SIMPLIFY-PRETTY-STRING-IST");
        $list59 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("prettyString")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("prettyString-Canonical")));
        $list60 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("EnglishMt")));
        $list61 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("IST-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PRETTY-PRED"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("STRING")));
        $const62$ist = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist"));
        $str63$Do_not_know_how_to_simplify_sente = SubLObjectFactory.makeString("Do not know how to simplify sentence ~S.");
        $list64 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT-CODE"), (SubLObject)SubLObjectFactory.makeSymbol("PRED-CODE"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"));
        $str65$Asserting_pretty_string_assertion = SubLObjectFactory.makeString("Asserting pretty string assertions for all ");
        $str66$_KBS_FORTs = SubLObjectFactory.makeString(" KBS FORTs");
        $str67$Cannot_be_used_without_identifyin = SubLObjectFactory.makeString("Cannot be used without identifying KBS forts first.");
        $sym68$KBS_PRETTY_STRING_FORT_ = SubLObjectFactory.makeSymbol("KBS-PRETTY-STRING-FORT?");
        $sym69$PRETTY_STRING_ASSERT_SENTENCE_ACCUMULATOR_RESET = SubLObjectFactory.makeSymbol("PRETTY-STRING-ASSERT-SENTENCE-ACCUMULATOR-RESET");
        $sym70$PRETTY_STRING_ASSERT_SENTENCE_ACCUMULATOR_ADD = SubLObjectFactory.makeSymbol("PRETTY-STRING-ASSERT-SENTENCE-ACCUMULATOR-ADD");
        $sym71$PRETTY_STRING_ASSERT_SENTENCE_ACCUMULATOR_SIZE = SubLObjectFactory.makeSymbol("PRETTY-STRING-ASSERT-SENTENCE-ACCUMULATOR-SIZE");
        $sym72$PRETTY_STRING_ASSERT_SENTENCE_ACCUMULATOR_CONTENTS = SubLObjectFactory.makeSymbol("PRETTY-STRING-ASSERT-SENTENCE-ACCUMULATOR-CONTENTS");
        $sym73$PRETTY_STRING_ASSERT_SENTENCE_ACCUMULATOR_ITERATOR = SubLObjectFactory.makeSymbol("PRETTY-STRING-ASSERT-SENTENCE-ACCUMULATOR-ITERATOR");
        $str74$Reset_operation_not_supported_for = SubLObjectFactory.makeString("Reset operation not supported for pretty string assert sentence accumulators.");
        $sym75$IST_SENTENCE_P = SubLObjectFactory.makeSymbol("IST-SENTENCE-P");
        $const76$BaseKB = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("BaseKB"));
        $list77 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("FORWARD-RULES"), (SubLObject)kbs_utilities.NIL);
        $str78$Get_contents_operation_not_suppor = SubLObjectFactory.makeString("Get-contents operation not supported for pretty string assert sentence accumulators.");
        $str79$Get_iterator_operation_not_suppor = SubLObjectFactory.makeString("Get-iterator operation not supported for pretty string assert sentence accumulators.");
        $list80 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("WordNet-Version2_0")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("FOAFOntology")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycExtendedSystemFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LSCOMObjectAndSituationOntology"))));
        $str81$OpenCycPermittedSource = SubLObjectFactory.makeString("OpenCycPermittedSource");
        $const82$synonymousExternalConcept = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("synonymousExternalConcept"));
        $str83$Removing_non_opencyc_related___sy = SubLObjectFactory.makeString("Removing non-opencyc related #$synonymousExternalConcept assertions (pass ");
        $str84$_ = SubLObjectFactory.makeString(")");
        $str85$cdolist = SubLObjectFactory.makeString("cdolist");
        $const86$broaderTerm_NonTaxonomic = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("broaderTerm-NonTaxonomic"));
        $str87$Killing_ = SubLObjectFactory.makeString("Killing ");
        $kw88$SILENT = SubLObjectFactory.makeKeyword("SILENT");
        $str89$___A__ = SubLObjectFactory.makeString("~&~A~%");
        $str90$___s_constant_A__A__ = SubLObjectFactory.makeString("  ~s constant~A ~A~%");
        $str91$s_were = SubLObjectFactory.makeString("s were");
        $str92$_was = SubLObjectFactory.makeString(" was");
        $str93$created = SubLObjectFactory.makeString("created");
        $str94$destroyed = SubLObjectFactory.makeString("destroyed");
        $str95$___s_nart_A__A__ = SubLObjectFactory.makeString("  ~s nart~A ~A~%");
        $str96$___s_assertion_A__A__ = SubLObjectFactory.makeString("  ~s assertion~A ~A~%");
        $str97$___s_kb_hl_support_A__A__ = SubLObjectFactory.makeString("  ~s kb-hl-support~A ~A~%");
        $str98$___s_deduction_A__A__ = SubLObjectFactory.makeString("  ~s deduction~A ~A~%");
        $list99 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PredicateRuleTemplateFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("coGenlPreds")));
        $str100$Unmarking_instances_of___Terroris = SubLObjectFactory.makeString("Unmarking instances of #$TerroristAgent, #$TerroristAct, and #$HostileSocialAction~%");
        $const101$TerroristAgent = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TerroristAgent"));
        $const102$isa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("isa"));
        $kw103$BREADTH = SubLObjectFactory.makeKeyword("BREADTH");
        $kw104$QUEUE = SubLObjectFactory.makeKeyword("QUEUE");
        $kw105$STACK = SubLObjectFactory.makeKeyword("STACK");
        $sym106$RELEVANT_SBHL_TV_IS_GENERAL_TV = SubLObjectFactory.makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
        $kw107$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str108$_A_is_not_a__A = SubLObjectFactory.makeString("~A is not a ~A");
        $sym109$SBHL_TRUE_TV_P = SubLObjectFactory.makeSymbol("SBHL-TRUE-TV-P");
        $kw110$CERROR = SubLObjectFactory.makeKeyword("CERROR");
        $str111$continue_anyway = SubLObjectFactory.makeString("continue anyway");
        $kw112$WARN = SubLObjectFactory.makeKeyword("WARN");
        $str113$_A_is_not_a_valid__sbhl_type_erro = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $str114$_A_is_neither_SET_P_nor_LISTP_ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $str115$attempting_to_bind_direction_link = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $list116 = ConsesLow.list((SubLObject)SubLObjectFactory.makeUninternedSymbol("LINK-NODE"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("MT"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("TV"));
        $str117$Node__a_does_not_pass_sbhl_type_t = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $const118$TerroristAct = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TerroristAct"));
        $const119$HostileSocialAction = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HostileSocialAction"));
        $const120$ResearchCycConstant = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ResearchCycConstant"));
        $const121$ProprietaryTerm = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ProprietaryTerm"));
        $const122$TKBConstant = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TKBConstant"));
        $const123$TermSuggestorExpertOnlyTerm = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TermSuggestorExpertOnlyTerm"));
        $const124$TextualEntailmentConstant = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TextualEntailmentConstant"));
        $const125$CurrentCycorpEmployee = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CurrentCycorpEmployee"));
        $str126$AKB = SubLObjectFactory.makeString("AKB");
        $str127$BUTLER = SubLObjectFactory.makeString("BUTLER");
        $str128$CKB = SubLObjectFactory.makeString("CKB");
        $str129$CycInternalAssignment = SubLObjectFactory.makeString("CycInternalAssignment");
        $str130$TKB = SubLObjectFactory.makeString("TKB");
        $str131$Translation_ = SubLObjectFactory.makeString("Translation-");
        $str132$Unmarking_non_TKB_assertions = SubLObjectFactory.makeString("Unmarking non-TKB assertions");
        $str133$mapping_Cyc_constants = SubLObjectFactory.makeString("mapping Cyc constants");
        $sym134$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $kw135$GAF = SubLObjectFactory.makeKeyword("GAF");
        $const136$Individual = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Individual"));
        $str137$Saving__A_by_asserting__A__ = SubLObjectFactory.makeString("Saving ~A by asserting ~A~%");
        $const138$UniversalVocabularyMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("UniversalVocabularyMt"));
        $str139$assertion__A_not_found = SubLObjectFactory.makeString("assertion ~A not found");
        $sym140$TKB_SPECIAL_EXCLUDED_ASSERTION_ = SubLObjectFactory.makeSymbol("TKB-SPECIAL-EXCLUDED-ASSERTION?");
        $sym141$ASSERTION_P = SubLObjectFactory.makeSymbol("ASSERTION-P");
        $const142$TKBFullySpecifiedSourceMicrotheor = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TKBFullySpecifiedSourceMicrotheory"));
        $const143$LexicalMicrotheory = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LexicalMicrotheory"));
        $const144$TestVocabularyMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TestVocabularyMt"));
        $const145$quotedIsa = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("quotedIsa"));
        $const146$termOfUnit = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("termOfUnit"));
        $const147$Thing = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing"));
        $const148$ImagePathnamePredicate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ImagePathnamePredicate"));
        $const149$Person = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person"));
        $const150$LegalCorporation = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("LegalCorporation"));
        $const151$CommercialOrganization = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CommercialOrganization"));
        $const152$IndeterminateTerm = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IndeterminateTerm"));
        $const153$IndexicalConcept = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IndexicalConcept"));
        $const154$AgentNowTerminated = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AgentNowTerminated"));
        $const155$ComputerUserWithUserModel = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ComputerUserWithUserModel"));
        $const156$HumanCyclist = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("HumanCyclist"));
        $const157$genls = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls"));
        $const158$genls_GenlDenotesSpecInstances = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genls-GenlDenotesSpecInstances"));
        $kw159$TRUE = SubLObjectFactory.makeKeyword("TRUE");
        $list160 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("MT-VAR"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("TV-VAR"));
        $list161 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INSTANCE-VAR"), (SubLObject)SubLObjectFactory.makeSymbol("TERM"), (SubLObject)SubLObjectFactory.makeSymbol("&KEY"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("DONE")), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $list162 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("MT"), (SubLObject)SubLObjectFactory.makeKeyword("DONE"));
        $kw163$ALLOW_OTHER_KEYS = SubLObjectFactory.makeKeyword("ALLOW-OTHER-KEYS");
        $kw164$MT = SubLObjectFactory.makeKeyword("MT");
        $kw165$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym166$DO_LIST = SubLObjectFactory.makeSymbol("DO-LIST");
        $sym167$ALL_QUOTED_INSTANCES_ENHANCED = SubLObjectFactory.makeSymbol("ALL-QUOTED-INSTANCES-ENHANCED");
        $const168$KBSubsetProfile = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("KBSubsetProfile"));
        $str169$_S_is_not_a_valid___KBSubsetProfi = SubLObjectFactory.makeString("~S is not a valid #$KBSubsetProfile");
        $const170$kbsProfileRemoveAssertion = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("kbsProfileRemoveAssertion"));
        $const171$kbsProfileRemoveCollectionExtent = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("kbsProfileRemoveCollectionExtent"));
        $const172$kbsProfileRemoveFORT = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("kbsProfileRemoveFORT"));
        $const173$kbsProfileRemovePredicateExtent = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("kbsProfileRemovePredicateExtent"));
        $const174$kbsProfileRetainAssertion = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("kbsProfileRetainAssertion"));
        $const175$kbsProfileRetainTerm = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("kbsProfileRetainTerm"));
        $list176 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("RULE-STATISTICS"), (SubLObject)SubLObjectFactory.makeKeyword("CACHING-POLICIES"));
        $list177 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLConstant")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Thing")));
        $str178$KB_subsets_are_not_supported_on_t = SubLObjectFactory.makeString("KB subsets are not supported on this port.");
        $kw179$OUTPUT = SubLObjectFactory.makeKeyword("OUTPUT");
        $str180$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $str181$Gathering_up_all_assertion_EL_for = SubLObjectFactory.makeString("Gathering up all assertion EL formulas ....");
    }
}

/*

	Total time: 8317 ms
	
*/