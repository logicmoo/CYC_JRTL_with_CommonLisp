package com.cyc.cycjava.cycl.rtp;


import com.cyc.cycjava.cycl.backward;
import com.cyc.cycjava.cycl.document;
import com.cyc.cycjava.cycl.file_hash_table;
import com.cyc.cycjava.cycl.file_utilities;
import com.cyc.cycjava.cycl.genls;
import com.cyc.cycjava.cycl.isa;
import com.cyc.cycjava.cycl.lexicon_accessors;
import com.cyc.cycjava.cycl.lexicon_cache;
import com.cyc.cycjava.cycl.lexicon_utilities;
import com.cyc.cycjava.cycl.lexicon_vars;
import com.cyc.cycjava.cycl.list_utilities;
import com.cyc.cycjava.cycl.memoization_state;
import com.cyc.cycjava.cycl.mt_relevance_macros;
import com.cyc.cycjava.cycl.nart_handles;
import com.cyc.cycjava.cycl.number_utilities;
import com.cyc.cycjava.cycl.parsing_utilities;
import com.cyc.cycjava.cycl.pos_tagger;
import com.cyc.cycjava.cycl.pph_methods_lexicon;
import com.cyc.cycjava.cycl.rkf_string_weeders;
import com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders;
import com.cyc.cycjava.cycl.set;
import com.cyc.cycjava.cycl.string_utilities;
import com.cyc.cycjava.cycl.string_utilities_lexical;
import com.cyc.cycjava.cycl.subl_promotions;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Errors;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Mapping;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sort;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLSpecialOperatorDeclarations;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDecl;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLStructDeclNative;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.SubLThread;
import com.cyc.tool.subl.jrtl.nativeCode.subLisp.UnaryFunction;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLList;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObject;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLProcess;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLString;
import com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLStructNative;
import com.cyc.tool.subl.jrtl.nativeCode.type.number.SubLFloat;
import com.cyc.tool.subl.jrtl.nativeCode.type.symbol.SubLSymbol;
import com.cyc.tool.subl.jrtl.translatedCode.sublisp.visitation;
import com.cyc.tool.subl.util.SubLFile;
import com.cyc.tool.subl.util.SubLTrampolineFile;
import com.cyc.tool.subl.util.SubLTranslatedFile;
import org.armedbear.lisp.Lisp;

import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.$catch_error_message_target$;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQ;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUAL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.EQUALP;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.FIVE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.IDENTITY;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.NIL;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ONE_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.T;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.TWO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.UNPROVIDED;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.CommonSymbols.ZERO_INTEGER;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Equality.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Functions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Numbers.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Sequences.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Structures.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Symbols.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Values.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Vectors.*;
import static com.cyc.tool.subl.jrtl.nativeCode.type.core.SubLObjectFactory.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.conses_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.$print_object_method_table$;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;
import static com.cyc.tool.subl.util.SubLTranslatedFile.*;


public final class rtp_constituent_weeders extends SubLTranslatedFile {
    public static final SubLFile me = new rtp_constituent_weeders();

    public static final String myName = "com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders";

    public static final String myFingerPrint = "63db07a3ca69690769326756ea2710a3f389c99b41158af658bf13f1e73e463f";

    // deflexical
    // Definitions
    // punctuation markers that can't appear the end of a VP
    private static final SubLSymbol $invalid_tp_vp_end_punctuation$ = makeSymbol("*INVALID-TP-VP-END-PUNCTUATION*");

    // deflexical
    private static final SubLSymbol $valid_tp_non_starting_sentential_markers$ = makeSymbol("*VALID-TP-NON-STARTING-SENTENTIAL-MARKERS*");

    // defparameter
    private static final SubLSymbol $rtp_ranking_data_dir$ = makeSymbol("*RTP-RANKING-DATA-DIR*");

    // deflexical
    private static final SubLSymbol $cat_prior_file$ = makeSymbol("*CAT-PRIOR-FILE*");

    // deflexical
    private static final SubLSymbol $tag1_cond_cat_file$ = makeSymbol("*TAG1-COND-CAT-FILE*");

    // deflexical
    private static final SubLSymbol $tag2_cond_cat_tag1_file$ = makeSymbol("*TAG2-COND-CAT-TAG1-FILE*");

    // deflexical
    private static final SubLSymbol $tag3_cond_cat_tag12_file$ = makeSymbol("*TAG3-COND-CAT-TAG12-FILE*");

    // deflexical
    private static final SubLSymbol $tag_cond_tag_file$ = makeSymbol("*TAG-COND-TAG-FILE*");

    // deflexical
    private static final SubLSymbol $cat_cond_last_tag_file$ = makeSymbol("*CAT-COND-LAST-TAG-FILE*");



    // deflexical
    private static final SubLSymbol $tag1_cond_cat$ = makeSymbol("*TAG1-COND-CAT*");

    // deflexical
    private static final SubLSymbol $tag2_cond_cat_tag1$ = makeSymbol("*TAG2-COND-CAT-TAG1*");

    // deflexical
    private static final SubLSymbol $tag3_cond_cat_tag12$ = makeSymbol("*TAG3-COND-CAT-TAG12*");







    // defconstant
    public static final SubLSymbol $dtp_itp_semantics$ = makeSymbol("*DTP-ITP-SEMANTICS*");



    // defparameter
    public static final SubLSymbol $use_new_tp_possible_constitP$ = makeSymbol("*USE-NEW-TP-POSSIBLE-CONSTIT?*");

    // defparameter
    /**
     * a list of strings which are possible contractions (or parts thereof, such as
     * '
     */
    private static final SubLSymbol $rtp_contraction_elements$ = makeSymbol("*RTP-CONTRACTION-ELEMENTS*");

    // deflexical
    private static final SubLSymbol $confusing_np_start_strings$ = makeSymbol("*CONFUSING-NP-START-STRINGS*");

    // deflexical
    private static final SubLSymbol $confusing_nbar_start_strings$ = makeSymbol("*CONFUSING-NBAR-START-STRINGS*");



    // deflexical
    private static final SubLSymbol $prepositional_category_templates$ = makeSymbol("*PREPOSITIONAL-CATEGORY-TEMPLATES*");

    // defparameter
    /**
     * The mapping between template-categories and open-minds syntactic categories
     */
    private static final SubLSymbol $template_to_om_category_mappings$ = makeSymbol("*TEMPLATE-TO-OM-CATEGORY-MAPPINGS*");

    // Internal Constants
    public static final SubLList $list0 = list(makeString("("));

    public static final SubLList $list1 = list(makeString("%"));

    public static final SubLString $str2$data_rkf_parse_ranking_ = makeString("data/rkf/parse-ranking/");

    public static final SubLString $str3$cat_prior = makeString("cat_prior");

    public static final SubLString $str4$tag1_cond_cat = makeString("tag1_cond_cat");

    public static final SubLString $str5$tag2_cond_cat_tag1 = makeString("tag2_cond_cat_tag1");

    public static final SubLString $str6$tag3_cond_cat_tag12 = makeString("tag3_cond_cat_tag12");

    public static final SubLString $str7$tag_cond_tag = makeString("tag_cond_tag");

    public static final SubLString $str8$cat_cond_last_tag = makeString("cat_cond_last_tag");

    public static final SubLSymbol $cat_prior$ = makeSymbol("*CAT-PRIOR*");

    public static final SubLSymbol $sym10$_TAG1_COND_CAT_ = makeSymbol("*TAG1-COND-CAT*");

    public static final SubLSymbol $sym11$_TAG2_COND_CAT_TAG1_ = makeSymbol("*TAG2-COND-CAT-TAG1*");

    public static final SubLSymbol $sym12$_TAG3_COND_CAT_TAG12_ = makeSymbol("*TAG3-COND-CAT-TAG12*");

    public static final SubLSymbol $tag_cond_tag$ = makeSymbol("*TAG-COND-TAG*");

    public static final SubLSymbol $cat_cond_last_tag$ = makeSymbol("*CAT-COND-LAST-TAG*");

    public static final SubLSymbol $tagger$ = makeSymbol("*TAGGER*");

    public static final SubLSymbol ITP_SEMANTICS = makeSymbol("ITP-SEMANTICS");

    public static final SubLSymbol ITP_SEMANTICS_P = makeSymbol("ITP-SEMANTICS-P");

    public static final SubLList $list18 = list(makeSymbol("CYCL"), makeSymbol("CATEGORY"), makeSymbol("FORCE"), makeSymbol("SUPPORTS"), makeSymbol("CONFIDENCE"));

    public static final SubLList $list19 = list(makeKeyword("CYCL"), makeKeyword("CATEGORY"), makeKeyword("FORCE"), makeKeyword("SUPPORTS"), makeKeyword("CONFIDENCE"));

    public static final SubLList $list20 = list(makeSymbol("ITP-SEMANTICS-CYCL"), makeSymbol("ITP-SEMANTICS-CATEGORY"), makeSymbol("ITP-SEMANTICS-FORCE"), makeSymbol("ITP-SEMANTICS-SUPPORTS"), makeSymbol("ITP-SEMANTICS-CONFIDENCE"));

    public static final SubLList $list21 = list(makeSymbol("_CSETF-ITP-SEMANTICS-CYCL"), makeSymbol("_CSETF-ITP-SEMANTICS-CATEGORY"), makeSymbol("_CSETF-ITP-SEMANTICS-FORCE"), makeSymbol("_CSETF-ITP-SEMANTICS-SUPPORTS"), makeSymbol("_CSETF-ITP-SEMANTICS-CONFIDENCE"));

    public static final SubLSymbol PRINT_ITP_SEMANTICS = makeSymbol("PRINT-ITP-SEMANTICS");

    public static final SubLSymbol ITP_SEMANTICS_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("ITP-SEMANTICS-PRINT-FUNCTION-TRAMPOLINE");

    private static final SubLList $list24 = list(makeSymbol("OPTIMIZE-FUNCALL"), makeSymbol("ITP-SEMANTICS-P"));

    private static final SubLSymbol ITP_SEMANTICS_CYCL = makeSymbol("ITP-SEMANTICS-CYCL");

    private static final SubLSymbol _CSETF_ITP_SEMANTICS_CYCL = makeSymbol("_CSETF-ITP-SEMANTICS-CYCL");

    private static final SubLSymbol ITP_SEMANTICS_CATEGORY = makeSymbol("ITP-SEMANTICS-CATEGORY");

    private static final SubLSymbol _CSETF_ITP_SEMANTICS_CATEGORY = makeSymbol("_CSETF-ITP-SEMANTICS-CATEGORY");

    private static final SubLSymbol ITP_SEMANTICS_FORCE = makeSymbol("ITP-SEMANTICS-FORCE");

    private static final SubLSymbol _CSETF_ITP_SEMANTICS_FORCE = makeSymbol("_CSETF-ITP-SEMANTICS-FORCE");

    private static final SubLSymbol ITP_SEMANTICS_SUPPORTS = makeSymbol("ITP-SEMANTICS-SUPPORTS");

    private static final SubLSymbol _CSETF_ITP_SEMANTICS_SUPPORTS = makeSymbol("_CSETF-ITP-SEMANTICS-SUPPORTS");

