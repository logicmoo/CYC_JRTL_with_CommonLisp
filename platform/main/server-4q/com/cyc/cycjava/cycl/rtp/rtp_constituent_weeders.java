/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 */
package com.cyc.cycjava.cycl.rtp;


import static com.cyc.cycjava.cycl.backward.*;
import static com.cyc.cycjava.cycl.constant_handles.*;
import static com.cyc.cycjava.cycl.control_vars.*;
import static com.cyc.cycjava.cycl.document.*;
import static com.cyc.cycjava.cycl.file_hash_table.*;
import static com.cyc.cycjava.cycl.file_utilities.*;
import static com.cyc.cycjava.cycl.genls.*;
import static com.cyc.cycjava.cycl.isa.*;
import static com.cyc.cycjava.cycl.lexicon_accessors.*;
import static com.cyc.cycjava.cycl.lexicon_cache.*;
import static com.cyc.cycjava.cycl.lexicon_utilities.*;
import static com.cyc.cycjava.cycl.lexicon_vars.*;
import static com.cyc.cycjava.cycl.list_utilities.*;
import static com.cyc.cycjava.cycl.memoization_state.*;
import static com.cyc.cycjava.cycl.mt_relevance_macros.*;
import static com.cyc.cycjava.cycl.nart_handles.*;
import static com.cyc.cycjava.cycl.number_utilities.*;
import static com.cyc.cycjava.cycl.parsing_utilities.*;
import static com.cyc.cycjava.cycl.pos_tagger.*;
import static com.cyc.cycjava.cycl.pph_methods_lexicon.*;
import static com.cyc.cycjava.cycl.rkf_string_weeders.*;
import static com.cyc.cycjava.cycl.set.*;
import static com.cyc.cycjava.cycl.string_utilities.*;
import static com.cyc.cycjava.cycl.string_utilities_lexical.*;
import static com.cyc.cycjava.cycl.subl_macro_promotions.*;
import static com.cyc.cycjava.cycl.subl_promotions.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.ConsesLow.*;
import static com.cyc.tool.subl.jrtl.nativeCode.subLisp.Dynamic.*;
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
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.print_high.*;
import static com.cyc.tool.subl.jrtl.translatedCode.sublisp.streams_high.*;
import static com.cyc.tool.subl.util.SubLFiles.*;

import org.armedbear.lisp.Lisp;
import org.logicmoo.system.BeanShellCntrl;

import com.cyc.cycjava.cycl.*;
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


/**
 * Copyright (c) 1995 - 2019 Cycorp, Inc.  All rights reserved.
 * module:      RTP-CONSTITUENT-WEEDERS
 * source file: /cyc/top/cycl/rtp/rtp-constituent-weeders.lisp
 * created:     2019/07/03 17:38:39
 */
public final class rtp_constituent_weeders extends SubLTranslatedFile implements V12 {
    public static final class $itp_semantics_native extends SubLStructNative {
        public SubLStructDecl getStructDecl() {
            return structDecl;
        }

        public SubLObject getField2() {
            return com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.$itp_semantics_native.this.$cycl;
        }

        public SubLObject getField3() {
            return com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.$itp_semantics_native.this.$category;
        }

        public SubLObject getField4() {
            return com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.$itp_semantics_native.this.$force;
        }

        public SubLObject getField5() {
            return com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.$itp_semantics_native.this.$supports;
        }

        public SubLObject getField6() {
            return com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.$itp_semantics_native.this.$confidence;
        }

        public SubLObject setField2(SubLObject value) {
            return com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.$itp_semantics_native.this.$cycl = value;
        }

        public SubLObject setField3(SubLObject value) {
            return com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.$itp_semantics_native.this.$category = value;
        }

        public SubLObject setField4(SubLObject value) {
            return com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.$itp_semantics_native.this.$force = value;
        }

        public SubLObject setField5(SubLObject value) {
            return com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.$itp_semantics_native.this.$supports = value;
        }

        public SubLObject setField6(SubLObject value) {
            return com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.$itp_semantics_native.this.$confidence = value;
        }

        public SubLObject $cycl = Lisp.NIL;

        public SubLObject $category = Lisp.NIL;

        public SubLObject $force = Lisp.NIL;

        public SubLObject $supports = Lisp.NIL;

        public SubLObject $confidence = Lisp.NIL;

        private static final SubLStructDeclNative structDecl = makeStructDeclNative(com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.$itp_semantics_native.class, ITP_SEMANTICS, ITP_SEMANTICS_P, $list_alt18, $list_alt19, new String[]{ "$cycl", "$category", "$force", "$supports", "$confidence" }, $list_alt20, $list_alt21, PRINT_ITP_SEMANTICS);
    }

    public static final SubLFile me = new rtp_constituent_weeders();

 public static final String myName = "com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders";


