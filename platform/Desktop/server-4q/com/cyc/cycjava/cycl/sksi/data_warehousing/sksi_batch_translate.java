package com.cyc.cycjava.cycl.sksi.data_warehousing;

import com.cyc.cycjava.cycl.constant_handles;
import com.cyc.cycjava.cycl.utilities_macros;
import com.cyc.cycjava.cycl.access_macros;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.cyc_kernel;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Packages;
import com.cyc.cycjava.cycl.format_nil;
import com.cyc.cycjava.cycl.kb_control_vars;
import com.cyc.cycjava.cycl.assertion_utilities;
import com.cyc.cycjava.cycl.inference.harness.inference_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.cycjava.cycl.hash_table_utilities;
import com.cyc.cycjava.cycl.czer_meta;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_meaning_sentence_utilities;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_reformulate;
import com.cyc.cycjava.cycl.assertions_high;
import com.cyc.cycjava.cycl.kb_mapping_utilities;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_field_translation_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_csql_generation;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_interaction;
import com.cyc.cycjava.cycl.formula_pattern_match;
import com.cyc.cycjava.cycl.pattern_match;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.wff;
import com.cyc.cycjava.cycl.at_admitted;
import com.cyc.cycjava.cycl.at_vars;
import com.cyc.cycjava.cycl.forts;
import com.cyc.cycjava.cycl.kb_utilities;
import com.cyc.cycjava.cycl.simplifier;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_debugging;
import com.cyc.cycjava.cycl.misc_utilities;
import com.cyc.cycjava.cycl.el_utilities;
import com.cyc.cycjava.cycl.fi;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.cycjava.cycl.format_cycl_expression;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.cycjava.cycl.numeric_date_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.iteration;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.obsolete;
import com.cyc.cycjava.cycl.set_contents;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.dictionary_contents;
import com.cyc.cycjava.cycl.dictionary;
import com.cyc.cycjava.cycl.sbhl.sbhl_links;
import com.cyc.cycjava.cycl.sbhl.sbhl_graphs;
import com.cyc.cycjava.cycl.function_terms;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import com.cyc.cycjava.cycl.sbhl.sbhl_macros;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_link_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_utilities;
import com.cyc.cycjava.cycl.sbhl.sbhl_module_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_paranoia;
import com.cyc.cycjava.cycl.sbhl.sbhl_search_vars;
import com.cyc.cycjava.cycl.sbhl.sbhl_marking_vars;
import com.cyc.cycjava.cycl.deck;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.StreamsLow;
import com.cyc.cycjava.cycl.ke;
import com.cyc.cycjava.cycl.cycl_utilities;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_kb_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Hashtables;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.cycjava.cycl.api_control_vars;
import com.cyc.cycjava.cycl.sksi.sksi_infrastructure.sksi_sks_accessors;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLInteger;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class sksi_batch_translate extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate";
    public static final String myFingerPrint = "561a5c1d0811c0954b649502da00991fed369abdeb8eb71aadf70f6bfcf0eb96";
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 8612L)
    public static SubLSymbol $sksi_batch_translate_only_asserted_meaning_sentencesP$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 9022L)
    public static SubLSymbol $sksi_batch_translate_coerce_typesP$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 9231L)
    public static SubLSymbol $sksi_batch_translate_type_coercion_successfulP$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 9488L)
    private static SubLSymbol $sksi_batch_assert_justification_table$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 9734L)
    private static SubLSymbol $sksi_batch_primary_key_columns$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 9916L)
    public static SubLSymbol $sksi_batch_sql_select_statement$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 10159L)
    public static SubLSymbol $sksi_batch_sql_order_by_primary_keyP$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 10355L)
    public static SubLSymbol $sksi_batch_add_operations_to_transcriptP$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 10533L)
    private static SubLSymbol $current_sksi_batch_template$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 10663L)
    public static SubLSymbol $sksi_batch_templates$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 10762L)
    public static SubLSymbol $sksi_batch_translate_add_argument_callback$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 10906L)
    public static SubLSymbol $sksi_batch_translate_unassert_callback$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 12213L)
    private static SubLSymbol $sksi_batch_asserting_translations_of_this_table$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 44363L)
    public static SubLSymbol $sksi_row_iterator_overrides$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 60285L)
    private static SubLSymbol $sksi_schema_translation_lifting_rule_sentence$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 60518L)
    private static SubLSymbol $sksi_schema_translation_lifting_rule_mt$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 60590L)
    private static SubLSymbol $sksi_schema_translation_lifting_rule_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 60984L)
    private static SubLSymbol $sksi_get_datum_var_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 61314L)
    private static SubLSymbol $sksi_get_raw_var_caching_state$;
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 61432L)
    private static SubLSymbol $sksi_get_arg_var_caching_state$;
    private static final SubLSymbol $kw0$UNINITIALIZED;
    private static final SubLSymbol $sym1$BOOLEANP;
    private static final SubLSymbol $sym2$CLET;
    private static final SubLList $list3;
    private static final SubLList $list4;
    private static final SubLList $list5;
    private static final SubLList $list6;
    private static final SubLList $list7;
    private static final SubLSymbol $sym8$_SKSI_BATCH_SQL_SELECT_STATEMENT_;
    private static final SubLInteger $int9$1000;
    private static final SubLString $str10$in_mt___S___;
    private static final SubLString $str11$f___S___;
    private static final SubLSymbol $kw12$OUTPUT;
    private static final SubLString $str13$Unable_to_open__S;
    private static final SubLSymbol $kw14$BREADTH;
    private static final SubLSymbol $kw15$QUEUE;
    private static final SubLSymbol $kw16$STACK;
    private static final SubLSymbol $sym17$RELEVANT_SBHL_TV_IS_GENERAL_TV;
    private static final SubLSymbol $kw18$ERROR;
    private static final SubLString $str19$_A_is_not_a__A;
    private static final SubLSymbol $sym20$SBHL_TRUE_TV_P;
    private static final SubLSymbol $kw21$CERROR;
    private static final SubLString $str22$continue_anyway;
    private static final SubLSymbol $kw23$WARN;
    private static final SubLString $str24$_A_is_not_a_valid__sbhl_type_erro;
    private static final SubLObject $const25$genlMt;
    private static final SubLString $str26$_A_is_neither_SET_P_nor_LISTP_;
    private static final SubLString $str27$attempting_to_bind_direction_link;
    private static final SubLString $str28$Node__a_does_not_pass_sbhl_type_t;
    private static final SubLString $str29$____Translation_Time____A__;
    private static final SubLString $str30$_____;
    private static final SubLString $str31$___Meta_Mt_____________S__;
    private static final SubLString $str32$___Source______________S__;
    private static final SubLString $str33$___Physical_Schema_____S__;
    private static final SubLString $str34$___Logical_Schema______S__;
    private static final SubLString $str35$___Content_Mt__________S;
    private static final SubLString $str36$________S_;
    private static final SubLSymbol $sym37$SKSI_TRANSLATE_ITERATE_DONE;
    private static final SubLSymbol $sym38$SKSI_TRANSLATE_ITERATE_NEXT;
    private static final SubLSymbol $sym39$BOOLEAN;
    private static final SubLList $list40;
    private static final SubLSymbol $kw41$DONE;
    private static final SubLList $list42;
    private static final SubLObject $const43$ist;
    private static final SubLString $str44$__SKSI__A_;
    private static final SubLString $str45$__a__Translating__s_wrt__a__a__a_;
    private static final SubLString $str46$Raw_sentence___s;
    private static final SubLString $str47$Decoded_sentence___s;
    private static final SubLString $str48$Logical_sentence___s;
    private static final SubLString $str49$Logical_conjunct___s;
    private static final SubLString $str50$Skipped_due_to_wholly_untranslata;
    private static final SubLObject $const51$True;
    private static final SubLString $str52$Skipped_due_to_tautology_;
    private static final SubLString $str53$Skipped_due_to_unreformulatable_;
    private static final SubLString $str54$Translation___s;
    private static final SubLString $str55$skipped_for_an_unknown_reason___a;
    private static final SubLString $str56$The_raw_tuple__S_using_the_physic;
    private static final SubLSymbol $sym57$EXPLANATION_OF_WHY_NOT_WFF_ASSERT;
    private static final SubLSymbol $sym58$EXPLANATION_OF_WHY_NOT_ADMITTED_SENTENCE_WRT_ASENT_ARG_CONSTRAINT;
    private static final SubLString $str59$skipped_due_to_ill_formedness__ty;
    private static final SubLString $str60$skipped_due_to_ill_formedness__ty;
    private static final SubLString $str61$skipped_due_to_ill_formedness__ty;
    private static final SubLString $str62$skipped_due_to_ill_formedness___a;
    private static final SubLString $str63$skipped_due_to_an_invalid_predica;
    private static final SubLSymbol $kw64$IGNORE;
    private static final SubLSymbol $kw65$UNTRANSLATABLE;
    private static final SubLSymbol $kw66$UNREFORMULATABLE;
    private static final SubLSymbol $kw67$NULL;
    private static final SubLList $list68;
    private static final SubLSymbol $kw69$BATCH;
    private static final SubLSymbol $sym70$SKSI_RAW_TUPLE_TRANSLATION_PATTERN;
    private static final SubLObject $const71$fieldValue;
    private static final SubLSymbol $kw72$VALUE;
    private static final SubLSymbol $kw73$TUPLE;
    private static final SubLSymbol $sym74$SKSI_RAW_SENTENCE_TRANSLATION_PATTERN;
    private static final SubLObject $const75$IMDB_MovieActors_PS;
    private static final SubLObject $const76$IMDB_MovieActors_LS;
    private static final SubLList $list77;
    private static final SubLList $list78;
    private static final SubLSymbol $kw79$ANYTHING;
    private static final SubLSymbol $kw80$BIND;
    private static final SubLSymbol $kw81$CALL;
    private static final SubLSymbol $sym82$POSSIBLY_OVERRIDE_PHYSICAL_FIELD_VALUE;
    private static final SubLSymbol $sym83$PHYSICAL_FIELD_FOR_INDEXICAL;
    private static final SubLObject $const84$indexicalReferent;
    private static final SubLSymbol $sym85$SKSI_BATCH_REFORMULATE;
    private static final SubLSymbol $kw86$TEMPLATE;
    private static final SubLSymbol $sym87$SKSI_SIMPLIFY_DECODED_SENTENCE;
    private static final SubLObject $const88$fieldWithPhysicalValueMapsToPhysi;
    private static final SubLSymbol $kw89$UNDECODED;
    private static final SubLSymbol $kw90$DECODE;
    private static final SubLString $str91$Failed_to_compute_a_justification;
    private static final SubLObject $const92$tablePrimaryKeyValues;
    private static final SubLSymbol $kw93$OPAQUE;
    private static final SubLObject $const94$schemaTranslation;
    private static final SubLList $list95;
    private static final SubLSymbol $sym96$PROGN;
    private static final SubLList $list97;
    private static final SubLList $list98;
    private static final SubLSymbol $sym99$PIF;
    private static final SubLSymbol $sym100$WITH_SKSI_BATCH_TEMPLATES;
    private static final SubLSymbol $sym101$INITIALIZE_SKSI_BATCH_TEMPLATES;
    private static final SubLString $str102$Cannot_handle_nested_SKSI_batch_i;
    private static final SubLSymbol $sym103$CLEAR_SKSI_BATCH_TEMPLATES;
    private static final SubLSymbol $sym104$ALLOWED_RULES_SPEC_P;
    private static final SubLSymbol $sym105$LOGICAL_FIELD_INDEXICAL_P;
    private static final SubLSymbol $sym106$NART_P;
    private static final SubLSymbol $sym107$SKSI_BATCH_TEMPLATE_P;
    private static final SubLSymbol $sym108$CONVERT_SQL_DATUM_TO_STRING;
    private static final SubLSymbol $sym109$DOUBLE_FLOAT;
    private static final SubLList $list110;
    private static final SubLObject $const111$SKSIMt;
    private static final SubLSymbol $sym112$SKSI_SCHEMA_TRANSLATION_LIFTING_RULE;
    private static final SubLString $str113$Could_not_find_the_SKSI_schemaTra;
    private static final SubLSymbol $sym114$_SKSI_SCHEMA_TRANSLATION_LIFTING_RULE_CACHING_STATE_;
    private static final SubLSymbol $sym115$SKSI_GET_DATUM_VAR;
    private static final SubLString $str116$DATUM_;
    private static final SubLSymbol $sym117$_SKSI_GET_DATUM_VAR_CACHING_STATE_;
    private static final SubLSymbol $sym118$SKSI_GET_RAW_VAR;
    private static final SubLString $str119$RAW_;
    private static final SubLSymbol $sym120$_SKSI_GET_RAW_VAR_CACHING_STATE_;
    private static final SubLSymbol $sym121$SKSI_GET_ARG_VAR;
    private static final SubLString $str122$ARG_;
    private static final SubLSymbol $sym123$_SKSI_GET_ARG_VAR_CACHING_STATE_;
    private static final SubLString $str124$Assertion_of__s_in__s_failed___a;
    private static final SubLSymbol $kw125$CHECK_WFF_;
    private static final SubLString $str126$Deduction_of__s_in__s_with_suppor;
    private static final SubLString $str127$Unassert_of__s_from__s_failed___a;
    private static final SubLSymbol $sym128$_EXIT;
    private static final SubLSymbol $sym129$TEST_SKSI_WFF_CHECK_BATCH_TRANSLATED_SENTENCE;
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 11042L)
    public static SubLObject set_sksi_batch_translate_only_asserted_meaning_sentences(final SubLObject v_boolean) {
        assert sksi_batch_translate.NIL != Types.booleanp(v_boolean) : v_boolean;
        sksi_batch_translate.$sksi_batch_translate_only_asserted_meaning_sentencesP$.setDynamicValue(v_boolean);
        return v_boolean;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 11248L)
    public static SubLObject set_sksi_batch_translate_coerce_types(final SubLObject v_boolean) {
        assert sksi_batch_translate.NIL != Types.booleanp(v_boolean) : v_boolean;
        sksi_batch_translate.$sksi_batch_translate_coerce_typesP$.setDynamicValue(v_boolean);
        return v_boolean;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 11416L)
    public static SubLObject with_sksi_batch_translate_only_asserted_meaning_sentences(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sksi_batch_translate.$sym2$CLET, (SubLObject)sksi_batch_translate.$list3, ConsesLow.append(body, (SubLObject)sksi_batch_translate.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 11594L)
    public static SubLObject without_sksi_batch_translate_only_asserted_meaning_sentences(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sksi_batch_translate.$sym2$CLET, (SubLObject)sksi_batch_translate.$list4, ConsesLow.append(body, (SubLObject)sksi_batch_translate.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 11777L)
    public static SubLObject with_sksi_batch_translate_coerce_types(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sksi_batch_translate.$sym2$CLET, (SubLObject)sksi_batch_translate.$list5, ConsesLow.append(body, (SubLObject)sksi_batch_translate.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 11917L)
    public static SubLObject without_sksi_batch_translate_coerce_types(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sksi_batch_translate.$sym2$CLET, (SubLObject)sksi_batch_translate.$list6, ConsesLow.append(body, (SubLObject)sksi_batch_translate.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 12062L)
    public static SubLObject with_sksi_batch_sql_select_statement(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject string = (SubLObject)sksi_batch_translate.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_batch_translate.$list7);
        string = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.listS((SubLObject)sksi_batch_translate.$sym2$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)sksi_batch_translate.$sym8$_SKSI_BATCH_SQL_SELECT_STATEMENT_, string)), ConsesLow.append(body, (SubLObject)sksi_batch_translate.NIL));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 12427L)
    public static SubLObject sksi_batch_assert_translations_of_table(final SubLObject table, SubLObject check_wffnessP, SubLObject start_row, SubLObject end_row) {
        if (check_wffnessP == sksi_batch_translate.UNPROVIDED) {
            check_wffnessP = (SubLObject)sksi_batch_translate.NIL;
        }
        if (start_row == sksi_batch_translate.UNPROVIDED) {
            start_row = (SubLObject)sksi_batch_translate.ZERO_INTEGER;
        }
        if (end_row == sksi_batch_translate.UNPROVIDED) {
            end_row = (SubLObject)sksi_batch_translate.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject count = (SubLObject)sksi_batch_translate.ZERO_INTEGER;
        final SubLObject content_mt = sksi_sks_accessors.sks_get_content_mt(table);
        final SubLObject meta_mt = sksi_sks_accessors.sks_get_defining_mt(table, (SubLObject)sksi_batch_translate.UNPROVIDED);
        final SubLObject _prev_bind_0 = sksi_batch_translate.$sksi_batch_assert_justification_table$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sksi_batch_translate.$sksi_batch_primary_key_columns$.currentBinding(thread);
        final SubLObject _prev_bind_3 = sksi_batch_translate.$sksi_batch_asserting_translations_of_this_table$.currentBinding(thread);
        final SubLObject _prev_bind_4 = api_control_vars.$generate_readable_fi_results$.currentBinding(thread);
        try {
            sksi_batch_translate.$sksi_batch_assert_justification_table$.bind(Hashtables.make_hash_table((SubLObject)sksi_batch_translate.$int9$1000, Symbols.symbol_function((SubLObject)sksi_batch_translate.EQUAL), (SubLObject)sksi_batch_translate.UNPROVIDED), thread);
            sksi_batch_translate.$sksi_batch_primary_key_columns$.bind(sksi_kb_accessors.table_primary_key_column_indices(table, meta_mt), thread);
            sksi_batch_translate.$sksi_batch_asserting_translations_of_this_table$.bind(table, thread);
            api_control_vars.$generate_readable_fi_results$.bind((SubLObject)sksi_batch_translate.NIL, thread);
            count = Sequences.length(sksi_translate_all_sk_sources_in_mt(content_mt, meta_mt, check_wffnessP, start_row, end_row, (SubLObject)sksi_batch_translate.T));
        }
        finally {
            api_control_vars.$generate_readable_fi_results$.rebind(_prev_bind_4, thread);
            sksi_batch_translate.$sksi_batch_asserting_translations_of_this_table$.rebind(_prev_bind_3, thread);
            sksi_batch_translate.$sksi_batch_primary_key_columns$.rebind(_prev_bind_2, thread);
            sksi_batch_translate.$sksi_batch_assert_justification_table$.rebind(_prev_bind_0, thread);
        }
        return count;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 13155L)
    public static SubLObject sksi_batch_assert_all_sk_sources_in_mt(final SubLObject content_mt, final SubLObject meta_mt, SubLObject check_wffnessP, SubLObject start_row, SubLObject end_row, SubLObject nowP) {
        if (check_wffnessP == sksi_batch_translate.UNPROVIDED) {
            check_wffnessP = (SubLObject)sksi_batch_translate.NIL;
        }
        if (start_row == sksi_batch_translate.UNPROVIDED) {
            start_row = (SubLObject)sksi_batch_translate.ZERO_INTEGER;
        }
        if (end_row == sksi_batch_translate.UNPROVIDED) {
            end_row = (SubLObject)sksi_batch_translate.NIL;
        }
        if (nowP == sksi_batch_translate.UNPROVIDED) {
            nowP = (SubLObject)sksi_batch_translate.NIL;
        }
        SubLObject cdolist_list_var;
        final SubLObject sentences = cdolist_list_var = sksi_translate_all_sk_sources_in_mt(content_mt, meta_mt, check_wffnessP, start_row, end_row, (SubLObject)sksi_batch_translate.UNPROVIDED);
        SubLObject current_sentence = (SubLObject)sksi_batch_translate.NIL;
        current_sentence = cdolist_list_var.first();
        while (sksi_batch_translate.NIL != cdolist_list_var) {
            final SubLObject target_mt = cycl_utilities.sentence_arg1(current_sentence, (SubLObject)sksi_batch_translate.UNPROVIDED);
            final SubLObject sentence_to_be_asserted = cycl_utilities.sentence_arg2(current_sentence, (SubLObject)sksi_batch_translate.UNPROVIDED);
            if (sksi_batch_translate.NIL != check_wffnessP) {
                if (sksi_batch_translate.NIL != nowP) {
                    ke.ke_assert_now(sentence_to_be_asserted, target_mt, (SubLObject)sksi_batch_translate.UNPROVIDED, (SubLObject)sksi_batch_translate.UNPROVIDED);
                }
                else {
                    ke.ke_assert(sentence_to_be_asserted, target_mt, (SubLObject)sksi_batch_translate.UNPROVIDED, (SubLObject)sksi_batch_translate.UNPROVIDED);
                }
            }
            else if (sksi_batch_translate.NIL != nowP) {
                ke.ke_assert_wff_now(sentence_to_be_asserted, target_mt, (SubLObject)sksi_batch_translate.UNPROVIDED, (SubLObject)sksi_batch_translate.UNPROVIDED);
            }
            else {
                ke.ke_assert(sentence_to_be_asserted, target_mt, (SubLObject)sksi_batch_translate.UNPROVIDED, (SubLObject)sksi_batch_translate.UNPROVIDED);
            }
            cdolist_list_var = cdolist_list_var.rest();
            current_sentence = cdolist_list_var.first();
        }
        return (SubLObject)sksi_batch_translate.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 14381L)
    public static SubLObject sksi_batch_assert_all_sk_sources_in_mt_to_ke_stream(final SubLObject content_mt, final SubLObject meta_mt, final SubLObject target_mt, SubLObject stream, SubLObject check_wffnessP, SubLObject start_row, SubLObject end_row) {
        if (stream == sksi_batch_translate.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (check_wffnessP == sksi_batch_translate.UNPROVIDED) {
            check_wffnessP = (SubLObject)sksi_batch_translate.NIL;
        }
        if (start_row == sksi_batch_translate.UNPROVIDED) {
            start_row = (SubLObject)sksi_batch_translate.ZERO_INTEGER;
        }
        if (end_row == sksi_batch_translate.UNPROVIDED) {
            end_row = (SubLObject)sksi_batch_translate.NIL;
        }
        SubLObject cdolist_list_var;
        final SubLObject sentences = cdolist_list_var = sksi_translate_all_sk_sources_in_mt(content_mt, meta_mt, check_wffnessP, start_row, end_row, (SubLObject)sksi_batch_translate.UNPROVIDED);
        SubLObject current_sentence = (SubLObject)sksi_batch_translate.NIL;
        current_sentence = cdolist_list_var.first();
        while (sksi_batch_translate.NIL != cdolist_list_var) {
            final SubLObject sentence_to_be_asserted = cycl_utilities.sentence_arg2(current_sentence, (SubLObject)sksi_batch_translate.UNPROVIDED);
            PrintLow.format(stream, (SubLObject)sksi_batch_translate.$str10$in_mt___S___, cycl_utilities.hl_to_el(target_mt));
            PrintLow.format(stream, (SubLObject)sksi_batch_translate.$str11$f___S___, sentence_to_be_asserted);
            cdolist_list_var = cdolist_list_var.rest();
            current_sentence = cdolist_list_var.first();
        }
        return (SubLObject)sksi_batch_translate.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 15419L)
    public static SubLObject sksi_batch_assert_all_sk_sources_in_mt_to_ke_string(final SubLObject content_mt, final SubLObject meta_mt, final SubLObject target_mt, SubLObject check_wffnessP, SubLObject start_row, SubLObject end_row) {
        if (check_wffnessP == sksi_batch_translate.UNPROVIDED) {
            check_wffnessP = (SubLObject)sksi_batch_translate.NIL;
        }
        if (start_row == sksi_batch_translate.UNPROVIDED) {
            start_row = (SubLObject)sksi_batch_translate.ZERO_INTEGER;
        }
        if (end_row == sksi_batch_translate.UNPROVIDED) {
            end_row = (SubLObject)sksi_batch_translate.NIL;
        }
        SubLObject result_string = (SubLObject)sksi_batch_translate.NIL;
        SubLObject stream = (SubLObject)sksi_batch_translate.NIL;
        try {
            stream = streams_high.make_private_string_output_stream();
            sksi_batch_assert_all_sk_sources_in_mt_to_ke_stream(content_mt, meta_mt, target_mt, stream, check_wffnessP, start_row, end_row);
            result_string = streams_high.get_output_stream_string(stream);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)sksi_batch_translate.T);
                final SubLObject _values = Values.getValuesAsVector();
                streams_high.close(stream, (SubLObject)sksi_batch_translate.UNPROVIDED);
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return result_string;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 15812L)
    public static SubLObject sksi_batch_assert_all_sk_sources_in_mt_to_ke_file(final SubLObject filename, final SubLObject target_mt, final SubLObject content_mt, final SubLObject meta_mt, SubLObject check_wff_nessP, SubLObject start_row, SubLObject end_row) {
        if (check_wff_nessP == sksi_batch_translate.UNPROVIDED) {
            check_wff_nessP = (SubLObject)sksi_batch_translate.NIL;
        }
        if (start_row == sksi_batch_translate.UNPROVIDED) {
            start_row = (SubLObject)sksi_batch_translate.ZERO_INTEGER;
        }
        if (end_row == sksi_batch_translate.UNPROVIDED) {
            end_row = (SubLObject)sksi_batch_translate.NIL;
        }
        SubLObject stream = (SubLObject)sksi_batch_translate.NIL;
        try {
            stream = compatibility.open_text(filename, (SubLObject)sksi_batch_translate.$kw12$OUTPUT);
            if (!stream.isStream()) {
                Errors.error((SubLObject)sksi_batch_translate.$str13$Unable_to_open__S, filename);
            }
            final SubLObject stream_$1 = stream;
            sksi_batch_assert_all_sk_sources_in_mt_to_ke_stream(content_mt, meta_mt, target_mt, stream_$1, check_wff_nessP, start_row, end_row);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)sksi_batch_translate.T);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)sksi_batch_translate.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return (SubLObject)sksi_batch_translate.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 16656L)
    public static SubLObject sksi_translate_all_sk_sources_in_mt(final SubLObject content_mt, final SubLObject meta_mt, SubLObject check_wff_nessP, SubLObject start_row, SubLObject end_row, SubLObject assert_as_you_goP) {
        if (check_wff_nessP == sksi_batch_translate.UNPROVIDED) {
            check_wff_nessP = (SubLObject)sksi_batch_translate.NIL;
        }
        if (start_row == sksi_batch_translate.UNPROVIDED) {
            start_row = (SubLObject)sksi_batch_translate.ZERO_INTEGER;
        }
        if (end_row == sksi_batch_translate.UNPROVIDED) {
            end_row = (SubLObject)sksi_batch_translate.NIL;
        }
        if (assert_as_you_goP == sksi_batch_translate.UNPROVIDED) {
            assert_as_you_goP = (SubLObject)sksi_batch_translate.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sentences = (SubLObject)sksi_batch_translate.NIL;
        SubLObject node_var = content_mt;
        final SubLObject deck_type = (SubLObject)sksi_batch_translate.$kw16$STACK;
        final SubLObject recur_deck = deck.create_deck(deck_type);
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                final SubLObject tv_var = (SubLObject)sksi_batch_translate.NIL;
                final SubLObject _prev_bind_0_$2 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_tv$.bind((sksi_batch_translate.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((sksi_batch_translate.NIL != tv_var) ? sksi_batch_translate.$sym17$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                    if (sksi_batch_translate.NIL != tv_var && sksi_batch_translate.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && sksi_batch_translate.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql((SubLObject)sksi_batch_translate.$kw18$ERROR)) {
                            sbhl_paranoia.sbhl_error((SubLObject)sksi_batch_translate.ONE_INTEGER, (SubLObject)sksi_batch_translate.$str19$_A_is_not_a__A, tv_var, (SubLObject)sksi_batch_translate.$sym20$SBHL_TRUE_TV_P, (SubLObject)sksi_batch_translate.UNPROVIDED, (SubLObject)sksi_batch_translate.UNPROVIDED, (SubLObject)sksi_batch_translate.UNPROVIDED);
                        }
                        else if (pcase_var.eql((SubLObject)sksi_batch_translate.$kw21$CERROR)) {
                            sbhl_paranoia.sbhl_cerror((SubLObject)sksi_batch_translate.ONE_INTEGER, (SubLObject)sksi_batch_translate.$str22$continue_anyway, (SubLObject)sksi_batch_translate.$str19$_A_is_not_a__A, tv_var, (SubLObject)sksi_batch_translate.$sym20$SBHL_TRUE_TV_P, (SubLObject)sksi_batch_translate.UNPROVIDED, (SubLObject)sksi_batch_translate.UNPROVIDED, (SubLObject)sksi_batch_translate.UNPROVIDED);
                        }
                        else if (pcase_var.eql((SubLObject)sksi_batch_translate.$kw23$WARN)) {
                            Errors.warn((SubLObject)sksi_batch_translate.$str19$_A_is_not_a__A, tv_var, (SubLObject)sksi_batch_translate.$sym20$SBHL_TRUE_TV_P);
                        }
                        else {
                            Errors.warn((SubLObject)sksi_batch_translate.$str24$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                            Errors.cerror((SubLObject)sksi_batch_translate.$str22$continue_anyway, (SubLObject)sksi_batch_translate.$str19$_A_is_not_a__A, tv_var, (SubLObject)sksi_batch_translate.$sym20$SBHL_TRUE_TV_P);
                        }
                    }
                    final SubLObject _prev_bind_0_$3 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$4 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(sksi_batch_translate.$const25$genlMt), thread);
                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(sksi_batch_translate.$const25$genlMt)), thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(sksi_batch_translate.$const25$genlMt)), thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)sksi_batch_translate.NIL, thread);
                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(sksi_batch_translate.$const25$genlMt), thread);
                        if (sksi_batch_translate.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || sksi_batch_translate.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(content_mt, sbhl_module_vars.get_sbhl_module((SubLObject)sksi_batch_translate.UNPROVIDED))) {
                            final SubLObject _prev_bind_0_$4 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$5 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$7 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module(sksi_batch_translate.$const25$genlMt)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)sksi_batch_translate.NIL, thread);
                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)sksi_batch_translate.UNPROVIDED);
                                while (sksi_batch_translate.NIL != node_var) {
                                    final SubLObject genl_mt = node_var;
                                    final SubLObject new_sentences = sksi_translate_all_sk_source_in_just_mt(genl_mt, meta_mt, check_wff_nessP, start_row, end_row, assert_as_you_goP);
                                    sentences = ConsesLow.nconc(Sequences.nreverse(new_sentences), sentences);
                                    SubLObject cdolist_list_var;
                                    final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(sksi_batch_translate.$const25$genlMt));
                                    SubLObject module_var = (SubLObject)sksi_batch_translate.NIL;
                                    module_var = cdolist_list_var.first();
                                    while (sksi_batch_translate.NIL != cdolist_list_var) {
                                        final SubLObject _prev_bind_0_$5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$6 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((sksi_batch_translate.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)sksi_batch_translate.UNPROVIDED, (SubLObject)sksi_batch_translate.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(sksi_batch_translate.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                            final SubLObject node = function_terms.naut_to_nart(node_var);
                                            if (sksi_batch_translate.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)sksi_batch_translate.UNPROVIDED));
                                                if (sksi_batch_translate.NIL != d_link) {
                                                    final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)sksi_batch_translate.UNPROVIDED));
                                                    if (sksi_batch_translate.NIL != mt_links) {
                                                        SubLObject iteration_state;
                                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); sksi_batch_translate.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                            thread.resetMultipleValues();
                                                            final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                            final SubLObject tv_links = thread.secondMultipleValue();
                                                            thread.resetMultipleValues();
                                                            if (sksi_batch_translate.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                final SubLObject _prev_bind_0_$6 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                    SubLObject iteration_state_$11;
                                                                    for (iteration_state_$11 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); sksi_batch_translate.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$11); iteration_state_$11 = dictionary_contents.do_dictionary_contents_next(iteration_state_$11)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$11);
                                                                        final SubLObject link_nodes = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (sksi_batch_translate.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                            final SubLObject _prev_bind_0_$7 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                final SubLObject sol = link_nodes;
                                                                                if (sksi_batch_translate.NIL != set.set_p(sol)) {
                                                                                    final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                    SubLObject basis_object;
                                                                                    SubLObject state;
                                                                                    SubLObject node_vars_link_node;
                                                                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)sksi_batch_translate.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); sksi_batch_translate.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                        node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                        if (sksi_batch_translate.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && sksi_batch_translate.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)sksi_batch_translate.UNPROVIDED)) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)sksi_batch_translate.UNPROVIDED);
                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (sol.isList()) {
                                                                                    SubLObject csome_list_var = sol;
                                                                                    SubLObject node_vars_link_node2 = (SubLObject)sksi_batch_translate.NIL;
                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                    while (sksi_batch_translate.NIL != csome_list_var) {
                                                                                        if (sksi_batch_translate.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)sksi_batch_translate.UNPROVIDED)) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)sksi_batch_translate.UNPROVIDED);
                                                                                            deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                        }
                                                                                        csome_list_var = csome_list_var.rest();
                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)sksi_batch_translate.$str26$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$7, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$11);
                                                                }
                                                                finally {
                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$6, thread);
                                                                }
                                                            }
                                                        }
                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                    }
                                                }
                                                else {
                                                    sbhl_paranoia.sbhl_error((SubLObject)sksi_batch_translate.FIVE_INTEGER, (SubLObject)sksi_batch_translate.$str27$attempting_to_bind_direction_link, (SubLObject)sksi_batch_translate.UNPROVIDED, (SubLObject)sksi_batch_translate.UNPROVIDED, (SubLObject)sksi_batch_translate.UNPROVIDED, (SubLObject)sksi_batch_translate.UNPROVIDED, (SubLObject)sksi_batch_translate.UNPROVIDED);
                                                }
                                            }
                                            else if (sksi_batch_translate.NIL != obsolete.cnat_p(node, (SubLObject)sksi_batch_translate.UNPROVIDED)) {
                                                SubLObject cdolist_list_var_$13;
                                                final SubLObject new_list = cdolist_list_var_$13 = ((sksi_batch_translate.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)sksi_batch_translate.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)sksi_batch_translate.UNPROVIDED)));
                                                SubLObject generating_fn = (SubLObject)sksi_batch_translate.NIL;
                                                generating_fn = cdolist_list_var_$13.first();
                                                while (sksi_batch_translate.NIL != cdolist_list_var_$13) {
                                                    final SubLObject _prev_bind_0_$8 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                    try {
                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                        final SubLObject sol2;
                                                        final SubLObject link_nodes2 = sol2 = Functions.funcall(generating_fn, node);
                                                        if (sksi_batch_translate.NIL != set.set_p(sol2)) {
                                                            final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                            SubLObject basis_object2;
                                                            SubLObject state2;
                                                            SubLObject node_vars_link_node3;
                                                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)sksi_batch_translate.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); sksi_batch_translate.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                if (sksi_batch_translate.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && sksi_batch_translate.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)sksi_batch_translate.UNPROVIDED)) {
                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)sksi_batch_translate.UNPROVIDED);
                                                                    deck.deck_push(node_vars_link_node3, recur_deck);
                                                                }
                                                            }
                                                        }
                                                        else if (sol2.isList()) {
                                                            SubLObject csome_list_var2 = sol2;
                                                            SubLObject node_vars_link_node4 = (SubLObject)sksi_batch_translate.NIL;
                                                            node_vars_link_node4 = csome_list_var2.first();
                                                            while (sksi_batch_translate.NIL != csome_list_var2) {
                                                                if (sksi_batch_translate.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)sksi_batch_translate.UNPROVIDED)) {
                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)sksi_batch_translate.UNPROVIDED);
                                                                    deck.deck_push(node_vars_link_node4, recur_deck);
                                                                }
                                                                csome_list_var2 = csome_list_var2.rest();
                                                                node_vars_link_node4 = csome_list_var2.first();
                                                            }
                                                        }
                                                        else {
                                                            Errors.error((SubLObject)sksi_batch_translate.$str26$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$8, thread);
                                                    }
                                                    cdolist_list_var_$13 = cdolist_list_var_$13.rest();
                                                    generating_fn = cdolist_list_var_$13.first();
                                                }
                                            }
                                        }
                                        finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$6, thread);
                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$5, thread);
                                        }
                                        cdolist_list_var = cdolist_list_var.rest();
                                        module_var = cdolist_list_var.first();
                                    }
                                    node_var = deck.deck_pop(recur_deck);
                                }
                            }
                            finally {
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$7, thread);
                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$5, thread);
                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$4, thread);
                            }
                        }
                        else {
                            sbhl_paranoia.sbhl_warn((SubLObject)sksi_batch_translate.TWO_INTEGER, (SubLObject)sksi_batch_translate.$str28$Node__a_does_not_pass_sbhl_type_t, content_mt, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)sksi_batch_translate.UNPROVIDED)), (SubLObject)sksi_batch_translate.UNPROVIDED, (SubLObject)sksi_batch_translate.UNPROVIDED, (SubLObject)sksi_batch_translate.UNPROVIDED);
                        }
                    }
                    finally {
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$4, thread);
                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$3, thread);
                    }
                }
                finally {
                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$2, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$9 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_batch_translate.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$9, thread);
                }
            }
        }
        finally {
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(sentences);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 17681L)
    public static SubLObject sksi_translate_all_sk_source_in_just_mt(final SubLObject content_mt, final SubLObject meta_mt, SubLObject check_wff_nessP, SubLObject start_row, SubLObject end_row, SubLObject assert_as_you_goP) {
        if (check_wff_nessP == sksi_batch_translate.UNPROVIDED) {
            check_wff_nessP = (SubLObject)sksi_batch_translate.NIL;
        }
        if (start_row == sksi_batch_translate.UNPROVIDED) {
            start_row = (SubLObject)sksi_batch_translate.ZERO_INTEGER;
        }
        if (end_row == sksi_batch_translate.UNPROVIDED) {
            end_row = (SubLObject)sksi_batch_translate.NIL;
        }
        if (assert_as_you_goP == sksi_batch_translate.UNPROVIDED) {
            assert_as_you_goP = (SubLObject)sksi_batch_translate.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sentences = (SubLObject)sksi_batch_translate.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(meta_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject sk_source = sksi_kb_accessors.content_mt_sk_source(content_mt, (SubLObject)sksi_batch_translate.UNPROVIDED);
            if (sksi_batch_translate.NIL != sk_source) {
                sentences = sksi_translate_all_spec_sk_sources(sk_source, meta_mt, check_wff_nessP, start_row, end_row, assert_as_you_goP);
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return sentences;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 18660L)
    public static SubLObject sksi_translate_all_sk_sources_in_mt_to_stream(final SubLObject content_mt, final SubLObject meta_mt, SubLObject stream, SubLObject check_wff_nessP, SubLObject start_row, SubLObject end_row) {
        if (stream == sksi_batch_translate.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (check_wff_nessP == sksi_batch_translate.UNPROVIDED) {
            check_wff_nessP = (SubLObject)sksi_batch_translate.NIL;
        }
        if (start_row == sksi_batch_translate.UNPROVIDED) {
            start_row = (SubLObject)sksi_batch_translate.ZERO_INTEGER;
        }
        if (end_row == sksi_batch_translate.UNPROVIDED) {
            end_row = (SubLObject)sksi_batch_translate.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject node_var = content_mt;
        final SubLObject deck_type = (SubLObject)sksi_batch_translate.$kw16$STACK;
        final SubLObject recur_deck = deck.create_deck(deck_type);
        final SubLObject _prev_bind_0 = sbhl_marking_vars.$sbhl_space$.currentBinding(thread);
        try {
            sbhl_marking_vars.$sbhl_space$.bind(sbhl_marking_vars.get_sbhl_marking_space(), thread);
            try {
                final SubLObject tv_var = (SubLObject)sksi_batch_translate.NIL;
                final SubLObject _prev_bind_0_$16 = sbhl_search_vars.$sbhl_tv$.currentBinding(thread);
                final SubLObject _prev_bind_2 = sbhl_search_vars.$relevant_sbhl_tv_function$.currentBinding(thread);
                try {
                    sbhl_search_vars.$sbhl_tv$.bind((sksi_batch_translate.NIL != tv_var) ? tv_var : sbhl_search_vars.get_sbhl_true_tv(), thread);
                    sbhl_search_vars.$relevant_sbhl_tv_function$.bind((SubLObject)((sksi_batch_translate.NIL != tv_var) ? sksi_batch_translate.$sym17$RELEVANT_SBHL_TV_IS_GENERAL_TV : sbhl_search_vars.$relevant_sbhl_tv_function$.getDynamicValue(thread)), thread);
                    if (sksi_batch_translate.NIL != tv_var && sksi_batch_translate.NIL != sbhl_paranoia.sbhl_object_type_checking_p() && sksi_batch_translate.NIL == sbhl_search_vars.sbhl_true_tv_p(tv_var)) {
                        final SubLObject pcase_var = sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread);
                        if (pcase_var.eql((SubLObject)sksi_batch_translate.$kw18$ERROR)) {
                            sbhl_paranoia.sbhl_error((SubLObject)sksi_batch_translate.ONE_INTEGER, (SubLObject)sksi_batch_translate.$str19$_A_is_not_a__A, tv_var, (SubLObject)sksi_batch_translate.$sym20$SBHL_TRUE_TV_P, (SubLObject)sksi_batch_translate.UNPROVIDED, (SubLObject)sksi_batch_translate.UNPROVIDED, (SubLObject)sksi_batch_translate.UNPROVIDED);
                        }
                        else if (pcase_var.eql((SubLObject)sksi_batch_translate.$kw21$CERROR)) {
                            sbhl_paranoia.sbhl_cerror((SubLObject)sksi_batch_translate.ONE_INTEGER, (SubLObject)sksi_batch_translate.$str22$continue_anyway, (SubLObject)sksi_batch_translate.$str19$_A_is_not_a__A, tv_var, (SubLObject)sksi_batch_translate.$sym20$SBHL_TRUE_TV_P, (SubLObject)sksi_batch_translate.UNPROVIDED, (SubLObject)sksi_batch_translate.UNPROVIDED, (SubLObject)sksi_batch_translate.UNPROVIDED);
                        }
                        else if (pcase_var.eql((SubLObject)sksi_batch_translate.$kw23$WARN)) {
                            Errors.warn((SubLObject)sksi_batch_translate.$str19$_A_is_not_a__A, tv_var, (SubLObject)sksi_batch_translate.$sym20$SBHL_TRUE_TV_P);
                        }
                        else {
                            Errors.warn((SubLObject)sksi_batch_translate.$str24$_A_is_not_a_valid__sbhl_type_erro, sbhl_paranoia.$sbhl_type_error_action$.getDynamicValue(thread));
                            Errors.cerror((SubLObject)sksi_batch_translate.$str22$continue_anyway, (SubLObject)sksi_batch_translate.$str19$_A_is_not_a__A, tv_var, (SubLObject)sksi_batch_translate.$sym20$SBHL_TRUE_TV_P);
                        }
                    }
                    final SubLObject _prev_bind_0_$17 = sbhl_search_vars.$sbhl_search_module$.currentBinding(thread);
                    final SubLObject _prev_bind_1_$18 = sbhl_search_vars.$sbhl_search_module_type$.currentBinding(thread);
                    final SubLObject _prev_bind_3 = sbhl_search_vars.$sbhl_add_node_to_result_test$.currentBinding(thread);
                    final SubLObject _prev_bind_4 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                    final SubLObject _prev_bind_5 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                    try {
                        sbhl_search_vars.$sbhl_search_module$.bind(sbhl_module_vars.get_sbhl_module(sksi_batch_translate.$const25$genlMt), thread);
                        sbhl_search_vars.$sbhl_search_module_type$.bind(sbhl_module_utilities.get_sbhl_module_type(sbhl_module_vars.get_sbhl_module(sksi_batch_translate.$const25$genlMt)), thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.bind(sbhl_module_utilities.get_sbhl_add_node_to_result_test(sbhl_module_vars.get_sbhl_module(sksi_batch_translate.$const25$genlMt)), thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)sksi_batch_translate.NIL, thread);
                        sbhl_module_vars.$sbhl_module$.bind(sbhl_module_vars.get_sbhl_module(sksi_batch_translate.$const25$genlMt), thread);
                        if (sksi_batch_translate.NIL != sbhl_paranoia.suspend_sbhl_type_checkingP() || sksi_batch_translate.NIL != sbhl_module_utilities.apply_sbhl_module_type_test(content_mt, sbhl_module_vars.get_sbhl_module((SubLObject)sksi_batch_translate.UNPROVIDED))) {
                            final SubLObject _prev_bind_0_$18 = sbhl_search_vars.$sbhl_search_direction$.currentBinding(thread);
                            final SubLObject _prev_bind_1_$19 = sbhl_link_vars.$sbhl_link_direction$.currentBinding(thread);
                            final SubLObject _prev_bind_2_$21 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                            try {
                                sbhl_search_vars.$sbhl_search_direction$.bind(sbhl_search_vars.get_sbhl_forward_search_direction(), thread);
                                sbhl_link_vars.$sbhl_link_direction$.bind(sbhl_module_utilities.sbhl_search_direction_to_link_direction(sbhl_search_vars.get_sbhl_forward_search_direction(), sbhl_module_vars.get_sbhl_module(sksi_batch_translate.$const25$genlMt)), thread);
                                sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)sksi_batch_translate.NIL, thread);
                                sbhl_marking_utilities.sbhl_mark_node_marked(node_var, (SubLObject)sksi_batch_translate.UNPROVIDED);
                                while (sksi_batch_translate.NIL != node_var) {
                                    final SubLObject genl_mt = node_var;
                                    final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(meta_mt);
                                    final SubLObject _prev_bind_0_$19 = mt_relevance_macros.$mt$.currentBinding(thread);
                                    final SubLObject _prev_bind_1_$20 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                                    final SubLObject _prev_bind_2_$22 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
                                    try {
                                        mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
                                        mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
                                        mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
                                        final SubLObject sk_source = sksi_kb_accessors.content_mt_sk_source(genl_mt, (SubLObject)sksi_batch_translate.UNPROVIDED);
                                        if (sksi_batch_translate.NIL != sk_source) {
                                            sksi_translate_all_spec_sk_sources_to_stream(sk_source, meta_mt, stream, check_wff_nessP, start_row, end_row);
                                        }
                                    }
                                    finally {
                                        mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_2_$22, thread);
                                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_1_$20, thread);
                                        mt_relevance_macros.$mt$.rebind(_prev_bind_0_$19, thread);
                                    }
                                    SubLObject cdolist_list_var;
                                    final SubLObject accessible_modules = cdolist_list_var = sbhl_macros.get_sbhl_accessible_modules(sbhl_module_vars.get_sbhl_module(sksi_batch_translate.$const25$genlMt));
                                    SubLObject module_var = (SubLObject)sksi_batch_translate.NIL;
                                    module_var = cdolist_list_var.first();
                                    while (sksi_batch_translate.NIL != cdolist_list_var) {
                                        final SubLObject _prev_bind_0_$20 = sbhl_module_vars.$sbhl_module$.currentBinding(thread);
                                        final SubLObject _prev_bind_1_$21 = sbhl_search_vars.$genl_inverse_mode_p$.currentBinding(thread);
                                        try {
                                            sbhl_module_vars.$sbhl_module$.bind(module_var, thread);
                                            sbhl_search_vars.$genl_inverse_mode_p$.bind((SubLObject)((sksi_batch_translate.NIL != sbhl_search_vars.flip_genl_inverse_modeP((SubLObject)sksi_batch_translate.UNPROVIDED, (SubLObject)sksi_batch_translate.UNPROVIDED)) ? SubLObjectFactory.makeBoolean(sksi_batch_translate.NIL == sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)) : sbhl_search_vars.$genl_inverse_mode_p$.getDynamicValue(thread)), thread);
                                            final SubLObject node = function_terms.naut_to_nart(node_var);
                                            if (sksi_batch_translate.NIL != sbhl_link_vars.sbhl_node_object_p(node)) {
                                                final SubLObject d_link = sbhl_graphs.get_sbhl_graph_link(node, sbhl_module_vars.get_sbhl_module((SubLObject)sksi_batch_translate.UNPROVIDED));
                                                if (sksi_batch_translate.NIL != d_link) {
                                                    final SubLObject mt_links = sbhl_links.get_sbhl_mt_links(d_link, sbhl_link_vars.get_sbhl_link_direction(), sbhl_module_vars.get_sbhl_module((SubLObject)sksi_batch_translate.UNPROVIDED));
                                                    if (sksi_batch_translate.NIL != mt_links) {
                                                        SubLObject iteration_state;
                                                        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(mt_links)); sksi_batch_translate.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                                                            thread.resetMultipleValues();
                                                            final SubLObject mt = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                                                            final SubLObject tv_links = thread.secondMultipleValue();
                                                            thread.resetMultipleValues();
                                                            if (sksi_batch_translate.NIL != mt_relevance_macros.relevant_mtP(mt)) {
                                                                final SubLObject _prev_bind_0_$21 = sbhl_link_vars.$sbhl_link_mt$.currentBinding(thread);
                                                                try {
                                                                    sbhl_link_vars.$sbhl_link_mt$.bind(mt, thread);
                                                                    SubLObject iteration_state_$28;
                                                                    for (iteration_state_$28 = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(tv_links)); sksi_batch_translate.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state_$28); iteration_state_$28 = dictionary_contents.do_dictionary_contents_next(iteration_state_$28)) {
                                                                        thread.resetMultipleValues();
                                                                        final SubLObject tv = dictionary_contents.do_dictionary_contents_key_value(iteration_state_$28);
                                                                        final SubLObject link_nodes = thread.secondMultipleValue();
                                                                        thread.resetMultipleValues();
                                                                        if (sksi_batch_translate.NIL != sbhl_search_vars.relevant_sbhl_tvP(tv)) {
                                                                            final SubLObject _prev_bind_0_$22 = sbhl_link_vars.$sbhl_link_tv$.currentBinding(thread);
                                                                            try {
                                                                                sbhl_link_vars.$sbhl_link_tv$.bind(tv, thread);
                                                                                final SubLObject sol = link_nodes;
                                                                                if (sksi_batch_translate.NIL != set.set_p(sol)) {
                                                                                    final SubLObject set_contents_var = set.do_set_internal(sol);
                                                                                    SubLObject basis_object;
                                                                                    SubLObject state;
                                                                                    SubLObject node_vars_link_node;
                                                                                    for (basis_object = set_contents.do_set_contents_basis_object(set_contents_var), state = (SubLObject)sksi_batch_translate.NIL, state = set_contents.do_set_contents_initial_state(basis_object, set_contents_var); sksi_batch_translate.NIL == set_contents.do_set_contents_doneP(basis_object, state); state = set_contents.do_set_contents_update_state(state)) {
                                                                                        node_vars_link_node = set_contents.do_set_contents_next(basis_object, state);
                                                                                        if (sksi_batch_translate.NIL != set_contents.do_set_contents_element_validP(state, node_vars_link_node) && sksi_batch_translate.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node, (SubLObject)sksi_batch_translate.UNPROVIDED)) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node, (SubLObject)sksi_batch_translate.UNPROVIDED);
                                                                                            deck.deck_push(node_vars_link_node, recur_deck);
                                                                                        }
                                                                                    }
                                                                                }
                                                                                else if (sol.isList()) {
                                                                                    SubLObject csome_list_var = sol;
                                                                                    SubLObject node_vars_link_node2 = (SubLObject)sksi_batch_translate.NIL;
                                                                                    node_vars_link_node2 = csome_list_var.first();
                                                                                    while (sksi_batch_translate.NIL != csome_list_var) {
                                                                                        if (sksi_batch_translate.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node2, (SubLObject)sksi_batch_translate.UNPROVIDED)) {
                                                                                            sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node2, (SubLObject)sksi_batch_translate.UNPROVIDED);
                                                                                            deck.deck_push(node_vars_link_node2, recur_deck);
                                                                                        }
                                                                                        csome_list_var = csome_list_var.rest();
                                                                                        node_vars_link_node2 = csome_list_var.first();
                                                                                    }
                                                                                }
                                                                                else {
                                                                                    Errors.error((SubLObject)sksi_batch_translate.$str26$_A_is_neither_SET_P_nor_LISTP_, sol);
                                                                                }
                                                                            }
                                                                            finally {
                                                                                sbhl_link_vars.$sbhl_link_tv$.rebind(_prev_bind_0_$22, thread);
                                                                            }
                                                                        }
                                                                    }
                                                                    dictionary_contents.do_dictionary_contents_finalize(iteration_state_$28);
                                                                }
                                                                finally {
                                                                    sbhl_link_vars.$sbhl_link_mt$.rebind(_prev_bind_0_$21, thread);
                                                                }
                                                            }
                                                        }
                                                        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
                                                    }
                                                }
                                                else {
                                                    sbhl_paranoia.sbhl_error((SubLObject)sksi_batch_translate.FIVE_INTEGER, (SubLObject)sksi_batch_translate.$str27$attempting_to_bind_direction_link, (SubLObject)sksi_batch_translate.UNPROVIDED, (SubLObject)sksi_batch_translate.UNPROVIDED, (SubLObject)sksi_batch_translate.UNPROVIDED, (SubLObject)sksi_batch_translate.UNPROVIDED, (SubLObject)sksi_batch_translate.UNPROVIDED);
                                                }
                                            }
                                            else if (sksi_batch_translate.NIL != obsolete.cnat_p(node, (SubLObject)sksi_batch_translate.UNPROVIDED)) {
                                                SubLObject cdolist_list_var_$30;
                                                final SubLObject new_list = cdolist_list_var_$30 = ((sksi_batch_translate.NIL != sbhl_link_vars.sbhl_randomize_lists_p()) ? list_utilities.randomize_list(sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)sksi_batch_translate.UNPROVIDED))) : sbhl_module_utilities.get_sbhl_module_relevant_naut_link_generators(sbhl_link_vars.get_sbhl_link_direction(), sbhl_search_vars.$sbhl_tv$.getDynamicValue(thread), sbhl_module_vars.get_sbhl_module((SubLObject)sksi_batch_translate.UNPROVIDED)));
                                                SubLObject generating_fn = (SubLObject)sksi_batch_translate.NIL;
                                                generating_fn = cdolist_list_var_$30.first();
                                                while (sksi_batch_translate.NIL != cdolist_list_var_$30) {
                                                    final SubLObject _prev_bind_0_$23 = sbhl_link_vars.$sbhl_link_generator$.currentBinding(thread);
                                                    try {
                                                        sbhl_link_vars.$sbhl_link_generator$.bind(generating_fn, thread);
                                                        final SubLObject sol2;
                                                        final SubLObject link_nodes2 = sol2 = Functions.funcall(generating_fn, node);
                                                        if (sksi_batch_translate.NIL != set.set_p(sol2)) {
                                                            final SubLObject set_contents_var2 = set.do_set_internal(sol2);
                                                            SubLObject basis_object2;
                                                            SubLObject state2;
                                                            SubLObject node_vars_link_node3;
                                                            for (basis_object2 = set_contents.do_set_contents_basis_object(set_contents_var2), state2 = (SubLObject)sksi_batch_translate.NIL, state2 = set_contents.do_set_contents_initial_state(basis_object2, set_contents_var2); sksi_batch_translate.NIL == set_contents.do_set_contents_doneP(basis_object2, state2); state2 = set_contents.do_set_contents_update_state(state2)) {
                                                                node_vars_link_node3 = set_contents.do_set_contents_next(basis_object2, state2);
                                                                if (sksi_batch_translate.NIL != set_contents.do_set_contents_element_validP(state2, node_vars_link_node3) && sksi_batch_translate.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node3, (SubLObject)sksi_batch_translate.UNPROVIDED)) {
                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node3, (SubLObject)sksi_batch_translate.UNPROVIDED);
                                                                    deck.deck_push(node_vars_link_node3, recur_deck);
                                                                }
                                                            }
                                                        }
                                                        else if (sol2.isList()) {
                                                            SubLObject csome_list_var2 = sol2;
                                                            SubLObject node_vars_link_node4 = (SubLObject)sksi_batch_translate.NIL;
                                                            node_vars_link_node4 = csome_list_var2.first();
                                                            while (sksi_batch_translate.NIL != csome_list_var2) {
                                                                if (sksi_batch_translate.NIL == sbhl_marking_utilities.sbhl_search_path_termination_p(node_vars_link_node4, (SubLObject)sksi_batch_translate.UNPROVIDED)) {
                                                                    sbhl_marking_utilities.sbhl_mark_node_marked(node_vars_link_node4, (SubLObject)sksi_batch_translate.UNPROVIDED);
                                                                    deck.deck_push(node_vars_link_node4, recur_deck);
                                                                }
                                                                csome_list_var2 = csome_list_var2.rest();
                                                                node_vars_link_node4 = csome_list_var2.first();
                                                            }
                                                        }
                                                        else {
                                                            Errors.error((SubLObject)sksi_batch_translate.$str26$_A_is_neither_SET_P_nor_LISTP_, sol2);
                                                        }
                                                    }
                                                    finally {
                                                        sbhl_link_vars.$sbhl_link_generator$.rebind(_prev_bind_0_$23, thread);
                                                    }
                                                    cdolist_list_var_$30 = cdolist_list_var_$30.rest();
                                                    generating_fn = cdolist_list_var_$30.first();
                                                }
                                            }
                                        }
                                        finally {
                                            sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_1_$21, thread);
                                            sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_0_$20, thread);
                                        }
                                        cdolist_list_var = cdolist_list_var.rest();
                                        module_var = cdolist_list_var.first();
                                    }
                                    node_var = deck.deck_pop(recur_deck);
                                }
                            }
                            finally {
                                sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_2_$21, thread);
                                sbhl_link_vars.$sbhl_link_direction$.rebind(_prev_bind_1_$19, thread);
                                sbhl_search_vars.$sbhl_search_direction$.rebind(_prev_bind_0_$18, thread);
                            }
                        }
                        else {
                            sbhl_paranoia.sbhl_warn((SubLObject)sksi_batch_translate.TWO_INTEGER, (SubLObject)sksi_batch_translate.$str28$Node__a_does_not_pass_sbhl_type_t, content_mt, sbhl_module_utilities.get_sbhl_type_test(sbhl_module_vars.get_sbhl_module((SubLObject)sksi_batch_translate.UNPROVIDED)), (SubLObject)sksi_batch_translate.UNPROVIDED, (SubLObject)sksi_batch_translate.UNPROVIDED, (SubLObject)sksi_batch_translate.UNPROVIDED);
                        }
                    }
                    finally {
                        sbhl_module_vars.$sbhl_module$.rebind(_prev_bind_5, thread);
                        sbhl_search_vars.$genl_inverse_mode_p$.rebind(_prev_bind_4, thread);
                        sbhl_search_vars.$sbhl_add_node_to_result_test$.rebind(_prev_bind_3, thread);
                        sbhl_search_vars.$sbhl_search_module_type$.rebind(_prev_bind_1_$18, thread);
                        sbhl_search_vars.$sbhl_search_module$.rebind(_prev_bind_0_$17, thread);
                    }
                }
                finally {
                    sbhl_search_vars.$relevant_sbhl_tv_function$.rebind(_prev_bind_2, thread);
                    sbhl_search_vars.$sbhl_tv$.rebind(_prev_bind_0_$16, thread);
                }
            }
            finally {
                final SubLObject _prev_bind_0_$24 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_batch_translate.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    sbhl_marking_vars.free_sbhl_marking_space(sbhl_marking_vars.$sbhl_space$.getDynamicValue(thread));
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$24, thread);
                }
            }
        }
        finally {
            sbhl_marking_vars.$sbhl_space$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)sksi_batch_translate.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 19596L)
    public static SubLObject sksi_translate_all_sk_sources_in_mt_to_file(final SubLObject filename, final SubLObject content_mt, final SubLObject meta_mt, SubLObject check_wff_nessP, SubLObject start_row, SubLObject end_row) {
        if (check_wff_nessP == sksi_batch_translate.UNPROVIDED) {
            check_wff_nessP = (SubLObject)sksi_batch_translate.NIL;
        }
        if (start_row == sksi_batch_translate.UNPROVIDED) {
            start_row = (SubLObject)sksi_batch_translate.ZERO_INTEGER;
        }
        if (end_row == sksi_batch_translate.UNPROVIDED) {
            end_row = (SubLObject)sksi_batch_translate.NIL;
        }
        SubLObject stream = (SubLObject)sksi_batch_translate.NIL;
        try {
            stream = compatibility.open_text(filename, (SubLObject)sksi_batch_translate.$kw12$OUTPUT);
            if (!stream.isStream()) {
                Errors.error((SubLObject)sksi_batch_translate.$str13$Unable_to_open__S, filename);
            }
            final SubLObject stream_$33 = stream;
            sksi_translate_all_sk_sources_in_mt_to_stream(content_mt, meta_mt, stream_$33, check_wff_nessP, start_row, end_row);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)sksi_batch_translate.T);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)sksi_batch_translate.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return (SubLObject)sksi_batch_translate.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 20408L)
    public static SubLObject sksi_translate_all_spec_sk_sources(final SubLObject sk_source, final SubLObject meta_mt, SubLObject check_wff_nessP, SubLObject start_row, SubLObject end_row, SubLObject assert_as_you_goP) {
        if (check_wff_nessP == sksi_batch_translate.UNPROVIDED) {
            check_wff_nessP = (SubLObject)sksi_batch_translate.NIL;
        }
        if (start_row == sksi_batch_translate.UNPROVIDED) {
            start_row = (SubLObject)sksi_batch_translate.ZERO_INTEGER;
        }
        if (end_row == sksi_batch_translate.UNPROVIDED) {
            end_row = (SubLObject)sksi_batch_translate.NIL;
        }
        if (assert_as_you_goP == sksi_batch_translate.UNPROVIDED) {
            assert_as_you_goP = (SubLObject)sksi_batch_translate.NIL;
        }
        SubLObject all_sentences = (SubLObject)sksi_batch_translate.NIL;
        final SubLObject sentences = sksi_translate_all_simple_sk_source(sk_source, meta_mt, check_wff_nessP, start_row, end_row, assert_as_you_goP);
        all_sentences = ConsesLow.nconc(Sequences.nreverse(sentences), all_sentences);
        SubLObject cdolist_list_var;
        final SubLObject spec_sk_sources = cdolist_list_var = sksi_kb_accessors.sk_source_immediate_spec_sk_sources(sk_source, meta_mt);
        SubLObject spec_sk_source = (SubLObject)sksi_batch_translate.NIL;
        spec_sk_source = cdolist_list_var.first();
        while (sksi_batch_translate.NIL != cdolist_list_var) {
            final SubLObject sentences2 = sksi_translate_all_simple_sk_source(spec_sk_source, meta_mt, check_wff_nessP, start_row, end_row, assert_as_you_goP);
            all_sentences = ConsesLow.nconc(Sequences.nreverse(sentences2), all_sentences);
            cdolist_list_var = cdolist_list_var.rest();
            spec_sk_source = cdolist_list_var.first();
        }
        return Sequences.nreverse(all_sentences);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 21913L)
    public static SubLObject sksi_translate_all_spec_sk_sources_to_stream(final SubLObject sk_source, final SubLObject meta_mt, SubLObject stream, SubLObject check_wff_nessP, SubLObject start_row, SubLObject end_row) {
        if (stream == sksi_batch_translate.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (check_wff_nessP == sksi_batch_translate.UNPROVIDED) {
            check_wff_nessP = (SubLObject)sksi_batch_translate.NIL;
        }
        if (start_row == sksi_batch_translate.UNPROVIDED) {
            start_row = (SubLObject)sksi_batch_translate.ZERO_INTEGER;
        }
        if (end_row == sksi_batch_translate.UNPROVIDED) {
            end_row = (SubLObject)sksi_batch_translate.NIL;
        }
        sksi_translate_all_simple_sk_source_to_stream(sk_source, meta_mt, stream, check_wff_nessP, start_row, end_row);
        SubLObject cdolist_list_var;
        final SubLObject spec_sk_sources = cdolist_list_var = sksi_kb_accessors.sk_source_immediate_spec_sk_sources(sk_source, meta_mt);
        SubLObject spec_sk_source = (SubLObject)sksi_batch_translate.NIL;
        spec_sk_source = cdolist_list_var.first();
        while (sksi_batch_translate.NIL != cdolist_list_var) {
            sksi_translate_all_simple_sk_source_to_stream(spec_sk_source, meta_mt, stream, check_wff_nessP, start_row, end_row);
            cdolist_list_var = cdolist_list_var.rest();
            spec_sk_source = cdolist_list_var.first();
        }
        return (SubLObject)sksi_batch_translate.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 22942L)
    public static SubLObject sksi_translate_all_spec_sk_sources_to_file(final SubLObject filename, final SubLObject sk_source, final SubLObject meta_mt, SubLObject check_wff_nessP, SubLObject start_row, SubLObject end_row) {
        if (check_wff_nessP == sksi_batch_translate.UNPROVIDED) {
            check_wff_nessP = (SubLObject)sksi_batch_translate.NIL;
        }
        if (start_row == sksi_batch_translate.UNPROVIDED) {
            start_row = (SubLObject)sksi_batch_translate.ZERO_INTEGER;
        }
        if (end_row == sksi_batch_translate.UNPROVIDED) {
            end_row = (SubLObject)sksi_batch_translate.NIL;
        }
        SubLObject stream = (SubLObject)sksi_batch_translate.NIL;
        try {
            stream = compatibility.open_text(filename, (SubLObject)sksi_batch_translate.$kw12$OUTPUT);
            if (!stream.isStream()) {
                Errors.error((SubLObject)sksi_batch_translate.$str13$Unable_to_open__S, filename);
            }
            final SubLObject stream_$34 = stream;
            sksi_translate_all_spec_sk_sources_to_stream(sk_source, meta_mt, stream_$34, check_wff_nessP, start_row, end_row);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)sksi_batch_translate.T);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)sksi_batch_translate.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return (SubLObject)sksi_batch_translate.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 23685L)
    public static SubLObject sksi_translate_all_simple_sk_source(final SubLObject simple_sk_source, final SubLObject meta_mt, SubLObject check_wff_nessP, SubLObject start_row, SubLObject end_row, SubLObject assert_as_you_goP) {
        if (check_wff_nessP == sksi_batch_translate.UNPROVIDED) {
            check_wff_nessP = (SubLObject)sksi_batch_translate.NIL;
        }
        if (start_row == sksi_batch_translate.UNPROVIDED) {
            start_row = (SubLObject)sksi_batch_translate.ZERO_INTEGER;
        }
        if (end_row == sksi_batch_translate.UNPROVIDED) {
            end_row = (SubLObject)sksi_batch_translate.NIL;
        }
        if (assert_as_you_goP == sksi_batch_translate.UNPROVIDED) {
            assert_as_you_goP = (SubLObject)sksi_batch_translate.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject all_sentences = (SubLObject)sksi_batch_translate.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(meta_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject content_mt = sksi_kb_accessors.sk_source_content_mt(simple_sk_source);
            if (sksi_batch_translate.NIL != content_mt) {
                SubLObject cdolist_list_var;
                final SubLObject physical_schemata = cdolist_list_var = sksi_kb_accessors.sk_source_physical_schemata(simple_sk_source);
                SubLObject physical_schema = (SubLObject)sksi_batch_translate.NIL;
                physical_schema = cdolist_list_var.first();
                while (sksi_batch_translate.NIL != cdolist_list_var) {
                    if (sksi_batch_translate.NIL != sksi_kb_accessors.physical_schema_enumerableP(physical_schema)) {
                        SubLObject cdolist_list_var_$35;
                        final SubLObject logical_schemata = cdolist_list_var_$35 = sksi_kb_accessors.physical_schema_logical_schemata(physical_schema);
                        SubLObject logical_schema = (SubLObject)sksi_batch_translate.NIL;
                        logical_schema = cdolist_list_var_$35.first();
                        while (sksi_batch_translate.NIL != cdolist_list_var_$35) {
                            final SubLObject sentences = sksi_translate_simple_sk_source(simple_sk_source, physical_schema, logical_schema, meta_mt, check_wff_nessP, start_row, end_row, assert_as_you_goP);
                            all_sentences = ConsesLow.nconc(Sequences.nreverse(sentences), all_sentences);
                            cdolist_list_var_$35 = cdolist_list_var_$35.rest();
                            logical_schema = cdolist_list_var_$35.first();
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    physical_schema = cdolist_list_var.first();
                }
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(all_sentences);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 25333L)
    public static SubLObject sksi_translate_all_simple_sk_source_to_stream(final SubLObject simple_sk_source, final SubLObject meta_mt, SubLObject stream, SubLObject check_wff_nessP, SubLObject start_row, SubLObject end_row) {
        if (stream == sksi_batch_translate.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (check_wff_nessP == sksi_batch_translate.UNPROVIDED) {
            check_wff_nessP = (SubLObject)sksi_batch_translate.NIL;
        }
        if (start_row == sksi_batch_translate.UNPROVIDED) {
            start_row = (SubLObject)sksi_batch_translate.ZERO_INTEGER;
        }
        if (end_row == sksi_batch_translate.UNPROVIDED) {
            end_row = (SubLObject)sksi_batch_translate.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(meta_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject content_mt = sksi_kb_accessors.sk_source_content_mt(simple_sk_source);
            if (sksi_batch_translate.NIL != content_mt) {
                SubLObject cdolist_list_var;
                final SubLObject physical_schemata = cdolist_list_var = sksi_kb_accessors.sk_source_physical_schemata(simple_sk_source);
                SubLObject physical_schema = (SubLObject)sksi_batch_translate.NIL;
                physical_schema = cdolist_list_var.first();
                while (sksi_batch_translate.NIL != cdolist_list_var) {
                    if (sksi_batch_translate.NIL != sksi_kb_accessors.physical_schema_enumerableP(physical_schema)) {
                        SubLObject cdolist_list_var_$36;
                        final SubLObject logical_schemata = cdolist_list_var_$36 = sksi_kb_accessors.physical_schema_logical_schemata(physical_schema);
                        SubLObject logical_schema = (SubLObject)sksi_batch_translate.NIL;
                        logical_schema = cdolist_list_var_$36.first();
                        while (sksi_batch_translate.NIL != cdolist_list_var_$36) {
                            sksi_translate_simple_sk_source_to_stream(simple_sk_source, physical_schema, logical_schema, meta_mt, stream, check_wff_nessP, start_row, end_row);
                            cdolist_list_var_$36 = cdolist_list_var_$36.rest();
                            logical_schema = cdolist_list_var_$36.first();
                        }
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    physical_schema = cdolist_list_var.first();
                }
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)sksi_batch_translate.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 26638L)
    public static SubLObject sksi_translate_simple_sk_source(final SubLObject simple_sk_source, final SubLObject physical_schema, final SubLObject logical_schema, final SubLObject meta_mt, SubLObject check_wff_nessP, SubLObject start_row, SubLObject end_row, SubLObject assert_as_you_goP) {
        if (check_wff_nessP == sksi_batch_translate.UNPROVIDED) {
            check_wff_nessP = (SubLObject)sksi_batch_translate.NIL;
        }
        if (start_row == sksi_batch_translate.UNPROVIDED) {
            start_row = (SubLObject)sksi_batch_translate.ZERO_INTEGER;
        }
        if (end_row == sksi_batch_translate.UNPROVIDED) {
            end_row = (SubLObject)sksi_batch_translate.NIL;
        }
        if (assert_as_you_goP == sksi_batch_translate.UNPROVIDED) {
            assert_as_you_goP = (SubLObject)sksi_batch_translate.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject sentences = (SubLObject)sksi_batch_translate.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(meta_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject content_mt = sksi_kb_accessors.sk_source_content_mt(simple_sk_source);
            if (sksi_batch_translate.NIL != content_mt) {
                final SubLObject raw_iterator = new_sk_source_row_iterator(simple_sk_source, physical_schema, meta_mt, start_row, end_row, (SubLObject)sksi_batch_translate.UNPROVIDED);
                if (sksi_batch_translate.NIL != iteration.iterator_p(raw_iterator)) {
                    final SubLObject local_state;
                    final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
                    final SubLObject _prev_bind_0_$37 = memoization_state.$memoization_state$.currentBinding(thread);
                    try {
                        memoization_state.$memoization_state$.bind(local_state, thread);
                        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                        try {
                            SubLObject valid;
                            for (SubLObject done_var = (SubLObject)sksi_batch_translate.NIL; sksi_batch_translate.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(sksi_batch_translate.NIL == valid)) {
                                thread.resetMultipleValues();
                                final SubLObject raw_tuple = iteration.iteration_next(raw_iterator);
                                valid = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (sksi_batch_translate.NIL != valid) {
                                    final SubLObject ist_sentence = sksi_translate_one_raw_tuple_to_ist_logical_sentence(raw_tuple, content_mt, physical_schema, logical_schema, meta_mt, check_wff_nessP, assert_as_you_goP);
                                    if (sksi_batch_translate.NIL != ist_sentence) {
                                        sentences = (SubLObject)ConsesLow.cons(ist_sentence, sentences);
                                    }
                                }
                            }
                        }
                        finally {
                            final SubLObject _prev_bind_0_$38 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_batch_translate.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$38, thread);
                            }
                        }
                    }
                    finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0_$37, thread);
                    }
                }
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return Sequences.nreverse(sentences);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 28165L)
    public static SubLObject sksi_translate_simple_sk_source_to_stream(final SubLObject simple_sk_source, final SubLObject physical_schema, final SubLObject logical_schema, final SubLObject meta_mt, SubLObject stream, SubLObject check_wff_nessP, SubLObject start_row, SubLObject end_row) {
        if (stream == sksi_batch_translate.UNPROVIDED) {
            stream = StreamsLow.$standard_output$.getDynamicValue();
        }
        if (check_wff_nessP == sksi_batch_translate.UNPROVIDED) {
            check_wff_nessP = (SubLObject)sksi_batch_translate.NIL;
        }
        if (start_row == sksi_batch_translate.UNPROVIDED) {
            start_row = (SubLObject)sksi_batch_translate.ZERO_INTEGER;
        }
        if (end_row == sksi_batch_translate.UNPROVIDED) {
            end_row = (SubLObject)sksi_batch_translate.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(meta_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject content_mt = sksi_kb_accessors.sk_source_content_mt(simple_sk_source);
            if (sksi_batch_translate.NIL != content_mt) {
                final SubLObject raw_iterator = new_sk_source_row_iterator(simple_sk_source, physical_schema, meta_mt, start_row, end_row, (SubLObject)sksi_batch_translate.UNPROVIDED);
                if (sksi_batch_translate.NIL != iteration.iterator_p(raw_iterator)) {
                    final SubLObject local_state;
                    final SubLObject state = local_state = memoization_state.possibly_new_memoization_state();
                    final SubLObject _prev_bind_0_$39 = memoization_state.$memoization_state$.currentBinding(thread);
                    try {
                        memoization_state.$memoization_state$.bind(local_state, thread);
                        final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                        try {
                            PrintLow.format(stream, (SubLObject)sksi_batch_translate.$str29$____Translation_Time____A__, numeric_date_utilities.timestring((SubLObject)sksi_batch_translate.UNPROVIDED));
                            PrintLow.format(stream, (SubLObject)sksi_batch_translate.$str30$_____);
                            PrintLow.format(stream, (SubLObject)sksi_batch_translate.$str31$___Meta_Mt_____________S__, meta_mt);
                            PrintLow.format(stream, (SubLObject)sksi_batch_translate.$str32$___Source______________S__, simple_sk_source);
                            PrintLow.format(stream, (SubLObject)sksi_batch_translate.$str33$___Physical_Schema_____S__, physical_schema);
                            PrintLow.format(stream, (SubLObject)sksi_batch_translate.$str34$___Logical_Schema______S__, logical_schema);
                            PrintLow.format(stream, (SubLObject)sksi_batch_translate.$str30$_____);
                            PrintLow.format(stream, (SubLObject)sksi_batch_translate.$str35$___Content_Mt__________S, content_mt);
                            SubLObject valid;
                            for (SubLObject done_var = (SubLObject)sksi_batch_translate.NIL; sksi_batch_translate.NIL == done_var; done_var = (SubLObject)SubLObjectFactory.makeBoolean(sksi_batch_translate.NIL == valid)) {
                                thread.resetMultipleValues();
                                final SubLObject raw_tuple = iteration.iteration_next(raw_iterator);
                                valid = thread.secondMultipleValue();
                                thread.resetMultipleValues();
                                if (sksi_batch_translate.NIL != valid) {
                                    final SubLObject _prev_bind_0_$40 = print_high.$print_pretty$.currentBinding(thread);
                                    try {
                                        print_high.$print_pretty$.bind((SubLObject)sksi_batch_translate.NIL, thread);
                                        PrintLow.format(stream, (SubLObject)sksi_batch_translate.$str36$________S_, raw_tuple);
                                    }
                                    finally {
                                        print_high.$print_pretty$.rebind(_prev_bind_0_$40, thread);
                                    }
                                    final SubLObject ist_sentence = sksi_translate_one_raw_tuple_to_ist_logical_sentence(raw_tuple, content_mt, physical_schema, logical_schema, meta_mt, check_wff_nessP, (SubLObject)sksi_batch_translate.UNPROVIDED);
                                    if (sksi_batch_translate.NIL != ist_sentence) {
                                        format_cycl_expression.format_cycl_expression(ist_sentence, stream, (SubLObject)sksi_batch_translate.UNPROVIDED);
                                    }
                                }
                            }
                            streams_high.terpri(stream);
                        }
                        finally {
                            final SubLObject _prev_bind_0_$41 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                            try {
                                Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_batch_translate.T, thread);
                                final SubLObject _values = Values.getValuesAsVector();
                                memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                                Values.restoreValuesFromVector(_values);
                            }
                            finally {
                                Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$41, thread);
                            }
                        }
                    }
                    finally {
                        memoization_state.$memoization_state$.rebind(_prev_bind_0_$39, thread);
                    }
                }
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return (SubLObject)sksi_batch_translate.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 29874L)
    public static SubLObject sksi_translate_simple_sk_source_to_file(final SubLObject filename, final SubLObject sk_source, final SubLObject physical_schema, final SubLObject logical_schema, final SubLObject meta_mt, SubLObject check_wff_nessP, SubLObject start_row, SubLObject end_row) {
        if (check_wff_nessP == sksi_batch_translate.UNPROVIDED) {
            check_wff_nessP = (SubLObject)sksi_batch_translate.NIL;
        }
        if (start_row == sksi_batch_translate.UNPROVIDED) {
            start_row = (SubLObject)sksi_batch_translate.ZERO_INTEGER;
        }
        if (end_row == sksi_batch_translate.UNPROVIDED) {
            end_row = (SubLObject)sksi_batch_translate.NIL;
        }
        SubLObject stream = (SubLObject)sksi_batch_translate.NIL;
        try {
            stream = compatibility.open_text(filename, (SubLObject)sksi_batch_translate.$kw12$OUTPUT);
            if (!stream.isStream()) {
                Errors.error((SubLObject)sksi_batch_translate.$str13$Unable_to_open__S, filename);
            }
            final SubLObject stream_$42 = stream;
            sksi_translate_simple_sk_source_to_stream(sk_source, physical_schema, logical_schema, meta_mt, stream_$42, check_wff_nessP, start_row, end_row);
        }
        finally {
            final SubLObject _prev_bind_0 = Dynamic.currentBinding(Threads.$is_thread_performing_cleanupP$);
            try {
                Dynamic.bind(Threads.$is_thread_performing_cleanupP$, (SubLObject)sksi_batch_translate.T);
                final SubLObject _values = Values.getValuesAsVector();
                if (stream.isStream()) {
                    streams_high.close(stream, (SubLObject)sksi_batch_translate.UNPROVIDED);
                }
                Values.restoreValuesFromVector(_values);
            }
            finally {
                Dynamic.rebind(Threads.$is_thread_performing_cleanupP$, _prev_bind_0);
            }
        }
        return (SubLObject)sksi_batch_translate.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 30603L)
    public static SubLObject new_sksi_translate_iterator(final SubLObject sk_source, final SubLObject physical_schema, final SubLObject logical_schema, final SubLObject meta_mt, SubLObject check_wff_nessP, SubLObject start_row, SubLObject end_row) {
        if (check_wff_nessP == sksi_batch_translate.UNPROVIDED) {
            check_wff_nessP = (SubLObject)sksi_batch_translate.NIL;
        }
        if (start_row == sksi_batch_translate.UNPROVIDED) {
            start_row = (SubLObject)sksi_batch_translate.ZERO_INTEGER;
        }
        if (end_row == sksi_batch_translate.UNPROVIDED) {
            end_row = (SubLObject)sksi_batch_translate.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject enumerable_schemaP = (SubLObject)sksi_batch_translate.NIL;
        SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(meta_mt);
        SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            enumerable_schemaP = sksi_kb_accessors.physical_schema_enumerableP(physical_schema);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        if (sksi_batch_translate.NIL == enumerable_schemaP) {
            return (SubLObject)sksi_batch_translate.NIL;
        }
        SubLObject content_mt = (SubLObject)sksi_batch_translate.NIL;
        mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(meta_mt);
        _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            content_mt = sksi_kb_accessors.sk_source_content_mt(sk_source);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return iteration.new_iterator(make_sksi_translate_iterator_state(sk_source, physical_schema, logical_schema, content_mt, meta_mt, check_wff_nessP, start_row, end_row), (SubLObject)sksi_batch_translate.$sym37$SKSI_TRANSLATE_ITERATE_DONE, (SubLObject)sksi_batch_translate.$sym38$SKSI_TRANSLATE_ITERATE_NEXT, (SubLObject)sksi_batch_translate.$sym39$BOOLEAN);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 31958L)
    public static SubLObject make_sksi_translate_iterator_state(final SubLObject sk_source, final SubLObject physical_schema, final SubLObject logical_schema, final SubLObject content_mt, final SubLObject meta_mt, final SubLObject check_wff_nessP, final SubLObject start_row, final SubLObject end_row) {
        final SubLObject tuple_iterator = new_sk_source_row_iterator(sk_source, physical_schema, meta_mt, start_row, end_row, (SubLObject)sksi_batch_translate.UNPROVIDED);
        final SubLObject v_memoization_state = memoization_state.new_memoization_state((SubLObject)sksi_batch_translate.UNPROVIDED, (SubLObject)sksi_batch_translate.UNPROVIDED, (SubLObject)sksi_batch_translate.UNPROVIDED, (SubLObject)sksi_batch_translate.UNPROVIDED);
        return (SubLObject)ConsesLow.list(tuple_iterator, v_memoization_state, physical_schema, logical_schema, content_mt, meta_mt, check_wff_nessP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 32396L)
    public static SubLObject sksi_translate_iterate_done(final SubLObject state) {
        SubLObject tuple_iterator = (SubLObject)sksi_batch_translate.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)sksi_batch_translate.$list40);
        tuple_iterator = state.first();
        final SubLObject rest;
        final SubLObject current = rest = state.rest();
        return Equality.eq((SubLObject)sksi_batch_translate.$kw41$DONE, tuple_iterator);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 32562L)
    public static SubLObject sksi_translate_iterate_next(final SubLObject state) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject tuple_iterator = (SubLObject)sksi_batch_translate.NIL;
        SubLObject v_memoization_state = (SubLObject)sksi_batch_translate.NIL;
        SubLObject physical_schema = (SubLObject)sksi_batch_translate.NIL;
        SubLObject logical_schema = (SubLObject)sksi_batch_translate.NIL;
        SubLObject content_mt = (SubLObject)sksi_batch_translate.NIL;
        SubLObject meta_mt = (SubLObject)sksi_batch_translate.NIL;
        SubLObject check_wff_nessP = (SubLObject)sksi_batch_translate.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(state, state, (SubLObject)sksi_batch_translate.$list42);
        tuple_iterator = state.first();
        SubLObject current = state.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)sksi_batch_translate.$list42);
        v_memoization_state = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)sksi_batch_translate.$list42);
        physical_schema = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)sksi_batch_translate.$list42);
        logical_schema = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)sksi_batch_translate.$list42);
        content_mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)sksi_batch_translate.$list42);
        meta_mt = current.first();
        current = current.rest();
        cdestructuring_bind.destructuring_bind_must_consp(current, state, (SubLObject)sksi_batch_translate.$list42);
        check_wff_nessP = current.first();
        current = current.rest();
        if (sksi_batch_translate.NIL != current) {
            cdestructuring_bind.cdestructuring_bind_error(state, (SubLObject)sksi_batch_translate.$list42);
            return (SubLObject)sksi_batch_translate.NIL;
        }
        thread.resetMultipleValues();
        final SubLObject raw_tuple = iteration.iteration_next(tuple_iterator);
        final SubLObject valid = thread.secondMultipleValue();
        thread.resetMultipleValues();
        if (sksi_batch_translate.NIL == valid) {
            final SubLObject update = (SubLObject)sksi_batch_translate.$kw41$DONE;
            ConsesLow.rplaca(state, update);
            ConsesLow.rplacd(state, (SubLObject)sksi_batch_translate.NIL);
            return Values.values((SubLObject)sksi_batch_translate.NIL, state, (SubLObject)sksi_batch_translate.T);
        }
        SubLObject logical_sentence = (SubLObject)sksi_batch_translate.NIL;
        final SubLObject local_state = v_memoization_state;
        final SubLObject _prev_bind_0 = memoization_state.$memoization_state$.currentBinding(thread);
        try {
            memoization_state.$memoization_state$.bind(local_state, thread);
            final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
            try {
                logical_sentence = sksi_translate_one_raw_tuple_to_logical_sentence(raw_tuple, physical_schema, logical_schema, content_mt, meta_mt, check_wff_nessP);
            }
            finally {
                final SubLObject _prev_bind_0_$43 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                try {
                    Threads.$is_thread_performing_cleanupP$.bind((SubLObject)sksi_batch_translate.T, thread);
                    final SubLObject _values = Values.getValuesAsVector();
                    memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                    Values.restoreValuesFromVector(_values);
                }
                finally {
                    Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$43, thread);
                }
            }
        }
        finally {
            memoization_state.$memoization_state$.rebind(_prev_bind_0, thread);
        }
        return Values.values(logical_sentence, state, (SubLObject)sksi_batch_translate.NIL);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 33329L)
    public static SubLObject sksi_translate_one_raw_tuple_to_ist_logical_sentence(final SubLObject raw_tuple, final SubLObject content_mt, final SubLObject physical_schema, final SubLObject logical_schema, final SubLObject meta_mt, SubLObject check_wff_nessP, SubLObject assert_as_you_goP) {
        if (check_wff_nessP == sksi_batch_translate.UNPROVIDED) {
            check_wff_nessP = (SubLObject)sksi_batch_translate.NIL;
        }
        if (assert_as_you_goP == sksi_batch_translate.UNPROVIDED) {
            assert_as_you_goP = (SubLObject)sksi_batch_translate.NIL;
        }
        final SubLObject logical_sentence = sksi_translate_one_raw_tuple_to_logical_sentence(raw_tuple, physical_schema, logical_schema, content_mt, meta_mt, check_wff_nessP);
        if (sksi_batch_translate.NIL != logical_sentence) {
            final SubLObject el_sentence = fi.perform_fi_substitutions(logical_sentence, (SubLObject)sksi_batch_translate.UNPROVIDED);
            final SubLObject ist_sentence = el_utilities.make_binary_formula(sksi_batch_translate.$const43$ist, content_mt, el_sentence);
            possibly_remember_primary_key_that_resulted_in_raw_tuple(raw_tuple, el_sentence);
            if (sksi_batch_translate.NIL != assert_as_you_goP) {
                final SubLObject target_mt = cycl_utilities.sentence_arg1(ist_sentence, (SubLObject)sksi_batch_translate.UNPROVIDED);
                final SubLObject sentence_to_be_asserted = cycl_utilities.sentence_arg2(ist_sentence, (SubLObject)sksi_batch_translate.UNPROVIDED);
                sksi_batch_assert_sentence_with_deduced_argument_assuming_table(sentence_to_be_asserted, target_mt, meta_mt);
            }
            return ist_sentence;
        }
        return (SubLObject)sksi_batch_translate.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 34768L)
    public static SubLObject sksi_translate_one_raw_tuple_to_logical_sentence(final SubLObject raw_tuple, final SubLObject physical_schema, final SubLObject logical_schema, final SubLObject content_mt, final SubLObject meta_mt, SubLObject check_wff_nessP) {
        if (check_wff_nessP == sksi_batch_translate.UNPROVIDED) {
            check_wff_nessP = (SubLObject)sksi_batch_translate.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)sksi_batch_translate.NIL;
        final SubLObject batch_template = sksi_batch_template_lookup(physical_schema, logical_schema, content_mt);
        final SubLObject _prev_bind_0 = sksi_batch_translate.$current_sksi_batch_template$.currentBinding(thread);
        final SubLObject _prev_bind_2 = sksi_batch_translate.$sksi_batch_translate_type_coercion_successfulP$.currentBinding(thread);
        try {
            sksi_batch_translate.$current_sksi_batch_template$.bind(batch_template, thread);
            sksi_batch_translate.$sksi_batch_translate_type_coercion_successfulP$.bind((SubLObject)sksi_batch_translate.NIL, thread);
            final SubLObject logical_sentence = sksi_translate_one_raw_tuple_to_logical_sentence_int(raw_tuple, physical_schema, logical_schema, content_mt, meta_mt);
            result = sksi_postprocess_translated_sentence(logical_sentence, raw_tuple, physical_schema, logical_schema, content_mt, check_wff_nessP);
            if (sksi_batch_translate.NIL != misc_utilities.uninitialized_p(batch_template)) {
                remember_batch_template_for_future_use(logical_sentence, content_mt, physical_schema, logical_schema);
            }
        }
        finally {
            sksi_batch_translate.$sksi_batch_translate_type_coercion_successfulP$.rebind(_prev_bind_2, thread);
            sksi_batch_translate.$current_sksi_batch_template$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 35898L)
    public static SubLObject sksi_translate_one_raw_tuple_to_logical_sentence_int(final SubLObject raw_tuple, final SubLObject physical_schema, final SubLObject logical_schema, final SubLObject content_mt, final SubLObject meta_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_batch_translate.NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP((SubLObject)sksi_batch_translate.THREE_INTEGER)) {
            PrintLow.format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), Sequences.cconcatenate((SubLObject)sksi_batch_translate.$str44$__SKSI__A_, (SubLObject)sksi_batch_translate.$str45$__a__Translating__s_wrt__a__a__a_), new SubLObject[] { sksi_batch_translate.THREE_INTEGER, numeric_date_utilities.timestring((SubLObject)sksi_batch_translate.UNPROVIDED), raw_tuple, physical_schema, logical_schema, meta_mt, content_mt });
            streams_high.force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
        }
        SubLObject logical_sentence = (SubLObject)sksi_batch_translate.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(meta_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            thread.resetMultipleValues();
            final SubLObject raw_sentence = sksi_translate_raw_tuple(raw_tuple, physical_schema);
            final SubLObject relevant_pf_indexicals = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (sksi_batch_translate.NIL != raw_sentence) {
                if (sksi_batch_translate.NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP((SubLObject)sksi_batch_translate.FOUR_INTEGER)) {
                    PrintLow.format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), Sequences.cconcatenate((SubLObject)sksi_batch_translate.$str44$__SKSI__A_, (SubLObject)sksi_batch_translate.$str46$Raw_sentence___s), (SubLObject)sksi_batch_translate.FOUR_INTEGER, raw_sentence);
                    streams_high.force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
                }
                thread.resetMultipleValues();
                final SubLObject decoded_sentence = sksi_translate_raw_sentence(raw_sentence, physical_schema, relevant_pf_indexicals, logical_schema, content_mt);
                final SubLObject relevant_logical_field_indexicals = thread.secondMultipleValue();
                thread.resetMultipleValues();
                if (sksi_batch_translate.NIL != decoded_sentence) {
                    if (sksi_batch_translate.NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP((SubLObject)sksi_batch_translate.FOUR_INTEGER)) {
                        PrintLow.format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), Sequences.cconcatenate((SubLObject)sksi_batch_translate.$str44$__SKSI__A_, (SubLObject)sksi_batch_translate.$str47$Decoded_sentence___s), (SubLObject)sksi_batch_translate.FOUR_INTEGER, decoded_sentence);
                        streams_high.force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
                    }
                    logical_sentence = sksi_translate_decoded_sentence(decoded_sentence, logical_schema, relevant_logical_field_indexicals, content_mt, meta_mt);
                }
            }
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return logical_sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 36917L)
    public static SubLObject sksi_postprocess_translated_sentence(final SubLObject logical_sentence, final SubLObject raw_tuple, final SubLObject physical_schema, final SubLObject logical_schema, final SubLObject content_mt, final SubLObject check_wff_nessP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_batch_translate.NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP((SubLObject)sksi_batch_translate.FOUR_INTEGER)) {
            PrintLow.format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), Sequences.cconcatenate((SubLObject)sksi_batch_translate.$str44$__SKSI__A_, (SubLObject)sksi_batch_translate.$str48$Logical_sentence___s), (SubLObject)sksi_batch_translate.FOUR_INTEGER, logical_sentence);
            streams_high.force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
        }
        SubLObject processed_sentences = (SubLObject)sksi_batch_translate.NIL;
        SubLObject cdolist_list_var = cycl_utilities.possibly_conjuncts(logical_sentence);
        SubLObject conjunct = (SubLObject)sksi_batch_translate.NIL;
        conjunct = cdolist_list_var.first();
        while (sksi_batch_translate.NIL != cdolist_list_var) {
            if (!conjunct.equal(logical_sentence) && sksi_batch_translate.NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP((SubLObject)sksi_batch_translate.FOUR_INTEGER)) {
                PrintLow.format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), Sequences.cconcatenate((SubLObject)sksi_batch_translate.$str44$__SKSI__A_, (SubLObject)sksi_batch_translate.$str49$Logical_conjunct___s), (SubLObject)sksi_batch_translate.FOUR_INTEGER, conjunct);
                streams_high.force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
            }
            final SubLObject var;
            final SubLObject processed_sentence = var = sksi_postprocess_translated_asent(raw_tuple, physical_schema, logical_schema, conjunct, content_mt, check_wff_nessP);
            if (sksi_batch_translate.NIL != var) {
                processed_sentences = (SubLObject)ConsesLow.cons(var, processed_sentences);
            }
            cdolist_list_var = cdolist_list_var.rest();
            conjunct = cdolist_list_var.first();
        }
        final SubLObject result = simplifier.possibly_conjoin(Sequences.nreverse(processed_sentences), (SubLObject)sksi_batch_translate.UNPROVIDED);
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 37599L)
    public static SubLObject sksi_postprocess_translated_asent(final SubLObject raw_tuple, final SubLObject physical_schema, final SubLObject logical_schema, SubLObject logical_sentence, final SubLObject content_mt, final SubLObject check_wff_nessP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        logical_sentence = sksi_remove_untranslatable(logical_sentence);
        if (sksi_batch_translate.NIL == logical_sentence) {
            if (sksi_batch_translate.NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP((SubLObject)sksi_batch_translate.THREE_INTEGER)) {
                PrintLow.format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), Sequences.cconcatenate((SubLObject)sksi_batch_translate.$str44$__SKSI__A_, (SubLObject)sksi_batch_translate.$str50$Skipped_due_to_wholly_untranslata), (SubLObject)sksi_batch_translate.THREE_INTEGER);
                streams_high.force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
            }
            return (SubLObject)sksi_batch_translate.NIL;
        }
        logical_sentence = sksi_remove_unreformulatable(logical_sentence);
        if (sksi_batch_translate.NIL != kb_utilities.kbeq(sksi_batch_translate.$const51$True, logical_sentence)) {
            if (sksi_batch_translate.NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP((SubLObject)sksi_batch_translate.THREE_INTEGER)) {
                PrintLow.format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), Sequences.cconcatenate((SubLObject)sksi_batch_translate.$str44$__SKSI__A_, (SubLObject)sksi_batch_translate.$str52$Skipped_due_to_tautology_), (SubLObject)sksi_batch_translate.THREE_INTEGER);
                streams_high.force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
            }
            return (SubLObject)sksi_batch_translate.NIL;
        }
        if (sksi_batch_translate.NIL == logical_sentence) {
            if (sksi_batch_translate.NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP((SubLObject)sksi_batch_translate.THREE_INTEGER)) {
                PrintLow.format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), Sequences.cconcatenate((SubLObject)sksi_batch_translate.$str44$__SKSI__A_, (SubLObject)sksi_batch_translate.$str53$Skipped_due_to_unreformulatable_), (SubLObject)sksi_batch_translate.THREE_INTEGER);
                streams_high.force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
            }
            return (SubLObject)sksi_batch_translate.NIL;
        }
        thread.resetMultipleValues();
        final SubLObject result = sksi_wff_check_batch_translated_sentence(logical_sentence, content_mt, check_wff_nessP);
        SubLObject why_not_wff_format_string = thread.secondMultipleValue();
        final SubLObject why_not_wff_explanation = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        if (sksi_batch_translate.NIL != result) {
            if (sksi_batch_translate.NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP((SubLObject)sksi_batch_translate.THREE_INTEGER)) {
                PrintLow.format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), Sequences.cconcatenate((SubLObject)sksi_batch_translate.$str44$__SKSI__A_, (SubLObject)sksi_batch_translate.$str54$Translation___s), (SubLObject)sksi_batch_translate.THREE_INTEGER, result);
                streams_high.force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
            }
        }
        else {
            if (sksi_batch_translate.NIL == why_not_wff_format_string) {
                why_not_wff_format_string = (SubLObject)sksi_batch_translate.$str55$skipped_for_an_unknown_reason___a;
            }
            why_not_wff_format_string = Sequences.cconcatenate((SubLObject)sksi_batch_translate.$str56$The_raw_tuple__S_using_the_physic, why_not_wff_format_string);
            if (sksi_batch_translate.NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP((SubLObject)sksi_batch_translate.TWO_INTEGER)) {
                PrintLow.format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), Sequences.cconcatenate((SubLObject)sksi_batch_translate.$str44$__SKSI__A_, why_not_wff_format_string), new SubLObject[] { sksi_batch_translate.TWO_INTEGER, raw_tuple, physical_schema, logical_schema, logical_sentence, content_mt, why_not_wff_explanation });
                streams_high.force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
            }
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 39081L)
    public static SubLObject sksi_wff_check_batch_translated_sentence(final SubLObject logical_sentence, final SubLObject content_mt, final SubLObject check_wff_nessP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)sksi_batch_translate.NIL;
        SubLObject why_not_wff_format_string = (SubLObject)sksi_batch_translate.NIL;
        SubLObject why_not_wff_explanation = (SubLObject)sksi_batch_translate.NIL;
        if (sksi_batch_translate.NIL != forts.fort_p(cycl_utilities.formula_operator(logical_sentence))) {
            final SubLObject _prev_bind_0 = at_vars.$at_additional_defn_checking$.currentBinding(thread);
            try {
                at_vars.$at_additional_defn_checking$.bind((SubLObject)sksi_batch_translate.NIL, thread);
                if (sksi_batch_translate.NIL != sksi_batch_translate_coerce_typesP()) {
                    final SubLObject explanation = at_admitted.explanation_of_why_not_admitted_sentence_wrt_asent_arg_constraints(logical_sentence, content_mt);
                    if (sksi_batch_translate.NIL != explanation) {
                        final SubLObject explanation_of_why_not_wff_func = (SubLObject)((sksi_batch_translate.NIL != check_wff_nessP) ? sksi_batch_translate.$sym57$EXPLANATION_OF_WHY_NOT_WFF_ASSERT : sksi_batch_translate.$sym58$EXPLANATION_OF_WHY_NOT_ADMITTED_SENTENCE_WRT_ASENT_ARG_CONSTRAINT);
                        thread.resetMultipleValues();
                        final SubLObject simplified_sentence = simplifier.cycl_coerce_types(logical_sentence, content_mt, explanation_of_why_not_wff_func);
                        final SubLObject simplified_explanation = thread.secondMultipleValue();
                        thread.resetMultipleValues();
                        if (sksi_batch_translate.NIL != simplified_sentence) {
                            result = simplified_sentence;
                            if (sksi_batch_translate.NIL == sksi_batch_translate.$sksi_batch_translate_type_coercion_successfulP$.getDynamicValue(thread)) {
                                sksi_batch_translate.$sksi_batch_translate_type_coercion_successfulP$.setDynamicValue((SubLObject)sksi_batch_translate.T, thread);
                            }
                        }
                        else if (sksi_batch_translate.NIL != simplified_explanation) {
                            why_not_wff_format_string = (SubLObject)sksi_batch_translate.$str59$skipped_due_to_ill_formedness__ty;
                            why_not_wff_explanation = simplified_explanation;
                        }
                        else {
                            why_not_wff_format_string = (SubLObject)sksi_batch_translate.$str60$skipped_due_to_ill_formedness__ty;
                            why_not_wff_explanation = explanation;
                        }
                    }
                    else {
                        final SubLObject stricter_explanation = (SubLObject)((sksi_batch_translate.NIL != check_wff_nessP) ? wff.explanation_of_why_not_wff_assert(logical_sentence, content_mt, (SubLObject)sksi_batch_translate.UNPROVIDED) : sksi_batch_translate.NIL);
                        if (sksi_batch_translate.NIL != stricter_explanation) {
                            why_not_wff_format_string = (SubLObject)sksi_batch_translate.$str61$skipped_due_to_ill_formedness__ty;
                            why_not_wff_explanation = stricter_explanation;
                        }
                        else {
                            result = logical_sentence;
                        }
                    }
                }
                else {
                    final SubLObject explanation = (SubLObject)((sksi_batch_translate.NIL != check_wff_nessP) ? wff.explanation_of_why_not_wff_assert(logical_sentence, content_mt, (SubLObject)sksi_batch_translate.UNPROVIDED) : sksi_batch_translate.NIL);
                    if (sksi_batch_translate.NIL != explanation) {
                        why_not_wff_format_string = (SubLObject)sksi_batch_translate.$str62$skipped_due_to_ill_formedness___a;
                        why_not_wff_explanation = explanation;
                    }
                    else {
                        result = logical_sentence;
                    }
                }
            }
            finally {
                at_vars.$at_additional_defn_checking$.rebind(_prev_bind_0, thread);
            }
        }
        else {
            why_not_wff_format_string = (SubLObject)sksi_batch_translate.$str63$skipped_due_to_an_invalid_predica;
            why_not_wff_explanation = string_utilities.str(cycl_utilities.formula_operator(logical_sentence));
        }
        return Values.values(result, why_not_wff_format_string, why_not_wff_explanation);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 41535L)
    public static SubLObject sksi_remove_untranslatable(final SubLObject sentence) {
        if (sksi_batch_translate.NIL == el_utilities.atomic_sentenceP(sentence)) {
            SubLObject results = (SubLObject)sksi_batch_translate.NIL;
            SubLObject cdolist_list_var;
            final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(sentence, (SubLObject)sksi_batch_translate.$kw64$IGNORE);
            SubLObject sub_sentence = (SubLObject)sksi_batch_translate.NIL;
            sub_sentence = cdolist_list_var.first();
            while (sksi_batch_translate.NIL != cdolist_list_var) {
                if (sksi_batch_translate.NIL == sentence_contains_untranslatableP(sub_sentence)) {
                    results = (SubLObject)ConsesLow.cons(sub_sentence, results);
                }
                cdolist_list_var = cdolist_list_var.rest();
                sub_sentence = cdolist_list_var.first();
            }
            return el_utilities.make_conjunction(results);
        }
        if (sksi_batch_translate.NIL == sentence_contains_untranslatableP(sentence)) {
            return sentence;
        }
        return (SubLObject)sksi_batch_translate.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 41970L)
    public static SubLObject sentence_contains_untranslatableP(final SubLObject sentence) {
        return cycl_utilities.expression_find((SubLObject)sksi_batch_translate.$kw65$UNTRANSLATABLE, sentence, (SubLObject)sksi_batch_translate.UNPROVIDED, (SubLObject)sksi_batch_translate.UNPROVIDED, (SubLObject)sksi_batch_translate.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 42153L)
    public static SubLObject sksi_remove_unreformulatable(final SubLObject sentence) {
        if (sksi_batch_translate.NIL == el_utilities.atomic_sentenceP(sentence)) {
            SubLObject results = (SubLObject)sksi_batch_translate.NIL;
            SubLObject cdolist_list_var;
            final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(sentence, (SubLObject)sksi_batch_translate.$kw64$IGNORE);
            SubLObject sub_sentence = (SubLObject)sksi_batch_translate.NIL;
            sub_sentence = cdolist_list_var.first();
            while (sksi_batch_translate.NIL != cdolist_list_var) {
                if (sksi_batch_translate.NIL == sentence_contains_unreformulatableP(sub_sentence)) {
                    results = (SubLObject)ConsesLow.cons(sub_sentence, results);
                }
                cdolist_list_var = cdolist_list_var.rest();
                sub_sentence = cdolist_list_var.first();
            }
            return el_utilities.make_conjunction(results);
        }
        if (sksi_batch_translate.NIL == sentence_contains_unreformulatableP(sentence)) {
            return sentence;
        }
        return (SubLObject)sksi_batch_translate.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 42579L)
    public static SubLObject sentence_contains_unreformulatableP(final SubLObject sentence) {
        return (SubLObject)SubLObjectFactory.makeBoolean(sksi_batch_translate.NIL != cycl_utilities.expression_find((SubLObject)sksi_batch_translate.$kw66$UNREFORMULATABLE, sentence, (SubLObject)sksi_batch_translate.UNPROVIDED, (SubLObject)sksi_batch_translate.UNPROVIDED, (SubLObject)sksi_batch_translate.UNPROVIDED) || sksi_batch_translate.NIL != cycl_utilities.expression_find((SubLObject)sksi_batch_translate.$kw67$NULL, sentence, (SubLObject)sksi_batch_translate.UNPROVIDED, (SubLObject)sksi_batch_translate.UNPROVIDED, (SubLObject)sksi_batch_translate.UNPROVIDED));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 42815L)
    public static SubLObject sksi_translate_raw_tuple(final SubLObject raw_tuple, final SubLObject physical_schema) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject translation_pattern = sksi_raw_tuple_translation_pattern(physical_schema);
        final SubLObject pf_indexicals = thread.secondMultipleValue();
        thread.resetMultipleValues();
        final SubLObject raw_sentence = pattern_match.pattern_transform_tree(translation_pattern, raw_tuple, (SubLObject)sksi_batch_translate.UNPROVIDED);
        return Values.values(raw_sentence, pf_indexicals);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 43216L)
    public static SubLObject sksi_translate_raw_sentence(final SubLObject raw_sentence, final SubLObject physical_schema, final SubLObject relevant_pf_indexicals, final SubLObject logical_schema, final SubLObject content_mt) {
        final SubLObject translation_pattern = sksi_raw_sentence_translation_pattern(physical_schema, relevant_pf_indexicals, logical_schema, content_mt);
        final SubLObject decoded_sentence = formula_pattern_match.pattern_transform_formula(translation_pattern, raw_sentence, (SubLObject)sksi_batch_translate.UNPROVIDED);
        final SubLObject relevant_logical_field_indexicals = sksi_logical_field_indexicals_of_decoded_sentence(decoded_sentence);
        return Values.values(decoded_sentence, relevant_logical_field_indexicals);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 43836L)
    public static SubLObject sksi_translate_decoded_sentence(final SubLObject decoded_sentence, final SubLObject logical_schema, final SubLObject relevant_logical_field_indexicals, final SubLObject content_mt, final SubLObject meta_mt) {
        final SubLObject translation_pattern = sksi_decoded_sentence_translation_pattern(logical_schema, relevant_logical_field_indexicals, decoded_sentence, content_mt, meta_mt);
        final SubLObject logical_sentence = formula_pattern_match.pattern_transform_formula(translation_pattern, decoded_sentence, (SubLObject)sksi_batch_translate.UNPROVIDED);
        return logical_sentence;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 44879L)
    public static SubLObject new_sk_source_row_iterator(final SubLObject sk_source, final SubLObject physical_schema, final SubLObject meta_mt, SubLObject start_row, SubLObject end_row, SubLObject specified_physical_fields) {
        if (start_row == sksi_batch_translate.UNPROVIDED) {
            start_row = (SubLObject)sksi_batch_translate.ZERO_INTEGER;
        }
        if (end_row == sksi_batch_translate.UNPROVIDED) {
            end_row = (SubLObject)sksi_batch_translate.NIL;
        }
        if (specified_physical_fields == sksi_batch_translate.UNPROVIDED) {
            specified_physical_fields = (SubLObject)sksi_batch_translate.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject el_sk_source = cycl_utilities.hl_to_el(sk_source);
        if (sksi_batch_translate.NIL != list_utilities.alist_has_keyP(sksi_batch_translate.$sksi_row_iterator_overrides$.getDynamicValue(thread), el_sk_source, Symbols.symbol_function((SubLObject)sksi_batch_translate.EQUAL))) {
            final SubLObject overrides = list_utilities.alist_lookup(sksi_batch_translate.$sksi_row_iterator_overrides$.getDynamicValue(thread), el_sk_source, Symbols.symbol_function((SubLObject)sksi_batch_translate.EQUAL), (SubLObject)sksi_batch_translate.UNPROVIDED);
            return iteration.new_list_iterator(overrides);
        }
        if (sksi_batch_translate.NIL != sksi_batch_translate.$sksi_batch_sql_select_statement$.getDynamicValue(thread)) {
            return sksi_sks_interaction.get_rs_iterator_for_sql_query_from_db_sks(sk_source, sksi_batch_translate.$sksi_batch_sql_select_statement$.getDynamicValue(thread), meta_mt);
        }
        SubLObject input_iterator = (SubLObject)sksi_batch_translate.NIL;
        final SubLObject mt_var = mt_relevance_macros.with_inference_mt_relevance_validate(meta_mt);
        final SubLObject _prev_bind_0 = mt_relevance_macros.$mt$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_3 = mt_relevance_macros.$relevant_mts$.currentBinding(thread);
        try {
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.update_inference_mt_relevance_mt(mt_var), thread);
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.update_inference_mt_relevance_function(mt_var), thread);
            mt_relevance_macros.$relevant_mts$.bind(mt_relevance_macros.update_inference_mt_relevance_mt_list(mt_var), thread);
            final SubLObject physical_fields = (sksi_batch_translate.NIL != specified_physical_fields) ? specified_physical_fields : sksi_kb_accessors.physical_schema_ordered_field_list(physical_schema);
            final SubLObject physical_field_indexicals = sksi_kb_accessors.indexicals_for_physical_fields(physical_fields);
            final SubLObject csql = sksi_csql_generation.sksi_determine_csql_for_batch_translate(sk_source, physical_schema, physical_field_indexicals);
            input_iterator = sksi_sks_interaction.generate_iterator_from_csql(csql, sk_source, (SubLObject)sksi_batch_translate.NIL, start_row, end_row, (SubLObject)sksi_batch_translate.$kw69$BATCH);
        }
        finally {
            mt_relevance_macros.$relevant_mts$.rebind(_prev_bind_3, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$mt$.rebind(_prev_bind_0, thread);
        }
        return input_iterator;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 46055L)
    public static SubLObject sk_source_row_iterator_next(final SubLObject iterator) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject outer_answer = (SubLObject)sksi_batch_translate.NIL;
        SubLObject outer_valid = (SubLObject)sksi_batch_translate.NIL;
        thread.resetMultipleValues();
        final SubLObject inner_answer = iteration.iteration_next(iterator);
        final SubLObject inner_valid = thread.secondMultipleValue();
        thread.resetMultipleValues();
        outer_answer = inner_answer;
        outer_valid = inner_valid;
        return Values.values(outer_answer, iterator, (SubLObject)SubLObjectFactory.makeBoolean(sksi_batch_translate.NIL == outer_valid));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 46431L)
    public static SubLObject sksi_raw_tuple_translation_pattern_internal(final SubLObject physical_schema) {
        final SubLObject physical_fields = sksi_kb_accessors.physical_schema_ordered_field_list(physical_schema);
        SubLObject pf_indexicals = sksi_kb_accessors.physical_fields_to_indexicals(physical_fields);
        SubLObject datum_vars = (SubLObject)sksi_batch_translate.NIL;
        SubLObject field_value_literals = (SubLObject)sksi_batch_translate.NIL;
        SubLObject list_var = (SubLObject)sksi_batch_translate.NIL;
        SubLObject pf_indexical = (SubLObject)sksi_batch_translate.NIL;
        SubLObject field_number = (SubLObject)sksi_batch_translate.NIL;
        list_var = pf_indexicals;
        pf_indexical = list_var.first();
        for (field_number = (SubLObject)sksi_batch_translate.ZERO_INTEGER; sksi_batch_translate.NIL != list_var; list_var = list_var.rest(), pf_indexical = list_var.first(), field_number = Numbers.add((SubLObject)sksi_batch_translate.ONE_INTEGER, field_number)) {
            final SubLObject datum_var = sksi_get_datum_var(field_number);
            datum_vars = (SubLObject)ConsesLow.cons(datum_var, datum_vars);
            if (sksi_batch_translate.NIL != pf_indexical) {
                final SubLObject field_value_literal = (SubLObject)ConsesLow.list(sksi_batch_translate.$const71$fieldValue, pf_indexical, (SubLObject)ConsesLow.list((SubLObject)sksi_batch_translate.$kw72$VALUE, datum_var));
                field_value_literals = (SubLObject)ConsesLow.cons(field_value_literal, field_value_literals);
            }
        }
        datum_vars = Sequences.nreverse(datum_vars);
        field_value_literals = Sequences.nreverse(field_value_literals);
        pf_indexicals = Sequences.delete((SubLObject)sksi_batch_translate.NIL, pf_indexicals, (SubLObject)sksi_batch_translate.UNPROVIDED, (SubLObject)sksi_batch_translate.UNPROVIDED, (SubLObject)sksi_batch_translate.UNPROVIDED, (SubLObject)sksi_batch_translate.UNPROVIDED, (SubLObject)sksi_batch_translate.UNPROVIDED);
        final SubLObject translation_pattern = (SubLObject)ConsesLow.list((SubLObject)sksi_batch_translate.$kw73$TUPLE, datum_vars, el_utilities.make_conjunction(field_value_literals));
        return Values.values(translation_pattern, pf_indexicals);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 46431L)
    public static SubLObject sksi_raw_tuple_translation_pattern(final SubLObject physical_schema) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_batch_translate.NIL;
        if (sksi_batch_translate.NIL == v_memoization_state) {
            return sksi_raw_tuple_translation_pattern_internal(physical_schema);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_batch_translate.$sym70$SKSI_RAW_TUPLE_TRANSLATION_PATTERN, (SubLObject)sksi_batch_translate.UNPROVIDED);
        if (sksi_batch_translate.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_batch_translate.$sym70$SKSI_RAW_TUPLE_TRANSLATION_PATTERN, (SubLObject)sksi_batch_translate.ONE_INTEGER, (SubLObject)sksi_batch_translate.NIL, (SubLObject)sksi_batch_translate.EQL, (SubLObject)sksi_batch_translate.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_batch_translate.$sym70$SKSI_RAW_TUPLE_TRANSLATION_PATTERN, caching_state);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, physical_schema, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(sksi_raw_tuple_translation_pattern_internal(physical_schema)));
            memoization_state.caching_state_put(caching_state, physical_schema, results, (SubLObject)sksi_batch_translate.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 48010L)
    public static SubLObject sksi_raw_sentence_translation_pattern_internal(final SubLObject physical_schema, final SubLObject pf_indexicals, final SubLObject logical_schema, final SubLObject content_mt) {
        if (physical_schema.eql(sksi_batch_translate.$const75$IMDB_MovieActors_PS) && logical_schema.eql(sksi_batch_translate.$const76$IMDB_MovieActors_LS)) {
            return Values.values((SubLObject)sksi_batch_translate.$list77, (SubLObject)sksi_batch_translate.$list78);
        }
        SubLObject raw_var_map = (SubLObject)sksi_batch_translate.NIL;
        SubLObject field_value_literals = (SubLObject)sksi_batch_translate.NIL;
        final SubLObject mapping_mt = sksi_kb_accessors.sk_source_mapping_mt(sksi_kb_accessors.content_mt_sk_source(content_mt, (SubLObject)sksi_batch_translate.UNPROVIDED));
        SubLObject list_var = (SubLObject)sksi_batch_translate.NIL;
        SubLObject pf_indexical = (SubLObject)sksi_batch_translate.NIL;
        SubLObject field_number = (SubLObject)sksi_batch_translate.NIL;
        list_var = pf_indexicals;
        pf_indexical = list_var.first();
        for (field_number = (SubLObject)sksi_batch_translate.ZERO_INTEGER; sksi_batch_translate.NIL != list_var; list_var = list_var.rest(), pf_indexical = list_var.first(), field_number = Numbers.add((SubLObject)sksi_batch_translate.ONE_INTEGER, field_number)) {
            final SubLObject pf = sksi_kb_accessors.physical_field_for_indexical(pf_indexical);
            final SubLObject raw_var = sksi_get_raw_var(field_number);
            final SubLObject field_value_literal = (SubLObject)ConsesLow.list(sksi_batch_translate.$const71$fieldValue, (SubLObject)sksi_batch_translate.$kw79$ANYTHING, (SubLObject)ConsesLow.list((SubLObject)sksi_batch_translate.$kw80$BIND, raw_var));
            if (sksi_batch_translate.NIL != physical_field_has_physical_override(pf, mapping_mt)) {
                raw_var_map = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(pf_indexical, (SubLObject)ConsesLow.list((SubLObject)sksi_batch_translate.$kw81$CALL, (SubLObject)sksi_batch_translate.$sym82$POSSIBLY_OVERRIDE_PHYSICAL_FIELD_VALUE, (SubLObject)ConsesLow.list((SubLObject)sksi_batch_translate.$kw72$VALUE, raw_var), pf, mapping_mt)), raw_var_map);
            }
            else {
                raw_var_map = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(pf_indexical, (SubLObject)ConsesLow.list((SubLObject)sksi_batch_translate.$kw72$VALUE, raw_var)), raw_var_map);
            }
            field_value_literals = (SubLObject)ConsesLow.cons(field_value_literal, field_value_literals);
        }
        raw_var_map = Sequences.nreverse(raw_var_map);
        field_value_literals = Sequences.nreverse(field_value_literals);
        final SubLObject relevant_logical_fields = sksi_kb_accessors.sksi_determine_relevant_logical_fields(Mapping.mapcar((SubLObject)sksi_batch_translate.$sym83$PHYSICAL_FIELD_FOR_INDEXICAL, pf_indexicals), physical_schema, logical_schema);
        SubLObject indexical_referent_literals = (SubLObject)sksi_batch_translate.NIL;
        SubLObject cdolist_list_var = relevant_logical_fields;
        SubLObject logical_field = (SubLObject)sksi_batch_translate.NIL;
        logical_field = cdolist_list_var.first();
        while (sksi_batch_translate.NIL != cdolist_list_var) {
            final SubLObject recipes = sksi_field_translation_utilities.relevant_field_decodings(logical_field, logical_schema, physical_schema);
            final SubLObject logical_field_indexical = sksi_kb_accessors.indexical_for_logical_field(logical_field);
            SubLObject cdolist_list_var_$44 = recipes;
            SubLObject recipe = (SubLObject)sksi_batch_translate.NIL;
            recipe = cdolist_list_var_$44.first();
            while (sksi_batch_translate.NIL != cdolist_list_var_$44) {
                final SubLObject decoding = conses_high.sublis(raw_var_map, recipe, (SubLObject)sksi_batch_translate.UNPROVIDED, (SubLObject)sksi_batch_translate.UNPROVIDED);
                final SubLObject indexical_referent_literal = (SubLObject)ConsesLow.list(sksi_batch_translate.$const84$indexicalReferent, logical_field_indexical, (SubLObject)ConsesLow.list((SubLObject)sksi_batch_translate.$kw81$CALL, (SubLObject)sksi_batch_translate.$sym85$SKSI_BATCH_REFORMULATE, decoding, content_mt));
                indexical_referent_literals = (SubLObject)ConsesLow.cons(indexical_referent_literal, indexical_referent_literals);
                cdolist_list_var_$44 = cdolist_list_var_$44.rest();
                recipe = cdolist_list_var_$44.first();
            }
            cdolist_list_var = cdolist_list_var.rest();
            logical_field = cdolist_list_var.first();
        }
        indexical_referent_literals = Sequences.nreverse(indexical_referent_literals);
        final SubLObject translation_pattern = (SubLObject)ConsesLow.list((SubLObject)sksi_batch_translate.$kw86$TEMPLATE, el_utilities.make_conjunction(field_value_literals), (SubLObject)ConsesLow.list((SubLObject)sksi_batch_translate.$kw81$CALL, (SubLObject)sksi_batch_translate.$sym87$SKSI_SIMPLIFY_DECODED_SENTENCE, el_utilities.make_conjunction(indexical_referent_literals)));
        return Values.values(translation_pattern, relevant_logical_fields);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 48010L)
    public static SubLObject sksi_raw_sentence_translation_pattern(final SubLObject physical_schema, final SubLObject pf_indexicals, final SubLObject logical_schema, final SubLObject content_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject v_memoization_state = memoization_state.$memoization_state$.getDynamicValue(thread);
        SubLObject caching_state = (SubLObject)sksi_batch_translate.NIL;
        if (sksi_batch_translate.NIL == v_memoization_state) {
            return sksi_raw_sentence_translation_pattern_internal(physical_schema, pf_indexicals, logical_schema, content_mt);
        }
        caching_state = memoization_state.memoization_state_lookup(v_memoization_state, (SubLObject)sksi_batch_translate.$sym74$SKSI_RAW_SENTENCE_TRANSLATION_PATTERN, (SubLObject)sksi_batch_translate.UNPROVIDED);
        if (sksi_batch_translate.NIL == caching_state) {
            caching_state = memoization_state.create_caching_state(memoization_state.memoization_state_lock(v_memoization_state), (SubLObject)sksi_batch_translate.$sym74$SKSI_RAW_SENTENCE_TRANSLATION_PATTERN, (SubLObject)sksi_batch_translate.FOUR_INTEGER, (SubLObject)sksi_batch_translate.NIL, (SubLObject)sksi_batch_translate.EQUAL, (SubLObject)sksi_batch_translate.UNPROVIDED);
            memoization_state.memoization_state_put(v_memoization_state, (SubLObject)sksi_batch_translate.$sym74$SKSI_RAW_SENTENCE_TRANSLATION_PATTERN, caching_state);
        }
        final SubLObject sxhash = memoization_state.sxhash_calc_4(physical_schema, pf_indexicals, logical_schema, content_mt);
        final SubLObject collisions = memoization_state.caching_state_lookup(caching_state, sxhash, (SubLObject)sksi_batch_translate.UNPROVIDED);
        if (!collisions.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            SubLObject cdolist_list_var = collisions;
            SubLObject collision = (SubLObject)sksi_batch_translate.NIL;
            collision = cdolist_list_var.first();
            while (sksi_batch_translate.NIL != cdolist_list_var) {
                SubLObject cached_args = collision.first();
                final SubLObject results2 = conses_high.second(collision);
                if (physical_schema.equal(cached_args.first())) {
                    cached_args = cached_args.rest();
                    if (pf_indexicals.equal(cached_args.first())) {
                        cached_args = cached_args.rest();
                        if (logical_schema.equal(cached_args.first())) {
                            cached_args = cached_args.rest();
                            if (sksi_batch_translate.NIL != cached_args && sksi_batch_translate.NIL == cached_args.rest() && content_mt.equal(cached_args.first())) {
                                return memoization_state.caching_results(results2);
                            }
                        }
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                collision = cdolist_list_var.first();
            }
        }
        final SubLObject results3 = Values.arg2(thread.resetMultipleValues(), (SubLObject)Values.multiple_value_list(sksi_raw_sentence_translation_pattern_internal(physical_schema, pf_indexicals, logical_schema, content_mt)));
        memoization_state.caching_state_enter_multi_key_n(caching_state, sxhash, collisions, results3, (SubLObject)ConsesLow.list(physical_schema, pf_indexicals, logical_schema, content_mt));
        return memoization_state.caching_results(results3);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 50729L)
    public static SubLObject physical_field_has_physical_override(final SubLObject pf, final SubLObject mapping_mt) {
        return kb_mapping_utilities.fpred_value_in_relevant_mts(pf, sksi_batch_translate.$const88$fieldWithPhysicalValueMapsToPhysi, mapping_mt, (SubLObject)sksi_batch_translate.ONE_INTEGER, (SubLObject)sksi_batch_translate.ONE_INTEGER, (SubLObject)sksi_batch_translate.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 50902L)
    public static SubLObject possibly_override_physical_field_value(SubLObject raw_input, final SubLObject pf, final SubLObject mapping_mt) {
        final SubLObject p_to_p_gaf = kb_mapping_utilities.fpred_u_v_holds_gaf_in_relevant_mts(sksi_batch_translate.$const88$fieldWithPhysicalValueMapsToPhysi, pf, raw_input, mapping_mt, (SubLObject)sksi_batch_translate.ONE_INTEGER, (SubLObject)sksi_batch_translate.TWO_INTEGER, (SubLObject)sksi_batch_translate.UNPROVIDED);
        if (sksi_batch_translate.NIL != assertions_high.gaf_assertionP(p_to_p_gaf)) {
            raw_input = assertions_high.gaf_arg3(p_to_p_gaf);
        }
        return raw_input;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 51225L)
    public static SubLObject sksi_batch_reformulate(final SubLObject expression, final SubLObject content_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject sk_source = sksi_kb_accessors.content_mt_sk_source(content_mt, (SubLObject)sksi_batch_translate.UNPROVIDED);
        SubLObject v_answer = (SubLObject)sksi_batch_translate.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(mt_relevance_macros.possibly_in_mt_determine_function(content_mt), thread);
            mt_relevance_macros.$mt$.bind(mt_relevance_macros.possibly_in_mt_determine_mt(content_mt), thread);
            if (list_utilities.tree_count((SubLObject)sksi_batch_translate.NIL, expression, (SubLObject)sksi_batch_translate.UNPROVIDED, (SubLObject)sksi_batch_translate.UNPROVIDED).isPositive()) {
                v_answer = (SubLObject)sksi_batch_translate.$kw89$UNDECODED;
            }
            else {
                v_answer = sksi_reformulate.sksi_reformulate(expression, (SubLObject)sksi_batch_translate.$kw90$DECODE, sk_source);
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return v_answer;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 51642L)
    public static SubLObject sksi_simplify_decoded_sentence(final SubLObject decoded_sentence) {
        SubLObject relevant_indexical_referents = (SubLObject)sksi_batch_translate.NIL;
        SubLObject cdolist_list_var;
        final SubLObject indexical_referents = cdolist_list_var = cycl_utilities.formula_args(decoded_sentence, (SubLObject)sksi_batch_translate.UNPROVIDED);
        SubLObject indexical_referent = (SubLObject)sksi_batch_translate.NIL;
        indexical_referent = cdolist_list_var.first();
        while (sksi_batch_translate.NIL != cdolist_list_var) {
            if (sksi_batch_translate.$kw89$UNDECODED != cycl_utilities.formula_arg2(indexical_referent, (SubLObject)sksi_batch_translate.UNPROVIDED)) {
                relevant_indexical_referents = (SubLObject)ConsesLow.cons(indexical_referent, relevant_indexical_referents);
            }
            cdolist_list_var = cdolist_list_var.rest();
            indexical_referent = cdolist_list_var.first();
        }
        relevant_indexical_referents = Sequences.nreverse(relevant_indexical_referents);
        return el_utilities.make_conjunction(relevant_indexical_referents);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 52196L)
    public static SubLObject sksi_logical_field_indexicals_of_decoded_sentence(final SubLObject decoded_sentence) {
        SubLObject relevant_logical_field_indexicals = (SubLObject)sksi_batch_translate.NIL;
        SubLObject cdolist_list_var;
        final SubLObject indexical_referents = cdolist_list_var = cycl_utilities.formula_args(decoded_sentence, (SubLObject)sksi_batch_translate.UNPROVIDED);
        SubLObject indexical_referent = (SubLObject)sksi_batch_translate.NIL;
        indexical_referent = cdolist_list_var.first();
        while (sksi_batch_translate.NIL != cdolist_list_var) {
            final SubLObject logical_field_indexical = cycl_utilities.formula_arg1(indexical_referent, (SubLObject)sksi_batch_translate.UNPROVIDED);
            relevant_logical_field_indexicals = (SubLObject)ConsesLow.cons(logical_field_indexical, relevant_logical_field_indexicals);
            cdolist_list_var = cdolist_list_var.rest();
            indexical_referent = cdolist_list_var.first();
        }
        return Sequences.nreverse(relevant_logical_field_indexicals);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 52651L)
    public static SubLObject prune_consequent_conditional_meaning_sentences_wrt_antecedents(final SubLObject conditional_meaning_sentences, final SubLObject decoded_sentence, final SubLObject content_mt, final SubLObject meta_mt) {
        final SubLObject lfi_value_cache = sksi_data_warehousing_utilities.construct_lfi_value_cache(decoded_sentence);
        SubLObject result = (SubLObject)sksi_batch_translate.NIL;
        SubLObject cdolist_list_var = conditional_meaning_sentences;
        SubLObject conditional_meaning_sentence = (SubLObject)sksi_batch_translate.NIL;
        conditional_meaning_sentence = cdolist_list_var.first();
        while (sksi_batch_translate.NIL != cdolist_list_var) {
            if (sksi_data_warehousing_utilities.decoded_sentence_satisfies_conditionP(conditional_meaning_sentence, lfi_value_cache, content_mt, meta_mt) == sksi_batch_translate.T) {
                result = (SubLObject)ConsesLow.cons(sksi_meaning_sentence_utilities.get_consequent_meaning_sentence_from_conditional_meaning_sentence(conditional_meaning_sentence), result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            conditional_meaning_sentence = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 53224L)
    public static SubLObject sksi_decoded_sentence_translation_pattern(final SubLObject logical_schema, final SubLObject relevant_logical_field_indexicals, final SubLObject decoded_sentence, final SubLObject content_mt, final SubLObject meta_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject arg_var_map = (SubLObject)sksi_batch_translate.NIL;
        SubLObject indexical_referent_literals = (SubLObject)sksi_batch_translate.NIL;
        SubLObject list_var = (SubLObject)sksi_batch_translate.NIL;
        SubLObject logical_field_indexical = (SubLObject)sksi_batch_translate.NIL;
        SubLObject field_number = (SubLObject)sksi_batch_translate.NIL;
        list_var = relevant_logical_field_indexicals;
        logical_field_indexical = list_var.first();
        for (field_number = (SubLObject)sksi_batch_translate.ZERO_INTEGER; sksi_batch_translate.NIL != list_var; list_var = list_var.rest(), logical_field_indexical = list_var.first(), field_number = Numbers.add((SubLObject)sksi_batch_translate.ONE_INTEGER, field_number)) {
            final SubLObject arg_var = sksi_get_arg_var(field_number);
            final SubLObject indexical_referent_literal = (SubLObject)ConsesLow.list(sksi_batch_translate.$const84$indexicalReferent, (SubLObject)sksi_batch_translate.$kw79$ANYTHING, (SubLObject)ConsesLow.list((SubLObject)sksi_batch_translate.$kw80$BIND, arg_var));
            arg_var_map = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(logical_field_indexical, (SubLObject)ConsesLow.list((SubLObject)sksi_batch_translate.$kw72$VALUE, arg_var)), arg_var_map);
            indexical_referent_literals = (SubLObject)ConsesLow.cons(indexical_referent_literal, indexical_referent_literals);
        }
        arg_var_map = Sequences.nreverse(arg_var_map);
        indexical_referent_literals = Sequences.nreverse(indexical_referent_literals);
        final SubLObject meaning_sentences = sksi_meaning_sentence_utilities.relevant_logical_schema_meaning_sentences(logical_schema, relevant_logical_field_indexicals, sksi_batch_translate.$sksi_batch_translate_only_asserted_meaning_sentencesP$.getDynamicValue(thread), (SubLObject)sksi_batch_translate.UNPROVIDED);
        final SubLObject conditional_meaning_sentences = sksi_meaning_sentence_utilities.relevant_logical_schema_conditional_meaning_sentences(logical_schema, relevant_logical_field_indexicals, (SubLObject)sksi_batch_translate.T, (SubLObject)sksi_batch_translate.UNPROVIDED);
        final SubLObject applicable_conditional_meaning_sentences = prune_consequent_conditional_meaning_sentences_wrt_antecedents(conditional_meaning_sentences, decoded_sentence, content_mt, meta_mt);
        final SubLObject logical_sentence_recipe = simplifier.simplify_cycl_sentence_syntax(el_utilities.make_conjunction(ConsesLow.append(meaning_sentences, applicable_conditional_meaning_sentences)), (SubLObject)sksi_batch_translate.UNPROVIDED);
        final SubLObject logical_sentence_template = conses_high.sublis(arg_var_map, logical_sentence_recipe, Symbols.symbol_function((SubLObject)sksi_batch_translate.EQUAL), (SubLObject)sksi_batch_translate.UNPROVIDED);
        return (SubLObject)ConsesLow.list((SubLObject)sksi_batch_translate.$kw86$TEMPLATE, el_utilities.make_conjunction(indexical_referent_literals), logical_sentence_template);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 54809L)
    public static SubLObject sksi_batch_assert_sentence_with_deduced_argument_assuming_table(final SubLObject sentence_to_be_asserted, final SubLObject target_mt, final SubLObject meta_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sksi_batch_assert_sentence_with_deduced_argument(sentence_to_be_asserted, target_mt, meta_mt, sksi_batch_translate.$sksi_batch_asserting_translations_of_this_table$.getDynamicValue(thread));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 55177L)
    public static SubLObject sksi_batch_assert_sentence_with_deduced_argument(final SubLObject sentence_to_be_asserted, final SubLObject target_mt, final SubLObject meta_mt, final SubLObject table) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject primary_key_values_list = Hashtables.gethash(sentence_to_be_asserted, sksi_batch_translate.$sksi_batch_assert_justification_table$.getDynamicValue(thread), (SubLObject)sksi_batch_translate.UNPROVIDED);
        if (sksi_batch_translate.NIL == primary_key_values_list) {
            Errors.warn((SubLObject)sksi_batch_translate.$str91$Failed_to_compute_a_justification, sentence_to_be_asserted, target_mt);
        }
        SubLObject successP = (SubLObject)sksi_batch_translate.T;
        SubLObject cdolist_list_var = primary_key_values_list;
        SubLObject primary_key_values = (SubLObject)sksi_batch_translate.NIL;
        primary_key_values = cdolist_list_var.first();
        while (sksi_batch_translate.NIL != cdolist_list_var) {
            final SubLObject pk_value_strings = convert_sql_data_to_strings(primary_key_values);
            final SubLObject pk_values_sentence = (SubLObject)ConsesLow.listS(sksi_batch_translate.$const92$tablePrimaryKeyValues, table, ConsesLow.append(pk_value_strings, (SubLObject)sksi_batch_translate.NIL));
            sksi_batch_assert(pk_values_sentence, meta_mt, (SubLObject)sksi_batch_translate.NIL);
            final SubLObject rule = sksi_schema_translation_lifting_rule();
            final SubLObject pk_assertion = czer_meta.find_assertion_cycl(pk_values_sentence, meta_mt);
            final SubLObject sksi_support = fi.make_el_support((SubLObject)sksi_batch_translate.$kw93$OPAQUE, (SubLObject)ConsesLow.list(sksi_batch_translate.$const94$schemaTranslation, table, target_mt), meta_mt, (SubLObject)sksi_batch_translate.UNPROVIDED);
            if (sksi_batch_translate.NIL == sksi_batch_add_argument(sentence_to_be_asserted, target_mt, (SubLObject)ConsesLow.list(rule, pk_assertion, sksi_support), (SubLObject)sksi_batch_translate.NIL)) {
                successP = (SubLObject)sksi_batch_translate.NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            primary_key_values = cdolist_list_var.first();
        }
        return successP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 56264L)
    public static SubLObject possibly_remember_primary_key_that_resulted_in_raw_tuple(final SubLObject raw_tuple, final SubLObject el_sentence) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_batch_translate.NIL != misc_utilities.initialized_p(sksi_batch_translate.$sksi_batch_assert_justification_table$.getDynamicValue(thread))) {
            SubLObject primary_key_values = (SubLObject)sksi_batch_translate.NIL;
            SubLObject cdolist_list_var = sksi_batch_translate.$sksi_batch_primary_key_columns$.getDynamicValue(thread);
            SubLObject i = (SubLObject)sksi_batch_translate.NIL;
            i = cdolist_list_var.first();
            while (sksi_batch_translate.NIL != cdolist_list_var) {
                final SubLObject value = ConsesLow.nth(i, raw_tuple);
                primary_key_values = (SubLObject)ConsesLow.cons(value, primary_key_values);
                cdolist_list_var = cdolist_list_var.rest();
                i = cdolist_list_var.first();
            }
            primary_key_values = Sequences.nreverse(primary_key_values);
            hash_table_utilities.push_hash(el_sentence, primary_key_values, sksi_batch_translate.$sksi_batch_assert_justification_table$.getDynamicValue(thread));
            return primary_key_values;
        }
        return (SubLObject)sksi_batch_translate.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 56774L)
    public static SubLObject with_sksi_batch_templates(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)sksi_batch_translate.$sym2$CLET, (SubLObject)sksi_batch_translate.$list95, reader.bq_cons((SubLObject)sksi_batch_translate.$sym96$PROGN, ConsesLow.append(body, (SubLObject)sksi_batch_translate.NIL)), (SubLObject)sksi_batch_translate.$list97);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 56981L)
    public static SubLObject possibly_with_sksi_batch_templates(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject use_themP = (SubLObject)sksi_batch_translate.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)sksi_batch_translate.$list98);
        use_themP = current.first();
        final SubLObject body;
        current = (body = current.rest());
        return (SubLObject)ConsesLow.list((SubLObject)sksi_batch_translate.$sym99$PIF, use_themP, reader.bq_cons((SubLObject)sksi_batch_translate.$sym100$WITH_SKSI_BATCH_TEMPLATES, ConsesLow.append(body, (SubLObject)sksi_batch_translate.NIL)), reader.bq_cons((SubLObject)sksi_batch_translate.$sym96$PROGN, ConsesLow.append(body, (SubLObject)sksi_batch_translate.NIL)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 57157L)
    public static SubLObject initialize_sksi_batch_templates() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_batch_translate.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && sksi_batch_translate.NIL == misc_utilities.uninitialized_p(sksi_batch_translate.$sksi_batch_templates$.getDynamicValue(thread))) {
            Errors.error((SubLObject)sksi_batch_translate.$str102$Cannot_handle_nested_SKSI_batch_i);
        }
        return dictionary.new_dictionary(Symbols.symbol_function((SubLObject)sksi_batch_translate.EQUAL), (SubLObject)sksi_batch_translate.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 57393L)
    public static SubLObject clear_sksi_batch_templates() {
        sksi_batch_translate.$sksi_batch_templates$.setDynamicValue((SubLObject)sksi_batch_translate.$kw0$UNINITIALIZED);
        return (SubLObject)sksi_batch_translate.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 57543L)
    public static SubLObject sksi_batch_template_p(final SubLObject v_object) {
        return (SubLObject)SubLObjectFactory.makeBoolean(v_object.isCons() && sksi_batch_translate.NIL != list_utilities.lengthE(v_object, (SubLObject)sksi_batch_translate.TWO_INTEGER, (SubLObject)sksi_batch_translate.UNPROVIDED) && sksi_batch_translate.NIL != inference_utilities.allowed_rules_spec_p(v_object.first()) && sksi_batch_translate.NIL != Types.booleanp(conses_high.second(v_object)));
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 57726L)
    public static SubLObject sksi_batch_template_allowed_rules(final SubLObject template) {
        return template.first();
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 57814L)
    public static SubLObject sksi_batch_template_use_type_coercionP(final SubLObject template) {
        return conses_high.second(template);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 57908L)
    public static SubLObject new_sksi_batch_template(final SubLObject rules, final SubLObject use_type_coercionP) {
        assert sksi_batch_translate.NIL != inference_utilities.allowed_rules_spec_p(rules) : rules;
        assert sksi_batch_translate.NIL != Types.booleanp(use_type_coercionP) : use_type_coercionP;
        return (SubLObject)ConsesLow.list(rules, use_type_coercionP);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 58102L)
    public static SubLObject remember_batch_template_for_future_use(final SubLObject el_sentence, final SubLObject content_mt, final SubLObject physical_schema, final SubLObject logical_schema) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_batch_translate.NIL == misc_utilities.initialized_p(sksi_batch_translate.$sksi_batch_templates$.getDynamicValue(thread))) {
            return (SubLObject)sksi_batch_translate.$kw0$UNINITIALIZED;
        }
        final SubLObject narts = Sequences.remove_if((SubLObject)sksi_batch_translate.$sym105$LOGICAL_FIELD_INDEXICAL_P, Sequences.remove(content_mt, cycl_utilities.expression_gather(el_sentence, (SubLObject)sksi_batch_translate.$sym106$NART_P, (SubLObject)sksi_batch_translate.UNPROVIDED, (SubLObject)sksi_batch_translate.UNPROVIDED, (SubLObject)sksi_batch_translate.UNPROVIDED, (SubLObject)sksi_batch_translate.UNPROVIDED), (SubLObject)sksi_batch_translate.UNPROVIDED, (SubLObject)sksi_batch_translate.UNPROVIDED, (SubLObject)sksi_batch_translate.UNPROVIDED, (SubLObject)sksi_batch_translate.UNPROVIDED, (SubLObject)sksi_batch_translate.UNPROVIDED), (SubLObject)sksi_batch_translate.UNPROVIDED, (SubLObject)sksi_batch_translate.UNPROVIDED, (SubLObject)sksi_batch_translate.UNPROVIDED, (SubLObject)sksi_batch_translate.UNPROVIDED);
        final SubLObject rules = assertion_utilities.safe_all_forward_rules_relevant_to_terms(narts);
        final SubLObject type_coercion_successfulP = sksi_batch_translate.$sksi_batch_translate_type_coercion_successfulP$.getDynamicValue(thread);
        final SubLObject batch_template = new_sksi_batch_template(rules, type_coercion_successfulP);
        sksi_batch_template_enter(physical_schema, logical_schema, content_mt, batch_template);
        return narts;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 58729L)
    public static SubLObject sksi_batch_template_lookup(final SubLObject physical_schema, final SubLObject logical_schema, final SubLObject content_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_batch_translate.NIL == misc_utilities.initialized_p(sksi_batch_translate.$sksi_batch_templates$.getDynamicValue(thread))) {
            return (SubLObject)sksi_batch_translate.$kw0$UNINITIALIZED;
        }
        final SubLObject key = (SubLObject)ConsesLow.list(physical_schema, logical_schema, content_mt);
        return dictionary.dictionary_lookup_without_values(sksi_batch_translate.$sksi_batch_templates$.getDynamicValue(thread), key, (SubLObject)sksi_batch_translate.$kw0$UNINITIALIZED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 59088L)
    public static SubLObject sksi_batch_template_enter(final SubLObject physical_schema, final SubLObject logical_schema, final SubLObject content_mt, final SubLObject value) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        assert sksi_batch_translate.NIL != sksi_batch_template_p(value) : value;
        final SubLObject key = (SubLObject)ConsesLow.list(physical_schema, logical_schema, content_mt);
        return dictionary.dictionary_enter(sksi_batch_translate.$sksi_batch_templates$.getDynamicValue(thread), key, value);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 59353L)
    public static SubLObject current_sksi_batch_template() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return sksi_batch_translate.$current_sksi_batch_template$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 59440L)
    public static SubLObject current_sksi_batch_template_allowed_rules() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_batch_translate.NIL != misc_utilities.initialized_p(sksi_batch_translate.$current_sksi_batch_template$.getDynamicValue(thread))) {
            return sksi_batch_template_allowed_rules(sksi_batch_translate.$current_sksi_batch_template$.getDynamicValue(thread));
        }
        return kb_control_vars.$forward_inference_allowed_rules$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 59685L)
    public static SubLObject sksi_batch_translate_coerce_typesP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_batch_translate.NIL != misc_utilities.initialized_p(sksi_batch_translate.$current_sksi_batch_template$.getDynamicValue(thread))) {
            return sksi_batch_template_use_type_coercionP(sksi_batch_translate.$current_sksi_batch_template$.getDynamicValue(thread));
        }
        return sksi_batch_translate.$sksi_batch_translate_coerce_typesP$.getDynamicValue(thread);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 59931L)
    public static SubLObject convert_sql_data_to_strings(final SubLObject data) {
        return Mapping.mapcar((SubLObject)sksi_batch_translate.$sym108$CONVERT_SQL_DATUM_TO_STRING, data);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 60051L)
    public static SubLObject convert_sql_datum_to_string(final SubLObject datum) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (datum.isString()) {
            return datum;
        }
        SubLObject result = (SubLObject)sksi_batch_translate.NIL;
        final SubLObject _prev_bind_0 = reader.$read_default_float_format$.currentBinding(thread);
        try {
            reader.$read_default_float_format$.bind((SubLObject)sksi_batch_translate.$sym109$DOUBLE_FLOAT, thread);
            result = string_utilities.str(datum);
        }
        finally {
            reader.$read_default_float_format$.rebind(_prev_bind_0, thread);
        }
        return result;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 60590L)
    public static SubLObject clear_sksi_schema_translation_lifting_rule() {
        final SubLObject cs = sksi_batch_translate.$sksi_schema_translation_lifting_rule_caching_state$.getGlobalValue();
        if (sksi_batch_translate.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)sksi_batch_translate.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 60590L)
    public static SubLObject remove_sksi_schema_translation_lifting_rule() {
        return memoization_state.caching_state_remove_function_results_with_args(sksi_batch_translate.$sksi_schema_translation_lifting_rule_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(sksi_batch_translate.EMPTY_SUBL_OBJECT_ARRAY), (SubLObject)sksi_batch_translate.UNPROVIDED, (SubLObject)sksi_batch_translate.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 60590L)
    public static SubLObject sksi_schema_translation_lifting_rule_internal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject rule = czer_meta.find_assertion_cycl(sksi_batch_translate.$sksi_schema_translation_lifting_rule_sentence$.getGlobalValue(), sksi_batch_translate.$sksi_schema_translation_lifting_rule_mt$.getGlobalValue());
        if (sksi_batch_translate.NIL == Errors.$ignore_mustsP$.getDynamicValue(thread) && sksi_batch_translate.NIL == rule) {
            Errors.error((SubLObject)sksi_batch_translate.$str113$Could_not_find_the_SKSI_schemaTra, sksi_batch_translate.$sksi_schema_translation_lifting_rule_sentence$.getGlobalValue(), sksi_batch_translate.$sksi_schema_translation_lifting_rule_mt$.getGlobalValue());
        }
        return rule;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 60590L)
    public static SubLObject sksi_schema_translation_lifting_rule() {
        SubLObject caching_state = sksi_batch_translate.$sksi_schema_translation_lifting_rule_caching_state$.getGlobalValue();
        if (sksi_batch_translate.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)sksi_batch_translate.$sym112$SKSI_SCHEMA_TRANSLATION_LIFTING_RULE, (SubLObject)sksi_batch_translate.$sym114$_SKSI_SCHEMA_TRANSLATION_LIFTING_RULE_CACHING_STATE_, (SubLObject)sksi_batch_translate.ONE_INTEGER, (SubLObject)sksi_batch_translate.EQL, (SubLObject)sksi_batch_translate.ZERO_INTEGER, (SubLObject)sksi_batch_translate.ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, (SubLObject)sksi_batch_translate.UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(sksi_schema_translation_lifting_rule_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, (SubLObject)sksi_batch_translate.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 60984L)
    public static SubLObject clear_sksi_get_datum_var() {
        final SubLObject cs = sksi_batch_translate.$sksi_get_datum_var_caching_state$.getGlobalValue();
        if (sksi_batch_translate.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)sksi_batch_translate.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 60984L)
    public static SubLObject remove_sksi_get_datum_var(final SubLObject number) {
        return memoization_state.caching_state_remove_function_results_with_args(sksi_batch_translate.$sksi_get_datum_var_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(number), (SubLObject)sksi_batch_translate.UNPROVIDED, (SubLObject)sksi_batch_translate.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 60984L)
    public static SubLObject sksi_get_datum_var_internal(final SubLObject number) {
        return Packages.intern(Sequences.cconcatenate((SubLObject)sksi_batch_translate.$str116$DATUM_, format_nil.format_nil_s_no_copy(number)), (SubLObject)sksi_batch_translate.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 60984L)
    public static SubLObject sksi_get_datum_var(final SubLObject number) {
        SubLObject caching_state = sksi_batch_translate.$sksi_get_datum_var_caching_state$.getGlobalValue();
        if (sksi_batch_translate.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)sksi_batch_translate.$sym115$SKSI_GET_DATUM_VAR, (SubLObject)sksi_batch_translate.$sym117$_SKSI_GET_DATUM_VAR_CACHING_STATE_, (SubLObject)sksi_batch_translate.NIL, (SubLObject)sksi_batch_translate.EQL, (SubLObject)sksi_batch_translate.ONE_INTEGER, (SubLObject)sksi_batch_translate.TEN_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, number, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(sksi_get_datum_var_internal(number)));
            memoization_state.caching_state_put(caching_state, number, results, (SubLObject)sksi_batch_translate.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 61314L)
    public static SubLObject clear_sksi_get_raw_var() {
        final SubLObject cs = sksi_batch_translate.$sksi_get_raw_var_caching_state$.getGlobalValue();
        if (sksi_batch_translate.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)sksi_batch_translate.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 61314L)
    public static SubLObject remove_sksi_get_raw_var(final SubLObject number) {
        return memoization_state.caching_state_remove_function_results_with_args(sksi_batch_translate.$sksi_get_raw_var_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(number), (SubLObject)sksi_batch_translate.UNPROVIDED, (SubLObject)sksi_batch_translate.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 61314L)
    public static SubLObject sksi_get_raw_var_internal(final SubLObject number) {
        return Packages.intern(Sequences.cconcatenate((SubLObject)sksi_batch_translate.$str119$RAW_, format_nil.format_nil_s_no_copy(number)), (SubLObject)sksi_batch_translate.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 61314L)
    public static SubLObject sksi_get_raw_var(final SubLObject number) {
        SubLObject caching_state = sksi_batch_translate.$sksi_get_raw_var_caching_state$.getGlobalValue();
        if (sksi_batch_translate.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)sksi_batch_translate.$sym118$SKSI_GET_RAW_VAR, (SubLObject)sksi_batch_translate.$sym120$_SKSI_GET_RAW_VAR_CACHING_STATE_, (SubLObject)sksi_batch_translate.NIL, (SubLObject)sksi_batch_translate.EQL, (SubLObject)sksi_batch_translate.ONE_INTEGER, (SubLObject)sksi_batch_translate.TEN_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, number, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(sksi_get_raw_var_internal(number)));
            memoization_state.caching_state_put(caching_state, number, results, (SubLObject)sksi_batch_translate.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 61432L)
    public static SubLObject clear_sksi_get_arg_var() {
        final SubLObject cs = sksi_batch_translate.$sksi_get_arg_var_caching_state$.getGlobalValue();
        if (sksi_batch_translate.NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return (SubLObject)sksi_batch_translate.NIL;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 61432L)
    public static SubLObject remove_sksi_get_arg_var(final SubLObject number) {
        return memoization_state.caching_state_remove_function_results_with_args(sksi_batch_translate.$sksi_get_arg_var_caching_state$.getGlobalValue(), (SubLObject)ConsesLow.list(number), (SubLObject)sksi_batch_translate.UNPROVIDED, (SubLObject)sksi_batch_translate.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 61432L)
    public static SubLObject sksi_get_arg_var_internal(final SubLObject number) {
        return Packages.intern(Sequences.cconcatenate((SubLObject)sksi_batch_translate.$str122$ARG_, format_nil.format_nil_s_no_copy(number)), (SubLObject)sksi_batch_translate.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 61432L)
    public static SubLObject sksi_get_arg_var(final SubLObject number) {
        SubLObject caching_state = sksi_batch_translate.$sksi_get_arg_var_caching_state$.getGlobalValue();
        if (sksi_batch_translate.NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name((SubLObject)sksi_batch_translate.$sym121$SKSI_GET_ARG_VAR, (SubLObject)sksi_batch_translate.$sym123$_SKSI_GET_ARG_VAR_CACHING_STATE_, (SubLObject)sksi_batch_translate.NIL, (SubLObject)sksi_batch_translate.EQL, (SubLObject)sksi_batch_translate.ONE_INTEGER, (SubLObject)sksi_batch_translate.TEN_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_lookup(caching_state, number, memoization_state.$memoized_item_not_found$.getGlobalValue());
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = Values.arg2(Values.resetMultipleValues(), (SubLObject)Values.multiple_value_list(sksi_get_arg_var_internal(number)));
            memoization_state.caching_state_put(caching_state, number, results, (SubLObject)sksi_batch_translate.UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 61550L)
    public static SubLObject sksi_batch_assert(final SubLObject sentence, final SubLObject mt, final SubLObject check_wffP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_batch_translate.NIL != sksi_batch_translate.$sksi_batch_add_operations_to_transcriptP$.getDynamicValue(thread)) {
            thread.resetMultipleValues();
            final SubLObject successP = (sksi_batch_translate.NIL != check_wffP) ? ke.ke_assert_now(sentence, mt, (SubLObject)sksi_batch_translate.UNPROVIDED, (SubLObject)sksi_batch_translate.UNPROVIDED) : ke.ke_assert_wff_now(sentence, mt, (SubLObject)sksi_batch_translate.UNPROVIDED, (SubLObject)sksi_batch_translate.UNPROVIDED);
            final SubLObject error = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (sksi_batch_translate.NIL == successP && sksi_batch_translate.NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP((SubLObject)sksi_batch_translate.ONE_INTEGER)) {
                PrintLow.format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), Sequences.cconcatenate((SubLObject)sksi_batch_translate.$str44$__SKSI__A_, (SubLObject)sksi_batch_translate.$str124$Assertion_of__s_in__s_failed___a), new SubLObject[] { sksi_batch_translate.ONE_INTEGER, sentence, mt, error });
                streams_high.force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
            }
            return successP;
        }
        final SubLObject successP = cyc_kernel.cyc_assert(sentence, mt, (SubLObject)ConsesLow.list((SubLObject)sksi_batch_translate.$kw125$CHECK_WFF_, check_wffP));
        if (sksi_batch_translate.NIL == successP && sksi_batch_translate.NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP((SubLObject)sksi_batch_translate.ONE_INTEGER)) {
            PrintLow.format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), Sequences.cconcatenate((SubLObject)sksi_batch_translate.$str44$__SKSI__A_, (SubLObject)sksi_batch_translate.$str124$Assertion_of__s_in__s_failed___a), new SubLObject[] { sksi_batch_translate.ONE_INTEGER, sentence, mt, fi.fi_get_error_int() });
            streams_high.force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
        }
        return successP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 62184L)
    public static SubLObject sksi_batch_add_argument(final SubLObject sentence, final SubLObject mt, final SubLObject supports, final SubLObject check_wffP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_batch_translate.NIL != sksi_batch_translate.$sksi_batch_add_operations_to_transcriptP$.getDynamicValue(thread)) {
            thread.resetMultipleValues();
            final SubLObject successP = ke.ke_add_argument_now(sentence, mt, supports, (SubLObject)sksi_batch_translate.NIL, (SubLObject)sksi_batch_translate.NIL, check_wffP);
            final SubLObject error = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return sksi_batch_add_argument_return_value_handler(sentence, mt, supports, successP, error);
        }
        final SubLObject successP = cyc_kernel.cyc_add_argument(sentence, supports, mt, (SubLObject)ConsesLow.list((SubLObject)sksi_batch_translate.$kw125$CHECK_WFF_, check_wffP), (SubLObject)sksi_batch_translate.UNPROVIDED);
        return sksi_batch_add_argument_return_value_handler(sentence, mt, supports, successP, (SubLObject)sksi_batch_translate.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 62774L)
    public static SubLObject sksi_batch_add_argument_return_value_handler(final SubLObject sentence, final SubLObject mt, final SubLObject supports, final SubLObject successP, SubLObject error) {
        if (error == sksi_batch_translate.UNPROVIDED) {
            error = (SubLObject)sksi_batch_translate.$kw0$UNINITIALIZED;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_batch_translate.NIL == successP) {
            if (sksi_batch_translate.NIL != misc_utilities.uninitialized_p(error)) {
                error = fi.fi_get_error_int();
            }
            if (sksi_batch_translate.NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP((SubLObject)sksi_batch_translate.ONE_INTEGER)) {
                PrintLow.format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), Sequences.cconcatenate((SubLObject)sksi_batch_translate.$str44$__SKSI__A_, (SubLObject)sksi_batch_translate.$str126$Deduction_of__s_in__s_with_suppor), new SubLObject[] { sksi_batch_translate.ONE_INTEGER, sentence, mt, supports, error });
                streams_high.force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
            }
        }
        if (sksi_batch_translate.NIL != sksi_batch_translate.$sksi_batch_translate_add_argument_callback$.getDynamicValue(thread)) {
            Functions.funcall(sksi_batch_translate.$sksi_batch_translate_add_argument_callback$.getDynamicValue(thread), sentence, mt, supports, successP);
        }
        return successP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 63258L)
    public static SubLObject sksi_batch_unassert(final SubLObject sentence, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_batch_translate.NIL != sksi_batch_translate.$sksi_batch_add_operations_to_transcriptP$.getDynamicValue(thread)) {
            thread.resetMultipleValues();
            final SubLObject successP = ke.ke_unassert_now(sentence, mt);
            final SubLObject error = thread.secondMultipleValue();
            thread.resetMultipleValues();
            return sksi_batch_unassert_return_value_handler(sentence, mt, successP, error);
        }
        final SubLObject successP = cyc_kernel.cyc_unassert(sentence, mt);
        return sksi_batch_unassert_return_value_handler(sentence, mt, successP, (SubLObject)sksi_batch_translate.UNPROVIDED);
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 63648L)
    public static SubLObject sksi_batch_unassert_return_value_handler(final SubLObject sentence, final SubLObject mt, final SubLObject successP, SubLObject error) {
        if (error == sksi_batch_translate.UNPROVIDED) {
            error = (SubLObject)sksi_batch_translate.$kw0$UNINITIALIZED;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (sksi_batch_translate.NIL == successP) {
            if (sksi_batch_translate.NIL != misc_utilities.uninitialized_p(error)) {
                error = fi.fi_get_error_int();
            }
            if (sksi_batch_translate.NIL != sksi_debugging.sksi_trace_level_exceeds_minimumP((SubLObject)sksi_batch_translate.TWO_INTEGER)) {
                PrintLow.format(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread), Sequences.cconcatenate((SubLObject)sksi_batch_translate.$str44$__SKSI__A_, (SubLObject)sksi_batch_translate.$str127$Unassert_of__s_from__s_failed___a), new SubLObject[] { sksi_batch_translate.TWO_INTEGER, sentence, mt, error });
                streams_high.force_output(sksi_debugging.$sksi_trace_stream$.getDynamicValue(thread));
            }
        }
        if (sksi_batch_translate.NIL != sksi_batch_translate.$sksi_batch_translate_unassert_callback$.getDynamicValue(thread)) {
            Functions.funcall(sksi_batch_translate.$sksi_batch_translate_unassert_callback$.getDynamicValue(thread), sentence, mt, successP);
        }
        return successP;
    }
    
    @SubLTranslatedFile.SubL(source = "cycl/sksi/data-warehousing/sksi-batch-translate.lisp", position = 69647L)
    public static SubLObject test_sksi_wff_check_batch_translated_sentence(final SubLObject logical_sentence, final SubLObject content_mt, final SubLObject check_wff_nessP, final SubLObject coerce_typesP) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject _prev_bind_0 = sksi_batch_translate.$sksi_batch_translate_coerce_typesP$.currentBinding(thread);
        try {
            sksi_batch_translate.$sksi_batch_translate_coerce_typesP$.bind(coerce_typesP, thread);
            thread.resetMultipleValues();
            final SubLObject result = sksi_wff_check_batch_translated_sentence(logical_sentence, content_mt, check_wff_nessP);
            final SubLObject format_string = thread.secondMultipleValue();
            final SubLObject explanation = thread.thirdMultipleValue();
            thread.resetMultipleValues();
            return (SubLObject)ConsesLow.list(result, format_string, explanation);
        }
        finally {
            sksi_batch_translate.$sksi_batch_translate_coerce_typesP$.rebind(_prev_bind_0, thread);
        }
    }
    
    public static SubLObject declare_sksi_batch_translate_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "set_sksi_batch_translate_only_asserted_meaning_sentences", "SET-SKSI-BATCH-TRANSLATE-ONLY-ASSERTED-MEANING-SENTENCES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "set_sksi_batch_translate_coerce_types", "SET-SKSI-BATCH-TRANSLATE-COERCE-TYPES", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "with_sksi_batch_translate_only_asserted_meaning_sentences", "WITH-SKSI-BATCH-TRANSLATE-ONLY-ASSERTED-MEANING-SENTENCES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "without_sksi_batch_translate_only_asserted_meaning_sentences", "WITHOUT-SKSI-BATCH-TRANSLATE-ONLY-ASSERTED-MEANING-SENTENCES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "with_sksi_batch_translate_coerce_types", "WITH-SKSI-BATCH-TRANSLATE-COERCE-TYPES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "without_sksi_batch_translate_coerce_types", "WITHOUT-SKSI-BATCH-TRANSLATE-COERCE-TYPES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "with_sksi_batch_sql_select_statement", "WITH-SKSI-BATCH-SQL-SELECT-STATEMENT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "sksi_batch_assert_translations_of_table", "SKSI-BATCH-ASSERT-TRANSLATIONS-OF-TABLE", 1, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "sksi_batch_assert_all_sk_sources_in_mt", "SKSI-BATCH-ASSERT-ALL-SK-SOURCES-IN-MT", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "sksi_batch_assert_all_sk_sources_in_mt_to_ke_stream", "SKSI-BATCH-ASSERT-ALL-SK-SOURCES-IN-MT-TO-KE-STREAM", 3, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "sksi_batch_assert_all_sk_sources_in_mt_to_ke_string", "SKSI-BATCH-ASSERT-ALL-SK-SOURCES-IN-MT-TO-KE-STRING", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "sksi_batch_assert_all_sk_sources_in_mt_to_ke_file", "SKSI-BATCH-ASSERT-ALL-SK-SOURCES-IN-MT-TO-KE-FILE", 4, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "sksi_translate_all_sk_sources_in_mt", "SKSI-TRANSLATE-ALL-SK-SOURCES-IN-MT", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "sksi_translate_all_sk_source_in_just_mt", "SKSI-TRANSLATE-ALL-SK-SOURCE-IN-JUST-MT", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "sksi_translate_all_sk_sources_in_mt_to_stream", "SKSI-TRANSLATE-ALL-SK-SOURCES-IN-MT-TO-STREAM", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "sksi_translate_all_sk_sources_in_mt_to_file", "SKSI-TRANSLATE-ALL-SK-SOURCES-IN-MT-TO-FILE", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "sksi_translate_all_spec_sk_sources", "SKSI-TRANSLATE-ALL-SPEC-SK-SOURCES", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "sksi_translate_all_spec_sk_sources_to_stream", "SKSI-TRANSLATE-ALL-SPEC-SK-SOURCES-TO-STREAM", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "sksi_translate_all_spec_sk_sources_to_file", "SKSI-TRANSLATE-ALL-SPEC-SK-SOURCES-TO-FILE", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "sksi_translate_all_simple_sk_source", "SKSI-TRANSLATE-ALL-SIMPLE-SK-SOURCE", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "sksi_translate_all_simple_sk_source_to_stream", "SKSI-TRANSLATE-ALL-SIMPLE-SK-SOURCE-TO-STREAM", 2, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "sksi_translate_simple_sk_source", "SKSI-TRANSLATE-SIMPLE-SK-SOURCE", 4, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "sksi_translate_simple_sk_source_to_stream", "SKSI-TRANSLATE-SIMPLE-SK-SOURCE-TO-STREAM", 4, 4, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "sksi_translate_simple_sk_source_to_file", "SKSI-TRANSLATE-SIMPLE-SK-SOURCE-TO-FILE", 5, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "new_sksi_translate_iterator", "NEW-SKSI-TRANSLATE-ITERATOR", 4, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "make_sksi_translate_iterator_state", "MAKE-SKSI-TRANSLATE-ITERATOR-STATE", 8, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "sksi_translate_iterate_done", "SKSI-TRANSLATE-ITERATE-DONE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "sksi_translate_iterate_next", "SKSI-TRANSLATE-ITERATE-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "sksi_translate_one_raw_tuple_to_ist_logical_sentence", "SKSI-TRANSLATE-ONE-RAW-TUPLE-TO-IST-LOGICAL-SENTENCE", 5, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "sksi_translate_one_raw_tuple_to_logical_sentence", "SKSI-TRANSLATE-ONE-RAW-TUPLE-TO-LOGICAL-SENTENCE", 5, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "sksi_translate_one_raw_tuple_to_logical_sentence_int", "SKSI-TRANSLATE-ONE-RAW-TUPLE-TO-LOGICAL-SENTENCE-INT", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "sksi_postprocess_translated_sentence", "SKSI-POSTPROCESS-TRANSLATED-SENTENCE", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "sksi_postprocess_translated_asent", "SKSI-POSTPROCESS-TRANSLATED-ASENT", 6, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "sksi_wff_check_batch_translated_sentence", "SKSI-WFF-CHECK-BATCH-TRANSLATED-SENTENCE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "sksi_remove_untranslatable", "SKSI-REMOVE-UNTRANSLATABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "sentence_contains_untranslatableP", "SENTENCE-CONTAINS-UNTRANSLATABLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "sksi_remove_unreformulatable", "SKSI-REMOVE-UNREFORMULATABLE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "sentence_contains_unreformulatableP", "SENTENCE-CONTAINS-UNREFORMULATABLE?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "sksi_translate_raw_tuple", "SKSI-TRANSLATE-RAW-TUPLE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "sksi_translate_raw_sentence", "SKSI-TRANSLATE-RAW-SENTENCE", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "sksi_translate_decoded_sentence", "SKSI-TRANSLATE-DECODED-SENTENCE", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "new_sk_source_row_iterator", "NEW-SK-SOURCE-ROW-ITERATOR", 3, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "sk_source_row_iterator_next", "SK-SOURCE-ROW-ITERATOR-NEXT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "sksi_raw_tuple_translation_pattern_internal", "SKSI-RAW-TUPLE-TRANSLATION-PATTERN-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "sksi_raw_tuple_translation_pattern", "SKSI-RAW-TUPLE-TRANSLATION-PATTERN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "sksi_raw_sentence_translation_pattern_internal", "SKSI-RAW-SENTENCE-TRANSLATION-PATTERN-INTERNAL", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "sksi_raw_sentence_translation_pattern", "SKSI-RAW-SENTENCE-TRANSLATION-PATTERN", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "physical_field_has_physical_override", "PHYSICAL-FIELD-HAS-PHYSICAL-OVERRIDE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "possibly_override_physical_field_value", "POSSIBLY-OVERRIDE-PHYSICAL-FIELD-VALUE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "sksi_batch_reformulate", "SKSI-BATCH-REFORMULATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "sksi_simplify_decoded_sentence", "SKSI-SIMPLIFY-DECODED-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "sksi_logical_field_indexicals_of_decoded_sentence", "SKSI-LOGICAL-FIELD-INDEXICALS-OF-DECODED-SENTENCE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "prune_consequent_conditional_meaning_sentences_wrt_antecedents", "PRUNE-CONSEQUENT-CONDITIONAL-MEANING-SENTENCES-WRT-ANTECEDENTS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "sksi_decoded_sentence_translation_pattern", "SKSI-DECODED-SENTENCE-TRANSLATION-PATTERN", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "sksi_batch_assert_sentence_with_deduced_argument_assuming_table", "SKSI-BATCH-ASSERT-SENTENCE-WITH-DEDUCED-ARGUMENT-ASSUMING-TABLE", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "sksi_batch_assert_sentence_with_deduced_argument", "SKSI-BATCH-ASSERT-SENTENCE-WITH-DEDUCED-ARGUMENT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "possibly_remember_primary_key_that_resulted_in_raw_tuple", "POSSIBLY-REMEMBER-PRIMARY-KEY-THAT-RESULTED-IN-RAW-TUPLE", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "with_sksi_batch_templates", "WITH-SKSI-BATCH-TEMPLATES");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "possibly_with_sksi_batch_templates", "POSSIBLY-WITH-SKSI-BATCH-TEMPLATES");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "initialize_sksi_batch_templates", "INITIALIZE-SKSI-BATCH-TEMPLATES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "clear_sksi_batch_templates", "CLEAR-SKSI-BATCH-TEMPLATES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "sksi_batch_template_p", "SKSI-BATCH-TEMPLATE-P", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "sksi_batch_template_allowed_rules", "SKSI-BATCH-TEMPLATE-ALLOWED-RULES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "sksi_batch_template_use_type_coercionP", "SKSI-BATCH-TEMPLATE-USE-TYPE-COERCION?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "new_sksi_batch_template", "NEW-SKSI-BATCH-TEMPLATE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "remember_batch_template_for_future_use", "REMEMBER-BATCH-TEMPLATE-FOR-FUTURE-USE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "sksi_batch_template_lookup", "SKSI-BATCH-TEMPLATE-LOOKUP", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "sksi_batch_template_enter", "SKSI-BATCH-TEMPLATE-ENTER", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "current_sksi_batch_template", "CURRENT-SKSI-BATCH-TEMPLATE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "current_sksi_batch_template_allowed_rules", "CURRENT-SKSI-BATCH-TEMPLATE-ALLOWED-RULES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "sksi_batch_translate_coerce_typesP", "SKSI-BATCH-TRANSLATE-COERCE-TYPES?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "convert_sql_data_to_strings", "CONVERT-SQL-DATA-TO-STRINGS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "convert_sql_datum_to_string", "CONVERT-SQL-DATUM-TO-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "clear_sksi_schema_translation_lifting_rule", "CLEAR-SKSI-SCHEMA-TRANSLATION-LIFTING-RULE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "remove_sksi_schema_translation_lifting_rule", "REMOVE-SKSI-SCHEMA-TRANSLATION-LIFTING-RULE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "sksi_schema_translation_lifting_rule_internal", "SKSI-SCHEMA-TRANSLATION-LIFTING-RULE-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "sksi_schema_translation_lifting_rule", "SKSI-SCHEMA-TRANSLATION-LIFTING-RULE", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "clear_sksi_get_datum_var", "CLEAR-SKSI-GET-DATUM-VAR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "remove_sksi_get_datum_var", "REMOVE-SKSI-GET-DATUM-VAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "sksi_get_datum_var_internal", "SKSI-GET-DATUM-VAR-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "sksi_get_datum_var", "SKSI-GET-DATUM-VAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "clear_sksi_get_raw_var", "CLEAR-SKSI-GET-RAW-VAR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "remove_sksi_get_raw_var", "REMOVE-SKSI-GET-RAW-VAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "sksi_get_raw_var_internal", "SKSI-GET-RAW-VAR-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "sksi_get_raw_var", "SKSI-GET-RAW-VAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "clear_sksi_get_arg_var", "CLEAR-SKSI-GET-ARG-VAR", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "remove_sksi_get_arg_var", "REMOVE-SKSI-GET-ARG-VAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "sksi_get_arg_var_internal", "SKSI-GET-ARG-VAR-INTERNAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "sksi_get_arg_var", "SKSI-GET-ARG-VAR", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "sksi_batch_assert", "SKSI-BATCH-ASSERT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "sksi_batch_add_argument", "SKSI-BATCH-ADD-ARGUMENT", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "sksi_batch_add_argument_return_value_handler", "SKSI-BATCH-ADD-ARGUMENT-RETURN-VALUE-HANDLER", 4, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "sksi_batch_unassert", "SKSI-BATCH-UNASSERT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "sksi_batch_unassert_return_value_handler", "SKSI-BATCH-UNASSERT-RETURN-VALUE-HANDLER", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.sksi.data_warehousing.sksi_batch_translate", "test_sksi_wff_check_batch_translated_sentence", "TEST-SKSI-WFF-CHECK-BATCH-TRANSLATED-SENTENCE", 4, 0, false);
        return (SubLObject)sksi_batch_translate.NIL;
    }
    
    public static SubLObject init_sksi_batch_translate_file() {
        sksi_batch_translate.$sksi_batch_translate_only_asserted_meaning_sentencesP$ = SubLFiles.defvar("*SKSI-BATCH-TRANSLATE-ONLY-ASSERTED-MEANING-SENTENCES?*", (SubLObject)sksi_batch_translate.T);
        sksi_batch_translate.$sksi_batch_translate_coerce_typesP$ = SubLFiles.defvar("*SKSI-BATCH-TRANSLATE-COERCE-TYPES?*", (SubLObject)sksi_batch_translate.NIL);
        sksi_batch_translate.$sksi_batch_translate_type_coercion_successfulP$ = SubLFiles.defparameter("*SKSI-BATCH-TRANSLATE-TYPE-COERCION-SUCCESSFUL?*", (SubLObject)sksi_batch_translate.$kw0$UNINITIALIZED);
        sksi_batch_translate.$sksi_batch_assert_justification_table$ = SubLFiles.defparameter("*SKSI-BATCH-ASSERT-JUSTIFICATION-TABLE*", (SubLObject)sksi_batch_translate.$kw0$UNINITIALIZED);
        sksi_batch_translate.$sksi_batch_primary_key_columns$ = SubLFiles.defparameter("*SKSI-BATCH-PRIMARY-KEY-COLUMNS*", (SubLObject)sksi_batch_translate.$kw0$UNINITIALIZED);
        sksi_batch_translate.$sksi_batch_sql_select_statement$ = SubLFiles.defparameter("*SKSI-BATCH-SQL-SELECT-STATEMENT*", (SubLObject)sksi_batch_translate.NIL);
        sksi_batch_translate.$sksi_batch_sql_order_by_primary_keyP$ = SubLFiles.defparameter("*SKSI-BATCH-SQL-ORDER-BY-PRIMARY-KEY?*", (SubLObject)sksi_batch_translate.NIL);
        sksi_batch_translate.$sksi_batch_add_operations_to_transcriptP$ = SubLFiles.defparameter("*SKSI-BATCH-ADD-OPERATIONS-TO-TRANSCRIPT?*", (SubLObject)sksi_batch_translate.NIL);
        sksi_batch_translate.$current_sksi_batch_template$ = SubLFiles.defparameter("*CURRENT-SKSI-BATCH-TEMPLATE*", (SubLObject)sksi_batch_translate.$kw0$UNINITIALIZED);
        sksi_batch_translate.$sksi_batch_templates$ = SubLFiles.defvar("*SKSI-BATCH-TEMPLATES*", (SubLObject)sksi_batch_translate.$kw0$UNINITIALIZED);
        sksi_batch_translate.$sksi_batch_translate_add_argument_callback$ = SubLFiles.defparameter("*SKSI-BATCH-TRANSLATE-ADD-ARGUMENT-CALLBACK*", (SubLObject)sksi_batch_translate.NIL);
        sksi_batch_translate.$sksi_batch_translate_unassert_callback$ = SubLFiles.defparameter("*SKSI-BATCH-TRANSLATE-UNASSERT-CALLBACK*", (SubLObject)sksi_batch_translate.NIL);
        sksi_batch_translate.$sksi_batch_asserting_translations_of_this_table$ = SubLFiles.defparameter("*SKSI-BATCH-ASSERTING-TRANSLATIONS-OF-THIS-TABLE*", (SubLObject)sksi_batch_translate.$kw0$UNINITIALIZED);
        sksi_batch_translate.$sksi_row_iterator_overrides$ = SubLFiles.defparameter("*SKSI-ROW-ITERATOR-OVERRIDES*", (SubLObject)sksi_batch_translate.$list68);
        sksi_batch_translate.$sksi_schema_translation_lifting_rule_sentence$ = SubLFiles.deflexical("*SKSI-SCHEMA-TRANSLATION-LIFTING-RULE-SENTENCE*", (SubLObject)sksi_batch_translate.$list110);
        sksi_batch_translate.$sksi_schema_translation_lifting_rule_mt$ = SubLFiles.deflexical("*SKSI-SCHEMA-TRANSLATION-LIFTING-RULE-MT*", sksi_batch_translate.$const111$SKSIMt);
        sksi_batch_translate.$sksi_schema_translation_lifting_rule_caching_state$ = SubLFiles.deflexical("*SKSI-SCHEMA-TRANSLATION-LIFTING-RULE-CACHING-STATE*", (SubLObject)sksi_batch_translate.NIL);
        sksi_batch_translate.$sksi_get_datum_var_caching_state$ = SubLFiles.deflexical("*SKSI-GET-DATUM-VAR-CACHING-STATE*", (SubLObject)sksi_batch_translate.NIL);
        sksi_batch_translate.$sksi_get_raw_var_caching_state$ = SubLFiles.deflexical("*SKSI-GET-RAW-VAR-CACHING-STATE*", (SubLObject)sksi_batch_translate.NIL);
        sksi_batch_translate.$sksi_get_arg_var_caching_state$ = SubLFiles.deflexical("*SKSI-GET-ARG-VAR-CACHING-STATE*", (SubLObject)sksi_batch_translate.NIL);
        return (SubLObject)sksi_batch_translate.NIL;
    }
    
    public static SubLObject setup_sksi_batch_translate_file() {
        memoization_state.note_memoized_function((SubLObject)sksi_batch_translate.$sym70$SKSI_RAW_TUPLE_TRANSLATION_PATTERN);
        memoization_state.note_memoized_function((SubLObject)sksi_batch_translate.$sym74$SKSI_RAW_SENTENCE_TRANSLATION_PATTERN);
        access_macros.register_macro_helper((SubLObject)sksi_batch_translate.$sym101$INITIALIZE_SKSI_BATCH_TEMPLATES, (SubLObject)sksi_batch_translate.$sym100$WITH_SKSI_BATCH_TEMPLATES);
        access_macros.register_macro_helper((SubLObject)sksi_batch_translate.$sym103$CLEAR_SKSI_BATCH_TEMPLATES, (SubLObject)sksi_batch_translate.$sym100$WITH_SKSI_BATCH_TEMPLATES);
        memoization_state.note_globally_cached_function((SubLObject)sksi_batch_translate.$sym112$SKSI_SCHEMA_TRANSLATION_LIFTING_RULE);
        memoization_state.note_globally_cached_function((SubLObject)sksi_batch_translate.$sym115$SKSI_GET_DATUM_VAR);
        memoization_state.note_globally_cached_function((SubLObject)sksi_batch_translate.$sym118$SKSI_GET_RAW_VAR);
        memoization_state.note_globally_cached_function((SubLObject)sksi_batch_translate.$sym121$SKSI_GET_ARG_VAR);
        utilities_macros.note_funcall_helper_function((SubLObject)sksi_batch_translate.$sym129$TEST_SKSI_WFF_CHECK_BATCH_TRANSLATED_SENTENCE);
        return (SubLObject)sksi_batch_translate.NIL;
    }
    
    @Override
	public void declareFunctions() {
        declare_sksi_batch_translate_file();
    }
    
    @Override
	public void initializeVariables() {
        init_sksi_batch_translate_file();
    }
    
    @Override
	public void runTopLevelForms() {
        setup_sksi_batch_translate_file();
    }
    
    static {
        me = (SubLFile)new sksi_batch_translate();
        sksi_batch_translate.$sksi_batch_translate_only_asserted_meaning_sentencesP$ = null;
        sksi_batch_translate.$sksi_batch_translate_coerce_typesP$ = null;
        sksi_batch_translate.$sksi_batch_translate_type_coercion_successfulP$ = null;
        sksi_batch_translate.$sksi_batch_assert_justification_table$ = null;
        sksi_batch_translate.$sksi_batch_primary_key_columns$ = null;
        sksi_batch_translate.$sksi_batch_sql_select_statement$ = null;
        sksi_batch_translate.$sksi_batch_sql_order_by_primary_keyP$ = null;
        sksi_batch_translate.$sksi_batch_add_operations_to_transcriptP$ = null;
        sksi_batch_translate.$current_sksi_batch_template$ = null;
        sksi_batch_translate.$sksi_batch_templates$ = null;
        sksi_batch_translate.$sksi_batch_translate_add_argument_callback$ = null;
        sksi_batch_translate.$sksi_batch_translate_unassert_callback$ = null;
        sksi_batch_translate.$sksi_batch_asserting_translations_of_this_table$ = null;
        sksi_batch_translate.$sksi_row_iterator_overrides$ = null;
        sksi_batch_translate.$sksi_schema_translation_lifting_rule_sentence$ = null;
        sksi_batch_translate.$sksi_schema_translation_lifting_rule_mt$ = null;
        sksi_batch_translate.$sksi_schema_translation_lifting_rule_caching_state$ = null;
        sksi_batch_translate.$sksi_get_datum_var_caching_state$ = null;
        sksi_batch_translate.$sksi_get_raw_var_caching_state$ = null;
        sksi_batch_translate.$sksi_get_arg_var_caching_state$ = null;
        $kw0$UNINITIALIZED = SubLObjectFactory.makeKeyword("UNINITIALIZED");
        $sym1$BOOLEANP = SubLObjectFactory.makeSymbol("BOOLEANP");
        $sym2$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list3 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SKSI-BATCH-TRANSLATE-ONLY-ASSERTED-MEANING-SENTENCES?*"), (SubLObject)sksi_batch_translate.T));
        $list4 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SKSI-BATCH-TRANSLATE-ONLY-ASSERTED-MEANING-SENTENCES?*"), (SubLObject)sksi_batch_translate.NIL));
        $list5 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SKSI-BATCH-TRANSLATE-COERCE-TYPES?*"), (SubLObject)sksi_batch_translate.T));
        $list6 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SKSI-BATCH-TRANSLATE-COERCE-TYPES?*"), (SubLObject)sksi_batch_translate.NIL));
        $list7 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym8$_SKSI_BATCH_SQL_SELECT_STATEMENT_ = SubLObjectFactory.makeSymbol("*SKSI-BATCH-SQL-SELECT-STATEMENT*");
        $int9$1000 = SubLObjectFactory.makeInteger(1000);
        $str10$in_mt___S___ = SubLObjectFactory.makeString("in mt: ~S.~%");
        $str11$f___S___ = SubLObjectFactory.makeString("f: ~S.~%");
        $kw12$OUTPUT = SubLObjectFactory.makeKeyword("OUTPUT");
        $str13$Unable_to_open__S = SubLObjectFactory.makeString("Unable to open ~S");
        $kw14$BREADTH = SubLObjectFactory.makeKeyword("BREADTH");
        $kw15$QUEUE = SubLObjectFactory.makeKeyword("QUEUE");
        $kw16$STACK = SubLObjectFactory.makeKeyword("STACK");
        $sym17$RELEVANT_SBHL_TV_IS_GENERAL_TV = SubLObjectFactory.makeSymbol("RELEVANT-SBHL-TV-IS-GENERAL-TV");
        $kw18$ERROR = SubLObjectFactory.makeKeyword("ERROR");
        $str19$_A_is_not_a__A = SubLObjectFactory.makeString("~A is not a ~A");
        $sym20$SBHL_TRUE_TV_P = SubLObjectFactory.makeSymbol("SBHL-TRUE-TV-P");
        $kw21$CERROR = SubLObjectFactory.makeKeyword("CERROR");
        $str22$continue_anyway = SubLObjectFactory.makeString("continue anyway");
        $kw23$WARN = SubLObjectFactory.makeKeyword("WARN");
        $str24$_A_is_not_a_valid__sbhl_type_erro = SubLObjectFactory.makeString("~A is not a valid *sbhl-type-error-action* value");
        $const25$genlMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("genlMt"));
        $str26$_A_is_neither_SET_P_nor_LISTP_ = SubLObjectFactory.makeString("~A is neither SET-P nor LISTP.");
        $str27$attempting_to_bind_direction_link = SubLObjectFactory.makeString("attempting to bind direction link variable, to NIL. macro body not executed.");
        $str28$Node__a_does_not_pass_sbhl_type_t = SubLObjectFactory.makeString("Node ~a does not pass sbhl-type-test ~a~%");
        $str29$____Translation_Time____A__ = SubLObjectFactory.makeString("~%;;Translation Time : ~A~%");
        $str30$_____ = SubLObjectFactory.makeString(";; ~%");
        $str31$___Meta_Mt_____________S__ = SubLObjectFactory.makeString(";; Meta Mt          : ~S~%");
        $str32$___Source______________S__ = SubLObjectFactory.makeString(";; Source           : ~S~%");
        $str33$___Physical_Schema_____S__ = SubLObjectFactory.makeString(";; Physical Schema  : ~S~%");
        $str34$___Logical_Schema______S__ = SubLObjectFactory.makeString(";; Logical Schema   : ~S~%");
        $str35$___Content_Mt__________S = SubLObjectFactory.makeString(";; Content Mt       : ~S");
        $str36$________S_ = SubLObjectFactory.makeString("~%~%;; ~S ");
        $sym37$SKSI_TRANSLATE_ITERATE_DONE = SubLObjectFactory.makeSymbol("SKSI-TRANSLATE-ITERATE-DONE");
        $sym38$SKSI_TRANSLATE_ITERATE_NEXT = SubLObjectFactory.makeSymbol("SKSI-TRANSLATE-ITERATE-NEXT");
        $sym39$BOOLEAN = SubLObjectFactory.makeSymbol("BOOLEAN");
        $list40 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TUPLE-ITERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("&REST"), (SubLObject)SubLObjectFactory.makeSymbol("REST"));
        $kw41$DONE = SubLObjectFactory.makeKeyword("DONE");
        $list42 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("TUPLE-ITERATOR"), (SubLObject)SubLObjectFactory.makeSymbol("MEMOIZATION-STATE"), (SubLObject)SubLObjectFactory.makeSymbol("PHYSICAL-SCHEMA"), (SubLObject)SubLObjectFactory.makeSymbol("LOGICAL-SCHEMA"), (SubLObject)SubLObjectFactory.makeSymbol("CONTENT-MT"), (SubLObject)SubLObjectFactory.makeSymbol("META-MT"), (SubLObject)SubLObjectFactory.makeSymbol("CHECK-WFF-NESS?"));
        $const43$ist = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist"));
        $str44$__SKSI__A_ = SubLObjectFactory.makeString("~&SKSI-~A ");
        $str45$__a__Translating__s_wrt__a__a__a_ = SubLObjectFactory.makeString("[~a] Translating ~s wrt ~a ~a ~a into ~a");
        $str46$Raw_sentence___s = SubLObjectFactory.makeString("Raw sentence: ~s");
        $str47$Decoded_sentence___s = SubLObjectFactory.makeString("Decoded sentence: ~s");
        $str48$Logical_sentence___s = SubLObjectFactory.makeString("Logical sentence: ~s");
        $str49$Logical_conjunct___s = SubLObjectFactory.makeString("Logical conjunct: ~s");
        $str50$Skipped_due_to_wholly_untranslata = SubLObjectFactory.makeString("Skipped due to wholly untranslatable.");
        $const51$True = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("True"));
        $str52$Skipped_due_to_tautology_ = SubLObjectFactory.makeString("Skipped due to tautology.");
        $str53$Skipped_due_to_unreformulatable_ = SubLObjectFactory.makeString("Skipped due to unreformulatable.");
        $str54$Translation___s = SubLObjectFactory.makeString("Translation: ~s");
        $str55$skipped_for_an_unknown_reason___a = SubLObjectFactory.makeString("skipped for an unknown reason: ~a");
        $str56$The_raw_tuple__S_using_the_physic = SubLObjectFactory.makeString("The raw tuple ~S using the physical schema ~S and the logical schema ~S resulted in the logical sentence ~S in the content mt ~S which was ");
        $sym57$EXPLANATION_OF_WHY_NOT_WFF_ASSERT = SubLObjectFactory.makeSymbol("EXPLANATION-OF-WHY-NOT-WFF-ASSERT");
        $sym58$EXPLANATION_OF_WHY_NOT_ADMITTED_SENTENCE_WRT_ASENT_ARG_CONSTRAINT = SubLObjectFactory.makeSymbol("EXPLANATION-OF-WHY-NOT-ADMITTED-SENTENCE-WRT-ASENT-ARG-CONSTRAINTS");
        $str59$skipped_due_to_ill_formedness__ty = SubLObjectFactory.makeString("skipped due to ill-formedness, type coercion successful but ill-formed: ~a");
        $str60$skipped_due_to_ill_formedness__ty = SubLObjectFactory.makeString("skipped due to ill-formedness, type coercion unsuccessful: ~a");
        $str61$skipped_due_to_ill_formedness__ty = SubLObjectFactory.makeString("skipped due to ill-formedness (type coercion unnecessary): ~a");
        $str62$skipped_due_to_ill_formedness___a = SubLObjectFactory.makeString("skipped due to ill-formedness: ~a");
        $str63$skipped_due_to_an_invalid_predica = SubLObjectFactory.makeString("skipped due to an invalid predicate: ~a");
        $kw64$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $kw65$UNTRANSLATABLE = SubLObjectFactory.makeKeyword("UNTRANSLATABLE");
        $kw66$UNREFORMULATABLE = SubLObjectFactory.makeKeyword("UNREFORMULATABLE");
        $kw67$NULL = SubLObjectFactory.makeKeyword("NULL");
        $list68 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IMDB-MovieActors-KS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Unforgiven (1992)"), (SubLObject)SubLObjectFactory.makeString("Eastwood, Clint")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeString("Unforgiven (1992)"), (SubLObject)SubLObjectFactory.makeString("Hackman, Gene"))));
        $kw69$BATCH = SubLObjectFactory.makeKeyword("BATCH");
        $sym70$SKSI_RAW_TUPLE_TRANSLATION_PATTERN = SubLObjectFactory.makeSymbol("SKSI-RAW-TUPLE-TRANSLATION-PATTERN");
        $const71$fieldValue = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("fieldValue"));
        $kw72$VALUE = SubLObjectFactory.makeKeyword("VALUE");
        $kw73$TUPLE = SubLObjectFactory.makeKeyword("TUPLE");
        $sym74$SKSI_RAW_SENTENCE_TRANSLATION_PATTERN = SubLObjectFactory.makeSymbol("SKSI-RAW-SENTENCE-TRANSLATION-PATTERN");
        $const75$IMDB_MovieActors_PS = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IMDB-MovieActors-PS"));
        $const76$IMDB_MovieActors_LS = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("IMDB-MovieActors-LS"));
        $list77 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("fieldValue")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("RAW-1"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("fieldValue")), (SubLObject)SubLObjectFactory.makeKeyword("ANYTHING"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("BIND"), (SubLObject)SubLObjectFactory.makeSymbol("RAW-2")))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("SKSI-SIMPLIFY-DECODED-SENTENCE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("indexicalReferent")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Movie-CW"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("SKSI-BATCH-REFORMULATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("MovieNamedFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("RAW-1")))), (SubLObject)SubLObjectFactory.makeSymbol("CONTENT-MT")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("indexicalReferent")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CALL"), (SubLObject)SubLObjectFactory.makeSymbol("SKSI-BATCH-REFORMULATE"), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PersonNamedFn")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("VALUE"), (SubLObject)SubLObjectFactory.makeSymbol("RAW-2")))), (SubLObject)SubLObjectFactory.makeSymbol("CONTENT-MT")))));
        $list78 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Movie-CW"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheFn")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Person"))));
        $kw79$ANYTHING = SubLObjectFactory.makeKeyword("ANYTHING");
        $kw80$BIND = SubLObjectFactory.makeKeyword("BIND");
        $kw81$CALL = SubLObjectFactory.makeKeyword("CALL");
        $sym82$POSSIBLY_OVERRIDE_PHYSICAL_FIELD_VALUE = SubLObjectFactory.makeSymbol("POSSIBLY-OVERRIDE-PHYSICAL-FIELD-VALUE");
        $sym83$PHYSICAL_FIELD_FOR_INDEXICAL = SubLObjectFactory.makeSymbol("PHYSICAL-FIELD-FOR-INDEXICAL");
        $const84$indexicalReferent = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("indexicalReferent"));
        $sym85$SKSI_BATCH_REFORMULATE = SubLObjectFactory.makeSymbol("SKSI-BATCH-REFORMULATE");
        $kw86$TEMPLATE = SubLObjectFactory.makeKeyword("TEMPLATE");
        $sym87$SKSI_SIMPLIFY_DECODED_SENTENCE = SubLObjectFactory.makeSymbol("SKSI-SIMPLIFY-DECODED-SENTENCE");
        $const88$fieldWithPhysicalValueMapsToPhysi = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("fieldWithPhysicalValueMapsToPhysicalValue"));
        $kw89$UNDECODED = SubLObjectFactory.makeKeyword("UNDECODED");
        $kw90$DECODE = SubLObjectFactory.makeKeyword("DECODE");
        $str91$Failed_to_compute_a_justification = SubLObjectFactory.makeString("Failed to compute a justification for ~a in ~a: this assertion will not be retractable");
        $const92$tablePrimaryKeyValues = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("tablePrimaryKeyValues"));
        $kw93$OPAQUE = SubLObjectFactory.makeKeyword("OPAQUE");
        $const94$schemaTranslation = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("schemaTranslation"));
        $list95 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*SKSI-BATCH-TEMPLATES*"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INITIALIZE-SKSI-BATCH-TEMPLATES"))));
        $sym96$PROGN = SubLObjectFactory.makeSymbol("PROGN");
        $list97 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CLEAR-SKSI-BATCH-TEMPLATES")));
        $list98 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("USE-THEM?"), (SubLObject)SubLObjectFactory.makeSymbol("&BODY"), (SubLObject)SubLObjectFactory.makeSymbol("BODY"));
        $sym99$PIF = SubLObjectFactory.makeSymbol("PIF");
        $sym100$WITH_SKSI_BATCH_TEMPLATES = SubLObjectFactory.makeSymbol("WITH-SKSI-BATCH-TEMPLATES");
        $sym101$INITIALIZE_SKSI_BATCH_TEMPLATES = SubLObjectFactory.makeSymbol("INITIALIZE-SKSI-BATCH-TEMPLATES");
        $str102$Cannot_handle_nested_SKSI_batch_i = SubLObjectFactory.makeString("Cannot handle nested SKSI batch instantiation templates");
        $sym103$CLEAR_SKSI_BATCH_TEMPLATES = SubLObjectFactory.makeSymbol("CLEAR-SKSI-BATCH-TEMPLATES");
        $sym104$ALLOWED_RULES_SPEC_P = SubLObjectFactory.makeSymbol("ALLOWED-RULES-SPEC-P");
        $sym105$LOGICAL_FIELD_INDEXICAL_P = SubLObjectFactory.makeSymbol("LOGICAL-FIELD-INDEXICAL-P");
        $sym106$NART_P = SubLObjectFactory.makeSymbol("NART-P");
        $sym107$SKSI_BATCH_TEMPLATE_P = SubLObjectFactory.makeSymbol("SKSI-BATCH-TEMPLATE-P");
        $sym108$CONVERT_SQL_DATUM_TO_STRING = SubLObjectFactory.makeSymbol("CONVERT-SQL-DATUM-TO-STRING");
        $sym109$DOUBLE_FLOAT = SubLObjectFactory.makeSymbol("DOUBLE-FLOAT");
        $list110 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("implies")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("and")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("schemaTranslation")), (SubLObject)SubLObjectFactory.makeSymbol("?SOURCE"), (SubLObject)SubLObjectFactory.makeSymbol("?CONTENT-MT")), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("rowInSourceClaims")), (SubLObject)SubLObjectFactory.makeSymbol("?SOURCE"), (SubLObject)SubLObjectFactory.makeSymbol("?SENTENCE"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ist")), (SubLObject)SubLObjectFactory.makeSymbol("?CONTENT-MT"), (SubLObject)SubLObjectFactory.makeSymbol("?SENTENCE")));
        $const111$SKSIMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SKSIMt"));
        $sym112$SKSI_SCHEMA_TRANSLATION_LIFTING_RULE = SubLObjectFactory.makeSymbol("SKSI-SCHEMA-TRANSLATION-LIFTING-RULE");
        $str113$Could_not_find_the_SKSI_schemaTra = SubLObjectFactory.makeString("Could not find the SKSI schemaTranslation lifting rule ~s in ~s");
        $sym114$_SKSI_SCHEMA_TRANSLATION_LIFTING_RULE_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*SKSI-SCHEMA-TRANSLATION-LIFTING-RULE-CACHING-STATE*");
        $sym115$SKSI_GET_DATUM_VAR = SubLObjectFactory.makeSymbol("SKSI-GET-DATUM-VAR");
        $str116$DATUM_ = SubLObjectFactory.makeString("DATUM-");
        $sym117$_SKSI_GET_DATUM_VAR_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*SKSI-GET-DATUM-VAR-CACHING-STATE*");
        $sym118$SKSI_GET_RAW_VAR = SubLObjectFactory.makeSymbol("SKSI-GET-RAW-VAR");
        $str119$RAW_ = SubLObjectFactory.makeString("RAW-");
        $sym120$_SKSI_GET_RAW_VAR_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*SKSI-GET-RAW-VAR-CACHING-STATE*");
        $sym121$SKSI_GET_ARG_VAR = SubLObjectFactory.makeSymbol("SKSI-GET-ARG-VAR");
        $str122$ARG_ = SubLObjectFactory.makeString("ARG-");
        $sym123$_SKSI_GET_ARG_VAR_CACHING_STATE_ = SubLObjectFactory.makeSymbol("*SKSI-GET-ARG-VAR-CACHING-STATE*");
        $str124$Assertion_of__s_in__s_failed___a = SubLObjectFactory.makeString("Assertion of ~s in ~s failed: ~a");
        $kw125$CHECK_WFF_ = SubLObjectFactory.makeKeyword("CHECK-WFF?");
        $str126$Deduction_of__s_in__s_with_suppor = SubLObjectFactory.makeString("Deduction of ~s in ~s with supports ~s failed: ~a");
        $str127$Unassert_of__s_from__s_failed___a = SubLObjectFactory.makeString("Unassert of ~s from ~s failed: ~a");
        $sym128$_EXIT = SubLObjectFactory.makeSymbol("%EXIT");
        $sym129$TEST_SKSI_WFF_CHECK_BATCH_TRANSLATED_SENTENCE = SubLObjectFactory.makeSymbol("TEST-SKSI-WFF-CHECK-BATCH-TRANSLATED-SENTENCE");
    }
}

/*

	Total time: 1156 ms
	
*/