    private static final SubLSymbol ITP_SEMANTICS_CONFIDENCE = makeSymbol("ITP-SEMANTICS-CONFIDENCE");

    private static final SubLSymbol _CSETF_ITP_SEMANTICS_CONFIDENCE = makeSymbol("_CSETF-ITP-SEMANTICS-CONFIDENCE");











    private static final SubLString $str40$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");



    private static final SubLSymbol MAKE_ITP_SEMANTICS = makeSymbol("MAKE-ITP-SEMANTICS");





    private static final SubLSymbol VISIT_DEFSTRUCT_OBJECT_ITP_SEMANTICS_METHOD = makeSymbol("VISIT-DEFSTRUCT-OBJECT-ITP-SEMANTICS-METHOD");

    private static final SubLString $str46$__ITP_SEMANTICS__CYCL_ = makeString("#<ITP-SEMANTICS: CYCL:");

    public static final SubLString $$$_ = makeString(" ");



    private static final SubLString $str49$CAT_ = makeString("CAT:");

    private static final SubLString $str50$FORCE_ = makeString("FORCE:");

    private static final SubLString $str51$SUPPORTS_ = makeString("SUPPORTS:");

    private static final SubLString $str52$CONFIDENCE_ = makeString("CONFIDENCE:");

    private static final SubLString $str53$_ = makeString(">");

    private static final SubLFloat $float$0_5 = makeDouble(0.5);

    private static final SubLSymbol RTP_VBAR_TEMPLATES_CACHED = makeSymbol("RTP-VBAR-TEMPLATES-CACHED");



    private static final SubLObject $$EverythingPSC = reader_make_constant_shell(makeString("EverythingPSC"));

    private static final SubLObject $$VBarTemplate = reader_make_constant_shell(makeString("VBarTemplate"));

    private static final SubLSymbol $rtp_vbar_templates_cached_caching_state$ = makeSymbol("*RTP-VBAR-TEMPLATES-CACHED-CACHING-STATE*");

    private static final SubLObject $$NPTemplate = reader_make_constant_shell(makeString("NPTemplate"));

    private static final SubLObject $$VPTemplate = reader_make_constant_shell(makeString("VPTemplate"));

    private static final SubLObject $$NumberTemplate = reader_make_constant_shell(makeString("NumberTemplate"));

    private static final SubLObject $$OrdinalTemplate = reader_make_constant_shell(makeString("OrdinalTemplate"));

    private static final SubLObject $$QuantityTemplate = reader_make_constant_shell(makeString("QuantityTemplate"));

    private static final SubLObject $$AdjPTemplate = reader_make_constant_shell(makeString("AdjPTemplate"));

    private static final SubLObject $$AdjPTemplate_Predicative = reader_make_constant_shell(makeString("AdjPTemplate-Predicative"));

    private static final SubLObject $$STemplate = reader_make_constant_shell(makeString("STemplate"));

    private static final SubLList $list68 = list(reader_make_constant_shell(makeString("QuestionTemplate")), reader_make_constant_shell(makeString("STemplate")));

    private static final SubLList $list69 = list(reader_make_constant_shell(makeString("NumberTemplate")), reader_make_constant_shell(makeString("RatioTemplate")));

    private static final SubLObject $$NBarTemplate = reader_make_constant_shell(makeString("NBarTemplate"));

    private static final SubLString $str71$_S__S__S___new___S_old___S__ = makeString("~S ~S ~S~% new: ~S old: ~S~%");

    private static final SubLString $$$not = makeString("not");

    private static final SubLString $str73$_ = makeString("'");



    private static final SubLSymbol $sym75$VERBAL_CATEGORY_ = makeSymbol("VERBAL-CATEGORY?");

    private static final SubLList $list76 = list(makeString("-"), makeString("+"), makeString("~"));

    private static final SubLSymbol $sym77$STRING_ = makeSymbol("STRING=");



    private static final SubLString $$$how = makeString("how");

    private static final SubLList $list80 = list(makeString("as"), makeString("between"));

    private static final SubLSymbol $quantity_strings$ = makeSymbol("*QUANTITY-STRINGS*");





    private static final SubLObject $$PhysicalPartOfObject = reader_make_constant_shell(makeString("PhysicalPartOfObject"));



    public static final SubLList $list86 = list(reader_make_constant_shell(makeString("isa")), makeKeyword("X"), reader_make_constant_shell(makeString("IntervalOnNumberLine")));

    private static final SubLObject $$InferencePSC = reader_make_constant_shell(makeString("InferencePSC"));

    private static final SubLObject $$LogicalField = reader_make_constant_shell(makeString("LogicalField"));

    private static final SubLList $list89 = list(reader_make_constant_shell(makeString("PPByTemplate")), reader_make_constant_shell(makeString("PPTemplate")), reader_make_constant_shell(makeString("PPForTemplate")), reader_make_constant_shell(makeString("PPTemporalTemplate")), reader_make_constant_shell(makeString("PPTemporalDurationTemplate")));

    private static final SubLObject $$gerund = reader_make_constant_shell(makeString("gerund"));

    private static final SubLList $list91 = list(new SubLObject[]{ list(reader_make_constant_shell(makeString("NPTemplate")), makeKeyword("WHNP"), makeKeyword("NNP")), list(reader_make_constant_shell(makeString("PPTempate")), makeKeyword("PP"), makeKeyword("WHPP")), list(reader_make_constant_shell(makeString("PPTempate")), makeKeyword("PP"), makeKeyword("WHPP")), list(reader_make_constant_shell(makeString("STemplate")), makeKeyword("S")), list(reader_make_constant_shell(makeString("VPTemplate")), makeKeyword("VP")), list(reader_make_constant_shell(makeString("ProgressiveVPTemplate")), makeKeyword("VP")), list(reader_make_constant_shell(makeString("PerfectiveVPTemplate")), makeKeyword("VP")), list(reader_make_constant_shell(makeString("AdvPTemplate")), makeKeyword("ADVP"), makeKeyword("WHADVP")), list(reader_make_constant_shell(makeString("AdjPTemplate")), makeKeyword("ADJP"), makeKeyword("WHADJP")), list(reader_make_constant_shell(makeString("AdjPTemplate-Predicative")), makeKeyword("ADJP"), makeKeyword("WHADJP")), list(reader_make_constant_shell(makeString("ImperativeTemplate")), makeKeyword("S")), list(reader_make_constant_shell(makeString("InfinitivalVBarTemplate")), makeKeyword("VP")), list(reader_make_constant_shell(makeString("InfinitivalVPTemplate")), makeKeyword("VP")), list(reader_make_constant_shell(makeString("PassiveVBarTemplate")), makeKeyword("VP")), list(reader_make_constant_shell(makeString("PastTenseTemplate")), makeKeyword("VP")), list(reader_make_constant_shell(makeString("PastTenseVBarTemplate")), makeKeyword("VP")), list(reader_make_constant_shell(makeString("PerfectiveVBarTemplate")), makeKeyword("VP")), list(reader_make_constant_shell(makeString("PerfectiveVPTemplate")), makeKeyword("VP")), list(reader_make_constant_shell(makeString("NPTemporalTemplate")), makeKeyword("NNP")), list(reader_make_constant_shell(makeString("PossessiveTemplate")), makeKeyword("NNP")), list(reader_make_constant_shell(makeString("PresentTenseVBarTemplate")), makeKeyword("VP")), list(reader_make_constant_shell(makeString("ProgressiveVBarTemplate")), makeKeyword("VP")), list(reader_make_constant_shell(makeString("ProgressiveVPTemplate")), makeKeyword("VP")), list(reader_make_constant_shell(makeString("PPByTemplate")), makeKeyword("PP"), makeKeyword("WHPP")), list(reader_make_constant_shell(makeString("PPForTemplate")), makeKeyword("PP"), makeKeyword("WHPP")), list(reader_make_constant_shell(makeString("PPTemporalDurationTemplate")), makeKeyword("PP"), makeKeyword("WHPP")), list(reader_make_constant_shell(makeString("QuantityTemplate")), makeKeyword("NNP")), list(reader_make_constant_shell(makeString("QuestionTemplate")), makeKeyword("S")), list(reader_make_constant_shell(makeString("RTPTensedVBarTemplate")), makeKeyword("VP")), list(reader_make_constant_shell(makeString("RTPUntensedVBarTemplate")), makeKeyword("VP")), list(reader_make_constant_shell(makeString("PPTemporalTemplate")), makeKeyword("PP"), makeKeyword("WHPP")), list(reader_make_constant_shell(makeString("TemporalTemplate")), makeKeyword("NNP"), makeKeyword("PP")), list(reader_make_constant_shell(makeString("VBarTemplate")), makeKeyword("VP")) });

    public static final SubLList $list92 = list(makeString("X"));

    private static final SubLString $$$fht = makeString("fht");



    private static final SubLString $str95$_a__parse_ranking_will_not_be_ava = makeString("~a, parse ranking will not be available");

    private static final SubLString $str96$Couldn_t_finalize_file_hashtable_ = makeString("Couldn't finalize file hashtable ~a");

    private static final SubLList $list97 = list(makeSymbol("*CAT-PRIOR*"), makeSymbol("*TAG1-COND-CAT*"), makeSymbol("*TAG2-COND-CAT-TAG1*"), makeSymbol("*TAG3-COND-CAT-TAG12*"), makeSymbol("*TAG-COND-TAG*"), makeSymbol("*CAT-COND-LAST-TAG*"));

    private static final SubLSymbol $IGNORE_ERRORS_TARGET = makeKeyword("IGNORE-ERRORS-TARGET");

    private static final SubLSymbol IGNORE_ERRORS_HANDLER = makeSymbol("IGNORE-ERRORS-HANDLER", "SUBLISP");





    private static final SubLSymbol $sym102$_ = makeSymbol("<");

    private static final SubLSymbol RESULT_OF_PARSING_START = makeSymbol("RESULT-OF-PARSING-START");



    private static final SubLSymbol PHRASE_P = makeSymbol("PHRASE-P");

    private static final SubLSymbol WORD_CATEGORY = makeSymbol("WORD-CATEGORY");



    private static final SubLString $str108$RTP_RANK_PARSES_triggered_an_erro = makeString("RTP-RANK-PARSES triggered an error.");