    // deflexical
    // Definitions
    // punctuation markers that can't appear the end of a VP
    /**
     * punctuation markers that can't appear the end of a VP
     */
    @LispMethod(comment = "punctuation markers that can\'t appear the end of a VP\ndeflexical")
    private static final SubLSymbol $invalid_tp_vp_end_punctuation$ = makeSymbol("*INVALID-TP-VP-END-PUNCTUATION*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $valid_tp_non_starting_sentential_markers$ = makeSymbol("*VALID-TP-NON-STARTING-SENTENTIAL-MARKERS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    private static final SubLSymbol $rtp_ranking_data_dir$ = makeSymbol("*RTP-RANKING-DATA-DIR*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $cat_prior_file$ = makeSymbol("*CAT-PRIOR-FILE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $tag1_cond_cat_file$ = makeSymbol("*TAG1-COND-CAT-FILE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $tag2_cond_cat_tag1_file$ = makeSymbol("*TAG2-COND-CAT-TAG1-FILE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $tag3_cond_cat_tag12_file$ = makeSymbol("*TAG3-COND-CAT-TAG12-FILE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $tag_cond_tag_file$ = makeSymbol("*TAG-COND-TAG-FILE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $cat_cond_last_tag_file$ = makeSymbol("*CAT-COND-LAST-TAG-FILE*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $tag1_cond_cat$ = makeSymbol("*TAG1-COND-CAT*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $tag2_cond_cat_tag1$ = makeSymbol("*TAG2-COND-CAT-TAG1*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $tag3_cond_cat_tag12$ = makeSymbol("*TAG3-COND-CAT-TAG12*");

    // defconstant
    @LispMethod(comment = "defconstant")
    public static final SubLSymbol $dtp_itp_semantics$ = makeSymbol("*DTP-ITP-SEMANTICS*");

    // defparameter
    @LispMethod(comment = "defparameter")
    public static final SubLSymbol $use_new_tp_possible_constitP$ = makeSymbol("*USE-NEW-TP-POSSIBLE-CONSTIT?*");

    // defparameter
    /**
     * a list of strings which are possible contractions (or parts thereof, such as
     * '
     */
    @LispMethod(comment = "a list of strings which are possible contractions (or parts thereof, such as\r\n\'\ndefparameter\na list of strings which are possible contractions (or parts thereof, such as\n\'")
    private static final SubLSymbol $rtp_contraction_elements$ = makeSymbol("*RTP-CONTRACTION-ELEMENTS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $confusing_np_start_strings$ = makeSymbol("*CONFUSING-NP-START-STRINGS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $confusing_nbar_start_strings$ = makeSymbol("*CONFUSING-NBAR-START-STRINGS*");

    // deflexical
    @LispMethod(comment = "deflexical")
    private static final SubLSymbol $prepositional_category_templates$ = makeSymbol("*PREPOSITIONAL-CATEGORY-TEMPLATES*");

    // defparameter
    /**
     * The mapping between template-categories and open-minds syntactic categories
     */
    @LispMethod(comment = "The mapping between template-categories and open-minds syntactic categories\ndefparameter")
    private static final SubLSymbol $template_to_om_category_mappings$ = makeSymbol("*TEMPLATE-TO-OM-CATEGORY-MAPPINGS*");

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list0 = list(makeString("("));

    static private final SubLList $list1 = list(makeString("%"));

    static private final SubLString $str2$data_rkf_parse_ranking_ = makeString("data/rkf/parse-ranking/");

    static private final SubLString $str3$cat_prior = makeString("cat_prior");

    static private final SubLString $str4$tag1_cond_cat = makeString("tag1_cond_cat");

    static private final SubLString $str5$tag2_cond_cat_tag1 = makeString("tag2_cond_cat_tag1");

    static private final SubLString $str6$tag3_cond_cat_tag12 = makeString("tag3_cond_cat_tag12");

    static private final SubLString $str7$tag_cond_tag = makeString("tag_cond_tag");

    static private final SubLString $str8$cat_cond_last_tag = makeString("cat_cond_last_tag");

    public static final SubLSymbol $cat_prior$ = makeSymbol("*CAT-PRIOR*");

    static private final SubLSymbol $sym10$_TAG1_COND_CAT_ = makeSymbol("*TAG1-COND-CAT*");

    static private final SubLSymbol $sym11$_TAG2_COND_CAT_TAG1_ = makeSymbol("*TAG2-COND-CAT-TAG1*");

    static private final SubLSymbol $sym12$_TAG3_COND_CAT_TAG12_ = makeSymbol("*TAG3-COND-CAT-TAG12*");

    public static final SubLSymbol $tag_cond_tag$ = makeSymbol("*TAG-COND-TAG*");

    public static final SubLSymbol $cat_cond_last_tag$ = makeSymbol("*CAT-COND-LAST-TAG*");

    public static final SubLSymbol $tagger$ = makeSymbol("*TAGGER*");

    private static final SubLSymbol ITP_SEMANTICS = makeSymbol("ITP-SEMANTICS");

    private static final SubLSymbol ITP_SEMANTICS_P = makeSymbol("ITP-SEMANTICS-P");

    static private final SubLList $list18 = list(makeSymbol("CYCL"), makeSymbol("CATEGORY"), makeSymbol("FORCE"), makeSymbol("SUPPORTS"), makeSymbol("CONFIDENCE"));

    static private final SubLList $list19 = list($CYCL, makeKeyword("CATEGORY"), makeKeyword("FORCE"), makeKeyword("SUPPORTS"), makeKeyword("CONFIDENCE"));

    static private final SubLList $list20 = list(makeSymbol("ITP-SEMANTICS-CYCL"), makeSymbol("ITP-SEMANTICS-CATEGORY"), makeSymbol("ITP-SEMANTICS-FORCE"), makeSymbol("ITP-SEMANTICS-SUPPORTS"), makeSymbol("ITP-SEMANTICS-CONFIDENCE"));

    static private final SubLList $list21 = list(makeSymbol("_CSETF-ITP-SEMANTICS-CYCL"), makeSymbol("_CSETF-ITP-SEMANTICS-CATEGORY"), makeSymbol("_CSETF-ITP-SEMANTICS-FORCE"), makeSymbol("_CSETF-ITP-SEMANTICS-SUPPORTS"), makeSymbol("_CSETF-ITP-SEMANTICS-CONFIDENCE"));

    private static final SubLSymbol PRINT_ITP_SEMANTICS = makeSymbol("PRINT-ITP-SEMANTICS");

    private static final SubLSymbol ITP_SEMANTICS_PRINT_FUNCTION_TRAMPOLINE = makeSymbol("ITP-SEMANTICS-PRINT-FUNCTION-TRAMPOLINE");

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

    static private final SubLString $$$_ = makeString(" ");

    private static final SubLString $str49$CAT_ = makeString("CAT:");

    private static final SubLString $str50$FORCE_ = makeString("FORCE:");

    private static final SubLString $str51$SUPPORTS_ = makeString("SUPPORTS:");

    private static final SubLString $str52$CONFIDENCE_ = makeString("CONFIDENCE:");

    private static final SubLString $str53$_ = makeString(">");

    private static final SubLFloat $float$0_5 = makeDouble(0.5);

    private static final SubLSymbol RTP_VBAR_TEMPLATES_CACHED = makeSymbol("RTP-VBAR-TEMPLATES-CACHED");





    private static final SubLSymbol $rtp_vbar_templates_cached_caching_state$ = makeSymbol("*RTP-VBAR-TEMPLATES-CACHED-CACHING-STATE*");













    private static final SubLObject $$AdjPTemplate_Predicative = reader_make_constant_shell("AdjPTemplate-Predicative");



    private static final SubLList $list68 = list(reader_make_constant_shell("QuestionTemplate"), reader_make_constant_shell("STemplate"));

    private static final SubLList $list69 = list(reader_make_constant_shell("NumberTemplate"), reader_make_constant_shell("RatioTemplate"));



    private static final SubLString $str71$_S__S__S___new___S_old___S__ = makeString("~S ~S ~S~% new: ~S old: ~S~%");

    private static final SubLString $$$not = makeString("not");

    private static final SubLString $str73$_ = makeString("'");

    private static final SubLSymbol $sym75$VERBAL_CATEGORY_ = makeSymbol("VERBAL-CATEGORY?");

    private static final SubLList $list76 = list(makeString("-"), makeString("+"), makeString("~"));

    private static final SubLSymbol $sym77$STRING_ = makeSymbol("STRING=");

    private static final SubLString $$$how = makeString("how");

    private static final SubLList $list80 = list(makeString("as"), makeString("between"));

    private static final SubLSymbol $quantity_strings$ = makeSymbol("*QUANTITY-STRINGS*");



    static private final SubLList $list86 = list(reader_make_constant_shell("isa"), makeKeyword("X"), reader_make_constant_shell("IntervalOnNumberLine"));





    private static final SubLList $list89 = list(reader_make_constant_shell("PPByTemplate"), reader_make_constant_shell("PPTemplate"), reader_make_constant_shell("PPForTemplate"), reader_make_constant_shell("PPTemporalTemplate"), reader_make_constant_shell("PPTemporalDurationTemplate"));



    private static final SubLList $list91 = list(new SubLObject[]{ list(reader_make_constant_shell("NPTemplate"), $WHNP, makeKeyword("NNP")), list(reader_make_constant_shell("PPTempate"), makeKeyword("PP"), $WHPP), list(reader_make_constant_shell("PPTempate"), makeKeyword("PP"), $WHPP), list(reader_make_constant_shell("STemplate"), makeKeyword("S")), list(reader_make_constant_shell("VPTemplate"), makeKeyword("VP")), list(reader_make_constant_shell("ProgressiveVPTemplate"), makeKeyword("VP")), list(reader_make_constant_shell("PerfectiveVPTemplate"), makeKeyword("VP")), list(reader_make_constant_shell("AdvPTemplate"), $ADVP, makeKeyword("WHADVP")), list(reader_make_constant_shell("AdjPTemplate"), $ADJP, makeKeyword("WHADJP")), list(reader_make_constant_shell("AdjPTemplate-Predicative"), $ADJP, makeKeyword("WHADJP")), list(reader_make_constant_shell("ImperativeTemplate"), makeKeyword("S")), list(reader_make_constant_shell("InfinitivalVBarTemplate"), makeKeyword("VP")), list(reader_make_constant_shell("InfinitivalVPTemplate"), makeKeyword("VP")), list(reader_make_constant_shell("PassiveVBarTemplate"), makeKeyword("VP")), list(reader_make_constant_shell("PastTenseTemplate"), makeKeyword("VP")), list(reader_make_constant_shell("PastTenseVBarTemplate"), makeKeyword("VP")), list(reader_make_constant_shell("PerfectiveVBarTemplate"), makeKeyword("VP")), list(reader_make_constant_shell("PerfectiveVPTemplate"), makeKeyword("VP")), list(reader_make_constant_shell("NPTemporalTemplate"), makeKeyword("NNP")), list(reader_make_constant_shell("PossessiveTemplate"), makeKeyword("NNP")), list(reader_make_constant_shell("PresentTenseVBarTemplate"), makeKeyword("VP")), list(reader_make_constant_shell("ProgressiveVBarTemplate"), makeKeyword("VP")), list(reader_make_constant_shell("ProgressiveVPTemplate"), makeKeyword("VP")), list(reader_make_constant_shell("PPByTemplate"), makeKeyword("PP"), $WHPP), list(reader_make_constant_shell("PPForTemplate"), makeKeyword("PP"), $WHPP), list(reader_make_constant_shell("PPTemporalDurationTemplate"), makeKeyword("PP"), $WHPP), list(reader_make_constant_shell("QuantityTemplate"), makeKeyword("NNP")), list(reader_make_constant_shell("QuestionTemplate"), makeKeyword("S")), list(reader_make_constant_shell("RTPTensedVBarTemplate"), makeKeyword("VP")), list(reader_make_constant_shell("RTPUntensedVBarTemplate"), makeKeyword("VP")), list(reader_make_constant_shell("PPTemporalTemplate"), makeKeyword("PP"), $WHPP), list(reader_make_constant_shell("TemporalTemplate"), makeKeyword("NNP"), makeKeyword("PP")), list(reader_make_constant_shell("VBarTemplate"), makeKeyword("VP")) });

    static private final SubLList $list92 = list(makeString("X"));

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

    public static final SubLObject itp_semantics_print_function_trampoline_alt(SubLObject v_object, SubLObject stream) {
        com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.print_itp_semantics(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static SubLObject itp_semantics_print_function_trampoline(final SubLObject v_object, final SubLObject stream) {
        rtp_constituent_weeders.print_itp_semantics(v_object, stream, ZERO_INTEGER);
        return NIL;
    }

    public static final SubLObject itp_semantics_p_alt(SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.$itp_semantics_native.class ? ((SubLObject) (T)) : NIL;
    }

    public static SubLObject itp_semantics_p(final SubLObject v_object) {
        return v_object.getClass() == com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.$itp_semantics_native.class ? T : NIL;
    }

    public static final SubLObject itp_semantics_cycl_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, ITP_SEMANTICS_P);
        return v_object.getField2();
    }

    public static SubLObject itp_semantics_cycl(final SubLObject v_object) {
        assert NIL != rtp_constituent_weeders.itp_semantics_p(v_object) : "! rtp_constituent_weeders.itp_semantics_p(v_object) " + "rtp_constituent_weeders.itp_semantics_p error :" + v_object;
        return v_object.getField2();
    }

    public static final SubLObject itp_semantics_category_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, ITP_SEMANTICS_P);
        return v_object.getField3();
    }

    public static SubLObject itp_semantics_category(final SubLObject v_object) {
        assert NIL != rtp_constituent_weeders.itp_semantics_p(v_object) : "! rtp_constituent_weeders.itp_semantics_p(v_object) " + "rtp_constituent_weeders.itp_semantics_p error :" + v_object;
        return v_object.getField3();
    }

    public static final SubLObject itp_semantics_force_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, ITP_SEMANTICS_P);
        return v_object.getField4();
    }

    public static SubLObject itp_semantics_force(final SubLObject v_object) {
        assert NIL != rtp_constituent_weeders.itp_semantics_p(v_object) : "! rtp_constituent_weeders.itp_semantics_p(v_object) " + "rtp_constituent_weeders.itp_semantics_p error :" + v_object;
        return v_object.getField4();
    }

    public static final SubLObject itp_semantics_supports_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, ITP_SEMANTICS_P);
        return v_object.getField5();
    }

    public static SubLObject itp_semantics_supports(final SubLObject v_object) {
        assert NIL != rtp_constituent_weeders.itp_semantics_p(v_object) : "! rtp_constituent_weeders.itp_semantics_p(v_object) " + "rtp_constituent_weeders.itp_semantics_p error :" + v_object;
        return v_object.getField5();
    }

    public static final SubLObject itp_semantics_confidence_alt(SubLObject v_object) {
        SubLTrampolineFile.checkType(v_object, ITP_SEMANTICS_P);
        return v_object.getField6();
    }

    public static SubLObject itp_semantics_confidence(final SubLObject v_object) {
        assert NIL != rtp_constituent_weeders.itp_semantics_p(v_object) : "! rtp_constituent_weeders.itp_semantics_p(v_object) " + "rtp_constituent_weeders.itp_semantics_p error :" + v_object;
        return v_object.getField6();
    }

    public static final SubLObject _csetf_itp_semantics_cycl_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, ITP_SEMANTICS_P);
        return v_object.setField2(value);
    }

    public static SubLObject _csetf_itp_semantics_cycl(final SubLObject v_object, final SubLObject value) {
        assert NIL != rtp_constituent_weeders.itp_semantics_p(v_object) : "! rtp_constituent_weeders.itp_semantics_p(v_object) " + "rtp_constituent_weeders.itp_semantics_p error :" + v_object;
        return v_object.setField2(value);
    }

    public static final SubLObject _csetf_itp_semantics_category_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, ITP_SEMANTICS_P);
        return v_object.setField3(value);
    }

    public static SubLObject _csetf_itp_semantics_category(final SubLObject v_object, final SubLObject value) {
        assert NIL != rtp_constituent_weeders.itp_semantics_p(v_object) : "! rtp_constituent_weeders.itp_semantics_p(v_object) " + "rtp_constituent_weeders.itp_semantics_p error :" + v_object;
        return v_object.setField3(value);
    }

    public static final SubLObject _csetf_itp_semantics_force_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, ITP_SEMANTICS_P);
        return v_object.setField4(value);
    }

    public static SubLObject _csetf_itp_semantics_force(final SubLObject v_object, final SubLObject value) {
        assert NIL != rtp_constituent_weeders.itp_semantics_p(v_object) : "! rtp_constituent_weeders.itp_semantics_p(v_object) " + "rtp_constituent_weeders.itp_semantics_p error :" + v_object;
        return v_object.setField4(value);
    }

    public static final SubLObject _csetf_itp_semantics_supports_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, ITP_SEMANTICS_P);
        return v_object.setField5(value);
    }

    public static SubLObject _csetf_itp_semantics_supports(final SubLObject v_object, final SubLObject value) {
        assert NIL != rtp_constituent_weeders.itp_semantics_p(v_object) : "! rtp_constituent_weeders.itp_semantics_p(v_object) " + "rtp_constituent_weeders.itp_semantics_p error :" + v_object;
        return v_object.setField5(value);
    }

    public static final SubLObject _csetf_itp_semantics_confidence_alt(SubLObject v_object, SubLObject value) {
        SubLTrampolineFile.checkType(v_object, ITP_SEMANTICS_P);
        return v_object.setField6(value);
    }

    public static SubLObject _csetf_itp_semantics_confidence(final SubLObject v_object, final SubLObject value) {
        assert NIL != rtp_constituent_weeders.itp_semantics_p(v_object) : "! rtp_constituent_weeders.itp_semantics_p(v_object) " + "rtp_constituent_weeders.itp_semantics_p error :" + v_object;
        return v_object.setField6(value);
    }

    public static final SubLObject make_itp_semantics_alt(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        {
            SubLObject v_new = new com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.$itp_semantics_native();
            SubLObject next = NIL;
            for (next = arglist; NIL != next; next = cddr(next)) {
                {
                    SubLObject current_arg = next.first();
                    SubLObject current_value = cadr(next);
                    SubLObject pcase_var = current_arg;
                    if (pcase_var.eql($CYCL)) {
                        com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders._csetf_itp_semantics_cycl(v_new, current_value);
                    } else {
                        if (pcase_var.eql($CATEGORY)) {
                            com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders._csetf_itp_semantics_category(v_new, current_value);
                        } else {
                            if (pcase_var.eql($FORCE)) {
                                com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders._csetf_itp_semantics_force(v_new, current_value);
                            } else {
                                if (pcase_var.eql($SUPPORTS)) {
                                    com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders._csetf_itp_semantics_supports(v_new, current_value);
                                } else {
                                    if (pcase_var.eql($CONFIDENCE)) {
                                        com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders._csetf_itp_semantics_confidence(v_new, current_value);
                                    } else {
                                        Errors.error($str_alt39$Invalid_slot__S_for_construction_, current_arg);
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

    public static SubLObject make_itp_semantics(SubLObject arglist) {
        if (arglist == UNPROVIDED) {
            arglist = NIL;
        }
        final SubLObject v_new = new com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.$itp_semantics_native();
        SubLObject next;
        SubLObject current_arg;
        SubLObject current_value;
        SubLObject pcase_var;
        for (next = NIL, next = arglist; NIL != next; next = cddr(next)) {
            current_arg = next.first();
            current_value = cadr(next);
            pcase_var = current_arg;
            if (pcase_var.eql($CYCL)) {
                rtp_constituent_weeders._csetf_itp_semantics_cycl(v_new, current_value);
            } else
                if (pcase_var.eql($CATEGORY)) {
                    rtp_constituent_weeders._csetf_itp_semantics_category(v_new, current_value);
                } else
                    if (pcase_var.eql($FORCE)) {
                        rtp_constituent_weeders._csetf_itp_semantics_force(v_new, current_value);
                    } else
                        if (pcase_var.eql($SUPPORTS)) {
                            rtp_constituent_weeders._csetf_itp_semantics_supports(v_new, current_value);
                        } else
                            if (pcase_var.eql($CONFIDENCE)) {
                                rtp_constituent_weeders._csetf_itp_semantics_confidence(v_new, current_value);
                            } else {
                                Errors.error(rtp_constituent_weeders.$str40$Invalid_slot__S_for_construction_, current_arg);
                            }




        }
        return v_new;
    }

    public static SubLObject visit_defstruct_itp_semantics(final SubLObject obj, final SubLObject visitor_fn) {
        funcall(visitor_fn, obj, $BEGIN, rtp_constituent_weeders.MAKE_ITP_SEMANTICS, FIVE_INTEGER);
        funcall(visitor_fn, obj, $SLOT, $CYCL, rtp_constituent_weeders.itp_semantics_cycl(obj));
        funcall(visitor_fn, obj, $SLOT, $CATEGORY, rtp_constituent_weeders.itp_semantics_category(obj));
        funcall(visitor_fn, obj, $SLOT, $FORCE, rtp_constituent_weeders.itp_semantics_force(obj));
        funcall(visitor_fn, obj, $SLOT, $SUPPORTS, rtp_constituent_weeders.itp_semantics_supports(obj));
        funcall(visitor_fn, obj, $SLOT, $CONFIDENCE, rtp_constituent_weeders.itp_semantics_confidence(obj));
        funcall(visitor_fn, obj, $END, rtp_constituent_weeders.MAKE_ITP_SEMANTICS, FIVE_INTEGER);
        return obj;
    }

    public static SubLObject visit_defstruct_object_itp_semantics_method(final SubLObject obj, final SubLObject visitor_fn) {
        return rtp_constituent_weeders.visit_defstruct_itp_semantics(obj, visitor_fn);
    }

    public static final SubLObject print_itp_semantics_alt(SubLObject itp, SubLObject stream, SubLObject depth) {
        {
            SubLObject cycl = com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.itp_semantics_cycl(itp);
            SubLObject category = com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.itp_semantics_category(itp);
            SubLObject force = com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.itp_semantics_force(itp);
            SubLObject supports = com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.itp_semantics_supports(itp);
            SubLObject confidence = com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.itp_semantics_confidence(itp);
            write_string($str_alt40$__ITP_SEMANTICS__CYCL_, stream, UNPROVIDED, UNPROVIDED);
            princ(cycl, stream);
            write_string($str_alt41$_, stream, UNPROVIDED, UNPROVIDED);
            if (category != $UNAVAILABLE) {
                write_string($str_alt43$CAT_, stream, UNPROVIDED, UNPROVIDED);
                princ(category, stream);
                write_string($str_alt41$_, stream, UNPROVIDED, UNPROVIDED);
            }
            if (force != $UNAVAILABLE) {
                write_string($str_alt44$FORCE_, stream, UNPROVIDED, UNPROVIDED);
                princ(force, stream);
                write_string($str_alt41$_, stream, UNPROVIDED, UNPROVIDED);
            }
            if (supports != $UNAVAILABLE) {
                write_string($str_alt45$SUPPORTS_, stream, UNPROVIDED, UNPROVIDED);
                princ(supports, stream);
                write_string($str_alt41$_, stream, UNPROVIDED, UNPROVIDED);
            }
            if (confidence != $UNAVAILABLE) {
                write_string($str_alt46$CONFIDENCE_, stream, UNPROVIDED, UNPROVIDED);
                princ(confidence, stream);
                write_string($str_alt41$_, stream, UNPROVIDED, UNPROVIDED);
            }
            write_string($str_alt47$_, stream, UNPROVIDED, UNPROVIDED);
        }
        return itp;
    }

    public static SubLObject print_itp_semantics(final SubLObject itp, final SubLObject stream, final SubLObject depth) {
        final SubLObject cycl = rtp_constituent_weeders.itp_semantics_cycl(itp);
        final SubLObject category = rtp_constituent_weeders.itp_semantics_category(itp);
        final SubLObject force = rtp_constituent_weeders.itp_semantics_force(itp);
        final SubLObject supports = rtp_constituent_weeders.itp_semantics_supports(itp);
        final SubLObject confidence = rtp_constituent_weeders.itp_semantics_confidence(itp);
        write_string(rtp_constituent_weeders.$str46$__ITP_SEMANTICS__CYCL_, stream, UNPROVIDED, UNPROVIDED);
        princ(cycl, stream);
        write_string(rtp_constituent_weeders.$$$_, stream, UNPROVIDED, UNPROVIDED);
        if (category != $UNAVAILABLE) {
            write_string(rtp_constituent_weeders.$str49$CAT_, stream, UNPROVIDED, UNPROVIDED);
            princ(category, stream);
            write_string(rtp_constituent_weeders.$$$_, stream, UNPROVIDED, UNPROVIDED);
        }
        if (force != $UNAVAILABLE) {
            write_string(rtp_constituent_weeders.$str50$FORCE_, stream, UNPROVIDED, UNPROVIDED);
            princ(force, stream);
            write_string(rtp_constituent_weeders.$$$_, stream, UNPROVIDED, UNPROVIDED);
        }
        if (supports != $UNAVAILABLE) {
            write_string(rtp_constituent_weeders.$str51$SUPPORTS_, stream, UNPROVIDED, UNPROVIDED);
            princ(supports, stream);
            write_string(rtp_constituent_weeders.$$$_, stream, UNPROVIDED, UNPROVIDED);
        }
        if (confidence != $UNAVAILABLE) {
            write_string(rtp_constituent_weeders.$str52$CONFIDENCE_, stream, UNPROVIDED, UNPROVIDED);
            princ(confidence, stream);
            write_string(rtp_constituent_weeders.$$$_, stream, UNPROVIDED, UNPROVIDED);
        }
        write_string(rtp_constituent_weeders.$str53$_, stream, UNPROVIDED, UNPROVIDED);
        return itp;
    }

    public static final SubLObject new_itp_semantics_alt(SubLObject cycl, SubLObject category, SubLObject force, SubLObject supports, SubLObject confidence) {
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
        {
            SubLObject semantics = com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.make_itp_semantics(UNPROVIDED);
            com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders._csetf_itp_semantics_cycl(semantics, cycl);
            com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders._csetf_itp_semantics_category(semantics, category);
            com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders._csetf_itp_semantics_force(semantics, force);
            com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders._csetf_itp_semantics_supports(semantics, supports);
            com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders._csetf_itp_semantics_confidence(semantics, confidence);
            return semantics;
        }
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
        final SubLObject semantics = rtp_constituent_weeders.make_itp_semantics(UNPROVIDED);
        rtp_constituent_weeders._csetf_itp_semantics_cycl(semantics, cycl);
        rtp_constituent_weeders._csetf_itp_semantics_category(semantics, category);
        rtp_constituent_weeders._csetf_itp_semantics_force(semantics, force);
        rtp_constituent_weeders._csetf_itp_semantics_supports(semantics, supports);
        rtp_constituent_weeders._csetf_itp_semantics_confidence(semantics, confidence);
        return semantics;
    }

    public static final SubLObject new_itp_semantics_conf_1_alt(SubLObject cycl) {
        {
            SubLObject result = com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.new_itp_semantics(cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders._csetf_itp_semantics_confidence(result, ONE_INTEGER);
            return result;
        }
    }

    public static SubLObject new_itp_semantics_conf_1(final SubLObject cycl) {
        final SubLObject result = rtp_constituent_weeders.new_itp_semantics(cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        rtp_constituent_weeders._csetf_itp_semantics_confidence(result, ONE_INTEGER);
        return result;
    }

    public static final SubLObject new_itp_semantics_conf_half_alt(SubLObject cycl) {
        {
            SubLObject result = com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.new_itp_semantics(cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders._csetf_itp_semantics_confidence(result, $float$0_5);
            return result;
        }
    }

    public static SubLObject new_itp_semantics_conf_half(final SubLObject cycl) {
        final SubLObject result = rtp_constituent_weeders.new_itp_semantics(cycl, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        rtp_constituent_weeders._csetf_itp_semantics_confidence(result, rtp_constituent_weeders.$float$0_5);
        return result;
    }

    /**
     * Returns a list of parse/probabiltiy pairs
     */
    @LispMethod(comment = "Returns a list of parse/probabiltiy pairs")
    public static final SubLObject rtp_parse_exp_ranked_alt(SubLObject string, SubLObject template, SubLObject mt) {
        return com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.rtp_rank_parses(string, iterative_template_parser.rtp_parse_exp(string, template, mt, UNPROVIDED));
    }

    /**
     * Returns a list of parse/probabiltiy pairs
     */
    @LispMethod(comment = "Returns a list of parse/probabiltiy pairs")
    public static SubLObject rtp_parse_exp_ranked(final SubLObject string, final SubLObject template, final SubLObject mt) {
        return rtp_constituent_weeders.rtp_rank_parses(string, iterative_template_parser.rtp_parse_exp(string, template, mt, UNPROVIDED));
    }

    public static final SubLObject rtp_vbar_templates_alt() {
        return NIL != kb_loaded() ? ((SubLObject) (com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.rtp_vbar_templates_cached())) : NIL;
    }

    public static SubLObject rtp_vbar_templates() {
        return NIL != kb_loaded() ? rtp_constituent_weeders.rtp_vbar_templates_cached() : NIL;
    }

    public static final SubLObject clear_rtp_vbar_templates_cached_alt() {
        {
            SubLObject cs = $rtp_vbar_templates_cached_caching_state$.getGlobalValue();
            if (NIL != cs) {
                memoization_state.caching_state_clear(cs);
            }
        }
        return NIL;
    }

    public static SubLObject clear_rtp_vbar_templates_cached() {
        final SubLObject cs = rtp_constituent_weeders.$rtp_vbar_templates_cached_caching_state$.getGlobalValue();
        if (NIL != cs) {
            caching_state_clear(cs);
        }
        return NIL;
    }

    public static final SubLObject remove_rtp_vbar_templates_cached_alt() {
        return memoization_state.caching_state_remove_function_results_with_args($rtp_vbar_templates_cached_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static SubLObject remove_rtp_vbar_templates_cached() {
        return caching_state_remove_function_results_with_args(rtp_constituent_weeders.$rtp_vbar_templates_cached_caching_state$.getGlobalValue(), list(EMPTY_SUBL_OBJECT_ARRAY), UNPROVIDED, UNPROVIDED);
    }

    public static final SubLObject rtp_vbar_templates_cached_internal_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject ans = NIL;
                {
                    SubLObject _prev_bind_0 = mt_relevance_macros.$relevant_mt_function$.currentBinding(thread);
                    SubLObject _prev_bind_1 = mt_relevance_macros.$mt$.currentBinding(thread);
                    try {
                        mt_relevance_macros.$relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
                        mt_relevance_macros.$mt$.bind($$EverythingPSC, thread);
                        ans = genls.all_specs($$VBarTemplate, UNPROVIDED, UNPROVIDED);
                    } finally {
                        mt_relevance_macros.$mt$.rebind(_prev_bind_1, thread);
                        mt_relevance_macros.$relevant_mt_function$.rebind(_prev_bind_0, thread);
                    }
                }
                return ans;
            }
        }
    }

    public static SubLObject rtp_vbar_templates_cached_internal() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject ans = NIL;
        final SubLObject _prev_bind_0 = $relevant_mt_function$.currentBinding(thread);
        final SubLObject _prev_bind_2 = $mt$.currentBinding(thread);
        try {
            $relevant_mt_function$.bind(RELEVANT_MT_IS_EVERYTHING, thread);
            $mt$.bind(rtp_constituent_weeders.$$EverythingPSC, thread);
            ans = all_specs(rtp_constituent_weeders.$$VBarTemplate, UNPROVIDED, UNPROVIDED);
        } finally {
            $mt$.rebind(_prev_bind_2, thread);
            $relevant_mt_function$.rebind(_prev_bind_0, thread);
        }
        return ans;
    }

    public static final SubLObject rtp_vbar_templates_cached_alt() {
        {
            SubLObject caching_state = $rtp_vbar_templates_cached_caching_state$.getGlobalValue();
            if (NIL == caching_state) {
                caching_state = memoization_state.create_global_caching_state_for_name(RTP_VBAR_TEMPLATES_CACHED, $rtp_vbar_templates_cached_caching_state$, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
            }
            {
                SubLObject results = memoization_state.caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
                if (results == $kw54$_MEMOIZED_ITEM_NOT_FOUND_) {
                    results = arg2(resetMultipleValues(), multiple_value_list(com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.rtp_vbar_templates_cached_internal()));
                    memoization_state.caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
                }
                return memoization_state.caching_results(results);
            }
        }
    }

    public static SubLObject rtp_vbar_templates_cached() {
        SubLObject caching_state = rtp_constituent_weeders.$rtp_vbar_templates_cached_caching_state$.getGlobalValue();
        if (NIL == caching_state) {
            caching_state = create_global_caching_state_for_name(rtp_constituent_weeders.RTP_VBAR_TEMPLATES_CACHED, rtp_constituent_weeders.$rtp_vbar_templates_cached_caching_state$, NIL, EQL, ZERO_INTEGER, ZERO_INTEGER);
        }
        SubLObject results = caching_state_get_zero_arg_results(caching_state, UNPROVIDED);
        if (results.eql($memoized_item_not_found$.getGlobalValue())) {
            results = arg2(resetMultipleValues(), multiple_value_list(rtp_constituent_weeders.rtp_vbar_templates_cached_internal()));
            caching_state_set_zero_arg_results(caching_state, results, UNPROVIDED);
        }
        return caching_results(results);
    }

    public static final SubLObject tp_possible_constitP_old_alt(SubLObject template_item, SubLObject words, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = rtp_vars.$rtp_syntactic_mt$.getDynamicValue();
        }
        if (NIL == rtp_type_checkers.rtp_recursive_itemP(template_item)) {
            return T;
        }
        {
            SubLObject category = template_item.first();
            SubLObject pcase_var = category;
            if (pcase_var.eql($$NPTemplate)) {
                if (NIL == com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.tp_valid_np(category, words, UNPROVIDED)) {
                    return NIL;
                }
            } else {
                if (pcase_var.eql($$VPTemplate)) {
                    if (NIL == com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.tp_valid_vp(category, words)) {
                        return NIL;
                    }
                } else {
                    if (pcase_var.eql($$NumberTemplate)) {
                        if (NIL == com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.tp_valid_number_p(words)) {
                            return NIL;
                        }
                    } else {
                        if (pcase_var.eql($$OrdinalTemplate)) {
                            if (NIL == com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.tp_valid_number_p(words)) {
                                return NIL;
                            }
                        } else {
                            if (pcase_var.eql($$QuantityTemplate)) {
                                if (NIL == com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.tp_valid_quantity_p(words)) {
                                    return NIL;
                                }
                            } else {
                                if (pcase_var.eql($$AdjPTemplate)) {
                                    if (NIL == com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.tp_valid_adjpP(words)) {
                                        return NIL;
                                    }
                                } else {
                                    if (pcase_var.eql($$AdjPTemplate_Predicative)) {
                                        if (NIL == com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.tp_valid_adjp_predP(words)) {
                                            return NIL;
                                        }
                                    } else {
                                        if (pcase_var.eql($$STemplate)) {
                                            if (NIL == com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.tp_valid_sP(words)) {
                                                return NIL;
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if ((NIL != com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.prepositional_categoryP(category)) && (NIL == com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.tp_valid_pp(category, words, mt))) {
                return NIL;
            }
            return T;
        }
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
        if (pcase_var.eql(rtp_constituent_weeders.$$NPTemplate)) {
            if (NIL == rtp_constituent_weeders.tp_valid_np(category, words, UNPROVIDED)) {
                return NIL;
            }
        } else
            if (pcase_var.eql(rtp_constituent_weeders.$$VPTemplate)) {
                if (NIL == rtp_constituent_weeders.tp_valid_vp(category, words)) {
                    return NIL;
                }
            } else
                if (pcase_var.eql(rtp_constituent_weeders.$$NumberTemplate)) {
                    if (NIL == rtp_constituent_weeders.tp_valid_number_p(words)) {
                        return NIL;
                    }
                } else
                    if (pcase_var.eql(rtp_constituent_weeders.$$OrdinalTemplate)) {
                        if (NIL == rtp_constituent_weeders.tp_valid_number_p(words)) {
                            return NIL;
                        }
                    } else
                        if (pcase_var.eql(rtp_constituent_weeders.$$QuantityTemplate)) {
                            if (NIL == rtp_constituent_weeders.tp_valid_quantity_p(words)) {
                                return NIL;
                            }
                        } else
                            if (pcase_var.eql(rtp_constituent_weeders.$$AdjPTemplate)) {
                                if (NIL == rtp_constituent_weeders.tp_valid_adjpP(words)) {
                                    return NIL;
                                }
                            } else
                                if (pcase_var.eql(rtp_constituent_weeders.$$AdjPTemplate_Predicative)) {
                                    if (NIL == rtp_constituent_weeders.tp_valid_adjp_predP(words)) {
                                        return NIL;
                                    }
                                } else
                                    if (pcase_var.eql(rtp_constituent_weeders.$$STemplate) && (NIL == rtp_constituent_weeders.tp_valid_sP(words))) {
                                        return NIL;
                                    }







        if ((NIL != rtp_constituent_weeders.prepositional_categoryP(category)) && (NIL == rtp_constituent_weeders.tp_valid_pp(category, words, mt))) {
            return NIL;
        }
        return T;
    }

    public static final SubLObject tp_possible_constitP_alt(SubLObject template_item, SubLObject words, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = rtp_vars.$rtp_syntactic_mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject category = template_item.first();
                SubLObject possibleP = T;
                if (NIL == $use_new_tp_possible_constitP$.getDynamicValue(thread)) {
                    possibleP = com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.tp_possible_constitP_old(template_item, words, mt);
                } else {
                    if (NIL == rtp_type_checkers.rtp_recursive_itemP(template_item)) {
                        possibleP = T;
                    } else {
                        if (((NIL == subl_promotions.memberP(category, $list_alt63, UNPROVIDED, UNPROVIDED)) && (NIL != list_utilities.lengthG(words, ONE_INTEGER, UNPROVIDED))) && (NIL != lexicon_utilities.wh_wordP(words.first()))) {
                            possibleP = makeBoolean((category == $$NPTemplate) && (NIL != com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.tp_valid_nbar_wordsP(words.rest(), UNPROVIDED)));
                        } else {
                            if (category == $$NPTemplate) {
                                possibleP = com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.tp_valid_np(category, words, UNPROVIDED);
                            } else {
                                if ((NIL != subl_promotions.memberP(category, $list_alt64, UNPROVIDED, UNPROVIDED)) && (NIL == com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.tp_valid_np(category, words, UNPROVIDED))) {
                                    possibleP = NIL;
                                } else {
                                    if (category == $$NBarTemplate) {
                                        possibleP = com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.tp_valid_nbar(category, words, UNPROVIDED);
                                    } else {
                                        if (category == $$VPTemplate) {
                                            possibleP = com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.tp_valid_vp(category, words);
                                        } else {
                                            if (NIL != member(category, com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.rtp_vbar_templates(), UNPROVIDED, UNPROVIDED)) {
                                                possibleP = com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.tp_valid_vbar(category, words);
                                            } else {
                                                if (category == $$NumberTemplate) {
                                                    possibleP = com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.tp_valid_number_p(words);
                                                } else {
                                                    if (category == $$OrdinalTemplate) {
                                                        possibleP = com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.tp_valid_number_p(words);
                                                    } else {
                                                        if (category == $$QuantityTemplate) {
                                                            possibleP = com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.tp_valid_quantity_p(words);
                                                        } else {
                                                            if (category == $$AdjPTemplate) {
                                                                possibleP = com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.tp_valid_adjpP(words);
                                                            } else {
                                                                if (category == $$AdjPTemplate_Predicative) {
                                                                    possibleP = com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.tp_valid_adjp_predP(words);
                                                                } else {
                                                                    if (category == $$STemplate) {
                                                                        possibleP = com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.tp_valid_sP(words);
                                                                    } else {
                                                                        if (NIL != com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.prepositional_categoryP(category)) {
                                                                            possibleP = com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.tp_valid_pp(category, words, mt);
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
                if ((NIL != $use_new_tp_possible_constitP$.getDynamicValue(thread)) && rtp_vars.$rtp_trace_level$.getDynamicValue(thread).isPositive()) {
                    if (possibleP != com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.tp_possible_constitP_old(template_item, words, mt)) {
                        if (rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
                            recognition.rtp_tracer_output(ONE_INTEGER, list($str_alt66$_S__S__S___new___S_old___S__, template_item, words, mt, possibleP, com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.tp_possible_constitP_old(template_item, words, mt)));
                        }
                    }
                }
                return possibleP;
            }
        }
    }

    public static SubLObject tp_possible_constitP(final SubLObject template_item, final SubLObject words, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = rtp_vars.$rtp_syntactic_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject category = template_item.first();
        SubLObject possibleP = T;
        if (NIL == rtp_constituent_weeders.$use_new_tp_possible_constitP$.getDynamicValue(thread)) {
            possibleP = rtp_constituent_weeders.tp_possible_constitP_old(template_item, words, mt);
        } else
            if (NIL == rtp_type_checkers.rtp_recursive_itemP(template_item)) {
                possibleP = T;
            } else
                if (((NIL == memberP(category, rtp_constituent_weeders.$list68, UNPROVIDED, UNPROVIDED)) && (NIL != lengthG(words, ONE_INTEGER, UNPROVIDED))) && (NIL != wh_wordP(words.first()))) {
                    possibleP = makeBoolean(category.eql(rtp_constituent_weeders.$$NPTemplate) && (NIL != rtp_constituent_weeders.tp_valid_nbar_wordsP(words.rest(), UNPROVIDED)));
                } else
                    if (category.eql(rtp_constituent_weeders.$$NPTemplate)) {
                        possibleP = rtp_constituent_weeders.tp_valid_np(category, words, UNPROVIDED);
                    } else
                        if ((NIL != memberP(category, rtp_constituent_weeders.$list69, UNPROVIDED, UNPROVIDED)) && (NIL == rtp_constituent_weeders.tp_valid_np(category, words, UNPROVIDED))) {
                            possibleP = NIL;
                        } else
                            if (category.eql(rtp_constituent_weeders.$$NBarTemplate)) {
                                possibleP = rtp_constituent_weeders.tp_valid_nbar(category, words, UNPROVIDED);
                            } else
                                if (category.eql(rtp_constituent_weeders.$$VPTemplate)) {
                                    possibleP = rtp_constituent_weeders.tp_valid_vp(category, words);
                                } else
                                    if (NIL != member(category, rtp_constituent_weeders.rtp_vbar_templates(), UNPROVIDED, UNPROVIDED)) {
                                        possibleP = rtp_constituent_weeders.tp_valid_vbar(category, words);
                                    } else
                                        if (category.eql(rtp_constituent_weeders.$$NumberTemplate)) {
                                            possibleP = rtp_constituent_weeders.tp_valid_number_p(words);
                                        } else
                                            if (category.eql(rtp_constituent_weeders.$$OrdinalTemplate)) {
                                                possibleP = rtp_constituent_weeders.tp_valid_number_p(words);
                                            } else
                                                if (category.eql(rtp_constituent_weeders.$$QuantityTemplate)) {
                                                    possibleP = rtp_constituent_weeders.tp_valid_quantity_p(words);
                                                } else
                                                    if (category.eql(rtp_constituent_weeders.$$AdjPTemplate)) {
                                                        possibleP = rtp_constituent_weeders.tp_valid_adjpP(words);
                                                    } else
                                                        if (category.eql(rtp_constituent_weeders.$$AdjPTemplate_Predicative)) {
                                                            possibleP = rtp_constituent_weeders.tp_valid_adjp_predP(words);
                                                        } else
                                                            if (category.eql(rtp_constituent_weeders.$$STemplate)) {
                                                                possibleP = rtp_constituent_weeders.tp_valid_sP(words);
                                                            } else
                                                                if (NIL != rtp_constituent_weeders.prepositional_categoryP(category)) {
                                                                    possibleP = rtp_constituent_weeders.tp_valid_pp(category, words, mt);
                                                                }














        if ((((NIL != rtp_constituent_weeders.$use_new_tp_possible_constitP$.getDynamicValue(thread)) && rtp_vars.$rtp_trace_level$.getDynamicValue(thread).isPositive()) && (!possibleP.eql(rtp_constituent_weeders.tp_possible_constitP_old(template_item, words, mt)))) && rtp_vars.$rtp_trace_level$.getDynamicValue(thread).numGE(ONE_INTEGER)) {
            recognition.rtp_tracer_output(ONE_INTEGER, list(rtp_constituent_weeders.$str71$_S__S__S___new___S_old___S__, template_item, words, mt, possibleP, rtp_constituent_weeders.tp_possible_constitP_old(template_item, words, mt)));
        }
        return possibleP;
    }

    public static final SubLObject tp_valid_nbar_alt(SubLObject category, SubLObject words, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = rtp_vars.$rtp_syntactic_mt$.getDynamicValue();
        }
        return com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.tp_valid_nbar_wordsP(words, mt);
    }

    public static SubLObject tp_valid_nbar(final SubLObject category, final SubLObject words, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = rtp_vars.$rtp_syntactic_mt$.getDynamicValue();
        }
        return rtp_constituent_weeders.tp_valid_nbar_wordsP(words, mt);
    }

    public static final SubLObject tp_valid_nbar_wordsP_alt(SubLObject words, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = rtp_vars.$rtp_syntactic_mt$.getDynamicValue();
        }
        if (NIL == words) {
            return T;
        } else {
            {
                SubLObject front_word = words.first();
                SubLObject back_word = last(words, UNPROVIDED).first();
                if (!((NIL != com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.valid_tp_nbar_end_stringP(back_word, mt)) && (NIL != com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.valid_tp_nbar_start_stringP(front_word)))) {
                    return NIL;
                }
            }
        }
        return T;
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
        if ((NIL == rtp_constituent_weeders.valid_tp_nbar_end_stringP(back_word, mt)) || (NIL == rtp_constituent_weeders.valid_tp_nbar_start_stringP(front_word))) {
            return NIL;
        }
        return T;
    }

    public static final SubLObject valid_tp_nbar_end_stringP_alt(SubLObject word, SubLObject mt) {
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

    public static SubLObject valid_tp_nbar_end_stringP(final SubLObject word, final SubLObject mt) {
        if (NIL != memberP(word, rtp_constituent_weeders.$valid_tp_non_starting_sentential_markers$.getGlobalValue(), rtp_vars.$tp_equal$.getGlobalValue(), UNPROVIDED)) {
            return T;
        }
        if (NIL != memberP(word, rtp_constituent_weeders.$invalid_tp_vp_end_punctuation$.getGlobalValue(), rtp_vars.$tp_equal$.getGlobalValue(), UNPROVIDED)) {
            return NIL;
        }
        if (NIL != funcall(rtp_vars.$tp_equal$.getGlobalValue(), word, rtp_constituent_weeders.$$$not)) {
            return NIL;
        }
        return T;
    }

    public static final SubLObject valid_tp_nbar_start_stringP_alt(SubLObject word) {
        if (NIL != subl_promotions.memberP(word, $valid_tp_non_starting_sentential_markers$.getGlobalValue(), rtp_vars.$tp_equal$.getGlobalValue(), UNPROVIDED)) {
            return NIL;
        }
        return com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.possible_tp_nbar_start_stringP(word);
    }

    public static SubLObject valid_tp_nbar_start_stringP(final SubLObject word) {
        if (NIL != memberP(word, rtp_constituent_weeders.$valid_tp_non_starting_sentential_markers$.getGlobalValue(), rtp_vars.$tp_equal$.getGlobalValue(), UNPROVIDED)) {
            return NIL;
        }
        return rtp_constituent_weeders.possible_tp_nbar_start_stringP(word);
    }

    public static final SubLObject tp_valid_np_alt(SubLObject category, SubLObject words, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = rtp_vars.$rtp_syntactic_mt$.getDynamicValue();
        }
        return com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.tp_valid_np_wordsP(words, mt);
    }

    public static SubLObject tp_valid_np(final SubLObject category, final SubLObject words, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = rtp_vars.$rtp_syntactic_mt$.getDynamicValue();
        }
        return rtp_constituent_weeders.tp_valid_np_wordsP(words, mt);
    }

    public static final SubLObject tp_valid_np_wordsP_alt(SubLObject words, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = rtp_vars.$rtp_syntactic_mt$.getDynamicValue();
        }
        if (NIL == words) {
            return T;
        } else {
            if (NIL != list_utilities.lengthE(words, ONE_INTEGER, UNPROVIDED)) {
                return com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.tp_valid_single_word_npP(words, mt);
            } else {
                if (NIL != rkf_string_weeders.rkf_unambiguous_non_possessive_pronoun_stringP(words.first())) {
                    return list_utilities.lengthE(words, ONE_INTEGER, UNPROVIDED);
                } else {
                    {
                        SubLObject front_word = words.first();
                        SubLObject back_word = last(words, UNPROVIDED).first();
                        if (!((NIL != com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.valid_tp_np_end_stringP(back_word, mt)) && (NIL != com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.valid_tp_np_start_stringP(front_word)))) {
                            return NIL;
                        }
                    }
                }
            }
        }
        return T;
    }

    public static SubLObject tp_valid_np_wordsP(final SubLObject words, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = rtp_vars.$rtp_syntactic_mt$.getDynamicValue();
        }
        if (NIL == words) {
            return T;
        }
        if (NIL != lengthE(words, ONE_INTEGER, UNPROVIDED)) {
            return rtp_constituent_weeders.tp_valid_single_word_npP(words, mt);
        }
        if (NIL != rkf_unambiguous_non_possessive_pronoun_stringP(words.first())) {
            return lengthE(words, ONE_INTEGER, UNPROVIDED);
        }
        final SubLObject front_word = words.first();
        final SubLObject back_word = last(words, UNPROVIDED).first();
        if ((NIL == rtp_constituent_weeders.valid_tp_np_end_stringP(back_word, mt)) || (NIL == rtp_constituent_weeders.valid_tp_np_start_stringP(front_word))) {
            return NIL;
        }
        return T;
    }

    public static final SubLObject tp_valid_single_word_npP_alt(SubLObject words, SubLObject mt) {
        return makeBoolean(((((NIL != rkf_string_weeders.rkf_pronoun_stringP(words.first())) || (NIL != rkf_string_weeders.rkf_noun_stringP(words.first(), mt))) || (NIL != rkf_string_weeders.rkf_name_stringP(words.first(), mt))) || (NIL != rkf_string_weeders.rkf_unknown_stringP(words.first(), mt))) || (NIL != rkf_string_weeders.rkf_number_stringP(words.first())));
    }

    public static SubLObject tp_valid_single_word_npP(final SubLObject words, final SubLObject mt) {
        return makeBoolean(((((NIL != rkf_pronoun_stringP(words.first())) || (NIL != rkf_noun_stringP(words.first(), mt))) || (NIL != rkf_name_stringP(words.first(), mt))) || (NIL != rkf_unknown_stringP(words.first(), mt))) || (NIL != rkf_number_stringP(words.first())));
    }

    public static final SubLObject valid_tp_np_end_stringP_alt(SubLObject word, SubLObject mt) {
        if (NIL != subl_promotions.memberP(word, $valid_tp_non_starting_sentential_markers$.getGlobalValue(), rtp_vars.$tp_equal$.getGlobalValue(), UNPROVIDED)) {
            return T;
        }
        if (NIL != subl_promotions.memberP(word, $invalid_tp_vp_end_punctuation$.getGlobalValue(), rtp_vars.$tp_equal$.getGlobalValue(), UNPROVIDED)) {
            return NIL;
        }
        if (NIL != funcall(rtp_vars.$tp_equal$.getGlobalValue(), word, $$$not)) {
            return NIL;
        }
        return com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.possible_tp_np_end_stringP(word, mt);
    }

    public static SubLObject valid_tp_np_end_stringP(final SubLObject word, final SubLObject mt) {
        if (NIL != memberP(word, rtp_constituent_weeders.$valid_tp_non_starting_sentential_markers$.getGlobalValue(), rtp_vars.$tp_equal$.getGlobalValue(), UNPROVIDED)) {
            return T;
        }
        if (NIL != memberP(word, rtp_constituent_weeders.$invalid_tp_vp_end_punctuation$.getGlobalValue(), rtp_vars.$tp_equal$.getGlobalValue(), UNPROVIDED)) {
            return NIL;
        }
        if (NIL != funcall(rtp_vars.$tp_equal$.getGlobalValue(), word, rtp_constituent_weeders.$$$not)) {
            return NIL;
        }
        return rtp_constituent_weeders.possible_tp_np_end_stringP(word, mt);
    }

    public static final SubLObject valid_tp_np_start_stringP_alt(SubLObject word) {
        if (NIL != subl_promotions.memberP(word, $valid_tp_non_starting_sentential_markers$.getGlobalValue(), rtp_vars.$tp_equal$.getGlobalValue(), UNPROVIDED)) {
            return NIL;
        }
        return com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.possible_tp_np_start_stringP(word);
    }

    public static SubLObject valid_tp_np_start_stringP(final SubLObject word) {
        if (NIL != memberP(word, rtp_constituent_weeders.$valid_tp_non_starting_sentential_markers$.getGlobalValue(), rtp_vars.$tp_equal$.getGlobalValue(), UNPROVIDED)) {
            return NIL;
        }
        return rtp_constituent_weeders.possible_tp_np_start_stringP(word);
    }

    /**
     * at a minimum, require that all sentences have verbs in them
     */
    @LispMethod(comment = "at a minimum, require that all sentences have verbs in them")
    public static final SubLObject tp_valid_sP_alt(SubLObject words) {
        {
            SubLObject found_a_verbP = NIL;
            SubLObject list_var = NIL;
            SubLObject word = NIL;
            SubLObject i = NIL;
            for (list_var = words, word = list_var.first(), i = ZERO_INTEGER; !((NIL != found_a_verbP) || (NIL == list_var)); list_var = list_var.rest() , word = list_var.first() , i = add(ONE_INTEGER, i)) {
                if (NIL != rkf_string_weeders.rkf_verb_stringP(word)) {
                    found_a_verbP = T;
                } else {
                    if (word.equal($str_alt68$_)) {
                        {
                            SubLObject next_word = nth(number_utilities.f_1X(i), words);
                            found_a_verbP = rkf_string_weeders.rkf_verb_stringP(cconcatenate(word, next_word));
                        }
                    }
                }
            }
            return found_a_verbP;
        }
    }

    /**
     * at a minimum, require that all sentences have verbs in them
     */
    @LispMethod(comment = "at a minimum, require that all sentences have verbs in them")
    public static SubLObject tp_valid_sP(final SubLObject words) {
        SubLObject found_a_verbP = NIL;
        SubLObject list_var = NIL;
        SubLObject word = NIL;
        SubLObject i = NIL;
        list_var = words;
        word = list_var.first();
        for (i = ZERO_INTEGER; (NIL == found_a_verbP) && (NIL != list_var); list_var = list_var.rest() , word = list_var.first() , i = add(ONE_INTEGER, i)) {
            if (NIL != rkf_verb_stringP(word)) {
                found_a_verbP = T;
            } else
                if (word.equal(rtp_constituent_weeders.$str73$_)) {
                    final SubLObject next_word = nth(f_1X(i), words);
                    found_a_verbP = rkf_verb_stringP(cconcatenate(word, next_word));
                }

        }
        return found_a_verbP;
    }

    public static final SubLObject tp_valid_vbar_alt(SubLObject category, SubLObject words) {
        if (NIL == words) {
            return T;
        }
        {
            SubLObject front_word = words.first();
            SubLObject back_word = list_utilities.last_one(words);
            if (!((NIL != com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.valid_tp_vp_end_stringP(back_word)) && (NIL != com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.valid_tp_vp_start_stringP(front_word)))) {
                return NIL;
            }
            {
                SubLObject list_var = NIL;
                SubLObject word = NIL;
                SubLObject i = NIL;
                for (list_var = words, word = list_var.first(), i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , word = list_var.first() , i = add(ONE_INTEGER, i)) {
                    if (NIL != rkf_string_weeders.rkf_verb_stringP(word)) {
                        return T;
                    } else {
                        if (word.equal($str_alt68$_)) {
                            {
                                SubLObject next_word = nth(number_utilities.f_1X(i), words);
                                if (NIL != rkf_string_weeders.rkf_verb_stringP(cconcatenate(word, next_word))) {
                                    return T;
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject tp_valid_vbar(final SubLObject category, final SubLObject words) {
        if (NIL == words) {
            return T;
        }
        final SubLObject front_word = words.first();
        final SubLObject back_word = last_one(words);
        if ((NIL == rtp_constituent_weeders.valid_tp_vp_end_stringP(back_word)) || (NIL == rtp_constituent_weeders.valid_tp_vp_start_stringP(front_word))) {
            return NIL;
        }
        SubLObject list_var = NIL;
        SubLObject word = NIL;
        SubLObject i = NIL;
        list_var = words;
        word = list_var.first();
        for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , word = list_var.first() , i = add(ONE_INTEGER, i)) {
            if (NIL != rkf_verb_stringP(word)) {
                return T;
            }
            if (word.equal(rtp_constituent_weeders.$str73$_)) {
                final SubLObject next_word = nth(f_1X(i), words);
                if (NIL != rkf_verb_stringP(cconcatenate(word, next_word))) {
                    return T;
                }
            }
        }
        return NIL;
    }

    /**
     *
     *
     * @unknown - Eliminate unambiguous modals and auxiliaries.
     */
    @LispMethod(comment = "@unknown - Eliminate unambiguous modals and auxiliaries.")
    public static final SubLObject valid_tp_vbar_start_stringP_alt(SubLObject word) {
        return com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.valid_tp_vp_start_stringP(word);
    }

    /**
     *
     *
     * @unknown - Eliminate unambiguous modals and auxiliaries.
     */
    @LispMethod(comment = "@unknown - Eliminate unambiguous modals and auxiliaries.")
    public static SubLObject valid_tp_vbar_start_stringP(final SubLObject word) {
        return rtp_constituent_weeders.valid_tp_vp_start_stringP(word);
    }

    public static final SubLObject valid_tp_vbar_end_stringP_alt(SubLObject word) {
        return com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.valid_tp_vp_end_stringP(word);
    }

    public static SubLObject valid_tp_vbar_end_stringP(final SubLObject word) {
        return rtp_constituent_weeders.valid_tp_vp_end_stringP(word);
    }

    public static final SubLObject tp_valid_vp_alt(SubLObject category, SubLObject words) {
        if (NIL == words) {
            return T;
        }
        {
            SubLObject front_word = words.first();
            SubLObject back_word = last(words, UNPROVIDED).first();
            if (!((NIL != com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.valid_tp_vp_end_stringP(back_word)) && (NIL != com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.valid_tp_vp_start_stringP(front_word)))) {
                return NIL;
            }
            {
                SubLObject list_var = NIL;
                SubLObject word = NIL;
                SubLObject i = NIL;
                for (list_var = words, word = list_var.first(), i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , word = list_var.first() , i = add(ONE_INTEGER, i)) {
                    if (NIL != rkf_string_weeders.rkf_verb_stringP(word)) {
                        return T;
                    } else {
                        if (word.equal($str_alt68$_)) {
                            {
                                SubLObject next_word = nth(number_utilities.f_1X(i), words);
                                if (NIL != rkf_string_weeders.rkf_verb_stringP(cconcatenate(word, next_word))) {
                                    return T;
                                }
                            }
                        }
                    }
                }
            }
            return NIL;
        }
    }

    public static SubLObject tp_valid_vp(final SubLObject category, final SubLObject words) {
        if (NIL == words) {
            return T;
        }
        final SubLObject front_word = words.first();
        final SubLObject back_word = last(words, UNPROVIDED).first();
        if ((NIL == rtp_constituent_weeders.valid_tp_vp_end_stringP(back_word)) || (NIL == rtp_constituent_weeders.valid_tp_vp_start_stringP(front_word))) {
            return NIL;
        }
        SubLObject list_var = NIL;
        SubLObject word = NIL;
        SubLObject i = NIL;
        list_var = words;
        word = list_var.first();
        for (i = ZERO_INTEGER; NIL != list_var; list_var = list_var.rest() , word = list_var.first() , i = add(ONE_INTEGER, i)) {
            if (NIL != rkf_verb_stringP(word)) {
                return T;
            }
            if (word.equal(rtp_constituent_weeders.$str73$_)) {
                final SubLObject next_word = nth(f_1X(i), words);
                if (NIL != rkf_verb_stringP(cconcatenate(word, next_word))) {
                    return T;
                }
            }
        }
        return NIL;
    }

    public static final SubLObject valid_tp_vp_start_stringP_alt(SubLObject word) {
        if (NIL != com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.rtp_contraction_elementP(word)) {
            return T;
        } else {
            if (word.equalp($$$not) || ((NIL != rkf_string_weeders.rkf_preposition_stringP(word)) && (NIL == rkf_string_weeders.rkf_verb_stringP(word)))) {
                return NIL;
            } else {
                return com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.possible_tp_vp_start_stringP(word);
            }
        }
    }

    public static SubLObject valid_tp_vp_start_stringP(final SubLObject word) {
        if (NIL != rtp_constituent_weeders.rtp_contraction_elementP(word)) {
            return T;
        }
        if (word.equalp(rtp_constituent_weeders.$$$not) || ((NIL != rkf_preposition_stringP(word)) && (NIL == rkf_verb_stringP(word)))) {
            return NIL;
        }
        return rtp_constituent_weeders.possible_tp_vp_start_stringP(word);
    }

    public static final SubLObject valid_tp_vp_end_stringP_alt(SubLObject word) {
        if (NIL != subl_promotions.memberP(word, $invalid_tp_vp_end_punctuation$.getGlobalValue(), symbol_function(STRING_EQUAL), UNPROVIDED)) {
            return NIL;
        }
        return com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.possible_tp_vp_end_stringP(word);
    }

    public static SubLObject valid_tp_vp_end_stringP(final SubLObject word) {
        if (NIL != memberP(word, rtp_constituent_weeders.$invalid_tp_vp_end_punctuation$.getGlobalValue(), symbol_function(STRING_EQUAL), UNPROVIDED)) {
            return NIL;
        }
        return rtp_constituent_weeders.possible_tp_vp_end_stringP(word);
    }

    public static final SubLObject tp_unambiguous_verbP_alt(SubLObject word, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return makeBoolean(((NIL != rkf_string_weeders.rkf_verb_stringP(word)) && (NIL == lexicon_accessors.denots_of_name_string(word, lexicon_vars.$misspellingsP$.getDynamicValue(thread), mt, UNPROVIDED))) && (NIL == list_utilities.sublisp_boolean(list_utilities.find_if_not($sym70$VERBAL_CATEGORY_, lexicon_accessors.pos_of_string(word, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED))));
        }
    }

    public static SubLObject tp_unambiguous_verbP(final SubLObject word, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $lexicon_lookup_mt$.getDynamicValue();
        }
        final SubLThread thread = SubLProcess.currentSubLThread();
        return makeBoolean(((NIL != rkf_verb_stringP(word)) && (NIL == denots_of_name_string(word, $misspellingsP$.getDynamicValue(thread), mt, UNPROVIDED))) && (NIL == sublisp_boolean(find_if_not(rtp_constituent_weeders.$sym75$VERBAL_CATEGORY_, pos_of_string(word, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED, UNPROVIDED))));
    }

    /**
     * could WORDS be a number?
     *
     * @param WORDS
     * 		list; a list of strings
     */
    @LispMethod(comment = "could WORDS be a number?\r\n\r\n@param WORDS\r\n\t\tlist; a list of strings")
    public static final SubLObject tp_valid_number_p_alt(SubLObject words) {
        if (!(((NIL != com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.number_prefix_p(words.first())) || (NIL != string_utilities_lexical.denots_english_number_p(words.first()))) && (NIL != string_utilities_lexical.denots_english_number_p(last(words, UNPROVIDED).first())))) {
            return NIL;
        }
        return T;
    }

    /**
     * could WORDS be a number?
     *
     * @param WORDS
     * 		list; a list of strings
     */
    @LispMethod(comment = "could WORDS be a number?\r\n\r\n@param WORDS\r\n\t\tlist; a list of strings")
    public static SubLObject tp_valid_number_p(final SubLObject words) {
        if (((NIL == rtp_constituent_weeders.number_prefix_p(words.first())) && (NIL == denots_english_number_p(words.first()))) || (NIL == denots_english_number_p(last(words, UNPROVIDED).first()))) {
            return NIL;
        }
        return T;
    }

    public static final SubLObject number_prefix_p_alt(SubLObject string) {
        return member(string, $list_alt71, $sym72$STRING_, UNPROVIDED);
    }

    public static SubLObject number_prefix_p(final SubLObject string) {
        return member(string, rtp_constituent_weeders.$list76, rtp_constituent_weeders.$sym77$STRING_, UNPROVIDED);
    }

    /**
     *
     *
     * @return BOOLEAN; Is STRING a possible first string in a VP, as defined
    by the Template Parser?
     */
    @LispMethod(comment = "@return BOOLEAN; Is STRING a possible first string in a VP, as defined\r\nby the Template Parser?")
    public static final SubLObject possible_tp_vp_start_stringP_alt(SubLObject string) {
        return makeBoolean(((NIL != com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.rtp_contraction_elementP(string)) || (NIL != rkf_string_weeders.rkf_verb_stringP(string))) || (NIL != rkf_string_weeders.rkf_adverb_stringP(string)));
    }

    /**
     *
     *
     * @return BOOLEAN; Is STRING a possible first string in a VP, as defined
    by the Template Parser?
     */
    @LispMethod(comment = "@return BOOLEAN; Is STRING a possible first string in a VP, as defined\r\nby the Template Parser?")
    public static SubLObject possible_tp_vp_start_stringP(final SubLObject string) {
        return makeBoolean(((NIL != rtp_constituent_weeders.rtp_contraction_elementP(string)) || (NIL != rkf_verb_stringP(string))) || (NIL != rkf_adverb_stringP(string)));
    }

    public static final SubLObject rtp_contraction_elementP_alt(SubLObject string) {
        return member(string, com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.get_contraction_elements(), EQUALP, UNPROVIDED);
    }

    public static SubLObject rtp_contraction_elementP(final SubLObject string) {
        return member(string, rtp_constituent_weeders.get_contraction_elements(), EQUALP, UNPROVIDED);
    }

    public static final SubLObject get_contraction_elements_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            if (NIL == $rtp_contraction_elements$.getDynamicValue(thread)) {
                rtp_datastructures.maybe_initialize_rtp_contractions_table(UNPROVIDED);
                {
                    SubLObject cdolist_list_var = rtp_datastructures.$rtp_contractions_table$.getDynamicValue(thread);
                    SubLObject alist_elt = NIL;
                    for (alist_elt = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , alist_elt = cdolist_list_var.first()) {
                        {
                            SubLObject cdolist_list_var_1 = alist_elt.rest().first();
                            SubLObject contraction = NIL;
                            for (contraction = cdolist_list_var_1.first(); NIL != cdolist_list_var_1; cdolist_list_var_1 = cdolist_list_var_1.rest() , contraction = cdolist_list_var_1.first()) {
                                {
                                    SubLObject cdolist_list_var_2 = list_utilities.find_all_if(STRINGP, contraction, UNPROVIDED);
                                    SubLObject contraction_elt = NIL;
                                    for (contraction_elt = cdolist_list_var_2.first(); NIL != cdolist_list_var_2; cdolist_list_var_2 = cdolist_list_var_2.rest() , contraction_elt = cdolist_list_var_2.first()) {
                                        {
                                            SubLObject item_var = contraction_elt;
                                            if (NIL == member(item_var, $rtp_contraction_elements$.getDynamicValue(thread), EQUAL, symbol_function(IDENTITY))) {
                                                $rtp_contraction_elements$.setDynamicValue(cons(item_var, $rtp_contraction_elements$.getDynamicValue(thread)), thread);
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
            return $rtp_contraction_elements$.getDynamicValue(thread);
        }
    }

    public static SubLObject get_contraction_elements() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == rtp_constituent_weeders.$rtp_contraction_elements$.getDynamicValue(thread)) {
            rtp_datastructures.maybe_initialize_rtp_contractions_table(UNPROVIDED);
            SubLObject cdolist_list_var = rtp_datastructures.$rtp_contractions_table$.getDynamicValue(thread);
            SubLObject alist_elt = NIL;
            alist_elt = cdolist_list_var.first();
            while (NIL != cdolist_list_var) {
                SubLObject cdolist_list_var_$1 = alist_elt.rest().first();
                SubLObject contraction = NIL;
                contraction = cdolist_list_var_$1.first();
                while (NIL != cdolist_list_var_$1) {
                    SubLObject cdolist_list_var_$2 = find_all_if(STRINGP, contraction, UNPROVIDED);
                    SubLObject contraction_elt = NIL;
                    contraction_elt = cdolist_list_var_$2.first();
                    while (NIL != cdolist_list_var_$2) {
                        final SubLObject item_var = contraction_elt;
                        if (NIL == member(item_var, rtp_constituent_weeders.$rtp_contraction_elements$.getDynamicValue(thread), EQUAL, symbol_function(IDENTITY))) {
                            rtp_constituent_weeders.$rtp_contraction_elements$.setDynamicValue(cons(item_var, rtp_constituent_weeders.$rtp_contraction_elements$.getDynamicValue(thread)), thread);
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
        return rtp_constituent_weeders.$rtp_contraction_elements$.getDynamicValue(thread);
    }

    /**
     *
     *
     * @return BOOLEAN; Is STRING a possible final string in an NP , as defined
    by the Template Parser?
     */
    @LispMethod(comment = "@return BOOLEAN; Is STRING a possible final string in an NP , as defined\r\nby the Template Parser?")
    public static final SubLObject possible_tp_vp_end_stringP_alt(SubLObject string) {
        return makeBoolean(NIL == com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.impossible_tp_phrase_end_stringP(string));
    }

    /**
     *
     *
     * @return BOOLEAN; Is STRING a possible final string in an NP , as defined
    by the Template Parser?
     */
    @LispMethod(comment = "@return BOOLEAN; Is STRING a possible final string in an NP , as defined\r\nby the Template Parser?")
    public static SubLObject possible_tp_vp_end_stringP(final SubLObject string) {
        return makeBoolean(NIL == rtp_constituent_weeders.impossible_tp_phrase_end_stringP(string));
    }

    /**
     *
     *
     * @return BOOLEAN; Is STRING a possible initial string in an NP , as defined
    by the Template Parser?
     */
    @LispMethod(comment = "@return BOOLEAN; Is STRING a possible initial string in an NP , as defined\r\nby the Template Parser?")
    public static final SubLObject possible_tp_np_start_stringP_alt(SubLObject string) {
        if (string.equalp($$$how)) {
            return T;
        }
        return makeBoolean((NIL == lexicon_accessors.verb_only_stringP(string)) && ((NIL != com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.confusing_np_start_stringP(string)) || (!((NIL != rkf_string_weeders.rkf_preposition_stringP(string)) || (NIL != rkf_string_weeders.rkf_conjunction_stringP(string))))));
    }

    /**
     *
     *
     * @return BOOLEAN; Is STRING a possible initial string in an NP , as defined
    by the Template Parser?
     */
    @LispMethod(comment = "@return BOOLEAN; Is STRING a possible initial string in an NP , as defined\r\nby the Template Parser?")
    public static SubLObject possible_tp_np_start_stringP(final SubLObject string) {
        if (string.equalp(rtp_constituent_weeders.$$$how)) {
            return T;
        }
        return makeBoolean((NIL == verb_only_stringP(string)) && ((NIL != rtp_constituent_weeders.confusing_np_start_stringP(string)) || ((NIL == rkf_preposition_stringP(string)) && (NIL == rkf_conjunction_stringP(string)))));
    }

    /**
     *
     *
     * @return BOOLEAN; Is STRING a possible initial string in an NBAR , as defined
    by the Template Parser?
     */
    @LispMethod(comment = "@return BOOLEAN; Is STRING a possible initial string in an NBAR , as defined\r\nby the Template Parser?")
    public static final SubLObject possible_tp_nbar_start_stringP_alt(SubLObject string) {
        return makeBoolean((NIL == lexicon_accessors.verb_only_stringP(string)) && ((NIL != com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.confusing_nbar_start_stringP(string)) || (!(((NIL != rkf_string_weeders.rkf_preposition_stringP(string)) || (NIL != rkf_string_weeders.rkf_determiner_stringP(string))) || (NIL != rkf_string_weeders.rkf_conjunction_stringP(string))))));
    }

    /**
     *
     *
     * @return BOOLEAN; Is STRING a possible initial string in an NBAR , as defined
    by the Template Parser?
     */
    @LispMethod(comment = "@return BOOLEAN; Is STRING a possible initial string in an NBAR , as defined\r\nby the Template Parser?")
    public static SubLObject possible_tp_nbar_start_stringP(final SubLObject string) {
        return makeBoolean((NIL == verb_only_stringP(string)) && ((NIL != rtp_constituent_weeders.confusing_nbar_start_stringP(string)) || (((NIL == rkf_preposition_stringP(string)) && (NIL == rkf_determiner_stringP(string))) && (NIL == rkf_conjunction_stringP(string)))));
    }

    public static final SubLObject possible_tp_pp_start_stringP_alt(SubLObject string) {
        return rkf_string_weeders.rkf_preposition_stringP(string);
    }

    public static SubLObject possible_tp_pp_start_stringP(final SubLObject string) {
        return rkf_preposition_stringP(string);
    }

    public static final SubLObject possible_tp_pp_end_stringP_alt(SubLObject string, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        return com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.possible_tp_np_end_stringP(string, mt);
    }

    public static SubLObject possible_tp_pp_end_stringP(final SubLObject string, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $lexicon_lookup_mt$.getDynamicValue();
        }
        return rtp_constituent_weeders.possible_tp_np_end_stringP(string, mt);
    }

    /**
     *
     *
     * @return BOOLEAN; Is STRING a possible final string in an NP , as defined
    by the Template Parser?
     */
    @LispMethod(comment = "@return BOOLEAN; Is STRING a possible final string in an NP , as defined\r\nby the Template Parser?")
    public static final SubLObject possible_tp_np_end_stringP_alt(SubLObject string, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = lexicon_vars.$lexicon_lookup_mt$.getDynamicValue();
        }
        return makeBoolean(((((NIL != rkf_string_weeders.rkf_pronoun_stringP(string)) || (NIL != rkf_string_weeders.rkf_preposition_stringP(string))) || (NIL != rkf_string_weeders.rkf_noun_stringP(string, mt))) || (NIL != rkf_string_weeders.rkf_number_stringP(string))) || (NIL == lexicon_accessors.closed_lexical_class_stringP(string, UNPROVIDED)));
    }

    /**
     *
     *
     * @return BOOLEAN; Is STRING a possible final string in an NP , as defined
    by the Template Parser?
     */
    @LispMethod(comment = "@return BOOLEAN; Is STRING a possible final string in an NP , as defined\r\nby the Template Parser?")
    public static SubLObject possible_tp_np_end_stringP(final SubLObject string, SubLObject mt) {
        if (mt == UNPROVIDED) {
            mt = $lexicon_lookup_mt$.getDynamicValue();
        }
        return makeBoolean(((((NIL != rkf_pronoun_stringP(string)) || (NIL != rkf_preposition_stringP(string))) || (NIL != rkf_noun_stringP(string, mt))) || (NIL != rkf_number_stringP(string))) || (NIL == closed_lexical_class_stringP(string, UNPROVIDED)));
    }

    /**
     *
     *
     * @return BOOLEAN: Can string ever be legally the end of a phrase?
     */
    @LispMethod(comment = "@return BOOLEAN: Can string ever be legally the end of a phrase?")
    public static final SubLObject impossible_tp_phrase_end_stringP_alt(SubLObject string) {
        return makeBoolean(((((((NIL == rkf_string_weeders.rkf_noun_stringP(string, UNPROVIDED)) && (NIL == rkf_string_weeders.rkf_pronoun_stringP(string))) && (NIL == rkf_string_weeders.rkf_verb_stringP(string))) && (NIL == rkf_string_weeders.rkf_adverb_stringP(string))) && (NIL == rkf_string_weeders.rkf_preposition_stringP(string))) && (NIL == rkf_string_weeders.rkf_adjective_stringP(string))) && ((NIL != rkf_string_weeders.rkf_conjunction_stringP(string)) || (NIL != rkf_string_weeders.rkf_determiner_stringP(string))));
    }

    /**
     *
     *
     * @return BOOLEAN: Can string ever be legally the end of a phrase?
     */
    @LispMethod(comment = "@return BOOLEAN: Can string ever be legally the end of a phrase?")
    public static SubLObject impossible_tp_phrase_end_stringP(final SubLObject string) {
        return makeBoolean(((((((NIL == rkf_noun_stringP(string, UNPROVIDED)) && (NIL == rkf_pronoun_stringP(string))) && (NIL == rkf_verb_stringP(string))) && (NIL == rkf_adverb_stringP(string))) && (NIL == rkf_preposition_stringP(string))) && (NIL == rkf_adjective_stringP(string))) && ((NIL != rkf_conjunction_stringP(string)) || (NIL != rkf_determiner_stringP(string))));
    }

    public static final SubLObject confusing_np_start_stringP_alt(SubLObject string) {
        return member(string, $confusing_np_start_strings$.getGlobalValue(), symbol_function(EQUALP), UNPROVIDED);
    }

    public static SubLObject confusing_np_start_stringP(final SubLObject string) {
        return member(string, rtp_constituent_weeders.$confusing_np_start_strings$.getGlobalValue(), symbol_function(EQUALP), UNPROVIDED);
    }

    public static final SubLObject confusing_nbar_start_stringP_alt(SubLObject string) {
        return member(string, $confusing_nbar_start_strings$.getGlobalValue(), symbol_function(EQUALP), UNPROVIDED);
    }

    public static SubLObject confusing_nbar_start_stringP(final SubLObject string) {
        return member(string, rtp_constituent_weeders.$confusing_nbar_start_strings$.getGlobalValue(), symbol_function(EQUALP), UNPROVIDED);
    }

    /**
     * could WORDS be a quantity?
     *
     * @param WORDS
     * 		list; a list of strings
     * @unknown This will get stale from time to time, and needs to be flushed periodically
     */
    @LispMethod(comment = "could WORDS be a quantity?\r\n\r\n@param WORDS\r\n\t\tlist; a list of strings\r\n@unknown This will get stale from time to time, and needs to be flushed periodically")
    public static final SubLObject tp_valid_quantity_p_alt(SubLObject words) {
        if (NIL == $quantity_strings$.getGlobalValue()) {
            $quantity_strings$.setGlobalValue(com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.get_quantity_strings());
        }
        return set.set_memberP(string_utilities.bunge(words, UNPROVIDED), $quantity_strings$.getGlobalValue());
    }

    /**
     * could WORDS be a quantity?
     *
     * @param WORDS
     * 		list; a list of strings
     * @unknown This will get stale from time to time, and needs to be flushed periodically
     */
    @LispMethod(comment = "could WORDS be a quantity?\r\n\r\n@param WORDS\r\n\t\tlist; a list of strings\r\n@unknown This will get stale from time to time, and needs to be flushed periodically")
    public static SubLObject tp_valid_quantity_p(final SubLObject words) {
        if (NIL == rtp_constituent_weeders.$quantity_strings$.getGlobalValue()) {
            rtp_constituent_weeders.$quantity_strings$.setGlobalValue(rtp_constituent_weeders.get_quantity_strings());
        }
        return set_memberP(bunge(words, UNPROVIDED), rtp_constituent_weeders.$quantity_strings$.getGlobalValue());
    }

    public static final SubLObject clear_tp_valid_quantity_p_alt() {
        $quantity_strings$.setGlobalValue(NIL);
        return $CLEARED;
    }

    public static SubLObject clear_tp_valid_quantity_p() {
        rtp_constituent_weeders.$quantity_strings$.setGlobalValue(NIL);
        return $CLEARED;
    }

    public static final SubLObject reset_tp_valid_quantity_p_alt() {
        $quantity_strings$.setGlobalValue(com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.get_quantity_strings());
        return $RESET;
    }

    public static SubLObject reset_tp_valid_quantity_p() {
        rtp_constituent_weeders.$quantity_strings$.setGlobalValue(rtp_constituent_weeders.get_quantity_strings());
        return $RESET;
    }

    public static final SubLObject get_quantity_strings_alt() {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject result_set = set.new_set(EQUALP, UNPROVIDED);
                SubLObject term_list = cons($$PhysicalPartOfObject, backward.removal_ask_variable($X, $list_alt81, NIL != rtp_vars.$rtp_semantic_mt$.getDynamicValue(thread) ? ((SubLObject) (rtp_vars.$rtp_semantic_mt$.getDynamicValue(thread))) : $$InferencePSC, UNPROVIDED, UNPROVIDED));
                SubLObject cdolist_list_var = term_list;
                SubLObject v_term = NIL;
                for (v_term = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , v_term = cdolist_list_var.first()) {
                    if (!((NIL != nart_handles.nart_p(v_term)) && (NIL != isa.isaP(v_term, $$LogicalField, UNPROVIDED, UNPROVIDED)))) {
                        {
                            SubLObject cdolist_list_var_3 = pph_methods_lexicon.all_phrases_for_term(v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                            SubLObject item = NIL;
                            for (item = cdolist_list_var_3.first(); NIL != cdolist_list_var_3; cdolist_list_var_3 = cdolist_list_var_3.rest() , item = cdolist_list_var_3.first()) {
                                set.set_add(item, result_set);
                            }
                        }
                    }
                }
                return result_set;
            }
        }
    }

    public static SubLObject get_quantity_strings() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject result_set = new_set(EQUALP, UNPROVIDED);
        SubLObject cdolist_list_var;
        final SubLObject term_list = cdolist_list_var = cons(rtp_constituent_weeders.$$PhysicalPartOfObject, removal_ask_variable($X, rtp_constituent_weeders.$list86, NIL != rtp_vars.$rtp_semantic_mt$.getDynamicValue(thread) ? rtp_vars.$rtp_semantic_mt$.getDynamicValue(thread) : rtp_constituent_weeders.$$InferencePSC, UNPROVIDED, UNPROVIDED));
        SubLObject v_term = NIL;
        v_term = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL == nart_p(v_term)) || (NIL == isaP(v_term, rtp_constituent_weeders.$$LogicalField, UNPROVIDED, UNPROVIDED))) {
                SubLObject cdolist_list_var_$3 = all_phrases_for_term(v_term, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED, UNPROVIDED);
                SubLObject item = NIL;
                item = cdolist_list_var_$3.first();
                while (NIL != cdolist_list_var_$3) {
                    set_add(item, result_set);
                    cdolist_list_var_$3 = cdolist_list_var_$3.rest();
                    item = cdolist_list_var_$3.first();
                } 
            }
            cdolist_list_var = cdolist_list_var.rest();
            v_term = cdolist_list_var.first();
        } 
        return result_set;
    }

    /**
     *
     *
     * @unknown would like to check the kb for valid templates
     */
    @LispMethod(comment = "@unknown would like to check the kb for valid templates")
    public static final SubLObject prepositional_categoryP_alt(SubLObject category) {
        return subl_promotions.memberP(category, $prepositional_category_templates$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @unknown would like to check the kb for valid templates
     */
    @LispMethod(comment = "@unknown would like to check the kb for valid templates")
    public static SubLObject prepositional_categoryP(final SubLObject category) {
        return memberP(category, rtp_constituent_weeders.$prepositional_category_templates$.getGlobalValue(), UNPROVIDED, UNPROVIDED);
    }

    /**
     *
     *
     * @unknown should check first word for template match?
     */
    @LispMethod(comment = "@unknown should check first word for template match?")
    public static final SubLObject tp_valid_pp_alt(SubLObject category, SubLObject words, SubLObject mt) {
        if (NIL == words) {
            return T;
        }
        if (length(words).numL(TWO_INTEGER)) {
            return NIL;
        }
        {
            SubLObject front_word = words.first();
            SubLObject back_word = last(words, UNPROVIDED).first();
            if (!((NIL != com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.valid_tp_pp_end_stringP(back_word, mt)) && (NIL != com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.valid_tp_pp_start_stringP(front_word)))) {
                return NIL;
            }
            {
                SubLObject cdolist_list_var = words;
                SubLObject word = NIL;
                for (word = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , word = cdolist_list_var.first()) {
                    if ((NIL != com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.tp_unambiguous_verbP(word, UNPROVIDED)) && (NIL == rkf_string_weeders.rkf_adjective_stringP(word))) {
                        return NIL;
                    }
                }
            }
        }
        return T;
    }

    /**
     *
     *
     * @unknown should check first word for template match?
     */
    @LispMethod(comment = "@unknown should check first word for template match?")
    public static SubLObject tp_valid_pp(final SubLObject category, final SubLObject words, final SubLObject mt) {
        if (NIL == words) {
            return T;
        }
        if (length(words).numL(TWO_INTEGER)) {
            return NIL;
        }
        final SubLObject front_word = words.first();
        final SubLObject back_word = last(words, UNPROVIDED).first();
        if ((NIL == rtp_constituent_weeders.valid_tp_pp_end_stringP(back_word, mt)) || (NIL == rtp_constituent_weeders.valid_tp_pp_start_stringP(front_word))) {
            return NIL;
        }
        SubLObject cdolist_list_var = words;
        SubLObject word = NIL;
        word = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            if ((NIL != rtp_constituent_weeders.tp_unambiguous_verbP(word, UNPROVIDED)) && (NIL == rkf_adjective_stringP(word))) {
                return NIL;
            }
            cdolist_list_var = cdolist_list_var.rest();
            word = cdolist_list_var.first();
        } 
        return T;
    }

    public static final SubLObject valid_tp_pp_end_stringP_alt(SubLObject word, SubLObject mt) {
        if (NIL != subl_promotions.memberP(word, $invalid_tp_vp_end_punctuation$.getGlobalValue(), symbol_function(STRING_EQUAL), UNPROVIDED)) {
            return NIL;
        }
        return com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.possible_tp_pp_end_stringP(word, mt);
    }

    public static SubLObject valid_tp_pp_end_stringP(final SubLObject word, final SubLObject mt) {
        if (NIL != memberP(word, rtp_constituent_weeders.$invalid_tp_vp_end_punctuation$.getGlobalValue(), symbol_function(STRING_EQUAL), UNPROVIDED)) {
            return NIL;
        }
        return rtp_constituent_weeders.possible_tp_pp_end_stringP(word, mt);
    }

    public static final SubLObject valid_tp_pp_start_stringP_alt(SubLObject word) {
        return com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.possible_tp_pp_start_stringP(word);
    }

    public static SubLObject valid_tp_pp_start_stringP(final SubLObject word) {
        return rtp_constituent_weeders.possible_tp_pp_start_stringP(word);
    }

    public static final SubLObject tp_valid_adjpP_alt(SubLObject words) {
        {
            SubLObject first_word = words.first();
            SubLObject last_word = last(words, UNPROVIDED).first();
            return makeBoolean(((NIL != rkf_string_weeders.rkf_adjective_stringP(first_word)) || ((NIL == rkf_string_weeders.rkf_determiner_stringP(first_word)) && (NIL == rkf_string_weeders.rkf_conjunction_stringP(first_word)))) && (NIL != rkf_string_weeders.rkf_adjective_stringP(last_word)));
        }
    }

    public static SubLObject tp_valid_adjpP(final SubLObject words) {
        final SubLObject first_word = words.first();
        final SubLObject last_word = last(words, UNPROVIDED).first();
        return makeBoolean(((NIL != rkf_adjective_stringP(first_word)) || ((NIL == rkf_determiner_stringP(first_word)) && (NIL == rkf_conjunction_stringP(first_word)))) && (NIL != rkf_adjective_stringP(last_word)));
    }

    public static final SubLObject tp_valid_adjp_predP_alt(SubLObject words) {
        {
            SubLObject last_word = last(words, UNPROVIDED).first();
            SubLObject words_of_last_word = lexicon_cache.words_of_string(last_word, UNPROVIDED, UNPROVIDED, UNPROVIDED);
            SubLObject gerund_freeP = NIL;
            if (NIL == com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.tp_valid_adjpP(words)) {
                return NIL;
            }
            if (NIL == gerund_freeP) {
                {
                    SubLObject csome_list_var = words_of_last_word;
                    SubLObject word = NIL;
                    for (word = csome_list_var.first(); !((NIL != gerund_freeP) || (NIL == csome_list_var)); csome_list_var = csome_list_var.rest() , word = csome_list_var.first()) {
                        if (NIL == subl_promotions.memberP($$gerund, lexicon_accessors.preds_of_stringXword(last_word, word, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED)) {
                            gerund_freeP = T;
                        }
                    }
                }
            }
            if (NIL != gerund_freeP) {
                return T;
            } else {
                return NIL;
            }
        }
    }

    public static SubLObject tp_valid_adjp_predP(final SubLObject words) {
        final SubLObject last_word = last(words, UNPROVIDED).first();
        final SubLObject words_of_last_word = words_of_string(last_word, UNPROVIDED, UNPROVIDED, UNPROVIDED);
        SubLObject gerund_freeP = NIL;
        if (NIL == rtp_constituent_weeders.tp_valid_adjpP(words)) {
            return NIL;
        }
        if (NIL == gerund_freeP) {
            SubLObject csome_list_var = words_of_last_word;
            SubLObject word = NIL;
            word = csome_list_var.first();
            while ((NIL == gerund_freeP) && (NIL != csome_list_var)) {
                if (NIL == memberP(rtp_constituent_weeders.$$gerund, preds_of_stringXword(last_word, word, UNPROVIDED, UNPROVIDED, UNPROVIDED), UNPROVIDED, UNPROVIDED)) {
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

    /**
     *
     *
     * @param TEMPLATE-CATEGORY
     * 		spec of #$TemplateParsingCategory
     * @return list; string that are the names of open-minds categories
    that map to the TEMPLATE-CATEGORY
     */
    @LispMethod(comment = "@param TEMPLATE-CATEGORY\r\n\t\tspec of #$TemplateParsingCategory\r\n@return list; string that are the names of open-minds categories\r\nthat map to the TEMPLATE-CATEGORY")
    public static final SubLObject template_to_om_categories_alt(SubLObject template_category) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            {
                SubLObject categories = assoc(template_category, $template_to_om_category_mappings$.getDynamicValue(thread), EQ, UNPROVIDED).rest();
                return NIL != categories ? ((SubLObject) (categories)) : $list_alt87;
            }
        }
    }

    /**
     *
     *
     * @param TEMPLATE-CATEGORY
     * 		spec of #$TemplateParsingCategory
     * @return list; string that are the names of open-minds categories
    that map to the TEMPLATE-CATEGORY
     */
    @LispMethod(comment = "@param TEMPLATE-CATEGORY\r\n\t\tspec of #$TemplateParsingCategory\r\n@return list; string that are the names of open-minds categories\r\nthat map to the TEMPLATE-CATEGORY")
    public static SubLObject template_to_om_categories(final SubLObject template_category) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        final SubLObject categories = assoc(template_category, rtp_constituent_weeders.$template_to_om_category_mappings$.getDynamicValue(thread), EQ, UNPROVIDED).rest();
        return NIL != categories ? categories : rtp_constituent_weeders.$list92;
    }

    public static final SubLObject rtp_ranking_filename_alt(SubLObject filename) {
        {
            final SubLThread thread = SubLProcess.currentSubLThread();
            return file_utilities.relative_filename($rtp_ranking_data_dir$.getDynamicValue(thread), filename, $$$fht);
        }
    }

    public static SubLObject rtp_ranking_filename(final SubLObject filename) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        return relative_filename(rtp_constituent_weeders.$rtp_ranking_data_dir$.getDynamicValue(thread), filename, rtp_constituent_weeders.$$$fht);
    }

    public static final SubLObject rtp_parse_ranking_init_alt() {
        {
            SubLObject problem = NIL;
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                        try {
                            if (NIL == file_hash_table.file_hash_table_p($cat_prior$.getGlobalValue())) {
                                $cat_prior$.setGlobalValue(file_hash_table.open_file_hash_table(com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.rtp_ranking_filename($cat_prior_file$.getGlobalValue()), symbol_function(EQUAL), UNPROVIDED));
                            }
                            if (NIL == file_hash_table.file_hash_table_p($tag1_cond_cat$.getGlobalValue())) {
                                $tag1_cond_cat$.setGlobalValue(file_hash_table.open_file_hash_table(com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.rtp_ranking_filename($tag1_cond_cat_file$.getGlobalValue()), symbol_function(EQUAL), UNPROVIDED));
                            }
                            if (NIL == file_hash_table.file_hash_table_p($tag2_cond_cat_tag1$.getGlobalValue())) {
                                $tag2_cond_cat_tag1$.setGlobalValue(file_hash_table.open_file_hash_table(com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.rtp_ranking_filename($tag2_cond_cat_tag1_file$.getGlobalValue()), symbol_function(EQUAL), UNPROVIDED));
                            }
                            if (NIL == file_hash_table.file_hash_table_p($tag3_cond_cat_tag12$.getGlobalValue())) {
                                $tag3_cond_cat_tag12$.setGlobalValue(file_hash_table.open_file_hash_table(com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.rtp_ranking_filename($tag3_cond_cat_tag12_file$.getGlobalValue()), symbol_function(EQUAL), UNPROVIDED));
                            }
                            if (NIL == file_hash_table.file_hash_table_p($tag_cond_tag$.getGlobalValue())) {
                                $tag_cond_tag$.setGlobalValue(file_hash_table.open_file_hash_table(com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.rtp_ranking_filename($tag_cond_tag_file$.getGlobalValue()), symbol_function(EQUAL), UNPROVIDED));
                            }
                            if (NIL == file_hash_table.file_hash_table_p($cat_cond_last_tag$.getGlobalValue())) {
                                $cat_cond_last_tag$.setGlobalValue(file_hash_table.open_file_hash_table(com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.rtp_ranking_filename($cat_cond_last_tag_file$.getGlobalValue()), symbol_function(EQUAL), UNPROVIDED));
                            }
                            if (NIL == pos_tagger.tagger_p($tagger$.getGlobalValue())) {
                                $tagger$.setGlobalValue(pos_tagger.new_tagger(UNPROVIDED));
                            }
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                problem = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            }
            if (NIL != problem) {
                Errors.warn($str_alt90$_a__parse_ranking_will_not_be_ava, problem);
                com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.rtp_parse_ranking_finalize();
            }
            return makeBoolean(NIL == problem);
        }
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
                    if (NIL == file_hash_table_p(rtp_constituent_weeders.$cat_prior$.getGlobalValue())) {
                        rtp_constituent_weeders.$cat_prior$.setGlobalValue(open_file_hash_table(rtp_constituent_weeders.rtp_ranking_filename(rtp_constituent_weeders.$cat_prior_file$.getGlobalValue()), symbol_function(EQUAL), UNPROVIDED));
                    }
                    if (NIL == file_hash_table_p(rtp_constituent_weeders.$tag1_cond_cat$.getGlobalValue())) {
                        rtp_constituent_weeders.$tag1_cond_cat$.setGlobalValue(open_file_hash_table(rtp_constituent_weeders.rtp_ranking_filename(rtp_constituent_weeders.$tag1_cond_cat_file$.getGlobalValue()), symbol_function(EQUAL), UNPROVIDED));
                    }
                    if (NIL == file_hash_table_p(rtp_constituent_weeders.$tag2_cond_cat_tag1$.getGlobalValue())) {
                        rtp_constituent_weeders.$tag2_cond_cat_tag1$.setGlobalValue(open_file_hash_table(rtp_constituent_weeders.rtp_ranking_filename(rtp_constituent_weeders.$tag2_cond_cat_tag1_file$.getGlobalValue()), symbol_function(EQUAL), UNPROVIDED));
                    }
                    if (NIL == file_hash_table_p(rtp_constituent_weeders.$tag3_cond_cat_tag12$.getGlobalValue())) {
                        rtp_constituent_weeders.$tag3_cond_cat_tag12$.setGlobalValue(open_file_hash_table(rtp_constituent_weeders.rtp_ranking_filename(rtp_constituent_weeders.$tag3_cond_cat_tag12_file$.getGlobalValue()), symbol_function(EQUAL), UNPROVIDED));
                    }
                    if (NIL == file_hash_table_p(rtp_constituent_weeders.$tag_cond_tag$.getGlobalValue())) {
                        rtp_constituent_weeders.$tag_cond_tag$.setGlobalValue(open_file_hash_table(rtp_constituent_weeders.rtp_ranking_filename(rtp_constituent_weeders.$tag_cond_tag_file$.getGlobalValue()), symbol_function(EQUAL), UNPROVIDED));
                    }
                    if (NIL == file_hash_table_p(rtp_constituent_weeders.$cat_cond_last_tag$.getGlobalValue())) {
                        rtp_constituent_weeders.$cat_cond_last_tag$.setGlobalValue(open_file_hash_table(rtp_constituent_weeders.rtp_ranking_filename(rtp_constituent_weeders.$cat_cond_last_tag_file$.getGlobalValue()), symbol_function(EQUAL), UNPROVIDED));
                    }
                    if (NIL == tagger_p(rtp_constituent_weeders.$tagger$.getGlobalValue())) {
                        rtp_constituent_weeders.$tagger$.setGlobalValue(new_tagger(UNPROVIDED));
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
            Errors.warn(rtp_constituent_weeders.$str95$_a__parse_ranking_will_not_be_ava, problem);
            rtp_constituent_weeders.rtp_parse_ranking_finalize();
        }
        return makeBoolean(NIL == problem);
    }

    public static final SubLObject rtp_parse_ranking_finalize_alt() {
        {
            SubLObject problem = NIL;
            SubLObject cdolist_list_var = $list_alt92;
            SubLObject fht_symbol = NIL;
            for (fht_symbol = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , fht_symbol = cdolist_list_var.first()) {
                {
                    SubLObject fht = symbol_value(fht_symbol);
                    if (NIL != file_hash_table.file_hash_table_p(fht)) {
                        try {
                            {
                                SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                                try {
                                    bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                                    try {
                                        file_hash_table.finalize_file_hash_table(fht);
                                    } catch (Throwable catch_var) {
                                        Errors.handleThrowable(catch_var, NIL);
                                    }
                                } finally {
                                    rebind(Errors.$error_handler$, _prev_bind_0);
                                }
                            }
                        } catch (Throwable ccatch_env_var) {
                            problem = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
                        }
                        if (NIL != problem) {
                            Errors.warn($str_alt91$Couldn_t_finalize_file_hashtable_, fht);
                        }
                    }
                }
                set(fht_symbol, NIL);
            }
            if (NIL != pos_tagger.tagger_p($tagger$.getGlobalValue())) {
                {
                    SubLObject ignore_errors_tag = NIL;
                    try {
                        {
                            SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                            try {
                                bind(Errors.$error_handler$, symbol_function(IGNORE_ERRORS_HANDLER));
                                try {
                                    pos_tagger.finalize_tagger($tagger$.getGlobalValue());
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
            $tagger$.setGlobalValue(NIL);
            return makeBoolean(NIL == problem);
        }
    }

    public static SubLObject rtp_parse_ranking_finalize() {
        final SubLThread thread = SubLProcess.currentSubLThread();
        SubLObject problem = NIL;
        SubLObject cdolist_list_var = rtp_constituent_weeders.$list97;
        SubLObject fht_symbol = NIL;
        fht_symbol = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            final SubLObject fht = symbol_value(fht_symbol);
            if (NIL != file_hash_table_p(fht)) {
                try {
                    thread.throwStack.push($catch_error_message_target$.getGlobalValue());
                    final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                    try {
                        Errors.$error_handler$.bind(CATCH_ERROR_MESSAGE_HANDLER, thread);
                        try {
                            finalize_file_hash_table(fht);
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
                    Errors.warn(rtp_constituent_weeders.$str96$Couldn_t_finalize_file_hashtable_, fht);
                }
            }
            set(fht_symbol, NIL);
            cdolist_list_var = cdolist_list_var.rest();
            fht_symbol = cdolist_list_var.first();
        } 
        if (NIL != tagger_p(rtp_constituent_weeders.$tagger$.getGlobalValue())) {
            SubLObject ignore_errors_tag = NIL;
            try {
                thread.throwStack.push(rtp_constituent_weeders.$IGNORE_ERRORS_TARGET);
                final SubLObject _prev_bind_0 = Errors.$error_handler$.currentBinding(thread);
                try {
                    Errors.$error_handler$.bind(symbol_function(rtp_constituent_weeders.IGNORE_ERRORS_HANDLER), thread);
                    try {
                        finalize_tagger(rtp_constituent_weeders.$tagger$.getGlobalValue());
                    } catch (final Throwable catch_var) {
                        Errors.handleThrowable(catch_var, NIL);
                    }
                } finally {
                    Errors.$error_handler$.rebind(_prev_bind_0, thread);
                }
            } catch (final Throwable ccatch_env_var) {
                ignore_errors_tag = Errors.handleThrowable(ccatch_env_var, rtp_constituent_weeders.$IGNORE_ERRORS_TARGET);
            } finally {
                thread.throwStack.pop();
            }
        }
        rtp_constituent_weeders.$tagger$.setGlobalValue(NIL);
        return makeBoolean(NIL == problem);
    }

    public static final SubLObject rtp_parse_ranking_initializedP_alt() {
        return makeBoolean(((((((NIL != com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.tagger_initializedP()) && (NIL != file_hash_table.file_hash_table_p($cat_prior$.getGlobalValue()))) && (NIL != file_hash_table.file_hash_table_p($tag1_cond_cat$.getGlobalValue()))) && (NIL != file_hash_table.file_hash_table_p($tag2_cond_cat_tag1$.getGlobalValue()))) && (NIL != file_hash_table.file_hash_table_p($tag3_cond_cat_tag12$.getGlobalValue()))) && (NIL != file_hash_table.file_hash_table_p($tag_cond_tag$.getGlobalValue()))) && (NIL != file_hash_table.file_hash_table_p($cat_cond_last_tag$.getGlobalValue())));
    }

    public static SubLObject rtp_parse_ranking_initializedP() {
        return makeBoolean(((((((NIL != rtp_constituent_weeders.tagger_initializedP()) && (NIL != file_hash_table_p(rtp_constituent_weeders.$cat_prior$.getGlobalValue()))) && (NIL != file_hash_table_p(rtp_constituent_weeders.$tag1_cond_cat$.getGlobalValue()))) && (NIL != file_hash_table_p(rtp_constituent_weeders.$tag2_cond_cat_tag1$.getGlobalValue()))) && (NIL != file_hash_table_p(rtp_constituent_weeders.$tag3_cond_cat_tag12$.getGlobalValue()))) && (NIL != file_hash_table_p(rtp_constituent_weeders.$tag_cond_tag$.getGlobalValue()))) && (NIL != file_hash_table_p(rtp_constituent_weeders.$cat_cond_last_tag$.getGlobalValue())));
    }

    public static final SubLObject tagger_initializedP_alt() {
        return pos_tagger.tagger_p($tagger$.getGlobalValue());
    }

    public static SubLObject tagger_initializedP() {
        return tagger_p(rtp_constituent_weeders.$tagger$.getGlobalValue());
    }

    /**
     * Builds a new phrase as specified in ROP from the words in SENTENCE
     */
    @LispMethod(comment = "Builds a new phrase as specified in ROP from the words in SENTENCE")
    public static final SubLObject rop2phrase_alt(SubLObject sentence, SubLObject rop) {
        {
            SubLObject words = NIL;
            SubLObject cdolist_list_var = parsing_utilities.result_of_parsing_span_wXo_thelist(rop);
            SubLObject index = NIL;
            for (index = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , index = cdolist_list_var.first()) {
                words = cons(document.sentence_get(sentence, index), words);
            }
            return document.new_phrase(list($CONSTITUENTS, apply(symbol_function(VECTOR), nreverse(words)), $CATEGORY, parsing_utilities.result_of_parsing_category(rop)));
        }
    }

    @LispMethod(comment = "Builds a new phrase as specified in ROP from the words in SENTENCE")
    public static SubLObject rop2phrase(final SubLObject sentence, final SubLObject rop) {
        SubLObject words = NIL;
        SubLObject cdolist_list_var = result_of_parsing_span_wXo_thelist(rop);
        SubLObject index = NIL;
        index = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            words = cons(sentence_get(sentence, index), words);
            cdolist_list_var = cdolist_list_var.rest();
            index = cdolist_list_var.first();
        } 
        return new_phrase(list($CONSTITUENTS, apply(symbol_function(VECTOR), nreverse(words)), $CATEGORY, result_of_parsing_category(rop)));
    }

    /**
     * Builds a new sentence, or syntax tree, combining the part-of-speech information
     * in SENTENCE, which has a flat structure, with the category information in CYCL,
     * which represents another flat structure, resulting in a parse tree of depth two
     * with both category and part-of-speech information
     */
    @LispMethod(comment = "Builds a new sentence, or syntax tree, combining the part-of-speech information\r\nin SENTENCE, which has a flat structure, with the category information in CYCL,\r\nwhich represents another flat structure, resulting in a parse tree of depth two\r\nwith both category and part-of-speech information\nBuilds a new sentence, or syntax tree, combining the part-of-speech information\nin SENTENCE, which has a flat structure, with the category information in CYCL,\nwhich represents another flat structure, resulting in a parse tree of depth two\nwith both category and part-of-speech information")
    public static final SubLObject parse2sentence_alt(SubLObject sentence, SubLObject cycl) {
        {
            SubLObject constituents = NIL;
            SubLObject index = ZERO_INTEGER;
            SubLObject words = NIL;
            SubLObject rops = NIL;
            if (cycl.isList()) {
                {
                    SubLObject cdolist_list_var = cycl;
                    SubLObject element = NIL;
                    for (element = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , element = cdolist_list_var.first()) {
                        if (NIL != parsing_utilities.result_of_parsing_formulaP(element)) {
                            rops = cons(element, rops);
                        }
                    }
                }
            }
            {
                SubLObject cdolist_list_var = Sort.sort(rops, symbol_function($sym97$_), symbol_function(RESULT_OF_PARSING_START));
                SubLObject element = NIL;
                for (element = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , element = cdolist_list_var.first()) {
                    words = NIL;
                    if (parsing_utilities.result_of_parsing_start(element) != index) {
                        {
                            SubLObject cdotimes_end_var = subtract(parsing_utilities.result_of_parsing_start(element), index);
                            SubLObject i = NIL;
                            for (i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                                words = cons(document.sentence_get(sentence, add(i, index)), words);
                            }
                        }
                        constituents = cons(document.new_phrase(list($CATEGORY, $X, $CONSTITUENTS, apply(symbol_function(VECTOR), nreverse(words)))), constituents);
                    }
                    constituents = cons(com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.rop2phrase(sentence, element), constituents);
                    index = number_utilities.f_1X(parsing_utilities.result_of_parsing_end(element));
                }
            }
            return document.new_phrase(list($CONSTITUENTS, apply(symbol_function(VECTOR), nreverse(constituents)), $CATEGORY, $S));
        }
    }

    @LispMethod(comment = "Builds a new sentence, or syntax tree, combining the part-of-speech information\r\nin SENTENCE, which has a flat structure, with the category information in CYCL,\r\nwhich represents another flat structure, resulting in a parse tree of depth two\r\nwith both category and part-of-speech information\nBuilds a new sentence, or syntax tree, combining the part-of-speech information\nin SENTENCE, which has a flat structure, with the category information in CYCL,\nwhich represents another flat structure, resulting in a parse tree of depth two\nwith both category and part-of-speech information")
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
                if (NIL != result_of_parsing_formulaP(element)) {
                    rops = cons(element, rops);
                }
                cdolist_list_var = cdolist_list_var.rest();
                element = cdolist_list_var.first();
            } 
        }
        SubLObject cdolist_list_var = Sort.sort(rops, symbol_function(rtp_constituent_weeders.$sym102$_), symbol_function(rtp_constituent_weeders.RESULT_OF_PARSING_START));
        SubLObject element = NIL;
        element = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            words = NIL;
            if (!result_of_parsing_start(element).eql(index)) {
                SubLObject cdotimes_end_var;
                SubLObject i;
                for (cdotimes_end_var = subtract(result_of_parsing_start(element), index), i = NIL, i = ZERO_INTEGER; i.numL(cdotimes_end_var); i = add(i, ONE_INTEGER)) {
                    words = cons(sentence_get(sentence, add(i, index)), words);
                }
                constituents = cons(new_phrase(list($CATEGORY, $X, $CONSTITUENTS, apply(symbol_function(VECTOR), nreverse(words)))), constituents);
            }
            constituents = cons(rtp_constituent_weeders.rop2phrase(sentence, element), constituents);
            index = f_1X(result_of_parsing_end(element));
            cdolist_list_var = cdolist_list_var.rest();
            element = cdolist_list_var.first();
        } 
        return new_phrase(list($CONSTITUENTS, apply(symbol_function(VECTOR), nreverse(constituents)), $CATEGORY, $S));
    }

    /**
     * Returns P(CATEGORY), the prior probability of CATEGORY
     */
    @LispMethod(comment = "Returns P(CATEGORY), the prior probability of CATEGORY")
    public static final SubLObject cat_prior_alt(SubLObject template) {
        {
            SubLObject p = ZERO_INTEGER;
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.template_to_om_categories(template);
            SubLObject cat = NIL;
            for (cat = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cat = cdolist_list_var.first()) {
                p = add(p, exp(file_hash_table.get_file_hash_table(cat, $cat_prior$.getGlobalValue(), pos_tagger.$low_probability$.getGlobalValue())));
            }
            return log(p, UNPROVIDED);
        }
    }

    @LispMethod(comment = "Returns P(CATEGORY), the prior probability of CATEGORY")
    public static SubLObject cat_prior(final SubLObject template) {
        SubLObject p = ZERO_INTEGER;
        SubLObject cdolist_list_var = rtp_constituent_weeders.template_to_om_categories(template);
        SubLObject cat = NIL;
        cat = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            p = add(p, exp(get_file_hash_table(cat, rtp_constituent_weeders.$cat_prior$.getGlobalValue(), $low_probability$.getGlobalValue())));
            cdolist_list_var = cdolist_list_var.rest();
            cat = cdolist_list_var.first();
        } 
        return log(p, UNPROVIDED);
    }

    /**
     * Returns P(TAG1|CATEGORY), the probability of CATEGORY starting with TAG1
     */
    @LispMethod(comment = "Returns P(TAG1|CATEGORY), the probability of CATEGORY starting with TAG1")
    public static final SubLObject tag1_cond_cat_alt(SubLObject tag1, SubLObject template) {
        {
            SubLObject p = ZERO_INTEGER;
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.template_to_om_categories(template);
            SubLObject cat = NIL;
            for (cat = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cat = cdolist_list_var.first()) {
                p = add(p, exp(file_hash_table.get_file_hash_table(list(tag1, cat), $tag1_cond_cat$.getGlobalValue(), pos_tagger.$low_probability$.getGlobalValue())));
            }
            return log(p, UNPROVIDED);
        }
    }

    @LispMethod(comment = "Returns P(TAG1|CATEGORY), the probability of CATEGORY starting with TAG1")
    public static SubLObject tag1_cond_cat(final SubLObject tag1, final SubLObject template) {
        SubLObject p = ZERO_INTEGER;
        SubLObject cdolist_list_var = rtp_constituent_weeders.template_to_om_categories(template);
        SubLObject cat = NIL;
        cat = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            p = add(p, exp(get_file_hash_table(list(tag1, cat), rtp_constituent_weeders.$tag1_cond_cat$.getGlobalValue(), $low_probability$.getGlobalValue())));
            cdolist_list_var = cdolist_list_var.rest();
            cat = cdolist_list_var.first();
        } 
        return log(p, UNPROVIDED);
    }

    /**
     * Returns P(TAG2|CATEGORY, TAG1), the probability of the second tag being TAG2,
     * given CATEGORY and its first tag TAG1
     */
    @LispMethod(comment = "Returns P(TAG2|CATEGORY, TAG1), the probability of the second tag being TAG2,\r\ngiven CATEGORY and its first tag TAG1\nReturns P(TAG2|CATEGORY, TAG1), the probability of the second tag being TAG2,\ngiven CATEGORY and its first tag TAG1")
    public static final SubLObject tag2_cond_cat_tag1_alt(SubLObject tag2, SubLObject template, SubLObject tag1) {
        {
            SubLObject p = ZERO_INTEGER;
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.template_to_om_categories(template);
            SubLObject cat = NIL;
            for (cat = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cat = cdolist_list_var.first()) {
                p = add(p, exp(file_hash_table.get_file_hash_table(list(tag2, cat, tag1), $tag2_cond_cat_tag1$.getGlobalValue(), pos_tagger.$low_probability$.getGlobalValue())));
            }
            return log(p, UNPROVIDED);
        }
    }

    @LispMethod(comment = "Returns P(TAG2|CATEGORY, TAG1), the probability of the second tag being TAG2,\r\ngiven CATEGORY and its first tag TAG1\nReturns P(TAG2|CATEGORY, TAG1), the probability of the second tag being TAG2,\ngiven CATEGORY and its first tag TAG1")
    public static SubLObject tag2_cond_cat_tag1(final SubLObject tag2, final SubLObject template, final SubLObject tag1) {
        SubLObject p = ZERO_INTEGER;
        SubLObject cdolist_list_var = rtp_constituent_weeders.template_to_om_categories(template);
        SubLObject cat = NIL;
        cat = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            p = add(p, exp(get_file_hash_table(list(tag2, cat, tag1), rtp_constituent_weeders.$tag2_cond_cat_tag1$.getGlobalValue(), $low_probability$.getGlobalValue())));
            cdolist_list_var = cdolist_list_var.rest();
            cat = cdolist_list_var.first();
        } 
        return log(p, UNPROVIDED);
    }

    /**
     * Returns P(TAG3|CATEGORY, TAG1, TAG2), the probability of the third tag being
     * TAG3, given CATEGORY and its first two tags TAG1 and TAG2
     */
    @LispMethod(comment = "Returns P(TAG3|CATEGORY, TAG1, TAG2), the probability of the third tag being\r\nTAG3, given CATEGORY and its first two tags TAG1 and TAG2\nReturns P(TAG3|CATEGORY, TAG1, TAG2), the probability of the third tag being\nTAG3, given CATEGORY and its first two tags TAG1 and TAG2")
    public static final SubLObject tag3_cond_cat_tag12_alt(SubLObject tag3, SubLObject template, SubLObject tag1, SubLObject tag2) {
        {
            SubLObject p = ZERO_INTEGER;
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.template_to_om_categories(template);
            SubLObject cat = NIL;
            for (cat = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cat = cdolist_list_var.first()) {
                p = add(p, exp(file_hash_table.get_file_hash_table(list(tag3, cat, tag1, tag2), $tag3_cond_cat_tag12$.getGlobalValue(), pos_tagger.$low_probability$.getGlobalValue())));
            }
            return log(p, UNPROVIDED);
        }
    }

    @LispMethod(comment = "Returns P(TAG3|CATEGORY, TAG1, TAG2), the probability of the third tag being\r\nTAG3, given CATEGORY and its first two tags TAG1 and TAG2\nReturns P(TAG3|CATEGORY, TAG1, TAG2), the probability of the third tag being\nTAG3, given CATEGORY and its first two tags TAG1 and TAG2")
    public static SubLObject tag3_cond_cat_tag12(final SubLObject tag3, final SubLObject template, final SubLObject tag1, final SubLObject tag2) {
        SubLObject p = ZERO_INTEGER;
        SubLObject cdolist_list_var = rtp_constituent_weeders.template_to_om_categories(template);
        SubLObject cat = NIL;
        cat = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            p = add(p, exp(get_file_hash_table(list(tag3, cat, tag1, tag2), rtp_constituent_weeders.$tag3_cond_cat_tag12$.getGlobalValue(), $low_probability$.getGlobalValue())));
            cdolist_list_var = cdolist_list_var.rest();
            cat = cdolist_list_var.first();
        } 
        return log(p, UNPROVIDED);
    }

    /**
     * Returns P(CATEGORY|TAGX), the probability of CATEGORY given the last tag TAGX
     */
    @LispMethod(comment = "Returns P(CATEGORY|TAGX), the probability of CATEGORY given the last tag TAGX")
    public static final SubLObject cat_cond_last_tag_alt(SubLObject template, SubLObject tagx) {
        {
            SubLObject p = ZERO_INTEGER;
            SubLObject cdolist_list_var = com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.template_to_om_categories(template);
            SubLObject cat = NIL;
            for (cat = cdolist_list_var.first(); NIL != cdolist_list_var; cdolist_list_var = cdolist_list_var.rest() , cat = cdolist_list_var.first()) {
                p = add(p, exp(file_hash_table.get_file_hash_table(list(cat, tagx), $cat_cond_last_tag$.getGlobalValue(), pos_tagger.$low_probability$.getGlobalValue())));
            }
            return log(p, UNPROVIDED);
        }
    }

    @LispMethod(comment = "Returns P(CATEGORY|TAGX), the probability of CATEGORY given the last tag TAGX")
    public static SubLObject cat_cond_last_tag(final SubLObject template, final SubLObject tagx) {
        SubLObject p = ZERO_INTEGER;
        SubLObject cdolist_list_var = rtp_constituent_weeders.template_to_om_categories(template);
        SubLObject cat = NIL;
        cat = cdolist_list_var.first();
        while (NIL != cdolist_list_var) {
            p = add(p, exp(get_file_hash_table(list(cat, tagx), rtp_constituent_weeders.$cat_cond_last_tag$.getGlobalValue(), $low_probability$.getGlobalValue())));
            cdolist_list_var = cdolist_list_var.rest();
            cat = cdolist_list_var.first();
        } 
        return log(p, UNPROVIDED);
    }

    /**
     * Returns P(TAG2|TAG1), the probability of TAG2 occurring after TAG1
     */
    @LispMethod(comment = "Returns P(TAG2|TAG1), the probability of TAG2 occurring after TAG1")
    public static final SubLObject tag_cond_tag_alt(SubLObject tag2, SubLObject tag1) {
        return file_hash_table.get_file_hash_table(list(tag2, tag1), $tag_cond_tag$.getGlobalValue(), pos_tagger.$low_probability$.getGlobalValue());
    }

    @LispMethod(comment = "Returns P(TAG2|TAG1), the probability of TAG2 occurring after TAG1")
    public static SubLObject tag_cond_tag(final SubLObject tag2, final SubLObject tag1) {
        return get_file_hash_table(list(tag2, tag1), rtp_constituent_weeders.$tag_cond_tag$.getGlobalValue(), $low_probability$.getGlobalValue());
    }

    /**
     * Returns the syntactic probability of SIGN
     *
     * @param SIGN
     * 		phrase-p; the phrase whose probability is to be returned
     * @return float; the natural logarithm of P(cat(SIGN)|tags(SIGN)),
    the probability of SIGN having its assigned category given the
    part-of-speech tags of its words
     */
    @LispMethod(comment = "Returns the syntactic probability of SIGN\r\n\r\n@param SIGN\r\n\t\tphrase-p; the phrase whose probability is to be returned\r\n@return float; the natural logarithm of P(cat(SIGN)|tags(SIGN)),\r\nthe probability of SIGN having its assigned category given the\r\npart-of-speech tags of its words")
    public static final SubLObject rtp_phrase_probability_alt(SubLObject phrase) {
        SubLTrampolineFile.checkType(phrase, PHRASE_P);
        if (document.phrase_category(phrase) == $X) {
            return ZERO_INTEGER;
        }
        {
            SubLObject category = document.phrase_category(phrase);
            SubLObject tags = Mapping.mapcar(symbol_function(WORD_CATEGORY), document.sign_yield(phrase));
            SubLObject probability = NIL;
            probability = add(new SubLObject[]{ com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.cat_prior(category), com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.tag1_cond_cat(tags.first(), category), NIL != second(tags) ? ((SubLObject) (com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.tag2_cond_cat_tag1(second(tags), category, tags.first()))) : ZERO_INTEGER, NIL != third(tags) ? ((SubLObject) (com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.tag3_cond_cat_tag12(third(tags), category, tags.first(), second(tags)))) : ZERO_INTEGER, com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.cat_cond_last_tag(category, last(tags, UNPROVIDED).first()) });
            {
                SubLObject remaining = NIL;
                SubLObject tag1 = NIL;
                SubLObject tag2 = NIL;
                for (remaining = nthcdr(TWO_INTEGER, tags), tag1 = remaining.first(), tag2 = second(remaining); NIL != tag2; remaining = remaining.rest() , tag1 = remaining.first() , tag2 = second(remaining)) {
                    probability = add(probability, com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.tag_cond_tag(tag2, tag1));
                }
            }
            return probability;
        }
    }

    @LispMethod(comment = "Returns the syntactic probability of SIGN\r\n\r\n@param SIGN\r\n\t\tphrase-p; the phrase whose probability is to be returned\r\n@return float; the natural logarithm of P(cat(SIGN)|tags(SIGN)),\r\nthe probability of SIGN having its assigned category given the\r\npart-of-speech tags of its words")
    public static SubLObject rtp_phrase_probability(final SubLObject phrase) {
        assert NIL != phrase_p(phrase) : "! document.phrase_p(phrase) " + ("document.phrase_p(phrase) " + "CommonSymbols.NIL != document.phrase_p(phrase) ") + phrase;
        if (phrase_category(phrase) == $X) {
            return ZERO_INTEGER;
        }
        final SubLObject category = phrase_category(phrase);
        final SubLObject tags = Mapping.mapcar(symbol_function(rtp_constituent_weeders.WORD_CATEGORY), sign_yield(phrase));
        SubLObject probability = NIL;
        probability = add(new SubLObject[]{ rtp_constituent_weeders.cat_prior(category), rtp_constituent_weeders.tag1_cond_cat(tags.first(), category), NIL != second(tags) ? rtp_constituent_weeders.tag2_cond_cat_tag1(second(tags), category, tags.first()) : ZERO_INTEGER, NIL != third(tags) ? rtp_constituent_weeders.tag3_cond_cat_tag12(third(tags), category, tags.first(), second(tags)) : ZERO_INTEGER, rtp_constituent_weeders.cat_cond_last_tag(category, last(tags, UNPROVIDED).first()) });
        SubLObject remaining = NIL;
        SubLObject tag1 = NIL;
        SubLObject tag2 = NIL;
        remaining = nthcdr(TWO_INTEGER, tags);
        tag1 = remaining.first();
        for (tag2 = second(remaining); NIL != tag2; tag2 = second(remaining)) {
            probability = add(probability, rtp_constituent_weeders.tag_cond_tag(tag2, tag1));
            remaining = remaining.rest();
            tag1 = remaining.first();
        }
        return probability;
    }

    /**
     * Returns the syntactic probability of SENTENCE
     *
     * @param SENTENCE
     * 		sentence-p; the part-of-speech tagged sentence whose
     * 		probability is to be returned
     * @return float; the natural logarithm of the probability of SENTENCE
     */
    @LispMethod(comment = "Returns the syntactic probability of SENTENCE\r\n\r\n@param SENTENCE\r\n\t\tsentence-p; the part-of-speech tagged sentence whose\r\n\t\tprobability is to be returned\r\n@return float; the natural logarithm of the probability of SENTENCE")
    public static final SubLObject rtp_sentence_probability_alt(SubLObject sentence) {
        SubLTrampolineFile.checkType(sentence, SENTENCE_P);
        {
            SubLObject probability = pos_tagger.$certainty$.getGlobalValue();
            SubLObject vector_var = document.sign_constituents(sentence);
            SubLObject backwardP_var = NIL;
            SubLObject length = length(vector_var);
            SubLObject v_iteration = NIL;
            for (v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
                {
                    SubLObject element_num = (NIL != backwardP_var) ? ((SubLObject) (subtract(length, v_iteration, ONE_INTEGER))) : v_iteration;
                    SubLObject daughter = aref(vector_var, element_num);
                    probability = add(probability, com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.rtp_phrase_probability(daughter));
                }
            }
            return probability;
        }
    }

    @LispMethod(comment = "Returns the syntactic probability of SENTENCE\r\n\r\n@param SENTENCE\r\n\t\tsentence-p; the part-of-speech tagged sentence whose\r\n\t\tprobability is to be returned\r\n@return float; the natural logarithm of the probability of SENTENCE")
    public static SubLObject rtp_sentence_probability(final SubLObject sentence) {
        assert NIL != sentence_p(sentence) : "! document.sentence_p(sentence) " + ("document.sentence_p(sentence) " + "CommonSymbols.NIL != document.sentence_p(sentence) ") + sentence;
        SubLObject probability = $certainty$.getGlobalValue();
        final SubLObject vector_var = sign_constituents(sentence);
        final SubLObject backwardP_var = NIL;
        SubLObject length;
        SubLObject v_iteration;
        SubLObject element_num;
        SubLObject daughter;
        for (length = length(vector_var), v_iteration = NIL, v_iteration = ZERO_INTEGER; v_iteration.numL(length); v_iteration = add(v_iteration, ONE_INTEGER)) {
            element_num = (NIL != backwardP_var) ? subtract(length, v_iteration, ONE_INTEGER) : v_iteration;
            daughter = aref(vector_var, element_num);
            probability = add(probability, rtp_constituent_weeders.rtp_phrase_probability(daughter));
        }
        return probability;
    }

    /**
     * Creates a new sentence from STRING and PARSE
     *
     * @param STRING
     * 		stringp; the string that was parsed
     * @param PARSES
     * 		listp; the output of the template parser
     */
    @LispMethod(comment = "Creates a new sentence from STRING and PARSE\r\n\r\n@param STRING\r\n\t\tstringp; the string that was parsed\r\n@param PARSES\r\n\t\tlistp; the output of the template parser")
    public static final SubLObject rtp_rank_parses_alt(SubLObject string, SubLObject parses) {
        if (NIL == com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.rtp_parse_ranking_initializedP()) {
            com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.rtp_parse_ranking_init();
        }
        if (NIL == com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.rtp_parse_ranking_initializedP()) {
            return parses;
        }
        {
            SubLObject problem = NIL;
            SubLObject new_parses = copy_tree(parses);
            try {
                {
                    SubLObject _prev_bind_0 = currentBinding(Errors.$error_handler$);
                    try {
                        bind(Errors.$error_handler$, CATCH_ERROR_MESSAGE_HANDLER);
                        try {
                            {
                                SubLObject sections = rtp_iterators.new_itp_result_iterator(new_parses, UNPROVIDED, UNPROVIDED);
                                SubLObject words = pos_tagger.tagger_tag_sentence($tagger$.getGlobalValue(), document.new_sentence(string, UNPROVIDED));
                                SubLObject sentence = NIL;
                                SubLObject parse = NIL;
                                while (NIL == rtp_iterators.itp_result_iterator_doneP(sections)) {
                                    {
                                        SubLObject cycls = rtp_iterators.itp_result_iterator_curr(sections);
                                        while (NIL == rtp_iterators.itp_section_iterator_doneP(cycls)) {
                                            parse = rtp_iterators.itp_section_iterator_curr(cycls);
                                            sentence = com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.parse2sentence(words, parse);
                                            rtp_iterators.itp_section_iterator_set_curr(cycls, com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.new_itp_semantics(parse, $UNAVAILABLE, $UNAVAILABLE, $UNAVAILABLE, com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.rtp_sentence_probability(sentence)));
                                            rtp_iterators.itp_section_iterator_next(cycls);
                                        } 
                                        rtp_iterators.itp_result_iterator_next(sections);
                                    }
                                } 
                            }
                        } catch (Throwable catch_var) {
                            Errors.handleThrowable(catch_var, NIL);
                        }
                    } finally {
                        rebind(Errors.$error_handler$, _prev_bind_0);
                    }
                }
            } catch (Throwable ccatch_env_var) {
                problem = Errors.handleThrowable(ccatch_env_var, $catch_error_message_target$.getGlobalValue());
            }
            if (NIL != problem) {
                com.cyc.cycjava.cycl.rtp.rtp_constituent_weeders.rtp_parse_ranking_finalize();
                Errors.warn($str_alt103$RTP_RANK_PARSES_triggered_an_erro);
                return parses;
            }
            return new_parses;
        }
    }

    @LispMethod(comment = "Creates a new sentence from STRING and PARSE\r\n\r\n@param STRING\r\n\t\tstringp; the string that was parsed\r\n@param PARSES\r\n\t\tlistp; the output of the template parser")
    public static SubLObject rtp_rank_parses(final SubLObject string, final SubLObject parses) {
        final SubLThread thread = SubLProcess.currentSubLThread();
        if (NIL == rtp_constituent_weeders.rtp_parse_ranking_initializedP()) {
            rtp_constituent_weeders.rtp_parse_ranking_init();
        }
        if (NIL == rtp_constituent_weeders.rtp_parse_ranking_initializedP()) {
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
                    final SubLObject words = tagger_tag_sentence(rtp_constituent_weeders.$tagger$.getGlobalValue(), new_sentence(string, UNPROVIDED));
                    SubLObject sentence = NIL;
                    SubLObject parse = NIL;
                    while (NIL == rtp_iterators.itp_result_iterator_doneP(sections)) {
                        final SubLObject cycls = rtp_iterators.itp_result_iterator_curr(sections);
                        while (NIL == rtp_iterators.itp_section_iterator_doneP(cycls)) {
                            parse = rtp_iterators.itp_section_iterator_curr(cycls);
                            sentence = rtp_constituent_weeders.parse2sentence(words, parse);
                            rtp_iterators.itp_section_iterator_set_curr(cycls, rtp_constituent_weeders.new_itp_semantics(parse, $UNAVAILABLE, $UNAVAILABLE, $UNAVAILABLE, rtp_constituent_weeders.rtp_sentence_probability(sentence)));
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
            rtp_constituent_weeders.rtp_parse_ranking_finalize();
            Errors.warn(rtp_constituent_weeders.$str108$RTP_RANK_PARSES_triggered_an_erro);
            return parses;
        }
        return new_parses;
    }

    public static SubLObject declare_rtp_constituent_weeders_file() {
        declareFunction("itp_semantics_print_function_trampoline", "ITP-SEMANTICS-PRINT-FUNCTION-TRAMPOLINE", 2, 0, false);
        declareFunction("itp_semantics_p", "ITP-SEMANTICS-P", 1, 0, false);
        new rtp_constituent_weeders.$itp_semantics_p$UnaryFunction();
        declareFunction("itp_semantics_cycl", "ITP-SEMANTICS-CYCL", 1, 0, false);
        declareFunction("itp_semantics_category", "ITP-SEMANTICS-CATEGORY", 1, 0, false);
        declareFunction("itp_semantics_force", "ITP-SEMANTICS-FORCE", 1, 0, false);
        declareFunction("itp_semantics_supports", "ITP-SEMANTICS-SUPPORTS", 1, 0, false);
        declareFunction("itp_semantics_confidence", "ITP-SEMANTICS-CONFIDENCE", 1, 0, false);
        declareFunction("_csetf_itp_semantics_cycl", "_CSETF-ITP-SEMANTICS-CYCL", 2, 0, false);
        declareFunction("_csetf_itp_semantics_category", "_CSETF-ITP-SEMANTICS-CATEGORY", 2, 0, false);
        declareFunction("_csetf_itp_semantics_force", "_CSETF-ITP-SEMANTICS-FORCE", 2, 0, false);
        declareFunction("_csetf_itp_semantics_supports", "_CSETF-ITP-SEMANTICS-SUPPORTS", 2, 0, false);
        declareFunction("_csetf_itp_semantics_confidence", "_CSETF-ITP-SEMANTICS-CONFIDENCE", 2, 0, false);
        declareFunction("make_itp_semantics", "MAKE-ITP-SEMANTICS", 0, 1, false);
        declareFunction("visit_defstruct_itp_semantics", "VISIT-DEFSTRUCT-ITP-SEMANTICS", 2, 0, false);
        declareFunction("visit_defstruct_object_itp_semantics_method", "VISIT-DEFSTRUCT-OBJECT-ITP-SEMANTICS-METHOD", 2, 0, false);
        declareFunction("print_itp_semantics", "PRINT-ITP-SEMANTICS", 3, 0, false);
        declareFunction("new_itp_semantics", "NEW-ITP-SEMANTICS", 1, 4, false);
        declareFunction("new_itp_semantics_conf_1", "NEW-ITP-SEMANTICS-CONF-1", 1, 0, false);
        declareFunction("new_itp_semantics_conf_half", "NEW-ITP-SEMANTICS-CONF-HALF", 1, 0, false);
        declareFunction("rtp_parse_exp_ranked", "RTP-PARSE-EXP-RANKED", 3, 0, false);
        declareFunction("rtp_vbar_templates", "RTP-VBAR-TEMPLATES", 0, 0, false);
        declareFunction("clear_rtp_vbar_templates_cached", "CLEAR-RTP-VBAR-TEMPLATES-CACHED", 0, 0, false);
        declareFunction("remove_rtp_vbar_templates_cached", "REMOVE-RTP-VBAR-TEMPLATES-CACHED", 0, 0, false);
        declareFunction("rtp_vbar_templates_cached_internal", "RTP-VBAR-TEMPLATES-CACHED-INTERNAL", 0, 0, false);
        declareFunction("rtp_vbar_templates_cached", "RTP-VBAR-TEMPLATES-CACHED", 0, 0, false);
        declareFunction("tp_possible_constitP_old", "TP-POSSIBLE-CONSTIT?-OLD", 2, 1, false);
        declareFunction("tp_possible_constitP", "TP-POSSIBLE-CONSTIT?", 2, 1, false);
        declareFunction("tp_valid_nbar", "TP-VALID-NBAR", 2, 1, false);
        declareFunction("tp_valid_nbar_wordsP", "TP-VALID-NBAR-WORDS?", 1, 1, false);
        declareFunction("valid_tp_nbar_end_stringP", "VALID-TP-NBAR-END-STRING?", 2, 0, false);
        declareFunction("valid_tp_nbar_start_stringP", "VALID-TP-NBAR-START-STRING?", 1, 0, false);
        declareFunction("tp_valid_np", "TP-VALID-NP", 2, 1, false);
        declareFunction("tp_valid_np_wordsP", "TP-VALID-NP-WORDS?", 1, 1, false);
        declareFunction("tp_valid_single_word_npP", "TP-VALID-SINGLE-WORD-NP?", 2, 0, false);
        declareFunction("valid_tp_np_end_stringP", "VALID-TP-NP-END-STRING?", 2, 0, false);
        declareFunction("valid_tp_np_start_stringP", "VALID-TP-NP-START-STRING?", 1, 0, false);
        declareFunction("tp_valid_sP", "TP-VALID-S?", 1, 0, false);
        declareFunction("tp_valid_vbar", "TP-VALID-VBAR", 2, 0, false);
        declareFunction("valid_tp_vbar_start_stringP", "VALID-TP-VBAR-START-STRING?", 1, 0, false);
        declareFunction("valid_tp_vbar_end_stringP", "VALID-TP-VBAR-END-STRING?", 1, 0, false);
        declareFunction("tp_valid_vp", "TP-VALID-VP", 2, 0, false);
        declareFunction("valid_tp_vp_start_stringP", "VALID-TP-VP-START-STRING?", 1, 0, false);
        declareFunction("valid_tp_vp_end_stringP", "VALID-TP-VP-END-STRING?", 1, 0, false);
        declareFunction("tp_unambiguous_verbP", "TP-UNAMBIGUOUS-VERB?", 1, 1, false);
        declareFunction("tp_valid_number_p", "TP-VALID-NUMBER-P", 1, 0, false);
        declareFunction("number_prefix_p", "NUMBER-PREFIX-P", 1, 0, false);
        declareFunction("possible_tp_vp_start_stringP", "POSSIBLE-TP-VP-START-STRING?", 1, 0, false);
        declareFunction("rtp_contraction_elementP", "RTP-CONTRACTION-ELEMENT?", 1, 0, false);
        declareFunction("get_contraction_elements", "GET-CONTRACTION-ELEMENTS", 0, 0, false);
        declareFunction("possible_tp_vp_end_stringP", "POSSIBLE-TP-VP-END-STRING?", 1, 0, false);
        declareFunction("possible_tp_np_start_stringP", "POSSIBLE-TP-NP-START-STRING?", 1, 0, false);
        declareFunction("possible_tp_nbar_start_stringP", "POSSIBLE-TP-NBAR-START-STRING?", 1, 0, false);
        declareFunction("possible_tp_pp_start_stringP", "POSSIBLE-TP-PP-START-STRING?", 1, 0, false);
        declareFunction("possible_tp_pp_end_stringP", "POSSIBLE-TP-PP-END-STRING?", 1, 1, false);
        declareFunction("possible_tp_np_end_stringP", "POSSIBLE-TP-NP-END-STRING?", 1, 1, false);
        declareFunction("impossible_tp_phrase_end_stringP", "IMPOSSIBLE-TP-PHRASE-END-STRING?", 1, 0, false);
        declareFunction("confusing_np_start_stringP", "CONFUSING-NP-START-STRING?", 1, 0, false);
        declareFunction("confusing_nbar_start_stringP", "CONFUSING-NBAR-START-STRING?", 1, 0, false);
        declareFunction("tp_valid_quantity_p", "TP-VALID-QUANTITY-P", 1, 0, false);
        declareFunction("clear_tp_valid_quantity_p", "CLEAR-TP-VALID-QUANTITY-P", 0, 0, false);
        declareFunction("reset_tp_valid_quantity_p", "RESET-TP-VALID-QUANTITY-P", 0, 0, false);
        declareFunction("get_quantity_strings", "GET-QUANTITY-STRINGS", 0, 0, false);
        declareFunction("prepositional_categoryP", "PREPOSITIONAL-CATEGORY?", 1, 0, false);
        declareFunction("tp_valid_pp", "TP-VALID-PP", 3, 0, false);
        declareFunction("valid_tp_pp_end_stringP", "VALID-TP-PP-END-STRING?", 2, 0, false);
        declareFunction("valid_tp_pp_start_stringP", "VALID-TP-PP-START-STRING?", 1, 0, false);
        declareFunction("tp_valid_adjpP", "TP-VALID-ADJP?", 1, 0, false);
        declareFunction("tp_valid_adjp_predP", "TP-VALID-ADJP-PRED?", 1, 0, false);
        declareFunction("template_to_om_categories", "TEMPLATE-TO-OM-CATEGORIES", 1, 0, false);
        declareFunction("rtp_ranking_filename", "RTP-RANKING-FILENAME", 1, 0, false);
        declareFunction("rtp_parse_ranking_init", "RTP-PARSE-RANKING-INIT", 0, 0, false);
        declareFunction("rtp_parse_ranking_finalize", "RTP-PARSE-RANKING-FINALIZE", 0, 0, false);
        declareFunction("rtp_parse_ranking_initializedP", "RTP-PARSE-RANKING-INITIALIZED?", 0, 0, false);
        declareFunction("tagger_initializedP", "TAGGER-INITIALIZED?", 0, 0, false);
        declareFunction("rop2phrase", "ROP2PHRASE", 2, 0, false);
        declareFunction("parse2sentence", "PARSE2SENTENCE", 2, 0, false);
        declareFunction("cat_prior", "CAT-PRIOR", 1, 0, false);
        declareFunction("tag1_cond_cat", "TAG1-COND-CAT", 2, 0, false);
        declareFunction("tag2_cond_cat_tag1", "TAG2-COND-CAT-TAG1", 3, 0, false);
        declareFunction("tag3_cond_cat_tag12", "TAG3-COND-CAT-TAG12", 4, 0, false);
        declareFunction("cat_cond_last_tag", "CAT-COND-LAST-TAG", 2, 0, false);
        declareFunction("tag_cond_tag", "TAG-COND-TAG", 2, 0, false);
        declareFunction("rtp_phrase_probability", "RTP-PHRASE-PROBABILITY", 1, 0, false);
        declareFunction("rtp_sentence_probability", "RTP-SENTENCE-PROBABILITY", 1, 0, false);
        declareFunction("rtp_rank_parses", "RTP-RANK-PARSES", 2, 0, false);
        return NIL;
    }

    public static final SubLObject init_rtp_constituent_weeders_file_alt() {
        deflexical("*INVALID-TP-VP-END-PUNCTUATION*", $list_alt0);
        deflexical("*VALID-TP-NON-STARTING-SENTENTIAL-MARKERS*", $list_alt1);
        defparameter("*RTP-RANKING-DATA-DIR*", $str_alt2$data_rkf_parse_ranking_);
        deflexical("*CAT-PRIOR-FILE*", $str_alt3$cat_prior);
        deflexical("*TAG1-COND-CAT-FILE*", $str_alt4$tag1_cond_cat);
        deflexical("*TAG2-COND-CAT-TAG1-FILE*", $str_alt5$tag2_cond_cat_tag1);
        deflexical("*TAG3-COND-CAT-TAG12-FILE*", $str_alt6$tag3_cond_cat_tag12);
        deflexical("*TAG-COND-TAG-FILE*", $str_alt7$tag_cond_tag);
        deflexical("*CAT-COND-LAST-TAG-FILE*", $str_alt8$cat_cond_last_tag);
        deflexical("*CAT-PRIOR*", NIL != boundp($cat_prior$) ? ((SubLObject) ($cat_prior$.getGlobalValue())) : NIL);
        deflexical("*TAG1-COND-CAT*", NIL != boundp($sym10$_TAG1_COND_CAT_) ? ((SubLObject) ($tag1_cond_cat$.getGlobalValue())) : NIL);
        deflexical("*TAG2-COND-CAT-TAG1*", NIL != boundp($sym11$_TAG2_COND_CAT_TAG1_) ? ((SubLObject) ($tag2_cond_cat_tag1$.getGlobalValue())) : NIL);
        deflexical("*TAG3-COND-CAT-TAG12*", NIL != boundp($sym12$_TAG3_COND_CAT_TAG12_) ? ((SubLObject) ($tag3_cond_cat_tag12$.getGlobalValue())) : NIL);
        deflexical("*TAG-COND-TAG*", NIL != boundp($tag_cond_tag$) ? ((SubLObject) ($tag_cond_tag$.getGlobalValue())) : NIL);
        deflexical("*CAT-COND-LAST-TAG*", NIL != boundp($cat_cond_last_tag$) ? ((SubLObject) ($cat_cond_last_tag$.getGlobalValue())) : NIL);
        deflexical("*TAGGER*", NIL != boundp($tagger$) ? ((SubLObject) ($tagger$.getGlobalValue())) : NIL);
        defconstant("*DTP-ITP-SEMANTICS*", ITP_SEMANTICS);
        deflexical("*RTP-VBAR-TEMPLATES-CACHED-CACHING-STATE*", NIL);
        defparameter("*USE-NEW-TP-POSSIBLE-CONSTIT?*", T);
        defparameter("*RTP-CONTRACTION-ELEMENTS*", NIL);
        deflexical("*CONFUSING-NP-START-STRINGS*", $list_alt75);
        deflexical("*CONFUSING-NBAR-START-STRINGS*", NIL);
        deflexical("*QUANTITY-STRINGS*", NIL != boundp($quantity_strings$) ? ((SubLObject) ($quantity_strings$.getGlobalValue())) : NIL);
        deflexical("*PREPOSITIONAL-CATEGORY-TEMPLATES*", $list_alt84);
        defparameter("*TEMPLATE-TO-OM-CATEGORY-MAPPINGS*", $list_alt86);
        return NIL;
    }

    public static SubLObject init_rtp_constituent_weeders_file() {
        if (SubLFiles.USE_V1) {
            deflexical("*INVALID-TP-VP-END-PUNCTUATION*", rtp_constituent_weeders.$list0);
            deflexical("*VALID-TP-NON-STARTING-SENTENTIAL-MARKERS*", rtp_constituent_weeders.$list1);
            defparameter("*RTP-RANKING-DATA-DIR*", rtp_constituent_weeders.$str2$data_rkf_parse_ranking_);
            deflexical("*CAT-PRIOR-FILE*", rtp_constituent_weeders.$str3$cat_prior);
            deflexical("*TAG1-COND-CAT-FILE*", rtp_constituent_weeders.$str4$tag1_cond_cat);
            deflexical("*TAG2-COND-CAT-TAG1-FILE*", rtp_constituent_weeders.$str5$tag2_cond_cat_tag1);
            deflexical("*TAG3-COND-CAT-TAG12-FILE*", rtp_constituent_weeders.$str6$tag3_cond_cat_tag12);
            deflexical("*TAG-COND-TAG-FILE*", rtp_constituent_weeders.$str7$tag_cond_tag);
            deflexical("*CAT-COND-LAST-TAG-FILE*", rtp_constituent_weeders.$str8$cat_cond_last_tag);
            deflexical("*CAT-PRIOR*", SubLTrampolineFile.maybeDefault(rtp_constituent_weeders.$cat_prior$, rtp_constituent_weeders.$cat_prior$, NIL));
            deflexical("*TAG1-COND-CAT*", SubLTrampolineFile.maybeDefault(rtp_constituent_weeders.$sym10$_TAG1_COND_CAT_, rtp_constituent_weeders.$tag1_cond_cat$, NIL));
            deflexical("*TAG2-COND-CAT-TAG1*", SubLTrampolineFile.maybeDefault(rtp_constituent_weeders.$sym11$_TAG2_COND_CAT_TAG1_, rtp_constituent_weeders.$tag2_cond_cat_tag1$, NIL));
            deflexical("*TAG3-COND-CAT-TAG12*", SubLTrampolineFile.maybeDefault(rtp_constituent_weeders.$sym12$_TAG3_COND_CAT_TAG12_, rtp_constituent_weeders.$tag3_cond_cat_tag12$, NIL));
            deflexical("*TAG-COND-TAG*", SubLTrampolineFile.maybeDefault(rtp_constituent_weeders.$tag_cond_tag$, rtp_constituent_weeders.$tag_cond_tag$, NIL));
            deflexical("*CAT-COND-LAST-TAG*", SubLTrampolineFile.maybeDefault(rtp_constituent_weeders.$cat_cond_last_tag$, rtp_constituent_weeders.$cat_cond_last_tag$, NIL));
            deflexical("*TAGGER*", SubLTrampolineFile.maybeDefault(rtp_constituent_weeders.$tagger$, rtp_constituent_weeders.$tagger$, NIL));
            defconstant("*DTP-ITP-SEMANTICS*", rtp_constituent_weeders.ITP_SEMANTICS);
            deflexical("*RTP-VBAR-TEMPLATES-CACHED-CACHING-STATE*", NIL);
            defparameter("*USE-NEW-TP-POSSIBLE-CONSTIT?*", T);
            defparameter("*RTP-CONTRACTION-ELEMENTS*", NIL);
            deflexical("*CONFUSING-NP-START-STRINGS*", rtp_constituent_weeders.$list80);
            deflexical("*CONFUSING-NBAR-START-STRINGS*", NIL);
            deflexical("*QUANTITY-STRINGS*", SubLTrampolineFile.maybeDefault(rtp_constituent_weeders.$quantity_strings$, rtp_constituent_weeders.$quantity_strings$, NIL));
            deflexical("*PREPOSITIONAL-CATEGORY-TEMPLATES*", rtp_constituent_weeders.$list89);
            defparameter("*TEMPLATE-TO-OM-CATEGORY-MAPPINGS*", rtp_constituent_weeders.$list91);
        }
        if (SubLFiles.USE_V2) {
            deflexical("*CAT-PRIOR*", NIL != boundp($cat_prior$) ? ((SubLObject) ($cat_prior$.getGlobalValue())) : NIL);
            deflexical("*TAG1-COND-CAT*", NIL != boundp($sym10$_TAG1_COND_CAT_) ? ((SubLObject) ($tag1_cond_cat$.getGlobalValue())) : NIL);
            deflexical("*TAG2-COND-CAT-TAG1*", NIL != boundp($sym11$_TAG2_COND_CAT_TAG1_) ? ((SubLObject) ($tag2_cond_cat_tag1$.getGlobalValue())) : NIL);
            deflexical("*TAG3-COND-CAT-TAG12*", NIL != boundp($sym12$_TAG3_COND_CAT_TAG12_) ? ((SubLObject) ($tag3_cond_cat_tag12$.getGlobalValue())) : NIL);
            deflexical("*TAG-COND-TAG*", NIL != boundp($tag_cond_tag$) ? ((SubLObject) ($tag_cond_tag$.getGlobalValue())) : NIL);
            deflexical("*CAT-COND-LAST-TAG*", NIL != boundp($cat_cond_last_tag$) ? ((SubLObject) ($cat_cond_last_tag$.getGlobalValue())) : NIL);
            deflexical("*TAGGER*", NIL != boundp($tagger$) ? ((SubLObject) ($tagger$.getGlobalValue())) : NIL);
            deflexical("*CONFUSING-NP-START-STRINGS*", $list_alt75);
            deflexical("*QUANTITY-STRINGS*", NIL != boundp($quantity_strings$) ? ((SubLObject) ($quantity_strings$.getGlobalValue())) : NIL);
            deflexical("*PREPOSITIONAL-CATEGORY-TEMPLATES*", $list_alt84);
            defparameter("*TEMPLATE-TO-OM-CATEGORY-MAPPINGS*", $list_alt86);
        }
        return NIL;
    }

    public static SubLObject init_rtp_constituent_weeders_file_Previous() {
        deflexical("*INVALID-TP-VP-END-PUNCTUATION*", rtp_constituent_weeders.$list0);
        deflexical("*VALID-TP-NON-STARTING-SENTENTIAL-MARKERS*", rtp_constituent_weeders.$list1);
        defparameter("*RTP-RANKING-DATA-DIR*", rtp_constituent_weeders.$str2$data_rkf_parse_ranking_);
        deflexical("*CAT-PRIOR-FILE*", rtp_constituent_weeders.$str3$cat_prior);
        deflexical("*TAG1-COND-CAT-FILE*", rtp_constituent_weeders.$str4$tag1_cond_cat);
        deflexical("*TAG2-COND-CAT-TAG1-FILE*", rtp_constituent_weeders.$str5$tag2_cond_cat_tag1);
        deflexical("*TAG3-COND-CAT-TAG12-FILE*", rtp_constituent_weeders.$str6$tag3_cond_cat_tag12);
        deflexical("*TAG-COND-TAG-FILE*", rtp_constituent_weeders.$str7$tag_cond_tag);
        deflexical("*CAT-COND-LAST-TAG-FILE*", rtp_constituent_weeders.$str8$cat_cond_last_tag);
        deflexical("*CAT-PRIOR*", SubLTrampolineFile.maybeDefault(rtp_constituent_weeders.$cat_prior$, rtp_constituent_weeders.$cat_prior$, NIL));
        deflexical("*TAG1-COND-CAT*", SubLTrampolineFile.maybeDefault(rtp_constituent_weeders.$sym10$_TAG1_COND_CAT_, rtp_constituent_weeders.$tag1_cond_cat$, NIL));
        deflexical("*TAG2-COND-CAT-TAG1*", SubLTrampolineFile.maybeDefault(rtp_constituent_weeders.$sym11$_TAG2_COND_CAT_TAG1_, rtp_constituent_weeders.$tag2_cond_cat_tag1$, NIL));
        deflexical("*TAG3-COND-CAT-TAG12*", SubLTrampolineFile.maybeDefault(rtp_constituent_weeders.$sym12$_TAG3_COND_CAT_TAG12_, rtp_constituent_weeders.$tag3_cond_cat_tag12$, NIL));
        deflexical("*TAG-COND-TAG*", SubLTrampolineFile.maybeDefault(rtp_constituent_weeders.$tag_cond_tag$, rtp_constituent_weeders.$tag_cond_tag$, NIL));
        deflexical("*CAT-COND-LAST-TAG*", SubLTrampolineFile.maybeDefault(rtp_constituent_weeders.$cat_cond_last_tag$, rtp_constituent_weeders.$cat_cond_last_tag$, NIL));
        deflexical("*TAGGER*", SubLTrampolineFile.maybeDefault(rtp_constituent_weeders.$tagger$, rtp_constituent_weeders.$tagger$, NIL));
        defconstant("*DTP-ITP-SEMANTICS*", rtp_constituent_weeders.ITP_SEMANTICS);
        deflexical("*RTP-VBAR-TEMPLATES-CACHED-CACHING-STATE*", NIL);
        defparameter("*USE-NEW-TP-POSSIBLE-CONSTIT?*", T);
        defparameter("*RTP-CONTRACTION-ELEMENTS*", NIL);
        deflexical("*CONFUSING-NP-START-STRINGS*", rtp_constituent_weeders.$list80);
        deflexical("*CONFUSING-NBAR-START-STRINGS*", NIL);
        deflexical("*QUANTITY-STRINGS*", SubLTrampolineFile.maybeDefault(rtp_constituent_weeders.$quantity_strings$, rtp_constituent_weeders.$quantity_strings$, NIL));
        deflexical("*PREPOSITIONAL-CATEGORY-TEMPLATES*", rtp_constituent_weeders.$list89);
        defparameter("*TEMPLATE-TO-OM-CATEGORY-MAPPINGS*", rtp_constituent_weeders.$list91);
        return NIL;
    }

    // Internal Constants
    @LispMethod(comment = "Internal Constants")
    static private final SubLList $list_alt0 = list(makeString("("));

    public static SubLObject setup_rtp_constituent_weeders_file() {
        declare_defglobal(rtp_constituent_weeders.$cat_prior$);
        declare_defglobal(rtp_constituent_weeders.$sym10$_TAG1_COND_CAT_);
        declare_defglobal(rtp_constituent_weeders.$sym11$_TAG2_COND_CAT_TAG1_);
        declare_defglobal(rtp_constituent_weeders.$sym12$_TAG3_COND_CAT_TAG12_);
        declare_defglobal(rtp_constituent_weeders.$tag_cond_tag$);
        declare_defglobal(rtp_constituent_weeders.$cat_cond_last_tag$);
        declare_defglobal(rtp_constituent_weeders.$tagger$);
        register_method($print_object_method_table$.getGlobalValue(), rtp_constituent_weeders.$dtp_itp_semantics$.getGlobalValue(), symbol_function(rtp_constituent_weeders.ITP_SEMANTICS_PRINT_FUNCTION_TRAMPOLINE));
        SubLSpecialOperatorDeclarations.proclaim(rtp_constituent_weeders.$list24);
        def_csetf(rtp_constituent_weeders.ITP_SEMANTICS_CYCL, rtp_constituent_weeders._CSETF_ITP_SEMANTICS_CYCL);
        def_csetf(rtp_constituent_weeders.ITP_SEMANTICS_CATEGORY, rtp_constituent_weeders._CSETF_ITP_SEMANTICS_CATEGORY);
        def_csetf(rtp_constituent_weeders.ITP_SEMANTICS_FORCE, rtp_constituent_weeders._CSETF_ITP_SEMANTICS_FORCE);
        def_csetf(rtp_constituent_weeders.ITP_SEMANTICS_SUPPORTS, rtp_constituent_weeders._CSETF_ITP_SEMANTICS_SUPPORTS);
        def_csetf(rtp_constituent_weeders.ITP_SEMANTICS_CONFIDENCE, rtp_constituent_weeders._CSETF_ITP_SEMANTICS_CONFIDENCE);
        identity(rtp_constituent_weeders.ITP_SEMANTICS);
        register_method(visitation.$visit_defstruct_object_method_table$.getGlobalValue(), rtp_constituent_weeders.$dtp_itp_semantics$.getGlobalValue(), symbol_function(rtp_constituent_weeders.VISIT_DEFSTRUCT_OBJECT_ITP_SEMANTICS_METHOD));
        note_globally_cached_function(rtp_constituent_weeders.RTP_VBAR_TEMPLATES_CACHED);
        declare_defglobal(rtp_constituent_weeders.$quantity_strings$);
        return NIL;
    }

    static private final SubLList $list_alt1 = list(makeString("%"));

    static private final SubLString $str_alt2$data_rkf_parse_ranking_ = makeString("data/rkf/parse-ranking/");

    static private final SubLString $str_alt3$cat_prior = makeString("cat_prior");

    static private final SubLString $str_alt4$tag1_cond_cat = makeString("tag1_cond_cat");

    static private final SubLString $str_alt5$tag2_cond_cat_tag1 = makeString("tag2_cond_cat_tag1");

    static private final SubLString $str_alt6$tag3_cond_cat_tag12 = makeString("tag3_cond_cat_tag12");

    static private final SubLString $str_alt7$tag_cond_tag = makeString("tag_cond_tag");

    static private final SubLString $str_alt8$cat_cond_last_tag = makeString("cat_cond_last_tag");

    @Override
    public void declareFunctions() {
        rtp_constituent_weeders.declare_rtp_constituent_weeders_file();
    }

    @Override
    public void initializeVariables() {
        rtp_constituent_weeders.init_rtp_constituent_weeders_file();
    }

    @Override
    public void runTopLevelForms() {
        rtp_constituent_weeders.setup_rtp_constituent_weeders_file();
    }

    static private final SubLList $list_alt18 = list(makeSymbol("CYCL"), makeSymbol("CATEGORY"), makeSymbol("FORCE"), makeSymbol("SUPPORTS"), makeSymbol("CONFIDENCE"));

    static {
    }

    static private final SubLList $list_alt19 = list($CYCL, makeKeyword("CATEGORY"), makeKeyword("FORCE"), makeKeyword("SUPPORTS"), makeKeyword("CONFIDENCE"));

    static private final SubLList $list_alt20 = list(makeSymbol("ITP-SEMANTICS-CYCL"), makeSymbol("ITP-SEMANTICS-CATEGORY"), makeSymbol("ITP-SEMANTICS-FORCE"), makeSymbol("ITP-SEMANTICS-SUPPORTS"), makeSymbol("ITP-SEMANTICS-CONFIDENCE"));

    static private final SubLList $list_alt21 = list(makeSymbol("_CSETF-ITP-SEMANTICS-CYCL"), makeSymbol("_CSETF-ITP-SEMANTICS-CATEGORY"), makeSymbol("_CSETF-ITP-SEMANTICS-FORCE"), makeSymbol("_CSETF-ITP-SEMANTICS-SUPPORTS"), makeSymbol("_CSETF-ITP-SEMANTICS-CONFIDENCE"));

    static private final SubLString $str_alt39$Invalid_slot__S_for_construction_ = makeString("Invalid slot ~S for construction function");

    static private final SubLString $str_alt40$__ITP_SEMANTICS__CYCL_ = makeString("#<ITP-SEMANTICS: CYCL:");

    static private final SubLString $str_alt41$_ = makeString(" ");

    static private final SubLString $str_alt43$CAT_ = makeString("CAT:");

    static private final SubLString $str_alt44$FORCE_ = makeString("FORCE:");

    public static final class $itp_semantics_p$UnaryFunction extends UnaryFunction {
        public $itp_semantics_p$UnaryFunction() {
            super(extractFunctionNamed("ITP-SEMANTICS-P"));
        }

        @Override
        public SubLObject processItem(final SubLObject arg1) {
            return rtp_constituent_weeders.itp_semantics_p(arg1);
        }
    }

    static private final SubLString $str_alt45$SUPPORTS_ = makeString("SUPPORTS:");

    static private final SubLString $str_alt46$CONFIDENCE_ = makeString("CONFIDENCE:");

    static private final SubLString $str_alt47$_ = makeString(">");

    public static final SubLSymbol $kw54$_MEMOIZED_ITEM_NOT_FOUND_ = makeKeyword("&MEMOIZED-ITEM-NOT-FOUND&");

    static private final SubLList $list_alt63 = list(reader_make_constant_shell("QuestionTemplate"), reader_make_constant_shell("STemplate"));

    static private final SubLList $list_alt64 = list(reader_make_constant_shell("NumberTemplate"), reader_make_constant_shell("RatioTemplate"));

    static private final SubLString $str_alt66$_S__S__S___new___S_old___S__ = makeString("~S ~S ~S~% new: ~S old: ~S~%");

    static private final SubLString $str_alt68$_ = makeString("'");

    static private final SubLSymbol $sym70$VERBAL_CATEGORY_ = makeSymbol("VERBAL-CATEGORY?");

    static private final SubLList $list_alt71 = list(makeString("-"), makeString("+"), makeString("~"));

    static private final SubLSymbol $sym72$STRING_ = makeSymbol("STRING=");

    static private final SubLList $list_alt75 = list(makeString("as"), makeString("between"));

    static private final SubLList $list_alt81 = list(reader_make_constant_shell("isa"), makeKeyword("X"), reader_make_constant_shell("IntervalOnNumberLine"));

    static private final SubLList $list_alt84 = list(reader_make_constant_shell("PPByTemplate"), reader_make_constant_shell("PPTemplate"), reader_make_constant_shell("PPForTemplate"), reader_make_constant_shell("PPTemporalTemplate"), reader_make_constant_shell("PPTemporalDurationTemplate"));

    static private final SubLList $list_alt86 = list(new SubLObject[]{ list(reader_make_constant_shell("NPTemplate"), $WHNP, makeKeyword("NNP")), list(reader_make_constant_shell("PPTempate"), makeKeyword("PP"), $WHPP), list(reader_make_constant_shell("PPTempate"), makeKeyword("PP"), $WHPP), list(reader_make_constant_shell("STemplate"), makeKeyword("S")), list(reader_make_constant_shell("VPTemplate"), makeKeyword("VP")), list(reader_make_constant_shell("ProgressiveVPTemplate"), makeKeyword("VP")), list(reader_make_constant_shell("PerfectiveVPTemplate"), makeKeyword("VP")), list(reader_make_constant_shell("AdvPTemplate"), $ADVP, makeKeyword("WHADVP")), list(reader_make_constant_shell("AdjPTemplate"), $ADJP, makeKeyword("WHADJP")), list(reader_make_constant_shell("AdjPTemplate-Predicative"), $ADJP, makeKeyword("WHADJP")), list(reader_make_constant_shell("ImperativeTemplate"), makeKeyword("S")), list(reader_make_constant_shell("InfinitivalVBarTemplate"), makeKeyword("VP")), list(reader_make_constant_shell("InfinitivalVPTemplate"), makeKeyword("VP")), list(reader_make_constant_shell("PassiveVBarTemplate"), makeKeyword("VP")), list(reader_make_constant_shell("PastTenseTemplate"), makeKeyword("VP")), list(reader_make_constant_shell("PastTenseVBarTemplate"), makeKeyword("VP")), list(reader_make_constant_shell("PerfectiveVBarTemplate"), makeKeyword("VP")), list(reader_make_constant_shell("PerfectiveVPTemplate"), makeKeyword("VP")), list(reader_make_constant_shell("NPTemporalTemplate"), makeKeyword("NNP")), list(reader_make_constant_shell("PossessiveTemplate"), makeKeyword("NNP")), list(reader_make_constant_shell("PresentTenseVBarTemplate"), makeKeyword("VP")), list(reader_make_constant_shell("ProgressiveVBarTemplate"), makeKeyword("VP")), list(reader_make_constant_shell("ProgressiveVPTemplate"), makeKeyword("VP")), list(reader_make_constant_shell("PPByTemplate"), makeKeyword("PP"), $WHPP), list(reader_make_constant_shell("PPForTemplate"), makeKeyword("PP"), $WHPP), list(reader_make_constant_shell("PPTemporalDurationTemplate"), makeKeyword("PP"), $WHPP), list(reader_make_constant_shell("QuantityTemplate"), makeKeyword("NNP")), list(reader_make_constant_shell("QuestionTemplate"), makeKeyword("S")), list(reader_make_constant_shell("RTPTensedVBarTemplate"), makeKeyword("VP")), list(reader_make_constant_shell("RTPUntensedVBarTemplate"), makeKeyword("VP")), list(reader_make_constant_shell("PPTemporalTemplate"), makeKeyword("PP"), $WHPP), list(reader_make_constant_shell("TemporalTemplate"), makeKeyword("NNP"), makeKeyword("PP")), list(reader_make_constant_shell("VBarTemplate"), makeKeyword("VP")) });

    static private final SubLList $list_alt87 = list(makeString("X"));

    static private final SubLString $str_alt90$_a__parse_ranking_will_not_be_ava = makeString("~a, parse ranking will not be available");

    static private final SubLString $str_alt91$Couldn_t_finalize_file_hashtable_ = makeString("Couldn't finalize file hashtable ~a");

    static private final SubLList $list_alt92 = list(makeSymbol("*CAT-PRIOR*"), makeSymbol("*TAG1-COND-CAT*"), makeSymbol("*TAG2-COND-CAT-TAG1*"), makeSymbol("*TAG3-COND-CAT-TAG12*"), makeSymbol("*TAG-COND-TAG*"), makeSymbol("*CAT-COND-LAST-TAG*"));

    static private final SubLSymbol $sym97$_ = makeSymbol("<");

    static private final SubLString $str_alt103$RTP_RANK_PARSES_triggered_an_erro = makeString("RTP-RANK-PARSES triggered an error.");
}

/**
 * Total time: 397 ms
 */
