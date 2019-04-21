package com.cyc.cycjava.cycl;

import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures;
import com.cyc.tool.subl.util.SubLFiles;
import com.cyc.cycjava.cycl.rtp.rtp_initialize;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Threads;
import com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.reader;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Types;
import com.cyc.cycjava.cycl.rtp.iterative_template_parser;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.compatibility;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Locks;
import com.cyc.cycjava.cycl.rtp.rtp_type_checkers;
import com.cyc.cycjava.cycl.rtp.rtp_iterators;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.PrintLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_macros;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.cdestructuring_bind;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;

public final class rkf_text_processors extends SubLTranslatedFile
{
    public static final SubLFile me;
    public static final String myName = "com.cyc.cycjava.cycl.rkf_text_processors";
    public static final String myFingerPrint = "5b1490227dbf1988bc8f6fb79cbd33b1d5277171e019020ffb3e22a5be3398cd";
    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 2115L)
    public static SubLSymbol $rkf_text_proc_resolve_parses$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 3928L)
    private static SubLSymbol $resolve_parse_interpretation_max_depth$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 3993L)
    private static SubLSymbol $resolve_parse_recursion_depth$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 4050L)
    private static SubLSymbol $resolve_parse_recursion_show_warningsP$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 8979L)
    public static SubLSymbol $dtp_parse_result$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 9371L)
    private static SubLSymbol $rkf_textproc_print_parse_result_tersely$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 12724L)
    private static SubLSymbol $rkf_uttrdr_allow_nltagsP$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 12827L)
    private static SubLSymbol $rkf_uttrdr_full_spans_onlyP$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 15544L)
    private static SubLSymbol $rkf_term_reader_default_templates$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 16365L)
    private static SubLSymbol $rkf_term_reader_cycl_template_mappings$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 17058L)
    private static SubLSymbol $rkf_uttrdr_arg_type_to_template_categories$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 19374L)
    public static SubLSymbol $pmg_ordering$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 22704L)
    private static SubLSymbol $rkf_terms_forager_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 23369L)
    public static SubLSymbol $dtp_parse_module_definition$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 24068L)
    private static SubLSymbol $rkf_uttrdr_default_cost$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 24119L)
    private static SubLSymbol $rkf_uttrdr_default_expected_expansions$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 27593L)
    public static SubLSymbol $dtp_parse_module_group$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 29790L)
    private static SubLSymbol $rkf_uttrdr_known_parsers$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 29846L)
    private static SubLSymbol $rkf_uttrdr_resolvables$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 29896L)
    public static SubLSymbol $rkf_uttrdr_psp_return_mode$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 29956L)
    private static SubLSymbol $rkf_uttrdr_known_parsers_lock$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 42185L)
    private static SubLSymbol $rkf_uttrdr_use_vpp_in_itp$;
    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 48811L)
    private static SubLSymbol $rkf_uttrdr_marker$;
    private static final SubLList $list0;
    private static final SubLSymbol $sym1$CLET;
    private static final SubLList $list2;
    private static final SubLSymbol $sym3$RKF_UTTRDR_ORDER_PARSES;
    private static final SubLString $str4$Exceeded_recursion_depth__S_for_R;
    private static final SubLSymbol $kw5$IGNORE;
    private static final SubLList $list6;
    private static final SubLSymbol $sym7$PARSE_RESULT;
    private static final SubLSymbol $sym8$PARSE_RESULT_P;
    private static final SubLList $list9;
    private static final SubLList $list10;
    private static final SubLList $list11;
    private static final SubLList $list12;
    private static final SubLSymbol $sym13$PRINT_PARSE_RESULT;
    private static final SubLSymbol $sym14$PARSE_RESULT_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list15;
    private static final SubLSymbol $sym16$PARSE_RESULT_ORIGINAL;
    private static final SubLSymbol $sym17$_CSETF_PARSE_RESULT_ORIGINAL;
    private static final SubLSymbol $sym18$PARSE_RESULT_CONSTITUENTS;
    private static final SubLSymbol $sym19$_CSETF_PARSE_RESULT_CONSTITUENTS;
    private static final SubLSymbol $sym20$PARSE_RESULT_ELIMINATED;
    private static final SubLSymbol $sym21$_CSETF_PARSE_RESULT_ELIMINATED;
    private static final SubLSymbol $sym22$PARSE_RESULT_PROBLEMS;
    private static final SubLSymbol $sym23$_CSETF_PARSE_RESULT_PROBLEMS;
    private static final SubLSymbol $sym24$PARSE_RESULT_SOLUTIONS;
    private static final SubLSymbol $sym25$_CSETF_PARSE_RESULT_SOLUTIONS;
    private static final SubLSymbol $kw26$ORIGINAL;
    private static final SubLSymbol $kw27$CONSTITUENTS;
    private static final SubLSymbol $kw28$ELIMINATED;
    private static final SubLSymbol $kw29$PROBLEMS;
    private static final SubLSymbol $kw30$SOLUTIONS;
    private static final SubLString $str31$Invalid_slot__S_for_construction_;
    private static final SubLSymbol $kw32$BEGIN;
    private static final SubLSymbol $sym33$MAKE_PARSE_RESULT;
    private static final SubLSymbol $kw34$SLOT;
    private static final SubLSymbol $kw35$END;
    private static final SubLSymbol $sym36$VISIT_DEFSTRUCT_OBJECT_PARSE_RESULT_METHOD;
    private static final SubLList $list37;
    private static final SubLObject $const38$TheList;
    private static final SubLString $str39$__Original______S__;
    private static final SubLString $str40$Constituents;
    private static final SubLString $str41$Eliminations;
    private static final SubLString $str42$Open_Issues;
    private static final SubLString $str43$Issue_Resolutions;
    private static final SubLString $str44$___A___;
    private static final SubLString $str45$__none____;
    private static final SubLString $str46$___S______S____;
    private static final SubLList $list47;
    private static final SubLList $list48;
    private static final SubLList $list49;
    private static final SubLObject $const50$ImperativeTemplate;
    private static final SubLObject $const51$STemplate;
    private static final SubLObject $const52$QuestionTemplate;
    private static final SubLString $str53$Parsing_Pipeline;
    private static final SubLSymbol $sym54$STORE_RTP_PARSES_IN_PIPELINE;
    private static final SubLObject $const55$CycRecursiveTemplateParser;
    private static final SubLSymbol $kw56$FORKED;
    private static final SubLList $list57;
    private static final SubLList $list58;
    private static final SubLSymbol $sym59$RELEVANT_MT_IS_GENL_MT;
    private static final SubLList $list60;
    private static final SubLSymbol $kw61$QUALITY;
    private static final SubLObject $const62$ScenarioTemplate;
    private static final SubLSymbol $sym63$TIME_INTERVAL_;
    private static final SubLObject $const64$RKFParsingMt;
    private static final SubLObject $const65$DateTemplate;
    private static final SubLSymbol $kw66$DONE;
    private static final SubLSymbol $sym67$_RKF_TERMS_FORAGER_LOCK_;
    private static final SubLString $str68$Terms_Forager;
    private static final SubLList $list69;
    private static final SubLSymbol $sym70$PARSE_MODULE_DEFINITION;
    private static final SubLSymbol $sym71$PARSE_MODULE_DEFINITION_P;
    private static final SubLList $list72;
    private static final SubLList $list73;
    private static final SubLList $list74;
    private static final SubLList $list75;
    private static final SubLSymbol $sym76$PMD_PRINT;
    private static final SubLSymbol $sym77$PARSE_MODULE_DEFINITION_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list78;
    private static final SubLSymbol $sym79$PMD_NAME;
    private static final SubLSymbol $sym80$_CSETF_PMD_NAME;
    private static final SubLSymbol $sym81$PMD_CATEGORY;
    private static final SubLSymbol $sym82$_CSETF_PMD_CATEGORY;
    private static final SubLSymbol $sym83$PMD_QUALITY;
    private static final SubLSymbol $sym84$_CSETF_PMD_QUALITY;
    private static final SubLSymbol $sym85$PMD_ENTRY_POINT;
    private static final SubLSymbol $sym86$_CSETF_PMD_ENTRY_POINT;
    private static final SubLSymbol $sym87$PMD_COST;
    private static final SubLSymbol $sym88$_CSETF_PMD_COST;
    private static final SubLSymbol $sym89$PMD_EXPECTED_EXPANSIONS;
    private static final SubLSymbol $sym90$_CSETF_PMD_EXPECTED_EXPANSIONS;
    private static final SubLSymbol $sym91$PMD_SUPPLANTS;
    private static final SubLSymbol $sym92$_CSETF_PMD_SUPPLANTS;
    private static final SubLSymbol $kw93$NAME;
    private static final SubLSymbol $kw94$CATEGORY;
    private static final SubLSymbol $kw95$ENTRY_POINT;
    private static final SubLSymbol $kw96$COST;
    private static final SubLSymbol $kw97$EXPECTED_EXPANSIONS;
    private static final SubLSymbol $kw98$SUPPLANTS;
    private static final SubLSymbol $sym99$MAKE_PARSE_MODULE_DEFINITION;
    private static final SubLSymbol $sym100$VISIT_DEFSTRUCT_OBJECT_PARSE_MODULE_DEFINITION_METHOD;
    private static final SubLString $str101$_PARSE_MODULE_DEFINITION__S_;
    private static final SubLString $str102$Can_t_resolve_quality_of__S_;
    private static final SubLString $str103$Parser__S_for__S__Func___S_Heur__;
    private static final SubLString $str104$___Suppl__S_;
    private static final SubLString $str105$Class__D____Qual__D____Cost__D___;
    private static final SubLSymbol $sym106$CATCH_ERROR_MESSAGE_HANDLER;
    private static final SubLSymbol $sym107$PARSE_MODULE_GROUP;
    private static final SubLSymbol $sym108$PARSE_MODULE_GROUP_P;
    private static final SubLList $list109;
    private static final SubLList $list110;
    private static final SubLList $list111;
    private static final SubLList $list112;
    private static final SubLSymbol $sym113$DEFAULT_STRUCT_PRINT_FUNCTION;
    private static final SubLSymbol $sym114$PARSE_MODULE_GROUP_PRINT_FUNCTION_TRAMPOLINE;
    private static final SubLList $list115;
    private static final SubLSymbol $sym116$PMG_CATEGORY;
    private static final SubLSymbol $sym117$_CSETF_PMG_CATEGORY;
    private static final SubLSymbol $sym118$PMG_TOOLS;
    private static final SubLSymbol $sym119$_CSETF_PMG_TOOLS;
    private static final SubLSymbol $kw120$TOOLS;
    private static final SubLSymbol $sym121$MAKE_PARSE_MODULE_GROUP;
    private static final SubLSymbol $sym122$VISIT_DEFSTRUCT_OBJECT_PARSE_MODULE_GROUP_METHOD;
    private static final SubLSymbol $sym123$PMD_EXPECTED_EXPANSIONS_;
    private static final SubLSymbol $sym124$PMD_COST_;
    private static final SubLSymbol $sym125$PMD_QUALITY_;
    private static final SubLString $str126$__Parse_Group_for__S___;
    private static final SubLString $str127$Tools__in_order______;
    private static final SubLSymbol $sym128$_RKF_UTTRDR_KNOWN_PARSERS_;
    private static final SubLSymbol $kw129$BEST_ONLY;
    private static final SubLSymbol $sym130$_RKF_UTTRDR_PSP_RETURN_MODE_;
    private static final SubLString $str131$Known_Parsers;
    private static final SubLSymbol $sym132$WITH_LOCK_HELD;
    private static final SubLList $list133;
    private static final SubLSymbol $sym134$RKF_UTTRDR_PMD_ORDERED_;
    private static final SubLString $str135$No_known_parsers_for_category__S_;
    private static final SubLSymbol $kw136$CLEARED;
    private static final SubLList $list137;
    private static final SubLSymbol $sym138$PMD;
    private static final SubLSymbol $sym139$CURR;
    private static final SubLSymbol $sym140$KEY;
    private static final SubLSymbol $sym141$VALUE;
    private static final SubLSymbol $sym142$NAME;
    private static final SubLSymbol $sym143$CATEGORY;
    private static final SubLSymbol $sym144$ENTRY_POINT;
    private static final SubLSymbol $sym145$DOCSTRING;
    private static final SubLSymbol $sym146$COST;
    private static final SubLSymbol $sym147$QUALITY;
    private static final SubLSymbol $sym148$EXPECTED_EXPANSIONS;
    private static final SubLSymbol $sym149$SUPPLANTS;
    private static final SubLSymbol $sym150$IGNORE;
    private static final SubLSymbol $sym151$CDOLIST;
    private static final SubLSymbol $sym152$CDESTRUCTURING_BIND;
    private static final SubLSymbol $sym153$PCASE;
    private static final SubLSymbol $sym154$CSETQ;
    private static final SubLSymbol $kw155$DOC;
    private static final SubLSymbol $sym156$OTHERWISE;
    private static final SubLSymbol $sym157$ERROR;
    private static final SubLString $str158$Invalid_key__S_in_parser_module_r;
    private static final SubLSymbol $sym159$NEW_PARSE_MODULE_DEFINITION;
    private static final SubLSymbol $sym160$RKF_UTTRDR_REGISTER_PARSER;
    private static final SubLList $list161;
    private static final SubLList $list162;
    private static final SubLList $list163;
    private static final SubLList $list164;
    private static final SubLList $list165;
    private static final SubLList $list166;
    private static final SubLList $list167;
    private static final SubLList $list168;
    private static final SubLList $list169;
    private static final SubLList $list170;
    private static final SubLList $list171;
    private static final SubLList $list172;
    private static final SubLList $list173;
    private static final SubLList $list174;
    private static final SubLList $list175;
    private static final SubLList $list176;
    private static final SubLList $list177;
    private static final SubLList $list178;
    private static final SubLList $list179;
    private static final SubLList $list180;
    private static final SubLList $list181;
    private static final SubLList $list182;
    private static final SubLList $list183;
    private static final SubLList $list184;
    private static final SubLObject $const185$infinitive;
    private static final SubLSymbol $sym186$RKF_CH_NOUN_COMPOUND_PHRASE_PARSER;
    private static final SubLSymbol $sym187$RKF_CH_DENOTATIONS_FROM_MULTI_WORD_STRING;
    private static final SubLSymbol $sym188$RKF_CH_DENOTATIONS_FOR_STRING;
    private static final SubLSymbol $sym189$RKF_TERM_FROM_STRING;
    private static final SubLSymbol $sym190$STRINGP;
    private static final SubLList $list191;
    private static final SubLSymbol $sym192$RKF_NUMBER_PARSER;
    private static final SubLString $str193$RKF_UTTRDR_MARKER;
    private static final SubLObject $const194$NLNumberFn;
    private static final SubLObject $const195$NLQuantFn;
    private static final SubLObject $const196$NLQuantFn_3;
    private static final SubLObject $const197$NumericalQuant_NLAttrFn;
    private static final SubLObject $const198$GroupOfCardinalityFn;
    private static final SubLList $list199;
    private static final SubLSymbol $sym200$IS_THIS_A_NUMERIC_SPAN_;
    private static final SubLSymbol $sym201$IS_THIS_A_QUANT_FN_;
    private static final SubLList $list202;
    private static final SubLList $list203;
    private static final SubLSymbol $sym204$RKF_CH_PARSING_SURROGATE_P;
    private static final SubLList $list205;
    private static final SubLList $list206;
    private static final SubLSymbol $sym207$HLMT_;
    private static final SubLSymbol $sym208$PROPERTY_LIST_P;
    private static final SubLSymbol $kw209$STRENGTHEN_;
    private static final SubLSymbol $kw210$MULTIPLE_QUANTIFICATIONS;
    private static final SubLSymbol $kw211$WFF_CHECK_;
    private static final SubLSymbol $kw212$SEMANTIC_MT;
    private static final SubLSymbol $kw213$PARSING_MT;
    private static final SubLSymbol $kw214$FORCE;
    private static final SubLSymbol $kw215$DECLARATIVE;
    private static final SubLSymbol $sym216$MEMOIZATION_STATE_P;
    private static final SubLSymbol $sym217$PARSE_A_SENTENCE_COMPLETELY;
    private static final SubLList $list218;
    private static final SubLString $str219$This_function_returns_all_the_dec;
    private static final SubLList $list220;
    private static final SubLList $list221;
    private static final SubLString $str222$_;
    private static final SubLSymbol $kw223$QUERY;
    private static final SubLSymbol $sym224$PARSE_A_QUESTION_COMPLETELY;
    private static final SubLString $str225$This_function_returns_all_the_que;
    private static final SubLString $str226$RTP_is_not_initialized___So__test;
    private static final SubLString $str227$RTP_is_not_initialized___So__test;

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 1399L)
    public static SubLObject rkf_textproc_parse_to_dictionary(final SubLObject parses, SubLObject v_dictionary) {
        if (v_dictionary == rkf_text_processors.UNPROVIDED) {
            v_dictionary = (SubLObject)rkf_text_processors.NIL;
        }
        if (rkf_text_processors.NIL == dictionary.dictionary_p(v_dictionary)) {
            v_dictionary = dictionary.new_dictionary((SubLObject)rkf_text_processors.EQUALP, (SubLObject)rkf_text_processors.UNPROVIDED);
        }
        SubLObject cdolist_list_var = parses;
        SubLObject constituent = (SubLObject)rkf_text_processors.NIL;
        constituent = cdolist_list_var.first();
        while (rkf_text_processors.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = constituent;
            SubLObject span = (SubLObject)rkf_text_processors.NIL;
            SubLObject interpretations = (SubLObject)rkf_text_processors.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list0);
            span = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list0);
            interpretations = current.first();
            current = current.rest();
            if (rkf_text_processors.NIL == current) {
                final SubLObject processed_interpretations = rkf_textproc_preprocess_interps(interpretations);
                dictionary.dictionary_enter(v_dictionary, span, processed_interpretations);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_text_processors.$list0);
            }
            cdolist_list_var = cdolist_list_var.rest();
            constituent = cdolist_list_var.first();
        }
        return v_dictionary;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 1917L)
    public static SubLObject rkf_textproc_preprocess_interps(final SubLObject interps) {
        SubLObject result = (SubLObject)rkf_text_processors.NIL;
        SubLObject cdolist_list_var = interps;
        SubLObject interp = (SubLObject)rkf_text_processors.NIL;
        interp = cdolist_list_var.first();
        while (rkf_text_processors.NIL != cdolist_list_var) {
            result = (SubLObject)ConsesLow.cons(parsing_utilities.possibly_uniquify_variablefn(interp), result);
            cdolist_list_var = cdolist_list_var.rest();
            interp = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 2246L)
    public static SubLObject with_fully_resolved_parses(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)rkf_text_processors.$sym1$CLET, (SubLObject)rkf_text_processors.$list2, ConsesLow.append(body, (SubLObject)rkf_text_processors.NIL));
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 2370L)
    public static SubLObject rkf_textproc_dictionary_to_parse(final SubLObject v_dictionary) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (rkf_text_processors.NIL != rkf_text_processors.$rkf_text_proc_resolve_parses$.getDynamicValue(thread)) {
            return rkf_textproc_dictionary_to_resolved_parse(v_dictionary);
        }
        return rkf_textproc_dictionary_to_parse_wXsurrogates(v_dictionary);
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 2612L)
    public static SubLObject rkf_textproc_dictionary_to_parse_wXsurrogates(final SubLObject v_dictionary) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject parse = (SubLObject)rkf_text_processors.NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_dictionary)); rkf_text_processors.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject span = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject interpretations = thread.secondMultipleValue();
            thread.resetMultipleValues();
            parse = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(span, interpretations), parse);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return Sort.sort(parse, (SubLObject)rkf_text_processors.$sym3$RKF_UTTRDR_ORDER_PARSES, (SubLObject)rkf_text_processors.UNPROVIDED);
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 2863L)
    public static SubLObject rkf_textproc_dictionary_to_resolved_parse(final SubLObject v_dictionary) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject parse = (SubLObject)rkf_text_processors.NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_dictionary)); rkf_text_processors.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject span = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject interpretations = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject result_interps = (SubLObject)rkf_text_processors.NIL;
            SubLObject cdolist_list_var = interpretations;
            SubLObject interpretation = (SubLObject)rkf_text_processors.NIL;
            interpretation = cdolist_list_var.first();
            while (rkf_text_processors.NIL != cdolist_list_var) {
                if (rkf_text_processors.NIL != parsing_utilities.formula_contains_result_of_parsingP(interpretation)) {
                    final SubLObject resolved_interpretations = resolve_parse_interpretation(interpretation, span, v_dictionary);
                    if (rkf_text_processors.NIL != resolved_interpretations) {
                        result_interps = Sequences.cconcatenate(result_interps, resolved_interpretations);
                    }
                }
                else {
                    final SubLObject item_var = interpretation;
                    if (rkf_text_processors.NIL == conses_high.member(item_var, result_interps, (SubLObject)rkf_text_processors.EQUALP, Symbols.symbol_function((SubLObject)rkf_text_processors.IDENTITY))) {
                        result_interps = (SubLObject)ConsesLow.cons(item_var, result_interps);
                    }
                }
                cdolist_list_var = cdolist_list_var.rest();
                interpretation = cdolist_list_var.first();
            }
            parse = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(span, result_interps), parse);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return Sort.sort(parse, (SubLObject)rkf_text_processors.$sym3$RKF_UTTRDR_ORDER_PARSES, (SubLObject)rkf_text_processors.UNPROVIDED);
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 4118L)
    public static SubLObject resolve_parse_interpretation(final SubLObject cycl, final SubLObject span, final SubLObject v_dictionary) {
        if (rkf_text_processors.NIL != parsing_utilities.result_of_parsing_formulaP(cycl)) {
            return maybe_resolve_result_of_parsing_naut(cycl, span, v_dictionary);
        }
        if (rkf_text_processors.NIL == parsing_utilities.formula_contains_result_of_parsingP(cycl)) {
            return (SubLObject)ConsesLow.list(cycl);
        }
        return resolve_parse_interpretation_args(cycl, span, v_dictionary);
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 4648L)
    public static SubLObject maybe_resolve_result_of_parsing_naut(final SubLObject rop_naut, final SubLObject matrix_span, final SubLObject v_dictionary) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)rkf_text_processors.NIL;
        final SubLObject span = parsing_utilities.result_of_parsing_span_wXo_thelist(rop_naut);
        final SubLObject _prev_bind_0 = rkf_text_processors.$resolve_parse_recursion_depth$.currentBinding(thread);
        try {
            rkf_text_processors.$resolve_parse_recursion_depth$.bind((SubLObject)(span.equal(matrix_span) ? number_utilities.f_1X(rkf_text_processors.$resolve_parse_recursion_depth$.getDynamicValue(thread)) : rkf_text_processors.ZERO_INTEGER), thread);
            if (rkf_text_processors.$resolve_parse_recursion_depth$.getDynamicValue(thread).numLE(rkf_text_processors.$resolve_parse_interpretation_max_depth$.getGlobalValue())) {
                result = resolve_result_of_parsing_naut(rop_naut, span, v_dictionary);
            }
            else if (rkf_text_processors.NIL != rkf_text_processors.$resolve_parse_recursion_show_warningsP$.getDynamicValue(thread)) {
                Errors.warn((SubLObject)rkf_text_processors.$str4$Exceeded_recursion_depth__S_for_R, rkf_text_processors.$resolve_parse_interpretation_max_depth$.getGlobalValue(), rop_naut);
            }
        }
        finally {
            rkf_text_processors.$resolve_parse_recursion_depth$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 5469L)
    public static SubLObject resolve_result_of_parsing_naut(final SubLObject rop_naut, final SubLObject span, final SubLObject v_dictionary) {
        final SubLObject span_parses = dictionary.dictionary_lookup(v_dictionary, span, (SubLObject)rkf_text_processors.UNPROVIDED);
        SubLObject result = (SubLObject)rkf_text_processors.NIL;
        SubLObject cdolist_list_var = span_parses;
        SubLObject span_parse = (SubLObject)rkf_text_processors.NIL;
        span_parse = cdolist_list_var.first();
        while (rkf_text_processors.NIL != cdolist_list_var) {
            if (rkf_text_processors.NIL == cycl_utilities.expression_find(rop_naut, span_parse, (SubLObject)rkf_text_processors.UNPROVIDED, (SubLObject)rkf_text_processors.UNPROVIDED, (SubLObject)rkf_text_processors.UNPROVIDED) && (rkf_text_processors.NIL == parsing_utilities.result_of_parsing_formulaP(span_parse) || !span.equal(parsing_utilities.result_of_parsing_span_wXo_thelist(span_parse)))) {
                SubLObject cdolist_list_var_$1 = resolve_parse_interpretation(span_parse, span, v_dictionary);
                SubLObject resolved_parse = (SubLObject)rkf_text_processors.NIL;
                resolved_parse = cdolist_list_var_$1.first();
                while (rkf_text_processors.NIL != cdolist_list_var_$1) {
                    final SubLObject item_var = resolved_parse;
                    if (rkf_text_processors.NIL == conses_high.member(item_var, result, Symbols.symbol_function((SubLObject)rkf_text_processors.EQUAL), Symbols.symbol_function((SubLObject)rkf_text_processors.IDENTITY))) {
                        result = (SubLObject)ConsesLow.cons(item_var, result);
                    }
                    cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                    resolved_parse = cdolist_list_var_$1.first();
                }
            }
            cdolist_list_var = cdolist_list_var.rest();
            span_parse = cdolist_list_var.first();
        }
        return result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 6523L)
    public static SubLObject resolve_parse_interpretation_args(final SubLObject cycl, final SubLObject span, final SubLObject v_dictionary) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        thread.resetMultipleValues();
        final SubLObject template = rkf_parse_wff_check_template(cycl);
        final SubLObject rop_argnums = thread.secondMultipleValue();
        thread.resetMultipleValues();
        SubLObject arg_binding_lists = (SubLObject)rkf_text_processors.NIL;
        SubLObject result = (SubLObject)rkf_text_processors.NIL;
        SubLObject argnum = (SubLObject)rkf_text_processors.ZERO_INTEGER;
        SubLObject cdolist_list_var;
        final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(cycl, (SubLObject)rkf_text_processors.$kw5$IGNORE);
        SubLObject arg = (SubLObject)rkf_text_processors.NIL;
        arg = cdolist_list_var.first();
        while (rkf_text_processors.NIL != cdolist_list_var) {
            argnum = Numbers.add(argnum, (SubLObject)rkf_text_processors.ONE_INTEGER);
            if (rkf_text_processors.NIL != subl_promotions.memberP(argnum, rop_argnums, (SubLObject)rkf_text_processors.UNPROVIDED, (SubLObject)rkf_text_processors.UNPROVIDED)) {
                final SubLObject generic_arg = at_utilities.get_generic_arg(argnum);
                SubLObject arg_bindings = (SubLObject)rkf_text_processors.NIL;
                SubLObject cdolist_list_var_$2 = resolve_parse_interpretation(arg, span, v_dictionary);
                SubLObject interp = (SubLObject)rkf_text_processors.NIL;
                interp = cdolist_list_var_$2.first();
                while (rkf_text_processors.NIL != cdolist_list_var_$2) {
                    arg_bindings = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.cons(generic_arg, interp), arg_bindings);
                    cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                    interp = cdolist_list_var_$2.first();
                }
                arg_binding_lists = (SubLObject)ConsesLow.cons(arg_bindings, arg_binding_lists);
            }
            cdolist_list_var = cdolist_list_var.rest();
            arg = cdolist_list_var.first();
        }
        SubLObject cdolist_list_var2 = list_utilities.cartesian_product(arg_binding_lists, (SubLObject)rkf_text_processors.UNPROVIDED, (SubLObject)rkf_text_processors.UNPROVIDED, (SubLObject)rkf_text_processors.UNPROVIDED);
        SubLObject formula_binding_list = (SubLObject)rkf_text_processors.NIL;
        formula_binding_list = cdolist_list_var2.first();
        while (rkf_text_processors.NIL != cdolist_list_var2) {
            if (rkf_text_processors.NIL != rkf_parse_bindings_wffP(template, formula_binding_list)) {
                result = (SubLObject)ConsesLow.cons(rkf_parse_subst_bindings(template, formula_binding_list), result);
            }
            cdolist_list_var2 = cdolist_list_var2.rest();
            formula_binding_list = cdolist_list_var2.first();
        }
        return result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 7546L)
    public static SubLObject rkf_parse_bindings_wffP(final SubLObject template, final SubLObject formula_binding_list) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject badP = (SubLObject)rkf_text_processors.NIL;
        if (parsing_vars.$rkf_template_wff_filter_level$.getDynamicValue(thread).numG((SubLObject)rkf_text_processors.ONE_INTEGER) && rkf_text_processors.NIL == rbp_wff.rbp_wf_template_argsP(template, formula_binding_list, (SubLObject)rkf_text_processors.TWO_INTEGER)) {
            badP = (SubLObject)rkf_text_processors.T;
        }
        else if (parsing_vars.$rkf_template_wff_filter_level$.getDynamicValue(thread).numG((SubLObject)rkf_text_processors.ZERO_INTEGER) && rkf_text_processors.NIL == rbp_wff.rbp_wf_template_argsP(template, formula_binding_list, (SubLObject)rkf_text_processors.ONE_INTEGER)) {
            badP = (SubLObject)rkf_text_processors.T;
        }
        return (SubLObject)SubLObjectFactory.makeBoolean(rkf_text_processors.NIL == badP);
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 7958L)
    public static SubLObject rkf_parse_subst_bindings(final SubLObject template, final SubLObject formula_binding_list) {
        SubLObject result = el_utilities.copy_expression(template);
        SubLObject cdolist_list_var = formula_binding_list;
        SubLObject cons = (SubLObject)rkf_text_processors.NIL;
        cons = cdolist_list_var.first();
        while (rkf_text_processors.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = cons;
            SubLObject out = (SubLObject)rkf_text_processors.NIL;
            SubLObject in = (SubLObject)rkf_text_processors.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list6);
            out = current.first();
            current = (in = current.rest());
            result = cycl_utilities.expression_nsubst(in, out, result, (SubLObject)rkf_text_processors.UNPROVIDED, (SubLObject)rkf_text_processors.UNPROVIDED);
            cdolist_list_var = cdolist_list_var.rest();
            cons = cdolist_list_var.first();
        }
        return result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 8197L)
    public static SubLObject rkf_parse_wff_check_template(final SubLObject cycl) {
        final SubLObject template = el_utilities.copy_expression(cycl);
        SubLObject argnums = (SubLObject)rkf_text_processors.NIL;
        if (rkf_text_processors.NIL != el_utilities.el_formula_p(cycl)) {
            SubLObject argnum = (SubLObject)rkf_text_processors.ZERO_INTEGER;
            SubLObject cdolist_list_var;
            final SubLObject args = cdolist_list_var = cycl_utilities.formula_args(cycl, (SubLObject)rkf_text_processors.$kw5$IGNORE);
            SubLObject arg = (SubLObject)rkf_text_processors.NIL;
            arg = cdolist_list_var.first();
            while (rkf_text_processors.NIL != cdolist_list_var) {
                argnum = Numbers.add(argnum, (SubLObject)rkf_text_processors.ONE_INTEGER);
                if (rkf_text_processors.NIL != parsing_utilities.formula_contains_result_of_parsingP(arg)) {
                    final SubLObject var = at_utilities.get_generic_arg(argnum);
                    el_utilities.nreplace_formula_arg(argnum, var, template);
                    argnums = (SubLObject)ConsesLow.cons(argnum, argnums);
                }
                cdolist_list_var = cdolist_list_var.rest();
                arg = cdolist_list_var.first();
            }
        }
        return Values.values(template, argnums);
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 8747L)
    public static SubLObject rkf_textproc_interpret_nlterm(final SubLObject nlterm, final SubLObject mt) {
        return rkf_uttrdr_interpret_nltagfn_term(nlterm, mt);
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 8862L)
    public static SubLObject rkf_textproc_interpret_nlterms(final SubLObject nlterms, final SubLObject mt) {
        return rkf_uttrdr_interpret_nltagfn_terms(nlterms, mt);
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 8979L)
    public static SubLObject parse_result_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_parse_result(v_object, stream, (SubLObject)rkf_text_processors.ZERO_INTEGER);
        return (SubLObject)rkf_text_processors.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 8979L)
    public static SubLObject parse_result_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $parse_result_native.class) ? rkf_text_processors.T : rkf_text_processors.NIL);
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 8979L)
    public static SubLObject parse_result_original(final SubLObject v_object) {
        assert rkf_text_processors.NIL != parse_result_p(v_object) : v_object;
        return v_object.getField2();
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 8979L)
    public static SubLObject parse_result_constituents(final SubLObject v_object) {
        assert rkf_text_processors.NIL != parse_result_p(v_object) : v_object;
        return v_object.getField3();
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 8979L)
    public static SubLObject parse_result_eliminated(final SubLObject v_object) {
        assert rkf_text_processors.NIL != parse_result_p(v_object) : v_object;
        return v_object.getField4();
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 8979L)
    public static SubLObject parse_result_problems(final SubLObject v_object) {
        assert rkf_text_processors.NIL != parse_result_p(v_object) : v_object;
        return v_object.getField5();
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 8979L)
    public static SubLObject parse_result_solutions(final SubLObject v_object) {
        assert rkf_text_processors.NIL != parse_result_p(v_object) : v_object;
        return v_object.getField6();
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 8979L)
    public static SubLObject _csetf_parse_result_original(final SubLObject v_object, final SubLObject value) {
        assert rkf_text_processors.NIL != parse_result_p(v_object) : v_object;
        return v_object.setField2(value);
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 8979L)
    public static SubLObject _csetf_parse_result_constituents(final SubLObject v_object, final SubLObject value) {
        assert rkf_text_processors.NIL != parse_result_p(v_object) : v_object;
        return v_object.setField3(value);
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 8979L)
    public static SubLObject _csetf_parse_result_eliminated(final SubLObject v_object, final SubLObject value) {
        assert rkf_text_processors.NIL != parse_result_p(v_object) : v_object;
        return v_object.setField4(value);
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 8979L)
    public static SubLObject _csetf_parse_result_problems(final SubLObject v_object, final SubLObject value) {
        assert rkf_text_processors.NIL != parse_result_p(v_object) : v_object;
        return v_object.setField5(value);
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 8979L)
    public static SubLObject _csetf_parse_result_solutions(final SubLObject v_object, final SubLObject value) {
        assert rkf_text_processors.NIL != parse_result_p(v_object) : v_object;
        return v_object.setField6(value);
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 8979L)
    public static SubLObject make_parse_result(SubLObject arglist) {
        if (arglist == rkf_text_processors.UNPROVIDED) {
            arglist = (SubLObject)rkf_text_processors.NIL;
        }
        final SubLObject v_new = (SubLObject)new $parse_result_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)rkf_text_processors.NIL, next = arglist; rkf_text_processors.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)rkf_text_processors.$kw26$ORIGINAL)) {
                _csetf_parse_result_original(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw27$CONSTITUENTS)) {
                _csetf_parse_result_constituents(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw28$ELIMINATED)) {
                _csetf_parse_result_eliminated(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw29$PROBLEMS)) {
                _csetf_parse_result_problems(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw30$SOLUTIONS)) {
                _csetf_parse_result_solutions(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)rkf_text_processors.$str31$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 8979L)
    public static SubLObject visit_defstruct_parse_result(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_text_processors.$kw32$BEGIN, (SubLObject)rkf_text_processors.$sym33$MAKE_PARSE_RESULT, (SubLObject)rkf_text_processors.FIVE_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_text_processors.$kw34$SLOT, (SubLObject)rkf_text_processors.$kw26$ORIGINAL, parse_result_original(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_text_processors.$kw34$SLOT, (SubLObject)rkf_text_processors.$kw27$CONSTITUENTS, parse_result_constituents(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_text_processors.$kw34$SLOT, (SubLObject)rkf_text_processors.$kw28$ELIMINATED, parse_result_eliminated(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_text_processors.$kw34$SLOT, (SubLObject)rkf_text_processors.$kw29$PROBLEMS, parse_result_problems(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_text_processors.$kw34$SLOT, (SubLObject)rkf_text_processors.$kw30$SOLUTIONS, parse_result_solutions(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_text_processors.$kw35$END, (SubLObject)rkf_text_processors.$sym33$MAKE_PARSE_RESULT, (SubLObject)rkf_text_processors.FIVE_INTEGER);
        return obj;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 8979L)
    public static SubLObject visit_defstruct_object_parse_result_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_parse_result(obj, visitor_fn);
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 9440L)
    public static SubLObject print_parse_result(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (rkf_text_processors.NIL != rkf_text_processors.$rkf_textproc_print_parse_result_tersely$.getDynamicValue(thread)) {
            if (rkf_text_processors.NIL != print_high.$print_readably$.getDynamicValue(thread)) {
                print_high.print_not_readable(v_object, stream);
            }
            else {
                print_macros.print_unreadable_object_preamble(stream, v_object, (SubLObject)rkf_text_processors.T, (SubLObject)rkf_text_processors.NIL);
                print_macros.print_unreadable_object_postamble(stream, v_object, (SubLObject)rkf_text_processors.T, (SubLObject)rkf_text_processors.T);
            }
        }
        else {
            debug_display_parse_result(v_object, stream);
        }
        return v_object;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 9700L)
    public static SubLObject with_verbose_rkf_textproc_parse_result(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)rkf_text_processors.$sym1$CLET, (SubLObject)rkf_text_processors.$list37, ConsesLow.append(body, (SubLObject)rkf_text_processors.NIL));
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 9856L)
    public static SubLObject new_parse_result(final SubLObject parses) {
        final SubLObject parse = make_parse_result((SubLObject)rkf_text_processors.UNPROVIDED);
        _csetf_parse_result_original(parse, conses_high.copy_tree(parses));
        _csetf_parse_result_constituents(parse, dictionary.new_dictionary((SubLObject)rkf_text_processors.EQUALP, (SubLObject)rkf_text_processors.UNPROVIDED));
        _csetf_parse_result_eliminated(parse, dictionary.new_dictionary((SubLObject)rkf_text_processors.EQUALP, (SubLObject)rkf_text_processors.UNPROVIDED));
        _csetf_parse_result_problems(parse, dictionary.new_dictionary((SubLObject)rkf_text_processors.EQUALP, (SubLObject)rkf_text_processors.UNPROVIDED));
        _csetf_parse_result_solutions(parse, dictionary.new_dictionary((SubLObject)rkf_text_processors.EQUALP, (SubLObject)rkf_text_processors.UNPROVIDED));
        seed_parse_result_constituents(parse);
        return parse;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 10347L)
    public static SubLObject seed_parse_result_constituents(final SubLObject parse_result) {
        final SubLObject parses = parse_result_original(parse_result);
        final SubLObject v_dictionary = parse_result_constituents(parse_result);
        rkf_textproc_parse_to_dictionary(parses, v_dictionary);
        return parse_result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 10602L)
    public static SubLObject debug_reset_parse_results(final SubLObject parse_result) {
        dictionary.clear_dictionary(parse_result_constituents(parse_result));
        dictionary.clear_dictionary(parse_result_eliminated(parse_result));
        dictionary.clear_dictionary(parse_result_problems(parse_result));
        dictionary.clear_dictionary(parse_result_solutions(parse_result));
        seed_parse_result_constituents(parse_result);
        return parse_result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 10971L)
    public static SubLObject parse_result_emptyP(final SubLObject parse_result) {
        assert rkf_text_processors.NIL != parse_result_p(parse_result) : parse_result;
        return dictionary.dictionary_empty_p(parse_result_constituents(parse_result));
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 11141L)
    public static SubLObject parse_result_open_issuesP(final SubLObject parse_result) {
        assert rkf_text_processors.NIL != parse_result_p(parse_result) : parse_result;
        return (SubLObject)SubLObjectFactory.makeBoolean(rkf_text_processors.NIL == dictionary.dictionary_empty_p(parse_result_problems(parse_result)));
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 11321L)
    public static SubLObject parse_result_known_solutionsP(final SubLObject parse_result) {
        assert rkf_text_processors.NIL != parse_result_p(parse_result) : parse_result;
        return (SubLObject)SubLObjectFactory.makeBoolean(rkf_text_processors.NIL == dictionary.dictionary_empty_p(parse_result_solutions(parse_result)));
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 11506L)
    public static SubLObject parse_result_known_constituentP(final SubLObject parse_result, final SubLObject span) {
        SubLObject parse_span = span;
        if (parse_span.first().eql(rkf_text_processors.$const38$TheList)) {
            parse_span = parse_span.rest();
        }
        return dictionary.dictionary_lookup(parse_result_constituents(parse_result), parse_span, (SubLObject)rkf_text_processors.UNPROVIDED);
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 11801L)
    public static SubLObject debug_display_parse_result(final SubLObject parse_result, SubLObject stream) {
        if (stream == rkf_text_processors.UNPROVIDED) {
            stream = (SubLObject)rkf_text_processors.T;
        }
        PrintLow.format(stream, (SubLObject)rkf_text_processors.$str39$__Original______S__, parse_result_original(parse_result));
        debug_display_one_parts_dictionary(parse_result_constituents(parse_result), (SubLObject)rkf_text_processors.$str40$Constituents, (SubLObject)rkf_text_processors.UNPROVIDED);
        debug_display_one_parts_dictionary(parse_result_eliminated(parse_result), (SubLObject)rkf_text_processors.$str41$Eliminations, (SubLObject)rkf_text_processors.UNPROVIDED);
        debug_display_one_parts_dictionary(parse_result_problems(parse_result), (SubLObject)rkf_text_processors.$str42$Open_Issues, (SubLObject)rkf_text_processors.UNPROVIDED);
        debug_display_one_parts_dictionary(parse_result_solutions(parse_result), (SubLObject)rkf_text_processors.$str43$Issue_Resolutions, (SubLObject)rkf_text_processors.UNPROVIDED);
        return parse_result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 12372L)
    public static SubLObject debug_display_one_parts_dictionary(final SubLObject v_dictionary, final SubLObject name, SubLObject stream) {
        if (stream == rkf_text_processors.UNPROVIDED) {
            stream = (SubLObject)rkf_text_processors.T;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        PrintLow.format(stream, (SubLObject)rkf_text_processors.$str44$___A___, name);
        if (rkf_text_processors.NIL != dictionary.dictionary_empty_p(v_dictionary)) {
            PrintLow.format(stream, (SubLObject)rkf_text_processors.$str45$__none____);
            return v_dictionary;
        }
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(v_dictionary)); rkf_text_processors.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject span = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject interpretations = thread.secondMultipleValue();
            thread.resetMultipleValues();
            PrintLow.format(stream, (SubLObject)rkf_text_processors.$str46$___S______S____, span, interpretations);
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return v_dictionary;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 12884L)
    public static SubLObject without_nltags_returned(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)rkf_text_processors.$sym1$CLET, (SubLObject)rkf_text_processors.$list47, ConsesLow.append(body, (SubLObject)rkf_text_processors.NIL));
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 13095L)
    public static SubLObject rkf_uttrdr_are_nltags_allowedP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return rkf_text_processors.$rkf_uttrdr_allow_nltagsP$.getDynamicValue(thread);
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 13182L)
    public static SubLObject with_full_spans_only_returned(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)rkf_text_processors.$sym1$CLET, (SubLObject)rkf_text_processors.$list48, ConsesLow.append(body, (SubLObject)rkf_text_processors.NIL));
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 13316L)
    public static SubLObject with_subspans_returned(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)rkf_text_processors.$sym1$CLET, (SubLObject)rkf_text_processors.$list49, ConsesLow.append(body, (SubLObject)rkf_text_processors.NIL));
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 13443L)
    public static SubLObject rkf_uttrdr_full_spans_onlyP() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return rkf_text_processors.$rkf_uttrdr_full_spans_onlyP$.getDynamicValue(thread);
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 13530L)
    public static SubLObject rkf_utterance_reader(final SubLObject text, final SubLObject category, final SubLObject parsing_mt, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject parses = (SubLObject)rkf_text_processors.NIL;
        final SubLObject _prev_bind_0 = lexicon_vars.$exclude_vulgaritiesP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = lexicon_vars.$exclude_slangP$.currentBinding(thread);
        final SubLObject _prev_bind_3 = lexicon_vars.$exclude_archaic_speechP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = parsing_vars.$variable_uniquification_store$.currentBinding(thread);
        try {
            lexicon_vars.$exclude_vulgaritiesP$.bind((SubLObject)rkf_text_processors.T, thread);
            lexicon_vars.$exclude_slangP$.bind((SubLObject)rkf_text_processors.T, thread);
            lexicon_vars.$exclude_archaic_speechP$.bind((SubLObject)rkf_text_processors.T, thread);
            parsing_vars.$variable_uniquification_store$.bind(dictionary.new_dictionary((SubLObject)rkf_text_processors.EQUALP, (SubLObject)rkf_text_processors.UNPROVIDED), thread);
            parses = rkf_uttrdr_perform_parsing(text, category, parsing_mt, domain_mt);
        }
        finally {
            parsing_vars.$variable_uniquification_store$.rebind(_prev_bind_4, thread);
            lexicon_vars.$exclude_archaic_speechP$.rebind(_prev_bind_3, thread);
            lexicon_vars.$exclude_slangP$.rebind(_prev_bind_2, thread);
            lexicon_vars.$exclude_vulgaritiesP$.rebind(_prev_bind_0, thread);
        }
        if (rkf_text_processors.NIL != rkf_formula_optimizer.$rkf_late_pronoun_substitutionP$.getDynamicValue(thread) && rkf_text_processors.NIL != rkf_formula_optimizer.$rkf_reformulator_replace_pronounsP$.getDynamicValue(thread)) {
            parses = rkf_uttrdr_replace_pronouns(parses);
        }
        return parses;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 14080L)
    public static SubLObject rkf_uttrdr_replace_pronouns(final SubLObject parses) {
        return rkf_formula_optimizer.replace_pronouns_in_cycl(parses);
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 14319L)
    public static SubLObject rkf_imperative_reader(final SubLObject text, final SubLObject parsing_mt, final SubLObject domain_mt) {
        final SubLObject result = rkf_utterance_reader(text, rkf_text_processors.$const50$ImperativeTemplate, parsing_mt, domain_mt);
        return result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 14600L)
    public static SubLObject rkf_sentence_reader(final SubLObject text, final SubLObject parsing_mt, final SubLObject domain_mt) {
        final SubLObject result = rkf_utterance_reader(text, rkf_text_processors.$const51$STemplate, parsing_mt, domain_mt);
        return result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 14870L)
    public static SubLObject rkf_question_reader(final SubLObject text, final SubLObject parsing_mt, final SubLObject domain_mt) {
        final SubLObject result = rkf_utterance_reader(text, rkf_text_processors.$const52$QuestionTemplate, parsing_mt, domain_mt);
        return result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 15156L)
    public static SubLObject rkf_store_rtp_parses_in_pipeline(final SubLObject text, final SubLObject result, final SubLObject parsing_mt, final SubLObject template) {
        subl_promotions.make_process_with_args((SubLObject)rkf_text_processors.$str53$Parsing_Pipeline, (SubLObject)rkf_text_processors.$sym54$STORE_RTP_PARSES_IN_PIPELINE, (SubLObject)ConsesLow.list(text, result, parsing_mt, template, rkf_text_processors.$const55$CycRecursiveTemplateParser));
        return (SubLObject)rkf_text_processors.$kw56$FORKED;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 15725L)
    public static SubLObject rkf_phrase_reader(final SubLObject text, final SubLObject parsing_mt, final SubLObject domain_mt, SubLObject parse_templates) {
        if (parse_templates == rkf_text_processors.UNPROVIDED) {
            parse_templates = (SubLObject)rkf_text_processors.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (rkf_text_processors.NIL == parse_templates) {
            parse_templates = rkf_text_processors.$rkf_term_reader_default_templates$.getGlobalValue();
        }
        SubLObject results = (SubLObject)rkf_text_processors.NIL;
        final SubLObject _prev_bind_0 = parsing_vars.$parsing_domain_mt$.currentBinding(thread);
        try {
            parsing_vars.$parsing_domain_mt$.bind(domain_mt, thread);
            SubLObject cdolist_list_var = parse_templates;
            SubLObject parse_template = (SubLObject)rkf_text_processors.NIL;
            parse_template = cdolist_list_var.first();
            while (rkf_text_processors.NIL != cdolist_list_var) {
                results = rkf_uttrdr_merge_parse_results(results, rkf_utterance_reader(text, parse_template, parsing_mt, domain_mt));
                cdolist_list_var = cdolist_list_var.rest();
                parse_template = cdolist_list_var.first();
            }
        }
        finally {
            parsing_vars.$parsing_domain_mt$.rebind(_prev_bind_0, thread);
        }
        if (rkf_text_processors.NIL != rkf_uttrdr_full_spans_onlyP()) {
            results = rkf_uttrdr_remove_sub_parses(results, text);
        }
        return results;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 17209L)
    public static SubLObject rkf_uttrdr_maybe_initialize_arg_type_template_categories() {
        if (rkf_text_processors.NIL == dictionary.dictionary_p(rkf_text_processors.$rkf_uttrdr_arg_type_to_template_categories$.getGlobalValue())) {
            rkf_uttrdr_initialize_arg_type_template_categories();
        }
        return rkf_text_processors.$rkf_uttrdr_arg_type_to_template_categories$.getGlobalValue();
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 17469L)
    public static SubLObject rkf_uttrdr_initialize_arg_type_template_categories() {
        rkf_text_processors.$rkf_uttrdr_arg_type_to_template_categories$.setGlobalValue(dictionary.new_dictionary((SubLObject)rkf_text_processors.EQUALP, (SubLObject)rkf_text_processors.UNPROVIDED));
        SubLObject cdolist_list_var = rkf_text_processors.$rkf_term_reader_cycl_template_mappings$.getGlobalValue();
        SubLObject mapping = (SubLObject)rkf_text_processors.NIL;
        mapping = cdolist_list_var.first();
        while (rkf_text_processors.NIL != cdolist_list_var) {
            dictionary.dictionary_enter(rkf_text_processors.$rkf_uttrdr_arg_type_to_template_categories$.getGlobalValue(), mapping.first(), mapping.rest());
            cdolist_list_var = cdolist_list_var.rest();
            mapping = cdolist_list_var.first();
        }
        return rkf_text_processors.$rkf_uttrdr_arg_type_to_template_categories$.getGlobalValue();
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 17842L)
    public static SubLObject rkf_uttrdr_templates_for_arg_type(final SubLObject v_arg_type, final SubLObject mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject arg_type_spec_set = (SubLObject)rkf_text_processors.NIL;
        SubLObject result_template_types = (SubLObject)rkf_text_processors.NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)rkf_text_processors.$sym59$RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(mt, thread);
            arg_type_spec_set = set_utilities.construct_set_from_list(genls.all_genls(v_arg_type, (SubLObject)rkf_text_processors.UNPROVIDED, (SubLObject)rkf_text_processors.UNPROVIDED), (SubLObject)rkf_text_processors.UNPROVIDED, (SubLObject)rkf_text_processors.UNPROVIDED);
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        rkf_uttrdr_maybe_initialize_arg_type_template_categories();
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(rkf_text_processors.$rkf_uttrdr_arg_type_to_template_categories$.getGlobalValue())); rkf_text_processors.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject v_arg_type_$3 = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject template_cats = thread.secondMultipleValue();
            thread.resetMultipleValues();
            if (rkf_text_processors.NIL != set.set_memberP(v_arg_type_$3, arg_type_spec_set)) {
                SubLObject cdolist_list_var = template_cats;
                SubLObject template_cat = (SubLObject)rkf_text_processors.NIL;
                template_cat = cdolist_list_var.first();
                while (rkf_text_processors.NIL != cdolist_list_var) {
                    final SubLObject item_var = template_cat;
                    if (rkf_text_processors.NIL == conses_high.member(item_var, result_template_types, Symbols.symbol_function((SubLObject)rkf_text_processors.EQL), Symbols.symbol_function((SubLObject)rkf_text_processors.IDENTITY))) {
                        result_template_types = (SubLObject)ConsesLow.cons(item_var, result_template_types);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    template_cat = cdolist_list_var.first();
                }
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        if (rkf_text_processors.NIL == result_template_types) {
            result_template_types = rkf_text_processors.$rkf_term_reader_default_templates$.getGlobalValue();
        }
        return result_template_types;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 18697L)
    public static SubLObject rkf_uttrdr_remove_sub_parses(final SubLObject parses, final SubLObject text_string) {
        final SubLObject span_iterator = rtp_iterators.new_itp_result_iterator(parses, (SubLObject)rkf_text_processors.UNPROVIDED, (SubLObject)rkf_text_processors.UNPROVIDED);
        final SubLObject string_length = Sequences.length(rkf_concept_harvester.rkf_ch_string_tokenize(text_string));
        final SubLObject top_level_span = parsing_utilities.token_list_from_span((SubLObject)rkf_text_processors.ZERO_INTEGER, string_length);
        SubLObject result = (SubLObject)rkf_text_processors.NIL;
        SubLObject parse_iterator = (SubLObject)rkf_text_processors.NIL;
        while (rkf_text_processors.NIL == rtp_iterators.itp_result_iterator_doneP(span_iterator)) {
            parse_iterator = rtp_iterators.itp_result_iterator_curr(span_iterator);
            if (top_level_span.equal(rtp_iterators.itp_section_iterator_span(parse_iterator))) {
                result = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(rtp_iterators.itp_section_iterator_span(parse_iterator), rtp_iterators.itp_section_iterator_section(parse_iterator)), result);
            }
            rtp_iterators.itp_result_iterator_next(span_iterator);
        }
        return result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 19529L)
    public static SubLObject with_parsers_ordered_by_quality(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)rkf_text_processors.$sym1$CLET, (SubLObject)rkf_text_processors.$list60, ConsesLow.append(body, (SubLObject)rkf_text_processors.NIL));
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 19648L)
    public static SubLObject template_category_from_parse_spec(final SubLObject parse_spec, final SubLObject parsing_mt) {
        if (rkf_text_processors.NIL == parse_spec) {
            return rkf_text_processors.$rkf_term_reader_default_templates$.getGlobalValue();
        }
        if (rkf_text_processors.NIL != rtp_type_checkers.rtp_template_categoryP(parse_spec, parsing_mt)) {
            return (SubLObject)ConsesLow.list(parse_spec);
        }
        return rkf_uttrdr_templates_for_arg_type(parse_spec, parsing_mt);
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 19950L)
    public static SubLObject rkf_term_reader(final SubLObject text, final SubLObject parsing_mt, final SubLObject domain_mt, SubLObject parse_specification) {
        if (parse_specification == rkf_text_processors.UNPROVIDED) {
            parse_specification = (SubLObject)rkf_text_processors.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject template_categories = template_category_from_parse_spec(parse_specification, parsing_mt);
        SubLObject result = (SubLObject)rkf_text_processors.NIL;
        final SubLObject _prev_bind_0 = rkf_text_processors.$rkf_uttrdr_full_spans_onlyP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = rkf_text_processors.$rkf_text_proc_resolve_parses$.currentBinding(thread);
        final SubLObject _prev_bind_3 = rkf_text_processors.$rkf_uttrdr_allow_nltagsP$.currentBinding(thread);
        final SubLObject _prev_bind_4 = rkf_text_processors.$pmg_ordering$.currentBinding(thread);
        try {
            rkf_text_processors.$rkf_uttrdr_full_spans_onlyP$.bind((SubLObject)rkf_text_processors.T, thread);
            rkf_text_processors.$rkf_text_proc_resolve_parses$.bind((SubLObject)rkf_text_processors.T, thread);
            rkf_text_processors.$rkf_uttrdr_allow_nltagsP$.bind((SubLObject)rkf_text_processors.NIL, thread);
            rkf_text_processors.$pmg_ordering$.bind((SubLObject)rkf_text_processors.$kw61$QUALITY, thread);
            result = rkf_phrase_reader(text, parsing_mt, domain_mt, template_categories);
        }
        finally {
            rkf_text_processors.$pmg_ordering$.rebind(_prev_bind_4, thread);
            rkf_text_processors.$rkf_uttrdr_allow_nltagsP$.rebind(_prev_bind_3, thread);
            rkf_text_processors.$rkf_text_proc_resolve_parses$.rebind(_prev_bind_2, thread);
            rkf_text_processors.$rkf_uttrdr_full_spans_onlyP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 20730L)
    public static SubLObject rkf_term_in_sentence_reader(final SubLObject text, final SubLObject parsing_mt, final SubLObject domain_mt, SubLObject parse_specification) {
        if (parse_specification == rkf_text_processors.UNPROVIDED) {
            parse_specification = (SubLObject)rkf_text_processors.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)rkf_text_processors.NIL;
        final SubLObject template_categories = template_category_from_parse_spec(parse_specification, parsing_mt);
        final SubLObject _prev_bind_0 = rkf_text_processors.$rkf_uttrdr_full_spans_onlyP$.currentBinding(thread);
        final SubLObject _prev_bind_2 = rkf_text_processors.$rkf_text_proc_resolve_parses$.currentBinding(thread);
        final SubLObject _prev_bind_3 = rkf_text_processors.$pmg_ordering$.currentBinding(thread);
        try {
            rkf_text_processors.$rkf_uttrdr_full_spans_onlyP$.bind((SubLObject)rkf_text_processors.T, thread);
            rkf_text_processors.$rkf_text_proc_resolve_parses$.bind((SubLObject)rkf_text_processors.T, thread);
            rkf_text_processors.$pmg_ordering$.bind((SubLObject)rkf_text_processors.$kw61$QUALITY, thread);
            result = rkf_phrase_reader(text, parsing_mt, domain_mt, template_categories);
        }
        finally {
            rkf_text_processors.$pmg_ordering$.rebind(_prev_bind_3, thread);
            rkf_text_processors.$rkf_text_proc_resolve_parses$.rebind(_prev_bind_2, thread);
            rkf_text_processors.$rkf_uttrdr_full_spans_onlyP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 21150L)
    public static SubLObject rkf_assertion_reader(final SubLObject text, final SubLObject parsing_mt, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)rkf_text_processors.NIL;
        final SubLObject _prev_bind_0 = rkf_text_processors.$rkf_uttrdr_allow_nltagsP$.currentBinding(thread);
        try {
            rkf_text_processors.$rkf_uttrdr_allow_nltagsP$.bind((SubLObject)rkf_text_processors.NIL, thread);
            result = rkf_sentence_reader(text, parsing_mt, domain_mt);
        }
        finally {
            rkf_text_processors.$rkf_uttrdr_allow_nltagsP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 21350L)
    public static SubLObject rkf_query_reader(final SubLObject text, final SubLObject parsing_mt, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)rkf_text_processors.NIL;
        final SubLObject _prev_bind_0 = rkf_text_processors.$rkf_uttrdr_allow_nltagsP$.currentBinding(thread);
        try {
            rkf_text_processors.$rkf_uttrdr_allow_nltagsP$.bind((SubLObject)rkf_text_processors.NIL, thread);
            result = rkf_question_reader(text, parsing_mt, domain_mt);
        }
        finally {
            rkf_text_processors.$rkf_uttrdr_allow_nltagsP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 21547L)
    public static SubLObject rkf_scenario_reader(final SubLObject text, final SubLObject parsing_mt, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)rkf_text_processors.NIL;
        final SubLObject _prev_bind_0 = rkf_text_processors.$rkf_uttrdr_allow_nltagsP$.currentBinding(thread);
        try {
            rkf_text_processors.$rkf_uttrdr_allow_nltagsP$.bind((SubLObject)rkf_text_processors.NIL, thread);
            result = rkf_utterance_reader(text, rkf_text_processors.$const62$ScenarioTemplate, parsing_mt, domain_mt);
        }
        finally {
            rkf_text_processors.$rkf_uttrdr_allow_nltagsP$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 21766L)
    public static SubLObject rkf_parse_date_unambiguously_from_string(final SubLObject string) {
        SubLObject result = (SubLObject)rkf_text_processors.NIL;
        result = Sequences.find_if((SubLObject)rkf_text_processors.$sym63$TIME_INTERVAL_, simple_rkf_date_reader(string, (SubLObject)rkf_text_processors.UNPROVIDED, (SubLObject)rkf_text_processors.UNPROVIDED), (SubLObject)rkf_text_processors.UNPROVIDED, (SubLObject)rkf_text_processors.UNPROVIDED, (SubLObject)rkf_text_processors.UNPROVIDED);
        return result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 22076L)
    public static SubLObject simple_rkf_date_reader(final SubLObject text, SubLObject parsing_mt, SubLObject domain_mt) {
        if (parsing_mt == rkf_text_processors.UNPROVIDED) {
            parsing_mt = rkf_text_processors.$const64$RKFParsingMt;
        }
        if (domain_mt == rkf_text_processors.UNPROVIDED) {
            domain_mt = rkf_text_processors.$const64$RKFParsingMt;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)rkf_text_processors.NIL;
        final SubLObject _prev_bind_0 = rkf_text_processors.$rkf_text_proc_resolve_parses$.currentBinding(thread);
        try {
            rkf_text_processors.$rkf_text_proc_resolve_parses$.bind((SubLObject)rkf_text_processors.T, thread);
            result = top_level_parses(rkf_date_reader(text, parsing_mt, domain_mt));
        }
        finally {
            rkf_text_processors.$rkf_text_proc_resolve_parses$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 22490L)
    public static SubLObject rkf_date_reader(final SubLObject text, final SubLObject parsing_mt, final SubLObject domain_mt) {
        return rkf_term_reader(text, parsing_mt, domain_mt, rkf_text_processors.$const65$DateTemplate);
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 22618L)
    public static SubLObject rkf_text_processor_reset_caches() {
        return (SubLObject)rkf_text_processors.$kw66$DONE;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 22801L)
    public static SubLObject rkf_terms_forager(final SubLObject text, final SubLObject parsing_mt, final SubLObject domain_mt) {
        SubLObject result = (SubLObject)rkf_text_processors.NIL;
        SubLObject release = (SubLObject)rkf_text_processors.NIL;
        try {
            release = Locks.seize_lock(rkf_text_processors.$rkf_terms_forager_lock$.getGlobalValue());
            final SubLObject current = rkf_concept_harvester.rkf_active_concept_harvester_methods();
            rkf_concept_harvester.rkf_set_active_concept_harvester_methods((SubLObject)rkf_text_processors.$list69);
            result = rkf_concept_harvester.rkf_concept_harvester(text);
            rkf_concept_harvester.rkf_set_active_concept_harvester_methods(current);
        }
        finally {
            if (rkf_text_processors.NIL != release) {
                Locks.release_lock(rkf_text_processors.$rkf_terms_forager_lock$.getGlobalValue());
            }
        }
        return result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 23369L)
    public static SubLObject parse_module_definition_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        pmd_print(v_object, stream, (SubLObject)rkf_text_processors.ZERO_INTEGER);
        return (SubLObject)rkf_text_processors.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 23369L)
    public static SubLObject parse_module_definition_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $parse_module_definition_native.class) ? rkf_text_processors.T : rkf_text_processors.NIL);
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 23369L)
    public static SubLObject pmd_name(final SubLObject v_object) {
        assert rkf_text_processors.NIL != parse_module_definition_p(v_object) : v_object;
        return v_object.getField2();
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 23369L)
    public static SubLObject pmd_category(final SubLObject v_object) {
        assert rkf_text_processors.NIL != parse_module_definition_p(v_object) : v_object;
        return v_object.getField3();
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 23369L)
    public static SubLObject pmd_quality(final SubLObject v_object) {
        assert rkf_text_processors.NIL != parse_module_definition_p(v_object) : v_object;
        return v_object.getField4();
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 23369L)
    public static SubLObject pmd_entry_point(final SubLObject v_object) {
        assert rkf_text_processors.NIL != parse_module_definition_p(v_object) : v_object;
        return v_object.getField5();
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 23369L)
    public static SubLObject pmd_cost(final SubLObject v_object) {
        assert rkf_text_processors.NIL != parse_module_definition_p(v_object) : v_object;
        return v_object.getField6();
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 23369L)
    public static SubLObject pmd_expected_expansions(final SubLObject v_object) {
        assert rkf_text_processors.NIL != parse_module_definition_p(v_object) : v_object;
        return v_object.getField7();
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 23369L)
    public static SubLObject pmd_supplants(final SubLObject v_object) {
        assert rkf_text_processors.NIL != parse_module_definition_p(v_object) : v_object;
        return v_object.getField8();
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 23369L)
    public static SubLObject _csetf_pmd_name(final SubLObject v_object, final SubLObject value) {
        assert rkf_text_processors.NIL != parse_module_definition_p(v_object) : v_object;
        return v_object.setField2(value);
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 23369L)
    public static SubLObject _csetf_pmd_category(final SubLObject v_object, final SubLObject value) {
        assert rkf_text_processors.NIL != parse_module_definition_p(v_object) : v_object;
        return v_object.setField3(value);
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 23369L)
    public static SubLObject _csetf_pmd_quality(final SubLObject v_object, final SubLObject value) {
        assert rkf_text_processors.NIL != parse_module_definition_p(v_object) : v_object;
        return v_object.setField4(value);
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 23369L)
    public static SubLObject _csetf_pmd_entry_point(final SubLObject v_object, final SubLObject value) {
        assert rkf_text_processors.NIL != parse_module_definition_p(v_object) : v_object;
        return v_object.setField5(value);
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 23369L)
    public static SubLObject _csetf_pmd_cost(final SubLObject v_object, final SubLObject value) {
        assert rkf_text_processors.NIL != parse_module_definition_p(v_object) : v_object;
        return v_object.setField6(value);
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 23369L)
    public static SubLObject _csetf_pmd_expected_expansions(final SubLObject v_object, final SubLObject value) {
        assert rkf_text_processors.NIL != parse_module_definition_p(v_object) : v_object;
        return v_object.setField7(value);
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 23369L)
    public static SubLObject _csetf_pmd_supplants(final SubLObject v_object, final SubLObject value) {
        assert rkf_text_processors.NIL != parse_module_definition_p(v_object) : v_object;
        return v_object.setField8(value);
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 23369L)
    public static SubLObject make_parse_module_definition(SubLObject arglist) {
        if (arglist == rkf_text_processors.UNPROVIDED) {
            arglist = (SubLObject)rkf_text_processors.NIL;
        }
        final SubLObject v_new = (SubLObject)new $parse_module_definition_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)rkf_text_processors.NIL, next = arglist; rkf_text_processors.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)rkf_text_processors.$kw93$NAME)) {
                _csetf_pmd_name(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw94$CATEGORY)) {
                _csetf_pmd_category(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw61$QUALITY)) {
                _csetf_pmd_quality(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw95$ENTRY_POINT)) {
                _csetf_pmd_entry_point(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw96$COST)) {
                _csetf_pmd_cost(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw97$EXPECTED_EXPANSIONS)) {
                _csetf_pmd_expected_expansions(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw98$SUPPLANTS)) {
                _csetf_pmd_supplants(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)rkf_text_processors.$str31$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 23369L)
    public static SubLObject visit_defstruct_parse_module_definition(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_text_processors.$kw32$BEGIN, (SubLObject)rkf_text_processors.$sym99$MAKE_PARSE_MODULE_DEFINITION, (SubLObject)rkf_text_processors.SEVEN_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_text_processors.$kw34$SLOT, (SubLObject)rkf_text_processors.$kw93$NAME, pmd_name(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_text_processors.$kw34$SLOT, (SubLObject)rkf_text_processors.$kw94$CATEGORY, pmd_category(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_text_processors.$kw34$SLOT, (SubLObject)rkf_text_processors.$kw61$QUALITY, pmd_quality(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_text_processors.$kw34$SLOT, (SubLObject)rkf_text_processors.$kw95$ENTRY_POINT, pmd_entry_point(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_text_processors.$kw34$SLOT, (SubLObject)rkf_text_processors.$kw96$COST, pmd_cost(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_text_processors.$kw34$SLOT, (SubLObject)rkf_text_processors.$kw97$EXPECTED_EXPANSIONS, pmd_expected_expansions(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_text_processors.$kw34$SLOT, (SubLObject)rkf_text_processors.$kw98$SUPPLANTS, pmd_supplants(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_text_processors.$kw35$END, (SubLObject)rkf_text_processors.$sym99$MAKE_PARSE_MODULE_DEFINITION, (SubLObject)rkf_text_processors.SEVEN_INTEGER);
        return obj;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 23369L)
    public static SubLObject visit_defstruct_object_parse_module_definition_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_parse_module_definition(obj, visitor_fn);
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 23919L)
    public static SubLObject pmd_print(final SubLObject v_object, final SubLObject stream, final SubLObject depth) {
        PrintLow.format(stream, (SubLObject)rkf_text_processors.$str101$_PARSE_MODULE_DEFINITION__S_, pmd_name(v_object));
        return v_object;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 24183L)
    public static SubLObject new_parse_module_definition(final SubLObject name, final SubLObject category, final SubLObject quality, final SubLObject entry_point, SubLObject cost, SubLObject expected_expansions, SubLObject supplants) {
        if (cost == rkf_text_processors.UNPROVIDED) {
            cost = rkf_text_processors.$rkf_uttrdr_default_cost$.getGlobalValue();
        }
        if (expected_expansions == rkf_text_processors.UNPROVIDED) {
            expected_expansions = rkf_text_processors.$rkf_uttrdr_default_expected_expansions$.getGlobalValue();
        }
        if (supplants == rkf_text_processors.UNPROVIDED) {
            supplants = (SubLObject)rkf_text_processors.NIL;
        }
        final SubLObject pmd = make_parse_module_definition((SubLObject)rkf_text_processors.UNPROVIDED);
        _csetf_pmd_name(pmd, name);
        _csetf_pmd_category(pmd, category);
        _csetf_pmd_quality(pmd, quality);
        _csetf_pmd_entry_point(pmd, entry_point);
        _csetf_pmd_cost(pmd, cost);
        _csetf_pmd_expected_expansions(pmd, expected_expansions);
        _csetf_pmd_supplants(pmd, supplants);
        return pmd;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 25069L)
    public static SubLObject rkf_uttrdr_copy_pmd(SubLObject source, final SubLObject target) {
        _csetf_pmd_name(target, pmd_name(source));
        _csetf_pmd_category(target, pmd_category(source));
        _csetf_pmd_quality(target, pmd_quality(source));
        _csetf_pmd_entry_point(target, pmd_entry_point(source));
        _csetf_pmd_cost(target, pmd_cost(source));
        _csetf_pmd_expected_expansions(target, pmd_expected_expansions(source));
        _csetf_pmd_supplants(target, pmd_supplants(source));
        return target;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 25561L)
    public static SubLObject rkf_uttrdr_pmd_classify(final SubLObject pmd) {
        if (rkf_text_processors.NIL != parse_module_definition_p(pmd)) {
            return Numbers.multiply(pmd_resolved_quality(pmd), pmd_cost(pmd), pmd_expected_expansions(pmd));
        }
        return Numbers.$most_positive_fixnum$.getGlobalValue();
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 25792L)
    public static SubLObject rkf_uttrdr_pmd_choose_better(final SubLObject pmd_a, final SubLObject pmd_b) {
        final SubLObject classify_a = rkf_uttrdr_pmd_classify(pmd_a);
        final SubLObject classify_b = rkf_uttrdr_pmd_classify(pmd_b);
        return classify_a.numL(classify_b) ? pmd_a : pmd_b;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 26033L)
    public static SubLObject pmd_resolved_quality(final SubLObject pmd) {
        final SubLObject slot_value = pmd_quality(pmd);
        if (slot_value.isFunctionSpec()) {
            return Functions.funcall(slot_value);
        }
        if (slot_value.isNumber()) {
            return slot_value;
        }
        Errors.warn((SubLObject)rkf_text_processors.$str102$Can_t_resolve_quality_of__S_, pmd);
        return (SubLObject)rkf_text_processors.ZERO_INTEGER;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 26432L)
    public static SubLObject rkf_uttrdr_pmd_orderedP(final SubLObject pmd_a, final SubLObject pmd_b) {
        return Equality.eq(pmd_a, rkf_uttrdr_pmd_choose_better(pmd_a, pmd_b));
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 26550L)
    public static SubLObject rkf_uttrdr_explain_pmd(final SubLObject pmd) {
        if (rkf_text_processors.NIL != parse_module_definition_p(pmd)) {
            PrintLow.format((SubLObject)rkf_text_processors.T, (SubLObject)rkf_text_processors.$str103$Parser__S_for__S__Func___S_Heur__, new SubLObject[] { pmd_name(pmd), pmd_category(pmd), pmd_entry_point(pmd) });
            if (rkf_text_processors.NIL != pmd_supplants(pmd)) {
                PrintLow.format((SubLObject)rkf_text_processors.T, (SubLObject)rkf_text_processors.$str104$___Suppl__S_, pmd_supplants(pmd));
            }
            PrintLow.format((SubLObject)rkf_text_processors.T, (SubLObject)rkf_text_processors.$str105$Class__D____Qual__D____Cost__D___, new SubLObject[] { rkf_uttrdr_pmd_classify(pmd), pmd_resolved_quality(pmd), pmd_cost(pmd), pmd_expected_expansions(pmd) });
            streams_high.terpri((SubLObject)rkf_text_processors.UNPROVIDED);
        }
        return pmd;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 27076L)
    public static SubLObject rkf_uttrdr_pmd_supplantsP(final SubLObject pmd, final SubLObject name) {
        final SubLObject supplants = pmd_supplants(pmd);
        if (rkf_text_processors.NIL == supplants) {
            return (SubLObject)rkf_text_processors.NIL;
        }
        if (supplants.isList()) {
            return subl_promotions.memberP(name, supplants, (SubLObject)rkf_text_processors.UNPROVIDED, (SubLObject)rkf_text_processors.UNPROVIDED);
        }
        return Equality.eq(supplants, name);
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 27330L)
    public static SubLObject rkf_uttrdr_invoke_pmd(final SubLObject pmd, final SubLObject text, final SubLObject category, final SubLObject parsing_mt, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject error = (SubLObject)rkf_text_processors.NIL;
        SubLObject result = (SubLObject)rkf_text_processors.NIL;
        try {
            thread.throwStack.push(subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind((SubLObject)rkf_text_processors.$sym106$CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    result = Functions.funcall(pmd_entry_point(pmd), text, category, parsing_mt, domain_mt);
                }
                catch (Throwable catch_var) {
                    Errors.handleThrowable(catch_var, (SubLObject)rkf_text_processors.NIL);
                }
            }
            finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        }
        catch (Throwable ccatch_env_var) {
            error = Errors.handleThrowable(ccatch_env_var, subl_macro_promotions.$catch_error_message_target$.getGlobalValue());
        }
        finally {
            thread.throwStack.pop();
        }
        return result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 27593L)
    public static SubLObject parse_module_group_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        compatibility.default_struct_print_function(v_object, stream, (SubLObject)rkf_text_processors.ZERO_INTEGER);
        return (SubLObject)rkf_text_processors.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 27593L)
    public static SubLObject parse_module_group_p(final SubLObject v_object) {
        return (SubLObject)((v_object.getClass() == $parse_module_group_native.class) ? rkf_text_processors.T : rkf_text_processors.NIL);
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 27593L)
    public static SubLObject pmg_category(final SubLObject v_object) {
        assert rkf_text_processors.NIL != parse_module_group_p(v_object) : v_object;
        return v_object.getField2();
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 27593L)
    public static SubLObject pmg_tools(final SubLObject v_object) {
        assert rkf_text_processors.NIL != parse_module_group_p(v_object) : v_object;
        return v_object.getField3();
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 27593L)
    public static SubLObject _csetf_pmg_category(final SubLObject v_object, final SubLObject value) {
        assert rkf_text_processors.NIL != parse_module_group_p(v_object) : v_object;
        return v_object.setField2(value);
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 27593L)
    public static SubLObject _csetf_pmg_tools(final SubLObject v_object, final SubLObject value) {
        assert rkf_text_processors.NIL != parse_module_group_p(v_object) : v_object;
        return v_object.setField3(value);
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 27593L)
    public static SubLObject make_parse_module_group(SubLObject arglist) {
        if (arglist == rkf_text_processors.UNPROVIDED) {
            arglist = (SubLObject)rkf_text_processors.NIL;
        }
        final SubLObject v_new = (SubLObject)new $parse_module_group_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = (SubLObject)rkf_text_processors.NIL, next = arglist; rkf_text_processors.NIL != next; next = conses_high.cddr(next)) {
            current_arg = next.first();
            current_value = conses_high.cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql((SubLObject)rkf_text_processors.$kw94$CATEGORY)) {
                _csetf_pmg_category(v_new, current_value);
            }
            else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw120$TOOLS)) {
                _csetf_pmg_tools(v_new, current_value);
            }
            else {
                Errors.error((SubLObject)rkf_text_processors.$str31$Invalid_slot__S_for_construction_, current_arg);
            }
        }
        return v_new;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 27593L)
    public static SubLObject visit_defstruct_parse_module_group(final SubLObject obj, final SubLObject visitor_fn) {
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_text_processors.$kw32$BEGIN, (SubLObject)rkf_text_processors.$sym121$MAKE_PARSE_MODULE_GROUP, (SubLObject)rkf_text_processors.TWO_INTEGER);
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_text_processors.$kw34$SLOT, (SubLObject)rkf_text_processors.$kw94$CATEGORY, pmg_category(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_text_processors.$kw34$SLOT, (SubLObject)rkf_text_processors.$kw120$TOOLS, pmg_tools(obj));
        Functions.funcall(visitor_fn, obj, (SubLObject)rkf_text_processors.$kw35$END, (SubLObject)rkf_text_processors.$sym121$MAKE_PARSE_MODULE_GROUP, (SubLObject)rkf_text_processors.TWO_INTEGER);
        return obj;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 27593L)
    public static SubLObject visit_defstruct_object_parse_module_group_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_parse_module_group(obj, visitor_fn);
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 27936L)
    public static SubLObject pmg_ordered_tools(final SubLObject pmg) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject pcase_var = rkf_text_processors.$pmg_ordering$.getDynamicValue(thread);
        if (pcase_var.eql((SubLObject)rkf_text_processors.$kw61$QUALITY)) {
            return sorted_by_quality(pmg_tools(pmg));
        }
        return pmg_tools(pmg);
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 28108L)
    public static SubLObject sorted_by_quality(final SubLObject tool_list) {
        SubLObject result = (SubLObject)rkf_text_processors.NIL;
        final SubLObject temp_tool_list = conses_high.copy_list(tool_list);
        result = Sort.stable_sort(temp_tool_list, (SubLObject)rkf_text_processors.$sym123$PMD_EXPECTED_EXPANSIONS_, (SubLObject)rkf_text_processors.UNPROVIDED);
        result = Sort.stable_sort(result, (SubLObject)rkf_text_processors.$sym124$PMD_COST_, (SubLObject)rkf_text_processors.UNPROVIDED);
        result = Sort.stable_sort(result, (SubLObject)rkf_text_processors.$sym125$PMD_QUALITY_, (SubLObject)rkf_text_processors.UNPROVIDED);
        return result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 28556L)
    public static SubLObject pmd_expected_expansionsL(final SubLObject pmd1, final SubLObject pmd2) {
        return Numbers.numG(pmd_expected_expansions(pmd1), pmd_expected_expansions(pmd2));
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 28688L)
    public static SubLObject pmd_costL(final SubLObject pmd1, final SubLObject pmd2) {
        return Numbers.numG(pmd_cost(pmd1), pmd_cost(pmd2));
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 28775L)
    public static SubLObject pmd_qualityL(final SubLObject pmd1, final SubLObject pmd2) {
        return Numbers.numG(pmd_resolved_quality(pmd1), pmd_resolved_quality(pmd2));
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 28889L)
    public static SubLObject new_parse_module_group(final SubLObject category) {
        final SubLObject pmg = make_parse_module_group((SubLObject)rkf_text_processors.UNPROVIDED);
        _csetf_pmg_category(pmg, category);
        _csetf_pmg_tools(pmg, (SubLObject)rkf_text_processors.NIL);
        return pmg;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 29555L)
    public static SubLObject rkf_uttrdr_explain_pmg(final SubLObject pmg) {
        PrintLow.format((SubLObject)rkf_text_processors.T, (SubLObject)rkf_text_processors.$str126$__Parse_Group_for__S___, pmg_category(pmg));
        PrintLow.format((SubLObject)rkf_text_processors.T, (SubLObject)rkf_text_processors.$str127$Tools__in_order______);
        SubLObject cdolist_list_var = pmg_tools(pmg);
        SubLObject tool = (SubLObject)rkf_text_processors.NIL;
        tool = cdolist_list_var.first();
        while (rkf_text_processors.NIL != cdolist_list_var) {
            rkf_uttrdr_explain_pmd(tool);
            cdolist_list_var = cdolist_list_var.rest();
            tool = cdolist_list_var.first();
        }
        streams_high.terpri((SubLObject)rkf_text_processors.UNPROVIDED);
        return pmg;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 30038L)
    public static SubLObject with_known_parsers_lock_held(final SubLObject macroform, final SubLObject environment) {
        final SubLObject datum = macroform.rest();
        final SubLObject body;
        final SubLObject current = body = datum;
        return (SubLObject)ConsesLow.listS((SubLObject)rkf_text_processors.$sym132$WITH_LOCK_HELD, (SubLObject)rkf_text_processors.$list133, ConsesLow.append(body, (SubLObject)rkf_text_processors.NIL));
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 30178L)
    public static SubLObject rkf_uttrdr_pmg_find_pmd_by_name(final SubLObject list, final SubLObject name) {
        return Sequences.find(name, list, (SubLObject)rkf_text_processors.EQ, (SubLObject)rkf_text_processors.$sym79$PMD_NAME, (SubLObject)rkf_text_processors.UNPROVIDED, (SubLObject)rkf_text_processors.UNPROVIDED);
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 30281L)
    public static SubLObject rkf_uttrdr_pmg_find_pmd(final SubLObject list, final SubLObject pmd) {
        return rkf_uttrdr_pmg_find_pmd_by_name(list, pmd_name(pmd));
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 30396L)
    public static SubLObject rkf_uttrdr_pmg_add_tool(final SubLObject pmg, final SubLObject pmd) {
        SubLObject release = (SubLObject)rkf_text_processors.NIL;
        try {
            release = Locks.seize_lock(rkf_text_processors.$rkf_uttrdr_known_parsers_lock$.getGlobalValue());
            SubLObject tools = pmg_tools(pmg);
            if (rkf_text_processors.NIL == conses_high.member(pmd, tools, Symbols.symbol_function((SubLObject)rkf_text_processors.EQUALP), Symbols.symbol_function((SubLObject)rkf_text_processors.IDENTITY))) {
                tools = (SubLObject)ConsesLow.cons(pmd, tools);
            }
            _csetf_pmg_tools(pmg, Sort.sort(tools, (SubLObject)rkf_text_processors.$sym134$RKF_UTTRDR_PMD_ORDERED_, (SubLObject)rkf_text_processors.UNPROVIDED));
        }
        finally {
            if (rkf_text_processors.NIL != release) {
                Locks.release_lock(rkf_text_processors.$rkf_uttrdr_known_parsers_lock$.getGlobalValue());
            }
        }
        return pmg;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 30648L)
    public static SubLObject rkf_uttrdr_pmg_locate_pmd(final SubLObject pmg, final SubLObject name) {
        SubLObject result = (SubLObject)rkf_text_processors.NIL;
        SubLObject release = (SubLObject)rkf_text_processors.NIL;
        try {
            release = Locks.seize_lock(rkf_text_processors.$rkf_uttrdr_known_parsers_lock$.getGlobalValue());
            if (rkf_text_processors.NIL != pmg_tools(pmg)) {
                final SubLObject pmd = rkf_uttrdr_pmg_find_pmd_by_name(pmg_tools(pmg), name);
                if (rkf_text_processors.NIL != pmd) {
                    result = pmd;
                }
            }
        }
        finally {
            if (rkf_text_processors.NIL != release) {
                Locks.release_lock(rkf_text_processors.$rkf_uttrdr_known_parsers_lock$.getGlobalValue());
            }
        }
        return Values.values(result);
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 30952L)
    public static SubLObject rkf_uttrdr_pmg_is_knownP(final SubLObject pmg, final SubLObject pmd) {
        SubLObject result = (SubLObject)rkf_text_processors.NIL;
        SubLObject release = (SubLObject)rkf_text_processors.NIL;
        try {
            release = Locks.seize_lock(rkf_text_processors.$rkf_uttrdr_known_parsers_lock$.getGlobalValue());
            result = rkf_uttrdr_pmg_locate_pmd(pmg, pmd_name(pmd));
        }
        finally {
            if (rkf_text_processors.NIL != release) {
                Locks.release_lock(rkf_text_processors.$rkf_uttrdr_known_parsers_lock$.getGlobalValue());
            }
        }
        return result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 31146L)
    public static SubLObject rkf_uttrdr_pmg_update_pmd(final SubLObject pmg, final SubLObject pmd) {
        SubLObject release = (SubLObject)rkf_text_processors.NIL;
        try {
            release = Locks.seize_lock(rkf_text_processors.$rkf_uttrdr_known_parsers_lock$.getGlobalValue());
            SubLObject old_pmd = (SubLObject)rkf_text_processors.NIL;
            old_pmd = rkf_uttrdr_pmg_locate_pmd(pmg, pmd_name(pmd));
            rkf_uttrdr_copy_pmd(pmd, old_pmd);
            final SubLObject tools = pmg_tools(pmg);
            _csetf_pmg_tools(pmg, Sort.sort(tools, (SubLObject)rkf_text_processors.$sym134$RKF_UTTRDR_PMD_ORDERED_, (SubLObject)rkf_text_processors.UNPROVIDED));
        }
        finally {
            if (rkf_text_processors.NIL != release) {
                Locks.release_lock(rkf_text_processors.$rkf_uttrdr_known_parsers_lock$.getGlobalValue());
            }
        }
        return pmg;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 31527L)
    public static SubLObject rkf_uttrdr_pmg_classify_pmd(final SubLObject pmg, final SubLObject pmd) {
        SubLObject release = (SubLObject)rkf_text_processors.NIL;
        try {
            release = Locks.seize_lock(rkf_text_processors.$rkf_uttrdr_known_parsers_lock$.getGlobalValue());
            if (rkf_text_processors.NIL != rkf_uttrdr_pmg_is_knownP(pmg, pmd)) {
                rkf_uttrdr_pmg_update_pmd(pmg, pmd);
            }
            else {
                rkf_uttrdr_pmg_add_tool(pmg, pmd);
            }
        }
        finally {
            if (rkf_text_processors.NIL != release) {
                Locks.release_lock(rkf_text_processors.$rkf_uttrdr_known_parsers_lock$.getGlobalValue());
            }
        }
        return pmg;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 31774L)
    public static SubLObject rkf_uttrdr_find_parse_module_group(final SubLObject category) {
        SubLObject pmg = (SubLObject)rkf_text_processors.NIL;
        SubLObject release = (SubLObject)rkf_text_processors.NIL;
        try {
            release = Locks.seize_lock(rkf_text_processors.$rkf_uttrdr_known_parsers_lock$.getGlobalValue());
            if (rkf_text_processors.NIL == rkf_text_processors.$rkf_uttrdr_known_parsers$.getGlobalValue()) {
                pmg = (SubLObject)rkf_text_processors.NIL;
            }
            else {
                pmg = Sequences.find(category, rkf_text_processors.$rkf_uttrdr_known_parsers$.getGlobalValue(), (SubLObject)rkf_text_processors.EQL, (SubLObject)rkf_text_processors.$sym116$PMG_CATEGORY, (SubLObject)rkf_text_processors.UNPROVIDED, (SubLObject)rkf_text_processors.UNPROVIDED);
            }
        }
        finally {
            if (rkf_text_processors.NIL != release) {
                Locks.release_lock(rkf_text_processors.$rkf_uttrdr_known_parsers_lock$.getGlobalValue());
            }
        }
        return pmg;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 32082L)
    public static SubLObject rkf_uttrdr_give_parse_module_group(final SubLObject category) {
        SubLObject pmg = rkf_uttrdr_find_parse_module_group(category);
        if (rkf_text_processors.NIL == pmg) {
            pmg = new_parse_module_group(category);
            SubLObject release = (SubLObject)rkf_text_processors.NIL;
            try {
                release = Locks.seize_lock(rkf_text_processors.$rkf_uttrdr_known_parsers_lock$.getGlobalValue());
                rkf_text_processors.$rkf_uttrdr_known_parsers$.setGlobalValue((SubLObject)ConsesLow.cons(pmg, rkf_text_processors.$rkf_uttrdr_known_parsers$.getGlobalValue()));
            }
            finally {
                if (rkf_text_processors.NIL != release) {
                    Locks.release_lock(rkf_text_processors.$rkf_uttrdr_known_parsers_lock$.getGlobalValue());
                }
            }
        }
        return pmg;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 32385L)
    public static SubLObject rkf_uttrdr_show_parsers(final SubLObject category) {
        final SubLObject pmg = rkf_uttrdr_give_parse_module_group(category);
        if (rkf_text_processors.NIL == pmg) {
            PrintLow.format((SubLObject)rkf_text_processors.T, (SubLObject)rkf_text_processors.$str135$No_known_parsers_for_category__S_, category);
        }
        else {
            rkf_uttrdr_explain_pmg(pmg);
        }
        return category;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 32648L)
    public static SubLObject rkf_uttrdr_all_supported_categories() {
        if (rkf_text_processors.NIL == rkf_text_processors.$rkf_uttrdr_resolvables$.getGlobalValue()) {
            rkf_uttrdr_reset_all_supported_categories();
        }
        return rkf_text_processors.$rkf_uttrdr_resolvables$.getGlobalValue();
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 32824L)
    public static SubLObject rkf_uttrdr_reset_all_supported_categories() {
        rkf_text_processors.$rkf_uttrdr_resolvables$.setGlobalValue(rkf_uttrdr_all_supported_categories_internal());
        return rkf_text_processors.$rkf_uttrdr_resolvables$.getGlobalValue();
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 33002L)
    public static SubLObject rkf_uttrdr_all_supported_categories_internal() {
        SubLObject categories = (SubLObject)rkf_text_processors.NIL;
        SubLObject release = (SubLObject)rkf_text_processors.NIL;
        try {
            release = Locks.seize_lock(rkf_text_processors.$rkf_uttrdr_known_parsers_lock$.getGlobalValue());
            SubLObject cdolist_list_var = rkf_text_processors.$rkf_uttrdr_known_parsers$.getGlobalValue();
            SubLObject pmg = (SubLObject)rkf_text_processors.NIL;
            pmg = cdolist_list_var.first();
            while (rkf_text_processors.NIL != cdolist_list_var) {
                categories = (SubLObject)ConsesLow.cons(pmg_category(pmg), categories);
                cdolist_list_var = cdolist_list_var.rest();
                pmg = cdolist_list_var.first();
            }
        }
        finally {
            if (rkf_text_processors.NIL != release) {
                Locks.release_lock(rkf_text_processors.$rkf_uttrdr_known_parsers_lock$.getGlobalValue());
            }
        }
        return categories;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 33241L)
    public static SubLObject rkf_uttrdr_register_parser(final SubLObject category, final SubLObject pmd) {
        final SubLObject pmg = rkf_uttrdr_give_parse_module_group(category);
        rkf_uttrdr_pmg_classify_pmd(pmg, pmd);
        rkf_uttrdr_reset_all_supported_categories();
        return pmg;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 33503L)
    public static SubLObject rkf_uttrdr_deregister_all_parsers() {
        rkf_text_processors.$rkf_uttrdr_known_parsers$.setGlobalValue((SubLObject)rkf_text_processors.NIL);
        return (SubLObject)rkf_text_processors.$kw136$CLEARED;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 33652L)
    public static SubLObject register_known_parser_module(final SubLObject macroform, final SubLObject environment) {
        SubLObject current;
        final SubLObject datum = current = macroform.rest();
        SubLObject keys = (SubLObject)rkf_text_processors.NIL;
        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list137);
        keys = current.first();
        current = current.rest();
        if (rkf_text_processors.NIL == current) {
            final SubLObject pmd = (SubLObject)rkf_text_processors.$sym138$PMD;
            final SubLObject curr = (SubLObject)rkf_text_processors.$sym139$CURR;
            final SubLObject key = (SubLObject)rkf_text_processors.$sym140$KEY;
            final SubLObject value = (SubLObject)rkf_text_processors.$sym141$VALUE;
            final SubLObject name = (SubLObject)rkf_text_processors.$sym142$NAME;
            final SubLObject category = (SubLObject)rkf_text_processors.$sym143$CATEGORY;
            final SubLObject entry_point = (SubLObject)rkf_text_processors.$sym144$ENTRY_POINT;
            final SubLObject docstring = (SubLObject)rkf_text_processors.$sym145$DOCSTRING;
            final SubLObject cost = (SubLObject)rkf_text_processors.$sym146$COST;
            final SubLObject quality = (SubLObject)rkf_text_processors.$sym147$QUALITY;
            final SubLObject expected_expansions = (SubLObject)rkf_text_processors.$sym148$EXPECTED_EXPANSIONS;
            final SubLObject supplants = (SubLObject)rkf_text_processors.$sym149$SUPPLANTS;
            return (SubLObject)ConsesLow.list((SubLObject)rkf_text_processors.$sym1$CLET, (SubLObject)ConsesLow.list(name, category, entry_point, docstring, cost, quality, expected_expansions, supplants), (SubLObject)ConsesLow.list((SubLObject)rkf_text_processors.$sym150$IGNORE, docstring), (SubLObject)ConsesLow.list((SubLObject)rkf_text_processors.$sym151$CDOLIST, (SubLObject)ConsesLow.list(curr, keys), (SubLObject)ConsesLow.list((SubLObject)rkf_text_processors.$sym152$CDESTRUCTURING_BIND, (SubLObject)ConsesLow.list(key, value), curr, (SubLObject)ConsesLow.list(new SubLObject[] { rkf_text_processors.$sym153$PCASE, key, ConsesLow.list((SubLObject)rkf_text_processors.$kw93$NAME, (SubLObject)ConsesLow.list((SubLObject)rkf_text_processors.$sym154$CSETQ, name, value)), ConsesLow.list((SubLObject)rkf_text_processors.$kw94$CATEGORY, (SubLObject)ConsesLow.list((SubLObject)rkf_text_processors.$sym154$CSETQ, category, value)), ConsesLow.list((SubLObject)rkf_text_processors.$kw95$ENTRY_POINT, (SubLObject)ConsesLow.list((SubLObject)rkf_text_processors.$sym154$CSETQ, entry_point, value)), ConsesLow.list((SubLObject)rkf_text_processors.$kw155$DOC, (SubLObject)ConsesLow.list((SubLObject)rkf_text_processors.$sym154$CSETQ, docstring, value)), ConsesLow.list((SubLObject)rkf_text_processors.$kw61$QUALITY, (SubLObject)ConsesLow.list((SubLObject)rkf_text_processors.$sym154$CSETQ, quality, value)), ConsesLow.list((SubLObject)rkf_text_processors.$kw96$COST, (SubLObject)ConsesLow.list((SubLObject)rkf_text_processors.$sym154$CSETQ, cost, value)), ConsesLow.list((SubLObject)rkf_text_processors.$kw97$EXPECTED_EXPANSIONS, (SubLObject)ConsesLow.list((SubLObject)rkf_text_processors.$sym154$CSETQ, expected_expansions, value)), ConsesLow.list((SubLObject)rkf_text_processors.$kw98$SUPPLANTS, (SubLObject)ConsesLow.list((SubLObject)rkf_text_processors.$sym154$CSETQ, supplants, value)), ConsesLow.list((SubLObject)rkf_text_processors.$sym156$OTHERWISE, (SubLObject)ConsesLow.list((SubLObject)rkf_text_processors.$sym157$ERROR, (SubLObject)rkf_text_processors.$str158$Invalid_key__S_in_parser_module_r, key)) }))), (SubLObject)ConsesLow.list((SubLObject)rkf_text_processors.$sym1$CLET, (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(pmd, (SubLObject)ConsesLow.list((SubLObject)rkf_text_processors.$sym159$NEW_PARSE_MODULE_DEFINITION, name, category, quality, entry_point, cost, expected_expansions, supplants))), (SubLObject)ConsesLow.list((SubLObject)rkf_text_processors.$sym160$RKF_UTTRDR_REGISTER_PARSER, category, pmd)));
        }
        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_text_processors.$list137);
        return (SubLObject)rkf_text_processors.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 36994L)
    public static SubLObject pmd_npp_quality() {
        return (SubLObject)rkf_text_processors.TEN_INTEGER;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 42331L)
    public static SubLObject rkf_uttrdr_use_template_parser(final SubLObject text, final SubLObject category, final SubLObject parsing_mt, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject parses = (SubLObject)rkf_text_processors.NIL;
        final SubLObject _prev_bind_0 = parsing_vars.$perform_vp_parser_expansion$.currentBinding(thread);
        final SubLObject _prev_bind_2 = parsing_vars.$psp_return_mode$.currentBinding(thread);
        try {
            parsing_vars.$perform_vp_parser_expansion$.bind(rkf_text_processors.$rkf_uttrdr_use_vpp_in_itp$.getDynamicValue(thread), thread);
            parsing_vars.$psp_return_mode$.bind(rkf_text_processors.$rkf_uttrdr_psp_return_mode$.getDynamicValue(thread), thread);
            parses = iterative_template_parser.itp_sequel(text, category, parsing_mt, domain_mt);
        }
        finally {
            parsing_vars.$psp_return_mode$.rebind(_prev_bind_2, thread);
            parsing_vars.$perform_vp_parser_expansion$.rebind(_prev_bind_0, thread);
        }
        return parses;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 42659L)
    public static SubLObject rkf_uttrdr_parse_inf_vbar(final SubLObject text, final SubLObject category, final SubLObject parsing_mt, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)rkf_text_processors.NIL;
        final SubLObject tokenization = rkf_concept_harvester.rkf_ch_string_tokenize(text);
        final SubLObject token_count = Sequences.length(tokenization);
        final SubLObject _prev_bind_0 = parsing_vars.$psp_return_mode$.currentBinding(thread);
        try {
            parsing_vars.$psp_return_mode$.bind(rkf_text_processors.$rkf_uttrdr_psp_return_mode$.getDynamicValue(thread), thread);
            final SubLObject lexicon = psp_lexicon.get_default_psp_lexicon(parsing_mt, (SubLObject)rkf_text_processors.UNPROVIDED, (SubLObject)rkf_text_processors.UNPROVIDED);
            if (rkf_text_processors.NIL != rkf_uttrdr_full_spans_onlyP()) {
                final SubLObject parses = psp_main.ps_parse_vbar(text, rkf_text_processors.$const185$infinitive, lexicon, (SubLObject)rkf_text_processors.UNPROVIDED);
                if (rkf_text_processors.NIL != parses) {
                    final SubLObject span = parsing_utilities.token_list_from_span((SubLObject)rkf_text_processors.ZERO_INTEGER, token_count);
                    final SubLObject span_harvest = (SubLObject)ConsesLow.list(span, parses);
                    result = (SubLObject)ConsesLow.list(span_harvest);
                }
            }
            else {
                result = psp_main.ps_harvest_nps(text, (SubLObject)rkf_text_processors.NIL, lexicon);
            }
        }
        finally {
            parsing_vars.$psp_return_mode$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 43334L)
    public static SubLObject rkf_uttrdr_use_noun_phrase_parser(final SubLObject text, final SubLObject category, final SubLObject parsing_mt, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)rkf_text_processors.NIL;
        final SubLObject tokenization = rkf_concept_harvester.rkf_ch_string_tokenize(text);
        final SubLObject token_count = Sequences.length(tokenization);
        final SubLObject _prev_bind_0 = parsing_vars.$psp_return_mode$.currentBinding(thread);
        try {
            parsing_vars.$psp_return_mode$.bind(rkf_text_processors.$rkf_uttrdr_psp_return_mode$.getDynamicValue(thread), thread);
            final SubLObject lexicon = psp_lexicon.get_default_psp_lexicon(parsing_mt, (SubLObject)rkf_text_processors.UNPROVIDED, (SubLObject)rkf_text_processors.UNPROVIDED);
            if (rkf_text_processors.NIL != rkf_uttrdr_full_spans_onlyP()) {
                final SubLObject parses = psp_main.ps_get_cycls_for_np(text, (SubLObject)rkf_text_processors.NIL, lexicon, (SubLObject)rkf_text_processors.UNPROVIDED);
                if (rkf_text_processors.NIL != parses) {
                    final SubLObject span = parsing_utilities.token_list_from_span((SubLObject)rkf_text_processors.ZERO_INTEGER, token_count);
                    final SubLObject span_harvest = (SubLObject)ConsesLow.list(span, parses);
                    result = (SubLObject)ConsesLow.list(span_harvest);
                }
            }
            else {
                result = psp_main.ps_harvest_nps(text, (SubLObject)rkf_text_processors.NIL, lexicon);
            }
        }
        finally {
            parsing_vars.$psp_return_mode$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 44014L)
    public static SubLObject rkf_uttrdr_use_noun_compound_parser(final SubLObject text, final SubLObject category, final SubLObject parsing_mt, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject result = (SubLObject)rkf_text_processors.NIL;
        final SubLObject tokenization = rkf_concept_harvester.rkf_ch_string_tokenize(text);
        final SubLObject token_count = Sequences.length(tokenization);
        final SubLObject _prev_bind_0 = parsing_vars.$psp_return_mode$.currentBinding(thread);
        try {
            parsing_vars.$psp_return_mode$.bind(rkf_text_processors.$rkf_uttrdr_psp_return_mode$.getDynamicValue(thread), thread);
            if (token_count.numG((SubLObject)rkf_text_processors.ONE_INTEGER)) {
                final SubLObject non_trivialP = rkf_uttrdr_full_spans_onlyP();
                final SubLObject harvest = psp_main.ps_harvest_nbars(text, non_trivialP, psp_lexicon.get_default_psp_lexicon(parsing_mt, (SubLObject)rkf_text_processors.UNPROVIDED, (SubLObject)rkf_text_processors.UNPROVIDED));
                if (rkf_text_processors.NIL != rkf_uttrdr_full_spans_onlyP()) {
                    SubLObject cdolist_list_var = harvest;
                    SubLObject part = (SubLObject)rkf_text_processors.NIL;
                    part = cdolist_list_var.first();
                    while (rkf_text_processors.NIL != cdolist_list_var) {
                        SubLObject current;
                        final SubLObject datum = current = part;
                        SubLObject span = (SubLObject)rkf_text_processors.NIL;
                        SubLObject interpretations = (SubLObject)rkf_text_processors.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list0);
                        span = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list0);
                        interpretations = current.first();
                        current = current.rest();
                        if (rkf_text_processors.NIL == current) {
                            if (rkf_text_processors.NIL != list_utilities.lengthE(span, token_count, (SubLObject)rkf_text_processors.UNPROVIDED)) {
                                result = (SubLObject)ConsesLow.list(part);
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_text_processors.$list0);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        part = cdolist_list_var.first();
                    }
                }
                else {
                    result = harvest;
                }
            }
        }
        finally {
            parsing_vars.$psp_return_mode$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 44876L)
    public static SubLObject rkf_uttrdr_use_noun_compound_lexicon(final SubLObject text, final SubLObject category, final SubLObject parsing_mt, final SubLObject domain_mt) {
        return rkf_uttrdr_generic_lexical_parser((SubLObject)rkf_text_processors.$sym186$RKF_CH_NOUN_COMPOUND_PHRASE_PARSER, text, category, parsing_mt, domain_mt);
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 45110L)
    public static SubLObject rkf_uttrdr_use_multi_word_denotations(final SubLObject text, final SubLObject category, final SubLObject parsing_mt, final SubLObject domain_mt) {
        return rkf_uttrdr_generic_lexical_parser((SubLObject)rkf_text_processors.$sym187$RKF_CH_DENOTATIONS_FROM_MULTI_WORD_STRING, text, category, parsing_mt, domain_mt);
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 45351L)
    public static SubLObject rkf_uttrdr_use_denots_of_string(final SubLObject text, final SubLObject category, final SubLObject parsing_mt, final SubLObject domain_mt) {
        return rkf_uttrdr_generic_lexical_parser((SubLObject)rkf_text_processors.$sym188$RKF_CH_DENOTATIONS_FOR_STRING, text, category, parsing_mt, domain_mt);
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 45572L)
    public static SubLObject rkf_uttrdr_read_as_string(final SubLObject text, final SubLObject category, final SubLObject parsing_mt, final SubLObject domain_mt) {
        final SubLObject word_count = Sequences.length(rkf_concept_harvester.rkf_ch_string_tokenize(text));
        return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(parsing_utilities.token_list_from_span((SubLObject)rkf_text_processors.ZERO_INTEGER, word_count), (SubLObject)ConsesLow.list(text)));
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 45838L)
    public static SubLObject rkf_uttrdr_read_cycl_term_from_string(final SubLObject text, final SubLObject category, final SubLObject parsing_mt, final SubLObject domain_mt) {
        return rkf_uttrdr_generic_lexical_parser((SubLObject)rkf_text_processors.$sym189$RKF_TERM_FROM_STRING, text, category, parsing_mt, domain_mt);
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 46041L)
    public static SubLObject rkf_term_from_string(final SubLObject text, final SubLObject parsing_mt, SubLObject pos) {
        if (pos == rkf_text_processors.UNPROVIDED) {
            pos = (SubLObject)rkf_text_processors.NIL;
        }
        assert rkf_text_processors.NIL != Types.stringp(text) : text;
        SubLObject result = (SubLObject)rkf_text_processors.NIL;
        final SubLObject tokens = rkf_concept_harvester.rkf_ch_string_tokenize(text);
        SubLObject index = (SubLObject)rkf_text_processors.ZERO_INTEGER;
        SubLObject cdolist_list_var = tokens;
        SubLObject token = (SubLObject)rkf_text_processors.NIL;
        token = cdolist_list_var.first();
        while (rkf_text_processors.NIL != cdolist_list_var) {
            SubLObject cycl_candidate_parse = (SubLObject)rkf_text_processors.NIL;
            if (rkf_text_processors.NIL != string_utilities.string_starts_with_constant_reader_prefix_p(token)) {
                cycl_candidate_parse = reader.read_from_string_ignoring_errors(token, (SubLObject)rkf_text_processors.UNPROVIDED, (SubLObject)rkf_text_processors.UNPROVIDED, (SubLObject)rkf_text_processors.UNPROVIDED, (SubLObject)rkf_text_processors.UNPROVIDED);
                if (rkf_text_processors.NIL != cycl_candidate_parse) {
                    final SubLObject item_var = (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(index), (SubLObject)ConsesLow.list(cycl_candidate_parse));
                    if (rkf_text_processors.NIL == conses_high.member(item_var, result, Symbols.symbol_function((SubLObject)rkf_text_processors.EQL), Symbols.symbol_function((SubLObject)rkf_text_processors.IDENTITY))) {
                        result = (SubLObject)ConsesLow.cons(item_var, result);
                    }
                }
            }
            index = Numbers.add(index, (SubLObject)rkf_text_processors.ONE_INTEGER);
            cdolist_list_var = cdolist_list_var.rest();
            token = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 46599L)
    public static SubLObject rkf_uttrdr_generic_lexical_parser(final SubLObject function, final SubLObject text, final SubLObject category, final SubLObject parsing_mt, final SubLObject domain_mt) {
        final SubLObject pos = iterative_template_parser.pos_for_rtp_cat(category);
        SubLObject result = (SubLObject)rkf_text_processors.NIL;
        final SubLObject tokenization = rkf_concept_harvester.rkf_ch_string_tokenize(text);
        final SubLObject span = rkf_uttrdr_turn_tokens_into_span(tokenization);
        final SubLObject parses = (rkf_text_processors.NIL != pos) ? Functions.funcall(function, text, parsing_mt, pos) : Functions.funcall(function, text, parsing_mt);
        if (rkf_text_processors.NIL != parses) {
            final SubLObject top_parse = parses.first();
            SubLObject current;
            final SubLObject datum = current = top_parse;
            SubLObject parse_span = (SubLObject)rkf_text_processors.NIL;
            SubLObject interpretation = (SubLObject)rkf_text_processors.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list191);
            parse_span = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list191);
            interpretation = current.first();
            current = current.rest();
            if (rkf_text_processors.NIL == current) {
                if (Sequences.length(parse_span).numE(Sequences.length(span))) {
                    result = (SubLObject)ConsesLow.list(top_parse);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_text_processors.$list191);
            }
        }
        return result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 47629L)
    public static SubLObject rkf_uttrdr_use_number_parser(final SubLObject text, final SubLObject category, final SubLObject parsing_mt, final SubLObject domain_mt) {
        return rkf_uttrdr_generic_lexical_parser((SubLObject)rkf_text_processors.$sym192$RKF_NUMBER_PARSER, text, category, parsing_mt, domain_mt);
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 47822L)
    public static SubLObject rkf_number_parser(final SubLObject string, final SubLObject mt, SubLObject pos) {
        if (pos == rkf_text_processors.UNPROVIDED) {
            pos = (SubLObject)rkf_text_processors.NIL;
        }
        final SubLObject tokens = rkf_concept_harvester.rkf_ch_string_tokenize(string);
        final SubLObject token_list = rkf_uttrdr_turn_tokens_into_span(tokens);
        final SubLObject number = numeral_parser.string_to_interval(string);
        if (rkf_text_processors.NIL != number) {
            return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(token_list, (SubLObject)ConsesLow.list(number)));
        }
        return (SubLObject)rkf_text_processors.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 48135L)
    public static SubLObject rkf_uttrdr_turn_terms_into_parse_result(SubLObject terms, final SubLObject tokenization, final SubLObject domain_mt) {
        if (rkf_text_processors.NIL != terms) {
            if (rkf_text_processors.NIL == rkf_uttrdr_are_nltags_allowedP()) {
                terms = rkf_uttrdr_interpret_nltagfn_terms(terms, domain_mt);
            }
            final SubLObject span = rkf_uttrdr_turn_tokens_into_span(tokenization);
            return (SubLObject)ConsesLow.list((SubLObject)ConsesLow.list(Sequences.nreverse(span), terms));
        }
        return (SubLObject)rkf_text_processors.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 48606L)
    public static SubLObject rkf_uttrdr_turn_tokens_into_span(final SubLObject tokenization) {
        SubLObject span = (SubLObject)rkf_text_processors.NIL;
        SubLObject list_var = (SubLObject)rkf_text_processors.NIL;
        SubLObject token = (SubLObject)rkf_text_processors.NIL;
        SubLObject count = (SubLObject)rkf_text_processors.NIL;
        list_var = tokenization;
        token = list_var.first();
        for (count = (SubLObject)rkf_text_processors.ZERO_INTEGER; rkf_text_processors.NIL != list_var; list_var = list_var.rest(), token = list_var.first(), count = Numbers.add((SubLObject)rkf_text_processors.ONE_INTEGER, count)) {
            span = (SubLObject)ConsesLow.cons(count, span);
        }
        return Sequences.nreverse(span);
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 48941L)
    public static SubLObject rkf_uttrdr_interpret_nltagfn_terms(final SubLObject terms, final SubLObject domain_mt) {
        SubLObject result = (SubLObject)rkf_text_processors.NIL;
        SubLObject cdolist_list_var = terms;
        SubLObject v_term = (SubLObject)rkf_text_processors.NIL;
        v_term = cdolist_list_var.first();
        while (rkf_text_processors.NIL != cdolist_list_var) {
            final SubLObject reformulated = reformulator_hub.reformulate_cycl(v_term, domain_mt, (SubLObject)rkf_text_processors.UNPROVIDED);
            final SubLObject item_var;
            final SubLObject interpreted = item_var = rkf_uttrdr_interpret_nltagfn_term(reformulated, domain_mt);
            if (rkf_text_processors.NIL == conses_high.member(item_var, result, (SubLObject)rkf_text_processors.EQUALP, Symbols.symbol_function((SubLObject)rkf_text_processors.IDENTITY))) {
                result = (SubLObject)ConsesLow.cons(item_var, result);
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        }
        return Sequences.nreverse(result);
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 49596L)
    public static SubLObject rkf_uttrdr_interpret_nltagfn_term(final SubLObject v_term, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (rkf_text_processors.NIL != constant_handles.constant_p(v_term)) {
            return v_term;
        }
        SubLObject representation = (SubLObject)rkf_text_processors.NIL;
        SubLObject interpretation = (SubLObject)rkf_text_processors.NIL;
        SubLObject components = (SubLObject)rkf_text_processors.NIL;
        SubLObject done = (SubLObject)rkf_text_processors.NIL;
        if (rkf_text_processors.NIL != nart_handles.nart_p(v_term)) {
            representation = narts_high.nart_el_formula(v_term);
        }
        else {
            representation = v_term;
        }
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind((SubLObject)rkf_text_processors.$sym59$RELEVANT_MT_IS_GENL_MT, thread);
            mt_relevance_macros.$mt$.bind(domain_mt, thread);
            while (rkf_text_processors.NIL == done) {
                final SubLObject functor = representation.isList() ? representation.first() : representation;
                if (functor.eql(rkf_text_processors.$const194$NLNumberFn)) {
                    representation = cycl_utilities.formula_arg2(representation, (SubLObject)rkf_text_processors.UNPROVIDED);
                }
                else if (functor.eql(rkf_text_processors.$const195$NLQuantFn) || functor.eql(rkf_text_processors.$const196$NLQuantFn_3)) {
                    if (cycl_utilities.formula_arg1(representation, (SubLObject)rkf_text_processors.UNPROVIDED).isList() && cycl_utilities.formula_arg0(cycl_utilities.formula_arg1(representation, (SubLObject)rkf_text_processors.UNPROVIDED)).eql(rkf_text_processors.$const197$NumericalQuant_NLAttrFn)) {
                        final SubLObject number = cycl_utilities.formula_arg1(cycl_utilities.formula_arg1(representation, (SubLObject)rkf_text_processors.UNPROVIDED), (SubLObject)rkf_text_processors.UNPROVIDED);
                        components = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(rkf_text_processors.$const198$GroupOfCardinalityFn, rkf_text_processors.$rkf_uttrdr_marker$.getGlobalValue(), number), components);
                    }
                    representation = cycl_utilities.formula_arg2(representation, (SubLObject)rkf_text_processors.UNPROVIDED);
                }
                else if (rkf_text_processors.NIL != parsing_utilities.nl_tag_fnP(functor, (SubLObject)rkf_text_processors.UNPROVIDED)) {
                    representation = cycl_utilities.formula_arg2(representation, (SubLObject)rkf_text_processors.UNPROVIDED);
                }
                else {
                    components = (SubLObject)ConsesLow.cons(representation, components);
                    done = (SubLObject)rkf_text_processors.T;
                }
            }
        }
        finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        while (rkf_text_processors.NIL != components) {
            final SubLObject item = components.first();
            if (rkf_text_processors.NIL != interpretation) {
                interpretation = conses_high.subst(interpretation, rkf_text_processors.$rkf_uttrdr_marker$.getGlobalValue(), item, (SubLObject)rkf_text_processors.UNPROVIDED, (SubLObject)rkf_text_processors.UNPROVIDED);
            }
            else {
                interpretation = item;
            }
            components = components.rest();
        }
        return interpretation;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 51138L)
    public static SubLObject rkf_uttrdr_perform_parsing(final SubLObject text, final SubLObject category, final SubLObject parsing_mt, final SubLObject domain_mt) {
        final SubLObject pmg = rkf_uttrdr_find_parse_module_group(category);
        SubLObject parse_result = (SubLObject)rkf_text_processors.NIL;
        SubLObject parses = (SubLObject)rkf_text_processors.NIL;
        if (rkf_text_processors.NIL != pmg) {
            parse_result = rkf_uttrdr_parsing_in_category(text, pmg, parsing_mt, domain_mt);
            if (rkf_text_processors.NIL == rkf_uttrdr_are_nltags_allowedP()) {
                rkf_uttrdr_reconsider_parse_result_semantics(parse_result, domain_mt);
            }
            parses = rkf_uttrdr_generate_parse_from_parse_result(parse_result);
        }
        return parses;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 51765L)
    public static SubLObject rkf_uttrdr_reconsider_parse_result_semantics(final SubLObject parse_result, final SubLObject domain_mt) {
        return parse_result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 52039L)
    public static SubLObject rkf_uttrdr_parsing_in_category(final SubLObject text, final SubLObject pmg, final SubLObject parsing_mt, final SubLObject domain_mt) {
        final SubLObject category = pmg_category(pmg);
        SubLObject parses = (SubLObject)rkf_text_processors.NIL;
        final SubLObject tokenization = rkf_concept_harvester.rkf_ch_string_tokenize(text);
        final SubLObject span = rkf_uttrdr_turn_tokens_into_span(tokenization);
        final SubLObject full_span = (SubLObject)ConsesLow.cons(rkf_text_processors.$const38$TheList, span);
        parses = rkf_uttrd_parse_with_assistants(text, full_span, category, parsing_mt, domain_mt);
        if (rkf_text_processors.NIL != parses) {
            final SubLObject parse_result = new_parse_result(parses);
            rkf_uttrdr_triage_results(parse_result, parsing_mt, domain_mt);
            if (rkf_text_processors.NIL == parse_result_emptyP(parse_result)) {
                rkf_uttrdr_incomplete_constituents(parse_result, parsing_mt, domain_mt);
                if (rkf_text_processors.NIL == parse_result_emptyP(parse_result)) {
                    rkf_uttrdr_augment_constitutents(parse_result, domain_mt);
                    return parse_result;
                }
            }
        }
        return (SubLObject)rkf_text_processors.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 52985L)
    public static SubLObject rkf_uttrd_parse_with_assistants(final SubLObject string, final SubLObject span, final SubLObject category, final SubLObject parsing_mt, final SubLObject domain_mt) {
        final SubLObject pmg = rkf_uttrdr_find_parse_module_group(category);
        final SubLObject span_numbers = span.rest();
        SubLObject ranking = Numbers.$most_positive_fixnum$.getGlobalValue();
        SubLObject parses = (SubLObject)rkf_text_processors.NIL;
        SubLObject doneP = (SubLObject)rkf_text_processors.NIL;
        if (rkf_text_processors.NIL == pmg) {
            return (SubLObject)rkf_text_processors.NIL;
        }
        if (rkf_text_processors.NIL == doneP) {
            SubLObject csome_list_var = rkf_uttrdr_compute_applicable_asisstants(pmg);
            SubLObject pmd = (SubLObject)rkf_text_processors.NIL;
            pmd = csome_list_var.first();
            while (rkf_text_processors.NIL == doneP && rkf_text_processors.NIL != csome_list_var) {
                if (rkf_text_processors.NIL != parses && ranking.numL(pmd_resolved_quality(pmd))) {
                    doneP = (SubLObject)rkf_text_processors.T;
                }
                else if (rkf_text_processors.NIL == parses || ranking.numE(pmd_resolved_quality(pmd))) {
                    ranking = pmd_resolved_quality(pmd);
                    final SubLObject attempt = rkf_uttrdr_invoke_pmd(pmd, string, category, parsing_mt, domain_mt);
                    if (rkf_text_processors.NIL != attempt) {
                        parses = rkf_uttrdr_merge_parse_results(parses, attempt);
                    }
                }
                else {
                    doneP = (SubLObject)rkf_text_processors.T;
                }
                csome_list_var = csome_list_var.rest();
                pmd = csome_list_var.first();
            }
        }
        if (rkf_text_processors.NIL != parses) {
            SubLObject result = (SubLObject)rkf_text_processors.NIL;
            SubLObject cdolist_list_var = parses;
            SubLObject parse = (SubLObject)rkf_text_processors.NIL;
            parse = cdolist_list_var.first();
            while (rkf_text_processors.NIL != cdolist_list_var) {
                SubLObject current;
                final SubLObject datum = current = parse;
                SubLObject relative_span = (SubLObject)rkf_text_processors.NIL;
                SubLObject interpretations = (SubLObject)rkf_text_processors.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list199);
                relative_span = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list199);
                interpretations = current.first();
                current = current.rest();
                if (rkf_text_processors.NIL == current) {
                    final SubLObject new_span = iterative_template_parser.adjust_the_spans(relative_span, span_numbers, (SubLObject)rkf_text_processors.$sym200$IS_THIS_A_NUMERIC_SPAN_);
                    final SubLObject new_interps = iterative_template_parser.adjust_the_spans(interpretations, span_numbers, (SubLObject)rkf_text_processors.$sym201$IS_THIS_A_QUANT_FN_);
                    final SubLObject new_parse = (SubLObject)ConsesLow.list(new_span, new_interps);
                    result = (SubLObject)ConsesLow.cons(new_parse, result);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_text_processors.$list199);
                }
                cdolist_list_var = cdolist_list_var.rest();
                parse = cdolist_list_var.first();
            }
            parses = Sequences.nreverse(result);
        }
        return parses;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 54362L)
    public static SubLObject rkf_uttrdr_merge_parse_results(final SubLObject old_parses, final SubLObject new_attempt) {
        if (rkf_text_processors.NIL == old_parses) {
            return new_attempt;
        }
        final SubLObject table = dictionary.new_dictionary((SubLObject)rkf_text_processors.EQUALP, (SubLObject)rkf_text_processors.UNPROVIDED);
        SubLObject cdolist_list_var = new_attempt;
        SubLObject subpart = (SubLObject)rkf_text_processors.NIL;
        subpart = cdolist_list_var.first();
        while (rkf_text_processors.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = subpart;
            SubLObject span = (SubLObject)rkf_text_processors.NIL;
            SubLObject interpretations = (SubLObject)rkf_text_processors.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list0);
            span = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list0);
            interpretations = current.first();
            current = current.rest();
            if (rkf_text_processors.NIL == current) {
                dictionary.dictionary_enter(table, span, interpretations);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_text_processors.$list0);
            }
            cdolist_list_var = cdolist_list_var.rest();
            subpart = cdolist_list_var.first();
        }
        cdolist_list_var = old_parses;
        subpart = (SubLObject)rkf_text_processors.NIL;
        subpart = cdolist_list_var.first();
        while (rkf_text_processors.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = subpart;
            SubLObject span = (SubLObject)rkf_text_processors.NIL;
            SubLObject interpretations = (SubLObject)rkf_text_processors.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list0);
            span = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list0);
            interpretations = current.first();
            current = current.rest();
            if (rkf_text_processors.NIL == current) {
                final SubLObject new_interpretations = dictionary.dictionary_lookup(table, span, (SubLObject)rkf_text_processors.UNPROVIDED);
                if (rkf_text_processors.NIL != new_interpretations) {
                    SubLObject cdolist_list_var_$4 = new_interpretations;
                    SubLObject interpretation = (SubLObject)rkf_text_processors.NIL;
                    interpretation = cdolist_list_var_$4.first();
                    while (rkf_text_processors.NIL != cdolist_list_var_$4) {
                        final SubLObject item_var = interpretation;
                        if (rkf_text_processors.NIL == conses_high.member(item_var, interpretations, (SubLObject)rkf_text_processors.EQUALP, Symbols.symbol_function((SubLObject)rkf_text_processors.IDENTITY))) {
                            interpretations = (SubLObject)ConsesLow.cons(item_var, interpretations);
                        }
                        cdolist_list_var_$4 = cdolist_list_var_$4.rest();
                        interpretation = cdolist_list_var_$4.first();
                    }
                }
                dictionary.dictionary_enter(table, span, interpretations);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_text_processors.$list0);
            }
            cdolist_list_var = cdolist_list_var.rest();
            subpart = cdolist_list_var.first();
        }
        return rkf_textproc_dictionary_to_parse(table);
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 55257L)
    public static SubLObject rkf_uttrdr_compute_applicable_asisstants(final SubLObject pmg) {
        return pmg_ordered_tools(pmg);
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 55355L)
    public static SubLObject rkf_uttrdr_triage_results(final SubLObject parse_result, final SubLObject parsing_mt, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject constituents = parse_result_constituents(parse_result);
        final SubLObject eliminations = parse_result_eliminated(parse_result);
        final SubLObject issues = parse_result_problems(parse_result);
        thread.resetMultipleValues();
        final SubLObject modifications = rkf_uttrdr_separate_wheat_and_chaffe(parse_result, domain_mt);
        final SubLObject dead_ends = thread.secondMultipleValue();
        final SubLObject open_issues = thread.thirdMultipleValue();
        thread.resetMultipleValues();
        SubLObject cdolist_list_var = dead_ends;
        SubLObject dead_end = (SubLObject)rkf_text_processors.NIL;
        dead_end = cdolist_list_var.first();
        while (rkf_text_processors.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = dead_end;
            SubLObject span = (SubLObject)rkf_text_processors.NIL;
            SubLObject interpretations = (SubLObject)rkf_text_processors.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list0);
            span = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list0);
            interpretations = current.first();
            current = current.rest();
            if (rkf_text_processors.NIL == current) {
                dictionary.dictionary_enter(eliminations, span, interpretations);
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_text_processors.$list0);
            }
            cdolist_list_var = cdolist_list_var.rest();
            dead_end = cdolist_list_var.first();
        }
        cdolist_list_var = modifications;
        SubLObject modification = (SubLObject)rkf_text_processors.NIL;
        modification = cdolist_list_var.first();
        while (rkf_text_processors.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = modification;
            SubLObject span = (SubLObject)rkf_text_processors.NIL;
            SubLObject interpretations = (SubLObject)rkf_text_processors.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list0);
            span = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list0);
            interpretations = current.first();
            current = current.rest();
            if (rkf_text_processors.NIL == current) {
                if (rkf_text_processors.NIL == interpretations) {
                    dictionary.dictionary_remove(constituents, span);
                }
                else {
                    dictionary.dictionary_enter(constituents, span, interpretations);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_text_processors.$list0);
            }
            cdolist_list_var = cdolist_list_var.rest();
            modification = cdolist_list_var.first();
        }
        cdolist_list_var = open_issues;
        SubLObject open_issue = (SubLObject)rkf_text_processors.NIL;
        open_issue = cdolist_list_var.first();
        while (rkf_text_processors.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = open_issue;
            SubLObject span = (SubLObject)rkf_text_processors.NIL;
            SubLObject problems = (SubLObject)rkf_text_processors.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list202);
            span = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list202);
            problems = current.first();
            current = current.rest();
            if (rkf_text_processors.NIL == current) {
                SubLObject cdolist_list_var_$5 = problems;
                SubLObject problem = (SubLObject)rkf_text_processors.NIL;
                problem = cdolist_list_var_$5.first();
                while (rkf_text_processors.NIL != cdolist_list_var_$5) {
                    SubLObject cdolist_list_var_$6 = problem;
                    SubLObject issue = (SubLObject)rkf_text_processors.NIL;
                    issue = cdolist_list_var_$6.first();
                    while (rkf_text_processors.NIL != cdolist_list_var_$6) {
                        SubLObject current_$8;
                        final SubLObject datum_$7 = current_$8 = issue;
                        SubLObject surrogate = (SubLObject)rkf_text_processors.NIL;
                        SubLObject interpretation = (SubLObject)rkf_text_processors.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current_$8, datum_$7, (SubLObject)rkf_text_processors.$list203);
                        surrogate = current_$8.first();
                        current_$8 = current_$8.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current_$8, datum_$7, (SubLObject)rkf_text_processors.$list203);
                        interpretation = current_$8.first();
                        current_$8 = current_$8.rest();
                        if (rkf_text_processors.NIL == current_$8) {
                            SubLObject known = dictionary.dictionary_lookup(issues, surrogate, (SubLObject)rkf_text_processors.UNPROVIDED);
                            known = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(interpretation, span), known);
                            dictionary.dictionary_enter(issues, surrogate, known);
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum_$7, (SubLObject)rkf_text_processors.$list203);
                        }
                        cdolist_list_var_$6 = cdolist_list_var_$6.rest();
                        issue = cdolist_list_var_$6.first();
                    }
                    cdolist_list_var_$5 = cdolist_list_var_$5.rest();
                    problem = cdolist_list_var_$5.first();
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_text_processors.$list202);
            }
            cdolist_list_var = cdolist_list_var.rest();
            open_issue = cdolist_list_var.first();
        }
        return parse_result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 56805L)
    public static SubLObject rkf_uttrdr_separate_wheat_and_chaffe(final SubLObject parse_result, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject modifications = (SubLObject)rkf_text_processors.NIL;
        SubLObject dead_ends = (SubLObject)rkf_text_processors.NIL;
        SubLObject open_issues = (SubLObject)rkf_text_processors.NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(parse_result_constituents(parse_result))); rkf_text_processors.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject span = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject interpretations = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject keepers = (SubLObject)rkf_text_processors.NIL;
            SubLObject weepers = (SubLObject)rkf_text_processors.NIL;
            SubLObject problems = (SubLObject)rkf_text_processors.NIL;
            SubLObject cdolist_list_var = interpretations;
            SubLObject interpretation = (SubLObject)rkf_text_processors.NIL;
            interpretation = cdolist_list_var.first();
            while (rkf_text_processors.NIL != cdolist_list_var) {
                final SubLObject surrogates = list_utilities.tree_gather(interpretation, (SubLObject)rkf_text_processors.$sym204$RKF_CH_PARSING_SURROGATE_P, (SubLObject)rkf_text_processors.EQUALP, (SubLObject)rkf_text_processors.UNPROVIDED, (SubLObject)rkf_text_processors.UNPROVIDED);
                SubLObject doneP = (SubLObject)rkf_text_processors.NIL;
                SubLObject problem = (SubLObject)rkf_text_processors.NIL;
                doneP = (SubLObject)rkf_text_processors.NIL;
                problem = (SubLObject)rkf_text_processors.NIL;
                if (rkf_text_processors.NIL == doneP) {
                    SubLObject csome_list_var = surrogates;
                    SubLObject surrogate = (SubLObject)rkf_text_processors.NIL;
                    surrogate = csome_list_var.first();
                    while (rkf_text_processors.NIL == doneP && rkf_text_processors.NIL != csome_list_var) {
                        SubLObject current;
                        final SubLObject datum = current = surrogate;
                        SubLObject functor = (SubLObject)rkf_text_processors.NIL;
                        SubLObject string = (SubLObject)rkf_text_processors.NIL;
                        SubLObject span_$9 = (SubLObject)rkf_text_processors.NIL;
                        SubLObject category = (SubLObject)rkf_text_processors.NIL;
                        SubLObject constraint = (SubLObject)rkf_text_processors.NIL;
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list205);
                        functor = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list205);
                        string = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list205);
                        span_$9 = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list205);
                        category = current.first();
                        current = current.rest();
                        cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list205);
                        constraint = current.first();
                        current = current.rest();
                        if (rkf_text_processors.NIL == current) {
                            if (rkf_text_processors.NIL != parse_result_known_constituentP(parse_result, span_$9)) {
                                if (rkf_text_processors.NIL == rkf_uttrdr_sanity_check_arg(interpretation, surrogate, parse_result, domain_mt)) {
                                    doneP = (SubLObject)rkf_text_processors.T;
                                }
                            }
                            else if (rkf_text_processors.NIL == iterative_template_parser.nominal_categoryP(category)) {
                                if (rkf_text_processors.NIL != subl_promotions.memberP(category, rkf_uttrdr_all_supported_categories(), (SubLObject)rkf_text_processors.UNPROVIDED, (SubLObject)rkf_text_processors.UNPROVIDED)) {
                                    problem = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(surrogate, interpretation), problem);
                                }
                                else {
                                    doneP = (SubLObject)rkf_text_processors.T;
                                }
                            }
                        }
                        else {
                            cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_text_processors.$list205);
                        }
                        csome_list_var = csome_list_var.rest();
                        surrogate = csome_list_var.first();
                    }
                }
                if (rkf_text_processors.NIL != doneP) {
                    weepers = (SubLObject)ConsesLow.cons(interpretation, weepers);
                }
                else if (rkf_text_processors.NIL != problem) {
                    problems = (SubLObject)ConsesLow.cons(problem, problems);
                }
                else {
                    keepers = (SubLObject)ConsesLow.cons(interpretation, keepers);
                }
                cdolist_list_var = cdolist_list_var.rest();
                interpretation = cdolist_list_var.first();
            }
            if (rkf_text_processors.NIL != problems) {
                open_issues = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(span, problems), open_issues);
            }
            if (rkf_text_processors.NIL != weepers) {
                dead_ends = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(span, weepers), dead_ends);
                modifications = (SubLObject)ConsesLow.cons((SubLObject)ConsesLow.list(span, keepers), modifications);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        return Values.values(modifications, dead_ends, open_issues);
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 58916L)
    public static SubLObject rkf_uttrdr_sanity_check_arg(final SubLObject interpretation, final SubLObject surrogate, final SubLObject parse_result, final SubLObject domain_mt) {
        return (SubLObject)rkf_text_processors.T;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 59124L)
    public static SubLObject rkf_uttrdr_incomplete_constituents(final SubLObject parse_result, final SubLObject parsing_mt, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (rkf_text_processors.NIL == parse_result_open_issuesP(parse_result)) {
            return parse_result;
        }
        final SubLObject problems = parse_result_problems(parse_result);
        final SubLObject solutions = parse_result_solutions(parse_result);
        SubLObject failures = (SubLObject)rkf_text_processors.NIL;
        SubLObject iteration_state;
        for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(problems)); rkf_text_processors.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
            thread.resetMultipleValues();
            final SubLObject surrogate = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
            final SubLObject occurrences = thread.secondMultipleValue();
            thread.resetMultipleValues();
            SubLObject current;
            final SubLObject datum = current = surrogate;
            SubLObject functor = (SubLObject)rkf_text_processors.NIL;
            SubLObject string = (SubLObject)rkf_text_processors.NIL;
            SubLObject span = (SubLObject)rkf_text_processors.NIL;
            SubLObject category = (SubLObject)rkf_text_processors.NIL;
            SubLObject constraint = (SubLObject)rkf_text_processors.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list205);
            functor = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list205);
            string = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list205);
            span = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list205);
            category = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list205);
            constraint = current.first();
            current = current.rest();
            if (rkf_text_processors.NIL == current) {
                final SubLObject results = rkf_uttrd_parse_with_assistants(string, span, category, parsing_mt, domain_mt);
                if (rkf_text_processors.NIL != results) {
                    SubLObject adjusted_result = (SubLObject)rkf_text_processors.NIL;
                    SubLObject cdolist_list_var = results;
                    SubLObject result = (SubLObject)rkf_text_processors.NIL;
                    result = cdolist_list_var.first();
                    while (rkf_text_processors.NIL != cdolist_list_var) {
                        final SubLObject result_w_adjusted_spans = iterative_template_parser.adjust_the_spans(result, span, (SubLObject)rkf_text_processors.UNPROVIDED);
                        final SubLObject item_var;
                        final SubLObject result_w_adjusted_quants = item_var = iterative_template_parser.adjust_the_spans(result_w_adjusted_spans, span, (SubLObject)rkf_text_processors.$sym201$IS_THIS_A_QUANT_FN_);
                        if (rkf_text_processors.NIL == conses_high.member(item_var, adjusted_result, (SubLObject)rkf_text_processors.EQUALP, Symbols.symbol_function((SubLObject)rkf_text_processors.IDENTITY))) {
                            adjusted_result = (SubLObject)ConsesLow.cons(item_var, adjusted_result);
                        }
                        cdolist_list_var = cdolist_list_var.rest();
                        result = cdolist_list_var.first();
                    }
                    dictionary.dictionary_enter(solutions, surrogate, adjusted_result);
                }
                else {
                    failures = (SubLObject)ConsesLow.cons(surrogate, failures);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_text_processors.$list205);
            }
        }
        dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        rkf_uttrdr_remove_incomplete_failed(parse_result, failures);
        return parse_result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 60508L)
    public static SubLObject rkf_uttrdr_remove_incomplete_failed(final SubLObject parse_result, final SubLObject failures) {
        final SubLObject problems = parse_result_problems(parse_result);
        final SubLObject eliminations = parse_result_eliminated(parse_result);
        SubLObject cdolist_list_var = failures;
        SubLObject failure = (SubLObject)rkf_text_processors.NIL;
        failure = cdolist_list_var.first();
        while (rkf_text_processors.NIL != cdolist_list_var) {
            SubLObject cdolist_list_var_$10;
            final SubLObject occurences = cdolist_list_var_$10 = dictionary.dictionary_lookup(problems, failure, (SubLObject)rkf_text_processors.UNPROVIDED);
            SubLObject occurrence = (SubLObject)rkf_text_processors.NIL;
            occurrence = cdolist_list_var_$10.first();
            while (rkf_text_processors.NIL != cdolist_list_var_$10) {
                SubLObject current;
                final SubLObject datum = current = occurrence;
                SubLObject interpretation = (SubLObject)rkf_text_processors.NIL;
                SubLObject span = (SubLObject)rkf_text_processors.NIL;
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list206);
                interpretation = current.first();
                current = current.rest();
                cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list206);
                span = current.first();
                current = current.rest();
                if (rkf_text_processors.NIL == current) {
                    SubLObject goners = dictionary.dictionary_lookup(eliminations, span, (SubLObject)rkf_text_processors.UNPROVIDED);
                    final SubLObject item_var = interpretation;
                    if (rkf_text_processors.NIL == conses_high.member(item_var, goners, (SubLObject)rkf_text_processors.EQUAL, Symbols.symbol_function((SubLObject)rkf_text_processors.IDENTITY))) {
                        goners = (SubLObject)ConsesLow.cons(item_var, goners);
                    }
                    dictionary.dictionary_enter(eliminations, span, goners);
                }
                else {
                    cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_text_processors.$list206);
                }
                cdolist_list_var_$10 = cdolist_list_var_$10.rest();
                occurrence = cdolist_list_var_$10.first();
            }
            dictionary.dictionary_remove(problems, failure);
            cdolist_list_var = cdolist_list_var.rest();
            failure = cdolist_list_var.first();
        }
        return parse_result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 61172L)
    public static SubLObject rkf_uttrdr_augment_constitutents(final SubLObject parse_result, final SubLObject domain_mt) {
        rkf_uttrdr_apply_solutions_to_constituents(parse_result);
        rkf_uttrdr_potentially_resolve_icycl(parse_result, domain_mt);
        return parse_result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 61404L)
    public static SubLObject rkf_uttrdr_apply_solutions_to_constituents(final SubLObject parse_result) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (rkf_text_processors.NIL != parse_result_known_solutionsP(parse_result)) {
            final SubLObject solutions = parse_result_solutions(parse_result);
            final SubLObject constituents = parse_result_constituents(parse_result);
            final SubLObject problems = parse_result_problems(parse_result);
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(solutions)); rkf_text_processors.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject surrogate = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject parses = thread.secondMultipleValue();
                thread.resetMultipleValues();
                dictionary.dictionary_remove(problems, surrogate);
                SubLObject cdolist_list_var = parses;
                SubLObject parse = (SubLObject)rkf_text_processors.NIL;
                parse = cdolist_list_var.first();
                while (rkf_text_processors.NIL != cdolist_list_var) {
                    SubLObject current;
                    final SubLObject datum = current = parse;
                    SubLObject span = (SubLObject)rkf_text_processors.NIL;
                    SubLObject interpretations = (SubLObject)rkf_text_processors.NIL;
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list0);
                    span = current.first();
                    current = current.rest();
                    cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list0);
                    interpretations = current.first();
                    current = current.rest();
                    if (rkf_text_processors.NIL == current) {
                        SubLObject existing = dictionary.dictionary_lookup(constituents, span, (SubLObject)rkf_text_processors.UNPROVIDED);
                        SubLObject cdolist_list_var_$11 = interpretations;
                        SubLObject interpretation = (SubLObject)rkf_text_processors.NIL;
                        interpretation = cdolist_list_var_$11.first();
                        while (rkf_text_processors.NIL != cdolist_list_var_$11) {
                            final SubLObject item_var = interpretation;
                            if (rkf_text_processors.NIL == conses_high.member(item_var, existing, (SubLObject)rkf_text_processors.EQUALP, Symbols.symbol_function((SubLObject)rkf_text_processors.IDENTITY))) {
                                existing = (SubLObject)ConsesLow.cons(item_var, existing);
                            }
                            cdolist_list_var_$11 = cdolist_list_var_$11.rest();
                            interpretation = cdolist_list_var_$11.first();
                        }
                        dictionary.dictionary_enter(constituents, span, existing);
                    }
                    else {
                        cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_text_processors.$list0);
                    }
                    cdolist_list_var = cdolist_list_var.rest();
                    parse = cdolist_list_var.first();
                }
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            dictionary.clear_dictionary(parse_result_solutions(parse_result));
        }
        return parse_result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 62246L)
    public static SubLObject rkf_uttrdr_potentially_resolve_icycl(final SubLObject parse_result, final SubLObject domain_mt) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (rkf_text_processors.NIL == rkf_uttrdr_are_nltags_allowedP()) {
            final SubLObject solutions = parse_result_solutions(parse_result);
            final SubLObject constituents = parse_result_constituents(parse_result);
            SubLObject iteration_state;
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(constituents)); rkf_text_processors.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject span = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject interpretations = thread.secondMultipleValue();
                thread.resetMultipleValues();
                dictionary.dictionary_enter(solutions, span, rkf_uttrdr_interpret_nltagfn_terms(interpretations, domain_mt));
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
            for (iteration_state = dictionary_contents.do_dictionary_contents_state(dictionary.dictionary_contents(solutions)); rkf_text_processors.NIL == dictionary_contents.do_dictionary_contents_doneP(iteration_state); iteration_state = dictionary_contents.do_dictionary_contents_next(iteration_state)) {
                thread.resetMultipleValues();
                final SubLObject span = dictionary_contents.do_dictionary_contents_key_value(iteration_state);
                final SubLObject interpretations = thread.secondMultipleValue();
                thread.resetMultipleValues();
                dictionary.dictionary_enter(constituents, span, interpretations);
            }
            dictionary_contents.do_dictionary_contents_finalize(iteration_state);
        }
        return parse_result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 62829L)
    public static SubLObject rkf_uttrdr_generate_parse_from_parse_result(final SubLObject parse_result) {
        if (rkf_text_processors.NIL != parse_result) {
            final SubLObject constituents = parse_result_constituents(parse_result);
            if (rkf_text_processors.NIL != dictionary.dictionary_p(constituents)) {
                return rkf_textproc_dictionary_to_parse(constituents);
            }
        }
        return (SubLObject)rkf_text_processors.NIL;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 63148L)
    public static SubLObject rkf_uttrdr_order_parses(final SubLObject item_a, final SubLObject item_b) {
        SubLObject span_a = item_a.first();
        SubLObject span_b = item_b.first();
        final SubLObject length_a = Sequences.length(span_a);
        final SubLObject length_b = Sequences.length(span_b);
        if (length_a.numL(length_b)) {
            return (SubLObject)rkf_text_processors.NIL;
        }
        if (length_a.numG(length_b)) {
            return (SubLObject)rkf_text_processors.T;
        }
        SubLObject elem_a;
        SubLObject elem_b;
        for (elem_a = (SubLObject)rkf_text_processors.NIL, elem_b = (SubLObject)rkf_text_processors.NIL, elem_a = span_a.first(), elem_b = span_b.first(); !elem_a.numL(elem_b); elem_a = span_a.first(), elem_b = span_b.first()) {
            if (elem_a.numG(elem_b)) {
                return (SubLObject)rkf_text_processors.NIL;
            }
            span_a = span_a.rest();
            span_b = span_b.rest();
        }
        return (SubLObject)rkf_text_processors.T;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 63754L)
    public static SubLObject cycl_of_possibly_itp_semantics(final SubLObject v_term) {
        return (rkf_text_processors.NIL != rtp_constituent_weeders.itp_semantics_p(v_term)) ? rtp_constituent_weeders.itp_semantics_cycl(v_term) : v_term;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 63930L)
    public static SubLObject parse_a_sentence_completely(final SubLObject sentence, SubLObject mt, SubLObject v_properties) {
        if (v_properties == rkf_text_processors.UNPROVIDED) {
            v_properties = (SubLObject)rkf_text_processors.NIL;
        }
        if (mt == rkf_text_processors.UNPROVIDED) {
            mt = rkf_text_processors.$const64$RKFParsingMt;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(sentence, rkf_text_processors.$sym190$STRINGP);
        enforceType(mt, rkf_text_processors.$sym207$HLMT_);
        enforceType(v_properties, rkf_text_processors.$sym208$PROPERTY_LIST_P);
        v_properties = list_utilities.maybe_putf(v_properties, (SubLObject)rkf_text_processors.$kw209$STRENGTHEN_, (SubLObject)rkf_text_processors.T);
        v_properties = list_utilities.maybe_putf(v_properties, (SubLObject)rkf_text_processors.$kw210$MULTIPLE_QUANTIFICATIONS, (SubLObject)rkf_text_processors.NIL);
        v_properties = list_utilities.maybe_putf(v_properties, (SubLObject)rkf_text_processors.$kw211$WFF_CHECK_, (SubLObject)rkf_text_processors.NIL);
        v_properties = list_utilities.maybe_putf(v_properties, (SubLObject)rkf_text_processors.$kw212$SEMANTIC_MT, mt);
        v_properties = list_utilities.maybe_putf(v_properties, (SubLObject)rkf_text_processors.$kw213$PARSING_MT, mt);
        v_properties = conses_high.putf(v_properties, (SubLObject)rkf_text_processors.$kw214$FORCE, (SubLObject)rkf_text_processors.$kw215$DECLARATIVE);
        final SubLObject iterator = parsing_utilities.new_parse_iterator(sentence, v_properties);
        SubLObject result = (SubLObject)rkf_text_processors.NIL;
        final SubLObject v_memoization_state = reformulator_datastructures.find_or_create_reformulator_memoization_state();
        assert rkf_text_processors.NIL != memoization_state.memoization_state_p(v_memoization_state) : v_memoization_state;
        final SubLObject _prev_bind_0 = reformulator_datastructures.$reformulator_memoization_state$.currentBinding(thread);
        try {
            reformulator_datastructures.$reformulator_memoization_state$.bind(v_memoization_state, thread);
            final SubLObject local_state = reformulator_datastructures.$reformulator_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$12 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    while (rkf_text_processors.NIL == iteration.iteration_done(iterator)) {
                        final SubLObject parse_result = iteration.iteration_next(iterator);
                        if (rkf_text_processors.NIL != cycl_grammar.cycl_sentence_p(parse_result)) {
                            result = (SubLObject)ConsesLow.cons(parse_result, result);
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$13 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_text_processors.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$13, thread);
                    }
                }
            }
            finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$12, thread);
            }
        }
        finally {
            reformulator_datastructures.$reformulator_memoization_state$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 65053L)
    public static SubLObject parse_a_sentence_completely_wff(final SubLObject sentence, final SubLObject mt, SubLObject v_properties) {
        if (v_properties == rkf_text_processors.UNPROVIDED) {
            v_properties = (SubLObject)rkf_text_processors.NIL;
        }
        v_properties = conses_high.putf(v_properties, (SubLObject)rkf_text_processors.$kw211$WFF_CHECK_, (SubLObject)rkf_text_processors.T);
        return parse_a_sentence_completely(sentence, mt, v_properties);
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 65380L)
    public static SubLObject parse_a_question_completely(SubLObject sentence, final SubLObject mt, SubLObject v_properties) {
        if (v_properties == rkf_text_processors.UNPROVIDED) {
            v_properties = (SubLObject)rkf_text_processors.NIL;
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        enforceType(sentence, rkf_text_processors.$sym190$STRINGP);
        enforceType(mt, rkf_text_processors.$sym207$HLMT_);
        enforceType(v_properties, rkf_text_processors.$sym208$PROPERTY_LIST_P);
        if (rkf_text_processors.NIL == string_utilities.ends_with(sentence, (SubLObject)rkf_text_processors.$str222$_, (SubLObject)rkf_text_processors.UNPROVIDED)) {
            if (rkf_text_processors.NIL != string_utilities.ends_with_punctuation_p(sentence)) {
                sentence = Sequences.cconcatenate(format_nil.format_nil_a_no_copy(string_utilities.strip_final(sentence, (SubLObject)rkf_text_processors.UNPROVIDED)), (SubLObject)rkf_text_processors.$str222$_);
            }
            else {
                sentence = Sequences.cconcatenate(format_nil.format_nil_a_no_copy(sentence), (SubLObject)rkf_text_processors.$str222$_);
            }
        }
        v_properties = list_utilities.maybe_putf(v_properties, (SubLObject)rkf_text_processors.$kw209$STRENGTHEN_, (SubLObject)rkf_text_processors.T);
        v_properties = list_utilities.maybe_putf(v_properties, (SubLObject)rkf_text_processors.$kw210$MULTIPLE_QUANTIFICATIONS, (SubLObject)rkf_text_processors.NIL);
        v_properties = list_utilities.maybe_putf(v_properties, (SubLObject)rkf_text_processors.$kw211$WFF_CHECK_, (SubLObject)rkf_text_processors.NIL);
        v_properties = list_utilities.maybe_putf(v_properties, (SubLObject)rkf_text_processors.$kw212$SEMANTIC_MT, mt);
        v_properties = list_utilities.maybe_putf(v_properties, (SubLObject)rkf_text_processors.$kw213$PARSING_MT, mt);
        v_properties = conses_high.putf(v_properties, (SubLObject)rkf_text_processors.$kw214$FORCE, (SubLObject)rkf_text_processors.$kw223$QUERY);
        final SubLObject iterator = parsing_utilities.new_parse_iterator(sentence, v_properties);
        SubLObject result = (SubLObject)rkf_text_processors.NIL;
        final SubLObject v_memoization_state = reformulator_datastructures.find_or_create_reformulator_memoization_state();
        assert rkf_text_processors.NIL != memoization_state.memoization_state_p(v_memoization_state) : v_memoization_state;
        final SubLObject _prev_bind_0 = reformulator_datastructures.$reformulator_memoization_state$.currentBinding(thread);
        try {
            reformulator_datastructures.$reformulator_memoization_state$.bind(v_memoization_state, thread);
            final SubLObject local_state = reformulator_datastructures.$reformulator_memoization_state$.getDynamicValue(thread);
            final SubLObject _prev_bind_0_$14 = memoization_state.$memoization_state$.currentBinding(thread);
            try {
                memoization_state.$memoization_state$.bind(local_state, thread);
                final SubLObject original_memoization_process = memoization_state.memoization_state_original_process(local_state);
                try {
                    while (rkf_text_processors.NIL == iteration.iteration_done(iterator)) {
                        final SubLObject parse_result = iteration.iteration_next(iterator);
                        if (rkf_text_processors.NIL != cycl_grammar.cycl_sentence_p(parse_result)) {
                            result = (SubLObject)ConsesLow.cons(parse_result, result);
                        }
                    }
                }
                finally {
                    final SubLObject _prev_bind_0_$15 = Threads.$is_thread_performing_cleanupP$.currentBinding(thread);
                    try {
                        Threads.$is_thread_performing_cleanupP$.bind((SubLObject)rkf_text_processors.T, thread);
                        final SubLObject _values = Values.getValuesAsVector();
                        memoization_state.memoization_state_possibly_clear_original_process(local_state, original_memoization_process);
                        Values.restoreValuesFromVector(_values);
                    }
                    finally {
                        Threads.$is_thread_performing_cleanupP$.rebind(_prev_bind_0_$15, thread);
                    }
                }
            }
            finally {
                memoization_state.$memoization_state$.rebind(_prev_bind_0_$14, thread);
            }
        }
        finally {
            reformulator_datastructures.$reformulator_memoization_state$.rebind(_prev_bind_0, thread);
        }
        return result;
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 66737L)
    public static SubLObject parse_a_question_completely_wff(final SubLObject sentence, final SubLObject mt, SubLObject v_properties) {
        if (v_properties == rkf_text_processors.UNPROVIDED) {
            v_properties = (SubLObject)rkf_text_processors.NIL;
        }
        v_properties = conses_high.putf(v_properties, (SubLObject)rkf_text_processors.$kw211$WFF_CHECK_, (SubLObject)rkf_text_processors.T);
        return parse_a_question_completely(sentence, mt, v_properties);
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 67071L)
    public static SubLObject top_level_parses(final SubLObject raw_parses) {
        final SubLObject span_iterator = rtp_iterators.new_itp_result_iterator(raw_parses, (SubLObject)rkf_text_processors.UNPROVIDED, (SubLObject)rkf_text_processors.UNPROVIDED);
        final SubLObject parse_iterator = rtp_iterators.itp_result_iterator_curr(span_iterator);
        SubLObject result = (SubLObject)rkf_text_processors.NIL;
        while (rkf_text_processors.NIL == rtp_iterators.itp_section_iterator_doneP(parse_iterator)) {
            result = (SubLObject)ConsesLow.cons(rtp_iterators.itp_section_iterator_curr_cycl(parse_iterator), result);
            rtp_iterators.itp_section_iterator_next(parse_iterator);
        }
        return Sequences.nreverse(Sequences.delete_duplicates(result, (SubLObject)rkf_text_processors.EQUALP, (SubLObject)rkf_text_processors.UNPROVIDED, (SubLObject)rkf_text_processors.UNPROVIDED, (SubLObject)rkf_text_processors.UNPROVIDED));
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 67494L)
    public static SubLObject parse_a_sentence_completely_tct(final SubLObject sentence, final SubLObject mt, final SubLObject expected_ans, SubLObject v_properties) {
        if (v_properties == rkf_text_processors.UNPROVIDED) {
            v_properties = (SubLObject)rkf_text_processors.NIL;
        }
        if (rkf_text_processors.NIL == rtp_initialize.rtp_initializedP()) {
            Errors.warn((SubLObject)rkf_text_processors.$str226$RTP_is_not_initialized___So__test);
            return (SubLObject)rkf_text_processors.T;
        }
        return subl_promotions.memberP(narts_high.nart_substitute(expected_ans), parse_a_sentence_completely(sentence, mt, v_properties), (SubLObject)rkf_text_processors.EQUAL, (SubLObject)rkf_text_processors.UNPROVIDED);
    }

    @SubLTranslatedFile.SubL(source = "cycl/rkf-text-processors.lisp", position = 68074L)
    public static SubLObject parse_a_question_completely_tct(final SubLObject v_question, final SubLObject mt, final SubLObject expected_ans, SubLObject v_properties) {
        if (v_properties == rkf_text_processors.UNPROVIDED) {
            v_properties = (SubLObject)rkf_text_processors.NIL;
        }
        if (rkf_text_processors.NIL == rtp_initialize.rtp_initializedP()) {
            Errors.warn((SubLObject)rkf_text_processors.$str227$RTP_is_not_initialized___So__test);
            return (SubLObject)rkf_text_processors.T;
        }
        return subl_promotions.memberP(narts_high.nart_substitute(expected_ans), parse_a_question_completely(v_question, mt, v_properties), (SubLObject)rkf_text_processors.EQUAL, (SubLObject)rkf_text_processors.UNPROVIDED);
    }

    public static SubLObject declare_rkf_text_processors_file() {
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_textproc_parse_to_dictionary", "RKF-TEXTPROC-PARSE-TO-DICTIONARY", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_textproc_preprocess_interps", "RKF-TEXTPROC-PREPROCESS-INTERPS", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.rkf_text_processors", "with_fully_resolved_parses", "WITH-FULLY-RESOLVED-PARSES");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_textproc_dictionary_to_parse", "RKF-TEXTPROC-DICTIONARY-TO-PARSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_textproc_dictionary_to_parse_wXsurrogates", "RKF-TEXTPROC-DICTIONARY-TO-PARSE-W/SURROGATES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_textproc_dictionary_to_resolved_parse", "RKF-TEXTPROC-DICTIONARY-TO-RESOLVED-PARSE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "resolve_parse_interpretation", "RESOLVE-PARSE-INTERPRETATION", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "maybe_resolve_result_of_parsing_naut", "MAYBE-RESOLVE-RESULT-OF-PARSING-NAUT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "resolve_result_of_parsing_naut", "RESOLVE-RESULT-OF-PARSING-NAUT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "resolve_parse_interpretation_args", "RESOLVE-PARSE-INTERPRETATION-ARGS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_parse_bindings_wffP", "RKF-PARSE-BINDINGS-WFF?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_parse_subst_bindings", "RKF-PARSE-SUBST-BINDINGS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_parse_wff_check_template", "RKF-PARSE-WFF-CHECK-TEMPLATE", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_textproc_interpret_nlterm", "RKF-TEXTPROC-INTERPRET-NLTERM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_textproc_interpret_nlterms", "RKF-TEXTPROC-INTERPRET-NLTERMS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "parse_result_print_function_trampoline", "PARSE-RESULT-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "parse_result_p", "PARSE-RESULT-P", 1, 0, false);
        new $parse_result_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "parse_result_original", "PARSE-RESULT-ORIGINAL", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "parse_result_constituents", "PARSE-RESULT-CONSTITUENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "parse_result_eliminated", "PARSE-RESULT-ELIMINATED", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "parse_result_problems", "PARSE-RESULT-PROBLEMS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "parse_result_solutions", "PARSE-RESULT-SOLUTIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "_csetf_parse_result_original", "_CSETF-PARSE-RESULT-ORIGINAL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "_csetf_parse_result_constituents", "_CSETF-PARSE-RESULT-CONSTITUENTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "_csetf_parse_result_eliminated", "_CSETF-PARSE-RESULT-ELIMINATED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "_csetf_parse_result_problems", "_CSETF-PARSE-RESULT-PROBLEMS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "_csetf_parse_result_solutions", "_CSETF-PARSE-RESULT-SOLUTIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "make_parse_result", "MAKE-PARSE-RESULT", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "visit_defstruct_parse_result", "VISIT-DEFSTRUCT-PARSE-RESULT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "visit_defstruct_object_parse_result_method", "VISIT-DEFSTRUCT-OBJECT-PARSE-RESULT-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "print_parse_result", "PRINT-PARSE-RESULT", 3, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.rkf_text_processors", "with_verbose_rkf_textproc_parse_result", "WITH-VERBOSE-RKF-TEXTPROC-PARSE-RESULT");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "new_parse_result", "NEW-PARSE-RESULT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "seed_parse_result_constituents", "SEED-PARSE-RESULT-CONSTITUENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "debug_reset_parse_results", "DEBUG-RESET-PARSE-RESULTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "parse_result_emptyP", "PARSE-RESULT-EMPTY?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "parse_result_open_issuesP", "PARSE-RESULT-OPEN-ISSUES?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "parse_result_known_solutionsP", "PARSE-RESULT-KNOWN-SOLUTIONS?", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "parse_result_known_constituentP", "PARSE-RESULT-KNOWN-CONSTITUENT?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "debug_display_parse_result", "DEBUG-DISPLAY-PARSE-RESULT", 1, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "debug_display_one_parts_dictionary", "DEBUG-DISPLAY-ONE-PARTS-DICTIONARY", 2, 1, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.rkf_text_processors", "without_nltags_returned", "WITHOUT-NLTAGS-RETURNED");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_uttrdr_are_nltags_allowedP", "RKF-UTTRDR-ARE-NLTAGS-ALLOWED?", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.rkf_text_processors", "with_full_spans_only_returned", "WITH-FULL-SPANS-ONLY-RETURNED");
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.rkf_text_processors", "with_subspans_returned", "WITH-SUBSPANS-RETURNED");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_uttrdr_full_spans_onlyP", "RKF-UTTRDR-FULL-SPANS-ONLY?", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_utterance_reader", "RKF-UTTERANCE-READER", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_uttrdr_replace_pronouns", "RKF-UTTRDR-REPLACE-PRONOUNS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_imperative_reader", "RKF-IMPERATIVE-READER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_sentence_reader", "RKF-SENTENCE-READER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_question_reader", "RKF-QUESTION-READER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_store_rtp_parses_in_pipeline", "RKF-STORE-RTP-PARSES-IN-PIPELINE", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_phrase_reader", "RKF-PHRASE-READER", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_uttrdr_maybe_initialize_arg_type_template_categories", "RKF-UTTRDR-MAYBE-INITIALIZE-ARG-TYPE-TEMPLATE-CATEGORIES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_uttrdr_initialize_arg_type_template_categories", "RKF-UTTRDR-INITIALIZE-ARG-TYPE-TEMPLATE-CATEGORIES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_uttrdr_templates_for_arg_type", "RKF-UTTRDR-TEMPLATES-FOR-ARG-TYPE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_uttrdr_remove_sub_parses", "RKF-UTTRDR-REMOVE-SUB-PARSES", 2, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.rkf_text_processors", "with_parsers_ordered_by_quality", "WITH-PARSERS-ORDERED-BY-QUALITY");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "template_category_from_parse_spec", "TEMPLATE-CATEGORY-FROM-PARSE-SPEC", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_term_reader", "RKF-TERM-READER", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_term_in_sentence_reader", "RKF-TERM-IN-SENTENCE-READER", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_assertion_reader", "RKF-ASSERTION-READER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_query_reader", "RKF-QUERY-READER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_scenario_reader", "RKF-SCENARIO-READER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_parse_date_unambiguously_from_string", "RKF-PARSE-DATE-UNAMBIGUOUSLY-FROM-STRING", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "simple_rkf_date_reader", "SIMPLE-RKF-DATE-READER", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_date_reader", "RKF-DATE-READER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_text_processor_reset_caches", "RKF-TEXT-PROCESSOR-RESET-CACHES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_terms_forager", "RKF-TERMS-FORAGER", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "parse_module_definition_print_function_trampoline", "PARSE-MODULE-DEFINITION-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "parse_module_definition_p", "PARSE-MODULE-DEFINITION-P", 1, 0, false);
        new $parse_module_definition_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "pmd_name", "PMD-NAME", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "pmd_category", "PMD-CATEGORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "pmd_quality", "PMD-QUALITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "pmd_entry_point", "PMD-ENTRY-POINT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "pmd_cost", "PMD-COST", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "pmd_expected_expansions", "PMD-EXPECTED-EXPANSIONS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "pmd_supplants", "PMD-SUPPLANTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "_csetf_pmd_name", "_CSETF-PMD-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "_csetf_pmd_category", "_CSETF-PMD-CATEGORY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "_csetf_pmd_quality", "_CSETF-PMD-QUALITY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "_csetf_pmd_entry_point", "_CSETF-PMD-ENTRY-POINT", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "_csetf_pmd_cost", "_CSETF-PMD-COST", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "_csetf_pmd_expected_expansions", "_CSETF-PMD-EXPECTED-EXPANSIONS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "_csetf_pmd_supplants", "_CSETF-PMD-SUPPLANTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "make_parse_module_definition", "MAKE-PARSE-MODULE-DEFINITION", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "visit_defstruct_parse_module_definition", "VISIT-DEFSTRUCT-PARSE-MODULE-DEFINITION", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "visit_defstruct_object_parse_module_definition_method", "VISIT-DEFSTRUCT-OBJECT-PARSE-MODULE-DEFINITION-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "pmd_print", "PMD-PRINT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "new_parse_module_definition", "NEW-PARSE-MODULE-DEFINITION", 4, 3, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_uttrdr_copy_pmd", "RKF-UTTRDR-COPY-PMD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_uttrdr_pmd_classify", "RKF-UTTRDR-PMD-CLASSIFY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_uttrdr_pmd_choose_better", "RKF-UTTRDR-PMD-CHOOSE-BETTER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "pmd_resolved_quality", "PMD-RESOLVED-QUALITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_uttrdr_pmd_orderedP", "RKF-UTTRDR-PMD-ORDERED?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_uttrdr_explain_pmd", "RKF-UTTRDR-EXPLAIN-PMD", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_uttrdr_pmd_supplantsP", "RKF-UTTRDR-PMD-SUPPLANTS?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_uttrdr_invoke_pmd", "RKF-UTTRDR-INVOKE-PMD", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "parse_module_group_print_function_trampoline", "PARSE-MODULE-GROUP-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "parse_module_group_p", "PARSE-MODULE-GROUP-P", 1, 0, false);
        new $parse_module_group_p$UnaryFunction();
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "pmg_category", "PMG-CATEGORY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "pmg_tools", "PMG-TOOLS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "_csetf_pmg_category", "_CSETF-PMG-CATEGORY", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "_csetf_pmg_tools", "_CSETF-PMG-TOOLS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "make_parse_module_group", "MAKE-PARSE-MODULE-GROUP", 0, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "visit_defstruct_parse_module_group", "VISIT-DEFSTRUCT-PARSE-MODULE-GROUP", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "visit_defstruct_object_parse_module_group_method", "VISIT-DEFSTRUCT-OBJECT-PARSE-MODULE-GROUP-METHOD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "pmg_ordered_tools", "PMG-ORDERED-TOOLS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "sorted_by_quality", "SORTED-BY-QUALITY", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "pmd_expected_expansionsL", "PMD-EXPECTED-EXPANSIONS<", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "pmd_costL", "PMD-COST<", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "pmd_qualityL", "PMD-QUALITY<", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "new_parse_module_group", "NEW-PARSE-MODULE-GROUP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_uttrdr_explain_pmg", "RKF-UTTRDR-EXPLAIN-PMG", 1, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.rkf_text_processors", "with_known_parsers_lock_held", "WITH-KNOWN-PARSERS-LOCK-HELD");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_uttrdr_pmg_find_pmd_by_name", "RKF-UTTRDR-PMG-FIND-PMD-BY-NAME", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_uttrdr_pmg_find_pmd", "RKF-UTTRDR-PMG-FIND-PMD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_uttrdr_pmg_add_tool", "RKF-UTTRDR-PMG-ADD-TOOL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_uttrdr_pmg_locate_pmd", "RKF-UTTRDR-PMG-LOCATE-PMD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_uttrdr_pmg_is_knownP", "RKF-UTTRDR-PMG-IS-KNOWN?", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_uttrdr_pmg_update_pmd", "RKF-UTTRDR-PMG-UPDATE-PMD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_uttrdr_pmg_classify_pmd", "RKF-UTTRDR-PMG-CLASSIFY-PMD", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_uttrdr_find_parse_module_group", "RKF-UTTRDR-FIND-PARSE-MODULE-GROUP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_uttrdr_give_parse_module_group", "RKF-UTTRDR-GIVE-PARSE-MODULE-GROUP", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_uttrdr_show_parsers", "RKF-UTTRDR-SHOW-PARSERS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_uttrdr_all_supported_categories", "RKF-UTTRDR-ALL-SUPPORTED-CATEGORIES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_uttrdr_reset_all_supported_categories", "RKF-UTTRDR-RESET-ALL-SUPPORTED-CATEGORIES", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_uttrdr_all_supported_categories_internal", "RKF-UTTRDR-ALL-SUPPORTED-CATEGORIES-INTERNAL", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_uttrdr_register_parser", "RKF-UTTRDR-REGISTER-PARSER", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_uttrdr_deregister_all_parsers", "RKF-UTTRDR-DEREGISTER-ALL-PARSERS", 0, 0, false);
        SubLFiles.declareMacro("com.cyc.cycjava.cycl.rkf_text_processors", "register_known_parser_module", "REGISTER-KNOWN-PARSER-MODULE");
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "pmd_npp_quality", "PMD-NPP-QUALITY", 0, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_uttrdr_use_template_parser", "RKF-UTTRDR-USE-TEMPLATE-PARSER", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_uttrdr_parse_inf_vbar", "RKF-UTTRDR-PARSE-INF-VBAR", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_uttrdr_use_noun_phrase_parser", "RKF-UTTRDR-USE-NOUN-PHRASE-PARSER", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_uttrdr_use_noun_compound_parser", "RKF-UTTRDR-USE-NOUN-COMPOUND-PARSER", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_uttrdr_use_noun_compound_lexicon", "RKF-UTTRDR-USE-NOUN-COMPOUND-LEXICON", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_uttrdr_use_multi_word_denotations", "RKF-UTTRDR-USE-MULTI-WORD-DENOTATIONS", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_uttrdr_use_denots_of_string", "RKF-UTTRDR-USE-DENOTS-OF-STRING", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_uttrdr_read_as_string", "RKF-UTTRDR-READ-AS-STRING", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_uttrdr_read_cycl_term_from_string", "RKF-UTTRDR-READ-CYCL-TERM-FROM-STRING", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_term_from_string", "RKF-TERM-FROM-STRING", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_uttrdr_generic_lexical_parser", "RKF-UTTRDR-GENERIC-LEXICAL-PARSER", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_uttrdr_use_number_parser", "RKF-UTTRDR-USE-NUMBER-PARSER", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_number_parser", "RKF-NUMBER-PARSER", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_uttrdr_turn_terms_into_parse_result", "RKF-UTTRDR-TURN-TERMS-INTO-PARSE-RESULT", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_uttrdr_turn_tokens_into_span", "RKF-UTTRDR-TURN-TOKENS-INTO-SPAN", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_uttrdr_interpret_nltagfn_terms", "RKF-UTTRDR-INTERPRET-NLTAGFN-TERMS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_uttrdr_interpret_nltagfn_term", "RKF-UTTRDR-INTERPRET-NLTAGFN-TERM", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_uttrdr_perform_parsing", "RKF-UTTRDR-PERFORM-PARSING", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_uttrdr_reconsider_parse_result_semantics", "RKF-UTTRDR-RECONSIDER-PARSE-RESULT-SEMANTICS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_uttrdr_parsing_in_category", "RKF-UTTRDR-PARSING-IN-CATEGORY", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_uttrd_parse_with_assistants", "RKF-UTTRD-PARSE-WITH-ASSISTANTS", 5, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_uttrdr_merge_parse_results", "RKF-UTTRDR-MERGE-PARSE-RESULTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_uttrdr_compute_applicable_asisstants", "RKF-UTTRDR-COMPUTE-APPLICABLE-ASISSTANTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_uttrdr_triage_results", "RKF-UTTRDR-TRIAGE-RESULTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_uttrdr_separate_wheat_and_chaffe", "RKF-UTTRDR-SEPARATE-WHEAT-AND-CHAFFE", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_uttrdr_sanity_check_arg", "RKF-UTTRDR-SANITY-CHECK-ARG", 4, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_uttrdr_incomplete_constituents", "RKF-UTTRDR-INCOMPLETE-CONSTITUENTS", 3, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_uttrdr_remove_incomplete_failed", "RKF-UTTRDR-REMOVE-INCOMPLETE-FAILED", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_uttrdr_augment_constitutents", "RKF-UTTRDR-AUGMENT-CONSTITUTENTS", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_uttrdr_apply_solutions_to_constituents", "RKF-UTTRDR-APPLY-SOLUTIONS-TO-CONSTITUENTS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_uttrdr_potentially_resolve_icycl", "RKF-UTTRDR-POTENTIALLY-RESOLVE-ICYCL", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_uttrdr_generate_parse_from_parse_result", "RKF-UTTRDR-GENERATE-PARSE-FROM-PARSE-RESULT", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "rkf_uttrdr_order_parses", "RKF-UTTRDR-ORDER-PARSES", 2, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "cycl_of_possibly_itp_semantics", "CYCL-OF-POSSIBLY-ITP-SEMANTICS", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "parse_a_sentence_completely", "PARSE-A-SENTENCE-COMPLETELY", 1, 2, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "parse_a_sentence_completely_wff", "PARSE-A-SENTENCE-COMPLETELY-WFF", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "parse_a_question_completely", "PARSE-A-QUESTION-COMPLETELY", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "parse_a_question_completely_wff", "PARSE-A-QUESTION-COMPLETELY-WFF", 2, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "top_level_parses", "TOP-LEVEL-PARSES", 1, 0, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "parse_a_sentence_completely_tct", "PARSE-A-SENTENCE-COMPLETELY-TCT", 3, 1, false);
        SubLFiles.declareFunction("com.cyc.cycjava.cycl.rkf_text_processors", "parse_a_question_completely_tct", "PARSE-A-QUESTION-COMPLETELY-TCT", 3, 1, false);
        return (SubLObject)rkf_text_processors.NIL;
    }

    public static SubLObject init_rkf_text_processors_file() {
        rkf_text_processors.$rkf_text_proc_resolve_parses$ = SubLFiles.defparameter("*RKF-TEXT-PROC-RESOLVE-PARSES*", (SubLObject)rkf_text_processors.NIL);
        rkf_text_processors.$resolve_parse_interpretation_max_depth$ = SubLFiles.deflexical("*RESOLVE-PARSE-INTERPRETATION-MAX-DEPTH*", (SubLObject)rkf_text_processors.FIVE_INTEGER);
        rkf_text_processors.$resolve_parse_recursion_depth$ = SubLFiles.defparameter("*RESOLVE-PARSE-RECURSION-DEPTH*", (SubLObject)rkf_text_processors.ZERO_INTEGER);
        rkf_text_processors.$resolve_parse_recursion_show_warningsP$ = SubLFiles.defparameter("*RESOLVE-PARSE-RECURSION-SHOW-WARNINGS?*", (SubLObject)rkf_text_processors.NIL);
        rkf_text_processors.$dtp_parse_result$ = SubLFiles.defconstant("*DTP-PARSE-RESULT*", (SubLObject)rkf_text_processors.$sym7$PARSE_RESULT);
        rkf_text_processors.$rkf_textproc_print_parse_result_tersely$ = SubLFiles.defparameter("*RKF-TEXTPROC-PRINT-PARSE-RESULT-TERSELY*", (SubLObject)rkf_text_processors.T);
        rkf_text_processors.$rkf_uttrdr_allow_nltagsP$ = SubLFiles.defparameter("*RKF-UTTRDR-ALLOW-NLTAGS?*", (SubLObject)rkf_text_processors.T);
        rkf_text_processors.$rkf_uttrdr_full_spans_onlyP$ = SubLFiles.defparameter("*RKF-UTTRDR-FULL-SPANS-ONLY?*", (SubLObject)rkf_text_processors.NIL);
        rkf_text_processors.$rkf_term_reader_default_templates$ = SubLFiles.defconstant("*RKF-TERM-READER-DEFAULT-TEMPLATES*", (SubLObject)rkf_text_processors.$list57);
        rkf_text_processors.$rkf_term_reader_cycl_template_mappings$ = SubLFiles.deflexical("*RKF-TERM-READER-CYCL-TEMPLATE-MAPPINGS*", (SubLObject)rkf_text_processors.$list58);
        rkf_text_processors.$rkf_uttrdr_arg_type_to_template_categories$ = SubLFiles.deflexical("*RKF-UTTRDR-ARG-TYPE-TO-TEMPLATE-CATEGORIES*", (SubLObject)rkf_text_processors.NIL);
        rkf_text_processors.$pmg_ordering$ = SubLFiles.defparameter("*PMG-ORDERING*", (SubLObject)rkf_text_processors.NIL);
        rkf_text_processors.$rkf_terms_forager_lock$ = SubLFiles.deflexical("*RKF-TERMS-FORAGER-LOCK*", maybeDefault((SubLObject)rkf_text_processors.$sym67$_RKF_TERMS_FORAGER_LOCK_, rkf_text_processors.$rkf_terms_forager_lock$, ()->(Locks.make_lock((SubLObject)rkf_text_processors.$str68$Terms_Forager))));
        rkf_text_processors.$dtp_parse_module_definition$ = SubLFiles.defconstant("*DTP-PARSE-MODULE-DEFINITION*", (SubLObject)rkf_text_processors.$sym70$PARSE_MODULE_DEFINITION);
        rkf_text_processors.$rkf_uttrdr_default_cost$ = SubLFiles.deflexical("*RKF-UTTRDR-DEFAULT-COST*", (SubLObject)rkf_text_processors.TEN_INTEGER);
        rkf_text_processors.$rkf_uttrdr_default_expected_expansions$ = SubLFiles.deflexical("*RKF-UTTRDR-DEFAULT-EXPECTED-EXPANSIONS*", (SubLObject)rkf_text_processors.FIVE_INTEGER);
        rkf_text_processors.$dtp_parse_module_group$ = SubLFiles.defconstant("*DTP-PARSE-MODULE-GROUP*", (SubLObject)rkf_text_processors.$sym107$PARSE_MODULE_GROUP);
        rkf_text_processors.$rkf_uttrdr_known_parsers$ = SubLFiles.deflexical("*RKF-UTTRDR-KNOWN-PARSERS*", (SubLObject)(maybeDefault((SubLObject)rkf_text_processors.$sym128$_RKF_UTTRDR_KNOWN_PARSERS_, rkf_text_processors.$rkf_uttrdr_known_parsers$, rkf_text_processors.NIL)));
        rkf_text_processors.$rkf_uttrdr_resolvables$ = SubLFiles.deflexical("*RKF-UTTRDR-RESOLVABLES*", (SubLObject)rkf_text_processors.NIL);
        rkf_text_processors.$rkf_uttrdr_psp_return_mode$ = SubLFiles.defparameter("*RKF-UTTRDR-PSP-RETURN-MODE*", (SubLObject)rkf_text_processors.$kw129$BEST_ONLY);
        rkf_text_processors.$rkf_uttrdr_known_parsers_lock$ = SubLFiles.deflexical("*RKF-UTTRDR-KNOWN-PARSERS-LOCK*", Locks.make_lock((SubLObject)rkf_text_processors.$str131$Known_Parsers));
        rkf_text_processors.$rkf_uttrdr_use_vpp_in_itp$ = SubLFiles.defparameter("*RKF-UTTRDR-USE-VPP-IN-ITP*", (SubLObject)rkf_text_processors.T);
        rkf_text_processors.$rkf_uttrdr_marker$ = SubLFiles.deflexical("*RKF-UTTRDR-MARKER*", Symbols.gensym((SubLObject)rkf_text_processors.$str193$RKF_UTTRDR_MARKER));
        return (SubLObject)rkf_text_processors.NIL;
    }

    public static SubLObject setup_rkf_text_processors_file() {
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), rkf_text_processors.$dtp_parse_result$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_text_processors.$sym14$PARSE_RESULT_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)rkf_text_processors.$list15);
        Structures.def_csetf((SubLObject)rkf_text_processors.$sym16$PARSE_RESULT_ORIGINAL, (SubLObject)rkf_text_processors.$sym17$_CSETF_PARSE_RESULT_ORIGINAL);
        Structures.def_csetf((SubLObject)rkf_text_processors.$sym18$PARSE_RESULT_CONSTITUENTS, (SubLObject)rkf_text_processors.$sym19$_CSETF_PARSE_RESULT_CONSTITUENTS);
        Structures.def_csetf((SubLObject)rkf_text_processors.$sym20$PARSE_RESULT_ELIMINATED, (SubLObject)rkf_text_processors.$sym21$_CSETF_PARSE_RESULT_ELIMINATED);
        Structures.def_csetf((SubLObject)rkf_text_processors.$sym22$PARSE_RESULT_PROBLEMS, (SubLObject)rkf_text_processors.$sym23$_CSETF_PARSE_RESULT_PROBLEMS);
        Structures.def_csetf((SubLObject)rkf_text_processors.$sym24$PARSE_RESULT_SOLUTIONS, (SubLObject)rkf_text_processors.$sym25$_CSETF_PARSE_RESULT_SOLUTIONS);
        Equality.identity((SubLObject)rkf_text_processors.$sym7$PARSE_RESULT);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), rkf_text_processors.$dtp_parse_result$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_text_processors.$sym36$VISIT_DEFSTRUCT_OBJECT_PARSE_RESULT_METHOD));
        subl_macro_promotions.declare_defglobal((SubLObject)rkf_text_processors.$sym67$_RKF_TERMS_FORAGER_LOCK_);
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), rkf_text_processors.$dtp_parse_module_definition$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_text_processors.$sym77$PARSE_MODULE_DEFINITION_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)rkf_text_processors.$list78);
        Structures.def_csetf((SubLObject)rkf_text_processors.$sym79$PMD_NAME, (SubLObject)rkf_text_processors.$sym80$_CSETF_PMD_NAME);
        Structures.def_csetf((SubLObject)rkf_text_processors.$sym81$PMD_CATEGORY, (SubLObject)rkf_text_processors.$sym82$_CSETF_PMD_CATEGORY);
        Structures.def_csetf((SubLObject)rkf_text_processors.$sym83$PMD_QUALITY, (SubLObject)rkf_text_processors.$sym84$_CSETF_PMD_QUALITY);
        Structures.def_csetf((SubLObject)rkf_text_processors.$sym85$PMD_ENTRY_POINT, (SubLObject)rkf_text_processors.$sym86$_CSETF_PMD_ENTRY_POINT);
        Structures.def_csetf((SubLObject)rkf_text_processors.$sym87$PMD_COST, (SubLObject)rkf_text_processors.$sym88$_CSETF_PMD_COST);
        Structures.def_csetf((SubLObject)rkf_text_processors.$sym89$PMD_EXPECTED_EXPANSIONS, (SubLObject)rkf_text_processors.$sym90$_CSETF_PMD_EXPECTED_EXPANSIONS);
        Structures.def_csetf((SubLObject)rkf_text_processors.$sym91$PMD_SUPPLANTS, (SubLObject)rkf_text_processors.$sym92$_CSETF_PMD_SUPPLANTS);
        Equality.identity((SubLObject)rkf_text_processors.$sym70$PARSE_MODULE_DEFINITION);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), rkf_text_processors.$dtp_parse_module_definition$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_text_processors.$sym100$VISIT_DEFSTRUCT_OBJECT_PARSE_MODULE_DEFINITION_METHOD));
        Structures.register_method(print_high.$print_object_method_table$.getGlobalValue(), rkf_text_processors.$dtp_parse_module_group$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_text_processors.$sym114$PARSE_MODULE_GROUP_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim((SubLObject)rkf_text_processors.$list115);
        Structures.def_csetf((SubLObject)rkf_text_processors.$sym116$PMG_CATEGORY, (SubLObject)rkf_text_processors.$sym117$_CSETF_PMG_CATEGORY);
        Structures.def_csetf((SubLObject)rkf_text_processors.$sym118$PMG_TOOLS, (SubLObject)rkf_text_processors.$sym119$_CSETF_PMG_TOOLS);
        Equality.identity((SubLObject)rkf_text_processors.$sym107$PARSE_MODULE_GROUP);
        Structures.register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), rkf_text_processors.$dtp_parse_module_group$.getGlobalValue(), Symbols.symbol_function((SubLObject)rkf_text_processors.$sym122$VISIT_DEFSTRUCT_OBJECT_PARSE_MODULE_GROUP_METHOD));
        subl_macro_promotions.declare_defglobal((SubLObject)rkf_text_processors.$sym128$_RKF_UTTRDR_KNOWN_PARSERS_);
        utilities_macros.register_html_state_variable((SubLObject)rkf_text_processors.$sym130$_RKF_UTTRDR_PSP_RETURN_MODE_);
        rkf_uttrdr_deregister_all_parsers();
        SubLObject name = (SubLObject)rkf_text_processors.NIL;
        SubLObject category = (SubLObject)rkf_text_processors.NIL;
        SubLObject entry_point = (SubLObject)rkf_text_processors.NIL;
        SubLObject docstring = (SubLObject)rkf_text_processors.NIL;
        SubLObject cost = (SubLObject)rkf_text_processors.NIL;
        SubLObject quality = (SubLObject)rkf_text_processors.NIL;
        SubLObject expected_expansions = (SubLObject)rkf_text_processors.NIL;
        SubLObject supplants = (SubLObject)rkf_text_processors.NIL;
        SubLObject cdolist_list_var = (SubLObject)rkf_text_processors.$list162;
        SubLObject curr = (SubLObject)rkf_text_processors.NIL;
        curr = cdolist_list_var.first();
        while (rkf_text_processors.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = curr;
            SubLObject key = (SubLObject)rkf_text_processors.NIL;
            SubLObject value = (SubLObject)rkf_text_processors.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list161);
            key = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list161);
            value = current.first();
            current = current.rest();
            if (rkf_text_processors.NIL == current) {
                final SubLObject pcase_var = key;
                if (pcase_var.eql((SubLObject)rkf_text_processors.$kw93$NAME)) {
                    name = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw94$CATEGORY)) {
                    category = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw95$ENTRY_POINT)) {
                    entry_point = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw155$DOC)) {
                    docstring = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw61$QUALITY)) {
                    quality = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw96$COST)) {
                    cost = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw97$EXPECTED_EXPANSIONS)) {
                    expected_expansions = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw98$SUPPLANTS)) {
                    supplants = value;
                }
                else {
                    Errors.error((SubLObject)rkf_text_processors.$str158$Invalid_key__S_in_parser_module_r, key);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_text_processors.$list161);
            }
            cdolist_list_var = cdolist_list_var.rest();
            curr = cdolist_list_var.first();
        }
        SubLObject pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
        rkf_uttrdr_register_parser(category, pmd);
        name = (SubLObject)rkf_text_processors.NIL;
        category = (SubLObject)rkf_text_processors.NIL;
        entry_point = (SubLObject)rkf_text_processors.NIL;
        docstring = (SubLObject)rkf_text_processors.NIL;
        cost = (SubLObject)rkf_text_processors.NIL;
        quality = (SubLObject)rkf_text_processors.NIL;
        expected_expansions = (SubLObject)rkf_text_processors.NIL;
        supplants = (SubLObject)rkf_text_processors.NIL;
        cdolist_list_var = (SubLObject)rkf_text_processors.$list163;
        curr = (SubLObject)rkf_text_processors.NIL;
        curr = cdolist_list_var.first();
        while (rkf_text_processors.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = curr;
            SubLObject key = (SubLObject)rkf_text_processors.NIL;
            SubLObject value = (SubLObject)rkf_text_processors.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list161);
            key = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list161);
            value = current.first();
            current = current.rest();
            if (rkf_text_processors.NIL == current) {
                final SubLObject pcase_var = key;
                if (pcase_var.eql((SubLObject)rkf_text_processors.$kw93$NAME)) {
                    name = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw94$CATEGORY)) {
                    category = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw95$ENTRY_POINT)) {
                    entry_point = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw155$DOC)) {
                    docstring = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw61$QUALITY)) {
                    quality = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw96$COST)) {
                    cost = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw97$EXPECTED_EXPANSIONS)) {
                    expected_expansions = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw98$SUPPLANTS)) {
                    supplants = value;
                }
                else {
                    Errors.error((SubLObject)rkf_text_processors.$str158$Invalid_key__S_in_parser_module_r, key);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_text_processors.$list161);
            }
            cdolist_list_var = cdolist_list_var.rest();
            curr = cdolist_list_var.first();
        }
        pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
        rkf_uttrdr_register_parser(category, pmd);
        name = (SubLObject)rkf_text_processors.NIL;
        category = (SubLObject)rkf_text_processors.NIL;
        entry_point = (SubLObject)rkf_text_processors.NIL;
        docstring = (SubLObject)rkf_text_processors.NIL;
        cost = (SubLObject)rkf_text_processors.NIL;
        quality = (SubLObject)rkf_text_processors.NIL;
        expected_expansions = (SubLObject)rkf_text_processors.NIL;
        supplants = (SubLObject)rkf_text_processors.NIL;
        cdolist_list_var = (SubLObject)rkf_text_processors.$list164;
        curr = (SubLObject)rkf_text_processors.NIL;
        curr = cdolist_list_var.first();
        while (rkf_text_processors.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = curr;
            SubLObject key = (SubLObject)rkf_text_processors.NIL;
            SubLObject value = (SubLObject)rkf_text_processors.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list161);
            key = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list161);
            value = current.first();
            current = current.rest();
            if (rkf_text_processors.NIL == current) {
                final SubLObject pcase_var = key;
                if (pcase_var.eql((SubLObject)rkf_text_processors.$kw93$NAME)) {
                    name = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw94$CATEGORY)) {
                    category = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw95$ENTRY_POINT)) {
                    entry_point = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw155$DOC)) {
                    docstring = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw61$QUALITY)) {
                    quality = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw96$COST)) {
                    cost = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw97$EXPECTED_EXPANSIONS)) {
                    expected_expansions = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw98$SUPPLANTS)) {
                    supplants = value;
                }
                else {
                    Errors.error((SubLObject)rkf_text_processors.$str158$Invalid_key__S_in_parser_module_r, key);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_text_processors.$list161);
            }
            cdolist_list_var = cdolist_list_var.rest();
            curr = cdolist_list_var.first();
        }
        pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
        rkf_uttrdr_register_parser(category, pmd);
        name = (SubLObject)rkf_text_processors.NIL;
        category = (SubLObject)rkf_text_processors.NIL;
        entry_point = (SubLObject)rkf_text_processors.NIL;
        docstring = (SubLObject)rkf_text_processors.NIL;
        cost = (SubLObject)rkf_text_processors.NIL;
        quality = (SubLObject)rkf_text_processors.NIL;
        expected_expansions = (SubLObject)rkf_text_processors.NIL;
        supplants = (SubLObject)rkf_text_processors.NIL;
        cdolist_list_var = (SubLObject)rkf_text_processors.$list165;
        curr = (SubLObject)rkf_text_processors.NIL;
        curr = cdolist_list_var.first();
        while (rkf_text_processors.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = curr;
            SubLObject key = (SubLObject)rkf_text_processors.NIL;
            SubLObject value = (SubLObject)rkf_text_processors.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list161);
            key = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list161);
            value = current.first();
            current = current.rest();
            if (rkf_text_processors.NIL == current) {
                final SubLObject pcase_var = key;
                if (pcase_var.eql((SubLObject)rkf_text_processors.$kw93$NAME)) {
                    name = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw94$CATEGORY)) {
                    category = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw95$ENTRY_POINT)) {
                    entry_point = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw155$DOC)) {
                    docstring = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw61$QUALITY)) {
                    quality = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw96$COST)) {
                    cost = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw97$EXPECTED_EXPANSIONS)) {
                    expected_expansions = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw98$SUPPLANTS)) {
                    supplants = value;
                }
                else {
                    Errors.error((SubLObject)rkf_text_processors.$str158$Invalid_key__S_in_parser_module_r, key);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_text_processors.$list161);
            }
            cdolist_list_var = cdolist_list_var.rest();
            curr = cdolist_list_var.first();
        }
        pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
        rkf_uttrdr_register_parser(category, pmd);
        name = (SubLObject)rkf_text_processors.NIL;
        category = (SubLObject)rkf_text_processors.NIL;
        entry_point = (SubLObject)rkf_text_processors.NIL;
        docstring = (SubLObject)rkf_text_processors.NIL;
        cost = (SubLObject)rkf_text_processors.NIL;
        quality = (SubLObject)rkf_text_processors.NIL;
        expected_expansions = (SubLObject)rkf_text_processors.NIL;
        supplants = (SubLObject)rkf_text_processors.NIL;
        cdolist_list_var = (SubLObject)rkf_text_processors.$list166;
        curr = (SubLObject)rkf_text_processors.NIL;
        curr = cdolist_list_var.first();
        while (rkf_text_processors.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = curr;
            SubLObject key = (SubLObject)rkf_text_processors.NIL;
            SubLObject value = (SubLObject)rkf_text_processors.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list161);
            key = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list161);
            value = current.first();
            current = current.rest();
            if (rkf_text_processors.NIL == current) {
                final SubLObject pcase_var = key;
                if (pcase_var.eql((SubLObject)rkf_text_processors.$kw93$NAME)) {
                    name = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw94$CATEGORY)) {
                    category = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw95$ENTRY_POINT)) {
                    entry_point = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw155$DOC)) {
                    docstring = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw61$QUALITY)) {
                    quality = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw96$COST)) {
                    cost = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw97$EXPECTED_EXPANSIONS)) {
                    expected_expansions = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw98$SUPPLANTS)) {
                    supplants = value;
                }
                else {
                    Errors.error((SubLObject)rkf_text_processors.$str158$Invalid_key__S_in_parser_module_r, key);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_text_processors.$list161);
            }
            cdolist_list_var = cdolist_list_var.rest();
            curr = cdolist_list_var.first();
        }
        pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
        rkf_uttrdr_register_parser(category, pmd);
        name = (SubLObject)rkf_text_processors.NIL;
        category = (SubLObject)rkf_text_processors.NIL;
        entry_point = (SubLObject)rkf_text_processors.NIL;
        docstring = (SubLObject)rkf_text_processors.NIL;
        cost = (SubLObject)rkf_text_processors.NIL;
        quality = (SubLObject)rkf_text_processors.NIL;
        expected_expansions = (SubLObject)rkf_text_processors.NIL;
        supplants = (SubLObject)rkf_text_processors.NIL;
        cdolist_list_var = (SubLObject)rkf_text_processors.$list167;
        curr = (SubLObject)rkf_text_processors.NIL;
        curr = cdolist_list_var.first();
        while (rkf_text_processors.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = curr;
            SubLObject key = (SubLObject)rkf_text_processors.NIL;
            SubLObject value = (SubLObject)rkf_text_processors.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list161);
            key = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list161);
            value = current.first();
            current = current.rest();
            if (rkf_text_processors.NIL == current) {
                final SubLObject pcase_var = key;
                if (pcase_var.eql((SubLObject)rkf_text_processors.$kw93$NAME)) {
                    name = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw94$CATEGORY)) {
                    category = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw95$ENTRY_POINT)) {
                    entry_point = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw155$DOC)) {
                    docstring = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw61$QUALITY)) {
                    quality = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw96$COST)) {
                    cost = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw97$EXPECTED_EXPANSIONS)) {
                    expected_expansions = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw98$SUPPLANTS)) {
                    supplants = value;
                }
                else {
                    Errors.error((SubLObject)rkf_text_processors.$str158$Invalid_key__S_in_parser_module_r, key);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_text_processors.$list161);
            }
            cdolist_list_var = cdolist_list_var.rest();
            curr = cdolist_list_var.first();
        }
        pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
        rkf_uttrdr_register_parser(category, pmd);
        name = (SubLObject)rkf_text_processors.NIL;
        category = (SubLObject)rkf_text_processors.NIL;
        entry_point = (SubLObject)rkf_text_processors.NIL;
        docstring = (SubLObject)rkf_text_processors.NIL;
        cost = (SubLObject)rkf_text_processors.NIL;
        quality = (SubLObject)rkf_text_processors.NIL;
        expected_expansions = (SubLObject)rkf_text_processors.NIL;
        supplants = (SubLObject)rkf_text_processors.NIL;
        cdolist_list_var = (SubLObject)rkf_text_processors.$list168;
        curr = (SubLObject)rkf_text_processors.NIL;
        curr = cdolist_list_var.first();
        while (rkf_text_processors.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = curr;
            SubLObject key = (SubLObject)rkf_text_processors.NIL;
            SubLObject value = (SubLObject)rkf_text_processors.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list161);
            key = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list161);
            value = current.first();
            current = current.rest();
            if (rkf_text_processors.NIL == current) {
                final SubLObject pcase_var = key;
                if (pcase_var.eql((SubLObject)rkf_text_processors.$kw93$NAME)) {
                    name = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw94$CATEGORY)) {
                    category = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw95$ENTRY_POINT)) {
                    entry_point = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw155$DOC)) {
                    docstring = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw61$QUALITY)) {
                    quality = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw96$COST)) {
                    cost = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw97$EXPECTED_EXPANSIONS)) {
                    expected_expansions = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw98$SUPPLANTS)) {
                    supplants = value;
                }
                else {
                    Errors.error((SubLObject)rkf_text_processors.$str158$Invalid_key__S_in_parser_module_r, key);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_text_processors.$list161);
            }
            cdolist_list_var = cdolist_list_var.rest();
            curr = cdolist_list_var.first();
        }
        pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
        rkf_uttrdr_register_parser(category, pmd);
        name = (SubLObject)rkf_text_processors.NIL;
        category = (SubLObject)rkf_text_processors.NIL;
        entry_point = (SubLObject)rkf_text_processors.NIL;
        docstring = (SubLObject)rkf_text_processors.NIL;
        cost = (SubLObject)rkf_text_processors.NIL;
        quality = (SubLObject)rkf_text_processors.NIL;
        expected_expansions = (SubLObject)rkf_text_processors.NIL;
        supplants = (SubLObject)rkf_text_processors.NIL;
        cdolist_list_var = (SubLObject)rkf_text_processors.$list169;
        curr = (SubLObject)rkf_text_processors.NIL;
        curr = cdolist_list_var.first();
        while (rkf_text_processors.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = curr;
            SubLObject key = (SubLObject)rkf_text_processors.NIL;
            SubLObject value = (SubLObject)rkf_text_processors.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list161);
            key = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list161);
            value = current.first();
            current = current.rest();
            if (rkf_text_processors.NIL == current) {
                final SubLObject pcase_var = key;
                if (pcase_var.eql((SubLObject)rkf_text_processors.$kw93$NAME)) {
                    name = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw94$CATEGORY)) {
                    category = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw95$ENTRY_POINT)) {
                    entry_point = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw155$DOC)) {
                    docstring = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw61$QUALITY)) {
                    quality = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw96$COST)) {
                    cost = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw97$EXPECTED_EXPANSIONS)) {
                    expected_expansions = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw98$SUPPLANTS)) {
                    supplants = value;
                }
                else {
                    Errors.error((SubLObject)rkf_text_processors.$str158$Invalid_key__S_in_parser_module_r, key);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_text_processors.$list161);
            }
            cdolist_list_var = cdolist_list_var.rest();
            curr = cdolist_list_var.first();
        }
        pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
        rkf_uttrdr_register_parser(category, pmd);
        name = (SubLObject)rkf_text_processors.NIL;
        category = (SubLObject)rkf_text_processors.NIL;
        entry_point = (SubLObject)rkf_text_processors.NIL;
        docstring = (SubLObject)rkf_text_processors.NIL;
        cost = (SubLObject)rkf_text_processors.NIL;
        quality = (SubLObject)rkf_text_processors.NIL;
        expected_expansions = (SubLObject)rkf_text_processors.NIL;
        supplants = (SubLObject)rkf_text_processors.NIL;
        cdolist_list_var = (SubLObject)rkf_text_processors.$list170;
        curr = (SubLObject)rkf_text_processors.NIL;
        curr = cdolist_list_var.first();
        while (rkf_text_processors.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = curr;
            SubLObject key = (SubLObject)rkf_text_processors.NIL;
            SubLObject value = (SubLObject)rkf_text_processors.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list161);
            key = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list161);
            value = current.first();
            current = current.rest();
            if (rkf_text_processors.NIL == current) {
                final SubLObject pcase_var = key;
                if (pcase_var.eql((SubLObject)rkf_text_processors.$kw93$NAME)) {
                    name = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw94$CATEGORY)) {
                    category = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw95$ENTRY_POINT)) {
                    entry_point = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw155$DOC)) {
                    docstring = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw61$QUALITY)) {
                    quality = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw96$COST)) {
                    cost = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw97$EXPECTED_EXPANSIONS)) {
                    expected_expansions = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw98$SUPPLANTS)) {
                    supplants = value;
                }
                else {
                    Errors.error((SubLObject)rkf_text_processors.$str158$Invalid_key__S_in_parser_module_r, key);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_text_processors.$list161);
            }
            cdolist_list_var = cdolist_list_var.rest();
            curr = cdolist_list_var.first();
        }
        pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
        rkf_uttrdr_register_parser(category, pmd);
        name = (SubLObject)rkf_text_processors.NIL;
        category = (SubLObject)rkf_text_processors.NIL;
        entry_point = (SubLObject)rkf_text_processors.NIL;
        docstring = (SubLObject)rkf_text_processors.NIL;
        cost = (SubLObject)rkf_text_processors.NIL;
        quality = (SubLObject)rkf_text_processors.NIL;
        expected_expansions = (SubLObject)rkf_text_processors.NIL;
        supplants = (SubLObject)rkf_text_processors.NIL;
        cdolist_list_var = (SubLObject)rkf_text_processors.$list171;
        curr = (SubLObject)rkf_text_processors.NIL;
        curr = cdolist_list_var.first();
        while (rkf_text_processors.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = curr;
            SubLObject key = (SubLObject)rkf_text_processors.NIL;
            SubLObject value = (SubLObject)rkf_text_processors.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list161);
            key = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list161);
            value = current.first();
            current = current.rest();
            if (rkf_text_processors.NIL == current) {
                final SubLObject pcase_var = key;
                if (pcase_var.eql((SubLObject)rkf_text_processors.$kw93$NAME)) {
                    name = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw94$CATEGORY)) {
                    category = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw95$ENTRY_POINT)) {
                    entry_point = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw155$DOC)) {
                    docstring = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw61$QUALITY)) {
                    quality = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw96$COST)) {
                    cost = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw97$EXPECTED_EXPANSIONS)) {
                    expected_expansions = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw98$SUPPLANTS)) {
                    supplants = value;
                }
                else {
                    Errors.error((SubLObject)rkf_text_processors.$str158$Invalid_key__S_in_parser_module_r, key);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_text_processors.$list161);
            }
            cdolist_list_var = cdolist_list_var.rest();
            curr = cdolist_list_var.first();
        }
        pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
        rkf_uttrdr_register_parser(category, pmd);
        name = (SubLObject)rkf_text_processors.NIL;
        category = (SubLObject)rkf_text_processors.NIL;
        entry_point = (SubLObject)rkf_text_processors.NIL;
        docstring = (SubLObject)rkf_text_processors.NIL;
        cost = (SubLObject)rkf_text_processors.NIL;
        quality = (SubLObject)rkf_text_processors.NIL;
        expected_expansions = (SubLObject)rkf_text_processors.NIL;
        supplants = (SubLObject)rkf_text_processors.NIL;
        cdolist_list_var = (SubLObject)rkf_text_processors.$list172;
        curr = (SubLObject)rkf_text_processors.NIL;
        curr = cdolist_list_var.first();
        while (rkf_text_processors.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = curr;
            SubLObject key = (SubLObject)rkf_text_processors.NIL;
            SubLObject value = (SubLObject)rkf_text_processors.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list161);
            key = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list161);
            value = current.first();
            current = current.rest();
            if (rkf_text_processors.NIL == current) {
                final SubLObject pcase_var = key;
                if (pcase_var.eql((SubLObject)rkf_text_processors.$kw93$NAME)) {
                    name = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw94$CATEGORY)) {
                    category = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw95$ENTRY_POINT)) {
                    entry_point = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw155$DOC)) {
                    docstring = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw61$QUALITY)) {
                    quality = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw96$COST)) {
                    cost = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw97$EXPECTED_EXPANSIONS)) {
                    expected_expansions = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw98$SUPPLANTS)) {
                    supplants = value;
                }
                else {
                    Errors.error((SubLObject)rkf_text_processors.$str158$Invalid_key__S_in_parser_module_r, key);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_text_processors.$list161);
            }
            cdolist_list_var = cdolist_list_var.rest();
            curr = cdolist_list_var.first();
        }
        pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
        rkf_uttrdr_register_parser(category, pmd);
        name = (SubLObject)rkf_text_processors.NIL;
        category = (SubLObject)rkf_text_processors.NIL;
        entry_point = (SubLObject)rkf_text_processors.NIL;
        docstring = (SubLObject)rkf_text_processors.NIL;
        cost = (SubLObject)rkf_text_processors.NIL;
        quality = (SubLObject)rkf_text_processors.NIL;
        expected_expansions = (SubLObject)rkf_text_processors.NIL;
        supplants = (SubLObject)rkf_text_processors.NIL;
        cdolist_list_var = (SubLObject)rkf_text_processors.$list173;
        curr = (SubLObject)rkf_text_processors.NIL;
        curr = cdolist_list_var.first();
        while (rkf_text_processors.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = curr;
            SubLObject key = (SubLObject)rkf_text_processors.NIL;
            SubLObject value = (SubLObject)rkf_text_processors.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list161);
            key = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list161);
            value = current.first();
            current = current.rest();
            if (rkf_text_processors.NIL == current) {
                final SubLObject pcase_var = key;
                if (pcase_var.eql((SubLObject)rkf_text_processors.$kw93$NAME)) {
                    name = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw94$CATEGORY)) {
                    category = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw95$ENTRY_POINT)) {
                    entry_point = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw155$DOC)) {
                    docstring = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw61$QUALITY)) {
                    quality = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw96$COST)) {
                    cost = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw97$EXPECTED_EXPANSIONS)) {
                    expected_expansions = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw98$SUPPLANTS)) {
                    supplants = value;
                }
                else {
                    Errors.error((SubLObject)rkf_text_processors.$str158$Invalid_key__S_in_parser_module_r, key);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_text_processors.$list161);
            }
            cdolist_list_var = cdolist_list_var.rest();
            curr = cdolist_list_var.first();
        }
        pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
        rkf_uttrdr_register_parser(category, pmd);
        name = (SubLObject)rkf_text_processors.NIL;
        category = (SubLObject)rkf_text_processors.NIL;
        entry_point = (SubLObject)rkf_text_processors.NIL;
        docstring = (SubLObject)rkf_text_processors.NIL;
        cost = (SubLObject)rkf_text_processors.NIL;
        quality = (SubLObject)rkf_text_processors.NIL;
        expected_expansions = (SubLObject)rkf_text_processors.NIL;
        supplants = (SubLObject)rkf_text_processors.NIL;
        cdolist_list_var = (SubLObject)rkf_text_processors.$list174;
        curr = (SubLObject)rkf_text_processors.NIL;
        curr = cdolist_list_var.first();
        while (rkf_text_processors.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = curr;
            SubLObject key = (SubLObject)rkf_text_processors.NIL;
            SubLObject value = (SubLObject)rkf_text_processors.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list161);
            key = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list161);
            value = current.first();
            current = current.rest();
            if (rkf_text_processors.NIL == current) {
                final SubLObject pcase_var = key;
                if (pcase_var.eql((SubLObject)rkf_text_processors.$kw93$NAME)) {
                    name = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw94$CATEGORY)) {
                    category = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw95$ENTRY_POINT)) {
                    entry_point = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw155$DOC)) {
                    docstring = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw61$QUALITY)) {
                    quality = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw96$COST)) {
                    cost = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw97$EXPECTED_EXPANSIONS)) {
                    expected_expansions = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw98$SUPPLANTS)) {
                    supplants = value;
                }
                else {
                    Errors.error((SubLObject)rkf_text_processors.$str158$Invalid_key__S_in_parser_module_r, key);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_text_processors.$list161);
            }
            cdolist_list_var = cdolist_list_var.rest();
            curr = cdolist_list_var.first();
        }
        pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
        rkf_uttrdr_register_parser(category, pmd);
        name = (SubLObject)rkf_text_processors.NIL;
        category = (SubLObject)rkf_text_processors.NIL;
        entry_point = (SubLObject)rkf_text_processors.NIL;
        docstring = (SubLObject)rkf_text_processors.NIL;
        cost = (SubLObject)rkf_text_processors.NIL;
        quality = (SubLObject)rkf_text_processors.NIL;
        expected_expansions = (SubLObject)rkf_text_processors.NIL;
        supplants = (SubLObject)rkf_text_processors.NIL;
        cdolist_list_var = (SubLObject)rkf_text_processors.$list175;
        curr = (SubLObject)rkf_text_processors.NIL;
        curr = cdolist_list_var.first();
        while (rkf_text_processors.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = curr;
            SubLObject key = (SubLObject)rkf_text_processors.NIL;
            SubLObject value = (SubLObject)rkf_text_processors.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list161);
            key = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list161);
            value = current.first();
            current = current.rest();
            if (rkf_text_processors.NIL == current) {
                final SubLObject pcase_var = key;
                if (pcase_var.eql((SubLObject)rkf_text_processors.$kw93$NAME)) {
                    name = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw94$CATEGORY)) {
                    category = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw95$ENTRY_POINT)) {
                    entry_point = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw155$DOC)) {
                    docstring = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw61$QUALITY)) {
                    quality = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw96$COST)) {
                    cost = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw97$EXPECTED_EXPANSIONS)) {
                    expected_expansions = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw98$SUPPLANTS)) {
                    supplants = value;
                }
                else {
                    Errors.error((SubLObject)rkf_text_processors.$str158$Invalid_key__S_in_parser_module_r, key);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_text_processors.$list161);
            }
            cdolist_list_var = cdolist_list_var.rest();
            curr = cdolist_list_var.first();
        }
        pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
        rkf_uttrdr_register_parser(category, pmd);
        name = (SubLObject)rkf_text_processors.NIL;
        category = (SubLObject)rkf_text_processors.NIL;
        entry_point = (SubLObject)rkf_text_processors.NIL;
        docstring = (SubLObject)rkf_text_processors.NIL;
        cost = (SubLObject)rkf_text_processors.NIL;
        quality = (SubLObject)rkf_text_processors.NIL;
        expected_expansions = (SubLObject)rkf_text_processors.NIL;
        supplants = (SubLObject)rkf_text_processors.NIL;
        cdolist_list_var = (SubLObject)rkf_text_processors.$list176;
        curr = (SubLObject)rkf_text_processors.NIL;
        curr = cdolist_list_var.first();
        while (rkf_text_processors.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = curr;
            SubLObject key = (SubLObject)rkf_text_processors.NIL;
            SubLObject value = (SubLObject)rkf_text_processors.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list161);
            key = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list161);
            value = current.first();
            current = current.rest();
            if (rkf_text_processors.NIL == current) {
                final SubLObject pcase_var = key;
                if (pcase_var.eql((SubLObject)rkf_text_processors.$kw93$NAME)) {
                    name = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw94$CATEGORY)) {
                    category = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw95$ENTRY_POINT)) {
                    entry_point = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw155$DOC)) {
                    docstring = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw61$QUALITY)) {
                    quality = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw96$COST)) {
                    cost = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw97$EXPECTED_EXPANSIONS)) {
                    expected_expansions = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw98$SUPPLANTS)) {
                    supplants = value;
                }
                else {
                    Errors.error((SubLObject)rkf_text_processors.$str158$Invalid_key__S_in_parser_module_r, key);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_text_processors.$list161);
            }
            cdolist_list_var = cdolist_list_var.rest();
            curr = cdolist_list_var.first();
        }
        pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
        rkf_uttrdr_register_parser(category, pmd);
        name = (SubLObject)rkf_text_processors.NIL;
        category = (SubLObject)rkf_text_processors.NIL;
        entry_point = (SubLObject)rkf_text_processors.NIL;
        docstring = (SubLObject)rkf_text_processors.NIL;
        cost = (SubLObject)rkf_text_processors.NIL;
        quality = (SubLObject)rkf_text_processors.NIL;
        expected_expansions = (SubLObject)rkf_text_processors.NIL;
        supplants = (SubLObject)rkf_text_processors.NIL;
        cdolist_list_var = (SubLObject)rkf_text_processors.$list177;
        curr = (SubLObject)rkf_text_processors.NIL;
        curr = cdolist_list_var.first();
        while (rkf_text_processors.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = curr;
            SubLObject key = (SubLObject)rkf_text_processors.NIL;
            SubLObject value = (SubLObject)rkf_text_processors.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list161);
            key = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list161);
            value = current.first();
            current = current.rest();
            if (rkf_text_processors.NIL == current) {
                final SubLObject pcase_var = key;
                if (pcase_var.eql((SubLObject)rkf_text_processors.$kw93$NAME)) {
                    name = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw94$CATEGORY)) {
                    category = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw95$ENTRY_POINT)) {
                    entry_point = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw155$DOC)) {
                    docstring = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw61$QUALITY)) {
                    quality = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw96$COST)) {
                    cost = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw97$EXPECTED_EXPANSIONS)) {
                    expected_expansions = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw98$SUPPLANTS)) {
                    supplants = value;
                }
                else {
                    Errors.error((SubLObject)rkf_text_processors.$str158$Invalid_key__S_in_parser_module_r, key);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_text_processors.$list161);
            }
            cdolist_list_var = cdolist_list_var.rest();
            curr = cdolist_list_var.first();
        }
        pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
        rkf_uttrdr_register_parser(category, pmd);
        name = (SubLObject)rkf_text_processors.NIL;
        category = (SubLObject)rkf_text_processors.NIL;
        entry_point = (SubLObject)rkf_text_processors.NIL;
        docstring = (SubLObject)rkf_text_processors.NIL;
        cost = (SubLObject)rkf_text_processors.NIL;
        quality = (SubLObject)rkf_text_processors.NIL;
        expected_expansions = (SubLObject)rkf_text_processors.NIL;
        supplants = (SubLObject)rkf_text_processors.NIL;
        cdolist_list_var = (SubLObject)rkf_text_processors.$list178;
        curr = (SubLObject)rkf_text_processors.NIL;
        curr = cdolist_list_var.first();
        while (rkf_text_processors.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = curr;
            SubLObject key = (SubLObject)rkf_text_processors.NIL;
            SubLObject value = (SubLObject)rkf_text_processors.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list161);
            key = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list161);
            value = current.first();
            current = current.rest();
            if (rkf_text_processors.NIL == current) {
                final SubLObject pcase_var = key;
                if (pcase_var.eql((SubLObject)rkf_text_processors.$kw93$NAME)) {
                    name = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw94$CATEGORY)) {
                    category = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw95$ENTRY_POINT)) {
                    entry_point = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw155$DOC)) {
                    docstring = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw61$QUALITY)) {
                    quality = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw96$COST)) {
                    cost = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw97$EXPECTED_EXPANSIONS)) {
                    expected_expansions = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw98$SUPPLANTS)) {
                    supplants = value;
                }
                else {
                    Errors.error((SubLObject)rkf_text_processors.$str158$Invalid_key__S_in_parser_module_r, key);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_text_processors.$list161);
            }
            cdolist_list_var = cdolist_list_var.rest();
            curr = cdolist_list_var.first();
        }
        pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
        rkf_uttrdr_register_parser(category, pmd);
        name = (SubLObject)rkf_text_processors.NIL;
        category = (SubLObject)rkf_text_processors.NIL;
        entry_point = (SubLObject)rkf_text_processors.NIL;
        docstring = (SubLObject)rkf_text_processors.NIL;
        cost = (SubLObject)rkf_text_processors.NIL;
        quality = (SubLObject)rkf_text_processors.NIL;
        expected_expansions = (SubLObject)rkf_text_processors.NIL;
        supplants = (SubLObject)rkf_text_processors.NIL;
        cdolist_list_var = (SubLObject)rkf_text_processors.$list179;
        curr = (SubLObject)rkf_text_processors.NIL;
        curr = cdolist_list_var.first();
        while (rkf_text_processors.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = curr;
            SubLObject key = (SubLObject)rkf_text_processors.NIL;
            SubLObject value = (SubLObject)rkf_text_processors.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list161);
            key = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list161);
            value = current.first();
            current = current.rest();
            if (rkf_text_processors.NIL == current) {
                final SubLObject pcase_var = key;
                if (pcase_var.eql((SubLObject)rkf_text_processors.$kw93$NAME)) {
                    name = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw94$CATEGORY)) {
                    category = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw95$ENTRY_POINT)) {
                    entry_point = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw155$DOC)) {
                    docstring = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw61$QUALITY)) {
                    quality = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw96$COST)) {
                    cost = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw97$EXPECTED_EXPANSIONS)) {
                    expected_expansions = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw98$SUPPLANTS)) {
                    supplants = value;
                }
                else {
                    Errors.error((SubLObject)rkf_text_processors.$str158$Invalid_key__S_in_parser_module_r, key);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_text_processors.$list161);
            }
            cdolist_list_var = cdolist_list_var.rest();
            curr = cdolist_list_var.first();
        }
        pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
        rkf_uttrdr_register_parser(category, pmd);
        name = (SubLObject)rkf_text_processors.NIL;
        category = (SubLObject)rkf_text_processors.NIL;
        entry_point = (SubLObject)rkf_text_processors.NIL;
        docstring = (SubLObject)rkf_text_processors.NIL;
        cost = (SubLObject)rkf_text_processors.NIL;
        quality = (SubLObject)rkf_text_processors.NIL;
        expected_expansions = (SubLObject)rkf_text_processors.NIL;
        supplants = (SubLObject)rkf_text_processors.NIL;
        cdolist_list_var = (SubLObject)rkf_text_processors.$list180;
        curr = (SubLObject)rkf_text_processors.NIL;
        curr = cdolist_list_var.first();
        while (rkf_text_processors.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = curr;
            SubLObject key = (SubLObject)rkf_text_processors.NIL;
            SubLObject value = (SubLObject)rkf_text_processors.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list161);
            key = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list161);
            value = current.first();
            current = current.rest();
            if (rkf_text_processors.NIL == current) {
                final SubLObject pcase_var = key;
                if (pcase_var.eql((SubLObject)rkf_text_processors.$kw93$NAME)) {
                    name = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw94$CATEGORY)) {
                    category = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw95$ENTRY_POINT)) {
                    entry_point = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw155$DOC)) {
                    docstring = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw61$QUALITY)) {
                    quality = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw96$COST)) {
                    cost = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw97$EXPECTED_EXPANSIONS)) {
                    expected_expansions = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw98$SUPPLANTS)) {
                    supplants = value;
                }
                else {
                    Errors.error((SubLObject)rkf_text_processors.$str158$Invalid_key__S_in_parser_module_r, key);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_text_processors.$list161);
            }
            cdolist_list_var = cdolist_list_var.rest();
            curr = cdolist_list_var.first();
        }
        pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
        rkf_uttrdr_register_parser(category, pmd);
        name = (SubLObject)rkf_text_processors.NIL;
        category = (SubLObject)rkf_text_processors.NIL;
        entry_point = (SubLObject)rkf_text_processors.NIL;
        docstring = (SubLObject)rkf_text_processors.NIL;
        cost = (SubLObject)rkf_text_processors.NIL;
        quality = (SubLObject)rkf_text_processors.NIL;
        expected_expansions = (SubLObject)rkf_text_processors.NIL;
        supplants = (SubLObject)rkf_text_processors.NIL;
        cdolist_list_var = (SubLObject)rkf_text_processors.$list181;
        curr = (SubLObject)rkf_text_processors.NIL;
        curr = cdolist_list_var.first();
        while (rkf_text_processors.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = curr;
            SubLObject key = (SubLObject)rkf_text_processors.NIL;
            SubLObject value = (SubLObject)rkf_text_processors.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list161);
            key = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list161);
            value = current.first();
            current = current.rest();
            if (rkf_text_processors.NIL == current) {
                final SubLObject pcase_var = key;
                if (pcase_var.eql((SubLObject)rkf_text_processors.$kw93$NAME)) {
                    name = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw94$CATEGORY)) {
                    category = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw95$ENTRY_POINT)) {
                    entry_point = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw155$DOC)) {
                    docstring = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw61$QUALITY)) {
                    quality = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw96$COST)) {
                    cost = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw97$EXPECTED_EXPANSIONS)) {
                    expected_expansions = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw98$SUPPLANTS)) {
                    supplants = value;
                }
                else {
                    Errors.error((SubLObject)rkf_text_processors.$str158$Invalid_key__S_in_parser_module_r, key);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_text_processors.$list161);
            }
            cdolist_list_var = cdolist_list_var.rest();
            curr = cdolist_list_var.first();
        }
        pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
        rkf_uttrdr_register_parser(category, pmd);
        name = (SubLObject)rkf_text_processors.NIL;
        category = (SubLObject)rkf_text_processors.NIL;
        entry_point = (SubLObject)rkf_text_processors.NIL;
        docstring = (SubLObject)rkf_text_processors.NIL;
        cost = (SubLObject)rkf_text_processors.NIL;
        quality = (SubLObject)rkf_text_processors.NIL;
        expected_expansions = (SubLObject)rkf_text_processors.NIL;
        supplants = (SubLObject)rkf_text_processors.NIL;
        cdolist_list_var = (SubLObject)rkf_text_processors.$list182;
        curr = (SubLObject)rkf_text_processors.NIL;
        curr = cdolist_list_var.first();
        while (rkf_text_processors.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = curr;
            SubLObject key = (SubLObject)rkf_text_processors.NIL;
            SubLObject value = (SubLObject)rkf_text_processors.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list161);
            key = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list161);
            value = current.first();
            current = current.rest();
            if (rkf_text_processors.NIL == current) {
                final SubLObject pcase_var = key;
                if (pcase_var.eql((SubLObject)rkf_text_processors.$kw93$NAME)) {
                    name = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw94$CATEGORY)) {
                    category = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw95$ENTRY_POINT)) {
                    entry_point = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw155$DOC)) {
                    docstring = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw61$QUALITY)) {
                    quality = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw96$COST)) {
                    cost = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw97$EXPECTED_EXPANSIONS)) {
                    expected_expansions = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw98$SUPPLANTS)) {
                    supplants = value;
                }
                else {
                    Errors.error((SubLObject)rkf_text_processors.$str158$Invalid_key__S_in_parser_module_r, key);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_text_processors.$list161);
            }
            cdolist_list_var = cdolist_list_var.rest();
            curr = cdolist_list_var.first();
        }
        pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
        rkf_uttrdr_register_parser(category, pmd);
        name = (SubLObject)rkf_text_processors.NIL;
        category = (SubLObject)rkf_text_processors.NIL;
        entry_point = (SubLObject)rkf_text_processors.NIL;
        docstring = (SubLObject)rkf_text_processors.NIL;
        cost = (SubLObject)rkf_text_processors.NIL;
        quality = (SubLObject)rkf_text_processors.NIL;
        expected_expansions = (SubLObject)rkf_text_processors.NIL;
        supplants = (SubLObject)rkf_text_processors.NIL;
        cdolist_list_var = (SubLObject)rkf_text_processors.$list183;
        curr = (SubLObject)rkf_text_processors.NIL;
        curr = cdolist_list_var.first();
        while (rkf_text_processors.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = curr;
            SubLObject key = (SubLObject)rkf_text_processors.NIL;
            SubLObject value = (SubLObject)rkf_text_processors.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list161);
            key = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list161);
            value = current.first();
            current = current.rest();
            if (rkf_text_processors.NIL == current) {
                final SubLObject pcase_var = key;
                if (pcase_var.eql((SubLObject)rkf_text_processors.$kw93$NAME)) {
                    name = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw94$CATEGORY)) {
                    category = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw95$ENTRY_POINT)) {
                    entry_point = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw155$DOC)) {
                    docstring = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw61$QUALITY)) {
                    quality = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw96$COST)) {
                    cost = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw97$EXPECTED_EXPANSIONS)) {
                    expected_expansions = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw98$SUPPLANTS)) {
                    supplants = value;
                }
                else {
                    Errors.error((SubLObject)rkf_text_processors.$str158$Invalid_key__S_in_parser_module_r, key);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_text_processors.$list161);
            }
            cdolist_list_var = cdolist_list_var.rest();
            curr = cdolist_list_var.first();
        }
        pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
        rkf_uttrdr_register_parser(category, pmd);
        name = (SubLObject)rkf_text_processors.NIL;
        category = (SubLObject)rkf_text_processors.NIL;
        entry_point = (SubLObject)rkf_text_processors.NIL;
        docstring = (SubLObject)rkf_text_processors.NIL;
        cost = (SubLObject)rkf_text_processors.NIL;
        quality = (SubLObject)rkf_text_processors.NIL;
        expected_expansions = (SubLObject)rkf_text_processors.NIL;
        supplants = (SubLObject)rkf_text_processors.NIL;
        cdolist_list_var = (SubLObject)rkf_text_processors.$list184;
        curr = (SubLObject)rkf_text_processors.NIL;
        curr = cdolist_list_var.first();
        while (rkf_text_processors.NIL != cdolist_list_var) {
            SubLObject current;
            final SubLObject datum = current = curr;
            SubLObject key = (SubLObject)rkf_text_processors.NIL;
            SubLObject value = (SubLObject)rkf_text_processors.NIL;
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list161);
            key = current.first();
            current = current.rest();
            cdestructuring_bind.destructuring_bind_must_consp(current, datum, (SubLObject)rkf_text_processors.$list161);
            value = current.first();
            current = current.rest();
            if (rkf_text_processors.NIL == current) {
                final SubLObject pcase_var = key;
                if (pcase_var.eql((SubLObject)rkf_text_processors.$kw93$NAME)) {
                    name = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw94$CATEGORY)) {
                    category = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw95$ENTRY_POINT)) {
                    entry_point = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw155$DOC)) {
                    docstring = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw61$QUALITY)) {
                    quality = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw96$COST)) {
                    cost = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw97$EXPECTED_EXPANSIONS)) {
                    expected_expansions = value;
                }
                else if (pcase_var.eql((SubLObject)rkf_text_processors.$kw98$SUPPLANTS)) {
                    supplants = value;
                }
                else {
                    Errors.error((SubLObject)rkf_text_processors.$str158$Invalid_key__S_in_parser_module_r, key);
                }
            }
            else {
                cdestructuring_bind.cdestructuring_bind_error(datum, (SubLObject)rkf_text_processors.$list161);
            }
            cdolist_list_var = cdolist_list_var.rest();
            curr = cdolist_list_var.first();
        }
        pmd = new_parse_module_definition(name, category, quality, entry_point, cost, expected_expansions, supplants);
        rkf_uttrdr_register_parser(category, pmd);
        utilities_macros.register_cyc_api_function((SubLObject)rkf_text_processors.$sym217$PARSE_A_SENTENCE_COMPLETELY, (SubLObject)rkf_text_processors.$list218, (SubLObject)rkf_text_processors.$str219$This_function_returns_all_the_dec, (SubLObject)rkf_text_processors.$list220, (SubLObject)rkf_text_processors.$list221);
        utilities_macros.register_cyc_api_function((SubLObject)rkf_text_processors.$sym224$PARSE_A_QUESTION_COMPLETELY, (SubLObject)rkf_text_processors.$list218, (SubLObject)rkf_text_processors.$str225$This_function_returns_all_the_que, (SubLObject)rkf_text_processors.$list220, (SubLObject)rkf_text_processors.$list221);
        return (SubLObject)rkf_text_processors.NIL;
    }

    @Override
	public void declareFunctions() {
        declare_rkf_text_processors_file();
    }

    @Override
	public void initializeVariables() {
        init_rkf_text_processors_file();
    }

    @Override
	public void runTopLevelForms() {
        setup_rkf_text_processors_file();
    }

    static {
        me = (SubLFile)new rkf_text_processors();
        rkf_text_processors.$rkf_text_proc_resolve_parses$ = null;
        rkf_text_processors.$resolve_parse_interpretation_max_depth$ = null;
        rkf_text_processors.$resolve_parse_recursion_depth$ = null;
        rkf_text_processors.$resolve_parse_recursion_show_warningsP$ = null;
        rkf_text_processors.$dtp_parse_result$ = null;
        rkf_text_processors.$rkf_textproc_print_parse_result_tersely$ = null;
        rkf_text_processors.$rkf_uttrdr_allow_nltagsP$ = null;
        rkf_text_processors.$rkf_uttrdr_full_spans_onlyP$ = null;
        rkf_text_processors.$rkf_term_reader_default_templates$ = null;
        rkf_text_processors.$rkf_term_reader_cycl_template_mappings$ = null;
        rkf_text_processors.$rkf_uttrdr_arg_type_to_template_categories$ = null;
        rkf_text_processors.$pmg_ordering$ = null;
        rkf_text_processors.$rkf_terms_forager_lock$ = null;
        rkf_text_processors.$dtp_parse_module_definition$ = null;
        rkf_text_processors.$rkf_uttrdr_default_cost$ = null;
        rkf_text_processors.$rkf_uttrdr_default_expected_expansions$ = null;
        rkf_text_processors.$dtp_parse_module_group$ = null;
        rkf_text_processors.$rkf_uttrdr_known_parsers$ = null;
        rkf_text_processors.$rkf_uttrdr_resolvables$ = null;
        rkf_text_processors.$rkf_uttrdr_psp_return_mode$ = null;
        rkf_text_processors.$rkf_uttrdr_known_parsers_lock$ = null;
        rkf_text_processors.$rkf_uttrdr_use_vpp_in_itp$ = null;
        rkf_text_processors.$rkf_uttrdr_marker$ = null;
        $list0 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPAN"), (SubLObject)SubLObjectFactory.makeSymbol("INTERPRETATIONS"));
        $sym1$CLET = SubLObjectFactory.makeSymbol("CLET");
        $list2 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*RKF-TEXT-PROC-RESOLVE-PARSES*"), (SubLObject)rkf_text_processors.T));
        $sym3$RKF_UTTRDR_ORDER_PARSES = SubLObjectFactory.makeSymbol("RKF-UTTRDR-ORDER-PARSES");
        $str4$Exceeded_recursion_depth__S_for_R = SubLObjectFactory.makeString("Exceeded recursion depth ~S for RESOLVE-PARSE-INTERPRETATION while parsing~% ~S");
        $kw5$IGNORE = SubLObjectFactory.makeKeyword("IGNORE");
        $list6 = (SubLList)ConsesLow.cons((SubLObject)SubLObjectFactory.makeSymbol("OUT"), (SubLObject)SubLObjectFactory.makeSymbol("IN"));
        $sym7$PARSE_RESULT = SubLObjectFactory.makeSymbol("PARSE-RESULT");
        $sym8$PARSE_RESULT_P = SubLObjectFactory.makeSymbol("PARSE-RESULT-P");
        $list9 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("ORIGINAL"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTITUENTS"), (SubLObject)SubLObjectFactory.makeSymbol("ELIMINATED"), (SubLObject)SubLObjectFactory.makeSymbol("PROBLEMS"), (SubLObject)SubLObjectFactory.makeSymbol("SOLUTIONS"));
        $list10 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ORIGINAL"), (SubLObject)SubLObjectFactory.makeKeyword("CONSTITUENTS"), (SubLObject)SubLObjectFactory.makeKeyword("ELIMINATED"), (SubLObject)SubLObjectFactory.makeKeyword("PROBLEMS"), (SubLObject)SubLObjectFactory.makeKeyword("SOLUTIONS"));
        $list11 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARSE-RESULT-ORIGINAL"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE-RESULT-CONSTITUENTS"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE-RESULT-ELIMINATED"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE-RESULT-PROBLEMS"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE-RESULT-SOLUTIONS"));
        $list12 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PARSE-RESULT-ORIGINAL"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PARSE-RESULT-CONSTITUENTS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PARSE-RESULT-ELIMINATED"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PARSE-RESULT-PROBLEMS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PARSE-RESULT-SOLUTIONS"));
        $sym13$PRINT_PARSE_RESULT = SubLObjectFactory.makeSymbol("PRINT-PARSE-RESULT");
        $sym14$PARSE_RESULT_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("PARSE-RESULT-PRINT-FUNCTION-TRAMPOLINE");
        $list15 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE-RESULT-P"));
        $sym16$PARSE_RESULT_ORIGINAL = SubLObjectFactory.makeSymbol("PARSE-RESULT-ORIGINAL");
        $sym17$_CSETF_PARSE_RESULT_ORIGINAL = SubLObjectFactory.makeSymbol("_CSETF-PARSE-RESULT-ORIGINAL");
        $sym18$PARSE_RESULT_CONSTITUENTS = SubLObjectFactory.makeSymbol("PARSE-RESULT-CONSTITUENTS");
        $sym19$_CSETF_PARSE_RESULT_CONSTITUENTS = SubLObjectFactory.makeSymbol("_CSETF-PARSE-RESULT-CONSTITUENTS");
        $sym20$PARSE_RESULT_ELIMINATED = SubLObjectFactory.makeSymbol("PARSE-RESULT-ELIMINATED");
        $sym21$_CSETF_PARSE_RESULT_ELIMINATED = SubLObjectFactory.makeSymbol("_CSETF-PARSE-RESULT-ELIMINATED");
        $sym22$PARSE_RESULT_PROBLEMS = SubLObjectFactory.makeSymbol("PARSE-RESULT-PROBLEMS");
        $sym23$_CSETF_PARSE_RESULT_PROBLEMS = SubLObjectFactory.makeSymbol("_CSETF-PARSE-RESULT-PROBLEMS");
        $sym24$PARSE_RESULT_SOLUTIONS = SubLObjectFactory.makeSymbol("PARSE-RESULT-SOLUTIONS");
        $sym25$_CSETF_PARSE_RESULT_SOLUTIONS = SubLObjectFactory.makeSymbol("_CSETF-PARSE-RESULT-SOLUTIONS");
        $kw26$ORIGINAL = SubLObjectFactory.makeKeyword("ORIGINAL");
        $kw27$CONSTITUENTS = SubLObjectFactory.makeKeyword("CONSTITUENTS");
        $kw28$ELIMINATED = SubLObjectFactory.makeKeyword("ELIMINATED");
        $kw29$PROBLEMS = SubLObjectFactory.makeKeyword("PROBLEMS");
        $kw30$SOLUTIONS = SubLObjectFactory.makeKeyword("SOLUTIONS");
        $str31$Invalid_slot__S_for_construction_ = SubLObjectFactory.makeString("Invalid slot ~S for construction function");
        $kw32$BEGIN = SubLObjectFactory.makeKeyword("BEGIN");
        $sym33$MAKE_PARSE_RESULT = SubLObjectFactory.makeSymbol("MAKE-PARSE-RESULT");
        $kw34$SLOT = SubLObjectFactory.makeKeyword("SLOT");
        $kw35$END = SubLObjectFactory.makeKeyword("END");
        $sym36$VISIT_DEFSTRUCT_OBJECT_PARSE_RESULT_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-PARSE-RESULT-METHOD");
        $list37 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*RKF-TEXTPROC-PRINT-PARSE-RESULT-TERSELY*"), (SubLObject)rkf_text_processors.NIL));
        $const38$TheList = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TheList"));
        $str39$__Original______S__ = SubLObjectFactory.makeString("~&Original:~%  ~S~%");
        $str40$Constituents = SubLObjectFactory.makeString("Constituents");
        $str41$Eliminations = SubLObjectFactory.makeString("Eliminations");
        $str42$Open_Issues = SubLObjectFactory.makeString("Open Issues");
        $str43$Issue_Resolutions = SubLObjectFactory.makeString("Issue Resolutions");
        $str44$___A___ = SubLObjectFactory.makeString("~&~A:~%");
        $str45$__none____ = SubLObjectFactory.makeString("  none~%~%");
        $str46$___S______S____ = SubLObjectFactory.makeString("  ~S~%   ~S~%~%");
        $list47 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*RKF-UTTRDR-ALLOW-NLTAGS?*"), (SubLObject)rkf_text_processors.NIL));
        $list48 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*RKF-UTTRDR-FULL-SPANS-ONLY?*"), (SubLObject)rkf_text_processors.T));
        $list49 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*RKF-UTTRDR-FULL-SPANS-ONLY?*"), (SubLObject)rkf_text_processors.NIL));
        $const50$ImperativeTemplate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ImperativeTemplate"));
        $const51$STemplate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("STemplate"));
        $const52$QuestionTemplate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QuestionTemplate"));
        $str53$Parsing_Pipeline = SubLObjectFactory.makeString("Parsing Pipeline");
        $sym54$STORE_RTP_PARSES_IN_PIPELINE = SubLObjectFactory.makeSymbol("STORE-RTP-PARSES-IN-PIPELINE");
        $const55$CycRecursiveTemplateParser = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycRecursiveTemplateParser"));
        $kw56$FORKED = SubLObjectFactory.makeKeyword("FORKED");
        $list57 = ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NPTemplate")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NBarTemplate")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AdjPTemplate")));
        $list58 = ConsesLow.list((SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("CycLSentence-Assertible")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("STemplate"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("SubLString")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("StringTemplate"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ScalarInterval")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NPTemplate"))), (SubLObject)ConsesLow.list(constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("Plan-ExpectedSituationType")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfinitivalVPTemplate")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfinitivalVBarTemplate")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NBarTemplate")), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NPTemplate"))));
        $sym59$RELEVANT_MT_IS_GENL_MT = SubLObjectFactory.makeSymbol("RELEVANT-MT-IS-GENL-MT");
        $list60 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*PMG-ORDERING*"), (SubLObject)SubLObjectFactory.makeKeyword("QUALITY")));
        $kw61$QUALITY = SubLObjectFactory.makeKeyword("QUALITY");
        $const62$ScenarioTemplate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ScenarioTemplate"));
        $sym63$TIME_INTERVAL_ = SubLObjectFactory.makeSymbol("TIME-INTERVAL?");
        $const64$RKFParsingMt = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("RKFParsingMt"));
        $const65$DateTemplate = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DateTemplate"));
        $kw66$DONE = SubLObjectFactory.makeKeyword("DONE");
        $sym67$_RKF_TERMS_FORAGER_LOCK_ = SubLObjectFactory.makeSymbol("*RKF-TERMS-FORAGER-LOCK*");
        $str68$Terms_Forager = SubLObjectFactory.makeString("Terms Forager");
        $list69 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RKF-CH-NOUN-COMPOUND-PHRASES"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-CH-MULTI-WORD-DENOTATION"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-CH-DENOTS-OF-STRING"));
        $sym70$PARSE_MODULE_DEFINITION = SubLObjectFactory.makeSymbol("PARSE-MODULE-DEFINITION");
        $sym71$PARSE_MODULE_DEFINITION_P = SubLObjectFactory.makeSymbol("PARSE-MODULE-DEFINITION-P");
        $list72 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("NAME"), (SubLObject)SubLObjectFactory.makeSymbol("CATEGORY"), (SubLObject)SubLObjectFactory.makeSymbol("QUALITY"), (SubLObject)SubLObjectFactory.makeSymbol("ENTRY-POINT"), (SubLObject)SubLObjectFactory.makeSymbol("COST"), (SubLObject)SubLObjectFactory.makeSymbol("EXPECTED-EXPANSIONS"), (SubLObject)SubLObjectFactory.makeSymbol("SUPPLANTS"));
        $list73 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("CATEGORY"), (SubLObject)SubLObjectFactory.makeKeyword("QUALITY"), (SubLObject)SubLObjectFactory.makeKeyword("ENTRY-POINT"), (SubLObject)SubLObjectFactory.makeKeyword("COST"), (SubLObject)SubLObjectFactory.makeKeyword("EXPECTED-EXPANSIONS"), (SubLObject)SubLObjectFactory.makeKeyword("SUPPLANTS"));
        $list74 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PMD-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("PMD-CATEGORY"), (SubLObject)SubLObjectFactory.makeSymbol("PMD-QUALITY"), (SubLObject)SubLObjectFactory.makeSymbol("PMD-ENTRY-POINT"), (SubLObject)SubLObjectFactory.makeSymbol("PMD-COST"), (SubLObject)SubLObjectFactory.makeSymbol("PMD-EXPECTED-EXPANSIONS"), (SubLObject)SubLObjectFactory.makeSymbol("PMD-SUPPLANTS"));
        $list75 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PMD-NAME"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PMD-CATEGORY"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PMD-QUALITY"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PMD-ENTRY-POINT"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PMD-COST"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PMD-EXPECTED-EXPANSIONS"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PMD-SUPPLANTS"));
        $sym76$PMD_PRINT = SubLObjectFactory.makeSymbol("PMD-PRINT");
        $sym77$PARSE_MODULE_DEFINITION_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("PARSE-MODULE-DEFINITION-PRINT-FUNCTION-TRAMPOLINE");
        $list78 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE-MODULE-DEFINITION-P"));
        $sym79$PMD_NAME = SubLObjectFactory.makeSymbol("PMD-NAME");
        $sym80$_CSETF_PMD_NAME = SubLObjectFactory.makeSymbol("_CSETF-PMD-NAME");
        $sym81$PMD_CATEGORY = SubLObjectFactory.makeSymbol("PMD-CATEGORY");
        $sym82$_CSETF_PMD_CATEGORY = SubLObjectFactory.makeSymbol("_CSETF-PMD-CATEGORY");
        $sym83$PMD_QUALITY = SubLObjectFactory.makeSymbol("PMD-QUALITY");
        $sym84$_CSETF_PMD_QUALITY = SubLObjectFactory.makeSymbol("_CSETF-PMD-QUALITY");
        $sym85$PMD_ENTRY_POINT = SubLObjectFactory.makeSymbol("PMD-ENTRY-POINT");
        $sym86$_CSETF_PMD_ENTRY_POINT = SubLObjectFactory.makeSymbol("_CSETF-PMD-ENTRY-POINT");
        $sym87$PMD_COST = SubLObjectFactory.makeSymbol("PMD-COST");
        $sym88$_CSETF_PMD_COST = SubLObjectFactory.makeSymbol("_CSETF-PMD-COST");
        $sym89$PMD_EXPECTED_EXPANSIONS = SubLObjectFactory.makeSymbol("PMD-EXPECTED-EXPANSIONS");
        $sym90$_CSETF_PMD_EXPECTED_EXPANSIONS = SubLObjectFactory.makeSymbol("_CSETF-PMD-EXPECTED-EXPANSIONS");
        $sym91$PMD_SUPPLANTS = SubLObjectFactory.makeSymbol("PMD-SUPPLANTS");
        $sym92$_CSETF_PMD_SUPPLANTS = SubLObjectFactory.makeSymbol("_CSETF-PMD-SUPPLANTS");
        $kw93$NAME = SubLObjectFactory.makeKeyword("NAME");
        $kw94$CATEGORY = SubLObjectFactory.makeKeyword("CATEGORY");
        $kw95$ENTRY_POINT = SubLObjectFactory.makeKeyword("ENTRY-POINT");
        $kw96$COST = SubLObjectFactory.makeKeyword("COST");
        $kw97$EXPECTED_EXPANSIONS = SubLObjectFactory.makeKeyword("EXPECTED-EXPANSIONS");
        $kw98$SUPPLANTS = SubLObjectFactory.makeKeyword("SUPPLANTS");
        $sym99$MAKE_PARSE_MODULE_DEFINITION = SubLObjectFactory.makeSymbol("MAKE-PARSE-MODULE-DEFINITION");
        $sym100$VISIT_DEFSTRUCT_OBJECT_PARSE_MODULE_DEFINITION_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-PARSE-MODULE-DEFINITION-METHOD");
        $str101$_PARSE_MODULE_DEFINITION__S_ = SubLObjectFactory.makeString("<PARSE-MODULE-DEFINITION ~S>");
        $str102$Can_t_resolve_quality_of__S_ = SubLObjectFactory.makeString("Can't resolve quality of ~S.");
        $str103$Parser__S_for__S__Func___S_Heur__ = SubLObjectFactory.makeString("Parser ~S for ~S  Func: ~S Heur: ");
        $str104$___Suppl__S_ = SubLObjectFactory.makeString("// Suppl ~S ");
        $str105$Class__D____Qual__D____Cost__D___ = SubLObjectFactory.makeString("Class ~D // Qual ~D // Cost ~D // Expn ~D ");
        $sym106$CATCH_ERROR_MESSAGE_HANDLER = SubLObjectFactory.makeSymbol("CATCH-ERROR-MESSAGE-HANDLER");
        $sym107$PARSE_MODULE_GROUP = SubLObjectFactory.makeSymbol("PARSE-MODULE-GROUP");
        $sym108$PARSE_MODULE_GROUP_P = SubLObjectFactory.makeSymbol("PARSE-MODULE-GROUP-P");
        $list109 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("CATEGORY"), (SubLObject)SubLObjectFactory.makeSymbol("TOOLS"));
        $list110 = ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CATEGORY"), (SubLObject)SubLObjectFactory.makeKeyword("TOOLS"));
        $list111 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PMG-CATEGORY"), (SubLObject)SubLObjectFactory.makeSymbol("PMG-TOOLS"));
        $list112 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PMG-CATEGORY"), (SubLObject)SubLObjectFactory.makeSymbol("_CSETF-PMG-TOOLS"));
        $sym113$DEFAULT_STRUCT_PRINT_FUNCTION = SubLObjectFactory.makeSymbol("DEFAULT-STRUCT-PRINT-FUNCTION");
        $sym114$PARSE_MODULE_GROUP_PRINT_FUNCTION_TRAMPOLINE = SubLObjectFactory.makeSymbol("PARSE-MODULE-GROUP-PRINT-FUNCTION-TRAMPOLINE");
        $list115 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("OPTIMIZE-FUNCALL"), (SubLObject)SubLObjectFactory.makeSymbol("PARSE-MODULE-GROUP-P"));
        $sym116$PMG_CATEGORY = SubLObjectFactory.makeSymbol("PMG-CATEGORY");
        $sym117$_CSETF_PMG_CATEGORY = SubLObjectFactory.makeSymbol("_CSETF-PMG-CATEGORY");
        $sym118$PMG_TOOLS = SubLObjectFactory.makeSymbol("PMG-TOOLS");
        $sym119$_CSETF_PMG_TOOLS = SubLObjectFactory.makeSymbol("_CSETF-PMG-TOOLS");
        $kw120$TOOLS = SubLObjectFactory.makeKeyword("TOOLS");
        $sym121$MAKE_PARSE_MODULE_GROUP = SubLObjectFactory.makeSymbol("MAKE-PARSE-MODULE-GROUP");
        $sym122$VISIT_DEFSTRUCT_OBJECT_PARSE_MODULE_GROUP_METHOD = SubLObjectFactory.makeSymbol("VISIT-DEFSTRUCT-OBJECT-PARSE-MODULE-GROUP-METHOD");
        $sym123$PMD_EXPECTED_EXPANSIONS_ = SubLObjectFactory.makeSymbol("PMD-EXPECTED-EXPANSIONS<");
        $sym124$PMD_COST_ = SubLObjectFactory.makeSymbol("PMD-COST<");
        $sym125$PMD_QUALITY_ = SubLObjectFactory.makeSymbol("PMD-QUALITY<");
        $str126$__Parse_Group_for__S___ = SubLObjectFactory.makeString("~&Parse Group for ~S.~%");
        $str127$Tools__in_order______ = SubLObjectFactory.makeString("Tools (in order):~%  ");
        $sym128$_RKF_UTTRDR_KNOWN_PARSERS_ = SubLObjectFactory.makeSymbol("*RKF-UTTRDR-KNOWN-PARSERS*");
        $kw129$BEST_ONLY = SubLObjectFactory.makeKeyword("BEST-ONLY");
        $sym130$_RKF_UTTRDR_PSP_RETURN_MODE_ = SubLObjectFactory.makeSymbol("*RKF-UTTRDR-PSP-RETURN-MODE*");
        $str131$Known_Parsers = SubLObjectFactory.makeString("Known Parsers");
        $sym132$WITH_LOCK_HELD = SubLObjectFactory.makeSymbol("WITH-LOCK-HELD");
        $list133 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("*RKF-UTTRDR-KNOWN-PARSERS-LOCK*"));
        $sym134$RKF_UTTRDR_PMD_ORDERED_ = SubLObjectFactory.makeSymbol("RKF-UTTRDR-PMD-ORDERED?");
        $str135$No_known_parsers_for_category__S_ = SubLObjectFactory.makeString("No known parsers for category ~S.~%");
        $kw136$CLEARED = SubLObjectFactory.makeKeyword("CLEARED");
        $list137 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("KEYS"));
        $sym138$PMD = SubLObjectFactory.makeUninternedSymbol("PMD");
        $sym139$CURR = SubLObjectFactory.makeUninternedSymbol("CURR");
        $sym140$KEY = SubLObjectFactory.makeUninternedSymbol("KEY");
        $sym141$VALUE = SubLObjectFactory.makeUninternedSymbol("VALUE");
        $sym142$NAME = SubLObjectFactory.makeUninternedSymbol("NAME");
        $sym143$CATEGORY = SubLObjectFactory.makeUninternedSymbol("CATEGORY");
        $sym144$ENTRY_POINT = SubLObjectFactory.makeUninternedSymbol("ENTRY-POINT");
        $sym145$DOCSTRING = SubLObjectFactory.makeUninternedSymbol("DOCSTRING");
        $sym146$COST = SubLObjectFactory.makeUninternedSymbol("COST");
        $sym147$QUALITY = SubLObjectFactory.makeUninternedSymbol("QUALITY");
        $sym148$EXPECTED_EXPANSIONS = SubLObjectFactory.makeUninternedSymbol("EXPECTED-EXPANSIONS");
        $sym149$SUPPLANTS = SubLObjectFactory.makeUninternedSymbol("SUPPLANTS");
        $sym150$IGNORE = SubLObjectFactory.makeSymbol("IGNORE");
        $sym151$CDOLIST = SubLObjectFactory.makeSymbol("CDOLIST");
        $sym152$CDESTRUCTURING_BIND = SubLObjectFactory.makeSymbol("CDESTRUCTURING-BIND");
        $sym153$PCASE = SubLObjectFactory.makeSymbol("PCASE");
        $sym154$CSETQ = SubLObjectFactory.makeSymbol("CSETQ");
        $kw155$DOC = SubLObjectFactory.makeKeyword("DOC");
        $sym156$OTHERWISE = SubLObjectFactory.makeSymbol("OTHERWISE");
        $sym157$ERROR = SubLObjectFactory.makeSymbol("ERROR");
        $str158$Invalid_key__S_in_parser_module_r = SubLObjectFactory.makeString("Invalid key ~S in parser-module-registration.");
        $sym159$NEW_PARSE_MODULE_DEFINITION = SubLObjectFactory.makeSymbol("NEW-PARSE-MODULE-DEFINITION");
        $sym160$RKF_UTTRDR_REGISTER_PARSER = SubLObjectFactory.makeSymbol("RKF-UTTRDR-REGISTER-PARSER");
        $list161 = ConsesLow.list((SubLObject)SubLObjectFactory.makeUninternedSymbol("KEY"), (SubLObject)SubLObjectFactory.makeUninternedSymbol("VALUE"));
        $list162 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE-PARSE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CATEGORY"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("STemplate"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ENTRY-POINT"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-UTTRDR-USE-TEMPLATE-PARSER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DOC"), (SubLObject)SubLObjectFactory.makeString("The preferred parser for all sentence level constructions.")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("QUALITY"), (SubLObject)rkf_text_processors.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COST"), (SubLObject)rkf_text_processors.TEN_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPECTED-EXPANSIONS"), (SubLObject)rkf_text_processors.THREE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUPPLANTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NPP"), (SubLObject)SubLObjectFactory.makeKeyword("VPP"))));
        $list163 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE-PARSE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CATEGORY"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ImperativeTemplate"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ENTRY-POINT"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-UTTRDR-USE-TEMPLATE-PARSER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DOC"), (SubLObject)SubLObjectFactory.makeString("The preferred parser for all sentence level constructions.")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("QUALITY"), (SubLObject)rkf_text_processors.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COST"), (SubLObject)rkf_text_processors.TEN_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPECTED-EXPANSIONS"), (SubLObject)rkf_text_processors.THREE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUPPLANTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NPP"), (SubLObject)SubLObjectFactory.makeKeyword("VPP"))));
        $list164 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE-PARSE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CATEGORY"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("TemporalModifierTemplate"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ENTRY-POINT"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-UTTRDR-USE-TEMPLATE-PARSER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DOC"), (SubLObject)SubLObjectFactory.makeString("interpretations of temporal modifiers")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("QUALITY"), (SubLObject)rkf_text_processors.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COST"), (SubLObject)rkf_text_processors.TEN_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPECTED-EXPANSIONS"), (SubLObject)rkf_text_processors.THREE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUPPLANTS"), (SubLObject)rkf_text_processors.NIL));
        $list165 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE-PARSER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CATEGORY"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NPTemplate"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ENTRY-POINT"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-UTTRDR-USE-TEMPLATE-PARSER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DOC"), (SubLObject)SubLObjectFactory.makeString("Handles some NPPs in templates and calls through to :npp where needed.")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("QUALITY"), (SubLObject)rkf_text_processors.TEN_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COST"), (SubLObject)rkf_text_processors.TEN_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPECTED-EXPANSIONS"), (SubLObject)rkf_text_processors.THREE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUPPLANTS"), (SubLObject)rkf_text_processors.NIL));
        $list166 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE-PARSER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CATEGORY"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("PossessiveTemplate"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ENTRY-POINT"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-UTTRDR-USE-TEMPLATE-PARSER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DOC"), (SubLObject)SubLObjectFactory.makeString("Handles some NPPs in templates and calls through to :npp where needed.")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("QUALITY"), (SubLObject)rkf_text_processors.TEN_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COST"), (SubLObject)rkf_text_processors.TEN_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPECTED-EXPANSIONS"), (SubLObject)rkf_text_processors.THREE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUPPLANTS"), (SubLObject)rkf_text_processors.NIL));
        $list167 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE-PARSER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CATEGORY"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("DateTemplate"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ENTRY-POINT"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-UTTRDR-USE-TEMPLATE-PARSER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DOC"), (SubLObject)SubLObjectFactory.makeString("Handles some NPPs in templates and calls through to :npp where \nneeded.")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("QUALITY"), (SubLObject)rkf_text_processors.TEN_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COST"), (SubLObject)rkf_text_processors.TEN_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPECTED-EXPANSIONS"), (SubLObject)rkf_text_processors.THREE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUPPLANTS"), (SubLObject)rkf_text_processors.NIL));
        $list168 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("NPP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CATEGORY"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NPTemplate"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ENTRY-POINT"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-UTTRDR-USE-NOUN-PHRASE-PARSER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DOC"), (SubLObject)SubLObjectFactory.makeString("does all real noun phrases, but will not get nbars")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("QUALITY"), (SubLObject)SubLObjectFactory.makeSymbol("PMD-NPP-QUALITY")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COST"), (SubLObject)rkf_text_processors.TEN_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPECTED-EXPANSIONS"), (SubLObject)rkf_text_processors.THREE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUPPLANTS"), (SubLObject)rkf_text_processors.NIL));
        $list169 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("NCP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CATEGORY"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NBarTemplate"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ENTRY-POINT"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-UTTRDR-USE-NOUN-COMPOUND-PARSER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DOC"), (SubLObject)SubLObjectFactory.makeString("gets noun compound nbars as well")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("QUALITY"), (SubLObject)rkf_text_processors.TEN_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COST"), (SubLObject)rkf_text_processors.TEN_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPECTED-EXPANSIONS"), (SubLObject)rkf_text_processors.THREE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUPPLANTS"), (SubLObject)rkf_text_processors.NIL));
        $list170 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("NCLEX")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CATEGORY"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NPTemplate"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ENTRY-POINT"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-UTTRDR-USE-NOUN-COMPOUND-LEXICON")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DOC"), (SubLObject)SubLObjectFactory.makeString("looks up noun compounds in the lexicon")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("QUALITY"), (SubLObject)rkf_text_processors.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COST"), (SubLObject)rkf_text_processors.TEN_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPECTED-EXPANSIONS"), (SubLObject)rkf_text_processors.THREE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUPPLANTS"), (SubLObject)rkf_text_processors.NIL));
        $list171 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("MWD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CATEGORY"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NPTemplate"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ENTRY-POINT"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-UTTRDR-USE-MULTI-WORD-DENOTATIONS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DOC"), (SubLObject)SubLObjectFactory.makeString("uses multi-word denotations to interpret parse results")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("QUALITY"), (SubLObject)rkf_text_processors.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COST"), (SubLObject)rkf_text_processors.TEN_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPECTED-EXPANSIONS"), (SubLObject)rkf_text_processors.THREE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUPPLANTS"), (SubLObject)rkf_text_processors.NIL));
        $list172 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("DENOTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CATEGORY"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NPTemplate"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ENTRY-POINT"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-UTTRDR-USE-DENOTS-OF-STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DOC"), (SubLObject)SubLObjectFactory.makeString("uses string denotation assertions to interpret parse results")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("QUALITY"), (SubLObject)rkf_text_processors.FIVE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COST"), (SubLObject)rkf_text_processors.TEN_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPECTED-EXPANSIONS"), (SubLObject)rkf_text_processors.SIX_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUPPLANTS"), (SubLObject)rkf_text_processors.NIL));
        $list173 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("NUMBERS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CATEGORY"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NPTemplate"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ENTRY-POINT"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-UTTRDR-USE-NUMBER-PARSER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DOC"), (SubLObject)SubLObjectFactory.makeString("uses number parser to interpret parse results")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("QUALITY"), (SubLObject)rkf_text_processors.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COST"), (SubLObject)rkf_text_processors.TWENTY_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPECTED-EXPANSIONS"), (SubLObject)rkf_text_processors.THREE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUPPLANTS"), (SubLObject)rkf_text_processors.NIL));
        $list174 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("LISP-TERM-READ")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CATEGORY"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NPTemplate"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ENTRY-POINT"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-UTTRDR-READ-CYCL-TERM-FROM-STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DOC"), (SubLObject)SubLObjectFactory.makeString("uses lisp 'read' to read a CycL term")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("QUALITY"), (SubLObject)rkf_text_processors.THREE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COST"), (SubLObject)rkf_text_processors.TEN_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPECTED-EXPANSIONS"), (SubLObject)rkf_text_processors.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUPPLANTS"), (SubLObject)rkf_text_processors.NIL));
        $list175 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("STRING-READ")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CATEGORY"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("StringTemplate"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ENTRY-POINT"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-UTTRDR-READ-AS-STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DOC"), (SubLObject)SubLObjectFactory.makeString("returns the string you sent in")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("QUALITY"), (SubLObject)rkf_text_processors.TEN_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COST"), (SubLObject)rkf_text_processors.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPECTED-EXPANSIONS"), (SubLObject)rkf_text_processors.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUPPLANTS"), (SubLObject)rkf_text_processors.NIL));
        $list176 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("PSP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CATEGORY"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfinitivalVBarTemplate"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ENTRY-POINT"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-UTTRDR-PARSE-INF-VBAR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DOC"), (SubLObject)SubLObjectFactory.makeString("uses PSP to parse infinitival vbars like 'eat doughnuts'")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("QUALITY"), (SubLObject)rkf_text_processors.TEN_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COST"), (SubLObject)rkf_text_processors.TEN_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPECTED-EXPANSIONS"), (SubLObject)rkf_text_processors.THREE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUPPLANTS"), (SubLObject)rkf_text_processors.NIL));
        $list177 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("PSP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CATEGORY"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("InfinitivalVPTemplate"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ENTRY-POINT"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-UTTRDR-PARSE-INF-VBAR")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DOC"), (SubLObject)SubLObjectFactory.makeString("uses PSP to parse infinitival VPs like 'eat doughnuts'")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("QUALITY"), (SubLObject)rkf_text_processors.TEN_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COST"), (SubLObject)rkf_text_processors.TEN_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPECTED-EXPANSIONS"), (SubLObject)rkf_text_processors.THREE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUPPLANTS"), (SubLObject)rkf_text_processors.NIL));
        $list178 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("DENOTS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CATEGORY"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AdjPTemplate"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ENTRY-POINT"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-UTTRDR-USE-DENOTS-OF-STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DOC"), (SubLObject)SubLObjectFactory.makeString("uses string denotation assertions to interpret parse results")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("QUALITY"), (SubLObject)rkf_text_processors.TWO_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COST"), (SubLObject)rkf_text_processors.TEN_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPECTED-EXPANSIONS"), (SubLObject)rkf_text_processors.THREE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUPPLANTS"), (SubLObject)rkf_text_processors.NIL));
        $list179 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("NCLEX")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CATEGORY"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AdjPTemplate"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ENTRY-POINT"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-UTTRDR-USE-NOUN-COMPOUND-LEXICON")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DOC"), (SubLObject)SubLObjectFactory.makeString("looks up noun compounds in the lexicon")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("QUALITY"), (SubLObject)rkf_text_processors.THREE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COST"), (SubLObject)rkf_text_processors.TEN_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPECTED-EXPANSIONS"), (SubLObject)rkf_text_processors.THREE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUPPLANTS"), (SubLObject)rkf_text_processors.NIL));
        $list180 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("MWD")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CATEGORY"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AdjPTemplate"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ENTRY-POINT"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-UTTRDR-USE-MULTI-WORD-DENOTATIONS")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DOC"), (SubLObject)SubLObjectFactory.makeString("uses multi-word denotations to interpret parse results")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("QUALITY"), (SubLObject)rkf_text_processors.FOUR_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COST"), (SubLObject)rkf_text_processors.TEN_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPECTED-EXPANSIONS"), (SubLObject)rkf_text_processors.THREE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUPPLANTS"), (SubLObject)rkf_text_processors.NIL));
        $list181 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("LISP-TERM-READ")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CATEGORY"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AdjPTemplate"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ENTRY-POINT"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-UTTRDR-READ-CYCL-TERM-FROM-STRING")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DOC"), (SubLObject)SubLObjectFactory.makeString("uses lisp 'read' to read a CycL term")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("QUALITY"), (SubLObject)rkf_text_processors.THREE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COST"), (SubLObject)rkf_text_processors.TEN_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPECTED-EXPANSIONS"), (SubLObject)rkf_text_processors.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUPPLANTS"), (SubLObject)rkf_text_processors.NIL));
        $list182 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE-PARSE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CATEGORY"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("AdjPTemplate"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ENTRY-POINT"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-UTTRDR-USE-TEMPLATE-PARSER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DOC"), (SubLObject)SubLObjectFactory.makeString("The preferred parser for all sentence level constructions.")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("QUALITY"), (SubLObject)rkf_text_processors.FIVE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COST"), (SubLObject)rkf_text_processors.TEN_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPECTED-EXPANSIONS"), (SubLObject)rkf_text_processors.THREE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUPPLANTS"), (SubLObject)rkf_text_processors.NIL));
        $list183 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE-PARSE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CATEGORY"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("QuestionTemplate"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ENTRY-POINT"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-UTTRDR-USE-TEMPLATE-PARSER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DOC"), (SubLObject)SubLObjectFactory.makeString("The preferred parser for all sentence level constructions.")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("QUALITY"), (SubLObject)rkf_text_processors.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COST"), (SubLObject)rkf_text_processors.TEN_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPECTED-EXPANSIONS"), (SubLObject)rkf_text_processors.THREE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUPPLANTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NPP"), (SubLObject)SubLObjectFactory.makeKeyword("VPP"))));
        $list184 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NAME"), (SubLObject)SubLObjectFactory.makeKeyword("TEMPLATE-PARSE")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("CATEGORY"), constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("ScenarioTemplate"))), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("ENTRY-POINT"), (SubLObject)SubLObjectFactory.makeSymbol("RKF-UTTRDR-USE-TEMPLATE-PARSER")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("DOC"), (SubLObject)SubLObjectFactory.makeString("The preferred parser for all scenario descriptions")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("QUALITY"), (SubLObject)rkf_text_processors.ONE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("COST"), (SubLObject)rkf_text_processors.TEN_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("EXPECTED-EXPANSIONS"), (SubLObject)rkf_text_processors.THREE_INTEGER), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("SUPPLANTS"), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeKeyword("NPP"), (SubLObject)SubLObjectFactory.makeKeyword("VPP"))));
        $const185$infinitive = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("infinitive"));
        $sym186$RKF_CH_NOUN_COMPOUND_PHRASE_PARSER = SubLObjectFactory.makeSymbol("RKF-CH-NOUN-COMPOUND-PHRASE-PARSER");
        $sym187$RKF_CH_DENOTATIONS_FROM_MULTI_WORD_STRING = SubLObjectFactory.makeSymbol("RKF-CH-DENOTATIONS-FROM-MULTI-WORD-STRING");
        $sym188$RKF_CH_DENOTATIONS_FOR_STRING = SubLObjectFactory.makeSymbol("RKF-CH-DENOTATIONS-FOR-STRING");
        $sym189$RKF_TERM_FROM_STRING = SubLObjectFactory.makeSymbol("RKF-TERM-FROM-STRING");
        $sym190$STRINGP = SubLObjectFactory.makeSymbol("STRINGP");
        $list191 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PARSE-SPAN"), (SubLObject)SubLObjectFactory.makeSymbol("INTERPRETATION"));
        $sym192$RKF_NUMBER_PARSER = SubLObjectFactory.makeSymbol("RKF-NUMBER-PARSER");
        $str193$RKF_UTTRDR_MARKER = SubLObjectFactory.makeString("RKF-UTTRDR-MARKER");
        $const194$NLNumberFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLNumberFn"));
        $const195$NLQuantFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLQuantFn"));
        $const196$NLQuantFn_3 = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NLQuantFn-3"));
        $const197$NumericalQuant_NLAttrFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("NumericalQuant-NLAttrFn"));
        $const198$GroupOfCardinalityFn = constant_handles.reader_make_constant_shell((SubLObject)SubLObjectFactory.makeString("GroupOfCardinalityFn"));
        $list199 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("RELATIVE-SPAN"), (SubLObject)SubLObjectFactory.makeSymbol("INTERPRETATIONS"));
        $sym200$IS_THIS_A_NUMERIC_SPAN_ = SubLObjectFactory.makeSymbol("IS-THIS-A-NUMERIC-SPAN?");
        $sym201$IS_THIS_A_QUANT_FN_ = SubLObjectFactory.makeSymbol("IS-THIS-A-QUANT-FN?");
        $list202 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SPAN"), (SubLObject)SubLObjectFactory.makeSymbol("PROBLEMS"));
        $list203 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SURROGATE"), (SubLObject)SubLObjectFactory.makeSymbol("INTERPRETATION"));
        $sym204$RKF_CH_PARSING_SURROGATE_P = SubLObjectFactory.makeSymbol("RKF-CH-PARSING-SURROGATE-P");
        $list205 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("FUNCTOR"), (SubLObject)SubLObjectFactory.makeSymbol("STRING"), (SubLObject)SubLObjectFactory.makeSymbol("SPAN"), (SubLObject)SubLObjectFactory.makeSymbol("CATEGORY"), (SubLObject)SubLObjectFactory.makeSymbol("CONSTRAINT"));
        $list206 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("INTERPRETATION"), (SubLObject)SubLObjectFactory.makeSymbol("SPAN"));
        $sym207$HLMT_ = SubLObjectFactory.makeSymbol("HLMT?");
        $sym208$PROPERTY_LIST_P = SubLObjectFactory.makeSymbol("PROPERTY-LIST-P");
        $kw209$STRENGTHEN_ = SubLObjectFactory.makeKeyword("STRENGTHEN?");
        $kw210$MULTIPLE_QUANTIFICATIONS = SubLObjectFactory.makeKeyword("MULTIPLE-QUANTIFICATIONS");
        $kw211$WFF_CHECK_ = SubLObjectFactory.makeKeyword("WFF-CHECK?");
        $kw212$SEMANTIC_MT = SubLObjectFactory.makeKeyword("SEMANTIC-MT");
        $kw213$PARSING_MT = SubLObjectFactory.makeKeyword("PARSING-MT");
        $kw214$FORCE = SubLObjectFactory.makeKeyword("FORCE");
        $kw215$DECLARATIVE = SubLObjectFactory.makeKeyword("DECLARATIVE");
        $sym216$MEMOIZATION_STATE_P = SubLObjectFactory.makeSymbol("MEMOIZATION-STATE-P");
        $sym217$PARSE_A_SENTENCE_COMPLETELY = SubLObjectFactory.makeSymbol("PARSE-A-SENTENCE-COMPLETELY");
        $list218 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("&OPTIONAL"), (SubLObject)SubLObjectFactory.makeSymbol("PROPERTIES"));
        $str219$This_function_returns_all_the_dec = SubLObjectFactory.makeString("This function returns all the declarative (statement) parses for a given sentence.  It returns full \n   CycL sentences, but does no wff-checking of the results.\n   @param SENTENCE string\n   @param MT microtheory\n   @param PROPERTIES property-listp");
        $list220 = ConsesLow.list((SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("SENTENCE"), (SubLObject)SubLObjectFactory.makeSymbol("STRINGP")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("MT"), (SubLObject)SubLObjectFactory.makeSymbol("HLMT?")), (SubLObject)ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("PROPERTIES"), (SubLObject)SubLObjectFactory.makeSymbol("PROPERTY-LIST-P")));
        $list221 = ConsesLow.list((SubLObject)SubLObjectFactory.makeSymbol("LISTP"));
        $str222$_ = SubLObjectFactory.makeString("?");
        $kw223$QUERY = SubLObjectFactory.makeKeyword("QUERY");
        $sym224$PARSE_A_QUESTION_COMPLETELY = SubLObjectFactory.makeSymbol("PARSE-A-QUESTION-COMPLETELY");
        $str225$This_function_returns_all_the_que = SubLObjectFactory.makeString("This function returns all the question parses for a given sentence.  It returns full CycL sentences,\n   but does no wff-checking of the results.\n   @param SENTENCE string\n   @param MT microtheory\n   @param PROPERTIES property-list-p");
        $str226$RTP_is_not_initialized___So__test = SubLObjectFactory.makeString("RTP is not initialized.  So, tests for PARSE-A-SENTENCE-COMPLETELY will not be run.");
        $str227$RTP_is_not_initialized___So__test = SubLObjectFactory.makeString("RTP is not initialized.  So, tests for PARSE-A-QUESTION-COMPLETELY will not be run.");
    }

    public static final class $parse_result_native extends SubLStructNative
    {
        public SubLObject $original;
        public SubLObject $constituents;
        public SubLObject $eliminated;
        public SubLObject $problems;
        public SubLObject $solutions;
        private static final SubLStructDeclNative structDecl;

        public $parse_result_native() {
            this.$original = (SubLObject)CommonSymbols.NIL;
            this.$constituents = (SubLObject)CommonSymbols.NIL;
            this.$eliminated = (SubLObject)CommonSymbols.NIL;
            this.$problems = (SubLObject)CommonSymbols.NIL;
            this.$solutions = (SubLObject)CommonSymbols.NIL;
        }

        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$parse_result_native.structDecl;
        }

        @Override
		public SubLObject getField2() {
            return this.$original;
        }

        @Override
		public SubLObject getField3() {
            return this.$constituents;
        }

        @Override
		public SubLObject getField4() {
            return this.$eliminated;
        }

        @Override
		public SubLObject getField5() {
            return this.$problems;
        }

        @Override
		public SubLObject getField6() {
            return this.$solutions;
        }

        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$original = value;
        }

        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$constituents = value;
        }

        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$eliminated = value;
        }

        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$problems = value;
        }

        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$solutions = value;
        }

        static {
            structDecl = Structures.makeStructDeclNative((Class)$parse_result_native.class, rkf_text_processors.$sym7$PARSE_RESULT, rkf_text_processors.$sym8$PARSE_RESULT_P, rkf_text_processors.$list9, rkf_text_processors.$list10, new String[] { "$original", "$constituents", "$eliminated", "$problems", "$solutions" }, rkf_text_processors.$list11, rkf_text_processors.$list12, rkf_text_processors.$sym13$PRINT_PARSE_RESULT);
        }
    }

    public static final class $parse_result_p$UnaryFunction extends UnaryFunction
    {
        public $parse_result_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PARSE-RESULT-P"));
        }

        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return rkf_text_processors.parse_result_p(arg1);
        }
    }

    public static final class $parse_module_definition_native extends SubLStructNative
    {
        public SubLObject $name;
        public SubLObject $category;
        public SubLObject $quality;
        public SubLObject $entry_point;
        public SubLObject $cost;
        public SubLObject $expected_expansions;
        public SubLObject $supplants;
        private static final SubLStructDeclNative structDecl;

        public $parse_module_definition_native() {
            this.$name = (SubLObject)CommonSymbols.NIL;
            this.$category = (SubLObject)CommonSymbols.NIL;
            this.$quality = (SubLObject)CommonSymbols.NIL;
            this.$entry_point = (SubLObject)CommonSymbols.NIL;
            this.$cost = (SubLObject)CommonSymbols.NIL;
            this.$expected_expansions = (SubLObject)CommonSymbols.NIL;
            this.$supplants = (SubLObject)CommonSymbols.NIL;
        }

        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$parse_module_definition_native.structDecl;
        }

        @Override
		public SubLObject getField2() {
            return this.$name;
        }

        @Override
		public SubLObject getField3() {
            return this.$category;
        }

        @Override
		public SubLObject getField4() {
            return this.$quality;
        }

        @Override
		public SubLObject getField5() {
            return this.$entry_point;
        }

        @Override
		public SubLObject getField6() {
            return this.$cost;
        }

        @Override
		public SubLObject getField7() {
            return this.$expected_expansions;
        }

        @Override
		public SubLObject getField8() {
            return this.$supplants;
        }

        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$name = value;
        }

        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$category = value;
        }

        @Override
		public SubLObject setField4(final SubLObject value) {
            return this.$quality = value;
        }

        @Override
		public SubLObject setField5(final SubLObject value) {
            return this.$entry_point = value;
        }

        @Override
		public SubLObject setField6(final SubLObject value) {
            return this.$cost = value;
        }

        @Override
		public SubLObject setField7(final SubLObject value) {
            return this.$expected_expansions = value;
        }

        @Override
		public SubLObject setField8(final SubLObject value) {
            return this.$supplants = value;
        }

        static {
            structDecl = Structures.makeStructDeclNative((Class)$parse_module_definition_native.class, rkf_text_processors.$sym70$PARSE_MODULE_DEFINITION, rkf_text_processors.$sym71$PARSE_MODULE_DEFINITION_P, rkf_text_processors.$list72, rkf_text_processors.$list73, new String[] { "$name", "$category", "$quality", "$entry_point", "$cost", "$expected_expansions", "$supplants" }, rkf_text_processors.$list74, rkf_text_processors.$list75, rkf_text_processors.$sym76$PMD_PRINT);
        }
    }

    public static final class $parse_module_definition_p$UnaryFunction extends UnaryFunction
    {
        public $parse_module_definition_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PARSE-MODULE-DEFINITION-P"));
        }

        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return rkf_text_processors.parse_module_definition_p(arg1);
        }
    }

    public static final class $parse_module_group_native extends SubLStructNative
    {
        public SubLObject $category;
        public SubLObject $tools;
        private static final SubLStructDeclNative structDecl;

        public $parse_module_group_native() {
            this.$category = (SubLObject)CommonSymbols.NIL;
            this.$tools = (SubLObject)CommonSymbols.NIL;
        }

        @Override
		public SubLStructDecl getStructDecl() {
            return (SubLStructDecl)$parse_module_group_native.structDecl;
        }

        @Override
		public SubLObject getField2() {
            return this.$category;
        }

        @Override
		public SubLObject getField3() {
            return this.$tools;
        }

        @Override
		public SubLObject setField2(final SubLObject value) {
            return this.$category = value;
        }

        @Override
		public SubLObject setField3(final SubLObject value) {
            return this.$tools = value;
        }

        static {
            structDecl = Structures.makeStructDeclNative((Class)$parse_module_group_native.class, rkf_text_processors.$sym107$PARSE_MODULE_GROUP, rkf_text_processors.$sym108$PARSE_MODULE_GROUP_P, rkf_text_processors.$list109, rkf_text_processors.$list110, new String[] { "$category", "$tools" }, rkf_text_processors.$list111, rkf_text_processors.$list112, rkf_text_processors.$sym113$DEFAULT_STRUCT_PRINT_FUNCTION);
        }
    }

    public static final class $parse_module_group_p$UnaryFunction extends UnaryFunction
    {
        public $parse_module_group_p$UnaryFunction() {
            super(SubLTranslatedFile.extractFunctionNamed("PARSE-MODULE-GROUP-P"));
        }

        @Override
		public SubLObject processItem(final SubLObject arg1) {
            return rkf_text_processors.parse_module_group_p(arg1);
        }
    }
}

/*

	Total time: 1876 ms

*/