    public static SubLObject itp_semantics_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        print_itp_semantics(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject itp_semantics_p(final SubLObject v_object) {
        return v_object.getClass() == rtp_constituent_weeders.$itp_semantics_native.class ? T : NIL;
    }

    public static SubLObject itp_semantics_cycl(final SubLObject v_object) {
        assert NIL != itp_semantics_p(v_object) : "rtp_constituent_weeders.itp_semantics_p(v_object) " + "CommonSymbols.NIL != rtp_constituent_weeders.itp_semantics_p(v_object) " + v_object;
        return v_object.getField2();
    }

    public static SubLObject itp_semantics_category(final SubLObject v_object) {
        assert NIL != itp_semantics_p(v_object) : "rtp_constituent_weeders.itp_semantics_p(v_object) " + "CommonSymbols.NIL != rtp_constituent_weeders.itp_semantics_p(v_object) " + v_object;
        return v_object.getField3();
    }

    public static SubLObject itp_semantics_force(final SubLObject v_object) {
        assert NIL != itp_semantics_p(v_object) : "rtp_constituent_weeders.itp_semantics_p(v_object) " + "CommonSymbols.NIL != rtp_constituent_weeders.itp_semantics_p(v_object) " + v_object;
        return v_object.getField4();
    }

    public static SubLObject itp_semantics_supports(final SubLObject v_object) {
        assert NIL != itp_semantics_p(v_object) : "rtp_constituent_weeders.itp_semantics_p(v_object) " + "CommonSymbols.NIL != rtp_constituent_weeders.itp_semantics_p(v_object) " + v_object;
        return v_object.getField5();
    }

    public static SubLObject itp_semantics_confidence(final SubLObject v_object) {
        assert NIL != itp_semantics_p(v_object) : "rtp_constituent_weeders.itp_semantics_p(v_object) " + "CommonSymbols.NIL != rtp_constituent_weeders.itp_semantics_p(v_object) " + v_object;
        return v_object.getField6();
    }

    public static SubLObject _csetf_itp_semantics_cycl(final SubLObject v_object, final SubLObject value) {
        assert NIL != itp_semantics_p(v_object) : "rtp_constituent_weeders.itp_semantics_p(v_object) " + "CommonSymbols.NIL != rtp_constituent_weeders.itp_semantics_p(v_object) " + v_object;
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_itp_semantics_category(final SubLObject v_object, final SubLObject value) {
        assert NIL != itp_semantics_p(v_object) : "rtp_constituent_weeders.itp_semantics_p(v_object) " + "CommonSymbols.NIL != rtp_constituent_weeders.itp_semantics_p(v_object) " + v_object;
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_itp_semantics_force(final SubLObject v_object, final SubLObject value) {
        assert NIL != itp_semantics_p(v_object) : "rtp_constituent_weeders.itp_semantics_p(v_object) " + "CommonSymbols.NIL != rtp_constituent_weeders.itp_semantics_p(v_object) " + v_object;
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_itp_semantics_supports(final SubLObject v_object, final SubLObject value) {
        assert NIL != itp_semantics_p(v_object) : "rtp_constituent_weeders.itp_semantics_p(v_object) " + "CommonSymbols.NIL != rtp_constituent_weeders.itp_semantics_p(v_object) " + v_object;
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_itp_semantics_confidence(final SubLObject v_object, final SubLObject value) {
        assert NIL != itp_semantics_p(v_object) : "rtp_constituent_weeders.itp_semantics_p(v_object) " + "CommonSymbols.NIL != rtp_constituent_weeders.itp_semantics_p(v_object) " + v_object;
        return v_object.setField6(value);
    }

    public static SubLObject make_itp_semantics(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new rtp_constituent_weeders.$itp_semantics_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($CYCL)) {
                _csetf_itp_semantics_cycl(v_new, current_value);
            } else
                if (pcase_var.eql($CATEGORY)) {
                    _csetf_itp_semantics_category(v_new, current_value);
                } else
                    if (pcase_var.eql($FORCE)) {
                        _csetf_itp_semantics_force(v_new, current_value);
                    } else
                        if (pcase_var.eql($SUPPORTS)) {
                            _csetf_itp_semantics_supports(v_new, current_value);
                        } else
                            if (pcase_var.eql($CONFIDENCE)) {
                                _csetf_itp_semantics_confidence(v_new, current_value);
                            } else {
                                Errors.error($str40$Invalid_slot__S_for_construction_, current_arg);
                            }




        }
        return v_new;
    }

    public static SubLObject visit_defstruct_itp_semantics(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, MAKE_ITP_SEMANTICS, FIVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $CYCL, itp_semantics_cycl(obj));
        funcall(visitor_fn, obj, $SLOT, $CATEGORY, itp_semantics_category(obj));
        funcall(visitor_fn, obj, $SLOT, $FORCE, itp_semantics_force(obj));
        funcall(visitor_fn, obj, $SLOT, $SUPPORTS, itp_semantics_supports(obj));
        funcall(visitor_fn, obj, $SLOT, $CONFIDENCE, itp_semantics_confidence(obj));
        funcall(visitor_fn, obj, $END, MAKE_ITP_SEMANTICS, FIVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_itp_semantics_method(final SubLObject obj, final SubLObject visitor_fn) {
        return visit_defstruct_itp_semantics(obj, visitor_fn);
    }

    public static SubLObject print_itp_semantics(final SubLObject itp, final SubLObject stream, final SubLObject depth) {
        final SubLObject cycl = itp_semantics_cycl(itp);
        final SubLObject category = itp_semantics_category(itp);
        final SubLObject force = itp_semantics_force(itp);
        final SubLObject supports = itp_semantics_supports(itp);
        final SubLObject confidence = itp_semantics_confidence(itp);
        write_string($str46$__ITP_SEMANTICS__CYCL_, stream, UNPROVIDED, UNPROVIDED);
        princ(cycl, stream);
        write_string($$$_, stream, UNPROVIDED, UNPROVIDED);
        if (category != $UNAVAILABLE) {
            write_string($str49$CAT_, stream, UNPROVIDED, UNPROVIDED);
            princ(category, stream);
            write_string($$$_, stream, UNPROVIDED, UNPROVIDED);
        }
        if (force != $UNAVAILABLE) {
            write_string($str50$FORCE_, stream, UNPROVIDED, UNPROVIDED);
            princ(force, stream);
            write_string($$$_, stream, UNPROVIDED, UNPROVIDED);
        }
        if (supports != $UNAVAILABLE) {
            write_string($str51$SUPPORTS_, stream, UNPROVIDED, UNPROVIDED);
            princ(supports, stream);
            write_string($$$_, stream, UNPROVIDED, UNPROVIDED);
        }
        if (confidence != $UNAVAILABLE) {
            write_string($str52$CONFIDENCE_, stream, UNPROVIDED, UNPROVIDED);
            princ(confidence, stream);
            write_string($$$_, stream, UNPROVIDED, UNPROVIDED);
        }
        write_string($str53$_, stream, UNPROVIDED, UNPROVIDED);
        return itp;
    }

    public static SubLObject new_itp_semantics(final SubLObject cycl, SubLObject category, SubLObject force, SubLObject supports, SubLObject confidence) {
        if (category == UNPROVIDED) {
            category = $UNAVAILABLE;
        }
        if (force == UNPROVIDED) {
            force = $UNAVAILABLE;
        }
        if (supports == UNPROVIDED) {
            supports = $UNAVAILABLE;
        }
        if (confidence == UNPROVIDED) {
            confidence = $UNAVAILABLE;
        }
        final SubLObject semantics = make_itp_semantics(UNPROVIDED);
        _csetf_itp_semantics_cycl(semantics, cycl);
        _csetf_itp_semantics_category(semantics, category);
        _csetf_itp_semantics_force(semantics, force);
        _csetf_itp_semantics_supports(semantics, supports);
        _csetf_itp_semantics_confidence(semantics, confidence);
        return semantics;
    }

    public static SubLObject new_itp_semantics_conf_1(final SubLObject cycl) {
        final SubLObject result = new_itp_semantics(cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        _csetf_itp_semantics_confidence(result, ONE_INTEGER);
        return result;
    }

    public static SubLObject new_itp_semantics_conf_half(final SubLObject cycl) {
        final SubLObject result = new_itp_semantics(cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        _csetf_itp_semantics_confidence(result, $float$0_5);
        return result;
    }

    public static SubLObject rtp_parse_exp_ranked(final SubLObject string, final SubLObject template, final SubLObject mt) {
        return rtp_rank_parses(string, iterative_template_parser.rtp_parse_exp(string, template, mt, UNPROVIDED));
    }

    public static SubLObject rtp_vbar_templates() {
        return NIL != kb_loaded() ? rtp_vbar_templates_cached() : NIL;
    }

    public static SubLObject clear_rtp_vbar_templates_cached() {
        final SubLObject cs = $rtp_vbar_templates_cached_caching_state$.getGlobalValue();
        if (NIL != cs) {
            memoization_state.caching_state_clear(cs);
        }
        return NIL;
    }

    public static SubLObject remove_rtp_vbar_templates_cached() {
        return memoization_state.caching_state_remove_function_results_with_args($rtp_vbar_templates_cached_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject rtp_vbar_templates_cached_internal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = mt_relevance_macros.$mt$.currentBinding(thread);
        try {
            mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
            ans = genls.all_specs($$VBarTemplate, UNPROVIDED, UNPROVIDED);
        } finally {
            mt_relevance_macros.$mt$.rebind(_prev_bind_2, thread);
            mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static SubLObject rtp_vbar_templates_cached() {
        SubLObject caching_state = $rtp_vbar_templates_cached_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = memoization_state.create_global_caching_state_for_name(RTP_VBAR_TEMPLATES_CACHED, $rtp_vbar_templates_cached_caching_state$, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql(memoization_state.$memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(rtp_vbar_templates_cached_internal()));
            memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return memoization_state.caching_results(results);
    }

    public static SubLObject tp_possible_constitP_old(final SubLObject template_item, final SubLObject words, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = rtp_vars.$rtp_syntactic_mt$.getDynamicValue();
        }
        if (NIL == rtp_type_checkers.rtp_recursive_itemP(template_item)) {
            return T;
        }
        final SubLObject pcase_var;
        final SubLObject category = pcase_var = template_item.first();
        if (pcase_var.eql($$NPTemplate)) {
            if (NIL == tp_valid_np(category, words, UNPROVIDED)) {
                return NIL;
            }
        } else
            if (pcase_var.eql($$VPTemplate)) {
                if (NIL == tp_valid_vp(category, words)) {
                    return NIL;
                }
            } else
                if (pcase_var.eql($$NumberTemplate)) {
                    if (NIL == tp_valid_number_p(words)) {
                        return NIL;
                    }
                } else
                    if (pcase_var.eql($$OrdinalTemplate)) {
                        if (NIL == tp_valid_number_p(words)) {
                            return NIL;
                        }
                    } else
                        if (pcase_var.eql($$QuantityTemplate)) {
                            if (NIL == tp_valid_quantity_p(words)) {
                                return NIL;
                            }
                        } else
                            if (pcase_var.eql($$AdjPTemplate)) {
                                if (NIL == tp_valid_adjpP(words)) {
                                    return NIL;
                                }
                            } else
                                if (pcase_var.eql($$AdjPTemplate_Predicative)) {
                                    if (NIL == tp_valid_adjp_predP(words)) {
                                        return NIL;
                                    }
                                } else
                                    if (pcase_var.eql($$STemplate) && (NIL == tp_valid_sP(words))) {
                                        return NIL;
                                    }







        if ((NIL != prepositional_categoryP(category)) && (NIL == tp_valid_pp(category, words, mt))) {
            return NIL;
        }
        return T;
    }

    public static SubLObject tp_possible_constitP(final SubLObject template_item, final SubLObject words, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = rtp_vars.$rtp_syntactic_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject category = template_item.first();
        SubLObject possibleP = T;
        if (NIL == $use_new_tp_possible_constitP$.getDynamicValue(thread)) {
            possibleP = tp_possible_constitP_old(template_item, words, mt);
        } else
            if (NIL == rtp_type_checkers.rtp_recursive_itemP(template_item)) {
                possibleP = T;
            } else
                if (((NIL == subl_promotions.memberP(category, $list68, UNPROVIDED, UNPROVIDED)) && (NIL != list_utilities.lengthG(words, ONE_INTEGER, UNPROVIDED))) && (NIL != lexicon_utilities.wh_wordP(words.first()))) {
                    possibleP = makeBoolean(category.eql($$NPTemplate) && (NIL != tp_valid_nbar_wordsP(words.rest(), UNPROVIDED)));
                } else
                    if (category.eql($$NPTemplate)) {
                        possibleP = tp_valid_np(category, words, UNPROVIDED);
                    } else
                        if ((NIL != subl_promotions.memberP(category, $list69, UNPROVIDED, UNPROVIDED)) && (NIL == tp_valid_np(category, words, UNPROVIDED))) {
                            possibleP = NIL;
                        } else
                            if (category.eql($$NBarTemplate)) {
                                possibleP = tp_valid_nbar(category, words, UNPROVIDED);
                            } else
                                if (category.eql($$VPTemplate)) {
                                    possibleP = tp_valid_vp(category, words);
                                } else
                                    if (NIL != member(category, rtp_vbar_templates(), UNPROVIDED, UNPROVIDED)) {
                                        possibleP = tp_valid_vbar(category, words);
                                    } else
                                        if (category.eql($$NumberTemplate)) {
                                            possibleP = tp_valid_number_p(words);
                                        } else
                                            if (category.eql($$OrdinalTemplate)) {
                                                possibleP = tp_valid_number_p(words);
                                            } else
                                                if (category.eql($$QuantityTemplate)) {
                                                    possibleP = tp_valid_quantity_p(words);
                                                } else
                                                    if (category.eql($$AdjPTemplate)) {
                                                        possibleP = tp_valid_adjpP(words);
                                                    } else
                                                        if (category.eql($$AdjPTemplate_Predicative)) {
                                                            possibleP = tp_valid_adjp_predP(words);
                                                        } else
                                                            if (category.eql($$STemplate)) {
                                                                possibleP = tp_valid_sP(words);
                                                            } else
                                                                if (NIL != prepositional_categoryP(category)) {
                                                                    possibleP = tp_valid_pp(category, words, mt);
                                                                }














        if ((((NIL != $use_new_tp_possible_constitP$.getDynamicValue(thread)) && rtp_vars.$rtp_trace_level$.getDynamicValue(thread).isPositive()) && (!possibleP.eql(tp_possible_constitP_old(template_item, words, mt)))) && rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
            recognition.rtp_tracer_output(ONE_INTEGER, list($str71$_S__S__S___new___S_old___S__, template_item, words, mt, possibleP, tp_possible_constitP_old(template_item, words, mt)));
        }
        return possibleP;
    }

    public static SubLObject tp_valid_nbar(final SubLObject category, final SubLObject words, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = rtp_vars.$rtp_syntactic_mt$.getDynamicValue();
        }
        return tp_valid_nbar_wordsP(words, mt);
    }

    public static SubLObject tp_valid_nbar_wordsP(final SubLObject words, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = rtp_vars.$rtp_syntactic_mt$.getDynamicValue();
        }
        if (NIL == words) {
            return T;
        }
        final SubLObject front_word = words.first();
        final SubLObject back_word = last(words, UNPROVIDED).first();
        if ((NIL == valid_tp_nbar_end_stringP(back_word, mt)) || (NIL == valid_tp_nbar_start_stringP(front_word))) {
            return NIL;
        }
        return T;
    }

    public static SubLObject valid_tp_nbar_end_stringP(final SubLObject word, final SubLObject mt) {
        if (NIL != subl_promotions.memberP(word, $valid_tp_non_starting_sentential_markers$.getGlobalValue(), rtp_vars.$tp_equal$.getGlobalValue(), UNPROVIDED)) {
            return T;
        }
        if (NIL != subl_promotions.memberP(word, $invalid_tp_vp_end_punctuation$.getGlobalValue(), rtp_vars.$tp_equal$.getGlobalValue(), UNPROVIDED)) {
            return NIL;
        }
        if (NIL != funcall(rtp_vars.$tp_equal$.getGlobalValue(), word, $$$not)) {
            return NIL;
        }
        return T;
    }

    public static SubLObject valid_tp_nbar_start_stringP(final SubLObject word) {
        if (NIL != subl_promotions.memberP(word, $valid_tp_non_starting_sentential_markers$.getGlobalValue(), rtp_vars.$tp_equal$.getGlobalValue(), UNPROVIDED)) {
            return NIL;
        }
        return possible_tp_nbar_start_stringP(word);
    }

    public static SubLObject tp_valid_np(final SubLObject category, final SubLObject words, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = rtp_vars.$rtp_syntactic_mt$.getDynamicValue();
        }
        return tp_valid_np_wordsP(words, mt);
    }

    public static SubLObject tp_valid_np_wordsP(final SubLObject words, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = rtp_vars.$rtp_syntactic_mt$.getDynamicValue();
        }
        if (NIL == words) {
            return T;
        }
        if (NIL != list_utilities.lengthE(words, ONE_INTEGER, UNPROVIDED)) {
            return tp_valid_single_word_npP(words, mt);
        }
        if (NIL != rkf_string_weeders.rkf_unambiguous_non_possessive_pronoun_stringP(words.first())) {
            return list_utilities.lengthE(words, ONE_INTEGER, UNPROVIDED);
        }
        final SubLObject front_word = words.first();
        final SubLObject back_word = last(words, UNPROVIDED).first();
        if ((NIL == valid_tp_np_end_stringP(back_word, mt)) || (NIL == valid_tp_np_start_stringP(front_word))) {
            return NIL;
        }
        return T;
    }

    public static SubLObject tp_valid_single_word_npP(final SubLObject words, final SubLObject mt) {
        return makeBoolean(((((NIL != rkf_string_weeders.rkf_pronoun_stringP(words.first())) || (NIL != rkf_string_weeders.rkf_noun_stringP(words.first(), mt))) || (NIL != rkf_string_weeders.rkf_name_stringP(words.first(), mt))) || (NIL != rkf_string_weeders.rkf_unknown_stringP(words.first(), mt))) || (NIL != rkf_string_weeders.rkf_number_stringP(words.first())));
    }

    public static SubLObject valid_tp_np_end_stringP(final SubLObject word, final SubLObject mt) {
        if (NIL != subl_promotions.memberP(word, $valid_tp_non_starting_sentential_markers$.getGlobalValue(), rtp_vars.$tp_equal$.getGlobalValue(), UNPROVIDED)) {
            return T;
        }
        if (NIL != subl_promotions.memberP(word, $invalid_tp_vp_end_punctuation$.getGlobalValue(), rtp_vars.$tp_equal$.getGlobalValue(), UNPROVIDED)) {
            return NIL;
        }
        if (NIL != funcall(rtp_vars.$tp_equal$.getGlobalValue(), word, $$$not)) {
            return NIL;
        }
        return possible_tp_np_end_stringP(word, mt);
    }

    public static SubLObject valid_tp_np_start_stringP(final SubLObject word) {
        if (NIL != subl_promotions.memberP(word, $valid_tp_non_starting_sentential_markers$.getGlobalValue(), rtp_vars.$tp_equal$.getGlobalValue(), UNPROVIDED)) {
            return NIL;
        }
        return possible_tp_np_start_stringP(word);
    }

    public static SubLObject tp_valid_sP(final SubLObject words) {
        SubLObject found_a_verbP = NIL;
        SubLObject list_var = NIL;
        SubLObject word = NIL;
        SubLObject i = NIL;
        list_var = words;
        word = list_var.first();
        for (i = ZERO_INTEGER; (NIL == found_a_verbP) && (NIL != list_var); list_var = list_var.rest() , word = list_var.first() , i = add(ONE_INTEGER, i)) {
            if (NIL != rkf_string_weeders.rkf_verb_stringP(word)) {
                found_a_verbP = T;
            } else
                if (word.equal($str73$_)) {
                    final SubLObject next_word = nth(number_utilities.f_1X(i), words);
                    found_a_verbP = rkf_string_weeders.rkf_verb_stringP(cconcatenate(word, next_word));
                }

        }
        return found_a_verbP;
    }

    public static SubLObject tp_valid_vbar(final SubLObject category, final SubLObject words) {
        if (NIL == words) {
            return T;
        }
        final SubLObject front_word = words.first();
        final SubLObject back_word = list_utilities.last_one(words);
        if ((NIL == valid_tp_vp_end_stringP(back_word)) || (NIL == valid_tp_vp_start_stringP(front_word))) {
            return NIL;
        }
        SubLObject list_var = NIL;
        SubLObject word = NIL;
        SubLObject i = NIL;
        list_var = words;
        word = list_var.first();
        for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , word = list_var.first() , i = add(ONE_INTEGER, i)) {
            if (NIL != rkf_string_weeders.rkf_verb_stringP(word)) {
                return T;
            }
            if (word.equal($str73$_)) {
                final SubLObject next_word = nth(number_utilities.f_1X(i), words);
                if (NIL != rkf_string_weeders.rkf_verb_stringP(cconcatenate(word, next_word))) {
                    return T;
                }
            }
        }
        return NIL;
    }

    public static SubLObject valid_tp_vbar_start_stringP(final SubLObject word) {
        return valid_tp_vp_start_stringP(word);
    }

    public static SubLObject valid_tp_vbar_end_stringP(final SubLObject word) {
        return valid_tp_vp_end_stringP(word);
    }

    public static SubLObject tp_valid_vp(final SubLObject category, final SubLObject words) {
        if (NIL == words) {
            return T;
        }
        final SubLObject front_word = words.first();
        final SubLObject back_word = last(words, UNPROVIDED).first();
        if ((NIL == valid_tp_vp_end_stringP(back_word)) || (NIL == valid_tp_vp_start_stringP(front_word))) {
            return NIL;
        }
        SubLObject list_var = NIL;
        SubLObject word = NIL;
        SubLObject i = NIL;
        list_var = words;
        word = list_var.first();
        for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , word = list_var.first() , i = add(ONE_INTEGER, i)) {
            if (NIL != rkf_string_weeders.rkf_verb_stringP(word)) {
                return T;
            }
            if (word.equal($str73$_)) {
                final SubLObject next_word = nth(number_utilities.f_1X(i), words);
                if (NIL != rkf_string_weeders.rkf_verb_stringP(cconcatenate(word, next_word))) {
                    return T;
                }
            }
        }
        return NIL;
    }

    public static SubLObject valid_tp_vp_start_stringP(final SubLObject word) {
        if (NIL != rtp_contraction_elementP(word)) {
            return T;
        }
        if (word.equalp($$$not) || ((NIL != rkf_string_weeders.rkf_preposition_stringP(word)) && (NIL == rkf_string_weeders.rkf_verb_stringP(word)))) {
            return NIL;
        }
        return possible_tp_vp_start_stringP(word);
    }

    public static SubLObject valid_tp_vp_end_stringP(final SubLObject word) {
        if (NIL != subl_promotions.memberP(word, $invalid_tp_vp_end_punctuation$.getGlobalValue(), symbol_function(STRING_EQUAL), UNPROVIDED)) {
            return NIL;
        }
        return possible_tp_vp_end_stringP(word);
    }

    public static SubLObject tp_unambiguous_verbP(final SubLObject word, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(((NIL != rkf_string_weeders.rkf_verb_stringP(word)) && (NIL == lexicon_accessors.denots_of_name_string(word, lexicon_vars.$misspellingsP$.getDynamicValue(thread), mt, UNPROVIDED))) && (NIL == list_utilities.sublisp_boolean(list_utilities.find_if_not($sym75$VERBAL_CATEGORY_, lexicon_accessors.pos_of_string(word, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED))));
    }

    public static SubLObject tp_valid_number_p(final SubLObject words) {
        if (((NIL == number_prefix_p(words.first())) && (NIL == string_utilities_lexical.denots_english_number_p(words.first()))) || (NIL == string_utilities_lexical.denots_english_number_p(last(words, UNPROVIDED).first()))) {
            return NIL;
        }
        return T;
    }

    public static SubLObject number_prefix_p(final SubLObject string) {
        return member(string, $list76, $sym77$STRING_, UNPROVIDED);
    }

    public static SubLObject possible_tp_vp_start_stringP(final SubLObject string) {
        return makeBoolean(((NIL != rtp_contraction_elementP(string)) || (NIL != rkf_string_weeders.rkf_verb_stringP(string))) || (NIL != rkf_string_weeders.rkf_adverb_stringP(string)));
    }

    public static SubLObject rtp_contraction_elementP(final SubLObject string) {
        return member(string, get_contraction_elements(), EQUALP, UNPROVIDED);
    }

    public static SubLObject get_contraction_elements() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == $rtp_contraction_elements$.getDynamicValue(thread)) {
            rtp_datastructures.maybe_initialize_rtp_contractions_table(UNPROVIDED);
            SubLObject cdolist_list_var = rtp_datastructures.$rtp_contractions_table$.getDynamicValue(thread);
            SubLObject alist_elt = NIL;
            alist_elt = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$1 = alist_elt.rest().first();
                SubLObject contraction = NIL;
                contraction = cdolist_list_var_$1.first();
                while (NIL != cdolist_list_var_$1) {
                    SubLObject cdolist_list_var_$2 = list_utilities.find_all_if(STRINGP, contraction, UNPROVIDED);
                    SubLObject contraction_elt = NIL;
                    contraction_elt = cdolist_list_var_$2.first();
                    while (NIL != cdolist_list_var_$2) {
                        final SubLObject item_var = contraction_elt;
                        if (NIL == member(item_var, $rtp_contraction_elements$.getDynamicValue(thread), EQUAL, symbol_function(IDENTITY))) {
                            $rtp_contraction_elements$.setDynamicValue(cons(item_var, $rtp_contraction_elements$.getDynamicValue(thread)), thread);
                        }
                        cdolist_list_var_$2 = cdolist_list_var_$2.rest();
                        contraction_elt = cdolist_list_var_$2.first();
                    } 
                    cdolist_list_var_$1 = cdolist_list_var_$1.rest();
                    contraction = cdolist_list_var_$1.first();
                } 
                cdolist_list_var = cdolist_list_var.rest();
                alist_elt = cdolist_list_var.first();
            } 
        }
        return $rtp_contraction_elements$.getDynamicValue(thread);
    }

    public static SubLObject possible_tp_vp_end_stringP(final SubLObject string) {
        return makeBoolean(NIL == impossible_tp_phrase_end_stringP(string));
    }

    public static SubLObject possible_tp_np_start_stringP(final SubLObject string) {
        if (string.equalp($$$how)) {
            return T;
        }
        return makeBoolean((NIL == lexicon_accessors.verb_only_stringP(string)) && ((NIL != confusing_np_start_stringP(string)) || ((NIL == rkf_string_weeders.rkf_preposition_stringP(string)) && (NIL == rkf_string_weeders.rkf_conjunction_stringP(string)))));
    }

    public static SubLObject possible_tp_nbar_start_stringP(final SubLObject string) {
        return makeBoolean((NIL == lexicon_accessors.verb_only_stringP(string)) && ((NIL != confusing_nbar_start_stringP(string)) || (((NIL == rkf_string_weeders.rkf_preposition_stringP(string)) && (NIL == rkf_string_weeders.rkf_determiner_stringP(string))) && (NIL == rkf_string_weeders.rkf_conjunction_stringP(string)))));
    }

    public static SubLObject possible_tp_pp_start_stringP(final SubLObject string) {
        return rkf_string_weeders.rkf_preposition_stringP(string);
    }

    public static SubLObject possible_tp_pp_end_stringP(final SubLObject string, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        return possible_tp_np_end_stringP(string, mt);
    }

    public static SubLObject possible_tp_np_end_stringP(final SubLObject string, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        return makeBoolean(((((NIL != rkf_string_weeders.rkf_pronoun_stringP(string)) || (NIL != rkf_string_weeders.rkf_preposition_stringP(string))) || (NIL != rkf_string_weeders.rkf_noun_stringP(string, mt))) || (NIL != rkf_string_weeders.rkf_number_stringP(string))) || (NIL == lexicon_accessors.closed_lexical_class_stringP(string, UNPROVIDED)));
    }

    public static SubLObject impossible_tp_phrase_end_stringP(final SubLObject string) {
        return makeBoolean(((((((NIL == rkf_string_weeders.rkf_noun_stringP(string, UNPROVIDED)) && (NIL == rkf_string_weeders.rkf_pronoun_stringP(string))) && (NIL == rkf_string_weeders.rkf_verb_stringP(string))) && (NIL == rkf_string_weeders.rkf_adverb_stringP(string))) && (NIL == rkf_string_weeders.rkf_preposition_stringP(string))) && (NIL == rkf_string_weeders.rkf_adjective_stringP(string))) && ((NIL != rkf_string_weeders.rkf_conjunction_stringP(string)) || (NIL != rkf_string_weeders.rkf_determiner_stringP(string))));
    }

    public static SubLObject confusing_np_start_stringP(final SubLObject string) {
        return member(string, $confusing_np_start_strings$.getGlobalValue(), symbol_function(EQUALP), UNPROVIDED);
    }

    public static SubLObject confusing_nbar_start_stringP(final SubLObject string) {
        return member(string, $confusing_nbar_start_strings$.getGlobalValue(), symbol_function(EQUALP), UNPROVIDED);
    }

    public static SubLObject tp_valid_quantity_p(final SubLObject words) {
        if (NIL == $quantity_strings$.getGlobalValue()) {
            $quantity_strings$.setGlobalValue(get_quantity_strings());
        }
        return set.set_memberP(string_utilities.bunge(words, UNPROVIDED), $quantity_strings$.getGlobalValue());
    }

    public static SubLObject clear_tp_valid_quantity_p() {
        $quantity_strings$.setGlobalValue(NIL);
        return $CLEARED;
    }

    public static SubLObject reset_tp_valid_quantity_p() {
        $quantity_strings$.setGlobalValue(get_quantity_strings());
        return $RESET;
    }

    public static SubLObject get_quantity_strings() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject result_set = set.new_set(EQUALP, UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject term_list = cdolist_list_var = cons($$PhysicalPartOfObject, backward.removal_ask_variable($X, $list86, NIL != rtp_vars.$rtp_semantic_mt$.getDynamicValue(thread) ? rtp_vars.$rtp_semantic_mt$.getDynamicValue(thread) : $$InferencePSC, UNPROVIDED, UNPROVIDED));
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL == nart_handles.nart_p(v_term)) || (NIL == isa.isaP(v_term, $$LogicalField, UNPROVIDED, UNPROVIDED))) {
                SubLObject cdolist_list_var_$3 = pph_methods_lexicon.all_phrases_for_term(v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject item = NIL;
                item = cdolist_list_var_$3.first();
                while (NIL != cdolist_list_var_$3) {
                    set.set_add(item, result_set);
                    cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                    item = cdolist_list_var_$3.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        return result_set;
    }

    public static SubLObject prepositional_categoryP(final SubLObject category) {
        return subl_promotions.memberP(category, $prepositional_category_templates$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject tp_valid_pp(final SubLObject category, final SubLObject words, final SubLObject mt) {
        if (NIL == words) {
            return T;
        }
        if (length(words).numL(TWO_INTEGER)) {
            return NIL;
        }
        final SubLObject front_word = words.first();
        final SubLObject back_word = last(words, UNPROVIDED).first();
        if ((NIL == valid_tp_pp_end_stringP(back_word, mt)) || (NIL == valid_tp_pp_start_stringP(front_word))) {
            return NIL;
        }
        SubLObject cdolist_list_var = words;
        SubLObject word = NIL;
        word = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != tp_unambiguous_verbP(word, UNPROVIDED)) && (NIL == rkf_string_weeders.rkf_adjective_stringP(word))) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        } 
        return T;
    }

    public static SubLObject valid_tp_pp_end_stringP(final SubLObject word, final SubLObject mt) {
        if (NIL != subl_promotions.memberP(word, $invalid_tp_vp_end_punctuation$.getGlobalValue(), symbol_function(STRING_EQUAL), UNPROVIDED)) {
            return NIL;
        }
        return possible_tp_pp_end_stringP(word, mt);
    }

    public static SubLObject valid_tp_pp_start_stringP(final SubLObject word) {
        return possible_tp_pp_start_stringP(word);
    }

    public static SubLObject tp_valid_adjpP(final SubLObject words) {
        final SubLObject first_word = words.first();
        final SubLObject last_word = last(words, UNPROVIDED).first();
        return makeBoolean(((NIL != rkf_string_weeders.rkf_adjective_stringP(first_word)) || ((NIL == rkf_string_weeders.rkf_determiner_stringP(first_word)) && (NIL == rkf_string_weeders.rkf_conjunction_stringP(first_word)))) && (NIL != rkf_string_weeders.rkf_adjective_stringP(last_word)));
    }

    public static SubLObject tp_valid_adjp_predP(final SubLObject words) {
        final SubLObject last_word = last(words, UNPROVIDED).first();
        final SubLObject words_of_last_word = lexicon_cache.words_of_string(last_word, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject gerund_freeP = NIL;
        if (NIL == tp_valid_adjpP(words)) {
            return NIL;
        }
        if (NIL == gerund_freeP) {
            SubLObject csome_list_var = words_of_last_word;
            SubLObject word = NIL;
            word = csome_list_var.first();
            while ((NIL == gerund_freeP) && (NIL != csome_list_var)) {
                if (NIL == subl_promotions.memberP($$gerund, lexicon_accessors.preds_of_stringXword(last_word, word, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED)) {
                    gerund_freeP = T;
                }
                csome_list_var = csome_list_var.rest();
                word = csome_list_var.first();
            } 
        }
        if (NIL != gerund_freeP) {
            return T;
        }
        return NIL;
    }

    public static SubLObject template_to_om_categories(final SubLObject template_category) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject categories = assoc(template_category, $template_to_om_category_mappings$.getDynamicValue(thread), EQ, UNPROVIDED).rest();
        return NIL != categories ? categories : $list92;
    }

    public static SubLObject rtp_ranking_filename(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return file_utilities.relative_filename($rtp_ranking_data_dir$.getDynamicValue(thread), filename, $$$fht);
    }

    public static SubLObject rtp_parse_ranking_init() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject problem = NIL;
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    if (NIL == file_hash_table.file_hash_table_p($cat_prior$.getGlobalValue())) {
                        $cat_prior$.setGlobalValue(file_hash_table.open_file_hash_table(rtp_ranking_filename($cat_prior_file$.getGlobalValue()), symbol_function(EQUAL), UNPROVIDED));
                    }
                    if (NIL == file_hash_table.file_hash_table_p($tag1_cond_cat$.getGlobalValue())) {
                        $tag1_cond_cat$.setGlobalValue(file_hash_table.open_file_hash_table(rtp_ranking_filename($tag1_cond_cat_file$.getGlobalValue()), symbol_function(EQUAL), UNPROVIDED));
                    }
                    if (NIL == file_hash_table.file_hash_table_p($tag2_cond_cat_tag1$.getGlobalValue())) {
                        $tag2_cond_cat_tag1$.setGlobalValue(file_hash_table.open_file_hash_table(rtp_ranking_filename($tag2_cond_cat_tag1_file$.getGlobalValue()), symbol_function(EQUAL), UNPROVIDED));
                    }
                    if (NIL == file_hash_table.file_hash_table_p($tag3_cond_cat_tag12$.getGlobalValue())) {
                        $tag3_cond_cat_tag12$.setGlobalValue(file_hash_table.open_file_hash_table(rtp_ranking_filename($tag3_cond_cat_tag12_file$.getGlobalValue()), symbol_function(EQUAL), UNPROVIDED));
                    }
                    if (NIL == file_hash_table.file_hash_table_p($tag_cond_tag$.getGlobalValue())) {
                        $tag_cond_tag$.setGlobalValue(file_hash_table.open_file_hash_table(rtp_ranking_filename($tag_cond_tag_file$.getGlobalValue()), symbol_function(EQUAL), UNPROVIDED));
                    }
                    if (NIL == file_hash_table.file_hash_table_p($cat_cond_last_tag$.getGlobalValue())) {
                        $cat_cond_last_tag$.setGlobalValue(file_hash_table.open_file_hash_table(rtp_ranking_filename($cat_cond_last_tag_file$.getGlobalValue()), symbol_function(EQUAL), UNPROVIDED));
                    }
                    if (NIL == pos_tagger.tagger_p($tagger$.getGlobalValue())) {
                        $tagger$.setGlobalValue(pos_tagger.new_tagger(UNPROVIDED));
                    }
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            problem = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != problem) {
            Errors.warn($str95$_a__parse_ranking_will_not_be_ava, problem);
            rtp_parse_ranking_finalize();
        }
        return makeBoolean(NIL == problem);
    }

    public static SubLObject rtp_parse_ranking_finalize() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject problem = NIL;
        SubLObject cdolist_list_var = $list97;
        SubLObject fht_symbol = NIL;
        fht_symbol = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject fht = symbol_value(fht_symbol);
            if (NIL != file_hash_table.file_hash_table_p(fht)) {
                try {
                    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            file_hash_table.finalize_file_hash_table(fht);
                        } catch (final Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        Errors.$error_handler$.rebind(_prev_bind_0, thread);
                    }
                } catch (final Throwable ccatch_env_var) {
                    problem = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                } finally {
                    thread.throwStack.pop();
                }
                if (NIL != problem) {
                    Errors.warn($str96$Couldn_t_finalize_file_hashtable_, fht);
                }
            }
            set(fht_symbol, NIL);
            cdolist_list_var = cdolist_list_var.rest();
            fht_symbol = cdolist_list_var.first();
        } 
        if (NIL != pos_tagger.tagger_p($tagger$.getGlobalValue())) {
            SubLObject ignore_errors_tag = NIL;
            try {
                thread.throwStack.push($IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(symbol_function(IGNORE_ERRORS_HANDLER), thread);
                    try {
                        pos_tagger.finalize_tagger($tagger$.getGlobalValue());
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
        }
        $tagger$.setGlobalValue(NIL);
        return makeBoolean(NIL == problem);
    }

    public static SubLObject rtp_parse_ranking_initializedP() {
        return makeBoolean(((((((NIL != tagger_initializedP()) && (NIL != file_hash_table.file_hash_table_p($cat_prior$.getGlobalValue()))) && (NIL != file_hash_table.file_hash_table_p($tag1_cond_cat$.getGlobalValue()))) && (NIL != file_hash_table.file_hash_table_p($tag2_cond_cat_tag1$.getGlobalValue()))) && (NIL != file_hash_table.file_hash_table_p($tag3_cond_cat_tag12$.getGlobalValue()))) && (NIL != file_hash_table.file_hash_table_p($tag_cond_tag$.getGlobalValue()))) && (NIL != file_hash_table.file_hash_table_p($cat_cond_last_tag$.getGlobalValue())));
    }

    public static SubLObject tagger_initializedP() {
        return pos_tagger.tagger_p($tagger$.getGlobalValue());
    }

    public static SubLObject rop2phrase(final SubLObject sentence, final SubLObject rop) {
        SubLObject words = NIL;
        SubLObject cdolist_list_var = parsing_utilities.result_of_parsing_span_wXo_thelist(rop);
        SubLObject index = NIL;
        index = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            words = cons(document.sentence_get(sentence, index), words);
            cdolist_list_var = cdolist_list_var.rest();
            index = cdolist_list_var.first();
        } 
        return document.new_phrase(list($CONSTITUENTS, apply(symbol_function(VECTOR), nreverse(words)), $CATEGORY, parsing_utilities.result_of_parsing_category(rop)));
    }

    public static SubLObject parse2sentence(final SubLObject sentence, final SubLObject cycl) {
        SubLObject constituents = NIL;
        SubLObject index = ZERO_INTEGER;
        SubLObject words = NIL;
        SubLObject rops = NIL;
        if (cycl.isList()) {
            SubLObject cdolist_list_var = cycl;
            SubLObject element = NIL;
            element = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                if (NIL != parsing_utilities.result_of_parsing_formulaP(element)) {
                    rops = cons(element, rops);
                }
                cdolist_list_var = cdolist_list_var.rest();
                element = cdolist_list_var.first();
            } 
        }
        SubLObject cdolist_list_var = Sort.sort(rops, symbol_function($sym102$_), symbol_function(RESULT_OF_PARSING_START));
        SubLObject element = NIL;
        element = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            words = NIL;
            if (!parsing_utilities.result_of_parsing_start(element).eql(index)) {
                SubLObject cdotimes_end_var;
                SubLObject i;
                for (cdotimes_end_var = subtract(parsing_utilities.result_of_parsing_start(element), index), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                    words = cons(document.sentence_get(sentence, add(i, index)), words);
                }
                constituents = cons(document.new_phrase(list($CATEGORY, $X, $CONSTITUENTS, apply(symbol_function(VECTOR), nreverse(words)))), constituents);
            }
            constituents = cons(rop2phrase(sentence, element), constituents);
            index = number_utilities.f_1X(parsing_utilities.result_of_parsing_end(element));
            cdolist_list_var = cdolist_list_var.rest();
            element = cdolist_list_var.first();
        } 
        return document.new_phrase(list($CONSTITUENTS, apply(symbol_function(VECTOR), nreverse(constituents)), $CATEGORY, $S));
    }

    public static SubLObject cat_prior(final SubLObject template) {
        SubLObject p = ZERO_INTEGER;
        SubLObject cdolist_list_var = template_to_om_categories(template);
        SubLObject cat = NIL;
        cat = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            p = add(p, exp(file_hash_table.get_file_hash_table(cat, $cat_prior$.getGlobalValue(), pos_tagger.$low_probability$.getGlobalValue())));
            cdolist_list_var = cdolist_list_var.rest();
            cat = cdolist_list_var.first();
        } 
        return log(p, UNPROVIDED);
    }

    public static SubLObject tag1_cond_cat(final SubLObject tag1, final SubLObject template) {
        SubLObject p = ZERO_INTEGER;
        SubLObject cdolist_list_var = template_to_om_categories(template);
        SubLObject cat = NIL;
        cat = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            p = add(p, exp(file_hash_table.get_file_hash_table(list(tag1, cat), $tag1_cond_cat$.getGlobalValue(), pos_tagger.$low_probability$.getGlobalValue())));
            cdolist_list_var = cdolist_list_var.rest();
            cat = cdolist_list_var.first();
        } 
        return log(p, UNPROVIDED);
    }

    public static SubLObject tag2_cond_cat_tag1(final SubLObject tag2, final SubLObject template, final SubLObject tag1) {
        SubLObject p = ZERO_INTEGER;
        SubLObject cdolist_list_var = template_to_om_categories(template);
        SubLObject cat = NIL;
        cat = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            p = add(p, exp(file_hash_table.get_file_hash_table(list(tag2, cat, tag1), $tag2_cond_cat_tag1$.getGlobalValue(), pos_tagger.$low_probability$.getGlobalValue())));
            cdolist_list_var = cdolist_list_var.rest();
            cat = cdolist_list_var.first();
        } 
        return log(p, UNPROVIDED);
    }

    public static SubLObject tag3_cond_cat_tag12(final SubLObject tag3, final SubLObject template, final SubLObject tag1, final SubLObject tag2) {
        SubLObject p = ZERO_INTEGER;
        SubLObject cdolist_list_var = template_to_om_categories(template);
        SubLObject cat = NIL;
        cat = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            p = add(p, exp(file_hash_table.get_file_hash_table(list(tag3, cat, tag1, tag2), $tag3_cond_cat_tag12$.getGlobalValue(), pos_tagger.$low_probability$.getGlobalValue())));
            cdolist_list_var = cdolist_list_var.rest();
            cat = cdolist_list_var.first();
        } 
        return log(p, UNPROVIDED);
    }

    public static SubLObject cat_cond_last_tag(final SubLObject template, final SubLObject tagx) {
        SubLObject p = ZERO_INTEGER;
        SubLObject cdolist_list_var = template_to_om_categories(template);
        SubLObject cat = NIL;
        cat = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            p = add(p, exp(file_hash_table.get_file_hash_table(list(cat, tagx), $cat_cond_last_tag$.getGlobalValue(), pos_tagger.$low_probability$.getGlobalValue())));
            cdolist_list_var = cdolist_list_var.rest();
            cat = cdolist_list_var.first();
        } 
        return log(p, UNPROVIDED);
    }

    public static SubLObject tag_cond_tag(final SubLObject tag2, final SubLObject tag1) {
        return file_hash_table.get_file_hash_table(list(tag2, tag1), $tag_cond_tag$.getGlobalValue(), pos_tagger.$low_probability$.getGlobalValue());
    }

    public static SubLObject rtp_phrase_probability(final SubLObject phrase) {
        assert NIL != document.phrase_p(phrase) : "document.phrase_p(phrase) " + "CommonSymbols.NIL != document.phrase_p(phrase) " + phrase;
        if (document.phrase_category(phrase) == $X) {
            return ZERO_INTEGER;
        }
        final SubLObject category = document.phrase_category(phrase);
        final SubLObject tags = Mapping.mapcar(symbol_function(WORD_CATEGORY), document.sign_yield(phrase));
        SubLObject probability = NIL;
        probability = add(new SubLObject[]{ cat_prior(category), tag1_cond_cat(tags.first(), category), NIL != second(tags) ? tag2_cond_cat_tag1(second(tags), category, tags.first()) : ZERO_INTEGER, NIL != third(tags) ? tag3_cond_cat_tag12(third(tags), category, tags.first(), second(tags)) : ZERO_INTEGER, cat_cond_last_tag(category, last(tags, UNPROVIDED).first()) });
        SubLObject remaining = NIL;
        SubLObject tag1 = NIL;
        SubLObject tag2 = NIL;
        remaining = nthcdr(TWO_INTEGER, tags);
        tag1 = remaining.first();
        for (tag2 = second(remaining); NIL != tag2; tag2 = second(remaining)) {
            probability = add(probability, tag_cond_tag(tag2, tag1));
            remaining = remaining.rest();
            tag1 = remaining.first();
        }
        return probability;
    }

    public static SubLObject rtp_sentence_probability(final SubLObject sentence) {
        assert NIL != document.sentence_p(sentence) : "document.sentence_p(sentence) " + "CommonSymbols.NIL != document.sentence_p(sentence) " + sentence;
        SubLObject probability = pos_tagger.$certainty$.getGlobalValue();
        final SubLObject vector_var = document.sign_constituents(sentence);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject daughter;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            daughter = aref(vector_var, element_num);
            probability = add(probability, rtp_phrase_probability(daughter));
        }
        return probability;
    }

    public static SubLObject rtp_rank_parses(final SubLObject string, final SubLObject parses) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == rtp_parse_ranking_initializedP()) {
            rtp_parse_ranking_init();
        }
        if (NIL == rtp_parse_ranking_initializedP()) {
            return parses;
        }
        SubLObject problem = NIL;
        final SubLObject new_parses = copy_tree(parses);
        try {
            thread.throwStack.push($catch_error_message_target$.getGlobalValue());
            final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
            try {
                Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                try {
                    final SubLObject sections = rtp_iterators.new_itp_result_iterator(new_parses, UNPROVIDED, UNPROVIDED);
                    final SubLObject words = pos_tagger.tagger_tag_sentence($tagger$.getGlobalValue(), document.new_sentence(string, UNPROVIDED));
                    SubLObject sentence = NIL;
                    SubLObject parse = NIL;
                    while (NIL == rtp_iterators.itp_result_iterator_doneP(sections)) {
                        final SubLObject cycls = rtp_iterators.itp_result_iterator_curr(sections);
                        while (NIL == rtp_iterators.itp_section_iterator_doneP(cycls)) {
                            parse = rtp_iterators.itp_section_iterator_curr(cycls);
                            sentence = parse2sentence(words, parse);
                            rtp_iterators.itp_section_iterator_set_curr(cycls, new_itp_semantics(parse, $UNAVAILABLE, $UNAVAILABLE, $UNAVAILABLE, rtp_sentence_probability(sentence)));
                            rtp_iterators.itp_section_iterator_next(cycls);
                        } 
                        rtp_iterators.itp_result_iterator_next(sections);
                    } 
                } catch (final Throwable catch_var) {
                    Errors.handleThrowable(catch_var, NIL);
                }
            } finally {
                Errors.$error_handler$.rebind(_prev_bind_0, thread);
            }
        } catch (final Throwable ccatch_env_var) {
            problem = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
        } finally {
            thread.throwStack.pop();
        }
        if (NIL != problem) {
            rtp_parse_ranking_finalize();
            Errors.warn($str108$RTP_RANK_PARSES_triggered_an_erro);
            return parses;
        }
        return new_parses;
    }

    public static SubLObject declare_rtp_constituent_weeders_file() {
        declareFunction(me, "itp_semantics_print_function_trampoline", "ITP-SEMANTICS-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction(me, "itp_semantics_p", "ITP-SEMANTICS-P", 1, 0, false);
        new rtp_constituent_weeders.$itp_semantics_p$UnaryFunction();
        declareFunction(me, "itp_semantics_cycl", "ITP-SEMANTICS-CYCL", 1, 0, false);
        declareFunction(me, "itp_semantics_category", "ITP-SEMANTICS-CATEGORY", 1, 0, false);
        declareFunction(me, "itp_semantics_force", "ITP-SEMANTICS-FORCE", 1, 0, false);
        declareFunction(me, "itp_semantics_supports", "ITP-SEMANTICS-SUPPORTS", 1, 0, false);
        declareFunction(me, "itp_semantics_confidence", "ITP-SEMANTICS-CONFIDENCE", 1, 0, false);
        declareFunction(me, "_csetf_itp_semantics_cycl", "_CSETF-ITP-SEMANTICS-CYCL", 2, 0, false);
        declareFunction(me, "_csetf_itp_semantics_category", "_CSETF-ITP-SEMANTICS-CATEGORY", 2, 0, false);
        declareFunction(me, "_csetf_itp_semantics_force", "_CSETF-ITP-SEMANTICS-FORCE", 2, 0, false);
        declareFunction(me, "_csetf_itp_semantics_supports", "_CSETF-ITP-SEMANTICS-SUPPORTS", 2, 0, false);
        declareFunction(me, "_csetf_itp_semantics_confidence", "_CSETF-ITP-SEMANTICS-CONFIDENCE", 2, 0, false);
        declareFunction(me, "make_itp_semantics", "MAKE-ITP-SEMANTICS", 0, 1, false);
        declareFunction(me, "visit_defstruct_itp_semantics", "VISIT-DEFSTRUCT-ITP-SEMANTICS", 2, 0, false);
        declareFunction(me, "visit_defstruct_object_itp_semantics_method", "VISIT-DEFSTRUCT-OBJECT-ITP-SEMANTICS-METHOD", 2, 0, false);
        declareFunction(me, "print_itp_semantics", "PRINT-ITP-SEMANTICS", 3, 0, false);
        declareFunction(me, "new_itp_semantics", "NEW-ITP-SEMANTICS", 1, 4, false);
        declareFunction(me, "new_itp_semantics_conf_1", "NEW-ITP-SEMANTICS-CONF-1", 1, 0, false);
        declareFunction(me, "new_itp_semantics_conf_half", "NEW-ITP-SEMANTICS-CONF-HALF", 1, 0, false);
        declareFunction(me, "rtp_parse_exp_ranked", "RTP-PARSE-EXP-RANKED", 3, 0, false);
        declareFunction(me, "rtp_vbar_templates", "RTP-VBAR-TEMPLATES", 0, 0, false);
        declareFunction(me, "clear_rtp_vbar_templates_cached", "CLEAR-RTP-VBAR-TEMPLATES-CACHED", 0, 0, false);
        declareFunction(me, "remove_rtp_vbar_templates_cached", "REMOVE-RTP-VBAR-TEMPLATES-CACHED", 0, 0, false);
        declareFunction(me, "rtp_vbar_templates_cached_internal", "RTP-VBAR-TEMPLATES-CACHED-INTERNAL", 0, 0, false);
        declareFunction(me, "rtp_vbar_templates_cached", "RTP-VBAR-TEMPLATES-CACHED", 0, 0, false);
        declareFunction(me, "tp_possible_constitP_old", "TP-POSSIBLE-CONSTIT?-OLD", 2, 1, false);
        declareFunction(me, "tp_possible_constitP", "TP-POSSIBLE-CONSTIT?", 2, 1, false);
        declareFunction(me, "tp_valid_nbar", "TP-VALID-NBAR", 2, 1, false);
        declareFunction(me, "tp_valid_nbar_wordsP", "TP-VALID-NBAR-WORDS?", 1, 1, false);
        declareFunction(me, "valid_tp_nbar_end_stringP", "VALID-TP-NBAR-END-STRING?", 2, 0, false);
        declareFunction(me, "valid_tp_nbar_start_stringP", "VALID-TP-NBAR-START-STRING?", 1, 0, false);
        declareFunction(me, "tp_valid_np", "TP-VALID-NP", 2, 1, false);
        declareFunction(me, "tp_valid_np_wordsP", "TP-VALID-NP-WORDS?", 1, 1, false);
        declareFunction(me, "tp_valid_single_word_npP", "TP-VALID-SINGLE-WORD-NP?", 2, 0, false);
        declareFunction(me, "valid_tp_np_end_stringP", "VALID-TP-NP-END-STRING?", 2, 0, false);
        declareFunction(me, "valid_tp_np_start_stringP", "VALID-TP-NP-START-STRING?", 1, 0, false);
        declareFunction(me, "tp_valid_sP", "TP-VALID-S?", 1, 0, false);
        declareFunction(me, "tp_valid_vbar", "TP-VALID-VBAR", 2, 0, false);
        declareFunction(me, "valid_tp_vbar_start_stringP", "VALID-TP-VBAR-START-STRING?", 1, 0, false);
        declareFunction(me, "valid_tp_vbar_end_stringP", "VALID-TP-VBAR-END-STRING?", 1, 0, false);
        declareFunction(me, "tp_valid_vp", "TP-VALID-VP", 2, 0, false);
        declareFunction(me, "valid_tp_vp_start_stringP", "VALID-TP-VP-START-STRING?", 1, 0, false);
        declareFunction(me, "valid_tp_vp_end_stringP", "VALID-TP-VP-END-STRING?", 1, 0, false);
        declareFunction(me, "tp_unambiguous_verbP", "TP-UNAMBIGUOUS-VERB?", 1, 1, false);
        declareFunction(me, "tp_valid_number_p", "TP-VALID-NUMBER-P", 1, 0, false);
        declareFunction(me, "number_prefix_p", "NUMBER-PREFIX-P", 1, 0, false);
        declareFunction(me, "possible_tp_vp_start_stringP", "POSSIBLE-TP-VP-START-STRING?", 1, 0, false);
        declareFunction(me, "rtp_contraction_elementP", "RTP-CONTRACTION-ELEMENT?", 1, 0, false);
        declareFunction(me, "get_contraction_elements", "GET-CONTRACTION-ELEMENTS", 0, 0, false);
        declareFunction(me, "possible_tp_vp_end_stringP", "POSSIBLE-TP-VP-END-STRING?", 1, 0, false);
        declareFunction(me, "possible_tp_np_start_stringP", "POSSIBLE-TP-NP-START-STRING?", 1, 0, false);
        declareFunction(me, "possible_tp_nbar_start_stringP", "POSSIBLE-TP-NBAR-START-STRING?", 1, 0, false);
        declareFunction(me, "possible_tp_pp_start_stringP", "POSSIBLE-TP-PP-START-STRING?", 1, 0, false);
        declareFunction(me, "possible_tp_pp_end_stringP", "POSSIBLE-TP-PP-END-STRING?", 1, 1, false);
        declareFunction(me, "possible_tp_np_end_stringP", "POSSIBLE-TP-NP-END-STRING?", 1, 1, false);
        declareFunction(me, "impossible_tp_phrase_end_stringP", "IMPOSSIBLE-TP-PHRASE-END-STRING?", 1, 0, false);
        declareFunction(me, "confusing_np_start_stringP", "CONFUSING-NP-START-STRING?", 1, 0, false);
        declareFunction(me, "confusing_nbar_start_stringP", "CONFUSING-NBAR-START-STRING?", 1, 0, false);
        declareFunction(me, "tp_valid_quantity_p", "TP-VALID-QUANTITY-P", 1, 0, false);
        declareFunction(me, "clear_tp_valid_quantity_p", "CLEAR-TP-VALID-QUANTITY-P", 0, 0, false);
        declareFunction(me, "reset_tp_valid_quantity_p", "RESET-TP-VALID-QUANTITY-P", 0, 0, false);
        declareFunction(me, "get_quantity_strings", "GET-QUANTITY-STRINGS", 0, 0, false);
        declareFunction(me, "prepositional_categoryP", "PREPOSITIONAL-CATEGORY?", 1, 0, false);
        declareFunction(me, "tp_valid_pp", "TP-VALID-PP", 3, 0, false);
        declareFunction(me, "valid_tp_pp_end_stringP", "VALID-TP-PP-END-STRING?", 2, 0, false);
        declareFunction(me, "valid_tp_pp_start_stringP", "VALID-TP-PP-START-STRING?", 1, 0, false);
        declareFunction(me, "tp_valid_adjpP", "TP-VALID-ADJP?", 1, 0, false);
        declareFunction(me, "tp_valid_adjp_predP", "TP-VALID-ADJP-PRED?", 1, 0, false);
        declareFunction(me, "template_to_om_categories", "TEMPLATE-TO-OM-CATEGORIES", 1, 0, false);
        declareFunction(me, "rtp_ranking_filename", "RTP-RANKING-FILENAME", 1, 0, false);
        declareFunction(me, "rtp_parse_ranking_init", "RTP-PARSE-RANKING-INIT", 0, 0, false);
        declareFunction(me, "rtp_parse_ranking_finalize", "RTP-PARSE-RANKING-FINALIZE", 0, 0, false);
        declareFunction(me, "rtp_parse_ranking_initializedP", "RTP-PARSE-RANKING-INITIALIZED?", 0, 0, false);
        declareFunction(me, "tagger_initializedP", "TAGGER-INITIALIZED?", 0, 0, false);
        declareFunction(me, "rop2phrase", "ROP2PHRASE", 2, 0, false);
        declareFunction(me, "parse2sentence", "PARSE2SENTENCE", 2, 0, false);
        declareFunction(me, "cat_prior", "CAT-PRIOR", 1, 0, false);
        declareFunction(me, "tag1_cond_cat", "TAG1-COND-CAT", 2, 0, false);
        declareFunction(me, "tag2_cond_cat_tag1", "TAG2-COND-CAT-TAG1", 3, 0, false);
        declareFunction(me, "tag3_cond_cat_tag12", "TAG3-COND-CAT-TAG12", 4, 0, false);
        declareFunction(me, "cat_cond_last_tag", "CAT-COND-LAST-TAG", 2, 0, false);
        declareFunction(me, "tag_cond_tag", "TAG-COND-TAG", 2, 0, false);
        declareFunction(me, "rtp_phrase_probability", "RTP-PHRASE-PROBABILITY", 1, 0, false);
        declareFunction(me, "rtp_sentence_probability", "RTP-SENTENCE-PROBABILITY", 1, 0, false);
        declareFunction(me, "rtp_rank_parses", "RTP-RANK-PARSES", 2, 0, false);
        return NIL;
    }

    public static SubLObject init_rtp_constituent_weeders_file() {
        deflexical("*INVALID-TP-VP-END-PUNCTUATION*", $list0);
        deflexical("*VALID-TP-NON-STARTING-SENTENTIAL-MARKERS*", $list1);
        defparameter("*RTP-RANKING-DATA-DIR*", $str2$data_rkf_parse_ranking_);
        deflexical("*CAT-PRIOR-FILE*", $str3$cat_prior);
        deflexical("*TAG1-COND-CAT-FILE*", $str4$tag1_cond_cat);
        deflexical("*TAG2-COND-CAT-TAG1-FILE*", $str5$tag2_cond_cat_tag1);
        deflexical("*TAG3-COND-CAT-TAG12-FILE*", $str6$tag3_cond_cat_tag12);
        deflexical("*TAG-COND-TAG-FILE*", $str7$tag_cond_tag);
        deflexical("*CAT-COND-LAST-TAG-FILE*", $str8$cat_cond_last_tag);
        deflexical("*CAT-PRIOR*", SubLTrampolineFile.maybeDefault($cat_prior$, $cat_prior$, NIL));
        deflexical("*TAG1-COND-CAT*", SubLTrampolineFile.maybeDefault($sym10$_TAG1_COND_CAT_, $tag1_cond_cat$, NIL));
        deflexical("*TAG2-COND-CAT-TAG1*", SubLTrampolineFile.maybeDefault($sym11$_TAG2_COND_CAT_TAG1_, $tag2_cond_cat_tag1$, NIL));
        deflexical("*TAG3-COND-CAT-TAG12*", SubLTrampolineFile.maybeDefault($sym12$_TAG3_COND_CAT_TAG12_, $tag3_cond_cat_tag12$, NIL));
        deflexical("*TAG-COND-TAG*", SubLTrampolineFile.maybeDefault($tag_cond_tag$, $tag_cond_tag$, NIL));
        deflexical("*CAT-COND-LAST-TAG*", SubLTrampolineFile.maybeDefault($cat_cond_last_tag$, $cat_cond_last_tag$, NIL));
        deflexical("*TAGGER*", SubLTrampolineFile.maybeDefault($tagger$, $tagger$, NIL));
        defconstant("*DTP-ITP-SEMANTICS*", ITP_SEMANTICS);
        deflexical("*RTP-VBAR-TEMPLATES-CACHED-CACHING-STATE*", NIL);
        defparameter("*USE-NEW-TP-POSSIBLE-CONSTIT?*", T);
        defparameter("*RTP-CONTRACTION-ELEMENTS*", NIL);
        deflexical("*CONFUSING-NP-START-STRINGS*", $list80);
        deflexical("*CONFUSING-NBAR-START-STRINGS*", NIL);
        deflexical("*QUANTITY-STRINGS*", SubLTrampolineFile.maybeDefault($quantity_strings$, $quantity_strings$, NIL));
        deflexical("*PREPOSITIONAL-CATEGORY-TEMPLATES*", $list89);
        defparameter("*TEMPLATE-TO-OM-CATEGORY-MAPPINGS*", $list91);
        return NIL;
    }

    public static SubLObject setup_rtp_constituent_weeders_file() {
        declare_defglobal($cat_prior$);
        declare_defglobal($sym10$_TAG1_COND_CAT_);
        declare_defglobal($sym11$_TAG2_COND_CAT_TAG1_);
        declare_defglobal($sym12$_TAG3_COND_CAT_TAG12_);
        declare_defglobal($tag_cond_tag$);
        declare_defglobal($cat_cond_last_tag$);
        declare_defglobal($tagger$);
        register_method($print_object_method_table$.getGlobalValue(), $dtp_itp_semantics$.getGlobalValue(), symbol_function(ITP_SEMANTICS_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim($list24);
        def_csetf(ITP_SEMANTICS_CYCL, _CSETF_ITP_SEMANTICS_CYCL);
        def_csetf(ITP_SEMANTICS_CATEGORY, _CSETF_ITP_SEMANTICS_CATEGORY);
        def_csetf(ITP_SEMANTICS_FORCE, _CSETF_ITP_SEMANTICS_FORCE);
        def_csetf(ITP_SEMANTICS_SUPPORTS, _CSETF_ITP_SEMANTICS_SUPPORTS);
        def_csetf(ITP_SEMANTICS_CONFIDENCE, _CSETF_ITP_SEMANTICS_CONFIDENCE);
        identity(ITP_SEMANTICS);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), $dtp_itp_semantics$.getGlobalValue(), symbol_function(VISIT_DEFSTRUCT_OBJECT_ITP_SEMANTICS_METHOD));
        memoization_state.note_globally_cached_function(RTP_VBAR_TEMPLATES_CACHED);
        declare_defglobal($quantity_strings$);
        return NIL;
    }

    @Override
    public void declareFunctions() {
        declare_rtp_constituent_weeders_file();
    }

    @Override
    public void initializeVariables() {
        init_rtp_constituent_weeders_file();
    }

    @Override
    public void runTopLevelForms() {
        setup_rtp_constituent_weeders_file();
    }

    static {







































































































































    }

    public static final class $itp_semantics_native extends SubLStructNative {
        public SubLObject $cycl;

        public SubLObject $category;

        public SubLObject $force;

        public SubLObject $supports;

        public SubLObject $confidence;

        private static final SubLStructDeclNative structDecl;

        public $itp_semantics_native() {
            this.$cycl = Lisp.NIL;
            this.$category = Lisp.NIL;
            this.$force = Lisp.NIL;
            this.$supports = Lisp.NIL;
            this.$confidence = Lisp.NIL;
        }

        @Override
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        @Override
        public SubLObject getField2() {
            return this.$cycl;
        }

        @Override
        public SubLObject getField3() {
            return this.$category;
        }

        @Override
        public SubLObject getField4() {
            return this.$force;
        }

        @Override
        public SubLObject getField5() {
            return this.$supports;
        }

        @Override
        public SubLObject getField6() {
            return this.$confidence;
        }

        @Override
        public SubLObject setField2(final SubLObject value) {
            return this.$cycl = value;
        }

        @Override
        public SubLObject setField3(final SubLObject value) {
            return this.$category = value;
        }

        @Override
        public SubLObject setField4(final SubLObject value) {
            return this.$force = value;
        }

        @Override
        public SubLObject setField5(final SubLObject value) {
            return this.$supports = value;
        }

        @Override
        public SubLObject setField6(final SubLObject value) {
            return this.$confidence = value;
        }

        static {
            structDecl = makeStructDeclNative(rtp_constituent_weeders.$itp_semantics_native.class, ITP_SEMANTICS, ITP_SEMANTICS_P, $list18, $list19, new String[]{ "$cycl", "$category", "$force", "$supports", "$confidence" }, $list20, $list21, PRINT_ITP_SEMANTICS);
        }
    }

    public static final class $itp_semantics_p$UnaryFunction extends UnaryFunction {
        public $itp_semantics_p$UnaryFunction() {
            super(extractFunctionNamed("ITP-SEMANTICS-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return itp_semantics_p(arg1);
        }
    }
}

/**
 * Total time: 397 ms
 */
